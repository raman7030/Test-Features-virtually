package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: renamed from: l.ۚ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes2.dex */
public final class C7458 {

    /* JADX INFO: renamed from: ۛۚ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f81997 = {5994, -4872, -4889, -4869, -4889, -4879, -4867, -4871, -4889, -4872, -4871, -4871, -4867, -4868, -4889, -4870, -4889, -4872, -4889, -4866, -4872, -4889, -4870, -4889, -4872, -4870, -4869, -4889, -4871, -4889, -4870, -4867, -4872, -4889, -4870, -4889, -4872, -4870, -4869, -4889, -4871, -4889, -4870, -4868, -4967, -4892, -4869, -4868, -4865, -4967, -4892, -4870, -4879, -4867, -4967, -4892, -4868, -4869, -4872};

    /* JADX INFO: renamed from: ֫ */
    public final String f19528;

    /* JADX INFO: renamed from: ۧ */
    public final String f19529;

    /* JADX INFO: renamed from: ܳ */
    public final int f19530;

    /* JADX INFO: renamed from: ܽ */
    public final String f19531;

    /* JADX INFO: renamed from: ܿ */
    public final BigInteger f19532;

    /* JADX INFO: renamed from: ᩳ */
    public final BigInteger f19533;

    /* JADX INFO: renamed from: ᩻ */
    public final int f19534;

    public C7458(int i, String str, int i2, BigInteger bigInteger, BigInteger bigInteger2, String str2, String str3) {
        int i3 = 1421472260;
        int i4 = C1053.f81965;
        int i5 = C0912.f81867;
        int iM55979 = C0946.m55979("ۨۛ") ^ i4;
        int i6 = ((iM55979 ^ i5) * (-28783)) ^ 932669238;
        int i7 = 755030986;
        while (true) {
            i3 = ((((i3 ^ i5) * 19611) >> 31) & i6) ^ (iM55979 ^ i7);
            switch (i3) {
                case -2113248190:
                case -2063752233:
                    if (C0906.m55809() <= 0) {
                        iM55979 = C0873.m55680("ۛ᩸") ^ i5;
                        i6 = ((iM55979 ^ i4) * 13725) ^ 1096065299;
                        i7 = 461535785;
                    } else {
                        iM55979 = C0946.m55979("ۧ᩺") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-20621)) ^ (-1928170087);
                        i7 = 1453195428;
                    }
                    break;
                case -2057202822:
                case -529691023:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0946.m55979("ۡۖ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-6719)) ^ 2130197041;
                        i7 = -1631262639;
                    } else {
                        iM55979 = C0873.m55680("ۚۛ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 7307) ^ 1574420426;
                        i7 = -1235839445;
                    }
                    break;
                case -2043450397:
                case -1959595070:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("ۡۖ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-6719)) ^ 2130197041;
                        i7 = -1631262639;
                    } else {
                        iM55979 = C0946.m55979("ۘۛ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-6079)) ^ (-814731330);
                        i7 = -1559249873;
                    }
                    break;
                case -1757692723:
                case -1360134611:
                    ServiceConnectionC1013.m56157();
                    C0946.m55980();
                    throw new RuntimeException();
                case -1364234341:
                case 1656936959:
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0946.m55979("ۢ۠") ^ i5) * 37;
                        i6 = ((iM55979 ^ i4) * 23307) ^ 169412894;
                        i7 = 1527293791;
                    } else {
                        iM55979 = C0873.m55680("֨ۧ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-27367)) ^ 695249463;
                        i7 = 1668300401;
                    }
                    break;
                case -1268484374:
                case 1524281141:
                    this.f19533 = bigInteger2;
                    this.f19529 = str2;
                    this.f19531 = str3;
                    return;
                case -1177564629:
                case 624628354:
                    this.f19532 = bigInteger;
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0946.m55979("ܳ᩷") ^ i5) * (-99);
                        i6 = ((iM55979 ^ i4) * (-26169)) ^ (-1385461013);
                        i7 = -1435196081;
                    } else {
                        iM55979 = (C0873.m55680("ܰۘ") ^ i4) * (-39);
                        i6 = ((iM55979 ^ i5) * (-12707)) ^ (-941887589);
                        i7 = 1594259381;
                    }
                    break;
                case -691857882:
                case 549082074:
                    this.f19530 = i2;
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0873.m55680("ۧܳ") ^ i4) * 17;
                        i6 = ((iM55979 ^ i5) * 795) ^ 316953869;
                        i7 = -1848428049;
                    } else {
                        iM55979 = (C0946.m55979("۟ᩴ") ^ i5) * (-93);
                        i6 = ((iM55979 ^ i4) * 15301) ^ 506622718;
                        i7 = -431685528;
                    }
                    break;
                case -523912008:
                case 1719870073:
                    if (C0898.m55800() <= 0) {
                        iM55979 = C0946.m55979("ۡۖ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-6719)) ^ 2130197041;
                        i7 = -1631262639;
                    } else {
                        iM55979 = (C0946.m55979("ۜ᩵") ^ i5) * 37;
                        i6 = ((iM55979 ^ i4) * (-1205)) ^ (-1403478424);
                        i7 = 743708176;
                    }
                    break;
                case -335606357:
                case 691135062:
                    C0992.m56107();
                    C0894.m55769();
                    iM55979 = (C0946.m55979("ۢ۠") ^ i5) * 37;
                    i6 = ((iM55979 ^ i4) * 23307) ^ 169412894;
                    i7 = 1527293791;
                    break;
                case -113232196:
                case 1654678079:
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0946.m55979("ۡۖ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-6719)) ^ 2130197041;
                        i7 = -1631262639;
                    } else {
                        iM55979 = (C0873.m55680("ۧܳ") ^ i4) * 17;
                        i6 = ((iM55979 ^ i5) * 795) ^ 316953869;
                        i7 = -1848428049;
                    }
                    break;
                case 425471505:
                case 1599345304:
                    this.f19534 = i;
                    this.f19528 = str;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0873.m55680("ۛ᩸") ^ i5;
                        i6 = ((iM55979 ^ i4) * 13725) ^ 1096065299;
                        i7 = 461535785;
                    } else {
                        iM55979 = C0873.m55680("ۛۢ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-27015)) ^ 1430482808;
                        i7 = 116001849;
                    }
                    break;
                case 836655845:
                case 884448219:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0946.m55979("ܳ᩷") ^ i5) * (-99);
                        i6 = ((iM55979 ^ i4) * (-26169)) ^ (-1385461013);
                        i7 = -1435196081;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ֫") + i4) * 69;
                        i6 = ((iM55979 ^ i5) * 13491) ^ (-532241251);
                        i7 = -1685653981;
                    }
                    break;
                case 1159728330:
                case 1220966705:
                    if (C0892.f81851) {
                        iM55979 = C0873.m55680("ܰۧ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 631) ^ (-946139869);
                        i7 = 15423300;
                    } else {
                        iM55979 = C0946.m55979("ۡۖ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-6719)) ^ 2130197041;
                        i7 = -1631262639;
                    }
                    break;
                case 1481133888:
                case 1945380494:
                    if (C1229.m56410() == 0) {
                        iM55979 = (C0873.m55680("ۧܳ") ^ i4) * 17;
                        i6 = ((iM55979 ^ i5) * 795) ^ 316953869;
                        i7 = -1848428049;
                    } else {
                        iM55979 = (C0946.m55979("ۢ۠") ^ i5) * 37;
                        i6 = ((iM55979 ^ i4) * 23307) ^ 169412894;
                        i7 = 1527293791;
                    }
                    break;
                default:
                    ServiceConnectionC1013.m56157();
                    if (!AbstractC0942.m55971()) {
                        iM55979 = (C0946.m55979("ۢ۠") ^ i5) * 37;
                        i6 = ((iM55979 ^ i4) * 23307) ^ 169412894;
                        i7 = 1527293791;
                    } else {
                        iM55979 = C0873.m55680("ۛ᩸") ^ i5;
                        i6 = ((iM55979 ^ i4) * 13725) ^ 1096065299;
                        i7 = 461535785;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:113:0x0373  */
    /* JADX WARN: Code duplicated, block: B:140:0x0494 A[PHI: r10 r14 r15 r16
      0x0494: PHI (r10v6 short) = (r10v4 short), (r10v2 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:139:0x0492, B:135:0x0470, B:109:0x0367, B:93:0x02c3, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0494: PHI (r14v4 int) = (r14v3 int), (r14v1 int), (r14v1 int), (r14v1 int), (r14v1 int) binds: [B:139:0x0492, B:135:0x0470, B:109:0x0367, B:93:0x02c3, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0494: PHI (r15v4 int) = (r15v1 int), (r15v3 int), (r15v1 int), (r15v1 int), (r15v1 int) binds: [B:139:0x0492, B:135:0x0470, B:109:0x0367, B:93:0x02c3, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0494: PHI (r16v6 short) = (r16v1 short), (r16v5 short), (r16v1 short), (r16v1 short), (r16v1 short) binds: [B:139:0x0492, B:135:0x0470, B:109:0x0367, B:93:0x02c3, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x04c7 A[PHI: r12 r23
      0x04c7: PHI (r12v4 char) = (r12v3 char), (r12v1 char) binds: [B:143:0x04c5, B:115:0x0393] A[DONT_GENERATE, DONT_INLINE]
      0x04c7: PHI (r23v5 short[]) = (r23v4 short[]), (r23v3 short[]) binds: [B:143:0x04c5, B:115:0x0393] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:60:0x0185  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:79:0x0202 A[PHI: r4 r17
      0x0202: PHI (r4v4 byte[]) = (r4v1 byte[]), (r4v2 byte[]), (r4v1 byte[]) binds: [B:147:0x0202, B:78:0x0200, B:42:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r17v6 java.lang.String) = (r17v2 java.lang.String), (r17v4 java.lang.String), (r17v2 java.lang.String) binds: [B:147:0x0202, B:78:0x0200, B:42:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static C7458 m17224(PublicKey publicKey) {
        String str;
        String strM56318;
        int iM55680;
        int i;
        int i2;
        ECPublicKey eCPublicKey = null;
        DSAParams params = null;
        byte[] encoded = null;
        ASN1Encodable parameters = null;
        String id = null;
        char c = 0;
        int i3 = 0;
        int i4 = 0;
        short s = 0;
        int i5 = 1999147505;
        int i6 = C1229.f82066;
        int i7 = C0863.f81833;
        int iM55681 = (C0873.m55680("ܰ۟") ^ i6) * (-41);
        int i8 = ((iM55681 ^ i7) * 247) ^ (-1543797384);
        int i9 = iM55681 ^ 476676585;
        String str2 = null;
        short[] sArr = null;
        int i10 = 0;
        boolean z = false;
        int iBitLength = 0;
        short s2 = 0;
        int fieldSize = 0;
        byte b = 0;
        while (true) {
            i5 = i9 ^ (i8 & (((i5 ^ i7) * (-12779)) >> 31));
            switch (i5) {
                case -2063541338:
                case -1272495793:
                    b = 0;
                    if (publicKey instanceof ECPublicKey) {
                        iM55680 = C0946.m55979("ܰܺ") ^ i6;
                        i = ((iM55680 ^ i7) * (-2985)) ^ (-1534449151);
                        i2 = 925935890;
                    } else {
                        iM55680 = C0946.m55979("۠ᩳ") ^ i7;
                        i = ((iM55680 ^ i6) * (-12679)) ^ (-498756758);
                        i2 = -67751829;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -2039198043:
                case -139049255:
                    C1194.m56396();
                    if (C1053.m56327() >= 0) {
                        iM55680 = C0946.m55979("᩵ۗ") ^ i7;
                        i = ((iM55680 ^ i6) * (-22871)) ^ (-550864553);
                        i2 = 805472325;
                    } else {
                        iM55680 = (C0946.m55979("᩶ۡ") + i7) * 59;
                        i = ((iM55680 ^ i6) * (-9599)) ^ (-971799265);
                        i2 = -486923684;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -2034202017:
                case 226527626:
                    eCPublicKey = (ECPublicKey) publicKey;
                    if (eCPublicKey.getParams() == null) {
                        iM55680 = C0873.m55680("֨֨") ^ i7;
                        i = ((iM55680 ^ i6) * 16273) ^ 303492735;
                        i2 = 1794998251;
                    } else {
                        iM55680 = C0873.m55680("ᩳܺ") ^ i6;
                        i = ((iM55680 ^ i7) * 21701) ^ 156803273;
                        i2 = -1502188963;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1967860872:
                case -209621279:
                    i4 = i3 + 323928004;
                    s = 35996;
                    if (C0854.m55595() >= 0) {
                        iM55680 = C0873.m55680("ۢۤ") ^ i6;
                        i = ((iM55680 ^ i7) * (-16519)) ^ (-1138618289);
                        i2 = 60974750;
                    } else {
                        iM55680 = (i7 - C0946.m55979("᩵ᩴ")) * (-91);
                        i = ((iM55680 ^ i6) * 16695) ^ 1275875670;
                        i2 = 1473517220;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1958982243:
                case -1498814297:
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0946.m55979("ܳۤ") ^ i7;
                        i = ((iM55680 ^ i6) * (-9779)) ^ (-1506883062);
                        i2 = 650841819;
                    } else {
                        iM55680 = C0873.m55680("ۢۤ") ^ i6;
                        i = ((iM55680 ^ i7) * (-16519)) ^ (-1138618289);
                        i2 = 60974750;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1850358388:
                case -1691095630:
                    if (publicKey instanceof RSAPublicKey) {
                        iM55680 = (i7 - C0946.m55979("۠۟")) * (-57);
                        i = ((iM55680 ^ i6) * (-13367)) ^ (-990985709);
                        i2 = 1849047730;
                    } else {
                        iM55680 = (i6 - C0873.m55680("֡ۧ")) * (-29);
                        i = ((iM55680 ^ i7) * 8657) ^ (-1070201141);
                        i2 = 1389291557;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1844353986:
                case -484598535:
                    if (publicKey instanceof DSAPublicKey) {
                        iM55680 = (C0946.m55979("ᩳ᩷") ^ i7) * 7;
                        i = ((iM55680 ^ i6) * (-16413)) ^ (-223881011);
                        i2 = 509947952;
                    } else {
                        iM55680 = C0946.m55979("᩷֨") ^ i6;
                        i = ((iM55680 ^ i7) * 14777) ^ 662886781;
                        i2 = -1890022252;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1838845483:
                case -482324856:
                    s2 = sArr[c];
                    i3 = s2 * s2;
                    if (C1048.m56305() >= 0) {
                        iM55680 = C0873.m55680("ۢۤ") ^ i6;
                        i = ((iM55680 ^ i7) * (-16519)) ^ (-1138618289);
                        i2 = 60974750;
                    } else {
                        iM55680 = (i6 - C0946.m55979("ܽ᩵")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i7) * (-4843)) ^ (-577948103);
                        i2 = -1404299943;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1781803522:
                case 502868540:
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
                    String algorithm = publicKey.getAlgorithm();
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0873.m55680("ۢۤ") ^ i6;
                        i = ((iM55680 ^ i7) * (-16519)) ^ (-1138618289);
                        i2 = 60974750;
                    } else {
                        BigInteger modulus = rSAPublicKey.getModulus();
                        if (C0937.f81884) {
                            int iBitLength2 = modulus.bitLength();
                            BigInteger publicExponent = rSAPublicKey.getPublicExponent();
                            if (C1028.f81950 <= 0) {
                                iM55680 = C0873.m55680("۬ܳ") ^ i6;
                                i = ((iM55680 ^ i7) * (-19287)) ^ (-232319915);
                                i2 = 1179016793;
                            } else {
                                BigInteger modulus2 = rSAPublicKey.getModulus();
                                if (C0906.f81862 < 0) {
                                    return new C7458(1, algorithm, iBitLength2, publicExponent, modulus2, null, null);
                                }
                                iM55680 = (C0946.m55979("᩶ۡ") + i7) * 59;
                                i = ((iM55680 ^ i6) * (-9599)) ^ (-971799265);
                                i2 = -486923684;
                            }
                        } else {
                            iM55680 = C0946.m55979("ۡܰ") ^ i6;
                            i = ((iM55680 ^ i7) * 16201) ^ (-1885335851);
                            i2 = 535163217;
                        }
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1701169245:
                case 1941923036:
                    try {
                        id = ((ASN1ObjectIdentifier) parameters).getId();
                    } catch (Exception unused) {
                        id = str2;
                    }
                    iM55680 = (C0873.m55680("ۡᩴ") ^ i6) * 25;
                    i = ((iM55680 ^ i7) * (-30311)) ^ 1110947886;
                    i2 = 2073703983;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1662829775:
                case 965783062:
                    sArr = f81997;
                    c = 0;
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("۬ܳ") ^ i6;
                        i = ((iM55680 ^ i7) * (-19287)) ^ (-232319915);
                        i2 = 1179016793;
                    } else {
                        iM55680 = (C0873.m55680("ۜۢ") + i7) * (-87);
                        i = ((iM55680 ^ i6) * (-4177)) ^ (-1255387019);
                        i2 = 363123146;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1652763083:
                case 176238434:
                    C0877.m55696();
                    return null;
                case -1590484584:
                case 468584443:
                    String algorithm2 = publicKey.getAlgorithm();
                    if (id != null) {
                        switch (C0873.m55680(id)) {
                            case 367694928:
                                if (!ViewOnClickListenerC0939.m55949(id, RunnableC0871.m55667(f81997, 1, 19, i10))) {
                                    b = -1;
                                }
                                break;
                            case 1290711797:
                                if (!C0906.m55806(id, C0955.m56029(f81997, 20, 12, i10))) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 1290711798:
                                if (!C0906.m55806(id, C1017.m56189(f81997, 32, 12, i10))) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                                strM56318 = C1048.m56318(f81997, 44, 5, i10);
                                str = strM56318;
                                break;
                            case 1:
                                strM56318 = C0877.m55707(f81997, 49, 5, i10);
                                str = strM56318;
                                break;
                            case 2:
                                strM56318 = C1229.m56403(f81997, 54, 5, i10);
                                str = strM56318;
                                break;
                            default:
                                str = str2;
                                break;
                        }
                    } else {
                        str = str2;
                    }
                    return new C7458(2, algorithm2, fieldSize, null, null, str, id);
                case -1489992342:
                case 1042328523:
                    if (C1025.m56230()) {
                        iM55680 = C0946.m55979("ۛ᩹") ^ i6;
                        i = ((iM55680 ^ i7) * 4179) ^ 496208639;
                        i2 = 747437452;
                    } else {
                        iM55680 = C0946.m55979("ᩴ۠") ^ i7;
                        i = ((iM55680 ^ i6) * 27993) ^ (-81955865);
                        i2 = -1076026370;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1489675757:
                case 231067886:
                    C0890.m55740();
                    C0882.m55710();
                    iM55680 = C0946.m55979("ۛ᩹") ^ i6;
                    i = ((iM55680 ^ i7) * 4179) ^ 496208639;
                    i2 = 747437452;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1377381536:
                case 1051423682:
                    String algorithm3 = publicKey.getAlgorithm();
                    if (C0877.m55696()) {
                        if (C1003.m56123() == 0) {
                            return new C7458(0, algorithm3, 0, null, null, null, null);
                        }
                        iM55680 = (C0873.m55680("ۖۧ") + i7) * (-83);
                        i = ((iM55680 ^ i6) * (-17163)) ^ (-573123669);
                        i2 = 1306246221;
                    } else {
                        iM55680 = C0873.m55680("ۢۤ") ^ i6;
                        i = ((iM55680 ^ i7) * (-16519)) ^ (-1138618289);
                        i2 = 60974750;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1374295943:
                case -766957027:
                    C0845.m55584();
                    if (C1028.f81950 > 0) {
                        iM55680 = C0946.m55979("ܳۤ") ^ i7;
                        i = ((iM55680 ^ i6) * (-9779)) ^ (-1506883062);
                        i2 = 650841819;
                    } else {
                        iM55680 = C0946.m55979("᩵ۗ") ^ i7;
                        i = ((iM55680 ^ i6) * (-22871)) ^ (-550864553);
                        i2 = 805472325;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1338151437:
                case 23006258:
                    params = ((DSAPublicKey) publicKey).getParams();
                    if (params == null) {
                        iM55680 = C0873.m55680("ۘۗ") ^ i6;
                        i = ((iM55680 ^ i7) * 12031) ^ 802690962;
                        i2 = -511966534;
                    } else {
                        iM55680 = (C0946.m55979("ۜ᩷") ^ i7) * (-31);
                        i = ((iM55680 ^ i6) * (-13311)) ^ 1141342131;
                        i2 = 118000148;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1303216229:
                case -228399056:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (i6 - C0873.m55680("ۘܶ")) * (-111);
                        i = ((iM55680 ^ i7) * (-32165)) ^ (-728857847);
                        i2 = -430550678;
                    } else {
                        iM55680 = C0946.m55979("ۡܰ") ^ i6;
                        i = ((iM55680 ^ i7) * 16201) ^ (-1885335851);
                        i2 = 535163217;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1111151420:
                case 1998341356:
                    i10 = 35670;
                    iM55680 = C0873.m55680("ܰ᩺") ^ i7;
                    i = ((iM55680 ^ i6) * (-31037)) ^ (-1075829222);
                    i2 = -1990295609;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -939061417:
                case 1513498344:
                    parameters = SubjectPublicKeyInfo.getInstance(encoded).getAlgorithm().getParameters();
                    z = parameters instanceof ASN1ObjectIdentifier;
                    iM55680 = C0946.m55979("ۖ᩻") ^ i6;
                    i = ((iM55680 ^ i7) * 12489) ^ (-612266772);
                    i2 = -612912218;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -429128628:
                case 1184605411:
                    i10 = 60617;
                    iM55680 = C0873.m55680("ܰ᩺") ^ i7;
                    i = ((iM55680 ^ i6) * (-31037)) ^ (-1075829222);
                    i2 = -1990295609;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -369657422:
                case 1051706003:
                    C1929.m56553();
                    if (C1964.m56597() == 0) {
                        iM55680 = C0946.m55979("ۛ᩹") ^ i6;
                        i = ((iM55680 ^ i7) * 4179) ^ 496208639;
                        i2 = 747437452;
                    } else {
                        iM55680 = C0946.m55979("ܳۤ") ^ i7;
                        i = ((iM55680 ^ i6) * (-9779)) ^ (-1506883062);
                        i2 = 650841819;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -287511773:
                case 402094078:
                    String algorithm4 = publicKey.getAlgorithm();
                    if (C1003.f81929 > 0) {
                        return new C7458(3, algorithm4, iBitLength, null, null, null, null);
                    }
                    iM55680 = (C0873.m55680("ۖۧ") + i7) * (-83);
                    i = ((iM55680 ^ i6) * (-17163)) ^ (-573123669);
                    i2 = 1306246221;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -205167740:
                case 1544369784:
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0946.m55979("ۛ᩹") ^ i6;
                        i = ((iM55680 ^ i7) * 4179) ^ 496208639;
                        i2 = 747437452;
                    } else {
                        iM55680 = (C0873.m55680("ۖۧ") + i7) * (-83);
                        i = ((iM55680 ^ i6) * (-17163)) ^ (-573123669);
                        i2 = 1306246221;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -58809650:
                case 1513805024:
                    iBitLength = params.getP().bitLength();
                    iM55680 = C0873.m55680("ۜۚ") ^ i6;
                    i = ((iM55680 ^ i7) * (-23097)) ^ 1124667989;
                    i2 = 1596781850;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case 277391530:
                case 1290125247:
                    encoded = publicKey.getEncoded();
                    str2 = null;
                    if (encoded == null) {
                        id = str2;
                        iM55680 = (C0873.m55680("ۡᩴ") ^ i6) * 25;
                        i = ((iM55680 ^ i7) * (-30311)) ^ 1110947886;
                        i2 = 2073703983;
                    } else {
                        iM55680 = (C0873.m55680("۟ۜ") ^ i7) * 97;
                        i = ((iM55680 ^ i6) * 8991) ^ 1781428218;
                        i2 = -1186733045;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case 394630205:
                case 552647505:
                    fieldSize = eCPublicKey.getParams().getCurve().getField().getFieldSize();
                    iM55680 = C0873.m55680("᩹ܶ") ^ i7;
                    i = ((iM55680 ^ i6) * (-14719)) ^ (-957384178);
                    i2 = 140562550;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case 420184309:
                case 686485574:
                    if (C0906.m55809() > 0) {
                        iM55680 = C0946.m55979("ܳۤ") ^ i7;
                        i = ((iM55680 ^ i6) * (-9779)) ^ (-1506883062);
                        i2 = 650841819;
                    } else {
                        iM55680 = (i6 - C0873.m55680("ۘܶ")) * (-111);
                        i = ((iM55680 ^ i7) * (-32165)) ^ (-728857847);
                        i2 = -430550678;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case 436609843:
                case 1914079722:
                    fieldSize = 0;
                    iM55680 = C0873.m55680("᩹ܶ") ^ i7;
                    i = ((iM55680 ^ i6) * (-14719)) ^ (-957384178);
                    i2 = 140562550;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case 599691479:
                case 1351359746:
                    iBitLength = 0;
                    iM55680 = C0873.m55680("ۜۚ") ^ i6;
                    i = ((iM55680 ^ i7) * (-23097)) ^ 1124667989;
                    i2 = 1596781850;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case 1527596819:
                case 1787271300:
                    if (z) {
                        iM55680 = C0946.m55979("ܰۙ") ^ i7;
                        i = ((iM55680 ^ i6) * (-31795)) ^ (-502923236);
                        i2 = 1800716916;
                    } else {
                        id = str2;
                        iM55680 = (C0873.m55680("ۡᩴ") ^ i6) * 25;
                        i = ((iM55680 ^ i7) * (-30311)) ^ 1110947886;
                        i2 = 2073703983;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                default:
                    if ((s2 * s) - i4 > 0) {
                        iM55680 = C0946.m55979("᩹ܿ") ^ i6;
                        i = ((iM55680 ^ i7) * (-14463)) ^ 2045216136;
                        i2 = -957367731;
                    } else {
                        iM55680 = (i6 - C0946.m55979("֫ۖ")) * (-7);
                        i = ((iM55680 ^ i7) * (-5897)) ^ (-1587230060);
                        i2 = 1693727807;
                    }
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
            }
        }
    }
}
