package l;

import android.util.Base64;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩹ۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V40L */
/* JADX INFO: loaded from: classes.dex */
public final class C22212 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13864 f72090;

    /* JADX INFO: renamed from: ᩸ܳܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f72091 = {5087, 28373, 28356, 28356, 28376, 28381, 28375, 28373, 28352, 28381, 28379, 28378, 28315, 28379, 28375, 28352, 28369, 28352, 28313, 28359, 28352, 28358, 28369, 28373, 28377, 28, 22237, 22228, 22158, 22210, 22268, 22267, 22157, 22225, 22175, 22263, 22223, 22232, 22148, 22159, 22163, 22173, 22235, 22257, 22259, 22244, 22247, 22222, 22244, 22242, 22210, 22227, 22151, 22212, 22237, 22260, 22259, 22236, 22235, 22235, 22156, 22160, 22230, 22227, 22252, 22250, -10509, -12999, 3214, 22205, 22245, 22226, 22212, 22215, 22232, 22233, 22212, 22226, 22167, 22228, 22232, 22227, 22226, 22157, 22167, 22260, 22232, 22233, 22211, 22226, 22233, 22211, 22170, 22266, 22227, 22146, 22247, 22242, 22243, 22175, 22227, 22232, 22208, 22233, 22235, 22232, 22230, 22227, 22174, 22205, 22175, 22210, 22215, 22235, 22232, 22230, 22227, 22174, 22205};

    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:40:0x0139 A[PHI: r6 r10
      0x0139: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v3 int) binds: [B:39:0x0136, B:36:0x011e, B:25:0x00c4, B:21:0x00a6, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int) binds: [B:39:0x0136, B:36:0x011e, B:25:0x00c4, B:21:0x00a6, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01a8 A[PHI: r1
      0x01a8: PHI (r1v2 short) = (r1v1 short), (r1v1 short), (r1v1 short), (r1v3 short) binds: [B:53:0x01a6, B:32:0x0101, B:25:0x00c4, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01e6 A[PHI: r4 r5
      0x01e6: PHI (r4v3 int) = (r4v2 int), (r4v1 int) binds: [B:60:0x01e4, B:53:0x01a6] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r5v3 int) = (r5v2 int), (r5v1 int) binds: [B:60:0x01e4, B:53:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x022c A[PHI: r0 r2 r3 r8 r9 r16
      0x022c: PHI (r0v8 char) = (r0v3 char), (r0v3 char), (r0v7 char), (r0v3 char) binds: [B:64:0x0215, B:56:0x01c3, B:45:0x0166, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r2v3 short) = (r2v2 short), (r2v1 short), (r2v1 short), (r2v1 short) binds: [B:64:0x0215, B:56:0x01c3, B:45:0x0166, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r3v4 int) = (r3v1 int), (r3v3 int), (r3v1 int), (r3v1 int) binds: [B:64:0x0215, B:56:0x01c3, B:45:0x0166, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r8v2 short[]) = (r8v1 short[]), (r8v1 short[]), (r8v1 short[]), (r8v4 short[]) binds: [B:64:0x0215, B:56:0x01c3, B:45:0x0166, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:64:0x0215, B:56:0x01c3, B:45:0x0166, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r16v5 short[]) = (r16v3 short[]), (r16v3 short[]), (r16v4 short[]), (r16v3 short[]) binds: [B:64:0x0215, B:56:0x01c3, B:45:0x0166, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM2566;
        int i;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1858118566;
        int i10 = C1047.f3863;
        int i11 = C4075.f12947;
        int iM2567 = (C0630.m2566("᩹᩶") ^ i11) * 73;
        int i12 = ((iM2567 ^ i10) * 29813) ^ (-166550901);
        int i13 = iM2567 ^ (-1359233169);
        short[] sArr2 = null;
        while (true) {
            i9 = ((((i9 ^ i10) * (-8249)) >> 31) & i12) ^ i13;
            switch (i9) {
                case -1975040637:
                case 1666866503:
                    s2 = 10115;
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("᩺ۨ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 14417) ^ 2026766618;
                        i = 2145142929;
                    } else {
                        iM2566 = C0630.m2566("ۘۡ") ^ i10;
                        i12 = ((iM2566 ^ i11) * 1311) ^ (-1305549242);
                        i = 711628479;
                    }
                    i13 = iM2566 ^ i;
                    break;
                case -1496794335:
                case 425326263:
                    i3 = s * s;
                    i4 = 102313225;
                    if (C1047.f3863 >= 0) {
                        iM2566 = (i10 - C2105.m6981("ۖۨ")) * 19;
                        i12 = ((iM2566 ^ i11) * (-4513)) ^ (-1853908723);
                        i = 1951043313;
                    } else {
                        iM2566 = C2105.m6981("ܶ᩺") ^ i11;
                        i12 = ((iM2566 ^ i10) * 4033) ^ (-1277824572);
                        i = -1254820842;
                    }
                    i13 = iM2566 ^ i;
                    break;
                case -1491973921:
                case 1196954065:
                    int i14 = s + s2;
                    i2 = i14 * i14;
                    if (C1005.f3721) {
                        iM2566 = (C2105.m6981("۬᩷") ^ i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i12 = ((iM2566 ^ i10) * 3673) ^ 908042594;
                        i = 110071242;
                    } else {
                        iM2566 = C2105.m6981("᩺ۨ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 14417) ^ 2026766618;
                        i = 2145142929;
                    }
                    i13 = iM2566 ^ i;
                    break;
                case -1475794938:
                case -549138558:
                    C3746.m11369();
                    if (C1711.f5919) {
                        iM2566 = C2105.m6981("᩵۬") ^ i11;
                        i12 = ((iM2566 ^ i10) * 21713) ^ 383540574;
                        i = -310590407;
                    } else {
                        iM2566 = (i10 - C2105.m6981("ۖۨ")) * 19;
                        i12 = ((iM2566 ^ i11) * (-4513)) ^ (-1853908723);
                        i = 1951043313;
                    }
                    i13 = iM2566 ^ i;
                    break;
                case -1342748112:
                case -85714110:
                    f72090 = C13864.m33217(ServiceConnectionC3453.m10568(sArr, i7, i8, i6));
                    return;
                case -1205057914:
                case 1311794502:
                    i6 = 28340;
                    iM2566 = C2105.m6981("ܰۨ") ^ i10;
                    i12 = ((iM2566 ^ i11) * (-30379)) ^ (-1032106841);
                    i = 944968383;
                    i13 = iM2566 ^ i;
                    break;
                case -1038527011:
                case 1338554690:
                    sArr2 = f72091;
                    c = 0;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C2105.m6981("᩺ۨ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 14417) ^ 2026766618;
                        i = 2145142929;
                    } else {
                        iM2566 = C0630.m2566("ۨۜ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 29941) ^ 590585010;
                        i = 1768734501;
                    }
                    i13 = iM2566 ^ i;
                    break;
                case -1025940865:
                case 783278042:
                    C5695.m16023();
                    RunnableC1937.m6387();
                    throw new RuntimeException();
                case -963435562:
                case 884621402:
                    i6 = 42595;
                    iM2566 = C2105.m6981("ܰۨ") ^ i10;
                    i12 = ((iM2566 ^ i11) * (-30379)) ^ (-1032106841);
                    i = 944968383;
                    i13 = iM2566 ^ i;
                    break;
                case -854463186:
                case 1696919286:
                    C22628.m50615();
                    iM2566 = (i10 - C2105.m6981("ۡܶ")) * (-19);
                    i12 = ((iM2566 ^ i11) * 4141) ^ (-1606327511);
                    i = -1366808002;
                    i13 = iM2566 ^ i;
                    break;
                case -516460023:
                case -470220622:
                    if (C0798.f2919) {
                        iM2566 = (i10 - C2105.m6981("ۡܶ")) * (-19);
                        i12 = ((iM2566 ^ i11) * 4141) ^ (-1606327511);
                        i = -1366808002;
                    } else {
                        iM2566 = C2105.m6981("ܿᩳ") ^ i10;
                        i12 = ((iM2566 ^ i11) * (-15129)) ^ 1483300753;
                        i = -550423026;
                    }
                    i13 = iM2566 ^ i;
                    break;
                case -142318873:
                case 641192754:
                    C3746.m11369();
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("᩵۬") ^ i11;
                        i12 = ((iM2566 ^ i10) * 21713) ^ 383540574;
                        i = -310590407;
                    } else {
                        iM2566 = (C0630.m2566("ۢ᩺") + i10) * 55;
                        i12 = ((iM2566 ^ i11) * 30927) ^ (-1739277691);
                        i = -1145536651;
                    }
                    i13 = iM2566 ^ i;
                    break;
                case -19803379:
                case 449505476:
                    if (i2 - (i5 + i5) <= 0) {
                        iM2566 = (C0630.m2566("ۧۤ") + i11) * (-7);
                        i12 = ((iM2566 ^ i10) * 2805) ^ 1866125428;
                        i = 189537355;
                    } else {
                        iM2566 = (i10 - C2105.m6981("֨۫")) * (-105);
                        i12 = ((iM2566 ^ i11) * (-23015)) ^ 1738159854;
                        i = 1015261884;
                    }
                    i13 = iM2566 ^ i;
                    break;
                case 89934650:
                case 194160580:
                    RunnableC1108.m3790();
                    if (C21923.f70183 != 0) {
                        iM2566 = (i10 - C2105.m6981("ۡܶ")) * (-19);
                        i12 = ((iM2566 ^ i11) * 4141) ^ (-1606327511);
                        i = -1366808002;
                    } else {
                        iM2566 = C2105.m6981("᩵۬") ^ i11;
                        i12 = ((iM2566 ^ i10) * 21713) ^ 383540574;
                        i = -310590407;
                    }
                    i13 = iM2566 ^ i;
                    break;
                case 872323055:
                case 1061806317:
                    i8 = 24;
                    if (C4117.f13076 <= 0) {
                        iM2566 = (i10 - C2105.m6981("ۡܶ")) * (-19);
                        i12 = ((iM2566 ^ i11) * 4141) ^ (-1606327511);
                        i = -1366808002;
                    } else {
                        iM2566 = C2105.m6981("᩸᩸") ^ i11;
                        i12 = ((iM2566 ^ i10) * 23313) ^ (-2102570829);
                        i = 1924941210;
                    }
                    i13 = iM2566 ^ i;
                    break;
                case 1029834241:
                case 1380567155:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C0630.m2566("ۢ᩺") + i10) * 55;
                        i12 = ((iM2566 ^ i11) * 30927) ^ (-1739277691);
                        i = -1145536651;
                    } else {
                        iM2566 = C0630.m2566("۠ۜ") ^ i11;
                        i12 = ((iM2566 ^ i10) * (-22429)) ^ (-1212513102);
                        i = -257048827;
                    }
                    i13 = iM2566 ^ i;
                    break;
                case 1030692810:
                case 1974042491:
                    i5 = i3 + i4;
                    if (C4075.m12263() <= 0) {
                        iM2566 = (i10 - C2105.m6981("ۡܶ")) * (-19);
                        i12 = ((iM2566 ^ i11) * 4141) ^ (-1606327511);
                        i = -1366808002;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۡ") ^ i10) * (-49);
                        i12 = ((iM2566 ^ i11) * (-16727)) ^ (-1049666512);
                        i = 364446212;
                    }
                    i13 = iM2566 ^ i;
                    break;
                case 1658471252:
                case 2029417761:
                    s = sArr2[c];
                    if (C4117.f13076 <= 0) {
                        iM2566 = C2105.m6981("᩵۬") ^ i11;
                        i12 = ((iM2566 ^ i10) * 21713) ^ 383540574;
                        i = -310590407;
                    } else {
                        iM2566 = C0630.m2566("ۤ᩻") ^ i10;
                        i12 = ((iM2566 ^ i11) * (-21113)) ^ (-69805746);
                        i = 121614589;
                    }
                    i13 = iM2566 ^ i;
                    break;
                default:
                    sArr = f72091;
                    i7 = 1;
                    if (C2126.m7040()) {
                        iM2566 = C2105.m6981("᩺ۨ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 14417) ^ 2026766618;
                        i = 2145142929;
                    } else {
                        iM2566 = (i11 - C2105.m6981("ۗܳ")) * 53;
                        i12 = ((iM2566 ^ i10) * 14419) ^ 1310721021;
                        i = 156490147;
                    }
                    i13 = iM2566 ^ i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x016f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12918 m49886(AbstractC15440 abstractC15440, boolean z) throws C1637, IOException {
        byte[] bArr;
        int iM2566;
        int i;
        int i2;
        MessageDigest messageDigest;
        String str;
        int i3;
        int i4;
        short[] sArr;
        int iM6981;
        int i5;
        int iM2567;
        int i6;
        short[] sArr2;
        int iM2568;
        int i7;
        int i8;
        int i9;
        C13864 c13864;
        int i10;
        MessageDigest messageDigest2;
        short[] sArr3;
        C13864 c13865;
        int i11;
        BigInteger bigInteger;
        int iM2569;
        int i12;
        int i13;
        short[] sArr4;
        int i14;
        String str2;
        String str3;
        int iM25610;
        int i15;
        int i16 = 0;
        String[] strArr = null;
        int i17 = 0;
        int iM6982 = 0;
        String strM6311 = null;
        C18621 c18621Execute = null;
        C18621 c18621Execute2 = null;
        C12918 c12918M31380 = null;
        C23881 c23881 = null;
        C13680 c13680 = null;
        C12918 c12918M31381 = null;
        IOException iOException = null;
        int i18 = -2001476574;
        int i19 = C3019.f9544;
        int i20 = C5695.f17556;
        int iM6983 = C2105.m6981("᩷ۙ") ^ i19;
        int i21 = ((iM6983 ^ i20) * (-20099)) ^ (-46388959);
        int i22 = iM6983 ^ (-1551016675);
        C23881 c23881M42495 = null;
        String str4 = null;
        InterfaceC10405 interfaceC10405M52568 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i23 = 0;
        int i24 = 0;
        boolean zM2131 = false;
        InterfaceC1274 interfaceC1274M52563 = null;
        int i25 = 0;
        String str5 = null;
        String strM6440 = null;
        int i26 = 0;
        MessageDigest messageDigest3 = null;
        byte[] bArrM6430 = null;
        MessageDigest messageDigestM34526 = null;
        C1505 c1505 = null;
        String strM5726 = null;
        C13864 c13866 = null;
        BigInteger bigInteger2 = null;
        byte[] bArrMo12306 = null;
        C12918 c12918 = null;
        C9449 c9449 = null;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i20) * (-31361)) >> 31));
            switch (i18) {
                case -2132920023:
                case -656132355:
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    str4 = str4;
                    str = strM6440;
                    short[] sArr7 = sArr6;
                    sArr5 = sArr5;
                    bArrM6430 = bArrM6430;
                    c1505 = c1505;
                    c13864 = c13866;
                    interfaceC1274M52563 = C23852.m52563(C3245.m9930(abstractC15440));
                    MessageDigest messageDigestM34534 = C14460.m34534();
                    messageDigestM34526 = C14460.m34526();
                    strM5726 = C1711.m5726(f72091, 26, 20, i23);
                    if (C2520.f8000 < 0) {
                        int iM25611 = (C0630.m2566("᩶ۖ") + i19) * (-3);
                        sArr5 = sArr5;
                        c13866 = c13864;
                        strM6440 = str;
                        sArr6 = sArr7;
                        bArrMo12306 = bArr;
                        messageDigest3 = messageDigestM34534;
                        i22 = iM25611 ^ (-1941863772);
                        i21 = ((iM25611 ^ i20) * (-31897)) ^ 773991891;
                        c1505 = c1505;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        c23881 = c23881;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    } else {
                        messageDigest3 = messageDigestM34534;
                        sArr = sArr7;
                        int iM25612 = (C0630.m2566("᩻ۙ") + i19) * 59;
                        sArr5 = sArr5;
                        c13866 = c13864;
                        sArr6 = sArr;
                        i21 = ((iM25612 ^ i20) * (-20721)) ^ (-1430755208);
                        strM6440 = str;
                        c1505 = c1505;
                        bArrMo12306 = bArr;
                        i22 = iM25612 ^ 1698346418;
                        c23881 = c23881;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    }
                    break;
                case -2116838865:
                case 220167514:
                    i23 = 22533;
                    iM2568 = (i20 - C2105.m6981("ۖۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i7 = ((iM2568 ^ i19) * 16241) ^ (-1074404023);
                    i8 = -1519309004;
                    i9 = iM2568 ^ i8;
                    sArr5 = sArr5;
                    c13866 = c13866;
                    strM6440 = strM6440;
                    sArr6 = sArr6;
                    messageDigest3 = messageDigest3;
                    bArrMo12306 = bArrMo12306;
                    i22 = i9;
                    i21 = i7;
                    messageDigestM34526 = messageDigestM34526;
                    c1505 = c1505;
                    bArrM6430 = bArrM6430;
                    str4 = str4;
                    c23881 = c23881;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    break;
                case -2105140420:
                case -4906918:
                    c13680.m32918();
                    throw iOException;
                case -2090285453:
                case -1995845077:
                    C0630.m2564();
                    if (RunnableC3474.f10992 > 0) {
                        iM2566 = (C0630.m2566("ۡᩳ") + i19) * 101;
                        i = ((iM2566 ^ i20) * 4557) ^ 1568241521;
                        i2 = 2001279579;
                    } else {
                        iM2566 = (i20 - C0630.m2566("۫ܺ")) * 61;
                        i = ((iM2566 ^ i19) * (-22435)) ^ 1512626470;
                        i2 = -128224174;
                    }
                    i22 = iM2566 ^ i2;
                    i21 = i;
                    break;
                case -1933419047:
                case 1959487206:
                    C2126.m7040();
                    if (C4075.f12947 >= 0) {
                        bArr = bArrMo12306;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        c23881 = c23881;
                        c1505 = c1505;
                        messageDigest2 = messageDigest3;
                        sArr3 = sArr6;
                        c13865 = c13866;
                        i11 = i16;
                        i10 = i25;
                        int iM6984 = C2105.m6981("᩶ۗ") ^ i20;
                        i25 = i10;
                        sArr5 = sArr5;
                        i16 = i11;
                        strM6440 = strM6440;
                        c13866 = c13865;
                        bArrMo12306 = bArr;
                        i22 = iM6984 ^ (-1953714217);
                        i21 = ((iM6984 ^ i19) * (-28159)) ^ 214964179;
                        sArr6 = sArr3;
                        c1505 = c1505;
                        messageDigest3 = messageDigest2;
                        c23881 = c23881;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    }
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    str = strM6440;
                    sArr = sArr6;
                    c1505 = c1505;
                    c13864 = c13866;
                    int iM25613 = (C0630.m2566("᩻ۙ") + i19) * 59;
                    sArr5 = sArr5;
                    c13866 = c13864;
                    sArr6 = sArr;
                    i21 = ((iM25613 ^ i20) * (-20721)) ^ (-1430755208);
                    strM6440 = str;
                    c1505 = c1505;
                    bArrMo12306 = bArr;
                    i22 = iM25613 ^ 1698346418;
                    c23881 = c23881;
                    bArrM6430 = bArrM6430;
                    str4 = str4;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    break;
                case -1817720737:
                case 1311764399:
                    bArrMo12306 = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    str4 = str4;
                    strM6440 = strM6440;
                    sArr5 = sArr5;
                    bArrM6430 = bArrM6430;
                    c1505 = c1505;
                    messageDigestM34526 = messageDigestM34526;
                    messageDigest3 = messageDigest3;
                    sArr6 = sArr6;
                    c13866 = c13866;
                    short s = f72091[25];
                    if ((s * 31834) - ((s * s) + 253350889) > 0) {
                        iM2568 = (C0630.m2566("ᩴۗ") + i19) * 45;
                        i7 = ((iM2568 ^ i20) * (-20009)) ^ (-28625995);
                        i8 = 1143276344;
                    } else {
                        iM2568 = C0630.m2566("֫ۢ") ^ i20;
                        i7 = ((iM2568 ^ i19) * 31143) ^ (-2096034530);
                        i8 = -1484183249;
                    }
                    i9 = iM2568 ^ i8;
                    sArr5 = sArr5;
                    c13866 = c13866;
                    strM6440 = strM6440;
                    sArr6 = sArr6;
                    messageDigest3 = messageDigest3;
                    bArrMo12306 = bArrMo12306;
                    i22 = i9;
                    i21 = i7;
                    messageDigestM34526 = messageDigestM34526;
                    c1505 = c1505;
                    bArrM6430 = bArrM6430;
                    str4 = str4;
                    c23881 = c23881;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    break;
                case -1794994903:
                case -640198055:
                    return c12918M31381;
                case -1715099789:
                case -586674335:
                    try {
                        interfaceC10405M52568.write(bArrMo12306);
                        interfaceC10405M52568.close();
                        c13680.m32919();
                        c23881 = c23881;
                        c1505 = c1505;
                        iM2567 = (i19 - C0630.m2566("ۚۧ")) * (-53);
                        i3 = ((iM2567 ^ i20) * (-1111)) ^ 1744129949;
                        i6 = -1984142226;
                        i22 = iM2567 ^ i6;
                        i21 = i3;
                        c1505 = c1505;
                        c23881 = c23881;
                    } catch (IOException e) {
                        iOException = e;
                        iM2566 = (i20 - C2105.m6981("᩵ܶ")) * (-5);
                        i = ((iM2566 ^ i19) * 19855) ^ (-61299912);
                        i2 = -1572231320;
                        i22 = iM2566 ^ i2;
                        i21 = i;
                    }
                    break;
                case -1706247665:
                case -582809807:
                    C1916.m6308();
                    C1916.m6308();
                    return null;
                case -1660726830:
                case 831390917:
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    str4 = str4;
                    strM6440 = strM6440;
                    bArrM6430 = bArrM6430;
                    c1505 = c1505;
                    sArr2 = sArr6;
                    bigInteger = bigInteger2;
                    strArr = new String[]{bigInteger.toString(36), Base64.encodeToString(messageDigestM34526.digest(), 2)};
                    if (z) {
                        int iM25614 = (C0630.m2566("ܿ۟") + i19) * (-103);
                        bigInteger2 = bigInteger;
                        sArr6 = sArr2;
                        strM6440 = strM6440;
                        c1505 = c1505;
                        bArrM6430 = bArrM6430;
                        bArrMo12306 = bArr;
                        i22 = iM25614 ^ 749495725;
                        i21 = ((iM25614 ^ i20) * 8763) ^ 1464051116;
                        str4 = str4;
                        c23881 = c23881;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        i17 = 0;
                    } else {
                        i17 = 0;
                        iM2569 = (C2105.m6981("ܽܰ") ^ i19) * (-107);
                        bigInteger2 = bigInteger;
                        i12 = ((iM2569 ^ i20) * (-929)) ^ (-268246198);
                        i13 = 1997759558;
                        i14 = iM2569 ^ i13;
                        sArr6 = sArr2;
                        strM6440 = strM6440;
                        c1505 = c1505;
                        bArrMo12306 = bArr;
                        i22 = i14;
                        i21 = i12;
                        c23881 = c23881;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    }
                    break;
                case -1627145567:
                case 1254014959:
                    i23 = 22199;
                    iM2568 = (i20 - C2105.m6981("ۖۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i7 = ((iM2568 ^ i19) * 16241) ^ (-1074404023);
                    i8 = -1519309004;
                    i9 = iM2568 ^ i8;
                    sArr5 = sArr5;
                    c13866 = c13866;
                    strM6440 = strM6440;
                    sArr6 = sArr6;
                    messageDigest3 = messageDigest3;
                    bArrMo12306 = bArrMo12306;
                    i22 = i9;
                    i21 = i7;
                    messageDigestM34526 = messageDigestM34526;
                    c1505 = c1505;
                    bArrM6430 = bArrM6430;
                    str4 = str4;
                    c23881 = c23881;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    break;
                case -1614435532:
                case 1141357615:
                    return c12918M31380;
                case -1581040984:
                case 115325523:
                    C3683.m11222();
                    if (!C1420.m4913()) {
                        iM2566 = (C0630.m2566("ۡᩳ") + i19) * 101;
                        i = ((iM2566 ^ i20) * 4557) ^ 1568241521;
                        i2 = 2001279579;
                        i22 = iM2566 ^ i2;
                        i21 = i;
                    } else {
                        bArr = bArrMo12306;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        c23881 = c23881;
                        c1505 = c1505;
                        iM6981 = C0630.m2566("ۙ᩸") ^ i20;
                        i3 = ((iM6981 ^ i19) * (-25921)) ^ (-926627882);
                        i5 = 812960217;
                        i4 = iM6981 ^ i5;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        bArrMo12306 = bArr;
                        i22 = i4;
                        i21 = i3;
                        c1505 = c1505;
                        c23881 = c23881;
                    }
                    break;
                case -1554565099:
                case 816318288:
                    c23881 = c23881;
                    c1505 = c1505;
                    bArrMo12306 = c18621Execute.m43170().mo1616().mo12306();
                    c12918M31380 = C12918.m31380((InputStream) new ByteArrayInputStream(C3878.m11708(bArrMo12306, bArrMo12306.length)));
                    if (z) {
                        iM2567 = (C0630.m2566("ܰۛ") ^ i20) * 93;
                        i3 = ((iM2567 ^ i19) * (-29111)) ^ 479098873;
                        i6 = 1347236674;
                    } else {
                        iM2567 = (i19 - C0630.m2566("ۚۧ")) * (-53);
                        i3 = ((iM2567 ^ i20) * (-1111)) ^ 1744129949;
                        i6 = -1984142226;
                    }
                    i22 = iM2567 ^ i6;
                    i21 = i3;
                    c1505 = c1505;
                    c23881 = c23881;
                    break;
                case -1518086369:
                case 777321186:
                    Object[] objArr = new Object[i16];
                    objArr[i17] = C11340.m28023(abstractC15440);
                    throw new C1637(C1575.m5393(c23881M42495, C1420.m4906(iM6982, objArr)));
                case -1415944161:
                case 1867634580:
                    C1505 c1506 = c1505;
                    C18237 c18237M3787 = RunnableC1108.m3787(4130);
                    C0483.m2120(c18237M3787, strArr[i17]);
                    C23881 c23881M42496 = c18237M3787.m42495();
                    if (C1773.m5916(c23881M42496)) {
                        iM25610 = (i20 - C0630.m2566("ᩳ᩹")) * 79;
                        i = ((iM25610 ^ i19) * 9335) ^ 1926561303;
                        i15 = 1652046080;
                    } else {
                        iM25610 = C0630.m2566("ۤᩳ") ^ i19;
                        i = ((iM25610 ^ i20) * (-14393)) ^ (-799317684);
                        i15 = -700899495;
                    }
                    i22 = iM25610 ^ i15;
                    c1505 = c1506;
                    c23881 = c23881M42496;
                    i21 = i;
                    break;
                case -1187269020:
                case 2109118042:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C0630.m2566("ۡᩳ") + i19) * 101;
                        i = ((iM2566 ^ i20) * 4557) ^ 1568241521;
                        i2 = 2001279579;
                    } else {
                        iM2566 = C0630.m2566("ᩳ۟") ^ i20;
                        i = ((iM2566 ^ i19) * (-4841)) ^ (-843147901);
                        i2 = 900515593;
                    }
                    i22 = iM2566 ^ i2;
                    i21 = i;
                    break;
                case -1152372108:
                case 1702896886:
                    bArrMo12306 = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    str4 = str4;
                    strM6440 = strM6440;
                    bArrM6430 = bArrM6430;
                    c1505 = c1505;
                    messageDigest = messageDigest3;
                    sArr6 = sArr6;
                    C13864 c13867 = c13866;
                    messageDigest.update(strM5726.getBytes());
                    messageDigestM34526 = messageDigestM34526;
                    C14460.m34529(messageDigest, messageDigestM34526, C23852.m52567(interfaceC1274M52563).mo12307());
                    sArr5 = f72091;
                    i25 = 46;
                    if (!C0964.m3413()) {
                        c13866 = c13867;
                        int iM6985 = C2105.m6981("᩹ۖ") ^ i20;
                        messageDigest3 = messageDigest;
                        i7 = ((iM6985 ^ i19) * (-25165)) ^ (-272456144);
                        i9 = iM6985 ^ (-1366800456);
                        strM6440 = strM6440;
                        sArr6 = sArr6;
                        messageDigest3 = messageDigest3;
                        bArrMo12306 = bArrMo12306;
                        i22 = i9;
                        i21 = i7;
                        messageDigestM34526 = messageDigestM34526;
                        c1505 = c1505;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        c23881 = c23881;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    } else {
                        int iM25615 = (i19 - C0630.m2566("ۜۤ")) * 57;
                        strM6440 = strM6440;
                        c13866 = c13867;
                        bArrMo12306 = bArrMo12306;
                        i22 = iM25615 ^ (-102220522);
                        i21 = ((iM25615 ^ i20) * 22413) ^ 1204003776;
                        sArr6 = sArr6;
                        messageDigest3 = messageDigest;
                        bArrM6430 = bArrM6430;
                        messageDigestM34526 = messageDigestM34526;
                        str4 = str4;
                        c1505 = c1505;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        c23881 = c23881;
                    }
                    break;
                case -1030126915:
                case 822836534:
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    str4 = str4;
                    strM6440 = strM6440;
                    bArrM6430 = bArrM6430;
                    c1505 = c1505;
                    sArr2 = sArr6;
                    iM6982 = C2105.m6981(C7811.m20837(f72091, 66, 3, i23)) ^ 2129045699;
                    if (zM2131) {
                        iM2569 = C0630.m2566("ܺۧ") ^ i19;
                        i12 = ((iM2569 ^ i20) * (-7869)) ^ 812897058;
                        i13 = 85760494;
                    } else {
                        iM2569 = C2105.m6981("᩵ܿ") ^ i20;
                        i12 = ((iM2569 ^ i19) * (-1807)) ^ 1810884352;
                        i13 = -1017060897;
                    }
                    i14 = iM2569 ^ i13;
                    sArr6 = sArr2;
                    strM6440 = strM6440;
                    c1505 = c1505;
                    bArrMo12306 = bArr;
                    i22 = i14;
                    i21 = i12;
                    c23881 = c23881;
                    bArrM6430 = bArrM6430;
                    str4 = str4;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    break;
                case -855656472:
                case 2039968574:
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    strM6440 = strM6440;
                    c1505 = c1505;
                    sArr2 = sArr6;
                    C9449 c94410 = new C9449();
                    str4 = str4;
                    c94410.m24282(str4);
                    c94410.m24281();
                    bArrM6430 = bArrM6430;
                    c18621Execute = C4925.m14323().m40469(c94410.m24274()).execute();
                    if (c18621Execute.m43173()) {
                        iM2569 = C0630.m2566("ܶۛ") ^ i20;
                        i12 = ((iM2569 ^ i19) * (-9275)) ^ 702245135;
                        i13 = 1314979367;
                    } else {
                        iM2569 = (C0630.m2566("ۘۖ") ^ i19) * 33;
                        i12 = ((iM2569 ^ i20) * (-23165)) ^ (-360212193);
                        i13 = -1422917591;
                    }
                    i14 = iM2569 ^ i13;
                    sArr6 = sArr2;
                    strM6440 = strM6440;
                    c1505 = c1505;
                    bArrMo12306 = bArr;
                    i22 = i14;
                    i21 = i12;
                    c23881 = c23881;
                    bArrM6430 = bArrM6430;
                    str4 = str4;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    break;
                case -772317708:
                case 1723380897:
                    if (!C0798.f2919) {
                        iM2566 = C2105.m6981("۬ۡ") ^ i19;
                        i = ((iM2566 ^ i20) * (-30211)) ^ (-1375551022);
                        i2 = 1688766126;
                        i22 = iM2566 ^ i2;
                        i21 = i;
                    } else {
                        bArr = bArrMo12306;
                        c23881 = c23881;
                        c1505 = c1505;
                        int iM6986 = (i19 - C2105.m6981("ۧۚ")) * (-19);
                        i3 = ((iM6986 ^ i20) * 22025) ^ (-1245400780);
                        i4 = iM6986 ^ (-1144674067);
                        bArrMo12306 = bArr;
                        i22 = i4;
                        i21 = i3;
                        c1505 = c1505;
                        c23881 = c23881;
                    }
                    break;
                case -770689580:
                case 712750872:
                    if (c12918M31381 == null) {
                        bArr = bArrMo12306;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        c23881 = c23881;
                        str4 = str4;
                        strM6440 = strM6440;
                        bArrM6430 = bArrM6430;
                        c1505 = c1505;
                        bigInteger = bigInteger2;
                        sArr2 = sArr6;
                        iM2569 = (C2105.m6981("ܽܰ") ^ i19) * (-107);
                        bigInteger2 = bigInteger;
                        i12 = ((iM2569 ^ i20) * (-929)) ^ (-268246198);
                        i13 = 1997759558;
                        i14 = iM2569 ^ i13;
                        sArr6 = sArr2;
                        strM6440 = strM6440;
                        c1505 = c1505;
                        bArrMo12306 = bArr;
                        i22 = i14;
                        i21 = i12;
                        c23881 = c23881;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    } else {
                        iM2566 = C2105.m6981("ܺ᩵") ^ i19;
                        i = ((iM2566 ^ i20) * (-17989)) ^ (-262608188);
                        i2 = 2024013474;
                        i22 = iM2566 ^ i2;
                        i21 = i;
                    }
                    break;
                case -698412019:
                case 288286782:
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    str4 = str4;
                    strM6440 = strM6440;
                    bArrM6430 = bArrM6430;
                    c1505 = c1505;
                    short[] sArr8 = sArr5;
                    i10 = i25;
                    byte[] bytes = C4159.m12578(sArr8, i10, 20, i23).getBytes();
                    sArr5 = sArr8;
                    messageDigest2 = messageDigest3;
                    messageDigest2.update(bytes);
                    sArr3 = sArr6;
                    c13865 = c13866;
                    i11 = 1;
                    BigInteger bigInteger3 = new BigInteger(1, messageDigest2.digest());
                    if (C3663.m11168() >= 0) {
                        bigInteger2 = bigInteger3;
                        int iM6987 = C2105.m6981("᩶ۗ") ^ i20;
                        i25 = i10;
                        sArr5 = sArr5;
                        i16 = i11;
                        strM6440 = strM6440;
                        c13866 = c13865;
                        bArrMo12306 = bArr;
                        i22 = iM6987 ^ (-1953714217);
                        i21 = ((iM6987 ^ i19) * (-28159)) ^ 214964179;
                        sArr6 = sArr3;
                        c1505 = c1505;
                        messageDigest3 = messageDigest2;
                        c23881 = c23881;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    } else {
                        int iM25616 = C0630.m2566("ᩴ᩺") ^ i20;
                        int i27 = ((iM25616 ^ i19) * 17) ^ (-1518793690);
                        i25 = i10;
                        sArr5 = sArr5;
                        c13866 = c13865;
                        i16 = 1;
                        strM6440 = strM6440;
                        sArr6 = sArr3;
                        bArrMo12306 = bArr;
                        messageDigest3 = messageDigest2;
                        i22 = iM25616 ^ (-591762924);
                        c1505 = c1505;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        c23881 = c23881;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        bigInteger2 = bigInteger3;
                        i21 = i27;
                    }
                    break;
                case -661070446:
                case -430373492:
                    C2958.m9034();
                    if (C1294.m4372() <= 0) {
                        bArr = bArrMo12306;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        c23881 = c23881;
                        str = strM6440;
                        sArr = sArr6;
                        c1505 = c1505;
                        c13864 = c13866;
                        int iM25617 = (C0630.m2566("᩻ۙ") + i19) * 59;
                        sArr5 = sArr5;
                        c13866 = c13864;
                        sArr6 = sArr;
                        i21 = ((iM25617 ^ i20) * (-20721)) ^ (-1430755208);
                        strM6440 = str;
                        c1505 = c1505;
                        bArrMo12306 = bArr;
                        i22 = iM25617 ^ 1698346418;
                        c23881 = c23881;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    } else {
                        iM2566 = (C0630.m2566("ۡᩳ") + i19) * 101;
                        i = ((iM2566 ^ i20) * 4557) ^ 1568241521;
                        i2 = 2001279579;
                        i22 = iM2566 ^ i2;
                        i21 = i;
                    }
                    break;
                case -627722023:
                case 277804459:
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    str4 = str4;
                    strM6440 = strM6440;
                    bArrM6430 = bArrM6430;
                    c1505 = c1505;
                    sArr2 = sArr6;
                    C18237 c18237M7511 = C2272.m7511(4129);
                    C1773.m5907(c18237M7511, strArr[i17]);
                    C0483.m2120(c18237M7511, strArr[i16]);
                    c23881M42495 = c18237M7511.m42495();
                    zM2131 = C0483.m2131(c23881M42495);
                    if (C0050.f910 < 0) {
                        iM2569 = (C0630.m2566("ۛ᩹") ^ i20) * 23;
                        i12 = ((iM2569 ^ i19) * (-31985)) ^ 97021338;
                        i13 = 1627974681;
                        i14 = iM2569 ^ i13;
                        sArr6 = sArr2;
                        strM6440 = strM6440;
                        c1505 = c1505;
                        bArrMo12306 = bArr;
                        i22 = i14;
                        i21 = i12;
                        c23881 = c23881;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    } else {
                        c13865 = c13866;
                        i11 = i16;
                        messageDigest2 = messageDigest3;
                        sArr5 = sArr5;
                        i10 = i25;
                        sArr3 = sArr2;
                        int iM6988 = C2105.m6981("᩶ۗ") ^ i20;
                        i25 = i10;
                        sArr5 = sArr5;
                        i16 = i11;
                        strM6440 = strM6440;
                        c13866 = c13865;
                        bArrMo12306 = bArr;
                        i22 = iM6988 ^ (-1953714217);
                        i21 = ((iM6988 ^ i19) * (-28159)) ^ 214964179;
                        sArr6 = sArr3;
                        c1505 = c1505;
                        messageDigest3 = messageDigest2;
                        c23881 = c23881;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    }
                    break;
                case -601419669:
                case 2098192334:
                    c23881 = c23881;
                    C13680 c13680M26796 = C20096.f65090.m26796(strArr[i17]);
                    interfaceC10405M52568 = C23852.m52568(c13680M26796.m32917(i17));
                    int iM6989 = (C2105.m6981("֫᩵") + i19) * q.h;
                    c13680 = c13680M26796;
                    i21 = ((iM6989 ^ i20) * (-7755)) ^ 1844936443;
                    i22 = iM6989 ^ (-716496941);
                    c23881 = c23881;
                    break;
                case -422146508:
                case 409326078:
                    if (C5695.m16023() >= 0) {
                        iM2566 = C2105.m6981("۬ۡ") ^ i19;
                        i = ((iM2566 ^ i20) * (-30211)) ^ (-1375551022);
                        i2 = 1688766126;
                        i22 = iM2566 ^ i2;
                        i21 = i;
                    } else {
                        bArr = bArrMo12306;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        c23881 = c23881;
                        str = strM6440;
                        sArr = sArr6;
                        c1505 = c1505;
                        c13864 = c13866;
                        int iM25618 = (C0630.m2566("᩻ۙ") + i19) * 59;
                        sArr5 = sArr5;
                        c13866 = c13864;
                        sArr6 = sArr;
                        i21 = ((iM25618 ^ i20) * (-20721)) ^ (-1430755208);
                        strM6440 = str;
                        c1505 = c1505;
                        bArrMo12306 = bArr;
                        i22 = iM25618 ^ 1698346418;
                        c23881 = c23881;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    }
                    break;
                case -390203661:
                case 728952719:
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    str4 = str4;
                    bArrM6430 = bArrM6430;
                    c1505 = c1505;
                    sArr4 = sArr6;
                    int iM52603 = c23881M42495.m52603() & 255;
                    strM6440 = ViewOnClickListenerC1958.m6440(c23881M42495);
                    strM6311 = C1916.m6311(f72091, 69, 16, i23);
                    if (iM52603 != 0) {
                        str2 = strM6440;
                        int iM69810 = C2105.m6981("۬ۧ") ^ i19;
                        sArr6 = sArr4;
                        c1505 = c1505;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        c23881 = c23881;
                        String str6 = strM6440;
                        strM6440 = str2;
                        i21 = ((iM69810 ^ i20) * 1075) ^ (-1029410046);
                        bArrMo12306 = bArr;
                        i22 = iM69810 ^ 559866723;
                        bArrM6430 = bArrM6430;
                        str4 = str6;
                    } else {
                        int iM69811 = C2105.m6981("ܰ᩻") ^ i20;
                        i12 = ((iM69811 ^ i19) * (-21559)) ^ 301618569;
                        i14 = iM69811 ^ 39023638;
                        sArr6 = sArr4;
                        c1505 = c1505;
                        bArrMo12306 = bArr;
                        i22 = i14;
                        i21 = i12;
                        c23881 = c23881;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    }
                    break;
                case -325502925:
                case 2014649931:
                    c23881 = c23881;
                    c1505 = c1505;
                    StringBuilder sb = new StringBuilder();
                    bArr = bArrMo12306;
                    Object[] objArr2 = new Object[i16];
                    objArr2[i17] = C11340.m28023(abstractC15440);
                    if (C7106.f21815 == 0) {
                        C3245.m9923(sb, C3245.m9924(iM6982, objArr2));
                        C3245.m9923(sb, strM6311);
                        C0422.m1944(sb, c18621Execute2.m43177());
                        if (C0422.f1886 > 0) {
                            C1420.m4905(sb, C4159.m12578(f72091, UMErrorCode.E_UM_BE_JSON_FAILED, 9, i23));
                            C1420.m4905(sb, c18621Execute2.m43170().m1612());
                            throw new C1637(C0050.m947(sb));
                        }
                    }
                    int iM69812 = (i19 - C2105.m6981("ۧۚ")) * (-19);
                    i3 = ((iM69812 ^ i20) * 22025) ^ (-1245400780);
                    i4 = iM69812 ^ (-1144674067);
                    bArrMo12306 = bArr;
                    i22 = i4;
                    i21 = i3;
                    c1505 = c1505;
                    c23881 = c23881;
                    break;
                case -290741487:
                case 1350955103:
                    String strM4378 = C1294.m4378(c23881);
                    bArrM6430 = bArrM6430;
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    c1505 = c1505;
                    sArr4 = sArr6;
                    String str7 = strM6440;
                    strM6440 = strM4378;
                    str2 = str7;
                    int iM69813 = C2105.m6981("۬ۧ") ^ i19;
                    sArr6 = sArr4;
                    c1505 = c1505;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    String str8 = strM6440;
                    strM6440 = str2;
                    i21 = ((iM69813 ^ i20) * 1075) ^ (-1029410046);
                    bArrMo12306 = bArr;
                    i22 = iM69813 ^ 559866723;
                    bArrM6430 = bArrM6430;
                    str4 = str8;
                    break;
                case -278614774:
                case 1941558735:
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    c1505 = c1505;
                    c9449 = new C9449();
                    str = strM6440;
                    c9449.m24282(str);
                    sArr6 = f72091;
                    i24 = 85;
                    i26 = 11;
                    if (!C11340.m28031()) {
                        sArr = sArr6;
                        c13864 = c13866;
                        int iM25619 = (C0630.m2566("᩻ۙ") + i19) * 59;
                        sArr5 = sArr5;
                        c13866 = c13864;
                        sArr6 = sArr;
                        i21 = ((iM25619 ^ i20) * (-20721)) ^ (-1430755208);
                        strM6440 = str;
                        c1505 = c1505;
                        bArrMo12306 = bArr;
                        i22 = iM25619 ^ 1698346418;
                        c23881 = c23881;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    } else {
                        int iM69814 = (C2105.m6981("۫۟") + i19) * (-21);
                        i3 = ((iM69814 ^ i20) * (-17251)) ^ (-1171447457);
                        i4 = iM69814 ^ (-772066717);
                        strM6440 = str;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        bArrMo12306 = bArr;
                        i22 = i4;
                        i21 = i3;
                        c1505 = c1505;
                        c23881 = c23881;
                    }
                    break;
                case -110736155:
                case 894076685:
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    str4 = str4;
                    strM6440 = strM6440;
                    bArrM6430 = bArrM6430;
                    c1505 = c1505;
                    sArr2 = sArr6;
                    try {
                        str3 = str5;
                        try {
                            C1505 c1505M26800 = C20096.f65090.m26800(str3);
                            int iM69815 = (C2105.m6981("ܺۘ") + i20) * 61;
                            i21 = ((iM69815 ^ i19) * (-11257)) ^ 1436703979;
                            sArr6 = sArr2;
                            strM6440 = strM6440;
                            c1505 = c1505M26800;
                            bArrMo12306 = bArr;
                            str5 = str3;
                            i22 = iM69815 ^ (-994253199);
                            bArrM6430 = bArrM6430;
                            str4 = str4;
                            c23881 = c23881;
                        } catch (IOException unused) {
                            c12918M31381 = c12918;
                            iM2569 = C0630.m2566("ۘܰ") ^ i19;
                            str5 = str3;
                            i12 = ((iM2569 ^ i20) * (-24887)) ^ 644951803;
                            i13 = 1068590972;
                            i14 = iM2569 ^ i13;
                            sArr6 = sArr2;
                            strM6440 = strM6440;
                            c1505 = c1505;
                            bArrMo12306 = bArr;
                            i22 = i14;
                            i21 = i12;
                            c23881 = c23881;
                            bArrM6430 = bArrM6430;
                            str4 = str4;
                        }
                    } catch (IOException unused2) {
                        str3 = str5;
                    }
                    interfaceC10405M52568 = interfaceC10405M52568;
                    break;
                case -14505544:
                case 1362460825:
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    c1505 = c1505;
                    c9449.m24277(C2958.m9031(f72091, 96, 3, i23), AbstractC2393.m7755(c13866, bArrM6430));
                    c18621Execute2 = C4925.m14323().m40469(c9449.m24274()).execute();
                    if (c18621Execute2.m43173()) {
                        iM6981 = (C0630.m2566("ۜ۬") ^ i20) * (-43);
                        i3 = ((iM6981 ^ i19) * (-28103)) ^ (-1442818176);
                        i5 = 1221157383;
                    } else {
                        iM6981 = C2105.m6981("ۚۢ") ^ i19;
                        i3 = ((iM6981 ^ i20) * 32253) ^ (-1639813301);
                        i5 = 20474507;
                    }
                    i4 = iM6981 ^ i5;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    bArrMo12306 = bArr;
                    i22 = i4;
                    i21 = i3;
                    c1505 = c1505;
                    c23881 = c23881;
                    break;
                case 184268007:
                case 2081524403:
                    bArr = bArrMo12306;
                    c23881 = c23881;
                    c1505 = c1505;
                    StringBuilder sb2 = new StringBuilder();
                    interfaceC10405M52568 = interfaceC10405M52568;
                    Object[] objArr3 = new Object[i16];
                    objArr3[i17] = C11340.m28023(abstractC15440);
                    if (C3683.f11629 >= 0) {
                        iM6981 = C0630.m2566("ۙ᩸") ^ i20;
                        i3 = ((iM6981 ^ i19) * (-25921)) ^ (-926627882);
                        i5 = 812960217;
                        i4 = iM6981 ^ i5;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        bArrMo12306 = bArr;
                        i22 = i4;
                        i21 = i3;
                        c1505 = c1505;
                        c23881 = c23881;
                    } else {
                        C3245.m9923(sb2, C1420.m4906(iM6982, objArr3));
                        C3245.m9923(sb2, strM6311);
                        C0422.m1944(sb2, c18621Execute.m43177());
                        if (C0714.m2805()) {
                            C3245.m9923(sb2, C4075.m12252(f72091, 99, 11, i23));
                            C1420.m4905(sb2, c18621Execute.m43170().m1612());
                            throw new C1637(C0422.m1959(sb2));
                        }
                        messageDigest2 = messageDigest3;
                        sArr3 = sArr6;
                        c13865 = c13866;
                        i11 = i16;
                        i10 = i25;
                        int iM69816 = C2105.m6981("᩶ۗ") ^ i20;
                        i25 = i10;
                        sArr5 = sArr5;
                        i16 = i11;
                        strM6440 = strM6440;
                        c13866 = c13865;
                        bArrMo12306 = bArr;
                        i22 = iM69816 ^ (-1953714217);
                        i21 = ((iM69816 ^ i19) * (-28159)) ^ 214964179;
                        sArr6 = sArr3;
                        c1505 = c1505;
                        messageDigest3 = messageDigest2;
                        c23881 = c23881;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    }
                    break;
                case 287985266:
                case 999843494:
                    Object[] objArr4 = new Object[i16];
                    objArr4[i17] = C11340.m28023(abstractC15440);
                    throw new C1637(C1575.m5393(c23881, C3245.m9924(iM6982, objArr4)));
                case 449435748:
                case 679274698:
                    try {
                        byte[] bArrMo12307 = C23852.m52567(c1505.m5185(i17)).mo12306();
                        byte[] bArrM11708 = C3878.m11708(bArrMo12307, bArrMo12307.length);
                        c1505.close();
                        c12918M31381 = C12918.m31380((InputStream) new ByteArrayInputStream(bArrM11708));
                        bArr = bArrMo12306;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        c23881 = c23881;
                        str4 = str4;
                        strM6440 = strM6440;
                        bArrM6430 = bArrM6430;
                        c1505 = c1505;
                        str3 = str5;
                        sArr2 = sArr6;
                    } catch (IOException unused3) {
                        bArr = bArrMo12306;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        c23881 = c23881;
                        str4 = str4;
                        strM6440 = strM6440;
                        bArrM6430 = bArrM6430;
                        c1505 = c1505;
                        str3 = str5;
                        sArr2 = sArr6;
                        c12918M31381 = c12918;
                    }
                    iM2569 = C0630.m2566("ۘܰ") ^ i19;
                    str5 = str3;
                    i12 = ((iM2569 ^ i20) * (-24887)) ^ 644951803;
                    i13 = 1068590972;
                    i14 = iM2569 ^ i13;
                    sArr6 = sArr2;
                    strM6440 = strM6440;
                    c1505 = c1505;
                    bArrMo12306 = bArr;
                    i22 = i14;
                    i21 = i12;
                    c23881 = c23881;
                    bArrM6430 = bArrM6430;
                    str4 = str4;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    break;
                case 1018534604:
                case 1136417938:
                    if (C3746.f11829 <= 0) {
                        iM2566 = C0630.m2566("ۘۗ") ^ i19;
                        i = ((iM2566 ^ i20) * 13689) ^ (-1795913817);
                        i2 = -1721092631;
                        i22 = iM2566 ^ i2;
                        i21 = i;
                    } else {
                        bArr = bArrMo12306;
                        c23881 = c23881;
                        c1505 = c1505;
                        int iM69817 = (i19 - C2105.m6981("ۧۚ")) * (-19);
                        i3 = ((iM69817 ^ i20) * 22025) ^ (-1245400780);
                        i4 = iM69817 ^ (-1144674067);
                        bArrMo12306 = bArr;
                        i22 = i4;
                        i21 = i3;
                        c1505 = c1505;
                        c23881 = c23881;
                    }
                    break;
                case 1122324944:
                case 1582613772:
                    c23881 = c23881;
                    if (c1505 != null) {
                        iM2567 = C0630.m2566("ۢᩳ") ^ i20;
                        c1505 = c1505;
                        i3 = ((iM2567 ^ i19) * (-14081)) ^ (-2064421084);
                        i6 = -984930484;
                        i22 = iM2567 ^ i6;
                        i21 = i3;
                        c1505 = c1505;
                        c23881 = c23881;
                    } else {
                        c1505 = c1505;
                        bArr = bArrMo12306;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        str4 = str4;
                        strM6440 = strM6440;
                        sArr2 = sArr6;
                        bArrM6430 = bArrM6430;
                        str3 = str5;
                        c12918M31381 = c12918;
                        iM2569 = C0630.m2566("ۘܰ") ^ i19;
                        str5 = str3;
                        i12 = ((iM2569 ^ i20) * (-24887)) ^ 644951803;
                        i13 = 1068590972;
                        i14 = iM2569 ^ i13;
                        sArr6 = sArr2;
                        strM6440 = strM6440;
                        c1505 = c1505;
                        bArrMo12306 = bArr;
                        i22 = i14;
                        i21 = i12;
                        c23881 = c23881;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    }
                    break;
                case 1325940317:
                case 1780627084:
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    str4 = str4;
                    strM6440 = strM6440;
                    bArrM6430 = bArrM6430;
                    c1505 = c1505;
                    sArr2 = sArr6;
                    str5 = strArr[i17];
                    c12918 = null;
                    iM2569 = C0630.m2566("۬ܺ") ^ i20;
                    i12 = ((iM2569 ^ i19) * 9951) ^ 343553695;
                    i13 = -662865260;
                    i14 = iM2569 ^ i13;
                    sArr6 = sArr2;
                    strM6440 = strM6440;
                    c1505 = c1505;
                    bArrMo12306 = bArr;
                    i22 = i14;
                    i21 = i12;
                    c23881 = c23881;
                    bArrM6430 = bArrM6430;
                    str4 = str4;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    break;
                case 1347859727:
                case 1813477247:
                    bArrMo12306 = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    c1505 = c1505;
                    short[] sArr9 = sArr6;
                    c9449.m24283(C0237.m1483(sArr9, i24, i26, i23), strArr[i16]);
                    c13866 = f72090;
                    bArrM6430 = ViewOnClickListenerC1958.m6430(abstractC15440);
                    if (C2272.m7503()) {
                        str4 = str4;
                        strM6440 = strM6440;
                        bArrM6430 = bArrM6430;
                        messageDigest = messageDigest3;
                        sArr6 = sArr9;
                        messageDigestM34526 = messageDigestM34526;
                        int iM69818 = C2105.m6981("᩹ۖ") ^ i20;
                        messageDigest3 = messageDigest;
                        i7 = ((iM69818 ^ i19) * (-25165)) ^ (-272456144);
                        i9 = iM69818 ^ (-1366800456);
                        strM6440 = strM6440;
                        sArr6 = sArr6;
                        messageDigest3 = messageDigest3;
                        bArrMo12306 = bArrMo12306;
                        i22 = i9;
                        i21 = i7;
                        messageDigestM34526 = messageDigestM34526;
                        c1505 = c1505;
                        bArrM6430 = bArrM6430;
                        str4 = str4;
                        c23881 = c23881;
                        interfaceC10405M52568 = interfaceC10405M52568;
                    } else {
                        int iM25620 = C0630.m2566("᩷᩶") ^ i20;
                        sArr6 = sArr9;
                        c1505 = c1505;
                        interfaceC10405M52568 = interfaceC10405M52568;
                        c23881 = c23881;
                        i22 = iM25620 ^ (-1140724207);
                        i21 = ((iM25620 ^ i19) * (-10187)) ^ 482935545;
                        bArrMo12306 = bArrMo12306;
                    }
                    break;
                default:
                    C21923.m49329();
                    C2520.m8026();
                    bArr = bArrMo12306;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    c23881 = c23881;
                    c1505 = c1505;
                    iM6981 = C0630.m2566("ۙ᩸") ^ i20;
                    i3 = ((iM6981 ^ i19) * (-25921)) ^ (-926627882);
                    i5 = 812960217;
                    i4 = iM6981 ^ i5;
                    interfaceC10405M52568 = interfaceC10405M52568;
                    bArrMo12306 = bArr;
                    i22 = i4;
                    i21 = i3;
                    c1505 = c1505;
                    c23881 = c23881;
                    break;
            }
        }
    }
}
