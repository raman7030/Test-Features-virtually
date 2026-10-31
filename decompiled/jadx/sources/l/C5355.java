package l;

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
public final class C5355 {

    /* JADX INFO: renamed from: ۛۚ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f16689 = {5994, -4872, -4889, -4869, -4889, -4879, -4867, -4871, -4889, -4872, -4871, -4871, -4867, -4868, -4889, -4870, -4889, -4872, -4889, -4866, -4872, -4889, -4870, -4889, -4872, -4870, -4869, -4889, -4871, -4889, -4870, -4867, -4872, -4889, -4870, -4889, -4872, -4870, -4869, -4889, -4871, -4889, -4870, -4868, -4967, -4892, -4869, -4868, -4865, -4967, -4892, -4870, -4879, -4867, -4967, -4892, -4868, -4869, -4872};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f16690;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f16691;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f16692;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f16693;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final BigInteger f16694;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BigInteger f16695;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f16696;

    public C5355(int i, String str, int i2, BigInteger bigInteger, BigInteger bigInteger2, String str2, String str3) {
        int i3 = 1421472260;
        int i4 = C4263.f13799;
        int i5 = C1420.f5096;
        int iM6981 = C2105.m6981("ۨۛ") ^ i4;
        int i6 = ((iM6981 ^ i5) * (-28783)) ^ 932669238;
        int i7 = 755030986;
        while (true) {
            i3 = ((((i3 ^ i5) * 19611) >> 31) & i6) ^ (iM6981 ^ i7);
            switch (i3) {
                case -2113248190:
                case -2063752233:
                    if (C1294.m4372() <= 0) {
                        iM6981 = C0630.m2566("ۛ᩸") ^ i5;
                        i6 = ((iM6981 ^ i4) * 13725) ^ 1096065299;
                        i7 = 461535785;
                    } else {
                        iM6981 = C2105.m6981("ۧ᩺") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-20621)) ^ (-1928170087);
                        i7 = 1453195428;
                    }
                    break;
                case -2057202822:
                case -529691023:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("ۡۖ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-6719)) ^ 2130197041;
                        i7 = -1631262639;
                    } else {
                        iM6981 = C0630.m2566("ۚۛ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 7307) ^ 1574420426;
                        i7 = -1235839445;
                    }
                    break;
                case -2043450397:
                case -1959595070:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C2105.m6981("ۡۖ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-6719)) ^ 2130197041;
                        i7 = -1631262639;
                    } else {
                        iM6981 = C2105.m6981("ۘۛ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-6079)) ^ (-814731330);
                        i7 = -1559249873;
                    }
                    break;
                case -1757692723:
                case -1360134611:
                    ServiceConnectionC3453.m10564();
                    C2105.m6982();
                    throw new RuntimeException();
                case -1364234341:
                case 1656936959:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C2105.m6981("ۢ۠") ^ i5) * 37;
                        i6 = ((iM6981 ^ i4) * 23307) ^ 169412894;
                        i7 = 1527293791;
                    } else {
                        iM6981 = C0630.m2566("֨ۧ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-27367)) ^ 695249463;
                        i7 = 1668300401;
                    }
                    break;
                case -1268484374:
                case 1524281141:
                    this.f16695 = bigInteger2;
                    this.f16691 = str2;
                    this.f16693 = str3;
                    return;
                case -1177564629:
                case 624628354:
                    this.f16694 = bigInteger;
                    if (C3683.f11629 >= 0) {
                        iM6981 = (C2105.m6981("ܳ᩷") ^ i5) * (-99);
                        i6 = ((iM6981 ^ i4) * (-26169)) ^ (-1385461013);
                        i7 = -1435196081;
                    } else {
                        iM6981 = (C0630.m2566("ܰۘ") ^ i4) * (-39);
                        i6 = ((iM6981 ^ i5) * (-12707)) ^ (-941887589);
                        i7 = 1594259381;
                    }
                    break;
                case -691857882:
                case 549082074:
                    this.f16692 = i2;
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C0630.m2566("ۧܳ") ^ i4) * 17;
                        i6 = ((iM6981 ^ i5) * 795) ^ 316953869;
                        i7 = -1848428049;
                    } else {
                        iM6981 = (C2105.m6981("۟ᩴ") ^ i5) * (-93);
                        i6 = ((iM6981 ^ i4) * 15301) ^ 506622718;
                        i7 = -431685528;
                    }
                    break;
                case -523912008:
                case 1719870073:
                    if (C1128.m3851() <= 0) {
                        iM6981 = C2105.m6981("ۡۖ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-6719)) ^ 2130197041;
                        i7 = -1631262639;
                    } else {
                        iM6981 = (C2105.m6981("ۜ᩵") ^ i5) * 37;
                        i6 = ((iM6981 ^ i4) * (-1205)) ^ (-1403478424);
                        i7 = 743708176;
                    }
                    break;
                case -335606357:
                case 691135062:
                    C3019.m9255();
                    C1047.m3599();
                    iM6981 = (C2105.m6981("ۢ۠") ^ i5) * 37;
                    i6 = ((iM6981 ^ i4) * 23307) ^ 169412894;
                    i7 = 1527293791;
                    break;
                case -113232196:
                case 1654678079:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("ۡۖ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-6719)) ^ 2130197041;
                        i7 = -1631262639;
                    } else {
                        iM6981 = (C0630.m2566("ۧܳ") ^ i4) * 17;
                        i6 = ((iM6981 ^ i5) * 795) ^ 316953869;
                        i7 = -1848428049;
                    }
                    break;
                case 425471505:
                case 1599345304:
                    this.f16696 = i;
                    this.f16690 = str;
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C0630.m2566("ۛ᩸") ^ i5;
                        i6 = ((iM6981 ^ i4) * 13725) ^ 1096065299;
                        i7 = 461535785;
                    } else {
                        iM6981 = C0630.m2566("ۛۢ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-27015)) ^ 1430482808;
                        i7 = 116001849;
                    }
                    break;
                case 836655845:
                case 884448219:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C2105.m6981("ܳ᩷") ^ i5) * (-99);
                        i6 = ((iM6981 ^ i4) * (-26169)) ^ (-1385461013);
                        i7 = -1435196081;
                    } else {
                        iM6981 = (C0630.m2566("ᩳ֫") + i4) * 69;
                        i6 = ((iM6981 ^ i5) * 13491) ^ (-532241251);
                        i7 = -1685653981;
                    }
                    break;
                case 1159728330:
                case 1220966705:
                    if (C1005.f3721) {
                        iM6981 = C0630.m2566("ܰۧ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 631) ^ (-946139869);
                        i7 = 15423300;
                    } else {
                        iM6981 = C2105.m6981("ۡۖ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-6719)) ^ 2130197041;
                        i7 = -1631262639;
                    }
                    break;
                case 1481133888:
                case 1945380494:
                    if (C7811.m20844() == 0) {
                        iM6981 = (C0630.m2566("ۧܳ") ^ i4) * 17;
                        i6 = ((iM6981 ^ i5) * 795) ^ 316953869;
                        i7 = -1848428049;
                    } else {
                        iM6981 = (C2105.m6981("ۢ۠") ^ i5) * 37;
                        i6 = ((iM6981 ^ i4) * 23307) ^ 169412894;
                        i7 = 1527293791;
                    }
                    break;
                default:
                    ServiceConnectionC3453.m10564();
                    if (!AbstractC2021.m6574()) {
                        iM6981 = (C2105.m6981("ۢ۠") ^ i5) * 37;
                        i6 = ((iM6981 ^ i4) * 23307) ^ 169412894;
                        i7 = 1527293791;
                    } else {
                        iM6981 = C0630.m2566("ۛ᩸") ^ i5;
                        i6 = ((iM6981 ^ i4) * 13725) ^ 1096065299;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5355 m15316(PublicKey publicKey) {
        String str;
        String strM12578;
        int iM2566;
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
        int i6 = C7811.f24123;
        int i7 = C0422.f1886;
        int iM2567 = (C0630.m2566("ܰ۟") ^ i6) * (-41);
        int i8 = ((iM2567 ^ i7) * 247) ^ (-1543797384);
        int i9 = iM2567 ^ 476676585;
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
                        iM2566 = C2105.m6981("ܰܺ") ^ i6;
                        i = ((iM2566 ^ i7) * (-2985)) ^ (-1534449151);
                        i2 = 925935890;
                    } else {
                        iM2566 = C2105.m6981("۠ᩳ") ^ i7;
                        i = ((iM2566 ^ i6) * (-12679)) ^ (-498756758);
                        i2 = -67751829;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -2039198043:
                case -139049255:
                    C7106.m19120();
                    if (C4263.m12819() >= 0) {
                        iM2566 = C2105.m6981("᩵ۗ") ^ i7;
                        i = ((iM2566 ^ i6) * (-22871)) ^ (-550864553);
                        i2 = 805472325;
                    } else {
                        iM2566 = (C2105.m6981("᩶ۡ") + i7) * 59;
                        i = ((iM2566 ^ i6) * (-9599)) ^ (-971799265);
                        i2 = -486923684;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -2034202017:
                case 226527626:
                    eCPublicKey = (ECPublicKey) publicKey;
                    if (eCPublicKey.getParams() == null) {
                        iM2566 = C0630.m2566("֨֨") ^ i7;
                        i = ((iM2566 ^ i6) * 16273) ^ 303492735;
                        i2 = 1794998251;
                    } else {
                        iM2566 = C0630.m2566("ᩳܺ") ^ i6;
                        i = ((iM2566 ^ i7) * 21701) ^ 156803273;
                        i2 = -1502188963;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1967860872:
                case -209621279:
                    i4 = i3 + 323928004;
                    s = 35996;
                    if (C0237.m1481() >= 0) {
                        iM2566 = C0630.m2566("ۢۤ") ^ i6;
                        i = ((iM2566 ^ i7) * (-16519)) ^ (-1138618289);
                        i2 = 60974750;
                    } else {
                        iM2566 = (i7 - C2105.m6981("᩵ᩴ")) * (-91);
                        i = ((iM2566 ^ i6) * 16695) ^ 1275875670;
                        i2 = 1473517220;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1958982243:
                case -1498814297:
                    if (C1420.f5096 <= 0) {
                        iM2566 = C2105.m6981("ܳۤ") ^ i7;
                        i = ((iM2566 ^ i6) * (-9779)) ^ (-1506883062);
                        i2 = 650841819;
                    } else {
                        iM2566 = C0630.m2566("ۢۤ") ^ i6;
                        i = ((iM2566 ^ i7) * (-16519)) ^ (-1138618289);
                        i2 = 60974750;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1850358388:
                case -1691095630:
                    if (publicKey instanceof RSAPublicKey) {
                        iM2566 = (i7 - C2105.m6981("۠۟")) * (-57);
                        i = ((iM2566 ^ i6) * (-13367)) ^ (-990985709);
                        i2 = 1849047730;
                    } else {
                        iM2566 = (i6 - C0630.m2566("֡ۧ")) * (-29);
                        i = ((iM2566 ^ i7) * 8657) ^ (-1070201141);
                        i2 = 1389291557;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1844353986:
                case -484598535:
                    if (publicKey instanceof DSAPublicKey) {
                        iM2566 = (C2105.m6981("ᩳ᩷") ^ i7) * 7;
                        i = ((iM2566 ^ i6) * (-16413)) ^ (-223881011);
                        i2 = 509947952;
                    } else {
                        iM2566 = C2105.m6981("᩷֨") ^ i6;
                        i = ((iM2566 ^ i7) * 14777) ^ 662886781;
                        i2 = -1890022252;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1838845483:
                case -482324856:
                    s2 = sArr[c];
                    i3 = s2 * s2;
                    if (C4159.m12565() >= 0) {
                        iM2566 = C0630.m2566("ۢۤ") ^ i6;
                        i = ((iM2566 ^ i7) * (-16519)) ^ (-1138618289);
                        i2 = 60974750;
                    } else {
                        iM2566 = (i6 - C2105.m6981("ܽ᩵")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i7) * (-4843)) ^ (-577948103);
                        i2 = -1404299943;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1781803522:
                case 502868540:
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
                    String algorithm = publicKey.getAlgorithm();
                    if (C4263.f13799 <= 0) {
                        iM2566 = C0630.m2566("ۢۤ") ^ i6;
                        i = ((iM2566 ^ i7) * (-16519)) ^ (-1138618289);
                        i2 = 60974750;
                    } else {
                        BigInteger modulus = rSAPublicKey.getModulus();
                        if (C1916.f6442) {
                            int iBitLength2 = modulus.bitLength();
                            BigInteger publicExponent = rSAPublicKey.getPublicExponent();
                            if (C3746.f11829 <= 0) {
                                iM2566 = C0630.m2566("۬ܳ") ^ i6;
                                i = ((iM2566 ^ i7) * (-19287)) ^ (-232319915);
                                i2 = 1179016793;
                            } else {
                                BigInteger modulus2 = rSAPublicKey.getModulus();
                                if (C1294.f4556 < 0) {
                                    return new C5355(1, algorithm, iBitLength2, publicExponent, modulus2, null, null);
                                }
                                iM2566 = (C2105.m6981("᩶ۡ") + i7) * 59;
                                i = ((iM2566 ^ i6) * (-9599)) ^ (-971799265);
                                i2 = -486923684;
                            }
                        } else {
                            iM2566 = C2105.m6981("ۡܰ") ^ i6;
                            i = ((iM2566 ^ i7) * 16201) ^ (-1885335851);
                            i2 = 535163217;
                        }
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1701169245:
                case 1941923036:
                    try {
                        id = ((ASN1ObjectIdentifier) parameters).getId();
                    } catch (Exception unused) {
                        id = str2;
                    }
                    iM2566 = (C0630.m2566("ۡᩴ") ^ i6) * 25;
                    i = ((iM2566 ^ i7) * (-30311)) ^ 1110947886;
                    i2 = 2073703983;
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1662829775:
                case 965783062:
                    sArr = f16689;
                    c = 0;
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("۬ܳ") ^ i6;
                        i = ((iM2566 ^ i7) * (-19287)) ^ (-232319915);
                        i2 = 1179016793;
                    } else {
                        iM2566 = (C0630.m2566("ۜۢ") + i7) * (-87);
                        i = ((iM2566 ^ i6) * (-4177)) ^ (-1255387019);
                        i2 = 363123146;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1652763083:
                case 176238434:
                    C0714.m2805();
                    return null;
                case -1590484584:
                case 468584443:
                    String algorithm2 = publicKey.getAlgorithm();
                    if (id != null) {
                        switch (C0630.m2566(id)) {
                            case 367694928:
                                if (!ViewOnClickListenerC1958.m6437(id, RunnableC0588.m2436(f16689, 1, 19, i10))) {
                                    b = -1;
                                }
                                break;
                            case 1290711797:
                                if (!C1294.m4369(id, C2272.m7507(f16689, 20, 12, i10))) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 1290711798:
                                if (!C1294.m4369(id, C3537.m10748(f16689, 32, 12, i10))) {
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
                                strM12578 = C4159.m12578(f16689, 44, 5, i10);
                                str = strM12578;
                                break;
                            case 1:
                                strM12578 = C0714.m2816(f16689, 49, 5, i10);
                                str = strM12578;
                                break;
                            case 2:
                                strM12578 = C7811.m20837(f16689, 54, 5, i10);
                                str = strM12578;
                                break;
                            default:
                                str = str2;
                                break;
                        }
                    } else {
                        str = str2;
                    }
                    return new C5355(2, algorithm2, fieldSize, null, null, str, id);
                case -1489992342:
                case 1042328523:
                    if (C3683.m11222()) {
                        iM2566 = C2105.m6981("ۛ᩹") ^ i6;
                        i = ((iM2566 ^ i7) * 4179) ^ 496208639;
                        i2 = 747437452;
                    } else {
                        iM2566 = C2105.m6981("ᩴ۠") ^ i7;
                        i = ((iM2566 ^ i6) * 27993) ^ (-81955865);
                        i2 = -1076026370;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1489675757:
                case 231067886:
                    C0964.m3413();
                    C0798.m2998();
                    iM2566 = C2105.m6981("ۛ᩹") ^ i6;
                    i = ((iM2566 ^ i7) * 4179) ^ 496208639;
                    i2 = 747437452;
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1377381536:
                case 1051423682:
                    String algorithm3 = publicKey.getAlgorithm();
                    if (C0714.m2805()) {
                        if (C3245.m9925() == 0) {
                            return new C5355(0, algorithm3, 0, null, null, null, null);
                        }
                        iM2566 = (C0630.m2566("ۖۧ") + i7) * (-83);
                        i = ((iM2566 ^ i6) * (-17163)) ^ (-573123669);
                        i2 = 1306246221;
                    } else {
                        iM2566 = C0630.m2566("ۢۤ") ^ i6;
                        i = ((iM2566 ^ i7) * (-16519)) ^ (-1138618289);
                        i2 = 60974750;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1374295943:
                case -766957027:
                    C0050.m940();
                    if (C3746.f11829 > 0) {
                        iM2566 = C2105.m6981("ܳۤ") ^ i7;
                        i = ((iM2566 ^ i6) * (-9779)) ^ (-1506883062);
                        i2 = 650841819;
                    } else {
                        iM2566 = C2105.m6981("᩵ۗ") ^ i7;
                        i = ((iM2566 ^ i6) * (-22871)) ^ (-550864553);
                        i2 = 805472325;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1338151437:
                case 23006258:
                    params = ((DSAPublicKey) publicKey).getParams();
                    if (params == null) {
                        iM2566 = C0630.m2566("ۘۗ") ^ i6;
                        i = ((iM2566 ^ i7) * 12031) ^ 802690962;
                        i2 = -511966534;
                    } else {
                        iM2566 = (C2105.m6981("ۜ᩷") ^ i7) * (-31);
                        i = ((iM2566 ^ i6) * (-13311)) ^ 1141342131;
                        i2 = 118000148;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1303216229:
                case -228399056:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (i6 - C0630.m2566("ۘܶ")) * (-111);
                        i = ((iM2566 ^ i7) * (-32165)) ^ (-728857847);
                        i2 = -430550678;
                    } else {
                        iM2566 = C2105.m6981("ۡܰ") ^ i6;
                        i = ((iM2566 ^ i7) * 16201) ^ (-1885335851);
                        i2 = 535163217;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1111151420:
                case 1998341356:
                    i10 = 35670;
                    iM2566 = C0630.m2566("ܰ᩺") ^ i7;
                    i = ((iM2566 ^ i6) * (-31037)) ^ (-1075829222);
                    i2 = -1990295609;
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -939061417:
                case 1513498344:
                    parameters = SubjectPublicKeyInfo.getInstance(encoded).getAlgorithm().getParameters();
                    z = parameters instanceof ASN1ObjectIdentifier;
                    iM2566 = C2105.m6981("ۖ᩻") ^ i6;
                    i = ((iM2566 ^ i7) * 12489) ^ (-612266772);
                    i2 = -612912218;
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -429128628:
                case 1184605411:
                    i10 = 60617;
                    iM2566 = C0630.m2566("ܰ᩺") ^ i7;
                    i = ((iM2566 ^ i6) * (-31037)) ^ (-1075829222);
                    i2 = -1990295609;
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -369657422:
                case 1051706003:
                    C21923.m49329();
                    if (C22628.m50615() == 0) {
                        iM2566 = C2105.m6981("ۛ᩹") ^ i6;
                        i = ((iM2566 ^ i7) * 4179) ^ 496208639;
                        i2 = 747437452;
                    } else {
                        iM2566 = C2105.m6981("ܳۤ") ^ i7;
                        i = ((iM2566 ^ i6) * (-9779)) ^ (-1506883062);
                        i2 = 650841819;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -287511773:
                case 402094078:
                    String algorithm4 = publicKey.getAlgorithm();
                    if (C3245.f10203 > 0) {
                        return new C5355(3, algorithm4, iBitLength, null, null, null, null);
                    }
                    iM2566 = (C0630.m2566("ۖۧ") + i7) * (-83);
                    i = ((iM2566 ^ i6) * (-17163)) ^ (-573123669);
                    i2 = 1306246221;
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -205167740:
                case 1544369784:
                    if (C4117.f13076 <= 0) {
                        iM2566 = C2105.m6981("ۛ᩹") ^ i6;
                        i = ((iM2566 ^ i7) * 4179) ^ 496208639;
                        i2 = 747437452;
                    } else {
                        iM2566 = (C0630.m2566("ۖۧ") + i7) * (-83);
                        i = ((iM2566 ^ i6) * (-17163)) ^ (-573123669);
                        i2 = 1306246221;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -58809650:
                case 1513805024:
                    iBitLength = params.getP().bitLength();
                    iM2566 = C0630.m2566("ۜۚ") ^ i6;
                    i = ((iM2566 ^ i7) * (-23097)) ^ 1124667989;
                    i2 = 1596781850;
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case 277391530:
                case 1290125247:
                    encoded = publicKey.getEncoded();
                    str2 = null;
                    if (encoded == null) {
                        id = str2;
                        iM2566 = (C0630.m2566("ۡᩴ") ^ i6) * 25;
                        i = ((iM2566 ^ i7) * (-30311)) ^ 1110947886;
                        i2 = 2073703983;
                    } else {
                        iM2566 = (C0630.m2566("۟ۜ") ^ i7) * 97;
                        i = ((iM2566 ^ i6) * 8991) ^ 1781428218;
                        i2 = -1186733045;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case 394630205:
                case 552647505:
                    fieldSize = eCPublicKey.getParams().getCurve().getField().getFieldSize();
                    iM2566 = C0630.m2566("᩹ܶ") ^ i7;
                    i = ((iM2566 ^ i6) * (-14719)) ^ (-957384178);
                    i2 = 140562550;
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case 420184309:
                case 686485574:
                    if (C1294.m4372() > 0) {
                        iM2566 = C2105.m6981("ܳۤ") ^ i7;
                        i = ((iM2566 ^ i6) * (-9779)) ^ (-1506883062);
                        i2 = 650841819;
                    } else {
                        iM2566 = (i6 - C0630.m2566("ۘܶ")) * (-111);
                        i = ((iM2566 ^ i7) * (-32165)) ^ (-728857847);
                        i2 = -430550678;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case 436609843:
                case 1914079722:
                    fieldSize = 0;
                    iM2566 = C0630.m2566("᩹ܶ") ^ i7;
                    i = ((iM2566 ^ i6) * (-14719)) ^ (-957384178);
                    i2 = 140562550;
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case 599691479:
                case 1351359746:
                    iBitLength = 0;
                    iM2566 = C0630.m2566("ۜۚ") ^ i6;
                    i = ((iM2566 ^ i7) * (-23097)) ^ 1124667989;
                    i2 = 1596781850;
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case 1527596819:
                case 1787271300:
                    if (z) {
                        iM2566 = C2105.m6981("ܰۙ") ^ i7;
                        i = ((iM2566 ^ i6) * (-31795)) ^ (-502923236);
                        i2 = 1800716916;
                    } else {
                        id = str2;
                        iM2566 = (C0630.m2566("ۡᩴ") ^ i6) * 25;
                        i = ((iM2566 ^ i7) * (-30311)) ^ 1110947886;
                        i2 = 2073703983;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                default:
                    if ((s2 * s) - i4 > 0) {
                        iM2566 = C2105.m6981("᩹ܿ") ^ i6;
                        i = ((iM2566 ^ i7) * (-14463)) ^ 2045216136;
                        i2 = -957367731;
                    } else {
                        iM2566 = (i6 - C2105.m6981("֫ۖ")) * (-7);
                        i = ((iM2566 ^ i7) * (-5897)) ^ (-1587230060);
                        i2 = 1693727807;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
            }
        }
    }
}
