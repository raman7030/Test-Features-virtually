package p067l;

import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.stateless.C0791b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.p080ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.۠۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes3.dex */
public final class C10140 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f28084;

    /* JADX INFO: renamed from: ۧ */
    public C3434 f28085;

    /* JADX INFO: renamed from: ᩳۢ᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f82081 = {8347, 22557, 20094, -22712, 29097, 31678, 29359, 32095, -17297, 28837, -16913, 32072, 30885, 23389, -20201, 17696, -17908, 20200, -22859, 21490, -24534, 23071, 31746, 31441, 23749, -21884, 17122, -17854, -20295, -16571, 16602, 16858, -20002, 16407, -16766, 24215, 23356, -18272, 18678, -21288, 23247, 19231, 19093, 25303, -17370, 20619, -24103, 30163, -18329, 22211, 30534, 18952, 22600, -24500, -20401, 20538, 25404, 31336, 24448, 19900, 30198, -18970, 25570, 23147, 11444, 11429, 11454, 11402, 11430, 11452, 11442, 11451, 11444, 11425, 11424, 11431, 11440, 11402, 11452, 11451, 11443, 11450, 11402, 11424, 11429, 11429, 11440, 11431, 11402, 11446, 11444, 11430, 11440, 11444, 11429, 11454, 11402, 11430, 11452, 11442, 11451, 11444, 11425, 11424, 11431, 11440, 11402, 11452, 11451, 11443, 11450, 11402, 11444, 11441, 11441, 11402, 11446, 11450, 11449, 11450, 11451, 28797, 21049, 31113, 1448, 9222, 7224, 20193, 24934, 21671, 27881, 19610, -25403, -25302, -27669, 17296, 25046, -27538, 18567, 21890, 28668, -29133, -7094, 2785, -624, 97, -2243, 2941, -11261, -1729, -6192, -4498, 1857, -8378, 800, -11443, 6473, 2763, 7193, 5846, 15343, 6190, 9119, 9717, 15799, -15785, 14699, 14190, -10576, -8998, 6402, 10491, 11948, -13456, 8418, -9066, -10974, 12331, 13998, -13252, 8697, -9897, 7772, -13340, 4393, -14390, -12548, -9405, -9021, 10991, 13700, -14475, -15579, 12432, -13305, -9891, -8759, 11307, 15959, -10190, 7108, -12475, 17857, 17865, 17873, 17817, 17792, 17809, 17802, 17854, 17810, 17800, 17798, 17807, 17792, 17813, 17812, 17811, 17796, 17854, 17800, 17807, 17799, 17806, 17854, 17812, 17809, 17809, 17796, 17811, 17854, 17794, 17792, 17810, 17796, 17864, 14403, 16368, -14420, -10355, 8279, 9311, 7137, 30626, 30676, 30671, 30666, 30659, 30655, 30632, 30632, 30645, 30632, 8869, -29381, 27991, 29578, -31139, -31897, 28344, -23641, -25196, -25223, -30853, -27216, 25134, 31346, -29516, -21667, 31169, -24255, 32601, -28686, -32362, 27431, -21394, -21763, -29205, 148, -16448, -16390, -16396, -16387, -16398, -16409, -16410, -16415, -16394, -16398, -16387, -16393, -16415, -16388, -16390, -16393, -16451, -16390, -16387, -16409, -16394, -16387, -16409, -16451, -16398, -16400, -16409, -16390, -16388, -16387, -16451, -16443, -16422, -16426, -16444, -16415, -16394, -16398, -16393, -16420, -16387, -16385, -16406};

    /* JADX INFO: renamed from: ܽ */
    public static final C0907 f28083 = new C0907(50);

    /* JADX INFO: renamed from: ֫ */
    public static void m23620(TextView textView, View view, AbstractC17043 abstractC17043, AbstractActivityC5549 abstractActivityC5549, boolean z, C14834 c14834, InterfaceC18588 interfaceC18588, AtomicBoolean atomicBoolean) {
        StringBuilder sb = null;
        String strM55810 = null;
        short[] sArr = null;
        int i = 0;
        short[] sArr2 = null;
        int i2 = 0;
        int i3 = 1578415457;
        int i4 = RunnableC0871.f81839;
        int i5 = C0877.f81843;
        int iM55680 = C0873.m55680("᩻᩶") ^ i4;
        int i6 = ((iM55680 ^ i5) * (-28893)) ^ 1402012182;
        int i7 = 2124266177;
        while (true) {
            i3 = ((((i3 ^ i5) * (-30719)) >> 31) & i6) ^ (iM55680 ^ i7);
            switch (i3) {
                case -2063443435:
                case -1941638941:
                    strM55810 = C0906.m55810(sArr2, C0254q.f1218h, 1, i);
                    C1003.m56121(sb, strM55810);
                    if (C0894.f81854 >= 0) {
                        iM55680 = (i4 - C0946.m55979("ۙ᩸")) * 59;
                        i6 = ((iM55680 ^ i5) * 20461) ^ 911157354;
                        i7 = -1683216159;
                    } else {
                        iM55680 = C0946.m55979("ܿᩳ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-30145)) ^ 1039456659;
                        i7 = 874169818;
                    }
                    break;
                case -1985557088:
                case 1356405036:
                    atomicBoolean.set(true);
                    iM55680 = C0946.m55979("۫ۘ") ^ i4;
                    i6 = ((iM55680 ^ i5) * 13807) ^ (-1846617656);
                    i7 = -961386450;
                    break;
                case -1940199345:
                case 1028773342:
                    if (i2 <= 0) {
                        iM55680 = C0946.m55979("ۛܰ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-31909)) ^ 664661279;
                        i7 = 1943302401;
                    } else {
                        iM55680 = (C0873.m55680("֫ܺ") ^ i5) * 75;
                        i6 = ((iM55680 ^ i4) * (-27403)) ^ (-949111840);
                        i7 = 19037234;
                    }
                    break;
                case -1791605983:
                case 1252020881:
                    sArr = f82081;
                    if (C0894.f81854 >= 0) {
                        iM55680 = (i4 - C0946.m55979("ۙ᩸")) * 59;
                        i6 = ((iM55680 ^ i5) * 20461) ^ 911157354;
                        i7 = -1683216159;
                    } else {
                        iM55680 = C0873.m55680("۠۟") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-25077)) ^ 552721820;
                        i7 = 2033350919;
                    }
                    break;
                case -1699777136:
                case 437333671:
                    if (C1028.f81950 <= 0) {
                        iM55680 = (i4 - C0946.m55979("ۙ᩸")) * 59;
                        i6 = ((iM55680 ^ i5) * 20461) ^ 911157354;
                        i7 = -1683216159;
                    } else {
                        iM55680 = C0946.m55979("ۖۡ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 24255) ^ (-254996916);
                        i7 = 1708834011;
                    }
                    break;
                case -1621127944:
                case -412808651:
                    i2 = C1046.f81962;
                    iM55680 = (C0873.m55680("ۚ֨") + i4) * 87;
                    i6 = ((iM55680 ^ i5) * 8511) ^ 2091612107;
                    i7 = -659089548;
                    break;
                case -1610496887:
                case -1015959703:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("ۛܳ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 26555) ^ (-627661917);
                        i7 = -1165696190;
                    } else {
                        iM55680 = (C0873.m55680("ܳۘ") ^ i4) * 123;
                        i6 = ((iM55680 ^ i5) * (-31605)) ^ (-1253220841);
                        i7 = 82443952;
                    }
                    break;
                case -1607657816:
                case -151751050:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("ۛܳ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 26555) ^ (-627661917);
                        i7 = -1165696190;
                    } else {
                        iM55680 = (C0946.m55979("ۜۘ") ^ i5) * (-127);
                        i6 = ((iM55680 ^ i4) * 31487) ^ (-1487929634);
                        i7 = 1924452810;
                    }
                    break;
                case -1377713823:
                case 1596333608:
                    C0989.m56099(sb, abstractC17043.mo25091());
                    C1003.m56121(sb, strM55810);
                    C0989.m56099(sb, abstractC17043.mo25101());
                    C1053.m56329(new C4776(z, C0863.m55639(sb), abstractC17043, textView, abstractActivityC5549, interfaceC18588, c14834, view, atomicBoolean));
                    break;
                case -1334454572:
                case 1340782569:
                    if (C1024.f81946) {
                        iM55680 = C0946.m55979("ۛܳ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 26555) ^ (-627661917);
                        i7 = -1165696190;
                    } else {
                        iM55680 = (C0873.m55680("ۧ֫") ^ i4) * (-15);
                        i6 = ((iM55680 ^ i5) * 29073) ^ (-1292562549);
                        i7 = -1532940418;
                    }
                    break;
                case -1328612149:
                case -40128343:
                    if (ServiceConnectionC1013.m56157() > 0) {
                        iM55680 = C0873.m55680("ܶ֨") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-30973)) ^ 1370483296;
                        i7 = 972742164;
                    } else {
                        iM55680 = (C0873.m55680("ܳۘ") ^ i4) * 123;
                        i6 = ((iM55680 ^ i5) * (-31605)) ^ (-1253220841);
                        i7 = 82443952;
                    }
                    break;
                case -1262157754:
                case -852521227:
                    i = 63746;
                    iM55680 = (C0873.m55680("᩶ۗ") + i5) * (-95);
                    i6 = ((iM55680 ^ i4) * (-6983)) ^ 1792181865;
                    i7 = -1799826622;
                    break;
                case -1144353092:
                case 179140700:
                    if (atomicBoolean != null) {
                        iM55680 = C0873.m55680("ۛۗ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-30479)) ^ 173046402;
                        i7 = -560539539;
                    } else {
                        iM55680 = C0946.m55979("۫ۘ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 13807) ^ (-1846617656);
                        i7 = -961386450;
                    }
                    break;
                case -1079406059:
                case 1598638796:
                    sb = new StringBuilder();
                    C1003.m56121(sb, C0989.m56086(abstractC17043));
                    sArr2 = f82081;
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("ܶ֨") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-30973)) ^ 1370483296;
                        i7 = 972742164;
                    } else {
                        iM55680 = C0873.m55680("۠ܰ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-24029)) ^ 421807888;
                        i7 = 189635672;
                    }
                    break;
                case -1038355656:
                case -11752930:
                    ServiceConnectionC1013.m56157();
                    RunnableC0871.m55672();
                    break;
                case -992103548:
                case -523674281:
                    short s = sArr[124];
                    int i8 = s + 14902;
                    if ((i8 * i8) - (s * 59608) >= 0) {
                        iM55680 = C0946.m55979("֡ܳ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 29953) ^ (-765016679);
                        i7 = -660935018;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۨܶ")) * (-51);
                        i6 = ((iM55680 ^ i5) * (-10205)) ^ (-226803037);
                        i7 = -432199957;
                    }
                    break;
                case -980305146:
                case -342524915:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0873.m55680("ܳۘ") ^ i4) * 123;
                        i6 = ((iM55680 ^ i5) * (-31605)) ^ (-1253220841);
                        i7 = 82443952;
                    } else {
                        iM55680 = C0873.m55680("᩹ᩳ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 17381) ^ (-1755074056);
                        i7 = -749149660;
                    }
                    break;
                case -779037432:
                case 1592380453:
                    if (C0877.m55696()) {
                        iM55680 = (i5 - C0873.m55680("ᩴᩴ")) * (-77);
                        i6 = ((iM55680 ^ i4) * 20339) ^ (-705740698);
                        i7 = -1826695313;
                    } else {
                        iM55680 = C0946.m55979("ۛܰ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-31909)) ^ 664661279;
                        i7 = 1943302401;
                    }
                    break;
                case -412037199:
                case -283925358:
                    C0890.m55740();
                    if (!C1404.m56468()) {
                        iM55680 = C0946.m55979("ۛܰ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-31909)) ^ 664661279;
                        i7 = 1943302401;
                    } else {
                        iM55680 = C0946.m55979("ۛܳ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 26555) ^ (-627661917);
                        i7 = -1165696190;
                    }
                    break;
                case 349946155:
                case 1022473543:
                    if (RunnableC0897.f81856) {
                        iM55680 = (C0873.m55680("ܽܰ") ^ i4) * 51;
                        i6 = ((iM55680 ^ i5) * 16209) ^ 316957326;
                        i7 = 933930596;
                    } else {
                        iM55680 = C0873.m55680("ܶ֨") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-30973)) ^ 1370483296;
                        i7 = 972742164;
                    }
                    break;
                case 885727975:
                case 1002624522:
                    C0866.m55645();
                    iM55680 = (C0873.m55680("ܳۘ") ^ i4) * 123;
                    i6 = ((iM55680 ^ i5) * (-31605)) ^ (-1253220841);
                    i7 = 82443952;
                    break;
                default:
                    i = 9276;
                    iM55680 = (C0873.m55680("᩶ۗ") + i5) * (-95);
                    i6 = ((iM55680 ^ i4) * (-6983)) ^ 1792181865;
                    i7 = -1799826622;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0111 A[PHI: r3 r5 r8 r9 r10
      0x0111: PHI (r3v5 int) = (r3v4 int), (r3v1 int), (r3v1 int), (r3v1 int), (r3v1 int) binds: [B:30:0x010f, B:22:0x00b4, B:16:0x0076, B:14:0x0072, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r5v3 java.lang.String) = 
      (r5v1 java.lang.String)
      (r5v2 java.lang.String)
      (r5v1 java.lang.String)
      (r5v1 java.lang.String)
      (r5v1 java.lang.String)
     binds: [B:30:0x010f, B:22:0x00b4, B:16:0x0076, B:14:0x0072, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r8v4 java.lang.String) = 
      (r8v2 java.lang.String)
      (r8v3 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
     binds: [B:30:0x010f, B:22:0x00b4, B:16:0x0076, B:14:0x0072, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r9v4 java.lang.String) = 
      (r9v2 java.lang.String)
      (r9v3 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
     binds: [B:30:0x010f, B:22:0x00b4, B:16:0x0076, B:14:0x0072, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r10v4 l.᩵ۚۢ) = (r10v2 l.᩵ۚۢ), (r10v3 l.᩵ۚۢ), (r10v2 l.᩵ۚۢ), (r10v2 l.᩵ۚۢ), (r10v2 l.᩵ۚۢ) binds: [B:30:0x010f, B:22:0x00b4, B:16:0x0076, B:14:0x0072, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x01a3 A[PHI: r2 r4 r11
      0x01a3: PHI (r2v6 android.widget.TextView) = (r2v4 android.widget.TextView), (r2v2 android.widget.TextView), (r2v2 android.widget.TextView) binds: [B:42:0x01a1, B:26:0x00e0, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x01a3: PHI (r4v5 byte[]) = (r4v1 byte[]), (r4v3 byte[]), (r4v1 byte[]) binds: [B:42:0x01a1, B:26:0x00e0, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x01a3: PHI (r11v5 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:42:0x01a1, B:26:0x00e0, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01e5 A[PHI: r13 r14 r23
      0x01e5: PHI (r13v5 int) = (r13v2 int), (r13v4 int), (r13v2 int), (r13v2 int) binds: [B:92:0x01e5, B:46:0x01e3, B:38:0x0179, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r14v4 java.lang.String) = (r14v2 java.lang.String), (r14v2 java.lang.String), (r14v3 java.lang.String), (r14v2 java.lang.String) binds: [B:92:0x01e5, B:46:0x01e3, B:38:0x0179, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r23v5 int) = (r23v3 int), (r23v4 int), (r23v3 int), (r23v3 int) binds: [B:92:0x01e5, B:46:0x01e3, B:38:0x0179, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m23624(AbstractActivityC5549 abstractActivityC5549, C3434 c3434) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int iM559710 = 0;
        byte[] bArr = null;
        String strM55913 = null;
        int i5 = RunnableC0871.f81839;
        int i6 = C1044.f81959;
        int iM55681 = C0873.m55680("۫۠") ^ i6;
        int i7 = ((iM55681 ^ i5) * 23057) ^ (-1780677048);
        C20671 c20671M55888 = null;
        String strM56584 = null;
        short[] sArr = null;
        int i8 = iM55681 ^ (-575583911);
        int i9 = 0;
        int i10 = 0;
        short s = 0;
        short s2 = 0;
        int iM55682 = 0;
        int i11 = -1509963198;
        int iM55683 = 0;
        String strM55914 = null;
        String strM55915 = null;
        EditText editText = null;
        TextView textView = null;
        View viewM56181 = null;
        while (true) {
            i11 = i8 ^ (i7 & (((i11 ^ i5) * (-1097)) >> 31));
            switch (i11) {
                case -1974555759:
                case -1057879678:
                    iM559710 = 2118777125 ^ C0946.m55979(C1025.m56233(f82081, 153, 3, i10));
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0946.m55979("ۨ᩷") ^ i6;
                        i = ((iM55979 ^ i5) * 10673) ^ 372265478;
                        i2 = 1812246431;
                    } else {
                        iM55979 = C0873.m55680("֫ۤ") ^ i6;
                        i = ((iM55979 ^ i5) * 14909) ^ (-872781076);
                        i2 = 1066560163;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -1938402127:
                case -916617994:
                    viewM56181 = C1017.m56181(abstractActivityC5549, iM55682 ^ 2127438359);
                    if (C0967.f81910 >= 0) {
                        textView = textView;
                        int iM559711 = C0946.m55979("۫ۤ") ^ i6;
                        i8 = iM559711 ^ 328325629;
                        i7 = ((iM559711 ^ i5) * (-30795)) ^ (-291716132);
                        textView = textView;
                    } else {
                        int iM559712 = (C0946.m55979("۟᩵") + i5) * 43;
                        i8 = iM559712 ^ 1626420344;
                        i7 = ((iM559712 ^ i6) * (-123)) ^ (-1927811917);
                    }
                    break;
                case -1740856884:
                case 2058291858:
                    i10 = 51561;
                    iM55680 = (C0946.m55979("ܽ۫") ^ i6) * 7;
                    i3 = ((iM55680 ^ i5) * (-22363)) ^ 861941544;
                    i4 = 326013034;
                    int i12 = iM55680 ^ i4;
                    textView = textView;
                    View view = viewM56181;
                    i8 = i12;
                    i7 = i3;
                    viewM56181 = view;
                    break;
                case -1556241794:
                case -993349647:
                    textView = (TextView) C0892.m55755(viewM56181, iM55683 ^ i9);
                    sArr = f82081;
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0873.m55680("ۘ֨") + i5) * 5;
                        i = ((iM55979 ^ i6) * 25669) ^ 868748477;
                        i2 = 240629166;
                    } else {
                        iM55979 = (i5 - C0946.m55979("۟ۙ")) * (-107);
                        i = ((iM55979 ^ i6) * (-11631)) ^ (-8513542);
                        i2 = 242882111;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -1444073872:
                case 526459121:
                    viewM56181 = viewM56181;
                    textView = textView;
                    iM55682 = C0873.m55680(C1024.m56203(f82081, 144, 3, i10));
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0873.m55680("᩻۫") ^ i5;
                        i3 = ((iM55680 ^ i6) * (-12939)) ^ 734735793;
                        i4 = -571138716;
                    } else {
                        iM55680 = (C0946.m55979("᩵ۢ") + i6) * (-113);
                        i3 = ((iM55680 ^ i5) * 25081) ^ 137609059;
                        i4 = 1108761178;
                    }
                    int i13 = iM55680 ^ i4;
                    textView = textView;
                    View view2 = viewM56181;
                    i8 = i13;
                    i7 = i3;
                    viewM56181 = view2;
                    break;
                case -1435364410:
                case 2021424269:
                    strM56584 = C1964.m56584(sArr, 150, 3, i10);
                    if (C0861.m55626()) {
                        iM55979 = C0873.m55680("ۡ֡") ^ i6;
                        i = ((iM55979 ^ i5) * (-24885)) ^ 1586563910;
                        i2 = -1978221301;
                    } else {
                        iM55979 = (i6 - C0873.m55680("ۢ۠")) * (-57);
                        i = ((iM55979 ^ i5) * 15057) ^ (-222613347);
                        i2 = 1251674423;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -1341855998:
                case -743763193:
                    RunnableC0871.m55669(c20671M55888);
                    editText.addTextChangedListener(new C20199(textView, C0863.m55639(C1025.m56220(textView)), strM55913, strM55915, strM55914, c3434));
                    break;
                case -1211511326:
                case -77022280:
                    C0947.m55996(C0892.m55755(viewM56181, iM559710), new ViewOnClickListenerC6577(1, editText));
                    bArr = c3434.f6851;
                    if (C1025.m56230()) {
                        iM55979 = (C0873.m55680("ۘ֨") + i5) * 5;
                        i = ((iM55979 ^ i6) * 25669) ^ 868748477;
                        i2 = 240629166;
                    } else {
                        iM55979 = (C0873.m55680("᩷۫") + i5) * (-125);
                        i = ((iM55979 ^ i6) * (-10087)) ^ (-1335350190);
                        i2 = -60619327;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -1114824881:
                case 649878743:
                    iM55683 = C0873.m55680(C1048.m56318(f82081, 147, 3, i10));
                    i9 = 2097871644;
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0873.m55680("ۡ֡") ^ i6;
                        i = ((iM55979 ^ i5) * (-24885)) ^ 1586563910;
                        i2 = -1978221301;
                    } else {
                        iM55979 = (C0946.m55979("ܺۗ") + i6) * (-97);
                        i = ((iM55979 ^ i5) * 14553) ^ 1797549995;
                        i2 = -1846776678;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -1112876322:
                case 1441433044:
                    viewM56181 = viewM56181;
                    textView = textView;
                    s2 = f82081[143];
                    s = 1448;
                    if (C1036.m56257() > 0) {
                        iM55680 = C0873.m55680("ۙۛ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-15913)) ^ (-682326034);
                        i4 = 1746104326;
                        int i14 = iM55680 ^ i4;
                        textView = textView;
                        View view3 = viewM56181;
                        i8 = i14;
                        i7 = i3;
                        viewM56181 = view3;
                    } else {
                        viewM56181 = viewM56181;
                        int iM559713 = C0946.m55979("۫ۤ") ^ i6;
                        i8 = iM559713 ^ 328325629;
                        i7 = ((iM559713 ^ i5) * (-30795)) ^ (-291716132);
                        textView = textView;
                    }
                    break;
                case -986399865:
                case 262638293:
                    C0898.m55800();
                    if (C1929.f83011 != 0) {
                        iM55979 = C0946.m55979("ۨ᩷") ^ i6;
                        i = ((iM55979 ^ i5) * 10673) ^ 372265478;
                        i2 = 1812246431;
                    } else {
                        iM55979 = C0873.m55680("ۡ֡") ^ i6;
                        i = ((iM55979 ^ i5) * (-24885)) ^ 1586563910;
                        i2 = -1978221301;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -616086434:
                case 817984219:
                    i10 = 36580;
                    iM55680 = (C0946.m55979("ܽ۫") ^ i6) * 7;
                    i3 = ((iM55680 ^ i5) * (-22363)) ^ 861941544;
                    i4 = 326013034;
                    int i15 = iM55680 ^ i4;
                    textView = textView;
                    View view4 = viewM56181;
                    i8 = i15;
                    i7 = i3;
                    viewM56181 = view4;
                    break;
                case -532104452:
                case 1467015793:
                    viewM56181 = viewM56181;
                    textView = textView;
                    if ((s2 * s) - ((s2 * s2) + 524176) <= 0) {
                        iM55680 = C0946.m55979("ܳۡ") ^ i5;
                        i3 = ((iM55680 ^ i6) * 20145) ^ 431787820;
                        i4 = -1455789190;
                    } else {
                        iM55680 = (i5 - C0873.m55680("۬ܺ")) * 41;
                        i3 = ((iM55680 ^ i6) * (-25821)) ^ (-1295503155);
                        i4 = 822398149;
                    }
                    int i16 = iM55680 ^ i4;
                    textView = textView;
                    View view5 = viewM56181;
                    i8 = i16;
                    i7 = i3;
                    viewM56181 = view5;
                    break;
                case -463515960:
                case 650395062:
                    C0927.m55873();
                    break;
                case -378463871:
                case 1661334645:
                    editText = (EditText) C0892.m55755(viewM56181, C0873.m55680(strM56584) ^ 2124228595);
                    if (C1028.f81950 > 0) {
                        iM55979 = C0946.m55979("ۚܺ") ^ i5;
                        i = ((iM55979 ^ i6) * (-18857)) ^ (-413236222);
                        i2 = 1493773709;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        viewM56181 = viewM56181;
                        textView = textView;
                        iM55680 = C0873.m55680("᩻۫") ^ i5;
                        i3 = ((iM55680 ^ i6) * (-12939)) ^ 734735793;
                        i4 = -571138716;
                        int i17 = iM55680 ^ i4;
                        textView = textView;
                        View view6 = viewM56181;
                        i8 = i17;
                        i7 = i3;
                        viewM56181 = view6;
                    }
                    break;
                case -113534776:
                case 38630963:
                    C0992.m56107();
                    iM55979 = C0946.m55979("ۨ᩷") ^ i6;
                    i = ((iM55979 ^ i5) * 10673) ^ 372265478;
                    i2 = 1812246431;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 60200185:
                case 1141758235:
                    C0937.m55918();
                    if (C1046.f81962 <= 0) {
                        textView = textView;
                        int iM559714 = C0946.m55979("۫ۤ") ^ i6;
                        i8 = iM559714 ^ 328325629;
                        i7 = ((iM559714 ^ i5) * (-30795)) ^ (-291716132);
                        textView = textView;
                    } else {
                        iM55979 = C0873.m55680("ۡ֡") ^ i6;
                        i = ((iM55979 ^ i5) * (-24885)) ^ 1586563910;
                        i2 = -1978221301;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case 839068232:
                case 901812339:
                    strM55913 = C0937.m55913(bArr);
                    strM55915 = C0937.m55913(c3434.f6853);
                    strM55914 = C0937.m55913(c3434.f6852);
                    c20671M55888 = C0930.m55888(abstractActivityC5549);
                    C0927.m55864(c20671M55888, viewM56181);
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0946.m55979("ۨ᩷") ^ i6;
                        i = ((iM55979 ^ i5) * 10673) ^ 372265478;
                        i2 = 1812246431;
                    } else {
                        iM55979 = C0873.m55680("֡֡") ^ i5;
                        i = ((iM55979 ^ i6) * 26407) ^ 1349070916;
                        i2 = 704621709;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                default:
                    C0949.m56012();
                    if (C0882.f81846) {
                        iM55979 = (C0873.m55680("ۘ֨") + i5) * 5;
                        i = ((iM55979 ^ i6) * 25669) ^ 868748477;
                        i2 = 240629166;
                    } else {
                        iM55979 = C0946.m55979("ۨ᩷") ^ i6;
                        i = ((iM55979 ^ i5) * 10673) ^ 372265478;
                        i2 = 1812246431;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x0143  */
    /* JADX WARN: Code duplicated, block: B:55:0x0170  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a1  */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m23626(C10140 c10140, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        int iM55680;
        int i;
        int i2;
        int i3 = 462867055;
        int i4 = C0992.f81922;
        int i5 = ServiceConnectionC1013.f81940;
        int iM55979 = C0946.m55979("ܰۨ") ^ i5;
        int i6 = ((iM55979 ^ i4) * (-7577)) ^ (-1279015655);
        int i7 = -800348159;
        while (true) {
            int i8 = iM55979 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i4) * 3663) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2102732640:
                    case 128997362:
                        if (C1929.f83011 != 0) {
                            iM55680 = C0873.m55680("֫ۛ") ^ i5;
                            i = ((iM55680 ^ i4) * 30035) ^ 2036761060;
                            i2 = 1675226396;
                        } else {
                            iM55680 = C0946.m55979("۬ۜ") ^ i5;
                            i = ((iM55680 ^ i4) * 1827) ^ (-1634438282);
                            i2 = 633852319;
                        }
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                    case -1907061657:
                    case -1827881145:
                        c10140.f28085.m6093(textView, textView2, textView3, textView4, textView5);
                        break;
                    case -1892765956:
                    case -281740248:
                        ViewOnClickListenerC0939.m55941();
                        if (C1071.f81975 <= 0) {
                            iM55680 = (C0946.m55979("ᩴ֨") + i4) * (-113);
                            i = ((iM55680 ^ i5) * (-22149)) ^ (-492750987);
                            i2 = 1649928607;
                        } else {
                            iM55680 = (C0946.m55979("֨ᩴ") ^ i4) * 29;
                            i = ((iM55680 ^ i5) * 1505) ^ 1582444910;
                            i2 = 861904794;
                        }
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                    case -1654310845:
                    case -1632932462:
                        if (C1044.f81959 >= 0) {
                            iM55680 = C0873.m55680("֫ۛ") ^ i5;
                            i = ((iM55680 ^ i4) * 30035) ^ 2036761060;
                            i2 = 1675226396;
                        } else {
                            iM55680 = (i4 - C0946.m55979("ۨܰ")) * 69;
                            i = ((iM55680 ^ i5) * (-15463)) ^ (-1722062294);
                            i2 = -1897639448;
                        }
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                    case -1053144060:
                    case -669263530:
                        C0992.m56107();
                        if (C0882.f81846) {
                            iM55680 = (C0946.m55979("ᩴ֨") + i4) * (-113);
                            i = ((iM55680 ^ i5) * (-22149)) ^ (-492750987);
                            i2 = 1649928607;
                        } else {
                            iM55680 = (i5 - C0946.m55979("ᩳۨ")) * (-41);
                            i = ((iM55680 ^ i4) * 28651) ^ 414757757;
                            i2 = 1836878590;
                        }
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                    case -919537249:
                    case -622773959:
                        if (C0845.f81821 >= 0) {
                            iM55680 = (C0946.m55979("֨ᩴ") ^ i4) * 29;
                            i = ((iM55680 ^ i5) * 1505) ^ 1582444910;
                            i2 = 861904794;
                        } else {
                            iM55680 = C0873.m55680("֨᩻") ^ i4;
                            i = ((iM55680 ^ i5) * 5035) ^ 38842468;
                            i2 = -854907122;
                        }
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                    case -777238886:
                    case 645470361:
                        if (RunnableC0871.f81839 >= 0) {
                            iM55680 = C0873.m55680("֫ۛ") ^ i5;
                            i = ((iM55680 ^ i4) * 30035) ^ 2036761060;
                            i2 = 1675226396;
                        } else {
                            iM55680 = (i4 - C0946.m55979("ܶۖ")) * (-73);
                            i = ((iM55680 ^ i5) * (-14707)) ^ (-1682100320);
                            i2 = -1285171305;
                        }
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                    case -675838143:
                    case 2074025209:
                        C1071.m56343();
                        iM55680 = (C0946.m55979("ᩴ֨") + i4) * (-113);
                        i = ((iM55680 ^ i5) * (-22149)) ^ (-492750987);
                        i2 = 1649928607;
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                    case -368257167:
                    case 1658809191:
                        if (C0863.f81833 <= 0) {
                            iM55680 = (i5 - C0946.m55979("ᩳۨ")) * (-41);
                            i = ((iM55680 ^ i4) * 28651) ^ 414757757;
                            i2 = 1836878590;
                        } else {
                            iM55680 = (C0873.m55680("᩺֫") + i5) * 19;
                            i = ((iM55680 ^ i4) * (-17059)) ^ 1669027462;
                            i2 = 135258145;
                        }
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                    case -363781893:
                    case 2138484158:
                        if (C0845.f81821 >= 0) {
                            iM55680 = (C0946.m55979("ᩴ֨") + i4) * (-113);
                            i = ((iM55680 ^ i5) * (-22149)) ^ (-492750987);
                            i2 = 1649928607;
                        } else {
                            iM55680 = (i5 - C0873.m55680("ۙܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i = ((iM55680 ^ i4) * (-6141)) ^ 1842756006;
                            i2 = 353385884;
                        }
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                    case -325293992:
                    case 1019001033:
                        if (C1003.m56123() != 0) {
                            iM55680 = (C0946.m55979("ᩴ֨") + i4) * (-113);
                            i = ((iM55680 ^ i5) * (-22149)) ^ (-492750987);
                            i2 = 1649928607;
                        } else {
                            iM55680 = C0873.m55680("ܺۗ") ^ i4;
                            i = ((iM55680 ^ i5) * (-30915)) ^ (-360747201);
                            i2 = 128825436;
                        }
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                    case 124878728:
                    case 1115377331:
                        if (C0927.m55873() <= 0) {
                            iM55680 = (C0946.m55979("֨ᩴ") ^ i4) * 29;
                            i = ((iM55680 ^ i5) * 1505) ^ 1582444910;
                            i2 = 861904794;
                        } else {
                            iM55680 = C0946.m55979("ۜ᩸") ^ i5;
                            i = ((iM55680 ^ i4) * 4801) ^ (-277668193);
                            i2 = 1029397750;
                        }
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                    case 548038445:
                    case 1989840952:
                        if (C0967.m56074()) {
                            iM55680 = (C0946.m55979("ᩴ֨") + i4) * (-113);
                            i = ((iM55680 ^ i5) * (-22149)) ^ (-492750987);
                            i2 = 1649928607;
                        } else {
                            iM55680 = (C0873.m55680("᩷᩸") ^ i5) * (-17);
                            i = ((iM55680 ^ i4) * 27881) ^ (-15034667);
                            i2 = 2045281372;
                        }
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                    case 737369457:
                    case 1639094227:
                        C0912.m55833();
                        if (C0927.m55873() > 0) {
                        }
                        iM55680 = (C0946.m55979("ᩴ֨") + i4) * (-113);
                        i = ((iM55680 ^ i5) * (-22149)) ^ (-492750987);
                        i2 = 1649928607;
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                    case 2003128850:
                    case 2014465283:
                        C1929.m56553();
                        break;
                    default:
                        if (C1017.f81942 >= 0) {
                            iM55680 = (C0946.m55979("֨ᩴ") ^ i4) * 29;
                            i = ((iM55680 ^ i5) * 1505) ^ 1582444910;
                            i2 = 861904794;
                        } else {
                            iM55680 = (i4 - C0946.m55979("۟ۨ")) * 75;
                            i = ((iM55680 ^ i5) * (-11763)) ^ 952797212;
                            i2 = 1950604534;
                        }
                        i8 = iM55680 ^ i2;
                        i6 = i;
                        break;
                }
                return;
            }
            iM55979 = C0873.m55680("ۜܳ") ^ i5;
            i6 = ((iM55979 ^ i4) * 23105) ^ 1644005551;
            i7 = -1754779042;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23622(String str) {
        f28083.m6790(str);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 47321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public C10140(p067l.AbstractC17043 r78, p067l.AbstractActivityC5549 r79, p067l.C6751 r80) {
        /*
            Method dump skipped, instruction units count: 4732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C10140.<init>(l.ܶ᩵ܿ, l.ۗܺ᩷, l.ۙۧᩳ):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34121. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫ */
    public static void m23625(p067l.AbstractActivityC5549 r50, p067l.C7458 r51) {
        /*
            Method dump skipped, instruction units count: 3412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C10140.m23625(l.ۗܺ᩷, l.ۚ۫ܽ):void");
    }

    /* JADX WARN: Code duplicated, block: B:115:0x043f A[PHI: r17
      0x043f: PHI (r17v26 java.security.cert.X509Certificate) = 
      (r17v7 java.security.cert.X509Certificate)
      (r17v8 java.security.cert.X509Certificate)
      (r17v11 java.security.cert.X509Certificate)
      (r17v13 java.security.cert.X509Certificate)
      (r17v14 java.security.cert.X509Certificate)
      (r17v27 java.security.cert.X509Certificate)
     binds: [B:114:0x043d, B:110:0x041d, B:102:0x03c6, B:94:0x0370, B:90:0x034e, B:13:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m23627(C10140 c10140, TextView textView, TextView textView2, TextView textView3, AbstractActivityC5549 abstractActivityC5549, View view, TextView textView4, TextView textView5, TextView textView6, TextView textView7, RunnableC14852 runnableC14852) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        X509Certificate x509Certificate;
        C10140 c10141 = c10140;
        TextView textView8 = textView;
        TextView textView9 = textView7;
        int i5 = C1071.f81975;
        int i6 = C0898.f81858;
        int iM55680 = C0873.m55680("᩸ۧ") ^ i6;
        int i7 = ((iM55680 ^ i5) * (-7245)) ^ (-1545411454);
        String str = null;
        String sigAlgOID = null;
        String strM44503 = null;
        int i8 = iM55680 ^ 2117742537;
        int i9 = 0;
        int i10 = 753263046;
        X509Certificate x509Certificate2 = null;
        String str2 = null;
        String strM56189 = null;
        boolean zM55806 = false;
        while (true) {
            i10 = i8 ^ (i7 & (((i10 ^ i5) * 12369) >> 31));
            switch (i10) {
                case -2047232035:
                case -1680735667:
                    try {
                        strM44503 = C19588.m44503(sigAlgOID);
                        iM55979 = C0946.m55979("᩻ܺ") ^ i6;
                        i = ((iM55979 ^ i5) * 4723) ^ 1574084302;
                        i2 = 485381801;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } catch (Exception unused) {
                        int iM559711 = C0946.m55979("ܺ۠") ^ i6;
                        int i11 = ((iM559711 ^ i5) * 22579) ^ (-1382299247);
                        i8 = iM559711 ^ (-511743240);
                        c10141 = c10140;
                        textView9 = textView7;
                        i7 = i11;
                        textView8 = textView;
                    }
                    break;
                case -1981317669:
                case 1850332048:
                    if (C0866.f81837 >= 0) {
                        x509Certificate2 = x509Certificate2;
                        iM559710 = C0873.m55680("ᩳۜ") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-17953)) ^ (-1540697543);
                        i4 = 1712773760;
                        int i12 = iM559710 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i12;
                        c10141 = c10140;
                    }
                    x509Certificate2 = x509Certificate2;
                    iM559710 = C0946.m55979("ᩳ᩹") ^ i6;
                    i3 = ((iM559710 ^ i5) * (-21567)) ^ 635583882;
                    i4 = 1912530405;
                    int i13 = iM559710 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i13;
                    c10141 = c10140;
                    break;
                case -1899245725:
                case -891331840:
                    x509Certificate2 = x509Certificate2;
                    if (C1053.f81965 <= 0) {
                        iM559710 = C0946.m55979("ᩳ᩹") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                    } else {
                        iM559710 = C0873.m55680("ܰ᩶") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-32583)) ^ 205814975;
                        i4 = -1343328116;
                    }
                    int i14 = iM559710 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i14;
                    c10141 = c10140;
                    break;
                case -1777715396:
                case 479921333:
                    x509Certificate2 = x509Certificate2;
                    if (C0861.f81831) {
                        iM559710 = (C0873.m55680("᩸ۡ") + i6) * (-119);
                        i3 = ((iM559710 ^ i5) * 1087) ^ (-1987826474);
                        i4 = 276041100;
                    } else {
                        iM559710 = C0946.m55979("ᩳ᩹") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                    }
                    int i15 = iM559710 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i15;
                    c10141 = c10140;
                    break;
                case -1756728101:
                case -799332076:
                    if (!C1048.f81963) {
                        x509Certificate2 = x509Certificate2;
                        iM559710 = C0946.m55979("ᩳ᩹") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                        int i16 = iM559710 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i16;
                        c10141 = c10140;
                    } else {
                        iM55979 = C0873.m55680("۠᩵") ^ i5;
                        i = ((iM55979 ^ i6) * 24405) ^ (-1121525001);
                        i2 = 603904580;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1627199203:
                case -102794606:
                    i9 = 30714;
                    iM559710 = C0946.m55979("᩻ܳ") ^ i6;
                    i3 = ((iM559710 ^ i5) * 21333) ^ 1544767169;
                    i4 = 1671346351;
                    int i17 = iM559710 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i17;
                    c10141 = c10140;
                    break;
                case -1583767602:
                case 1709619309:
                    x509Certificate2 = x509Certificate2;
                    if (C0930.f81879 <= 0) {
                        iM559710 = C0946.m55979("ᩳ᩹") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                    } else {
                        iM559710 = (C0946.m55979("۟ۖ") + i5) * (-45);
                        i3 = ((iM559710 ^ i6) * 20289) ^ (-1107589772);
                        i4 = -1495727031;
                    }
                    int i18 = iM559710 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i18;
                    c10141 = c10140;
                    break;
                case -1547216420:
                case 1911339547:
                    C0906.m55809();
                    if (!C1929.m56553()) {
                        iM55979 = C0946.m55979("ۛ֡") ^ i5;
                        i = ((iM55979 ^ i6) * (-6803)) ^ 1282399577;
                        i2 = -153080334;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        x509Certificate2 = x509Certificate2;
                        iM559710 = C0946.m55979("ᩳ᩹") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                        int i19 = iM559710 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i19;
                        c10141 = c10140;
                    }
                    break;
                case -1486189054:
                case 1884924643:
                    x509Certificate2 = x509Certificate2;
                    if (C0845.m55584() <= 0) {
                        iM559710 = C0873.m55680("᩺ܳ") ^ i5;
                        i3 = ((iM559710 ^ i6) * (-13973)) ^ (-652231184);
                        i4 = 1223767721;
                    } else {
                        iM559710 = C0946.m55979("ܰ᩻") ^ i5;
                        i3 = ((iM559710 ^ i6) * (-30783)) ^ (-1020755936);
                        i4 = -2027767739;
                    }
                    int i110 = iM559710 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i110;
                    c10141 = c10140;
                    break;
                case -1453003865:
                case 1855055745:
                    C1964.m56597();
                    if (C1003.f81929 <= 0) {
                        x509Certificate2 = x509Certificate2;
                        iM559710 = (i6 - C0946.m55979("ۙ֫")) * (-105);
                        i3 = ((iM559710 ^ i5) * 18703) ^ 1798631325;
                        i4 = -927818207;
                        int i111 = iM559710 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i111;
                        c10141 = c10140;
                    } else {
                        iM55979 = C0946.m55979("ۛ֡") ^ i5;
                        i = ((iM55979 ^ i6) * (-6803)) ^ 1282399577;
                        i2 = -153080334;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1326199251:
                case -369390634:
                    x509Certificate2 = x509Certificate2;
                    strM56189 = C1017.m56189(f82081, 248, 5, i9);
                    RunnableC0938.m55928(textView8, strM56189);
                    RunnableC0938.m55928(textView2, strM56189);
                    C0894.m55771(textView3, strM56189);
                    if (!C1048.f81963) {
                        iM559710 = C0873.m55680("᩺ܳ") ^ i5;
                        i3 = ((iM559710 ^ i6) * (-13973)) ^ (-652231184);
                        i4 = 1223767721;
                        int i112 = iM559710 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i112;
                        c10141 = c10140;
                    } else {
                        int iM55681 = C0873.m55680("֡᩶") ^ i5;
                        i7 = ((iM55681 ^ i6) * (-14117)) ^ (-1089605309);
                        x509Certificate2 = x509Certificate2;
                        i8 = iM55681 ^ 2003721744;
                        textView9 = textView7;
                    }
                    break;
                case -1145875223:
                case 1992102766:
                    x509Certificate2 = x509Certificate2;
                    if (C1036.f81953 >= 0) {
                        iM559710 = C0873.m55680("ᩳۜ") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-17953)) ^ (-1540697543);
                        i4 = 1712773760;
                    } else {
                        iM559710 = (i5 - C0946.m55979("ۧ᩵")) * (-65);
                        i3 = ((iM559710 ^ i6) * (-13067)) ^ (-1988358350);
                        i4 = 1546546156;
                    }
                    int i113 = iM559710 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i113;
                    c10141 = c10140;
                    break;
                case -980278000:
                case -555137546:
                    i9 = 15915;
                    iM559710 = C0946.m55979("᩻ܳ") ^ i6;
                    i3 = ((iM559710 ^ i5) * 21333) ^ 1544767169;
                    i4 = 1671346351;
                    int i114 = iM559710 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i114;
                    c10141 = c10140;
                    break;
                case -914818308:
                case 1474263360:
                    C1124.m56367();
                    if (C0949.f81897 < 0) {
                        iM55979 = C0873.m55680("۠᩵") ^ i5;
                        i = ((iM55979 ^ i6) * 24405) ^ (-1121525001);
                        i2 = 603904580;
                    } else {
                        iM55979 = (C0946.m55979("ۜۡ") + i6) * 63;
                        i = ((iM55979 ^ i5) * 21509) ^ 879120952;
                        i2 = -1149979089;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -906434229:
                case 220274849:
                    x509Certificate2 = x509Certificate2;
                    if (C0989.m56095() <= 0) {
                        iM559710 = (i6 - C0946.m55979("ۙ֫")) * (-105);
                        i3 = ((iM559710 ^ i5) * 18703) ^ 1798631325;
                        i4 = -927818207;
                    } else {
                        iM559710 = C0873.m55680("ۚܶ") ^ i5;
                        i3 = ((iM559710 ^ i6) * 13129) ^ (-110121897);
                        i4 = -1469003201;
                    }
                    int i115 = iM559710 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i115;
                    c10141 = c10140;
                    break;
                case -780255517:
                case 1059637174:
                    try {
                        RunnableC0938.m55928(textView8, str2);
                        RunnableC0938.m55928(textView2, C18794.m42823(x509Certificate2.getNotBefore().getTime()));
                        RunnableC0938.m55928(textView3, C18794.m42823(x509Certificate2.getNotAfter().getTime()));
                        try {
                            m23623(abstractActivityC5549, view, x509Certificate2);
                            int iM55682 = C0873.m55680("ۛ᩶") ^ i6;
                            i7 = ((iM55682 ^ i5) * 22753) ^ (-1005078881);
                            textView9 = textView7;
                            x509Certificate = x509Certificate2;
                            i8 = iM55682 ^ 1957327091;
                            x509Certificate2 = x509Certificate;
                        } catch (Exception unused2) {
                            int iM559712 = C0946.m55979("ܺ۠") ^ i6;
                            int i116 = ((iM559712 ^ i5) * 22579) ^ (-1382299247);
                            i8 = iM559712 ^ (-511743240);
                            c10141 = c10140;
                            textView9 = textView7;
                            i7 = i116;
                            textView8 = textView;
                        }
                    } catch (Exception unused3) {
                        int iM559713 = C0946.m55979("ܺ۠") ^ i6;
                        int i117 = ((iM559713 ^ i5) * 22579) ^ (-1382299247);
                        i8 = iM559713 ^ (-511743240);
                        c10141 = c10140;
                        textView9 = textView7;
                        i7 = i117;
                        textView8 = textView;
                        break;
                    }
                    break;
                case -652123612:
                case 426494389:
                    x509Certificate2 = x509Certificate2;
                    if (C0898.m55800() <= 0) {
                        iM559710 = (C0946.m55979("ۗ᩵") ^ i5) * 13;
                        i3 = ((iM559710 ^ i6) * (-31103)) ^ 1305259053;
                        i4 = -1506129323;
                    } else {
                        iM559710 = (C0946.m55979("۠ۡ") ^ i5) * 63;
                        i3 = ((iM559710 ^ i6) * 31393) ^ 901672109;
                        i4 = -28179962;
                    }
                    int i118 = iM559710 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i118;
                    c10141 = c10140;
                    break;
                case -649758432:
                case 1249946907:
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0946.m55979("ۜۡ") + i6) * 63;
                        i = ((iM55979 ^ i5) * 21509) ^ 879120952;
                        i2 = -1149979089;
                    } else {
                        iM55979 = (C0873.m55680("ۨۜ") ^ i5) * 71;
                        i = ((iM55979 ^ i6) * 22715) ^ (-615345296);
                        i2 = 1956996752;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -552709949:
                case 1985458041:
                    x509Certificate2 = x509Certificate2;
                    short s = f82081[242];
                    if ((s * 11632) - ((s * s) + 33825856) <= 0) {
                        iM559710 = C0873.m55680("ۜ᩵") ^ i6;
                        i3 = ((iM559710 ^ i5) * 13023) ^ (-951912128);
                        i4 = -1752825396;
                    } else {
                        iM559710 = (i5 - C0873.m55680("᩷᩹")) * 99;
                        i3 = ((iM559710 ^ i6) * (-11067)) ^ 1188924988;
                        i4 = 666298156;
                    }
                    int i119 = iM559710 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i119;
                    c10141 = c10140;
                    break;
                case -503500241:
                case 2038017099:
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0946.m55979("۟ܽ") ^ i5;
                        i = ((iM55979 ^ i6) * (-15085)) ^ 1912946963;
                        i2 = 1173282828;
                    } else {
                        iM55979 = C0873.m55680("۠᩵") ^ i5;
                        i = ((iM55979 ^ i6) * 24405) ^ (-1121525001);
                        i2 = 603904580;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -127106681:
                case 1343405757:
                    x509Certificate2 = x509Certificate2;
                    if (C1053.f81965 <= 0) {
                        iM559710 = C0946.m55979("ᩳ᩹") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                    } else {
                        iM559710 = (C0946.m55979("ۤᩳ") ^ i6) * 43;
                        i3 = ((iM559710 ^ i5) * (-593)) ^ (-725227863);
                        i4 = 1668595404;
                    }
                    int i1110 = iM559710 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i1110;
                    c10141 = c10140;
                    break;
                case -114732317:
                case 1666573042:
                    C1964.m56597();
                    C1404.m56468();
                    break;
                case -797008:
                case 1371223027:
                    C0989.m56095();
                    if (C0949.f81897 < 0) {
                        x509Certificate2 = x509Certificate2;
                        iM559710 = C0873.m55680("᩺ܳ") ^ i5;
                        i3 = ((iM559710 ^ i6) * (-13973)) ^ (-652231184);
                        i4 = 1223767721;
                        int i1111 = iM559710 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i1111;
                        c10141 = c10140;
                    } else {
                        iM55979 = (C0946.m55979("ۜۡ") + i6) * 63;
                        i = ((iM55979 ^ i5) * 21509) ^ 879120952;
                        i2 = -1149979089;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case 88468241:
                case 1747086535:
                    RunnableC0897.m55784();
                    iM55979 = C0946.m55979("۟ܽ") ^ i5;
                    i = ((iM55979 ^ i6) * (-15085)) ^ 1912946963;
                    i2 = 1173282828;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 172747236:
                case 1065124669:
                    if (zM55806) {
                        int iM55683 = (i5 - C0873.m55680("ۛᩴ")) * 87;
                        i7 = ((iM55683 ^ i6) * 8057) ^ 415022641;
                        i8 = iM55683 ^ (-1400976516);
                    } else {
                        str2 = str;
                        int iM559714 = (i6 - C0946.m55979("ۨ֨")) * (-123);
                        x509Certificate = x509Certificate2;
                        i8 = iM559714 ^ 965207755;
                        i7 = ((iM559714 ^ i5) * (-9437)) ^ 1179750637;
                        x509Certificate2 = x509Certificate;
                    }
                    break;
                case 342453630:
                case 1154315493:
                    str2 = strM44503 == null ? sigAlgOID : strM44503;
                    int iM559715 = (i6 - C0946.m55979("ۨ֨")) * (-123);
                    x509Certificate = x509Certificate2;
                    i8 = iM559715 ^ 965207755;
                    i7 = ((iM559715 ^ i5) * (-9437)) ^ 1179750637;
                    x509Certificate2 = x509Certificate;
                    break;
                case 641007598:
                case 1990661826:
                    x509Certificate2 = x509Certificate2;
                    if (C1012.f81938 >= 0) {
                        iM559710 = C0946.m55979("ᩳ᩹") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                    } else {
                        iM559710 = C0946.m55979("ۢ֨") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-22417)) ^ (-857527512);
                        i4 = -253207223;
                    }
                    int i1112 = iM559710 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i1112;
                    c10141 = c10140;
                    break;
                case 719172105:
                case 1372932133:
                    C0894.m55771(textView4, strM56189);
                    C0898.m55802(textView5, 8);
                    C1028.m56238(textView6, 8);
                    RunnableC0938.m55928(textView9, strM56189);
                    textView9.setEnabled(false);
                    int iM55684 = C0873.m55680("ۛ᩶") ^ i6;
                    i7 = ((iM55684 ^ i5) * 22753) ^ (-1005078881);
                    textView9 = textView7;
                    x509Certificate = x509Certificate2;
                    i8 = iM55684 ^ 1957327091;
                    x509Certificate2 = x509Certificate;
                    break;
                case 796326894:
                case 1796834175:
                    X509Certificate x509Certificate3 = x509Certificate2;
                    try {
                        X509Certificate x509Certificate4 = (X509Certificate) CertificateFactory.getInstance(C1404.m56462(f82081, 243, 5, i9)).generateCertificate(new ByteArrayInputStream(c10141.f28084));
                        try {
                            String sigAlgName = x509Certificate4.getSigAlgName();
                            try {
                                sigAlgOID = x509Certificate4.getSigAlgOID();
                                zM55806 = C0906.m55806(sigAlgName, sigAlgOID);
                                int iM559716 = (i5 - C0946.m55979("ᩴۧ")) * 91;
                                i8 = iM559716 ^ (-907423685);
                                i7 = ((iM559716 ^ i6) * 30601) ^ 1264877974;
                                x509Certificate2 = x509Certificate4;
                                str = sigAlgName;
                                c10141 = c10140;
                                textView8 = textView;
                                textView9 = textView7;
                            } catch (Exception unused4) {
                                x509Certificate2 = x509Certificate4;
                                str = sigAlgName;
                                int iM559717 = C0946.m55979("ܺ۠") ^ i6;
                                int i1113 = ((iM559717 ^ i5) * 22579) ^ (-1382299247);
                                i8 = iM559717 ^ (-511743240);
                                c10141 = c10140;
                                textView9 = textView7;
                                i7 = i1113;
                                textView8 = textView;
                            }
                        } catch (Exception unused5) {
                            x509Certificate2 = x509Certificate4;
                        }
                    } catch (Exception unused6) {
                        x509Certificate2 = x509Certificate3;
                    }
                    break;
                default:
                    c10141.f28085.m6094(c10141.f28084);
                    runnableC14852.run();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0661 A[PHI: r2 r6 r13 r14 r15
      0x0661: PHI (r2v59 l.ۙۧᩳ) = (r2v22 l.ۙۧᩳ), (r2v24 l.ۙۧᩳ), (r2v60 l.ۙۧᩳ) binds: [B:109:0x065f, B:101:0x0612, B:14:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0661: PHI (r6v46 android.widget.TextView) = (r6v19 android.widget.TextView), (r6v21 android.widget.TextView), (r6v47 android.widget.TextView) binds: [B:109:0x065f, B:101:0x0612, B:14:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0661: PHI (r13v37 android.view.View) = (r13v9 android.view.View), (r13v11 android.view.View), (r13v38 android.view.View) binds: [B:109:0x065f, B:101:0x0612, B:14:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0661: PHI (r14v39 l.۠۫ܽ) = (r14v9 l.۠۫ܽ), (r14v11 l.۠۫ܽ), (r14v40 l.۠۫ܽ) binds: [B:109:0x065f, B:101:0x0612, B:14:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0661: PHI (r15v46 int) = (r15v19 int), (r15v21 int), (r15v47 int) binds: [B:109:0x065f, B:101:0x0612, B:14:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x06a0 A[PHI: r2 r6 r13 r14 r15
      0x06a0: PHI (r2v50 l.ۙۧᩳ) = (r2v21 l.ۙۧᩳ), (r2v23 l.ۙۧᩳ), (r2v53 l.ۙۧᩳ) binds: [B:113:0x069e, B:105:0x0638, B:22:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x06a0: PHI (r6v42 android.widget.TextView) = (r6v18 android.widget.TextView), (r6v20 android.widget.TextView), (r6v43 android.widget.TextView) binds: [B:113:0x069e, B:105:0x0638, B:22:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x06a0: PHI (r13v33 android.view.View) = (r13v8 android.view.View), (r13v10 android.view.View), (r13v34 android.view.View) binds: [B:113:0x069e, B:105:0x0638, B:22:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x06a0: PHI (r14v35 l.۠۫ܽ) = (r14v8 l.۠۫ܽ), (r14v10 l.۠۫ܽ), (r14v36 l.۠۫ܽ) binds: [B:113:0x069e, B:105:0x0638, B:22:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x06a0: PHI (r15v42 int) = (r15v18 int), (r15v20 int), (r15v43 int) binds: [B:113:0x069e, B:105:0x0638, B:22:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x071a A[PHI: r2 r6 r13 r14 r15
      0x071a: PHI (r2v54 l.ۙۧᩳ) = (r2v19 l.ۙۧᩳ), (r2v25 l.ۙۧᩳ), (r2v58 l.ۙۧᩳ) binds: [B:121:0x0718, B:97:0x05e9, B:18:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x071a: PHI (r6v44 android.widget.TextView) = (r6v16 android.widget.TextView), (r6v22 android.widget.TextView), (r6v45 android.widget.TextView) binds: [B:121:0x0718, B:97:0x05e9, B:18:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x071a: PHI (r13v35 android.view.View) = (r13v6 android.view.View), (r13v12 android.view.View), (r13v36 android.view.View) binds: [B:121:0x0718, B:97:0x05e9, B:18:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x071a: PHI (r14v37 l.۠۫ܽ) = (r14v6 l.۠۫ܽ), (r14v12 l.۠۫ܽ), (r14v38 l.۠۫ܽ) binds: [B:121:0x0718, B:97:0x05e9, B:18:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x071a: PHI (r15v44 int) = (r15v16 int), (r15v22 int), (r15v45 int) binds: [B:121:0x0718, B:97:0x05e9, B:18:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0085, code lost:
    
        if (p067l.C0992.f81922 < 0) goto L14;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m23629(final C10140 c10140, final DialogInterfaceC2564 dialogInterfaceC2564, View view, final TextView textView, final TextView textView2, final TextView textView3, final TextView textView4, final TextView textView5, final TextView textView6, final TextView textView7, final TextView textView8, final TextView textView9, final TextView textView10, final TextView textView11, final RunnableC12823 runnableC12823, TextView textView12, final TextView textView13, C0990 c0990, C0990 c0991, C6751 c6751) {
        int i;
        ExecutorService executorService;
        final C6751 c6752;
        int iM55680;
        int i2;
        ArrayList arrayList;
        C6751 c6753;
        int iM55979;
        int i3;
        int i4;
        int i5;
        C6751 c6754;
        int iM55681;
        int i6;
        int i7;
        int iM559710;
        int i8;
        C10140 c10141 = c10140;
        view = view;
        textView13 = textView13;
        final C6751 c6755 = c6751;
        View.OnClickListener onClickListener = null;
        int i9 = 0;
        Iterator itM56090 = null;
        int i10 = 460248769;
        int i11 = C1003.f81929;
        int i12 = C1025.f81947;
        int iM559711 = (C0946.m55979("֫ۘ") ^ i11) * (-91);
        View viewM55755 = null;
        ArrayList arrayList2 = null;
        int i13 = iM559711 ^ (-619999778);
        int i14 = ((iM559711 ^ i12) * 12299) ^ 108463723;
        int i15 = 0;
        ExecutorService executorService2 = null;
        while (true) {
            i10 = i13 ^ (i14 & (((i10 ^ i12) * 30053) >> 31));
            switch (i10) {
                case -2002372914:
                case -1390364063:
                    i = i15;
                    executorService = executorService2;
                    c6752 = c6755;
                    if (c6751.m15422() != null) {
                        iM55680 = (C0873.m55680("ܰܰ") + i11) * 71;
                        i14 = ((iM55680 ^ i12) * (-18419)) ^ (-69491305);
                        i2 = 864023288;
                    } else {
                        iM55680 = (i12 - C0946.m55979("۫ۧ")) * (-59);
                        i14 = ((iM55680 ^ i11) * (-15147)) ^ (-21889425);
                        i2 = 1585293301;
                    }
                    i13 = iM55680 ^ i2;
                    c6755 = c6752;
                    i15 = i;
                    executorService2 = executorService;
                    c10141 = c10140;
                    break;
                case -1952774883:
                case 663318966:
                    i5 = i15;
                    c6754 = c6755;
                    textView13 = textView13;
                    view = view;
                    C1028.m56238(C1404.m56465(view, C0873.m55680(C0917.m55852(f82081, 257, 3, i5)) ^ 2128927975), 0);
                    viewM55755 = C0892.m55755(view, C0873.m55680(ServiceConnectionC1013.m56161(f82081, 260, 3, i5)) ^ 2119526028);
                    arrayList2 = new ArrayList();
                    if (c6751.m15425() != null) {
                        iM55681 = C0873.m55680("ۛ᩺") ^ i12;
                        i6 = ((iM55681 ^ i11) * (-8529)) ^ (-326330869);
                        i7 = -1407623287;
                    } else {
                        iM55681 = C0946.m55979("ۜ۟") ^ i11;
                        i6 = ((iM55681 ^ i12) * 9545) ^ (-1871230828);
                        i7 = -129227806;
                    }
                    c6755 = c6754;
                    i13 = iM55681 ^ i7;
                    i14 = i6;
                    i15 = i5;
                    c10141 = c10140;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1808903707:
                case 1403887321:
                    c6753 = c6755;
                    textView13 = textView13;
                    view = view;
                    c10141 = c10141;
                    i15 = i15;
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0873.m55680("᩻֡") ^ i12) * 33;
                        i3 = ((iM55979 ^ i11) * (-19855)) ^ 127802;
                        i4 = -2131500139;
                    } else {
                        iM55979 = C0873.m55680("֫֡") ^ i12;
                        i3 = ((iM55979 ^ i11) * (-14011)) ^ (-720945776);
                        i4 = 909640589;
                    }
                    i13 = iM55979 ^ i4;
                    c6755 = c6753;
                    i14 = i3;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1757781353:
                case -1507292249:
                    c10141 = c10140;
                    c10141.f28084 = c6751.m15417();
                    int iM55682 = C0873.m55680("ۖ֫") ^ i11;
                    i14 = ((iM55682 ^ i12) * (-6539)) ^ (-863136176);
                    c6755 = c6755;
                    i13 = iM55682 ^ 1609056781;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1757695007:
                case -1032175274:
                    c6753 = c6755;
                    textView13 = textView13;
                    view = view;
                    c10141 = c10141;
                    i15 = i15;
                    if (C0866.f81837 >= 0) {
                        iM55979 = (i11 - C0873.m55680("ܰܺ")) * 119;
                        i3 = ((iM55979 ^ i12) * (-26387)) ^ (-234615178);
                        i4 = 36042365;
                    } else {
                        iM55979 = C0946.m55979("ܺܺ") ^ i12;
                        i3 = ((iM55979 ^ i11) * 29513) ^ (-1067011291);
                        i4 = -320853520;
                    }
                    i13 = iM55979 ^ i4;
                    c6755 = c6753;
                    i14 = i3;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1744331018:
                case 1486778523:
                    i5 = i15;
                    c6754 = c6755;
                    TextView textView14 = (TextView) C1404.m56465(viewM55755, C0946.m55979(C0937.m55921(f82081, 266, 3, i5)) ^ 2130085282);
                    C0890.m55731(textView14, new C19528(0, c6754));
                    C0937.m55917(arrayList2, textView14);
                    view = view;
                    textView13 = textView13;
                    iM55681 = C0946.m55979("ۜ۟") ^ i11;
                    i6 = ((iM55681 ^ i12) * 9545) ^ (-1871230828);
                    i7 = -129227806;
                    c6755 = c6754;
                    i13 = iM55681 ^ i7;
                    i14 = i6;
                    i15 = i5;
                    c10141 = c10140;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1730775193:
                case 592289050:
                    TextView textView15 = (TextView) C0955.m56035(itM56090);
                    C1028.m56238(textView15, i9);
                    C0947.m55996(textView15, onClickListener);
                    arrayList = arrayList2;
                    int iM559712 = (C0946.m55979("۬ܰ") ^ i12) * (-45);
                    i14 = ((iM559712 ^ i11) * 15235) ^ (-157982622);
                    i13 = iM559712 ^ 1161681581;
                    c6755 = c6751;
                    i15 = i15;
                    executorService2 = executorService2;
                    arrayList2 = arrayList;
                    viewM55755 = viewM55755;
                    c10141 = c10140;
                    break;
                case -1714879011:
                case 103124865:
                    i = i15;
                    executorService = executorService2;
                    c6752 = c6755;
                    if (c6751.m15427() != null) {
                        iM55680 = C0873.m55680("ۤ᩷") ^ i11;
                        i14 = ((iM55680 ^ i12) * (-21251)) ^ (-1578121421);
                        i2 = 2065853102;
                    } else {
                        iM55680 = (C0946.m55979("᩺ܿ") ^ i12) * (-71);
                        i14 = ((iM55680 ^ i11) * (-30063)) ^ 976352367;
                        i2 = -1480875418;
                    }
                    i13 = iM55680 ^ i2;
                    c6755 = c6752;
                    i15 = i;
                    executorService2 = executorService;
                    c10141 = c10140;
                    break;
                case -1676300077:
                case 692069359:
                    C0906.m55809();
                    break;
                case -1644556544:
                case 1344067839:
                    i15 = 44195;
                    int iM559713 = C0946.m55979("ۚۤ") ^ i11;
                    int i16 = ((iM559713 ^ i12) * (-25653)) ^ 1373979380;
                    i13 = iM559713 ^ (-1961358339);
                    c6755 = c6755;
                    i14 = i16;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1507783928:
                case -622487396:
                    C1012.m56134();
                    if (C1053.f81965 > 0) {
                        c6753 = c6755;
                        textView13 = textView13;
                        view = view;
                        c10141 = c10141;
                        i15 = i15;
                        iM55979 = C0873.m55680("ᩳ᩵") ^ i12;
                        i3 = ((iM55979 ^ i11) * 8583) ^ (-1377553683);
                        i4 = 1754349404;
                        i13 = iM55979 ^ i4;
                        c6755 = c6753;
                        i14 = i3;
                        i15 = i15;
                        c10141 = c10141;
                        view = view;
                        textView13 = textView13;
                    }
                    c6753 = c6755;
                    textView13 = textView13;
                    view = view;
                    c10141 = c10141;
                    i15 = i15;
                    iM55979 = (i11 - C0873.m55680("ܰܺ")) * 119;
                    i3 = ((iM55979 ^ i12) * (-26387)) ^ (-234615178);
                    i4 = 36042365;
                    i13 = iM55979 ^ i4;
                    c6755 = c6753;
                    i14 = i3;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1453225761:
                case -741898994:
                    c6753 = c6755;
                    textView13 = textView13;
                    view = view;
                    c10141 = c10141;
                    i15 = i15;
                    if (c6751.m15426()) {
                        iM55979 = C0873.m55680("۫ۙ") ^ i11;
                        i3 = ((iM55979 ^ i12) * 17325) ^ (-236709354);
                        i4 = -741201105;
                    } else {
                        iM55979 = C0946.m55979("۟ۚ") ^ i12;
                        i3 = ((iM55979 ^ i11) * 30269) ^ (-1563643290);
                        i4 = -762529961;
                    }
                    i13 = iM55979 ^ i4;
                    c6755 = c6753;
                    i14 = i3;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1305316382:
                case 1158231942:
                    c6753 = c6755;
                    textView13 = textView13;
                    view = view;
                    c10141 = c10141;
                    i15 = i15;
                    short s = f82081[253];
                    int i17 = (s * s) + 22231225;
                    int i18 = s + 4715;
                    if ((i17 + i17) - (i18 * i18) < 0) {
                        iM55979 = C0873.m55680("ۗۧ") ^ i12;
                        i3 = ((iM55979 ^ i11) * 27363) ^ 646092096;
                        i4 = -1533295646;
                    } else {
                        iM55979 = C0946.m55979("ܽۤ") ^ i12;
                        i3 = ((iM55979 ^ i11) * 4507) ^ (-1397406701);
                        i4 = 1118278991;
                    }
                    i13 = iM55979 ^ i4;
                    c6755 = c6753;
                    i14 = i3;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1239370779:
                case 135550592:
                    i15 = 63973;
                    int iM559714 = C0946.m55979("ۚۤ") ^ i11;
                    int i19 = ((iM559714 ^ i12) * (-25653)) ^ 1373979380;
                    i13 = iM559714 ^ (-1961358339);
                    c6755 = c6755;
                    i14 = i19;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1130841056:
                case 1558397958:
                    TextView textView16 = (TextView) C0892.m55755(viewM55755, C0873.m55680(C1012.m56144(f82081, C0791b.f3325g, 3, i15)) ^ 2118231615);
                    C1053.m56331(textView16, new InterfaceC8205() { // from class: l.۫۬ܽ
                        @Override // p067l.InterfaceC8205
                        public final Object get() {
                            return c6755.m15422();
                        }
                    });
                    C0937.m55917(arrayList2, textView16);
                    i = i15;
                    executorService = executorService2;
                    c6752 = c6755;
                    iM55680 = (i12 - C0946.m55979("۫ۧ")) * (-59);
                    i14 = ((iM55680 ^ i11) * (-15147)) ^ (-21889425);
                    i2 = 1585293301;
                    i13 = iM55680 ^ i2;
                    c6755 = c6752;
                    i15 = i;
                    executorService2 = executorService;
                    c10141 = c10140;
                    break;
                case -1027639498:
                case 1096349049:
                    c6753 = c6755;
                    textView13 = textView13;
                    view = view;
                    c10141 = c10141;
                    i15 = i15;
                    if (C0967.m56074()) {
                        iM55979 = (C0946.m55979("ۡ᩸") ^ i12) * 7;
                        i3 = ((iM55979 ^ i11) * 22123) ^ (-1715018422);
                        i4 = 1763900511;
                    } else {
                        iM55979 = C0873.m55680("᩷ᩴ") ^ i11;
                        i3 = ((iM55979 ^ i12) * 25225) ^ 1067980159;
                        i4 = 1259891746;
                    }
                    i13 = iM55979 ^ i4;
                    c6755 = c6753;
                    i14 = i3;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1027378817:
                case 1963524558:
                    C0949.m56012();
                    if (C0930.m55885() > 0) {
                        c6753 = c6755;
                        textView13 = textView13;
                        view = view;
                        c10141 = c10141;
                        i15 = i15;
                        iM55979 = (C0946.m55979("ۡ᩸") ^ i12) * 7;
                        i3 = ((iM55979 ^ i11) * 22123) ^ (-1715018422);
                        i4 = 1763900511;
                        i13 = iM55979 ^ i4;
                        c6755 = c6753;
                        i14 = i3;
                        i15 = i15;
                        c10141 = c10141;
                        view = view;
                        textView13 = textView13;
                    } else {
                        iM559710 = C0946.m55979("ܿ᩹") ^ i12;
                        i14 = ((iM559710 ^ i11) * (-14803)) ^ 226415185;
                        i8 = -503651769;
                        i13 = iM559710 ^ i8;
                        i10 = i10;
                    }
                    break;
                case -1001172198:
                case 1608236520:
                    final C6751 c6756 = c6755;
                    C0873.m55676(executorService2, new Runnable() { // from class: l.ۛ۬ܽ
                        {
                            int i20 = -1122510538;
                            int i21 = ViewOnClickListenerC0939.f81888;
                            int i22 = C1964.f83032;
                            int iM55683 = C0873.m55680("᩻᩻") ^ i22;
                            int i23 = ((iM55683 ^ i21) * (-10863)) ^ (-923106433);
                            int i24 = -300097177;
                            while (true) {
                                i20 = ((((i20 ^ i21) * (-7951)) >> 31) & i23) ^ (iM55683 ^ i24);
                                switch (i20) {
                                    case -2064247752:
                                    case 1451344975:
                                        if (C0845.m55584() <= 0) {
                                            iM55683 = C0873.m55680("ۤܽ") ^ i21;
                                            i23 = ((iM55683 ^ i22) * (-16091)) ^ (-813298623);
                                            i24 = -1345488882;
                                        } else {
                                            iM55683 = (C0946.m55979("ۜۘ") ^ i22) * (-121);
                                            i23 = ((iM55683 ^ i21) * (-321)) ^ (-1422098144);
                                            i24 = -1538487188;
                                        }
                                        break;
                                    case -1832499918:
                                    case -1180104052:
                                        C0912.m55833();
                                        C0906.m55809();
                                        throw new RuntimeException();
                                    case -1548615412:
                                    case 13483074:
                                        if (C0894.f81854 >= 0) {
                                            iM55683 = C0873.m55680("ۤܽ") ^ i21;
                                            i23 = ((iM55683 ^ i22) * (-16091)) ^ (-813298623);
                                            i24 = -1345488882;
                                        } else {
                                            iM55683 = (C0873.m55680("ۛ֨") ^ i21) * (-125);
                                            i23 = ((iM55683 ^ i22) * (-9439)) ^ 958914982;
                                            i24 = 1536819898;
                                        }
                                        break;
                                    case -1322160140:
                                    case -657232353:
                                        if (C1929.f83011 != 0) {
                                            iM55683 = (i22 - C0873.m55680("ۚۚ")) * 63;
                                            i23 = ((iM55683 ^ i21) * (-2493)) ^ 1543814720;
                                            i24 = -798033873;
                                        } else {
                                            iM55683 = C0946.m55979("ܿܳ") ^ i22;
                                            i23 = ((iM55683 ^ i21) * (-29349)) ^ (-1762239995);
                                            i24 = -1918401262;
                                        }
                                        break;
                                    case -1203477467:
                                    case 1324071200:
                                        if (C1017.f81942 >= 0) {
                                            iM55683 = (i22 - C0873.m55680("ۚۚ")) * 63;
                                            i23 = ((iM55683 ^ i21) * (-2493)) ^ 1543814720;
                                            i24 = -798033873;
                                        } else {
                                            iM55683 = (C0946.m55979("ܶܽ") ^ i21) * (-127);
                                            i23 = ((iM55683 ^ i22) * 28789) ^ 1208078633;
                                            i24 = -1285603980;
                                        }
                                        break;
                                    case -1183574614:
                                    case -720555573:
                                        if (!C0947.f81895) {
                                            iM55683 = (i21 - C0946.m55979("ۤۘ")) * 123;
                                            i23 = ((iM55683 ^ i22) * 28267) ^ 315564002;
                                            i24 = 95819168;
                                        } else {
                                            iM55683 = (i22 - C0873.m55680("ۚۚ")) * 63;
                                            i23 = ((iM55683 ^ i21) * (-2493)) ^ 1543814720;
                                            i24 = -798033873;
                                        }
                                        break;
                                    case -1057163626:
                                    case -911757275:
                                        if (C1017.f81942 >= 0) {
                                            iM55683 = C0873.m55680("ۗ᩺") ^ i22;
                                            i23 = ((iM55683 ^ i21) * 2335) ^ (-192845336);
                                            i24 = -521217621;
                                        } else {
                                            iM55683 = C0946.m55979("ᩳ᩶") ^ i21;
                                            i23 = ((iM55683 ^ i22) * 31205) ^ 763240570;
                                            i24 = 185987813;
                                        }
                                        break;
                                    case -871742795:
                                    case 1761865489:
                                        C1053.m56327();
                                        if (C0917.f81868) {
                                            iM55683 = (C0873.m55680("۫ۡ") ^ i21) * (-81);
                                            i23 = ((iM55683 ^ i22) * (-32331)) ^ 2142538622;
                                            i24 = -1398061796;
                                        } else {
                                            iM55683 = (i22 - C0873.m55680("ۚۚ")) * 63;
                                            i23 = ((iM55683 ^ i21) * (-2493)) ^ 1543814720;
                                            i24 = -798033873;
                                        }
                                        break;
                                    case -865215149:
                                    case 976784817:
                                        C0949.m56012();
                                        C1404.m56468();
                                        iM55683 = (i22 - C0873.m55680("ۚۚ")) * 63;
                                        i23 = ((iM55683 ^ i21) * (-2493)) ^ 1543814720;
                                        i24 = -798033873;
                                        break;
                                    case -657650528:
                                    case 1363069321:
                                        if (C1025.f81947 >= 0) {
                                            iM55683 = C0873.m55680("ۤܽ") ^ i21;
                                            i23 = ((iM55683 ^ i22) * (-16091)) ^ (-813298623);
                                            i24 = -1345488882;
                                        } else {
                                            iM55683 = (C0946.m55979("ۧۘ") ^ i22) * 19;
                                            i23 = ((iM55683 ^ i21) * (-5373)) ^ 926111603;
                                            i24 = -352510219;
                                        }
                                        break;
                                    case -604198684:
                                    case 1678396783:
                                        if (C0861.f81831) {
                                            iM55683 = C0873.m55680("ᩴ۫") ^ i22;
                                            i23 = ((iM55683 ^ i21) * 10803) ^ 865251767;
                                            i24 = 892174422;
                                        } else {
                                            iM55683 = C0873.m55680("ۗ᩺") ^ i22;
                                            i23 = ((iM55683 ^ i21) * 2335) ^ (-192845336);
                                            i24 = -521217621;
                                        }
                                        break;
                                    case -237045884:
                                    case 1890628098:
                                        if (C0912.f81867 <= 0) {
                                            iM55683 = (i21 - C0946.m55979("ۤۘ")) * 123;
                                            i23 = ((iM55683 ^ i22) * 28267) ^ 315564002;
                                            i24 = 95819168;
                                        } else {
                                            iM55683 = (C0946.m55979("ۚۛ") ^ i21) * 75;
                                            i23 = ((iM55683 ^ i22) * 31539) ^ (-1547217676);
                                            i24 = 579879850;
                                        }
                                        break;
                                    case -173733824:
                                    case -68288288:
                                        if (!C0892.f81851) {
                                            iM55683 = C0873.m55680("ۗ᩺") ^ i22;
                                            i23 = ((iM55683 ^ i21) * 2335) ^ (-192845336);
                                            i24 = -521217621;
                                        } else {
                                            iM55683 = (i21 - C0946.m55979("ۤۘ")) * 123;
                                            i23 = ((iM55683 ^ i22) * 28267) ^ 315564002;
                                            i24 = 95819168;
                                        }
                                        break;
                                    case 353644355:
                                    case 1195070387:
                                        return;
                                    case 587248565:
                                    case 1764837383:
                                        if (C1929.m56553()) {
                                            iM55683 = (i21 - C0946.m55979("ۤۘ")) * 123;
                                            i23 = ((iM55683 ^ i22) * 28267) ^ 315564002;
                                            i24 = 95819168;
                                        } else {
                                            iM55683 = (C0873.m55680("ܽ᩸") + i22) * 115;
                                            i23 = ((iM55683 ^ i21) * 18779) ^ 880662796;
                                            i24 = -53774209;
                                        }
                                        break;
                                    default:
                                        if (C1003.m56123() != 0) {
                                            iM55683 = C0873.m55680("ۗ᩺") ^ i22;
                                            i23 = ((iM55683 ^ i21) * 2335) ^ (-192845336);
                                            i24 = -521217621;
                                        } else {
                                            iM55683 = (C0946.m55979("ᩴۨ") + i21) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i23 = ((iM55683 ^ i22) * 8973) ^ 1099971689;
                                            i24 = -758169302;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C6751 c6757 = null;
                            final DialogInterfaceC2564 dialogInterfaceC2565 = null;
                            final TextView textView17 = null;
                            final Throwable th = null;
                            C23515 c23515M15416 = null;
                            int i20 = -1921300858;
                            int i21 = C0906.f81862;
                            int i22 = C0873.f81841;
                            int iM559715 = C0946.m55979("᩺ܳ") ^ i22;
                            int i23 = ((iM559715 ^ i21) * (-19677)) ^ 1422264791;
                            int i24 = -1775407248;
                            while (true) {
                                i20 = ((((i20 ^ i21) * 27089) >> 31) & i23) ^ (iM559715 ^ i24);
                                switch (i20) {
                                    case -2050737006:
                                    case -1816841610:
                                        if (c23515M15416 != null) {
                                            iM559715 = C0946.m55979("ۧۡ") ^ i21;
                                            i23 = ((iM559715 ^ i22) * 21647) ^ (-1602754054);
                                            i24 = -856777082;
                                        } else {
                                            iM559715 = (i21 - C0873.m55680("ۧᩴ")) * 11;
                                            i23 = ((iM559715 ^ i22) * (-27885)) ^ (-555376642);
                                            i24 = 209145724;
                                        }
                                        break;
                                    case -2008280148:
                                    case -1994248106:
                                        break;
                                    case -1984162065:
                                    case 663692265:
                                        C1229.m56410();
                                        C1025.m56230();
                                        iM559715 = (C0873.m55680("֡᩹") ^ i22) * (-117);
                                        i23 = ((iM559715 ^ i21) * 13223) ^ 1970256639;
                                        i24 = 640663137;
                                        break;
                                    case -1872818667:
                                    case 1295550029:
                                        if (C0927.m55873() > 0) {
                                            iM559715 = C0946.m55979("᩸᩵") ^ i21;
                                            i23 = ((iM559715 ^ i22) * 32735) ^ 1889190774;
                                            i24 = 649588281;
                                        } else {
                                            iM559715 = (C0873.m55680("֡᩹") ^ i22) * (-117);
                                            i23 = ((iM559715 ^ i21) * 13223) ^ 1970256639;
                                            i24 = 640663137;
                                        }
                                        break;
                                    case -1811102399:
                                    case 640864779:
                                        if (C0917.f81868) {
                                            iM559715 = C0873.m55680("ܳᩴ") ^ i21;
                                            i23 = ((iM559715 ^ i22) * (-2203)) ^ (-911734593);
                                            i24 = -1094594321;
                                        } else {
                                            iM559715 = C0946.m55979("ۤ᩸") ^ i21;
                                            i23 = ((iM559715 ^ i22) * (-17887)) ^ (-526299978);
                                            i24 = -1510564796;
                                        }
                                        break;
                                    case -1420662709:
                                    case 42729747:
                                        RunnableC0871.m55672();
                                        break;
                                    case -1406354759:
                                    case 772285788:
                                        C0854.m55606(new Runnable() { // from class: l.ܰ۬ܽ
                                            {
                                                int i25 = 110513279;
                                                int i26 = AbstractC0942.f81890;
                                                int i27 = ViewOnClickListenerC0939.f81888;
                                                int iM559716 = C0946.m55979("ۖۛ") ^ i26;
                                                int i28 = ((iM559716 ^ i27) * (-10929)) ^ (-683383587);
                                                int i29 = 1329740638;
                                                while (true) {
                                                    i25 = ((((i25 ^ i27) * 6929) >> 31) & i28) ^ (iM559716 ^ i29);
                                                    switch (i25) {
                                                        case -2018745666:
                                                        case -564389784:
                                                            if (C0845.f81821 >= 0) {
                                                                iM559716 = (C0946.m55979("᩻᩻") + i26) * (-107);
                                                                i28 = ((iM559716 ^ i27) * 21433) ^ 1987707697;
                                                                i29 = -740070585;
                                                            } else {
                                                                iM559716 = C0873.m55680("֫֫") ^ i27;
                                                                i28 = ((iM559716 ^ i26) * 9677) ^ 2104642683;
                                                                i29 = -986880296;
                                                            }
                                                            break;
                                                        case -1911642661:
                                                        case -1404422345:
                                                            if (C1025.f81947 >= 0) {
                                                                iM559716 = (C0873.m55680("ܰ֡") + i26) * 119;
                                                                i28 = ((iM559716 ^ i27) * 32075) ^ (-2147300941);
                                                                i29 = -775753059;
                                                            } else {
                                                                iM559716 = C0946.m55979("ܺ᩷") ^ i26;
                                                                i28 = ((iM559716 ^ i27) * (-28361)) ^ 1512177592;
                                                                i29 = -97642624;
                                                            }
                                                            break;
                                                        case -1903820053:
                                                        case -1737485071:
                                                            C1048.m56305();
                                                            if (C1028.f81950 > 0) {
                                                                iM559716 = C0873.m55680("᩶ۗ") ^ i27;
                                                                i28 = ((iM559716 ^ i26) * 31789) ^ 547507482;
                                                                i29 = 337763122;
                                                            } else {
                                                                iM559716 = (C0946.m55979("᩻᩻") + i26) * (-107);
                                                                i28 = ((iM559716 ^ i27) * 21433) ^ 1987707697;
                                                                i29 = -740070585;
                                                            }
                                                            break;
                                                        case -1786029024:
                                                        case 1595769910:
                                                            if (C1044.f81959 >= 0) {
                                                                iM559716 = (C0873.m55680("ᩴ۫") + i26) * 31;
                                                                i28 = ((iM559716 ^ i27) * 28217) ^ 2086820508;
                                                                i29 = -424175618;
                                                            } else {
                                                                iM559716 = C0946.m55979("ܺ᩻") ^ i26;
                                                                i28 = ((iM559716 ^ i27) * 30509) ^ 1396534248;
                                                                i29 = -25858174;
                                                            }
                                                            break;
                                                        case -1715727560:
                                                        case 1070115341:
                                                            if (!C0947.f81895) {
                                                                iM559716 = (C0873.m55680("ܰ֡") + i26) * 119;
                                                                i28 = ((iM559716 ^ i27) * 32075) ^ (-2147300941);
                                                                i29 = -775753059;
                                                            } else {
                                                                iM559716 = C0946.m55979("ۘۗ") ^ i27;
                                                                i28 = ((iM559716 ^ i26) * 27139) ^ (-38296841);
                                                                i29 = 1201411961;
                                                            }
                                                            break;
                                                        case -1461773696:
                                                        case 2040207417:
                                                            if (C0877.f81843 >= 0) {
                                                                iM559716 = (C0873.m55680("ܰ֡") + i26) * 119;
                                                                i28 = ((iM559716 ^ i27) * 32075) ^ (-2147300941);
                                                                i29 = -775753059;
                                                            } else {
                                                                iM559716 = (i26 - C0873.m55680("۫ۢ")) * 35;
                                                                i28 = ((iM559716 ^ i27) * 663) ^ 251836099;
                                                                i29 = 124732524;
                                                            }
                                                            break;
                                                        case -1400610178:
                                                        case 1056995049:
                                                            if (C1053.m56327() >= 0) {
                                                                iM559716 = (C0873.m55680("ܰ֡") + i26) * 119;
                                                                i28 = ((iM559716 ^ i27) * 32075) ^ (-2147300941);
                                                                i29 = -775753059;
                                                            } else {
                                                                iM559716 = C0873.m55680("۠۟") ^ i27;
                                                                i28 = ((iM559716 ^ i26) * (-6235)) ^ 1886656652;
                                                                i29 = 139959681;
                                                            }
                                                            break;
                                                        case -1359248159:
                                                        case 1558964169:
                                                            if (C0890.f81849 != 0) {
                                                                iM559716 = (C0946.m55979("᩻᩻") + i26) * (-107);
                                                                i28 = ((iM559716 ^ i27) * 21433) ^ 1987707697;
                                                                i29 = -740070585;
                                                            } else {
                                                                iM559716 = C0946.m55979("ۜ۠") ^ i26;
                                                                i28 = ((iM559716 ^ i27) * 24557) ^ (-1915283825);
                                                                i29 = -1670956858;
                                                            }
                                                            break;
                                                        case -892506943:
                                                        case -825272770:
                                                            if (C0882.m55710() != 0) {
                                                                iM559716 = (C0873.m55680("ᩴ۫") + i26) * 31;
                                                                i28 = ((iM559716 ^ i27) * 28217) ^ 2086820508;
                                                                i29 = -424175618;
                                                            } else {
                                                                iM559716 = (C0946.m55979("᩸۠") + i27) * (-109);
                                                                i28 = ((iM559716 ^ i26) * (-6693)) ^ 504330305;
                                                                i29 = 70291424;
                                                            }
                                                            break;
                                                        case -879875417:
                                                        case 331311537:
                                                            C1229.m56410();
                                                            C0989.m56095();
                                                            iM559716 = (C0946.m55979("᩻᩻") + i26) * (-107);
                                                            i28 = ((iM559716 ^ i27) * 21433) ^ 1987707697;
                                                            i29 = -740070585;
                                                            break;
                                                        case -373168426:
                                                        case 792872621:
                                                            return;
                                                        case -279736191:
                                                        case 380681304:
                                                            C0877.m55696();
                                                            C0927.m55873();
                                                            throw new RuntimeException();
                                                        case 108033938:
                                                        case 1551163977:
                                                            if (C1003.f81929 <= 0) {
                                                                iM559716 = C0873.m55680("᩶ۗ") ^ i27;
                                                                i28 = ((iM559716 ^ i26) * 31789) ^ 547507482;
                                                                i29 = 337763122;
                                                            } else {
                                                                iM559716 = C0873.m55680("ܿ᩺") ^ i26;
                                                                i28 = ((iM559716 ^ i27) * 23599) ^ 207378185;
                                                                i29 = -128847751;
                                                            }
                                                            break;
                                                        case 434662936:
                                                        case 1404013594:
                                                            if (RunnableC0938.f81886 >= 0) {
                                                                iM559716 = (C0946.m55979("᩻᩻") + i26) * (-107);
                                                                i28 = ((iM559716 ^ i27) * 21433) ^ 1987707697;
                                                                i29 = -740070585;
                                                            } else {
                                                                iM559716 = (C0946.m55979("᩷۬") + i27) * 5;
                                                                i28 = ((iM559716 ^ i26) * 10353) ^ (-1417118247);
                                                                i29 = 826868124;
                                                            }
                                                            break;
                                                        case 854466319:
                                                        case 1073824804:
                                                            C0873.m55678();
                                                            if (!C0917.f81868) {
                                                                iM559716 = C0946.m55979("ۘۗ") ^ i27;
                                                                i28 = ((iM559716 ^ i26) * 27139) ^ (-38296841);
                                                                i29 = 1201411961;
                                                            } else {
                                                                iM559716 = (C0946.m55979("᩻᩻") + i26) * (-107);
                                                                i28 = ((iM559716 ^ i27) * 21433) ^ 1987707697;
                                                                i29 = -740070585;
                                                            }
                                                            break;
                                                        default:
                                                            if (C1124.f82007 >= 0) {
                                                                iM559716 = (C0873.m55680("ܰ֡") + i26) * 119;
                                                                i28 = ((iM559716 ^ i27) * 32075) ^ (-2147300941);
                                                                i29 = -775753059;
                                                            } else {
                                                                iM559716 = C0873.m55680("֫ۢ") ^ i27;
                                                                i28 = ((iM559716 ^ i26) * 14119) ^ (-771889223);
                                                                i29 = -634538117;
                                                            }
                                                            break;
                                                    }
                                                }
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Throwable th2 = null;
                                                String strM55639 = null;
                                                TextView textView18 = null;
                                                int i25 = 347159303;
                                                int i26 = C1003.f81929;
                                                int i27 = ViewOnClickListenerC0939.f81888;
                                                int iM55683 = C0873.m55680("ۡۤ") ^ i26;
                                                int i28 = ((iM55683 ^ i27) * 26793) ^ 235889243;
                                                int i29 = 1648715609;
                                                while (true) {
                                                    i25 = ((((i25 ^ i27) * 21211) >> 31) & i28) ^ (iM55683 ^ i29);
                                                    switch (i25) {
                                                        case -2056858243:
                                                        case -852799051:
                                                            if (RunnableC0897.f81856) {
                                                                iM55683 = (C0873.m55680("ܺ᩹") + i26) * 127;
                                                                i28 = ((iM55683 ^ i27) * 18433) ^ 801613085;
                                                                i29 = -396972459;
                                                            } else {
                                                                iM55683 = (i27 - C0873.m55680("֡᩶")) * (-119);
                                                                i28 = ((iM55683 ^ i26) * (-4113)) ^ (-672973584);
                                                                i29 = 366162594;
                                                            }
                                                            break;
                                                        case -1885834628:
                                                        case -1035941626:
                                                            if (C0845.f81821 < 0) {
                                                                iM55683 = (C0946.m55979("ܶۨ") + i26) * 85;
                                                                i28 = ((iM55683 ^ i27) * (-5247)) ^ (-1138232643);
                                                                i29 = -390074841;
                                                            } else {
                                                                iM55683 = (i26 - C0873.m55680("ܶܽ")) * (-49);
                                                                i28 = ((iM55683 ^ i27) * 23731) ^ 791760224;
                                                                i29 = 1245182738;
                                                            }
                                                            break;
                                                        case -1848162856:
                                                        case -505073107:
                                                            if (C0912.f81867 <= 0) {
                                                                iM55683 = (i27 - C0873.m55680("֡᩶")) * (-119);
                                                                i28 = ((iM55683 ^ i26) * (-4113)) ^ (-672973584);
                                                                i29 = 366162594;
                                                            } else {
                                                                iM55683 = (i27 - C0873.m55680("۠᩷")) * (-101);
                                                                i28 = ((iM55683 ^ i26) * 8801) ^ (-1513479360);
                                                                i29 = 1260939677;
                                                            }
                                                            break;
                                                        case -1708576699:
                                                        case -1201182419:
                                                            RunnableC0871.m55672();
                                                            if (C0949.f81897 < 0) {
                                                                iM55683 = (i26 - C0873.m55680("ܶܽ")) * (-49);
                                                                i28 = ((iM55683 ^ i27) * 23731) ^ 791760224;
                                                                i29 = 1245182738;
                                                            } else {
                                                                iM55683 = (i27 - C0873.m55680("֡᩶")) * (-119);
                                                                i28 = ((iM55683 ^ i26) * (-4113)) ^ (-672973584);
                                                                i29 = 366162594;
                                                            }
                                                            break;
                                                        case -1159670599:
                                                        case 1139375830:
                                                            if (C0892.f81851) {
                                                                iM55683 = (C0946.m55979("ۨۚ") + i26) * (-69);
                                                                i28 = ((iM55683 ^ i27) * (-10013)) ^ (-919492924);
                                                                i29 = -788736741;
                                                            } else {
                                                                iM55683 = C0946.m55979("ۧ۬") ^ i26;
                                                                i28 = ((iM55683 ^ i27) * 32243) ^ (-1278309500);
                                                                i29 = 600322911;
                                                            }
                                                            break;
                                                        case -763160005:
                                                        case 116364556:
                                                            if (AbstractC0942.f81890 <= 0) {
                                                                iM55683 = (C0946.m55979("ܶۨ") + i26) * 85;
                                                                i28 = ((iM55683 ^ i27) * (-5247)) ^ (-1138232643);
                                                                i29 = -390074841;
                                                            } else {
                                                                iM55683 = (C0946.m55979("ۡ֡") + i26) * (-45);
                                                                i28 = ((iM55683 ^ i27) * (-9011)) ^ 1665071090;
                                                                i29 = -1139690990;
                                                            }
                                                            break;
                                                        case -739230867:
                                                        case 1880962176:
                                                            textView18 = textView17;
                                                            if (C1017.f81942 >= 0) {
                                                                iM55683 = C0946.m55979("ۧ۬") ^ i26;
                                                                i28 = ((iM55683 ^ i27) * 32243) ^ (-1278309500);
                                                                i29 = 600322911;
                                                            } else {
                                                                iM55683 = C0946.m55979("ܳ᩹") ^ i27;
                                                                i28 = ((iM55683 ^ i26) * (-10461)) ^ (-1742793371);
                                                                i29 = 814340639;
                                                            }
                                                            break;
                                                        case -336011560:
                                                        case 28424146:
                                                            if (C0946.f81894 != 0) {
                                                                iM55683 = (C0946.m55979("ܶۨ") + i26) * 85;
                                                                i28 = ((iM55683 ^ i27) * (-5247)) ^ (-1138232643);
                                                                i29 = -390074841;
                                                            } else {
                                                                iM55683 = C0873.m55680("ۨ۫") ^ i27;
                                                                i28 = ((iM55683 ^ i26) * (-25877)) ^ (-156677106);
                                                                i29 = -608498872;
                                                            }
                                                            break;
                                                        case -271693274:
                                                        case -165730576:
                                                            C1053.m56327();
                                                            break;
                                                        case -259895147:
                                                        case 1077732114:
                                                            th2 = th;
                                                            if (C1024.f81946) {
                                                                iM55683 = (C0946.m55979("ܶۨ") + i26) * 85;
                                                                i28 = ((iM55683 ^ i27) * (-5247)) ^ (-1138232643);
                                                                i29 = -390074841;
                                                            } else {
                                                                iM55683 = C0873.m55680("᩸ۧ") ^ i26;
                                                                i28 = ((iM55683 ^ i27) * (-14743)) ^ 1132700997;
                                                                i29 = -1012969174;
                                                            }
                                                            break;
                                                        case -218526004:
                                                        case 249782143:
                                                            if (ServiceConnectionC1013.f81940 >= 0) {
                                                                iM55683 = (i27 - C0873.m55680("֡᩶")) * (-119);
                                                                i28 = ((iM55683 ^ i26) * (-4113)) ^ (-672973584);
                                                                i29 = 366162594;
                                                            } else {
                                                                iM55683 = C0873.m55680("ܿۧ") ^ i27;
                                                                i28 = ((iM55683 ^ i26) * 10629) ^ 1059678852;
                                                                i29 = 1389156019;
                                                            }
                                                            break;
                                                        case -179311979:
                                                        case 751156029:
                                                            C0912.m55833();
                                                            C0992.m56107();
                                                            iM55683 = (i27 - C0873.m55680("֡᩶")) * (-119);
                                                            i28 = ((iM55683 ^ i26) * (-4113)) ^ (-672973584);
                                                            i29 = 366162594;
                                                            break;
                                                        case 182191462:
                                                        case 2035831283:
                                                            strM55639 = C0863.m55639(th2);
                                                            if (C0877.f81843 >= 0) {
                                                                iM55683 = C0946.m55979("ۧ۬") ^ i26;
                                                                i28 = ((iM55683 ^ i27) * 32243) ^ (-1278309500);
                                                                i29 = 600322911;
                                                            } else {
                                                                iM55683 = C0946.m55979("ۡ֫") ^ i26;
                                                                i28 = ((iM55683 ^ i27) * (-24737)) ^ 1629800390;
                                                                i29 = -242632209;
                                                            }
                                                            break;
                                                        case 1072456416:
                                                        case 1688897422:
                                                            RunnableC0938.m55928(textView18, strM55639);
                                                            C1003.m56118(textView18, C23223.f73004);
                                                            break;
                                                        case 1284853322:
                                                        case 2117700955:
                                                            if (C0937.f81884) {
                                                                iM55683 = C0873.m55680("ۧܳ") ^ i27;
                                                                i28 = ((iM55683 ^ i26) * (-28319)) ^ 984376828;
                                                                i29 = 399116237;
                                                            } else {
                                                                iM55683 = C0946.m55979("ۧ۬") ^ i26;
                                                                i28 = ((iM55683 ^ i27) * 32243) ^ (-1278309500);
                                                                i29 = 600322911;
                                                            }
                                                            break;
                                                        default:
                                                            if (C1964.f83032 <= 0) {
                                                                iM55683 = C0946.m55979("ۧ۬") ^ i26;
                                                                i28 = ((iM55683 ^ i27) * 32243) ^ (-1278309500);
                                                                i29 = 600322911;
                                                            } else {
                                                                iM55683 = (C0873.m55680("ۘۘ") + i27) * 11;
                                                                i28 = ((iM55683 ^ i26) * 14375) ^ 1966513542;
                                                                i29 = -1756532165;
                                                            }
                                                            break;
                                                    }
                                                    return;
                                                }
                                            }
                                        });
                                        break;
                                    case -1403923546:
                                    case 298426213:
                                        if (C1964.f83032 > 0) {
                                            iM559715 = C0946.m55979("ۤܳ") ^ i22;
                                            i23 = ((iM559715 ^ i21) * (-27005)) ^ (-1955543618);
                                            i24 = 394835396;
                                        } else {
                                            iM559715 = C0946.m55979("᩸᩵") ^ i21;
                                            i23 = ((iM559715 ^ i22) * 32735) ^ 1889190774;
                                            i24 = 649588281;
                                        }
                                        break;
                                    case -1092366926:
                                    case 2090423858:
                                        c23515M15416 = c6757.m15416(new InterfaceC18588() { // from class: l.᩺۬ܽ
                                            @Override // p067l.InterfaceC18588
                                            /* JADX INFO: renamed from: ᩻ */
                                            public final boolean mo3924() {
                                                DialogInterfaceC2564 dialogInterfaceC2566 = null;
                                                boolean zM55648 = false;
                                                int i25 = 1802361551;
                                                int i26 = RunnableC1014.f81941;
                                                int i27 = C0967.f81910;
                                                int iM559716 = (i27 - C0946.m55979("ۨۖ")) * 47;
                                                int i28 = ((iM559716 ^ i26) * 24219) ^ 1059016105;
                                                int i29 = -902400093;
                                                while (true) {
                                                    i25 = ((((i25 ^ i26) * (-25523)) >> 31) & i28) ^ (iM559716 ^ i29);
                                                    switch (i25) {
                                                        case -2135256401:
                                                        case 594163734:
                                                            if (RunnableC0871.f81839 >= 0) {
                                                                iM559716 = (C0873.m55680("᩷ܰ") + i27) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                                i28 = ((iM559716 ^ i26) * (-7643)) ^ 1228464048;
                                                                i29 = 424189792;
                                                            } else {
                                                                iM559716 = (C0873.m55680("ᩳ֨") ^ i27) * (-123);
                                                                i28 = ((iM559716 ^ i26) * 32385) ^ 1154613731;
                                                                i29 = 1533891295;
                                                            }
                                                            break;
                                                        case -2104848139:
                                                        case 2091170516:
                                                            C1017.m56187();
                                                            return false;
                                                        case -1895820207:
                                                        case 1270640634:
                                                            if (C0866.f81837 >= 0) {
                                                                iM559716 = (C0946.m55979("۟ۗ") ^ i27) * (-87);
                                                                i28 = ((iM559716 ^ i26) * (-5041)) ^ 1944903110;
                                                                i29 = 459790901;
                                                            } else {
                                                                iM559716 = C0946.m55979("᩹ۛ") ^ i27;
                                                                i28 = ((iM559716 ^ i26) * 26617) ^ 850998941;
                                                                i29 = 698232263;
                                                            }
                                                            break;
                                                        case -1873116839:
                                                        case 1131818256:
                                                            C0992.m56107();
                                                            C1048.m56305();
                                                            iM559716 = (i26 - C0946.m55979("ۡ֡")) * (-107);
                                                            i28 = ((iM559716 ^ i27) * 6831) ^ (-1136176310);
                                                            i29 = 1871920773;
                                                            break;
                                                        case -1824440247:
                                                        case 1658841621:
                                                            RunnableC0897.m55784();
                                                            if (!C0892.f81851) {
                                                                iM559716 = (C0873.m55680("᩷ܰ") + i27) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                                i28 = ((iM559716 ^ i26) * (-7643)) ^ 1228464048;
                                                                i29 = 424189792;
                                                            } else {
                                                                iM559716 = (C0946.m55979("۟ۗ") ^ i27) * (-87);
                                                                i28 = ((iM559716 ^ i26) * (-5041)) ^ 1944903110;
                                                                i29 = 459790901;
                                                            }
                                                            break;
                                                        case -1573265903:
                                                        case 1774561839:
                                                            if (C1012.f81938 >= 0) {
                                                                iM559716 = C0946.m55979("ܽۗ") ^ i26;
                                                                i28 = ((iM559716 ^ i27) * (-20687)) ^ 315039247;
                                                                i29 = -223647010;
                                                            } else {
                                                                iM559716 = (C0873.m55680("ۤۖ") ^ i26) * 97;
                                                                i28 = ((iM559716 ^ i27) * 16293) ^ (-1241859314);
                                                                i29 = -1727375408;
                                                            }
                                                            break;
                                                        case -1312254577:
                                                        case 1785402203:
                                                            if (C1048.f81963) {
                                                                iM559716 = C0873.m55680("֨ۡ") ^ i27;
                                                                i28 = ((iM559716 ^ i26) * (-5431)) ^ (-1875686832);
                                                                i29 = -963516335;
                                                            } else {
                                                                iM559716 = (i26 - C0946.m55979("֫ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                                i28 = ((iM559716 ^ i27) * (-32053)) ^ 710801443;
                                                                i29 = 817050707;
                                                            }
                                                            break;
                                                        case -1121744230:
                                                        case -444157295:
                                                            if (C0947.f81895) {
                                                                iM559716 = (C0873.m55680("᩷ܰ") + i27) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                                i28 = ((iM559716 ^ i26) * (-7643)) ^ 1228464048;
                                                                i29 = 424189792;
                                                            } else {
                                                                iM559716 = (i27 - C0946.m55979("ۚܽ")) * 127;
                                                                i28 = ((iM559716 ^ i26) * 23011) ^ (-1736646942);
                                                                i29 = -1346745854;
                                                            }
                                                            break;
                                                        case -1035165615:
                                                        case -63860885:
                                                            return !zM55648;
                                                        case -886771955:
                                                        case -768357192:
                                                            zM55648 = C0866.m55648(dialogInterfaceC2566);
                                                            if (C0854.m55595() >= 0) {
                                                                iM559716 = (i26 - C0946.m55979("֫ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                                i28 = ((iM559716 ^ i27) * (-32053)) ^ 710801443;
                                                                i29 = 817050707;
                                                            } else {
                                                                iM559716 = (C0946.m55979("ۘ۠") + i27) * (-23);
                                                                i28 = ((iM559716 ^ i26) * 1629) ^ (-1947926505);
                                                                i29 = -1236077843;
                                                            }
                                                            break;
                                                        case -636345771:
                                                        case -604145358:
                                                            if (C0927.f81875) {
                                                                iM559716 = (C0946.m55979("۟ۗ") ^ i27) * (-87);
                                                                i28 = ((iM559716 ^ i26) * (-5041)) ^ 1944903110;
                                                                i29 = 459790901;
                                                            } else {
                                                                iM559716 = (C0946.m55979("᩻ۡ") ^ i26) * 79;
                                                                i28 = ((iM559716 ^ i27) * 20255) ^ 1879384859;
                                                                i29 = 1566054494;
                                                            }
                                                            break;
                                                        case -379683412:
                                                        case 1295357500:
                                                            if (C0854.m55595() >= 0) {
                                                                iM559716 = (i26 - C0946.m55979("ۡ֡")) * (-107);
                                                                i28 = ((iM559716 ^ i27) * 6831) ^ (-1136176310);
                                                                i29 = 1871920773;
                                                            } else {
                                                                iM559716 = (C0946.m55979("᩷ܳ") + i26) * 7;
                                                                i28 = ((iM559716 ^ i27) * (-26305)) ^ (-76941664);
                                                                i29 = 2142342215;
                                                            }
                                                            break;
                                                        case 49116398:
                                                        case 1436317944:
                                                            if (C1003.f81929 <= 0) {
                                                                iM559716 = C0946.m55979("ܽۗ") ^ i26;
                                                                i28 = ((iM559716 ^ i27) * (-20687)) ^ 315039247;
                                                                i29 = -223647010;
                                                            } else {
                                                                iM559716 = (C0946.m55979("۟ۗ") ^ i27) * (-87);
                                                                i28 = ((iM559716 ^ i26) * (-5041)) ^ 1944903110;
                                                                i29 = 459790901;
                                                            }
                                                            break;
                                                        case 381735005:
                                                        case 1764638745:
                                                            dialogInterfaceC2566 = dialogInterfaceC2565;
                                                            if (C1048.f81963) {
                                                                iM559716 = (C0873.m55680("ᩴܺ") + i26) * (-21);
                                                                i28 = ((iM559716 ^ i27) * 16649) ^ 1624967366;
                                                                i29 = -1127928853;
                                                            } else {
                                                                iM559716 = (i26 - C0946.m55979("ۡ֡")) * (-107);
                                                                i28 = ((iM559716 ^ i27) * 6831) ^ (-1136176310);
                                                                i29 = 1871920773;
                                                            }
                                                            break;
                                                        case 455165029:
                                                        case 1465060765:
                                                            C0947.m55997();
                                                            if (C1044.m56286() > 0) {
                                                                iM559716 = (C0946.m55979("۟ۗ") ^ i27) * (-87);
                                                                i28 = ((iM559716 ^ i26) * (-5041)) ^ 1944903110;
                                                                i29 = 459790901;
                                                            } else {
                                                                iM559716 = (i26 - C0946.m55979("ۡ֡")) * (-107);
                                                                i28 = ((iM559716 ^ i27) * 6831) ^ (-1136176310);
                                                                i29 = 1871920773;
                                                            }
                                                            break;
                                                        default:
                                                            if (RunnableC0897.f81856) {
                                                                iM559716 = (C0946.m55979("᩻᩵") + i26) * (-83);
                                                                i28 = ((iM559716 ^ i27) * 7295) ^ (-339318794);
                                                                i29 = -438389522;
                                                            } else {
                                                                iM559716 = (i26 - C0946.m55979("֫ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                                i28 = ((iM559716 ^ i27) * (-32053)) ^ 710801443;
                                                                i29 = 817050707;
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                        });
                                        iM559715 = (i22 - C0946.m55979("ۘ᩻")) * 45;
                                        i23 = ((iM559715 ^ i21) * (-2903)) ^ (-1520760696);
                                        i24 = 1966350389;
                                        break;
                                    case -1091349967:
                                    case 1090394135:
                                        C1071.m56343();
                                        if (C1404.f82149 >= 0) {
                                            iM559715 = C0946.m55979("ᩴ᩻") ^ i22;
                                            i23 = ((iM559715 ^ i21) * (-4487)) ^ (-344270188);
                                            i24 = -2079129268;
                                        } else {
                                            iM559715 = C0946.m55979("ۤܳ") ^ i22;
                                            i23 = ((iM559715 ^ i21) * (-27005)) ^ (-1955543618);
                                            i24 = 394835396;
                                        }
                                        break;
                                    case -1003924396:
                                    case 184474235:
                                        if (C1229.f82066 >= 0) {
                                            iM559715 = C0946.m55979("ۤܳ") ^ i22;
                                            i23 = ((iM559715 ^ i21) * (-27005)) ^ (-1955543618);
                                            i24 = 394835396;
                                        } else {
                                            iM559715 = (C0946.m55979("۟ᩴ") + i22) * (-111);
                                            i23 = ((iM559715 ^ i21) * (-223)) ^ (-1135446642);
                                            i24 = -425472104;
                                        }
                                        break;
                                    case -932863101:
                                    case -559898483:
                                        if (C0877.f81843 < 0) {
                                            iM559715 = C0873.m55680("ܳᩴ") ^ i21;
                                            i23 = ((iM559715 ^ i22) * (-2203)) ^ (-911734593);
                                            i24 = -1094594321;
                                        } else {
                                            iM559715 = (C0873.m55680("֡᩹") ^ i22) * (-117);
                                            i23 = ((iM559715 ^ i21) * 13223) ^ 1970256639;
                                            i24 = 640663137;
                                        }
                                        break;
                                    case -823621336:
                                    case 2027599541:
                                        if (C1964.m56597() != 0) {
                                            iM559715 = C0946.m55979("ᩴ᩻") ^ i22;
                                            i23 = ((iM559715 ^ i21) * (-4487)) ^ (-344270188);
                                            i24 = -2079129268;
                                        } else {
                                            iM559715 = (i22 - C0946.m55979("ܰܿ")) * (-69);
                                            i23 = ((iM559715 ^ i21) * (-16743)) ^ (-220878240);
                                            i24 = -304233382;
                                        }
                                        break;
                                    case -509754379:
                                    case -196868893:
                                        if (C0947.f81895) {
                                            iM559715 = C0873.m55680("ܳᩴ") ^ i21;
                                            i23 = ((iM559715 ^ i22) * (-2203)) ^ (-911734593);
                                            i24 = -1094594321;
                                        } else {
                                            iM559715 = C0873.m55680("ܳ᩻") ^ i21;
                                            i23 = ((iM559715 ^ i22) * (-27495)) ^ (-879186371);
                                            i24 = -389434879;
                                        }
                                        break;
                                    case -392110180:
                                    case -25999630:
                                        dialogInterfaceC2565 = dialogInterfaceC2564;
                                        textView17 = textView13;
                                        iM559715 = C0946.m55979("ۤ֨") ^ i21;
                                        i23 = ((iM559715 ^ i22) * 14435) ^ (-1599482277);
                                        i24 = 300654813;
                                        break;
                                    case -150903873:
                                    case 661427550:
                                        if (C0992.f81922 >= 0) {
                                            iM559715 = (C0873.m55680("֡᩹") ^ i22) * (-117);
                                            i23 = ((iM559715 ^ i21) * 13223) ^ 1970256639;
                                            i24 = 640663137;
                                        } else {
                                            iM559715 = (C0873.m55680("֫᩷") ^ i22) * 59;
                                            i23 = ((iM559715 ^ i21) * (-5587)) ^ (-1626172361);
                                            i24 = 316447629;
                                        }
                                        break;
                                    case 241410228:
                                    case 1676080247:
                                        try {
                                            C0854.m55606(new RunnableC20876(2, textView17, c23515M15416));
                                            iM559715 = (i21 - C0873.m55680("ۧᩴ")) * 11;
                                            i23 = ((iM559715 ^ i22) * (-27885)) ^ (-555376642);
                                            i24 = 209145724;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            iM559715 = (i22 - C0873.m55680("ۡ᩺")) * (-87);
                                            i23 = ((iM559715 ^ i21) * 6011) ^ (-1457601233);
                                            i24 = 3670601;
                                        }
                                        break;
                                    case 540062593:
                                    case 1666203767:
                                        if (C0873.f81841 <= 0) {
                                            iM559715 = C0946.m55979("ᩴ᩻") ^ i22;
                                            i23 = ((iM559715 ^ i21) * (-4487)) ^ (-344270188);
                                            i24 = -2079129268;
                                        } else {
                                            iM559715 = (i21 - C0873.m55680("ܽۘ")) * 73;
                                            i23 = ((iM559715 ^ i22) * 4645) ^ 100402052;
                                            i24 = -821505925;
                                        }
                                        break;
                                    case 1030621086:
                                    case 1682413887:
                                        if (C0946.f81894 != 0) {
                                            iM559715 = (C0946.m55979("᩺ۡ") ^ i22) * (-33);
                                            i23 = ((iM559715 ^ i21) * (-10047)) ^ (-1376780814);
                                            i24 = 237999848;
                                        } else {
                                            iM559715 = (i21 - C0873.m55680("֡ۙ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i23 = ((iM559715 ^ i22) * 12841) ^ 87521023;
                                            i24 = 14362269;
                                        }
                                        break;
                                    case 1203895682:
                                    case 2078124546:
                                        if (C0906.f81862 >= 0) {
                                            iM559715 = (C0873.m55680("֡᩹") ^ i22) * (-117);
                                            i23 = ((iM559715 ^ i21) * 13223) ^ 1970256639;
                                            i24 = 640663137;
                                        } else {
                                            iM559715 = C0946.m55979("ܿ۬") ^ i22;
                                            i23 = ((iM559715 ^ i21) * (-13365)) ^ 801686589;
                                            i24 = -1806138909;
                                        }
                                        break;
                                    case 1245946739:
                                    case 1849205821:
                                        if (C1929.f83011 != 0) {
                                            iM559715 = (C0946.m55979("᩺ۡ") ^ i22) * (-33);
                                            i23 = ((iM559715 ^ i21) * (-10047)) ^ (-1376780814);
                                            i24 = 237999848;
                                        } else {
                                            iM559715 = C0873.m55680("ۚ᩻") ^ i22;
                                            i23 = ((iM559715 ^ i21) * 8623) ^ (-1849222635);
                                            i24 = 1056413848;
                                        }
                                        break;
                                    default:
                                        c6757 = c6756;
                                        if (C0989.m56095() <= 0) {
                                            iM559715 = (C0946.m55979("᩺ۡ") ^ i22) * (-33);
                                            i23 = ((iM559715 ^ i21) * (-10047)) ^ (-1376780814);
                                            i24 = 237999848;
                                        } else {
                                            iM559715 = (C0873.m55680("᩹ۢ") ^ i21) * 3;
                                            i23 = ((iM559715 ^ i22) * 15537) ^ 75559745;
                                            i24 = 709770680;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    runnableC12823.run();
                    C1929.m56554(dialogInterfaceC2564.m3859(), true);
                    C1964.m56595(C1071.m56337(dialogInterfaceC2564), true);
                    C1964.m56595(c0990, true);
                    C1964.m56595(c0991, true);
                    break;
                case -963594199:
                case 536906217:
                    C0917.m55854();
                    C0989.m56095();
                    iM559710 = C0946.m55979("ܿ᩹") ^ i12;
                    i14 = ((iM559710 ^ i11) * (-14803)) ^ 226415185;
                    i8 = -503651769;
                    i13 = iM559710 ^ i8;
                    i10 = i10;
                    break;
                case -711316944:
                case -240407031:
                    c6753 = c6755;
                    textView13 = textView13;
                    view = view;
                    c10141 = c10141;
                    i15 = i15;
                    if (c6751.m15418()) {
                        iM55979 = C0946.m55979("֡᩻") ^ i11;
                        i3 = ((iM55979 ^ i12) * (-21075)) ^ 2036502904;
                        i4 = -1444768369;
                    } else {
                        iM55979 = C0946.m55979("᩻᩹") ^ i12;
                        i3 = ((iM55979 ^ i11) * 2581) ^ (-1138375481);
                        i4 = 1673456676;
                    }
                    i13 = iM55979 ^ i4;
                    c6755 = c6753;
                    i14 = i3;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case -614362427:
                case 1579943520:
                    i = i15;
                    executorService = executorService2;
                    c6752 = c6755;
                    TextView textView17 = (TextView) C1404.m56465(viewM55755, C0946.m55979(RunnableC0938.m55936(f82081, 269, 3, i)) ^ 2129022273);
                    C1053.m56331(textView17, new InterfaceC8205() { // from class: l.ܿ۫ܽ
                        @Override // p067l.InterfaceC8205
                        public final Object get() {
                            return c6752.m15424();
                        }
                    });
                    C1194.m56393(arrayList2, textView17);
                    iM55680 = C0873.m55680("᩸ۧ") ^ i11;
                    i14 = ((iM55680 ^ i12) * 14577) ^ 2139423766;
                    i2 = 610266246;
                    i13 = iM55680 ^ i2;
                    c6755 = c6752;
                    i15 = i;
                    executorService2 = executorService;
                    c10141 = c10140;
                    break;
                case -559025424:
                case 2106704880:
                    i15 = i15;
                    c6753 = c6755;
                    textView13 = textView13;
                    C0894.m55771(textView12, c6751.m15423());
                    C0873.m55684(textView13, C0946.m55979(C0882.m55717(f82081, 263, 3, i15)) ^ 2130381685);
                    executorService2 = C4081.f8987;
                    if (C0946.f81894 != 0) {
                        c10141 = c10140;
                        view = view;
                        iM55979 = (i11 - C0873.m55680("ܰܺ")) * 119;
                        i3 = ((iM55979 ^ i12) * (-26387)) ^ (-234615178);
                        i4 = 36042365;
                        i13 = iM55979 ^ i4;
                        c6755 = c6753;
                        i14 = i3;
                        i15 = i15;
                        c10141 = c10141;
                        view = view;
                    } else {
                        int iM55683 = (C0873.m55680("᩵ᩳ") + i12) * 59;
                        view = view;
                        c6755 = c6753;
                        i13 = iM55683 ^ 64450017;
                        i14 = ((iM55683 ^ i11) * (-14549)) ^ (-1981242951);
                        i15 = i15;
                        i10 = i10;
                        c10141 = c10140;
                    }
                    textView13 = textView13;
                    break;
                case -370525343:
                case 638299489:
                    C1024.m56202(C0946.m55979(ServiceConnectionC1013.m56161(f82081, Scalar25519.TARGET_LENGTH, 3, i15)) ^ 2128300249);
                    C0917.m55847(dialogInterfaceC2564);
                    break;
                case -90901152:
                case 929092494:
                    final ArrayList arrayList3 = arrayList2;
                    arrayList = arrayList2;
                    View.OnClickListener onClickListener2 = new View.OnClickListener(c10140) { // from class: l.ۤ۬ܽ

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C10140 f34019;

                        {
                            int i20;
                            int i21;
                            int iM55684;
                            int i22;
                            int i23;
                            int iM559715;
                            int i24;
                            int i25;
                            int iM55685;
                            int i26;
                            int i27;
                            ViewOnClickListenerC12171 viewOnClickListenerC12171 = this;
                            int i28 = -1213393625;
                            int i29 = C1044.f81959;
                            int i30 = C1012.f81938;
                            int iM55686 = C0873.m55680("ܳܳ") ^ i29;
                            int i31 = ((iM55686 ^ i30) * 17985) ^ 2143137314;
                            int i32 = iM55686 ^ (-224396143);
                            while (true) {
                                i28 = ((((i28 ^ i30) * (-12025)) >> 31) & i31) ^ i32;
                                switch (i28) {
                                    case -2098146729:
                                    case -53934534:
                                        C0955.m56025();
                                        if (C1028.m56247() < 0) {
                                            iM55685 = C0873.m55680("ۤۡ") ^ i30;
                                            i26 = ((iM55685 ^ i29) * 28829) ^ (-589740703);
                                            i27 = -570874143;
                                            i32 = iM55685 ^ i27;
                                            i31 = i26;
                                        } else {
                                            i21 = i28;
                                            iM55684 = C0873.m55680("֫ۗ") ^ i29;
                                            i22 = ((iM55684 ^ i30) * (-9399)) ^ (-1899502073);
                                            i23 = 508276308;
                                            i32 = iM55684 ^ i23;
                                            i31 = i22;
                                            i28 = i21;
                                        }
                                        break;
                                    case -2077592261:
                                    case -640018518:
                                        if (!C0863.m55643()) {
                                            i20 = i28;
                                            int iM559716 = (C0946.m55979("᩺ܺ") ^ i29) * (-73);
                                            i31 = ((iM559716 ^ i30) * (-1683)) ^ (-836308305);
                                            i28 = i20;
                                            i32 = iM559716 ^ (-1389857915);
                                            viewOnClickListenerC12171 = this;
                                        } else {
                                            iM55685 = C0873.m55680("ۤۡ") ^ i30;
                                            i26 = ((iM55685 ^ i29) * 28829) ^ (-589740703);
                                            i27 = -570874143;
                                            i32 = iM55685 ^ i27;
                                            i31 = i26;
                                        }
                                        break;
                                    case -1777334016:
                                    case -192480165:
                                        RunnableC0938.m55938();
                                        C0892.m55749();
                                        throw new RuntimeException();
                                    case -1547481493:
                                    case 1752881338:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM55685 = C0873.m55680("ۤۡ") ^ i30;
                                            i26 = ((iM55685 ^ i29) * 28829) ^ (-589740703);
                                            i27 = -570874143;
                                        } else {
                                            iM55685 = C0873.m55680("ܺ᩵") ^ i30;
                                            i26 = ((iM55685 ^ i29) * (-5141)) ^ 2043120174;
                                            i27 = 227262179;
                                        }
                                        i32 = iM55685 ^ i27;
                                        i31 = i26;
                                        break;
                                    case -1275945235:
                                    case -36457214:
                                        if (C0898.f81858 <= 0) {
                                            i21 = i28;
                                            iM559715 = C0946.m55979("۠ܽ") ^ i30;
                                            i24 = ((iM559715 ^ i29) * (-15279)) ^ (-1058540336);
                                            i25 = 937710882;
                                            i31 = i24;
                                            i32 = iM559715 ^ i25;
                                            i28 = i21;
                                        } else {
                                            iM55685 = C0873.m55680("ۤۡ") ^ i30;
                                            i26 = ((iM55685 ^ i29) * 28829) ^ (-589740703);
                                            i27 = -570874143;
                                            i32 = iM55685 ^ i27;
                                            i31 = i26;
                                        }
                                        break;
                                    case -1261274520:
                                    case -997881662:
                                        if (C0906.m55809() <= 0) {
                                            i21 = i28;
                                            iM559715 = C0946.m55979("۠ܽ") ^ i30;
                                            i24 = ((iM559715 ^ i29) * (-15279)) ^ (-1058540336);
                                            i25 = 937710882;
                                            i31 = i24;
                                            i32 = iM559715 ^ i25;
                                            i28 = i21;
                                        } else {
                                            int iM55687 = (C0873.m55680("֡ܰ") ^ i30) * (-109);
                                            i32 = iM55687 ^ (-1005376964);
                                            i31 = ((iM55687 ^ i29) * (-23911)) ^ 1656684806;
                                        }
                                        break;
                                    case -1247770440:
                                    case 1098535289:
                                        if (RunnableC0871.f81839 >= 0) {
                                            i21 = i28;
                                            iM55684 = (i29 - C0946.m55979("ܶ۟")) * 27;
                                            i22 = ((iM55684 ^ i30) * (-7369)) ^ (-888032470);
                                            i23 = -441917042;
                                            i32 = iM55684 ^ i23;
                                            i31 = i22;
                                            i28 = i21;
                                        } else {
                                            int iM55688 = C0873.m55680("ܿۢ") ^ i29;
                                            i32 = iM55688 ^ 1015647283;
                                            i31 = ((iM55688 ^ i30) * (-32705)) ^ 1337318887;
                                        }
                                        break;
                                    case -1197531216:
                                    case 2146647303:
                                        return;
                                    case -1161203086:
                                    case 1141480368:
                                        i21 = i28;
                                        if (C1194.m56396() > 0) {
                                            iM55684 = C0946.m55979("ܰۘ") ^ i29;
                                            i22 = ((iM55684 ^ i30) * (-6105)) ^ (-193559066);
                                            i23 = -612498270;
                                            i32 = iM55684 ^ i23;
                                            i31 = i22;
                                            i28 = i21;
                                        }
                                        iM559715 = C0946.m55979("۠ܽ") ^ i30;
                                        i24 = ((iM559715 ^ i29) * (-15279)) ^ (-1058540336);
                                        i25 = 937710882;
                                        i31 = i24;
                                        i32 = iM559715 ^ i25;
                                        i28 = i21;
                                        break;
                                    case -1027256022:
                                    case 570776249:
                                        if (C0866.f81837 >= 0) {
                                            i21 = i28;
                                            iM55684 = (i29 - C0946.m55979("ܶ۟")) * 27;
                                            i22 = ((iM55684 ^ i30) * (-7369)) ^ (-888032470);
                                            i23 = -441917042;
                                            i32 = iM55684 ^ i23;
                                            i31 = i22;
                                            i28 = i21;
                                        } else {
                                            int iM559717 = C0946.m55979("᩸ۘ") ^ i29;
                                            i32 = iM559717 ^ 731604179;
                                            i31 = ((iM559717 ^ i30) * 8245) ^ (-189000703);
                                        }
                                        break;
                                    case -810889057:
                                    case 1806959302:
                                        if (C1003.f81929 <= 0) {
                                            i21 = i28;
                                            iM55684 = (i29 - C0946.m55979("ܶ۟")) * 27;
                                            i22 = ((iM55684 ^ i30) * (-7369)) ^ (-888032470);
                                            i23 = -441917042;
                                            i32 = iM55684 ^ i23;
                                            i31 = i22;
                                            i28 = i21;
                                        } else {
                                            int iM559718 = C0946.m55979("᩵ܽ") ^ i29;
                                            i32 = iM559718 ^ 1039704584;
                                            i31 = ((iM559718 ^ i30) * 31455) ^ 660847273;
                                        }
                                        break;
                                    case -690141195:
                                    case 1709735777:
                                        i21 = i28;
                                        if (C1124.f82007 >= 0) {
                                            iM55684 = C0873.m55680("֫ۗ") ^ i29;
                                            i22 = ((iM55684 ^ i30) * (-9399)) ^ (-1899502073);
                                            i23 = 508276308;
                                        } else {
                                            iM55684 = C0946.m55979("ۛ֨") ^ i30;
                                            i22 = ((iM55684 ^ i29) * 4955) ^ 1304955981;
                                            i23 = 266204023;
                                        }
                                        i32 = iM55684 ^ i23;
                                        i31 = i22;
                                        i28 = i21;
                                        break;
                                    case -543563604:
                                    case 1760403892:
                                        C0894.m55769();
                                        C0955.m56025();
                                        i21 = i28;
                                        iM55684 = C0873.m55680("֫ۗ") ^ i29;
                                        i22 = ((iM55684 ^ i30) * (-9399)) ^ (-1899502073);
                                        i23 = 508276308;
                                        i32 = iM55684 ^ i23;
                                        i31 = i22;
                                        i28 = i21;
                                        break;
                                    case 675687126:
                                    case 1133973006:
                                        i21 = i28;
                                        if (C1048.f81963) {
                                            iM55684 = C0873.m55680("ۘᩳ") ^ i29;
                                            i22 = ((iM55684 ^ i30) * 6197) ^ (-1680725325);
                                            i23 = 1585887414;
                                        } else {
                                            iM55684 = (i29 - C0946.m55979("ܶ۟")) * 27;
                                            i22 = ((iM55684 ^ i30) * (-7369)) ^ (-888032470);
                                            i23 = -441917042;
                                        }
                                        i32 = iM55684 ^ i23;
                                        i31 = i22;
                                        i28 = i21;
                                        break;
                                    case 1394995410:
                                    case 2044724060:
                                        if (C1003.f81929 > 0) {
                                            iM559715 = C0946.m55979("۫ۡ") ^ i30;
                                            i21 = i28;
                                            i24 = ((iM559715 ^ i29) * (-27851)) ^ 1777755399;
                                            i25 = 2059294433;
                                            i31 = i24;
                                            i32 = iM559715 ^ i25;
                                            i28 = i21;
                                        }
                                        i21 = i28;
                                        iM55684 = C0873.m55680("֫ۗ") ^ i29;
                                        i22 = ((iM55684 ^ i30) * (-9399)) ^ (-1899502073);
                                        i23 = 508276308;
                                        i32 = iM55684 ^ i23;
                                        i31 = i22;
                                        i28 = i21;
                                        break;
                                    default:
                                        i20 = i28;
                                        viewOnClickListenerC12171.f34019 = c10140;
                                        if (C0854.m55595() >= 0) {
                                            int iM559719 = (C0946.m55979("᩺ܺ") ^ i29) * (-73);
                                            i31 = ((iM559719 ^ i30) * (-1683)) ^ (-836308305);
                                            i28 = i20;
                                            i32 = iM559719 ^ (-1389857915);
                                        } else {
                                            int iM559720 = C0946.m55979("ܽ۟") ^ i30;
                                            i32 = iM559720 ^ (-159141276);
                                            i31 = ((iM559720 ^ i29) * (-17881)) ^ (-428478778);
                                            i28 = i20;
                                        }
                                        viewOnClickListenerC12171 = this;
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:29:0x00bd A[PHI: r25
                          0x00bd: PHI (r25v5 android.widget.TextView) = 
                          (r25v2 android.widget.TextView)
                          (r25v1 android.widget.TextView)
                          (r25v1 android.widget.TextView)
                          (r25v1 android.widget.TextView)
                         binds: [B:28:0x00bb, B:17:0x0075, B:15:0x0072, B:12:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:58:0x01f3 A[PHI: r24 r29
                          0x01f3: PHI (r24v5 android.widget.TextView) = 
                          (r24v1 android.widget.TextView)
                          (r24v2 android.widget.TextView)
                          (r24v1 android.widget.TextView)
                          (r24v1 android.widget.TextView)
                         binds: [B:57:0x01f1, B:33:0x00f1, B:12:0x006d, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
                          0x01f3: PHI (r29v5 android.widget.TextView) = 
                          (r29v2 android.widget.TextView)
                          (r29v1 android.widget.TextView)
                          (r29v1 android.widget.TextView)
                          (r29v1 android.widget.TextView)
                         binds: [B:57:0x01f1, B:33:0x00f1, B:12:0x006d, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:63:0x0227 A[PHI: r18 r19
                          0x0227: PHI (r18v7 java.util.ArrayList) = (r18v1 java.util.ArrayList), (r18v2 java.util.ArrayList), (r18v1 java.util.ArrayList) binds: [B:62:0x0225, B:50:0x019b, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
                          0x0227: PHI (r19v9 android.widget.TextView) = (r19v3 android.widget.TextView), (r19v4 android.widget.TextView), (r19v3 android.widget.TextView) binds: [B:62:0x0225, B:50:0x019b, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i20;
                            int iM55684;
                            int i21;
                            int i22;
                            int i23;
                            C10140 c10142 = null;
                            int i24 = -1455357256;
                            int i25 = C0877.f81843;
                            int i26 = C1124.f82007;
                            int iM55685 = (C0873.m55680("ۧ۫") ^ i25) * (-47);
                            int i27 = ((iM55685 ^ i26) * 16929) ^ (-674327551);
                            int i28 = iM55685 ^ (-540868042);
                            RunnableC12823 runnableC12824 = null;
                            ArrayList arrayList4 = null;
                            TextView textView18 = null;
                            TextView textView19 = null;
                            TextView textView20 = null;
                            TextView textView21 = null;
                            TextView textView22 = null;
                            TextView textView23 = null;
                            TextView textView24 = null;
                            TextView textView25 = null;
                            TextView textView26 = null;
                            TextView textView27 = null;
                            while (true) {
                                i24 = i28 ^ (i27 & (((i24 ^ i26) * 3899) >> 31));
                                switch (i24) {
                                    case -1999356248:
                                    case 1902305623:
                                        TextView textView28 = textView8;
                                        TextView textView29 = textView9;
                                        if (C0912.f81867 > 0) {
                                            int iM55686 = C0873.m55680("۟ۗ") ^ i26;
                                            i23 = ((iM55686 ^ i25) * 11305) ^ 1987675576;
                                            i28 = iM55686 ^ (-1895687634);
                                            textView25 = textView28;
                                            textView26 = textView29;
                                            i27 = i23;
                                        } else {
                                            textView25 = textView28;
                                            textView26 = textView29;
                                            iM55684 = C0873.m55680("֨ۘ") ^ i26;
                                            i21 = ((iM55684 ^ i25) * 30373) ^ 11235621;
                                            i22 = -299321783;
                                            i28 = iM55684 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case -1931376001:
                                    case 576053011:
                                        TextView textView30 = textView11;
                                        if (C0866.f81837 < 0) {
                                            int iM55687 = (C0873.m55680("ۤ᩶") ^ i26) * (-109);
                                            i20 = ((iM55687 ^ i25) * 1983) ^ 951265195;
                                            i28 = iM55687 ^ (-1665962045);
                                            textView27 = textView30;
                                            i27 = i20;
                                        } else {
                                            textView27 = textView30;
                                            iM55684 = C0946.m55979("ܽۖ") ^ i26;
                                            i21 = ((iM55684 ^ i25) * 29167) ^ 878481439;
                                            i22 = 214857756;
                                            i28 = iM55684 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case -1901722971:
                                    case -1759756441:
                                        C1025.m56230();
                                        if (C1036.f81953 >= 0) {
                                            iM55684 = C0946.m55979("ܽۖ") ^ i26;
                                            i21 = ((iM55684 ^ i25) * 29167) ^ 878481439;
                                            i22 = 214857756;
                                        } else {
                                            iM55684 = C0873.m55680("ۨۢ") ^ i25;
                                            i21 = ((iM55684 ^ i26) * (-3701)) ^ 1242166855;
                                            i22 = -2014233898;
                                        }
                                        i28 = iM55684 ^ i22;
                                        i27 = i21;
                                        break;
                                    case -1586668421:
                                    case 1647698337:
                                        C10140.m23628(c10142, arrayList4, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView10, textView27, runnableC12824, view2);
                                        break;
                                    case -1365771290:
                                    case 163511345:
                                        AbstractC0942.m55971();
                                        if (C0937.m55918() >= 0) {
                                            iM55684 = C0873.m55680("ۚ۬") ^ i25;
                                            i21 = ((iM55684 ^ i26) * (-25355)) ^ (-2045652017);
                                            i22 = 1034007821;
                                        } else {
                                            iM55684 = C0946.m55979("ܽۖ") ^ i26;
                                            i21 = ((iM55684 ^ i25) * 29167) ^ 878481439;
                                            i22 = 214857756;
                                        }
                                        i28 = iM55684 ^ i22;
                                        i27 = i21;
                                        break;
                                    case -1362716759:
                                    case 52371502:
                                        C1044.m56286();
                                        iM55684 = C0873.m55680("ۚ۬") ^ i25;
                                        i21 = ((iM55684 ^ i26) * (-25355)) ^ (-2045652017);
                                        i22 = 1034007821;
                                        i28 = iM55684 ^ i22;
                                        i27 = i21;
                                        break;
                                    case -1279118652:
                                    case -845765768:
                                        TextView textView31 = textView7;
                                        if (C0930.f81879 > 0) {
                                            int iM55688 = C0873.m55680("ᩳܺ") ^ i25;
                                            i20 = ((iM55688 ^ i26) * 15407) ^ (-295956228);
                                            i28 = iM55688 ^ 110632850;
                                            textView24 = textView31;
                                            i27 = i20;
                                        } else {
                                            textView24 = textView31;
                                            iM55684 = C0873.m55680("ۚ۬") ^ i25;
                                            i21 = ((iM55684 ^ i26) * (-25355)) ^ (-2045652017);
                                            i22 = 1034007821;
                                            i28 = iM55684 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case -1276218302:
                                    case -818041739:
                                        ViewOnClickListenerC0939.m55941();
                                        C1124.m56367();
                                        break;
                                    case -1165751582:
                                    case 1285573271:
                                        TextView textView32 = textView4;
                                        TextView textView33 = textView5;
                                        if (C0912.f81867 > 0) {
                                            int iM55689 = (i25 - C0873.m55680("᩺᩸")) * (-85);
                                            i23 = ((iM55689 ^ i26) * 8843) ^ (-1156944530);
                                            i28 = iM55689 ^ (-1620877007);
                                            textView21 = textView32;
                                            textView22 = textView33;
                                            i27 = i23;
                                        } else {
                                            textView21 = textView32;
                                            textView22 = textView33;
                                            iM55684 = C0873.m55680("֨ۘ") ^ i26;
                                            i21 = ((iM55684 ^ i25) * 30373) ^ 11235621;
                                            i22 = -299321783;
                                            i28 = iM55684 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case -679895555:
                                    case 19077081:
                                        TextView textView34 = textView2;
                                        if (ServiceConnectionC1013.f81940 < 0) {
                                            int iM559715 = (C0946.m55979("ۨܺ") ^ i25) * (-79);
                                            i20 = ((iM559715 ^ i26) * (-29397)) ^ (-532167956);
                                            i28 = iM559715 ^ 1080103089;
                                            textView19 = textView34;
                                            i27 = i20;
                                        } else {
                                            textView19 = textView34;
                                            iM55684 = (i26 - C0873.m55680("ۗۧ")) * 127;
                                            i21 = ((iM55684 ^ i25) * (-18657)) ^ (-1391471170);
                                            i22 = 592080060;
                                            i28 = iM55684 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case -503726222:
                                    case -499929552:
                                        if (C0863.f81833 <= 0) {
                                            iM55684 = C0873.m55680("ۚ۬") ^ i25;
                                            i21 = ((iM55684 ^ i26) * (-25355)) ^ (-2045652017);
                                            i22 = 1034007821;
                                        } else {
                                            iM55684 = C0873.m55680("֨ۘ") ^ i26;
                                            i21 = ((iM55684 ^ i25) * 30373) ^ 11235621;
                                            i22 = -299321783;
                                        }
                                        i28 = iM55684 ^ i22;
                                        i27 = i21;
                                        break;
                                    case 10058367:
                                    case 1736964512:
                                        if (C1012.f81938 >= 0) {
                                            iM55684 = C0873.m55680("ۨۢ") ^ i25;
                                            i21 = ((iM55684 ^ i26) * (-3701)) ^ 1242166855;
                                            i22 = -2014233898;
                                        } else {
                                            iM55684 = C0873.m55680("ۖ᩷") ^ i25;
                                            i21 = ((iM55684 ^ i26) * 12017) ^ (-194305257);
                                            i22 = 44989955;
                                        }
                                        i28 = iM55684 ^ i22;
                                        i27 = i21;
                                        break;
                                    case 343835288:
                                    case 1286776553:
                                        ArrayList arrayList5 = arrayList3;
                                        TextView textView35 = textView;
                                        if (ServiceConnectionC1013.f81940 < 0) {
                                            int iM556810 = C0873.m55680("֫ۢ") ^ i25;
                                            i23 = ((iM556810 ^ i26) * 28233) ^ (-4347103);
                                            i28 = iM556810 ^ 1496723831;
                                            arrayList4 = arrayList5;
                                            textView18 = textView35;
                                            i27 = i23;
                                        } else {
                                            arrayList4 = arrayList5;
                                            textView18 = textView35;
                                            iM55684 = C0873.m55680("ۨۢ") ^ i25;
                                            i21 = ((iM55684 ^ i26) * (-3701)) ^ 1242166855;
                                            i22 = -2014233898;
                                            i28 = iM55684 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case 465851228:
                                    case 1605812932:
                                        TextView textView36 = textView6;
                                        if (C0898.m55800() > 0) {
                                            int iM556811 = C0873.m55680("᩺֨") ^ i26;
                                            i20 = ((iM556811 ^ i25) * 2447) ^ (-1696413280);
                                            i28 = iM556811 ^ 1593190653;
                                            textView23 = textView36;
                                            i27 = i20;
                                        } else {
                                            textView23 = textView36;
                                            iM55684 = C0946.m55979("ܽۖ") ^ i26;
                                            i21 = ((iM55684 ^ i25) * 29167) ^ 878481439;
                                            i22 = 214857756;
                                            i28 = iM55684 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case 1426091566:
                                    case 1554628442:
                                        TextView textView37 = textView3;
                                        if (C0946.f81894 == 0) {
                                            int iM556812 = (i26 - C0873.m55680("᩷֫")) * 11;
                                            i20 = ((iM556812 ^ i25) * 25757) ^ 1960022265;
                                            i28 = iM556812 ^ 2107289206;
                                            textView20 = textView37;
                                            i27 = i20;
                                        } else {
                                            textView20 = textView37;
                                            iM55684 = (i26 - C0873.m55680("ۗۧ")) * 127;
                                            i21 = ((iM55684 ^ i25) * (-18657)) ^ (-1391471170);
                                            i22 = 592080060;
                                            i28 = iM55684 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    default:
                                        RunnableC12823 runnableC12825 = runnableC12823;
                                        c10142 = this.f34019;
                                        if (C0989.f81920 < 0) {
                                            int iM556813 = C0873.m55680("ۙ᩸") ^ i26;
                                            i20 = ((iM556813 ^ i25) * (-6959)) ^ (-1500040076);
                                            i28 = iM556813 ^ (-112636816);
                                            runnableC12824 = runnableC12825;
                                            i27 = i20;
                                        } else {
                                            runnableC12824 = runnableC12825;
                                            iM55684 = (i26 - C0873.m55680("ۗۧ")) * 127;
                                            i21 = ((iM55684 ^ i25) * (-18657)) ^ (-1391471170);
                                            i22 = 592080060;
                                            i28 = iM55684 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    itM56090 = C0989.m56090(arrayList);
                    onClickListener = onClickListener2;
                    i9 = 0;
                    int iM559715 = (C0946.m55979("۬ܰ") ^ i12) * (-45);
                    i14 = ((iM559715 ^ i11) * 15235) ^ (-157982622);
                    i13 = iM559715 ^ 1161681581;
                    c6755 = c6751;
                    i15 = i15;
                    executorService2 = executorService2;
                    arrayList2 = arrayList;
                    viewM55755 = viewM55755;
                    c10141 = c10140;
                    break;
                case 98011998:
                case 2122757527:
                    C0937.m55918();
                    if (C1028.f81950 <= 0) {
                        iM559710 = (i11 - C0946.m55979("ܿۤ")) * (-39);
                        i14 = ((iM559710 ^ i12) * (-785)) ^ 677570987;
                        i8 = 2103819284;
                        i13 = iM559710 ^ i8;
                        i10 = i10;
                    } else {
                        c6753 = c6755;
                        textView13 = textView13;
                        view = view;
                        c10141 = c10141;
                        i15 = i15;
                        iM55979 = (C0946.m55979("ۡ᩸") ^ i12) * 7;
                        i3 = ((iM55979 ^ i11) * 22123) ^ (-1715018422);
                        i4 = 1763900511;
                        i13 = iM55979 ^ i4;
                        c6755 = c6753;
                        i14 = i3;
                        i15 = i15;
                        c10141 = c10141;
                        view = view;
                        textView13 = textView13;
                    }
                    break;
                case 108864728:
                case 1499185877:
                    i = i15;
                    executorService = executorService2;
                    TextView textView18 = (TextView) C0892.m55755(viewM55755, C0946.m55979(C1012.m56144(f82081, 272, 3, i)) ^ 2126541305);
                    c6752 = c6751;
                    C1053.m56331(textView18, new InterfaceC8205() { // from class: l.ܳ۫ܽ
                        @Override // p067l.InterfaceC8205
                        public final Object get() {
                            return c6752.m15427();
                        }
                    });
                    C0937.m55917(arrayList2, textView18);
                    iM55680 = (C0946.m55979("᩺ܿ") ^ i12) * (-71);
                    i14 = ((iM55680 ^ i11) * (-30063)) ^ 976352367;
                    i2 = -1480875418;
                    i13 = iM55680 ^ i2;
                    c6755 = c6752;
                    i15 = i;
                    executorService2 = executorService;
                    c10141 = c10140;
                    break;
                case 131653583:
                case 1438537290:
                    if (!C0917.f81868) {
                        iM559710 = C0946.m55979("ܿ᩹") ^ i12;
                        i14 = ((iM559710 ^ i11) * (-14803)) ^ 226415185;
                        i8 = -503651769;
                        i13 = iM559710 ^ i8;
                        i10 = i10;
                    } else {
                        c6753 = c6755;
                        textView13 = textView13;
                        view = view;
                        c10141 = c10141;
                        i15 = i15;
                        iM55979 = C0873.m55680("۠ۗ") ^ i11;
                        i3 = ((iM55979 ^ i12) * 27101) ^ (-1007799459);
                        i4 = 1748246231;
                        i13 = iM55979 ^ i4;
                        c6755 = c6753;
                        i14 = i3;
                        i15 = i15;
                        c10141 = c10141;
                        view = view;
                        textView13 = textView13;
                    }
                    break;
                case 226850290:
                case 525303546:
                    c6753 = c6755;
                    textView13 = textView13;
                    view = view;
                    c10141 = c10141;
                    i15 = i15;
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("ᩳ᩵") ^ i12;
                        i3 = ((iM55979 ^ i11) * 8583) ^ (-1377553683);
                        i4 = 1754349404;
                    } else {
                        iM55979 = (C0946.m55979("᩺᩷") ^ i12) * (-43);
                        i3 = ((iM55979 ^ i11) * 863) ^ 1313733269;
                        i4 = -1888643620;
                    }
                    i13 = iM55979 ^ i4;
                    c6755 = c6753;
                    i14 = i3;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case 360569008:
                case 811353362:
                    C1025.m56230();
                    C0989.m56095();
                    break;
                case 409407325:
                case 2038765909:
                    c6753 = c6755;
                    textView13 = textView13;
                    view = view;
                    c10141 = c10141;
                    i15 = i15;
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0946.m55979("ۤ᩵") + i12) * 109;
                        i3 = ((iM55979 ^ i11) * (-23723)) ^ (-1858307214);
                        i4 = -992587334;
                    } else {
                        iM55979 = (C0946.m55979("ۜ֫") ^ i11) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM55979 ^ i12) * (-1925)) ^ (-142094418);
                        i4 = -2071901099;
                    }
                    i13 = iM55979 ^ i4;
                    c6755 = c6753;
                    i14 = i3;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case 472394996:
                case 749118077:
                    c6753 = c6755;
                    textView13 = textView13;
                    view = view;
                    c10141 = c10141;
                    i15 = i15;
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0946.m55979("ۡ᩸") ^ i12) * 7;
                        i3 = ((iM55979 ^ i11) * 22123) ^ (-1715018422);
                        i4 = 1763900511;
                    } else {
                        iM55979 = (i12 - C0873.m55680("ᩳ۫")) * (-33);
                        i3 = ((iM55979 ^ i11) * (-4131)) ^ 1634430475;
                        i4 = 692521106;
                    }
                    i13 = iM55979 ^ i4;
                    c6755 = c6753;
                    i14 = i3;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case 655581167:
                case 1220752853:
                    TextView textView19 = (TextView) C0992.m56115(arrayList2, i9);
                    C0912.m55828(textView19, C23223.f72969);
                    textView19.setTypeface(Typeface.DEFAULT_BOLD);
                    textView19.setPaintFlags(9);
                    c10141.f28084 = (byte[]) ((InterfaceC8205) textView19.getTag()).get();
                    c10141 = c10141;
                    int iM55684 = C0873.m55680("ۖ֫") ^ i11;
                    i14 = ((iM55684 ^ i12) * (-6539)) ^ (-863136176);
                    c6755 = c6755;
                    i13 = iM55684 ^ 1609056781;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case 1098765926:
                case 1916753517:
                    if (C0866.m55647(itM56090)) {
                        iM559710 = C0946.m55979("ۙ᩷") ^ i11;
                        i14 = ((iM559710 ^ i12) * (-32715)) ^ (-58014390);
                        i8 = -1162886735;
                    } else {
                        iM559710 = C0946.m55979("᩷֨") ^ i11;
                        i14 = ((iM559710 ^ i12) * (-21869)) ^ 1365336006;
                        i8 = 1790531500;
                    }
                    i13 = iM559710 ^ i8;
                    i10 = i10;
                    break;
                case 1188246993:
                case 1657902796:
                    c6753 = c6755;
                    textView13 = textView13;
                    view = view;
                    c10141 = c10141;
                    i15 = i15;
                    if (C0917.f81868) {
                        iM55979 = (C0873.m55680("᩻֡") ^ i12) * 33;
                        i3 = ((iM55979 ^ i11) * (-19855)) ^ 127802;
                        i4 = -2131500139;
                    } else {
                        iM55979 = (i11 - C0946.m55979("ܽ᩻")) * 123;
                        i3 = ((iM55979 ^ i12) * 20151) ^ (-1312301044);
                        i4 = -1552788685;
                    }
                    i13 = iM55979 ^ i4;
                    c6755 = c6753;
                    i14 = i3;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case 1246600520:
                case 1801695359:
                    C1024.m56209();
                    if (C1024.m56209() < 0) {
                        c6753 = c6755;
                        textView13 = textView13;
                        view = view;
                        c10141 = c10141;
                        i15 = i15;
                        iM55979 = (C0873.m55680("᩻֡") ^ i12) * 33;
                        i3 = ((iM55979 ^ i11) * (-19855)) ^ 127802;
                        i4 = -2131500139;
                        i13 = iM55979 ^ i4;
                        c6755 = c6753;
                        i14 = i3;
                        i15 = i15;
                        c10141 = c10141;
                        view = view;
                        textView13 = textView13;
                    } else {
                        iM559710 = (i11 - C0946.m55979("ܿۤ")) * (-39);
                        i14 = ((iM559710 ^ i12) * (-785)) ^ 677570987;
                        i8 = 2103819284;
                        i13 = iM559710 ^ i8;
                        i10 = i10;
                    }
                    break;
                case 1271362768:
                case 1705220423:
                    c6753 = c6755;
                    textView13 = textView13;
                    view = view;
                    c10141 = c10141;
                    i15 = i15;
                    if (C0947.f81895) {
                        iM55979 = C0873.m55680("۠ۗ") ^ i11;
                        i3 = ((iM55979 ^ i12) * 27101) ^ (-1007799459);
                        i4 = 1748246231;
                    } else {
                        iM55979 = C0946.m55979("ۘܶ") ^ i11;
                        i3 = ((iM55979 ^ i12) * 31531) ^ 1411283137;
                        i4 = 1027014092;
                    }
                    i13 = iM55979 ^ i4;
                    c6755 = c6753;
                    i14 = i3;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                case 1768061591:
                case 1821213168:
                    c6753 = c6755;
                    textView13 = textView13;
                    view = view;
                    c10141 = c10141;
                    i15 = i15;
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("۠ۗ") ^ i11;
                        i3 = ((iM55979 ^ i12) * 27101) ^ (-1007799459);
                        i4 = 1748246231;
                    } else {
                        iM55979 = C0946.m55979("֡᩵") ^ i11;
                        i3 = ((iM55979 ^ i12) * 14569) ^ 436807022;
                        i4 = -536620598;
                    }
                    i13 = iM55979 ^ i4;
                    c6755 = c6753;
                    i14 = i3;
                    i15 = i15;
                    c10141 = c10141;
                    view = view;
                    textView13 = textView13;
                    break;
                default:
                    i = i15;
                    executorService = executorService2;
                    c6752 = c6755;
                    if (c6751.m15424() != null) {
                        iM55680 = (i12 - C0946.m55979("۬ۙ")) * (-95);
                        i14 = ((iM55680 ^ i11) * (-24801)) ^ (-653468483);
                        i2 = -1701796283;
                    } else {
                        iM55680 = C0873.m55680("᩸ۧ") ^ i11;
                        i14 = ((iM55680 ^ i12) * 14577) ^ 2139423766;
                        i2 = 610266246;
                    }
                    i13 = iM55680 ^ i2;
                    c6755 = c6752;
                    i15 = i;
                    executorService2 = executorService;
                    c10141 = c10140;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0218 A[PHI: r3 r4 r5
      0x0218: PHI (r3v3 int) = (r3v2 int), (r3v8 int) binds: [B:52:0x0216, B:37:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r4v3 android.view.View[]) = (r4v2 android.view.View[]), (r4v4 android.view.View[]) binds: [B:52:0x0216, B:37:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r5v3 int) = (r5v2 int), (r5v4 int) binds: [B:52:0x0216, B:37:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x026d  */
    /* JADX WARN: Code duplicated, block: B:65:0x029f  */
    /* JADX WARN: Code duplicated, block: B:81:0x032f  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (p067l.C0882.m55710() == 0) goto L17;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m23628(C10140 c10140, ArrayList arrayList, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, RunnableC12823 runnableC12823, View view) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        int iM559711;
        int i5;
        int i6;
        Iterator itM56090 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        View[] viewArr = null;
        int i10 = 0;
        TextView textView12 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = -497778631;
        int i14 = RunnableC0938.f81886;
        int i15 = C0866.f81837;
        int iM559712 = C0946.m55979("۠۟") ^ i14;
        int i16 = ((iM559712 ^ i15) * (-21923)) ^ 782598399;
        int i17 = 1901618716;
        while (true) {
            int i18 = iM559712 ^ i17;
            while (true) {
                i13 = ((((i13 ^ i15) * 53) >> 31) & i16) ^ i18;
                switch (i13) {
                    case -2056615557:
                    case -796606263:
                        if (C1017.m56187() > 0) {
                            iM559712 = C0873.m55680("ܽ֫") ^ i15;
                            i16 = ((iM559712 ^ i14) * (-20371)) ^ (-2029441690);
                            i17 = 446009397;
                        }
                        iM559710 = (i14 - C0946.m55979("᩺ۖ")) * (-9);
                        i3 = ((iM559710 ^ i15) * (-25233)) ^ 932387569;
                        i4 = -2000724804;
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case -2040518168:
                    case -1759122913:
                        if (i12 >= 0) {
                            iM559710 = (i14 - C0946.m55979("᩺ۖ")) * (-9);
                            i3 = ((iM559710 ^ i15) * (-25233)) ^ 932387569;
                            i4 = -2000724804;
                        } else {
                            iM559710 = C0873.m55680("ۤۚ") ^ i14;
                            i3 = ((iM559710 ^ i15) * 17475) ^ (-1731572787);
                            i4 = 155924366;
                        }
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case -1855488480:
                    case 1590055463:
                        View view2 = viewArr[i11];
                        ViewOnClickListenerC0939.m55945(view2, 0.0f);
                        view2.animate().alpha(1.0f).setDuration(200L).setStartDelay(i11 * 15).start();
                        i11++;
                        iM55979 = (C0873.m55680("ۛۡ") + i14) * (-101);
                        i = ((iM55979 ^ i15) * (-16461)) ^ (-1029801405);
                        i2 = 461123027;
                        i18 = iM55979 ^ i2;
                        i16 = i;
                        break;
                    case -1841614591:
                    case 992681317:
                        if (C0882.m55710() != 0) {
                            iM559710 = (C0873.m55680("ۡ۫") + i15) * 95;
                            i3 = ((iM559710 ^ i14) * (-30045)) ^ (-279283751);
                            i4 = 1258559432;
                        } else {
                            iM559710 = C0946.m55979("ܽۜ") ^ i15;
                            i3 = ((iM559710 ^ i14) * (-9013)) ^ 1426687538;
                            i4 = -211954544;
                        }
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case -1733806894:
                    case -1285428030:
                        if (AbstractC0942.f81890 <= 0) {
                            iM559710 = (i14 - C0946.m55979("᩺ۖ")) * (-9);
                            i3 = ((iM559710 ^ i15) * (-25233)) ^ 932387569;
                            i4 = -2000724804;
                        } else {
                            iM559710 = (C0946.m55979("ۤܶ") ^ i15) * (-13);
                            i3 = ((iM559710 ^ i14) * 3877) ^ (-1228722154);
                            i4 = -1268411591;
                        }
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case -1711228975:
                    case -1396271808:
                        if (C1964.f83032 <= 0) {
                            iM559710 = (C0873.m55680("ۡ۫") + i15) * 95;
                            i3 = ((iM559710 ^ i14) * (-30045)) ^ (-279283751);
                            i4 = 1258559432;
                            i18 = iM559710 ^ i4;
                            i16 = i3;
                        } else {
                            iM559712 = C0873.m55680("ܽ֫") ^ i15;
                            i16 = ((iM559712 ^ i14) * (-20371)) ^ (-2029441690);
                            i17 = 446009397;
                        }
                        break;
                    case -1677315760:
                    case 416085627:
                        C1024.m56209();
                        C1053.m56327();
                        break;
                    case -1425800734:
                    case -596930172:
                        if (C1124.f82007 >= 0) {
                            iM559710 = (C0873.m55680("ۡ۫") + i15) * 95;
                            i3 = ((iM559710 ^ i14) * (-30045)) ^ (-279283751);
                            i4 = 1258559432;
                        } else {
                            iM559710 = C0873.m55680("ᩴ᩵") ^ i14;
                            i3 = ((iM559710 ^ i15) * 18739) ^ 1713222102;
                            i4 = -1789503513;
                        }
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case -1190956254:
                    case 483534402:
                        C1003.m56118(textView12, C23223.f72969);
                        textView12.setTypeface(Typeface.DEFAULT_BOLD);
                        textView12.setPaintFlags(i7);
                        iM559710 = (i15 - C0946.m55979("ᩴۖ")) * 55;
                        i3 = ((iM559710 ^ i14) * (-29713)) ^ (-605581514);
                        i4 = 998942270;
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case -987643903:
                    case 1286915066:
                        C0912.m55828(textView12, C23223.f72995);
                        textView12.setTypeface(Typeface.DEFAULT);
                        textView12.setPaintFlags(i8);
                        iM559710 = (i15 - C0946.m55979("ᩴۖ")) * 55;
                        i3 = ((iM559710 ^ i14) * (-29713)) ^ (-605581514);
                        i4 = 998942270;
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case -977919944:
                    case 663498437:
                        break;
                    case -837496440:
                    case -524590391:
                        i12 = C0894.f81854;
                        iM559710 = C0946.m55979("۠֡") ^ i15;
                        i3 = ((iM559710 ^ i14) * 17793) ^ (-1799222241);
                        i4 = 1497605418;
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case -730893783:
                    case -351706644:
                        if (C0930.m55886(itM56090)) {
                            iM559711 = (C0873.m55680("ۚۢ") + i15) * 119;
                            i5 = ((iM559711 ^ i14) * 29545) ^ (-293646479);
                            i6 = -195198587;
                        } else {
                            iM559711 = (i14 - C0946.m55979("᩷ۡ")) * (-5);
                            i5 = ((iM559711 ^ i15) * 20343) ^ 575355357;
                            i6 = 953064440;
                        }
                        i18 = iM559711 ^ i6;
                        i16 = i5;
                        i7 = 9;
                        i8 = 1;
                        break;
                    case -610726043:
                    case 681648754:
                        runnableC12823.run();
                        break;
                    case -431695390:
                    case 79087180:
                        if (C0877.f81843 >= 0) {
                            iM559710 = C0873.m55680("ۨ᩷") ^ i15;
                            i3 = ((iM559710 ^ i14) * (-9245)) ^ (-2015615207);
                            i4 = -940617481;
                        } else {
                            iM559710 = C0873.m55680("۠ۢ") ^ i15;
                            i3 = ((iM559710 ^ i14) * (-1709)) ^ 1432000073;
                            i4 = -371113129;
                        }
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case 80756800:
                    case 508712792:
                        c10140.f28084 = (byte[]) ((InterfaceC8205) view.getTag()).get();
                        i9 = 11;
                        viewArr = new View[11];
                        i10 = 0;
                        viewArr[0] = textView;
                        viewArr[i8] = textView2;
                        viewArr[2] = textView3;
                        viewArr[3] = textView4;
                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                            iM559710 = (i14 - C0873.m55680("ۤܽ")) * (-97);
                            i3 = ((iM559710 ^ i15) * 2523) ^ (-2091826539);
                            i4 = 586983582;
                        } else {
                            iM559710 = (i14 - C0946.m55979("ۧ۫")) * 55;
                            i3 = ((iM559710 ^ i15) * (-21229)) ^ 1144107198;
                            i4 = 1543036304;
                        }
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case 139302632:
                    case 515492168:
                        if (C1003.f81929 <= 0) {
                            iM559710 = (i14 - C0946.m55979("᩺ۖ")) * (-9);
                            i3 = ((iM559710 ^ i15) * (-25233)) ^ 932387569;
                            i4 = -2000724804;
                        } else {
                            iM559710 = (C0873.m55680("ۜܰ") + i15) * (-93);
                            i3 = ((iM559710 ^ i14) * (-22747)) ^ (-1997521523);
                            i4 = 867333473;
                        }
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case 443273452:
                    case 746481068:
                        itM56090 = C0989.m56090(arrayList);
                        iM559710 = (i15 - C0946.m55979("ᩴۖ")) * 55;
                        i3 = ((iM559710 ^ i14) * (-29713)) ^ (-605581514);
                        i4 = 998942270;
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case 525623386:
                    case 2037382593:
                        if (ServiceConnectionC1013.f81940 >= 0) {
                            iM559710 = (i14 - C0946.m55979("᩺ۖ")) * (-9);
                            i3 = ((iM559710 ^ i15) * (-25233)) ^ 932387569;
                            i4 = -2000724804;
                        } else {
                            iM559710 = (C0873.m55680("᩶֨") + i14) * 25;
                            i3 = ((iM559710 ^ i15) * (-27275)) ^ 760231147;
                            i4 = 937223508;
                        }
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case 631189742:
                    case 918735190:
                        if (C1124.f82007 >= 0) {
                            iM559710 = C0873.m55680("ۨ᩷") ^ i15;
                            i3 = ((iM559710 ^ i14) * (-9245)) ^ (-2015615207);
                            i4 = -940617481;
                        } else {
                            iM559710 = C0946.m55979("ۧۗ") ^ i14;
                            i3 = ((iM559710 ^ i15) * 13205) ^ 1888043443;
                            i4 = -1217801542;
                        }
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case 646631744:
                    case 1896952862:
                        if (C0873.f81841 <= 0) {
                            iM559710 = (i14 - C0873.m55680("ۤܽ")) * (-97);
                            i3 = ((iM559710 ^ i15) * 2523) ^ (-2091826539);
                            i4 = 586983582;
                        } else {
                            iM559710 = (C0946.m55979("ۡۖ") ^ i14) * 47;
                            i3 = ((iM559710 ^ i15) * 27295) ^ 1781198026;
                            i4 = -209287692;
                        }
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case 873506662:
                    case 1301243992:
                        textView12 = (TextView) C0955.m56035(itM56090);
                        if (view == textView12) {
                            iM55979 = (C0873.m55680("ۢ۫") + i14) * (-103);
                            i = ((iM55979 ^ i15) * 28017) ^ 1882725976;
                            i2 = 1344975609;
                        } else {
                            iM55979 = (C0946.m55979("ۗܶ") + i15) * 79;
                            i = ((iM55979 ^ i14) * (-659)) ^ 1246909087;
                            i2 = -1868566364;
                        }
                        i18 = iM55979 ^ i2;
                        i16 = i;
                        break;
                    case 1470438590:
                    case 1695031584:
                        AbstractC0942.m55971();
                        RunnableC0871.m55672();
                        iM559710 = C0873.m55680("ۨ᩷") ^ i15;
                        i3 = ((iM559710 ^ i14) * (-9245)) ^ (-2015615207);
                        i4 = -940617481;
                        i18 = iM559710 ^ i4;
                        i16 = i3;
                        break;
                    case 1700195081:
                    case 1807632611:
                        if (i11 >= i9) {
                            iM559712 = C0946.m55979("᩺ۗ") ^ i15;
                            i16 = ((iM559712 ^ i14) * (-30017)) ^ 2090561883;
                            i17 = 79258363;
                        } else {
                            iM559712 = C0946.m55979("ۛۤ") ^ i14;
                            i16 = ((iM559712 ^ i15) * (-17963)) ^ (-527072441);
                            i17 = -819636636;
                        }
                        break;
                    default:
                        viewArr[4] = textView5;
                        viewArr[5] = textView6;
                        viewArr[6] = textView7;
                        viewArr[7] = textView8;
                        viewArr[8] = textView9;
                        viewArr[i7] = textView10;
                        viewArr[10] = textView11;
                        i11 = i10;
                        iM55979 = (C0873.m55680("ۛۡ") + i14) * (-101);
                        i = ((iM55979 ^ i15) * (-16461)) ^ (-1029801405);
                        i2 = 461123027;
                        i18 = iM55979 ^ i2;
                        i16 = i;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23621(TextView textView, TextView textView2, CharSequence charSequence) {
        int i = 0;
        int i2 = 1548245432;
        int i3 = C0912.f81867;
        int i4 = C0845.f81821;
        int iM55680 = (i4 - C0873.m55680("᩶ᩳ")) * 29;
        int i5 = ((iM55680 ^ i3) * (-489)) ^ 1430741863;
        int i6 = 405151618;
        while (true) {
            i2 = ((((i2 ^ i3) * 24153) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2078788033:
                case 284526474:
                    if (C0992.m56107() <= 0) {
                        iM55680 = C0873.m55680("ܶ᩷") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-24407)) ^ 17081751;
                        i6 = -733062744;
                    } else {
                        iM55680 = C0873.m55680("ܶ۬") ^ i3;
                        i5 = ((iM55680 ^ i4) * 30385) ^ 578774959;
                        i6 = 1244934727;
                    }
                    break;
                case -2039318124:
                case 2029852765:
                    if (C0917.f81868) {
                        iM55680 = (C0946.m55979("᩶ۙ") ^ i3) * (-87);
                        i5 = ((iM55680 ^ i4) * 22863) ^ (-278629741);
                        i6 = -719021561;
                    } else {
                        iM55680 = (C0873.m55680("۟۟") + i3) * (-57);
                        i5 = ((iM55680 ^ i4) * 11251) ^ (-1746025140);
                        i6 = 1817096938;
                    }
                    break;
                case -1947560506:
                case -889263025:
                    if (C0861.f81831) {
                        iM55680 = (C0873.m55680("ۧܺ") ^ i4) * (-17);
                        i5 = ((iM55680 ^ i3) * 26021) ^ 1039680931;
                        i6 = 1042271258;
                    } else {
                        iM55680 = C0873.m55680("ܶ᩷") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-24407)) ^ 17081751;
                        i6 = -733062744;
                    }
                    break;
                case -1752926147:
                case 1058747172:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55680 = (C0873.m55680("᩺۬") ^ i3) * (-3);
                        i5 = ((iM55680 ^ i4) * (-8707)) ^ (-1105472368);
                        i6 = 526577853;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۧ۟")) * 79;
                        i5 = ((iM55680 ^ i3) * 11545) ^ 1570708855;
                        i6 = -190429072;
                    }
                    break;
                case -1333333732:
                case 348664184:
                    if (C1929.m56553()) {
                        iM55680 = C0873.m55680("ܶ᩷") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-24407)) ^ 17081751;
                        i6 = -733062744;
                    } else {
                        iM55680 = (C0873.m55680("᩶ܶ") + i3) * (-45);
                        i5 = ((iM55680 ^ i4) * (-25515)) ^ 611515032;
                        i6 = 211139309;
                    }
                    break;
                case -1118290473:
                case 278184608:
                    if (C0946.m55980() != 0) {
                        iM55680 = C0946.m55979("ᩴᩳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 31649) ^ (-864292015);
                        i6 = -2146188771;
                    } else {
                        iM55680 = (C0946.m55979("ۛܿ") ^ i3) * 83;
                        i5 = ((iM55680 ^ i4) * (-10283)) ^ 678789387;
                        i6 = -1225477606;
                    }
                    break;
                case -1084091693:
                case 167645093:
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("ᩴᩳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 31649) ^ (-864292015);
                        i6 = -2146188771;
                    } else {
                        iM55680 = C0873.m55680("᩹ۘ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 11247) ^ 247711908;
                        i6 = 583118;
                    }
                    break;
                case -997730698:
                case 1284156394:
                    if (charSequence == null) {
                        iM55680 = (C0946.m55979("ۘۚ") + i3) * 23;
                        i5 = ((iM55680 ^ i4) * (-7245)) ^ (-1805947113);
                        i6 = 1478776676;
                    } else {
                        iM55680 = (C0873.m55680("ܰ᩶") + i4) * 33;
                        i5 = ((iM55680 ^ i3) * 20811) ^ (-484122608);
                        i6 = -1869429883;
                    }
                    break;
                case -586750520:
                case -309974822:
                    C0894.m55771(textView2, charSequence);
                    iM55680 = (i3 - C0946.m55979("ۧۘ")) * (-45);
                    i5 = ((iM55680 ^ i4) * (-28223)) ^ (-563787076);
                    i6 = -582226033;
                    break;
                case -562743877:
                case 34188045:
                    ViewOnClickListenerC0939.m55941();
                    C0861.m55626();
                    iM55680 = (C0873.m55680("᩺۬") ^ i3) * (-3);
                    i5 = ((iM55680 ^ i4) * (-8707)) ^ (-1105472368);
                    i6 = 526577853;
                    break;
                case -454679479:
                case 1467180323:
                    C1028.m56238(textView, i);
                    C0898.m55802(textView2, i);
                    if (charSequence != null) {
                        iM55680 = (C0873.m55680("ܶܿ") ^ i4) * 35;
                        i5 = ((iM55680 ^ i3) * 2827) ^ (-909659756);
                        i6 = 1731676700;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۧۘ")) * (-45);
                        i5 = ((iM55680 ^ i4) * (-28223)) ^ (-563787076);
                        i6 = -582226033;
                    }
                    break;
                case -445809677:
                case 33172276:
                    i = 0;
                    iM55680 = C0946.m55979("᩻ۤ") ^ i4;
                    i5 = ((iM55680 ^ i3) * 32111) ^ (-2076165152);
                    i6 = -1412086879;
                    break;
                case 115471378:
                case 2113572413:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("᩶ۙ") ^ i3) * (-87);
                        i5 = ((iM55680 ^ i4) * 22863) ^ (-278629741);
                        i6 = -719021561;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۡ۟")) * 77;
                        i5 = ((iM55680 ^ i3) * 30651) ^ 1161738906;
                        i6 = -309191421;
                    }
                    break;
                case 407915409:
                case 2009744202:
                    if (C0917.f81868) {
                        iM55680 = (C0873.m55680("᩺۬") ^ i3) * (-3);
                        i5 = ((iM55680 ^ i4) * (-8707)) ^ (-1105472368);
                        i6 = 526577853;
                    } else {
                        iM55680 = C0873.m55680("᩵᩵") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-2651)) ^ (-146602468);
                        i6 = -958829813;
                    }
                    break;
                case 591412168:
                case 1618434535:
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0873.m55680("ܶ᩷") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-24407)) ^ 17081751;
                        i6 = -733062744;
                    } else {
                        iM55680 = (C0873.m55680("᩺۬") ^ i3) * (-3);
                        i5 = ((iM55680 ^ i4) * (-8707)) ^ (-1105472368);
                        i6 = 526577853;
                    }
                    break;
                case 618100242:
                case 734048051:
                    C0890.m55740();
                    C0937.m55918();
                    break;
                case 942190296:
                case 2092273961:
                    if (C1929.f83011 == 0) {
                        iM55680 = (C0946.m55979("᩶ۙ") ^ i3) * (-87);
                        i5 = ((iM55680 ^ i4) * 22863) ^ (-278629741);
                        i6 = -719021561;
                    } else {
                        iM55680 = (C0873.m55680("᩺۬") ^ i3) * (-3);
                        i5 = ((iM55680 ^ i4) * (-8707)) ^ (-1105472368);
                        i6 = 526577853;
                    }
                    break;
                case 981416160:
                case 2049620519:
                    if (C0917.m55854()) {
                        iM55680 = (C0946.m55979("ۘ֡") ^ i4) * (-33);
                        i5 = ((iM55680 ^ i3) * (-23033)) ^ (-711413807);
                        i6 = -738617623;
                    } else {
                        iM55680 = C0946.m55979("ᩴᩳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 31649) ^ (-864292015);
                        i6 = -2146188771;
                    }
                    break;
                case 1136723237:
                case 1213752801:
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0946.m55979("ᩴᩳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 31649) ^ (-864292015);
                        i6 = -2146188771;
                    } else {
                        iM55680 = C0946.m55979("۠ۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 18471) ^ (-831637157);
                        i6 = -395446331;
                    }
                    break;
                case 1183300682:
                case 1332293662:
                    i = 8;
                    iM55680 = C0946.m55979("᩻ۤ") ^ i4;
                    i5 = ((iM55680 ^ i3) * 32111) ^ (-2076165152);
                    i6 = -1412086879;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18581. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    /* JADX INFO: renamed from: ֫ */
    public static void m23623(p067l.AbstractActivityC5549 r40, android.view.View r41, java.security.cert.X509Certificate r42) {
        /*
            Method dump skipped, instruction units count: 1858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C10140.m23623(l.ۗܺ᩷, android.view.View, java.security.cert.X509Certificate):void");
    }

    /* JADX WARN: Code duplicated, block: B:83:0x02ec A[PHI: r7 r8 r9 r18 r20
      0x02ec: PHI (r7v4 short) = (r7v3 short), (r7v2 short) binds: [B:82:0x02ea, B:78:0x02ca] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r8v4 short) = (r8v3 short), (r8v2 short) binds: [B:82:0x02ea, B:78:0x02ca] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:82:0x02ea, B:78:0x02ca] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r18v10 java.io.IOException) = (r18v9 java.io.IOException), (r18v11 java.io.IOException) binds: [B:82:0x02ea, B:78:0x02ca] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r20v4 char) = (r20v3 char), (r20v5 char) binds: [B:82:0x02ea, B:78:0x02ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0352 A[PHI: r10 r14 r18 r19 r20
      0x0352: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:89:0x0350, B:74:0x02a7, B:55:0x01b4, B:14:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0352: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:89:0x0350, B:74:0x02a7, B:55:0x01b4, B:14:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0352: PHI (r18v25 java.io.IOException) = (r18v8 java.io.IOException), (r18v12 java.io.IOException), (r18v19 java.io.IOException), (r18v26 java.io.IOException) binds: [B:89:0x0350, B:74:0x02a7, B:55:0x01b4, B:14:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0352: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:89:0x0350, B:74:0x02a7, B:55:0x01b4, B:14:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0352: PHI (r20v19 char) = (r20v2 char), (r20v6 char), (r20v13 char), (r20v20 char) binds: [B:89:0x0350, B:74:0x02a7, B:55:0x01b4, B:14:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x03a2 A[PHI: r18 r20
      0x03a2: PHI (r18v21 java.io.IOException) = (r18v6 java.io.IOException), (r18v7 java.io.IOException), (r18v22 java.io.IOException) binds: [B:97:0x03a0, B:93:0x0382, B:35:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x03a2: PHI (r20v15 char) = (r20v0 char), (r20v1 char), (r20v16 char) binds: [B:97:0x03a0, B:93:0x0382, B:35:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ee, code lost:
    
        if (p067l.C0890.m55740() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0104, code lost:
    
        if (p067l.C0866.f81837 >= 0) goto L22;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m23631(C10140 c10140, AbstractActivityC5549 abstractActivityC5549) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int iM55681;
        int i5;
        int i6;
        int i7 = C0992.f81922;
        int i8 = C1036.f81953;
        int iM55682 = C0873.m55680("۫ᩴ") ^ i8;
        int i9 = ((iM55682 ^ i7) * 9907) ^ (-797439242);
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM55682 ^ 423271893;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        short s3 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -747598446;
        IOException iOException = null;
        AbstractC17043 abstractC17043M56217 = null;
        AbstractC17043 abstractC17043 = null;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i7) * 20537) >> 31));
            switch (i15) {
                case -2094673638:
                case 1761852209:
                    C1124.m56367();
                    if (C0946.f81894 == 0) {
                        iM55979 = (i7 - C0946.m55979("ۡܰ")) * 49;
                        i = ((iM55979 ^ i8) * 10943) ^ (-1746779871);
                        i2 = 620677684;
                    } else {
                        iM55979 = C0946.m55979("ܰܳ") ^ i8;
                        i = ((iM55979 ^ i7) * 26679) ^ 246695820;
                        i2 = 116295578;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -2081698289:
                case -425875288:
                    i13 = 42471;
                    iM55680 = (C0873.m55680("ᩴۘ") ^ i8) * 27;
                    i3 = ((iM55680 ^ i7) * 17523) ^ (-104372947);
                    i4 = -1226554365;
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException2 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException2;
                    break;
                case -1983622387:
                case 139230863:
                    iOException = iOException;
                    c = c;
                    s = sArr[c];
                    s2 = 2;
                    if (C0861.f81831) {
                        iM55680 = (C0946.m55979("ᩴۡ") ^ i8) * 11;
                        i3 = ((iM55680 ^ i7) * 1509) ^ 1807573646;
                        i4 = -1557611959;
                    } else {
                        iM55680 = (C0946.m55979("ᩴۛ") ^ i7) * 9;
                        i3 = ((iM55680 ^ i8) * (-21255)) ^ (-557565151);
                        i4 = 867954942;
                    }
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException3 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException3;
                    break;
                case -1775928133:
                case -2536663:
                    iOException = iOException;
                    c = c;
                    if (C0917.f81868) {
                        iM55680 = C0946.m55979("֡۫") ^ i7;
                        i3 = ((iM55680 ^ i8) * 21583) ^ (-1066950881);
                        i4 = -1691584015;
                    } else {
                        iM55680 = C0873.m55680("ۗ۬") ^ i8;
                        i3 = ((iM55680 ^ i7) * (-23679)) ^ (-326789724);
                        i4 = -1363082225;
                    }
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException4 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException4;
                    break;
                case -1714528231:
                case -957745483:
                    C1071.m56343();
                    break;
                case -1672853466:
                case -111407031:
                    iOException = iOException;
                    c = c;
                    int i16 = s + s3;
                    if (i12 - (i16 * i16) > 0) {
                        iM55680 = (C0873.m55680("۫֡") + i7) * 109;
                        i3 = ((iM55680 ^ i8) * 13139) ^ (-17263642);
                        i4 = -1378959743;
                    } else {
                        iM55680 = (i8 - C0873.m55680("᩵ۤ")) * (-5);
                        i3 = ((iM55680 ^ i7) * (-11481)) ^ 23590745;
                        i4 = 543247782;
                    }
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException5 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException5;
                    break;
                case -1661483947:
                case 1988969835:
                    C0845.m55584();
                    break;
                case -1629842972:
                case -280540824:
                    iOException = iOException;
                    c = c;
                    abstractC17043 = C17853.f53277;
                    sArr2 = f82081;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0873.m55680("ۚۚ") + i8) * 45;
                        i3 = ((iM55680 ^ i7) * (-16649)) ^ (-492662464);
                        i4 = -573378857;
                    } else {
                        iM55680 = C0946.m55979("ۖᩳ") ^ i7;
                        i3 = ((iM55680 ^ i8) * (-24319)) ^ 891392359;
                        i4 = -1529381980;
                    }
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException6 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException6;
                    break;
                case -1513389985:
                case -1404974726:
                    C0946.m55980();
                    if (C1053.f81965 > 0) {
                        iOException = iOException;
                        c = c;
                        iM55680 = C0946.m55979("֡۫") ^ i7;
                        i3 = ((iM55680 ^ i8) * 21583) ^ (-1066950881);
                        i4 = -1691584015;
                        i6 = iM55680 ^ i4;
                        c = c;
                        IOException iOException7 = iOException;
                        i10 = i6;
                        i9 = i3;
                        iOException = iOException7;
                    }
                    iOException = iOException;
                    c = c;
                    iM55680 = C0946.m55979("۟ۡ") ^ i7;
                    i3 = ((iM55680 ^ i8) * (-8477)) ^ (-1395220306);
                    i4 = 1175339881;
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException8 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException8;
                    break;
                case -1512138448:
                case 34163915:
                    iOException = iOException;
                    c = c;
                    i12 = i11 + 1;
                    if (C0927.m55873() <= 0) {
                        iM55680 = (C0873.m55680("ܿܰ") + i8) * 123;
                        i3 = ((iM55680 ^ i7) * (-1291)) ^ (-509772737);
                        i4 = 1247358429;
                    } else {
                        iM55680 = (C0873.m55680("ܶܶ") + i8) * 5;
                        i3 = ((iM55680 ^ i7) * (-9517)) ^ (-1084091702);
                        i4 = -1688155798;
                    }
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException9 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException9;
                    break;
                case -1428567951:
                case 25209319:
                    if (C0930.m55885() > 0) {
                        iM55979 = C0946.m55979("ܰ᩶") ^ i8;
                        i = ((iM55979 ^ i7) * 21671) ^ 1133745913;
                        i2 = 2133704522;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        iOException = iOException;
                        c = c;
                        iM55680 = (C0873.m55680("ܿܰ") + i8) * 123;
                        i3 = ((iM55680 ^ i7) * (-1291)) ^ (-509772737);
                        i4 = 1247358429;
                        i6 = iM55680 ^ i4;
                        c = c;
                        IOException iOException10 = iOException;
                        i10 = i6;
                        i9 = i3;
                        iOException = iOException10;
                    }
                    break;
                case -1414590085:
                case 804931040:
                    C1929.m56553();
                    break;
                case -1208332182:
                case -536000628:
                    C1964.m56597();
                    if (C1194.m56396() <= 0) {
                        iM55979 = (i7 - C0946.m55979("ۡܰ")) * 49;
                        i = ((iM55979 ^ i8) * 10943) ^ (-1746779871);
                        i2 = 620677684;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        iOException = iOException;
                        c = c;
                        iM55680 = (C0873.m55680("ܿܰ") + i8) * 123;
                        i3 = ((iM55680 ^ i7) * (-1291)) ^ (-509772737);
                        i4 = 1247358429;
                        i6 = iM55680 ^ i4;
                        c = c;
                        IOException iOException11 = iOException;
                        i10 = i6;
                        i9 = i3;
                        iOException = iOException11;
                    }
                    break;
                case -954217053:
                case 1572939076:
                    i13 = 49043;
                    iM55680 = (C0873.m55680("ᩴۘ") ^ i8) * 27;
                    i3 = ((iM55680 ^ i7) * 17523) ^ (-104372947);
                    i4 = -1226554365;
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException12 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException12;
                    break;
                case -683033518:
                case 420776259:
                    iOException = iOException;
                    c = c;
                    s3 = 1;
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = C0946.m55979("۟ۡ") ^ i7;
                        i3 = ((iM55680 ^ i8) * (-8477)) ^ (-1395220306);
                        i4 = 1175339881;
                    } else {
                        iM55680 = C0946.m55979("֫ܳ") ^ i7;
                        i3 = ((iM55680 ^ i8) * (-5285)) ^ (-244936976);
                        i4 = 352137041;
                    }
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException13 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException13;
                    break;
                case -372731033:
                case 1998812243:
                    iOException = iOException;
                    c = c;
                    sArr = f82081;
                    if (C1044.m56286() <= 0) {
                        iM55680 = (C0873.m55680("ܿܰ") + i8) * 123;
                        i3 = ((iM55680 ^ i7) * (-1291)) ^ (-509772737);
                        i4 = 1247358429;
                    } else {
                        iM55680 = C0946.m55979("ۘᩳ") ^ i8;
                        i3 = ((iM55680 ^ i7) * 17611) ^ 852753360;
                        i4 = -1029349813;
                    }
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException14 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException14;
                    break;
                case -180806980:
                case 196681806:
                    try {
                        abstractC17043M56217.mo37342();
                        C0912.m55824(abstractC17043M56217, c10140.f28084);
                        iOException = iOException;
                        Intent intent = new Intent(abstractActivityC5549, (Class<?>) ViewOnClickListenerC7497.class);
                        c = c;
                        try {
                            intent.setAction(C0890.m55726(f82081, 288, 26, i13));
                            intent.setData(abstractC17043M56217.m38680());
                            intent.putExtra(C0955.m56029(f82081, 314, 8, i13), true);
                            ServiceConnectionC1013.m56163(abstractActivityC5549, intent);
                            iM55680 = C0873.m55680("ᩴ֫") ^ i7;
                            i3 = ((iM55680 ^ i8) * (-12655)) ^ (-736118209);
                            i4 = -982783144;
                            i6 = iM55680 ^ i4;
                            c = c;
                            IOException iOException15 = iOException;
                            i10 = i6;
                            i9 = i3;
                            iOException = iOException15;
                        } catch (IOException e) {
                            e = e;
                            iOException = e;
                            int iM559710 = (i8 - C0946.m55979("ۡ᩸")) * (-105);
                            i10 = iM559710 ^ 308676221;
                            i9 = ((iM559710 ^ i7) * 22807) ^ (-1025754869);
                            c = c;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        c = c;
                    }
                    break;
                case 143226070:
                case 1232477193:
                    iOException = iOException;
                    c = c;
                    i14 = 279;
                    if (C0861.f81831) {
                        iM55680 = (C0946.m55979("֡ᩴ") + i7) * 65;
                        i3 = ((iM55680 ^ i8) * (-27753)) ^ (-1591467949);
                        i4 = 524354772;
                    } else {
                        iM55680 = (C0873.m55680("ܿܰ") + i8) * 123;
                        i3 = ((iM55680 ^ i7) * (-1291)) ^ (-509772737);
                        i4 = 1247358429;
                    }
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException16 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException16;
                    break;
                case 172126897:
                case 462368728:
                    C0967.m56074();
                    C1404.m56468();
                    iOException = iOException;
                    c = c;
                    iM55680 = C0946.m55979("۟ۡ") ^ i7;
                    i3 = ((iM55680 ^ i8) * (-8477)) ^ (-1395220306);
                    i4 = 1175339881;
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException17 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException17;
                    break;
                case 460861944:
                case 1598029701:
                    if (C0989.f81920 < 0) {
                        iOException = iOException;
                        c = c;
                        iM55680 = (C0873.m55680("ۚۚ") + i8) * 45;
                        i3 = ((iM55680 ^ i7) * (-16649)) ^ (-492662464);
                        i4 = -573378857;
                        i6 = iM55680 ^ i4;
                        c = c;
                        IOException iOException18 = iOException;
                        i10 = i6;
                        i9 = i3;
                        iOException = iOException18;
                    }
                    iOException = iOException;
                    iM55681 = (i8 - C0873.m55680("ۜ᩹")) * (-27);
                    i3 = ((iM55681 ^ i7) * 9103) ^ 1777019185;
                    i5 = -1112859648;
                    i6 = iM55681 ^ i5;
                    IOException iOException19 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException19;
                    break;
                case 501372798:
                case 1232473975:
                    iOException = iOException;
                    c = c;
                    abstractC17043M56217 = C1024.m56217(abstractC17043, RunnableC0871.m55667(sArr2, i14, 9, i13));
                    iM55680 = (C0873.m55680("ۡۨ") + i8) * (-89);
                    i3 = ((iM55680 ^ i7) * (-6677)) ^ (-631649170);
                    i4 = -1325262486;
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException110 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException110;
                    break;
                case 592527451:
                case 1210251503:
                    iOException = iOException;
                    c = c;
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0946.m55979("֡۫") ^ i7;
                        i3 = ((iM55680 ^ i8) * 21583) ^ (-1066950881);
                        i4 = -1691584015;
                    } else {
                        iM55680 = (C0946.m55979("ۜۙ") + i7) * 19;
                        i3 = ((iM55680 ^ i8) * (-8199)) ^ (-592265274);
                        i4 = 1254429808;
                    }
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException111 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException111;
                    break;
                case 684284703:
                case 1813823826:
                    break;
                case 755906705:
                case 1271321894:
                    C1053.m56327();
                    if (C1012.f81938 < 0) {
                        iM55979 = C0946.m55979("۟ۖ") ^ i7;
                        i = ((iM55979 ^ i8) * (-11935)) ^ (-1149126300);
                        i2 = 1199086166;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        iOException = iOException;
                        c = c;
                        iM55680 = C0946.m55979("۟ۡ") ^ i7;
                        i3 = ((iM55680 ^ i8) * (-8477)) ^ (-1395220306);
                        i4 = 1175339881;
                        i6 = iM55680 ^ i4;
                        c = c;
                        IOException iOException112 = iOException;
                        i10 = i6;
                        i9 = i3;
                        iOException = iOException112;
                    }
                    break;
                case 979107754:
                case 1599190287:
                    ServiceConnectionC1013.m56155(abstractActivityC5549, iOException, null);
                    break;
                case 1091330007:
                case 1216972001:
                    iOException = iOException;
                    c = c;
                    i11 = s * s2;
                    if (C0882.f81846) {
                        iM55680 = (C0946.m55979("ᩴۛ") ^ i7) * 9;
                        i3 = ((iM55680 ^ i8) * (-21255)) ^ (-557565151);
                        i4 = 867954942;
                    } else {
                        iM55680 = C0873.m55680("֨᩸") ^ i7;
                        i3 = ((iM55680 ^ i8) * 30387) ^ (-581029644);
                        i4 = -274199317;
                    }
                    i6 = iM55680 ^ i4;
                    c = c;
                    IOException iOException113 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException113;
                    break;
                default:
                    iOException = iOException;
                    c = 278;
                    if (C0955.f81898) {
                        iM55681 = (i8 - C0873.m55680("ۜ᩹")) * (-27);
                        i3 = ((iM55681 ^ i7) * 9103) ^ 1777019185;
                        i5 = -1112859648;
                    } else {
                        iM55681 = (C0873.m55680("ۡ֨") ^ i7) * 45;
                        i3 = ((iM55681 ^ i8) * 8455) ^ 1273373776;
                        i5 = 1285539846;
                    }
                    i6 = iM55681 ^ i5;
                    IOException iOException114 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException114;
                    break;
            }
            return;
        }
    }
}
