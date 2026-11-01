package p067l;

import android.util.Base64;
import com.alipay.sdk.p010m.p058y.C0254q;
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
public final class C23479 {

    /* JADX INFO: renamed from: ֫ */
    public static final C15545 f74811;

    /* JADX INFO: renamed from: ᩸ܳܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f83020 = {5087, 28373, 28356, 28356, 28376, 28381, 28375, 28373, 28352, 28381, 28379, 28378, 28315, 28379, 28375, 28352, 28369, 28352, 28313, 28359, 28352, 28358, 28369, 28373, 28377, 28, 22237, 22228, 22158, 22210, 22268, 22267, 22157, 22225, 22175, 22263, 22223, 22232, 22148, 22159, 22163, 22173, 22235, 22257, 22259, 22244, 22247, 22222, 22244, 22242, 22210, 22227, 22151, 22212, 22237, 22260, 22259, 22236, 22235, 22235, 22156, 22160, 22230, 22227, 22252, 22250, -10509, -12999, 3214, 22205, 22245, 22226, 22212, 22215, 22232, 22233, 22212, 22226, 22167, 22228, 22232, 22227, 22226, 22157, 22167, 22260, 22232, 22233, 22211, 22226, 22233, 22211, 22170, 22266, 22227, 22146, 22247, 22242, 22243, 22175, 22227, 22232, 22208, 22233, 22235, 22232, 22230, 22227, 22174, 22205, 22175, 22210, 22215, 22235, 22232, 22230, 22227, 22174, 22205};

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
        int iM55680;
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
        int i10 = C0894.f81854;
        int i11 = C1044.f81959;
        int iM55681 = (C0873.m55680("᩹᩶") ^ i11) * 73;
        int i12 = ((iM55681 ^ i10) * 29813) ^ (-166550901);
        int i13 = iM55681 ^ (-1359233169);
        short[] sArr2 = null;
        while (true) {
            i9 = ((((i9 ^ i10) * (-8249)) >> 31) & i12) ^ i13;
            switch (i9) {
                case -1975040637:
                case 1666866503:
                    s2 = 10115;
                    if (C0890.f81849 != 0) {
                        iM55680 = C0946.m55979("᩺ۨ") ^ i11;
                        i12 = ((iM55680 ^ i10) * 14417) ^ 2026766618;
                        i = 2145142929;
                    } else {
                        iM55680 = C0873.m55680("ۘۡ") ^ i10;
                        i12 = ((iM55680 ^ i11) * 1311) ^ (-1305549242);
                        i = 711628479;
                    }
                    i13 = iM55680 ^ i;
                    break;
                case -1496794335:
                case 425326263:
                    i3 = s * s;
                    i4 = 102313225;
                    if (C0894.f81854 >= 0) {
                        iM55680 = (i10 - C0946.m55979("ۖۨ")) * 19;
                        i12 = ((iM55680 ^ i11) * (-4513)) ^ (-1853908723);
                        i = 1951043313;
                    } else {
                        iM55680 = C0946.m55979("ܶ᩺") ^ i11;
                        i12 = ((iM55680 ^ i10) * 4033) ^ (-1277824572);
                        i = -1254820842;
                    }
                    i13 = iM55680 ^ i;
                    break;
                case -1491973921:
                case 1196954065:
                    int i14 = s + s2;
                    i2 = i14 * i14;
                    if (C0892.f81851) {
                        iM55680 = (C0946.m55979("۬᩷") ^ i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i12 = ((iM55680 ^ i10) * 3673) ^ 908042594;
                        i = 110071242;
                    } else {
                        iM55680 = C0946.m55979("᩺ۨ") ^ i11;
                        i12 = ((iM55680 ^ i10) * 14417) ^ 2026766618;
                        i = 2145142929;
                    }
                    i13 = iM55680 ^ i;
                    break;
                case -1475794938:
                case -549138558:
                    C1028.m56247();
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("᩵۬") ^ i11;
                        i12 = ((iM55680 ^ i10) * 21713) ^ 383540574;
                        i = -310590407;
                    } else {
                        iM55680 = (i10 - C0946.m55979("ۖۨ")) * 19;
                        i12 = ((iM55680 ^ i11) * (-4513)) ^ (-1853908723);
                        i = 1951043313;
                    }
                    i13 = iM55680 ^ i;
                    break;
                case -1342748112:
                case -85714110:
                    f74811 = C15545.m35336(ServiceConnectionC1013.m56161(sArr, i7, i8, i6));
                    return;
                case -1205057914:
                case 1311794502:
                    i6 = 28340;
                    iM55680 = C0946.m55979("ܰۨ") ^ i10;
                    i12 = ((iM55680 ^ i11) * (-30379)) ^ (-1032106841);
                    i = 944968383;
                    i13 = iM55680 ^ i;
                    break;
                case -1038527011:
                case 1338554690:
                    sArr2 = f83020;
                    c = 0;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0946.m55979("᩺ۨ") ^ i11;
                        i12 = ((iM55680 ^ i10) * 14417) ^ 2026766618;
                        i = 2145142929;
                    } else {
                        iM55680 = C0873.m55680("ۨۜ") ^ i11;
                        i12 = ((iM55680 ^ i10) * 29941) ^ 590585010;
                        i = 1768734501;
                    }
                    i13 = iM55680 ^ i;
                    break;
                case -1025940865:
                case 783278042:
                    C1124.m56367();
                    RunnableC0938.m55938();
                    throw new RuntimeException();
                case -963435562:
                case 884621402:
                    i6 = 42595;
                    iM55680 = C0946.m55979("ܰۨ") ^ i10;
                    i12 = ((iM55680 ^ i11) * (-30379)) ^ (-1032106841);
                    i = 944968383;
                    i13 = iM55680 ^ i;
                    break;
                case -854463186:
                case 1696919286:
                    C1964.m56597();
                    iM55680 = (i10 - C0946.m55979("ۡܶ")) * (-19);
                    i12 = ((iM55680 ^ i11) * 4141) ^ (-1606327511);
                    i = -1366808002;
                    i13 = iM55680 ^ i;
                    break;
                case -516460023:
                case -470220622:
                    if (C0882.f81846) {
                        iM55680 = (i10 - C0946.m55979("ۡܶ")) * (-19);
                        i12 = ((iM55680 ^ i11) * 4141) ^ (-1606327511);
                        i = -1366808002;
                    } else {
                        iM55680 = C0946.m55979("ܿᩳ") ^ i10;
                        i12 = ((iM55680 ^ i11) * (-15129)) ^ 1483300753;
                        i = -550423026;
                    }
                    i13 = iM55680 ^ i;
                    break;
                case -142318873:
                case 641192754:
                    C1028.m56247();
                    if (C0890.f81849 != 0) {
                        iM55680 = C0946.m55979("᩵۬") ^ i11;
                        i12 = ((iM55680 ^ i10) * 21713) ^ 383540574;
                        i = -310590407;
                    } else {
                        iM55680 = (C0873.m55680("ۢ᩺") + i10) * 55;
                        i12 = ((iM55680 ^ i11) * 30927) ^ (-1739277691);
                        i = -1145536651;
                    }
                    i13 = iM55680 ^ i;
                    break;
                case -19803379:
                case 449505476:
                    if (i2 - (i5 + i5) <= 0) {
                        iM55680 = (C0873.m55680("ۧۤ") + i11) * (-7);
                        i12 = ((iM55680 ^ i10) * 2805) ^ 1866125428;
                        i = 189537355;
                    } else {
                        iM55680 = (i10 - C0946.m55979("֨۫")) * (-105);
                        i12 = ((iM55680 ^ i11) * (-23015)) ^ 1738159854;
                        i = 1015261884;
                    }
                    i13 = iM55680 ^ i;
                    break;
                case 89934650:
                case 194160580:
                    RunnableC0897.m55784();
                    if (C1929.f83011 != 0) {
                        iM55680 = (i10 - C0946.m55979("ۡܶ")) * (-19);
                        i12 = ((iM55680 ^ i11) * 4141) ^ (-1606327511);
                        i = -1366808002;
                    } else {
                        iM55680 = C0946.m55979("᩵۬") ^ i11;
                        i12 = ((iM55680 ^ i10) * 21713) ^ 383540574;
                        i = -310590407;
                    }
                    i13 = iM55680 ^ i;
                    break;
                case 872323055:
                case 1061806317:
                    i8 = 24;
                    if (C1046.f81962 <= 0) {
                        iM55680 = (i10 - C0946.m55979("ۡܶ")) * (-19);
                        i12 = ((iM55680 ^ i11) * 4141) ^ (-1606327511);
                        i = -1366808002;
                    } else {
                        iM55680 = C0946.m55979("᩸᩸") ^ i11;
                        i12 = ((iM55680 ^ i10) * 23313) ^ (-2102570829);
                        i = 1924941210;
                    }
                    i13 = iM55680 ^ i;
                    break;
                case 1029834241:
                case 1380567155:
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0873.m55680("ۢ᩺") + i10) * 55;
                        i12 = ((iM55680 ^ i11) * 30927) ^ (-1739277691);
                        i = -1145536651;
                    } else {
                        iM55680 = C0873.m55680("۠ۜ") ^ i11;
                        i12 = ((iM55680 ^ i10) * (-22429)) ^ (-1212513102);
                        i = -257048827;
                    }
                    i13 = iM55680 ^ i;
                    break;
                case 1030692810:
                case 1974042491:
                    i5 = i3 + i4;
                    if (C1044.m56286() <= 0) {
                        iM55680 = (i10 - C0946.m55979("ۡܶ")) * (-19);
                        i12 = ((iM55680 ^ i11) * 4141) ^ (-1606327511);
                        i = -1366808002;
                    } else {
                        iM55680 = (C0946.m55979("ᩳۡ") ^ i10) * (-49);
                        i12 = ((iM55680 ^ i11) * (-16727)) ^ (-1049666512);
                        i = 364446212;
                    }
                    i13 = iM55680 ^ i;
                    break;
                case 1658471252:
                case 2029417761:
                    s = sArr2[c];
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0946.m55979("᩵۬") ^ i11;
                        i12 = ((iM55680 ^ i10) * 21713) ^ 383540574;
                        i = -310590407;
                    } else {
                        iM55680 = C0873.m55680("ۤ᩻") ^ i10;
                        i12 = ((iM55680 ^ i11) * (-21113)) ^ (-69805746);
                        i = 121614589;
                    }
                    i13 = iM55680 ^ i;
                    break;
                default:
                    sArr = f83020;
                    i7 = 1;
                    if (C0947.m55997()) {
                        iM55680 = C0946.m55979("᩺ۨ") ^ i11;
                        i12 = ((iM55680 ^ i10) * 14417) ^ 2026766618;
                        i = 2145142929;
                    } else {
                        iM55680 = (i11 - C0946.m55979("ۗܳ")) * 53;
                        i12 = ((iM55680 ^ i10) * 14419) ^ 1310721021;
                        i = 156490147;
                    }
                    i13 = iM55680 ^ i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x016f  */
    /* JADX INFO: renamed from: ֫ */
    public static C14645 m52213(AbstractC17043 abstractC17043, boolean z) throws C3924, IOException {
        byte[] bArr;
        int iM55680;
        int i;
        int i2;
        MessageDigest messageDigest;
        String str;
        int i3;
        int i4;
        short[] sArr;
        int iM55979;
        int i5;
        int iM55681;
        int i6;
        short[] sArr2;
        int iM55682;
        int i7;
        int i8;
        int i9;
        C15545 c15545;
        int i10;
        MessageDigest messageDigest2;
        short[] sArr3;
        C15545 c15546;
        int i11;
        BigInteger bigInteger;
        int iM55683;
        int i12;
        int i13;
        short[] sArr4;
        int i14;
        String str2;
        String str3;
        int iM55684;
        int i15;
        int i16 = 0;
        String[] strArr = null;
        int i17 = 0;
        int iM559710 = 0;
        String strM55921 = null;
        C20066 c20066Execute = null;
        C20066 c20066Execute2 = null;
        C14645 c14645M33466 = null;
        C25065 c25065 = null;
        C15370 c15370 = null;
        C14645 c14645M33467 = null;
        IOException iOException = null;
        int i18 = -2001476574;
        int i19 = C0992.f81922;
        int i20 = C1124.f82007;
        int iM559711 = C0946.m55979("᩷ۙ") ^ i19;
        int i21 = ((iM559711 ^ i20) * (-20099)) ^ (-46388959);
        int i22 = iM559711 ^ (-1551016675);
        C25065 c25065M44754 = null;
        String str4 = null;
        InterfaceC12257 interfaceC12257M54977 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i23 = 0;
        int i24 = 0;
        boolean zM55655 = false;
        InterfaceC3579 interfaceC3579M54972 = null;
        int i25 = 0;
        String str5 = null;
        String strM55952 = null;
        int i26 = 0;
        MessageDigest messageDigest3 = null;
        byte[] bArrM55942 = null;
        MessageDigest messageDigestM36660 = null;
        C3798 c3798 = null;
        String strM55863 = null;
        C15545 c15547 = null;
        BigInteger bigInteger2 = null;
        byte[] bArrMo14211 = null;
        C14645 c14645 = null;
        C11349 c11349 = null;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i20) * (-31361)) >> 31));
            switch (i18) {
                case -2132920023:
                case -656132355:
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    str4 = str4;
                    str = strM55952;
                    short[] sArr7 = sArr6;
                    sArr5 = sArr5;
                    bArrM55942 = bArrM55942;
                    c3798 = c3798;
                    c15545 = c15547;
                    interfaceC3579M54972 = C25037.m54972(C1003.m56128(abstractC17043));
                    MessageDigest messageDigestM36668 = C16111.m36668();
                    messageDigestM36660 = C16111.m36660();
                    strM55863 = C0927.m55863(f83020, 26, 20, i23);
                    if (C0967.f81910 < 0) {
                        int iM55685 = (C0873.m55680("᩶ۖ") + i19) * (-3);
                        sArr5 = sArr5;
                        c15547 = c15545;
                        strM55952 = str;
                        sArr6 = sArr7;
                        bArrMo14211 = bArr;
                        messageDigest3 = messageDigestM36668;
                        i22 = iM55685 ^ (-1941863772);
                        i21 = ((iM55685 ^ i20) * (-31897)) ^ 773991891;
                        c3798 = c3798;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        c25065 = c25065;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    } else {
                        messageDigest3 = messageDigestM36668;
                        sArr = sArr7;
                        int iM55686 = (C0873.m55680("᩻ۙ") + i19) * 59;
                        sArr5 = sArr5;
                        c15547 = c15545;
                        sArr6 = sArr;
                        i21 = ((iM55686 ^ i20) * (-20721)) ^ (-1430755208);
                        strM55952 = str;
                        c3798 = c3798;
                        bArrMo14211 = bArr;
                        i22 = iM55686 ^ 1698346418;
                        c25065 = c25065;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    }
                    break;
                case -2116838865:
                case 220167514:
                    i23 = 22533;
                    iM55682 = (i20 - C0946.m55979("ۖۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i7 = ((iM55682 ^ i19) * 16241) ^ (-1074404023);
                    i8 = -1519309004;
                    i9 = iM55682 ^ i8;
                    sArr5 = sArr5;
                    c15547 = c15547;
                    strM55952 = strM55952;
                    sArr6 = sArr6;
                    messageDigest3 = messageDigest3;
                    bArrMo14211 = bArrMo14211;
                    i22 = i9;
                    i21 = i7;
                    messageDigestM36660 = messageDigestM36660;
                    c3798 = c3798;
                    bArrM55942 = bArrM55942;
                    str4 = str4;
                    c25065 = c25065;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    break;
                case -2105140420:
                case -4906918:
                    c15370.m35033();
                    throw iOException;
                case -2090285453:
                case -1995845077:
                    C0873.m55678();
                    if (RunnableC1014.f81941 > 0) {
                        iM55680 = (C0873.m55680("ۡᩳ") + i19) * 101;
                        i = ((iM55680 ^ i20) * 4557) ^ 1568241521;
                        i2 = 2001279579;
                    } else {
                        iM55680 = (i20 - C0873.m55680("۫ܺ")) * 61;
                        i = ((iM55680 ^ i19) * (-22435)) ^ 1512626470;
                        i2 = -128224174;
                    }
                    i22 = iM55680 ^ i2;
                    i21 = i;
                    break;
                case -1933419047:
                case 1959487206:
                    C0947.m55997();
                    if (C1044.f81959 >= 0) {
                        bArr = bArrMo14211;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        c25065 = c25065;
                        c3798 = c3798;
                        messageDigest2 = messageDigest3;
                        sArr3 = sArr6;
                        c15546 = c15547;
                        i11 = i16;
                        i10 = i25;
                        int iM559712 = C0946.m55979("᩶ۗ") ^ i20;
                        i25 = i10;
                        sArr5 = sArr5;
                        i16 = i11;
                        strM55952 = strM55952;
                        c15547 = c15546;
                        bArrMo14211 = bArr;
                        i22 = iM559712 ^ (-1953714217);
                        i21 = ((iM559712 ^ i19) * (-28159)) ^ 214964179;
                        sArr6 = sArr3;
                        c3798 = c3798;
                        messageDigest3 = messageDigest2;
                        c25065 = c25065;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    }
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    str = strM55952;
                    sArr = sArr6;
                    c3798 = c3798;
                    c15545 = c15547;
                    int iM55687 = (C0873.m55680("᩻ۙ") + i19) * 59;
                    sArr5 = sArr5;
                    c15547 = c15545;
                    sArr6 = sArr;
                    i21 = ((iM55687 ^ i20) * (-20721)) ^ (-1430755208);
                    strM55952 = str;
                    c3798 = c3798;
                    bArrMo14211 = bArr;
                    i22 = iM55687 ^ 1698346418;
                    c25065 = c25065;
                    bArrM55942 = bArrM55942;
                    str4 = str4;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    break;
                case -1817720737:
                case 1311764399:
                    bArrMo14211 = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    str4 = str4;
                    strM55952 = strM55952;
                    sArr5 = sArr5;
                    bArrM55942 = bArrM55942;
                    c3798 = c3798;
                    messageDigestM36660 = messageDigestM36660;
                    messageDigest3 = messageDigest3;
                    sArr6 = sArr6;
                    c15547 = c15547;
                    short s = f83020[25];
                    if ((s * 31834) - ((s * s) + 253350889) > 0) {
                        iM55682 = (C0873.m55680("ᩴۗ") + i19) * 45;
                        i7 = ((iM55682 ^ i20) * (-20009)) ^ (-28625995);
                        i8 = 1143276344;
                    } else {
                        iM55682 = C0873.m55680("֫ۢ") ^ i20;
                        i7 = ((iM55682 ^ i19) * 31143) ^ (-2096034530);
                        i8 = -1484183249;
                    }
                    i9 = iM55682 ^ i8;
                    sArr5 = sArr5;
                    c15547 = c15547;
                    strM55952 = strM55952;
                    sArr6 = sArr6;
                    messageDigest3 = messageDigest3;
                    bArrMo14211 = bArrMo14211;
                    i22 = i9;
                    i21 = i7;
                    messageDigestM36660 = messageDigestM36660;
                    c3798 = c3798;
                    bArrM55942 = bArrM55942;
                    str4 = str4;
                    c25065 = c25065;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    break;
                case -1794994903:
                case -640198055:
                    return c14645M33467;
                case -1715099789:
                case -586674335:
                    try {
                        interfaceC12257M54977.write(bArrMo14211);
                        interfaceC12257M54977.close();
                        c15370.m35034();
                        c25065 = c25065;
                        c3798 = c3798;
                        iM55681 = (i19 - C0873.m55680("ۚۧ")) * (-53);
                        i3 = ((iM55681 ^ i20) * (-1111)) ^ 1744129949;
                        i6 = -1984142226;
                        i22 = iM55681 ^ i6;
                        i21 = i3;
                        c3798 = c3798;
                        c25065 = c25065;
                    } catch (IOException e) {
                        iOException = e;
                        iM55680 = (i20 - C0946.m55979("᩵ܶ")) * (-5);
                        i = ((iM55680 ^ i19) * 19855) ^ (-61299912);
                        i2 = -1572231320;
                        i22 = iM55680 ^ i2;
                        i21 = i;
                    }
                    break;
                case -1706247665:
                case -582809807:
                    C0937.m55918();
                    C0937.m55918();
                    return null;
                case -1660726830:
                case 831390917:
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    str4 = str4;
                    strM55952 = strM55952;
                    bArrM55942 = bArrM55942;
                    c3798 = c3798;
                    sArr2 = sArr6;
                    bigInteger = bigInteger2;
                    strArr = new String[]{bigInteger.toString(36), Base64.encodeToString(messageDigestM36660.digest(), 2)};
                    if (z) {
                        int iM55688 = (C0873.m55680("ܿ۟") + i19) * (-103);
                        bigInteger2 = bigInteger;
                        sArr6 = sArr2;
                        strM55952 = strM55952;
                        c3798 = c3798;
                        bArrM55942 = bArrM55942;
                        bArrMo14211 = bArr;
                        i22 = iM55688 ^ 749495725;
                        i21 = ((iM55688 ^ i20) * 8763) ^ 1464051116;
                        str4 = str4;
                        c25065 = c25065;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        i17 = 0;
                    } else {
                        i17 = 0;
                        iM55683 = (C0946.m55979("ܽܰ") ^ i19) * (-107);
                        bigInteger2 = bigInteger;
                        i12 = ((iM55683 ^ i20) * (-929)) ^ (-268246198);
                        i13 = 1997759558;
                        i14 = iM55683 ^ i13;
                        sArr6 = sArr2;
                        strM55952 = strM55952;
                        c3798 = c3798;
                        bArrMo14211 = bArr;
                        i22 = i14;
                        i21 = i12;
                        c25065 = c25065;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    }
                    break;
                case -1627145567:
                case 1254014959:
                    i23 = 22199;
                    iM55682 = (i20 - C0946.m55979("ۖۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i7 = ((iM55682 ^ i19) * 16241) ^ (-1074404023);
                    i8 = -1519309004;
                    i9 = iM55682 ^ i8;
                    sArr5 = sArr5;
                    c15547 = c15547;
                    strM55952 = strM55952;
                    sArr6 = sArr6;
                    messageDigest3 = messageDigest3;
                    bArrMo14211 = bArrMo14211;
                    i22 = i9;
                    i21 = i7;
                    messageDigestM36660 = messageDigestM36660;
                    c3798 = c3798;
                    bArrM55942 = bArrM55942;
                    str4 = str4;
                    c25065 = c25065;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    break;
                case -1614435532:
                case 1141357615:
                    return c14645M33466;
                case -1581040984:
                case 115325523:
                    C1025.m56230();
                    if (!C0912.m55833()) {
                        iM55680 = (C0873.m55680("ۡᩳ") + i19) * 101;
                        i = ((iM55680 ^ i20) * 4557) ^ 1568241521;
                        i2 = 2001279579;
                        i22 = iM55680 ^ i2;
                        i21 = i;
                    } else {
                        bArr = bArrMo14211;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        c25065 = c25065;
                        c3798 = c3798;
                        iM55979 = C0873.m55680("ۙ᩸") ^ i20;
                        i3 = ((iM55979 ^ i19) * (-25921)) ^ (-926627882);
                        i5 = 812960217;
                        i4 = iM55979 ^ i5;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        bArrMo14211 = bArr;
                        i22 = i4;
                        i21 = i3;
                        c3798 = c3798;
                        c25065 = c25065;
                    }
                    break;
                case -1554565099:
                case 816318288:
                    c25065 = c25065;
                    c3798 = c3798;
                    bArrMo14211 = c20066Execute.m45436().mo4016().mo14211();
                    c14645M33466 = C14645.m33466((InputStream) new ByteArrayInputStream(C6054.m13644(bArrMo14211, bArrMo14211.length)));
                    if (z) {
                        iM55681 = (C0873.m55680("ܰۛ") ^ i20) * 93;
                        i3 = ((iM55681 ^ i19) * (-29111)) ^ 479098873;
                        i6 = 1347236674;
                    } else {
                        iM55681 = (i19 - C0873.m55680("ۚۧ")) * (-53);
                        i3 = ((iM55681 ^ i20) * (-1111)) ^ 1744129949;
                        i6 = -1984142226;
                    }
                    i22 = iM55681 ^ i6;
                    i21 = i3;
                    c3798 = c3798;
                    c25065 = c25065;
                    break;
                case -1518086369:
                case 777321186:
                    Object[] objArr = new Object[i16];
                    objArr[i17] = C1404.m56460(abstractC17043);
                    throw new C3924(C3865.m7622(c25065M44754, C0912.m55826(iM559710, objArr)));
                case -1415944161:
                case 1867634580:
                    C3798 c3799 = c3798;
                    C19701 c19701M55781 = RunnableC0897.m55781(4130);
                    C0866.m55644(c19701M55781, strArr[i17]);
                    C25065 c25065M44755 = c19701M55781.m44754();
                    if (C0930.m55892(c25065M44755)) {
                        iM55684 = (i20 - C0873.m55680("ᩳ᩹")) * 79;
                        i = ((iM55684 ^ i19) * 9335) ^ 1926561303;
                        i15 = 1652046080;
                    } else {
                        iM55684 = C0873.m55680("ۤᩳ") ^ i19;
                        i = ((iM55684 ^ i20) * (-14393)) ^ (-799317684);
                        i15 = -700899495;
                    }
                    i22 = iM55684 ^ i15;
                    c3798 = c3799;
                    c25065 = c25065M44755;
                    i21 = i;
                    break;
                case -1187269020:
                case 2109118042:
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0873.m55680("ۡᩳ") + i19) * 101;
                        i = ((iM55680 ^ i20) * 4557) ^ 1568241521;
                        i2 = 2001279579;
                    } else {
                        iM55680 = C0873.m55680("ᩳ۟") ^ i20;
                        i = ((iM55680 ^ i19) * (-4841)) ^ (-843147901);
                        i2 = 900515593;
                    }
                    i22 = iM55680 ^ i2;
                    i21 = i;
                    break;
                case -1152372108:
                case 1702896886:
                    bArrMo14211 = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    str4 = str4;
                    strM55952 = strM55952;
                    bArrM55942 = bArrM55942;
                    c3798 = c3798;
                    messageDigest = messageDigest3;
                    sArr6 = sArr6;
                    C15545 c15548 = c15547;
                    messageDigest.update(strM55863.getBytes());
                    messageDigestM36660 = messageDigestM36660;
                    C16111.m36663(messageDigest, messageDigestM36660, C25037.m54976(interfaceC3579M54972).mo14212());
                    sArr5 = f83020;
                    i25 = 46;
                    if (!C0890.m55740()) {
                        c15547 = c15548;
                        int iM559713 = C0946.m55979("᩹ۖ") ^ i20;
                        messageDigest3 = messageDigest;
                        i7 = ((iM559713 ^ i19) * (-25165)) ^ (-272456144);
                        i9 = iM559713 ^ (-1366800456);
                        strM55952 = strM55952;
                        sArr6 = sArr6;
                        messageDigest3 = messageDigest3;
                        bArrMo14211 = bArrMo14211;
                        i22 = i9;
                        i21 = i7;
                        messageDigestM36660 = messageDigestM36660;
                        c3798 = c3798;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        c25065 = c25065;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    } else {
                        int iM55689 = (i19 - C0873.m55680("ۜۤ")) * 57;
                        strM55952 = strM55952;
                        c15547 = c15548;
                        bArrMo14211 = bArrMo14211;
                        i22 = iM55689 ^ (-102220522);
                        i21 = ((iM55689 ^ i20) * 22413) ^ 1204003776;
                        sArr6 = sArr6;
                        messageDigest3 = messageDigest;
                        bArrM55942 = bArrM55942;
                        messageDigestM36660 = messageDigestM36660;
                        str4 = str4;
                        c3798 = c3798;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        c25065 = c25065;
                    }
                    break;
                case -1030126915:
                case 822836534:
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    str4 = str4;
                    strM55952 = strM55952;
                    bArrM55942 = bArrM55942;
                    c3798 = c3798;
                    sArr2 = sArr6;
                    iM559710 = C0946.m55979(C1229.m56403(f83020, 66, 3, i23)) ^ 2129045699;
                    if (zM55655) {
                        iM55683 = C0873.m55680("ܺۧ") ^ i19;
                        i12 = ((iM55683 ^ i20) * (-7869)) ^ 812897058;
                        i13 = 85760494;
                    } else {
                        iM55683 = C0946.m55979("᩵ܿ") ^ i20;
                        i12 = ((iM55683 ^ i19) * (-1807)) ^ 1810884352;
                        i13 = -1017060897;
                    }
                    i14 = iM55683 ^ i13;
                    sArr6 = sArr2;
                    strM55952 = strM55952;
                    c3798 = c3798;
                    bArrMo14211 = bArr;
                    i22 = i14;
                    i21 = i12;
                    c25065 = c25065;
                    bArrM55942 = bArrM55942;
                    str4 = str4;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    break;
                case -855656472:
                case 2039968574:
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    strM55952 = strM55952;
                    c3798 = c3798;
                    sArr2 = sArr6;
                    C11349 c113410 = new C11349();
                    str4 = str4;
                    c113410.m26292(str4);
                    c113410.m26291();
                    bArrM55942 = bArrM55942;
                    c20066Execute = C7050.m16220().m42716(c113410.m26284()).execute();
                    if (c20066Execute.m45439()) {
                        iM55683 = C0873.m55680("ܶۛ") ^ i20;
                        i12 = ((iM55683 ^ i19) * (-9275)) ^ 702245135;
                        i13 = 1314979367;
                    } else {
                        iM55683 = (C0873.m55680("ۘۖ") ^ i19) * 33;
                        i12 = ((iM55683 ^ i20) * (-23165)) ^ (-360212193);
                        i13 = -1422917591;
                    }
                    i14 = iM55683 ^ i13;
                    sArr6 = sArr2;
                    strM55952 = strM55952;
                    c3798 = c3798;
                    bArrMo14211 = bArr;
                    i22 = i14;
                    i21 = i12;
                    c25065 = c25065;
                    bArrM55942 = bArrM55942;
                    str4 = str4;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    break;
                case -772317708:
                case 1723380897:
                    if (!C0882.f81846) {
                        iM55680 = C0946.m55979("۬ۡ") ^ i19;
                        i = ((iM55680 ^ i20) * (-30211)) ^ (-1375551022);
                        i2 = 1688766126;
                        i22 = iM55680 ^ i2;
                        i21 = i;
                    } else {
                        bArr = bArrMo14211;
                        c25065 = c25065;
                        c3798 = c3798;
                        int iM559714 = (i19 - C0946.m55979("ۧۚ")) * (-19);
                        i3 = ((iM559714 ^ i20) * 22025) ^ (-1245400780);
                        i4 = iM559714 ^ (-1144674067);
                        bArrMo14211 = bArr;
                        i22 = i4;
                        i21 = i3;
                        c3798 = c3798;
                        c25065 = c25065;
                    }
                    break;
                case -770689580:
                case 712750872:
                    if (c14645M33467 == null) {
                        bArr = bArrMo14211;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        c25065 = c25065;
                        str4 = str4;
                        strM55952 = strM55952;
                        bArrM55942 = bArrM55942;
                        c3798 = c3798;
                        bigInteger = bigInteger2;
                        sArr2 = sArr6;
                        iM55683 = (C0946.m55979("ܽܰ") ^ i19) * (-107);
                        bigInteger2 = bigInteger;
                        i12 = ((iM55683 ^ i20) * (-929)) ^ (-268246198);
                        i13 = 1997759558;
                        i14 = iM55683 ^ i13;
                        sArr6 = sArr2;
                        strM55952 = strM55952;
                        c3798 = c3798;
                        bArrMo14211 = bArr;
                        i22 = i14;
                        i21 = i12;
                        c25065 = c25065;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    } else {
                        iM55680 = C0946.m55979("ܺ᩵") ^ i19;
                        i = ((iM55680 ^ i20) * (-17989)) ^ (-262608188);
                        i2 = 2024013474;
                        i22 = iM55680 ^ i2;
                        i21 = i;
                    }
                    break;
                case -698412019:
                case 288286782:
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    str4 = str4;
                    strM55952 = strM55952;
                    bArrM55942 = bArrM55942;
                    c3798 = c3798;
                    short[] sArr8 = sArr5;
                    i10 = i25;
                    byte[] bytes = C1048.m56318(sArr8, i10, 20, i23).getBytes();
                    sArr5 = sArr8;
                    messageDigest2 = messageDigest3;
                    messageDigest2.update(bytes);
                    sArr3 = sArr6;
                    c15546 = c15547;
                    i11 = 1;
                    BigInteger bigInteger3 = new BigInteger(1, messageDigest2.digest());
                    if (C1024.m56209() >= 0) {
                        bigInteger2 = bigInteger3;
                        int iM559715 = C0946.m55979("᩶ۗ") ^ i20;
                        i25 = i10;
                        sArr5 = sArr5;
                        i16 = i11;
                        strM55952 = strM55952;
                        c15547 = c15546;
                        bArrMo14211 = bArr;
                        i22 = iM559715 ^ (-1953714217);
                        i21 = ((iM559715 ^ i19) * (-28159)) ^ 214964179;
                        sArr6 = sArr3;
                        c3798 = c3798;
                        messageDigest3 = messageDigest2;
                        c25065 = c25065;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    } else {
                        int iM556810 = C0873.m55680("ᩴ᩺") ^ i20;
                        int i27 = ((iM556810 ^ i19) * 17) ^ (-1518793690);
                        i25 = i10;
                        sArr5 = sArr5;
                        c15547 = c15546;
                        i16 = 1;
                        strM55952 = strM55952;
                        sArr6 = sArr3;
                        bArrMo14211 = bArr;
                        messageDigest3 = messageDigest2;
                        i22 = iM556810 ^ (-591762924);
                        c3798 = c3798;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        c25065 = c25065;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        bigInteger2 = bigInteger3;
                        i21 = i27;
                    }
                    break;
                case -661070446:
                case -430373492:
                    C0989.m56095();
                    if (C0906.m55809() <= 0) {
                        bArr = bArrMo14211;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        c25065 = c25065;
                        str = strM55952;
                        sArr = sArr6;
                        c3798 = c3798;
                        c15545 = c15547;
                        int iM556811 = (C0873.m55680("᩻ۙ") + i19) * 59;
                        sArr5 = sArr5;
                        c15547 = c15545;
                        sArr6 = sArr;
                        i21 = ((iM556811 ^ i20) * (-20721)) ^ (-1430755208);
                        strM55952 = str;
                        c3798 = c3798;
                        bArrMo14211 = bArr;
                        i22 = iM556811 ^ 1698346418;
                        c25065 = c25065;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    } else {
                        iM55680 = (C0873.m55680("ۡᩳ") + i19) * 101;
                        i = ((iM55680 ^ i20) * 4557) ^ 1568241521;
                        i2 = 2001279579;
                        i22 = iM55680 ^ i2;
                        i21 = i;
                    }
                    break;
                case -627722023:
                case 277804459:
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    str4 = str4;
                    strM55952 = strM55952;
                    bArrM55942 = bArrM55942;
                    c3798 = c3798;
                    sArr2 = sArr6;
                    C19701 c19701M56033 = C0955.m56033(4129);
                    C0930.m55884(c19701M56033, strArr[i17]);
                    C0866.m55644(c19701M56033, strArr[i16]);
                    c25065M44754 = c19701M56033.m44754();
                    zM55655 = C0866.m55655(c25065M44754);
                    if (C0845.f81821 < 0) {
                        iM55683 = (C0873.m55680("ۛ᩹") ^ i20) * 23;
                        i12 = ((iM55683 ^ i19) * (-31985)) ^ 97021338;
                        i13 = 1627974681;
                        i14 = iM55683 ^ i13;
                        sArr6 = sArr2;
                        strM55952 = strM55952;
                        c3798 = c3798;
                        bArrMo14211 = bArr;
                        i22 = i14;
                        i21 = i12;
                        c25065 = c25065;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    } else {
                        c15546 = c15547;
                        i11 = i16;
                        messageDigest2 = messageDigest3;
                        sArr5 = sArr5;
                        i10 = i25;
                        sArr3 = sArr2;
                        int iM559716 = C0946.m55979("᩶ۗ") ^ i20;
                        i25 = i10;
                        sArr5 = sArr5;
                        i16 = i11;
                        strM55952 = strM55952;
                        c15547 = c15546;
                        bArrMo14211 = bArr;
                        i22 = iM559716 ^ (-1953714217);
                        i21 = ((iM559716 ^ i19) * (-28159)) ^ 214964179;
                        sArr6 = sArr3;
                        c3798 = c3798;
                        messageDigest3 = messageDigest2;
                        c25065 = c25065;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    }
                    break;
                case -601419669:
                case 2098192334:
                    c25065 = c25065;
                    C15370 c15370M28835 = C21468.f67730.m28835(strArr[i17]);
                    interfaceC12257M54977 = C25037.m54977(c15370M28835.m35032(i17));
                    int iM559717 = (C0946.m55979("֫᩵") + i19) * C0254q.f1218h;
                    c15370 = c15370M28835;
                    i21 = ((iM559717 ^ i20) * (-7755)) ^ 1844936443;
                    i22 = iM559717 ^ (-716496941);
                    c25065 = c25065;
                    break;
                case -422146508:
                case 409326078:
                    if (C1124.m56367() >= 0) {
                        iM55680 = C0946.m55979("۬ۡ") ^ i19;
                        i = ((iM55680 ^ i20) * (-30211)) ^ (-1375551022);
                        i2 = 1688766126;
                        i22 = iM55680 ^ i2;
                        i21 = i;
                    } else {
                        bArr = bArrMo14211;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        c25065 = c25065;
                        str = strM55952;
                        sArr = sArr6;
                        c3798 = c3798;
                        c15545 = c15547;
                        int iM556812 = (C0873.m55680("᩻ۙ") + i19) * 59;
                        sArr5 = sArr5;
                        c15547 = c15545;
                        sArr6 = sArr;
                        i21 = ((iM556812 ^ i20) * (-20721)) ^ (-1430755208);
                        strM55952 = str;
                        c3798 = c3798;
                        bArrMo14211 = bArr;
                        i22 = iM556812 ^ 1698346418;
                        c25065 = c25065;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    }
                    break;
                case -390203661:
                case 728952719:
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    str4 = str4;
                    bArrM55942 = bArrM55942;
                    c3798 = c3798;
                    sArr4 = sArr6;
                    int iM55012 = c25065M44754.m55012() & 255;
                    strM55952 = ViewOnClickListenerC0939.m55952(c25065M44754);
                    strM55921 = C0937.m55921(f83020, 69, 16, i23);
                    if (iM55012 != 0) {
                        str2 = strM55952;
                        int iM559718 = C0946.m55979("۬ۧ") ^ i19;
                        sArr6 = sArr4;
                        c3798 = c3798;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        c25065 = c25065;
                        String str6 = strM55952;
                        strM55952 = str2;
                        i21 = ((iM559718 ^ i20) * 1075) ^ (-1029410046);
                        bArrMo14211 = bArr;
                        i22 = iM559718 ^ 559866723;
                        bArrM55942 = bArrM55942;
                        str4 = str6;
                    } else {
                        int iM559719 = C0946.m55979("ܰ᩻") ^ i20;
                        i12 = ((iM559719 ^ i19) * (-21559)) ^ 301618569;
                        i14 = iM559719 ^ 39023638;
                        sArr6 = sArr4;
                        c3798 = c3798;
                        bArrMo14211 = bArr;
                        i22 = i14;
                        i21 = i12;
                        c25065 = c25065;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    }
                    break;
                case -325502925:
                case 2014649931:
                    c25065 = c25065;
                    c3798 = c3798;
                    StringBuilder sb = new StringBuilder();
                    bArr = bArrMo14211;
                    Object[] objArr2 = new Object[i16];
                    objArr2[i17] = C1404.m56460(abstractC17043);
                    if (C1194.f82045 == 0) {
                        C1003.m56121(sb, C1003.m56122(iM559710, objArr2));
                        C1003.m56121(sb, strM55921);
                        C0863.m55629(sb, c20066Execute2.m45443());
                        if (C0863.f81833 > 0) {
                            C0912.m55825(sb, C1048.m56318(f83020, UMErrorCode.E_UM_BE_JSON_FAILED, 9, i23));
                            C0912.m55825(sb, c20066Execute2.m45436().m4012());
                            throw new C3924(C0845.m55591(sb));
                        }
                    }
                    int iM5597110 = (i19 - C0946.m55979("ۧۚ")) * (-19);
                    i3 = ((iM5597110 ^ i20) * 22025) ^ (-1245400780);
                    i4 = iM5597110 ^ (-1144674067);
                    bArrMo14211 = bArr;
                    i22 = i4;
                    i21 = i3;
                    c3798 = c3798;
                    c25065 = c25065;
                    break;
                case -290741487:
                case 1350955103:
                    String strM55815 = C0906.m55815(c25065);
                    bArrM55942 = bArrM55942;
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    c3798 = c3798;
                    sArr4 = sArr6;
                    String str7 = strM55952;
                    strM55952 = strM55815;
                    str2 = str7;
                    int iM5597111 = C0946.m55979("۬ۧ") ^ i19;
                    sArr6 = sArr4;
                    c3798 = c3798;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    String str8 = strM55952;
                    strM55952 = str2;
                    i21 = ((iM5597111 ^ i20) * 1075) ^ (-1029410046);
                    bArrMo14211 = bArr;
                    i22 = iM5597111 ^ 559866723;
                    bArrM55942 = bArrM55942;
                    str4 = str8;
                    break;
                case -278614774:
                case 1941558735:
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    c3798 = c3798;
                    c11349 = new C11349();
                    str = strM55952;
                    c11349.m26292(str);
                    sArr6 = f83020;
                    i24 = 85;
                    i26 = 11;
                    if (!C1404.m56468()) {
                        sArr = sArr6;
                        c15545 = c15547;
                        int iM556813 = (C0873.m55680("᩻ۙ") + i19) * 59;
                        sArr5 = sArr5;
                        c15547 = c15545;
                        sArr6 = sArr;
                        i21 = ((iM556813 ^ i20) * (-20721)) ^ (-1430755208);
                        strM55952 = str;
                        c3798 = c3798;
                        bArrMo14211 = bArr;
                        i22 = iM556813 ^ 1698346418;
                        c25065 = c25065;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    } else {
                        int iM559720 = (C0946.m55979("۫۟") + i19) * (-21);
                        i3 = ((iM559720 ^ i20) * (-17251)) ^ (-1171447457);
                        i4 = iM559720 ^ (-772066717);
                        strM55952 = str;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        bArrMo14211 = bArr;
                        i22 = i4;
                        i21 = i3;
                        c3798 = c3798;
                        c25065 = c25065;
                    }
                    break;
                case -110736155:
                case 894076685:
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    str4 = str4;
                    strM55952 = strM55952;
                    bArrM55942 = bArrM55942;
                    c3798 = c3798;
                    sArr2 = sArr6;
                    try {
                        str3 = str5;
                        try {
                            C3798 c3798M28839 = C21468.f67730.m28839(str3);
                            int iM559721 = (C0946.m55979("ܺۘ") + i20) * 61;
                            i21 = ((iM559721 ^ i19) * (-11257)) ^ 1436703979;
                            sArr6 = sArr2;
                            strM55952 = strM55952;
                            c3798 = c3798M28839;
                            bArrMo14211 = bArr;
                            str5 = str3;
                            i22 = iM559721 ^ (-994253199);
                            bArrM55942 = bArrM55942;
                            str4 = str4;
                            c25065 = c25065;
                        } catch (IOException unused) {
                            c14645M33467 = c14645;
                            iM55683 = C0873.m55680("ۘܰ") ^ i19;
                            str5 = str3;
                            i12 = ((iM55683 ^ i20) * (-24887)) ^ 644951803;
                            i13 = 1068590972;
                            i14 = iM55683 ^ i13;
                            sArr6 = sArr2;
                            strM55952 = strM55952;
                            c3798 = c3798;
                            bArrMo14211 = bArr;
                            i22 = i14;
                            i21 = i12;
                            c25065 = c25065;
                            bArrM55942 = bArrM55942;
                            str4 = str4;
                        }
                    } catch (IOException unused2) {
                        str3 = str5;
                    }
                    interfaceC12257M54977 = interfaceC12257M54977;
                    break;
                case -14505544:
                case 1362460825:
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    c3798 = c3798;
                    c11349.m26287(C0989.m56092(f83020, 96, 3, i23), AbstractC4643.m9818(c15547, bArrM55942));
                    c20066Execute2 = C7050.m16220().m42716(c11349.m26284()).execute();
                    if (c20066Execute2.m45439()) {
                        iM55979 = (C0873.m55680("ۜ۬") ^ i20) * (-43);
                        i3 = ((iM55979 ^ i19) * (-28103)) ^ (-1442818176);
                        i5 = 1221157383;
                    } else {
                        iM55979 = C0946.m55979("ۚۢ") ^ i19;
                        i3 = ((iM55979 ^ i20) * 32253) ^ (-1639813301);
                        i5 = 20474507;
                    }
                    i4 = iM55979 ^ i5;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    bArrMo14211 = bArr;
                    i22 = i4;
                    i21 = i3;
                    c3798 = c3798;
                    c25065 = c25065;
                    break;
                case 184268007:
                case 2081524403:
                    bArr = bArrMo14211;
                    c25065 = c25065;
                    c3798 = c3798;
                    StringBuilder sb2 = new StringBuilder();
                    interfaceC12257M54977 = interfaceC12257M54977;
                    Object[] objArr3 = new Object[i16];
                    objArr3[i17] = C1404.m56460(abstractC17043);
                    if (C1025.f81947 >= 0) {
                        iM55979 = C0873.m55680("ۙ᩸") ^ i20;
                        i3 = ((iM55979 ^ i19) * (-25921)) ^ (-926627882);
                        i5 = 812960217;
                        i4 = iM55979 ^ i5;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        bArrMo14211 = bArr;
                        i22 = i4;
                        i21 = i3;
                        c3798 = c3798;
                        c25065 = c25065;
                    } else {
                        C1003.m56121(sb2, C0912.m55826(iM559710, objArr3));
                        C1003.m56121(sb2, strM55921);
                        C0863.m55629(sb2, c20066Execute.m45443());
                        if (C0877.m55696()) {
                            C1003.m56121(sb2, C1044.m56276(f83020, 99, 11, i23));
                            C0912.m55825(sb2, c20066Execute.m45436().m4012());
                            throw new C3924(C0863.m55639(sb2));
                        }
                        messageDigest2 = messageDigest3;
                        sArr3 = sArr6;
                        c15546 = c15547;
                        i11 = i16;
                        i10 = i25;
                        int iM5597112 = C0946.m55979("᩶ۗ") ^ i20;
                        i25 = i10;
                        sArr5 = sArr5;
                        i16 = i11;
                        strM55952 = strM55952;
                        c15547 = c15546;
                        bArrMo14211 = bArr;
                        i22 = iM5597112 ^ (-1953714217);
                        i21 = ((iM5597112 ^ i19) * (-28159)) ^ 214964179;
                        sArr6 = sArr3;
                        c3798 = c3798;
                        messageDigest3 = messageDigest2;
                        c25065 = c25065;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    }
                    break;
                case 287985266:
                case 999843494:
                    Object[] objArr4 = new Object[i16];
                    objArr4[i17] = C1404.m56460(abstractC17043);
                    throw new C3924(C3865.m7622(c25065, C1003.m56122(iM559710, objArr4)));
                case 449435748:
                case 679274698:
                    try {
                        byte[] bArrMo14212 = C25037.m54976(c3798.m7411(i17)).mo14211();
                        byte[] bArrM13644 = C6054.m13644(bArrMo14212, bArrMo14212.length);
                        c3798.close();
                        c14645M33467 = C14645.m33466((InputStream) new ByteArrayInputStream(bArrM13644));
                        bArr = bArrMo14211;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        c25065 = c25065;
                        str4 = str4;
                        strM55952 = strM55952;
                        bArrM55942 = bArrM55942;
                        c3798 = c3798;
                        str3 = str5;
                        sArr2 = sArr6;
                    } catch (IOException unused3) {
                        bArr = bArrMo14211;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        c25065 = c25065;
                        str4 = str4;
                        strM55952 = strM55952;
                        bArrM55942 = bArrM55942;
                        c3798 = c3798;
                        str3 = str5;
                        sArr2 = sArr6;
                        c14645M33467 = c14645;
                    }
                    iM55683 = C0873.m55680("ۘܰ") ^ i19;
                    str5 = str3;
                    i12 = ((iM55683 ^ i20) * (-24887)) ^ 644951803;
                    i13 = 1068590972;
                    i14 = iM55683 ^ i13;
                    sArr6 = sArr2;
                    strM55952 = strM55952;
                    c3798 = c3798;
                    bArrMo14211 = bArr;
                    i22 = i14;
                    i21 = i12;
                    c25065 = c25065;
                    bArrM55942 = bArrM55942;
                    str4 = str4;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    break;
                case 1018534604:
                case 1136417938:
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0873.m55680("ۘۗ") ^ i19;
                        i = ((iM55680 ^ i20) * 13689) ^ (-1795913817);
                        i2 = -1721092631;
                        i22 = iM55680 ^ i2;
                        i21 = i;
                    } else {
                        bArr = bArrMo14211;
                        c25065 = c25065;
                        c3798 = c3798;
                        int iM5597113 = (i19 - C0946.m55979("ۧۚ")) * (-19);
                        i3 = ((iM5597113 ^ i20) * 22025) ^ (-1245400780);
                        i4 = iM5597113 ^ (-1144674067);
                        bArrMo14211 = bArr;
                        i22 = i4;
                        i21 = i3;
                        c3798 = c3798;
                        c25065 = c25065;
                    }
                    break;
                case 1122324944:
                case 1582613772:
                    c25065 = c25065;
                    if (c3798 != null) {
                        iM55681 = C0873.m55680("ۢᩳ") ^ i20;
                        c3798 = c3798;
                        i3 = ((iM55681 ^ i19) * (-14081)) ^ (-2064421084);
                        i6 = -984930484;
                        i22 = iM55681 ^ i6;
                        i21 = i3;
                        c3798 = c3798;
                        c25065 = c25065;
                    } else {
                        c3798 = c3798;
                        bArr = bArrMo14211;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        str4 = str4;
                        strM55952 = strM55952;
                        sArr2 = sArr6;
                        bArrM55942 = bArrM55942;
                        str3 = str5;
                        c14645M33467 = c14645;
                        iM55683 = C0873.m55680("ۘܰ") ^ i19;
                        str5 = str3;
                        i12 = ((iM55683 ^ i20) * (-24887)) ^ 644951803;
                        i13 = 1068590972;
                        i14 = iM55683 ^ i13;
                        sArr6 = sArr2;
                        strM55952 = strM55952;
                        c3798 = c3798;
                        bArrMo14211 = bArr;
                        i22 = i14;
                        i21 = i12;
                        c25065 = c25065;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    }
                    break;
                case 1325940317:
                case 1780627084:
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    str4 = str4;
                    strM55952 = strM55952;
                    bArrM55942 = bArrM55942;
                    c3798 = c3798;
                    sArr2 = sArr6;
                    str5 = strArr[i17];
                    c14645 = null;
                    iM55683 = C0873.m55680("۬ܺ") ^ i20;
                    i12 = ((iM55683 ^ i19) * 9951) ^ 343553695;
                    i13 = -662865260;
                    i14 = iM55683 ^ i13;
                    sArr6 = sArr2;
                    strM55952 = strM55952;
                    c3798 = c3798;
                    bArrMo14211 = bArr;
                    i22 = i14;
                    i21 = i12;
                    c25065 = c25065;
                    bArrM55942 = bArrM55942;
                    str4 = str4;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    break;
                case 1347859727:
                case 1813477247:
                    bArrMo14211 = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    c3798 = c3798;
                    short[] sArr9 = sArr6;
                    c11349.m26293(C0854.m55597(sArr9, i24, i26, i23), strArr[i16]);
                    c15547 = f74811;
                    bArrM55942 = ViewOnClickListenerC0939.m55942(abstractC17043);
                    if (C0955.m56025()) {
                        str4 = str4;
                        strM55952 = strM55952;
                        bArrM55942 = bArrM55942;
                        messageDigest = messageDigest3;
                        sArr6 = sArr9;
                        messageDigestM36660 = messageDigestM36660;
                        int iM5597114 = C0946.m55979("᩹ۖ") ^ i20;
                        messageDigest3 = messageDigest;
                        i7 = ((iM5597114 ^ i19) * (-25165)) ^ (-272456144);
                        i9 = iM5597114 ^ (-1366800456);
                        strM55952 = strM55952;
                        sArr6 = sArr6;
                        messageDigest3 = messageDigest3;
                        bArrMo14211 = bArrMo14211;
                        i22 = i9;
                        i21 = i7;
                        messageDigestM36660 = messageDigestM36660;
                        c3798 = c3798;
                        bArrM55942 = bArrM55942;
                        str4 = str4;
                        c25065 = c25065;
                        interfaceC12257M54977 = interfaceC12257M54977;
                    } else {
                        int iM556814 = C0873.m55680("᩷᩶") ^ i20;
                        sArr6 = sArr9;
                        c3798 = c3798;
                        interfaceC12257M54977 = interfaceC12257M54977;
                        c25065 = c25065;
                        i22 = iM556814 ^ (-1140724207);
                        i21 = ((iM556814 ^ i19) * (-10187)) ^ 482935545;
                        bArrMo14211 = bArrMo14211;
                    }
                    break;
                default:
                    C1929.m56553();
                    C0967.m56074();
                    bArr = bArrMo14211;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    c25065 = c25065;
                    c3798 = c3798;
                    iM55979 = C0873.m55680("ۙ᩸") ^ i20;
                    i3 = ((iM55979 ^ i19) * (-25921)) ^ (-926627882);
                    i5 = 812960217;
                    i4 = iM55979 ^ i5;
                    interfaceC12257M54977 = interfaceC12257M54977;
                    bArrMo14211 = bArr;
                    i22 = i4;
                    i21 = i3;
                    c3798 = c3798;
                    c25065 = c25065;
                    break;
            }
        }
    }
}
