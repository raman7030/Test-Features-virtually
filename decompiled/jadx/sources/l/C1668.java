package l;

import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.preference.PluginPreference;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C3YU */
/* JADX INFO: loaded from: classes2.dex */
public final class C1668 extends AbstractC7809 implements PluginPreference.List {

    /* JADX INFO: renamed from: ۜ֫ܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f5837 = {6305, 15108, 15129, 15112, 15104, 15171, 15107, 15116, 15104, 15112};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f5838;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f5839;

    /* JADX WARN: Code duplicated, block: B:35:0x00ef A[PHI: r2 r8 r9
      0x00ef: PHI (r2v3 l.ۧۜ᩷) = (r2v2 l.ۧۜ᩷), (r2v1 l.ۧۜ᩷), (r2v1 l.ۧۜ᩷) binds: [B:34:0x00ed, B:30:0x00c8, B:10:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r8v3 short[]) = (r8v2 short[]), (r8v1 short[]), (r8v1 short[]) binds: [B:34:0x00ed, B:30:0x00c8, B:10:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:34:0x00ed, B:30:0x00c8, B:10:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x020f  */
    /* JADX WARN: Code duplicated, block: B:66:0x023d A[PHI: r4 r5
      0x023d: PHI (r4v3 short[]) = (r4v1 short[]), (r4v2 short[]), (r4v1 short[]) binds: [B:65:0x023b, B:53:0x01d3, B:49:0x01b0] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r5v2 short) = (r5v1 short), (r5v1 short), (r5v4 short) binds: [B:65:0x023b, B:53:0x01d3, B:49:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (l.AbstractC2021.f6743 > 0) goto L17;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PluginPreference.List.Item addItem(CharSequence charSequence, String str) {
        int iM2566;
        int i;
        int i2;
        C10841 c10841 = null;
        String strM16034 = null;
        short[] sArr = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 1038003973;
        int i7 = C4616.f14690;
        int i8 = C22628.f73083;
        int iM6981 = C2105.m6981("᩹ᩳ") ^ i8;
        int i9 = ((iM6981 ^ i7) * (-20243)) ^ 838672398;
        int i10 = iM6981 ^ 346710693;
        while (true) {
            i6 = ((((i6 ^ i7) * 16631) >> 31) & i9) ^ i10;
            switch (i6) {
                case -2101427928:
                case 509479120:
                    if ((s * 21236) - i3 <= 0) {
                        iM2566 = (C0630.m2566("ܳۙ") + i8) * 73;
                        i = ((iM2566 ^ i7) * 22133) ^ (-1316756156);
                        i2 = 2098115412;
                    } else {
                        iM2566 = C2105.m6981("ܽ᩶") ^ i7;
                        i = ((iM2566 ^ i8) * (-13461)) ^ (-581913806);
                        i2 = -285728696;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1944377037:
                case 1329227367:
                    c10841 = new C10841();
                    sArr2 = f5837;
                    if (RunnableC1108.m3790()) {
                        iM2566 = (i7 - C2105.m6981("ۗۨ")) * (-113);
                        i = ((iM2566 ^ i8) * (-27865)) ^ (-1201485156);
                        i2 = 369296571;
                    } else {
                        iM2566 = C0630.m2566("۫ܿ") ^ i7;
                        i = ((iM2566 ^ i8) * (-20129)) ^ (-1774007033);
                        i2 = -169043505;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1700356673:
                case 47106433:
                    C6398.m17725(charSequence, strM16034);
                    c10841.f32589 = this;
                    c10841.f32590 = charSequence;
                    if (C3245.m9925() != 0) {
                        iM2566 = C0630.m2566("ۡ᩻") ^ i7;
                        i = ((iM2566 ^ i8) * (-16225)) ^ (-874578086);
                        i2 = 2001385353;
                    } else {
                        iM2566 = C0630.m2566("᩺ۡ") ^ i8;
                        i = ((iM2566 ^ i7) * (-26465)) ^ (-1542936075);
                        i2 = 789405202;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1014273251:
                case -935132079:
                    i4 = 4960;
                    iM2566 = (i8 - C2105.m6981("ۚۡ")) * 17;
                    i = ((iM2566 ^ i7) * (-25071)) ^ 1790997000;
                    i2 = 404737135;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -791611168:
                case 1152160437:
                    sArr = f5837;
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = (i8 - C2105.m6981("ۚܶ")) * 17;
                        i = ((iM2566 ^ i7) * 28379) ^ (-989353278);
                        i2 = -100574021;
                    } else {
                        iM2566 = (i8 - C2105.m6981("᩺᩺")) * 81;
                        i = ((iM2566 ^ i7) * 19289) ^ 1885356791;
                        i2 = 201613433;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -749233477:
                case 1189424565:
                    i5 = 1;
                    if (C11340.f33930 >= 0) {
                        iM2566 = (i7 - C2105.m6981("ۗۨ")) * (-113);
                        i = ((iM2566 ^ i8) * (-27865)) ^ (-1201485156);
                        i2 = 369296571;
                    } else {
                        iM2566 = C0630.m2566("ۖᩴ") ^ i8;
                        i = ((iM2566 ^ i7) * (-19709)) ^ (-1921357304);
                        i2 = 703982505;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -674976120:
                case -244296422:
                    if (C3537.f11231 >= 0) {
                        iM2566 = C0630.m2566("ۡ᩻") ^ i7;
                        i = ((iM2566 ^ i8) * (-16225)) ^ (-874578086);
                        i2 = 2001385353;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    iM2566 = (i8 - C2105.m6981("۫ۤ")) * (-51);
                    i = ((iM2566 ^ i7) * 6421) ^ (-1152791699);
                    i2 = 1469797218;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -414242603:
                case 38752093:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("ۡ᩻") ^ i7;
                        i = ((iM2566 ^ i8) * (-16225)) ^ (-874578086);
                        i2 = 2001385353;
                    } else {
                        iM2566 = C0630.m2566("ܿ᩶") ^ i7;
                        i = ((iM2566 ^ i8) * 24017) ^ (-816420404);
                        i2 = 662911908;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -119549656:
                case 1913208858:
                    i3 = (s * s) + 112741924;
                    if (C7106.f21815 != 0) {
                        iM2566 = (i8 - C2105.m6981("۫ۤ")) * (-51);
                        i = ((iM2566 ^ i7) * 6421) ^ (-1152791699);
                        i2 = 1469797218;
                    } else {
                        iM2566 = C2105.m6981("ۗ᩸") ^ i7;
                        i = ((iM2566 ^ i8) * 769) ^ (-2028153510);
                        i2 = 954546321;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 20455027:
                case 30463691:
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("ۡ᩻") ^ i7;
                        i = ((iM2566 ^ i8) * (-16225)) ^ (-874578086);
                        i2 = 2001385353;
                    } else {
                        iM2566 = C0630.m2566("᩺᩹") ^ i7;
                        i = ((iM2566 ^ i8) * (-23147)) ^ 569087257;
                        i2 = -160929505;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 130906858:
                case 466069958:
                    s = sArr[0];
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (i8 - C2105.m6981("ۚܶ")) * 17;
                        i = ((iM2566 ^ i7) * 28379) ^ (-989353278);
                        i2 = -100574021;
                    } else {
                        iM2566 = (C2105.m6981("۫ۧ") ^ i8) * (-7);
                        i = ((iM2566 ^ i7) * 10455) ^ 585700307;
                        i2 = 2115710191;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 247107204:
                case 552615205:
                    i4 = 15213;
                    iM2566 = (i8 - C2105.m6981("ۚۡ")) * 17;
                    i = ((iM2566 ^ i7) * (-25071)) ^ 1790997000;
                    i2 = 404737135;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 342551264:
                case 1007471591:
                    C22628.m50615();
                    C0483.m2121();
                    iM2566 = (C0630.m2566("ۚᩳ") ^ i7) * 35;
                    i = ((iM2566 ^ i8) * (-21061)) ^ (-1568940805);
                    i2 = 788901898;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 471204628:
                case 550069099:
                    strM16034 = C5695.m16034(sArr2, i5, 9, i4);
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C0630.m2566("ۚᩳ") ^ i7) * 35;
                        i = ((iM2566 ^ i8) * (-21061)) ^ (-1568940805);
                        i2 = 788901898;
                    } else {
                        iM2566 = C0630.m2566("ۨ᩸") ^ i7;
                        i = ((iM2566 ^ i8) * 28675) ^ 1405001255;
                        i2 = -1138904081;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 558508892:
                case 1547576471:
                    if (C3019.f9544 >= 0) {
                        iM2566 = (i8 - C2105.m6981("ۚܶ")) * 17;
                        i = ((iM2566 ^ i7) * 28379) ^ (-989353278);
                        i2 = -100574021;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ܽ᩵")) * 123;
                        i = ((iM2566 ^ i7) * 18369) ^ 1723390657;
                        i2 = 81060252;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 1374783219:
                case 1875587502:
                    break;
                case 1413995970:
                case 1687298913:
                    C22628.m50615();
                    return null;
                case 1459964675:
                case 1845854988:
                    C3683.m11222();
                    if (C21923.f70183 != 0) {
                        iM2566 = (i7 - C2105.m6981("ۗۨ")) * (-113);
                        i = ((iM2566 ^ i8) * (-27865)) ^ (-1201485156);
                        i2 = 369296571;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    iM2566 = (i8 - C2105.m6981("۫ۤ")) * (-51);
                    i = ((iM2566 ^ i7) * 6421) ^ (-1152791699);
                    i2 = 1469797218;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                default:
                    c10841.f32592 = str;
                    C1916.m6307(this.f5839, c10841);
                    return c10841;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.List
    public final PluginPreference.List defaultValue(String str) {
        this.f5838 = str;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.List
    public final PluginPreference.List summary(CharSequence charSequence) {
        this.f24120 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.List
    public final PluginPreference.List interceptClick(PluginPreference.OnClickInterceptListener onClickInterceptListener) {
        this.f24121 = onClickInterceptListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.List
    public final PluginPreference.List visible(boolean z) {
        this.f24122 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.List
    public final PluginPreference.List enable(boolean z) {
        this.f24116 = z;
        return this;
    }

    @Override // l.AbstractC7809
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC14158 mo5657() {
        return EnumC14158.f42721;
    }

    @Override // l.AbstractC7809
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5658(LocalString localString) {
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        Iterator itM12354 = null;
        C10841 c10841 = null;
        CharSequence charSequence3 = null;
        CharSequence charSequence4 = null;
        int i = -1698645077;
        int i2 = C1047.f3863;
        int i3 = C0714.f2697;
        int iM6981 = (i3 - C2105.m6981("۫۟")) * 75;
        int i4 = ((iM6981 ^ i2) * (-10333)) ^ (-1025868590);
        int i5 = 658265173;
        while (true) {
            i = ((((i ^ i2) * 27937) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2129993895:
                case 161058924:
                    if (C1773.m5910(itM12354)) {
                        iM6981 = (C0630.m2566("ۚ֫") + i3) * (-101);
                        i4 = ((iM6981 ^ i2) * 15629) ^ (-137250123);
                        i5 = 532034931;
                    } else {
                        iM6981 = (C2105.m6981("ܽ֨") + i2) * (-127);
                        i4 = ((iM6981 ^ i3) * 11221) ^ 840969490;
                        i5 = 764029569;
                    }
                    break;
                case -2031294919:
                case 42276092:
                    if (C3746.m11369() >= 0) {
                        iM6981 = C0630.m2566("ۛۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 24349) ^ 1693071372;
                        i5 = -146698293;
                    } else {
                        iM6981 = (C0630.m2566("᩻ܺ") + i3) * 9;
                        i4 = ((iM6981 ^ i2) * (-32507)) ^ 1057277831;
                        i5 = -1311653068;
                    }
                    break;
                case -1753521739:
                case 1272378029:
                    C0798.m2998();
                    if (C1711.m5736() > 0) {
                        iM6981 = C0630.m2566("᩵᩵") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14029) ^ 900314792;
                        i5 = 337081300;
                    } else {
                        iM6981 = C0630.m2566("ۘ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 2153) ^ 411948933;
                        i5 = -2102067266;
                    }
                    break;
                case -1747477834:
                case -594765638:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("ۨܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17137) ^ (-725926494);
                        i5 = 1104734090;
                    } else {
                        iM6981 = C0630.m2566("۠ۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2921)) ^ (-1228955554);
                        i5 = -995815729;
                    }
                    break;
                case -1705302167:
                case 903524101:
                    C3537.m10746();
                    C0237.m1481();
                    iM6981 = C0630.m2566("ۘ֡") ^ i2;
                    i4 = ((iM6981 ^ i3) * 2153) ^ 411948933;
                    i5 = -2102067266;
                    break;
                case -1579505906:
                case 1345874705:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("ۛۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 24349) ^ 1693071372;
                        i5 = -146698293;
                    } else {
                        iM6981 = C2105.m6981("ۡۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-16073)) ^ (-1752459182);
                        i5 = 1269552224;
                    }
                    break;
                case -1518129512:
                case -51464102:
                    charSequence4 = c10841.f32591;
                    if (charSequence4 instanceof String) {
                        iM6981 = (C0630.m2566("ᩳܺ") ^ i3) * (-5);
                        i4 = ((iM6981 ^ i2) * 23463) ^ (-1247831607);
                        i5 = 1959273912;
                    } else {
                        iM6981 = (C0630.m2566("ۤܽ") ^ i3) * (-97);
                        i4 = ((iM6981 ^ i2) * (-25599)) ^ 9517536;
                        i5 = -1831898907;
                    }
                    break;
                case -1517943843:
                case -974908838:
                    if (RunnableC0588.m2441() >= 0) {
                        iM6981 = (i2 - C0630.m2566("ܳܽ")) * 75;
                        i4 = ((iM6981 ^ i3) * (-1613)) ^ (-10275744);
                        i5 = 976283160;
                    } else {
                        iM6981 = (C2105.m6981("۠ܺ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM6981 ^ i2) * 7061) ^ 909480518;
                        i5 = -1268543747;
                    }
                    break;
                case -1420605205:
                case -1037352919:
                    if (C3746.f11829 <= 0) {
                        iM6981 = C2105.m6981("ۨܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17137) ^ (-725926494);
                        i5 = 1104734090;
                    } else {
                        iM6981 = C2105.m6981("ܶۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10299) ^ (-623916269);
                        i5 = 907849967;
                    }
                    break;
                case -1321940184:
                case 1414804710:
                    if (C1916.f6442) {
                        iM6981 = (C0630.m2566("ۘ᩷") + i2) * (-121);
                        i4 = ((iM6981 ^ i3) * 32475) ^ 948704601;
                        i5 = -59325995;
                    } else {
                        iM6981 = C0630.m2566("᩵᩵") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14029) ^ 900314792;
                        i5 = 337081300;
                    }
                    break;
                case -1211353152:
                case 1239273564:
                    if (C0798.m2998() != 0) {
                        iM6981 = C0630.m2566("ۘ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 2153) ^ 411948933;
                        i5 = -2102067266;
                    } else {
                        iM6981 = C0630.m2566("ᩳۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 19665) ^ (-1663580827);
                        i5 = 144754416;
                    }
                    break;
                case -1202500480:
                case 508810225:
                    charSequence = this.f24118;
                    if (charSequence instanceof String) {
                        iM6981 = (C2105.m6981("ۗܳ") + i3) * 47;
                        i4 = ((iM6981 ^ i2) * (-25373)) ^ 1720856923;
                        i5 = -1717318867;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۖᩴ")) * (-43);
                        i4 = ((iM6981 ^ i3) * 27703) ^ (-461675065);
                        i5 = 552200330;
                    }
                    break;
                case -1190281094:
                case 1486985691:
                    this.f24118 = C20510.m46981(localString, (String) charSequence);
                    iM6981 = (i2 - C0630.m2566("ۖᩴ")) * (-43);
                    i4 = ((iM6981 ^ i3) * 27703) ^ (-461675065);
                    i5 = 552200330;
                    break;
                case -977101655:
                case 1121470987:
                    c10841 = (C10841) C2272.m7513(itM12354);
                    if (C0964.f3626 != 0) {
                        iM6981 = C2105.m6981("ۨܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17137) ^ (-725926494);
                        i5 = 1104734090;
                    } else {
                        iM6981 = (C0630.m2566("ܺ۫") + i3) * (-101);
                        i4 = ((iM6981 ^ i2) * (-24679)) ^ 291031193;
                        i5 = 619324958;
                    }
                    break;
                case -861913167:
                case 2140181461:
                    if (C0050.f910 < 0) {
                        iM6981 = C0630.m2566("ۛۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 24349) ^ 1693071372;
                        i5 = -146698293;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ܳܽ")) * 75;
                        i4 = ((iM6981 ^ i3) * (-1613)) ^ (-10275744);
                        i5 = 976283160;
                    }
                    break;
                case -620496966:
                case -58123275:
                    break;
                case -576558611:
                case 1056040723:
                    if (C7106.m19120() <= 0) {
                        iM6981 = C2105.m6981("ۨܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17137) ^ (-725926494);
                        i5 = 1104734090;
                    } else {
                        iM6981 = C2105.m6981("ܺ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-28633)) ^ (-239736543);
                        i5 = 748831873;
                    }
                    break;
                case -382046770:
                case 1280015462:
                    c10841.f32591 = C20510.m46981(localString, (String) charSequence4);
                    iM6981 = (C0630.m2566("ۤܽ") ^ i3) * (-97);
                    i4 = ((iM6981 ^ i2) * (-25599)) ^ 9517536;
                    i5 = -1831898907;
                    break;
                case -272562931:
                case 1551527016:
                    c10841.f32590 = C20510.m46981(localString, (String) charSequence3);
                    iM6981 = C0630.m2566("ۧ֫") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-14255)) ^ (-1996860654);
                    i5 = 1905682071;
                    break;
                case -257911898:
                case -24792220:
                    charSequence3 = c10841.f32590;
                    if (charSequence3 instanceof String) {
                        iM6981 = C0630.m2566("ܳۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 20939) ^ (-252386050);
                        i5 = -788361468;
                    } else {
                        iM6981 = C0630.m2566("ۧ֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14255)) ^ (-1996860654);
                        i5 = 1905682071;
                    }
                    break;
                case -245866723:
                case 1200413255:
                    this.f24120 = C20510.m46981(localString, (String) charSequence2);
                    iM6981 = C0630.m2566("ۙۛ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 11279) ^ (-2051776701);
                    i5 = -596501384;
                    break;
                case -136889998:
                case 903924458:
                    if (C0050.f910 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ܳܽ")) * 75;
                        i4 = ((iM6981 ^ i3) * (-1613)) ^ (-10275744);
                        i5 = 976283160;
                    } else {
                        iM6981 = C0630.m2566("ᩴۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-7957)) ^ 89345180;
                        i5 = 640186220;
                    }
                    break;
                case 314430586:
                case 1359659571:
                    itM12354 = C4117.m12354(this.f5839);
                    iM6981 = (C0630.m2566("ۤܽ") ^ i3) * (-97);
                    i4 = ((iM6981 ^ i2) * (-25599)) ^ 9517536;
                    i5 = -1831898907;
                    break;
                case 318289990:
                case 2030980744:
                    if (!C3683.m11222()) {
                        iM6981 = (i2 - C0630.m2566("ܳܽ")) * 75;
                        i4 = ((iM6981 ^ i3) * (-1613)) ^ (-10275744);
                        i5 = 976283160;
                    } else {
                        iM6981 = C0630.m2566("ۘ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 2153) ^ 411948933;
                        i5 = -2102067266;
                    }
                    break;
                case 471255469:
                case 1152687388:
                    charSequence2 = this.f24120;
                    if (charSequence2 instanceof String) {
                        iM6981 = C2105.m6981("ܳܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-31937)) ^ (-1057815882);
                        i5 = -889964210;
                    } else {
                        iM6981 = C0630.m2566("ۙۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 11279) ^ (-2051776701);
                        i5 = -596501384;
                    }
                    break;
                default:
                    C7811.m20844();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0473 A[PHI: r8 r9 r11 r12 r25
      0x0473: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:126:0x045a, B:117:0x03e8, B:107:0x037d] A[DONT_GENERATE, DONT_INLINE]
      0x0473: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:126:0x045a, B:117:0x03e8, B:107:0x037d] A[DONT_GENERATE, DONT_INLINE]
      0x0473: PHI (r11v77 java.lang.CharSequence) = (r11v56 java.lang.CharSequence), (r11v59 java.lang.CharSequence), (r11v78 java.lang.CharSequence) binds: [B:126:0x045a, B:117:0x03e8, B:107:0x037d] A[DONT_GENERATE, DONT_INLINE]
      0x0473: PHI (r12v5 java.lang.String) = (r12v2 java.lang.String), (r12v4 java.lang.String), (r12v2 java.lang.String) binds: [B:126:0x045a, B:117:0x03e8, B:107:0x037d] A[DONT_GENERATE, DONT_INLINE]
      0x0473: PHI (r25v59 java.lang.CharSequence) = (r25v48 java.lang.CharSequence), (r25v50 java.lang.CharSequence), (r25v60 java.lang.CharSequence) binds: [B:126:0x045a, B:117:0x03e8, B:107:0x037d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:168:0x067c A[PHI: r11 r21 r25
      0x067c: PHI (r11v93 java.lang.CharSequence) = (r11v46 java.lang.CharSequence), (r11v47 java.lang.CharSequence), (r11v94 java.lang.CharSequence) binds: [B:167:0x067a, B:163:0x0656, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r21v44 java.lang.CharSequence) = (r21v3 java.lang.CharSequence), (r21v4 java.lang.CharSequence), (r21v45 java.lang.CharSequence) binds: [B:167:0x067a, B:163:0x0656, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r25v80 java.lang.CharSequence) = (r25v34 java.lang.CharSequence), (r25v35 java.lang.CharSequence), (r25v81 java.lang.CharSequence) binds: [B:167:0x067a, B:163:0x0656, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0240 A[PHI: r13 r19
      0x0240: PHI (r13v8 java.lang.String) = 
      (r13v2 java.lang.String)
      (r13v4 java.lang.String)
      (r13v2 java.lang.String)
      (r13v2 java.lang.String)
      (r13v2 java.lang.String)
     binds: [B:72:0x023e, B:58:0x01ba, B:52:0x017a, B:46:0x0142, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r19v10 java.lang.CharSequence) = 
      (r19v3 java.lang.CharSequence)
      (r19v2 java.lang.CharSequence)
      (r19v2 java.lang.CharSequence)
      (r19v2 java.lang.CharSequence)
      (r19v2 java.lang.CharSequence)
     binds: [B:72:0x023e, B:58:0x01ba, B:52:0x017a, B:46:0x0142, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0105, code lost:
    
        if (l.RunnableC0588.f2309 < 0) goto L25;
     */
    @Override // l.AbstractC7809
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5659(PluginContext pluginContext) {
        CharSequence charSequence;
        int i;
        int iM2566;
        int i2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        int iM2567;
        int i3;
        int i4;
        int iM6981;
        int i5;
        int i6;
        CharSequence charSequence4;
        int i7;
        CharSequence charSequence5;
        int iM2568;
        int i8;
        PluginContext pluginContext2 = pluginContext;
        int i9 = 429403270;
        int i10 = C3537.f11231;
        int i11 = C0630.f2410;
        int iM6982 = (i10 - C2105.m6981("ۧۛ")) * (-89);
        int i12 = ((iM6982 ^ i11) * 7965) ^ 1185458344;
        int i13 = iM6982 ^ 664813761;
        CharSequence charSequence6 = null;
        C10841 c10841 = null;
        CharSequence charSequence7 = null;
        String str = null;
        CharSequence charSequenceM5739 = null;
        char c = 0;
        int i14 = 0;
        char c2 = 0;
        int i15 = 0;
        CharSequence charSequence8 = null;
        String str2 = null;
        CharSequence charSequence9 = null;
        CharSequence charSequence10 = null;
        boolean z = false;
        CharSequence charSequence11 = null;
        Iterator itM9029 = null;
        String str3 = null;
        int i16 = 0;
        CharSequence charSequence12 = null;
        String str4 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-8585)) >> 31));
            switch (i9) {
                case -2145208588:
                case -1224881407:
                    if (C1005.m3500(i14, str3) == c) {
                        iM2566 = C2105.m6981("ۡ᩷") ^ i11;
                        i = ((iM2566 ^ i10) * (-28537)) ^ (-558765060);
                        i2 = 1399390650;
                    } else {
                        charSequenceM5739 = charSequence10;
                        iM2566 = (C0630.m2566("᩹ܰ") + i10) * (-99);
                        i = ((iM2566 ^ i11) * 10925) ^ 265435548;
                        i2 = 1462049049;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -2082622783:
                case -699832456:
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    charSequence3 = charSequence8;
                    if (C1773.f6144 <= 0) {
                        iM2567 = C2105.m6981("᩷ۤ") ^ i11;
                        i3 = ((iM2567 ^ i10) * (-2059)) ^ 1888194294;
                        i4 = -990033810;
                    } else {
                        iM2567 = (C2105.m6981("ᩳۖ") + i11) * (-7);
                        i3 = ((iM2567 ^ i10) * 14049) ^ 255282458;
                        i4 = 1851773963;
                    }
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    charSequence8 = charSequence3;
                    pluginContext2 = pluginContext;
                    charSequence12 = charSequence2;
                    CharSequence charSequence13 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence13;
                    break;
                case -2081639869:
                case 1182497728:
                    break;
                case -2077076409:
                case 207741213:
                    charSequence = charSequenceM5739;
                    if (C11340.m28021(i14, str4) == c) {
                        iM2568 = C0630.m2566("ۨܺ") ^ i10;
                        i12 = ((iM2568 ^ i11) * (-1093)) ^ (-399097719);
                        i8 = -1937671795;
                        i7 = iM2568 ^ i8;
                        CharSequence charSequence14 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence14;
                    }
                    charSequence2 = charSequence12;
                    charSequence11 = charSequence8;
                    iM6981 = (C2105.m6981("᩵ۛ") ^ i11) * (-15);
                    i5 = ((iM6981 ^ i10) * 3869) ^ 406497364;
                    i6 = -1354582681;
                    i7 = iM6981 ^ i6;
                    i12 = i5;
                    charSequence12 = charSequence2;
                    pluginContext2 = pluginContext;
                    CharSequence charSequence15 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence15;
                    break;
                case -2076854845:
                case -291517186:
                    String strM5739 = C1711.m5739(pluginContext2, str2);
                    if (strM5739 != null) {
                        charSequence = charSequenceM5739;
                        charSequence12 = strM5739;
                    } else {
                        charSequence = charSequenceM5739;
                        charSequence4 = charSequence6;
                        charSequence12 = charSequence4;
                        charSequence6 = charSequence12;
                    }
                    int iM2569 = (C0630.m2566("֨ܽ") + i10) * 41;
                    int i17 = ((iM2569 ^ i11) * 14269) ^ (-470462387);
                    i7 = iM2569 ^ (-910338949);
                    i12 = i17;
                    pluginContext2 = pluginContext;
                    CharSequence charSequence16 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence16;
                    break;
                case -2013922466:
                case -499777695:
                    charSequence = charSequenceM5739;
                    c10841 = (C10841) RunnableC1108.m3791(itM9029);
                    if (C1420.f5096 > 0) {
                        iM2568 = (C0630.m2566("۟ܳ") + i11) * (-99);
                        i12 = ((iM2568 ^ i10) * 4233) ^ (-1773792863);
                        i8 = 198866149;
                        i7 = iM2568 ^ i8;
                        CharSequence charSequence17 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence17;
                    } else {
                        charSequence2 = charSequence12;
                        iM6981 = (C0630.m2566("ܶ᩸") ^ i10) * 11;
                        i5 = ((iM6981 ^ i11) * 4295) ^ (-787234318);
                        i6 = 2032201284;
                        i7 = iM6981 ^ i6;
                        i12 = i5;
                        charSequence12 = charSequence2;
                        pluginContext2 = pluginContext;
                        CharSequence charSequence18 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence18;
                    }
                    break;
                case -2008956893:
                case 1231453885:
                    charSequence = charSequenceM5739;
                    if (C1711.m5733(str4, i15) == c2) {
                        iM2568 = C2105.m6981("᩸ܶ") ^ i11;
                        i12 = ((iM2568 ^ i10) * (-14207)) ^ 960754920;
                        i8 = -561938241;
                        i7 = iM2568 ^ i8;
                        CharSequence charSequence19 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence19;
                    }
                    charSequence2 = charSequence12;
                    charSequence11 = charSequence8;
                    iM6981 = (C2105.m6981("᩵ۛ") ^ i11) * (-15);
                    i5 = ((iM6981 ^ i10) * 3869) ^ 406497364;
                    i6 = -1354582681;
                    i7 = iM6981 ^ i6;
                    i12 = i5;
                    charSequence12 = charSequence2;
                    pluginContext2 = pluginContext;
                    CharSequence charSequence110 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence110;
                    break;
                case -1992042755:
                case -953671405:
                    ServiceConnectionC3453.m10564();
                    if (C0714.f2697 >= 0) {
                        charSequence = charSequenceM5739;
                        charSequence2 = charSequence12;
                        charSequence3 = charSequence8;
                        iM2567 = (C0630.m2566("֡᩸") + i10) * (-123);
                        i3 = ((iM2567 ^ i11) * 31489) ^ 1986878610;
                        i4 = 1899349903;
                        i7 = iM2567 ^ i4;
                        i12 = i3;
                        charSequence8 = charSequence3;
                        pluginContext2 = pluginContext;
                        charSequence12 = charSequence2;
                        CharSequence charSequence111 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence111;
                    }
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    charSequence3 = charSequence8;
                    iM2567 = C2105.m6981("᩷ۤ") ^ i11;
                    i3 = ((iM2567 ^ i10) * (-2059)) ^ 1888194294;
                    i4 = -990033810;
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    charSequence8 = charSequence3;
                    pluginContext2 = pluginContext;
                    charSequence12 = charSequence2;
                    CharSequence charSequence112 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence112;
                    break;
                case -1831642260:
                case 1602052556:
                    charSequence5 = charSequence12;
                    this.f24120 = charSequence5;
                    itM9029 = C2958.m9029(this.f5839);
                    int iM25610 = (i11 - C0630.m2566("᩵ܳ")) * (-45);
                    i12 = ((iM25610 ^ i10) * 6671) ^ 391063090;
                    charSequenceM5739 = charSequenceM5739;
                    i13 = iM25610 ^ (-1100020807);
                    charSequence12 = charSequence5;
                    break;
                case -1828557815:
                case -987661842:
                    c10841.f32590 = charSequence7;
                    CharSequence charSequence20 = c10841.f32591;
                    if (charSequence20 instanceof String) {
                        int iM25611 = (C0630.m2566("᩺᩻") + i11) * (-5);
                        charSequence10 = charSequence20;
                        i12 = ((iM25611 ^ i10) * 18295) ^ 271336239;
                        charSequenceM5739 = charSequenceM5739;
                        i13 = iM25611 ^ (-714904827);
                    } else {
                        charSequence10 = charSequence20;
                        charSequenceM5739 = charSequence10;
                        iM2566 = (C0630.m2566("᩹ܰ") + i10) * (-99);
                        i = ((iM2566 ^ i11) * 10925) ^ 265435548;
                        i2 = 1462049049;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    }
                    break;
                case -1639015323:
                case 1090764710:
                    if (C3537.f11231 < 0) {
                        charSequence = charSequenceM5739;
                        charSequence2 = charSequence12;
                        iM6981 = C2105.m6981("ۛ۠") ^ i10;
                        i5 = ((iM6981 ^ i11) * (-3775)) ^ 103704818;
                        i6 = -1402534870;
                        i7 = iM6981 ^ i6;
                        i12 = i5;
                        charSequence12 = charSequence2;
                        pluginContext2 = pluginContext;
                        CharSequence charSequence113 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence113;
                    } else {
                        iM2566 = C2105.m6981("۟᩻") ^ i11;
                        i = ((iM2566 ^ i10) * 3729) ^ 857270593;
                        i2 = 318949268;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    }
                    break;
                case -1616392623:
                case 3417383:
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    this.f24118 = charSequence11;
                    CharSequence charSequence21 = this.f24120;
                    if (!(charSequence21 instanceof String)) {
                        charSequence4 = charSequence21;
                        charSequence12 = charSequence4;
                        charSequence6 = charSequence12;
                        int iM25612 = (C0630.m2566("֨ܽ") + i10) * 41;
                        int i18 = ((iM25612 ^ i11) * 14269) ^ (-470462387);
                        i7 = iM25612 ^ (-910338949);
                        i12 = i18;
                        pluginContext2 = pluginContext;
                        CharSequence charSequence114 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence114;
                    } else {
                        int iM25613 = (C0630.m2566("᩵ۚ") ^ i10) * (-89);
                        int i19 = ((iM25613 ^ i11) * 5051) ^ (-1513707774);
                        i7 = iM25613 ^ (-866040827);
                        i12 = i19;
                        charSequence6 = charSequence21;
                        pluginContext2 = pluginContext;
                        charSequence12 = charSequence2;
                        CharSequence charSequence115 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence115;
                    }
                    break;
                case -1555755338:
                case -1445815628:
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    charSequence3 = charSequence8;
                    if (C2520.f8000 >= 0) {
                        iM2567 = (C0630.m2566("֡᩸") + i10) * (-123);
                        i3 = ((iM2567 ^ i11) * 31489) ^ 1986878610;
                        i4 = 1899349903;
                    } else {
                        iM2567 = (C2105.m6981("᩷ۗ") + i11) * 61;
                        i3 = ((iM2567 ^ i10) * 31693) ^ 539097346;
                        i4 = -591035520;
                    }
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    charSequence8 = charSequence3;
                    pluginContext2 = pluginContext;
                    charSequence12 = charSequence2;
                    CharSequence charSequence116 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence116;
                    break;
                case -1555256547:
                case -1323801727:
                    charSequence = charSequenceM5739;
                    if (C1773.m5910(itM9029)) {
                        iM2568 = C0630.m2566("ۤ᩻") ^ i10;
                        i12 = ((iM2568 ^ i11) * 5215) ^ 672937786;
                        i8 = 864813884;
                    } else {
                        iM2568 = (i10 - C2105.m6981("ܶۘ")) * 5;
                        i12 = ((iM2568 ^ i11) * (-9625)) ^ (-46576335);
                        i8 = -1493762209;
                    }
                    i7 = iM2568 ^ i8;
                    CharSequence charSequence117 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence117;
                    break;
                case -1472297266:
                case -421250249:
                    charSequence = charSequenceM5739;
                    CharSequence charSequence22 = c10841.f32590;
                    if (!(charSequence22 instanceof String)) {
                        charSequence9 = charSequence22;
                        charSequence7 = charSequence9;
                        iM2568 = (C2105.m6981("ۨۖ") ^ i10) * 65;
                        i12 = ((iM2568 ^ i11) * (-13909)) ^ 1361096465;
                        i8 = -751856211;
                        i7 = iM2568 ^ i8;
                        CharSequence charSequence118 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence118;
                    } else {
                        int iM6983 = C2105.m6981("֨۫") ^ i11;
                        i = ((iM6983 ^ i10) * 9533) ^ 2034244120;
                        charSequence9 = charSequence22;
                        charSequenceM5739 = charSequence;
                        i13 = iM6983 ^ (-1995639604);
                        i12 = i;
                    }
                    break;
                case -1315349314:
                case 962958196:
                    if (C1711.m5733(str, i15) != c2) {
                        charSequence = charSequenceM5739;
                        charSequence7 = charSequence9;
                        iM2568 = (C2105.m6981("ۨۖ") ^ i10) * 65;
                        i12 = ((iM2568 ^ i11) * (-13909)) ^ 1361096465;
                        i8 = -751856211;
                        i7 = iM2568 ^ i8;
                        CharSequence charSequence119 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence119;
                    } else {
                        iM2566 = (C0630.m2566("ܽ֨") + i10) * 9;
                        i = ((iM2566 ^ i11) * (-32351)) ^ (-489961976);
                        i2 = -1985600139;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    }
                    break;
                case -1313406152:
                case 1076601454:
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    CharSequence charSequence23 = this.f24118;
                    if (C22628.f73083 > 0) {
                        int iM6984 = C2105.m6981("ܺ۬") ^ i11;
                        charSequence8 = charSequence23;
                        i12 = ((iM6984 ^ i10) * (-21337)) ^ 789101921;
                        charSequence12 = charSequence2;
                        charSequenceM5739 = charSequence;
                        i13 = iM6984 ^ (-2137391773);
                        pluginContext2 = pluginContext;
                    } else {
                        charSequence8 = charSequence23;
                        iM6981 = C2105.m6981("ۛ۠") ^ i10;
                        i5 = ((iM6981 ^ i11) * (-3775)) ^ 103704818;
                        i6 = -1402534870;
                        i7 = iM6981 ^ i6;
                        i12 = i5;
                        charSequence12 = charSequence2;
                        pluginContext2 = pluginContext;
                        CharSequence charSequence1110 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence1110;
                    }
                    break;
                case -1290468828:
                case 1501978279:
                    c10841.f32591 = charSequenceM5739;
                    charSequence5 = charSequence12;
                    int iM25614 = (i11 - C0630.m2566("᩵ܳ")) * (-45);
                    i12 = ((iM25614 ^ i10) * 6671) ^ 391063090;
                    charSequenceM5739 = charSequenceM5739;
                    i13 = iM25614 ^ (-1100020807);
                    charSequence12 = charSequence5;
                    break;
                case -1279820699:
                case 1515022574:
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    i14 = 1;
                    c2 = '{';
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C0630.m2566("ܶ᩸") ^ i10) * 11;
                        i5 = ((iM6981 ^ i11) * 4295) ^ (-787234318);
                        i6 = 2032201284;
                    } else {
                        iM6981 = (C0630.m2566("ۜۧ") ^ i10) * 53;
                        i5 = ((iM6981 ^ i11) * 11891) ^ 946091892;
                        i6 = 927692270;
                    }
                    i7 = iM6981 ^ i6;
                    i12 = i5;
                    charSequence12 = charSequence2;
                    pluginContext2 = pluginContext;
                    CharSequence charSequence1111 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence1111;
                    break;
                case -1214419137:
                case 1033722671:
                    if (C1711.m5733(str3, i15) == c2) {
                        iM2566 = (C2105.m6981("֨ۢ") + i11) * (-29);
                        i = ((iM2566 ^ i10) * 20815) ^ 1107681699;
                        i2 = 253594497;
                    } else {
                        charSequenceM5739 = charSequence10;
                        iM2566 = (C0630.m2566("᩹ܰ") + i10) * (-99);
                        i = ((iM2566 ^ i11) * 10925) ^ 265435548;
                        i2 = 1462049049;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -1199223176:
                case -474954683:
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    str4 = (String) charSequence8;
                    if (C1711.m5741(str4) >= i16) {
                        iM6981 = (i11 - C2105.m6981("ܳ᩶")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM6981 ^ i10) * (-19369)) ^ (-1599823933);
                        i6 = 1875536642;
                    } else {
                        charSequence11 = charSequence8;
                        iM6981 = (C2105.m6981("᩵ۛ") ^ i11) * (-15);
                        i5 = ((iM6981 ^ i10) * 3869) ^ 406497364;
                        i6 = -1354582681;
                    }
                    i7 = iM6981 ^ i6;
                    i12 = i5;
                    charSequence12 = charSequence2;
                    pluginContext2 = pluginContext;
                    CharSequence charSequence1112 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence1112;
                    break;
                case -1191604130:
                case 2111755013:
                    C21923.m49329();
                    if (C1047.m3599() >= 0) {
                        iM2566 = C2105.m6981("۟᩻") ^ i11;
                        i = ((iM2566 ^ i10) * 3729) ^ 857270593;
                        i2 = 318949268;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    } else {
                        charSequence = charSequenceM5739;
                        charSequence2 = charSequence12;
                        iM6981 = (C0630.m2566("ܶ᩸") ^ i10) * 11;
                        i5 = ((iM6981 ^ i11) * 4295) ^ (-787234318);
                        i6 = 2032201284;
                        i7 = iM6981 ^ i6;
                        i12 = i5;
                        charSequence12 = charSequence2;
                        pluginContext2 = pluginContext;
                        CharSequence charSequence1113 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence1113;
                    }
                    break;
                case -1100070185:
                case -491146492:
                    break;
                case -1005988238:
                case 754822438:
                    charSequence = charSequenceM5739;
                    if (C11340.m28021(i14, str2) == c) {
                        iM2568 = (C2105.m6981("ۙۗ") ^ i11) * 65;
                        i12 = ((iM2568 ^ i10) * 15083) ^ 845553595;
                        i8 = -2104950885;
                        i7 = iM2568 ^ i8;
                        CharSequence charSequence1114 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence1114;
                    }
                    charSequence4 = charSequence6;
                    charSequence12 = charSequence4;
                    charSequence6 = charSequence12;
                    int iM25615 = (C0630.m2566("֨ܽ") + i10) * 41;
                    int i110 = ((iM25615 ^ i11) * 14269) ^ (-470462387);
                    i7 = iM25615 ^ (-910338949);
                    i12 = i110;
                    pluginContext2 = pluginContext;
                    CharSequence charSequence1115 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence1115;
                    break;
                case -797898494:
                case -742609463:
                    str = (String) charSequence9;
                    if (C1711.m5741(str) < i16) {
                        charSequence = charSequenceM5739;
                        charSequence7 = charSequence9;
                        iM2568 = (C2105.m6981("ۨۖ") ^ i10) * 65;
                        i12 = ((iM2568 ^ i11) * (-13909)) ^ 1361096465;
                        i8 = -751856211;
                        i7 = iM2568 ^ i8;
                        CharSequence charSequence1116 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence1116;
                    } else {
                        iM2566 = C0630.m2566("ۘۖ") ^ i10;
                        i = ((iM2566 ^ i11) * (-16923)) ^ 2112532656;
                        i2 = 1612745226;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    }
                    break;
                case -787397188:
                case 2078112604:
                    C7106.m19120();
                    C7106.m19120();
                    break;
                case -729395018:
                case 1563994261:
                    charSequence = charSequenceM5739;
                    String strM57310 = C1711.m5739(pluginContext2, str4);
                    if (strM57310 != null) {
                        charSequence11 = strM57310;
                        charSequence2 = charSequence12;
                    } else {
                        charSequence2 = charSequence12;
                        charSequence11 = charSequence8;
                    }
                    iM6981 = (C2105.m6981("᩵ۛ") ^ i11) * (-15);
                    i5 = ((iM6981 ^ i10) * 3869) ^ 406497364;
                    i6 = -1354582681;
                    i7 = iM6981 ^ i6;
                    i12 = i5;
                    charSequence12 = charSequence2;
                    pluginContext2 = pluginContext;
                    CharSequence charSequence1117 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence1117;
                    break;
                case -701521528:
                case -129065957:
                    if (C11340.m28021(i14, str) != c) {
                        charSequence = charSequenceM5739;
                        charSequence7 = charSequence9;
                        iM2568 = (C2105.m6981("ۨۖ") ^ i10) * 65;
                        i12 = ((iM2568 ^ i11) * (-13909)) ^ 1361096465;
                        i8 = -751856211;
                        i7 = iM2568 ^ i8;
                        CharSequence charSequence1118 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence1118;
                    } else {
                        iM2566 = C0630.m2566("᩷᩺") ^ i10;
                        i = ((iM2566 ^ i11) * (-29681)) ^ 1748217955;
                        i2 = -522486916;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    }
                    break;
                case -635207284:
                case 1375175867:
                    charSequence = charSequenceM5739;
                    str2 = (String) charSequence6;
                    if (C1711.m5741(str2) >= i16) {
                        iM2568 = C0630.m2566("ۘۗ") ^ i10;
                        i12 = ((iM2568 ^ i11) * 32425) ^ 1536853203;
                        i8 = -440091287;
                        i7 = iM2568 ^ i8;
                        CharSequence charSequence1119 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence1119;
                    }
                    charSequence4 = charSequence6;
                    charSequence12 = charSequence4;
                    charSequence6 = charSequence12;
                    int iM25616 = (C0630.m2566("֨ܽ") + i10) * 41;
                    int i111 = ((iM25616 ^ i11) * 14269) ^ (-470462387);
                    i7 = iM25616 ^ (-910338949);
                    i12 = i111;
                    pluginContext2 = pluginContext;
                    CharSequence charSequence11110 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence11110;
                    break;
                case -634784553:
                case 1238030596:
                    CharSequence charSequence24 = charSequenceM5739;
                    CharSequence charSequence25 = charSequence8;
                    CharSequence charSequence26 = charSequence12;
                    boolean z2 = charSequence25 instanceof String;
                    if (C1420.m4913()) {
                        int iM6985 = C2105.m6981("᩺۟") ^ i10;
                        charSequence8 = charSequence25;
                        i12 = ((iM6985 ^ i11) * 16763) ^ 306167735;
                        charSequence12 = charSequence26;
                        charSequenceM5739 = charSequence24;
                        c = '}';
                        i13 = iM6985 ^ (-1283200530);
                        z = z2;
                        pluginContext2 = pluginContext;
                    } else {
                        int iM6986 = C2105.m6981("᩷ۖ") ^ i10;
                        i12 = ((iM6986 ^ i11) * 18041) ^ 1187264144;
                        z = z2;
                        charSequence8 = charSequence25;
                        charSequenceM5739 = charSequence24;
                        pluginContext2 = pluginContext;
                        i13 = iM6986 ^ (-1946722405);
                        charSequence12 = charSequence26;
                        c = '}';
                    }
                    break;
                case -475623162:
                case 1546837787:
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    i15 = 0;
                    i16 = 3;
                    if (z) {
                        iM6981 = (C0630.m2566("ۡۜ") ^ i11) * 95;
                        i5 = ((iM6981 ^ i10) * (-15309)) ^ (-809619658);
                        i6 = 1154730950;
                    } else {
                        charSequence11 = charSequence8;
                        iM6981 = (C2105.m6981("᩵ۛ") ^ i11) * (-15);
                        i5 = ((iM6981 ^ i10) * 3869) ^ 406497364;
                        i6 = -1354582681;
                    }
                    i7 = iM6981 ^ i6;
                    i12 = i5;
                    charSequence12 = charSequence2;
                    pluginContext2 = pluginContext;
                    CharSequence charSequence11111 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence11111;
                    break;
                case -347271734:
                case 1315455483:
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    charSequence3 = charSequence8;
                    if (C3432.f10845 < 0) {
                        iM2567 = (C2105.m6981("֡ۙ") + i10) * 11;
                        i3 = ((iM2567 ^ i11) * 17413) ^ (-1162120985);
                        i4 = 204072408;
                        i7 = iM2567 ^ i4;
                        i12 = i3;
                        charSequence8 = charSequence3;
                        pluginContext2 = pluginContext;
                        charSequence12 = charSequence2;
                        CharSequence charSequence11112 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence11112;
                    } else {
                        charSequence8 = charSequence3;
                        iM6981 = C2105.m6981("ۛ۠") ^ i10;
                        i5 = ((iM6981 ^ i11) * (-3775)) ^ 103704818;
                        i6 = -1402534870;
                        i7 = iM6981 ^ i6;
                        i12 = i5;
                        charSequence12 = charSequence2;
                        pluginContext2 = pluginContext;
                        CharSequence charSequence11113 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence11113;
                    }
                    break;
                case -283530152:
                case 442705862:
                    str3 = (String) charSequence10;
                    if (C1711.m5741(str3) >= i16) {
                        iM2566 = (i11 - C2105.m6981("۬᩶")) * 43;
                        i = ((iM2566 ^ i10) * 9909) ^ 839809638;
                        i2 = 101904187;
                    } else {
                        charSequenceM5739 = charSequence10;
                        iM2566 = (C0630.m2566("᩹ܰ") + i10) * (-99);
                        i = ((iM2566 ^ i11) * 10925) ^ 265435548;
                        i2 = 1462049049;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -12622971:
                case 1647959553:
                    RunnableC1937.m6387();
                    if (C1047.f3863 < 0) {
                        iM2566 = (i11 - C0630.m2566("֫۫")) * 89;
                        i = ((iM2566 ^ i10) * 30133) ^ 1450674370;
                        i2 = 1080791205;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    } else {
                        charSequence = charSequenceM5739;
                        charSequence2 = charSequence12;
                        charSequence3 = charSequence8;
                        iM2567 = C0630.m2566("ۧܺ") ^ i11;
                        i3 = ((iM2567 ^ i10) * (-24327)) ^ (-1023428354);
                        i4 = 485095018;
                        i7 = iM2567 ^ i4;
                        i12 = i3;
                        charSequence8 = charSequence3;
                        pluginContext2 = pluginContext;
                        charSequence12 = charSequence2;
                        CharSequence charSequence11114 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence11114;
                    }
                    break;
                case 248689710:
                case 1816706489:
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    charSequence3 = charSequence8;
                    if (C4075.f12947 >= 0) {
                        iM2567 = (C2105.m6981("ܺۨ") + i10) * (-11);
                        i3 = ((iM2567 ^ i11) * 14623) ^ (-1019130783);
                        i4 = 2129542875;
                    } else {
                        iM2567 = (i10 - C2105.m6981("ۙۤ")) * (-15);
                        i3 = ((iM2567 ^ i11) * (-22803)) ^ (-336776393);
                        i4 = 359666073;
                    }
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    charSequence8 = charSequence3;
                    pluginContext2 = pluginContext;
                    charSequence12 = charSequence2;
                    CharSequence charSequence11115 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence11115;
                    break;
                case 293725809:
                case 1036129861:
                    C4075.m12263();
                    C1005.m3501();
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    iM6981 = (C0630.m2566("ܶ᩸") ^ i10) * 11;
                    i5 = ((iM6981 ^ i11) * 4295) ^ (-787234318);
                    i6 = 2032201284;
                    i7 = iM6981 ^ i6;
                    i12 = i5;
                    charSequence12 = charSequence2;
                    pluginContext2 = pluginContext;
                    CharSequence charSequence11116 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence11116;
                    break;
                case 313129048:
                case 1111271945:
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    charSequence3 = charSequence8;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2567 = C0630.m2566("ۧܺ") ^ i11;
                        i3 = ((iM2567 ^ i10) * (-24327)) ^ (-1023428354);
                        i4 = 485095018;
                    } else {
                        iM2567 = (C0630.m2566("֨᩷") ^ i10) * 29;
                        i3 = ((iM2567 ^ i11) * (-21075)) ^ 852655474;
                        i4 = 339871593;
                    }
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    charSequence8 = charSequence3;
                    pluginContext2 = pluginContext;
                    charSequence12 = charSequence2;
                    CharSequence charSequence11117 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence11117;
                    break;
                case 396192951:
                case 828455381:
                    String strM57311 = C1711.m5739(pluginContext2, str);
                    if (strM57311 != null) {
                        charSequence = charSequenceM5739;
                        charSequence7 = strM57311;
                    } else {
                        charSequence = charSequenceM5739;
                        charSequence7 = charSequence9;
                    }
                    iM2568 = (C2105.m6981("ۨۖ") ^ i10) * 65;
                    i12 = ((iM2568 ^ i11) * (-13909)) ^ 1361096465;
                    i8 = -751856211;
                    i7 = iM2568 ^ i8;
                    CharSequence charSequence11118 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence11118;
                    break;
                case 827801403:
                case 962445023:
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    charSequence3 = charSequence8;
                    if (C4117.f13076 <= 0) {
                        iM2567 = C0630.m2566("ۧܺ") ^ i11;
                        i3 = ((iM2567 ^ i10) * (-24327)) ^ (-1023428354);
                        i4 = 485095018;
                    } else {
                        iM2567 = C0630.m2566("֫᩷") ^ i11;
                        i3 = ((iM2567 ^ i10) * (-2679)) ^ 1404563569;
                        i4 = 411864931;
                    }
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    charSequence8 = charSequence3;
                    pluginContext2 = pluginContext;
                    charSequence12 = charSequence2;
                    CharSequence charSequence11119 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence11119;
                    break;
                case 880634844:
                case 1014707300:
                    charSequence = charSequenceM5739;
                    if (C0798.m3000(str2, i15) == c2) {
                        iM2568 = C0630.m2566("᩻᩺") ^ i11;
                        i12 = ((iM2568 ^ i10) * 22463) ^ (-1250771527);
                        i8 = -1631947157;
                        i7 = iM2568 ^ i8;
                        CharSequence charSequence111110 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence111110;
                    }
                    charSequence4 = charSequence6;
                    charSequence12 = charSequence4;
                    charSequence6 = charSequence12;
                    int iM25617 = (C0630.m2566("֨ܽ") + i10) * 41;
                    int i112 = ((iM25617 ^ i11) * 14269) ^ (-470462387);
                    i7 = iM25617 ^ (-910338949);
                    i12 = i112;
                    pluginContext2 = pluginContext;
                    CharSequence charSequence111111 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence111111;
                    break;
                case 1073977254:
                case 1180288031:
                    if (C0050.f910 < 0) {
                        iM2566 = (C0630.m2566("ۜ᩵") ^ i10) * (-91);
                        i = ((iM2566 ^ i11) * 22527) ^ (-398112269);
                        i2 = 1328424762;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    } else {
                        charSequence = charSequenceM5739;
                        charSequence2 = charSequence12;
                        iM6981 = (C0630.m2566("ܶ᩸") ^ i10) * 11;
                        i5 = ((iM6981 ^ i11) * 4295) ^ (-787234318);
                        i6 = 2032201284;
                        i7 = iM6981 ^ i6;
                        i12 = i5;
                        charSequence12 = charSequence2;
                        pluginContext2 = pluginContext;
                        CharSequence charSequence111112 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence111112;
                    }
                    break;
                case 1147405727:
                case 1236453294:
                    C1420.m4913();
                    if (C0964.m3413()) {
                        charSequence = charSequenceM5739;
                        charSequence2 = charSequence12;
                        charSequence3 = charSequence8;
                        iM2567 = (C2105.m6981("ܺۨ") + i10) * (-11);
                        i3 = ((iM2567 ^ i11) * 14623) ^ (-1019130783);
                        i4 = 2129542875;
                        i7 = iM2567 ^ i4;
                        i12 = i3;
                        charSequence8 = charSequence3;
                        pluginContext2 = pluginContext;
                        charSequence12 = charSequence2;
                        CharSequence charSequence111113 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence111113;
                    }
                    charSequence = charSequenceM5739;
                    charSequence2 = charSequence12;
                    charSequence3 = charSequence8;
                    iM2567 = C0630.m2566("ۧܺ") ^ i11;
                    i3 = ((iM2567 ^ i10) * (-24327)) ^ (-1023428354);
                    i4 = 485095018;
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    charSequence8 = charSequence3;
                    pluginContext2 = pluginContext;
                    charSequence12 = charSequence2;
                    CharSequence charSequence111114 = charSequence;
                    i13 = i7;
                    charSequenceM5739 = charSequence111114;
                    break;
                case 1219052891:
                case 1250119242:
                    if (C1128.m3851() <= 0) {
                        charSequence = charSequenceM5739;
                        charSequence2 = charSequence12;
                        charSequence3 = charSequence8;
                        iM2567 = C2105.m6981("᩷ۤ") ^ i11;
                        i3 = ((iM2567 ^ i10) * (-2059)) ^ 1888194294;
                        i4 = -990033810;
                        i7 = iM2567 ^ i4;
                        i12 = i3;
                        charSequence8 = charSequence3;
                        pluginContext2 = pluginContext;
                        charSequence12 = charSequence2;
                        CharSequence charSequence111115 = charSequence;
                        i13 = i7;
                        charSequenceM5739 = charSequence111115;
                    } else {
                        iM2566 = C2105.m6981("۟᩻") ^ i11;
                        i = ((iM2566 ^ i10) * 3729) ^ 857270593;
                        i2 = 318949268;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    }
                    break;
                default:
                    charSequenceM5739 = C1711.m5739(pluginContext2, str3);
                    if (charSequenceM5739 == null) {
                        charSequenceM5739 = charSequence10;
                    }
                    iM2566 = (C0630.m2566("᩹ܰ") + i10) * (-99);
                    i = ((iM2566 ^ i11) * 10925) ^ 265435548;
                    i2 = 1462049049;
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
            }
            return;
        }
    }
}
