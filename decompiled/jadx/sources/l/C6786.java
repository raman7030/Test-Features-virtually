package l;

import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.Serializable;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۜ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 760C */
/* JADX INFO: loaded from: classes3.dex */
public class C6786 extends AbstractC6138 {

    /* JADX INFO: renamed from: ۧܳᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f21062 = {2003, -25656, -25657, -25662, -25653, -3284, 5482, -4980, -15716, -15007, 702, 6115, 29547, 29540, 29537, 29544, 29548, 29567, 29546, 29560, 29536, 29544, 29539, 29561, 29542, 29544, 29544, 29565, 29516, 29565, 29542, 29534, 29540, 29546, 29519, 29537, 29538, 29550, 29542, 29522, 29567, 29475, 29561, 29536, 29565, 297, -27683, 22869, 26753, 31282, 24798, 31883};

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f21063;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f21064;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public C11020 f21065;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76962;
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
    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        int iM2566;
        int i;
        int i2;
        String strM9934 = null;
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
        int i11 = C4616.f14690;
        int i12 = C3746.f11829;
        int iM2567 = C0630.m2566("ۨۖ") ^ i11;
        int i13 = ((iM2567 ^ i12) * (-11229)) ^ 1842123881;
        int i14 = iM2567 ^ 1124548629;
        short[] sArr3 = null;
        int i15 = 0;
        int iM2568 = 0;
        char c = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 31355) >> 31));
            switch (i10) {
                case -2094883660:
                case -474586750:
                    iM2568 = C0630.m2566(C21923.m49334(sArr, i7, i8, i6));
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C0630.m2566("ۛܽ") ^ i11) * (-101);
                        i = ((iM2566 ^ i12) * (-26643)) ^ 1844321916;
                        i2 = 168138056;
                    } else {
                        iM2566 = (C0630.m2566("ۤܳ") + i11) * 109;
                        i = ((iM2566 ^ i12) * 25759) ^ (-1618639091);
                        i2 = 2066226958;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -1944851094:
                case -1501405074:
                    i3 = s * s2;
                    i4 = s * s;
                    if (C4117.f13076 <= 0) {
                        iM2566 = C2105.m6981("ᩴۘ") ^ i11;
                        i = ((iM2566 ^ i12) * (-27489)) ^ 1201343568;
                        i2 = -588900058;
                    } else {
                        iM2566 = (i11 - C2105.m6981("ܶۘ")) * (-121);
                        i = ((iM2566 ^ i12) * (-11995)) ^ (-575383804);
                        i2 = -1541117216;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -1840812834:
                case -1335472188:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (C0630.m2566("ۛܽ") ^ i11) * (-101);
                        i = ((iM2566 ^ i12) * (-26643)) ^ 1844321916;
                        i2 = 168138056;
                    } else {
                        iM2566 = C2105.m6981("ۚۚ") ^ i12;
                        i = ((iM2566 ^ i11) * 2501) ^ (-610085230);
                        i2 = 1365167059;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -1603146918:
                case 91473133:
                    C3746.m11361(this, iM2568 ^ 2102264257);
                    if (C11340.m28031()) {
                        iM2566 = (i11 - C2105.m6981("ۛۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2566 ^ i12) * 255) ^ (-2047876502);
                        i2 = 1603743203;
                    } else {
                        iM2566 = (C2105.m6981("ۤ᩸") + i11) * (-25);
                        i = ((iM2566 ^ i12) * (-2457)) ^ 2058751973;
                        i2 = -2014739832;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -1458359397:
                case 593312456:
                    sArr = f21062;
                    i7 = 46;
                    i8 = 3;
                    if (C1711.m5736() <= 0) {
                        iM2566 = (C2105.m6981("ۤ᩸") + i11) * (-25);
                        i = ((iM2566 ^ i12) * (-2457)) ^ 2058751973;
                        i2 = -2014739832;
                    } else {
                        iM2566 = C2105.m6981("᩻ۜ") ^ i12;
                        i = ((iM2566 ^ i11) * (-10291)) ^ (-1983232350);
                        i2 = -436670576;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -1415048374:
                case 697658885:
                    s = sArr3[c];
                    s2 = 24266;
                    if (C3537.f11231 >= 0) {
                        iM2566 = C2105.m6981("ۚۚ") ^ i12;
                        i = ((iM2566 ^ i11) * 2501) ^ (-610085230);
                        i2 = 1365167059;
                    } else {
                        iM2566 = (C2105.m6981("۠᩸") + i12) * 9;
                        i = ((iM2566 ^ i11) * (-28361)) ^ 467692407;
                        i2 = 297275663;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -1305308290:
                case 2073486165:
                    C11340.m28031();
                    C2520.m8026();
                    iM2566 = C2105.m6981("ᩴۘ") ^ i11;
                    i = ((iM2566 ^ i12) * (-27489)) ^ 1201343568;
                    i2 = -588900058;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -1286401113:
                case 1274647903:
                    strM9934 = C3245.m9934(sArr2, i9, i15, i6);
                    if (C0050.m940() <= 0) {
                        iM2566 = (C2105.m6981("ۤ᩸") + i11) * (-25);
                        i = ((iM2566 ^ i12) * (-2457)) ^ 2058751973;
                        i2 = -2014739832;
                    } else {
                        iM2566 = C2105.m6981("᩸᩸") ^ i12;
                        i = ((iM2566 ^ i11) * (-17865)) ^ 772037860;
                        i2 = 1063469796;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -781852403:
                case -348455245:
                    i6 = 64696;
                    iM2566 = C0630.m2566("᩹᩻") ^ i11;
                    i = ((iM2566 ^ i12) * 20471) ^ (-634419310);
                    i2 = -1884577159;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -764957389:
                case 317474475:
                    if (i3 - (i4 + i5) <= 0) {
                        iM2566 = (i12 - C2105.m6981("ܰᩴ")) * 87;
                        i = ((iM2566 ^ i11) * (-29077)) ^ 1964184307;
                        i2 = -1997237839;
                    } else {
                        iM2566 = (i12 - C2105.m6981("ܰ۬")) * 73;
                        i = ((iM2566 ^ i11) * (-4153)) ^ (-811540119);
                        i2 = -2100189252;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -551812536:
                case 2071436806:
                    i6 = 3534;
                    iM2566 = C0630.m2566("᩹᩻") ^ i11;
                    i = ((iM2566 ^ i12) * 20471) ^ (-634419310);
                    i2 = -1884577159;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -521829485:
                case 1706836539:
                    sArr3 = f21062;
                    if (C5695.f17556 >= 0) {
                        iM2566 = C2105.m6981("ۚۚ") ^ i12;
                        i = ((iM2566 ^ i11) * 2501) ^ (-610085230);
                        i2 = 1365167059;
                    } else {
                        iM2566 = (C0630.m2566("۫ۤ") + i11) * 99;
                        i = ((iM2566 ^ i12) * 17211) ^ 1906813866;
                        i2 = -1778971716;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -327445155:
                case 931616886:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C0630.m2566("ۛܽ") ^ i11) * (-101);
                        i = ((iM2566 ^ i12) * (-26643)) ^ 1844321916;
                        i2 = 168138056;
                    } else {
                        iM2566 = (C2105.m6981("ᩳ᩷") + i12) * 37;
                        i = ((iM2566 ^ i11) * (-16057)) ^ (-856454924);
                        i2 = -1067833806;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -178327737:
                case 1863038487:
                    c = '-';
                    if (C0382.f1805) {
                        iM2566 = (C0630.m2566("ܿۤ") + i12) * (-115);
                        i = ((iM2566 ^ i11) * (-27767)) ^ (-17459203);
                        i2 = 1616139048;
                    } else {
                        iM2566 = (C2105.m6981("ۤ᩸") + i11) * (-25);
                        i = ((iM2566 ^ i12) * (-2457)) ^ 2058751973;
                        i2 = -2014739832;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -94438142:
                case 2047684237:
                    C2105.m6982();
                    break;
                case 251138373:
                case 361034098:
                    i5 = 147209689;
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C0630.m2566("ۛܽ") ^ i11) * (-101);
                        i = ((iM2566 ^ i12) * (-26643)) ^ 1844321916;
                        i2 = 168138056;
                    } else {
                        iM2566 = (i11 - C2105.m6981("᩻֫")) * (-57);
                        i = ((iM2566 ^ i12) * (-377)) ^ 348844011;
                        i2 = -1299915677;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case 498858943:
                case 1584301072:
                    C1128.m3851();
                    if (C0237.f1507 != 0) {
                        iM2566 = C2105.m6981("ᩴۘ") ^ i11;
                        i = ((iM2566 ^ i12) * (-27489)) ^ 1201343568;
                        i2 = -588900058;
                    } else {
                        iM2566 = (C0630.m2566("ۛܽ") ^ i11) * (-101);
                        i = ((iM2566 ^ i12) * (-26643)) ^ 1844321916;
                        i2 = 168138056;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case 1505314049:
                case 1679331606:
                    m11555(C2105.m6981(strM9934) ^ 2126646931);
                    break;
                default:
                    sArr2 = f21062;
                    i9 = 49;
                    i15 = 3;
                    if (C3019.f9544 >= 0) {
                        iM2566 = (C2105.m6981("ᩳ᩷") + i12) * 37;
                        i = ((iM2566 ^ i11) * (-16057)) ^ (-856454924);
                        i2 = -1067833806;
                    } else {
                        iM2566 = (C0630.m2566("ܿ۠") ^ i12) * 47;
                        i = ((iM2566 ^ i11) * (-4291)) ^ (-1725446956);
                        i2 = -1441880573;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws IOException {
        short s;
        int i;
        int iM2566;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM6981;
        int i6;
        int i7;
        String str;
        int iM6982;
        int i8;
        int i9;
        int iM2567;
        int i10;
        C6786 c6786 = this;
        int i11 = C4075.f12947;
        int i12 = C3019.f9544;
        int iM6983 = (C2105.m6981("ۚᩴ") + i12) * (-109);
        int i13 = ((iM6983 ^ i11) * (-9947)) ^ 1878535986;
        C11667 c11667M11533 = null;
        AbstractC15440 abstractC15440M36520 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i14 = iM6983 ^ 1308705320;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        short s2 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        String strM1955 = null;
        int i23 = 2045620574;
        Serializable serializableM11529 = null;
        String strM12252 = null;
        AbstractC15440 abstractC15440M11515 = null;
        C23719 c23719 = null;
        int i24 = 0;
        boolean zM9933 = false;
        while (true) {
            i23 = i14 ^ (i13 & (((i23 ^ i11) * (-23279)) >> 31));
            switch (i23) {
                case -2092004326:
                case 1336763432:
                    c23719 = new C23719(c6786);
                    strM12252 = C4075.m12252(f21062, 39, 2, i16);
                    if (c11667M11533 != null) {
                        iM6981 = C2105.m6981("ۘ۟") ^ i12;
                        i6 = ((iM6981 ^ i11) * (-30125)) ^ (-1884968622);
                        i7 = 1859874558;
                    } else {
                        iM6981 = C0630.m2566("ᩴ۫") ^ i11;
                        i6 = ((iM6981 ^ i12) * 31733) ^ (-760400829);
                        i7 = -437220937;
                    }
                    i14 = iM6981 ^ i7;
                    i13 = i6;
                    break;
                case -2089141239:
                case -1175221402:
                    abstractC15440M36520 = abstractC15440M11515.m36520(C22628.m50602(f21062, 41, 4, i16));
                    if (C0382.f1805) {
                        iM6981 = C0630.m2566("ۘ᩻") ^ i11;
                        i6 = ((iM6981 ^ i12) * 9629) ^ 289270565;
                        i7 = -588270288;
                    } else {
                        iM6981 = (C0630.m2566("۫ܳ") ^ i11) * (-101);
                        i6 = ((iM6981 ^ i12) * 29013) ^ 1641484177;
                        i7 = -1625070792;
                    }
                    i14 = iM6981 ^ i7;
                    i13 = i6;
                    break;
                case -1613507626:
                case 242370458:
                    i24 = i24;
                    sArr = sArr;
                    s2 = f21062[11];
                    if (C1005.f3721) {
                        iM2567 = C0630.m2566("ۗ۬") ^ i11;
                        i13 = ((iM2567 ^ i12) * (-7309)) ^ 823423731;
                        i10 = -1444305821;
                    } else {
                        iM2567 = C2105.m6981("֡֨") ^ i12;
                        i13 = ((iM2567 ^ i11) * 18205) ^ 2045438978;
                        i10 = -1093030319;
                    }
                    i = iM2567 ^ i10;
                    sArr = sArr;
                    i24 = i24;
                    i14 = i;
                    c6786 = this;
                    break;
                case -1582644295:
                case -513091190:
                    i16 = 58531;
                    iM2566 = C0630.m2566("ۢۧ") ^ i12;
                    i2 = ((iM2566 ^ i11) * 24569) ^ (-137269633);
                    i3 = -945970703;
                    i = iM2566 ^ i3;
                    strM1955 = strM1955;
                    i13 = i2;
                    sArr = sArr;
                    i24 = i24;
                    i14 = i;
                    c6786 = this;
                    break;
                case -1562495220:
                case 1540179661:
                    sArr = sArr;
                    serializableM11529 = c6786.m11529(C1773.m5917(sArr, i17, 8, i16));
                    if (C3911.f12484 < 0) {
                        int iM2568 = (C0630.m2566("ۖ֨") + i11) * 115;
                        sArr = sArr;
                        i4 = i24;
                        i14 = iM2568 ^ (-326778685);
                        i13 = ((iM2568 ^ i12) * 2861) ^ 434073104;
                        i24 = i4;
                    } else {
                        i24 = i24;
                        iM2567 = C2105.m6981("֡֨") ^ i12;
                        i13 = ((iM2567 ^ i11) * 18205) ^ 2045438978;
                        i10 = -1093030319;
                        i = iM2567 ^ i10;
                        sArr = sArr;
                        i24 = i24;
                        i14 = i;
                        c6786 = this;
                    }
                    break;
                case -1543146061:
                case 267749869:
                    i16 = 29453;
                    iM2566 = C0630.m2566("ۢۧ") ^ i12;
                    i2 = ((iM2566 ^ i11) * 24569) ^ (-137269633);
                    i3 = -945970703;
                    i = iM2566 ^ i3;
                    strM1955 = strM1955;
                    i13 = i2;
                    sArr = sArr;
                    i24 = i24;
                    i14 = i;
                    c6786 = this;
                    break;
                case -1393871640:
                case 1494146009:
                    C21923.m49329();
                    C1504.m5179();
                    i24 = i24;
                    str = strM1955;
                    iM6982 = C2105.m6981("ۛۡ") ^ i12;
                    i8 = ((iM6982 ^ i11) * 2775) ^ 1472842760;
                    i9 = -484875263;
                    i5 = iM6982 ^ i9;
                    strM1955 = str;
                    i13 = i8;
                    i4 = i24;
                    i14 = i5;
                    i24 = i4;
                    break;
                case -1384211918:
                case 143449279:
                    i24 = i24;
                    strM1955 = strM1955;
                    sArr = sArr;
                    i20 = i19 * i19;
                    i21 = s2 * s2;
                    i22 = 51022449;
                    if (C0237.m1481() < 0) {
                        iM2566 = C0630.m2566("ۗۖ") ^ i12;
                        i2 = ((iM2566 ^ i11) * (-18187)) ^ 391018338;
                        i3 = -906007365;
                        i = iM2566 ^ i3;
                        strM1955 = strM1955;
                        i13 = i2;
                        sArr = sArr;
                        i24 = i24;
                        i14 = i;
                        c6786 = this;
                    } else {
                        s = s2;
                        int iM6984 = C2105.m6981("ۨܽ") ^ i12;
                        s2 = s;
                        int i25 = ((iM6984 ^ i11) * 8119) ^ 1787431507;
                        i5 = iM6984 ^ (-144548158);
                        strM1955 = strM1955;
                        sArr = sArr;
                        i13 = i25;
                        c6786 = this;
                        i4 = i24;
                        i14 = i5;
                        i24 = i4;
                    }
                    break;
                case -1378942883:
                case 898878491:
                    c6786.f21065 = (C11020) serializableM11529;
                    if (C2520.f8000 < 0) {
                        iM6981 = (C2105.m6981("ܽܰ") + i12) * (-21);
                        i6 = ((iM6981 ^ i11) * 8329) ^ 533050238;
                        i7 = 842467835;
                        i14 = iM6981 ^ i7;
                        i13 = i6;
                    } else {
                        i24 = i24;
                        s = s2;
                        strM1955 = strM1955;
                        sArr = sArr;
                        int iM6985 = C2105.m6981("ۨܽ") ^ i12;
                        s2 = s;
                        int i26 = ((iM6985 ^ i11) * 8119) ^ 1787431507;
                        i5 = iM6985 ^ (-144548158);
                        strM1955 = strM1955;
                        sArr = sArr;
                        i13 = i26;
                        c6786 = this;
                        i4 = i24;
                        i14 = i5;
                        i24 = i4;
                    }
                    break;
                case -1281640006:
                case -437874651:
                    c11667M11533 = m11533();
                    sArr2 = f21062;
                    i18 = 24;
                    i24 = 15;
                    if (C2167.f7158 < 0) {
                        iM6981 = C0630.m2566("۠ᩳ") ^ i12;
                        i6 = ((iM6981 ^ i11) * (-22905)) ^ 11676160;
                        i7 = -1231353174;
                        i14 = iM6981 ^ i7;
                        i13 = i6;
                    } else {
                        sArr = sArr;
                        int iM6986 = C2105.m6981("᩺ۗ") ^ i11;
                        i13 = ((iM6986 ^ i12) * 16489) ^ 1824338814;
                        i14 = iM6986 ^ (-1336636484);
                        c6786 = this;
                        sArr = sArr;
                    }
                    break;
                case -987932361:
                case 1400411014:
                    C4616.m13552();
                    if (C1420.f5096 <= 0) {
                        sArr = sArr;
                        int iM6987 = C2105.m6981("᩺ۗ") ^ i11;
                        i13 = ((iM6987 ^ i12) * 16489) ^ 1824338814;
                        i14 = iM6987 ^ (-1336636484);
                        c6786 = this;
                        sArr = sArr;
                    } else {
                        i24 = i24;
                        str = strM1955;
                        iM6982 = C2105.m6981("ۛۡ") ^ i12;
                        i8 = ((iM6982 ^ i11) * 2775) ^ 1472842760;
                        i9 = -484875263;
                        i5 = iM6982 ^ i9;
                        strM1955 = str;
                        i13 = i8;
                        i4 = i24;
                        i14 = i5;
                        i24 = i4;
                    }
                    break;
                case -951631980:
                case -70181325:
                    c6786.mo11538(i15);
                    AbstractC15440 abstractC15440M36491 = abstractC15440M11515.m36491(strM12252);
                    c6786.f21063 = abstractC15440M36491;
                    C10025.m25198(c6786.f21064, abstractC15440M36491, c11667M11533, c6786);
                    iM6981 = C0630.m2566("֫ܿ") ^ i12;
                    i6 = ((iM6981 ^ i11) * (-2569)) ^ 1848608088;
                    i7 = -255644367;
                    i14 = iM6981 ^ i7;
                    i13 = i6;
                    break;
                case -767780034:
                case 708637764:
                    i24 = i24;
                    sArr = sArr;
                    strM1955 = C0422.m1955(f21062, 12, 4, i16);
                    if (C0964.f3626 == 0) {
                        iM2567 = (i12 - C2105.m6981("۠ܽ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i13 = ((iM2567 ^ i11) * 17519) ^ 2098565118;
                        i10 = -944775893;
                        i = iM2567 ^ i10;
                        sArr = sArr;
                        i24 = i24;
                        i14 = i;
                        c6786 = this;
                    } else {
                        i24 = i24;
                        int iM6988 = C2105.m6981("᩺ۗ") ^ i11;
                        i13 = ((iM6988 ^ i12) * 16489) ^ 1824338814;
                        i14 = iM6988 ^ (-1336636484);
                        c6786 = this;
                        sArr = sArr;
                    }
                    break;
                case -686664407:
                case 492966453:
                    return m11545();
                case -680033228:
                case 1985733445:
                    return C1420.m4912();
                case -478862508:
                case 1530555593:
                    zM9933 = C3245.m9933(c6786, C11340.m28025(sArr2, i18, i24, i16));
                    if (C2105.f7037 == 0) {
                        iM6981 = C2105.m6981("ܽ۫") ^ i11;
                        i6 = ((iM6981 ^ i12) * (-21233)) ^ 247237832;
                        i7 = -940141890;
                        i14 = iM6981 ^ i7;
                        i13 = i6;
                    } else {
                        i24 = i24;
                        sArr = sArr;
                        iM2567 = C2105.m6981("֡֨") ^ i12;
                        i13 = ((iM2567 ^ i11) * 18205) ^ 2045438978;
                        i10 = -1093030319;
                        i = iM2567 ^ i10;
                        sArr = sArr;
                        i24 = i24;
                        i14 = i;
                        c6786 = this;
                    }
                    break;
                case -130716847:
                case 1421101643:
                    c6786.f21064 = abstractC15440M36520;
                    i15 = 0;
                    C20898.m47739(abstractC15440M11515, abstractC15440M36520, false, c6786.f21065, c23719);
                    if (C0714.m2807(this)) {
                        iM6981 = (C0630.m2566("ۚۙ") + i12) * 9;
                        i6 = ((iM6981 ^ i11) * 23715) ^ (-1368566100);
                        i7 = 753823202;
                    } else {
                        iM6981 = (i11 - C2105.m6981("᩹֨")) * 93;
                        i6 = ((iM6981 ^ i12) * (-28933)) ^ (-250486448);
                        i7 = 1085174609;
                    }
                    i14 = iM6981 ^ i7;
                    i13 = i6;
                    break;
                case 113038997:
                case 610156436:
                    i24 = i24;
                    strM1955 = strM1955;
                    sArr = sArr;
                    int i27 = i21 + i22;
                    if (i20 - (i27 + i27) <= 0) {
                        iM2566 = (i11 - C2105.m6981("᩶ۙ")) * (-3);
                        i2 = ((iM2566 ^ i12) * 30507) ^ (-1672383611);
                        i3 = -1023603118;
                    } else {
                        iM2566 = C2105.m6981("֡ۙ") ^ i11;
                        i2 = ((iM2566 ^ i12) * (-14601)) ^ (-153719517);
                        i3 = 1764850954;
                    }
                    i = iM2566 ^ i3;
                    strM1955 = strM1955;
                    i13 = i2;
                    sArr = sArr;
                    i24 = i24;
                    i14 = i;
                    c6786 = this;
                    break;
                case 246953623:
                case 851339293:
                    ViewOnClickListenerC1958.m6429();
                    return null;
                case 448989799:
                case 1142476655:
                    if (C3019.f9544 >= 0) {
                        i24 = i24;
                        sArr = sArr;
                        iM2567 = C2105.m6981("֡֨") ^ i12;
                        i13 = ((iM2567 ^ i11) * 18205) ^ 2045438978;
                        i10 = -1093030319;
                        i = iM2567 ^ i10;
                        sArr = sArr;
                        i24 = i24;
                        i14 = i;
                        c6786 = this;
                    } else {
                        iM6981 = (C0630.m2566("۫ܳ") ^ i11) * (-101);
                        i6 = ((iM6981 ^ i12) * 29013) ^ 1641484177;
                        i7 = -1625070792;
                        i14 = iM6981 ^ i7;
                        i13 = i6;
                    }
                    break;
                case 565342030:
                case 1702829562:
                    i24 = i24;
                    strM1955 = strM1955;
                    sArr = sArr;
                    s = s2;
                    int i28 = s + 7143;
                    if (C3245.f10203 > 0) {
                        s2 = s;
                        int iM6989 = C2105.m6981("᩶ۖ") ^ i12;
                        strM1955 = strM1955;
                        i13 = ((iM6989 ^ i11) * (-31025)) ^ (-656718347);
                        i = iM6989 ^ (-449941905);
                        i19 = i28;
                        sArr = sArr;
                        i24 = i24;
                        i14 = i;
                        c6786 = this;
                    } else {
                        i19 = i28;
                        int iM69810 = C2105.m6981("ۨܽ") ^ i12;
                        s2 = s;
                        int i29 = ((iM69810 ^ i11) * 8119) ^ 1787431507;
                        i5 = iM69810 ^ (-144548158);
                        strM1955 = strM1955;
                        sArr = sArr;
                        i13 = i29;
                        c6786 = this;
                        i4 = i24;
                        i14 = i5;
                        i24 = i4;
                    }
                    break;
                case 909087408:
                case 1839768216:
                    AbstractC15440 abstractC15440M36492 = abstractC15440M11515.m36491(strM12252);
                    c6786.f21063 = abstractC15440M36492;
                    C20898.m47739(abstractC15440M11515, abstractC15440M36492, zM9933, c6786.f21065, c23719);
                    iM6981 = C0630.m2566("֫ܿ") ^ i12;
                    i6 = ((iM6981 ^ i11) * (-2569)) ^ 1848608088;
                    i7 = -255644367;
                    i14 = iM6981 ^ i7;
                    i13 = i6;
                    break;
                case 940351993:
                case 1759573946:
                    C0422.m1963();
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C0630.m2566("۫ܳ") ^ i11) * (-101);
                        i6 = ((iM6981 ^ i12) * 29013) ^ 1641484177;
                        i7 = -1625070792;
                        i14 = iM6981 ^ i7;
                        i13 = i6;
                    } else {
                        i24 = i24;
                        str = strM1955;
                        iM6982 = C2105.m6981("ۛۡ") ^ i12;
                        i8 = ((iM6982 ^ i11) * 2775) ^ 1472842760;
                        i9 = -484875263;
                        i5 = iM6982 ^ i9;
                        strM1955 = str;
                        i13 = i8;
                        i4 = i24;
                        i14 = i5;
                        i24 = i4;
                    }
                    break;
                default:
                    i24 = i24;
                    str = strM1955;
                    abstractC15440M11515 = c6786.m11515(str);
                    sArr = f21062;
                    i17 = 16;
                    if (C4159.m12565() >= 0) {
                        iM6982 = C2105.m6981("ۛۡ") ^ i12;
                        i8 = ((iM6982 ^ i11) * 2775) ^ 1472842760;
                        i9 = -484875263;
                    } else {
                        iM6982 = (C2105.m6981("ۤܿ") ^ i11) * (-87);
                        i8 = ((iM6982 ^ i12) * 22235) ^ 206391464;
                        i9 = 169043191;
                    }
                    i5 = iM6982 ^ i9;
                    strM1955 = str;
                    i13 = i8;
                    i4 = i24;
                    i14 = i5;
                    i24 = i4;
                    break;
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        int i = -2068182829;
        int i2 = C3683.f11629;
        int i3 = C2958.f9394;
        int iM6981 = C2105.m6981("֡۫") ^ i2;
        int i4 = ((iM6981 ^ i3) * 25379) ^ (-2146621704);
        int i5 = -1559884406;
        while (true) {
            i = ((((i ^ i3) * 14289) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2041110531:
                case -1063080464:
                    if (C1047.m3599() >= 0) {
                        iM6981 = (C2105.m6981("۫ܶ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * 8997) ^ 1090213392;
                        i5 = 372525432;
                    } else {
                        iM6981 = (C2105.m6981("ܳ᩶") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM6981 ^ i3) * (-27619)) ^ (-18964039);
                        i5 = 1975913021;
                    }
                    break;
                case -1887645036:
                case -895613723:
                    break;
                case -1669684283:
                case 1468102925:
                    if (C3245.m9925() != 0) {
                        iM6981 = (C0630.m2566("ۗ᩸") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    } else {
                        iM6981 = (C0630.m2566("᩵֫") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM6981 ^ i2) * 8471) ^ (-2018534873);
                        i5 = -65628758;
                    }
                    break;
                case -1576150376:
                case -8896090:
                    C3245.m9925();
                    iM6981 = (C2105.m6981("۫ܶ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i4 = ((iM6981 ^ i3) * 8997) ^ 1090213392;
                    i5 = 372525432;
                    break;
                case -1457875796:
                case -1255733650:
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C0630.m2566("ۗ᩸") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    } else {
                        iM6981 = (C2105.m6981("۫ܶ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * 8997) ^ 1090213392;
                        i5 = 372525432;
                    }
                    break;
                case -1417210131:
                case -1313239569:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C0630.m2566("ۗ᩸") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    } else {
                        iM6981 = (C0630.m2566("ܽ֨") ^ i2) * 7;
                        i4 = ((iM6981 ^ i3) * (-18027)) ^ 1795421139;
                        i5 = 1327894499;
                    }
                    break;
                case -1212435731:
                case 1094532447:
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C2105.m6981("ۜ᩹") ^ i3) * (-55);
                        i4 = ((iM6981 ^ i2) * (-30901)) ^ 1568928351;
                        i5 = -528385740;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۘܺ")) * (-81);
                        i4 = ((iM6981 ^ i2) * (-2305)) ^ (-276077784);
                        i5 = -608610602;
                    }
                    break;
                case -1209561740:
                case -851976189:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C0630.m2566("ۗ᩸") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    } else {
                        iM6981 = C0630.m2566("ᩴܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 31369) ^ 874895695;
                        i5 = 2036849004;
                    }
                    break;
                case -1205032081:
                case -1046334305:
                    if (C3019.m9258(c17222)) {
                        iM6981 = C0630.m2566("ۛ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29329)) ^ 1426801203;
                        i5 = -1527958546;
                    } else {
                        iM6981 = C0630.m2566("ۧܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14933)) ^ (-1595258446);
                        i5 = 1069286209;
                    }
                    break;
                case -896595505:
                case -249862798:
                    if (C2272.f7362) {
                        iM6981 = (C0630.m2566("ۛ۟") ^ i2) * (-35);
                        i4 = ((iM6981 ^ i3) * (-20545)) ^ (-1049307174);
                        i5 = -1760486983;
                    } else {
                        iM6981 = C0630.m2566("᩶ܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-2053)) ^ (-1085276176);
                        i5 = 881055090;
                    }
                    break;
                case -527165271:
                case 112750043:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (C2105.m6981("۫ܶ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * 8997) ^ 1090213392;
                        i5 = 372525432;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩸᩷")) * 21;
                        i4 = ((iM6981 ^ i2) * 10373) ^ (-754331427);
                        i5 = 1712700812;
                    }
                    break;
                case 110511868:
                case 2143679624:
                    if (!C2167.m7155()) {
                        iM6981 = (C2105.m6981("۫ܶ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * 8997) ^ 1090213392;
                        i5 = 372525432;
                    } else {
                        iM6981 = (C0630.m2566("᩺ۙ") ^ i3) * (-97);
                        i4 = ((iM6981 ^ i2) * 23157) ^ (-2091038730);
                        i5 = 191844108;
                    }
                    break;
                case 246587035:
                case 356971764:
                    if (C3019.m9255() <= 0) {
                        iM6981 = (C2105.m6981("ۜ᩹") ^ i3) * (-55);
                        i4 = ((iM6981 ^ i2) * (-30901)) ^ 1568928351;
                        i5 = -528385740;
                    } else {
                        iM6981 = (C0630.m2566("ۗ᩸") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    }
                    break;
                case 356226488:
                case 554892307:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C0630.m2566("ۗ᩸") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    } else {
                        iM6981 = (C2105.m6981("᩸ۜ") ^ i2) * 123;
                        i4 = ((iM6981 ^ i3) * 12707) ^ (-1657228485);
                        i5 = -1227636784;
                    }
                    break;
                case 411261939:
                case 552442696:
                    RunnableC0588.m2444(c16560, C1005.m3496(this.f21063));
                    c16560.m39015();
                    iM6981 = C0630.m2566("ۧܺ") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-14933)) ^ (-1595258446);
                    i5 = 1069286209;
                    break;
                case 751561572:
                case 1349131516:
                    if (m11542(c16560)) {
                        iM6981 = (C2105.m6981("᩵᩵") + i3) * 29;
                        i4 = ((iM6981 ^ i2) * 27431) ^ (-213616607);
                        i5 = -440455053;
                    } else {
                        iM6981 = C0630.m2566("ۧܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14933)) ^ (-1595258446);
                        i5 = 1069286209;
                    }
                    break;
                case 1452478784:
                case 2105790196:
                    if (C1047.m3599() >= 0) {
                        iM6981 = (C0630.m2566("᩺ۙ") ^ i3) * (-97);
                        i4 = ((iM6981 ^ i2) * 23157) ^ (-2091038730);
                        i5 = 191844108;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ܽܳ")) * (-91);
                        i4 = ((iM6981 ^ i3) * (-13223)) ^ (-949501351);
                        i5 = -452262303;
                    }
                    break;
                case 1566495182:
                case 2094634523:
                    RunnableC1937.m6387();
                    break;
                default:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C0630.m2566("ۗ᩸") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * 731) ^ (-1750660131);
                        i5 = 1990840232;
                    } else {
                        iM6981 = (C2105.m6981("ۖ֫") + i3) * (-123);
                        i4 = ((iM6981 ^ i2) * (-20997)) ^ (-805941242);
                        i5 = -142949588;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        AbstractC15440 abstractC15440 = null;
        AbstractC15440 abstractC15441 = null;
        int i = 763439287;
        int i2 = C7811.f24123;
        int i3 = C4616.f14690;
        int iM6981 = C2105.m6981("ۤۤ") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-31515)) ^ (-203454120);
        int i5 = 1480707106;
        while (true) {
            i = ((((i ^ i3) * 26073) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2013883655:
                case -1526995598:
                    if (C1504.f5354) {
                        iM6981 = C2105.m6981("ۘ֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11411)) ^ 1598439941;
                        i5 = 193211229;
                    } else {
                        iM6981 = (C0630.m2566("ۛ᩻") ^ i3) * (-77);
                        i4 = ((iM6981 ^ i2) * 19261) ^ 1366426983;
                        i5 = -2140612020;
                    }
                    break;
                case -1526118157:
                case 535941710:
                    if (C3245.m9925() != 0) {
                        iM6981 = (C0630.m2566("ᩴۡ") + i3) * 95;
                        i4 = ((iM6981 ^ i2) * 5503) ^ (-12141964);
                        i5 = 112249516;
                    } else {
                        iM6981 = C2105.m6981("۟ܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32129) ^ 515766331;
                        i5 = 353106946;
                    }
                    break;
                case -1398620243:
                case -229670766:
                    if (C2105.f7037 == 0) {
                        iM6981 = C0630.m2566("᩷۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 13301) ^ 1371649624;
                        i5 = -1016996834;
                    } else {
                        iM6981 = C2105.m6981("ۘ֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11411)) ^ 1598439941;
                        i5 = 193211229;
                    }
                    break;
                case -1206912514:
                case -374221339:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C2105.m6981("֫ۜ") ^ i2) * 31;
                        i4 = ((iM6981 ^ i3) * 9867) ^ 416261617;
                        i5 = 2119272056;
                    } else {
                        iM6981 = C0630.m2566("֨֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-26063)) ^ (-1098176482);
                        i5 = 732152355;
                    }
                    break;
                case -785102687:
                case 352528918:
                    C0422.m1956();
                    break;
                case -682789980:
                case 1223998788:
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C2105.m6981("۫᩷") + i3) * (-21);
                        i4 = ((iM6981 ^ i2) * (-17161)) ^ 2107728537;
                        i5 = -929007232;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۧۙ")) * 123;
                        i4 = ((iM6981 ^ i3) * (-12675)) ^ (-645657684);
                        i5 = 13690256;
                    }
                    break;
                case -639970548:
                case 1628994752:
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("۟۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * 25721) ^ 1263541556;
                        i5 = -402446483;
                    } else {
                        iM6981 = C2105.m6981("ۘ֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11411)) ^ 1598439941;
                        i5 = 193211229;
                    }
                    break;
                case -327000661:
                case -321206364:
                    if (C0382.f1805) {
                        iM6981 = (C2105.m6981("ۘۘ") ^ i3) * (-73);
                        i4 = ((iM6981 ^ i2) * 27173) ^ 1231199934;
                        i5 = -346386930;
                    } else {
                        iM6981 = (C0630.m2566("ᩴۡ") + i3) * 95;
                        i4 = ((iM6981 ^ i2) * 5503) ^ (-12141964);
                        i5 = 112249516;
                    }
                    break;
                case -248421151:
                case 199635170:
                    AbstractC2021.m6569(abstractC15440);
                    iM6981 = C0630.m2566("ۢ۟") ^ i2;
                    i4 = ((iM6981 ^ i3) * 21973) ^ (-815100555);
                    i5 = 1623478747;
                    break;
                case 49321670:
                case 1279851070:
                    AbstractC2021.m6569(abstractC15441);
                    iM6981 = (C2105.m6981("᩶ܰ") ^ i2) * 19;
                    i4 = ((iM6981 ^ i3) * (-18933)) ^ (-1306238260);
                    i5 = 780199891;
                    break;
                case 96729966:
                case 1922179600:
                    if (!C1005.m3501()) {
                        iM6981 = (C0630.m2566("ᩴۡ") + i3) * 95;
                        i4 = ((iM6981 ^ i2) * 5503) ^ (-12141964);
                        i5 = 112249516;
                    } else {
                        iM6981 = C2105.m6981("ۘ֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11411)) ^ 1598439941;
                        i5 = 193211229;
                    }
                    break;
                case 123633298:
                case 1563971281:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6981 = C0630.m2566("᩷۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 13301) ^ 1371649624;
                        i5 = -1016996834;
                    } else {
                        iM6981 = (C2105.m6981("ۨۚ") + i2) * (-89);
                        i4 = ((iM6981 ^ i3) * (-25255)) ^ (-1305210856);
                        i5 = -836477557;
                    }
                    break;
                case 190086889:
                case 1509112263:
                    if (AbstractC2021.m6574()) {
                        iM6981 = C2105.m6981("ۘ֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11411)) ^ 1598439941;
                        i5 = 193211229;
                    } else {
                        iM6981 = C2105.m6981("ۡۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11439)) ^ 324542007;
                        i5 = 1850720164;
                    }
                    break;
                case 219719706:
                case 2114183962:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("ۘ֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11411)) ^ 1598439941;
                        i5 = 193211229;
                    } else {
                        iM6981 = C0630.m2566("ܳᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6293)) ^ (-1390541580);
                        i5 = -504667300;
                    }
                    break;
                case 463157588:
                case 1047799445:
                    abstractC15440 = this.f21064;
                    if (abstractC15440 != null) {
                        iM6981 = C2105.m6981("ۨۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-3247)) ^ (-15841884);
                        i5 = 761082578;
                    } else {
                        iM6981 = C0630.m2566("ۢ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21973) ^ (-815100555);
                        i5 = 1623478747;
                    }
                    break;
                case 759114830:
                case 1751226255:
                    C1420.m4913();
                    break;
                case 782560258:
                case 1343971259:
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = (C0630.m2566("ᩴۡ") + i3) * 95;
                        i4 = ((iM6981 ^ i2) * 5503) ^ (-12141964);
                        i5 = 112249516;
                    } else {
                        iM6981 = C0630.m2566("ܽᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21515) ^ 1012325939;
                        i5 = 568679045;
                    }
                    break;
                case 907849360:
                case 2123650471:
                    if (C3537.m10745(c17222)) {
                        iM6981 = (C2105.m6981("᩶ܰ") ^ i2) * 19;
                        i4 = ((iM6981 ^ i3) * (-18933)) ^ (-1306238260);
                        i5 = 780199891;
                    } else {
                        iM6981 = C2105.m6981("ۧۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-24357)) ^ 255350542;
                        i5 = 1148819000;
                    }
                    break;
                case 1656919080:
                case 1860707403:
                    abstractC15441 = this.f21063;
                    if (abstractC15441 != null) {
                        iM6981 = C0630.m2566("ܽۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-25449)) ^ (-1046324112);
                        i5 = -1291799362;
                    } else {
                        iM6981 = (C2105.m6981("᩶ܰ") ^ i2) * 19;
                        i4 = ((iM6981 ^ i3) * (-18933)) ^ (-1306238260);
                        i5 = 780199891;
                    }
                    break;
                case 1717194143:
                case 2053540967:
                    C3537.m10746();
                    iM6981 = C2105.m6981("ۘ֫") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-11411)) ^ 1598439941;
                    i5 = 193211229;
                    break;
                default:
                    if (C3537.f11231 < 0) {
                        iM6981 = (C2105.m6981("֫ۜ") ^ i2) * 31;
                        i4 = ((iM6981 ^ i3) * 9867) ^ 416261617;
                        i5 = 2119272056;
                    } else {
                        iM6981 = C0630.m2566("᩷۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 13301) ^ 1371649624;
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
    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        int iM6981;
        int i;
        int i2;
        int i3 = RunnableC0588.f2309;
        int i4 = C3245.f10203;
        int iM6982 = C2105.m6981("۫ܰ") ^ i4;
        int i5 = ((iM6982 ^ i3) * (-5123)) ^ 1556195296;
        String strM9250 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6982 ^ (-945906998);
        int iM6983 = 0;
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
        String strM11517 = null;
        String strM948 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 5349) >> 31));
            switch (i13) {
                case -2008948921:
                case -763443142:
                    C22628.m50615();
                    return null;
                case -1833865112:
                case 1758727941:
                    i14 = 10243;
                    iM6981 = (C2105.m6981("ᩴܶ") + i3) * 109;
                    i = ((iM6981 ^ i4) * (-23095)) ^ (-823445563);
                    i2 = -322049246;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1499262416:
                case -20242580:
                    i14 = 39854;
                    iM6981 = (C2105.m6981("ᩴܶ") + i3) * 109;
                    i = ((iM6981 ^ i4) * (-23095)) ^ (-823445563);
                    i2 = -322049246;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1255585615:
                case 2125125372:
                    if (i11 - (i12 + 1) < 0) {
                        iM6981 = (C2105.m6981("ܳ۬") + i4) * 79;
                        i = ((iM6981 ^ i3) * (-28879)) ^ 1310848781;
                        i2 = -882030902;
                    } else {
                        iM6981 = C2105.m6981("ۛۤ") ^ i3;
                        i = ((iM6981 ^ i4) * 8223) ^ 1544213582;
                        i2 = 1062745846;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1250973762:
                case 451928679:
                    C0798.m2998();
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("᩻ۗ") ^ i4;
                        i = ((iM6981 ^ i3) * 3997) ^ 1579411468;
                        i2 = -579414579;
                    } else {
                        iM6981 = C0630.m2566("ܿ᩻") ^ i3;
                        i = ((iM6981 ^ i4) * (-20011)) ^ 120039382;
                        i2 = 1278139682;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1113303738:
                case -254355103:
                    iM6983 = C2105.m6981(strM9250);
                    i7 = 2122848326;
                    if (C3019.f9544 < 0) {
                        iM6981 = C2105.m6981("ۘۤ") ^ i3;
                        i = ((iM6981 ^ i4) * (-21455)) ^ 1457069629;
                        i2 = -1729322731;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM6984 = C2105.m6981("ۨۚ") ^ i4;
                        i5 = ((iM6984 ^ i3) * 24581) ^ 943721936;
                        i6 = iM6984 ^ (-1760156892);
                    }
                    break;
                case -1083384551:
                case -343126028:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ܽ֡")) * 25;
                        i = ((iM6981 ^ i4) * (-16067)) ^ 463213394;
                        i2 = -2117837068;
                    } else {
                        iM6981 = C0630.m2566("᩻ۗ") ^ i4;
                        i = ((iM6981 ^ i3) * 3997) ^ 1579411468;
                        i2 = -579414579;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -947456915:
                case -107665623:
                    i11 = i10 * i10;
                    i12 = s * 2;
                    if (C3537.f11231 >= 0) {
                        iM6981 = C0630.m2566("ܿ᩻") ^ i3;
                        i = ((iM6981 ^ i4) * (-20011)) ^ 120039382;
                        i2 = 1278139682;
                    } else {
                        iM6981 = C2105.m6981("֨ۘ") ^ i4;
                        i = ((iM6981 ^ i3) * (-28683)) ^ (-1039223762);
                        i2 = -1756322071;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -707405423:
                case 440259440:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ܽ֡")) * 25;
                        i = ((iM6981 ^ i4) * (-16067)) ^ 463213394;
                        i2 = -2117837068;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩸ۤ")) * (-75);
                        i = ((iM6981 ^ i4) * 18859) ^ 1894091088;
                        i2 = 1534221638;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -674091737:
                case 2103571391:
                    strM948 = C0050.m948(f21062, 1, 4, i14);
                    if (C3019.f9544 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩸ۤ")) * (-75);
                        i = ((iM6981 ^ i4) * 18859) ^ 1894091088;
                        i2 = 1534221638;
                    } else {
                        iM6981 = C0630.m2566("ܺ۟") ^ i4;
                        i = ((iM6981 ^ i3) * (-9155)) ^ 407499605;
                        i2 = 476123210;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -564377189:
                case 1067619108:
                    i8 = 8;
                    i9 = 3;
                    if (C22628.f73083 > 0) {
                        iM6981 = C0630.m2566("۬ۢ") ^ i4;
                        i = ((iM6981 ^ i3) * 30335) ^ 352777988;
                        i2 = 2440883;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM6985 = C2105.m6981("ۨۚ") ^ i4;
                        i5 = ((iM6985 ^ i3) * 24581) ^ 943721936;
                        i6 = iM6985 ^ (-1760156892);
                    }
                    break;
                case -437838073:
                case 583946301:
                    sArr = f21062;
                    c = 0;
                    if (C3019.f9544 >= 0) {
                        iM6981 = C0630.m2566("ܿ᩻") ^ i3;
                        i = ((iM6981 ^ i4) * (-20011)) ^ 120039382;
                        i2 = 1278139682;
                    } else {
                        iM6981 = (C2105.m6981("ܰۤ") + i4) * (-119);
                        i = ((iM6981 ^ i3) * 3285) ^ (-361630390);
                        i2 = -951209843;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -340667532:
                case 1811197648:
                    i10 = s + 1;
                    if (C3911.f12484 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩸ۤ")) * (-75);
                        i = ((iM6981 ^ i4) * 18859) ^ 1894091088;
                        i2 = 1534221638;
                    } else {
                        iM6981 = (i3 - C2105.m6981("֨ۛ")) * (-113);
                        i = ((iM6981 ^ i4) * (-15289)) ^ 932964208;
                        i2 = -812489687;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -15944167:
                case 931623546:
                    C1773.m5908();
                    iM6981 = (i3 - C2105.m6981("ܽ֡")) * 25;
                    i = ((iM6981 ^ i4) * (-16067)) ^ 463213394;
                    i2 = -2117837068;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 487735142:
                case 576502701:
                    return C3245.m9924(C2105.m6981(C3663.m11162(sArr2, i8, i9, i14)) ^ 2118705918, strArr);
                case 1041804999:
                case 2058477704:
                    strM11517 = m11517(strM948);
                    sArr3 = f21062;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6981 = C2105.m6981("ܿ᩵") ^ i3;
                        i = ((iM6981 ^ i4) * (-315)) ^ 1602527024;
                        i2 = -238726056;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM6986 = C2105.m6981("ۨۚ") ^ i4;
                        i5 = ((iM6986 ^ i3) * 24581) ^ 943721936;
                        i6 = iM6986 ^ (-1760156892);
                    }
                    break;
                case 1046515825:
                case 1898893620:
                    s = sArr[c];
                    if (C3911.f12484 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ܽ֡")) * 25;
                        i = ((iM6981 ^ i4) * (-16067)) ^ 463213394;
                        i2 = -2117837068;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩹ۤ")) * 53;
                        i = ((iM6981 ^ i4) * (-21411)) ^ 1626590344;
                        i2 = -1955318364;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1748914401:
                case 1898775812:
                    strM9250 = C3019.m9250(sArr3, 5, 3, i14);
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("᩻ۗ") ^ i4;
                        i = ((iM6981 ^ i3) * 3997) ^ 1579411468;
                        i2 = -579414579;
                    } else {
                        iM6981 = (C2105.m6981("ۗۢ") + i4) * 59;
                        i = ((iM6981 ^ i3) * (-12281)) ^ (-941220667);
                        i2 = 50269504;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    strArr = new String[]{strM11517, ServiceConnectionC3453.m10562(iM6983 ^ i7)};
                    sArr2 = f21062;
                    if (C1711.f5919) {
                        iM6981 = C0630.m2566("ܿ᩻") ^ i3;
                        i = ((iM6981 ^ i4) * (-20011)) ^ 120039382;
                        i2 = 1278139682;
                    } else {
                        iM6981 = (C2105.m6981("᩶ۡ") ^ i4) * q.h;
                        i = ((iM6981 ^ i3) * (-18343)) ^ (-1337505049);
                        i2 = -362748781;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
