package l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܺ᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes5.dex */
public class C16266 extends AbstractC14346 implements InterfaceC3900 {

    /* JADX INFO: renamed from: ᩴ᩶ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f50023 = {4144, 9335, -1409, 9720, 4599, 10740, 525, -13762, 6700, -5380, -5388, -5403, -5383, -5378, -5387, -5422, -5392, -5377, -5455, -5377, -5378, -5403, -5455, -5385, -5384, -5377, -5387, -5455, -5403, -5383, -5388, -5455, -5380, -5388, -5403, -5383, -5378, -5387, -5461, -5455, 854, 25797, 25792, 25798, 25802, 25811, 9919, -21023, 18196, -19803, 5242, 17221, -18864, 24652, 1019, 6985, 5301, 11069, -11812, 5665, 9084, 14033, -9124, 14126, -12963, 13379, 12947, 24938, -8655, -12504, 16292, 16663, 16758, 16656, 16656, 16742, 16755, 16752, 16754, 16750, 16688, 16657, 16659, 16656, 16703, 16748, 16682, 16672, 16675, 16699, 16687, 16676, 16685, 16702, 16696, 16659, 16738, 16678, 16700, 16683, 16678, 16700, 16683, -13694, -16183, 6890, 8508, 11130, 11122, 11107, 11135, 11128, 11123, 8034, 15125, 7060, 6535, 11017, 7235, 5193, -10062, -11446, 6043, 1743, -936, -937, -934, -952, -952, -949, -934, -945, -941, 2917, -17720, -17721, -17718, -17704, -17704, -17701, -17718, -17697, -17725, -17722, -17714, -17697, -17725, -17724, -17713, 6750, -3825, -3833, -3818, -3830, -3827, -3834, 6433, -12320, -7117, -6048, 5208, -849, -857, -842, -854, -851, -858, -788};

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f50024;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f50025;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12366 f50026;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f50027;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f50028;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public View f50029;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C3764 f50030;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public View f50031;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f50032;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C6273 f50033;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12230 f50034;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C6499 f50035;

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo14418() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x019e A[PHI: r8 r12 r16
      0x019e: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:46:0x019c, B:27:0x00c4, B:10:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:46:0x019c, B:27:0x00c4, B:10:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r16v20 android.os.Bundle) = (r16v6 android.os.Bundle), (r16v13 android.os.Bundle), (r16v21 android.os.Bundle) binds: [B:46:0x019c, B:27:0x00c4, B:10:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01d5 A[PHI: r1 r2 r7 r10
      0x01d5: PHI (r1v47 android.os.Bundle) = (r1v15 android.os.Bundle), (r1v28 android.os.Bundle), (r1v2 android.os.Bundle), (r1v2 android.os.Bundle) binds: [B:51:0x01d3, B:35:0x011d, B:23:0x00a4, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:51:0x01d3, B:35:0x011d, B:23:0x00a4, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:51:0x01d3, B:35:0x011d, B:23:0x00a4, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:51:0x01d3, B:35:0x011d, B:23:0x00a4, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x025c A[PHI: r3 r4 r16
      0x025c: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:64:0x025a, B:60:0x023d, B:56:0x0222, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r4v4 char) = (r4v2 char), (r4v2 char), (r4v3 char), (r4v2 char) binds: [B:64:0x025a, B:60:0x023d, B:56:0x0222, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r16v17 android.os.Bundle) = (r16v2 android.os.Bundle), (r16v3 android.os.Bundle), (r16v4 android.os.Bundle), (r16v18 android.os.Bundle) binds: [B:64:0x025a, B:60:0x023d, B:56:0x0222, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        if (l.C3683.f11629 < 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
    
        if (l.C21923.f70183 == 0) goto L16;
     */
    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ۜ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo14419() {
        int iM6981;
        int i;
        int i2;
        int i3 = C1047.f3863;
        int i4 = C0050.f910;
        int iM6982 = (C2105.m6981("ۛ᩵") ^ i4) * (-71);
        int i5 = ((iM6982 ^ i3) * 6589) ^ (-2004917157);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6982 ^ 1489663685;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1982465359;
        String strM6309 = null;
        Bundle bundleM10747 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 30005) >> 31));
            switch (i12) {
                case -2140946379:
                case 1245993416:
                    bundleM10747 = bundleM10747;
                    if (i8 - (s * s2) >= 0) {
                        iM6981 = (i4 - C0630.m2566("ܶۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6981 ^ i3) * 27663) ^ 1404474718;
                        i2 = -691707416;
                    } else {
                        iM6981 = C0630.m2566("ۧܰ") ^ i3;
                        i = ((iM6981 ^ i4) * (-5353)) ^ 630457676;
                        i2 = -743347516;
                    }
                    Bundle bundle = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle;
                    break;
                case -2094275385:
                case -1584313666:
                    AbstractC2021.m6574();
                    break;
                case -2069539247:
                case 1235215806:
                    i9 = 61794;
                    iM6981 = (i3 - C0630.m2566("᩹ۜ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM6981 ^ i4) * (-32135)) ^ (-285407790);
                    i2 = -1636950379;
                    Bundle bundle2 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle2;
                    break;
                case -2066340447:
                case 1385605564:
                    bundleM10747 = bundleM10747;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ۢۡ")) * 97;
                        i = ((iM6981 ^ i3) * 24039) ^ (-187519158);
                        i2 = -1502845920;
                    } else {
                        iM6981 = C0630.m2566("᩹ܽ") ^ i4;
                        i = ((iM6981 ^ i3) * 28813) ^ 1020258370;
                        i2 = -655635675;
                    }
                    Bundle bundle3 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle3;
                    break;
                case -1959035042:
                case 9151066:
                    C1128.m3851();
                    if (C2126.f7087) {
                        iM6981 = (C2105.m6981("ܿ᩸") + i3) * (-61);
                        bundleM10747 = bundleM10747;
                        i = ((iM6981 ^ i4) * (-6251)) ^ 277937576;
                        i2 = -922679871;
                    } else {
                        bundleM10747 = bundleM10747;
                        iM6981 = C0630.m2566("ۗۧ") ^ i3;
                        i = ((iM6981 ^ i4) * (-2471)) ^ (-2098396195);
                        i2 = 1755174784;
                    }
                    Bundle bundle4 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle4;
                    break;
                case -1955296058:
                case -437975015:
                    break;
                case -1928011740:
                case -287113197:
                    bundleM10747 = C3537.m10747(this);
                    sArr2 = f50023;
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C2105.m6981("ܿ᩸") + i3) * (-61);
                        bundleM10747 = bundleM10747;
                        i = ((iM6981 ^ i4) * (-6251)) ^ 277937576;
                        i2 = -922679871;
                    } else {
                        iM6981 = C2105.m6981("֡ۤ") ^ i4;
                        bundleM10747 = bundleM10747;
                        i = ((iM6981 ^ i3) * (-30911)) ^ (-40737603);
                        i2 = -565918967;
                    }
                    Bundle bundle5 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle5;
                    break;
                case -1921515357:
                case -1513171390:
                    return C6554.m18061(150, strM6309);
                case -1254940884:
                case -563486217:
                    bundleM10747 = bundleM10747;
                    sArr = f50023;
                    if (C0483.f2088 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ۢۡ")) * 97;
                        i = ((iM6981 ^ i3) * 24039) ^ (-187519158);
                        i2 = -1502845920;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܶ۟")) * (-113);
                        i = ((iM6981 ^ i4) * (-7435)) ^ 1681831386;
                        i2 = -587335492;
                    }
                    Bundle bundle6 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle6;
                    break;
                case -1097865257:
                case -513258652:
                    C3245.m9925();
                    return null;
                case -423409818:
                case -36043003:
                    bundleM10747 = bundleM10747;
                    i11 = 6;
                    if (C2958.f9394 >= 0) {
                        iM6981 = C0630.m2566("ۗۧ") ^ i3;
                        i = ((iM6981 ^ i4) * (-2471)) ^ (-2098396195);
                        i2 = 1755174784;
                    } else {
                        iM6981 = (i4 - C2105.m6981("᩹ܰ")) * (-63);
                        i = ((iM6981 ^ i3) * (-10143)) ^ (-757036847);
                        i2 = -519356166;
                    }
                    Bundle bundle7 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle7;
                    break;
                case -59297886:
                case 891470990:
                    strM6309 = C1916.m6309(bundleM10747, C3683.m11225(sArr2, i10, i11, i9));
                    if (C3683.m11222()) {
                        iM6981 = (C2105.m6981("ܿ᩸") + i3) * (-61);
                        bundleM10747 = bundleM10747;
                        i = ((iM6981 ^ i4) * (-6251)) ^ 277937576;
                        i2 = -922679871;
                    } else {
                        iM6981 = C2105.m6981("ܿ᩹") ^ i3;
                        bundleM10747 = bundleM10747;
                        i = ((iM6981 ^ i4) * 21311) ^ (-554646487);
                        i2 = 683026481;
                    }
                    Bundle bundle8 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle8;
                    break;
                case -48870627:
                case 585198369:
                    bundleM10747 = bundleM10747;
                    i10 = 150;
                    if (C4117.f13076 <= 0) {
                        iM6981 = C0630.m2566("ܺ۬") ^ i4;
                        i = ((iM6981 ^ i3) * 9101) ^ 1325163555;
                        i2 = 1110056046;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۬ۛ")) * 119;
                        i = ((iM6981 ^ i4) * 7183) ^ 2140597040;
                        i2 = 1069126195;
                    }
                    Bundle bundle9 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle9;
                    break;
                case -8236602:
                case 609086858:
                    bundleM10747 = bundleM10747;
                    c = 149;
                    if (C4075.f12947 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ۢۡ")) * 97;
                        i = ((iM6981 ^ i3) * 24039) ^ (-187519158);
                        i2 = -1502845920;
                    } else {
                        iM6981 = C0630.m2566("ۛ۟") ^ i4;
                        i = ((iM6981 ^ i3) * 28927) ^ (-1257808756);
                        i2 = -241678257;
                    }
                    Bundle bundle10 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle10;
                    break;
                case 419581873:
                case 682509518:
                    bundleM10747 = bundleM10747;
                    i8 = i7 + 96727225;
                    if (C1128.f4106 <= 0) {
                        bundleM10747 = bundleM10747;
                        iM6981 = (C2105.m6981("ܿ᩸") + i3) * (-61);
                        bundleM10747 = bundleM10747;
                        i = ((iM6981 ^ i4) * (-6251)) ^ 277937576;
                        i2 = -922679871;
                    } else {
                        iM6981 = (C0630.m2566("ۡ᩹") + i4) * (-27);
                        i = ((iM6981 ^ i3) * (-28635)) ^ 26174811;
                        i2 = 1822407017;
                    }
                    Bundle bundle11 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle11;
                    break;
                case 475054508:
                case 635580741:
                    C1128.m3851();
                    C1711.m5736();
                    bundleM10747 = bundleM10747;
                    iM6981 = C0630.m2566("ܺ۬") ^ i4;
                    i = ((iM6981 ^ i3) * 9101) ^ 1325163555;
                    i2 = 1110056046;
                    Bundle bundle12 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle12;
                    break;
                case 920852934:
                case 1011427587:
                    bundleM10747 = bundleM10747;
                    s2 = 19670;
                    if (C3537.f11231 >= 0) {
                        iM6981 = C0630.m2566("ۗۧ") ^ i3;
                        i = ((iM6981 ^ i4) * (-2471)) ^ (-2098396195);
                        i2 = 1755174784;
                    } else {
                        iM6981 = C0630.m2566("ۜۛ") ^ i3;
                        i = ((iM6981 ^ i4) * 5389) ^ 862852420;
                        i2 = 219880995;
                    }
                    Bundle bundle13 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle13;
                    break;
                case 1590276740:
                case 1923054389:
                    i9 = 55883;
                    iM6981 = (i3 - C0630.m2566("᩹ۜ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM6981 ^ i4) * (-32135)) ^ (-285407790);
                    i2 = -1636950379;
                    Bundle bundle14 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle14;
                    break;
                default:
                    bundleM10747 = bundleM10747;
                    s = sArr[c];
                    i7 = s * s;
                    if (C7811.m20844() != 0) {
                        iM6981 = (C2105.m6981("ܳۚ") ^ i4) * (-53);
                        i = ((iM6981 ^ i3) * (-21963)) ^ (-2094020011);
                        i2 = 983139866;
                    } else {
                        iM6981 = (C2105.m6981("ܽۛ") + i3) * (-87);
                        i = ((iM6981 ^ i4) * (-28583)) ^ (-964899541);
                        i2 = -1018570767;
                    }
                    Bundle bundle15 = bundleM10747;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    bundleM10747 = bundle15;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00aa A[PHI: r9 r10
      0x00aa: PHI (r9v3 short[]) = (r9v2 short[]), (r9v1 short[]), (r9v1 short[]) binds: [B:31:0x00a8, B:12:0x004a, B:9:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r10v3 int) = (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:31:0x00a8, B:12:0x004a, B:9:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x012f A[PHI: r7
      0x012f: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:42:0x012d, B:17:0x0054, B:15:0x0050, B:12:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01c8 A[PHI: r2 r5 r6 r11 r16
      0x01c8: PHI (r2v2 char) = (r2v1 char), (r2v1 char), (r2v1 char), (r2v1 char), (r2v4 char) binds: [B:46:0x0160, B:27:0x0089, B:23:0x006d, B:9:0x0042, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:46:0x0160, B:27:0x0089, B:23:0x006d, B:9:0x0042, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r6v3 short) = (r6v2 short), (r6v1 short), (r6v1 short), (r6v1 short), (r6v1 short) binds: [B:46:0x0160, B:27:0x0089, B:23:0x006d, B:9:0x0042, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:46:0x0160, B:27:0x0089, B:23:0x006d, B:9:0x0042, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r16v3 java.lang.String) = 
      (r16v1 java.lang.String)
      (r16v1 java.lang.String)
      (r16v2 java.lang.String)
      (r16v1 java.lang.String)
      (r16v1 java.lang.String)
     binds: [B:46:0x0160, B:27:0x0089, B:23:0x006d, B:9:0x0042, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0214 A[PHI: r1 r3
      0x0214: PHI (r1v4 short[]) = (r1v3 short[]), (r1v1 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:64:0x0212, B:60:0x01f5, B:54:0x01ae, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r3v3 short) = (r3v1 short), (r3v1 short), (r3v2 short), (r3v1 short) binds: [B:64:0x0212, B:60:0x01f5, B:54:0x01ae, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ܳ */
    public final int mo14420() {
        int iM6981;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 812644768;
        int i10 = C5695.f17556;
        int i11 = ServiceConnectionC3453.f10921;
        int iM6982 = (C2105.m6981("ۧۡ") + i10) * (-15);
        int i12 = ((iM6982 ^ i11) * (-7275)) ^ 422550795;
        int i13 = iM6982 ^ 1134313462;
        String strM9934 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * 13701) >> 31));
            switch (i9) {
                case -2091093468:
                case -603539979:
                    if ((i5 + 1) - i4 <= 0) {
                        iM6981 = (C2105.m6981("ܶۧ") + i11) * 9;
                        i = ((iM6981 ^ i10) * (-11335)) ^ (-405812027);
                        i2 = 463207530;
                    } else {
                        iM6981 = C2105.m6981("۫ܽ") ^ i10;
                        i = ((iM6981 ^ i11) * (-31129)) ^ (-56528961);
                        i2 = -1159900267;
                    }
                    int i14 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i14;
                    break;
                case -2008132121:
                case -933320450:
                    RunnableC0588.m2441();
                    return 0;
                case -1792793470:
                case -221460515:
                    return C0630.m2566(strM9934) ^ 2118462454;
                case -1687703492:
                case 1474997872:
                    i6 = 37586;
                    iM6981 = C2105.m6981("ۜ۠") ^ i11;
                    i = ((iM6981 ^ i10) * (-27485)) ^ 739950458;
                    i2 = 696924654;
                    int i15 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i15;
                    break;
                case -1646911409:
                case 646867486:
                    i4 = i3 * i3;
                    s2 = 2;
                    if (C1504.f5354) {
                        iM6981 = (i11 - C0630.m2566("۬ۙ")) * (-45);
                        i = ((iM6981 ^ i10) * (-18753)) ^ 904548841;
                        i2 = 1118225630;
                    } else {
                        iM6981 = C0630.m2566("ۡܽ") ^ i10;
                        i = ((iM6981 ^ i11) * (-27623)) ^ (-95729785);
                        i2 = 1938117045;
                    }
                    int i16 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i16;
                    break;
                case -1632457314:
                case 1127706618:
                    i5 = s * s2;
                    if (C4616.m13552() != 0) {
                        iM6981 = C2105.m6981("᩺ۗ") ^ i11;
                        i = ((iM6981 ^ i10) * (-30567)) ^ 1981972531;
                        i2 = 615147027;
                    } else {
                        iM6981 = (C0630.m2566("ۘܺ") + i10) * 57;
                        i = ((iM6981 ^ i11) * (-32489)) ^ (-709500410);
                        i2 = 1378582037;
                    }
                    int i17 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i17;
                    break;
                case -1609917635:
                case 435917190:
                    if (C1005.f3721) {
                        iM6981 = C2105.m6981("᩺ۗ") ^ i11;
                        i = ((iM6981 ^ i10) * (-30567)) ^ 1981972531;
                        i2 = 615147027;
                    } else {
                        iM6981 = C0630.m2566("ۧ֫") ^ i11;
                        i = ((iM6981 ^ i10) * 24641) ^ (-1580650558);
                        i2 = 111930960;
                    }
                    int i18 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i18;
                    break;
                case -1510564525:
                case -1178719279:
                    strM9934 = C3245.m9934(sArr2, i7, i8, i6);
                    if (C5695.f17556 >= 0) {
                        iM6981 = (i11 - C0630.m2566("۬ۙ")) * (-45);
                        i = ((iM6981 ^ i10) * (-18753)) ^ 904548841;
                        i2 = 1118225630;
                    } else {
                        iM6981 = C2105.m6981("֨ܰ") ^ i10;
                        i = ((iM6981 ^ i11) * 4441) ^ 90809736;
                        i2 = 536563970;
                    }
                    int i19 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i19;
                    break;
                case -1400508675:
                case -437107513:
                    i3 = s + 1;
                    if (C2126.f7087) {
                        iM6981 = (C0630.m2566("֡ۡ") ^ i10) * 79;
                        i = ((iM6981 ^ i11) * 30731) ^ 776281134;
                        i2 = 595515582;
                    } else {
                        iM6981 = C2105.m6981("֡֨") ^ i11;
                        i = ((iM6981 ^ i10) * (-10637)) ^ (-2099652271);
                        i2 = 1898012952;
                    }
                    int i110 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i110;
                    break;
                case -1265672699:
                case -362172759:
                    s = sArr[c];
                    if (C21923.f70183 != 0) {
                        iM6981 = C0630.m2566("ۧ֫") ^ i11;
                        i = ((iM6981 ^ i10) * 24641) ^ (-1580650558);
                        i2 = 111930960;
                    } else {
                        iM6981 = (C2105.m6981("ۚۧ") + i11) * (-59);
                        i = ((iM6981 ^ i10) * 25799) ^ 1867578288;
                        i2 = -836629876;
                    }
                    int i111 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i111;
                    break;
                case -1200625912:
                case 1327777411:
                    i6 = 39782;
                    iM6981 = C2105.m6981("ۜ۠") ^ i11;
                    i = ((iM6981 ^ i10) * (-27485)) ^ 739950458;
                    i2 = 696924654;
                    int i112 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i112;
                    break;
                case -981657830:
                case -25483863:
                    sArr2 = f50023;
                    i7 = 157;
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("ۜ᩵") ^ i10;
                        i = ((iM6981 ^ i11) * (-15109)) ^ 270768241;
                        i2 = -187932984;
                    } else {
                        iM6981 = C2105.m6981("֫᩵") ^ i10;
                        i = ((iM6981 ^ i11) * 30085) ^ 1808951471;
                        i2 = -107455108;
                    }
                    int i113 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i113;
                    break;
                case -931345041:
                case 347059969:
                    i8 = 3;
                    if (C2958.f9394 >= 0) {
                        iM6981 = (i11 - C0630.m2566("۬ۙ")) * (-45);
                        i = ((iM6981 ^ i10) * (-18753)) ^ 904548841;
                        i2 = 1118225630;
                    } else {
                        iM6981 = C2105.m6981("ۘ۟") ^ i11;
                        i = ((iM6981 ^ i10) * (-781)) ^ (-1252237598);
                        i2 = 1430848934;
                    }
                    int i114 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i114;
                    break;
                case -793871076:
                case 439747495:
                    C1504.m5179();
                    if (C1504.f5354) {
                        iM6981 = C2105.m6981("᩺ۗ") ^ i11;
                        i = ((iM6981 ^ i10) * (-30567)) ^ 1981972531;
                        i2 = 615147027;
                    } else {
                        iM6981 = C0630.m2566("ۜ᩵") ^ i10;
                        i = ((iM6981 ^ i11) * (-15109)) ^ 270768241;
                        i2 = -187932984;
                    }
                    int i115 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i115;
                    break;
                case -363020156:
                case 1017192453:
                    C1711.m5736();
                    iM6981 = C2105.m6981("᩺ۗ") ^ i11;
                    i = ((iM6981 ^ i10) * (-30567)) ^ 1981972531;
                    i2 = 615147027;
                    int i116 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i116;
                    break;
                case -138592717:
                case 1151245046:
                    if (C1504.f5354) {
                        iM6981 = C0630.m2566("ۧ֫") ^ i11;
                        i = ((iM6981 ^ i10) * 24641) ^ (-1580650558);
                        i2 = 111930960;
                    } else {
                        iM6981 = (C0630.m2566("᩻᩻") ^ i10) * 39;
                        i = ((iM6981 ^ i11) * (-25791)) ^ (-1146330199);
                        i2 = -196741144;
                    }
                    int i117 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i117;
                    break;
                case -130333191:
                case 1512314327:
                    sArr = f50023;
                    if (C0050.f910 >= 0) {
                        iM6981 = C0630.m2566("ۧ֫") ^ i11;
                        i = ((iM6981 ^ i10) * 24641) ^ (-1580650558);
                        i2 = 111930960;
                    } else {
                        iM6981 = (C2105.m6981("ܰۘ") ^ i11) * 37;
                        i = ((iM6981 ^ i10) * (-32229)) ^ (-1551492496);
                        i2 = -938979061;
                    }
                    int i118 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i118;
                    break;
                case 391762759:
                case 1901586570:
                    if (C0237.m1481() < 0) {
                        iM6981 = C0630.m2566("ۜ᩵") ^ i10;
                        i = ((iM6981 ^ i11) * (-15109)) ^ 270768241;
                        i2 = -187932984;
                    } else {
                        iM6981 = (i11 - C0630.m2566("۬ۙ")) * (-45);
                        i = ((iM6981 ^ i10) * (-18753)) ^ 904548841;
                        i2 = 1118225630;
                    }
                    int i119 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i119;
                    break;
                default:
                    c = 156;
                    if (C1005.f3721) {
                        iM6981 = C0630.m2566("ܽ᩺") ^ i10;
                        i = ((iM6981 ^ i11) * 5169) ^ 124667510;
                        i2 = 123630627;
                    } else {
                        iM6981 = (i11 - C0630.m2566("۬ۙ")) * (-45);
                        i = ((iM6981 ^ i10) * (-18753)) ^ 904548841;
                        i2 = 1118225630;
                    }
                    int i1110 = i;
                    i13 = iM6981 ^ i2;
                    i12 = i1110;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x020c A[PHI: r1 r6 r7 r10 r11 r16
      0x020c: PHI (r1v4 android.os.Bundle) = 
      (r1v2 android.os.Bundle)
      (r1v2 android.os.Bundle)
      (r1v3 android.os.Bundle)
      (r1v2 android.os.Bundle)
      (r1v2 android.os.Bundle)
      (r1v2 android.os.Bundle)
      (r1v2 android.os.Bundle)
     binds: [B:59:0x020a, B:47:0x0195, B:32:0x00f2, B:28:0x00cb, B:18:0x0089, B:16:0x0085, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:59:0x020a, B:47:0x0195, B:32:0x00f2, B:28:0x00cb, B:18:0x0089, B:16:0x0085, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:59:0x020a, B:47:0x0195, B:32:0x00f2, B:28:0x00cb, B:18:0x0089, B:16:0x0085, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:59:0x020a, B:47:0x0195, B:32:0x00f2, B:28:0x00cb, B:18:0x0089, B:16:0x0085, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:59:0x020a, B:47:0x0195, B:32:0x00f2, B:28:0x00cb, B:18:0x0089, B:16:0x0085, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r16v19 int) = (r16v3 int), (r16v6 int), (r16v12 int), (r16v13 int), (r16v15 int), (r16v16 int), (r16v21 int) binds: [B:59:0x020a, B:47:0x0195, B:32:0x00f2, B:28:0x00cb, B:18:0x0089, B:16:0x0085, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0236 A[PHI: r3 r12 r16
      0x0236: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:55:0x01ec, B:24:0x00ac, B:13:0x007a, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:55:0x01ec, B:24:0x00ac, B:13:0x007a, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r16v22 int) = (r16v4 int), (r16v14 int), (r16v18 int), (r16v25 int) binds: [B:55:0x01ec, B:24:0x00ac, B:13:0x007a, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0269 A[PHI: r2 r8 r16
      0x0269: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:65:0x0267, B:43:0x0174, B:16:0x0085, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:65:0x0267, B:43:0x0174, B:16:0x0085, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r16v17 int) = (r16v2 int), (r16v7 int), (r16v16 int), (r16v18 int) binds: [B:65:0x0267, B:43:0x0174, B:16:0x0085, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m38278() {
        int iM6981;
        int i;
        int i2;
        int i3 = C3683.f11629;
        int i4 = RunnableC1937.f6483;
        int iM6982 = (i4 - C2105.m6981("ۘۛ")) * 57;
        int i5 = ((iM6982 ^ i3) * (-28017)) ^ (-1215987705);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6982 ^ 1293429790;
        Bundle bundleM10747 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 160790907;
        while (true) {
            int i14 = i6 ^ (i5 & (((i13 ^ i3) * 19487) >> 31));
            switch (i14) {
                case -1906795994:
                case -821649795:
                    i14 = i14;
                    C3683.m11222();
                    iM6981 = C0630.m2566("᩵᩸") ^ i3;
                    i = ((iM6981 ^ i4) * (-14875)) ^ 1635168248;
                    i2 = -1692578531;
                    int i15 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i15;
                    break;
                case -1874620264:
                case -1692708245:
                    String strM19112 = C7106.m19112(bundleM10747, C3245.m9934(sArr2, i11, i12, i10));
                    C3537.m10749(strM19112);
                    return strM19112;
                case -1871605184:
                case 200066795:
                    i14 = i14;
                    c = '{';
                    if (C0798.m2998() != 0) {
                        iM6981 = (i4 - C2105.m6981("ۚ֡")) * (-59);
                        i = ((iM6981 ^ i3) * (-1325)) ^ 272170686;
                        i2 = 452837581;
                    } else {
                        iM6981 = C2105.m6981("᩹ᩳ") ^ i3;
                        i = ((iM6981 ^ i4) * 27843) ^ (-1962859743);
                        i2 = 1256654777;
                    }
                    int i16 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i16;
                    break;
                case -1706037835:
                case 33167241:
                    i10 = 64571;
                    iM6981 = (C0630.m2566("᩸ۨ") ^ i4) * (-123);
                    i = ((iM6981 ^ i3) * (-30767)) ^ (-1993632460);
                    i2 = -1845358439;
                    int i17 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i17;
                    break;
                case -1445451863:
                case -569982059:
                    i14 = i14;
                    if (C0483.m2121()) {
                        iM6981 = (C0630.m2566("᩸۠") ^ i4) * 109;
                        i = ((iM6981 ^ i3) * 14001) ^ 193605996;
                        i2 = 388888305;
                    } else {
                        iM6981 = C0630.m2566("᩵᩸") ^ i3;
                        i = ((iM6981 ^ i4) * (-14875)) ^ 1635168248;
                        i2 = -1692578531;
                    }
                    int i18 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i18;
                    break;
                case -1100773042:
                case -513917640:
                    i14 = i14;
                    s = sArr[c];
                    s2 = 12820;
                    if (C2105.f7037 != 0) {
                        iM6981 = (C0630.m2566("ܺ۠") ^ i4) * 69;
                        i = ((iM6981 ^ i3) * 9237) ^ 1943382343;
                        i2 = -2098425815;
                    } else {
                        iM6981 = C0630.m2566("ۜܳ") ^ i4;
                        i = ((iM6981 ^ i3) * 27875) ^ (-2131821702);
                        i2 = -1286777515;
                    }
                    int i19 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i19;
                    break;
                case -966847684:
                case -351873882:
                    i14 = i14;
                    i11 = 124;
                    if (C1047.f3863 >= 0) {
                        iM6981 = C0630.m2566("᩵᩸") ^ i3;
                        i = ((iM6981 ^ i4) * (-14875)) ^ 1635168248;
                        i2 = -1692578531;
                    } else {
                        iM6981 = (C2105.m6981("᩵ۚ") ^ i3) * 11;
                        i = ((iM6981 ^ i4) * (-3305)) ^ 1199437542;
                        i2 = -568665625;
                    }
                    int i110 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i110;
                    break;
                case -918693918:
                case 581849512:
                    i14 = i14;
                    i7 = s * s2;
                    i8 = s * s;
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("᩵᩸") ^ i3;
                        i = ((iM6981 ^ i4) * (-14875)) ^ 1635168248;
                        i2 = -1692578531;
                    } else {
                        iM6981 = C0630.m2566("ۚ᩹") ^ i3;
                        i = ((iM6981 ^ i4) * 18993) ^ 1404098953;
                        i2 = 524153911;
                    }
                    int i111 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i111;
                    break;
                case -791542827:
                case 532264439:
                    C4117.m12364();
                    if (C1128.f4106 <= 0) {
                        i14 = i14;
                        iM6981 = C0630.m2566("᩵᩸") ^ i3;
                        i = ((iM6981 ^ i4) * (-14875)) ^ 1635168248;
                        i2 = -1692578531;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۚ᩵")) * 35;
                        i14 = i14;
                        i = ((iM6981 ^ i4) * 29305) ^ 538596286;
                        i2 = 107263513;
                    }
                    int i112 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i112;
                    break;
                case -578274899:
                case 1745513839:
                    i14 = i14;
                    C0382.m1848();
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C2105.m6981("֨ܿ") ^ i3) * 47;
                        i = ((iM6981 ^ i4) * 8133) ^ (-508470745);
                        i2 = 1787196736;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۚ֡")) * (-59);
                        i = ((iM6981 ^ i3) * (-1325)) ^ 272170686;
                        i2 = 452837581;
                    }
                    int i113 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i113;
                    break;
                case -478776357:
                case -302302873:
                    i10 = 54293;
                    iM6981 = (C0630.m2566("᩸ۨ") ^ i4) * (-123);
                    i = ((iM6981 ^ i3) * (-30767)) ^ (-1993632460);
                    i2 = -1845358439;
                    int i114 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i114;
                    break;
                case -351489825:
                case 1872347731:
                    C1711.m5736();
                    C0050.m940();
                    return null;
                case -340075771:
                case 766699028:
                    i14 = i14;
                    i9 = 41088100;
                    if (C1005.f3721) {
                        iM6981 = C2105.m6981("ܳ᩵") ^ i4;
                        i = ((iM6981 ^ i3) * (-11399)) ^ 1712484721;
                        i2 = -1516777538;
                    } else {
                        iM6981 = (C2105.m6981("֨ܿ") ^ i3) * 47;
                        i = ((iM6981 ^ i4) * 8133) ^ (-508470745);
                        i2 = 1787196736;
                    }
                    int i115 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i115;
                    break;
                case 759999336:
                case 915652785:
                    i14 = i14;
                    sArr = f50023;
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C2105.m6981("֨ܿ") ^ i3) * 47;
                        i = ((iM6981 ^ i4) * 8133) ^ (-508470745);
                        i2 = 1787196736;
                    } else {
                        iM6981 = C2105.m6981("ۜۡ") ^ i3;
                        i = ((iM6981 ^ i4) * (-17569)) ^ (-347711394);
                        i2 = 968054611;
                    }
                    int i116 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i116;
                    break;
                case 880077110:
                case 1650591226:
                    i14 = i14;
                    if (i7 - (i8 + i9) <= 0) {
                        iM6981 = (C2105.m6981("᩻֡") + i3) * 27;
                        i = ((iM6981 ^ i4) * (-2343)) ^ (-339888017);
                        i2 = -883771480;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۗۙ")) * 51;
                        i = ((iM6981 ^ i4) * 8095) ^ (-1140639879);
                        i2 = 1435923690;
                    }
                    int i117 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i117;
                    break;
                case 1035171879:
                case 1605115423:
                    i14 = i14;
                    i12 = 9;
                    if (C0964.m3413()) {
                        iM6981 = C2105.m6981("᩻᩵") ^ i4;
                        i = ((iM6981 ^ i3) * 32685) ^ (-1021851414);
                        i2 = 184271387;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۚ֡")) * (-59);
                        i = ((iM6981 ^ i3) * (-1325)) ^ 272170686;
                        i2 = 452837581;
                    }
                    int i118 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i118;
                    break;
                case 1210914362:
                case 2052067362:
                    i14 = i14;
                    C2167.m7155();
                    if (C2105.f7037 != 0) {
                        iM6981 = C0630.m2566("᩵᩸") ^ i3;
                        i = ((iM6981 ^ i4) * (-14875)) ^ 1635168248;
                        i2 = -1692578531;
                    } else {
                        iM6981 = (C2105.m6981("֨ܿ") ^ i3) * 47;
                        i = ((iM6981 ^ i4) * 8133) ^ (-508470745);
                        i2 = 1787196736;
                    }
                    int i119 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i119;
                    break;
                case 1573258544:
                case 2062571611:
                    i14 = i14;
                    bundleM10747 = C3537.m10747(this);
                    sArr2 = f50023;
                    if (C3432.m10477() <= 0) {
                        iM6981 = C0630.m2566("᩵᩸") ^ i3;
                        i = ((iM6981 ^ i4) * (-14875)) ^ 1635168248;
                        i2 = -1692578531;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ܰۖ")) * 123;
                        i = ((iM6981 ^ i3) * (-1903)) ^ (-2072259701);
                        i2 = -564989616;
                    }
                    int i1110 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i1110;
                    break;
                default:
                    i14 = i14;
                    if (C1128.f4106 <= 0) {
                        iM6981 = (i4 - C2105.m6981("ۚ֡")) * (-59);
                        i = ((iM6981 ^ i3) * (-1325)) ^ 272170686;
                        i2 = 452837581;
                    } else {
                        iM6981 = C0630.m2566("᩵ۛ") ^ i4;
                        i = ((iM6981 ^ i3) * (-32577)) ^ 1657425603;
                        i2 = 943244165;
                    }
                    int i1111 = i14;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i13 = i1111;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x010a A[PHI: r3 r13 r14
      0x010a: PHI (r3v5 android.os.Bundle) = (r3v3 android.os.Bundle), (r3v2 android.os.Bundle), (r3v2 android.os.Bundle) binds: [B:34:0x0108, B:30:0x00e6, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r13v5 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:34:0x0108, B:30:0x00e6, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r14v5 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:34:0x0108, B:30:0x00e6, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0142 A[PHI: r2
      0x0142: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:38:0x0140, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0265 A[PHI: r1 r6 r15
      0x0265: PHI (r1v5 l.֡᩻֫) = (r1v2 l.֡᩻֫), (r1v4 l.֡᩻֫), (r1v2 l.֡᩻֫), (r1v2 l.֡᩻֫) binds: [B:65:0x0263, B:42:0x0179, B:26:0x00c4, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:65:0x0263, B:42:0x0179, B:26:0x00c4, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:65:0x0263, B:42:0x0179, B:26:0x00c4, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0299 A[PHI: r9 r10 r11 r20
      0x0299: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:69:0x0297, B:57:0x0212, B:53:0x01ee, B:14:0x0066, B:12:0x0062, B:9:0x005c, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:69:0x0297, B:57:0x0212, B:53:0x01ee, B:14:0x0066, B:12:0x0062, B:9:0x005c, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:69:0x0297, B:57:0x0212, B:53:0x01ee, B:14:0x0066, B:12:0x0062, B:9:0x005c, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:69:0x0297, B:57:0x0212, B:53:0x01ee, B:14:0x0066, B:12:0x0062, B:9:0x005c, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onResume() {
        int iM6981;
        int i;
        int i2;
        int i3 = C1294.f4556;
        int i4 = C4263.f13799;
        int iM6982 = (C2105.m6981("ۚ֫") + i4) * (-87);
        int i5 = ((iM6982 ^ i3) * (-27917)) ^ (-1279304328);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6982 ^ (-1439182480);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -902010589;
        String strM6309 = null;
        Bundle bundleM10747 = null;
        String strMo14422 = null;
        ActivityC0737 activityC0737M2429 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 3557) >> 31));
            switch (i12) {
                case -2090082997:
                case 375444618:
                    i9 = 11031;
                    iM6981 = C2105.m6981("ۡ᩹") ^ i3;
                    i = ((iM6981 ^ i4) * 14663) ^ (-348642102);
                    i2 = -524071491;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2009263987:
                case 835002649:
                    c = 'j';
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (C0630.m2566("ۖᩴ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6981 ^ i4) * (-4961)) ^ (-448987164);
                        i2 = 1953826737;
                    } else {
                        iM6981 = (C0630.m2566("ۨۜ") + i4) * 45;
                        i = ((iM6981 ^ i3) * (-26465)) ^ (-891775955);
                        i2 = 2009865812;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1963066746:
                case -1643486603:
                    ((ActivityC17169) RunnableC0588.m2429(this)).m40340((CharSequence) strM6309);
                    break;
                case -1924749993:
                case -1702510291:
                    i9 = 4622;
                    iM6981 = C2105.m6981("ۡ᩹") ^ i3;
                    i = ((iM6981 ^ i4) * 14663) ^ (-348642102);
                    i2 = -524071491;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1897518034:
                case 962758747:
                    ((ActivityC17169) RunnableC0588.m2429(this)).m40340((CharSequence) m38278());
                    break;
                case -1786402798:
                case -1490950575:
                    i11 = 6;
                    if (C1711.m5736() <= 0) {
                        iM6981 = (C0630.m2566("ۖᩴ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6981 ^ i4) * (-4961)) ^ (-448987164);
                        i2 = 1953826737;
                    } else {
                        iM6981 = (C2105.m6981("֡ۡ") + i4) * (-103);
                        i = ((iM6981 ^ i3) * 55) ^ 669333073;
                        i2 = 929336597;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1638648111:
                case 1144943191:
                    sArr = f50023;
                    if (C21923.f70183 != 0) {
                        iM6981 = (C0630.m2566("۬֡") ^ i4) * (-109);
                        i = ((iM6981 ^ i3) * 17749) ^ (-634613943);
                        i2 = -102500700;
                    } else {
                        iM6981 = (C2105.m6981("᩺۟") + i3) * (-95);
                        i = ((iM6981 ^ i4) * 15019) ^ (-997551556);
                        i2 = -2102635683;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1175875719:
                case -739219535:
                    strMo14422 = mo14422();
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("ۜ᩺") ^ i4;
                        i = ((iM6981 ^ i3) * (-29919)) ^ 1744786369;
                        i2 = -925874232;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۡ֨")) * (-119);
                        i = ((iM6981 ^ i4) * 30325) ^ 705737204;
                        i2 = -558304204;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1100187496:
                case 137488141:
                    i8 = s + s3;
                    if (C0798.m2998() != 0) {
                        iM6981 = (C0630.m2566("۬֡") ^ i4) * (-109);
                        i = ((iM6981 ^ i3) * 17749) ^ (-634613943);
                        i2 = -102500700;
                    } else {
                        iM6981 = (C2105.m6981("۬᩸") + i3) * (-27);
                        i = ((iM6981 ^ i4) * 6457) ^ 952642224;
                        i2 = -565331120;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1098810496:
                case 1482384099:
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = (C0630.m2566("۬֡") ^ i4) * (-109);
                        i = ((iM6981 ^ i3) * 17749) ^ (-634613943);
                        i2 = -102500700;
                    } else {
                        iM6981 = C0630.m2566("ۜ᩺") ^ i4;
                        i = ((iM6981 ^ i3) * (-29919)) ^ 1744786369;
                        i2 = -925874232;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -814358681:
                case -770325964:
                    i7 = s * s2;
                    s3 = 515;
                    if (C1711.m5736() <= 0) {
                        iM6981 = (C0630.m2566("۬֡") ^ i4) * (-109);
                        i = ((iM6981 ^ i3) * 17749) ^ (-634613943);
                        i2 = -102500700;
                    } else {
                        iM6981 = C2105.m6981("֫ۖ") ^ i4;
                        i = ((iM6981 ^ i3) * 2027) ^ 1429817421;
                        i2 = -1976506565;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -641271203:
                case -443793335:
                    strM6309 = C1916.m6309(bundleM10747, C1005.m3502(sArr2, i10, i11, i9));
                    if (strM6309 != null) {
                        iM6981 = (C0630.m2566("ܰ᩹") + i3) * 55;
                        i = ((iM6981 ^ i4) * (-23517)) ^ (-185472449);
                        i2 = 300501866;
                    } else {
                        iM6981 = C0630.m2566("᩺ۘ") ^ i3;
                        i = ((iM6981 ^ i4) * (-18343)) ^ (-324487456);
                        i2 = 569221531;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -361971100:
                case 1607862816:
                    C0237.m1481();
                    if (C0483.f2088 >= 0) {
                        iM6981 = (C0630.m2566("۬֡") ^ i4) * (-109);
                        i = ((iM6981 ^ i3) * 17749) ^ (-634613943);
                        i2 = -102500700;
                    } else {
                        iM6981 = (C0630.m2566("ۖᩴ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6981 ^ i4) * (-4961)) ^ (-448987164);
                        i2 = 1953826737;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -170467198:
                case -57900546:
                    C2105.m6982();
                    iM6981 = (C0630.m2566("۬֡") ^ i4) * (-109);
                    i = ((iM6981 ^ i3) * 17749) ^ (-634613943);
                    i2 = -102500700;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -69094960:
                case 1471604323:
                    if (i7 - (i8 * i8) <= 0) {
                        iM6981 = (C0630.m2566("ۚܳ") + i4) * (-125);
                        i = ((iM6981 ^ i3) * (-26823)) ^ (-2124740759);
                        i2 = 2029287753;
                    } else {
                        iM6981 = C2105.m6981("ۚۛ") ^ i4;
                        i = ((iM6981 ^ i3) * (-3171)) ^ (-319429120);
                        i2 = -1189456066;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 825591212:
                case 1428671717:
                    sArr2 = f50023;
                    i10 = IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("ܳ᩹") + i4) * (-101);
                        i = ((iM6981 ^ i3) * (-9319)) ^ 26856429;
                        i2 = 144133786;
                    } else {
                        iM6981 = C0630.m2566("ۧ۠") ^ i3;
                        i = ((iM6981 ^ i4) * 20291) ^ (-1789245875);
                        i2 = 136940707;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 968096280:
                case 2111956816:
                    activityC0737M2429.setTitle(strMo14422);
                    bundleM10747 = C3537.m10747(this);
                    if (C0237.f1507 != 0) {
                        iM6981 = (C2105.m6981("ܳ᩹") + i4) * (-101);
                        i = ((iM6981 ^ i3) * (-9319)) ^ 26856429;
                        i2 = 144133786;
                    } else {
                        iM6981 = (C2105.m6981("ۖۨ") ^ i4) * (-89);
                        i = ((iM6981 ^ i3) * 26417) ^ (-699996188);
                        i2 = -90526790;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1133907128:
                case 1814947596:
                    s = sArr[c];
                    s2 = 2060;
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("ۘۗ") ^ i3;
                        i = ((iM6981 ^ i4) * 30413) ^ 668872607;
                        i2 = 2099097312;
                    } else {
                        iM6981 = C0630.m2566("ۧܶ") ^ i3;
                        i = ((iM6981 ^ i4) * 30463) ^ (-1446670365);
                        i2 = 699364660;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1165481529:
                case 1338709038:
                    super.onResume();
                    activityC0737M2429 = RunnableC0588.m2429(this);
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C0630.m2566("ۖᩴ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6981 ^ i4) * (-4961)) ^ (-448987164);
                        i2 = 1953826737;
                    } else {
                        iM6981 = (i4 - C2105.m6981("۫۠")) * 95;
                        i = ((iM6981 ^ i3) * 26437) ^ (-301422922);
                        i2 = -1106164484;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1300780035:
                case 1540052278:
                    C3537.m10746();
                    break;
                default:
                    C3663.m11168();
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C0630.m2566("۬֡") ^ i4) * (-109);
                        i = ((iM6981 ^ i3) * 17749) ^ (-634613943);
                        i2 = -102500700;
                    } else {
                        iM6981 = (C2105.m6981("ܳ᩹") + i4) * (-101);
                        i = ((iM6981 ^ i3) * (-9319)) ^ 26856429;
                        i2 = 144133786;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38263(C16266 c16266, String str) {
        ActivityC17169 activityC17169 = null;
        int i = 1722908627;
        int i2 = RunnableC3474.f10992;
        int i3 = C0050.f910;
        int iM6981 = (i2 - C2105.m6981("֡ۡ")) * (-127);
        int i4 = ((iM6981 ^ i3) * 13305) ^ 123804010;
        int i5 = 1137284804;
        while (true) {
            i = ((((i ^ i3) * (-24809)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2067341427:
                case -118604327:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (C0630.m2566("ۢ֫") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * 1263) ^ 952577588;
                        i5 = -1666541194;
                    } else {
                        iM6981 = C0630.m2566("ۡۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-15337)) ^ 708600272;
                        i5 = 395453861;
                    }
                    break;
                case -1890609566:
                case 2026399246:
                    break;
                case -1685326683:
                case -1072291218:
                    C1420.m4913();
                    break;
                case -1588472190:
                case -1418068740:
                    if (C2126.m7040()) {
                        iM6981 = C2105.m6981("ܿۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21441) ^ (-592347482);
                        i5 = 956567933;
                    } else {
                        iM6981 = C2105.m6981("ܳ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 11095) ^ (-366556481);
                        i5 = -2002438487;
                    }
                    break;
                case -1449481935:
                case 420590348:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۧۚ")) * 5;
                        i4 = ((iM6981 ^ i3) * (-16919)) ^ (-972057083);
                        i5 = -730695705;
                    } else {
                        iM6981 = C2105.m6981("᩵᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-28897)) ^ 1899297988;
                        i5 = 504973100;
                    }
                    break;
                case -1444884931:
                case -490793787:
                    if (c16266.f50024) {
                        iM6981 = (C2105.m6981("ۚۗ") ^ i3) * 93;
                        i4 = ((iM6981 ^ i2) * (-20087)) ^ (-932561774);
                        i5 = 1714524022;
                    } else {
                        iM6981 = (C2105.m6981("ۤ۫") + i2) * (-111);
                        i4 = ((iM6981 ^ i3) * (-2309)) ^ 1839010217;
                        i5 = -233220742;
                    }
                    break;
                case -1384346653:
                case 1317170321:
                    activityC17169 = (ActivityC17169) RunnableC0588.m2429(c16266);
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C0630.m2566("ۢ֫") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * 1263) ^ 952577588;
                        i5 = -1666541194;
                    } else {
                        iM6981 = C0630.m2566("ۨᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6167)) ^ (-829921471);
                        i5 = -1858341196;
                    }
                    break;
                case -1375168600:
                case -451144015:
                    if (c16266.f50035 != null) {
                        iM6981 = (C0630.m2566("ᩳۨ") ^ i2) * 81;
                        i4 = ((iM6981 ^ i3) * 14577) ^ 1381037809;
                        i5 = -1249566615;
                    } else {
                        iM6981 = (C2105.m6981("ۤ۫") + i2) * (-111);
                        i4 = ((iM6981 ^ i3) * (-2309)) ^ 1839010217;
                        i5 = -233220742;
                    }
                    break;
                case -1286333085:
                case -1003276984:
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C0630.m2566("ۢ֫") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * 1263) ^ 952577588;
                        i5 = -1666541194;
                    } else {
                        iM6981 = (C2105.m6981("ܺۚ") ^ i2) * (-117);
                        i4 = ((iM6981 ^ i3) * 22001) ^ 897835641;
                        i5 = -1772053250;
                    }
                    break;
                case -1261846987:
                case 789866249:
                    if (C0483.f2088 >= 0) {
                        iM6981 = C2105.m6981("ܿۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21441) ^ (-592347482);
                        i5 = 956567933;
                    } else {
                        iM6981 = C0630.m2566("۬֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-4451)) ^ 583111966;
                        i5 = -2043931574;
                    }
                    break;
                case -1007509680:
                case 1492007765:
                    if (C0050.m940() > 0) {
                        iM6981 = C2105.m6981("ۤ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32249)) ^ 355016381;
                        i5 = -684781834;
                    } else {
                        iM6981 = (C2105.m6981("ۛ۫") + i3) * 35;
                        i4 = ((iM6981 ^ i2) * 3081) ^ (-934205225);
                        i5 = 289076532;
                    }
                    break;
                case -775136696:
                case 1839078259:
                    if (C2167.f7158 < 0) {
                        C4263.m12821(new C24028(c16266, activityC17169, str));
                        iM6981 = (C2105.m6981("ۤ۫") + i2) * (-111);
                        i4 = ((iM6981 ^ i3) * (-2309)) ^ 1839010217;
                        i5 = -233220742;
                    } else {
                        iM6981 = (C0630.m2566("ۢ֫") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * 1263) ^ 952577588;
                        i5 = -1666541194;
                    }
                    break;
                case -406452776:
                case 798232531:
                    if (C0422.m1963()) {
                        iM6981 = C0630.m2566("᩸۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-2509)) ^ 691525698;
                        i5 = 2019621298;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۧۚ")) * 5;
                        i4 = ((iM6981 ^ i3) * (-16919)) ^ (-972057083);
                        i5 = -730695705;
                    }
                    break;
                case -348658441:
                case 1510335438:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C2105.m6981("ۛ۫") + i3) * 35;
                        i4 = ((iM6981 ^ i2) * 3081) ^ (-934205225);
                        i5 = 289076532;
                    } else {
                        iM6981 = C0630.m2566("ۨۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-19529)) ^ (-1493827864);
                        i5 = -896275027;
                    }
                    break;
                case 730517441:
                case 1515609418:
                    C3911.m11924();
                    if (C2167.f7158 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۧۚ")) * 5;
                        i4 = ((iM6981 ^ i3) * (-16919)) ^ (-972057083);
                        i5 = -730695705;
                    } else {
                        iM6981 = (C2105.m6981("ۛ۫") + i3) * 35;
                        i4 = ((iM6981 ^ i2) * 3081) ^ (-934205225);
                        i5 = 289076532;
                    }
                    break;
                case 1038336933:
                case 2136746897:
                    C1294.m4372();
                    iM6981 = (C2105.m6981("ۛ۫") + i3) * 35;
                    i4 = ((iM6981 ^ i2) * 3081) ^ (-934205225);
                    i5 = 289076532;
                    break;
                case 1569420299:
                case 1946210092:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۧۚ")) * 5;
                        i4 = ((iM6981 ^ i3) * (-16919)) ^ (-972057083);
                        i5 = -730695705;
                    } else {
                        iM6981 = C0630.m2566("֨ܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3343) ^ 1220411286;
                        i5 = -1512485264;
                    }
                    break;
                default:
                    if (!C2167.m7155()) {
                        iM6981 = C2105.m6981("ܿۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21441) ^ (-592347482);
                        i5 = 956567933;
                    } else {
                        iM6981 = C2105.m6981("ۤ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32249)) ^ 355016381;
                        i5 = -684781834;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        boolean z = false;
        ActivityC17169 activityC17169 = null;
        C6499 c6499 = null;
        int i = 1763353238;
        int i2 = C4117.f13076;
        int i3 = C1420.f5096;
        int iM2566 = C0630.m2566("ۨ᩵") ^ i2;
        int i4 = ((iM2566 ^ i3) * 30209) ^ (-742786956);
        int i5 = 1495694165;
        while (true) {
            i = ((((i ^ i3) * 13337) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2125862698:
                case 681174620:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C0630.m2566("ۧܺ") + i2) * 41;
                        i4 = ((iM2566 ^ i3) * (-29359)) ^ 1508687609;
                        i5 = -1546448466;
                    } else {
                        iM2566 = (C0630.m2566("ۤܰ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * 8705) ^ (-57597091);
                        i5 = -426159588;
                    }
                    break;
                case -1392733014:
                case -1241268251:
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C2105.m6981("֨ۗ") ^ i2) * 97;
                        i4 = ((iM2566 ^ i3) * (-23505)) ^ (-767519676);
                        i5 = 1351868421;
                    } else {
                        iM2566 = (C2105.m6981("֨۠") ^ i2) * (-41);
                        i4 = ((iM2566 ^ i3) * 15807) ^ 260063567;
                        i5 = 946446021;
                    }
                    break;
                case -1297465459:
                case 113842925:
                    C5695.m16023();
                    break;
                case -1280863546:
                case 1650291415:
                    this.f50031 = c6499;
                    if (C1005.f3721) {
                        iM2566 = (C0630.m2566("ۙ᩶") ^ i2) * 5;
                        i4 = ((iM2566 ^ i3) * 8277) ^ (-229900915);
                        i5 = 1800107110;
                    } else {
                        iM2566 = (C2105.m6981("֨ۗ") ^ i2) * 97;
                        i4 = ((iM2566 ^ i3) * (-23505)) ^ (-767519676);
                        i5 = 1351868421;
                    }
                    break;
                case -1101609151:
                case 1029492189:
                    this.f50024 = z;
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C2105.m6981("ۧۜ") + i3) * (-49);
                        i4 = ((iM2566 ^ i2) * (-9487)) ^ 1823457490;
                        i5 = 682840705;
                    } else {
                        iM2566 = C0630.m2566("ۚܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 13097) ^ (-985168255);
                        i5 = 1822778266;
                    }
                    break;
                case -846111992:
                case -59416174:
                    C1916.m6308();
                    if (C1420.f5096 <= 0) {
                        iM2566 = (i3 - C0630.m2566("֨֫")) * (-39);
                        i4 = ((iM2566 ^ i2) * (-4533)) ^ 200480841;
                        i5 = 1394363754;
                    } else {
                        iM2566 = (C2105.m6981("֨ۗ") ^ i2) * 97;
                        i4 = ((iM2566 ^ i3) * (-23505)) ^ (-767519676);
                        i5 = 1351868421;
                    }
                    break;
                case -626773788:
                case 848256807:
                    this.f50029 = c6499;
                    this.f50035 = c6499;
                    break;
                case -409466525:
                case 1170088004:
                    if (C0237.f1507 == 0) {
                        iM2566 = (C2105.m6981("ۧۜ") + i3) * (-49);
                        i4 = ((iM2566 ^ i2) * (-9487)) ^ 1823457490;
                        i5 = 682840705;
                    } else {
                        iM2566 = (i3 - C0630.m2566("֨֫")) * (-39);
                        i4 = ((iM2566 ^ i2) * (-4533)) ^ 200480841;
                        i5 = 1394363754;
                    }
                    break;
                case -14134653:
                case 1077795600:
                    C1504.m5179();
                    C0630.m2564();
                    iM2566 = (C2105.m6981("֨ۗ") ^ i2) * 97;
                    i4 = ((iM2566 ^ i3) * (-23505)) ^ (-767519676);
                    i5 = 1351868421;
                    break;
                case -9006020:
                case 795829165:
                    activityC17169 = (ActivityC17169) RunnableC0588.m2429(this);
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("ۧܺ") + i2) * 41;
                        i4 = ((iM2566 ^ i3) * (-29359)) ^ 1508687609;
                        i5 = -1546448466;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۖ") + i2) * (-109);
                        i4 = ((iM2566 ^ i3) * (-20139)) ^ 1826218580;
                        i5 = 2091215592;
                    }
                    break;
                case 200983292:
                case 1986821699:
                    activityC17169.m10234();
                    c6499 = null;
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C0630.m2566("ۧܺ") + i2) * 41;
                        i4 = ((iM2566 ^ i3) * (-29359)) ^ 1508687609;
                        i5 = -1546448466;
                    } else {
                        iM2566 = (C2105.m6981("ۡۘ") ^ i3) * 73;
                        i4 = ((iM2566 ^ i2) * (-4079)) ^ 440077997;
                        i5 = -415517027;
                    }
                    break;
                case 267325823:
                case 346533045:
                    super.onDestroyView();
                    if (C1005.f3721) {
                        iM2566 = C2105.m6981("ܳۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 30777) ^ (-840701271);
                        i5 = 2119211763;
                    } else {
                        iM2566 = (C2105.m6981("֨ۗ") ^ i2) * 97;
                        i4 = ((iM2566 ^ i3) * (-23505)) ^ (-767519676);
                        i5 = 1351868421;
                    }
                    break;
                case 340948212:
                case 783475046:
                    C4263.m12819();
                    if (C3245.f10203 <= 0) {
                        iM2566 = (i2 - C0630.m2566("ۜۘ")) * (-79);
                        i4 = ((iM2566 ^ i3) * 15483) ^ 1640817167;
                        i5 = -998744023;
                    } else {
                        iM2566 = (C2105.m6981("֨ۗ") ^ i2) * 97;
                        i4 = ((iM2566 ^ i3) * (-23505)) ^ (-767519676);
                        i5 = 1351868421;
                    }
                    break;
                case 565068876:
                case 1725544608:
                    z = false;
                    if (RunnableC3474.m10630()) {
                        iM2566 = (C2105.m6981("ᩳ᩹") + i3) * (-119);
                        i4 = ((iM2566 ^ i2) * (-8005)) ^ (-1952335101);
                        i5 = 1182183703;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۜۘ")) * (-79);
                        i4 = ((iM2566 ^ i3) * 15483) ^ 1640817167;
                        i5 = -998744023;
                    }
                    break;
                case 1870657711:
                case 1996417436:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (i3 - C0630.m2566("֨֫")) * (-39);
                        i4 = ((iM2566 ^ i2) * (-4533)) ^ 200480841;
                        i5 = 1394363754;
                    } else {
                        iM2566 = (C0630.m2566("ۚ᩹") + i3) * (-89);
                        i4 = ((iM2566 ^ i2) * (-26881)) ^ (-1529503215);
                        i5 = -668655136;
                    }
                    break;
                default:
                    if (C11340.m28031()) {
                        iM2566 = C2105.m6981("ۙۘ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15633)) ^ (-1501080025);
                        i5 = 968276247;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۜۘ")) * (-79);
                        i4 = ((iM2566 ^ i3) * 15483) ^ 1640817167;
                        i5 = -998744023;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16266() {
        boolean z = false;
        int i = -73187085;
        int i2 = C1773.f6144;
        int i3 = C22628.f73083;
        short s = f50023[0];
        super(C0630.m2566(C0050.m948(f50023, 1, 3, ((s * s) + 296218521) - (s * 34422) >= 0 ? 44415 : 34322)) ^ 2097182918);
        int iM2566 = C0630.m2566("᩸ۤ") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-14957)) ^ 2119595098;
        int i5 = 957281215;
        while (true) {
            i = ((((i ^ i2) * (-469)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2082089887:
                case 1685230609:
                    C3663.m11168();
                    C0382.m1848();
                    iM2566 = (C0630.m2566("ܰ᩹") + i2) * (-109);
                    i4 = ((iM2566 ^ i3) * (-4647)) ^ (-207169232);
                    i5 = -2129772505;
                    break;
                case -2043605923:
                case -1586025059:
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C0630.m2566("ۖ۫") + i2) * (-15);
                        i4 = ((iM2566 ^ i3) * 12003) ^ 879054736;
                        i5 = -1549048462;
                    } else {
                        iM2566 = (C2105.m6981("ܿ᩵") + i2) * 95;
                        i4 = ((iM2566 ^ i3) * (-12061)) ^ 1835398527;
                        i5 = 1334865336;
                    }
                    break;
                case -1711446518:
                case 1785150372:
                    C2520.m8026();
                    C1047.m3599();
                    throw new RuntimeException();
                case -1684842400:
                case 878521515:
                    C2167.m7155();
                    if (!C2272.f7362) {
                        iM2566 = C2105.m6981("ۛۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-20725)) ^ 1871177546;
                        i5 = 1484733841;
                    } else {
                        iM2566 = (C0630.m2566("ܰ᩹") + i2) * (-109);
                        i4 = ((iM2566 ^ i3) * (-4647)) ^ (-207169232);
                        i5 = -2129772505;
                    }
                    break;
                case -1571001335:
                case 884173309:
                    if (C3911.f12484 >= 0) {
                        iM2566 = C2105.m6981("ܺ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13017)) ^ (-124694985);
                        i5 = 450930924;
                    } else {
                        iM2566 = (C2105.m6981("᩵ۗ") + i3) * 23;
                        i4 = ((iM2566 ^ i2) * (-14047)) ^ (-1731884073);
                        i5 = -1704324760;
                    }
                    break;
                case -1513750124:
                case 183856672:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C0630.m2566("ۖ۫") + i2) * (-15);
                        i4 = ((iM2566 ^ i3) * 12003) ^ 879054736;
                        i5 = -1549048462;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ܰܰ")) * (-115);
                        i4 = ((iM2566 ^ i3) * 10047) ^ 1077913771;
                        i5 = -318384536;
                    }
                    break;
                case -894937815:
                case 1304820475:
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("ܺۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-4263)) ^ (-626268957);
                        i5 = 1368486956;
                    } else {
                        iM2566 = C2105.m6981("ܽ᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30027)) ^ 303730995;
                        i5 = 608761096;
                    }
                    break;
                case -622797211:
                case 1664429039:
                    if (C4159.f13567) {
                        iM2566 = (C0630.m2566("ۢ᩹") + i3) * 39;
                        i4 = ((iM2566 ^ i2) * (-12351)) ^ 1282607700;
                        i5 = -1746470305;
                    } else {
                        iM2566 = (C0630.m2566("ܰ᩹") + i2) * (-109);
                        i4 = ((iM2566 ^ i3) * (-4647)) ^ (-207169232);
                        i5 = -2129772505;
                    }
                    break;
                case -566143215:
                case -512682647:
                    C5695.m16023();
                    if (!C0382.f1805) {
                        iM2566 = C0630.m2566("ܺۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-4263)) ^ (-626268957);
                        i5 = 1368486956;
                    } else {
                        iM2566 = (C0630.m2566("ܰ᩹") + i2) * (-109);
                        i4 = ((iM2566 ^ i3) * (-4647)) ^ (-207169232);
                        i5 = -2129772505;
                    }
                    break;
                case -330201578:
                case 1262359838:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C0630.m2566("ܰ᩹") + i2) * (-109);
                        i4 = ((iM2566 ^ i3) * (-4647)) ^ (-207169232);
                        i5 = -2129772505;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩺ܽ")) * (-95);
                        i4 = ((iM2566 ^ i2) * 7685) ^ 91044172;
                        i5 = 130392197;
                    }
                    break;
                case 71993174:
                case 389343948:
                    if (C7811.f24123 >= 0) {
                        iM2566 = C2105.m6981("ܺ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13017)) ^ (-124694985);
                        i5 = 450930924;
                    } else {
                        iM2566 = C0630.m2566("ܿۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3349)) ^ 1299042746;
                        i5 = 1300802972;
                    }
                    break;
                case 104207973:
                case 719710279:
                    if (C4117.f13076 <= 0) {
                        iM2566 = C2105.m6981("ۛۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-20725)) ^ 1871177546;
                        i5 = 1484733841;
                    } else {
                        iM2566 = C0630.m2566("ᩴ۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27235) ^ (-1258803224);
                        i5 = -1702553676;
                    }
                    break;
                case 216976944:
                case 1089768465:
                    z = true;
                    if (C7106.m19120() <= 0) {
                        iM2566 = (C0630.m2566("ۖ۫") + i2) * (-15);
                        i4 = ((iM2566 ^ i3) * 12003) ^ 879054736;
                        i5 = -1549048462;
                    } else {
                        iM2566 = C2105.m6981("֫ۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-26163)) ^ (-471888008);
                        i5 = -1278034893;
                    }
                    break;
                case 828965305:
                case 1838997525:
                    if (!C2272.f7362) {
                        iM2566 = (C0630.m2566("ۖ۫") + i2) * (-15);
                        i4 = ((iM2566 ^ i3) * 12003) ^ 879054736;
                        i5 = -1549048462;
                    } else {
                        iM2566 = (C0630.m2566("ܰ᩹") + i2) * (-109);
                        i4 = ((iM2566 ^ i3) * (-4647)) ^ (-207169232);
                        i5 = -2129772505;
                    }
                    break;
                case 1036164359:
                case 1785167436:
                    setHasOptionsMenu(z);
                    return;
                default:
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ܺ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13017)) ^ (-124694985);
                        i5 = 450930924;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۖܳ")) * (-5);
                        i4 = ((iM2566 ^ i2) * (-21531)) ^ (-963719441);
                        i5 = -1728947346;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ܺ */
    public final String mo14421() {
        return mo14422();
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f5 A[PHI: r0 r5 r6 r7
      0x01f5: PHI (r0v7 l.ܿۛ᩷) = (r0v2 l.ܿۛ᩷), (r0v6 l.ܿۛ᩷), (r0v2 l.ܿۛ᩷), (r0v2 l.ܿۛ᩷) binds: [B:64:0x01f3, B:37:0x00f6, B:33:0x00cf, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r5v4 short[]) = (r5v2 short[]), (r5v3 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:64:0x01f3, B:37:0x00f6, B:33:0x00cf, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:64:0x01f3, B:37:0x00f6, B:33:0x00cf, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:64:0x01f3, B:37:0x00f6, B:33:0x00cf, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0242 A[PHI: r2 r3
      0x0242: PHI (r2v7 short) = (r2v2 short), (r2v2 short), (r2v6 short), (r2v2 short) binds: [B:72:0x0240, B:68:0x0227, B:52:0x018d, B:48:0x016a] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v5 int) binds: [B:72:0x0240, B:68:0x0227, B:52:0x018d, B:48:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ComponentCallbacksC9205
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iM6981;
        int i;
        int i2;
        ActivityC17169 activityC17169 = null;
        View viewOnCreateView = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1635053700;
        int i8 = C0050.f910;
        int i9 = C1773.f6144;
        int iM2566 = (C0630.m2566("ۗۖ") ^ i8) * (-39);
        int i10 = ((iM2566 ^ i9) * 20969) ^ (-176362771);
        int i11 = -1385907590;
        while (true) {
            int i12 = iM2566 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i9) * (-8999)) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -2094908128:
                    case -318730674:
                        View viewM40367 = activityC17169.m40367(C0630.m2566(AbstractC2021.m6573(sArr, i5, i6, i4)) ^ 2125832389);
                        if (viewM40367 == null) {
                            iM6981 = C2105.m6981("ۙܰ") ^ i8;
                            i = ((iM6981 ^ i9) * 5365) ^ (-964738562);
                            i2 = 1113213810;
                        } else {
                            viewOnCreateView = viewM40367;
                            iM6981 = (C0630.m2566("֡ᩴ") ^ i9) * 79;
                            i = ((iM6981 ^ i8) * 24825) ^ (-614140580);
                            i2 = 109190001;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -2043375390:
                    case -1090548402:
                        viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
                        C3537.m10749(viewOnCreateView);
                        iM6981 = (C0630.m2566("֡ᩴ") ^ i9) * 79;
                        i = ((iM6981 ^ i8) * 24825) ^ (-614140580);
                        i2 = 109190001;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -2039971513:
                    case -1387172615:
                        C3019.m9255();
                        if (RunnableC3474.f10992 > 0) {
                        }
                        iM6981 = C2105.m6981("۫ۚ") ^ i8;
                        i = ((iM6981 ^ i9) * 21115) ^ 2119933542;
                        i2 = 928168504;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -1787201459:
                    case 206069370:
                        if (i3 - (s * 17132) >= 0) {
                            iM6981 = (i9 - C0630.m2566("ᩳ۬")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i = ((iM6981 ^ i8) * (-21833)) ^ 288208235;
                            i2 = 293042778;
                        } else {
                            iM6981 = (i8 - C2105.m6981("۠ܺ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i = ((iM6981 ^ i9) * (-17635)) ^ (-370222285);
                            i2 = -874025426;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -1766251707:
                    case -1221773790:
                        i4 = 12877;
                        iM6981 = C2105.m6981("᩵᩻") ^ i8;
                        i = ((iM6981 ^ i9) * 18989) ^ 805588132;
                        i2 = 617781817;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -1572479033:
                    case 808008823:
                        i4 = 48410;
                        iM6981 = C2105.m6981("᩵᩻") ^ i8;
                        i = ((iM6981 ^ i9) * 18989) ^ 805588132;
                        i2 = 617781817;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -1367943003:
                    case 912583530:
                        if (C3746.f11829 <= 0) {
                            iM6981 = (i9 - C2105.m6981("ۤ۟")) * (-77);
                            i = ((iM6981 ^ i8) * 7361) ^ 1335309082;
                            i2 = 374452005;
                        } else {
                            iM6981 = C2105.m6981("ܳᩴ") ^ i9;
                            i = ((iM6981 ^ i8) * 9203) ^ (-192669315);
                            i2 = -477876028;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -1299569736:
                    case 50314902:
                        C1294.m4372();
                        C0964.m3413();
                        break;
                    case -1274052250:
                    case 1778725882:
                        C1294.m4383(new RunnableC2156(0, this), 600L);
                        return viewOnCreateView;
                    case -1187627012:
                    case 1823599103:
                        s = f50023[50];
                        if (C0422.f1886 <= 0) {
                            iM6981 = (i9 - C2105.m6981("ۤ۟")) * (-77);
                            i = ((iM6981 ^ i8) * 7361) ^ 1335309082;
                            i2 = 374452005;
                        } else {
                            iM6981 = (C0630.m2566("ۤۘ") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i = ((iM6981 ^ i8) * (-6601)) ^ 1696811161;
                            i2 = 2129215023;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -872973764:
                    case 1612298012:
                        C4263.m12819();
                        if (!RunnableC1108.f4040) {
                            iM6981 = (C0630.m2566("ۤ᩻") + i9) * (-45);
                            i = ((iM6981 ^ i8) * (-6661)) ^ (-253493190);
                            i2 = -898355935;
                            i12 = iM6981 ^ i2;
                            i10 = i;
                        }
                        break;
                    case -851859309:
                    case -20669318:
                        if (C3245.m9925() != 0) {
                            iM6981 = (i9 - C2105.m6981("ۤ۟")) * (-77);
                            i = ((iM6981 ^ i8) * 7361) ^ 1335309082;
                            i2 = 374452005;
                        } else {
                            iM6981 = C2105.m6981("᩹֡") ^ i9;
                            i = ((iM6981 ^ i8) * 19551) ^ 336447960;
                            i2 = -1053547125;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -663434796:
                    case 590551503:
                        activityC17169 = (ActivityC17169) RunnableC0588.m2429(this);
                        sArr = f50023;
                        if (C2520.m8026()) {
                            iM6981 = (C0630.m2566("ۤ᩻") + i9) * (-45);
                            i = ((iM6981 ^ i8) * (-6661)) ^ (-253493190);
                            i2 = -898355935;
                        } else {
                            iM6981 = (C0630.m2566("᩺֡") ^ i9) * (-35);
                            i = ((iM6981 ^ i8) * (-8483)) ^ (-168898344);
                            i2 = -1574465511;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -417696476:
                    case 912068852:
                        if (C4075.m12263() > 0) {
                            iM6981 = (i8 - C2105.m6981("۫ܺ")) * 83;
                            i = ((iM6981 ^ i9) * 12981) ^ 695866100;
                            i2 = 1864900307;
                            i12 = iM6981 ^ i2;
                            i10 = i;
                        }
                        iM6981 = C2105.m6981("۫ۚ") ^ i8;
                        i = ((iM6981 ^ i9) * 21115) ^ 2119933542;
                        i2 = 928168504;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -357062906:
                    case -276136395:
                        if (C0798.m2998() != 0) {
                            iM6981 = (C0630.m2566("ۤ᩻") + i9) * (-45);
                            i = ((iM6981 ^ i8) * (-6661)) ^ (-253493190);
                            i2 = -898355935;
                        } else {
                            iM6981 = (i8 - C0630.m2566("᩵ܽ")) * (-33);
                            i = ((iM6981 ^ i9) * (-30405)) ^ 1954084238;
                            i2 = 1278238000;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -233508172:
                    case 1059287618:
                        C0237.m1481();
                        C1504.m5179();
                        return null;
                    case 134741322:
                    case 588364941:
                        if (C4159.f13567) {
                            iM6981 = C0630.m2566("ᩴܺ") ^ i8;
                            i = ((iM6981 ^ i9) * 19701) ^ 1586636558;
                            i2 = -796463353;
                        } else {
                            iM6981 = C2105.m6981("۫ۚ") ^ i8;
                            i = ((iM6981 ^ i9) * 21115) ^ 2119933542;
                            i2 = 928168504;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 740346122:
                    case 1606977843:
                        if (C3663.f11553) {
                            iM6981 = C2105.m6981("۫ۚ") ^ i8;
                            i = ((iM6981 ^ i9) * 21115) ^ 2119933542;
                            i2 = 928168504;
                        } else {
                            iM6981 = C2105.m6981("֡ۛ") ^ i9;
                            i = ((iM6981 ^ i8) * 26467) ^ (-313142442);
                            i2 = -1752437936;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 958063074:
                    case 970910516:
                        i5 = 51;
                        i6 = 3;
                        if (C3911.f12484 >= 0) {
                            iM6981 = (C0630.m2566("ۤ᩻") + i9) * (-45);
                            i = ((iM6981 ^ i8) * (-6661)) ^ (-253493190);
                            i2 = -898355935;
                        } else {
                            iM6981 = (C2105.m6981("ۡ᩹") + i8) * 81;
                            i = ((iM6981 ^ i9) * (-14115)) ^ (-588887233);
                            i2 = 495621053;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 1391372117:
                    case 1722843979:
                        int i13 = s + 4283;
                        i3 = i13 * i13;
                        if (C1005.m3501()) {
                            iM6981 = (C0630.m2566("ܶᩴ") + i8) * 47;
                            i = ((iM6981 ^ i9) * 16301) ^ 2142195146;
                            i2 = -150520278;
                        } else {
                            iM6981 = (i9 - C2105.m6981("ۤ۟")) * (-77);
                            i = ((iM6981 ^ i8) * 7361) ^ 1335309082;
                            i2 = 374452005;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    default:
                        if (C4159.f13567) {
                            iM6981 = (i8 - C2105.m6981("ᩳۡ")) * 95;
                            i = ((iM6981 ^ i9) * 3979) ^ 1228081448;
                            i2 = -159914231;
                        } else {
                            iM6981 = (i8 - C2105.m6981("۫ܺ")) * 83;
                            i = ((iM6981 ^ i9) * 12981) ^ 695866100;
                            i2 = 1864900307;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                }
            }
            iM2566 = C0630.m2566("ܶۚ") ^ i9;
            i10 = ((iM2566 ^ i8) * 31687) ^ (-290381479);
            i11 = -592874202;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e3 A[PHI: r3 r5 r9 r10
      0x01e3: PHI (r3v2 l.ۙܺ֫) = (r3v1 l.ۙܺ֫), (r3v3 l.ۙܺ֫) binds: [B:57:0x01e1, B:38:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r5v3 java.lang.Class<l.۫ۛ᩷>) = (r5v2 java.lang.Class<l.۫ۛ᩷>), (r5v4 java.lang.Class<l.۫ۛ᩷>) binds: [B:57:0x01e1, B:38:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r9v4 short) = (r9v3 short), (r9v2 short) binds: [B:57:0x01e1, B:38:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r10v4 short) = (r10v3 short), (r10v2 short) binds: [B:57:0x01e1, B:38:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0214 A[PHI: r6 r8 r12 r13 r14
      0x0214: PHI (r6v5 l.ۛ᩵᩷) = (r6v2 l.ۛ᩵᩷), (r6v2 l.ۛ᩵᩷), (r6v3 l.ۛ᩵᩷), (r6v2 l.ۛ᩵᩷), (r6v2 l.ۛ᩵᩷), (r6v2 l.ۛ᩵᩷) binds: [B:61:0x0212, B:28:0x00c5, B:31:0x00d2, B:24:0x00a0, B:15:0x0067, B:85:0x0214] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r8v5 char) = (r8v3 char), (r8v2 char), (r8v2 char), (r8v2 char), (r8v2 char), (r8v2 char) binds: [B:61:0x0212, B:28:0x00c5, B:31:0x00d2, B:24:0x00a0, B:15:0x0067, B:85:0x0214] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r12v5 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:61:0x0212, B:28:0x00c5, B:31:0x00d2, B:24:0x00a0, B:15:0x0067, B:85:0x0214] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r13v5 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:61:0x0212, B:28:0x00c5, B:31:0x00d2, B:24:0x00a0, B:15:0x0067, B:85:0x0214] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r14v5 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:61:0x0212, B:28:0x00c5, B:31:0x00d2, B:24:0x00a0, B:15:0x0067, B:85:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0241 A[PHI: r4 r20
      0x0241: PHI (r4v5 l.ۘۛ᩷) = (r4v4 l.ۘۛ᩷), (r4v2 l.ۘۛ᩷), (r4v2 l.ۘۛ᩷) binds: [B:42:0x0128, B:9:0x0057, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r20v2 short[]) = (r20v1 short[]), (r20v1 short[]), (r20v3 short[]) binds: [B:42:0x0128, B:9:0x0057, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        int iM2566;
        int i;
        int i2;
        int i3 = C0050.f910;
        int i4 = C7811.f24123;
        int iM6981 = (C2105.m6981("ᩴܶ") + i3) * 101;
        int i5 = ((iM6981 ^ i4) * (-14397)) ^ (-573182148);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ 839863340;
        C4741 c4741 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1345536471;
        C6273 c6273M44073 = null;
        Class<C12230> cls = null;
        C3764 c3764 = null;
        C4741 c4742 = null;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i4) * (-17153)) >> 31));
            switch (i10) {
                case -2114281187:
                case -1659012369:
                    c = '(';
                    if (C1916.f6442) {
                        iM2566 = (i3 - C0630.m2566("ۢ᩶")) * 9;
                        i = ((iM2566 ^ i4) * (-5627)) ^ 835635500;
                        i2 = 282471335;
                    } else {
                        iM2566 = (C2105.m6981("᩺ᩴ") + i3) * 57;
                        i = ((iM2566 ^ i4) * (-19361)) ^ 2085594775;
                        i2 = -1750251775;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2014190788:
                case 404644733:
                    if (C0422.f1886 <= 0) {
                        iM2566 = (i4 - C2105.m6981("ۖۗ")) * (-27);
                        i = ((iM2566 ^ i3) * (-28183)) ^ (-2090983765);
                        i2 = -1388456756;
                    } else {
                        iM2566 = C0630.m2566("᩺ۖ") ^ i3;
                        i = ((iM2566 ^ i4) * (-859)) ^ 1724420684;
                        i2 = 123448127;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1778166519:
                case -1631904702:
                    this.f50030 = c3764;
                    ActivityC0737 activityC0737M2429 = RunnableC0588.m2429(this);
                    if (C4616.m13552() == 0) {
                        c4741 = new C4741(activityC0737M2429);
                        cls = C12230.class;
                        if (ServiceConnectionC3453.f10921 >= 0) {
                            iM2566 = (C2105.m6981("ۜܿ") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i = ((iM2566 ^ i3) * (-3851)) ^ (-2077262092);
                            i2 = 207208630;
                        } else {
                            iM2566 = (C0630.m2566("ܶۜ") ^ i4) * (-85);
                            i = ((iM2566 ^ i3) * (-19991)) ^ 923550060;
                            i2 = -1540357940;
                        }
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        int iM6982 = C2105.m6981("ۘܰ") ^ i4;
                        i6 = iM6982 ^ (-447467069);
                        i5 = ((iM6982 ^ i3) * (-11591)) ^ (-1469580414);
                        c4741 = null;
                    }
                    break;
                case -1768974574:
                case 127136548:
                    RunnableC3474.m10630();
                    C5695.m16023();
                    break;
                case -1747132130:
                case 1045006041:
                    c3764 = (C3764) c4742.m13885(C3764.class);
                    if (C2167.f7158 >= 0) {
                        iM2566 = C0630.m2566("᩺ۖ") ^ i3;
                        i = ((iM2566 ^ i4) * (-859)) ^ 1724420684;
                        i2 = 123448127;
                    } else {
                        iM2566 = (C0630.m2566("᩹᩺") + i4) * 47;
                        i = ((iM2566 ^ i3) * 21715) ^ 43994914;
                        i2 = 1036839441;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1371744274:
                case 656420346:
                    i7 = 4116;
                    iM2566 = C2105.m6981("ᩴܰ") ^ i4;
                    i = ((iM2566 ^ i3) * (-31695)) ^ (-543463819);
                    i2 = -1201068537;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -956930329:
                case 1103823224:
                    if ((s * s2) - ((s * s) + 327863449) > 0) {
                        iM2566 = C0630.m2566("֫᩹") ^ i3;
                        i = ((iM2566 ^ i4) * 647) ^ (-82040326);
                        i2 = 1385758859;
                    } else {
                        iM2566 = (C2105.m6981("ܳܰ") ^ i4) * 97;
                        i = ((iM2566 ^ i3) * (-5401)) ^ 321100727;
                        i2 = 1466795540;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -702778706:
                case 1016122062:
                    i7 = 25763;
                    iM2566 = C2105.m6981("ᩴܰ") ^ i4;
                    i = ((iM2566 ^ i3) * (-31695)) ^ (-543463819);
                    i2 = -1201068537;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -701665636:
                case 435545325:
                    C3683.m11222();
                    C3019.m9255();
                    iM2566 = (i4 - C2105.m6981("ۖۗ")) * (-27);
                    i = ((iM2566 ^ i3) * (-28183)) ^ (-2090983765);
                    i2 = -1388456756;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -532188044:
                case -67269144:
                    C3019.m9255();
                    if (C0714.f2697 < 0) {
                        int iM6983 = C2105.m6981("ۘܰ") ^ i4;
                        i6 = iM6983 ^ (-447467069);
                        i5 = ((iM6983 ^ i3) * (-11591)) ^ (-1469580414);
                        c4741 = null;
                    } else {
                        iM2566 = (C2105.m6981("᩺ᩴ") + i3) * 57;
                        i = ((iM2566 ^ i4) * (-19361)) ^ 2085594775;
                        i2 = -1750251775;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    }
                    break;
                case -250367352:
                case 1002743212:
                    s = sArr[c];
                    s2 = 36214;
                    if (C2272.f7362) {
                        iM2566 = (C2105.m6981("ۜܿ") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2566 ^ i3) * (-3851)) ^ (-2077262092);
                        i2 = 207208630;
                    } else {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i3;
                        i = ((iM2566 ^ i4) * 16151) ^ 1622779552;
                        i2 = 978553785;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -164363922:
                case 899853536:
                    sArr2 = f50023;
                    i8 = 41;
                    i9 = 5;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C2105.m6981("᩺ᩴ") + i3) * 57;
                        i = ((iM2566 ^ i4) * (-19361)) ^ 2085594775;
                        i2 = -1750251775;
                    } else {
                        iM2566 = C2105.m6981("ۧ᩹") ^ i3;
                        i = ((iM2566 ^ i4) * 17613) ^ (-1712013115);
                        i2 = -162683725;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 161142908:
                case 1637319225:
                    super.onCreate(bundle);
                    c4742 = new C4741(C3683.m11214(this));
                    if (C0964.f3626 == 0) {
                        iM2566 = C0630.m2566("۟۠") ^ i3;
                        i = ((iM2566 ^ i4) * 18683) ^ 316728984;
                        i2 = 1803102132;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        int iM6984 = C2105.m6981("ۘܰ") ^ i4;
                        i6 = iM6984 ^ (-447467069);
                        i5 = ((iM6984 ^ i3) * (-11591)) ^ (-1469580414);
                        c4741 = null;
                    }
                    break;
                case 182995338:
                case 418278825:
                    c6273M44073.m36541(C0798.m3005(sArr2, i8, i9, i7));
                    this.f50033 = c6273M44073;
                    break;
                case 1303161579:
                case 1333024455:
                    this.f50034 = (C12230) c4741.m13885(cls);
                    if (C2105.f7037 != 0) {
                        iM2566 = (C2105.m6981("᩺ᩴ") + i3) * 57;
                        i = ((iM2566 ^ i4) * (-19361)) ^ 2085594775;
                        i2 = -1750251775;
                    } else {
                        c6273M44073 = ViewOnClickListenerC19121.m44073(this, new InterfaceC23206() { // from class: l.ᩳ᩻ۢ
                            @Override // l.InterfaceC23206
                            public final /* synthetic */ void onCanceled() {
                            }

                            @Override // l.InterfaceC23206
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo8486(String str) {
                                C16266.m38263(this.f57099, str);
                            }
                        });
                        if (C2272.f7362) {
                            iM2566 = (C2105.m6981("᩺ᩴ") + i3) * 57;
                            i = ((iM2566 ^ i4) * (-19361)) ^ 2085594775;
                            i2 = -1750251775;
                        } else {
                            iM2566 = C2105.m6981("ۧۘ") ^ i3;
                            i = ((iM2566 ^ i4) * (-26575)) ^ (-2133161021);
                            i2 = 177324276;
                        }
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1420046300:
                case 1729469418:
                    if (C7106.m19120() <= 0) {
                        iM2566 = (i4 - C2105.m6981("ۖۗ")) * (-27);
                        i = ((iM2566 ^ i3) * (-28183)) ^ (-2090983765);
                        i2 = -1388456756;
                    } else {
                        iM2566 = (C2105.m6981("᩺ᩴ") + i3) * 57;
                        i = ((iM2566 ^ i4) * (-19361)) ^ 2085594775;
                        i2 = -1750251775;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f50023;
                    if (C0422.m1963()) {
                        iM2566 = (C0630.m2566("ۨۜ") ^ i4) * 83;
                        i = ((iM2566 ^ i3) * 16401) ^ 2055575440;
                        i2 = 767897574;
                    } else {
                        iM2566 = C0630.m2566("᩺ۖ") ^ i3;
                        i = ((iM2566 ^ i4) * (-859)) ^ 1724420684;
                        i2 = 123448127;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0133 A[PHI: r5 r6 r7
      0x0133: PHI (r5v4 java.lang.StringBuilder) = (r5v3 java.lang.StringBuilder), (r5v2 java.lang.StringBuilder) binds: [B:35:0x0131, B:27:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v2 java.lang.String) binds: [B:35:0x0131, B:27:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v5 java.lang.String) binds: [B:35:0x0131, B:27:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ᩷ */
    public final String mo14422() {
        int iM6981;
        int i;
        int i2;
        int iM9036;
        int iM6982;
        int i3;
        short s;
        C16266 c16266 = this;
        int i4 = C1047.f3863;
        int i5 = C1420.f5096;
        int iM2566 = (i4 - C0630.m2566("۟ܶ")) * 73;
        int i6 = ((iM2566 ^ i5) * (-5509)) ^ (-2021319393);
        String strM11919 = null;
        short[] sArr = null;
        int i7 = iM2566 ^ 1394619113;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s2 = 0;
        int i13 = -992620256;
        int i14 = 0;
        String strM38278 = null;
        short[] sArr2 = null;
        int i15 = 0;
        StringBuilder sb = null;
        String strM6309 = null;
        String strM11225 = null;
        Bundle bundleM10747 = null;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i5) * (-2109)) >> 31));
            switch (i13) {
                case -2031600728:
                case -1820081460:
                    strM6309 = C1916.m6309(bundleM10747, strM11225);
                    iM9036 = C2958.m9036(strM6309, 40);
                    if (iM9036 == -1) {
                        iM6981 = (C0630.m2566("֫ᩳ") + i4) * (-55);
                        i = ((iM6981 ^ i5) * (-23045)) ^ (-1024852121);
                        i2 = 735604028;
                    } else {
                        i15 = iM9036;
                        iM6981 = C2105.m6981("ܶ֫") ^ i5;
                        i = ((iM6981 ^ i4) * (-22213)) ^ 969518176;
                        i2 = 952841054;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -2016829850:
                case 98209195:
                    sArr2 = f50023;
                    c = 160;
                    if (C0382.f1805) {
                        iM6982 = C2105.m6981("۫ᩴ") ^ i5;
                        i6 = ((iM6982 ^ i4) * 30159) ^ 730052241;
                        i3 = -647547465;
                    } else {
                        iM6982 = (C2105.m6981("ۤۤ") + i5) * 75;
                        i6 = ((iM6982 ^ i4) * (-6587)) ^ 1764615237;
                        i3 = -1854188198;
                    }
                    i7 = iM6982 ^ i3;
                    c16266 = this;
                    break;
                case -1699930422:
                case 537710199:
                    s2 = sArr2[c];
                    if (C2105.f7037 != 0) {
                        iM6982 = C0630.m2566("ۚۨ") ^ i5;
                        i6 = ((iM6982 ^ i4) * 2337) ^ (-1853428456);
                        i3 = -1764202349;
                    } else {
                        iM6982 = C0630.m2566("᩻ۜ") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-19125)) ^ (-392323776);
                        i3 = -192658955;
                    }
                    i7 = iM6982 ^ i3;
                    c16266 = this;
                    break;
                case -1659372315:
                case 1339318019:
                    int i16 = i11 + i12;
                    if ((i16 + i16) - i10 < 0) {
                        iM6981 = C0630.m2566("ۖ֨") ^ i4;
                        i = ((iM6981 ^ i5) * 17939) ^ 2129683708;
                        i2 = -93760828;
                    } else {
                        iM6981 = C2105.m6981("ܰۙ") ^ i5;
                        i = ((iM6981 ^ i4) * 1061) ^ 1875315004;
                        i2 = -1077063488;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1655030028:
                case 378968532:
                    C3245.m9923(sb, C14336.m34210(strM38278));
                    if (!C1504.f5354) {
                        iM6981 = (C0630.m2566("ܶ۟") + i4) * (-105);
                        i = ((iM6981 ^ i5) * 26973) ^ (-1111516917);
                        i2 = 1040990488;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    } else {
                        iM6982 = (C2105.m6981("ۤۤ") + i5) * 75;
                        i6 = ((iM6982 ^ i4) * (-6587)) ^ 1764615237;
                        i3 = -1854188198;
                        i7 = iM6982 ^ i3;
                        c16266 = this;
                    }
                    break;
                case -1548582334:
                case -720213943:
                    C1005.m3501();
                    if (!C1711.f5919) {
                        iM6981 = C0630.m2566("᩵ܿ") ^ i4;
                        i = ((iM6981 ^ i5) * (-31783)) ^ 805161875;
                        i2 = -827047743;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    } else {
                        iM6982 = (C2105.m6981("ۤۤ") + i5) * 75;
                        i6 = ((iM6982 ^ i4) * (-6587)) ^ 1764615237;
                        i3 = -1854188198;
                        i7 = iM6982 ^ i3;
                        c16266 = this;
                    }
                    break;
                case -1387473680:
                case 958907220:
                    RunnableC1937.m6387();
                    if (!C4159.f13567) {
                        iM6982 = C0630.m2566("ۚۨ") ^ i5;
                        i6 = ((iM6982 ^ i4) * 2337) ^ (-1853428456);
                        i3 = -1764202349;
                        i7 = iM6982 ^ i3;
                        c16266 = this;
                    } else {
                        iM6981 = C0630.m2566("᩵ܿ") ^ i4;
                        i = ((iM6981 ^ i5) * (-31783)) ^ 805161875;
                        i2 = -827047743;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1328346395:
                case -633424387:
                    iM9036 = C0798.m3007(strM6309);
                    i15 = iM9036;
                    iM6981 = C2105.m6981("ܶ֫") ^ i5;
                    i = ((iM6981 ^ i4) * (-22213)) ^ 969518176;
                    i2 = 952841054;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1160414316:
                case -788733006:
                    strM11225 = C3683.m11225(sArr, i9, 6, i8);
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = C2105.m6981("᩶ܿ") ^ i4;
                        i = ((iM6981 ^ i5) * 18741) ^ (-1876333472);
                        i2 = 519633964;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    } else {
                        iM6982 = C0630.m2566("ۚۨ") ^ i5;
                        i6 = ((iM6982 ^ i4) * 2337) ^ (-1853428456);
                        i3 = -1764202349;
                        i7 = iM6982 ^ i3;
                        c16266 = this;
                    }
                    break;
                case -974373200:
                case 1861253618:
                    bundleM10747 = C3537.m10747(this);
                    sArr = f50023;
                    i9 = 161;
                    if (!C21923.m49329()) {
                        iM6981 = C2105.m6981("ۜۨ") ^ i4;
                        i = ((iM6981 ^ i5) * 29215) ^ 668164745;
                        i2 = 934126961;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    } else {
                        iM6982 = (C2105.m6981("ۤۤ") + i5) * 75;
                        i6 = ((iM6982 ^ i4) * (-6587)) ^ 1764615237;
                        i3 = -1854188198;
                        i7 = iM6982 ^ i3;
                        c16266 = this;
                    }
                    break;
                case -962423125:
                case 1783702062:
                    return c16266.f50028;
                case -949286970:
                case 2084692783:
                    strM11919 = C3911.m11919(f50023, 167, 1, i8);
                    if (C0714.m2805()) {
                        iM6981 = C0630.m2566("ۡ᩶") ^ i4;
                        i = ((iM6981 ^ i5) * 7699) ^ 1846965382;
                        i2 = -1245319103;
                    } else {
                        iM6981 = C2105.m6981("֡۠") ^ i4;
                        i = ((iM6981 ^ i5) * (-18183)) ^ 945345997;
                        i2 = 1429901629;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -717005298:
                case 1321562878:
                    if (c16266.f50028 == null) {
                        iM6981 = C2105.m6981("ۜܽ") ^ i5;
                        i = ((iM6981 ^ i4) * 9109) ^ 257133070;
                        i2 = 758806919;
                    } else {
                        iM6981 = C0630.m2566("ۙᩳ") ^ i4;
                        i = ((iM6981 ^ i5) * 26081) ^ 1532741090;
                        i2 = 1272610168;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -666754805:
                case 1029690452:
                    if (C22628.f73083 <= 0) {
                        s = s2;
                        int iM6983 = (C2105.m6981("᩵ܶ") + i5) * (-61);
                        i7 = iM6983 ^ 2057851759;
                        s2 = s;
                        i6 = ((iM6983 ^ i4) * 28499) ^ (-1444149146);
                        c16266 = this;
                    }
                    iM6982 = (C2105.m6981("ۤۤ") + i5) * 75;
                    i6 = ((iM6982 ^ i4) * (-6587)) ^ 1764615237;
                    i3 = -1854188198;
                    i7 = iM6982 ^ i3;
                    c16266 = this;
                    break;
                case -254651472:
                case 1613301359:
                    c16266.f50028 = C6554.m18063(80, C0422.m1959(sb));
                    iM6981 = C0630.m2566("ۙᩳ") ^ i4;
                    i = ((iM6981 ^ i5) * 26081) ^ 1532741090;
                    i2 = 1272610168;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -23628151:
                case 2046787421:
                    s = s2;
                    int i17 = s + 14653;
                    if (C0630.m2564()) {
                        i14 = i17;
                        int iM6984 = (C2105.m6981("᩵ܶ") + i5) * (-61);
                        i7 = iM6984 ^ 2057851759;
                        s2 = s;
                        i6 = ((iM6984 ^ i4) * 28499) ^ (-1444149146);
                        c16266 = this;
                    } else {
                        int iM2567 = C0630.m2566("ۧۧ") ^ i5;
                        s2 = s;
                        i6 = ((iM2567 ^ i4) * 24863) ^ 495819874;
                        i7 = iM2567 ^ 1034418183;
                        c16266 = this;
                        i14 = i17;
                    }
                    break;
                case 215944702:
                case 1997639231:
                    i8 = 5833;
                    iM6981 = C2105.m6981("᩹ᩳ") ^ i5;
                    i = ((iM6981 ^ i4) * (-13945)) ^ 1120756513;
                    i2 = 218949232;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 431709586:
                case 2121138035:
                    i10 = i14 * i14;
                    i11 = s2 * s2;
                    i12 = 214710409;
                    if (C0050.f910 < 0) {
                        iM6981 = (C2105.m6981("ۧۖ") + i4) * 123;
                        i = ((iM6981 ^ i5) * (-8515)) ^ (-1188216470);
                        i2 = -1228869653;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    } else {
                        iM6982 = C0630.m2566("ۚۨ") ^ i5;
                        i6 = ((iM6982 ^ i4) * 2337) ^ (-1853428456);
                        i3 = -1764202349;
                        i7 = iM6982 ^ i3;
                        c16266 = this;
                    }
                    break;
                case 531761674:
                case 1305852038:
                    C2958.m9034();
                    C1005.m3501();
                    return null;
                case 951917213:
                case 1873507907:
                    C3245.m9923(sb, strM11919);
                    C1420.m4905(sb, C11340.m28015(strM6309, 0, i15));
                    if (AbstractC2021.f6743 > 0) {
                        iM6981 = C2105.m6981("᩻ᩳ") ^ i5;
                        i = ((iM6981 ^ i4) * 1825) ^ (-282846054);
                        i2 = -1290025092;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    } else {
                        iM6982 = (C2105.m6981("ۤۤ") + i5) * 75;
                        i6 = ((iM6982 ^ i4) * (-6587)) ^ 1764615237;
                        i3 = -1854188198;
                        i7 = iM6982 ^ i3;
                        c16266 = this;
                    }
                    break;
                case 998397102:
                case 1137671874:
                    C3537.m10746();
                    iM6982 = (C2105.m6981("ۤۤ") + i5) * 75;
                    i6 = ((iM6982 ^ i4) * (-6587)) ^ 1764615237;
                    i3 = -1854188198;
                    i7 = iM6982 ^ i3;
                    c16266 = this;
                    break;
                case 1376415367:
                case 2063666687:
                    sb = new StringBuilder();
                    strM38278 = m38278();
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C2105.m6981("֡۠") ^ i4;
                        i = ((iM6981 ^ i5) * (-18183)) ^ 945345997;
                        i2 = 1429901629;
                    } else {
                        iM6981 = C2105.m6981("۟ۙ") ^ i5;
                        i = ((iM6981 ^ i4) * 12027) ^ 783591453;
                        i2 = -560972102;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                default:
                    i8 = 64706;
                    iM6981 = C2105.m6981("᩹ᩳ") ^ i5;
                    i = ((iM6981 ^ i4) * (-13945)) ^ 1120756513;
                    i2 = 218949232;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
            }
        }
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ֫ */
    public final void mo17423(C3764 c3764) {
        c3764.m11383(m38278());
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0212 A[PHI: r2 r8 r10 r12 r16 r17
      0x0212: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:52:0x0210, B:40:0x015f, B:29:0x00d5, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:52:0x0210, B:40:0x015f, B:29:0x00d5, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:52:0x0210, B:40:0x015f, B:29:0x00d5, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r12v8 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:52:0x0210, B:40:0x015f, B:29:0x00d5, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r16v22 int) = (r16v9 int), (r16v14 int), (r16v19 int), (r16v23 int) binds: [B:52:0x0210, B:40:0x015f, B:29:0x00d5, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r17v27 android.os.Bundle) = (r17v12 android.os.Bundle), (r17v17 android.os.Bundle), (r17v26 android.os.Bundle), (r17v28 android.os.Bundle) binds: [B:52:0x0210, B:40:0x015f, B:29:0x00d5, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0299 A[PHI: r3 r4 r5 r6 r11 r16 r17
      0x0299: PHI (r3v3 android.os.Bundle) = (r3v2 android.os.Bundle), (r3v2 android.os.Bundle), (r3v4 android.os.Bundle) binds: [B:64:0x0297, B:60:0x0275, B:33:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r4v4 short[]) = (r4v3 short[]), (r4v2 short[]), (r4v2 short[]) binds: [B:64:0x0297, B:60:0x0275, B:33:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:64:0x0297, B:60:0x0275, B:33:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:64:0x0297, B:60:0x0275, B:33:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v4 short[]) binds: [B:64:0x0297, B:60:0x0275, B:33:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r16v16 int) = (r16v5 int), (r16v6 int), (r16v17 int) binds: [B:64:0x0297, B:60:0x0275, B:33:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r17v19 android.os.Bundle) = (r17v8 android.os.Bundle), (r17v9 android.os.Bundle), (r17v21 android.os.Bundle) binds: [B:64:0x0297, B:60:0x0275, B:33:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x02cf A[PHI: r7 r16 r17
      0x02cf: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:68:0x02cd, B:56:0x024c] A[DONT_GENERATE, DONT_INLINE]
      0x02cf: PHI (r16v7 int) = (r16v4 int), (r16v8 int) binds: [B:68:0x02cd, B:56:0x024c] A[DONT_GENERATE, DONT_INLINE]
      0x02cf: PHI (r17v10 android.os.Bundle) = (r17v7 android.os.Bundle), (r17v11 android.os.Bundle) binds: [B:68:0x02cd, B:56:0x024c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0084, code lost:
    
        if (l.C0050.f910 < 0) goto L15;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m38279(String str, String str2) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int i5 = C1128.f4106;
        int i6 = C0630.f2410;
        int iM2567 = C0630.m2566("ܶ᩷") ^ i5;
        int i7 = ((iM2567 ^ i6) * 18291) ^ (-1873650473);
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM2567 ^ 2058478027;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = -374291365;
        Bundle bundleM9254 = null;
        short[] sArr3 = null;
        int i13 = 0;
        String strM3789 = null;
        Bundle bundle = null;
        while (true) {
            int i14 = i8 ^ (i7 & (((i12 ^ i6) * 19559) >> 31));
            switch (i14) {
                case -2104247730:
                case -1425853169:
                    i13 = 47787;
                    iM6981 = C0630.m2566("ۙܶ") ^ i5;
                    i = ((iM6981 ^ i6) * 23691) ^ (-1010989000);
                    i2 = 1807881650;
                    i12 = i14;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    bundle = bundle;
                    break;
                case -1893074677:
                case 2120984233:
                    bundle = bundle;
                    i14 = i14;
                    sArr3 = f50023;
                    if (C3663.f11553) {
                        iM6981 = C2105.m6981("ۗ۬") ^ i5;
                        i = ((iM6981 ^ i6) * (-26973)) ^ 1688431236;
                        i2 = 1630498483;
                    } else {
                        iM6981 = (C2105.m6981("᩵ᩳ") + i5) * 61;
                        i = ((iM6981 ^ i6) * (-10337)) ^ (-834008901);
                        i2 = -251590273;
                    }
                    i12 = i14;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    bundle = bundle;
                    break;
                case -1768140816:
                case -597244818:
                    i14 = i14;
                    bundle.putString(strM3789, str);
                    bundleM9254 = C3019.m9254(this);
                    sArr2 = f50023;
                    if (C1504.f5354) {
                        bundle = bundle;
                        iM6981 = (C0630.m2566("᩵ᩴ") + i6) * (-43);
                        i = ((iM6981 ^ i5) * 6907) ^ (-436412755);
                        i2 = 1610298460;
                        i12 = i14;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        bundle = bundle;
                    } else {
                        int iM2568 = C0630.m2566("ۨۤ") ^ i6;
                        i7 = ((iM2568 ^ i5) * (-24811)) ^ 569303446;
                        i12 = i14;
                        i8 = iM2568 ^ 2048933829;
                    }
                    break;
                case -1674597128:
                case -1591210522:
                    bundleM9254.putString(C0483.m2128(sArr2, i11, 6, i13), str2);
                    break;
                case -1673351467:
                case -18892605:
                    if (!C0483.m2121()) {
                        iM2566 = (i5 - C0630.m2566("ܽܰ")) * 99;
                        i14 = i14;
                        i3 = ((iM2566 ^ i6) * 21893) ^ (-1725199172);
                        i4 = 1210106715;
                        int i15 = i14;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                        i12 = i15;
                    } else {
                        i14 = i14;
                        iM6981 = (C2105.m6981("֡ܽ") + i6) * (-57);
                        bundle = bundle;
                        i = ((iM6981 ^ i5) * (-13767)) ^ 724381206;
                        i2 = -456021268;
                        i12 = i14;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        bundle = bundle;
                    }
                    break;
                case -1533901973:
                case 277400579:
                    i13 = 60585;
                    iM6981 = C0630.m2566("ۙܶ") ^ i5;
                    i = ((iM6981 ^ i6) * 23691) ^ (-1010989000);
                    i2 = 1807881650;
                    i12 = i14;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    bundle = bundle;
                    break;
                case -1530784182:
                case 921256613:
                    C3746.m11369();
                    C2167.m7155();
                    break;
                case -1401618458:
                case 764169468:
                    bundle = bundle;
                    i14 = i14;
                    sArr = f50023;
                    if (C2272.f7362) {
                        iM6981 = (C0630.m2566("᩵ᩴ") + i6) * (-43);
                        i = ((iM6981 ^ i5) * 6907) ^ (-436412755);
                        i2 = 1610298460;
                    } else {
                        iM6981 = (C0630.m2566("ܳܽ") ^ i5) * (-31);
                        i = ((iM6981 ^ i6) * (-7051)) ^ (-2070578487);
                        i2 = -1294606058;
                    }
                    i12 = i14;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    bundle = bundle;
                    break;
                case -1261590011:
                case 43366180:
                    i14 = i14;
                    C1711.m5736();
                    break;
                case -1218580645:
                case 1772860302:
                    i14 = i14;
                    C2167.m7155();
                    RunnableC1108.m3790();
                    iM2566 = (C2105.m6981("ۡᩴ") + i6) * (-79);
                    i3 = ((iM2566 ^ i5) * 15517) ^ 1528641298;
                    i4 = 905278348;
                    int i16 = i14;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    i12 = i16;
                    break;
                case -1125203992:
                case 1916083202:
                    bundle = bundle;
                    i14 = i14;
                    if (C3911.f12484 >= 0) {
                        bundle = bundle;
                        iM6981 = (C2105.m6981("֡ܽ") + i6) * (-57);
                        bundle = bundle;
                        i = ((iM6981 ^ i5) * (-13767)) ^ 724381206;
                        i2 = -456021268;
                    } else {
                        iM6981 = (C2105.m6981("ܰᩳ") ^ i6) * (-31);
                        i = ((iM6981 ^ i5) * 21213) ^ 1038056003;
                        i2 = -1462130045;
                    }
                    i12 = i14;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    bundle = bundle;
                    break;
                case -908990693:
                case 186759155:
                    bundle = bundle;
                    i14 = i14;
                    s2 = 5055;
                    if (C2520.m8026()) {
                        iM6981 = C2105.m6981("ۗ۬") ^ i5;
                        i = ((iM6981 ^ i6) * (-26973)) ^ 1688431236;
                        i2 = 1630498483;
                    } else {
                        iM6981 = (C2105.m6981("ۡ᩵") ^ i5) * 101;
                        i = ((iM6981 ^ i6) * 20695) ^ (-764548761);
                        i2 = 311467699;
                    }
                    i12 = i14;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    bundle = bundle;
                    break;
                case -719684685:
                case 1554749550:
                    bundle = bundle;
                    i14 = i14;
                    int i17 = 25553025 + i9;
                    i10 = i17 + i17;
                    if (C0483.f2088 >= 0) {
                        bundle = bundle;
                        iM6981 = (C2105.m6981("֡ܽ") + i6) * (-57);
                        bundle = bundle;
                        i = ((iM6981 ^ i5) * (-13767)) ^ 724381206;
                        i2 = -456021268;
                    } else {
                        iM6981 = C2105.m6981("ܶܺ") ^ i6;
                        i = ((iM6981 ^ i5) * (-7651)) ^ (-188177782);
                        i2 = 1368505969;
                    }
                    i12 = i14;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    bundle = bundle;
                    break;
                case -149424461:
                case 546311295:
                    i14 = i14;
                    if (C3019.f9544 >= 0) {
                        bundle = bundle;
                        i11 = 143;
                        iM6981 = C2105.m6981("ۗ۬") ^ i5;
                        i = ((iM6981 ^ i6) * (-26973)) ^ 1688431236;
                        i2 = 1630498483;
                        i12 = i14;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        bundle = bundle;
                    } else {
                        int iM6982 = C2105.m6981("᩻᩻") ^ i5;
                        i12 = i14;
                        i8 = iM6982 ^ (-1800870832);
                        i7 = ((iM6982 ^ i6) * 17995) ^ 1933502372;
                        i11 = 143;
                    }
                    break;
                case -113336527:
                case 2077062258:
                    i14 = i14;
                    strM3789 = RunnableC1108.m3789(sArr3, 134, 9, i13);
                    if (C1047.f3863 >= 0) {
                        bundle = bundle;
                        iM6981 = C2105.m6981("ۗ۬") ^ i5;
                        i = ((iM6981 ^ i6) * (-26973)) ^ 1688431236;
                        i2 = 1630498483;
                    } else {
                        iM6981 = C0630.m2566("ۧܿ") ^ i5;
                        bundle = bundle;
                        i = ((iM6981 ^ i6) * (-5223)) ^ (-1841913768);
                        i2 = -1642556160;
                    }
                    i12 = i14;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    bundle = bundle;
                    break;
                case 207974654:
                case 1325344351:
                    bundle = bundle;
                    i14 = i14;
                    int i18 = s + s2;
                    if (i10 - (i18 * i18) >= 0) {
                        iM6981 = C0630.m2566("֫ۢ") ^ i6;
                        i = ((iM6981 ^ i5) * (-19805)) ^ 1262273706;
                        i2 = -239899426;
                    } else {
                        iM6981 = C2105.m6981("֫ܰ") ^ i6;
                        i = ((iM6981 ^ i5) * 19713) ^ (-1501511165);
                        i2 = -31270200;
                    }
                    i12 = i14;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    bundle = bundle;
                    break;
                case 715384930:
                case 1538682594:
                    i14 = i14;
                    if (!C2126.f7087) {
                        bundle = bundle;
                        iM6981 = C2105.m6981("ۗ۬") ^ i5;
                        i = ((iM6981 ^ i6) * (-26973)) ^ 1688431236;
                        i2 = 1630498483;
                        i12 = i14;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        bundle = bundle;
                    } else {
                        iM2566 = (C2105.m6981("ۡᩴ") + i6) * (-79);
                        i3 = ((iM2566 ^ i5) * 15517) ^ 1528641298;
                        i4 = 905278348;
                        int i19 = i14;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                        i12 = i19;
                    }
                    break;
                case 1161645172:
                case 1404206281:
                    bundle = bundle;
                    i14 = i14;
                    s = sArr[133];
                    i9 = s * s;
                    if (C1047.m3599() >= 0) {
                        iM6981 = (C0630.m2566("᩵ᩴ") + i6) * (-43);
                        i = ((iM6981 ^ i5) * 6907) ^ (-436412755);
                        i2 = 1610298460;
                    } else {
                        iM6981 = C0630.m2566("֡۟") ^ i5;
                        i = ((iM6981 ^ i6) * (-4733)) ^ (-1536920915);
                        i2 = -576796379;
                    }
                    i12 = i14;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    bundle = bundle;
                    break;
                default:
                    i14 = i14;
                    m34234((String) null);
                    Bundle bundleM10747 = C3537.m10747(this);
                    if (C7106.f21815 != 0) {
                        bundle = bundleM10747;
                        iM6981 = (C2105.m6981("֡ܽ") + i6) * (-57);
                        bundle = bundle;
                        i = ((iM6981 ^ i5) * (-13767)) ^ 724381206;
                        i2 = -456021268;
                        i12 = i14;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        bundle = bundle;
                    } else {
                        int iM6983 = C2105.m6981("᩶ۨ") ^ i6;
                        i7 = ((iM6983 ^ i5) * (-9957)) ^ (-605819018);
                        i12 = i14;
                        i8 = iM6983 ^ 618164957;
                        bundle = bundleM10747;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0135 A[PHI: r0 r3
      0x0135: PHI (r0v6 java.lang.String) = (r0v2 java.lang.String), (r0v5 java.lang.String), (r0v2 java.lang.String) binds: [B:38:0x0133, B:26:0x00b6, B:16:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r3v5 int) = (r3v4 int), (r3v2 int), (r3v2 int) binds: [B:38:0x0133, B:26:0x00b6, B:16:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01e4 A[PHI: r2 r5 r6 r7
      0x01e4: PHI (r2v5 short) = (r2v2 short), (r2v4 short), (r2v2 short) binds: [B:54:0x01e2, B:42:0x016b, B:30:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r5v3 short[]) = (r5v2 short[]), (r5v2 short[]), (r5v4 short[]) binds: [B:54:0x01e2, B:42:0x016b, B:30:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:54:0x01e2, B:42:0x016b, B:30:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:54:0x01e2, B:42:0x016b, B:30:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0259  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (l.C0964.m3413() != false) goto L19;
     */
    @Override // l.ComponentCallbacksC9205
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        int iM6981;
        int i;
        int i2;
        String strM3396 = null;
        short[] sArr = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1848154808;
        int i8 = C0050.f910;
        int i9 = C1420.f5096;
        int iM2566 = C0630.m2566("ۧۘ") ^ i9;
        int i10 = ((iM2566 ^ i8) * 375) ^ (-1791151170);
        int i11 = 1759622549;
        while (true) {
            int i12 = iM2566 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i8) * 14637) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -1340540116:
                    case -636983397:
                        if (C0798.f2919) {
                            iM6981 = (i8 - C2105.m6981("ܽۖ")) * 65;
                            i = ((iM6981 ^ i9) * (-7463)) ^ (-1268111935);
                            i2 = 765237521;
                        } else {
                            iM6981 = (C2105.m6981("ܽۨ") + i8) * 5;
                            i = ((iM6981 ^ i9) * 29793) ^ (-1446088881);
                            i2 = 644415360;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -1324118622:
                    case -220476467:
                        strM3396 = C0964.m3396(sArr2, i5, i6, i4);
                        if (C3245.m9925() != 0) {
                            iM6981 = (C2105.m6981("ۜۢ") + i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i = ((iM6981 ^ i9) * (-29125)) ^ 198226274;
                            i2 = -356266565;
                        } else {
                            iM6981 = C0630.m2566("֡᩻") ^ i9;
                            i = ((iM6981 ^ i8) * 10299) ^ 260604537;
                            i2 = 942505849;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -1113533226:
                    case 1538066839:
                        C3911.m11924();
                        ViewOnClickListenerC1958.m6429();
                        iM6981 = (C0630.m2566("ۡۘ") + i8) * 41;
                        i = ((iM6981 ^ i9) * 17121) ^ 377481882;
                        i2 = 1699099462;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -917051026:
                    case 356885787:
                        if (C2105.f7037 != 0) {
                            iM6981 = (C0630.m2566("ۡۘ") + i8) * 41;
                            i = ((iM6981 ^ i9) * 17121) ^ 377481882;
                            i2 = 1699099462;
                        } else {
                            iM6981 = (i8 - C2105.m6981("᩷᩷")) * (-77);
                            i = ((iM6981 ^ i9) * 17623) ^ 1483723946;
                            i2 = -360261945;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -840834834:
                    case 1756663189:
                        sArr2 = f50023;
                        i5 = 47;
                        i6 = 3;
                        if (C1504.f5354) {
                            iM6981 = (i8 - C2105.m6981("ܽۖ")) * 65;
                            i = ((iM6981 ^ i9) * (-7463)) ^ (-1268111935);
                            i2 = 765237521;
                        } else {
                            iM6981 = C2105.m6981("ۘۘ") ^ i8;
                            i = ((iM6981 ^ i9) * (-19077)) ^ 795558730;
                            i2 = 1303792617;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -713978796:
                    case 137175939:
                        C22628.m50615();
                        if (C1916.m6308() >= 0) {
                        }
                        iM6981 = (C2105.m6981("ۤۗ") ^ i9) * 73;
                        i = ((iM6981 ^ i8) * (-11007)) ^ (-477340459);
                        i2 = -381905911;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -710300692:
                    case 724284112:
                        if (RunnableC3474.f10992 <= 0) {
                            iM6981 = (C0630.m2566("ۡۘ") + i8) * 41;
                            i = ((iM6981 ^ i9) * 17121) ^ 377481882;
                            i2 = 1699099462;
                        } else {
                            iM6981 = (C2105.m6981("ۛܳ") + i9) * 77;
                            i = ((iM6981 ^ i8) * 32013) ^ (-1366394296);
                            i2 = 1567935055;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -372097258:
                    case -74751921:
                        sArr = f50023;
                        if (C2105.m6982() != 0) {
                            iM6981 = (C2105.m6981("ۤۗ") ^ i9) * 73;
                            i = ((iM6981 ^ i8) * (-11007)) ^ (-477340459);
                            i2 = -381905911;
                        } else {
                            iM6981 = (C0630.m2566("᩺ᩳ") + i9) * (-55);
                            i = ((iM6981 ^ i8) * 32431) ^ (-484321532);
                            i2 = 76385154;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 81339406:
                    case 686569991:
                        if (RunnableC1937.m6387() != 0) {
                            iM6981 = (C2105.m6981("ۜۢ") + i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i = ((iM6981 ^ i9) * (-29125)) ^ 198226274;
                            i2 = -356266565;
                            i12 = iM6981 ^ i2;
                            i10 = i;
                        }
                        iM6981 = (C2105.m6981("ۤۗ") ^ i9) * 73;
                        i = ((iM6981 ^ i8) * (-11007)) ^ (-477340459);
                        i2 = -381905911;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 145325808:
                    case 1798974497:
                        i4 = 44968;
                        iM6981 = (C2105.m6981("ۚ᩶") + i9) * q.h;
                        i = ((iM6981 ^ i8) * 16147) ^ (-2077877286);
                        i2 = 1916097829;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 211936489:
                    case 2078764055:
                        menuInflater.inflate(C2105.m6981(strM3396) ^ 2101766109, menu);
                        break;
                    case 231420655:
                    case 408597845:
                        int i13 = s + 15165;
                        i3 = i13 * i13;
                        if (C4117.f13076 <= 0) {
                            iM6981 = (C2105.m6981("ۜۢ") + i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i = ((iM6981 ^ i9) * (-29125)) ^ 198226274;
                            i2 = -356266565;
                        } else {
                            iM6981 = (C0630.m2566("᩻֨") + i9) * (-125);
                            i = ((iM6981 ^ i8) * (-20993)) ^ 420053139;
                            i2 = 183245122;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 332579828:
                    case 726569224:
                        C3245.m9925();
                        C4075.m12263();
                        break;
                    case 401843345:
                    case 1782138487:
                        s = sArr[46];
                        if (C5695.f17556 >= 0) {
                            iM6981 = (i8 - C2105.m6981("ܽۖ")) * 65;
                            i = ((iM6981 ^ i9) * (-7463)) ^ (-1268111935);
                            i2 = 765237521;
                        } else {
                            iM6981 = C0630.m2566("ۨ۠") ^ i8;
                            i = ((iM6981 ^ i9) * 27637) ^ (-1328294935);
                            i2 = -453020442;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 403863460:
                    case 2044757800:
                        if (C3537.m10746() <= 0) {
                            iM6981 = (C0630.m2566("ۡۘ") + i8) * 41;
                            i = ((iM6981 ^ i9) * 17121) ^ 377481882;
                            i2 = 1699099462;
                        } else {
                            iM6981 = (C2105.m6981("ۨۗ") + i9) * (-101);
                            i = ((iM6981 ^ i8) * (-5275)) ^ (-1413838347);
                            i2 = -256323715;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 445787886:
                    case 683983120:
                        i4 = 13816;
                        iM6981 = (C2105.m6981("ۚ᩶") + i9) * q.h;
                        i = ((iM6981 ^ i8) * 16147) ^ (-2077877286);
                        i2 = 1916097829;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 799235952:
                    case 959638419:
                        if (C0714.m2805()) {
                            iM6981 = (C2105.m6981("᩺ۘ") + i8) * 7;
                            i = ((iM6981 ^ i9) * 25439) ^ (-1464727591);
                            i2 = -259515909;
                        } else {
                            iM6981 = (C0630.m2566("ۡۘ") + i8) * 41;
                            i = ((iM6981 ^ i9) * 17121) ^ 377481882;
                            i2 = 1699099462;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 1050649039:
                    case 1630875428:
                        C1005.m3501();
                        break;
                    default:
                        if ((60660 * s) - i3 <= 0) {
                            iM6981 = (C2105.m6981("᩹֡") + i8) * (-71);
                            i = ((iM6981 ^ i9) * (-8391)) ^ (-1698221303);
                            i2 = -136472363;
                        } else {
                            iM6981 = C0630.m2566("ܽ᩶") ^ i9;
                            i = ((iM6981 ^ i8) * 14261) ^ 1545201903;
                            i2 = 1264803773;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                }
                return;
            }
            iM2566 = C2105.m6981("۠᩸") ^ i9;
            i10 = ((iM2566 ^ i8) * 625) ^ 1918294110;
            i11 = 1192431618;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x014d A[PHI: r4 r6 r7
      0x014d: PHI (r4v4 l.ۘۛ᩷) = (r4v2 l.ۘۛ᩷), (r4v3 l.ۘۛ᩷), (r4v2 l.ۘۛ᩷), (r4v2 l.ۘۛ᩷) binds: [B:25:0x00d2, B:28:0x00e3, B:16:0x0090, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v6 int) binds: [B:25:0x00d2, B:28:0x00e3, B:16:0x0090, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v5 int) binds: [B:25:0x00d2, B:28:0x00e3, B:16:0x0090, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0256 A[PHI: r5 r9 r10
      0x0256: PHI (r5v5 int) = (r5v2 int), (r5v4 int), (r5v2 int) binds: [B:61:0x0254, B:46:0x01b3, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:61:0x0254, B:46:0x01b3, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:61:0x0254, B:46:0x01b3, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0286 A[PHI: r3 r11 r12 r14 r15 r20
      0x0286: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v7 int) binds: [B:65:0x0284, B:57:0x0232, B:42:0x0187, B:36:0x0133, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:65:0x0284, B:57:0x0232, B:42:0x0187, B:36:0x0133, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r12v4 short) = (r12v2 short), (r12v3 short), (r12v2 short), (r12v2 short), (r12v2 short) binds: [B:65:0x0284, B:57:0x0232, B:42:0x0187, B:36:0x0133, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:65:0x0284, B:57:0x0232, B:42:0x0187, B:36:0x0133, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:65:0x0284, B:57:0x0232, B:42:0x0187, B:36:0x0133, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:65:0x0284, B:57:0x0232, B:42:0x0187, B:36:0x0133, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        int iM6981;
        int i;
        int i2;
        int i3 = C3432.f10845;
        int i4 = C3746.f11829;
        int iM6982 = (C2105.m6981("ᩴ֡") ^ i3) * (-57);
        int i5 = ((iM6982 ^ i4) * (-6581)) ^ (-311520618);
        C3764 c3764 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6982 ^ 746057094;
        int iM6983 = 0;
        int iM6984 = 0;
        int iM6985 = 0;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = -2143054695;
        short[] sArr3 = null;
        int i11 = 0;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i4) * 6541) >> 31));
            switch (i10) {
                case -2126779312:
                case -1019711785:
                    int i12 = 219040000 + i8;
                    i9 = i12 + i12;
                    s2 = 14800;
                    if (C3683.f11629 >= 0) {
                        iM6981 = (C0630.m2566("ܳ֡") + i3) * (-119);
                        i = ((iM6981 ^ i4) * (-21305)) ^ (-558749424);
                        i2 = 1752751937;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۘܰ")) * (-61);
                        i = ((iM6981 ^ i4) * 3165) ^ (-950993066);
                        i2 = -840958132;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2118320667:
                case -844088271:
                    sArr = f50023;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C0630.m2566("ܳ֡") + i3) * (-119);
                        i = ((iM6981 ^ i4) * (-21305)) ^ (-558749424);
                        i2 = 1752751937;
                    } else {
                        iM6981 = C2105.m6981("ܿۚ") ^ i4;
                        i = ((iM6981 ^ i3) * (-29137)) ^ (-381827);
                        i2 = 163970269;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2102694075:
                case 1167882638:
                    i11 = 39263;
                    iM6981 = (i4 - C2105.m6981("۫۟")) * (-109);
                    i = ((iM6981 ^ i3) * (-19111)) ^ (-1514448826);
                    i2 = 266407472;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2026024316:
                case 130298472:
                    C1773.m5908();
                    iM6981 = C2105.m6981("ۧܿ") ^ i3;
                    i = ((iM6981 ^ i4) * (-9829)) ^ (-338950860);
                    i2 = -747233227;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1454139554:
                case -243148728:
                    iM6983 = 2102248374 ^ C2105.m6981(C0483.m2128(sArr2, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 3, i11));
                    if (C3663.f11553) {
                        iM6981 = (C0630.m2566("ܳ֡") + i3) * (-119);
                        i = ((iM6981 ^ i4) * (-21305)) ^ (-558749424);
                        i2 = 1752751937;
                    } else {
                        iM6981 = C0630.m2566("᩵ᩳ") ^ i3;
                        i = ((iM6981 ^ i4) * 28631) ^ 702250935;
                        i2 = -1611945694;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1439273381:
                case 285083054:
                    C2272.m7508(c3764.m11419(), getViewLifecycleOwner(), new InterfaceC1008() { // from class: l.ܽ᩻ۢ
                        @Override // l.InterfaceC1008
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo1617(Object obj) {
                            C16266.m38264(this.f52081, (C12366) obj);
                        }
                    });
                    break;
                case -1154441644:
                case 1864127299:
                    s = sArr[113];
                    i8 = s * s;
                    if (C0964.f3626 != 0) {
                        iM6981 = C0630.m2566("ۡۛ") ^ i4;
                        i = ((iM6981 ^ i3) * 16011) ^ 509130593;
                        i2 = -1143696095;
                    } else {
                        iM6981 = C2105.m6981("ᩳۗ") ^ i3;
                        i = ((iM6981 ^ i4) * 10559) ^ 1716324528;
                        i2 = 875335100;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1150837785:
                case 892878562:
                    C0050.m940();
                    if (C1420.f5096 > 0) {
                        iM6981 = C2105.m6981("ۧܿ") ^ i3;
                        i = ((iM6981 ^ i4) * (-9829)) ^ (-338950860);
                        i2 = -747233227;
                    } else {
                        iM6981 = C0630.m2566("ۡۛ") ^ i4;
                        i = ((iM6981 ^ i3) * 16011) ^ 509130593;
                        i2 = -1143696095;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -794128122:
                case 976960883:
                    super.onViewCreated(view, bundle);
                    iM6984 = C2105.m6981(C7811.m20837(f50023, 114, 3, i11));
                    if (C1504.f5354) {
                        iM6981 = C0630.m2566("ۡۛ") ^ i4;
                        i = ((iM6981 ^ i3) * 16011) ^ 509130593;
                        i2 = -1143696095;
                    } else {
                        iM6981 = (C2105.m6981("ۡۗ") ^ i4) * 127;
                        i = ((iM6981 ^ i3) * 10667) ^ (-295617358);
                        i2 = 790901793;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -586350114:
                case 440425730:
                    if (C1504.f5354) {
                        iM6981 = (i3 - C2105.m6981("ۙ֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6981 ^ i4) * (-29867)) ^ (-1113483221);
                        i2 = 1173992719;
                    } else {
                        iM6981 = C2105.m6981("ۧܿ") ^ i3;
                        i = ((iM6981 ^ i4) * (-9829)) ^ (-338950860);
                        i2 = -747233227;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -570310:
                case 216609722:
                    this.f50029 = C11340.m28028(view, iM6985 ^ i7);
                    sArr2 = f50023;
                    if (C3911.f12484 >= 0) {
                        iM6981 = (C0630.m2566("ܳ֡") + i3) * (-119);
                        i = ((iM6981 ^ i4) * (-21305)) ^ (-558749424);
                        i2 = 1752751937;
                    } else {
                        iM6981 = C2105.m6981("֨᩹") ^ i4;
                        i = ((iM6981 ^ i3) * (-12373)) ^ 1259543458;
                        i2 = -813033878;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 16365135:
                case 717986477:
                    C0964.m3413();
                    if (C1128.m3851() <= 0) {
                        iM6981 = C2105.m6981("ۧܿ") ^ i3;
                        i = ((iM6981 ^ i4) * (-9829)) ^ (-338950860);
                        i2 = -747233227;
                    } else {
                        iM6981 = C2105.m6981("ۗܺ") ^ i4;
                        i = ((iM6981 ^ i3) * 5557) ^ 554373770;
                        i2 = -505102046;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 264805417:
                case 718590124:
                    this.f50031 = C1005.m3507(view, 2127525372 ^ iM6984);
                    sArr3 = f50023;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C0630.m2566("ܳ֡") + i3) * (-119);
                        i = ((iM6981 ^ i4) * (-21305)) ^ (-558749424);
                        i2 = 1752751937;
                    } else {
                        iM6981 = C2105.m6981("ܶۗ") ^ i3;
                        i = ((iM6981 ^ i4) * 8921) ^ 176567505;
                        i2 = 599352744;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 394622012:
                case 2044494411:
                    int i13 = s + s2;
                    if (i9 - (i13 * i13) >= 0) {
                        iM6981 = C2105.m6981("ᩴۜ") ^ i4;
                        i = ((iM6981 ^ i3) * 21805) ^ (-593640077);
                        i2 = 596231755;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۗᩳ")) * 119;
                        i = ((iM6981 ^ i4) * 15399) ^ 1488977244;
                        i2 = 1771829882;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 721206420:
                case 1608556182:
                    C6499 c6499 = (C6499) C1005.m3507(view, iM6983);
                    this.f50035 = c6499;
                    if (C0630.m2564()) {
                        iM6981 = C2105.m6981("ۗܺ") ^ i4;
                        i = ((iM6981 ^ i3) * 5557) ^ 554373770;
                        i2 = -505102046;
                    } else {
                        c6499.m17979(new C11329(this));
                        this.f50024 = true;
                        c3764 = this.f50030;
                        if (C7811.f24123 >= 0) {
                            iM6981 = C2105.m6981("ۗܺ") ^ i4;
                            i = ((iM6981 ^ i3) * 5557) ^ 554373770;
                            i2 = -505102046;
                        } else {
                            iM6981 = C2105.m6981("ᩳ۠") ^ i4;
                            i = ((iM6981 ^ i3) * 1195) ^ 160499957;
                            i2 = 1982101382;
                        }
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 925431220:
                case 1163113542:
                    i11 = 20199;
                    iM6981 = (i4 - C2105.m6981("۫۟")) * (-109);
                    i = ((iM6981 ^ i3) * (-19111)) ^ (-1514448826);
                    i2 = 266407472;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1717741093:
                case 1857706054:
                    RunnableC1937.m6387();
                    C2958.m9034();
                    break;
                default:
                    iM6985 = C2105.m6981(C2126.m7036(sArr3, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i11));
                    i7 = 2122513437;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6981 = C2105.m6981("ۗܺ") ^ i4;
                        i = ((iM6981 ^ i3) * 5557) ^ 554373770;
                        i2 = -505102046;
                    } else {
                        iM6981 = C0630.m2566("ۧܺ") ^ i3;
                        i = ((iM6981 ^ i4) * 253) ^ (-1585713530);
                        i2 = -1174555231;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0270 A[PHI: r7 r9 r10 r18
      0x0270: PHI (r7v8 int) = (r7v2 int), (r7v5 int), (r7v2 int) binds: [B:65:0x026e, B:11:0x006d, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r9v6 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:65:0x026e, B:11:0x006d, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r10v6 short) = (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:65:0x026e, B:11:0x006d, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r18v30 l.ۗۜ) = (r18v11 l.ۗۜ), (r18v24 l.ۗۜ), (r18v32 l.ۗۜ) binds: [B:65:0x026e, B:11:0x006d, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0063, code lost:
    
        if (l.C3537.f11231 < 0) goto L10;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m38267(C16266 c16266, final int i, float f, float f2) {
        int iM2566;
        int i2;
        int i3;
        int iM6981;
        int i4;
        int i5;
        final C16266 c16267 = c16266;
        int i6 = C4117.f13076;
        int i7 = C0714.f2697;
        int iM2567 = (C0630.m2566("۫᩵") + i7) * 99;
        int i8 = ((iM2567 ^ i6) * (-26177)) ^ 720303559;
        C3060 c3060M48304 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM2567 ^ 661170473;
        C21282 c21282 = null;
        boolean z = false;
        int i10 = 0;
        int iM2568 = 0;
        short s = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1047494412;
        while (true) {
            i14 = i9 ^ (i8 & (((i14 ^ i6) * (-19393)) >> 31));
            switch (i14) {
                case -1779591367:
                case 840831294:
                    c3060M48304 = c3060M48304;
                    int i15 = s + s2;
                    i11 = i15 * i15;
                    i12 = s * 2;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        int iM2569 = (C0630.m2566("ᩴ۠") ^ i7) * (-13);
                        i8 = ((iM2569 ^ i6) * 3769) ^ 1768761189;
                        i5 = iM2569 ^ (-1002435756);
                        c21282 = null;
                    } else {
                        iM6981 = C2105.m6981("ܶۗ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-25561)) ^ 696650596;
                        i4 = -1517139941;
                        i5 = iM6981 ^ i4;
                    }
                    c3060M48304 = c3060M48304;
                    i9 = i5;
                    c16267 = c16266;
                    break;
                case -1546357655:
                case -1098823828:
                    c3060M48304 = c3060M48304;
                    s = sArr[4];
                    s2 = 1;
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C0630.m2566("۬ۡ") + i6) * (-71);
                        i8 = ((iM6981 ^ i7) * 31485) ^ 266449826;
                        i4 = 1046683279;
                    } else {
                        iM6981 = C0630.m2566("ܿ᩷") ^ i6;
                        i8 = ((iM6981 ^ i7) * 17085) ^ 551193757;
                        i4 = -1020987770;
                    }
                    i5 = iM6981 ^ i4;
                    c3060M48304 = c3060M48304;
                    i9 = i5;
                    c16267 = c16266;
                    break;
                case -1487102835:
                case 675797648:
                    c16267.f50031.setY(f2);
                    if (RunnableC0588.f2309 >= 0) {
                        c3060M48304 = c3060M48304;
                        int iM25610 = (C0630.m2566("ᩴ۠") ^ i7) * (-13);
                        i8 = ((iM25610 ^ i6) * 3769) ^ 1768761189;
                        i5 = iM25610 ^ (-1002435756);
                        c21282 = null;
                        c3060M48304 = c3060M48304;
                        i9 = i5;
                        c16267 = c16266;
                    } else {
                        c3060M48304 = c3060M48304;
                        c21282 = new C21282(c16266.requireContext(), c16267.f50031, z ? 1 : 0);
                        if (C0382.f1805) {
                            int iM25611 = (i6 - C0630.m2566("ܳۨ")) * (-23);
                            i9 = iM25611 ^ 912554224;
                            i8 = ((iM25611 ^ i7) * 2123) ^ 1569885312;
                            c3060M48304 = c3060M48304;
                        } else {
                            iM6981 = C2105.m6981("ܽ᩵") ^ i7;
                            i8 = ((iM6981 ^ i6) * (-27161)) ^ 171867949;
                            i4 = 1828187463;
                            i5 = iM6981 ^ i4;
                            c3060M48304 = c3060M48304;
                            i9 = i5;
                            c16267 = c16266;
                        }
                    }
                    break;
                case -1029747978:
                case -293926980:
                    c3060M48304 = c3060M48304;
                    z = false;
                    z = false;
                    if (i != -1) {
                        iM6981 = C0630.m2566("۟ᩴ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-9923)) ^ 1573571176;
                        i4 = 1604729824;
                    } else {
                        iM6981 = C0630.m2566("᩺۠") ^ i6;
                        i8 = ((iM6981 ^ i7) * 19203) ^ 412990691;
                        i4 = 42033031;
                    }
                    i5 = iM6981 ^ i4;
                    c3060M48304 = c3060M48304;
                    i9 = i5;
                    c16267 = c16266;
                    break;
                case -994637119:
                case -491254398:
                    break;
                case -742674765:
                case 1873592716:
                    if (C1420.f5096 <= 0) {
                        c3060M48304 = c3060M48304;
                        int iM25612 = (C0630.m2566("ᩴ۠") ^ i7) * (-13);
                        i8 = ((iM25612 ^ i6) * 3769) ^ 1768761189;
                        i5 = iM25612 ^ (-1002435756);
                        c21282 = null;
                        c3060M48304 = c3060M48304;
                        i9 = i5;
                        c16267 = c16266;
                    } else {
                        iM2566 = (i7 - C0630.m2566("ۚܳ")) * 27;
                        i2 = ((iM2566 ^ i6) * (-6403)) ^ 890830945;
                        i3 = -423672293;
                        i9 = iM2566 ^ i3;
                        i8 = i2;
                    }
                    break;
                case -711183847:
                case 1841465450:
                    c3060M48304 = c3060M48304;
                    sArr = f50023;
                    if (C2126.f7087) {
                        iM6981 = (C2105.m6981("ܶᩳ") ^ i6) * 101;
                        i8 = ((iM6981 ^ i7) * 1103) ^ (-704222687);
                        i4 = 947002470;
                    } else {
                        iM6981 = C0630.m2566("ܶܶ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-12019)) ^ 1331166519;
                        i4 = -182646770;
                    }
                    i5 = iM6981 ^ i4;
                    c3060M48304 = c3060M48304;
                    i9 = i5;
                    c16267 = c16266;
                    break;
                case -508459728:
                case 315199223:
                    c3060M48304.add(i10);
                    c21282.m48302(new InterfaceC14930() { // from class: l.ܿ᩻ۢ
                        @Override // l.InterfaceC14930
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            C16266.m38262(this.f54080, i);
                            return true;
                        }
                    });
                    c21282.m48305();
                    return true;
                case -452996617:
                case 1912493193:
                    C1773.m5908();
                    C2126.m7040();
                    return false;
                case -387694124:
                case 84291300:
                    C2105.m6982();
                    iM2566 = (i7 - C0630.m2566("ۚܳ")) * 27;
                    i2 = ((iM2566 ^ i6) * (-6403)) ^ 890830945;
                    i3 = -423672293;
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case -194543946:
                case 39999639:
                    if (C3537.f11231 < 0) {
                        c3060M48304 = c3060M48304;
                        iM6981 = (C2105.m6981("ܶᩳ") ^ i6) * 101;
                        i8 = ((iM6981 ^ i7) * 1103) ^ (-704222687);
                        i4 = 947002470;
                        i5 = iM6981 ^ i4;
                        c3060M48304 = c3060M48304;
                        i9 = i5;
                        c16267 = c16266;
                    } else {
                        iM2566 = (i7 - C0630.m2566("ۚܳ")) * 27;
                        i2 = ((iM2566 ^ i6) * (-6403)) ^ 890830945;
                        i3 = -423672293;
                        i9 = iM2566 ^ i3;
                        i8 = i2;
                    }
                    break;
                case -123317978:
                case 1696837300:
                    i13 = 62292;
                    iM6981 = (i7 - C0630.m2566("۟֡")) * (-97);
                    i8 = ((iM6981 ^ i6) * (-11303)) ^ 622526264;
                    i4 = -691619693;
                    i5 = iM6981 ^ i4;
                    c3060M48304 = c3060M48304;
                    i9 = i5;
                    c16267 = c16266;
                    break;
                case -72079567:
                case 1414266502:
                    return z;
                case -37976278:
                case 550579781:
                    i13 = 22656;
                    iM6981 = (i7 - C0630.m2566("۟֡")) * (-97);
                    i8 = ((iM6981 ^ i6) * (-11303)) ^ 622526264;
                    i4 = -691619693;
                    i5 = iM6981 ^ i4;
                    c3060M48304 = c3060M48304;
                    i9 = i5;
                    c16267 = c16266;
                    break;
                case 68256807:
                case 93568530:
                    c3060M48304 = c21282.m48304();
                    sArr2 = f50023;
                    if (C21923.f70183 == 0) {
                        iM2566 = C0630.m2566("᩷ۤ") ^ i7;
                        i2 = ((iM2566 ^ i6) * (-5001)) ^ 1654260145;
                        i3 = -955010721;
                        i9 = iM2566 ^ i3;
                        i8 = i2;
                    } else {
                        c3060M48304 = c3060M48304;
                        iM6981 = C2105.m6981("ܽ᩵") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-27161)) ^ 171867949;
                        i4 = 1828187463;
                        i5 = iM6981 ^ i4;
                        c3060M48304 = c3060M48304;
                        i9 = i5;
                        c16267 = c16266;
                    }
                    break;
                case 415138415:
                case 1230999567:
                    iM2568 = C0630.m2566(C1420.m4902(sArr2, 5, 3, i13));
                    if (C3911.f12484 < 0) {
                        iM2566 = C2105.m6981("ۘۗ") ^ i7;
                        i2 = ((iM2566 ^ i6) * 25029) ^ (-374901064);
                        i3 = -2125984;
                        i9 = iM2566 ^ i3;
                        i8 = i2;
                    } else {
                        c3060M48304 = c3060M48304;
                        iM6981 = (C0630.m2566("۬ۡ") + i6) * (-71);
                        i8 = ((iM6981 ^ i7) * 31485) ^ 266449826;
                        i4 = 1046683279;
                        i5 = iM6981 ^ i4;
                        c3060M48304 = c3060M48304;
                        i9 = i5;
                        c16267 = c16266;
                    }
                    break;
                case 530621731:
                case 1905282946:
                    i10 = iM2568 ^ 2124901273;
                    if (C4075.m12263() > 0) {
                        iM2566 = C2105.m6981("᩺ۡ") ^ i6;
                        i2 = ((iM2566 ^ i7) * 24183) ^ 866560956;
                        i3 = -1216666576;
                        i9 = iM2566 ^ i3;
                        i8 = i2;
                    } else {
                        c3060M48304 = c3060M48304;
                        int iM25613 = (C0630.m2566("ᩴ۠") ^ i7) * (-13);
                        i8 = ((iM25613 ^ i6) * 3769) ^ 1768761189;
                        i5 = iM25613 ^ (-1002435756);
                        c21282 = null;
                        c3060M48304 = c3060M48304;
                        i9 = i5;
                        c16267 = c16266;
                    }
                    break;
                case 735949927:
                case 2115477598:
                    c3060M48304 = c3060M48304;
                    if (i11 - (i12 + 1) < 0) {
                        iM6981 = C2105.m6981("ܿ۠") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-30551)) ^ 1842578017;
                        i4 = 871027602;
                    } else {
                        iM6981 = C0630.m2566("ܺ۠") ^ i7;
                        i8 = ((iM6981 ^ i6) * 1711) ^ (-148141685);
                        i4 = 1945336785;
                    }
                    i5 = iM6981 ^ i4;
                    c3060M48304 = c3060M48304;
                    i9 = i5;
                    c16267 = c16266;
                    break;
                case 798812828:
                case 1757194549:
                    c3060M48304 = c3060M48304;
                    if (C2520.f8000 >= 0) {
                        iM6981 = C2105.m6981("ܽ᩵") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-27161)) ^ 171867949;
                        i4 = 1828187463;
                    } else {
                        iM6981 = (C2105.m6981("ܺ֡") + i7) * (-61);
                        i8 = ((iM6981 ^ i6) * 25053) ^ (-75750484);
                        i4 = 2066908710;
                    }
                    i5 = iM6981 ^ i4;
                    c3060M48304 = c3060M48304;
                    i9 = i5;
                    c16267 = c16266;
                    break;
                default:
                    c3060M48304 = c3060M48304;
                    c16267.f50035.m17984(i);
                    c16267.f50031.setX(f);
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C0630.m2566("۬ۡ") + i6) * (-71);
                        i8 = ((iM6981 ^ i7) * 31485) ^ 266449826;
                        i4 = 1046683279;
                        i5 = iM6981 ^ i4;
                        c3060M48304 = c3060M48304;
                        i9 = i5;
                    } else {
                        int iM6982 = (i7 - C2105.m6981("᩶ۚ")) * 15;
                        c3060M48304 = c3060M48304;
                        i9 = iM6982 ^ (-248607718);
                        i8 = ((iM6982 ^ i6) * (-14779)) ^ 975575277;
                    }
                    c16267 = c16266;
                    break;
            }
        }
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC18581 mo17431() {
        C12366 c12366 = null;
        C11005 c11005M34233 = null;
        C6499 c6499 = null;
        int i = 1879124658;
        int i2 = C0630.f2410;
        int i3 = RunnableC1937.f6483;
        int iM2566 = (i3 - C0630.m2566("ᩴۗ")) * (-67);
        int i4 = ((iM2566 ^ i2) * 18701) ^ (-73004621);
        int i5 = -894675729;
        while (true) {
            i = ((((i ^ i2) * 2977) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2020811337:
                case 377425487:
                    RunnableC0588.m2441();
                    iM2566 = (C2105.m6981("֫֡") + i2) * 19;
                    i4 = ((iM2566 ^ i3) * (-31615)) ^ (-2009980828);
                    i5 = 1590098926;
                    break;
                case -1920694852:
                case 1751374778:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C2105.m6981("֫֡") + i2) * 19;
                        i4 = ((iM2566 ^ i3) * (-31615)) ^ (-2009980828);
                        i5 = 1590098926;
                    } else {
                        iM2566 = C2105.m6981("ۡ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-14775)) ^ (-1086005147);
                        i5 = -680143191;
                    }
                    break;
                case -1888901879:
                case 1857613115:
                    if (C3245.m9925() == 0) {
                        iM2566 = C0630.m2566("᩵᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15253)) ^ (-693803941);
                        i5 = -1799183612;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֡᩻")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * 1025) ^ (-504483954);
                        i5 = 1933821311;
                    }
                    break;
                case -1593673126:
                case -1172975960:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = (C2105.m6981("ܿۘ") ^ i3) * (-125);
                        i4 = ((iM2566 ^ i2) * 7629) ^ (-1146909858);
                        i5 = -1218162250;
                    } else {
                        iM2566 = (C0630.m2566("֨᩷") + i3) * 49;
                        i4 = ((iM2566 ^ i2) * 3589) ^ 709846238;
                        i5 = 397746208;
                    }
                    break;
                case -1565249603:
                case 1023459122:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (i3 - C2105.m6981("֡᩻")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * 1025) ^ (-504483954);
                        i5 = 1933821311;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۙۘ")) * 5;
                        i4 = ((iM2566 ^ i3) * (-5967)) ^ (-1148149525);
                        i5 = 2137369195;
                    }
                    break;
                case -1505936663:
                case 1006258061:
                    if (C1128.m3851() <= 0) {
                        iM2566 = C0630.m2566("᩵᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15253)) ^ (-693803941);
                        i5 = -1799183612;
                    } else {
                        iM2566 = (C0630.m2566("ۧܰ") + i2) * (-19);
                        i4 = ((iM2566 ^ i3) * (-15305)) ^ (-465996791);
                        i5 = -917940609;
                    }
                    break;
                case -1472939300:
                case -1452011794:
                    throw new RuntimeException();
                case -831454495:
                case 70785599:
                    C0630.m2564();
                    if (C1128.f4106 > 0) {
                        iM2566 = (i3 - C2105.m6981("֡᩻")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * 1025) ^ (-504483954);
                        i5 = 1933821311;
                    } else {
                        iM2566 = (C2105.m6981("֫֡") + i2) * 19;
                        i4 = ((iM2566 ^ i3) * (-31615)) ^ (-2009980828);
                        i5 = 1590098926;
                    }
                    break;
                case -644742564:
                case 984737094:
                    c11005M34233 = m34233(c12366.m36268());
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C2105.m6981("֫֡") + i2) * 19;
                        i4 = ((iM2566 ^ i3) * (-31615)) ^ (-2009980828);
                        i5 = 1590098926;
                    } else {
                        iM2566 = C0630.m2566("ۡ۫") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7387) ^ 550837382;
                        i5 = -219630598;
                    }
                    break;
                case -437662598:
                case 1029624736:
                    C2167.m7155();
                    return null;
                case -367541124:
                case 567289621:
                    if (this.f50032) {
                        iM2566 = (i3 - C0630.m2566("ᩴᩳ")) * 53;
                        i4 = ((iM2566 ^ i2) * (-3619)) ^ 44271230;
                        i5 = 1504083555;
                    } else {
                        iM2566 = C2105.m6981("۠ᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-1749)) ^ (-95952492);
                        i5 = 1965004531;
                    }
                    break;
                case -258182948:
                case 844983884:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C2105.m6981("֫֡") + i2) * 19;
                        i4 = ((iM2566 ^ i3) * (-31615)) ^ (-2009980828);
                        i5 = 1590098926;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ܽܽ")) * 19;
                        i4 = ((iM2566 ^ i3) * (-463)) ^ 1840129304;
                        i5 = -47206879;
                    }
                    break;
                case -250541326:
                case 287956762:
                    if (C1916.m6308() >= 0) {
                        iM2566 = C0630.m2566("᩵᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15253)) ^ (-693803941);
                        i5 = -1799183612;
                    } else {
                        iM2566 = C2105.m6981("᩶۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-14997)) ^ 437288442;
                        i5 = -1441094767;
                    }
                    break;
                case -76449911:
                case 593149436:
                    c6499 = this.f50035;
                    if (c6499 != null) {
                        iM2566 = C0630.m2566("᩵᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-22265)) ^ 1378155815;
                        i5 = 1948893640;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۚ۬")) * (-45);
                        i4 = ((iM2566 ^ i2) * (-9887)) ^ (-310393924);
                        i5 = -227779098;
                    }
                    break;
                case -58150530:
                case 412702084:
                    c12366 = this.f50026;
                    if (c12366 != null) {
                        iM2566 = C0630.m2566("֡ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 13027) ^ 1358210742;
                        i5 = 2069921258;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ᩴᩳ")) * 53;
                        i4 = ((iM2566 ^ i2) * (-3619)) ^ 44271230;
                        i5 = 1504083555;
                    }
                    break;
                case 236900711:
                case 800036390:
                    if (this.f50024) {
                        iM2566 = C2105.m6981("ۨۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 16637) ^ 238213984;
                        i5 = 1215365528;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ᩴᩳ")) * 53;
                        i4 = ((iM2566 ^ i2) * (-3619)) ^ 44271230;
                        i5 = 1504083555;
                    }
                    break;
                case 781869098:
                case 1218699893:
                    return new C9212(this, c6499, c11005M34233);
                case 957567495:
                case 1792773380:
                    return null;
                case 1178550131:
                case 2053377683:
                    if (C4616.m13552() != 0) {
                        iM2566 = C0630.m2566("᩵᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15253)) ^ (-693803941);
                        i5 = -1799183612;
                    } else {
                        iM2566 = C2105.m6981("᩹᩷") ^ i3;
                        i4 = ((iM2566 ^ i2) * 16617) ^ (-1282085299);
                        i5 = 861192073;
                    }
                    break;
                case 1568435102:
                case 1661710586:
                    if (C0050.m940() <= 0) {
                        iM2566 = (C0630.m2566("ܳۨ") ^ i3) * (-69);
                        i4 = ((iM2566 ^ i2) * 31671) ^ (-2002848809);
                        i5 = 581449484;
                    } else {
                        iM2566 = (C0630.m2566("ۖۨ") + i2) * 61;
                        i4 = ((iM2566 ^ i3) * 10439) ^ 1718803606;
                        i5 = -1921714014;
                    }
                    break;
                case 1609105634:
                case 1936273103:
                    if (!C1504.m5179()) {
                        iM2566 = (i3 - C2105.m6981("֡᩻")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * 1025) ^ (-504483954);
                        i5 = 1933821311;
                    } else {
                        iM2566 = (C0630.m2566("ܳۨ") ^ i3) * (-69);
                        i4 = ((iM2566 ^ i2) * 31671) ^ (-2002848809);
                        i5 = 581449484;
                    }
                    break;
                default:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C0630.m2566("᩵᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15253)) ^ (-693803941);
                        i5 = -1799183612;
                    } else {
                        iM2566 = C2105.m6981("ܳ֨") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-27799)) ^ 1896768625;
                        i5 = -1547807309;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC3900
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11876(C12366 c12366) {
        String strM38278 = null;
        int i = -1946399755;
        int i2 = ServiceConnectionC3453.f10921;
        int i3 = C5695.f17556;
        int iM6981 = C2105.m6981("ۨᩳ") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-4437)) ^ 686518227;
        int i5 = 1448504578;
        while (true) {
            i = ((((i ^ i3) * o.a.x) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2016639585:
                case -991161536:
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("ۚۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 2957) ^ (-1283417710);
                        i5 = 102149591;
                    } else {
                        iM6981 = C2105.m6981("ۙۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-15733)) ^ (-581868328);
                        i5 = 589207299;
                    }
                    break;
                case -1559445663:
                case 493739617:
                    C1504.m5179();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6981 = C0630.m2566("᩹ۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13259)) ^ (-1286047022);
                        i5 = -1839043319;
                    } else {
                        iM6981 = C0630.m2566("ۚۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 2957) ^ (-1283417710);
                        i5 = 102149591;
                    }
                    break;
                case -1244558224:
                case 2097729267:
                    strM38278 = m38278();
                    if (C2105.f7037 != 0) {
                        iM6981 = C2105.m6981("ۚܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-24443)) ^ (-1730009402);
                        i5 = -11030120;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۧ᩷")) * (-31);
                        i4 = ((iM6981 ^ i3) * (-26323)) ^ (-1579502984);
                        i5 = 1082119204;
                    }
                    break;
                case -1163826951:
                case 989402830:
                    if (C1773.m5908() <= 0) {
                        iM6981 = C0630.m2566("ۚۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 2957) ^ (-1283417710);
                        i5 = 102149591;
                    } else {
                        iM6981 = (C0630.m2566("ۛۖ") + i3) * 31;
                        i4 = ((iM6981 ^ i2) * (-12261)) ^ 133371397;
                        i5 = -842028213;
                    }
                    break;
                case -1136476136:
                case -1063526684:
                    if (C3245.m9925() != 0) {
                        iM6981 = C0630.m2566("ۚۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 2957) ^ (-1283417710);
                        i5 = 102149591;
                    } else {
                        iM6981 = C2105.m6981("֫ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21343) ^ 1172355691;
                        i5 = 702252540;
                    }
                    break;
                case -957562542:
                case -532324989:
                    if (C0630.m2564()) {
                        iM6981 = (C0630.m2566("ۧܺ") ^ i2) * (-91);
                        i4 = ((iM6981 ^ i3) * (-7141)) ^ (-1893565016);
                        i5 = 1730678606;
                    } else {
                        iM6981 = (C2105.m6981("ܽۧ") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * (-28171)) ^ 569159041;
                        i5 = -1224319450;
                    }
                    break;
                case -836146058:
                case 2090495513:
                    if (C3245.f10203 <= 0) {
                        iM6981 = C0630.m2566("᩹ۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13259)) ^ (-1286047022);
                        i5 = -1839043319;
                    } else {
                        iM6981 = (C2105.m6981("ܶܳ") + i2) * (-105);
                        i4 = ((iM6981 ^ i3) * (-4785)) ^ 571470044;
                        i5 = 1026503112;
                    }
                    break;
                case -535270565:
                case -64433633:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C0630.m2566("ۧܺ") ^ i2) * (-91);
                        i4 = ((iM6981 ^ i3) * (-7141)) ^ (-1893565016);
                        i5 = 1730678606;
                    } else {
                        iM6981 = C2105.m6981("ۘ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8263)) ^ 1519862476;
                        i5 = 735776679;
                    }
                    break;
                case -511449161:
                case 1886262474:
                    if (C7106.f21815 != 0) {
                        iM6981 = (C0630.m2566("ۧܺ") ^ i2) * (-91);
                        i4 = ((iM6981 ^ i3) * (-7141)) ^ (-1893565016);
                        i5 = 1730678606;
                    } else {
                        iM6981 = C0630.m2566("᩹ۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13259)) ^ (-1286047022);
                        i5 = -1839043319;
                    }
                    break;
                case -432002025:
                case 241807652:
                    return !c12366.m30058(strM38278);
                case -354319377:
                case 1845994078:
                    C3683.m11222();
                    C3746.m11369();
                    return false;
                case -255688637:
                case 944955003:
                    if (C0798.m2998() != 0) {
                        iM6981 = C0630.m2566("᩹ۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13259)) ^ (-1286047022);
                        i5 = -1839043319;
                    } else {
                        iM6981 = (C0630.m2566("ۧ۠") ^ i3) * 17;
                        i4 = ((iM6981 ^ i2) * 28953) ^ 1868083821;
                        i5 = -1111553123;
                    }
                    break;
                case 329293684:
                case 1745043093:
                    C0237.m1481();
                    if (C1047.f3863 >= 0) {
                        iM6981 = C0630.m2566("ܺۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 24951) ^ 904188725;
                        i5 = -1655057854;
                    } else {
                        iM6981 = (C0630.m2566("ۧܺ") ^ i2) * (-91);
                        i4 = ((iM6981 ^ i3) * (-7141)) ^ (-1893565016);
                        i5 = 1730678606;
                    }
                    break;
                case 1333811826:
                case 1835235857:
                    if (C0630.f2410 <= 0) {
                        iM6981 = C0630.m2566("ܺۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 24951) ^ 904188725;
                        i5 = -1655057854;
                    } else {
                        iM6981 = (C2105.m6981("ۙ᩻") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM6981 ^ i3) * 6521) ^ (-1816091275);
                        i5 = 1597860213;
                    }
                    break;
                case 1562080667:
                case 2136372949:
                    C4616.m13552();
                    iM6981 = C0630.m2566("ۚۢ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 2957) ^ (-1283417710);
                    i5 = 102149591;
                    break;
                default:
                    if (C0798.m2998() != 0) {
                        iM6981 = C0630.m2566("ܺۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 24951) ^ 904188725;
                        i5 = -1655057854;
                    } else {
                        iM6981 = C0630.m2566("᩻۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21077)) ^ (-2054837858);
                        i5 = -1552640814;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38264(C16266 c16266, C12366 c12366) {
        int i = 2091093047;
        int i2 = C2520.f8000;
        int i3 = C2958.f9394;
        int iM2566 = (i2 - C0630.m2566("᩶᩶")) * 21;
        int i4 = ((iM2566 ^ i3) * (-2387)) ^ 128027969;
        int i5 = -252449273;
        while (true) {
            i = ((((i ^ i3) * (-785)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2078998036:
                case 1043986328:
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("֡ܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-7875)) ^ (-1451097200);
                        i5 = -1541056378;
                    } else {
                        iM2566 = (C2105.m6981("ܰۜ") + i2) * (-47);
                        i4 = ((iM2566 ^ i3) * (-11645)) ^ 653016054;
                        i5 = -293709205;
                    }
                    break;
                case -2066933981:
                case -1510753387:
                    if (C1420.f5096 <= 0) {
                        iM2566 = C2105.m6981("֡ܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-7875)) ^ (-1451097200);
                        i5 = -1541056378;
                    } else {
                        iM2566 = C0630.m2566("֡᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7237) ^ 375854367;
                        i5 = 833849892;
                    }
                    break;
                case -1704364783:
                case -910735499:
                    AbstractC2021.m6574();
                    C2126.m7040();
                    break;
                case -1371701750:
                case 1164839417:
                    break;
                case -1305223567:
                case 1289351807:
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("֡ܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-7875)) ^ (-1451097200);
                        i5 = -1541056378;
                    } else {
                        iM2566 = C2105.m6981("ܰ᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-22445)) ^ 1272196313;
                        i5 = -1024631555;
                    }
                    break;
                case -1293200277:
                case 1155123416:
                    c16266.f50026 = c12366;
                    if (c16266.f50024) {
                        iM2566 = (C2105.m6981("֨ۖ") ^ i3) * 93;
                        i4 = ((iM2566 ^ i2) * (-28955)) ^ 1065023534;
                        i5 = -407262077;
                    } else {
                        iM2566 = (C2105.m6981("ۨܺ") ^ i2) * 3;
                        i4 = ((iM2566 ^ i3) * (-14559)) ^ (-1413247274);
                        i5 = -410896661;
                    }
                    break;
                case -1190821397:
                case 1396307696:
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("֡ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-15541)) ^ 352447314;
                        i5 = 938009921;
                    } else {
                        iM2566 = C2105.m6981("᩵ۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-24175)) ^ (-2067494748);
                        i5 = -887613924;
                    }
                    break;
                case -1137398096:
                case 739387244:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = C2105.m6981("ܰᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21691) ^ (-1291886388);
                        i5 = 1698163003;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۖ۬")) * (-97);
                        i4 = ((iM2566 ^ i3) * (-27615)) ^ (-706470293);
                        i5 = 1505388688;
                    }
                    break;
                case -1026885851:
                case 944726119:
                    C2105.m6982();
                    if (C0237.f1507 == 0) {
                        iM2566 = C2105.m6981("ܰᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21691) ^ (-1291886388);
                        i5 = 1698163003;
                    } else {
                        iM2566 = C0630.m2566("᩺֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6007) ^ (-1789705969);
                        i5 = 1108391247;
                    }
                    break;
                case -997091260:
                case 146804063:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("ܰᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21691) ^ (-1291886388);
                        i5 = 1698163003;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۢᩳ")) * (-127);
                        i4 = ((iM2566 ^ i3) * 10829) ^ 1218335072;
                        i5 = -1931335956;
                    }
                    break;
                case -542295550:
                case -354242761:
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("ܰᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21691) ^ (-1291886388);
                        i5 = 1698163003;
                    } else {
                        iM2566 = (C2105.m6981("۟ۡ") + i2) * (-115);
                        i4 = ((iM2566 ^ i3) * (-21089)) ^ (-137362261);
                        i5 = -123497202;
                    }
                    break;
                case -514720675:
                case -365374538:
                    C4263.m12821(new C7095(c16266));
                    break;
                case -306659744:
                case -292300756:
                    if (C1128.m3851() > 0) {
                        iM2566 = C0630.m2566("᩺֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6007) ^ (-1789705969);
                        i5 = 1108391247;
                    } else {
                        iM2566 = C0630.m2566("ܰ۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-2229)) ^ (-1572576912);
                        i5 = 217847241;
                    }
                    break;
                case -102880527:
                case 156105509:
                    C1420.m4913();
                    C0050.m940();
                    iM2566 = C0630.m2566("᩺֨") ^ i2;
                    i4 = ((iM2566 ^ i3) * 6007) ^ (-1789705969);
                    i5 = 1108391247;
                    break;
                case -93750005:
                case 894808559:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C2105.m6981("ܰᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21691) ^ (-1291886388);
                        i5 = 1698163003;
                    } else {
                        iM2566 = C0630.m2566("۟ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-30317)) ^ (-757366601);
                        i5 = 532716245;
                    }
                    break;
                case 246042060:
                case 1331260370:
                    if (C4075.f12947 >= 0) {
                        iM2566 = C2105.m6981("֡ܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-7875)) ^ (-1451097200);
                        i5 = -1541056378;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۧۜ")) * 109;
                        i4 = ((iM2566 ^ i2) * (-22423)) ^ (-313765008);
                        i5 = 329316837;
                    }
                    break;
                case 793309686:
                case 1359427503:
                    if (RunnableC1937.f6483 < 0) {
                        iM2566 = C0630.m2566("֡ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-15541)) ^ 352447314;
                        i5 = 938009921;
                    } else {
                        iM2566 = C2105.m6981("ܰᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21691) ^ (-1291886388);
                        i5 = 1698163003;
                    }
                    break;
                default:
                    if (C3683.m11222()) {
                        iM2566 = C0630.m2566("᩺֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6007) ^ (-1789705969);
                        i5 = 1108391247;
                    } else {
                        iM2566 = C2105.m6981("᩺۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * 7217) ^ 574590798;
                        i5 = -660732670;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38262(C16266 c16266, int i) {
        C6499 c6499 = null;
        int iM17976 = 0;
        int i2 = 0;
        C19287 c19287M44466 = null;
        ActivityC0737 activityC0737M11214 = null;
        ActivityC17169 activityC17169 = null;
        int i3 = -701524639;
        int i4 = C2958.f9394;
        int i5 = C22628.f73083;
        int iM6981 = C2105.m6981("ۢ᩹") ^ i5;
        int i6 = ((iM6981 ^ i4) * 19225) ^ (-1325429123);
        int i7 = -1144633409;
        while (true) {
            i3 = ((((i3 ^ i4) * (-12217)) >> 31) & i6) ^ (iM6981 ^ i7);
            switch (i3) {
                case -1910133109:
                case 1378151197:
                    if (C0714.m2805()) {
                        iM6981 = (C2105.m6981("᩶᩷") + i4) * (-105);
                        i6 = ((iM6981 ^ i5) * 21587) ^ 377221409;
                        i7 = -464965392;
                    } else {
                        iM6981 = (C0630.m2566("ۚۘ") ^ i5) * (-111);
                        i6 = ((iM6981 ^ i4) * (-26813)) ^ (-2098086003);
                        i7 = 1355678053;
                    }
                    break;
                case -1760544232:
                case 2066630824:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C0630.m2566("᩵᩺") ^ i4;
                        i6 = ((iM6981 ^ i5) * 19503) ^ 1941455696;
                        i7 = -157098962;
                    } else {
                        iM6981 = C2105.m6981("۟ܽ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 17659) ^ 1527555826;
                        i7 = 1145997329;
                    }
                    break;
                case -1759642007:
                case 1868031035:
                    c6499 = c16266.f50035;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6981 = C2105.m6981("۫֫") ^ i4;
                        i6 = ((iM6981 ^ i5) * 17983) ^ 429680307;
                        i7 = -1565185518;
                    } else {
                        iM6981 = C2105.m6981("֡ܽ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-6585)) ^ 1000014547;
                        i7 = -279419615;
                    }
                    break;
                case -1621642929:
                case -383691747:
                    activityC17169.m40343(c16266.m38278(), c19287M44466);
                    break;
                case -1182491924:
                case 1866158804:
                    c19287M44466 = C19287.m44466(iM17976, i2);
                    activityC0737M11214 = C3683.m11214(c16266);
                    if (C3911.m11924() <= 0) {
                        iM6981 = (C0630.m2566("ۚۘ") ^ i5) * (-111);
                        i6 = ((iM6981 ^ i4) * (-26813)) ^ (-2098086003);
                        i7 = 1355678053;
                    } else {
                        iM6981 = C2105.m6981("֡ܺ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 5745) ^ (-1498559329);
                        i7 = -1479375052;
                    }
                    break;
                case -1158353889:
                case -194486786:
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("۫֫") ^ i4;
                        i6 = ((iM6981 ^ i5) * 17983) ^ 429680307;
                        i7 = -1565185518;
                    } else {
                        iM6981 = C0630.m2566("᩸ܿ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-4021)) ^ 625920531;
                        i7 = -1554624201;
                    }
                    break;
                case -251195743:
                case 444205578:
                    iM17976 = c6499.m17976(i);
                    i2 = 0;
                    if (C1420.f5096 <= 0) {
                        iM6981 = C0630.m2566("᩵᩺") ^ i4;
                        i6 = ((iM6981 ^ i5) * 19503) ^ 1941455696;
                        i7 = -157098962;
                    } else {
                        iM6981 = C2105.m6981("ۗᩴ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 19861) ^ (-1698620411);
                        i7 = 1524152906;
                    }
                    break;
                case -218313656:
                case 1601673323:
                    RunnableC1937.m6387();
                    break;
                case 58935324:
                case 1467222803:
                    if (C3911.f12484 >= 0) {
                        iM6981 = (C2105.m6981("֡ۘ") + i4) * 97;
                        i6 = ((iM6981 ^ i5) * (-20187)) ^ 956076711;
                        i7 = -1285638318;
                    } else {
                        iM6981 = C2105.m6981("ۘᩴ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-21145)) ^ (-256580897);
                        i7 = 531854408;
                    }
                    break;
                case 201821475:
                case 1197205379:
                    if (AbstractC2021.m6574()) {
                        iM6981 = C0630.m2566("᩵᩺") ^ i4;
                        i6 = ((iM6981 ^ i5) * 19503) ^ 1941455696;
                        i7 = -157098962;
                    } else {
                        iM6981 = (C2105.m6981("۬᩶") + i4) * (-101);
                        i6 = ((iM6981 ^ i5) * (-20157)) ^ 1821185690;
                        i7 = -537045230;
                    }
                    break;
                case 523053434:
                case 1361526396:
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = C2105.m6981("ۘᩴ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-21145)) ^ (-256580897);
                        i7 = 531854408;
                    } else {
                        iM6981 = C2105.m6981("۫֫") ^ i4;
                        i6 = ((iM6981 ^ i5) * 17983) ^ 429680307;
                        i7 = -1565185518;
                    }
                    break;
                case 709925943:
                case 819871152:
                    if (C0050.f910 < 0) {
                        iM6981 = C2105.m6981("۫֫") ^ i4;
                        i6 = ((iM6981 ^ i5) * 17983) ^ 429680307;
                        i7 = -1565185518;
                    } else {
                        iM6981 = (C0630.m2566("ۚۘ") ^ i5) * (-111);
                        i6 = ((iM6981 ^ i4) * (-26813)) ^ (-2098086003);
                        i7 = 1355678053;
                    }
                    break;
                case 967297797:
                case 1450684519:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C2105.m6981("֡ۘ") + i4) * 97;
                        i6 = ((iM6981 ^ i5) * (-20187)) ^ 956076711;
                        i7 = -1285638318;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ۡ᩷")) * (-83);
                        i6 = ((iM6981 ^ i4) * 20681) ^ 1822300110;
                        i7 = -1058432022;
                    }
                    break;
                case 1469525157:
                case 2073904826:
                    C3683.m11222();
                    iM6981 = (C0630.m2566("ۚۘ") ^ i5) * (-111);
                    i6 = ((iM6981 ^ i4) * (-26813)) ^ (-2098086003);
                    i7 = 1355678053;
                    break;
                case 1810826416:
                case 1907184332:
                    if (C4117.f13076 <= 0) {
                        iM6981 = (C0630.m2566("ۚۘ") ^ i5) * (-111);
                        i6 = ((iM6981 ^ i4) * (-26813)) ^ (-2098086003);
                        i7 = 1355678053;
                    } else {
                        iM6981 = (C2105.m6981("۠۠") ^ i5) * (-67);
                        i6 = ((iM6981 ^ i4) * 21703) ^ (-320846367);
                        i7 = 288746345;
                    }
                    break;
                default:
                    activityC17169 = (ActivityC17169) activityC0737M11214;
                    if (C1711.m5736() <= 0) {
                        iM6981 = C2105.m6981("ۘᩴ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-21145)) ^ (-256580897);
                        i7 = 531854408;
                    } else {
                        iM6981 = C0630.m2566("ܶܳ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 3399) ^ 870672365;
                        i7 = -591219645;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m38281() {
        this.f50027 = true;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m38280() {
        return this.f50025;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C16376 m38269(C16266 c16266) throws Exception {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        Bundle bundleM10747;
        int i3;
        String str4;
        short s;
        int i4;
        int i5;
        int i6;
        String strM7036;
        int iM2566;
        int i7;
        int i8;
        int i9;
        int iM2567;
        int i10;
        int i11;
        int i12;
        int i13;
        int iM6981;
        Bundle bundle;
        String str5;
        int i14;
        short s2;
        int i15;
        int i16;
        int iM2568;
        int i17;
        int i18;
        int iM6982;
        int i19;
        int iM6983;
        int i20;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = -272599193;
        int i26 = C1294.f4556;
        int i27 = RunnableC3474.f10992;
        int iM6984 = C2105.m6981("֡ܺ") ^ i26;
        int i28 = ((iM6984 ^ i27) * 32691) ^ 1562328571;
        int i29 = iM6984 ^ 2027442614;
        C20334 c20334M46645 = null;
        String str6 = null;
        String strM6309 = null;
        String strM4902 = null;
        String strM3509 = null;
        int[] iArr = null;
        String strM28015 = null;
        C16376 c16376 = null;
        short[] sArr = null;
        String strM40362 = null;
        int i30 = 0;
        int i31 = 0;
        int iLastIndexOf = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        char c = 0;
        short s3 = 0;
        int i40 = 0;
        Bundle bundle2 = null;
        while (true) {
            i25 = i29 ^ (i28 & (((i25 ^ i27) * 12625) >> 31));
            switch (i25) {
                case -2133552239:
                case -1712478836:
                    str3 = strM28015;
                    i2 = i38;
                    i3 = i40;
                    i30 = i30;
                    str6 = str6;
                    c20334M46645 = C20334.m46645(strM40362);
                    bundleM10747 = C3537.m10747(c16266);
                    if (C0483.m2121()) {
                        iM6981 = (C2105.m6981("ܶۙ") ^ i26) * (-55);
                        bundle2 = bundleM10747;
                        i28 = ((iM6981 ^ i27) * (-26759)) ^ 290266813;
                        i13 = -1752519014;
                    } else {
                        iM6981 = (C2105.m6981("᩷ᩴ") ^ i27) * (-71);
                        bundle2 = bundleM10747;
                        i28 = ((iM6981 ^ i26) * (-23915)) ^ (-787838537);
                        i13 = -223914437;
                    }
                    i8 = iM6981 ^ i13;
                    i40 = i3;
                    strM28015 = str3;
                    i29 = i8;
                    bundle = bundle2;
                    str6 = str6;
                    i30 = i30;
                    i38 = i2;
                    bundle2 = bundle;
                    break;
                case -2078464194:
                case -876455179:
                    i39 = i31 + 1;
                    iM6983 = (C2105.m6981("ۚ֡") + i26) * (-3);
                    i15 = ((iM6983 ^ i27) * (-14821)) ^ 1198229289;
                    i20 = -1726171679;
                    i29 = iM6983 ^ i20;
                    i28 = i15;
                    break;
                case -2069114152:
                case 90973202:
                    c16376.m38571();
                    c16376.m38570();
                    return c16376;
                case -2051590592:
                case 234628992:
                    i2 = i38;
                    i40 = 7745;
                    int iM6985 = (i27 - C2105.m6981("᩻ۜ")) * 11;
                    i10 = ((iM6985 ^ i26) * (-28011)) ^ (-913951678);
                    i12 = iM6985 ^ (-451256874);
                    strM28015 = strM28015;
                    i29 = i12;
                    i28 = i10;
                    bundle = bundle2;
                    str6 = str6;
                    i30 = i30;
                    i38 = i2;
                    bundle2 = bundle;
                    break;
                case -2019457945:
                case -1775808076:
                    C3019.m9255();
                    C1504.m5179();
                    return null;
                case -1884862154:
                case -1642100888:
                    C16376 c16377 = new C16376(strM28015, i31);
                    if (C3537.m10754(c16377.f50393)) {
                        c16376 = c16377;
                        iM6983 = (i27 - C2105.m6981("᩺ܰ")) * (-25);
                        i15 = ((iM6983 ^ i26) * 23137) ^ 1383861160;
                        i20 = 132089967;
                        i29 = iM6983 ^ i20;
                        i28 = i15;
                    } else {
                        int iM6986 = C2105.m6981("ۢ᩶") ^ i26;
                        c16376 = c16377;
                        i28 = ((iM6986 ^ i27) * (-30933)) ^ 640930060;
                        i29 = iM6986 ^ (-1436254739);
                    }
                    break;
                case -1861586799:
                case -646696964:
                    str2 = strM28015;
                    i = i40;
                    int i41 = i38;
                    i30 = i30;
                    str6 = str6;
                    bundle2 = bundle2;
                    i2 = i41;
                    i22 = i21 * i21;
                    short s4 = s3;
                    i23 = s4 * s4;
                    i24 = 55860676;
                    if (RunnableC3474.f10992 > 0) {
                        int iM2569 = C0630.m2566("ܺܿ") ^ i26;
                        String str7 = strM40362;
                        int i42 = ((iM2569 ^ i27) * (-30505)) ^ (-1564482302);
                        i8 = iM2569 ^ (-1379703563);
                        s3 = s4;
                        i28 = i42;
                        i40 = i;
                        strM28015 = str2;
                        strM40362 = str7;
                        i29 = i8;
                        bundle = bundle2;
                        str6 = str6;
                        i30 = i30;
                        i38 = i2;
                        bundle2 = bundle;
                    } else {
                        s3 = s4;
                        str = strM40362;
                        iM2566 = (i26 - C0630.m2566("ۡܿ")) * 27;
                        i5 = ((iM2566 ^ i27) * 20529) ^ 1141481668;
                        i7 = -924154105;
                        i6 = iM2566 ^ i7;
                        i40 = i;
                        strM28015 = str2;
                        i29 = i6;
                        i28 = i5;
                        strM40362 = str;
                        bundle = bundle2;
                        str6 = str6;
                        i30 = i30;
                        i38 = i2;
                        bundle2 = bundle;
                    }
                    break;
                case -1749117417:
                case 431517665:
                    C20334 c20334 = c20334M46645;
                    int[] iArrM46656 = c20334.m46656(strM3509, C11340.m28015(strM6309, i35, iLastIndexOf), C3432.m10478(strM6309, iLastIndexOf + i34));
                    if (iArrM46656 != null) {
                        int iM6987 = (i26 - C2105.m6981("۟᩻")) * (-33);
                        i28 = ((iM6987 ^ i27) * (-9109)) ^ 1498774808;
                        i29 = iM6987 ^ 228878071;
                    } else {
                        int iM6988 = (C2105.m6981("۬ᩳ") + i27) * 37;
                        i29 = iM6988 ^ (-766686984);
                        i28 = ((iM6988 ^ i26) * 21171) ^ 541208158;
                    }
                    c20334M46645 = c20334;
                    iArr = iArrM46656;
                    break;
                case -1621415669:
                case -773252878:
                    strM28015 = strM28015;
                    i9 = i40;
                    int i43 = i38;
                    i30 = i30;
                    str6 = str6;
                    bundle2 = bundle2;
                    i2 = i43;
                    strM40362 = ((ActivityC17169) C3683.m11214(c16266)).m40362(c16266.m38278());
                    if (C11340.m28031()) {
                        iM2567 = C0630.m2566("᩷᩷") ^ i26;
                        i10 = ((iM2567 ^ i27) * (-1249)) ^ (-1107079353);
                        i11 = 803171162;
                    } else {
                        iM2567 = (C0630.m2566("ܰۙ") + i26) * 37;
                        i10 = ((iM2567 ^ i27) * (-2425)) ^ 1985359900;
                        i11 = 1225508563;
                    }
                    i12 = iM2567 ^ i11;
                    i40 = i9;
                    strM28015 = strM28015;
                    i29 = i12;
                    i28 = i10;
                    bundle = bundle2;
                    str6 = str6;
                    i30 = i30;
                    i38 = i2;
                    bundle2 = bundle;
                    break;
                case -1525887056:
                case 535145298:
                    strM28015 = C11340.m28015(strM40362, i36, i30);
                    i32 = i33;
                    i31 = i34;
                    iM6983 = C0630.m2566("ܺܶ") ^ i26;
                    i15 = ((iM6983 ^ i27) * 18319) ^ 145117507;
                    i20 = -784899987;
                    i29 = iM6983 ^ i20;
                    i28 = i15;
                    break;
                case -1507321646:
                case -674213340:
                    str = strM40362;
                    str4 = strM28015;
                    s = s3;
                    i4 = i40;
                    int i44 = i38;
                    i30 = i30;
                    str6 = str6;
                    bundle2 = bundle2;
                    i2 = i44;
                    sArr = f50023;
                    c = '\b';
                    if (!C11340.m28031()) {
                        strM7036 = str6;
                        int iM6989 = (C2105.m6981("֫֡") ^ i26) * (-35);
                        i15 = ((iM6989 ^ i27) * (-21155)) ^ (-362469533);
                        i40 = i4;
                        i30 = i30;
                        strM28015 = str4;
                        s3 = s;
                        i29 = iM6989 ^ 1238576394;
                        i38 = i2;
                        bundle2 = bundle2;
                        strM40362 = str;
                        str6 = strM7036;
                        i28 = i15;
                    } else {
                        int iM69810 = (C2105.m6981("֫۟") ^ i26) * 97;
                        i5 = ((iM69810 ^ i27) * (-28607)) ^ 1645403290;
                        i6 = iM69810 ^ 120221217;
                        i40 = i4;
                        strM28015 = str4;
                        s3 = s;
                        i29 = i6;
                        i28 = i5;
                        strM40362 = str;
                        bundle = bundle2;
                        str6 = str6;
                        i30 = i30;
                        i38 = i2;
                        bundle2 = bundle;
                    }
                    break;
                case -1335896247:
                case -221504247:
                    i33 = 0;
                    i16 = i38;
                    strM3509 = C1005.m3509(strM6309, 0, i16);
                    i34 = 1;
                    i35 = i16 + 1;
                    if (C1504.f5354) {
                        iM6982 = (C2105.m6981("᩻ۨ") + i27) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i17 = ((iM6982 ^ i26) * 6913) ^ 98918457;
                        i19 = 2087863439;
                    } else {
                        iM6982 = (C2105.m6981("ۡ۟") ^ i27) * 99;
                        i17 = ((iM6982 ^ i26) * 813) ^ 1241478876;
                        i19 = 1245335086;
                    }
                    i29 = iM6982 ^ i19;
                    int i45 = i30;
                    i38 = i16;
                    i28 = i17;
                    i30 = i45;
                    break;
                case -1328782299:
                case 1727345020:
                    i2 = i38;
                    i40 = 60049;
                    int iM69811 = (i27 - C2105.m6981("᩻ۜ")) * 11;
                    i10 = ((iM69811 ^ i26) * (-28011)) ^ (-913951678);
                    i12 = iM69811 ^ (-451256874);
                    strM28015 = strM28015;
                    i29 = i12;
                    i28 = i10;
                    bundle = bundle2;
                    str6 = str6;
                    i30 = i30;
                    i38 = i2;
                    bundle2 = bundle;
                    break;
                case -1120308680:
                case 965845262:
                    if (RunnableC1937.m6387() == 0) {
                        i16 = i38;
                        iM6982 = (C2105.m6981("᩻ۨ") + i27) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i17 = ((iM6982 ^ i26) * 6913) ^ 98918457;
                        i19 = 2087863439;
                        i29 = iM6982 ^ i19;
                        int i46 = i30;
                        i38 = i16;
                        i28 = i17;
                        i30 = i46;
                    } else {
                        iM6983 = C0630.m2566("᩵ܽ") ^ i27;
                        i15 = ((iM6983 ^ i26) * (-23755)) ^ 294465173;
                        i20 = -137451663;
                        i29 = iM6983 ^ i20;
                        i28 = i15;
                    }
                    break;
                case -1027205343:
                case 1846699280:
                    throw new Exception(C2958.m9035(strM4902, strM6309));
                case -1008209311:
                case 1369251700:
                    i16 = i38;
                    i30 = i30;
                    str4 = strM28015;
                    i4 = i40;
                    strM4902 = C1420.m4902(f50023, 15, 25, i4);
                    if (i16 == -1) {
                        i37 = -1;
                        iM2568 = (i26 - C0630.m2566("᩺᩹")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i17 = ((iM2568 ^ i27) * 26699) ^ (-285725246);
                        i18 = -1924807356;
                        i40 = i4;
                        strM28015 = str4;
                        i29 = iM2568 ^ i18;
                        int i47 = i30;
                        i38 = i16;
                        i28 = i17;
                        i30 = i47;
                    } else {
                        int iM25610 = (C0630.m2566("᩹᩸") + i27) * (-13);
                        i15 = ((iM25610 ^ i26) * (-15315)) ^ 217128079;
                        i40 = i4;
                        strM28015 = str4;
                        i37 = -1;
                        i29 = iM25610 ^ 809054400;
                        i30 = i30;
                        i38 = i16;
                        i28 = i15;
                    }
                    break;
                case -920600053:
                case 714857931:
                    C4159.m12565();
                    if (!C2272.m7503()) {
                        str = strM40362;
                        str5 = strM28015;
                        s2 = s3;
                        i14 = i40;
                        int i48 = i38;
                        i30 = i30;
                        str6 = str6;
                        bundle2 = bundle2;
                        i2 = i48;
                        int iM69812 = C2105.m6981("ۨۚ") ^ i26;
                        s3 = s2;
                        i28 = ((iM69812 ^ i27) * 17215) ^ 1122813596;
                        i40 = i14;
                        strM28015 = str5;
                        i29 = iM69812 ^ (-1284432028);
                        strM40362 = str;
                        bundle = bundle2;
                        str6 = str6;
                        i30 = i30;
                        i38 = i2;
                        bundle2 = bundle;
                    } else {
                        iM6983 = C0630.m2566("᩵ܽ") ^ i27;
                        i15 = ((iM6983 ^ i26) * (-23755)) ^ 294465173;
                        i20 = -137451663;
                        i29 = iM6983 ^ i20;
                        i28 = i15;
                    }
                    break;
                case -744877393:
                case -361997243:
                    i30 = i30;
                    str5 = strM28015;
                    Bundle bundle3 = bundle2;
                    str6 = str6;
                    i14 = i40;
                    strM6309 = C1916.m6309(bundle3, str6);
                    int iM9036 = C2958.m9036(strM6309, 40);
                    if (C4616.f14690 <= 0) {
                        i2 = iM9036;
                        str = strM40362;
                        bundle2 = bundle3;
                        s2 = s3;
                        int iM69813 = C2105.m6981("ۨۚ") ^ i26;
                        s3 = s2;
                        i28 = ((iM69813 ^ i27) * 17215) ^ 1122813596;
                        i40 = i14;
                        strM28015 = str5;
                        i29 = iM69813 ^ (-1284432028);
                        strM40362 = str;
                        bundle = bundle2;
                        str6 = str6;
                        i30 = i30;
                        i38 = i2;
                        bundle2 = bundle;
                    } else {
                        int iM69814 = (C2105.m6981("ܳۗ") + i27) * (-15);
                        i28 = ((iM69814 ^ i26) * 31567) ^ (-2033254721);
                        i40 = i14;
                        strM28015 = str5;
                        i29 = iM69814 ^ (-1760855579);
                        bundle2 = bundle3;
                        str6 = str6;
                        i30 = i30;
                        i38 = iM9036;
                    }
                    break;
                case -734741708:
                case 1479846115:
                    ServiceConnectionC3453.m10564();
                    if (C11340.f33930 < 0) {
                        str3 = strM28015;
                        bundleM10747 = bundle2;
                        i2 = i38;
                        i3 = i40;
                        i30 = i30;
                        str6 = str6;
                        iM6981 = (C2105.m6981("᩷ᩴ") ^ i27) * (-71);
                        bundle2 = bundleM10747;
                        i28 = ((iM6981 ^ i26) * (-23915)) ^ (-787838537);
                        i13 = -223914437;
                        i8 = iM6981 ^ i13;
                        i40 = i3;
                        strM28015 = str3;
                        i29 = i8;
                        bundle = bundle2;
                        str6 = str6;
                        i30 = i30;
                        i38 = i2;
                        bundle2 = bundle;
                    } else {
                        i16 = i38;
                        iM6982 = (C2105.m6981("᩻ۨ") + i27) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i17 = ((iM6982 ^ i26) * 6913) ^ 98918457;
                        i19 = 2087863439;
                        i29 = iM6982 ^ i19;
                        int i49 = i30;
                        i38 = i16;
                        i28 = i17;
                        i30 = i49;
                    }
                    break;
                case -734330556:
                case 1647441261:
                    str4 = strM28015;
                    i16 = i38;
                    i4 = i40;
                    i30 = i30;
                    iLastIndexOf = strM6309.lastIndexOf(41);
                    if (C5695.f17556 < 0) {
                        iM2568 = (C0630.m2566("ۗۘ") + i26) * (-3);
                        i17 = ((iM2568 ^ i27) * 25843) ^ (-622006442);
                        i18 = 822394557;
                        i40 = i4;
                        strM28015 = str4;
                        i29 = iM2568 ^ i18;
                        int i410 = i30;
                        i38 = i16;
                        i28 = i17;
                        i30 = i410;
                    } else {
                        str = strM40362;
                        s = s3;
                        Bundle bundle4 = bundle2;
                        i2 = i16;
                        strM7036 = str6;
                        bundle2 = bundle4;
                        int iM69815 = (C2105.m6981("֫֡") ^ i26) * (-35);
                        i15 = ((iM69815 ^ i27) * (-21155)) ^ (-362469533);
                        i40 = i4;
                        i30 = i30;
                        strM28015 = str4;
                        s3 = s;
                        i29 = iM69815 ^ 1238576394;
                        i38 = i2;
                        bundle2 = bundle2;
                        strM40362 = str;
                        str6 = strM7036;
                        i28 = i15;
                    }
                    break;
                case -710225452:
                case 90719095:
                    C0382.m1848();
                    iM6983 = C0630.m2566("᩵ܽ") ^ i27;
                    i15 = ((iM6983 ^ i26) * (-23755)) ^ 294465173;
                    i20 = -137451663;
                    i29 = iM6983 ^ i20;
                    i28 = i15;
                    break;
                case -441704353:
                case 1376646799:
                    if (C0798.m3000(strM40362, i32) == '\n') {
                        iM6983 = (C0630.m2566("ۘۖ") + i27) * 31;
                        i15 = ((iM6983 ^ i26) * 13677) ^ 844347021;
                        i20 = 1603554187;
                    } else {
                        i39 = i31;
                        iM6983 = (C2105.m6981("ۚ֡") + i26) * (-3);
                        i15 = ((iM6983 ^ i27) * (-14821)) ^ 1198229289;
                        i20 = -1726171679;
                    }
                    i29 = iM6983 ^ i20;
                    i28 = i15;
                    break;
                case -378570286:
                case -222532078:
                    str4 = strM28015;
                    Bundle bundle5 = bundle2;
                    int i50 = i38;
                    i4 = i40;
                    i30 = i30;
                    i2 = i50;
                    bundle2 = bundle5;
                    strM7036 = C2126.m7036(f50023, 9, 6, i4);
                    if (C7811.f24123 < 0) {
                        int iM69816 = (C2105.m6981("ۨ᩷") + i27) * (-51);
                        i40 = i4;
                        strM28015 = str4;
                        i29 = iM69816 ^ (-1805302199);
                        bundle = bundle2;
                        str6 = strM7036;
                        i28 = ((iM69816 ^ i26) * 10789) ^ 1116342601;
                        i30 = i30;
                        i38 = i2;
                        bundle2 = bundle;
                    } else {
                        str = strM40362;
                        s = s3;
                        int iM69817 = (C2105.m6981("֫֡") ^ i26) * (-35);
                        i15 = ((iM69817 ^ i27) * (-21155)) ^ (-362469533);
                        i40 = i4;
                        i30 = i30;
                        strM28015 = str4;
                        s3 = s;
                        i29 = iM69817 ^ 1238576394;
                        i38 = i2;
                        bundle2 = bundle2;
                        strM40362 = str;
                        str6 = strM7036;
                        i28 = i15;
                    }
                    break;
                case -310944406:
                case 1650132358:
                    i36 = iArr[i33];
                    i30 = iArr[i34];
                    if (i30 <= i36) {
                        iM6983 = (i27 - C2105.m6981("᩺ܰ")) * (-25);
                        i15 = ((iM6983 ^ i26) * 23137) ^ 1383861160;
                        i20 = 132089967;
                    } else {
                        iM6983 = (C2105.m6981("᩸۬") ^ i27) * (-61);
                        i15 = ((iM6983 ^ i26) * (-31267)) ^ 1805389314;
                        i20 = 239919611;
                    }
                    i29 = iM6983 ^ i20;
                    i28 = i15;
                    break;
                case -178267908:
                case 1604204159:
                    throw new Exception(C2958.m9035(strM4902, strM6309));
                case 46871963:
                case 648212316:
                    strM28015 = strM28015;
                    i9 = i40;
                    int i51 = i38;
                    i30 = i30;
                    str6 = str6;
                    bundle2 = bundle2;
                    i2 = i51;
                    int i52 = i23 + i24;
                    if ((i52 + i52) - i22 >= 0) {
                        iM2567 = (C0630.m2566("۬ܰ") + i26) * 23;
                        i10 = ((iM2567 ^ i27) * (-2643)) ^ 322632477;
                        i11 = -550929659;
                    } else {
                        iM2567 = C0630.m2566("֨ܺ") ^ i27;
                        i10 = ((iM2567 ^ i26) * 21937) ^ (-794001644);
                        i11 = -463647361;
                    }
                    i12 = iM2567 ^ i11;
                    i40 = i9;
                    strM28015 = strM28015;
                    i29 = i12;
                    i28 = i10;
                    bundle = bundle2;
                    str6 = str6;
                    i30 = i30;
                    i38 = i2;
                    bundle2 = bundle;
                    break;
                case 477722045:
                case 1695490733:
                    if (!C3663.f11553) {
                        i16 = i38;
                        iM6982 = (C2105.m6981("᩻ۨ") + i27) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i17 = ((iM6982 ^ i26) * 6913) ^ 98918457;
                        i19 = 2087863439;
                        i29 = iM6982 ^ i19;
                        int i411 = i30;
                        i38 = i16;
                        i28 = i17;
                        i30 = i411;
                    } else {
                        str = strM40362;
                        str2 = strM28015;
                        i = i40;
                        int i53 = i38;
                        i30 = i30;
                        str6 = str6;
                        bundle2 = bundle2;
                        i2 = i53;
                        iM2566 = (i26 - C0630.m2566("ۡܿ")) * 27;
                        i5 = ((iM2566 ^ i27) * 20529) ^ 1141481668;
                        i7 = -924154105;
                        i6 = iM2566 ^ i7;
                        i40 = i;
                        strM28015 = str2;
                        i29 = i6;
                        i28 = i5;
                        strM40362 = str;
                        bundle = bundle2;
                        str6 = str6;
                        i30 = i30;
                        i38 = i2;
                        bundle2 = bundle;
                    }
                    break;
                case 479478239:
                case 2118070650:
                    if (i32 < i36) {
                        iM6983 = C2105.m6981("֡ܶ") ^ i27;
                        i15 = ((iM6983 ^ i26) * (-4137)) ^ 124264197;
                        i20 = 870813335;
                    } else {
                        iM6983 = C2105.m6981("ܿ۟") ^ i26;
                        i15 = ((iM6983 ^ i27) * 16423) ^ 977242804;
                        i20 = 548346013;
                    }
                    i29 = iM6983 ^ i20;
                    i28 = i15;
                    break;
                case 548997533:
                case 1180723797:
                    C0382.m1848();
                    if (C0050.m940() <= 0) {
                        strM28015 = strM28015;
                        i9 = i40;
                        int i54 = i38;
                        i30 = i30;
                        str6 = str6;
                        bundle2 = bundle2;
                        i2 = i54;
                        iM2567 = (C0630.m2566("ܰۙ") + i26) * 37;
                        i10 = ((iM2567 ^ i27) * (-2425)) ^ 1985359900;
                        i11 = 1225508563;
                        i12 = iM2567 ^ i11;
                        i40 = i9;
                        strM28015 = strM28015;
                        i29 = i12;
                        i28 = i10;
                        bundle = bundle2;
                        str6 = str6;
                        i30 = i30;
                        i38 = i2;
                        bundle2 = bundle;
                    } else {
                        iM6983 = C0630.m2566("᩵ܽ") ^ i27;
                        i15 = ((iM6983 ^ i26) * (-23755)) ^ 294465173;
                        i20 = -137451663;
                        i29 = iM6983 ^ i20;
                        i28 = i15;
                    }
                    break;
                case 651876502:
                case 1428301438:
                    str = strM40362;
                    str2 = strM28015;
                    i = i40;
                    int i55 = i38;
                    i30 = i30;
                    str6 = str6;
                    bundle2 = bundle2;
                    i2 = i55;
                    s3 = sArr[c];
                    if (C4075.f12947 >= 0) {
                        iM2566 = (i26 - C0630.m2566("ۡܿ")) * 27;
                        i5 = ((iM2566 ^ i27) * 20529) ^ 1141481668;
                        i7 = -924154105;
                    } else {
                        iM2566 = (i27 - C0630.m2566("۟᩶")) * 13;
                        i5 = ((iM2566 ^ i26) * 401) ^ 1674841763;
                        i7 = -866725467;
                    }
                    i6 = iM2566 ^ i7;
                    i40 = i;
                    strM28015 = str2;
                    i29 = i6;
                    i28 = i5;
                    strM40362 = str;
                    bundle = bundle2;
                    str6 = str6;
                    i30 = i30;
                    i38 = i2;
                    bundle2 = bundle;
                    break;
                case 906386476:
                case 2008894798:
                    return null;
                case 919714148:
                case 2007305672:
                    int i56 = i37;
                    i16 = i38;
                    i30 = i30;
                    if (iLastIndexOf == i56) {
                        i37 = i56;
                        str4 = strM28015;
                        i4 = i40;
                        iM2568 = (i26 - C0630.m2566("᩺᩹")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i17 = ((iM2568 ^ i27) * 26699) ^ (-285725246);
                        i18 = -1924807356;
                        i40 = i4;
                        strM28015 = str4;
                        i29 = iM2568 ^ i18;
                        int i412 = i30;
                        i38 = i16;
                        i28 = i17;
                        i30 = i412;
                    } else {
                        int iM69818 = (C2105.m6981("۟ܽ") ^ i26) * (-23);
                        i37 = i56;
                        i15 = ((iM69818 ^ i27) * (-5899)) ^ 1864018736;
                        i29 = iM69818 ^ (-1259182828);
                        i30 = i30;
                        i38 = i16;
                        i28 = i15;
                    }
                    break;
                case 1811937931:
                case 1993066847:
                    i32++;
                    i31 = i39;
                    iM6983 = C0630.m2566("ܺܶ") ^ i26;
                    i15 = ((iM6983 ^ i27) * 18319) ^ 145117507;
                    i20 = -784899987;
                    i29 = iM6983 ^ i20;
                    i28 = i15;
                    break;
                default:
                    str = strM40362;
                    str5 = strM28015;
                    s2 = s3;
                    i14 = i40;
                    int i57 = i38;
                    i30 = i30;
                    str6 = str6;
                    bundle2 = bundle2;
                    i2 = i57;
                    int i58 = s2 + 7474;
                    if (C0050.f910 < 0) {
                        int iM25611 = (C0630.m2566("ܰ֨") + i27) * (-69);
                        i28 = ((iM25611 ^ i26) * 4305) ^ (-1674505599);
                        i8 = iM25611 ^ 1108136955;
                        i21 = i58;
                        i40 = i14;
                        strM28015 = str5;
                        strM40362 = str;
                        s3 = s2;
                        i29 = i8;
                        bundle = bundle2;
                        str6 = str6;
                        i30 = i30;
                        i38 = i2;
                        bundle2 = bundle;
                    } else {
                        i21 = i58;
                        int iM69819 = C2105.m6981("ۨۚ") ^ i26;
                        s3 = s2;
                        i28 = ((iM69819 ^ i27) * 17215) ^ 1122813596;
                        i40 = i14;
                        strM28015 = str5;
                        i29 = iM69819 ^ (-1284432028);
                        strM40362 = str;
                        bundle = bundle2;
                        str6 = str6;
                        i30 = i30;
                        i38 = i2;
                        bundle2 = bundle;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onSaveInstanceState(Bundle bundle) {
        InterfaceC18581 interfaceC18581Mo17431 = null;
        int i = 448549709;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C11340.f33930;
        int iM6981 = C2105.m6981("֡᩵") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-21259)) ^ (-221651929);
        int i5 = -979217462;
        while (true) {
            i = ((((i ^ i2) * 2957) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1970390388:
                case 1744523041:
                    break;
                case -1969071358:
                case -732683624:
                    if (C0630.f2410 <= 0) {
                        iM6981 = C2105.m6981("ܿ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10929)) ^ 1774913965;
                        i5 = -1716748708;
                    } else {
                        iM6981 = (i3 - C2105.m6981("۠ۖ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM6981 ^ i2) * (-6867)) ^ (-1361653676);
                        i5 = 1284701669;
                    }
                    break;
                case -1750549290:
                case 1080748824:
                    C9212 c9212 = (C9212) interfaceC18581Mo17431;
                    c9212.mo9498();
                    c9212.mo9497();
                    iM6981 = (C0630.m2566("֨֨") + i3) * (-69);
                    i4 = ((iM6981 ^ i2) * (-28211)) ^ 1057134186;
                    i5 = -1215697675;
                    break;
                case -1732808914:
                case 294173698:
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("ۢۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 11251) ^ (-1450298888);
                        i5 = 109899560;
                    } else {
                        iM6981 = (C2105.m6981("ۜᩳ") ^ i2) * 35;
                        i4 = ((iM6981 ^ i3) * (-15801)) ^ (-655957368);
                        i5 = -1222505185;
                    }
                    break;
                case -1633310998:
                case -358038525:
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C2105.m6981("۬ۗ") ^ i3) * (-11);
                        i4 = ((iM6981 ^ i2) * 28737) ^ 463608643;
                        i5 = 271703266;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۟ۡ")) * (-79);
                        i4 = ((iM6981 ^ i3) * (-10293)) ^ 1299878621;
                        i5 = -81195796;
                    }
                    break;
                case -1468351842:
                case 1306122351:
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C2105.m6981("۬ۗ") ^ i3) * (-11);
                        i4 = ((iM6981 ^ i2) * 28737) ^ 463608643;
                        i5 = 271703266;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۛۗ")) * 75;
                        i4 = ((iM6981 ^ i2) * (-18937)) ^ (-1190510945);
                        i5 = 1548338740;
                    }
                    break;
                case -1315878582:
                case 660123364:
                    if (C3663.f11553) {
                        iM6981 = C0630.m2566("ۢۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 11251) ^ (-1450298888);
                        i5 = 109899560;
                    } else {
                        iM6981 = C2105.m6981("ۜۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 30431) ^ 905975214;
                        i5 = 1364957882;
                    }
                    break;
                case -1157834551:
                case -246194013:
                    C0483.m2121();
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C2105.m6981("᩻֨") + i2) * 101;
                        i4 = ((iM6981 ^ i3) * 673) ^ (-4139871);
                        i5 = 815363258;
                    } else {
                        iM6981 = C0630.m2566("ۢۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 11251) ^ (-1450298888);
                        i5 = 109899560;
                    }
                    break;
                case -1097305558:
                case 1951464596:
                    super.onSaveInstanceState(bundle);
                    interfaceC18581Mo17431 = mo17431();
                    if (interfaceC18581Mo17431 != null) {
                        iM6981 = C2105.m6981("֨֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29837)) ^ (-1705979784);
                        i5 = -1014256616;
                    } else {
                        iM6981 = (C0630.m2566("֨֨") + i3) * (-69);
                        i4 = ((iM6981 ^ i2) * (-28211)) ^ 1057134186;
                        i5 = -1215697675;
                    }
                    break;
                case -846250518:
                case 1262939345:
                    C3432.m10477();
                    if (!C0422.m1963()) {
                        iM6981 = C0630.m2566("ۢۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 11251) ^ (-1450298888);
                        i5 = 109899560;
                    } else {
                        iM6981 = (C0630.m2566("ܳۛ") ^ i3) * 53;
                        i4 = ((iM6981 ^ i2) * (-22105)) ^ (-574759185);
                        i5 = 495624039;
                    }
                    break;
                case -760867805:
                case 1624005679:
                    C0050.m940();
                    break;
                case -754381162:
                case -233381215:
                    RunnableC1937.m6387();
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("ܿ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10929)) ^ 1774913965;
                        i5 = -1716748708;
                    } else {
                        iM6981 = (C0630.m2566("ܳۛ") ^ i3) * 53;
                        i4 = ((iM6981 ^ i2) * (-22105)) ^ (-574759185);
                        i5 = 495624039;
                    }
                    break;
                case -443690890:
                case 91809035:
                    if (C1504.f5354) {
                        iM6981 = (C0630.m2566("ܳۛ") ^ i3) * 53;
                        i4 = ((iM6981 ^ i2) * (-22105)) ^ (-574759185);
                        i5 = 495624039;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27227) ^ (-2052055760);
                        i5 = -699206563;
                    }
                    break;
                case -310442240:
                case 41434597:
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C2105.m6981("᩻֨") + i2) * 101;
                        i4 = ((iM6981 ^ i3) * 673) ^ (-4139871);
                        i5 = 815363258;
                    } else {
                        iM6981 = C0630.m2566("۫᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1267)) ^ 718968904;
                        i5 = 421395951;
                    }
                    break;
                case -227729111:
                case 1234657671:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C0630.m2566("ܳۛ") ^ i3) * 53;
                        i4 = ((iM6981 ^ i2) * (-22105)) ^ (-574759185);
                        i5 = 495624039;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۠۬")) * 45;
                        i4 = ((iM6981 ^ i3) * 13099) ^ (-329679392);
                        i5 = 1650955537;
                    }
                    break;
                case 63739886:
                case 1794053671:
                    C1504.m5179();
                    iM6981 = C0630.m2566("ۢۙ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 11251) ^ (-1450298888);
                    i5 = 109899560;
                    break;
                case 919820511:
                case 1295952182:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("ۢۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 11251) ^ (-1450298888);
                        i5 = 109899560;
                    } else {
                        iM6981 = C0630.m2566("ܰ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-10115)) ^ 1467019303;
                        i5 = 1586005364;
                    }
                    break;
                default:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C0630.m2566("ۢۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 11251) ^ (-1450298888);
                        i5 = 109899560;
                    } else {
                        iM6981 = C2105.m6981("᩸ۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32645)) ^ (-1104741637);
                        i5 = 1706579218;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.ComponentCallbacksC9205
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int i;
        String str;
        int i2;
        String str2;
        int i3;
        String str3;
        String strM9031;
        int iM2566;
        int i4;
        int i5;
        short[] sArr;
        int iM6981;
        int i6;
        int i7;
        int iM2567;
        int i8;
        int i9;
        int i10;
        short[] sArr2;
        int i11;
        String str4;
        String str5;
        String str6;
        int i12;
        int i13;
        StringBuilder sb;
        short[] sArr3;
        int i14;
        int i15;
        int i16;
        StringBuilder sb2;
        int iM6982;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        String str7;
        String str8;
        short[] sArr4;
        String str9;
        String strM12812;
        int iM2568;
        String str10;
        int i22;
        int i23;
        String str11;
        int i24;
        int i25;
        String str12;
        String strM28015;
        int iM6983;
        int i26;
        int i27;
        int i28 = -616466832;
        int i29 = C1294.f4556;
        int i30 = C1128.f4106;
        int iM2569 = C0630.m2566("᩵ۚ") ^ i29;
        int i31 = ((iM2569 ^ i30) * 22599) ^ 799332470;
        int i32 = iM2569 ^ 1394736681;
        StringBuilder sb3 = null;
        String str13 = null;
        String strM12813 = null;
        String str14 = null;
        String[] strArr = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i33 = 0;
        int i34 = 0;
        boolean z = false;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        short s = 0;
        short s2 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        C9918 c9918 = null;
        String strMo14422 = null;
        String str15 = null;
        String strM3841 = null;
        String strM14172 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        C6273 c6273 = null;
        int i46 = 0;
        while (true) {
            i28 = i32 ^ (i31 & (((i28 ^ i30) * (-7571)) >> 31));
            switch (i28) {
                case -2030846016:
                case 968619056:
                    str11 = str14;
                    strM14172 = C4860.m14172(strM3841, str11, C3019.m9250(sArr11, i34, 4, i35));
                    sArr8 = f50023;
                    i43 = 100;
                    if (C1420.m4913()) {
                        i = i34;
                        i36 = 3;
                        str = str11;
                        int i47 = i40;
                        i16 = i44;
                        i15 = i47;
                        short[] sArr12 = sArr6;
                        strMo14422 = strMo14422;
                        sArr = sArr12;
                        int iM25610 = (C0630.m2566("ۡ۟") ^ i29) * (-27);
                        StringBuilder sb4 = sb3;
                        i31 = ((iM25610 ^ i30) * 4189) ^ 186502747;
                        c9918 = c9918;
                        i33 = i33;
                        str14 = str;
                        str15 = str15;
                        str13 = str13;
                        i42 = i42;
                        i34 = i;
                        i32 = iM25610 ^ (-1481232717);
                        i39 = i39;
                        z = z;
                        sb3 = sb4;
                        int i48 = i16;
                        i40 = i15;
                        i44 = i48;
                        String str16 = strMo14422;
                        sArr6 = sArr;
                        strMo14422 = str16;
                    } else {
                        int iM6984 = C2105.m6981("ۙܰ") ^ i29;
                        i32 = iM6984 ^ (-417026700);
                        str14 = str11;
                        i31 = ((iM6984 ^ i30) * 14497) ^ 569079634;
                        i36 = 3;
                    }
                    break;
                case -1981238428:
                case -557002289:
                    i2 = i34;
                    String str17 = str15;
                    str2 = str14;
                    i3 = i33;
                    strMo14422 = mo14422();
                    str3 = str17;
                    strM9031 = C2958.m9031(f50023, 71, 11, i35);
                    sArr6 = f50023;
                    if (C0630.f2410 <= 0) {
                        iM2566 = C0630.m2566("ۘ᩺") ^ i29;
                        i4 = ((iM2566 ^ i30) * (-24157)) ^ (-543799354);
                        i5 = 1186701404;
                    } else {
                        iM2566 = (C0630.m2566("֡ۛ") + i30) * 75;
                        i4 = ((iM2566 ^ i29) * (-28083)) ^ 72294780;
                        i5 = 1479470600;
                    }
                    i31 = i4;
                    String str18 = str3;
                    str13 = strM9031;
                    i33 = i3;
                    str14 = str2;
                    str15 = str18;
                    int i49 = i2;
                    i32 = iM2566 ^ i5;
                    i34 = i49;
                    break;
                case -1934026231:
                case 2079769630:
                    C11340.m28031();
                    if (C3432.f10845 >= 0) {
                        i20 = i34;
                        str8 = strMo14422;
                        str9 = str13;
                        sArr4 = sArr6;
                        String str19 = str14;
                        i21 = i33;
                        strM12812 = str15;
                        str7 = str19;
                        iM2568 = (i29 - C0630.m2566("ܽۜ")) * (-107);
                        str10 = strM12812;
                        i22 = ((iM2568 ^ i30) * (-21101)) ^ 1084023805;
                        i23 = 1502678283;
                        i31 = i22;
                        i33 = i21;
                        str14 = str7;
                        str15 = str10;
                        sArr6 = sArr4;
                        strMo14422 = str8;
                        i34 = i20;
                        i32 = iM2568 ^ i23;
                        str13 = str9;
                    } else {
                        i34 = i34;
                        sArr10 = sArr10;
                        i42 = i42;
                        str13 = str13;
                        str15 = str15;
                        str14 = str14;
                        i33 = i33;
                        i36 = i36;
                        sb3 = sb3;
                        sArr5 = sArr5;
                        c9918 = c9918;
                        z = z;
                        short[] sArr13 = sArr6;
                        strMo14422 = strMo14422;
                        sArr = sArr13;
                        iM6981 = C2105.m6981("᩷ۢ") ^ i30;
                        i6 = ((iM6981 ^ i29) * 4589) ^ (-1328441080);
                        i7 = 1468887139;
                        i19 = iM6981 ^ i7;
                        i31 = i6;
                        z = z;
                        sb3 = sb3;
                        c9918 = c9918;
                        i42 = i42;
                        sArr5 = sArr5;
                        i36 = i36;
                        i34 = i34;
                        sArr10 = sArr10;
                        i32 = i19;
                        i33 = i33;
                        str14 = str14;
                        str15 = str15;
                        str13 = str13;
                        String str20 = strMo14422;
                        sArr6 = sArr;
                        strMo14422 = str20;
                    }
                    break;
                case -1909617065:
                case 348735830:
                    RunnableC0588.m2441();
                    i34 = i34;
                    sArr10 = sArr10;
                    i42 = i42;
                    str13 = str13;
                    str15 = str15;
                    str14 = str14;
                    i33 = i33;
                    i36 = i36;
                    sb3 = sb3;
                    sArr5 = sArr5;
                    c9918 = c9918;
                    z = z;
                    short[] sArr14 = sArr6;
                    strMo14422 = strMo14422;
                    sArr = sArr14;
                    iM6981 = C2105.m6981("᩷ۢ") ^ i30;
                    i6 = ((iM6981 ^ i29) * 4589) ^ (-1328441080);
                    i7 = 1468887139;
                    i19 = iM6981 ^ i7;
                    i31 = i6;
                    z = z;
                    sb3 = sb3;
                    c9918 = c9918;
                    i42 = i42;
                    sArr5 = sArr5;
                    i36 = i36;
                    i34 = i34;
                    sArr10 = sArr10;
                    i32 = i19;
                    i33 = i33;
                    str14 = str14;
                    str15 = str15;
                    str13 = str13;
                    String str21 = strMo14422;
                    sArr6 = sArr;
                    strMo14422 = str21;
                    break;
                case -1802473642:
                case 376271245:
                    sArr = sArr6;
                    i35 = 53517;
                    iM6981 = C0630.m2566("᩸ۧ") ^ i29;
                    i6 = ((iM6981 ^ i30) * (-25359)) ^ (-1253368331);
                    i7 = 353794352;
                    i19 = iM6981 ^ i7;
                    i31 = i6;
                    z = z;
                    sb3 = sb3;
                    c9918 = c9918;
                    i42 = i42;
                    sArr5 = sArr5;
                    i36 = i36;
                    i34 = i34;
                    sArr10 = sArr10;
                    i32 = i19;
                    i33 = i33;
                    str14 = str14;
                    str15 = str15;
                    str13 = str13;
                    String str22 = strMo14422;
                    sArr6 = sArr;
                    strMo14422 = str22;
                    break;
                case -1671114381:
                case -612860630:
                    i34 = i34;
                    sArr10 = sArr10;
                    i42 = i42;
                    str13 = str13;
                    str15 = str15;
                    str14 = str14;
                    i33 = i33;
                    i36 = i36;
                    sb3 = sb3;
                    sArr5 = sArr5;
                    z = z;
                    short[] sArr15 = sArr6;
                    strMo14422 = strMo14422;
                    sArr = sArr15;
                    c9918 = c9918;
                    if (i42 == (C0630.m2566(C3683.m11225(f50023, 61, 3, i35)) ^ 2128510098)) {
                        iM6981 = (C2105.m6981("᩷֡") + i29) * 71;
                        i6 = ((iM6981 ^ i30) * 27927) ^ (-914338906);
                        i7 = 94842327;
                    } else {
                        iM6981 = C0630.m2566("᩸֨") ^ i30;
                        i6 = ((iM6981 ^ i29) * 17235) ^ (-1061663863);
                        i7 = -1788828508;
                    }
                    i19 = iM6981 ^ i7;
                    i31 = i6;
                    z = z;
                    sb3 = sb3;
                    c9918 = c9918;
                    i42 = i42;
                    sArr5 = sArr5;
                    i36 = i36;
                    i34 = i34;
                    sArr10 = sArr10;
                    i32 = i19;
                    i33 = i33;
                    str14 = str14;
                    str15 = str15;
                    str13 = str13;
                    String str23 = strMo14422;
                    sArr6 = sArr;
                    strMo14422 = str23;
                    break;
                case -1647902396:
                case -1204291057:
                    if (C0630.f2410 > 0) {
                        i = i34;
                        i42 = i42;
                        str13 = str13;
                        str15 = str15;
                        str = str14;
                        i33 = i33;
                        sb3 = sb3;
                        int i410 = i40;
                        i16 = i44;
                        i15 = i410;
                        short[] sArr16 = sArr6;
                        strMo14422 = strMo14422;
                        sArr = sArr16;
                        int iM25611 = (C0630.m2566("ۡ۟") ^ i29) * (-27);
                        StringBuilder sb5 = sb3;
                        i31 = ((iM25611 ^ i30) * 4189) ^ 186502747;
                        c9918 = c9918;
                        i33 = i33;
                        str14 = str;
                        str15 = str15;
                        str13 = str13;
                        i42 = i42;
                        i34 = i;
                        i32 = iM25611 ^ (-1481232717);
                        i39 = i39;
                        z = z;
                        sb3 = sb5;
                        int i411 = i16;
                        i40 = i15;
                        i44 = i411;
                        String str110 = strMo14422;
                        sArr6 = sArr;
                        strMo14422 = str110;
                    } else {
                        i2 = i34;
                        String str24 = str14;
                        i3 = i33;
                        strM9031 = str13;
                        str3 = str15;
                        str2 = str24;
                        iM2566 = C0630.m2566("ۘ᩺") ^ i29;
                        i4 = ((iM2566 ^ i30) * (-24157)) ^ (-543799354);
                        i5 = 1186701404;
                        i31 = i4;
                        String str111 = str3;
                        str13 = strM9031;
                        i33 = i3;
                        str14 = str2;
                        str15 = str111;
                        int i412 = i2;
                        i32 = iM2566 ^ i5;
                        i34 = i412;
                    }
                    break;
                case -1647415955:
                case 1813137510:
                    i = i34;
                    i15 = i40;
                    i42 = i42;
                    str13 = str13;
                    str15 = str15;
                    str = str14;
                    c9918 = c9918;
                    i33 = i33;
                    short[] sArr17 = sArr6;
                    strMo14422 = strMo14422;
                    sArr = sArr17;
                    c9918.m31276(2);
                    sb3 = new StringBuilder();
                    z = z;
                    i39 = i39;
                    C0422.m1944(sb3, i39);
                    sArr10 = f50023;
                    i41 = 67;
                    i45 = 1;
                    if (!C2126.f7087) {
                        int iM25612 = C0630.m2566("ۢܺ") ^ i30;
                        i31 = ((iM25612 ^ i29) * 1567) ^ (-1145765762);
                        c9918 = c9918;
                        i40 = i15;
                        i33 = i33;
                        i44 = 2;
                        str14 = str;
                        str15 = str15;
                        str13 = str13;
                        sb2 = sb3;
                        i42 = i42;
                        i34 = i;
                        i32 = iM25612 ^ (-354485803);
                        i39 = i39;
                        z = z;
                        sb3 = sb2;
                        String str25 = strMo14422;
                        sArr6 = sArr;
                        strMo14422 = str25;
                    } else {
                        i16 = 2;
                        int iM25613 = (C0630.m2566("ۡ۟") ^ i29) * (-27);
                        StringBuilder sb6 = sb3;
                        i31 = ((iM25613 ^ i30) * 4189) ^ 186502747;
                        c9918 = c9918;
                        i33 = i33;
                        str14 = str;
                        str15 = str15;
                        str13 = str13;
                        i42 = i42;
                        i34 = i;
                        i32 = iM25613 ^ (-1481232717);
                        i39 = i39;
                        z = z;
                        sb3 = sb6;
                        int i413 = i16;
                        i40 = i15;
                        i44 = i413;
                        String str112 = strMo14422;
                        sArr6 = sArr;
                        strMo14422 = str112;
                    }
                    break;
                case -1645766308:
                case -1199743812:
                    int i50 = i34;
                    String str26 = strMo14422;
                    String str27 = str13;
                    sArr = sArr6;
                    str15 = str15;
                    str14 = str14;
                    i33 = i33;
                    strMo14422 = str26;
                    str13 = str27;
                    int i51 = i42;
                    if (i51 == (C0630.m2566(C3663.m11162(f50023, 68, 3, i35)) ^ 2103603824)) {
                        iM6982 = (C2105.m6981("᩻ۜ") ^ i30) * (-23);
                        i17 = ((iM6982 ^ i29) * 1743) ^ 962449542;
                        i18 = -1868762751;
                    } else {
                        iM6982 = (C2105.m6981("ܿܺ") + i30) * (-103);
                        i17 = ((iM6982 ^ i29) * 12431) ^ 228811182;
                        i18 = -1363748306;
                    }
                    i19 = iM6982 ^ i18;
                    i42 = i51;
                    i31 = i17;
                    i34 = i50;
                    i32 = i19;
                    i33 = i33;
                    str14 = str14;
                    str15 = str15;
                    str13 = str13;
                    String str28 = strMo14422;
                    sArr6 = sArr;
                    strMo14422 = str28;
                    break;
                case -1616489283:
                case 1834905751:
                    str11 = str14;
                    i24 = i33;
                    i25 = i34;
                    str12 = str15;
                    strM12813 = C4263.m12812(str12, C0237.m1483(sArr7, 83, 2, i35), C2520.m8030(f50023, 85, 1, i35));
                    if (C0798.m3007(strM12813) <= 50) {
                        strM28015 = strM12813;
                        i46 = 50;
                        int iM25614 = (C0630.m2566("ۨ᩶") + i29) * 23;
                        String str29 = strM28015;
                        i31 = ((iM25614 ^ i30) * 26237) ^ 701364534;
                        i33 = i24;
                        str14 = str29;
                        str15 = str12;
                        i34 = i25;
                        i32 = iM25614 ^ (-1510637626);
                    } else {
                        int iM25615 = (C0630.m2566("ۡܰ") + i30) * 115;
                        str15 = str12;
                        i31 = ((iM25615 ^ i29) * 22929) ^ 1178460116;
                        i34 = i25;
                        i46 = 50;
                        i32 = iM25615 ^ 41713574;
                        i33 = i24;
                        str14 = str11;
                    }
                    break;
                case -1591592848:
                case -374081323:
                    if (C1047.f3863 >= 0) {
                        iM6983 = C2105.m6981("֨ۖ") ^ i30;
                        i26 = ((iM6983 ^ i29) * 16443) ^ 1752617512;
                        i27 = 1936881144;
                        i32 = iM6983 ^ i27;
                        i31 = i26;
                    } else {
                        i34 = i34;
                        sArr10 = sArr10;
                        i42 = i42;
                        str13 = str13;
                        str15 = str15;
                        str14 = str14;
                        i33 = i33;
                        i36 = i36;
                        sb3 = sb3;
                        sArr5 = sArr5;
                        c9918 = c9918;
                        z = z;
                        short[] sArr18 = sArr6;
                        strMo14422 = strMo14422;
                        sArr = sArr18;
                        iM6981 = C2105.m6981("᩷ۢ") ^ i30;
                        i6 = ((iM6981 ^ i29) * 4589) ^ (-1328441080);
                        i7 = 1468887139;
                        i19 = iM6981 ^ i7;
                        i31 = i6;
                        z = z;
                        sb3 = sb3;
                        c9918 = c9918;
                        i42 = i42;
                        sArr5 = sArr5;
                        i36 = i36;
                        i34 = i34;
                        sArr10 = sArr10;
                        i32 = i19;
                        i33 = i33;
                        str14 = str14;
                        str15 = str15;
                        str13 = str13;
                        String str210 = strMo14422;
                        sArr6 = sArr;
                        strMo14422 = str210;
                    }
                    break;
                case -1554754483:
                case -1172441996:
                    i34 = i34;
                    sArr10 = sArr10;
                    i42 = i42;
                    str13 = str13;
                    str15 = str15;
                    str14 = str14;
                    i33 = i33;
                    i36 = i36;
                    sb3 = sb3;
                    sArr5 = sArr5;
                    c9918 = c9918;
                    z = z;
                    short[] sArr19 = sArr6;
                    strMo14422 = strMo14422;
                    sArr = sArr19;
                    if (this.f50032) {
                        iM6981 = (C2105.m6981("ܽ᩷") + i29) * (-105);
                        i6 = ((iM6981 ^ i30) * 16693) ^ (-1194851816);
                        i7 = -1661783854;
                    } else {
                        iM6981 = C2105.m6981("ۤۡ") ^ i30;
                        i6 = ((iM6981 ^ i29) * 24179) ^ (-195670415);
                        i7 = 1482185673;
                    }
                    i19 = iM6981 ^ i7;
                    i31 = i6;
                    z = z;
                    sb3 = sb3;
                    c9918 = c9918;
                    i42 = i42;
                    sArr5 = sArr5;
                    i36 = i36;
                    i34 = i34;
                    sArr10 = sArr10;
                    i32 = i19;
                    i33 = i33;
                    str14 = str14;
                    str15 = str15;
                    str13 = str13;
                    String str211 = strMo14422;
                    sArr6 = sArr;
                    strMo14422 = str211;
                    break;
                case -1506532618:
                case -481790928:
                    C6273.m17282(c6273, C2105.m6981(C1128.m3841(sArr9, i37, i33, i35)) ^ 2098126554, (String) null, strM14172, strArr, i38);
                    return z;
                case -1443539935:
                case -972173298:
                    return super.onOptionsItemSelected(menuItem);
                case -1421514064:
                case -1372934608:
                    mo17428((ActivityC17169) RunnableC0588.m2429(this));
                    return z;
                case -1345081688:
                case -1251531999:
                    C0964.m3402(new C21207(this));
                    return z;
                case -774964461:
                case -151208519:
                    i24 = i33;
                    strM28015 = C11340.m28015(strM12813, 0, i46);
                    i25 = i34;
                    str12 = str15;
                    int iM25616 = (C0630.m2566("ۨ᩶") + i29) * 23;
                    String str212 = strM28015;
                    i31 = ((iM25616 ^ i30) * 26237) ^ 701364534;
                    i33 = i24;
                    str14 = str212;
                    str15 = str12;
                    i34 = i25;
                    i32 = iM25616 ^ (-1510637626);
                    break;
                case -698734143:
                case 1797645891:
                    return z;
                case -661969412:
                case 766173914:
                    C1128.m3851();
                    if (!C2520.m8026()) {
                        i2 = i34;
                        String str213 = str14;
                        i3 = i33;
                        strM9031 = str13;
                        str3 = str15;
                        str2 = str213;
                        iM2566 = C0630.m2566("ۘ᩺") ^ i29;
                        i4 = ((iM2566 ^ i30) * (-24157)) ^ (-543799354);
                        i5 = 1186701404;
                        i31 = i4;
                        String str113 = str3;
                        str13 = strM9031;
                        i33 = i3;
                        str14 = str2;
                        str15 = str113;
                        int i414 = i2;
                        i32 = iM2566 ^ i5;
                        i34 = i414;
                    } else {
                        iM6983 = C2105.m6981("֨ۖ") ^ i30;
                        i26 = ((iM6983 ^ i29) * 16443) ^ 1752617512;
                        i27 = 1936881144;
                        i32 = iM6983 ^ i27;
                        i31 = i26;
                    }
                    break;
                case -636903129:
                case -183997419:
                    i10 = i34;
                    sArr2 = sArr10;
                    i11 = i42;
                    str4 = str13;
                    str5 = str15;
                    str6 = str14;
                    i12 = i33;
                    sb = sb3;
                    C9918 c9919 = c9918;
                    z = z;
                    short[] sArr20 = sArr6;
                    strMo14422 = strMo14422;
                    sArr = sArr20;
                    i13 = i36;
                    sArr3 = sArr5;
                    c9919.m31258(C0630.m2566(C1047.m3603(sArr3, 64, 3, i35)) ^ 2098096484);
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        sArr5 = sArr3;
                        i33 = i12;
                        int iM25617 = C0630.m2566("ۨۚ") ^ i30;
                        int i52 = ((iM25617 ^ i29) * 2035) ^ (-994704024);
                        i14 = iM25617 ^ (-1790715266);
                        i31 = i52;
                        i36 = i13;
                        str14 = str6;
                        sArr10 = sArr2;
                        c9918 = null;
                    } else {
                        int iM6985 = (C2105.m6981("۫ۡ") ^ i30) * (-85);
                        int i53 = ((iM6985 ^ i29) * 31911) ^ 132971276;
                        i14 = iM6985 ^ 1206985196;
                        c9918 = c9919;
                        i31 = i53;
                        sArr5 = sArr3;
                        i36 = i13;
                        i33 = i12;
                        sArr10 = sArr2;
                        str14 = str6;
                    }
                    str15 = str5;
                    str13 = str4;
                    sb2 = sb;
                    i42 = i11;
                    i34 = i10;
                    i32 = i14;
                    z = z;
                    sb3 = sb2;
                    String str214 = strMo14422;
                    sArr6 = sArr;
                    strMo14422 = str214;
                    break;
                case -526166326:
                case 687644275:
                    i34 = i34;
                    sArr10 = sArr10;
                    i42 = i42;
                    str13 = str13;
                    str15 = str15;
                    str14 = str14;
                    i33 = i33;
                    i36 = i36;
                    sb3 = sb3;
                    sArr5 = sArr5;
                    c9918 = c9918;
                    z = z;
                    short[] sArr21 = sArr6;
                    strMo14422 = strMo14422;
                    sArr = sArr21;
                    if (((s * s) + 397085329) - (s * s2) >= 0) {
                        iM6981 = (C2105.m6981("۬ۛ") + i29) * (-81);
                        i6 = ((iM6981 ^ i30) * (-913)) ^ (-1569590762);
                        i7 = -1270115500;
                    } else {
                        iM6981 = C2105.m6981("ۢܿ") ^ i30;
                        i6 = ((iM6981 ^ i29) * 32115) ^ 1467394881;
                        i7 = -1676364797;
                    }
                    i19 = iM6981 ^ i7;
                    i31 = i6;
                    z = z;
                    sb3 = sb3;
                    c9918 = c9918;
                    i42 = i42;
                    sArr5 = sArr5;
                    i36 = i36;
                    i34 = i34;
                    sArr10 = sArr10;
                    i32 = i19;
                    i33 = i33;
                    str14 = str14;
                    str15 = str15;
                    str13 = str13;
                    String str215 = strMo14422;
                    sArr6 = sArr;
                    strMo14422 = str215;
                    break;
                case -391268869:
                case 651003646:
                    i20 = i34;
                    String str30 = str14;
                    i21 = i33;
                    str7 = str30;
                    short[] sArr22 = sArr6;
                    String strM11225 = C3683.m11225(sArr22, 82, 1, i35);
                    str8 = strMo14422;
                    sArr4 = sArr22;
                    str9 = str13;
                    strM12812 = C4263.m12812(str8, str9, strM11225);
                    sArr7 = f50023;
                    if (AbstractC2021.f6743 <= 0) {
                        iM2568 = (i29 - C0630.m2566("ܽۜ")) * (-107);
                        str10 = strM12812;
                        i22 = ((iM2568 ^ i30) * (-21101)) ^ 1084023805;
                        i23 = 1502678283;
                    } else {
                        iM2568 = C0630.m2566("ۖ᩹") ^ i29;
                        str10 = strM12812;
                        i22 = ((iM2568 ^ i30) * 16285) ^ (-1100008022);
                        i23 = 816712949;
                    }
                    i31 = i22;
                    i33 = i21;
                    str14 = str7;
                    str15 = str10;
                    sArr6 = sArr4;
                    strMo14422 = str8;
                    i34 = i20;
                    i32 = iM2568 ^ i23;
                    str13 = str9;
                    break;
                case -271031906:
                case 938139761:
                    i34 = i34;
                    sArr10 = sArr10;
                    i42 = i42;
                    str13 = str13;
                    str15 = str15;
                    str14 = str14;
                    i33 = i33;
                    i36 = i36;
                    sb3 = sb3;
                    sArr5 = sArr5;
                    c9918 = c9918;
                    z = z;
                    short[] sArr23 = sArr6;
                    strMo14422 = strMo14422;
                    sArr = sArr23;
                    if (this.f50024) {
                        iM6981 = C2105.m6981("֫ܰ") ^ i29;
                        i6 = ((iM6981 ^ i30) * 5319) ^ 886136867;
                        i7 = 443491311;
                    } else {
                        iM6981 = (C0630.m2566("۬֨") + i29) * 89;
                        i6 = ((iM6981 ^ i30) * (-9029)) ^ 446091423;
                        i7 = 201968654;
                    }
                    i19 = iM6981 ^ i7;
                    i31 = i6;
                    z = z;
                    sb3 = sb3;
                    c9918 = c9918;
                    i42 = i42;
                    sArr5 = sArr5;
                    i36 = i36;
                    i34 = i34;
                    sArr10 = sArr10;
                    i32 = i19;
                    i33 = i33;
                    str14 = str14;
                    str15 = str15;
                    str13 = str13;
                    String str216 = strMo14422;
                    sArr6 = sArr;
                    strMo14422 = str216;
                    break;
                case -64326905:
                case 50347707:
                    i34 = i34;
                    sArr10 = sArr10;
                    i42 = i42;
                    str13 = str13;
                    str15 = str15;
                    str14 = str14;
                    i33 = i33;
                    i36 = i36;
                    sb3 = sb3;
                    sArr5 = sArr5;
                    c9918 = c9918;
                    z = z;
                    short[] sArr24 = sArr6;
                    strMo14422 = strMo14422;
                    sArr = sArr24;
                    s = f50023[54];
                    s2 = 39854;
                    if (C11340.m28031()) {
                        iM6981 = C2105.m6981("ۙ֨") ^ i30;
                        i6 = ((iM6981 ^ i29) * (-28445)) ^ (-341521891);
                        i7 = -400062227;
                    } else {
                        iM6981 = C2105.m6981("᩷ۢ") ^ i30;
                        i6 = ((iM6981 ^ i29) * 4589) ^ (-1328441080);
                        i7 = 1468887139;
                    }
                    i19 = iM6981 ^ i7;
                    i31 = i6;
                    z = z;
                    sb3 = sb3;
                    c9918 = c9918;
                    i42 = i42;
                    sArr5 = sArr5;
                    i36 = i36;
                    i34 = i34;
                    sArr10 = sArr10;
                    i32 = i19;
                    i33 = i33;
                    str14 = str14;
                    str15 = str15;
                    str13 = str13;
                    String str217 = strMo14422;
                    sArr6 = sArr;
                    strMo14422 = str217;
                    break;
                case -22108456:
                case 1778162028:
                    i10 = i34;
                    sArr2 = sArr10;
                    i11 = i42;
                    str4 = str13;
                    str5 = str15;
                    str6 = str14;
                    i12 = i33;
                    i13 = i36;
                    sb = sb3;
                    sArr3 = sArr5;
                    z = z;
                    short[] sArr25 = sArr6;
                    strMo14422 = strMo14422;
                    sArr = sArr25;
                    int iM17975 = this.f50035.m17975();
                    int iM17983 = this.f50035.m17983();
                    if (!RunnableC1108.m3790()) {
                        C9918 c99110 = new C9918(this, (ActivityC17169) RunnableC0588.m2429(this), iM17975, iM17983);
                        sArr5 = f50023;
                        if (C3537.f11231 < 0) {
                            int iM6986 = (i29 - C2105.m6981("ۚ۟")) * 89;
                            i39 = iM17975;
                            i31 = ((iM6986 ^ i30) * 15513) ^ (-154249668);
                            i40 = iM17983;
                            c9918 = c99110;
                            z = z;
                            sb3 = sb;
                            i33 = i12;
                            i42 = i11;
                            str14 = str6;
                            i34 = i10;
                            i32 = iM6986 ^ 62044369;
                            i36 = i13;
                            str15 = str5;
                            str13 = str4;
                            sArr10 = sArr2;
                            String str218 = strMo14422;
                            sArr6 = sArr;
                            strMo14422 = str218;
                        } else {
                            i39 = iM17975;
                            i40 = iM17983;
                        }
                    } else {
                        i39 = iM17975;
                        i40 = iM17983;
                        sArr5 = sArr3;
                    }
                    i33 = i12;
                    int iM25618 = C0630.m2566("ۨۚ") ^ i30;
                    int i54 = ((iM25618 ^ i29) * 2035) ^ (-994704024);
                    i14 = iM25618 ^ (-1790715266);
                    i31 = i54;
                    i36 = i13;
                    str14 = str6;
                    sArr10 = sArr2;
                    c9918 = null;
                    str15 = str5;
                    str13 = str4;
                    sb2 = sb;
                    i42 = i11;
                    i34 = i10;
                    i32 = i14;
                    z = z;
                    sb3 = sb2;
                    String str219 = strMo14422;
                    sArr6 = sArr;
                    strMo14422 = str219;
                    break;
                case 472417625:
                case 1174675732:
                    str11 = str14;
                    c6273 = this.f50033;
                    strM3841 = C1128.m3841(f50023, 86, 10, i35);
                    sArr11 = f50023;
                    if (C4075.f12947 < 0) {
                        int iM25619 = C0630.m2566("ۘᩴ") ^ i30;
                        i31 = ((iM25619 ^ i29) * 22661) ^ (-209121525);
                        i32 = iM25619 ^ (-1904781676);
                        i34 = 96;
                        str14 = str11;
                    } else {
                        i = 96;
                        str = str11;
                        int i415 = i40;
                        i16 = i44;
                        i15 = i415;
                        short[] sArr110 = sArr6;
                        strMo14422 = strMo14422;
                        sArr = sArr110;
                        int iM256110 = (C0630.m2566("ۡ۟") ^ i29) * (-27);
                        StringBuilder sb7 = sb3;
                        i31 = ((iM256110 ^ i30) * 4189) ^ 186502747;
                        c9918 = c9918;
                        i33 = i33;
                        str14 = str;
                        str15 = str15;
                        str13 = str13;
                        i42 = i42;
                        i34 = i;
                        i32 = iM256110 ^ (-1481232717);
                        i39 = i39;
                        z = z;
                        sb3 = sb7;
                        int i416 = i16;
                        i40 = i15;
                        i44 = i416;
                        String str114 = strMo14422;
                        sArr6 = sArr;
                        strMo14422 = str114;
                    }
                    break;
                case 586186104:
                case 996459889:
                    i34 = i34;
                    sArr10 = sArr10;
                    i42 = i42;
                    str13 = str13;
                    str15 = str15;
                    str14 = str14;
                    i33 = i33;
                    i36 = i36;
                    sb3 = sb3;
                    sArr5 = sArr5;
                    c9918 = c9918;
                    z = z;
                    short[] sArr26 = sArr6;
                    strMo14422 = strMo14422;
                    sArr = sArr26;
                    if (i42 == (C2105.m6981(C4159.m12578(f50023, 58, 3, i35)) ^ 2099488681)) {
                        iM6981 = (C0630.m2566("᩷ۤ") + i29) * (-89);
                        i6 = ((iM6981 ^ i30) * 25) ^ (-1035716300);
                        i7 = -629691504;
                    } else {
                        iM6981 = (i30 - C2105.m6981("֡᩸")) * (-15);
                        i6 = ((iM6981 ^ i29) * 16555) ^ (-937507561);
                        i7 = 1530342635;
                    }
                    i19 = iM6981 ^ i7;
                    i31 = i6;
                    z = z;
                    sb3 = sb3;
                    c9918 = c9918;
                    i42 = i42;
                    sArr5 = sArr5;
                    i36 = i36;
                    i34 = i34;
                    sArr10 = sArr10;
                    i32 = i19;
                    i33 = i33;
                    str14 = str14;
                    str15 = str15;
                    str13 = str13;
                    String str2110 = strMo14422;
                    sArr6 = sArr;
                    strMo14422 = str2110;
                    break;
                case 699653906:
                case 1416931222:
                    sArr = sArr6;
                    i35 = 16716;
                    iM6981 = C0630.m2566("᩸ۧ") ^ i29;
                    i6 = ((iM6981 ^ i30) * (-25359)) ^ (-1253368331);
                    i7 = 353794352;
                    i19 = iM6981 ^ i7;
                    i31 = i6;
                    z = z;
                    sb3 = sb3;
                    c9918 = c9918;
                    i42 = i42;
                    sArr5 = sArr5;
                    i36 = i36;
                    i34 = i34;
                    sArr10 = sArr10;
                    i32 = i19;
                    i33 = i33;
                    str14 = str14;
                    str15 = str15;
                    str13 = str13;
                    String str2111 = strMo14422;
                    sArr6 = sArr;
                    strMo14422 = str2111;
                    break;
                case 1010126661:
                case 1187159595:
                    return super.onOptionsItemSelected(menuItem);
                case 1203982432:
                case 1594510560:
                    C0382.m1848();
                    RunnableC1937.m6387();
                    return false;
                case 1210892328:
                case 2136526958:
                    strArr = new String[]{RunnableC1108.m3789(sArr8, i43, i36, i35)};
                    RunnableC3474.m10618(c6273);
                    i38 = 16;
                    sArr9 = f50023;
                    i37 = IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i33 = 3;
                    if (C0237.m1481() < 0) {
                        iM6983 = (C2105.m6981("᩹ܺ") + i29) * 77;
                        i26 = ((iM6983 ^ i30) * (-9451)) ^ 773661218;
                        i27 = 10743658;
                        i32 = iM6983 ^ i27;
                        i31 = i26;
                    } else {
                        i10 = i34;
                        sArr2 = sArr10;
                        i11 = i42;
                        str4 = str13;
                        str5 = str15;
                        str6 = str14;
                        i13 = i36;
                        sb = sb3;
                        z = z;
                        short[] sArr27 = sArr6;
                        strMo14422 = strMo14422;
                        sArr = sArr27;
                        int iM256111 = C0630.m2566("ۨۚ") ^ i30;
                        int i55 = ((iM256111 ^ i29) * 2035) ^ (-994704024);
                        i14 = iM256111 ^ (-1790715266);
                        i31 = i55;
                        i36 = i13;
                        str14 = str6;
                        sArr10 = sArr2;
                        c9918 = null;
                        str15 = str5;
                        str13 = str4;
                        sb2 = sb;
                        i42 = i11;
                        i34 = i10;
                        i32 = i14;
                        z = z;
                        sb3 = sb2;
                        String str2112 = strMo14422;
                        sArr6 = sArr;
                        strMo14422 = str2112;
                    }
                    break;
                case 1356628092:
                case 1893699575:
                    int i56 = i34;
                    StringBuilder sb8 = sb3;
                    short[] sArr28 = sArr10;
                    String str31 = str13;
                    String str32 = str15;
                    String str33 = str14;
                    int i57 = i33;
                    int i58 = i36;
                    short[] sArr29 = sArr5;
                    C9918 c99111 = c9918;
                    short[] sArr30 = sArr6;
                    strMo14422 = strMo14422;
                    sArr = sArr30;
                    int iM12567 = C4159.m12567(menuItem);
                    z = true;
                    if (iM12567 == (C2105.m6981(C0798.m3005(f50023, 55, 3, i35)) ^ 2119615280)) {
                        iM2567 = C0630.m2566("۫᩸") ^ i30;
                        i8 = ((iM2567 ^ i29) * (-20075)) ^ (-457438519);
                        i9 = -413362501;
                    } else {
                        iM2567 = C0630.m2566("۟ۖ") ^ i29;
                        i8 = ((iM2567 ^ i30) * (-17179)) ^ (-1913550707);
                        i9 = -1804818291;
                    }
                    int i59 = iM2567 ^ i9;
                    i31 = i8;
                    sb3 = sb8;
                    c9918 = c99111;
                    i42 = iM12567;
                    sArr5 = sArr29;
                    i36 = i58;
                    i33 = i57;
                    sArr10 = sArr28;
                    str14 = str33;
                    str15 = str32;
                    str13 = str31;
                    i32 = i59;
                    i34 = i56;
                    String str2113 = strMo14422;
                    sArr6 = sArr;
                    strMo14422 = str2113;
                    break;
                default:
                    StringBuilder sb9 = sb3;
                    C1420.m4905(sb9, C2520.m8030(sArr10, i41, i45, i35));
                    C0422.m1944(sb9, i40);
                    String strM947 = C0050.m947(sb9);
                    C9918 c99112 = c9918;
                    c99112.m31265(strM947);
                    c99112.m31244();
                    c99112.m31279(i44);
                    c99112.m31266(z);
                    return z;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38265(C16266 c16266, C12951 c12951) {
        int i = 0;
        int i2 = -1392316250;
        int i3 = C4263.f13799;
        int i4 = C1420.f5096;
        int iM6981 = C2105.m6981("᩻᩹") ^ i3;
        int i5 = ((iM6981 ^ i4) * 21355) ^ (-122033437);
        int i6 = -114485073;
        while (true) {
            i2 = ((((i2 ^ i4) * 23105) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2117506704:
                case 768224230:
                    i = 1382253411;
                    if (C21923.f70183 != 0) {
                        iM6981 = (i4 - C2105.m6981("۬ۘ")) * 3;
                        i5 = ((iM6981 ^ i3) * (-23741)) ^ (-989708816);
                        i6 = -1327894160;
                    } else {
                        iM6981 = (C0630.m2566("ܽ᩶") + i4) * 19;
                        i5 = ((iM6981 ^ i3) * 6753) ^ 860181400;
                        i6 = 1342579606;
                    }
                    break;
                case -1905471700:
                case -676368179:
                    if (C0382.m1848()) {
                        iM6981 = C0630.m2566("᩹۬") ^ i4;
                        i5 = ((iM6981 ^ i3) * 27085) ^ 1333681263;
                        i6 = -1869348217;
                    } else {
                        iM6981 = (C2105.m6981("۫ܽ") ^ i4) * 83;
                        i5 = ((iM6981 ^ i3) * (-3753)) ^ 1635112816;
                        i6 = 246468856;
                    }
                    break;
                case -1600386923:
                case -1051568055:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C0630.m2566("᩹۬") ^ i4;
                        i5 = ((iM6981 ^ i3) * 27085) ^ 1333681263;
                        i6 = -1869348217;
                    } else {
                        iM6981 = (C2105.m6981("֨֡") + i3) * 81;
                        i5 = ((iM6981 ^ i4) * (-27147)) ^ 1817931670;
                        i6 = -484058954;
                    }
                    break;
                case -1389360376:
                case 2072251144:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C0630.m2566("ܿ֫") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-32497)) ^ (-599325950);
                        i6 = 1041787478;
                    } else {
                        iM6981 = C2105.m6981("ܰᩳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 22701) ^ 1908671781;
                        i6 = 334707916;
                    }
                    break;
                case -1370103988:
                case -748821888:
                    C1916.m6308();
                    C11340.m28031();
                    iM6981 = C2105.m6981("ۙ֫") ^ i3;
                    i5 = ((iM6981 ^ i4) * (-24217)) ^ 1452606561;
                    i6 = -946990805;
                    break;
                case -1161085584:
                case 802947991:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C0630.m2566("ܿ֫") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-32497)) ^ (-599325950);
                        i6 = 1041787478;
                    } else {
                        iM6981 = C2105.m6981("᩵ܳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-7865)) ^ (-1424237256);
                        i6 = 429210000;
                    }
                    break;
                case -1108527284:
                case -848134439:
                    if (C0964.m3413()) {
                        iM6981 = C2105.m6981("֨ۤ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-28597)) ^ 315469409;
                        i6 = -470552615;
                    } else {
                        iM6981 = C2105.m6981("ۙ֫") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-24217)) ^ 1452606561;
                        i6 = -946990805;
                    }
                    break;
                case -971071502:
                case -204283407:
                    C4117.m12364();
                    break;
                case -925772196:
                case -553942834:
                    c16266.f50025 = C4263.m12815(c12951);
                    if (AbstractC2021.m6574()) {
                        iM6981 = C2105.m6981("ۙ֫") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-24217)) ^ 1452606561;
                        i6 = -946990805;
                    } else {
                        iM6981 = (C0630.m2566("᩻᩷") ^ i3) * (-83);
                        i5 = ((iM6981 ^ i4) * (-6607)) ^ (-1145035621);
                        i6 = -607998867;
                    }
                    break;
                case -187748694:
                case 1630858668:
                    if (C0483.m2121()) {
                        iM6981 = C0630.m2566("۬᩷") ^ i4;
                        i5 = ((iM6981 ^ i3) * 16709) ^ 867051407;
                        i6 = -480894454;
                    } else {
                        iM6981 = C0630.m2566("᩹۬") ^ i4;
                        i5 = ((iM6981 ^ i3) * 27085) ^ 1333681263;
                        i6 = -1869348217;
                    }
                    break;
                case -59114810:
                case 1478936961:
                    C22124.m49722((InterfaceC20008) c12951, i);
                    if (C0422.f1886 <= 0) {
                        iM6981 = (i4 - C2105.m6981("۬ۘ")) * 3;
                        i5 = ((iM6981 ^ i3) * (-23741)) ^ (-989708816);
                        i6 = -1327894160;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ܶ֫")) * (-123);
                        i5 = ((iM6981 ^ i3) * 4679) ^ (-841194889);
                        i6 = -1524140537;
                    }
                    break;
                case 665840807:
                case 854469329:
                    if (C1916.m6308() < 0) {
                        iM6981 = C0630.m2566("᩹۬") ^ i4;
                        i5 = ((iM6981 ^ i3) * 27085) ^ 1333681263;
                        i6 = -1869348217;
                    } else {
                        iM6981 = C2105.m6981("ۙ֫") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-24217)) ^ 1452606561;
                        i6 = -946990805;
                    }
                    break;
                case 754810524:
                case 2110936974:
                    C0237.m1481();
                    if (C3245.f10203 <= 0) {
                        iM6981 = C2105.m6981("ܰᩳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 22701) ^ 1908671781;
                        i6 = 334707916;
                    } else {
                        iM6981 = C0630.m2566("᩹۬") ^ i4;
                        i5 = ((iM6981 ^ i3) * 27085) ^ 1333681263;
                        i6 = -1869348217;
                    }
                    break;
                case 799721612:
                case 1510533470:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("ܿ֫") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-32497)) ^ (-599325950);
                        i6 = 1041787478;
                    } else {
                        iM6981 = (C2105.m6981("֡۫") + i4) * (-39);
                        i5 = ((iM6981 ^ i3) * 28857) ^ 977311569;
                        i6 = 288871486;
                    }
                    break;
                case 999828600:
                case 1917292743:
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("֡ᩳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 16421) ^ (-1561604972);
                        i6 = 1851000964;
                    } else {
                        iM6981 = C2105.m6981("ۙ֫") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-24217)) ^ 1452606561;
                        i6 = -946990805;
                    }
                    break;
                default:
                    c16266.f50035.m17980(c12951);
                    break;
            }
            return;
        }
    }
}
