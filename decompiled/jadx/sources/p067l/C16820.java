package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
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
public class C16820 {

    /* JADX INFO: renamed from: ۗܳۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f82237;

    /* JADX INFO: renamed from: ᩷ */
    public static final C9091 f49790;

    /* JADX INFO: renamed from: ֫ */
    public boolean f49791;

    /* JADX INFO: renamed from: ۜ */
    public String f49792;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f49793;

    /* JADX INFO: renamed from: ܳ */
    public int f49794;

    /* JADX INFO: renamed from: ܽ */
    public String f49795;

    /* JADX INFO: renamed from: ܿ */
    public C14971 f49796;

    /* JADX INFO: renamed from: ᩳ */
    public HashMap f49797;

    /* JADX INFO: renamed from: ᩻ */
    public int f49798;

    public native C16820(byte[] bArr);

    /* JADX INFO: renamed from: ֫ */
    private native void m38134(StringBuilder sb, byte[] bArr, C14281 c14281, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public native void m38142(C14281 c14281, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public native void m38143(C14281 c14281, boolean z, AbstractC17043 abstractC17043);

    /* JADX INFO: renamed from: ۧ */
    public native void m38148(C14281 c14281, boolean z);

    /* JADX INFO: renamed from: ܳ */
    public native C24197 m38150();

    /* JADX INFO: renamed from: ֫ */
    public static boolean m38135(char c) {
        int i = 1372928484;
        int i2 = C0989.f81920;
        int i3 = C1964.f83032;
        int iM55680 = C0873.m55680("᩵ܺ") ^ i3;
        int i4 = ((iM55680 ^ i2) * (-28261)) ^ 992766526;
        int i5 = 88232246;
        while (true) {
            i = ((((i ^ i2) * 20777) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1967682464:
                case 408105632:
                    if (C1044.m56286() <= 0) {
                        iM55680 = C0946.m55979("ۚ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21971) ^ 456738950;
                        i5 = 1417083102;
                    } else {
                        iM55680 = C0946.m55979("ܶۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 31681) ^ 184129993;
                        i5 = 827801487;
                    }
                    break;
                case -1940160702:
                case 1027508866:
                    C1046.m56302();
                    if (C1194.f82045 == 0) {
                        iM55680 = C0873.m55680("۠ۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-11491)) ^ 110707417;
                        i5 = 1078461999;
                    } else {
                        iM55680 = (C0873.m55680("᩻ᩳ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55680 ^ i3) * 22457) ^ 974367483;
                        i5 = 1378666158;
                    }
                    break;
                case -1799845867:
                case 1974197045:
                    C0989.m56095();
                    C1012.m56134();
                    iM55680 = (C0873.m55680("᩻ᩳ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i4 = ((iM55680 ^ i3) * 22457) ^ 974367483;
                    i5 = 1378666158;
                    break;
                case -1773564007:
                case 2009434914:
                    if (c <= '9') {
                        iM55680 = (i2 - C0873.m55680("᩶ܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * 26981) ^ 1875822882;
                        i5 = 1497029338;
                    } else {
                        iM55680 = C0946.m55979("۠۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 16249) ^ 1255760156;
                        i5 = -46344312;
                    }
                    break;
                case -1741824906:
                case 1517662517:
                    C0863.m55643();
                    return false;
                case -1731850312:
                case 1698495407:
                    if (C1404.m56468()) {
                        iM55680 = (C0873.m55680("᩷᩺") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55680 ^ i2) * (-15345)) ^ 34738243;
                        i5 = -731333446;
                    } else {
                        iM55680 = C0946.m55979("ۚ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21971) ^ 456738950;
                        i5 = 1417083102;
                    }
                    break;
                case -1602437753:
                case -523421223:
                    if (C0989.m56095() <= 0) {
                        iM55680 = (C0873.m55680("᩻ᩳ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55680 ^ i3) * 22457) ^ 974367483;
                        i5 = 1378666158;
                    } else {
                        iM55680 = C0946.m55979("ۚ۬") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-25167)) ^ 35902554;
                        i5 = -1867252057;
                    }
                    break;
                case -1588266737:
                case 1276197311:
                    C0927.m55873();
                    if (!C0949.m56012()) {
                        iM55680 = C0946.m55979("᩻ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22739) ^ 1362046108;
                        i5 = -1178910111;
                    } else {
                        iM55680 = (C0873.m55680("᩻ᩳ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55680 ^ i3) * 22457) ^ 974367483;
                        i5 = 1378666158;
                    }
                    break;
                case -1457953201:
                case -590582501:
                    if (C1012.m56134() <= 0) {
                        iM55680 = (C0873.m55680("᩻ᩳ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55680 ^ i3) * 22457) ^ 974367483;
                        i5 = 1378666158;
                    } else {
                        iM55680 = (C0946.m55979("ۙۖ") ^ i3) * 5;
                        i4 = ((iM55680 ^ i2) * 30169) ^ (-643058167);
                        i5 = -471581668;
                    }
                    break;
                case -1263380357:
                case 28410668:
                    if (c >= 'a') {
                        iM55680 = (C0873.m55680("ۙ᩻") ^ i3) * (-55);
                        i4 = ((iM55680 ^ i2) * (-12075)) ^ (-1858855738);
                        i5 = -1892196556;
                    } else {
                        iM55680 = C0873.m55680("ۤۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 7445) ^ (-2059436023);
                        i5 = 1161371276;
                    }
                    break;
                case -1248473825:
                case 60164694:
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("۠ۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-11491)) ^ 110707417;
                        i5 = 1078461999;
                    } else {
                        iM55680 = (C0946.m55979("ۖۙ") + i2) * (-3);
                        i4 = ((iM55680 ^ i3) * (-5067)) ^ (-383752046);
                        i5 = 1168647261;
                    }
                    break;
                case -1171973686:
                case 2107629831:
                    if (c <= 'Z') {
                        iM55680 = (i2 - C0873.m55680("᩶ܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * 26981) ^ 1875822882;
                        i5 = 1497029338;
                    } else {
                        iM55680 = C0946.m55979("ۜܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 7581) ^ (-1589399327);
                        i5 = 877813269;
                    }
                    break;
                case -998964356:
                case -434180955:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0873.m55680("ۤۨ") + i2) * (-35);
                        i4 = ((iM55680 ^ i3) * (-7783)) ^ 802132120;
                        i5 = -721121024;
                    } else {
                        iM55680 = (i2 - C0946.m55979("᩹ۡ")) * (-113);
                        i4 = ((iM55680 ^ i3) * (-26149)) ^ (-483606465);
                        i5 = 301270119;
                    }
                    break;
                case -929001660:
                case 1143485889:
                    return false;
                case -879670922:
                case 1973858040:
                    if (C0877.f81843 >= 0) {
                        iM55680 = (C0873.m55680("᩻ᩳ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55680 ^ i3) * 22457) ^ 974367483;
                        i5 = 1378666158;
                    } else {
                        iM55680 = (C0946.m55979("ۨ᩸") + i3) * 83;
                        i4 = ((iM55680 ^ i2) * 16555) ^ (-271110124);
                        i5 = -661289010;
                    }
                    break;
                case -661490985:
                case 136237343:
                    if (c >= 'A') {
                        iM55680 = C0946.m55979("᩷ۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 7977) ^ (-1098026461);
                        i5 = 1325725719;
                    } else {
                        iM55680 = C0946.m55979("ۜܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 7581) ^ (-1589399327);
                        i5 = 877813269;
                    }
                    break;
                case -587215354:
                case -513103089:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0873.m55680("۠ۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-11491)) ^ 110707417;
                        i5 = 1078461999;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۜۚ")) * 57;
                        i4 = ((iM55680 ^ i2) * 8067) ^ (-1357364944);
                        i5 = -1963128955;
                    }
                    break;
                case -482443299:
                case 1083550157:
                    if (c <= 'z') {
                        iM55680 = (i2 - C0873.m55680("᩶ܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * 26981) ^ 1875822882;
                        i5 = 1497029338;
                    } else {
                        iM55680 = C0873.m55680("ۤۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 7445) ^ (-2059436023);
                        i5 = 1161371276;
                    }
                    break;
                case -292066838:
                case -191561254:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0946.m55979("ۚ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21971) ^ 456738950;
                        i5 = 1417083102;
                    } else {
                        iM55680 = C0946.m55979("᩻ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22739) ^ 1362046108;
                        i5 = -1178910111;
                    }
                    break;
                case -158221367:
                case 22135286:
                    if (C0949.f81897 >= 0) {
                        iM55680 = (C0873.m55680("ۤۨ") + i2) * (-35);
                        i4 = ((iM55680 ^ i3) * (-7783)) ^ 802132120;
                        i5 = -721121024;
                    } else {
                        iM55680 = (C0873.m55680("᩵᩺") + i2) * (-109);
                        i4 = ((iM55680 ^ i3) * (-19709)) ^ 451431126;
                        i5 = -1742097217;
                    }
                    break;
                case -134212482:
                case 1704066914:
                    if (C1194.f82045 != 0) {
                        iM55680 = (C0873.m55680("ۤۨ") + i2) * (-35);
                        i4 = ((iM55680 ^ i3) * (-7783)) ^ 802132120;
                        i5 = -721121024;
                    } else {
                        iM55680 = C0873.m55680("ۜܳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28555)) ^ 1394693952;
                        i5 = 884088002;
                    }
                    break;
                case 115983819:
                case 1248883928:
                    if (c >= '0') {
                        iM55680 = C0946.m55979("᩵ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-19171)) ^ 1573508433;
                        i5 = -1549159812;
                    } else {
                        iM55680 = C0946.m55979("۠۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 16249) ^ 1255760156;
                        i5 = -46344312;
                    }
                    break;
                case 815951024:
                case 945786565:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("᩻ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22739) ^ 1362046108;
                        i5 = -1178910111;
                    } else {
                        iM55680 = C0873.m55680("۟֨") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-3153)) ^ 1083817818;
                        i5 = -2139745963;
                    }
                    break;
                case 1496350266:
                case 1893385241:
                    if (c == '_') {
                        iM55680 = (i2 - C0873.m55680("᩶ܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * 26981) ^ 1875822882;
                        i5 = 1497029338;
                    } else {
                        iM55680 = C0873.m55680("ᩳ۬") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8907) ^ 833052586;
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
    /* JADX INFO: renamed from: ۧ */
    public static C16820 m38138(byte[] bArr) throws IOException {
        int iM55979;
        int i;
        RuntimeException e = null;
        int i2 = 557986856;
        int i3 = ViewOnClickListenerC0939.f81888;
        int i4 = C0949.f81897;
        int iM55680 = C0873.m55680("ܽ۟") ^ i4;
        int i5 = ((iM55680 ^ i3) * (-2161)) ^ 938661841;
        int i6 = -650814086;
        while (true) {
            int i7 = iM55680 ^ i6;
            C16820 c16820 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-22445)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1811528671:
                    case 833740688:
                        return c16820;
                    case -1809515014:
                    case -721634154:
                        C0917.m55854();
                        iM55979 = (C0873.m55680("۬ܽ") + i4) * (-83);
                        i5 = ((iM55979 ^ i3) * 27521) ^ 593028816;
                        i = -32293358;
                        i7 = iM55979 ^ i;
                        break;
                    case -686488174:
                    case 6501918:
                        try {
                            c16820 = new C16820(bArr);
                            iM55979 = C0946.m55979("᩺᩺") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-21997)) ^ 480505522;
                            i = 1297319751;
                            i7 = iM55979 ^ i;
                        } catch (RuntimeException e2) {
                            e = e2;
                            iM55680 = C0873.m55680("ܿۛ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-9801)) ^ (-381270785);
                            i6 = 1989226232;
                        }
                        break;
                    case -412515673:
                    case 582118835:
                        if (C0992.f81922 >= 0) {
                            iM55979 = (C0873.m55680("۬ܽ") + i4) * (-83);
                            i5 = ((iM55979 ^ i3) * 27521) ^ 593028816;
                            i = -32293358;
                        } else if (C1929.m56553()) {
                            iM55979 = (i3 - C0873.m55680("۠᩸")) * (-99);
                            i5 = ((iM55979 ^ i4) * (-30771)) ^ (-52238259);
                            i = -1570203115;
                        } else {
                            if (C0898.f81858 > 0) {
                                if (C1028.m56247() < 0) {
                                    if (C1024.f81946 || C0955.f81898) {
                                        iM55979 = (C0946.m55979("᩵᩹") + i3) * (-5);
                                        i5 = ((iM55979 ^ i4) * 18219) ^ (-1406848708);
                                        i = 1023138649;
                                    } else if (!C0892.f81851) {
                                        iM55979 = C0946.m55979("ۙۨ") ^ i4;
                                        i5 = ((iM55979 ^ i3) * (-8943)) ^ 954991235;
                                        i = -664892224;
                                    } else if (C1017.f81942 < 0) {
                                        if (C0877.f81843 >= 0) {
                                            iM55979 = (C0873.m55680("۬ܽ") + i4) * (-83);
                                            i5 = ((iM55979 ^ i3) * 27521) ^ 593028816;
                                            i = -32293358;
                                        } else if (C0937.f81884) {
                                            throw new IOException(e);
                                        }
                                    }
                                }
                                iM55979 = (i3 - C0873.m55680("۠᩸")) * (-99);
                                i5 = ((iM55979 ^ i4) * (-30771)) ^ (-52238259);
                                i = -1570203115;
                            }
                            iM55979 = (C0946.m55979("ܶۧ") ^ i3) * (-95);
                            i5 = ((iM55979 ^ i4) * 16075) ^ (-1671110876);
                            i = -2101789642;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 17357769:
                    case 2104980564:
                        if (C0906.f81862 >= 0) {
                            iM55979 = (i3 - C0873.m55680("۠᩸")) * (-99);
                            i5 = ((iM55979 ^ i4) * (-30771)) ^ (-52238259);
                            i = -1570203115;
                        } else {
                            iM55979 = (C0946.m55979("᩵᩹") + i3) * (-5);
                            i5 = ((iM55979 ^ i4) * 18219) ^ (-1406848708);
                            i = 1023138649;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 843001460:
                    case 1146311728:
                        C1044.m56286();
                        if (C0917.f81868) {
                            iM55979 = C0946.m55979("ۙۨ") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-8943)) ^ 954991235;
                            i = -664892224;
                        } else {
                            iM55979 = (C0873.m55680("۬ܽ") + i4) * (-83);
                            i5 = ((iM55979 ^ i3) * 27521) ^ 593028816;
                            i = -32293358;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 1854152437:
                    case 1992006393:
                        C0877.m55696();
                        ViewOnClickListenerC0939.m55941();
                        return null;
                    default:
                        if (AbstractC0942.m55971()) {
                            iM55979 = (C0873.m55680("۬ܽ") + i4) * (-83);
                            i5 = ((iM55979 ^ i3) * 27521) ^ 593028816;
                            i = -32293358;
                        } else {
                            iM55979 = (i3 - C0873.m55680("۠᩸")) * (-99);
                            i5 = ((iM55979 ^ i4) * (-30771)) ^ (-52238259);
                            i = -1570203115;
                        }
                        i7 = iM55979 ^ i;
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
    
        if (p067l.ServiceConnectionC1013.f81940 < 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (p067l.C0866.f81837 >= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
    
        if (p067l.C1194.f82045 != 0) goto L36;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C16820 m38131(AbstractC17043 abstractC17043) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        int i5;
        int i6;
        byte[] bArr = null;
        Throwable th = null;
        C16820 c16820M38138 = null;
        Object obj = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = -1964948628;
        int i11 = C1053.f81965;
        int i12 = C0863.f81833;
        int iM55680 = C0873.m55680("֫᩵") ^ i11;
        int i13 = ((iM55680 ^ i12) * 23493) ^ (-1429300241);
        int i14 = iM55680 ^ (-534366141);
        C24618 c24618M38671 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 17895) >> 31));
            switch (i10) {
                case -2106761573:
                case -2030359649:
                    C0890.m55740();
                    if (C0949.f81897 >= 0) {
                        iM559710 = (i12 - C0946.m55979("ۘܶ")) * 83;
                        i = ((iM559710 ^ i11) * 6951) ^ (-374596790);
                        i3 = -966889880;
                    } else {
                        iM559710 = C0946.m55979("֡ۗ") ^ i11;
                        i = ((iM559710 ^ i12) * 5937) ^ 1768899857;
                        i3 = -2077978162;
                    }
                    i6 = iM559710 ^ i3;
                    int i15 = i;
                    i14 = i6;
                    i13 = i15;
                    break;
                case -2008458472:
                case -1312105945:
                    bArr = bArr;
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("۫ᩳ") ^ i11;
                        i = ((iM55979 ^ i12) * (-893)) ^ 799342176;
                        i2 = -1441406377;
                    } else {
                        iM55979 = C0946.m55979("᩸᩷") ^ i11;
                        i = ((iM55979 ^ i12) * 4887) ^ 654050928;
                        i2 = 1012446780;
                    }
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i16 = i;
                    i14 = i6;
                    i13 = i16;
                    break;
                case -1979568867:
                case 815115155:
                    C1053.m56327();
                    break;
                case -1978541657:
                case -1955968732:
                    try {
                        c24618M38671.close();
                        iM559710 = (i12 - C0946.m55979("ۤ۬")) * 119;
                        i = ((iM559710 ^ i11) * (-2301)) ^ 1579530789;
                        i3 = -1248895992;
                        i6 = iM559710 ^ i3;
                        int i17 = i;
                        i14 = i6;
                        i13 = i17;
                    } catch (Throwable th2) {
                        int iM55681 = C0873.m55680("ۙ۠") ^ i12;
                        i4 = ((iM55681 ^ i11) * (-28845)) ^ (-2036823524);
                        i5 = iM55681 ^ (-400936786);
                        obj = th2;
                        i13 = i4;
                        i14 = i5;
                    }
                    break;
                case -1827679346:
                case 2030277875:
                    bArr = bArr;
                    if (abstractC17043.mo25101() > 52428800) {
                        iM55979 = (C0873.m55680("֨ۤ") + i11) * (-67);
                        i = ((iM55979 ^ i12) * (-8029)) ^ 410114606;
                        i2 = 71552944;
                    } else {
                        iM55979 = (i11 - C0873.m55680("᩸ܰ")) * 57;
                        i = ((iM55979 ^ i12) * (-6585)) ^ (-231330862);
                        i2 = -2005827546;
                    }
                    i6 = iM55979 ^ i2;
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
                    if (!C0917.f81868) {
                        bArr = bArr;
                        iM55979 = C0946.m55979("ۨ᩵") ^ i12;
                        i = ((iM55979 ^ i11) * (-5643)) ^ (-2045613220);
                        i2 = -1020417402;
                        i6 = iM55979 ^ i2;
                        bArr = bArr;
                        int i19 = i;
                        i14 = i6;
                        i13 = i19;
                    }
                    bArr = bArr;
                    iM55979 = C0946.m55979("᩷ܶ") ^ i11;
                    i = ((iM55979 ^ i12) * 10587) ^ 2142811964;
                    i2 = 80394532;
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i110 = i;
                    i14 = i6;
                    i13 = i110;
                    break;
                case -1639367785:
                case -1302009548:
                    C0906.m55809();
                    C0989.m56095();
                    return null;
                case -1591717206:
                case 1807436169:
                    bArr = bArr;
                    i8 = i7 + 316270656;
                    if (C1194.f82045 != 0) {
                        iM55979 = C0946.m55979("ܽ֡") ^ i11;
                        i = ((iM55979 ^ i12) * (-3033)) ^ (-1963194957);
                        i2 = 1870024114;
                    } else {
                        iM55979 = C0946.m55979("᩺ۡ") ^ i12;
                        i = ((iM55979 ^ i11) * 22097) ^ (-1757532487);
                        i2 = 3430633;
                    }
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i111 = i;
                    i14 = i6;
                    i13 = i111;
                    break;
                case -1518487700:
                case 44096385:
                    bArr = bArr;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0946.m55979("ۨ᩵") ^ i12;
                        i = ((iM55979 ^ i11) * (-5643)) ^ (-2045613220);
                        i2 = -1020417402;
                    } else {
                        iM55979 = (C0946.m55979("ܶۙ") + i12) * (-5);
                        i = ((iM55979 ^ i11) * (-18129)) ^ (-1170421615);
                        i2 = -280039809;
                    }
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i112 = i;
                    i14 = i6;
                    i13 = i112;
                    break;
                case -1346158495:
                case 1170409108:
                    return c16820M38138;
                case -1334309456:
                case -850298642:
                    if (!RunnableC0897.f81856) {
                        bArr = bArr;
                        iM55979 = (C0873.m55680("᩹ܳ") ^ i11) * (-45);
                        i = ((iM55979 ^ i12) * (-9975)) ^ (-1376557825);
                        i2 = -1914468433;
                        i6 = iM55979 ^ i2;
                        bArr = bArr;
                        int i113 = i;
                        i14 = i6;
                        i13 = i113;
                    }
                    iM559710 = C0946.m55979("۬ܺ") ^ i12;
                    i = ((iM559710 ^ i11) * (-16313)) ^ (-808221926);
                    i3 = 513775650;
                    i6 = iM559710 ^ i3;
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
                        iM559710 = (i12 - C0946.m55979("᩻ۛ")) * (-11);
                        i = ((iM559710 ^ i11) * (-31643)) ^ (-359771375);
                        i3 = 650575505;
                        i6 = iM559710 ^ i3;
                        int i115 = i;
                        i14 = i6;
                        i13 = i115;
                    }
                    bArr = bArr;
                    iM55979 = (i11 - C0873.m55680("᩸ܰ")) * 57;
                    i = ((iM55979 ^ i12) * (-6585)) ^ (-231330862);
                    i2 = -2005827546;
                    i6 = iM55979 ^ i2;
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
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0946.m55979("ܽ֡") ^ i11;
                        i = ((iM55979 ^ i12) * (-3033)) ^ (-1963194957);
                        i2 = 1870024114;
                    } else {
                        iM55979 = C0873.m55680("᩹ᩳ") ^ i12;
                        i = ((iM55979 ^ i11) * (-1529)) ^ (-896087738);
                        i2 = -1178050895;
                    }
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i117 = i;
                    i14 = i6;
                    i13 = i117;
                    break;
                case -926855516:
                case -441040444:
                    c16820M38138 = m38138(bArr);
                    iM559710 = (i11 - C0873.m55680("ۢܿ")) * (-5);
                    i = ((iM559710 ^ i12) * 18243) ^ 1940428333;
                    i3 = -1074493475;
                    i6 = iM559710 ^ i3;
                    int i118 = i;
                    i14 = i6;
                    i13 = i118;
                    break;
                case -787619297:
                case -482251629:
                    i9 = 4543;
                    iM55979 = C0946.m55979("۟ܿ") ^ i12;
                    i = ((iM55979 ^ i11) * 25075) ^ (-462181930);
                    i2 = -1947972401;
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i119 = i;
                    i14 = i6;
                    i13 = i119;
                    break;
                case -778341407:
                case -730145983:
                    bArr = bArr;
                    sArr = f82237;
                    if (C0877.m55696()) {
                        iM55979 = C0946.m55979("ܶᩴ") ^ i11;
                        i = ((iM55979 ^ i12) * 2083) ^ (-104181154);
                        i2 = 1746930935;
                    } else {
                        iM55979 = C0873.m55680("ۖ᩷") ^ i12;
                        i = ((iM55979 ^ i11) * (-6375)) ^ 1989580300;
                        i2 = -1643084033;
                    }
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i1110 = i;
                    i14 = i6;
                    i13 = i1110;
                    break;
                case -710805583:
                case 1905570636:
                    C1229.m56410();
                    C0992.m56107();
                    bArr = bArr;
                    iM55979 = C0873.m55680("۫ᩳ") ^ i11;
                    i = ((iM55979 ^ i12) * (-893)) ^ 799342176;
                    i2 = -1441406377;
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i1111 = i;
                    i14 = i6;
                    i13 = i1111;
                    break;
                case -688433741:
                case 64565302:
                    bArr = bArr;
                    if (C0898.m55800() <= 0) {
                        iM55979 = C0946.m55979("᩷ܶ") ^ i11;
                        i = ((iM55979 ^ i12) * 10587) ^ 2142811964;
                        i2 = 80394532;
                    } else {
                        iM55979 = (C0946.m55979("ۧۖ") + i11) * (-97);
                        i = ((iM55979 ^ i12) * 22571) ^ (-1861609579);
                        i2 = -1916990971;
                    }
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i1112 = i;
                    i14 = i6;
                    i13 = i1112;
                    break;
                case -607774454:
                case 285618338:
                    if (C0930.m55885() <= 0) {
                        bArr = bArr;
                        iM55979 = C0873.m55680("ۖ᩷") ^ i12;
                        i = ((iM55979 ^ i11) * (-6375)) ^ 1989580300;
                        i2 = -1643084033;
                        i6 = iM55979 ^ i2;
                        bArr = bArr;
                        int i1113 = i;
                        i14 = i6;
                        i13 = i1113;
                    }
                    bArr = bArr;
                    iM55979 = C0946.m55979("᩷ܶ") ^ i11;
                    i = ((iM55979 ^ i12) * 10587) ^ 2142811964;
                    i2 = 80394532;
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i1114 = i;
                    i14 = i6;
                    i13 = i1114;
                    break;
                case -498156059:
                case 394259989:
                    i9 = 3263;
                    iM55979 = C0946.m55979("۟ܿ") ^ i12;
                    i = ((iM55979 ^ i11) * 25075) ^ (-462181930);
                    i2 = -1947972401;
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i1115 = i;
                    i14 = i6;
                    i13 = i1115;
                    break;
                case -458049034:
                case 1529512606:
                    C1964.m56597();
                    if (C1124.m56367() >= 0) {
                        iM559710 = C0946.m55979("֡ۗ") ^ i11;
                        i = ((iM559710 ^ i12) * 5937) ^ 1768899857;
                        i3 = -2077978162;
                    } else {
                        iM559710 = (C0873.m55680("ۖ֨") ^ i11) * 35;
                        i = ((iM559710 ^ i12) * (-6063)) ^ (-2085484372);
                        i3 = -1124357445;
                    }
                    i6 = iM559710 ^ i3;
                    int i1116 = i;
                    i14 = i6;
                    i13 = i1116;
                    break;
                case -287918635:
                case 1341278052:
                    bArr = bArr;
                    try {
                        try {
                            c24618M38671 = abstractC17043.m38671(C0937.m55921(f82237, 32, 1, i9));
                            try {
                                byte[] bArrM38140 = m38140(c24618M38671);
                                try {
                                    c24618M38671.close();
                                    int iM55682 = (i12 - C0873.m55680("ۙ᩻")) * 101;
                                    i13 = ((iM55682 ^ i11) * (-21605)) ^ 1086042130;
                                    i14 = iM55682 ^ 903298976;
                                    bArr = bArrM38140;
                                } catch (Throwable unused) {
                                    bArr = bArrM38140;
                                    iM55979 = (i11 - C0873.m55680("᩸ܰ")) * 57;
                                    i = ((iM55979 ^ i12) * (-6585)) ^ (-231330862);
                                    i2 = -2005827546;
                                    i6 = iM55979 ^ i2;
                                    bArr = bArr;
                                    int i1117 = i;
                                    i14 = i6;
                                    i13 = i1117;
                                }
                            } catch (Throwable th3) {
                                int iM55683 = C0873.m55680("ܺܿ") ^ i11;
                                i4 = ((iM55683 ^ i12) * 9537) ^ (-479193873);
                                bArr = bArr;
                                i5 = iM55683 ^ (-1102243894);
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
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("ۨ᩵") ^ i12;
                        i = ((iM55979 ^ i11) * (-5643)) ^ (-2045613220);
                        i2 = -1020417402;
                    } else {
                        iM55979 = C0946.m55979("ۨۚ") ^ i11;
                        i = ((iM55979 ^ i12) * (-32149)) ^ 1447746628;
                        i2 = -257394165;
                    }
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i1118 = i;
                    i14 = i6;
                    i13 = i1118;
                    break;
                case 134730219:
                case 1276176033:
                    bArr = bArr;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (C0873.m55680("᩹ܳ") ^ i11) * (-45);
                        i = ((iM55979 ^ i12) * (-9975)) ^ (-1376557825);
                        i2 = -1914468433;
                    } else {
                        iM55979 = (i12 - C0946.m55979("ܽᩳ")) * (-89);
                        i = ((iM55979 ^ i11) * (-7949)) ^ 1628415642;
                        i2 = 1431689531;
                    }
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i1119 = i;
                    i14 = i6;
                    i13 = i1119;
                    break;
                case 417079375:
                case 932286232:
                    bArr = bArr;
                    s2 = 35568;
                    if (C0930.f81879 <= 0) {
                        iM55979 = (C0873.m55680("᩹ܳ") ^ i11) * (-45);
                        i = ((iM55979 ^ i12) * (-9975)) ^ (-1376557825);
                        i2 = -1914468433;
                    } else {
                        iM55979 = (C0873.m55680("᩵֡") ^ i11) * 89;
                        i = ((iM55979 ^ i12) * 7543) ^ (-1552645961);
                        i2 = 799216648;
                    }
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i11110 = i;
                    i14 = i6;
                    i13 = i11110;
                    break;
                case 447728460:
                case 713441000:
                    bArr = bArr;
                    if (i8 - (s * s2) < 0) {
                        iM55979 = (i11 - C0873.m55680("ۗۢ")) * 41;
                        i = ((iM55979 ^ i12) * (-9157)) ^ (-9353312);
                        i2 = -2116097194;
                    } else {
                        iM55979 = C0873.m55680("֡ۙ") ^ i12;
                        i = ((iM55979 ^ i11) * 29575) ^ (-613956505);
                        i2 = 261363788;
                    }
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i11111 = i;
                    i14 = i6;
                    i13 = i11111;
                    break;
                case 542371027:
                case 800939478:
                    return m38138(C0906.m55816(abstractC17043));
                case 1185557721:
                case 1946764041:
                    AbstractC0942.m55971();
                    break;
                case 1551686689:
                case 2080464922:
                    bArr = bArr;
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("ܽ֡") ^ i11;
                        i = ((iM55979 ^ i12) * (-3033)) ^ (-1963194957);
                        i2 = 1870024114;
                    } else {
                        iM55979 = (C0873.m55680("ۚᩴ") ^ i12) * (-119);
                        i = ((iM55979 ^ i11) * 29357) ^ 441558784;
                        i2 = -608635628;
                    }
                    i6 = iM55979 ^ i2;
                    bArr = bArr;
                    int i11112 = i;
                    i14 = i6;
                    i13 = i11112;
                    break;
                default:
                    try {
                        C0949.m56011(th, obj);
                        iM559710 = (i12 - C0946.m55979("ۤ۬")) * 119;
                        i = ((iM559710 ^ i11) * (-2301)) ^ 1579530789;
                        i3 = -1248895992;
                        i6 = iM559710 ^ i3;
                    } catch (Throwable unused4) {
                        bArr = bArr;
                        iM55979 = (i11 - C0873.m55680("᩸ܰ")) * 57;
                        i = ((iM55979 ^ i12) * (-6585)) ^ (-231330862);
                        i2 = -2005827546;
                        i6 = iM55979 ^ i2;
                        bArr = bArr;
                    }
                    int i11113 = i;
                    i14 = i6;
                    i13 = i11113;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16820 m38130(InputStream inputStream) throws Throwable {
        int iM55979;
        int i;
        Throwable th = null;
        Object th2 = null;
        RuntimeException e = null;
        int i2 = 1615183990;
        int i3 = RunnableC0938.f81886;
        int i4 = ViewOnClickListenerC0939.f81888;
        int iM55680 = C0873.m55680("ܿ᩻") ^ i3;
        int i5 = ((iM55680 ^ i4) * 423) ^ 1917916341;
        int i6 = -1560917000;
        while (true) {
            int i7 = iM55680 ^ i6;
            C16820 c16820 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-11155)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2141717796:
                    case 857042894:
                        try {
                            if (C1929.f83011 != 0) {
                                iM55680 = (i4 - C0946.m55979("᩹ۘ")) * 115;
                                i5 = ((iM55680 ^ i3) * (-471)) ^ (-387183064);
                                i6 = -985965002;
                            } else if (C0890.m55740()) {
                                if (C0898.m55800() > 0) {
                                    if (C0917.f81868) {
                                        iM55680 = (C0946.m55979("֫ܽ") ^ i4) * 33;
                                        i5 = ((iM55680 ^ i3) * (-26931)) ^ (-1544952365);
                                        i6 = 1747754223;
                                    } else if (RunnableC0871.f81839 >= 0) {
                                        iM55680 = C0873.m55680("۬ܰ") ^ i3;
                                        i5 = ((iM55680 ^ i4) * 28071) ^ 844620228;
                                        i6 = -68266993;
                                    } else if (C0892.f81851) {
                                        if (C0927.f81875) {
                                            iM55680 = C0946.m55979("ۧۚ") ^ i3;
                                            i5 = ((iM55680 ^ i4) * (-521)) ^ (-706632446);
                                            i6 = -555331691;
                                        } else {
                                            if (ViewOnClickListenerC0939.f81888 > 0) {
                                                if (C1017.f81942 >= 0) {
                                                    iM55680 = (C0946.m55979("ܿ۠") ^ i4) * 97;
                                                    i5 = ((iM55680 ^ i3) * 25959) ^ (-1482171070);
                                                    i6 = -1295843289;
                                                } else if (C0845.f81821 < 0) {
                                                    c16820 = new C16820(C2700.m4194(inputStream, 0));
                                                    iM55979 = (C0873.m55680("ۜܽ") ^ i4) * (-37);
                                                    i5 = ((iM55979 ^ i3) * 13371) ^ (-234442444);
                                                    i = 710392268;
                                                    i7 = iM55979 ^ i;
                                                    break;
                                                }
                                            }
                                            iM55680 = (C0873.m55680("᩸֨") ^ i4) * (-111);
                                            i5 = ((iM55680 ^ i3) * (-21575)) ^ 935901135;
                                            i6 = 1275041860;
                                        }
                                    }
                                }
                                iM55680 = (i3 - C0946.m55979("۠ᩳ")) * 5;
                                i5 = ((iM55680 ^ i4) * 15685) ^ 1032413405;
                                i6 = 861751320;
                            } else {
                                iM55680 = (i3 - C0946.m55979("᩶۫")) * 55;
                                i5 = ((iM55680 ^ i4) * (-7963)) ^ 368101984;
                                i6 = -1575503505;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            iM55680 = (C0946.m55979("ۤۜ") ^ i3) * 85;
                            i5 = ((iM55680 ^ i4) * 15925) ^ 584716081;
                            i6 = 831738243;
                        }
                        break;
                    case -1994114503:
                    case 1106463673:
                        if (inputStream != null) {
                            iM55979 = C0873.m55680("ۢᩳ") ^ i3;
                            i5 = ((iM55979 ^ i4) * 30547) ^ 1367272146;
                            i = -126419703;
                        } else {
                            iM55979 = C0873.m55680("ܽ۫") ^ i4;
                            i5 = ((iM55979 ^ i3) * 29189) ^ (-477123966);
                            i = -1990677063;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -1991052864:
                    case 208575960:
                        RunnableC0897.m55779(inputStream);
                        iM55979 = C0873.m55680("ᩳܳ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-5471)) ^ 459354565;
                        i = -1991583714;
                        i7 = iM55979 ^ i;
                        break;
                    case -1703922428:
                    case 1771425266:
                        try {
                            RunnableC0897.m55779(inputStream);
                            iM55979 = C0873.m55680("ܽ۫") ^ i4;
                            i5 = ((iM55979 ^ i3) * 29189) ^ (-477123966);
                            i = -1990677063;
                        } catch (Throwable th4) {
                            th2 = th4;
                            iM55979 = C0946.m55979("ۜ᩺") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-13751)) ^ (-1425353234);
                            i = 1513635328;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -1685248628:
                    case 413809684:
                        return c16820;
                    case -1668003875:
                    case -579080512:
                        throw th;
                    case -1498558238:
                    case -365697557:
                        C1404.m56468();
                        if (!C0892.f81851) {
                            iM55680 = (i4 - C0946.m55979("᩹ۘ")) * 115;
                            i5 = ((iM55680 ^ i3) * (-471)) ^ (-387183064);
                            i6 = -985965002;
                        } else {
                            iM55680 = (i3 - C0946.m55979("᩶۫")) * 55;
                            i5 = ((iM55680 ^ i4) * (-7963)) ^ 368101984;
                            i6 = -1575503505;
                        }
                        break;
                    case -1331038326:
                    case 1406517018:
                        C0882.m55710();
                        if (C0873.f81841 > 0) {
                            iM55680 = C0873.m55680("۬ܰ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 28071) ^ 844620228;
                            i6 = -68266993;
                        } else {
                            iM55680 = (C0946.m55979("ܿ۠") ^ i4) * 97;
                            i5 = ((iM55680 ^ i3) * 25959) ^ (-1482171070);
                            i6 = -1295843289;
                        }
                        break;
                    case -863022751:
                    case 1616157719:
                        throw new IOException(e);
                    case -271752958:
                    case -58114082:
                        if (inputStream != null) {
                            iM55979 = C0873.m55680("᩻ܿ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 20151) ^ 1534536615;
                            i = -579704365;
                        } else {
                            iM55979 = C0873.m55680("ᩳܳ") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-5471)) ^ 459354565;
                            i = -1991583714;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -179011380:
                    case 287195080:
                        C1036.m56257();
                        if (!C1048.f81963) {
                            iM55680 = (C0946.m55979("ܿ۠") ^ i4) * 97;
                            i5 = ((iM55680 ^ i3) * 25959) ^ (-1482171070);
                            i6 = -1295843289;
                        } else {
                            iM55680 = (C0946.m55979("֫ܽ") ^ i4) * 33;
                            i5 = ((iM55680 ^ i3) * (-26931)) ^ (-1544952365);
                            i6 = 1747754223;
                        }
                        break;
                    case 236680489:
                    case 1637888540:
                        try {
                            C0877.m55706(th, th2);
                            iM55979 = C0873.m55680("ܽ۫") ^ i4;
                            i5 = ((iM55979 ^ i3) * 29189) ^ (-477123966);
                            i = -1990677063;
                        } catch (RuntimeException e2) {
                            e = e2;
                            iM55979 = C0946.m55979("ۧ֡") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-27429)) ^ 1154191883;
                            i = -239626073;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 263476382:
                    case 765163364:
                        C0845.m55584();
                        if (RunnableC0871.m55672() >= 0) {
                            iM55680 = (i3 - C0946.m55979("᩶۫")) * 55;
                            i5 = ((iM55680 ^ i4) * (-7963)) ^ 368101984;
                            i6 = -1575503505;
                        } else {
                            iM55680 = C0873.m55680("۬ܰ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 28071) ^ 844620228;
                            i6 = -68266993;
                        }
                        break;
                    case 269391020:
                    case 1325747308:
                        C1929.m56553();
                        if (!C1048.f81963) {
                            iM55680 = (C0946.m55979("֫ܽ") ^ i4) * 33;
                            i5 = ((iM55680 ^ i3) * (-26931)) ^ (-1544952365);
                            i6 = 1747754223;
                        } else {
                            iM55680 = (i3 - C0946.m55979("۠ᩳ")) * 5;
                            i5 = ((iM55680 ^ i4) * 15685) ^ 1032413405;
                            i6 = 861751320;
                        }
                        break;
                    case 327161367:
                    case 1402972113:
                        C1404.m56468();
                        C0861.m55626();
                        return null;
                    case 1609403306:
                    case 1779259105:
                        C0863.m55643();
                        C0927.m55873();
                        iM55680 = (C0946.m55979("ܿ۠") ^ i4) * 97;
                        i5 = ((iM55680 ^ i3) * 25959) ^ (-1482171070);
                        i6 = -1295843289;
                        break;
                    default:
                        if (AbstractC0942.f81890 > 0) {
                            iM55680 = C0946.m55979("ۧۚ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-521)) ^ (-706632446);
                            i6 = -555331691;
                        } else {
                            iM55680 = (C0946.m55979("ܿ۠") ^ i4) * 97;
                            i5 = ((iM55680 ^ i3) * 25959) ^ (-1482171070);
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
    /* JADX INFO: renamed from: ۧ */
    public static byte[] m38140(C24618 c24618) throws EOFException {
        int i;
        int i2;
        C4263 c4263;
        int i3;
        long j;
        int i4;
        int iM55680;
        int i5;
        int i6;
        int i7;
        int i8;
        long j2;
        int iM55979;
        int i9;
        int i10;
        int iM55681;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iM559710;
        int i17;
        C4263 c4264;
        int i18;
        long j3;
        C4263 c4265;
        C4263 c4266;
        int i19;
        int i20;
        int iM559711;
        int i21;
        int i22;
        int iM559712;
        int i23;
        int i24;
        ?? r13;
        C24618 c24619 = c24618;
        int i25 = C0989.f81920;
        int i26 = ViewOnClickListenerC0939.f81888;
        int iM559713 = C0946.m55979("ۧۘ") ^ i26;
        int i27 = ((iM559713 ^ i25) * 2617) ^ (-1484731298);
        C4263 c4263M8666 = null;
        ?? r7 = 0;
        long j4 = 0;
        C12469 c12469 = null;
        C14971 c14971 = 0;
        byte[] bArr = null;
        long length = 0;
        int i28 = iM559713 ^ 313860036;
        int i29 = 0;
        int i30 = 0;
        C11996 c11996 = null;
        int i31 = 0;
        int i32 = 0;
        boolean z = false;
        int iM54254 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = -1236461171;
        int i38 = 0;
        long j5 = 0;
        C4263 c4263M8667 = null;
        while (true) {
            i37 = i28 ^ (i27 & (((i37 ^ i25) * 8955) >> 31));
            switch (i37) {
                case -1989424088:
                case 1855809767:
                    c4263M8666 = C4263.m8666(c24618);
                    i20 = i38;
                    iM559712 = (i25 - C0946.m55979("֡ܶ")) * 21;
                    i23 = ((iM559712 ^ i26) * (-16565)) ^ (-1921873690);
                    i24 = -1978212757;
                    int i39 = iM559712 ^ i24;
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
                    length = c24618.length();
                    if (C1929.f83011 == 0) {
                        iM55681 = (C0873.m55680("ۜۧ") + i25) * (-103);
                        i11 = ((iM55681 ^ i26) * (-4125)) ^ (-411909982);
                        i12 = 289039965;
                        c14971 = c14971;
                        int i40 = iM55681 ^ i12;
                        i32 = i8;
                        i28 = i40;
                        i27 = i11;
                        i31 = i7;
                    } else {
                        j2 = j4;
                        iM55979 = (C0873.m55680("۠ۜ") ^ i26) * (-47);
                        i5 = ((iM55979 ^ i25) * (-24853)) ^ 1571777172;
                        i9 = 2133225716;
                        i10 = iM55979 ^ i9;
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
                    C4263 c4267 = c4263M8666;
                    int i44 = i38;
                    long j6 = j4;
                    int i45 = c4267.f9453;
                    if (c4267.f9456 != 1) {
                        iM559711 = C0873.m55680("᩹᩷") ^ i26;
                        i21 = ((iM559711 ^ i25) * 19899) ^ (-1755928695);
                        i22 = -142230605;
                    } else {
                        iM559711 = (C0946.m55979("ۤ۬") ^ i25) * (-11);
                        i21 = ((iM559711 ^ i26) * 29843) ^ 406154250;
                        i22 = -286736147;
                    }
                    int i46 = iM559711 ^ i22;
                    j4 = j6;
                    i38 = i44;
                    i32 = i43;
                    i31 = i42;
                    i28 = i46;
                    r7 = 0;
                    c4263M8666 = c4267;
                    i27 = i21;
                    i36 = i45;
                    i29 = i41;
                    break;
                case -1770785043:
                case -183916853:
                    i20 = i38;
                    c24619.skipBytes(i35 - i20);
                    c4263M8666 = C4263.m8666(c24618);
                    iM559712 = (i25 - C0946.m55979("֡ܶ")) * 21;
                    i23 = ((iM559712 ^ i26) * (-16565)) ^ (-1921873690);
                    i24 = -1978212757;
                    int i310 = iM559712 ^ i24;
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
                        iM559712 = (i25 - C0873.m55680("ۤۤ")) * (-57);
                        i29 = i29;
                        i23 = ((iM559712 ^ i26) * (-30041)) ^ 1229476356;
                        i24 = -1143195402;
                    } else {
                        i29 = i29;
                        iM559712 = (C0946.m55979("ۛ۠") + i26) * (-121);
                        i23 = ((iM559712 ^ i25) * 11159) ^ 1448906316;
                        i24 = -869035103;
                    }
                    int i311 = iM559712 ^ i24;
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
                    RunnableC1014.m56177();
                    if (C1124.f82007 >= 0) {
                        i7 = i31;
                        i8 = i32;
                        r13 = c14971;
                        iM55681 = C0946.m55979("᩵ۜ") ^ i25;
                        i11 = ((iM55681 ^ i26) * 11805) ^ 51354630;
                        i12 = 325165592;
                        c14971 = r13;
                        int i47 = iM55681 ^ i12;
                        i32 = i8;
                        i28 = i47;
                        i27 = i11;
                        i31 = i7;
                    } else {
                        iM55680 = (i26 - C0873.m55680("ܿᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM55680 ^ i25) * 25673) ^ 184090284;
                        i6 = 2075339630;
                        i28 = iM55680 ^ i6;
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
                    c24619.skipBytes(i36 - 8);
                    i20 = i38;
                    if (c24618.available() < i20) {
                        i36 = i36;
                        iM559712 = (i25 - C0873.m55680("ۤۤ")) * (-57);
                        i29 = i29;
                        i23 = ((iM559712 ^ i26) * (-30041)) ^ 1229476356;
                        i24 = -1143195402;
                        int i312 = iM559712 ^ i24;
                        j4 = j4;
                        i38 = i20;
                        i32 = i32;
                        i31 = i31;
                        i28 = i312;
                        i27 = i23;
                        i29 = i29;
                        i36 = i36;
                    } else {
                        int iM559714 = C0946.m55979("᩵ܺ") ^ i25;
                        j4 = j4;
                        i38 = i20;
                        i32 = i32;
                        i31 = i31;
                        i28 = iM559714 ^ (-1682142955);
                        i27 = ((iM559714 ^ i26) * (-25799)) ^ 336358162;
                    }
                    break;
                case -1348026371:
                case -108759652:
                    C0912.m55833();
                    return null;
                case -1322705224:
                case 233949295:
                    i32 = c24619.read(bArr, z ? 1 : 0, RunnableC0897.m55777(i31, i33));
                    if (i32 >= 0) {
                        iM55680 = C0873.m55680("᩸ۗ") ^ i26;
                        i5 = ((iM55680 ^ i25) * 25555) ^ 217915283;
                        i6 = 81531023;
                    } else {
                        iM55680 = (C0946.m55979("۟ۘ") + i25) * (-49);
                        i5 = ((iM55680 ^ i26) * 2775) ^ (-2120344138);
                        i6 = 1844945704;
                    }
                    i28 = iM55680 ^ i6;
                    i27 = i5;
                    break;
                case -1176632349:
                case -1153677909:
                    i7 = i31;
                    i8 = i32;
                    if (!C1024.f81946) {
                        C11996 c11997 = new C11996();
                        c24619.seek(0L);
                        c11996 = c11997;
                        i29 = i34;
                        iM55681 = C0946.m55979("ۙ֫") ^ i26;
                        i11 = ((iM55681 ^ i25) * (-31105)) ^ 606504837;
                        i12 = -1710066737;
                        c14971 = c14971;
                        int i48 = iM55681 ^ i12;
                        i32 = i8;
                        i28 = i48;
                        i27 = i11;
                        i31 = i7;
                    } else {
                        c4264 = c4263M8666;
                        i36 = i36;
                        i18 = i38;
                        j3 = j4;
                        i29 = i29;
                        c4265 = c4263M8667;
                        int iM559715 = C0946.m55979("ۧ۟") ^ i26;
                        int i49 = ((iM559715 ^ i25) * (-1459)) ^ (-1500480717);
                        i17 = iM559715 ^ 1435433493;
                        c4263M8666 = c4264;
                        c4263M8667 = c4265;
                        i27 = i49;
                        j4 = j3;
                        i38 = i18;
                        i29 = i29;
                        i32 = i8;
                        i31 = i7;
                        c11996 = null;
                        i28 = i17;
                        i36 = i36;
                        c24619 = c24618;
                    }
                    break;
                case -1165272421:
                case 1645767740:
                    if (i31 > 0) {
                        iM55680 = (i26 - C0873.m55680("֫ۧ")) * (-29);
                        i5 = ((iM55680 ^ i25) * 19287) ^ (-2050564099);
                        i6 = 1979374878;
                    } else {
                        iM55680 = (i25 - C0946.m55979("᩶۫")) * 15;
                        i5 = ((iM55680 ^ i26) * (-9795)) ^ (-1987256536);
                        i6 = 243775533;
                    }
                    i28 = iM55680 ^ i6;
                    i27 = i5;
                    break;
                case -1080476124:
                case -623573269:
                    i7 = i31;
                    i8 = i32;
                    j2 = j4;
                    c24619.seek(j2);
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0873.m55680("۠ۜ") ^ i26) * (-47);
                        i5 = ((iM55979 ^ i25) * (-24853)) ^ 1571777172;
                        i9 = 2133225716;
                    } else {
                        iM55979 = (C0946.m55979("۟ۚ") + i25) * 89;
                        i5 = ((iM55979 ^ i26) * 21229) ^ (-1634382720);
                        i9 = 543013574;
                    }
                    i10 = iM55979 ^ i9;
                    j4 = j2;
                    i32 = i8;
                    i31 = i7;
                    i28 = i10;
                    i27 = i5;
                    break;
                case -997001263:
                case 28148474:
                    if (!C0917.f81868) {
                        iM55680 = (i25 - C0873.m55680("֫֨")) * 49;
                        i5 = ((iM55680 ^ i26) * (-8341)) ^ (-1005414202);
                        i6 = 211864301;
                        i28 = iM55680 ^ i6;
                        i27 = i5;
                    } else {
                        i = i31;
                        i2 = i32;
                        c4263 = c4263M8666;
                        i36 = i36;
                        i3 = i38;
                        j = j4;
                        i4 = i29;
                        iM559710 = (C0946.m55979("۟᩺") ^ i25) * (-81);
                        i16 = ((iM559710 ^ i26) * 15567) ^ (-1996802153);
                        i15 = 161488462;
                        i17 = iM559710 ^ i15;
                        c4263M8666 = c4263;
                        i27 = i16;
                        j4 = j;
                        i38 = i3;
                        i29 = i4;
                        i32 = i2;
                        i31 = i;
                        i28 = i17;
                        i36 = i36;
                        c24619 = c24618;
                    }
                    break;
                case -977620688:
                case 890274667:
                    i7 = i31;
                    i8 = i32;
                    c4264 = c4263M8666;
                    i36 = i36;
                    i18 = i38;
                    j3 = j4;
                    i29 = i29;
                    c4265 = c4263M8667;
                    int i50 = c4265.f9454;
                    if (C1028.m56247() < 0) {
                        int iM55682 = (i26 - C0873.m55680("ܶ᩸")) * (-117);
                        i35 = i50;
                        c4263M8666 = c4264;
                        j4 = j3;
                        i38 = i18;
                        i32 = i8;
                        i31 = i7;
                        i27 = ((iM55682 ^ i25) * (-17305)) ^ 849508744;
                        i28 = iM55682 ^ 1173219436;
                        c24619 = c24618;
                        c4263M8667 = c4265;
                        i29 = i29;
                        i36 = i36;
                    } else {
                        i35 = i50;
                        int iM559716 = C0946.m55979("ۧ۟") ^ i26;
                        int i410 = ((iM559716 ^ i25) * (-1459)) ^ (-1500480717);
                        i17 = iM559716 ^ 1435433493;
                        c4263M8666 = c4264;
                        c4263M8667 = c4265;
                        i27 = i410;
                        j4 = j3;
                        i38 = i18;
                        i29 = i29;
                        i32 = i8;
                        i31 = i7;
                        c11996 = null;
                        i28 = i17;
                        i36 = i36;
                        c24619 = c24618;
                    }
                    break;
                case -922335877:
                case -813574769:
                    i7 = i31;
                    i8 = i32;
                    C14971 c14971M34275 = C14971.m34275(c12469);
                    i33 = 1024;
                    bArr = new byte[1024];
                    r13 = c14971M34275;
                    if (C0937.f81884) {
                        iM55681 = (i26 - C0946.m55979("ۛۢ")) * 77;
                        i11 = ((iM55681 ^ i25) * 32015) ^ 1529096481;
                        i12 = -179690693;
                        c14971 = c14971M34275;
                    } else {
                        iM55681 = C0946.m55979("᩵ۜ") ^ i25;
                        i11 = ((iM55681 ^ i26) * 11805) ^ 51354630;
                        i12 = 325165592;
                        c14971 = r13;
                    }
                    int i411 = iM55681 ^ i12;
                    i32 = i8;
                    i28 = i411;
                    i27 = i11;
                    i31 = i7;
                    break;
                case -909779541:
                case 817016083:
                    i13 = i31;
                    i14 = i32;
                    c4266 = c4263M8666;
                    i36 = i36;
                    long j7 = j4;
                    i29 = i29;
                    i38 = 8;
                    if (C0863.f81833 <= 0) {
                        j4 = j7;
                        int iM559717 = C0946.m55979("ܺ᩶") ^ i26;
                        int i51 = ((iM559717 ^ i25) * 18349) ^ 1703055301;
                        i19 = iM559717 ^ (-905312630);
                        c4263M8666 = c4266;
                        i27 = i51;
                    } else {
                        int iM55683 = (i26 - C0873.m55680("ۙ᩺")) * (-17);
                        int i52 = ((iM55683 ^ i25) * (-20285)) ^ 611838673;
                        i19 = iM55683 ^ (-4061753);
                        c4263M8666 = c4266;
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
                    c11996.write(bArr, z ? 1 : 0, i32);
                    i31 -= i32;
                    i8 = i32;
                    int iM55684 = C0873.m55680("۫ۖ") ^ i25;
                    int i53 = i8;
                    i28 = iM55684 ^ 1336499527;
                    i27 = ((iM55684 ^ i26) * (-3777)) ^ 1583327090;
                    i32 = i53;
                    break;
                case -879274872:
                case 1299566333:
                    i7 = i31;
                    i8 = i32;
                    c14971.m34279(c11996, z, (C20689) r7);
                    long j8 = iM54254;
                    c24619.seek(j8);
                    if (!C0882.f81846) {
                        int iM55685 = (C0873.m55680("۫۫") ^ i26) * (-69);
                        i5 = ((iM55685 ^ i25) * (-5725)) ^ 759007819;
                        i10 = iM55685 ^ (-272186485);
                        j5 = j8;
                        i32 = i8;
                        i31 = i7;
                        i28 = i10;
                        i27 = i5;
                    } else {
                        j5 = j8;
                        r13 = c14971;
                        iM55681 = C0946.m55979("᩵ۜ") ^ i25;
                        i11 = ((iM55681 ^ i26) * 11805) ^ 51354630;
                        i12 = 325165592;
                        c14971 = r13;
                        int i412 = iM55681 ^ i12;
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
                        iM55681 = C0873.m55680("ۤ᩶") ^ i26;
                        i11 = ((iM55681 ^ i25) * 14087) ^ 1973057512;
                        i12 = -1554036546;
                        c14971 = c14971;
                    } else {
                        iM55681 = (i25 - C0873.m55680("ܶۜ")) * 23;
                        i11 = ((iM55681 ^ i26) * 31177) ^ 1625397413;
                        i12 = -845437713;
                        c14971 = c14971;
                    }
                    int i413 = iM55681 ^ i12;
                    i32 = i8;
                    i28 = i413;
                    i27 = i11;
                    i31 = i7;
                    break;
                case -817700905:
                case 1527270713:
                    c11996.write(bArr, z ? 1 : 0, i30);
                    i29 -= i30;
                    i7 = i31;
                    i8 = i32;
                    iM55681 = C0946.m55979("ۙ֫") ^ i26;
                    i11 = ((iM55681 ^ i25) * (-31105)) ^ 606504837;
                    i12 = -1710066737;
                    c14971 = c14971;
                    int i414 = iM55681 ^ i12;
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
                    if (C1024.m56209() < 0) {
                        i = i31;
                        i2 = i32;
                        c4263 = c4263M8666;
                        i36 = i36;
                        i3 = i38;
                        j = j4;
                        i4 = i29;
                        iM559710 = (C0946.m55979("۟᩺") ^ i25) * (-81);
                        i16 = ((iM559710 ^ i26) * 15567) ^ (-1996802153);
                        i15 = 161488462;
                        i17 = iM559710 ^ i15;
                        c4263M8666 = c4263;
                        i27 = i16;
                        j4 = j;
                        i38 = i3;
                        i29 = i4;
                        i32 = i2;
                        i31 = i;
                        i28 = i17;
                        i36 = i36;
                        c24619 = c24618;
                    } else {
                        iM55680 = (i26 - C0873.m55680("ܿᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM55680 ^ i25) * 25673) ^ 184090284;
                        i6 = 2075339630;
                        i28 = iM55680 ^ i6;
                        i27 = i5;
                    }
                    break;
                case -405138753:
                case -228722353:
                    if (C0863.f81833 <= 0) {
                        i13 = i31;
                        i14 = i32;
                        c4266 = c4263M8666;
                        i36 = i36;
                        i29 = i29;
                        int iM559718 = C0946.m55979("ܺ᩶") ^ i26;
                        int i54 = ((iM559718 ^ i25) * 18349) ^ 1703055301;
                        i19 = iM559718 ^ (-905312630);
                        c4263M8666 = c4266;
                        i27 = i54;
                        i32 = i14;
                        i31 = i13;
                        i28 = i19;
                        i29 = i29;
                        i36 = i36;
                    } else {
                        iM55680 = (i26 - C0873.m55680("ܿᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM55680 ^ i25) * 25673) ^ 184090284;
                        i6 = 2075339630;
                        i28 = iM55680 ^ i6;
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
                    int iM54255 = c24618.m54254() - i38;
                    long j9 = iM54255;
                    if (C0861.f81831) {
                        int iM55686 = (C0873.m55680("᩸ܶ") + i26) * (-107);
                        i34 = iM54255;
                        j4 = j9;
                        i27 = ((iM55686 ^ i25) * (-9243)) ^ 1712833609;
                        i32 = i14;
                        i31 = i13;
                        i28 = iM55686 ^ 152396402;
                    } else {
                        i34 = iM54255;
                        j4 = j9;
                        c4266 = c4263M8666;
                        i36 = i36;
                        i29 = i29;
                        int iM559719 = C0946.m55979("ܺ᩶") ^ i26;
                        int i55 = ((iM559719 ^ i25) * 18349) ^ 1703055301;
                        i19 = iM559719 ^ (-905312630);
                        c4263M8666 = c4266;
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
                    i30 = c24619.read(bArr, z ? 1 : 0, RunnableC0897.m55777(i29, i33));
                    if (i30 >= 0) {
                        iM55680 = (C0946.m55979("۠ᩴ") + i26) * (-119);
                        i5 = ((iM55680 ^ i25) * 11681) ^ 1636304986;
                        i6 = 767398772;
                    } else {
                        iM55680 = C0946.m55979("ᩴۧ") ^ i25;
                        i5 = ((iM55680 ^ i26) * (-23289)) ^ (-972618198);
                        i6 = 141634529;
                    }
                    i28 = iM55680 ^ i6;
                    i27 = i5;
                    break;
                case 93677090:
                case 1335614991:
                    long j10 = length - j5;
                    int i56 = (int) j10;
                    i7 = i31;
                    i8 = i32;
                    if (j10 != i56) {
                        iM55681 = (i26 - C0873.m55680("ܿ᩶")) * (-95);
                        i11 = ((iM55681 ^ i25) * 28447) ^ 819122952;
                        i12 = -54617488;
                        c14971 = c14971;
                        int i415 = iM55681 ^ i12;
                        i32 = i8;
                        i28 = i415;
                        i27 = i11;
                        i31 = i7;
                    } else {
                        i31 = i56;
                        int iM55687 = C0873.m55680("۫ۖ") ^ i25;
                        int i57 = i8;
                        i28 = iM55687 ^ 1336499527;
                        i27 = ((iM55687 ^ i26) * (-3777)) ^ 1583327090;
                        i32 = i57;
                    }
                    break;
                case 144916053:
                case 1184261922:
                    i = i31;
                    i2 = i32;
                    c4263 = c4263M8666;
                    i36 = i36;
                    i3 = i38;
                    j = j4;
                    i4 = i29;
                    c4263M8667 = C4263.m8666(c24618);
                    if (C0992.f81922 >= 0) {
                        iM559710 = (C0946.m55979("۟᩺") ^ i25) * (-81);
                        i16 = ((iM559710 ^ i26) * 15567) ^ (-1996802153);
                        i15 = 161488462;
                    } else {
                        iM559710 = (C0946.m55979("᩵᩵") ^ i25) * (-67);
                        i16 = ((iM559710 ^ i26) * (-19311)) ^ 5390391;
                        i15 = 495748267;
                    }
                    i17 = iM559710 ^ i15;
                    c4263M8666 = c4263;
                    i27 = i16;
                    j4 = j;
                    i38 = i3;
                    i29 = i4;
                    i32 = i2;
                    i31 = i;
                    i28 = i17;
                    i36 = i36;
                    c24619 = c24618;
                    break;
                case 423090020:
                case 1212400405:
                    i7 = i31;
                    i8 = i32;
                    c12469 = new C12469(c24619);
                    iM54254 = c24618.m54254();
                    if (C0949.f81897 < 0) {
                        iM55681 = C0946.m55979("۬ۖ") ^ i25;
                        i11 = ((iM55681 ^ i26) * 18347) ^ 100859162;
                        i12 = 1009009286;
                        c14971 = c14971;
                        int i416 = iM55681 ^ i12;
                        i32 = i8;
                        i28 = i416;
                        i27 = i11;
                        i31 = i7;
                    } else {
                        c4264 = c4263M8666;
                        i36 = i36;
                        i18 = i38;
                        j3 = j4;
                        i29 = i29;
                        c4265 = c4263M8667;
                        int iM5597110 = C0946.m55979("ۧ۟") ^ i26;
                        int i417 = ((iM5597110 ^ i25) * (-1459)) ^ (-1500480717);
                        i17 = iM5597110 ^ 1435433493;
                        c4263M8666 = c4264;
                        c4263M8667 = c4265;
                        i27 = i417;
                        j4 = j3;
                        i38 = i18;
                        i29 = i29;
                        i32 = i8;
                        i31 = i7;
                        c11996 = null;
                        i28 = i17;
                        i36 = i36;
                        c24619 = c24618;
                    }
                    break;
                case 828090752:
                case 2039279130:
                    C0877.m55696();
                    iM55680 = (i26 - C0873.m55680("ܿᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i5 = ((iM55680 ^ i25) * 25673) ^ 184090284;
                    i6 = 2075339630;
                    i28 = iM55680 ^ i6;
                    i27 = i5;
                    break;
                case 1381887635:
                case 1464074654:
                    return c11996.m27464();
                default:
                    C0967.m56074();
                    if (RunnableC1014.f81941 <= 0) {
                        i7 = i31;
                        i8 = i32;
                        j2 = j4;
                        iM55979 = (C0873.m55680("۠ۜ") ^ i26) * (-47);
                        i5 = ((iM55979 ^ i25) * (-24853)) ^ 1571777172;
                        i9 = 2133225716;
                        i10 = iM55979 ^ i9;
                        j4 = j2;
                        i32 = i8;
                        i31 = i7;
                        i28 = i10;
                        i27 = i5;
                    }
                    iM55680 = (i26 - C0873.m55680("ܿᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i5 = ((iM55680 ^ i25) * 25673) ^ 184090284;
                    i6 = 2075339630;
                    i28 = iM55680 ^ i6;
                    i27 = i5;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16820 m38132(C24618 c24618) throws EOFException {
        long length = 0;
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        byte[] bArrM38140 = null;
        C16820 c16820M38138 = null;
        int i3 = -541242456;
        int i4 = C0898.f81858;
        int i5 = C0930.f81879;
        int iM55979 = C0946.m55979("᩺᩷") ^ i5;
        int i6 = ((iM55979 ^ i4) * (-31831)) ^ (-510032698);
        int i7 = -778860839;
        while (true) {
            i3 = ((((i3 ^ i4) * 19425) >> 31) & i6) ^ (iM55979 ^ i7);
            switch (i3) {
                case -1976175164:
                case -1891298264:
                    i2 = 0;
                    if (C1046.m56302() != 0) {
                        iM55979 = C0946.m55979("ۜۢ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 17797) ^ (-2045658628);
                        i7 = -556912885;
                    } else {
                        iM55979 = C0873.m55680("ۖ᩷") ^ i5;
                        i6 = ((iM55979 ^ i4) * 16209) ^ (-914320000);
                        i7 = -793902382;
                    }
                    break;
                case -1926901309:
                case 1657884434:
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0946.m55979("᩹ۤ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-15599)) ^ 909628834;
                        i7 = 2562095;
                    } else {
                        iM55979 = (C0946.m55979("ܶ۟") ^ i4) * 95;
                        i6 = ((iM55979 ^ i5) * 27289) ^ 116510340;
                        i7 = -2135300348;
                    }
                    break;
                case -1819571115:
                case -1025274433:
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("᩵ܰ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-7207)) ^ (-1833969065);
                        i7 = -344942774;
                    } else {
                        iM55979 = C0873.m55680("᩻֫") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-24235)) ^ (-2033311804);
                        i7 = -1005684151;
                    }
                    break;
                case -1421199997:
                case 1397128302:
                    C0861.m55626();
                    return null;
                case -1316517541:
                case 283660016:
                    C1229.m56410();
                    if (C1048.m56305() < 0) {
                        iM55979 = C0946.m55979("᩵ܰ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-7207)) ^ (-1833969065);
                        i7 = -344942774;
                    } else {
                        iM55979 = C0946.m55979("֡۠") ^ i4;
                        i6 = ((iM55979 ^ i5) * 5811) ^ 1251306302;
                        i7 = -1546746092;
                    }
                    break;
                case -1188917259:
                case 781795922:
                    C0927.m55873();
                    RunnableC0871.m55672();
                    iM55979 = C0946.m55979("֡۠") ^ i4;
                    i6 = ((iM55979 ^ i5) * 5811) ^ 1251306302;
                    i7 = -1546746092;
                    break;
                case -1145255917:
                case -470307879:
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("᩹ۤ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-15599)) ^ 909628834;
                        i7 = 2562095;
                    } else {
                        iM55979 = C0946.m55979("֡۠") ^ i4;
                        i6 = ((iM55979 ^ i5) * 5811) ^ 1251306302;
                        i7 = -1546746092;
                    }
                    break;
                case -924141777:
                case -13785070:
                    length = c24618.length();
                    if (C1048.f81963) {
                        iM55979 = C0873.m55680("ۚ۠") ^ i5;
                        i6 = ((iM55979 ^ i4) * 10573) ^ 1363323849;
                        i7 = 1282209186;
                    } else {
                        iM55979 = C0946.m55979("᩹ۤ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-15599)) ^ 909628834;
                        i7 = 2562095;
                    }
                    break;
                case -720693533:
                case 1860811883:
                    i = (int) length;
                    bArr = new byte[i];
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0946.m55979("ᩴ᩶") + i5) * 41;
                        i6 = ((iM55979 ^ i4) * (-31059)) ^ 799273371;
                        i7 = -849622429;
                    } else {
                        iM55979 = C0873.m55680("ܳᩳ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 7195) ^ 1358560326;
                        i7 = -2102326356;
                    }
                    break;
                case -699731131:
                case 1014587937:
                    C1044.m56286();
                    if (C0912.f81867 > 0) {
                        iM55979 = (C0946.m55979("ᩴ᩶") + i5) * 41;
                        i6 = ((iM55979 ^ i4) * (-31059)) ^ 799273371;
                        i7 = -849622429;
                    } else {
                        iM55979 = C0946.m55979("᩹ۤ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-15599)) ^ 909628834;
                        i7 = 2562095;
                    }
                    break;
                case -467512110:
                case 1971327550:
                    bArrM38140 = m38140(c24618);
                    iM55979 = C0873.m55680("᩸ܽ") ^ i4;
                    i6 = ((iM55979 ^ i5) * (-20151)) ^ 666394250;
                    i7 = 820228809;
                    break;
                case -357555921:
                case 1686244653:
                    if (C0927.f81875) {
                        iM55979 = C0946.m55979("᩹ۤ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-15599)) ^ 909628834;
                        i7 = 2562095;
                    } else {
                        iM55979 = C0873.m55680("ۧ֡") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-32395)) ^ (-979743986);
                        i7 = 994477090;
                    }
                    break;
                case -279944044:
                case 485601859:
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0946.m55979("֡۠") ^ i4;
                        i6 = ((iM55979 ^ i5) * 5811) ^ 1251306302;
                        i7 = -1546746092;
                    } else {
                        iM55979 = (C0946.m55979("ۢۤ") ^ i5) * (-105);
                        i6 = ((iM55979 ^ i4) * 2789) ^ (-1965538622);
                        i7 = -581995559;
                    }
                    break;
                case -59209763:
                case 946114244:
                    if (bArrM38140 != null) {
                        iM55979 = (C0873.m55680("֡ܽ") + i5) * (-27);
                        i6 = ((iM55979 ^ i4) * 8361) ^ (-1323514831);
                        i7 = 331843212;
                    } else {
                        iM55979 = C0873.m55680("ۚ᩸") ^ i5;
                        i6 = ((iM55979 ^ i4) * 1513) ^ (-455095750);
                        i7 = 164624721;
                    }
                    break;
                case -32273083:
                case 2001772490:
                    c24618.m54256(bArr, i2, i);
                    return m38138(bArr);
                case 36964022:
                case 1942895685:
                    try {
                        c16820M38138 = m38138(bArrM38140);
                        iM55979 = (i4 - C0873.m55680("᩷۬")) * (-71);
                        i6 = ((iM55979 ^ i5) * 2971) ^ (-1599438498);
                        i7 = -1709582758;
                    } catch (Throwable unused) {
                        iM55979 = C0873.m55680("ۚ᩸") ^ i5;
                        i6 = ((iM55979 ^ i4) * 1513) ^ (-455095750);
                        i7 = 164624721;
                    }
                    break;
                case 157434613:
                case 2084110787:
                    if (C1025.m56230()) {
                        iM55979 = C0946.m55979("᩵ܰ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-7207)) ^ (-1833969065);
                        i7 = -344942774;
                    } else {
                        iM55979 = (i4 - C0946.m55979("᩹֡")) * 13;
                        i6 = ((iM55979 ^ i5) * (-7195)) ^ 1932453707;
                        i7 = 900461292;
                    }
                    break;
                case 479456169:
                case 1528929644:
                    if (length > 52428800) {
                        iM55979 = (C0873.m55680("᩺ۨ") + i4) * (-101);
                        i6 = ((iM55979 ^ i5) * 27825) ^ 1733253288;
                        i7 = 1182807712;
                    } else {
                        iM55979 = C0946.m55979("᩹ܳ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-14971)) ^ (-749891076);
                        i7 = -72004401;
                    }
                    break;
                case 622288010:
                case 868374640:
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0946.m55979("֡۠") ^ i4;
                        i6 = ((iM55979 ^ i5) * 5811) ^ 1251306302;
                        i7 = -1546746092;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ܶۗ")) * (-119);
                        i6 = ((iM55979 ^ i4) * 26203) ^ 347865920;
                        i7 = -1456281303;
                    }
                    break;
                case 661812857:
                case 698634147:
                    c24618.seek(0L);
                    iM55979 = C0946.m55979("᩹ܳ") ^ i5;
                    i6 = ((iM55979 ^ i4) * (-14971)) ^ (-749891076);
                    i7 = -72004401;
                    break;
                case 1046387265:
                case 2072438368:
                    return c16820M38138;
                default:
                    if (C0854.m55595() >= 0) {
                        iM55979 = C0946.m55979("֡۠") ^ i4;
                        i6 = ((iM55979 ^ i5) * 5811) ^ 1251306302;
                        i7 = -1546746092;
                    } else {
                        iM55979 = (C0873.m55680("ᩴۙ") + i4) * (-27);
                        i6 = ((iM55979 ^ i5) * (-11283)) ^ (-1713806335);
                        i7 = -1976534124;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m38136(long j, InputStream inputStream) {
        int i = -451798699;
        int i2 = ViewOnClickListenerC0939.f81888;
        int i3 = C0877.f81843;
        int iM55979 = (i3 - C0946.m55979("ۙ᩹")) * (-79);
        int i4 = ((iM55979 ^ i2) * (-31193)) ^ 637323927;
        int i5 = 1833375173;
        while (true) {
            i = ((((i ^ i2) * 19847) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2042522090:
                case -1536661250:
                    RunnableC0897.m55784();
                    RunnableC0871.m55672();
                    iM55979 = (C0946.m55979("ܿۧ") + i2) * 19;
                    i4 = ((iM55979 ^ i3) * 17055) ^ 397460828;
                    i5 = 1056773426;
                    break;
                case -1912335154:
                case -1400086150:
                    return false;
                case -1770535313:
                case 695212268:
                    if (C1048.f81963) {
                        iM55979 = C0873.m55680("ۤ۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15251) ^ (-1190971689);
                        i5 = -1451622795;
                    } else {
                        iM55979 = (C0946.m55979("ܿۧ") + i2) * 19;
                        i4 = ((iM55979 ^ i3) * 17055) ^ 397460828;
                        i5 = 1056773426;
                    }
                    break;
                case -1722119863:
                case 444752874:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = C0946.m55979("ۖ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2197)) ^ 1008997683;
                        i5 = 1626056661;
                    } else {
                        iM55979 = C0873.m55680("ۧۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 15529) ^ 666063321;
                        i5 = -1488986607;
                    }
                    break;
                case -1484487287:
                case 2024246152:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0946.m55979("ܳ֡") ^ i2) * (-51);
                        i4 = ((iM55979 ^ i3) * (-4059)) ^ 1154839643;
                        i5 = -921145984;
                    } else {
                        iM55979 = (C0946.m55979("֡ᩳ") + i3) * 27;
                        i4 = ((iM55979 ^ i2) * 20099) ^ 1307301574;
                        i5 = -127692031;
                    }
                    break;
                case -1480926805:
                case -334992292:
                    return m38137(new C9313(inputStream));
                case -1405652825:
                case 2041168230:
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0946.m55979("ۖ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2197)) ^ 1008997683;
                        i5 = 1626056661;
                    } else {
                        iM55979 = C0873.m55680("ܳۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16039) ^ (-722746927);
                        i5 = 2062970134;
                    }
                    break;
                case -1381533448:
                case 225063550:
                    C1017.m56187();
                    if (C1053.f81965 > 0) {
                        iM55979 = (C0946.m55979("ܳ֡") ^ i2) * (-51);
                        i4 = ((iM55979 ^ i3) * (-4059)) ^ 1154839643;
                        i5 = -921145984;
                    } else {
                        iM55979 = (C0946.m55979("ۛۜ") + i3) * 83;
                        i4 = ((iM55979 ^ i2) * (-4311)) ^ 1335192861;
                        i5 = -2021327068;
                    }
                    break;
                case -518387788:
                case -99655276:
                    if (C0906.m55809() <= 0) {
                        iM55979 = (C0946.m55979("ۛۜ") + i3) * 83;
                        i4 = ((iM55979 ^ i2) * (-4311)) ^ 1335192861;
                        i5 = -2021327068;
                    } else {
                        iM55979 = (i2 - C0946.m55979("۠ۛ")) * 27;
                        i4 = ((iM55979 ^ i3) * 18147) ^ 600142714;
                        i5 = 1939631859;
                    }
                    break;
                case -170453526:
                case 1198258697:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0946.m55979("ܳ֡") ^ i2) * (-51);
                        i4 = ((iM55979 ^ i3) * (-4059)) ^ 1154839643;
                        i5 = -921145984;
                    } else {
                        iM55979 = C0946.m55979("᩻ۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 26547) ^ (-231704995);
                        i5 = -210880892;
                    }
                    break;
                case -169712667:
                case 869491430:
                    if (C1046.m56302() != 0) {
                        iM55979 = (C0946.m55979("ۛۜ") + i3) * 83;
                        i4 = ((iM55979 ^ i2) * (-4311)) ^ 1335192861;
                        i5 = -2021327068;
                    } else {
                        iM55979 = (C0946.m55979("ܿۧ") + i2) * 19;
                        i4 = ((iM55979 ^ i3) * 17055) ^ 397460828;
                        i5 = 1056773426;
                    }
                    break;
                case -44399047:
                case 582791021:
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0946.m55979("ۛۜ") + i3) * 83;
                        i4 = ((iM55979 ^ i2) * (-4311)) ^ 1335192861;
                        i5 = -2021327068;
                    } else {
                        iM55979 = C0873.m55680("֫ۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 18817) ^ (-329157840);
                        i5 = -607388388;
                    }
                    break;
                case 4934175:
                case 961795987:
                    C1036.m56257();
                    return false;
                case 534274292:
                case 1203008168:
                    if (j < 108) {
                        iM55979 = C0873.m55680("ۧۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21225) ^ (-1495361084);
                        i5 = 4968969;
                    } else {
                        iM55979 = C0873.m55680("ۘۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26433) ^ 1501853460;
                        i5 = -208034155;
                    }
                    break;
                case 785723173:
                case 1077298422:
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0946.m55979("ۖ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2197)) ^ 1008997683;
                        i5 = 1626056661;
                    } else {
                        iM55979 = C0873.m55680("ۗ֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-27467)) ^ 825701940;
                        i5 = -1798463418;
                    }
                    break;
                case 885578345:
                case 1933994001:
                    if (C0917.m55854()) {
                        iM55979 = (C0946.m55979("ܳ֡") ^ i2) * (-51);
                        i4 = ((iM55979 ^ i3) * (-4059)) ^ 1154839643;
                        i5 = -921145984;
                    } else {
                        iM55979 = (C0873.m55680("᩺ܳ") + i3) * (-15);
                        i4 = ((iM55979 ^ i2) * (-19157)) ^ (-1540231123);
                        i5 = 76254286;
                    }
                    break;
                case 1434734989:
                case 1728221979:
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0946.m55979("ۛۜ") + i3) * 83;
                        i4 = ((iM55979 ^ i2) * (-4311)) ^ 1335192861;
                        i5 = -2021327068;
                    } else {
                        iM55979 = (C0873.m55680("᩹᩷") + i2) * 51;
                        i4 = ((iM55979 ^ i3) * 22537) ^ (-420520863);
                        i5 = -2069265434;
                    }
                    break;
                default:
                    if (C1071.m56343() != 0) {
                        iM55979 = C0946.m55979("ۖ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2197)) ^ 1008997683;
                        i5 = 1626056661;
                    } else {
                        iM55979 = C0946.m55979("۫ܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 30879) ^ 798242247;
                        i5 = 328665904;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:57:0x016e  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c3  */
    /* JADX INFO: renamed from: ֫ */
    public final byte[] m38146(C14281 c14281) throws IOException {
        int iM55979;
        int i;
        XmlPullParserException e = null;
        byte[] bArrM30611 = null;
        int i2 = -1173325035;
        int i3 = C0898.f81858;
        int i4 = RunnableC0871.f81839;
        int iM559710 = (i3 - C0946.m55979("ܿܺ")) * (-43);
        int i5 = ((iM559710 ^ i4) * (-19461)) ^ (-244383208);
        int i6 = -1974427694;
        while (true) {
            int i7 = iM559710 ^ i6;
            ByteArrayInputStream byteArrayInputStream = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-21023)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2007194122:
                    case 1254531242:
                        if (C0992.m56107() <= 0) {
                            iM55979 = C0873.m55680("᩹ܳ") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-31693)) ^ 293886684;
                            i = 18023821;
                        } else {
                            iM55979 = (C0873.m55680("ۘۚ") ^ i3) * (-47);
                            i5 = ((iM55979 ^ i4) * 20709) ^ 1011918901;
                            i = -1242198424;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -1988163799:
                    case -193793040:
                        if (!AbstractC0942.m55971()) {
                            iM55979 = C0946.m55979("֡ۗ") ^ i3;
                            i5 = ((iM55979 ^ i4) * 22699) ^ 731048861;
                            i = -791986794;
                            i7 = iM55979 ^ i;
                        } else {
                            iM559710 = C0873.m55680("ۢ۬") ^ i4;
                            i5 = ((iM559710 ^ i3) * (-19877)) ^ (-2100719298);
                            i6 = -1313929415;
                        }
                        break;
                    case -1793388060:
                    case 160709023:
                        C0861.m55626();
                        if (ServiceConnectionC1013.f81940 >= 0) {
                            iM559710 = C0946.m55979("᩺۬") ^ i3;
                            i5 = ((iM559710 ^ i4) * (-27523)) ^ (-990486189);
                            i6 = -1194987745;
                        }
                        iM55979 = C0873.m55680("ۧ֫") ^ i4;
                        i5 = ((iM55979 ^ i3) * 30041) ^ (-474632642);
                        i = -408519237;
                        i7 = iM55979 ^ i;
                        break;
                    case -1536257446:
                    case 774773969:
                        C0894.m55769();
                        return null;
                    case -1337797787:
                    case 335114551:
                        ServiceConnectionC1013.m56157();
                        iM55979 = C0873.m55680("ۢ᩸") ^ i3;
                        i5 = ((iM55979 ^ i4) * 10325) ^ (-1599730866);
                        i = -1393919420;
                        i7 = iM55979 ^ i;
                        break;
                    case -1301501861:
                    case 1073763387:
                        throw new IOException(e);
                    case -1022623540:
                    case 2009796056:
                        return bArrM30611;
                    case -905207528:
                    case 1841494456:
                        if (RunnableC0938.f81886 >= 0) {
                            iM55979 = C0873.m55680("ۢ᩸") ^ i3;
                            i5 = ((iM55979 ^ i4) * 10325) ^ (-1599730866);
                            i = -1393919420;
                        } else {
                            iM55979 = (C0873.m55680("᩷ᩳ") + i4) * C0254q.f1218h;
                            i5 = ((iM55979 ^ i3) * (-15805)) ^ 948702041;
                            i = -1175061463;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -827099631:
                    case 464076003:
                        if (AbstractC0942.f81890 <= 0) {
                            iM55979 = C0873.m55680("ۧ֫") ^ i4;
                            i5 = ((iM55979 ^ i3) * 30041) ^ (-474632642);
                            i = -408519237;
                        } else {
                            iM55979 = C0946.m55979("ܳ۠") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-20285)) ^ 1724068039;
                            i = -1164066302;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -665874680:
                    case 21758766:
                        m38141(c14281);
                        if (RunnableC0897.f81856) {
                            iM55979 = (C0873.m55680("۠᩻") ^ i4) * (-109);
                            i5 = ((iM55979 ^ i3) * (-18873)) ^ (-1988515838);
                            i = -1707319246;
                        } else {
                            iM55979 = C0873.m55680("ۢ᩸") ^ i3;
                            i5 = ((iM55979 ^ i4) * 10325) ^ (-1599730866);
                            i = -1393919420;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -630261630:
                    case 1769867790:
                        if (C0882.f81846) {
                            iM55979 = C0873.m55680("ۧ֫") ^ i4;
                            i5 = ((iM55979 ^ i3) * 30041) ^ (-474632642);
                            i = -408519237;
                        } else {
                            iM55979 = C0946.m55979("ۨܳ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 24157) ^ (-459545664);
                            i = -1943993251;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -596156832:
                    case -366577170:
                        byte[] bArr = this.f49793;
                        if (!C1024.f81946) {
                            int length = bArr.length;
                            int i8 = this.f49794;
                            if (C0854.f81826 == 0) {
                                byteArrayInputStream = new ByteArrayInputStream(bArr, i8, length - i8);
                                iM55979 = C0946.m55979("ܶۜ") ^ i4;
                                i5 = ((iM55979 ^ i3) * 15465) ^ (-2012434334);
                                i = -1914507953;
                                i7 = iM55979 ^ i;
                            } else {
                                iM559710 = C0946.m55979("᩺۬") ^ i3;
                                i5 = ((iM559710 ^ i4) * (-27523)) ^ (-990486189);
                                i6 = -1194987745;
                            }
                        } else {
                            iM559710 = C0873.m55680("ۢ۬") ^ i4;
                            i5 = ((iM559710 ^ i3) * (-19877)) ^ (-2100719298);
                            i6 = -1313929415;
                        }
                        break;
                    case -465645939:
                    case 337245318:
                        try {
                            bArrM30611 = new C13469(byteArrayInputStream, this.f49796).m30611();
                            iM55979 = C0873.m55680("ۗۚ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 12655) ^ (-545507800);
                            i = 1526146432;
                        } catch (XmlPullParserException e2) {
                            e = e2;
                            iM55979 = C0946.m55979("᩺ܺ") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-22719)) ^ 1644884807;
                            i = -1158966381;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 366618297:
                    case 2073521541:
                        if (C0927.m55873() > 0) {
                            iM55979 = (i3 - C0946.m55979("֫ܽ")) * 51;
                            i5 = ((iM55979 ^ i4) * (-4115)) ^ (-335166256);
                            i = 1180428626;
                            i7 = iM55979 ^ i;
                        } else {
                            iM559710 = C0873.m55680("ۢ۬") ^ i4;
                            i5 = ((iM559710 ^ i3) * (-19877)) ^ (-2100719298);
                            i6 = -1313929415;
                        }
                        break;
                    case 676603100:
                    case 1370591261:
                        if (C0845.f81821 >= 0) {
                            iM55979 = C0873.m55680("ۧ֫") ^ i4;
                            i5 = ((iM55979 ^ i3) * 30041) ^ (-474632642);
                            i = -408519237;
                        } else {
                            iM55979 = C0873.m55680("᩹ܳ") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-31693)) ^ 293886684;
                            i = 18023821;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 761494085:
                    case 2120047024:
                        if (C0992.f81922 >= 0) {
                            iM559710 = C0946.m55979("᩺۬") ^ i3;
                            i5 = ((iM559710 ^ i4) * (-27523)) ^ (-990486189);
                            i6 = -1194987745;
                        }
                        iM55979 = C0873.m55680("ۢ᩸") ^ i3;
                        i5 = ((iM55979 ^ i4) * 10325) ^ (-1599730866);
                        i = -1393919420;
                        i7 = iM55979 ^ i;
                        break;
                    default:
                        if (C1044.f81959 < 0) {
                            iM55979 = (C0873.m55680("֫ܶ") ^ i3) * (-69);
                            i5 = ((iM55979 ^ i4) * (-10007)) ^ (-757387570);
                            i = 2117591177;
                            i7 = iM55979 ^ i;
                        } else {
                            iM559710 = C0946.m55979("᩺۬") ^ i3;
                            i5 = ((iM559710 ^ i4) * (-27523)) ^ (-990486189);
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
    /* JADX INFO: renamed from: ֫ */
    public final byte[] m38145() {
        int iM55979;
        int i;
        short s = 0;
        boolean z = false;
        C20689 c20689 = null;
        C14971 c14971 = null;
        byte[] bArr = null;
        int length = 0;
        int i2 = 0;
        int size = 0;
        int i3 = 2066054383;
        int i4 = C1229.f82066;
        int i5 = ViewOnClickListenerC0939.f81888;
        int iM55680 = C0873.m55680("ܳ֡") ^ i5;
        int i6 = ((iM55680 ^ i4) * 27023) ^ 764416000;
        int i7 = 481884764;
        while (true) {
            int i8 = iM55680 ^ i7;
            C11996 c11996 = null;
            while (true) {
                i3 = ((((i3 ^ i4) * (-32021)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2036036405:
                    case -1052776773:
                        c11996.mo15111(s);
                        c11996.mo15111((short) 8);
                        if (C0861.m55626()) {
                            iM55979 = (C0946.m55979("ۘ۟") ^ i5) * (-89);
                            i6 = ((iM55979 ^ i4) * 10203) ^ (-1350993491);
                            i = 575644947;
                        } else {
                            iM55979 = C0873.m55680("᩶᩹") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-30337)) ^ (-227172261);
                            i = 101401585;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -1673167469:
                    case 1378593029:
                        c11996.skipBytes(4);
                        z = true;
                        if (C0947.f81895) {
                            iM55979 = C0873.m55680("᩹۫") ^ i4;
                            i6 = ((iM55979 ^ i5) * 7253) ^ 510486127;
                            i = 2004935707;
                        } else {
                            iM55979 = (C0946.m55979("ۙ۬") + i4) * (-51);
                            i6 = ((iM55979 ^ i5) * 19129) ^ (-1529902053);
                            i = 1554868031;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -1647335613:
                    case -1645777597:
                        C1024.m56209();
                        if (C1046.f81962 > 0) {
                            iM55979 = C0873.m55680("᩶᩸") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-14595)) ^ (-1974609396);
                            i = 126992722;
                        } else {
                            iM55979 = C0873.m55680("᩹۫") ^ i4;
                            i6 = ((iM55979 ^ i5) * 7253) ^ 510486127;
                            i = 2004935707;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -1635606200:
                    case 305961014:
                        i2 = this.f49794;
                        if (C0892.m55749()) {
                            iM55979 = (C0946.m55979("᩷ܰ") ^ i5) * (-51);
                            i6 = ((iM55979 ^ i4) * (-18643)) ^ (-2032504736);
                            i = 1847298064;
                        } else {
                            iM55979 = C0873.m55680("᩹۫") ^ i4;
                            i6 = ((iM55979 ^ i5) * 7253) ^ 510486127;
                            i = 2004935707;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -1397165349:
                    case 1402714182:
                        c11996.write(bArr, i2, length - i2);
                        if (C1036.f81953 < 0) {
                            iM55979 = (i4 - C0873.m55680("ᩴۙ")) * (-103);
                            i6 = ((iM55979 ^ i5) * 7275) ^ 1605751225;
                            i = -2004564105;
                            i8 = iM55979 ^ i;
                        }
                        break;
                    case -1102823285:
                    case 572019384:
                        C1964.m56589(c11996, size);
                        return c11996.m27464();
                    case -1073702485:
                    case -965535026:
                        if (C0989.m56095() <= 0) {
                            iM55979 = C0873.m55680("᩶᩸") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-14595)) ^ (-1974609396);
                            i = 126992722;
                        } else {
                            iM55979 = C0873.m55680("ܶ۠") ^ i5;
                            i6 = ((iM55979 ^ i4) * 15723) ^ 347634329;
                            i = 154011987;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -797941619:
                    case 536310155:
                        c20689 = null;
                        c14971 = this.f49796;
                        if (C1124.f82007 < 0) {
                            iM55979 = (C0946.m55979("۟ۡ") + i4) * 35;
                            i6 = ((iM55979 ^ i5) * 2431) ^ (-1697656630);
                            i = -2089683626;
                            i8 = iM55979 ^ i;
                        }
                        break;
                    case -504785435:
                    case -56138069:
                        c11996.seek(4L);
                        size = c11996.size();
                        if (C0989.f81920 >= 0) {
                            iM55979 = C0873.m55680("ܶ۠") ^ i5;
                            i6 = ((iM55979 ^ i4) * 15723) ^ 347634329;
                            i = 154011987;
                        } else {
                            iM55979 = C0873.m55680("᩹۬") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-2519)) ^ 915251816;
                            i = 263700063;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -449651863:
                    case 1722499611:
                        C0955.m56025();
                        if (C0906.m55809() <= 0) {
                            iM55979 = C0873.m55680("᩶᩸") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-14595)) ^ (-1974609396);
                            i = 126992722;
                        } else {
                            iM55979 = (C0946.m55979("ۘ۟") ^ i5) * (-89);
                            i6 = ((iM55979 ^ i4) * 10203) ^ (-1350993491);
                            i = 575644947;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case 705445697:
                    case 1404119975:
                        C0898.m55800();
                        return null;
                    case 1060083785:
                    case 1561152270:
                        C0949.m56012();
                        C1964.m56597();
                        iM55979 = C0873.m55680("᩶᩸") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-14595)) ^ (-1974609396);
                        i = 126992722;
                        i8 = iM55979 ^ i;
                        break;
                    case 1174997383:
                    case 1218165413:
                        if (ViewOnClickListenerC0939.f81888 > 0) {
                            c11996 = new C11996();
                            if (C0894.m55769() < 0) {
                                iM55979 = (i5 - C0946.m55979("ۨ֨")) * (-53);
                                i6 = ((iM55979 ^ i4) * (-15897)) ^ (-1081721802);
                                i = -91775855;
                                i8 = iM55979 ^ i;
                            }
                        }
                        break;
                    case 1850467276:
                    case 1983010956:
                        s = 3;
                        if (C1003.f81929 <= 0) {
                            iM55979 = C0873.m55680("ܶ۠") ^ i5;
                            i6 = ((iM55979 ^ i4) * 15723) ^ 347634329;
                            i = 154011987;
                        } else {
                            iM55979 = C0946.m55979("᩺۠") ^ i4;
                            i6 = ((iM55979 ^ i5) * 13353) ^ 1732865590;
                            i = 1892423770;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    default:
                        c14971.m34279(c11996, z, c20689);
                        bArr = this.f49793;
                        length = bArr.length;
                        if (C0917.f81868) {
                            iM55979 = C0873.m55680("ܶ۠") ^ i5;
                            i6 = ((iM55979 ^ i4) * 15723) ^ 347634329;
                            i = 154011987;
                        } else {
                            iM55979 = (i5 - C0873.m55680("ۖᩳ")) * 69;
                            i6 = ((iM55979 ^ i4) * (-13083)) ^ 1307289991;
                            i = -1083728908;
                        }
                        i8 = iM55979 ^ i;
                        break;
                }
            }
            iM55680 = (i4 - C0946.m55979("ۤۖ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
            i6 = ((iM55680 ^ i5) * (-7705)) ^ (-1865489020);
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
    /* JADX INFO: renamed from: ֫ */
    public static boolean m38137(C9313 c9313) {
        int iM55680;
        int i;
        int i2;
        short s = 0;
        boolean z = false;
        int iM21552 = 0;
        int i3 = 0;
        int iM21553 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        int iM21554 = 0;
        int iM21555 = 0;
        int i6 = 78215830;
        int i7 = C1964.f83032;
        int i8 = C0877.f81843;
        int iM55979 = (i8 - C0946.m55979("ۛۗ")) * 53;
        int i9 = ((iM55979 ^ i7) * 19597) ^ (-4976943);
        int i10 = iM55979 ^ (-1926270220);
        boolean z3 = false;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * 1121) >> 31));
            switch (i6) {
                case -1974360091:
                case 1071376480:
                    if (z2) {
                        iM55680 = C0873.m55680("᩹ܰ") ^ i7;
                        i = ((iM55680 ^ i8) * (-23381)) ^ (-1182174910);
                        i2 = -1990384705;
                    } else {
                        iM55680 = (i8 - C0873.m55680("ܿ۫")) * 5;
                        i = ((iM55680 ^ i7) * 2757) ^ (-1153880753);
                        i2 = -1633799801;
                    }
                    int i11 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11;
                    break;
                case -1783489405:
                case 550588900:
                    i3 = iM21552 - 4;
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0946.m55979("ۚۤ") ^ i7;
                        i = ((iM55680 ^ i8) * 1547) ^ 1442702666;
                        i2 = -983299829;
                    } else {
                        iM55680 = C0946.m55979("ۡ᩸") ^ i8;
                        i = ((iM55680 ^ i7) * 1743) ^ (-1284488433);
                        i2 = 1155693782;
                    }
                    int i12 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i12;
                    break;
                case -1742657410:
                case 1580216445:
                    C1124.m56367();
                    if (C1044.f81959 < 0) {
                        iM55680 = C0946.m55979("ۚ᩷") ^ i7;
                        i = ((iM55680 ^ i8) * 25777) ^ (-10331716);
                        i2 = 1270890365;
                    } else {
                        iM55680 = C0946.m55979("ۚۤ") ^ i7;
                        i = ((iM55680 ^ i8) * 1547) ^ 1442702666;
                        i2 = -983299829;
                    }
                    int i13 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i13;
                    break;
                case -1686409358:
                case -509129688:
                    i4 = MLKEMEngine.KyberPolyBytes;
                    i5 = 2;
                    if (iM21553 == z) {
                        iM55680 = (C0946.m55979("֫ۚ") + i7) * 73;
                        i = ((iM55680 ^ i8) * (-11207)) ^ (-1032848926);
                        i2 = 1646980578;
                    } else {
                        iM55680 = (C0873.m55680("ۙ᩻") ^ i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55680 ^ i7) * 10869) ^ (-2013854262);
                        i2 = -1194398540;
                    }
                    int i14 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i14;
                    break;
                case -1617693592:
                case -512089607:
                    c9313.skipBytes(i5);
                    c9313.skipBytes(c9313.readInt() - 8);
                    iM21554 = c9313.m21552();
                    iM55680 = (C0946.m55979("֡֫") + i8) * 37;
                    i = ((iM55680 ^ i7) * 32269) ^ 1070277402;
                    i2 = -1919794505;
                    int i15 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i15;
                    break;
                case -1577079221:
                case 1802739069:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("֡᩸") ^ i8;
                        i = ((iM55680 ^ i7) * 25911) ^ (-1051804278);
                        i2 = -1765946650;
                    } else {
                        iM55680 = C0873.m55680("ۖ֡") ^ i7;
                        i = ((iM55680 ^ i8) * (-4015)) ^ 1551008416;
                        i2 = -2007375024;
                    }
                    int i16 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i16;
                    break;
                case -1524297907:
                case -83602989:
                    if (iM21553 == i4) {
                        iM55680 = (i7 - C0873.m55680("֨ᩳ")) * (-97);
                        i = ((iM55680 ^ i8) * (-28455)) ^ (-614318276);
                        i2 = 181742976;
                    } else {
                        iM55680 = (C0946.m55979("ۘ᩶") ^ i7) * 85;
                        i = ((iM55680 ^ i8) * (-6675)) ^ 704968267;
                        i2 = -972612414;
                    }
                    int i17 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i17;
                    break;
                case -1519809230:
                case -155835721:
                    c9313.skipBytes(i3);
                    iM21553 = c9313.m21552();
                    iM55680 = C0873.m55680("֫ᩴ") ^ i7;
                    i = ((iM55680 ^ i8) * 7997) ^ (-588310175);
                    i2 = -733708062;
                    int i18 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i18;
                    break;
                case -1248308530:
                case -81948927:
                    z3 = false;
                    iM55680 = C0873.m55680("֨۫") ^ i7;
                    i = ((iM55680 ^ i8) * (-8381)) ^ (-1186515340);
                    i2 = 719269357;
                    int i19 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i19;
                    break;
                case -1219386252:
                case -894596740:
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0946.m55979("ۚᩳ") ^ i8) * (-87);
                        i = ((iM55680 ^ i7) * (-25893)) ^ 1542731133;
                        i2 = -494568355;
                    } else {
                        iM55680 = C0873.m55680("ᩳ᩶") ^ i8;
                        i = ((iM55680 ^ i7) * (-26307)) ^ 210185693;
                        i2 = -1738556027;
                    }
                    int i110 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i110;
                    break;
                case -1201603244:
                case -259533662:
                    if (C0894.m55769() < 0) {
                        iM55680 = C0946.m55979("ۚ᩷") ^ i7;
                        i = ((iM55680 ^ i8) * 25777) ^ (-10331716);
                        i2 = 1270890365;
                    } else {
                        iM55680 = C0946.m55979("ᩴܶ") ^ i8;
                        i = ((iM55680 ^ i7) * (-259)) ^ 214010628;
                        i2 = -632878613;
                    }
                    int i111 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i111;
                    break;
                case -1199822505:
                case 734467891:
                    z = true;
                    if (s != 3) {
                        iM55680 = C0873.m55680("᩷۟") ^ i8;
                        i = ((iM55680 ^ i7) * (-20857)) ^ (-2042800243);
                        i2 = -638528602;
                    } else {
                        iM55680 = C0873.m55680("᩹ۛ") ^ i8;
                        i = ((iM55680 ^ i7) * 29271) ^ (-368449189);
                        i2 = -1356512620;
                    }
                    int i112 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i112;
                    break;
                case -1195250257:
                case -438463818:
                    C1017.m56187();
                    if (C0882.f81846) {
                        iM55680 = C0946.m55979("ۚ᩷") ^ i7;
                        i = ((iM55680 ^ i8) * 25777) ^ (-10331716);
                        i2 = 1270890365;
                    } else {
                        iM55680 = C0946.m55979("֡᩸") ^ i8;
                        i = ((iM55680 ^ i7) * 25911) ^ (-1051804278);
                        i2 = -1765946650;
                    }
                    int i113 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i113;
                    break;
                case -1128456565:
                case 1859650474:
                    c9313.skipBytes(i5);
                    c9313.skipBytes(c9313.readInt() - 8);
                    iM21555 = c9313.m21552();
                    iM55680 = C0873.m55680("ۙ᩶") ^ i8;
                    i = ((iM55680 ^ i7) * (-9829)) ^ 2120179425;
                    i2 = 1577227638;
                    int i114 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i114;
                    break;
                case -1128102643:
                case 37923943:
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("ۡۘ") ^ i8;
                        i = ((iM55680 ^ i7) * 14145) ^ (-95661183);
                        i2 = -729989201;
                    } else {
                        iM55680 = (i8 - C0946.m55979("᩹᩵")) * (-117);
                        i = ((iM55680 ^ i7) * (-16955)) ^ (-1677041267);
                        i2 = 1379251641;
                    }
                    int i115 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i115;
                    break;
                case -1111868360:
                case 1956353181:
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0873.m55680("᩹ܶ") ^ i7) * (-99);
                        i = ((iM55680 ^ i8) * (-5003)) ^ (-1553584300);
                        i2 = 1954046331;
                    } else {
                        iM55680 = (i8 - C0946.m55979("᩶ۖ")) * (-13);
                        i = ((iM55680 ^ i7) * 16425) ^ 188918542;
                        i2 = 2061969450;
                    }
                    int i116 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i116;
                    break;
                case -1034915435:
                case -966664879:
                    C0898.m55800();
                    if (C0854.f81826 == 0) {
                        iM55680 = C0946.m55979("ۚ᩷") ^ i7;
                        i = ((iM55680 ^ i8) * 25777) ^ (-10331716);
                        i2 = 1270890365;
                    } else {
                        iM55680 = C0946.m55979("ۗ᩻") ^ i8;
                        i = ((iM55680 ^ i7) * (-27343)) ^ (-2288573);
                        i2 = 915282230;
                    }
                    int i117 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i117;
                    break;
                case -900911818:
                case -191704289:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = C0946.m55979("ۗ᩻") ^ i8;
                        i = ((iM55680 ^ i7) * (-27343)) ^ (-2288573);
                        i2 = 915282230;
                    } else {
                        iM55680 = C0873.m55680("ۧᩴ") ^ i7;
                        i = ((iM55680 ^ i8) * (-30471)) ^ 2021432895;
                        i2 = -139229413;
                    }
                    int i118 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i118;
                    break;
                case -800235050:
                case -421771610:
                    if (iM21555 == i4) {
                        iM55680 = (i8 - C0873.m55680("ܿ۫")) * 5;
                        i = ((iM55680 ^ i7) * 2757) ^ (-1153880753);
                        i2 = -1633799801;
                    } else {
                        iM55680 = (C0946.m55979("ۘ᩶") ^ i7) * 85;
                        i = ((iM55680 ^ i8) * (-6675)) ^ 704968267;
                        i2 = -972612414;
                    }
                    int i119 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i119;
                    break;
                case -798451508:
                case 2116278083:
                    C0892.m55749();
                    return false;
                case -714443743:
                case -396536717:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("ۚᩳ") ^ i8) * (-87);
                        i = ((iM55680 ^ i7) * (-25893)) ^ 1542731133;
                        i2 = -494568355;
                    } else {
                        iM55680 = (i7 - C0946.m55979("᩻ܰ")) * (-9);
                        i = ((iM55680 ^ i8) * (-22617)) ^ 1476269993;
                        i2 = 1474105512;
                    }
                    int i1110 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1110;
                    break;
                case -472760390:
                case 1291636330:
                    if (C0947.f81895) {
                        iM55680 = C0946.m55979("ۚۤ") ^ i7;
                        i = ((iM55680 ^ i8) * 1547) ^ 1442702666;
                        i2 = -983299829;
                    } else {
                        iM55680 = C0946.m55979("۫ۗ") ^ i7;
                        i = ((iM55680 ^ i8) * 27755) ^ 199183236;
                        i2 = 2043912306;
                    }
                    int i1111 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1111;
                    break;
                case -166055836:
                case 581643587:
                    return z3;
                case -79032775:
                case 1079422265:
                    C0967.m56074();
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0946.m55979("ۗ᩻") ^ i8;
                        i = ((iM55680 ^ i7) * (-27343)) ^ (-2288573);
                        i2 = 915282230;
                    } else {
                        iM55680 = C0946.m55979("ܺ۟") ^ i7;
                        i = ((iM55680 ^ i8) * 30201) ^ (-1487772310);
                        i2 = -5321424;
                    }
                    int i1112 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1112;
                    break;
                case -54518067:
                case 53638747:
                    if (RunnableC0897.f81856) {
                        iM55680 = (C0946.m55979("᩸ܺ") ^ i8) * 101;
                        i = ((iM55680 ^ i7) * 7139) ^ (-1485223142);
                        i2 = -245159718;
                    } else {
                        iM55680 = C0946.m55979("ۚۤ") ^ i7;
                        i = ((iM55680 ^ i8) * 1547) ^ 1442702666;
                        i2 = -983299829;
                    }
                    int i1113 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1113;
                    break;
                case 58403188:
                case 560554763:
                    z2 = false;
                    iM55680 = (i7 - C0873.m55680("ۡۧ")) * 7;
                    i = ((iM55680 ^ i8) * (-25683)) ^ (-1309277573);
                    i2 = -1303906210;
                    int i1114 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1114;
                    break;
                case 254017924:
                case 1472000755:
                    z2 = true;
                    iM55680 = (i7 - C0873.m55680("ۡۧ")) * 7;
                    i = ((iM55680 ^ i8) * (-25683)) ^ (-1309277573);
                    i2 = -1303906210;
                    int i1115 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1115;
                    break;
                case 352533823:
                case 1278245853:
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0946.m55979("֡᩸") ^ i8;
                        i = ((iM55680 ^ i7) * 25911) ^ (-1051804278);
                        i2 = -1765946650;
                    } else {
                        iM55680 = C0946.m55979("ۘ۟") ^ i8;
                        i = ((iM55680 ^ i7) * (-4669)) ^ (-347544419);
                        i2 = -449029017;
                    }
                    int i1116 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1116;
                    break;
                case 370403835:
                case 874332239:
                    if (C0947.f81895) {
                        iM55680 = (C0946.m55979("ۚᩳ") ^ i8) * (-87);
                        i = ((iM55680 ^ i7) * (-25893)) ^ 1542731133;
                        i2 = -494568355;
                    } else {
                        iM55680 = (i7 - C0946.m55979("ۜᩳ")) * 109;
                        i = ((iM55680 ^ i8) * (-10849)) ^ (-83699383);
                        i2 = 226770705;
                    }
                    int i1117 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1117;
                    break;
                case 418519052:
                case 1484111721:
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0946.m55979("ۚۤ") ^ i7;
                        i = ((iM55680 ^ i8) * 1547) ^ 1442702666;
                        i2 = -983299829;
                    } else {
                        iM55680 = (C0873.m55680("᩹ܶ") ^ i7) * (-99);
                        i = ((iM55680 ^ i8) * (-5003)) ^ (-1553584300);
                        i2 = 1954046331;
                    }
                    int i1118 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1118;
                    break;
                case 471503604:
                case 1322063822:
                    if (iM21554 == z) {
                        iM55680 = (i8 - C0873.m55680("ܿ۫")) * 5;
                        i = ((iM55680 ^ i7) * 2757) ^ (-1153880753);
                        i2 = -1633799801;
                    } else {
                        iM55680 = (C0946.m55979("ۘ᩶") ^ i7) * 85;
                        i = ((iM55680 ^ i8) * (-6675)) ^ 704968267;
                        i2 = -972612414;
                    }
                    int i1119 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1119;
                    break;
                case 524066125:
                case 2052454734:
                    s = c9313.readShort();
                    iM55680 = C0946.m55979("ۜᩴ") ^ i8;
                    i = ((iM55680 ^ i7) * 31161) ^ (-856110766);
                    i2 = 909368402;
                    int i11110 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11110;
                    break;
                case 1157656444:
                case 1410017460:
                    C0882.m55710();
                    iM55680 = C0946.m55979("ۚ᩷") ^ i7;
                    i = ((iM55680 ^ i8) * 25777) ^ (-10331716);
                    i2 = 1270890365;
                    int i11111 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11111;
                    break;
                case 1494797650:
                case 1713260435:
                    return z;
                case 1513290149:
                case 1680973837:
                    if (C1229.m56410() == 0) {
                        iM55680 = C0946.m55979("ۗ᩻") ^ i8;
                        i = ((iM55680 ^ i7) * (-27343)) ^ (-2288573);
                        i2 = 915282230;
                    } else {
                        iM55680 = (C0946.m55979("ۚᩳ") ^ i8) * (-87);
                        i = ((iM55680 ^ i7) * (-25893)) ^ 1542731133;
                        i2 = -494568355;
                    }
                    int i11112 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11112;
                    break;
                default:
                    try {
                        iM21552 = c9313.m21552();
                        iM55680 = C0873.m55680("۫ۘ") ^ i7;
                        i = ((iM55680 ^ i8) * 19021) ^ (-677950032);
                        i2 = 355633738;
                    } catch (Throwable unused) {
                        iM55680 = (C0946.m55979("ۘ᩶") ^ i7) * 85;
                        i = ((iM55680 ^ i8) * (-6675)) ^ 704968267;
                        i2 = -972612414;
                    }
                    int i11113 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11113;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final XmlResourceParserC12128 m38154() {
        int iM55680;
        int i;
        int i2 = -888078392;
        int i3 = C1229.f82066;
        int i4 = C0949.f81897;
        int iM55681 = (C0873.m55680("ܶܿ") + i3) * 59;
        int i5 = ((iM55681 ^ i4) * (-12751)) ^ (-989925802);
        int i6 = iM55681 ^ 1194783178;
        ByteArrayInputStream byteArrayInputStream = null;
        while (true) {
            XmlResourceParserC12128 xmlResourceParserC12128 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 30571) >> 31) & i5) ^ i6;
                switch (i2) {
                    case -1738441168:
                    case -733562355:
                        AbstractC0942.m55971();
                        C0937.m55918();
                        return null;
                    case -1734441149:
                    case -595350903:
                        C0912.m55833();
                        C0854.m55595();
                        break;
                    case -1439656541:
                    case -60704963:
                        AbstractC0942.m55971();
                        if (C1124.m56367() >= 0) {
                        }
                        iM55680 = C0873.m55680("ۨ᩷") ^ i3;
                        i5 = ((iM55680 ^ i4) * 2095) ^ (-2118744570);
                        i = -1975247650;
                        i6 = iM55680 ^ i;
                        byteArrayInputStream = null;
                        break;
                    case -736389975:
                    case 211445352:
                        xmlResourceParserC12128.m28031(byteArrayInputStream, this.f49796);
                        return xmlResourceParserC12128;
                    case -697746014:
                    case 1001662742:
                        C1048.m56305();
                        if (C1229.f82066 < 0) {
                        }
                        iM55680 = (i4 - C0873.m55680("ܿ۫")) * 61;
                        i5 = ((iM55680 ^ i3) * (-11133)) ^ 784266645;
                        i = 367759931;
                        i6 = iM55680 ^ i;
                        byteArrayInputStream = null;
                        break;
                    case 122925978:
                    case 1166300794:
                        if (C0861.f81831) {
                            if (C1028.f81950 <= 0) {
                                iM55680 = C0873.m55680("ۨ᩷") ^ i3;
                                i5 = ((iM55680 ^ i4) * 2095) ^ (-2118744570);
                                i = -1975247650;
                                i6 = iM55680 ^ i;
                                byteArrayInputStream = null;
                            } else {
                                if (!AbstractC0942.m55971()) {
                                    if (C1229.f82066 < 0) {
                                        if (!C0955.m56025()) {
                                            byte[] bArr = this.f49793;
                                            if (!C0955.m56025()) {
                                                int length = bArr.length;
                                                if (ViewOnClickListenerC0939.f81888 > 0) {
                                                    int i7 = this.f49794;
                                                    int i8 = length - i7;
                                                    if (!C0882.f81846) {
                                                        byteArrayInputStream = new ByteArrayInputStream(bArr, i7, i8);
                                                        if (C1044.m56286() <= 0) {
                                                        }
                                                        xmlResourceParserC12128 = new XmlResourceParserC12128();
                                                        if (C0861.f81831) {
                                                            int iM55682 = (i3 - C0873.m55680("۠֫")) * (-67);
                                                            i5 = ((iM55682 ^ i4) * 14591) ^ (-2058985833);
                                                            i6 = iM55682 ^ (-1171376859);
                                                        }
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    iM55680 = (i4 - C0873.m55680("ܿ۫")) * 61;
                                    i5 = ((iM55680 ^ i3) * (-11133)) ^ 784266645;
                                    i = 367759931;
                                    i6 = iM55680 ^ i;
                                    byteArrayInputStream = null;
                                }
                                iM55680 = C0873.m55680("ܰ֡") ^ i4;
                                i5 = ((iM55680 ^ i3) * (-12937)) ^ 659644654;
                                i = 1936129524;
                                i6 = iM55680 ^ i;
                                byteArrayInputStream = null;
                            }
                            break;
                        }
                        iM55680 = C0873.m55680("ۛ۫") ^ i3;
                        i5 = ((iM55680 ^ i4) * 8469) ^ 1321762793;
                        i = 1968980482;
                        i6 = iM55680 ^ i;
                        byteArrayInputStream = null;
                        break;
                    default:
                        AbstractC0942.m55971();
                        if (C0873.f81841 > 0) {
                            iM55680 = (i4 - C0873.m55680("ܿ۫")) * 61;
                            i5 = ((iM55680 ^ i3) * (-11133)) ^ 784266645;
                            i = 367759931;
                        } else {
                            iM55680 = C0873.m55680("ܰ֡") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-12937)) ^ 659644654;
                            i = 1936129524;
                        }
                        i6 = iM55680 ^ i;
                        byteArrayInputStream = null;
                        break;
                }
            }
            int iM55979 = (C0946.m55979("ۗᩴ") + i4) * (-113);
            i5 = ((iM55979 ^ i3) * (-23999)) ^ 741606903;
            i6 = iM55979 ^ (-2013028291);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m38151() {
        return this.f49795;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m38139(StringBuilder sb, int i) {
        C14971 c14971 = null;
        int i2 = 104058472;
        int i3 = C1404.f82149;
        int i4 = C0967.f81910;
        int iM55979 = (C0946.m55979("ۜ֫") ^ i3) * (-111);
        int i5 = ((iM55979 ^ i4) * (-1881)) ^ 892149893;
        int i6 = -245895058;
        while (true) {
            i2 = ((((i2 ^ i4) * 21861) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -1972357131:
                case -1529030083:
                    if (!C0882.f81846) {
                        iM55979 = (C0873.m55680("۬ܰ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55979 ^ i4) * 30185) ^ 685951760;
                        i6 = -499878745;
                    } else {
                        iM55979 = (C0873.m55680("ۤᩳ") ^ i4) * (-99);
                        i5 = ((iM55979 ^ i3) * 8359) ^ 2140332340;
                        i6 = 1245957391;
                    }
                    break;
                case -1952898377:
                case 337029668:
                    if (i >= 0) {
                        iM55979 = C0946.m55979("ۢۜ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-23267)) ^ 1421414748;
                        i6 = 272680823;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۘۧ")) * (-101);
                        i5 = ((iM55979 ^ i3) * 24567) ^ (-1195506750);
                        i6 = 1717490651;
                    }
                    break;
                case -1940182592:
                case 242809307:
                    C0955.m56025();
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("۬ܰ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55979 ^ i4) * 30185) ^ 685951760;
                        i6 = -499878745;
                    } else {
                        iM55979 = C0946.m55979("۬ܿ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 10165) ^ 223217704;
                        i6 = -1916752164;
                    }
                    break;
                case -1799425337:
                case 1709946071:
                    if (C1012.m56134() <= 0) {
                        iM55979 = (C0873.m55680("ܿۧ") + i4) * (-81);
                        i5 = ((iM55979 ^ i3) * 27011) ^ 1346786496;
                        i6 = 1951367513;
                    } else {
                        iM55979 = C0873.m55680("ۡ᩸") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-18557)) ^ (-1089843893);
                        i6 = -223547181;
                    }
                    break;
                case -1655928836:
                case -1017518706:
                    C0946.m55977(sb, ':');
                    iM55979 = (i4 - C0873.m55680("ۘۧ")) * (-101);
                    i5 = ((iM55979 ^ i3) * 24567) ^ (-1195506750);
                    i6 = 1717490651;
                    break;
                case -1458719735:
                case 946996311:
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0873.m55680("۬ܰ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55979 ^ i4) * 30185) ^ 685951760;
                        i6 = -499878745;
                    } else {
                        iM55979 = (C0873.m55680("ܺܺ") + i3) * 23;
                        i5 = ((iM55979 ^ i4) * (-3073)) ^ 583774723;
                        i6 = 466151168;
                    }
                    break;
                case -1254229568:
                case 217611121:
                    ServiceConnectionC1013.m56157();
                    break;
                case -1066732597:
                case 1218418339:
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0873.m55680("ۤᩳ") ^ i4) * (-99);
                        i5 = ((iM55979 ^ i3) * 8359) ^ 2140332340;
                        i6 = 1245957391;
                    } else {
                        iM55979 = C0946.m55979("۠۠") ^ i3;
                        i5 = ((iM55979 ^ i4) * 14931) ^ 1959333000;
                        i6 = -877852900;
                    }
                    break;
                case -999670671:
                case -703690905:
                    c14971 = this.f49796;
                    if (i >= c14971.size()) {
                        iM55979 = (i4 - C0873.m55680("ۘۧ")) * (-101);
                        i5 = ((iM55979 ^ i3) * 24567) ^ (-1195506750);
                        i6 = 1717490651;
                    } else {
                        iM55979 = C0873.m55680("ܳᩴ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 9967) ^ 1913393452;
                        i6 = -1598140362;
                    }
                    break;
                case -679795769:
                case -45142561:
                    if (C0894.m55769() >= 0) {
                        iM55979 = (C0873.m55680("۬ܰ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55979 ^ i4) * 30185) ^ 685951760;
                        i6 = -499878745;
                    } else {
                        iM55979 = C0873.m55680("ۤ۬") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-7597)) ^ 1562958926;
                        i6 = -421480244;
                    }
                    break;
                case -672565557:
                case 155521153:
                    if (C0898.m55800() <= 0) {
                        iM55979 = (C0873.m55680("ۤᩳ") ^ i4) * (-99);
                        i5 = ((iM55979 ^ i3) * 8359) ^ 2140332340;
                        i6 = 1245957391;
                    } else {
                        iM55979 = (C0873.m55680("ۡۙ") ^ i4) * 93;
                        i5 = ((iM55979 ^ i3) * 30891) ^ (-800860944);
                        i6 = 774221147;
                    }
                    break;
                case -267654323:
                case 613478761:
                    if (C1964.f83032 <= 0) {
                        iM55979 = (C0873.m55680("ۤᩳ") ^ i4) * (-99);
                        i5 = ((iM55979 ^ i3) * 8359) ^ 2140332340;
                        i6 = 1245957391;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩺ۡ")) * 9;
                        i5 = ((iM55979 ^ i4) * 8959) ^ 1789383823;
                        i6 = -1574605830;
                    }
                    break;
                case -18436594:
                case 646330456:
                    if (C1024.m56209() >= 0) {
                        iM55979 = (C0873.m55680("ܿۧ") + i4) * (-81);
                        i5 = ((iM55979 ^ i3) * 27011) ^ 1346786496;
                        i6 = 1951367513;
                    } else {
                        iM55979 = C0946.m55979("ۤܶ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-14895)) ^ (-1403786108);
                        i6 = -1277816623;
                    }
                    break;
                case 337603400:
                case 723149251:
                    C0912.m55825(sb, c14971.m50188(i));
                    if (C1964.f83032 <= 0) {
                        iM55979 = (C0946.m55979("۟ܶ") ^ i4) * (-63);
                        i5 = ((iM55979 ^ i3) * 8687) ^ (-1586911382);
                        i6 = -1394212232;
                    } else {
                        iM55979 = C0873.m55680("ܳ᩷") ^ i3;
                        i5 = ((iM55979 ^ i4) * 32385) ^ 1271170750;
                        i6 = 1231444324;
                    }
                    break;
                case 479420327:
                case 1931403203:
                    C1964.m56597();
                    iM55979 = (C0873.m55680("ۤᩳ") ^ i4) * (-99);
                    i5 = ((iM55979 ^ i3) * 8359) ^ 2140332340;
                    i6 = 1245957391;
                    break;
                case 529005600:
                case 1502530064:
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (C0946.m55979("۟ܶ") ^ i4) * (-63);
                        i5 = ((iM55979 ^ i3) * 8687) ^ (-1586911382);
                        i6 = -1394212232;
                    } else {
                        iM55979 = (C0946.m55979("ܺܶ") ^ i3) * 61;
                        i5 = ((iM55979 ^ i4) * (-279)) ^ 735414846;
                        i6 = 1506195147;
                    }
                    break;
                case 1508529203:
                case 1843398444:
                    C0927.m55873();
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0873.m55680("ܿۧ") + i4) * (-81);
                        i5 = ((iM55979 ^ i3) * 27011) ^ 1346786496;
                        i6 = 1951367513;
                    } else {
                        iM55979 = (C0873.m55680("۬ܰ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55979 ^ i4) * 30185) ^ 685951760;
                        i6 = -499878745;
                    }
                    break;
                case 1634394622:
                case 1833217040:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0873.m55680("ۤᩳ") ^ i4) * (-99);
                        i5 = ((iM55979 ^ i3) * 8359) ^ 2140332340;
                        i6 = 1245957391;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ᩹") ^ i4) * 91;
                        i5 = ((iM55979 ^ i3) * (-8917)) ^ (-1385581930);
                        i6 = -334289563;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38147(C14281 c14281) {
        m38141(c14281);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 135341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ܽ */
    private void m38141(p067l.C14281 r89) {
        /*
            Method dump skipped, instruction units count: 13534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C16820.m38141(l.۫ܽܽ):void");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38133(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 944516608;
        int i4 = C1046.f81962;
        int i5 = C0877.f81843;
        int iM55979 = (i4 - C0946.m55979("᩵ᩴ")) * 33;
        int i6 = ((iM55979 ^ i5) * (-11601)) ^ 750264715;
        int i7 = -838231942;
        while (true) {
            i3 = ((((i3 ^ i5) * 3525) >> 31) & i6) ^ (iM55979 ^ i7);
            switch (i3) {
                case -2010804624:
                case -1822335129:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (i4 - C0946.m55979("ܿۡ")) * (-105);
                        i6 = ((iM55979 ^ i5) * 13477) ^ (-288414650);
                        i7 = 341486546;
                    } else {
                        iM55979 = C0873.m55680("ۖ۬") ^ i5;
                        i6 = ((iM55979 ^ i4) * 1219) ^ 1266614639;
                        i7 = 1574969426;
                    }
                    break;
                case -1643760268:
                case 626445606:
                    C0989.m56095();
                    C0890.m55740();
                    iM55979 = (i4 - C0946.m55979("ܿۡ")) * (-105);
                    i6 = ((iM55979 ^ i5) * 13477) ^ (-288414650);
                    i7 = 341486546;
                    break;
                case -1626312270:
                case -743448423:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("۟֫") ^ i5;
                        i6 = ((iM55979 ^ i4) * 25655) ^ (-1239710975);
                        i7 = -330508992;
                    } else {
                        iM55979 = C0873.m55680("ۤ᩸") ^ i4;
                        i6 = ((iM55979 ^ i5) * 5297) ^ 1972808190;
                        i7 = -1993793655;
                    }
                    break;
                case -1615373174:
                case -538938054:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("۟֫") ^ i5;
                        i6 = ((iM55979 ^ i4) * 25655) ^ (-1239710975);
                        i7 = -330508992;
                    } else {
                        iM55979 = (C0946.m55979("ܰۘ") ^ i5) * 89;
                        i6 = ((iM55979 ^ i4) * 22787) ^ 366018097;
                        i7 = -979746607;
                    }
                    break;
                case -1521928972:
                case -623413439:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("᩸۟") ^ i4;
                        i6 = ((iM55979 ^ i5) * 27103) ^ (-796002623);
                        i7 = 1004526614;
                    } else {
                        iM55979 = C0873.m55680("֨᩵") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-19415)) ^ (-1674880675);
                        i7 = 2121613355;
                    }
                    break;
                case -1357759281:
                case 1717016513:
                    i2++;
                    iM55979 = C0873.m55680("ۖܽ") ^ i4;
                    i6 = ((iM55979 ^ i5) * 21171) ^ 807373018;
                    i7 = 1933670705;
                    break;
                case -1135237828:
                case 1725000915:
                    i2 = 0;
                    iM55979 = C0873.m55680("ۖܽ") ^ i4;
                    i6 = ((iM55979 ^ i5) * 21171) ^ 807373018;
                    i7 = 1933670705;
                    break;
                case -887832172:
                case 1830125014:
                    AbstractC0942.m55971();
                    if (!C1048.f81963) {
                        iM55979 = C0873.m55680("۟֫") ^ i5;
                        i6 = ((iM55979 ^ i4) * 25655) ^ (-1239710975);
                        i7 = -330508992;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۨۧ")) * (-51);
                        i6 = ((iM55979 ^ i5) * 10661) ^ 420383906;
                        i7 = 1735384819;
                    }
                    break;
                case -781325957:
                case 1852333008:
                    if (RunnableC1014.f81941 > 0) {
                        iM55979 = C0873.m55680("ۙۢ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 27591) ^ (-1008248809);
                        i7 = 273282112;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ܿۡ")) * (-105);
                        i6 = ((iM55979 ^ i5) * 13477) ^ (-288414650);
                        i7 = 341486546;
                    }
                    break;
                case -736795574:
                case 1644369393:
                    C1046.m56302();
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (i4 - C0873.m55680("ۨۧ")) * (-51);
                        i6 = ((iM55979 ^ i5) * 10661) ^ 420383906;
                        i7 = 1735384819;
                    } else {
                        iM55979 = C0873.m55680("ۙۢ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 27591) ^ (-1008248809);
                        i7 = 273282112;
                    }
                    break;
                case -511289998:
                case 554907042:
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0873.m55680("۟֫") ^ i5;
                        i6 = ((iM55979 ^ i4) * 25655) ^ (-1239710975);
                        i7 = -330508992;
                    } else {
                        iM55979 = C0873.m55680("֡ۖ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 21) ^ 1919189652;
                        i7 = 292873644;
                    }
                    break;
                case -271637346:
                case 1654096448:
                    break;
                case -153410479:
                case 1203620446:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i4 - C0946.m55979("ܿۡ")) * (-105);
                        i6 = ((iM55979 ^ i5) * 13477) ^ (-288414650);
                        i7 = 341486546;
                    } else {
                        iM55979 = C0873.m55680("ۖ᩺") ^ i5;
                        i6 = ((iM55979 ^ i4) * 13067) ^ 1782758975;
                        i7 = 721862797;
                    }
                    break;
                case 266001793:
                case 1945382401:
                    C0927.m55873();
                    break;
                case 446772117:
                case 2109183149:
                    if (C1404.m56468()) {
                        iM55979 = (i4 - C0946.m55979("ۛۘ")) * (-87);
                        i6 = ((iM55979 ^ i5) * (-1229)) ^ 2109118642;
                        i7 = 312976061;
                    } else {
                        iM55979 = C0946.m55979("᩸۟") ^ i4;
                        i6 = ((iM55979 ^ i5) * 27103) ^ (-796002623);
                        i7 = 1004526614;
                    }
                    break;
                case 452234130:
                case 1346795885:
                    C0946.m55977(sb, ' ');
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("᩸۟") ^ i4;
                        i6 = ((iM55979 ^ i5) * 27103) ^ (-796002623);
                        i7 = 1004526614;
                    } else {
                        iM55979 = C0946.m55979("᩶ܺ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-29615)) ^ 540904848;
                        i7 = 559816022;
                    }
                    break;
                case 629684401:
                case 2061363372:
                    if (i2 < i) {
                        iM55979 = (C0946.m55979("ܿ۬") + i4) * (-13);
                        i6 = ((iM55979 ^ i5) * 9869) ^ 1701354546;
                        i7 = -940500431;
                    } else {
                        iM55979 = (C0946.m55979("ᩴ֨") ^ i5) * 57;
                        i6 = ((iM55979 ^ i4) * (-1421)) ^ (-1365648788);
                        i7 = 1094505535;
                    }
                    break;
                case 656269470:
                case 774005961:
                    if (C1048.f81963) {
                        iM55979 = (C0873.m55680("۬ܺ") ^ i5) * 101;
                        i6 = ((iM55979 ^ i4) * 9199) ^ 2064051920;
                        i7 = 1489912466;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ܿۡ")) * (-105);
                        i6 = ((iM55979 ^ i5) * 13477) ^ (-288414650);
                        i7 = 341486546;
                    }
                    break;
                default:
                    if (C0947.f81895) {
                        iM55979 = (i4 - C0873.m55680("ۨۧ")) * (-51);
                        i6 = ((iM55979 ^ i5) * 10661) ^ 420383906;
                        i7 = 1735384819;
                    } else {
                        iM55979 = C0946.m55979("ܰ᩶") ^ i5;
                        i6 = ((iM55979 ^ i4) * 27725) ^ (-757693285);
                        i7 = -1603434606;
                    }
                    break;
            }
            return;
        }
    }

    static {
        ApplicationC14266.m56479(116);
        f82237 = new short[]{1441, -11076, -11069, -11104, -11128, -11104, -11118, -11046, -11041, -11046, -11123, -11127, -11117, -11128, -11065, -11046, -11107, -11119, -11124, -11065, -11046, -11120, -11128, -11065, -11046, -11109, -11128, -11065, -11104, -11104, -11065, 2402, 3277, 557, -1933, -1934, -1935, -1936, -1929, -1930, -1931, -1932, -1925, -1926, -2014, -2015, -2016, -2009, -2010, -2011, -1933, -1934, -1935, -1936, -1929, -1930, -1931, -1932, -1925, -1926, -2046, -2047, -2048, -2041, -2042, -2043, -1989, -2002, -2001, -2003, -2000, -1927, -1933, -1989, -2041, -2010, -1997, -1999, -2010, -2016, -2014, -1993, -2010, -2009, -1949, -1940, -1923, -1975, -1921, -1940, -1993, -1999, -1994, -2010, -2010, -1999, -1999, -2004, -1999, -2011, -2014, -2001, -2000, -2010, -1952, -1947, -1952, -1947, -2014, -2002, -1997, -1928, -1947, -2001, -1993, -1928, -1947, -2012, -1993, -1928, -1928, 7736, 4514, 4542, 4542, 4538, 4592, 4581, 4581, 4537, 4521, 4514, 4527, 4519, 4523, 4537, 4580, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4580, 4521, 4517, 4519, 4581, 4523, 4538, 4513, 4581, 4523, 4538, 4538, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4514, 4542, 4542, 4538, 4592, 4581, 4581, 4537, 4521, 4514, 4527, 4519, 4523, 4537, 4580, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4580, 4521, 4517, 4519, 4581, 4523, 4538, 4513, 4581, 4536, 4527, 4537, 4581, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4514, 4542, 4542, 4538, 4592, 4581, 4581, 4537, 4521, 4514, 4527, 4519, 4523, 4537, 4580, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4580, 4521, 4517, 4519, 4581, 4523, 4538, 4513, 4581, 4538, 4536, 4540, 4581, 4536, 4527, 4537, 4581, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4514, 4542, 4542, 4538, 4592, 4581, 4581, 4537, 4521, 4514, 4527, 4519, 4523, 4537, 4580, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4580, 4521, 4517, 4519, 4581, 4523, 4538, 4513, 4581, 4526, 4515, 4537, 4542, 4536, 4515, 4520, 4543, 4542, 4515, 4517, 4516, 4521, 4543, 4537, 4542, 4517, 4519, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4538, 4536, 4540, 4526, 4515, 4537, 4542, 4515, 4526, 4602, 4603, 4600, 4601, 4606, 4607, 4604, 4605, 4594, 4595, 4523, 4520, 4521, 4526, 4527, 4524, 4514, 4542, 4542, 4538, 4592, 4581, 4581, 4537, 4521, 4514, 4527, 4519, 4523, 4537, 4580, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4580, 4521, 4517, 4519, 4581, 4523, 4538, 4513, 4581, 4536, 4527, 4537, 4583, 4523, 4543, 4542, 4517, 9650, 17722, 20714, 23400, 6288, 31373, -32443, 30596, 1288, 24570, -22432, -19730, 9231, 29266, -29200, 17003};
        f49790 = new C9091();
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
    /* JADX INFO: renamed from: ֫ */
    public static String m38129(String str) {
        int iM55680;
        int i;
        int i2;
        short[] sArr;
        int iM55681;
        int i3;
        int i4;
        int i5;
        short[] sArr2;
        int i6;
        int i7;
        int i8;
        int iM55979;
        int i9;
        short[] sArr3;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        short[] sArr4;
        int iM55682;
        int i14;
        int i15;
        int iM559710;
        int i16;
        int i17;
        short[] sArr5;
        int i18;
        int i19;
        int iM55683;
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
        int iM559711;
        int i27;
        int i28;
        short[] sArr8;
        int i29 = 153687282;
        int i30 = C0845.f81821;
        int i31 = C1044.f81959;
        int iM559712 = C0946.m55979("ۛۢ") ^ i31;
        int i32 = ((iM559712 ^ i30) * 23459) ^ (-371535566);
        int i33 = iM559712 ^ (-1004411125);
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
        String strM56161 = null;
        char c6 = 0;
        while (true) {
            i29 = i33 ^ (i32 & (((i29 ^ i30) * (-6719)) >> 31));
            switch (i29) {
                case -2131829804:
                case 597032822:
                    if (C0946.f81894 != 0) {
                        sArr2 = sArr14;
                        iM55979 = (i30 - C0873.m55680("ۚܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM55979 ^ i31) * 1575) ^ (-452915497);
                        i9 = 583010441;
                        i7 = iM55979 ^ i9;
                        sArr = sArr2;
                        i33 = i7;
                        i32 = i6;
                        sArr14 = sArr;
                    } else {
                        iM559711 = C0946.m55979("۠᩹") ^ i31;
                        i27 = ((iM559711 ^ i30) * 12799) ^ 1871792732;
                        i28 = 78516685;
                        i33 = iM559711 ^ i28;
                        i32 = i27;
                    }
                    break;
                case -2123959953:
                case -1699837282:
                    i35 = 0;
                    int iM559713 = C0946.m55979("ۡۡ") ^ i31;
                    i34 = i34;
                    i45 = i45;
                    sArr = sArr14;
                    i33 = iM559713 ^ 1818056926;
                    i32 = ((iM559713 ^ i30) * (-101)) ^ (-158853336);
                    i46 = i46;
                    sArr14 = sArr;
                    break;
                case -2068775379:
                case 931981847:
                    return "";
                case -2014150671:
                case 2040904745:
                    C1003.m56121(sb, C1929.m56558(sArr14, i38, 1, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM559714 = (C0946.m55979("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM559714 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM559714 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -2008949351:
                case -1151986440:
                    C0912.m55825(sb, C1024.m56203(f82237, 20, 4, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM559715 = (C0946.m55979("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM559715 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM559715 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -2000499611:
                case 225783385:
                    C0946.m55977(sb, c4);
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM559716 = (C0946.m55979("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM559716 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM559716 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -1992185249:
                case 524423809:
                    C0912.m55825(sb, C0890.m55726(f82237, 28, 2, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM559717 = (C0946.m55979("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM559717 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM559717 ^ (-1034208596);
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
                    if (!C1229.m56404(str, C0937.m55921(sArr9, i23, 1, i39))) {
                        int iM559718 = (C0946.m55979("᩸֡") ^ i30) * (-115);
                        sb = sb;
                        i16 = ((iM559718 ^ i31) * 24627) ^ (-1155657339);
                        i24 = iM559718 ^ 1496976182;
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
                        int iM559719 = C0946.m55979("᩸ܰ") ^ i30;
                        i34 = i22;
                        i45 = i45;
                        short[] sArr18 = sArr14;
                        i33 = iM559719 ^ (-1543170240);
                        i32 = ((iM559719 ^ i31) * (-13947)) ^ 914127023;
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
                    C0917.m55854();
                    C0927.m55873();
                    return null;
                case -1918360535:
                case 527032904:
                    sArr2 = sArr14;
                    if (c4 != c3) {
                        iM55979 = (i31 - C0946.m55979("۬ᩳ")) * (-33);
                        i6 = ((iM55979 ^ i30) * (-31343)) ^ 973253452;
                        i9 = -1610554991;
                    } else {
                        iM55979 = C0946.m55979("֨ܿ") ^ i30;
                        i6 = ((iM55979 ^ i31) * 19319) ^ (-1796990206);
                        i9 = -471352995;
                    }
                    i7 = iM55979 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
                case -1898686884:
                case -1128245893:
                    sArr2 = sArr14;
                    if (c4 != '&') {
                        iM55979 = C0873.m55680("ۧ۬") ^ i30;
                        i6 = ((iM55979 ^ i31) * (-9787)) ^ (-486896518);
                        i9 = 1720347210;
                    } else {
                        iM55979 = (i31 - C0873.m55680("۠ܳ")) * 97;
                        i6 = ((iM55979 ^ i30) * 4871) ^ (-2083590101);
                        i9 = 1389572921;
                    }
                    i7 = iM55979 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
                case -1869931915:
                case -634406700:
                    sArr2 = sArr14;
                    if (c4 != '\"') {
                        iM55979 = C0946.m55979("ۚ۬") ^ i31;
                        i6 = ((iM55979 ^ i30) * 12125) ^ 2015679290;
                        i9 = 110075094;
                    } else {
                        iM55979 = C0873.m55680("ܳܽ") ^ i30;
                        i6 = ((iM55979 ^ i31) * 12925) ^ 1282290229;
                        i9 = 708083999;
                    }
                    i7 = iM55979 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
                case -1843346709:
                case 998429912:
                    sArr2 = sArr14;
                    if (c4 != '>') {
                        iM55979 = C0873.m55680("۟ۢ") ^ i30;
                        i6 = ((iM55979 ^ i31) * 25201) ^ (-1607188975);
                        i9 = -473160480;
                    } else {
                        iM55979 = (C0873.m55680("ᩴۡ") ^ i31) * (-15);
                        i6 = ((iM55979 ^ i30) * (-14129)) ^ 1744256135;
                        i9 = 1154244187;
                    }
                    i7 = iM55979 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
                case -1708151836:
                case 1317099344:
                    sArr2 = sArr14;
                    if (c4 != '<') {
                        iM55979 = (C0946.m55979("ܰᩴ") ^ i31) * (-49);
                        i6 = ((iM55979 ^ i30) * (-20755)) ^ (-1398462992);
                        i9 = -571822340;
                    } else {
                        iM55979 = C0946.m55979("ۜ۬") ^ i30;
                        i6 = ((iM55979 ^ i31) * (-7173)) ^ (-459886192);
                        i9 = 1961106242;
                    }
                    i7 = iM55979 ^ i9;
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
                        iM559710 = C0946.m55979("ۚ᩹") ^ i31;
                        i16 = ((iM559710 ^ i30) * 23491) ^ 518820345;
                        i17 = 2001880122;
                    } else {
                        iM559710 = C0946.m55979("᩹᩺") ^ i31;
                        i16 = ((iM559710 ^ i30) * (-28513)) ^ 2079887270;
                        i17 = -913272290;
                    }
                    i24 = iM559710 ^ i17;
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
                        iM559711 = C0946.m55979("ܺۘ") ^ i31;
                        i27 = ((iM559711 ^ i30) * 7653) ^ (-1559765691);
                        i28 = -603099809;
                    } else {
                        iM559711 = C0873.m55680("ۚܳ") ^ i30;
                        i27 = ((iM559711 ^ i31) * (-31891)) ^ 832693531;
                        i28 = -2063601562;
                    }
                    i33 = iM559711 ^ i28;
                    i32 = i27;
                    break;
                case -1615010625:
                case 1726354575:
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM559711 = (i30 - C0946.m55979("᩵ۙ")) * 17;
                        i27 = ((iM559711 ^ i31) * (-8343)) ^ 1885416286;
                        i28 = 949543486;
                        i33 = iM559711 ^ i28;
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
                        iM55682 = C0873.m55680("۫᩵") ^ i31;
                        i32 = ((iM55682 ^ i30) * (-16235)) ^ 1728055494;
                        i14 = -921514789;
                        i15 = iM55682 ^ i14;
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
                    sArr12 = f82237;
                    i36 = 5;
                    i37 = 2;
                    if (C1017.f81942 >= 0) {
                        iM55979 = (i30 - C0873.m55680("ۚܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM55979 ^ i31) * 1575) ^ (-452915497);
                        i9 = 583010441;
                    } else {
                        iM55979 = (i30 - C0946.m55979("ܿ۫")) * 33;
                        i6 = ((iM55979 ^ i31) * 21541) ^ 1516874358;
                        i9 = -1374406293;
                    }
                    i7 = iM55979 ^ i9;
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
                    sArr15 = f82237;
                    c5 = 0;
                    if (C0863.f81833 <= 0) {
                        iM55682 = C0873.m55680("۫᩵") ^ i31;
                        i32 = ((iM55682 ^ i30) * (-16235)) ^ 1728055494;
                        i14 = -921514789;
                    } else {
                        iM55682 = C0873.m55680("ۡ۟") ^ i31;
                        i32 = ((iM55682 ^ i30) * 171) ^ (-1562145893);
                        i14 = 1129675836;
                    }
                    i15 = iM55682 ^ i14;
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
                    C0930.m55885();
                    if (C0882.m55710() != 0) {
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
                        int iM55684 = (i31 - C0873.m55680("֫ܰ")) * (-75);
                        s = s;
                        i32 = ((iM55684 ^ i30) * (-30801)) ^ 606520359;
                        i34 = i5;
                        i45 = i8;
                        sArr8 = sArr2;
                        i33 = iM55684 ^ 840250923;
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
                        int iM559720 = C0946.m55979("ۨۖ") ^ i30;
                        i34 = i12;
                        i45 = i10;
                        char c8 = c;
                        sArr10 = sArr3;
                        i32 = ((iM559720 ^ i31) * (-10573)) ^ (-1441722551);
                        c4 = c8;
                        short[] sArr26 = sArr2;
                        i33 = iM559720 ^ (-701134929);
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
                    if (!C1229.m56404(str, C0917.m55852(sArr6, i43, i44, i39))) {
                        int iM559721 = C0946.m55979("ۡۚ") ^ i30;
                        sArr4 = sArr6;
                        i32 = ((iM559721 ^ i31) * (-21847)) ^ (-1176423189);
                        i34 = i22;
                        i45 = i45;
                        char c9 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr14;
                        i33 = iM559721 ^ 1712016332;
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
                        int iM5597110 = C0946.m55979("᩸ܰ") ^ i30;
                        i34 = i22;
                        i45 = i45;
                        short[] sArr113 = sArr14;
                        i33 = iM5597110 ^ (-1543170240);
                        i32 = ((iM5597110 ^ i31) * (-13947)) ^ 914127023;
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
                    C0967.m56074();
                    if (!C0927.f81875) {
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
                        iM559710 = (C0873.m55680("֡ۡ") ^ i31) * 49;
                        i16 = ((iM559710 ^ i30) * (-12845)) ^ 942979922;
                        i17 = 1933028274;
                        i24 = iM559710 ^ i17;
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
                        iM559711 = C0946.m55979("۠᩹") ^ i31;
                        i27 = ((iM559711 ^ i30) * 12799) ^ 1871792732;
                        i28 = 78516685;
                        i33 = iM559711 ^ i28;
                        i32 = i27;
                    }
                    break;
                case -1073854302:
                case 1914962949:
                    i35++;
                    int iM5597111 = C0946.m55979("ۡۡ") ^ i31;
                    i34 = i34;
                    i45 = i45;
                    sArr = sArr14;
                    i33 = iM5597111 ^ 1818056926;
                    i32 = ((iM5597111 ^ i30) * (-101)) ^ (-158853336);
                    i46 = i46;
                    sArr14 = sArr;
                    break;
                case -1021470867:
                case 18399279:
                    if (C1071.f81975 <= 0) {
                        iM559711 = C0873.m55680("ܶۨ") ^ i30;
                        i27 = ((iM559711 ^ i31) * 27783) ^ (-992069481);
                        i28 = 1662590854;
                        i33 = iM559711 ^ i28;
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
                        iM55683 = (C0946.m55979("᩵ۚ") ^ i30) * 45;
                        i20 = ((iM55683 ^ i31) * 17625) ^ 1670876060;
                        i21 = -371564446;
                        i34 = i19;
                        i45 = i18;
                        sArr8 = sArr5;
                        i33 = iM55683 ^ i21;
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
                    if (i35 < C0927.m55878(str)) {
                        iM55680 = C0873.m55680("ۤ᩹") ^ i31;
                        i = ((iM55680 ^ i30) * (-21139)) ^ (-1962236811);
                        i2 = -664391287;
                    } else {
                        iM55680 = C0873.m55680("ۘۚ") ^ i30;
                        i = ((iM55680 ^ i31) * 21013) ^ (-1142541214);
                        i2 = 187612256;
                    }
                    i34 = i49;
                    i45 = i48;
                    sArr = sArr29;
                    i33 = iM55680 ^ i2;
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
                    if (C1025.f81947 >= 0) {
                        iM55682 = C0873.m55680("᩶᩻") ^ i31;
                        i32 = ((iM55682 ^ i30) * (-12799)) ^ 1007493396;
                        i14 = -1992253646;
                    } else {
                        iM55682 = C0946.m55979("᩶ۘ") ^ i30;
                        i32 = ((iM55682 ^ i31) * 27311) ^ (-890999855);
                        i14 = -1925493989;
                    }
                    i15 = iM55682 ^ i14;
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
                    if (C0946.f81894 != 0) {
                        iM559710 = (C0873.m55680("֡ۡ") ^ i31) * 49;
                        i16 = ((iM559710 ^ i30) * (-12845)) ^ 942979922;
                        i17 = 1933028274;
                    } else {
                        iM559710 = C0873.m55680("ۤۤ") ^ i31;
                        i16 = ((iM559710 ^ i30) * 20769) ^ 1961471749;
                        i17 = 52781734;
                    }
                    i24 = iM559710 ^ i17;
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
                    C0912.m55825(sb, C1071.m56336(f82237, 15, 5, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM5597112 = (C0946.m55979("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM5597112 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM5597112 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -804187098:
                case 371557061:
                    C0946.m55977(sb, c4);
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM5597113 = (C0946.m55979("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM5597113 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM5597113 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -695109058:
                case 1889670558:
                    C0912.m55825(sb, C0892.m55750(f82237, 9, 6, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM5597114 = (C0946.m55979("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM5597114 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM5597114 ^ (-1034208596);
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
                    sArr3 = f82237;
                    i44 = 1;
                    if (C0989.f81920 >= 0) {
                        c6 = c11;
                        i43 = 2;
                        int iM559722 = C0946.m55979("ۨۖ") ^ i30;
                        i34 = i12;
                        i45 = i10;
                        char c12 = c;
                        sArr10 = sArr3;
                        i32 = ((iM559722 ^ i31) * (-10573)) ^ (-1441722551);
                        c4 = c12;
                        short[] sArr211 = sArr2;
                        i33 = iM559722 ^ (-701134929);
                        i35 = i13;
                        i46 = i11;
                        sArr14 = sArr211;
                    } else {
                        int iM559723 = C0946.m55979("ۢ᩶") ^ i31;
                        int i50 = ((iM559723 ^ i30) * 11613) ^ (-585233872);
                        i34 = i12;
                        i35 = i13;
                        i46 = i11;
                        i45 = i10;
                        sArr14 = sArr2;
                        i33 = iM559723 ^ 810899601;
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
                    C1003.m56121(sb, C0949.m56016(sArr7, i26, i25, i39));
                    int iM5597115 = (C0946.m55979("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM5597115 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM5597115 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -509646641:
                case 1103678695:
                    sArr4 = sArr10;
                    i39 = 54524;
                    iM559710 = C0873.m55680("֡ۨ") ^ i30;
                    i16 = ((iM559710 ^ i31) * (-19285)) ^ (-1785715929);
                    i17 = -1266169456;
                    i24 = iM559710 ^ i17;
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
                    if (C1194.m56397(str)) {
                        iM559710 = (C0873.m55680("᩹ۛ") + i31) * (-63);
                        i16 = ((iM559710 ^ i30) * 24385) ^ (-2081846549);
                        i17 = 1195777229;
                    } else {
                        iM559710 = (i30 - C0946.m55979("᩹ۨ")) * 29;
                        i16 = ((iM559710 ^ i31) * (-26333)) ^ (-1289262670);
                        i17 = -587344930;
                    }
                    i24 = iM559710 ^ i17;
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
                    sArr11 = f82237;
                    i46 = 3;
                    if (C1036.f81953 < 0) {
                        int iM559724 = (C0946.m55979("֫ۚ") ^ i30) * 85;
                        i6 = ((iM559724 ^ i31) * (-20765)) ^ 793844623;
                        i7 = iM559724 ^ (-1995273640);
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
                        int iM55685 = (i31 - C0873.m55680("֫ܰ")) * (-75);
                        s = s;
                        i32 = ((iM55685 ^ i30) * (-30801)) ^ 606520359;
                        i34 = i5;
                        i45 = i8;
                        sArr8 = sArr2;
                        i33 = iM55685 ^ 840250923;
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
                    return C0863.m55639(sb);
                case -16139459:
                case 1500662048:
                    sArr4 = sArr10;
                    i39 = 55083;
                    iM559710 = C0873.m55680("֡ۨ") ^ i30;
                    i16 = ((iM559710 ^ i31) * (-19285)) ^ (-1785715929);
                    i17 = -1266169456;
                    i24 = iM559710 ^ i17;
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
                    char cM55870 = C0927.m55870(str, i35);
                    if (cM55870 != '\t') {
                        iM55681 = (C0946.m55979("۬֡") ^ i31) * 59;
                        i3 = ((iM55681 ^ i30) * 20967) ^ 2062729326;
                        i4 = 1231905574;
                    } else {
                        iM55681 = (i31 - C0873.m55680("ۨ۟")) * 37;
                        i3 = ((iM55681 ^ i30) * (-14923)) ^ (-373813431);
                        i4 = -522782977;
                    }
                    i34 = i52;
                    i45 = i51;
                    sArr = sArr33;
                    i33 = iM55681 ^ i4;
                    i32 = i3;
                    c4 = cM55870;
                    i46 = i46;
                    sArr14 = sArr;
                    break;
                case 75376523:
                case 1176054206:
                    C1003.m56121(sb, C1404.m56462(f82237, 24, 4, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM5597116 = (C0946.m55979("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM5597116 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM5597116 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case 212302279:
                case 1938976472:
                    C0912.m55825(sb, strM56161);
                    C0845.m55589(sb, c4);
                    sArr14 = f82237;
                    i38 = 30;
                    if (!C0861.f81831) {
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
                        iM559710 = (C0873.m55680("֡ۡ") ^ i31) * 49;
                        i16 = ((iM559710 ^ i30) * (-12845)) ^ 942979922;
                        i17 = 1933028274;
                        i24 = iM559710 ^ i17;
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
                        iM559711 = (C0873.m55680("ܶܽ") + i31) * 17;
                        i27 = ((iM559711 ^ i30) * 7367) ^ 1978688132;
                        i28 = -1981153922;
                        i33 = iM559711 ^ i28;
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
                    C0946.m55977(sb, c3);
                    int iM559725 = C0946.m55979("ۡۚ") ^ i30;
                    sArr4 = sArr6;
                    i32 = ((iM559725 ^ i31) * (-21847)) ^ (-1176423189);
                    i34 = i22;
                    i45 = i45;
                    char c13 = c6;
                    i43 = i43;
                    i35 = i35;
                    i46 = i46;
                    sArr14 = sArr14;
                    i33 = iM559725 ^ 1712016332;
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
                        iM55979 = C0946.m55979("ܽ۠") ^ i30;
                        i6 = ((iM55979 ^ i31) * 15425) ^ 1018747423;
                        i9 = -844090238;
                    } else {
                        iM55979 = (C0946.m55979("᩶֫") + i31) * (-123);
                        i6 = ((iM55979 ^ i30) * (-26129)) ^ 1625790264;
                        i9 = 1400780623;
                    }
                    i7 = iM55979 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
                case 679116525:
                case 2019178164:
                    if (C12588.m28996(c4)) {
                        iM559711 = C0946.m55979("۟ۛ") ^ i31;
                        i27 = ((iM559711 ^ i30) * 14143) ^ 256841549;
                        i28 = 10028641;
                    } else {
                        iM559711 = (C0946.m55979("ۤۚ") + i30) * (-3);
                        i27 = ((iM559711 ^ i31) * 32195) ^ (-1235422736);
                        i28 = 2040298597;
                    }
                    i33 = iM559711 ^ i28;
                    i32 = i27;
                    break;
                case 708893600:
                case 1439828910:
                    C1071.m56343();
                    C0946.m55980();
                    iM559711 = C0946.m55979("۠᩹") ^ i31;
                    i27 = ((iM559711 ^ i30) * 12799) ^ 1871792732;
                    i28 = 78516685;
                    i33 = iM559711 ^ i28;
                    i32 = i27;
                    break;
                case 714098186:
                case 2138442788:
                    if (C0906.f81862 < 0) {
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
                        iM55682 = C0873.m55680("۫᩵") ^ i31;
                        i32 = ((iM55682 ^ i30) * (-16235)) ^ 1728055494;
                        i14 = -921514789;
                        i15 = iM55682 ^ i14;
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
                        iM55979 = (i30 - C0873.m55680("ۚܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM55979 ^ i31) * 1575) ^ (-452915497);
                        i9 = 583010441;
                        i7 = iM55979 ^ i9;
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
                    sArr13 = f82237;
                    i34 = 7;
                    if (C0906.f81862 < 0) {
                        iM55979 = (C0946.m55979("֫֨") + i31) * (-111);
                        i6 = ((iM55979 ^ i30) * (-5831)) ^ 528783671;
                        i9 = -1977194811;
                        i7 = iM55979 ^ i9;
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
                        int iM559726 = C0946.m55979("ۨۖ") ^ i30;
                        i34 = i12;
                        i45 = i10;
                        char c14 = c;
                        sArr10 = sArr3;
                        i32 = ((iM559726 ^ i31) * (-10573)) ^ (-1441722551);
                        c4 = c14;
                        short[] sArr216 = sArr2;
                        i33 = iM559726 ^ (-701134929);
                        i35 = i13;
                        i46 = i11;
                        sArr14 = sArr216;
                    }
                    break;
                case 956232721:
                case 1790782602:
                    RunnableC0897.m55784();
                    if (!C0861.f81831) {
                        iM559711 = C0946.m55979("۠᩹") ^ i31;
                        i27 = ((iM559711 ^ i30) * 12799) ^ 1871792732;
                        i28 = 78516685;
                        i33 = iM559711 ^ i28;
                        i32 = i27;
                    } else {
                        sArr2 = sArr14;
                        sArr3 = sArr10;
                        i10 = i45;
                        i11 = i46;
                        i12 = i34;
                        i13 = i35;
                        c = c4;
                        int iM559727 = C0946.m55979("ۨۖ") ^ i30;
                        i34 = i12;
                        i45 = i10;
                        char c15 = c;
                        sArr10 = sArr3;
                        i32 = ((iM559727 ^ i31) * (-10573)) ^ (-1441722551);
                        c4 = c15;
                        short[] sArr217 = sArr2;
                        i33 = iM559727 ^ (-701134929);
                        i35 = i13;
                        i46 = i11;
                        sArr14 = sArr217;
                    }
                    break;
                case 1061082356:
                case 1897381057:
                    C1003.m56121(sb, C1229.m56403(sArr12, i36, i37, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM5597117 = (C0946.m55979("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM5597117 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM5597117 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case 1095314921:
                case 2130941762:
                    if (C0912.f81867 <= 0) {
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
                        iM55683 = (C0946.m55979("᩵ۚ") ^ i30) * 45;
                        i20 = ((iM55683 ^ i31) * 17625) ^ 1670876060;
                        i21 = -371564446;
                        i34 = i19;
                        i45 = i18;
                        sArr8 = sArr5;
                        i33 = iM55683 ^ i21;
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
                        iM559711 = C0946.m55979("۠᩹") ^ i31;
                        i27 = ((iM559711 ^ i30) * 12799) ^ 1871792732;
                        i28 = 78516685;
                        i33 = iM559711 ^ i28;
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
                    sArr9 = f82237;
                    if (C0845.f81821 >= 0) {
                        iM55683 = (C0946.m55979("᩵ۚ") ^ i30) * 45;
                        i20 = ((iM55683 ^ i31) * 17625) ^ 1670876060;
                        i21 = -371564446;
                    } else {
                        iM55683 = (C0873.m55680("ۘ֨") + i31) * 81;
                        i20 = ((iM55683 ^ i30) * (-26509)) ^ (-425397623);
                        i21 = 513815121;
                    }
                    i34 = i19;
                    i45 = i18;
                    sArr8 = sArr5;
                    i33 = iM55683 ^ i21;
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
                    C0912.m55825(sb, strM56161);
                    C0863.m55629(sb, c4);
                    C0946.m55977(sb, ';');
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM5597118 = (C0946.m55979("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM5597118 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM5597118 ^ (-1034208596);
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
                        iM559710 = (C0873.m55680("᩷᩸") ^ i30) * (-17);
                        i16 = ((iM559710 ^ i31) * 16959) ^ 1978692405;
                        i17 = -755188596;
                    } else {
                        iM559710 = (C0873.m55680("᩹ۛ") + i31) * (-63);
                        i16 = ((iM559710 ^ i30) * 24385) ^ (-2081846549);
                        i17 = 1195777229;
                    }
                    i24 = iM559710 ^ i17;
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
                        iM559711 = C0946.m55979("᩹ܺ") ^ i30;
                        i27 = ((iM559711 ^ i31) * (-31545)) ^ (-1882294403);
                        i28 = 750203532;
                    } else {
                        iM559711 = C0873.m55680("ۚܳ") ^ i30;
                        i27 = ((iM559711 ^ i31) * (-31891)) ^ 832693531;
                        i28 = -2063601562;
                    }
                    i33 = iM559711 ^ i28;
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
                    if (ServiceConnectionC1013.f81940 < 0) {
                        int iM559728 = (i30 - C0946.m55979("ᩳۛ")) * (-91);
                        s = s;
                        i32 = ((iM559728 ^ i31) * (-16065)) ^ 2144208001;
                        i15 = iM559728 ^ (-158561756);
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
                        int iM55686 = (i31 - C0873.m55680("֫ܰ")) * (-75);
                        s = s;
                        i32 = ((iM55686 ^ i30) * (-30801)) ^ 606520359;
                        i34 = i5;
                        i45 = i8;
                        sArr8 = sArr2;
                        i33 = iM55686 ^ 840250923;
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
                    strM56161 = ServiceConnectionC1013.m56161(sArr13, i34, 2, i39);
                    if (c4 != c6) {
                        iM55979 = (C0873.m55680("ܿܺ") + i30) * 85;
                        i6 = ((iM55979 ^ i31) * 32377) ^ 921222071;
                        i9 = 959450442;
                    } else {
                        iM55979 = (C0946.m55979("ۖܰ") ^ i31) * 53;
                        i6 = ((iM55979 ^ i30) * 16477) ^ 812814802;
                        i9 = 2136631562;
                    }
                    i7 = iM55979 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m38152() {
        return this.f49792;
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m38149() {
        return this.f49793;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38144(byte[] bArr) {
        this.f49793 = bArr;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m38153() {
        return this.f49794;
    }
}
