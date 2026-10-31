package l;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۗ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RP */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC3441 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۤܶۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f10875 = {82, 13325, 13327, 13336, 13317, 13338, 13317, 13336, 13333, 26318, -18363, 24532, -24399, 17899, -23467, 13322, 13317, 13314, 13320, 13370, 13317, 13321, 13339, 13358, 13333, 13349, 13320, 13380, 13378, 13378, 13378, 13381, -16713, 22909, 18832, -22729, 18690, 25116, -24033, 17845, 16894, -23633, -18125, -22877, -24050, -18643, 19922, 18854, 20555, 25282, -21328, 24941, -17116, -21072, 18211, 22983, 6334, -6627, 8340, 9781, 32019, 32030, 32002, 32026, 32019, 728, -15029, -15012, -15030, -15031, -15018, -15017, -15030, -15012, 20262, -27539, -20024, 21355, -27525, 18433, -20362, -25151, -22132, 23986, 19849, -16940, 6485, 11370, 11367, 11387, 11363, 11370, 6335, -3702, -3683, -3701, -3704, -3689, -3690, -3701, -3683, -30564, 28406, 26337, -29217, -21357, -22955, -31625, -20815, -28508, 26262, 31582, -20616, -24331, 30980, 28002, -16644, -21510, -16670, 9326, 31266, -5668, 5207, 402, 640, -928, -7238, 5566, -1456, 4986, -6402, 10947, 8308, 12171, -4649, 6184, 31252, 31264, 31270, 31285, 31290, 31271, 31288, 31285, 31264, 31293, 31291, 31290, 31244, 31271, 31281, 31264, 31248, 31265, 31270, 31285, 31264, 31293, 31291, 31290, 31356, 31354, 31354, 31354, 31357, 3566, 13719, 7161, 13652, 11469, 536, 10126, 7844, -1599, 702, 8144, -712, 2624, 2844, -2284, 5158, 8017, 3749};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f10876;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19111 f10877;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f10878;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View f10879;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f10880;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final View f10881;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f10882;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f10883;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Button f10884;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f10885;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Button f10886;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f10887;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v14 */
    /* JADX WARN: Type inference failed for: r32v15 */
    /* JADX WARN: Type inference failed for: r32v16 */
    /* JADX WARN: Type inference failed for: r32v17 */
    /* JADX WARN: Type inference failed for: r32v18 */
    /* JADX WARN: Type inference failed for: r32v19 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v23 */
    /* JADX WARN: Type inference failed for: r32v24 */
    /* JADX WARN: Type inference failed for: r32v25 */
    /* JADX WARN: Type inference failed for: r32v26 */
    /* JADX WARN: Type inference failed for: r32v27 */
    /* JADX WARN: Type inference failed for: r32v29 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v30 */
    /* JADX WARN: Type inference failed for: r32v31 */
    /* JADX WARN: Type inference failed for: r32v32 */
    /* JADX WARN: Type inference failed for: r32v33 */
    /* JADX WARN: Type inference failed for: r32v34 */
    /* JADX WARN: Type inference failed for: r32v35 */
    /* JADX WARN: Type inference failed for: r32v36 */
    /* JADX WARN: Type inference failed for: r32v37 */
    /* JADX WARN: Type inference failed for: r32v38 */
    /* JADX WARN: Type inference failed for: r32v39 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v40 */
    /* JADX WARN: Type inference failed for: r32v41 */
    /* JADX WARN: Type inference failed for: r32v42 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v70 */
    public ViewOnClickListenerC3441(AbstractActivityC3346 abstractActivityC3346, C19111 c19111, byte[] bArr, String str) {
        ?? r32;
        int i;
        Button button;
        short[] sArr;
        int i2;
        short[] sArr2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        ?? r33;
        int i7;
        short[] sArr3;
        int i8;
        short[] sArr4;
        int i9;
        short[] sArr5;
        int i10;
        int i11;
        int iM2566;
        int i12;
        int iM2567;
        int i13;
        ?? r34;
        String strM11919;
        short[] sArr6;
        int i14;
        short[] sArr7;
        int i15;
        String str2;
        int i16;
        int iM2568;
        int i17;
        ?? r35;
        ?? r36;
        boolean z2;
        View view;
        ?? r4;
        int i18;
        int i19;
        ?? r37;
        int i20;
        int i21;
        int i22;
        ?? r38;
        int iM2569;
        ?? r39;
        View view2;
        int iM25610;
        int i23;
        int i24;
        ?? r310;
        int iM6981;
        int i25;
        Button button2;
        ?? r311;
        ?? r312;
        ViewOnClickListenerC3441 viewOnClickListenerC3441 = this;
        AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
        int i26 = 1249948635;
        int i27 = C3746.f11829;
        int i28 = C4263.f13799;
        short s = f10875[0];
        int i29 = (s * 596) - ((s * s) + 88804) <= 0 ? 13420 : 51140;
        C3683.m11210(abstractActivityC3347, C4159.m12578(f10875, 1, 8, i29));
        int iM6982 = C2105.m6981("ۧ᩷") ^ i27;
        int i30 = ((iM6982 ^ i28) * (-459)) ^ 1574575476;
        View view3 = null;
        TextInputLayout textInputLayout = null;
        Button button3 = null;
        DialogInterfaceC0206 dialogInterfaceC0206M11213 = null;
        RunnableC20626 runnableC20626 = null;
        String str3 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        boolean z3 = false;
        int i31 = 0;
        int i32 = 0;
        int iM25611 = 0;
        int iM6983 = 0;
        int iM25612 = 0;
        int iM25613 = 0;
        int i33 = 0;
        ViewOnClickListenerC0059 viewOnClickListenerC0059 = null;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = iM6982 ^ (-819215567);
        View viewM3507 = null;
        View view4 = null;
        View viewM3508 = null;
        View viewM28028 = null;
        Object[] objArr = null;
        int i41 = 0;
        View viewM9259 = null;
        String str4 = null;
        TextInputLayout textInputLayout2 = null;
        Button button4 = null;
        short[] sArr12 = null;
        int iM25614 = 0;
        while (true) {
            i26 = i40 ^ (i30 & (((i26 ^ i28) * 22765) >> 31));
            switch (i26) {
                case -2005111063:
                case -689282163:
                    C3245.m9925();
                    if (C0237.f1507 == 0) {
                        button = button3;
                        z2 = z3 ? 1 : 0;
                        view = viewM3508;
                        iM6981 = C0630.m2566("۠ۡ") ^ i27;
                        i23 = ((iM6981 ^ i28) * (-21653)) ^ (-1650400720);
                        i25 = 1008911869;
                        i40 = iM6981 ^ i25;
                        viewM3508 = view;
                        z3 = z2;
                        i41 = i41;
                        button3 = button;
                        i30 = i23;
                    } else {
                        r33 = i41;
                        i = i32;
                        i7 = iM25614;
                        button = button3;
                        sArr3 = sArr9;
                        i8 = i35;
                        sArr4 = sArr10;
                        i9 = i37;
                        sArr5 = sArr11;
                        i10 = i38;
                        z = z3 ? 1 : 0;
                        iM2566 = C0630.m2566("ܶܳ") ^ i27;
                        i5 = ((iM2566 ^ i28) * (-20035)) ^ (-330500852);
                        i12 = -1729557652;
                        r36 = r33;
                        i6 = iM2566 ^ i12;
                        i38 = i10;
                        i35 = i8;
                        sArr11 = sArr5;
                        sArr10 = sArr4;
                        i37 = i9;
                        sArr9 = sArr3;
                        iM25614 = i7;
                        r35 = r36;
                        i32 = i;
                        i41 = r35;
                        int i42 = i5;
                        i40 = i6;
                        z3 = z;
                        button3 = button;
                        i30 = i42;
                    }
                    break;
                case -1882113243:
                case 1378977975:
                    z = z3 ? 1 : 0;
                    View view5 = viewM28028;
                    C2126.m7031(view5, str4);
                    Button button5 = (Button) view5;
                    viewOnClickListenerC3441.f10886 = button5;
                    iM25613 = C0630.m2566(C11340.m28025(f10875, 47, 3, i29));
                    i33 = 2129570324;
                    int iM6984 = C2105.m6981("ᩴ᩸") ^ i27;
                    i30 = ((iM6984 ^ i28) * (-30111)) ^ (-1839593566);
                    button2 = button5;
                    i40 = iM6984 ^ 511877533;
                    i41 = i41;
                    z3 = z;
                    button3 = button2;
                    break;
                case -1808949263:
                case 2025962955:
                    ?? r313 = i41;
                    i = i32;
                    i7 = iM25614;
                    button = button3;
                    sArr3 = sArr9;
                    i8 = i35;
                    sArr4 = sArr10;
                    i9 = i37;
                    sArr5 = sArr11;
                    i10 = i38;
                    z = z3 ? 1 : 0;
                    C3663.m11167(viewOnClickListenerC0059.f957);
                    sArr8 = f10875;
                    i34 = 9;
                    r33 = r313;
                    if (C2520.f8000 >= 0) {
                        iM2566 = C0630.m2566("ܶܳ") ^ i27;
                        i5 = ((iM2566 ^ i28) * (-20035)) ^ (-330500852);
                        i12 = -1729557652;
                        r36 = r33;
                    } else {
                        iM2566 = (C0630.m2566("ۢۡ") ^ i27) * (-59);
                        i5 = ((iM2566 ^ i28) * 20761) ^ 1502453618;
                        i12 = 2006293114;
                        r36 = r313;
                    }
                    i6 = iM2566 ^ i12;
                    i38 = i10;
                    i35 = i8;
                    sArr11 = sArr5;
                    sArr10 = sArr4;
                    i37 = i9;
                    sArr9 = sArr3;
                    iM25614 = i7;
                    r35 = r36;
                    i32 = i;
                    i41 = r35;
                    int i43 = i5;
                    i40 = i6;
                    z3 = z;
                    button3 = button;
                    i30 = i43;
                    break;
                case -1790662478:
                case -1447585664:
                    button = button3;
                    z = z3 ? 1 : 0;
                    textInputLayout = (TextInputLayout) view3;
                    viewOnClickListenerC3441.f10880 = textInputLayout;
                    iM6983 = C2105.m6981(C4616.m13542(f10875, 41, 3, i29));
                    if (!C2167.m7155()) {
                        iM2567 = (i27 - C0630.m2566("֡֡")) * 5;
                        i5 = ((iM2567 ^ i28) * (-25527)) ^ 2108685523;
                        i13 = -469050127;
                        i6 = iM2567 ^ i13;
                        i41 = i41;
                        int i44 = i5;
                        i40 = i6;
                        z3 = z;
                        button3 = button;
                        i30 = i44;
                    } else {
                        r34 = i41;
                        strM11919 = str3;
                        sArr6 = sArr10;
                        i14 = i37;
                        sArr7 = sArr11;
                        i15 = i38;
                        str2 = str4;
                        i16 = i36;
                        iM2569 = C0630.m2566("֨֫") ^ i28;
                        i20 = ((iM2569 ^ i27) * 19379) ^ (-1233507474);
                        i22 = -491323482;
                        r38 = r34;
                        i21 = iM2569 ^ i22;
                        i38 = i15;
                        i36 = i16;
                        str4 = str2;
                        sArr11 = sArr7;
                        sArr10 = sArr6;
                        i37 = i14;
                        str3 = strM11919;
                        z3 = z;
                        r37 = r38;
                        button3 = button;
                        i30 = i20;
                        i40 = i21;
                        r310 = r37;
                        i41 = r310;
                    }
                    break;
                case -1715240595:
                case 1360889152:
                    C14096.m33705(button4);
                    textInputLayout.setHelperTextEnabled(i41);
                    textInputLayout.setHelperTextColor(ColorStateList.valueOf(C21943.f70291));
                    objArr = new Object[i41];
                    objArr[z3 ? 1 : 0] = str;
                    sArr12 = f10875;
                    i31 = 50;
                    iM2568 = (C2105.m6981("֨֡") ^ i27) * (-25);
                    i30 = ((iM2568 ^ i28) * 12845) ^ (-194758250);
                    i17 = -1867722128;
                    i40 = iM2568 ^ i17;
                    break;
                case -1514848888:
                case -30366412:
                    if (!C0382.f1805) {
                        r32 = i41;
                        i = i32;
                        button = button3;
                        sArr = sArr10;
                        i2 = i37;
                        sArr2 = sArr11;
                        i3 = i38;
                        z = z3 ? 1 : 0;
                        i4 = iM25614;
                        int iM6985 = C2105.m6981("᩶ܽ") ^ i28;
                        int i45 = i4;
                        i11 = ((iM6985 ^ i27) * 24747) ^ (-1825498690);
                        i40 = iM6985 ^ 318675521;
                        i38 = i3;
                        iM25614 = i45;
                        sArr11 = sArr2;
                        sArr10 = sArr;
                        i37 = i2;
                        i32 = i;
                        r39 = r32;
                        r4 = r39;
                        button2 = button;
                        i30 = i11;
                        i41 = r4;
                        z3 = z;
                        button3 = button2;
                    } else {
                        button = button3;
                        z = z3 ? 1 : 0;
                        view2 = viewM3508;
                        r312 = i41;
                        iM25610 = C0630.m2566("᩷ۙ") ^ i28;
                        i23 = ((iM25610 ^ i27) * 18029) ^ (-1154361671);
                        i24 = -1632302476;
                        r311 = r312;
                        i40 = iM25610 ^ i24;
                        viewM3508 = view2;
                        view4 = view4;
                        z3 = z;
                        i41 = r311;
                        button3 = button;
                        i30 = i23;
                    }
                    break;
                case -1486584879:
                case 1634627450:
                    r37 = i41;
                    button = button3;
                    boolean z4 = z3 ? 1 : 0;
                    int i46 = iM25614;
                    viewM3507 = C1005.m3507(viewM9259, i46);
                    sArr10 = f10875;
                    i36 = 15;
                    i37 = 17;
                    int iM6986 = (C2105.m6981("ۚ֫") ^ i28) * (-9);
                    i20 = ((iM6986 ^ i27) * 11237) ^ (-1216903985);
                    i21 = iM6986 ^ 995962930;
                    iM25614 = i46;
                    i38 = i38;
                    z3 = z4 ? 1 : 0;
                    sArr11 = sArr11;
                    button3 = button;
                    i30 = i20;
                    i40 = i21;
                    r310 = r37;
                    i41 = r310;
                    break;
                case -1443726428:
                case -22293263:
                    Button button6 = button3;
                    boolean z5 = z3 ? 1 : 0;
                    viewOnClickListenerC3441.f10885 = abstractActivityC3347;
                    viewOnClickListenerC3441.f10877 = c19111;
                    viewOnClickListenerC3441.f10876 = bArr;
                    viewOnClickListenerC3441.f10878 = true;
                    ViewOnClickListenerC0059 viewOnClickListenerC00510 = c19111.f60202;
                    int iM25615 = (i28 - C0630.m2566("ۢۤ")) * 41;
                    abstractActivityC3347 = abstractActivityC3346;
                    viewOnClickListenerC0059 = viewOnClickListenerC00510;
                    i34 = i34;
                    i38 = i38;
                    i35 = i35;
                    z3 = z5 ? 1 : 0;
                    sArr11 = sArr11;
                    sArr10 = sArr10;
                    i37 = i37;
                    sArr9 = sArr9;
                    i40 = iM25615 ^ 442428701;
                    button3 = button6;
                    iM25614 = iM25614;
                    i30 = ((iM25615 ^ i27) * (-3813)) ^ (-1156205989);
                    i32 = i32;
                    i41 = 1;
                    viewOnClickListenerC3441 = this;
                    break;
                case -1439832169:
                case -3538599:
                    TextInputLayout textInputLayout3 = textInputLayout2;
                    button = button3;
                    viewOnClickListenerC3441.f10887 = textInputLayout3;
                    textInputLayout3.setEndIconVisible(false);
                    textInputLayout3.setEndIconMode(i41);
                    if (C4117.f13076 <= 0) {
                        textInputLayout2 = textInputLayout3;
                        view = viewM3508;
                        z2 = false;
                        iM6981 = C0630.m2566("۠ۡ") ^ i27;
                        i23 = ((iM6981 ^ i28) * (-21653)) ^ (-1650400720);
                        i25 = 1008911869;
                        i40 = iM6981 ^ i25;
                        viewM3508 = view;
                        z3 = z2;
                        i41 = i41;
                        button3 = button;
                        i30 = i23;
                    } else {
                        int iM25616 = (C0630.m2566("ۤܽ") + i27) * (-95);
                        textInputLayout2 = textInputLayout3;
                        button3 = button;
                        z3 = false;
                        i30 = ((iM25616 ^ i28) * 32411) ^ (-371647919);
                        i40 = iM25616 ^ (-1199384147);
                    }
                    break;
                case -1427498978:
                case -835951036:
                    C3245.m9925();
                    r32 = i41;
                    i = i32;
                    button = button3;
                    sArr = sArr10;
                    i2 = i37;
                    sArr2 = sArr11;
                    i3 = i38;
                    z = z3 ? 1 : 0;
                    i4 = iM25614;
                    int iM6987 = C2105.m6981("᩶ܽ") ^ i28;
                    int i47 = i4;
                    i11 = ((iM6987 ^ i27) * 24747) ^ (-1825498690);
                    i40 = iM6987 ^ 318675521;
                    i38 = i3;
                    iM25614 = i47;
                    sArr11 = sArr2;
                    sArr10 = sArr;
                    i37 = i2;
                    i32 = i;
                    r39 = r32;
                    r4 = r39;
                    button2 = button;
                    i30 = i11;
                    i41 = r4;
                    z3 = z;
                    button3 = button2;
                    break;
                case -1317011363:
                case 1834233075:
                    button = button3;
                    z2 = z3 ? 1 : 0;
                    view = viewM3508;
                    C2126.m7031(view, str4);
                    viewOnClickListenerC3441.f10883 = (TextView) view;
                    if (C1294.m4372() <= 0) {
                        iM6981 = C0630.m2566("۠ۡ") ^ i27;
                        i23 = ((iM6981 ^ i28) * (-21653)) ^ (-1650400720);
                        i25 = 1008911869;
                    } else {
                        iM6981 = (C2105.m6981("ۘ᩹") ^ i27) * (-23);
                        i23 = ((iM6981 ^ i28) * 27817) ^ 644760884;
                        i25 = 127031703;
                    }
                    i40 = iM6981 ^ i25;
                    viewM3508 = view;
                    z3 = z2;
                    i41 = i41;
                    button3 = button;
                    i30 = i23;
                    break;
                case -1130085859:
                case -160313400:
                    ?? r314 = i41;
                    view4 = view4;
                    button = button3;
                    z = z3 ? 1 : 0;
                    view2 = viewM3508;
                    viewOnClickListenerC3441.f10879 = view4;
                    sArr11 = f10875;
                    i38 = 35;
                    i39 = 3;
                    r312 = r314;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM25610 = C0630.m2566("᩷ۙ") ^ i28;
                        i23 = ((iM25610 ^ i27) * 18029) ^ (-1154361671);
                        i24 = -1632302476;
                        r311 = r312;
                    } else {
                        iM25610 = C0630.m2566("֫ۛ") ^ i28;
                        i23 = ((iM25610 ^ i27) * (-17457)) ^ (-2125001389);
                        i24 = 940407104;
                        r311 = r314;
                    }
                    i40 = iM25610 ^ i24;
                    viewM3508 = view2;
                    view4 = view4;
                    z3 = z;
                    i41 = r311;
                    button3 = button;
                    i30 = i23;
                    break;
                case -1041950398:
                case -433046744:
                    button = button3;
                    z = z3 ? 1 : 0;
                    View viewM3509 = C1005.m3507(viewM9259, iM6983 ^ 2101436801);
                    C4159.m12575(viewM3509, str4);
                    textInputLayout2 = (TextInputLayout) viewM3509;
                    iM2567 = C0630.m2566("ۘۤ") ^ i28;
                    i5 = ((iM2567 ^ i27) * 32317) ^ 774871859;
                    i13 = -1636756045;
                    i6 = iM2567 ^ i13;
                    i41 = i41;
                    int i48 = i5;
                    i40 = i6;
                    z3 = z;
                    button3 = button;
                    i30 = i48;
                    break;
                case -975153549:
                case 526106603:
                    button = button3;
                    z = z3 ? 1 : 0;
                    iM25611 = C0630.m2566(C4159.m12578(f10875, 38, 3, i29));
                    iM2567 = C0630.m2566("ۙۡ") ^ i28;
                    i5 = ((iM2567 ^ i27) * 461) ^ 458036570;
                    i13 = 1559263052;
                    i6 = iM2567 ^ i13;
                    i41 = i41;
                    int i49 = i5;
                    i40 = i6;
                    z3 = z;
                    button3 = button;
                    i30 = i49;
                    break;
                case -913988227:
                case 386578484:
                    C0287.m1629(textInputLayout2);
                    C19258 c19258M5912 = C1773.m5912(abstractActivityC3346);
                    C0798.m3013(c19258M5912, viewM9259);
                    C1773.m5904(c19258M5912, z3);
                    dialogInterfaceC0206M11213 = C3683.m11213(c19258M5912);
                    viewOnClickListenerC3441.f10882 = dialogInterfaceC0206M11213;
                    runnableC20626 = new RunnableC20626(i41, viewOnClickListenerC3441);
                    iM2568 = C0630.m2566("ܶܽ") ^ i27;
                    i30 = ((iM2568 ^ i28) * 17617) ^ 108019975;
                    i17 = -1422467842;
                    i40 = iM2568 ^ i17;
                    break;
                case -877749701:
                case 891953567:
                    button = button3;
                    z = z3 ? 1 : 0;
                    viewM28028 = C11340.m28028(viewM9259, iM25612 ^ 2102322395);
                    if (C21923.f70183 == 0) {
                        iM2567 = C2105.m6981("ۜ᩹") ^ i27;
                        i5 = ((iM2567 ^ i28) * (-23873)) ^ 1523949218;
                        i13 = -385311523;
                        i6 = iM2567 ^ i13;
                        i41 = i41;
                        int i410 = i5;
                        i40 = i6;
                        z3 = z;
                        button3 = button;
                        i30 = i410;
                    } else {
                        view2 = viewM3508;
                        r312 = i41;
                        iM25610 = C0630.m2566("᩷ۙ") ^ i28;
                        i23 = ((iM25610 ^ i27) * 18029) ^ (-1154361671);
                        i24 = -1632302476;
                        r311 = r312;
                        i40 = iM25610 ^ i24;
                        viewM3508 = view2;
                        view4 = view4;
                        z3 = z;
                        i41 = r311;
                        button3 = button;
                        i30 = i23;
                    }
                    break;
                case -857259720:
                case 587394204:
                    r39 = i41;
                    button = button3;
                    z = z3 ? 1 : 0;
                    View viewM35010 = C1005.m3507(viewM9259, C0630.m2566(str3) ^ 2099048917);
                    C4159.m12575(viewM35010, str4);
                    int iM25617 = C0630.m2566("᩵֫") ^ i28;
                    viewM3508 = viewM3508;
                    i11 = ((iM25617 ^ i27) * 15145) ^ 1728567430;
                    sArr11 = sArr11;
                    i38 = i38;
                    i40 = iM25617 ^ (-1996795165);
                    view4 = viewM35010;
                    r4 = r39;
                    button2 = button;
                    i30 = i11;
                    i41 = r4;
                    z3 = z;
                    button3 = button2;
                    break;
                case -839945508:
                case 494851313:
                    C5088.m14638(dialogInterfaceC0206M11213, C0630.m2566(C7106.m19110(f10875, 53, 3, i29)) ^ 2103308419, runnableC20626);
                    return;
                case -759551123:
                case 1526419737:
                    if (C3537.m10746() > 0) {
                        r33 = i41;
                        i = i32;
                        i7 = iM25614;
                        button = button3;
                        sArr3 = sArr9;
                        i8 = i35;
                        sArr4 = sArr10;
                        i9 = i37;
                        sArr5 = sArr11;
                        i10 = i38;
                        z = z3 ? 1 : 0;
                        iM2566 = C0630.m2566("ܶܳ") ^ i27;
                        i5 = ((iM2566 ^ i28) * (-20035)) ^ (-330500852);
                        i12 = -1729557652;
                        r36 = r33;
                        i6 = iM2566 ^ i12;
                        i38 = i10;
                        i35 = i8;
                        sArr11 = sArr5;
                        sArr10 = sArr4;
                        i37 = i9;
                        sArr9 = sArr3;
                        iM25614 = i7;
                        r35 = r36;
                        i32 = i;
                        i41 = r35;
                        int i411 = i5;
                        i40 = i6;
                        z3 = z;
                        button3 = button;
                        i30 = i411;
                    } else {
                        button = button3;
                        z = z3 ? 1 : 0;
                        view2 = viewM3508;
                        r312 = i41;
                        iM25610 = C0630.m2566("᩷ۙ") ^ i28;
                        i23 = ((iM25610 ^ i27) * 18029) ^ (-1154361671);
                        i24 = -1632302476;
                        r311 = r312;
                        i40 = iM25610 ^ i24;
                        viewM3508 = view2;
                        view4 = view4;
                        z3 = z;
                        i41 = r311;
                        button3 = button;
                        i30 = i23;
                    }
                    break;
                case -617750231:
                case -218300769:
                    short[] sArr13 = sArr9;
                    int i50 = i35;
                    iM25614 = C0630.m2566(C1916.m6311(sArr13, i50, 3, i29)) ^ 2100765642;
                    int iM25618 = (C0630.m2566("ۡۨ") + i27) * (-27);
                    i18 = ((iM25618 ^ i28) * (-22691)) ^ (-1692030097);
                    i19 = iM25618 ^ 1200650438;
                    i35 = i50;
                    i38 = i38;
                    sArr11 = sArr11;
                    sArr10 = sArr10;
                    i37 = i37;
                    sArr9 = sArr13;
                    i40 = i19;
                    z3 = z3 ? 1 : 0;
                    button3 = button3;
                    i30 = i18;
                    r310 = i41;
                    i41 = r310;
                    break;
                case -382722441:
                case 1756136780:
                    button = button3;
                    z2 = z3 ? 1 : 0;
                    View viewM35011 = C1005.m3507(viewM9259, iM25611 ^ 2101936476);
                    C4159.m12575(viewM35011, str4);
                    int iM6988 = (i28 - C2105.m6981("֫ܺ")) * 115;
                    i23 = ((iM6988 ^ i27) * (-13141)) ^ (-1197647592);
                    i40 = iM6988 ^ 273737513;
                    view3 = viewM35011;
                    z3 = z2;
                    i41 = i41;
                    button3 = button;
                    i30 = i23;
                    break;
                case -361039316:
                case 330937938:
                    r32 = i41;
                    i = i32;
                    button = button3;
                    sArr = sArr10;
                    i2 = i37;
                    sArr2 = sArr11;
                    i3 = i38;
                    z = z3 ? 1 : 0;
                    i4 = iM25614;
                    viewM9259 = C3019.m9259(abstractActivityC3347, i);
                    sArr9 = f10875;
                    i35 = 12;
                    if (!C1005.f3721) {
                        int iM6989 = C2105.m6981("᩶ܽ") ^ i28;
                        int i412 = i4;
                        i11 = ((iM6989 ^ i27) * 24747) ^ (-1825498690);
                        i40 = iM6989 ^ 318675521;
                        i38 = i3;
                        iM25614 = i412;
                        sArr11 = sArr2;
                        sArr10 = sArr;
                        i37 = i2;
                        i32 = i;
                        r39 = r32;
                        r4 = r39;
                        button2 = button;
                        i30 = i11;
                        i41 = r4;
                        z3 = z;
                        button3 = button2;
                    } else {
                        int iM69810 = (C2105.m6981("ܺۨ") ^ i28) * (-13);
                        i5 = ((iM69810 ^ i27) * (-17293)) ^ (-578100253);
                        i6 = iM69810 ^ (-1939565605);
                        i38 = i3;
                        iM25614 = i4;
                        sArr11 = sArr2;
                        sArr10 = sArr;
                        i37 = i2;
                        r35 = r32;
                        i32 = i;
                        i41 = r35;
                        int i413 = i5;
                        i40 = i6;
                        z3 = z;
                        button3 = button;
                        i30 = i413;
                    }
                    break;
                case 206694136:
                case 707524760:
                    short[] sArr14 = sArr11;
                    int i51 = i38;
                    int i52 = i39;
                    viewM3508 = C1005.m3507(viewM9259, C0630.m2566(C4263.m12817(sArr14, i51, i52, i29)) ^ 2100472172);
                    int iM69811 = (C2105.m6981("᩹ܶ") ^ i27) * 101;
                    i18 = ((iM69811 ^ i28) * (-21697)) ^ (-233598082);
                    i19 = iM69811 ^ (-109356565);
                    sArr11 = sArr14;
                    i38 = i51;
                    i39 = i52;
                    i40 = i19;
                    z3 = z3 ? 1 : 0;
                    button3 = button3;
                    i30 = i18;
                    r310 = i41;
                    i41 = r310;
                    break;
                case 333857485:
                case 959549760:
                    ?? r315 = i41;
                    button = button3;
                    i16 = i36;
                    int i53 = i37;
                    sArr7 = sArr11;
                    i15 = i38;
                    z = z3 ? 1 : 0;
                    short[] sArr15 = sArr10;
                    String strM8030 = C2520.m8030(sArr15, i16, i53, i29);
                    sArr6 = sArr15;
                    View view6 = viewM3507;
                    C4159.m12575(view6, strM8030);
                    viewOnClickListenerC3441.f10881 = view6;
                    i14 = i53;
                    str2 = strM8030;
                    strM11919 = C3911.m11919(f10875, 32, 3, i29);
                    r34 = r315;
                    if (C0964.f3626 != 0) {
                        iM2569 = C0630.m2566("֨֫") ^ i28;
                        i20 = ((iM2569 ^ i27) * 19379) ^ (-1233507474);
                        i22 = -491323482;
                        r38 = r34;
                    } else {
                        iM2569 = (i27 - C0630.m2566("ۚۖ")) * (-125);
                        i20 = ((iM2569 ^ i28) * (-16295)) ^ (-431219585);
                        i22 = -347039513;
                        r38 = r315;
                    }
                    i21 = iM2569 ^ i22;
                    i38 = i15;
                    i36 = i16;
                    str4 = str2;
                    sArr11 = sArr7;
                    sArr10 = sArr6;
                    i37 = i14;
                    str3 = strM11919;
                    z3 = z;
                    r37 = r38;
                    button3 = button;
                    i30 = i20;
                    i40 = i21;
                    r310 = r37;
                    i41 = r310;
                    break;
                case 648120558:
                case 873111102:
                    C2272.m7503();
                    throw new RuntimeException();
                case 679184528:
                case 1837705171:
                    button = button3;
                    z = z3 ? 1 : 0;
                    iM25612 = C0630.m2566(C11340.m28025(f10875, 44, 3, i29));
                    iM2567 = C2105.m6981("᩺ۡ") ^ i28;
                    i5 = ((iM2567 ^ i27) * (-26835)) ^ (-1743990522);
                    i13 = 24458000;
                    i6 = iM2567 ^ i13;
                    i41 = i41;
                    int i414 = i5;
                    i40 = i6;
                    z3 = z;
                    button3 = button;
                    i30 = i414;
                    break;
                case 992827486:
                case 1679471412:
                    textInputLayout.setHelperText(C4075.m12262(abstractActivityC3347, C0630.m2566(RunnableC0588.m2436(sArr12, i31, 3, i29)) ^ 2103094611, objArr));
                    C0287.m1629(textInputLayout);
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2568 = C0630.m2566("ۛܶ") ^ i28;
                        i30 = ((iM2568 ^ i27) * (-24995)) ^ 398232983;
                        i17 = -36087826;
                        i40 = iM2568 ^ i17;
                    } else {
                        r33 = i41;
                        i = i32;
                        i7 = iM25614;
                        button = button3;
                        sArr3 = sArr9;
                        i8 = i35;
                        sArr4 = sArr10;
                        i9 = i37;
                        sArr5 = sArr11;
                        i10 = i38;
                        z = z3 ? 1 : 0;
                        iM2566 = C0630.m2566("ܶܳ") ^ i27;
                        i5 = ((iM2566 ^ i28) * (-20035)) ^ (-330500852);
                        i12 = -1729557652;
                        r36 = r33;
                        i6 = iM2566 ^ i12;
                        i38 = i10;
                        i35 = i8;
                        sArr11 = sArr5;
                        sArr10 = sArr4;
                        i37 = i9;
                        sArr9 = sArr3;
                        iM25614 = i7;
                        r35 = r36;
                        i32 = i;
                        i41 = r35;
                        int i415 = i5;
                        i40 = i6;
                        z3 = z;
                        button3 = button;
                        i30 = i415;
                    }
                    break;
                case 1011821496:
                case 1866746896:
                    ?? r316 = i41;
                    button = button3;
                    z = z3 ? 1 : 0;
                    short[] sArr16 = sArr8;
                    int i54 = i34;
                    int iM25619 = C0630.m2566(C3911.m11919(sArr16, i54, 3, i29)) ^ 2118817731;
                    int iM25620 = (C0630.m2566("۠ۗ") + i27) * 53;
                    i11 = ((iM25620 ^ i28) * 26331) ^ 608071730;
                    sArr8 = sArr16;
                    i34 = i54;
                    i38 = i38;
                    i35 = i35;
                    r4 = r316 == true ? 1 : 0;
                    sArr11 = sArr11;
                    sArr10 = sArr10;
                    i37 = i37;
                    sArr9 = sArr9;
                    i40 = iM25620 ^ (-1588372576);
                    iM25614 = iM25614;
                    i32 = iM25619;
                    button2 = button;
                    i30 = i11;
                    i41 = r4;
                    z3 = z;
                    button3 = button2;
                    break;
                default:
                    View viewM35012 = C1005.m3507(viewM9259, iM25613 ^ i33);
                    C2126.m7031(viewM35012, str4);
                    Button button7 = (Button) viewM35012;
                    viewOnClickListenerC3441.f10884 = button7;
                    button = button3;
                    C2126.m7039(button, viewOnClickListenerC3441);
                    C2126.m7039(button7, viewOnClickListenerC3441);
                    if (RunnableC1937.f6483 < 0) {
                        int iM69812 = (i28 - C2105.m6981("֡۫")) * 21;
                        z = z3 ? 1 : 0;
                        i11 = ((iM69812 ^ i27) * (-5871)) ^ 936791182;
                        button4 = button7;
                        i40 = iM69812 ^ 446561238;
                        r4 = i41;
                        button2 = button;
                        i30 = i11;
                        i41 = r4;
                        z3 = z;
                        button3 = button2;
                    } else {
                        z = z3 ? 1 : 0;
                        r33 = i41;
                        button4 = button7;
                        i = i32;
                        i7 = iM25614;
                        sArr3 = sArr9;
                        i8 = i35;
                        sArr4 = sArr10;
                        i9 = i37;
                        sArr5 = sArr11;
                        i10 = i38;
                        iM2566 = C0630.m2566("ܶܳ") ^ i27;
                        i5 = ((iM2566 ^ i28) * (-20035)) ^ (-330500852);
                        i12 = -1729557652;
                        r36 = r33;
                        i6 = iM2566 ^ i12;
                        i38 = i10;
                        i35 = i8;
                        sArr11 = sArr5;
                        sArr10 = sArr4;
                        i37 = i9;
                        sArr9 = sArr3;
                        iM25614 = i7;
                        r35 = r36;
                        i32 = i;
                        i41 = r35;
                        int i416 = i5;
                        i40 = i6;
                        z3 = z;
                        button3 = button;
                        i30 = i416;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m10525(ViewOnClickListenerC3441 viewOnClickListenerC3441) {
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        int i = 1141106828;
        int i2 = C3746.f11829;
        int i3 = C7811.f24123;
        int iM6981 = C2105.m6981("ۧ۟") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-2007)) ^ (-1282978571);
        int i5 = -1715417807;
        while (true) {
            i = ((((i ^ i3) * (-21593)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2134177283:
                case -978866987:
                    C2272.m7503();
                    if (C1504.f5354) {
                        iM6981 = C0630.m2566("᩻ۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 5085) ^ 1681337771;
                        i5 = 505044593;
                    } else {
                        iM6981 = (i3 - C2105.m6981("۠֨")) * (-39);
                        i4 = ((iM6981 ^ i2) * (-21725)) ^ 1228643979;
                        i5 = 1374230722;
                    }
                    break;
                case -2113318394:
                case -1907259953:
                    C3663.m11167(dialogInterfaceC0206);
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("᩸ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12177) ^ (-205502136);
                        i5 = -1552031758;
                    } else {
                        iM6981 = (C0630.m2566("ۨܿ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i2) * 28187) ^ 833843265;
                        i5 = -343274830;
                    }
                    break;
                case -2075650701:
                case -1971933701:
                    C1773.m5908();
                    C1005.m3501();
                    iM6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                    i4 = ((iM6981 ^ i2) * (-10411)) ^ (-1125829557);
                    i5 = -1613160390;
                    break;
                case -1744938438:
                case -1417330093:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                        i4 = ((iM6981 ^ i2) * (-10411)) ^ (-1125829557);
                        i5 = -1613160390;
                    } else {
                        iM6981 = C2105.m6981("᩷ܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8599)) ^ 1048495600;
                        i5 = -61493398;
                    }
                    break;
                case -1708799512:
                case -1248174491:
                    if (C7106.m19120() > 0) {
                        iM6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                        i4 = ((iM6981 ^ i2) * (-10411)) ^ (-1125829557);
                        i5 = -1613160390;
                    } else {
                        iM6981 = C0630.m2566("ۛ᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21249)) ^ (-1276989482);
                        i5 = -324072930;
                    }
                    break;
                case -1703276611:
                case 1742389609:
                    if (C2105.m6982() != 0) {
                        iM6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                        i4 = ((iM6981 ^ i2) * (-10411)) ^ (-1125829557);
                        i5 = -1613160390;
                    } else {
                        iM6981 = C0630.m2566("۠۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-5183)) ^ (-1309740771);
                        i5 = -2002812588;
                    }
                    break;
                case -1561027780:
                case 1436685997:
                    C1711.m5736();
                    break;
                case -1522721848:
                case 208327301:
                    if (C0630.f2410 <= 0) {
                        iM6981 = C2105.m6981("᩸ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12177) ^ (-205502136);
                        i5 = -1552031758;
                    } else {
                        iM6981 = C0630.m2566("ܽ۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * 4021) ^ (-1879946002);
                        i5 = -1648083146;
                    }
                    break;
                case -1261435902:
                case -59538252:
                    viewOnClickListenerC3441.f10877.m44041();
                    break;
                case -410008977:
                case 1302745477:
                    if (C4117.f13076 <= 0) {
                        iM6981 = C2105.m6981("᩸ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12177) ^ (-205502136);
                        i5 = -1552031758;
                    } else {
                        iM6981 = (C0630.m2566("֫ܶ") + i2) * 23;
                        i4 = ((iM6981 ^ i3) * 12633) ^ 1039937772;
                        i5 = 1304738286;
                    }
                    break;
                case -141271415:
                case 2025860395:
                    if (C5695.f17556 >= 0) {
                        iM6981 = (i3 - C2105.m6981("۠֨")) * (-39);
                        i4 = ((iM6981 ^ i2) * (-21725)) ^ 1228643979;
                        i5 = 1374230722;
                    } else {
                        iM6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                        i4 = ((iM6981 ^ i2) * (-10411)) ^ (-1125829557);
                        i5 = -1613160390;
                    }
                    break;
                case -15116020:
                case 1737238899:
                    dialogInterfaceC0206 = viewOnClickListenerC3441.f10882;
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C2105.m6981("᩸ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12177) ^ (-205502136);
                        i5 = -1552031758;
                    } else {
                        iM6981 = C2105.m6981("ۡ֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10183)) ^ (-607752432);
                        i5 = -1008432694;
                    }
                    break;
                case 741612851:
                case 776855997:
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                        i4 = ((iM6981 ^ i2) * (-10411)) ^ (-1125829557);
                        i5 = -1613160390;
                    } else {
                        iM6981 = C2105.m6981("ܶۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10395)) ^ 2104446244;
                        i5 = -849548067;
                    }
                    break;
                case 963614744:
                case 1525865068:
                    if (C0714.m2805()) {
                        iM6981 = (C2105.m6981("۠ܶ") ^ i2) * (-61);
                        i4 = ((iM6981 ^ i3) * (-29899)) ^ (-1837472769);
                        i5 = -64044193;
                    } else {
                        iM6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                        i4 = ((iM6981 ^ i2) * (-10411)) ^ (-1125829557);
                        i5 = -1613160390;
                    }
                    break;
                case 1884373598:
                case 2112706669:
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("᩸ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12177) ^ (-205502136);
                        i5 = -1552031758;
                    } else {
                        iM6981 = C2105.m6981("ᩳ᩵") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21521) ^ (-1396387837);
                        i5 = -161726300;
                    }
                    break;
                default:
                    if (C2520.f8000 >= 0) {
                        iM6981 = C2105.m6981("᩸ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12177) ^ (-205502136);
                        i5 = -1552031758;
                    } else {
                        iM6981 = C2105.m6981("ۚ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * 2583) ^ 255464070;
                        i5 = -56383100;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x04b0 A[PHI: r27
      0x04b0: PHI (r27v47 short[]) = (r27v45 short[]), (r27v49 short[]) binds: [B:103:0x0498, B:94:0x0444] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x01eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v70, types: [l.ܶ᩵ۡ] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        short[] sArr;
        int i;
        boolean z;
        String str;
        TextInputLayout textInputLayout;
        String str2;
        int iM2566;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM2567;
        int i6;
        short[] sArr2;
        int i7;
        String str3;
        boolean z2;
        AccelerateInterpolator accelerateInterpolator;
        int i8;
        int i9;
        float[] fArr;
        long j;
        C19258 c19258;
        ObjectAnimator objectAnimator;
        String str4;
        int i10;
        String str5;
        byte[] bArr;
        ObjectAnimator objectAnimatorM5730;
        int iM6981;
        int i11;
        int i12;
        int iM2568;
        int i13;
        int iM11931;
        int iM6982;
        int i14;
        int i15;
        int i16;
        long j2;
        C19258 c19259;
        byte[] bArr2;
        int i17;
        String str6;
        int i18;
        int iM6983;
        int i19;
        int i20;
        int iM2569;
        int i21;
        int i22;
        short[] sArr3;
        int i23;
        String str7;
        ObjectAnimator objectAnimator2;
        AccelerateInterpolator accelerateInterpolator2;
        int i24;
        int i25;
        float[] fArr2;
        long j3;
        String str8;
        C19258 c192510;
        int i26;
        byte[] bArr3;
        boolean z3;
        int i27;
        ObjectAnimator objectAnimator3;
        String str9;
        int i28;
        int iM25610;
        int i29;
        int i30;
        int i31;
        int i32;
        ObjectAnimator objectAnimator4;
        AccelerateInterpolator accelerateInterpolator3;
        View view2;
        C19258 c192511;
        int i33;
        byte[] bArr4;
        int i34;
        String str10;
        int i35;
        String str11;
        ObjectAnimator objectAnimatorM3008;
        float[] fArr3;
        int iM6984;
        int i36;
        int i37;
        int iM6985;
        int i38;
        int i39;
        int iM25611;
        int i40;
        int i41;
        this = this;
        int i42 = 0;
        int i43 = 0;
        String strM1959 = null;
        String strM19510 = null;
        float f = 0.0f;
        ObjectAnimator objectAnimator5 = null;
        int iM6986 = 0;
        String strM1840 = null;
        int i44 = 0;
        int i45 = 0;
        int i46 = -1326001330;
        int i47 = ViewOnClickListenerC1958.f6529;
        int i48 = C1294.f4556;
        int iM6987 = C2105.m6981("ᩴۚ") ^ i48;
        int i49 = ((iM6987 ^ i47) * (-26009)) ^ (-1265714295);
        int i50 = iM6987 ^ (-1667683314);
        final byte[] bArr5 = null;
        TextInputLayout textInputLayout2 = null;
        TextInputLayout textInputLayout3 = null;
        View view3 = null;
        final String strM947 = null;
        final String strM19511 = null;
        float[] fArr4 = null;
        String strM10488 = null;
        long j4 = 0;
        String str12 = null;
        ObjectAnimator objectAnimator6 = null;
        AccelerateInterpolator accelerateInterpolator4 = null;
        C19258 c19258M5912 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i51 = 0;
        int iM6988 = 0;
        int iM3006 = 0;
        boolean z4 = false;
        char c = 0;
        boolean z5 = false;
        int i52 = 0;
        float f2 = 0.0f;
        int i53 = 0;
        int i54 = 0;
        short s = 0;
        int i55 = 0;
        while (true) {
            i46 = i50 ^ (i49 & (((i46 ^ i47) * 3787) >> 31));
            switch (i46) {
                case -2143901379:
                case 314793304:
                    sArr5 = sArr5;
                    i18 = iM6988;
                    c19258M5912 = C1773.m5912(this.f10885);
                    C3432.m10490(c19258M5912, C0630.m2566(RunnableC3474.m10633(f10875, 171, 3, i51)) ^ 2122252420);
                    if (C3683.f11629 < 0) {
                        iM6983 = (i48 - C2105.m6981("᩺᩺")) * 67;
                        i19 = ((iM6983 ^ i47) * 28313) ^ (-1862847921);
                        i20 = -1838806062;
                        i50 = iM6983 ^ i20;
                        i49 = i19;
                        sArr5 = sArr5;
                        iM6988 = i18;
                    } else {
                        iM6988 = i18;
                        i54 = i54;
                        fArr4 = fArr4;
                        j4 = j4;
                        c19258M5912 = c19258M5912;
                        i43 = i43;
                        bArr5 = bArr5;
                        z = z5 ? 1 : 0;
                        i52 = i52;
                        objectAnimator5 = objectAnimator5;
                        str = strM10488;
                        textInputLayout = textInputLayout2;
                        i42 = i42;
                        str2 = str12;
                        int iM25612 = C0630.m2566("۫ۨ") ^ i48;
                        i49 = ((iM25612 ^ i47) * (-21781)) ^ 10352583;
                        i50 = iM25612 ^ 67316660;
                        this = this;
                        strM10488 = str;
                        str12 = str2;
                        textInputLayout2 = textInputLayout;
                        c19258M5912 = c19258M5912;
                        i42 = i42;
                        j4 = j4;
                        iM6988 = iM6988;
                        strM947 = strM947;
                        fArr4 = fArr4;
                        i54 = i54;
                        z5 = z;
                        accelerateInterpolator4 = accelerateInterpolator4;
                        objectAnimator5 = objectAnimator5;
                        bArr5 = bArr5;
                        i53 = i53;
                        i52 = i52;
                        i43 = i43;
                        sArr5 = sArr5;
                        objectAnimator6 = objectAnimator6;
                    }
                    break;
                case -2102110521:
                case 338452350:
                    sArr5 = sArr5;
                    i16 = iM6988;
                    strM947 = strM947;
                    objectAnimator6 = objectAnimator6;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    i53 = i53;
                    int i56 = i54;
                    j2 = j4;
                    c19259 = c19258M5912;
                    i43 = i43;
                    bArr2 = bArr5;
                    i52 = i52;
                    objectAnimator5 = objectAnimator5;
                    i17 = i42;
                    str6 = str12;
                    float f3 = i56;
                    float[] fArr5 = new float[i52];
                    f = 0.0f;
                    fArr5[z5 ? 1 : 0] = 0.0f;
                    fArr5[c] = f3;
                    i54 = i56;
                    strM10488 = C3432.m10488(f10875, 137, 12, i51);
                    if (C2167.f7158 >= 0) {
                        f2 = f3;
                        fArr4 = fArr5;
                        int iM6989 = (i48 - C2105.m6981("۬֨")) * (-111);
                        i50 = iM6989 ^ (-399871483);
                        i49 = ((iM6989 ^ i47) * 22765) ^ (-1271637344);
                        str12 = str6;
                    } else {
                        int iM69810 = (i48 - C2105.m6981("ᩳ֫")) * (-89);
                        i50 = iM69810 ^ (-548988745);
                        f2 = f3;
                        str12 = str6;
                        fArr4 = fArr5;
                        i49 = ((iM69810 ^ i47) * (-23777)) ^ (-2040355320);
                    }
                    c19258M5912 = c19259;
                    i42 = i17;
                    bArr5 = bArr2;
                    j4 = j2;
                    iM6988 = i16;
                    strM947 = strM947;
                    i54 = i54;
                    i53 = i53;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    sArr5 = sArr5;
                    i52 = i52;
                    i43 = i43;
                    objectAnimator6 = objectAnimator6;
                    break;
                case -2060194576:
                case 623862647:
                    RunnableC3474.m10621(textInputLayout3, iM6988);
                    break;
                case -2057930900:
                case -2013190558:
                    sArr5 = sArr5;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    objectAnimator6 = objectAnimator6;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    i53 = i53;
                    i54 = i54;
                    fArr4 = fArr4;
                    j4 = j4;
                    sArr = sArr4;
                    i = i55;
                    c19258M5912 = c19258M5912;
                    i43 = i43;
                    bArr5 = bArr5;
                    z = z5 ? 1 : 0;
                    i52 = i52;
                    objectAnimator5 = objectAnimator5;
                    str = strM10488;
                    i42 = i42;
                    str2 = str12;
                    int i57 = i44 + i45;
                    textInputLayout = textInputLayout2;
                    short s2 = s;
                    int i58 = s2 + 3865;
                    if ((i58 * i58) - (i57 + i57) <= 0) {
                        iM2566 = C2105.m6981("᩷֨") ^ i48;
                        i2 = ((iM2566 ^ i47) * 4393) ^ (-1759647938);
                        i3 = -2119202553;
                    } else {
                        iM2566 = (i48 - C0630.m2566("᩶ܳ")) * (-47);
                        i2 = ((iM2566 ^ i47) * (-28629)) ^ (-2117680759);
                        i3 = -67376419;
                    }
                    i50 = iM2566 ^ i3;
                    s = s2;
                    i49 = i2;
                    strM10488 = str;
                    str12 = str2;
                    sArr4 = sArr;
                    i55 = i;
                    textInputLayout2 = textInputLayout;
                    c19258M5912 = c19258M5912;
                    i42 = i42;
                    j4 = j4;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    fArr4 = fArr4;
                    i54 = i54;
                    z5 = z;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    bArr5 = bArr5;
                    i53 = i53;
                    i52 = i52;
                    i43 = i43;
                    sArr5 = sArr5;
                    objectAnimator6 = objectAnimator6;
                    break;
                case -2020279627:
                case 33313160:
                    AbstractC2021.m6574();
                    sArr5 = sArr5;
                    iM6988 = iM6988;
                    i54 = i54;
                    fArr4 = fArr4;
                    j4 = j4;
                    c19258M5912 = c19258M5912;
                    i43 = i43;
                    bArr5 = bArr5;
                    z = z5 ? 1 : 0;
                    i52 = i52;
                    objectAnimator5 = objectAnimator5;
                    str = strM10488;
                    textInputLayout = textInputLayout2;
                    i42 = i42;
                    str2 = str12;
                    int iM25613 = C0630.m2566("۫ۨ") ^ i48;
                    i49 = ((iM25613 ^ i47) * (-21781)) ^ 10352583;
                    i50 = iM25613 ^ 67316660;
                    this = this;
                    strM10488 = str;
                    str12 = str2;
                    textInputLayout2 = textInputLayout;
                    c19258M5912 = c19258M5912;
                    i42 = i42;
                    j4 = j4;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    fArr4 = fArr4;
                    i54 = i54;
                    z5 = z;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    bArr5 = bArr5;
                    i53 = i53;
                    i52 = i52;
                    i43 = i43;
                    sArr5 = sArr5;
                    objectAnimator6 = objectAnimator6;
                    break;
                case -2017682443:
                case 937410458:
                    sArr3 = sArr5;
                    if (C23343.m51759(strM947)) {
                        iM6985 = (C2105.m6981("ܶᩴ") ^ i47) * (-11);
                        i38 = ((iM6985 ^ i48) * 19821) ^ 792120395;
                        i39 = 428675844;
                    } else {
                        iM6985 = (C0630.m2566("ܽ᩶") ^ i48) * 71;
                        i38 = ((iM6985 ^ i47) * (-18357)) ^ (-960580499);
                        i39 = -2026165924;
                    }
                    i50 = iM6985 ^ i39;
                    i49 = i38;
                    sArr5 = sArr3;
                    break;
                case -1949762596:
                case 865247427:
                    sArr5 = sArr5;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    objectAnimator6 = objectAnimator6;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    i53 = i53;
                    i54 = i54;
                    fArr4 = fArr4;
                    j4 = j4;
                    sArr = sArr4;
                    i = i55;
                    c19258M5912 = c19258M5912;
                    i43 = i43;
                    bArr5 = bArr5;
                    z = z5 ? 1 : 0;
                    i52 = i52;
                    objectAnimator5 = objectAnimator5;
                    str = strM10488;
                    textInputLayout = textInputLayout2;
                    i42 = i42;
                    str2 = str12;
                    s = f10875[119];
                    i44 = s * s;
                    i45 = 14938225;
                    if (!C1504.f5354) {
                        int iM25614 = (i47 - C0630.m2566("ۛ֨")) * 43;
                        i49 = ((iM25614 ^ i48) * 23649) ^ 1805379179;
                        i50 = iM25614 ^ (-1445541428);
                        strM10488 = str;
                        str12 = str2;
                        sArr4 = sArr;
                        i55 = i;
                        textInputLayout2 = textInputLayout;
                        c19258M5912 = c19258M5912;
                        i42 = i42;
                        j4 = j4;
                        iM6988 = iM6988;
                        strM947 = strM947;
                        fArr4 = fArr4;
                        i54 = i54;
                        z5 = z;
                        accelerateInterpolator4 = accelerateInterpolator4;
                        objectAnimator5 = objectAnimator5;
                        bArr5 = bArr5;
                        i53 = i53;
                        i52 = i52;
                        i43 = i43;
                        sArr5 = sArr5;
                        objectAnimator6 = objectAnimator6;
                    } else {
                        sArr4 = sArr;
                        i55 = i;
                        int iM25615 = C0630.m2566("۫ۨ") ^ i48;
                        i49 = ((iM25615 ^ i47) * (-21781)) ^ 10352583;
                        i50 = iM25615 ^ 67316660;
                        this = this;
                        strM10488 = str;
                        str12 = str2;
                        textInputLayout2 = textInputLayout;
                        c19258M5912 = c19258M5912;
                        i42 = i42;
                        j4 = j4;
                        iM6988 = iM6988;
                        strM947 = strM947;
                        fArr4 = fArr4;
                        i54 = i54;
                        z5 = z;
                        accelerateInterpolator4 = accelerateInterpolator4;
                        objectAnimator5 = objectAnimator5;
                        bArr5 = bArr5;
                        i53 = i53;
                        i52 = i52;
                        i43 = i43;
                        sArr5 = sArr5;
                        objectAnimator6 = objectAnimator6;
                    }
                    break;
                case -1948942548:
                case 209092162:
                    RunnableC3474.m10621(textInputLayout3, i43);
                    break;
                case -1934794417:
                case 1657175848:
                    sArr5 = sArr5;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    objectAnimator6 = objectAnimator6;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    i53 = i53;
                    i54 = i54;
                    fArr4 = fArr4;
                    j4 = j4;
                    c19258M5912 = c19258M5912;
                    i43 = i43;
                    bArr5 = bArr5;
                    i52 = i52;
                    objectAnimator5 = objectAnimator5;
                    str = strM10488;
                    i42 = i42;
                    str2 = str12;
                    EditText editTextM5905 = C1773.m5905(textInputLayout3);
                    C0714.m2808(editTextM5905);
                    strM1959 = C0422.m1959(C4117.m12350(editTextM5905));
                    EditText editTextM5906 = C1773.m5905(textInputLayout2);
                    C0714.m2808(editTextM5906);
                    strM19510 = C0422.m1959(C2958.m9028(editTextM5906));
                    String strM9031 = C2958.m9031(f10875, 136, 1, i51);
                    z = z5 ? 1 : 0;
                    if (C3016.m9237((CharSequence) strM1959, (CharSequence) strM9031, z)) {
                        iM2568 = (i48 - C2105.m6981("᩺ᩳ")) * (-31);
                        i4 = ((iM2568 ^ i47) * 18397) ^ 567460849;
                        i13 = 2013987994;
                    } else {
                        iM2568 = (C0630.m2566("ۡ۬") ^ i47) * 81;
                        i4 = ((iM2568 ^ i48) * 16083) ^ 974330082;
                        i13 = -917933553;
                    }
                    i50 = iM2568 ^ i13;
                    strM10488 = str;
                    str12 = str2;
                    z5 = z;
                    i49 = i4;
                    c19258M5912 = c19258M5912;
                    i42 = i42;
                    bArr5 = bArr5;
                    j4 = j4;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    fArr4 = fArr4;
                    i54 = i54;
                    i53 = i53;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    sArr5 = sArr5;
                    i52 = i52;
                    i43 = i43;
                    objectAnimator6 = objectAnimator6;
                    break;
                case -1887059668:
                case 2079845209:
                    sArr5 = sArr5;
                    i18 = iM6988;
                    if (C23343.m51755(strM19511)) {
                        iM6983 = C0630.m2566("ۨܺ") ^ i47;
                        i19 = ((iM6983 ^ i48) * (-20627)) ^ 553978643;
                        i20 = -1020892346;
                    } else {
                        iM6983 = (C0630.m2566("ۖ۟") + i48) * (-63);
                        i19 = ((iM6983 ^ i47) * 9537) ^ 1586678268;
                        i20 = 479808964;
                    }
                    i50 = iM6983 ^ i20;
                    i49 = i19;
                    sArr5 = sArr5;
                    iM6988 = i18;
                    break;
                case -1871526786:
                case 1486009304:
                    m10524();
                    C11340.m28020(new Thread(new RunnableC2904(bArr5, strM947, strM19511, this.f10885, new C21786(this))));
                    break;
                case -1850813788:
                case 48810883:
                    break;
                case -1774589362:
                case -795735177:
                    AbstractC2021.m6571(textInputLayout2, C2105.m6981(ServiceConnectionC3453.m10568(f10875, 168, 3, i51)) ^ 2116126918);
                    break;
                case -1761275357:
                case -1559261434:
                    sArr5 = sArr5;
                    i18 = iM6988;
                    if (C23343.m51758(strM947)) {
                        iM6983 = (i47 - C0630.m2566("᩶ۧ")) * (-121);
                        i19 = ((iM6983 ^ i48) * (-907)) ^ 1297422864;
                        i20 = -1130826473;
                    } else {
                        iM6983 = (C0630.m2566("ۧ᩵") + i48) * (-49);
                        i19 = ((iM6983 ^ i47) * 23179) ^ (-863151578);
                        i20 = 666218351;
                    }
                    i50 = iM6983 ^ i20;
                    i49 = i19;
                    sArr5 = sArr5;
                    iM6988 = i18;
                    break;
                case -1661783475:
                case -102710567:
                    sArr2 = sArr5;
                    i7 = iM6988;
                    str3 = strM947;
                    z2 = z5 ? 1 : 0;
                    objectAnimator6 = objectAnimator6;
                    accelerateInterpolator = accelerateInterpolator4;
                    i8 = i53;
                    i9 = i54;
                    fArr = fArr4;
                    j = j4;
                    c19258 = c19258M5912;
                    i43 = i43;
                    i52 = i52;
                    objectAnimator = objectAnimator5;
                    str4 = strM10488;
                    i10 = i42;
                    str5 = str12;
                    boolean z6 = this.f10878;
                    bArr = this.f10876;
                    z4 = z6;
                    iM6986 = C2105.m6981(C4616.m13542(f10875, 127, 3, i51));
                    if (C1420.f5096 > 0) {
                        int iM69811 = C2105.m6981("۠᩹") ^ i48;
                        i49 = ((iM69811 ^ i47) * (-6229)) ^ (-111725503);
                        i50 = iM69811 ^ (-1624796960);
                        this = this;
                        strM10488 = str4;
                        i53 = i8;
                        str12 = str5;
                        z5 = z2 ? 1 : 0;
                        bArr5 = bArr;
                        c19258M5912 = c19258;
                        i42 = i10;
                        sArr5 = sArr2;
                        j4 = j;
                        iM6988 = i7;
                        strM947 = str3;
                        fArr4 = fArr;
                        i54 = i9;
                        accelerateInterpolator4 = accelerateInterpolator;
                        objectAnimator5 = objectAnimator;
                        i52 = i52;
                        i43 = i43;
                        objectAnimator6 = objectAnimator6;
                    } else {
                        objectAnimatorM5730 = objectAnimator6;
                        int iM69812 = (C2105.m6981("ۨۧ") ^ i48) * 3;
                        i31 = ((iM69812 ^ i47) * 22837) ^ (-1366320427);
                        i50 = iM69812 ^ (-414700587);
                        this = this;
                        strM10488 = str4;
                        i53 = i8;
                        str12 = str5;
                        z5 = z2;
                        bArr5 = bArr;
                        c19258M5912 = c19258;
                        i42 = i10;
                        sArr5 = sArr2;
                        j4 = j;
                        iM6988 = i7;
                        fArr4 = fArr;
                        i54 = i9;
                        accelerateInterpolator4 = accelerateInterpolator;
                        objectAnimator5 = objectAnimator;
                        i52 = i52;
                        i43 = i43;
                        objectAnimator6 = objectAnimatorM5730;
                        i49 = i31;
                        strM947 = str3;
                    }
                    break;
                case -1466961312:
                case 1238844114:
                    sArr3 = sArr5;
                    if (C23343.m51759(strM1959)) {
                        iM6985 = C2105.m6981("ܶܺ") ^ i47;
                        i38 = ((iM6985 ^ i48) * 19871) ^ (-147660951);
                        i39 = -1623871293;
                    } else {
                        iM6985 = C2105.m6981("ۖ۠") ^ i47;
                        i38 = ((iM6985 ^ i48) * (-27323)) ^ 15530175;
                        i39 = 1982582473;
                    }
                    i50 = iM6985 ^ i39;
                    i49 = i38;
                    sArr5 = sArr3;
                    break;
                case -1425325886:
                case 1912724910:
                    C1047.m3599();
                    C4117.m12364();
                    break;
                case -1356139100:
                case 1450210003:
                    sArr3 = sArr5;
                    int i59 = i53;
                    if (C0798.m3007(strM1959) < i59) {
                        iM6984 = (C2105.m6981("᩹ۗ") ^ i48) * (-17);
                        i36 = ((iM6984 ^ i47) * 18843) ^ (-753524765);
                        i37 = 1159003692;
                    } else {
                        iM6984 = C2105.m6981("֨۬") ^ i48;
                        i36 = ((iM6984 ^ i47) * 25945) ^ 1801087530;
                        i37 = -421576003;
                    }
                    i50 = iM6984 ^ i37;
                    i53 = i59;
                    i49 = i36;
                    sArr5 = sArr3;
                    break;
                case -1329057079:
                case 637898963:
                    i51 = o.a.F;
                    int iM25616 = C0630.m2566("ᩴ᩻") ^ i47;
                    iM3006 = iM3006;
                    i49 = ((iM25616 ^ i48) * 13193) ^ (-139321472);
                    i50 = iM25616 ^ 1818274093;
                    this = this;
                    strM10488 = strM10488;
                    str12 = str12;
                    z5 = z5 ? 1 : 0;
                    sArr4 = sArr4;
                    i55 = i55;
                    c19258M5912 = c19258M5912;
                    i42 = i42;
                    bArr5 = bArr5;
                    j4 = j4;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    fArr4 = fArr4;
                    i54 = i54;
                    i53 = i53;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    sArr5 = sArr5;
                    i52 = i52;
                    i43 = i43;
                    objectAnimator6 = objectAnimator6;
                    break;
                case -1320529489:
                case 1792193247:
                    C7811.m20844();
                    if (C3683.f11629 >= 0) {
                        sArr3 = sArr5;
                        i35 = iM6988;
                        str11 = strM947;
                        objectAnimator4 = objectAnimator6;
                        accelerateInterpolator3 = accelerateInterpolator4;
                        i24 = i53;
                        fArr3 = fArr4;
                        c192511 = c19258M5912;
                        i33 = i43;
                        bArr4 = bArr5;
                        i34 = i52;
                        objectAnimatorM3008 = objectAnimator5;
                        str10 = strM10488;
                        i32 = i42;
                        view2 = view3;
                        int iM69813 = C2105.m6981("ۤۚ") ^ i47;
                        i50 = iM69813 ^ (-1711599426);
                        strM10488 = str10;
                        view3 = view2;
                        i52 = i34;
                        i49 = ((iM69813 ^ i48) * (-26239)) ^ (-316261905);
                        i43 = i33;
                        c19258M5912 = c192511;
                        i42 = i32;
                        iM6988 = i35;
                        objectAnimator6 = objectAnimator4;
                        strM947 = str11;
                        fArr4 = fArr3;
                        objectAnimator5 = objectAnimatorM3008;
                        accelerateInterpolator4 = accelerateInterpolator3;
                        bArr5 = bArr4;
                        i53 = i24;
                        sArr5 = sArr3;
                    } else {
                        sArr2 = sArr5;
                        i7 = iM6988;
                        str3 = strM947;
                        objectAnimatorM5730 = objectAnimator6;
                        accelerateInterpolator = accelerateInterpolator4;
                        i8 = i53;
                        i9 = i54;
                        fArr = fArr4;
                        j = j4;
                        c19258 = c19258M5912;
                        i43 = i43;
                        bArr = bArr5;
                        z2 = z5 ? 1 : 0;
                        i52 = i52;
                        objectAnimator = objectAnimator5;
                        str4 = strM10488;
                        i10 = i42;
                        str5 = str12;
                        int iM69814 = (C2105.m6981("ۨۧ") ^ i48) * 3;
                        i31 = ((iM69814 ^ i47) * 22837) ^ (-1366320427);
                        i50 = iM69814 ^ (-414700587);
                        this = this;
                        strM10488 = str4;
                        i53 = i8;
                        str12 = str5;
                        z5 = z2;
                        bArr5 = bArr;
                        c19258M5912 = c19258;
                        i42 = i10;
                        sArr5 = sArr2;
                        j4 = j;
                        iM6988 = i7;
                        fArr4 = fArr;
                        i54 = i9;
                        accelerateInterpolator4 = accelerateInterpolator;
                        objectAnimator5 = objectAnimator;
                        i52 = i52;
                        i43 = i43;
                        objectAnimator6 = objectAnimatorM5730;
                        i49 = i31;
                        strM947 = str3;
                    }
                    break;
                case -1277646908:
                case 808438098:
                    sArr3 = sArr5;
                    i23 = iM6988;
                    str7 = strM947;
                    objectAnimator2 = objectAnimator6;
                    accelerateInterpolator2 = accelerateInterpolator4;
                    i24 = i53;
                    i25 = i54;
                    fArr2 = fArr4;
                    j3 = j4;
                    str8 = str12;
                    c192510 = c19258M5912;
                    i26 = i43;
                    bArr3 = bArr5;
                    z3 = z5 ? 1 : 0;
                    i27 = i52;
                    objectAnimator3 = objectAnimator5;
                    str9 = strM10488;
                    i28 = iM6986 ^ 2124811775;
                    strM1840 = C0382.m1840(f10875, 130, 3, i51);
                    if (C1005.m3501()) {
                        iM25610 = (C0630.m2566("۟᩺") + i47) * 63;
                        i29 = ((iM25610 ^ i48) * 30431) ^ 1988322225;
                        i30 = -1244698725;
                    } else {
                        iM25610 = C0630.m2566("ᩳۨ") ^ i48;
                        i29 = ((iM25610 ^ i47) * 15103) ^ 1731825139;
                        i30 = -1137876963;
                    }
                    i50 = iM25610 ^ i30;
                    strM10488 = str9;
                    str12 = str8;
                    i49 = i29;
                    i42 = i28;
                    objectAnimator5 = objectAnimator3;
                    c19258M5912 = c192510;
                    j4 = j3;
                    iM6988 = i23;
                    strM947 = str7;
                    fArr4 = fArr2;
                    i54 = i25;
                    i52 = i27;
                    z5 = z3;
                    accelerateInterpolator4 = accelerateInterpolator2;
                    i43 = i26;
                    bArr5 = bArr3;
                    objectAnimator6 = objectAnimator2;
                    i53 = i24;
                    sArr5 = sArr3;
                    break;
                case -1244051190:
                case 1813793948:
                    sArr5 = sArr5;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    objectAnimator6 = objectAnimator6;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    i53 = i53;
                    i54 = i54;
                    fArr4 = fArr4;
                    j4 = j4;
                    c19258M5912 = c19258M5912;
                    i43 = i43;
                    bArr5 = bArr5;
                    Object[] objArr = z5 ? 1 : 0;
                    i52 = i52;
                    objectAnimator5 = objectAnimator5;
                    String str13 = strM10488;
                    i42 = i42;
                    String str14 = str12;
                    boolean z7 = this.f10878;
                    View view4 = this.f10879;
                    if (z7) {
                        iM6981 = (i47 - C2105.m6981("ᩴ᩷")) * (-9);
                        i11 = ((iM6981 ^ i48) * 24299) ^ (-1490543928);
                        i12 = -326357644;
                    } else {
                        iM6981 = C2105.m6981("ᩳ۠") ^ i47;
                        i11 = ((iM6981 ^ i48) * 9139) ^ 1783751678;
                        i12 = 848092503;
                    }
                    i50 = iM6981 ^ i12;
                    strM10488 = str13;
                    str12 = str14;
                    z5 = objArr == true ? 1 : 0;
                    view3 = view4;
                    i49 = i11;
                    c19258M5912 = c19258M5912;
                    i42 = i42;
                    bArr5 = bArr5;
                    j4 = j4;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    fArr4 = fArr4;
                    i54 = i54;
                    i53 = i53;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    sArr5 = sArr5;
                    i52 = i52;
                    i43 = i43;
                    objectAnimator6 = objectAnimator6;
                    break;
                case -1236162565:
                case -363762775:
                    C2272.m7503();
                    if (C1504.f5354) {
                        iM25611 = C0630.m2566("ۜ᩹") ^ i47;
                        i40 = ((iM25611 ^ i48) * 23281) ^ 1832070348;
                        i41 = -742936161;
                    } else {
                        iM25611 = (C0630.m2566("ۢ᩹") + i47) * 99;
                        i40 = ((iM25611 ^ i48) * (-24345)) ^ 690239058;
                        i41 = -912027106;
                    }
                    i50 = iM25611 ^ i41;
                    i49 = i40;
                    break;
                case -1236038616:
                case 305077768:
                    sArr3 = sArr5;
                    if (C23343.m51755(strM1959)) {
                        iM6985 = C2105.m6981("ܶܺ") ^ i47;
                        i38 = ((iM6985 ^ i48) * 19871) ^ (-147660951);
                        i39 = -1623871293;
                    } else {
                        iM6985 = (C2105.m6981("ۜ۬") + i48) * 73;
                        i38 = ((iM6985 ^ i47) * (-21233)) ^ (-1332970047);
                        i39 = 296996462;
                    }
                    i50 = iM6985 ^ i39;
                    i49 = i38;
                    sArr5 = sArr3;
                    break;
                case -1148654300:
                case -858679612:
                    C2520.m8029(c19258M5912, C0630.m2566(C2958.m9031(sArr5, 180, 3, i51)) ^ 2126072608, null);
                    C3683.m11213(c19258M5912);
                    break;
                case -1124191250:
                case 943735709:
                    sArr5 = sArr5;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    objectAnimator6 = objectAnimator6;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    i53 = i53;
                    i54 = i54;
                    fArr4 = fArr4;
                    j4 = j4;
                    c19258M5912 = c19258M5912;
                    i43 = i43;
                    bArr5 = bArr5;
                    z = z5 ? 1 : 0;
                    i52 = i52;
                    objectAnimator5 = objectAnimator5;
                    str = strM10488;
                    i42 = i42;
                    str2 = str12;
                    RunnableC0588.m2430(view, C2105.m6988(f10875, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 1, i51));
                    iM3006 = C0798.m3006(view);
                    sArr4 = f10875;
                    i55 = UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    if (!C21923.m49329()) {
                        int iM25617 = C0630.m2566("᩹ܳ") ^ i47;
                        i4 = ((iM25617 ^ i48) * (-26997)) ^ (-1593186740);
                        i50 = iM25617 ^ 728420294;
                        this = this;
                        strM10488 = str;
                        str12 = str2;
                        z5 = z;
                        i49 = i4;
                        c19258M5912 = c19258M5912;
                        i42 = i42;
                        bArr5 = bArr5;
                        j4 = j4;
                        iM6988 = iM6988;
                        strM947 = strM947;
                        fArr4 = fArr4;
                        i54 = i54;
                        i53 = i53;
                        accelerateInterpolator4 = accelerateInterpolator4;
                        objectAnimator5 = objectAnimator5;
                        sArr5 = sArr5;
                        i52 = i52;
                        i43 = i43;
                        objectAnimator6 = objectAnimator6;
                    } else {
                        textInputLayout = textInputLayout2;
                        int iM25618 = C0630.m2566("۫ۨ") ^ i48;
                        i49 = ((iM25618 ^ i47) * (-21781)) ^ 10352583;
                        i50 = iM25618 ^ 67316660;
                        this = this;
                        strM10488 = str;
                        str12 = str2;
                        textInputLayout2 = textInputLayout;
                        c19258M5912 = c19258M5912;
                        i42 = i42;
                        j4 = j4;
                        iM6988 = iM6988;
                        strM947 = strM947;
                        fArr4 = fArr4;
                        i54 = i54;
                        z5 = z;
                        accelerateInterpolator4 = accelerateInterpolator4;
                        objectAnimator5 = objectAnimator5;
                        bArr5 = bArr5;
                        i53 = i53;
                        i52 = i52;
                        i43 = i43;
                        sArr5 = sArr5;
                        objectAnimator6 = objectAnimator6;
                    }
                    break;
                case -1112933473:
                case 13582165:
                    sArr3 = sArr5;
                    byte[] bArr6 = bArr5;
                    str3 = strM947;
                    Object[] objArr2 = z5 ? 1 : 0;
                    int i60 = i52;
                    ObjectAnimator objectAnimator7 = objectAnimator6;
                    AccelerateInterpolator accelerateInterpolator5 = accelerateInterpolator4;
                    ObjectAnimator objectAnimator8 = objectAnimator5;
                    int i61 = i54;
                    float[] fArr6 = fArr4;
                    long j5 = j4;
                    C19258 c192512 = c19258M5912;
                    int i62 = i42;
                    String str15 = strM10488;
                    String str16 = str12;
                    int iM25619 = C0630.m2566(strM1840) ^ 2101624237;
                    iM6988 = C2105.m6981(C4117.m12355(f10875, 133, 3, i51)) ^ 2118590023;
                    TextInputLayout textInputLayout4 = this.f10887;
                    textInputLayout3 = this.f10880;
                    if (!z4) {
                        int iM25620 = C0630.m2566("ۧ᩹") ^ i47;
                        i31 = ((iM25620 ^ i48) * (-8825)) ^ 1274103893;
                        i50 = iM25620 ^ (-1583863491);
                        strM10488 = str15;
                        textInputLayout2 = textInputLayout4;
                        str12 = str16;
                        z5 = objArr2 == true ? 1 : 0;
                        c19258M5912 = c192512;
                        i42 = i62;
                        bArr5 = bArr6;
                        sArr5 = sArr3;
                        j4 = j5;
                        objectAnimator6 = objectAnimator7;
                        fArr4 = fArr6;
                        i54 = i61;
                        i53 = 4;
                        accelerateInterpolator4 = accelerateInterpolator5;
                        objectAnimator5 = objectAnimator8;
                        i52 = i60;
                        i43 = iM25619;
                        i49 = i31;
                        strM947 = str3;
                    } else {
                        int iM25621 = C0630.m2566("ᩳ֡") ^ i48;
                        int i63 = ((iM25621 ^ i47) * 11165) ^ 1936136791;
                        i50 = iM25621 ^ 1303467045;
                        strM10488 = str15;
                        str12 = str16;
                        z5 = objArr2 == true ? 1 : 0;
                        c19258M5912 = c192512;
                        i42 = i62;
                        bArr5 = bArr6;
                        j4 = j5;
                        objectAnimator6 = objectAnimator7;
                        strM947 = str3;
                        fArr4 = fArr6;
                        i54 = i61;
                        i53 = 4;
                        accelerateInterpolator4 = accelerateInterpolator5;
                        objectAnimator5 = objectAnimator8;
                        i52 = i60;
                        i43 = iM25619;
                        i49 = i63;
                        textInputLayout2 = textInputLayout4;
                        sArr5 = sArr3;
                    }
                    break;
                case -1060707094:
                case -992562246:
                    AbstractC2021.m6571(textInputLayout2, C2105.m6981(C1047.m3603(f10875, 165, 3, i51)) ^ 2128179346);
                    break;
                case -1000339089:
                case 649565128:
                    if (C1047.f3863 < 0) {
                        sArr2 = sArr5;
                        i7 = iM6988;
                        str3 = strM947;
                        objectAnimatorM5730 = objectAnimator6;
                        accelerateInterpolator = accelerateInterpolator4;
                        i8 = i53;
                        i9 = i54;
                        fArr = fArr4;
                        j = j4;
                        c19258 = c19258M5912;
                        i43 = i43;
                        bArr = bArr5;
                        z2 = z5 ? 1 : 0;
                        i52 = i52;
                        objectAnimator = objectAnimator5;
                        str4 = strM10488;
                        i10 = i42;
                        str5 = str12;
                        int iM69815 = (C2105.m6981("ۨۧ") ^ i48) * 3;
                        i31 = ((iM69815 ^ i47) * 22837) ^ (-1366320427);
                        i50 = iM69815 ^ (-414700587);
                        this = this;
                        strM10488 = str4;
                        i53 = i8;
                        str12 = str5;
                        z5 = z2;
                        bArr5 = bArr;
                        c19258M5912 = c19258;
                        i42 = i10;
                        sArr5 = sArr2;
                        j4 = j;
                        iM6988 = i7;
                        fArr4 = fArr;
                        i54 = i9;
                        accelerateInterpolator4 = accelerateInterpolator;
                        objectAnimator5 = objectAnimator;
                        i52 = i52;
                        i43 = i43;
                        objectAnimator6 = objectAnimatorM5730;
                        i49 = i31;
                        strM947 = str3;
                    } else {
                        sArr3 = sArr5;
                        i23 = iM6988;
                        str7 = strM947;
                        objectAnimator2 = objectAnimator6;
                        accelerateInterpolator2 = accelerateInterpolator4;
                        i24 = i53;
                        i25 = i54;
                        fArr2 = fArr4;
                        j3 = j4;
                        c192510 = c19258M5912;
                        i26 = i43;
                        bArr3 = bArr5;
                        z3 = z5 ? 1 : 0;
                        i27 = i52;
                        objectAnimator3 = objectAnimator5;
                        str9 = strM10488;
                        i28 = i42;
                        str8 = str12;
                        iM25610 = C0630.m2566("ᩳۨ") ^ i48;
                        i29 = ((iM25610 ^ i47) * 15103) ^ 1731825139;
                        i30 = -1137876963;
                        i50 = iM25610 ^ i30;
                        strM10488 = str9;
                        str12 = str8;
                        i49 = i29;
                        i42 = i28;
                        objectAnimator5 = objectAnimator3;
                        c19258M5912 = c192510;
                        j4 = j3;
                        iM6988 = i23;
                        strM947 = str7;
                        fArr4 = fArr2;
                        i54 = i25;
                        i52 = i27;
                        z5 = z3;
                        accelerateInterpolator4 = accelerateInterpolator2;
                        i43 = i26;
                        bArr5 = bArr3;
                        objectAnimator6 = objectAnimator2;
                        i53 = i24;
                        sArr5 = sArr3;
                    }
                    break;
                case -975632478:
                case 122995615:
                    AbstractC2021.m6571(textInputLayout3, iM6988);
                    break;
                case -947289384:
                case -871102433:
                    if (C0237.m1481() < 0) {
                        iM25611 = C0630.m2566("ۜ᩹") ^ i47;
                        i40 = ((iM25611 ^ i48) * 23281) ^ 1832070348;
                        i41 = -742936161;
                        i50 = iM25611 ^ i41;
                        i49 = i40;
                    } else {
                        sArr5 = sArr5;
                        iM6988 = iM6988;
                        i54 = i54;
                        fArr4 = fArr4;
                        j4 = j4;
                        c19258M5912 = c19258M5912;
                        i43 = i43;
                        bArr5 = bArr5;
                        z = z5 ? 1 : 0;
                        i52 = i52;
                        objectAnimator5 = objectAnimator5;
                        str = strM10488;
                        textInputLayout = textInputLayout2;
                        i42 = i42;
                        str2 = str12;
                        int iM256110 = C0630.m2566("۫ۨ") ^ i48;
                        i49 = ((iM256110 ^ i47) * (-21781)) ^ 10352583;
                        i50 = iM256110 ^ 67316660;
                        this = this;
                        strM10488 = str;
                        str12 = str2;
                        textInputLayout2 = textInputLayout;
                        c19258M5912 = c19258M5912;
                        i42 = i42;
                        j4 = j4;
                        iM6988 = iM6988;
                        strM947 = strM947;
                        fArr4 = fArr4;
                        i54 = i54;
                        z5 = z;
                        accelerateInterpolator4 = accelerateInterpolator4;
                        objectAnimator5 = objectAnimator5;
                        bArr5 = bArr5;
                        i53 = i53;
                        i52 = i52;
                        i43 = i43;
                        sArr5 = sArr5;
                        objectAnimator6 = objectAnimator6;
                    }
                    break;
                case -899323089:
                case -172262024:
                    sArr5 = sArr5;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    objectAnimator6 = objectAnimator6;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    i53 = i53;
                    i54 = i54;
                    fArr4 = fArr4;
                    j4 = j4;
                    c19258M5912 = c19258M5912;
                    i43 = i43;
                    bArr5 = bArr5;
                    z = z5 ? 1 : 0;
                    i52 = i52;
                    objectAnimator5 = objectAnimator5;
                    str = strM10488;
                    i42 = i42;
                    str2 = str12;
                    TextInputLayout[] textInputLayoutArr = new TextInputLayout[i52];
                    textInputLayoutArr[z ? 1 : 0] = textInputLayout3;
                    textInputLayoutArr[c] = textInputLayout2;
                    if (!C0287.m1632(textInputLayoutArr)) {
                        iM2568 = C0630.m2566("ۡᩴ") ^ i48;
                        i4 = ((iM2568 ^ i47) * 24587) ^ (-1536255774);
                        i13 = -842127696;
                        i50 = iM2568 ^ i13;
                        strM10488 = str;
                        str12 = str2;
                        z5 = z;
                        i49 = i4;
                        c19258M5912 = c19258M5912;
                        i42 = i42;
                        bArr5 = bArr5;
                        j4 = j4;
                        iM6988 = iM6988;
                        strM947 = strM947;
                        fArr4 = fArr4;
                        i54 = i54;
                        i53 = i53;
                        accelerateInterpolator4 = accelerateInterpolator4;
                        objectAnimator5 = objectAnimator5;
                        sArr5 = sArr5;
                        i52 = i52;
                        i43 = i43;
                        objectAnimator6 = objectAnimator6;
                    }
                    i5 = iM3006;
                    iM2567 = C0630.m2566("֫ۖ") ^ i48;
                    i4 = ((iM2567 ^ i47) * 24819) ^ 1533264498;
                    i6 = -1377776861;
                    i50 = iM2567 ^ i6;
                    this = this;
                    iM3006 = i5;
                    strM10488 = str;
                    str12 = str2;
                    z5 = z;
                    i49 = i4;
                    c19258M5912 = c19258M5912;
                    i42 = i42;
                    bArr5 = bArr5;
                    j4 = j4;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    fArr4 = fArr4;
                    i54 = i54;
                    i53 = i53;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    sArr5 = sArr5;
                    i52 = i52;
                    i43 = i43;
                    objectAnimator6 = objectAnimator6;
                    break;
                case -887688656:
                case 81143665:
                    sArr5 = sArr5;
                    i18 = iM6988;
                    if (C0798.m3007(strM19510) < 7) {
                        iM6983 = C2105.m6981("ۛܿ") ^ i48;
                        i19 = ((iM6983 ^ i47) * (-9141)) ^ 1768002840;
                        i20 = 1809768021;
                    } else {
                        iM6983 = C2105.m6981("ܺ᩺") ^ i47;
                        i19 = ((iM6983 ^ i48) * 10589) ^ (-910475000);
                        i20 = 974071237;
                    }
                    i50 = iM6983 ^ i20;
                    i49 = i19;
                    sArr5 = sArr5;
                    iM6988 = i18;
                    break;
                case -841455361:
                case -772273030:
                    if (C1294.f4556 >= 0) {
                        iM25611 = C0630.m2566("ۗ֫") ^ i48;
                        i40 = ((iM25611 ^ i47) * 16785) ^ (-2142005105);
                        i41 = -1983906729;
                        i50 = iM25611 ^ i41;
                        i49 = i40;
                    } else {
                        sArr2 = sArr5;
                        i7 = iM6988;
                        str3 = strM947;
                        objectAnimatorM5730 = objectAnimator6;
                        accelerateInterpolator = accelerateInterpolator4;
                        i8 = i53;
                        i9 = i54;
                        fArr = fArr4;
                        j = j4;
                        c19258 = c19258M5912;
                        i43 = i43;
                        bArr = bArr5;
                        z2 = z5 ? 1 : 0;
                        i52 = i52;
                        objectAnimator = objectAnimator5;
                        str4 = strM10488;
                        i10 = i42;
                        str5 = str12;
                        int iM69816 = (C2105.m6981("ۨۧ") ^ i48) * 3;
                        i31 = ((iM69816 ^ i47) * 22837) ^ (-1366320427);
                        i50 = iM69816 ^ (-414700587);
                        this = this;
                        strM10488 = str4;
                        i53 = i8;
                        str12 = str5;
                        z5 = z2;
                        bArr5 = bArr;
                        c19258M5912 = c19258;
                        i42 = i10;
                        sArr5 = sArr2;
                        j4 = j;
                        iM6988 = i7;
                        fArr4 = fArr;
                        i54 = i9;
                        accelerateInterpolator4 = accelerateInterpolator;
                        objectAnimator5 = objectAnimator;
                        i52 = i52;
                        i43 = i43;
                        objectAnimator6 = objectAnimatorM5730;
                        i49 = i31;
                        strM947 = str3;
                    }
                    break;
                case -654609197:
                case 416529981:
                    c19258 = c19258M5912;
                    sArr2 = sArr5;
                    ObjectAnimator objectAnimator9 = objectAnimator5;
                    i8 = i53;
                    i10 = i42;
                    int i64 = i52;
                    objectAnimator = objectAnimator9;
                    float[] fArr7 = new float[i64];
                    fArr7[z5 ? 1 : 0] = -f2;
                    fArr7[c] = f;
                    View view5 = view3;
                    str4 = strM10488;
                    ObjectAnimator objectAnimatorM16025 = C5695.m16025(view5, str4, fArr7);
                    i43 = i43;
                    long j6 = j4;
                    objectAnimatorM5730 = C1711.m5730(objectAnimatorM16025, j6);
                    j = j6;
                    str5 = str12;
                    C4159.m12575(objectAnimatorM5730, str5);
                    AccelerateInterpolator accelerateInterpolator6 = new AccelerateInterpolator();
                    if (RunnableC1108.f4040) {
                        int iM69817 = (C2105.m6981("ܺ۠") ^ i48) * 85;
                        i49 = ((iM69817 ^ i47) * 30829) ^ 399994218;
                        i50 = iM69817 ^ 1743059109;
                        strM10488 = str4;
                        str12 = str5;
                        c19258M5912 = c19258;
                        i42 = i10;
                        view3 = view5;
                        j4 = j;
                        i53 = i8;
                        accelerateInterpolator4 = accelerateInterpolator6;
                        objectAnimator5 = objectAnimator;
                        i43 = i43;
                        sArr5 = sArr2;
                        objectAnimator6 = objectAnimatorM5730;
                        i52 = i64;
                    } else {
                        i7 = iM6988;
                        str3 = strM947;
                        view3 = view5;
                        i9 = i54;
                        fArr = fArr4;
                        bArr = bArr5;
                        z2 = z5 ? 1 : 0;
                        accelerateInterpolator = accelerateInterpolator6;
                        i52 = i64;
                        int iM69818 = (C2105.m6981("ۨۧ") ^ i48) * 3;
                        i31 = ((iM69818 ^ i47) * 22837) ^ (-1366320427);
                        i50 = iM69818 ^ (-414700587);
                        this = this;
                        strM10488 = str4;
                        i53 = i8;
                        str12 = str5;
                        z5 = z2;
                        bArr5 = bArr;
                        c19258M5912 = c19258;
                        i42 = i10;
                        sArr5 = sArr2;
                        j4 = j;
                        iM6988 = i7;
                        fArr4 = fArr;
                        i54 = i9;
                        accelerateInterpolator4 = accelerateInterpolator;
                        objectAnimator5 = objectAnimator;
                        i52 = i52;
                        i43 = i43;
                        objectAnimator6 = objectAnimatorM5730;
                        i49 = i31;
                        strM947 = str3;
                    }
                    break;
                case -526170410:
                case 1848408946:
                    sArr5 = sArr5;
                    i18 = iM6988;
                    if (C23343.m51757(strM19510)) {
                        iM6983 = C2105.m6981("᩻ᩳ") ^ i47;
                        i19 = ((iM6983 ^ i48) * (-30125)) ^ (-1355045885);
                        i20 = 2089832097;
                    } else {
                        iM6983 = (i48 - C2105.m6981("ۚ֫")) * (-35);
                        i19 = ((iM6983 ^ i47) * 2887) ^ 40828698;
                        i20 = -2016083396;
                    }
                    i50 = iM6983 ^ i20;
                    i49 = i19;
                    sArr5 = sArr5;
                    iM6988 = i18;
                    break;
                case -430911016:
                case 1816473853:
                    iM11931 = -C0237.m1480(view3);
                    i54 = iM11931;
                    int iM25622 = C0630.m2566("᩵ۡ") ^ i48;
                    i50 = iM25622 ^ (-1155018151);
                    strM10488 = strM10488;
                    str12 = str12;
                    z5 = z5 ? 1 : 0;
                    i49 = ((iM25622 ^ i47) * 24411) ^ (-1206157047);
                    c19258M5912 = c19258M5912;
                    i42 = i42;
                    bArr5 = bArr5;
                    j4 = j4;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    fArr4 = fArr4;
                    i53 = i53;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    sArr5 = sArr5;
                    i52 = i52;
                    i43 = i43;
                    objectAnimator6 = objectAnimator6;
                    break;
                case -300440102:
                case 1544545363:
                    sArr5 = sArr5;
                    C7106.m19114(c19258M5912, C2105.m6981(C3245.m9934(f10875, 174, 3, i51)) ^ 2126558200);
                    if (C11340.f33930 < 0) {
                        i18 = iM6988;
                        C1294.m4380(c19258M5912, C2105.m6981(C7811.m20837(f10875, 177, 3, i51)) ^ 2124480861, new DialogInterface.OnClickListener(this) { // from class: l.۠᩵ۡ

                            /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ ViewOnClickListenerC3441 f25703;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i65) {
                                String str17 = null;
                                int i66 = 1218622860;
                                int i67 = C3432.f10845;
                                int i68 = C5695.f17556;
                                int iM25623 = C0630.m2566("ۤۙ") ^ i67;
                                int i69 = ((iM25623 ^ i68) * 28623) ^ (-1742076681);
                                int i70 = 637432182;
                                while (true) {
                                    i66 = ((((i66 ^ i68) * 17103) >> 31) & i69) ^ (iM25623 ^ i70);
                                    switch (i66) {
                                        case -2140040484:
                                        case -207368057:
                                            if (C3432.f10845 < 0) {
                                                iM25623 = (C2105.m6981("ᩴᩴ") ^ i68) * (-107);
                                                i69 = ((iM25623 ^ i67) * (-21217)) ^ 1061693574;
                                                i70 = 88013500;
                                            } else {
                                                iM25623 = (C0630.m2566("ۢ᩷") ^ i67) * 47;
                                                i69 = ((iM25623 ^ i68) * (-9831)) ^ 180953208;
                                                i70 = 1801063774;
                                            }
                                            break;
                                        case -1863649749:
                                        case -1300130358:
                                            if (C1420.f5096 <= 0) {
                                                iM25623 = (i68 - C0630.m2566("۫۫")) * (-65);
                                                i69 = ((iM25623 ^ i67) * 26113) ^ (-1217060644);
                                                i70 = 504283158;
                                            } else {
                                                iM25623 = C0630.m2566("᩶ۧ") ^ i68;
                                                i69 = ((iM25623 ^ i67) * 715) ^ (-2088189382);
                                                i70 = 376889677;
                                            }
                                            break;
                                        case -1563893358:
                                        case -378026352:
                                            if (C1916.f6442) {
                                                iM25623 = C0630.m2566("۬ܶ") ^ i67;
                                                i69 = ((iM25623 ^ i68) * (-22859)) ^ 1031741201;
                                                i70 = 1121792557;
                                            } else {
                                                iM25623 = (C0630.m2566("ۢ᩷") ^ i67) * 47;
                                                i69 = ((iM25623 ^ i68) * (-9831)) ^ 180953208;
                                                i70 = 1801063774;
                                            }
                                            break;
                                        case -1451259035:
                                        case -111615729:
                                            str17 = strM947;
                                            if (C1504.f5354) {
                                                iM25623 = (i68 - C2105.m6981("ۜۡ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                i69 = ((iM25623 ^ i67) * (-16159)) ^ (-1552276791);
                                                i70 = -373497562;
                                            } else {
                                                iM25623 = (i68 - C0630.m2566("ۚ᩻")) * (-105);
                                                i69 = ((iM25623 ^ i67) * (-8147)) ^ (-1163473176);
                                                i70 = 2085919291;
                                            }
                                            break;
                                        case -951806660:
                                        case 1109974805:
                                            if (AbstractC2021.f6743 <= 0) {
                                                iM25623 = (C0630.m2566("ۢ᩷") ^ i67) * 47;
                                                i69 = ((iM25623 ^ i68) * (-9831)) ^ 180953208;
                                                i70 = 1801063774;
                                            } else {
                                                iM25623 = C2105.m6981("ۡ᩻") ^ i67;
                                                i69 = ((iM25623 ^ i68) * 16683) ^ (-2031654787);
                                                i70 = 476790775;
                                            }
                                            break;
                                        case -930009951:
                                        case 1711761923:
                                            ViewOnClickListenerC3441.m10519(this.f25703, str17, strM19511);
                                            break;
                                        case -920636207:
                                        case 1435973421:
                                            C21923.m49329();
                                            if (C1711.m5736() <= 0) {
                                                iM25623 = (i68 - C0630.m2566("۫۫")) * (-65);
                                                i69 = ((iM25623 ^ i67) * 26113) ^ (-1217060644);
                                                i70 = 504283158;
                                            } else {
                                                iM25623 = (i67 - C2105.m6981("ۙ᩵")) * (-47);
                                                i69 = ((iM25623 ^ i68) * 9725) ^ (-1119172998);
                                                i70 = 250486957;
                                            }
                                            break;
                                        case -813614975:
                                        case -510499212:
                                            C0483.m2121();
                                            C0422.m1963();
                                            iM25623 = (i68 - C0630.m2566("۫۫")) * (-65);
                                            i69 = ((iM25623 ^ i67) * 26113) ^ (-1217060644);
                                            i70 = 504283158;
                                            break;
                                        case -567585121:
                                        case 1313285964:
                                            C1128.m3851();
                                            if (C3432.f10845 < 0) {
                                                iM25623 = (C0630.m2566("ۢ᩷") ^ i67) * 47;
                                                i69 = ((iM25623 ^ i68) * (-9831)) ^ 180953208;
                                                i70 = 1801063774;
                                            } else {
                                                iM25623 = (i68 - C0630.m2566("۫۫")) * (-65);
                                                i69 = ((iM25623 ^ i67) * 26113) ^ (-1217060644);
                                                i70 = 504283158;
                                            }
                                            break;
                                        case -328957172:
                                        case 1979958326:
                                            if (C3683.m11222()) {
                                                iM25623 = (C0630.m2566("ۢ᩷") ^ i67) * 47;
                                                i69 = ((iM25623 ^ i68) * (-9831)) ^ 180953208;
                                                i70 = 1801063774;
                                            } else {
                                                iM25623 = C2105.m6981("᩺ܿ") ^ i68;
                                                i69 = ((iM25623 ^ i67) * (-27695)) ^ (-1791354825);
                                                i70 = 31342655;
                                            }
                                            break;
                                        case -320185235:
                                        case 1245392064:
                                            if (RunnableC1937.f6483 >= 0) {
                                                iM25623 = (i68 - C0630.m2566("۫۫")) * (-65);
                                                i69 = ((iM25623 ^ i67) * 26113) ^ (-1217060644);
                                                i70 = 504283158;
                                            } else {
                                                iM25623 = (C2105.m6981("֫֫") + i67) * 109;
                                                i69 = ((iM25623 ^ i68) * 18251) ^ (-1473676836);
                                                i70 = 1540413181;
                                            }
                                            break;
                                        case -137775921:
                                        case 36671527:
                                            if (C4075.f12947 >= 0) {
                                                iM25623 = (i68 - C2105.m6981("ۜۡ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                i69 = ((iM25623 ^ i67) * (-16159)) ^ (-1552276791);
                                                i70 = -373497562;
                                            } else {
                                                iM25623 = (i68 - C0630.m2566("᩻ܽ")) * (-31);
                                                i69 = ((iM25623 ^ i67) * 30599) ^ (-646107247);
                                                i70 = -1428955495;
                                            }
                                            break;
                                        case -79496661:
                                        case 1524212171:
                                            if (C1128.m3851() <= 0) {
                                                iM25623 = (C2105.m6981("ᩴᩴ") ^ i68) * (-107);
                                                i69 = ((iM25623 ^ i67) * (-21217)) ^ 1061693574;
                                                i70 = 88013500;
                                            } else {
                                                iM25623 = (i67 - C0630.m2566("ۧ᩶")) * 41;
                                                i69 = ((iM25623 ^ i68) * 23365) ^ 755919224;
                                                i70 = 1450553980;
                                            }
                                            break;
                                        case 854412267:
                                        case 1449764317:
                                            if (C0483.f2088 >= 0) {
                                                iM25623 = (i68 - C2105.m6981("ۜۡ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                i69 = ((iM25623 ^ i67) * (-16159)) ^ (-1552276791);
                                                i70 = -373497562;
                                            } else {
                                                iM25623 = C2105.m6981("ۜ֫") ^ i68;
                                                i69 = ((iM25623 ^ i67) * 5035) ^ (-2106914278);
                                                i70 = -1472041465;
                                            }
                                            break;
                                        case 1138599189:
                                        case 1165333535:
                                            if (C0964.f3626 != 0) {
                                                iM25623 = (i68 - C0630.m2566("۫۫")) * (-65);
                                                i69 = ((iM25623 ^ i67) * 26113) ^ (-1217060644);
                                                i70 = 504283158;
                                            } else {
                                                iM25623 = C0630.m2566("ܰ᩺") ^ i67;
                                                i69 = ((iM25623 ^ i68) * 13277) ^ 1646842307;
                                                i70 = 400311280;
                                            }
                                            break;
                                        default:
                                            C4117.m12364();
                                            C4159.m12565();
                                            break;
                                    }
                                    return;
                                }
                            }

                            {
                                int i65 = -1582011331;
                                int i66 = RunnableC0588.f2309;
                                int i67 = C3683.f11629;
                                int iM69819 = (C2105.m6981("ᩴ᩶") + i67) * (-101);
                                int i68 = ((iM69819 ^ i66) * 5453) ^ 102767810;
                                int i69 = 351067630;
                                while (true) {
                                    i65 = ((((i65 ^ i66) * 32419) >> 31) & i68) ^ (iM69819 ^ i69);
                                    switch (i65) {
                                        case -1848747557:
                                        case 325290571:
                                            this.f25703 = this;
                                            if (RunnableC3474.f10992 <= 0) {
                                                iM69819 = (C0630.m2566("֡ۛ") ^ i67) * 69;
                                                i68 = ((iM69819 ^ i66) * (-17507)) ^ (-482134224);
                                                i69 = 1259210844;
                                            } else {
                                                iM69819 = C0630.m2566("᩸ۡ") ^ i67;
                                                i68 = ((iM69819 ^ i66) * (-8487)) ^ (-943452615);
                                                i69 = -1535247308;
                                            }
                                            break;
                                        case -1505225740:
                                        case 133295391:
                                            if (C3245.f10203 <= 0) {
                                                iM69819 = (C0630.m2566("ۢ᩸") ^ i67) * 123;
                                                i68 = ((iM69819 ^ i66) * 25473) ^ (-1512355681);
                                                i69 = -610075411;
                                            } else {
                                                iM69819 = C2105.m6981("ۢۖ") ^ i66;
                                                i68 = ((iM69819 ^ i67) * (-11163)) ^ (-1415085534);
                                                i69 = -789319348;
                                            }
                                            break;
                                        case -1487811916:
                                        case -854760227:
                                            if (C1128.m3851() <= 0) {
                                                iM69819 = C0630.m2566("᩷֨") ^ i66;
                                                i68 = ((iM69819 ^ i67) * (-25725)) ^ 1892859938;
                                                i69 = -308179517;
                                            } else {
                                                iM69819 = (C0630.m2566("֡ۛ") ^ i67) * 69;
                                                i68 = ((iM69819 ^ i66) * (-17507)) ^ (-482134224);
                                                i69 = 1259210844;
                                            }
                                            break;
                                        case -1340528662:
                                        case -1002756840:
                                            if (C3245.f10203 <= 0) {
                                                iM69819 = (C2105.m6981("᩶᩷") ^ i67) * (-103);
                                                i68 = ((iM69819 ^ i66) * (-8611)) ^ 2075493276;
                                                i69 = -11446096;
                                            } else {
                                                iM69819 = C0630.m2566("᩶ۤ") ^ i67;
                                                i68 = ((iM69819 ^ i66) * (-14525)) ^ (-1045388881);
                                                i69 = -210429988;
                                            }
                                            break;
                                        case -1269640986:
                                        case 90022694:
                                            if (RunnableC1108.f4040) {
                                                iM69819 = (C2105.m6981("᩹ᩳ") + i67) * 95;
                                                i68 = ((iM69819 ^ i66) * (-20871)) ^ (-45912678);
                                                i69 = 1553672660;
                                            } else {
                                                iM69819 = (C2105.m6981("᩶᩷") ^ i67) * (-103);
                                                i68 = ((iM69819 ^ i66) * (-8611)) ^ 2075493276;
                                                i69 = -11446096;
                                            }
                                            break;
                                        case -933388265:
                                        case 1643855356:
                                            C1294.m4372();
                                            if (C3663.m11168() >= 0) {
                                                iM69819 = (C0630.m2566("ۢ᩸") ^ i67) * 123;
                                                i68 = ((iM69819 ^ i66) * 25473) ^ (-1512355681);
                                                i69 = -610075411;
                                            } else {
                                                iM69819 = (C0630.m2566("֡ۛ") ^ i67) * 69;
                                                i68 = ((iM69819 ^ i66) * (-17507)) ^ (-482134224);
                                                i69 = 1259210844;
                                            }
                                            break;
                                        case -922684163:
                                        case -355284478:
                                            C3911.m11924();
                                            throw new RuntimeException();
                                        case -773746276:
                                        case 569643289:
                                            if (C3537.m10746() <= 0) {
                                                iM69819 = (C2105.m6981("᩶᩷") ^ i67) * (-103);
                                                i68 = ((iM69819 ^ i66) * (-8611)) ^ 2075493276;
                                                i69 = -11446096;
                                            } else {
                                                iM69819 = (C2105.m6981("۫ܿ") + i66) * 19;
                                                i68 = ((iM69819 ^ i67) * (-23393)) ^ 1653435512;
                                                i69 = -1623967161;
                                            }
                                            break;
                                        case -486508467:
                                        case 900079185:
                                            return;
                                        case -272498906:
                                        case 1952008317:
                                            C11340.m28031();
                                            if (C7811.f24123 < 0) {
                                                iM69819 = (C0630.m2566("֡ۛ") ^ i67) * 69;
                                                i68 = ((iM69819 ^ i66) * (-17507)) ^ (-482134224);
                                                i69 = 1259210844;
                                            } else {
                                                iM69819 = (i66 - C2105.m6981("ۜ۫")) * 43;
                                                i68 = ((iM69819 ^ i67) * 23507) ^ 2073312712;
                                                i69 = 939383650;
                                            }
                                            break;
                                        case -219130850:
                                        case 1301825706:
                                            if (C1294.f4556 >= 0) {
                                                iM69819 = (C2105.m6981("᩶᩷") ^ i67) * (-103);
                                                i68 = ((iM69819 ^ i66) * (-8611)) ^ 2075493276;
                                                i69 = -11446096;
                                            } else {
                                                iM69819 = C0630.m2566("᩷ܺ") ^ i66;
                                                i68 = ((iM69819 ^ i67) * 20399) ^ (-1112932337);
                                                i69 = -1666881750;
                                            }
                                            break;
                                        case -133393809:
                                        case -91106614:
                                            if (C0630.f2410 <= 0) {
                                                iM69819 = (C0630.m2566("ۢ᩸") ^ i67) * 123;
                                                i68 = ((iM69819 ^ i66) * 25473) ^ (-1512355681);
                                                i69 = -610075411;
                                            } else {
                                                iM69819 = C2105.m6981("᩻ۘ") ^ i67;
                                                i68 = ((iM69819 ^ i66) * (-14103)) ^ (-1072055446);
                                                i69 = -579797062;
                                            }
                                            break;
                                        case 703858154:
                                        case 916525975:
                                            if (C3911.m11924() <= 0) {
                                                iM69819 = C0630.m2566("᩷֨") ^ i66;
                                                i68 = ((iM69819 ^ i67) * (-25725)) ^ 1892859938;
                                                i69 = -308179517;
                                            } else {
                                                iM69819 = C0630.m2566("ۤ᩹") ^ i67;
                                                i68 = ((iM69819 ^ i66) * 24789) ^ 372100838;
                                                i69 = -713875231;
                                            }
                                            break;
                                        case 1225315031:
                                        case 1509310587:
                                            if (C3911.f12484 >= 0) {
                                                iM69819 = (C0630.m2566("ۢ᩸") ^ i67) * 123;
                                                i68 = ((iM69819 ^ i66) * 25473) ^ (-1512355681);
                                                i69 = -610075411;
                                            } else {
                                                iM69819 = (i66 - C2105.m6981("۠ۛ")) * 91;
                                                i68 = ((iM69819 ^ i67) * 13995) ^ (-1624875778);
                                                i69 = 1188323894;
                                            }
                                            break;
                                        case 1358497456:
                                        case 1724294138:
                                            if (C2105.f7037 != 0) {
                                                iM69819 = (C0630.m2566("֡ۛ") ^ i67) * 69;
                                                i68 = ((iM69819 ^ i66) * (-17507)) ^ (-482134224);
                                                i69 = 1259210844;
                                            } else {
                                                iM69819 = C0630.m2566("ᩳ᩻") ^ i66;
                                                i68 = ((iM69819 ^ i67) * 11141) ^ 1060000032;
                                                i69 = 702649901;
                                            }
                                            break;
                                        default:
                                            C21923.m49329();
                                            iM69819 = (i66 - C2105.m6981("ۜ۫")) * 43;
                                            i68 = ((iM69819 ^ i67) * 23507) ^ 2073312712;
                                            i69 = 939383650;
                                            break;
                                    }
                                }
                            }
                        });
                        sArr5 = f10875;
                        if (C3245.f10203 > 0) {
                            int iM25623 = (C0630.m2566("ܿۧ") + i47) * (-33);
                            i50 = iM25623 ^ (-342332763);
                            i49 = ((iM25623 ^ i48) * 631) ^ (-1346934906);
                            iM6988 = i18;
                        } else {
                            sArr5 = sArr5;
                            i16 = i18;
                        }
                    } else {
                        i16 = iM6988;
                    }
                    i54 = i54;
                    j2 = j4;
                    c19259 = c19258M5912;
                    i43 = i43;
                    bArr2 = bArr5;
                    i52 = i52;
                    objectAnimator5 = objectAnimator5;
                    i17 = i42;
                    str6 = str12;
                    int iM69819 = (i48 - C2105.m6981("۬֨")) * (-111);
                    i50 = iM69819 ^ (-399871483);
                    i49 = ((iM69819 ^ i47) * 22765) ^ (-1271637344);
                    str12 = str6;
                    c19258M5912 = c19259;
                    i42 = i17;
                    bArr5 = bArr2;
                    j4 = j2;
                    iM6988 = i16;
                    strM947 = strM947;
                    i54 = i54;
                    i53 = i53;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    sArr5 = sArr5;
                    i52 = i52;
                    i43 = i43;
                    objectAnimator6 = objectAnimator6;
                    break;
                case -264495568:
                case -222642097:
                    RunnableC3474.m10621(textInputLayout2, i42);
                    break;
                case -206376102:
                case 1654376626:
                    C0714.m2805();
                    if (!RunnableC3474.m10630()) {
                        iM25611 = C2105.m6981("᩺ۡ") ^ i47;
                        i40 = ((iM25611 ^ i48) * 12489) ^ 1640181923;
                        i41 = 1056058703;
                        i50 = iM25611 ^ i41;
                        i49 = i40;
                    } else {
                        sArr2 = sArr5;
                        i7 = iM6988;
                        str3 = strM947;
                        objectAnimatorM5730 = objectAnimator6;
                        accelerateInterpolator = accelerateInterpolator4;
                        i8 = i53;
                        i9 = i54;
                        fArr = fArr4;
                        j = j4;
                        c19258 = c19258M5912;
                        i43 = i43;
                        bArr = bArr5;
                        z2 = z5 ? 1 : 0;
                        i52 = i52;
                        objectAnimator = objectAnimator5;
                        str4 = strM10488;
                        i10 = i42;
                        str5 = str12;
                        int iM698110 = (C2105.m6981("ۨۧ") ^ i48) * 3;
                        i31 = ((iM698110 ^ i47) * 22837) ^ (-1366320427);
                        i50 = iM698110 ^ (-414700587);
                        this = this;
                        strM10488 = str4;
                        i53 = i8;
                        str12 = str5;
                        z5 = z2;
                        bArr5 = bArr;
                        c19258M5912 = c19258;
                        i42 = i10;
                        sArr5 = sArr2;
                        j4 = j;
                        iM6988 = i7;
                        fArr4 = fArr;
                        i54 = i9;
                        accelerateInterpolator4 = accelerateInterpolator;
                        objectAnimator5 = objectAnimator;
                        i52 = i52;
                        i43 = i43;
                        objectAnimator6 = objectAnimatorM5730;
                        i49 = i31;
                        strM947 = str3;
                    }
                    break;
                case -133611459:
                case 1002320416:
                    AbstractC2021.m6571(textInputLayout3, i42);
                    break;
                case -128931758:
                case 2039231796:
                    sArr3 = sArr5;
                    i32 = i42;
                    objectAnimator4 = objectAnimator6;
                    accelerateInterpolator3 = accelerateInterpolator4;
                    i24 = i53;
                    view2 = view3;
                    float[] fArr8 = fArr4;
                    c192511 = c19258M5912;
                    i33 = i43;
                    bArr4 = bArr5;
                    i34 = i52;
                    str10 = strM10488;
                    i35 = iM6988;
                    str11 = strM947;
                    objectAnimatorM3008 = C0798.m3008(C5695.m16025(view2, str10, fArr8), 200L);
                    fArr3 = fArr8;
                    String strM2575 = C0630.m2575(f10875, 149, 16, i51);
                    C2126.m7031(objectAnimatorM3008, strM2575);
                    if (RunnableC0588.m2441() >= 0) {
                        str12 = strM2575;
                        j4 = 200;
                        int iM698111 = C2105.m6981("ۤۚ") ^ i47;
                        i50 = iM698111 ^ (-1711599426);
                        strM10488 = str10;
                        view3 = view2;
                        i52 = i34;
                        i49 = ((iM698111 ^ i48) * (-26239)) ^ (-316261905);
                        i43 = i33;
                        c19258M5912 = c192511;
                        i42 = i32;
                        iM6988 = i35;
                        objectAnimator6 = objectAnimator4;
                        strM947 = str11;
                        fArr4 = fArr3;
                    } else {
                        int iM69820 = C2105.m6981("ۜ֫") ^ i47;
                        i50 = iM69820 ^ 1290846277;
                        str12 = strM2575;
                        strM10488 = str10;
                        view3 = view2;
                        i52 = i34;
                        i49 = ((iM69820 ^ i48) * (-11647)) ^ 1933167933;
                        i43 = i33;
                        c19258M5912 = c192511;
                        i42 = i32;
                        iM6988 = i35;
                        objectAnimator6 = objectAnimator4;
                        strM947 = str11;
                        fArr4 = fArr3;
                        j4 = 200;
                    }
                    objectAnimator5 = objectAnimatorM3008;
                    accelerateInterpolator4 = accelerateInterpolator3;
                    bArr5 = bArr4;
                    i53 = i24;
                    sArr5 = sArr3;
                    break;
                case 46833800:
                case 1643605340:
                    sArr5 = sArr5;
                    int i65 = iM6988;
                    objectAnimator6 = objectAnimator6;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    i53 = i53;
                    i54 = i54;
                    fArr4 = fArr4;
                    long j7 = j4;
                    C19258 c192513 = c19258M5912;
                    i43 = i43;
                    byte[] bArr7 = bArr5;
                    i52 = i52;
                    objectAnimator5 = objectAnimator5;
                    String str17 = strM10488;
                    int i66 = i42;
                    String str18 = str12;
                    EditText editTextM2132 = C0483.m2132(textInputLayout3);
                    C0714.m2808(editTextM2132);
                    strM947 = C0050.m947(C4117.m12350(editTextM2132));
                    EditText editTextM5907 = C1773.m5905(textInputLayout2);
                    C0714.m2808(editTextM5907);
                    strM19511 = C0422.m1959(C2958.m9028(editTextM5907));
                    if (C1711.m5741(strM947) < i53) {
                        iM6982 = (C0630.m2566("ۢ۬") + i47) * 127;
                        i14 = ((iM6982 ^ i48) * (-15761)) ^ 139603665;
                        i15 = 2076358749;
                    } else {
                        iM6982 = (i47 - C2105.m6981("ܶ᩻")) * q.h;
                        i14 = ((iM6982 ^ i48) * 637) ^ 975092178;
                        i15 = -1823374945;
                    }
                    i50 = iM6982 ^ i15;
                    strM10488 = str17;
                    str12 = str18;
                    i49 = i14;
                    c19258M5912 = c192513;
                    i42 = i66;
                    bArr5 = bArr7;
                    j4 = j7;
                    iM6988 = i65;
                    fArr4 = fArr4;
                    i54 = i54;
                    i53 = i53;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    sArr5 = sArr5;
                    i52 = i52;
                    i43 = i43;
                    objectAnimator6 = objectAnimator6;
                    break;
                case 321318115:
                case 841042727:
                    if (C1294.m4372() <= 0) {
                        iM25611 = C0630.m2566("ۜ᩹") ^ i47;
                        i40 = ((iM25611 ^ i48) * 23281) ^ 1832070348;
                        i41 = -742936161;
                    } else {
                        iM25611 = (i47 - C0630.m2566("᩻ܳ")) * (-81);
                        i40 = ((iM25611 ^ i48) * 26035) ^ 227178217;
                        i41 = -1381300690;
                    }
                    i50 = iM25611 ^ i41;
                    i49 = i40;
                    break;
                case 374652272:
                case 1722565549:
                    iM11931 = C3911.m11931(view3);
                    i54 = iM11931;
                    int iM25624 = C0630.m2566("᩵ۡ") ^ i48;
                    i50 = iM25624 ^ (-1155018151);
                    strM10488 = strM10488;
                    str12 = str12;
                    z5 = z5 ? 1 : 0;
                    i49 = ((iM25624 ^ i47) * 24411) ^ (-1206157047);
                    c19258M5912 = c19258M5912;
                    i42 = i42;
                    bArr5 = bArr5;
                    j4 = j4;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    fArr4 = fArr4;
                    i53 = i53;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    sArr5 = sArr5;
                    i52 = i52;
                    i43 = i43;
                    objectAnimator6 = objectAnimator6;
                    break;
                case 570994740:
                case 1195370277:
                    RunnableC3474.m10621(textInputLayout3, i43);
                    break;
                case 627269249:
                case 1132909428:
                    if (C3019.f9544 >= 0) {
                        sArr3 = sArr5;
                        i23 = iM6988;
                        str7 = strM947;
                        objectAnimator2 = objectAnimator6;
                        accelerateInterpolator2 = accelerateInterpolator4;
                        i24 = i53;
                        i25 = i54;
                        fArr2 = fArr4;
                        j3 = j4;
                        c192510 = c19258M5912;
                        i26 = i43;
                        bArr3 = bArr5;
                        z3 = z5 ? 1 : 0;
                        i27 = i52;
                        objectAnimator3 = objectAnimator5;
                        str9 = strM10488;
                        i28 = i42;
                        str8 = str12;
                        iM25610 = C0630.m2566("ᩳۨ") ^ i48;
                        i29 = ((iM25610 ^ i47) * 15103) ^ 1731825139;
                        i30 = -1137876963;
                        i50 = iM25610 ^ i30;
                        strM10488 = str9;
                        str12 = str8;
                        i49 = i29;
                        i42 = i28;
                        objectAnimator5 = objectAnimator3;
                        c19258M5912 = c192510;
                        j4 = j3;
                        iM6988 = i23;
                        strM947 = str7;
                        fArr4 = fArr2;
                        i54 = i25;
                        i52 = i27;
                        z5 = z3;
                        accelerateInterpolator4 = accelerateInterpolator2;
                        i43 = i26;
                        bArr5 = bArr3;
                        objectAnimator6 = objectAnimator2;
                        i53 = i24;
                        sArr5 = sArr3;
                    } else {
                        iM25611 = C0630.m2566("ۜ᩹") ^ i47;
                        i40 = ((iM25611 ^ i48) * 23281) ^ 1832070348;
                        i41 = -742936161;
                        i50 = iM25611 ^ i41;
                        i49 = i40;
                    }
                    break;
                case 682665422:
                case 1418978497:
                    m10524();
                    final ?? r12 = new InterfaceC9461() { // from class: l.ܶ᩵ۡ
                        @Override // l.InterfaceC9461
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo1430(C23881 c23881) {
                            ViewOnClickListenerC3441.m10526(this.f47249, c23881);
                        }
                    };
                    final AbstractActivityC3346 abstractActivityC3346 = this.f10885;
                    final String str19 = strM19510;
                    final String str20 = strM1959;
                    C1005.m3499(new Thread(new Runnable() { // from class: l.᩶֨ۡ
                        {
                            int i67 = 1401031401;
                            int i68 = C0630.f2410;
                            int i69 = C1294.f4556;
                            int iM69821 = C2105.m6981("᩶ۙ") ^ i69;
                            int i70 = ((iM69821 ^ i68) * (-12337)) ^ 370939650;
                            int i71 = -2000782938;
                            while (true) {
                                i67 = ((((i67 ^ i68) * 28803) >> 31) & i70) ^ (iM69821 ^ i71);
                                switch (i67) {
                                    case -1834671786:
                                    case 158235223:
                                        C21923.m49329();
                                        if (C2958.m9034() > 0) {
                                            iM69821 = (C0630.m2566("ᩴۤ") + i69) * (-29);
                                            i70 = ((iM69821 ^ i68) * (-18009)) ^ 923805427;
                                            i71 = -769735346;
                                        } else {
                                            iM69821 = (i68 - C2105.m6981("ۡܶ")) * (-7);
                                            i70 = ((iM69821 ^ i69) * 17871) ^ (-144833532);
                                            i71 = 1999580776;
                                        }
                                        break;
                                    case -1694856749:
                                    case 7982469:
                                        if (C2958.f9394 >= 0) {
                                            iM69821 = (C0630.m2566("ᩴۤ") + i69) * (-29);
                                            i70 = ((iM69821 ^ i68) * (-18009)) ^ 923805427;
                                            i71 = -769735346;
                                        } else {
                                            iM69821 = (i68 - C0630.m2566("ᩳ֨")) * (-49);
                                            i70 = ((iM69821 ^ i69) * (-13207)) ^ 1461188902;
                                            i71 = -818261095;
                                        }
                                        break;
                                    case -1598339065:
                                    case 381057355:
                                        if (C3019.f9544 >= 0) {
                                            iM69821 = C2105.m6981("ۛ᩵") ^ i68;
                                            i70 = ((iM69821 ^ i69) * (-12601)) ^ 1970299744;
                                            i71 = 1407089643;
                                        } else {
                                            iM69821 = (C2105.m6981("ۜ᩸") + i69) * 59;
                                            i70 = ((iM69821 ^ i68) * (-21167)) ^ 397802461;
                                            i71 = -842817906;
                                        }
                                        break;
                                    case -1156219042:
                                    case 1217006637:
                                        return;
                                    case -890808037:
                                    case -234859999:
                                        C1773.m5908();
                                        C4117.m12364();
                                        throw new RuntimeException();
                                    case -698586829:
                                    case -434930450:
                                        if (C21923.f70183 != 0) {
                                            iM69821 = (C2105.m6981("ᩳܺ") ^ i68) * (-7);
                                            i70 = ((iM69821 ^ i69) * (-10189)) ^ 929343971;
                                            i71 = 2137998929;
                                        } else {
                                            iM69821 = C0630.m2566("᩻ܿ") ^ i68;
                                            i70 = ((iM69821 ^ i69) * 1387) ^ (-1378700816);
                                            i71 = -509170628;
                                        }
                                        break;
                                    case -603210389:
                                    case -359955393:
                                        if (C1773.f6144 <= 0) {
                                            iM69821 = (C2105.m6981("᩺ۨ") ^ i69) * (-103);
                                            i70 = ((iM69821 ^ i68) * 31663) ^ (-1080111295);
                                            i71 = 1621021264;
                                        } else {
                                            iM69821 = (C0630.m2566("᩺ۚ") ^ i69) * (-93);
                                            i70 = ((iM69821 ^ i68) * 8879) ^ 1555576715;
                                            i71 = 1304570818;
                                        }
                                        break;
                                    case -451253058:
                                    case 666236078:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM69821 = C2105.m6981("ۛ᩵") ^ i68;
                                            i70 = ((iM69821 ^ i69) * (-12601)) ^ 1970299744;
                                            i71 = 1407089643;
                                        } else {
                                            iM69821 = C0630.m2566("ۗۖ") ^ i68;
                                            i70 = ((iM69821 ^ i69) * (-16725)) ^ (-1496569166);
                                            i71 = -1338265178;
                                        }
                                        break;
                                    case -399437215:
                                    case 1774568837:
                                        if (C1773.f6144 <= 0) {
                                            iM69821 = (C0630.m2566("ᩴۤ") + i69) * (-29);
                                            i70 = ((iM69821 ^ i68) * (-18009)) ^ 923805427;
                                            i71 = -769735346;
                                        } else {
                                            iM69821 = C2105.m6981("ܿۗ") ^ i69;
                                            i70 = ((iM69821 ^ i68) * 31019) ^ (-1558681637);
                                            i71 = -42774199;
                                        }
                                        break;
                                    case -221979347:
                                    case 2131866425:
                                        C0237.m1481();
                                        C3019.m9255();
                                        iM69821 = (i68 - C2105.m6981("ۡܶ")) * (-7);
                                        i70 = ((iM69821 ^ i69) * 17871) ^ (-144833532);
                                        i71 = 1999580776;
                                        break;
                                    case -105157953:
                                    case 289487405:
                                        AbstractC2021.m6574();
                                        if (C3746.f11829 > 0) {
                                            iM69821 = (C2105.m6981("᩺ۨ") ^ i69) * (-103);
                                            i70 = ((iM69821 ^ i68) * 31663) ^ (-1080111295);
                                            i71 = 1621021264;
                                        } else {
                                            iM69821 = (i68 - C2105.m6981("ۡܶ")) * (-7);
                                            i70 = ((iM69821 ^ i69) * 17871) ^ (-144833532);
                                            i71 = 1999580776;
                                        }
                                        break;
                                    case -92637432:
                                    case 195491165:
                                        if (C0237.m1481() < 0) {
                                            iM69821 = C2105.m6981("ۛ᩵") ^ i68;
                                            i70 = ((iM69821 ^ i69) * (-12601)) ^ 1970299744;
                                            i71 = 1407089643;
                                        } else {
                                            iM69821 = (i68 - C2105.m6981("ۡܶ")) * (-7);
                                            i70 = ((iM69821 ^ i69) * 17871) ^ (-144833532);
                                            i71 = 1999580776;
                                        }
                                        break;
                                    case 556985379:
                                    case 901271564:
                                        if (RunnableC1937.f6483 >= 0) {
                                            iM69821 = (C0630.m2566("ᩴۤ") + i69) * (-29);
                                            i70 = ((iM69821 ^ i68) * (-18009)) ^ 923805427;
                                            i71 = -769735346;
                                        } else {
                                            iM69821 = C0630.m2566("֡᩻") ^ i68;
                                            i70 = ((iM69821 ^ i69) * 29795) ^ 508921897;
                                            i71 = 1275485943;
                                        }
                                        break;
                                    case 621788995:
                                    case 1469023169:
                                        if (C3019.f9544 >= 0) {
                                            iM69821 = (C2105.m6981("ᩳܺ") ^ i68) * (-7);
                                            i70 = ((iM69821 ^ i69) * (-10189)) ^ 929343971;
                                            i71 = 2137998929;
                                        } else {
                                            iM69821 = C0630.m2566("ܺᩴ") ^ i68;
                                            i70 = ((iM69821 ^ i69) * (-12535)) ^ (-843939029);
                                            i71 = -1300166819;
                                        }
                                        break;
                                    case 1383792666:
                                    case 1723645254:
                                        if (C4263.f13799 <= 0) {
                                            iM69821 = C2105.m6981("ۛ᩵") ^ i68;
                                            i70 = ((iM69821 ^ i69) * (-12601)) ^ 1970299744;
                                            i71 = 1407089643;
                                        } else {
                                            iM69821 = C0630.m2566("֡ۛ") ^ i69;
                                            i70 = ((iM69821 ^ i68) * (-20343)) ^ (-1565555392);
                                            i71 = -1908740270;
                                        }
                                        break;
                                    default:
                                        if (C3683.m11222()) {
                                            iM69821 = C2105.m6981("ۛ᩵") ^ i68;
                                            i70 = ((iM69821 ^ i69) * (-12601)) ^ 1970299744;
                                            i71 = 1407089643;
                                        } else {
                                            iM69821 = (C2105.m6981("ܳܰ") ^ i69) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i70 = ((iM69821 ^ i68) * (-13807)) ^ (-228385039);
                                            i71 = 851872281;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Activity activity = null;
                            C15434 c15434 = null;
                            String str21 = null;
                            int i67 = -757021290;
                            int i68 = C0422.f1886;
                            int i69 = C1294.f4556;
                            int iM25625 = C0630.m2566("۠ۖ") ^ i69;
                            int i70 = ((iM25625 ^ i68) * (-517)) ^ 1912857386;
                            int i71 = -837856018;
                            while (true) {
                                i67 = ((((i67 ^ i68) * (-13599)) >> 31) & i70) ^ (iM25625 ^ i71);
                                switch (i67) {
                                    case -2058476151:
                                    case -332666722:
                                        str21 = str19;
                                        if (C3245.m9925() != 0) {
                                            iM25625 = C2105.m6981("ۧۤ") ^ i69;
                                            i70 = ((iM25625 ^ i68) * 2143) ^ 1819156939;
                                            i71 = -485661880;
                                        } else {
                                            iM25625 = (i68 - C2105.m6981("ۜۚ")) * 53;
                                            i70 = ((iM25625 ^ i69) * 529) ^ 679570109;
                                            i71 = 583243991;
                                        }
                                        break;
                                    case -1826123916:
                                    case 428921089:
                                        if (C1711.f5919) {
                                            iM25625 = (i69 - C0630.m2566("ۙ᩺")) * (-69);
                                            i70 = ((iM25625 ^ i68) * 7757) ^ (-53429880);
                                            i71 = 1766306439;
                                        } else {
                                            iM25625 = (C0630.m2566("ۛᩳ") + i68) * 13;
                                            i70 = ((iM25625 ^ i69) * 11083) ^ (-769754639);
                                            i71 = 608360295;
                                        }
                                        break;
                                    case -1558020630:
                                    case 960023393:
                                        C3537.m10746();
                                        iM25625 = (i69 - C0630.m2566("ۙ᩺")) * (-69);
                                        i70 = ((iM25625 ^ i68) * 7757) ^ (-53429880);
                                        i71 = 1766306439;
                                        break;
                                    case -1321826387:
                                    case 1627863347:
                                        activity = abstractActivityC3346;
                                        if (AbstractC2021.f6743 <= 0) {
                                            iM25625 = (C0630.m2566("ۚܿ") ^ i68) * (-47);
                                            i70 = ((iM25625 ^ i69) * (-27295)) ^ 1856114404;
                                            i71 = -811826162;
                                        } else {
                                            iM25625 = (C2105.m6981("ۧܽ") + i69) * 127;
                                            i70 = ((iM25625 ^ i68) * (-26335)) ^ (-1885541718);
                                            i71 = -1510539793;
                                        }
                                        break;
                                    case -1302396243:
                                    case -471402709:
                                        if (C7106.f21815 != 0) {
                                            iM25625 = (C0630.m2566("ܽۤ") ^ i68) * 21;
                                            i70 = ((iM25625 ^ i69) * 27005) ^ (-928752599);
                                            i71 = 697990348;
                                        } else {
                                            iM25625 = (C2105.m6981("᩷۬") + i69) * 39;
                                            i70 = ((iM25625 ^ i68) * (-14145)) ^ (-1590754998);
                                            i71 = 972441076;
                                        }
                                        break;
                                    case -1205919334:
                                    case 583927154:
                                        C0798.m2998();
                                        if (C1916.m6308() >= 0) {
                                            iM25625 = (C0630.m2566("ۚܿ") ^ i68) * (-47);
                                            i70 = ((iM25625 ^ i69) * (-27295)) ^ 1856114404;
                                            i71 = -811826162;
                                        } else {
                                            iM25625 = (i69 - C0630.m2566("ۙ᩺")) * (-69);
                                            i70 = ((iM25625 ^ i68) * 7757) ^ (-53429880);
                                            i71 = 1766306439;
                                        }
                                        break;
                                    case -1147079959:
                                    case 1769226498:
                                        AbstractC2021.m6574();
                                        C1916.m6308();
                                        break;
                                    case -833231933:
                                    case 1469242733:
                                        if (C2126.f7087) {
                                            iM25625 = (i69 - C0630.m2566("ۙ᩺")) * (-69);
                                            i70 = ((iM25625 ^ i68) * 7757) ^ (-53429880);
                                            i71 = 1766306439;
                                        } else {
                                            iM25625 = C2105.m6981("ܰ֨") ^ i68;
                                            i70 = ((iM25625 ^ i69) * (-6001)) ^ 1066338632;
                                            i71 = -83013550;
                                        }
                                        break;
                                    case -523265321:
                                    case 775974682:
                                        C1128.m3851();
                                        if (C3746.f11829 <= 0) {
                                            iM25625 = (C0630.m2566("ܽۤ") ^ i68) * 21;
                                            i70 = ((iM25625 ^ i69) * 27005) ^ (-928752599);
                                            i71 = 697990348;
                                        } else {
                                            iM25625 = (i69 - C0630.m2566("ۙ᩺")) * (-69);
                                            i70 = ((iM25625 ^ i68) * 7757) ^ (-53429880);
                                            i71 = 1766306439;
                                        }
                                        break;
                                    case -473105667:
                                    case 903018872:
                                        c15434 = r12;
                                        if (C0483.f2088 >= 0) {
                                            iM25625 = (i69 - C0630.m2566("ۙ᩺")) * (-69);
                                            i70 = ((iM25625 ^ i68) * 7757) ^ (-53429880);
                                            i71 = 1766306439;
                                        } else {
                                            iM25625 = C0630.m2566("ۜۧ") ^ i69;
                                            i70 = ((iM25625 ^ i68) * (-27619)) ^ (-1804234454);
                                            i71 = 1126401342;
                                        }
                                        break;
                                    case 1246596:
                                    case 1882644720:
                                        if (C2126.f7087) {
                                            iM25625 = (i69 - C0630.m2566("ۙ᩺")) * (-69);
                                            i70 = ((iM25625 ^ i68) * 7757) ^ (-53429880);
                                            i71 = 1766306439;
                                        } else {
                                            iM25625 = (C2105.m6981("ۧۡ") + i68) * (-97);
                                            i70 = ((iM25625 ^ i69) * 11829) ^ (-1396220255);
                                            i71 = -993474602;
                                        }
                                        break;
                                    case 1246702035:
                                    case 1376645876:
                                        if (C4616.f14690 <= 0) {
                                            iM25625 = C2105.m6981("ۧۤ") ^ i69;
                                            i70 = ((iM25625 ^ i68) * 2143) ^ 1819156939;
                                            i71 = -485661880;
                                        } else {
                                            iM25625 = C0630.m2566("ܺᩴ") ^ i68;
                                            i70 = ((iM25625 ^ i69) * (-9423)) ^ 1403419505;
                                            i71 = 1476289676;
                                        }
                                        break;
                                    case 1275398590:
                                    case 1995924188:
                                        C2958.m9034();
                                        if (C11340.m28031()) {
                                            iM25625 = (C0630.m2566("ۜۡ") ^ i69) * 5;
                                            i70 = ((iM25625 ^ i68) * 22979) ^ (-1479841864);
                                            i71 = 1164594044;
                                        } else {
                                            iM25625 = (C0630.m2566("ܽۤ") ^ i68) * 21;
                                            i70 = ((iM25625 ^ i69) * 27005) ^ (-928752599);
                                            i71 = 697990348;
                                        }
                                        break;
                                    case 1326833143:
                                    case 2106390742:
                                        if (C4075.f12947 >= 0) {
                                            iM25625 = (C0630.m2566("ܽۤ") ^ i68) * 21;
                                            i70 = ((iM25625 ^ i69) * 27005) ^ (-928752599);
                                            i71 = 697990348;
                                        } else {
                                            iM25625 = C2105.m6981("ᩴۧ") ^ i69;
                                            i70 = ((iM25625 ^ i68) * (-15533)) ^ (-1784966923);
                                            i71 = 1633578779;
                                        }
                                        break;
                                    case 1740398274:
                                    case 2104713129:
                                        if (C2272.f7362) {
                                            iM25625 = C2105.m6981("ۧۤ") ^ i69;
                                            i70 = ((iM25625 ^ i68) * 2143) ^ 1819156939;
                                            i71 = -485661880;
                                        } else {
                                            iM25625 = (C0630.m2566("۫֡") ^ i69) * (-69);
                                            i70 = ((iM25625 ^ i68) * (-2343)) ^ (-1968809509);
                                            i71 = 829925234;
                                        }
                                        break;
                                    default:
                                        C2405.m7800(str21, bArr5, str20, activity, c15434);
                                        break;
                                }
                                return;
                            }
                        }
                    }));
                    break;
                case 782501181:
                case 1571726614:
                    i51 = 31316;
                    int iM256111 = C0630.m2566("ᩴ᩻") ^ i47;
                    iM3006 = iM3006;
                    i49 = ((iM256111 ^ i48) * 13193) ^ (-139321472);
                    i50 = iM256111 ^ 1818274093;
                    this = this;
                    strM10488 = strM10488;
                    str12 = str12;
                    z5 = z5 ? 1 : 0;
                    sArr4 = sArr4;
                    i55 = i55;
                    c19258M5912 = c19258M5912;
                    i42 = i42;
                    bArr5 = bArr5;
                    j4 = j4;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    fArr4 = fArr4;
                    i54 = i54;
                    i53 = i53;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    sArr5 = sArr5;
                    i52 = i52;
                    i43 = i43;
                    objectAnimator6 = objectAnimator6;
                    break;
                case 861095685:
                case 1461774874:
                    sArr5 = sArr5;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    objectAnimator6 = objectAnimator6;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    i53 = i53;
                    i54 = i54;
                    fArr4 = fArr4;
                    j4 = j4;
                    c19258M5912 = c19258M5912;
                    i43 = i43;
                    bArr5 = bArr5;
                    z = z5 ? 1 : 0;
                    i52 = i52;
                    objectAnimator5 = objectAnimator5;
                    str = strM10488;
                    i42 = i42;
                    str2 = str12;
                    i5 = iM3006;
                    if (i5 == (C0630.m2566(C4263.m12817(f10875, 124, 3, i51)) ^ 2128375467)) {
                        iM2567 = (C0630.m2566("֫᩻") + i48) * (-37);
                        i4 = ((iM2567 ^ i47) * 3651) ^ 344408540;
                        i6 = 108608467;
                    } else {
                        iM2567 = C0630.m2566("֫ۖ") ^ i48;
                        i4 = ((iM2567 ^ i47) * 24819) ^ 1533264498;
                        i6 = -1377776861;
                    }
                    i50 = iM2567 ^ i6;
                    this = this;
                    iM3006 = i5;
                    strM10488 = str;
                    str12 = str2;
                    z5 = z;
                    i49 = i4;
                    c19258M5912 = c19258M5912;
                    i42 = i42;
                    bArr5 = bArr5;
                    j4 = j4;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    fArr4 = fArr4;
                    i54 = i54;
                    i53 = i53;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    sArr5 = sArr5;
                    i52 = i52;
                    i43 = i43;
                    objectAnimator6 = objectAnimator6;
                    break;
                case 1283445232:
                case 2049322164:
                    sArr5 = sArr5;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    ObjectAnimator objectAnimator10 = objectAnimator5;
                    i53 = i53;
                    objectAnimator10.setInterpolator(accelerateInterpolator4);
                    c19258M5912 = c19258M5912;
                    i42 = i42;
                    ObjectAnimator objectAnimator11 = objectAnimator6;
                    objectAnimator11.setInterpolator(new DecelerateInterpolator());
                    objectAnimator10.addListener(new C4852(this, objectAnimator11));
                    C22628.m50603(objectAnimator10);
                    objectAnimator6 = objectAnimator11;
                    i43 = i43;
                    bArr5 = bArr5;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    z = z5 ? 1 : 0;
                    i52 = i52;
                    i54 = i54;
                    fArr4 = fArr4;
                    str = strM10488;
                    j4 = j4;
                    str2 = str12;
                    objectAnimator5 = objectAnimator10;
                    i5 = iM3006;
                    iM2567 = C0630.m2566("֫ۖ") ^ i48;
                    i4 = ((iM2567 ^ i47) * 24819) ^ 1533264498;
                    i6 = -1377776861;
                    i50 = iM2567 ^ i6;
                    this = this;
                    iM3006 = i5;
                    strM10488 = str;
                    str12 = str2;
                    z5 = z;
                    i49 = i4;
                    c19258M5912 = c19258M5912;
                    i42 = i42;
                    bArr5 = bArr5;
                    j4 = j4;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    fArr4 = fArr4;
                    i54 = i54;
                    i53 = i53;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    sArr5 = sArr5;
                    i52 = i52;
                    i43 = i43;
                    objectAnimator6 = objectAnimator6;
                    break;
                case 1673594085:
                case 2135576619:
                    short[] sArr6 = sArr5;
                    int i67 = iM6988;
                    String str21 = strM947;
                    int i68 = iM3006;
                    ObjectAnimator objectAnimator12 = objectAnimator6;
                    AccelerateInterpolator accelerateInterpolator7 = accelerateInterpolator4;
                    ObjectAnimator objectAnimator13 = objectAnimator5;
                    int i69 = i53;
                    int i70 = i54;
                    float[] fArr9 = fArr4;
                    long j8 = j4;
                    C19258 c192514 = c19258M5912;
                    int i71 = i42;
                    int i72 = i43;
                    byte[] bArr8 = bArr5;
                    String str22 = strM10488;
                    String str23 = str12;
                    short[] sArr7 = sArr4;
                    int i73 = i55;
                    c = 1;
                    z5 = false;
                    if (i68 == (C0630.m2566(C0714.m2816(sArr7, i73, 3, i51)) ^ 2101190415)) {
                        iM2569 = C2105.m6981("᩵֡") ^ i47;
                        i21 = ((iM2569 ^ i48) * (-10745)) ^ 603644452;
                        i22 = -1379901662;
                    } else {
                        iM2569 = (C0630.m2566("֡ܽ") + i48) * 51;
                        i21 = ((iM2569 ^ i47) * (-28111)) ^ 54449549;
                        i22 = -307021824;
                    }
                    i50 = iM2569 ^ i22;
                    this = this;
                    iM3006 = i68;
                    strM10488 = str22;
                    str12 = str23;
                    i49 = i21;
                    sArr4 = sArr7;
                    i55 = i73;
                    i43 = i72;
                    c19258M5912 = c192514;
                    i42 = i71;
                    bArr5 = bArr8;
                    j4 = j8;
                    iM6988 = i67;
                    objectAnimator6 = objectAnimator12;
                    strM947 = str21;
                    fArr4 = fArr9;
                    i54 = i70;
                    i53 = i69;
                    accelerateInterpolator4 = accelerateInterpolator7;
                    objectAnimator5 = objectAnimator13;
                    sArr5 = sArr6;
                    i52 = 2;
                    break;
                default:
                    sArr5 = sArr5;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    objectAnimator6 = objectAnimator6;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    i53 = i53;
                    i54 = i54;
                    fArr4 = fArr4;
                    j4 = j4;
                    c19258M5912 = c19258M5912;
                    i43 = i43;
                    bArr5 = bArr5;
                    z = z5 ? 1 : 0;
                    i52 = i52;
                    objectAnimator5 = objectAnimator5;
                    str = strM10488;
                    i42 = i42;
                    str2 = str12;
                    TextInputLayout[] textInputLayoutArr2 = new TextInputLayout[i52];
                    textInputLayoutArr2[z ? 1 : 0] = textInputLayout3;
                    textInputLayoutArr2[c] = textInputLayout2;
                    if (!C0287.m1632(textInputLayoutArr2)) {
                        iM2568 = (C2105.m6981("᩸ۛ") + i47) * (-79);
                        i4 = ((iM2568 ^ i48) * (-21089)) ^ 1834847131;
                        i13 = 181034994;
                        i50 = iM2568 ^ i13;
                        strM10488 = str;
                        str12 = str2;
                        z5 = z;
                        i49 = i4;
                        c19258M5912 = c19258M5912;
                        i42 = i42;
                        bArr5 = bArr5;
                        j4 = j4;
                        iM6988 = iM6988;
                        strM947 = strM947;
                        fArr4 = fArr4;
                        i54 = i54;
                        i53 = i53;
                        accelerateInterpolator4 = accelerateInterpolator4;
                        objectAnimator5 = objectAnimator5;
                        sArr5 = sArr5;
                        i52 = i52;
                        i43 = i43;
                        objectAnimator6 = objectAnimator6;
                    }
                    i5 = iM3006;
                    iM2567 = C0630.m2566("֫ۖ") ^ i48;
                    i4 = ((iM2567 ^ i47) * 24819) ^ 1533264498;
                    i6 = -1377776861;
                    i50 = iM2567 ^ i6;
                    this = this;
                    iM3006 = i5;
                    strM10488 = str;
                    str12 = str2;
                    z5 = z;
                    i49 = i4;
                    c19258M5912 = c19258M5912;
                    i42 = i42;
                    bArr5 = bArr5;
                    j4 = j4;
                    iM6988 = iM6988;
                    strM947 = strM947;
                    fArr4 = fArr4;
                    i54 = i54;
                    i53 = i53;
                    accelerateInterpolator4 = accelerateInterpolator4;
                    objectAnimator5 = objectAnimator5;
                    sArr5 = sArr5;
                    i52 = i52;
                    i43 = i43;
                    objectAnimator6 = objectAnimator6;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m10528(ViewOnClickListenerC3441 viewOnClickListenerC3441) {
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        int i = -1973822769;
        int i2 = C0714.f2697;
        int i3 = AbstractC2021.f6743;
        int iM2566 = C0630.m2566("ܺۖ") ^ i3;
        int i4 = ((iM2566 ^ i2) * 25277) ^ (-332763002);
        int i5 = -1641022125;
        while (true) {
            i = ((((i ^ i2) * 24041) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2102481965:
                case -946448427:
                    C1504.m5172(dialogInterfaceC0206);
                    if (C0382.f1805) {
                        iM2566 = C0630.m2566("᩸֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * 19085) ^ (-306243308);
                        i5 = 1572965824;
                    } else {
                        iM2566 = (C0630.m2566("᩷ܿ") ^ i3) * (-55);
                        i4 = ((iM2566 ^ i2) * (-13921)) ^ 1870745610;
                        i5 = 1809831676;
                    }
                    break;
                case -1941258165:
                case 2091759115:
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = (C0630.m2566("ܽ۠") + i3) * 85;
                        i4 = ((iM2566 ^ i2) * 18067) ^ 2008945439;
                        i5 = 1920076144;
                    } else {
                        iM2566 = C0630.m2566("᩶ۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-30541)) ^ (-1351042282);
                        i5 = 1061312113;
                    }
                    break;
                case -1719088550:
                case -379488778:
                    if (C1916.f6442) {
                        iM2566 = (C0630.m2566("᩺֫") ^ i3) * (-87);
                        i4 = ((iM2566 ^ i2) * 21875) ^ (-1061695995);
                        i5 = 1014068902;
                    } else {
                        iM2566 = (C0630.m2566("֡۬") ^ i2) * (-13);
                        i4 = ((iM2566 ^ i3) * (-6737)) ^ 1361735491;
                        i5 = -2140298488;
                    }
                    break;
                case -1411971512:
                case -807360621:
                    if (C1294.f4556 >= 0) {
                        iM2566 = C2105.m6981("ܽ᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-9645)) ^ (-1415870682);
                        i5 = -399201600;
                    } else {
                        iM2566 = (C2105.m6981("֡᩻") ^ i3) * 29;
                        i4 = ((iM2566 ^ i2) * 8907) ^ (-1199493441);
                        i5 = -1166277260;
                    }
                    break;
                case -1264818482:
                case 432237384:
                    C3432.m10477();
                    iM2566 = C0630.m2566("ۖᩳ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-25795)) ^ (-1264774059);
                    i5 = -335098466;
                    break;
                case -1096884322:
                case 1457158145:
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C0630.m2566("ܽ۠") + i3) * 85;
                        i4 = ((iM2566 ^ i2) * 18067) ^ 2008945439;
                        i5 = 1920076144;
                    } else {
                        iM2566 = C0630.m2566("ۖᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-25795)) ^ (-1264774059);
                        i5 = -335098466;
                    }
                    break;
                case -930769908:
                case -752173264:
                    dialogInterfaceC0206 = viewOnClickListenerC3441.f10882;
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("᩷ܿ") ^ i3) * (-55);
                        i4 = ((iM2566 ^ i2) * (-13921)) ^ 1870745610;
                        i5 = 1809831676;
                    } else {
                        iM2566 = C2105.m6981("ܰ᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 4963) ^ (-2080719277);
                        i5 = 1102005448;
                    }
                    break;
                case -892441392:
                case 1642267613:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C0630.m2566("᩷ܿ") ^ i3) * (-55);
                        i4 = ((iM2566 ^ i2) * (-13921)) ^ 1870745610;
                        i5 = 1809831676;
                    } else {
                        iM2566 = (C0630.m2566("ܳܶ") + i2) * (-31);
                        i4 = ((iM2566 ^ i3) * 32283) ^ 610304294;
                        i5 = -1405483603;
                    }
                    break;
                case -790341562:
                case 1798708673:
                    if (C3432.m10477() <= 0) {
                        iM2566 = (C0630.m2566("᩷ܿ") ^ i3) * (-55);
                        i4 = ((iM2566 ^ i2) * (-13921)) ^ 1870745610;
                        i5 = 1809831676;
                    } else {
                        iM2566 = C2105.m6981("ۖ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21823) ^ (-230421160);
                        i5 = 398920149;
                    }
                    break;
                case -745689612:
                case 468392235:
                    viewOnClickListenerC3441.f10877.m44041();
                    break;
                case -685277594:
                case 1167701002:
                    if (!RunnableC3474.m10630()) {
                        iM2566 = C2105.m6981("ܽ᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-9645)) ^ (-1415870682);
                        i5 = -399201600;
                    } else {
                        iM2566 = C0630.m2566("ۖᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-25795)) ^ (-1264774059);
                        i5 = -335098466;
                    }
                    break;
                case -486978601:
                case 173382719:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C0630.m2566("֡۬") ^ i2) * (-13);
                        i4 = ((iM2566 ^ i3) * (-6737)) ^ 1361735491;
                        i5 = -2140298488;
                    } else {
                        iM2566 = C0630.m2566("ۖᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-25795)) ^ (-1264774059);
                        i5 = -335098466;
                    }
                    break;
                case -233921540:
                case 1648966110:
                    C0798.m2998();
                    break;
                case 1050848090:
                case 1752560941:
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("ۖᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-25795)) ^ (-1264774059);
                        i5 = -335098466;
                    } else {
                        iM2566 = C0630.m2566("ܿᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-9899)) ^ (-525209241);
                        i5 = -220047613;
                    }
                    break;
                case 1106728114:
                case 1777066704:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C0630.m2566("ܽ۠") + i3) * 85;
                        i4 = ((iM2566 ^ i2) * 18067) ^ 2008945439;
                        i5 = 1920076144;
                    } else {
                        iM2566 = (C2105.m6981("ۨۢ") ^ i3) * (-99);
                        i4 = ((iM2566 ^ i2) * 13151) ^ 1147459806;
                        i5 = -24177690;
                    }
                    break;
                default:
                    if (AbstractC2021.m6574()) {
                        iM2566 = C0630.m2566("ۖᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-25795)) ^ (-1264774059);
                        i5 = -335098466;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۖ᩹")) * 51;
                        i4 = ((iM2566 ^ i2) * 23259) ^ (-1845132574);
                        i5 = -1996130896;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10520(ViewOnClickListenerC3441 viewOnClickListenerC3441, C23881 c23881) {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int iM2567;
        int i4;
        int iM6982;
        int i5;
        int i6;
        viewOnClickListenerC3441 = viewOnClickListenerC3441;
        C23881 c23882 = c23881;
        int i7 = C3537.f11231;
        int i8 = C0050.f910;
        int iM6983 = (C2105.m6981("᩸֡") + i8) * (-55);
        int i9 = ((iM6983 ^ i7) * 24343) ^ 2122706189;
        C19111 c19111 = null;
        String strM20837 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM6983 ^ (-1778471679);
        int i11 = 0;
        int iM50604 = 0;
        int iM2568 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i15 = -14423795;
        int i16 = 0;
        String strM12252 = null;
        TextInputLayout textInputLayout = null;
        TextInputLayout textInputLayout2 = null;
        short[] sArr4 = null;
        String strM6573 = null;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i7) * (-21845)) >> 31));
            switch (i15) {
                case -1958753693:
                case 824772850:
                    AbstractC2021.m6571(textInputLayout, C0630.m2566(strM20837) ^ 2127665830);
                    break;
                case -1569640270:
                case -497917994:
                    strM12252 = C4075.m12252(sArr3, i11, 3, i14);
                    if (C3911.f12484 < 0) {
                        iM2566 = (i8 - C2105.m6981("᩵᩵")) * 75;
                        i = ((iM2566 ^ i7) * 757) ^ 2100352960;
                        i2 = 475102394;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        i16 = i16;
                        iM6982 = (C2105.m6981("ۖۢ") ^ i8) * (-85);
                        i5 = ((iM6982 ^ i7) * 13655) ^ 1181342765;
                        i6 = -1254562826;
                        i10 = iM6982 ^ i6;
                        i9 = i5;
                        i16 = i16;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                    }
                    break;
                case -1532057614:
                case -404582127:
                    C0798.m2998();
                    break;
                case -1471918000:
                case -868796395:
                    C19111 c19112 = c19111;
                    short[] sArr5 = sArr2;
                    i16 = 74;
                    if (C4616.m13552() != 0) {
                        sArr2 = sArr5;
                        c19111 = c19112;
                        i13 = 3;
                        int iM2569 = (C0630.m2566("ۚܰ") + i8) * (-121);
                        i9 = (-910533046) ^ ((iM2569 ^ i7) * (-21561));
                        i10 = iM2569 ^ (-809890616);
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        c23882 = c23881;
                    } else {
                        int iM6984 = C2105.m6981("ۖ᩸") ^ i8;
                        int i17 = ((iM6984 ^ i7) * (-8223)) ^ 1103066088;
                        i10 = iM6984 ^ (-1252800133);
                        sArr2 = sArr5;
                        c19111 = c19112;
                        i9 = i17;
                        i13 = 3;
                    }
                    break;
                case -1448249665:
                case -865859204:
                    iM2568 = C0630.m2566(C4263.m12817(f10875, 83, 3, i14));
                    if (C0630.f2410 > 0) {
                        iM2566 = (C0630.m2566("۠۫") + i7) * (-47);
                        i = ((iM2566 ^ i8) * 289) ^ 245347969;
                        i2 = 720197376;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        int iM25610 = (C0630.m2566("ۚܰ") + i8) * (-121);
                        i9 = (-910533046) ^ ((iM25610 ^ i7) * (-21561));
                        i10 = iM25610 ^ (-809890616);
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        c23882 = c23881;
                    }
                    break;
                case -1446239269:
                case 258225655:
                    C4616.m13552();
                    C0630.m2564();
                    iM2566 = (C0630.m2566("ۗ۟") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM2566 ^ i7) * (-1957)) ^ 950335350;
                    i2 = 1092898196;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1415772847:
                case 1936662831:
                    i16 = i16;
                    int i18 = s + s2;
                    if ((79120 * s) - (i18 * i18) > 0) {
                        iM6981 = (i8 - C2105.m6981("᩸۫")) * 45;
                        i9 = (-192015353) ^ ((iM6981 ^ i7) * (-20607));
                        i3 = 67214377;
                    } else {
                        iM6981 = C2105.m6981("᩹ۨ") ^ i7;
                        i9 = 1516268910 ^ ((iM6981 ^ i8) * (-2107));
                        i3 = -166529855;
                    }
                    i10 = iM6981 ^ i3;
                    c23882 = c23881;
                    i16 = i16;
                    break;
                case -1195510374:
                case -211539734:
                    if (iM50604 != 1100) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i8;
                        i = ((iM2566 ^ i7) * (-5321)) ^ 930400399;
                        i2 = 1426627553;
                    } else {
                        iM2566 = C2105.m6981("ۨ֫") ^ i8;
                        i = ((iM2566 ^ i7) * (-15199)) ^ (-403439101);
                        i2 = -1646620793;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1143483217:
                case 806862025:
                    i16 = i16;
                    strM6573 = AbstractC2021.m6573(f10875, 66, 8, i14);
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("ܳ᩸") ^ i7;
                        i9 = (-1107777136) ^ ((iM6981 ^ i8) * 30515);
                        i3 = 126811271;
                    } else {
                        iM6981 = (i8 - C2105.m6981("᩹ۤ")) * 67;
                        i9 = (-488607705) ^ ((iM6981 ^ i7) * 25921);
                        i3 = 1123023231;
                    }
                    i10 = iM6981 ^ i3;
                    c23882 = c23881;
                    i16 = i16;
                    break;
                case -1070303122:
                case 281865027:
                    i16 = i16;
                    C3663.m11167(viewOnClickListenerC3441.f10882);
                    C19111 c19113 = viewOnClickListenerC3441.f10877;
                    sArr2 = f10875;
                    if (C0422.f1886 > 0) {
                        iM2567 = C0630.m2566("᩹ᩳ") ^ i7;
                        c19111 = c19113;
                        i9 = ((iM2567 ^ i8) * (-28581)) ^ 881445852;
                        i4 = 2046694144;
                        i10 = iM2567 ^ i4;
                        i16 = i16;
                    } else {
                        c19111 = c19113;
                        iM6982 = (C2105.m6981("ۖۢ") ^ i8) * (-85);
                        i5 = ((iM6982 ^ i7) * 13655) ^ 1181342765;
                        i6 = -1254562826;
                        i10 = iM6982 ^ i6;
                        i9 = i5;
                        i16 = i16;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                    }
                    break;
                case -864421861:
                case 167086634:
                    C2958.m9034();
                    if (C5695.f17556 >= 0) {
                        i16 = i16;
                        iM6981 = C0630.m2566("ܳ᩸") ^ i7;
                        i9 = (-1107777136) ^ ((iM6981 ^ i8) * 30515);
                        i3 = 126811271;
                        i10 = iM6981 ^ i3;
                        c23882 = c23881;
                        i16 = i16;
                    } else {
                        iM2566 = (C0630.m2566("ۗ۟") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i7) * (-1957)) ^ 950335350;
                        i2 = 1092898196;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    break;
                case -701036184:
                case 120140884:
                    if (C3683.f11629 >= 0) {
                        i16 = i16;
                        iM6982 = (C2105.m6981("ۖۢ") ^ i8) * (-85);
                        i5 = ((iM6982 ^ i7) * 13655) ^ 1181342765;
                        i6 = -1254562826;
                        i10 = iM6982 ^ i6;
                        i9 = i5;
                        i16 = i16;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                    } else {
                        iM2566 = (C0630.m2566("ۗ۟") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i7) * (-1957)) ^ 950335350;
                        i2 = 1092898196;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    break;
                case -575377620:
                case 665371396:
                    i14 = 50489;
                    iM6981 = (i7 - C0630.m2566("ܰ᩺")) * 79;
                    i9 = (-1535639337) ^ ((iM6981 ^ i8) * (-19085));
                    i3 = -2015731255;
                    i10 = iM6981 ^ i3;
                    c23882 = c23881;
                    i16 = i16;
                    break;
                case -547951018:
                case 579888219:
                    strM20837 = C7811.m20837(sArr4, i12, 3, i14);
                    if (C1128.f4106 > 0) {
                        iM2566 = C0630.m2566("᩻ۨ") ^ i7;
                        i = ((iM2566 ^ i8) * (-11501)) ^ 1692177333;
                        i2 = 1518730724;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        i16 = i16;
                        iM6981 = C0630.m2566("ܳ᩸") ^ i7;
                        i9 = (-1107777136) ^ ((iM6981 ^ i8) * 30515);
                        i3 = 126811271;
                        i10 = iM6981 ^ i3;
                        c23882 = c23881;
                        i16 = i16;
                    }
                    break;
                case -505808199:
                case 1240873554:
                    c19111.m44038(C0630.m2566(C3911.m11919(sArr2, i16, i13, i14)) ^ 2097334103);
                    break;
                case -369667572:
                case 523694243:
                    RunnableC3474.m10621(textInputLayout2, C2105.m6981(strM12252) ^ 2100077876);
                    break;
                case 28151625:
                case 1526501535:
                    textInputLayout2 = viewOnClickListenerC3441.f10880;
                    sArr3 = f10875;
                    i11 = 77;
                    if (C3663.m11168() < 0) {
                        iM2566 = (C2105.m6981("᩸ۤ") ^ i8) * (-33);
                        i = ((iM2566 ^ i7) * 1225) ^ (-1977524241);
                        i2 = -1933096145;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        int iM25611 = (C0630.m2566("ۚܰ") + i8) * (-121);
                        i9 = (-910533046) ^ ((iM25611 ^ i7) * (-21561));
                        i10 = iM25611 ^ (-809890616);
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        c23882 = c23881;
                    }
                    break;
                case 30168682:
                case 573283093:
                    i16 = i16;
                    sArr = f10875;
                    c = 'A';
                    if (C2105.f7037 == 0) {
                        iM6981 = (C2105.m6981("᩻ܺ") ^ i8) * (-63);
                        i9 = (-1456580642) ^ ((iM6981 ^ i7) * (-31801));
                        i3 = -1495384000;
                        i10 = iM6981 ^ i3;
                        c23882 = c23881;
                        i16 = i16;
                    } else {
                        i16 = i16;
                        int iM25612 = (C0630.m2566("ۚܰ") + i8) * (-121);
                        i9 = (-910533046) ^ ((iM25612 ^ i7) * (-21561));
                        i10 = iM25612 ^ (-809890616);
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        c23882 = c23881;
                    }
                    break;
                case 394633482:
                case 1412632421:
                    RunnableC0588.m2440(AbstractC2021.m6563(c23882, 2103419680 ^ iM2568));
                    break;
                case 421349134:
                case 1635731727:
                    textInputLayout = viewOnClickListenerC3441.f10887;
                    sArr4 = f10875;
                    i12 = 80;
                    if (C1294.f4556 < 0) {
                        iM2566 = C0630.m2566("ۢ᩸") ^ i7;
                        i = ((iM2566 ^ i8) * (-18009)) ^ (-1627777204);
                        i2 = -215382073;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        i16 = i16;
                        iM6981 = C0630.m2566("ܳ᩸") ^ i7;
                        i9 = (-1107777136) ^ ((iM6981 ^ i8) * 30515);
                        i3 = 126811271;
                        i10 = iM6981 ^ i3;
                        c23882 = c23881;
                        i16 = i16;
                    }
                    break;
                case 531496804:
                case 1819619025:
                    i14 = o.a.w;
                    iM6981 = (i7 - C0630.m2566("ܰ᩺")) * 79;
                    i9 = (-1535639337) ^ ((iM6981 ^ i8) * (-19085));
                    i3 = -2015731255;
                    i10 = iM6981 ^ i3;
                    c23882 = c23881;
                    i16 = i16;
                    break;
                case 922415390:
                case 1513574767:
                    C1711.m5736();
                    if (!C1916.f6442) {
                        iM2566 = C0630.m2566("ܶۧ") ^ i7;
                        i = ((iM2566 ^ i8) * (-25075)) ^ (-164380031);
                        i2 = 499126816;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        i16 = i16;
                        iM6982 = (C2105.m6981("ۖۢ") ^ i8) * (-85);
                        i5 = ((iM6982 ^ i7) * 13655) ^ 1181342765;
                        i6 = -1254562826;
                        i10 = iM6982 ^ i6;
                        i9 = i5;
                        i16 = i16;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                    }
                    break;
                case 1085237912:
                case 1975749652:
                    i16 = i16;
                    s = sArr[c];
                    s2 = 19780;
                    if (C4616.m13552() == 0) {
                        iM6981 = (C0630.m2566("᩻ᩴ") ^ i7) * (-33);
                        i9 = (-267868680) ^ ((iM6981 ^ i8) * (-14943));
                        i3 = -2053997662;
                        i10 = iM6981 ^ i3;
                        c23882 = c23881;
                        i16 = i16;
                    } else {
                        i16 = i16;
                        int iM25613 = (C0630.m2566("ۚܰ") + i8) * (-121);
                        i9 = (-910533046) ^ ((iM25613 ^ i7) * (-21561));
                        i10 = iM25613 ^ (-809890616);
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        c23882 = c23881;
                    }
                    break;
                case 1222627730:
                case 1555164223:
                    String str = strM6573;
                    i16 = i16;
                    C3683.m11210(c23882, str);
                    viewOnClickListenerC3441.m10517();
                    if (!C0483.m2131(c23881)) {
                        strM6573 = str;
                        iM2567 = (C0630.m2566("ۗܽ") + i8) * 65;
                        i9 = ((iM2567 ^ i7) * 32039) ^ (-2005569756);
                        i4 = -278590137;
                        i10 = iM2567 ^ i4;
                        i16 = i16;
                    } else {
                        iM6982 = (C2105.m6981("ۙۜ") ^ i7) * (-41);
                        strM6573 = str;
                        i5 = ((iM6982 ^ i8) * 5627) ^ (-1753344479);
                        i6 = 2045799276;
                        i10 = iM6982 ^ i6;
                        i9 = i5;
                        i16 = i16;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                    }
                    break;
                default:
                    short[] sArr6 = sArr2;
                    i16 = i16;
                    iM50604 = C22628.m50604(c23881);
                    if (iM50604 != 1000) {
                        iM2567 = (C0630.m2566("᩺֫") + i7) * (-19);
                        sArr2 = sArr6;
                        i9 = ((iM2567 ^ i8) * 3211) ^ (-1820278292);
                        i4 = -1671239435;
                    } else {
                        sArr2 = sArr6;
                        iM2567 = C0630.m2566("ܰۜ") ^ i7;
                        i9 = ((iM2567 ^ i8) * (-16093)) ^ 1374682993;
                        i4 = -803969361;
                    }
                    i10 = iM2567 ^ i4;
                    i16 = i16;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0164  */
    /* JADX WARN: Code duplicated, block: B:61:0x022c A[PHI: r2 r5 r8 r9
      0x022c: PHI (r2v5 int) = (r2v2 int), (r2v2 int), (r2v4 int), (r2v2 int), (r2v2 int) binds: [B:60:0x022a, B:56:0x020c, B:37:0x013c, B:21:0x009e, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r5v4 java.lang.String) = 
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v3 java.lang.String)
      (r5v2 java.lang.String)
     binds: [B:60:0x022a, B:56:0x020c, B:37:0x013c, B:21:0x009e, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:60:0x022a, B:56:0x020c, B:37:0x013c, B:21:0x009e, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:60:0x022a, B:56:0x020c, B:37:0x013c, B:21:0x009e, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0260 A[PHI: r3 r7 r10 r11 r12 r14 r15 r20
      0x0260: PHI (r3v5 android.view.View) = 
      (r3v2 android.view.View)
      (r3v2 android.view.View)
      (r3v3 android.view.View)
      (r3v2 android.view.View)
      (r3v2 android.view.View)
     binds: [B:64:0x025e, B:52:0x01ef, B:33:0x011d, B:25:0x00c1, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r7v5 char) = (r7v3 char), (r7v2 char), (r7v2 char), (r7v2 char), (r7v2 char) binds: [B:64:0x025e, B:52:0x01ef, B:33:0x011d, B:25:0x00c1, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:64:0x025e, B:52:0x01ef, B:33:0x011d, B:25:0x00c1, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r11v5 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:64:0x025e, B:52:0x01ef, B:33:0x011d, B:25:0x00c1, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r12v5 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:64:0x025e, B:52:0x01ef, B:33:0x011d, B:25:0x00c1, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r14v5 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:64:0x025e, B:52:0x01ef, B:33:0x011d, B:25:0x00c1, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r15v5 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:64:0x025e, B:52:0x01ef, B:33:0x011d, B:25:0x00c1, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r20v6 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:64:0x025e, B:52:0x01ef, B:33:0x011d, B:25:0x00c1, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final void m10524() {
        int iM2566;
        int i;
        int i2;
        int i3 = C2520.f8000;
        int i4 = C2167.f7158;
        int iM2567 = C0630.m2566("᩸ۘ") ^ i3;
        int i5 = ((iM2567 ^ i4) * (-10279)) ^ 694413550;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2567 ^ 1768990093;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1453569016;
        String strM7159 = null;
        float[] fArr = null;
        View view = null;
        int i14 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-26361)) >> 31));
            switch (i13) {
                case -2100640267:
                case 1912199032:
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    sArr2 = f10875;
                    i12 = 87;
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ۤܿ") ^ i4;
                        i = ((iM2566 ^ i3) * 14305) ^ 1420110743;
                        i2 = 738463892;
                    } else {
                        iM2566 = (i4 - C2105.m6981("֫֡")) * 91;
                        i = ((iM2566 ^ i3) * 31997) ^ 937111454;
                        i2 = -1027803703;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2092978631:
                case 1078253747:
                    strM7159 = C2167.m7159(sArr2, i12, 5, i11);
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("᩸᩸") ^ i4;
                        i = ((iM2566 ^ i3) * 2309) ^ (-1657226489);
                        i2 = -1638947324;
                    } else {
                        iM2566 = C2105.m6981("᩻᩷") ^ i4;
                        i = ((iM2566 ^ i3) * (-6157)) ^ 760002251;
                        i2 = 1820972552;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1947481772:
                case 1758927775:
                    C1294.m4370(view, 0.0f);
                    fArr = new float[2];
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("ܽܰ") ^ i3;
                        i = ((iM2566 ^ i4) * (-10979)) ^ 2037485681;
                        i2 = -552704789;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩹ۨ")) * (-59);
                        i = ((iM2566 ^ i4) * 28891) ^ (-987169816);
                        i2 = 1393445740;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1848453495:
                case 1376900329:
                    i7 = s + 16311;
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("᩸᩸") ^ i4;
                        i = ((iM2566 ^ i3) * 2309) ^ (-1657226489);
                        i2 = -1638947324;
                    } else {
                        iM2566 = C2105.m6981("᩷ۘ") ^ i4;
                        i = ((iM2566 ^ i3) * (-32437)) ^ (-1918875453);
                        i2 = 893226386;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1802678149:
                case 1885131764:
                    C2126.m7040();
                    C3245.m9925();
                    break;
                case -1743901374:
                case 443472687:
                    i11 = 17598;
                    iM2566 = (i4 - C2105.m6981("ᩴ᩺")) * (-55);
                    i = ((iM2566 ^ i3) * 4065) ^ (-268458089);
                    i2 = -1370747208;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1477242761:
                case -179158935:
                    C4159.m12565();
                    if (C0050.m940() <= 0) {
                        iM2566 = C2105.m6981("᩹ۧ") ^ i3;
                        i = ((iM2566 ^ i4) * (-16895)) ^ (-350026637);
                        i2 = -67428306;
                    } else {
                        iM2566 = (C2105.m6981("᩶ۤ") ^ i3) * 101;
                        i = ((iM2566 ^ i4) * 5027) ^ (-1071399984);
                        i2 = 1009154454;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1473856237:
                case -1243867790:
                    C22628.m50603(C1711.m5730(C5695.m16025(view, strM7159, fArr), 200L));
                    break;
                case -1391451584:
                case 513330091:
                    int i15 = i9 + i10;
                    if (i8 - (i15 + i15) > 0) {
                        iM2566 = C0630.m2566("۠ۗ") ^ i4;
                        i = ((iM2566 ^ i3) * (-23931)) ^ (-2095383436);
                        i2 = 1096317587;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۗ") ^ i3) * (-73);
                        i = ((iM2566 ^ i4) * (-21021)) ^ 1206015398;
                        i2 = 768749224;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1326938117:
                case -514733032:
                    this.f10882.m1437((DialogInterface.OnKeyListener) null);
                    if (C1047.m3599() >= 0) {
                        iM2566 = C2105.m6981("᩹ۧ") ^ i3;
                        i = ((iM2566 ^ i4) * (-16895)) ^ (-350026637);
                        i2 = -67428306;
                    } else {
                        iM2566 = C2105.m6981("ܺ᩵") ^ i3;
                        i = ((iM2566 ^ i4) * (-30075)) ^ (-1032247323);
                        i2 = 1756625181;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1036065505:
                case 1192912162:
                    C0630.m2564();
                    iM2566 = C2105.m6981("᩹ۧ") ^ i3;
                    i = ((iM2566 ^ i4) * (-16895)) ^ (-350026637);
                    i2 = -67428306;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -704755750:
                case 13231993:
                    i11 = 11275;
                    iM2566 = (i4 - C2105.m6981("ᩴ᩺")) * (-55);
                    i = ((iM2566 ^ i3) * 4065) ^ (-268458089);
                    i2 = -1370747208;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -489204039:
                case 1794009621:
                    sArr = f10875;
                    c = 'V';
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ۤܿ") ^ i4;
                        i = ((iM2566 ^ i3) * 14305) ^ 1420110743;
                        i2 = 738463892;
                    } else {
                        iM2566 = (C0630.m2566("᩸᩺") + i4) * (-31);
                        i = ((iM2566 ^ i3) * (-22869)) ^ 1485137773;
                        i2 = 1563803875;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -484979918:
                case 367687802:
                    i14 = 0;
                    if (C1504.m5179()) {
                        iM2566 = (C0630.m2566("ۧ᩵") ^ i3) * 127;
                        i = ((iM2566 ^ i4) * (-7441)) ^ 560780453;
                        i2 = 901356970;
                    } else {
                        iM2566 = C2105.m6981("᩸᩸") ^ i4;
                        i = ((iM2566 ^ i3) * 2309) ^ (-1657226489);
                        i2 = -1638947324;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -328713483:
                case 527271111:
                    i8 = i7 * i7;
                    i9 = s * s;
                    i10 = 266048721;
                    if (C1773.f6144 <= 0) {
                        iM2566 = C2105.m6981("ۤܿ") ^ i4;
                        i = ((iM2566 ^ i3) * 14305) ^ 1420110743;
                        i2 = 738463892;
                    } else {
                        iM2566 = C2105.m6981("ۛۨ") ^ i3;
                        i = ((iM2566 ^ i4) * 25721) ^ 1230878796;
                        i2 = 649343353;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -215238965:
                case 661353842:
                    s = sArr[c];
                    if (AbstractC2021.m6574()) {
                        iM2566 = C2105.m6981("᩸᩸") ^ i4;
                        i = ((iM2566 ^ i3) * 2309) ^ (-1657226489);
                        i2 = -1638947324;
                    } else {
                        iM2566 = (C0630.m2566("ᩳ۠") + i3) * 7;
                        i = ((iM2566 ^ i4) * 359) ^ (-1703239737);
                        i2 = -2088124146;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -146537239:
                case 1942911340:
                    view = this.f10881;
                    C1128.m3853(view, i14);
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("ۤܿ") ^ i4;
                        i = ((iM2566 ^ i3) * 14305) ^ 1420110743;
                        i2 = 738463892;
                    } else {
                        iM2566 = C0630.m2566("ۡ᩸") ^ i4;
                        i = ((iM2566 ^ i3) * 5639) ^ (-61246808);
                        i2 = -1316915186;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 53312232:
                case 627406516:
                    if (C2126.f7087) {
                        iM2566 = C2105.m6981("᩹ۧ") ^ i3;
                        i = ((iM2566 ^ i4) * (-16895)) ^ (-350026637);
                        i2 = -67428306;
                    } else {
                        iM2566 = C2105.m6981("᩸᩸") ^ i4;
                        i = ((iM2566 ^ i3) * 2309) ^ (-1657226489);
                        i2 = -1638947324;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1047.m3599();
                    if (C7811.f24123 < 0) {
                        iM2566 = (C2105.m6981("᩶ۤ") ^ i3) * 101;
                        i = ((iM2566 ^ i4) * 5027) ^ (-1071399984);
                        i2 = 1009154454;
                    } else {
                        iM2566 = C2105.m6981("ۤܿ") ^ i4;
                        i = ((iM2566 ^ i3) * 14305) ^ 1420110743;
                        i2 = 738463892;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0118 A[PHI: r11
      0x0118: PHI (r11v5 int) = (r11v4 int), (r11v2 int) binds: [B:30:0x0116, B:16:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01f1 A[PHI: r7 r9 r10 r12
      0x01f1: PHI (r7v7 com.google.android.material.textfield.TextInputLayout) = 
      (r7v2 com.google.android.material.textfield.TextInputLayout)
      (r7v3 com.google.android.material.textfield.TextInputLayout)
      (r7v2 com.google.android.material.textfield.TextInputLayout)
      (r7v2 com.google.android.material.textfield.TextInputLayout)
      (r7v2 com.google.android.material.textfield.TextInputLayout)
      (r7v2 com.google.android.material.textfield.TextInputLayout)
     binds: [B:50:0x01ef, B:40:0x018d, B:24:0x00df, B:18:0x00b3, B:16:0x00af, B:141:0x01f1] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r9v8 java.lang.String) = 
      (r9v4 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
     binds: [B:50:0x01ef, B:40:0x018d, B:24:0x00df, B:18:0x00b3, B:16:0x00af, B:141:0x01f1] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r10v8 java.lang.String) = 
      (r10v2 java.lang.String)
      (r10v4 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
     binds: [B:50:0x01ef, B:40:0x018d, B:24:0x00df, B:18:0x00b3, B:16:0x00af, B:141:0x01f1] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r12v8 int) = (r12v2 int), (r12v2 int), (r12v4 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:50:0x01ef, B:40:0x018d, B:24:0x00df, B:18:0x00b3, B:16:0x00af, B:141:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m10526(ViewOnClickListenerC3441 viewOnClickListenerC3441, C23881 c23881) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int iM2568;
        int i5;
        int i6;
        C19111 c19111;
        int iM6981;
        int i7;
        int iM2569;
        C19111 c19112;
        int i8;
        C19111 c19113;
        ViewOnClickListenerC3441 viewOnClickListenerC3442 = viewOnClickListenerC3441;
        int i9 = RunnableC1937.f6483;
        int i10 = ViewOnClickListenerC1958.f6529;
        int iM25610 = C0630.m2566("֫ۖ") ^ i10;
        int i11 = ((iM25610 ^ i9) * (-9697)) ^ (-1382212203);
        TextInputLayout textInputLayout = null;
        C19111 c19114 = null;
        String strM11919 = null;
        short[] sArr = null;
        int i12 = iM25610 ^ 1082408794;
        int i13 = 0;
        int iM49333 = 0;
        int iM25611 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s = 0;
        String strM9934 = null;
        int i17 = 827971723;
        String strM9935 = null;
        short[] sArr2 = null;
        int iM25612 = 0;
        String strM10488 = null;
        TextInputLayout textInputLayout2 = null;
        while (true) {
            i17 = i12 ^ (i11 & (((i17 ^ i9) * (-20743)) >> 31));
            switch (i17) {
                case -2004549562:
                case 728657056:
                    textInputLayout2 = viewOnClickListenerC3442.f10887;
                    strM11919 = C3911.m11919(f10875, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i14);
                    if (C5695.f17556 >= 0) {
                        iM2568 = C2105.m6981("᩶᩸") ^ i10;
                        i5 = ((iM2568 ^ i9) * 18975) ^ (-1433384940);
                        i6 = 1520586459;
                    } else {
                        iM2568 = C2105.m6981("᩹ۛ") ^ i9;
                        i5 = ((iM2568 ^ i10) * (-14447)) ^ 67198493;
                        i6 = -818367021;
                    }
                    i12 = iM2568 ^ i6;
                    i11 = i5;
                    break;
                case -1731309941:
                case -1386873335:
                    strM9934 = strM9934;
                    c19114 = c19114;
                    s = sArr2[c];
                    i16 = s + 1;
                    if (C2958.m9034() > 0) {
                        iM2566 = (i10 - C2105.m6981("ܰۤ")) * 41;
                        i = ((iM2566 ^ i9) * 5107) ^ 1370323677;
                        i2 = 1837808951;
                        i4 = iM2566 ^ i2;
                        strM9934 = strM9934;
                        i11 = i;
                        c19114 = c19114;
                        i12 = i4;
                        viewOnClickListenerC3442 = viewOnClickListenerC3441;
                    } else {
                        c19114 = c19114;
                        int iM25613 = (C0630.m2566("᩶ᩳ") ^ i9) * 89;
                        i5 = ((iM25613 ^ i10) * (-26751)) ^ (-2080921736);
                        i12 = iM25613 ^ (-817793144);
                        viewOnClickListenerC3442 = viewOnClickListenerC3441;
                        strM9934 = strM9934;
                        i11 = i5;
                    }
                    break;
                case -1601346057:
                case 1879934612:
                    if (iM49333 != 1601) {
                        iM2568 = C2105.m6981("֫᩷") ^ i10;
                        i5 = ((iM2568 ^ i9) * 7699) ^ 1042125756;
                        i6 = 195038125;
                    } else {
                        iM2568 = C2105.m6981("ܶ۬") ^ i10;
                        i5 = ((iM2568 ^ i9) * (-4627)) ^ (-1092081826);
                        i6 = -332120439;
                    }
                    i12 = iM2568 ^ i6;
                    i11 = i5;
                    break;
                case -1517135530:
                case -485766962:
                    c19114 = c19114;
                    strM9934 = C3245.m9934(f10875, 93, 8, i14);
                    if (C4117.m12364() != 0) {
                        iM2567 = C2105.m6981("ܳ۠") ^ i10;
                        i11 = ((iM2567 ^ i9) * (-14545)) ^ (-1789276128);
                        i3 = -1421256395;
                    } else {
                        iM2567 = (i10 - C0630.m2566("ۖۤ")) * 95;
                        i11 = ((iM2567 ^ i9) * 11977) ^ 284087257;
                        i3 = -1693485952;
                    }
                    i4 = iM2567 ^ i3;
                    c19114 = c19114;
                    i12 = i4;
                    viewOnClickListenerC3442 = viewOnClickListenerC3441;
                    break;
                case -1402121290:
                case 242114049:
                    AbstractC2021.m6571(textInputLayout, C2105.m6981(strM9935) ^ 2128032766);
                    break;
                case -1326769977:
                case 2018765559:
                    C0237.m1481();
                    if (ServiceConnectionC3453.m10564() > 0) {
                        c19114 = c19114;
                        iM2567 = C2105.m6981("ܳ۠") ^ i10;
                        i11 = ((iM2567 ^ i9) * (-14545)) ^ (-1789276128);
                        i3 = -1421256395;
                        i4 = iM2567 ^ i3;
                        c19114 = c19114;
                        i12 = i4;
                        viewOnClickListenerC3442 = viewOnClickListenerC3441;
                    } else {
                        c19113 = c19114;
                        iM2569 = C2105.m6981("ۡ֫") ^ i10;
                        c19112 = c19113;
                        i11 = ((iM2569 ^ i9) * (-15009)) ^ 162011206;
                        i8 = -1766529937;
                        int i18 = iM2569 ^ i8;
                        c19114 = c19112;
                        i12 = i18;
                    }
                    break;
                case -1206420280:
                case -1050832743:
                    iM25611 = C0630.m2566(C4075.m12252(f10875, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i14));
                    if (C3432.f10845 >= 0) {
                        iM2568 = C2105.m6981("ܶ֨") ^ i9;
                        i5 = ((iM2568 ^ i10) * 6915) ^ 131469301;
                        i6 = -70990400;
                    } else {
                        iM2568 = C2105.m6981("ᩴۨ") ^ i9;
                        i5 = ((iM2568 ^ i10) * (-31917)) ^ (-973841350);
                        i6 = -1861151139;
                    }
                    i12 = iM2568 ^ i6;
                    i11 = i5;
                    break;
                case -1030251854:
                case 907521885:
                    C2167.m7155();
                    if (C1711.f5919) {
                        iM2568 = C2105.m6981("᩶᩸") ^ i10;
                        i5 = ((iM2568 ^ i9) * 18975) ^ (-1433384940);
                        i6 = 1520586459;
                    } else {
                        iM2568 = C2105.m6981("ܶ֨") ^ i9;
                        i5 = ((iM2568 ^ i10) * 6915) ^ 131469301;
                        i6 = -70990400;
                    }
                    i12 = iM2568 ^ i6;
                    i11 = i5;
                    break;
                case -1004072901:
                case 243442734:
                    ViewOnClickListenerC1958.m6429();
                    C11340.m28031();
                    break;
                case -872333408:
                case 1781006296:
                    C1005.m3501();
                    C1504.m5179();
                    iM2568 = C2105.m6981("᩶᩸") ^ i10;
                    i5 = ((iM2568 ^ i9) * 18975) ^ (-1433384940);
                    i6 = 1520586459;
                    i12 = iM2568 ^ i6;
                    i11 = i5;
                    break;
                case -789758871:
                case 1591234939:
                    AbstractC2021.m6571(textInputLayout2, C0630.m2566(strM11919) ^ 2103154295);
                    break;
                case -571741566:
                case -207723094:
                    c19114.m44038(C2105.m6981(C3663.m11162(sArr, i15, i13, i14)) ^ 2127134965);
                    break;
                case -448253337:
                case 2060238994:
                    strM9935 = C3245.m9934(f10875, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 3, i14);
                    if (C7106.f21815 != 0) {
                        iM2568 = C2105.m6981("᩶᩸") ^ i10;
                        i5 = ((iM2568 ^ i9) * 18975) ^ (-1433384940);
                        i6 = 1520586459;
                    } else {
                        iM2568 = C0630.m2566("۫ۖ") ^ i9;
                        i5 = ((iM2568 ^ i10) * 16219) ^ 375998245;
                        i6 = -1618125728;
                    }
                    i12 = iM2568 ^ i6;
                    i11 = i5;
                    break;
                case -353463975:
                case 346500582:
                    strM9934 = strM9934;
                    c19114 = c19114;
                    sArr2 = f10875;
                    c = '\\';
                    if (C3911.f12484 < 0) {
                        iM2566 = (C0630.m2566("۠ۜ") + i9) * (-99);
                        i = ((iM2566 ^ i10) * (-11075)) ^ 1859989975;
                        i2 = 205909701;
                        i4 = iM2566 ^ i2;
                        strM9934 = strM9934;
                        i11 = i;
                        c19114 = c19114;
                        i12 = i4;
                        viewOnClickListenerC3442 = viewOnClickListenerC3441;
                    } else {
                        strM9934 = strM9934;
                        iM2567 = C2105.m6981("ܳ۠") ^ i10;
                        i11 = ((iM2567 ^ i9) * (-14545)) ^ (-1789276128);
                        i3 = -1421256395;
                        i4 = iM2567 ^ i3;
                        c19114 = c19114;
                        i12 = i4;
                        viewOnClickListenerC3442 = viewOnClickListenerC3441;
                    }
                    break;
                case -9823473:
                case 22515423:
                    if (C22628.f73083 > 0) {
                        c19113 = c19114;
                        iM2569 = C2105.m6981("ۡ֫") ^ i10;
                        c19112 = c19113;
                        i11 = ((iM2569 ^ i9) * (-15009)) ^ 162011206;
                        i8 = -1766529937;
                        int i19 = iM2569 ^ i8;
                        c19114 = c19112;
                        i12 = i19;
                    } else {
                        iM2568 = C2105.m6981("᩶᩸") ^ i10;
                        i5 = ((iM2568 ^ i9) * 18975) ^ (-1433384940);
                        i6 = 1520586459;
                        i12 = iM2568 ^ i6;
                        i11 = i5;
                    }
                    break;
                case 15856515:
                case 35272242:
                    C0287.m1631(textInputLayout, RunnableC3474.m10631(c23881, 2119397835 ^ iM25611));
                    break;
                case 35480906:
                case 351875799:
                    if (iM49333 != 1101) {
                        iM2568 = (C2105.m6981("ۗۗ") ^ i10) * 87;
                        i5 = ((iM2568 ^ i9) * 459) ^ (-1419551756);
                        i6 = -436069941;
                    } else {
                        iM2568 = C2105.m6981("֡ۜ") ^ i10;
                        i5 = ((iM2568 ^ i9) * (-26149)) ^ 125221143;
                        i6 = 787468798;
                    }
                    i12 = iM2568 ^ i6;
                    i11 = i5;
                    break;
                case 69848585:
                case 619701582:
                    c19111 = c19114;
                    iM49333 = C21923.m49333(c23881);
                    if (iM49333 != 1001) {
                        iM6981 = (C0630.m2566("ۡܶ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM6981 ^ i10) * (-287)) ^ (-328918435);
                        i7 = -1025158368;
                    } else {
                        iM6981 = (C2105.m6981("ۨۧ") + i9) * 63;
                        i5 = ((iM6981 ^ i10) * 17277) ^ 323501621;
                        i7 = -913528915;
                    }
                    int i20 = iM6981 ^ i7;
                    c19114 = c19111;
                    i12 = i20;
                    i11 = i5;
                    break;
                case 224496871:
                case 2115109594:
                    if (iM49333 != 1200) {
                        iM2568 = (C2105.m6981("᩺ۨ") + i9) * 49;
                        i5 = ((iM2568 ^ i10) * (-14815)) ^ 1759620140;
                        i6 = 1303463599;
                    } else {
                        iM2568 = C2105.m6981("ܿܰ") ^ i10;
                        i5 = ((iM2568 ^ i9) * (-24467)) ^ 1541221946;
                        i6 = 2135764806;
                    }
                    i12 = iM2568 ^ i6;
                    i11 = i5;
                    break;
                case 231503423:
                case 870615847:
                    C3663.m11167(viewOnClickListenerC3442.f10882);
                    C19111 c19115 = viewOnClickListenerC3442.f10877;
                    sArr = f10875;
                    if (C7106.m19120() > 0) {
                        iM2569 = C0630.m2566("֨᩺") ^ i9;
                        c19112 = c19115;
                        i11 = ((iM2569 ^ i10) * (-16651)) ^ (-991358428);
                        i8 = -648015667;
                        int i110 = iM2569 ^ i8;
                        c19114 = c19112;
                        i12 = i110;
                    } else {
                        c19114 = c19115;
                        strM9934 = strM9934;
                        int iM25614 = (C0630.m2566("᩶ᩳ") ^ i9) * 89;
                        i5 = ((iM25614 ^ i10) * (-26751)) ^ (-2080921736);
                        i12 = iM25614 ^ (-817793144);
                        viewOnClickListenerC3442 = viewOnClickListenerC3441;
                        strM9934 = strM9934;
                        i11 = i5;
                    }
                    break;
                case 274364066:
                case 547626533:
                    RunnableC0588.m2440(RunnableC3474.m10631(c23881, 2116147618 ^ iM25612));
                    break;
                case 337264588:
                case 1892668786:
                    strM9934 = strM9934;
                    c19114 = c19114;
                    if (((s * 2) + 1) - (i16 * i16) <= 0) {
                        iM2566 = (C2105.m6981("۬ܿ") + i10) * (-95);
                        i = ((iM2566 ^ i9) * 24563) ^ (-545904909);
                        i2 = -72869835;
                    } else {
                        iM2566 = (i9 - C0630.m2566("ۧᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2566 ^ i10) * (-3007)) ^ 1668829662;
                        i2 = -2143351869;
                    }
                    i4 = iM2566 ^ i2;
                    strM9934 = strM9934;
                    i11 = i;
                    c19114 = c19114;
                    i12 = i4;
                    viewOnClickListenerC3442 = viewOnClickListenerC3441;
                    break;
                case 524015114:
                case 1216546357:
                    c19113 = c19114;
                    i15 = 101;
                    i13 = 3;
                    if (RunnableC0588.f2309 < 0) {
                        c19111 = c19113;
                        iM6981 = C2105.m6981("ۜ᩵") ^ i10;
                        i5 = ((iM6981 ^ i9) * 32073) ^ 1111860748;
                        i7 = -1480774012;
                        int i21 = iM6981 ^ i7;
                        c19114 = c19111;
                        i12 = i21;
                        i11 = i5;
                    } else {
                        iM2569 = C2105.m6981("ۡ֫") ^ i10;
                        c19112 = c19113;
                        i11 = ((iM2569 ^ i9) * (-15009)) ^ 162011206;
                        i8 = -1766529937;
                        int i111 = iM2569 ^ i8;
                        c19114 = c19112;
                        i12 = i111;
                    }
                    break;
                case 596513449:
                case 1602446774:
                    iM25612 = C0630.m2566(ViewOnClickListenerC1958.m6435(f10875, 116, 3, i14));
                    if (C1047.m3599() >= 0) {
                        iM2568 = C2105.m6981("᩶᩸") ^ i10;
                        i5 = ((iM2568 ^ i9) * 18975) ^ (-1433384940);
                        i6 = 1520586459;
                    } else {
                        iM2568 = (C2105.m6981("ۨܰ") ^ i9) * (-35);
                        i5 = ((iM2568 ^ i10) * (-1907)) ^ (-487704626);
                        i6 = 497867320;
                    }
                    i12 = iM2568 ^ i6;
                    i11 = i5;
                    break;
                case 747116309:
                case 1793598442:
                    i14 = 16478;
                    iM2566 = C2105.m6981("ۜۙ") ^ i9;
                    i = ((iM2566 ^ i10) * 28403) ^ 1012460216;
                    i2 = 1927859353;
                    i4 = iM2566 ^ i2;
                    strM9934 = strM9934;
                    i11 = i;
                    c19114 = c19114;
                    i12 = i4;
                    viewOnClickListenerC3442 = viewOnClickListenerC3441;
                    break;
                case 784787898:
                case 1869833775:
                    strM10488 = C3432.m10488(f10875, IShizukuService.Stub.TRANSACTION_isHidden, 3, i14);
                    if (C1773.m5908() > 0) {
                        iM2568 = C0630.m2566("ܶ۫") ^ i10;
                        i5 = ((iM2568 ^ i9) * (-32029)) ^ (-1161138457);
                        i6 = 650394912;
                        i12 = iM2568 ^ i6;
                        i11 = i5;
                    } else {
                        c19114 = c19114;
                        iM2567 = C2105.m6981("ܳ۠") ^ i10;
                        i11 = ((iM2567 ^ i9) * (-14545)) ^ (-1789276128);
                        i3 = -1421256395;
                        i4 = iM2567 ^ i3;
                        c19114 = c19114;
                        i12 = i4;
                        viewOnClickListenerC3442 = viewOnClickListenerC3441;
                    }
                    break;
                case 1037805183:
                case 1350733484:
                    i14 = 61944;
                    iM2566 = C2105.m6981("ۜۙ") ^ i9;
                    i = ((iM2566 ^ i10) * 28403) ^ 1012460216;
                    i2 = 1927859353;
                    i4 = iM2566 ^ i2;
                    strM9934 = strM9934;
                    i11 = i;
                    c19114 = c19114;
                    i12 = i4;
                    viewOnClickListenerC3442 = viewOnClickListenerC3441;
                    break;
                case 1149203133:
                case 1927774050:
                    RunnableC3474.m10621(textInputLayout, C0630.m2566(strM10488) ^ 2127543563);
                    break;
                default:
                    strM9934 = strM9934;
                    c19114 = c19114;
                    C3683.m11210(c23881, strM9934);
                    viewOnClickListenerC3441.m10517();
                    textInputLayout = viewOnClickListenerC3442.f10880;
                    if (C1773.m5916(c23881)) {
                        int iM25615 = (i9 - C0630.m2566("ᩳܽ")) * q.h;
                        strM9934 = strM9934;
                        c19114 = c19114;
                        i11 = ((iM25615 ^ i10) * 8297) ^ (-290268265);
                        i12 = iM25615 ^ 930898495;
                    } else {
                        iM2566 = (i10 - C2105.m6981("ۖۜ")) * 91;
                        i = ((iM2566 ^ i9) * 17493) ^ (-688196846);
                        i2 = -327920350;
                        i4 = iM2566 ^ i2;
                        strM9934 = strM9934;
                        i11 = i;
                        c19114 = c19114;
                        i12 = i4;
                    }
                    viewOnClickListenerC3442 = viewOnClickListenerC3441;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00fc A[PHI: r3 r6
      0x00fc: PHI (r3v4 float[]) = (r3v3 float[]), (r3v2 float[]) binds: [B:32:0x00fa, B:20:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r6v2 long) = (r6v1 long), (r6v3 long) binds: [B:32:0x00fa, B:20:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0137 A[PHI: r4 r5 r12 r13
      0x0137: PHI (r4v5 android.view.View) = (r4v2 android.view.View), (r4v3 android.view.View), (r4v2 android.view.View), (r4v2 android.view.View) binds: [B:36:0x0135, B:28:0x00da, B:24:0x00b3, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r5v5 android.animation.ObjectAnimator) = 
      (r5v2 android.animation.ObjectAnimator)
      (r5v2 android.animation.ObjectAnimator)
      (r5v3 android.animation.ObjectAnimator)
      (r5v2 android.animation.ObjectAnimator)
     binds: [B:36:0x0135, B:28:0x00da, B:24:0x00b3, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r12v5 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:36:0x0135, B:28:0x00da, B:24:0x00b3, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r13v5 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:36:0x0135, B:28:0x00da, B:24:0x00b3, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x019d A[PHI: r2 r9 r10
      0x019d: PHI (r2v4 java.lang.Runnable) = 
      (r2v3 java.lang.Runnable)
      (r2v2 java.lang.Runnable)
      (r2v2 java.lang.Runnable)
      (r2v2 java.lang.Runnable)
      (r2v2 java.lang.Runnable)
     binds: [B:44:0x019b, B:16:0x007b, B:14:0x0077, B:11:0x0071, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r9v4 short[]) = (r9v3 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:44:0x019b, B:16:0x007b, B:14:0x0077, B:11:0x0071, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:44:0x019b, B:16:0x007b, B:14:0x0077, B:11:0x0071, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0247 A[PHI: r8 r14 r18 r19 r24
      0x0247: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:59:0x0245, B:55:0x0227, B:40:0x0172, B:11:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r14v4 short) = (r14v2 short), (r14v3 short), (r14v2 short), (r14v2 short) binds: [B:59:0x0245, B:55:0x0227, B:40:0x0172, B:11:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:59:0x0245, B:55:0x0227, B:40:0x0172, B:11:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:59:0x0245, B:55:0x0227, B:40:0x0172, B:11:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r24v5 short) = (r24v4 short), (r24v3 short), (r24v3 short), (r24v3 short) binds: [B:59:0x0245, B:55:0x0227, B:40:0x0172, B:11:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x027d A[PHI: r16 r17
      0x027d: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:63:0x027b, B:14:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r17v4 char) = (r17v3 char), (r17v2 char) binds: [B:63:0x027b, B:14:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m10517() {
        int iM2566;
        int i;
        int i2;
        int i3 = C1128.f4106;
        int i4 = C0050.f910;
        int iM2567 = (C0630.m2566("᩻ᩴ") + i4) * 69;
        int i5 = ((iM2567 ^ i3) * 16907) ^ (-1494486042);
        long j = 0;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2567 ^ (-233099388);
        int iM6981 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        char c = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = -1877981761;
        short s3 = 0;
        ObjectAnimator objectAnimatorM16025 = null;
        View view = null;
        float[] fArr = null;
        Runnable runnable = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * 31781) >> 31));
            switch (i11) {
                case -1893483630:
                case -1851673149:
                    fArr = new float[2];
                    if (C2126.f7087) {
                        iM2566 = (C2105.m6981("ۡܶ") + i3) * 85;
                        i = ((iM2566 ^ i4) * 32359) ^ 1879318457;
                        i2 = -1520791141;
                    } else {
                        iM2566 = C0630.m2566("ᩳܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 9243) ^ 1397563553;
                        i2 = 707770003;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1884919663:
                case -242106790:
                    runnable = new Runnable() { // from class: l.᩹᩵ۡ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC3441.m10525(this.f72815);
                        }
                    };
                    sArr2 = f10875;
                    i7 = 57;
                    if (C3432.m10477() <= 0) {
                        iM2566 = (C2105.m6981("ۛ᩹") + i3) * (-19);
                        i = ((iM2566 ^ i4) * 12621) ^ 1324332076;
                        i2 = 1365877993;
                    } else {
                        iM2566 = (C0630.m2566("ܿۡ") + i3) * (-63);
                        i = ((iM2566 ^ i4) * 32321) ^ (-1359791443);
                        i2 = -1018707267;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1805885929:
                case 1686116421:
                    int i12 = s3 + s2;
                    i10 = i12 * i12;
                    s = 43784;
                    if (C1294.f4556 >= 0) {
                        iM2566 = C2105.m6981("ܺ֡") ^ i3;
                        i = ((iM2566 ^ i4) * (-22645)) ^ (-609236166);
                        i2 = 1307377008;
                    } else {
                        iM2566 = C0630.m2566("ۗܽ") ^ i3;
                        i = ((iM2566 ^ i4) * 20043) ^ 703146276;
                        i2 = 1231272578;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1764166782:
                case -344037456:
                    sArr = f10875;
                    c = '8';
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = (C0630.m2566("۠۠") + i4) * 7;
                        i = ((iM2566 ^ i3) * (-9103)) ^ (-1616048895);
                        i2 = 858712542;
                    } else {
                        iM2566 = (C0630.m2566("ۨ۟") + i3) * 85;
                        i = ((iM2566 ^ i4) * 31469) ^ 2668455;
                        i2 = 1802852839;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1615335462:
                case -1035582075:
                    C5088.m14638(this.f10882, 2101425295 ^ iM6981, runnable);
                    if (C1128.f4106 <= 0) {
                        iM2566 = C2105.m6981("ۘܳ") ^ i4;
                        i = ((iM2566 ^ i3) * (-23005)) ^ (-428138439);
                        i2 = -220739031;
                    } else {
                        iM2566 = (i4 - C2105.m6981("֨֨")) * 79;
                        i = ((iM2566 ^ i3) * (-2183)) ^ 832114004;
                        i2 = 2040501431;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1495038561:
                case 1105683980:
                    if ((s3 * s) - i10 <= 0) {
                        iM2566 = C0630.m2566("ܽܽ") ^ i4;
                        i = ((iM2566 ^ i3) * (-5381)) ^ (-1764972162);
                        i2 = -1247014657;
                    } else {
                        iM2566 = C2105.m6981("֡ܳ") ^ i4;
                        i = ((iM2566 ^ i3) * (-30143)) ^ (-1683390688);
                        i2 = 948041050;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1471524455:
                case -90137814:
                    j = 200;
                    C21923.m49341(C0798.m3008(objectAnimatorM16025, 200L));
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C2105.m6981("ۡܶ") + i3) * 85;
                        i = ((iM2566 ^ i4) * 32359) ^ 1879318457;
                        i2 = -1520791141;
                    } else {
                        iM2566 = C0630.m2566("᩹ۗ") ^ i4;
                        i = ((iM2566 ^ i3) * (-30567)) ^ 1034699880;
                        i2 = -412838163;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1370002373:
                case 1225386516:
                    i9 = 32114;
                    iM2566 = C0630.m2566("֫ܿ") ^ i3;
                    i = ((iM2566 ^ i4) * 20985) ^ 1650831476;
                    i2 = -116060314;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1323401043:
                case 592719095:
                    objectAnimatorM16025 = C5695.m16025(view, C1047.m3603(sArr3, i8, 5, i9), fArr);
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("ۘܳ") ^ i4;
                        i = ((iM2566 ^ i3) * (-23005)) ^ (-428138439);
                        i2 = -220739031;
                    } else {
                        iM2566 = (C2105.m6981("ܽۤ") + i3) * (-95);
                        i = ((iM2566 ^ i4) * (-7893)) ^ 115150015;
                        i2 = 2128681206;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1252771045:
                case 604954231:
                    iM6981 = C2105.m6981(C0050.m948(sArr2, i7, 3, i9));
                    if (C7811.m20844() != 0) {
                        iM2566 = C2105.m6981("ܺ֡") ^ i3;
                        i = ((iM2566 ^ i4) * (-22645)) ^ (-609236166);
                        i2 = 1307377008;
                    } else {
                        iM2566 = (C0630.m2566("۬ۗ") ^ i4) * 57;
                        i = ((iM2566 ^ i3) * (-12861)) ^ 427561703;
                        i2 = -548394758;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1209914073:
                case -609797933:
                    ServiceConnectionC3453.m10564();
                    iM2566 = (C2105.m6981("ۛ᩹") + i3) * (-19);
                    i = ((iM2566 ^ i4) * 12621) ^ 1324332076;
                    i2 = 1365877993;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1083528564:
                case 1976282763:
                    s3 = sArr[c];
                    s2 = 10946;
                    if (C22628.f73083 <= 0) {
                        iM2566 = C2105.m6981("ܺ֡") ^ i3;
                        i = ((iM2566 ^ i4) * (-22645)) ^ (-609236166);
                        i2 = 1307377008;
                    } else {
                        iM2566 = (C0630.m2566("ۨۖ") ^ i4) * (-35);
                        i = ((iM2566 ^ i3) * (-21995)) ^ 1785477247;
                        i2 = 299277876;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1004249693:
                case 708954098:
                    i9 = 8486;
                    iM2566 = C0630.m2566("֫ܿ") ^ i3;
                    i = ((iM2566 ^ i4) * 20985) ^ 1650831476;
                    i2 = -116060314;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -38717807:
                case 581470844:
                    // fill-array-data instruction
                    fArr[0] = 1.0f;
                    fArr[1] = 0.0f;
                    view = this.f10881;
                    sArr3 = f10875;
                    i8 = 60;
                    if (C7106.f21815 != 0) {
                        iM2566 = C2105.m6981("ۘܳ") ^ i4;
                        i = ((iM2566 ^ i3) * (-23005)) ^ (-428138439);
                        i2 = -220739031;
                    } else {
                        iM2566 = (C2105.m6981("ᩴᩴ") + i4) * (-27);
                        i = ((iM2566 ^ i3) * 18651) ^ 546023199;
                        i2 = 2036895072;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 106643210:
                case 256379815:
                    C1916.m6308();
                    break;
                case 242355257:
                case 1786690696:
                    if (C0382.f1805) {
                        iM2566 = C2105.m6981("ܺ֡") ^ i3;
                        i = ((iM2566 ^ i4) * (-22645)) ^ (-609236166);
                        i2 = 1307377008;
                    } else {
                        iM2566 = (C2105.m6981("ۛ᩹") + i3) * (-19);
                        i = ((iM2566 ^ i4) * 12621) ^ 1324332076;
                        i2 = 1365877993;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 570806441:
                case 1164451615:
                    if (C3019.f9544 >= 0) {
                        iM2566 = (C2105.m6981("ۛ᩹") + i3) * (-19);
                        i = ((iM2566 ^ i4) * 12621) ^ 1324332076;
                        i2 = 1365877993;
                    } else {
                        iM2566 = (C0630.m2566("۠۠") + i4) * 7;
                        i = ((iM2566 ^ i3) * (-9103)) ^ (-1616048895);
                        i2 = 858712542;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1497884005:
                case 1900370394:
                    C0630.m2564();
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C2105.m6981("ۛ᩹") + i3) * (-19);
                        i = ((iM2566 ^ i4) * 12621) ^ 1324332076;
                        i2 = 1365877993;
                    } else {
                        iM2566 = C2105.m6981("ۘܳ") ^ i4;
                        i = ((iM2566 ^ i3) * (-23005)) ^ (-428138439);
                        i2 = -220739031;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1294.m4383(new Runnable() { // from class: l.᩶᩵ۡ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC3441.m10518(this.f65772);
                        }
                    }, j);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10518(ViewOnClickListenerC3441 viewOnClickListenerC3441) {
        C3746.m11360(viewOnClickListenerC3441.f10881, 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10519(ViewOnClickListenerC3441 viewOnClickListenerC3441, String str, String str2) {
        int i = -760012599;
        int i2 = C3537.f11231;
        int i3 = C4263.f13799;
        int iM6981 = C2105.m6981("ܺܳ") ^ i2;
        int i4 = ((iM6981 ^ i3) * 2797) ^ 631332336;
        int i5 = -1851279697;
        while (true) {
            i = ((((i ^ i3) * (-32525)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2056856099:
                case -1278436638:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("۠ۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-7131)) ^ (-11532456);
                        i5 = -765313636;
                    } else {
                        iM6981 = (C0630.m2566("ܳۙ") + i3) * 43;
                        i4 = ((iM6981 ^ i2) * (-15757)) ^ (-1042554332);
                        i5 = -1937577950;
                    }
                    break;
                case -1841994846:
                case 2061356979:
                    C1711.m5736();
                    C4616.m13552();
                    break;
                case -1825674423:
                case 1903077863:
                    if (C0714.f2697 >= 0) {
                        iM6981 = (i2 - C2105.m6981("ܽܺ")) * 85;
                        i4 = ((iM6981 ^ i3) * (-19653)) ^ 1346136916;
                        i5 = -222748995;
                    } else {
                        iM6981 = C2105.m6981("ۡ۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21909) ^ (-1137958005);
                        i5 = 503550096;
                    }
                    break;
                case -1795464421:
                case 1352479692:
                    C21923.m49329();
                    ViewOnClickListenerC1958.m6429();
                    iM6981 = C2105.m6981("ۢ۬") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-27833)) ^ 1062911497;
                    i5 = 1317092049;
                    break;
                case -1426883565:
                case 1075731932:
                    if (C2167.m7155()) {
                        iM6981 = C2105.m6981("ܰ֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * 1397) ^ 1474566531;
                        i5 = -2137429546;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۖۢ")) * (-61);
                        i4 = ((iM6981 ^ i2) * (-20187)) ^ (-1791558279);
                        i5 = -2035797096;
                    }
                    break;
                case -1322727860:
                case 425611013:
                    ViewOnClickListenerC1958.m6429();
                    if (C3911.f12484 < 0) {
                        iM6981 = C2105.m6981("۠ۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-7131)) ^ (-11532456);
                        i5 = -765313636;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܽܺ")) * 85;
                        i4 = ((iM6981 ^ i3) * (-19653)) ^ 1346136916;
                        i5 = -222748995;
                    }
                    break;
                case -809877263:
                case 1493776135:
                    viewOnClickListenerC3441.m10524();
                    if (C1504.f5354) {
                        iM6981 = C2105.m6981("ۙ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32091) ^ (-1385779641);
                        i5 = -924345689;
                    } else {
                        iM6981 = (C2105.m6981("ܿ۬") + i3) * (-13);
                        i4 = ((iM6981 ^ i2) * 13091) ^ 1903897754;
                        i5 = 113764180;
                    }
                    break;
                case -691005714:
                case -181584073:
                    if (C2105.m6982() != 0) {
                        iM6981 = C2105.m6981("ܰ֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * 1397) ^ 1474566531;
                        i5 = -2137429546;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۢۘ")) * 123;
                        i4 = ((iM6981 ^ i3) * (-21815)) ^ (-1976987578);
                        i5 = -2076689883;
                    }
                    break;
                case -432091320:
                case 185224390:
                    if (AbstractC2021.f6743 > 0) {
                        iM6981 = (i2 - C2105.m6981("ܽܺ")) * 85;
                        i4 = ((iM6981 ^ i3) * (-19653)) ^ 1346136916;
                        i5 = -222748995;
                    } else {
                        iM6981 = C2105.m6981("ۢ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27833)) ^ 1062911497;
                        i5 = 1317092049;
                    }
                    break;
                case -181766485:
                case 1195844537:
                    if (C1005.m3501()) {
                        iM6981 = (C2105.m6981("ۖ۬") + i3) * 43;
                        i4 = ((iM6981 ^ i2) * 32629) ^ (-1028514866);
                        i5 = -1158610355;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܽܺ")) * 85;
                        i4 = ((iM6981 ^ i3) * (-19653)) ^ 1346136916;
                        i5 = -222748995;
                    }
                    break;
                case 9856908:
                case 2011847011:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (i2 - C2105.m6981("ܽܺ")) * 85;
                        i4 = ((iM6981 ^ i3) * (-19653)) ^ 1346136916;
                        i5 = -222748995;
                    } else {
                        iM6981 = C2105.m6981("ۚۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-9123)) ^ 442852035;
                        i5 = 1423903449;
                    }
                    break;
                case 1193501848:
                case 1329548652:
                    if (C4616.m13552() != 0) {
                        iM6981 = C2105.m6981("ۙ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32091) ^ (-1385779641);
                        i5 = -924345689;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۠᩸")) * 45;
                        i4 = ((iM6981 ^ i3) * 22389) ^ (-1010225901);
                        i5 = 193797540;
                    }
                    break;
                case 1367458203:
                case 1788977710:
                    AbstractActivityC3346 abstractActivityC3346 = viewOnClickListenerC3441.f10885;
                    byte[] bArr = viewOnClickListenerC3441.f10876;
                    if (!C0382.f1805) {
                        iM6981 = C2105.m6981("ܰ֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * 1397) ^ 1474566531;
                        i5 = -2137429546;
                    } else {
                        C21786 c21786 = new C21786(viewOnClickListenerC3441);
                        if (C11340.f33930 < 0) {
                            C1005.m3499(new Thread(new RunnableC2904(bArr, str, str2, abstractActivityC3346, c21786)));
                        }
                        iM6981 = (i2 - C2105.m6981("ܽܺ")) * 85;
                        i4 = ((iM6981 ^ i3) * (-19653)) ^ 1346136916;
                        i5 = -222748995;
                    }
                    break;
                default:
                    if (C1294.f4556 >= 0) {
                        iM6981 = C2105.m6981("ۙ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32091) ^ (-1385779641);
                        i5 = -924345689;
                    } else {
                        iM6981 = C2105.m6981("ۢ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27833)) ^ 1062911497;
                        i5 = 1317092049;
                    }
                    break;
            }
            return;
        }
    }
}
