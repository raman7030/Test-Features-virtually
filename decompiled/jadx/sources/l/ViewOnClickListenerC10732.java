package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ۧۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q152 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10732 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ᩳܺ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f32330 = {4429, 3901, -4905, 7099, -6468, 6048, -1673, -1728, 6777, 2710, -4098, 6107, -5406, 2753, -732, 4841, 9289, -5846, 4630, -6401, 744, -7675, -5832, -4268, 8440, -4822, 9296, 14372, -7678, 8406, 546, 5375, 3976, 5314, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30706, 30719, 30710, 30691, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30699, 30695, 30706, 30693, 30702, 30681, 30693, 30695, 30709, 30691, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30708, 30691, 30689, 30691, 30718, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30702, 30691, 30718, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30703, 30690, 30644, 30696, 30695, 30699, 30691, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30691, 30718, 30695, 30693, 30706, 30698, 30719, 30681, 30699, 30695, 30706, 30693, 30702, -1808, 3600, 6984, 1780, 6549, 2100, 9750, -2275, 1513, 9395, 25237, 25272, 25263, 25274, 25316, 25278, 25255, 25274, 6770, 5904, -10209, -14712, -13524, 15359, -15992, -8867, 12496, 5963, 19388, 19444, 19388, 19412, 19375, 19372, 19364, 19375, 19422, 19422, 19403, 19403, 19406, 19406, 19360, 19372, 19375, 19405, 19405, 19422, 19422, 19403, 19403, 19406, 19406, 19362, 19362, 19362, 19365, 19408, 19426, -8703, 6654, 5175, 19334, -8840, 15627, -9670, 16129, 10541, 5487, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19448, 19445, 19452, 19433, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19425, 19437, 19448, 19439, 19428, 19411, 19439, 19437, 19455, 19433, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19454, 19433, 19435, 19433, 19444, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19428, 19433, 19444, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19429, 19432, 19390, 19426, 19437, 19425, 19433, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19433, 19444, 19437, 19439, 19448, 19424, 19445, 19411, 19425, 19437, 19448, 19439, 19428, 19408, 19454, 19329, -10372, 10127, -14472, 19408, 19448, 19333, 19408, 19434, 19328, 19408, 19438, 19332};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CheckBox f32331;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f32332;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C5062 f32333;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CheckBox f32334;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5062 f32335;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f32336;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CheckBox f32337;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16560 f32338;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f32339;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f32340;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CheckBox f32341;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Spinner f32342;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m26915() {
        CheckBox checkBox = null;
        boolean z = false;
        int i = -1243848265;
        int i2 = C4117.f13076;
        int i3 = C1294.f4556;
        int iM2566 = (i3 - C0630.m2566("ۤ᩹")) * 65;
        int i4 = ((iM2566 ^ i2) * 13327) ^ 282591320;
        int i5 = 384798514;
        while (true) {
            i = ((((i ^ i2) * (-24527)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2120131387:
                case 915521488:
                    this.f32333.m14612(z);
                    break;
                case -1979466584:
                case 638259502:
                    if (C7811.m20844() == 0) {
                        iM2566 = C2105.m6981("ܶۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 23405) ^ 1198979198;
                        i5 = 835658563;
                    } else {
                        iM2566 = C0630.m2566("۬᩶") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29031)) ^ 2068401755;
                        i5 = 1700021711;
                    }
                    break;
                case -1903218419:
                case 1871245307:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("ܽ᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-26755)) ^ (-541801357);
                        i5 = 1345569303;
                    } else {
                        iM2566 = (C2105.m6981("֡ۜ") ^ i3) * (-113);
                        i4 = ((iM2566 ^ i2) * (-10177)) ^ 1227178705;
                        i5 = -1206083667;
                    }
                    break;
                case -1736544298:
                case -570175398:
                    if (C1047.f3863 < 0) {
                        iM2566 = (i2 - C0630.m2566("ܽۡ")) * (-103);
                        i4 = ((iM2566 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        iM2566 = C2105.m6981("ܶۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 23405) ^ 1198979198;
                        i5 = 835658563;
                    }
                    break;
                case -1533548033:
                case -286535113:
                    if (C4616.m13552() != 0) {
                        iM2566 = (i2 - C0630.m2566("ܽۡ")) * (-103);
                        i4 = ((iM2566 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        iM2566 = C2105.m6981("ۡۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-12075)) ^ 44194152;
                        i5 = 358055761;
                    }
                    break;
                case -1155740774:
                case -456739929:
                    if (C0714.m2804(checkBox)) {
                        iM2566 = (i2 - C2105.m6981("᩵֫")) * 71;
                        i4 = ((iM2566 ^ i3) * (-30953)) ^ (-1294855339);
                        i5 = 1404116027;
                    } else {
                        iM2566 = C2105.m6981("ۖۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 11437) ^ 93309512;
                        i5 = 1099299931;
                    }
                    break;
                case -1034369443:
                case 1119208908:
                    if (checkBox.getVisibility() == 0) {
                        iM2566 = C0630.m2566("ᩳۖ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28601)) ^ (-867686633);
                        i5 = -1547532080;
                    } else {
                        iM2566 = C2105.m6981("ۖۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 11437) ^ 93309512;
                        i5 = 1099299931;
                    }
                    break;
                case -899939602:
                case 1092810147:
                    RunnableC1937.m6387();
                    C2272.m7503();
                    break;
                case -184014668:
                case 1649512522:
                    z = true;
                    iM2566 = (C0630.m2566("ۙۢ") + i3) * (-81);
                    i4 = ((iM2566 ^ i2) * 24513) ^ 1984707405;
                    i5 = -1398617777;
                    break;
                case -12874009:
                case 1379185647:
                    if (C4075.m12263() <= 0) {
                        iM2566 = (C0630.m2566("᩻ۧ") ^ i3) * (-45);
                        i4 = ((iM2566 ^ i2) * (-32249)) ^ (-933352766);
                        i5 = -1568251469;
                    } else {
                        iM2566 = C0630.m2566("۬᩶") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29031)) ^ 2068401755;
                        i5 = 1700021711;
                    }
                    break;
                case 90891325:
                case 1162375781:
                    if (AbstractC2021.m6574()) {
                        iM2566 = C0630.m2566("ܽ᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-26755)) ^ (-541801357);
                        i5 = 1345569303;
                    } else {
                        iM2566 = C0630.m2566("֨ᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-14175)) ^ (-149696102);
                        i5 = 336901242;
                    }
                    break;
                case 210334028:
                case 674314130:
                    if (C2520.m8026()) {
                        iM2566 = C0630.m2566("۬᩶") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29031)) ^ 2068401755;
                        i5 = 1700021711;
                    } else {
                        iM2566 = C0630.m2566("ܶ᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-10207)) ^ (-1984969383);
                        i5 = -1056810536;
                    }
                    break;
                case 212588668:
                case 390904893:
                    z = false;
                    iM2566 = (C0630.m2566("ۙۢ") + i3) * (-81);
                    i4 = ((iM2566 ^ i2) * 24513) ^ 1984707405;
                    i5 = -1398617777;
                    break;
                case 246639953:
                case 676680694:
                    if (C1128.m3851() <= 0) {
                        iM2566 = (C0630.m2566("᩻ۧ") ^ i3) * (-45);
                        i4 = ((iM2566 ^ i2) * (-32249)) ^ (-933352766);
                        i5 = -1568251469;
                    } else {
                        iM2566 = (i2 - C0630.m2566("۟᩺")) * 37;
                        i4 = ((iM2566 ^ i3) * 26549) ^ (-63911957);
                        i5 = 798446755;
                    }
                    break;
                case 265529574:
                case 1846154737:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (i2 - C0630.m2566("ܽۡ")) * (-103);
                        i4 = ((iM2566 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        iM2566 = (C0630.m2566("ۛܳ") + i2) * (-61);
                        i4 = ((iM2566 ^ i3) * 1367) ^ 1693134828;
                        i5 = 1044980902;
                    }
                    break;
                case 449947286:
                case 1728470920:
                    RunnableC1937.m6387();
                    iM2566 = C0630.m2566("۬᩶") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-29031)) ^ 2068401755;
                    i5 = 1700021711;
                    break;
                case 813481254:
                case 1134442989:
                    if (C0050.f910 >= 0) {
                        iM2566 = (i2 - C0630.m2566("ܽۡ")) * (-103);
                        i4 = ((iM2566 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        iM2566 = C2105.m6981("ۘ֫") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-27399)) ^ 1074613730;
                        i5 = 1897273518;
                    }
                    break;
                case 828099875:
                case 2105735781:
                    this.f32335.m14609(z);
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C0630.m2566("ܽ᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-26755)) ^ (-541801357);
                        i5 = 1345569303;
                    } else {
                        iM2566 = C2105.m6981("۫ܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-9201)) ^ (-348020387);
                        i5 = -1717971889;
                    }
                    break;
                case 1368715555:
                case 1712768164:
                    checkBox = this.f32334;
                    if (C4075.m12263() <= 0) {
                        iM2566 = (i2 - C0630.m2566("ܽۡ")) * (-103);
                        i4 = ((iM2566 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        iM2566 = C2105.m6981("ۚᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-28519)) ^ 1495382977;
                        i5 = -1581566560;
                    }
                    break;
                default:
                    if (C2272.f7362) {
                        iM2566 = C0630.m2566("ܽ᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-26755)) ^ (-541801357);
                        i5 = 1345569303;
                    } else {
                        iM2566 = C2105.m6981("᩺۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10857) ^ 1825603343;
                        i5 = 1514393678;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x019e, code lost:
    
        if (l.C4263.f13799 > 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewOnClickListenerC10732(AbstractC15440 abstractC15440, C16560 c16560, String str) {
        DialogInterface.OnClickListener onClickListener;
        View view;
        int i;
        short[] sArr;
        int i2;
        CheckBox checkBox;
        short[] sArr2;
        int i3;
        int i4;
        C19258 c19258;
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
        View viewM9259;
        int iM2566;
        int i10;
        int i11;
        int i12;
        int iM2567;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        DialogInterface.OnClickListener onClickListener3;
        short[] sArr6;
        int iM6981;
        int i18;
        int i19;
        InterfaceC12344 interfaceC12344;
        int iM2568;
        int i20;
        int i21;
        short[] sArr7;
        int i22 = 530395802;
        int i23 = AbstractC2021.f6743;
        int i24 = C11340.f33930;
        short s = f32330[0];
        int i25 = ((s * s) + 350363524) - (37436 * s) >= 0 ? 30598 : 25634;
        int iM6982 = (C2105.m6981("ܳ۫") ^ i24) * 87;
        int i26 = ((iM6982 ^ i23) * 9095) ^ 1432370804;
        int i27 = iM6982 ^ 391264013;
        TextView textView = null;
        CheckBox checkBox3 = null;
        InterfaceC12344 interfaceC12345 = null;
        AdapterView adapterView = null;
        InterfaceC12344 interfaceC12346 = null;
        InterfaceC12344 interfaceC12347 = null;
        InterfaceC12344 interfaceC12348 = null;
        DialogInterface.OnClickListener onClickListener4 = null;
        String strM2816 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        int i28 = 0;
        int iM2569 = 0;
        int iM6983 = 0;
        int i29 = 0;
        boolean z = false;
        int iM6984 = 0;
        int iM6985 = 0;
        boolean z2 = false;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        View view2 = null;
        CheckBox checkBox4 = null;
        String strM2575 = null;
        View view3 = null;
        String strM3396 = null;
        int i34 = 0;
        Main mainM50612 = null;
        C5062 c5062 = null;
        CheckBox checkBox5 = null;
        long j = 0;
        String str2 = null;
        int i35 = 0;
        int selectedItemPosition = 0;
        CheckBox checkBox6 = null;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = null;
        Spinner spinner3 = null;
        C19258 c19258M5912 = null;
        CheckBox checkBox7 = null;
        while (true) {
            i22 = i27 ^ (i26 & (((i22 ^ i23) * 30343) >> 31));
            switch (i22) {
                case -2072574653:
                case 562942292:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC12348 = interfaceC12348;
                    view = view2;
                    i = i34;
                    i28 = i28;
                    strM2575 = strM2575;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    InterfaceC12344 interfaceC12349 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox5 = checkBox5;
                    interfaceC12345 = interfaceC12345;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM2569 = iM2569;
                    i29 = i29;
                    c19258 = c19258M5912;
                    spinner = spinner3;
                    interfaceC12346 = interfaceC12349;
                    CheckBox checkBox8 = (CheckBox) C1005.m3507(view, C2105.m6981(C2520.m8030(f32330, 28, 3, i25)) ^ 2100710456);
                    this.f32331 = checkBox8;
                    sArr11 = f32330;
                    if (C0422.f1886 > 0) {
                        int iM25610 = (i24 - C0630.m2566("֡۟")) * 127;
                        i27 = iM25610 ^ 1952598511;
                        checkBox4 = checkBox8;
                        i26 = ((iM25610 ^ i23) * 11883) ^ (-1113048550);
                        spinner3 = spinner;
                        c19258M5912 = c19258;
                        onClickListener4 = onClickListener;
                        i34 = i;
                        checkBox7 = checkBox;
                        i29 = i29;
                        view2 = view;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        iM2569 = iM2569;
                        checkBox3 = checkBox3;
                        sArr12 = sArr12;
                        onCheckedChangeListener = onCheckedChangeListener;
                        z2 = z2;
                        z = z;
                        interfaceC12345 = interfaceC12345;
                        checkBox5 = checkBox5;
                        interfaceC12347 = interfaceC12347;
                        interfaceC12346 = interfaceC12346;
                        strM2575 = strM2575;
                        i28 = i28;
                        interfaceC12348 = interfaceC12348;
                    } else {
                        checkBox4 = checkBox8;
                        i12 = i35;
                        sArr2 = sArr9;
                        i3 = i32;
                        sArr3 = sArr10;
                        i4 = i33;
                        iM2567 = C2105.m6981("ᩳᩴ") ^ i24;
                        i13 = ((iM2567 ^ i23) * 9305) ^ 1341754778;
                        i14 = -404406432;
                        i27 = iM2567 ^ i14;
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
                        c19258M5912 = c19258;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        iM2569 = iM2569;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr12;
                        z2 = z2;
                        z = z;
                        interfaceC12345 = interfaceC12345;
                        checkBox5 = checkBox5;
                        interfaceC12347 = interfaceC12347;
                        interfaceC12346 = interfaceC12346;
                        strM2575 = strM2575;
                        i28 = i28;
                        interfaceC12348 = interfaceC12348;
                    }
                    break;
                case -2016967264:
                case -943464733:
                    C22628.m50615();
                    if (C0714.f2697 < 0) {
                        onCheckedChangeListener = onCheckedChangeListener;
                        i15 = i35;
                        checkBox = checkBox7;
                        checkBox3 = checkBox3;
                        interfaceC12348 = interfaceC12348;
                        view = view2;
                        i16 = i33;
                        i17 = i34;
                        i28 = i28;
                        strM2575 = strM2575;
                        interfaceC12346 = interfaceC12346;
                        interfaceC12347 = interfaceC12347;
                        checkBox6 = checkBox6;
                        i30 = i30;
                        onClickListener3 = onClickListener4;
                        checkBox5 = checkBox5;
                        interfaceC12345 = interfaceC12345;
                        z = z;
                        z2 = z2;
                        sArr12 = sArr12;
                        iM2569 = iM2569;
                        i29 = i29;
                        c19258 = c19258M5912;
                        spinner = spinner3;
                        sArr6 = sArr10;
                        iM6981 = C0630.m2566("ۡܺ") ^ i23;
                        i18 = ((iM6981 ^ i24) * (-22949)) ^ (-1103109619);
                        i19 = 799618161;
                        i27 = iM6981 ^ i19;
                        i35 = i15;
                        i26 = i18;
                        sArr10 = sArr6;
                        i33 = i16;
                        onClickListener4 = onClickListener3;
                        i34 = i17;
                        checkBox7 = checkBox;
                        spinner3 = spinner;
                        view2 = view;
                        c19258M5912 = c19258;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        iM2569 = iM2569;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr12;
                        z2 = z2;
                        z = z;
                        interfaceC12345 = interfaceC12345;
                        checkBox5 = checkBox5;
                        interfaceC12347 = interfaceC12347;
                        interfaceC12346 = interfaceC12346;
                        strM2575 = strM2575;
                        i28 = i28;
                        interfaceC12348 = interfaceC12348;
                    }
                    onCheckedChangeListener = onCheckedChangeListener;
                    i7 = i35;
                    checkBox2 = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC12348 = interfaceC12348;
                    viewM9259 = view2;
                    sArr4 = sArr9;
                    i8 = i32;
                    i9 = i33;
                    i6 = i34;
                    i28 = i28;
                    main = mainM50612;
                    strM2575 = strM2575;
                    interfaceC12346 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener2 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC12345 = interfaceC12345;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM2569 = iM2569;
                    i29 = i29;
                    c19258 = c19258M5912;
                    spinner2 = spinner3;
                    sArr5 = sArr10;
                    iM2566 = C0630.m2566("ᩳ۫") ^ i24;
                    i10 = ((iM2566 ^ i23) * 6585) ^ (-298946454);
                    i11 = -1443599469;
                    i27 = iM2566 ^ i11;
                    mainM50612 = main;
                    sArr9 = sArr4;
                    sArr10 = sArr5;
                    i33 = i9;
                    onClickListener4 = onClickListener2;
                    i34 = i6;
                    i32 = i8;
                    i35 = i7;
                    checkBox7 = checkBox2;
                    view2 = viewM9259;
                    spinner3 = spinner2;
                    i26 = i10;
                    c19258M5912 = c19258;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM2569 = iM2569;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC12345 = interfaceC12345;
                    checkBox5 = checkBox5;
                    interfaceC12347 = interfaceC12347;
                    interfaceC12346 = interfaceC12346;
                    strM2575 = strM2575;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    break;
                case -1921214339:
                case -298354697:
                    onCheckedChangeListener = onCheckedChangeListener;
                    i12 = i35;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC12348 = interfaceC12348;
                    view = view2;
                    sArr2 = sArr9;
                    i3 = i32;
                    i4 = i33;
                    i = i34;
                    i28 = i28;
                    strM2575 = strM2575;
                    interfaceC12346 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC12345 = interfaceC12345;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM2569 = iM2569;
                    i29 = i29;
                    c19258 = c19258M5912;
                    spinner = spinner3;
                    sArr3 = sArr10;
                    iM6984 = C2105.m6981(C1005.m3502(f32330, 7, 3, i25));
                    if (C1294.m4372() <= 0) {
                        iM2567 = C2105.m6981("ᩳᩴ") ^ i24;
                        i13 = ((iM2567 ^ i23) * 9305) ^ 1341754778;
                        i14 = -404406432;
                    } else {
                        iM2567 = C0630.m2566("ᩳ᩵") ^ i23;
                        i13 = ((iM2567 ^ i24) * 295) ^ (-1972339715);
                        i14 = -1260520311;
                    }
                    i27 = iM2567 ^ i14;
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
                    c19258M5912 = c19258;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM2569 = iM2569;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC12345 = interfaceC12345;
                    checkBox5 = checkBox5;
                    interfaceC12347 = interfaceC12347;
                    interfaceC12346 = interfaceC12346;
                    strM2575 = strM2575;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    break;
                case -1872256887:
                case 869029437:
                    if (!AbstractC2021.m6574()) {
                        onCheckedChangeListener = onCheckedChangeListener;
                        i2 = i35;
                        checkBox = checkBox7;
                        checkBox3 = checkBox3;
                        interfaceC12348 = interfaceC12348;
                        view = view2;
                        sArr2 = sArr9;
                        i3 = i32;
                        i4 = i33;
                        i = i34;
                        i28 = i28;
                        strM2575 = strM2575;
                        interfaceC12346 = interfaceC12346;
                        interfaceC12347 = interfaceC12347;
                        checkBox6 = checkBox6;
                        sArr = sArr12;
                        i30 = i30;
                        onClickListener = onClickListener4;
                        checkBox5 = checkBox5;
                        iM2569 = iM2569;
                        i29 = i29;
                        interfaceC12345 = interfaceC12345;
                        z = z;
                        c19258 = c19258M5912;
                        spinner = spinner3;
                        sArr3 = sArr10;
                        int iM6986 = (i24 - C2105.m6981("᩺ܽ")) * (-113);
                        int i36 = i2;
                        i26 = ((iM6986 ^ i23) * (-30387)) ^ (-337495545);
                        i27 = iM6986 ^ (-1659767500);
                        sArr9 = sArr2;
                        z = z;
                        sArr10 = sArr3;
                        i33 = i4;
                        onClickListener4 = onClickListener;
                        i32 = i3;
                        i35 = i36;
                        checkBox7 = checkBox;
                        interfaceC12345 = interfaceC12345;
                        spinner3 = spinner;
                        c19258M5912 = c19258;
                        checkBox5 = checkBox5;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        interfaceC12347 = interfaceC12347;
                        iM2569 = iM2569;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr;
                        interfaceC12346 = interfaceC12346;
                        i34 = i;
                        strM2575 = strM2575;
                        view2 = view;
                        i28 = i28;
                        interfaceC12348 = interfaceC12348;
                    } else {
                        iM2568 = (C0630.m2566("ᩳܽ") + i23) * (-121);
                        i20 = ((iM2568 ^ i24) * (-809)) ^ (-142770212);
                        i21 = 1505044398;
                        i27 = iM2568 ^ i21;
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
                    InterfaceC12344 interfaceC123410 = interfaceC12347;
                    C0714.m2802(checkBox5, C4263.m12818(interfaceC123410, C7106.m19110(f32330, 72, 17, i25), z3));
                    int iM6987 = C2105.m6981("ۚ᩺") ^ i24;
                    i27 = iM6987 ^ 1171792256;
                    i26 = ((iM6987 ^ i23) * (-12677)) ^ 266121379;
                    interfaceC12347 = interfaceC123410;
                    onClickListener4 = onClickListener5;
                    z = z3;
                    i30 = i38;
                    checkBox6 = checkBox9;
                    i34 = i37;
                    checkBox3 = checkBox3;
                    view2 = view4;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    short[] sArr14 = sArr7;
                    z2 = z2;
                    iM2569 = iM2569;
                    sArr12 = sArr14;
                    break;
                case -1708107364:
                case 887960781:
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = onCheckedChangeListener;
                    CheckBox checkBox10 = checkBox6;
                    interfaceC12348 = interfaceC12348;
                    int i39 = i30;
                    View view5 = view2;
                    int i40 = i34;
                    DialogInterface.OnClickListener onClickListener6 = onClickListener4;
                    i28 = i28;
                    strM2575 = strM2575;
                    InterfaceC12344 interfaceC123411 = interfaceC12346;
                    InterfaceC12344 interfaceC123412 = interfaceC12347;
                    CheckBox checkBox11 = checkBox5;
                    InterfaceC12344 interfaceC123413 = interfaceC12345;
                    boolean z4 = z;
                    boolean z5 = z2;
                    short[] sArr15 = sArr12;
                    short[] sArr16 = sArr11;
                    CheckBox checkBox12 = (CheckBox) C11340.m28028(view5, C0630.m2566(ViewOnClickListenerC1958.m6435(sArr16, 31, 3, i25)) ^ 2123257550);
                    int iM25611 = (C0630.m2566("ܿܰ") + i23) * 87;
                    i26 = ((iM25611 ^ i24) * (-17873)) ^ (-1837694428);
                    i27 = iM25611 ^ 547623277;
                    spinner3 = spinner3;
                    sArr11 = sArr16;
                    c19258M5912 = c19258M5912;
                    i34 = i40;
                    onCheckedChangeListener = onCheckedChangeListener2;
                    checkBox7 = checkBox7;
                    i29 = i29;
                    view2 = view5;
                    iM2569 = iM2569;
                    sArr12 = sArr15;
                    z2 = z5;
                    z = z4;
                    interfaceC12345 = interfaceC123413;
                    checkBox5 = checkBox11;
                    interfaceC12347 = interfaceC123412;
                    interfaceC12346 = interfaceC123411;
                    onClickListener4 = onClickListener6;
                    i30 = i39;
                    checkBox6 = checkBox10;
                    checkBox3 = checkBox12;
                    strM2575 = strM2575;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    break;
                case -1670489490:
                case 1994017200:
                    DialogInterfaceC0206 dialogInterfaceC0206M16343 = C5834.m16343(c19258M5912, iM2569, onClickListener4, C0630.m2566(C3663.m11162(sArr13, i34, i28, i25)) ^ 2119185350, onClickListener4);
                    this.f32340 = dialogInterfaceC0206M16343;
                    C10025.m25199(c16560, dialogInterfaceC0206M16343, str);
                    C2126.m7039(C21923.m49343(dialogInterfaceC0206M16343), this);
                    C1711.m5740(c5062);
                    C4925.m14329(c5062.m14607());
                    return;
                case -1561050374:
                case -1451091664:
                    C3663.m11173(checkBox5, onCheckedChangeListener);
                    m26915();
                    c19258M5912 = C1773.m5912(C21923.m49336(c16560));
                    view = view2;
                    C0798.m3013(c19258M5912, view);
                    i = i34;
                    iM6983 = C2105.m6981(C2272.m7507(f32330, 148, 3, i25)) ^ 2101061860;
                    if (C0798.f2919) {
                        onCheckedChangeListener = onCheckedChangeListener;
                        i12 = i35;
                        checkBox = checkBox7;
                        checkBox3 = checkBox3;
                        interfaceC12348 = interfaceC12348;
                        sArr2 = sArr9;
                        i3 = i32;
                        i4 = i33;
                        i28 = i28;
                        strM2575 = strM2575;
                        interfaceC12346 = interfaceC12346;
                        interfaceC12347 = interfaceC12347;
                        checkBox6 = checkBox6;
                        i30 = i30;
                        onClickListener = onClickListener4;
                        checkBox5 = checkBox5;
                        interfaceC12345 = interfaceC12345;
                        z = z;
                        z2 = z2;
                        sArr12 = sArr12;
                        iM2569 = iM2569;
                        i29 = i29;
                        c19258 = c19258M5912;
                        spinner = spinner3;
                        sArr3 = sArr10;
                        iM2567 = C2105.m6981("ᩳᩴ") ^ i24;
                        i13 = ((iM2567 ^ i23) * 9305) ^ 1341754778;
                        i14 = -404406432;
                        i27 = iM2567 ^ i14;
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
                        c19258M5912 = c19258;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        iM2569 = iM2569;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr12;
                        z2 = z2;
                        z = z;
                        interfaceC12345 = interfaceC12345;
                        checkBox5 = checkBox5;
                        interfaceC12347 = interfaceC12347;
                        interfaceC12346 = interfaceC12346;
                        strM2575 = strM2575;
                        i28 = i28;
                        interfaceC12348 = interfaceC12348;
                    } else {
                        int iM25612 = (C0630.m2566("ܺۖ") + i23) * 9;
                        i27 = iM25612 ^ 1117512207;
                        i26 = ((iM25612 ^ i24) * (-23801)) ^ (-217713994);
                        i34 = i;
                        view2 = view;
                    }
                    break;
                case -1544932729:
                case 1379113969:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC12348 = interfaceC12348;
                    view = view2;
                    i17 = i34;
                    i28 = i28;
                    strM2575 = strM2575;
                    interfaceC12346 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener3 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC12345 = interfaceC12345;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM2569 = iM2569;
                    i29 = i29;
                    c19258 = c19258M5912;
                    spinner = spinner3;
                    this.f32342 = spinner;
                    sArr6 = sArr10;
                    i16 = i33;
                    iM6985 = C2105.m6981(C22628.m50602(f32330, 19, 3, i25));
                    int iM6988 = C2105.m6981("ܿ᩺") ^ i24;
                    i27 = iM6988 ^ (-720941565);
                    i26 = ((iM6988 ^ i23) * 15487) ^ (-82252876);
                    sArr10 = sArr6;
                    i33 = i16;
                    onClickListener4 = onClickListener3;
                    i34 = i17;
                    checkBox7 = checkBox;
                    spinner3 = spinner;
                    view2 = view;
                    c19258M5912 = c19258;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM2569 = iM2569;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC12345 = interfaceC12345;
                    checkBox5 = checkBox5;
                    interfaceC12347 = interfaceC12347;
                    interfaceC12346 = interfaceC12346;
                    strM2575 = strM2575;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    break;
                case -1502038682:
                case 1393279701:
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener3 = onCheckedChangeListener;
                    InterfaceC12344 interfaceC123414 = interfaceC12345;
                    boolean z6 = z;
                    InterfaceC12344 interfaceC123415 = interfaceC12348;
                    boolean z7 = z2;
                    short[] sArr17 = sArr12;
                    View view6 = view2;
                    int i41 = iM2569;
                    int i42 = i29;
                    CheckBox checkBox13 = (CheckBox) C11340.m28028(view6, i42);
                    this.f32334 = checkBox13;
                    strM2816 = C0714.m2816(f32330, 25, 3, i25);
                    int iM25613 = C0630.m2566("ܺۨ") ^ i24;
                    i27 = iM25613 ^ 1704360482;
                    i26 = ((iM25613 ^ i23) * (-9053)) ^ (-763512395);
                    interfaceC12347 = interfaceC12347;
                    onClickListener4 = onClickListener4;
                    i34 = i34;
                    checkBox7 = checkBox7;
                    view2 = view6;
                    interfaceC12346 = interfaceC12346;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    strM2575 = strM2575;
                    checkBox3 = checkBox3;
                    i28 = i28;
                    interfaceC12348 = interfaceC123415;
                    onCheckedChangeListener = onCheckedChangeListener3;
                    interfaceC12345 = interfaceC123414;
                    checkBox5 = checkBox13;
                    spinner3 = spinner3;
                    c19258M5912 = c19258M5912;
                    i29 = i42;
                    iM2569 = i41;
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
                    interfaceC12348 = interfaceC12348;
                    view = view2;
                    i16 = i33;
                    i17 = i34;
                    i28 = i28;
                    strM2575 = strM2575;
                    interfaceC12346 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener3 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC12345 = interfaceC12345;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM2569 = iM2569;
                    i29 = i29;
                    c19258 = c19258M5912;
                    spinner = spinner3;
                    sArr6 = sArr10;
                    this.f32333 = (C5062) C11340.m28028(view, i15);
                    sArr9 = f32330;
                    i32 = 16;
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("ۡܺ") ^ i23;
                        i18 = ((iM6981 ^ i24) * (-22949)) ^ (-1103109619);
                        i19 = 799618161;
                    } else {
                        iM6981 = (i23 - C2105.m6981("֨ۧ")) * 17;
                        i18 = ((iM6981 ^ i24) * 21957) ^ 521813844;
                        i19 = 518133175;
                    }
                    i27 = iM6981 ^ i19;
                    i35 = i15;
                    i26 = i18;
                    sArr10 = sArr6;
                    i33 = i16;
                    onClickListener4 = onClickListener3;
                    i34 = i17;
                    checkBox7 = checkBox;
                    spinner3 = spinner;
                    view2 = view;
                    c19258M5912 = c19258;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM2569 = iM2569;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC12345 = interfaceC12345;
                    checkBox5 = checkBox5;
                    interfaceC12347 = interfaceC12347;
                    interfaceC12346 = interfaceC12346;
                    strM2575 = strM2575;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
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
                    InterfaceC12344 interfaceC123416 = interfaceC12346;
                    CheckBox checkBox17 = checkBox7;
                    C2167.m7160(checkBox17, C0964.m3400(interfaceC123416, C7811.m20837(f32330, 50, 22, i25), z8));
                    InterfaceC12344 interfaceC123417 = ApplicationC20075.f65008;
                    int iM25614 = C0630.m2566("᩺᩻") ^ i23;
                    i26 = ((iM25614 ^ i24) * 5611) ^ (-686093456);
                    i27 = iM25614 ^ (-814514873);
                    z = z8;
                    checkBox7 = checkBox17;
                    checkBox5 = checkBox16;
                    i34 = i43;
                    view2 = view7;
                    interfaceC12347 = interfaceC123417;
                    interfaceC12346 = interfaceC123416;
                    onClickListener4 = onClickListener7;
                    i30 = i44;
                    checkBox6 = checkBox15;
                    checkBox3 = checkBox14;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    short[] sArr18 = sArr7;
                    z2 = z2;
                    iM2569 = iM2569;
                    sArr12 = sArr18;
                    break;
                case -1313031184:
                case 1869577174:
                    InterfaceC12344 interfaceC123418 = interfaceC12348;
                    int i45 = i30;
                    View view8 = view2;
                    int i46 = i34;
                    DialogInterface.OnClickListener onClickListener8 = onClickListener4;
                    int i47 = i28;
                    String str3 = strM2575;
                    InterfaceC12344 interfaceC123419 = interfaceC12346;
                    InterfaceC12344 interfaceC123420 = interfaceC12347;
                    CheckBox checkBox18 = checkBox5;
                    InterfaceC12344 interfaceC123421 = interfaceC12345;
                    boolean z9 = z;
                    boolean z10 = z2;
                    short[] sArr19 = sArr12;
                    CheckBox checkBox19 = (CheckBox) C1005.m3507(view8, C2105.m6981(strM2816) ^ 2101679847);
                    this.f32332 = checkBox19;
                    int iM6989 = (C2105.m6981("ܺۛ") + i23) * (-123);
                    int i48 = ((iM6989 ^ i24) * (-15271)) ^ 303782815;
                    i27 = iM6989 ^ (-538371913);
                    spinner3 = spinner3;
                    checkBox3 = checkBox3;
                    c19258M5912 = c19258M5912;
                    i34 = i46;
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox7 = checkBox7;
                    i29 = i29;
                    view2 = view8;
                    iM2569 = iM2569;
                    sArr12 = sArr19;
                    z2 = z10;
                    z = z9;
                    interfaceC12345 = interfaceC123421;
                    checkBox5 = checkBox18;
                    interfaceC12347 = interfaceC123420;
                    interfaceC12346 = interfaceC123419;
                    strM2575 = str3;
                    i28 = i47;
                    interfaceC12348 = interfaceC123418;
                    checkBox6 = checkBox19;
                    i26 = i48;
                    onClickListener4 = onClickListener8;
                    i30 = i45;
                    break;
                case -1225486757:
                case 151926603:
                    c19258 = c19258M5912;
                    onCheckedChangeListener = onCheckedChangeListener;
                    spinner = spinner3;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC12348 = interfaceC12348;
                    view = view2;
                    i = i34;
                    i28 = i28;
                    strM2575 = strM2575;
                    interfaceC12346 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC12345 = interfaceC12345;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM2569 = iM2569;
                    short[] sArr20 = sArr10;
                    int i49 = i33;
                    int iM25615 = C0630.m2566(C4159.m12578(sArr20, i49, 3, i25)) ^ 2104279284;
                    if (C7106.f21815 != 0) {
                        i29 = iM25615;
                        sArr3 = sArr20;
                        i4 = i49;
                        i12 = i35;
                        sArr2 = sArr9;
                        i3 = i32;
                        iM2567 = C2105.m6981("ᩳᩴ") ^ i24;
                        i13 = ((iM2567 ^ i23) * 9305) ^ 1341754778;
                        i14 = -404406432;
                        i27 = iM2567 ^ i14;
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
                        c19258M5912 = c19258;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        iM2569 = iM2569;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr12;
                        z2 = z2;
                        z = z;
                        interfaceC12345 = interfaceC12345;
                        checkBox5 = checkBox5;
                        interfaceC12347 = interfaceC12347;
                        interfaceC12346 = interfaceC12346;
                        strM2575 = strM2575;
                        i28 = i28;
                        interfaceC12348 = interfaceC12348;
                    } else {
                        int iM69810 = (C2105.m6981("۫ܳ") ^ i23) * (-83);
                        i26 = ((iM69810 ^ i24) * 32667) ^ 1351914322;
                        i27 = iM69810 ^ (-1244881190);
                        sArr10 = sArr20;
                        i33 = i49;
                        iM2569 = iM2569;
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
                        interfaceC12345 = interfaceC12345;
                        checkBox5 = checkBox5;
                        interfaceC12347 = interfaceC12347;
                        interfaceC12346 = interfaceC12346;
                        strM2575 = strM2575;
                        i28 = i28;
                        interfaceC12348 = interfaceC12348;
                        spinner3 = spinner;
                        c19258M5912 = c19258;
                        i29 = iM25615;
                    }
                    break;
                case -1181491854:
                case 2111665783:
                    C2126.m7040();
                    C5695.m16023();
                    throw new RuntimeException();
                case -854596905:
                case -257246880:
                    View view9 = view2;
                    int i50 = i34;
                    short[] sArr21 = sArr12;
                    int i51 = i30;
                    int i52 = iM2569;
                    boolean z11 = z2;
                    InterfaceC12344 interfaceC123422 = interfaceC12348;
                    int i53 = i28;
                    C2167.m7160(checkBox4, C4263.m12818(interfaceC123422, C3019.m9250(sArr21, i51, 19, i25), z11));
                    DialogInterface.OnClickListener onClickListener9 = onClickListener4;
                    CheckBox checkBox20 = checkBox3;
                    C2167.m7160(checkBox20, C4263.m12818(ApplicationC20075.f65008, C1711.m5726(f32330, 123, 25, i25), z11));
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener4 = new CompoundButton.OnCheckedChangeListener() { // from class: l.۫ۙܽ
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                            int i54 = 1722914154;
                            int i55 = ViewOnClickListenerC1958.f6529;
                            int i56 = RunnableC0588.f2309;
                            int iM69811 = (i55 - C2105.m6981("֫ܶ")) * (-43);
                            int i57 = ((iM69811 ^ i56) * 22943) ^ (-1414982207);
                            int i58 = -2133799701;
                            while (true) {
                                i54 = ((((i54 ^ i56) * 4953) >> 31) & i57) ^ (iM69811 ^ i58);
                                switch (i54) {
                                    case -1733391308:
                                    case 1186688081:
                                        C3663.m11168();
                                        iM69811 = (C2105.m6981("᩶۟") + i56) * 53;
                                        i57 = ((iM69811 ^ i55) * 21311) ^ (-123885208);
                                        i58 = -736114046;
                                        break;
                                    case -1694320313:
                                    case 1083311460:
                                        if (!C0382.f1805) {
                                            iM69811 = C2105.m6981("ۡ᩹") ^ i55;
                                            i57 = ((iM69811 ^ i56) * 29641) ^ 639249733;
                                            i58 = 311961566;
                                        } else {
                                            iM69811 = C0630.m2566("᩷᩹") ^ i55;
                                            i57 = ((iM69811 ^ i56) * 14387) ^ (-368787033);
                                            i58 = -327256819;
                                        }
                                        break;
                                    case -1625403322:
                                    case 244608119:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM69811 = (C2105.m6981("᩶۟") + i56) * 53;
                                            i57 = ((iM69811 ^ i55) * 21311) ^ (-123885208);
                                            i58 = -736114046;
                                        } else {
                                            iM69811 = C0630.m2566("۫۟") ^ i56;
                                            i57 = ((iM69811 ^ i55) * 8795) ^ (-390646358);
                                            i58 = 1083779225;
                                        }
                                        break;
                                    case -1545667182:
                                    case -190504183:
                                        if (!C1916.f6442) {
                                            iM69811 = C2105.m6981("ۡ᩹") ^ i55;
                                            i57 = ((iM69811 ^ i56) * 29641) ^ 639249733;
                                            i58 = 311961566;
                                        } else {
                                            iM69811 = (C2105.m6981("᩶۟") + i56) * 53;
                                            i57 = ((iM69811 ^ i55) * 21311) ^ (-123885208);
                                            i58 = -736114046;
                                        }
                                        break;
                                    case -1545339328:
                                    case -1203558655:
                                        if (C1294.f4556 >= 0) {
                                            iM69811 = C0630.m2566("᩷᩹") ^ i55;
                                            i57 = ((iM69811 ^ i56) * 14387) ^ (-368787033);
                                            i58 = -327256819;
                                        } else {
                                            iM69811 = C0630.m2566("ܺۗ") ^ i55;
                                            i57 = ((iM69811 ^ i56) * 25097) ^ (-1533465252);
                                            i58 = 1521954461;
                                        }
                                        break;
                                    case -1542944656:
                                    case -924429313:
                                        if (C0050.f910 >= 0) {
                                            iM69811 = (C2105.m6981("᩶۟") + i56) * 53;
                                            i57 = ((iM69811 ^ i55) * 21311) ^ (-123885208);
                                            i58 = -736114046;
                                        } else {
                                            iM69811 = C0630.m2566("᩻ۘ") ^ i56;
                                            i57 = ((iM69811 ^ i55) * (-5507)) ^ (-1300619952);
                                            i58 = 565961491;
                                        }
                                        break;
                                    case -1459714469:
                                    case 1592977623:
                                        if (C1047.f3863 >= 0) {
                                            iM69811 = C0630.m2566("᩷᩹") ^ i55;
                                            i57 = ((iM69811 ^ i56) * 14387) ^ (-368787033);
                                            i58 = -327256819;
                                        } else {
                                            iM69811 = (C2105.m6981("ۙܶ") ^ i55) * (-39);
                                            i57 = ((iM69811 ^ i56) * 1757) ^ (-1127821892);
                                            i58 = -1233596938;
                                        }
                                        break;
                                    case -1201758248:
                                    case -1123178191:
                                        C2958.m9034();
                                        if (C1047.m3599() < 0) {
                                            iM69811 = C2105.m6981("ۡ᩹") ^ i55;
                                            i57 = ((iM69811 ^ i56) * 29641) ^ 639249733;
                                            i58 = 311961566;
                                        } else {
                                            iM69811 = (C0630.m2566("۠ܺ") + i56) * 77;
                                            i57 = ((iM69811 ^ i55) * 24559) ^ (-326020155);
                                            i58 = -1515516484;
                                        }
                                        break;
                                    case -977532745:
                                    case 494904369:
                                        this.f36330.m26915();
                                        break;
                                    case -647886238:
                                    case -603308724:
                                        if (C2272.f7362) {
                                            iM69811 = C2105.m6981("᩸᩺") ^ i55;
                                            i57 = ((iM69811 ^ i56) * 24401) ^ (-1251600743);
                                            i58 = 347270737;
                                        } else {
                                            iM69811 = (i55 - C0630.m2566("ۡᩴ")) * 115;
                                            i57 = ((iM69811 ^ i56) * 29485) ^ (-1325317023);
                                            i58 = 237707259;
                                        }
                                        break;
                                    case -582010013:
                                    case 902358074:
                                        RunnableC1937.m6387();
                                        break;
                                    case -369699672:
                                    case 698358174:
                                        if (C4616.f14690 <= 0) {
                                            iM69811 = C0630.m2566("᩷᩹") ^ i55;
                                            i57 = ((iM69811 ^ i56) * 14387) ^ (-368787033);
                                            i58 = -327256819;
                                        } else {
                                            iM69811 = (C2105.m6981("֡᩹") ^ i56) * (-13);
                                            i57 = ((iM69811 ^ i55) * 6321) ^ 1576738492;
                                            i58 = 1963161585;
                                        }
                                        break;
                                    case 359010866:
                                    case 1816346233:
                                        if (C3663.f11553) {
                                            iM69811 = C2105.m6981("ۡ᩹") ^ i55;
                                            i57 = ((iM69811 ^ i56) * 29641) ^ 639249733;
                                            i58 = 311961566;
                                        } else {
                                            iM69811 = (C2105.m6981("ܳۨ") ^ i56) * 25;
                                            i57 = ((iM69811 ^ i55) * (-31897)) ^ (-533837788);
                                            i58 = -1050423083;
                                        }
                                        break;
                                    case 849653210:
                                    case 1530742628:
                                        if (RunnableC1937.f6483 >= 0) {
                                            iM69811 = C2105.m6981("ۡ᩹") ^ i55;
                                            i57 = ((iM69811 ^ i56) * 29641) ^ 639249733;
                                            i58 = 311961566;
                                        } else {
                                            iM69811 = (C0630.m2566("ܽ֡") + i55) * 65;
                                            i57 = ((iM69811 ^ i56) * (-7065)) ^ 1324390795;
                                            i58 = 853026958;
                                        }
                                        break;
                                    case 1608272690:
                                    case 1872703605:
                                        if (C4263.m12819() >= 0) {
                                            iM69811 = C2105.m6981("ۡ᩹") ^ i55;
                                            i57 = ((iM69811 ^ i56) * 29641) ^ 639249733;
                                            i58 = 311961566;
                                        } else {
                                            iM69811 = (C0630.m2566("֨ۘ") ^ i55) * 69;
                                            i57 = ((iM69811 ^ i56) * (-19139)) ^ (-655667625);
                                            i58 = -1206531631;
                                        }
                                        break;
                                    default:
                                        if (C1711.f5919) {
                                            iM69811 = C2105.m6981("᩸᩺") ^ i55;
                                            i57 = ((iM69811 ^ i56) * 24401) ^ (-1251600743);
                                            i58 = 347270737;
                                        } else {
                                            iM69811 = (C0630.m2566("᩹ܺ") ^ i56) * 13;
                                            i57 = ((iM69811 ^ i55) * 19157) ^ 32748707;
                                            i58 = -134091160;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    int iM25616 = (i24 - C0630.m2566("᩵᩵")) * q.h;
                    int i54 = ((iM25616 ^ i23) * 11949) ^ (-908866423);
                    i27 = iM25616 ^ 872646358;
                    checkBox3 = checkBox20;
                    i28 = i53;
                    i34 = i50;
                    interfaceC12348 = interfaceC123422;
                    view2 = view9;
                    onCheckedChangeListener = onCheckedChangeListener4;
                    i26 = i54;
                    onClickListener4 = onClickListener9;
                    i30 = i51;
                    z2 = z11;
                    iM2569 = i52;
                    sArr12 = sArr21;
                    break;
                case -817717889:
                case 2059686958:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox3 = checkBox3;
                    interfaceC12348 = interfaceC12348;
                    View view10 = view2;
                    int i55 = i34;
                    i28 = i28;
                    strM2575 = strM2575;
                    interfaceC12346 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    DialogInterface.OnClickListener onClickListener10 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC12345 = interfaceC12345;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM2569 = iM2569;
                    int iM69811 = C2105.m6981(C2272.m7507(f32330, 13, 3, i25)) ^ 2129491946;
                    int iM25617 = C0630.m2566("᩷֨") ^ i24;
                    int i56 = ((iM25617 ^ i23) * 22095) ^ 722288690;
                    i27 = iM25617 ^ 539973839;
                    sArr9 = sArr9;
                    sArr10 = sArr10;
                    i33 = i33;
                    i34 = i55;
                    i32 = i32;
                    checkBox7 = checkBox7;
                    i35 = iM69811;
                    i26 = i56;
                    spinner3 = spinner3;
                    view2 = view10;
                    c19258M5912 = c19258M5912;
                    onClickListener4 = onClickListener10;
                    i29 = i29;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    iM2569 = iM2569;
                    checkBox3 = checkBox3;
                    sArr12 = sArr12;
                    onCheckedChangeListener = onCheckedChangeListener;
                    z2 = z2;
                    z = z;
                    interfaceC12345 = interfaceC12345;
                    checkBox5 = checkBox5;
                    interfaceC12347 = interfaceC12347;
                    interfaceC12346 = interfaceC12346;
                    strM2575 = strM2575;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    break;
                case -589764079:
                case 1514629431:
                    onCheckedChangeListener = onCheckedChangeListener;
                    i2 = i35;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC12348 = interfaceC12348;
                    view = view2;
                    sArr2 = sArr9;
                    i3 = i32;
                    i4 = i33;
                    i = i34;
                    i28 = i28;
                    strM2575 = strM2575;
                    interfaceC12346 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC12345 = interfaceC12345;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM2569 = iM2569;
                    i29 = i29;
                    c19258 = c19258M5912;
                    spinner = spinner3;
                    sArr3 = sArr10;
                    c5062 = (C5062) C1005.m3507(view, C0630.m2566(strM3396) ^ 2101518946);
                    this.f32335 = c5062;
                    if (!C1504.f5354) {
                        i12 = i2;
                        iM2567 = (C2105.m6981("֫֨") ^ i24) * 11;
                        i13 = ((iM2567 ^ i23) * (-17975)) ^ (-1473162823);
                        i14 = 1729109509;
                        i27 = iM2567 ^ i14;
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
                        c19258M5912 = c19258;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        iM2569 = iM2569;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr12;
                        z2 = z2;
                        z = z;
                        interfaceC12345 = interfaceC12345;
                        checkBox5 = checkBox5;
                        interfaceC12347 = interfaceC12347;
                        interfaceC12346 = interfaceC12346;
                        strM2575 = strM2575;
                        i28 = i28;
                        interfaceC12348 = interfaceC12348;
                    } else {
                        sArr = sArr12;
                        z2 = z2;
                        int iM69812 = (i24 - C2105.m6981("᩺ܽ")) * (-113);
                        int i310 = i2;
                        i26 = ((iM69812 ^ i23) * (-30387)) ^ (-337495545);
                        i27 = iM69812 ^ (-1659767500);
                        sArr9 = sArr2;
                        z = z;
                        sArr10 = sArr3;
                        i33 = i4;
                        onClickListener4 = onClickListener;
                        i32 = i3;
                        i35 = i310;
                        checkBox7 = checkBox;
                        interfaceC12345 = interfaceC12345;
                        spinner3 = spinner;
                        c19258M5912 = c19258;
                        checkBox5 = checkBox5;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        interfaceC12347 = interfaceC12347;
                        iM2569 = iM2569;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr;
                        interfaceC12346 = interfaceC12346;
                        i34 = i;
                        strM2575 = strM2575;
                        view2 = view;
                        i28 = i28;
                        interfaceC12348 = interfaceC12348;
                    }
                    break;
                case -542803917:
                case 106352895:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC12348 = interfaceC12348;
                    view = view2;
                    int i57 = i34;
                    i28 = i28;
                    strM2575 = strM2575;
                    interfaceC12346 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    DialogInterface.OnClickListener onClickListener11 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC12345 = interfaceC12345;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM2569 = iM2569;
                    i29 = i29;
                    C19258 c19259 = c19258M5912;
                    short[] sArr22 = sArr9;
                    int i58 = i32;
                    Spinner spinner4 = (Spinner) C1005.m3507(view, C0630.m2566(C3245.m9934(sArr22, i58, 3, i25)) ^ 2118401314);
                    int iM69813 = (C2105.m6981("۟ܺ") ^ i23) * 61;
                    i26 = ((iM69813 ^ i24) * 14977) ^ (-1191590254);
                    i27 = iM69813 ^ (-190420695);
                    sArr9 = sArr22;
                    i32 = i58;
                    c19258M5912 = c19259;
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
                    iM2569 = iM2569;
                    checkBox3 = checkBox3;
                    sArr12 = sArr12;
                    onCheckedChangeListener = onCheckedChangeListener;
                    z2 = z2;
                    z = z;
                    interfaceC12345 = interfaceC12345;
                    checkBox5 = checkBox5;
                    interfaceC12347 = interfaceC12347;
                    interfaceC12346 = interfaceC12346;
                    strM2575 = strM2575;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    break;
                case -495698584:
                case 234573374:
                    onCheckedChangeListener = onCheckedChangeListener;
                    i12 = i35;
                    checkBox = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC12348 = interfaceC12348;
                    view = view2;
                    sArr2 = sArr9;
                    i3 = i32;
                    i4 = i33;
                    i = i34;
                    i28 = i28;
                    strM2575 = strM2575;
                    interfaceC12346 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC12345 = interfaceC12345;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM2569 = iM2569;
                    i29 = i29;
                    c19258 = c19258M5912;
                    spinner = spinner3;
                    sArr3 = sArr10;
                    C2105.m6978(textView, iM6984 ^ 2100806971);
                    strM3396 = C0964.m3396(f32330, 10, 3, i25);
                    iM2567 = C0630.m2566("֫ۙ") ^ i23;
                    i13 = ((iM2567 ^ i24) * 15857) ^ (-414082553);
                    i14 = 216879162;
                    i27 = iM2567 ^ i14;
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
                    c19258M5912 = c19258;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM2569 = iM2569;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC12345 = interfaceC12345;
                    checkBox5 = checkBox5;
                    interfaceC12347 = interfaceC12347;
                    interfaceC12346 = interfaceC12346;
                    strM2575 = strM2575;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    break;
                case -287830925:
                case 1733219842:
                    InterfaceC12344 interfaceC123423 = interfaceC12347;
                    interfaceC12348 = interfaceC12348;
                    view = view2;
                    i17 = i34;
                    checkBox5 = checkBox5;
                    i28 = i28;
                    CheckBox checkBox21 = checkBox3;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener3 = onClickListener4;
                    short[] sArr23 = sArr12;
                    iM2569 = iM2569;
                    boolean z12 = z2;
                    sArr12 = sArr23;
                    interfaceC12347 = interfaceC123423;
                    checkBox = checkBox7;
                    z2 = z12;
                    onCheckedChangeListener = onCheckedChangeListener;
                    i29 = i29;
                    checkBox3 = checkBox21;
                    c19258 = c19258M5912;
                    onItemSelected(adapterView, view3, selectedItemPosition, j);
                    spinner = spinner3;
                    spinner.setOnItemSelectedListener(this);
                    InterfaceC12344 interfaceC123424 = ApplicationC20075.f65008;
                    if (C3245.f10203 > 0) {
                        int iM25618 = C0630.m2566("ܶᩳ") ^ i24;
                        int i59 = ((iM25618 ^ i23) * (-19461)) ^ (-949951623);
                        i27 = iM25618 ^ 2073631956;
                        spinner3 = spinner;
                        c19258M5912 = c19258;
                        checkBox5 = checkBox5;
                        i28 = i28;
                        i34 = i17;
                        interfaceC12348 = interfaceC12348;
                        checkBox7 = checkBox;
                        i29 = i29;
                        view2 = view;
                        interfaceC12347 = interfaceC12347;
                        iM2569 = iM2569;
                        interfaceC12346 = interfaceC123424;
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
                        interfaceC12345 = interfaceC12345;
                        strM2575 = strM2575;
                        sArr6 = sArr10;
                        i16 = i33;
                        z = false;
                        interfaceC12346 = interfaceC123424;
                        i15 = i35;
                        iM6981 = C0630.m2566("ۡܺ") ^ i23;
                        i18 = ((iM6981 ^ i24) * (-22949)) ^ (-1103109619);
                        i19 = 799618161;
                        i27 = iM6981 ^ i19;
                        i35 = i15;
                        i26 = i18;
                        sArr10 = sArr6;
                        i33 = i16;
                        onClickListener4 = onClickListener3;
                        i34 = i17;
                        checkBox7 = checkBox;
                        spinner3 = spinner;
                        view2 = view;
                        c19258M5912 = c19258;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        iM2569 = iM2569;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr12;
                        z2 = z2;
                        z = z;
                        interfaceC12345 = interfaceC12345;
                        checkBox5 = checkBox5;
                        interfaceC12347 = interfaceC12347;
                        interfaceC12346 = interfaceC12346;
                        strM2575 = strM2575;
                        i28 = i28;
                        interfaceC12348 = interfaceC12348;
                    }
                    break;
                case -224387922:
                case 830310919:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox3 = checkBox3;
                    interfaceC12348 = interfaceC12348;
                    View view11 = view2;
                    int i60 = i34;
                    i28 = i28;
                    strM2575 = strM2575;
                    interfaceC12346 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    CheckBox checkBox22 = checkBox6;
                    int i61 = i30;
                    DialogInterface.OnClickListener onClickListener12 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC12345 = interfaceC12345;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM2569 = iM2569;
                    short[] sArr24 = sArr8;
                    int i62 = i31;
                    textView = (TextView) C1005.m3507(view11, C2105.m6981(C7811.m20837(sArr24, i62, 3, i25)) ^ 2099730548);
                    int iM25619 = (C0630.m2566("۠֫") + i24) * (-85);
                    i31 = i62;
                    sArr9 = sArr9;
                    sArr10 = sArr10;
                    i33 = i33;
                    onClickListener4 = onClickListener12;
                    i32 = i32;
                    i35 = i35;
                    sArr8 = sArr24;
                    checkBox7 = checkBox7;
                    i27 = iM25619 ^ 12897232;
                    i26 = ((iM25619 ^ i23) * (-23887)) ^ (-394610620);
                    spinner3 = spinner3;
                    c19258M5912 = c19258M5912;
                    i30 = i61;
                    checkBox6 = checkBox22;
                    i34 = i60;
                    i29 = i29;
                    view2 = view11;
                    checkBox3 = checkBox3;
                    iM2569 = iM2569;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC12345 = interfaceC12345;
                    checkBox5 = checkBox5;
                    interfaceC12347 = interfaceC12347;
                    interfaceC12346 = interfaceC12346;
                    strM2575 = strM2575;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    break;
                case -39361564:
                case 2030266251:
                    C3911.m11924();
                    onCheckedChangeListener = onCheckedChangeListener;
                    i7 = i35;
                    checkBox2 = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC12348 = interfaceC12348;
                    viewM9259 = view2;
                    sArr4 = sArr9;
                    i8 = i32;
                    i9 = i33;
                    i6 = i34;
                    i28 = i28;
                    main = mainM50612;
                    strM2575 = strM2575;
                    interfaceC12346 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener2 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC12345 = interfaceC12345;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM2569 = iM2569;
                    i29 = i29;
                    c19258 = c19258M5912;
                    spinner2 = spinner3;
                    sArr5 = sArr10;
                    iM2566 = C0630.m2566("ᩳ۫") ^ i24;
                    i10 = ((iM2566 ^ i23) * 6585) ^ (-298946454);
                    i11 = -1443599469;
                    i27 = iM2566 ^ i11;
                    mainM50612 = main;
                    sArr9 = sArr4;
                    sArr10 = sArr5;
                    i33 = i9;
                    onClickListener4 = onClickListener2;
                    i34 = i6;
                    i32 = i8;
                    i35 = i7;
                    checkBox7 = checkBox2;
                    view2 = viewM9259;
                    spinner3 = spinner2;
                    i26 = i10;
                    c19258M5912 = c19258;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM2569 = iM2569;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC12345 = interfaceC12345;
                    checkBox5 = checkBox5;
                    interfaceC12347 = interfaceC12347;
                    interfaceC12346 = interfaceC12346;
                    strM2575 = strM2575;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    break;
                case -26975226:
                case 871016342:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox3 = checkBox3;
                    InterfaceC12344 interfaceC123425 = interfaceC12348;
                    View view12 = view2;
                    int i63 = i34;
                    int i64 = i28;
                    boolean z13 = z;
                    checkBox6 = checkBox6;
                    boolean z14 = z2;
                    short[] sArr25 = sArr12;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    int i65 = iM2569;
                    int i66 = i29;
                    interfaceC12344 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox5 = checkBox5;
                    C19258 c192510 = c19258M5912;
                    Spinner spinner5 = spinner3;
                    InterfaceC12344 interfaceC123426 = interfaceC12345;
                    String str4 = strM2575;
                    spinner5.setSelection(interfaceC123426.getInt(str4, 0));
                    selectedItemPosition = spinner5.getSelectedItemPosition();
                    j = 0;
                    adapterView = null;
                    view3 = null;
                    int iM25620 = (C0630.m2566("ܳ֫") + i23) * (-17);
                    i27 = iM25620 ^ 1507038199;
                    i26 = ((iM25620 ^ i24) * (-17577)) ^ (-551239874);
                    strM2575 = str4;
                    spinner3 = spinner5;
                    c19258M5912 = c192510;
                    i28 = i64;
                    i34 = i63;
                    interfaceC12348 = interfaceC123425;
                    checkBox7 = checkBox7;
                    i29 = i66;
                    view2 = view12;
                    iM2569 = i65;
                    sArr12 = sArr25;
                    z2 = z14;
                    z = z13;
                    interfaceC12345 = interfaceC123426;
                    checkBox5 = checkBox5;
                    interfaceC12347 = interfaceC12347;
                    interfaceC12346 = interfaceC12344;
                    onClickListener4 = onClickListener;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    checkBox3 = checkBox3;
                    onCheckedChangeListener = onCheckedChangeListener;
                    break;
                case 4530172:
                case 232100913:
                    view = view2;
                    this.f32338 = c16560;
                    this.f32339 = abstractC15440;
                    this.f32336 = str;
                    mainM50612 = C22628.m50612(c16560);
                    String strM10633 = RunnableC3474.m10633(f32330, 1, 3, i25);
                    int iM69814 = C2105.m6981("᩵֫") ^ i23;
                    i5 = ((iM69814 ^ i24) * 29943) ^ (-213163164);
                    sArr9 = sArr9;
                    sArr10 = sArr10;
                    i33 = i33;
                    i31 = i31;
                    i32 = i32;
                    i35 = i35;
                    sArr8 = sArr8;
                    checkBox7 = checkBox7;
                    str2 = strM10633;
                    i27 = iM69814 ^ 471032479;
                    i26 = i5;
                    spinner3 = spinner3;
                    c19258M5912 = c19258M5912;
                    onClickListener4 = onClickListener4;
                    i34 = i34;
                    i29 = i29;
                    view2 = view;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    iM2569 = iM2569;
                    checkBox3 = checkBox3;
                    sArr12 = sArr12;
                    onCheckedChangeListener = onCheckedChangeListener;
                    z2 = z2;
                    z = z;
                    interfaceC12345 = interfaceC12345;
                    checkBox5 = checkBox5;
                    interfaceC12347 = interfaceC12347;
                    interfaceC12346 = interfaceC12346;
                    strM2575 = strM2575;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    break;
                case 19763748:
                case 729192396:
                    view = view2;
                    CheckBox checkBox23 = (CheckBox) C1005.m3507(view, iM6985 ^ 2101011924);
                    this.f32337 = checkBox23;
                    sArr10 = f32330;
                    i33 = 22;
                    int iM69815 = (C2105.m6981("ۡ᩵") ^ i24) * 69;
                    i5 = ((iM69815 ^ i23) * (-4525)) ^ 1728920033;
                    i27 = iM69815 ^ 646331363;
                    checkBox7 = checkBox23;
                    i26 = i5;
                    spinner3 = spinner3;
                    c19258M5912 = c19258M5912;
                    onClickListener4 = onClickListener4;
                    i34 = i34;
                    i29 = i29;
                    view2 = view;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    iM2569 = iM2569;
                    checkBox3 = checkBox3;
                    sArr12 = sArr12;
                    onCheckedChangeListener = onCheckedChangeListener;
                    z2 = z2;
                    z = z;
                    interfaceC12345 = interfaceC12345;
                    checkBox5 = checkBox5;
                    interfaceC12347 = interfaceC12347;
                    interfaceC12346 = interfaceC12346;
                    strM2575 = strM2575;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    break;
                case 759343253:
                case 1424071905:
                    onCheckedChangeListener = onCheckedChangeListener;
                    checkBox = checkBox7;
                    z = z;
                    checkBox3 = checkBox3;
                    interfaceC12348 = interfaceC12348;
                    z2 = z2;
                    short[] sArr26 = sArr12;
                    view = view2;
                    i = i34;
                    i28 = i28;
                    iM2569 = iM2569;
                    i29 = i29;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener = onClickListener4;
                    c19258 = c19258M5912;
                    spinner = spinner3;
                    interfaceC12344 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox5 = checkBox5;
                    this.f32341 = checkBox3;
                    InterfaceC12344 interfaceC123427 = ApplicationC20075.f65008;
                    strM2575 = C0630.m2575(f32330, 34, 16, i25);
                    if (ServiceConnectionC3453.f10921 < 0) {
                        int iM25621 = (C0630.m2566("ۧۛ") + i24) * (-113);
                        int i67 = ((iM25621 ^ i23) * (-17825)) ^ (-1422533059);
                        i27 = iM25621 ^ (-1486401290);
                        spinner3 = spinner;
                        c19258M5912 = c19258;
                        i28 = i28;
                        i34 = i;
                        interfaceC12348 = interfaceC12348;
                        checkBox7 = checkBox;
                        i29 = i29;
                        view2 = view;
                        iM2569 = iM2569;
                        sArr12 = sArr26;
                        z2 = z2;
                        z = z;
                        interfaceC12345 = interfaceC123427;
                        i26 = i67;
                        checkBox5 = checkBox5;
                        interfaceC12347 = interfaceC12347;
                        interfaceC12346 = interfaceC12344;
                        onClickListener4 = onClickListener;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        checkBox3 = checkBox3;
                        onCheckedChangeListener = onCheckedChangeListener;
                    } else {
                        interfaceC12345 = interfaceC123427;
                        i2 = i35;
                        strM2575 = strM2575;
                        sArr = sArr26;
                        sArr2 = sArr9;
                        i3 = i32;
                        sArr3 = sArr10;
                        i4 = i33;
                        interfaceC12346 = interfaceC12344;
                        z2 = z2;
                        int iM69816 = (i24 - C2105.m6981("᩺ܽ")) * (-113);
                        int i311 = i2;
                        i26 = ((iM69816 ^ i23) * (-30387)) ^ (-337495545);
                        i27 = iM69816 ^ (-1659767500);
                        sArr9 = sArr2;
                        z = z;
                        sArr10 = sArr3;
                        i33 = i4;
                        onClickListener4 = onClickListener;
                        i32 = i3;
                        i35 = i311;
                        checkBox7 = checkBox;
                        interfaceC12345 = interfaceC12345;
                        spinner3 = spinner;
                        c19258M5912 = c19258;
                        checkBox5 = checkBox5;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        interfaceC12347 = interfaceC12347;
                        iM2569 = iM2569;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr;
                        interfaceC12346 = interfaceC12346;
                        i34 = i;
                        strM2575 = strM2575;
                        view2 = view;
                        i28 = i28;
                        interfaceC12348 = interfaceC12348;
                    }
                    break;
                case 858085345:
                case 1253758154:
                    i6 = i34;
                    onCheckedChangeListener = onCheckedChangeListener;
                    i7 = i35;
                    checkBox2 = checkBox7;
                    checkBox3 = checkBox3;
                    interfaceC12348 = interfaceC12348;
                    sArr4 = sArr9;
                    i8 = i32;
                    i9 = i33;
                    i28 = i28;
                    strM2575 = strM2575;
                    interfaceC12346 = interfaceC12346;
                    interfaceC12347 = interfaceC12347;
                    checkBox6 = checkBox6;
                    i30 = i30;
                    onClickListener2 = onClickListener4;
                    checkBox5 = checkBox5;
                    interfaceC12345 = interfaceC12345;
                    z = z;
                    z2 = z2;
                    sArr12 = sArr12;
                    iM2569 = iM2569;
                    i29 = i29;
                    c19258 = c19258M5912;
                    spinner2 = spinner3;
                    sArr5 = sArr10;
                    main = mainM50612;
                    viewM9259 = C3019.m9259(main, C2105.m6981(str2) ^ 2127917453);
                    sArr8 = f32330;
                    i31 = 4;
                    if (C2272.f7362) {
                        iM2566 = C0630.m2566("ᩳ۫") ^ i24;
                        i10 = ((iM2566 ^ i23) * 6585) ^ (-298946454);
                        i11 = -1443599469;
                    } else {
                        iM2566 = (C0630.m2566("֫ܳ") + i24) * (-3);
                        i10 = ((iM2566 ^ i23) * 32207) ^ (-1734863568);
                        i11 = 1910470970;
                    }
                    i27 = iM2566 ^ i11;
                    mainM50612 = main;
                    sArr9 = sArr4;
                    sArr10 = sArr5;
                    i33 = i9;
                    onClickListener4 = onClickListener2;
                    i34 = i6;
                    i32 = i8;
                    i35 = i7;
                    checkBox7 = checkBox2;
                    view2 = viewM9259;
                    spinner3 = spinner2;
                    i26 = i10;
                    c19258M5912 = c19258;
                    i30 = i30;
                    checkBox6 = checkBox6;
                    i29 = i29;
                    checkBox3 = checkBox3;
                    iM2569 = iM2569;
                    onCheckedChangeListener = onCheckedChangeListener;
                    sArr12 = sArr12;
                    z2 = z2;
                    z = z;
                    interfaceC12345 = interfaceC12345;
                    checkBox5 = checkBox5;
                    interfaceC12347 = interfaceC12347;
                    interfaceC12346 = interfaceC12346;
                    strM2575 = strM2575;
                    i28 = i28;
                    interfaceC12348 = interfaceC12348;
                    break;
                case 929545219:
                case 1318898520:
                    onClickListener4 = null;
                    C1294.m4380(c19258M5912, iM6983, null);
                    i28 = 3;
                    iM2569 = C0630.m2566(C3245.m9934(f32330, 151, 3, i25)) ^ 2124788143;
                    sArr13 = f32330;
                    i34 = EnumC17734.f54268;
                    iM2568 = C2105.m6981("ܳ۬") ^ i23;
                    i20 = ((iM2568 ^ i24) * (-25613)) ^ (-1435026868);
                    i21 = 544219178;
                    i27 = iM2568 ^ i21;
                    i26 = i20;
                    break;
                default:
                    onClickListener = onClickListener4;
                    i28 = i28;
                    iM2569 = iM2569;
                    CheckBox checkBox24 = checkBox3;
                    view = view2;
                    i = i34;
                    CheckBox checkBox25 = checkBox6;
                    C0714.m2802(checkBox25, C0964.m3400(ApplicationC20075.f65008, C1047.m3603(f32330, 89, 15, i25), true));
                    InterfaceC12344 interfaceC123428 = ApplicationC20075.f65008;
                    short[] sArr27 = f32330;
                    i30 = IShizukuService.Stub.TRANSACTION_isHidden;
                    if (C7811.f24123 >= 0) {
                        interfaceC12348 = interfaceC123428;
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
                        c19258 = c19258M5912;
                        strM2575 = strM2575;
                        spinner = spinner3;
                        interfaceC12346 = interfaceC12346;
                        interfaceC12347 = interfaceC12347;
                        sArr3 = sArr10;
                        checkBox5 = checkBox5;
                        interfaceC12345 = interfaceC12345;
                        z = z;
                        int iM69817 = (i24 - C2105.m6981("᩺ܽ")) * (-113);
                        int i312 = i2;
                        i26 = ((iM69817 ^ i23) * (-30387)) ^ (-337495545);
                        i27 = iM69817 ^ (-1659767500);
                        sArr9 = sArr2;
                        z = z;
                        sArr10 = sArr3;
                        i33 = i4;
                        onClickListener4 = onClickListener;
                        i32 = i3;
                        i35 = i312;
                        checkBox7 = checkBox;
                        interfaceC12345 = interfaceC12345;
                        spinner3 = spinner;
                        c19258M5912 = c19258;
                        checkBox5 = checkBox5;
                        i30 = i30;
                        checkBox6 = checkBox6;
                        i29 = i29;
                        checkBox3 = checkBox3;
                        interfaceC12347 = interfaceC12347;
                        iM2569 = iM2569;
                        onCheckedChangeListener = onCheckedChangeListener;
                        sArr12 = sArr;
                        interfaceC12346 = interfaceC12346;
                        i34 = i;
                        strM2575 = strM2575;
                        view2 = view;
                        i28 = i28;
                        interfaceC12348 = interfaceC12348;
                    } else {
                        int iM25622 = (C0630.m2566("ܽܰ") ^ i23) * 49;
                        int i68 = ((iM25622 ^ i24) * (-28015)) ^ (-302323877);
                        i27 = iM25622 ^ 1714901616;
                        checkBox6 = checkBox25;
                        checkBox3 = checkBox24;
                        i28 = i28;
                        i34 = i;
                        z2 = true;
                        interfaceC12348 = interfaceC123428;
                        i26 = i68;
                        view2 = view;
                        onClickListener4 = onClickListener;
                        i30 = IShizukuService.Stub.TRANSACTION_isHidden;
                        sArr12 = sArr27;
                        iM2569 = iM2569;
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
        int iM2566;
        int i2;
        int i3;
        int iM6572;
        int iM6573;
        String strM6573;
        String str;
        String str2;
        String str3;
        String strM12578;
        String str4;
        int iM6981;
        int i4;
        int i5;
        int iM6982;
        int i6;
        int i7;
        int iM2567;
        int i8;
        int i9;
        boolean z;
        int iM6983;
        int i10;
        int iM2568;
        int i11;
        int i12;
        int iM2569;
        int i13;
        int i14;
        int selectedItemPosition = 0;
        boolean zM2804 = false;
        boolean zM7157 = false;
        boolean z2 = false;
        String strM1844 = null;
        int iM25001 = 0;
        String str5 = null;
        Exception exc = null;
        int iM24993 = 0;
        C12164 c12164 = null;
        C12164 c12165 = null;
        String str6 = null;
        int i15 = 0;
        int i16 = 0;
        String strM10478 = null;
        int i17 = 962913229;
        int i18 = C3746.f11829;
        int i19 = C2167.f7158;
        int iM25610 = (i18 - C0630.m2566("ܿ֨")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i20 = ((iM25610 ^ i19) * (-7261)) ^ (-991160277);
        int i21 = iM25610 ^ 1778434368;
        C16560 c16560 = null;
        C12164 c12164Matcher = null;
        String str7 = null;
        String strM11219 = null;
        int i22 = 0;
        boolean zM7158 = false;
        boolean zM7159 = false;
        String str8 = null;
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        Exception exc2 = null;
        String str9 = null;
        C5062 c5062 = null;
        String str10 = null;
        C12164 c12166 = null;
        String str11 = null;
        int i23 = 0;
        int iM25611 = 0;
        C5062 c5063 = null;
        String str12 = null;
        boolean z3 = false;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i19) * 26893) >> 31));
            switch (i17) {
                case -2130928939:
                case -2037467155:
                    str12 = str12;
                    c5063 = c5063;
                    zM7157 = zM7157;
                    z3 = z3;
                    str9 = str9;
                    strM11219 = strM11219;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (!C0798.m3001()) {
                        iM6982 = C2105.m6981("ۜ۫") ^ i19;
                        i6 = ((iM6982 ^ i18) * 30647) ^ (-321862454);
                        i7 = 1360403449;
                        int i24 = iM6982 ^ i7;
                        strM11219 = strM11219;
                        z3 = z3;
                        zM7157 = zM7157;
                        str12 = str12;
                        c5063 = c5063;
                        i21 = i24;
                        i20 = i6;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    } else {
                        z3 = z3;
                        iM2567 = C0630.m2566("ۙۡ") ^ i18;
                        i8 = ((iM2567 ^ i19) * 20429) ^ (-906444676);
                        i9 = -684453532;
                        int i25 = iM2567 ^ i9;
                        strM11219 = strM11219;
                        zM7157 = zM7157;
                        str12 = str12;
                        str10 = str10;
                        i21 = i25;
                        i20 = i8;
                        str7 = str7;
                        c5063 = c5063;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case -2043314842:
                case -967897130:
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    if (C9896.m24999(strM1844)) {
                        iM2566 = C0630.m2566("۫ܿ") ^ i19;
                        i2 = ((iM2566 ^ i18) * (-2571)) ^ (-1710801119);
                        i3 = -1392994342;
                    } else {
                        iM2566 = (C0630.m2566("ܺܿ") + i19) * 115;
                        i2 = ((iM2566 ^ i18) * 15733) ^ (-611428768);
                        i3 = -1208071604;
                    }
                    i21 = iM2566 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM7157 = zM7157;
                    break;
                case -2009052080:
                case 306920398:
                    C22628.m50612(c16560).m10217(C2105.m6981(C4075.m12252(f32330, 167, 3, i22)) ^ 2122061308, C2105.m6981(RunnableC1108.m3789(f32330, 170, 3, i22)) ^ 2128806274, z3);
                    break;
                case -2008366963:
                case -840662134:
                    str12 = str12;
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    strM11219 = strM11219;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (selectedItemPosition != 3) {
                        iM2567 = (C2105.m6981("ܽۖ") ^ i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((iM2567 ^ i19) * (-415)) ^ 921883071;
                        i9 = 982608946;
                    } else {
                        iM2567 = (C2105.m6981("᩷ܳ") + i19) * 89;
                        i8 = ((iM2567 ^ i18) * (-11141)) ^ 1264560833;
                        i9 = -1584241485;
                    }
                    int i26 = iM2567 ^ i9;
                    strM11219 = strM11219;
                    zM7157 = zM7157;
                    str12 = str12;
                    str10 = str10;
                    i21 = i26;
                    i20 = i8;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1977576723:
                case 1970797650:
                    str12 = str12;
                    c5063 = c5063;
                    zM7157 = zM7157;
                    z3 = z3;
                    str9 = str9;
                    strM11219 = strM11219;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    i23 = 1;
                    if (selectedItemPosition == 1) {
                        z = z2;
                        zM7157 = zM7157;
                        int iM25612 = C0630.m2566("ۢ᩻") ^ i18;
                        strM11219 = strM11219;
                        str12 = str12;
                        str9 = str9;
                        i21 = iM25612 ^ (-2127816814);
                        i20 = ((iM25612 ^ i19) * (-24183)) ^ (-1051050896);
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z;
                        z3 = z3;
                        c5063 = c5063;
                    } else {
                        iM6982 = C2105.m6981("ۤ۠") ^ i19;
                        i6 = ((iM6982 ^ i18) * (-5725)) ^ 1441957451;
                        i7 = 1871475829;
                        int i27 = iM6982 ^ i7;
                        strM11219 = strM11219;
                        z3 = z3;
                        zM7157 = zM7157;
                        str12 = str12;
                        c5063 = c5063;
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
                    RunnableC0588.m2440(C4616.m13559(exc2));
                    C0798.m3010(c5062);
                    break;
                case -1890597932:
                case -249430992:
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    str = strM11219;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    String strM3603 = C1047.m3603(f32330, PicnicEngine.MAX_AUX_BYTES, 2, i22);
                    boolean zM13554 = C4616.m13554(str8, strM3603);
                    str11 = strM3603;
                    strM6573 = AbstractC2021.m6573(f32330, 178, 2, i22);
                    if (zM13554) {
                        iM6983 = C2105.m6981("᩷᩶") ^ i19;
                        i6 = ((iM6983 ^ i18) * (-5347)) ^ (-1042345314);
                        i10 = -1435839392;
                    } else {
                        iM6983 = (C0630.m2566("ۧܳ") ^ i18) * 31;
                        i6 = ((iM6983 ^ i19) * 10233) ^ (-2123101332);
                        i10 = -1692922261;
                    }
                    i21 = iM6983 ^ i10;
                    c5063 = c5063;
                    strM11219 = str;
                    zM7157 = zM7157;
                    str12 = strM6573;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1831167903:
                case 1435373461:
                    C3663.m11161(iM25611);
                    C1711.m5740(c5063);
                    break;
                case -1828432917:
                case -1502252338:
                    str12 = str12;
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    strM11219 = strM11219;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (selectedItemPosition != 4) {
                        c12165 = c12166;
                        str5 = str10;
                        iM2567 = C0630.m2566("ۨۡ") ^ i19;
                        i8 = ((iM2567 ^ i18) * (-15831)) ^ (-1284239432);
                        i9 = 1135315253;
                    } else {
                        iM2567 = C2105.m6981("᩷ܽ") ^ i19;
                        i8 = ((iM2567 ^ i18) * 16817) ^ (-1193401752);
                        i9 = -887581781;
                    }
                    int i28 = iM2567 ^ i9;
                    strM11219 = strM11219;
                    zM7157 = zM7157;
                    str12 = str12;
                    str10 = str10;
                    i21 = i28;
                    i20 = i8;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1748615274:
                case 307045419:
                    str12 = str12;
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    strM11219 = strM11219;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (zM7158) {
                        iM2567 = C0630.m2566("ܳۤ") ^ i18;
                        i8 = ((iM2567 ^ i19) * 28671) ^ (-1581088054);
                        i9 = -376017632;
                    } else {
                        iM2567 = C0630.m2566("ۡۧ") ^ i19;
                        i8 = ((iM2567 ^ i18) * (-20227)) ^ (-277683476);
                        i9 = -598447059;
                    }
                    int i29 = iM2567 ^ i9;
                    strM11219 = strM11219;
                    zM7157 = zM7157;
                    str12 = str12;
                    str10 = str10;
                    i21 = i29;
                    i20 = i8;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1720230613:
                case 1933514393:
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    strM1844 = C0382.m1844(str8, 2);
                    iM2566 = (C2105.m6981("۬֡") + i19) * 61;
                    i2 = ((iM2566 ^ i18) * (-11969)) ^ 1648907654;
                    i3 = 261935737;
                    i21 = iM2566 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM7157 = zM7157;
                    break;
                case -1694639638:
                case 797246232:
                    zM7157 = zM7157;
                    str9 = str9;
                    z2 = z2;
                    c5063 = c5063;
                    str8 = str8;
                    str6 = str5;
                    c12164 = c12165;
                    str7 = str7;
                    i15 = 0;
                    i16 = 0;
                    iM2566 = C2105.m6981("᩷۬") ^ i19;
                    i2 = ((iM2566 ^ i18) * (-14939)) ^ 1270560680;
                    i3 = 863511363;
                    i21 = iM2566 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM7157 = zM7157;
                    break;
                case -1477976392:
                case -753995499:
                    i22 = 43992;
                    iM6982 = C0630.m2566("ۘ۫") ^ i18;
                    i6 = ((iM6982 ^ i19) * (-32357)) ^ (-94650951);
                    i7 = 1525417834;
                    int i210 = iM6982 ^ i7;
                    strM11219 = strM11219;
                    z3 = z3;
                    zM7157 = zM7157;
                    str12 = str12;
                    c5063 = c5063;
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
                    C3683.m11220(C4117.m12351(ServiceConnectionC3453.m10562(C0630.m2566(AbstractC2021.m6573(f32330, 207, 3, i22)) ^ 2099890846), str9));
                    C1711.m5740(c5062);
                    break;
                case -1309834583:
                case -396142854:
                    str12 = str12;
                    c5063 = c5063;
                    z3 = z3;
                    str8 = str8;
                    str9 = str9;
                    str7 = str7;
                    strM11219 = strM11219;
                    str10 = str10;
                    zM7158 = C2167.m7157(this.f32332);
                    zM2804 = C0714.m2804(this.f32334);
                    zM7159 = C2167.m7157(this.f32337);
                    zM7157 = C2167.m7157(this.f32331);
                    boolean zM71510 = C2167.m7157(this.f32341);
                    if (selectedItemPosition != 0) {
                        int iM6984 = C2105.m6981("᩻᩻") ^ i18;
                        z = zM71510;
                        i20 = ((iM6984 ^ i19) * 22911) ^ 471047778;
                        strM11219 = strM11219;
                        str12 = str12;
                        str9 = str9;
                        i21 = iM6984 ^ (-319122072);
                    } else {
                        z = zM71510;
                        int iM25613 = C0630.m2566("ۢ᩻") ^ i18;
                        strM11219 = strM11219;
                        str12 = str12;
                        str9 = str9;
                        i21 = iM25613 ^ (-2127816814);
                        i20 = ((iM25613 ^ i19) * (-24183)) ^ (-1051050896);
                    }
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z;
                    z3 = z3;
                    c5063 = c5063;
                    break;
                case -1266908423:
                case 759012265:
                    C1504.m5167(iM25611);
                    C1711.m5740(c5062);
                    break;
                case -1249464621:
                case 923930347:
                    zM7157 = zM7157;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    iM25001 = C9896.m25001(C3432.m10478(str8, i23));
                    c5063 = c5063;
                    String str13 = str7;
                    if (C7811.m20838(str10, str13)) {
                        iM2566 = (i18 - C2105.m6981("ۙۜ")) * (-7);
                        str7 = str13;
                        i2 = ((iM2566 ^ i19) * (-32619)) ^ 360752531;
                        i3 = -944456080;
                    } else {
                        str7 = str13;
                        iM2566 = C0630.m2566("ۜ᩻") ^ i18;
                        i2 = ((iM2566 ^ i19) * (-7977)) ^ 818047213;
                        i3 = 1410551334;
                    }
                    i21 = iM2566 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM7157 = zM7157;
                    break;
                case -1227217873:
                case -3458311:
                    str12 = str12;
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    strM11219 = strM11219;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    c12166 = null;
                    if (selectedItemPosition != 2) {
                        iM2567 = C2105.m6981("ۧ۫") ^ i18;
                        i8 = ((iM2567 ^ i19) * 3859) ^ (-542682910);
                        i9 = -1422059637;
                    } else {
                        iM2567 = C2105.m6981("᩷ܽ") ^ i19;
                        i8 = ((iM2567 ^ i18) * 16817) ^ (-1193401752);
                        i9 = -887581781;
                    }
                    int i211 = iM2567 ^ i9;
                    strM11219 = strM11219;
                    zM7157 = zM7157;
                    str12 = str12;
                    str10 = str10;
                    i21 = i211;
                    i20 = i8;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1032669046:
                case 1974388296:
                    zM7157 = zM7157;
                    str9 = str9;
                    iM24993 = C9896.m24993(strM1844);
                    z2 = z2;
                    String str14 = str11;
                    if (C4616.m13554(str10, str14)) {
                        str11 = str14;
                        iM6981 = C2105.m6981("᩺֡") ^ i18;
                        i4 = ((iM6981 ^ i19) * 19007) ^ 1778497627;
                        i5 = 586909330;
                    } else {
                        iM6981 = C2105.m6981("ۧܺ") ^ i19;
                        str11 = str14;
                        i4 = ((iM6981 ^ i18) * 24107) ^ (-363522122);
                        i5 = -1845836387;
                    }
                    i21 = iM6981 ^ i5;
                    i20 = i4;
                    z2 = z2;
                    str9 = str9;
                    zM7157 = zM7157;
                    break;
                case -881959401:
                case 1143075856:
                    strM10478 = C3432.m10478(str10, 2);
                    iM2569 = (i18 - C0630.m2566("ܽ᩶")) * (-121);
                    i13 = ((iM2569 ^ i19) * (-28827)) ^ (-2044872141);
                    i14 = 821733968;
                    i21 = iM2569 ^ i14;
                    i20 = i13;
                    break;
                case -859792722:
                case 830056027:
                    C1504.m5172(dialogInterfaceC0206);
                    break;
                case -766523444:
                case 1405754300:
                    C3663.m11161(C2105.m6981(C0237.m1483(f32330, 334, 3, i22)) ^ 2101922057);
                    C0798.m3010(c5063);
                    break;
                case -668712848:
                case 140602869:
                    str12 = str12;
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    strM11219 = strM11219;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    selectedItemPosition = this.f32342.getSelectedItemPosition();
                    c16560 = this.f32338;
                    z3 = false;
                    if (selectedItemPosition == 0) {
                        iM2567 = (C0630.m2566("۟ۗ") + i19) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i8 = ((iM2567 ^ i18) * 35) ^ (-577813759);
                        i9 = -737272381;
                    } else {
                        iM2567 = C0630.m2566("ۙۡ") ^ i18;
                        i8 = ((iM2567 ^ i19) * 20429) ^ (-906444676);
                        i9 = -684453532;
                    }
                    int i212 = iM2567 ^ i9;
                    strM11219 = strM11219;
                    zM7157 = zM7157;
                    str12 = str12;
                    str10 = str10;
                    i21 = i212;
                    i20 = i8;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -640746055:
                case -280941252:
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    if (!C7811.m20838(str8, str12)) {
                        strM1844 = str8;
                        iM2566 = (C2105.m6981("۬֡") + i19) * 61;
                        i2 = ((iM2566 ^ i18) * (-11969)) ^ 1648907654;
                        i3 = 261935737;
                        i21 = iM2566 ^ i3;
                        i20 = i2;
                        str7 = str7;
                        c5063 = c5063;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        zM7157 = zM7157;
                    } else {
                        strM6573 = str12;
                        str10 = str10;
                        str9 = str9;
                        str = strM11219;
                        iM6983 = C2105.m6981("᩷᩶") ^ i19;
                        i6 = ((iM6983 ^ i18) * (-5347)) ^ (-1042345314);
                        i10 = -1435839392;
                        i21 = iM6983 ^ i10;
                        c5063 = c5063;
                        strM11219 = str;
                        zM7157 = zM7157;
                        str12 = strM6573;
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
                    iM6573 = C9896.m25001(C3432.m10478(str10, i23));
                    iM6572 = iM25001;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    i16 = iM6573;
                    i15 = iM6572;
                    str6 = str10;
                    c12164 = c12166;
                    iM2566 = C2105.m6981("᩷۬") ^ i19;
                    i2 = ((iM2566 ^ i18) * (-14939)) ^ 1270560680;
                    i3 = 863511363;
                    i21 = iM2566 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM7157 = zM7157;
                    break;
                case -431244925:
                case 565628015:
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    if (!C9896.m24997(C0382.m1844(str8, i23))) {
                        str2 = str12;
                        str3 = str10;
                        strM12578 = str9;
                        str4 = strM11219;
                        iM2568 = (C0630.m2566("ᩳۤ") ^ i19) * (-103);
                        i11 = ((iM2568 ^ i18) * (-26441)) ^ 584296304;
                        i12 = 1068875967;
                        int i30 = iM2568 ^ i12;
                        strM11219 = str4;
                        zM7157 = zM7157;
                        str12 = str2;
                        i21 = i30;
                        c5063 = c5063;
                        boolean z4 = z2;
                        str9 = strM12578;
                        i20 = i11;
                        str10 = str3;
                        str7 = str7;
                        str8 = str8;
                        z2 = z4;
                    } else {
                        iM2566 = C0630.m2566("ܶۛ") ^ i18;
                        i2 = ((iM2566 ^ i19) * 8269) ^ 16157654;
                        i3 = -748748717;
                        i21 = iM2566 ^ i3;
                        i20 = i2;
                        str7 = str7;
                        c5063 = c5063;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        zM7157 = zM7157;
                    }
                    break;
                case -403328850:
                case 1144055348:
                    str12 = str12;
                    c5063 = c5063;
                    zM7157 = zM7157;
                    z3 = z3;
                    str9 = str9;
                    strM11219 = strM11219;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    try {
                        c12164Matcher = C3058.m9359(str8, zM2804, zM7159).matcher((CharSequence) "");
                        iM6982 = (C0630.m2566("ۤ֫") + i18) * 57;
                        i6 = ((iM6982 ^ i19) * (-19853)) ^ 971394475;
                        i7 = -526985634;
                    } catch (Exception e) {
                        exc2 = e;
                        iM6982 = (i18 - C0630.m2566("᩻᩹")) * 93;
                        i6 = ((iM6982 ^ i19) * 10709) ^ (-393780802);
                        i7 = -736020783;
                    }
                    int i213 = iM6982 ^ i7;
                    strM11219 = strM11219;
                    z3 = z3;
                    zM7157 = zM7157;
                    str12 = str12;
                    c5063 = c5063;
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
                    c5062.m14610();
                    c5063.m14610();
                    C1916.m6302(C4616.m13549(C7811.m20835(C7811.m20835(C7811.m20835(C7811.m20835(ViewOnClickListenerC1958.m6438(ApplicationC20075.f65008).mo25853(selectedItemPosition, C0964.m3396(f32330, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 16, i22)), C4616.m13542(f32330, 233, 22, i22), zM7159), ServiceConnectionC3453.m10568(f32330, 255, 17, i22), zM2804), C0483.m2128(f32330, 272, 15, i22), zM7158), RunnableC1108.m3789(f32330, 287, 19, i22), zM7157), C1420.m4902(f32330, 306, 25, i22), z2));
                    C3663.m11167(dialogInterfaceC0206);
                    Main mainM49336 = C21923.m49336(c16560);
                    final int i31 = selectedItemPosition;
                    final C12164 c12167 = c12164;
                    final boolean z5 = zM2804;
                    final boolean z6 = z2;
                    final boolean z7 = zM7157;
                    final String str15 = str6;
                    final int i32 = i15;
                    final int i33 = i16;
                    C10025.m25197(new InterfaceC12846(this) { // from class: l.ۤۙܽ

                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC10732 f30264;

                        @Override // l.InterfaceC12846
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
                        @Override // l.InterfaceC12846
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo3776(C11667 c11667, boolean z8) {
                            int iM25614;
                            int i34;
                            int i35 = 2012566216;
                            int i36 = C7811.f24123;
                            int i37 = C1047.f3863;
                            int iM25615 = (C0630.m2566("ܳۙ") + i37) * 61;
                            int i38 = ((iM25615 ^ i36) * 19247) ^ 1072896003;
                            int i39 = iM25615 ^ (-1473474257);
                            ViewOnClickListenerC10732 viewOnClickListenerC10732 = null;
                            C12164 c12168 = null;
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
                                        if (C3245.f10203 <= 0) {
                                            iM25614 = (C2105.m6981("ܰᩳ") ^ i37) * (-13);
                                            i38 = ((iM25614 ^ i36) * 26915) ^ 1918720903;
                                            i34 = 1606070893;
                                        } else {
                                            iM25614 = (i36 - C2105.m6981("᩺᩷")) * (-17);
                                            i38 = ((iM25614 ^ i37) * (-8527)) ^ (-1439602543);
                                            i34 = 216356165;
                                        }
                                        i39 = iM25614 ^ i34;
                                        break;
                                    case -1925887552:
                                    case -380220112:
                                        C1916.m6308();
                                        C7106.m19120();
                                        iM25614 = (C0630.m2566("ۨۜ") + i37) * (-39);
                                        i38 = ((iM25614 ^ i36) * 15267) ^ (-864758845);
                                        i34 = -1182923251;
                                        i39 = iM25614 ^ i34;
                                        break;
                                    case -1889434701:
                                    case -1385567777:
                                        if (C4263.f13799 > 0) {
                                            iM25614 = (C0630.m2566("ۨۜ") + i37) * (-39);
                                            i38 = ((iM25614 ^ i36) * 15267) ^ (-864758845);
                                            i34 = -1182923251;
                                        } else {
                                            iM25614 = (C0630.m2566("ۢ۬") + i36) * (-123);
                                            i38 = ((iM25614 ^ i37) * (-11711)) ^ (-1218697780);
                                            i34 = 231872149;
                                        }
                                        i39 = iM25614 ^ i34;
                                        break;
                                    case -1657480127:
                                    case -56656977:
                                        int i43 = i33;
                                        viewOnClickListenerC10732 = this.f30264;
                                        i40 = i31;
                                        if (C1711.f5919) {
                                            i42 = i43;
                                            iM25614 = C0630.m2566("֫۫") ^ i37;
                                            i38 = ((iM25614 ^ i36) * (-18407)) ^ (-1698245600);
                                            i34 = 1159941939;
                                            i39 = iM25614 ^ i34;
                                        } else {
                                            int iM25616 = C0630.m2566("֫֫") ^ i37;
                                            i38 = ((iM25616 ^ i36) * 5927) ^ 195557702;
                                            i39 = iM25616 ^ (-2100260358);
                                            i42 = i43;
                                        }
                                        break;
                                    case -1322805172:
                                    case 1326900917:
                                        int i44 = i32;
                                        if (C3432.f10845 >= 0) {
                                            i41 = i44;
                                            iM25614 = C0630.m2566("֫۫") ^ i37;
                                            i38 = ((iM25614 ^ i36) * (-18407)) ^ (-1698245600);
                                            i34 = 1159941939;
                                            i39 = iM25614 ^ i34;
                                        } else {
                                            int iM25617 = (C0630.m2566("۠֨") + i36) * (-59);
                                            i38 = ((iM25617 ^ i37) * (-7461)) ^ 1592659896;
                                            i39 = iM25617 ^ 30369572;
                                            i41 = i44;
                                        }
                                        break;
                                    case -1156672935:
                                    case 1488098177:
                                        if (C5695.f17556 >= 0) {
                                            iM25614 = (C0630.m2566("ᩳܺ") + i36) * 101;
                                            i38 = ((iM25614 ^ i37) * 15315) ^ (-81979656);
                                            i34 = 988399898;
                                        } else {
                                            iM25614 = C2105.m6981("᩺ۜ") ^ i36;
                                            i38 = ((iM25614 ^ i37) * (-11091)) ^ (-987341063);
                                            i34 = 603458705;
                                        }
                                        i39 = iM25614 ^ i34;
                                        break;
                                    case -954154259:
                                    case -873757224:
                                        C2520.m8026();
                                        break;
                                    case -933495558:
                                    case -714700028:
                                        if (C3746.f11829 <= 0) {
                                            iM25614 = (C2105.m6981("ܰᩳ") ^ i37) * (-13);
                                            i38 = ((iM25614 ^ i36) * 26915) ^ 1918720903;
                                            i34 = 1606070893;
                                        } else {
                                            iM25614 = (C0630.m2566("ᩳܺ") + i36) * 101;
                                            i38 = ((iM25614 ^ i37) * 15315) ^ (-81979656);
                                            i34 = 988399898;
                                        }
                                        i39 = iM25614 ^ i34;
                                        break;
                                    case -847368947:
                                    case 601783315:
                                        if (C21923.f70183 != 0) {
                                            iM25614 = (C0630.m2566("ۨۜ") + i37) * (-39);
                                            i38 = ((iM25614 ^ i36) * 15267) ^ (-864758845);
                                            i34 = -1182923251;
                                        } else {
                                            iM25614 = C2105.m6981("ۢܿ") ^ i37;
                                            i38 = ((iM25614 ^ i36) * 3817) ^ (-1064914423);
                                            i34 = -662131903;
                                        }
                                        i39 = iM25614 ^ i34;
                                        break;
                                    case -628547199:
                                    case 1432965902:
                                        if (C22628.f73083 <= 0) {
                                            iM25614 = (C0630.m2566("ۢ۬") + i36) * (-123);
                                            i38 = ((iM25614 ^ i37) * (-11711)) ^ (-1218697780);
                                            i34 = 231872149;
                                        } else {
                                            iM25614 = C0630.m2566("֨֫") ^ i37;
                                            i38 = ((iM25614 ^ i36) * 28273) ^ (-2003232758);
                                            i34 = 1790063344;
                                        }
                                        i39 = iM25614 ^ i34;
                                        break;
                                    case -431738934:
                                    case 263704153:
                                        ViewOnClickListenerC10732.m26917(viewOnClickListenerC10732, i40, c12168, z9, z10, z7, str15, i41, i42, c11667, z8);
                                        break;
                                    case -406158694:
                                    case 902206541:
                                        if (C3911.f12484 >= 0) {
                                            iM25614 = (C0630.m2566("ۨۜ") + i37) * (-39);
                                            i38 = ((iM25614 ^ i36) * 15267) ^ (-864758845);
                                            i34 = -1182923251;
                                        } else {
                                            iM25614 = C0630.m2566("֨ۖ") ^ i37;
                                            i38 = ((iM25614 ^ i36) * 21621) ^ (-1834356776);
                                            i34 = 913711390;
                                        }
                                        i39 = iM25614 ^ i34;
                                        break;
                                    case 262676979:
                                    case 2136750167:
                                        c12168 = c12167;
                                        boolean z11 = z5;
                                        boolean z12 = z6;
                                        if (C3746.f11829 <= 0) {
                                            z9 = z11;
                                            z10 = z12;
                                            iM25614 = (C0630.m2566("ᩳܺ") + i36) * 101;
                                            i38 = ((iM25614 ^ i37) * 15315) ^ (-81979656);
                                            i34 = 988399898;
                                            i39 = iM25614 ^ i34;
                                        } else {
                                            int iM6985 = C2105.m6981("ܿۧ") ^ i36;
                                            i38 = ((iM6985 ^ i37) * 26043) ^ 116037073;
                                            i39 = iM6985 ^ (-1102582634);
                                            z9 = z11;
                                            z10 = z12;
                                        }
                                        break;
                                    case 263053948:
                                    case 1283956697:
                                        if (C0422.f1886 <= 0) {
                                            iM25614 = (C0630.m2566("ۨۜ") + i37) * (-39);
                                            i38 = ((iM25614 ^ i36) * 15267) ^ (-864758845);
                                            i34 = -1182923251;
                                        } else {
                                            iM25614 = (C2105.m6981("ܰᩳ") ^ i37) * (-13);
                                            i38 = ((iM25614 ^ i36) * 26915) ^ 1918720903;
                                            i34 = 1606070893;
                                        }
                                        i39 = iM25614 ^ i34;
                                        break;
                                    case 470100055:
                                    case 1441821365:
                                        if (C21923.m49329()) {
                                            iM25614 = C0630.m2566("֫۫") ^ i37;
                                            i38 = ((iM25614 ^ i36) * (-18407)) ^ (-1698245600);
                                            i34 = 1159941939;
                                        } else {
                                            iM25614 = (C2105.m6981("ۤܿ") + i37) * 45;
                                            i38 = ((iM25614 ^ i36) * (-27863)) ^ 988519250;
                                            i34 = 1863867832;
                                        }
                                        i39 = iM25614 ^ i34;
                                        break;
                                    default:
                                        if (C3683.m11222()) {
                                            iM25614 = C0630.m2566("֫۫") ^ i37;
                                            i38 = ((iM25614 ^ i36) * (-18407)) ^ (-1698245600);
                                            i34 = 1159941939;
                                        } else {
                                            iM25614 = (C0630.m2566("ۛ᩻") + i36) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i38 = ((iM25614 ^ i37) * 5665) ^ 1804398199;
                                            i34 = 1119267088;
                                        }
                                        i39 = iM25614 ^ i34;
                                        break;
                                }
                                return;
                            }
                        }

                        @Override // l.InterfaceC12846
                        /* JADX INFO: renamed from: ֫ */
                        public final /* synthetic */ boolean mo3777(Exception exc3) {
                            return false;
                        }

                        {
                            int i34 = 1070927198;
                            int i35 = C3911.f12484;
                            int i36 = C2520.f8000;
                            int iM25614 = C0630.m2566("ۖ۫") ^ i36;
                            int i37 = ((iM25614 ^ i35) * (-30723)) ^ 261862154;
                            int i38 = 1707099381;
                            while (true) {
                                i34 = ((((i34 ^ i35) * 7585) >> 31) & i37) ^ (iM25614 ^ i38);
                                switch (i34) {
                                    case -1931005138:
                                    case 439066390:
                                        C3432.m10477();
                                        C0237.m1481();
                                        iM25614 = (C2105.m6981("ᩴۡ") ^ i35) * (-125);
                                        i37 = ((iM25614 ^ i36) * 21053) ^ 609002002;
                                        i38 = 2096964373;
                                        break;
                                    case -1924784768:
                                    case 1774956419:
                                        if (C22628.f73083 <= 0) {
                                            iM25614 = C0630.m2566("ܳ۟") ^ i36;
                                            i37 = ((iM25614 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        } else {
                                            iM25614 = (C2105.m6981("ᩴۡ") ^ i35) * (-125);
                                            i37 = ((iM25614 ^ i36) * 21053) ^ 609002002;
                                            i38 = 2096964373;
                                        }
                                        break;
                                    case -1496391301:
                                    case 179210897:
                                        if (C7106.f21815 != 0) {
                                            iM25614 = (C2105.m6981("֫᩻") ^ i35) * (-43);
                                            i37 = ((iM25614 ^ i36) * 19705) ^ (-14115107);
                                            i38 = 1217074162;
                                        } else {
                                            iM25614 = (i36 - C0630.m2566("᩸۬")) * (-59);
                                            i37 = ((iM25614 ^ i35) * (-21079)) ^ (-631723634);
                                            i38 = -314254051;
                                        }
                                        break;
                                    case -1448002691:
                                    case -593250030:
                                        if (C1711.f5919) {
                                            iM25614 = (C2105.m6981("ᩴۡ") ^ i35) * (-125);
                                            i37 = ((iM25614 ^ i36) * 21053) ^ 609002002;
                                            i38 = 2096964373;
                                        } else {
                                            iM25614 = C0630.m2566("ۙ᩺") ^ i36;
                                            i37 = ((iM25614 ^ i35) * (-29029)) ^ (-2013719412);
                                            i38 = -1908022364;
                                        }
                                        break;
                                    case -1312877672:
                                    case 604339689:
                                        return;
                                    case -1252508694:
                                    case 767905273:
                                        if (C1128.f4106 <= 0) {
                                            iM25614 = C0630.m2566("ܳ۟") ^ i36;
                                            i37 = ((iM25614 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        } else {
                                            iM25614 = (C2105.m6981("ܶ۫") + i35) * 33;
                                            i37 = ((iM25614 ^ i36) * 31691) ^ 568071890;
                                            i38 = -1411538626;
                                        }
                                        break;
                                    case -1233459398:
                                    case -295414156:
                                        this.f30264 = this;
                                        if (C1504.f5354) {
                                            iM25614 = (C2105.m6981("ᩴۡ") ^ i35) * (-125);
                                            i37 = ((iM25614 ^ i36) * 21053) ^ 609002002;
                                            i38 = 2096964373;
                                        } else {
                                            iM25614 = C0630.m2566("۠۟") ^ i36;
                                            i37 = ((iM25614 ^ i35) * 5367) ^ 1736098881;
                                            i38 = -1503568302;
                                        }
                                        break;
                                    case -1178024253:
                                    case 1814227623:
                                        if (C5695.f17556 >= 0) {
                                            iM25614 = (C2105.m6981("֫᩻") ^ i35) * (-43);
                                            i37 = ((iM25614 ^ i36) * 19705) ^ (-14115107);
                                            i38 = 1217074162;
                                        } else {
                                            iM25614 = (i35 - C0630.m2566("۠ᩳ")) * (-89);
                                            i37 = ((iM25614 ^ i36) * (-32305)) ^ (-917171991);
                                            i38 = 317339571;
                                        }
                                        break;
                                    case -909763956:
                                    case 290795679:
                                        C2105.m6982();
                                        if (C3911.m11924() > 0) {
                                            iM25614 = C0630.m2566("ܳ۟") ^ i36;
                                            i37 = ((iM25614 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        } else {
                                            iM25614 = C0630.m2566("᩻ۛ") ^ i36;
                                            i37 = ((iM25614 ^ i35) * (-18369)) ^ 1667887292;
                                            i38 = 115469844;
                                        }
                                        break;
                                    case -710372442:
                                    case 932154853:
                                        if (C5695.m16023() >= 0) {
                                            iM25614 = (C0630.m2566("᩶ۡ") + i35) * 93;
                                            i37 = ((iM25614 ^ i36) * (-25051)) ^ (-674444041);
                                            i38 = 678907596;
                                        } else {
                                            iM25614 = (C0630.m2566("ܰ᩻") + i35) * 61;
                                            i37 = ((iM25614 ^ i36) * 31025) ^ (-963674978);
                                            i38 = -1567254373;
                                        }
                                        break;
                                    case -602545044:
                                    case 1756904692:
                                        if (C4159.f13567) {
                                            iM25614 = C0630.m2566("ۜۨ") ^ i36;
                                            i37 = ((iM25614 ^ i35) * 30979) ^ 631876099;
                                            i38 = 845993243;
                                        } else {
                                            iM25614 = C0630.m2566("ܳ۟") ^ i36;
                                            i37 = ((iM25614 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        }
                                        break;
                                    case 538347369:
                                    case 1204371961:
                                        if (C11340.m28031()) {
                                            iM25614 = (C0630.m2566("۫ܿ") ^ i36) * 7;
                                            i37 = ((iM25614 ^ i35) * (-24123)) ^ 1742628490;
                                            i38 = -420277051;
                                        } else {
                                            iM25614 = (C2105.m6981("ᩴۡ") ^ i35) * (-125);
                                            i37 = ((iM25614 ^ i36) * 21053) ^ 609002002;
                                            i38 = 2096964373;
                                        }
                                        break;
                                    case 946665981:
                                    case 1132852515:
                                        C2105.m6982();
                                        throw new RuntimeException();
                                    case 1015043453:
                                    case 1836761294:
                                        if (C0798.m2998() != 0) {
                                            iM25614 = (C2105.m6981("֫᩻") ^ i35) * (-43);
                                            i37 = ((iM25614 ^ i36) * 19705) ^ (-14115107);
                                            i38 = 1217074162;
                                        } else {
                                            iM25614 = C2105.m6981("᩺֡") ^ i35;
                                            i37 = ((iM25614 ^ i36) * (-22897)) ^ 1130842955;
                                            i38 = -1025154661;
                                        }
                                        break;
                                    case 1103769939:
                                    case 2134656571:
                                        if (C0630.f2410 <= 0) {
                                            iM25614 = (C0630.m2566("᩶ۡ") + i35) * 93;
                                            i37 = ((iM25614 ^ i36) * (-25051)) ^ (-674444041);
                                            i38 = 678907596;
                                        } else {
                                            iM25614 = C0630.m2566("ܳ۟") ^ i36;
                                            i37 = ((iM25614 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        }
                                        break;
                                    default:
                                        if (C0714.m2805()) {
                                            iM25614 = C2105.m6981("ۙ֡") ^ i35;
                                            i37 = ((iM25614 ^ i36) * 4239) ^ 429744631;
                                            i38 = -1591034364;
                                        } else {
                                            iM25614 = (C0630.m2566("᩶ۡ") + i35) * 93;
                                            i37 = ((iM25614 ^ i36) * (-25051)) ^ (-674444041);
                                            i38 = 678907596;
                                        }
                                        break;
                                }
                            }
                        }
                    }, mainM49336, this.f32336);
                    break;
                case -360583079:
                case 1793445900:
                    str12 = str12;
                    c5063 = c5063;
                    zM7157 = zM7157;
                    z3 = z3;
                    str9 = str9;
                    strM11219 = strM11219;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    short s = f32330[166];
                    int i34 = 55424 * s;
                    int i35 = s + 13856;
                    if ((i35 * i35) - i34 < 0) {
                        iM6982 = (C2105.m6981("᩶ۜ") ^ i19) * (-19);
                        i6 = ((iM6982 ^ i18) * 18257) ^ 1248915928;
                        i7 = 2034546104;
                    } else {
                        iM6982 = C2105.m6981("ܳ֡") ^ i18;
                        i6 = ((iM6982 ^ i19) * 499) ^ 611380105;
                        i7 = 95160086;
                    }
                    int i214 = iM6982 ^ i7;
                    strM11219 = strM11219;
                    z3 = z3;
                    zM7157 = zM7157;
                    str12 = str12;
                    c5063 = c5063;
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
                    iM6573 = C9896.m24993(strM10478);
                    iM6572 = iM24993;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    i16 = iM6573;
                    i15 = iM6572;
                    str6 = str10;
                    c12164 = c12166;
                    iM2566 = C2105.m6981("᩷۬") ^ i19;
                    i2 = ((iM2566 ^ i18) * (-14939)) ^ 1270560680;
                    i3 = 863511363;
                    i21 = iM2566 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM7157 = zM7157;
                    break;
                case -140492350:
                case 1807982965:
                    if (!C9896.m24997(C3432.m10478(str10, i23))) {
                        c5063 = c5063;
                        zM7157 = zM7157;
                        str9 = str9;
                        z2 = z2;
                        str8 = str8;
                        str7 = str7;
                        iM2566 = C0630.m2566("ۜ᩻") ^ i18;
                        i2 = ((iM2566 ^ i19) * (-7977)) ^ 818047213;
                        i3 = 1410551334;
                        i21 = iM2566 ^ i3;
                        i20 = i2;
                        str7 = str7;
                        c5063 = c5063;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        zM7157 = zM7157;
                    } else {
                        int iM25614 = C0630.m2566("ۧ᩷") ^ i18;
                        zM7157 = zM7157;
                        i = ((iM25614 ^ i19) * 6691) ^ 1809117520;
                        i21 = iM25614 ^ 1439041687;
                        i20 = i;
                        zM7157 = zM7157;
                    }
                    break;
                case -104147723:
                case 852158940:
                    C3683.m11220(C4117.m12351(C4075.m12251(C0630.m2566(C1128.m3841(f32330, 214, 3, i22)) ^ 2127814375), str9));
                    C1711.m5740(c5063);
                    break;
                case -95189465:
                case 100981650:
                    str12 = str12;
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    strM11219 = strM11219;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (!zM2804) {
                        strM11219 = str10;
                        int iM25615 = (C0630.m2566("ۡ֡") ^ i19) * (-25);
                        c5063 = c5063;
                        zM7157 = zM7157;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        String str16 = str12;
                        i21 = iM25615 ^ (-1356097630);
                        i20 = ((iM25615 ^ i18) * 30247) ^ (-1071745451);
                        str12 = str16;
                    } else {
                        iM2567 = (C2105.m6981("ۜ᩸") ^ i18) * 19;
                        i8 = ((iM2567 ^ i19) * (-22019)) ^ 1017933395;
                        i9 = -158057407;
                        int i215 = iM2567 ^ i9;
                        strM11219 = strM11219;
                        zM7157 = zM7157;
                        str12 = str12;
                        str10 = str10;
                        i21 = i215;
                        i20 = i8;
                        str7 = str7;
                        c5063 = c5063;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case -64713075:
                case 832837313:
                    str2 = str12;
                    c5063 = c5063;
                    str3 = str10;
                    zM7157 = zM7157;
                    z2 = z2;
                    str8 = str8;
                    str4 = strM11219;
                    String strM7507 = C2272.m7507(f32330, 180, 1, i22);
                    boolean zM20838 = C7811.m20838(str8, strM7507);
                    str7 = strM7507;
                    strM12578 = C4159.m12578(f32330, 181, 24, i22);
                    if (zM20838) {
                        iM2568 = C2105.m6981("ᩴۗ") ^ i18;
                        i11 = ((iM2568 ^ i19) * 14065) ^ (-693597748);
                        i12 = -2137928827;
                    } else {
                        iM2568 = (C0630.m2566("ᩳۤ") ^ i19) * (-103);
                        i11 = ((iM2568 ^ i18) * (-26441)) ^ 584296304;
                        i12 = 1068875967;
                    }
                    int i36 = iM2568 ^ i12;
                    strM11219 = str4;
                    zM7157 = zM7157;
                    str12 = str2;
                    i21 = i36;
                    c5063 = c5063;
                    boolean z8 = z2;
                    str9 = strM12578;
                    i20 = i11;
                    str10 = str3;
                    str7 = str7;
                    str8 = str8;
                    z2 = z8;
                    break;
                case 84032557:
                case 1926550672:
                    str12 = str12;
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    strM11219 = strM11219;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    iM25611 = C0630.m2566(C1773.m5917(f32330, 173, 3, i22)) ^ 2102884404;
                    iM2567 = (i19 - C0630.m2566("ۡܿ")) * 123;
                    i8 = ((iM2567 ^ i18) * 29399) ^ 1190373993;
                    i9 = 1730219029;
                    int i216 = iM2567 ^ i9;
                    strM11219 = strM11219;
                    zM7157 = zM7157;
                    str12 = str12;
                    str10 = str10;
                    i21 = i216;
                    i20 = i8;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case 185231789:
                case 1148076255:
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    try {
                        try {
                            iM6572 = AbstractC2021.m6572(str8);
                            iM6573 = AbstractC2021.m6572(str10);
                            i16 = iM6573;
                            i15 = iM6572;
                            str6 = str10;
                            c12164 = c12166;
                            iM2566 = C2105.m6981("᩷۬") ^ i19;
                            i2 = ((iM2566 ^ i18) * (-14939)) ^ 1270560680;
                            i3 = 863511363;
                        } catch (NumberFormatException unused) {
                            iM2566 = (C2105.m6981("ۘ᩷") ^ i19) * (-85);
                            i2 = ((iM2566 ^ i18) * 12667) ^ 675285318;
                            i3 = -2082523386;
                        }
                    } catch (NumberFormatException unused2) {
                        iM2566 = (i18 - C0630.m2566("ۢۚ")) * 83;
                        i2 = ((iM2566 ^ i19) * 17867) ^ 375845515;
                        i3 = 1964419006;
                    }
                    i21 = iM2566 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM7157 = zM7157;
                    break;
                case 444004462:
                case 1219269768:
                    if (!C7811.m20838(str10, str12)) {
                        strM10478 = str10;
                        iM2569 = (i18 - C0630.m2566("ܽ᩶")) * (-121);
                        i13 = ((iM2569 ^ i19) * (-28827)) ^ (-2044872141);
                        i14 = 821733968;
                        i21 = iM2569 ^ i14;
                        i20 = i13;
                    } else {
                        zM7157 = zM7157;
                        str9 = str9;
                        z2 = z2;
                        iM6981 = C2105.m6981("᩺֡") ^ i18;
                        i4 = ((iM6981 ^ i19) * 19007) ^ 1778497627;
                        i5 = 586909330;
                        i21 = iM6981 ^ i5;
                        i20 = i4;
                        z2 = z2;
                        str9 = str9;
                        zM7157 = zM7157;
                    }
                    break;
                case 620640739:
                case 1668655933:
                    i22 = 19340;
                    iM6982 = C0630.m2566("ۘ۫") ^ i18;
                    i6 = ((iM6982 ^ i19) * (-32357)) ^ (-94650951);
                    i7 = 1525417834;
                    int i217 = iM6982 ^ i7;
                    strM11219 = strM11219;
                    z3 = z3;
                    zM7157 = zM7157;
                    str12 = str12;
                    c5063 = c5063;
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
                    RunnableC0588.m2440(C4616.m13559(exc));
                    C1711.m5740(c5063);
                    break;
                case 724036224:
                case 1421036346:
                    c5063 = c5063;
                    zM7157 = zM7157;
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
                                        strM11219 = C3683.m11219(RunnableC0588.m2443(RunnableC0588.m2443(C3683.m11219(C3683.m11219(str10, RunnableC1108.m3789(f32330, 205, 2, i22), C1005.m3502(f32330, 210, 1, i22)), RunnableC1937.m6385(f32330, 331, 2, i22), C3663.m11162(f32330, 333, 1, i22)), C5695.m16034(f32330, 337, 2, i22), C21923.m49334(f32330, 339, 1, i22)), C2520.m8030(f32330, 340, 2, i22), C1773.m5917(f32330, 342, 1, i22)), C22628.m50602(f32330, 343, 2, i22), C22628.m50602(f32330, 345, 1, i22));
                                        int iM25616 = (C0630.m2566("ۡ֡") ^ i19) * (-25);
                                        c5063 = c5063;
                                        zM7157 = zM7157;
                                        str10 = str10;
                                        str7 = str7;
                                        str8 = str8;
                                        z2 = z2;
                                        str9 = str9;
                                        String str18 = str12;
                                        i21 = iM25616 ^ (-1356097630);
                                        i20 = ((iM25616 ^ i18) * 30247) ^ (-1071745451);
                                        str12 = str18;
                                    } catch (Exception e2) {
                                        e = e2;
                                        exc2 = e;
                                        z3 = z3;
                                        strM11219 = strM11219;
                                        iM6982 = (i18 - C0630.m2566("᩻᩹")) * 93;
                                        i6 = ((iM6982 ^ i19) * 10709) ^ (-393780802);
                                        i7 = -736020783;
                                        int i218 = iM6982 ^ i7;
                                        strM11219 = strM11219;
                                        z3 = z3;
                                        zM7157 = zM7157;
                                        str12 = str12;
                                        c5063 = c5063;
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
                                strM11219 = strM11219;
                                iM6982 = (i18 - C0630.m2566("᩻᩹")) * 93;
                                i6 = ((iM6982 ^ i19) * 10709) ^ (-393780802);
                                i7 = -736020783;
                                int i219 = iM6982 ^ i7;
                                strM11219 = strM11219;
                                z3 = z3;
                                zM7157 = zM7157;
                                str12 = str12;
                                c5063 = c5063;
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
                    zM7157 = zM7157;
                    boolean z9 = z3;
                    String str20 = str9;
                    String str21 = str7;
                    String str22 = strM11219;
                    boolean z10 = z2;
                    c5062 = this.f32335;
                    String strM947 = C0050.m947(c5062.m14611());
                    C5062 c5064 = this.f32333;
                    String strM948 = C0050.m947(c5064.m14611());
                    boolean zM19121 = C7106.m19121(strM947);
                    DialogInterfaceC0206 dialogInterfaceC0207 = this.f32340;
                    if (zM19121) {
                        int iM6985 = (C2105.m6981("ᩳᩳ") ^ i19) * 35;
                        i20 = ((iM6985 ^ i18) * (-22675)) ^ (-295325090);
                        strM11219 = str22;
                        z3 = z9;
                        c5063 = c5064;
                        str10 = strM948;
                        dialogInterfaceC0206 = dialogInterfaceC0207;
                        str7 = str21;
                        z2 = z10;
                        str12 = str19;
                        str9 = str20;
                        str8 = strM947;
                        i21 = iM6985 ^ 2054755644;
                    } else {
                        int iM6986 = C2105.m6981("ۡᩴ") ^ i19;
                        i = ((iM6986 ^ i18) * 30983) ^ 943132053;
                        strM11219 = str22;
                        z3 = z9;
                        c5063 = c5064;
                        str10 = strM948;
                        dialogInterfaceC0206 = dialogInterfaceC0207;
                        str7 = str21;
                        z2 = z10;
                        str12 = str19;
                        str9 = str20;
                        str8 = strM947;
                        i21 = iM6986 ^ (-784920992);
                        i20 = i;
                    }
                    zM7157 = zM7157;
                    break;
                case 1293657805:
                case 1396291076:
                    if (C9896.m24999(strM10478)) {
                        iM2569 = C0630.m2566("ܶ۬") ^ i19;
                        i13 = ((iM2569 ^ i18) * (-21303)) ^ (-337173641);
                        i14 = 709671205;
                    } else {
                        iM2569 = (C0630.m2566("۟۫") + i19) * 115;
                        i13 = ((iM2569 ^ i18) * (-19625)) ^ (-724127771);
                        i14 = 1879836634;
                    }
                    i21 = iM2569 ^ i14;
                    i20 = i13;
                    break;
                case 1401667412:
                case 1773801736:
                    str12 = str12;
                    c5063 = c5063;
                    zM7157 = zM7157;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    try {
                        strM11219 = strM11219;
                        try {
                            C13574.m32628(c12164Matcher.pattern(), strM11219);
                            str5 = strM11219;
                            c12165 = c12164Matcher;
                            iM2567 = C0630.m2566("ۨۡ") ^ i19;
                            i8 = ((iM2567 ^ i18) * (-15831)) ^ (-1284239432);
                            i9 = 1135315253;
                        } catch (Exception e7) {
                            e = e7;
                            exc = e;
                            iM2567 = C0630.m2566("ᩳ۫") ^ i18;
                            i8 = ((iM2567 ^ i19) * (-31145)) ^ (-159703192);
                            i9 = 1338945092;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        strM11219 = strM11219;
                    }
                    int i2110 = iM2567 ^ i9;
                    strM11219 = strM11219;
                    zM7157 = zM7157;
                    str12 = str12;
                    str10 = str10;
                    i21 = i2110;
                    i20 = i8;
                    str7 = str7;
                    c5063 = c5063;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                default:
                    C1504.m5167(C0630.m2566(C11340.m28025(f32330, Primes.SMALL_FACTOR_LIMIT, 3, i22)) ^ 2102893899);
                    C1711.m5740(c5062);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26917(ViewOnClickListenerC10732 viewOnClickListenerC10732, int i, C12164 c12164, boolean z, boolean z2, boolean z3, String str, int i2, int i3, C11667 c11667, boolean z4) {
        int iM2566;
        int i4;
        AbstractC15440 abstractC15440 = null;
        int i5 = 0;
        short[] sArr = null;
        int iM6387 = 0;
        int i6 = 852338933;
        int i7 = C3683.f11629;
        int i8 = C4075.f12947;
        int iM6981 = C2105.m6981("ۘ᩺") ^ i8;
        int i9 = ((iM6981 ^ i7) * 11845) ^ (-826332150);
        int i10 = iM6981 ^ 1399314034;
        AbstractC15440 abstractC15440M36491 = null;
        while (true) {
            i6 = i10 ^ ((((i6 ^ i7) * 13755) >> 31) & i9);
            switch (i6) {
                case -1936222303:
                case 1533657369:
                    i5 = 25290;
                    iM2566 = (C2105.m6981("ܶۛ") ^ i8) * (-31);
                    i9 = ((iM2566 ^ i7) * (-21213)) ^ 1880877547;
                    i4 = -2045852257;
                    i10 = iM2566 ^ i4;
                    break;
                case -1817677242:
                case 1652653328:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("ܶܰ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-15887)) ^ (-274897967);
                        i4 = 572306739;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ۜۙ")) * (-55);
                        i9 = ((iM2566 ^ i7) * (-7337)) ^ (-1749193630);
                        i4 = -706951230;
                    }
                    i10 = iM2566 ^ i4;
                    break;
                case -1663946498:
                case -1655683418:
                    C4075.m12263();
                    if (C3911.f12484 < 0) {
                        iM2566 = C2105.m6981("ܶܰ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-15887)) ^ (-274897967);
                        i4 = 572306739;
                        i10 = iM2566 ^ i4;
                    }
                    iM2566 = C2105.m6981("ܿ۬") ^ i7;
                    i9 = ((iM2566 ^ i8) * (-1421)) ^ (-270755155);
                    i4 = -1221944263;
                    i10 = iM2566 ^ i4;
                    break;
                case -1438170543:
                case 473434655:
                    AbstractC2021.m6574();
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C0630.m2566("ܳ֫") + i7) * 43;
                        i9 = ((iM2566 ^ i8) * (-21219)) ^ (-748036969);
                        i4 = -180776403;
                        i10 = iM2566 ^ i4;
                    }
                    iM2566 = C2105.m6981("ܿ۬") ^ i7;
                    i9 = ((iM2566 ^ i8) * (-1421)) ^ (-270755155);
                    i4 = -1221944263;
                    i10 = iM2566 ^ i4;
                    break;
                case -1118855239:
                case -86784638:
                    abstractC15440 = viewOnClickListenerC10732.f32339;
                    abstractC15440M36491 = abstractC15440.m36491(C1504.m5177(f32330, 158, 4, i5));
                    sArr = f32330;
                    if (C3683.m11222()) {
                        iM2566 = (C0630.m2566("ܳ֫") + i7) * 43;
                        i9 = ((iM2566 ^ i8) * (-21219)) ^ (-748036969);
                        i4 = -180776403;
                    } else {
                        iM2566 = C2105.m6981("ܰ᩶") ^ i7;
                        i9 = ((iM2566 ^ i8) * 30869) ^ 328659225;
                        i4 = 1341982842;
                    }
                    i10 = iM2566 ^ i4;
                    break;
                case -1014507786:
                case 344754005:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("ܶܰ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-15887)) ^ (-274897967);
                        i4 = 572306739;
                    } else {
                        iM2566 = (i7 - C2105.m6981("۫ۘ")) * (-73);
                        i9 = ((iM2566 ^ i8) * 20693) ^ (-19034087);
                        i4 = 479642772;
                    }
                    i10 = iM2566 ^ i4;
                    break;
                case -999743547:
                case -477099428:
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C0630.m2566("ܳ֫") + i7) * 43;
                        i9 = ((iM2566 ^ i8) * (-21219)) ^ (-748036969);
                        i4 = -180776403;
                    } else {
                        iM2566 = C0630.m2566("۫ᩴ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 5073) ^ (-1223808822);
                        i4 = -1777972204;
                    }
                    i10 = iM2566 ^ i4;
                    break;
                case -893209734:
                case -447339053:
                    short s = f32330[157];
                    int i11 = (s * 2) + 1;
                    int i12 = s + 1;
                    if ((i12 * i12) - i11 < 0) {
                        iM2566 = C2105.m6981("ܺ۟") ^ i7;
                        i9 = ((iM2566 ^ i8) * 10355) ^ 603337782;
                        i4 = -1541525910;
                    } else {
                        iM2566 = C0630.m2566("᩹᩶") ^ i8;
                        i9 = ((iM2566 ^ i7) * 4461) ^ (-751420752);
                        i4 = 80726372;
                    }
                    i10 = iM2566 ^ i4;
                    break;
                case -789496075:
                case 1495141108:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C2105.m6981("ܿ۬") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-1421)) ^ (-270755155);
                        i4 = -1221944263;
                    } else {
                        iM2566 = C2105.m6981("ۢۘ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 10345) ^ 9271379;
                        i4 = 148592382;
                    }
                    i10 = iM2566 ^ i4;
                    break;
                case -762769715:
                case 152186960:
                    if (C5695.f17556 >= 0) {
                        iM2566 = C2105.m6981("ܿ۬") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-1421)) ^ (-270755155);
                        i4 = -1221944263;
                    } else {
                        iM2566 = (i7 - C2105.m6981("ۘۛ")) * 83;
                        i9 = ((iM2566 ^ i8) * (-19901)) ^ (-294026229);
                        i4 = -2083143141;
                    }
                    i10 = iM2566 ^ i4;
                    break;
                case -616814328:
                case 790562225:
                    iM6387 = RunnableC1937.m6387();
                    iM2566 = (C0630.m2566("ۗ᩶") ^ i7) * (-103);
                    i9 = ((iM2566 ^ i8) * (-18911)) ^ (-2016992199);
                    i4 = -265239183;
                    i10 = iM2566 ^ i4;
                    break;
                case -405958342:
                case -166180386:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C2105.m6981("ܿ۬") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-1421)) ^ (-270755155);
                        i4 = -1221944263;
                        i10 = iM2566 ^ i4;
                    } else {
                        int iM2567 = (C0630.m2566("ܶۜ") ^ i8) * (-53);
                        i9 = (-674708035) ^ ((iM2567 ^ i7) * (-32139));
                        i10 = (-1699444762) ^ iM2567;
                    }
                    break;
                case -133709360:
                case 1839929651:
                    if (iM6387 != 0) {
                        iM2566 = (C0630.m2566("ܳ֫") + i7) * 43;
                        i9 = ((iM2566 ^ i8) * (-21219)) ^ (-748036969);
                        i4 = -180776403;
                    } else {
                        iM2566 = (C2105.m6981("ᩳ᩸") + i8) * (-13);
                        i9 = ((iM2566 ^ i7) * (-21489)) ^ (-280214547);
                        i4 = 709893493;
                    }
                    i10 = iM2566 ^ i4;
                    break;
                case -61060315:
                case 1693472333:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C0630.m2566("ܰۘ") + i8) * (-13);
                        i9 = ((iM2566 ^ i7) * (-26747)) ^ (-1618732807);
                        i4 = -1912330202;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ܽۨ")) * 109;
                        i9 = ((iM2566 ^ i7) * 29105) ^ 586540557;
                        i4 = -995709581;
                    }
                    i10 = iM2566 ^ i4;
                    break;
                case 202514980:
                case 1352206690:
                    i5 = 37993;
                    iM2566 = (C2105.m6981("ܶۛ") ^ i8) * (-31);
                    i9 = ((iM2566 ^ i7) * (-21213)) ^ 1880877547;
                    i4 = -2045852257;
                    i10 = iM2566 ^ i4;
                    break;
                case 336051553:
                case 1631753649:
                    if (C4263.m12819() >= 0) {
                        iM2566 = C2105.m6981("ܿ۬") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-1421)) ^ (-270755155);
                        i4 = -1221944263;
                    } else {
                        iM2566 = (C2105.m6981("۟ܽ") ^ i8) * 23;
                        i9 = ((iM2566 ^ i7) * 10677) ^ (-1977829744);
                        i4 = 1421080831;
                    }
                    i10 = iM2566 ^ i4;
                    break;
                case 886761961:
                case 962920850:
                    if (C1047.f3863 >= 0) {
                        iM2566 = C2105.m6981("ܿ۬") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-1421)) ^ (-270755155);
                        i4 = -1221944263;
                    } else {
                        iM2566 = (C2105.m6981("ۢ֨") ^ i8) * 91;
                        i9 = ((iM2566 ^ i7) * (-8307)) ^ (-177018042);
                        i4 = 1907567802;
                    }
                    i10 = iM2566 ^ i4;
                    break;
                case 1106220892:
                case 1135458905:
                    C11340.m28031();
                    break;
                case 1184744834:
                case 1581331020:
                    C4075.m12263();
                    iM2566 = C2105.m6981("ܿ۬") ^ i7;
                    i9 = ((iM2566 ^ i8) * (-1421)) ^ (-270755155);
                    i4 = -1221944263;
                    i10 = iM2566 ^ i4;
                    break;
                default:
                    C0964.m3402(new C7245(viewOnClickListenerC10732, abstractC15440.m36520(C1711.m5726(sArr, 162, 4, i5)), c11667, z4, i, c12164, z, z2, str, i2, i3, abstractC15440M36491, z3));
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
    
        if (l.C4159.m12565() >= 0) goto L10;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int iM6981;
        int i2;
        int i3;
        int i4 = C3432.f10845;
        int i5 = C2520.f8000;
        int iM6982 = (i5 - C2105.m6981("ۧۢ")) * (-91);
        int i6 = ((iM6982 ^ i4) * 27007) ^ 1098021652;
        CheckBox checkBox = null;
        int i7 = iM6982 ^ (-391246628);
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
                    if (RunnableC1108.f4040) {
                        iM6981 = (C0630.m2566("᩻ܽ") + i5) * (-59);
                        i2 = ((iM6981 ^ i4) * 24453) ^ (-524642527);
                        i3 = 1599146448;
                    } else {
                        iM6981 = (C0630.m2566("ۨܳ") + i4) * 119;
                        i2 = ((iM6981 ^ i5) * 1355) ^ (-125885863);
                        i3 = 445040380;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1894256354:
                case 560784961:
                    i12 = i12;
                    if (C3746.f11829 <= 0) {
                        iM6981 = C0630.m2566("᩵ۙ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-10105)) ^ (-1104917036);
                        i3 = -1110780044;
                    } else {
                        iM6981 = C0630.m2566("ܶ᩸") ^ i4;
                        i2 = ((iM6981 ^ i5) * 25711) ^ 512155055;
                        i3 = -949687277;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1808648139:
                case 1514324096:
                    i12 = i12;
                    if (i != 3) {
                        iM6981 = C2105.m6981("ۗۨ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-26385)) ^ 121317544;
                        i3 = -41929068;
                    } else {
                        iM6981 = (C0630.m2566("᩻֫") ^ i4) * 127;
                        i2 = ((iM6981 ^ i5) * (-9281)) ^ (-998177885);
                        i3 = 1724493946;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1716752838:
                case 1982080049:
                    i12 = i12;
                    if (i != 4) {
                        iM6981 = (C2105.m6981("ۙ۫") + i5) * (-25);
                        i2 = ((iM6981 ^ i4) * (-29559)) ^ 1767553372;
                        i3 = -1404757643;
                    } else {
                        iM6981 = C0630.m2566("ۚ֡") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-27431)) ^ 266805500;
                        i3 = -1235225699;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1620717125:
                case -434991648:
                    C3663.m11168();
                    if (C22628.m50615() != 0) {
                        i12 = i12;
                        iM6981 = (i4 - C0630.m2566("ܿۘ")) * (-49);
                        i2 = ((iM6981 ^ i5) * 3741) ^ 1907768789;
                        i3 = -1139130292;
                    } else {
                        iM6981 = (C2105.m6981("᩵ܽ") ^ i4) * 93;
                        i12 = i12;
                        i2 = ((iM6981 ^ i5) * (-29931)) ^ (-1601756468);
                        i3 = -192515813;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1551180361:
                case 1480389379:
                    i12 = i12;
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("᩵ۙ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-10105)) ^ (-1104917036);
                        i3 = -1110780044;
                    } else {
                        iM6981 = (C2105.m6981("ۘܶ") ^ i5) * (-37);
                        i2 = ((iM6981 ^ i4) * (-5797)) ^ (-1716870617);
                        i3 = 490130342;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1515675903:
                case 1142618598:
                    C0422.m1963();
                    if (RunnableC0588.f2309 >= 0) {
                        i12 = i12;
                        iM6981 = (C0630.m2566("ۨܳ") + i4) * 119;
                        i2 = ((iM6981 ^ i5) * 1355) ^ (-125885863);
                        i3 = 445040380;
                        i7 = iM6981 ^ i3;
                        i6 = i2;
                        i11 = i12;
                    }
                    i12 = i12;
                    iM6981 = C0630.m2566("ۜܿ") ^ i5;
                    i2 = ((iM6981 ^ i4) * 16791) ^ (-987993966);
                    i3 = 348242444;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1444502470:
                case -1393044111:
                    i12 = i12;
                    C1128.m3853(checkBox, i9);
                    C1128.m3853(checkBox2, i9);
                    C3746.m11360(checkBox4, i9);
                    C3746.m11360(checkBox3, i10);
                    C1128.m3853(checkBox5, i10);
                    iM6981 = (C2105.m6981("ۙ۫") + i5) * (-25);
                    i2 = ((iM6981 ^ i4) * (-29559)) ^ 1767553372;
                    i3 = -1404757643;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1400722381:
                case 1039894107:
                    i12 = i12;
                    if (C0422.f1886 > 0) {
                        iM6981 = (i4 - C0630.m2566("ܿۘ")) * (-49);
                        i2 = ((iM6981 ^ i5) * 3741) ^ 1907768789;
                        i3 = -1139130292;
                    } else {
                        iM6981 = C0630.m2566("᩵ۙ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-10105)) ^ (-1104917036);
                        i3 = -1110780044;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1358463747:
                case 361911559:
                    i12 = i12;
                    if (i == i8) {
                        iM6981 = C0630.m2566("ۜܶ") ^ i5;
                        i2 = ((iM6981 ^ i4) * 22511) ^ 2134747872;
                        i3 = -1095842699;
                    } else {
                        iM6981 = (C0630.m2566("֫۫") ^ i5) * 11;
                        i2 = ((iM6981 ^ i4) * 15851) ^ 1632699579;
                        i3 = 255404141;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1336882638:
                case -761782411:
                    i12 = i12;
                    C1128.m3853(checkBox, i10);
                    C3746.m11360(checkBox2, i10);
                    C3746.m11360(checkBox3, i10);
                    C3746.m11360(checkBox4, i10);
                    C1128.m3853(checkBox5, i10);
                    iM6981 = (C2105.m6981("ۙ۫") + i5) * (-25);
                    i2 = ((iM6981 ^ i4) * (-29559)) ^ 1767553372;
                    i3 = -1404757643;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1273673951:
                case 1319602846:
                    i12 = i12;
                    if (C4616.f14690 <= 0) {
                        iM6981 = (i5 - C2105.m6981("ۖ᩻")) * (-19);
                        i2 = ((iM6981 ^ i4) * 28795) ^ 1737768334;
                        i3 = 125717570;
                    } else {
                        iM6981 = (C2105.m6981("۫۬") ^ i5) * 49;
                        i2 = ((iM6981 ^ i4) * (-5571)) ^ 1135487311;
                        i3 = -838075493;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1242266198:
                case -398132006:
                    if (C1047.m3599() >= 0) {
                        i12 = i12;
                        iM6981 = (i5 - C2105.m6981("ۖ᩻")) * (-19);
                        i2 = ((iM6981 ^ i4) * 28795) ^ 1737768334;
                        i3 = 125717570;
                        i7 = iM6981 ^ i3;
                        i6 = i2;
                        i11 = i12;
                    }
                    i12 = i12;
                    iM6981 = (i4 - C0630.m2566("ܿۘ")) * (-49);
                    i2 = ((iM6981 ^ i5) * 3741) ^ 1907768789;
                    i3 = -1139130292;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1186147983:
                case -450271306:
                    i12 = i12;
                    if (C1128.f4106 <= 0) {
                        iM6981 = (i4 - C0630.m2566("ܿۘ")) * (-49);
                        i2 = ((iM6981 ^ i5) * 3741) ^ 1907768789;
                        i3 = -1139130292;
                    } else {
                        iM6981 = (i5 - C2105.m6981("᩻ᩳ")) * 65;
                        i2 = ((iM6981 ^ i4) * 11529) ^ (-480681412);
                        i3 = -2058349932;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1130320773:
                case 911997833:
                    break;
                case -963317340:
                case 977546880:
                    i12 = i12;
                    this.f32333.m14604(z2);
                    checkBox5 = this.f32341;
                    checkBox4 = this.f32331;
                    if (C1916.m6308() >= 0) {
                        iM6981 = C2105.m6981("᩷᩵") ^ i4;
                        i2 = ((iM6981 ^ i5) * 29375) ^ (-1118566738);
                        i3 = 14913628;
                    } else {
                        iM6981 = (i5 - C0630.m2566("֨ۚ")) * (-39);
                        i2 = ((iM6981 ^ i4) * 14583) ^ 1312038694;
                        i3 = -832593453;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -926796019:
                case 55276210:
                    i12 = i12;
                    C1128.m3853(checkBox, i10);
                    C3746.m11360(checkBox2, i10);
                    C3746.m11360(checkBox3, i9);
                    C1128.m3853(checkBox4, i10);
                    C1128.m3853(checkBox5, i10);
                    iM6981 = (C2105.m6981("ۙ۫") + i5) * (-25);
                    i2 = ((iM6981 ^ i4) * (-29559)) ^ 1767553372;
                    i3 = -1404757643;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -864029656:
                case 485657357:
                    i12 = i12;
                    if (C21923.f70183 != 0) {
                        iM6981 = C0630.m2566("ۜܿ") ^ i5;
                        i2 = ((iM6981 ^ i4) * 16791) ^ (-987993966);
                        i3 = 348242444;
                    } else {
                        iM6981 = (C0630.m2566("֡ۧ") ^ i4) * 27;
                        i2 = ((iM6981 ^ i5) * 4747) ^ (-1949060227);
                        i3 = -1602620597;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -492572434:
                case 499843257:
                    i12 = i12;
                    this.f32335.m14604(z);
                    if (i != 0) {
                        iM6981 = C2105.m6981("ܰܺ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-31441)) ^ 1577853855;
                        i3 = 1658792256;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۖ۬")) * 95;
                        i2 = ((iM6981 ^ i5) * (-16649)) ^ 589337114;
                        i3 = -934441371;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -445273774:
                case -21123241:
                    i12 = i12;
                    C3746.m11360(checkBox, i9);
                    C1128.m3853(checkBox2, i9);
                    C1128.m3853(checkBox3, i10);
                    C3746.m11360(checkBox4, i10);
                    C1128.m3853(checkBox5, i9);
                    iM6981 = (C2105.m6981("ۙ۫") + i5) * (-25);
                    i2 = ((iM6981 ^ i4) * (-29559)) ^ 1767553372;
                    i3 = -1404757643;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -377813218:
                case 243464747:
                    i12 = i12;
                    if (i == i8) {
                        iM6981 = (i4 - C2105.m6981("ۖ۬")) * 95;
                        i2 = ((iM6981 ^ i5) * (-16649)) ^ 589337114;
                        i3 = -934441371;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۨܽ")) * (-81);
                        i2 = ((iM6981 ^ i5) * (-21671)) ^ 697430762;
                        i3 = -397657623;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -346252339:
                case 1230072249:
                    i12 = i12;
                    C1420.m4913();
                    iM6981 = C0630.m2566("᩸۟") ^ i4;
                    i2 = ((iM6981 ^ i5) * (-17853)) ^ (-663476687);
                    i3 = -873549695;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -305950259:
                case 1655858172:
                    i12 = i12;
                    if (C4616.m13552() != 0) {
                        iM6981 = C2105.m6981("᩷᩵") ^ i4;
                        i2 = ((iM6981 ^ i5) * 29375) ^ (-1118566738);
                        i3 = 14913628;
                    } else {
                        iM6981 = C2105.m6981("ۧ۠") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-16665)) ^ (-415662761);
                        i3 = 379476550;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -276796434:
                case 2130301134:
                    RunnableC1108.m3790();
                    C1916.m6308();
                    break;
                case -258597217:
                case 1550064657:
                    m26915();
                    break;
                case -156261016:
                case 1662668832:
                    i12 = i12;
                    if (C2105.m6982() != 0) {
                        iM6981 = C0630.m2566("᩸۟") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-17853)) ^ (-663476687);
                        i3 = -873549695;
                    } else {
                        iM6981 = C0630.m2566("ܰܶ") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-8705)) ^ 1954385601;
                        i3 = 949609531;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -93253621:
                case 311541735:
                    z2 = true;
                    iM6981 = (i4 - C2105.m6981("ۘۤ")) * (-15);
                    i2 = ((iM6981 ^ i5) * (-17331)) ^ (-18907316);
                    i3 = 1503613148;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -91685472:
                case 573194438:
                    i12 = i12;
                    if (i != 2) {
                        iM6981 = (C2105.m6981("᩺ܳ") + i5) * 61;
                        i2 = ((iM6981 ^ i4) * 4561) ^ 1398616820;
                        i3 = -751092116;
                    } else {
                        iM6981 = C0630.m2566("ۚ֡") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-27431)) ^ 266805500;
                        i3 = -1235225699;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 12852237:
                case 1049706193:
                    i12 = i12;
                    if (i != i8) {
                        iM6981 = C2105.m6981("᩻ܺ") ^ i5;
                        i2 = ((iM6981 ^ i4) * 9665) ^ (-445499963);
                        i3 = 1898908139;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ܿᩳ")) * (-27);
                        i2 = ((iM6981 ^ i5) * (-13529)) ^ 159243221;
                        i3 = 407466675;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 108015286:
                case 254303249:
                    z = false;
                    iM6981 = (C2105.m6981("۠֨") ^ i5) * 63;
                    i2 = ((iM6981 ^ i4) * (-25993)) ^ 2094851075;
                    i3 = 1084986589;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 628310497:
                case 889903099:
                    z = true;
                    iM6981 = (C2105.m6981("۠֨") ^ i5) * 63;
                    i2 = ((iM6981 ^ i4) * (-25993)) ^ 2094851075;
                    i3 = 1084986589;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 913122340:
                case 1981972152:
                    i12 = i12;
                    if (C0050.f910 < 0) {
                        iM6981 = C0630.m2566("᩸۟") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-17853)) ^ (-663476687);
                        i3 = -873549695;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ܿۘ")) * (-49);
                        i2 = ((iM6981 ^ i5) * 3741) ^ 1907768789;
                        i3 = -1139130292;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 917189864:
                case 1952707774:
                    i12 = i12;
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("᩵ۙ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-10105)) ^ (-1104917036);
                        i3 = -1110780044;
                    } else {
                        iM6981 = C2105.m6981("֫᩺") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-15839)) ^ (-798450814);
                        i3 = -676924677;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 1110213823:
                case 1553533396:
                    z2 = false;
                    iM6981 = (i4 - C2105.m6981("ۘۤ")) * (-15);
                    i2 = ((iM6981 ^ i5) * (-17331)) ^ (-18907316);
                    i3 = 1503613148;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 1919962425:
                case 2068079924:
                    i12 = i12;
                    i8 = 1;
                    i9 = 0;
                    if (i != 0) {
                        iM6981 = C2105.m6981("۠ۨ") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-7867)) ^ 829650878;
                        i3 = 437517277;
                    } else {
                        iM6981 = C0630.m2566("ۜܶ") ^ i5;
                        i2 = ((iM6981 ^ i4) * 22511) ^ 2134747872;
                        i3 = -1095842699;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                default:
                    i12 = i12;
                    checkBox3 = this.f32332;
                    checkBox2 = this.f32334;
                    checkBox = this.f32337;
                    i10 = 8;
                    if (i != 0) {
                        iM6981 = (i4 - C0630.m2566("ܽ᩵")) * (-35);
                        i2 = ((iM6981 ^ i5) * 31879) ^ (-1393394688);
                        i3 = 1050528029;
                    } else {
                        iM6981 = C0630.m2566("᩺ܽ") ^ i5;
                        i2 = ((iM6981 ^ i4) * 15159) ^ (-417495038);
                        i3 = 659562790;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
            }
            return;
        }
    }
}
