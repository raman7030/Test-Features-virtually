package l;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܳ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5YY */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC14170 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩴ֫ۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f42777 = {9992, 16523, 16521, 16542, 16515, 16540, 16515, 16542, 16531, 16518, 16517, 16525, 16515, 16516, 16558, 16515, 16523, 16518, 16517, 16525, -12184, -13230, -13114, 4092, 11920, -12815, 16524, 16515, 16516, 16526, 16572, 16515, 16527, 16541, 16552, 16531, 16547, 16526, 16578, 16580, 16580, 16580, 16579, 16543, 16537, 16527, 16536, 16565, 16516, 16523, 16519, 16527, 8322, 12710, -10543, 9164, 16213, 14380, -11602, -13011, 14440, 9645, 11442, 5276, 5989, -21382, -21395, -21381, -21379, -21404, -21380, -9106, -7474, 12738, -21397, -21404, -21407, -21384, -21398, -21401, -21399, -21382, -21396, -21402, -21379, -21404, -21404, -21464, -21397, -21399, -21402, -21402, -21401, -21380, -21464, -21398, -21395, -21464, -21397, -21399, -21381, -21380, -21464, -21380, -21401, -21464, -21402, -21401, -21402, -21467, -21402, -21379, -21404, -21404, -21464, -21380, -21391, -21384, -21395, -21464, -21399, -21402, -21396, -21382, -21401, -21407, -21396, -21466, -21380, -21395, -21392, -21380, -21466, -21429, -21404, -21407, -21384, -21398, -21401, -21399, -21382, -21396, -21435, -21399, -21402, -21399, -21393, -21395, -21382, 10143, -7667, 11120, -14998, -3745, -12507, 12269, -267, -10572, 14404, -14783, -4030, 6334, -19516, -19501, -19515, -19517, -19494, -19518, 15111, 15092, -15353, 15375, -15571, 8277, 14654, 14450, -6398, -15885, -14023, 12872, 3252, 5369, 27932, -28530, 32239, 25957, 27262, 19171, 19550, 23265, 28623, 26101, 29754, 29203, -31338, 16687, -27930, -31271, 18946, 27765};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f42778;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f42779;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f42780;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f42781;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f42782;

    public ViewOnClickListenerC14170(AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206) {
        View view;
        EditText editText;
        InterfaceC12344 interfaceC12344;
        int i;
        short[] sArr;
        int i2;
        int iM6981;
        int i3;
        int i4;
        View view2;
        EditText editText2;
        InterfaceC12344 interfaceC12345;
        int i5;
        short[] sArr2;
        String strM16034;
        View view3;
        int iM2566;
        String str;
        int i6;
        int i7;
        int iM2567;
        int i8;
        InterfaceC12344 interfaceC12346;
        EditText editText3;
        ViewOnClickListenerC14170 viewOnClickListenerC14170 = this;
        final DialogInterfaceC0206 dialogInterfaceC0207 = dialogInterfaceC0206;
        int i9 = ViewOnClickListenerC1958.f6529;
        int i10 = C1294.f4556;
        short s = f42777[0];
        int i11 = (s * 27818) - ((s * s) + 193460281) > 0 ? 58403 : 16618;
        RunnableC0588.m2430(abstractActivityC3346, C4263.m12817(f42777, 1, 8, i11));
        RunnableC0588.m2430(dialogInterfaceC0207, C4117.m12355(f42777, 9, 11, i11));
        int iM6982 = (C2105.m6981("۫᩺") ^ i9) * (-35);
        EditText editTextM5905 = null;
        InterfaceC12344 interfaceC12347 = null;
        TextInputLayout textInputLayout = null;
        C19258 c19258M2130 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i12 = 0;
        String str2 = null;
        int iM2568 = 0;
        int iM2569 = 0;
        int i13 = 0;
        int iM6983 = 0;
        int i14 = 0;
        int iM25610 = 0;
        int iM6984 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View viewM3507 = null;
        int i18 = 1922114068;
        int i19 = ((iM6982 ^ i10) * (-13823)) ^ (-448016456);
        TextInputLayout textInputLayout2 = null;
        short[] sArr6 = null;
        TextInputLayout textInputLayout3 = null;
        int i20 = 0;
        int i21 = iM6982 ^ (-1880769767);
        View viewM10739 = null;
        while (true) {
            i18 = i21 ^ (i19 & (((i18 ^ i10) * 2285) >> 31));
            switch (i18) {
                case -1749747101:
                case 964224188:
                    C4925.m14329(C0483.m2132(textInputLayout3));
                    return;
                case -1748544304:
                case 81411096:
                    viewOnClickListenerC14170.f42780 = C3683.m11213(c19258M2130);
                    EditText editTextM2132 = C0483.m2132(textInputLayout3);
                    C2167.m7151(editTextM2132);
                    if (C1047.m3600(editTextM2132) > 0) {
                        iM2567 = C0630.m2566("᩷ۜ") ^ i10;
                        i19 = ((iM2567 ^ i9) * 18065) ^ (-1241880367);
                        i8 = 168422332;
                    } else {
                        iM2567 = (C2105.m6981("۠ۛ") ^ i10) * (-15);
                        i19 = ((iM2567 ^ i9) * (-27269)) ^ 1092535074;
                        i8 = 691366579;
                    }
                    i21 = iM2567 ^ i8;
                    break;
                case -1704523002:
                case 245137718:
                    iM6984 = C2105.m6981(C4616.m13542(f42777, 58, 3, i11));
                    i15 = 2101130363;
                    iM2567 = C2105.m6981("ۨۤ") ^ i9;
                    i19 = ((iM2567 ^ i10) * 17267) ^ 1859448257;
                    i8 = -1557850840;
                    i21 = iM2567 ^ i8;
                    break;
                case -1701420524:
                case -265300847:
                    C0050.m940();
                    C1916.m6308();
                    throw new RuntimeException();
                case -1691100089:
                case 2037074752:
                    C1504.m5179();
                    if (!C3663.f11553) {
                        view2 = viewM3507;
                        int iM6985 = C2105.m6981("۫ۗ") ^ i9;
                        dialogInterfaceC0207 = dialogInterfaceC0206;
                        viewM3507 = view2;
                        i21 = iM6985 ^ (-1446969640);
                        i19 = ((iM6985 ^ i10) * (-20941)) ^ (-1371964666);
                    } else {
                        iM2567 = C0630.m2566("ۙۖ") ^ i10;
                        i19 = ((iM2567 ^ i9) * 29833) ^ (-922230510);
                        i8 = -710065090;
                        i21 = iM2567 ^ i8;
                    }
                    break;
                case -1637989296:
                case -790838082:
                    C0287.m1629(textInputLayout);
                    c19258M2130 = C0483.m2130(abstractActivityC3346);
                    C1711.m5727(c19258M2130, viewM10739);
                    c19258M2130.m44419(new DialogInterface.OnCancelListener() { // from class: l.֫֡ۡ
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            dialogInterfaceC0207.m1449();
                        }
                    });
                    iM2567 = C2105.m6981("۠᩺") ^ i9;
                    i19 = ((iM2567 ^ i10) * 13673) ^ (-1281699522);
                    i8 = 1358526389;
                    i21 = iM2567 ^ i8;
                    break;
                case -1606372098:
                case 1872295847:
                    iM2568 = C0630.m2566(C4075.m12252(sArr5, 61, 3, i11)) ^ 2122555904;
                    iM2567 = (i10 - C2105.m6981("᩵ܰ")) * 5;
                    i19 = ((iM2567 ^ i9) * 5593) ^ (-636337537);
                    i8 = 2103514640;
                    i21 = iM2567 ^ i8;
                    break;
                case -1526569262:
                case 771084138:
                    EditText editTextM2133 = C0483.m2132(textInputLayout2);
                    C2167.m7151(editTextM2133);
                    C1711.m5740(editTextM2133);
                    C4925.m14329(C1773.m5905(textInputLayout2));
                    return;
                case -1438443322:
                case 1479586870:
                    interfaceC12346 = interfaceC12347;
                    editText3 = editTextM5905;
                    C1047.m3601(editText3, C4263.m12825(interfaceC12346, C22628.m50602(sArr4, i12, 9, i11), null));
                    if (C1294.f4556 >= 0) {
                        int iM6986 = C2105.m6981("᩻ۛ") ^ i10;
                        int i22 = i12;
                        int i23 = ((iM6986 ^ i9) * 19667) ^ 215959379;
                        i21 = iM6986 ^ (-698300757);
                        interfaceC12347 = interfaceC12346;
                        EditText editText4 = editText3;
                        i19 = i23;
                        i12 = i22;
                        editTextM5905 = editText4;
                    } else {
                        int i24 = i12;
                        int iM25611 = (i10 - C0630.m2566("ᩳܿ")) * (-85);
                        int i25 = ((iM25611 ^ i9) * 25279) ^ 1551575836;
                        interfaceC12347 = interfaceC12346;
                        i21 = iM25611 ^ 704506417;
                        i12 = i24;
                        editTextM5905 = editText3;
                        i19 = i25;
                    }
                    break;
                case -1245358983:
                case 1503253264:
                    editText2 = editTextM5905;
                    interfaceC12345 = interfaceC12347;
                    i5 = i12;
                    sArr2 = sArr3;
                    strM16034 = C5695.m16034(sArr2, 26, 17, i11);
                    view3 = viewM3507;
                    C2126.m7031(view3, strM16034);
                    textInputLayout3 = (TextInputLayout) view3;
                    if (C21923.f70183 != 0) {
                        iM2566 = (C2105.m6981("ۧܳ") + i9) * (-3);
                        str = strM16034;
                        i6 = ((iM2566 ^ i10) * (-16349)) ^ 2082036788;
                        i7 = -388568236;
                    } else {
                        iM2566 = (C0630.m2566("ۘۨ") ^ i10) * (-53);
                        str = strM16034;
                        i6 = ((iM2566 ^ i9) * (-28859)) ^ 245129931;
                        i7 = -1950836249;
                    }
                    int i26 = iM2566 ^ i7;
                    interfaceC12347 = interfaceC12345;
                    EditText editText5 = editText2;
                    i19 = i6;
                    i12 = i5;
                    editTextM5905 = editText5;
                    viewM3507 = view3;
                    i21 = i26;
                    String str3 = str;
                    sArr3 = sArr2;
                    str2 = str3;
                    break;
                case -916959546:
                case 1682206123:
                    View viewM28028 = C11340.m28028(viewM10739, iM25610 ^ i20);
                    C4159.m12575(viewM28028, str2);
                    textInputLayout = (TextInputLayout) viewM28028;
                    viewOnClickListenerC14170.f42782 = textInputLayout;
                    if (C11340.f33930 < 0) {
                        iM2567 = (i9 - C0630.m2566("ۤ᩶")) * (-17);
                        i19 = ((iM2567 ^ i10) * (-12059)) ^ 1441062928;
                        i8 = 1731102909;
                        i21 = iM2567 ^ i8;
                    } else {
                        editText3 = editTextM5905;
                        interfaceC12346 = interfaceC12347;
                        int iM6987 = C2105.m6981("᩻ۛ") ^ i10;
                        int i27 = i12;
                        int i28 = ((iM6987 ^ i9) * 19667) ^ 215959379;
                        i21 = iM6987 ^ (-698300757);
                        interfaceC12347 = interfaceC12346;
                        EditText editText6 = editText3;
                        i19 = i28;
                        i12 = i27;
                        editTextM5905 = editText6;
                    }
                    break;
                case -908117648:
                case 367691761:
                    view2 = viewM3507;
                    EditText editText7 = editTextM5905;
                    InterfaceC12344 interfaceC12348 = interfaceC12347;
                    int i29 = i12;
                    viewM10739 = C3537.m10739(abstractActivityC3346, iM2569 ^ i13);
                    sArr6 = f42777;
                    i16 = 23;
                    i17 = 3;
                    if (C1916.f6442) {
                        int iM6988 = C2105.m6981("ۖۢ") ^ i10;
                        int i30 = ((iM6988 ^ i9) * 21627) ^ 495296866;
                        dialogInterfaceC0207 = dialogInterfaceC0206;
                        interfaceC12347 = interfaceC12348;
                        i21 = iM6988 ^ (-967025216);
                        i12 = i29;
                        editTextM5905 = editText7;
                        i19 = i30;
                        viewM10739 = viewM10739;
                        viewM3507 = view2;
                    } else {
                        interfaceC12347 = interfaceC12348;
                        i12 = i29;
                        editTextM5905 = editText7;
                        int iM6989 = C2105.m6981("۫ۗ") ^ i9;
                        dialogInterfaceC0207 = dialogInterfaceC0206;
                        viewM3507 = view2;
                        i21 = iM6989 ^ (-1446969640);
                        i19 = ((iM6989 ^ i10) * (-20941)) ^ (-1371964666);
                    }
                    break;
                case -892091548:
                case 1435822182:
                    iM6983 = C2105.m6981(C3911.m11919(f42777, 52, 3, i11));
                    i14 = 2121412869;
                    iM2567 = C0630.m2566("ܿ֡") ^ i10;
                    i19 = ((iM2567 ^ i9) * (-7665)) ^ (-1350955947);
                    i8 = 1634318562;
                    i21 = iM2567 ^ i8;
                    break;
                case -832444277:
                case -236213924:
                    View viewM28029 = C11340.m28028(viewM10739, iM6983 ^ i14);
                    C4159.m12575(viewM28029, str2);
                    textInputLayout2 = (TextInputLayout) viewM28029;
                    if (C0483.f2088 < 0) {
                        iM2567 = (C0630.m2566("᩻ۖ") ^ i9) * 109;
                        i19 = ((iM2567 ^ i10) * 1317) ^ (-965028591);
                        i8 = -400899627;
                        i21 = iM2567 ^ i8;
                    } else {
                        editText3 = editTextM5905;
                        interfaceC12346 = interfaceC12347;
                        int iM69810 = C2105.m6981("᩻ۛ") ^ i10;
                        int i210 = i12;
                        int i211 = ((iM69810 ^ i9) * 19667) ^ 215959379;
                        i21 = iM69810 ^ (-698300757);
                        interfaceC12347 = interfaceC12346;
                        EditText editText8 = editText3;
                        i19 = i211;
                        i12 = i210;
                        editTextM5905 = editText8;
                    }
                    break;
                case -771748222:
                case -150573597:
                    C2126.m7039((Button) C1005.m3507(viewM10739, iM6984 ^ i15), viewOnClickListenerC14170);
                    sArr5 = f42777;
                    if (C0630.f2410 > 0) {
                        iM2567 = C0630.m2566("᩵ܽ") ^ i10;
                        i19 = ((iM2567 ^ i9) * (-20683)) ^ (-2048220579);
                        i8 = 256588221;
                        i21 = iM2567 ^ i8;
                    } else {
                        view3 = viewM3507;
                        editText2 = editTextM5905;
                        interfaceC12345 = interfaceC12347;
                        i5 = i12;
                        strM16034 = str2;
                        sArr2 = sArr3;
                        iM2566 = (C2105.m6981("ۧܳ") + i9) * (-3);
                        str = strM16034;
                        i6 = ((iM2566 ^ i10) * (-16349)) ^ 2082036788;
                        i7 = -388568236;
                        int i212 = iM2566 ^ i7;
                        interfaceC12347 = interfaceC12345;
                        EditText editText9 = editText2;
                        i19 = i6;
                        i12 = i5;
                        editTextM5905 = editText9;
                        viewM3507 = view3;
                        i21 = i212;
                        String str4 = str;
                        sArr3 = sArr2;
                        str2 = str4;
                    }
                    break;
                case -347828093:
                case 1928783299:
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        iM2567 = C0630.m2566("ۙۖ") ^ i10;
                        i19 = ((iM2567 ^ i9) * 29833) ^ (-922230510);
                        i8 = -710065090;
                        i21 = iM2567 ^ i8;
                    } else {
                        view = viewM3507;
                        editText = editTextM5905;
                        interfaceC12344 = interfaceC12347;
                        i = i12;
                        int i31 = i17;
                        sArr = sArr6;
                        i2 = i31;
                        iM6981 = (C0630.m2566("ܿ۫") + i9) * 25;
                        i3 = ((iM6981 ^ i10) * 15165) ^ (-913735387);
                        i4 = -1391999969;
                        int i32 = iM6981 ^ i4;
                        dialogInterfaceC0207 = dialogInterfaceC0206;
                        viewM3507 = view;
                        interfaceC12347 = interfaceC12344;
                        i21 = i32;
                        viewOnClickListenerC14170 = this;
                        EditText editText10 = editText;
                        i19 = i3;
                        i12 = i;
                        editTextM5905 = editText10;
                        short[] sArr7 = sArr;
                        i17 = i2;
                        sArr6 = sArr7;
                    }
                    break;
                case -254878367:
                case 1471634570:
                    view = viewM3507;
                    editText = editTextM5905;
                    interfaceC12344 = interfaceC12347;
                    i = i12;
                    int i33 = i17;
                    sArr = sArr6;
                    i2 = i33;
                    viewOnClickListenerC14170.f42781 = abstractActivityC3346;
                    iM2569 = C0630.m2566(RunnableC1937.m6385(f42777, 20, 3, i11));
                    i13 = 2101153649;
                    if (C4075.m12263() <= 0) {
                        iM6981 = (C0630.m2566("ܿ۫") + i9) * 25;
                        i3 = ((iM6981 ^ i10) * 15165) ^ (-913735387);
                        i4 = -1391999969;
                    } else {
                        iM6981 = C2105.m6981("ܳ۟") ^ i9;
                        i3 = ((iM6981 ^ i10) * (-22045)) ^ 338838705;
                        i4 = -1644397749;
                    }
                    int i34 = iM6981 ^ i4;
                    dialogInterfaceC0207 = dialogInterfaceC0206;
                    viewM3507 = view;
                    interfaceC12347 = interfaceC12344;
                    i21 = i34;
                    viewOnClickListenerC14170 = this;
                    EditText editText11 = editText;
                    i19 = i3;
                    i12 = i;
                    editTextM5905 = editText11;
                    short[] sArr8 = sArr;
                    i17 = i2;
                    sArr6 = sArr8;
                    break;
                case -232665709:
                case 2057644296:
                    C0964.m3413();
                    C0483.m2121();
                    view = viewM3507;
                    editText = editTextM5905;
                    interfaceC12344 = interfaceC12347;
                    i = i12;
                    int i35 = i17;
                    sArr = sArr6;
                    i2 = i35;
                    iM6981 = (C0630.m2566("ܿ۫") + i9) * 25;
                    i3 = ((iM6981 ^ i10) * 15165) ^ (-913735387);
                    i4 = -1391999969;
                    int i36 = iM6981 ^ i4;
                    dialogInterfaceC0207 = dialogInterfaceC0206;
                    viewM3507 = view;
                    interfaceC12347 = interfaceC12344;
                    i21 = i36;
                    viewOnClickListenerC14170 = this;
                    EditText editText12 = editText;
                    i19 = i3;
                    i12 = i;
                    editTextM5905 = editText12;
                    short[] sArr9 = sArr;
                    i17 = i2;
                    sArr6 = sArr9;
                    break;
                case -211684240:
                case 377122816:
                    C4159.m12564((Button) C1005.m3507(viewM10739, iM2568), viewOnClickListenerC14170);
                    C0287.m1629(textInputLayout3);
                    C0287.m1629(textInputLayout2);
                    if (C2958.f9394 < 0) {
                        iM2567 = C0630.m2566("ᩳᩳ") ^ i9;
                        i19 = ((iM2567 ^ i10) * (-23569)) ^ (-1617442006);
                        i8 = -897667577;
                        i21 = iM2567 ^ i8;
                    } else {
                        editText3 = editTextM5905;
                        interfaceC12346 = interfaceC12347;
                        int iM69811 = C2105.m6981("᩻ۛ") ^ i10;
                        int i213 = i12;
                        int i214 = ((iM69811 ^ i9) * 19667) ^ 215959379;
                        i21 = iM69811 ^ (-698300757);
                        interfaceC12347 = interfaceC12346;
                        EditText editText13 = editText3;
                        i19 = i214;
                        i12 = i213;
                        editTextM5905 = editText13;
                    }
                    break;
                case -35420253:
                case 1384665173:
                    if (C3537.f11231 >= 0) {
                        view3 = viewM3507;
                        editText2 = editTextM5905;
                        interfaceC12345 = interfaceC12347;
                        i5 = i12;
                        strM16034 = str2;
                        sArr2 = sArr3;
                        iM2566 = (C2105.m6981("ۧܳ") + i9) * (-3);
                        str = strM16034;
                        i6 = ((iM2566 ^ i10) * (-16349)) ^ 2082036788;
                        i7 = -388568236;
                        int i215 = iM2566 ^ i7;
                        interfaceC12347 = interfaceC12345;
                        EditText editText14 = editText2;
                        i19 = i6;
                        i12 = i5;
                        editTextM5905 = editText14;
                        viewM3507 = view3;
                        i21 = i215;
                        String str5 = str;
                        sArr3 = sArr2;
                        str2 = str5;
                    } else {
                        iM2567 = C0630.m2566("ۙۖ") ^ i10;
                        i19 = ((iM2567 ^ i9) * 29833) ^ (-922230510);
                        i8 = -710065090;
                        i21 = iM2567 ^ i8;
                    }
                    break;
                case 255631147:
                case 972631881:
                    viewOnClickListenerC14170.f42779 = textInputLayout2;
                    iM25610 = C0630.m2566(C2958.m9031(f42777, 55, 3, i11));
                    i20 = 2123245406;
                    if (!C4159.f13567) {
                        view = viewM3507;
                        editText = editTextM5905;
                        interfaceC12344 = interfaceC12347;
                        i = i12;
                        int i37 = i17;
                        sArr = sArr6;
                        i2 = i37;
                        iM6981 = (C0630.m2566("ܿ۫") + i9) * 25;
                        i3 = ((iM6981 ^ i10) * 15165) ^ (-913735387);
                        i4 = -1391999969;
                        int i38 = iM6981 ^ i4;
                        dialogInterfaceC0207 = dialogInterfaceC0206;
                        viewM3507 = view;
                        interfaceC12347 = interfaceC12344;
                        i21 = i38;
                        viewOnClickListenerC14170 = this;
                        EditText editText15 = editText;
                        i19 = i3;
                        i12 = i;
                        editTextM5905 = editText15;
                        short[] sArr10 = sArr;
                        i17 = i2;
                        sArr6 = sArr10;
                    } else {
                        iM2567 = (C0630.m2566("ۢᩴ") ^ i10) * (-79);
                        i19 = ((iM2567 ^ i9) * 30973) ^ 149636811;
                        i8 = -1742188158;
                        i21 = iM2567 ^ i8;
                    }
                    break;
                case 1224342318:
                case 1974214035:
                    viewOnClickListenerC14170.f42778 = textInputLayout3;
                    editTextM5905 = C1773.m5905(textInputLayout3);
                    C2167.m7151(editTextM5905);
                    interfaceC12347 = ApplicationC20075.f65008;
                    int i39 = ViewOnClickListenerC0059.f951;
                    sArr4 = f42777;
                    i12 = 43;
                    if (!C2272.f7362) {
                        iM2567 = (C0630.m2566("ܺۤ") + i9) * (-117);
                        i19 = ((iM2567 ^ i10) * (-4321)) ^ 587789488;
                        i8 = -746791459;
                        i21 = iM2567 ^ i8;
                    } else {
                        view2 = viewM3507;
                        int iM69812 = C2105.m6981("۫ۗ") ^ i9;
                        dialogInterfaceC0207 = dialogInterfaceC0206;
                        viewM3507 = view2;
                        i21 = iM69812 ^ (-1446969640);
                        i19 = ((iM69812 ^ i10) * (-20941)) ^ (-1371964666);
                    }
                    break;
                default:
                    int i40 = i16;
                    int i41 = i17;
                    EditText editText16 = editTextM5905;
                    InterfaceC12344 interfaceC12349 = interfaceC12347;
                    int i42 = i12;
                    short[] sArr11 = sArr6;
                    viewM3507 = C1005.m3507(viewM10739, C0630.m2566(C0382.m1840(sArr11, i40, i41, i11)) ^ 2117913255);
                    sArr3 = f42777;
                    int iM25612 = (C0630.m2566("ۚܶ") ^ i9) * (-69);
                    int i43 = ((iM25612 ^ i10) * 18401) ^ (-444325909);
                    i16 = i40;
                    interfaceC12347 = interfaceC12349;
                    i21 = iM25612 ^ 200754681;
                    i12 = i42;
                    editTextM5905 = editText16;
                    i19 = i43;
                    dialogInterfaceC0207 = dialogInterfaceC0206;
                    i17 = i41;
                    sArr6 = sArr11;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33821(ViewOnClickListenerC14170 viewOnClickListenerC14170) {
        int i = 1990530575;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C3245.f10203;
        int iM6981 = (C2105.m6981("᩵ᩳ") + i2) * (-79);
        int i4 = ((iM6981 ^ i3) * 18867) ^ 1324472756;
        int i5 = 1591646466;
        while (true) {
            i = ((((i ^ i3) * 5289) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1801741414:
                case 1178415571:
                    C22628.m50615();
                    break;
                case -1639132527:
                case 1015851069:
                    C4117.m12364();
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ۤۛ")) * (-107);
                        i4 = ((iM6981 ^ i2) * (-25253)) ^ (-260374039);
                        i5 = 1872309067;
                    } else {
                        iM6981 = C0630.m2566("ۘ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 7899) ^ 488460801;
                        i5 = 303976163;
                    }
                    break;
                case -1063039004:
                case -297801641:
                    if (C0050.f910 < 0) {
                        iM6981 = C2105.m6981("᩻᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-9595)) ^ (-1899546315);
                        i5 = -898876932;
                    } else {
                        iM6981 = C2105.m6981("᩻ۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-12039)) ^ (-1332191592);
                        i5 = 1255074772;
                    }
                    break;
                case -130213618:
                case 440564833:
                    if (!C0798.f2919) {
                        iM6981 = C0630.m2566("ۘ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 7899) ^ 488460801;
                        i5 = 303976163;
                    } else {
                        iM6981 = C2105.m6981("᩻ۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-12039)) ^ (-1332191592);
                        i5 = 1255074772;
                    }
                    break;
                case 1495632199:
                case 2004425860:
                    if (C2105.f7037 == 0 && C22628.f73083 > 0) {
                        if (C1294.m4372() > 0 && C2167.f7158 < 0) {
                            if (!C2126.f7087) {
                                if (AbstractC2021.f6743 <= 0 || C4263.f13799 <= 0) {
                                    iM6981 = (i3 - C0630.m2566("ۤۛ")) * (-107);
                                    i4 = ((iM6981 ^ i2) * (-25253)) ^ (-260374039);
                                    i5 = 1872309067;
                                } else if (C11340.f33930 < 0) {
                                    if (C1504.m5179()) {
                                        AbstractActivityC3346 abstractActivityC3346 = viewOnClickListenerC14170.f42781;
                                        if (C0237.f1507 == 0) {
                                            new ViewOnClickListenerC0059(abstractActivityC3346, null);
                                        }
                                    }
                                    break;
                                }
                            }
                            iM6981 = C0630.m2566("᩶ۡ") ^ i2;
                            i4 = ((iM6981 ^ i3) * (-20907)) ^ (-1485785545);
                            i5 = -1803300616;
                        } else {
                            iM6981 = C2105.m6981("᩻ۜ") ^ i3;
                            i4 = ((iM6981 ^ i2) * (-12039)) ^ (-1332191592);
                            i5 = 1255074772;
                        }
                        break;
                    }
                    iM6981 = C2105.m6981("᩻᩵") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-9595)) ^ (-1899546315);
                    i5 = -898876932;
                    break;
                default:
                    C0483.m2121();
                    C22628.m50615();
                    iM6981 = C0630.m2566("ۘ۟") ^ i2;
                    i4 = ((iM6981 ^ i3) * 7899) ^ 488460801;
                    i5 = 303976163;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01ae A[PHI: r6 r11 r12 r13 r14 r15 r21
      0x01ae: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:50:0x01ac, B:36:0x0117, B:28:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:50:0x01ac, B:36:0x0117, B:28:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:50:0x01ac, B:36:0x0117, B:28:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:50:0x01ac, B:36:0x0117, B:28:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r14v2 short[]) = (r14v1 short[]), (r14v1 short[]), (r14v3 short[]) binds: [B:50:0x01ac, B:36:0x0117, B:28:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r15v2 int) = (r15v1 int), (r15v1 int), (r15v3 int) binds: [B:50:0x01ac, B:36:0x0117, B:28:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r21v6 l.ۗܺ᩷) = (r21v2 l.ۗܺ᩷), (r21v1 l.ۗܺ᩷), (r21v1 l.ۗܺ᩷) binds: [B:50:0x01ac, B:36:0x0117, B:28:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m33822(View view, C13136 c13136, C23881 c23881, ViewOnClickListenerC14170 viewOnClickListenerC14170) {
        int iM2566;
        int i;
        int iM6981;
        int i2;
        int i3;
        C19258 c19258;
        short s;
        int iM2567;
        int i4;
        int i5;
        String strM11919;
        int iM6982;
        int i6;
        int i7;
        ViewOnClickListenerC14170 viewOnClickListenerC14171 = viewOnClickListenerC14170;
        C19258 c19258M5912 = null;
        int iM2568 = 0;
        String str = null;
        int i8 = 0;
        short[] sArr = null;
        int i9 = 0;
        int i10 = 0;
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = 0;
        short[] sArr3 = null;
        int i13 = 0;
        int i14 = -1728946031;
        int i15 = C3683.f11629;
        int i16 = C3911.f12484;
        int iM2569 = (C0630.m2566("ᩴ֨") ^ i16) * 17;
        int i17 = ((iM2569 ^ i15) * 12641) ^ (-46740389);
        int i18 = iM2569 ^ 190352067;
        int i19 = 0;
        short s2 = 0;
        AbstractActivityC3346 abstractActivityC3346 = null;
        while (true) {
            i14 = i18 ^ ((((i14 ^ i15) * 23353) >> 31) & i17);
            switch (i14) {
                case -1944927087:
                case 1106437974:
                    sArr2 = f42777;
                    i11 = 174;
                    i12 = 3;
                    if (C2105.f7037 != 0) {
                        iM2566 = C0630.m2566("᩹᩹") ^ i15;
                        i17 = ((iM2566 ^ i16) * (-18619)) ^ 818053414;
                        i = 1728317018;
                    } else {
                        iM2566 = C2105.m6981("ܿۚ") ^ i15;
                        i17 = ((iM2566 ^ i16) * (-29563)) ^ 105222069;
                        i = 440623538;
                    }
                    i18 = iM2566 ^ i;
                    break;
                case -1820292969:
                case -980884599:
                    C22628.m50615();
                    if (C0483.f2088 < 0) {
                        c19258 = c19258M5912;
                        strM11919 = str;
                        iM6982 = (C0630.m2566("ۚ۠") ^ i16) * 65;
                        i4 = ((iM6982 ^ i15) * 18587) ^ (-1799537200);
                        i6 = 1723033058;
                        i7 = iM6982 ^ i6;
                        str = strM11919;
                        i17 = i4;
                        c19258M5912 = c19258;
                        i18 = i7;
                        viewOnClickListenerC14171 = viewOnClickListenerC14170;
                    } else {
                        iM2566 = C0630.m2566("۫᩷") ^ i16;
                        i17 = ((iM2566 ^ i15) * (-23137)) ^ 1486511341;
                        i = -1173395775;
                        i18 = iM2566 ^ i;
                    }
                    break;
                case -1803428612:
                case -1082171022:
                    C1294.m4380(c19258M5912, iM2568, null);
                    C8960.m23095(RunnableC0588.m2438(c19258M5912));
                    break;
                case -1752288937:
                case 13925077:
                    c19258M5912 = c19258M5912;
                    s2 = f42777[161];
                    if (C3663.f11553) {
                        iM6981 = C2105.m6981("᩸ۛ") ^ i16;
                        i2 = ((iM6981 ^ i15) * 30307) ^ 1662748692;
                        i3 = 161592262;
                    } else {
                        iM6981 = (C2105.m6981("ۢܳ") ^ i15) * 41;
                        i2 = ((iM6981 ^ i16) * 1929) ^ 847083185;
                        i3 = -832919970;
                    }
                    int i20 = iM6981 ^ i3;
                    i17 = i2;
                    c19258M5912 = c19258M5912;
                    viewOnClickListenerC14171 = viewOnClickListenerC14170;
                    i18 = i20;
                    break;
                case -1746281122:
                case 334428432:
                    c19258M5912 = C1773.m5912(abstractActivityC3346);
                    sArr = f42777;
                    i9 = 171;
                    i10 = 3;
                    if (C0050.f910 >= 0) {
                        iM2566 = C0630.m2566("۫᩷") ^ i16;
                        i17 = ((iM2566 ^ i15) * (-23137)) ^ 1486511341;
                        i = -1173395775;
                    } else {
                        iM2566 = (i15 - C0630.m2566("ۨ֫")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i17 = ((iM2566 ^ i16) * (-16635)) ^ (-1203044668);
                        i = 229346439;
                    }
                    i18 = iM2566 ^ i;
                    break;
                case -1456480729:
                case -493646376:
                    C21923.m49330(view, true);
                    c19258 = c19258M5912;
                    strM11919 = C3911.m11919(f42777, 168, 3, i8);
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6982 = (C0630.m2566("ۚ۠") ^ i16) * 65;
                        i4 = ((iM6982 ^ i15) * 18587) ^ (-1799537200);
                        i6 = 1723033058;
                    } else {
                        iM6982 = (C2105.m6981("ۙۛ") ^ i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM6982 ^ i15) * 30843) ^ (-1769332147);
                        i6 = -270666044;
                    }
                    i7 = iM6982 ^ i6;
                    str = strM11919;
                    i17 = i4;
                    c19258M5912 = c19258;
                    i18 = i7;
                    viewOnClickListenerC14171 = viewOnClickListenerC14170;
                    break;
                case -1141500564:
                case 316483050:
                    c19258M5912 = c19258M5912;
                    C3683.m11210(c23881, C0964.m3396(f42777, 162, 6, i8));
                    C0237.m1485(c13136);
                    if (C1773.m5916(c23881)) {
                        iM6981 = C2105.m6981("ۡۨ") ^ i15;
                        i2 = ((iM6981 ^ i16) * 18821) ^ 1559888089;
                        i3 = -123063979;
                    } else {
                        iM6981 = C0630.m2566("۫֫") ^ i16;
                        i2 = ((iM6981 ^ i15) * 16557) ^ 923673351;
                        i3 = 1338778642;
                    }
                    int i21 = iM6981 ^ i3;
                    i17 = i2;
                    c19258M5912 = c19258M5912;
                    viewOnClickListenerC14171 = viewOnClickListenerC14170;
                    i18 = i21;
                    break;
                case -858804014:
                case -501214195:
                    C3432.m10490(c19258M5912, C2105.m6981(C0964.m3396(sArr, i9, i10, i8)) ^ 2101065904);
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        iM2566 = C0630.m2566("ۘ᩺") ^ i16;
                        i17 = ((iM2566 ^ i15) * (-3185)) ^ (-58227583);
                        i = 1794182182;
                        i18 = iM2566 ^ i;
                    } else {
                        c19258M5912 = c19258M5912;
                        iM6981 = C2105.m6981("᩸ۛ") ^ i16;
                        i2 = ((iM6981 ^ i15) * 30307) ^ 1662748692;
                        i3 = 161592262;
                        int i22 = iM6981 ^ i3;
                        i17 = i2;
                        c19258M5912 = c19258M5912;
                        viewOnClickListenerC14171 = viewOnClickListenerC14170;
                        i18 = i22;
                    }
                    break;
                case -799120048:
                case 1777290471:
                    C21374.m48460(AbstractC2021.m6563(c23881, C0630.m2566(str) ^ 2097167376));
                    break;
                case -746531399:
                case 1559015480:
                    C0050.m940();
                    C3911.m11924();
                    break;
                case -717676386:
                case -289126620:
                    C1916.m6295(c19258M5912, C2105.m6981(C0050.m948(sArr2, i11, i12, i8)) ^ 2097889993);
                    if (C11340.f33930 < 0) {
                        iM2566 = (C2105.m6981("۟۬") ^ i16) * 35;
                        i17 = ((iM2566 ^ i15) * 31177) ^ (-821367934);
                        i = 1247937307;
                        i18 = iM2566 ^ i;
                    } else {
                        c19258M5912 = c19258M5912;
                        iM6981 = C2105.m6981("᩸ۛ") ^ i16;
                        i2 = ((iM6981 ^ i15) * 30307) ^ 1662748692;
                        i3 = 161592262;
                        int i23 = iM6981 ^ i3;
                        i17 = i2;
                        c19258M5912 = c19258M5912;
                        viewOnClickListenerC14171 = viewOnClickListenerC14170;
                        i18 = i23;
                    }
                    break;
                case -615924749:
                case 1306341788:
                    sArr3 = f42777;
                    i13 = 177;
                    i19 = 3;
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C0630.m2566("᩹᩹") ^ i15;
                        i17 = ((iM2566 ^ i16) * (-18619)) ^ 818053414;
                        i = 1728317018;
                    } else {
                        iM2566 = C0630.m2566("᩻ܿ") ^ i15;
                        i17 = ((iM2566 ^ i16) * 863) ^ (-963499361);
                        i = 262887206;
                    }
                    i18 = iM2566 ^ i;
                    break;
                case -410203659:
                case 1606062962:
                    c19258 = c19258M5912;
                    s = s2;
                    if (C1128.f4106 <= 0) {
                        iM2567 = (C0630.m2566("۫ۖ") ^ i15) * 91;
                        i4 = ((iM2567 ^ i16) * (-30239)) ^ 1835299756;
                        i5 = -444718965;
                    } else {
                        iM2567 = C0630.m2566("۬᩺") ^ i16;
                        i4 = ((iM2567 ^ i15) * (-30255)) ^ (-363843756);
                        i5 = 1903027788;
                    }
                    i7 = iM2567 ^ i5;
                    s2 = s;
                    i17 = i4;
                    c19258M5912 = c19258;
                    i18 = i7;
                    viewOnClickListenerC14171 = viewOnClickListenerC14170;
                    break;
                case -403104126:
                case 2020085922:
                    c19258 = c19258M5912;
                    s = s2;
                    if (((s * s) + 1192464) - (s * 2184) >= 0) {
                        iM2567 = (i16 - C0630.m2566("۠ۙ")) * (-93);
                        i4 = ((iM2567 ^ i15) * 17465) ^ (-179623765);
                        i5 = 1844139087;
                    } else {
                        iM2567 = C0630.m2566("ۙ᩷") ^ i15;
                        i4 = ((iM2567 ^ i16) * (-4061)) ^ 1341418329;
                        i5 = -136588821;
                    }
                    i7 = iM2567 ^ i5;
                    s2 = s;
                    i17 = i4;
                    c19258M5912 = c19258;
                    i18 = i7;
                    viewOnClickListenerC14171 = viewOnClickListenerC14170;
                    break;
                case -280908112:
                case 1904469845:
                    if (C3746.f11829 > 0) {
                        c19258 = c19258M5912;
                        s = s2;
                        iM2567 = (C0630.m2566("۫ۖ") ^ i15) * 91;
                        i4 = ((iM2567 ^ i16) * (-30239)) ^ 1835299756;
                        i5 = -444718965;
                        i7 = iM2567 ^ i5;
                        s2 = s;
                        i17 = i4;
                        c19258M5912 = c19258;
                        i18 = i7;
                        viewOnClickListenerC14171 = viewOnClickListenerC14170;
                    } else {
                        iM2566 = C0630.m2566("۫᩷") ^ i16;
                        i17 = ((iM2566 ^ i15) * (-23137)) ^ 1486511341;
                        i = -1173395775;
                        i18 = iM2566 ^ i;
                    }
                    break;
                case -164679662:
                case 158928777:
                    C4616.m13552();
                    iM2566 = C0630.m2566("۫᩷") ^ i16;
                    i17 = ((iM2566 ^ i15) * (-23137)) ^ 1486511341;
                    i = -1173395775;
                    i18 = iM2566 ^ i;
                    break;
                case -112183311:
                case 577241323:
                    C7811.m20844();
                    if (C2105.m6982() != 0) {
                        c19258M5912 = c19258M5912;
                        iM6981 = C2105.m6981("᩸ۛ") ^ i16;
                        i2 = ((iM6981 ^ i15) * 30307) ^ 1662748692;
                        i3 = 161592262;
                        int i24 = iM6981 ^ i3;
                        i17 = i2;
                        c19258M5912 = c19258M5912;
                        viewOnClickListenerC14171 = viewOnClickListenerC14170;
                        i18 = i24;
                    } else {
                        iM2566 = C0630.m2566("۫᩷") ^ i16;
                        i17 = ((iM2566 ^ i15) * (-23137)) ^ 1486511341;
                        i = -1173395775;
                        i18 = iM2566 ^ i;
                    }
                    break;
                case -80762129:
                case 832809684:
                    iM2568 = C0630.m2566(C0630.m2575(sArr3, i13, i19, i8)) ^ 2125352925;
                    if (C22628.f73083 > 0) {
                        iM2566 = (i15 - C0630.m2566("ܽۘ")) * (-117);
                        i17 = ((iM2566 ^ i16) * 15321) ^ 2060373813;
                        i = -1428172710;
                        i18 = iM2566 ^ i;
                    } else {
                        c19258 = c19258M5912;
                        strM11919 = str;
                        iM6982 = (C0630.m2566("ۚ۠") ^ i16) * 65;
                        i4 = ((iM6982 ^ i15) * 18587) ^ (-1799537200);
                        i6 = 1723033058;
                        i7 = iM6982 ^ i6;
                        str = strM11919;
                        i17 = i4;
                        c19258M5912 = c19258;
                        i18 = i7;
                        viewOnClickListenerC14171 = viewOnClickListenerC14170;
                    }
                    break;
                case 56426168:
                case 263221619:
                    i8 = 36576;
                    iM6981 = C2105.m6981("᩷ܿ") ^ i15;
                    i2 = ((iM6981 ^ i16) * (-20195)) ^ (-1578338922);
                    i3 = -430317649;
                    int i25 = iM6981 ^ i3;
                    i17 = i2;
                    c19258M5912 = c19258M5912;
                    viewOnClickListenerC14171 = viewOnClickListenerC14170;
                    i18 = i25;
                    break;
                case 204287135:
                case 1945279901:
                    EditText editTextM5905 = C1773.m5905(viewOnClickListenerC14171.f42782);
                    C2167.m7151(editTextM5905);
                    C1711.m5740(editTextM5905);
                    AbstractActivityC3346 abstractActivityC3347 = viewOnClickListenerC14171.f42781;
                    if (C5695.m16023() >= 0) {
                        abstractActivityC3346 = abstractActivityC3347;
                        iM2566 = C0630.m2566("᩹᩹") ^ i15;
                        i17 = ((iM2566 ^ i16) * (-18619)) ^ 818053414;
                        i = 1728317018;
                        i18 = iM2566 ^ i;
                    } else {
                        int iM25610 = C0630.m2566("᩵۟") ^ i16;
                        abstractActivityC3346 = abstractActivityC3347;
                        i18 = iM25610 ^ (-183573489);
                        i17 = ((iM25610 ^ i15) * (-3505)) ^ 2079381216;
                    }
                    break;
                default:
                    i8 = 46006;
                    iM6981 = C2105.m6981("᩷ܿ") ^ i15;
                    i2 = ((iM6981 ^ i16) * (-20195)) ^ (-1578338922);
                    i3 = -430317649;
                    int i26 = iM6981 ^ i3;
                    i17 = i2;
                    c19258M5912 = c19258M5912;
                    viewOnClickListenerC14171 = viewOnClickListenerC14170;
                    i18 = i26;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17541. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33820(android.view.View r36, l.C13136 r37, l.C23881 r38, l.ViewOnClickListenerC14170 r39) {
        /*
            Method dump skipped, instruction units count: 1754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC14170.m33820(android.view.View, l.۬۬ܿ, l.᩻ᩴۡ, l.ܳ֡ۡ):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v39, types: [l.ܽ֡ۡ] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [l.ۧ֡ۡ] */
    /* JADX WARN: Type inference failed for: r8v3, types: [l.ۧ֡ۡ] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // android.view.View.OnClickListener
    public final void onClick(final View view) {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int i5;
        TextInputLayout textInputLayout;
        int i6;
        short[] sArr;
        TextInputLayout textInputLayout2;
        String str;
        int i7;
        TextInputLayout textInputLayout3;
        int iM2567;
        int i8;
        int i9;
        TextInputLayout textInputLayout4;
        int i10;
        short[] sArr2;
        TextInputLayout textInputLayout5;
        String str2;
        String strM6573;
        int iM3006;
        int i11;
        short[] sArr3;
        String str3;
        int i12;
        TextInputLayout textInputLayout6;
        int i13;
        TextInputLayout textInputLayout7;
        int iM2568;
        int i14;
        int i15;
        int i16;
        int iM2569;
        int i17;
        int i18;
        TextInputLayout textInputLayout8;
        int iM6384;
        int iM6982;
        int i19;
        int i20;
        int iM6983;
        int i21;
        ?? r8;
        final ViewOnClickListenerC14170 viewOnClickListenerC14170 = this;
        boolean z = false;
        TextInputLayout textInputLayout9 = null;
        TextInputLayout textInputLayout10 = null;
        final String strM1959 = null;
        int iM25610 = 0;
        final AbstractActivityC3346 abstractActivityC3346 = null;
        int iM25611 = 0;
        final String strM947 = null;
        String str4 = null;
        short[] sArr4 = null;
        char c = 0;
        short s = 0;
        int i22 = 0;
        int i23 = 1020437776;
        int i24 = C11340.f33930;
        int i25 = C7811.f24123;
        int iM25612 = C0630.m2566("֡᩷") ^ i24;
        int i26 = ((iM25612 ^ i25) * (-8705)) ^ 754408004;
        int i27 = iM25612 ^ 1454392649;
        TextInputLayout textInputLayout11 = null;
        final C10644 c10644 = 0;
        short[] sArr5 = null;
        int i28 = 0;
        int iM6572 = 0;
        int i29 = 0;
        int i30 = 0;
        int iM25613 = 0;
        int i31 = 0;
        int i32 = 0;
        TextInputLayout[] textInputLayoutArr = null;
        while (true) {
            i23 = i27 ^ (i26 & (((i23 ^ i25) * (-8789)) >> 31));
            switch (i23) {
                case -2132340312:
                case -418446460:
                    if (C0050.f910 >= 0) {
                        iM6384 = i31;
                        textInputLayout8 = textInputLayout9;
                        iM6982 = (C0630.m2566("֨۫") ^ i25) * (-87);
                        i19 = ((iM6982 ^ i24) * 21029) ^ 2140955161;
                        i20 = -1858383400;
                        i27 = iM6982 ^ i20;
                        textInputLayout9 = textInputLayout8;
                        i31 = iM6384;
                        c10644 = c10644;
                        i26 = i19;
                    }
                    iM6983 = C2105.m6981("ۛ᩸") ^ i25;
                    i19 = ((iM6983 ^ i24) * (-11229)) ^ (-1345953551);
                    i21 = 1106138569;
                    r8 = c10644;
                    i27 = iM6983 ^ i21;
                    c10644 = r8;
                    i26 = i19;
                    break;
                case -2103793021:
                case 236121012:
                    textInputLayout = textInputLayout11;
                    i6 = i31;
                    sArr = sArr5;
                    textInputLayout2 = textInputLayout9;
                    str = strM1959;
                    i7 = i30;
                    textInputLayout3 = textInputLayout10;
                    sArr4 = f42777;
                    c = 180;
                    if (C1047.f3863 >= 0) {
                        iM2567 = (C2105.m6981("ۜ֫") + i24) * (-37);
                        i8 = ((iM2567 ^ i25) * (-6049)) ^ 395911102;
                        i9 = -1295530643;
                    } else {
                        iM2567 = C0630.m2566("ۖܰ") ^ i24;
                        i8 = ((iM2567 ^ i25) * 15167) ^ 838459035;
                        i9 = 1541481900;
                    }
                    int i33 = iM2567 ^ i9;
                    textInputLayout10 = textInputLayout3;
                    i30 = i7;
                    strM1959 = str;
                    textInputLayout11 = textInputLayout;
                    i26 = i8;
                    sArr5 = sArr;
                    textInputLayout9 = textInputLayout2;
                    i31 = i6;
                    i27 = i33;
                    viewOnClickListenerC14170 = this;
                    break;
                case -1961686224:
                case 603760776:
                    i28 = IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    iM2566 = C0630.m2566("᩺۟") ^ i24;
                    i = ((iM2566 ^ i25) * 23147) ^ 48862036;
                    i2 = 927913653;
                    i4 = iM2566 ^ i2;
                    strM1959 = strM1959;
                    sArr5 = sArr5;
                    int i34 = i30;
                    textInputLayout11 = textInputLayout11;
                    i26 = i;
                    textInputLayout10 = textInputLayout10;
                    i30 = i34;
                    int i35 = i31;
                    i27 = i4;
                    textInputLayout9 = textInputLayout9;
                    i31 = i35;
                    break;
                case -1882465910:
                case -438337842:
                    textInputLayout4 = textInputLayout11;
                    i10 = i31;
                    sArr2 = sArr5;
                    textInputLayout5 = textInputLayout9;
                    str2 = strM1959;
                    int i36 = i30;
                    textInputLayout10 = textInputLayout10;
                    short s2 = sArr4[c];
                    int i37 = s2 + 766;
                    if (!C2520.m8026()) {
                        int iM25614 = C0630.m2566("ۢ᩸") ^ i25;
                        int i38 = ((iM25614 ^ i24) * 6717) ^ 321346443;
                        s = s2;
                        i22 = i37;
                        textInputLayout10 = textInputLayout10;
                        i30 = i36;
                        textInputLayout9 = textInputLayout5;
                        i31 = i10;
                        textInputLayout11 = textInputLayout4;
                        i27 = iM25614 ^ (-534876134);
                        strM1959 = str2;
                        i26 = i38;
                        sArr5 = sArr2;
                        viewOnClickListenerC14170 = this;
                    } else {
                        s = s2;
                        i22 = i37;
                        strM6573 = str4;
                        iM3006 = i36;
                        iM2569 = (C2105.m6981("᩷ܳ") + i24) * 5;
                        i17 = ((iM2569 ^ i25) * 20577) ^ (-2141726721);
                        i18 = 1085319876;
                        i12 = iM2569 ^ i18;
                        textInputLayout11 = textInputLayout4;
                        i26 = i17;
                        strM1959 = str2;
                        sArr5 = sArr2;
                        i5 = iM3006;
                        str4 = strM6573;
                        textInputLayout9 = textInputLayout5;
                        i31 = i10;
                        i27 = i12;
                        textInputLayout10 = textInputLayout10;
                        i30 = i5;
                    }
                    break;
                case -1875642840:
                case -321624666:
                    textInputLayout11 = textInputLayout11;
                    i31 = i31;
                    sArr5 = sArr5;
                    textInputLayout9 = textInputLayout9;
                    i30 = i30;
                    textInputLayout10 = textInputLayout10;
                    iM25613 = C0630.m2566(str4) ^ 2125553057;
                    if (!C2272.f7362) {
                        iM6981 = C2105.m6981("ۗܿ") ^ i25;
                        i = ((iM6981 ^ i24) * (-12519)) ^ (-1663807156);
                        i3 = 525415864;
                        i4 = iM6981 ^ i3;
                        sArr5 = sArr5;
                        int i39 = i30;
                        textInputLayout11 = textInputLayout11;
                        i26 = i;
                        textInputLayout10 = textInputLayout10;
                        i30 = i39;
                        int i310 = i31;
                        i27 = i4;
                        textInputLayout9 = textInputLayout9;
                        i31 = i310;
                    } else {
                        strM1959 = strM1959;
                        iM2566 = (i24 - C2105.m6981("ۤܶ")) * 57;
                        i = ((iM2566 ^ i25) * 5379) ^ 2070315763;
                        i2 = 1922231081;
                        i4 = iM2566 ^ i2;
                        strM1959 = strM1959;
                        sArr5 = sArr5;
                        int i311 = i30;
                        textInputLayout11 = textInputLayout11;
                        i26 = i;
                        textInputLayout10 = textInputLayout10;
                        i30 = i311;
                        int i312 = i31;
                        i27 = i4;
                        textInputLayout9 = textInputLayout9;
                        i31 = i312;
                    }
                    break;
                case -1842800161:
                case 1889691115:
                    short[] sArr6 = sArr5;
                    iM25611 = 2100926785 ^ C0630.m2566(C2520.m8030(sArr6, i29, 3, i28));
                    int i40 = i31;
                    textInputLayout7 = textInputLayout9;
                    int i41 = i32;
                    if (i40 != i41) {
                        int iM6984 = (i24 - C2105.m6981("ۙ᩻")) * (-91);
                        i26 = ((iM6984 ^ i25) * (-11875)) ^ 995738048;
                        int i42 = iM6984 ^ (-1867260788);
                        sArr5 = sArr6;
                        i32 = i41;
                        textInputLayout9 = textInputLayout7;
                        i31 = i40;
                        i27 = i42;
                    } else {
                        int iM25615 = (C0630.m2566("ܳۜ") ^ i24) * 89;
                        i32 = i41;
                        sArr5 = sArr6;
                        i16 = i40;
                        i27 = iM25615 ^ (-47969620);
                        i26 = ((iM25615 ^ i25) * (-14333)) ^ (-723144369);
                        textInputLayout9 = textInputLayout7;
                        i31 = i16;
                    }
                    break;
                case -1829484641:
                case -583578894:
                    textInputLayout11 = textInputLayout11;
                    i31 = i31;
                    sArr5 = sArr5;
                    textInputLayout9 = textInputLayout9;
                    i30 = i30;
                    textInputLayout10 = textInputLayout10;
                    EditText editTextM2132 = C0483.m2132(textInputLayout11);
                    C2167.m7151(editTextM2132);
                    strM1959 = C0422.m1959(C4117.m12350(editTextM2132));
                    if (C23343.m51759(strM1959)) {
                        iM6981 = C2105.m6981("ۗۨ") ^ i25;
                        i = ((iM6981 ^ i24) * (-24033)) ^ (-1425200955);
                        i3 = 1208103318;
                    } else {
                        iM6981 = (C2105.m6981("ۨܳ") ^ i24) * 63;
                        i = ((iM6981 ^ i25) * 10469) ^ 606281999;
                        i3 = 2022856489;
                    }
                    i4 = iM6981 ^ i3;
                    sArr5 = sArr5;
                    int i313 = i30;
                    textInputLayout11 = textInputLayout11;
                    i26 = i;
                    textInputLayout10 = textInputLayout10;
                    i30 = i313;
                    int i314 = i31;
                    i27 = i4;
                    textInputLayout9 = textInputLayout9;
                    i31 = i314;
                    break;
                case -1762607100:
                case 64252450:
                    if (C1128.f4106 <= 0) {
                        iM6983 = C2105.m6981("֫ۧ") ^ i25;
                        i19 = ((iM6983 ^ i24) * (-17609)) ^ 143131867;
                        i21 = -531683593;
                        r8 = c10644;
                        i27 = iM6983 ^ i21;
                        c10644 = r8;
                        i26 = i19;
                    } else {
                        textInputLayout4 = textInputLayout11;
                        i10 = i31;
                        sArr2 = sArr5;
                        textInputLayout5 = textInputLayout9;
                        str2 = strM1959;
                        strM6573 = str4;
                        iM3006 = i30;
                        textInputLayout10 = textInputLayout10;
                        iM2569 = (C2105.m6981("᩷ܳ") + i24) * 5;
                        i17 = ((iM2569 ^ i25) * 20577) ^ (-2141726721);
                        i18 = 1085319876;
                        i12 = iM2569 ^ i18;
                        textInputLayout11 = textInputLayout4;
                        i26 = i17;
                        strM1959 = str2;
                        sArr5 = sArr2;
                        i5 = iM3006;
                        str4 = strM6573;
                        textInputLayout9 = textInputLayout5;
                        i31 = i10;
                        i27 = i12;
                        textInputLayout10 = textInputLayout10;
                        i30 = i5;
                    }
                    break;
                case -1513990241:
                case 99299374:
                    RunnableC3474.m10621(textInputLayout10, iM25611);
                    break;
                case -1502868752:
                case 1073291713:
                    try {
                        EditText editTextM5905 = C1773.m5905(textInputLayout10);
                        C2167.m7151(editTextM5905);
                        iM6572 = AbstractC2021.m6572(C0050.m947(C2958.m9028(editTextM5905)));
                        iM6983 = C0630.m2566("᩵᩻") ^ i25;
                        i19 = ((iM6983 ^ i24) * 18209) ^ (-1123883607);
                        i21 = -32879130;
                        r8 = c10644;
                    } catch (NumberFormatException unused) {
                        iM6983 = (C2105.m6981("᩶ۨ") ^ i24) * (-77);
                        i19 = ((iM6983 ^ i25) * (-4533)) ^ 446586021;
                        i21 = 1568039038;
                        r8 = c10644;
                    }
                    i27 = iM6983 ^ i21;
                    c10644 = r8;
                    i26 = i19;
                    break;
                case -1501559077:
                case -904224423:
                    C1005.m3499(new Thread(new Runnable() { // from class: l.ۛ֨ۡ
                        {
                            int i43 = 1362473310;
                            int i44 = C2958.f9394;
                            int i45 = C0483.f2088;
                            int iM6985 = C2105.m6981("᩵ܳ") ^ i44;
                            int i46 = ((iM6985 ^ i45) * 8587) ^ 1067667524;
                            int i47 = -1805565551;
                            while (true) {
                                i43 = ((((i43 ^ i45) * 4273) >> 31) & i46) ^ (iM6985 ^ i47);
                                switch (i43) {
                                    case -2024346168:
                                    case 338638334:
                                        if (C7106.m19120() <= 0) {
                                            iM6985 = C0630.m2566("ۧ᩷") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 27313) ^ 1346398466;
                                            i47 = -1349752693;
                                        } else {
                                            iM6985 = C0630.m2566("ۢ۠") ^ i45;
                                            i46 = ((iM6985 ^ i44) * 9455) ^ (-74955769);
                                            i47 = -332813309;
                                        }
                                        break;
                                    case -1980415336:
                                    case 1808049224:
                                        if (ViewOnClickListenerC1958.m6429() < 0) {
                                            iM6985 = C0630.m2566("ۧ᩷") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 27313) ^ 1346398466;
                                            i47 = -1349752693;
                                        } else {
                                            iM6985 = C2105.m6981("ܺ۟") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 19657) ^ 492523351;
                                            i47 = 280104472;
                                        }
                                        break;
                                    case -1944310506:
                                    case 1725456655:
                                        C1773.m5908();
                                        iM6985 = C2105.m6981("ܺ۟") ^ i44;
                                        i46 = ((iM6985 ^ i45) * 19657) ^ 492523351;
                                        i47 = 280104472;
                                        break;
                                    case -1741583287:
                                    case -208875232:
                                        if (C4117.f13076 <= 0) {
                                            iM6985 = C0630.m2566("ۧ᩷") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 27313) ^ 1346398466;
                                            i47 = -1349752693;
                                        } else {
                                            iM6985 = C2105.m6981("᩶᩵") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 6391) ^ 1503954763;
                                            i47 = -519134762;
                                        }
                                        break;
                                    case -1674012539:
                                    case -121395073:
                                        if (C3746.f11829 <= 0) {
                                            iM6985 = C2105.m6981("ܺ۟") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 19657) ^ 492523351;
                                            i47 = 280104472;
                                        } else {
                                            iM6985 = (C2105.m6981("᩻ۡ") + i44) * (-65);
                                            i46 = ((iM6985 ^ i45) * (-29775)) ^ (-2005027165);
                                            i47 = -69479650;
                                        }
                                        break;
                                    case -1635949692:
                                    case -443534742:
                                        C21923.m49329();
                                        C3432.m10477();
                                        throw new RuntimeException();
                                    case -1571558710:
                                    case 1521369708:
                                        C1005.m3501();
                                        if (C0050.m940() <= 0) {
                                            iM6985 = (C0630.m2566("۠ܰ") + i45) * 73;
                                            i46 = ((iM6985 ^ i44) * 19013) ^ 1075999990;
                                            i47 = 2016051320;
                                        } else {
                                            iM6985 = C2105.m6981("ܺ۟") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 19657) ^ 492523351;
                                            i47 = 280104472;
                                        }
                                        break;
                                    case -1374661489:
                                    case 856303166:
                                        if (C1773.m5908() <= 0) {
                                            iM6985 = C2105.m6981("ۛᩳ") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-12215)) ^ 1563729109;
                                            i47 = 1396676077;
                                        } else {
                                            iM6985 = (C0630.m2566("ۗܶ") + i44) * (-43);
                                            i46 = ((iM6985 ^ i45) * (-21277)) ^ 1599922301;
                                            i47 = 734256497;
                                        }
                                        break;
                                    case -1261344470:
                                    case -458157561:
                                        if (C0382.f1805) {
                                            iM6985 = C0630.m2566("۟ۜ") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 32407) ^ 1411585816;
                                            i47 = -1919331144;
                                        } else {
                                            iM6985 = C2105.m6981("ܺ۟") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 19657) ^ 492523351;
                                            i47 = 280104472;
                                        }
                                        break;
                                    case -786949623:
                                    case -646391341:
                                        C2105.m6982();
                                        if (C4616.f14690 <= 0) {
                                            iM6985 = C2105.m6981("ۛᩳ") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-12215)) ^ 1563729109;
                                            i47 = 1396676077;
                                        } else {
                                            iM6985 = C2105.m6981("ܺ۟") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 19657) ^ 492523351;
                                            i47 = 280104472;
                                        }
                                        break;
                                    case -308407148:
                                    case 73789280:
                                        if (C4075.m12263() <= 0) {
                                            iM6985 = C2105.m6981("ۛᩳ") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-12215)) ^ 1563729109;
                                            i47 = 1396676077;
                                        } else {
                                            iM6985 = C2105.m6981("ۢ֫") ^ i45;
                                            i46 = ((iM6985 ^ i44) * 11473) ^ (-374774305);
                                            i47 = -772223491;
                                        }
                                        break;
                                    case 39799071:
                                    case 1420617499:
                                        return;
                                    case 249250039:
                                    case 1633003013:
                                        if (C1128.f4106 <= 0) {
                                            iM6985 = C2105.m6981("۟ᩳ") ^ i45;
                                            i46 = ((iM6985 ^ i44) * 20617) ^ 197497904;
                                            i47 = 1456929775;
                                        } else {
                                            iM6985 = (C2105.m6981("ۙۡ") ^ i44) * 87;
                                            i46 = ((iM6985 ^ i45) * (-10301)) ^ 1975489850;
                                            i47 = 1288822518;
                                        }
                                        break;
                                    case 1129851109:
                                    case 2025543154:
                                        if (C7106.f21815 != 0) {
                                            iM6985 = C0630.m2566("ۧ᩷") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 27313) ^ 1346398466;
                                            i47 = -1349752693;
                                        } else {
                                            iM6985 = C0630.m2566("ܿܶ") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-17823)) ^ (-326627574);
                                            i47 = 749691124;
                                        }
                                        break;
                                    case 1631625304:
                                    case 2009670834:
                                        if (C3432.m10477() <= 0) {
                                            iM6985 = C2105.m6981("ܺ۟") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 19657) ^ 492523351;
                                            i47 = 280104472;
                                        } else {
                                            iM6985 = C0630.m2566("᩸ۜ") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-26651)) ^ 647848605;
                                            i47 = 999391072;
                                        }
                                        break;
                                    default:
                                        if (C0050.f910 >= 0) {
                                            iM6985 = (C0630.m2566("۠ܰ") + i45) * 73;
                                            i46 = ((iM6985 ^ i44) * 19013) ^ 1075999990;
                                            i47 = 2016051320;
                                        } else {
                                            iM6985 = C2105.m6981("᩵᩸") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-27803)) ^ (-1885417657);
                                            i47 = -616171584;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Activity activity = null;
                            C10644 c10645 = null;
                            int i43 = 1677552024;
                            int i44 = C4263.f13799;
                            int i45 = AbstractC2021.f6743;
                            int iM6985 = C2105.m6981("ۚܶ") ^ i44;
                            int i46 = ((iM6985 ^ i45) * 5239) ^ (-107646342);
                            int i47 = 604894191;
                            while (true) {
                                i43 = ((((i43 ^ i45) * (-5891)) >> 31) & i46) ^ (iM6985 ^ i47);
                                switch (i43) {
                                    case -2011410511:
                                    case -599764389:
                                        if (C0422.f1886 <= 0) {
                                            iM6985 = C2105.m6981("ۚ۠") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-22523)) ^ 1409223492;
                                            i47 = 1944308695;
                                        } else {
                                            iM6985 = (C0630.m2566("᩸ۙ") ^ i45) * 85;
                                            i46 = ((iM6985 ^ i44) * 22853) ^ (-4141084);
                                            i47 = 1689093848;
                                        }
                                        break;
                                    case -1860080033:
                                    case 1260703173:
                                        if (C3019.f9544 < 0) {
                                            iM6985 = C2105.m6981("ۚ۠") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-22523)) ^ 1409223492;
                                            i47 = 1944308695;
                                        } else {
                                            iM6985 = C2105.m6981("ۙܺ") ^ i44;
                                            i46 = ((iM6985 ^ i45) * (-4175)) ^ (-182451417);
                                            i47 = 488908335;
                                        }
                                        break;
                                    case -1843027349:
                                    case -998441027:
                                        if (RunnableC1108.f4040) {
                                            iM6985 = C0630.m2566("ۨۚ") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 1435) ^ (-1410916224);
                                            i47 = 1849903104;
                                        } else {
                                            iM6985 = C2105.m6981("ۚ۠") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-22523)) ^ 1409223492;
                                            i47 = 1944308695;
                                        }
                                        break;
                                    case -1561032238:
                                    case 1485922076:
                                        if (C1294.f4556 >= 0) {
                                            iM6985 = C0630.m2566("᩶ܽ") ^ i44;
                                            i46 = ((iM6985 ^ i45) * (-10183)) ^ 1915010390;
                                            i47 = -1518437136;
                                        } else {
                                            iM6985 = (C0630.m2566("ۜ᩺") + i44) * (-125);
                                            i46 = ((iM6985 ^ i45) * 6331) ^ (-1118863815);
                                            i47 = 1141911912;
                                        }
                                        break;
                                    case -1427175014:
                                    case 1487260480:
                                        if (C0050.m940() <= 0) {
                                            iM6985 = C2105.m6981("ۖ۫") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-21347)) ^ 693690125;
                                            i47 = 1815845657;
                                        } else {
                                            iM6985 = (i44 - C0630.m2566("ᩴܺ")) * (-37);
                                            i46 = ((iM6985 ^ i45) * 16885) ^ 1026504755;
                                            i47 = -1285174259;
                                        }
                                        break;
                                    case -1416039504:
                                    case 273744219:
                                        activity = abstractActivityC3346;
                                        if (C0422.m1963()) {
                                            iM6985 = C2105.m6981("ᩴ᩻") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-21299)) ^ (-208269217);
                                            i47 = -1691521014;
                                        } else {
                                            iM6985 = (C0630.m2566("ۚۗ") + i45) * 123;
                                            i46 = ((iM6985 ^ i44) * (-26331)) ^ (-1379288614);
                                            i47 = -663418839;
                                        }
                                        break;
                                    case -1084527704:
                                    case 714806458:
                                        if (C22628.f73083 <= 0) {
                                            iM6985 = C2105.m6981("ۙܺ") ^ i44;
                                            i46 = ((iM6985 ^ i45) * (-4175)) ^ (-182451417);
                                            i47 = 488908335;
                                        } else {
                                            iM6985 = C2105.m6981("֡ۚ") ^ i45;
                                            i46 = ((iM6985 ^ i44) * 32013) ^ 974770673;
                                            i47 = 1331630175;
                                        }
                                        break;
                                    case -1013444604:
                                    case 982634063:
                                        C21923.m49329();
                                        if (C3432.m10477() > 0) {
                                            iM6985 = C0630.m2566("᩶ܽ") ^ i44;
                                            i46 = ((iM6985 ^ i45) * (-10183)) ^ 1915010390;
                                            i47 = -1518437136;
                                        } else {
                                            iM6985 = C2105.m6981("ۚ۠") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-22523)) ^ 1409223492;
                                            i47 = 1944308695;
                                        }
                                        break;
                                    case -810383292:
                                    case 1173025815:
                                        C2405.m7795(strM1959, strM947, activity, c10645);
                                        break;
                                    case -767289429:
                                    case 695784582:
                                        C2520.m8026();
                                        C11340.m28031();
                                        break;
                                    case -666118765:
                                    case 1459871812:
                                        if (C5695.m16023() >= 0) {
                                            iM6985 = C2105.m6981("ۖ۫") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-21347)) ^ 693690125;
                                            i47 = 1815845657;
                                        } else {
                                            iM6985 = (C2105.m6981("ܽ۟") + i45) * 3;
                                            i46 = ((iM6985 ^ i44) * 1669) ^ 9960789;
                                            i47 = -1775778268;
                                        }
                                        break;
                                    case 231790142:
                                    case 435497605:
                                        c10645 = c10644;
                                        if (C2105.f7037 != 0) {
                                            iM6985 = (C0630.m2566("ۚۗ") + i45) * 123;
                                            i46 = ((iM6985 ^ i44) * (-26331)) ^ (-1379288614);
                                            i47 = -663418839;
                                        } else {
                                            iM6985 = C2105.m6981("ۚᩳ") ^ i44;
                                            i46 = ((iM6985 ^ i45) * 23759) ^ 225833085;
                                            i47 = -68268107;
                                        }
                                        break;
                                    case 625581842:
                                    case 1160800759:
                                        C0964.m3413();
                                        iM6985 = C2105.m6981("ۙܺ") ^ i44;
                                        i46 = ((iM6985 ^ i45) * (-4175)) ^ (-182451417);
                                        i47 = 488908335;
                                        break;
                                    case 1248284089:
                                    case 1512029658:
                                        if (C0483.m2121()) {
                                            iM6985 = (i45 - C0630.m2566("ۗܰ")) * (-65);
                                            i46 = ((iM6985 ^ i44) * (-2341)) ^ (-1542889616);
                                            i47 = 1409691820;
                                        } else {
                                            iM6985 = (C0630.m2566("ۚۗ") + i45) * 123;
                                            i46 = ((iM6985 ^ i44) * (-26331)) ^ (-1379288614);
                                            i47 = -663418839;
                                        }
                                        break;
                                    case 2045738427:
                                    case 2083078761:
                                        C4075.m12263();
                                        if (C3245.f10203 > 0) {
                                            iM6985 = C2105.m6981("ۖ۫") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-21347)) ^ 693690125;
                                            i47 = 1815845657;
                                        } else {
                                            iM6985 = C2105.m6981("ۚ۠") ^ i45;
                                            i46 = ((iM6985 ^ i44) * (-22523)) ^ 1409223492;
                                            i47 = 1944308695;
                                        }
                                        break;
                                    default:
                                        if (C4159.f13567) {
                                            iM6985 = (C0630.m2566("۟֡") + i44) * (-127);
                                            i46 = ((iM6985 ^ i45) * 9117) ^ 1019945234;
                                            i47 = -577713319;
                                        } else {
                                            iM6985 = (C0630.m2566("ۚۗ") + i45) * 123;
                                            i46 = ((iM6985 ^ i44) * (-26331)) ^ (-1379288614);
                                            i47 = -663418839;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    }));
                    break;
                case -1475186152:
                case 1638017701:
                    C2958.m9034();
                    if (!C11340.m28031()) {
                        iM6983 = C2105.m6981("᩵ۜ") ^ i24;
                        i19 = ((iM6983 ^ i25) * (-33)) ^ 1271815458;
                        i21 = 1121573951;
                        r8 = c10644;
                        i27 = iM6983 ^ i21;
                        c10644 = r8;
                        i26 = i19;
                    } else {
                        textInputLayout4 = textInputLayout11;
                        i10 = i31;
                        sArr2 = sArr5;
                        textInputLayout5 = textInputLayout9;
                        str2 = strM1959;
                        strM6573 = str4;
                        iM3006 = i30;
                        textInputLayout10 = textInputLayout10;
                        iM2569 = (C2105.m6981("᩷ܳ") + i24) * 5;
                        i17 = ((iM2569 ^ i25) * 20577) ^ (-2141726721);
                        i18 = 1085319876;
                        i12 = iM2569 ^ i18;
                        textInputLayout11 = textInputLayout4;
                        i26 = i17;
                        strM1959 = str2;
                        sArr5 = sArr2;
                        i5 = iM3006;
                        str4 = strM6573;
                        textInputLayout9 = textInputLayout5;
                        i31 = i10;
                        i27 = i12;
                        textInputLayout10 = textInputLayout10;
                        i30 = i5;
                    }
                    break;
                case -1446039108:
                case 2028265895:
                    break;
                case -1365169225:
                case 522823680:
                    textInputLayout11 = textInputLayout11;
                    i31 = i31;
                    sArr5 = sArr5;
                    textInputLayout9 = textInputLayout9;
                    iM25610 = 2118477840 ^ C0630.m2566(C2126.m7036(f42777, 188, 3, i28));
                    abstractActivityC3346 = viewOnClickListenerC14170.f42781;
                    int i43 = i30;
                    textInputLayout10 = textInputLayout10;
                    int i44 = iM25613;
                    if (i43 != i44) {
                        i30 = i43;
                        iM6981 = (i25 - C2105.m6981("ۙ۫")) * (-35);
                        iM25613 = i44;
                        i = ((iM6981 ^ i24) * (-32217)) ^ 1888230156;
                        i3 = 2017822136;
                        i4 = iM6981 ^ i3;
                        sArr5 = sArr5;
                        int i315 = i30;
                        textInputLayout11 = textInputLayout11;
                        i26 = i;
                        textInputLayout10 = textInputLayout10;
                        i30 = i315;
                        int i316 = i31;
                        i27 = i4;
                        textInputLayout9 = textInputLayout9;
                        i31 = i316;
                    } else {
                        int iM6985 = (C2105.m6981("ܿܺ") ^ i25) * 57;
                        sArr5 = sArr5;
                        i5 = i43;
                        textInputLayout11 = textInputLayout11;
                        i26 = ((iM6985 ^ i24) * (-21505)) ^ (-1673188839);
                        textInputLayout9 = textInputLayout9;
                        i31 = i31;
                        i27 = iM6985 ^ 817058510;
                        iM25613 = i44;
                        textInputLayout10 = textInputLayout10;
                        i30 = i5;
                    }
                    break;
                case -1362827662:
                case 868065515:
                    EditText editTextM2133 = C0483.m2132(textInputLayout9);
                    C2167.m7151(editTextM2133);
                    strM947 = C0050.m947(C2958.m9028(editTextM2133));
                    if (C23343.m51755(strM947)) {
                        iM6983 = (i25 - C2105.m6981("ۧܽ")) * (-17);
                        i19 = ((iM6983 ^ i24) * (-25201)) ^ 804584289;
                        i21 = 1572891941;
                        r8 = c10644;
                    } else {
                        iM6983 = (C0630.m2566("ۨ᩷") ^ i24) * (-83);
                        i19 = ((iM6983 ^ i25) * (-22103)) ^ 902260916;
                        i21 = -687201930;
                        r8 = c10644;
                    }
                    i27 = iM6983 ^ i21;
                    c10644 = r8;
                    i26 = i19;
                    break;
                case -1248737282:
                case -730367335:
                    textInputLayout8 = textInputLayout9;
                    EditText editTextM2134 = C0483.m2132(textInputLayout10);
                    C2167.m7151(editTextM2134);
                    iM6384 = RunnableC1937.m6384(editTextM2134);
                    i32 = 6;
                    sArr5 = f42777;
                    i29 = 194;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6982 = (C0630.m2566("֨۫") ^ i25) * (-87);
                        i19 = ((iM6982 ^ i24) * 21029) ^ 2140955161;
                        i20 = -1858383400;
                    } else {
                        iM6982 = (i24 - C2105.m6981("۠ۢ")) * 81;
                        i19 = ((iM6982 ^ i25) * 16177) ^ 1047252153;
                        i20 = 1370663089;
                    }
                    i27 = iM6982 ^ i20;
                    textInputLayout9 = textInputLayout8;
                    i31 = iM6384;
                    c10644 = c10644;
                    i26 = i19;
                    break;
                case -1224742953:
                case 1336113843:
                    C3911.m11924();
                    if (C2105.f7037 == 0) {
                        iM6983 = C2105.m6981("᩶ܿ") ^ i25;
                        i19 = ((iM6983 ^ i24) * (-29347)) ^ (-359911849);
                        i21 = 434212054;
                        r8 = c10644;
                        i27 = iM6983 ^ i21;
                        c10644 = r8;
                        i26 = i19;
                    } else {
                        textInputLayout4 = textInputLayout11;
                        i10 = i31;
                        sArr2 = sArr5;
                        textInputLayout5 = textInputLayout9;
                        str2 = strM1959;
                        strM6573 = str4;
                        iM3006 = i30;
                        textInputLayout10 = textInputLayout10;
                        iM2569 = (C2105.m6981("᩷ܳ") + i24) * 5;
                        i17 = ((iM2569 ^ i25) * 20577) ^ (-2141726721);
                        i18 = 1085319876;
                        i12 = iM2569 ^ i18;
                        textInputLayout11 = textInputLayout4;
                        i26 = i17;
                        strM1959 = str2;
                        sArr5 = sArr2;
                        i5 = iM3006;
                        str4 = strM6573;
                        textInputLayout9 = textInputLayout5;
                        i31 = i10;
                        i27 = i12;
                        textInputLayout10 = textInputLayout10;
                        i30 = i5;
                    }
                    break;
                case -920108366:
                case -479737300:
                    textInputLayout11 = textInputLayout11;
                    i31 = i31;
                    sArr5 = sArr5;
                    textInputLayout9 = textInputLayout9;
                    strM1959 = strM1959;
                    i30 = i30;
                    textInputLayout10 = textInputLayout10;
                    RunnableC0588.m2430(view, C2520.m8030(f42777, 181, 1, i28));
                    if (C0630.f2410 <= 0) {
                        iM2566 = (i24 - C2105.m6981("ۤܶ")) * 57;
                        i = ((iM2566 ^ i25) * 5379) ^ 2070315763;
                        i2 = 1922231081;
                    } else {
                        iM2566 = (C2105.m6981("ۤ۬") ^ i25) * 17;
                        i = ((iM2566 ^ i24) * (-25369)) ^ 994838878;
                        i2 = -1472295541;
                    }
                    i4 = iM2566 ^ i2;
                    strM1959 = strM1959;
                    sArr5 = sArr5;
                    int i317 = i30;
                    textInputLayout11 = textInputLayout11;
                    i26 = i;
                    textInputLayout10 = textInputLayout10;
                    i30 = i317;
                    int i318 = i31;
                    i27 = i4;
                    textInputLayout9 = textInputLayout9;
                    i31 = i318;
                    break;
                case -906055703:
                case 1308750944:
                    AbstractC2021.m6571(textInputLayout11, C2105.m6981(RunnableC3474.m10633(f42777, 191, 3, i28)) ^ 2124684479);
                    break;
                case -863384749:
                case -756442620:
                    textInputLayout6 = textInputLayout11;
                    i10 = i31;
                    sArr3 = sArr5;
                    str3 = strM1959;
                    i11 = i30;
                    textInputLayout10 = textInputLayout10;
                    textInputLayoutArr[z ? 1 : 0] = textInputLayout6;
                    TextInputLayout textInputLayout12 = viewOnClickListenerC14170.f42779;
                    textInputLayoutArr[1] = textInputLayout12;
                    if (C4117.f13076 <= 0) {
                        textInputLayout9 = textInputLayout12;
                        int iM25616 = (i25 - C0630.m2566("ۘۢ")) * 51;
                        i13 = ((iM25616 ^ i24) * 27403) ^ 2092102136;
                        i31 = i10;
                        i27 = iM25616 ^ (-1815645540);
                    } else {
                        int iM6986 = (C2105.m6981("ۜۛ") + i24) * (-59);
                        i13 = ((iM6986 ^ i25) * (-15021)) ^ 1148623593;
                        i31 = i10;
                        i27 = iM6986 ^ 881751214;
                        textInputLayout9 = textInputLayout12;
                    }
                    textInputLayout10 = textInputLayout10;
                    i30 = i11;
                    textInputLayout11 = textInputLayout6;
                    i26 = i13;
                    strM1959 = str3;
                    sArr5 = sArr3;
                    break;
                case -847267812:
                case 1683113212:
                    C2126.m7040();
                    C1128.m3851();
                    iM6983 = C2105.m6981("ۛ᩸") ^ i25;
                    i19 = ((iM6983 ^ i24) * (-11229)) ^ (-1345953551);
                    i21 = 1106138569;
                    r8 = c10644;
                    i27 = iM6983 ^ i21;
                    c10644 = r8;
                    i26 = i19;
                    break;
                case -627355235:
                case 376682620:
                    C4075.m12263();
                    if (!C2126.f7087) {
                        iM6983 = C2105.m6981("֫ۧ") ^ i25;
                        i19 = ((iM6983 ^ i24) * (-17609)) ^ 143131867;
                        i21 = -531683593;
                        r8 = c10644;
                        i27 = iM6983 ^ i21;
                        c10644 = r8;
                        i26 = i19;
                    } else {
                        textInputLayout11 = textInputLayout11;
                        i31 = i31;
                        sArr5 = sArr5;
                        textInputLayout9 = textInputLayout9;
                        strM1959 = strM1959;
                        i30 = i30;
                        textInputLayout10 = textInputLayout10;
                        iM2566 = (i24 - C2105.m6981("ۤܶ")) * 57;
                        i = ((iM2566 ^ i25) * 5379) ^ 2070315763;
                        i2 = 1922231081;
                        i4 = iM2566 ^ i2;
                        strM1959 = strM1959;
                        sArr5 = sArr5;
                        int i319 = i30;
                        textInputLayout11 = textInputLayout11;
                        i26 = i;
                        textInputLayout10 = textInputLayout10;
                        i30 = i319;
                        int i3110 = i31;
                        i27 = i4;
                        textInputLayout9 = textInputLayout9;
                        i31 = i3110;
                    }
                    break;
                case -557182113:
                case 2026847028:
                    i11 = i30;
                    i10 = i31;
                    sArr3 = sArr5;
                    textInputLayout5 = textInputLayout9;
                    textInputLayout10 = textInputLayout10;
                    str3 = strM1959;
                    TextInputLayout[] textInputLayoutArr2 = new TextInputLayout[3];
                    z = false;
                    z = false;
                    TextInputLayout textInputLayout13 = viewOnClickListenerC14170.f42778;
                    if (C0050.m940() > 0) {
                        int iM6987 = (C2105.m6981("ۤܺ") + i25) * 127;
                        int i45 = ((iM6987 ^ i24) * (-5235)) ^ (-812914428);
                        i12 = iM6987 ^ (-1974032592);
                        textInputLayoutArr = textInputLayoutArr2;
                        i26 = i45;
                        strM1959 = str3;
                        sArr5 = sArr3;
                        i5 = i11;
                        textInputLayout11 = textInputLayout13;
                        textInputLayout9 = textInputLayout5;
                        i31 = i10;
                        i27 = i12;
                        textInputLayout10 = textInputLayout10;
                        i30 = i5;
                    } else {
                        textInputLayoutArr = textInputLayoutArr2;
                        textInputLayout6 = textInputLayout13;
                        textInputLayout9 = textInputLayout5;
                        int iM25617 = (i25 - C0630.m2566("ۘۢ")) * 51;
                        i13 = ((iM25617 ^ i24) * 27403) ^ 2092102136;
                        i31 = i10;
                        i27 = iM25617 ^ (-1815645540);
                        textInputLayout10 = textInputLayout10;
                        i30 = i11;
                        textInputLayout11 = textInputLayout6;
                        i26 = i13;
                        strM1959 = str3;
                        sArr5 = sArr3;
                    }
                    break;
                case -519251781:
                case -334139286:
                    C1773.m5908();
                    if (C4263.f13799 > 0) {
                        textInputLayout = textInputLayout11;
                        i6 = i31;
                        sArr = sArr5;
                        textInputLayout2 = textInputLayout9;
                        str = strM1959;
                        i7 = i30;
                        textInputLayout3 = textInputLayout10;
                        iM2567 = (C2105.m6981("ۜ֫") + i24) * (-37);
                        i8 = ((iM2567 ^ i25) * (-6049)) ^ 395911102;
                        i9 = -1295530643;
                        int i320 = iM2567 ^ i9;
                        textInputLayout10 = textInputLayout3;
                        i30 = i7;
                        strM1959 = str;
                        textInputLayout11 = textInputLayout;
                        i26 = i8;
                        sArr5 = sArr;
                        textInputLayout9 = textInputLayout2;
                        i31 = i6;
                        i27 = i320;
                        viewOnClickListenerC14170 = this;
                    } else {
                        iM6983 = C2105.m6981("᩶ܿ") ^ i25;
                        i19 = ((iM6983 ^ i24) * (-29347)) ^ (-359911849);
                        i21 = 434212054;
                        r8 = c10644;
                        i27 = iM6983 ^ i21;
                        c10644 = r8;
                        i26 = i19;
                    }
                    break;
                case -518639231:
                case -362080251:
                    RunnableC3474.m10621(textInputLayout9, C0630.m2566(C2167.m7159(f42777, 197, 3, i28)) ^ 2101310728);
                    break;
                case -293187721:
                case 1563793250:
                    AbstractC2021.m6571(textInputLayout11, C0630.m2566(C0798.m3005(f42777, 182, 3, i28)) ^ 2127220077);
                    break;
                case -266437005:
                case 762360016:
                    C1504.m5179();
                    break;
                case -258515362:
                case 1926557620:
                    RunnableC3474.m10621(textInputLayout10, iM25611);
                    break;
                case -219575531:
                case 1282801790:
                    i28 = 5263;
                    iM2566 = C0630.m2566("᩺۟") ^ i24;
                    i = ((iM2566 ^ i25) * 23147) ^ 48862036;
                    i2 = 927913653;
                    i4 = iM2566 ^ i2;
                    strM1959 = strM1959;
                    sArr5 = sArr5;
                    int i3111 = i30;
                    textInputLayout11 = textInputLayout11;
                    i26 = i;
                    textInputLayout10 = textInputLayout10;
                    i30 = i3111;
                    int i3112 = i31;
                    i27 = i4;
                    textInputLayout9 = textInputLayout9;
                    i31 = i3112;
                    break;
                case -101568992:
                case 1716857427:
                    textInputLayout10 = textInputLayout10;
                    textInputLayout4 = textInputLayout11;
                    i10 = i31;
                    sArr2 = sArr5;
                    textInputLayout5 = textInputLayout9;
                    iM3006 = C0798.m3006(view);
                    str2 = strM1959;
                    strM6573 = AbstractC2021.m6573(f42777, 185, 3, i28);
                    if (C0630.f2410 <= 0) {
                        iM2569 = (C2105.m6981("᩷ܳ") + i24) * 5;
                        i17 = ((iM2569 ^ i25) * 20577) ^ (-2141726721);
                        i18 = 1085319876;
                    } else {
                        iM2569 = (i24 - C0630.m2566("ۢܿ")) * 123;
                        i17 = ((iM2569 ^ i25) * (-2573)) ^ (-968981304);
                        i18 = 50511811;
                    }
                    i12 = iM2569 ^ i18;
                    textInputLayout11 = textInputLayout4;
                    i26 = i17;
                    strM1959 = str2;
                    sArr5 = sArr2;
                    i5 = iM3006;
                    str4 = strM6573;
                    textInputLayout9 = textInputLayout5;
                    i31 = i10;
                    i27 = i12;
                    textInputLayout10 = textInputLayout10;
                    i30 = i5;
                    break;
                case -16243648:
                case 781724233:
                    TextInputLayout textInputLayout14 = textInputLayout11;
                    int i46 = i31;
                    short[] sArr7 = sArr5;
                    textInputLayout7 = textInputLayout9;
                    String str5 = strM1959;
                    int i47 = i30;
                    textInputLayout10 = viewOnClickListenerC14170.f42782;
                    textInputLayoutArr[2] = textInputLayout10;
                    if (C0287.m1632(textInputLayoutArr)) {
                        iM2568 = (i24 - C2105.m6981("᩹ܶ")) * (-83);
                        i14 = ((iM2568 ^ i25) * (-31275)) ^ (-1027854945);
                        i15 = 1334137236;
                    } else {
                        iM2568 = (C0630.m2566("ۢۡ") ^ i25) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i14 = ((iM2568 ^ i24) * 17451) ^ (-322338955);
                        i15 = 1933257920;
                    }
                    int i48 = iM2568 ^ i15;
                    i30 = i47;
                    textInputLayout11 = textInputLayout14;
                    i26 = i14;
                    strM1959 = str5;
                    sArr5 = sArr7;
                    i16 = i46;
                    i27 = i48;
                    textInputLayout9 = textInputLayout7;
                    i31 = i16;
                    break;
                case 497587286:
                case 1926364154:
                    C21923.m49330(view, z);
                    final C13136 c13136 = new C13136(abstractActivityC3346, iM25610);
                    C3746.m11365(c13136);
                    c10644 = new InterfaceC9461() { // from class: l.ۧ֡ۡ
                        {
                            int i49 = 1902775114;
                            int i50 = C3746.f11829;
                            int i51 = C1294.f4556;
                            int iM25618 = (C0630.m2566("֫ۧ") ^ i50) * 49;
                            int i52 = ((iM25618 ^ i51) * (-8085)) ^ (-1275782339);
                            int i53 = -625725080;
                            while (true) {
                                i49 = ((((i49 ^ i51) * 26769) >> 31) & i52) ^ (iM25618 ^ i53);
                                switch (i49) {
                                    case -1971236007:
                                    case 65605396:
                                        if (C0422.f1886 <= 0) {
                                            iM25618 = (C2105.m6981("ܽۛ") + i51) * (-35);
                                            i52 = ((iM25618 ^ i50) * 10479) ^ (-1865177422);
                                            i53 = 861225444;
                                        } else {
                                            iM25618 = (C0630.m2566("ܺۛ") ^ i51) * 87;
                                            i52 = ((iM25618 ^ i50) * (-6639)) ^ (-420490990);
                                            i53 = -1411999860;
                                        }
                                        break;
                                    case -1698448156:
                                    case 2037526748:
                                        if (C0630.f2410 <= 0) {
                                            iM25618 = (C2105.m6981("᩶᩺") + i51) * 7;
                                            i52 = ((iM25618 ^ i50) * 13747) ^ (-1672533519);
                                            i53 = -1621465027;
                                        } else {
                                            iM25618 = C2105.m6981("᩵ۘ") ^ i51;
                                            i52 = ((iM25618 ^ i50) * (-24497)) ^ (-386105696);
                                            i53 = -1191319086;
                                        }
                                        break;
                                    case -1661665124:
                                    case 779602209:
                                        if (C3019.f9544 >= 0) {
                                            iM25618 = C0630.m2566("᩹ۛ") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 8959) ^ 448179634;
                                            i53 = -1198307389;
                                        } else {
                                            iM25618 = (C2105.m6981("᩸۠") + i50) * (-111);
                                            i52 = ((iM25618 ^ i51) * (-6067)) ^ 418245477;
                                            i53 = -1564073784;
                                        }
                                        break;
                                    case -1470860087:
                                    case 1533762513:
                                        if (C22628.f73083 <= 0) {
                                            iM25618 = (C2105.m6981("᩶᩺") + i51) * 7;
                                            i52 = ((iM25618 ^ i50) * 13747) ^ (-1672533519);
                                            i53 = -1621465027;
                                        } else {
                                            iM25618 = C2105.m6981("ᩴܽ") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 14555) ^ (-1574069156);
                                            i53 = -1292381894;
                                        }
                                        break;
                                    case -1148316241:
                                    case 1816231306:
                                        if (C2958.f9394 >= 0) {
                                            iM25618 = (C0630.m2566("᩶᩻") + i50) * 79;
                                            i52 = ((iM25618 ^ i51) * (-19705)) ^ (-1368553240);
                                            i53 = -428963228;
                                        } else {
                                            iM25618 = C2105.m6981("ۘᩴ") ^ i50;
                                            i52 = ((iM25618 ^ i51) * 20529) ^ 2138432511;
                                            i53 = 1697687917;
                                        }
                                        break;
                                    case -1026281447:
                                    case 402023674:
                                        if (RunnableC0588.f2309 >= 0) {
                                            iM25618 = C0630.m2566("᩹ۛ") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 8959) ^ 448179634;
                                            i53 = -1198307389;
                                        } else {
                                            iM25618 = (C0630.m2566("ۗᩴ") + i50) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i52 = ((iM25618 ^ i51) * (-13663)) ^ (-1748989788);
                                            i53 = 30485966;
                                        }
                                        break;
                                    case -995851691:
                                    case 2126398350:
                                        if (C2520.m8026()) {
                                            iM25618 = (C2105.m6981("᩶᩺") + i51) * 7;
                                            i52 = ((iM25618 ^ i50) * 13747) ^ (-1672533519);
                                            i53 = -1621465027;
                                        } else {
                                            iM25618 = C2105.m6981("᩵֫") ^ i51;
                                            i52 = ((iM25618 ^ i50) * (-553)) ^ (-798980851);
                                            i53 = 344300114;
                                        }
                                        break;
                                    case -861362495:
                                    case 1443777204:
                                        C0422.m1963();
                                        if (!C2126.f7087) {
                                            iM25618 = (C0630.m2566("᩶᩻") + i50) * 79;
                                            i52 = ((iM25618 ^ i51) * (-19705)) ^ (-1368553240);
                                            i53 = -428963228;
                                        } else {
                                            iM25618 = C0630.m2566("ܰᩳ") ^ i50;
                                            i52 = ((iM25618 ^ i51) * (-9599)) ^ (-295826331);
                                            i53 = 1925426031;
                                        }
                                        break;
                                    case -804920534:
                                    case -714801077:
                                        return;
                                    case -278618454:
                                    case 1963820097:
                                        if (C1773.f6144 <= 0) {
                                            iM25618 = C0630.m2566("ܰᩳ") ^ i50;
                                            i52 = ((iM25618 ^ i51) * (-9599)) ^ (-295826331);
                                            i53 = 1925426031;
                                        } else {
                                            iM25618 = (C2105.m6981("ۖ֨") + i50) * 127;
                                            i52 = ((iM25618 ^ i51) * 17167) ^ 1722681318;
                                            i53 = 1566327512;
                                        }
                                        break;
                                    case 168360300:
                                    case 395889258:
                                        C4159.m12565();
                                        iM25618 = C0630.m2566("ܰᩳ") ^ i50;
                                        i52 = ((iM25618 ^ i51) * (-9599)) ^ (-295826331);
                                        i53 = 1925426031;
                                        break;
                                    case 503077976:
                                    case 2102739577:
                                        if (C7106.m19120() <= 0) {
                                            iM25618 = (C0630.m2566("᩶᩻") + i50) * 79;
                                            i52 = ((iM25618 ^ i51) * (-19705)) ^ (-1368553240);
                                            i53 = -428963228;
                                        } else {
                                            iM25618 = (C2105.m6981("ۗܶ") + i50) * 9;
                                            i52 = ((iM25618 ^ i51) * (-25437)) ^ 725754468;
                                            i53 = -419056701;
                                        }
                                        break;
                                    case 586824513:
                                    case 1293644851:
                                        if (!C2272.m7503()) {
                                            iM25618 = C0630.m2566("ܰᩳ") ^ i50;
                                            i52 = ((iM25618 ^ i51) * (-9599)) ^ (-295826331);
                                            i53 = 1925426031;
                                        } else {
                                            iM25618 = (C2105.m6981("᩶᩺") + i51) * 7;
                                            i52 = ((iM25618 ^ i50) * 13747) ^ (-1672533519);
                                            i53 = -1621465027;
                                        }
                                        break;
                                    case 1484539666:
                                    case 1989126513:
                                        if (C3911.m11924() > 0) {
                                            iM25618 = C0630.m2566("᩹ۛ") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 8959) ^ 448179634;
                                            i53 = -1198307389;
                                        } else {
                                            iM25618 = C0630.m2566("ܰᩳ") ^ i50;
                                            i52 = ((iM25618 ^ i51) * (-9599)) ^ (-295826331);
                                            i53 = 1925426031;
                                        }
                                        break;
                                    case 1654683470:
                                    case 2058286727:
                                        if (C1773.f6144 <= 0) {
                                            iM25618 = (C0630.m2566("᩶᩻") + i50) * 79;
                                            i52 = ((iM25618 ^ i51) * (-19705)) ^ (-1368553240);
                                            i53 = -428963228;
                                        } else {
                                            iM25618 = C2105.m6981("᩻۟") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 28047) ^ (-1726947666);
                                            i53 = 902312203;
                                        }
                                        break;
                                    default:
                                        C3663.m11168();
                                        throw new RuntimeException();
                                }
                            }
                        }

                        @Override // l.InterfaceC9461
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo1430(C23881 c23881) {
                            ViewOnClickListenerC14170 viewOnClickListenerC14171 = null;
                            int i49 = -1183946682;
                            int i50 = C1294.f4556;
                            int i51 = C3537.f11231;
                            int iM25618 = (C0630.m2566("۠۬") ^ i50) * 3;
                            int i52 = ((iM25618 ^ i51) * 10325) ^ (-1227027691);
                            int i53 = 792836071;
                            while (true) {
                                i49 = ((((i49 ^ i51) * 7835) >> 31) & i52) ^ (iM25618 ^ i53);
                                switch (i49) {
                                    case -1941312542:
                                    case -1921106314:
                                        if (C1294.m4372() <= 0) {
                                            iM25618 = C0630.m2566("ܳ֨") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 8967) ^ 769261849;
                                            i53 = -622436901;
                                        } else {
                                            iM25618 = C0630.m2566("ܺܳ") ^ i50;
                                            i52 = ((iM25618 ^ i51) * 20659) ^ 1001872847;
                                            i53 = 1832994183;
                                        }
                                        break;
                                    case -1874229583:
                                    case 190821700:
                                        if (C21923.f70183 == 0) {
                                            iM25618 = C0630.m2566("۫ۨ") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 6759) ^ (-753163087);
                                            i53 = -732895567;
                                        } else {
                                            iM25618 = C2105.m6981("᩺۠") ^ i50;
                                            i52 = ((iM25618 ^ i51) * 12557) ^ (-727214352);
                                            i53 = 1470480657;
                                        }
                                        break;
                                    case -1724750797:
                                    case 800141218:
                                        if (C4159.f13567) {
                                            iM25618 = C0630.m2566("ۚۗ") ^ i50;
                                            i52 = ((iM25618 ^ i51) * 16761) ^ (-817926628);
                                            i53 = 1842094258;
                                        } else {
                                            iM25618 = C0630.m2566("۫ۨ") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 6759) ^ (-753163087);
                                            i53 = -732895567;
                                        }
                                        break;
                                    case -1619669855:
                                    case -630419183:
                                        ViewOnClickListenerC14170.m33822(view, c13136, c23881, viewOnClickListenerC14171);
                                        break;
                                    case -1285038295:
                                    case 2107761724:
                                        if (C3683.f11629 >= 0) {
                                            iM25618 = (C0630.m2566("ۨ᩹") ^ i50) * 95;
                                            i52 = ((iM25618 ^ i51) * (-28027)) ^ (-692272446);
                                            i53 = -1798819340;
                                        } else {
                                            iM25618 = (C0630.m2566("ܿ᩷") ^ i51) * (-5);
                                            i52 = ((iM25618 ^ i50) * (-9553)) ^ (-1762931657);
                                            i53 = 1780487440;
                                        }
                                        break;
                                    case -1242663817:
                                    case -122794852:
                                        if (C3683.f11629 < 0) {
                                            iM25618 = C0630.m2566("۫ۨ") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 6759) ^ (-753163087);
                                            i53 = -732895567;
                                        } else {
                                            iM25618 = C2105.m6981("ܺۚ") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 21903) ^ (-1253731055);
                                            i53 = -2025603575;
                                        }
                                        break;
                                    case -1216335284:
                                    case 1624903410:
                                        C0714.m2805();
                                        iM25618 = C2105.m6981("ܺۚ") ^ i51;
                                        i52 = ((iM25618 ^ i50) * 21903) ^ (-1253731055);
                                        i53 = -2025603575;
                                        break;
                                    case -1035397995:
                                    case -86929966:
                                        if (C1294.f4556 >= 0) {
                                            iM25618 = C0630.m2566("۫ۨ") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 6759) ^ (-753163087);
                                            i53 = -732895567;
                                        } else {
                                            iM25618 = (C0630.m2566("֡ۡ") ^ i51) * 37;
                                            i52 = ((iM25618 ^ i50) * 16433) ^ 1586553976;
                                            i53 = 1617358000;
                                        }
                                        break;
                                    case -1027322460:
                                    case -428588092:
                                        if (C22628.m50615() != 0) {
                                            iM25618 = C0630.m2566("ܳ֨") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 8967) ^ 769261849;
                                            i53 = -622436901;
                                        } else {
                                            iM25618 = C0630.m2566("ۧ᩻") ^ i51;
                                            i52 = ((iM25618 ^ i50) * (-6311)) ^ (-538318615);
                                            i53 = -1332169777;
                                        }
                                        break;
                                    case -999708009:
                                    case -699585199:
                                        viewOnClickListenerC14171 = viewOnClickListenerC14170;
                                        if (C1128.f4106 <= 0) {
                                            iM25618 = C0630.m2566("ܳ֨") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 8967) ^ 769261849;
                                            i53 = -622436901;
                                        } else {
                                            iM25618 = (i50 - C0630.m2566("᩵ۙ")) * (-33);
                                            i52 = ((iM25618 ^ i51) * 15939) ^ 1178197097;
                                            i53 = -1440248088;
                                        }
                                        break;
                                    case -577829780:
                                    case 576227730:
                                        if (C1005.f3721) {
                                            iM25618 = (C2105.m6981("֡ۜ") + i51) * 123;
                                            i52 = ((iM25618 ^ i50) * (-20959)) ^ (-28424062);
                                            i53 = -142035616;
                                        } else {
                                            iM25618 = C0630.m2566("ܳ֨") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 8967) ^ 769261849;
                                            i53 = -622436901;
                                        }
                                        break;
                                    case 95294293:
                                    case 1629573105:
                                        if (C0483.m2121()) {
                                            iM25618 = C0630.m2566("᩷ܰ") ^ i51;
                                            i52 = ((iM25618 ^ i50) * (-13729)) ^ 1324838094;
                                            i53 = 133634690;
                                        } else {
                                            iM25618 = (C0630.m2566("ۨ᩹") ^ i50) * 95;
                                            i52 = ((iM25618 ^ i51) * (-28027)) ^ (-692272446);
                                            i53 = -1798819340;
                                        }
                                        break;
                                    case 868794151:
                                    case 1166231113:
                                        if (C1005.f3721) {
                                            iM25618 = (i50 - C2105.m6981("᩺᩶")) * (-69);
                                            i52 = ((iM25618 ^ i51) * 14163) ^ (-1218883621);
                                            i53 = -1545495296;
                                        } else {
                                            iM25618 = (C0630.m2566("ۨ᩹") ^ i50) * 95;
                                            i52 = ((iM25618 ^ i51) * (-28027)) ^ (-692272446);
                                            i53 = -1798819340;
                                        }
                                        break;
                                    case 1111079683:
                                    case 1886051477:
                                        if (C4616.f14690 <= 0) {
                                            iM25618 = C2105.m6981("ܺۚ") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 21903) ^ (-1253731055);
                                            i53 = -2025603575;
                                        } else {
                                            iM25618 = C2105.m6981("۟᩸") ^ i50;
                                            i52 = ((iM25618 ^ i51) * (-25479)) ^ 1381360461;
                                            i53 = 477070971;
                                        }
                                        break;
                                    case 1266041021:
                                    case 1459246243:
                                        C3663.m11168();
                                        break;
                                    default:
                                        C3019.m9255();
                                        if (C0050.f910 >= 0) {
                                            iM25618 = (C0630.m2566("ۨ᩹") ^ i50) * 95;
                                            i52 = ((iM25618 ^ i51) * (-28027)) ^ (-692272446);
                                            i53 = -1798819340;
                                        } else {
                                            iM25618 = C2105.m6981("ܺۚ") ^ i51;
                                            i52 = ((iM25618 ^ i50) * 21903) ^ (-1253731055);
                                            i53 = -2025603575;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    if (C3019.f9544 >= 0) {
                        iM6983 = C2105.m6981("֫ۧ") ^ i25;
                        i19 = ((iM6983 ^ i24) * (-17609)) ^ 143131867;
                        i21 = -531683593;
                        r8 = c10644;
                    } else {
                        iM6983 = (C2105.m6981("ۤۢ") ^ i25) * 85;
                        i19 = ((iM6983 ^ i24) * (-5201)) ^ (-861022627);
                        i21 = -1304929994;
                        r8 = c10644;
                    }
                    i27 = iM6983 ^ i21;
                    c10644 = r8;
                    i26 = i19;
                    break;
                case 1341769223:
                case 1929097427:
                    C22628.m50613(view, z);
                    final C13136 c13137 = new C13136(abstractActivityC3346, iM25610);
                    C3746.m11365(c13137);
                    if (C1916.m6308() < 0) {
                        C1005.m3499(new C17927(strM1959, iM6572, abstractActivityC3346, new InterfaceC9461() { // from class: l.ܽ֡ۡ
                            {
                                int i49 = 172352514;
                                int i50 = C2167.f7158;
                                int i51 = C3245.f10203;
                                int iM25618 = C0630.m2566("۟᩷") ^ i51;
                                int i52 = ((iM25618 ^ i50) * 23293) ^ (-1230711856);
                                int i53 = 1959585684;
                                while (true) {
                                    i49 = ((((i49 ^ i50) * (-5463)) >> 31) & i52) ^ (iM25618 ^ i53);
                                    switch (i49) {
                                        case -2014147697:
                                        case -1823046798:
                                            if (C3683.f11629 >= 0) {
                                                iM25618 = (C0630.m2566("ۙܰ") ^ i50) * 41;
                                                i52 = ((iM25618 ^ i51) * 5237) ^ (-440141607);
                                                i53 = -1813712614;
                                            } else {
                                                iM25618 = (C0630.m2566("ۜ᩸") + i51) * 47;
                                                i52 = ((iM25618 ^ i50) * 5135) ^ (-993487133);
                                                i53 = -648097498;
                                            }
                                            break;
                                        case -1926369254:
                                        case 2136885887:
                                            if (C2105.f7037 != 0) {
                                                iM25618 = (C0630.m2566("ۙܰ") ^ i50) * 41;
                                                i52 = ((iM25618 ^ i51) * 5237) ^ (-440141607);
                                                i53 = -1813712614;
                                            } else {
                                                iM25618 = C0630.m2566("᩹ۡ") ^ i50;
                                                i52 = ((iM25618 ^ i51) * 3703) ^ (-791074149);
                                                i53 = 992226216;
                                            }
                                            break;
                                        case -1254954953:
                                        case 562702126:
                                            if (C4117.f13076 > 0) {
                                                iM25618 = (C0630.m2566("ۙܰ") ^ i50) * 41;
                                                i52 = ((iM25618 ^ i51) * 5237) ^ (-440141607);
                                                i53 = -1813712614;
                                            } else {
                                                iM25618 = C2105.m6981("۬᩸") ^ i50;
                                                i52 = ((iM25618 ^ i51) * 1487) ^ (-1811680663);
                                                i53 = -1613611263;
                                            }
                                            break;
                                        case -1126941619:
                                        case 1494188198:
                                            if (C5695.f17556 >= 0) {
                                                iM25618 = C2105.m6981("ۡ۠") ^ i51;
                                                i52 = ((iM25618 ^ i50) * 25421) ^ (-96330301);
                                                i53 = 1630455962;
                                            } else {
                                                iM25618 = C0630.m2566("۠ۛ") ^ i50;
                                                i52 = ((iM25618 ^ i51) * (-8307)) ^ (-1640582511);
                                                i53 = 831539934;
                                            }
                                            break;
                                        case -1099944149:
                                        case 562549298:
                                            if (C3432.f10845 >= 0) {
                                                iM25618 = C0630.m2566("۬ᩴ") ^ i51;
                                                i52 = ((iM25618 ^ i50) * 27725) ^ (-463507177);
                                                i53 = 66293326;
                                            } else {
                                                iM25618 = (i50 - C0630.m2566("᩺ᩴ")) * (-61);
                                                i52 = ((iM25618 ^ i51) * 1353) ^ 1754433040;
                                                i53 = 405944115;
                                            }
                                            break;
                                        case -969873537:
                                        case 1563888355:
                                            if (RunnableC0588.f2309 >= 0) {
                                                iM25618 = C2105.m6981("ۡ۠") ^ i51;
                                                i52 = ((iM25618 ^ i50) * 25421) ^ (-96330301);
                                                i53 = 1630455962;
                                            } else {
                                                iM25618 = C2105.m6981("۬᩸") ^ i50;
                                                i52 = ((iM25618 ^ i51) * 1487) ^ (-1811680663);
                                                i53 = -1613611263;
                                            }
                                            break;
                                        case -959760690:
                                        case 978687361:
                                            if (C0382.f1805) {
                                                iM25618 = (C2105.m6981("ۛۨ") ^ i51) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i52 = ((iM25618 ^ i50) * 5005) ^ 666774694;
                                                i53 = -182533514;
                                            } else {
                                                iM25618 = (C0630.m2566("᩷᩹") ^ i51) * 23;
                                                i52 = ((iM25618 ^ i50) * (-6093)) ^ (-604715311);
                                                i53 = -542068763;
                                            }
                                            break;
                                        case -951539325:
                                        case 611575186:
                                            C0483.m2121();
                                            C1711.m5736();
                                            iM25618 = C2105.m6981("۬᩸") ^ i50;
                                            i52 = ((iM25618 ^ i51) * 1487) ^ (-1811680663);
                                            i53 = -1613611263;
                                            break;
                                        case -731981284:
                                        case 1183072811:
                                            C4159.m12565();
                                            throw new RuntimeException();
                                        case -495870970:
                                        case 94961559:
                                            if (C3432.f10845 >= 0) {
                                                iM25618 = C2105.m6981("۬᩸") ^ i50;
                                                i52 = ((iM25618 ^ i51) * 1487) ^ (-1811680663);
                                                i53 = -1613611263;
                                            } else {
                                                iM25618 = (C2105.m6981("ۡۜ") + i51) * (-95);
                                                i52 = ((iM25618 ^ i50) * (-7733)) ^ 827085264;
                                                i53 = 1838430588;
                                            }
                                            break;
                                        case -389669629:
                                        case 823524899:
                                            if (RunnableC1937.f6483 >= 0) {
                                                iM25618 = (C0630.m2566("ۙܰ") ^ i50) * 41;
                                                i52 = ((iM25618 ^ i51) * 5237) ^ (-440141607);
                                                i53 = -1813712614;
                                            } else {
                                                iM25618 = (i50 - C0630.m2566("۟ۖ")) * (-5);
                                                i52 = ((iM25618 ^ i51) * 24499) ^ (-1462996550);
                                                i53 = 1376062727;
                                            }
                                            break;
                                        case -202554645:
                                        case 790121719:
                                            return;
                                        case 71926387:
                                        case 1129794797:
                                            C0630.m2564();
                                            if (ViewOnClickListenerC1958.f6529 > 0) {
                                                iM25618 = (C0630.m2566("᩷᩹") ^ i51) * 23;
                                                i52 = ((iM25618 ^ i50) * (-6093)) ^ (-604715311);
                                                i53 = -542068763;
                                            } else {
                                                iM25618 = C2105.m6981("۬᩸") ^ i50;
                                                i52 = ((iM25618 ^ i51) * 1487) ^ (-1811680663);
                                                i53 = -1613611263;
                                            }
                                            break;
                                        case 344316523:
                                        case 1477564646:
                                            if (C4075.f12947 >= 0) {
                                                iM25618 = (C0630.m2566("ۙܰ") ^ i50) * 41;
                                                i52 = ((iM25618 ^ i51) * 5237) ^ (-440141607);
                                                i53 = -1813712614;
                                            } else {
                                                iM25618 = C0630.m2566("ۤۤ") ^ i51;
                                                i52 = ((iM25618 ^ i50) * 19851) ^ 1957764757;
                                                i53 = -458051034;
                                            }
                                            break;
                                        case 946799370:
                                        case 1454723204:
                                            if (C7106.f21815 != 0) {
                                                iM25618 = (C0630.m2566("ۙܰ") ^ i50) * 41;
                                                i52 = ((iM25618 ^ i51) * 5237) ^ (-440141607);
                                                i53 = -1813712614;
                                            } else {
                                                iM25618 = (C2105.m6981("ۤ᩷") ^ i51) * 55;
                                                i52 = ((iM25618 ^ i50) * (-2439)) ^ (-1562132584);
                                                i53 = 825012939;
                                            }
                                            break;
                                        default:
                                            if (C3537.f11231 >= 0) {
                                                iM25618 = C2105.m6981("ۡ۠") ^ i51;
                                                i52 = ((iM25618 ^ i50) * 25421) ^ (-96330301);
                                                i53 = 1630455962;
                                            } else {
                                                iM25618 = C2105.m6981("᩻᩶") ^ i50;
                                                i52 = ((iM25618 ^ i51) * (-7753)) ^ 1787777934;
                                                i53 = -2126242917;
                                            }
                                            break;
                                    }
                                }
                            }

                            @Override // l.InterfaceC9461
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo1430(C23881 c23881) {
                                View view2 = null;
                                int i49 = -689762803;
                                int i50 = C2167.f7158;
                                int i51 = C4263.f13799;
                                int iM6988 = (C2105.m6981("ۤܶ") ^ i50) * (-5);
                                int i52 = ((iM6988 ^ i51) * 23519) ^ 1322709927;
                                int i53 = 118340593;
                                while (true) {
                                    i49 = ((((i49 ^ i51) * 12995) >> 31) & i52) ^ (iM6988 ^ i53);
                                    switch (i49) {
                                        case -2140367356:
                                        case -1747879083:
                                            C0237.m1481();
                                            if (C3019.m9255() <= 0) {
                                                iM6988 = (i50 - C2105.m6981("ᩳ۫")) * 61;
                                                i52 = ((iM6988 ^ i51) * 31727) ^ (-1039232997);
                                                i53 = 1495826018;
                                            } else {
                                                iM6988 = C2105.m6981("۬᩷") ^ i51;
                                                i52 = ((iM6988 ^ i50) * 10071) ^ (-277220082);
                                                i53 = -1999311143;
                                            }
                                            break;
                                        case -2000278078:
                                        case -1260692427:
                                            if (C3537.f11231 >= 0) {
                                                iM6988 = (i50 - C2105.m6981("ᩳ۫")) * 61;
                                                i52 = ((iM6988 ^ i51) * 31727) ^ (-1039232997);
                                                i53 = 1495826018;
                                            } else {
                                                iM6988 = (C2105.m6981("۠ۨ") + i51) * (-9);
                                                i52 = ((iM6988 ^ i50) * (-25029)) ^ 1125215171;
                                                i53 = 1707401215;
                                            }
                                            break;
                                        case -1846402572:
                                        case 258643085:
                                            C0237.m1481();
                                            C0483.m2121();
                                            break;
                                        case -1837473957:
                                        case -244712870:
                                            view2 = view;
                                            if (C4616.f14690 <= 0) {
                                                iM6988 = (C2105.m6981("ܽܺ") + i51) * (-41);
                                                i52 = ((iM6988 ^ i50) * (-15185)) ^ 569990986;
                                                i53 = 494192247;
                                            } else {
                                                iM6988 = (i51 - C0630.m2566("᩶ܿ")) * (-125);
                                                i52 = ((iM6988 ^ i50) * 14193) ^ (-603157010);
                                                i53 = 1338089650;
                                            }
                                            break;
                                        case -1826038689:
                                        case 461275528:
                                            if (C1047.f3863 >= 0) {
                                                iM6988 = C0630.m2566("֡᩵") ^ i51;
                                                i52 = ((iM6988 ^ i50) * (-12529)) ^ (-1351480307);
                                                i53 = 550662150;
                                            } else {
                                                iM6988 = (C0630.m2566("ۧۘ") + i50) * 53;
                                                i52 = ((iM6988 ^ i51) * 2725) ^ 1070145091;
                                                i53 = 731203632;
                                            }
                                            break;
                                        case -1287133898:
                                        case -543264764:
                                            if (C2958.f9394 >= 0) {
                                                iM6988 = C0630.m2566("֡᩵") ^ i51;
                                                i52 = ((iM6988 ^ i50) * (-12529)) ^ (-1351480307);
                                                i53 = 550662150;
                                            } else {
                                                iM6988 = C2105.m6981("ۗۢ") ^ i50;
                                                i52 = ((iM6988 ^ i51) * (-5447)) ^ 109779836;
                                                i53 = 1261177238;
                                            }
                                            break;
                                        case -1131923718:
                                        case 1925092167:
                                            C0630.m2564();
                                            if (C2520.f8000 < 0) {
                                                iM6988 = C0630.m2566("ۛ᩵") ^ i50;
                                                i52 = ((iM6988 ^ i51) * (-6591)) ^ (-137101051);
                                                i53 = 39794517;
                                            } else {
                                                iM6988 = (i50 - C2105.m6981("ᩳ۫")) * 61;
                                                i52 = ((iM6988 ^ i51) * 31727) ^ (-1039232997);
                                                i53 = 1495826018;
                                            }
                                            break;
                                        case -1086809014:
                                        case 1062361583:
                                            ViewOnClickListenerC14170.m33820(view2, c13137, c23881, viewOnClickListenerC14170);
                                            break;
                                        case -966930227:
                                        case 1503758342:
                                            if (C4075.f12947 >= 0) {
                                                iM6988 = C0630.m2566("ۛ᩵") ^ i50;
                                                i52 = ((iM6988 ^ i51) * (-6591)) ^ (-137101051);
                                                i53 = 39794517;
                                            } else {
                                                iM6988 = C0630.m2566("ۚۖ") ^ i51;
                                                i52 = ((iM6988 ^ i50) * (-16875)) ^ 889531341;
                                                i53 = -1485558197;
                                            }
                                            break;
                                        case -728894701:
                                        case 1537368647:
                                            if (C7811.f24123 >= 0) {
                                                iM6988 = C0630.m2566("ۛ᩵") ^ i50;
                                                i52 = ((iM6988 ^ i51) * (-6591)) ^ (-137101051);
                                                i53 = 39794517;
                                            } else {
                                                iM6988 = (i51 - C0630.m2566("ۗܺ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                i52 = ((iM6988 ^ i50) * 2273) ^ 1002337562;
                                                i53 = -368635154;
                                            }
                                            break;
                                        case -620145271:
                                        case 255579256:
                                            if (C4117.f13076 > 0) {
                                                iM6988 = C0630.m2566("֡᩵") ^ i51;
                                                i52 = ((iM6988 ^ i50) * (-12529)) ^ (-1351480307);
                                                i53 = 550662150;
                                            } else {
                                                iM6988 = (i50 - C2105.m6981("ᩳ۫")) * 61;
                                                i52 = ((iM6988 ^ i51) * 31727) ^ (-1039232997);
                                                i53 = 1495826018;
                                            }
                                            break;
                                        case 120606056:
                                        case 1793280772:
                                            if (C2105.f7037 != 0) {
                                                iM6988 = C0630.m2566("֡᩵") ^ i51;
                                                i52 = ((iM6988 ^ i50) * (-12529)) ^ (-1351480307);
                                                i53 = 550662150;
                                            } else {
                                                iM6988 = (C2105.m6981("ۛ᩷") ^ i51) * (-59);
                                                i52 = ((iM6988 ^ i50) * (-7519)) ^ 36401845;
                                                i53 = 1717297126;
                                            }
                                            break;
                                        case 137272409:
                                        case 1898258482:
                                            if (C4616.m13552() != 0) {
                                                iM6988 = (i50 - C2105.m6981("ᩳ۫")) * 61;
                                                i52 = ((iM6988 ^ i51) * 31727) ^ (-1039232997);
                                                i53 = 1495826018;
                                            } else {
                                                iM6988 = (C2105.m6981("۬ᩴ") + i50) * 49;
                                                i52 = ((iM6988 ^ i51) * 23137) ^ (-1423493196);
                                                i53 = -455703018;
                                            }
                                            break;
                                        case 344887770:
                                        case 1601374833:
                                            C3537.m10746();
                                            C0050.m940();
                                            iM6988 = (i50 - C2105.m6981("ᩳ۫")) * 61;
                                            i52 = ((iM6988 ^ i51) * 31727) ^ (-1039232997);
                                            i53 = 1495826018;
                                            break;
                                        case 1272789854:
                                        case 1300106927:
                                            if (C7811.m20844() != 0) {
                                                iM6988 = C0630.m2566("֡᩵") ^ i51;
                                                i52 = ((iM6988 ^ i50) * (-12529)) ^ (-1351480307);
                                                i53 = 550662150;
                                            } else {
                                                iM6988 = C2105.m6981("ۘۧ") ^ i50;
                                                i52 = ((iM6988 ^ i51) * (-20091)) ^ (-2058833225);
                                                i53 = 113780525;
                                            }
                                            break;
                                        default:
                                            if (C1916.f6442) {
                                                iM6988 = C2105.m6981("۟ܿ") ^ i50;
                                                i52 = ((iM6988 ^ i51) * (-21751)) ^ (-1228645422);
                                                i53 = -563733234;
                                            } else {
                                                iM6988 = C0630.m2566("ۛ᩵") ^ i50;
                                                i52 = ((iM6988 ^ i51) * (-6591)) ^ (-137101051);
                                                i53 = 39794517;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        }));
                    }
                    textInputLayout4 = textInputLayout11;
                    i10 = i31;
                    sArr2 = sArr5;
                    textInputLayout5 = textInputLayout9;
                    str2 = strM1959;
                    strM6573 = str4;
                    iM3006 = i30;
                    textInputLayout10 = textInputLayout10;
                    iM2569 = (C2105.m6981("᩷ܳ") + i24) * 5;
                    i17 = ((iM2569 ^ i25) * 20577) ^ (-2141726721);
                    i18 = 1085319876;
                    i12 = iM2569 ^ i18;
                    textInputLayout11 = textInputLayout4;
                    i26 = i17;
                    strM1959 = str2;
                    sArr5 = sArr2;
                    i5 = iM3006;
                    str4 = strM6573;
                    textInputLayout9 = textInputLayout5;
                    i31 = i10;
                    i27 = i12;
                    textInputLayout10 = textInputLayout10;
                    i30 = i5;
                    break;
                case 1345497942:
                case 1371493676:
                    if (C1128.f4106 <= 0) {
                        textInputLayout4 = textInputLayout11;
                        i10 = i31;
                        sArr2 = sArr5;
                        textInputLayout5 = textInputLayout9;
                        str2 = strM1959;
                        strM6573 = str4;
                        iM3006 = i30;
                        textInputLayout10 = textInputLayout10;
                        iM2569 = (C2105.m6981("᩷ܳ") + i24) * 5;
                        i17 = ((iM2569 ^ i25) * 20577) ^ (-2141726721);
                        i18 = 1085319876;
                        i12 = iM2569 ^ i18;
                        textInputLayout11 = textInputLayout4;
                        i26 = i17;
                        strM1959 = str2;
                        sArr5 = sArr2;
                        i5 = iM3006;
                        str4 = strM6573;
                        textInputLayout9 = textInputLayout5;
                        i31 = i10;
                        i27 = i12;
                        textInputLayout10 = textInputLayout10;
                        i30 = i5;
                    } else {
                        iM6983 = C2105.m6981("ۛ᩸") ^ i25;
                        i19 = ((iM6983 ^ i24) * (-11229)) ^ (-1345953551);
                        i21 = 1106138569;
                        r8 = c10644;
                        i27 = iM6983 ^ i21;
                        c10644 = r8;
                        i26 = i19;
                    }
                    break;
                case 1374249985:
                case 1411393480:
                    textInputLayout11 = textInputLayout11;
                    i31 = i31;
                    sArr5 = sArr5;
                    textInputLayout9 = textInputLayout9;
                    strM1959 = strM1959;
                    i30 = i30;
                    textInputLayout10 = textInputLayout10;
                    EditText editTextM5906 = C1773.m5905(textInputLayout11);
                    C2167.m7151(editTextM5906);
                    if (C1047.m3600(editTextM5906) < 4) {
                        iM2566 = C2105.m6981("ۧ۠") ^ i25;
                        i = ((iM2566 ^ i24) * 20973) ^ (-345053713);
                        i2 = -322597124;
                    } else {
                        iM2566 = (C0630.m2566("ܿᩴ") ^ i24) * 83;
                        i = ((iM2566 ^ i25) * (-25323)) ^ 882302353;
                        i2 = 349318073;
                    }
                    i4 = iM2566 ^ i2;
                    strM1959 = strM1959;
                    sArr5 = sArr5;
                    int i3113 = i30;
                    textInputLayout11 = textInputLayout11;
                    i26 = i;
                    textInputLayout10 = textInputLayout10;
                    i30 = i3113;
                    int i3114 = i31;
                    i27 = i4;
                    textInputLayout9 = textInputLayout9;
                    i31 = i3114;
                    break;
                default:
                    textInputLayout11 = textInputLayout11;
                    i31 = i31;
                    sArr5 = sArr5;
                    textInputLayout9 = textInputLayout9;
                    strM1959 = strM1959;
                    i30 = i30;
                    textInputLayout10 = textInputLayout10;
                    int i49 = (s * s) + 586756;
                    if ((i22 * i22) - (i49 + i49) <= 0) {
                        iM2566 = C2105.m6981("᩷ۡ") ^ i25;
                        i = ((iM2566 ^ i24) * 787) ^ (-1574356280);
                        i2 = 1125807384;
                    } else {
                        iM2566 = C0630.m2566("ۨ֡") ^ i24;
                        i = ((iM2566 ^ i25) * 1313) ^ (-861036614);
                        i2 = -136948723;
                    }
                    i4 = iM2566 ^ i2;
                    strM1959 = strM1959;
                    sArr5 = sArr5;
                    int i3115 = i30;
                    textInputLayout11 = textInputLayout11;
                    i26 = i;
                    textInputLayout10 = textInputLayout10;
                    i30 = i3115;
                    int i3116 = i31;
                    i27 = i4;
                    textInputLayout9 = textInputLayout9;
                    i31 = i3116;
                    break;
            }
            return;
        }
    }
}
