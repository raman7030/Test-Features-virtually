package l;

import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.stateless.b;
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
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.۠۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes3.dex */
public final class C8177 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f25174;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1121 f25175;

    /* JADX INFO: renamed from: ᩳۢ᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f25173 = {8347, 22557, 20094, -22712, 29097, 31678, 29359, 32095, -17297, 28837, -16913, 32072, 30885, 23389, -20201, 17696, -17908, 20200, -22859, 21490, -24534, 23071, 31746, 31441, 23749, -21884, 17122, -17854, -20295, -16571, 16602, 16858, -20002, 16407, -16766, 24215, 23356, -18272, 18678, -21288, 23247, 19231, 19093, 25303, -17370, 20619, -24103, 30163, -18329, 22211, 30534, 18952, 22600, -24500, -20401, 20538, 25404, 31336, 24448, 19900, 30198, -18970, 25570, 23147, 11444, 11429, 11454, 11402, 11430, 11452, 11442, 11451, 11444, 11425, 11424, 11431, 11440, 11402, 11452, 11451, 11443, 11450, 11402, 11424, 11429, 11429, 11440, 11431, 11402, 11446, 11444, 11430, 11440, 11444, 11429, 11454, 11402, 11430, 11452, 11442, 11451, 11444, 11425, 11424, 11431, 11440, 11402, 11452, 11451, 11443, 11450, 11402, 11444, 11441, 11441, 11402, 11446, 11450, 11449, 11450, 11451, 28797, 21049, 31113, 1448, 9222, 7224, 20193, 24934, 21671, 27881, 19610, -25403, -25302, -27669, 17296, 25046, -27538, 18567, 21890, 28668, -29133, -7094, 2785, -624, 97, -2243, 2941, -11261, -1729, -6192, -4498, 1857, -8378, 800, -11443, 6473, 2763, 7193, 5846, 15343, 6190, 9119, 9717, 15799, -15785, 14699, 14190, -10576, -8998, 6402, 10491, 11948, -13456, 8418, -9066, -10974, 12331, 13998, -13252, 8697, -9897, 7772, -13340, 4393, -14390, -12548, -9405, -9021, 10991, 13700, -14475, -15579, 12432, -13305, -9891, -8759, 11307, 15959, -10190, 7108, -12475, 17857, 17865, 17873, 17817, 17792, 17809, 17802, 17854, 17810, 17800, 17798, 17807, 17792, 17813, 17812, 17811, 17796, 17854, 17800, 17807, 17799, 17806, 17854, 17812, 17809, 17809, 17796, 17811, 17854, 17794, 17792, 17810, 17796, 17864, 14403, 16368, -14420, -10355, 8279, 9311, 7137, 30626, 30676, 30671, 30666, 30659, 30655, 30632, 30632, 30645, 30632, 8869, -29381, 27991, 29578, -31139, -31897, 28344, -23641, -25196, -25223, -30853, -27216, 25134, 31346, -29516, -21667, 31169, -24255, 32601, -28686, -32362, 27431, -21394, -21763, -29205, 148, -16448, -16390, -16396, -16387, -16398, -16409, -16410, -16415, -16394, -16398, -16387, -16393, -16415, -16388, -16390, -16393, -16451, -16390, -16387, -16409, -16394, -16387, -16409, -16451, -16398, -16400, -16409, -16390, -16388, -16387, -16451, -16443, -16422, -16426, -16444, -16415, -16394, -16398, -16393, -16420, -16387, -16385, -16406};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C1315 f25172 = new C1315(50);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21651(TextView textView, View view, AbstractC15440 abstractC15440, AbstractActivityC3346 abstractActivityC3346, boolean z, C13116 c13116, InterfaceC17066 interfaceC17066, AtomicBoolean atomicBoolean) {
        StringBuilder sb = null;
        String strM4373 = null;
        short[] sArr = null;
        int i = 0;
        short[] sArr2 = null;
        int i2 = 0;
        int i3 = 1578415457;
        int i4 = RunnableC0588.f2309;
        int i5 = C0714.f2697;
        int iM2566 = C0630.m2566("᩻᩶") ^ i4;
        int i6 = ((iM2566 ^ i5) * (-28893)) ^ 1402012182;
        int i7 = 2124266177;
        while (true) {
            i3 = ((((i3 ^ i5) * (-30719)) >> 31) & i6) ^ (iM2566 ^ i7);
            switch (i3) {
                case -2063443435:
                case -1941638941:
                    strM4373 = C1294.m4373(sArr2, q.h, 1, i);
                    C3245.m9923(sb, strM4373);
                    if (C1047.f3863 >= 0) {
                        iM2566 = (i4 - C2105.m6981("ۙ᩸")) * 59;
                        i6 = ((iM2566 ^ i5) * 20461) ^ 911157354;
                        i7 = -1683216159;
                    } else {
                        iM2566 = C2105.m6981("ܿᩳ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-30145)) ^ 1039456659;
                        i7 = 874169818;
                    }
                    break;
                case -1985557088:
                case 1356405036:
                    atomicBoolean.set(true);
                    iM2566 = C2105.m6981("۫ۘ") ^ i4;
                    i6 = ((iM2566 ^ i5) * 13807) ^ (-1846617656);
                    i7 = -961386450;
                    break;
                case -1940199345:
                case 1028773342:
                    if (i2 <= 0) {
                        iM2566 = C2105.m6981("ۛܰ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-31909)) ^ 664661279;
                        i7 = 1943302401;
                    } else {
                        iM2566 = (C0630.m2566("֫ܺ") ^ i5) * 75;
                        i6 = ((iM2566 ^ i4) * (-27403)) ^ (-949111840);
                        i7 = 19037234;
                    }
                    break;
                case -1791605983:
                case 1252020881:
                    sArr = f25173;
                    if (C1047.f3863 >= 0) {
                        iM2566 = (i4 - C2105.m6981("ۙ᩸")) * 59;
                        i6 = ((iM2566 ^ i5) * 20461) ^ 911157354;
                        i7 = -1683216159;
                    } else {
                        iM2566 = C0630.m2566("۠۟") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-25077)) ^ 552721820;
                        i7 = 2033350919;
                    }
                    break;
                case -1699777136:
                case 437333671:
                    if (C3746.f11829 <= 0) {
                        iM2566 = (i4 - C2105.m6981("ۙ᩸")) * 59;
                        i6 = ((iM2566 ^ i5) * 20461) ^ 911157354;
                        i7 = -1683216159;
                    } else {
                        iM2566 = C2105.m6981("ۖۡ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 24255) ^ (-254996916);
                        i7 = 1708834011;
                    }
                    break;
                case -1621127944:
                case -412808651:
                    i2 = C4117.f13076;
                    iM2566 = (C0630.m2566("ۚ֨") + i4) * 87;
                    i6 = ((iM2566 ^ i5) * 8511) ^ 2091612107;
                    i7 = -659089548;
                    break;
                case -1610496887:
                case -1015959703:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C2105.m6981("ۛܳ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 26555) ^ (-627661917);
                        i7 = -1165696190;
                    } else {
                        iM2566 = (C0630.m2566("ܳۘ") ^ i4) * 123;
                        i6 = ((iM2566 ^ i5) * (-31605)) ^ (-1253220841);
                        i7 = 82443952;
                    }
                    break;
                case -1607657816:
                case -151751050:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C2105.m6981("ۛܳ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 26555) ^ (-627661917);
                        i7 = -1165696190;
                    } else {
                        iM2566 = (C2105.m6981("ۜۘ") ^ i5) * (-127);
                        i6 = ((iM2566 ^ i4) * 31487) ^ (-1487929634);
                        i7 = 1924452810;
                    }
                    break;
                case -1377713823:
                case 1596333608:
                    C2958.m9038(sb, abstractC15440.mo23117());
                    C3245.m9923(sb, strM4373);
                    C2958.m9038(sb, abstractC15440.mo23127());
                    C4263.m12821(new C2533(z, C0422.m1959(sb), abstractC15440, textView, abstractActivityC3346, interfaceC17066, c13116, view, atomicBoolean));
                    break;
                case -1334454572:
                case 1340782569:
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("ۛܳ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 26555) ^ (-627661917);
                        i7 = -1165696190;
                    } else {
                        iM2566 = (C0630.m2566("ۧ֫") ^ i4) * (-15);
                        i6 = ((iM2566 ^ i5) * 29073) ^ (-1292562549);
                        i7 = -1532940418;
                    }
                    break;
                case -1328612149:
                case -40128343:
                    if (ServiceConnectionC3453.m10564() > 0) {
                        iM2566 = C0630.m2566("ܶ֨") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-30973)) ^ 1370483296;
                        i7 = 972742164;
                    } else {
                        iM2566 = (C0630.m2566("ܳۘ") ^ i4) * 123;
                        i6 = ((iM2566 ^ i5) * (-31605)) ^ (-1253220841);
                        i7 = 82443952;
                    }
                    break;
                case -1262157754:
                case -852521227:
                    i = 63746;
                    iM2566 = (C0630.m2566("᩶ۗ") + i5) * (-95);
                    i6 = ((iM2566 ^ i4) * (-6983)) ^ 1792181865;
                    i7 = -1799826622;
                    break;
                case -1144353092:
                case 179140700:
                    if (atomicBoolean != null) {
                        iM2566 = C0630.m2566("ۛۗ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-30479)) ^ 173046402;
                        i7 = -560539539;
                    } else {
                        iM2566 = C2105.m6981("۫ۘ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 13807) ^ (-1846617656);
                        i7 = -961386450;
                    }
                    break;
                case -1079406059:
                case 1598638796:
                    sb = new StringBuilder();
                    C3245.m9923(sb, C2958.m9025(abstractC15440));
                    sArr2 = f25173;
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("ܶ֨") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-30973)) ^ 1370483296;
                        i7 = 972742164;
                    } else {
                        iM2566 = C0630.m2566("۠ܰ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-24029)) ^ 421807888;
                        i7 = 189635672;
                    }
                    break;
                case -1038355656:
                case -11752930:
                    ServiceConnectionC3453.m10564();
                    RunnableC0588.m2441();
                    break;
                case -992103548:
                case -523674281:
                    short s = sArr[124];
                    int i8 = s + 14902;
                    if ((i8 * i8) - (s * 59608) >= 0) {
                        iM2566 = C2105.m6981("֡ܳ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 29953) ^ (-765016679);
                        i7 = -660935018;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ۨܶ")) * (-51);
                        i6 = ((iM2566 ^ i5) * (-10205)) ^ (-226803037);
                        i7 = -432199957;
                    }
                    break;
                case -980305146:
                case -342524915:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C0630.m2566("ܳۘ") ^ i4) * 123;
                        i6 = ((iM2566 ^ i5) * (-31605)) ^ (-1253220841);
                        i7 = 82443952;
                    } else {
                        iM2566 = C0630.m2566("᩹ᩳ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 17381) ^ (-1755074056);
                        i7 = -749149660;
                    }
                    break;
                case -779037432:
                case 1592380453:
                    if (C0714.m2805()) {
                        iM2566 = (i5 - C0630.m2566("ᩴᩴ")) * (-77);
                        i6 = ((iM2566 ^ i4) * 20339) ^ (-705740698);
                        i7 = -1826695313;
                    } else {
                        iM2566 = C2105.m6981("ۛܰ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-31909)) ^ 664661279;
                        i7 = 1943302401;
                    }
                    break;
                case -412037199:
                case -283925358:
                    C0964.m3413();
                    if (!C11340.m28031()) {
                        iM2566 = C2105.m6981("ۛܰ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-31909)) ^ 664661279;
                        i7 = 1943302401;
                    } else {
                        iM2566 = C2105.m6981("ۛܳ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 26555) ^ (-627661917);
                        i7 = -1165696190;
                    }
                    break;
                case 349946155:
                case 1022473543:
                    if (RunnableC1108.f4040) {
                        iM2566 = (C0630.m2566("ܽܰ") ^ i4) * 51;
                        i6 = ((iM2566 ^ i5) * 16209) ^ 316957326;
                        i7 = 933930596;
                    } else {
                        iM2566 = C0630.m2566("ܶ֨") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-30973)) ^ 1370483296;
                        i7 = 972742164;
                    }
                    break;
                case 885727975:
                case 1002624522:
                    C0483.m2121();
                    iM2566 = (C0630.m2566("ܳۘ") ^ i4) * 123;
                    i6 = ((iM2566 ^ i5) * (-31605)) ^ (-1253220841);
                    i7 = 82443952;
                    break;
                default:
                    i = 9276;
                    iM2566 = (C0630.m2566("᩶ۗ") + i5) * (-95);
                    i6 = ((iM2566 ^ i4) * (-6983)) ^ 1792181865;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21655(AbstractActivityC3346 abstractActivityC3346, C1121 c1121) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int iM6982 = 0;
        byte[] bArr = null;
        String strM6303 = null;
        int i5 = RunnableC0588.f2309;
        int i6 = C4075.f12947;
        int iM2567 = C0630.m2566("۫۠") ^ i6;
        int i7 = ((iM2567 ^ i5) * 23057) ^ (-1780677048);
        C19258 c19258M5912 = null;
        String strM50602 = null;
        short[] sArr = null;
        int i8 = iM2567 ^ (-575583911);
        int i9 = 0;
        int i10 = 0;
        short s = 0;
        short s2 = 0;
        int iM2568 = 0;
        int i11 = -1509963198;
        int iM2569 = 0;
        String strM6304 = null;
        String strM6305 = null;
        EditText editText = null;
        TextView textView = null;
        View viewM10739 = null;
        while (true) {
            i11 = i8 ^ (i7 & (((i11 ^ i5) * (-1097)) >> 31));
            switch (i11) {
                case -1974555759:
                case -1057879678:
                    iM6982 = 2118777125 ^ C2105.m6981(C3683.m11225(f25173, 153, 3, i10));
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("ۨ᩷") ^ i6;
                        i = ((iM6981 ^ i5) * 10673) ^ 372265478;
                        i2 = 1812246431;
                    } else {
                        iM6981 = C0630.m2566("֫ۤ") ^ i6;
                        i = ((iM6981 ^ i5) * 14909) ^ (-872781076);
                        i2 = 1066560163;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1938402127:
                case -916617994:
                    viewM10739 = C3537.m10739(abstractActivityC3346, iM2568 ^ 2127438359);
                    if (C2520.f8000 >= 0) {
                        textView = textView;
                        int iM6983 = C2105.m6981("۫ۤ") ^ i6;
                        i8 = iM6983 ^ 328325629;
                        i7 = ((iM6983 ^ i5) * (-30795)) ^ (-291716132);
                        textView = textView;
                    } else {
                        int iM6984 = (C2105.m6981("۟᩵") + i5) * 43;
                        i8 = iM6984 ^ 1626420344;
                        i7 = ((iM6984 ^ i6) * (-123)) ^ (-1927811917);
                    }
                    break;
                case -1740856884:
                case 2058291858:
                    i10 = 51561;
                    iM2566 = (C2105.m6981("ܽ۫") ^ i6) * 7;
                    i3 = ((iM2566 ^ i5) * (-22363)) ^ 861941544;
                    i4 = 326013034;
                    int i12 = iM2566 ^ i4;
                    textView = textView;
                    View view = viewM10739;
                    i8 = i12;
                    i7 = i3;
                    viewM10739 = view;
                    break;
                case -1556241794:
                case -993349647:
                    textView = (TextView) C1005.m3507(viewM10739, iM2569 ^ i9);
                    sArr = f25173;
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C0630.m2566("ۘ֨") + i5) * 5;
                        i = ((iM6981 ^ i6) * 25669) ^ 868748477;
                        i2 = 240629166;
                    } else {
                        iM6981 = (i5 - C2105.m6981("۟ۙ")) * (-107);
                        i = ((iM6981 ^ i6) * (-11631)) ^ (-8513542);
                        i2 = 242882111;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1444073872:
                case 526459121:
                    viewM10739 = viewM10739;
                    textView = textView;
                    iM2568 = C0630.m2566(C3663.m11162(f25173, 144, 3, i10));
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("᩻۫") ^ i5;
                        i3 = ((iM2566 ^ i6) * (-12939)) ^ 734735793;
                        i4 = -571138716;
                    } else {
                        iM2566 = (C2105.m6981("᩵ۢ") + i6) * (-113);
                        i3 = ((iM2566 ^ i5) * 25081) ^ 137609059;
                        i4 = 1108761178;
                    }
                    int i13 = iM2566 ^ i4;
                    textView = textView;
                    View view2 = viewM10739;
                    i8 = i13;
                    i7 = i3;
                    viewM10739 = view2;
                    break;
                case -1435364410:
                case 2021424269:
                    strM50602 = C22628.m50602(sArr, 150, 3, i10);
                    if (C0382.m1848()) {
                        iM6981 = C0630.m2566("ۡ֡") ^ i6;
                        i = ((iM6981 ^ i5) * (-24885)) ^ 1586563910;
                        i2 = -1978221301;
                    } else {
                        iM6981 = (i6 - C0630.m2566("ۢ۠")) * (-57);
                        i = ((iM6981 ^ i5) * 15057) ^ (-222613347);
                        i2 = 1251674423;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1341855998:
                case -743763193:
                    RunnableC0588.m2438(c19258M5912);
                    editText.addTextChangedListener(new C18761(textView, C0422.m1959(C3683.m11212(textView)), strM6303, strM6305, strM6304, c1121));
                    break;
                case -1211511326:
                case -77022280:
                    C2126.m7039(C1005.m3507(viewM10739, iM6982), new ViewOnClickListenerC4428(1, editText));
                    bArr = c1121.f4081;
                    if (C3683.m11222()) {
                        iM6981 = (C0630.m2566("ۘ֨") + i5) * 5;
                        i = ((iM6981 ^ i6) * 25669) ^ 868748477;
                        i2 = 240629166;
                    } else {
                        iM6981 = (C0630.m2566("᩷۫") + i5) * (-125);
                        i = ((iM6981 ^ i6) * (-10087)) ^ (-1335350190);
                        i2 = -60619327;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1114824881:
                case 649878743:
                    iM2569 = C0630.m2566(C4159.m12578(f25173, 147, 3, i10));
                    i9 = 2097871644;
                    if (C0050.f910 >= 0) {
                        iM6981 = C0630.m2566("ۡ֡") ^ i6;
                        i = ((iM6981 ^ i5) * (-24885)) ^ 1586563910;
                        i2 = -1978221301;
                    } else {
                        iM6981 = (C2105.m6981("ܺۗ") + i6) * (-97);
                        i = ((iM6981 ^ i5) * 14553) ^ 1797549995;
                        i2 = -1846776678;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1112876322:
                case 1441433044:
                    viewM10739 = viewM10739;
                    textView = textView;
                    s2 = f25173[143];
                    s = 1448;
                    if (C3911.m11924() > 0) {
                        iM2566 = C0630.m2566("ۙۛ") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-15913)) ^ (-682326034);
                        i4 = 1746104326;
                        int i14 = iM2566 ^ i4;
                        textView = textView;
                        View view3 = viewM10739;
                        i8 = i14;
                        i7 = i3;
                        viewM10739 = view3;
                    } else {
                        viewM10739 = viewM10739;
                        int iM6985 = C2105.m6981("۫ۤ") ^ i6;
                        i8 = iM6985 ^ 328325629;
                        i7 = ((iM6985 ^ i5) * (-30795)) ^ (-291716132);
                        textView = textView;
                    }
                    break;
                case -986399865:
                case 262638293:
                    C1128.m3851();
                    if (C21923.f70183 != 0) {
                        iM6981 = C2105.m6981("ۨ᩷") ^ i6;
                        i = ((iM6981 ^ i5) * 10673) ^ 372265478;
                        i2 = 1812246431;
                    } else {
                        iM6981 = C0630.m2566("ۡ֡") ^ i6;
                        i = ((iM6981 ^ i5) * (-24885)) ^ 1586563910;
                        i2 = -1978221301;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -616086434:
                case 817984219:
                    i10 = 36580;
                    iM2566 = (C2105.m6981("ܽ۫") ^ i6) * 7;
                    i3 = ((iM2566 ^ i5) * (-22363)) ^ 861941544;
                    i4 = 326013034;
                    int i15 = iM2566 ^ i4;
                    textView = textView;
                    View view4 = viewM10739;
                    i8 = i15;
                    i7 = i3;
                    viewM10739 = view4;
                    break;
                case -532104452:
                case 1467015793:
                    viewM10739 = viewM10739;
                    textView = textView;
                    if ((s2 * s) - ((s2 * s2) + 524176) <= 0) {
                        iM2566 = C2105.m6981("ܳۡ") ^ i5;
                        i3 = ((iM2566 ^ i6) * 20145) ^ 431787820;
                        i4 = -1455789190;
                    } else {
                        iM2566 = (i5 - C0630.m2566("۬ܺ")) * 41;
                        i3 = ((iM2566 ^ i6) * (-25821)) ^ (-1295503155);
                        i4 = 822398149;
                    }
                    int i16 = iM2566 ^ i4;
                    textView = textView;
                    View view5 = viewM10739;
                    i8 = i16;
                    i7 = i3;
                    viewM10739 = view5;
                    break;
                case -463515960:
                case 650395062:
                    C1711.m5736();
                    break;
                case -378463871:
                case 1661334645:
                    editText = (EditText) C1005.m3507(viewM10739, C0630.m2566(strM50602) ^ 2124228595);
                    if (C3746.f11829 > 0) {
                        iM6981 = C2105.m6981("ۚܺ") ^ i5;
                        i = ((iM6981 ^ i6) * (-18857)) ^ (-413236222);
                        i2 = 1493773709;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        viewM10739 = viewM10739;
                        textView = textView;
                        iM2566 = C0630.m2566("᩻۫") ^ i5;
                        i3 = ((iM2566 ^ i6) * (-12939)) ^ 734735793;
                        i4 = -571138716;
                        int i17 = iM2566 ^ i4;
                        textView = textView;
                        View view6 = viewM10739;
                        i8 = i17;
                        i7 = i3;
                        viewM10739 = view6;
                    }
                    break;
                case -113534776:
                case 38630963:
                    C3019.m9255();
                    iM6981 = C2105.m6981("ۨ᩷") ^ i6;
                    i = ((iM6981 ^ i5) * 10673) ^ 372265478;
                    i2 = 1812246431;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case 60200185:
                case 1141758235:
                    C1916.m6308();
                    if (C4117.f13076 <= 0) {
                        textView = textView;
                        int iM6986 = C2105.m6981("۫ۤ") ^ i6;
                        i8 = iM6986 ^ 328325629;
                        i7 = ((iM6986 ^ i5) * (-30795)) ^ (-291716132);
                        textView = textView;
                    } else {
                        iM6981 = C0630.m2566("ۡ֡") ^ i6;
                        i = ((iM6981 ^ i5) * (-24885)) ^ 1586563910;
                        i2 = -1978221301;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case 839068232:
                case 901812339:
                    strM6303 = C1916.m6303(bArr);
                    strM6305 = C1916.m6303(c1121.f4083);
                    strM6304 = C1916.m6303(c1121.f4082);
                    c19258M5912 = C1773.m5912(abstractActivityC3346);
                    C1711.m5727(c19258M5912, viewM10739);
                    if (C4117.f13076 <= 0) {
                        iM6981 = C2105.m6981("ۨ᩷") ^ i6;
                        i = ((iM6981 ^ i5) * 10673) ^ 372265478;
                        i2 = 1812246431;
                    } else {
                        iM6981 = C0630.m2566("֡֡") ^ i5;
                        i = ((iM6981 ^ i6) * 26407) ^ 1349070916;
                        i2 = 704621709;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                default:
                    C2167.m7155();
                    if (C0798.f2919) {
                        iM6981 = (C0630.m2566("ۘ֨") + i5) * 5;
                        i = ((iM6981 ^ i6) * 25669) ^ 868748477;
                        i2 = 240629166;
                    } else {
                        iM6981 = C2105.m6981("ۨ᩷") ^ i6;
                        i = ((iM6981 ^ i5) * 10673) ^ 372265478;
                        i2 = 1812246431;
                    }
                    i8 = iM6981 ^ i2;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21657(C8177 c8177, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        int iM2566;
        int i;
        int i2;
        int i3 = 462867055;
        int i4 = C3019.f9544;
        int i5 = ServiceConnectionC3453.f10921;
        int iM6981 = C2105.m6981("ܰۨ") ^ i5;
        int i6 = ((iM6981 ^ i4) * (-7577)) ^ (-1279015655);
        int i7 = -800348159;
        while (true) {
            int i8 = iM6981 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i4) * 3663) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2102732640:
                    case 128997362:
                        if (C21923.f70183 != 0) {
                            iM2566 = C0630.m2566("֫ۛ") ^ i5;
                            i = ((iM2566 ^ i4) * 30035) ^ 2036761060;
                            i2 = 1675226396;
                        } else {
                            iM2566 = C2105.m6981("۬ۜ") ^ i5;
                            i = ((iM2566 ^ i4) * 1827) ^ (-1634438282);
                            i2 = 633852319;
                        }
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                    case -1907061657:
                    case -1827881145:
                        c8177.f25175.m3836(textView, textView2, textView3, textView4, textView5);
                        break;
                    case -1892765956:
                    case -281740248:
                        ViewOnClickListenerC1958.m6429();
                        if (C4616.f14690 <= 0) {
                            iM2566 = (C2105.m6981("ᩴ֨") + i4) * (-113);
                            i = ((iM2566 ^ i5) * (-22149)) ^ (-492750987);
                            i2 = 1649928607;
                        } else {
                            iM2566 = (C2105.m6981("֨ᩴ") ^ i4) * 29;
                            i = ((iM2566 ^ i5) * 1505) ^ 1582444910;
                            i2 = 861904794;
                        }
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                    case -1654310845:
                    case -1632932462:
                        if (C4075.f12947 >= 0) {
                            iM2566 = C0630.m2566("֫ۛ") ^ i5;
                            i = ((iM2566 ^ i4) * 30035) ^ 2036761060;
                            i2 = 1675226396;
                        } else {
                            iM2566 = (i4 - C2105.m6981("ۨܰ")) * 69;
                            i = ((iM2566 ^ i5) * (-15463)) ^ (-1722062294);
                            i2 = -1897639448;
                        }
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                    case -1053144060:
                    case -669263530:
                        C3019.m9255();
                        if (C0798.f2919) {
                            iM2566 = (C2105.m6981("ᩴ֨") + i4) * (-113);
                            i = ((iM2566 ^ i5) * (-22149)) ^ (-492750987);
                            i2 = 1649928607;
                        } else {
                            iM2566 = (i5 - C2105.m6981("ᩳۨ")) * (-41);
                            i = ((iM2566 ^ i4) * 28651) ^ 414757757;
                            i2 = 1836878590;
                        }
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                    case -919537249:
                    case -622773959:
                        if (C0050.f910 >= 0) {
                            iM2566 = (C2105.m6981("֨ᩴ") ^ i4) * 29;
                            i = ((iM2566 ^ i5) * 1505) ^ 1582444910;
                            i2 = 861904794;
                        } else {
                            iM2566 = C0630.m2566("֨᩻") ^ i4;
                            i = ((iM2566 ^ i5) * 5035) ^ 38842468;
                            i2 = -854907122;
                        }
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                    case -777238886:
                    case 645470361:
                        if (RunnableC0588.f2309 >= 0) {
                            iM2566 = C0630.m2566("֫ۛ") ^ i5;
                            i = ((iM2566 ^ i4) * 30035) ^ 2036761060;
                            i2 = 1675226396;
                        } else {
                            iM2566 = (i4 - C2105.m6981("ܶۖ")) * (-73);
                            i = ((iM2566 ^ i5) * (-14707)) ^ (-1682100320);
                            i2 = -1285171305;
                        }
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                    case -675838143:
                    case 2074025209:
                        C4616.m13552();
                        iM2566 = (C2105.m6981("ᩴ֨") + i4) * (-113);
                        i = ((iM2566 ^ i5) * (-22149)) ^ (-492750987);
                        i2 = 1649928607;
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                    case -368257167:
                    case 1658809191:
                        if (C0422.f1886 <= 0) {
                            iM2566 = (i5 - C2105.m6981("ᩳۨ")) * (-41);
                            i = ((iM2566 ^ i4) * 28651) ^ 414757757;
                            i2 = 1836878590;
                        } else {
                            iM2566 = (C0630.m2566("᩺֫") + i5) * 19;
                            i = ((iM2566 ^ i4) * (-17059)) ^ 1669027462;
                            i2 = 135258145;
                        }
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                    case -363781893:
                    case 2138484158:
                        if (C0050.f910 >= 0) {
                            iM2566 = (C2105.m6981("ᩴ֨") + i4) * (-113);
                            i = ((iM2566 ^ i5) * (-22149)) ^ (-492750987);
                            i2 = 1649928607;
                        } else {
                            iM2566 = (i5 - C0630.m2566("ۙܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i = ((iM2566 ^ i4) * (-6141)) ^ 1842756006;
                            i2 = 353385884;
                        }
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                    case -325293992:
                    case 1019001033:
                        if (C3245.m9925() != 0) {
                            iM2566 = (C2105.m6981("ᩴ֨") + i4) * (-113);
                            i = ((iM2566 ^ i5) * (-22149)) ^ (-492750987);
                            i2 = 1649928607;
                        } else {
                            iM2566 = C0630.m2566("ܺۗ") ^ i4;
                            i = ((iM2566 ^ i5) * (-30915)) ^ (-360747201);
                            i2 = 128825436;
                        }
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                    case 124878728:
                    case 1115377331:
                        if (C1711.m5736() <= 0) {
                            iM2566 = (C2105.m6981("֨ᩴ") ^ i4) * 29;
                            i = ((iM2566 ^ i5) * 1505) ^ 1582444910;
                            i2 = 861904794;
                        } else {
                            iM2566 = C2105.m6981("ۜ᩸") ^ i5;
                            i = ((iM2566 ^ i4) * 4801) ^ (-277668193);
                            i2 = 1029397750;
                        }
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                    case 548038445:
                    case 1989840952:
                        if (C2520.m8026()) {
                            iM2566 = (C2105.m6981("ᩴ֨") + i4) * (-113);
                            i = ((iM2566 ^ i5) * (-22149)) ^ (-492750987);
                            i2 = 1649928607;
                        } else {
                            iM2566 = (C0630.m2566("᩷᩸") ^ i5) * (-17);
                            i = ((iM2566 ^ i4) * 27881) ^ (-15034667);
                            i2 = 2045281372;
                        }
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                    case 737369457:
                    case 1639094227:
                        C1420.m4913();
                        if (C1711.m5736() > 0) {
                        }
                        iM2566 = (C2105.m6981("ᩴ֨") + i4) * (-113);
                        i = ((iM2566 ^ i5) * (-22149)) ^ (-492750987);
                        i2 = 1649928607;
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                    case 2003128850:
                    case 2014465283:
                        C21923.m49329();
                        break;
                    default:
                        if (C3537.f11231 >= 0) {
                            iM2566 = (C2105.m6981("֨ᩴ") ^ i4) * 29;
                            i = ((iM2566 ^ i5) * 1505) ^ 1582444910;
                            i2 = 861904794;
                        } else {
                            iM2566 = (i4 - C2105.m6981("۟ۨ")) * 75;
                            i = ((iM2566 ^ i5) * (-11763)) ^ 952797212;
                            i2 = 1950604534;
                        }
                        i8 = iM2566 ^ i2;
                        i6 = i;
                        break;
                }
                return;
            }
            iM6981 = C0630.m2566("ۜܳ") ^ i5;
            i6 = ((iM6981 ^ i4) * 23105) ^ 1644005551;
            i7 = -1754779042;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21653(String str) {
        f25172.m4558(str);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 47321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public C8177(l.AbstractC15440 r78, l.AbstractActivityC3346 r79, l.C4611 r80) {
        /*
            Method dump skipped, instruction units count: 4732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8177.<init>(l.ܶ᩵ܿ, l.ۗܺ᩷, l.ۙۧᩳ):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34121. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21656(l.AbstractActivityC3346 r50, l.C5355 r51) {
        /*
            Method dump skipped, instruction units count: 3412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8177.m21656(l.ۗܺ᩷, l.ۚ۫ܽ):void");
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21658(C8177 c8177, TextView textView, TextView textView2, TextView textView3, AbstractActivityC3346 abstractActivityC3346, View view, TextView textView4, TextView textView5, TextView textView6, TextView textView7, RunnableC13135 runnableC13135) {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        X509Certificate x509Certificate;
        C8177 c8178 = c8177;
        TextView textView8 = textView;
        TextView textView9 = textView7;
        int i5 = C4616.f14690;
        int i6 = C1128.f4106;
        int iM2566 = C0630.m2566("᩸ۧ") ^ i6;
        int i7 = ((iM2566 ^ i5) * (-7245)) ^ (-1545411454);
        String str = null;
        String sigAlgOID = null;
        String strM42244 = null;
        int i8 = iM2566 ^ 2117742537;
        int i9 = 0;
        int i10 = 753263046;
        X509Certificate x509Certificate2 = null;
        String str2 = null;
        String strM10748 = null;
        boolean zM4369 = false;
        while (true) {
            i10 = i8 ^ (i7 & (((i10 ^ i5) * 12369) >> 31));
            switch (i10) {
                case -2047232035:
                case -1680735667:
                    try {
                        strM42244 = C18118.m42244(sigAlgOID);
                        iM6981 = C2105.m6981("᩻ܺ") ^ i6;
                        i = ((iM6981 ^ i5) * 4723) ^ 1574084302;
                        i2 = 485381801;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } catch (Exception unused) {
                        int iM6983 = C2105.m6981("ܺ۠") ^ i6;
                        int i11 = ((iM6983 ^ i5) * 22579) ^ (-1382299247);
                        i8 = iM6983 ^ (-511743240);
                        c8178 = c8177;
                        textView9 = textView7;
                        i7 = i11;
                        textView8 = textView;
                    }
                    break;
                case -1981317669:
                case 1850332048:
                    if (C0483.f2088 >= 0) {
                        x509Certificate2 = x509Certificate2;
                        iM6982 = C0630.m2566("ᩳۜ") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-17953)) ^ (-1540697543);
                        i4 = 1712773760;
                        int i12 = iM6982 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i12;
                        c8178 = c8177;
                    }
                    x509Certificate2 = x509Certificate2;
                    iM6982 = C2105.m6981("ᩳ᩹") ^ i6;
                    i3 = ((iM6982 ^ i5) * (-21567)) ^ 635583882;
                    i4 = 1912530405;
                    int i13 = iM6982 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i13;
                    c8178 = c8177;
                    break;
                case -1899245725:
                case -891331840:
                    x509Certificate2 = x509Certificate2;
                    if (C4263.f13799 <= 0) {
                        iM6982 = C2105.m6981("ᩳ᩹") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                    } else {
                        iM6982 = C0630.m2566("ܰ᩶") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-32583)) ^ 205814975;
                        i4 = -1343328116;
                    }
                    int i14 = iM6982 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i14;
                    c8178 = c8177;
                    break;
                case -1777715396:
                case 479921333:
                    x509Certificate2 = x509Certificate2;
                    if (C0382.f1805) {
                        iM6982 = (C0630.m2566("᩸ۡ") + i6) * (-119);
                        i3 = ((iM6982 ^ i5) * 1087) ^ (-1987826474);
                        i4 = 276041100;
                    } else {
                        iM6982 = C2105.m6981("ᩳ᩹") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                    }
                    int i15 = iM6982 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i15;
                    c8178 = c8177;
                    break;
                case -1756728101:
                case -799332076:
                    if (!C4159.f13567) {
                        x509Certificate2 = x509Certificate2;
                        iM6982 = C2105.m6981("ᩳ᩹") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                        int i16 = iM6982 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i16;
                        c8178 = c8177;
                    } else {
                        iM6981 = C0630.m2566("۠᩵") ^ i5;
                        i = ((iM6981 ^ i6) * 24405) ^ (-1121525001);
                        i2 = 603904580;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1627199203:
                case -102794606:
                    i9 = 30714;
                    iM6982 = C2105.m6981("᩻ܳ") ^ i6;
                    i3 = ((iM6982 ^ i5) * 21333) ^ 1544767169;
                    i4 = 1671346351;
                    int i17 = iM6982 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i17;
                    c8178 = c8177;
                    break;
                case -1583767602:
                case 1709619309:
                    x509Certificate2 = x509Certificate2;
                    if (C1773.f6144 <= 0) {
                        iM6982 = C2105.m6981("ᩳ᩹") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                    } else {
                        iM6982 = (C2105.m6981("۟ۖ") + i5) * (-45);
                        i3 = ((iM6982 ^ i6) * 20289) ^ (-1107589772);
                        i4 = -1495727031;
                    }
                    int i18 = iM6982 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i18;
                    c8178 = c8177;
                    break;
                case -1547216420:
                case 1911339547:
                    C1294.m4372();
                    if (!C21923.m49329()) {
                        iM6981 = C2105.m6981("ۛ֡") ^ i5;
                        i = ((iM6981 ^ i6) * (-6803)) ^ 1282399577;
                        i2 = -153080334;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        x509Certificate2 = x509Certificate2;
                        iM6982 = C2105.m6981("ᩳ᩹") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                        int i19 = iM6982 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i19;
                        c8178 = c8177;
                    }
                    break;
                case -1486189054:
                case 1884924643:
                    x509Certificate2 = x509Certificate2;
                    if (C0050.m940() <= 0) {
                        iM6982 = C0630.m2566("᩺ܳ") ^ i5;
                        i3 = ((iM6982 ^ i6) * (-13973)) ^ (-652231184);
                        i4 = 1223767721;
                    } else {
                        iM6982 = C2105.m6981("ܰ᩻") ^ i5;
                        i3 = ((iM6982 ^ i6) * (-30783)) ^ (-1020755936);
                        i4 = -2027767739;
                    }
                    int i110 = iM6982 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i110;
                    c8178 = c8177;
                    break;
                case -1453003865:
                case 1855055745:
                    C22628.m50615();
                    if (C3245.f10203 <= 0) {
                        x509Certificate2 = x509Certificate2;
                        iM6982 = (i6 - C2105.m6981("ۙ֫")) * (-105);
                        i3 = ((iM6982 ^ i5) * 18703) ^ 1798631325;
                        i4 = -927818207;
                        int i111 = iM6982 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i111;
                        c8178 = c8177;
                    } else {
                        iM6981 = C2105.m6981("ۛ֡") ^ i5;
                        i = ((iM6981 ^ i6) * (-6803)) ^ 1282399577;
                        i2 = -153080334;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1326199251:
                case -369390634:
                    x509Certificate2 = x509Certificate2;
                    strM10748 = C3537.m10748(f25173, 248, 5, i9);
                    RunnableC1937.m6377(textView8, strM10748);
                    RunnableC1937.m6377(textView2, strM10748);
                    C1047.m3601(textView3, strM10748);
                    if (!C4159.f13567) {
                        iM6982 = C0630.m2566("᩺ܳ") ^ i5;
                        i3 = ((iM6982 ^ i6) * (-13973)) ^ (-652231184);
                        i4 = 1223767721;
                        int i112 = iM6982 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i112;
                        c8178 = c8177;
                    } else {
                        int iM2567 = C0630.m2566("֡᩶") ^ i5;
                        i7 = ((iM2567 ^ i6) * (-14117)) ^ (-1089605309);
                        x509Certificate2 = x509Certificate2;
                        i8 = iM2567 ^ 2003721744;
                        textView9 = textView7;
                    }
                    break;
                case -1145875223:
                case 1992102766:
                    x509Certificate2 = x509Certificate2;
                    if (C3911.f12484 >= 0) {
                        iM6982 = C0630.m2566("ᩳۜ") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-17953)) ^ (-1540697543);
                        i4 = 1712773760;
                    } else {
                        iM6982 = (i5 - C2105.m6981("ۧ᩵")) * (-65);
                        i3 = ((iM6982 ^ i6) * (-13067)) ^ (-1988358350);
                        i4 = 1546546156;
                    }
                    int i113 = iM6982 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i113;
                    c8178 = c8177;
                    break;
                case -980278000:
                case -555137546:
                    i9 = 15915;
                    iM6982 = C2105.m6981("᩻ܳ") ^ i6;
                    i3 = ((iM6982 ^ i5) * 21333) ^ 1544767169;
                    i4 = 1671346351;
                    int i114 = iM6982 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i114;
                    c8178 = c8177;
                    break;
                case -914818308:
                case 1474263360:
                    C5695.m16023();
                    if (C2167.f7158 < 0) {
                        iM6981 = C0630.m2566("۠᩵") ^ i5;
                        i = ((iM6981 ^ i6) * 24405) ^ (-1121525001);
                        i2 = 603904580;
                    } else {
                        iM6981 = (C2105.m6981("ۜۡ") + i6) * 63;
                        i = ((iM6981 ^ i5) * 21509) ^ 879120952;
                        i2 = -1149979089;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -906434229:
                case 220274849:
                    x509Certificate2 = x509Certificate2;
                    if (C2958.m9034() <= 0) {
                        iM6982 = (i6 - C2105.m6981("ۙ֫")) * (-105);
                        i3 = ((iM6982 ^ i5) * 18703) ^ 1798631325;
                        i4 = -927818207;
                    } else {
                        iM6982 = C0630.m2566("ۚܶ") ^ i5;
                        i3 = ((iM6982 ^ i6) * 13129) ^ (-110121897);
                        i4 = -1469003201;
                    }
                    int i115 = iM6982 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i115;
                    c8178 = c8177;
                    break;
                case -780255517:
                case 1059637174:
                    try {
                        RunnableC1937.m6377(textView8, str2);
                        RunnableC1937.m6377(textView2, C17283.m40572(x509Certificate2.getNotBefore().getTime()));
                        RunnableC1937.m6377(textView3, C17283.m40572(x509Certificate2.getNotAfter().getTime()));
                        try {
                            m21654(abstractActivityC3346, view, x509Certificate2);
                            int iM2568 = C0630.m2566("ۛ᩶") ^ i6;
                            i7 = ((iM2568 ^ i5) * 22753) ^ (-1005078881);
                            textView9 = textView7;
                            x509Certificate = x509Certificate2;
                            i8 = iM2568 ^ 1957327091;
                            x509Certificate2 = x509Certificate;
                        } catch (Exception unused2) {
                            int iM6984 = C2105.m6981("ܺ۠") ^ i6;
                            int i116 = ((iM6984 ^ i5) * 22579) ^ (-1382299247);
                            i8 = iM6984 ^ (-511743240);
                            c8178 = c8177;
                            textView9 = textView7;
                            i7 = i116;
                            textView8 = textView;
                        }
                    } catch (Exception unused3) {
                        int iM6985 = C2105.m6981("ܺ۠") ^ i6;
                        int i117 = ((iM6985 ^ i5) * 22579) ^ (-1382299247);
                        i8 = iM6985 ^ (-511743240);
                        c8178 = c8177;
                        textView9 = textView7;
                        i7 = i117;
                        textView8 = textView;
                        break;
                    }
                    break;
                case -652123612:
                case 426494389:
                    x509Certificate2 = x509Certificate2;
                    if (C1128.m3851() <= 0) {
                        iM6982 = (C2105.m6981("ۗ᩵") ^ i5) * 13;
                        i3 = ((iM6982 ^ i6) * (-31103)) ^ 1305259053;
                        i4 = -1506129323;
                    } else {
                        iM6982 = (C2105.m6981("۠ۡ") ^ i5) * 63;
                        i3 = ((iM6982 ^ i6) * 31393) ^ 901672109;
                        i4 = -28179962;
                    }
                    int i118 = iM6982 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i118;
                    c8178 = c8177;
                    break;
                case -649758432:
                case 1249946907:
                    if (RunnableC1108.f4040) {
                        iM6981 = (C2105.m6981("ۜۡ") + i6) * 63;
                        i = ((iM6981 ^ i5) * 21509) ^ 879120952;
                        i2 = -1149979089;
                    } else {
                        iM6981 = (C0630.m2566("ۨۜ") ^ i5) * 71;
                        i = ((iM6981 ^ i6) * 22715) ^ (-615345296);
                        i2 = 1956996752;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -552709949:
                case 1985458041:
                    x509Certificate2 = x509Certificate2;
                    short s = f25173[242];
                    if ((s * 11632) - ((s * s) + 33825856) <= 0) {
                        iM6982 = C0630.m2566("ۜ᩵") ^ i6;
                        i3 = ((iM6982 ^ i5) * 13023) ^ (-951912128);
                        i4 = -1752825396;
                    } else {
                        iM6982 = (i5 - C0630.m2566("᩷᩹")) * 99;
                        i3 = ((iM6982 ^ i6) * (-11067)) ^ 1188924988;
                        i4 = 666298156;
                    }
                    int i119 = iM6982 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i119;
                    c8178 = c8177;
                    break;
                case -503500241:
                case 2038017099:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C2105.m6981("۟ܽ") ^ i5;
                        i = ((iM6981 ^ i6) * (-15085)) ^ 1912946963;
                        i2 = 1173282828;
                    } else {
                        iM6981 = C0630.m2566("۠᩵") ^ i5;
                        i = ((iM6981 ^ i6) * 24405) ^ (-1121525001);
                        i2 = 603904580;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -127106681:
                case 1343405757:
                    x509Certificate2 = x509Certificate2;
                    if (C4263.f13799 <= 0) {
                        iM6982 = C2105.m6981("ᩳ᩹") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                    } else {
                        iM6982 = (C2105.m6981("ۤᩳ") ^ i6) * 43;
                        i3 = ((iM6982 ^ i5) * (-593)) ^ (-725227863);
                        i4 = 1668595404;
                    }
                    int i1110 = iM6982 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i1110;
                    c8178 = c8177;
                    break;
                case -114732317:
                case 1666573042:
                    C22628.m50615();
                    C11340.m28031();
                    break;
                case -797008:
                case 1371223027:
                    C2958.m9034();
                    if (C2167.f7158 < 0) {
                        x509Certificate2 = x509Certificate2;
                        iM6982 = C0630.m2566("᩺ܳ") ^ i5;
                        i3 = ((iM6982 ^ i6) * (-13973)) ^ (-652231184);
                        i4 = 1223767721;
                        int i1111 = iM6982 ^ i4;
                        textView9 = textView7;
                        i7 = i3;
                        x509Certificate2 = x509Certificate2;
                        textView8 = textView;
                        i8 = i1111;
                        c8178 = c8177;
                    } else {
                        iM6981 = (C2105.m6981("ۜۡ") + i6) * 63;
                        i = ((iM6981 ^ i5) * 21509) ^ 879120952;
                        i2 = -1149979089;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case 88468241:
                case 1747086535:
                    RunnableC1108.m3790();
                    iM6981 = C2105.m6981("۟ܽ") ^ i5;
                    i = ((iM6981 ^ i6) * (-15085)) ^ 1912946963;
                    i2 = 1173282828;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case 172747236:
                case 1065124669:
                    if (zM4369) {
                        int iM2569 = (i5 - C0630.m2566("ۛᩴ")) * 87;
                        i7 = ((iM2569 ^ i6) * 8057) ^ 415022641;
                        i8 = iM2569 ^ (-1400976516);
                    } else {
                        str2 = str;
                        int iM6986 = (i6 - C2105.m6981("ۨ֨")) * (-123);
                        x509Certificate = x509Certificate2;
                        i8 = iM6986 ^ 965207755;
                        i7 = ((iM6986 ^ i5) * (-9437)) ^ 1179750637;
                        x509Certificate2 = x509Certificate;
                    }
                    break;
                case 342453630:
                case 1154315493:
                    str2 = strM42244 == null ? sigAlgOID : strM42244;
                    int iM6987 = (i6 - C2105.m6981("ۨ֨")) * (-123);
                    x509Certificate = x509Certificate2;
                    i8 = iM6987 ^ 965207755;
                    i7 = ((iM6987 ^ i5) * (-9437)) ^ 1179750637;
                    x509Certificate2 = x509Certificate;
                    break;
                case 641007598:
                case 1990661826:
                    x509Certificate2 = x509Certificate2;
                    if (C3432.f10845 >= 0) {
                        iM6982 = C2105.m6981("ᩳ᩹") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-21567)) ^ 635583882;
                        i4 = 1912530405;
                    } else {
                        iM6982 = C2105.m6981("ۢ֨") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-22417)) ^ (-857527512);
                        i4 = -253207223;
                    }
                    int i1112 = iM6982 ^ i4;
                    textView9 = textView7;
                    i7 = i3;
                    x509Certificate2 = x509Certificate2;
                    textView8 = textView;
                    i8 = i1112;
                    c8178 = c8177;
                    break;
                case 719172105:
                case 1372932133:
                    C1047.m3601(textView4, strM10748);
                    C1128.m3853(textView5, 8);
                    C3746.m11360(textView6, 8);
                    RunnableC1937.m6377(textView9, strM10748);
                    textView9.setEnabled(false);
                    int iM25610 = C0630.m2566("ۛ᩶") ^ i6;
                    i7 = ((iM25610 ^ i5) * 22753) ^ (-1005078881);
                    textView9 = textView7;
                    x509Certificate = x509Certificate2;
                    i8 = iM25610 ^ 1957327091;
                    x509Certificate2 = x509Certificate;
                    break;
                case 796326894:
                case 1796834175:
                    X509Certificate x509Certificate3 = x509Certificate2;
                    try {
                        X509Certificate x509Certificate4 = (X509Certificate) CertificateFactory.getInstance(C11340.m28025(f25173, 243, 5, i9)).generateCertificate(new ByteArrayInputStream(c8178.f25174));
                        try {
                            String sigAlgName = x509Certificate4.getSigAlgName();
                            try {
                                sigAlgOID = x509Certificate4.getSigAlgOID();
                                zM4369 = C1294.m4369(sigAlgName, sigAlgOID);
                                int iM6988 = (i5 - C2105.m6981("ᩴۧ")) * 91;
                                i8 = iM6988 ^ (-907423685);
                                i7 = ((iM6988 ^ i6) * 30601) ^ 1264877974;
                                x509Certificate2 = x509Certificate4;
                                str = sigAlgName;
                                c8178 = c8177;
                                textView8 = textView;
                                textView9 = textView7;
                            } catch (Exception unused4) {
                                x509Certificate2 = x509Certificate4;
                                str = sigAlgName;
                                int iM6989 = C2105.m6981("ܺ۠") ^ i6;
                                int i1113 = ((iM6989 ^ i5) * 22579) ^ (-1382299247);
                                i8 = iM6989 ^ (-511743240);
                                c8178 = c8177;
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
                    c8178.f25175.m3837(c8178.f25174);
                    runnableC13135.run();
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
    
        if (l.C3019.f9544 < 0) goto L14;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m21660(final C8177 c8177, final DialogInterfaceC0206 dialogInterfaceC0206, View view, final TextView textView, final TextView textView2, final TextView textView3, final TextView textView4, final TextView textView5, final TextView textView6, final TextView textView7, final TextView textView8, final TextView textView9, final TextView textView10, final TextView textView11, final RunnableC11000 runnableC11000, TextView textView12, final TextView textView13, C2978 c2978, C2978 c2979, C4611 c4611) {
        int i;
        ExecutorService executorService;
        final C4611 c4612;
        int iM2566;
        int i2;
        ArrayList arrayList;
        C4611 c4613;
        int iM6981;
        int i3;
        int i4;
        int i5;
        C4611 c4614;
        int iM2567;
        int i6;
        int i7;
        int iM6982;
        int i8;
        C8177 c8178 = c8177;
        view = view;
        textView13 = textView13;
        final C4611 c4615 = c4611;
        View.OnClickListener onClickListener = null;
        int i9 = 0;
        Iterator itM9029 = null;
        int i10 = 460248769;
        int i11 = C3245.f10203;
        int i12 = C3683.f11629;
        int iM6983 = (C2105.m6981("֫ۘ") ^ i11) * (-91);
        View viewM3507 = null;
        ArrayList arrayList2 = null;
        int i13 = iM6983 ^ (-619999778);
        int i14 = ((iM6983 ^ i12) * 12299) ^ 108463723;
        int i15 = 0;
        ExecutorService executorService2 = null;
        while (true) {
            i10 = i13 ^ (i14 & (((i10 ^ i12) * 30053) >> 31));
            switch (i10) {
                case -2002372914:
                case -1390364063:
                    i = i15;
                    executorService = executorService2;
                    c4612 = c4615;
                    if (c4611.m13533() != null) {
                        iM2566 = (C0630.m2566("ܰܰ") + i11) * 71;
                        i14 = ((iM2566 ^ i12) * (-18419)) ^ (-69491305);
                        i2 = 864023288;
                    } else {
                        iM2566 = (i12 - C2105.m6981("۫ۧ")) * (-59);
                        i14 = ((iM2566 ^ i11) * (-15147)) ^ (-21889425);
                        i2 = 1585293301;
                    }
                    i13 = iM2566 ^ i2;
                    c4615 = c4612;
                    i15 = i;
                    executorService2 = executorService;
                    c8178 = c8177;
                    break;
                case -1952774883:
                case 663318966:
                    i5 = i15;
                    c4614 = c4615;
                    textView13 = textView13;
                    view = view;
                    C3746.m11360(C11340.m28028(view, C0630.m2566(C1504.m5177(f25173, 257, 3, i5)) ^ 2128927975), 0);
                    viewM3507 = C1005.m3507(view, C0630.m2566(ServiceConnectionC3453.m10568(f25173, 260, 3, i5)) ^ 2119526028);
                    arrayList2 = new ArrayList();
                    if (c4611.m13536() != null) {
                        iM2567 = C0630.m2566("ۛ᩺") ^ i12;
                        i6 = ((iM2567 ^ i11) * (-8529)) ^ (-326330869);
                        i7 = -1407623287;
                    } else {
                        iM2567 = C2105.m6981("ۜ۟") ^ i11;
                        i6 = ((iM2567 ^ i12) * 9545) ^ (-1871230828);
                        i7 = -129227806;
                    }
                    c4615 = c4614;
                    i13 = iM2567 ^ i7;
                    i14 = i6;
                    i15 = i5;
                    c8178 = c8177;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1808903707:
                case 1403887321:
                    c4613 = c4615;
                    textView13 = textView13;
                    view = view;
                    c8178 = c8178;
                    i15 = i15;
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C0630.m2566("᩻֡") ^ i12) * 33;
                        i3 = ((iM6981 ^ i11) * (-19855)) ^ 127802;
                        i4 = -2131500139;
                    } else {
                        iM6981 = C0630.m2566("֫֡") ^ i12;
                        i3 = ((iM6981 ^ i11) * (-14011)) ^ (-720945776);
                        i4 = 909640589;
                    }
                    i13 = iM6981 ^ i4;
                    c4615 = c4613;
                    i14 = i3;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1757781353:
                case -1507292249:
                    c8178 = c8177;
                    c8178.f25174 = c4611.m13528();
                    int iM2568 = C0630.m2566("ۖ֫") ^ i11;
                    i14 = ((iM2568 ^ i12) * (-6539)) ^ (-863136176);
                    c4615 = c4615;
                    i13 = iM2568 ^ 1609056781;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1757695007:
                case -1032175274:
                    c4613 = c4615;
                    textView13 = textView13;
                    view = view;
                    c8178 = c8178;
                    i15 = i15;
                    if (C0483.f2088 >= 0) {
                        iM6981 = (i11 - C0630.m2566("ܰܺ")) * 119;
                        i3 = ((iM6981 ^ i12) * (-26387)) ^ (-234615178);
                        i4 = 36042365;
                    } else {
                        iM6981 = C2105.m6981("ܺܺ") ^ i12;
                        i3 = ((iM6981 ^ i11) * 29513) ^ (-1067011291);
                        i4 = -320853520;
                    }
                    i13 = iM6981 ^ i4;
                    c4615 = c4613;
                    i14 = i3;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1744331018:
                case 1486778523:
                    i5 = i15;
                    c4614 = c4615;
                    TextView textView14 = (TextView) C11340.m28028(viewM3507, C2105.m6981(C1916.m6311(f25173, 266, 3, i5)) ^ 2130085282);
                    C0964.m3404(textView14, new C18055(0, c4614));
                    C1916.m6307(arrayList2, textView14);
                    view = view;
                    textView13 = textView13;
                    iM2567 = C2105.m6981("ۜ۟") ^ i11;
                    i6 = ((iM2567 ^ i12) * 9545) ^ (-1871230828);
                    i7 = -129227806;
                    c4615 = c4614;
                    i13 = iM2567 ^ i7;
                    i14 = i6;
                    i15 = i5;
                    c8178 = c8177;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1730775193:
                case 592289050:
                    TextView textView15 = (TextView) C2272.m7513(itM9029);
                    C3746.m11360(textView15, i9);
                    C2126.m7039(textView15, onClickListener);
                    arrayList = arrayList2;
                    int iM6984 = (C2105.m6981("۬ܰ") ^ i12) * (-45);
                    i14 = ((iM6984 ^ i11) * 15235) ^ (-157982622);
                    i13 = iM6984 ^ 1161681581;
                    c4615 = c4611;
                    i15 = i15;
                    executorService2 = executorService2;
                    arrayList2 = arrayList;
                    viewM3507 = viewM3507;
                    c8178 = c8177;
                    break;
                case -1714879011:
                case 103124865:
                    i = i15;
                    executorService = executorService2;
                    c4612 = c4615;
                    if (c4611.m13538() != null) {
                        iM2566 = C0630.m2566("ۤ᩷") ^ i11;
                        i14 = ((iM2566 ^ i12) * (-21251)) ^ (-1578121421);
                        i2 = 2065853102;
                    } else {
                        iM2566 = (C2105.m6981("᩺ܿ") ^ i12) * (-71);
                        i14 = ((iM2566 ^ i11) * (-30063)) ^ 976352367;
                        i2 = -1480875418;
                    }
                    i13 = iM2566 ^ i2;
                    c4615 = c4612;
                    i15 = i;
                    executorService2 = executorService;
                    c8178 = c8177;
                    break;
                case -1676300077:
                case 692069359:
                    C1294.m4372();
                    break;
                case -1644556544:
                case 1344067839:
                    i15 = 44195;
                    int iM6985 = C2105.m6981("ۚۤ") ^ i11;
                    int i16 = ((iM6985 ^ i12) * (-25653)) ^ 1373979380;
                    i13 = iM6985 ^ (-1961358339);
                    c4615 = c4615;
                    i14 = i16;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1507783928:
                case -622487396:
                    C3432.m10477();
                    if (C4263.f13799 > 0) {
                        c4613 = c4615;
                        textView13 = textView13;
                        view = view;
                        c8178 = c8178;
                        i15 = i15;
                        iM6981 = C0630.m2566("ᩳ᩵") ^ i12;
                        i3 = ((iM6981 ^ i11) * 8583) ^ (-1377553683);
                        i4 = 1754349404;
                        i13 = iM6981 ^ i4;
                        c4615 = c4613;
                        i14 = i3;
                        i15 = i15;
                        c8178 = c8178;
                        view = view;
                        textView13 = textView13;
                    }
                    c4613 = c4615;
                    textView13 = textView13;
                    view = view;
                    c8178 = c8178;
                    i15 = i15;
                    iM6981 = (i11 - C0630.m2566("ܰܺ")) * 119;
                    i3 = ((iM6981 ^ i12) * (-26387)) ^ (-234615178);
                    i4 = 36042365;
                    i13 = iM6981 ^ i4;
                    c4615 = c4613;
                    i14 = i3;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1453225761:
                case -741898994:
                    c4613 = c4615;
                    textView13 = textView13;
                    view = view;
                    c8178 = c8178;
                    i15 = i15;
                    if (c4611.m13537()) {
                        iM6981 = C0630.m2566("۫ۙ") ^ i11;
                        i3 = ((iM6981 ^ i12) * 17325) ^ (-236709354);
                        i4 = -741201105;
                    } else {
                        iM6981 = C2105.m6981("۟ۚ") ^ i12;
                        i3 = ((iM6981 ^ i11) * 30269) ^ (-1563643290);
                        i4 = -762529961;
                    }
                    i13 = iM6981 ^ i4;
                    c4615 = c4613;
                    i14 = i3;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1305316382:
                case 1158231942:
                    c4613 = c4615;
                    textView13 = textView13;
                    view = view;
                    c8178 = c8178;
                    i15 = i15;
                    short s = f25173[253];
                    int i17 = (s * s) + 22231225;
                    int i18 = s + 4715;
                    if ((i17 + i17) - (i18 * i18) < 0) {
                        iM6981 = C0630.m2566("ۗۧ") ^ i12;
                        i3 = ((iM6981 ^ i11) * 27363) ^ 646092096;
                        i4 = -1533295646;
                    } else {
                        iM6981 = C2105.m6981("ܽۤ") ^ i12;
                        i3 = ((iM6981 ^ i11) * 4507) ^ (-1397406701);
                        i4 = 1118278991;
                    }
                    i13 = iM6981 ^ i4;
                    c4615 = c4613;
                    i14 = i3;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1239370779:
                case 135550592:
                    i15 = 63973;
                    int iM6986 = C2105.m6981("ۚۤ") ^ i11;
                    int i19 = ((iM6986 ^ i12) * (-25653)) ^ 1373979380;
                    i13 = iM6986 ^ (-1961358339);
                    c4615 = c4615;
                    i14 = i19;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1130841056:
                case 1558397958:
                    TextView textView16 = (TextView) C1005.m3507(viewM3507, C0630.m2566(C3432.m10488(f25173, b.g, 3, i15)) ^ 2118231615);
                    C4263.m12823(textView16, new InterfaceC6141() { // from class: l.۫۬ܽ
                        @Override // l.InterfaceC6141
                        public final Object get() {
                            return c4615.m13533();
                        }
                    });
                    C1916.m6307(arrayList2, textView16);
                    i = i15;
                    executorService = executorService2;
                    c4612 = c4615;
                    iM2566 = (i12 - C2105.m6981("۫ۧ")) * (-59);
                    i14 = ((iM2566 ^ i11) * (-15147)) ^ (-21889425);
                    i2 = 1585293301;
                    i13 = iM2566 ^ i2;
                    c4615 = c4612;
                    i15 = i;
                    executorService2 = executorService;
                    c8178 = c8177;
                    break;
                case -1027639498:
                case 1096349049:
                    c4613 = c4615;
                    textView13 = textView13;
                    view = view;
                    c8178 = c8178;
                    i15 = i15;
                    if (C2520.m8026()) {
                        iM6981 = (C2105.m6981("ۡ᩸") ^ i12) * 7;
                        i3 = ((iM6981 ^ i11) * 22123) ^ (-1715018422);
                        i4 = 1763900511;
                    } else {
                        iM6981 = C0630.m2566("᩷ᩴ") ^ i11;
                        i3 = ((iM6981 ^ i12) * 25225) ^ 1067980159;
                        i4 = 1259891746;
                    }
                    i13 = iM6981 ^ i4;
                    c4615 = c4613;
                    i14 = i3;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case -1027378817:
                case 1963524558:
                    C2167.m7155();
                    if (C1773.m5908() > 0) {
                        c4613 = c4615;
                        textView13 = textView13;
                        view = view;
                        c8178 = c8178;
                        i15 = i15;
                        iM6981 = (C2105.m6981("ۡ᩸") ^ i12) * 7;
                        i3 = ((iM6981 ^ i11) * 22123) ^ (-1715018422);
                        i4 = 1763900511;
                        i13 = iM6981 ^ i4;
                        c4615 = c4613;
                        i14 = i3;
                        i15 = i15;
                        c8178 = c8178;
                        view = view;
                        textView13 = textView13;
                    } else {
                        iM6982 = C2105.m6981("ܿ᩹") ^ i12;
                        i14 = ((iM6982 ^ i11) * (-14803)) ^ 226415185;
                        i8 = -503651769;
                        i13 = iM6982 ^ i8;
                        i10 = i10;
                    }
                    break;
                case -1001172198:
                case 1608236520:
                    final C4611 c4616 = c4615;
                    C0630.m2560(executorService2, new Runnable() { // from class: l.ۛ۬ܽ
                        {
                            int i20 = -1122510538;
                            int i21 = ViewOnClickListenerC1958.f6529;
                            int i22 = C22628.f73083;
                            int iM2569 = C0630.m2566("᩻᩻") ^ i22;
                            int i23 = ((iM2569 ^ i21) * (-10863)) ^ (-923106433);
                            int i24 = -300097177;
                            while (true) {
                                i20 = ((((i20 ^ i21) * (-7951)) >> 31) & i23) ^ (iM2569 ^ i24);
                                switch (i20) {
                                    case -2064247752:
                                    case 1451344975:
                                        if (C0050.m940() <= 0) {
                                            iM2569 = C0630.m2566("ۤܽ") ^ i21;
                                            i23 = ((iM2569 ^ i22) * (-16091)) ^ (-813298623);
                                            i24 = -1345488882;
                                        } else {
                                            iM2569 = (C2105.m6981("ۜۘ") ^ i22) * (-121);
                                            i23 = ((iM2569 ^ i21) * (-321)) ^ (-1422098144);
                                            i24 = -1538487188;
                                        }
                                        break;
                                    case -1832499918:
                                    case -1180104052:
                                        C1420.m4913();
                                        C1294.m4372();
                                        throw new RuntimeException();
                                    case -1548615412:
                                    case 13483074:
                                        if (C1047.f3863 >= 0) {
                                            iM2569 = C0630.m2566("ۤܽ") ^ i21;
                                            i23 = ((iM2569 ^ i22) * (-16091)) ^ (-813298623);
                                            i24 = -1345488882;
                                        } else {
                                            iM2569 = (C0630.m2566("ۛ֨") ^ i21) * (-125);
                                            i23 = ((iM2569 ^ i22) * (-9439)) ^ 958914982;
                                            i24 = 1536819898;
                                        }
                                        break;
                                    case -1322160140:
                                    case -657232353:
                                        if (C21923.f70183 != 0) {
                                            iM2569 = (i22 - C0630.m2566("ۚۚ")) * 63;
                                            i23 = ((iM2569 ^ i21) * (-2493)) ^ 1543814720;
                                            i24 = -798033873;
                                        } else {
                                            iM2569 = C2105.m6981("ܿܳ") ^ i22;
                                            i23 = ((iM2569 ^ i21) * (-29349)) ^ (-1762239995);
                                            i24 = -1918401262;
                                        }
                                        break;
                                    case -1203477467:
                                    case 1324071200:
                                        if (C3537.f11231 >= 0) {
                                            iM2569 = (i22 - C0630.m2566("ۚۚ")) * 63;
                                            i23 = ((iM2569 ^ i21) * (-2493)) ^ 1543814720;
                                            i24 = -798033873;
                                        } else {
                                            iM2569 = (C2105.m6981("ܶܽ") ^ i21) * (-127);
                                            i23 = ((iM2569 ^ i22) * 28789) ^ 1208078633;
                                            i24 = -1285603980;
                                        }
                                        break;
                                    case -1183574614:
                                    case -720555573:
                                        if (!C2126.f7087) {
                                            iM2569 = (i21 - C2105.m6981("ۤۘ")) * 123;
                                            i23 = ((iM2569 ^ i22) * 28267) ^ 315564002;
                                            i24 = 95819168;
                                        } else {
                                            iM2569 = (i22 - C0630.m2566("ۚۚ")) * 63;
                                            i23 = ((iM2569 ^ i21) * (-2493)) ^ 1543814720;
                                            i24 = -798033873;
                                        }
                                        break;
                                    case -1057163626:
                                    case -911757275:
                                        if (C3537.f11231 >= 0) {
                                            iM2569 = C0630.m2566("ۗ᩺") ^ i22;
                                            i23 = ((iM2569 ^ i21) * 2335) ^ (-192845336);
                                            i24 = -521217621;
                                        } else {
                                            iM2569 = C2105.m6981("ᩳ᩶") ^ i21;
                                            i23 = ((iM2569 ^ i22) * 31205) ^ 763240570;
                                            i24 = 185987813;
                                        }
                                        break;
                                    case -871742795:
                                    case 1761865489:
                                        C4263.m12819();
                                        if (C1504.f5354) {
                                            iM2569 = (C0630.m2566("۫ۡ") ^ i21) * (-81);
                                            i23 = ((iM2569 ^ i22) * (-32331)) ^ 2142538622;
                                            i24 = -1398061796;
                                        } else {
                                            iM2569 = (i22 - C0630.m2566("ۚۚ")) * 63;
                                            i23 = ((iM2569 ^ i21) * (-2493)) ^ 1543814720;
                                            i24 = -798033873;
                                        }
                                        break;
                                    case -865215149:
                                    case 976784817:
                                        C2167.m7155();
                                        C11340.m28031();
                                        iM2569 = (i22 - C0630.m2566("ۚۚ")) * 63;
                                        i23 = ((iM2569 ^ i21) * (-2493)) ^ 1543814720;
                                        i24 = -798033873;
                                        break;
                                    case -657650528:
                                    case 1363069321:
                                        if (C3683.f11629 >= 0) {
                                            iM2569 = C0630.m2566("ۤܽ") ^ i21;
                                            i23 = ((iM2569 ^ i22) * (-16091)) ^ (-813298623);
                                            i24 = -1345488882;
                                        } else {
                                            iM2569 = (C2105.m6981("ۧۘ") ^ i22) * 19;
                                            i23 = ((iM2569 ^ i21) * (-5373)) ^ 926111603;
                                            i24 = -352510219;
                                        }
                                        break;
                                    case -604198684:
                                    case 1678396783:
                                        if (C0382.f1805) {
                                            iM2569 = C0630.m2566("ᩴ۫") ^ i22;
                                            i23 = ((iM2569 ^ i21) * 10803) ^ 865251767;
                                            i24 = 892174422;
                                        } else {
                                            iM2569 = C0630.m2566("ۗ᩺") ^ i22;
                                            i23 = ((iM2569 ^ i21) * 2335) ^ (-192845336);
                                            i24 = -521217621;
                                        }
                                        break;
                                    case -237045884:
                                    case 1890628098:
                                        if (C1420.f5096 <= 0) {
                                            iM2569 = (i21 - C2105.m6981("ۤۘ")) * 123;
                                            i23 = ((iM2569 ^ i22) * 28267) ^ 315564002;
                                            i24 = 95819168;
                                        } else {
                                            iM2569 = (C2105.m6981("ۚۛ") ^ i21) * 75;
                                            i23 = ((iM2569 ^ i22) * 31539) ^ (-1547217676);
                                            i24 = 579879850;
                                        }
                                        break;
                                    case -173733824:
                                    case -68288288:
                                        if (!C1005.f3721) {
                                            iM2569 = C0630.m2566("ۗ᩺") ^ i22;
                                            i23 = ((iM2569 ^ i21) * 2335) ^ (-192845336);
                                            i24 = -521217621;
                                        } else {
                                            iM2569 = (i21 - C2105.m6981("ۤۘ")) * 123;
                                            i23 = ((iM2569 ^ i22) * 28267) ^ 315564002;
                                            i24 = 95819168;
                                        }
                                        break;
                                    case 353644355:
                                    case 1195070387:
                                        return;
                                    case 587248565:
                                    case 1764837383:
                                        if (C21923.m49329()) {
                                            iM2569 = (i21 - C2105.m6981("ۤۘ")) * 123;
                                            i23 = ((iM2569 ^ i22) * 28267) ^ 315564002;
                                            i24 = 95819168;
                                        } else {
                                            iM2569 = (C0630.m2566("ܽ᩸") + i22) * 115;
                                            i23 = ((iM2569 ^ i21) * 18779) ^ 880662796;
                                            i24 = -53774209;
                                        }
                                        break;
                                    default:
                                        if (C3245.m9925() != 0) {
                                            iM2569 = C0630.m2566("ۗ᩺") ^ i22;
                                            i23 = ((iM2569 ^ i21) * 2335) ^ (-192845336);
                                            i24 = -521217621;
                                        } else {
                                            iM2569 = (C2105.m6981("ᩴۨ") + i21) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i23 = ((iM2569 ^ i22) * 8973) ^ 1099971689;
                                            i24 = -758169302;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C4611 c4617 = null;
                            final DialogInterfaceC0206 dialogInterfaceC0207 = null;
                            final TextView textView17 = null;
                            final Throwable th = null;
                            C22250 c22250M13527 = null;
                            int i20 = -1921300858;
                            int i21 = C1294.f4556;
                            int i22 = C0630.f2410;
                            int iM6987 = C2105.m6981("᩺ܳ") ^ i22;
                            int i23 = ((iM6987 ^ i21) * (-19677)) ^ 1422264791;
                            int i24 = -1775407248;
                            while (true) {
                                i20 = ((((i20 ^ i21) * 27089) >> 31) & i23) ^ (iM6987 ^ i24);
                                switch (i20) {
                                    case -2050737006:
                                    case -1816841610:
                                        if (c22250M13527 != null) {
                                            iM6987 = C2105.m6981("ۧۡ") ^ i21;
                                            i23 = ((iM6987 ^ i22) * 21647) ^ (-1602754054);
                                            i24 = -856777082;
                                        } else {
                                            iM6987 = (i21 - C0630.m2566("ۧᩴ")) * 11;
                                            i23 = ((iM6987 ^ i22) * (-27885)) ^ (-555376642);
                                            i24 = 209145724;
                                        }
                                        break;
                                    case -2008280148:
                                    case -1994248106:
                                        break;
                                    case -1984162065:
                                    case 663692265:
                                        C7811.m20844();
                                        C3683.m11222();
                                        iM6987 = (C0630.m2566("֡᩹") ^ i22) * (-117);
                                        i23 = ((iM6987 ^ i21) * 13223) ^ 1970256639;
                                        i24 = 640663137;
                                        break;
                                    case -1872818667:
                                    case 1295550029:
                                        if (C1711.m5736() > 0) {
                                            iM6987 = C2105.m6981("᩸᩵") ^ i21;
                                            i23 = ((iM6987 ^ i22) * 32735) ^ 1889190774;
                                            i24 = 649588281;
                                        } else {
                                            iM6987 = (C0630.m2566("֡᩹") ^ i22) * (-117);
                                            i23 = ((iM6987 ^ i21) * 13223) ^ 1970256639;
                                            i24 = 640663137;
                                        }
                                        break;
                                    case -1811102399:
                                    case 640864779:
                                        if (C1504.f5354) {
                                            iM6987 = C0630.m2566("ܳᩴ") ^ i21;
                                            i23 = ((iM6987 ^ i22) * (-2203)) ^ (-911734593);
                                            i24 = -1094594321;
                                        } else {
                                            iM6987 = C2105.m6981("ۤ᩸") ^ i21;
                                            i23 = ((iM6987 ^ i22) * (-17887)) ^ (-526299978);
                                            i24 = -1510564796;
                                        }
                                        break;
                                    case -1420662709:
                                    case 42729747:
                                        RunnableC0588.m2441();
                                        break;
                                    case -1406354759:
                                    case 772285788:
                                        C0237.m1492(new Runnable() { // from class: l.ܰ۬ܽ
                                            {
                                                int i25 = 110513279;
                                                int i26 = AbstractC2021.f6743;
                                                int i27 = ViewOnClickListenerC1958.f6529;
                                                int iM6988 = C2105.m6981("ۖۛ") ^ i26;
                                                int i28 = ((iM6988 ^ i27) * (-10929)) ^ (-683383587);
                                                int i29 = 1329740638;
                                                while (true) {
                                                    i25 = ((((i25 ^ i27) * 6929) >> 31) & i28) ^ (iM6988 ^ i29);
                                                    switch (i25) {
                                                        case -2018745666:
                                                        case -564389784:
                                                            if (C0050.f910 >= 0) {
                                                                iM6988 = (C2105.m6981("᩻᩻") + i26) * (-107);
                                                                i28 = ((iM6988 ^ i27) * 21433) ^ 1987707697;
                                                                i29 = -740070585;
                                                            } else {
                                                                iM6988 = C0630.m2566("֫֫") ^ i27;
                                                                i28 = ((iM6988 ^ i26) * 9677) ^ 2104642683;
                                                                i29 = -986880296;
                                                            }
                                                            break;
                                                        case -1911642661:
                                                        case -1404422345:
                                                            if (C3683.f11629 >= 0) {
                                                                iM6988 = (C0630.m2566("ܰ֡") + i26) * 119;
                                                                i28 = ((iM6988 ^ i27) * 32075) ^ (-2147300941);
                                                                i29 = -775753059;
                                                            } else {
                                                                iM6988 = C2105.m6981("ܺ᩷") ^ i26;
                                                                i28 = ((iM6988 ^ i27) * (-28361)) ^ 1512177592;
                                                                i29 = -97642624;
                                                            }
                                                            break;
                                                        case -1903820053:
                                                        case -1737485071:
                                                            C4159.m12565();
                                                            if (C3746.f11829 > 0) {
                                                                iM6988 = C0630.m2566("᩶ۗ") ^ i27;
                                                                i28 = ((iM6988 ^ i26) * 31789) ^ 547507482;
                                                                i29 = 337763122;
                                                            } else {
                                                                iM6988 = (C2105.m6981("᩻᩻") + i26) * (-107);
                                                                i28 = ((iM6988 ^ i27) * 21433) ^ 1987707697;
                                                                i29 = -740070585;
                                                            }
                                                            break;
                                                        case -1786029024:
                                                        case 1595769910:
                                                            if (C4075.f12947 >= 0) {
                                                                iM6988 = (C0630.m2566("ᩴ۫") + i26) * 31;
                                                                i28 = ((iM6988 ^ i27) * 28217) ^ 2086820508;
                                                                i29 = -424175618;
                                                            } else {
                                                                iM6988 = C2105.m6981("ܺ᩻") ^ i26;
                                                                i28 = ((iM6988 ^ i27) * 30509) ^ 1396534248;
                                                                i29 = -25858174;
                                                            }
                                                            break;
                                                        case -1715727560:
                                                        case 1070115341:
                                                            if (!C2126.f7087) {
                                                                iM6988 = (C0630.m2566("ܰ֡") + i26) * 119;
                                                                i28 = ((iM6988 ^ i27) * 32075) ^ (-2147300941);
                                                                i29 = -775753059;
                                                            } else {
                                                                iM6988 = C2105.m6981("ۘۗ") ^ i27;
                                                                i28 = ((iM6988 ^ i26) * 27139) ^ (-38296841);
                                                                i29 = 1201411961;
                                                            }
                                                            break;
                                                        case -1461773696:
                                                        case 2040207417:
                                                            if (C0714.f2697 >= 0) {
                                                                iM6988 = (C0630.m2566("ܰ֡") + i26) * 119;
                                                                i28 = ((iM6988 ^ i27) * 32075) ^ (-2147300941);
                                                                i29 = -775753059;
                                                            } else {
                                                                iM6988 = (i26 - C0630.m2566("۫ۢ")) * 35;
                                                                i28 = ((iM6988 ^ i27) * 663) ^ 251836099;
                                                                i29 = 124732524;
                                                            }
                                                            break;
                                                        case -1400610178:
                                                        case 1056995049:
                                                            if (C4263.m12819() >= 0) {
                                                                iM6988 = (C0630.m2566("ܰ֡") + i26) * 119;
                                                                i28 = ((iM6988 ^ i27) * 32075) ^ (-2147300941);
                                                                i29 = -775753059;
                                                            } else {
                                                                iM6988 = C0630.m2566("۠۟") ^ i27;
                                                                i28 = ((iM6988 ^ i26) * (-6235)) ^ 1886656652;
                                                                i29 = 139959681;
                                                            }
                                                            break;
                                                        case -1359248159:
                                                        case 1558964169:
                                                            if (C0964.f3626 != 0) {
                                                                iM6988 = (C2105.m6981("᩻᩻") + i26) * (-107);
                                                                i28 = ((iM6988 ^ i27) * 21433) ^ 1987707697;
                                                                i29 = -740070585;
                                                            } else {
                                                                iM6988 = C2105.m6981("ۜ۠") ^ i26;
                                                                i28 = ((iM6988 ^ i27) * 24557) ^ (-1915283825);
                                                                i29 = -1670956858;
                                                            }
                                                            break;
                                                        case -892506943:
                                                        case -825272770:
                                                            if (C0798.m2998() != 0) {
                                                                iM6988 = (C0630.m2566("ᩴ۫") + i26) * 31;
                                                                i28 = ((iM6988 ^ i27) * 28217) ^ 2086820508;
                                                                i29 = -424175618;
                                                            } else {
                                                                iM6988 = (C2105.m6981("᩸۠") + i27) * (-109);
                                                                i28 = ((iM6988 ^ i26) * (-6693)) ^ 504330305;
                                                                i29 = 70291424;
                                                            }
                                                            break;
                                                        case -879875417:
                                                        case 331311537:
                                                            C7811.m20844();
                                                            C2958.m9034();
                                                            iM6988 = (C2105.m6981("᩻᩻") + i26) * (-107);
                                                            i28 = ((iM6988 ^ i27) * 21433) ^ 1987707697;
                                                            i29 = -740070585;
                                                            break;
                                                        case -373168426:
                                                        case 792872621:
                                                            return;
                                                        case -279736191:
                                                        case 380681304:
                                                            C0714.m2805();
                                                            C1711.m5736();
                                                            throw new RuntimeException();
                                                        case 108033938:
                                                        case 1551163977:
                                                            if (C3245.f10203 <= 0) {
                                                                iM6988 = C0630.m2566("᩶ۗ") ^ i27;
                                                                i28 = ((iM6988 ^ i26) * 31789) ^ 547507482;
                                                                i29 = 337763122;
                                                            } else {
                                                                iM6988 = C0630.m2566("ܿ᩺") ^ i26;
                                                                i28 = ((iM6988 ^ i27) * 23599) ^ 207378185;
                                                                i29 = -128847751;
                                                            }
                                                            break;
                                                        case 434662936:
                                                        case 1404013594:
                                                            if (RunnableC1937.f6483 >= 0) {
                                                                iM6988 = (C2105.m6981("᩻᩻") + i26) * (-107);
                                                                i28 = ((iM6988 ^ i27) * 21433) ^ 1987707697;
                                                                i29 = -740070585;
                                                            } else {
                                                                iM6988 = (C2105.m6981("᩷۬") + i27) * 5;
                                                                i28 = ((iM6988 ^ i26) * 10353) ^ (-1417118247);
                                                                i29 = 826868124;
                                                            }
                                                            break;
                                                        case 854466319:
                                                        case 1073824804:
                                                            C0630.m2564();
                                                            if (!C1504.f5354) {
                                                                iM6988 = C2105.m6981("ۘۗ") ^ i27;
                                                                i28 = ((iM6988 ^ i26) * 27139) ^ (-38296841);
                                                                i29 = 1201411961;
                                                            } else {
                                                                iM6988 = (C2105.m6981("᩻᩻") + i26) * (-107);
                                                                i28 = ((iM6988 ^ i27) * 21433) ^ 1987707697;
                                                                i29 = -740070585;
                                                            }
                                                            break;
                                                        default:
                                                            if (C5695.f17556 >= 0) {
                                                                iM6988 = (C0630.m2566("ܰ֡") + i26) * 119;
                                                                i28 = ((iM6988 ^ i27) * 32075) ^ (-2147300941);
                                                                i29 = -775753059;
                                                            } else {
                                                                iM6988 = C0630.m2566("֫ۢ") ^ i27;
                                                                i28 = ((iM6988 ^ i26) * 14119) ^ (-771889223);
                                                                i29 = -634538117;
                                                            }
                                                            break;
                                                    }
                                                }
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Throwable th2 = null;
                                                String strM1959 = null;
                                                TextView textView18 = null;
                                                int i25 = 347159303;
                                                int i26 = C3245.f10203;
                                                int i27 = ViewOnClickListenerC1958.f6529;
                                                int iM2569 = C0630.m2566("ۡۤ") ^ i26;
                                                int i28 = ((iM2569 ^ i27) * 26793) ^ 235889243;
                                                int i29 = 1648715609;
                                                while (true) {
                                                    i25 = ((((i25 ^ i27) * 21211) >> 31) & i28) ^ (iM2569 ^ i29);
                                                    switch (i25) {
                                                        case -2056858243:
                                                        case -852799051:
                                                            if (RunnableC1108.f4040) {
                                                                iM2569 = (C0630.m2566("ܺ᩹") + i26) * 127;
                                                                i28 = ((iM2569 ^ i27) * 18433) ^ 801613085;
                                                                i29 = -396972459;
                                                            } else {
                                                                iM2569 = (i27 - C0630.m2566("֡᩶")) * (-119);
                                                                i28 = ((iM2569 ^ i26) * (-4113)) ^ (-672973584);
                                                                i29 = 366162594;
                                                            }
                                                            break;
                                                        case -1885834628:
                                                        case -1035941626:
                                                            if (C0050.f910 < 0) {
                                                                iM2569 = (C2105.m6981("ܶۨ") + i26) * 85;
                                                                i28 = ((iM2569 ^ i27) * (-5247)) ^ (-1138232643);
                                                                i29 = -390074841;
                                                            } else {
                                                                iM2569 = (i26 - C0630.m2566("ܶܽ")) * (-49);
                                                                i28 = ((iM2569 ^ i27) * 23731) ^ 791760224;
                                                                i29 = 1245182738;
                                                            }
                                                            break;
                                                        case -1848162856:
                                                        case -505073107:
                                                            if (C1420.f5096 <= 0) {
                                                                iM2569 = (i27 - C0630.m2566("֡᩶")) * (-119);
                                                                i28 = ((iM2569 ^ i26) * (-4113)) ^ (-672973584);
                                                                i29 = 366162594;
                                                            } else {
                                                                iM2569 = (i27 - C0630.m2566("۠᩷")) * (-101);
                                                                i28 = ((iM2569 ^ i26) * 8801) ^ (-1513479360);
                                                                i29 = 1260939677;
                                                            }
                                                            break;
                                                        case -1708576699:
                                                        case -1201182419:
                                                            RunnableC0588.m2441();
                                                            if (C2167.f7158 < 0) {
                                                                iM2569 = (i26 - C0630.m2566("ܶܽ")) * (-49);
                                                                i28 = ((iM2569 ^ i27) * 23731) ^ 791760224;
                                                                i29 = 1245182738;
                                                            } else {
                                                                iM2569 = (i27 - C0630.m2566("֡᩶")) * (-119);
                                                                i28 = ((iM2569 ^ i26) * (-4113)) ^ (-672973584);
                                                                i29 = 366162594;
                                                            }
                                                            break;
                                                        case -1159670599:
                                                        case 1139375830:
                                                            if (C1005.f3721) {
                                                                iM2569 = (C2105.m6981("ۨۚ") + i26) * (-69);
                                                                i28 = ((iM2569 ^ i27) * (-10013)) ^ (-919492924);
                                                                i29 = -788736741;
                                                            } else {
                                                                iM2569 = C2105.m6981("ۧ۬") ^ i26;
                                                                i28 = ((iM2569 ^ i27) * 32243) ^ (-1278309500);
                                                                i29 = 600322911;
                                                            }
                                                            break;
                                                        case -763160005:
                                                        case 116364556:
                                                            if (AbstractC2021.f6743 <= 0) {
                                                                iM2569 = (C2105.m6981("ܶۨ") + i26) * 85;
                                                                i28 = ((iM2569 ^ i27) * (-5247)) ^ (-1138232643);
                                                                i29 = -390074841;
                                                            } else {
                                                                iM2569 = (C2105.m6981("ۡ֡") + i26) * (-45);
                                                                i28 = ((iM2569 ^ i27) * (-9011)) ^ 1665071090;
                                                                i29 = -1139690990;
                                                            }
                                                            break;
                                                        case -739230867:
                                                        case 1880962176:
                                                            textView18 = textView17;
                                                            if (C3537.f11231 >= 0) {
                                                                iM2569 = C2105.m6981("ۧ۬") ^ i26;
                                                                i28 = ((iM2569 ^ i27) * 32243) ^ (-1278309500);
                                                                i29 = 600322911;
                                                            } else {
                                                                iM2569 = C2105.m6981("ܳ᩹") ^ i27;
                                                                i28 = ((iM2569 ^ i26) * (-10461)) ^ (-1742793371);
                                                                i29 = 814340639;
                                                            }
                                                            break;
                                                        case -336011560:
                                                        case 28424146:
                                                            if (C2105.f7037 != 0) {
                                                                iM2569 = (C2105.m6981("ܶۨ") + i26) * 85;
                                                                i28 = ((iM2569 ^ i27) * (-5247)) ^ (-1138232643);
                                                                i29 = -390074841;
                                                            } else {
                                                                iM2569 = C0630.m2566("ۨ۫") ^ i27;
                                                                i28 = ((iM2569 ^ i26) * (-25877)) ^ (-156677106);
                                                                i29 = -608498872;
                                                            }
                                                            break;
                                                        case -271693274:
                                                        case -165730576:
                                                            C4263.m12819();
                                                            break;
                                                        case -259895147:
                                                        case 1077732114:
                                                            th2 = th;
                                                            if (C3663.f11553) {
                                                                iM2569 = (C2105.m6981("ܶۨ") + i26) * 85;
                                                                i28 = ((iM2569 ^ i27) * (-5247)) ^ (-1138232643);
                                                                i29 = -390074841;
                                                            } else {
                                                                iM2569 = C0630.m2566("᩸ۧ") ^ i26;
                                                                i28 = ((iM2569 ^ i27) * (-14743)) ^ 1132700997;
                                                                i29 = -1012969174;
                                                            }
                                                            break;
                                                        case -218526004:
                                                        case 249782143:
                                                            if (ServiceConnectionC3453.f10921 >= 0) {
                                                                iM2569 = (i27 - C0630.m2566("֡᩶")) * (-119);
                                                                i28 = ((iM2569 ^ i26) * (-4113)) ^ (-672973584);
                                                                i29 = 366162594;
                                                            } else {
                                                                iM2569 = C0630.m2566("ܿۧ") ^ i27;
                                                                i28 = ((iM2569 ^ i26) * 10629) ^ 1059678852;
                                                                i29 = 1389156019;
                                                            }
                                                            break;
                                                        case -179311979:
                                                        case 751156029:
                                                            C1420.m4913();
                                                            C3019.m9255();
                                                            iM2569 = (i27 - C0630.m2566("֡᩶")) * (-119);
                                                            i28 = ((iM2569 ^ i26) * (-4113)) ^ (-672973584);
                                                            i29 = 366162594;
                                                            break;
                                                        case 182191462:
                                                        case 2035831283:
                                                            strM1959 = C0422.m1959(th2);
                                                            if (C0714.f2697 >= 0) {
                                                                iM2569 = C2105.m6981("ۧ۬") ^ i26;
                                                                i28 = ((iM2569 ^ i27) * 32243) ^ (-1278309500);
                                                                i29 = 600322911;
                                                            } else {
                                                                iM2569 = C2105.m6981("ۡ֫") ^ i26;
                                                                i28 = ((iM2569 ^ i27) * (-24737)) ^ 1629800390;
                                                                i29 = -242632209;
                                                            }
                                                            break;
                                                        case 1072456416:
                                                        case 1688897422:
                                                            RunnableC1937.m6377(textView18, strM1959);
                                                            C3245.m9918(textView18, C21943.f70293);
                                                            break;
                                                        case 1284853322:
                                                        case 2117700955:
                                                            if (C1916.f6442) {
                                                                iM2569 = C0630.m2566("ۧܳ") ^ i27;
                                                                i28 = ((iM2569 ^ i26) * (-28319)) ^ 984376828;
                                                                i29 = 399116237;
                                                            } else {
                                                                iM2569 = C2105.m6981("ۧ۬") ^ i26;
                                                                i28 = ((iM2569 ^ i27) * 32243) ^ (-1278309500);
                                                                i29 = 600322911;
                                                            }
                                                            break;
                                                        default:
                                                            if (C22628.f73083 <= 0) {
                                                                iM2569 = C2105.m6981("ۧ۬") ^ i26;
                                                                i28 = ((iM2569 ^ i27) * 32243) ^ (-1278309500);
                                                                i29 = 600322911;
                                                            } else {
                                                                iM2569 = (C0630.m2566("ۘۘ") + i27) * 11;
                                                                i28 = ((iM2569 ^ i26) * 14375) ^ 1966513542;
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
                                        if (C22628.f73083 > 0) {
                                            iM6987 = C2105.m6981("ۤܳ") ^ i22;
                                            i23 = ((iM6987 ^ i21) * (-27005)) ^ (-1955543618);
                                            i24 = 394835396;
                                        } else {
                                            iM6987 = C2105.m6981("᩸᩵") ^ i21;
                                            i23 = ((iM6987 ^ i22) * 32735) ^ 1889190774;
                                            i24 = 649588281;
                                        }
                                        break;
                                    case -1092366926:
                                    case 2090423858:
                                        c22250M13527 = c4617.m13527(new InterfaceC17066() { // from class: l.᩺۬ܽ
                                            @Override // l.InterfaceC17066
                                            /* JADX INFO: renamed from: ᩻ */
                                            public final boolean mo1526() {
                                                DialogInterfaceC0206 dialogInterfaceC0208 = null;
                                                boolean zM2124 = false;
                                                int i25 = 1802361551;
                                                int i26 = RunnableC3474.f10992;
                                                int i27 = C2520.f8000;
                                                int iM6988 = (i27 - C2105.m6981("ۨۖ")) * 47;
                                                int i28 = ((iM6988 ^ i26) * 24219) ^ 1059016105;
                                                int i29 = -902400093;
                                                while (true) {
                                                    i25 = ((((i25 ^ i26) * (-25523)) >> 31) & i28) ^ (iM6988 ^ i29);
                                                    switch (i25) {
                                                        case -2135256401:
                                                        case 594163734:
                                                            if (RunnableC0588.f2309 >= 0) {
                                                                iM6988 = (C0630.m2566("᩷ܰ") + i27) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                                i28 = ((iM6988 ^ i26) * (-7643)) ^ 1228464048;
                                                                i29 = 424189792;
                                                            } else {
                                                                iM6988 = (C0630.m2566("ᩳ֨") ^ i27) * (-123);
                                                                i28 = ((iM6988 ^ i26) * 32385) ^ 1154613731;
                                                                i29 = 1533891295;
                                                            }
                                                            break;
                                                        case -2104848139:
                                                        case 2091170516:
                                                            C3537.m10746();
                                                            return false;
                                                        case -1895820207:
                                                        case 1270640634:
                                                            if (C0483.f2088 >= 0) {
                                                                iM6988 = (C2105.m6981("۟ۗ") ^ i27) * (-87);
                                                                i28 = ((iM6988 ^ i26) * (-5041)) ^ 1944903110;
                                                                i29 = 459790901;
                                                            } else {
                                                                iM6988 = C2105.m6981("᩹ۛ") ^ i27;
                                                                i28 = ((iM6988 ^ i26) * 26617) ^ 850998941;
                                                                i29 = 698232263;
                                                            }
                                                            break;
                                                        case -1873116839:
                                                        case 1131818256:
                                                            C3019.m9255();
                                                            C4159.m12565();
                                                            iM6988 = (i26 - C2105.m6981("ۡ֡")) * (-107);
                                                            i28 = ((iM6988 ^ i27) * 6831) ^ (-1136176310);
                                                            i29 = 1871920773;
                                                            break;
                                                        case -1824440247:
                                                        case 1658841621:
                                                            RunnableC1108.m3790();
                                                            if (!C1005.f3721) {
                                                                iM6988 = (C0630.m2566("᩷ܰ") + i27) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                                i28 = ((iM6988 ^ i26) * (-7643)) ^ 1228464048;
                                                                i29 = 424189792;
                                                            } else {
                                                                iM6988 = (C2105.m6981("۟ۗ") ^ i27) * (-87);
                                                                i28 = ((iM6988 ^ i26) * (-5041)) ^ 1944903110;
                                                                i29 = 459790901;
                                                            }
                                                            break;
                                                        case -1573265903:
                                                        case 1774561839:
                                                            if (C3432.f10845 >= 0) {
                                                                iM6988 = C2105.m6981("ܽۗ") ^ i26;
                                                                i28 = ((iM6988 ^ i27) * (-20687)) ^ 315039247;
                                                                i29 = -223647010;
                                                            } else {
                                                                iM6988 = (C0630.m2566("ۤۖ") ^ i26) * 97;
                                                                i28 = ((iM6988 ^ i27) * 16293) ^ (-1241859314);
                                                                i29 = -1727375408;
                                                            }
                                                            break;
                                                        case -1312254577:
                                                        case 1785402203:
                                                            if (C4159.f13567) {
                                                                iM6988 = C0630.m2566("֨ۡ") ^ i27;
                                                                i28 = ((iM6988 ^ i26) * (-5431)) ^ (-1875686832);
                                                                i29 = -963516335;
                                                            } else {
                                                                iM6988 = (i26 - C2105.m6981("֫ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                                i28 = ((iM6988 ^ i27) * (-32053)) ^ 710801443;
                                                                i29 = 817050707;
                                                            }
                                                            break;
                                                        case -1121744230:
                                                        case -444157295:
                                                            if (C2126.f7087) {
                                                                iM6988 = (C0630.m2566("᩷ܰ") + i27) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                                i28 = ((iM6988 ^ i26) * (-7643)) ^ 1228464048;
                                                                i29 = 424189792;
                                                            } else {
                                                                iM6988 = (i27 - C2105.m6981("ۚܽ")) * 127;
                                                                i28 = ((iM6988 ^ i26) * 23011) ^ (-1736646942);
                                                                i29 = -1346745854;
                                                            }
                                                            break;
                                                        case -1035165615:
                                                        case -63860885:
                                                            return !zM2124;
                                                        case -886771955:
                                                        case -768357192:
                                                            zM2124 = C0483.m2124(dialogInterfaceC0208);
                                                            if (C0237.m1481() >= 0) {
                                                                iM6988 = (i26 - C2105.m6981("֫ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                                i28 = ((iM6988 ^ i27) * (-32053)) ^ 710801443;
                                                                i29 = 817050707;
                                                            } else {
                                                                iM6988 = (C2105.m6981("ۘ۠") + i27) * (-23);
                                                                i28 = ((iM6988 ^ i26) * 1629) ^ (-1947926505);
                                                                i29 = -1236077843;
                                                            }
                                                            break;
                                                        case -636345771:
                                                        case -604145358:
                                                            if (C1711.f5919) {
                                                                iM6988 = (C2105.m6981("۟ۗ") ^ i27) * (-87);
                                                                i28 = ((iM6988 ^ i26) * (-5041)) ^ 1944903110;
                                                                i29 = 459790901;
                                                            } else {
                                                                iM6988 = (C2105.m6981("᩻ۡ") ^ i26) * 79;
                                                                i28 = ((iM6988 ^ i27) * 20255) ^ 1879384859;
                                                                i29 = 1566054494;
                                                            }
                                                            break;
                                                        case -379683412:
                                                        case 1295357500:
                                                            if (C0237.m1481() >= 0) {
                                                                iM6988 = (i26 - C2105.m6981("ۡ֡")) * (-107);
                                                                i28 = ((iM6988 ^ i27) * 6831) ^ (-1136176310);
                                                                i29 = 1871920773;
                                                            } else {
                                                                iM6988 = (C2105.m6981("᩷ܳ") + i26) * 7;
                                                                i28 = ((iM6988 ^ i27) * (-26305)) ^ (-76941664);
                                                                i29 = 2142342215;
                                                            }
                                                            break;
                                                        case 49116398:
                                                        case 1436317944:
                                                            if (C3245.f10203 <= 0) {
                                                                iM6988 = C2105.m6981("ܽۗ") ^ i26;
                                                                i28 = ((iM6988 ^ i27) * (-20687)) ^ 315039247;
                                                                i29 = -223647010;
                                                            } else {
                                                                iM6988 = (C2105.m6981("۟ۗ") ^ i27) * (-87);
                                                                i28 = ((iM6988 ^ i26) * (-5041)) ^ 1944903110;
                                                                i29 = 459790901;
                                                            }
                                                            break;
                                                        case 381735005:
                                                        case 1764638745:
                                                            dialogInterfaceC0208 = dialogInterfaceC0207;
                                                            if (C4159.f13567) {
                                                                iM6988 = (C0630.m2566("ᩴܺ") + i26) * (-21);
                                                                i28 = ((iM6988 ^ i27) * 16649) ^ 1624967366;
                                                                i29 = -1127928853;
                                                            } else {
                                                                iM6988 = (i26 - C2105.m6981("ۡ֡")) * (-107);
                                                                i28 = ((iM6988 ^ i27) * 6831) ^ (-1136176310);
                                                                i29 = 1871920773;
                                                            }
                                                            break;
                                                        case 455165029:
                                                        case 1465060765:
                                                            C2126.m7040();
                                                            if (C4075.m12263() > 0) {
                                                                iM6988 = (C2105.m6981("۟ۗ") ^ i27) * (-87);
                                                                i28 = ((iM6988 ^ i26) * (-5041)) ^ 1944903110;
                                                                i29 = 459790901;
                                                            } else {
                                                                iM6988 = (i26 - C2105.m6981("ۡ֡")) * (-107);
                                                                i28 = ((iM6988 ^ i27) * 6831) ^ (-1136176310);
                                                                i29 = 1871920773;
                                                            }
                                                            break;
                                                        default:
                                                            if (RunnableC1108.f4040) {
                                                                iM6988 = (C2105.m6981("᩻᩵") + i26) * (-83);
                                                                i28 = ((iM6988 ^ i27) * 7295) ^ (-339318794);
                                                                i29 = -438389522;
                                                            } else {
                                                                iM6988 = (i26 - C2105.m6981("֫ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                                i28 = ((iM6988 ^ i27) * (-32053)) ^ 710801443;
                                                                i29 = 817050707;
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                        });
                                        iM6987 = (i22 - C2105.m6981("ۘ᩻")) * 45;
                                        i23 = ((iM6987 ^ i21) * (-2903)) ^ (-1520760696);
                                        i24 = 1966350389;
                                        break;
                                    case -1091349967:
                                    case 1090394135:
                                        C4616.m13552();
                                        if (C11340.f33930 >= 0) {
                                            iM6987 = C2105.m6981("ᩴ᩻") ^ i22;
                                            i23 = ((iM6987 ^ i21) * (-4487)) ^ (-344270188);
                                            i24 = -2079129268;
                                        } else {
                                            iM6987 = C2105.m6981("ۤܳ") ^ i22;
                                            i23 = ((iM6987 ^ i21) * (-27005)) ^ (-1955543618);
                                            i24 = 394835396;
                                        }
                                        break;
                                    case -1003924396:
                                    case 184474235:
                                        if (C7811.f24123 >= 0) {
                                            iM6987 = C2105.m6981("ۤܳ") ^ i22;
                                            i23 = ((iM6987 ^ i21) * (-27005)) ^ (-1955543618);
                                            i24 = 394835396;
                                        } else {
                                            iM6987 = (C2105.m6981("۟ᩴ") + i22) * (-111);
                                            i23 = ((iM6987 ^ i21) * (-223)) ^ (-1135446642);
                                            i24 = -425472104;
                                        }
                                        break;
                                    case -932863101:
                                    case -559898483:
                                        if (C0714.f2697 < 0) {
                                            iM6987 = C0630.m2566("ܳᩴ") ^ i21;
                                            i23 = ((iM6987 ^ i22) * (-2203)) ^ (-911734593);
                                            i24 = -1094594321;
                                        } else {
                                            iM6987 = (C0630.m2566("֡᩹") ^ i22) * (-117);
                                            i23 = ((iM6987 ^ i21) * 13223) ^ 1970256639;
                                            i24 = 640663137;
                                        }
                                        break;
                                    case -823621336:
                                    case 2027599541:
                                        if (C22628.m50615() != 0) {
                                            iM6987 = C2105.m6981("ᩴ᩻") ^ i22;
                                            i23 = ((iM6987 ^ i21) * (-4487)) ^ (-344270188);
                                            i24 = -2079129268;
                                        } else {
                                            iM6987 = (i22 - C2105.m6981("ܰܿ")) * (-69);
                                            i23 = ((iM6987 ^ i21) * (-16743)) ^ (-220878240);
                                            i24 = -304233382;
                                        }
                                        break;
                                    case -509754379:
                                    case -196868893:
                                        if (C2126.f7087) {
                                            iM6987 = C0630.m2566("ܳᩴ") ^ i21;
                                            i23 = ((iM6987 ^ i22) * (-2203)) ^ (-911734593);
                                            i24 = -1094594321;
                                        } else {
                                            iM6987 = C0630.m2566("ܳ᩻") ^ i21;
                                            i23 = ((iM6987 ^ i22) * (-27495)) ^ (-879186371);
                                            i24 = -389434879;
                                        }
                                        break;
                                    case -392110180:
                                    case -25999630:
                                        dialogInterfaceC0207 = dialogInterfaceC0206;
                                        textView17 = textView13;
                                        iM6987 = C2105.m6981("ۤ֨") ^ i21;
                                        i23 = ((iM6987 ^ i22) * 14435) ^ (-1599482277);
                                        i24 = 300654813;
                                        break;
                                    case -150903873:
                                    case 661427550:
                                        if (C3019.f9544 >= 0) {
                                            iM6987 = (C0630.m2566("֡᩹") ^ i22) * (-117);
                                            i23 = ((iM6987 ^ i21) * 13223) ^ 1970256639;
                                            i24 = 640663137;
                                        } else {
                                            iM6987 = (C0630.m2566("֫᩷") ^ i22) * 59;
                                            i23 = ((iM6987 ^ i21) * (-5587)) ^ (-1626172361);
                                            i24 = 316447629;
                                        }
                                        break;
                                    case 241410228:
                                    case 1676080247:
                                        try {
                                            C0237.m1492(new RunnableC19473(2, textView17, c22250M13527));
                                            iM6987 = (i21 - C0630.m2566("ۧᩴ")) * 11;
                                            i23 = ((iM6987 ^ i22) * (-27885)) ^ (-555376642);
                                            i24 = 209145724;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            iM6987 = (i22 - C0630.m2566("ۡ᩺")) * (-87);
                                            i23 = ((iM6987 ^ i21) * 6011) ^ (-1457601233);
                                            i24 = 3670601;
                                        }
                                        break;
                                    case 540062593:
                                    case 1666203767:
                                        if (C0630.f2410 <= 0) {
                                            iM6987 = C2105.m6981("ᩴ᩻") ^ i22;
                                            i23 = ((iM6987 ^ i21) * (-4487)) ^ (-344270188);
                                            i24 = -2079129268;
                                        } else {
                                            iM6987 = (i21 - C0630.m2566("ܽۘ")) * 73;
                                            i23 = ((iM6987 ^ i22) * 4645) ^ 100402052;
                                            i24 = -821505925;
                                        }
                                        break;
                                    case 1030621086:
                                    case 1682413887:
                                        if (C2105.f7037 != 0) {
                                            iM6987 = (C2105.m6981("᩺ۡ") ^ i22) * (-33);
                                            i23 = ((iM6987 ^ i21) * (-10047)) ^ (-1376780814);
                                            i24 = 237999848;
                                        } else {
                                            iM6987 = (i21 - C0630.m2566("֡ۙ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i23 = ((iM6987 ^ i22) * 12841) ^ 87521023;
                                            i24 = 14362269;
                                        }
                                        break;
                                    case 1203895682:
                                    case 2078124546:
                                        if (C1294.f4556 >= 0) {
                                            iM6987 = (C0630.m2566("֡᩹") ^ i22) * (-117);
                                            i23 = ((iM6987 ^ i21) * 13223) ^ 1970256639;
                                            i24 = 640663137;
                                        } else {
                                            iM6987 = C2105.m6981("ܿ۬") ^ i22;
                                            i23 = ((iM6987 ^ i21) * (-13365)) ^ 801686589;
                                            i24 = -1806138909;
                                        }
                                        break;
                                    case 1245946739:
                                    case 1849205821:
                                        if (C21923.f70183 != 0) {
                                            iM6987 = (C2105.m6981("᩺ۡ") ^ i22) * (-33);
                                            i23 = ((iM6987 ^ i21) * (-10047)) ^ (-1376780814);
                                            i24 = 237999848;
                                        } else {
                                            iM6987 = C0630.m2566("ۚ᩻") ^ i22;
                                            i23 = ((iM6987 ^ i21) * 8623) ^ (-1849222635);
                                            i24 = 1056413848;
                                        }
                                        break;
                                    default:
                                        c4617 = c4616;
                                        if (C2958.m9034() <= 0) {
                                            iM6987 = (C2105.m6981("᩺ۡ") ^ i22) * (-33);
                                            i23 = ((iM6987 ^ i21) * (-10047)) ^ (-1376780814);
                                            i24 = 237999848;
                                        } else {
                                            iM6987 = (C0630.m2566("᩹ۢ") ^ i21) * 3;
                                            i23 = ((iM6987 ^ i22) * 15537) ^ 75559745;
                                            i24 = 709770680;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    runnableC11000.run();
                    C21923.m49330(dialogInterfaceC0206.m1446(), true);
                    C22628.m50613(C4616.m13545(dialogInterfaceC0206), true);
                    C22628.m50613(c2978, true);
                    C22628.m50613(c2979, true);
                    break;
                case -963594199:
                case 536906217:
                    C1504.m5179();
                    C2958.m9034();
                    iM6982 = C2105.m6981("ܿ᩹") ^ i12;
                    i14 = ((iM6982 ^ i11) * (-14803)) ^ 226415185;
                    i8 = -503651769;
                    i13 = iM6982 ^ i8;
                    i10 = i10;
                    break;
                case -711316944:
                case -240407031:
                    c4613 = c4615;
                    textView13 = textView13;
                    view = view;
                    c8178 = c8178;
                    i15 = i15;
                    if (c4611.m13529()) {
                        iM6981 = C2105.m6981("֡᩻") ^ i11;
                        i3 = ((iM6981 ^ i12) * (-21075)) ^ 2036502904;
                        i4 = -1444768369;
                    } else {
                        iM6981 = C2105.m6981("᩻᩹") ^ i12;
                        i3 = ((iM6981 ^ i11) * 2581) ^ (-1138375481);
                        i4 = 1673456676;
                    }
                    i13 = iM6981 ^ i4;
                    c4615 = c4613;
                    i14 = i3;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case -614362427:
                case 1579943520:
                    i = i15;
                    executorService = executorService2;
                    c4612 = c4615;
                    TextView textView17 = (TextView) C11340.m28028(viewM3507, C2105.m6981(RunnableC1937.m6385(f25173, 269, 3, i)) ^ 2129022273);
                    C4263.m12823(textView17, new InterfaceC6141() { // from class: l.ܿ۫ܽ
                        @Override // l.InterfaceC6141
                        public final Object get() {
                            return c4612.m13535();
                        }
                    });
                    C7106.m19117(arrayList2, textView17);
                    iM2566 = C0630.m2566("᩸ۧ") ^ i11;
                    i14 = ((iM2566 ^ i12) * 14577) ^ 2139423766;
                    i2 = 610266246;
                    i13 = iM2566 ^ i2;
                    c4615 = c4612;
                    i15 = i;
                    executorService2 = executorService;
                    c8178 = c8177;
                    break;
                case -559025424:
                case 2106704880:
                    i15 = i15;
                    c4613 = c4615;
                    textView13 = textView13;
                    C1047.m3601(textView12, c4611.m13534());
                    C0630.m2570(textView13, C2105.m6981(C0798.m3005(f25173, 263, 3, i15)) ^ 2130381685);
                    executorService2 = C1802.f6208;
                    if (C2105.f7037 != 0) {
                        c8178 = c8177;
                        view = view;
                        iM6981 = (i11 - C0630.m2566("ܰܺ")) * 119;
                        i3 = ((iM6981 ^ i12) * (-26387)) ^ (-234615178);
                        i4 = 36042365;
                        i13 = iM6981 ^ i4;
                        c4615 = c4613;
                        i14 = i3;
                        i15 = i15;
                        c8178 = c8178;
                        view = view;
                    } else {
                        int iM2569 = (C0630.m2566("᩵ᩳ") + i12) * 59;
                        view = view;
                        c4615 = c4613;
                        i13 = iM2569 ^ 64450017;
                        i14 = ((iM2569 ^ i11) * (-14549)) ^ (-1981242951);
                        i15 = i15;
                        i10 = i10;
                        c8178 = c8177;
                    }
                    textView13 = textView13;
                    break;
                case -370525343:
                case 638299489:
                    C3663.m11161(C2105.m6981(ServiceConnectionC3453.m10568(f25173, Scalar25519.TARGET_LENGTH, 3, i15)) ^ 2128300249);
                    C1504.m5172(dialogInterfaceC0206);
                    break;
                case -90901152:
                case 929092494:
                    final ArrayList arrayList3 = arrayList2;
                    arrayList = arrayList2;
                    View.OnClickListener onClickListener2 = new View.OnClickListener(c8177) { // from class: l.ۤ۬ܽ

                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C8177 f31056;

                        {
                            int i20;
                            int i21;
                            int iM25610;
                            int i22;
                            int i23;
                            int iM6987;
                            int i24;
                            int i25;
                            int iM25611;
                            int i26;
                            int i27;
                            ViewOnClickListenerC10314 viewOnClickListenerC10314 = this;
                            int i28 = -1213393625;
                            int i29 = C4075.f12947;
                            int i30 = C3432.f10845;
                            int iM25612 = C0630.m2566("ܳܳ") ^ i29;
                            int i31 = ((iM25612 ^ i30) * 17985) ^ 2143137314;
                            int i32 = iM25612 ^ (-224396143);
                            while (true) {
                                i28 = ((((i28 ^ i30) * (-12025)) >> 31) & i31) ^ i32;
                                switch (i28) {
                                    case -2098146729:
                                    case -53934534:
                                        C2272.m7503();
                                        if (C3746.m11369() < 0) {
                                            iM25611 = C0630.m2566("ۤۡ") ^ i30;
                                            i26 = ((iM25611 ^ i29) * 28829) ^ (-589740703);
                                            i27 = -570874143;
                                            i32 = iM25611 ^ i27;
                                            i31 = i26;
                                        } else {
                                            i21 = i28;
                                            iM25610 = C0630.m2566("֫ۗ") ^ i29;
                                            i22 = ((iM25610 ^ i30) * (-9399)) ^ (-1899502073);
                                            i23 = 508276308;
                                            i32 = iM25610 ^ i23;
                                            i31 = i22;
                                            i28 = i21;
                                        }
                                        break;
                                    case -2077592261:
                                    case -640018518:
                                        if (!C0422.m1963()) {
                                            i20 = i28;
                                            int iM6988 = (C2105.m6981("᩺ܺ") ^ i29) * (-73);
                                            i31 = ((iM6988 ^ i30) * (-1683)) ^ (-836308305);
                                            i28 = i20;
                                            i32 = iM6988 ^ (-1389857915);
                                            viewOnClickListenerC10314 = this;
                                        } else {
                                            iM25611 = C0630.m2566("ۤۡ") ^ i30;
                                            i26 = ((iM25611 ^ i29) * 28829) ^ (-589740703);
                                            i27 = -570874143;
                                            i32 = iM25611 ^ i27;
                                            i31 = i26;
                                        }
                                        break;
                                    case -1777334016:
                                    case -192480165:
                                        RunnableC1937.m6387();
                                        C1005.m3501();
                                        throw new RuntimeException();
                                    case -1547481493:
                                    case 1752881338:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM25611 = C0630.m2566("ۤۡ") ^ i30;
                                            i26 = ((iM25611 ^ i29) * 28829) ^ (-589740703);
                                            i27 = -570874143;
                                        } else {
                                            iM25611 = C0630.m2566("ܺ᩵") ^ i30;
                                            i26 = ((iM25611 ^ i29) * (-5141)) ^ 2043120174;
                                            i27 = 227262179;
                                        }
                                        i32 = iM25611 ^ i27;
                                        i31 = i26;
                                        break;
                                    case -1275945235:
                                    case -36457214:
                                        if (C1128.f4106 <= 0) {
                                            i21 = i28;
                                            iM6987 = C2105.m6981("۠ܽ") ^ i30;
                                            i24 = ((iM6987 ^ i29) * (-15279)) ^ (-1058540336);
                                            i25 = 937710882;
                                            i31 = i24;
                                            i32 = iM6987 ^ i25;
                                            i28 = i21;
                                        } else {
                                            iM25611 = C0630.m2566("ۤۡ") ^ i30;
                                            i26 = ((iM25611 ^ i29) * 28829) ^ (-589740703);
                                            i27 = -570874143;
                                            i32 = iM25611 ^ i27;
                                            i31 = i26;
                                        }
                                        break;
                                    case -1261274520:
                                    case -997881662:
                                        if (C1294.m4372() <= 0) {
                                            i21 = i28;
                                            iM6987 = C2105.m6981("۠ܽ") ^ i30;
                                            i24 = ((iM6987 ^ i29) * (-15279)) ^ (-1058540336);
                                            i25 = 937710882;
                                            i31 = i24;
                                            i32 = iM6987 ^ i25;
                                            i28 = i21;
                                        } else {
                                            int iM25613 = (C0630.m2566("֡ܰ") ^ i30) * (-109);
                                            i32 = iM25613 ^ (-1005376964);
                                            i31 = ((iM25613 ^ i29) * (-23911)) ^ 1656684806;
                                        }
                                        break;
                                    case -1247770440:
                                    case 1098535289:
                                        if (RunnableC0588.f2309 >= 0) {
                                            i21 = i28;
                                            iM25610 = (i29 - C2105.m6981("ܶ۟")) * 27;
                                            i22 = ((iM25610 ^ i30) * (-7369)) ^ (-888032470);
                                            i23 = -441917042;
                                            i32 = iM25610 ^ i23;
                                            i31 = i22;
                                            i28 = i21;
                                        } else {
                                            int iM25614 = C0630.m2566("ܿۢ") ^ i29;
                                            i32 = iM25614 ^ 1015647283;
                                            i31 = ((iM25614 ^ i30) * (-32705)) ^ 1337318887;
                                        }
                                        break;
                                    case -1197531216:
                                    case 2146647303:
                                        return;
                                    case -1161203086:
                                    case 1141480368:
                                        i21 = i28;
                                        if (C7106.m19120() > 0) {
                                            iM25610 = C2105.m6981("ܰۘ") ^ i29;
                                            i22 = ((iM25610 ^ i30) * (-6105)) ^ (-193559066);
                                            i23 = -612498270;
                                            i32 = iM25610 ^ i23;
                                            i31 = i22;
                                            i28 = i21;
                                        }
                                        iM6987 = C2105.m6981("۠ܽ") ^ i30;
                                        i24 = ((iM6987 ^ i29) * (-15279)) ^ (-1058540336);
                                        i25 = 937710882;
                                        i31 = i24;
                                        i32 = iM6987 ^ i25;
                                        i28 = i21;
                                        break;
                                    case -1027256022:
                                    case 570776249:
                                        if (C0483.f2088 >= 0) {
                                            i21 = i28;
                                            iM25610 = (i29 - C2105.m6981("ܶ۟")) * 27;
                                            i22 = ((iM25610 ^ i30) * (-7369)) ^ (-888032470);
                                            i23 = -441917042;
                                            i32 = iM25610 ^ i23;
                                            i31 = i22;
                                            i28 = i21;
                                        } else {
                                            int iM6989 = C2105.m6981("᩸ۘ") ^ i29;
                                            i32 = iM6989 ^ 731604179;
                                            i31 = ((iM6989 ^ i30) * 8245) ^ (-189000703);
                                        }
                                        break;
                                    case -810889057:
                                    case 1806959302:
                                        if (C3245.f10203 <= 0) {
                                            i21 = i28;
                                            iM25610 = (i29 - C2105.m6981("ܶ۟")) * 27;
                                            i22 = ((iM25610 ^ i30) * (-7369)) ^ (-888032470);
                                            i23 = -441917042;
                                            i32 = iM25610 ^ i23;
                                            i31 = i22;
                                            i28 = i21;
                                        } else {
                                            int iM69810 = C2105.m6981("᩵ܽ") ^ i29;
                                            i32 = iM69810 ^ 1039704584;
                                            i31 = ((iM69810 ^ i30) * 31455) ^ 660847273;
                                        }
                                        break;
                                    case -690141195:
                                    case 1709735777:
                                        i21 = i28;
                                        if (C5695.f17556 >= 0) {
                                            iM25610 = C0630.m2566("֫ۗ") ^ i29;
                                            i22 = ((iM25610 ^ i30) * (-9399)) ^ (-1899502073);
                                            i23 = 508276308;
                                        } else {
                                            iM25610 = C2105.m6981("ۛ֨") ^ i30;
                                            i22 = ((iM25610 ^ i29) * 4955) ^ 1304955981;
                                            i23 = 266204023;
                                        }
                                        i32 = iM25610 ^ i23;
                                        i31 = i22;
                                        i28 = i21;
                                        break;
                                    case -543563604:
                                    case 1760403892:
                                        C1047.m3599();
                                        C2272.m7503();
                                        i21 = i28;
                                        iM25610 = C0630.m2566("֫ۗ") ^ i29;
                                        i22 = ((iM25610 ^ i30) * (-9399)) ^ (-1899502073);
                                        i23 = 508276308;
                                        i32 = iM25610 ^ i23;
                                        i31 = i22;
                                        i28 = i21;
                                        break;
                                    case 675687126:
                                    case 1133973006:
                                        i21 = i28;
                                        if (C4159.f13567) {
                                            iM25610 = C0630.m2566("ۘᩳ") ^ i29;
                                            i22 = ((iM25610 ^ i30) * 6197) ^ (-1680725325);
                                            i23 = 1585887414;
                                        } else {
                                            iM25610 = (i29 - C2105.m6981("ܶ۟")) * 27;
                                            i22 = ((iM25610 ^ i30) * (-7369)) ^ (-888032470);
                                            i23 = -441917042;
                                        }
                                        i32 = iM25610 ^ i23;
                                        i31 = i22;
                                        i28 = i21;
                                        break;
                                    case 1394995410:
                                    case 2044724060:
                                        if (C3245.f10203 > 0) {
                                            iM6987 = C2105.m6981("۫ۡ") ^ i30;
                                            i21 = i28;
                                            i24 = ((iM6987 ^ i29) * (-27851)) ^ 1777755399;
                                            i25 = 2059294433;
                                            i31 = i24;
                                            i32 = iM6987 ^ i25;
                                            i28 = i21;
                                        }
                                        i21 = i28;
                                        iM25610 = C0630.m2566("֫ۗ") ^ i29;
                                        i22 = ((iM25610 ^ i30) * (-9399)) ^ (-1899502073);
                                        i23 = 508276308;
                                        i32 = iM25610 ^ i23;
                                        i31 = i22;
                                        i28 = i21;
                                        break;
                                    default:
                                        i20 = i28;
                                        viewOnClickListenerC10314.f31056 = c8177;
                                        if (C0237.m1481() >= 0) {
                                            int iM69811 = (C2105.m6981("᩺ܺ") ^ i29) * (-73);
                                            i31 = ((iM69811 ^ i30) * (-1683)) ^ (-836308305);
                                            i28 = i20;
                                            i32 = iM69811 ^ (-1389857915);
                                        } else {
                                            int iM69812 = C2105.m6981("ܽ۟") ^ i30;
                                            i32 = iM69812 ^ (-159141276);
                                            i31 = ((iM69812 ^ i29) * (-17881)) ^ (-428478778);
                                            i28 = i20;
                                        }
                                        viewOnClickListenerC10314 = this;
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
                            int iM25610;
                            int i21;
                            int i22;
                            int i23;
                            C8177 c8179 = null;
                            int i24 = -1455357256;
                            int i25 = C0714.f2697;
                            int i26 = C5695.f17556;
                            int iM25611 = (C0630.m2566("ۧ۫") ^ i25) * (-47);
                            int i27 = ((iM25611 ^ i26) * 16929) ^ (-674327551);
                            int i28 = iM25611 ^ (-540868042);
                            RunnableC11000 runnableC11001 = null;
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
                                        if (C1420.f5096 > 0) {
                                            int iM25612 = C0630.m2566("۟ۗ") ^ i26;
                                            i23 = ((iM25612 ^ i25) * 11305) ^ 1987675576;
                                            i28 = iM25612 ^ (-1895687634);
                                            textView25 = textView28;
                                            textView26 = textView29;
                                            i27 = i23;
                                        } else {
                                            textView25 = textView28;
                                            textView26 = textView29;
                                            iM25610 = C0630.m2566("֨ۘ") ^ i26;
                                            i21 = ((iM25610 ^ i25) * 30373) ^ 11235621;
                                            i22 = -299321783;
                                            i28 = iM25610 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case -1931376001:
                                    case 576053011:
                                        TextView textView30 = textView11;
                                        if (C0483.f2088 < 0) {
                                            int iM25613 = (C0630.m2566("ۤ᩶") ^ i26) * (-109);
                                            i20 = ((iM25613 ^ i25) * 1983) ^ 951265195;
                                            i28 = iM25613 ^ (-1665962045);
                                            textView27 = textView30;
                                            i27 = i20;
                                        } else {
                                            textView27 = textView30;
                                            iM25610 = C2105.m6981("ܽۖ") ^ i26;
                                            i21 = ((iM25610 ^ i25) * 29167) ^ 878481439;
                                            i22 = 214857756;
                                            i28 = iM25610 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case -1901722971:
                                    case -1759756441:
                                        C3683.m11222();
                                        if (C3911.f12484 >= 0) {
                                            iM25610 = C2105.m6981("ܽۖ") ^ i26;
                                            i21 = ((iM25610 ^ i25) * 29167) ^ 878481439;
                                            i22 = 214857756;
                                        } else {
                                            iM25610 = C0630.m2566("ۨۢ") ^ i25;
                                            i21 = ((iM25610 ^ i26) * (-3701)) ^ 1242166855;
                                            i22 = -2014233898;
                                        }
                                        i28 = iM25610 ^ i22;
                                        i27 = i21;
                                        break;
                                    case -1586668421:
                                    case 1647698337:
                                        C8177.m21659(c8179, arrayList4, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView10, textView27, runnableC11001, view2);
                                        break;
                                    case -1365771290:
                                    case 163511345:
                                        AbstractC2021.m6574();
                                        if (C1916.m6308() >= 0) {
                                            iM25610 = C0630.m2566("ۚ۬") ^ i25;
                                            i21 = ((iM25610 ^ i26) * (-25355)) ^ (-2045652017);
                                            i22 = 1034007821;
                                        } else {
                                            iM25610 = C2105.m6981("ܽۖ") ^ i26;
                                            i21 = ((iM25610 ^ i25) * 29167) ^ 878481439;
                                            i22 = 214857756;
                                        }
                                        i28 = iM25610 ^ i22;
                                        i27 = i21;
                                        break;
                                    case -1362716759:
                                    case 52371502:
                                        C4075.m12263();
                                        iM25610 = C0630.m2566("ۚ۬") ^ i25;
                                        i21 = ((iM25610 ^ i26) * (-25355)) ^ (-2045652017);
                                        i22 = 1034007821;
                                        i28 = iM25610 ^ i22;
                                        i27 = i21;
                                        break;
                                    case -1279118652:
                                    case -845765768:
                                        TextView textView31 = textView7;
                                        if (C1773.f6144 > 0) {
                                            int iM25614 = C0630.m2566("ᩳܺ") ^ i25;
                                            i20 = ((iM25614 ^ i26) * 15407) ^ (-295956228);
                                            i28 = iM25614 ^ 110632850;
                                            textView24 = textView31;
                                            i27 = i20;
                                        } else {
                                            textView24 = textView31;
                                            iM25610 = C0630.m2566("ۚ۬") ^ i25;
                                            i21 = ((iM25610 ^ i26) * (-25355)) ^ (-2045652017);
                                            i22 = 1034007821;
                                            i28 = iM25610 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case -1276218302:
                                    case -818041739:
                                        ViewOnClickListenerC1958.m6429();
                                        C5695.m16023();
                                        break;
                                    case -1165751582:
                                    case 1285573271:
                                        TextView textView32 = textView4;
                                        TextView textView33 = textView5;
                                        if (C1420.f5096 > 0) {
                                            int iM25615 = (i25 - C0630.m2566("᩺᩸")) * (-85);
                                            i23 = ((iM25615 ^ i26) * 8843) ^ (-1156944530);
                                            i28 = iM25615 ^ (-1620877007);
                                            textView21 = textView32;
                                            textView22 = textView33;
                                            i27 = i23;
                                        } else {
                                            textView21 = textView32;
                                            textView22 = textView33;
                                            iM25610 = C0630.m2566("֨ۘ") ^ i26;
                                            i21 = ((iM25610 ^ i25) * 30373) ^ 11235621;
                                            i22 = -299321783;
                                            i28 = iM25610 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case -679895555:
                                    case 19077081:
                                        TextView textView34 = textView2;
                                        if (ServiceConnectionC3453.f10921 < 0) {
                                            int iM6987 = (C2105.m6981("ۨܺ") ^ i25) * (-79);
                                            i20 = ((iM6987 ^ i26) * (-29397)) ^ (-532167956);
                                            i28 = iM6987 ^ 1080103089;
                                            textView19 = textView34;
                                            i27 = i20;
                                        } else {
                                            textView19 = textView34;
                                            iM25610 = (i26 - C0630.m2566("ۗۧ")) * 127;
                                            i21 = ((iM25610 ^ i25) * (-18657)) ^ (-1391471170);
                                            i22 = 592080060;
                                            i28 = iM25610 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case -503726222:
                                    case -499929552:
                                        if (C0422.f1886 <= 0) {
                                            iM25610 = C0630.m2566("ۚ۬") ^ i25;
                                            i21 = ((iM25610 ^ i26) * (-25355)) ^ (-2045652017);
                                            i22 = 1034007821;
                                        } else {
                                            iM25610 = C0630.m2566("֨ۘ") ^ i26;
                                            i21 = ((iM25610 ^ i25) * 30373) ^ 11235621;
                                            i22 = -299321783;
                                        }
                                        i28 = iM25610 ^ i22;
                                        i27 = i21;
                                        break;
                                    case 10058367:
                                    case 1736964512:
                                        if (C3432.f10845 >= 0) {
                                            iM25610 = C0630.m2566("ۨۢ") ^ i25;
                                            i21 = ((iM25610 ^ i26) * (-3701)) ^ 1242166855;
                                            i22 = -2014233898;
                                        } else {
                                            iM25610 = C0630.m2566("ۖ᩷") ^ i25;
                                            i21 = ((iM25610 ^ i26) * 12017) ^ (-194305257);
                                            i22 = 44989955;
                                        }
                                        i28 = iM25610 ^ i22;
                                        i27 = i21;
                                        break;
                                    case 343835288:
                                    case 1286776553:
                                        ArrayList arrayList5 = arrayList3;
                                        TextView textView35 = textView;
                                        if (ServiceConnectionC3453.f10921 < 0) {
                                            int iM25616 = C0630.m2566("֫ۢ") ^ i25;
                                            i23 = ((iM25616 ^ i26) * 28233) ^ (-4347103);
                                            i28 = iM25616 ^ 1496723831;
                                            arrayList4 = arrayList5;
                                            textView18 = textView35;
                                            i27 = i23;
                                        } else {
                                            arrayList4 = arrayList5;
                                            textView18 = textView35;
                                            iM25610 = C0630.m2566("ۨۢ") ^ i25;
                                            i21 = ((iM25610 ^ i26) * (-3701)) ^ 1242166855;
                                            i22 = -2014233898;
                                            i28 = iM25610 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case 465851228:
                                    case 1605812932:
                                        TextView textView36 = textView6;
                                        if (C1128.m3851() > 0) {
                                            int iM25617 = C0630.m2566("᩺֨") ^ i26;
                                            i20 = ((iM25617 ^ i25) * 2447) ^ (-1696413280);
                                            i28 = iM25617 ^ 1593190653;
                                            textView23 = textView36;
                                            i27 = i20;
                                        } else {
                                            textView23 = textView36;
                                            iM25610 = C2105.m6981("ܽۖ") ^ i26;
                                            i21 = ((iM25610 ^ i25) * 29167) ^ 878481439;
                                            i22 = 214857756;
                                            i28 = iM25610 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    case 1426091566:
                                    case 1554628442:
                                        TextView textView37 = textView3;
                                        if (C2105.f7037 == 0) {
                                            int iM25618 = (i26 - C0630.m2566("᩷֫")) * 11;
                                            i20 = ((iM25618 ^ i25) * 25757) ^ 1960022265;
                                            i28 = iM25618 ^ 2107289206;
                                            textView20 = textView37;
                                            i27 = i20;
                                        } else {
                                            textView20 = textView37;
                                            iM25610 = (i26 - C0630.m2566("ۗۧ")) * 127;
                                            i21 = ((iM25610 ^ i25) * (-18657)) ^ (-1391471170);
                                            i22 = 592080060;
                                            i28 = iM25610 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                    default:
                                        RunnableC11000 runnableC11002 = runnableC11000;
                                        c8179 = this.f31056;
                                        if (C2958.f9394 < 0) {
                                            int iM25619 = C0630.m2566("ۙ᩸") ^ i26;
                                            i20 = ((iM25619 ^ i25) * (-6959)) ^ (-1500040076);
                                            i28 = iM25619 ^ (-112636816);
                                            runnableC11001 = runnableC11002;
                                            i27 = i20;
                                        } else {
                                            runnableC11001 = runnableC11002;
                                            iM25610 = (i26 - C0630.m2566("ۗۧ")) * 127;
                                            i21 = ((iM25610 ^ i25) * (-18657)) ^ (-1391471170);
                                            i22 = 592080060;
                                            i28 = iM25610 ^ i22;
                                            i27 = i21;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    itM9029 = C2958.m9029(arrayList);
                    onClickListener = onClickListener2;
                    i9 = 0;
                    int iM6987 = (C2105.m6981("۬ܰ") ^ i12) * (-45);
                    i14 = ((iM6987 ^ i11) * 15235) ^ (-157982622);
                    i13 = iM6987 ^ 1161681581;
                    c4615 = c4611;
                    i15 = i15;
                    executorService2 = executorService2;
                    arrayList2 = arrayList;
                    viewM3507 = viewM3507;
                    c8178 = c8177;
                    break;
                case 98011998:
                case 2122757527:
                    C1916.m6308();
                    if (C3746.f11829 <= 0) {
                        iM6982 = (i11 - C2105.m6981("ܿۤ")) * (-39);
                        i14 = ((iM6982 ^ i12) * (-785)) ^ 677570987;
                        i8 = 2103819284;
                        i13 = iM6982 ^ i8;
                        i10 = i10;
                    } else {
                        c4613 = c4615;
                        textView13 = textView13;
                        view = view;
                        c8178 = c8178;
                        i15 = i15;
                        iM6981 = (C2105.m6981("ۡ᩸") ^ i12) * 7;
                        i3 = ((iM6981 ^ i11) * 22123) ^ (-1715018422);
                        i4 = 1763900511;
                        i13 = iM6981 ^ i4;
                        c4615 = c4613;
                        i14 = i3;
                        i15 = i15;
                        c8178 = c8178;
                        view = view;
                        textView13 = textView13;
                    }
                    break;
                case 108864728:
                case 1499185877:
                    i = i15;
                    executorService = executorService2;
                    TextView textView18 = (TextView) C1005.m3507(viewM3507, C2105.m6981(C3432.m10488(f25173, 272, 3, i)) ^ 2126541305);
                    c4612 = c4611;
                    C4263.m12823(textView18, new InterfaceC6141() { // from class: l.ܳ۫ܽ
                        @Override // l.InterfaceC6141
                        public final Object get() {
                            return c4612.m13538();
                        }
                    });
                    C1916.m6307(arrayList2, textView18);
                    iM2566 = (C2105.m6981("᩺ܿ") ^ i12) * (-71);
                    i14 = ((iM2566 ^ i11) * (-30063)) ^ 976352367;
                    i2 = -1480875418;
                    i13 = iM2566 ^ i2;
                    c4615 = c4612;
                    i15 = i;
                    executorService2 = executorService;
                    c8178 = c8177;
                    break;
                case 131653583:
                case 1438537290:
                    if (!C1504.f5354) {
                        iM6982 = C2105.m6981("ܿ᩹") ^ i12;
                        i14 = ((iM6982 ^ i11) * (-14803)) ^ 226415185;
                        i8 = -503651769;
                        i13 = iM6982 ^ i8;
                        i10 = i10;
                    } else {
                        c4613 = c4615;
                        textView13 = textView13;
                        view = view;
                        c8178 = c8178;
                        i15 = i15;
                        iM6981 = C0630.m2566("۠ۗ") ^ i11;
                        i3 = ((iM6981 ^ i12) * 27101) ^ (-1007799459);
                        i4 = 1748246231;
                        i13 = iM6981 ^ i4;
                        c4615 = c4613;
                        i14 = i3;
                        i15 = i15;
                        c8178 = c8178;
                        view = view;
                        textView13 = textView13;
                    }
                    break;
                case 226850290:
                case 525303546:
                    c4613 = c4615;
                    textView13 = textView13;
                    view = view;
                    c8178 = c8178;
                    i15 = i15;
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("ᩳ᩵") ^ i12;
                        i3 = ((iM6981 ^ i11) * 8583) ^ (-1377553683);
                        i4 = 1754349404;
                    } else {
                        iM6981 = (C2105.m6981("᩺᩷") ^ i12) * (-43);
                        i3 = ((iM6981 ^ i11) * 863) ^ 1313733269;
                        i4 = -1888643620;
                    }
                    i13 = iM6981 ^ i4;
                    c4615 = c4613;
                    i14 = i3;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case 360569008:
                case 811353362:
                    C3683.m11222();
                    C2958.m9034();
                    break;
                case 409407325:
                case 2038765909:
                    c4613 = c4615;
                    textView13 = textView13;
                    view = view;
                    c8178 = c8178;
                    i15 = i15;
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C2105.m6981("ۤ᩵") + i12) * 109;
                        i3 = ((iM6981 ^ i11) * (-23723)) ^ (-1858307214);
                        i4 = -992587334;
                    } else {
                        iM6981 = (C2105.m6981("ۜ֫") ^ i11) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM6981 ^ i12) * (-1925)) ^ (-142094418);
                        i4 = -2071901099;
                    }
                    i13 = iM6981 ^ i4;
                    c4615 = c4613;
                    i14 = i3;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case 472394996:
                case 749118077:
                    c4613 = c4615;
                    textView13 = textView13;
                    view = view;
                    c8178 = c8178;
                    i15 = i15;
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C2105.m6981("ۡ᩸") ^ i12) * 7;
                        i3 = ((iM6981 ^ i11) * 22123) ^ (-1715018422);
                        i4 = 1763900511;
                    } else {
                        iM6981 = (i12 - C0630.m2566("ᩳ۫")) * (-33);
                        i3 = ((iM6981 ^ i11) * (-4131)) ^ 1634430475;
                        i4 = 692521106;
                    }
                    i13 = iM6981 ^ i4;
                    c4615 = c4613;
                    i14 = i3;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case 655581167:
                case 1220752853:
                    TextView textView19 = (TextView) C3019.m9263(arrayList2, i9);
                    C1420.m4908(textView19, C21943.f70257);
                    textView19.setTypeface(Typeface.DEFAULT_BOLD);
                    textView19.setPaintFlags(9);
                    c8178.f25174 = (byte[]) ((InterfaceC6141) textView19.getTag()).get();
                    c8178 = c8178;
                    int iM25610 = C0630.m2566("ۖ֫") ^ i11;
                    i14 = ((iM25610 ^ i12) * (-6539)) ^ (-863136176);
                    c4615 = c4615;
                    i13 = iM25610 ^ 1609056781;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case 1098765926:
                case 1916753517:
                    if (C0483.m2123(itM9029)) {
                        iM6982 = C2105.m6981("ۙ᩷") ^ i11;
                        i14 = ((iM6982 ^ i12) * (-32715)) ^ (-58014390);
                        i8 = -1162886735;
                    } else {
                        iM6982 = C2105.m6981("᩷֨") ^ i11;
                        i14 = ((iM6982 ^ i12) * (-21869)) ^ 1365336006;
                        i8 = 1790531500;
                    }
                    i13 = iM6982 ^ i8;
                    i10 = i10;
                    break;
                case 1188246993:
                case 1657902796:
                    c4613 = c4615;
                    textView13 = textView13;
                    view = view;
                    c8178 = c8178;
                    i15 = i15;
                    if (C1504.f5354) {
                        iM6981 = (C0630.m2566("᩻֡") ^ i12) * 33;
                        i3 = ((iM6981 ^ i11) * (-19855)) ^ 127802;
                        i4 = -2131500139;
                    } else {
                        iM6981 = (i11 - C2105.m6981("ܽ᩻")) * 123;
                        i3 = ((iM6981 ^ i12) * 20151) ^ (-1312301044);
                        i4 = -1552788685;
                    }
                    i13 = iM6981 ^ i4;
                    c4615 = c4613;
                    i14 = i3;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case 1246600520:
                case 1801695359:
                    C3663.m11168();
                    if (C3663.m11168() < 0) {
                        c4613 = c4615;
                        textView13 = textView13;
                        view = view;
                        c8178 = c8178;
                        i15 = i15;
                        iM6981 = (C0630.m2566("᩻֡") ^ i12) * 33;
                        i3 = ((iM6981 ^ i11) * (-19855)) ^ 127802;
                        i4 = -2131500139;
                        i13 = iM6981 ^ i4;
                        c4615 = c4613;
                        i14 = i3;
                        i15 = i15;
                        c8178 = c8178;
                        view = view;
                        textView13 = textView13;
                    } else {
                        iM6982 = (i11 - C2105.m6981("ܿۤ")) * (-39);
                        i14 = ((iM6982 ^ i12) * (-785)) ^ 677570987;
                        i8 = 2103819284;
                        i13 = iM6982 ^ i8;
                        i10 = i10;
                    }
                    break;
                case 1271362768:
                case 1705220423:
                    c4613 = c4615;
                    textView13 = textView13;
                    view = view;
                    c8178 = c8178;
                    i15 = i15;
                    if (C2126.f7087) {
                        iM6981 = C0630.m2566("۠ۗ") ^ i11;
                        i3 = ((iM6981 ^ i12) * 27101) ^ (-1007799459);
                        i4 = 1748246231;
                    } else {
                        iM6981 = C2105.m6981("ۘܶ") ^ i11;
                        i3 = ((iM6981 ^ i12) * 31531) ^ 1411283137;
                        i4 = 1027014092;
                    }
                    i13 = iM6981 ^ i4;
                    c4615 = c4613;
                    i14 = i3;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                case 1768061591:
                case 1821213168:
                    c4613 = c4615;
                    textView13 = textView13;
                    view = view;
                    c8178 = c8178;
                    i15 = i15;
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("۠ۗ") ^ i11;
                        i3 = ((iM6981 ^ i12) * 27101) ^ (-1007799459);
                        i4 = 1748246231;
                    } else {
                        iM6981 = C2105.m6981("֡᩵") ^ i11;
                        i3 = ((iM6981 ^ i12) * 14569) ^ 436807022;
                        i4 = -536620598;
                    }
                    i13 = iM6981 ^ i4;
                    c4615 = c4613;
                    i14 = i3;
                    i15 = i15;
                    c8178 = c8178;
                    view = view;
                    textView13 = textView13;
                    break;
                default:
                    i = i15;
                    executorService = executorService2;
                    c4612 = c4615;
                    if (c4611.m13535() != null) {
                        iM2566 = (i12 - C2105.m6981("۬ۙ")) * (-95);
                        i14 = ((iM2566 ^ i11) * (-24801)) ^ (-653468483);
                        i2 = -1701796283;
                    } else {
                        iM2566 = C0630.m2566("᩸ۧ") ^ i11;
                        i14 = ((iM2566 ^ i12) * 14577) ^ 2139423766;
                        i2 = 610266246;
                    }
                    i13 = iM2566 ^ i2;
                    c4615 = c4612;
                    i15 = i;
                    executorService2 = executorService;
                    c8178 = c8177;
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
    
        if (l.C0798.m2998() == 0) goto L17;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m21659(C8177 c8177, ArrayList arrayList, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, RunnableC11000 runnableC11000, View view) {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        int iM6983;
        int i5;
        int i6;
        Iterator itM9029 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        View[] viewArr = null;
        int i10 = 0;
        TextView textView12 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = -497778631;
        int i14 = RunnableC1937.f6483;
        int i15 = C0483.f2088;
        int iM6984 = C2105.m6981("۠۟") ^ i14;
        int i16 = ((iM6984 ^ i15) * (-21923)) ^ 782598399;
        int i17 = 1901618716;
        while (true) {
            int i18 = iM6984 ^ i17;
            while (true) {
                i13 = ((((i13 ^ i15) * 53) >> 31) & i16) ^ i18;
                switch (i13) {
                    case -2056615557:
                    case -796606263:
                        if (C3537.m10746() > 0) {
                            iM6984 = C0630.m2566("ܽ֫") ^ i15;
                            i16 = ((iM6984 ^ i14) * (-20371)) ^ (-2029441690);
                            i17 = 446009397;
                        }
                        iM6982 = (i14 - C2105.m6981("᩺ۖ")) * (-9);
                        i3 = ((iM6982 ^ i15) * (-25233)) ^ 932387569;
                        i4 = -2000724804;
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case -2040518168:
                    case -1759122913:
                        if (i12 >= 0) {
                            iM6982 = (i14 - C2105.m6981("᩺ۖ")) * (-9);
                            i3 = ((iM6982 ^ i15) * (-25233)) ^ 932387569;
                            i4 = -2000724804;
                        } else {
                            iM6982 = C0630.m2566("ۤۚ") ^ i14;
                            i3 = ((iM6982 ^ i15) * 17475) ^ (-1731572787);
                            i4 = 155924366;
                        }
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case -1855488480:
                    case 1590055463:
                        View view2 = viewArr[i11];
                        ViewOnClickListenerC1958.m6433(view2, 0.0f);
                        view2.animate().alpha(1.0f).setDuration(200L).setStartDelay(i11 * 15).start();
                        i11++;
                        iM6981 = (C0630.m2566("ۛۡ") + i14) * (-101);
                        i = ((iM6981 ^ i15) * (-16461)) ^ (-1029801405);
                        i2 = 461123027;
                        i18 = iM6981 ^ i2;
                        i16 = i;
                        break;
                    case -1841614591:
                    case 992681317:
                        if (C0798.m2998() != 0) {
                            iM6982 = (C0630.m2566("ۡ۫") + i15) * 95;
                            i3 = ((iM6982 ^ i14) * (-30045)) ^ (-279283751);
                            i4 = 1258559432;
                        } else {
                            iM6982 = C2105.m6981("ܽۜ") ^ i15;
                            i3 = ((iM6982 ^ i14) * (-9013)) ^ 1426687538;
                            i4 = -211954544;
                        }
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case -1733806894:
                    case -1285428030:
                        if (AbstractC2021.f6743 <= 0) {
                            iM6982 = (i14 - C2105.m6981("᩺ۖ")) * (-9);
                            i3 = ((iM6982 ^ i15) * (-25233)) ^ 932387569;
                            i4 = -2000724804;
                        } else {
                            iM6982 = (C2105.m6981("ۤܶ") ^ i15) * (-13);
                            i3 = ((iM6982 ^ i14) * 3877) ^ (-1228722154);
                            i4 = -1268411591;
                        }
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case -1711228975:
                    case -1396271808:
                        if (C22628.f73083 <= 0) {
                            iM6982 = (C0630.m2566("ۡ۫") + i15) * 95;
                            i3 = ((iM6982 ^ i14) * (-30045)) ^ (-279283751);
                            i4 = 1258559432;
                            i18 = iM6982 ^ i4;
                            i16 = i3;
                        } else {
                            iM6984 = C0630.m2566("ܽ֫") ^ i15;
                            i16 = ((iM6984 ^ i14) * (-20371)) ^ (-2029441690);
                            i17 = 446009397;
                        }
                        break;
                    case -1677315760:
                    case 416085627:
                        C3663.m11168();
                        C4263.m12819();
                        break;
                    case -1425800734:
                    case -596930172:
                        if (C5695.f17556 >= 0) {
                            iM6982 = (C0630.m2566("ۡ۫") + i15) * 95;
                            i3 = ((iM6982 ^ i14) * (-30045)) ^ (-279283751);
                            i4 = 1258559432;
                        } else {
                            iM6982 = C0630.m2566("ᩴ᩵") ^ i14;
                            i3 = ((iM6982 ^ i15) * 18739) ^ 1713222102;
                            i4 = -1789503513;
                        }
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case -1190956254:
                    case 483534402:
                        C3245.m9918(textView12, C21943.f70257);
                        textView12.setTypeface(Typeface.DEFAULT_BOLD);
                        textView12.setPaintFlags(i7);
                        iM6982 = (i15 - C2105.m6981("ᩴۖ")) * 55;
                        i3 = ((iM6982 ^ i14) * (-29713)) ^ (-605581514);
                        i4 = 998942270;
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case -987643903:
                    case 1286915066:
                        C1420.m4908(textView12, C21943.f70284);
                        textView12.setTypeface(Typeface.DEFAULT);
                        textView12.setPaintFlags(i8);
                        iM6982 = (i15 - C2105.m6981("ᩴۖ")) * 55;
                        i3 = ((iM6982 ^ i14) * (-29713)) ^ (-605581514);
                        i4 = 998942270;
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case -977919944:
                    case 663498437:
                        break;
                    case -837496440:
                    case -524590391:
                        i12 = C1047.f3863;
                        iM6982 = C2105.m6981("۠֡") ^ i15;
                        i3 = ((iM6982 ^ i14) * 17793) ^ (-1799222241);
                        i4 = 1497605418;
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case -730893783:
                    case -351706644:
                        if (C1773.m5910(itM9029)) {
                            iM6983 = (C0630.m2566("ۚۢ") + i15) * 119;
                            i5 = ((iM6983 ^ i14) * 29545) ^ (-293646479);
                            i6 = -195198587;
                        } else {
                            iM6983 = (i14 - C2105.m6981("᩷ۡ")) * (-5);
                            i5 = ((iM6983 ^ i15) * 20343) ^ 575355357;
                            i6 = 953064440;
                        }
                        i18 = iM6983 ^ i6;
                        i16 = i5;
                        i7 = 9;
                        i8 = 1;
                        break;
                    case -610726043:
                    case 681648754:
                        runnableC11000.run();
                        break;
                    case -431695390:
                    case 79087180:
                        if (C0714.f2697 >= 0) {
                            iM6982 = C0630.m2566("ۨ᩷") ^ i15;
                            i3 = ((iM6982 ^ i14) * (-9245)) ^ (-2015615207);
                            i4 = -940617481;
                        } else {
                            iM6982 = C0630.m2566("۠ۢ") ^ i15;
                            i3 = ((iM6982 ^ i14) * (-1709)) ^ 1432000073;
                            i4 = -371113129;
                        }
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case 80756800:
                    case 508712792:
                        c8177.f25174 = (byte[]) ((InterfaceC6141) view.getTag()).get();
                        i9 = 11;
                        viewArr = new View[11];
                        i10 = 0;
                        viewArr[0] = textView;
                        viewArr[i8] = textView2;
                        viewArr[2] = textView3;
                        viewArr[3] = textView4;
                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                            iM6982 = (i14 - C0630.m2566("ۤܽ")) * (-97);
                            i3 = ((iM6982 ^ i15) * 2523) ^ (-2091826539);
                            i4 = 586983582;
                        } else {
                            iM6982 = (i14 - C2105.m6981("ۧ۫")) * 55;
                            i3 = ((iM6982 ^ i15) * (-21229)) ^ 1144107198;
                            i4 = 1543036304;
                        }
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case 139302632:
                    case 515492168:
                        if (C3245.f10203 <= 0) {
                            iM6982 = (i14 - C2105.m6981("᩺ۖ")) * (-9);
                            i3 = ((iM6982 ^ i15) * (-25233)) ^ 932387569;
                            i4 = -2000724804;
                        } else {
                            iM6982 = (C0630.m2566("ۜܰ") + i15) * (-93);
                            i3 = ((iM6982 ^ i14) * (-22747)) ^ (-1997521523);
                            i4 = 867333473;
                        }
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case 443273452:
                    case 746481068:
                        itM9029 = C2958.m9029(arrayList);
                        iM6982 = (i15 - C2105.m6981("ᩴۖ")) * 55;
                        i3 = ((iM6982 ^ i14) * (-29713)) ^ (-605581514);
                        i4 = 998942270;
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case 525623386:
                    case 2037382593:
                        if (ServiceConnectionC3453.f10921 >= 0) {
                            iM6982 = (i14 - C2105.m6981("᩺ۖ")) * (-9);
                            i3 = ((iM6982 ^ i15) * (-25233)) ^ 932387569;
                            i4 = -2000724804;
                        } else {
                            iM6982 = (C0630.m2566("᩶֨") + i14) * 25;
                            i3 = ((iM6982 ^ i15) * (-27275)) ^ 760231147;
                            i4 = 937223508;
                        }
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case 631189742:
                    case 918735190:
                        if (C5695.f17556 >= 0) {
                            iM6982 = C0630.m2566("ۨ᩷") ^ i15;
                            i3 = ((iM6982 ^ i14) * (-9245)) ^ (-2015615207);
                            i4 = -940617481;
                        } else {
                            iM6982 = C2105.m6981("ۧۗ") ^ i14;
                            i3 = ((iM6982 ^ i15) * 13205) ^ 1888043443;
                            i4 = -1217801542;
                        }
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case 646631744:
                    case 1896952862:
                        if (C0630.f2410 <= 0) {
                            iM6982 = (i14 - C0630.m2566("ۤܽ")) * (-97);
                            i3 = ((iM6982 ^ i15) * 2523) ^ (-2091826539);
                            i4 = 586983582;
                        } else {
                            iM6982 = (C2105.m6981("ۡۖ") ^ i14) * 47;
                            i3 = ((iM6982 ^ i15) * 27295) ^ 1781198026;
                            i4 = -209287692;
                        }
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case 873506662:
                    case 1301243992:
                        textView12 = (TextView) C2272.m7513(itM9029);
                        if (view == textView12) {
                            iM6981 = (C0630.m2566("ۢ۫") + i14) * (-103);
                            i = ((iM6981 ^ i15) * 28017) ^ 1882725976;
                            i2 = 1344975609;
                        } else {
                            iM6981 = (C2105.m6981("ۗܶ") + i15) * 79;
                            i = ((iM6981 ^ i14) * (-659)) ^ 1246909087;
                            i2 = -1868566364;
                        }
                        i18 = iM6981 ^ i2;
                        i16 = i;
                        break;
                    case 1470438590:
                    case 1695031584:
                        AbstractC2021.m6574();
                        RunnableC0588.m2441();
                        iM6982 = C0630.m2566("ۨ᩷") ^ i15;
                        i3 = ((iM6982 ^ i14) * (-9245)) ^ (-2015615207);
                        i4 = -940617481;
                        i18 = iM6982 ^ i4;
                        i16 = i3;
                        break;
                    case 1700195081:
                    case 1807632611:
                        if (i11 >= i9) {
                            iM6984 = C2105.m6981("᩺ۗ") ^ i15;
                            i16 = ((iM6984 ^ i14) * (-30017)) ^ 2090561883;
                            i17 = 79258363;
                        } else {
                            iM6984 = C2105.m6981("ۛۤ") ^ i14;
                            i16 = ((iM6984 ^ i15) * (-17963)) ^ (-527072441);
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
                        iM6981 = (C0630.m2566("ۛۡ") + i14) * (-101);
                        i = ((iM6981 ^ i15) * (-16461)) ^ (-1029801405);
                        i2 = 461123027;
                        i18 = iM6981 ^ i2;
                        i16 = i;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21652(TextView textView, TextView textView2, CharSequence charSequence) {
        int i = 0;
        int i2 = 1548245432;
        int i3 = C1420.f5096;
        int i4 = C0050.f910;
        int iM2566 = (i4 - C0630.m2566("᩶ᩳ")) * 29;
        int i5 = ((iM2566 ^ i3) * (-489)) ^ 1430741863;
        int i6 = 405151618;
        while (true) {
            i2 = ((((i2 ^ i3) * 24153) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2078788033:
                case 284526474:
                    if (C3019.m9255() <= 0) {
                        iM2566 = C0630.m2566("ܶ᩷") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-24407)) ^ 17081751;
                        i6 = -733062744;
                    } else {
                        iM2566 = C0630.m2566("ܶ۬") ^ i3;
                        i5 = ((iM2566 ^ i4) * 30385) ^ 578774959;
                        i6 = 1244934727;
                    }
                    break;
                case -2039318124:
                case 2029852765:
                    if (C1504.f5354) {
                        iM2566 = (C2105.m6981("᩶ۙ") ^ i3) * (-87);
                        i5 = ((iM2566 ^ i4) * 22863) ^ (-278629741);
                        i6 = -719021561;
                    } else {
                        iM2566 = (C0630.m2566("۟۟") + i3) * (-57);
                        i5 = ((iM2566 ^ i4) * 11251) ^ (-1746025140);
                        i6 = 1817096938;
                    }
                    break;
                case -1947560506:
                case -889263025:
                    if (C0382.f1805) {
                        iM2566 = (C0630.m2566("ۧܺ") ^ i4) * (-17);
                        i5 = ((iM2566 ^ i3) * 26021) ^ 1039680931;
                        i6 = 1042271258;
                    } else {
                        iM2566 = C0630.m2566("ܶ᩷") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-24407)) ^ 17081751;
                        i6 = -733062744;
                    }
                    break;
                case -1752926147:
                case 1058747172:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = (C0630.m2566("᩺۬") ^ i3) * (-3);
                        i5 = ((iM2566 ^ i4) * (-8707)) ^ (-1105472368);
                        i6 = 526577853;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ۧ۟")) * 79;
                        i5 = ((iM2566 ^ i3) * 11545) ^ 1570708855;
                        i6 = -190429072;
                    }
                    break;
                case -1333333732:
                case 348664184:
                    if (C21923.m49329()) {
                        iM2566 = C0630.m2566("ܶ᩷") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-24407)) ^ 17081751;
                        i6 = -733062744;
                    } else {
                        iM2566 = (C0630.m2566("᩶ܶ") + i3) * (-45);
                        i5 = ((iM2566 ^ i4) * (-25515)) ^ 611515032;
                        i6 = 211139309;
                    }
                    break;
                case -1118290473:
                case 278184608:
                    if (C2105.m6982() != 0) {
                        iM2566 = C2105.m6981("ᩴᩳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 31649) ^ (-864292015);
                        i6 = -2146188771;
                    } else {
                        iM2566 = (C2105.m6981("ۛܿ") ^ i3) * 83;
                        i5 = ((iM2566 ^ i4) * (-10283)) ^ 678789387;
                        i6 = -1225477606;
                    }
                    break;
                case -1084091693:
                case 167645093:
                    if (C3537.f11231 >= 0) {
                        iM2566 = C2105.m6981("ᩴᩳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 31649) ^ (-864292015);
                        i6 = -2146188771;
                    } else {
                        iM2566 = C0630.m2566("᩹ۘ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 11247) ^ 247711908;
                        i6 = 583118;
                    }
                    break;
                case -997730698:
                case 1284156394:
                    if (charSequence == null) {
                        iM2566 = (C2105.m6981("ۘۚ") + i3) * 23;
                        i5 = ((iM2566 ^ i4) * (-7245)) ^ (-1805947113);
                        i6 = 1478776676;
                    } else {
                        iM2566 = (C0630.m2566("ܰ᩶") + i4) * 33;
                        i5 = ((iM2566 ^ i3) * 20811) ^ (-484122608);
                        i6 = -1869429883;
                    }
                    break;
                case -586750520:
                case -309974822:
                    C1047.m3601(textView2, charSequence);
                    iM2566 = (i3 - C2105.m6981("ۧۘ")) * (-45);
                    i5 = ((iM2566 ^ i4) * (-28223)) ^ (-563787076);
                    i6 = -582226033;
                    break;
                case -562743877:
                case 34188045:
                    ViewOnClickListenerC1958.m6429();
                    C0382.m1848();
                    iM2566 = (C0630.m2566("᩺۬") ^ i3) * (-3);
                    i5 = ((iM2566 ^ i4) * (-8707)) ^ (-1105472368);
                    i6 = 526577853;
                    break;
                case -454679479:
                case 1467180323:
                    C3746.m11360(textView, i);
                    C1128.m3853(textView2, i);
                    if (charSequence != null) {
                        iM2566 = (C0630.m2566("ܶܿ") ^ i4) * 35;
                        i5 = ((iM2566 ^ i3) * 2827) ^ (-909659756);
                        i6 = 1731676700;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۧۘ")) * (-45);
                        i5 = ((iM2566 ^ i4) * (-28223)) ^ (-563787076);
                        i6 = -582226033;
                    }
                    break;
                case -445809677:
                case 33172276:
                    i = 0;
                    iM2566 = C2105.m6981("᩻ۤ") ^ i4;
                    i5 = ((iM2566 ^ i3) * 32111) ^ (-2076165152);
                    i6 = -1412086879;
                    break;
                case 115471378:
                case 2113572413:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C2105.m6981("᩶ۙ") ^ i3) * (-87);
                        i5 = ((iM2566 ^ i4) * 22863) ^ (-278629741);
                        i6 = -719021561;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ۡ۟")) * 77;
                        i5 = ((iM2566 ^ i3) * 30651) ^ 1161738906;
                        i6 = -309191421;
                    }
                    break;
                case 407915409:
                case 2009744202:
                    if (C1504.f5354) {
                        iM2566 = (C0630.m2566("᩺۬") ^ i3) * (-3);
                        i5 = ((iM2566 ^ i4) * (-8707)) ^ (-1105472368);
                        i6 = 526577853;
                    } else {
                        iM2566 = C0630.m2566("᩵᩵") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-2651)) ^ (-146602468);
                        i6 = -958829813;
                    }
                    break;
                case 591412168:
                case 1618434535:
                    if (C1294.f4556 >= 0) {
                        iM2566 = C0630.m2566("ܶ᩷") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-24407)) ^ 17081751;
                        i6 = -733062744;
                    } else {
                        iM2566 = (C0630.m2566("᩺۬") ^ i3) * (-3);
                        i5 = ((iM2566 ^ i4) * (-8707)) ^ (-1105472368);
                        i6 = 526577853;
                    }
                    break;
                case 618100242:
                case 734048051:
                    C0964.m3413();
                    C1916.m6308();
                    break;
                case 942190296:
                case 2092273961:
                    if (C21923.f70183 == 0) {
                        iM2566 = (C2105.m6981("᩶ۙ") ^ i3) * (-87);
                        i5 = ((iM2566 ^ i4) * 22863) ^ (-278629741);
                        i6 = -719021561;
                    } else {
                        iM2566 = (C0630.m2566("᩺۬") ^ i3) * (-3);
                        i5 = ((iM2566 ^ i4) * (-8707)) ^ (-1105472368);
                        i6 = 526577853;
                    }
                    break;
                case 981416160:
                case 2049620519:
                    if (C1504.m5179()) {
                        iM2566 = (C2105.m6981("ۘ֡") ^ i4) * (-33);
                        i5 = ((iM2566 ^ i3) * (-23033)) ^ (-711413807);
                        i6 = -738617623;
                    } else {
                        iM2566 = C2105.m6981("ᩴᩳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 31649) ^ (-864292015);
                        i6 = -2146188771;
                    }
                    break;
                case 1136723237:
                case 1213752801:
                    if (C1047.f3863 >= 0) {
                        iM2566 = C2105.m6981("ᩴᩳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 31649) ^ (-864292015);
                        i6 = -2146188771;
                    } else {
                        iM2566 = C2105.m6981("۠ۖ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 18471) ^ (-831637157);
                        i6 = -395446331;
                    }
                    break;
                case 1183300682:
                case 1332293662:
                    i = 8;
                    iM2566 = C2105.m6981("᩻ۤ") ^ i4;
                    i5 = ((iM2566 ^ i3) * 32111) ^ (-2076165152);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21654(l.AbstractActivityC3346 r40, android.view.View r41, java.security.cert.X509Certificate r42) {
        /*
            Method dump skipped, instruction units count: 1858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8177.m21654(l.ۗܺ᩷, android.view.View, java.security.cert.X509Certificate):void");
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
    
        if (l.C0964.m3413() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0104, code lost:
    
        if (l.C0483.f2088 >= 0) goto L22;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m21662(C8177 c8177, AbstractActivityC3346 abstractActivityC3346) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int iM2567;
        int i5;
        int i6;
        int i7 = C3019.f9544;
        int i8 = C3911.f12484;
        int iM2568 = C0630.m2566("۫ᩴ") ^ i8;
        int i9 = ((iM2568 ^ i7) * 9907) ^ (-797439242);
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM2568 ^ 423271893;
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
        AbstractC15440 abstractC15440M11176 = null;
        AbstractC15440 abstractC15440 = null;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i7) * 20537) >> 31));
            switch (i15) {
                case -2094673638:
                case 1761852209:
                    C5695.m16023();
                    if (C2105.f7037 == 0) {
                        iM6981 = (i7 - C2105.m6981("ۡܰ")) * 49;
                        i = ((iM6981 ^ i8) * 10943) ^ (-1746779871);
                        i2 = 620677684;
                    } else {
                        iM6981 = C2105.m6981("ܰܳ") ^ i8;
                        i = ((iM6981 ^ i7) * 26679) ^ 246695820;
                        i2 = 116295578;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -2081698289:
                case -425875288:
                    i13 = 42471;
                    iM2566 = (C0630.m2566("ᩴۘ") ^ i8) * 27;
                    i3 = ((iM2566 ^ i7) * 17523) ^ (-104372947);
                    i4 = -1226554365;
                    i6 = iM2566 ^ i4;
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
                    if (C0382.f1805) {
                        iM2566 = (C2105.m6981("ᩴۡ") ^ i8) * 11;
                        i3 = ((iM2566 ^ i7) * 1509) ^ 1807573646;
                        i4 = -1557611959;
                    } else {
                        iM2566 = (C2105.m6981("ᩴۛ") ^ i7) * 9;
                        i3 = ((iM2566 ^ i8) * (-21255)) ^ (-557565151);
                        i4 = 867954942;
                    }
                    i6 = iM2566 ^ i4;
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
                    if (C1504.f5354) {
                        iM2566 = C2105.m6981("֡۫") ^ i7;
                        i3 = ((iM2566 ^ i8) * 21583) ^ (-1066950881);
                        i4 = -1691584015;
                    } else {
                        iM2566 = C0630.m2566("ۗ۬") ^ i8;
                        i3 = ((iM2566 ^ i7) * (-23679)) ^ (-326789724);
                        i4 = -1363082225;
                    }
                    i6 = iM2566 ^ i4;
                    c = c;
                    IOException iOException4 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException4;
                    break;
                case -1714528231:
                case -957745483:
                    C4616.m13552();
                    break;
                case -1672853466:
                case -111407031:
                    iOException = iOException;
                    c = c;
                    int i16 = s + s3;
                    if (i12 - (i16 * i16) > 0) {
                        iM2566 = (C0630.m2566("۫֡") + i7) * 109;
                        i3 = ((iM2566 ^ i8) * 13139) ^ (-17263642);
                        i4 = -1378959743;
                    } else {
                        iM2566 = (i8 - C0630.m2566("᩵ۤ")) * (-5);
                        i3 = ((iM2566 ^ i7) * (-11481)) ^ 23590745;
                        i4 = 543247782;
                    }
                    i6 = iM2566 ^ i4;
                    c = c;
                    IOException iOException5 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException5;
                    break;
                case -1661483947:
                case 1988969835:
                    C0050.m940();
                    break;
                case -1629842972:
                case -280540824:
                    iOException = iOException;
                    c = c;
                    abstractC15440 = C16293.f50110;
                    sArr2 = f25173;
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C0630.m2566("ۚۚ") + i8) * 45;
                        i3 = ((iM2566 ^ i7) * (-16649)) ^ (-492662464);
                        i4 = -573378857;
                    } else {
                        iM2566 = C2105.m6981("ۖᩳ") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-24319)) ^ 891392359;
                        i4 = -1529381980;
                    }
                    i6 = iM2566 ^ i4;
                    c = c;
                    IOException iOException6 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException6;
                    break;
                case -1513389985:
                case -1404974726:
                    C2105.m6982();
                    if (C4263.f13799 > 0) {
                        iOException = iOException;
                        c = c;
                        iM2566 = C2105.m6981("֡۫") ^ i7;
                        i3 = ((iM2566 ^ i8) * 21583) ^ (-1066950881);
                        i4 = -1691584015;
                        i6 = iM2566 ^ i4;
                        c = c;
                        IOException iOException7 = iOException;
                        i10 = i6;
                        i9 = i3;
                        iOException = iOException7;
                    }
                    iOException = iOException;
                    c = c;
                    iM2566 = C2105.m6981("۟ۡ") ^ i7;
                    i3 = ((iM2566 ^ i8) * (-8477)) ^ (-1395220306);
                    i4 = 1175339881;
                    i6 = iM2566 ^ i4;
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
                    if (C1711.m5736() <= 0) {
                        iM2566 = (C0630.m2566("ܿܰ") + i8) * 123;
                        i3 = ((iM2566 ^ i7) * (-1291)) ^ (-509772737);
                        i4 = 1247358429;
                    } else {
                        iM2566 = (C0630.m2566("ܶܶ") + i8) * 5;
                        i3 = ((iM2566 ^ i7) * (-9517)) ^ (-1084091702);
                        i4 = -1688155798;
                    }
                    i6 = iM2566 ^ i4;
                    c = c;
                    IOException iOException9 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException9;
                    break;
                case -1428567951:
                case 25209319:
                    if (C1773.m5908() > 0) {
                        iM6981 = C2105.m6981("ܰ᩶") ^ i8;
                        i = ((iM6981 ^ i7) * 21671) ^ 1133745913;
                        i2 = 2133704522;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        iOException = iOException;
                        c = c;
                        iM2566 = (C0630.m2566("ܿܰ") + i8) * 123;
                        i3 = ((iM2566 ^ i7) * (-1291)) ^ (-509772737);
                        i4 = 1247358429;
                        i6 = iM2566 ^ i4;
                        c = c;
                        IOException iOException10 = iOException;
                        i10 = i6;
                        i9 = i3;
                        iOException = iOException10;
                    }
                    break;
                case -1414590085:
                case 804931040:
                    C21923.m49329();
                    break;
                case -1208332182:
                case -536000628:
                    C22628.m50615();
                    if (C7106.m19120() <= 0) {
                        iM6981 = (i7 - C2105.m6981("ۡܰ")) * 49;
                        i = ((iM6981 ^ i8) * 10943) ^ (-1746779871);
                        i2 = 620677684;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        iOException = iOException;
                        c = c;
                        iM2566 = (C0630.m2566("ܿܰ") + i8) * 123;
                        i3 = ((iM2566 ^ i7) * (-1291)) ^ (-509772737);
                        i4 = 1247358429;
                        i6 = iM2566 ^ i4;
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
                    iM2566 = (C0630.m2566("ᩴۘ") ^ i8) * 27;
                    i3 = ((iM2566 ^ i7) * 17523) ^ (-104372947);
                    i4 = -1226554365;
                    i6 = iM2566 ^ i4;
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
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = C2105.m6981("۟ۡ") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-8477)) ^ (-1395220306);
                        i4 = 1175339881;
                    } else {
                        iM2566 = C2105.m6981("֫ܳ") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-5285)) ^ (-244936976);
                        i4 = 352137041;
                    }
                    i6 = iM2566 ^ i4;
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
                    sArr = f25173;
                    if (C4075.m12263() <= 0) {
                        iM2566 = (C0630.m2566("ܿܰ") + i8) * 123;
                        i3 = ((iM2566 ^ i7) * (-1291)) ^ (-509772737);
                        i4 = 1247358429;
                    } else {
                        iM2566 = C2105.m6981("ۘᩳ") ^ i8;
                        i3 = ((iM2566 ^ i7) * 17611) ^ 852753360;
                        i4 = -1029349813;
                    }
                    i6 = iM2566 ^ i4;
                    c = c;
                    IOException iOException14 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException14;
                    break;
                case -180806980:
                case 196681806:
                    try {
                        abstractC15440M11176.mo35195();
                        C1420.m4904(abstractC15440M11176, c8177.f25174);
                        iOException = iOException;
                        Intent intent = new Intent(abstractActivityC3346, (Class<?>) ViewOnClickListenerC5396.class);
                        c = c;
                        try {
                            intent.setAction(C0964.m3396(f25173, 288, 26, i13));
                            intent.setData(abstractC15440M11176.m36522());
                            intent.putExtra(C2272.m7507(f25173, 314, 8, i13), true);
                            ServiceConnectionC3453.m10570(abstractActivityC3346, intent);
                            iM2566 = C0630.m2566("ᩴ֫") ^ i7;
                            i3 = ((iM2566 ^ i8) * (-12655)) ^ (-736118209);
                            i4 = -982783144;
                            i6 = iM2566 ^ i4;
                            c = c;
                            IOException iOException15 = iOException;
                            i10 = i6;
                            i9 = i3;
                            iOException = iOException15;
                        } catch (IOException e) {
                            e = e;
                            iOException = e;
                            int iM6982 = (i8 - C2105.m6981("ۡ᩸")) * (-105);
                            i10 = iM6982 ^ 308676221;
                            i9 = ((iM6982 ^ i7) * 22807) ^ (-1025754869);
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
                    if (C0382.f1805) {
                        iM2566 = (C2105.m6981("֡ᩴ") + i7) * 65;
                        i3 = ((iM2566 ^ i8) * (-27753)) ^ (-1591467949);
                        i4 = 524354772;
                    } else {
                        iM2566 = (C0630.m2566("ܿܰ") + i8) * 123;
                        i3 = ((iM2566 ^ i7) * (-1291)) ^ (-509772737);
                        i4 = 1247358429;
                    }
                    i6 = iM2566 ^ i4;
                    c = c;
                    IOException iOException16 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException16;
                    break;
                case 172126897:
                case 462368728:
                    C2520.m8026();
                    C11340.m28031();
                    iOException = iOException;
                    c = c;
                    iM2566 = C2105.m6981("۟ۡ") ^ i7;
                    i3 = ((iM2566 ^ i8) * (-8477)) ^ (-1395220306);
                    i4 = 1175339881;
                    i6 = iM2566 ^ i4;
                    c = c;
                    IOException iOException17 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException17;
                    break;
                case 460861944:
                case 1598029701:
                    if (C2958.f9394 < 0) {
                        iOException = iOException;
                        c = c;
                        iM2566 = (C0630.m2566("ۚۚ") + i8) * 45;
                        i3 = ((iM2566 ^ i7) * (-16649)) ^ (-492662464);
                        i4 = -573378857;
                        i6 = iM2566 ^ i4;
                        c = c;
                        IOException iOException18 = iOException;
                        i10 = i6;
                        i9 = i3;
                        iOException = iOException18;
                    }
                    iOException = iOException;
                    iM2567 = (i8 - C0630.m2566("ۜ᩹")) * (-27);
                    i3 = ((iM2567 ^ i7) * 9103) ^ 1777019185;
                    i5 = -1112859648;
                    i6 = iM2567 ^ i5;
                    IOException iOException19 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException19;
                    break;
                case 501372798:
                case 1232473975:
                    iOException = iOException;
                    c = c;
                    abstractC15440M11176 = C3663.m11176(abstractC15440, RunnableC0588.m2436(sArr2, i14, 9, i13));
                    iM2566 = (C0630.m2566("ۡۨ") + i8) * (-89);
                    i3 = ((iM2566 ^ i7) * (-6677)) ^ (-631649170);
                    i4 = -1325262486;
                    i6 = iM2566 ^ i4;
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
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("֡۫") ^ i7;
                        i3 = ((iM2566 ^ i8) * 21583) ^ (-1066950881);
                        i4 = -1691584015;
                    } else {
                        iM2566 = (C2105.m6981("ۜۙ") + i7) * 19;
                        i3 = ((iM2566 ^ i8) * (-8199)) ^ (-592265274);
                        i4 = 1254429808;
                    }
                    i6 = iM2566 ^ i4;
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
                    C4263.m12819();
                    if (C3432.f10845 < 0) {
                        iM6981 = C2105.m6981("۟ۖ") ^ i7;
                        i = ((iM6981 ^ i8) * (-11935)) ^ (-1149126300);
                        i2 = 1199086166;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        iOException = iOException;
                        c = c;
                        iM2566 = C2105.m6981("۟ۡ") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-8477)) ^ (-1395220306);
                        i4 = 1175339881;
                        i6 = iM2566 ^ i4;
                        c = c;
                        IOException iOException112 = iOException;
                        i10 = i6;
                        i9 = i3;
                        iOException = iOException112;
                    }
                    break;
                case 979107754:
                case 1599190287:
                    ServiceConnectionC3453.m10561(abstractActivityC3346, iOException, null);
                    break;
                case 1091330007:
                case 1216972001:
                    iOException = iOException;
                    c = c;
                    i11 = s * s2;
                    if (C0798.f2919) {
                        iM2566 = (C2105.m6981("ᩴۛ") ^ i7) * 9;
                        i3 = ((iM2566 ^ i8) * (-21255)) ^ (-557565151);
                        i4 = 867954942;
                    } else {
                        iM2566 = C0630.m2566("֨᩸") ^ i7;
                        i3 = ((iM2566 ^ i8) * 30387) ^ (-581029644);
                        i4 = -274199317;
                    }
                    i6 = iM2566 ^ i4;
                    c = c;
                    IOException iOException113 = iOException;
                    i10 = i6;
                    i9 = i3;
                    iOException = iOException113;
                    break;
                default:
                    iOException = iOException;
                    c = 278;
                    if (C2272.f7362) {
                        iM2567 = (i8 - C0630.m2566("ۜ᩹")) * (-27);
                        i3 = ((iM2567 ^ i7) * 9103) ^ 1777019185;
                        i5 = -1112859648;
                    } else {
                        iM2567 = (C0630.m2566("ۡ֨") ^ i7) * 45;
                        i3 = ((iM2567 ^ i8) * 8455) ^ 1273373776;
                        i5 = 1285539846;
                    }
                    i6 = iM2567 ^ i5;
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
