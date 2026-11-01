package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ۧۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q152 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC12568 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ᩳܺ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f82137 = {4429, 3901, -4905, 7099, -6468, 6048, -1673, -1728, 6777, 2710, -4098, 6107, -5406, 2753, -732, 4841, 9289, -5846, 4630, -6401, 744, -7675, -5832, -4268, 8440, -4822, 9296, 14372, -7678, 8406, 546, 5375, 3976, 5314, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30706, 30719, 30710, 30691, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30699, 30695, 30706, 30693, 30702, 30681, 30693, 30695, 30709, 30691, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30708, 30691, 30689, 30691, 30718, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30702, 30691, 30718, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30703, 30690, 30644, 30696, 30695, 30699, 30691, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30691, 30718, 30695, 30693, 30706, 30698, 30719, 30681, 30699, 30695, 30706, 30693, 30702, -1808, 3600, 6984, 1780, 6549, 2100, 9750, -2275, 1513, 9395, 25237, 25272, 25263, 25274, 25316, 25278, 25255, 25274, 6770, 5904, -10209, -14712, -13524, 15359, -15992, -8867, 12496, 5963, 19388, 19444, 19388, 19412, 19375, 19372, 19364, 19375, 19422, 19422, 19403, 19403, 19406, 19406, 19360, 19372, 19375, 19405, 19405, 19422, 19422, 19403, 19403, 19406, 19406, 19362, 19362, 19362, 19365, 19408, 19426, -8703, 6654, 5175, 19334, -8840, 15627, -9670, 16129, 10541, 5487, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19448, 19445, 19452, 19433, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19425, 19437, 19448, 19439, 19428, 19411, 19439, 19437, 19455, 19433, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19454, 19433, 19435, 19433, 19444, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19428, 19433, 19444, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19429, 19432, 19390, 19426, 19437, 19425, 19433, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19433, 19444, 19437, 19439, 19448, 19424, 19445, 19411, 19425, 19437, 19448, 19439, 19428, 19408, 19454, 19329, -10372, 10127, -14472, 19408, 19448, 19333, 19408, 19434, 19328, 19408, 19438, 19332};

    /* JADX INFO: renamed from: ۗ */
    public final CheckBox f35304;

    /* JADX INFO: renamed from: ۙ */
    public final CheckBox f35305;

    /* JADX INFO: renamed from: ۛ */
    public final C7179 f35306;

    /* JADX INFO: renamed from: ۤ */
    public final CheckBox f35307;

    /* JADX INFO: renamed from: ۨ */
    public final C7179 f35308;

    /* JADX INFO: renamed from: ۫ */
    public final String f35309;

    /* JADX INFO: renamed from: ۬ */
    public final CheckBox f35310;

    /* JADX INFO: renamed from: ܰ */
    public final C18107 f35311;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC17043 f35312;

    /* JADX INFO: renamed from: ᩸ */
    public final DialogInterfaceC2564 f35313;

    /* JADX INFO: renamed from: ᩹ */
    public final CheckBox f35314;

    /* JADX INFO: renamed from: ᩺ */
    public final Spinner f35315;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m28955() {
        CheckBox checkBox = null;
        boolean z = false;
        int i = -1243848265;
        int i2 = C1046.f81962;
        int i3 = C0906.f81862;
        int iM55680 = (i3 - C0873.m55680("ۤ᩹")) * 65;
        int i4 = ((iM55680 ^ i2) * 13327) ^ 282591320;
        int i5 = 384798514;
        while (true) {
            i = ((((i ^ i2) * (-24527)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2120131387:
                case 915521488:
                    this.f35306.m16519(z);
                    break;
                case -1979466584:
                case 638259502:
                    if (C1229.m56410() == 0) {
                        iM55680 = C0946.m55979("ܶۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 23405) ^ 1198979198;
                        i5 = 835658563;
                    } else {
                        iM55680 = C0873.m55680("۬᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29031)) ^ 2068401755;
                        i5 = 1700021711;
                    }
                    break;
                case -1903218419:
                case 1871245307:
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0873.m55680("ܽ᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-26755)) ^ (-541801357);
                        i5 = 1345569303;
                    } else {
                        iM55680 = (C0946.m55979("֡ۜ") ^ i3) * (-113);
                        i4 = ((iM55680 ^ i2) * (-10177)) ^ 1227178705;
                        i5 = -1206083667;
                    }
                    break;
                case -1736544298:
                case -570175398:
                    if (C0894.f81854 < 0) {
                        iM55680 = (i2 - C0873.m55680("ܽۡ")) * (-103);
                        i4 = ((iM55680 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        iM55680 = C0946.m55979("ܶۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 23405) ^ 1198979198;
                        i5 = 835658563;
                    }
                    break;
                case -1533548033:
                case -286535113:
                    if (C1071.m56343() != 0) {
                        iM55680 = (i2 - C0873.m55680("ܽۡ")) * (-103);
                        i4 = ((iM55680 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        iM55680 = C0946.m55979("ۡۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-12075)) ^ 44194152;
                        i5 = 358055761;
                    }
                    break;
                case -1155740774:
                case -456739929:
                    if (C0877.m55695(checkBox)) {
                        iM55680 = (i2 - C0946.m55979("᩵֫")) * 71;
                        i4 = ((iM55680 ^ i3) * (-30953)) ^ (-1294855339);
                        i5 = 1404116027;
                    } else {
                        iM55680 = C0946.m55979("ۖۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 11437) ^ 93309512;
                        i5 = 1099299931;
                    }
                    break;
                case -1034369443:
                case 1119208908:
                    if (checkBox.getVisibility() == 0) {
                        iM55680 = C0873.m55680("ᩳۖ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-28601)) ^ (-867686633);
                        i5 = -1547532080;
                    } else {
                        iM55680 = C0946.m55979("ۖۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 11437) ^ 93309512;
                        i5 = 1099299931;
                    }
                    break;
                case -899939602:
                case 1092810147:
                    RunnableC0938.m55938();
                    C0955.m56025();
                    break;
                case -184014668:
                case 1649512522:
                    z = true;
                    iM55680 = (C0873.m55680("ۙۢ") + i3) * (-81);
                    i4 = ((iM55680 ^ i2) * 24513) ^ 1984707405;
                    i5 = -1398617777;
                    break;
                case -12874009:
                case 1379185647:
                    if (C1044.m56286() <= 0) {
                        iM55680 = (C0873.m55680("᩻ۧ") ^ i3) * (-45);
                        i4 = ((iM55680 ^ i2) * (-32249)) ^ (-933352766);
                        i5 = -1568251469;
                    } else {
                        iM55680 = C0873.m55680("۬᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29031)) ^ 2068401755;
                        i5 = 1700021711;
                    }
                    break;
                case 90891325:
                case 1162375781:
                    if (AbstractC0942.m55971()) {
                        iM55680 = C0873.m55680("ܽ᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-26755)) ^ (-541801357);
                        i5 = 1345569303;
                    } else {
                        iM55680 = C0873.m55680("֨ᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-14175)) ^ (-149696102);
                        i5 = 336901242;
                    }
                    break;
                case 210334028:
                case 674314130:
                    if (C0967.m56074()) {
                        iM55680 = C0873.m55680("۬᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29031)) ^ 2068401755;
                        i5 = 1700021711;
                    } else {
                        iM55680 = C0873.m55680("ܶ᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-10207)) ^ (-1984969383);
                        i5 = -1056810536;
                    }
                    break;
                case 212588668:
                case 390904893:
                    z = false;
                    iM55680 = (C0873.m55680("ۙۢ") + i3) * (-81);
                    i4 = ((iM55680 ^ i2) * 24513) ^ 1984707405;
                    i5 = -1398617777;
                    break;
                case 246639953:
                case 676680694:
                    if (C0898.m55800() <= 0) {
                        iM55680 = (C0873.m55680("᩻ۧ") ^ i3) * (-45);
                        i4 = ((iM55680 ^ i2) * (-32249)) ^ (-933352766);
                        i5 = -1568251469;
                    } else {
                        iM55680 = (i2 - C0873.m55680("۟᩺")) * 37;
                        i4 = ((iM55680 ^ i3) * 26549) ^ (-63911957);
                        i5 = 798446755;
                    }
                    break;
                case 265529574:
                case 1846154737:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (i2 - C0873.m55680("ܽۡ")) * (-103);
                        i4 = ((iM55680 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        iM55680 = (C0873.m55680("ۛܳ") + i2) * (-61);
                        i4 = ((iM55680 ^ i3) * 1367) ^ 1693134828;
                        i5 = 1044980902;
                    }
                    break;
                case 449947286:
                case 1728470920:
                    RunnableC0938.m55938();
                    iM55680 = C0873.m55680("۬᩶") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-29031)) ^ 2068401755;
                    i5 = 1700021711;
                    break;
                case 813481254:
                case 1134442989:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (i2 - C0873.m55680("ܽۡ")) * (-103);
                        i4 = ((iM55680 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        iM55680 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-27399)) ^ 1074613730;
                        i5 = 1897273518;
                    }
                    break;
                case 828099875:
                case 2105735781:
                    this.f35308.m16516(z);
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0873.m55680("ܽ᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-26755)) ^ (-541801357);
                        i5 = 1345569303;
                    } else {
                        iM55680 = C0946.m55979("۫ܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9201)) ^ (-348020387);
                        i5 = -1717971889;
                    }
                    break;
                case 1368715555:
                case 1712768164:
                    checkBox = this.f35307;
                    if (C1044.m56286() <= 0) {
                        iM55680 = (i2 - C0873.m55680("ܽۡ")) * (-103);
                        i4 = ((iM55680 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        iM55680 = C0946.m55979("ۚᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28519)) ^ 1495382977;
                        i5 = -1581566560;
                    }
                    break;
                default:
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("ܽ᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-26755)) ^ (-541801357);
                        i5 = 1345569303;
                    } else {
                        iM55680 = C0946.m55979("᩺۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 10857) ^ 1825603343;
                        i5 = 1514393678;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x019e, code lost:
    
        if (p067l.C1053.f81965 > 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewOnClickListenerC12568(AbstractC17043 abstractC17043, C18107 c18107, String str) {
        DialogInterface.OnClickListener onClickListener;
        View view;
        int i;
        short[] sArr;
        int i2;
        CheckBox checkBox;
        short[] sArr2;
        int i3;
        int i4;
        C20671 c20671;
        Spinner spinner;
        short[] sArr3;
        int i5;
        int i6;
        int i7;
        CheckBox checkBox2;
        short[] sArr4;
        int i8;
        int i9;
        DialogInterface.OnClickListener onClickListener2;
        Spinner spinner2;
        short[] sArr5;
        Main main;
        View viewM56111;
        int iM55680;
        int i10;
        int i11;
        int i12;
        int iM55681;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        DialogInterface.OnClickListener onClickListener3;
        short[] sArr6;
        int iM55979;
        int i18;
        int i19;
        InterfaceC14100 interfaceC14100;
        int iM55682;
        int i20;
        int i21;
        short[] sArr7;
        int i22 = 530395802;
        int i23 = AbstractC0942.f81890;
        int i24 = C1404.f82149;
        short s = f82137[0];
        int i25 = ((s * s) + 350363524) - (37436 * s) >= 0 ? 30598 : 25634;
        int iM559710 = (C0946.m55979("ܳ۫") ^ i24) * 87;
        int i26 = ((iM559710 ^ i23) * 9095) ^ 1432370804;
        int i27 = iM559710 ^ 391264013;
        TextView textView = null;
        CheckBox checkBox3 = null;
        InterfaceC14100 interfaceC14101 = null;
        AdapterView adapterView = null;
        InterfaceC14100 interfaceC14102 = null;
        InterfaceC14100 interfaceC14103 = null;
        InterfaceC14100 interfaceC14104 = null;
        DialogInterface.OnClickListener onClickListener4 = null;
        String strM55707 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        int i28 = 0;
        int iM55683 = 0;
        int iM559711 = 0;
        int i29 = 0;
        boolean z = false;
        int iM559712 = 0;
        int iM559713 = 0;
        boolean z2 = false;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        View view2 = null;
        CheckBox checkBox4 = null;
        String strM55689 = null;
        View view3 = null;
        String strM55726 = null;
        int i34 = 0;
        Main mainM56594 = null;
        C7179 c7179 = null;
        CheckBox checkBox5 = null;
        long j = 0;
        String str2 = null;
        int i35 = 0;
        int selectedItemPosition = 0;
        CheckBox checkBox6 = null;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = null;
        Spinner spinner3 = null;
        C20671 c20671M55888 = null;
        CheckBox checkBox7 = null;
        while (true) {
            i22 = i27 ^ (i26 & (((i22 ^ i23) * 30343) >> 31));
            switch (i22) {
                case -2072574653:
                case 562942292:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    view = view2;
                    i = i34;
                    i28 = i28;
                    strM55689 = strM55689;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    InterfaceC14100 interfaceC14105 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox5 = checkBox5;
                    interfaceC14101 = interfaceC14101;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM55683 = iM55683;
                    i29 = i29;
                    c20671 = c20671M55888;
                    spinner = spinner3;
                    interfaceC14102 = interfaceC14105;
                    CheckBox checkBox8 = (CheckBox) C0892.m55755(view, C0946.m55979(C0967.m56077(f82137, 28, 3, i25)) ^ 2100710456);
                    this.f35304 = checkBox8;
                    sArr11 = f82137;
                    if (C0863.f81833 > 0) {
                        int iM55684 = (i24 - C0873.m55680("֡۟")) * 127;
                        i27 = iM55684 ^ 1952598511;
                        checkBox4 = checkBox8;
                        i26 = ((iM55684 ^ i23) * 11883) ^ (-1113048550);
                        spinner3 = spinner;
                        c20671M55888 = c20671;
                        onClickListener4 = onClickListener;
                        i34 = i;
                        checkBox7 = checkBox;
                        i29 = i29;
                        view2 = view;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        iM55683 = iM55683;
                        checkBox3 = checkBox3;
                        sArr12 = sArr12;
                        onCheckedChangeListener = onCheckedChangeListener;
                        z2 = z2;
                        z = z;
                        interfaceC14101 = interfaceC14101;
                        checkBox5 = checkBox5;
                        interfaceC14103 = interfaceC14103;
                        interfaceC14102 = interfaceC14102;
                        strM55689 = strM55689;
                        i28 = i28;
                        interfaceC14104 = interfaceC14104;
                    } else {
                        checkBox4 = checkBox8;
                        i12 = i35;
                        sArr2 = sArr9;
                        i3 = i32;
                        sArr3 = sArr10;
                        i4 = i33;
                        iM55681 = C0946.m55979("ᩳᩴ") ^ i24;
                        i13 = ((iM55681 ^ i23) * 9305) ^ 1341754778;
                        i14 = -404406432;
                        i27 = iM55681 ^ i14;
                        i26 = i13;
                        sArr9 = sArr2;
                        sArr10 = sArr3;
                        i33 = i4;
                        onClickListener4 = onClickListener;
                        i34 = i;
                        i32 = i3;
                        i35 = i12;
                        checkBox7 = checkBox;
                        spinner3 = spinner;
                        view2 = view;
                        c20671M55888 = c20671;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        iM55683 = iM55683;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr12;
                        z2 = z2;
                        z = z;
                        interfaceC14101 = interfaceC14101;
                        checkBox5 = checkBox5;
                        interfaceC14103 = interfaceC14103;
                        interfaceC14102 = interfaceC14102;
                        strM55689 = strM55689;
                        i28 = i28;
                        interfaceC14104 = interfaceC14104;
                    }
                    break;
                case -2016967264:
                case -943464733:
                    C1964.m56597();
                    if (C0877.f81843 < 0) {
                        onCheckedChangeListener = onCheckedChangeListener;
                        i15 = i35;
                        checkBox = checkBox7;
                        checkBox3 = checkBox3;
                        interfaceC14104 = interfaceC14104;
                        view = view2;
                        i16 = i33;
                        i17 = i34;
                        i28 = i28;
                        strM55689 = strM55689;
                        interfaceC14102 = interfaceC14102;
                        interfaceC14103 = interfaceC14103;
                        checkBox6 = checkBox6;
                        i30 = i30;
                        onClickListener3 = onClickListener4;
                        checkBox5 = checkBox5;
                        interfaceC14101 = interfaceC14101;
                        z = z;
                        z2 = z2;
                        sArr12 = sArr12;
                        iM55683 = iM55683;
                        i29 = i29;
                        c20671 = c20671M55888;
                        spinner = spinner3;
                        sArr6 = sArr10;
                        iM55979 = C0873.m55680("ۡܺ") ^ i23;
                        i18 = ((iM55979 ^ i24) * (-22949)) ^ (-1103109619);
                        i19 = 799618161;
                        i27 = iM55979 ^ i19;
                        i35 = i15;
                        i26 = i18;
                        sArr10 = sArr6;
                        i33 = i16;
                        onClickListener4 = onClickListener3;
                        i34 = i17;
                        checkBox7 = checkBox;
                        spinner3 = spinner;
                        view2 = view;
                        c20671M55888 = c20671;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        iM55683 = iM55683;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr12;
                        z2 = z2;
                        z = z;
                        interfaceC14101 = interfaceC14101;
                        checkBox5 = checkBox5;
                        interfaceC14103 = interfaceC14103;
                        interfaceC14102 = interfaceC14102;
                        strM55689 = strM55689;
                        i28 = i28;
                        interfaceC14104 = interfaceC14104;
                    }
                    onCheckedChangeListener = onCheckedChangeListener;
                    i7 = i35;
                    checkBox2 = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    viewM56111 = view2;
                    sArr4 = sArr9;
                    i8 = i32;
                    i9 = i33;
                    i6 = i34;
                    i28 = i28;
                    main = mainM56594;
                    strM55689 = strM55689;
                    interfaceC14102 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener2 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC14101 = interfaceC14101;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM55683 = iM55683;
                    i29 = i29;
                    c20671 = c20671M55888;
                    spinner2 = spinner3;
                    sArr5 = sArr10;
                    iM55680 = C0873.m55680("ᩳ۫") ^ i24;
                    i10 = ((iM55680 ^ i23) * 6585) ^ (-298946454);
                    i11 = -1443599469;
                    i27 = iM55680 ^ i11;
                    mainM56594 = main;
                    sArr9 = sArr4;
                    sArr10 = sArr5;
                    i33 = i9;
                    onClickListener4 = onClickListener2;
                    i34 = i6;
                    i32 = i8;
                    i35 = i7;
                    checkBox7 = checkBox2;
                    view2 = viewM56111;
                    spinner3 = spinner2;
                    i26 = i10;
                    c20671M55888 = c20671;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM55683 = iM55683;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC14101 = interfaceC14101;
                    checkBox5 = checkBox5;
                    interfaceC14103 = interfaceC14103;
                    interfaceC14102 = interfaceC14102;
                    strM55689 = strM55689;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    break;
                case -1921214339:
                case -298354697:
                    onCheckedChangeListener = onCheckedChangeListener;
                    i12 = i35;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    view = view2;
                    sArr2 = sArr9;
                    i3 = i32;
                    i4 = i33;
                    i = i34;
                    i28 = i28;
                    strM55689 = strM55689;
                    interfaceC14102 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC14101 = interfaceC14101;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM55683 = iM55683;
                    i29 = i29;
                    c20671 = c20671M55888;
                    spinner = spinner3;
                    sArr3 = sArr10;
                    iM559712 = C0946.m55979(C0892.m55750(f82137, 7, 3, i25));
                    if (C0906.m55809() <= 0) {
                        iM55681 = C0946.m55979("ᩳᩴ") ^ i24;
                        i13 = ((iM55681 ^ i23) * 9305) ^ 1341754778;
                        i14 = -404406432;
                    } else {
                        iM55681 = C0873.m55680("ᩳ᩵") ^ i23;
                        i13 = ((iM55681 ^ i24) * 295) ^ (-1972339715);
                        i14 = -1260520311;
                    }
                    i27 = iM55681 ^ i14;
                    i26 = i13;
                    sArr9 = sArr2;
                    sArr10 = sArr3;
                    i33 = i4;
                    onClickListener4 = onClickListener;
                    i34 = i;
                    i32 = i3;
                    i35 = i12;
                    checkBox7 = checkBox;
                    spinner3 = spinner;
                    view2 = view;
                    c20671M55888 = c20671;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM55683 = iM55683;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC14101 = interfaceC14101;
                    checkBox5 = checkBox5;
                    interfaceC14103 = interfaceC14103;
                    interfaceC14102 = interfaceC14102;
                    strM55689 = strM55689;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    break;
                case -1872256887:
                case 869029437:
                    if (!AbstractC0942.m55971()) {
                        onCheckedChangeListener = onCheckedChangeListener;
                        i2 = i35;
                        checkBox = checkBox7;
                        checkBox3 = checkBox3;
                        interfaceC14104 = interfaceC14104;
                        view = view2;
                        sArr2 = sArr9;
                        i3 = i32;
                        i4 = i33;
                        i = i34;
                        i28 = i28;
                        strM55689 = strM55689;
                        interfaceC14102 = interfaceC14102;
                        interfaceC14103 = interfaceC14103;
                        checkBox6 = checkBox6;
                        sArr = sArr12;
                        i30 = i30;
                        onClickListener = onClickListener4;
                        checkBox5 = checkBox5;
                        iM55683 = iM55683;
                        i29 = i29;
                        interfaceC14101 = interfaceC14101;
                        z = z;
                        c20671 = c20671M55888;
                        spinner = spinner3;
                        sArr3 = sArr10;
                        int iM559714 = (i24 - C0946.m55979("᩺ܽ")) * (-113);
                        int i36 = i2;
                        i26 = ((iM559714 ^ i23) * (-30387)) ^ (-337495545);
                        i27 = iM559714 ^ (-1659767500);
                        sArr9 = sArr2;
                        z = z;
                        sArr10 = sArr3;
                        i33 = i4;
                        onClickListener4 = onClickListener;
                        i32 = i3;
                        i35 = i36;
                        checkBox7 = checkBox;
                        interfaceC14101 = interfaceC14101;
                        spinner3 = spinner;
                        c20671M55888 = c20671;
                        checkBox5 = checkBox5;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        interfaceC14103 = interfaceC14103;
                        iM55683 = iM55683;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr;
                        interfaceC14102 = interfaceC14102;
                        i34 = i;
                        strM55689 = strM55689;
                        view2 = view;
                        i28 = i28;
                        interfaceC14104 = interfaceC14104;
                    } else {
                        iM55682 = (C0873.m55680("ᩳܽ") + i23) * (-121);
                        i20 = ((iM55682 ^ i24) * (-809)) ^ (-142770212);
                        i21 = 1505044398;
                        i27 = iM55682 ^ i21;
                        i26 = i20;
                    }
                    break;
                case -1841712472:
                case 1584272277:
                    break;
                case -1713717883:
                case -270763297:
                    View view4 = view2;
                    int i37 = i34;
                    CheckBox checkBox9 = checkBox6;
                    int i38 = i30;
                    DialogInterface.OnClickListener onClickListener5 = onClickListener4;
                    sArr7 = sArr12;
                    boolean z3 = z;
                    InterfaceC14100 interfaceC14106 = interfaceC14103;
                    C0877.m55693(checkBox5, C1053.m56326(interfaceC14106, C1194.m56386(f82137, 72, 17, i25), z3));
                    int iM559715 = C0946.m55979("ۚ᩺") ^ i24;
                    i27 = iM559715 ^ 1171792256;
                    i26 = ((iM559715 ^ i23) * (-12677)) ^ 266121379;
                    interfaceC14103 = interfaceC14106;
                    onClickListener4 = onClickListener5;
                    z = z3;
                    i30 = i38;
                    checkBox6 = checkBox9;
                    i34 = i37;
                    checkBox3 = checkBox3;
                    view2 = view4;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    short[] sArr14 = sArr7;
                    z2 = z2;
                    iM55683 = iM55683;
                    sArr12 = sArr14;
                    break;
                case -1708107364:
                case 887960781:
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = onCheckedChangeListener;
                    CheckBox checkBox10 = checkBox6;
                    interfaceC14104 = interfaceC14104;
                    int i39 = i30;
                    View view5 = view2;
                    int i40 = i34;
                    DialogInterface.OnClickListener onClickListener6 = onClickListener4;
                    i28 = i28;
                    strM55689 = strM55689;
                    InterfaceC14100 interfaceC14107 = interfaceC14102;
                    InterfaceC14100 interfaceC14108 = interfaceC14103;
                    CheckBox checkBox11 = checkBox5;
                    InterfaceC14100 interfaceC14109 = interfaceC14101;
                    boolean z4 = z;
                    boolean z5 = z2;
                    short[] sArr15 = sArr12;
                    short[] sArr16 = sArr11;
                    CheckBox checkBox12 = (CheckBox) C1404.m56465(view5, C0873.m55680(ViewOnClickListenerC0939.m55947(sArr16, 31, 3, i25)) ^ 2123257550);
                    int iM55685 = (C0873.m55680("ܿܰ") + i23) * 87;
                    i26 = ((iM55685 ^ i24) * (-17873)) ^ (-1837694428);
                    i27 = iM55685 ^ 547623277;
                    spinner3 = spinner3;
                    sArr11 = sArr16;
                    c20671M55888 = c20671M55888;
                    i34 = i40;
                    onCheckedChangeListener = onCheckedChangeListener2;
                    checkBox7 = checkBox7;
                    i29 = i29;
                    view2 = view5;
                    iM55683 = iM55683;
                    sArr12 = sArr15;
                    z2 = z5;
                    z = z4;
                    interfaceC14101 = interfaceC14109;
                    checkBox5 = checkBox11;
                    interfaceC14103 = interfaceC14108;
                    interfaceC14102 = interfaceC14107;
                    onClickListener4 = onClickListener6;
                    i30 = i39;
                    checkBox6 = checkBox10;
                    checkBox3 = checkBox12;
                    strM55689 = strM55689;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    break;
                case -1670489490:
                case 1994017200:
                    DialogInterfaceC2564 dialogInterfaceC2564M18268 = C7913.m18268(c20671M55888, iM55683, onClickListener4, C0873.m55680(C1024.m56203(sArr13, i34, i28, i25)) ^ 2119185350, onClickListener4);
                    this.f35313 = dialogInterfaceC2564M18268;
                    C11896.m27216(c18107, dialogInterfaceC2564M18268, str);
                    C0947.m55996(C1929.m56567(dialogInterfaceC2564M18268), this);
                    C0927.m55877(c7179);
                    C7050.m16226(c7179.m16514());
                    return;
                case -1561050374:
                case -1451091664:
                    C1024.m56214(checkBox5, onCheckedChangeListener);
                    m28955();
                    c20671M55888 = C0930.m55888(C1929.m56560(c18107));
                    view = view2;
                    C0882.m55725(c20671M55888, view);
                    i = i34;
                    iM559711 = C0946.m55979(C0955.m56029(f82137, 148, 3, i25)) ^ 2101061860;
                    if (C0882.f81846) {
                        onCheckedChangeListener = onCheckedChangeListener;
                        i12 = i35;
                        checkBox = checkBox7;
                        checkBox3 = checkBox3;
                        interfaceC14104 = interfaceC14104;
                        sArr2 = sArr9;
                        i3 = i32;
                        i4 = i33;
                        i28 = i28;
                        strM55689 = strM55689;
                        interfaceC14102 = interfaceC14102;
                        interfaceC14103 = interfaceC14103;
                        checkBox6 = checkBox6;
                        i30 = i30;
                        onClickListener = onClickListener4;
                        checkBox5 = checkBox5;
                        interfaceC14101 = interfaceC14101;
                        z = z;
                        z2 = z2;
                        sArr12 = sArr12;
                        iM55683 = iM55683;
                        i29 = i29;
                        c20671 = c20671M55888;
                        spinner = spinner3;
                        sArr3 = sArr10;
                        iM55681 = C0946.m55979("ᩳᩴ") ^ i24;
                        i13 = ((iM55681 ^ i23) * 9305) ^ 1341754778;
                        i14 = -404406432;
                        i27 = iM55681 ^ i14;
                        i26 = i13;
                        sArr9 = sArr2;
                        sArr10 = sArr3;
                        i33 = i4;
                        onClickListener4 = onClickListener;
                        i34 = i;
                        i32 = i3;
                        i35 = i12;
                        checkBox7 = checkBox;
                        spinner3 = spinner;
                        view2 = view;
                        c20671M55888 = c20671;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        iM55683 = iM55683;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr12;
                        z2 = z2;
                        z = z;
                        interfaceC14101 = interfaceC14101;
                        checkBox5 = checkBox5;
                        interfaceC14103 = interfaceC14103;
                        interfaceC14102 = interfaceC14102;
                        strM55689 = strM55689;
                        i28 = i28;
                        interfaceC14104 = interfaceC14104;
                    } else {
                        int iM55686 = (C0873.m55680("ܺۖ") + i23) * 9;
                        i27 = iM55686 ^ 1117512207;
                        i26 = ((iM55686 ^ i24) * (-23801)) ^ (-217713994);
                        i34 = i;
                        view2 = view;
                    }
                    break;
                case -1544932729:
                case 1379113969:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    view = view2;
                    i17 = i34;
                    i28 = i28;
                    strM55689 = strM55689;
                    interfaceC14102 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener3 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC14101 = interfaceC14101;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM55683 = iM55683;
                    i29 = i29;
                    c20671 = c20671M55888;
                    spinner = spinner3;
                    this.f35315 = spinner;
                    sArr6 = sArr10;
                    i16 = i33;
                    iM559713 = C0946.m55979(C1964.m56584(f82137, 19, 3, i25));
                    int iM559716 = C0946.m55979("ܿ᩺") ^ i24;
                    i27 = iM559716 ^ (-720941565);
                    i26 = ((iM559716 ^ i23) * 15487) ^ (-82252876);
                    sArr10 = sArr6;
                    i33 = i16;
                    onClickListener4 = onClickListener3;
                    i34 = i17;
                    checkBox7 = checkBox;
                    spinner3 = spinner;
                    view2 = view;
                    c20671M55888 = c20671;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM55683 = iM55683;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC14101 = interfaceC14101;
                    checkBox5 = checkBox5;
                    interfaceC14103 = interfaceC14103;
                    interfaceC14102 = interfaceC14102;
                    strM55689 = strM55689;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    break;
                case -1502038682:
                case 1393279701:
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener3 = onCheckedChangeListener;
                    InterfaceC14100 interfaceC141010 = interfaceC14101;
                    boolean z6 = z;
                    InterfaceC14100 interfaceC141011 = interfaceC14104;
                    boolean z7 = z2;
                    short[] sArr17 = sArr12;
                    View view6 = view2;
                    int i41 = iM55683;
                    int i42 = i29;
                    CheckBox checkBox13 = (CheckBox) C1404.m56465(view6, i42);
                    this.f35307 = checkBox13;
                    strM55707 = C0877.m55707(f82137, 25, 3, i25);
                    int iM55687 = C0873.m55680("ܺۨ") ^ i24;
                    i27 = iM55687 ^ 1704360482;
                    i26 = ((iM55687 ^ i23) * (-9053)) ^ (-763512395);
                    interfaceC14103 = interfaceC14103;
                    onClickListener4 = onClickListener4;
                    i34 = i34;
                    checkBox7 = checkBox7;
                    view2 = view6;
                    interfaceC14102 = interfaceC14102;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    strM55689 = strM55689;
                    checkBox3 = checkBox3;
                    i28 = i28;
                    interfaceC14104 = interfaceC141011;
                    onCheckedChangeListener = onCheckedChangeListener3;
                    interfaceC14101 = interfaceC141010;
                    checkBox5 = checkBox13;
                    spinner3 = spinner3;
                    c20671M55888 = c20671M55888;
                    i29 = i42;
                    iM55683 = i41;
                    sArr12 = sArr17;
                    z2 = z7;
                    z = z6;
                    break;
                case -1494502814:
                case -200915486:
                    onCheckedChangeListener = onCheckedChangeListener;
                    i15 = i35;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    view = view2;
                    i16 = i33;
                    i17 = i34;
                    i28 = i28;
                    strM55689 = strM55689;
                    interfaceC14102 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener3 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC14101 = interfaceC14101;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM55683 = iM55683;
                    i29 = i29;
                    c20671 = c20671M55888;
                    spinner = spinner3;
                    sArr6 = sArr10;
                    this.f35306 = (C7179) C1404.m56465(view, i15);
                    sArr9 = f82137;
                    i32 = 16;
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("ۡܺ") ^ i23;
                        i18 = ((iM55979 ^ i24) * (-22949)) ^ (-1103109619);
                        i19 = 799618161;
                    } else {
                        iM55979 = (i23 - C0946.m55979("֨ۧ")) * 17;
                        i18 = ((iM55979 ^ i24) * 21957) ^ 521813844;
                        i19 = 518133175;
                    }
                    i27 = iM55979 ^ i19;
                    i35 = i15;
                    i26 = i18;
                    sArr10 = sArr6;
                    i33 = i16;
                    onClickListener4 = onClickListener3;
                    i34 = i17;
                    checkBox7 = checkBox;
                    spinner3 = spinner;
                    view2 = view;
                    c20671M55888 = c20671;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM55683 = iM55683;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC14101 = interfaceC14101;
                    checkBox5 = checkBox5;
                    interfaceC14103 = interfaceC14103;
                    interfaceC14102 = interfaceC14102;
                    strM55689 = strM55689;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    break;
                case -1347173867:
                case 864940250:
                    View view7 = view2;
                    int i43 = i34;
                    boolean z8 = z;
                    CheckBox checkBox14 = checkBox3;
                    CheckBox checkBox15 = checkBox6;
                    int i44 = i30;
                    DialogInterface.OnClickListener onClickListener7 = onClickListener4;
                    sArr7 = sArr12;
                    CheckBox checkBox16 = checkBox5;
                    InterfaceC14100 interfaceC141012 = interfaceC14102;
                    CheckBox checkBox17 = checkBox7;
                    C0949.m56017(checkBox17, C0890.m55727(interfaceC141012, C1229.m56403(f82137, 50, 22, i25), z8));
                    InterfaceC14100 interfaceC141013 = ApplicationC21448.f67649;
                    int iM55688 = C0873.m55680("᩺᩻") ^ i23;
                    i26 = ((iM55688 ^ i24) * 5611) ^ (-686093456);
                    i27 = iM55688 ^ (-814514873);
                    z = z8;
                    checkBox7 = checkBox17;
                    checkBox5 = checkBox16;
                    i34 = i43;
                    view2 = view7;
                    interfaceC14103 = interfaceC141013;
                    interfaceC14102 = interfaceC141012;
                    onClickListener4 = onClickListener7;
                    i30 = i44;
                    checkBox6 = checkBox15;
                    checkBox3 = checkBox14;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    short[] sArr18 = sArr7;
                    z2 = z2;
                    iM55683 = iM55683;
                    sArr12 = sArr18;
                    break;
                case -1313031184:
                case 1869577174:
                    InterfaceC14100 interfaceC141014 = interfaceC14104;
                    int i45 = i30;
                    View view8 = view2;
                    int i46 = i34;
                    DialogInterface.OnClickListener onClickListener8 = onClickListener4;
                    int i47 = i28;
                    String str3 = strM55689;
                    InterfaceC14100 interfaceC141015 = interfaceC14102;
                    InterfaceC14100 interfaceC141016 = interfaceC14103;
                    CheckBox checkBox18 = checkBox5;
                    InterfaceC14100 interfaceC141017 = interfaceC14101;
                    boolean z9 = z;
                    boolean z10 = z2;
                    short[] sArr19 = sArr12;
                    CheckBox checkBox19 = (CheckBox) C0892.m55755(view8, C0946.m55979(strM55707) ^ 2101679847);
                    this.f35305 = checkBox19;
                    int iM559717 = (C0946.m55979("ܺۛ") + i23) * (-123);
                    int i48 = ((iM559717 ^ i24) * (-15271)) ^ 303782815;
                    i27 = iM559717 ^ (-538371913);
                    spinner3 = spinner3;
                    checkBox3 = checkBox3;
                    c20671M55888 = c20671M55888;
                    i34 = i46;
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox7 = checkBox7;
                    i29 = i29;
                    view2 = view8;
                    iM55683 = iM55683;
                    sArr12 = sArr19;
                    z2 = z10;
                    z = z9;
                    interfaceC14101 = interfaceC141017;
                    checkBox5 = checkBox18;
                    interfaceC14103 = interfaceC141016;
                    interfaceC14102 = interfaceC141015;
                    strM55689 = str3;
                    i28 = i47;
                    interfaceC14104 = interfaceC141014;
                    checkBox6 = checkBox19;
                    i26 = i48;
                    onClickListener4 = onClickListener8;
                    i30 = i45;
                    break;
                case -1225486757:
                case 151926603:
                    c20671 = c20671M55888;
                    onCheckedChangeListener = onCheckedChangeListener;
                    spinner = spinner3;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    view = view2;
                    i = i34;
                    i28 = i28;
                    strM55689 = strM55689;
                    interfaceC14102 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC14101 = interfaceC14101;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM55683 = iM55683;
                    short[] sArr20 = sArr10;
                    int i49 = i33;
                    int iM55689 = C0873.m55680(C1048.m56318(sArr20, i49, 3, i25)) ^ 2104279284;
                    if (C1194.f82045 != 0) {
                        i29 = iM55689;
                        sArr3 = sArr20;
                        i4 = i49;
                        i12 = i35;
                        sArr2 = sArr9;
                        i3 = i32;
                        iM55681 = C0946.m55979("ᩳᩴ") ^ i24;
                        i13 = ((iM55681 ^ i23) * 9305) ^ 1341754778;
                        i14 = -404406432;
                        i27 = iM55681 ^ i14;
                        i26 = i13;
                        sArr9 = sArr2;
                        sArr10 = sArr3;
                        i33 = i4;
                        onClickListener4 = onClickListener;
                        i34 = i;
                        i32 = i3;
                        i35 = i12;
                        checkBox7 = checkBox;
                        spinner3 = spinner;
                        view2 = view;
                        c20671M55888 = c20671;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        iM55683 = iM55683;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr12;
                        z2 = z2;
                        z = z;
                        interfaceC14101 = interfaceC14101;
                        checkBox5 = checkBox5;
                        interfaceC14103 = interfaceC14103;
                        interfaceC14102 = interfaceC14102;
                        strM55689 = strM55689;
                        i28 = i28;
                        interfaceC14104 = interfaceC14104;
                    } else {
                        int iM559718 = (C0946.m55979("۫ܳ") ^ i23) * (-83);
                        i26 = ((iM559718 ^ i24) * 32667) ^ 1351914322;
                        i27 = iM559718 ^ (-1244881190);
                        sArr10 = sArr20;
                        i33 = i49;
                        iM55683 = iM55683;
                        onClickListener4 = onClickListener;
                        i34 = i;
                        checkBox7 = checkBox;
                        view2 = view;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        sArr12 = sArr12;
                        checkBox3 = checkBox3;
                        z2 = z2;
                        onCheckedChangeListener = onCheckedChangeListener;
                        z = z;
                        interfaceC14101 = interfaceC14101;
                        checkBox5 = checkBox5;
                        interfaceC14103 = interfaceC14103;
                        interfaceC14102 = interfaceC14102;
                        strM55689 = strM55689;
                        i28 = i28;
                        interfaceC14104 = interfaceC14104;
                        spinner3 = spinner;
                        c20671M55888 = c20671;
                        i29 = iM55689;
                    }
                    break;
                case -1181491854:
                case 2111665783:
                    C0947.m55997();
                    C1124.m56367();
                    throw new RuntimeException();
                case -854596905:
                case -257246880:
                    View view9 = view2;
                    int i50 = i34;
                    short[] sArr21 = sArr12;
                    int i51 = i30;
                    int i52 = iM55683;
                    boolean z11 = z2;
                    InterfaceC14100 interfaceC141018 = interfaceC14104;
                    int i53 = i28;
                    C0949.m56017(checkBox4, C1053.m56326(interfaceC141018, C0992.m56102(sArr21, i51, 19, i25), z11));
                    DialogInterface.OnClickListener onClickListener9 = onClickListener4;
                    CheckBox checkBox20 = checkBox3;
                    C0949.m56017(checkBox20, C1053.m56326(ApplicationC21448.f67649, C0927.m55863(f82137, 123, 25, i25), z11));
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener4 = new CompoundButton.OnCheckedChangeListener() { // from class: l.۫ۙܽ
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                            int i54 = 1722914154;
                            int i55 = ViewOnClickListenerC0939.f81888;
                            int i56 = RunnableC0871.f81839;
                            int iM559719 = (i55 - C0946.m55979("֫ܶ")) * (-43);
                            int i57 = ((iM559719 ^ i56) * 22943) ^ (-1414982207);
                            int i58 = -2133799701;
                            while (true) {
                                i54 = ((((i54 ^ i56) * 4953) >> 31) & i57) ^ (iM559719 ^ i58);
                                switch (i54) {
                                    case -1733391308:
                                    case 1186688081:
                                        C1024.m56209();
                                        iM559719 = (C0946.m55979("᩶۟") + i56) * 53;
                                        i57 = ((iM559719 ^ i55) * 21311) ^ (-123885208);
                                        i58 = -736114046;
                                        break;
                                    case -1694320313:
                                    case 1083311460:
                                        if (!C0861.f81831) {
                                            iM559719 = C0946.m55979("ۡ᩹") ^ i55;
                                            i57 = ((iM559719 ^ i56) * 29641) ^ 639249733;
                                            i58 = 311961566;
                                        } else {
                                            iM559719 = C0873.m55680("᩷᩹") ^ i55;
                                            i57 = ((iM559719 ^ i56) * 14387) ^ (-368787033);
                                            i58 = -327256819;
                                        }
                                        break;
                                    case -1625403322:
                                    case 244608119:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM559719 = (C0946.m55979("᩶۟") + i56) * 53;
                                            i57 = ((iM559719 ^ i55) * 21311) ^ (-123885208);
                                            i58 = -736114046;
                                        } else {
                                            iM559719 = C0873.m55680("۫۟") ^ i56;
                                            i57 = ((iM559719 ^ i55) * 8795) ^ (-390646358);
                                            i58 = 1083779225;
                                        }
                                        break;
                                    case -1545667182:
                                    case -190504183:
                                        if (!C0937.f81884) {
                                            iM559719 = C0946.m55979("ۡ᩹") ^ i55;
                                            i57 = ((iM559719 ^ i56) * 29641) ^ 639249733;
                                            i58 = 311961566;
                                        } else {
                                            iM559719 = (C0946.m55979("᩶۟") + i56) * 53;
                                            i57 = ((iM559719 ^ i55) * 21311) ^ (-123885208);
                                            i58 = -736114046;
                                        }
                                        break;
                                    case -1545339328:
                                    case -1203558655:
                                        if (C0906.f81862 >= 0) {
                                            iM559719 = C0873.m55680("᩷᩹") ^ i55;
                                            i57 = ((iM559719 ^ i56) * 14387) ^ (-368787033);
                                            i58 = -327256819;
                                        } else {
                                            iM559719 = C0873.m55680("ܺۗ") ^ i55;
                                            i57 = ((iM559719 ^ i56) * 25097) ^ (-1533465252);
                                            i58 = 1521954461;
                                        }
                                        break;
                                    case -1542944656:
                                    case -924429313:
                                        if (C0845.f81821 >= 0) {
                                            iM559719 = (C0946.m55979("᩶۟") + i56) * 53;
                                            i57 = ((iM559719 ^ i55) * 21311) ^ (-123885208);
                                            i58 = -736114046;
                                        } else {
                                            iM559719 = C0873.m55680("᩻ۘ") ^ i56;
                                            i57 = ((iM559719 ^ i55) * (-5507)) ^ (-1300619952);
                                            i58 = 565961491;
                                        }
                                        break;
                                    case -1459714469:
                                    case 1592977623:
                                        if (C0894.f81854 >= 0) {
                                            iM559719 = C0873.m55680("᩷᩹") ^ i55;
                                            i57 = ((iM559719 ^ i56) * 14387) ^ (-368787033);
                                            i58 = -327256819;
                                        } else {
                                            iM559719 = (C0946.m55979("ۙܶ") ^ i55) * (-39);
                                            i57 = ((iM559719 ^ i56) * 1757) ^ (-1127821892);
                                            i58 = -1233596938;
                                        }
                                        break;
                                    case -1201758248:
                                    case -1123178191:
                                        C0989.m56095();
                                        if (C0894.m55769() < 0) {
                                            iM559719 = C0946.m55979("ۡ᩹") ^ i55;
                                            i57 = ((iM559719 ^ i56) * 29641) ^ 639249733;
                                            i58 = 311961566;
                                        } else {
                                            iM559719 = (C0873.m55680("۠ܺ") + i56) * 77;
                                            i57 = ((iM559719 ^ i55) * 24559) ^ (-326020155);
                                            i58 = -1515516484;
                                        }
                                        break;
                                    case -977532745:
                                    case 494904369:
                                        this.f39341.m28955();
                                        break;
                                    case -647886238:
                                    case -603308724:
                                        if (C0955.f81898) {
                                            iM559719 = C0946.m55979("᩸᩺") ^ i55;
                                            i57 = ((iM559719 ^ i56) * 24401) ^ (-1251600743);
                                            i58 = 347270737;
                                        } else {
                                            iM559719 = (i55 - C0873.m55680("ۡᩴ")) * 115;
                                            i57 = ((iM559719 ^ i56) * 29485) ^ (-1325317023);
                                            i58 = 237707259;
                                        }
                                        break;
                                    case -582010013:
                                    case 902358074:
                                        RunnableC0938.m55938();
                                        break;
                                    case -369699672:
                                    case 698358174:
                                        if (C1071.f81975 <= 0) {
                                            iM559719 = C0873.m55680("᩷᩹") ^ i55;
                                            i57 = ((iM559719 ^ i56) * 14387) ^ (-368787033);
                                            i58 = -327256819;
                                        } else {
                                            iM559719 = (C0946.m55979("֡᩹") ^ i56) * (-13);
                                            i57 = ((iM559719 ^ i55) * 6321) ^ 1576738492;
                                            i58 = 1963161585;
                                        }
                                        break;
                                    case 359010866:
                                    case 1816346233:
                                        if (C1024.f81946) {
                                            iM559719 = C0946.m55979("ۡ᩹") ^ i55;
                                            i57 = ((iM559719 ^ i56) * 29641) ^ 639249733;
                                            i58 = 311961566;
                                        } else {
                                            iM559719 = (C0946.m55979("ܳۨ") ^ i56) * 25;
                                            i57 = ((iM559719 ^ i55) * (-31897)) ^ (-533837788);
                                            i58 = -1050423083;
                                        }
                                        break;
                                    case 849653210:
                                    case 1530742628:
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM559719 = C0946.m55979("ۡ᩹") ^ i55;
                                            i57 = ((iM559719 ^ i56) * 29641) ^ 639249733;
                                            i58 = 311961566;
                                        } else {
                                            iM559719 = (C0873.m55680("ܽ֡") + i55) * 65;
                                            i57 = ((iM559719 ^ i56) * (-7065)) ^ 1324390795;
                                            i58 = 853026958;
                                        }
                                        break;
                                    case 1608272690:
                                    case 1872703605:
                                        if (C1053.m56327() >= 0) {
                                            iM559719 = C0946.m55979("ۡ᩹") ^ i55;
                                            i57 = ((iM559719 ^ i56) * 29641) ^ 639249733;
                                            i58 = 311961566;
                                        } else {
                                            iM559719 = (C0873.m55680("֨ۘ") ^ i55) * 69;
                                            i57 = ((iM559719 ^ i56) * (-19139)) ^ (-655667625);
                                            i58 = -1206531631;
                                        }
                                        break;
                                    default:
                                        if (C0927.f81875) {
                                            iM559719 = C0946.m55979("᩸᩺") ^ i55;
                                            i57 = ((iM559719 ^ i56) * 24401) ^ (-1251600743);
                                            i58 = 347270737;
                                        } else {
                                            iM559719 = (C0873.m55680("᩹ܺ") ^ i56) * 13;
                                            i57 = ((iM559719 ^ i55) * 19157) ^ 32748707;
                                            i58 = -134091160;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    int iM556810 = (i24 - C0873.m55680("᩵᩵")) * C0254q.f1218h;
                    int i54 = ((iM556810 ^ i23) * 11949) ^ (-908866423);
                    i27 = iM556810 ^ 872646358;
                    checkBox3 = checkBox20;
                    i28 = i53;
                    i34 = i50;
                    interfaceC14104 = interfaceC141018;
                    view2 = view9;
                    onCheckedChangeListener = onCheckedChangeListener4;
                    i26 = i54;
                    onClickListener4 = onClickListener9;
                    i30 = i51;
                    z2 = z11;
                    iM55683 = i52;
                    sArr12 = sArr21;
                    break;
                case -817717889:
                case 2059686958:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    View view10 = view2;
                    int i55 = i34;
                    i28 = i28;
                    strM55689 = strM55689;
                    interfaceC14102 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    DialogInterface.OnClickListener onClickListener10 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC14101 = interfaceC14101;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM55683 = iM55683;
                    int iM559719 = C0946.m55979(C0955.m56029(f82137, 13, 3, i25)) ^ 2129491946;
                    int iM556811 = C0873.m55680("᩷֨") ^ i24;
                    int i56 = ((iM556811 ^ i23) * 22095) ^ 722288690;
                    i27 = iM556811 ^ 539973839;
                    sArr9 = sArr9;
                    sArr10 = sArr10;
                    i33 = i33;
                    i34 = i55;
                    i32 = i32;
                    checkBox7 = checkBox7;
                    i35 = iM559719;
                    i26 = i56;
                    spinner3 = spinner3;
                    view2 = view10;
                    c20671M55888 = c20671M55888;
                    onClickListener4 = onClickListener10;
                    i29 = i29;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    iM55683 = iM55683;
                    checkBox3 = checkBox3;
                    sArr12 = sArr12;
                    onCheckedChangeListener = onCheckedChangeListener;
                    z2 = z2;
                    z = z;
                    interfaceC14101 = interfaceC14101;
                    checkBox5 = checkBox5;
                    interfaceC14103 = interfaceC14103;
                    interfaceC14102 = interfaceC14102;
                    strM55689 = strM55689;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    break;
                case -589764079:
                case 1514629431:
                    onCheckedChangeListener = onCheckedChangeListener;
                    i2 = i35;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    view = view2;
                    sArr2 = sArr9;
                    i3 = i32;
                    i4 = i33;
                    i = i34;
                    i28 = i28;
                    strM55689 = strM55689;
                    interfaceC14102 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC14101 = interfaceC14101;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM55683 = iM55683;
                    i29 = i29;
                    c20671 = c20671M55888;
                    spinner = spinner3;
                    sArr3 = sArr10;
                    c7179 = (C7179) C0892.m55755(view, C0873.m55680(strM55726) ^ 2101518946);
                    this.f35308 = c7179;
                    if (!C0917.f81868) {
                        i12 = i2;
                        iM55681 = (C0946.m55979("֫֨") ^ i24) * 11;
                        i13 = ((iM55681 ^ i23) * (-17975)) ^ (-1473162823);
                        i14 = 1729109509;
                        i27 = iM55681 ^ i14;
                        i26 = i13;
                        sArr9 = sArr2;
                        sArr10 = sArr3;
                        i33 = i4;
                        onClickListener4 = onClickListener;
                        i34 = i;
                        i32 = i3;
                        i35 = i12;
                        checkBox7 = checkBox;
                        spinner3 = spinner;
                        view2 = view;
                        c20671M55888 = c20671;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        iM55683 = iM55683;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr12;
                        z2 = z2;
                        z = z;
                        interfaceC14101 = interfaceC14101;
                        checkBox5 = checkBox5;
                        interfaceC14103 = interfaceC14103;
                        interfaceC14102 = interfaceC14102;
                        strM55689 = strM55689;
                        i28 = i28;
                        interfaceC14104 = interfaceC14104;
                    } else {
                        sArr = sArr12;
                        z2 = z2;
                        int iM5597110 = (i24 - C0946.m55979("᩺ܽ")) * (-113);
                        int i310 = i2;
                        i26 = ((iM5597110 ^ i23) * (-30387)) ^ (-337495545);
                        i27 = iM5597110 ^ (-1659767500);
                        sArr9 = sArr2;
                        z = z;
                        sArr10 = sArr3;
                        i33 = i4;
                        onClickListener4 = onClickListener;
                        i32 = i3;
                        i35 = i310;
                        checkBox7 = checkBox;
                        interfaceC14101 = interfaceC14101;
                        spinner3 = spinner;
                        c20671M55888 = c20671;
                        checkBox5 = checkBox5;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        interfaceC14103 = interfaceC14103;
                        iM55683 = iM55683;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr;
                        interfaceC14102 = interfaceC14102;
                        i34 = i;
                        strM55689 = strM55689;
                        view2 = view;
                        i28 = i28;
                        interfaceC14104 = interfaceC14104;
                    }
                    break;
                case -542803917:
                case 106352895:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    view = view2;
                    int i57 = i34;
                    i28 = i28;
                    strM55689 = strM55689;
                    interfaceC14102 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    DialogInterface.OnClickListener onClickListener11 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC14101 = interfaceC14101;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM55683 = iM55683;
                    i29 = i29;
                    C20671 c20672 = c20671M55888;
                    short[] sArr22 = sArr9;
                    int i58 = i32;
                    Spinner spinner4 = (Spinner) C0892.m55755(view, C0873.m55680(C1003.m56132(sArr22, i58, 3, i25)) ^ 2118401314);
                    int iM559720 = (C0946.m55979("۟ܺ") ^ i23) * 61;
                    i26 = ((iM559720 ^ i24) * 14977) ^ (-1191590254);
                    i27 = iM559720 ^ (-190420695);
                    sArr9 = sArr22;
                    i32 = i58;
                    c20671M55888 = c20672;
                    sArr10 = sArr10;
                    i33 = i33;
                    onClickListener4 = onClickListener11;
                    i34 = i57;
                    spinner3 = spinner4;
                    checkBox7 = checkBox;
                    i29 = i29;
                    view2 = view;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    iM55683 = iM55683;
                    checkBox3 = checkBox3;
                    sArr12 = sArr12;
                    onCheckedChangeListener = onCheckedChangeListener;
                    z2 = z2;
                    z = z;
                    interfaceC14101 = interfaceC14101;
                    checkBox5 = checkBox5;
                    interfaceC14103 = interfaceC14103;
                    interfaceC14102 = interfaceC14102;
                    strM55689 = strM55689;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    break;
                case -495698584:
                case 234573374:
                    onCheckedChangeListener = onCheckedChangeListener;
                    i12 = i35;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    view = view2;
                    sArr2 = sArr9;
                    i3 = i32;
                    i4 = i33;
                    i = i34;
                    i28 = i28;
                    strM55689 = strM55689;
                    interfaceC14102 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC14101 = interfaceC14101;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM55683 = iM55683;
                    i29 = i29;
                    c20671 = c20671M55888;
                    spinner = spinner3;
                    sArr3 = sArr10;
                    C0946.m55976(textView, iM559712 ^ 2100806971);
                    strM55726 = C0890.m55726(f82137, 10, 3, i25);
                    iM55681 = C0873.m55680("֫ۙ") ^ i23;
                    i13 = ((iM55681 ^ i24) * 15857) ^ (-414082553);
                    i14 = 216879162;
                    i27 = iM55681 ^ i14;
                    i26 = i13;
                    sArr9 = sArr2;
                    sArr10 = sArr3;
                    i33 = i4;
                    onClickListener4 = onClickListener;
                    i34 = i;
                    i32 = i3;
                    i35 = i12;
                    checkBox7 = checkBox;
                    spinner3 = spinner;
                    view2 = view;
                    c20671M55888 = c20671;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM55683 = iM55683;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC14101 = interfaceC14101;
                    checkBox5 = checkBox5;
                    interfaceC14103 = interfaceC14103;
                    interfaceC14102 = interfaceC14102;
                    strM55689 = strM55689;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    break;
                case -287830925:
                case 1733219842:
                    InterfaceC14100 interfaceC141019 = interfaceC14103;
                    interfaceC14104 = interfaceC14104;
                    view = view2;
                    i17 = i34;
                    checkBox5 = checkBox5;
                    i28 = i28;
                    CheckBox checkBox21 = checkBox3;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener3 = onClickListener4;
                    short[] sArr23 = sArr12;
                    iM55683 = iM55683;
                    boolean z12 = z2;
                    sArr12 = sArr23;
                    interfaceC14103 = interfaceC141019;
                    checkBox = checkBox7;
                    z2 = z12;
                    onCheckedChangeListener = onCheckedChangeListener;
                    i29 = i29;
                    checkBox3 = checkBox21;
                    c20671 = c20671M55888;
                    onItemSelected(adapterView, view3, selectedItemPosition, j);
                    spinner = spinner3;
                    spinner.setOnItemSelectedListener(this);
                    InterfaceC14100 interfaceC141020 = ApplicationC21448.f67649;
                    if (C1003.f81929 > 0) {
                        int iM556812 = C0873.m55680("ܶᩳ") ^ i24;
                        int i59 = ((iM556812 ^ i23) * (-19461)) ^ (-949951623);
                        i27 = iM556812 ^ 2073631956;
                        spinner3 = spinner;
                        c20671M55888 = c20671;
                        checkBox5 = checkBox5;
                        i28 = i28;
                        i34 = i17;
                        interfaceC14104 = interfaceC14104;
                        checkBox7 = checkBox;
                        i29 = i29;
                        view2 = view;
                        interfaceC14103 = interfaceC14103;
                        iM55683 = iM55683;
                        interfaceC14102 = interfaceC141020;
                        i26 = i59;
                        sArr12 = sArr12;
                        onClickListener4 = onClickListener3;
                        z2 = z2;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        z = false;
                        checkBox3 = checkBox3;
                        onCheckedChangeListener = onCheckedChangeListener;
                    } else {
                        interfaceC14101 = interfaceC14101;
                        strM55689 = strM55689;
                        sArr6 = sArr10;
                        i16 = i33;
                        z = false;
                        interfaceC14102 = interfaceC141020;
                        i15 = i35;
                        iM55979 = C0873.m55680("ۡܺ") ^ i23;
                        i18 = ((iM55979 ^ i24) * (-22949)) ^ (-1103109619);
                        i19 = 799618161;
                        i27 = iM55979 ^ i19;
                        i35 = i15;
                        i26 = i18;
                        sArr10 = sArr6;
                        i33 = i16;
                        onClickListener4 = onClickListener3;
                        i34 = i17;
                        checkBox7 = checkBox;
                        spinner3 = spinner;
                        view2 = view;
                        c20671M55888 = c20671;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        iM55683 = iM55683;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr12;
                        z2 = z2;
                        z = z;
                        interfaceC14101 = interfaceC14101;
                        checkBox5 = checkBox5;
                        interfaceC14103 = interfaceC14103;
                        interfaceC14102 = interfaceC14102;
                        strM55689 = strM55689;
                        i28 = i28;
                        interfaceC14104 = interfaceC14104;
                    }
                    break;
                case -224387922:
                case 830310919:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    View view11 = view2;
                    int i60 = i34;
                    i28 = i28;
                    strM55689 = strM55689;
                    interfaceC14102 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    CheckBox checkBox22 = checkBox6;
                    int i61 = i30;
                    DialogInterface.OnClickListener onClickListener12 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC14101 = interfaceC14101;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM55683 = iM55683;
                    short[] sArr24 = sArr8;
                    int i62 = i31;
                    textView = (TextView) C0892.m55755(view11, C0946.m55979(C1229.m56403(sArr24, i62, 3, i25)) ^ 2099730548);
                    int iM556813 = (C0873.m55680("۠֫") + i24) * (-85);
                    i31 = i62;
                    sArr9 = sArr9;
                    sArr10 = sArr10;
                    i33 = i33;
                    onClickListener4 = onClickListener12;
                    i32 = i32;
                    i35 = i35;
                    sArr8 = sArr24;
                    checkBox7 = checkBox7;
                    i27 = iM556813 ^ 12897232;
                    i26 = ((iM556813 ^ i23) * (-23887)) ^ (-394610620);
                    spinner3 = spinner3;
                    c20671M55888 = c20671M55888;
                    i30 = i61;
                    checkBox6 = checkBox22;
                    i34 = i60;
                    i29 = i29;
                    view2 = view11;
                    checkBox3 = checkBox3;
                    iM55683 = iM55683;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC14101 = interfaceC14101;
                    checkBox5 = checkBox5;
                    interfaceC14103 = interfaceC14103;
                    interfaceC14102 = interfaceC14102;
                    strM55689 = strM55689;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    break;
                case -39361564:
                case 2030266251:
                    C1036.m56257();
                    onCheckedChangeListener = onCheckedChangeListener;
                    i7 = i35;
                    checkBox2 = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    viewM56111 = view2;
                    sArr4 = sArr9;
                    i8 = i32;
                    i9 = i33;
                    i6 = i34;
                    i28 = i28;
                    main = mainM56594;
                    strM55689 = strM55689;
                    interfaceC14102 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener2 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC14101 = interfaceC14101;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM55683 = iM55683;
                    i29 = i29;
                    c20671 = c20671M55888;
                    spinner2 = spinner3;
                    sArr5 = sArr10;
                    iM55680 = C0873.m55680("ᩳ۫") ^ i24;
                    i10 = ((iM55680 ^ i23) * 6585) ^ (-298946454);
                    i11 = -1443599469;
                    i27 = iM55680 ^ i11;
                    mainM56594 = main;
                    sArr9 = sArr4;
                    sArr10 = sArr5;
                    i33 = i9;
                    onClickListener4 = onClickListener2;
                    i34 = i6;
                    i32 = i8;
                    i35 = i7;
                    checkBox7 = checkBox2;
                    view2 = viewM56111;
                    spinner3 = spinner2;
                    i26 = i10;
                    c20671M55888 = c20671;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM55683 = iM55683;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC14101 = interfaceC14101;
                    checkBox5 = checkBox5;
                    interfaceC14103 = interfaceC14103;
                    interfaceC14102 = interfaceC14102;
                    strM55689 = strM55689;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    break;
                case -26975226:
                case 871016342:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox3 = checkBox3;
                    InterfaceC14100 interfaceC141021 = interfaceC14104;
                    View view12 = view2;
                    int i63 = i34;
                    int i64 = i28;
                    boolean z13 = z;
                    checkBox6 = checkBox6;
                    boolean z14 = z2;
                    short[] sArr25 = sArr12;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    int i65 = iM55683;
                    int i66 = i29;
                    interfaceC14100 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox5 = checkBox5;
                    C20671 c20673 = c20671M55888;
                    Spinner spinner5 = spinner3;
                    InterfaceC14100 interfaceC141022 = interfaceC14101;
                    String str4 = strM55689;
                    spinner5.setSelection(interfaceC141022.getInt(str4, 0));
                    selectedItemPosition = spinner5.getSelectedItemPosition();
                    j = 0;
                    adapterView = null;
                    view3 = null;
                    int iM556814 = (C0873.m55680("ܳ֫") + i23) * (-17);
                    i27 = iM556814 ^ 1507038199;
                    i26 = ((iM556814 ^ i24) * (-17577)) ^ (-551239874);
                    strM55689 = str4;
                    spinner3 = spinner5;
                    c20671M55888 = c20673;
                    i28 = i64;
                    i34 = i63;
                    interfaceC14104 = interfaceC141021;
                    checkBox7 = checkBox7;
                    i29 = i66;
                    view2 = view12;
                    iM55683 = i65;
                    sArr12 = sArr25;
                    z2 = z14;
                    z = z13;
                    interfaceC14101 = interfaceC141022;
                    checkBox5 = checkBox5;
                    interfaceC14103 = interfaceC14103;
                    interfaceC14102 = interfaceC14100;
                    onClickListener4 = onClickListener;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    checkBox3 = checkBox3;
                    onCheckedChangeListener = onCheckedChangeListener;
                    break;
                case 4530172:
                case 232100913:
                    view = view2;
                    this.f35311 = c18107;
                    this.f35312 = abstractC17043;
                    this.f35309 = str;
                    mainM56594 = C1964.m56594(c18107);
                    String strM56180 = RunnableC1014.m56180(f82137, 1, 3, i25);
                    int iM559721 = C0946.m55979("᩵֫") ^ i23;
                    i5 = ((iM559721 ^ i24) * 29943) ^ (-213163164);
                    sArr9 = sArr9;
                    sArr10 = sArr10;
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    i35 = i35;
                    sArr8 = sArr8;
                    checkBox7 = checkBox7;
                    str2 = strM56180;
                    i27 = iM559721 ^ 471032479;
                    i26 = i5;
                    spinner3 = spinner3;
                    c20671M55888 = c20671M55888;
                    onClickListener4 = onClickListener4;
                    i34 = i34;
                    i29 = i29;
                    view2 = view;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    iM55683 = iM55683;
                    checkBox3 = checkBox3;
                    sArr12 = sArr12;
                    onCheckedChangeListener = onCheckedChangeListener;
                    z2 = z2;
                    z = z;
                    interfaceC14101 = interfaceC14101;
                    checkBox5 = checkBox5;
                    interfaceC14103 = interfaceC14103;
                    interfaceC14102 = interfaceC14102;
                    strM55689 = strM55689;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    break;
                case 19763748:
                case 729192396:
                    view = view2;
                    CheckBox checkBox23 = (CheckBox) C0892.m55755(view, iM559713 ^ 2101011924);
                    this.f35310 = checkBox23;
                    sArr10 = f82137;
                    i33 = 22;
                    int iM559722 = (C0946.m55979("ۡ᩵") ^ i24) * 69;
                    i5 = ((iM559722 ^ i23) * (-4525)) ^ 1728920033;
                    i27 = iM559722 ^ 646331363;
                    checkBox7 = checkBox23;
                    i26 = i5;
                    spinner3 = spinner3;
                    c20671M55888 = c20671M55888;
                    onClickListener4 = onClickListener4;
                    i34 = i34;
                    i29 = i29;
                    view2 = view;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    iM55683 = iM55683;
                    checkBox3 = checkBox3;
                    sArr12 = sArr12;
                    onCheckedChangeListener = onCheckedChangeListener;
                    z2 = z2;
                    z = z;
                    interfaceC14101 = interfaceC14101;
                    checkBox5 = checkBox5;
                    interfaceC14103 = interfaceC14103;
                    interfaceC14102 = interfaceC14102;
                    strM55689 = strM55689;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    break;
                case 759343253:
                case 1424071905:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox = checkBox7;
                    z = z;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    z2 = z2;
                    short[] sArr26 = sArr12;
                    view = view2;
                    i = i34;
                    i28 = i28;
                    iM55683 = iM55683;
                    i29 = i29;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    c20671 = c20671M55888;
                    spinner = spinner3;
                    interfaceC14100 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox5 = checkBox5;
                    this.f35314 = checkBox3;
                    InterfaceC14100 interfaceC141023 = ApplicationC21448.f67649;
                    strM55689 = C0873.m55689(f82137, 34, 16, i25);
                    if (ServiceConnectionC1013.f81940 < 0) {
                        int iM556815 = (C0873.m55680("ۧۛ") + i24) * (-113);
                        int i67 = ((iM556815 ^ i23) * (-17825)) ^ (-1422533059);
                        i27 = iM556815 ^ (-1486401290);
                        spinner3 = spinner;
                        c20671M55888 = c20671;
                        i28 = i28;
                        i34 = i;
                        interfaceC14104 = interfaceC14104;
                        checkBox7 = checkBox;
                        i29 = i29;
                        view2 = view;
                        iM55683 = iM55683;
                        sArr12 = sArr26;
                        z2 = z2;
                        z = z;
                        interfaceC14101 = interfaceC141023;
                        i26 = i67;
                        checkBox5 = checkBox5;
                        interfaceC14103 = interfaceC14103;
                        interfaceC14102 = interfaceC14100;
                        onClickListener4 = onClickListener;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        checkBox3 = checkBox3;
                        onCheckedChangeListener = onCheckedChangeListener;
                    } else {
                        interfaceC14101 = interfaceC141023;
                        i2 = i35;
                        strM55689 = strM55689;
                        sArr = sArr26;
                        sArr2 = sArr9;
                        i3 = i32;
                        sArr3 = sArr10;
                        i4 = i33;
                        interfaceC14102 = interfaceC14100;
                        z2 = z2;
                        int iM5597111 = (i24 - C0946.m55979("᩺ܽ")) * (-113);
                        int i311 = i2;
                        i26 = ((iM5597111 ^ i23) * (-30387)) ^ (-337495545);
                        i27 = iM5597111 ^ (-1659767500);
                        sArr9 = sArr2;
                        z = z;
                        sArr10 = sArr3;
                        i33 = i4;
                        onClickListener4 = onClickListener;
                        i32 = i3;
                        i35 = i311;
                        checkBox7 = checkBox;
                        interfaceC14101 = interfaceC14101;
                        spinner3 = spinner;
                        c20671M55888 = c20671;
                        checkBox5 = checkBox5;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        interfaceC14103 = interfaceC14103;
                        iM55683 = iM55683;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr;
                        interfaceC14102 = interfaceC14102;
                        i34 = i;
                        strM55689 = strM55689;
                        view2 = view;
                        i28 = i28;
                        interfaceC14104 = interfaceC14104;
                    }
                    break;
                case 858085345:
                case 1253758154:
                    i6 = i34;
                    onCheckedChangeListener = onCheckedChangeListener;
                    i7 = i35;
                    checkBox2 = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC14104 = interfaceC14104;
                    sArr4 = sArr9;
                    i8 = i32;
                    i9 = i33;
                    i28 = i28;
                    strM55689 = strM55689;
                    interfaceC14102 = interfaceC14102;
                    interfaceC14103 = interfaceC14103;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener2 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC14101 = interfaceC14101;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM55683 = iM55683;
                    i29 = i29;
                    c20671 = c20671M55888;
                    spinner2 = spinner3;
                    sArr5 = sArr10;
                    main = mainM56594;
                    viewM56111 = C0992.m56111(main, C0946.m55979(str2) ^ 2127917453);
                    sArr8 = f82137;
                    i31 = 4;
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("ᩳ۫") ^ i24;
                        i10 = ((iM55680 ^ i23) * 6585) ^ (-298946454);
                        i11 = -1443599469;
                    } else {
                        iM55680 = (C0873.m55680("֫ܳ") + i24) * (-3);
                        i10 = ((iM55680 ^ i23) * 32207) ^ (-1734863568);
                        i11 = 1910470970;
                    }
                    i27 = iM55680 ^ i11;
                    mainM56594 = main;
                    sArr9 = sArr4;
                    sArr10 = sArr5;
                    i33 = i9;
                    onClickListener4 = onClickListener2;
                    i34 = i6;
                    i32 = i8;
                    i35 = i7;
                    checkBox7 = checkBox2;
                    view2 = viewM56111;
                    spinner3 = spinner2;
                    i26 = i10;
                    c20671M55888 = c20671;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM55683 = iM55683;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC14101 = interfaceC14101;
                    checkBox5 = checkBox5;
                    interfaceC14103 = interfaceC14103;
                    interfaceC14102 = interfaceC14102;
                    strM55689 = strM55689;
                    i28 = i28;
                    interfaceC14104 = interfaceC14104;
                    break;
                case 929545219:
                case 1318898520:
                    onClickListener4 = null;
                    C0906.m55817(c20671M55888, iM559711, null);
                    i28 = 3;
                    iM55683 = C0873.m55680(C1003.m56132(f82137, 151, 3, i25)) ^ 2124788143;
                    sArr13 = f82137;
                    i34 = EnumC19222.f57460;
                    iM55682 = C0946.m55979("ܳ۬") ^ i23;
                    i20 = ((iM55682 ^ i24) * (-25613)) ^ (-1435026868);
                    i21 = 544219178;
                    i27 = iM55682 ^ i21;
                    i26 = i20;
                    break;
                default:
                    onClickListener = onClickListener4;
                    i28 = i28;
                    iM55683 = iM55683;
                    CheckBox checkBox24 = checkBox3;
                    view = view2;
                    i = i34;
                    CheckBox checkBox25 = checkBox6;
                    C0877.m55693(checkBox25, C0890.m55727(ApplicationC21448.f67649, C0894.m55773(f82137, 89, 15, i25), true));
                    InterfaceC14100 interfaceC141024 = ApplicationC21448.f67649;
                    short[] sArr27 = f82137;
                    i30 = IShizukuService.Stub.TRANSACTION_isHidden;
                    if (C1229.f82066 >= 0) {
                        interfaceC14104 = interfaceC141024;
                        checkBox6 = checkBox25;
                        sArr = sArr27;
                        onCheckedChangeListener = onCheckedChangeListener;
                        i2 = i35;
                        i29 = i29;
                        checkBox = checkBox7;
                        sArr2 = sArr9;
                        i3 = i32;
                        i4 = i33;
                        z2 = true;
                        checkBox3 = checkBox24;
                        c20671 = c20671M55888;
                        strM55689 = strM55689;
                        spinner = spinner3;
                        interfaceC14102 = interfaceC14102;
                        interfaceC14103 = interfaceC14103;
                        sArr3 = sArr10;
                        checkBox5 = checkBox5;
                        interfaceC14101 = interfaceC14101;
                        z = z;
                        int iM5597112 = (i24 - C0946.m55979("᩺ܽ")) * (-113);
                        int i312 = i2;
                        i26 = ((iM5597112 ^ i23) * (-30387)) ^ (-337495545);
                        i27 = iM5597112 ^ (-1659767500);
                        sArr9 = sArr2;
                        z = z;
                        sArr10 = sArr3;
                        i33 = i4;
                        onClickListener4 = onClickListener;
                        i32 = i3;
                        i35 = i312;
                        checkBox7 = checkBox;
                        interfaceC14101 = interfaceC14101;
                        spinner3 = spinner;
                        c20671M55888 = c20671;
                        checkBox5 = checkBox5;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        interfaceC14103 = interfaceC14103;
                        iM55683 = iM55683;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr;
                        interfaceC14102 = interfaceC14102;
                        i34 = i;
                        strM55689 = strM55689;
                        view2 = view;
                        i28 = i28;
                        interfaceC14104 = interfaceC14104;
                    } else {
                        int iM556816 = (C0873.m55680("ܽܰ") ^ i23) * 49;
                        int i68 = ((iM556816 ^ i24) * (-28015)) ^ (-302323877);
                        i27 = iM556816 ^ 1714901616;
                        checkBox6 = checkBox25;
                        checkBox3 = checkBox24;
                        i28 = i28;
                        i34 = i;
                        z2 = true;
                        interfaceC14104 = interfaceC141024;
                        i26 = i68;
                        view2 = view;
                        onClickListener4 = onClickListener;
                        i30 = IShizukuService.Stub.TRANSACTION_isHidden;
                        sArr12 = sArr27;
                        iM55683 = iM55683;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x077d A[PHI: r2 r13 r16 r21 r23 r35 r39 r40 r41 r45
      0x077d: PHI (r2v43 java.lang.String) = (r2v30 java.lang.String), (r2v44 java.lang.String) binds: [B:137:0x0766, B:107:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x077d: PHI (r13v56 java.lang.String) = (r13v44 java.lang.String), (r13v57 java.lang.String) binds: [B:137:0x0766, B:107:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x077d: PHI (r16v4 l.۫ۘܽ) = (r16v3 l.۫ۘܽ), (r16v2 l.۫ۘܽ) binds: [B:137:0x0766, B:107:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x077d: PHI (r21v50 java.lang.String) = (r21v38 java.lang.String), (r21v51 java.lang.String) binds: [B:137:0x0766, B:107:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x077d: PHI (r23v56 boolean) = (r23v44 boolean), (r23v57 boolean) binds: [B:137:0x0766, B:107:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x077d: PHI (r35v46 boolean) = (r35v35 boolean), (r35v47 boolean) binds: [B:137:0x0766, B:107:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x077d: PHI (r39v66 java.lang.String) = (r39v56 java.lang.String), (r39v67 java.lang.String) binds: [B:137:0x0766, B:107:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x077d: PHI (r40v23 java.lang.String) = (r40v15 java.lang.String), (r40v24 java.lang.String) binds: [B:137:0x0766, B:107:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x077d: PHI (r41v35 java.lang.String) = (r41v23 java.lang.String), (r41v36 java.lang.String) binds: [B:137:0x0766, B:107:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x077d: PHI (r45v42 l.ۚۖۡ) = (r45v31 l.ۚۖۡ), (r45v43 l.ۚۖۡ) binds: [B:137:0x0766, B:107:0x053b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int iM55680;
        int i2;
        int i3;
        int iM55969;
        int iM559610;
        String strM55970;
        String str;
        String str2;
        String str3;
        String strM56318;
        String str4;
        int iM55979;
        int i4;
        int i5;
        int iM559710;
        int i6;
        int i7;
        int iM55681;
        int i8;
        int i9;
        boolean z;
        int iM559711;
        int i10;
        int iM55682;
        int i11;
        int i12;
        int iM55683;
        int i13;
        int i14;
        int selectedItemPosition = 0;
        boolean zM55695 = false;
        boolean zM56014 = false;
        boolean z2 = false;
        String strM55622 = null;
        int iM27016 = 0;
        String str5 = null;
        Exception exc = null;
        int iM27008 = 0;
        C13929 c13929 = null;
        C13929 c139210 = null;
        String str6 = null;
        int i15 = 0;
        int i16 = 0;
        String strM56135 = null;
        int i17 = 962913229;
        int i18 = C1028.f81950;
        int i19 = C0949.f81897;
        int iM55684 = (i18 - C0873.m55680("ܿ֨")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i20 = ((iM55684 ^ i19) * (-7261)) ^ (-991160277);
        int i21 = iM55684 ^ 1778434368;
        C18107 c18107 = null;
        C13929 c13929Matcher = null;
        String str7 = null;
        String strM56227 = null;
        int i22 = 0;
        boolean zM56015 = false;
        boolean zM56016 = false;
        String str8 = null;
        DialogInterfaceC2564 dialogInterfaceC2564 = null;
        Exception exc2 = null;
        String str9 = null;
        C7179 c7179 = null;
        String str10 = null;
        C13929 c139211 = null;
        String str11 = null;
        int i23 = 0;
        int iM55685 = 0;
        C7179 c71710 = null;
        String str12 = null;
        boolean z3 = false;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i19) * 26893) >> 31));
            switch (i17) {
                case -2130928939:
                case -2037467155:
                    str12 = str12;
                    c71710 = c71710;
                    zM56014 = zM56014;
                    z3 = z3;
                    str9 = str9;
                    strM56227 = strM56227;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (!C0882.m55713()) {
                        iM559710 = C0946.m55979("ۜ۫") ^ i19;
                        i6 = ((iM559710 ^ i18) * 30647) ^ (-321862454);
                        i7 = 1360403449;
                        int i24 = iM559710 ^ i7;
                        strM56227 = strM56227;
                        z3 = z3;
                        zM56014 = zM56014;
                        str12 = str12;
                        c71710 = c71710;
                        i21 = i24;
                        i20 = i6;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    } else {
                        z3 = z3;
                        iM55681 = C0873.m55680("ۙۡ") ^ i18;
                        i8 = ((iM55681 ^ i19) * 20429) ^ (-906444676);
                        i9 = -684453532;
                        int i25 = iM55681 ^ i9;
                        strM56227 = strM56227;
                        zM56014 = zM56014;
                        str12 = str12;
                        str10 = str10;
                        i21 = i25;
                        i20 = i8;
                        str7 = str7;
                        c71710 = c71710;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case -2043314842:
                case -967897130:
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    if (C11774.m27014(strM55622)) {
                        iM55680 = C0873.m55680("۫ܿ") ^ i19;
                        i2 = ((iM55680 ^ i18) * (-2571)) ^ (-1710801119);
                        i3 = -1392994342;
                    } else {
                        iM55680 = (C0873.m55680("ܺܿ") + i19) * 115;
                        i2 = ((iM55680 ^ i18) * 15733) ^ (-611428768);
                        i3 = -1208071604;
                    }
                    i21 = iM55680 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM56014 = zM56014;
                    break;
                case -2009052080:
                case 306920398:
                    C1964.m56594(c18107).m12253(C0946.m55979(C1044.m56276(f82137, 167, 3, i22)) ^ 2122061308, C0946.m55979(RunnableC0897.m55783(f82137, 170, 3, i22)) ^ 2128806274, z3);
                    break;
                case -2008366963:
                case -840662134:
                    str12 = str12;
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    strM56227 = strM56227;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (selectedItemPosition != 3) {
                        iM55681 = (C0946.m55979("ܽۖ") ^ i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((iM55681 ^ i19) * (-415)) ^ 921883071;
                        i9 = 982608946;
                    } else {
                        iM55681 = (C0946.m55979("᩷ܳ") + i19) * 89;
                        i8 = ((iM55681 ^ i18) * (-11141)) ^ 1264560833;
                        i9 = -1584241485;
                    }
                    int i26 = iM55681 ^ i9;
                    strM56227 = strM56227;
                    zM56014 = zM56014;
                    str12 = str12;
                    str10 = str10;
                    i21 = i26;
                    i20 = i8;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1977576723:
                case 1970797650:
                    str12 = str12;
                    c71710 = c71710;
                    zM56014 = zM56014;
                    z3 = z3;
                    str9 = str9;
                    strM56227 = strM56227;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    i23 = 1;
                    if (selectedItemPosition == 1) {
                        z = z2;
                        zM56014 = zM56014;
                        int iM55686 = C0873.m55680("ۢ᩻") ^ i18;
                        strM56227 = strM56227;
                        str12 = str12;
                        str9 = str9;
                        i21 = iM55686 ^ (-2127816814);
                        i20 = ((iM55686 ^ i19) * (-24183)) ^ (-1051050896);
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z;
                        z3 = z3;
                        c71710 = c71710;
                    } else {
                        iM559710 = C0946.m55979("ۤ۠") ^ i19;
                        i6 = ((iM559710 ^ i18) * (-5725)) ^ 1441957451;
                        i7 = 1871475829;
                        int i27 = iM559710 ^ i7;
                        strM56227 = strM56227;
                        z3 = z3;
                        zM56014 = zM56014;
                        str12 = str12;
                        c71710 = c71710;
                        i21 = i27;
                        i20 = i6;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case -1945584363:
                case -1885695782:
                    RunnableC0871.m55671(C1071.m56350(exc2));
                    C0882.m55722(c7179);
                    break;
                case -1890597932:
                case -249430992:
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    str = strM56227;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    String strM55773 = C0894.m55773(f82137, PicnicEngine.MAX_AUX_BYTES, 2, i22);
                    boolean zM56345 = C1071.m56345(str8, strM55773);
                    str11 = strM55773;
                    strM55970 = AbstractC0942.m55970(f82137, 178, 2, i22);
                    if (zM56345) {
                        iM559711 = C0946.m55979("᩷᩶") ^ i19;
                        i6 = ((iM559711 ^ i18) * (-5347)) ^ (-1042345314);
                        i10 = -1435839392;
                    } else {
                        iM559711 = (C0873.m55680("ۧܳ") ^ i18) * 31;
                        i6 = ((iM559711 ^ i19) * 10233) ^ (-2123101332);
                        i10 = -1692922261;
                    }
                    i21 = iM559711 ^ i10;
                    c71710 = c71710;
                    strM56227 = str;
                    zM56014 = zM56014;
                    str12 = strM55970;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1831167903:
                case 1435373461:
                    C1024.m56202(iM55685);
                    C0927.m55877(c71710);
                    break;
                case -1828432917:
                case -1502252338:
                    str12 = str12;
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    strM56227 = strM56227;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (selectedItemPosition != 4) {
                        c139210 = c139211;
                        str5 = str10;
                        iM55681 = C0873.m55680("ۨۡ") ^ i19;
                        i8 = ((iM55681 ^ i18) * (-15831)) ^ (-1284239432);
                        i9 = 1135315253;
                    } else {
                        iM55681 = C0946.m55979("᩷ܽ") ^ i19;
                        i8 = ((iM55681 ^ i18) * 16817) ^ (-1193401752);
                        i9 = -887581781;
                    }
                    int i28 = iM55681 ^ i9;
                    strM56227 = strM56227;
                    zM56014 = zM56014;
                    str12 = str12;
                    str10 = str10;
                    i21 = i28;
                    i20 = i8;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1748615274:
                case 307045419:
                    str12 = str12;
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    strM56227 = strM56227;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (zM56015) {
                        iM55681 = C0873.m55680("ܳۤ") ^ i18;
                        i8 = ((iM55681 ^ i19) * 28671) ^ (-1581088054);
                        i9 = -376017632;
                    } else {
                        iM55681 = C0873.m55680("ۡۧ") ^ i19;
                        i8 = ((iM55681 ^ i18) * (-20227)) ^ (-277683476);
                        i9 = -598447059;
                    }
                    int i29 = iM55681 ^ i9;
                    strM56227 = strM56227;
                    zM56014 = zM56014;
                    str12 = str12;
                    str10 = str10;
                    i21 = i29;
                    i20 = i8;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1720230613:
                case 1933514393:
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    strM55622 = C0861.m55622(str8, 2);
                    iM55680 = (C0946.m55979("۬֡") + i19) * 61;
                    i2 = ((iM55680 ^ i18) * (-11969)) ^ 1648907654;
                    i3 = 261935737;
                    i21 = iM55680 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM56014 = zM56014;
                    break;
                case -1694639638:
                case 797246232:
                    zM56014 = zM56014;
                    str9 = str9;
                    z2 = z2;
                    c71710 = c71710;
                    str8 = str8;
                    str6 = str5;
                    c13929 = c139210;
                    str7 = str7;
                    i15 = 0;
                    i16 = 0;
                    iM55680 = C0946.m55979("᩷۬") ^ i19;
                    i2 = ((iM55680 ^ i18) * (-14939)) ^ 1270560680;
                    i3 = 863511363;
                    i21 = iM55680 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM56014 = zM56014;
                    break;
                case -1477976392:
                case -753995499:
                    i22 = 43992;
                    iM559710 = C0873.m55680("ۘ۫") ^ i18;
                    i6 = ((iM559710 ^ i19) * (-32357)) ^ (-94650951);
                    i7 = 1525417834;
                    int i210 = iM559710 ^ i7;
                    strM56227 = strM56227;
                    z3 = z3;
                    zM56014 = zM56014;
                    str12 = str12;
                    c71710 = c71710;
                    i21 = i210;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1321819616:
                case -455620506:
                    C1025.m56228(C1046.m56289(ServiceConnectionC1013.m56156(C0873.m55680(AbstractC0942.m55970(f82137, 207, 3, i22)) ^ 2099890846), str9));
                    C0927.m55877(c7179);
                    break;
                case -1309834583:
                case -396142854:
                    str12 = str12;
                    c71710 = c71710;
                    z3 = z3;
                    str8 = str8;
                    str9 = str9;
                    str7 = str7;
                    strM56227 = strM56227;
                    str10 = str10;
                    zM56015 = C0949.m56014(this.f35305);
                    zM55695 = C0877.m55695(this.f35307);
                    zM56016 = C0949.m56014(this.f35310);
                    zM56014 = C0949.m56014(this.f35304);
                    boolean zM56017 = C0949.m56014(this.f35314);
                    if (selectedItemPosition != 0) {
                        int iM559712 = C0946.m55979("᩻᩻") ^ i18;
                        z = zM56017;
                        i20 = ((iM559712 ^ i19) * 22911) ^ 471047778;
                        strM56227 = strM56227;
                        str12 = str12;
                        str9 = str9;
                        i21 = iM559712 ^ (-319122072);
                    } else {
                        z = zM56017;
                        int iM55687 = C0873.m55680("ۢ᩻") ^ i18;
                        strM56227 = strM56227;
                        str12 = str12;
                        str9 = str9;
                        i21 = iM55687 ^ (-2127816814);
                        i20 = ((iM55687 ^ i19) * (-24183)) ^ (-1051050896);
                    }
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z;
                    z3 = z3;
                    c71710 = c71710;
                    break;
                case -1266908423:
                case 759012265:
                    C0917.m55842(iM55685);
                    C0927.m55877(c7179);
                    break;
                case -1249464621:
                case 923930347:
                    zM56014 = zM56014;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    iM27016 = C11774.m27016(C1012.m56135(str8, i23));
                    c71710 = c71710;
                    String str13 = str7;
                    if (C1229.m56404(str10, str13)) {
                        iM55680 = (i18 - C0946.m55979("ۙۜ")) * (-7);
                        str7 = str13;
                        i2 = ((iM55680 ^ i19) * (-32619)) ^ 360752531;
                        i3 = -944456080;
                    } else {
                        str7 = str13;
                        iM55680 = C0873.m55680("ۜ᩻") ^ i18;
                        i2 = ((iM55680 ^ i19) * (-7977)) ^ 818047213;
                        i3 = 1410551334;
                    }
                    i21 = iM55680 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM56014 = zM56014;
                    break;
                case -1227217873:
                case -3458311:
                    str12 = str12;
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    strM56227 = strM56227;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    c139211 = null;
                    if (selectedItemPosition != 2) {
                        iM55681 = C0946.m55979("ۧ۫") ^ i18;
                        i8 = ((iM55681 ^ i19) * 3859) ^ (-542682910);
                        i9 = -1422059637;
                    } else {
                        iM55681 = C0946.m55979("᩷ܽ") ^ i19;
                        i8 = ((iM55681 ^ i18) * 16817) ^ (-1193401752);
                        i9 = -887581781;
                    }
                    int i211 = iM55681 ^ i9;
                    strM56227 = strM56227;
                    zM56014 = zM56014;
                    str12 = str12;
                    str10 = str10;
                    i21 = i211;
                    i20 = i8;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1032669046:
                case 1974388296:
                    zM56014 = zM56014;
                    str9 = str9;
                    iM27008 = C11774.m27008(strM55622);
                    z2 = z2;
                    String str14 = str11;
                    if (C1071.m56345(str10, str14)) {
                        str11 = str14;
                        iM55979 = C0946.m55979("᩺֡") ^ i18;
                        i4 = ((iM55979 ^ i19) * 19007) ^ 1778497627;
                        i5 = 586909330;
                    } else {
                        iM55979 = C0946.m55979("ۧܺ") ^ i19;
                        str11 = str14;
                        i4 = ((iM55979 ^ i18) * 24107) ^ (-363522122);
                        i5 = -1845836387;
                    }
                    i21 = iM55979 ^ i5;
                    i20 = i4;
                    z2 = z2;
                    str9 = str9;
                    zM56014 = zM56014;
                    break;
                case -881959401:
                case 1143075856:
                    strM56135 = C1012.m56135(str10, 2);
                    iM55683 = (i18 - C0873.m55680("ܽ᩶")) * (-121);
                    i13 = ((iM55683 ^ i19) * (-28827)) ^ (-2044872141);
                    i14 = 821733968;
                    i21 = iM55683 ^ i14;
                    i20 = i13;
                    break;
                case -859792722:
                case 830056027:
                    C0917.m55847(dialogInterfaceC2564);
                    break;
                case -766523444:
                case 1405754300:
                    C1024.m56202(C0946.m55979(C0854.m55597(f82137, 334, 3, i22)) ^ 2101922057);
                    C0882.m55722(c71710);
                    break;
                case -668712848:
                case 140602869:
                    str12 = str12;
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    strM56227 = strM56227;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    selectedItemPosition = this.f35315.getSelectedItemPosition();
                    c18107 = this.f35311;
                    z3 = false;
                    if (selectedItemPosition == 0) {
                        iM55681 = (C0873.m55680("۟ۗ") + i19) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i8 = ((iM55681 ^ i18) * 35) ^ (-577813759);
                        i9 = -737272381;
                    } else {
                        iM55681 = C0873.m55680("ۙۡ") ^ i18;
                        i8 = ((iM55681 ^ i19) * 20429) ^ (-906444676);
                        i9 = -684453532;
                    }
                    int i212 = iM55681 ^ i9;
                    strM56227 = strM56227;
                    zM56014 = zM56014;
                    str12 = str12;
                    str10 = str10;
                    i21 = i212;
                    i20 = i8;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -640746055:
                case -280941252:
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    if (!C1229.m56404(str8, str12)) {
                        strM55622 = str8;
                        iM55680 = (C0946.m55979("۬֡") + i19) * 61;
                        i2 = ((iM55680 ^ i18) * (-11969)) ^ 1648907654;
                        i3 = 261935737;
                        i21 = iM55680 ^ i3;
                        i20 = i2;
                        str7 = str7;
                        c71710 = c71710;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        zM56014 = zM56014;
                    } else {
                        strM55970 = str12;
                        str10 = str10;
                        str9 = str9;
                        str = strM56227;
                        iM559711 = C0946.m55979("᩷᩶") ^ i19;
                        i6 = ((iM559711 ^ i18) * (-5347)) ^ (-1042345314);
                        i10 = -1435839392;
                        i21 = iM559711 ^ i10;
                        c71710 = c71710;
                        strM56227 = str;
                        zM56014 = zM56014;
                        str12 = strM55970;
                        i20 = i6;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case -484105429:
                case 857714690:
                    iM559610 = C11774.m27016(C1012.m56135(str10, i23));
                    iM55969 = iM27016;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    i16 = iM559610;
                    i15 = iM55969;
                    str6 = str10;
                    c13929 = c139211;
                    iM55680 = C0946.m55979("᩷۬") ^ i19;
                    i2 = ((iM55680 ^ i18) * (-14939)) ^ 1270560680;
                    i3 = 863511363;
                    i21 = iM55680 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM56014 = zM56014;
                    break;
                case -431244925:
                case 565628015:
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    if (!C11774.m27012(C0861.m55622(str8, i23))) {
                        str2 = str12;
                        str3 = str10;
                        strM56318 = str9;
                        str4 = strM56227;
                        iM55682 = (C0873.m55680("ᩳۤ") ^ i19) * (-103);
                        i11 = ((iM55682 ^ i18) * (-26441)) ^ 584296304;
                        i12 = 1068875967;
                        int i30 = iM55682 ^ i12;
                        strM56227 = str4;
                        zM56014 = zM56014;
                        str12 = str2;
                        i21 = i30;
                        c71710 = c71710;
                        boolean z4 = z2;
                        str9 = strM56318;
                        i20 = i11;
                        str10 = str3;
                        str7 = str7;
                        str8 = str8;
                        z2 = z4;
                    } else {
                        iM55680 = C0873.m55680("ܶۛ") ^ i18;
                        i2 = ((iM55680 ^ i19) * 8269) ^ 16157654;
                        i3 = -748748717;
                        i21 = iM55680 ^ i3;
                        i20 = i2;
                        str7 = str7;
                        c71710 = c71710;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        zM56014 = zM56014;
                    }
                    break;
                case -403328850:
                case 1144055348:
                    str12 = str12;
                    c71710 = c71710;
                    zM56014 = zM56014;
                    z3 = z3;
                    str9 = str9;
                    strM56227 = strM56227;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    try {
                        c13929Matcher = C5275.m11401(str8, zM55695, zM56016).matcher((CharSequence) "");
                        iM559710 = (C0873.m55680("ۤ֫") + i18) * 57;
                        i6 = ((iM559710 ^ i19) * (-19853)) ^ 971394475;
                        i7 = -526985634;
                    } catch (Exception e) {
                        exc2 = e;
                        iM559710 = (i18 - C0873.m55680("᩻᩹")) * 93;
                        i6 = ((iM559710 ^ i19) * 10709) ^ (-393780802);
                        i7 = -736020783;
                    }
                    int i213 = iM559710 ^ i7;
                    strM56227 = strM56227;
                    z3 = z3;
                    zM56014 = zM56014;
                    str12 = str12;
                    c71710 = c71710;
                    i21 = i213;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -366111696:
                case 1466927670:
                    c7179.m16517();
                    c71710.m16517();
                    C0937.m55912(C1071.m56341(C1229.m56401(C1229.m56401(C1229.m56401(C1229.m56401(ViewOnClickListenerC0939.m55950(ApplicationC21448.f67649).mo27875(selectedItemPosition, C0890.m55726(f82137, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 16, i22)), C1071.m56336(f82137, 233, 22, i22), zM56016), ServiceConnectionC1013.m56161(f82137, 255, 17, i22), zM55695), C0866.m55652(f82137, 272, 15, i22), zM56015), RunnableC0897.m55783(f82137, 287, 19, i22), zM56014), C0912.m55822(f82137, 306, 25, i22), z2));
                    C1024.m56208(dialogInterfaceC2564);
                    Main mainM56560 = C1929.m56560(c18107);
                    final int i31 = selectedItemPosition;
                    final C13929 c139212 = c13929;
                    final boolean z5 = zM55695;
                    final boolean z6 = z2;
                    final boolean z7 = zM56014;
                    final String str15 = str6;
                    final int i32 = i15;
                    final int i33 = i16;
                    C11896.m27214(new InterfaceC14577(this) { // from class: l.ۤۙܽ

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ ViewOnClickListenerC12568 f33222;

                        @Override // p067l.InterfaceC14577
                        public final /* synthetic */ void onCanceled() {
                        }

                        /* JADX WARN: Code duplicated, block: B:44:0x0126  */
                        /* JADX WARN: Code duplicated, block: B:48:0x0159 A[PHI: r15 r16 r17
                          0x0159: PHI (r15v3 l.۫ۘܽ) = (r15v2 l.۫ۘܽ), (r15v1 l.۫ۘܽ), (r15v1 l.۫ۘܽ) binds: [B:24:0x007c, B:47:0x0157, B:9:0x0046] A[DONT_GENERATE, DONT_INLINE]
                          0x0159: PHI (r16v4 boolean) = (r16v2 boolean), (r16v1 boolean), (r16v1 boolean) binds: [B:24:0x007c, B:47:0x0157, B:9:0x0046] A[DONT_GENERATE, DONT_INLINE]
                          0x0159: PHI (r17v4 boolean) = (r17v2 boolean), (r17v1 boolean), (r17v1 boolean) binds: [B:24:0x007c, B:47:0x0157, B:9:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:52:0x0189  */
                        /* JADX WARN: Code duplicated, block: B:56:0x01b7  */
                        /* JADX WARN: Code duplicated, block: B:58:0x01e1 A[PHI: r13 r14 r20 r21
                          0x01e1: PHI (r13v5 l.ۧۗܽ) = (r13v3 l.ۧۗܽ), (r13v3 l.ۧۗܽ), (r13v4 l.ۧۗܽ), (r13v3 l.ۧۗܽ) binds: [B:35:0x00ec, B:32:0x00c9, B:28:0x00a6, B:6:0x0040] A[DONT_GENERATE, DONT_INLINE]
                          0x01e1: PHI (r14v3 int) = (r14v1 int), (r14v1 int), (r14v2 int), (r14v1 int) binds: [B:35:0x00ec, B:32:0x00c9, B:28:0x00a6, B:6:0x0040] A[DONT_GENERATE, DONT_INLINE]
                          0x01e1: PHI (r20v4 int) = (r20v1 int), (r20v2 int), (r20v1 int), (r20v1 int) binds: [B:35:0x00ec, B:32:0x00c9, B:28:0x00a6, B:6:0x0040] A[DONT_GENERATE, DONT_INLINE]
                          0x01e1: PHI (r21v4 int) = (r21v1 int), (r21v1 int), (r21v2 int), (r21v1 int) binds: [B:35:0x00ec, B:32:0x00c9, B:28:0x00a6, B:6:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // p067l.InterfaceC14577
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo6049(C13457 c13457, boolean z8) {
                            int iM55688;
                            int i34;
                            int i35 = 2012566216;
                            int i36 = C1229.f82066;
                            int i37 = C0894.f81854;
                            int iM55689 = (C0873.m55680("ܳۙ") + i37) * 61;
                            int i38 = ((iM55689 ^ i36) * 19247) ^ 1072896003;
                            int i39 = iM55689 ^ (-1473474257);
                            ViewOnClickListenerC12568 viewOnClickListenerC12568 = null;
                            C13929 c139213 = null;
                            int i40 = 0;
                            boolean z9 = false;
                            boolean z10 = false;
                            int i41 = 0;
                            int i42 = 0;
                            while (true) {
                                i35 = i39 ^ ((((i35 ^ i36) * (-21707)) >> 31) & i38);
                                switch (i35) {
                                    case -1938734831:
                                    case -1844710796:
                                        if (C1003.f81929 <= 0) {
                                            iM55688 = (C0946.m55979("ܰᩳ") ^ i37) * (-13);
                                            i38 = ((iM55688 ^ i36) * 26915) ^ 1918720903;
                                            i34 = 1606070893;
                                        } else {
                                            iM55688 = (i36 - C0946.m55979("᩺᩷")) * (-17);
                                            i38 = ((iM55688 ^ i37) * (-8527)) ^ (-1439602543);
                                            i34 = 216356165;
                                        }
                                        i39 = iM55688 ^ i34;
                                        break;
                                    case -1925887552:
                                    case -380220112:
                                        C0937.m55918();
                                        C1194.m56396();
                                        iM55688 = (C0873.m55680("ۨۜ") + i37) * (-39);
                                        i38 = ((iM55688 ^ i36) * 15267) ^ (-864758845);
                                        i34 = -1182923251;
                                        i39 = iM55688 ^ i34;
                                        break;
                                    case -1889434701:
                                    case -1385567777:
                                        if (C1053.f81965 > 0) {
                                            iM55688 = (C0873.m55680("ۨۜ") + i37) * (-39);
                                            i38 = ((iM55688 ^ i36) * 15267) ^ (-864758845);
                                            i34 = -1182923251;
                                        } else {
                                            iM55688 = (C0873.m55680("ۢ۬") + i36) * (-123);
                                            i38 = ((iM55688 ^ i37) * (-11711)) ^ (-1218697780);
                                            i34 = 231872149;
                                        }
                                        i39 = iM55688 ^ i34;
                                        break;
                                    case -1657480127:
                                    case -56656977:
                                        int i43 = i33;
                                        viewOnClickListenerC12568 = this.f33222;
                                        i40 = i31;
                                        if (C0927.f81875) {
                                            i42 = i43;
                                            iM55688 = C0873.m55680("֫۫") ^ i37;
                                            i38 = ((iM55688 ^ i36) * (-18407)) ^ (-1698245600);
                                            i34 = 1159941939;
                                            i39 = iM55688 ^ i34;
                                        } else {
                                            int iM556810 = C0873.m55680("֫֫") ^ i37;
                                            i38 = ((iM556810 ^ i36) * 5927) ^ 195557702;
                                            i39 = iM556810 ^ (-2100260358);
                                            i42 = i43;
                                        }
                                        break;
                                    case -1322805172:
                                    case 1326900917:
                                        int i44 = i32;
                                        if (C1012.f81938 >= 0) {
                                            i41 = i44;
                                            iM55688 = C0873.m55680("֫۫") ^ i37;
                                            i38 = ((iM55688 ^ i36) * (-18407)) ^ (-1698245600);
                                            i34 = 1159941939;
                                            i39 = iM55688 ^ i34;
                                        } else {
                                            int iM556811 = (C0873.m55680("۠֨") + i36) * (-59);
                                            i38 = ((iM556811 ^ i37) * (-7461)) ^ 1592659896;
                                            i39 = iM556811 ^ 30369572;
                                            i41 = i44;
                                        }
                                        break;
                                    case -1156672935:
                                    case 1488098177:
                                        if (C1124.f82007 >= 0) {
                                            iM55688 = (C0873.m55680("ᩳܺ") + i36) * 101;
                                            i38 = ((iM55688 ^ i37) * 15315) ^ (-81979656);
                                            i34 = 988399898;
                                        } else {
                                            iM55688 = C0946.m55979("᩺ۜ") ^ i36;
                                            i38 = ((iM55688 ^ i37) * (-11091)) ^ (-987341063);
                                            i34 = 603458705;
                                        }
                                        i39 = iM55688 ^ i34;
                                        break;
                                    case -954154259:
                                    case -873757224:
                                        C0967.m56074();
                                        break;
                                    case -933495558:
                                    case -714700028:
                                        if (C1028.f81950 <= 0) {
                                            iM55688 = (C0946.m55979("ܰᩳ") ^ i37) * (-13);
                                            i38 = ((iM55688 ^ i36) * 26915) ^ 1918720903;
                                            i34 = 1606070893;
                                        } else {
                                            iM55688 = (C0873.m55680("ᩳܺ") + i36) * 101;
                                            i38 = ((iM55688 ^ i37) * 15315) ^ (-81979656);
                                            i34 = 988399898;
                                        }
                                        i39 = iM55688 ^ i34;
                                        break;
                                    case -847368947:
                                    case 601783315:
                                        if (C1929.f83011 != 0) {
                                            iM55688 = (C0873.m55680("ۨۜ") + i37) * (-39);
                                            i38 = ((iM55688 ^ i36) * 15267) ^ (-864758845);
                                            i34 = -1182923251;
                                        } else {
                                            iM55688 = C0946.m55979("ۢܿ") ^ i37;
                                            i38 = ((iM55688 ^ i36) * 3817) ^ (-1064914423);
                                            i34 = -662131903;
                                        }
                                        i39 = iM55688 ^ i34;
                                        break;
                                    case -628547199:
                                    case 1432965902:
                                        if (C1964.f83032 <= 0) {
                                            iM55688 = (C0873.m55680("ۢ۬") + i36) * (-123);
                                            i38 = ((iM55688 ^ i37) * (-11711)) ^ (-1218697780);
                                            i34 = 231872149;
                                        } else {
                                            iM55688 = C0873.m55680("֨֫") ^ i37;
                                            i38 = ((iM55688 ^ i36) * 28273) ^ (-2003232758);
                                            i34 = 1790063344;
                                        }
                                        i39 = iM55688 ^ i34;
                                        break;
                                    case -431738934:
                                    case 263704153:
                                        ViewOnClickListenerC12568.m28957(viewOnClickListenerC12568, i40, c139213, z9, z10, z7, str15, i41, i42, c13457, z8);
                                        break;
                                    case -406158694:
                                    case 902206541:
                                        if (C1036.f81953 >= 0) {
                                            iM55688 = (C0873.m55680("ۨۜ") + i37) * (-39);
                                            i38 = ((iM55688 ^ i36) * 15267) ^ (-864758845);
                                            i34 = -1182923251;
                                        } else {
                                            iM55688 = C0873.m55680("֨ۖ") ^ i37;
                                            i38 = ((iM55688 ^ i36) * 21621) ^ (-1834356776);
                                            i34 = 913711390;
                                        }
                                        i39 = iM55688 ^ i34;
                                        break;
                                    case 262676979:
                                    case 2136750167:
                                        c139213 = c139212;
                                        boolean z11 = z5;
                                        boolean z12 = z6;
                                        if (C1028.f81950 <= 0) {
                                            z9 = z11;
                                            z10 = z12;
                                            iM55688 = (C0873.m55680("ᩳܺ") + i36) * 101;
                                            i38 = ((iM55688 ^ i37) * 15315) ^ (-81979656);
                                            i34 = 988399898;
                                            i39 = iM55688 ^ i34;
                                        } else {
                                            int iM559713 = C0946.m55979("ܿۧ") ^ i36;
                                            i38 = ((iM559713 ^ i37) * 26043) ^ 116037073;
                                            i39 = iM559713 ^ (-1102582634);
                                            z9 = z11;
                                            z10 = z12;
                                        }
                                        break;
                                    case 263053948:
                                    case 1283956697:
                                        if (C0863.f81833 <= 0) {
                                            iM55688 = (C0873.m55680("ۨۜ") + i37) * (-39);
                                            i38 = ((iM55688 ^ i36) * 15267) ^ (-864758845);
                                            i34 = -1182923251;
                                        } else {
                                            iM55688 = (C0946.m55979("ܰᩳ") ^ i37) * (-13);
                                            i38 = ((iM55688 ^ i36) * 26915) ^ 1918720903;
                                            i34 = 1606070893;
                                        }
                                        i39 = iM55688 ^ i34;
                                        break;
                                    case 470100055:
                                    case 1441821365:
                                        if (C1929.m56553()) {
                                            iM55688 = C0873.m55680("֫۫") ^ i37;
                                            i38 = ((iM55688 ^ i36) * (-18407)) ^ (-1698245600);
                                            i34 = 1159941939;
                                        } else {
                                            iM55688 = (C0946.m55979("ۤܿ") + i37) * 45;
                                            i38 = ((iM55688 ^ i36) * (-27863)) ^ 988519250;
                                            i34 = 1863867832;
                                        }
                                        i39 = iM55688 ^ i34;
                                        break;
                                    default:
                                        if (C1025.m56230()) {
                                            iM55688 = C0873.m55680("֫۫") ^ i37;
                                            i38 = ((iM55688 ^ i36) * (-18407)) ^ (-1698245600);
                                            i34 = 1159941939;
                                        } else {
                                            iM55688 = (C0873.m55680("ۛ᩻") + i36) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i38 = ((iM55688 ^ i37) * 5665) ^ 1804398199;
                                            i34 = 1119267088;
                                        }
                                        i39 = iM55688 ^ i34;
                                        break;
                                }
                                return;
                            }
                        }

                        @Override // p067l.InterfaceC14577
                        /* JADX INFO: renamed from: ֫ */
                        public final /* synthetic */ boolean mo6050(Exception exc3) {
                            return false;
                        }

                        {
                            int i34 = 1070927198;
                            int i35 = C1036.f81953;
                            int i36 = C0967.f81910;
                            int iM55688 = C0873.m55680("ۖ۫") ^ i36;
                            int i37 = ((iM55688 ^ i35) * (-30723)) ^ 261862154;
                            int i38 = 1707099381;
                            while (true) {
                                i34 = ((((i34 ^ i35) * 7585) >> 31) & i37) ^ (iM55688 ^ i38);
                                switch (i34) {
                                    case -1931005138:
                                    case 439066390:
                                        C1012.m56134();
                                        C0854.m55595();
                                        iM55688 = (C0946.m55979("ᩴۡ") ^ i35) * (-125);
                                        i37 = ((iM55688 ^ i36) * 21053) ^ 609002002;
                                        i38 = 2096964373;
                                        break;
                                    case -1924784768:
                                    case 1774956419:
                                        if (C1964.f83032 <= 0) {
                                            iM55688 = C0873.m55680("ܳ۟") ^ i36;
                                            i37 = ((iM55688 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        } else {
                                            iM55688 = (C0946.m55979("ᩴۡ") ^ i35) * (-125);
                                            i37 = ((iM55688 ^ i36) * 21053) ^ 609002002;
                                            i38 = 2096964373;
                                        }
                                        break;
                                    case -1496391301:
                                    case 179210897:
                                        if (C1194.f82045 != 0) {
                                            iM55688 = (C0946.m55979("֫᩻") ^ i35) * (-43);
                                            i37 = ((iM55688 ^ i36) * 19705) ^ (-14115107);
                                            i38 = 1217074162;
                                        } else {
                                            iM55688 = (i36 - C0873.m55680("᩸۬")) * (-59);
                                            i37 = ((iM55688 ^ i35) * (-21079)) ^ (-631723634);
                                            i38 = -314254051;
                                        }
                                        break;
                                    case -1448002691:
                                    case -593250030:
                                        if (C0927.f81875) {
                                            iM55688 = (C0946.m55979("ᩴۡ") ^ i35) * (-125);
                                            i37 = ((iM55688 ^ i36) * 21053) ^ 609002002;
                                            i38 = 2096964373;
                                        } else {
                                            iM55688 = C0873.m55680("ۙ᩺") ^ i36;
                                            i37 = ((iM55688 ^ i35) * (-29029)) ^ (-2013719412);
                                            i38 = -1908022364;
                                        }
                                        break;
                                    case -1312877672:
                                    case 604339689:
                                        return;
                                    case -1252508694:
                                    case 767905273:
                                        if (C0898.f81858 <= 0) {
                                            iM55688 = C0873.m55680("ܳ۟") ^ i36;
                                            i37 = ((iM55688 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        } else {
                                            iM55688 = (C0946.m55979("ܶ۫") + i35) * 33;
                                            i37 = ((iM55688 ^ i36) * 31691) ^ 568071890;
                                            i38 = -1411538626;
                                        }
                                        break;
                                    case -1233459398:
                                    case -295414156:
                                        this.f33222 = this;
                                        if (C0917.f81868) {
                                            iM55688 = (C0946.m55979("ᩴۡ") ^ i35) * (-125);
                                            i37 = ((iM55688 ^ i36) * 21053) ^ 609002002;
                                            i38 = 2096964373;
                                        } else {
                                            iM55688 = C0873.m55680("۠۟") ^ i36;
                                            i37 = ((iM55688 ^ i35) * 5367) ^ 1736098881;
                                            i38 = -1503568302;
                                        }
                                        break;
                                    case -1178024253:
                                    case 1814227623:
                                        if (C1124.f82007 >= 0) {
                                            iM55688 = (C0946.m55979("֫᩻") ^ i35) * (-43);
                                            i37 = ((iM55688 ^ i36) * 19705) ^ (-14115107);
                                            i38 = 1217074162;
                                        } else {
                                            iM55688 = (i35 - C0873.m55680("۠ᩳ")) * (-89);
                                            i37 = ((iM55688 ^ i36) * (-32305)) ^ (-917171991);
                                            i38 = 317339571;
                                        }
                                        break;
                                    case -909763956:
                                    case 290795679:
                                        C0946.m55980();
                                        if (C1036.m56257() > 0) {
                                            iM55688 = C0873.m55680("ܳ۟") ^ i36;
                                            i37 = ((iM55688 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        } else {
                                            iM55688 = C0873.m55680("᩻ۛ") ^ i36;
                                            i37 = ((iM55688 ^ i35) * (-18369)) ^ 1667887292;
                                            i38 = 115469844;
                                        }
                                        break;
                                    case -710372442:
                                    case 932154853:
                                        if (C1124.m56367() >= 0) {
                                            iM55688 = (C0873.m55680("᩶ۡ") + i35) * 93;
                                            i37 = ((iM55688 ^ i36) * (-25051)) ^ (-674444041);
                                            i38 = 678907596;
                                        } else {
                                            iM55688 = (C0873.m55680("ܰ᩻") + i35) * 61;
                                            i37 = ((iM55688 ^ i36) * 31025) ^ (-963674978);
                                            i38 = -1567254373;
                                        }
                                        break;
                                    case -602545044:
                                    case 1756904692:
                                        if (C1048.f81963) {
                                            iM55688 = C0873.m55680("ۜۨ") ^ i36;
                                            i37 = ((iM55688 ^ i35) * 30979) ^ 631876099;
                                            i38 = 845993243;
                                        } else {
                                            iM55688 = C0873.m55680("ܳ۟") ^ i36;
                                            i37 = ((iM55688 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        }
                                        break;
                                    case 538347369:
                                    case 1204371961:
                                        if (C1404.m56468()) {
                                            iM55688 = (C0873.m55680("۫ܿ") ^ i36) * 7;
                                            i37 = ((iM55688 ^ i35) * (-24123)) ^ 1742628490;
                                            i38 = -420277051;
                                        } else {
                                            iM55688 = (C0946.m55979("ᩴۡ") ^ i35) * (-125);
                                            i37 = ((iM55688 ^ i36) * 21053) ^ 609002002;
                                            i38 = 2096964373;
                                        }
                                        break;
                                    case 946665981:
                                    case 1132852515:
                                        C0946.m55980();
                                        throw new RuntimeException();
                                    case 1015043453:
                                    case 1836761294:
                                        if (C0882.m55710() != 0) {
                                            iM55688 = (C0946.m55979("֫᩻") ^ i35) * (-43);
                                            i37 = ((iM55688 ^ i36) * 19705) ^ (-14115107);
                                            i38 = 1217074162;
                                        } else {
                                            iM55688 = C0946.m55979("᩺֡") ^ i35;
                                            i37 = ((iM55688 ^ i36) * (-22897)) ^ 1130842955;
                                            i38 = -1025154661;
                                        }
                                        break;
                                    case 1103769939:
                                    case 2134656571:
                                        if (C0873.f81841 <= 0) {
                                            iM55688 = (C0873.m55680("᩶ۡ") + i35) * 93;
                                            i37 = ((iM55688 ^ i36) * (-25051)) ^ (-674444041);
                                            i38 = 678907596;
                                        } else {
                                            iM55688 = C0873.m55680("ܳ۟") ^ i36;
                                            i37 = ((iM55688 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        }
                                        break;
                                    default:
                                        if (C0877.m55696()) {
                                            iM55688 = C0946.m55979("ۙ֡") ^ i35;
                                            i37 = ((iM55688 ^ i36) * 4239) ^ 429744631;
                                            i38 = -1591034364;
                                        } else {
                                            iM55688 = (C0873.m55680("᩶ۡ") + i35) * 93;
                                            i37 = ((iM55688 ^ i36) * (-25051)) ^ (-674444041);
                                            i38 = 678907596;
                                        }
                                        break;
                                }
                            }
                        }
                    }, mainM56560, this.f35309);
                    break;
                case -360583079:
                case 1793445900:
                    str12 = str12;
                    c71710 = c71710;
                    zM56014 = zM56014;
                    z3 = z3;
                    str9 = str9;
                    strM56227 = strM56227;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    short s = f82137[166];
                    int i34 = 55424 * s;
                    int i35 = s + 13856;
                    if ((i35 * i35) - i34 < 0) {
                        iM559710 = (C0946.m55979("᩶ۜ") ^ i19) * (-19);
                        i6 = ((iM559710 ^ i18) * 18257) ^ 1248915928;
                        i7 = 2034546104;
                    } else {
                        iM559710 = C0946.m55979("ܳ֡") ^ i18;
                        i6 = ((iM559710 ^ i19) * 499) ^ 611380105;
                        i7 = 95160086;
                    }
                    int i214 = iM559710 ^ i7;
                    strM56227 = strM56227;
                    z3 = z3;
                    zM56014 = zM56014;
                    str12 = str12;
                    c71710 = c71710;
                    i21 = i214;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -216345739:
                case 1996696607:
                    iM559610 = C11774.m27008(strM56135);
                    iM55969 = iM27008;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    i16 = iM559610;
                    i15 = iM55969;
                    str6 = str10;
                    c13929 = c139211;
                    iM55680 = C0946.m55979("᩷۬") ^ i19;
                    i2 = ((iM55680 ^ i18) * (-14939)) ^ 1270560680;
                    i3 = 863511363;
                    i21 = iM55680 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM56014 = zM56014;
                    break;
                case -140492350:
                case 1807982965:
                    if (!C11774.m27012(C1012.m56135(str10, i23))) {
                        c71710 = c71710;
                        zM56014 = zM56014;
                        str9 = str9;
                        z2 = z2;
                        str8 = str8;
                        str7 = str7;
                        iM55680 = C0873.m55680("ۜ᩻") ^ i18;
                        i2 = ((iM55680 ^ i19) * (-7977)) ^ 818047213;
                        i3 = 1410551334;
                        i21 = iM55680 ^ i3;
                        i20 = i2;
                        str7 = str7;
                        c71710 = c71710;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        zM56014 = zM56014;
                    } else {
                        int iM55688 = C0873.m55680("ۧ᩷") ^ i18;
                        zM56014 = zM56014;
                        i = ((iM55688 ^ i19) * 6691) ^ 1809117520;
                        i21 = iM55688 ^ 1439041687;
                        i20 = i;
                        zM56014 = zM56014;
                    }
                    break;
                case -104147723:
                case 852158940:
                    C1025.m56228(C1046.m56289(C1044.m56275(C0873.m55680(C0898.m55792(f82137, 214, 3, i22)) ^ 2127814375), str9));
                    C0927.m55877(c71710);
                    break;
                case -95189465:
                case 100981650:
                    str12 = str12;
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    strM56227 = strM56227;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (!zM55695) {
                        strM56227 = str10;
                        int iM55689 = (C0873.m55680("ۡ֡") ^ i19) * (-25);
                        c71710 = c71710;
                        zM56014 = zM56014;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        String str16 = str12;
                        i21 = iM55689 ^ (-1356097630);
                        i20 = ((iM55689 ^ i18) * 30247) ^ (-1071745451);
                        str12 = str16;
                    } else {
                        iM55681 = (C0946.m55979("ۜ᩸") ^ i18) * 19;
                        i8 = ((iM55681 ^ i19) * (-22019)) ^ 1017933395;
                        i9 = -158057407;
                        int i215 = iM55681 ^ i9;
                        strM56227 = strM56227;
                        zM56014 = zM56014;
                        str12 = str12;
                        str10 = str10;
                        i21 = i215;
                        i20 = i8;
                        str7 = str7;
                        c71710 = c71710;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case -64713075:
                case 832837313:
                    str2 = str12;
                    c71710 = c71710;
                    str3 = str10;
                    zM56014 = zM56014;
                    z2 = z2;
                    str8 = str8;
                    str4 = strM56227;
                    String strM56029 = C0955.m56029(f82137, 180, 1, i22);
                    boolean zM56404 = C1229.m56404(str8, strM56029);
                    str7 = strM56029;
                    strM56318 = C1048.m56318(f82137, 181, 24, i22);
                    if (zM56404) {
                        iM55682 = C0946.m55979("ᩴۗ") ^ i18;
                        i11 = ((iM55682 ^ i19) * 14065) ^ (-693597748);
                        i12 = -2137928827;
                    } else {
                        iM55682 = (C0873.m55680("ᩳۤ") ^ i19) * (-103);
                        i11 = ((iM55682 ^ i18) * (-26441)) ^ 584296304;
                        i12 = 1068875967;
                    }
                    int i36 = iM55682 ^ i12;
                    strM56227 = str4;
                    zM56014 = zM56014;
                    str12 = str2;
                    i21 = i36;
                    c71710 = c71710;
                    boolean z8 = z2;
                    str9 = strM56318;
                    i20 = i11;
                    str10 = str3;
                    str7 = str7;
                    str8 = str8;
                    z2 = z8;
                    break;
                case 84032557:
                case 1926550672:
                    str12 = str12;
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    strM56227 = strM56227;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    iM55685 = C0873.m55680(C0930.m55893(f82137, 173, 3, i22)) ^ 2102884404;
                    iM55681 = (i19 - C0873.m55680("ۡܿ")) * 123;
                    i8 = ((iM55681 ^ i18) * 29399) ^ 1190373993;
                    i9 = 1730219029;
                    int i216 = iM55681 ^ i9;
                    strM56227 = strM56227;
                    zM56014 = zM56014;
                    str12 = str12;
                    str10 = str10;
                    i21 = i216;
                    i20 = i8;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case 185231789:
                case 1148076255:
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    try {
                        try {
                            iM55969 = AbstractC0942.m55969(str8);
                            iM559610 = AbstractC0942.m55969(str10);
                            i16 = iM559610;
                            i15 = iM55969;
                            str6 = str10;
                            c13929 = c139211;
                            iM55680 = C0946.m55979("᩷۬") ^ i19;
                            i2 = ((iM55680 ^ i18) * (-14939)) ^ 1270560680;
                            i3 = 863511363;
                        } catch (NumberFormatException unused) {
                            iM55680 = (C0946.m55979("ۘ᩷") ^ i19) * (-85);
                            i2 = ((iM55680 ^ i18) * 12667) ^ 675285318;
                            i3 = -2082523386;
                        }
                    } catch (NumberFormatException unused2) {
                        iM55680 = (i18 - C0873.m55680("ۢۚ")) * 83;
                        i2 = ((iM55680 ^ i19) * 17867) ^ 375845515;
                        i3 = 1964419006;
                    }
                    i21 = iM55680 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM56014 = zM56014;
                    break;
                case 444004462:
                case 1219269768:
                    if (!C1229.m56404(str10, str12)) {
                        strM56135 = str10;
                        iM55683 = (i18 - C0873.m55680("ܽ᩶")) * (-121);
                        i13 = ((iM55683 ^ i19) * (-28827)) ^ (-2044872141);
                        i14 = 821733968;
                        i21 = iM55683 ^ i14;
                        i20 = i13;
                    } else {
                        zM56014 = zM56014;
                        str9 = str9;
                        z2 = z2;
                        iM55979 = C0946.m55979("᩺֡") ^ i18;
                        i4 = ((iM55979 ^ i19) * 19007) ^ 1778497627;
                        i5 = 586909330;
                        i21 = iM55979 ^ i5;
                        i20 = i4;
                        z2 = z2;
                        str9 = str9;
                        zM56014 = zM56014;
                    }
                    break;
                case 620640739:
                case 1668655933:
                    i22 = 19340;
                    iM559710 = C0873.m55680("ۘ۫") ^ i18;
                    i6 = ((iM559710 ^ i19) * (-32357)) ^ (-94650951);
                    i7 = 1525417834;
                    int i217 = iM559710 ^ i7;
                    strM56227 = strM56227;
                    z3 = z3;
                    zM56014 = zM56014;
                    str12 = str12;
                    c71710 = c71710;
                    i21 = i217;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case 689233017:
                case 952024636:
                    RunnableC0871.m55671(C1071.m56350(exc));
                    C0927.m55877(c71710);
                    break;
                case 724036224:
                case 1421036346:
                    c71710 = c71710;
                    zM56014 = zM56014;
                    String str17 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    try {
                        str12 = str12;
                        try {
                            try {
                                str9 = str17;
                                try {
                                    str10 = str10;
                                    try {
                                        strM56227 = C1025.m56227(RunnableC0871.m55674(RunnableC0871.m55674(C1025.m56227(C1025.m56227(str10, RunnableC0897.m55783(f82137, 205, 2, i22), C0892.m55750(f82137, 210, 1, i22)), RunnableC0938.m55936(f82137, 331, 2, i22), C1024.m56203(f82137, 333, 1, i22)), C1124.m56373(f82137, 337, 2, i22), C1929.m56558(f82137, 339, 1, i22)), C0967.m56077(f82137, 340, 2, i22), C0930.m55893(f82137, 342, 1, i22)), C1964.m56584(f82137, 343, 2, i22), C1964.m56584(f82137, 345, 1, i22));
                                        int iM556810 = (C0873.m55680("ۡ֡") ^ i19) * (-25);
                                        c71710 = c71710;
                                        zM56014 = zM56014;
                                        str10 = str10;
                                        str7 = str7;
                                        str8 = str8;
                                        z2 = z2;
                                        str9 = str9;
                                        String str18 = str12;
                                        i21 = iM556810 ^ (-1356097630);
                                        i20 = ((iM556810 ^ i18) * 30247) ^ (-1071745451);
                                        str12 = str18;
                                    } catch (Exception e2) {
                                        e = e2;
                                        exc2 = e;
                                        z3 = z3;
                                        strM56227 = strM56227;
                                        iM559710 = (i18 - C0873.m55680("᩻᩹")) * 93;
                                        i6 = ((iM559710 ^ i19) * 10709) ^ (-393780802);
                                        i7 = -736020783;
                                        int i218 = iM559710 ^ i7;
                                        strM56227 = strM56227;
                                        z3 = z3;
                                        zM56014 = zM56014;
                                        str12 = str12;
                                        c71710 = c71710;
                                        i21 = i218;
                                        i20 = i6;
                                        str10 = str10;
                                        str7 = str7;
                                        str8 = str8;
                                        z2 = z2;
                                        str9 = str9;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    str10 = str10;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                str10 = str10;
                                str9 = str17;
                                exc2 = e;
                                z3 = z3;
                                strM56227 = strM56227;
                                iM559710 = (i18 - C0873.m55680("᩻᩹")) * 93;
                                i6 = ((iM559710 ^ i19) * 10709) ^ (-393780802);
                                i7 = -736020783;
                                int i219 = iM559710 ^ i7;
                                strM56227 = strM56227;
                                z3 = z3;
                                zM56014 = zM56014;
                                str12 = str12;
                                c71710 = c71710;
                                i21 = i219;
                                i20 = i6;
                                str10 = str10;
                                str7 = str7;
                                str8 = str8;
                                z2 = z2;
                                str9 = str9;
                                break;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        str12 = str12;
                    }
                    break;
                case 1010144412:
                case 1015954389:
                    String str19 = str12;
                    zM56014 = zM56014;
                    boolean z9 = z3;
                    String str20 = str9;
                    String str21 = str7;
                    String str22 = strM56227;
                    boolean z10 = z2;
                    c7179 = this.f35308;
                    String strM55591 = C0845.m55591(c7179.m16518());
                    C7179 c71711 = this.f35306;
                    String strM55592 = C0845.m55591(c71711.m16518());
                    boolean zM56397 = C1194.m56397(strM55591);
                    DialogInterfaceC2564 dialogInterfaceC2565 = this.f35313;
                    if (zM56397) {
                        int iM559713 = (C0946.m55979("ᩳᩳ") ^ i19) * 35;
                        i20 = ((iM559713 ^ i18) * (-22675)) ^ (-295325090);
                        strM56227 = str22;
                        z3 = z9;
                        c71710 = c71711;
                        str10 = strM55592;
                        dialogInterfaceC2564 = dialogInterfaceC2565;
                        str7 = str21;
                        z2 = z10;
                        str12 = str19;
                        str9 = str20;
                        str8 = strM55591;
                        i21 = iM559713 ^ 2054755644;
                    } else {
                        int iM559714 = C0946.m55979("ۡᩴ") ^ i19;
                        i = ((iM559714 ^ i18) * 30983) ^ 943132053;
                        strM56227 = str22;
                        z3 = z9;
                        c71710 = c71711;
                        str10 = strM55592;
                        dialogInterfaceC2564 = dialogInterfaceC2565;
                        str7 = str21;
                        z2 = z10;
                        str12 = str19;
                        str9 = str20;
                        str8 = strM55591;
                        i21 = iM559714 ^ (-784920992);
                        i20 = i;
                    }
                    zM56014 = zM56014;
                    break;
                case 1293657805:
                case 1396291076:
                    if (C11774.m27014(strM56135)) {
                        iM55683 = C0873.m55680("ܶ۬") ^ i19;
                        i13 = ((iM55683 ^ i18) * (-21303)) ^ (-337173641);
                        i14 = 709671205;
                    } else {
                        iM55683 = (C0873.m55680("۟۫") + i19) * 115;
                        i13 = ((iM55683 ^ i18) * (-19625)) ^ (-724127771);
                        i14 = 1879836634;
                    }
                    i21 = iM55683 ^ i14;
                    i20 = i13;
                    break;
                case 1401667412:
                case 1773801736:
                    str12 = str12;
                    c71710 = c71710;
                    zM56014 = zM56014;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    try {
                        strM56227 = strM56227;
                        try {
                            C15269.m34740(c13929Matcher.pattern(), strM56227);
                            str5 = strM56227;
                            c139210 = c13929Matcher;
                            iM55681 = C0873.m55680("ۨۡ") ^ i19;
                            i8 = ((iM55681 ^ i18) * (-15831)) ^ (-1284239432);
                            i9 = 1135315253;
                        } catch (Exception e7) {
                            e = e7;
                            exc = e;
                            iM55681 = C0873.m55680("ᩳ۫") ^ i18;
                            i8 = ((iM55681 ^ i19) * (-31145)) ^ (-159703192);
                            i9 = 1338945092;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        strM56227 = strM56227;
                    }
                    int i2110 = iM55681 ^ i9;
                    strM56227 = strM56227;
                    zM56014 = zM56014;
                    str12 = str12;
                    str10 = str10;
                    i21 = i2110;
                    i20 = i8;
                    str7 = str7;
                    c71710 = c71710;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                default:
                    C0917.m55842(C0873.m55680(C1404.m56462(f82137, Primes.SMALL_FACTOR_LIMIT, 3, i22)) ^ 2102893899);
                    C0927.m55877(c7179);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x021d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0249 A[PHI: r0 r3 r20
      0x0249: PHI (r0v3 l.ܶ᩵ܿ) = (r0v1 l.ܶ᩵ܿ), (r0v1 l.ܶ᩵ܿ), (r0v2 l.ܶ᩵ܿ), (r0v1 l.ܶ᩵ܿ) binds: [B:66:0x0247, B:54:0x01e2, B:23:0x00ad, B:14:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r3v5 short[]) = (r3v1 short[]), (r3v1 short[]), (r3v4 short[]), (r3v1 short[]) binds: [B:66:0x0247, B:54:0x01e2, B:23:0x00ad, B:14:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r20v3 l.ܶ᩵ܿ) = (r20v1 l.ܶ᩵ܿ), (r20v1 l.ܶ᩵ܿ), (r20v2 l.ܶ᩵ܿ), (r20v1 l.ܶ᩵ܿ) binds: [B:66:0x0247, B:54:0x01e2, B:23:0x00ad, B:14:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m28957(ViewOnClickListenerC12568 viewOnClickListenerC12568, int i, C13929 c13929, boolean z, boolean z2, boolean z3, String str, int i2, int i3, C13457 c13457, boolean z4) {
        int iM55680;
        int i4;
        AbstractC17043 abstractC17043 = null;
        int i5 = 0;
        short[] sArr = null;
        int iM55938 = 0;
        int i6 = 852338933;
        int i7 = C1025.f81947;
        int i8 = C1044.f81959;
        int iM55979 = C0946.m55979("ۘ᩺") ^ i8;
        int i9 = ((iM55979 ^ i7) * 11845) ^ (-826332150);
        int i10 = iM55979 ^ 1399314034;
        AbstractC17043 abstractC17043M38649 = null;
        while (true) {
            i6 = i10 ^ ((((i6 ^ i7) * 13755) >> 31) & i9);
            switch (i6) {
                case -1936222303:
                case 1533657369:
                    i5 = 25290;
                    iM55680 = (C0946.m55979("ܶۛ") ^ i8) * (-31);
                    i9 = ((iM55680 ^ i7) * (-21213)) ^ 1880877547;
                    i4 = -2045852257;
                    i10 = iM55680 ^ i4;
                    break;
                case -1817677242:
                case 1652653328:
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0946.m55979("ܶܰ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-15887)) ^ (-274897967);
                        i4 = 572306739;
                    } else {
                        iM55680 = (i8 - C0946.m55979("ۜۙ")) * (-55);
                        i9 = ((iM55680 ^ i7) * (-7337)) ^ (-1749193630);
                        i4 = -706951230;
                    }
                    i10 = iM55680 ^ i4;
                    break;
                case -1663946498:
                case -1655683418:
                    C1044.m56286();
                    if (C1036.f81953 < 0) {
                        iM55680 = C0946.m55979("ܶܰ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-15887)) ^ (-274897967);
                        i4 = 572306739;
                        i10 = iM55680 ^ i4;
                    }
                    iM55680 = C0946.m55979("ܿ۬") ^ i7;
                    i9 = ((iM55680 ^ i8) * (-1421)) ^ (-270755155);
                    i4 = -1221944263;
                    i10 = iM55680 ^ i4;
                    break;
                case -1438170543:
                case 473434655:
                    AbstractC0942.m55971();
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0873.m55680("ܳ֫") + i7) * 43;
                        i9 = ((iM55680 ^ i8) * (-21219)) ^ (-748036969);
                        i4 = -180776403;
                        i10 = iM55680 ^ i4;
                    }
                    iM55680 = C0946.m55979("ܿ۬") ^ i7;
                    i9 = ((iM55680 ^ i8) * (-1421)) ^ (-270755155);
                    i4 = -1221944263;
                    i10 = iM55680 ^ i4;
                    break;
                case -1118855239:
                case -86784638:
                    abstractC17043 = viewOnClickListenerC12568.f35312;
                    abstractC17043M38649 = abstractC17043.m38649(C0917.m55852(f82137, 158, 4, i5));
                    sArr = f82137;
                    if (C1025.m56230()) {
                        iM55680 = (C0873.m55680("ܳ֫") + i7) * 43;
                        i9 = ((iM55680 ^ i8) * (-21219)) ^ (-748036969);
                        i4 = -180776403;
                    } else {
                        iM55680 = C0946.m55979("ܰ᩶") ^ i7;
                        i9 = ((iM55680 ^ i8) * 30869) ^ 328659225;
                        i4 = 1341982842;
                    }
                    i10 = iM55680 ^ i4;
                    break;
                case -1014507786:
                case 344754005:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0946.m55979("ܶܰ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-15887)) ^ (-274897967);
                        i4 = 572306739;
                    } else {
                        iM55680 = (i7 - C0946.m55979("۫ۘ")) * (-73);
                        i9 = ((iM55680 ^ i8) * 20693) ^ (-19034087);
                        i4 = 479642772;
                    }
                    i10 = iM55680 ^ i4;
                    break;
                case -999743547:
                case -477099428:
                    if (C0967.f81910 >= 0) {
                        iM55680 = (C0873.m55680("ܳ֫") + i7) * 43;
                        i9 = ((iM55680 ^ i8) * (-21219)) ^ (-748036969);
                        i4 = -180776403;
                    } else {
                        iM55680 = C0873.m55680("۫ᩴ") ^ i7;
                        i9 = ((iM55680 ^ i8) * 5073) ^ (-1223808822);
                        i4 = -1777972204;
                    }
                    i10 = iM55680 ^ i4;
                    break;
                case -893209734:
                case -447339053:
                    short s = f82137[157];
                    int i11 = (s * 2) + 1;
                    int i12 = s + 1;
                    if ((i12 * i12) - i11 < 0) {
                        iM55680 = C0946.m55979("ܺ۟") ^ i7;
                        i9 = ((iM55680 ^ i8) * 10355) ^ 603337782;
                        i4 = -1541525910;
                    } else {
                        iM55680 = C0873.m55680("᩹᩶") ^ i8;
                        i9 = ((iM55680 ^ i7) * 4461) ^ (-751420752);
                        i4 = 80726372;
                    }
                    i10 = iM55680 ^ i4;
                    break;
                case -789496075:
                case 1495141108:
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0946.m55979("ܿ۬") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-1421)) ^ (-270755155);
                        i4 = -1221944263;
                    } else {
                        iM55680 = C0946.m55979("ۢۘ") ^ i7;
                        i9 = ((iM55680 ^ i8) * 10345) ^ 9271379;
                        i4 = 148592382;
                    }
                    i10 = iM55680 ^ i4;
                    break;
                case -762769715:
                case 152186960:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0946.m55979("ܿ۬") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-1421)) ^ (-270755155);
                        i4 = -1221944263;
                    } else {
                        iM55680 = (i7 - C0946.m55979("ۘۛ")) * 83;
                        i9 = ((iM55680 ^ i8) * (-19901)) ^ (-294026229);
                        i4 = -2083143141;
                    }
                    i10 = iM55680 ^ i4;
                    break;
                case -616814328:
                case 790562225:
                    iM55938 = RunnableC0938.m55938();
                    iM55680 = (C0873.m55680("ۗ᩶") ^ i7) * (-103);
                    i9 = ((iM55680 ^ i8) * (-18911)) ^ (-2016992199);
                    i4 = -265239183;
                    i10 = iM55680 ^ i4;
                    break;
                case -405958342:
                case -166180386:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("ܿ۬") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-1421)) ^ (-270755155);
                        i4 = -1221944263;
                        i10 = iM55680 ^ i4;
                    } else {
                        int iM55681 = (C0873.m55680("ܶۜ") ^ i8) * (-53);
                        i9 = (-674708035) ^ ((iM55681 ^ i7) * (-32139));
                        i10 = (-1699444762) ^ iM55681;
                    }
                    break;
                case -133709360:
                case 1839929651:
                    if (iM55938 != 0) {
                        iM55680 = (C0873.m55680("ܳ֫") + i7) * 43;
                        i9 = ((iM55680 ^ i8) * (-21219)) ^ (-748036969);
                        i4 = -180776403;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ᩸") + i8) * (-13);
                        i9 = ((iM55680 ^ i7) * (-21489)) ^ (-280214547);
                        i4 = 709893493;
                    }
                    i10 = iM55680 ^ i4;
                    break;
                case -61060315:
                case 1693472333:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0873.m55680("ܰۘ") + i8) * (-13);
                        i9 = ((iM55680 ^ i7) * (-26747)) ^ (-1618732807);
                        i4 = -1912330202;
                    } else {
                        iM55680 = (i8 - C0946.m55979("ܽۨ")) * 109;
                        i9 = ((iM55680 ^ i7) * 29105) ^ 586540557;
                        i4 = -995709581;
                    }
                    i10 = iM55680 ^ i4;
                    break;
                case 202514980:
                case 1352206690:
                    i5 = 37993;
                    iM55680 = (C0946.m55979("ܶۛ") ^ i8) * (-31);
                    i9 = ((iM55680 ^ i7) * (-21213)) ^ 1880877547;
                    i4 = -2045852257;
                    i10 = iM55680 ^ i4;
                    break;
                case 336051553:
                case 1631753649:
                    if (C1053.m56327() >= 0) {
                        iM55680 = C0946.m55979("ܿ۬") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-1421)) ^ (-270755155);
                        i4 = -1221944263;
                    } else {
                        iM55680 = (C0946.m55979("۟ܽ") ^ i8) * 23;
                        i9 = ((iM55680 ^ i7) * 10677) ^ (-1977829744);
                        i4 = 1421080831;
                    }
                    i10 = iM55680 ^ i4;
                    break;
                case 886761961:
                case 962920850:
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0946.m55979("ܿ۬") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-1421)) ^ (-270755155);
                        i4 = -1221944263;
                    } else {
                        iM55680 = (C0946.m55979("ۢ֨") ^ i8) * 91;
                        i9 = ((iM55680 ^ i7) * (-8307)) ^ (-177018042);
                        i4 = 1907567802;
                    }
                    i10 = iM55680 ^ i4;
                    break;
                case 1106220892:
                case 1135458905:
                    C1404.m56468();
                    break;
                case 1184744834:
                case 1581331020:
                    C1044.m56286();
                    iM55680 = C0946.m55979("ܿ۬") ^ i7;
                    i9 = ((iM55680 ^ i8) * (-1421)) ^ (-270755155);
                    i4 = -1221944263;
                    i10 = iM55680 ^ i4;
                    break;
                default:
                    C0890.m55729(new C9254(viewOnClickListenerC12568, abstractC17043.m38678(C0927.m55863(sArr, 162, 4, i5)), c13457, z4, i, c13929, z, z2, str, i2, i3, abstractC17043M38649, z3));
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x03fe A[PHI: r7 r8 r18
      0x03fe: PHI (r7v3 android.widget.CheckBox) = (r7v2 android.widget.CheckBox), (r7v4 android.widget.CheckBox) binds: [B:106:0x03fc, B:57:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r8v3 android.widget.CheckBox) = (r8v2 android.widget.CheckBox), (r8v4 android.widget.CheckBox) binds: [B:106:0x03fc, B:57:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r18v20 int) = (r18v3 int), (r18v21 int) binds: [B:106:0x03fc, B:57:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x042d A[PHI: r18
      0x042d: PHI (r18v37 int) = (r18v2 int), (r18v4 int), (r18v9 int), (r18v38 int) binds: [B:110:0x042b, B:102:0x03dc, B:82:0x02f1, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0149 A[PHI: r18
      0x0149: PHI (r18v32 int) = (r18v27 int), (r18v33 int) binds: [B:42:0x0130, B:33:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x026e A[PHI: r18
      0x026e: PHI (r18v18 int) = (r18v14 int), (r18v19 int) binds: [B:68:0x0257, B:61:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02d8 A[PHI: r3 r4 r18
      0x02d8: PHI (r3v4 int) = (r3v3 int), (r3v2 int) binds: [B:78:0x02c1, B:72:0x0288] A[DONT_GENERATE, DONT_INLINE]
      0x02d8: PHI (r4v4 int) = (r4v3 int), (r4v2 int) binds: [B:78:0x02c1, B:72:0x0288] A[DONT_GENERATE, DONT_INLINE]
      0x02d8: PHI (r18v12 int) = (r18v10 int), (r18v13 int) binds: [B:78:0x02c1, B:72:0x0288] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0346 A[PHI: r18
      0x0346: PHI (r18v35 int) = (r18v7 int), (r18v34 int), (r18v36 int) binds: [B:90:0x0344, B:29:0x00c1, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0376 A[PHI: r18
      0x0376: PHI (r18v45 int) = (r18v6 int), (r18v36 int), (r18v38 int), (r18v46 int) binds: [B:94:0x0374, B:27:0x00bd, B:24:0x00b5, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        if (p067l.C1048.m56305() >= 0) goto L10;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int iM55979;
        int i2;
        int i3;
        int i4 = C1012.f81938;
        int i5 = C0967.f81910;
        int iM559710 = (i5 - C0946.m55979("ۧۢ")) * (-91);
        int i6 = ((iM559710 ^ i4) * 27007) ^ 1098021652;
        CheckBox checkBox = null;
        int i7 = iM559710 ^ (-391246628);
        int i8 = 0;
        int i9 = 0;
        boolean z = false;
        int i10 = 0;
        int i11 = 1973743240;
        CheckBox checkBox2 = null;
        CheckBox checkBox3 = null;
        CheckBox checkBox4 = null;
        CheckBox checkBox5 = null;
        boolean z2 = false;
        while (true) {
            int i12 = i7 ^ (i6 & (((i11 ^ i4) * 9561) >> 31));
            switch (i12) {
                case -1920116459:
                case -1471839918:
                    i12 = i12;
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0873.m55680("᩻ܽ") + i5) * (-59);
                        i2 = ((iM55979 ^ i4) * 24453) ^ (-524642527);
                        i3 = 1599146448;
                    } else {
                        iM55979 = (C0873.m55680("ۨܳ") + i4) * 119;
                        i2 = ((iM55979 ^ i5) * 1355) ^ (-125885863);
                        i3 = 445040380;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1894256354:
                case 560784961:
                    i12 = i12;
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0873.m55680("᩵ۙ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-10105)) ^ (-1104917036);
                        i3 = -1110780044;
                    } else {
                        iM55979 = C0873.m55680("ܶ᩸") ^ i4;
                        i2 = ((iM55979 ^ i5) * 25711) ^ 512155055;
                        i3 = -949687277;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1808648139:
                case 1514324096:
                    i12 = i12;
                    if (i != 3) {
                        iM55979 = C0946.m55979("ۗۨ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-26385)) ^ 121317544;
                        i3 = -41929068;
                    } else {
                        iM55979 = (C0873.m55680("᩻֫") ^ i4) * 127;
                        i2 = ((iM55979 ^ i5) * (-9281)) ^ (-998177885);
                        i3 = 1724493946;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1716752838:
                case 1982080049:
                    i12 = i12;
                    if (i != 4) {
                        iM55979 = (C0946.m55979("ۙ۫") + i5) * (-25);
                        i2 = ((iM55979 ^ i4) * (-29559)) ^ 1767553372;
                        i3 = -1404757643;
                    } else {
                        iM55979 = C0873.m55680("ۚ֡") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-27431)) ^ 266805500;
                        i3 = -1235225699;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1620717125:
                case -434991648:
                    C1024.m56209();
                    if (C1964.m56597() != 0) {
                        i12 = i12;
                        iM55979 = (i4 - C0873.m55680("ܿۘ")) * (-49);
                        i2 = ((iM55979 ^ i5) * 3741) ^ 1907768789;
                        i3 = -1139130292;
                    } else {
                        iM55979 = (C0946.m55979("᩵ܽ") ^ i4) * 93;
                        i12 = i12;
                        i2 = ((iM55979 ^ i5) * (-29931)) ^ (-1601756468);
                        i3 = -192515813;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1551180361:
                case 1480389379:
                    i12 = i12;
                    if (C0955.f81898) {
                        iM55979 = C0873.m55680("᩵ۙ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-10105)) ^ (-1104917036);
                        i3 = -1110780044;
                    } else {
                        iM55979 = (C0946.m55979("ۘܶ") ^ i5) * (-37);
                        i2 = ((iM55979 ^ i4) * (-5797)) ^ (-1716870617);
                        i3 = 490130342;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1515675903:
                case 1142618598:
                    C0863.m55643();
                    if (RunnableC0871.f81839 >= 0) {
                        i12 = i12;
                        iM55979 = (C0873.m55680("ۨܳ") + i4) * 119;
                        i2 = ((iM55979 ^ i5) * 1355) ^ (-125885863);
                        i3 = 445040380;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                        i11 = i12;
                    }
                    i12 = i12;
                    iM55979 = C0873.m55680("ۜܿ") ^ i5;
                    i2 = ((iM55979 ^ i4) * 16791) ^ (-987993966);
                    i3 = 348242444;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1444502470:
                case -1393044111:
                    i12 = i12;
                    C0898.m55802(checkBox, i9);
                    C0898.m55802(checkBox2, i9);
                    C1028.m56238(checkBox4, i9);
                    C1028.m56238(checkBox3, i10);
                    C0898.m55802(checkBox5, i10);
                    iM55979 = (C0946.m55979("ۙ۫") + i5) * (-25);
                    i2 = ((iM55979 ^ i4) * (-29559)) ^ 1767553372;
                    i3 = -1404757643;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1400722381:
                case 1039894107:
                    i12 = i12;
                    if (C0863.f81833 > 0) {
                        iM55979 = (i4 - C0873.m55680("ܿۘ")) * (-49);
                        i2 = ((iM55979 ^ i5) * 3741) ^ 1907768789;
                        i3 = -1139130292;
                    } else {
                        iM55979 = C0873.m55680("᩵ۙ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-10105)) ^ (-1104917036);
                        i3 = -1110780044;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1358463747:
                case 361911559:
                    i12 = i12;
                    if (i == i8) {
                        iM55979 = C0873.m55680("ۜܶ") ^ i5;
                        i2 = ((iM55979 ^ i4) * 22511) ^ 2134747872;
                        i3 = -1095842699;
                    } else {
                        iM55979 = (C0873.m55680("֫۫") ^ i5) * 11;
                        i2 = ((iM55979 ^ i4) * 15851) ^ 1632699579;
                        i3 = 255404141;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1336882638:
                case -761782411:
                    i12 = i12;
                    C0898.m55802(checkBox, i10);
                    C1028.m56238(checkBox2, i10);
                    C1028.m56238(checkBox3, i10);
                    C1028.m56238(checkBox4, i10);
                    C0898.m55802(checkBox5, i10);
                    iM55979 = (C0946.m55979("ۙ۫") + i5) * (-25);
                    i2 = ((iM55979 ^ i4) * (-29559)) ^ 1767553372;
                    i3 = -1404757643;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1273673951:
                case 1319602846:
                    i12 = i12;
                    if (C1071.f81975 <= 0) {
                        iM55979 = (i5 - C0946.m55979("ۖ᩻")) * (-19);
                        i2 = ((iM55979 ^ i4) * 28795) ^ 1737768334;
                        i3 = 125717570;
                    } else {
                        iM55979 = (C0946.m55979("۫۬") ^ i5) * 49;
                        i2 = ((iM55979 ^ i4) * (-5571)) ^ 1135487311;
                        i3 = -838075493;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1242266198:
                case -398132006:
                    if (C0894.m55769() >= 0) {
                        i12 = i12;
                        iM55979 = (i5 - C0946.m55979("ۖ᩻")) * (-19);
                        i2 = ((iM55979 ^ i4) * 28795) ^ 1737768334;
                        i3 = 125717570;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                        i11 = i12;
                    }
                    i12 = i12;
                    iM55979 = (i4 - C0873.m55680("ܿۘ")) * (-49);
                    i2 = ((iM55979 ^ i5) * 3741) ^ 1907768789;
                    i3 = -1139130292;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1186147983:
                case -450271306:
                    i12 = i12;
                    if (C0898.f81858 <= 0) {
                        iM55979 = (i4 - C0873.m55680("ܿۘ")) * (-49);
                        i2 = ((iM55979 ^ i5) * 3741) ^ 1907768789;
                        i3 = -1139130292;
                    } else {
                        iM55979 = (i5 - C0946.m55979("᩻ᩳ")) * 65;
                        i2 = ((iM55979 ^ i4) * 11529) ^ (-480681412);
                        i3 = -2058349932;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1130320773:
                case 911997833:
                    break;
                case -963317340:
                case 977546880:
                    i12 = i12;
                    this.f35306.m16511(z2);
                    checkBox5 = this.f35314;
                    checkBox4 = this.f35304;
                    if (C0937.m55918() >= 0) {
                        iM55979 = C0946.m55979("᩷᩵") ^ i4;
                        i2 = ((iM55979 ^ i5) * 29375) ^ (-1118566738);
                        i3 = 14913628;
                    } else {
                        iM55979 = (i5 - C0873.m55680("֨ۚ")) * (-39);
                        i2 = ((iM55979 ^ i4) * 14583) ^ 1312038694;
                        i3 = -832593453;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -926796019:
                case 55276210:
                    i12 = i12;
                    C0898.m55802(checkBox, i10);
                    C1028.m56238(checkBox2, i10);
                    C1028.m56238(checkBox3, i9);
                    C0898.m55802(checkBox4, i10);
                    C0898.m55802(checkBox5, i10);
                    iM55979 = (C0946.m55979("ۙ۫") + i5) * (-25);
                    i2 = ((iM55979 ^ i4) * (-29559)) ^ 1767553372;
                    i3 = -1404757643;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -864029656:
                case 485657357:
                    i12 = i12;
                    if (C1929.f83011 != 0) {
                        iM55979 = C0873.m55680("ۜܿ") ^ i5;
                        i2 = ((iM55979 ^ i4) * 16791) ^ (-987993966);
                        i3 = 348242444;
                    } else {
                        iM55979 = (C0873.m55680("֡ۧ") ^ i4) * 27;
                        i2 = ((iM55979 ^ i5) * 4747) ^ (-1949060227);
                        i3 = -1602620597;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -492572434:
                case 499843257:
                    i12 = i12;
                    this.f35308.m16511(z);
                    if (i != 0) {
                        iM55979 = C0946.m55979("ܰܺ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-31441)) ^ 1577853855;
                        i3 = 1658792256;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۖ۬")) * 95;
                        i2 = ((iM55979 ^ i5) * (-16649)) ^ 589337114;
                        i3 = -934441371;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -445273774:
                case -21123241:
                    i12 = i12;
                    C1028.m56238(checkBox, i9);
                    C0898.m55802(checkBox2, i9);
                    C0898.m55802(checkBox3, i10);
                    C1028.m56238(checkBox4, i10);
                    C0898.m55802(checkBox5, i9);
                    iM55979 = (C0946.m55979("ۙ۫") + i5) * (-25);
                    i2 = ((iM55979 ^ i4) * (-29559)) ^ 1767553372;
                    i3 = -1404757643;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -377813218:
                case 243464747:
                    i12 = i12;
                    if (i == i8) {
                        iM55979 = (i4 - C0946.m55979("ۖ۬")) * 95;
                        i2 = ((iM55979 ^ i5) * (-16649)) ^ 589337114;
                        i3 = -934441371;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۨܽ")) * (-81);
                        i2 = ((iM55979 ^ i5) * (-21671)) ^ 697430762;
                        i3 = -397657623;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -346252339:
                case 1230072249:
                    i12 = i12;
                    C0912.m55833();
                    iM55979 = C0873.m55680("᩸۟") ^ i4;
                    i2 = ((iM55979 ^ i5) * (-17853)) ^ (-663476687);
                    i3 = -873549695;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -305950259:
                case 1655858172:
                    i12 = i12;
                    if (C1071.m56343() != 0) {
                        iM55979 = C0946.m55979("᩷᩵") ^ i4;
                        i2 = ((iM55979 ^ i5) * 29375) ^ (-1118566738);
                        i3 = 14913628;
                    } else {
                        iM55979 = C0946.m55979("ۧ۠") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-16665)) ^ (-415662761);
                        i3 = 379476550;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -276796434:
                case 2130301134:
                    RunnableC0897.m55784();
                    C0937.m55918();
                    break;
                case -258597217:
                case 1550064657:
                    m28955();
                    break;
                case -156261016:
                case 1662668832:
                    i12 = i12;
                    if (C0946.m55980() != 0) {
                        iM55979 = C0873.m55680("᩸۟") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-17853)) ^ (-663476687);
                        i3 = -873549695;
                    } else {
                        iM55979 = C0873.m55680("ܰܶ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-8705)) ^ 1954385601;
                        i3 = 949609531;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -93253621:
                case 311541735:
                    z2 = true;
                    iM55979 = (i4 - C0946.m55979("ۘۤ")) * (-15);
                    i2 = ((iM55979 ^ i5) * (-17331)) ^ (-18907316);
                    i3 = 1503613148;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -91685472:
                case 573194438:
                    i12 = i12;
                    if (i != 2) {
                        iM55979 = (C0946.m55979("᩺ܳ") + i5) * 61;
                        i2 = ((iM55979 ^ i4) * 4561) ^ 1398616820;
                        i3 = -751092116;
                    } else {
                        iM55979 = C0873.m55680("ۚ֡") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-27431)) ^ 266805500;
                        i3 = -1235225699;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 12852237:
                case 1049706193:
                    i12 = i12;
                    if (i != i8) {
                        iM55979 = C0946.m55979("᩻ܺ") ^ i5;
                        i2 = ((iM55979 ^ i4) * 9665) ^ (-445499963);
                        i3 = 1898908139;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ܿᩳ")) * (-27);
                        i2 = ((iM55979 ^ i5) * (-13529)) ^ 159243221;
                        i3 = 407466675;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 108015286:
                case 254303249:
                    z = false;
                    iM55979 = (C0946.m55979("۠֨") ^ i5) * 63;
                    i2 = ((iM55979 ^ i4) * (-25993)) ^ 2094851075;
                    i3 = 1084986589;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 628310497:
                case 889903099:
                    z = true;
                    iM55979 = (C0946.m55979("۠֨") ^ i5) * 63;
                    i2 = ((iM55979 ^ i4) * (-25993)) ^ 2094851075;
                    i3 = 1084986589;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 913122340:
                case 1981972152:
                    i12 = i12;
                    if (C0845.f81821 < 0) {
                        iM55979 = C0873.m55680("᩸۟") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-17853)) ^ (-663476687);
                        i3 = -873549695;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ܿۘ")) * (-49);
                        i2 = ((iM55979 ^ i5) * 3741) ^ 1907768789;
                        i3 = -1139130292;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 917189864:
                case 1952707774:
                    i12 = i12;
                    if (C0882.f81846) {
                        iM55979 = C0873.m55680("᩵ۙ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-10105)) ^ (-1104917036);
                        i3 = -1110780044;
                    } else {
                        iM55979 = C0946.m55979("֫᩺") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-15839)) ^ (-798450814);
                        i3 = -676924677;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 1110213823:
                case 1553533396:
                    z2 = false;
                    iM55979 = (i4 - C0946.m55979("ۘۤ")) * (-15);
                    i2 = ((iM55979 ^ i5) * (-17331)) ^ (-18907316);
                    i3 = 1503613148;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 1919962425:
                case 2068079924:
                    i12 = i12;
                    i8 = 1;
                    i9 = 0;
                    if (i != 0) {
                        iM55979 = C0946.m55979("۠ۨ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-7867)) ^ 829650878;
                        i3 = 437517277;
                    } else {
                        iM55979 = C0873.m55680("ۜܶ") ^ i5;
                        i2 = ((iM55979 ^ i4) * 22511) ^ 2134747872;
                        i3 = -1095842699;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                default:
                    i12 = i12;
                    checkBox3 = this.f35305;
                    checkBox2 = this.f35307;
                    checkBox = this.f35310;
                    i10 = 8;
                    if (i != 0) {
                        iM55979 = (i4 - C0873.m55680("ܽ᩵")) * (-35);
                        i2 = ((iM55979 ^ i5) * 31879) ^ (-1393394688);
                        i3 = 1050528029;
                    } else {
                        iM55979 = C0873.m55680("᩺ܽ") ^ i5;
                        i2 = ((iM55979 ^ i4) * 15159) ^ (-417495038);
                        i3 = 659562790;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
            }
            return;
        }
    }
}
