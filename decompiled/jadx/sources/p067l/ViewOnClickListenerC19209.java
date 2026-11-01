package p067l;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳ֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5KF */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC19209 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩴۛۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f82294 = {6113, -9458, -9460, -9445, -9466, -9447, -9466, -9445, -9450, -9469, -9472, -9464, -9466, -9471, -9429, -9466, -9458, -9469, -9472, -9464, -27171, -23149, -29204, -21711, 18246, 17728, -9463, -9466, -9471, -9461, -9415, -9466, -9462, -9448, -9427, -9450, -9434, -9461, -9401, -9407, -9407, -9407, -9402, -17106, 19272, 19740, 23395, -16833, 21111, -31309, 22244, -17300, 2287, 19224, 17813, -17478, 9700, 32222, 32201, 32223, 32217, 32192, 32216, 9688, -5857, -6585, 6805, 3361, -17, -4124, 2940, 7951, 2300, 7275, -4287, 12876, -4272, 6442, 1517, 2975, 31850, 27228, -25213, -29494, -31346, -28153, 2997, 2957, 3010, 21092, 25700, 29406, 22334, -27417, 32300, 27749, -29116, 29815, -30021, -31190, -26461, 27227, -25796, 31775, -27378, 25607, 28385, -29402, 20891, -26783, 21216, 21288, 23776};

    /* JADX INFO: renamed from: ۗ */
    public final TextInputLayout f57399;

    /* JADX INFO: renamed from: ۙ */
    public final TextInputLayout f57400;

    /* JADX INFO: renamed from: ᩶ */
    public final TextInputLayout f57401;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractActivityC5549 f57402;

    /* JADX INFO: renamed from: ᩹ */
    public final DialogInterfaceC2564 f57403;

    /* JADX WARN: Code duplicated, block: B:43:0x01eb A[PHI: r11
      0x01eb: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:104:0x01eb, B:42:0x01e9, B:106:0x01eb, B:15:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC19209(AbstractActivityC5549 abstractActivityC5549, DialogInterfaceC2564 dialogInterfaceC2564) {
        short[] sArr;
        int i;
        short[] sArr2;
        View view;
        View view2;
        int iM55979;
        int i2;
        short[] sArr3;
        int i3;
        View view3;
        int i4;
        int i5;
        int i6;
        int iM55680;
        int iM55681;
        int i7;
        this = this;
        final DialogInterfaceC2564 dialogInterfaceC2565 = dialogInterfaceC2564;
        int i8 = C1071.f81975;
        int i9 = C0967.f81910;
        short s = f82294[0];
        int i10 = ((s * s) + 261889489) - (s * 32366) < 0 ? 58810 : 56175;
        RunnableC0871.m55661(abstractActivityC5549, C0873.m55689(f82294, 1, 8, i10));
        RunnableC0871.m55661(dialogInterfaceC2565, C0955.m56029(f82294, 9, 11, i10));
        int iM559710 = (i9 - C0946.m55979("۬ܰ")) * 55;
        View view4 = null;
        DialogInterface.OnCancelListener onCancelListener = null;
        EditText editTextM55882 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int iM559711 = 0;
        int i11 = 0;
        View viewM56465 = null;
        int i12 = 0;
        int i13 = -243019660;
        TextInputLayout textInputLayout = null;
        int i14 = ((iM559710 ^ i8) * (-8831)) ^ (-353618971);
        View viewM56466 = null;
        C20671 c20671 = null;
        String strM56132 = null;
        short[] sArr6 = null;
        int iM55682 = 0;
        int iM55683 = 0;
        int iM55684 = 0;
        int i15 = iM559710 ^ (-1042656465);
        TextInputLayout textInputLayout2 = null;
        View viewM56181 = null;
        TextInputLayout textInputLayout3 = null;
        String strM56558 = null;
        while (true) {
            i13 = i15 ^ (i14 & (((i13 ^ i8) * (-19873)) >> 31));
            switch (i13) {
                case -2132754553:
                case -1620277062:
                    View viewM56467 = C1404.m56465(viewM56181, C0873.m55680(strM56132) ^ 2124144895);
                    C0947.m55988(viewM56467, strM56558);
                    int iM559712 = C0946.m55979("۫ۙ") ^ i9;
                    view4 = viewM56467;
                    i15 = iM559712 ^ 544869;
                    i14 = ((iM559712 ^ i8) * 27925) ^ (-631740193);
                    break;
                case -2110452588:
                case 682019948:
                    View view5 = viewM56465;
                    sArr = sArr6;
                    i = i12;
                    view2 = viewM56181;
                    view = view5;
                    sArr2 = sArr4;
                    iM55683 = C0873.m55680(ServiceConnectionC1013.m56161(sArr2, 23, 3, i10));
                    i11 = 2125684180;
                    if (C0930.f81879 <= 0) {
                        iM55680 = (i9 - C0873.m55680("ܺܺ")) * (-15);
                        i6 = ((iM55680 ^ i8) * (-18101)) ^ (-1839010492);
                        i5 = -511436778;
                    } else {
                        iM55680 = C0873.m55680("ܽܺ") ^ i8;
                        i6 = ((iM55680 ^ i9) * 17795) ^ (-1819537627);
                        i5 = -1583706439;
                    }
                    int i16 = iM55680 ^ i5;
                    sArr4 = sArr2;
                    i12 = i;
                    i15 = i16;
                    dialogInterfaceC2565 = dialogInterfaceC2564;
                    short[] sArr7 = sArr;
                    i14 = i6;
                    viewM56181 = view2;
                    viewM56465 = view;
                    sArr6 = sArr7;
                    break;
                case -2081408636:
                case 160128255:
                    C0912.m55833();
                    iM55681 = (C0946.m55979("ۖۘ") + i9) * (-103);
                    i14 = (-413262997) ^ ((iM55681 ^ i8) * 18613);
                    i7 = 745404989;
                    i15 = i7 ^ iM55681;
                    dialogInterfaceC2565 = dialogInterfaceC2564;
                    break;
                case -2027833372:
                case 669154394:
                    viewM56465 = C1404.m56465(viewM56181, iM55683 ^ i11);
                    sArr6 = f82294;
                    i12 = 26;
                    if (C0927.f81875) {
                        iM55681 = (C0946.m55979("ۖۘ") + i9) * (-103);
                        i14 = (-413262997) ^ ((iM55681 ^ i8) * 18613);
                        i7 = 745404989;
                    } else {
                        iM55681 = C0873.m55680("᩺ۢ") ^ i9;
                        i14 = 67518597 ^ ((iM55681 ^ i8) * 15177);
                        i7 = -2088350560;
                    }
                    i15 = i7 ^ iM55681;
                    dialogInterfaceC2565 = dialogInterfaceC2564;
                    break;
                case -1951796776:
                case -1107430282:
                    viewM56466 = C1404.m56465(viewM56181, iM55684 ^ 2122293776);
                    if (!C0947.f81895) {
                        iM55979 = C0873.m55680("ܶۚ") ^ i9;
                        i14 = ((iM55979 ^ i8) * 16989) ^ 1484372040;
                        i2 = -810798917;
                        i15 = iM55979 ^ i2;
                    } else {
                        sArr3 = sArr6;
                        i3 = i12;
                        view3 = viewM56465;
                        int iM559713 = (C0946.m55979("۬ۧ") + i8) * (-55);
                        i4 = ((iM559713 ^ i9) * 23873) ^ (-1595422695);
                        i15 = 1935060715 ^ iM559713;
                        i12 = i3;
                        viewM56465 = view3;
                        sArr6 = sArr3;
                        i14 = i4;
                        dialogInterfaceC2565 = dialogInterfaceC2564;
                    }
                    break;
                case -1951644289:
                case -325867710:
                    textInputLayout3 = (TextInputLayout) view4;
                    this.f57400 = textInputLayout3;
                    sArr5 = f82294;
                    if (ViewOnClickListenerC0939.m55941() < 0) {
                        iM55979 = C0873.m55680("֫ۙ") ^ i8;
                        i14 = ((iM55979 ^ i9) * (-10663)) ^ 679710716;
                        i2 = 693273747;
                        i15 = iM55979 ^ i2;
                    } else {
                        sArr3 = sArr6;
                        i3 = i12;
                        view3 = viewM56465;
                        int iM559714 = (C0946.m55979("۬ۧ") + i8) * (-55);
                        i4 = ((iM559714 ^ i9) * 23873) ^ (-1595422695);
                        i15 = 1935060715 ^ iM559714;
                        i12 = i3;
                        viewM56465 = view3;
                        sArr6 = sArr3;
                        i14 = i4;
                        dialogInterfaceC2565 = dialogInterfaceC2564;
                    }
                    break;
                case -1849028109:
                case 1215928823:
                    View viewM55755 = C0892.m55755(viewM56181, iM55682);
                    C0947.m55988(viewM55755, strM56558);
                    textInputLayout2 = (TextInputLayout) viewM55755;
                    this.f57401 = textInputLayout2;
                    if (!C0882.f81846) {
                        iM55979 = (C0873.m55680("ܿ֫") + i9) * 79;
                        i14 = ((iM55979 ^ i8) * (-20203)) ^ 1972195799;
                        i2 = -1271654691;
                        i15 = iM55979 ^ i2;
                    } else {
                        sArr3 = sArr6;
                        i3 = i12;
                        view3 = viewM56465;
                        int iM559715 = (C0946.m55979("۬ۧ") + i8) * (-55);
                        i4 = ((iM559715 ^ i9) * 23873) ^ (-1595422695);
                        i15 = 1935060715 ^ iM559715;
                        i12 = i3;
                        viewM56465 = view3;
                        sArr6 = sArr3;
                        i14 = i4;
                        dialogInterfaceC2565 = dialogInterfaceC2564;
                    }
                    break;
                case -1513009574:
                case 820107202:
                    if (C0892.f81851) {
                        iM55979 = (C0946.m55979("ۙܰ") ^ i9) * (-41);
                        i14 = ((iM55979 ^ i8) * 25951) ^ (-1245781952);
                        i2 = 558421729;
                    } else {
                        iM55979 = C0873.m55680("֡ܿ") ^ i8;
                        i14 = ((iM55979 ^ i9) * (-5447)) ^ (-2026204700);
                        i2 = -1022344631;
                    }
                    i15 = iM55979 ^ i2;
                    break;
                case -1407912515:
                case -483521974:
                    iM55684 = C0873.m55680(C1048.m56318(f82294, 49, 3, i10));
                    iM55979 = C0946.m55979("ᩴۚ") ^ i8;
                    i14 = ((iM55979 ^ i9) * (-27127)) ^ 1573018028;
                    i2 = -1391389186;
                    i15 = iM55979 ^ i2;
                    break;
                case -1041418273:
                case 74728970:
                    sArr3 = sArr6;
                    i3 = i12;
                    short[] sArr8 = sArr4;
                    view3 = viewM56465;
                    View view6 = viewM56181;
                    this.f57402 = abstractActivityC5549;
                    iM559711 = C0946.m55979(C0967.m56077(f82294, 20, 3, i10));
                    if (C1229.f82066 >= 0) {
                        sArr4 = sArr8;
                        viewM56181 = view6;
                        int iM559716 = (C0946.m55979("۬ۧ") + i8) * (-55);
                        i4 = ((iM559716 ^ i9) * 23873) ^ (-1595422695);
                        i15 = 1935060715 ^ iM559716;
                        i12 = i3;
                        viewM56465 = view3;
                        sArr6 = sArr3;
                    } else {
                        int iM55685 = C0873.m55680("۠᩸") ^ i8;
                        i4 = ((iM55685 ^ i9) * (-12179)) ^ 1236264139;
                        sArr4 = sArr8;
                        i12 = i3;
                        viewM56181 = view6;
                        viewM56465 = view3;
                        i15 = iM55685 ^ 863733310;
                        sArr6 = sArr3;
                    }
                    i14 = i4;
                    dialogInterfaceC2565 = dialogInterfaceC2564;
                    break;
                case -799235652:
                case 858139413:
                    strM56132 = C1003.m56132(f82294, 43, 3, i10);
                    if (C1036.f81953 < 0) {
                        iM55979 = (C0946.m55979("ۖܶ") ^ i8) * (-41);
                        i14 = ((iM55979 ^ i9) * (-22799)) ^ 4770569;
                        i2 = 1290580135;
                        i15 = iM55979 ^ i2;
                    } else {
                        iM55681 = (C0946.m55979("ۖۘ") + i9) * (-103);
                        i14 = (-413262997) ^ ((iM55681 ^ i8) * 18613);
                        i7 = 745404989;
                        i15 = i7 ^ iM55681;
                        dialogInterfaceC2565 = dialogInterfaceC2564;
                    }
                    break;
                case -682474043:
                case 136429404:
                    short[] sArr9 = sArr6;
                    int i17 = i12;
                    strM56558 = C1929.m56558(sArr9, i17, 17, i10);
                    View view7 = viewM56465;
                    C0947.m55988(view7, strM56558);
                    TextInputLayout textInputLayout4 = (TextInputLayout) view7;
                    this.f57399 = textInputLayout4;
                    int iM55686 = (C0873.m55680("ۧۘ") + i9) * (-87);
                    int i18 = ((iM55686 ^ i8) * (-8243)) ^ 844785952;
                    int i19 = iM55686 ^ (-1181561992);
                    i12 = i17;
                    textInputLayout = textInputLayout4;
                    sArr6 = sArr9;
                    i14 = i18;
                    dialogInterfaceC2565 = dialogInterfaceC2564;
                    viewM56465 = view7;
                    i15 = i19;
                    break;
                case -657455573:
                case 266988765:
                    iM55682 = C0873.m55680(C1017.m56189(sArr5, 46, 3, i10)) ^ 2129100544;
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0946.m55979("ۙܰ") ^ i9) * (-41);
                        i14 = ((iM55979 ^ i8) * 25951) ^ (-1245781952);
                        i2 = 558421729;
                    } else {
                        iM55979 = (i8 - C0946.m55979("۫֫")) * 47;
                        i14 = ((iM55979 ^ i9) * 21773) ^ 779474336;
                        i2 = 1412227735;
                    }
                    i15 = iM55979 ^ i2;
                    break;
                case -647053842:
                case -63530981:
                    C0967.m56074();
                    C0894.m55769();
                    throw new RuntimeException();
                case -567991880:
                case 1874098790:
                    C1025.m56230();
                    if (C0906.f81862 < 0) {
                        sArr = sArr6;
                        i = i12;
                        sArr2 = sArr4;
                        view = viewM56465;
                        view2 = viewM56181;
                        iM55680 = (i9 - C0873.m55680("ܺܺ")) * (-15);
                        i6 = ((iM55680 ^ i8) * (-18101)) ^ (-1839010492);
                        i5 = -511436778;
                        int i110 = iM55680 ^ i5;
                        sArr4 = sArr2;
                        i12 = i;
                        i15 = i110;
                        dialogInterfaceC2565 = dialogInterfaceC2564;
                        short[] sArr10 = sArr;
                        i14 = i6;
                        viewM56181 = view2;
                        viewM56465 = view;
                        sArr6 = sArr10;
                    } else {
                        iM55979 = (C0946.m55979("ۙܰ") ^ i9) * (-41);
                        i14 = ((iM55979 ^ i8) * 25951) ^ (-1245781952);
                        i2 = 558421729;
                        i15 = iM55979 ^ i2;
                    }
                    break;
                case -441767625:
                case 21427593:
                    if (RunnableC1014.f81941 > 0) {
                        iM55979 = (C0946.m55979("ۙܰ") ^ i9) * (-41);
                        i14 = ((iM55979 ^ i8) * 25951) ^ (-1245781952);
                        i2 = 558421729;
                        i15 = iM55979 ^ i2;
                    } else {
                        iM55681 = (C0946.m55979("ۖۘ") + i9) * (-103);
                        i14 = (-413262997) ^ ((iM55681 ^ i8) * 18613);
                        i7 = 745404989;
                        i15 = i7 ^ iM55681;
                        dialogInterfaceC2565 = dialogInterfaceC2564;
                    }
                    break;
                case -389690496:
                case 1561303001:
                    C0866.m55659(c20671, false);
                    onCancelListener = new DialogInterface.OnCancelListener() { // from class: l.֫֨ۡ
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            dialogInterfaceC2565.m3862();
                        }
                    };
                    if (C0898.f81858 > 0) {
                        iM55979 = (i8 - C0946.m55979("֡ۖ")) * (-55);
                        i14 = ((iM55979 ^ i9) * (-24789)) ^ (-952807688);
                        i2 = 515565512;
                        i15 = iM55979 ^ i2;
                    } else {
                        iM55681 = (C0946.m55979("ۖۘ") + i9) * (-103);
                        i14 = (-413262997) ^ ((iM55681 ^ i8) * 18613);
                        i7 = 745404989;
                        i15 = i7 ^ iM55681;
                        dialogInterfaceC2565 = dialogInterfaceC2564;
                    }
                    break;
                case -343565903:
                case 364951398:
                    sArr3 = sArr6;
                    i3 = i12;
                    view3 = viewM56465;
                    viewM56181 = C1017.m56181(abstractActivityC5549, iM559711 ^ 2117738536);
                    sArr4 = f82294;
                    if (C1929.m56553()) {
                        int iM559717 = (C0946.m55979("۬ۧ") + i8) * (-55);
                        i4 = ((iM559717 ^ i9) * 23873) ^ (-1595422695);
                        i15 = 1935060715 ^ iM559717;
                        i12 = i3;
                        viewM56465 = view3;
                        sArr6 = sArr3;
                        i14 = i4;
                    } else {
                        int iM55687 = (C0873.m55680("᩻۫") + i9) * (-75);
                        i12 = i3;
                        viewM56465 = view3;
                        sArr6 = sArr3;
                        i14 = ((iM55687 ^ i8) * (-11823)) ^ (-1152021236);
                        i15 = iM55687 ^ 1029702936;
                    }
                    dialogInterfaceC2565 = dialogInterfaceC2564;
                    break;
                case 431382177:
                case 1252811157:
                    C7050.m16226(editTextM55882);
                    C2641.m4029(textInputLayout);
                    C2641.m4029(textInputLayout3);
                    C2641.m4029(textInputLayout2);
                    return;
                case 1019855347:
                case 1141382795:
                    C1048.m56304(viewM56466, this);
                    int i20 = DialogInterfaceC2564.f4230;
                    c20671 = new C20671(abstractActivityC5549);
                    C0882.m55725(c20671, viewM56181);
                    iM55979 = (C0873.m55680("ܿ᩺") ^ i9) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i14 = ((iM55979 ^ i8) * 10387) ^ (-844957366);
                    i2 = -784488296;
                    i15 = iM55979 ^ i2;
                    break;
                default:
                    c20671.m46713(onCancelListener);
                    DialogInterfaceC2564 dialogInterfaceC2564M55669 = RunnableC0871.m55669(c20671);
                    this.f57403 = dialogInterfaceC2564M55669;
                    C7204.m16545(dialogInterfaceC2564M55669);
                    editTextM55882 = C0930.m55882(textInputLayout);
                    iM55979 = C0873.m55680("ܺ֫") ^ i8;
                    i14 = ((iM55979 ^ i9) * 5849) ^ 769685353;
                    i2 = 1057842640;
                    i15 = iM55979 ^ i2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43746(ViewOnClickListenerC19209 viewOnClickListenerC19209, View view, String str, String str2, String str3) {
        int i = 2109950204;
        int i2 = C0906.f81862;
        int i3 = C1028.f81950;
        int iM55979 = C0946.m55979("ۧۙ") ^ i3;
        int i4 = ((iM55979 ^ i2) * 20901) ^ 2111832217;
        int i5 = 1645815445;
        while (true) {
            i = ((((i ^ i2) * 16661) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2127537824:
                case -1759907125:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0873.m55680("᩺ۨ") ^ i2) * 25;
                        i4 = ((iM55979 ^ i3) * 27923) ^ (-96872274);
                        i5 = 1221813167;
                    } else {
                        iM55979 = (C0873.m55680("ܶܿ") ^ i3) * 37;
                        i4 = ((iM55979 ^ i2) * 2023) ^ 921587868;
                        i5 = 1091832653;
                    }
                    break;
                case -2105374454:
                case 2103839326:
                    if (C1025.m56230()) {
                        iM55979 = (C0873.m55680("ܺۜ") + i2) * 81;
                        i4 = ((iM55979 ^ i3) * (-23101)) ^ 1370208484;
                        i5 = 344327350;
                    } else {
                        iM55979 = (C0873.m55680("ܺۘ") + i2) * (-61);
                        i4 = ((iM55979 ^ i3) * 1257) ^ 694122875;
                        i5 = 387393585;
                    }
                    break;
                case -1930518320:
                case -1824352910:
                    if (C0866.m55645()) {
                        iM55979 = C0946.m55979("᩺ܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 24013) ^ (-2039072163);
                        i5 = 1748466772;
                    } else {
                        iM55979 = (C0873.m55680("᩺֡") + i2) * (-77);
                        i4 = ((iM55979 ^ i3) * (-8351)) ^ 92937445;
                        i5 = 741779765;
                    }
                    break;
                case -1905487380:
                case 1076666797:
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0946.m55979("᩹۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25785)) ^ (-1209411383);
                        i5 = 1425409760;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ܶᩴ")) * (-49);
                        i4 = ((iM55979 ^ i3) * (-32467)) ^ 109942746;
                        i5 = 48427325;
                    }
                    break;
                case -1671289071:
                case 1828378092:
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("᩹۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25785)) ^ (-1209411383);
                        i5 = 1425409760;
                    } else {
                        iM55979 = (C0873.m55680("ۤ۬") + i2) * (-67);
                        i4 = ((iM55979 ^ i3) * 17725) ^ (-37975400);
                        i5 = -1556345259;
                    }
                    break;
                case -1623892769:
                case 255851856:
                    if (C0890.f81849 != 0) {
                        iM55979 = (C0873.m55680("᩺ۨ") ^ i2) * 25;
                        i4 = ((iM55979 ^ i3) * 27923) ^ (-96872274);
                        i5 = 1221813167;
                    } else {
                        iM55979 = C0946.m55979("᩵ۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28483) ^ 2084070328;
                        i5 = 1875461317;
                    }
                    break;
                case -1508817466:
                case 250415282:
                    viewOnClickListenerC19209.m43744(view, str, str2, str3);
                    break;
                case -808648690:
                case -278402861:
                    C0947.m55997();
                    break;
                case 79737506:
                case 1186294327:
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("᩺֡") + i2) * (-77);
                        i4 = ((iM55979 ^ i3) * (-8351)) ^ 92937445;
                        i5 = 741779765;
                    } else {
                        iM55979 = C0873.m55680("᩵᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1071)) ^ 931495440;
                        i5 = -1607203366;
                    }
                    break;
                case 152254247:
                case 1086373380:
                    if (C1025.m56230()) {
                        iM55979 = (C0873.m55680("ۢۖ") + i3) * (-73);
                        i4 = ((iM55979 ^ i2) * (-24265)) ^ 1981664177;
                        i5 = 1678142417;
                    } else {
                        iM55979 = (C0946.m55979("ۜ᩵") ^ i3) * (-59);
                        i4 = ((iM55979 ^ i2) * (-25787)) ^ 2077628642;
                        i5 = -977610496;
                    }
                    break;
                case 411041332:
                case 1358148178:
                    C0861.m55626();
                    iM55979 = (C0873.m55680("ۢۖ") + i3) * (-73);
                    i4 = ((iM55979 ^ i2) * (-24265)) ^ 1981664177;
                    i5 = 1678142417;
                    break;
                case 841774466:
                case 1415268212:
                    if (C1017.m56187() <= 0) {
                        iM55979 = (C0873.m55680("᩺ۨ") ^ i2) * 25;
                        i4 = ((iM55979 ^ i3) * 27923) ^ (-96872274);
                        i5 = 1221813167;
                    } else {
                        iM55979 = (C0873.m55680("ۢۖ") + i3) * (-73);
                        i4 = ((iM55979 ^ i2) * (-24265)) ^ 1981664177;
                        i5 = 1678142417;
                    }
                    break;
                case 1108042965:
                case 1969098019:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("ܺۜ") + i2) * 81;
                        i4 = ((iM55979 ^ i3) * (-23101)) ^ 1370208484;
                        i5 = 344327350;
                    } else {
                        iM55979 = (C0873.m55680("ۢۖ") + i3) * (-73);
                        i4 = ((iM55979 ^ i2) * (-24265)) ^ 1981664177;
                        i5 = 1678142417;
                    }
                    break;
                case 1450748415:
                case 1570946282:
                    if (C0898.m55800() <= 0) {
                        iM55979 = C0946.m55979("᩹۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25785)) ^ (-1209411383);
                        i5 = 1425409760;
                    } else {
                        iM55979 = C0946.m55979("ۡۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-737)) ^ (-1304354508);
                        i5 = -1152136505;
                    }
                    break;
                case 1958425255:
                case 1988933035:
                    if (C0946.f81894 != 0) {
                        iM55979 = C0946.m55979("᩹۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25785)) ^ (-1209411383);
                        i5 = 1425409760;
                    } else {
                        iM55979 = (C0873.m55680("᩺ۨ") ^ i2) * 25;
                        i4 = ((iM55979 ^ i3) * 27923) ^ (-96872274);
                        i5 = 1221813167;
                    }
                    break;
                default:
                    if (C0967.f81910 >= 0) {
                        iM55979 = (C0873.m55680("᩺֡") + i2) * (-77);
                        i4 = ((iM55979 ^ i3) * (-8351)) ^ 92937445;
                        i5 = 741779765;
                    } else {
                        iM55979 = (C0873.m55680("֡۬") + i2) * (-105);
                        i4 = ((iM55979 ^ i3) * (-25561)) ^ (-1842325870);
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
    /* JADX INFO: renamed from: ֫ */
    private final void m43744(final View view, final String str, final String str2, final String str3) {
        int iM55979;
        int i;
        int i2 = C0989.f81920;
        int i3 = C1964.f83032;
        int iM559710 = C0946.m55979("ۡۤ") ^ i3;
        short[] sArr = null;
        int i4 = iM559710 ^ (-394770021);
        int i5 = ((iM559710 ^ i2) * (-18969)) ^ 1284097935;
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
                    iM55979 = C0946.m55979("ۗ᩹") ^ i3;
                    i5 = (-54868071) ^ ((iM55979 ^ i2) * 15201);
                    i = 1243261236;
                    i4 = i ^ iM55979;
                    i6 = i9;
                    break;
                case -1888648043:
                case 1566215014:
                    if (C0882.f81846) {
                        iM55979 = C0946.m55979("ᩴۘ") ^ i2;
                        i5 = 1555573427 ^ ((iM55979 ^ i3) * (-26715));
                        i = 837853573;
                    } else {
                        iM55979 = C0946.m55979("᩷᩹") ^ i3;
                        i5 = 1257128058 ^ ((iM55979 ^ i2) * 12481);
                        i = -455276146;
                    }
                    i4 = i ^ iM55979;
                    i6 = i9;
                    break;
                case -1808460389:
                case -641429042:
                    C1229.m56410();
                    if (RunnableC0871.f81839 < 0) {
                        iM55979 = C0946.m55979("ܺܺ") ^ i2;
                        i5 = (-1335873200) ^ ((iM55979 ^ i3) * (-13911));
                        i = 1209268791;
                    } else {
                        iM55979 = C0873.m55680("᩹ۤ") ^ i3;
                        i5 = 320477866 ^ ((iM55979 ^ i2) * (-5113));
                        i = -665140294;
                    }
                    i4 = i ^ iM55979;
                    i6 = i9;
                    break;
                case -1232723996:
                case -1120811040:
                    ServiceConnectionC1013.m56157();
                    break;
                case -1179401077:
                case 1945193369:
                    i8 = 9378;
                    iM55979 = C0946.m55979("ۗ᩹") ^ i3;
                    i5 = (-54868071) ^ ((iM55979 ^ i2) * 15201);
                    i = 1243261236;
                    i4 = i ^ iM55979;
                    i6 = i9;
                    break;
                case -893007218:
                case -566535106:
                    int i10 = s + s2;
                    if ((i10 * i10) - i7 >= 0) {
                        iM55979 = (i3 - C0873.m55680("᩶֡")) * 99;
                        i5 = 700819871 ^ ((iM55979 ^ i2) * 3571);
                        i = -1501755279;
                    } else {
                        iM55979 = (C0946.m55979("ܿᩳ") ^ i2) * (-53);
                        i5 = 671502413 ^ ((iM55979 ^ i3) * 15291);
                        i = -1093095573;
                    }
                    i4 = i ^ iM55979;
                    i6 = i9;
                    break;
                case -784514673:
                case 1442816739:
                    sArr = f82294;
                    c = '4';
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0946.m55979("ۛܶ") ^ i2;
                        i5 = (-1830012086) ^ ((iM55979 ^ i3) * 22449);
                        i = 1628902583;
                    } else {
                        iM55979 = C0873.m55680("֨۫") ^ i2;
                        i5 = 1765620915 ^ ((iM55979 ^ i3) * (-1683));
                        i = -1521912137;
                    }
                    i4 = i ^ iM55979;
                    i6 = i9;
                    break;
                case -577006757:
                case -232815275:
                    if (C0892.f81851) {
                        iM55979 = C0946.m55979("۟ۨ") ^ i2;
                        i5 = (-381525911) ^ ((iM55979 ^ i3) * (-1613));
                        i = -2132603771;
                    } else {
                        iM55979 = C0946.m55979("ᩴۘ") ^ i2;
                        i5 = 1555573427 ^ ((iM55979 ^ i3) * (-26715));
                        i = 837853573;
                    }
                    i4 = i ^ iM55979;
                    i6 = i9;
                    break;
                case -482317739:
                case 1975586299:
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("ᩴۘ") ^ i2;
                        i5 = 1555573427 ^ ((iM55979 ^ i3) * (-26715));
                        i = 837853573;
                    } else {
                        iM55979 = C0873.m55680("۟᩷") ^ i3;
                        i5 = 860896563 ^ ((iM55979 ^ i2) * (-9219));
                        i = -537243091;
                    }
                    i4 = i ^ iM55979;
                    i6 = i9;
                    break;
                case -477209329:
                case 880204052:
                    C1929.m56553();
                    if (C0930.m55885() > 0) {
                        iM55979 = C0873.m55680("᩹ۤ") ^ i3;
                        i5 = 320477866 ^ ((iM55979 ^ i2) * (-5113));
                        i = -665140294;
                    } else {
                        iM55979 = C0946.m55979("ۛܶ") ^ i2;
                        i5 = (-1830012086) ^ ((iM55979 ^ i3) * 22449);
                        i = 1628902583;
                    }
                    i4 = i ^ iM55979;
                    i6 = i9;
                    break;
                case -367412298:
                case 1271345241:
                    if (C0927.m55873() <= 0) {
                        iM55979 = C0946.m55979("ᩴۘ") ^ i2;
                        i5 = 1555573427 ^ ((iM55979 ^ i3) * (-26715));
                        i = 837853573;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۘ᩻")) * (-23);
                        i5 = (-1964580722) ^ ((iM55979 ^ i3) * 31531);
                        i = 1990084993;
                    }
                    i4 = i ^ iM55979;
                    i6 = i9;
                    break;
                case -306512174:
                case -174813311:
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("ܺܺ") ^ i2;
                        i5 = (-1335873200) ^ ((iM55979 ^ i3) * (-13911));
                        i = 1209268791;
                    } else {
                        iM55979 = C0946.m55979("ᩴۘ") ^ i2;
                        i5 = 1555573427 ^ ((iM55979 ^ i3) * (-26715));
                        i = 837853573;
                    }
                    i4 = i ^ iM55979;
                    i6 = i9;
                    break;
                case -249258309:
                case 1349196387:
                    s = sArr[c];
                    i7 = s * 37756;
                    s2 = 9439;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("ۛܿ") ^ i3;
                        i5 = 1444534731 ^ ((iM55979 ^ i2) * (-24697));
                        i = -697466840;
                    } else {
                        iM55979 = C0873.m55680("᩶֨") ^ i3;
                        i5 = (-703614890) ^ ((iM55979 ^ i2) * (-3695));
                        i = -337943761;
                    }
                    i4 = i ^ iM55979;
                    i6 = i9;
                    break;
                case 212895738:
                case 2147041621:
                    C1964.m56595(view, false);
                    AbstractActivityC5549 abstractActivityC5549 = this.f57402;
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("᩹ۤ") ^ i3;
                        i5 = 320477866 ^ ((iM55979 ^ i2) * (-5113));
                        i = -665140294;
                    } else {
                        short[] sArr2 = f82294;
                        if (C1012.m56134() > 0) {
                            int iM559711 = C0946.m55979(C0861.m55618(sArr2, 53, 3, i8)) ^ 2126366423;
                            if (C1229.f82066 < 0) {
                                final C14853 c14853 = new C14853(abstractActivityC5549, iM559711);
                                C0898.m55803(c14853);
                                final ?? r21 = new InterfaceC11360() { // from class: l.ܽ֨ۡ
                                    {
                                        int i11 = -1984954347;
                                        int i12 = C1003.f81929;
                                        int i13 = C0912.f81867;
                                        int iM55680 = C0873.m55680("ۚ۬") ^ i13;
                                        int i14 = ((iM55680 ^ i12) * (-1113)) ^ (-390950896);
                                        int i15 = -1427641583;
                                        while (true) {
                                            i11 = ((((i11 ^ i12) * 27531) >> 31) & i14) ^ (iM55680 ^ i15);
                                            switch (i11) {
                                                case -2006265621:
                                                case -959913507:
                                                    if (C1071.m56343() == 0) {
                                                        iM55680 = C0873.m55680("֫ۗ") ^ i13;
                                                        i14 = ((iM55680 ^ i12) * 30499) ^ (-1175427859);
                                                        i15 = -1078874102;
                                                    } else {
                                                        iM55680 = (C0946.m55979("ۤۨ") ^ i13) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i14 = ((iM55680 ^ i12) * 15699) ^ 10085197;
                                                        i15 = 1878673189;
                                                    }
                                                    break;
                                                case -1970242817:
                                                case -1388725924:
                                                    if (C0949.f81897 >= 0) {
                                                        iM55680 = C0873.m55680("ᩳۢ") ^ i12;
                                                        i14 = ((iM55680 ^ i13) * (-22725)) ^ (-1171384032);
                                                        i15 = -565635435;
                                                    } else {
                                                        iM55680 = (C0873.m55680("ۢ᩻") + i12) * 39;
                                                        i14 = ((iM55680 ^ i13) * (-8301)) ^ 864009791;
                                                        i15 = 571972622;
                                                    }
                                                    break;
                                                case -1852551704:
                                                case -104354072:
                                                    if (C0892.f81851) {
                                                        iM55680 = C0946.m55979("ۘ۬") ^ i12;
                                                        i14 = ((iM55680 ^ i13) * (-12085)) ^ (-175227274);
                                                        i15 = 961729114;
                                                    } else {
                                                        iM55680 = C0873.m55680("ᩳۢ") ^ i12;
                                                        i14 = ((iM55680 ^ i13) * (-22725)) ^ (-1171384032);
                                                        i15 = -565635435;
                                                    }
                                                    break;
                                                case -1800438411:
                                                case 1761455632:
                                                    AbstractC0942.m55971();
                                                    throw new RuntimeException();
                                                case -1774889517:
                                                case -236504683:
                                                    if (C0845.f81821 >= 0) {
                                                        iM55680 = C0873.m55680("ᩳۢ") ^ i12;
                                                        i14 = ((iM55680 ^ i13) * (-22725)) ^ (-1171384032);
                                                        i15 = -565635435;
                                                    } else {
                                                        iM55680 = C0873.m55680("ۗ۟") ^ i13;
                                                        i14 = ((iM55680 ^ i12) * 6707) ^ (-980081156);
                                                        i15 = -1173508204;
                                                    }
                                                    break;
                                                case -1771741987:
                                                case 598533355:
                                                    if (C0947.f81895) {
                                                        iM55680 = C0946.m55979("ۘۤ") ^ i13;
                                                        i14 = ((iM55680 ^ i12) * (-5847)) ^ (-1627281530);
                                                        i15 = -249483862;
                                                    } else {
                                                        iM55680 = (i12 - C0946.m55979("۟᩻")) * (-23);
                                                        i14 = ((iM55680 ^ i13) * 1095) ^ (-1740078548);
                                                        i15 = 1428139366;
                                                    }
                                                    break;
                                                case -1521408828:
                                                case -1293210318:
                                                    C0946.m55980();
                                                    if (C0877.f81843 < 0) {
                                                        iM55680 = C0873.m55680("ۤ᩻") ^ i12;
                                                        i14 = ((iM55680 ^ i13) * 8085) ^ (-690364943);
                                                        i15 = -458143326;
                                                    } else {
                                                        iM55680 = C0873.m55680("֫ۗ") ^ i13;
                                                        i14 = ((iM55680 ^ i12) * 30499) ^ (-1175427859);
                                                        i15 = -1078874102;
                                                    }
                                                    break;
                                                case -382866473:
                                                case 987498565:
                                                    if (AbstractC0942.f81890 <= 0) {
                                                        iM55680 = C0873.m55680("ۤ᩻") ^ i12;
                                                        i14 = ((iM55680 ^ i13) * 8085) ^ (-690364943);
                                                        i15 = -458143326;
                                                    } else {
                                                        iM55680 = C0873.m55680("᩵ܳ") ^ i12;
                                                        i14 = ((iM55680 ^ i13) * 30647) ^ (-1661655672);
                                                        i15 = -1269877019;
                                                    }
                                                    break;
                                                case -321067089:
                                                case -58991342:
                                                    AbstractC0942.m55971();
                                                    if (RunnableC1014.f81941 <= 0) {
                                                        iM55680 = C0873.m55680("ᩳۢ") ^ i12;
                                                        i14 = ((iM55680 ^ i13) * (-22725)) ^ (-1171384032);
                                                        i15 = -565635435;
                                                    } else {
                                                        iM55680 = (C0946.m55979("ۤۨ") ^ i13) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i14 = ((iM55680 ^ i12) * 15699) ^ 10085197;
                                                        i15 = 1878673189;
                                                    }
                                                    break;
                                                case -63736782:
                                                case 1430953683:
                                                    C1048.m56305();
                                                    RunnableC0938.m55938();
                                                    iM55680 = (C0946.m55979("ۤۨ") ^ i13) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                    i14 = ((iM55680 ^ i12) * 15699) ^ 10085197;
                                                    i15 = 1878673189;
                                                    break;
                                                case 455823654:
                                                case 909021352:
                                                    if (C0912.f81867 <= 0) {
                                                        iM55680 = C0873.m55680("֫ۗ") ^ i13;
                                                        i14 = ((iM55680 ^ i12) * 30499) ^ (-1175427859);
                                                        i15 = -1078874102;
                                                    } else {
                                                        iM55680 = (C0946.m55979("ۗܽ") ^ i13) * 127;
                                                        i14 = ((iM55680 ^ i12) * 423) ^ (-139597762);
                                                        i15 = -821502927;
                                                    }
                                                    break;
                                                case 869197520:
                                                case 1497481370:
                                                    if (C0861.f81831) {
                                                        iM55680 = C0946.m55979("ܳ֡") ^ i12;
                                                        i14 = ((iM55680 ^ i13) * 25305) ^ 1337754947;
                                                        i15 = 1315997951;
                                                    } else {
                                                        iM55680 = C0873.m55680("ᩳۢ") ^ i12;
                                                        i14 = ((iM55680 ^ i13) * (-22725)) ^ (-1171384032);
                                                        i15 = -565635435;
                                                    }
                                                    break;
                                                case 1562782840:
                                                case 1812542553:
                                                    if (C1229.f82066 >= 0) {
                                                        iM55680 = C0873.m55680("ᩳۢ") ^ i12;
                                                        i14 = ((iM55680 ^ i13) * (-22725)) ^ (-1171384032);
                                                        i15 = -565635435;
                                                    } else {
                                                        iM55680 = C0946.m55979("᩻ܶ") ^ i13;
                                                        i14 = ((iM55680 ^ i12) * (-21367)) ^ 1865884988;
                                                        i15 = -286236973;
                                                    }
                                                    break;
                                                case 1577893599:
                                                case 1656135145:
                                                    if (RunnableC1014.f81941 <= 0) {
                                                        iM55680 = C0873.m55680("֫ۗ") ^ i13;
                                                        i14 = ((iM55680 ^ i12) * 30499) ^ (-1175427859);
                                                        i15 = -1078874102;
                                                    } else {
                                                        iM55680 = C0946.m55979("᩷۫") ^ i13;
                                                        i14 = ((iM55680 ^ i12) * (-27183)) ^ 1372664094;
                                                        i15 = 1617232939;
                                                    }
                                                    break;
                                                case 1849603103:
                                                case 1850449803:
                                                    if (C0955.f81898) {
                                                        iM55680 = C0946.m55979("ۘۤ") ^ i13;
                                                        i14 = ((iM55680 ^ i12) * (-5847)) ^ (-1627281530);
                                                        i15 = -249483862;
                                                    } else {
                                                        iM55680 = (C0873.m55680("ۗۖ") + i13) * 69;
                                                        i14 = ((iM55680 ^ i12) * (-6265)) ^ 64920299;
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
                                    @Override // p067l.InterfaceC11360
                                    /* JADX INFO: renamed from: ֫ */
                                    public final void mo3843(C25065 c25065) {
                                        int iM55680;
                                        int i11;
                                        int i12 = 1989820693;
                                        int i13 = C0873.f81841;
                                        int i14 = RunnableC1014.f81941;
                                        int iM559712 = (C0946.m55979("ۗ۬") ^ i14) * 55;
                                        int i15 = ((iM559712 ^ i13) * (-24309)) ^ 998506583;
                                        int i16 = iM559712 ^ 1257027954;
                                        String str4 = null;
                                        String str5 = null;
                                        C14853 c14854 = null;
                                        View view2 = null;
                                        while (true) {
                                            i12 = i16 ^ ((((i12 ^ i13) * (-12187)) >> 31) & i15);
                                            switch (i12) {
                                                case -2102186096:
                                                case 1663125647:
                                                    ViewOnClickListenerC19209.m43745(c14854, view2, this, str4, str5, c25065);
                                                    break;
                                                case -2060243130:
                                                case 554354181:
                                                    if (C0894.f81854 >= 0) {
                                                        iM55680 = (C0946.m55979("ۢܶ") + i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i15 = ((iM55680 ^ i13) * 28989) ^ (-1063089987);
                                                        i11 = 1612997172;
                                                    } else {
                                                        iM55680 = C0873.m55680("ܽۧ") ^ i14;
                                                        i15 = ((iM55680 ^ i13) * 22367) ^ (-1257390259);
                                                        i11 = -690092839;
                                                    }
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                                case -1895152583:
                                                case -670371530:
                                                    str5 = str2;
                                                    if (C0946.f81894 != 0) {
                                                        iM55680 = C0946.m55979("ܰ᩵") ^ i13;
                                                        i15 = ((iM55680 ^ i14) * 3169) ^ (-1821455327);
                                                        i11 = 297758461;
                                                    } else {
                                                        iM55680 = C0873.m55680("ۘᩳ") ^ i13;
                                                        i15 = ((iM55680 ^ i14) * 24177) ^ (-1290031364);
                                                        i11 = -1115044489;
                                                    }
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                                case -1675018359:
                                                case 1654292376:
                                                    if (C1003.f81929 <= 0) {
                                                        iM55680 = (C0873.m55680("ܰۘ") + i14) * (-11);
                                                        i15 = ((iM55680 ^ i13) * 27191) ^ (-501889815);
                                                        i11 = -1832685280;
                                                    } else {
                                                        iM55680 = (C0873.m55680("᩺ۨ") + i14) * 39;
                                                        i15 = ((iM55680 ^ i13) * 16043) ^ 1941019594;
                                                        i11 = -901141800;
                                                    }
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                                case -1601131135:
                                                case -441108005:
                                                    if (C0947.f81895) {
                                                        iM55680 = (C0946.m55979("ܶᩳ") + i13) * 17;
                                                        i15 = ((iM55680 ^ i14) * (-10623)) ^ (-345932160);
                                                        i11 = 1424678588;
                                                    } else {
                                                        iM55680 = (C0873.m55680("ܰۘ") + i14) * (-11);
                                                        i15 = ((iM55680 ^ i13) * 27191) ^ (-501889815);
                                                        i11 = -1832685280;
                                                    }
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                                case -1374819796:
                                                case -576200632:
                                                    if (C0917.f81868) {
                                                        iM55680 = (C0946.m55979("ܶᩳ") + i13) * 17;
                                                        i15 = ((iM55680 ^ i14) * (-10623)) ^ (-345932160);
                                                        i11 = 1424678588;
                                                    } else {
                                                        iM55680 = (i13 - C0946.m55979("ܺ۟")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                        i15 = ((iM55680 ^ i14) * (-16547)) ^ 907396342;
                                                        i11 = -2005364852;
                                                    }
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                                case -1221317058:
                                                case -572482356:
                                                    if (C0882.f81846) {
                                                        iM55680 = (C0946.m55979("ۢܶ") + i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i15 = ((iM55680 ^ i13) * 28989) ^ (-1063089987);
                                                        i11 = 1612997172;
                                                    } else {
                                                        iM55680 = C0946.m55979("᩻ۗ") ^ i13;
                                                        i15 = ((iM55680 ^ i14) * 4657) ^ (-1137441953);
                                                        i11 = -1887598592;
                                                    }
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                                case -707896070:
                                                case -164648958:
                                                    if (C1929.f83011 != 0) {
                                                        iM55680 = (C0946.m55979("ۢܶ") + i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i15 = ((iM55680 ^ i13) * 28989) ^ (-1063089987);
                                                        i11 = 1612997172;
                                                    } else {
                                                        iM55680 = C0873.m55680("᩻ۤ") ^ i14;
                                                        i15 = ((iM55680 ^ i13) * C0254q.f1218h) ^ (-1993650178);
                                                        i11 = -807134136;
                                                    }
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                                case -634704509:
                                                case 1497072303:
                                                    if (C0967.f81910 >= 0) {
                                                        iM55680 = C0946.m55979("ܰ᩵") ^ i13;
                                                        i15 = ((iM55680 ^ i14) * 3169) ^ (-1821455327);
                                                        i11 = 297758461;
                                                    } else {
                                                        iM55680 = (C0873.m55680("᩵ۘ") ^ i13) * (-85);
                                                        i15 = ((iM55680 ^ i14) * 6109) ^ 1934827344;
                                                        i11 = -1072451331;
                                                    }
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                                case -569952474:
                                                case -415644502:
                                                    c14854 = c14853;
                                                    view2 = view;
                                                    if (C0992.f81922 >= 0) {
                                                        iM55680 = (C0946.m55979("ۢܶ") + i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i15 = ((iM55680 ^ i13) * 28989) ^ (-1063089987);
                                                        i11 = 1612997172;
                                                    } else {
                                                        iM55680 = C0946.m55979("ܽۖ") ^ i14;
                                                        i15 = ((iM55680 ^ i13) * 23251) ^ 885950217;
                                                        i11 = 46883355;
                                                    }
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                                case -67574215:
                                                case 1478244985:
                                                    C0877.m55696();
                                                    C1964.m56597();
                                                    break;
                                                case 750036619:
                                                case 1497552591:
                                                    C1229.m56410();
                                                    if (ServiceConnectionC1013.f81940 >= 0) {
                                                        iM55680 = (C0873.m55680("ܰۘ") + i14) * (-11);
                                                        i15 = ((iM55680 ^ i13) * 27191) ^ (-501889815);
                                                        i11 = -1832685280;
                                                    } else {
                                                        iM55680 = (C0946.m55979("ۢܶ") + i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i15 = ((iM55680 ^ i13) * 28989) ^ (-1063089987);
                                                        i11 = 1612997172;
                                                    }
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                                case 1135065754:
                                                case 1725768631:
                                                    if (RunnableC0871.f81839 >= 0) {
                                                        iM55680 = C0946.m55979("֡᩸") ^ i13;
                                                        i15 = ((iM55680 ^ i14) * (-3101)) ^ 1984715408;
                                                        i11 = 66253182;
                                                    } else {
                                                        iM55680 = C0873.m55680("ۛ۫") ^ i13;
                                                        i15 = ((iM55680 ^ i14) * (-2281)) ^ (-589907460);
                                                        i11 = -963048513;
                                                    }
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                                case 1259305214:
                                                case 1742262321:
                                                    if (C0930.f81879 > 0) {
                                                        iM55680 = (C0873.m55680("ܰۘ") + i14) * (-11);
                                                        i15 = ((iM55680 ^ i13) * 27191) ^ (-501889815);
                                                        i11 = -1832685280;
                                                    } else {
                                                        iM55680 = C0946.m55979("֡᩸") ^ i13;
                                                        i15 = ((iM55680 ^ i14) * (-3101)) ^ 1984715408;
                                                        i11 = 66253182;
                                                    }
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                                case 1362797519:
                                                case 1523936913:
                                                    C1124.m56367();
                                                    C0877.m55696();
                                                    iM55680 = (C0873.m55680("ܰۘ") + i14) * (-11);
                                                    i15 = ((iM55680 ^ i13) * 27191) ^ (-501889815);
                                                    i11 = -1832685280;
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                                default:
                                                    str4 = str;
                                                    if (C1071.m56343() != 0) {
                                                        iM55680 = C0946.m55979("֡᩸") ^ i13;
                                                        i15 = ((iM55680 ^ i14) * (-3101)) ^ 1984715408;
                                                        i11 = 66253182;
                                                    } else {
                                                        iM55680 = C0873.m55680("ܳ֡") ^ i14;
                                                        i15 = ((iM55680 ^ i13) * (-32481)) ^ 1890653812;
                                                        i11 = -1176446891;
                                                    }
                                                    i16 = iM55680 ^ i11;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                };
                                if (RunnableC0871.f81839 < 0) {
                                    final AbstractActivityC5549 abstractActivityC55410 = this.f57402;
                                    C1404.m56457(new Thread(new Runnable() { // from class: l.ۢ֨ۡ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Activity activity = null;
                                            C17867 c17867 = null;
                                            String str4 = null;
                                            int i11 = 1604616699;
                                            int i12 = C0845.f81821;
                                            int i13 = C1229.f82066;
                                            int iM559712 = (C0946.m55979("۬ۧ") ^ i13) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            int i14 = ((iM559712 ^ i12) * (-11739)) ^ 1386073711;
                                            int i15 = 956925467;
                                            while (true) {
                                                i11 = ((((i11 ^ i12) * 16141) >> 31) & i14) ^ (iM559712 ^ i15);
                                                switch (i11) {
                                                    case -1791233256:
                                                    case 872384227:
                                                        C1071.m56343();
                                                        if (C1044.f81959 < 0) {
                                                            iM559712 = C0873.m55680("ܿۤ") ^ i12;
                                                            i14 = ((iM559712 ^ i13) * 22713) ^ 587821933;
                                                            i15 = 558504323;
                                                        } else {
                                                            iM559712 = C0873.m55680("֨ۛ") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * (-1795)) ^ 1114229891;
                                                            i15 = -183507372;
                                                        }
                                                        break;
                                                    case -1693874237:
                                                    case -1685142779:
                                                        if (C1017.m56187() <= 0) {
                                                            iM559712 = C0873.m55680("ܿۤ") ^ i12;
                                                            i14 = ((iM559712 ^ i13) * 22713) ^ 587821933;
                                                            i15 = 558504323;
                                                        } else {
                                                            iM559712 = C0873.m55680("۟ۨ") ^ i12;
                                                            i14 = ((iM559712 ^ i13) * 14187) ^ (-285498198);
                                                            i15 = 666958376;
                                                        }
                                                        break;
                                                    case -1652094833:
                                                    case 3010643:
                                                        c17867 = r21;
                                                        if (C1046.m56302() != 0) {
                                                            iM559712 = (i12 - C0946.m55979("ܰ֡")) * 59;
                                                            i14 = ((iM559712 ^ i13) * 27363) ^ 321783437;
                                                            i15 = -1563386371;
                                                        } else {
                                                            iM559712 = (i12 - C0946.m55979("۠۟")) * 3;
                                                            i14 = ((iM559712 ^ i13) * 2199) ^ (-1445518236);
                                                            i15 = -1927286491;
                                                        }
                                                        break;
                                                    case -1547678825:
                                                    case -614122358:
                                                        ServiceConnectionC1013.m56157();
                                                        if (ViewOnClickListenerC0939.f81888 > 0) {
                                                            iM559712 = C0873.m55680("ᩴ֡") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * 10089) ^ 1405511666;
                                                            i15 = 617091058;
                                                        } else {
                                                            iM559712 = C0873.m55680("֨ۛ") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * (-1795)) ^ 1114229891;
                                                            i15 = -183507372;
                                                        }
                                                        break;
                                                    case -1364761871:
                                                    case 901362254:
                                                        if (C0861.f81831) {
                                                            iM559712 = (C0873.m55680("ۚۗ") ^ i12) * (-25);
                                                            i14 = ((iM559712 ^ i13) * (-25315)) ^ (-1610447709);
                                                            i15 = -826708721;
                                                        } else {
                                                            iM559712 = (i12 - C0946.m55979("ܰ֡")) * 59;
                                                            i14 = ((iM559712 ^ i13) * 27363) ^ 321783437;
                                                            i15 = -1563386371;
                                                        }
                                                        break;
                                                    case -949115424:
                                                    case 1157600544:
                                                        C0947.m55997();
                                                        C1929.m56553();
                                                        break;
                                                    case -930001101:
                                                    case 1415551861:
                                                        C4654.m9859(str4, str2, str3, activity, c17867);
                                                        break;
                                                    case -829124063:
                                                    case -571481267:
                                                        C0989.m56095();
                                                        C0861.m55626();
                                                        iM559712 = C0873.m55680("֨ۛ") ^ i13;
                                                        i14 = ((iM559712 ^ i12) * (-1795)) ^ 1114229891;
                                                        i15 = -183507372;
                                                        break;
                                                    case -577170304:
                                                    case 2029204161:
                                                        str4 = str;
                                                        if (C0863.f81833 <= 0) {
                                                            iM559712 = (i12 - C0946.m55979("ܰ֡")) * 59;
                                                            i14 = ((iM559712 ^ i13) * 27363) ^ 321783437;
                                                            i15 = -1563386371;
                                                        } else {
                                                            iM559712 = (C0873.m55680("֫ܳ") + i13) * 47;
                                                            i14 = ((iM559712 ^ i12) * 17135) ^ (-1287874256);
                                                            i15 = 1673823122;
                                                        }
                                                        break;
                                                    case -238998170:
                                                    case -54503259:
                                                        if (C1044.f81959 >= 0) {
                                                            iM559712 = C0873.m55680("֨ۛ") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * (-1795)) ^ 1114229891;
                                                            i15 = -183507372;
                                                        } else {
                                                            iM559712 = C0873.m55680("۬۫") ^ i12;
                                                            i14 = ((iM559712 ^ i13) * 9331) ^ (-1006910432);
                                                            i15 = -1426639936;
                                                        }
                                                        break;
                                                    case 380383867:
                                                    case 594735687:
                                                        activity = abstractActivityC55410;
                                                        if (C1028.m56247() >= 0) {
                                                            iM559712 = C0873.m55680("֨ۛ") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * (-1795)) ^ 1114229891;
                                                            i15 = -183507372;
                                                        } else {
                                                            iM559712 = C0873.m55680("᩹ۛ") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * 22151) ^ (-196950495);
                                                            i15 = 1295230560;
                                                        }
                                                        break;
                                                    case 610052477:
                                                    case 1448276980:
                                                        if (C0894.f81854 >= 0) {
                                                            iM559712 = C0873.m55680("ܿۤ") ^ i12;
                                                            i14 = ((iM559712 ^ i13) * 22713) ^ 587821933;
                                                            i15 = 558504323;
                                                        } else {
                                                            iM559712 = C0946.m55979("ܽۖ") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * 5447) ^ 511591196;
                                                            i15 = -421340150;
                                                        }
                                                        break;
                                                    case 610653112:
                                                    case 2064956966:
                                                        if (C1017.f81942 >= 0) {
                                                            iM559712 = (i12 - C0946.m55979("ܰ֡")) * 59;
                                                            i14 = ((iM559712 ^ i13) * 27363) ^ 321783437;
                                                            i15 = -1563386371;
                                                        } else {
                                                            iM559712 = C0946.m55979("᩺֫") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * 25479) ^ (-109504940);
                                                            i15 = 525639111;
                                                        }
                                                        break;
                                                    case 718801194:
                                                    case 766463871:
                                                        if (C1229.f82066 >= 0) {
                                                            iM559712 = C0873.m55680("ܿۤ") ^ i12;
                                                            i14 = ((iM559712 ^ i13) * 22713) ^ 587821933;
                                                            i15 = 558504323;
                                                        } else {
                                                            iM559712 = (C0946.m55979("۫۫") ^ i13) * 91;
                                                            i14 = ((iM559712 ^ i12) * 3335) ^ (-1753963834);
                                                            i15 = -572547758;
                                                        }
                                                        break;
                                                    case 968842715:
                                                    case 1460862580:
                                                        if (C1046.f81962 <= 0) {
                                                            iM559712 = C0873.m55680("ᩴ֡") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * 10089) ^ 1405511666;
                                                            i15 = 617091058;
                                                        } else {
                                                            iM559712 = C0946.m55979("᩷۬") ^ i12;
                                                            i14 = ((iM559712 ^ i13) * 5717) ^ 2048020243;
                                                            i15 = -2018338760;
                                                        }
                                                        break;
                                                    default:
                                                        if (C0955.f81898) {
                                                            iM559712 = C0873.m55680("֨ۛ") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * (-1795)) ^ 1114229891;
                                                            i15 = -183507372;
                                                        } else {
                                                            iM559712 = C0873.m55680("᩸ۨ") ^ i12;
                                                            i14 = ((iM559712 ^ i13) * 29003) ^ 94971649;
                                                            i15 = -696373487;
                                                        }
                                                        break;
                                                }
                                                return;
                                            }
                                        }

                                        {
                                            int i11 = 1570940038;
                                            int i12 = C1028.f81950;
                                            int i13 = C0989.f81920;
                                            int iM559712 = (C0946.m55979("ۙ᩸") ^ i13) * (-29);
                                            int i14 = ((iM559712 ^ i12) * (-24959)) ^ (-72582678);
                                            int i15 = -2012425709;
                                            while (true) {
                                                i11 = ((((i11 ^ i12) * 24559) >> 31) & i14) ^ (iM559712 ^ i15);
                                                switch (i11) {
                                                    case -1947431289:
                                                    case 736542116:
                                                        C1929.m56553();
                                                        if (!C1024.f81946) {
                                                            iM559712 = (C0946.m55979("ۤۤ") ^ i13) * (-19);
                                                            i14 = ((iM559712 ^ i12) * 1909) ^ (-1390311449);
                                                            i15 = 1673866945;
                                                        } else {
                                                            iM559712 = (i12 - C0873.m55680("ۙۜ")) * 115;
                                                            i14 = ((iM559712 ^ i13) * 30773) ^ 352671558;
                                                            i15 = 2074846358;
                                                        }
                                                        break;
                                                    case -1544021614:
                                                    case 187773465:
                                                        if (C0927.m55873() <= 0) {
                                                            iM559712 = (C0946.m55979("ۤۤ") ^ i13) * (-19);
                                                            i14 = ((iM559712 ^ i12) * 1909) ^ (-1390311449);
                                                            i15 = 1673866945;
                                                        } else {
                                                            iM559712 = (C0873.m55680("ܽܰ") ^ i13) * (-39);
                                                            i14 = ((iM559712 ^ i12) * (-10391)) ^ 1942775923;
                                                            i15 = 1525113572;
                                                        }
                                                        break;
                                                    case -1399871332:
                                                    case -1288911509:
                                                        if (RunnableC1014.f81941 <= 0) {
                                                            iM559712 = (i12 - C0873.m55680("ۙۜ")) * 115;
                                                            i14 = ((iM559712 ^ i13) * 30773) ^ 352671558;
                                                            i15 = 2074846358;
                                                        } else {
                                                            iM559712 = C0873.m55680("۫֨") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * 16131) ^ 1055483226;
                                                            i15 = 49518779;
                                                        }
                                                        break;
                                                    case -1392542381:
                                                    case 1217587888:
                                                        C0992.m56107();
                                                        C0894.m55769();
                                                        throw new RuntimeException();
                                                    case -1380146550:
                                                    case 1984397547:
                                                        AbstractC0942.m55971();
                                                        C0955.m56025();
                                                        iM559712 = (i12 - C0873.m55680("ۙۜ")) * 115;
                                                        i14 = ((iM559712 ^ i13) * 30773) ^ 352671558;
                                                        i15 = 2074846358;
                                                        break;
                                                    case -1261200901:
                                                    case -961710423:
                                                        if (C0877.f81843 >= 0) {
                                                            iM559712 = C0873.m55680("۬᩺") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * 10123) ^ (-1299317074);
                                                            i15 = -2134232081;
                                                        } else {
                                                            iM559712 = (C0946.m55979("ۤ۠") + i12) * 17;
                                                            i14 = ((iM559712 ^ i13) * (-17919)) ^ (-372205971);
                                                            i15 = -548583064;
                                                        }
                                                        break;
                                                    case -1072932582:
                                                    case -47196544:
                                                        if (C1046.f81962 <= 0) {
                                                            iM559712 = (C0946.m55979("ۖۢ") ^ i12) * (-81);
                                                            i14 = ((iM559712 ^ i13) * (-6425)) ^ (-370619338);
                                                            i15 = 1562705684;
                                                        } else {
                                                            iM559712 = C0873.m55680("ܳᩴ") ^ i12;
                                                            i14 = ((iM559712 ^ i13) * 1441) ^ (-918844482);
                                                            i15 = 678464821;
                                                        }
                                                        break;
                                                    case -1021849738:
                                                    case 794851209:
                                                        if (C1036.f81953 >= 0) {
                                                            iM559712 = (i12 - C0873.m55680("ۙۜ")) * 115;
                                                            i14 = ((iM559712 ^ i13) * 30773) ^ 352671558;
                                                            i15 = 2074846358;
                                                        } else {
                                                            iM559712 = (i13 - C0873.m55680("ۤۜ")) * (-119);
                                                            i14 = ((iM559712 ^ i12) * 3315) ^ 419933029;
                                                            i15 = 362126142;
                                                        }
                                                        break;
                                                    case -866095901:
                                                    case 842591795:
                                                        if (RunnableC1014.f81941 <= 0) {
                                                            iM559712 = (i12 - C0873.m55680("ۙۜ")) * 115;
                                                            i14 = ((iM559712 ^ i13) * 30773) ^ 352671558;
                                                            i15 = 2074846358;
                                                        } else {
                                                            iM559712 = C0873.m55680("ۖ᩸") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * 21811) ^ 1299306126;
                                                            i15 = 1204158480;
                                                        }
                                                        break;
                                                    case -137257423:
                                                    case 1560790822:
                                                        if (C0882.f81846) {
                                                            iM559712 = (i12 - C0873.m55680("ۙۜ")) * 115;
                                                            i14 = ((iM559712 ^ i13) * 30773) ^ 352671558;
                                                            i15 = 2074846358;
                                                        } else {
                                                            iM559712 = (i12 - C0946.m55979("ᩴۛ")) * 37;
                                                            i14 = ((iM559712 ^ i13) * (-27645)) ^ 2030973875;
                                                            i15 = 277899605;
                                                        }
                                                        break;
                                                    case -44507644:
                                                    case 427297143:
                                                        return;
                                                    case 413615273:
                                                    case 2048587514:
                                                        if (C1028.f81950 <= 0) {
                                                            iM559712 = C0873.m55680("۬᩺") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * 10123) ^ (-1299317074);
                                                            i15 = -2134232081;
                                                        } else {
                                                            iM559712 = C0946.m55979("᩹ۛ") ^ i12;
                                                            i14 = ((iM559712 ^ i13) * 22091) ^ 114343459;
                                                            i15 = -1685934749;
                                                        }
                                                        break;
                                                    case 671890963:
                                                    case 1136053461:
                                                        if (C1929.f83011 == 0) {
                                                            iM559712 = (C0873.m55680("ܽܿ") ^ i13) * 109;
                                                            i14 = ((iM559712 ^ i12) * (-18159)) ^ (-10837609);
                                                            i15 = -730300138;
                                                        } else {
                                                            iM559712 = (C0946.m55979("ۤۤ") ^ i13) * (-19);
                                                            i14 = ((iM559712 ^ i12) * 1909) ^ (-1390311449);
                                                            i15 = 1673866945;
                                                        }
                                                        break;
                                                    case 1319713905:
                                                    case 2108381564:
                                                        if (C0877.f81843 >= 0) {
                                                            iM559712 = (C0873.m55680("ܽܿ") ^ i13) * 109;
                                                            i14 = ((iM559712 ^ i12) * (-18159)) ^ (-10837609);
                                                            i15 = -730300138;
                                                        } else {
                                                            iM559712 = C0946.m55979("ۙܺ") ^ i13;
                                                            i14 = ((iM559712 ^ i12) * 21113) ^ (-2096991964);
                                                            i15 = -633178465;
                                                        }
                                                        break;
                                                    case 1656950412:
                                                    case 1978144886:
                                                        C0912.m55833();
                                                        if (!C0861.m55626()) {
                                                            iM559712 = (C0946.m55979("ۖۢ") ^ i12) * (-81);
                                                            i14 = ((iM559712 ^ i13) * (-6425)) ^ (-370619338);
                                                            i15 = 1562705684;
                                                        } else {
                                                            iM559712 = (C0946.m55979("ۤۤ") ^ i13) * (-19);
                                                            i14 = ((iM559712 ^ i12) * 1909) ^ (-1390311449);
                                                            i15 = 1673866945;
                                                        }
                                                        break;
                                                    default:
                                                        if (C0946.f81894 != 0) {
                                                            iM559712 = (i12 - C0873.m55680("ۙۜ")) * 115;
                                                            i14 = ((iM559712 ^ i13) * 30773) ^ 352671558;
                                                            i15 = 2074846358;
                                                        } else {
                                                            iM559712 = (i12 - C0946.m55979("᩷֫")) * 29;
                                                            i14 = ((iM559712 ^ i13) * (-20885)) ^ 1063169644;
                                                            i15 = 1620237060;
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                    }));
                                }
                                iM55979 = C0946.m55979("ܺܺ") ^ i2;
                                i5 = (-1335873200) ^ ((iM55979 ^ i3) * (-13911));
                                i = 1209268791;
                                break;
                            }
                        }
                        iM55979 = C0873.m55680("ۛܿ") ^ i3;
                        i5 = 1444534731 ^ ((iM55979 ^ i2) * (-24697));
                        i = -697466840;
                    }
                    i4 = i ^ iM55979;
                    i6 = i9;
                    break;
                default:
                    C0949.m56012();
                    C0989.m56095();
                    iM55979 = C0946.m55979("ܺܺ") ^ i2;
                    i5 = (-1335873200) ^ ((iM55979 ^ i3) * (-13911));
                    i = 1209268791;
                    i4 = i ^ iM55979;
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
    
        if (p067l.C0992.f81922 < 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (p067l.RunnableC0871.f81839 < 0) goto L21;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(final View view) {
        int i;
        C20671 c20671;
        int iM55979;
        int i2;
        int i3;
        int i4;
        int iM559710;
        int i5;
        int iM559711;
        int i6;
        int i7;
        int i8 = -2108428841;
        int i9 = C0866.f81837;
        int i10 = C1012.f81938;
        int iM55680 = (i10 - C0873.m55680("ܿܳ")) * 73;
        int i11 = ((iM55680 ^ i9) * 21789) ^ 1869548537;
        int i12 = iM55680 ^ 1268437691;
        String strM55591 = null;
        String strM55592 = null;
        String strM55639 = null;
        C20671 c20671M55888 = null;
        String strM56325 = null;
        int iM559712 = 0;
        char c = 0;
        DialogInterface.OnClickListener onClickListener = null;
        int iM55681 = 0;
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
                    C0967.m56076(c20671M55888, C0946.m55979(C1044.m56276(sArr, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i14)) ^ 2118865007, null);
                    RunnableC0871.m55669(c20671M55888);
                    break;
                case -2065377105:
                case 883365050:
                    short[] sArr2 = sArr;
                    char c2 = c;
                    onClickListener = onClickListener;
                    i = i14;
                    C20671 c20672 = c20671M55888;
                    int i16 = i13 + i15;
                    short s2 = s;
                    int i17 = s2 + 3914;
                    if ((i17 * i17) - (i16 + i16) <= 0) {
                        iM559711 = C0946.m55979("ᩴ᩺") ^ i10;
                        i6 = ((iM559711 ^ i9) * (-5507)) ^ 818155351;
                        i7 = -1370267891;
                    } else {
                        iM559711 = (i10 - C0946.m55979("ۜ᩺")) * (-109);
                        i6 = ((iM559711 ^ i9) * 9545) ^ (-433081573);
                        i7 = -1113858606;
                    }
                    s = s2;
                    c20671M55888 = c20672;
                    sArr = sArr2;
                    c = c2;
                    i12 = iM559711 ^ i7;
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
                    c20671 = c20671M55888;
                    RunnableC0871.m55661(view, C1071.m56336(f82294, 79, 1, i));
                    if (C0917.f81868) {
                        iM55979 = (C0873.m55680("ۙ֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM55979 ^ i10) * 27557) ^ 1673038081;
                        i3 = 1260891648;
                    } else {
                        iM55979 = (i9 - C0946.m55979("᩸ۧ")) * (-51);
                        i2 = ((iM55979 ^ i10) * 7481) ^ 1946641102;
                        i3 = -1133645022;
                    }
                    i4 = iM55979 ^ i3;
                    c20671M55888 = c20671;
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
                    if (C0927.f81875) {
                        sArr = sArr;
                        c = c;
                        onClickListener = onClickListener;
                        i = i14;
                        c20671 = c20671M55888;
                        iM55979 = C0873.m55680("ܽܶ") ^ i9;
                        i2 = ((iM55979 ^ i10) * 11193) ^ (-387320320);
                        i3 = -577008911;
                        i4 = iM55979 ^ i3;
                        c20671M55888 = c20671;
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
                    c20671 = c20671M55888;
                    iM55979 = (C0873.m55680("֫ۘ") + i10) * 67;
                    i2 = ((iM55979 ^ i9) * (-10899)) ^ (-2019545834);
                    i3 = 1838277235;
                    i4 = iM55979 ^ i3;
                    c20671M55888 = c20671;
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
                    C1025.m56230();
                    if (C0873.f81841 > 0) {
                        sArr = sArr;
                        c = c;
                        onClickListener = onClickListener;
                        i = i14;
                        c20671 = c20671M55888;
                        iM55979 = (C0873.m55680("ۙ֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM55979 ^ i10) * 27557) ^ 1673038081;
                        i3 = 1260891648;
                        i4 = iM55979 ^ i3;
                        c20671M55888 = c20671;
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
                    c20671 = c20671M55888;
                    iM55979 = (C0873.m55680("᩷֫") + i10) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i2 = ((iM55979 ^ i9) * 16079) ^ (-568624943);
                    i3 = -117576087;
                    i4 = iM55979 ^ i3;
                    c20671M55888 = c20671;
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
                    ViewOnClickListenerC0939.m55953(c20671M55888, 2098699828 ^ iM559712, onClickListener);
                    sArr = f82294;
                    if (C0937.f81884) {
                        int iM559713 = (C0946.m55979("۬ۙ") ^ i9) * 99;
                        i12 = iM559713 ^ (-935392093);
                        i11 = ((iM559713 ^ i10) * 24297) ^ (-1339666009);
                    } else {
                        i = i14;
                        c = c;
                        c20671 = c20671M55888;
                        int iM55682 = (C0873.m55680("ۖۤ") ^ i9) * 41;
                        i12 = iM55682 ^ (-1879104791);
                        i11 = ((iM55682 ^ i10) * (-30385)) ^ 2038693380;
                        c20671M55888 = c20671;
                        i14 = i;
                        c = c;
                        onClickListener = null;
                    }
                    break;
                case -1250434047:
                case 872478114:
                    m43744(view, strM55591, strM55592, strM55639);
                    break;
                case -1090929735:
                case 1651249178:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c20671 = c20671M55888;
                    if (C24553.m54154(strM55592)) {
                        iM55979 = C0946.m55979("֨ܿ") ^ i10;
                        i2 = ((iM55979 ^ i9) * (-24619)) ^ 451396259;
                        i3 = -2057398519;
                    } else {
                        iM55979 = C0946.m55979("ܶ۫") ^ i9;
                        i2 = ((iM55979 ^ i10) * 22585) ^ (-1409591780);
                        i3 = -846175909;
                    }
                    i4 = iM55979 ^ i3;
                    c20671M55888 = c20671;
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
                    c20671 = c20671M55888;
                    s = f82294[78];
                    i13 = s * s;
                    i15 = 15319396;
                    if (!C0937.f81884) {
                        sArr = sArr;
                        int iM55683 = (C0873.m55680("ۖۤ") ^ i9) * 41;
                        i12 = iM55683 ^ (-1879104791);
                        i11 = ((iM55683 ^ i10) * (-30385)) ^ 2038693380;
                        c20671M55888 = c20671;
                        i14 = i;
                        c = c;
                        onClickListener = null;
                    } else {
                        iM55979 = C0946.m55979("᩸ᩴ") ^ i9;
                        i2 = ((iM55979 ^ i10) * 14133) ^ (-2027491178);
                        i3 = 1539620944;
                        i4 = iM55979 ^ i3;
                        c20671M55888 = c20671;
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
                    c20671 = c20671M55888;
                    C0861.m55627(c20671, C0946.m55979(strM56325) ^ 2123543944);
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("ܽܶ") ^ i9;
                        i2 = ((iM55979 ^ i10) * 11193) ^ (-387320320);
                        i3 = -577008911;
                    } else {
                        iM55979 = (C0873.m55680("ۛ۬") ^ i9) * 87;
                        i2 = ((iM55979 ^ i10) * 12889) ^ (-1768698923);
                        i3 = 775602766;
                    }
                    i4 = iM55979 ^ i3;
                    c20671M55888 = c20671;
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
                    c20671 = c20671M55888;
                    iM55681 = C0873.m55680(C0890.m55726(f82294, IShizukuService.Stub.TRANSACTION_isHidden, 3, i));
                    if (C1124.f82007 >= 0) {
                        iM55979 = (C0873.m55680("֫ۘ") + i10) * 67;
                        i2 = ((iM55979 ^ i9) * (-10899)) ^ (-2019545834);
                        i3 = 1838277235;
                    } else {
                        iM55979 = C0873.m55680("ܳۙ") ^ i10;
                        i2 = ((iM55979 ^ i9) * 23111) ^ 2064839785;
                        i3 = -114414726;
                    }
                    i4 = iM55979 ^ i3;
                    c20671M55888 = c20671;
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
                    C0947.m55997();
                    break;
                case -784760850:
                case 915412723:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c20671 = c20671M55888;
                    if (C24553.m54155(strM55591)) {
                        iM55979 = (C0946.m55979("֨ۤ") + i10) * 87;
                        i2 = ((iM55979 ^ i9) * 24811) ^ 2016275779;
                        i3 = -569285747;
                    } else {
                        iM55979 = (C0873.m55680("ۖۨ") + i9) * (-53);
                        i2 = ((iM55979 ^ i10) * (-15161)) ^ 610612554;
                        i3 = 2029389798;
                    }
                    i4 = iM55979 ^ i3;
                    c20671M55888 = c20671;
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
                    c20671 = c20671M55888;
                    EditText editTextM55882 = C0930.m55882(textInputLayout);
                    C0949.m56008(editTextM55882);
                    if (C0894.m55770(editTextM55882) < 4) {
                        iM55979 = C0946.m55979("ۧܽ") ^ i9;
                        i2 = ((iM55979 ^ i10) * (-5175)) ^ (-775476995);
                        i3 = -89874738;
                    } else {
                        iM55979 = (C0873.m55680("۬ܽ") ^ i10) * (-21);
                        i2 = ((iM55979 ^ i9) * 22461) ^ 111893101;
                        i3 = 1421129767;
                    }
                    i4 = iM55979 ^ i3;
                    c20671M55888 = c20671;
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
                    AbstractC0942.m55968(textInputLayout2, C0946.m55979(C0967.m56077(f82294, 92, 3, i14)) ^ 2120367288);
                    break;
                case 152191020:
                case 1422850582:
                    C1044.m56286();
                    C1025.m56230();
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    iM559710 = C0946.m55979("ܳܶ") ^ i10;
                    i2 = ((iM559710 ^ i9) * (-12043)) ^ 1042240587;
                    i5 = -735419215;
                    i4 = iM559710 ^ i5;
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
                    RunnableC1014.m56168(textInputLayout3, C0946.m55979(C1017.m56189(f82294, 98, 3, i14)) ^ 2128951378);
                    break;
                case 313774381:
                case 1712533727:
                    RunnableC1014.m56168(textInputLayout2, C0873.m55680(C0898.m55792(f82294, 95, 3, i14)) ^ 2122805000);
                    break;
                case 346249839:
                case 1994935572:
                    RunnableC1014.m56168(textInputLayout2, C0946.m55979(C1024.m56203(f82294, 83, 3, i14)) ^ 2099194332);
                    break;
                case 370722732:
                case 2000771512:
                    RunnableC1014.m56168(textInputLayout, C0873.m55680(C0937.m55921(f82294, 89, 3, i14)) ^ 2118921897);
                    break;
                case 385279992:
                case 412312394:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c20671 = c20671M55888;
                    EditText editTextM55656 = C0866.m55656(textInputLayout);
                    C0949.m56008(editTextM55656);
                    strM55591 = C0845.m55591(C0989.m56089(editTextM55656));
                    if (C24553.m54156(strM55591)) {
                        iM55979 = (C0946.m55979("ܿ᩹") + i9) * (-9);
                        i2 = ((iM55979 ^ i10) * 17137) ^ 1391273674;
                        i3 = 124714964;
                    } else {
                        iM55979 = C0873.m55680("ۖۙ") ^ i10;
                        i2 = ((iM55979 ^ i9) * (-18807)) ^ (-769596100);
                        i3 = -1559476665;
                    }
                    i4 = iM55979 ^ i3;
                    c20671M55888 = c20671;
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
                    int iM55684 = C0873.m55680("֡ۙ") ^ i9;
                    i2 = ((iM55684 ^ i10) * 26137) ^ (-738236478);
                    i4 = iM55684 ^ 131913650;
                    c20671M55888 = c20671M55888;
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
                    c20671 = c20671M55888;
                    textInputLayoutArr[c] = textInputLayout;
                    textInputLayout2 = this.f57400;
                    textInputLayoutArr[1] = textInputLayout2;
                    textInputLayout3 = this.f57401;
                    textInputLayoutArr[2] = textInputLayout3;
                    if (C2641.m4032(textInputLayoutArr)) {
                        iM55979 = (C0873.m55680("۟᩸") ^ i9) * (-121);
                        i2 = ((iM55979 ^ i10) * (-8135)) ^ (-304155630);
                        i3 = -1778949116;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ۬") + i10) * (-3);
                        i2 = ((iM55979 ^ i9) * 7269) ^ 1851451437;
                        i3 = -1856910121;
                    }
                    i4 = iM55979 ^ i3;
                    c20671M55888 = c20671;
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
                    int iM55685 = C0873.m55680("֡ۙ") ^ i9;
                    i2 = ((iM55685 ^ i10) * 26137) ^ (-738236478);
                    i4 = iM55685 ^ 131913650;
                    c20671M55888 = c20671M55888;
                    onClickListener = onClickListener;
                    c = c;
                    short[] sArr18 = sArr;
                    i12 = i4;
                    i11 = i2;
                    sArr = sArr18;
                    break;
                case 629160131:
                case 629609979:
                    RunnableC1014.m56168(textInputLayout, C0873.m55680(C1048.m56318(f82294, 80, 3, i14)) ^ 2128545063);
                    break;
                case 689465670:
                case 1278907988:
                    C1194.m56390(c20671M55888, iM55681 ^ 2104524587);
                    if (C1044.m56286() > 0) {
                        sArr = sArr;
                        int i18 = i14;
                        final String str = strM55591;
                        onClickListener = onClickListener;
                        i = i18;
                        final String str2 = strM55592;
                        c = c;
                        c20671 = c20671M55888;
                        final String str3 = strM55639;
                        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener(this) { // from class: l.ۧ֨ۡ

                            /* JADX INFO: renamed from: ᩸ */
                            public final /* synthetic */ ViewOnClickListenerC19209 f35048;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i19) {
                                String str4 = null;
                                String str5 = null;
                                int i20 = -1277068960;
                                int i21 = RunnableC0871.f81839;
                                int i22 = C1028.f81950;
                                int iM559714 = (C0946.m55979("ۘۧ") ^ i21) * (-61);
                                int i23 = ((iM559714 ^ i22) * 20799) ^ 161690936;
                                int i24 = -1108949795;
                                while (true) {
                                    i20 = ((((i20 ^ i22) * 14739) >> 31) & i23) ^ (iM559714 ^ i24);
                                    switch (i20) {
                                        case -2119178202:
                                        case 1407919674:
                                            C0877.m55696();
                                            if (C1017.f81942 >= 0) {
                                                iM559714 = (i21 - C0873.m55680("᩹ۢ")) * 45;
                                                i23 = ((iM559714 ^ i22) * (-6969)) ^ 350490393;
                                                i24 = 1031603372;
                                            } else {
                                                iM559714 = (C0946.m55979("֫᩹") + i21) * (-75);
                                                i23 = ((iM559714 ^ i22) * 2819) ^ 1313764075;
                                                i24 = -1509494033;
                                            }
                                            break;
                                        case -2112739688:
                                        case -501372468:
                                            C0930.m55885();
                                            if (C0845.f81821 < 0) {
                                                iM559714 = C0946.m55979("ۘ۬") ^ i22;
                                                i23 = ((iM559714 ^ i21) * 9707) ^ 1761300644;
                                                i24 = -1857839826;
                                            } else {
                                                iM559714 = (C0946.m55979("֫᩹") + i21) * (-75);
                                                i23 = ((iM559714 ^ i22) * 2819) ^ 1313764075;
                                                i24 = -1509494033;
                                            }
                                            break;
                                        case -2110003927:
                                        case 2086847889:
                                            if (C0894.m55769() >= 0) {
                                                iM559714 = (i21 - C0873.m55680("᩹ۢ")) * 45;
                                                i23 = ((iM559714 ^ i22) * (-6969)) ^ 350490393;
                                                i24 = 1031603372;
                                            } else {
                                                iM559714 = C0873.m55680("ᩳۨ") ^ i21;
                                                i23 = ((iM559714 ^ i22) * (-18205)) ^ 1181008870;
                                                i24 = -559167881;
                                            }
                                            break;
                                        case -2018746785:
                                        case -936910222:
                                            if (RunnableC0897.f81856) {
                                                iM559714 = (C0873.m55680("ۤۨ") ^ i21) * (-69);
                                                i23 = ((iM559714 ^ i22) * (-27235)) ^ (-1821298641);
                                                i24 = -209972642;
                                            } else {
                                                iM559714 = C0946.m55979("ۙۡ") ^ i22;
                                                i23 = ((iM559714 ^ i21) * (-17599)) ^ (-527919690);
                                                i24 = -2067514879;
                                            }
                                            break;
                                        case -1942776009:
                                        case -1227870780:
                                            if (C0946.f81894 != 0) {
                                                iM559714 = C0946.m55979("ۙۡ") ^ i22;
                                                i23 = ((iM559714 ^ i21) * (-17599)) ^ (-527919690);
                                                i24 = -2067514879;
                                            } else {
                                                iM559714 = (i22 - C0946.m55979("᩶۟")) * (-27);
                                                i23 = ((iM559714 ^ i21) * 12569) ^ 896697043;
                                                i24 = 1327489935;
                                            }
                                            break;
                                        case -1515063908:
                                        case 1909326735:
                                            str4 = str2;
                                            str5 = str3;
                                            if (C0947.f81895) {
                                                iM559714 = C0946.m55979("ܽ۫") ^ i22;
                                                i23 = ((iM559714 ^ i21) * 20127) ^ 955524192;
                                                i24 = 892504465;
                                            } else {
                                                iM559714 = C0873.m55680("᩺֡") ^ i22;
                                                i23 = ((iM559714 ^ i21) * 5761) ^ (-1691135875);
                                                i24 = 595944570;
                                            }
                                            break;
                                        case -1402583256:
                                        case 1163859704:
                                            ViewOnClickListenerC19209.m43746(this.f35048, view, str, str4, str5);
                                            break;
                                        case -1323151823:
                                        case -140898593:
                                            C0890.m55740();
                                            C1028.m56247();
                                            iM559714 = (C0946.m55979("֫᩹") + i21) * (-75);
                                            i23 = ((iM559714 ^ i22) * 2819) ^ 1313764075;
                                            i24 = -1509494033;
                                            break;
                                        case -994792005:
                                        case 1752395427:
                                            if (C0845.f81821 >= 0) {
                                                iM559714 = (C0946.m55979("֫᩹") + i21) * (-75);
                                                i23 = ((iM559714 ^ i22) * 2819) ^ 1313764075;
                                                i24 = -1509494033;
                                            } else {
                                                iM559714 = C0946.m55979("᩷᩻") ^ i22;
                                                i23 = ((iM559714 ^ i21) * (-1361)) ^ 1644607818;
                                                i24 = 448316304;
                                            }
                                            break;
                                        case -904306127:
                                        case 117621720:
                                            if (C1046.f81962 <= 0) {
                                                iM559714 = (C0946.m55979("֫᩹") + i21) * (-75);
                                                i23 = ((iM559714 ^ i22) * 2819) ^ 1313764075;
                                                i24 = -1509494033;
                                            } else {
                                                iM559714 = C0946.m55979("ۢ֨") ^ i21;
                                                i23 = ((iM559714 ^ i22) * (-3417)) ^ (-1039941191);
                                                i24 = 1373423323;
                                            }
                                            break;
                                        case -874767594:
                                        case 1196622605:
                                            if (C0894.f81854 >= 0) {
                                                iM559714 = C0946.m55979("ۙۡ") ^ i22;
                                                i23 = ((iM559714 ^ i21) * (-17599)) ^ (-527919690);
                                                i24 = -2067514879;
                                            } else {
                                                iM559714 = (i21 - C0946.m55979("֡ܿ")) * (-23);
                                                i23 = ((iM559714 ^ i22) * 23719) ^ (-917988937);
                                                i24 = -1881297211;
                                            }
                                            break;
                                        case 179015216:
                                        case 2018428052:
                                            if (C1053.f81965 <= 0) {
                                                iM559714 = (i21 - C0873.m55680("᩹ۢ")) * 45;
                                                i23 = ((iM559714 ^ i22) * (-6969)) ^ 350490393;
                                                i24 = 1031603372;
                                            } else {
                                                iM559714 = (i21 - C0873.m55680("ܰۘ")) * 127;
                                                i23 = ((iM559714 ^ i22) * (-11825)) ^ (-1720728531);
                                                i24 = 1447619929;
                                            }
                                            break;
                                        case 347641174:
                                        case 768048642:
                                            ViewOnClickListenerC0939.m55941();
                                            if (C1025.f81947 < 0) {
                                                iM559714 = C0946.m55979("ۙۡ") ^ i22;
                                                i23 = ((iM559714 ^ i21) * (-17599)) ^ (-527919690);
                                                i24 = -2067514879;
                                            } else {
                                                iM559714 = (C0946.m55979("֫᩹") + i21) * (-75);
                                                i23 = ((iM559714 ^ i22) * 2819) ^ 1313764075;
                                                i24 = -1509494033;
                                            }
                                            break;
                                        case 903414816:
                                        case 1555679529:
                                            if (C0992.f81922 >= 0) {
                                                iM559714 = C0946.m55979("ۘ۬") ^ i22;
                                                i23 = ((iM559714 ^ i21) * 9707) ^ 1761300644;
                                                i24 = -1857839826;
                                            } else {
                                                iM559714 = C0946.m55979("ᩴ᩺") ^ i22;
                                                i23 = ((iM559714 ^ i21) * 14809) ^ 426805253;
                                                i24 = -1396480942;
                                            }
                                            break;
                                        case 1156984494:
                                        case 1600624041:
                                            C0992.m56107();
                                            break;
                                        default:
                                            if (C1229.f82066 >= 0) {
                                                iM559714 = C0946.m55979("ܽ۫") ^ i22;
                                                i23 = ((iM559714 ^ i21) * 20127) ^ 955524192;
                                                i24 = 892504465;
                                            } else {
                                                iM559714 = C0873.m55680("᩹ۘ") ^ i22;
                                                i23 = ((iM559714 ^ i21) * (-9651)) ^ (-1331558571);
                                                i24 = 1819409834;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }

                            {
                                int i19 = -1498789595;
                                int i20 = C0873.f81841;
                                int i21 = ServiceConnectionC1013.f81940;
                                int iM559714 = C0946.m55979("֨ۧ") ^ i21;
                                int i22 = ((iM559714 ^ i20) * 2765) ^ (-1136597378);
                                int i23 = 1396714506;
                                while (true) {
                                    i19 = ((((i19 ^ i20) * (-31883)) >> 31) & i22) ^ (iM559714 ^ i23);
                                    switch (i19) {
                                        case -1941507712:
                                        case -465999690:
                                            C0930.m55885();
                                            throw new RuntimeException();
                                        case -1838387078:
                                        case -1631565891:
                                            return;
                                        case -1660081250:
                                        case 697631773:
                                            if (C0906.f81862 >= 0) {
                                                iM559714 = (C0873.m55680("᩻᩹") ^ i20) * 85;
                                                i22 = ((iM559714 ^ i21) * 27103) ^ (-249449138);
                                                i23 = -1847404936;
                                            } else {
                                                iM559714 = (i20 - C0946.m55979("ۙܿ")) * (-49);
                                                i22 = ((iM559714 ^ i21) * (-29433)) ^ 486688994;
                                                i23 = 1285308557;
                                            }
                                            break;
                                        case -1571534105:
                                        case 1843500919:
                                            if (C1124.f82007 >= 0) {
                                                iM559714 = C0946.m55979("ۧ᩶") ^ i20;
                                                i22 = ((iM559714 ^ i21) * 1489) ^ (-314844778);
                                                i23 = -161125259;
                                            } else {
                                                iM559714 = C0946.m55979("ۧܰ") ^ i20;
                                                i22 = ((iM559714 ^ i21) * 6001) ^ (-629631146);
                                                i23 = 143899650;
                                            }
                                            break;
                                        case -1395297444:
                                        case 2040833379:
                                            if (C1046.m56302() == 0) {
                                                iM559714 = C0946.m55979("ۜۡ") ^ i21;
                                                i22 = ((iM559714 ^ i20) * 28093) ^ 1896830035;
                                                i23 = -1986070069;
                                            } else {
                                                iM559714 = (C0873.m55680("᩻᩹") ^ i20) * 85;
                                                i22 = ((iM559714 ^ i21) * 27103) ^ (-249449138);
                                                i23 = -1847404936;
                                            }
                                            break;
                                        case -990814942:
                                        case -346403425:
                                            if (AbstractC0942.f81890 <= 0) {
                                                iM559714 = C0946.m55979("ۜۡ") ^ i21;
                                                i22 = ((iM559714 ^ i20) * 28093) ^ 1896830035;
                                                i23 = -1986070069;
                                            } else {
                                                iM559714 = C0946.m55979("ۜᩴ") ^ i20;
                                                i22 = ((iM559714 ^ i21) * (-753)) ^ (-1891437138);
                                                i23 = 1867428655;
                                            }
                                            break;
                                        case -972818495:
                                        case -944332431:
                                            if (C1046.f81962 <= 0) {
                                                iM559714 = (C0873.m55680("᩻᩹") ^ i20) * 85;
                                                i22 = ((iM559714 ^ i21) * 27103) ^ (-249449138);
                                                i23 = -1847404936;
                                            } else {
                                                iM559714 = C0946.m55979("᩸֡") ^ i21;
                                                i22 = ((iM559714 ^ i20) * (-13029)) ^ 307304902;
                                                i23 = -983446716;
                                            }
                                            break;
                                        case -940058762:
                                        case -548556946:
                                            if (C1048.f81963) {
                                                iM559714 = C0946.m55979("᩹ۖ") ^ i20;
                                                i22 = ((iM559714 ^ i21) * (-11831)) ^ (-1730934701);
                                                i23 = -1660586678;
                                            } else {
                                                iM559714 = (C0873.m55680("᩻᩹") ^ i20) * 85;
                                                i22 = ((iM559714 ^ i21) * 27103) ^ (-249449138);
                                                i23 = -1847404936;
                                            }
                                            break;
                                        case -560333289:
                                        case -527761858:
                                            if (C1124.f82007 >= 0) {
                                                iM559714 = (C0873.m55680("᩻᩹") ^ i20) * 85;
                                                i22 = ((iM559714 ^ i21) * 27103) ^ (-249449138);
                                                i23 = -1847404936;
                                            } else {
                                                iM559714 = (C0873.m55680("֨۬") + i21) * (-67);
                                                i22 = ((iM559714 ^ i20) * (-6053)) ^ 2065944974;
                                                i23 = 1025300626;
                                            }
                                            break;
                                        case -532763795:
                                        case -249792179:
                                            C0882.m55710();
                                            if (!C0955.m56025()) {
                                                iM559714 = C0946.m55979("ۧ᩶") ^ i20;
                                                i22 = ((iM559714 ^ i21) * 1489) ^ (-314844778);
                                                i23 = -161125259;
                                            } else {
                                                iM559714 = (C0873.m55680("᩻᩹") ^ i20) * 85;
                                                i22 = ((iM559714 ^ i21) * 27103) ^ (-249449138);
                                                i23 = -1847404936;
                                            }
                                            break;
                                        case -388990771:
                                        case 1780759679:
                                            if (RunnableC1014.f81941 <= 0) {
                                                iM559714 = C0873.m55680("ۤܳ") ^ i21;
                                                i22 = ((iM559714 ^ i20) * (-13217)) ^ 18518087;
                                                i23 = 501960946;
                                            } else {
                                                iM559714 = C0873.m55680("ۘ֨") ^ i21;
                                                i22 = ((iM559714 ^ i20) * 25007) ^ (-471727993);
                                                i23 = 671510914;
                                            }
                                            break;
                                        case -5667152:
                                        case 2016380858:
                                            C0873.m55678();
                                            if (!C0917.m55854()) {
                                                iM559714 = C0873.m55680("ۤܳ") ^ i21;
                                                i22 = ((iM559714 ^ i20) * (-13217)) ^ 18518087;
                                                i23 = 501960946;
                                            } else {
                                                iM559714 = C0946.m55979("ۧ᩶") ^ i20;
                                                i22 = ((iM559714 ^ i21) * 1489) ^ (-314844778);
                                                i23 = -161125259;
                                            }
                                            break;
                                        case 873839434:
                                        case 1701435198:
                                            C0930.m55885();
                                            C0912.m55833();
                                            iM559714 = (C0873.m55680("᩻᩹") ^ i20) * 85;
                                            i22 = ((iM559714 ^ i21) * 27103) ^ (-249449138);
                                            i23 = -1847404936;
                                            break;
                                        case 905884529:
                                        case 1827378541:
                                            if (C0845.f81821 >= 0) {
                                                iM559714 = C0873.m55680("۬ۘ") ^ i21;
                                                i22 = ((iM559714 ^ i20) * (-12841)) ^ 1310162844;
                                                i23 = -1797738586;
                                            } else {
                                                iM559714 = C0946.m55979("᩷ۤ") ^ i21;
                                                i22 = ((iM559714 ^ i20) * 27193) ^ (-945531484);
                                                i23 = 1916045696;
                                            }
                                            break;
                                        case 1378061933:
                                        case 1623831700:
                                            if (ViewOnClickListenerC0939.m55941() >= 0) {
                                                iM559714 = C0946.m55979("ۧ᩶") ^ i20;
                                                i22 = ((iM559714 ^ i21) * 1489) ^ (-314844778);
                                                i23 = -161125259;
                                            } else {
                                                iM559714 = C0946.m55979("ۖܿ") ^ i20;
                                                i22 = ((iM559714 ^ i21) * (-25595)) ^ (-1176131150);
                                                i23 = -2077635976;
                                            }
                                            break;
                                        default:
                                            this.f35048 = this;
                                            if (C0892.f81851) {
                                                iM559714 = (C0946.m55979("᩵ۜ") + i21) * 55;
                                                i22 = ((iM559714 ^ i20) * (-3167)) ^ (-778616921);
                                                i23 = -2078867738;
                                            } else {
                                                iM559714 = C0946.m55979("ۜۡ") ^ i21;
                                                i22 = ((iM559714 ^ i20) * 28093) ^ 1896830035;
                                                i23 = -1986070069;
                                            }
                                            break;
                                    }
                                }
                            }
                        };
                        iM559712 = C0946.m55979(C1048.m56318(f82294, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 3, i));
                        if (C0894.m55769() >= 0) {
                            iM55979 = (C0873.m55680("֫ۘ") + i10) * 67;
                            i2 = ((iM55979 ^ i9) * (-10899)) ^ (-2019545834);
                            i3 = 1838277235;
                        } else {
                            iM55979 = (C0873.m55680("۬᩶") + i9) * 67;
                            i2 = ((iM55979 ^ i10) * 18861) ^ (-925429078);
                            i3 = 1459679137;
                        }
                        i4 = iM55979 ^ i3;
                        c20671M55888 = c20671;
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
                        c20671 = c20671M55888;
                        int iM55686 = (C0873.m55680("ۖۤ") ^ i9) * 41;
                        i12 = iM55686 ^ (-1879104791);
                        i11 = ((iM55686 ^ i10) * (-30385)) ^ 2038693380;
                        c20671M55888 = c20671;
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
                    c20671 = c20671M55888;
                    EditText editTextM55657 = C0866.m55656(textInputLayout3);
                    C0877.m55699(editTextM55657);
                    strM55639 = C0863.m55639(C0989.m56089(editTextM55657));
                    if (C24553.m54152(strM55639)) {
                        iM55979 = (i9 - C0946.m55979("ܳۡ")) * 27;
                        i2 = ((iM55979 ^ i10) * 25703) ^ 621780100;
                        i3 = 1503179065;
                    } else {
                        iM55979 = (C0873.m55680("ۡܳ") + i10) * (-23);
                        i2 = ((iM55979 ^ i9) * 29509) ^ (-717419368);
                        i3 = -864010068;
                    }
                    i4 = iM55979 ^ i3;
                    c20671M55888 = c20671;
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
                    c20671 = c20671M55888;
                    onClickListener = onClickListener;
                    i = i14;
                    TextInputLayout[] textInputLayoutArr2 = new TextInputLayout[3];
                    textInputLayout = this.f57399;
                    if (C1964.m56597() == 0) {
                        int iM559714 = (C0946.m55979("ᩳۘ") + i10) * (-83);
                        textInputLayoutArr = textInputLayoutArr2;
                        i11 = ((iM559714 ^ i9) * 23489) ^ (-1132416761);
                        c20671M55888 = c20671;
                        sArr = sArr;
                        c = 0;
                        i12 = iM559714 ^ 1384563088;
                        i14 = i;
                        onClickListener = onClickListener;
                    } else {
                        textInputLayoutArr = textInputLayoutArr2;
                        c = 0;
                        iM55979 = (C0873.m55680("֫ۘ") + i10) * 67;
                        i2 = ((iM55979 ^ i9) * (-10899)) ^ (-2019545834);
                        i3 = 1838277235;
                        i4 = iM55979 ^ i3;
                        c20671M55888 = c20671;
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
                    c20671 = c20671M55888;
                    EditText editTextM55658 = C0866.m55656(textInputLayout2);
                    C0877.m55699(editTextM55658);
                    if (C0894.m55770(editTextM55658) < 7) {
                        iM55979 = C0873.m55680("ۧܺ") ^ i9;
                        i2 = ((iM55979 ^ i10) * (-7997)) ^ (-1932815053);
                        i3 = -1446263260;
                    } else {
                        iM55979 = C0873.m55680("ۡ֨") ^ i10;
                        i2 = ((iM55979 ^ i9) * 2557) ^ (-509348818);
                        i3 = -1383603579;
                    }
                    i4 = iM55979 ^ i3;
                    c20671M55888 = c20671;
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
                    c20671M55888 = C0930.m55888(this.f57402);
                    strM56325 = C1053.m56325(f82294, 101, 3, i);
                    if (C0989.m56095() <= 0) {
                        iM559710 = C0946.m55979("ܳܶ") ^ i10;
                        i2 = ((iM559710 ^ i9) * (-12043)) ^ 1042240587;
                        i5 = -735419215;
                    } else {
                        iM559710 = C0946.m55979("᩸᩶") ^ i10;
                        i2 = ((iM559710 ^ i9) * 20545) ^ 1805098550;
                        i5 = 2103112719;
                    }
                    i4 = iM559710 ^ i5;
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
                    C1025.m56230();
                    break;
                default:
                    sArr = sArr;
                    c = c;
                    onClickListener = onClickListener;
                    i = i14;
                    c20671 = c20671M55888;
                    EditText editTextM55659 = C0866.m55656(textInputLayout2);
                    C0949.m56008(editTextM55659);
                    strM55592 = C0845.m55591(C1046.m56288(editTextM55659));
                    short[] sArr20 = f82294;
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0873.m55680("᩷֫") + i10) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i2 = ((iM55979 ^ i9) * 16079) ^ (-568624943);
                        i3 = -117576087;
                    } else if (new C6576(C0947.m55993(sArr20, 86, 3, i)).m15030((CharSequence) strM55592)) {
                        iM55979 = (i10 - C0946.m55979("֡ܰ")) * 17;
                        i2 = ((iM55979 ^ i9) * (-18669)) ^ 1217517198;
                        i3 = 777480705;
                    } else {
                        iM55979 = C0946.m55979("ۡ᩶") ^ i9;
                        i2 = ((iM55979 ^ i10) * (-8537)) ^ 47084209;
                        i3 = -1118852692;
                    }
                    i4 = iM55979 ^ i3;
                    c20671M55888 = c20671;
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
    /* JADX INFO: renamed from: ֫ */
    public static void m43745(C14853 c14853, View view, ViewOnClickListenerC19209 viewOnClickListenerC19209, String str, String str2, C25065 c25065) {
        int iM55979;
        int i;
        int iM559710;
        int i2;
        int i3;
        TextInputLayout textInputLayout;
        int iM559711;
        int i4;
        int iM55680;
        int i5;
        int i6;
        ViewOnClickListenerC19209 viewOnClickListenerC192010 = viewOnClickListenerC19209;
        C25065 c25066 = c25065;
        int i7 = C1053.f81965;
        int i8 = C1404.f82149;
        int iM559712 = C0946.m55979("᩷۫") ^ i8;
        int i9 = ((iM559712 ^ i7) * (-21433)) ^ (-1659496510);
        String strM56293 = null;
        String strM56203 = null;
        String strM55618 = null;
        short[] sArr = null;
        int i10 = iM559712 ^ 1140523373;
        TextInputLayout textInputLayout2 = null;
        int iM56557 = 0;
        int iM55681 = 0;
        int iM55682 = 0;
        int iM55683 = 0;
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
                        iM55979 = (i7 - C0946.m55979("᩻ۗ")) * 23;
                        i9 = (-1614833296) ^ ((iM55979 ^ i8) * (-12737));
                        i = -1320900396;
                    } else {
                        iM55979 = C0873.m55680("ۚܶ") ^ i8;
                        i9 = 420886080 ^ ((iM55979 ^ i7) * (-32759));
                        i = 1652559195;
                    }
                    int i14 = iM55979 ^ i;
                    c25066 = c25065;
                    textInputLayout2 = textInputLayout2;
                    i10 = i14;
                    viewOnClickListenerC192010 = viewOnClickListenerC19209;
                    break;
                case -1941717905:
                case 157390203:
                    textInputLayout = viewOnClickListenerC192010.f57399;
                    strM56293 = C1046.m56293(f82294, 57, 6, i11);
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM559711 = C0873.m55680("ۖۛ") ^ i7;
                        i9 = ((iM559711 ^ i8) * 601) ^ 701209540;
                        i4 = -322603143;
                    } else {
                        iM559711 = (C0946.m55979("ۤܽ") + i7) * 51;
                        i9 = ((iM559711 ^ i8) * 13449) ^ 1447502628;
                        i4 = 451302498;
                    }
                    i10 = iM559711 ^ i4;
                    viewOnClickListenerC192010 = viewOnClickListenerC19209;
                    textInputLayout2 = textInputLayout;
                    c25066 = c25065;
                    break;
                case -1747837691:
                case -1043542521:
                    textInputLayout2 = textInputLayout2;
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("ᩴ᩸") ^ i8;
                        i9 = (-168585582) ^ ((iM55979 ^ i7) * (-3341));
                        i = -1943350797;
                    } else {
                        iM55979 = (i7 - C0946.m55979("ܰ᩺")) * 83;
                        i9 = (-122665411) ^ ((iM55979 ^ i8) * (-24523));
                        i = -736829955;
                    }
                    int i15 = iM55979 ^ i;
                    c25066 = c25065;
                    textInputLayout2 = textInputLayout2;
                    i10 = i15;
                    viewOnClickListenerC192010 = viewOnClickListenerC19209;
                    break;
                case -1416199624:
                case -163573457:
                    AbstractC0942.m55968(textInputLayout2, 2099375451 ^ iM55682);
                    C10027 c10027 = C10027.f27775;
                    break;
                case -1362135607:
                case 234343554:
                    ServiceConnectionC1013.m56157();
                    C0892.m55749();
                    break;
                case -1358055228:
                case 763648263:
                    textInputLayout2 = textInputLayout2;
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0873.m55680("ۖۖ") ^ i8;
                        i9 = 1682924199 ^ ((iM55979 ^ i7) * 29039);
                        i = 2061862965;
                    } else {
                        iM55979 = (C0946.m55979("۫֫") + i8) * 123;
                        i9 = 1879415537 ^ ((iM55979 ^ i7) * 32493);
                        i = 342456691;
                    }
                    int i16 = iM55979 ^ i;
                    c25066 = c25065;
                    textInputLayout2 = textInputLayout2;
                    i10 = i16;
                    viewOnClickListenerC192010 = viewOnClickListenerC19209;
                    break;
                case -1336440568:
                case -915792700:
                    textInputLayout3 = viewOnClickListenerC192010.f57401;
                    strM55618 = C0861.m55618(f82294, 72, 3, i11);
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("ۤ᩹") ^ i8;
                        i5 = ((iM55680 ^ i7) * (-20559)) ^ 751285081;
                        i6 = -1650953893;
                    } else {
                        iM55680 = (C0873.m55680("ۖۤ") ^ i8) * (-3);
                        i5 = ((iM55680 ^ i7) * (-1857)) ^ (-36433319);
                        i6 = -1389753407;
                    }
                    i10 = iM55680 ^ i6;
                    i9 = i5;
                    break;
                case -1336391598:
                case 1609890873:
                    iM55681 = C0873.m55680(C0967.m56077(f82294, 66, 3, i11));
                    if (C0882.m55710() != 0) {
                        iM55680 = C0873.m55680("ۤ᩹") ^ i8;
                        i5 = ((iM55680 ^ i7) * (-20559)) ^ 751285081;
                        i6 = -1650953893;
                    } else {
                        iM55680 = C0873.m55680("᩷֫") ^ i8;
                        i5 = ((iM55680 ^ i7) * 23437) ^ 677390618;
                        i6 = 1838143078;
                    }
                    i10 = iM55680 ^ i6;
                    i9 = i5;
                    break;
                case -1214447216:
                case 61459300:
                    C0927.m55873();
                    textInputLayout2 = textInputLayout2;
                    iM55979 = C0873.m55680("ۖۖ") ^ i8;
                    i9 = 1682924199 ^ ((iM55979 ^ i7) * 29039);
                    i = 2061862965;
                    int i17 = iM55979 ^ i;
                    c25066 = c25065;
                    textInputLayout2 = textInputLayout2;
                    i10 = i17;
                    viewOnClickListenerC192010 = viewOnClickListenerC19209;
                    break;
                case -1180251314:
                case -607173036:
                    RunnableC1014.m56168(textInputLayout2, 2122558323 ^ iM55681);
                    C10027 c10028 = C10027.f27775;
                    break;
                case -1177403470:
                case -418992629:
                    textInputLayout2 = textInputLayout2;
                    iM56557 = C1929.m56557(c25065);
                    if (iM56557 != 1000) {
                        iM559710 = C0946.m55979("᩷۬") ^ i7;
                        i2 = ((iM559710 ^ i8) * 12053) ^ (-1050048125);
                        i3 = 1768854607;
                    } else {
                        iM559710 = C0946.m55979("ۜ۬") ^ i7;
                        i2 = ((iM559710 ^ i8) * (-28427)) ^ 1006379839;
                        i3 = 1806175873;
                    }
                    TextInputLayout textInputLayout4 = textInputLayout2;
                    i10 = iM559710 ^ i3;
                    i9 = i2;
                    textInputLayout2 = textInputLayout4;
                    break;
                case -1165380698:
                case -404662799:
                    C1024.m56202(i13);
                    C1024.m56208(viewOnClickListenerC192010.f57403);
                    new ViewOnClickListenerC2424(viewOnClickListenerC192010.f57402, str, str2, null);
                    break;
                case -1110768709:
                case 1692967885:
                    if (iM56557 != 1100) {
                        iM55680 = C0946.m55979("۬᩶") ^ i7;
                        i5 = ((iM55680 ^ i8) * (-4661)) ^ 1034403625;
                        i6 = 1128452206;
                    } else {
                        iM55680 = C0873.m55680("᩻᩶") ^ i8;
                        i5 = ((iM55680 ^ i7) * (-17511)) ^ (-230414085);
                        i6 = 490960035;
                    }
                    i10 = iM55680 ^ i6;
                    i9 = i5;
                    break;
                case -982949677:
                case 1212011286:
                    iM55682 = C0873.m55680(C1028.m56235(f82294, 69, 3, i11));
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0873.m55680("ۤ᩹") ^ i8;
                        i5 = ((iM55680 ^ i7) * (-20559)) ^ 751285081;
                        i6 = -1650953893;
                    } else {
                        iM55680 = C0873.m55680("ۢܽ") ^ i7;
                        i5 = ((iM55680 ^ i8) * 29325) ^ (-689752620);
                        i6 = -1038293860;
                    }
                    i10 = iM55680 ^ i6;
                    i9 = i5;
                    break;
                case -661027692:
                case 128680441:
                    if (C0947.f81895) {
                        iM55680 = C0873.m55680("ۤ᩹") ^ i8;
                        i5 = ((iM55680 ^ i7) * (-20559)) ^ 751285081;
                        i6 = -1650953893;
                    } else {
                        iM55680 = (C0873.m55680("᩸ۤ") ^ i7) * (-27);
                        i5 = ((iM55680 ^ i8) * 15547) ^ (-841086324);
                        i6 = 2052118960;
                    }
                    i10 = iM55680 ^ i6;
                    i9 = i5;
                    break;
                case -511052351:
                case -308293677:
                    textInputLayout2 = textInputLayout2;
                    strM56203 = C1024.m56203(f82294, 63, 3, i11);
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM559710 = C0946.m55979("ۡ᩸") ^ i8;
                        i2 = ((iM559710 ^ i7) * 2777) ^ 712785278;
                        i3 = -373987055;
                        TextInputLayout textInputLayout5 = textInputLayout2;
                        i10 = iM559710 ^ i3;
                        i9 = i2;
                        textInputLayout2 = textInputLayout5;
                    } else {
                        iM55979 = C0873.m55680("ᩴ᩸") ^ i8;
                        i9 = (-168585582) ^ ((iM55979 ^ i7) * (-3341));
                        i = -1943350797;
                        int i18 = iM55979 ^ i;
                        c25066 = c25065;
                        textInputLayout2 = textInputLayout2;
                        i10 = i18;
                        viewOnClickListenerC192010 = viewOnClickListenerC19209;
                    }
                    break;
                case -462242968:
                case 45743200:
                    i11 = 32172;
                    iM55979 = (i7 - C0873.m55680("۟ܰ")) * (-121);
                    i9 = 1467189699 ^ ((iM55979 ^ i8) * 21219);
                    i = -862248146;
                    int i19 = iM55979 ^ i;
                    c25066 = c25065;
                    textInputLayout2 = textInputLayout2;
                    i10 = i19;
                    viewOnClickListenerC192010 = viewOnClickListenerC19209;
                    break;
                case -456924089:
                case 1372388186:
                    textInputLayout2 = textInputLayout2;
                    sArr = f82294;
                    c = '8';
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("ᩴ᩸") ^ i8;
                        i9 = (-168585582) ^ ((iM55979 ^ i7) * (-3341));
                        i = -1943350797;
                    } else {
                        iM55979 = (C0873.m55680("֫ۧ") + i8) * (-55);
                        i9 = (-1152142313) ^ ((iM55979 ^ i7) * (-32057));
                        i = -517792511;
                    }
                    int i110 = iM55979 ^ i;
                    c25066 = c25065;
                    textInputLayout2 = textInputLayout2;
                    i10 = i110;
                    viewOnClickListenerC192010 = viewOnClickListenerC19209;
                    break;
                case -322055134:
                case 229120811:
                    C22682.m50796(AbstractC0942.m55960(c25066, 2116813762 ^ iM55683));
                    break;
                case -292398950:
                case 1236444786:
                    RunnableC1014.m56177();
                    if (C0992.f81922 < 0) {
                        iM55680 = (C0873.m55680("᩸ۤ") ^ i7) * (-27);
                        i5 = ((iM55680 ^ i8) * 15547) ^ (-841086324);
                        i6 = 2052118960;
                        i10 = iM55680 ^ i6;
                        i9 = i5;
                    } else {
                        textInputLayout2 = textInputLayout2;
                        iM55979 = C0873.m55680("ۖۖ") ^ i8;
                        i9 = 1682924199 ^ ((iM55979 ^ i7) * 29039);
                        i = 2061862965;
                        int i111 = iM55979 ^ i;
                        c25066 = c25065;
                        textInputLayout2 = textInputLayout2;
                        i10 = i111;
                        viewOnClickListenerC192010 = viewOnClickListenerC19209;
                    }
                    break;
                case -282258318:
                case 1953392209:
                    TextInputLayout textInputLayout6 = textInputLayout2;
                    RunnableC0871.m55661(c25066, strM56293);
                    C1036.m56253(c14853);
                    C1964.m56595(view, true);
                    if (C0930.m55892(c25065)) {
                        int iM559713 = (C0946.m55979("ۡۛ") + i7) * (-15);
                        textInputLayout2 = textInputLayout6;
                        i10 = iM559713 ^ 51609329;
                        i9 = ((iM559713 ^ i8) * 2753) ^ (-1251843444);
                    } else {
                        int iM559714 = C0946.m55979("۬ܳ") ^ i8;
                        i9 = ((iM559714 ^ i7) * 19217) ^ (-383355974);
                        textInputLayout2 = textInputLayout6;
                        i10 = iM559714 ^ 858543344;
                    }
                    c25066 = c25065;
                    break;
                case -25805361:
                case 1033871770:
                    int iM55684 = C0873.m55680(strM56203) ^ 2118951463;
                    if (C0882.f81846) {
                        i13 = iM55684;
                        textInputLayout2 = textInputLayout2;
                        iM55979 = C0873.m55680("ۖۖ") ^ i8;
                        i9 = 1682924199 ^ ((iM55979 ^ i7) * 29039);
                        i = 2061862965;
                        int i112 = iM55979 ^ i;
                        c25066 = c25065;
                        textInputLayout2 = textInputLayout2;
                        i10 = i112;
                        viewOnClickListenerC192010 = viewOnClickListenerC19209;
                    } else {
                        int iM559715 = (i8 - C0946.m55979("ۜ᩵")) * (-61);
                        i9 = ((iM559715 ^ i7) * 18205) ^ (-652765750);
                        i10 = iM559715 ^ (-928764913);
                        i13 = iM55684;
                    }
                    break;
                case 137643625:
                case 1476638795:
                    if (C1071.f81975 > 0) {
                        textInputLayout = textInputLayout2;
                        iM559711 = C0873.m55680("ۖۛ") ^ i7;
                        i9 = ((iM559711 ^ i8) * 601) ^ 701209540;
                        i4 = -322603143;
                        i10 = iM559711 ^ i4;
                        viewOnClickListenerC192010 = viewOnClickListenerC19209;
                        textInputLayout2 = textInputLayout;
                        c25066 = c25065;
                    } else {
                        iM55680 = (C0873.m55680("᩸ۤ") ^ i7) * (-27);
                        i5 = ((iM55680 ^ i8) * 15547) ^ (-841086324);
                        i6 = 2052118960;
                        i10 = iM55680 ^ i6;
                        i9 = i5;
                    }
                    break;
                case 777326059:
                case 1514741196:
                    AbstractC0942.m55968(textInputLayout3, C0946.m55979(strM55618) ^ 2128003516);
                    C10027 c10029 = C10027.f27775;
                    break;
                case 1563526706:
                case 1916551908:
                    if (iM56557 != 1003) {
                        iM55680 = C0946.m55979("ۜ֫") ^ i7;
                        i5 = ((iM55680 ^ i8) * 32257) ^ (-2049425875);
                        i6 = -1986531108;
                    } else {
                        iM55680 = (i8 - C0946.m55979("ܽۢ")) * 37;
                        i5 = ((iM55680 ^ i7) * 9447) ^ (-1566987496);
                        i6 = 1822383712;
                    }
                    i10 = iM55680 ^ i6;
                    i9 = i5;
                    break;
                case 1674880431:
                case 1998456908:
                    iM55683 = C0873.m55680(C0917.m55852(f82294, 75, 3, i11));
                    if (!C1404.m56468()) {
                        textInputLayout = textInputLayout2;
                        iM559711 = C0873.m55680("ۖۛ") ^ i7;
                        i9 = ((iM559711 ^ i8) * 601) ^ 701209540;
                        i4 = -322603143;
                        i10 = iM559711 ^ i4;
                        viewOnClickListenerC192010 = viewOnClickListenerC19209;
                        textInputLayout2 = textInputLayout;
                        c25066 = c25065;
                    } else {
                        iM55680 = C0873.m55680("۠۬") ^ i7;
                        i5 = ((iM55680 ^ i8) * (-8407)) ^ 1083654865;
                        i6 = -661577466;
                        i10 = iM55680 ^ i6;
                        i9 = i5;
                    }
                    break;
                default:
                    i11 = 13306;
                    iM55979 = (i7 - C0873.m55680("۟ܰ")) * (-121);
                    i9 = 1467189699 ^ ((iM55979 ^ i8) * 21219);
                    i = -862248146;
                    int i113 = iM55979 ^ i;
                    c25066 = c25065;
                    textInputLayout2 = textInputLayout2;
                    i10 = i113;
                    viewOnClickListenerC192010 = viewOnClickListenerC19209;
                    break;
            }
            return;
        }
    }
}
