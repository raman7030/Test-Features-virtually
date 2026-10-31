package l;

import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۘ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R2SJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4282 implements InterfaceC19805 {

    /* JADX INFO: renamed from: ᩹᩹ۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f13830 = {4483, 32311, 32360, 32372, 32365, 32383, 32369, 32374, 32311, 32372, 32369, 32363, 32364, 32311, 32379, 32365, 32362, 32362, 32381, 32374, 32364, 32328, 32377, 32383, 32381, 32364, 32375, 32364, 32377, 32372, 32328, 32377, 32383, 32381, 32369, 32364, 32381, 32373, 32363, 32371, 32369, 32374, 32380, 32366, 32379, 32363, 32375};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f13831;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f13832;

    @Override // l.InterfaceC19805
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8794() {
        int i = 0;
        int i2 = 485321128;
        int i3 = C4075.f12947;
        int i4 = C2167.f7158;
        int iM6981 = C2105.m6981("۟۠") ^ i3;
        int i5 = ((iM6981 ^ i4) * 10907) ^ (-2032448729);
        int i6 = 502978195;
        while (true) {
            i2 = ((((i2 ^ i4) * 18345) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2040401672:
                case 749413023:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6981 = C0630.m2566("ܶۙ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 12977) ^ (-1859234515);
                        i6 = -1563123955;
                    } else {
                        iM6981 = C0630.m2566("֨ܳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-25717)) ^ (-1396450477);
                        i6 = -553667727;
                    }
                    break;
                case -1853858239:
                case -629296604:
                    if (C3911.f12484 >= 0) {
                        iM6981 = (i4 - C0630.m2566("᩻֫")) * 29;
                        i5 = ((iM6981 ^ i3) * (-17043)) ^ (-1994848183);
                        i6 = -1294262431;
                    } else {
                        iM6981 = (C0630.m2566("ۤᩳ") + i4) * (-31);
                        i5 = ((iM6981 ^ i3) * (-10751)) ^ 883028903;
                        i6 = -243463595;
                    }
                    break;
                case -1845697433:
                case 1415016082:
                    if (C1420.f5096 <= 0) {
                        iM6981 = (i4 - C0630.m2566("᩻֫")) * 29;
                        i5 = ((iM6981 ^ i3) * (-17043)) ^ (-1994848183);
                        i6 = -1294262431;
                    } else {
                        iM6981 = (C2105.m6981("ۛۡ") + i4) * 19;
                        i5 = ((iM6981 ^ i3) * (-32265)) ^ (-1716066980);
                        i6 = -1873083897;
                    }
                    break;
                case -1784603478:
                case 1408294216:
                    if (C0483.m2121()) {
                        iM6981 = C0630.m2566("ᩳ֡") ^ i3;
                        i5 = ((iM6981 ^ i4) * 22299) ^ 1472207442;
                        i6 = 1298511163;
                    } else {
                        iM6981 = C0630.m2566("ۘۤ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 5133) ^ (-303060448);
                        i6 = 658721943;
                    }
                    break;
                case -1322799773:
                case 1428720475:
                    i = this.f13831;
                    if (i != 0) {
                        iM6981 = C2105.m6981("ۧۛ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-11337)) ^ (-372547961);
                        i6 = -1769436050;
                    } else {
                        iM6981 = (C2105.m6981("ۡ֡") ^ i3) * 91;
                        i5 = ((iM6981 ^ i4) * (-29199)) ^ 457227059;
                        i6 = 1544359596;
                    }
                    break;
                case -985817747:
                case 345039087:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("ۘۤ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 5133) ^ (-303060448);
                        i6 = 658721943;
                    } else {
                        iM6981 = C0630.m2566("᩷۫") ^ i4;
                        i5 = ((iM6981 ^ i3) * 17093) ^ 1824782519;
                        i6 = 52954454;
                    }
                    break;
                case -370138667:
                case 1903184228:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (i4 - C0630.m2566("᩻֫")) * 29;
                        i5 = ((iM6981 ^ i3) * (-17043)) ^ (-1994848183);
                        i6 = -1294262431;
                    } else {
                        iM6981 = C0630.m2566("۬ۢ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-19267)) ^ (-1445924533);
                        i6 = -980308099;
                    }
                    break;
                case -204991069:
                case 321044771:
                    return false;
                case -34497733:
                case 36111108:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("֨ܳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-25717)) ^ (-1396450477);
                        i6 = -553667727;
                    } else {
                        iM6981 = C0630.m2566("ۜۙ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-13173)) ^ 582362284;
                        i6 = -1260976401;
                    }
                    break;
                case -32171075:
                case 885863383:
                    C1711.m5736();
                    C1047.m3599();
                    return false;
                case 62576368:
                case 1305109459:
                    if (C3911.f12484 >= 0) {
                        iM6981 = C2105.m6981("ۤۤ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-4771)) ^ 882442323;
                        i6 = -1272066784;
                    } else {
                        iM6981 = C2105.m6981("ᩴۜ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-25325)) ^ 571108523;
                        i6 = -1191751340;
                    }
                    break;
                case 399907862:
                case 714041526:
                    C1005.m3501();
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("֨ܳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-25717)) ^ (-1396450477);
                        i6 = -553667727;
                    } else {
                        iM6981 = C0630.m2566("ۘۤ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 5133) ^ (-303060448);
                        i6 = 658721943;
                    }
                    break;
                case 449867667:
                case 1638066074:
                    if (C0050.m940() <= 0) {
                        iM6981 = C0630.m2566("ܶۙ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 12977) ^ (-1859234515);
                        i6 = -1563123955;
                    } else {
                        iM6981 = (C2105.m6981("ۚ۫") ^ i3) * (-19);
                        i5 = ((iM6981 ^ i4) * 2283) ^ 1724902116;
                        i6 = 1892881330;
                    }
                    break;
                case 711368950:
                case 1453593634:
                    if (!C0422.m1963()) {
                        iM6981 = C2105.m6981("ۤۤ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-4771)) ^ 882442323;
                        i6 = -1272066784;
                    } else {
                        iM6981 = C0630.m2566("ۘۤ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 5133) ^ (-303060448);
                        i6 = 658721943;
                    }
                    break;
                case 739699987:
                case 1836817798:
                    AbstractC2021.m6574();
                    iM6981 = C0630.m2566("ۘۤ") ^ i4;
                    i5 = ((iM6981 ^ i3) * 5133) ^ (-303060448);
                    i6 = 658721943;
                    break;
                case 974172445:
                case 1340005532:
                    if (i < this.f13832) {
                        iM6981 = (C2105.m6981("ۡ֡") ^ i3) * 91;
                        i5 = ((iM6981 ^ i4) * (-29199)) ^ 457227059;
                        i6 = 1544359596;
                    } else {
                        iM6981 = (C0630.m2566("ܿ۫") + i3) * 13;
                        i5 = ((iM6981 ^ i4) * 2473) ^ 1788816770;
                        i6 = -7771337;
                    }
                    break;
                case 1015860298:
                case 1373128135:
                    if (C4159.f13567) {
                        iM6981 = (C2105.m6981("֨ۘ") ^ i4) * (-11);
                        i5 = ((iM6981 ^ i3) * (-24199)) ^ (-476748905);
                        i6 = -667170710;
                    } else {
                        iM6981 = C0630.m2566("ۘۤ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 5133) ^ (-303060448);
                        i6 = 658721943;
                    }
                    break;
                case 1131630122:
                case 1595604928:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("ܶۙ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 12977) ^ (-1859234515);
                        i6 = -1563123955;
                    } else {
                        iM6981 = (C0630.m2566("ۗܳ") + i3) * 55;
                        i5 = ((iM6981 ^ i4) * (-13269)) ^ (-1160465679);
                        i6 = -1236372361;
                    }
                    break;
                default:
                    return true;
            }
        }
    }

    @Override // l.InterfaceC19805
    public final void reset() {
        this.f13832 = 0;
        this.f13831 = 0;
    }

    @Override // l.InterfaceC19805
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo8793() throws JSONException, C1637 {
        int iM6981;
        int i;
        int i2;
        String str;
        int i3;
        short[] sArr;
        boolean z;
        short[] sArr2;
        String str2;
        int iM2566;
        int i4;
        int i5;
        boolean z2;
        int iM35264;
        int iM2567;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int iM2568;
        JSONObject jSONObject;
        String str3;
        int i10 = 2098267624;
        int i11 = C0050.f910;
        int i12 = C4117.f13076;
        int iM2569 = (C0630.m2566("ܿۜ") ^ i12) * (-43);
        int i13 = ((iM2569 ^ i11) * 2349) ^ (-214125678);
        int i14 = iM2569 ^ 369050578;
        JSONObject jSONObjectM35267 = null;
        String str4 = null;
        ArrayList arrayList = null;
        C19099 c19099 = null;
        long jM10558 = 0;
        short[] sArr3 = null;
        int i15 = 0;
        boolean z4 = false;
        int i16 = 0;
        C14864 c14864 = null;
        short s = 0;
        int i17 = 0;
        int i18 = 0;
        JSONArray jSONArray = null;
        JSONObject jSONObject2 = null;
        String strM50614 = null;
        int i19 = 0;
        String strM50615 = null;
        int iM12255 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * 18347) >> 31));
            switch (i10) {
                case -2039073070:
                case 748862196:
                    z4 = z4;
                    i18 = i18;
                    sArr3 = sArr3;
                    String str5 = str4;
                    i16 = i16;
                    c14864 = c14864;
                    str = str5;
                    int i20 = s + 1;
                    if ((i20 * i20) - (i17 + 1) >= 0) {
                        iM2567 = C0630.m2566("۬۠") ^ i11;
                        i6 = ((iM2567 ^ i12) * (-9963)) ^ (-1173159929);
                        i7 = -2070640814;
                    } else {
                        iM2567 = (i12 - C0630.m2566("ۙܰ")) * 85;
                        i6 = ((iM2567 ^ i11) * (-3927)) ^ (-1385800214);
                        i7 = -883321452;
                    }
                    int i21 = iM2567 ^ i7;
                    sArr3 = sArr3;
                    i18 = i18;
                    z3 = z4;
                    i14 = i21;
                    i13 = i6;
                    z4 = z3;
                    String str6 = str;
                    c14864 = c14864;
                    i16 = i16;
                    str4 = str6;
                    break;
                case -2034960439:
                case -447367195:
                    c19099.m43989(jM10558);
                    z4 = z4;
                    if (C4075.m12255(jSONObject2, C0483.m2128(f13830, 46, 1, i15)) != 0) {
                        iM6981 = C2105.m6981("ᩴ֡") ^ i11;
                        i = ((iM6981 ^ i12) * (-32115)) ^ (-1881315638);
                        i2 = -31496352;
                    } else {
                        iM6981 = (i12 - C0630.m2566("ۙ۟")) * (-125);
                        i = ((iM6981 ^ i11) * 22195) ^ (-1201312627);
                        i2 = -916922134;
                    }
                    z2 = z4;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    z4 = z2;
                    break;
                case -1843339892:
                case -1037151353:
                    z4 = z4;
                    c19099.m44011(C4075.m12255(jSONObject2, C3663.m11162(f13830, 44, 1, i15)));
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6981 = (i11 - C0630.m2566("֫۟")) * (-21);
                        i = ((iM6981 ^ i12) * (-23359)) ^ 990150270;
                        i2 = 1679097686;
                        z2 = z4;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        z4 = z2;
                    } else {
                        i18 = i18;
                        sArr3 = sArr3;
                        String str7 = str4;
                        i16 = i16;
                        c14864 = c14864;
                        str = str7;
                        iM2567 = C0630.m2566("ܳۜ") ^ i11;
                        i6 = ((iM2567 ^ i12) * (-6401)) ^ (-1829752805);
                        i7 = 493704362;
                        int i22 = iM2567 ^ i7;
                        sArr3 = sArr3;
                        i18 = i18;
                        z3 = z4;
                        i14 = i22;
                        i13 = i6;
                        z4 = z3;
                        String str8 = str;
                        c14864 = c14864;
                        i16 = i16;
                        str4 = str8;
                    }
                    break;
                case -1830126487:
                case -298011019:
                    if (C11340.f33930 < 0) {
                        z = z4;
                        int i23 = i18;
                        sArr2 = sArr3;
                        iM35264 = i23;
                        String str9 = str4;
                        i16 = i16;
                        c14864 = c14864;
                        str2 = str9;
                        int iM6982 = C2105.m6981("ᩴ۟") ^ i12;
                        boolean z5 = z;
                        i14 = iM6982 ^ (-1818367375);
                        i13 = ((iM6982 ^ i11) * 11977) ^ (-253901257);
                        z4 = z5;
                        short[] sArr4 = sArr2;
                        i18 = iM35264;
                        sArr3 = sArr4;
                        String str10 = str2;
                        c14864 = c14864;
                        i16 = i16;
                        str4 = str10;
                    } else {
                        z4 = z4;
                        iM6981 = (C0630.m2566("ۡܺ") ^ i12) * (-45);
                        i = ((iM6981 ^ i11) * 28025) ^ (-1768059438);
                        i2 = -1497840314;
                        z2 = z4;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        z4 = z2;
                    }
                    break;
                case -1609934456:
                case 2091864086:
                    z4 = z4;
                    jSONObject2 = jSONArray.getJSONObject(i19);
                    c19099 = new C19099();
                    sArr3 = f13830;
                    i16 = 39;
                    iM6981 = C0630.m2566("ܶۙ") ^ i11;
                    i = ((iM6981 ^ i12) * (-10305)) ^ 2114227176;
                    i2 = 506237292;
                    z2 = z4;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    z4 = z2;
                    break;
                case -1579803403:
                case 1287076936:
                    z4 = z4;
                    c19099.m43990(strM50614);
                    c19099.m43997(C22628.m50614(jSONObject2, RunnableC1937.m6385(f13830, 43, 1, i15)));
                    if (C1294.m4372() <= 0) {
                        iM6981 = (i11 - C2105.m6981("۫᩸")) * 35;
                        i = ((iM6981 ^ i12) * (-10915)) ^ (-754410891);
                        i2 = 1682876079;
                    } else {
                        iM6981 = (C2105.m6981("֫ܳ") ^ i12) * 35;
                        i = ((iM6981 ^ i11) * 683) ^ 995006601;
                        i2 = 531586378;
                    }
                    z2 = z4;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    z4 = z2;
                    break;
                case -1541601722:
                case 2083688695:
                    boolean z6 = z4;
                    int i24 = i18;
                    this.f13832 = i24;
                    jSONObjectM35267 = c14864.m35267();
                    short[] sArr5 = sArr3;
                    String strM1840 = C0382.m1840(f13830, 34, 5, i15);
                    int iM6983 = (C2105.m6981("۠ۙ") + i12) * 83;
                    i13 = ((iM6983 ^ i11) * (-11515)) ^ (-151091563);
                    i16 = i16;
                    str4 = strM1840;
                    z4 = z6;
                    i14 = iM6983 ^ (-203284029);
                    sArr3 = sArr5;
                    i18 = i24;
                    break;
                case -1313958452:
                case 1490043379:
                    return arrayList;
                case -1287856408:
                case -506941464:
                    C3911.m11924();
                    z4 = z4;
                    iM6981 = (C0630.m2566("ۡܺ") ^ i12) * (-45);
                    i = ((iM6981 ^ i11) * 28025) ^ (-1768059438);
                    i2 = -1497840314;
                    z2 = z4;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    z4 = z2;
                    break;
                case -1265867288:
                case 1384076866:
                    z4 = z4;
                    strM50614 = C22628.m50614(jSONObject2, C2272.m7507(f13830, 42, 1, i15));
                    if (C3746.f11829 > 0) {
                        iM6981 = (C0630.m2566("᩸ۡ") + i11) * (-69);
                        i = ((iM6981 ^ i12) * (-12641)) ^ 515601848;
                        i2 = -1441322188;
                        z2 = z4;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        z4 = z2;
                    } else {
                        i3 = i18;
                        sArr = sArr3;
                        String str11 = str4;
                        i16 = i16;
                        c14864 = c14864;
                        str = str11;
                        iM2568 = (i12 - C0630.m2566("ۧۘ")) * (-75);
                        i9 = ((iM2568 ^ i11) * 22741) ^ (-423621072);
                        i8 = -1449104122;
                        i13 = i9;
                        sArr3 = sArr;
                        i18 = i3;
                        z3 = z4;
                        i14 = iM2568 ^ i8;
                        z4 = z3;
                        String str12 = str;
                        c14864 = c14864;
                        i16 = i16;
                        str4 = str12;
                    }
                    break;
                case -1252204529:
                case 580349355:
                    z4 = z4;
                    jM10558 = ServiceConnectionC3453.m10558(jSONObject2, C3019.m9250(f13830, 45, 1, i15));
                    iM6981 = (i12 - C2105.m6981("ܽ۫")) * 79;
                    i = ((iM6981 ^ i11) * 16309) ^ 1366161216;
                    i2 = 1096527806;
                    z2 = z4;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    z4 = z2;
                    break;
                case -1154219758:
                case 2016495469:
                    str = str4;
                    i15 = 32280;
                    iM2567 = C2105.m6981("ۗۘ") ^ i11;
                    i6 = ((iM2567 ^ i12) * 5711) ^ 268862531;
                    i7 = -494171962;
                    int i25 = iM2567 ^ i7;
                    sArr3 = sArr3;
                    i18 = i18;
                    z3 = z4;
                    i14 = i25;
                    i13 = i6;
                    z4 = z3;
                    String str13 = str;
                    c14864 = c14864;
                    i16 = i16;
                    str4 = str13;
                    break;
                case -984135107:
                case -801628043:
                    if (C3746.f11829 > 0) {
                        z4 = z4;
                        i18 = i18;
                        sArr3 = sArr3;
                        String str14 = str4;
                        i16 = i16;
                        c14864 = c14864;
                        str = str14;
                        iM2567 = C0630.m2566("ܳۜ") ^ i11;
                        i6 = ((iM2567 ^ i12) * (-6401)) ^ (-1829752805);
                        i7 = 493704362;
                        int i26 = iM2567 ^ i7;
                        sArr3 = sArr3;
                        i18 = i18;
                        z3 = z4;
                        i14 = i26;
                        i13 = i6;
                        z4 = z3;
                        String str15 = str;
                        c14864 = c14864;
                        i16 = i16;
                        str4 = str15;
                    } else {
                        z4 = z4;
                        iM6981 = (C0630.m2566("ۡܺ") ^ i12) * (-45);
                        i = ((iM6981 ^ i11) * 28025) ^ (-1768059438);
                        i2 = -1497840314;
                        z2 = z4;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        z4 = z2;
                    }
                    break;
                case -884435954:
                case -135522603:
                    z4 = z4;
                    c19099.m44008(iM12255);
                    strM50615 = C22628.m50614(jSONObject2, C3432.m10488(f13830, 40, 1, i15));
                    if (RunnableC3474.f10992 > 0) {
                        iM6981 = C2105.m6981("ܶۘ") ^ i12;
                        i = ((iM6981 ^ i11) * 7385) ^ 1396589277;
                        i2 = 1037143661;
                        z2 = z4;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        z4 = z2;
                    } else {
                        i3 = i18;
                        sArr = sArr3;
                        String str16 = str4;
                        i16 = i16;
                        c14864 = c14864;
                        str = str16;
                        iM2568 = (i12 - C0630.m2566("ۧۘ")) * (-75);
                        i9 = ((iM2568 ^ i11) * 22741) ^ (-423621072);
                        i8 = -1449104122;
                        i13 = i9;
                        sArr3 = sArr;
                        i18 = i3;
                        z3 = z4;
                        i14 = iM2568 ^ i8;
                        z4 = z3;
                        String str17 = str;
                        c14864 = c14864;
                        i16 = i16;
                        str4 = str17;
                    }
                    break;
                case -800697309:
                case 1024995041:
                    jSONObject = jSONObjectM35267;
                    str3 = str4;
                    JSONArray jSONArray2 = jSONObject.getJSONArray(str3);
                    arrayList = new ArrayList(jSONArray2.length());
                    i19 = 0;
                    jSONArray = jSONArray2;
                    int iM25610 = (C0630.m2566("ܰܰ") + i11) * (-33);
                    jSONObjectM35267 = jSONObject;
                    i13 = ((iM25610 ^ i12) * 23613) ^ (-1142352669);
                    str4 = str3;
                    z4 = z4;
                    i14 = iM25610 ^ (-1689137646);
                    break;
                case -494310844:
                case 1471218461:
                    z4 = z4;
                    iM12255 = C4075.m12255(jSONObject2, C0714.m2816(sArr3, i16, 1, i15));
                    if (C0964.f3626 != 0) {
                        iM6981 = (C0630.m2566("ۡܺ") ^ i12) * (-45);
                        i = ((iM6981 ^ i11) * 28025) ^ (-1768059438);
                        i2 = -1497840314;
                    } else {
                        iM6981 = (C2105.m6981("᩵᩸") ^ i12) * 127;
                        i = ((iM6981 ^ i11) * 19529) ^ 1705687796;
                        i2 = -975717902;
                    }
                    z2 = z4;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    z4 = z2;
                    break;
                case -413374895:
                case 982519624:
                    if (C5695.f17556 >= 0) {
                        z4 = z4;
                        iM6981 = (i11 - C2105.m6981("۫᩸")) * 35;
                        i = ((iM6981 ^ i12) * (-10915)) ^ (-754410891);
                        i2 = 1682876079;
                        z2 = z4;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        z4 = z2;
                    }
                    z4 = z4;
                    iM6981 = (C0630.m2566("ۡܺ") ^ i12) * (-45);
                    i = ((iM6981 ^ i11) * 28025) ^ (-1768059438);
                    i2 = -1497840314;
                    z2 = z4;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    z4 = z2;
                    break;
                case -381215188:
                case 506351468:
                    z = z4;
                    int i27 = i18;
                    sArr2 = sArr3;
                    String str18 = str4;
                    i16 = i16;
                    c14864 = c14864;
                    str2 = str18;
                    int i28 = this.f13831 + 1;
                    int i29 = C16275.f50041;
                    short[] sArr6 = f13830;
                    if (!RunnableC1108.f4040) {
                        iM35264 = i27;
                        int iM6984 = C2105.m6981("ᩴ۟") ^ i12;
                        boolean z7 = z;
                        i14 = iM6984 ^ (-1818367375);
                        i13 = ((iM6984 ^ i11) * 11977) ^ (-253901257);
                        z4 = z7;
                        short[] sArr7 = sArr2;
                        i18 = iM35264;
                        sArr3 = sArr7;
                        String str19 = str2;
                        c14864 = c14864;
                        i16 = i16;
                        str4 = str19;
                    } else {
                        StringBuilder sb = new StringBuilder(C2105.m6988(sArr6, 1, 13, i15));
                        C0050.m945(sb, i28);
                        C14864 c14864M41428 = C17687.m41422(C0050.m947(sb)).m41428();
                        if (c14864M41428.m35269()) {
                            iM2566 = (C2105.m6981("ۖۡ") + i12) * (-103);
                            i4 = ((iM2566 ^ i11) * 26753) ^ 994845010;
                            i5 = 1971721729;
                        } else {
                            iM2566 = C0630.m2566("᩶ۗ") ^ i11;
                            i4 = ((iM2566 ^ i12) * 22153) ^ (-70606449);
                            i5 = -230641411;
                        }
                        int i30 = iM2566 ^ i5;
                        i16 = i16;
                        str4 = str2;
                        c14864 = c14864M41428;
                        i13 = i4;
                        sArr3 = sArr2;
                        i18 = i27;
                        z2 = z;
                        i14 = i30;
                        z4 = z2;
                    }
                    break;
                case -171418297:
                case 1619271438:
                    z4 = z4;
                    if (i19 < jSONArray.length()) {
                        iM6981 = (C2105.m6981("᩺ۤ") ^ i11) * 109;
                        i = ((iM6981 ^ i12) * 30071) ^ 497704408;
                        i2 = -300818981;
                    } else {
                        iM6981 = C2105.m6981("ᩴۛ") ^ i12;
                        i = ((iM6981 ^ i11) * 25927) ^ (-1276374734);
                        i2 = 236642739;
                    }
                    z2 = z4;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    z4 = z2;
                    break;
                case -26437143:
                case 507481533:
                    z = z4;
                    sArr2 = sArr3;
                    String str20 = str4;
                    i16 = i16;
                    c14864 = c14864;
                    iM35264 = c14864.m35264(C0237.m1483(f13830, 25, 9, i15));
                    if (C3683.f11629 < 0) {
                        int iM25611 = (C0630.m2566("ۨۢ") + i12) * 29;
                        str = str20;
                        i13 = ((iM25611 ^ i11) * 13609) ^ 1005979223;
                        z4 = z;
                        i14 = iM25611 ^ (-1461903926);
                        i18 = iM35264;
                        sArr3 = sArr2;
                        String str110 = str;
                        c14864 = c14864;
                        i16 = i16;
                        str4 = str110;
                    } else {
                        str2 = str20;
                        int iM6985 = C2105.m6981("ᩴ۟") ^ i12;
                        boolean z8 = z;
                        i14 = iM6985 ^ (-1818367375);
                        i13 = ((iM6985 ^ i11) * 11977) ^ (-253901257);
                        z4 = z8;
                        short[] sArr8 = sArr2;
                        i18 = iM35264;
                        sArr3 = sArr8;
                        String str111 = str2;
                        c14864 = c14864;
                        i16 = i16;
                        str4 = str111;
                    }
                    break;
                case 45695878:
                case 1384377985:
                    z4 = true;
                    int iM25612 = (C0630.m2566("᩸ܽ") ^ i11) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i14 = iM25612 ^ (-737467318);
                    i13 = ((iM25612 ^ i12) * (-29039)) ^ (-430677954);
                    break;
                case 62650008:
                case 1628219683:
                    z4 = z4;
                    int i31 = i18;
                    sArr = sArr3;
                    String str21 = str4;
                    i16 = i16;
                    c14864 = c14864;
                    str = str21;
                    i3 = i31;
                    this.f13831 = c14864.m35264(C1128.m3841(f13830, 14, 11, i15));
                    if (C4075.f12947 >= 0) {
                        iM2568 = (i12 - C0630.m2566("ۧۘ")) * (-75);
                        i9 = ((iM2568 ^ i11) * 22741) ^ (-423621072);
                        i8 = -1449104122;
                    } else {
                        iM2568 = C2105.m6981("ۘۙ") ^ i11;
                        i9 = ((iM2568 ^ i12) * 25147) ^ 585052363;
                        i8 = -493204489;
                    }
                    i13 = i9;
                    sArr3 = sArr;
                    i18 = i3;
                    z3 = z4;
                    i14 = iM2568 ^ i8;
                    z4 = z3;
                    String str112 = str;
                    c14864 = c14864;
                    i16 = i16;
                    str4 = str112;
                    break;
                case 249992855:
                case 1242878125:
                    throw new C1637(c14864.m35265());
                case 405163964:
                case 595250631:
                    ViewOnClickListenerC1958.m6429();
                    return null;
                case 469692260:
                case 1367505149:
                    str = str4;
                    i15 = 12927;
                    iM2567 = C2105.m6981("ۗۘ") ^ i11;
                    i6 = ((iM2567 ^ i12) * 5711) ^ 268862531;
                    i7 = -494171962;
                    int i210 = iM2567 ^ i7;
                    sArr3 = sArr3;
                    i18 = i18;
                    z3 = z4;
                    i14 = i210;
                    i13 = i6;
                    z4 = z3;
                    String str113 = str;
                    c14864 = c14864;
                    i16 = i16;
                    str4 = str113;
                    break;
                case 820284131:
                case 1949234292:
                    c19099.m43992(z4);
                    C1916.m6307(arrayList, c19099);
                    i19++;
                    jSONObject = jSONObjectM35267;
                    str3 = str4;
                    int iM25613 = (C0630.m2566("ܰܰ") + i11) * (-33);
                    jSONObjectM35267 = jSONObject;
                    i13 = ((iM25613 ^ i12) * 23613) ^ (-1142352669);
                    str4 = str3;
                    z4 = z4;
                    i14 = iM25613 ^ (-1689137646);
                    break;
                case 1453498089:
                case 1774938428:
                    z4 = false;
                    int iM25614 = (C0630.m2566("᩸ܽ") ^ i11) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i14 = iM25614 ^ (-737467318);
                    i13 = ((iM25614 ^ i12) * (-29039)) ^ (-430677954);
                    break;
                case 1965181207:
                case 2044239792:
                    z4 = z4;
                    i18 = i18;
                    sArr3 = sArr3;
                    String str22 = str4;
                    i16 = i16;
                    c14864 = c14864;
                    str = str22;
                    s = f13830[0];
                    i17 = s * 2;
                    if (C0382.f1805) {
                        iM2567 = C2105.m6981("᩶۬") ^ i12;
                        i6 = ((iM2567 ^ i11) * (-8771)) ^ 662180564;
                        i7 = -792946877;
                    } else {
                        iM2567 = C0630.m2566("ܳۜ") ^ i11;
                        i6 = ((iM2567 ^ i12) * (-6401)) ^ (-1829752805);
                        i7 = 493704362;
                    }
                    int i211 = iM2567 ^ i7;
                    sArr3 = sArr3;
                    i18 = i18;
                    z3 = z4;
                    i14 = i211;
                    i13 = i6;
                    z4 = z3;
                    String str114 = str;
                    c14864 = c14864;
                    i16 = i16;
                    str4 = str114;
                    break;
                default:
                    z4 = z4;
                    c19099.m44015(strM50615);
                    c19099.m44009(C22628.m50614(jSONObject2, ViewOnClickListenerC1958.m6435(f13830, 41, 1, i15)));
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6981 = (C2105.m6981("ܰ۠") + i11) * 79;
                        i = ((iM6981 ^ i12) * (-27593)) ^ (-239341644);
                        i2 = -1522156233;
                        z2 = z4;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        z4 = z2;
                    } else {
                        i3 = i18;
                        sArr = sArr3;
                        String str115 = str4;
                        i16 = i16;
                        c14864 = c14864;
                        str = str115;
                        iM2568 = (i12 - C0630.m2566("ۧۘ")) * (-75);
                        i9 = ((iM2568 ^ i11) * 22741) ^ (-423621072);
                        i8 = -1449104122;
                        i13 = i9;
                        sArr3 = sArr;
                        i18 = i3;
                        z3 = z4;
                        i14 = iM2568 ^ i8;
                        z4 = z3;
                        String str116 = str;
                        c14864 = c14864;
                        i16 = i16;
                        str4 = str116;
                    }
                    break;
            }
        }
    }
}
