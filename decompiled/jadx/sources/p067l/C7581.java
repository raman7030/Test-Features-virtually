package p067l;

import android.view.View;
import android.widget.TextView;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D2S2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7581 {

    /* JADX INFO: renamed from: ۧۙ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f82002 = {5069, -11238, 152, 10395, 11913, 4131, 12742, 20057, 20045, 20058, 20033, 20045, 12020, 5375, 7975, 9839, 15408, -11647, 13980, -15230, 5509, 4186, 4484, 12657};

    /* JADX INFO: renamed from: ֫ */
    public ActivityC24364 f19861;

    /* JADX INFO: renamed from: ۜ */
    public final View f19862;

    /* JADX INFO: renamed from: ۧ */
    public C25015 f19863;

    /* JADX INFO: renamed from: ܳ */
    public C4694 f19864;

    /* JADX INFO: renamed from: ܽ */
    public boolean f19865;

    /* JADX INFO: renamed from: ܿ */
    public int f19866;

    /* JADX INFO: renamed from: ᩳ */
    public List f19867;

    /* JADX INFO: renamed from: ᩻ */
    public RunnableC14306 f19868;

    public C7581(ActivityC24364 activityC24364) {
        C4694 c4694;
        InterfaceC14100 interfaceC14100;
        short[] sArr;
        C4694 c4695;
        int iM55680;
        int i;
        C4694 c4696;
        String str;
        View view;
        int iM55979;
        int i2;
        InterfaceC14100 interfaceC14101;
        String str2;
        short[] sArr2;
        C4694 c4697;
        int iM559710;
        C4694 c4698;
        int i3;
        int i4;
        int i5;
        short[] sArr3;
        int iM559711;
        int i6;
        int i7;
        int iM559712;
        int i8;
        C7581 c7581 = this;
        int i9 = C1404.f82149;
        int i10 = C1012.f81938;
        short s = f82002[0];
        int i11 = (s * 7098) - ((s * s) + 12595401) > 0 ? 37267 : 20009;
        int iM55681 = (C0873.m55680("ۘܰ") + i10) * 81;
        int i12 = ((iM55681 ^ i9) * 15921) ^ 434229835;
        InterfaceC14100 interfaceC14102 = null;
        String strM56558 = null;
        View viewM56465 = null;
        TextView textView = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i13 = iM55681 ^ (-1341298774);
        C4694 c4699 = null;
        int i14 = 0;
        int i15 = 0;
        boolean z = false;
        int iM559713 = 0;
        int i16 = 0;
        int iM559714 = 0;
        int iM55682 = 0;
        int iM55683 = 0;
        int i17 = 0;
        int i18 = 1737616677;
        int i19 = i12;
        String strM56252 = null;
        View viewM56111 = null;
        int i20 = 0;
        while (true) {
            i18 = i13 ^ ((((i18 ^ i9) * (-17083)) >> 31) & i19);
            switch (i18) {
                case -2075740040:
                case 263194404:
                    C25015 c25015 = new C25015(c7581);
                    c7581.f19863 = c25015;
                    C0906.m55818(c4699, c25015);
                    new C3847(new C16297(c7581)).m7551((C14849) c4699);
                    return;
                case -1771158179:
                case 829194163:
                    C1012.m56134();
                    if (!C1048.f81963) {
                        iM559712 = C0946.m55979("ۨۧ") ^ i9;
                        i19 = ((iM559712 ^ i10) * (-11343)) ^ (-2099545435);
                        i8 = 70089984;
                        i13 = iM559712 ^ i8;
                    } else {
                        c4694 = c4699;
                        short[] sArr8 = sArr6;
                        interfaceC14100 = interfaceC14102;
                        sArr = sArr8;
                        int iM559715 = (i10 - C0946.m55979("᩹ۡ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        viewM56111 = viewM56111;
                        C4694 c46910 = c4694;
                        i13 = iM559715 ^ (-1760579078);
                        i19 = ((iM559715 ^ i9) * 23527) ^ (-860539849);
                        c4699 = c46910;
                        InterfaceC14100 interfaceC14103 = interfaceC14100;
                        sArr6 = sArr;
                        interfaceC14102 = interfaceC14103;
                    }
                    break;
                case -1744363771:
                case -508542425:
                    c4694 = c4699;
                    textView = (TextView) viewM56465;
                    strM56252 = C1036.m56252(f82002, 18, 3, i11);
                    iM55680 = (i9 - C0946.m55979("ۘ۠")) * (-29);
                    i19 = ((iM55680 ^ i10) * 5733) ^ 1435783846;
                    i = -312897165;
                    i5 = iM55680 ^ i;
                    c4699 = c4694;
                    i13 = i5;
                    break;
                case -1691923732:
                case 890535472:
                    c4694 = c4699;
                    InterfaceC14100 interfaceC14104 = interfaceC14102;
                    sArr = sArr6;
                    short[] sArr9 = sArr5;
                    strM56558 = C1929.m56558(sArr9, 7, 5, i11);
                    if (C1929.f83011 == 0) {
                        int iM55684 = C0873.m55680("ۨۡ") ^ i9;
                        sArr5 = sArr9;
                        sArr6 = sArr;
                        interfaceC14102 = interfaceC14104;
                        i19 = ((iM55684 ^ i10) * (-2523)) ^ (-1412222080);
                        z = false;
                        c4695 = c4694;
                        i13 = iM55684 ^ (-279358400);
                        c4699 = c4695;
                    } else {
                        sArr5 = sArr9;
                        viewM56111 = viewM56111;
                        interfaceC14100 = interfaceC14104;
                        z = false;
                        int iM559716 = (i10 - C0946.m55979("᩹ۡ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        viewM56111 = viewM56111;
                        C4694 c46911 = c4694;
                        i13 = iM559716 ^ (-1760579078);
                        i19 = ((iM559716 ^ i9) * 23527) ^ (-860539849);
                        c4699 = c46911;
                        InterfaceC14100 interfaceC14105 = interfaceC14100;
                        sArr6 = sArr;
                        interfaceC14102 = interfaceC14105;
                    }
                    break;
                case -1599900651:
                case 94510071:
                    C4694 c46912 = c4699;
                    InterfaceC14100 interfaceC14106 = interfaceC14102;
                    sArr = sArr6;
                    interfaceC14100 = interfaceC14106;
                    short[] sArr10 = sArr4;
                    iM55683 = C0873.m55680(C0912.m55822(sArr10, 4, 3, i11));
                    i17 = 2122096451;
                    int iM559717 = (i10 - C0946.m55979("᩵᩹")) * (-115);
                    sArr4 = sArr10;
                    i19 = ((iM559717 ^ i9) * 12585) ^ 345730251;
                    viewM56111 = viewM56111;
                    strM56558 = strM56558;
                    c4699 = c46912;
                    i13 = iM559717 ^ (-50070385);
                    InterfaceC14100 interfaceC14107 = interfaceC14100;
                    sArr6 = sArr;
                    interfaceC14102 = interfaceC14107;
                    break;
                case -1186529379:
                case -71608022:
                    c4696 = c4699;
                    str = strM56558;
                    view = viewM56111;
                    short[] sArr11 = sArr6;
                    interfaceC14100 = interfaceC14102;
                    sArr = sArr11;
                    c7581.f19861 = activityC24364;
                    iM55682 = C0873.m55680(C0937.m55921(f82002, 1, 3, i11));
                    if (C0854.m55595() >= 0) {
                        iM55979 = (C0873.m55680("۠᩷") + i9) * 15;
                        i19 = (-1384032399) ^ ((iM55979 ^ i10) * (-18793));
                        i2 = 1741389338;
                    } else {
                        iM55979 = C0946.m55979("᩹ۙ") ^ i9;
                        i19 = (-771964348) ^ ((iM55979 ^ i10) * (-1693));
                        i2 = -798477006;
                    }
                    viewM56111 = view;
                    strM56558 = str;
                    c4699 = c4696;
                    i13 = iM55979 ^ i2;
                    c7581 = this;
                    InterfaceC14100 interfaceC14108 = interfaceC14100;
                    sArr6 = sArr;
                    interfaceC14102 = interfaceC14108;
                    break;
                case -1122451786:
                case 1659305383:
                    c4699.m9948(C0892.m55755(viewM56111, iM559714 ^ 2120524655));
                    if (C0906.m55809() <= 0) {
                        iM559712 = C0946.m55979("ۨۧ") ^ i9;
                        i19 = ((iM559712 ^ i10) * (-11343)) ^ (-2099545435);
                        i8 = 70089984;
                    } else {
                        iM559712 = C0946.m55979("ۙ֫") ^ i10;
                        i19 = ((iM559712 ^ i9) * (-24963)) ^ 199379474;
                        i8 = -1163622914;
                    }
                    i13 = iM559712 ^ i8;
                    break;
                case -804813117:
                case 1759448861:
                    if (C0894.f81854 >= 0) {
                        c4696 = c4699;
                        str = strM56558;
                        view = viewM56111;
                        short[] sArr12 = sArr6;
                        interfaceC14100 = interfaceC14102;
                        sArr = sArr12;
                        iM55979 = (C0873.m55680("۠᩷") + i9) * 15;
                        i19 = (-1384032399) ^ ((iM55979 ^ i10) * (-18793));
                        i2 = 1741389338;
                        viewM56111 = view;
                        strM56558 = str;
                        c4699 = c4696;
                        i13 = iM55979 ^ i2;
                        c7581 = this;
                        InterfaceC14100 interfaceC14109 = interfaceC14100;
                        sArr6 = sArr;
                        interfaceC14102 = interfaceC14109;
                    } else {
                        c4697 = c4699;
                        interfaceC14101 = interfaceC14102;
                        str2 = strM56558;
                        sArr2 = sArr6;
                        iM559710 = C0946.m55979("᩺᩺") ^ i10;
                        c4698 = c4697;
                        i3 = ((iM559710 ^ i9) * 21901) ^ 184876445;
                        i4 = 611005026;
                        int i21 = iM559710 ^ i4;
                        sArr6 = sArr2;
                        interfaceC14102 = interfaceC14101;
                        i19 = i3;
                        strM56558 = str2;
                        c4699 = c4698;
                        i13 = i21;
                    }
                    break;
                case -777089142:
                case 2018136544:
                    C4694 c46913 = c4699;
                    str2 = strM56558;
                    sArr2 = sArr6;
                    c7581.f19867 = C14976.m34312();
                    c7581.f19866 = C14976.m34317();
                    InterfaceC14100 interfaceC141010 = ApplicationC21448.f67649;
                    sArr5 = f82002;
                    if (AbstractC0942.f81890 <= 0) {
                        interfaceC14101 = interfaceC141010;
                        c4697 = c46913;
                        iM559710 = C0946.m55979("᩺᩺") ^ i10;
                        c4698 = c4697;
                        i3 = ((iM559710 ^ i9) * 21901) ^ 184876445;
                        i4 = 611005026;
                        int i22 = iM559710 ^ i4;
                        sArr6 = sArr2;
                        interfaceC14102 = interfaceC14101;
                        i19 = i3;
                        strM56558 = str2;
                        c4699 = c4698;
                        i13 = i22;
                    } else {
                        int iM55685 = C0873.m55680("ᩴᩳ") ^ i10;
                        sArr6 = sArr2;
                        interfaceC14102 = interfaceC141010;
                        strM56558 = str2;
                        c4699 = c46913;
                        i13 = iM55685 ^ (-2147259545);
                        i19 = ((iM55685 ^ i9) * 1701) ^ (-1248644053);
                    }
                    break;
                case -394488483:
                case 1549872310:
                    c4694 = c4699;
                    viewM56465 = C1404.m56465(viewM56111, C0873.m55680(C1036.m56252(sArr7, i14, i15, i11)) ^ 2124406245);
                    if (!C0917.m55854()) {
                        short[] sArr13 = sArr6;
                        interfaceC14100 = interfaceC14102;
                        sArr = sArr13;
                        int iM559718 = (i10 - C0946.m55979("᩹ۡ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        viewM56111 = viewM56111;
                        C4694 c46914 = c4694;
                        i13 = iM559718 ^ (-1760579078);
                        i19 = ((iM559718 ^ i9) * 23527) ^ (-860539849);
                        c4699 = c46914;
                        InterfaceC14100 interfaceC141011 = interfaceC14100;
                        sArr6 = sArr;
                        interfaceC14102 = interfaceC141011;
                    } else {
                        iM55680 = (C0873.m55680("᩵᩻") + i9) * 57;
                        i19 = ((iM55680 ^ i10) * (-11693)) ^ 1897200300;
                        i = -1508368297;
                        i5 = iM55680 ^ i;
                        c4699 = c4694;
                        i13 = i5;
                    }
                    break;
                case -275881675:
                case 156051527:
                    C0937.m55918();
                    C0898.m55800();
                    c4697 = c4699;
                    interfaceC14101 = interfaceC14102;
                    str2 = strM56558;
                    sArr2 = sArr6;
                    iM559710 = C0946.m55979("᩺᩺") ^ i10;
                    c4698 = c4697;
                    i3 = ((iM559710 ^ i9) * 21901) ^ 184876445;
                    i4 = 611005026;
                    int i23 = iM559710 ^ i4;
                    sArr6 = sArr2;
                    interfaceC14102 = interfaceC14101;
                    i19 = i3;
                    strM56558 = str2;
                    c4699 = c4698;
                    i13 = i23;
                    break;
                case 71379342:
                case 939543030:
                    c4694 = c4699;
                    String str3 = strM56558;
                    short[] sArr14 = sArr6;
                    interfaceC14100 = interfaceC14102;
                    sArr = sArr14;
                    viewM56111 = C0992.m56111(activityC24364, iM55682 ^ 2101462998);
                    c7581.f19862 = viewM56111;
                    sArr4 = f82002;
                    if (C0949.f81897 < 0) {
                        int iM55686 = (C0873.m55680("۬ᩴ") ^ i10) * (-9);
                        viewM56111 = viewM56111;
                        strM56558 = str3;
                        c4699 = c4694;
                        i13 = iM55686 ^ (-1478222057);
                        i19 = ((iM55686 ^ i9) * 27063) ^ (-1492930138);
                        InterfaceC14100 interfaceC141012 = interfaceC14100;
                        sArr6 = sArr;
                        interfaceC14102 = interfaceC141012;
                    } else {
                        strM56558 = str3;
                        int iM559719 = (i10 - C0946.m55979("᩹ۡ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        viewM56111 = viewM56111;
                        C4694 c46915 = c4694;
                        i13 = iM559719 ^ (-1760579078);
                        i19 = ((iM559719 ^ i9) * 23527) ^ (-860539849);
                        c4699 = c46915;
                        InterfaceC14100 interfaceC141013 = interfaceC14100;
                        sArr6 = sArr;
                        interfaceC14102 = interfaceC141013;
                    }
                    break;
                case 191142980:
                case 997437317:
                    C4694 c46916 = c4699;
                    InterfaceC14100 interfaceC141014 = interfaceC14102;
                    String str4 = strM56558;
                    c7581.f19865 = C1053.m56326(interfaceC141014, str4, z);
                    sArr6 = f82002;
                    i16 = 3;
                    int iM559720 = C0946.m55979("᩸ۛ") ^ i10;
                    int i24 = ((iM559720 ^ i9) * 32685) ^ 1174003817;
                    i5 = iM559720 ^ (-701882302);
                    interfaceC14102 = interfaceC141014;
                    strM56558 = str4;
                    i19 = i24;
                    c4699 = c46916;
                    i20 = 12;
                    i13 = i5;
                    break;
                case 203137372:
                case 2120430105:
                    c4694 = c4699;
                    ((C14102) C0892.m55755(viewM56111, iM559713)).setEnabled(z);
                    sArr7 = f82002;
                    i14 = 15;
                    i15 = 3;
                    if (C1003.f81929 > 0) {
                        iM55680 = C0873.m55680("ۛ֡") ^ i10;
                        i19 = ((iM55680 ^ i9) * 15641) ^ (-660234999);
                        i = -378163784;
                        i5 = iM55680 ^ i;
                        c4699 = c4694;
                        i13 = i5;
                    } else {
                        short[] sArr15 = sArr6;
                        interfaceC14100 = interfaceC14102;
                        sArr = sArr15;
                        int iM5597110 = (i10 - C0946.m55979("᩹ۡ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        viewM56111 = viewM56111;
                        C4694 c46917 = c4694;
                        i13 = iM5597110 ^ (-1760579078);
                        i19 = ((iM5597110 ^ i9) * 23527) ^ (-860539849);
                        c4699 = c46917;
                        InterfaceC14100 interfaceC141015 = interfaceC14100;
                        sArr6 = sArr;
                        interfaceC14102 = interfaceC141015;
                    }
                    break;
                case 384631721:
                case 1474086362:
                    C1017.m56187();
                    if (AbstractC0942.f81890 <= 0) {
                        iM559712 = C0946.m55979("ۨۧ") ^ i9;
                        i19 = ((iM559712 ^ i10) * (-11343)) ^ (-2099545435);
                        i8 = 70089984;
                        i13 = iM559712 ^ i8;
                    } else {
                        c4696 = c4699;
                        str = strM56558;
                        view = viewM56111;
                        short[] sArr16 = sArr6;
                        interfaceC14100 = interfaceC14102;
                        sArr = sArr16;
                        iM55979 = (C0873.m55680("۠᩷") + i9) * 15;
                        i19 = (-1384032399) ^ ((iM55979 ^ i10) * (-18793));
                        i2 = 1741389338;
                        viewM56111 = view;
                        strM56558 = str;
                        c4699 = c4696;
                        i13 = iM55979 ^ i2;
                        c7581 = this;
                        InterfaceC14100 interfaceC141016 = interfaceC14100;
                        sArr6 = sArr;
                        interfaceC14102 = interfaceC141016;
                    }
                    break;
                case 436981615:
                case 1703745613:
                    c4694 = c4699;
                    C0946.m55976(textView, C0946.m55979(strM56252) ^ 2126791349);
                    if (C1404.f82149 < 0) {
                        iM55680 = C0873.m55680("ۙۤ") ^ i10;
                        i19 = ((iM55680 ^ i9) * 10541) ^ 1812101218;
                        i = -1435102757;
                        i5 = iM55680 ^ i;
                        c4699 = c4694;
                        i13 = i5;
                    } else {
                        sArr3 = sArr6;
                        iM559711 = C0946.m55979("ۛۖ") ^ i10;
                        i6 = ((iM559711 ^ i9) * 32755) ^ (-998557165);
                        i7 = 595248430;
                        int i25 = iM559711 ^ i7;
                        sArr6 = sArr3;
                        c4695 = c4694;
                        i13 = i25;
                        i19 = i6;
                        c4699 = c4695;
                    }
                    break;
                case 526553560:
                case 1403819177:
                    C1028.m56238(textView, z ? 1 : 0);
                    c4694 = c4699;
                    iM559714 = C0946.m55979(C0989.m56092(f82002, 21, 3, i11));
                    iM55680 = (C0873.m55680("᩷ۚ") ^ i9) * 119;
                    i19 = ((iM55680 ^ i10) * (-5007)) ^ 975166848;
                    i = 570720703;
                    i5 = iM55680 ^ i;
                    c4699 = c4694;
                    i13 = i5;
                    break;
                case 974779403:
                case 1664958473:
                    c4694 = c4699;
                    sArr3 = sArr6;
                    iM559713 = C0946.m55979(C0912.m55822(sArr3, i20, i16, i11)) ^ 2122115636;
                    if (C1046.f81962 <= 0) {
                        iM559711 = C0946.m55979("ۛۖ") ^ i10;
                        i6 = ((iM559711 ^ i9) * 32755) ^ (-998557165);
                        i7 = 595248430;
                    } else {
                        iM559711 = (C0946.m55979("ۘ۟") + i9) * 39;
                        i6 = ((iM559711 ^ i10) * 2653) ^ 1858982092;
                        i7 = 753822252;
                    }
                    int i26 = iM559711 ^ i7;
                    sArr6 = sArr3;
                    c4695 = c4694;
                    i13 = i26;
                    i19 = i6;
                    c4699 = c4695;
                    break;
                case 1393462328:
                case 1414831163:
                    interfaceC14101 = interfaceC14102;
                    str2 = strM56558;
                    sArr2 = sArr6;
                    c4697 = (C4694) C0892.m55755(viewM56111, iM55683 ^ i17);
                    c7581.f19864 = c4697;
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM559710 = C0946.m55979("᩺᩺") ^ i10;
                        c4698 = c4697;
                        i3 = ((iM559710 ^ i9) * 21901) ^ 184876445;
                        i4 = 611005026;
                    } else {
                        iM559710 = C0946.m55979("ۚۡ") ^ i9;
                        c4698 = c4697;
                        i3 = ((iM559710 ^ i10) * 19273) ^ (-1140336191);
                        i4 = 92566513;
                    }
                    int i27 = iM559710 ^ i4;
                    sArr6 = sArr2;
                    interfaceC14102 = interfaceC14101;
                    i19 = i3;
                    strM56558 = str2;
                    c4699 = c4698;
                    i13 = i27;
                    break;
                default:
                    C0866.m55645();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17502() {
        List list = null;
        Iterator itM55925 = null;
        C18249 c18249 = null;
        int i = 1332287365;
        int i2 = ServiceConnectionC1013.f81940;
        int i3 = C0912.f81867;
        int iM55680 = (i3 - C0873.m55680("ۖܿ")) * 17;
        int i4 = ((iM55680 ^ i2) * 12529) ^ (-1507398072);
        int i5 = -1788667816;
        while (true) {
            i = ((((i ^ i2) * (-32737)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1912884104:
                case 1839244789:
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("᩸ܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 15137) ^ (-947351933);
                        i5 = 1426679372;
                    } else {
                        iM55680 = C0873.m55680("ۢ֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-7835)) ^ (-2097704673);
                        i5 = 423419917;
                    }
                    break;
                case -1889581523:
                case 1864115598:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (C0873.m55680("۫ۚ") + i3) * (-29);
                        i4 = ((iM55680 ^ i2) * (-4743)) ^ (-299546481);
                        i5 = -1733427290;
                    } else {
                        iM55680 = C0946.m55979("ᩳۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-18511)) ^ (-1691932998);
                        i5 = -380918649;
                    }
                    break;
                case -1814469035:
                case 2091442781:
                    break;
                case -1704167101:
                case 1251626234:
                    c18249 = (C18249) RunnableC0897.m55785(itM55925);
                    if (c18249.m41537()) {
                        iM55680 = C0873.m55680("۟ۗ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28889)) ^ (-2034646342);
                        i5 = 2059100943;
                    } else {
                        iM55680 = C0873.m55680("֨ۖ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-6081)) ^ (-265528050);
                        i5 = -1550076141;
                    }
                    break;
                case -1574519283:
                case 683604079:
                    RunnableC0871.m55672();
                    C0912.m55833();
                    break;
                case -1434303020:
                case 1200132701:
                    if (C0898.m55800() <= 0) {
                        iM55680 = (C0873.m55680("۫ۚ") + i3) * (-29);
                        i4 = ((iM55680 ^ i2) * (-4743)) ^ (-299546481);
                        i5 = -1733427290;
                    } else {
                        iM55680 = (C0946.m55979("ܽ᩻") ^ i2) * 55;
                        i4 = ((iM55680 ^ i3) * 6041) ^ (-528033288);
                        i5 = 976826261;
                    }
                    break;
                case -1375310196:
                case -736652531:
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0946.m55979("ܶ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26457) ^ (-1082501068);
                        i5 = 1367474555;
                    } else {
                        iM55680 = C0873.m55680("۠۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-501)) ^ (-308051140);
                        i5 = -1421089760;
                    }
                    break;
                case -1230138992:
                case 1115408318:
                    if (C0866.f81837 >= 0) {
                        iM55680 = (C0946.m55979("ᩴܰ") + i2) * (-15);
                        i4 = ((iM55680 ^ i3) * (-26295)) ^ (-833145142);
                        i5 = -151274292;
                    } else {
                        iM55680 = C0873.m55680("۟ۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 7675) ^ 749108043;
                        i5 = 1418138522;
                    }
                    break;
                case -1116402166:
                case -819433309:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0946.m55979("ᩴܰ") + i2) * (-15);
                        i4 = ((iM55680 ^ i3) * (-26295)) ^ (-833145142);
                        i5 = -151274292;
                    } else {
                        iM55680 = (C0946.m55979("ܺۨ") ^ i3) * 41;
                        i4 = ((iM55680 ^ i2) * (-24187)) ^ 1752455808;
                        i5 = 2034591367;
                    }
                    break;
                case -1074178657:
                case 383877304:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0873.m55680("۫ۚ") + i3) * (-29);
                        i4 = ((iM55680 ^ i2) * (-4743)) ^ (-299546481);
                        i5 = -1733427290;
                    } else {
                        iM55680 = (C0946.m55979("ܿ᩺") + i3) * 5;
                        i4 = ((iM55680 ^ i2) * (-20529)) ^ 1452298491;
                        i5 = -464084741;
                    }
                    break;
                case -918425105:
                case 1777351569:
                    C1404.m56468();
                    if (!RunnableC0897.f81856) {
                        iM55680 = C0873.m55680("᩸ܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 15137) ^ (-947351933);
                        i5 = 1426679372;
                    } else {
                        iM55680 = C0946.m55979("ܶ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26457) ^ (-1082501068);
                        i5 = 1367474555;
                    }
                    break;
                case -751996425:
                case 783057417:
                    itM55925 = RunnableC0938.m55925(list);
                    iM55680 = C0873.m55680("۟ۗ") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-28889)) ^ (-2034646342);
                    i5 = 2059100943;
                    break;
                case -426442507:
                case 1332540493:
                    c18249.m41532();
                    iM55680 = C0873.m55680("۟ۗ") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-28889)) ^ (-2034646342);
                    i5 = 2059100943;
                    break;
                case -419937827:
                case 963732291:
                    if (C0866.m55647(itM55925)) {
                        iM55680 = (C0873.m55680("ܺܺ") + i3) * 55;
                        i4 = ((iM55680 ^ i2) * (-24501)) ^ 540833389;
                        i5 = 178954959;
                    } else {
                        iM55680 = C0946.m55979("ۡܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26927) ^ 2073112654;
                        i5 = -1872770221;
                    }
                    break;
                case -394140597:
                case 245183838:
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0873.m55680("᩸ܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 15137) ^ (-947351933);
                        i5 = 1426679372;
                    } else {
                        iM55680 = C0873.m55680("۬ܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8259) ^ 2076612328;
                        i5 = 1628216539;
                    }
                    break;
                case -340551392:
                case 454879186:
                    C0845.m55584();
                    C1017.m56187();
                    iM55680 = (C0946.m55979("ܺۨ") ^ i3) * 41;
                    i4 = ((iM55680 ^ i2) * (-24187)) ^ 1752455808;
                    i5 = 2034591367;
                    break;
                case -311601005:
                case 390927321:
                    if (C1194.f82045 != 0) {
                        iM55680 = C0946.m55979("ܶ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26457) ^ (-1082501068);
                        i5 = 1367474555;
                    } else {
                        iM55680 = C0873.m55680("۬۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1147) ^ 1350801420;
                        i5 = 1123108495;
                    }
                    break;
                case 352919363:
                case 1829418928:
                    list = this.f19867;
                    if (C0955.m56025()) {
                        iM55680 = C0873.m55680("᩸ܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 15137) ^ (-947351933);
                        i5 = 1426679372;
                    } else {
                        iM55680 = C0873.m55680("ۛ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 24559) ^ 771222351;
                        i5 = 1393446419;
                    }
                    break;
                case 381715999:
                case 882360863:
                    if (!C1048.f81963) {
                        iM55680 = (C0946.m55979("ܺۨ") ^ i3) * 41;
                        i4 = ((iM55680 ^ i2) * (-24187)) ^ 1752455808;
                        i5 = 2034591367;
                    } else {
                        iM55680 = C0946.m55979("ܶ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26457) ^ (-1082501068);
                        i5 = 1367474555;
                    }
                    break;
                default:
                    if (C0917.f81868) {
                        iM55680 = C0946.m55979("ܶ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26457) ^ (-1082501068);
                        i5 = 1367474555;
                    } else {
                        iM55680 = (C0946.m55979("ܺ֡") ^ i2) * C0254q.f1218h;
                        i4 = ((iM55680 ^ i3) * (-30057)) ^ (-1059282982);
                        i5 = -608232075;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17491(C7581 c7581) {
        List listM34312 = null;
        int i = 1920163007;
        int i2 = C0877.f81843;
        int i3 = C1124.f82007;
        int iM55680 = C0873.m55680("ۗ᩺") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-16265)) ^ (-815300503);
        int i5 = -461274663;
        while (true) {
            i = ((((i ^ i3) * 29039) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2062902619:
                case -625527054:
                    c7581.f19867 = listM34312;
                    c7581.f19866 = C14976.m34317();
                    break;
                case -1937501992:
                case 16796939:
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("ܶ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6473) ^ (-999621823);
                        i5 = -890820250;
                    } else {
                        iM55680 = C0873.m55680("ۗܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26379) ^ (-491328740);
                        i5 = -802114955;
                    }
                    break;
                case -1885184734:
                case -1636007148:
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("֨ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 30369) ^ (-1822723240);
                        i5 = -1732835367;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩶ᩴ")) * (-111);
                        i4 = ((iM55680 ^ i2) * (-26055)) ^ (-1770110758);
                        i5 = -1649839588;
                    }
                    break;
                case -1633245928:
                case 2137942856:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (i2 - C0946.m55979("֨᩻")) * 63;
                        i4 = ((iM55680 ^ i3) * (-12649)) ^ (-427505871);
                        i5 = -272401798;
                    } else {
                        iM55680 = C0946.m55979("ܶ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6473) ^ (-999621823);
                        i5 = -890820250;
                    }
                    break;
                case -1571726271:
                case 1791915335:
                    RunnableC1014.m56165(c7581);
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0873.m55680("۬ۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 14083) ^ (-380162409);
                        i5 = -1696456989;
                    } else {
                        iM55680 = C0946.m55979("ۡᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 25183) ^ (-834314114);
                        i5 = 802000827;
                    }
                    break;
                case -1483806134:
                case -360269748:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0873.m55680("۬ۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 14083) ^ (-380162409);
                        i5 = -1696456989;
                    } else {
                        iM55680 = C0873.m55680("֨ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 30369) ^ (-1822723240);
                        i5 = -1732835367;
                    }
                    break;
                case -1471264168:
                case 1151912580:
                    C1929.m56553();
                    iM55680 = C0873.m55680("֨ܰ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 30369) ^ (-1822723240);
                    i5 = -1732835367;
                    break;
                case -1164253443:
                case 2010506180:
                    if (!C0927.f81875) {
                        iM55680 = C0946.m55979("ܶ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6473) ^ (-999621823);
                        i5 = -890820250;
                    } else {
                        iM55680 = C0873.m55680("֨ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 30369) ^ (-1822723240);
                        i5 = -1732835367;
                    }
                    break;
                case -1155437387:
                case 1697609851:
                    if (C0882.m55710() != 0) {
                        iM55680 = (i2 - C0946.m55979("֨᩻")) * 63;
                        i4 = ((iM55680 ^ i3) * (-12649)) ^ (-427505871);
                        i5 = -272401798;
                    } else {
                        iM55680 = C0946.m55979("ۤ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15695)) ^ (-209495000);
                        i5 = 1333754751;
                    }
                    break;
                case -1053770466:
                case 1281750624:
                    if (C0927.f81875) {
                        iM55680 = (C0873.m55680("ۧ᩷") + i3) * 93;
                        i4 = ((iM55680 ^ i2) * (-28397)) ^ 1542925362;
                        i5 = -1275544237;
                    } else {
                        iM55680 = (C0946.m55979("ܰ۟") + i2) * (-99);
                        i4 = ((iM55680 ^ i3) * 6371) ^ (-37885820);
                        i5 = 1431868029;
                    }
                    break;
                case -1023786913:
                case 662673734:
                    if (C1028.f81950 <= 0) {
                        iM55680 = (i2 - C0946.m55979("֨᩻")) * 63;
                        i4 = ((iM55680 ^ i3) * (-12649)) ^ (-427505871);
                        i5 = -272401798;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۤ᩻")) * (-73);
                        i4 = ((iM55680 ^ i3) * 2293) ^ (-748246537);
                        i5 = -171276450;
                    }
                    break;
                case -110489508:
                case 1971360006:
                    RunnableC0938.m55938();
                    break;
                case 403976645:
                case 1337545663:
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0873.m55680("۬ۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 14083) ^ (-380162409);
                        i5 = -1696456989;
                    } else {
                        iM55680 = (C0873.m55680("ۛܺ") + i2) * (-67);
                        i4 = ((iM55680 ^ i3) * (-21809)) ^ (-1687233690);
                        i5 = -1072502169;
                    }
                    break;
                case 466787076:
                case 901724124:
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0873.m55680("ۧ᩷") + i3) * 93;
                        i4 = ((iM55680 ^ i2) * (-28397)) ^ 1542925362;
                        i5 = -1275544237;
                    } else {
                        iM55680 = (C0873.m55680("ۛۘ") + i3) * (-79);
                        i4 = ((iM55680 ^ i2) * (-12491)) ^ 6126535;
                        i5 = -2080374581;
                    }
                    break;
                case 1411494490:
                case 1585410900:
                    listM34312 = C14976.m34312();
                    if (C0917.m55854()) {
                        iM55680 = C0946.m55979("ۤۗ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-24531)) ^ 2052502610;
                        i5 = 931187414;
                    } else {
                        iM55680 = (C0873.m55680("ۧ᩷") + i3) * 93;
                        i4 = ((iM55680 ^ i2) * (-28397)) ^ 1542925362;
                        i5 = -1275544237;
                    }
                    break;
                default:
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0946.m55979("ܶ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6473) ^ (-999621823);
                        i5 = -890820250;
                    } else {
                        iM55680 = C0873.m55680("ܽۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 3203) ^ (-1084786758);
                        i5 = -152740753;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17493(C7581 c7581, Runnable runnable) {
        int i = 1537337109;
        int i2 = C1044.f81959;
        int i3 = C0866.f81837;
        int iM55979 = (C0946.m55979("᩺ۗ") + i3) * 115;
        int i4 = ((iM55979 ^ i2) * 18433) ^ (-1259768180);
        int i5 = 1864776940;
        while (true) {
            i = ((((i ^ i2) * (-4029)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1736414739:
                case -41981357:
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0873.m55680("᩸۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-183)) ^ 1529629088;
                        i5 = 478099545;
                    } else {
                        iM55979 = (C0946.m55979("ᩴۧ") ^ i3) * (-97);
                        i4 = ((iM55979 ^ i2) * 32633) ^ 2036285494;
                        i5 = -1071864533;
                    }
                    break;
                case -1515044781:
                case 542715679:
                    C1017.m56187();
                    C0890.m55740();
                    break;
                case -1466435157:
                case 357888308:
                    if (C1124.f82007 < 0) {
                        iM55979 = C0873.m55680("ۢۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14485) ^ 865541862;
                        i5 = -866873332;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۢܰ")) * (-75);
                        i4 = ((iM55979 ^ i3) * 9525) ^ (-1097870967);
                        i5 = 768298061;
                    }
                    break;
                case -1346256807:
                case 938024854:
                    if (C0955.f81898) {
                        iM55979 = (i2 - C0946.m55979("ۢܰ")) * (-75);
                        i4 = ((iM55979 ^ i3) * 9525) ^ (-1097870967);
                        i5 = 768298061;
                    } else {
                        iM55979 = C0946.m55979("ۨᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 969) ^ (-1234630206);
                        i5 = 581965113;
                    }
                    break;
                case -1297638502:
                case 1939028208:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("ۢۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14485) ^ 865541862;
                        i5 = -866873332;
                    } else {
                        iM55979 = C0946.m55979("֫ۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28849)) ^ 65219572;
                        i5 = 1893867732;
                    }
                    break;
                case -1263920069:
                case -1090870651:
                    if (C0873.m55678()) {
                        iM55979 = C0873.m55680("ۢۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14485) ^ 865541862;
                        i5 = -866873332;
                    } else {
                        iM55979 = (C0946.m55979("ۙᩳ") ^ i3) * (-19);
                        i4 = ((iM55979 ^ i2) * 17643) ^ 1485668505;
                        i5 = 279540772;
                    }
                    break;
                case -1233937961:
                case 1420685478:
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = C0873.m55680("ۢۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14485) ^ 865541862;
                        i5 = -866873332;
                    } else {
                        iM55979 = C0873.m55680("ۗۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2179) ^ 1184193401;
                        i5 = 989614248;
                    }
                    break;
                case -1017162435:
                case -288700159:
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0873.m55680("۬ᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-533)) ^ (-464599923);
                        i5 = -2071139544;
                    } else {
                        iM55979 = C0873.m55680("ۢۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14485) ^ 865541862;
                        i5 = -866873332;
                    }
                    break;
                case -897891188:
                case 2089706030:
                    C0927.m55868(runnable);
                    if (C1028.m56247() >= 0) {
                        iM55979 = C0873.m55680("᩸۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-183)) ^ 1529629088;
                        i5 = 478099545;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ᩴۖ")) * 45;
                        i4 = ((iM55979 ^ i2) * 5875) ^ (-739674711);
                        i5 = 1780277002;
                    }
                    break;
                case -559839986:
                case 2084214216:
                    if (C0906.m55809() <= 0) {
                        iM55979 = C0873.m55680("۬ᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-533)) ^ (-464599923);
                        i5 = -2071139544;
                    } else {
                        iM55979 = C0946.m55979("ۛۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-16937)) ^ 1404230776;
                        i5 = -187324261;
                    }
                    break;
                case -47440968:
                case 1366644236:
                    if (C1048.f81963) {
                        iM55979 = C0873.m55680("֫֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5503)) ^ (-890684027);
                        i5 = 282840405;
                    } else {
                        iM55979 = C0946.m55979("᩶ܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 1151) ^ (-369727803);
                        i5 = 2008519893;
                    }
                    break;
                case -40651855:
                case 1545037731:
                    if (C0882.f81846) {
                        iM55979 = (i2 - C0946.m55979("ۢܰ")) * (-75);
                        i4 = ((iM55979 ^ i3) * 9525) ^ (-1097870967);
                        i5 = 768298061;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۜܰ")) * (-79);
                        i4 = ((iM55979 ^ i3) * (-22767)) ^ 1244139761;
                        i5 = 847827402;
                    }
                    break;
                case 154310084:
                case 215419896:
                    C1404.m56468();
                    if (C1025.f81947 < 0) {
                        iM55979 = C0946.m55979("᩶ܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 1151) ^ (-369727803);
                        i5 = 2008519893;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۢܰ")) * (-75);
                        i4 = ((iM55979 ^ i3) * 9525) ^ (-1097870967);
                        i5 = 768298061;
                    }
                    break;
                case 326572618:
                case 1809655386:
                    C1017.m56187();
                    RunnableC0938.m55938();
                    iM55979 = (i2 - C0946.m55979("ۢܰ")) * (-75);
                    i4 = ((iM55979 ^ i3) * 9525) ^ (-1097870967);
                    i5 = 768298061;
                    break;
                case 1387797447:
                case 2121694849:
                    ViewOnClickListenerC0939.m55946(c7581.f19863);
                    break;
                default:
                    if (C1036.m56257() <= 0) {
                        iM55979 = C0873.m55680("᩸۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-183)) ^ 1529629088;
                        i5 = 478099545;
                    } else {
                        iM55979 = C0873.m55680("ۨ۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * 3973) ^ 1617293226;
                        i5 = -587842438;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x016a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0196  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c4 A[PHI: r7
      0x01c4: PHI (r7v8 l.ܿܽ᩷) = (r7v4 l.ܿܽ᩷), (r7v4 l.ܿܽ᩷), (r7v5 l.ܿܽ᩷), (r7v4 l.ܿܽ᩷) binds: [B:63:0x01c2, B:38:0x00d3, B:34:0x00b5, B:7:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m17495(C7581 c7581, RunnableC20993 runnableC20993) {
        int iM55680;
        int i;
        C4694 c4694 = null;
        int i2 = 1092939827;
        int i3 = ServiceConnectionC1013.f81940;
        int i4 = C1044.f81959;
        int iM55979 = C0946.m55979("ۛܰ") ^ i3;
        int i5 = ((iM55979 ^ i4) * 8005) ^ 1383039655;
        int i6 = -669910654;
        while (true) {
            int i7 = iM55979 ^ i6;
            RunnableC18980 runnableC18980 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 16573) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2140524723:
                    case 962100425:
                        if (C1229.f82066 >= 0) {
                            iM55680 = C0873.m55680("ܶۢ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-22495)) ^ (-1588553691);
                            i = -2000890543;
                        } else {
                            iM55680 = (C0946.m55979("ܿۢ") ^ i3) * 53;
                            i5 = ((iM55680 ^ i4) * (-20325)) ^ 472972370;
                            i = 826557682;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -2076128700:
                    case 637978930:
                        C0912.m55833();
                        break;
                    case -2007298430:
                    case 1046653117:
                        if (C0947.f81895) {
                            iM55680 = C0873.m55680("ܶۢ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-22495)) ^ (-1588553691);
                            i = -2000890543;
                        } else {
                            iM55680 = C0946.m55979("֫ܶ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 9225) ^ (-1512698031);
                            i = -949521729;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1912445443:
                    case -1344134995:
                        if (C1048.m56305() < 0) {
                            iM55680 = C0873.m55680("֨ۤ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-32589)) ^ (-1720336886);
                            i = -1369608490;
                        } else {
                            iM55680 = (C0946.m55979("᩸ۘ") ^ i3) * (-105);
                            i5 = ((iM55680 ^ i4) * (-9021)) ^ (-169921271);
                            i = 487408913;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1893609561:
                    case -1503006337:
                        if (C1036.m56257() > 0) {
                            runnableC18980 = new RunnableC18980(c7581, runnableC20993);
                            if (C0854.f81826 != 0) {
                                iM55680 = (i4 - C0946.m55979("ۗ᩸")) * 115;
                                i5 = ((iM55680 ^ i3) * (-577)) ^ 1025868299;
                                i = -830503448;
                            } else {
                                iM55680 = (C0873.m55680("ۢ᩵") + i3) * (-47);
                                i5 = ((iM55680 ^ i4) * 13511) ^ (-751061310);
                                i = -1789279598;
                            }
                            i7 = iM55680 ^ i;
                        }
                        break;
                    case -1851840677:
                    case 1449988046:
                        if (C1071.f81975 > 0) {
                            iM55680 = C0873.m55680("ܿۛ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 22315) ^ 767594192;
                            i = -635001814;
                            i7 = iM55680 ^ i;
                        }
                        break;
                    case -1734815695:
                    case 887543623:
                        if (C0992.m56107() <= 0) {
                            iM55680 = (i4 - C0946.m55979("ۗ᩸")) * 115;
                            i5 = ((iM55680 ^ i3) * (-577)) ^ 1025868299;
                            i = -830503448;
                        } else {
                            iM55680 = (i3 - C0873.m55680("ۖ᩸")) * (-123);
                            i5 = ((iM55680 ^ i4) * (-3797)) ^ (-1007811014);
                            i = -1813282935;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1418894721:
                    case -1230707761:
                        if (C1017.f81942 >= 0) {
                            iM55680 = C0873.m55680("֨ۤ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-32589)) ^ (-1720336886);
                            i = -1369608490;
                        } else {
                            iM55680 = (C0946.m55979("ۧ۬") ^ i4) * (-17);
                            i5 = ((iM55680 ^ i3) * (-14623)) ^ 2113487783;
                            i = -926997958;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -991062011:
                    case -125972917:
                        runnableC18980.run();
                        break;
                    case -827718962:
                    case -351000031:
                        c4694 = c7581.f19864;
                        c4694.stopScroll();
                        if (c4694.isComputingLayout()) {
                            iM55680 = (C0873.m55680("֫ܰ") ^ i3) * 73;
                            i5 = ((iM55680 ^ i4) * (-25509)) ^ (-1551543280);
                            i = 1094356149;
                        } else {
                            iM55680 = (i4 - C0873.m55680("ܰ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM55680 ^ i3) * (-20839)) ^ (-30027985);
                            i = 344579378;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -761643423:
                    case -688875888:
                        if (C0866.m55645()) {
                        }
                        iM55680 = C0873.m55680("ܶۢ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-22495)) ^ (-1588553691);
                        i = -2000890543;
                        i7 = iM55680 ^ i;
                        break;
                    case -742864440:
                    case -703774849:
                        c4694.post(runnableC18980);
                        break;
                    case -29264543:
                    case 129552760:
                        if (C1025.f81947 >= 0) {
                            iM55680 = C0873.m55680("֨ۤ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-32589)) ^ (-1720336886);
                            i = -1369608490;
                        } else {
                            iM55680 = C0873.m55680("۫ᩴ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-10537)) ^ (-1765773310);
                            i = -566825217;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 276473728:
                    case 709431499:
                        if (C0854.f81826 != 0) {
                            iM55680 = C0873.m55680("֨ۤ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-32589)) ^ (-1720336886);
                            i = -1369608490;
                        } else {
                            iM55680 = C0873.m55680("ܶۢ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-22495)) ^ (-1588553691);
                            i = -2000890543;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 472098092:
                    case 1682687565:
                        RunnableC1014.m56177();
                        C1012.m56134();
                        iM55680 = C0873.m55680("֨ۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-32589)) ^ (-1720336886);
                        i = -1369608490;
                        i7 = iM55680 ^ i;
                        break;
                    case 562851010:
                    case 1383944846:
                        if (C0866.m55645()) {
                            iM55680 = (i3 - C0873.m55680("֡ۛ")) * 119;
                            i5 = ((iM55680 ^ i4) * (-11875)) ^ (-345938622);
                            i = -2138621115;
                        } else {
                            iM55680 = (i4 - C0946.m55979("ۗ᩸")) * 115;
                            i5 = ((iM55680 ^ i3) * (-577)) ^ 1025868299;
                            i = -830503448;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    default:
                        if (C1044.m56286() <= 0) {
                            iM55680 = (i4 - C0946.m55979("ۗ᩸")) * 115;
                            i5 = ((iM55680 ^ i3) * (-577)) ^ 1025868299;
                            i = -830503448;
                        } else {
                            iM55680 = (C0946.m55979("ۛۜ") ^ i3) * (-71);
                            i5 = ((iM55680 ^ i4) * (-23587)) ^ 456326196;
                            i = 1087039537;
                        }
                        i7 = iM55680 ^ i;
                        break;
                }
                return;
            }
            iM55979 = (i4 - C0946.m55979("ۘ۠")) * 79;
            i5 = ((iM55979 ^ i3) * (-15265)) ^ (-742117493);
            i6 = 966785787;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x0150 A[PHI: r9
      0x0150: PHI (r9v5 l.ܿܽ᩷) = (r9v4 l.ܿܽ᩷), (r9v6 l.ܿܽ᩷) binds: [B:53:0x014e, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0195 A[PHI: r1
      0x0195: PHI (r1v4 java.lang.Runnable) = (r1v3 java.lang.Runnable), (r1v2 java.lang.Runnable), (r1v2 java.lang.Runnable) binds: [B:36:0x00bd, B:10:0x0033, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ee A[PHI: r0
      0x01ee: PHI (r0v4 int) = (r0v3 int), (r0v2 int), (r0v2 int), (r0v2 int) binds: [B:67:0x01ec, B:57:0x017c, B:16:0x003f, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public final void m17504() {
        int iM55680;
        int i;
        int i2 = 0;
        Runnable runnable = null;
        C4694 c4694 = null;
        int i3 = 1449348929;
        int i4 = C0898.f81858;
        int i5 = C1229.f82066;
        int iM55681 = C0873.m55680("ܳۙ") ^ i4;
        int i6 = ((iM55681 ^ i5) * 11705) ^ (-1815339953);
        int i7 = -1272755854;
        while (true) {
            int i8 = iM55681 ^ i7;
            RunnableC18980 runnableC18980 = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 22607) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1935221552:
                    case 565705893:
                        break;
                    case -1918322181:
                    case -651823033:
                        C0992.m56107();
                        C1071.m56343();
                        iM55680 = C0946.m55979("۠ܽ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 7787) ^ 1125389868;
                        i = 965897729;
                        i8 = iM55680 ^ i;
                        break;
                    case -1861371801:
                    case 233188205:
                        if (C1017.f81942 >= 0) {
                            iM55680 = C0946.m55979("۠ܽ") ^ i4;
                            i6 = ((iM55680 ^ i5) * 7787) ^ 1125389868;
                            i = 965897729;
                        } else {
                            iM55680 = C0946.m55979("ۢۡ") ^ i4;
                            i6 = ((iM55680 ^ i5) * 31777) ^ (-1135372582);
                            i = 1079153931;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1599526509:
                    case 572105470:
                        if (C1404.m56468()) {
                            iM55680 = (C0946.m55979("ᩳ۠") + i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i6 = ((iM55680 ^ i4) * 30845) ^ 747946694;
                            i = -1923501805;
                        } else {
                            iM55680 = C0873.m55680("ۜۙ") ^ i5;
                            i6 = ((iM55680 ^ i4) * 5429) ^ 133810989;
                            i = 513204918;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1511328167:
                    case 52985576:
                        if (C0894.f81854 >= 0) {
                            iM55680 = C0946.m55979("۠ܽ") ^ i4;
                            i6 = ((iM55680 ^ i5) * 7787) ^ 1125389868;
                            i = 965897729;
                        } else {
                            iM55680 = (C0946.m55979("ۗۗ") ^ i5) * (-67);
                            i6 = ((iM55680 ^ i4) * 12171) ^ (-1664768611);
                            i = -1224585460;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1352205172:
                    case 1135939259:
                        if (C1028.f81950 > 0) {
                            iM55680 = (C0946.m55979("ۗۗ") ^ i5) * (-67);
                            i6 = ((iM55680 ^ i4) * 12171) ^ (-1664768611);
                            i = -1224585460;
                        } else {
                            iM55680 = (C0946.m55979("ܰ᩶") ^ i4) * 45;
                            i6 = ((iM55680 ^ i5) * (-20261)) ^ (-1215588086);
                            i = -2133970585;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1294181018:
                    case 1805911773:
                        c4694 = this.f19864;
                        c4694.stopScroll();
                        if (c4694.isComputingLayout()) {
                            iM55680 = (i5 - C0946.m55979("ۚ᩸")) * 127;
                            i6 = ((iM55680 ^ i4) * (-13977)) ^ (-694663335);
                            i = 2060929861;
                        } else {
                            iM55680 = C0873.m55680("ۗۤ") ^ i4;
                            i6 = ((iM55680 ^ i5) * 13497) ^ (-28646248);
                            i = 218066054;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1129862980:
                    case 1077004530:
                        i2 = this.f19866;
                        if (C0989.f81920 >= 0) {
                            iM55680 = (C0946.m55979("ۗۗ") ^ i5) * (-67);
                            i6 = ((iM55680 ^ i4) * 12171) ^ (-1664768611);
                            i = -1224585460;
                        } else {
                            iM55680 = C0873.m55680("۬᩸") ^ i5;
                            i6 = ((iM55680 ^ i4) * 28149) ^ 1729381123;
                            i = -818635222;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -958949648:
                    case -5337199:
                        if (C0877.f81843 >= 0) {
                        }
                        iM55680 = C0946.m55979("۠ܽ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 7787) ^ 1125389868;
                        i = 965897729;
                        i8 = iM55680 ^ i;
                        break;
                    case -873412793:
                    case -642365632:
                        if (i2 != C14976.m34317()) {
                            iM55680 = C0946.m55979("ܶۨ") ^ i4;
                            i6 = ((iM55680 ^ i5) * 23399) ^ 1854613824;
                            i = 1640465484;
                        } else {
                            iM55680 = C0946.m55979("ۢۧ") ^ i5;
                            i6 = ((iM55680 ^ i4) * 18665) ^ (-565578321);
                            i = -1874336345;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -766448490:
                    case 1222004476:
                        if (C0912.f81867 > 0) {
                            iM55680 = C0946.m55979("ۙ᩹") ^ i4;
                            i6 = ((iM55680 ^ i5) * 30539) ^ 1206334498;
                            i = -1015796145;
                            i8 = iM55680 ^ i;
                        }
                        break;
                    case -517432195:
                    case 1766024694:
                        runnable = new Runnable() { // from class: l.ᩳܽ᩷
                            @Override // java.lang.Runnable
                            public final void run() {
                                C7581.m17491(this.f59775);
                            }
                        };
                        if (C0873.f81841 <= 0) {
                            iM55680 = (C0946.m55979("ܰ᩶") ^ i4) * 45;
                            i6 = ((iM55680 ^ i5) * (-20261)) ^ (-1215588086);
                            i = -2133970585;
                        } else {
                            iM55680 = C0946.m55979("ܶܶ") ^ i5;
                            i6 = ((iM55680 ^ i4) * 6427) ^ (-1016632642);
                            i = -1484770986;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -269157827:
                    case 2126817889:
                        if (RunnableC0871.f81839 < 0) {
                            iM55680 = C0873.m55680("ۚۘ") ^ i4;
                            i6 = ((iM55680 ^ i5) * 8029) ^ 741249887;
                            i = 292676344;
                            i8 = iM55680 ^ i;
                        }
                        break;
                    case 75215267:
                    case 1676202985:
                        runnableC18980.run();
                        iM55680 = C0946.m55979("ۢۧ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 18665) ^ (-565578321);
                        i = -1874336345;
                        i8 = iM55680 ^ i;
                        break;
                    case 376443601:
                    case 870118202:
                        if (!C0937.f81884) {
                        }
                        runnableC18980 = new RunnableC18980(this, runnable);
                        if (C1071.f81975 <= 0) {
                            iM55680 = C0873.m55680("ۜۙ") ^ i5;
                            i6 = ((iM55680 ^ i4) * 5429) ^ 133810989;
                            i = 513204918;
                        } else {
                            iM55680 = C0873.m55680("۟֡") ^ i5;
                            i6 = ((iM55680 ^ i4) * (-19449)) ^ 1132926592;
                            i = 53232259;
                        }
                        i8 = iM55680 ^ i;
                        break;
                        break;
                    case 798454641:
                    case 1902024965:
                        if (C1124.f82007 >= 0) {
                            iM55680 = (C0946.m55979("ۗۗ") ^ i5) * (-67);
                            i6 = ((iM55680 ^ i4) * 12171) ^ (-1664768611);
                            i = -1224585460;
                        } else {
                            iM55680 = (C0873.m55680("ܿ᩸") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i6 = ((iM55680 ^ i4) * 32599) ^ 1413449223;
                            i = 949278864;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case 823571860:
                    case 1831329406:
                        C1964.m56597();
                        AbstractC0942.m55971();
                        break;
                    case 945450418:
                    case 1059853650:
                        c4694.post(runnableC18980);
                        break;
                    default:
                        if (C0930.m55885() <= 0) {
                            iM55680 = (C0946.m55979("ܰ᩶") ^ i4) * 45;
                            i6 = ((iM55680 ^ i5) * (-20261)) ^ (-1215588086);
                            i = -2133970585;
                        } else {
                            iM55680 = C0873.m55680("ۛۨ") ^ i4;
                            i6 = ((iM55680 ^ i5) * 18509) ^ 838513294;
                            i = 2044347808;
                        }
                        i8 = iM55680 ^ i;
                        break;
                }
                return;
            }
            iM55681 = C0873.m55680("ۤۘ") ^ i4;
            i6 = ((iM55681 ^ i5) * (-3219)) ^ (-1239615122);
            i7 = 195863892;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17503(RunnableC14306 runnableC14306) {
        this.f19868 = runnableC14306;
    }
}
