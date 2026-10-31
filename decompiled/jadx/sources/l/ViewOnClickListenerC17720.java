package l;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳ֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5KF */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC17720 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩴۛۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f54207 = {6113, -9458, -9460, -9445, -9466, -9447, -9466, -9445, -9450, -9469, -9472, -9464, -9466, -9471, -9429, -9466, -9458, -9469, -9472, -9464, -27171, -23149, -29204, -21711, 18246, 17728, -9463, -9466, -9471, -9461, -9415, -9466, -9462, -9448, -9427, -9450, -9434, -9461, -9401, -9407, -9407, -9407, -9402, -17106, 19272, 19740, 23395, -16833, 21111, -31309, 22244, -17300, 2287, 19224, 17813, -17478, 9700, 32222, 32201, 32223, 32217, 32192, 32216, 9688, -5857, -6585, 6805, 3361, -17, -4124, 2940, 7951, 2300, 7275, -4287, 12876, -4272, 6442, 1517, 2975, 31850, 27228, -25213, -29494, -31346, -28153, 2997, 2957, 3010, 21092, 25700, 29406, 22334, -27417, 32300, 27749, -29116, 29815, -30021, -31190, -26461, 27227, -25796, 31775, -27378, 25607, 28385, -29402, 20891, -26783, 21216, 21288, 23776};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f54208;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f54209;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f54210;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f54211;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f54212;

    /* JADX WARN: Code duplicated, block: B:43:0x01eb A[PHI: r11
      0x01eb: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:104:0x01eb, B:42:0x01e9, B:106:0x01eb, B:15:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC17720(AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206) {
        short[] sArr;
        int i;
        short[] sArr2;
        View view;
        View view2;
        int iM6981;
        int i2;
        short[] sArr3;
        int i3;
        View view3;
        int i4;
        int i5;
        int i6;
        int iM2566;
        int iM2567;
        int i7;
        this = this;
        final DialogInterfaceC0206 dialogInterfaceC0207 = dialogInterfaceC0206;
        int i8 = C4616.f14690;
        int i9 = C2520.f8000;
        short s = f54207[0];
        int i10 = ((s * s) + 261889489) - (s * 32366) < 0 ? 58810 : 56175;
        RunnableC0588.m2430(abstractActivityC3346, C0630.m2575(f54207, 1, 8, i10));
        RunnableC0588.m2430(dialogInterfaceC0207, C2272.m7507(f54207, 9, 11, i10));
        int iM6982 = (i9 - C2105.m6981("۬ܰ")) * 55;
        View view4 = null;
        DialogInterface.OnCancelListener onCancelListener = null;
        EditText editTextM5905 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int iM6983 = 0;
        int i11 = 0;
        View viewM28028 = null;
        int i12 = 0;
        int i13 = -243019660;
        TextInputLayout textInputLayout = null;
        int i14 = ((iM6982 ^ i8) * (-8831)) ^ (-353618971);
        View viewM28029 = null;
        C19258 c19258 = null;
        String strM9934 = null;
        short[] sArr6 = null;
        int iM2568 = 0;
        int iM2569 = 0;
        int iM25610 = 0;
        int i15 = iM6982 ^ (-1042656465);
        TextInputLayout textInputLayout2 = null;
        View viewM10739 = null;
        TextInputLayout textInputLayout3 = null;
        String strM49334 = null;
        while (true) {
            i13 = i15 ^ (i14 & (((i13 ^ i8) * (-19873)) >> 31));
            switch (i13) {
                case -2132754553:
                case -1620277062:
                    View viewM280210 = C11340.m28028(viewM10739, C0630.m2566(strM9934) ^ 2124144895);
                    C2126.m7031(viewM280210, strM49334);
                    int iM6984 = C2105.m6981("۫ۙ") ^ i9;
                    view4 = viewM280210;
                    i15 = iM6984 ^ 544869;
                    i14 = ((iM6984 ^ i8) * 27925) ^ (-631740193);
                    break;
                case -2110452588:
                case 682019948:
                    View view5 = viewM28028;
                    sArr = sArr6;
                    i = i12;
                    view2 = viewM10739;
                    view = view5;
                    sArr2 = sArr4;
                    iM2569 = C0630.m2566(ServiceConnectionC3453.m10568(sArr2, 23, 3, i10));
                    i11 = 2125684180;
                    if (C1773.f6144 <= 0) {
                        iM2566 = (i9 - C0630.m2566("ܺܺ")) * (-15);
                        i6 = ((iM2566 ^ i8) * (-18101)) ^ (-1839010492);
                        i5 = -511436778;
                    } else {
                        iM2566 = C0630.m2566("ܽܺ") ^ i8;
                        i6 = ((iM2566 ^ i9) * 17795) ^ (-1819537627);
                        i5 = -1583706439;
                    }
                    int i16 = iM2566 ^ i5;
                    sArr4 = sArr2;
                    i12 = i;
                    i15 = i16;
                    dialogInterfaceC0207 = dialogInterfaceC0206;
                    short[] sArr7 = sArr;
                    i14 = i6;
                    viewM10739 = view2;
                    viewM28028 = view;
                    sArr6 = sArr7;
                    break;
                case -2081408636:
                case 160128255:
                    C1420.m4913();
                    iM2567 = (C2105.m6981("ۖۘ") + i9) * (-103);
                    i14 = (-413262997) ^ ((iM2567 ^ i8) * 18613);
                    i7 = 745404989;
                    i15 = i7 ^ iM2567;
                    dialogInterfaceC0207 = dialogInterfaceC0206;
                    break;
                case -2027833372:
                case 669154394:
                    viewM28028 = C11340.m28028(viewM10739, iM2569 ^ i11);
                    sArr6 = f54207;
                    i12 = 26;
                    if (C1711.f5919) {
                        iM2567 = (C2105.m6981("ۖۘ") + i9) * (-103);
                        i14 = (-413262997) ^ ((iM2567 ^ i8) * 18613);
                        i7 = 745404989;
                    } else {
                        iM2567 = C0630.m2566("᩺ۢ") ^ i9;
                        i14 = 67518597 ^ ((iM2567 ^ i8) * 15177);
                        i7 = -2088350560;
                    }
                    i15 = i7 ^ iM2567;
                    dialogInterfaceC0207 = dialogInterfaceC0206;
                    break;
                case -1951796776:
                case -1107430282:
                    viewM28029 = C11340.m28028(viewM10739, iM25610 ^ 2122293776);
                    if (!C2126.f7087) {
                        iM6981 = C0630.m2566("ܶۚ") ^ i9;
                        i14 = ((iM6981 ^ i8) * 16989) ^ 1484372040;
                        i2 = -810798917;
                        i15 = iM6981 ^ i2;
                    } else {
                        sArr3 = sArr6;
                        i3 = i12;
                        view3 = viewM28028;
                        int iM6985 = (C2105.m6981("۬ۧ") + i8) * (-55);
                        i4 = ((iM6985 ^ i9) * 23873) ^ (-1595422695);
                        i15 = 1935060715 ^ iM6985;
                        i12 = i3;
                        viewM28028 = view3;
                        sArr6 = sArr3;
                        i14 = i4;
                        dialogInterfaceC0207 = dialogInterfaceC0206;
                    }
                    break;
                case -1951644289:
                case -325867710:
                    textInputLayout3 = (TextInputLayout) view4;
                    this.f54209 = textInputLayout3;
                    sArr5 = f54207;
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        iM6981 = C0630.m2566("֫ۙ") ^ i8;
                        i14 = ((iM6981 ^ i9) * (-10663)) ^ 679710716;
                        i2 = 693273747;
                        i15 = iM6981 ^ i2;
                    } else {
                        sArr3 = sArr6;
                        i3 = i12;
                        view3 = viewM28028;
                        int iM6986 = (C2105.m6981("۬ۧ") + i8) * (-55);
                        i4 = ((iM6986 ^ i9) * 23873) ^ (-1595422695);
                        i15 = 1935060715 ^ iM6986;
                        i12 = i3;
                        viewM28028 = view3;
                        sArr6 = sArr3;
                        i14 = i4;
                        dialogInterfaceC0207 = dialogInterfaceC0206;
                    }
                    break;
                case -1849028109:
                case 1215928823:
                    View viewM3507 = C1005.m3507(viewM10739, iM2568);
                    C2126.m7031(viewM3507, strM49334);
                    textInputLayout2 = (TextInputLayout) viewM3507;
                    this.f54210 = textInputLayout2;
                    if (!C0798.f2919) {
                        iM6981 = (C0630.m2566("ܿ֫") + i9) * 79;
                        i14 = ((iM6981 ^ i8) * (-20203)) ^ 1972195799;
                        i2 = -1271654691;
                        i15 = iM6981 ^ i2;
                    } else {
                        sArr3 = sArr6;
                        i3 = i12;
                        view3 = viewM28028;
                        int iM6987 = (C2105.m6981("۬ۧ") + i8) * (-55);
                        i4 = ((iM6987 ^ i9) * 23873) ^ (-1595422695);
                        i15 = 1935060715 ^ iM6987;
                        i12 = i3;
                        viewM28028 = view3;
                        sArr6 = sArr3;
                        i14 = i4;
                        dialogInterfaceC0207 = dialogInterfaceC0206;
                    }
                    break;
                case -1513009574:
                case 820107202:
                    if (C1005.f3721) {
                        iM6981 = (C2105.m6981("ۙܰ") ^ i9) * (-41);
                        i14 = ((iM6981 ^ i8) * 25951) ^ (-1245781952);
                        i2 = 558421729;
                    } else {
                        iM6981 = C0630.m2566("֡ܿ") ^ i8;
                        i14 = ((iM6981 ^ i9) * (-5447)) ^ (-2026204700);
                        i2 = -1022344631;
                    }
                    i15 = iM6981 ^ i2;
                    break;
                case -1407912515:
                case -483521974:
                    iM25610 = C0630.m2566(C4159.m12578(f54207, 49, 3, i10));
                    iM6981 = C2105.m6981("ᩴۚ") ^ i8;
                    i14 = ((iM6981 ^ i9) * (-27127)) ^ 1573018028;
                    i2 = -1391389186;
                    i15 = iM6981 ^ i2;
                    break;
                case -1041418273:
                case 74728970:
                    sArr3 = sArr6;
                    i3 = i12;
                    short[] sArr8 = sArr4;
                    view3 = viewM28028;
                    View view6 = viewM10739;
                    this.f54211 = abstractActivityC3346;
                    iM6983 = C2105.m6981(C2520.m8030(f54207, 20, 3, i10));
                    if (C7811.f24123 >= 0) {
                        sArr4 = sArr8;
                        viewM10739 = view6;
                        int iM6988 = (C2105.m6981("۬ۧ") + i8) * (-55);
                        i4 = ((iM6988 ^ i9) * 23873) ^ (-1595422695);
                        i15 = 1935060715 ^ iM6988;
                        i12 = i3;
                        viewM28028 = view3;
                        sArr6 = sArr3;
                    } else {
                        int iM25611 = C0630.m2566("۠᩸") ^ i8;
                        i4 = ((iM25611 ^ i9) * (-12179)) ^ 1236264139;
                        sArr4 = sArr8;
                        i12 = i3;
                        viewM10739 = view6;
                        viewM28028 = view3;
                        i15 = iM25611 ^ 863733310;
                        sArr6 = sArr3;
                    }
                    i14 = i4;
                    dialogInterfaceC0207 = dialogInterfaceC0206;
                    break;
                case -799235652:
                case 858139413:
                    strM9934 = C3245.m9934(f54207, 43, 3, i10);
                    if (C3911.f12484 < 0) {
                        iM6981 = (C2105.m6981("ۖܶ") ^ i8) * (-41);
                        i14 = ((iM6981 ^ i9) * (-22799)) ^ 4770569;
                        i2 = 1290580135;
                        i15 = iM6981 ^ i2;
                    } else {
                        iM2567 = (C2105.m6981("ۖۘ") + i9) * (-103);
                        i14 = (-413262997) ^ ((iM2567 ^ i8) * 18613);
                        i7 = 745404989;
                        i15 = i7 ^ iM2567;
                        dialogInterfaceC0207 = dialogInterfaceC0206;
                    }
                    break;
                case -682474043:
                case 136429404:
                    short[] sArr9 = sArr6;
                    int i17 = i12;
                    strM49334 = C21923.m49334(sArr9, i17, 17, i10);
                    View view7 = viewM28028;
                    C2126.m7031(view7, strM49334);
                    TextInputLayout textInputLayout4 = (TextInputLayout) view7;
                    this.f54208 = textInputLayout4;
                    int iM25612 = (C0630.m2566("ۧۘ") + i9) * (-87);
                    int i18 = ((iM25612 ^ i8) * (-8243)) ^ 844785952;
                    int i19 = iM25612 ^ (-1181561992);
                    i12 = i17;
                    textInputLayout = textInputLayout4;
                    sArr6 = sArr9;
                    i14 = i18;
                    dialogInterfaceC0207 = dialogInterfaceC0206;
                    viewM28028 = view7;
                    i15 = i19;
                    break;
                case -657455573:
                case 266988765:
                    iM2568 = C0630.m2566(C3537.m10748(sArr5, 46, 3, i10)) ^ 2129100544;
                    if (C0050.f910 >= 0) {
                        iM6981 = (C2105.m6981("ۙܰ") ^ i9) * (-41);
                        i14 = ((iM6981 ^ i8) * 25951) ^ (-1245781952);
                        i2 = 558421729;
                    } else {
                        iM6981 = (i8 - C2105.m6981("۫֫")) * 47;
                        i14 = ((iM6981 ^ i9) * 21773) ^ 779474336;
                        i2 = 1412227735;
                    }
                    i15 = iM6981 ^ i2;
                    break;
                case -647053842:
                case -63530981:
                    C2520.m8026();
                    C1047.m3599();
                    throw new RuntimeException();
                case -567991880:
                case 1874098790:
                    C3683.m11222();
                    if (C1294.f4556 < 0) {
                        sArr = sArr6;
                        i = i12;
                        sArr2 = sArr4;
                        view = viewM28028;
                        view2 = viewM10739;
                        iM2566 = (i9 - C0630.m2566("ܺܺ")) * (-15);
                        i6 = ((iM2566 ^ i8) * (-18101)) ^ (-1839010492);
                        i5 = -511436778;
                        int i110 = iM2566 ^ i5;
                        sArr4 = sArr2;
                        i12 = i;
                        i15 = i110;
                        dialogInterfaceC0207 = dialogInterfaceC0206;
                        short[] sArr10 = sArr;
                        i14 = i6;
                        viewM10739 = view2;
                        viewM28028 = view;
                        sArr6 = sArr10;
                    } else {
                        iM6981 = (C2105.m6981("ۙܰ") ^ i9) * (-41);
                        i14 = ((iM6981 ^ i8) * 25951) ^ (-1245781952);
                        i2 = 558421729;
                        i15 = iM6981 ^ i2;
                    }
                    break;
                case -441767625:
                case 21427593:
                    if (RunnableC3474.f10992 > 0) {
                        iM6981 = (C2105.m6981("ۙܰ") ^ i9) * (-41);
                        i14 = ((iM6981 ^ i8) * 25951) ^ (-1245781952);
                        i2 = 558421729;
                        i15 = iM6981 ^ i2;
                    } else {
                        iM2567 = (C2105.m6981("ۖۘ") + i9) * (-103);
                        i14 = (-413262997) ^ ((iM2567 ^ i8) * 18613);
                        i7 = 745404989;
                        i15 = i7 ^ iM2567;
                        dialogInterfaceC0207 = dialogInterfaceC0206;
                    }
                    break;
                case -389690496:
                case 1561303001:
                    C0483.m2135(c19258, false);
                    onCancelListener = new DialogInterface.OnCancelListener() { // from class: l.֫֨ۡ
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            dialogInterfaceC0207.m1449();
                        }
                    };
                    if (C1128.f4106 > 0) {
                        iM6981 = (i8 - C2105.m6981("֡ۖ")) * (-55);
                        i14 = ((iM6981 ^ i9) * (-24789)) ^ (-952807688);
                        i2 = 515565512;
                        i15 = iM6981 ^ i2;
                    } else {
                        iM2567 = (C2105.m6981("ۖۘ") + i9) * (-103);
                        i14 = (-413262997) ^ ((iM2567 ^ i8) * 18613);
                        i7 = 745404989;
                        i15 = i7 ^ iM2567;
                        dialogInterfaceC0207 = dialogInterfaceC0206;
                    }
                    break;
                case -343565903:
                case 364951398:
                    sArr3 = sArr6;
                    i3 = i12;
                    view3 = viewM28028;
                    viewM10739 = C3537.m10739(abstractActivityC3346, iM6983 ^ 2117738536);
                    sArr4 = f54207;
                    if (C21923.m49329()) {
                        int iM6989 = (C2105.m6981("۬ۧ") + i8) * (-55);
                        i4 = ((iM6989 ^ i9) * 23873) ^ (-1595422695);
                        i15 = 1935060715 ^ iM6989;
                        i12 = i3;
                        viewM28028 = view3;
                        sArr6 = sArr3;
                        i14 = i4;
                    } else {
                        int iM25613 = (C0630.m2566("᩻۫") + i9) * (-75);
                        i12 = i3;
                        viewM28028 = view3;
                        sArr6 = sArr3;
                        i14 = ((iM25613 ^ i8) * (-11823)) ^ (-1152021236);
                        i15 = iM25613 ^ 1029702936;
                    }
                    dialogInterfaceC0207 = dialogInterfaceC0206;
                    break;
                case 431382177:
                case 1252811157:
                    C4925.m14329(editTextM5905);
                    C0287.m1629(textInputLayout);
                    C0287.m1629(textInputLayout3);
                    C0287.m1629(textInputLayout2);
                    return;
                case 1019855347:
                case 1141382795:
                    C4159.m12564(viewM28029, this);
                    int i20 = DialogInterfaceC0206.f1451;
                    c19258 = new C19258(abstractActivityC3346);
                    C0798.m3013(c19258, viewM10739);
                    iM6981 = (C0630.m2566("ܿ᩺") ^ i9) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i14 = ((iM6981 ^ i8) * 10387) ^ (-844957366);
                    i2 = -784488296;
                    i15 = iM6981 ^ i2;
                    break;
                default:
                    c19258.m44419(onCancelListener);
                    DialogInterfaceC0206 dialogInterfaceC0206M2438 = RunnableC0588.m2438(c19258);
                    this.f54212 = dialogInterfaceC0206M2438;
                    C5088.m14637(dialogInterfaceC0206M2438);
                    editTextM5905 = C1773.m5905(textInputLayout);
                    iM6981 = C0630.m2566("ܺ֫") ^ i8;
                    i14 = ((iM6981 ^ i9) * 5849) ^ 769685353;
                    i2 = 1057842640;
                    i15 = iM6981 ^ i2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41500(ViewOnClickListenerC17720 viewOnClickListenerC17720, View view, String str, String str2, String str3) {
        int i = 2109950204;
        int i2 = C1294.f4556;
        int i3 = C3746.f11829;
        int iM6981 = C2105.m6981("ۧۙ") ^ i3;
        int i4 = ((iM6981 ^ i2) * 20901) ^ 2111832217;
        int i5 = 1645815445;
        while (true) {
            i = ((((i ^ i2) * 16661) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2127537824:
                case -1759907125:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C0630.m2566("᩺ۨ") ^ i2) * 25;
                        i4 = ((iM6981 ^ i3) * 27923) ^ (-96872274);
                        i5 = 1221813167;
                    } else {
                        iM6981 = (C0630.m2566("ܶܿ") ^ i3) * 37;
                        i4 = ((iM6981 ^ i2) * 2023) ^ 921587868;
                        i5 = 1091832653;
                    }
                    break;
                case -2105374454:
                case 2103839326:
                    if (C3683.m11222()) {
                        iM6981 = (C0630.m2566("ܺۜ") + i2) * 81;
                        i4 = ((iM6981 ^ i3) * (-23101)) ^ 1370208484;
                        i5 = 344327350;
                    } else {
                        iM6981 = (C0630.m2566("ܺۘ") + i2) * (-61);
                        i4 = ((iM6981 ^ i3) * 1257) ^ 694122875;
                        i5 = 387393585;
                    }
                    break;
                case -1930518320:
                case -1824352910:
                    if (C0483.m2121()) {
                        iM6981 = C2105.m6981("᩺ܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 24013) ^ (-2039072163);
                        i5 = 1748466772;
                    } else {
                        iM6981 = (C0630.m2566("᩺֡") + i2) * (-77);
                        i4 = ((iM6981 ^ i3) * (-8351)) ^ 92937445;
                        i5 = 741779765;
                    }
                    break;
                case -1905487380:
                case 1076666797:
                    if (C0714.f2697 >= 0) {
                        iM6981 = C2105.m6981("᩹۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25785)) ^ (-1209411383);
                        i5 = 1425409760;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ܶᩴ")) * (-49);
                        i4 = ((iM6981 ^ i3) * (-32467)) ^ 109942746;
                        i5 = 48427325;
                    }
                    break;
                case -1671289071:
                case 1828378092:
                    if (C2272.f7362) {
                        iM6981 = C2105.m6981("᩹۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25785)) ^ (-1209411383);
                        i5 = 1425409760;
                    } else {
                        iM6981 = (C0630.m2566("ۤ۬") + i2) * (-67);
                        i4 = ((iM6981 ^ i3) * 17725) ^ (-37975400);
                        i5 = -1556345259;
                    }
                    break;
                case -1623892769:
                case 255851856:
                    if (C0964.f3626 != 0) {
                        iM6981 = (C0630.m2566("᩺ۨ") ^ i2) * 25;
                        i4 = ((iM6981 ^ i3) * 27923) ^ (-96872274);
                        i5 = 1221813167;
                    } else {
                        iM6981 = C2105.m6981("᩵ۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 28483) ^ 2084070328;
                        i5 = 1875461317;
                    }
                    break;
                case -1508817466:
                case 250415282:
                    viewOnClickListenerC17720.m41498(view, str, str2, str3);
                    break;
                case -808648690:
                case -278402861:
                    C2126.m7040();
                    break;
                case 79737506:
                case 1186294327:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C0630.m2566("᩺֡") + i2) * (-77);
                        i4 = ((iM6981 ^ i3) * (-8351)) ^ 92937445;
                        i5 = 741779765;
                    } else {
                        iM6981 = C0630.m2566("᩵᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1071)) ^ 931495440;
                        i5 = -1607203366;
                    }
                    break;
                case 152254247:
                case 1086373380:
                    if (C3683.m11222()) {
                        iM6981 = (C0630.m2566("ۢۖ") + i3) * (-73);
                        i4 = ((iM6981 ^ i2) * (-24265)) ^ 1981664177;
                        i5 = 1678142417;
                    } else {
                        iM6981 = (C2105.m6981("ۜ᩵") ^ i3) * (-59);
                        i4 = ((iM6981 ^ i2) * (-25787)) ^ 2077628642;
                        i5 = -977610496;
                    }
                    break;
                case 411041332:
                case 1358148178:
                    C0382.m1848();
                    iM6981 = (C0630.m2566("ۢۖ") + i3) * (-73);
                    i4 = ((iM6981 ^ i2) * (-24265)) ^ 1981664177;
                    i5 = 1678142417;
                    break;
                case 841774466:
                case 1415268212:
                    if (C3537.m10746() <= 0) {
                        iM6981 = (C0630.m2566("᩺ۨ") ^ i2) * 25;
                        i4 = ((iM6981 ^ i3) * 27923) ^ (-96872274);
                        i5 = 1221813167;
                    } else {
                        iM6981 = (C0630.m2566("ۢۖ") + i3) * (-73);
                        i4 = ((iM6981 ^ i2) * (-24265)) ^ 1981664177;
                        i5 = 1678142417;
                    }
                    break;
                case 1108042965:
                case 1969098019:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C0630.m2566("ܺۜ") + i2) * 81;
                        i4 = ((iM6981 ^ i3) * (-23101)) ^ 1370208484;
                        i5 = 344327350;
                    } else {
                        iM6981 = (C0630.m2566("ۢۖ") + i3) * (-73);
                        i4 = ((iM6981 ^ i2) * (-24265)) ^ 1981664177;
                        i5 = 1678142417;
                    }
                    break;
                case 1450748415:
                case 1570946282:
                    if (C1128.m3851() <= 0) {
                        iM6981 = C2105.m6981("᩹۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25785)) ^ (-1209411383);
                        i5 = 1425409760;
                    } else {
                        iM6981 = C2105.m6981("ۡۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-737)) ^ (-1304354508);
                        i5 = -1152136505;
                    }
                    break;
                case 1958425255:
                case 1988933035:
                    if (C2105.f7037 != 0) {
                        iM6981 = C2105.m6981("᩹۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25785)) ^ (-1209411383);
                        i5 = 1425409760;
                    } else {
                        iM6981 = (C0630.m2566("᩺ۨ") ^ i2) * 25;
                        i4 = ((iM6981 ^ i3) * 27923) ^ (-96872274);
                        i5 = 1221813167;
                    }
                    break;
                default:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C0630.m2566("᩺֡") + i2) * (-77);
                        i4 = ((iM6981 ^ i3) * (-8351)) ^ 92937445;
                        i5 = 741779765;
                    } else {
                        iM6981 = (C0630.m2566("֡۬") + i2) * (-105);
                        i4 = ((iM6981 ^ i3) * (-25561)) ^ (-1842325870);
                        i5 = -1573179983;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:44:0x0173 A[PHI: r7 r10
      0x0173: PHI (r7v4 short[]) = (r7v3 short[]), (r7v2 short[]) binds: [B:43:0x0171, B:7:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r10v7 char) = (r10v6 char), (r10v5 char) binds: [B:43:0x0171, B:7:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:8:0x0049  */
    /* JADX WARN: Type inference failed for: r21v0, types: [l.ܽ֨ۡ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m41498(final View view, final String str, final String str2, final String str3) {
        int iM6981;
        int i;
        int i2 = C2958.f9394;
        int i3 = C22628.f73083;
        int iM6982 = C2105.m6981("ۡۤ") ^ i3;
        short[] sArr = null;
        int i4 = iM6982 ^ (-394770021);
        int i5 = ((iM6982 ^ i2) * (-18969)) ^ 1284097935;
        int i6 = 373495515;
        char c = 0;
        short s = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 0;
        while (true) {
            int i9 = i4 ^ ((((i6 ^ i2) * (-21059)) >> 31) & i5);
            switch (i9) {
                case -2127060854:
                case -1242563919:
                    i8 = 29525;
                    iM6981 = C2105.m6981("ۗ᩹") ^ i3;
                    i5 = (-54868071) ^ ((iM6981 ^ i2) * 15201);
                    i = 1243261236;
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
                case -1888648043:
                case 1566215014:
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("ᩴۘ") ^ i2;
                        i5 = 1555573427 ^ ((iM6981 ^ i3) * (-26715));
                        i = 837853573;
                    } else {
                        iM6981 = C2105.m6981("᩷᩹") ^ i3;
                        i5 = 1257128058 ^ ((iM6981 ^ i2) * 12481);
                        i = -455276146;
                    }
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
                case -1808460389:
                case -641429042:
                    C7811.m20844();
                    if (RunnableC0588.f2309 < 0) {
                        iM6981 = C2105.m6981("ܺܺ") ^ i2;
                        i5 = (-1335873200) ^ ((iM6981 ^ i3) * (-13911));
                        i = 1209268791;
                    } else {
                        iM6981 = C0630.m2566("᩹ۤ") ^ i3;
                        i5 = 320477866 ^ ((iM6981 ^ i2) * (-5113));
                        i = -665140294;
                    }
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
                case -1232723996:
                case -1120811040:
                    ServiceConnectionC3453.m10564();
                    break;
                case -1179401077:
                case 1945193369:
                    i8 = 9378;
                    iM6981 = C2105.m6981("ۗ᩹") ^ i3;
                    i5 = (-54868071) ^ ((iM6981 ^ i2) * 15201);
                    i = 1243261236;
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
                case -893007218:
                case -566535106:
                    int i10 = s + s2;
                    if ((i10 * i10) - i7 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩶֡")) * 99;
                        i5 = 700819871 ^ ((iM6981 ^ i2) * 3571);
                        i = -1501755279;
                    } else {
                        iM6981 = (C2105.m6981("ܿᩳ") ^ i2) * (-53);
                        i5 = 671502413 ^ ((iM6981 ^ i3) * 15291);
                        i = -1093095573;
                    }
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
                case -784514673:
                case 1442816739:
                    sArr = f54207;
                    c = '4';
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("ۛܶ") ^ i2;
                        i5 = (-1830012086) ^ ((iM6981 ^ i3) * 22449);
                        i = 1628902583;
                    } else {
                        iM6981 = C0630.m2566("֨۫") ^ i2;
                        i5 = 1765620915 ^ ((iM6981 ^ i3) * (-1683));
                        i = -1521912137;
                    }
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
                case -577006757:
                case -232815275:
                    if (C1005.f3721) {
                        iM6981 = C2105.m6981("۟ۨ") ^ i2;
                        i5 = (-381525911) ^ ((iM6981 ^ i3) * (-1613));
                        i = -2132603771;
                    } else {
                        iM6981 = C2105.m6981("ᩴۘ") ^ i2;
                        i5 = 1555573427 ^ ((iM6981 ^ i3) * (-26715));
                        i = 837853573;
                    }
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
                case -482317739:
                case 1975586299:
                    if (C0483.f2088 >= 0) {
                        iM6981 = C2105.m6981("ᩴۘ") ^ i2;
                        i5 = 1555573427 ^ ((iM6981 ^ i3) * (-26715));
                        i = 837853573;
                    } else {
                        iM6981 = C0630.m2566("۟᩷") ^ i3;
                        i5 = 860896563 ^ ((iM6981 ^ i2) * (-9219));
                        i = -537243091;
                    }
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
                case -477209329:
                case 880204052:
                    C21923.m49329();
                    if (C1773.m5908() > 0) {
                        iM6981 = C0630.m2566("᩹ۤ") ^ i3;
                        i5 = 320477866 ^ ((iM6981 ^ i2) * (-5113));
                        i = -665140294;
                    } else {
                        iM6981 = C2105.m6981("ۛܶ") ^ i2;
                        i5 = (-1830012086) ^ ((iM6981 ^ i3) * 22449);
                        i = 1628902583;
                    }
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
                case -367412298:
                case 1271345241:
                    if (C1711.m5736() <= 0) {
                        iM6981 = C2105.m6981("ᩴۘ") ^ i2;
                        i5 = 1555573427 ^ ((iM6981 ^ i3) * (-26715));
                        i = 837853573;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۘ᩻")) * (-23);
                        i5 = (-1964580722) ^ ((iM6981 ^ i3) * 31531);
                        i = 1990084993;
                    }
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
                case -306512174:
                case -174813311:
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("ܺܺ") ^ i2;
                        i5 = (-1335873200) ^ ((iM6981 ^ i3) * (-13911));
                        i = 1209268791;
                    } else {
                        iM6981 = C2105.m6981("ᩴۘ") ^ i2;
                        i5 = 1555573427 ^ ((iM6981 ^ i3) * (-26715));
                        i = 837853573;
                    }
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
                case -249258309:
                case 1349196387:
                    s = sArr[c];
                    i7 = s * 37756;
                    s2 = 9439;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("ۛܿ") ^ i3;
                        i5 = 1444534731 ^ ((iM6981 ^ i2) * (-24697));
                        i = -697466840;
                    } else {
                        iM6981 = C0630.m2566("᩶֨") ^ i3;
                        i5 = (-703614890) ^ ((iM6981 ^ i2) * (-3695));
                        i = -337943761;
                    }
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
                case 212895738:
                case 2147041621:
                    C22628.m50613(view, false);
                    AbstractActivityC3346 abstractActivityC3346 = this.f54211;
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("᩹ۤ") ^ i3;
                        i5 = 320477866 ^ ((iM6981 ^ i2) * (-5113));
                        i = -665140294;
                    } else {
                        short[] sArr2 = f54207;
                        if (C3432.m10477() > 0) {
                            int iM6983 = C2105.m6981(C0382.m1840(sArr2, 53, 3, i8)) ^ 2126366423;
                            if (C7811.f24123 < 0) {
                                final C13136 c13136 = new C13136(abstractActivityC3346, iM6983);
                                C1128.m3854(c13136);
                                final ?? r21 = new InterfaceC9461() { // from class: l.ܽ֨ۡ
                                    {
                                        int i11 = -1984954347;
                                        int i12 = C3245.f10203;
                                        int i13 = C1420.f5096;
                                        int iM2566 = C0630.m2566("ۚ۬") ^ i13;
                                        int i14 = ((iM2566 ^ i12) * (-1113)) ^ (-390950896);
                                        int i15 = -1427641583;
                                        while (true) {
                                            i11 = ((((i11 ^ i12) * 27531) >> 31) & i14) ^ (iM2566 ^ i15);
                                            switch (i11) {
                                                case -2006265621:
                                                case -959913507:
                                                    if (C4616.m13552() == 0) {
                                                        iM2566 = C0630.m2566("֫ۗ") ^ i13;
                                                        i14 = ((iM2566 ^ i12) * 30499) ^ (-1175427859);
                                                        i15 = -1078874102;
                                                    } else {
                                                        iM2566 = (C2105.m6981("ۤۨ") ^ i13) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i14 = ((iM2566 ^ i12) * 15699) ^ 10085197;
                                                        i15 = 1878673189;
                                                    }
                                                    break;
                                                case -1970242817:
                                                case -1388725924:
                                                    if (C2167.f7158 >= 0) {
                                                        iM2566 = C0630.m2566("ᩳۢ") ^ i12;
                                                        i14 = ((iM2566 ^ i13) * (-22725)) ^ (-1171384032);
                                                        i15 = -565635435;
                                                    } else {
                                                        iM2566 = (C0630.m2566("ۢ᩻") + i12) * 39;
                                                        i14 = ((iM2566 ^ i13) * (-8301)) ^ 864009791;
                                                        i15 = 571972622;
                                                    }
                                                    break;
                                                case -1852551704:
                                                case -104354072:
                                                    if (C1005.f3721) {
                                                        iM2566 = C2105.m6981("ۘ۬") ^ i12;
                                                        i14 = ((iM2566 ^ i13) * (-12085)) ^ (-175227274);
                                                        i15 = 961729114;
                                                    } else {
                                                        iM2566 = C0630.m2566("ᩳۢ") ^ i12;
                                                        i14 = ((iM2566 ^ i13) * (-22725)) ^ (-1171384032);
                                                        i15 = -565635435;
                                                    }
                                                    break;
                                                case -1800438411:
                                                case 1761455632:
                                                    AbstractC2021.m6574();
                                                    throw new RuntimeException();
                                                case -1774889517:
                                                case -236504683:
                                                    if (C0050.f910 >= 0) {
                                                        iM2566 = C0630.m2566("ᩳۢ") ^ i12;
                                                        i14 = ((iM2566 ^ i13) * (-22725)) ^ (-1171384032);
                                                        i15 = -565635435;
                                                    } else {
                                                        iM2566 = C0630.m2566("ۗ۟") ^ i13;
                                                        i14 = ((iM2566 ^ i12) * 6707) ^ (-980081156);
                                                        i15 = -1173508204;
                                                    }
                                                    break;
                                                case -1771741987:
                                                case 598533355:
                                                    if (C2126.f7087) {
                                                        iM2566 = C2105.m6981("ۘۤ") ^ i13;
                                                        i14 = ((iM2566 ^ i12) * (-5847)) ^ (-1627281530);
                                                        i15 = -249483862;
                                                    } else {
                                                        iM2566 = (i12 - C2105.m6981("۟᩻")) * (-23);
                                                        i14 = ((iM2566 ^ i13) * 1095) ^ (-1740078548);
                                                        i15 = 1428139366;
                                                    }
                                                    break;
                                                case -1521408828:
                                                case -1293210318:
                                                    C2105.m6982();
                                                    if (C0714.f2697 < 0) {
                                                        iM2566 = C0630.m2566("ۤ᩻") ^ i12;
                                                        i14 = ((iM2566 ^ i13) * 8085) ^ (-690364943);
                                                        i15 = -458143326;
                                                    } else {
                                                        iM2566 = C0630.m2566("֫ۗ") ^ i13;
                                                        i14 = ((iM2566 ^ i12) * 30499) ^ (-1175427859);
                                                        i15 = -1078874102;
                                                    }
                                                    break;
                                                case -382866473:
                                                case 987498565:
                                                    if (AbstractC2021.f6743 <= 0) {
                                                        iM2566 = C0630.m2566("ۤ᩻") ^ i12;
                                                        i14 = ((iM2566 ^ i13) * 8085) ^ (-690364943);
                                                        i15 = -458143326;
                                                    } else {
                                                        iM2566 = C0630.m2566("᩵ܳ") ^ i12;
                                                        i14 = ((iM2566 ^ i13) * 30647) ^ (-1661655672);
                                                        i15 = -1269877019;
                                                    }
                                                    break;
                                                case -321067089:
                                                case -58991342:
                                                    AbstractC2021.m6574();
                                                    if (RunnableC3474.f10992 <= 0) {
                                                        iM2566 = C0630.m2566("ᩳۢ") ^ i12;
                                                        i14 = ((iM2566 ^ i13) * (-22725)) ^ (-1171384032);
                                                        i15 = -565635435;
                                                    } else {
                                                        iM2566 = (C2105.m6981("ۤۨ") ^ i13) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i14 = ((iM2566 ^ i12) * 15699) ^ 10085197;
                                                        i15 = 1878673189;
                                                    }
                                                    break;
                                                case -63736782:
                                                case 1430953683:
                                                    C4159.m12565();
                                                    RunnableC1937.m6387();
                                                    iM2566 = (C2105.m6981("ۤۨ") ^ i13) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                    i14 = ((iM2566 ^ i12) * 15699) ^ 10085197;
                                                    i15 = 1878673189;
                                                    break;
                                                case 455823654:
                                                case 909021352:
                                                    if (C1420.f5096 <= 0) {
                                                        iM2566 = C0630.m2566("֫ۗ") ^ i13;
                                                        i14 = ((iM2566 ^ i12) * 30499) ^ (-1175427859);
                                                        i15 = -1078874102;
                                                    } else {
                                                        iM2566 = (C2105.m6981("ۗܽ") ^ i13) * 127;
                                                        i14 = ((iM2566 ^ i12) * 423) ^ (-139597762);
                                                        i15 = -821502927;
                                                    }
                                                    break;
                                                case 869197520:
                                                case 1497481370:
                                                    if (C0382.f1805) {
                                                        iM2566 = C2105.m6981("ܳ֡") ^ i12;
                                                        i14 = ((iM2566 ^ i13) * 25305) ^ 1337754947;
                                                        i15 = 1315997951;
                                                    } else {
                                                        iM2566 = C0630.m2566("ᩳۢ") ^ i12;
                                                        i14 = ((iM2566 ^ i13) * (-22725)) ^ (-1171384032);
                                                        i15 = -565635435;
                                                    }
                                                    break;
                                                case 1562782840:
                                                case 1812542553:
                                                    if (C7811.f24123 >= 0) {
                                                        iM2566 = C0630.m2566("ᩳۢ") ^ i12;
                                                        i14 = ((iM2566 ^ i13) * (-22725)) ^ (-1171384032);
                                                        i15 = -565635435;
                                                    } else {
                                                        iM2566 = C2105.m6981("᩻ܶ") ^ i13;
                                                        i14 = ((iM2566 ^ i12) * (-21367)) ^ 1865884988;
                                                        i15 = -286236973;
                                                    }
                                                    break;
                                                case 1577893599:
                                                case 1656135145:
                                                    if (RunnableC3474.f10992 <= 0) {
                                                        iM2566 = C0630.m2566("֫ۗ") ^ i13;
                                                        i14 = ((iM2566 ^ i12) * 30499) ^ (-1175427859);
                                                        i15 = -1078874102;
                                                    } else {
                                                        iM2566 = C2105.m6981("᩷۫") ^ i13;
                                                        i14 = ((iM2566 ^ i12) * (-27183)) ^ 1372664094;
                                                        i15 = 1617232939;
                                                    }
                                                    break;
                                                case 1849603103:
                                                case 1850449803:
                                                    if (C2272.f7362) {
                                                        iM2566 = C2105.m6981("ۘۤ") ^ i13;
                                                        i14 = ((iM2566 ^ i12) * (-5847)) ^ (-1627281530);
                                                        i15 = -249483862;
                                                    } else {
                                                        iM2566 = (C0630.m2566("ۗۖ") + i13) * 69;
                                                        i14 = ((iM2566 ^ i12) * (-6265)) ^ 64920299;
                                                        i15 = 1982253615;
                                                    }
                                                    break;
                                                default:
                                                    return;
                                            }
                                        }
                                    }

                                    /* JADX WARN: Code duplicated, block: B:33:0x00bc A[PHI: r14
                                      0x00bc: PHI (r14v2 java.lang.String) = (r14v1 java.lang.String), (r14v3 java.lang.String) binds: [B:32:0x00ba, B:27:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
                                    /* JADX WARN: Code duplicated, block: B:37:0x00ec  */
                                    /* JADX WARN: Code duplicated, block: B:49:0x0153 A[PHI: r10 r11
                                      0x0153: PHI (r10v5 l.۬۬ܿ) = (r10v3 l.۬۬ܿ), (r10v3 l.۬۬ܿ), (r10v3 l.۬۬ܿ), (r10v4 l.۬۬ܿ), (r10v3 l.۬۬ܿ) binds: [B:48:0x0151, B:44:0x0137, B:40:0x011d, B:23:0x006e, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]
                                      0x0153: PHI (r11v3 android.view.View) = 
                                      (r11v1 android.view.View)
                                      (r11v1 android.view.View)
                                      (r11v1 android.view.View)
                                      (r11v2 android.view.View)
                                      (r11v1 android.view.View)
                                     binds: [B:48:0x0151, B:44:0x0137, B:40:0x011d, B:23:0x006e, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
                                    /* JADX WARN: Code duplicated, block: B:53:0x0181  */
                                    /* JADX WARN: Code duplicated, block: B:57:0x01b1 A[PHI: r13
                                      0x01b1: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v1 java.lang.String), (r13v4 java.lang.String) binds: [B:56:0x01af, B:9:0x003e, B:6:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
                                    @Override // l.InterfaceC9461
                                    /* JADX INFO: renamed from: ֫ */
                                    public final void mo1430(C23881 c23881) {
                                        int iM2566;
                                        int i11;
                                        int i12 = 1989820693;
                                        int i13 = C0630.f2410;
                                        int i14 = RunnableC3474.f10992;
                                        int iM6984 = (C2105.m6981("ۗ۬") ^ i14) * 55;
                                        int i15 = ((iM6984 ^ i13) * (-24309)) ^ 998506583;
                                        int i16 = iM6984 ^ 1257027954;
                                        String str4 = null;
                                        String str5 = null;
                                        C13136 c13137 = null;
                                        View view2 = null;
                                        while (true) {
                                            i12 = i16 ^ ((((i12 ^ i13) * (-12187)) >> 31) & i15);
                                            switch (i12) {
                                                case -2102186096:
                                                case 1663125647:
                                                    ViewOnClickListenerC17720.m41499(c13137, view2, this, str4, str5, c23881);
                                                    break;
                                                case -2060243130:
                                                case 554354181:
                                                    if (C1047.f3863 >= 0) {
                                                        iM2566 = (C2105.m6981("ۢܶ") + i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i15 = ((iM2566 ^ i13) * 28989) ^ (-1063089987);
                                                        i11 = 1612997172;
                                                    } else {
                                                        iM2566 = C0630.m2566("ܽۧ") ^ i14;
                                                        i15 = ((iM2566 ^ i13) * 22367) ^ (-1257390259);
                                                        i11 = -690092839;
                                                    }
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                                case -1895152583:
                                                case -670371530:
                                                    str5 = str2;
                                                    if (C2105.f7037 != 0) {
                                                        iM2566 = C2105.m6981("ܰ᩵") ^ i13;
                                                        i15 = ((iM2566 ^ i14) * 3169) ^ (-1821455327);
                                                        i11 = 297758461;
                                                    } else {
                                                        iM2566 = C0630.m2566("ۘᩳ") ^ i13;
                                                        i15 = ((iM2566 ^ i14) * 24177) ^ (-1290031364);
                                                        i11 = -1115044489;
                                                    }
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                                case -1675018359:
                                                case 1654292376:
                                                    if (C3245.f10203 <= 0) {
                                                        iM2566 = (C0630.m2566("ܰۘ") + i14) * (-11);
                                                        i15 = ((iM2566 ^ i13) * 27191) ^ (-501889815);
                                                        i11 = -1832685280;
                                                    } else {
                                                        iM2566 = (C0630.m2566("᩺ۨ") + i14) * 39;
                                                        i15 = ((iM2566 ^ i13) * 16043) ^ 1941019594;
                                                        i11 = -901141800;
                                                    }
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                                case -1601131135:
                                                case -441108005:
                                                    if (C2126.f7087) {
                                                        iM2566 = (C2105.m6981("ܶᩳ") + i13) * 17;
                                                        i15 = ((iM2566 ^ i14) * (-10623)) ^ (-345932160);
                                                        i11 = 1424678588;
                                                    } else {
                                                        iM2566 = (C0630.m2566("ܰۘ") + i14) * (-11);
                                                        i15 = ((iM2566 ^ i13) * 27191) ^ (-501889815);
                                                        i11 = -1832685280;
                                                    }
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                                case -1374819796:
                                                case -576200632:
                                                    if (C1504.f5354) {
                                                        iM2566 = (C2105.m6981("ܶᩳ") + i13) * 17;
                                                        i15 = ((iM2566 ^ i14) * (-10623)) ^ (-345932160);
                                                        i11 = 1424678588;
                                                    } else {
                                                        iM2566 = (i13 - C2105.m6981("ܺ۟")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                        i15 = ((iM2566 ^ i14) * (-16547)) ^ 907396342;
                                                        i11 = -2005364852;
                                                    }
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                                case -1221317058:
                                                case -572482356:
                                                    if (C0798.f2919) {
                                                        iM2566 = (C2105.m6981("ۢܶ") + i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i15 = ((iM2566 ^ i13) * 28989) ^ (-1063089987);
                                                        i11 = 1612997172;
                                                    } else {
                                                        iM2566 = C2105.m6981("᩻ۗ") ^ i13;
                                                        i15 = ((iM2566 ^ i14) * 4657) ^ (-1137441953);
                                                        i11 = -1887598592;
                                                    }
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                                case -707896070:
                                                case -164648958:
                                                    if (C21923.f70183 != 0) {
                                                        iM2566 = (C2105.m6981("ۢܶ") + i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i15 = ((iM2566 ^ i13) * 28989) ^ (-1063089987);
                                                        i11 = 1612997172;
                                                    } else {
                                                        iM2566 = C0630.m2566("᩻ۤ") ^ i14;
                                                        i15 = ((iM2566 ^ i13) * q.h) ^ (-1993650178);
                                                        i11 = -807134136;
                                                    }
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                                case -634704509:
                                                case 1497072303:
                                                    if (C2520.f8000 >= 0) {
                                                        iM2566 = C2105.m6981("ܰ᩵") ^ i13;
                                                        i15 = ((iM2566 ^ i14) * 3169) ^ (-1821455327);
                                                        i11 = 297758461;
                                                    } else {
                                                        iM2566 = (C0630.m2566("᩵ۘ") ^ i13) * (-85);
                                                        i15 = ((iM2566 ^ i14) * 6109) ^ 1934827344;
                                                        i11 = -1072451331;
                                                    }
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                                case -569952474:
                                                case -415644502:
                                                    c13137 = c13136;
                                                    view2 = view;
                                                    if (C3019.f9544 >= 0) {
                                                        iM2566 = (C2105.m6981("ۢܶ") + i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i15 = ((iM2566 ^ i13) * 28989) ^ (-1063089987);
                                                        i11 = 1612997172;
                                                    } else {
                                                        iM2566 = C2105.m6981("ܽۖ") ^ i14;
                                                        i15 = ((iM2566 ^ i13) * 23251) ^ 885950217;
                                                        i11 = 46883355;
                                                    }
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                                case -67574215:
                                                case 1478244985:
                                                    C0714.m2805();
                                                    C22628.m50615();
                                                    break;
                                                case 750036619:
                                                case 1497552591:
                                                    C7811.m20844();
                                                    if (ServiceConnectionC3453.f10921 >= 0) {
                                                        iM2566 = (C0630.m2566("ܰۘ") + i14) * (-11);
                                                        i15 = ((iM2566 ^ i13) * 27191) ^ (-501889815);
                                                        i11 = -1832685280;
                                                    } else {
                                                        iM2566 = (C2105.m6981("ۢܶ") + i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i15 = ((iM2566 ^ i13) * 28989) ^ (-1063089987);
                                                        i11 = 1612997172;
                                                    }
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                                case 1135065754:
                                                case 1725768631:
                                                    if (RunnableC0588.f2309 >= 0) {
                                                        iM2566 = C2105.m6981("֡᩸") ^ i13;
                                                        i15 = ((iM2566 ^ i14) * (-3101)) ^ 1984715408;
                                                        i11 = 66253182;
                                                    } else {
                                                        iM2566 = C0630.m2566("ۛ۫") ^ i13;
                                                        i15 = ((iM2566 ^ i14) * (-2281)) ^ (-589907460);
                                                        i11 = -963048513;
                                                    }
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                                case 1259305214:
                                                case 1742262321:
                                                    if (C1773.f6144 > 0) {
                                                        iM2566 = (C0630.m2566("ܰۘ") + i14) * (-11);
                                                        i15 = ((iM2566 ^ i13) * 27191) ^ (-501889815);
                                                        i11 = -1832685280;
                                                    } else {
                                                        iM2566 = C2105.m6981("֡᩸") ^ i13;
                                                        i15 = ((iM2566 ^ i14) * (-3101)) ^ 1984715408;
                                                        i11 = 66253182;
                                                    }
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                                case 1362797519:
                                                case 1523936913:
                                                    C5695.m16023();
                                                    C0714.m2805();
                                                    iM2566 = (C0630.m2566("ܰۘ") + i14) * (-11);
                                                    i15 = ((iM2566 ^ i13) * 27191) ^ (-501889815);
                                                    i11 = -1832685280;
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                                default:
                                                    str4 = str;
                                                    if (C4616.m13552() != 0) {
                                                        iM2566 = C2105.m6981("֡᩸") ^ i13;
                                                        i15 = ((iM2566 ^ i14) * (-3101)) ^ 1984715408;
                                                        i11 = 66253182;
                                                    } else {
                                                        iM2566 = C0630.m2566("ܳ֡") ^ i14;
                                                        i15 = ((iM2566 ^ i13) * (-32481)) ^ 1890653812;
                                                        i11 = -1176446891;
                                                    }
                                                    i16 = iM2566 ^ i11;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                };
                                if (RunnableC0588.f2309 < 0) {
                                    final AbstractActivityC3346 abstractActivityC3347 = this.f54211;
                                    C11340.m28020(new Thread(new Runnable() { // from class: l.ۢ֨ۡ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Activity activity = null;
                                            C16308 c16308 = null;
                                            String str4 = null;
                                            int i11 = 1604616699;
                                            int i12 = C0050.f910;
                                            int i13 = C7811.f24123;
                                            int iM6984 = (C2105.m6981("۬ۧ") ^ i13) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            int i14 = ((iM6984 ^ i12) * (-11739)) ^ 1386073711;
                                            int i15 = 956925467;
                                            while (true) {
                                                i11 = ((((i11 ^ i12) * 16141) >> 31) & i14) ^ (iM6984 ^ i15);
                                                switch (i11) {
                                                    case -1791233256:
                                                    case 872384227:
                                                        C4616.m13552();
                                                        if (C4075.f12947 < 0) {
                                                            iM6984 = C0630.m2566("ܿۤ") ^ i12;
                                                            i14 = ((iM6984 ^ i13) * 22713) ^ 587821933;
                                                            i15 = 558504323;
                                                        } else {
                                                            iM6984 = C0630.m2566("֨ۛ") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * (-1795)) ^ 1114229891;
                                                            i15 = -183507372;
                                                        }
                                                        break;
                                                    case -1693874237:
                                                    case -1685142779:
                                                        if (C3537.m10746() <= 0) {
                                                            iM6984 = C0630.m2566("ܿۤ") ^ i12;
                                                            i14 = ((iM6984 ^ i13) * 22713) ^ 587821933;
                                                            i15 = 558504323;
                                                        } else {
                                                            iM6984 = C0630.m2566("۟ۨ") ^ i12;
                                                            i14 = ((iM6984 ^ i13) * 14187) ^ (-285498198);
                                                            i15 = 666958376;
                                                        }
                                                        break;
                                                    case -1652094833:
                                                    case 3010643:
                                                        c16308 = r21;
                                                        if (C4117.m12364() != 0) {
                                                            iM6984 = (i12 - C2105.m6981("ܰ֡")) * 59;
                                                            i14 = ((iM6984 ^ i13) * 27363) ^ 321783437;
                                                            i15 = -1563386371;
                                                        } else {
                                                            iM6984 = (i12 - C2105.m6981("۠۟")) * 3;
                                                            i14 = ((iM6984 ^ i13) * 2199) ^ (-1445518236);
                                                            i15 = -1927286491;
                                                        }
                                                        break;
                                                    case -1547678825:
                                                    case -614122358:
                                                        ServiceConnectionC3453.m10564();
                                                        if (ViewOnClickListenerC1958.f6529 > 0) {
                                                            iM6984 = C0630.m2566("ᩴ֡") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * 10089) ^ 1405511666;
                                                            i15 = 617091058;
                                                        } else {
                                                            iM6984 = C0630.m2566("֨ۛ") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * (-1795)) ^ 1114229891;
                                                            i15 = -183507372;
                                                        }
                                                        break;
                                                    case -1364761871:
                                                    case 901362254:
                                                        if (C0382.f1805) {
                                                            iM6984 = (C0630.m2566("ۚۗ") ^ i12) * (-25);
                                                            i14 = ((iM6984 ^ i13) * (-25315)) ^ (-1610447709);
                                                            i15 = -826708721;
                                                        } else {
                                                            iM6984 = (i12 - C2105.m6981("ܰ֡")) * 59;
                                                            i14 = ((iM6984 ^ i13) * 27363) ^ 321783437;
                                                            i15 = -1563386371;
                                                        }
                                                        break;
                                                    case -949115424:
                                                    case 1157600544:
                                                        C2126.m7040();
                                                        C21923.m49329();
                                                        break;
                                                    case -930001101:
                                                    case 1415551861:
                                                        C2405.m7796(str4, str2, str3, activity, c16308);
                                                        break;
                                                    case -829124063:
                                                    case -571481267:
                                                        C2958.m9034();
                                                        C0382.m1848();
                                                        iM6984 = C0630.m2566("֨ۛ") ^ i13;
                                                        i14 = ((iM6984 ^ i12) * (-1795)) ^ 1114229891;
                                                        i15 = -183507372;
                                                        break;
                                                    case -577170304:
                                                    case 2029204161:
                                                        str4 = str;
                                                        if (C0422.f1886 <= 0) {
                                                            iM6984 = (i12 - C2105.m6981("ܰ֡")) * 59;
                                                            i14 = ((iM6984 ^ i13) * 27363) ^ 321783437;
                                                            i15 = -1563386371;
                                                        } else {
                                                            iM6984 = (C0630.m2566("֫ܳ") + i13) * 47;
                                                            i14 = ((iM6984 ^ i12) * 17135) ^ (-1287874256);
                                                            i15 = 1673823122;
                                                        }
                                                        break;
                                                    case -238998170:
                                                    case -54503259:
                                                        if (C4075.f12947 >= 0) {
                                                            iM6984 = C0630.m2566("֨ۛ") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * (-1795)) ^ 1114229891;
                                                            i15 = -183507372;
                                                        } else {
                                                            iM6984 = C0630.m2566("۬۫") ^ i12;
                                                            i14 = ((iM6984 ^ i13) * 9331) ^ (-1006910432);
                                                            i15 = -1426639936;
                                                        }
                                                        break;
                                                    case 380383867:
                                                    case 594735687:
                                                        activity = abstractActivityC3347;
                                                        if (C3746.m11369() >= 0) {
                                                            iM6984 = C0630.m2566("֨ۛ") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * (-1795)) ^ 1114229891;
                                                            i15 = -183507372;
                                                        } else {
                                                            iM6984 = C0630.m2566("᩹ۛ") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * 22151) ^ (-196950495);
                                                            i15 = 1295230560;
                                                        }
                                                        break;
                                                    case 610052477:
                                                    case 1448276980:
                                                        if (C1047.f3863 >= 0) {
                                                            iM6984 = C0630.m2566("ܿۤ") ^ i12;
                                                            i14 = ((iM6984 ^ i13) * 22713) ^ 587821933;
                                                            i15 = 558504323;
                                                        } else {
                                                            iM6984 = C2105.m6981("ܽۖ") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * 5447) ^ 511591196;
                                                            i15 = -421340150;
                                                        }
                                                        break;
                                                    case 610653112:
                                                    case 2064956966:
                                                        if (C3537.f11231 >= 0) {
                                                            iM6984 = (i12 - C2105.m6981("ܰ֡")) * 59;
                                                            i14 = ((iM6984 ^ i13) * 27363) ^ 321783437;
                                                            i15 = -1563386371;
                                                        } else {
                                                            iM6984 = C2105.m6981("᩺֫") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * 25479) ^ (-109504940);
                                                            i15 = 525639111;
                                                        }
                                                        break;
                                                    case 718801194:
                                                    case 766463871:
                                                        if (C7811.f24123 >= 0) {
                                                            iM6984 = C0630.m2566("ܿۤ") ^ i12;
                                                            i14 = ((iM6984 ^ i13) * 22713) ^ 587821933;
                                                            i15 = 558504323;
                                                        } else {
                                                            iM6984 = (C2105.m6981("۫۫") ^ i13) * 91;
                                                            i14 = ((iM6984 ^ i12) * 3335) ^ (-1753963834);
                                                            i15 = -572547758;
                                                        }
                                                        break;
                                                    case 968842715:
                                                    case 1460862580:
                                                        if (C4117.f13076 <= 0) {
                                                            iM6984 = C0630.m2566("ᩴ֡") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * 10089) ^ 1405511666;
                                                            i15 = 617091058;
                                                        } else {
                                                            iM6984 = C2105.m6981("᩷۬") ^ i12;
                                                            i14 = ((iM6984 ^ i13) * 5717) ^ 2048020243;
                                                            i15 = -2018338760;
                                                        }
                                                        break;
                                                    default:
                                                        if (C2272.f7362) {
                                                            iM6984 = C0630.m2566("֨ۛ") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * (-1795)) ^ 1114229891;
                                                            i15 = -183507372;
                                                        } else {
                                                            iM6984 = C0630.m2566("᩸ۨ") ^ i12;
                                                            i14 = ((iM6984 ^ i13) * 29003) ^ 94971649;
                                                            i15 = -696373487;
                                                        }
                                                        break;
                                                }
                                                return;
                                            }
                                        }

                                        {
                                            int i11 = 1570940038;
                                            int i12 = C3746.f11829;
                                            int i13 = C2958.f9394;
                                            int iM6984 = (C2105.m6981("ۙ᩸") ^ i13) * (-29);
                                            int i14 = ((iM6984 ^ i12) * (-24959)) ^ (-72582678);
                                            int i15 = -2012425709;
                                            while (true) {
                                                i11 = ((((i11 ^ i12) * 24559) >> 31) & i14) ^ (iM6984 ^ i15);
                                                switch (i11) {
                                                    case -1947431289:
                                                    case 736542116:
                                                        C21923.m49329();
                                                        if (!C3663.f11553) {
                                                            iM6984 = (C2105.m6981("ۤۤ") ^ i13) * (-19);
                                                            i14 = ((iM6984 ^ i12) * 1909) ^ (-1390311449);
                                                            i15 = 1673866945;
                                                        } else {
                                                            iM6984 = (i12 - C0630.m2566("ۙۜ")) * 115;
                                                            i14 = ((iM6984 ^ i13) * 30773) ^ 352671558;
                                                            i15 = 2074846358;
                                                        }
                                                        break;
                                                    case -1544021614:
                                                    case 187773465:
                                                        if (C1711.m5736() <= 0) {
                                                            iM6984 = (C2105.m6981("ۤۤ") ^ i13) * (-19);
                                                            i14 = ((iM6984 ^ i12) * 1909) ^ (-1390311449);
                                                            i15 = 1673866945;
                                                        } else {
                                                            iM6984 = (C0630.m2566("ܽܰ") ^ i13) * (-39);
                                                            i14 = ((iM6984 ^ i12) * (-10391)) ^ 1942775923;
                                                            i15 = 1525113572;
                                                        }
                                                        break;
                                                    case -1399871332:
                                                    case -1288911509:
                                                        if (RunnableC3474.f10992 <= 0) {
                                                            iM6984 = (i12 - C0630.m2566("ۙۜ")) * 115;
                                                            i14 = ((iM6984 ^ i13) * 30773) ^ 352671558;
                                                            i15 = 2074846358;
                                                        } else {
                                                            iM6984 = C0630.m2566("۫֨") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * 16131) ^ 1055483226;
                                                            i15 = 49518779;
                                                        }
                                                        break;
                                                    case -1392542381:
                                                    case 1217587888:
                                                        C3019.m9255();
                                                        C1047.m3599();
                                                        throw new RuntimeException();
                                                    case -1380146550:
                                                    case 1984397547:
                                                        AbstractC2021.m6574();
                                                        C2272.m7503();
                                                        iM6984 = (i12 - C0630.m2566("ۙۜ")) * 115;
                                                        i14 = ((iM6984 ^ i13) * 30773) ^ 352671558;
                                                        i15 = 2074846358;
                                                        break;
                                                    case -1261200901:
                                                    case -961710423:
                                                        if (C0714.f2697 >= 0) {
                                                            iM6984 = C0630.m2566("۬᩺") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * 10123) ^ (-1299317074);
                                                            i15 = -2134232081;
                                                        } else {
                                                            iM6984 = (C2105.m6981("ۤ۠") + i12) * 17;
                                                            i14 = ((iM6984 ^ i13) * (-17919)) ^ (-372205971);
                                                            i15 = -548583064;
                                                        }
                                                        break;
                                                    case -1072932582:
                                                    case -47196544:
                                                        if (C4117.f13076 <= 0) {
                                                            iM6984 = (C2105.m6981("ۖۢ") ^ i12) * (-81);
                                                            i14 = ((iM6984 ^ i13) * (-6425)) ^ (-370619338);
                                                            i15 = 1562705684;
                                                        } else {
                                                            iM6984 = C0630.m2566("ܳᩴ") ^ i12;
                                                            i14 = ((iM6984 ^ i13) * 1441) ^ (-918844482);
                                                            i15 = 678464821;
                                                        }
                                                        break;
                                                    case -1021849738:
                                                    case 794851209:
                                                        if (C3911.f12484 >= 0) {
                                                            iM6984 = (i12 - C0630.m2566("ۙۜ")) * 115;
                                                            i14 = ((iM6984 ^ i13) * 30773) ^ 352671558;
                                                            i15 = 2074846358;
                                                        } else {
                                                            iM6984 = (i13 - C0630.m2566("ۤۜ")) * (-119);
                                                            i14 = ((iM6984 ^ i12) * 3315) ^ 419933029;
                                                            i15 = 362126142;
                                                        }
                                                        break;
                                                    case -866095901:
                                                    case 842591795:
                                                        if (RunnableC3474.f10992 <= 0) {
                                                            iM6984 = (i12 - C0630.m2566("ۙۜ")) * 115;
                                                            i14 = ((iM6984 ^ i13) * 30773) ^ 352671558;
                                                            i15 = 2074846358;
                                                        } else {
                                                            iM6984 = C0630.m2566("ۖ᩸") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * 21811) ^ 1299306126;
                                                            i15 = 1204158480;
                                                        }
                                                        break;
                                                    case -137257423:
                                                    case 1560790822:
                                                        if (C0798.f2919) {
                                                            iM6984 = (i12 - C0630.m2566("ۙۜ")) * 115;
                                                            i14 = ((iM6984 ^ i13) * 30773) ^ 352671558;
                                                            i15 = 2074846358;
                                                        } else {
                                                            iM6984 = (i12 - C2105.m6981("ᩴۛ")) * 37;
                                                            i14 = ((iM6984 ^ i13) * (-27645)) ^ 2030973875;
                                                            i15 = 277899605;
                                                        }
                                                        break;
                                                    case -44507644:
                                                    case 427297143:
                                                        return;
                                                    case 413615273:
                                                    case 2048587514:
                                                        if (C3746.f11829 <= 0) {
                                                            iM6984 = C0630.m2566("۬᩺") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * 10123) ^ (-1299317074);
                                                            i15 = -2134232081;
                                                        } else {
                                                            iM6984 = C2105.m6981("᩹ۛ") ^ i12;
                                                            i14 = ((iM6984 ^ i13) * 22091) ^ 114343459;
                                                            i15 = -1685934749;
                                                        }
                                                        break;
                                                    case 671890963:
                                                    case 1136053461:
                                                        if (C21923.f70183 == 0) {
                                                            iM6984 = (C0630.m2566("ܽܿ") ^ i13) * 109;
                                                            i14 = ((iM6984 ^ i12) * (-18159)) ^ (-10837609);
                                                            i15 = -730300138;
                                                        } else {
                                                            iM6984 = (C2105.m6981("ۤۤ") ^ i13) * (-19);
                                                            i14 = ((iM6984 ^ i12) * 1909) ^ (-1390311449);
                                                            i15 = 1673866945;
                                                        }
                                                        break;
                                                    case 1319713905:
                                                    case 2108381564:
                                                        if (C0714.f2697 >= 0) {
                                                            iM6984 = (C0630.m2566("ܽܿ") ^ i13) * 109;
                                                            i14 = ((iM6984 ^ i12) * (-18159)) ^ (-10837609);
                                                            i15 = -730300138;
                                                        } else {
                                                            iM6984 = C2105.m6981("ۙܺ") ^ i13;
                                                            i14 = ((iM6984 ^ i12) * 21113) ^ (-2096991964);
                                                            i15 = -633178465;
                                                        }
                                                        break;
                                                    case 1656950412:
                                                    case 1978144886:
                                                        C1420.m4913();
                                                        if (!C0382.m1848()) {
                                                            iM6984 = (C2105.m6981("ۖۢ") ^ i12) * (-81);
                                                            i14 = ((iM6984 ^ i13) * (-6425)) ^ (-370619338);
                                                            i15 = 1562705684;
                                                        } else {
                                                            iM6984 = (C2105.m6981("ۤۤ") ^ i13) * (-19);
                                                            i14 = ((iM6984 ^ i12) * 1909) ^ (-1390311449);
                                                            i15 = 1673866945;
                                                        }
                                                        break;
                                                    default:
                                                        if (C2105.f7037 != 0) {
                                                            iM6984 = (i12 - C0630.m2566("ۙۜ")) * 115;
                                                            i14 = ((iM6984 ^ i13) * 30773) ^ 352671558;
                                                            i15 = 2074846358;
                                                        } else {
                                                            iM6984 = (i12 - C2105.m6981("᩷֫")) * 29;
                                                            i14 = ((iM6984 ^ i13) * (-20885)) ^ 1063169644;
                                                            i15 = 1620237060;
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                    }));
                                }
                                iM6981 = C2105.m6981("ܺܺ") ^ i2;
                                i5 = (-1335873200) ^ ((iM6981 ^ i3) * (-13911));
                                i = 1209268791;
                                break;
                            }
                        }
                        iM6981 = C0630.m2566("ۛܿ") ^ i3;
                        i5 = 1444534731 ^ ((iM6981 ^ i2) * (-24697));
                        i = -697466840;
                    }
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
                default:
                    C2167.m7155();
                    C2958.m9034();
                    iM6981 = C2105.m6981("ܺܺ") ^ i2;
                    i5 = (-1335873200) ^ ((iM6981 ^ i3) * (-13911));
                    i = 1209268791;
                    i4 = i ^ iM6981;
                    i6 = i9;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x04e3 A[PHI: r1 r8 r9 r11 r17 r23 r24 r27 r28
      0x04e3: PHI (r1v6 int) = (r1v5 int), (r1v2 int), (r1v2 int), (r1v2 int) binds: [B:35:0x014b, B:101:0x04df, B:39:0x017d, B:14:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04e3: PHI (r8v22 l.᩵ۚۢ) = (r8v4 l.᩵ۚۢ), (r8v9 l.᩵ۚۢ), (r8v19 l.᩵ۚۢ), (r8v23 l.᩵ۚۢ) binds: [B:35:0x014b, B:101:0x04df, B:39:0x017d, B:14:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04e3: PHI (r9v4 com.google.android.material.textfield.TextInputLayout) = 
      (r9v2 com.google.android.material.textfield.TextInputLayout)
      (r9v3 com.google.android.material.textfield.TextInputLayout)
      (r9v2 com.google.android.material.textfield.TextInputLayout)
      (r9v2 com.google.android.material.textfield.TextInputLayout)
     binds: [B:35:0x014b, B:101:0x04df, B:39:0x017d, B:14:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04e3: PHI (r11v22 int) = (r11v4 int), (r11v6 int), (r11v16 int), (r11v23 int) binds: [B:35:0x014b, B:101:0x04df, B:39:0x017d, B:14:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04e3: PHI (r17v4 int) = (r17v2 int), (r17v2 int), (r17v3 int), (r17v2 int) binds: [B:35:0x014b, B:101:0x04df, B:39:0x017d, B:14:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04e3: PHI (r23v29 short[]) = (r23v7 short[]), (r23v12 short[]), (r23v23 short[]), (r23v30 short[]) binds: [B:35:0x014b, B:101:0x04df, B:39:0x017d, B:14:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04e3: PHI (r24v4 com.google.android.material.textfield.TextInputLayout[]) = 
      (r24v1 com.google.android.material.textfield.TextInputLayout[])
      (r24v2 com.google.android.material.textfield.TextInputLayout[])
      (r24v1 com.google.android.material.textfield.TextInputLayout[])
      (r24v1 com.google.android.material.textfield.TextInputLayout[])
     binds: [B:35:0x014b, B:101:0x04df, B:39:0x017d, B:14:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04e3: PHI (r27v22 android.content.DialogInterface$OnClickListener) = 
      (r27v1 android.content.DialogInterface$OnClickListener)
      (r27v6 android.content.DialogInterface$OnClickListener)
      (r27v16 android.content.DialogInterface$OnClickListener)
      (r27v23 android.content.DialogInterface$OnClickListener)
     binds: [B:35:0x014b, B:101:0x04df, B:39:0x017d, B:14:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04e3: PHI (r28v22 char) = (r28v1 char), (r28v6 char), (r28v16 char), (r28v23 char) binds: [B:35:0x014b, B:101:0x04df, B:39:0x017d, B:14:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
    
        if (l.C3019.f9544 < 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (l.RunnableC0588.f2309 < 0) goto L21;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(final View view) {
        int i;
        C19258 c19258;
        int iM6981;
        int i2;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int iM6983;
        int i6;
        int i7;
        int i8 = -2108428841;
        int i9 = C0483.f2088;
        int i10 = C3432.f10845;
        int iM2566 = (i10 - C0630.m2566("ܿܳ")) * 73;
        int i11 = ((iM2566 ^ i9) * 21789) ^ 1869548537;
        int i12 = iM2566 ^ 1268437691;
        String strM947 = null;
        String strM948 = null;
        String strM1959 = null;
        C19258 c19258M5912 = null;
        String strM12817 = null;
        int iM6984 = 0;
        char c = 0;
        DialogInterface.OnClickListener onClickListener = null;
        int iM2567 = 0;
        int i13 = 0;
        TextInputLayout[] textInputLayoutArr = null;
        short s = 0;
        TextInputLayout textInputLayout = null;
        TextInputLayout textInputLayout2 = null;
        TextInputLayout textInputLayout3 = null;
        short[] sArr = null;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i9) * (-22143)) >> 31));
            switch (i8) {
                case -2105415895:
                case 1838254588:
                    C2520.m8029(c19258M5912, C2105.m6981(C4075.m12252(sArr, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i14)) ^ 2118865007, null);
                    RunnableC0588.m2438(c19258M5912);
                    break;
                case -2065377105:
                case 883365050:
                    short[] sArr2 = sArr;
                    char c2 = c;
                    onClickListener = onClickListener;
                    i = i14;
                    C19258 c19259 = c19258M5912;
                    int i16 = i13 + i15;
                    short s2 = s;
                    int i17 = s2 + 3914;
                    if ((i17 * i17) - (i16 + i16) <= 0) {
                        iM6983 = C2105.m6981("ᩴ᩺") ^ i10;
                        i6 = ((iM6983 ^ i9) * (-5507)) ^ 818155351;
                        i7 = -1370267891;
                    } else {
                        iM6983 = (i10 - C2105.m6981("ۜ᩺")) * (-109);
                        i6 = ((iM6983 ^ i9) * 9545) ^ (-433081573);
                        i7 = -1113858606;
                    }
                    s = s2;
                    c19258M5912 = c19259;
                    sArr = sArr2;
                    c = c2;
                    i12 = iM6983 ^ i7;
                    i11 = i6;
                    i14 = i;
                    onClickListener = onClickListener;
                    break;
                case -2063548594:
                case 501887314:
                    break;
                case -1712421360:
                case -654363415:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    RunnableC0588.m2430(view, C4616.m13542(f54207, 79, 1, i));
                    if (C1504.f5354) {
                        iM6981 = (C0630.m2566("ۙ֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM6981 ^ i10) * 27557) ^ 1673038081;
                        i3 = 1260891648;
                    } else {
                        iM6981 = (i9 - C2105.m6981("᩸ۧ")) * (-51);
                        i2 = ((iM6981 ^ i10) * 7481) ^ 1946641102;
                        i3 = -1133645022;
                    }
                    i4 = iM6981 ^ i3;
                    c19258M5912 = c19258;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr3 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr3;
                    break;
                case -1503363019:
                case 1624794933:
                    if (C1711.f5919) {
                        sArr = sArr;
                        c = c;
                        onClickListener = onClickListener;
                        i = i14;
                        c19258 = c19258M5912;
                        iM6981 = C0630.m2566("ܽܶ") ^ i9;
                        i2 = ((iM6981 ^ i10) * 11193) ^ (-387320320);
                        i3 = -577008911;
                        i4 = iM6981 ^ i3;
                        c19258M5912 = c19258;
                        i14 = i;
                        onClickListener = onClickListener;
                        c = c;
                        short[] sArr4 = sArr;
                        i12 = i4;
                        i11 = i2;
                        sArr = sArr4;
                    }
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    iM6981 = (C0630.m2566("֫ۘ") + i10) * 67;
                    i2 = ((iM6981 ^ i9) * (-10899)) ^ (-2019545834);
                    i3 = 1838277235;
                    i4 = iM6981 ^ i3;
                    c19258M5912 = c19258;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr5 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr5;
                    break;
                case -1475716053:
                case 860794428:
                    C3683.m11222();
                    if (C0630.f2410 > 0) {
                        sArr = sArr;
                        c = c;
                        onClickListener = onClickListener;
                        i = i14;
                        c19258 = c19258M5912;
                        iM6981 = (C0630.m2566("ۙ֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM6981 ^ i10) * 27557) ^ 1673038081;
                        i3 = 1260891648;
                        i4 = iM6981 ^ i3;
                        c19258M5912 = c19258;
                        i14 = i;
                        onClickListener = onClickListener;
                        c = c;
                        short[] sArr6 = sArr;
                        i12 = i4;
                        i11 = i2;
                        sArr = sArr6;
                    }
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    iM6981 = (C0630.m2566("᩷֫") + i10) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i2 = ((iM6981 ^ i9) * 16079) ^ (-568624943);
                    i3 = -117576087;
                    i4 = iM6981 ^ i3;
                    c19258M5912 = c19258;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr7 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr7;
                    break;
                case -1451301361:
                case 830371782:
                    ViewOnClickListenerC1958.m6441(c19258M5912, 2098699828 ^ iM6984, onClickListener);
                    sArr = f54207;
                    if (C1916.f6442) {
                        int iM6985 = (C2105.m6981("۬ۙ") ^ i9) * 99;
                        i12 = iM6985 ^ (-935392093);
                        i11 = ((iM6985 ^ i10) * 24297) ^ (-1339666009);
                    } else {
                        i = i14;
                        c = c;
                        c19258 = c19258M5912;
                        int iM2568 = (C0630.m2566("ۖۤ") ^ i9) * 41;
                        i12 = iM2568 ^ (-1879104791);
                        i11 = ((iM2568 ^ i10) * (-30385)) ^ 2038693380;
                        c19258M5912 = c19258;
                        i14 = i;
                        c = c;
                        onClickListener = null;
                    }
                    break;
                case -1250434047:
                case 872478114:
                    m41498(view, strM947, strM948, strM1959);
                    break;
                case -1090929735:
                case 1651249178:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    if (C23343.m51757(strM948)) {
                        iM6981 = C2105.m6981("֨ܿ") ^ i10;
                        i2 = ((iM6981 ^ i9) * (-24619)) ^ 451396259;
                        i3 = -2057398519;
                    } else {
                        iM6981 = C2105.m6981("ܶ۫") ^ i9;
                        i2 = ((iM6981 ^ i10) * 22585) ^ (-1409591780);
                        i3 = -846175909;
                    }
                    i4 = iM6981 ^ i3;
                    c19258M5912 = c19258;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr8 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr8;
                    break;
                case -968050355:
                case -384749489:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    s = f54207[78];
                    i13 = s * s;
                    i15 = 15319396;
                    if (!C1916.f6442) {
                        sArr = sArr;
                        int iM2569 = (C0630.m2566("ۖۤ") ^ i9) * 41;
                        i12 = iM2569 ^ (-1879104791);
                        i11 = ((iM2569 ^ i10) * (-30385)) ^ 2038693380;
                        c19258M5912 = c19258;
                        i14 = i;
                        c = c;
                        onClickListener = null;
                    } else {
                        iM6981 = C2105.m6981("᩸ᩴ") ^ i9;
                        i2 = ((iM6981 ^ i10) * 14133) ^ (-2027491178);
                        i3 = 1539620944;
                        i4 = iM6981 ^ i3;
                        c19258M5912 = c19258;
                        i14 = i;
                        onClickListener = onClickListener;
                        c = c;
                        short[] sArr9 = sArr;
                        i12 = i4;
                        i11 = i2;
                        sArr = sArr9;
                    }
                    break;
                case -934420007:
                case -273828102:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    C0382.m1849(c19258, C2105.m6981(strM12817) ^ 2123543944);
                    if (C3245.f10203 <= 0) {
                        iM6981 = C0630.m2566("ܽܶ") ^ i9;
                        i2 = ((iM6981 ^ i10) * 11193) ^ (-387320320);
                        i3 = -577008911;
                    } else {
                        iM6981 = (C0630.m2566("ۛ۬") ^ i9) * 87;
                        i2 = ((iM6981 ^ i10) * 12889) ^ (-1768698923);
                        i3 = 775602766;
                    }
                    i4 = iM6981 ^ i3;
                    c19258M5912 = c19258;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr10 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr10;
                    break;
                case -863679031:
                case 45628267:
                    break;
                case -860347901:
                case -80751632:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    iM2567 = C0630.m2566(C0964.m3396(f54207, IShizukuService.Stub.TRANSACTION_isHidden, 3, i));
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C0630.m2566("֫ۘ") + i10) * 67;
                        i2 = ((iM6981 ^ i9) * (-10899)) ^ (-2019545834);
                        i3 = 1838277235;
                    } else {
                        iM6981 = C0630.m2566("ܳۙ") ^ i10;
                        i2 = ((iM6981 ^ i9) * 23111) ^ 2064839785;
                        i3 = -114414726;
                    }
                    i4 = iM6981 ^ i3;
                    c19258M5912 = c19258;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr11 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr11;
                    break;
                case -827217460:
                case 1842350649:
                    C2126.m7040();
                    break;
                case -784760850:
                case 915412723:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    if (C23343.m51758(strM947)) {
                        iM6981 = (C2105.m6981("֨ۤ") + i10) * 87;
                        i2 = ((iM6981 ^ i9) * 24811) ^ 2016275779;
                        i3 = -569285747;
                    } else {
                        iM6981 = (C0630.m2566("ۖۨ") + i9) * (-53);
                        i2 = ((iM6981 ^ i10) * (-15161)) ^ 610612554;
                        i3 = 2029389798;
                    }
                    i4 = iM6981 ^ i3;
                    c19258M5912 = c19258;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr12 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr12;
                    break;
                case -468813263:
                case 1911091498:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    EditText editTextM5905 = C1773.m5905(textInputLayout);
                    C2167.m7151(editTextM5905);
                    if (C1047.m3600(editTextM5905) < 4) {
                        iM6981 = C2105.m6981("ۧܽ") ^ i9;
                        i2 = ((iM6981 ^ i10) * (-5175)) ^ (-775476995);
                        i3 = -89874738;
                    } else {
                        iM6981 = (C0630.m2566("۬ܽ") ^ i10) * (-21);
                        i2 = ((iM6981 ^ i9) * 22461) ^ 111893101;
                        i3 = 1421129767;
                    }
                    i4 = iM6981 ^ i3;
                    c19258M5912 = c19258;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr13 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr13;
                    break;
                case -184838600:
                case 672831240:
                    AbstractC2021.m6571(textInputLayout2, C2105.m6981(C2520.m8030(f54207, 92, 3, i14)) ^ 2120367288);
                    break;
                case 152191020:
                case 1422850582:
                    C4075.m12263();
                    C3683.m11222();
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    iM6982 = C2105.m6981("ܳܶ") ^ i10;
                    i2 = ((iM6982 ^ i9) * (-12043)) ^ 1042240587;
                    i5 = -735419215;
                    i4 = iM6982 ^ i5;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr14 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr14;
                    break;
                case 243311635:
                case 2006466950:
                    RunnableC3474.m10621(textInputLayout3, C2105.m6981(C3537.m10748(f54207, 98, 3, i14)) ^ 2128951378);
                    break;
                case 313774381:
                case 1712533727:
                    RunnableC3474.m10621(textInputLayout2, C0630.m2566(C1128.m3841(f54207, 95, 3, i14)) ^ 2122805000);
                    break;
                case 346249839:
                case 1994935572:
                    RunnableC3474.m10621(textInputLayout2, C2105.m6981(C3663.m11162(f54207, 83, 3, i14)) ^ 2099194332);
                    break;
                case 370722732:
                case 2000771512:
                    RunnableC3474.m10621(textInputLayout, C0630.m2566(C1916.m6311(f54207, 89, 3, i14)) ^ 2118921897);
                    break;
                case 385279992:
                case 412312394:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    EditText editTextM2132 = C0483.m2132(textInputLayout);
                    C2167.m7151(editTextM2132);
                    strM947 = C0050.m947(C2958.m9028(editTextM2132));
                    if (C23343.m51759(strM947)) {
                        iM6981 = (C2105.m6981("ܿ᩹") + i9) * (-9);
                        i2 = ((iM6981 ^ i10) * 17137) ^ 1391273674;
                        i3 = 124714964;
                    } else {
                        iM6981 = C0630.m2566("ۖۙ") ^ i10;
                        i2 = ((iM6981 ^ i9) * (-18807)) ^ (-769596100);
                        i3 = -1559476665;
                    }
                    i4 = iM6981 ^ i3;
                    c19258M5912 = c19258;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr15 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr15;
                    break;
                case 457460387:
                case 1983146125:
                    i14 = 3049;
                    int iM25610 = C0630.m2566("֡ۙ") ^ i9;
                    i2 = ((iM25610 ^ i10) * 26137) ^ (-738236478);
                    i4 = iM25610 ^ 131913650;
                    c19258M5912 = c19258M5912;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr16 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr16;
                    break;
                case 467445177:
                case 560966420:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    textInputLayoutArr[c] = textInputLayout;
                    textInputLayout2 = this.f54209;
                    textInputLayoutArr[1] = textInputLayout2;
                    textInputLayout3 = this.f54210;
                    textInputLayoutArr[2] = textInputLayout3;
                    if (C0287.m1632(textInputLayoutArr)) {
                        iM6981 = (C0630.m2566("۟᩸") ^ i9) * (-121);
                        i2 = ((iM6981 ^ i10) * (-8135)) ^ (-304155630);
                        i3 = -1778949116;
                    } else {
                        iM6981 = (C0630.m2566("ᩳ۬") + i10) * (-3);
                        i2 = ((iM6981 ^ i9) * 7269) ^ 1851451437;
                        i3 = -1856910121;
                    }
                    i4 = iM6981 ^ i3;
                    c19258M5912 = c19258;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr17 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr17;
                    break;
                case 525805202:
                case 1528898156:
                    i14 = 60229;
                    int iM25611 = C0630.m2566("֡ۙ") ^ i9;
                    i2 = ((iM25611 ^ i10) * 26137) ^ (-738236478);
                    i4 = iM25611 ^ 131913650;
                    c19258M5912 = c19258M5912;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr18 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr18;
                    break;
                case 629160131:
                case 629609979:
                    RunnableC3474.m10621(textInputLayout, C0630.m2566(C4159.m12578(f54207, 80, 3, i14)) ^ 2128545063);
                    break;
                case 689465670:
                case 1278907988:
                    C7106.m19114(c19258M5912, iM2567 ^ 2104524587);
                    if (C4075.m12263() > 0) {
                        sArr = sArr;
                        int i18 = i14;
                        final String str = strM947;
                        onClickListener = onClickListener;
                        i = i18;
                        final String str2 = strM948;
                        c = c;
                        c19258 = c19258M5912;
                        final String str3 = strM1959;
                        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener(this) { // from class: l.ۧ֨ۡ

                            /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ ViewOnClickListenerC17720 f32077;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i19) {
                                String str4 = null;
                                String str5 = null;
                                int i20 = -1277068960;
                                int i21 = RunnableC0588.f2309;
                                int i22 = C3746.f11829;
                                int iM6986 = (C2105.m6981("ۘۧ") ^ i21) * (-61);
                                int i23 = ((iM6986 ^ i22) * 20799) ^ 161690936;
                                int i24 = -1108949795;
                                while (true) {
                                    i20 = ((((i20 ^ i22) * 14739) >> 31) & i23) ^ (iM6986 ^ i24);
                                    switch (i20) {
                                        case -2119178202:
                                        case 1407919674:
                                            C0714.m2805();
                                            if (C3537.f11231 >= 0) {
                                                iM6986 = (i21 - C0630.m2566("᩹ۢ")) * 45;
                                                i23 = ((iM6986 ^ i22) * (-6969)) ^ 350490393;
                                                i24 = 1031603372;
                                            } else {
                                                iM6986 = (C2105.m6981("֫᩹") + i21) * (-75);
                                                i23 = ((iM6986 ^ i22) * 2819) ^ 1313764075;
                                                i24 = -1509494033;
                                            }
                                            break;
                                        case -2112739688:
                                        case -501372468:
                                            C1773.m5908();
                                            if (C0050.f910 < 0) {
                                                iM6986 = C2105.m6981("ۘ۬") ^ i22;
                                                i23 = ((iM6986 ^ i21) * 9707) ^ 1761300644;
                                                i24 = -1857839826;
                                            } else {
                                                iM6986 = (C2105.m6981("֫᩹") + i21) * (-75);
                                                i23 = ((iM6986 ^ i22) * 2819) ^ 1313764075;
                                                i24 = -1509494033;
                                            }
                                            break;
                                        case -2110003927:
                                        case 2086847889:
                                            if (C1047.m3599() >= 0) {
                                                iM6986 = (i21 - C0630.m2566("᩹ۢ")) * 45;
                                                i23 = ((iM6986 ^ i22) * (-6969)) ^ 350490393;
                                                i24 = 1031603372;
                                            } else {
                                                iM6986 = C0630.m2566("ᩳۨ") ^ i21;
                                                i23 = ((iM6986 ^ i22) * (-18205)) ^ 1181008870;
                                                i24 = -559167881;
                                            }
                                            break;
                                        case -2018746785:
                                        case -936910222:
                                            if (RunnableC1108.f4040) {
                                                iM6986 = (C0630.m2566("ۤۨ") ^ i21) * (-69);
                                                i23 = ((iM6986 ^ i22) * (-27235)) ^ (-1821298641);
                                                i24 = -209972642;
                                            } else {
                                                iM6986 = C2105.m6981("ۙۡ") ^ i22;
                                                i23 = ((iM6986 ^ i21) * (-17599)) ^ (-527919690);
                                                i24 = -2067514879;
                                            }
                                            break;
                                        case -1942776009:
                                        case -1227870780:
                                            if (C2105.f7037 != 0) {
                                                iM6986 = C2105.m6981("ۙۡ") ^ i22;
                                                i23 = ((iM6986 ^ i21) * (-17599)) ^ (-527919690);
                                                i24 = -2067514879;
                                            } else {
                                                iM6986 = (i22 - C2105.m6981("᩶۟")) * (-27);
                                                i23 = ((iM6986 ^ i21) * 12569) ^ 896697043;
                                                i24 = 1327489935;
                                            }
                                            break;
                                        case -1515063908:
                                        case 1909326735:
                                            str4 = str2;
                                            str5 = str3;
                                            if (C2126.f7087) {
                                                iM6986 = C2105.m6981("ܽ۫") ^ i22;
                                                i23 = ((iM6986 ^ i21) * 20127) ^ 955524192;
                                                i24 = 892504465;
                                            } else {
                                                iM6986 = C0630.m2566("᩺֡") ^ i22;
                                                i23 = ((iM6986 ^ i21) * 5761) ^ (-1691135875);
                                                i24 = 595944570;
                                            }
                                            break;
                                        case -1402583256:
                                        case 1163859704:
                                            ViewOnClickListenerC17720.m41500(this.f32077, view, str, str4, str5);
                                            break;
                                        case -1323151823:
                                        case -140898593:
                                            C0964.m3413();
                                            C3746.m11369();
                                            iM6986 = (C2105.m6981("֫᩹") + i21) * (-75);
                                            i23 = ((iM6986 ^ i22) * 2819) ^ 1313764075;
                                            i24 = -1509494033;
                                            break;
                                        case -994792005:
                                        case 1752395427:
                                            if (C0050.f910 >= 0) {
                                                iM6986 = (C2105.m6981("֫᩹") + i21) * (-75);
                                                i23 = ((iM6986 ^ i22) * 2819) ^ 1313764075;
                                                i24 = -1509494033;
                                            } else {
                                                iM6986 = C2105.m6981("᩷᩻") ^ i22;
                                                i23 = ((iM6986 ^ i21) * (-1361)) ^ 1644607818;
                                                i24 = 448316304;
                                            }
                                            break;
                                        case -904306127:
                                        case 117621720:
                                            if (C4117.f13076 <= 0) {
                                                iM6986 = (C2105.m6981("֫᩹") + i21) * (-75);
                                                i23 = ((iM6986 ^ i22) * 2819) ^ 1313764075;
                                                i24 = -1509494033;
                                            } else {
                                                iM6986 = C2105.m6981("ۢ֨") ^ i21;
                                                i23 = ((iM6986 ^ i22) * (-3417)) ^ (-1039941191);
                                                i24 = 1373423323;
                                            }
                                            break;
                                        case -874767594:
                                        case 1196622605:
                                            if (C1047.f3863 >= 0) {
                                                iM6986 = C2105.m6981("ۙۡ") ^ i22;
                                                i23 = ((iM6986 ^ i21) * (-17599)) ^ (-527919690);
                                                i24 = -2067514879;
                                            } else {
                                                iM6986 = (i21 - C2105.m6981("֡ܿ")) * (-23);
                                                i23 = ((iM6986 ^ i22) * 23719) ^ (-917988937);
                                                i24 = -1881297211;
                                            }
                                            break;
                                        case 179015216:
                                        case 2018428052:
                                            if (C4263.f13799 <= 0) {
                                                iM6986 = (i21 - C0630.m2566("᩹ۢ")) * 45;
                                                i23 = ((iM6986 ^ i22) * (-6969)) ^ 350490393;
                                                i24 = 1031603372;
                                            } else {
                                                iM6986 = (i21 - C0630.m2566("ܰۘ")) * 127;
                                                i23 = ((iM6986 ^ i22) * (-11825)) ^ (-1720728531);
                                                i24 = 1447619929;
                                            }
                                            break;
                                        case 347641174:
                                        case 768048642:
                                            ViewOnClickListenerC1958.m6429();
                                            if (C3683.f11629 < 0) {
                                                iM6986 = C2105.m6981("ۙۡ") ^ i22;
                                                i23 = ((iM6986 ^ i21) * (-17599)) ^ (-527919690);
                                                i24 = -2067514879;
                                            } else {
                                                iM6986 = (C2105.m6981("֫᩹") + i21) * (-75);
                                                i23 = ((iM6986 ^ i22) * 2819) ^ 1313764075;
                                                i24 = -1509494033;
                                            }
                                            break;
                                        case 903414816:
                                        case 1555679529:
                                            if (C3019.f9544 >= 0) {
                                                iM6986 = C2105.m6981("ۘ۬") ^ i22;
                                                i23 = ((iM6986 ^ i21) * 9707) ^ 1761300644;
                                                i24 = -1857839826;
                                            } else {
                                                iM6986 = C2105.m6981("ᩴ᩺") ^ i22;
                                                i23 = ((iM6986 ^ i21) * 14809) ^ 426805253;
                                                i24 = -1396480942;
                                            }
                                            break;
                                        case 1156984494:
                                        case 1600624041:
                                            C3019.m9255();
                                            break;
                                        default:
                                            if (C7811.f24123 >= 0) {
                                                iM6986 = C2105.m6981("ܽ۫") ^ i22;
                                                i23 = ((iM6986 ^ i21) * 20127) ^ 955524192;
                                                i24 = 892504465;
                                            } else {
                                                iM6986 = C0630.m2566("᩹ۘ") ^ i22;
                                                i23 = ((iM6986 ^ i21) * (-9651)) ^ (-1331558571);
                                                i24 = 1819409834;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }

                            {
                                int i19 = -1498789595;
                                int i20 = C0630.f2410;
                                int i21 = ServiceConnectionC3453.f10921;
                                int iM6986 = C2105.m6981("֨ۧ") ^ i21;
                                int i22 = ((iM6986 ^ i20) * 2765) ^ (-1136597378);
                                int i23 = 1396714506;
                                while (true) {
                                    i19 = ((((i19 ^ i20) * (-31883)) >> 31) & i22) ^ (iM6986 ^ i23);
                                    switch (i19) {
                                        case -1941507712:
                                        case -465999690:
                                            C1773.m5908();
                                            throw new RuntimeException();
                                        case -1838387078:
                                        case -1631565891:
                                            return;
                                        case -1660081250:
                                        case 697631773:
                                            if (C1294.f4556 >= 0) {
                                                iM6986 = (C0630.m2566("᩻᩹") ^ i20) * 85;
                                                i22 = ((iM6986 ^ i21) * 27103) ^ (-249449138);
                                                i23 = -1847404936;
                                            } else {
                                                iM6986 = (i20 - C2105.m6981("ۙܿ")) * (-49);
                                                i22 = ((iM6986 ^ i21) * (-29433)) ^ 486688994;
                                                i23 = 1285308557;
                                            }
                                            break;
                                        case -1571534105:
                                        case 1843500919:
                                            if (C5695.f17556 >= 0) {
                                                iM6986 = C2105.m6981("ۧ᩶") ^ i20;
                                                i22 = ((iM6986 ^ i21) * 1489) ^ (-314844778);
                                                i23 = -161125259;
                                            } else {
                                                iM6986 = C2105.m6981("ۧܰ") ^ i20;
                                                i22 = ((iM6986 ^ i21) * 6001) ^ (-629631146);
                                                i23 = 143899650;
                                            }
                                            break;
                                        case -1395297444:
                                        case 2040833379:
                                            if (C4117.m12364() == 0) {
                                                iM6986 = C2105.m6981("ۜۡ") ^ i21;
                                                i22 = ((iM6986 ^ i20) * 28093) ^ 1896830035;
                                                i23 = -1986070069;
                                            } else {
                                                iM6986 = (C0630.m2566("᩻᩹") ^ i20) * 85;
                                                i22 = ((iM6986 ^ i21) * 27103) ^ (-249449138);
                                                i23 = -1847404936;
                                            }
                                            break;
                                        case -990814942:
                                        case -346403425:
                                            if (AbstractC2021.f6743 <= 0) {
                                                iM6986 = C2105.m6981("ۜۡ") ^ i21;
                                                i22 = ((iM6986 ^ i20) * 28093) ^ 1896830035;
                                                i23 = -1986070069;
                                            } else {
                                                iM6986 = C2105.m6981("ۜᩴ") ^ i20;
                                                i22 = ((iM6986 ^ i21) * (-753)) ^ (-1891437138);
                                                i23 = 1867428655;
                                            }
                                            break;
                                        case -972818495:
                                        case -944332431:
                                            if (C4117.f13076 <= 0) {
                                                iM6986 = (C0630.m2566("᩻᩹") ^ i20) * 85;
                                                i22 = ((iM6986 ^ i21) * 27103) ^ (-249449138);
                                                i23 = -1847404936;
                                            } else {
                                                iM6986 = C2105.m6981("᩸֡") ^ i21;
                                                i22 = ((iM6986 ^ i20) * (-13029)) ^ 307304902;
                                                i23 = -983446716;
                                            }
                                            break;
                                        case -940058762:
                                        case -548556946:
                                            if (C4159.f13567) {
                                                iM6986 = C2105.m6981("᩹ۖ") ^ i20;
                                                i22 = ((iM6986 ^ i21) * (-11831)) ^ (-1730934701);
                                                i23 = -1660586678;
                                            } else {
                                                iM6986 = (C0630.m2566("᩻᩹") ^ i20) * 85;
                                                i22 = ((iM6986 ^ i21) * 27103) ^ (-249449138);
                                                i23 = -1847404936;
                                            }
                                            break;
                                        case -560333289:
                                        case -527761858:
                                            if (C5695.f17556 >= 0) {
                                                iM6986 = (C0630.m2566("᩻᩹") ^ i20) * 85;
                                                i22 = ((iM6986 ^ i21) * 27103) ^ (-249449138);
                                                i23 = -1847404936;
                                            } else {
                                                iM6986 = (C0630.m2566("֨۬") + i21) * (-67);
                                                i22 = ((iM6986 ^ i20) * (-6053)) ^ 2065944974;
                                                i23 = 1025300626;
                                            }
                                            break;
                                        case -532763795:
                                        case -249792179:
                                            C0798.m2998();
                                            if (!C2272.m7503()) {
                                                iM6986 = C2105.m6981("ۧ᩶") ^ i20;
                                                i22 = ((iM6986 ^ i21) * 1489) ^ (-314844778);
                                                i23 = -161125259;
                                            } else {
                                                iM6986 = (C0630.m2566("᩻᩹") ^ i20) * 85;
                                                i22 = ((iM6986 ^ i21) * 27103) ^ (-249449138);
                                                i23 = -1847404936;
                                            }
                                            break;
                                        case -388990771:
                                        case 1780759679:
                                            if (RunnableC3474.f10992 <= 0) {
                                                iM6986 = C0630.m2566("ۤܳ") ^ i21;
                                                i22 = ((iM6986 ^ i20) * (-13217)) ^ 18518087;
                                                i23 = 501960946;
                                            } else {
                                                iM6986 = C0630.m2566("ۘ֨") ^ i21;
                                                i22 = ((iM6986 ^ i20) * 25007) ^ (-471727993);
                                                i23 = 671510914;
                                            }
                                            break;
                                        case -5667152:
                                        case 2016380858:
                                            C0630.m2564();
                                            if (!C1504.m5179()) {
                                                iM6986 = C0630.m2566("ۤܳ") ^ i21;
                                                i22 = ((iM6986 ^ i20) * (-13217)) ^ 18518087;
                                                i23 = 501960946;
                                            } else {
                                                iM6986 = C2105.m6981("ۧ᩶") ^ i20;
                                                i22 = ((iM6986 ^ i21) * 1489) ^ (-314844778);
                                                i23 = -161125259;
                                            }
                                            break;
                                        case 873839434:
                                        case 1701435198:
                                            C1773.m5908();
                                            C1420.m4913();
                                            iM6986 = (C0630.m2566("᩻᩹") ^ i20) * 85;
                                            i22 = ((iM6986 ^ i21) * 27103) ^ (-249449138);
                                            i23 = -1847404936;
                                            break;
                                        case 905884529:
                                        case 1827378541:
                                            if (C0050.f910 >= 0) {
                                                iM6986 = C0630.m2566("۬ۘ") ^ i21;
                                                i22 = ((iM6986 ^ i20) * (-12841)) ^ 1310162844;
                                                i23 = -1797738586;
                                            } else {
                                                iM6986 = C2105.m6981("᩷ۤ") ^ i21;
                                                i22 = ((iM6986 ^ i20) * 27193) ^ (-945531484);
                                                i23 = 1916045696;
                                            }
                                            break;
                                        case 1378061933:
                                        case 1623831700:
                                            if (ViewOnClickListenerC1958.m6429() >= 0) {
                                                iM6986 = C2105.m6981("ۧ᩶") ^ i20;
                                                i22 = ((iM6986 ^ i21) * 1489) ^ (-314844778);
                                                i23 = -161125259;
                                            } else {
                                                iM6986 = C2105.m6981("ۖܿ") ^ i20;
                                                i22 = ((iM6986 ^ i21) * (-25595)) ^ (-1176131150);
                                                i23 = -2077635976;
                                            }
                                            break;
                                        default:
                                            this.f32077 = this;
                                            if (C1005.f3721) {
                                                iM6986 = (C2105.m6981("᩵ۜ") + i21) * 55;
                                                i22 = ((iM6986 ^ i20) * (-3167)) ^ (-778616921);
                                                i23 = -2078867738;
                                            } else {
                                                iM6986 = C2105.m6981("ۜۡ") ^ i21;
                                                i22 = ((iM6986 ^ i20) * 28093) ^ 1896830035;
                                                i23 = -1986070069;
                                            }
                                            break;
                                    }
                                }
                            }
                        };
                        iM6984 = C2105.m6981(C4159.m12578(f54207, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 3, i));
                        if (C1047.m3599() >= 0) {
                            iM6981 = (C0630.m2566("֫ۘ") + i10) * 67;
                            i2 = ((iM6981 ^ i9) * (-10899)) ^ (-2019545834);
                            i3 = 1838277235;
                        } else {
                            iM6981 = (C0630.m2566("۬᩶") + i9) * 67;
                            i2 = ((iM6981 ^ i10) * 18861) ^ (-925429078);
                            i3 = 1459679137;
                        }
                        i4 = iM6981 ^ i3;
                        c19258M5912 = c19258;
                        i14 = i;
                        onClickListener = onClickListener;
                        c = c;
                        short[] sArr19 = sArr;
                        i12 = i4;
                        i11 = i2;
                        sArr = sArr19;
                    } else {
                        i = i14;
                        c = c;
                        c19258 = c19258M5912;
                        int iM25612 = (C0630.m2566("ۖۤ") ^ i9) * 41;
                        i12 = iM25612 ^ (-1879104791);
                        i11 = ((iM25612 ^ i10) * (-30385)) ^ 2038693380;
                        c19258M5912 = c19258;
                        i14 = i;
                        c = c;
                        onClickListener = null;
                    }
                    break;
                case 810187446:
                case 1754353529:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    EditText editTextM2133 = C0483.m2132(textInputLayout3);
                    C0714.m2808(editTextM2133);
                    strM1959 = C0422.m1959(C2958.m9028(editTextM2133));
                    if (C23343.m51755(strM1959)) {
                        iM6981 = (i9 - C2105.m6981("ܳۡ")) * 27;
                        i2 = ((iM6981 ^ i10) * 25703) ^ 621780100;
                        i3 = 1503179065;
                    } else {
                        iM6981 = (C0630.m2566("ۡܳ") + i10) * (-23);
                        i2 = ((iM6981 ^ i9) * 29509) ^ (-717419368);
                        i3 = -864010068;
                    }
                    i4 = iM6981 ^ i3;
                    c19258M5912 = c19258;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr110 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr110;
                    break;
                case 821512102:
                case 1158282276:
                    sArr = sArr;
                    c19258 = c19258M5912;
                    onClickListener = onClickListener;
                    i = i14;
                    TextInputLayout[] textInputLayoutArr2 = new TextInputLayout[3];
                    textInputLayout = this.f54208;
                    if (C22628.m50615() == 0) {
                        int iM6986 = (C2105.m6981("ᩳۘ") + i10) * (-83);
                        textInputLayoutArr = textInputLayoutArr2;
                        i11 = ((iM6986 ^ i9) * 23489) ^ (-1132416761);
                        c19258M5912 = c19258;
                        sArr = sArr;
                        c = 0;
                        i12 = iM6986 ^ 1384563088;
                        i14 = i;
                        onClickListener = onClickListener;
                    } else {
                        textInputLayoutArr = textInputLayoutArr2;
                        c = 0;
                        iM6981 = (C0630.m2566("֫ۘ") + i10) * 67;
                        i2 = ((iM6981 ^ i9) * (-10899)) ^ (-2019545834);
                        i3 = 1838277235;
                        i4 = iM6981 ^ i3;
                        c19258M5912 = c19258;
                        i14 = i;
                        onClickListener = onClickListener;
                        c = c;
                        short[] sArr111 = sArr;
                        i12 = i4;
                        i11 = i2;
                        sArr = sArr111;
                    }
                    break;
                case 1264608905:
                case 1910789556:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    EditText editTextM2134 = C0483.m2132(textInputLayout2);
                    C0714.m2808(editTextM2134);
                    if (C1047.m3600(editTextM2134) < 7) {
                        iM6981 = C0630.m2566("ۧܺ") ^ i9;
                        i2 = ((iM6981 ^ i10) * (-7997)) ^ (-1932815053);
                        i3 = -1446263260;
                    } else {
                        iM6981 = C0630.m2566("ۡ֨") ^ i10;
                        i2 = ((iM6981 ^ i9) * 2557) ^ (-509348818);
                        i3 = -1383603579;
                    }
                    i4 = iM6981 ^ i3;
                    c19258M5912 = c19258;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr112 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr112;
                    break;
                case 1413057393:
                case 1433637415:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258M5912 = C1773.m5912(this.f54211);
                    strM12817 = C4263.m12817(f54207, 101, 3, i);
                    if (C2958.m9034() <= 0) {
                        iM6982 = C2105.m6981("ܳܶ") ^ i10;
                        i2 = ((iM6982 ^ i9) * (-12043)) ^ 1042240587;
                        i5 = -735419215;
                    } else {
                        iM6982 = C2105.m6981("᩸᩶") ^ i10;
                        i2 = ((iM6982 ^ i9) * 20545) ^ 1805098550;
                        i5 = 2103112719;
                    }
                    i4 = iM6982 ^ i5;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr113 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr113;
                    break;
                case 1631508986:
                case 1950819929:
                    C3683.m11222();
                    break;
                default:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c19258 = c19258M5912;
                    EditText editTextM2135 = C0483.m2132(textInputLayout2);
                    C2167.m7151(editTextM2135);
                    strM948 = C0050.m947(C4117.m12350(editTextM2135));
                    short[] sArr20 = f54207;
                    if (C3537.f11231 >= 0) {
                        iM6981 = (C0630.m2566("᩷֫") + i10) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i2 = ((iM6981 ^ i9) * 16079) ^ (-568624943);
                        i3 = -117576087;
                    } else if (new C4427(C2126.m7036(sArr20, 86, 3, i)).m13149((CharSequence) strM948)) {
                        iM6981 = (i10 - C2105.m6981("֡ܰ")) * 17;
                        i2 = ((iM6981 ^ i9) * (-18669)) ^ 1217517198;
                        i3 = 777480705;
                    } else {
                        iM6981 = C2105.m6981("ۡ᩶") ^ i9;
                        i2 = ((iM6981 ^ i10) * (-8537)) ^ 47084209;
                        i3 = -1118852692;
                    }
                    i4 = iM6981 ^ i3;
                    c19258M5912 = c19258;
                    i14 = i;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr114 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr114;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01b7 A[PHI: r7 r9 r10 r11
      0x01b7: PHI (r7v4 com.google.android.material.textfield.TextInputLayout) = 
      (r7v2 com.google.android.material.textfield.TextInputLayout)
      (r7v2 com.google.android.material.textfield.TextInputLayout)
      (r7v3 com.google.android.material.textfield.TextInputLayout)
      (r7v2 com.google.android.material.textfield.TextInputLayout)
     binds: [B:50:0x01b5, B:40:0x0151, B:30:0x00ec, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r9v5 int) = (r9v4 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:50:0x01b5, B:40:0x0151, B:30:0x00ec, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r10v5 int) = (r10v2 int), (r10v4 int), (r10v2 int), (r10v2 int) binds: [B:50:0x01b5, B:40:0x0151, B:30:0x00ec, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r11v5 java.lang.String) = (r11v2 java.lang.String), (r11v2 java.lang.String), (r11v4 java.lang.String), (r11v2 java.lang.String) binds: [B:50:0x01b5, B:40:0x0151, B:30:0x00ec, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x03f1 A[PHI: r8 r14 r19 r20
      0x03f1: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:94:0x03ef, B:86:0x039a, B:62:0x023d] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r14v4 char) = (r14v2 char), (r14v3 char), (r14v2 char) binds: [B:94:0x03ef, B:86:0x039a, B:62:0x023d] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r19v7 com.google.android.material.textfield.TextInputLayout) = 
      (r19v2 com.google.android.material.textfield.TextInputLayout)
      (r19v4 com.google.android.material.textfield.TextInputLayout)
      (r19v8 com.google.android.material.textfield.TextInputLayout)
     binds: [B:94:0x03ef, B:86:0x039a, B:62:0x023d] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r20v5 short[]) = (r20v3 short[]), (r20v4 short[]), (r20v3 short[]) binds: [B:94:0x03ef, B:86:0x039a, B:62:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41499(C13136 c13136, View view, ViewOnClickListenerC17720 viewOnClickListenerC17720, String str, String str2, C23881 c23881) {
        int iM6981;
        int i;
        int iM6982;
        int i2;
        int i3;
        TextInputLayout textInputLayout;
        int iM6983;
        int i4;
        int iM2566;
        int i5;
        int i6;
        ViewOnClickListenerC17720 viewOnClickListenerC17721 = viewOnClickListenerC17720;
        C23881 c23882 = c23881;
        int i7 = C4263.f13799;
        int i8 = C11340.f33930;
        int iM6984 = C2105.m6981("᩷۫") ^ i8;
        int i9 = ((iM6984 ^ i7) * (-21433)) ^ (-1659496510);
        String strM12355 = null;
        String strM11162 = null;
        String strM1840 = null;
        short[] sArr = null;
        int i10 = iM6984 ^ 1140523373;
        TextInputLayout textInputLayout2 = null;
        int iM49333 = 0;
        int iM2567 = 0;
        int iM2568 = 0;
        int iM2569 = 0;
        char c = 0;
        int i11 = 0;
        int i12 = -438641693;
        TextInputLayout textInputLayout3 = null;
        int i13 = 0;
        while (true) {
            i12 = i10 ^ (i9 & (((i12 ^ i7) * 25563) >> 31));
            switch (i12) {
                case -1947645031:
                case 1151229534:
                    textInputLayout2 = textInputLayout2;
                    short s = sArr[c];
                    if ((s * 17612) - ((s * s) + 77545636) <= 0) {
                        iM6981 = (i7 - C2105.m6981("᩻ۗ")) * 23;
                        i9 = (-1614833296) ^ ((iM6981 ^ i8) * (-12737));
                        i = -1320900396;
                    } else {
                        iM6981 = C0630.m2566("ۚܶ") ^ i8;
                        i9 = 420886080 ^ ((iM6981 ^ i7) * (-32759));
                        i = 1652559195;
                    }
                    int i14 = iM6981 ^ i;
                    c23882 = c23881;
                    textInputLayout2 = textInputLayout2;
                    i10 = i14;
                    viewOnClickListenerC17721 = viewOnClickListenerC17720;
                    break;
                case -1941717905:
                case 157390203:
                    textInputLayout = viewOnClickListenerC17721.f54208;
                    strM12355 = C4117.m12355(f54207, 57, 6, i11);
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM6983 = C0630.m2566("ۖۛ") ^ i7;
                        i9 = ((iM6983 ^ i8) * 601) ^ 701209540;
                        i4 = -322603143;
                    } else {
                        iM6983 = (C2105.m6981("ۤܽ") + i7) * 51;
                        i9 = ((iM6983 ^ i8) * 13449) ^ 1447502628;
                        i4 = 451302498;
                    }
                    i10 = iM6983 ^ i4;
                    viewOnClickListenerC17721 = viewOnClickListenerC17720;
                    textInputLayout2 = textInputLayout;
                    c23882 = c23881;
                    break;
                case -1747837691:
                case -1043542521:
                    textInputLayout2 = textInputLayout2;
                    if (C22628.f73083 <= 0) {
                        iM6981 = C0630.m2566("ᩴ᩸") ^ i8;
                        i9 = (-168585582) ^ ((iM6981 ^ i7) * (-3341));
                        i = -1943350797;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ܰ᩺")) * 83;
                        i9 = (-122665411) ^ ((iM6981 ^ i8) * (-24523));
                        i = -736829955;
                    }
                    int i15 = iM6981 ^ i;
                    c23882 = c23881;
                    textInputLayout2 = textInputLayout2;
                    i10 = i15;
                    viewOnClickListenerC17721 = viewOnClickListenerC17720;
                    break;
                case -1416199624:
                case -163573457:
                    AbstractC2021.m6571(textInputLayout2, 2099375451 ^ iM2568);
                    C8058 c8058 = C8058.f24861;
                    break;
                case -1362135607:
                case 234343554:
                    ServiceConnectionC3453.m10564();
                    C1005.m3501();
                    break;
                case -1358055228:
                case 763648263:
                    textInputLayout2 = textInputLayout2;
                    if (C0630.f2410 <= 0) {
                        iM6981 = C0630.m2566("ۖۖ") ^ i8;
                        i9 = 1682924199 ^ ((iM6981 ^ i7) * 29039);
                        i = 2061862965;
                    } else {
                        iM6981 = (C2105.m6981("۫֫") + i8) * 123;
                        i9 = 1879415537 ^ ((iM6981 ^ i7) * 32493);
                        i = 342456691;
                    }
                    int i16 = iM6981 ^ i;
                    c23882 = c23881;
                    textInputLayout2 = textInputLayout2;
                    i10 = i16;
                    viewOnClickListenerC17721 = viewOnClickListenerC17720;
                    break;
                case -1336440568:
                case -915792700:
                    textInputLayout3 = viewOnClickListenerC17721.f54210;
                    strM1840 = C0382.m1840(f54207, 72, 3, i11);
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i8;
                        i5 = ((iM2566 ^ i7) * (-20559)) ^ 751285081;
                        i6 = -1650953893;
                    } else {
                        iM2566 = (C0630.m2566("ۖۤ") ^ i8) * (-3);
                        i5 = ((iM2566 ^ i7) * (-1857)) ^ (-36433319);
                        i6 = -1389753407;
                    }
                    i10 = iM2566 ^ i6;
                    i9 = i5;
                    break;
                case -1336391598:
                case 1609890873:
                    iM2567 = C0630.m2566(C2520.m8030(f54207, 66, 3, i11));
                    if (C0798.m2998() != 0) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i8;
                        i5 = ((iM2566 ^ i7) * (-20559)) ^ 751285081;
                        i6 = -1650953893;
                    } else {
                        iM2566 = C0630.m2566("᩷֫") ^ i8;
                        i5 = ((iM2566 ^ i7) * 23437) ^ 677390618;
                        i6 = 1838143078;
                    }
                    i10 = iM2566 ^ i6;
                    i9 = i5;
                    break;
                case -1214447216:
                case 61459300:
                    C1711.m5736();
                    textInputLayout2 = textInputLayout2;
                    iM6981 = C0630.m2566("ۖۖ") ^ i8;
                    i9 = 1682924199 ^ ((iM6981 ^ i7) * 29039);
                    i = 2061862965;
                    int i17 = iM6981 ^ i;
                    c23882 = c23881;
                    textInputLayout2 = textInputLayout2;
                    i10 = i17;
                    viewOnClickListenerC17721 = viewOnClickListenerC17720;
                    break;
                case -1180251314:
                case -607173036:
                    RunnableC3474.m10621(textInputLayout2, 2122558323 ^ iM2567);
                    C8058 c8059 = C8058.f24861;
                    break;
                case -1177403470:
                case -418992629:
                    textInputLayout2 = textInputLayout2;
                    iM49333 = C21923.m49333(c23881);
                    if (iM49333 != 1000) {
                        iM6982 = C2105.m6981("᩷۬") ^ i7;
                        i2 = ((iM6982 ^ i8) * 12053) ^ (-1050048125);
                        i3 = 1768854607;
                    } else {
                        iM6982 = C2105.m6981("ۜ۬") ^ i7;
                        i2 = ((iM6982 ^ i8) * (-28427)) ^ 1006379839;
                        i3 = 1806175873;
                    }
                    TextInputLayout textInputLayout4 = textInputLayout2;
                    i10 = iM6982 ^ i3;
                    i9 = i2;
                    textInputLayout2 = textInputLayout4;
                    break;
                case -1165380698:
                case -404662799:
                    C3663.m11161(i13);
                    C3663.m11167(viewOnClickListenerC17721.f54212);
                    new ViewOnClickListenerC0059(viewOnClickListenerC17721.f54211, str, str2, null);
                    break;
                case -1110768709:
                case 1692967885:
                    if (iM49333 != 1100) {
                        iM2566 = C2105.m6981("۬᩶") ^ i7;
                        i5 = ((iM2566 ^ i8) * (-4661)) ^ 1034403625;
                        i6 = 1128452206;
                    } else {
                        iM2566 = C0630.m2566("᩻᩶") ^ i8;
                        i5 = ((iM2566 ^ i7) * (-17511)) ^ (-230414085);
                        i6 = 490960035;
                    }
                    i10 = iM2566 ^ i6;
                    i9 = i5;
                    break;
                case -982949677:
                case 1212011286:
                    iM2568 = C0630.m2566(C3746.m11357(f54207, 69, 3, i11));
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i8;
                        i5 = ((iM2566 ^ i7) * (-20559)) ^ 751285081;
                        i6 = -1650953893;
                    } else {
                        iM2566 = C0630.m2566("ۢܽ") ^ i7;
                        i5 = ((iM2566 ^ i8) * 29325) ^ (-689752620);
                        i6 = -1038293860;
                    }
                    i10 = iM2566 ^ i6;
                    i9 = i5;
                    break;
                case -661027692:
                case 128680441:
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i8;
                        i5 = ((iM2566 ^ i7) * (-20559)) ^ 751285081;
                        i6 = -1650953893;
                    } else {
                        iM2566 = (C0630.m2566("᩸ۤ") ^ i7) * (-27);
                        i5 = ((iM2566 ^ i8) * 15547) ^ (-841086324);
                        i6 = 2052118960;
                    }
                    i10 = iM2566 ^ i6;
                    i9 = i5;
                    break;
                case -511052351:
                case -308293677:
                    textInputLayout2 = textInputLayout2;
                    strM11162 = C3663.m11162(f54207, 63, 3, i11);
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6982 = C2105.m6981("ۡ᩸") ^ i8;
                        i2 = ((iM6982 ^ i7) * 2777) ^ 712785278;
                        i3 = -373987055;
                        TextInputLayout textInputLayout5 = textInputLayout2;
                        i10 = iM6982 ^ i3;
                        i9 = i2;
                        textInputLayout2 = textInputLayout5;
                    } else {
                        iM6981 = C0630.m2566("ᩴ᩸") ^ i8;
                        i9 = (-168585582) ^ ((iM6981 ^ i7) * (-3341));
                        i = -1943350797;
                        int i18 = iM6981 ^ i;
                        c23882 = c23881;
                        textInputLayout2 = textInputLayout2;
                        i10 = i18;
                        viewOnClickListenerC17721 = viewOnClickListenerC17720;
                    }
                    break;
                case -462242968:
                case 45743200:
                    i11 = 32172;
                    iM6981 = (i7 - C0630.m2566("۟ܰ")) * (-121);
                    i9 = 1467189699 ^ ((iM6981 ^ i8) * 21219);
                    i = -862248146;
                    int i19 = iM6981 ^ i;
                    c23882 = c23881;
                    textInputLayout2 = textInputLayout2;
                    i10 = i19;
                    viewOnClickListenerC17721 = viewOnClickListenerC17720;
                    break;
                case -456924089:
                case 1372388186:
                    textInputLayout2 = textInputLayout2;
                    sArr = f54207;
                    c = '8';
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("ᩴ᩸") ^ i8;
                        i9 = (-168585582) ^ ((iM6981 ^ i7) * (-3341));
                        i = -1943350797;
                    } else {
                        iM6981 = (C0630.m2566("֫ۧ") + i8) * (-55);
                        i9 = (-1152142313) ^ ((iM6981 ^ i7) * (-32057));
                        i = -517792511;
                    }
                    int i110 = iM6981 ^ i;
                    c23882 = c23881;
                    textInputLayout2 = textInputLayout2;
                    i10 = i110;
                    viewOnClickListenerC17721 = viewOnClickListenerC17720;
                    break;
                case -322055134:
                case 229120811:
                    C21374.m48460(AbstractC2021.m6563(c23882, 2116813762 ^ iM2569));
                    break;
                case -292398950:
                case 1236444786:
                    RunnableC3474.m10630();
                    if (C3019.f9544 < 0) {
                        iM2566 = (C0630.m2566("᩸ۤ") ^ i7) * (-27);
                        i5 = ((iM2566 ^ i8) * 15547) ^ (-841086324);
                        i6 = 2052118960;
                        i10 = iM2566 ^ i6;
                        i9 = i5;
                    } else {
                        textInputLayout2 = textInputLayout2;
                        iM6981 = C0630.m2566("ۖۖ") ^ i8;
                        i9 = 1682924199 ^ ((iM6981 ^ i7) * 29039);
                        i = 2061862965;
                        int i111 = iM6981 ^ i;
                        c23882 = c23881;
                        textInputLayout2 = textInputLayout2;
                        i10 = i111;
                        viewOnClickListenerC17721 = viewOnClickListenerC17720;
                    }
                    break;
                case -282258318:
                case 1953392209:
                    TextInputLayout textInputLayout6 = textInputLayout2;
                    RunnableC0588.m2430(c23882, strM12355);
                    C3911.m11920(c13136);
                    C22628.m50613(view, true);
                    if (C1773.m5916(c23881)) {
                        int iM6985 = (C2105.m6981("ۡۛ") + i7) * (-15);
                        textInputLayout2 = textInputLayout6;
                        i10 = iM6985 ^ 51609329;
                        i9 = ((iM6985 ^ i8) * 2753) ^ (-1251843444);
                    } else {
                        int iM6986 = C2105.m6981("۬ܳ") ^ i8;
                        i9 = ((iM6986 ^ i7) * 19217) ^ (-383355974);
                        textInputLayout2 = textInputLayout6;
                        i10 = iM6986 ^ 858543344;
                    }
                    c23882 = c23881;
                    break;
                case -25805361:
                case 1033871770:
                    int iM25610 = C0630.m2566(strM11162) ^ 2118951463;
                    if (C0798.f2919) {
                        i13 = iM25610;
                        textInputLayout2 = textInputLayout2;
                        iM6981 = C0630.m2566("ۖۖ") ^ i8;
                        i9 = 1682924199 ^ ((iM6981 ^ i7) * 29039);
                        i = 2061862965;
                        int i112 = iM6981 ^ i;
                        c23882 = c23881;
                        textInputLayout2 = textInputLayout2;
                        i10 = i112;
                        viewOnClickListenerC17721 = viewOnClickListenerC17720;
                    } else {
                        int iM6987 = (i8 - C2105.m6981("ۜ᩵")) * (-61);
                        i9 = ((iM6987 ^ i7) * 18205) ^ (-652765750);
                        i10 = iM6987 ^ (-928764913);
                        i13 = iM25610;
                    }
                    break;
                case 137643625:
                case 1476638795:
                    if (C4616.f14690 > 0) {
                        textInputLayout = textInputLayout2;
                        iM6983 = C0630.m2566("ۖۛ") ^ i7;
                        i9 = ((iM6983 ^ i8) * 601) ^ 701209540;
                        i4 = -322603143;
                        i10 = iM6983 ^ i4;
                        viewOnClickListenerC17721 = viewOnClickListenerC17720;
                        textInputLayout2 = textInputLayout;
                        c23882 = c23881;
                    } else {
                        iM2566 = (C0630.m2566("᩸ۤ") ^ i7) * (-27);
                        i5 = ((iM2566 ^ i8) * 15547) ^ (-841086324);
                        i6 = 2052118960;
                        i10 = iM2566 ^ i6;
                        i9 = i5;
                    }
                    break;
                case 777326059:
                case 1514741196:
                    AbstractC2021.m6571(textInputLayout3, C2105.m6981(strM1840) ^ 2128003516);
                    C8058 c80510 = C8058.f24861;
                    break;
                case 1563526706:
                case 1916551908:
                    if (iM49333 != 1003) {
                        iM2566 = C2105.m6981("ۜ֫") ^ i7;
                        i5 = ((iM2566 ^ i8) * 32257) ^ (-2049425875);
                        i6 = -1986531108;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ܽۢ")) * 37;
                        i5 = ((iM2566 ^ i7) * 9447) ^ (-1566987496);
                        i6 = 1822383712;
                    }
                    i10 = iM2566 ^ i6;
                    i9 = i5;
                    break;
                case 1674880431:
                case 1998456908:
                    iM2569 = C0630.m2566(C1504.m5177(f54207, 75, 3, i11));
                    if (!C11340.m28031()) {
                        textInputLayout = textInputLayout2;
                        iM6983 = C0630.m2566("ۖۛ") ^ i7;
                        i9 = ((iM6983 ^ i8) * 601) ^ 701209540;
                        i4 = -322603143;
                        i10 = iM6983 ^ i4;
                        viewOnClickListenerC17721 = viewOnClickListenerC17720;
                        textInputLayout2 = textInputLayout;
                        c23882 = c23881;
                    } else {
                        iM2566 = C0630.m2566("۠۬") ^ i7;
                        i5 = ((iM2566 ^ i8) * (-8407)) ^ 1083654865;
                        i6 = -661577466;
                        i10 = iM2566 ^ i6;
                        i9 = i5;
                    }
                    break;
                default:
                    i11 = 13306;
                    iM6981 = (i7 - C0630.m2566("۟ܰ")) * (-121);
                    i9 = 1467189699 ^ ((iM6981 ^ i8) * 21219);
                    i = -862248146;
                    int i113 = iM6981 ^ i;
                    c23882 = c23881;
                    textInputLayout2 = textInputLayout2;
                    i10 = i113;
                    viewOnClickListenerC17721 = viewOnClickListenerC17720;
                    break;
            }
            return;
        }
    }
}
