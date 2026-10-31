package l;

import android.os.IBinder;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܳܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V3Z0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14676 {

    /* JADX INFO: renamed from: ۘܶۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f44829 = {4300, 26830, -29989, 31574, -29525, 31170, -26862, -24461, 26050, 25243, 26111, -25711, -23343, -20878, 28848, 25525, -30615, -27447, -30533, -20979, -20565, 30229, 26004, 32693, -23069, -24933, -22099, 25189, -29252, -28259, 24730, 26731, -30887, -32135, -21376, 28835, -23982, -23488, 27360, -30288, -24206, -25842, -26829, 30850, 31651, -31322, -27722, -27544, 27757, 32755, -27379, 24857, 6862, -7161, -7153, -7154};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextView f44830;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final TextView f44831;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View f44832;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TextView f44833;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final TextView f44834;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final TextView f44835;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ImageView f44836;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final View f44837;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final TextView f44838;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ScrollView f44839;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f44840;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f44841;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final View f44842;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final TextView f44843;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ScrollView f44844;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f44845;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f44846;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TextView f44847;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final TextView f44848;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View f44849;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f44850;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0133, code lost:
    
        if (l.C4263.f13799 > 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C14676(AbstractActivityC3346 abstractActivityC3346) {
        int i;
        short[] sArr;
        short[] sArr2;
        int i2;
        int i3;
        short[] sArr3;
        int iM2566;
        int i4;
        short[] sArr4;
        short[] sArr5;
        int iM6981;
        int i5;
        short[] sArr6;
        short[] sArr7;
        short[] sArr8;
        short[] sArr9;
        int i6;
        int i7;
        int iM2567;
        int i8;
        int i9;
        int iM2568;
        int i10;
        int i11;
        int i12;
        int iM2569;
        int i13;
        short[] sArr10;
        int i14;
        int i15;
        short[] sArr11;
        int iM25610;
        int iM6982;
        int i16;
        final C14676 c14676 = this;
        int i17 = 200231813;
        int i18 = C3746.f11829;
        int i19 = C5695.f17556;
        short s = f44829[0];
        int i20 = s + 6914;
        int i21 = (s * s) + 47803396;
        int i22 = (i20 * i20) - (i21 + i21) <= 0 ? 63460 : 37575;
        int iM6983 = (C2105.m6981("ۛܶ") ^ i18) * 69;
        TextView textView = null;
        View viewM3507 = null;
        View viewM3508 = null;
        String str = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        int iM6431 = 0;
        int iM6984 = 0;
        int iM25611 = 0;
        int iM6985 = 0;
        int i23 = 0;
        int iM6986 = 0;
        int i24 = 0;
        int iM6987 = 0;
        int iM6988 = 0;
        int iM6989 = 0;
        int iM69810 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        View viewM28028 = null;
        TextView textView2 = null;
        ScrollView scrollView = null;
        String strM1840 = null;
        View viewM10739 = null;
        TextView textView3 = null;
        String strM12578 = null;
        View viewM3509 = null;
        TextView textView4 = null;
        TextView textView5 = null;
        ScrollView scrollView2 = null;
        TextView textView6 = null;
        TextView textView7 = null;
        TextView textView8 = null;
        TextView textView9 = null;
        TextView textView10 = null;
        int i28 = ((iM6983 ^ i19) * 23583) ^ (-1513015459);
        int i29 = iM6983 ^ (-737488334);
        short[] sArr16 = null;
        while (true) {
            i17 = i29 ^ (i28 & (((i17 ^ i19) * (-19361)) >> 31));
            switch (i17) {
                case -2117146613:
                case -1472372368:
                    i = i25;
                    sArr3 = sArr16;
                    TextView textView11 = (TextView) viewM3509;
                    c14676.f44848 = textView11;
                    String strM10633 = RunnableC3474.m10633(f44829, 19, 3, i22);
                    int iM25612 = C0630.m2566("᩵֨") ^ i19;
                    i28 = ((iM25612 ^ i18) * 18659) ^ 1803930985;
                    i29 = iM25612 ^ (-666074272);
                    i27 = i27;
                    textView = textView11;
                    sArr15 = sArr15;
                    i26 = i26;
                    sArr14 = sArr14;
                    str = strM10633;
                    sArr16 = sArr3;
                    i25 = i;
                    break;
                case -2083589360:
                case 1337696900:
                    C3911.m11924();
                    i = i25;
                    sArr3 = sArr16;
                    int iM69811 = C2105.m6981("ۡܽ") ^ i18;
                    i28 = 1839816161 ^ ((iM69811 ^ i19) * 10263);
                    i29 = 1252323436 ^ iM69811;
                    sArr16 = sArr3;
                    i25 = i;
                    break;
                case -2066319502:
                case 1186069089:
                    i = i25;
                    sArr6 = sArr12;
                    sArr7 = sArr13;
                    sArr8 = sArr14;
                    sArr9 = sArr15;
                    i6 = i26;
                    i7 = i27;
                    sArr3 = sArr16;
                    viewM10739 = C3537.m10739(abstractActivityC3346, iM6984);
                    c14676.f44837 = viewM10739;
                    strM12578 = C4159.m12578(f44829, 4, 3, i22);
                    if (C0798.m2998() != 0) {
                        iM2567 = (C0630.m2566("ۡۡ") + i19) * 99;
                        i8 = ((iM2567 ^ i18) * (-1059)) ^ (-324914444);
                        i9 = 1063801109;
                    } else {
                        iM2567 = C0630.m2566("᩹ۢ") ^ i19;
                        i8 = ((iM2567 ^ i18) * (-11807)) ^ 444926055;
                        i9 = -279948283;
                    }
                    i29 = i9 ^ iM2567;
                    c14676 = this;
                    sArr12 = sArr6;
                    i27 = i7;
                    sArr15 = sArr9;
                    i26 = i6;
                    sArr14 = sArr8;
                    sArr13 = sArr7;
                    i28 = i8;
                    sArr16 = sArr3;
                    i25 = i;
                    break;
                case -2015471964:
                case -870683948:
                    sArr11 = sArr16;
                    c14676.f44849 = C1005.m3507(viewM10739, iM6989 ^ 2119735797);
                    iM25610 = C0630.m2566(C7811.m20837(f44829, 43, 3, i22)) ^ 2099363420;
                    if (C4159.f13567) {
                        iM6982 = C2105.m6981("ᩴ۬") ^ i18;
                        i28 = ((iM6982 ^ i19) * (-18995)) ^ 1918556739;
                        i16 = 1125639214;
                    } else {
                        iM6982 = (i18 - C0630.m2566("᩸᩻")) * 7;
                        i28 = ((iM6982 ^ i19) * 2139) ^ 1800091676;
                        i16 = 666976608;
                    }
                    i29 = iM6982 ^ i16;
                    short[] sArr17 = sArr11;
                    i25 = iM25610;
                    sArr16 = sArr17;
                    break;
                case -1934678386:
                case 897096420:
                    i = i25;
                    sArr = sArr14;
                    sArr2 = sArr15;
                    i2 = i26;
                    i3 = i27;
                    sArr3 = sArr16;
                    textView9 = (TextView) C11340.m28028(viewM10739, C2105.m6981(str) ^ 2119610707);
                    c14676.f44831 = textView9;
                    iM2566 = (i19 - C2105.m6981("ۢۤ")) * 13;
                    i28 = 2067372911 ^ ((iM2566 ^ i18) * 6433);
                    i4 = -1155909667;
                    i29 = i4 ^ iM2566;
                    i27 = i3;
                    sArr16 = sArr3;
                    sArr15 = sArr2;
                    i25 = i;
                    i26 = i2;
                    sArr14 = sArr;
                    break;
                case -1904339074:
                case 292381016:
                    i = i25;
                    sArr3 = sArr16;
                    short[] sArr18 = sArr14;
                    viewM3508 = C1005.m3507(viewM10739, C0630.m2566(C0630.m2575(sArr18, 34, 3, i22)) ^ 2121124371);
                    int iM25613 = (C0630.m2566("ۚۜ") + i19) * (-7);
                    i12 = ((iM25613 ^ i18) * (-28475)) ^ 1323592695;
                    i13 = iM25613 ^ 2043303470;
                    sArr14 = sArr18;
                    i27 = i27;
                    sArr15 = sArr15;
                    i26 = i26;
                    i28 = i12;
                    i29 = i13;
                    sArr16 = sArr3;
                    i25 = i;
                    break;
                case -1738898092:
                case -711405866:
                    i = i25;
                    sArr8 = sArr14;
                    sArr9 = sArr15;
                    i6 = i26;
                    i7 = i27;
                    sArr3 = sArr16;
                    sArr7 = sArr13;
                    iM6986 = C2105.m6981(C1711.m5726(f44829, 13, 3, i22));
                    i24 = 2120959918;
                    iM2568 = (i19 - C0630.m2566("ۖۨ")) * (-95);
                    i28 = (-1900628285) ^ ((iM2568 ^ i18) * 15211);
                    i10 = -1845410374;
                    i29 = i10 ^ iM2568;
                    i27 = i7;
                    sArr16 = sArr3;
                    sArr15 = sArr9;
                    i25 = i;
                    i26 = i6;
                    sArr14 = sArr8;
                    sArr13 = sArr7;
                    break;
                case -1738835943:
                case -193400366:
                    i = i25;
                    sArr10 = sArr15;
                    i14 = i26;
                    i15 = i27;
                    sArr3 = sArr16;
                    TextView textView12 = (TextView) C1005.m3507(viewM10739, iM6988 ^ 2104432592);
                    c14676.f44843 = textView12;
                    sArr14 = f44829;
                    if (C0964.f3626 == 0) {
                        int iM25614 = (C0630.m2566("᩹᩵") + i18) * (-65);
                        i28 = ((iM25614 ^ i19) * (-24153)) ^ (-665409922);
                        i29 = iM25614 ^ 1870885057;
                        textView7 = textView12;
                        i27 = i15;
                        sArr16 = sArr3;
                        sArr15 = sArr10;
                        i25 = i;
                        i26 = i14;
                    } else {
                        textView7 = textView12;
                        i27 = i15;
                        sArr15 = sArr10;
                        i26 = i14;
                        int iM69812 = C2105.m6981("ۡܽ") ^ i18;
                        i28 = 1839816161 ^ ((iM69812 ^ i19) * 10263);
                        i29 = 1252323436 ^ iM69812;
                        sArr16 = sArr3;
                        i25 = i;
                    }
                    break;
                case -1620682858:
                case 746415349:
                    RunnableC0588.m2441();
                    throw new RuntimeException();
                case -1513223721:
                case -1327807796:
                    i = i25;
                    sArr = sArr14;
                    sArr2 = sArr15;
                    i2 = i26;
                    i3 = i27;
                    sArr3 = sArr16;
                    iM6987 = C2105.m6981(C3245.m9934(f44829, 22, 3, i22));
                    if (C2105.m6982() == 0) {
                        iM2566 = C0630.m2566("֨ᩳ") ^ i18;
                        i28 = (-1919554123) ^ ((iM2566 ^ i19) * (-6983));
                        i4 = 2134631269;
                        i29 = i4 ^ iM2566;
                        i27 = i3;
                        sArr16 = sArr3;
                        sArr15 = sArr2;
                        i25 = i;
                        i26 = i2;
                        sArr14 = sArr;
                    } else {
                        i27 = i3;
                        sArr15 = sArr2;
                        i26 = i2;
                        sArr14 = sArr;
                        int iM69813 = C2105.m6981("ۡܽ") ^ i18;
                        i28 = 1839816161 ^ ((iM69813 ^ i19) * 10263);
                        i29 = 1252323436 ^ iM69813;
                        sArr16 = sArr3;
                        i25 = i;
                    }
                    break;
                case -1464511539:
                case 1600569361:
                    i = i25;
                    sArr7 = sArr13;
                    sArr8 = sArr14;
                    sArr9 = sArr15;
                    i6 = i26;
                    i7 = i27;
                    sArr3 = sArr16;
                    viewM28028 = C11340.m28028(viewM10739, iM6985 ^ i23);
                    c14676.f44832 = viewM28028;
                    strM1840 = C0382.m1840(f44829, 10, 3, i22);
                    iM2568 = (C0630.m2566("ܺۛ") ^ i18) * (-33);
                    i28 = 2102869703 ^ ((iM2568 ^ i19) * (-17785));
                    i10 = -150981557;
                    i29 = i10 ^ iM2568;
                    i27 = i7;
                    sArr16 = sArr3;
                    sArr15 = sArr9;
                    i25 = i;
                    i26 = i6;
                    sArr14 = sArr8;
                    sArr13 = sArr7;
                    break;
                case -1423526644:
                case -88979201:
                    i = i25;
                    sArr3 = sArr16;
                    TextView textView13 = (TextView) viewM3508;
                    c14676.f44833 = textView13;
                    sArr15 = f44829;
                    i26 = 37;
                    i27 = 3;
                    if (C1294.f4556 >= 0) {
                        textView3 = textView13;
                        int iM69814 = C2105.m6981("ۡܽ") ^ i18;
                        i28 = 1839816161 ^ ((iM69814 ^ i19) * 10263);
                        i29 = 1252323436 ^ iM69814;
                    } else {
                        int iM25615 = (C0630.m2566("ܺ᩻") ^ i18) * 127;
                        i28 = ((iM25615 ^ i19) * 16109) ^ (-912600430);
                        i29 = iM25615 ^ 1792943027;
                        textView3 = textView13;
                    }
                    sArr16 = sArr3;
                    i25 = i;
                    break;
                case -1411808484:
                case 1792898591:
                    i = i25;
                    sArr = sArr14;
                    sArr2 = sArr15;
                    i2 = i26;
                    i3 = i27;
                    sArr3 = sArr16;
                    textView10 = (TextView) C11340.m28028(viewM10739, iM6986 ^ i24);
                    c14676.f44847 = textView10;
                    sArr13 = f44829;
                    if (C4159.m12565() >= 0) {
                        iM2566 = C0630.m2566("᩷ۙ") ^ i19;
                        i28 = 553981630 ^ ((iM2566 ^ i18) * (-30363));
                        i4 = 185179394;
                    } else {
                        iM2566 = (i18 - C0630.m2566("᩵᩻")) * (-71);
                        i28 = (-1288688929) ^ ((iM2566 ^ i19) * (-32679));
                        i4 = 2041242243;
                    }
                    i29 = i4 ^ iM2566;
                    i27 = i3;
                    sArr16 = sArr3;
                    sArr15 = sArr2;
                    i25 = i;
                    i26 = i2;
                    sArr14 = sArr;
                    break;
                case -1389689419:
                case 676613266:
                    i = i25;
                    sArr = sArr14;
                    sArr2 = sArr15;
                    i2 = i26;
                    i3 = i27;
                    sArr3 = sArr16;
                    textView8 = (TextView) C11340.m28028(viewM10739, iM25611);
                    c14676.f44834 = textView8;
                    viewM3507 = C1005.m3507(viewM10739, C0630.m2566(C1005.m3502(f44829, 28, 3, i22)) ^ 2127708221);
                    if (C0964.f3626 == 0) {
                        iM2566 = (C0630.m2566("ۤܿ") ^ i18) * (-119);
                        i28 = 1196392133 ^ ((iM2566 ^ i19) * 13679);
                        i4 = -460260383;
                        i29 = i4 ^ iM2566;
                        i27 = i3;
                        sArr16 = sArr3;
                        sArr15 = sArr2;
                        i25 = i;
                        i26 = i2;
                        sArr14 = sArr;
                    } else {
                        sArr4 = sArr12;
                        sArr5 = sArr13;
                        iM2569 = (i18 - C0630.m2566("᩵ܳ")) * 69;
                        i12 = ((iM2569 ^ i19) * 16805) ^ (-1434679173);
                        i11 = -1849417261;
                        i13 = iM2569 ^ i11;
                        sArr12 = sArr4;
                        i27 = i3;
                        sArr15 = sArr2;
                        i26 = i2;
                        sArr14 = sArr;
                        sArr13 = sArr5;
                        i28 = i12;
                        i29 = i13;
                        sArr16 = sArr3;
                        i25 = i;
                    }
                    break;
                case -1375692506:
                case 1823369828:
                    i = i25;
                    sArr6 = sArr12;
                    sArr7 = sArr13;
                    sArr8 = sArr14;
                    sArr9 = sArr15;
                    i6 = i26;
                    i7 = i27;
                    sArr3 = sArr16;
                    iM6984 = C2105.m6981(C2167.m7159(f44829, 1, 3, i22)) ^ 2103980834;
                    iM2567 = C0630.m2566("ۨ۫") ^ i18;
                    i8 = ((iM2567 ^ i19) * (-21503)) ^ (-97047390);
                    i9 = -502275436;
                    i29 = i9 ^ iM2567;
                    c14676 = this;
                    sArr12 = sArr6;
                    i27 = i7;
                    sArr15 = sArr9;
                    i26 = i6;
                    sArr14 = sArr8;
                    sArr13 = sArr7;
                    i28 = i8;
                    sArr16 = sArr3;
                    i25 = i;
                    break;
                case -1375185326:
                case 1864457263:
                    int i30 = i25;
                    int i31 = i26;
                    i15 = i27;
                    sArr3 = sArr16;
                    short[] sArr19 = sArr15;
                    sArr10 = sArr19;
                    TextView textView14 = (TextView) C1005.m3507(viewM10739, C2105.m6981(C11340.m28025(sArr19, i31, i15, i22)) ^ 2118614762);
                    c14676.f44838 = textView14;
                    textView6 = textView14;
                    i = i30;
                    i14 = i31;
                    iM6989 = C2105.m6981(C22628.m50602(f44829, 40, 3, i22));
                    int iM25616 = C0630.m2566("ܿ᩵") ^ i19;
                    i28 = 723022452 ^ ((iM25616 ^ i18) * (-17703));
                    i29 = 1793691109 ^ iM25616;
                    i27 = i15;
                    sArr16 = sArr3;
                    sArr15 = sArr10;
                    i25 = i;
                    i26 = i14;
                    break;
                case -1250651671:
                case 1389254403:
                    i = i25;
                    sArr5 = sArr13;
                    sArr = sArr14;
                    sArr2 = sArr15;
                    i2 = i26;
                    i3 = i27;
                    sArr3 = sArr16;
                    sArr4 = sArr12;
                    iM6985 = C2105.m6981(C2958.m9031(sArr4, 7, 3, i22));
                    i23 = 2119242976;
                    if (C4075.f12947 >= 0) {
                        iM2569 = (i18 - C0630.m2566("᩵ܳ")) * 69;
                        i12 = ((iM2569 ^ i19) * 16805) ^ (-1434679173);
                        i11 = -1849417261;
                    } else {
                        iM2569 = C0630.m2566("۫ۜ") ^ i18;
                        i12 = ((iM2569 ^ i19) * (-20223)) ^ 371079999;
                        i11 = -831732103;
                    }
                    i13 = iM2569 ^ i11;
                    sArr12 = sArr4;
                    i27 = i3;
                    sArr15 = sArr2;
                    i26 = i2;
                    sArr14 = sArr;
                    sArr13 = sArr5;
                    i28 = i12;
                    i29 = i13;
                    sArr16 = sArr3;
                    i25 = i;
                    break;
                case -998225416:
                case 841802031:
                    textView5 = (TextView) C11340.m28028(viewM10739, C2105.m6981(C4263.m12817(sArr16, 49, 3, i22)) ^ 2097245878);
                    c14676.f44840 = textView5;
                    ViewOnClickListenerC14813.m35215(textView10);
                    ViewOnClickListenerC14813.m35215(textView);
                    if (C1294.f4556 < 0) {
                        iM6981 = C2105.m6981("ۙۤ") ^ i19;
                        i28 = ((iM6981 ^ i18) * (-57)) ^ 1127409420;
                        i5 = -1820967147;
                        i29 = iM6981 ^ i5;
                    } else {
                        i = i25;
                        sArr = sArr14;
                        sArr2 = sArr15;
                        i2 = i26;
                        i3 = i27;
                        sArr3 = sArr16;
                        iM2566 = C0630.m2566("᩷ۙ") ^ i19;
                        i28 = 553981630 ^ ((iM2566 ^ i18) * (-30363));
                        i4 = 185179394;
                        i29 = i4 ^ iM2566;
                        i27 = i3;
                        sArr16 = sArr3;
                        sArr15 = sArr2;
                        i25 = i;
                        i26 = i2;
                        sArr14 = sArr;
                    }
                    break;
                case -914673571:
                case 1257284919:
                    i = i25;
                    sArr7 = sArr13;
                    sArr8 = sArr14;
                    sArr9 = sArr15;
                    i6 = i26;
                    i7 = i27;
                    sArr3 = sArr16;
                    c14676.f44836 = (ImageView) C1005.m3507(viewM10739, C2105.m6981(strM1840) ^ 2101079747);
                    if (!C1711.f5919) {
                        iM2568 = C2105.m6981("ۤۘ") ^ i19;
                        i28 = (-1678389280) ^ ((iM2568 ^ i18) * 11099);
                        i10 = 951005941;
                        i29 = i10 ^ iM2568;
                        i27 = i7;
                        sArr16 = sArr3;
                        sArr15 = sArr9;
                        i25 = i;
                        i26 = i6;
                        sArr14 = sArr8;
                        sArr13 = sArr7;
                    } else {
                        sArr6 = sArr12;
                        iM2567 = (C0630.m2566("ۡۡ") + i19) * 99;
                        i8 = ((iM2567 ^ i18) * (-1059)) ^ (-324914444);
                        i9 = 1063801109;
                        i29 = i9 ^ iM2567;
                        c14676 = this;
                        sArr12 = sArr6;
                        i27 = i7;
                        sArr15 = sArr9;
                        i26 = i6;
                        sArr14 = sArr8;
                        sArr13 = sArr7;
                        i28 = i8;
                        sArr16 = sArr3;
                        i25 = i;
                    }
                    break;
                case -905551651:
                case 1193996791:
                    scrollView = (ScrollView) C1005.m3507(viewM10739, iM69810 ^ 2123317361);
                    c14676.f44844 = scrollView;
                    sArr16 = f44829;
                    iM6981 = C0630.m2566("ۜۛ") ^ i18;
                    i28 = ((iM6981 ^ i19) * 21897) ^ (-757210782);
                    i5 = -1571169694;
                    i29 = iM6981 ^ i5;
                    break;
                case -763856078:
                case 634230323:
                    int i32 = i25;
                    c14676.f44842 = C1005.m3507(viewM10739, i32);
                    short[] sArr20 = sArr16;
                    iM69810 = C2105.m6981(C0964.m3396(f44829, 46, 3, i22));
                    int iM25617 = C0630.m2566("ۤۗ") ^ i19;
                    i28 = ((iM25617 ^ i18) * 2373) ^ (-1768091601);
                    i29 = iM25617 ^ (-1440936493);
                    sArr16 = sArr20;
                    i25 = i32;
                    break;
                case -733156145:
                case 2021296253:
                    i = i25;
                    sArr2 = sArr15;
                    i2 = i26;
                    i3 = i27;
                    sArr3 = sArr16;
                    TextView textView15 = (TextView) viewM3507;
                    c14676.f44830 = textView15;
                    textView4 = textView15;
                    sArr = sArr14;
                    iM6988 = C2105.m6981(C2126.m7036(f44829, 31, 3, i22));
                    iM2566 = (C0630.m2566("᩸ܽ") + i19) * (-39);
                    i28 = 1777946152 ^ ((iM2566 ^ i18) * (-19045));
                    i4 = 677578350;
                    i29 = i4 ^ iM2566;
                    i27 = i3;
                    sArr16 = sArr3;
                    sArr15 = sArr2;
                    i25 = i;
                    i26 = i2;
                    sArr14 = sArr;
                    break;
                case -588198855:
                case 1555929855:
                    scrollView.setScrollBarSize(iM6431);
                    scrollView.setOnTouchListener(new View.OnTouchListener() { // from class: l.֫ܿ᩷
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            int i33 = 412554518;
                            int i34 = C22628.f73083;
                            int i35 = C0050.f910;
                            int iM25618 = C0630.m2566("ۨܳ") ^ i35;
                            int i36 = ((iM25618 ^ i34) * 7179) ^ (-1469165999);
                            int i37 = 153991012;
                            while (true) {
                                i33 = ((((i33 ^ i34) * (-32635)) >> 31) & i36) ^ (iM25618 ^ i37);
                                switch (i33) {
                                    case -2145167352:
                                    case 797494954:
                                        if (C1047.f3863 < 0) {
                                            iM25618 = (C2105.m6981("᩺᩻") ^ i34) * (-27);
                                            i36 = ((iM25618 ^ i35) * (-2357)) ^ (-2003614063);
                                            i37 = -744105398;
                                        } else {
                                            iM25618 = C2105.m6981("ܶۜ") ^ i35;
                                            i36 = ((iM25618 ^ i34) * (-6335)) ^ (-1894105230);
                                            i37 = -1094453461;
                                        }
                                        break;
                                    case -2130802165:
                                    case -985955924:
                                        C3019.m9255();
                                        if (C3746.m11369() < 0) {
                                            iM25618 = C2105.m6981("ۙۜ") ^ i35;
                                            i36 = ((iM25618 ^ i34) * (-18693)) ^ 1260195051;
                                            i37 = 2089197152;
                                        } else {
                                            iM25618 = C2105.m6981("ܶۜ") ^ i35;
                                            i36 = ((iM25618 ^ i34) * (-6335)) ^ (-1894105230);
                                            i37 = -1094453461;
                                        }
                                        break;
                                    case -2097290848:
                                    case 508948634:
                                        C3911.m11924();
                                        C2958.m9034();
                                        iM25618 = C2105.m6981("ܶۜ") ^ i35;
                                        i36 = ((iM25618 ^ i34) * (-6335)) ^ (-1894105230);
                                        i37 = -1094453461;
                                        break;
                                    case -1973697174:
                                    case 170881191:
                                        if (!C3663.f11553) {
                                            iM25618 = C2105.m6981("ۜ֨") ^ i34;
                                            i36 = ((iM25618 ^ i35) * (-12459)) ^ 212121363;
                                            i37 = -1256368476;
                                        } else {
                                            iM25618 = C2105.m6981("ۙۜ") ^ i35;
                                            i36 = ((iM25618 ^ i34) * (-18693)) ^ 1260195051;
                                            i37 = 2089197152;
                                        }
                                        break;
                                    case -1930020030:
                                    case -1533443743:
                                        if (C1504.f5354) {
                                            iM25618 = C2105.m6981("ۜ֨") ^ i34;
                                            i36 = ((iM25618 ^ i35) * (-12459)) ^ 212121363;
                                            i37 = -1256368476;
                                        } else {
                                            iM25618 = C2105.m6981("֡ۖ") ^ i34;
                                            i36 = ((iM25618 ^ i35) * (-4763)) ^ (-633638167);
                                            i37 = -1860514249;
                                        }
                                        break;
                                    case -1898430101:
                                    case 1495604076:
                                        if (C1128.m3851() <= 0) {
                                            iM25618 = C0630.m2566("ܰۡ") ^ i35;
                                            i36 = ((iM25618 ^ i34) * 28979) ^ (-281472458);
                                            i37 = -158693283;
                                        } else {
                                            iM25618 = (C2105.m6981("ۢ۫") ^ i35) * 73;
                                            i36 = ((iM25618 ^ i34) * 28985) ^ (-1222751901);
                                            i37 = -941253970;
                                        }
                                        break;
                                    case -1467119901:
                                    case 1865630930:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            iM25618 = C2105.m6981("ۜ֨") ^ i34;
                                            i36 = ((iM25618 ^ i35) * (-12459)) ^ 212121363;
                                            i37 = -1256368476;
                                        } else {
                                            iM25618 = C2105.m6981("᩶ۨ") ^ i35;
                                            i36 = ((iM25618 ^ i34) * (-17335)) ^ (-1455437292);
                                            i37 = 204040043;
                                        }
                                        break;
                                    case -1093167340:
                                    case 1233089779:
                                        this.f6629.m34965(motionEvent);
                                        break;
                                    case -893613194:
                                    case -861826244:
                                        if (C11340.f33930 >= 0) {
                                            iM25618 = (C2105.m6981("᩺᩻") ^ i34) * (-27);
                                            i36 = ((iM25618 ^ i35) * (-2357)) ^ (-2003614063);
                                            i37 = -744105398;
                                        } else {
                                            iM25618 = C0630.m2566("ܿۜ") ^ i35;
                                            i36 = ((iM25618 ^ i34) * 22217) ^ 771540404;
                                            i37 = 284801914;
                                        }
                                        break;
                                    case -889399211:
                                    case -57716207:
                                        if (C21923.f70183 != 0) {
                                            iM25618 = (C2105.m6981("᩺᩻") ^ i34) * (-27);
                                            i36 = ((iM25618 ^ i35) * (-2357)) ^ (-2003614063);
                                            i37 = -744105398;
                                        } else {
                                            iM25618 = C0630.m2566("ۘܿ") ^ i34;
                                            i36 = ((iM25618 ^ i35) * 20799) ^ 233504995;
                                            i37 = 517412099;
                                        }
                                        break;
                                    case -843761259:
                                    case 724879495:
                                        if (C1420.f5096 <= 0) {
                                            iM25618 = C2105.m6981("ۙۜ") ^ i35;
                                            i36 = ((iM25618 ^ i34) * (-18693)) ^ 1260195051;
                                            i37 = 2089197152;
                                        } else {
                                            iM25618 = C2105.m6981("ۖܺ") ^ i35;
                                            i36 = ((iM25618 ^ i34) * (-7487)) ^ (-1267203139);
                                            i37 = 1411924108;
                                        }
                                        break;
                                    case -515809222:
                                    case 1113984006:
                                        RunnableC3474.m10630();
                                        break;
                                    case -329498292:
                                    case 537695685:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM25618 = C2105.m6981("ܶۜ") ^ i35;
                                            i36 = ((iM25618 ^ i34) * (-6335)) ^ (-1894105230);
                                            i37 = -1094453461;
                                        } else {
                                            iM25618 = C2105.m6981("᩶ۜ") ^ i34;
                                            i36 = ((iM25618 ^ i35) * 13169) ^ (-1433656598);
                                            i37 = -14883440;
                                        }
                                        break;
                                    case -259047150:
                                    case 1371400428:
                                        if (C3537.f11231 >= 0) {
                                            iM25618 = C0630.m2566("ܰۡ") ^ i35;
                                            i36 = ((iM25618 ^ i34) * 28979) ^ (-281472458);
                                            i37 = -158693283;
                                        } else {
                                            iM25618 = C2105.m6981("ۘۙ") ^ i34;
                                            i36 = ((iM25618 ^ i35) * (-5035)) ^ (-1160239110);
                                            i37 = 2090641681;
                                        }
                                        break;
                                    case -175605916:
                                    case 1043162868:
                                        if (C4616.m13552() != 0) {
                                            iM25618 = C2105.m6981("ۜ֨") ^ i34;
                                            i36 = ((iM25618 ^ i35) * (-12459)) ^ 212121363;
                                            i37 = -1256368476;
                                        } else {
                                            iM25618 = C2105.m6981("᩻ۧ") ^ i35;
                                            i36 = ((iM25618 ^ i34) * 30719) ^ (-1249507905);
                                            i37 = 1884298693;
                                        }
                                        break;
                                    default:
                                        if (C2126.f7087) {
                                            iM25618 = C2105.m6981("ܶۜ") ^ i35;
                                            i36 = ((iM25618 ^ i34) * (-6335)) ^ (-1894105230);
                                            i37 = -1094453461;
                                        } else {
                                            iM25618 = C0630.m2566("ܿܳ") ^ i34;
                                            i36 = ((iM25618 ^ i35) * 28393) ^ 1709461211;
                                            i37 = -1153720228;
                                        }
                                        break;
                                }
                                return false;
                            }
                        }
                    });
                    textView5.setOnTouchListener(new View.OnTouchListener() { // from class: l.ۧܿ᩷
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            int i33 = -1842213949;
                            int i34 = C5695.f17556;
                            int i35 = C2167.f7158;
                            int iM69815 = (i35 - C2105.m6981("ܿܽ")) * (-67);
                            int i36 = ((iM69815 ^ i34) * (-24727)) ^ 69172264;
                            int i37 = -1023145205;
                            while (true) {
                                i33 = ((((i33 ^ i34) * (-5367)) >> 31) & i36) ^ (iM69815 ^ i37);
                                switch (i33) {
                                    case -2009568961:
                                    case 111198183:
                                        if (C1047.f3863 >= 0) {
                                            iM69815 = C2105.m6981("ܽ۬") ^ i35;
                                            i36 = ((iM69815 ^ i34) * 30435) ^ (-1928723485);
                                            i37 = -1371062294;
                                        } else {
                                            iM69815 = C0630.m2566("᩵ܿ") ^ i34;
                                            i36 = ((iM69815 ^ i35) * (-32567)) ^ (-1931455726);
                                            i37 = -1541648092;
                                        }
                                        break;
                                    case -1913610974:
                                    case 1119264248:
                                        C0483.m2121();
                                        if (C2958.m9034() <= 0) {
                                            iM69815 = (C0630.m2566("ۤ֡") ^ i34) * (-47);
                                            i36 = ((iM69815 ^ i35) * (-24409)) ^ 1216715756;
                                            i37 = 1947756653;
                                        } else {
                                            iM69815 = C0630.m2566("᩵ܿ") ^ i34;
                                            i36 = ((iM69815 ^ i35) * (-32567)) ^ (-1931455726);
                                            i37 = -1541648092;
                                        }
                                        break;
                                    case -1848347795:
                                    case -579467959:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            iM69815 = C2105.m6981("۬֨") ^ i34;
                                            i36 = ((iM69815 ^ i35) * 28191) ^ (-761291884);
                                            i37 = -1380470811;
                                        } else {
                                            iM69815 = C2105.m6981("ܳ᩵") ^ i34;
                                            i36 = ((iM69815 ^ i35) * 18551) ^ 1580161649;
                                            i37 = -632259269;
                                        }
                                        break;
                                    case -1542297783:
                                    case 1082151822:
                                        C2167.m7155();
                                        if (C2167.f7158 < 0) {
                                            iM69815 = C2105.m6981("ܰۛ") ^ i35;
                                            i36 = ((iM69815 ^ i34) * 18529) ^ (-85701824);
                                            i37 = -1679756171;
                                        } else {
                                            iM69815 = C0630.m2566("᩵ܿ") ^ i34;
                                            i36 = ((iM69815 ^ i35) * (-32567)) ^ (-1931455726);
                                            i37 = -1541648092;
                                        }
                                        break;
                                    case -1540554444:
                                    case -960221071:
                                        if (C0050.m940() <= 0) {
                                            iM69815 = C2105.m6981("۬֨") ^ i34;
                                            i36 = ((iM69815 ^ i35) * 28191) ^ (-761291884);
                                            i37 = -1380470811;
                                        } else {
                                            iM69815 = (i34 - C2105.m6981("ۘܳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i36 = ((iM69815 ^ i35) * (-32351)) ^ 1568202163;
                                            i37 = -589418893;
                                        }
                                        break;
                                    case -1326506854:
                                    case 1997624451:
                                        C7811.m20844();
                                        iM69815 = C0630.m2566("᩵ܿ") ^ i34;
                                        i36 = ((iM69815 ^ i35) * (-32567)) ^ (-1931455726);
                                        i37 = -1541648092;
                                        break;
                                    case -1302516355:
                                    case -134074246:
                                        if (C1711.f5919) {
                                            iM69815 = C2105.m6981("ܽ۬") ^ i35;
                                            i36 = ((iM69815 ^ i34) * 30435) ^ (-1928723485);
                                            i37 = -1371062294;
                                        } else {
                                            iM69815 = C0630.m2566("ۚ۟") ^ i35;
                                            i36 = ((iM69815 ^ i34) * (-23483)) ^ 1971798081;
                                            i37 = 529688338;
                                        }
                                        break;
                                    case -1257002657:
                                    case -814968922:
                                        if (C7106.m19120() <= 0) {
                                            iM69815 = C0630.m2566("᩵ܿ") ^ i34;
                                            i36 = ((iM69815 ^ i35) * (-32567)) ^ (-1931455726);
                                            i37 = -1541648092;
                                        } else {
                                            iM69815 = C0630.m2566("ۛ֫") ^ i34;
                                            i36 = ((iM69815 ^ i35) * (-18071)) ^ 1876524381;
                                            i37 = 598104101;
                                        }
                                        break;
                                    case -829316542:
                                    case -714758474:
                                        if (C21923.m49329()) {
                                            iM69815 = (C0630.m2566("ۤ֡") ^ i34) * (-47);
                                            i36 = ((iM69815 ^ i35) * (-24409)) ^ 1216715756;
                                            i37 = 1947756653;
                                        } else {
                                            iM69815 = (C0630.m2566("᩹᩷") ^ i35) * (-9);
                                            i36 = ((iM69815 ^ i34) * 24513) ^ 926561370;
                                            i37 = 1766473287;
                                        }
                                        break;
                                    case -802503766:
                                    case 929539278:
                                        if (RunnableC0588.f2309 >= 0) {
                                            iM69815 = C2105.m6981("ܽ۬") ^ i35;
                                            i36 = ((iM69815 ^ i34) * 30435) ^ (-1928723485);
                                            i37 = -1371062294;
                                        } else {
                                            iM69815 = (i35 - C0630.m2566("ۚۢ")) * 67;
                                            i36 = ((iM69815 ^ i34) * 7393) ^ (-179780438);
                                            i37 = 426736224;
                                        }
                                        break;
                                    case -577631709:
                                    case 115927068:
                                        if (C2272.m7503()) {
                                            iM69815 = (C0630.m2566("ۤ֡") ^ i34) * (-47);
                                            i36 = ((iM69815 ^ i35) * (-24409)) ^ 1216715756;
                                            i37 = 1947756653;
                                        } else {
                                            iM69815 = C2105.m6981("ۧۢ") ^ i35;
                                            i36 = ((iM69815 ^ i34) * (-20037)) ^ 883549377;
                                            i37 = 1735607034;
                                        }
                                        break;
                                    case -390526732:
                                    case 1416612802:
                                        if (C3911.f12484 >= 0) {
                                            iM69815 = C2105.m6981("۬֨") ^ i34;
                                            i36 = ((iM69815 ^ i35) * 28191) ^ (-761291884);
                                            i37 = -1380470811;
                                        } else {
                                            iM69815 = C0630.m2566("ۙ۟") ^ i35;
                                            i36 = ((iM69815 ^ i34) * (-4955)) ^ 1984113744;
                                            i37 = -697330766;
                                        }
                                        break;
                                    case 255444146:
                                    case 1543895025:
                                        this.f33470.m34965(motionEvent);
                                        break;
                                    case 269696312:
                                    case 1227377177:
                                        C1294.m4372();
                                        break;
                                    case 549577354:
                                    case 850795855:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM69815 = C2105.m6981("۬֨") ^ i34;
                                            i36 = ((iM69815 ^ i35) * 28191) ^ (-761291884);
                                            i37 = -1380470811;
                                        } else {
                                            iM69815 = C2105.m6981("ۜ۟") ^ i34;
                                            i36 = ((iM69815 ^ i35) * 27091) ^ (-1705059008);
                                            i37 = 93254432;
                                        }
                                        break;
                                    default:
                                        if (C1711.m5736() <= 0) {
                                            iM69815 = C2105.m6981("ܰۛ") ^ i35;
                                            i36 = ((iM69815 ^ i34) * 18529) ^ (-85701824);
                                            i37 = -1679756171;
                                        } else {
                                            iM69815 = C2105.m6981("᩷ۖ") ^ i34;
                                            i36 = ((iM69815 ^ i35) * (-3229)) ^ 215218958;
                                            i37 = 2095081477;
                                        }
                                        break;
                                }
                                return false;
                            }
                        }
                    });
                    View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: l.ܽܿ᩷
                        /* JADX WARN: Code duplicated, block: B:45:0x0107  */
                        /* JADX WARN: Code duplicated, block: B:53:0x0150  */
                        /* JADX WARN: Code duplicated, block: B:61:0x01a6  */
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40) {
                            int iM25618;
                            int i41;
                            int i42;
                            int i43 = 0;
                            int i44 = 1224891281;
                            int i45 = C2958.f9394;
                            int i46 = RunnableC0588.f2309;
                            int iM69815 = C2105.m6981("ܳ֡") ^ i45;
                            int i47 = ((iM69815 ^ i46) * (-4121)) ^ 1122243081;
                            int i48 = 578205673;
                            while (true) {
                                int i49 = iM69815 ^ i48;
                                while (true) {
                                    i44 = ((((i44 ^ i46) * 13301) >> 31) & i47) ^ i49;
                                    switch (i44) {
                                        case -1958497186:
                                        case 1998614694:
                                            if (C4263.f13799 <= 0) {
                                                iM25618 = C2105.m6981("ܳܺ") ^ i46;
                                                i41 = ((iM25618 ^ i45) * 47) ^ (-1257084504);
                                                i42 = -461152232;
                                            } else {
                                                iM25618 = (i45 - C2105.m6981("֡ۗ")) * (-93);
                                                i41 = ((iM25618 ^ i46) * (-15603)) ^ (-878525928);
                                                i42 = 1044539677;
                                            }
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                        case -1825663940:
                                        case 20070178:
                                            if (C3245.f10203 <= 0) {
                                                iM25618 = C2105.m6981("ܳܺ") ^ i46;
                                                i41 = ((iM25618 ^ i45) * 47) ^ (-1257084504);
                                                i42 = -461152232;
                                            } else {
                                                iM25618 = C2105.m6981("֡۫") ^ i46;
                                                i41 = ((iM25618 ^ i45) * (-16357)) ^ 571955609;
                                                i42 = 2132897516;
                                            }
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                        case -1820868182:
                                        case 1425498874:
                                            if (i43 <= 0) {
                                                iM25618 = (C0630.m2566("ۨۢ") + i45) * q.h;
                                                i41 = ((iM25618 ^ i46) * (-30299)) ^ (-1282873064);
                                                i42 = -236486122;
                                            } else {
                                                iM25618 = (C0630.m2566("ۤ᩺") + i45) * (-67);
                                                i41 = ((iM25618 ^ i46) * (-4315)) ^ (-58254286);
                                                i42 = -2047215810;
                                            }
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                        case -1156740550:
                                        case -858120578:
                                            C14676.m34967(this.f51554, i33, i34, i35, i36, i37, i38, i39, i40);
                                            break;
                                        case -927277391:
                                        case -416819446:
                                            if (C0050.f910 >= 0) {
                                                iM25618 = C2105.m6981("ۚ֫") ^ i45;
                                                i41 = ((iM25618 ^ i46) * 24781) ^ (-1749613775);
                                                i42 = -364367829;
                                            } else {
                                                iM25618 = C0630.m2566("۫ܳ") ^ i46;
                                                i41 = ((iM25618 ^ i45) * (-1151)) ^ 1805169768;
                                                i42 = 314087001;
                                            }
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                        case -770652906:
                                        case -421911511:
                                            if (RunnableC1937.m6387() != 0) {
                                                iM25618 = C2105.m6981("ܳܺ") ^ i46;
                                                i41 = ((iM25618 ^ i45) * 47) ^ (-1257084504);
                                                i42 = -461152232;
                                            } else {
                                                iM25618 = C0630.m2566("֡᩸") ^ i45;
                                                i41 = ((iM25618 ^ i46) * 5859) ^ 930887689;
                                                i42 = -1617989531;
                                            }
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                        case -682325584:
                                        case 1462515011:
                                            i43 = C4117.f13076;
                                            iM25618 = C0630.m2566("ܺۜ") ^ i46;
                                            i41 = ((iM25618 ^ i45) * 18719) ^ (-2135473610);
                                            i42 = -854819913;
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                        case -161403059:
                                        case 432417049:
                                            ViewOnClickListenerC1958.m6429();
                                            break;
                                        case -157795429:
                                        case 1381499783:
                                            if (C3911.f12484 >= 0) {
                                                iM25618 = C2105.m6981("ۧ֨") ^ i46;
                                                i41 = ((iM25618 ^ i45) * (-6787)) ^ 1263864023;
                                                i42 = -331531580;
                                            } else {
                                                iM25618 = C0630.m2566("ۜۜ") ^ i45;
                                                i41 = ((iM25618 ^ i46) * 10779) ^ (-1395349898);
                                                i42 = -200262091;
                                            }
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                        case -119879471:
                                        case 1383242500:
                                            if (C11340.f33930 >= 0) {
                                                iM25618 = (C0630.m2566("ۨۢ") + i45) * q.h;
                                                i41 = ((iM25618 ^ i46) * (-30299)) ^ (-1282873064);
                                                i42 = -236486122;
                                            } else {
                                                iM25618 = C0630.m2566("ۛ᩺") ^ i46;
                                                i41 = ((iM25618 ^ i45) * 12097) ^ (-1660420119);
                                                i42 = -672676534;
                                            }
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                        case 369376168:
                                        case 1975918282:
                                            C4159.m12565();
                                            C1773.m5908();
                                            break;
                                        case 527052973:
                                        case 1654489161:
                                            if (ViewOnClickListenerC1958.f6529 <= 0) {
                                                iM25618 = (C0630.m2566("ۨۢ") + i45) * q.h;
                                                i41 = ((iM25618 ^ i46) * (-30299)) ^ (-1282873064);
                                                i42 = -236486122;
                                                i49 = iM25618 ^ i42;
                                                i47 = i41;
                                            }
                                            iM25618 = C2105.m6981("ۧ֨") ^ i46;
                                            i41 = ((iM25618 ^ i45) * (-6787)) ^ 1263864023;
                                            i42 = -331531580;
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                        case 865127945:
                                        case 2105047504:
                                            C0964.m3413();
                                            if (C11340.f33930 < 0) {
                                                iM25618 = C2105.m6981("ۚ֫") ^ i45;
                                                i41 = ((iM25618 ^ i46) * 24781) ^ (-1749613775);
                                                i42 = -364367829;
                                                i49 = iM25618 ^ i42;
                                                i47 = i41;
                                            }
                                            iM25618 = C2105.m6981("ۧ֨") ^ i46;
                                            i41 = ((iM25618 ^ i45) * (-6787)) ^ 1263864023;
                                            i42 = -331531580;
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                        case 1286434164:
                                        case 1310512154:
                                            if (C3911.m11924() <= 0) {
                                                iM25618 = (C0630.m2566("ۨۢ") + i45) * q.h;
                                                i41 = ((iM25618 ^ i46) * (-30299)) ^ (-1282873064);
                                                i42 = -236486122;
                                            } else {
                                                iM25618 = C0630.m2566("ܳۨ") ^ i45;
                                                i41 = ((iM25618 ^ i46) * (-5873)) ^ (-795568822);
                                                i42 = -1927350801;
                                            }
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                        case 1652355713:
                                        case 1789747717:
                                            if (AbstractC2021.f6743 <= 0) {
                                                iM25618 = C2105.m6981("ۚ֫") ^ i45;
                                                i41 = ((iM25618 ^ i46) * 24781) ^ (-1749613775);
                                                i42 = -364367829;
                                            } else {
                                                iM25618 = C2105.m6981("ᩳܳ") ^ i46;
                                                i41 = ((iM25618 ^ i45) * 28747) ^ (-71761187);
                                                i42 = 1629621342;
                                            }
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                        case 2017249645:
                                        case 2022783108:
                                            if (C0798.f2919) {
                                                iM25618 = (C0630.m2566("ۨۢ") + i45) * q.h;
                                                i41 = ((iM25618 ^ i46) * (-30299)) ^ (-1282873064);
                                                i42 = -236486122;
                                            } else {
                                                iM25618 = C2105.m6981("֨ܰ") ^ i45;
                                                i41 = ((iM25618 ^ i46) * (-14625)) ^ (-1450389525);
                                                i42 = 1033417390;
                                            }
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                        default:
                                            RunnableC1937.m6387();
                                            if (C1773.f6144 > 0) {
                                            }
                                            iM25618 = C2105.m6981("ۧ֨") ^ i46;
                                            i41 = ((iM25618 ^ i45) * (-6787)) ^ 1263864023;
                                            i42 = -331531580;
                                            i49 = iM25618 ^ i42;
                                            i47 = i41;
                                            break;
                                    }
                                    return;
                                }
                                iM69815 = C0630.m2566("ۘۢ") ^ i46;
                                i47 = ((iM69815 ^ i45) * 1951) ^ 2130655578;
                                i48 = 1872366568;
                            }
                        }
                    };
                    scrollView2.addOnLayoutChangeListener(onLayoutChangeListener);
                    viewM28028.addOnLayoutChangeListener(onLayoutChangeListener);
                    return;
                case -455798645:
                case 51214852:
                    i = i25;
                    sArr3 = sArr16;
                    short[] sArr21 = sArr13;
                    viewM3509 = C1005.m3507(viewM10739, C0630.m2566(C1504.m5177(sArr21, 16, 3, i22)) ^ 2128696864);
                    int iM25618 = (C0630.m2566("ۗۤ") + i18) * (-51);
                    i12 = ((iM25618 ^ i19) * (-24807)) ^ (-982323890);
                    i13 = iM25618 ^ 716684378;
                    sArr13 = sArr21;
                    i27 = i27;
                    sArr15 = sArr15;
                    i26 = i26;
                    sArr14 = sArr14;
                    i28 = i12;
                    i29 = i13;
                    sArr16 = sArr3;
                    i25 = i;
                    break;
                case -432175593:
                case 631577881:
                    if (C4075.f12947 >= 0) {
                        int i33 = i25;
                        sArr11 = sArr16;
                        iM25610 = i33;
                        iM6982 = (i18 - C0630.m2566("᩸᩻")) * 7;
                        i28 = ((iM6982 ^ i19) * 2139) ^ 1800091676;
                        i16 = 666976608;
                        i29 = iM6982 ^ i16;
                        short[] sArr110 = sArr11;
                        i25 = iM25610;
                        sArr16 = sArr110;
                    } else {
                        i = i25;
                        sArr6 = sArr12;
                        sArr7 = sArr13;
                        sArr8 = sArr14;
                        sArr9 = sArr15;
                        i6 = i26;
                        i7 = i27;
                        sArr3 = sArr16;
                        iM2567 = (C0630.m2566("ۡۡ") + i19) * 99;
                        i8 = ((iM2567 ^ i18) * (-1059)) ^ (-324914444);
                        i9 = 1063801109;
                        i29 = i9 ^ iM2567;
                        c14676 = this;
                        sArr12 = sArr6;
                        i27 = i7;
                        sArr15 = sArr9;
                        i26 = i6;
                        sArr14 = sArr8;
                        sArr13 = sArr7;
                        i28 = i8;
                        sArr16 = sArr3;
                        i25 = i;
                    }
                    break;
                case -401042354:
                case 1640932945:
                    RunnableC1937.m6387();
                    break;
                case -358014582:
                case 2118239337:
                    ViewOnClickListenerC14813.m35215(textView9);
                    ViewOnClickListenerC14813.m35215(textView2);
                    ViewOnClickListenerC14813.m35215(textView8);
                    ViewOnClickListenerC14813.m35215(textView4);
                    ViewOnClickListenerC14813.m35215(textView7);
                    ViewOnClickListenerC14813.m35215(textView3);
                    ViewOnClickListenerC14813.m35215(textView6);
                    scrollView.setVerticalScrollBarEnabled(false);
                    scrollView.setScrollbarFadingEnabled(false);
                    iM6431 = ViewOnClickListenerC1958.m6431(2.0f);
                    iM6981 = C2105.m6981("ܺᩴ") ^ i18;
                    i28 = ((iM6981 ^ i19) * 28283) ^ 1056907486;
                    i5 = 979642464;
                    i29 = iM6981 ^ i5;
                    break;
                case 40128475:
                case 1907299943:
                    i = i25;
                    sArr7 = sArr13;
                    sArr8 = sArr14;
                    sArr9 = sArr15;
                    i6 = i26;
                    i7 = i27;
                    sArr3 = sArr16;
                    scrollView2 = (ScrollView) C1005.m3507(viewM10739, C0630.m2566(strM12578) ^ 2129297312);
                    c14676.f44839 = scrollView2;
                    sArr12 = f44829;
                    iM2568 = C0630.m2566("֫ۢ") ^ i19;
                    i28 = (-686235851) ^ ((iM2568 ^ i18) * (-12621));
                    i10 = -1074150973;
                    i29 = i10 ^ iM2568;
                    i27 = i7;
                    sArr16 = sArr3;
                    sArr15 = sArr9;
                    i25 = i;
                    i26 = i6;
                    sArr14 = sArr8;
                    sArr13 = sArr7;
                    break;
                case 210698831:
                case 645235888:
                    if (C3746.f11829 > 0) {
                        i = i25;
                        sArr = sArr14;
                        sArr2 = sArr15;
                        i2 = i26;
                        i3 = i27;
                        sArr3 = sArr16;
                        iM2566 = C0630.m2566("᩷ۙ") ^ i19;
                        i28 = 553981630 ^ ((iM2566 ^ i18) * (-30363));
                        i4 = 185179394;
                        i29 = i4 ^ iM2566;
                        i27 = i3;
                        sArr16 = sArr3;
                        sArr15 = sArr2;
                        i25 = i;
                        i26 = i2;
                        sArr14 = sArr;
                    } else {
                        int i34 = i25;
                        sArr11 = sArr16;
                        iM25610 = i34;
                        iM6982 = (i18 - C0630.m2566("᩸᩻")) * 7;
                        i28 = ((iM6982 ^ i19) * 2139) ^ 1800091676;
                        i16 = 666976608;
                        i29 = iM6982 ^ i16;
                        short[] sArr111 = sArr11;
                        i25 = iM25610;
                        sArr16 = sArr111;
                    }
                    break;
                default:
                    i = i25;
                    sArr = sArr14;
                    sArr2 = sArr15;
                    i2 = i26;
                    i3 = i27;
                    sArr3 = sArr16;
                    textView2 = (TextView) C1005.m3507(viewM10739, iM6987 ^ 2101120063);
                    c14676.f44835 = textView2;
                    iM25611 = C0630.m2566(C3911.m11919(f44829, 25, 3, i22)) ^ 2123498299;
                    iM2566 = C2105.m6981("۫۠") ^ i19;
                    i28 = (-850600574) ^ ((iM2566 ^ i18) * (-18541));
                    i4 = 1075640503;
                    i29 = i4 ^ iM2566;
                    i27 = i3;
                    sArr16 = sArr3;
                    sArr15 = sArr2;
                    i25 = i;
                    i26 = i2;
                    sArr14 = sArr;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m34965(MotionEvent motionEvent) {
        int actionMasked = 0;
        ScrollView scrollView = null;
        boolean z = false;
        int i = 618043713;
        int i2 = C1047.f3863;
        int i3 = C3537.f11231;
        int iM6981 = (i2 - C2105.m6981("ۤ۟")) * (-65);
        int i4 = ((iM6981 ^ i3) * (-30843)) ^ (-1935892109);
        int i5 = 111562084;
        while (true) {
            i = ((((i ^ i3) * 8675) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2118906386:
                case 19190855:
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("֡ܽ") + i2) * (-93);
                        i4 = ((iM6981 ^ i3) * (-10105)) ^ (-1962200);
                        i5 = 1409719490;
                    } else {
                        iM6981 = (C2105.m6981("ܽ۠") + i3) * (-21);
                        i4 = ((iM6981 ^ i2) * 291) ^ 756659645;
                        i5 = -849073927;
                    }
                    break;
                case -2031509903:
                case -1572711123:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("ۡ֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1025)) ^ (-454243071);
                        i5 = 971252217;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩷ۡ")) * (-123);
                        i4 = ((iM6981 ^ i3) * (-23761)) ^ (-1837373793);
                        i5 = 1287936840;
                    }
                    break;
                case -1962070521:
                case 1086152471:
                    break;
                case -1946415081:
                case 785588609:
                    if (this.f44850) {
                        iM6981 = C0630.m2566("ܿ᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * 10859) ^ (-1941992586);
                        i5 = 655949303;
                    } else {
                        iM6981 = (C2105.m6981("ᩳۤ") ^ i2) * 99;
                        i4 = ((iM6981 ^ i3) * 1555) ^ (-1046562218);
                        i5 = 1034193455;
                    }
                    break;
                case -1902064602:
                case 1955980954:
                    if (actionMasked != 2) {
                        iM6981 = (C2105.m6981("۬᩺") + i2) * 71;
                        i4 = ((iM6981 ^ i3) * (-12669)) ^ 625158932;
                        i5 = 392011613;
                    } else {
                        iM6981 = (C0630.m2566("᩷᩻") + i3) * (-41);
                        i4 = ((iM6981 ^ i2) * (-25193)) ^ 1075362814;
                        i5 = -1636286921;
                    }
                    break;
                case -1436548222:
                case -1332666719:
                    actionMasked = motionEvent.getActionMasked();
                    scrollView = this.f44839;
                    z = true;
                    if (actionMasked != 0) {
                        iM6981 = C0630.m2566("ۧᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 20875) ^ (-1817578768);
                        i5 = 1034273081;
                    } else {
                        iM6981 = (C0630.m2566("᩷᩻") + i3) * (-41);
                        i4 = ((iM6981 ^ i2) * (-25193)) ^ 1075362814;
                        i5 = -1636286921;
                    }
                    break;
                case -1264779654:
                case -878757044:
                    C1916.m6308();
                    iM6981 = (i3 - C2105.m6981("᩺ۛ")) * (-113);
                    i4 = ((iM6981 ^ i2) * (-24069)) ^ (-2147268472);
                    i5 = 2094559633;
                    break;
                case -1031682892:
                case -333693666:
                    if (actionMasked != z) {
                        iM6981 = (C2105.m6981("֨۬") + i2) * (-77);
                        i4 = ((iM6981 ^ i3) * 1689) ^ 88241225;
                        i5 = 104491629;
                    } else {
                        iM6981 = (C2105.m6981("֡ۜ") ^ i3) * (-79);
                        i4 = ((iM6981 ^ i2) * 30783) ^ 1777972735;
                        i5 = 794290421;
                    }
                    break;
                case -919930654:
                case 2022167098:
                    if (C3746.m11369() >= 0) {
                        iM6981 = (C2105.m6981("֡ܽ") + i2) * (-93);
                        i4 = ((iM6981 ^ i3) * (-10105)) ^ (-1962200);
                        i5 = 1409719490;
                    } else {
                        iM6981 = (C2105.m6981("᩷֡") + i2) * (-73);
                        i4 = ((iM6981 ^ i3) * 26181) ^ 282591661;
                        i5 = -1995847244;
                    }
                    break;
                case -819814579:
                case -23324538:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C0630.m2566("۠ۧ") ^ i3) * 57;
                        i4 = ((iM6981 ^ i2) * (-16893)) ^ 663339926;
                        i5 = -47287404;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩺ۛ")) * (-113);
                        i4 = ((iM6981 ^ i2) * (-24069)) ^ (-2147268472);
                        i5 = 2094559633;
                    }
                    break;
                case -631212330:
                case -156410987:
                    scrollView.requestDisallowInterceptTouchEvent(z);
                    break;
                case -358697045:
                case 1663189155:
                    if (C3245.f10203 <= 0) {
                        iM6981 = C0630.m2566("ۡ֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1025)) ^ (-454243071);
                        i5 = 971252217;
                    } else {
                        iM6981 = (C0630.m2566("᩶ۡ") ^ i2) * (-71);
                        i4 = ((iM6981 ^ i3) * 10027) ^ 348728126;
                        i5 = 1270518943;
                    }
                    break;
                case -302630047:
                case -17872248:
                    if (RunnableC3474.m10630()) {
                        iM6981 = (C0630.m2566("᩷ܰ") + i3) * (-65);
                        i4 = ((iM6981 ^ i2) * 30985) ^ 487245437;
                        i5 = -1105892582;
                    } else {
                        iM6981 = C0630.m2566("ۡ֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1025)) ^ (-454243071);
                        i5 = 971252217;
                    }
                    break;
                case -106042839:
                case 735167580:
                    if (actionMasked == 3) {
                        iM6981 = (C2105.m6981("֡ۜ") ^ i3) * (-79);
                        i4 = ((iM6981 ^ i2) * 30783) ^ 1777972735;
                        i5 = 794290421;
                    } else {
                        iM6981 = (C2105.m6981("ᩳۤ") ^ i2) * 99;
                        i4 = ((iM6981 ^ i3) * 1555) ^ (-1046562218);
                        i5 = 1034193455;
                    }
                    break;
                case -43891261:
                case 1332810417:
                    C4159.m12565();
                    if (C1128.f4106 > 0) {
                        iM6981 = (C0630.m2566("۬ᩳ") + i3) * 59;
                        i4 = ((iM6981 ^ i2) * (-23625)) ^ (-1066495919);
                        i5 = 1337288788;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩺ۛ")) * (-113);
                        i4 = ((iM6981 ^ i2) * (-24069)) ^ (-2147268472);
                        i5 = 2094559633;
                    }
                    break;
                case 115027350:
                case 1610063609:
                    if (C1711.f5919) {
                        iM6981 = (C0630.m2566("۬ᩳ") + i3) * 59;
                        i4 = ((iM6981 ^ i2) * (-23625)) ^ (-1066495919);
                        i5 = 1337288788;
                    } else {
                        iM6981 = C0630.m2566("᩻᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27621)) ^ (-1547249809);
                        i5 = -195153309;
                    }
                    break;
                case 136491054:
                case 2032498773:
                    if (C3911.f12484 >= 0) {
                        iM6981 = (i3 - C2105.m6981("᩺ۛ")) * (-113);
                        i4 = ((iM6981 ^ i2) * (-24069)) ^ (-2147268472);
                        i5 = 2094559633;
                    } else {
                        iM6981 = C0630.m2566("۟᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * 24691) ^ (-390017690);
                        i5 = 992433304;
                    }
                    break;
                case 303617782:
                case 1487453373:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6981 = (C2105.m6981("֡ܽ") + i2) * (-93);
                        i4 = ((iM6981 ^ i3) * (-10105)) ^ (-1962200);
                        i5 = 1409719490;
                    } else {
                        iM6981 = (C0630.m2566("ۤۜ") + i2) * (-67);
                        i4 = ((iM6981 ^ i3) * (-13825)) ^ 1170916928;
                        i5 = 346741116;
                    }
                    break;
                case 308712694:
                case 347973572:
                    C7106.m19120();
                    break;
                case 312874240:
                case 443025919:
                    if (C2520.f8000 < 0) {
                        iM6981 = C0630.m2566("ۡ֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1025)) ^ (-454243071);
                        i5 = 971252217;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩺ۛ")) * (-113);
                        i4 = ((iM6981 ^ i2) * (-24069)) ^ (-2147268472);
                        i5 = 2094559633;
                    }
                    break;
                case 507592083:
                case 1761086260:
                    scrollView.requestDisallowInterceptTouchEvent(false);
                    break;
                case 1143388243:
                case 1471011859:
                    if (C7811.f24123 >= 0) {
                        iM6981 = (i3 - C2105.m6981("᩺ۛ")) * (-113);
                        i4 = ((iM6981 ^ i2) * (-24069)) ^ (-2147268472);
                        i5 = 2094559633;
                    } else {
                        iM6981 = C2105.m6981("ۨ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-26533)) ^ (-1951717887);
                        i5 = 412297296;
                    }
                    break;
                default:
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C0630.m2566("۠ۧ") ^ i3) * 57;
                        i4 = ((iM6981 ^ i2) * (-16893)) ^ 663339926;
                        i5 = -47287404;
                    } else {
                        iM6981 = C2105.m6981("ܶۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16513) ^ 489102993;
                        i5 = 1945878281;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34967(C14676 c14676, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z = false;
        int i9 = -874663463;
        int i10 = RunnableC0588.f2309;
        int i11 = C3537.f11231;
        int iM2566 = (C0630.m2566("ᩳܿ") + i11) * (-23);
        int i12 = ((iM2566 ^ i10) * (-15505)) ^ (-188786095);
        int i13 = -1266826748;
        while (true) {
            i9 = ((((i9 ^ i10) * (-13667)) >> 31) & i12) ^ (iM2566 ^ i13);
            switch (i9) {
                case -2063226400:
                case 1397532519:
                    if (C1504.f5354) {
                        iM2566 = C0630.m2566("᩷᩻") ^ i11;
                        i12 = ((iM2566 ^ i10) * (-19403)) ^ (-318238351);
                        i13 = -630811322;
                    } else {
                        iM2566 = C2105.m6981("ۙܶ") ^ i10;
                        i12 = ((iM2566 ^ i11) * 28271) ^ 630954005;
                        i13 = 102718980;
                    }
                    break;
                case -1925274480:
                case 1346905036:
                    if (i == i5) {
                        iM2566 = C0630.m2566("۬۠") ^ i11;
                        i12 = ((iM2566 ^ i10) * 4503) ^ 1669093753;
                        i13 = 696736024;
                    } else {
                        iM2566 = C0630.m2566("ۢᩴ") ^ i10;
                        i12 = ((iM2566 ^ i11) * (-31539)) ^ (-411854735);
                        i13 = 882522883;
                    }
                    break;
                case -1785382399:
                case 1680757939:
                    if (z) {
                        iM2566 = (i11 - C2105.m6981("᩺ܿ")) * (-109);
                        i12 = ((iM2566 ^ i10) * 28003) ^ (-1832583008);
                        i13 = 1246713252;
                    } else {
                        iM2566 = C0630.m2566("ܶܳ") ^ i10;
                        i12 = ((iM2566 ^ i11) * (-2833)) ^ 1895332247;
                        i13 = -178370217;
                    }
                    break;
                case -1750395988:
                case 199022568:
                    RunnableC0588.m2441();
                    if (C0483.f2088 < 0) {
                        iM2566 = C0630.m2566("ܶܳ") ^ i10;
                        i12 = ((iM2566 ^ i11) * (-2833)) ^ 1895332247;
                        i13 = -178370217;
                    } else {
                        iM2566 = C2105.m6981("ۢᩳ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 12265) ^ (-1067781578);
                        i13 = -1289121782;
                    }
                    break;
                case -1670883742:
                case 1046928148:
                    z = C0382.f1805;
                    iM2566 = (C0630.m2566("ۤۤ") ^ i10) * 73;
                    i12 = ((iM2566 ^ i11) * (-11443)) ^ 715273787;
                    i13 = -1934402348;
                    break;
                case -1655224572:
                case -1386140802:
                    c14676.m34964();
                    break;
                case -1620850216:
                case -130119642:
                    if (i2 == i6) {
                        iM2566 = (i10 - C2105.m6981("ܰܳ")) * q.h;
                        i12 = ((iM2566 ^ i11) * (-26975)) ^ (-2077034938);
                        i13 = -1691385506;
                    } else {
                        iM2566 = C0630.m2566("ۢᩴ") ^ i10;
                        i12 = ((iM2566 ^ i11) * (-31539)) ^ (-411854735);
                        i13 = 882522883;
                    }
                    break;
                case -1612416298:
                case 2019494699:
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("ܶܳ") ^ i10;
                        i12 = ((iM2566 ^ i11) * (-2833)) ^ 1895332247;
                        i13 = -178370217;
                    } else {
                        iM2566 = C0630.m2566("ۨܿ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 32509) ^ (-127906877);
                        i13 = -1885067242;
                    }
                    break;
                case -1584041270:
                case 1233789772:
                    break;
                case -1580192211:
                case 289570394:
                    if (C0237.f1507 != 0) {
                        iM2566 = C2105.m6981("ܶۜ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 10789) ^ (-85958072);
                        i13 = 209497133;
                    } else {
                        iM2566 = (C2105.m6981("ۢ֡") ^ i10) * (-49);
                        i12 = ((iM2566 ^ i11) * 16061) ^ 65579043;
                        i13 = -298145448;
                    }
                    break;
                case -1397549453:
                case 1660026914:
                    if (C0237.m1481() >= 0) {
                        iM2566 = C0630.m2566("᩷᩻") ^ i11;
                        i12 = ((iM2566 ^ i10) * (-19403)) ^ (-318238351);
                        i13 = -630811322;
                    } else {
                        iM2566 = C0630.m2566("᩺۬") ^ i11;
                        i12 = ((iM2566 ^ i10) * 16761) ^ 126046019;
                        i13 = 1552192360;
                    }
                    break;
                case -1263269470:
                case -1203444334:
                    if (i3 == i7) {
                        iM2566 = C0630.m2566("ܰܺ") ^ i10;
                        i12 = ((iM2566 ^ i11) * (-14071)) ^ 613572106;
                        i13 = 1543587224;
                    } else {
                        iM2566 = C0630.m2566("ۢᩴ") ^ i10;
                        i12 = ((iM2566 ^ i11) * (-31539)) ^ (-411854735);
                        i13 = 882522883;
                    }
                    break;
                case -1225494960:
                case -973448131:
                    if (i4 != i8) {
                        iM2566 = C0630.m2566("ۢᩴ") ^ i10;
                        i12 = ((iM2566 ^ i11) * (-31539)) ^ (-411854735);
                        i13 = 882522883;
                    } else {
                        iM2566 = (C2105.m6981("᩹᩺") + i11) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i12 = ((iM2566 ^ i10) * (-21367)) ^ 1327181582;
                        i13 = 2055255341;
                    }
                    break;
                case -574274047:
                case 1848753574:
                    if (C2167.f7158 < 0) {
                        iM2566 = (C0630.m2566("᩸ۖ") + i10) * 95;
                        i12 = ((iM2566 ^ i11) * (-18967)) ^ 2034699761;
                        i13 = 2043860560;
                    } else {
                        iM2566 = C2105.m6981("ۢᩳ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 12265) ^ (-1067781578);
                        i13 = -1289121782;
                    }
                    break;
                case -121602141:
                case 1222705696:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("᩷᩻") ^ i11;
                        i12 = ((iM2566 ^ i10) * (-19403)) ^ (-318238351);
                        i13 = -630811322;
                    } else {
                        iM2566 = (i10 - C2105.m6981("᩵֫")) * 25;
                        i12 = ((iM2566 ^ i11) * (-19281)) ^ (-1746729916);
                        i13 = -1510456254;
                    }
                    break;
                case 578615948:
                case 1317169607:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C0630.m2566("᩸ۖ") + i10) * 95;
                        i12 = ((iM2566 ^ i11) * (-18967)) ^ 2034699761;
                        i13 = 2043860560;
                    } else {
                        iM2566 = C0630.m2566("ܺܶ") ^ i11;
                        i12 = ((iM2566 ^ i10) * (-16137)) ^ (-456993832);
                        i13 = 1421623958;
                    }
                    break;
                case 1089266938:
                case 1822773317:
                    C3245.m9925();
                    if (!C1711.f5919) {
                        iM2566 = C2105.m6981("ܶۜ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 10789) ^ (-85958072);
                        i13 = 209497133;
                    } else {
                        iM2566 = (C0630.m2566("᩸ۖ") + i10) * 95;
                        i12 = ((iM2566 ^ i11) * (-18967)) ^ 2034699761;
                        i13 = 2043860560;
                    }
                    break;
                case 1167308531:
                case 1653633937:
                    C0483.m2121();
                    AbstractC2021.m6574();
                    break;
                case 1511944994:
                case 1579022603:
                    if (RunnableC1108.f4040) {
                        iM2566 = (C2105.m6981("ܰ۬") ^ i11) * (-25);
                        i12 = ((iM2566 ^ i10) * 25293) ^ (-1099578522);
                        i13 = 621283543;
                    } else {
                        iM2566 = C2105.m6981("ܶۜ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 10789) ^ (-85958072);
                        i13 = 209497133;
                    }
                    break;
                case 1550073731:
                case 1595348787:
                    C1128.m3851();
                    C2520.m8026();
                    iM2566 = C2105.m6981("ۢᩳ") ^ i11;
                    i12 = ((iM2566 ^ i10) * 12265) ^ (-1067781578);
                    i13 = -1289121782;
                    break;
                case 1758950120:
                case 1859003737:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C0630.m2566("᩸ۖ") + i10) * 95;
                        i12 = ((iM2566 ^ i11) * (-18967)) ^ 2034699761;
                        i13 = 2043860560;
                    } else {
                        iM2566 = (i11 - C0630.m2566("ܿۗ")) * (-51);
                        i12 = ((iM2566 ^ i10) * 18033) ^ (-2044567498);
                        i13 = -1064249975;
                    }
                    break;
                default:
                    if (C11340.m28031()) {
                        iM2566 = (i10 - C2105.m6981("᩺᩺")) * (-91);
                        i12 = ((iM2566 ^ i11) * (-1171)) ^ (-1315237274);
                        i13 = 1726329351;
                    } else {
                        iM2566 = C2105.m6981("ܶۜ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 10789) ^ (-85958072);
                        i13 = 209497133;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0347 A[PHI: r2 r5 r9 r16 r20 r25
      0x0347: PHI (r2v5 java.lang.StringBuilder) = 
      (r2v2 java.lang.StringBuilder)
      (r2v2 java.lang.StringBuilder)
      (r2v2 java.lang.StringBuilder)
      (r2v2 java.lang.StringBuilder)
      (r2v4 java.lang.StringBuilder)
      (r2v2 java.lang.StringBuilder)
     binds: [B:71:0x0343, B:123:0x0347, B:67:0x0301, B:52:0x024f, B:22:0x00c3, B:15:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0347: PHI (r5v6 java.lang.String) = 
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v4 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
     binds: [B:71:0x0343, B:123:0x0347, B:67:0x0301, B:52:0x024f, B:22:0x00c3, B:15:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0347: PHI (r9v4 java.lang.String) = 
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v3 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
     binds: [B:71:0x0343, B:123:0x0347, B:67:0x0301, B:52:0x024f, B:22:0x00c3, B:15:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0347: PHI (r16v10 android.widget.TextView) = 
      (r16v3 android.widget.TextView)
      (r16v2 android.widget.TextView)
      (r16v8 android.widget.TextView)
      (r16v2 android.widget.TextView)
      (r16v2 android.widget.TextView)
      (r16v2 android.widget.TextView)
     binds: [B:71:0x0343, B:123:0x0347, B:67:0x0301, B:52:0x024f, B:22:0x00c3, B:15:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0347: PHI (r20v10 java.lang.String) = 
      (r20v3 java.lang.String)
      (r20v2 java.lang.String)
      (r20v5 java.lang.String)
      (r20v2 java.lang.String)
      (r20v2 java.lang.String)
      (r20v2 java.lang.String)
     binds: [B:71:0x0343, B:123:0x0347, B:67:0x0301, B:52:0x024f, B:22:0x00c3, B:15:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0347: PHI (r25v15 android.widget.TextView) = 
      (r25v4 android.widget.TextView)
      (r25v3 android.widget.TextView)
      (r25v6 android.widget.TextView)
      (r25v3 android.widget.TextView)
      (r25v3 android.widget.TextView)
      (r25v3 android.widget.TextView)
     binds: [B:71:0x0343, B:123:0x0347, B:67:0x0301, B:52:0x024f, B:22:0x00c3, B:15:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0075, code lost:
    
        if (l.C0714.f2697 >= 0) goto L11;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m34974(C16709 c16709, long j, C16709 c167010) {
        TextView textView;
        int i;
        int iM2566;
        int i2;
        int iM2567;
        int i3;
        C14676 c14676 = this;
        int i4 = C4075.f12947;
        int i5 = C2167.f7158;
        int iM6981 = C2105.m6981("ܰ۠") ^ i4;
        int i6 = ((iM6981 ^ i5) * (-9843)) ^ 2048678628;
        String strM5914 = null;
        TextView textView2 = null;
        String strM935 = null;
        View view = null;
        StringBuilder sbM19190 = null;
        short[] sArr = null;
        int i7 = iM6981 ^ (-1650720092);
        int i8 = 0;
        int i9 = 0;
        TextView textView3 = null;
        short s = 0;
        short s2 = 0;
        int i10 = 871718404;
        String strM51020 = null;
        String strM1959 = null;
        TextView textView4 = null;
        String strM39286 = null;
        String strM936 = null;
        View view2 = null;
        boolean z = false;
        String str = null;
        while (true) {
            i10 = i7 ^ (i6 & (((i10 ^ i5) * (-3885)) >> 31));
            switch (i10) {
                case -1906568942:
                case -55684761:
                    RunnableC1937.m6377(c14676.f44838, strM1959);
                    iM2566 = C2105.m6981("᩺᩻") ^ i5;
                    i = ((iM2566 ^ i4) * 20205) ^ (-2052182330);
                    i2 = -60319383;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1832183436:
                case 1395546880:
                    C0714.m2805();
                    break;
                case -1493506617:
                case -170507947:
                    strM5914 = strM5914;
                    textView2 = textView2;
                    textView3 = textView3;
                    int i11 = s + s2;
                    int i12 = (s * s) + 272481049;
                    if ((i12 + i12) - (i11 * i11) < 0) {
                        iM2567 = C0630.m2566("ᩴۖ") ^ i4;
                        i6 = ((iM2567 ^ i5) * 28933) ^ 869185896;
                        i3 = -537642337;
                    } else {
                        iM2567 = (C0630.m2566("ۖᩳ") ^ i5) * (-45);
                        i6 = ((iM2567 ^ i4) * (-573)) ^ 1185629274;
                        i3 = -1412609208;
                    }
                    int i13 = iM2567 ^ i3;
                    strM5914 = strM5914;
                    textView3 = textView3;
                    textView2 = textView2;
                    i7 = i13;
                    c14676 = this;
                    break;
                case -1419931800:
                case 1761422900:
                    C3746.m11360(view2, z ? 1 : 0);
                    strM39286 = c167010.m39286();
                    if (C1294.m4369(strM39286, c16709.m39286())) {
                        iM2566 = (C0630.m2566("ۗܰ") ^ i4) * (-125);
                        i = ((iM2566 ^ i5) * (-19739)) ^ 191553289;
                        i2 = 382185058;
                    } else {
                        strM1959 = strM39286;
                        iM2566 = (C0630.m2566("ܺܿ") ^ i4) * (-77);
                        i = ((iM2566 ^ i5) * 30741) ^ 1198718976;
                        i2 = 16286624;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1375367765:
                case 1979528392:
                    C1047.m3599();
                    if (C3911.f12484 < 0) {
                        strM5914 = strM5914;
                        textView2 = textView2;
                        textView3 = textView3;
                        iM2567 = C2105.m6981("ۨ۬") ^ i5;
                        i6 = ((iM2567 ^ i4) * 27005) ^ (-231907215);
                        i3 = -1822061198;
                        int i14 = iM2567 ^ i3;
                        strM5914 = strM5914;
                        textView3 = textView3;
                        textView2 = textView2;
                        i7 = i14;
                        c14676 = this;
                    } else {
                        iM2566 = C2105.m6981("֫ۙ") ^ i4;
                        i = ((iM2566 ^ i5) * (-7707)) ^ 694159684;
                        i2 = -613024682;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1157498829:
                case 1244912720:
                    RunnableC1108.m3790();
                    RunnableC1108.m3790();
                    iM2566 = C2105.m6981("֫ۙ") ^ i4;
                    i = ((iM2566 ^ i5) * (-7707)) ^ 694159684;
                    i2 = -613024682;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1010653244:
                case 1694198572:
                    RunnableC1937.m6377(textView4, strM51020);
                    strM935 = C0050.m935(c16709.m39319());
                    if (C1773.f6144 <= 0) {
                        iM2566 = C2105.m6981("֫ۙ") ^ i4;
                        i = ((iM2566 ^ i5) * (-7707)) ^ 694159684;
                        i2 = -613024682;
                    } else {
                        iM2566 = (C0630.m2566("۠ۛ") ^ i5) * (-101);
                        i = ((iM2566 ^ i4) * 22291) ^ (-1053480129);
                        i2 = 1869171026;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -969414377:
                case 797318301:
                    C1047.m3601(c14676.f44830, strM935);
                    int iM39319 = c16709.m39319();
                    i9 = 8;
                    view = c14676.f44849;
                    z = false;
                    z = false;
                    if (iM39319 <= 2) {
                        iM2566 = C0630.m2566("ۚ۬") ^ i5;
                        i = ((iM2566 ^ i4) * (-31275)) ^ (-840570732);
                        i2 = -1636191097;
                    } else {
                        iM2566 = (C2105.m6981("ۚۨ") ^ i4) * 89;
                        i = ((iM2566 ^ i5) * 16367) ^ (-549901731);
                        i2 = -1423323023;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -879620246:
                case 1097743260:
                    RunnableC1937.m6377(c14676.f44835, strM936);
                    textView4 = c14676.f44834;
                    strM51020 = C22927.m51020(j);
                    if (!C0714.m2805()) {
                        textView = textView2;
                        int iM6982 = (C2105.m6981("᩸ۢ") ^ i5) * 51;
                        TextView textView5 = textView;
                        i6 = ((iM6982 ^ i4) * 25845) ^ 1738295769;
                        textView2 = textView5;
                        i7 = iM6982 ^ 1775171208;
                    } else {
                        iM2566 = C0630.m2566("ۛܿ") ^ i4;
                        i = ((iM2566 ^ i5) * 16037) ^ (-743865462);
                        i2 = -325017296;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    }
                    break;
                case -859783593:
                case 1580755466:
                    C1128.m3853(view, z ? 1 : 0);
                    C1047.m3601(c14676.f44843, C16709.m39276(c16709.m39303()));
                    if (C3537.f11231 >= 0) {
                        iM2566 = C2105.m6981("֡᩶") ^ i4;
                        i = ((iM2566 ^ i5) * 24353) ^ 1214495868;
                        i2 = -1491270149;
                    } else {
                        iM2566 = C0630.m2566("ܽܺ") ^ i5;
                        i = ((iM2566 ^ i4) * (-8479)) ^ 1763293741;
                        i2 = -676059502;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -759270351:
                case 1122825206:
                    strM5914 = strM5914;
                    textView2 = textView2;
                    textView3 = textView3;
                    s = sArr[52];
                    s2 = 16507;
                    if (C1047.f3863 >= 0) {
                        iM2567 = C2105.m6981("ۨ۬") ^ i5;
                        i6 = ((iM2567 ^ i4) * 27005) ^ (-231907215);
                        i3 = -1822061198;
                    } else {
                        iM2567 = (i5 - C0630.m2566("ۤ۬")) * (-71);
                        i6 = ((iM2567 ^ i4) * 20479) ^ 1210655128;
                        i3 = 533114601;
                    }
                    int i15 = iM2567 ^ i3;
                    strM5914 = strM5914;
                    textView3 = textView3;
                    textView2 = textView2;
                    i7 = i15;
                    c14676 = this;
                    break;
                case -680981128:
                case 1949117246:
                    TextView textView6 = textView3;
                    String str2 = strM5914;
                    RunnableC1937.m6377(textView6, str2);
                    TextView textView7 = c14676.f44848;
                    String strM39302 = c16709.m39302();
                    if (C2105.f7037 != 0) {
                        strM5914 = str2;
                        textView2 = textView7;
                        str = strM39302;
                        textView3 = textView6;
                        iM2566 = C2105.m6981("֫ۙ") ^ i4;
                        i = ((iM2566 ^ i5) * (-7707)) ^ 694159684;
                        i2 = -613024682;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        int iM6983 = C2105.m6981("᩷ۡ") ^ i4;
                        i6 = ((iM6983 ^ i5) * (-9579)) ^ (-649689025);
                        i7 = iM6983 ^ (-1483488756);
                        strM5914 = str2;
                        textView2 = textView7;
                        str = strM39302;
                        textView3 = textView6;
                    }
                    break;
                case -229140004:
                case 1385084283:
                    C1420.m4905(sbM19190, C3245.m9934(f44829, 55, 1, i8));
                    strM1959 = C0422.m1959(sbM19190);
                    iM2566 = (C0630.m2566("ܺܿ") ^ i4) * (-77);
                    i = ((iM2566 ^ i5) * 30741) ^ 1198718976;
                    i2 = 16286624;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -163238299:
                case 801892510:
                    textView = textView2;
                    C1047.m3601(textView, str);
                    C1047.m3601(c14676.f44831, c16709.m39286());
                    strM936 = C0050.m935(c16709.m39320());
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        int iM6984 = (i5 - C2105.m6981("۫ۛ")) * (-25);
                        i = ((iM6984 ^ i4) * (-24533)) ^ (-1348239264);
                        textView2 = textView;
                        i7 = iM6984 ^ (-2016422266);
                        i6 = i;
                    } else {
                        int iM6985 = (C2105.m6981("᩸ۢ") ^ i5) * 51;
                        TextView textView8 = textView;
                        i6 = ((iM6985 ^ i4) * 25845) ^ 1738295769;
                        textView2 = textView8;
                        i7 = iM6985 ^ 1775171208;
                    }
                    break;
                case -155075688:
                case 1612577577:
                    i8 = 58407;
                    iM2567 = C2105.m6981("ۘ۫") ^ i4;
                    i6 = ((iM2567 ^ i5) * 21437) ^ 325952763;
                    i3 = -986044184;
                    int i16 = iM2567 ^ i3;
                    strM5914 = strM5914;
                    textView3 = textView3;
                    textView2 = textView2;
                    i7 = i16;
                    c14676 = this;
                    break;
                case -120795938:
                case 365426380:
                    strM5914 = strM5914;
                    textView2 = textView2;
                    textView3 = textView3;
                    sArr = f44829;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2567 = (C2105.m6981("᩵᩷") + i4) * 61;
                        i6 = ((iM2567 ^ i5) * (-27375)) ^ (-2022149865);
                        i3 = 193055194;
                    } else {
                        iM2567 = (C0630.m2566("֨᩹") + i4) * 9;
                        i6 = ((iM2567 ^ i5) * (-31933)) ^ 1825988226;
                        i3 = -1982444793;
                    }
                    int i17 = iM2567 ^ i3;
                    strM5914 = strM5914;
                    textView3 = textView3;
                    textView2 = textView2;
                    i7 = i17;
                    c14676 = this;
                    break;
                case -88133935:
                case 71933843:
                    C1047.m3601(c14676.f44840, c16709.m39317());
                    view2 = c14676.f44842;
                    if (c167010 == null) {
                        iM2566 = (C0630.m2566("ۢۨ") ^ i5) * (-125);
                        i = ((iM2566 ^ i4) * (-18813)) ^ (-709148590);
                        i2 = -1331705716;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܺۙ")) * (-95);
                        i = ((iM2566 ^ i5) * 16747) ^ (-306505591);
                        i2 = -841514255;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 40004545:
                case 793173206:
                    C4075.m12263();
                    break;
                case 249711913:
                case 359439367:
                    C1047.m3601(c14676.f44833, C5350.m15315(c16709.m39322(), z));
                    iM2566 = (C0630.m2566("᩶ۖ") ^ i4) * (-81);
                    i = ((iM2566 ^ i5) * (-32449)) ^ 571247130;
                    i2 = -1349535454;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 624056846:
                case 779302939:
                    m34964();
                    break;
                case 635269804:
                case 1984741721:
                    if (!C1504.f5354) {
                        iM2566 = C2105.m6981("֡᩶") ^ i4;
                        i = ((iM2566 ^ i5) * 24353) ^ 1214495868;
                        i2 = -1491270149;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        strM5914 = strM5914;
                        textView2 = textView2;
                        textView3 = textView3;
                        iM2567 = (C2105.m6981("᩵᩷") + i4) * 61;
                        i6 = ((iM2567 ^ i5) * (-27375)) ^ (-2022149865);
                        i3 = 193055194;
                        int i18 = iM2567 ^ i3;
                        strM5914 = strM5914;
                        textView3 = textView3;
                        textView2 = textView2;
                        i7 = i18;
                        c14676 = this;
                    }
                    break;
                case 1298260515:
                case 2059433249:
                    TextView textView9 = textView2;
                    c14676.f44836.setImageDrawable(c16709.m39308());
                    TextView textView10 = c14676.f44847;
                    strM5914 = C1773.m5914(c16709);
                    if (!C2126.f7087) {
                        int iM2568 = C0630.m2566("۠ۤ") ^ i5;
                        textView3 = textView10;
                        textView2 = textView9;
                        i6 = ((iM2568 ^ i4) * (-28263)) ^ 303377964;
                        i7 = iM2568 ^ (-1384416484);
                        c14676 = this;
                    } else {
                        textView3 = textView10;
                        textView2 = textView9;
                        iM2566 = C2105.m6981("֫ۙ") ^ i4;
                        i = ((iM2566 ^ i5) * (-7707)) ^ 694159684;
                        i2 = -613024682;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    }
                    break;
                case 1346701740:
                case 1912108822:
                    C3746.m11360(view2, i9);
                    iM2566 = C2105.m6981("᩺᩻") ^ i5;
                    i = ((iM2566 ^ i4) * 20205) ^ (-2052182330);
                    i2 = -60319383;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 1470894501:
                case 1768830785:
                    i8 = 14570;
                    iM2567 = C2105.m6981("ۘ۫") ^ i4;
                    i6 = ((iM2567 ^ i5) * 21437) ^ 325952763;
                    i3 = -986044184;
                    int i19 = iM2567 ^ i3;
                    strM5914 = strM5914;
                    textView3 = textView3;
                    textView2 = textView2;
                    i7 = i19;
                    c14676 = this;
                    break;
                case 1939201706:
                case 1956378978:
                    c14676.m34969(-2, z);
                    c14676.f44844.scrollTo(z ? 1 : 0, z ? 1 : 0);
                    if (C7811.f24123 >= 0) {
                        iM2566 = C2105.m6981("֡᩶") ^ i4;
                        i = ((iM2566 ^ i5) * 24353) ^ 1214495868;
                        i2 = -1491270149;
                    } else {
                        iM2566 = C2105.m6981("ۜܰ") ^ i5;
                        i = ((iM2566 ^ i4) * 20609) ^ 57395816;
                        i2 = -585119647;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 2112511553:
                case 2116873009:
                    sbM19190 = C7166.m19190(strM39286, C2520.m8030(f44829, 53, 2, i8));
                    C0422.m1944(sbM19190, c167010.m39320());
                    if (RunnableC3474.m10630()) {
                        iM2566 = (C2105.m6981("᩶ܰ") ^ i5) * 81;
                        i = ((iM2566 ^ i4) * 18203) ^ 1307478795;
                        i2 = -1768836761;
                    } else {
                        iM2566 = C2105.m6981("֫ۙ") ^ i4;
                        i = ((iM2566 ^ i5) * (-7707)) ^ 694159684;
                        i2 = -613024682;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                default:
                    C1128.m3853(view, i9);
                    iM2566 = (C0630.m2566("᩶ۖ") ^ i4) * (-81);
                    i = ((iM2566 ^ i5) * (-32449)) ^ 571247130;
                    i2 = -1349535454;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01e6 A[PHI: r7 r10
      0x01e6: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:58:0x01e4, B:32:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r10v3 int) = (r10v2 int), (r10v1 int) binds: [B:58:0x01e4, B:32:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0232 A[PHI: r24
      0x0232: PHI (r24v4 int) = (r24v3 int), (r24v3 int), (r24v3 int), (r24v7 int) binds: [B:18:0x0084, B:16:0x0080, B:9:0x0059, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x02ff A[PHI: r4 r5 r6
      0x02ff: PHI (r4v3 android.text.Layout) = (r4v2 android.text.Layout), (r4v1 android.text.Layout), (r4v1 android.text.Layout) binds: [B:83:0x02e6, B:76:0x028f, B:68:0x0264] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r5v3 boolean) = (r5v2 boolean), (r5v1 boolean), (r5v1 boolean) binds: [B:83:0x02e6, B:76:0x028f, B:68:0x0264] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r6v3 boolean) = (r6v2 boolean), (r6v1 boolean), (r6v1 boolean) binds: [B:83:0x02e6, B:76:0x028f, B:68:0x0264] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0338 A[PHI: r2 r9 r16 r17
      0x0338: PHI (r2v3 android.widget.ScrollView) = 
      (r2v2 android.widget.ScrollView)
      (r2v1 android.widget.ScrollView)
      (r2v1 android.widget.ScrollView)
      (r2v1 android.widget.ScrollView)
      (r2v1 android.widget.ScrollView)
     binds: [B:91:0x0336, B:62:0x0218, B:36:0x010c, B:16:0x0080, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:91:0x0336, B:62:0x0218, B:36:0x010c, B:16:0x0080, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r16v3 int) = (r16v1 int), (r16v1 int), (r16v2 int), (r16v1 int), (r16v1 int) binds: [B:91:0x0336, B:62:0x0218, B:36:0x010c, B:16:0x0080, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r17v3 int) = (r17v1 int), (r17v1 int), (r17v2 int), (r17v1 int), (r17v1 int) binds: [B:91:0x0336, B:62:0x0218, B:36:0x010c, B:16:0x0080, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x036e A[PHI: r3 r11 r13 r23
      0x036e: PHI (r3v3 android.widget.TextView) = 
      (r3v1 android.widget.TextView)
      (r3v2 android.widget.TextView)
      (r3v1 android.widget.TextView)
      (r3v1 android.widget.TextView)
      (r3v1 android.widget.TextView)
     binds: [B:97:0x036c, B:87:0x0318, B:54:0x01c4, B:45:0x016a, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x036e: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:97:0x036c, B:87:0x0318, B:54:0x01c4, B:45:0x016a, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x036e: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:97:0x036c, B:87:0x0318, B:54:0x01c4, B:45:0x016a, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x036e: PHI (r23v4 android.view.View) = 
      (r23v2 android.view.View)
      (r23v1 android.view.View)
      (r23v1 android.view.View)
      (r23v1 android.view.View)
      (r23v1 android.view.View)
     binds: [B:97:0x036c, B:87:0x0318, B:54:0x01c4, B:45:0x016a, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m34973(C14676 c14676) {
        int iM2566;
        int i;
        int i2;
        C14676 c14677 = c14676;
        ScrollView scrollView = null;
        TextView textView = null;
        Layout layout = null;
        boolean z = false;
        boolean z2 = false;
        int totalPaddingTop = 0;
        int i3 = 0;
        int totalPaddingBottom = 0;
        int i4 = 0;
        int totalPaddingTop2 = 0;
        int i5 = 0;
        int totalPaddingBottom2 = 0;
        int iM28026 = 0;
        int iM3498 = 0;
        int i6 = 27336908;
        int i7 = C3019.f9544;
        int i8 = C0483.f2088;
        int iM2567 = (C0630.m2566("᩻᩵") ^ i7) * (-127);
        int i9 = ((iM2567 ^ i8) * 11159) ^ (-1700111085);
        int i10 = iM2567 ^ (-172622381);
        int i11 = 0;
        int i12 = 0;
        View view = null;
        int height = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i8) * 32701) >> 31));
            switch (i6) {
                case -1966780148:
                case -1801542927:
                    totalPaddingBottom2 = textView.getTotalPaddingBottom() + totalPaddingTop2;
                    iM2566 = C0630.m2566("᩺ۢ") ^ i8;
                    i = ((iM2566 ^ i7) * 12515) ^ 1846932825;
                    i2 = 987913251;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1868308029:
                case 1594777741:
                    totalPaddingTop2 = textView.getTotalPaddingTop() + layout.getLineTop(i4);
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C0630.m2566("᩵᩷") + i7) * (-111);
                        i = ((iM2566 ^ i8) * (-17035)) ^ (-404585505);
                        i2 = 1747763274;
                    } else {
                        iM2566 = (i7 - C2105.m6981("ᩳۜ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2566 ^ i8) * 16933) ^ (-1620864019);
                        i2 = 230985250;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1764442682:
                case 393610748:
                    if (C11340.m28026(view) == 0) {
                        iM2566 = C0630.m2566("ۧۢ") ^ i7;
                        i = ((iM2566 ^ i8) * 30823) ^ (-2122973684);
                        i2 = 213496665;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ۧۖ")) * 41;
                        i = ((iM2566 ^ i7) * 31695) ^ 1106168742;
                        i2 = 1441649080;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1649747720:
                case 1136457922:
                    if (C0798.f2919) {
                        iM2566 = C0630.m2566("ܺ֫") ^ i8;
                        i = ((iM2566 ^ i7) * 27439) ^ 419141952;
                        i2 = -1403933122;
                    } else {
                        iM2566 = (C0630.m2566("֨ۡ") + i7) * (-39);
                        i = ((iM2566 ^ i8) * (-10783)) ^ (-604155657);
                        i2 = -1042947669;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1553721659:
                case -376796039:
                    View view2 = c14677.f44832;
                    if (C0630.f2410 <= 0) {
                        view = view2;
                        iM2566 = (C0630.m2566("᩵᩷") + i7) * (-111);
                        i = ((iM2566 ^ i8) * (-17035)) ^ (-404585505);
                        i2 = 1747763274;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        int iM6981 = (i7 - C2105.m6981("᩹ۗ")) * 71;
                        i10 = iM6981 ^ (-1055794488);
                        view = view2;
                        i9 = ((iM6981 ^ i8) * (-5659)) ^ 2063290182;
                        c14677 = c14676;
                    }
                    break;
                case -1478283161:
                case 1453561096:
                    i3 = totalPaddingTop + height;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("ۙ۟") ^ i7;
                        i = ((iM2566 ^ i8) * 18871) ^ (-675498952);
                        i2 = -237634426;
                    } else {
                        iM2566 = C0630.m2566("ܳ۫") ^ i7;
                        i = ((iM2566 ^ i8) * 17873) ^ 418877930;
                        i2 = -866364466;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1473689504:
                case -440258168:
                    i5 = -2;
                    if (totalPaddingBottom <= totalPaddingBottom2) {
                        iM2566 = (C0630.m2566("ܳۘ") ^ i7) * (-47);
                        i = ((iM2566 ^ i8) * (-31253)) ^ 477519935;
                        i2 = 1129881610;
                    } else {
                        iM2566 = C2105.m6981("ۨ۟") ^ i8;
                        i = ((iM2566 ^ i7) * (-32373)) ^ 1224320758;
                        i2 = -1213425271;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1295494811:
                case 1319227646:
                    totalPaddingTop = textView.getTotalPaddingTop();
                    if (C3911.f12484 >= 0) {
                        iM2566 = C0630.m2566("ܺ֫") ^ i8;
                        i = ((iM2566 ^ i7) * 27439) ^ 419141952;
                        i2 = -1403933122;
                    } else {
                        iM2566 = C2105.m6981("ܿܿ") ^ i8;
                        i = ((iM2566 ^ i7) * 24489) ^ 1535554788;
                        i2 = -1988090645;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1007052342:
                case -942103657:
                    layout = textView.getLayout();
                    z = true;
                    z = true;
                    z2 = false;
                    z2 = false;
                    if (layout != null) {
                        iM2566 = (i8 - C2105.m6981("ۛܽ")) * (-53);
                        i = ((iM2566 ^ i7) * (-23299)) ^ 457273516;
                        i2 = -1547563525;
                    } else {
                        iM2566 = C0630.m2566("ۧۢ") ^ i7;
                        i = ((iM2566 ^ i8) * 30823) ^ (-2122973684);
                        i2 = 213496665;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -848424281:
                case 1754207101:
                    iM28026 = C11340.m28026(view);
                    iM3498 = C1005.m3498(c14677.f44844);
                    if (C2105.m6982() != 0) {
                        iM2566 = C0630.m2566("ܺ֫") ^ i8;
                        i = ((iM2566 ^ i7) * 27439) ^ 419141952;
                        i2 = -1403933122;
                    } else {
                        iM2566 = C2105.m6981("ۡ᩵") ^ i7;
                        i = ((iM2566 ^ i8) * (-17865)) ^ 167997732;
                        i2 = -350304319;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -795440478:
                case 2000387426:
                    C0483.m2121();
                    if (C5695.f17556 < 0) {
                        iM2566 = C0630.m2566("ܺ֫") ^ i8;
                        i = ((iM2566 ^ i7) * 27439) ^ 419141952;
                        i2 = -1403933122;
                    } else {
                        iM2566 = (C0630.m2566("᩵᩷") + i7) * (-111);
                        i = ((iM2566 ^ i8) * (-17035)) ^ (-404585505);
                        i2 = 1747763274;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -783759514:
                case 1845071423:
                    if (C0237.m1484(z2 ? 1 : 0, i11) + totalPaddingBottom2 > C11340.m28026(scrollView)) {
                        iM2566 = C0630.m2566("۠᩵") ^ i7;
                        i = ((iM2566 ^ i8) * 15351) ^ (-1160626495);
                        i2 = 934653951;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ۗۤ")) * (-45);
                        i = ((iM2566 ^ i7) * (-28917)) ^ (-1162882759);
                        i2 = -359207073;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -770261179:
                case -762243613:
                    c14677.f44841 = z2 ? 1 : 0;
                    return z;
                case -741922017:
                case 228448362:
                    C1773.m5908();
                    C2520.m8026();
                    return false;
                case -663070029:
                case 611011477:
                    textView = c14677.f44840;
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C0630.m2566("᩵᩷") + i7) * (-111);
                        i = ((iM2566 ^ i8) * (-17035)) ^ (-404585505);
                        i2 = 1747763274;
                    } else {
                        iM2566 = (C0630.m2566("ܰۙ") ^ i8) * (-69);
                        i = ((iM2566 ^ i7) * (-5065)) ^ (-1455269905);
                        i2 = 412682980;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -636171878:
                case -603798735:
                    return c14677.m34969(i5, z2);
                case -569008718:
                case 470077967:
                    return c14677.m34969(i5, z2);
                case -540291886:
                case 1936858508:
                    C0630.m2564();
                    C1504.m5179();
                    iM2566 = (C0630.m2566("֨ۡ") + i7) * (-39);
                    i = ((iM2566 ^ i8) * (-10783)) ^ (-604155657);
                    i2 = -1042947669;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -518461838:
                case 598154598:
                    int i13 = c14677.f44841;
                    if (i13 < 4) {
                        int iM2568 = C0630.m2566("ᩴ۬") ^ i7;
                        i12 = i13;
                        i9 = ((iM2568 ^ i8) * (-19599)) ^ (-1372347671);
                        i10 = iM2568 ^ (-2037728283);
                    } else {
                        i12 = i13;
                        iM2566 = (C0630.m2566("ܶۚ") ^ i7) * 13;
                        i = ((iM2566 ^ i8) * (-32167)) ^ (-915279287);
                        i2 = -1021045311;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    break;
                case -442881237:
                case 477408848:
                    C3432.m10477();
                    if (C2105.f7037 == 0) {
                        iM2566 = (C0630.m2566("֨ۡ") + i7) * (-39);
                        i = ((iM2566 ^ i8) * (-10783)) ^ (-604155657);
                        i2 = -1042947669;
                    } else {
                        iM2566 = (i8 - C2105.m6981("᩸ܰ")) * 31;
                        i = ((iM2566 ^ i7) * (-10423)) ^ 1894456717;
                        i2 = 1943556727;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -60137249:
                case 1797785837:
                    c14677.f44841 = i12 + (z ? 1 : 0);
                    c14676.m34964();
                    return z2;
                case 78742966:
                case 1237218528:
                    i4 = 6;
                    if (layout.getLineCount() > 6) {
                        iM2566 = (C2105.m6981("᩶᩷") + i8) * 33;
                        i = ((iM2566 ^ i7) * 2475) ^ (-379811470);
                        i2 = 1398332551;
                    } else {
                        totalPaddingBottom2 = totalPaddingBottom;
                        iM2566 = C0630.m2566("᩺ۢ") ^ i8;
                        i = ((iM2566 ^ i7) * 12515) ^ 1846932825;
                        i2 = 987913251;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 113222021:
                case 1282942432:
                    i11 = iM28026 - iM3498;
                    if (C4159.m12565() >= 0) {
                        iM2566 = C0630.m2566("ۙ۟") ^ i7;
                        i = ((iM2566 ^ i8) * 18871) ^ (-675498952);
                        i2 = -237634426;
                    } else {
                        iM2566 = (C2105.m6981("ᩴ᩵") ^ i8) * (-39);
                        i = ((iM2566 ^ i7) * 15803) ^ (-451031057);
                        i2 = -749436076;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 570244134:
                case 1827090967:
                    totalPaddingBottom = textView.getTotalPaddingBottom() + i3;
                    if (C1504.f5354) {
                        iM2566 = (C0630.m2566("᩵᩷") + i7) * (-111);
                        i = ((iM2566 ^ i8) * (-17035)) ^ (-404585505);
                        i2 = 1747763274;
                    } else {
                        iM2566 = (C2105.m6981("۟ܺ") ^ i7) * (-125);
                        i = ((iM2566 ^ i8) * (-31249)) ^ (-1825771864);
                        i2 = -1316524287;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 670440278:
                case 1580322913:
                    scrollView = c14677.f44839;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("ܺ֫") ^ i8;
                        i = ((iM2566 ^ i7) * 27439) ^ 419141952;
                        i2 = -1403933122;
                    } else {
                        iM2566 = C2105.m6981("ۢۙ") ^ i8;
                        i = ((iM2566 ^ i7) * 24833) ^ (-1979820318);
                        i2 = -79117919;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 727322690:
                case 744927869:
                    return c14677.m34969(totalPaddingBottom2, z);
                case 1847508336:
                case 1850103635:
                    if (C1005.m3498(scrollView) != 0) {
                        iM2566 = C0630.m2566("᩷֨") ^ i8;
                        i = ((iM2566 ^ i7) * 15483) ^ 938005420;
                        i2 = 1240781268;
                    } else {
                        iM2566 = C0630.m2566("ۧۢ") ^ i7;
                        i = ((iM2566 ^ i8) * 30823) ^ (-2122973684);
                        i2 = 213496665;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                default:
                    c14677.f44841 = z2 ? 1 : 0;
                    height = layout.getHeight();
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C0630.m2566("֨ۡ") + i7) * (-39);
                        i = ((iM2566 ^ i8) * (-10783)) ^ (-604155657);
                        i2 = -1042947669;
                    } else {
                        iM2566 = C0630.m2566("֡۠") ^ i7;
                        i = ((iM2566 ^ i8) * 6043) ^ (-1327133761);
                        i2 = 1600744906;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m34969(int i, boolean z) {
        int iM2566;
        int i2;
        boolean z2 = false;
        ScrollView scrollView = null;
        ViewGroup.LayoutParams layoutParamsM13553 = null;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 524727563;
        int i4 = C4117.f13076;
        int i5 = C4075.f12947;
        int iM2567 = (C0630.m2566("۠֫") + i5) * (-11);
        int i6 = ((iM2567 ^ i4) * (-7387)) ^ (-574458541);
        int i7 = 1794661235;
        while (true) {
            int i8 = iM2567 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i4) * 17463) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1869749645:
                    case -1269413958:
                        C1504.m5179();
                        iM2567 = (i5 - C0630.m2566("ۙܶ")) * 9;
                        i6 = ((iM2567 ^ i4) * 45) ^ 1135626041;
                        i7 = -568536525;
                        break;
                    case -1842679528:
                    case 1833786467:
                        this.f44839.requestDisallowInterceptTouchEvent(z3);
                        scrollView.scrollTo(z3 ? 1 : 0, z3 ? 1 : 0);
                        iM2567 = (C0630.m2566("۟ᩳ") ^ i4) * (-49);
                        i6 = ((iM2567 ^ i5) * 25231) ^ (-1535042850);
                        i7 = 681495646;
                        break;
                    case -1773589187:
                    case 355941120:
                        C0050.m940();
                        return false;
                    case -1748279406:
                    case -1239783302:
                        if (!z) {
                            iM2567 = C2105.m6981("ۗۙ") ^ i5;
                            i6 = ((iM2567 ^ i4) * 1689) ^ 1595888933;
                            i7 = -796933508;
                            break;
                        }
                        iM2567 = (C0630.m2566("۟ᩳ") ^ i4) * (-49);
                        i6 = ((iM2567 ^ i5) * 25231) ^ (-1535042850);
                        i7 = 681495646;
                        break;
                        break;
                    case -1662022686:
                    case 217159985:
                        if (RunnableC1937.f6483 < 0) {
                            iM2567 = (C2105.m6981("۫ۗ") ^ i4) * (-55);
                            i6 = ((iM2567 ^ i5) * 14075) ^ 62225706;
                            i7 = -2088693194;
                            break;
                        }
                        iM2567 = (C2105.m6981("ۛܳ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = ((iM2567 ^ i4) * (-5739)) ^ (-984330791);
                        i7 = -1500578679;
                        break;
                    case -1652365315:
                    case -833923008:
                        if (C2520.f8000 < 0) {
                            iM2567 = (C2105.m6981("᩹᩶") ^ i4) * (-75);
                            i6 = ((iM2567 ^ i5) * 20269) ^ (-3471105);
                            i7 = 222661401;
                            break;
                        }
                        iM2567 = (C2105.m6981("ۛܳ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = ((iM2567 ^ i4) * (-5739)) ^ (-984330791);
                        i7 = -1500578679;
                        break;
                        break;
                    case -1621506836:
                    case -557714557:
                        z2 = this.f44850;
                        this.f44850 = z;
                        if (!C2126.m7040()) {
                            iM2567 = (i5 - C2105.m6981("᩷֨")) * (-91);
                            i6 = ((iM2567 ^ i4) * (-8501)) ^ 1487245739;
                            i7 = -382382245;
                            break;
                        }
                        iM2567 = (C0630.m2566("ܿۤ") + i5) * (-107);
                        i6 = ((iM2567 ^ i4) * 30735) ^ (-78072233);
                        i7 = 895905196;
                        break;
                    case -1613305445:
                    case -255267402:
                        if (!C0382.f1805) {
                            iM2567 = (C2105.m6981("ܿܰ") ^ i4) * (-103);
                            i6 = ((iM2567 ^ i5) * 30477) ^ 1333082008;
                            i7 = -860980518;
                            break;
                        }
                        iM2567 = C2105.m6981("ۘۡ") ^ i5;
                        i6 = ((iM2567 ^ i4) * 2385) ^ 1389975928;
                        i7 = -1931962585;
                        break;
                    case -1501469795:
                    case -429909811:
                        z4 = true;
                        iM2567 = C0630.m2566("۟۠") ^ i4;
                        i6 = ((iM2567 ^ i5) * 11613) ^ (-1493530206);
                        i7 = 152255160;
                        break;
                    case -1349345177:
                    case 1324650380:
                        if (C4263.f13799 > 0) {
                            iM2567 = C0630.m2566("᩻۬") ^ i5;
                            i6 = ((iM2567 ^ i4) * (-31483)) ^ (-924136523);
                            i7 = -2069253320;
                            break;
                        }
                        iM2567 = (C2105.m6981("ܿܰ") ^ i4) * (-103);
                        i6 = ((iM2567 ^ i5) * 30477) ^ 1333082008;
                        i7 = -860980518;
                        break;
                        break;
                    case -1259371802:
                    case -556505000:
                        if (!C0422.m1963()) {
                            iM2567 = (C2105.m6981("ۛܳ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i6 = ((iM2567 ^ i4) * (-5739)) ^ (-984330791);
                            i7 = -1500578679;
                            break;
                            break;
                        }
                        iM2567 = (C2105.m6981("֡᩵") ^ i5) * (-7);
                        i6 = ((iM2567 ^ i4) * (-19953)) ^ 1670778922;
                        i7 = -635122912;
                        break;
                    case -1069770330:
                    case -650076491:
                        if (RunnableC3474.f10992 > 0) {
                            iM2567 = C2105.m6981("ᩴܰ") ^ i5;
                            i6 = ((iM2567 ^ i4) * 17569) ^ 1538449104;
                            i7 = -1659336226;
                            break;
                        }
                        iM2567 = (C2105.m6981("ۛܳ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = ((iM2567 ^ i4) * (-5739)) ^ (-984330791);
                        i7 = -1500578679;
                        break;
                        break;
                    case -984380289:
                    case 1643315992:
                        scrollView = this.f44844;
                        scrollView.setVerticalScrollBarEnabled(z);
                        layoutParamsM13553 = C4616.m13553(scrollView);
                        if (C1711.m5736() > 0) {
                            iM2567 = (i4 - C2105.m6981("᩻۠")) * (-59);
                            i6 = ((iM2567 ^ i5) * 31295) ^ 1953368992;
                            i7 = -416709062;
                            break;
                        }
                        iM2567 = (C0630.m2566("ܿۤ") + i5) * (-107);
                        i6 = ((iM2567 ^ i4) * 30735) ^ (-78072233);
                        i7 = 895905196;
                        break;
                        break;
                    case -951738408:
                    case 75718134:
                        if (C4263.f13799 > 0) {
                            iM2567 = (C2105.m6981("ۚ֨") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i6 = ((iM2567 ^ i5) * 31349) ^ 1110509241;
                            i7 = 1604023861;
                            break;
                        }
                        iM2567 = (C2105.m6981("ܿܰ") ^ i4) * (-103);
                        i6 = ((iM2567 ^ i5) * 30477) ^ 1333082008;
                        i7 = -860980518;
                        break;
                        break;
                    case -905580030:
                    case -666828964:
                        C1128.m3851();
                        if (!C1711.f5919) {
                            iM2567 = (i5 - C0630.m2566("ۙܶ")) * 9;
                            i6 = ((iM2567 ^ i4) * 45) ^ 1135626041;
                            i7 = -568536525;
                            break;
                            break;
                        }
                        iM2567 = C0630.m2566("ۘ֡") ^ i4;
                        i6 = ((iM2567 ^ i5) * (-7349)) ^ (-2052835173);
                        i7 = -492895020;
                        break;
                    case -615335797:
                    case -582182654:
                        z4 = false;
                        iM2567 = C0630.m2566("۟۠") ^ i4;
                        i6 = ((iM2567 ^ i5) * 11613) ^ (-1493530206);
                        i7 = 152255160;
                        break;
                        break;
                    case -494674999:
                    case 356557626:
                        if (!C0798.f2919) {
                            iM2567 = (C2105.m6981("ۡ۠") ^ i4) * (-29);
                            i6 = ((iM2567 ^ i5) * (-17227)) ^ 893221389;
                            i7 = -445012632;
                            break;
                        }
                        iM2567 = (C2105.m6981("ܿܰ") ^ i4) * (-103);
                        i6 = ((iM2567 ^ i5) * 30477) ^ 1333082008;
                        i7 = -860980518;
                        break;
                        break;
                    case -413030448:
                    case 851385406:
                        if (layoutParamsM13553.height != i) {
                            iM2566 = C0630.m2566("᩻᩹") ^ i5;
                            i6 = ((iM2566 ^ i4) * (-11637)) ^ (-418974533);
                            i2 = 785988891;
                        } else {
                            iM2566 = (i4 - C0630.m2566("ܺܿ")) * (-5);
                            i6 = ((iM2566 ^ i5) * 761) ^ (-2076294185);
                            i2 = -1790523491;
                        }
                        i8 = iM2566 ^ i2;
                        z3 = false;
                        break;
                    case 887663501:
                    case 1597842944:
                        C4075.m12263();
                        if (!C1005.f3721) {
                            iM2567 = (C2105.m6981("ۛܳ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i6 = ((iM2567 ^ i4) * (-5739)) ^ (-984330791);
                            i7 = -1500578679;
                            break;
                            break;
                        }
                        iM2567 = (C2105.m6981("ܿܰ") ^ i4) * (-103);
                        i6 = ((iM2567 ^ i5) * 30477) ^ 1333082008;
                        i7 = -860980518;
                        break;
                        break;
                    case 1271645883:
                    case 1836766812:
                        layoutParamsM13553.height = i;
                        scrollView.setLayoutParams(layoutParamsM13553);
                        iM2567 = C0630.m2566("ۙۤ") ^ i5;
                        i6 = ((iM2567 ^ i4) * 19507) ^ (-416299180);
                        i7 = 1044488841;
                        break;
                    case 1478756678:
                    case 1952917686:
                        if (!z2) {
                            iM2567 = (C0630.m2566("۟ᩳ") ^ i4) * (-49);
                            i6 = ((iM2567 ^ i5) * 25231) ^ (-1535042850);
                            i7 = 681495646;
                            break;
                            break;
                        }
                        iM2567 = (C0630.m2566("ܰ۫") ^ i4) * 63;
                        i6 = ((iM2567 ^ i5) * 27515) ^ 1775513519;
                        i7 = -910379268;
                        break;
                    case 1608154110:
                    case 1785986362:
                        if (!z4) {
                            iM2567 = C0630.m2566("ۙۤ") ^ i5;
                            i6 = ((iM2567 ^ i4) * 19507) ^ (-416299180);
                            i7 = 1044488841;
                            break;
                            break;
                        }
                        iM2567 = C0630.m2566("᩹ܳ") ^ i5;
                        i6 = ((iM2567 ^ i4) * (-27697)) ^ (-920222580);
                        i7 = -450692002;
                        break;
                    case 1829981411:
                    case 2053148713:
                        if (C4263.m12819() < 0) {
                            iM2567 = (C2105.m6981("ܿܰ") ^ i4) * (-103);
                            i6 = ((iM2567 ^ i5) * 30477) ^ 1333082008;
                            i7 = -860980518;
                            break;
                            break;
                        }
                        iM2567 = (i5 - C0630.m2566("ۙܶ")) * 9;
                        i6 = ((iM2567 ^ i4) * 45) ^ 1135626041;
                        i7 = -568536525;
                        break;
                        break;
                    default:
                        return !z4;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m34964() {
        View view = null;
        IBinder windowToken = null;
        boolean z = false;
        ViewTreeObserver viewTreeObserver = null;
        int i = -1232234119;
        int i2 = C3746.f11829;
        int i3 = C3245.f10203;
        int iM6981 = C2105.m6981("ۧܺ") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-8315)) ^ (-485020610);
        int i5 = 269913774;
        while (true) {
            i = ((((i ^ i2) * 5739) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2070751904:
                case -248335124:
                    C0237.m1481();
                    break;
                case -1952645758:
                case 703248646:
                    C1420.m4913();
                    if (!C0798.f2919) {
                        iM6981 = C2105.m6981("ۡۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17281)) ^ (-1763403113);
                        i5 = 998467689;
                    } else {
                        iM6981 = C2105.m6981("᩵۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 28371) ^ (-628092162);
                        i5 = -1494698493;
                    }
                    break;
                case -1950598496:
                case 1492952346:
                    z = true;
                    if (windowToken == null) {
                        iM6981 = (i2 - C0630.m2566("ۡܶ")) * (-77);
                        i4 = ((iM6981 ^ i3) * (-28975)) ^ (-960758068);
                        i5 = 1718333795;
                    } else {
                        iM6981 = (C2105.m6981("ܰۘ") + i2) * (-5);
                        i4 = ((iM6981 ^ i3) * (-10033)) ^ (-1457869283);
                        i5 = 1110032179;
                    }
                    break;
                case -1630339478:
                case 1566243995:
                    C3663.m11168();
                    if (C21923.f70183 == 0) {
                        iM6981 = (i3 - C0630.m2566("ܳᩴ")) * (-101);
                        i4 = ((iM6981 ^ i2) * 10989) ^ (-32207052);
                        i5 = -581011258;
                    } else {
                        iM6981 = C2105.m6981("᩵۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 28371) ^ (-628092162);
                        i5 = -1494698493;
                    }
                    break;
                case -1412278805:
                case 1896131238:
                    C0483.m2121();
                    ViewOnClickListenerC1958.m6429();
                    iM6981 = C2105.m6981("᩵۠") ^ i3;
                    i4 = ((iM6981 ^ i2) * 28371) ^ (-628092162);
                    i5 = -1494698493;
                    break;
                case -1143151685:
                case 544325431:
                    if (C21923.f70183 != 0) {
                        iM6981 = (C0630.m2566("۟۬") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM6981 ^ i3) * 11849) ^ 2117321693;
                        i5 = -380474658;
                    } else {
                        iM6981 = C2105.m6981("᩵۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 28371) ^ (-628092162);
                        i5 = -1494698493;
                    }
                    break;
                case -1080776692:
                case 1440254280:
                    viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        iM6981 = (C2105.m6981("᩸ܰ") ^ i3) * (-63);
                        i4 = ((iM6981 ^ i2) * 11313) ^ (-1737275534);
                        i5 = -722243229;
                    } else {
                        iM6981 = C2105.m6981("֡᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14331)) ^ (-638404394);
                        i5 = 1063205158;
                    }
                    break;
                case -484564175:
                case 489073076:
                    break;
                case -439238212:
                case 1448027564:
                    if (C1504.f5354) {
                        iM6981 = (i3 - C0630.m2566("ܳᩴ")) * (-101);
                        i4 = ((iM6981 ^ i2) * 10989) ^ (-32207052);
                        i5 = -581011258;
                    } else {
                        iM6981 = C0630.m2566("ᩴ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27581)) ^ 2145162191;
                        i5 = 258157033;
                    }
                    break;
                case -17672973:
                case 350603449:
                    if (C2105.f7037 != 0) {
                        iM6981 = C2105.m6981("ۡۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17281)) ^ (-1763403113);
                        i5 = 998467689;
                    } else {
                        iM6981 = C0630.m2566("ܶ᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-22875)) ^ (-1282150528);
                        i5 = 1259186362;
                    }
                    break;
                case 58378259:
                case 1037757051:
                    view = this.f44837;
                    windowToken = view.getWindowToken();
                    if (C1005.f3721) {
                        iM6981 = C2105.m6981("ۚܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-7235)) ^ (-1070969388);
                        i5 = 815183568;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܳᩴ")) * (-101);
                        i4 = ((iM6981 ^ i2) * 10989) ^ (-32207052);
                        i5 = -581011258;
                    }
                    break;
                case 531371533:
                case 1169689736:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ᩴۗ")) * 33;
                        i4 = ((iM6981 ^ i3) * (-351)) ^ 1503025390;
                        i5 = -905235520;
                    } else {
                        iM6981 = (C0630.m2566("۫ܳ") + i2) * (-87);
                        i4 = ((iM6981 ^ i3) * (-19067)) ^ (-27604037);
                        i5 = 523841196;
                    }
                    break;
                case 537175424:
                case 943475488:
                    if (C3683.f11629 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ᩴۗ")) * 33;
                        i4 = ((iM6981 ^ i3) * (-351)) ^ 1503025390;
                        i5 = -905235520;
                    } else {
                        iM6981 = C0630.m2566("᩺ۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-16819)) ^ (-907688538);
                        i5 = 1740795714;
                    }
                    break;
                case 787494907:
                case 1073584104:
                    if (C3537.f11231 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ᩴۗ")) * 33;
                        i4 = ((iM6981 ^ i3) * (-351)) ^ 1503025390;
                        i5 = -905235520;
                    } else {
                        iM6981 = (C0630.m2566("᩶۟") ^ i2) * 95;
                        i4 = ((iM6981 ^ i3) * (-9757)) ^ 1494282676;
                        i5 = 185883956;
                    }
                    break;
                case 846138357:
                case 1014841981:
                    if (this.f44845) {
                        iM6981 = C2105.m6981("֡᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14331)) ^ (-638404394);
                        i5 = 1063205158;
                    } else {
                        iM6981 = C0630.m2566("۟֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-18359)) ^ 1738569985;
                        i5 = 553863895;
                    }
                    break;
                case 917821594:
                case 1773755367:
                    if (RunnableC1108.m3790()) {
                        iM6981 = (i2 - C0630.m2566("ᩴۗ")) * 33;
                        i4 = ((iM6981 ^ i3) * (-351)) ^ 1503025390;
                        i5 = -905235520;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۗ۟")) * 91;
                        i4 = ((iM6981 ^ i2) * (-16021)) ^ (-1852880092);
                        i5 = 1847896955;
                    }
                    break;
                case 1226687716:
                case 1460805299:
                    this.f44845 = z;
                    if (C1005.f3721) {
                        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC18205(this, viewTreeObserver));
                    }
                    iM6981 = (i2 - C0630.m2566("ᩴۗ")) * 33;
                    i4 = ((iM6981 ^ i3) * (-351)) ^ 1503025390;
                    i5 = -905235520;
                    break;
                case 1769212631:
                case 1940176127:
                    if (C4616.f14690 <= 0) {
                        iM6981 = C2105.m6981("ۡۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17281)) ^ (-1763403113);
                        i5 = 998467689;
                    } else {
                        iM6981 = C2105.m6981("᩷ۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22459) ^ 1145763516;
                        i5 = -1446618633;
                    }
                    break;
                case 1836563015:
                case 1988940595:
                    if (this.f44846) {
                        iM6981 = C2105.m6981("֡᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14331)) ^ (-638404394);
                        i5 = 1063205158;
                    } else {
                        iM6981 = C2105.m6981("֡ܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-28103)) ^ (-2130104754);
                        i5 = 1608701313;
                    }
                    break;
                default:
                    this.f44846 = z;
                    if (C5695.f17556 < 0) {
                        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC17499(this));
                    }
                    iM6981 = (C0630.m2566("۟۬") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i4 = ((iM6981 ^ i3) * 11849) ^ 2117321693;
                    i5 = -380474658;
                    break;
            }
            return;
        }
    }
}
