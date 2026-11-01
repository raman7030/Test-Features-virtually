package p067l;

import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.Serializable;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۜ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 760C */
/* JADX INFO: loaded from: classes3.dex */
public class C8818 extends AbstractC8202 {

    /* JADX INFO: renamed from: ۧܳᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f82035 = {2003, -25656, -25657, -25662, -25653, -3284, 5482, -4980, -15716, -15007, 702, 6115, 29547, 29540, 29537, 29544, 29548, 29567, 29546, 29560, 29536, 29544, 29539, 29561, 29542, 29544, 29544, 29565, 29516, 29565, 29542, 29534, 29540, 29546, 29519, 29537, 29538, 29550, 29542, 29522, 29567, 29475, 29561, 29536, 29565, 297, -27683, 22869, 26753, 31282, 24798, 31883};

    /* JADX INFO: renamed from: ۖ֫ */
    public AbstractC17043 f23936;

    /* JADX INFO: renamed from: ۘ֫ */
    public AbstractC17043 f23937;

    /* JADX INFO: renamed from: ܺ֫ */
    public C12842 f23938;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79714;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009b A[PHI: r3 r14 r15
      0x009b: PHI (r3v3 int) = (r3v2 int), (r3v5 int) binds: [B:12:0x0054, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r14v2 short[]) = (r14v1 short[]), (r14v4 short[]) binds: [B:12:0x0054, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r15v2 int) = (r15v1 int), (r15v4 int) binds: [B:12:0x0054, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x019a A[PHI: r9 r21
      0x019a: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:48:0x0198, B:33:0x00fd, B:15:0x005d, B:12:0x0054, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x019a: PHI (r21v3 int) = (r21v1 int), (r21v2 int), (r21v1 int), (r21v1 int), (r21v1 int) binds: [B:48:0x0198, B:33:0x00fd, B:15:0x005d, B:12:0x0054, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d2 A[PHI: r7 r8
      0x01d2: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:52:0x01d0, B:17:0x0061, B:15:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:52:0x01d0, B:17:0x0061, B:15:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0226 A[PHI: r2 r11 r12 r13 r22
      0x0226: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v1 java.lang.String), (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:60:0x0224, B:37:0x0122, B:29:0x00d7, B:23:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:60:0x0224, B:37:0x0122, B:29:0x00d7, B:23:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:60:0x0224, B:37:0x0122, B:29:0x00d7, B:23:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:60:0x0224, B:37:0x0122, B:29:0x00d7, B:23:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r22v5 char) = (r22v4 char), (r22v3 char), (r22v3 char), (r22v3 char) binds: [B:60:0x0224, B:37:0x0122, B:29:0x00d7, B:23:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x025a A[PHI: r5 r6 r16
      0x025a: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short) binds: [B:64:0x0258, B:56:0x0206, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short) binds: [B:64:0x0258, B:56:0x0206, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x0258, B:56:0x0206, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        int iM55680;
        int i;
        int i2;
        String strM56132 = null;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = -1109636309;
        int i11 = C1071.f81975;
        int i12 = C1028.f81950;
        int iM55681 = C0873.m55680("ۨۖ") ^ i11;
        int i13 = ((iM55681 ^ i12) * (-11229)) ^ 1842123881;
        int i14 = iM55681 ^ 1124548629;
        short[] sArr3 = null;
        int i15 = 0;
        int iM55682 = 0;
        char c = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 31355) >> 31));
            switch (i10) {
                case -2094883660:
                case -474586750:
                    iM55682 = C0873.m55680(C1929.m56558(sArr, i7, i8, i6));
                    if (C1028.f81950 <= 0) {
                        iM55680 = (C0873.m55680("ۛܽ") ^ i11) * (-101);
                        i = ((iM55680 ^ i12) * (-26643)) ^ 1844321916;
                        i2 = 168138056;
                    } else {
                        iM55680 = (C0873.m55680("ۤܳ") + i11) * 109;
                        i = ((iM55680 ^ i12) * 25759) ^ (-1618639091);
                        i2 = 2066226958;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1944851094:
                case -1501405074:
                    i3 = s * s2;
                    i4 = s * s;
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0946.m55979("ᩴۘ") ^ i11;
                        i = ((iM55680 ^ i12) * (-27489)) ^ 1201343568;
                        i2 = -588900058;
                    } else {
                        iM55680 = (i11 - C0946.m55979("ܶۘ")) * (-121);
                        i = ((iM55680 ^ i12) * (-11995)) ^ (-575383804);
                        i2 = -1541117216;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1840812834:
                case -1335472188:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0873.m55680("ۛܽ") ^ i11) * (-101);
                        i = ((iM55680 ^ i12) * (-26643)) ^ 1844321916;
                        i2 = 168138056;
                    } else {
                        iM55680 = C0946.m55979("ۚۚ") ^ i12;
                        i = ((iM55680 ^ i11) * 2501) ^ (-610085230);
                        i2 = 1365167059;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1603146918:
                case 91473133:
                    C1028.m56239(this, iM55682 ^ 2102264257);
                    if (C1404.m56468()) {
                        iM55680 = (i11 - C0946.m55979("ۛۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM55680 ^ i12) * 255) ^ (-2047876502);
                        i2 = 1603743203;
                    } else {
                        iM55680 = (C0946.m55979("ۤ᩸") + i11) * (-25);
                        i = ((iM55680 ^ i12) * (-2457)) ^ 2058751973;
                        i2 = -2014739832;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1458359397:
                case 593312456:
                    sArr = f82035;
                    i7 = 46;
                    i8 = 3;
                    if (C0927.m55873() <= 0) {
                        iM55680 = (C0946.m55979("ۤ᩸") + i11) * (-25);
                        i = ((iM55680 ^ i12) * (-2457)) ^ 2058751973;
                        i2 = -2014739832;
                    } else {
                        iM55680 = C0946.m55979("᩻ۜ") ^ i12;
                        i = ((iM55680 ^ i11) * (-10291)) ^ (-1983232350);
                        i2 = -436670576;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1415048374:
                case 697658885:
                    s = sArr3[c];
                    s2 = 24266;
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("ۚۚ") ^ i12;
                        i = ((iM55680 ^ i11) * 2501) ^ (-610085230);
                        i2 = 1365167059;
                    } else {
                        iM55680 = (C0946.m55979("۠᩸") + i12) * 9;
                        i = ((iM55680 ^ i11) * (-28361)) ^ 467692407;
                        i2 = 297275663;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1305308290:
                case 2073486165:
                    C1404.m56468();
                    C0967.m56074();
                    iM55680 = C0946.m55979("ᩴۘ") ^ i11;
                    i = ((iM55680 ^ i12) * (-27489)) ^ 1201343568;
                    i2 = -588900058;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1286401113:
                case 1274647903:
                    strM56132 = C1003.m56132(sArr2, i9, i15, i6);
                    if (C0845.m55584() <= 0) {
                        iM55680 = (C0946.m55979("ۤ᩸") + i11) * (-25);
                        i = ((iM55680 ^ i12) * (-2457)) ^ 2058751973;
                        i2 = -2014739832;
                    } else {
                        iM55680 = C0946.m55979("᩸᩸") ^ i12;
                        i = ((iM55680 ^ i11) * (-17865)) ^ 772037860;
                        i2 = 1063469796;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -781852403:
                case -348455245:
                    i6 = 64696;
                    iM55680 = C0873.m55680("᩹᩻") ^ i11;
                    i = ((iM55680 ^ i12) * 20471) ^ (-634419310);
                    i2 = -1884577159;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -764957389:
                case 317474475:
                    if (i3 - (i4 + i5) <= 0) {
                        iM55680 = (i12 - C0946.m55979("ܰᩴ")) * 87;
                        i = ((iM55680 ^ i11) * (-29077)) ^ 1964184307;
                        i2 = -1997237839;
                    } else {
                        iM55680 = (i12 - C0946.m55979("ܰ۬")) * 73;
                        i = ((iM55680 ^ i11) * (-4153)) ^ (-811540119);
                        i2 = -2100189252;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -551812536:
                case 2071436806:
                    i6 = 3534;
                    iM55680 = C0873.m55680("᩹᩻") ^ i11;
                    i = ((iM55680 ^ i12) * 20471) ^ (-634419310);
                    i2 = -1884577159;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -521829485:
                case 1706836539:
                    sArr3 = f82035;
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0946.m55979("ۚۚ") ^ i12;
                        i = ((iM55680 ^ i11) * 2501) ^ (-610085230);
                        i2 = 1365167059;
                    } else {
                        iM55680 = (C0873.m55680("۫ۤ") + i11) * 99;
                        i = ((iM55680 ^ i12) * 17211) ^ 1906813866;
                        i2 = -1778971716;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -327445155:
                case 931616886:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0873.m55680("ۛܽ") ^ i11) * (-101);
                        i = ((iM55680 ^ i12) * (-26643)) ^ 1844321916;
                        i2 = 168138056;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ᩷") + i12) * 37;
                        i = ((iM55680 ^ i11) * (-16057)) ^ (-856454924);
                        i2 = -1067833806;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -178327737:
                case 1863038487:
                    c = '-';
                    if (C0861.f81831) {
                        iM55680 = (C0873.m55680("ܿۤ") + i12) * (-115);
                        i = ((iM55680 ^ i11) * (-27767)) ^ (-17459203);
                        i2 = 1616139048;
                    } else {
                        iM55680 = (C0946.m55979("ۤ᩸") + i11) * (-25);
                        i = ((iM55680 ^ i12) * (-2457)) ^ 2058751973;
                        i2 = -2014739832;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -94438142:
                case 2047684237:
                    C0946.m55980();
                    break;
                case 251138373:
                case 361034098:
                    i5 = 147209689;
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0873.m55680("ۛܽ") ^ i11) * (-101);
                        i = ((iM55680 ^ i12) * (-26643)) ^ 1844321916;
                        i2 = 168138056;
                    } else {
                        iM55680 = (i11 - C0946.m55979("᩻֫")) * (-57);
                        i = ((iM55680 ^ i12) * (-377)) ^ 348844011;
                        i2 = -1299915677;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case 498858943:
                case 1584301072:
                    C0898.m55800();
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("ᩴۘ") ^ i11;
                        i = ((iM55680 ^ i12) * (-27489)) ^ 1201343568;
                        i2 = -588900058;
                    } else {
                        iM55680 = (C0873.m55680("ۛܽ") ^ i11) * (-101);
                        i = ((iM55680 ^ i12) * (-26643)) ^ 1844321916;
                        i2 = 168138056;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case 1505314049:
                case 1679331606:
                    m13491(C0946.m55979(strM56132) ^ 2126646931);
                    break;
                default:
                    sArr2 = f82035;
                    i9 = 49;
                    i15 = 3;
                    if (C0992.f81922 >= 0) {
                        iM55680 = (C0946.m55979("ᩳ᩷") + i12) * 37;
                        i = ((iM55680 ^ i11) * (-16057)) ^ (-856454924);
                        i2 = -1067833806;
                    } else {
                        iM55680 = (C0873.m55680("ܿ۠") ^ i12) * 47;
                        i = ((iM55680 ^ i11) * (-4291)) ^ (-1725446956);
                        i2 = -1441880573;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws IOException {
        short s;
        int i;
        int iM55680;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM55979;
        int i6;
        int i7;
        String str;
        int iM559710;
        int i8;
        int i9;
        int iM55681;
        int i10;
        C8818 c8818 = this;
        int i11 = C1044.f81959;
        int i12 = C0992.f81922;
        int iM559711 = (C0946.m55979("ۚᩴ") + i12) * (-109);
        int i13 = ((iM559711 ^ i11) * (-9947)) ^ 1878535986;
        C13457 c13457M13469 = null;
        AbstractC17043 abstractC17043M38678 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i14 = iM559711 ^ 1308705320;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        short s2 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        String strM55635 = null;
        int i23 = 2045620574;
        Serializable serializableM13465 = null;
        String strM56276 = null;
        AbstractC17043 abstractC17043M13451 = null;
        C24911 c24911 = null;
        int i24 = 0;
        boolean zM56131 = false;
        while (true) {
            i23 = i14 ^ (i13 & (((i23 ^ i11) * (-23279)) >> 31));
            switch (i23) {
                case -2092004326:
                case 1336763432:
                    c24911 = new C24911(c8818);
                    strM56276 = C1044.m56276(f82035, 39, 2, i16);
                    if (c13457M13469 != null) {
                        iM55979 = C0946.m55979("ۘ۟") ^ i12;
                        i6 = ((iM55979 ^ i11) * (-30125)) ^ (-1884968622);
                        i7 = 1859874558;
                    } else {
                        iM55979 = C0873.m55680("ᩴ۫") ^ i11;
                        i6 = ((iM55979 ^ i12) * 31733) ^ (-760400829);
                        i7 = -437220937;
                    }
                    i14 = iM55979 ^ i7;
                    i13 = i6;
                    break;
                case -2089141239:
                case -1175221402:
                    abstractC17043M38678 = abstractC17043M13451.m38678(C1964.m56584(f82035, 41, 4, i16));
                    if (C0861.f81831) {
                        iM55979 = C0873.m55680("ۘ᩻") ^ i11;
                        i6 = ((iM55979 ^ i12) * 9629) ^ 289270565;
                        i7 = -588270288;
                    } else {
                        iM55979 = (C0873.m55680("۫ܳ") ^ i11) * (-101);
                        i6 = ((iM55979 ^ i12) * 29013) ^ 1641484177;
                        i7 = -1625070792;
                    }
                    i14 = iM55979 ^ i7;
                    i13 = i6;
                    break;
                case -1613507626:
                case 242370458:
                    i24 = i24;
                    sArr = sArr;
                    s2 = f82035[11];
                    if (C0892.f81851) {
                        iM55681 = C0873.m55680("ۗ۬") ^ i11;
                        i13 = ((iM55681 ^ i12) * (-7309)) ^ 823423731;
                        i10 = -1444305821;
                    } else {
                        iM55681 = C0946.m55979("֡֨") ^ i12;
                        i13 = ((iM55681 ^ i11) * 18205) ^ 2045438978;
                        i10 = -1093030319;
                    }
                    i = iM55681 ^ i10;
                    sArr = sArr;
                    i24 = i24;
                    i14 = i;
                    c8818 = this;
                    break;
                case -1582644295:
                case -513091190:
                    i16 = 58531;
                    iM55680 = C0873.m55680("ۢۧ") ^ i12;
                    i2 = ((iM55680 ^ i11) * 24569) ^ (-137269633);
                    i3 = -945970703;
                    i = iM55680 ^ i3;
                    strM55635 = strM55635;
                    i13 = i2;
                    sArr = sArr;
                    i24 = i24;
                    i14 = i;
                    c8818 = this;
                    break;
                case -1562495220:
                case 1540179661:
                    sArr = sArr;
                    serializableM13465 = c8818.m13465(C0930.m55893(sArr, i17, 8, i16));
                    if (C1036.f81953 < 0) {
                        int iM55682 = (C0873.m55680("ۖ֨") + i11) * 115;
                        sArr = sArr;
                        i4 = i24;
                        i14 = iM55682 ^ (-326778685);
                        i13 = ((iM55682 ^ i12) * 2861) ^ 434073104;
                        i24 = i4;
                    } else {
                        i24 = i24;
                        iM55681 = C0946.m55979("֡֨") ^ i12;
                        i13 = ((iM55681 ^ i11) * 18205) ^ 2045438978;
                        i10 = -1093030319;
                        i = iM55681 ^ i10;
                        sArr = sArr;
                        i24 = i24;
                        i14 = i;
                        c8818 = this;
                    }
                    break;
                case -1543146061:
                case 267749869:
                    i16 = 29453;
                    iM55680 = C0873.m55680("ۢۧ") ^ i12;
                    i2 = ((iM55680 ^ i11) * 24569) ^ (-137269633);
                    i3 = -945970703;
                    i = iM55680 ^ i3;
                    strM55635 = strM55635;
                    i13 = i2;
                    sArr = sArr;
                    i24 = i24;
                    i14 = i;
                    c8818 = this;
                    break;
                case -1393871640:
                case 1494146009:
                    C1929.m56553();
                    C0917.m55854();
                    i24 = i24;
                    str = strM55635;
                    iM559710 = C0946.m55979("ۛۡ") ^ i12;
                    i8 = ((iM559710 ^ i11) * 2775) ^ 1472842760;
                    i9 = -484875263;
                    i5 = iM559710 ^ i9;
                    strM55635 = str;
                    i13 = i8;
                    i4 = i24;
                    i14 = i5;
                    i24 = i4;
                    break;
                case -1384211918:
                case 143449279:
                    i24 = i24;
                    strM55635 = strM55635;
                    sArr = sArr;
                    i20 = i19 * i19;
                    i21 = s2 * s2;
                    i22 = 51022449;
                    if (C0854.m55595() < 0) {
                        iM55680 = C0873.m55680("ۗۖ") ^ i12;
                        i2 = ((iM55680 ^ i11) * (-18187)) ^ 391018338;
                        i3 = -906007365;
                        i = iM55680 ^ i3;
                        strM55635 = strM55635;
                        i13 = i2;
                        sArr = sArr;
                        i24 = i24;
                        i14 = i;
                        c8818 = this;
                    } else {
                        s = s2;
                        int iM559712 = C0946.m55979("ۨܽ") ^ i12;
                        s2 = s;
                        int i25 = ((iM559712 ^ i11) * 8119) ^ 1787431507;
                        i5 = iM559712 ^ (-144548158);
                        strM55635 = strM55635;
                        sArr = sArr;
                        i13 = i25;
                        c8818 = this;
                        i4 = i24;
                        i14 = i5;
                        i24 = i4;
                    }
                    break;
                case -1378942883:
                case 898878491:
                    c8818.f23938 = (C12842) serializableM13465;
                    if (C0967.f81910 < 0) {
                        iM55979 = (C0946.m55979("ܽܰ") + i12) * (-21);
                        i6 = ((iM55979 ^ i11) * 8329) ^ 533050238;
                        i7 = 842467835;
                        i14 = iM55979 ^ i7;
                        i13 = i6;
                    } else {
                        i24 = i24;
                        s = s2;
                        strM55635 = strM55635;
                        sArr = sArr;
                        int iM559713 = C0946.m55979("ۨܽ") ^ i12;
                        s2 = s;
                        int i26 = ((iM559713 ^ i11) * 8119) ^ 1787431507;
                        i5 = iM559713 ^ (-144548158);
                        strM55635 = strM55635;
                        sArr = sArr;
                        i13 = i26;
                        c8818 = this;
                        i4 = i24;
                        i14 = i5;
                        i24 = i4;
                    }
                    break;
                case -1281640006:
                case -437874651:
                    c13457M13469 = m13469();
                    sArr2 = f82035;
                    i18 = 24;
                    i24 = 15;
                    if (C0949.f81897 < 0) {
                        iM55979 = C0873.m55680("۠ᩳ") ^ i12;
                        i6 = ((iM55979 ^ i11) * (-22905)) ^ 11676160;
                        i7 = -1231353174;
                        i14 = iM55979 ^ i7;
                        i13 = i6;
                    } else {
                        sArr = sArr;
                        int iM559714 = C0946.m55979("᩺ۗ") ^ i11;
                        i13 = ((iM559714 ^ i12) * 16489) ^ 1824338814;
                        i14 = iM559714 ^ (-1336636484);
                        c8818 = this;
                        sArr = sArr;
                    }
                    break;
                case -987932361:
                case 1400411014:
                    C1071.m56343();
                    if (C0912.f81867 <= 0) {
                        sArr = sArr;
                        int iM559715 = C0946.m55979("᩺ۗ") ^ i11;
                        i13 = ((iM559715 ^ i12) * 16489) ^ 1824338814;
                        i14 = iM559715 ^ (-1336636484);
                        c8818 = this;
                        sArr = sArr;
                    } else {
                        i24 = i24;
                        str = strM55635;
                        iM559710 = C0946.m55979("ۛۡ") ^ i12;
                        i8 = ((iM559710 ^ i11) * 2775) ^ 1472842760;
                        i9 = -484875263;
                        i5 = iM559710 ^ i9;
                        strM55635 = str;
                        i13 = i8;
                        i4 = i24;
                        i14 = i5;
                        i24 = i4;
                    }
                    break;
                case -951631980:
                case -70181325:
                    c8818.mo13474(i15);
                    AbstractC17043 abstractC17043M38649 = abstractC17043M13451.m38649(strM56276);
                    c8818.f23936 = abstractC17043M38649;
                    C11896.m27215(c8818.f23937, abstractC17043M38649, c13457M13469, c8818);
                    iM55979 = C0873.m55680("֫ܿ") ^ i12;
                    i6 = ((iM55979 ^ i11) * (-2569)) ^ 1848608088;
                    i7 = -255644367;
                    i14 = iM55979 ^ i7;
                    i13 = i6;
                    break;
                case -767780034:
                case 708637764:
                    i24 = i24;
                    sArr = sArr;
                    strM55635 = C0863.m55635(f82035, 12, 4, i16);
                    if (C0890.f81849 == 0) {
                        iM55681 = (i12 - C0946.m55979("۠ܽ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i13 = ((iM55681 ^ i11) * 17519) ^ 2098565118;
                        i10 = -944775893;
                        i = iM55681 ^ i10;
                        sArr = sArr;
                        i24 = i24;
                        i14 = i;
                        c8818 = this;
                    } else {
                        i24 = i24;
                        int iM559716 = C0946.m55979("᩺ۗ") ^ i11;
                        i13 = ((iM559716 ^ i12) * 16489) ^ 1824338814;
                        i14 = iM559716 ^ (-1336636484);
                        c8818 = this;
                        sArr = sArr;
                    }
                    break;
                case -686664407:
                case 492966453:
                    return m13481();
                case -680033228:
                case 1985733445:
                    return C0912.m55832();
                case -478862508:
                case 1530555593:
                    zM56131 = C1003.m56131(c8818, C1404.m56462(sArr2, i18, i24, i16));
                    if (C0946.f81894 == 0) {
                        iM55979 = C0946.m55979("ܽ۫") ^ i11;
                        i6 = ((iM55979 ^ i12) * (-21233)) ^ 247237832;
                        i7 = -940141890;
                        i14 = iM55979 ^ i7;
                        i13 = i6;
                    } else {
                        i24 = i24;
                        sArr = sArr;
                        iM55681 = C0946.m55979("֡֨") ^ i12;
                        i13 = ((iM55681 ^ i11) * 18205) ^ 2045438978;
                        i10 = -1093030319;
                        i = iM55681 ^ i10;
                        sArr = sArr;
                        i24 = i24;
                        i14 = i;
                        c8818 = this;
                    }
                    break;
                case -130716847:
                case 1421101643:
                    c8818.f23937 = abstractC17043M38678;
                    i15 = 0;
                    C22230.m50069(abstractC17043M13451, abstractC17043M38678, false, c8818.f23938, c24911);
                    if (C0877.m55698(this)) {
                        iM55979 = (C0873.m55680("ۚۙ") + i12) * 9;
                        i6 = ((iM55979 ^ i11) * 23715) ^ (-1368566100);
                        i7 = 753823202;
                    } else {
                        iM55979 = (i11 - C0946.m55979("᩹֨")) * 93;
                        i6 = ((iM55979 ^ i12) * (-28933)) ^ (-250486448);
                        i7 = 1085174609;
                    }
                    i14 = iM55979 ^ i7;
                    i13 = i6;
                    break;
                case 113038997:
                case 610156436:
                    i24 = i24;
                    strM55635 = strM55635;
                    sArr = sArr;
                    int i27 = i21 + i22;
                    if (i20 - (i27 + i27) <= 0) {
                        iM55680 = (i11 - C0946.m55979("᩶ۙ")) * (-3);
                        i2 = ((iM55680 ^ i12) * 30507) ^ (-1672383611);
                        i3 = -1023603118;
                    } else {
                        iM55680 = C0946.m55979("֡ۙ") ^ i11;
                        i2 = ((iM55680 ^ i12) * (-14601)) ^ (-153719517);
                        i3 = 1764850954;
                    }
                    i = iM55680 ^ i3;
                    strM55635 = strM55635;
                    i13 = i2;
                    sArr = sArr;
                    i24 = i24;
                    i14 = i;
                    c8818 = this;
                    break;
                case 246953623:
                case 851339293:
                    ViewOnClickListenerC0939.m55941();
                    return null;
                case 448989799:
                case 1142476655:
                    if (C0992.f81922 >= 0) {
                        i24 = i24;
                        sArr = sArr;
                        iM55681 = C0946.m55979("֡֨") ^ i12;
                        i13 = ((iM55681 ^ i11) * 18205) ^ 2045438978;
                        i10 = -1093030319;
                        i = iM55681 ^ i10;
                        sArr = sArr;
                        i24 = i24;
                        i14 = i;
                        c8818 = this;
                    } else {
                        iM55979 = (C0873.m55680("۫ܳ") ^ i11) * (-101);
                        i6 = ((iM55979 ^ i12) * 29013) ^ 1641484177;
                        i7 = -1625070792;
                        i14 = iM55979 ^ i7;
                        i13 = i6;
                    }
                    break;
                case 565342030:
                case 1702829562:
                    i24 = i24;
                    strM55635 = strM55635;
                    sArr = sArr;
                    s = s2;
                    int i28 = s + 7143;
                    if (C1003.f81929 > 0) {
                        s2 = s;
                        int iM559717 = C0946.m55979("᩶ۖ") ^ i12;
                        strM55635 = strM55635;
                        i13 = ((iM559717 ^ i11) * (-31025)) ^ (-656718347);
                        i = iM559717 ^ (-449941905);
                        i19 = i28;
                        sArr = sArr;
                        i24 = i24;
                        i14 = i;
                        c8818 = this;
                    } else {
                        i19 = i28;
                        int iM559718 = C0946.m55979("ۨܽ") ^ i12;
                        s2 = s;
                        int i29 = ((iM559718 ^ i11) * 8119) ^ 1787431507;
                        i5 = iM559718 ^ (-144548158);
                        strM55635 = strM55635;
                        sArr = sArr;
                        i13 = i29;
                        c8818 = this;
                        i4 = i24;
                        i14 = i5;
                        i24 = i4;
                    }
                    break;
                case 909087408:
                case 1839768216:
                    AbstractC17043 abstractC17043M386410 = abstractC17043M13451.m38649(strM56276);
                    c8818.f23936 = abstractC17043M386410;
                    C22230.m50069(abstractC17043M13451, abstractC17043M386410, zM56131, c8818.f23938, c24911);
                    iM55979 = C0873.m55680("֫ܿ") ^ i12;
                    i6 = ((iM55979 ^ i11) * (-2569)) ^ 1848608088;
                    i7 = -255644367;
                    i14 = iM55979 ^ i7;
                    i13 = i6;
                    break;
                case 940351993:
                case 1759573946:
                    C0863.m55643();
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0873.m55680("۫ܳ") ^ i11) * (-101);
                        i6 = ((iM55979 ^ i12) * 29013) ^ 1641484177;
                        i7 = -1625070792;
                        i14 = iM55979 ^ i7;
                        i13 = i6;
                    } else {
                        i24 = i24;
                        str = strM55635;
                        iM559710 = C0946.m55979("ۛۡ") ^ i12;
                        i8 = ((iM559710 ^ i11) * 2775) ^ 1472842760;
                        i9 = -484875263;
                        i5 = iM559710 ^ i9;
                        strM55635 = str;
                        i13 = i8;
                        i4 = i24;
                        i14 = i5;
                        i24 = i4;
                    }
                    break;
                default:
                    i24 = i24;
                    str = strM55635;
                    abstractC17043M13451 = c8818.m13451(str);
                    sArr = f82035;
                    i17 = 16;
                    if (C1048.m56305() >= 0) {
                        iM559710 = C0946.m55979("ۛۡ") ^ i12;
                        i8 = ((iM559710 ^ i11) * 2775) ^ 1472842760;
                        i9 = -484875263;
                    } else {
                        iM559710 = (C0946.m55979("ۤܿ") ^ i11) * (-87);
                        i8 = ((iM559710 ^ i12) * 22235) ^ 206391464;
                        i9 = 169043191;
                    }
                    i5 = iM559710 ^ i9;
                    strM55635 = str;
                    i13 = i8;
                    i4 = i24;
                    i14 = i5;
                    i24 = i4;
                    break;
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        int i = -2068182829;
        int i2 = C1025.f81947;
        int i3 = C0989.f81920;
        int iM55979 = C0946.m55979("֡۫") ^ i2;
        int i4 = ((iM55979 ^ i3) * 25379) ^ (-2146621704);
        int i5 = -1559884406;
        while (true) {
            i = ((((i ^ i3) * 14289) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2041110531:
                case -1063080464:
                    if (C0894.m55769() >= 0) {
                        iM55979 = (C0946.m55979("۫ܶ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * 8997) ^ 1090213392;
                        i5 = 372525432;
                    } else {
                        iM55979 = (C0946.m55979("ܳ᩶") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i3) * (-27619)) ^ (-18964039);
                        i5 = 1975913021;
                    }
                    break;
                case -1887645036:
                case -895613723:
                    break;
                case -1669684283:
                case 1468102925:
                    if (C1003.m56123() != 0) {
                        iM55979 = (C0873.m55680("ۗ᩸") + i2) * (-79);
                        i4 = ((iM55979 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    } else {
                        iM55979 = (C0873.m55680("᩵֫") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i2) * 8471) ^ (-2018534873);
                        i5 = -65628758;
                    }
                    break;
                case -1576150376:
                case -8896090:
                    C1003.m56123();
                    iM55979 = (C0946.m55979("۫ܶ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i4 = ((iM55979 ^ i3) * 8997) ^ 1090213392;
                    i5 = 372525432;
                    break;
                case -1457875796:
                case -1255733650:
                    if (C1124.f82007 >= 0) {
                        iM55979 = (C0873.m55680("ۗ᩸") + i2) * (-79);
                        i4 = ((iM55979 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    } else {
                        iM55979 = (C0946.m55979("۫ܶ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * 8997) ^ 1090213392;
                        i5 = 372525432;
                    }
                    break;
                case -1417210131:
                case -1313239569:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0873.m55680("ۗ᩸") + i2) * (-79);
                        i4 = ((iM55979 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    } else {
                        iM55979 = (C0873.m55680("ܽ֨") ^ i2) * 7;
                        i4 = ((iM55979 ^ i3) * (-18027)) ^ 1795421139;
                        i5 = 1327894499;
                    }
                    break;
                case -1212435731:
                case 1094532447:
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0946.m55979("ۜ᩹") ^ i3) * (-55);
                        i4 = ((iM55979 ^ i2) * (-30901)) ^ 1568928351;
                        i5 = -528385740;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۘܺ")) * (-81);
                        i4 = ((iM55979 ^ i2) * (-2305)) ^ (-276077784);
                        i5 = -608610602;
                    }
                    break;
                case -1209561740:
                case -851976189:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0873.m55680("ۗ᩸") + i2) * (-79);
                        i4 = ((iM55979 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    } else {
                        iM55979 = C0873.m55680("ᩴܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 31369) ^ 874895695;
                        i5 = 2036849004;
                    }
                    break;
                case -1205032081:
                case -1046334305:
                    if (C0992.m56110(c18736)) {
                        iM55979 = C0873.m55680("ۛ᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29329)) ^ 1426801203;
                        i5 = -1527958546;
                    } else {
                        iM55979 = C0873.m55680("ۧܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-14933)) ^ (-1595258446);
                        i5 = 1069286209;
                    }
                    break;
                case -896595505:
                case -249862798:
                    if (C0955.f81898) {
                        iM55979 = (C0873.m55680("ۛ۟") ^ i2) * (-35);
                        i4 = ((iM55979 ^ i3) * (-20545)) ^ (-1049307174);
                        i5 = -1760486983;
                    } else {
                        iM55979 = C0873.m55680("᩶ܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-2053)) ^ (-1085276176);
                        i5 = 881055090;
                    }
                    break;
                case -527165271:
                case 112750043:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (C0946.m55979("۫ܶ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * 8997) ^ 1090213392;
                        i5 = 372525432;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩸᩷")) * 21;
                        i4 = ((iM55979 ^ i2) * 10373) ^ (-754331427);
                        i5 = 1712700812;
                    }
                    break;
                case 110511868:
                case 2143679624:
                    if (!C0949.m56012()) {
                        iM55979 = (C0946.m55979("۫ܶ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * 8997) ^ 1090213392;
                        i5 = 372525432;
                    } else {
                        iM55979 = (C0873.m55680("᩺ۙ") ^ i3) * (-97);
                        i4 = ((iM55979 ^ i2) * 23157) ^ (-2091038730);
                        i5 = 191844108;
                    }
                    break;
                case 246587035:
                case 356971764:
                    if (C0992.m56107() <= 0) {
                        iM55979 = (C0946.m55979("ۜ᩹") ^ i3) * (-55);
                        i4 = ((iM55979 ^ i2) * (-30901)) ^ 1568928351;
                        i5 = -528385740;
                    } else {
                        iM55979 = (C0873.m55680("ۗ᩸") + i2) * (-79);
                        i4 = ((iM55979 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    }
                    break;
                case 356226488:
                case 554892307:
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0873.m55680("ۗ᩸") + i2) * (-79);
                        i4 = ((iM55979 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    } else {
                        iM55979 = (C0946.m55979("᩸ۜ") ^ i2) * 123;
                        i4 = ((iM55979 ^ i3) * 12707) ^ (-1657228485);
                        i5 = -1227636784;
                    }
                    break;
                case 411261939:
                case 552442696:
                    RunnableC0871.m55675(c18107, C0892.m55744(this.f23936));
                    c18107.m41241();
                    iM55979 = C0873.m55680("ۧܺ") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-14933)) ^ (-1595258446);
                    i5 = 1069286209;
                    break;
                case 751561572:
                case 1349131516:
                    if (m13478(c18107)) {
                        iM55979 = (C0946.m55979("᩵᩵") + i3) * 29;
                        i4 = ((iM55979 ^ i2) * 27431) ^ (-213616607);
                        i5 = -440455053;
                    } else {
                        iM55979 = C0873.m55680("ۧܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-14933)) ^ (-1595258446);
                        i5 = 1069286209;
                    }
                    break;
                case 1452478784:
                case 2105790196:
                    if (C0894.m55769() >= 0) {
                        iM55979 = (C0873.m55680("᩺ۙ") ^ i3) * (-97);
                        i4 = ((iM55979 ^ i2) * 23157) ^ (-2091038730);
                        i5 = 191844108;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ܽܳ")) * (-91);
                        i4 = ((iM55979 ^ i3) * (-13223)) ^ (-949501351);
                        i5 = -452262303;
                    }
                    break;
                case 1566495182:
                case 2094634523:
                    RunnableC0938.m55938();
                    break;
                default:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0873.m55680("ۗ᩸") + i2) * (-79);
                        i4 = ((iM55979 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    } else {
                        iM55979 = (C0946.m55979("ۖ֫") + i3) * (-123);
                        i4 = ((iM55979 ^ i2) * (-20997)) ^ (-805941242);
                        i5 = -142949588;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        AbstractC17043 abstractC17043 = null;
        AbstractC17043 abstractC17044 = null;
        int i = 763439287;
        int i2 = C1229.f82066;
        int i3 = C1071.f81975;
        int iM55979 = C0946.m55979("ۤۤ") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-31515)) ^ (-203454120);
        int i5 = 1480707106;
        while (true) {
            i = ((((i ^ i3) * 26073) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2013883655:
                case -1526995598:
                    if (C0917.f81868) {
                        iM55979 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11411)) ^ 1598439941;
                        i5 = 193211229;
                    } else {
                        iM55979 = (C0873.m55680("ۛ᩻") ^ i3) * (-77);
                        i4 = ((iM55979 ^ i2) * 19261) ^ 1366426983;
                        i5 = -2140612020;
                    }
                    break;
                case -1526118157:
                case 535941710:
                    if (C1003.m56123() != 0) {
                        iM55979 = (C0873.m55680("ᩴۡ") + i3) * 95;
                        i4 = ((iM55979 ^ i2) * 5503) ^ (-12141964);
                        i5 = 112249516;
                    } else {
                        iM55979 = C0946.m55979("۟ܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 32129) ^ 515766331;
                        i5 = 353106946;
                    }
                    break;
                case -1398620243:
                case -229670766:
                    if (C0946.f81894 == 0) {
                        iM55979 = C0873.m55680("᩷۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 13301) ^ 1371649624;
                        i5 = -1016996834;
                    } else {
                        iM55979 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11411)) ^ 1598439941;
                        i5 = 193211229;
                    }
                    break;
                case -1206912514:
                case -374221339:
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0946.m55979("֫ۜ") ^ i2) * 31;
                        i4 = ((iM55979 ^ i3) * 9867) ^ 416261617;
                        i5 = 2119272056;
                    } else {
                        iM55979 = C0873.m55680("֨֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-26063)) ^ (-1098176482);
                        i5 = 732152355;
                    }
                    break;
                case -785102687:
                case 352528918:
                    C0863.m55636();
                    break;
                case -682789980:
                case 1223998788:
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0946.m55979("۫᩷") + i3) * (-21);
                        i4 = ((iM55979 ^ i2) * (-17161)) ^ 2107728537;
                        i5 = -929007232;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۧۙ")) * 123;
                        i4 = ((iM55979 ^ i3) * (-12675)) ^ (-645657684);
                        i5 = 13690256;
                    }
                    break;
                case -639970548:
                case 1628994752:
                    if (RunnableC0897.f81856) {
                        iM55979 = C0873.m55680("۟۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25721) ^ 1263541556;
                        i5 = -402446483;
                    } else {
                        iM55979 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11411)) ^ 1598439941;
                        i5 = 193211229;
                    }
                    break;
                case -327000661:
                case -321206364:
                    if (C0861.f81831) {
                        iM55979 = (C0946.m55979("ۘۘ") ^ i3) * (-73);
                        i4 = ((iM55979 ^ i2) * 27173) ^ 1231199934;
                        i5 = -346386930;
                    } else {
                        iM55979 = (C0873.m55680("ᩴۡ") + i3) * 95;
                        i4 = ((iM55979 ^ i2) * 5503) ^ (-12141964);
                        i5 = 112249516;
                    }
                    break;
                case -248421151:
                case 199635170:
                    AbstractC0942.m55966(abstractC17043);
                    iM55979 = C0873.m55680("ۢ۟") ^ i2;
                    i4 = ((iM55979 ^ i3) * 21973) ^ (-815100555);
                    i5 = 1623478747;
                    break;
                case 49321670:
                case 1279851070:
                    AbstractC0942.m55966(abstractC17044);
                    iM55979 = (C0946.m55979("᩶ܰ") ^ i2) * 19;
                    i4 = ((iM55979 ^ i3) * (-18933)) ^ (-1306238260);
                    i5 = 780199891;
                    break;
                case 96729966:
                case 1922179600:
                    if (!C0892.m55749()) {
                        iM55979 = (C0873.m55680("ᩴۡ") + i3) * 95;
                        i4 = ((iM55979 ^ i2) * 5503) ^ (-12141964);
                        i5 = 112249516;
                    } else {
                        iM55979 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11411)) ^ 1598439941;
                        i5 = 193211229;
                    }
                    break;
                case 123633298:
                case 1563971281:
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55979 = C0873.m55680("᩷۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 13301) ^ 1371649624;
                        i5 = -1016996834;
                    } else {
                        iM55979 = (C0946.m55979("ۨۚ") + i2) * (-89);
                        i4 = ((iM55979 ^ i3) * (-25255)) ^ (-1305210856);
                        i5 = -836477557;
                    }
                    break;
                case 190086889:
                case 1509112263:
                    if (AbstractC0942.m55971()) {
                        iM55979 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11411)) ^ 1598439941;
                        i5 = 193211229;
                    } else {
                        iM55979 = C0946.m55979("ۡۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11439)) ^ 324542007;
                        i5 = 1850720164;
                    }
                    break;
                case 219719706:
                case 2114183962:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11411)) ^ 1598439941;
                        i5 = 193211229;
                    } else {
                        iM55979 = C0873.m55680("ܳᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6293)) ^ (-1390541580);
                        i5 = -504667300;
                    }
                    break;
                case 463157588:
                case 1047799445:
                    abstractC17043 = this.f23937;
                    if (abstractC17043 != null) {
                        iM55979 = C0946.m55979("ۨۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-3247)) ^ (-15841884);
                        i5 = 761082578;
                    } else {
                        iM55979 = C0873.m55680("ۢ۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 21973) ^ (-815100555);
                        i5 = 1623478747;
                    }
                    break;
                case 759114830:
                case 1751226255:
                    C0912.m55833();
                    break;
                case 782560258:
                case 1343971259:
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (C0873.m55680("ᩴۡ") + i3) * 95;
                        i4 = ((iM55979 ^ i2) * 5503) ^ (-12141964);
                        i5 = 112249516;
                    } else {
                        iM55979 = C0873.m55680("ܽᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21515) ^ 1012325939;
                        i5 = 568679045;
                    }
                    break;
                case 907849360:
                case 2123650471:
                    if (C1017.m56186(c18736)) {
                        iM55979 = (C0946.m55979("᩶ܰ") ^ i2) * 19;
                        i4 = ((iM55979 ^ i3) * (-18933)) ^ (-1306238260);
                        i5 = 780199891;
                    } else {
                        iM55979 = C0946.m55979("ۧۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-24357)) ^ 255350542;
                        i5 = 1148819000;
                    }
                    break;
                case 1656919080:
                case 1860707403:
                    abstractC17044 = this.f23936;
                    if (abstractC17044 != null) {
                        iM55979 = C0873.m55680("ܽۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-25449)) ^ (-1046324112);
                        i5 = -1291799362;
                    } else {
                        iM55979 = (C0946.m55979("᩶ܰ") ^ i2) * 19;
                        i4 = ((iM55979 ^ i3) * (-18933)) ^ (-1306238260);
                        i5 = 780199891;
                    }
                    break;
                case 1717194143:
                case 2053540967:
                    C1017.m56187();
                    iM55979 = C0946.m55979("ۘ֫") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-11411)) ^ 1598439941;
                    i5 = 193211229;
                    break;
                default:
                    if (C1017.f81942 < 0) {
                        iM55979 = (C0946.m55979("֫ۜ") ^ i2) * 31;
                        i4 = ((iM55979 ^ i3) * 9867) ^ 416261617;
                        i5 = 2119272056;
                    } else {
                        iM55979 = C0873.m55680("᩷۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 13301) ^ 1371649624;
                        i5 = -1016996834;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f9 A[PHI: r4
      0x00f9: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:32:0x00f7, B:15:0x0076, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0202 A[PHI: r1 r10
      0x0202: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v4 java.lang.String), (r1v2 java.lang.String) binds: [B:55:0x0200, B:40:0x016b, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:55:0x0200, B:40:0x016b, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0237 A[PHI: r22
      0x0237: PHI (r22v5 short) = (r22v4 short), (r22v3 short), (r22v3 short), (r22v3 short) binds: [B:59:0x0235, B:17:0x007a, B:15:0x0076, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x026d A[PHI: r3 r11 r12 r15 r16 r17
      0x026d: PHI (r3v3 java.lang.String[]) = (r3v2 java.lang.String[]), (r3v2 java.lang.String[]), (r3v2 java.lang.String[]), (r3v4 java.lang.String[]) binds: [B:63:0x026b, B:51:0x01e2, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:63:0x026b, B:51:0x01e2, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:63:0x026b, B:51:0x01e2, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:63:0x026b, B:51:0x01e2, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x026b, B:51:0x01e2, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:63:0x026b, B:51:0x01e2, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        int iM55979;
        int i;
        int i2;
        int i3 = RunnableC0871.f81839;
        int i4 = C1003.f81929;
        int iM559710 = C0946.m55979("۫ܰ") ^ i4;
        int i5 = ((iM559710 ^ i3) * (-5123)) ^ 1556195296;
        String strM56102 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM559710 ^ (-945906998);
        int iM559711 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        int i13 = 1198365214;
        short s = 0;
        String[] strArr = null;
        short[] sArr3 = null;
        int i14 = 0;
        String strM13453 = null;
        String strM55592 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 5349) >> 31));
            switch (i13) {
                case -2008948921:
                case -763443142:
                    C1964.m56597();
                    return null;
                case -1833865112:
                case 1758727941:
                    i14 = 10243;
                    iM55979 = (C0946.m55979("ᩴܶ") + i3) * 109;
                    i = ((iM55979 ^ i4) * (-23095)) ^ (-823445563);
                    i2 = -322049246;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1499262416:
                case -20242580:
                    i14 = 39854;
                    iM55979 = (C0946.m55979("ᩴܶ") + i3) * 109;
                    i = ((iM55979 ^ i4) * (-23095)) ^ (-823445563);
                    i2 = -322049246;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1255585615:
                case 2125125372:
                    if (i11 - (i12 + 1) < 0) {
                        iM55979 = (C0946.m55979("ܳ۬") + i4) * 79;
                        i = ((iM55979 ^ i3) * (-28879)) ^ 1310848781;
                        i2 = -882030902;
                    } else {
                        iM55979 = C0946.m55979("ۛۤ") ^ i3;
                        i = ((iM55979 ^ i4) * 8223) ^ 1544213582;
                        i2 = 1062745846;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1250973762:
                case 451928679:
                    C0882.m55710();
                    if (C0937.f81884) {
                        iM55979 = C0873.m55680("᩻ۗ") ^ i4;
                        i = ((iM55979 ^ i3) * 3997) ^ 1579411468;
                        i2 = -579414579;
                    } else {
                        iM55979 = C0873.m55680("ܿ᩻") ^ i3;
                        i = ((iM55979 ^ i4) * (-20011)) ^ 120039382;
                        i2 = 1278139682;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1113303738:
                case -254355103:
                    iM559711 = C0946.m55979(strM56102);
                    i7 = 2122848326;
                    if (C0992.f81922 < 0) {
                        iM55979 = C0946.m55979("ۘۤ") ^ i3;
                        i = ((iM55979 ^ i4) * (-21455)) ^ 1457069629;
                        i2 = -1729322731;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM559712 = C0946.m55979("ۨۚ") ^ i4;
                        i5 = ((iM559712 ^ i3) * 24581) ^ 943721936;
                        i6 = iM559712 ^ (-1760156892);
                    }
                    break;
                case -1083384551:
                case -343126028:
                    if (C0949.f81897 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ܽ֡")) * 25;
                        i = ((iM55979 ^ i4) * (-16067)) ^ 463213394;
                        i2 = -2117837068;
                    } else {
                        iM55979 = C0873.m55680("᩻ۗ") ^ i4;
                        i = ((iM55979 ^ i3) * 3997) ^ 1579411468;
                        i2 = -579414579;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -947456915:
                case -107665623:
                    i11 = i10 * i10;
                    i12 = s * 2;
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0873.m55680("ܿ᩻") ^ i3;
                        i = ((iM55979 ^ i4) * (-20011)) ^ 120039382;
                        i2 = 1278139682;
                    } else {
                        iM55979 = C0946.m55979("֨ۘ") ^ i4;
                        i = ((iM55979 ^ i3) * (-28683)) ^ (-1039223762);
                        i2 = -1756322071;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -707405423:
                case 440259440:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ܽ֡")) * 25;
                        i = ((iM55979 ^ i4) * (-16067)) ^ 463213394;
                        i2 = -2117837068;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩸ۤ")) * (-75);
                        i = ((iM55979 ^ i4) * 18859) ^ 1894091088;
                        i2 = 1534221638;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -674091737:
                case 2103571391:
                    strM55592 = C0845.m55592(f82035, 1, 4, i14);
                    if (C0992.f81922 >= 0) {
                        iM55979 = (i3 - C0873.m55680("᩸ۤ")) * (-75);
                        i = ((iM55979 ^ i4) * 18859) ^ 1894091088;
                        i2 = 1534221638;
                    } else {
                        iM55979 = C0873.m55680("ܺ۟") ^ i4;
                        i = ((iM55979 ^ i3) * (-9155)) ^ 407499605;
                        i2 = 476123210;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -564377189:
                case 1067619108:
                    i8 = 8;
                    i9 = 3;
                    if (C1964.f83032 > 0) {
                        iM55979 = C0873.m55680("۬ۢ") ^ i4;
                        i = ((iM55979 ^ i3) * 30335) ^ 352777988;
                        i2 = 2440883;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM559713 = C0946.m55979("ۨۚ") ^ i4;
                        i5 = ((iM559713 ^ i3) * 24581) ^ 943721936;
                        i6 = iM559713 ^ (-1760156892);
                    }
                    break;
                case -437838073:
                case 583946301:
                    sArr = f82035;
                    c = 0;
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0873.m55680("ܿ᩻") ^ i3;
                        i = ((iM55979 ^ i4) * (-20011)) ^ 120039382;
                        i2 = 1278139682;
                    } else {
                        iM55979 = (C0946.m55979("ܰۤ") + i4) * (-119);
                        i = ((iM55979 ^ i3) * 3285) ^ (-361630390);
                        i2 = -951209843;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -340667532:
                case 1811197648:
                    i10 = s + 1;
                    if (C1036.f81953 >= 0) {
                        iM55979 = (i3 - C0873.m55680("᩸ۤ")) * (-75);
                        i = ((iM55979 ^ i4) * 18859) ^ 1894091088;
                        i2 = 1534221638;
                    } else {
                        iM55979 = (i3 - C0946.m55979("֨ۛ")) * (-113);
                        i = ((iM55979 ^ i4) * (-15289)) ^ 932964208;
                        i2 = -812489687;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -15944167:
                case 931623546:
                    C0930.m55885();
                    iM55979 = (i3 - C0946.m55979("ܽ֡")) * 25;
                    i = ((iM55979 ^ i4) * (-16067)) ^ 463213394;
                    i2 = -2117837068;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 487735142:
                case 576502701:
                    return C1003.m56122(C0946.m55979(C1024.m56203(sArr2, i8, i9, i14)) ^ 2118705918, strArr);
                case 1041804999:
                case 2058477704:
                    strM13453 = m13453(strM55592);
                    sArr3 = f82035;
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = C0946.m55979("ܿ᩵") ^ i3;
                        i = ((iM55979 ^ i4) * (-315)) ^ 1602527024;
                        i2 = -238726056;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM559714 = C0946.m55979("ۨۚ") ^ i4;
                        i5 = ((iM559714 ^ i3) * 24581) ^ 943721936;
                        i6 = iM559714 ^ (-1760156892);
                    }
                    break;
                case 1046515825:
                case 1898893620:
                    s = sArr[c];
                    if (C1036.f81953 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ܽ֡")) * 25;
                        i = ((iM55979 ^ i4) * (-16067)) ^ 463213394;
                        i2 = -2117837068;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩹ۤ")) * 53;
                        i = ((iM55979 ^ i4) * (-21411)) ^ 1626590344;
                        i2 = -1955318364;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1748914401:
                case 1898775812:
                    strM56102 = C0992.m56102(sArr3, 5, 3, i14);
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0873.m55680("᩻ۗ") ^ i4;
                        i = ((iM55979 ^ i3) * 3997) ^ 1579411468;
                        i2 = -579414579;
                    } else {
                        iM55979 = (C0946.m55979("ۗۢ") + i4) * 59;
                        i = ((iM55979 ^ i3) * (-12281)) ^ (-941220667);
                        i2 = 50269504;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    strArr = new String[]{strM13453, ServiceConnectionC1013.m56156(iM559711 ^ i7)};
                    sArr2 = f82035;
                    if (C0927.f81875) {
                        iM55979 = C0873.m55680("ܿ᩻") ^ i3;
                        i = ((iM55979 ^ i4) * (-20011)) ^ 120039382;
                        i2 = 1278139682;
                    } else {
                        iM55979 = (C0946.m55979("᩶ۡ") ^ i4) * C0254q.f1218h;
                        i = ((iM55979 ^ i3) * (-18343)) ^ (-1337505049);
                        i2 = -362748781;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
