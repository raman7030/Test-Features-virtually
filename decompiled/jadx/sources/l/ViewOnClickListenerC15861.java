package l;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܺۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 517G */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC15861 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f49024;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f49025;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f49026;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49027;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49028;

    public /* synthetic */ ViewOnClickListenerC15861(Object obj, View view, TextView textView, TextView textView2, int i) {
        int i2 = -1058069865;
        int i3 = C5695.f17556;
        int i4 = C2520.f8000;
        this.f49027 = i;
        this.f49028 = obj;
        this.f49026 = view;
        this.f49025 = textView;
        this.f49024 = textView2;
        int iM6981 = C2105.m6981("ۖ֨") ^ i4;
        int i5 = ((iM6981 ^ i3) * (-31593)) ^ (-2021464047);
        int i6 = -1781462361;
        while (true) {
            i2 = (iM6981 ^ i6) ^ (i5 & (((i2 ^ i3) * (-1791)) >> 31));
            switch (i2) {
                case -1648092143:
                case -608557514:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("ܰۨ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-27687)) ^ (-1104663302);
                        i6 = 365615896;
                    } else {
                        iM6981 = (C2105.m6981("ܶ᩻") + i4) * 87;
                        i5 = ((iM6981 ^ i3) * (-627)) ^ 1485880691;
                        i6 = -1715540959;
                    }
                    break;
                case -1534933937:
                case 484288221:
                    return;
                case -1389890569:
                case 510991201:
                    if (C0630.m2564()) {
                        iM6981 = C2105.m6981("ۡۗ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 31467) ^ 482539738;
                        i6 = -1483070762;
                    } else {
                        iM6981 = C2105.m6981("᩸ۤ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-16673)) ^ (-1174737629);
                        i6 = -236339738;
                    }
                    break;
                case -320085986:
                case 1945526309:
                    ViewOnClickListenerC1958.m6429();
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (C0630.m2566("ܶܿ") ^ i3) * (-7);
                        i5 = ((iM6981 ^ i4) * (-21297)) ^ (-1122295090);
                        i6 = -1336707735;
                    } else {
                        iM6981 = C0630.m2566("ܰۨ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-27687)) ^ (-1104663302);
                        i6 = 365615896;
                    }
                    break;
                case 121929519:
                case 858449095:
                    C21923.m49329();
                    iM6981 = C0630.m2566("ܰۨ") ^ i4;
                    i5 = ((iM6981 ^ i3) * (-27687)) ^ (-1104663302);
                    i6 = 365615896;
                    break;
                case 742274708:
                case 2131631881:
                    if (C1420.f5096 > 0) {
                        iM6981 = (C0630.m2566("ܶܿ") ^ i3) * (-7);
                        i5 = ((iM6981 ^ i4) * (-21297)) ^ (-1122295090);
                        i6 = -1336707735;
                    } else {
                        iM6981 = C2105.m6981("֨ܳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 13879) ^ 1508361503;
                        i6 = 1895008973;
                    }
                    break;
                default:
                    C3019.m9255();
                    C3245.m9925();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01e1 A[PHI: r11 r12 r13 r14
      0x01e1: PHI (r11v5 android.widget.RadioButton) = (r11v2 android.widget.RadioButton), (r11v4 android.widget.RadioButton), (r11v2 android.widget.RadioButton) binds: [B:119:0x01e1, B:51:0x01df, B:47:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x01e1: PHI (r12v4 android.widget.TextView) = (r12v2 android.widget.TextView), (r12v3 android.widget.TextView), (r12v2 android.widget.TextView) binds: [B:119:0x01e1, B:51:0x01df, B:47:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x01e1: PHI (r13v3 android.widget.RadioButton) = (r13v2 android.widget.RadioButton), (r13v2 android.widget.RadioButton), (r13v5 android.widget.RadioButton) binds: [B:119:0x01e1, B:51:0x01df, B:47:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x01e1: PHI (r14v3 android.widget.TextView) = (r14v2 android.widget.TextView), (r14v2 android.widget.TextView), (r14v4 android.widget.TextView) binds: [B:119:0x01e1, B:51:0x01df, B:47:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x03ad A[PHI: r7 r10
      0x03ad: PHI (r7v16 android.widget.Spinner) = (r7v7 android.widget.Spinner), (r7v8 android.widget.Spinner), (r7v17 android.widget.Spinner) binds: [B:94:0x03ab, B:90:0x038d, B:13:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x03ad: PHI (r10v5 android.view.View) = (r10v2 android.view.View), (r10v2 android.view.View), (r10v6 android.view.View) binds: [B:94:0x03ab, B:90:0x038d, B:13:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0065, code lost:
    
        if (l.C1916.m6308() < 0) goto L10;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int iM6981;
        int i;
        int i2;
        Spinner spinner;
        int iM2566;
        int i3;
        C15155 c15155;
        int i4;
        View view2 = view;
        int i5 = C1420.f5096;
        int i6 = C3019.f9544;
        int iM6982 = (i6 - C2105.m6981("֫ܽ")) * (-101);
        int i7 = ((iM6982 ^ i5) * 8405) ^ 497596484;
        View view3 = null;
        Spinner spinner2 = null;
        TextView textView = null;
        EditText editText = null;
        RadioButton radioButton = null;
        int i8 = iM6982 ^ 2087557789;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        C15155 c15156 = null;
        int i9 = 1198546344;
        TextView textView2 = null;
        RadioButton radioButton2 = null;
        TextView textView3 = null;
        RadioButton radioButton3 = null;
        View view4 = null;
        RadioButton radioButton4 = null;
        TextView textView4 = null;
        while (true) {
            i9 = i8 ^ (i7 & (((i9 ^ i5) * 7565) >> 31));
            switch (i9) {
                case -2144835382:
                case 1233119586:
                    C2167.m7160(radioButton4, z2);
                    if (radioButton3 == view2) {
                        iM6981 = C2105.m6981("ܶܰ") ^ i5;
                        i = ((iM6981 ^ i6) * (-22677)) ^ 917441990;
                        i2 = 1602164067;
                    } else {
                        iM6981 = C0630.m2566("᩵ۤ") ^ i6;
                        i = ((iM6981 ^ i5) * 20963) ^ (-268573328);
                        i2 = -1381515343;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -2119528953:
                case 1949442826:
                    c15155 = c15156;
                    spinner = spinner2;
                    editText = (EditText) textView;
                    textView4 = this.f49024;
                    if (C4616.m13552() == 0) {
                        int iM6983 = (C2105.m6981("۟۬") ^ i5) * (-57);
                        i4 = ((iM6983 ^ i6) * (-2457)) ^ (-917006864);
                        i8 = iM6983 ^ 1699147061;
                        c15156 = c15155;
                        spinner2 = spinner;
                        i7 = i4;
                        view2 = view;
                    } else {
                        iM2566 = (i6 - C0630.m2566("᩻ܰ")) * q.h;
                        c15156 = c15155;
                        i7 = ((iM2566 ^ i5) * 8651) ^ 1802798598;
                        i3 = -385622926;
                        i8 = iM2566 ^ i3;
                        view2 = view;
                        spinner2 = spinner;
                    }
                    break;
                case -1942689356:
                case 207042041:
                    C15155 c15157 = c15156;
                    spinner2 = (Spinner) view3;
                    TextView textView5 = this.f49025;
                    if (RunnableC1937.f6483 < 0) {
                        int iM6984 = C2105.m6981("֡ۧ") ^ i5;
                        textView = textView5;
                        i4 = ((iM6984 ^ i6) * (-21287)) ^ (-2077063745);
                        i8 = iM6984 ^ 939019768;
                        c15156 = c15157;
                        i7 = i4;
                        view2 = view;
                    } else {
                        textView = textView5;
                        c15156 = c15157;
                        int iM6985 = C2105.m6981("ۤۜ") ^ i6;
                        i7 = ((iM6985 ^ i5) * 29727) ^ (-855286779);
                        i8 = iM6985 ^ (-358306661);
                        view2 = view;
                    }
                    break;
                case -1928132450:
                case -1864977240:
                    spinner = spinner2;
                    c15156 = (C15155) this.f49028;
                    if (C4075.f12947 < 0) {
                        iM2566 = (C2105.m6981("ܺ֡") ^ i6) * (-103);
                        i7 = ((iM2566 ^ i5) * (-2395)) ^ (-1857956253);
                        i3 = 1676991272;
                        i8 = iM2566 ^ i3;
                        view2 = view;
                        spinner2 = spinner;
                    } else {
                        spinner2 = spinner;
                        int iM6986 = C2105.m6981("ۤۜ") ^ i6;
                        i7 = ((iM6986 ^ i5) * 29727) ^ (-855286779);
                        i8 = iM6986 ^ (-358306661);
                        view2 = view;
                    }
                    break;
                case -1924986822:
                case -1661896365:
                    C15155.m35857(c15156, spinner2, editText, (EditText) textView4);
                    break;
                case -1887748854:
                case 1521980904:
                    view4 = this.f49026;
                    if (C4263.f13799 > 0) {
                        iM6981 = (i6 - C2105.m6981("᩺۠")) * (-73);
                        i = ((iM6981 ^ i5) * (-31519)) ^ (-1661462181);
                        i2 = -1405048780;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        spinner = spinner2;
                        iM2566 = (C0630.m2566("ۢۖ") + i5) * (-97);
                        i7 = ((iM2566 ^ i6) * (-31433)) ^ (-1621699669);
                        i3 = 1452122781;
                        i8 = iM2566 ^ i3;
                        view2 = view;
                        spinner2 = spinner;
                    }
                    break;
                case -1852111662:
                case 1511907003:
                    radioButton3 = (RadioButton) view4;
                    textView3 = this.f49025;
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("᩷ۚ") ^ i6;
                        i = ((iM6981 ^ i5) * 15759) ^ (-1748636878);
                        i2 = -1948057597;
                    } else {
                        iM6981 = (C0630.m2566("ۗܺ") ^ i6) * 95;
                        i = ((iM6981 ^ i5) * 17091) ^ 1292243625;
                        i2 = -1845674464;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1454285395:
                case -1273966593:
                    C0714.m2802(radioButton2, z);
                    if (radioButton == view2) {
                        iM6981 = C2105.m6981("ۜ᩵") ^ i5;
                        i = ((iM6981 ^ i6) * 32611) ^ (-452811358);
                        i2 = 110494392;
                    } else {
                        z3 = z5;
                        iM6981 = (i6 - C2105.m6981("᩷֫")) * 37;
                        i = ((iM6981 ^ i5) * 25123) ^ (-1673395288);
                        i2 = 827045679;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1377308349:
                case 1722432995:
                    C2167.m7160(radioButton, z3);
                    break;
                case -1133502127:
                case 593892364:
                    z2 = true;
                    iM6981 = C0630.m2566("᩹᩷") ^ i5;
                    i = ((iM6981 ^ i6) * (-22373)) ^ 129001846;
                    i2 = 179731944;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1088385459:
                case -796136369:
                    radioButton2 = (RadioButton) textView3;
                    textView2 = this.f49024;
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C0630.m2566("᩷ۚ") ^ i6;
                        i = ((iM6981 ^ i5) * 15759) ^ (-1748636878);
                        i2 = -1948057597;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ܳۤ")) * (-117);
                        i = ((iM6981 ^ i6) * (-17399)) ^ (-499382200);
                        i2 = -155119708;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -790934032:
                case 1072191688:
                    z = true;
                    iM6981 = (i5 - C0630.m2566("ۨۨ")) * 11;
                    i = ((iM6981 ^ i6) * 11229) ^ (-1972011218);
                    i2 = 1090301425;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -476628868:
                case 200497412:
                    z = false;
                    iM6981 = (i5 - C0630.m2566("ۨۨ")) * 11;
                    i = ((iM6981 ^ i6) * 11229) ^ (-1972011218);
                    i2 = 1090301425;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -279978083:
                case 133094674:
                    C7106.m19120();
                    C1420.m4913();
                    break;
                case -266184006:
                case 54173624:
                    spinner = spinner2;
                    switch (this.f49027) {
                        case 0:
                            iM2566 = (i5 - C2105.m6981("ۜۨ")) * 87;
                            i7 = ((iM2566 ^ i6) * (-31365)) ^ (-227414098);
                            i3 = -1720666608;
                            break;
                        default:
                            iM2566 = C0630.m2566("ۢᩳ") ^ i6;
                            i7 = ((iM2566 ^ i5) * 25995) ^ (-1124076978);
                            i3 = 356447592;
                            break;
                    }
                    i8 = iM2566 ^ i3;
                    view2 = view;
                    spinner2 = spinner;
                    break;
                case -227294075:
                case 60955028:
                    radioButton = (RadioButton) textView2;
                    z5 = false;
                    if (radioButton4 == view2) {
                        iM6981 = C2105.m6981("᩺ۤ") ^ i5;
                        i = ((iM6981 ^ i6) * 24881) ^ 1829075763;
                        i2 = -4603537;
                    } else {
                        iM6981 = (i6 - C2105.m6981("ۙܳ")) * 43;
                        i = ((iM6981 ^ i5) * (-20375)) ^ 1903848888;
                        i2 = -917699993;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -123759799:
                case 1916275520:
                    radioButton4 = (RadioButton) this.f49028;
                    if (C2520.m8026()) {
                        iM6981 = (C0630.m2566("᩺ۛ") ^ i5) * (-83);
                        i = ((iM6981 ^ i6) * 11291) ^ 1385861853;
                        i2 = 1957395570;
                    } else {
                        iM6981 = (C0630.m2566("ᩴۗ") ^ i5) * 11;
                        i = ((iM6981 ^ i6) * 30529) ^ (-125548337);
                        i2 = -1290066443;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -45267699:
                case 1689874956:
                    spinner = spinner2;
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C0630.m2566("ۢۖ") + i5) * (-97);
                        i7 = ((iM2566 ^ i6) * (-31433)) ^ (-1621699669);
                        i3 = 1452122781;
                    } else {
                        iM2566 = (C0630.m2566("ۛۗ") + i6) * 101;
                        i7 = ((iM2566 ^ i5) * (-18239)) ^ (-244367766);
                        i3 = -1037342396;
                    }
                    i8 = iM2566 ^ i3;
                    view2 = view;
                    spinner2 = spinner;
                    break;
                case 572639:
                case 1074072910:
                    z4 = false;
                    iM6981 = (C2105.m6981("۫᩸") + i6) * (-113);
                    i = ((iM6981 ^ i5) * (-6129)) ^ (-2102579405);
                    i2 = 164113153;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case 117831955:
                case 292175986:
                    if (C3537.f11231 < 0) {
                        iM6981 = (C0630.m2566("᩺ۛ") ^ i5) * (-83);
                        i = ((iM6981 ^ i6) * 11291) ^ 1385861853;
                        i2 = 1957395570;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        c15155 = c15156;
                        spinner = spinner2;
                        iM2566 = (i6 - C0630.m2566("᩻ܰ")) * q.h;
                        c15156 = c15155;
                        i7 = ((iM2566 ^ i5) * 8651) ^ 1802798598;
                        i3 = -385622926;
                        i8 = iM2566 ^ i3;
                        view2 = view;
                        spinner2 = spinner;
                    }
                    break;
                case 133805015:
                case 1074532419:
                    c15155 = c15156;
                    spinner = spinner2;
                    View view5 = this.f49026;
                    if (C21923.f70183 == 0) {
                        c15156 = c15155;
                        int iM6987 = (C2105.m6981("᩶ۛ") + i6) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        view3 = view5;
                        i8 = iM6987 ^ 1770919921;
                        i7 = ((iM6987 ^ i5) * (-27551)) ^ 1089074300;
                        spinner2 = spinner;
                        view2 = view;
                    } else {
                        view3 = view5;
                        iM2566 = (i6 - C0630.m2566("᩻ܰ")) * q.h;
                        c15156 = c15155;
                        i7 = ((iM2566 ^ i5) * 8651) ^ 1802798598;
                        i3 = -385622926;
                        i8 = iM2566 ^ i3;
                        view2 = view;
                        spinner2 = spinner;
                    }
                    break;
                case 311422834:
                case 1701181128:
                    C2167.m7160(radioButton3, z4);
                    if (radioButton2 == view2) {
                        iM6981 = (C2105.m6981("ۧܽ") + i6) * (-39);
                        i = ((iM6981 ^ i5) * (-1609)) ^ 833451766;
                        i2 = 479790278;
                    } else {
                        iM6981 = (C2105.m6981("ۧ֫") ^ i5) * 7;
                        i = ((iM6981 ^ i6) * (-14239)) ^ (-1468815912);
                        i2 = 957430060;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case 423821221:
                case 596095734:
                    RunnableC3474.m10630();
                    c15155 = c15156;
                    spinner = spinner2;
                    iM2566 = (i6 - C0630.m2566("᩻ܰ")) * q.h;
                    c15156 = c15155;
                    i7 = ((iM2566 ^ i5) * 8651) ^ 1802798598;
                    i3 = -385622926;
                    i8 = iM2566 ^ i3;
                    view2 = view;
                    spinner2 = spinner;
                    break;
                case 481634381:
                case 1597591361:
                    z4 = true;
                    iM6981 = (C2105.m6981("۫᩸") + i6) * (-113);
                    i = ((iM6981 ^ i5) * (-6129)) ^ (-2102579405);
                    i2 = 164113153;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case 538763451:
                case 548425653:
                    z2 = false;
                    iM6981 = C0630.m2566("᩹᩷") ^ i5;
                    i = ((iM6981 ^ i6) * (-22373)) ^ 129001846;
                    i2 = 179731944;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case 1138842455:
                case 2010534693:
                    spinner = spinner2;
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C0630.m2566("ۢۖ") + i5) * (-97);
                        i7 = ((iM2566 ^ i6) * (-31433)) ^ (-1621699669);
                        i3 = 1452122781;
                    } else {
                        iM2566 = C0630.m2566("᩺᩸") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-18387)) ^ (-100667437);
                        i3 = -1098591833;
                    }
                    i8 = iM2566 ^ i3;
                    view2 = view;
                    spinner2 = spinner;
                    break;
                case 1163671093:
                case 1190517184:
                    z3 = true;
                    iM6981 = (i6 - C2105.m6981("᩷֫")) * 37;
                    i = ((iM6981 ^ i5) * 25123) ^ (-1673395288);
                    i2 = 827045679;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case 1898394275:
                case 2024803333:
                    C7106.m19120();
                    if (C1916.m6308() >= 0) {
                        iM6981 = C0630.m2566("᩷ۚ") ^ i6;
                        i = ((iM6981 ^ i5) * 15759) ^ (-1748636878);
                        i2 = -1948057597;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        spinner = spinner2;
                        iM2566 = (C0630.m2566("ۢۖ") + i5) * (-97);
                        i7 = ((iM2566 ^ i6) * (-31433)) ^ (-1621699669);
                        i3 = 1452122781;
                        i8 = iM2566 ^ i3;
                        view2 = view;
                        spinner2 = spinner;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }
}
