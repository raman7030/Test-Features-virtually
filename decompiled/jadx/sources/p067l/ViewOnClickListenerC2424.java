package p067l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֡֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44LP */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC2424 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۛ */
    public static WeakReference f3724;

    /* JADX INFO: renamed from: ۡ᩷ۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f81822 = {3442, 23413, 23415, 23392, 23421, 23394, 23421, 23392, 23405, 2984, 6154, 6152, 6175, 6146, 6173, 6146, 6175, 6162, 26996, 31135, 26219, 18391, 26319, 18613, 6157, 6146, 6149, 6159, 6205, 6146, 6158, 6172, 6185, 6162, 6178, 6159, 6211, 6213, 6213, 6213, 6210, 25810, 24679, -28810, 18361, -27492, 25085, -28959, -27884, -31223, -25319, -30940, -32353, 24592, 18403, 17010, 32672, -26094, -25783, 18071, 17342, 28699, 668, 21815, 21813, 21794, 21823, 21792, 21823, 21794, 21807, 21795, 21797, 21811, 21796, 21769, 21816, 21815, 21819, 21811, 7436, 4399, 4386, 4414, 4390, 4399, 8549, -25353, -25376, -25354, -25360, -25367, -25359, -15813, 6914, -12611, 7703, -13806, 4782, 6735, -14014, -1134, -6278, -6643, -5155, -25383, -25375, -25426, -6663, 7257, 1196, -929, -6127, 7961, 1310, -4762, -3426, 1613, -914, 1144, -12954, -3104, 1440, -15923, 6673, 3385, 4716, 30379, 30392, 30379, 30368, 30394, 1432, -12178, -12189, -12161, -12185, -12178, 1366, 28443, 15779, -1633, 8546, 1253, -961, 14363, 5401, 2827, -2380, 15437, 16121, -1791, 28461, 6521, 5781, -2011, -4021, 15075, 3272, -6709, -1110, -60, 1155, 16215, 3804, -2650, 7121, 2160};

    /* JADX INFO: renamed from: ۤ */
    public static final C10748 f3725 = C10748.m24758();

    /* JADX INFO: renamed from: ۫ */
    public static final /* synthetic */ int f3726 = 0;

    /* JADX INFO: renamed from: ۗ */
    public final TextInputLayout f3727;

    /* JADX INFO: renamed from: ۙ */
    public boolean f3728;

    /* JADX INFO: renamed from: ۬ */
    public final TextInputLayout f3729;

    /* JADX INFO: renamed from: ᩶ */
    public final View f3730;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractActivityC5549 f3731;

    /* JADX INFO: renamed from: ᩹ */
    public final DialogInterfaceC2564 f3732;

    /* JADX WARN: Code duplicated, block: B:67:0x02a7 A[PHI: r16 r18
      0x02a7: PHI (r16v4 java.lang.ref.WeakReference) = 
      (r16v3 java.lang.ref.WeakReference)
      (r16v2 java.lang.ref.WeakReference)
      (r16v2 java.lang.ref.WeakReference)
      (r16v2 java.lang.ref.WeakReference)
     binds: [B:65:0x028f, B:55:0x021b, B:46:0x01cb, B:43:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r18v5 l.֡ۚۢ) = (r18v2 l.֡ۚۢ), (r18v4 l.֡ۚۢ), (r18v2 l.֡ۚۢ), (r18v2 l.֡ۚۢ) binds: [B:65:0x028f, B:55:0x021b, B:46:0x01cb, B:43:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02d5 A[PHI: r3 r15
      0x02d5: PHI (r3v85 l.֡ۚۢ) = (r3v7 l.֡ۚۢ), (r3v84 l.֡ۚۢ), (r3v7 l.֡ۚۢ), (r3v7 l.֡ۚۢ) binds: [B:69:0x02bf, B:62:0x0276, B:52:0x01fc, B:44:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r15v4 java.lang.ref.WeakReference) = 
      (r15v3 java.lang.ref.WeakReference)
      (r15v2 java.lang.ref.WeakReference)
      (r15v2 java.lang.ref.WeakReference)
      (r15v2 java.lang.ref.WeakReference)
     binds: [B:69:0x02bf, B:62:0x0276, B:52:0x01fc, B:44:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC2424(AbstractActivityC5549 abstractActivityC5549, String str, String str2, DialogInterface.OnCancelListener onCancelListener) {
        int i;
        short[] sArr;
        int i2;
        int i3;
        short[] sArr2;
        DialogInterfaceC2564 dialogInterfaceC2564;
        short[] sArr3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iM55680;
        int i8;
        int iM55681;
        int i9;
        int i10;
        int i11;
        int i12;
        String strM55810;
        int iM55979;
        int i13;
        short[] sArr4;
        int i14;
        int i15;
        String str3;
        short[] sArr5;
        DialogInterfaceC2564 dialogInterfaceC2565;
        String str4;
        int i16;
        int i17;
        int iM55682;
        int i18;
        DialogInterfaceC2564 dialogInterfaceC2566;
        short[] sArr6;
        int iM559710;
        int i19;
        int i20;
        int iM55683;
        int i21;
        int i22;
        final ViewOnClickListenerC2424 viewOnClickListenerC2424 = this;
        int i23 = 850901233;
        int i24 = RunnableC1014.f81941;
        int i25 = C1964.f83032;
        short s = f81822[9];
        int i26 = (s * 2) + 1;
        int i27 = s + 1;
        int i28 = i26 - (i27 * i27) > 0 ? 35890 : 6251;
        C1025.m56218(abstractActivityC5549, C0946.m55986(f81822, 10, 8, i28));
        int iM559711 = C0946.m55979("᩵᩸") ^ i24;
        TextInputLayout textInputLayout = null;
        EditText editTextM55882 = null;
        EditText editText = null;
        WeakReference weakReference = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        final View view = null;
        TextInputLayout textInputLayout2 = null;
        int iM559712 = 0;
        int iM559713 = 0;
        int i29 = 0;
        int iM55684 = 0;
        String str5 = null;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = ((iM559711 ^ i25) * (-25031)) ^ 1924442468;
        DialogInterfaceC2564 dialogInterfaceC2567 = null;
        int i36 = iM559711 ^ 1195862762;
        WeakReference weakReference2 = null;
        final DialogInterfaceC2564 dialogInterfaceC2568 = null;
        int iM559714 = 0;
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = null;
        int i37 = 0;
        while (true) {
            i23 = i36 ^ (i35 & (((i23 ^ i25) * 13503) >> 31));
            switch (i23) {
                case -2057041237:
                case -905641864:
                    C7050.m16226(C0866.m55656(textInputLayout2));
                    iM55683 = (C0946.m55979("ܳۙ") + i24) * (-79);
                    i21 = ((iM55683 ^ i25) * (-8617)) ^ (-2002290246);
                    i22 = 1402382319;
                    i36 = iM55683 ^ i22;
                    i35 = i21;
                    break;
                case -1975223927:
                case -737465554:
                    str5 = str5;
                    i30 = i30;
                    i = i32;
                    sArr = sArr7;
                    i2 = i33;
                    i3 = i34;
                    sArr2 = sArr9;
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    int i38 = i31;
                    sArr3 = sArr8;
                    i4 = i38;
                    View viewM56181 = C1017.m56181(abstractActivityC5549, iM559713);
                    int iM55685 = C0873.m55680(C0861.m55618(f81822, 21, 3, i28));
                    if (!C0892.f81851) {
                        view = viewM56181;
                        i29 = iM55685;
                        i31 = i4;
                        sArr8 = sArr3;
                        int iM55686 = (i24 - C0873.m55680("᩺᩺")) * (-11);
                        i33 = i2;
                        i34 = i3;
                        sArr7 = sArr;
                        i35 = ((iM55686 ^ i25) * 7853) ^ 1865639635;
                        i36 = iM55686 ^ 996485779;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i;
                        i30 = i30;
                        str5 = str5;
                    } else {
                        int iM55687 = C0873.m55680("ᩴۙ") ^ i24;
                        int i39 = ((iM55687 ^ i25) * 14439) ^ 783428845;
                        i36 = iM55687 ^ (-1875291162);
                        i33 = i2;
                        i34 = i3;
                        sArr7 = sArr;
                        i35 = i39;
                        view = viewM56181;
                        i29 = iM55685;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i;
                        i30 = i30;
                        str5 = str5;
                        short[] sArr10 = sArr3;
                        i31 = i4;
                        sArr8 = sArr10;
                    }
                    break;
                case -1973139348:
                case 1446471903:
                    C0882.m55722(textInputLayout);
                    C7050.m16226(C0866.m55656(textInputLayout));
                    return;
                case -1879956460:
                case 1535176754:
                    C1025.m56230();
                    throw new RuntimeException();
                case -1868119148:
                case 1451931283:
                    dialogInterfaceC2567 = (DialogInterfaceC2564) weakReference.get();
                    if (dialogInterfaceC2567 != null) {
                        iM55680 = (i25 - C0873.m55680("ۨ۫")) * (-11);
                        i35 = ((iM55680 ^ i24) * (-10067)) ^ (-1139407058);
                        i8 = -1875619669;
                    } else {
                        iM55680 = C0946.m55979("᩺ۤ") ^ i24;
                        i35 = ((iM55680 ^ i25) * (-13139)) ^ (-686681514);
                        i8 = 1316688161;
                    }
                    i36 = iM55680 ^ i8;
                    break;
                case -1680528340:
                case -844898186:
                    return;
                case -1571257765:
                case -261571646:
                    C1028.m56247();
                    if (C0949.f81897 < 0) {
                        sArr4 = sArr7;
                        i14 = i33;
                        i15 = i34;
                        short[] sArr11 = sArr9;
                        dialogInterfaceC2564 = dialogInterfaceC2568;
                        str3 = str5;
                        i30 = i30;
                        i = i32;
                        sArr2 = sArr11;
                        int i40 = i31;
                        sArr3 = sArr8;
                        i4 = i40;
                        int iM559715 = (C0946.m55979("ۗ᩷") + i25) * (-57);
                        str5 = str3;
                        i9 = ((iM559715 ^ i24) * (-21579)) ^ 791869806;
                        sArr7 = sArr4;
                        i33 = i14;
                        i34 = i15;
                        i36 = iM559715 ^ 206978245;
                        i35 = i9;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i;
                        i30 = i30;
                        str5 = str5;
                        short[] sArr12 = sArr3;
                        i31 = i4;
                        sArr8 = sArr12;
                    } else {
                        iM55680 = (C0873.m55680("ܿۡ") ^ i25) * (-59);
                        i35 = ((iM55680 ^ i24) * 21967) ^ (-947781277);
                        i8 = -1737769063;
                        i36 = iM55680 ^ i8;
                    }
                    break;
                case -1502268765:
                case 1740982439:
                    C1024.m56208(dialogInterfaceC2567);
                    iM55680 = C0946.m55979("᩺ۤ") ^ i24;
                    i35 = ((iM55680 ^ i25) * (-13139)) ^ (-686681514);
                    i8 = 1316688161;
                    i36 = iM55680 ^ i8;
                    break;
                case -1355002772:
                case 1065116619:
                    if (C0930.m55889(dialogInterfaceC2567)) {
                        iM55680 = (C0946.m55979("ۢۙ") ^ i24) * 75;
                        i35 = ((iM55680 ^ i25) * (-24019)) ^ 902243965;
                        i8 = -933863239;
                    } else {
                        iM55680 = C0946.m55979("᩺ۤ") ^ i24;
                        i35 = ((iM55680 ^ i25) * (-13139)) ^ (-686681514);
                        i8 = 1316688161;
                    }
                    i36 = iM55680 ^ i8;
                    break;
                case -1269689754:
                case 208166960:
                    if (AbstractC0942.f81890 > 0) {
                        i = i32;
                        sArr2 = sArr9;
                        dialogInterfaceC2564 = dialogInterfaceC2568;
                        int i41 = i31;
                        sArr3 = sArr8;
                        i4 = i41;
                        iM55681 = C0946.m55979("۟ۨ") ^ i25;
                        i9 = ((iM55681 ^ i24) * 2731) ^ 318718819;
                        i10 = 1097620547;
                        i36 = i10 ^ iM55681;
                        viewOnClickListenerC2424 = this;
                        i33 = i33;
                        i34 = i34;
                        sArr7 = sArr7;
                        i35 = i9;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i;
                        i30 = i30;
                        str5 = str5;
                        short[] sArr13 = sArr3;
                        i31 = i4;
                        sArr8 = sArr13;
                    } else {
                        iM55680 = C0946.m55979("ۙܳ") ^ i25;
                        i35 = ((iM55680 ^ i24) * 1763) ^ 1847083578;
                        i8 = 1851993515;
                        i36 = iM55680 ^ i8;
                    }
                    break;
                case -1138322364:
                case 1031477941:
                    dialogInterfaceC2566 = dialogInterfaceC2568;
                    C1048.m56304(C1404.m56465(view, C0873.m55680(C1071.m56336(f81822, 50, 3, i28)) ^ 2097336472), viewOnClickListenerC2424);
                    sArr6 = f81822;
                    i37 = 53;
                    i32 = 3;
                    if (C1048.f81963) {
                        iM559710 = C0946.m55979("۬ۡ") ^ i24;
                        i19 = ((iM559710 ^ i25) * 23447) ^ (-504120263);
                        i20 = -1225724103;
                    } else {
                        iM559710 = (C0946.m55979("۬֡") ^ i24) * (-91);
                        i19 = ((iM559710 ^ i25) * (-14495)) ^ (-1874031187);
                        i20 = 1791617422;
                    }
                    i36 = iM559710 ^ i20;
                    i35 = i19;
                    DialogInterfaceC2564 dialogInterfaceC2569 = dialogInterfaceC2566;
                    sArr9 = sArr6;
                    dialogInterfaceC2568 = dialogInterfaceC2569;
                    break;
                case -1030923377:
                case -752306393:
                    dialogInterfaceC2568 = (DialogInterfaceC2564) weakReference2.get();
                    if (dialogInterfaceC2568 != null) {
                        iM55680 = C0946.m55979("ۨۜ") ^ i24;
                        i35 = ((iM55680 ^ i25) * (-24181)) ^ (-655763747);
                        i8 = 590756135;
                    } else {
                        iM55680 = C0873.m55680("֫ۚ") ^ i24;
                        i35 = ((iM55680 ^ i25) * (-14619)) ^ (-1365901160);
                        i8 = -1288419812;
                    }
                    i36 = iM55680 ^ i8;
                    break;
                case -1026928893:
                case 1338288512:
                    sArr4 = sArr7;
                    i14 = i33;
                    i15 = i34;
                    short[] sArr14 = sArr9;
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    str3 = str5;
                    i30 = i30;
                    i = i32;
                    sArr2 = sArr14;
                    int i42 = i31;
                    sArr3 = sArr8;
                    i4 = i42;
                    View viewM56465 = C1404.m56465(view, C0873.m55680(C0927.m55863(sArr4, i14, i15, i28)) ^ 2129221338);
                    C1048.m56315(viewM56465, str3);
                    textInputLayout2 = (TextInputLayout) viewM56465;
                    if (C0861.m55626()) {
                        int iM559716 = (C0946.m55979("ۗ᩷") + i25) * (-57);
                        str5 = str3;
                        i9 = ((iM559716 ^ i24) * (-21579)) ^ 791869806;
                        sArr7 = sArr4;
                        i33 = i14;
                        i34 = i15;
                        i36 = iM559716 ^ 206978245;
                        i35 = i9;
                    } else {
                        str5 = str3;
                        int iM559717 = (C0946.m55979("֡᩸") ^ i25) * 31;
                        i33 = i14;
                        i34 = i15;
                        sArr7 = sArr4;
                        i35 = ((iM559717 ^ i24) * 26787) ^ 1502219507;
                        i36 = iM559717 ^ (-1225838029);
                    }
                    dialogInterfaceC2568 = dialogInterfaceC2564;
                    sArr9 = sArr2;
                    i32 = i;
                    i30 = i30;
                    str5 = str5;
                    short[] sArr15 = sArr3;
                    i31 = i4;
                    sArr8 = sArr15;
                    break;
                case -974589796:
                case 1620066912:
                    C0854.m55606(new Runnable() { // from class: l.֨ۘۡ
                        @Override // java.lang.Runnable
                        public final void run() {
                            DialogInterfaceC2564 dialogInterfaceC25610 = null;
                            int i43 = -826870719;
                            int i44 = C0877.f81843;
                            int i45 = C1003.f81929;
                            int iM55688 = C0873.m55680("֫ۚ") ^ i45;
                            int i46 = ((iM55688 ^ i44) * (-2485)) ^ 253959463;
                            int i47 = 1807263816;
                            while (true) {
                                i43 = ((((i43 ^ i44) * (-17489)) >> 31) & i46) ^ (iM55688 ^ i47);
                                switch (i43) {
                                    case -1985597821:
                                    case 783307882:
                                        if (C0854.f81826 != 0) {
                                            iM55688 = (i44 - C0946.m55979("֫ۜ")) * (-13);
                                            i46 = ((iM55688 ^ i45) * 31515) ^ (-4433984);
                                            i47 = 205613521;
                                        } else {
                                            iM55688 = C0946.m55979("ۛۤ") ^ i44;
                                            i46 = ((iM55688 ^ i45) * (-11091)) ^ 569518700;
                                            i47 = -1302806258;
                                        }
                                        break;
                                    case -1917395988:
                                    case -1660429313:
                                        C0894.m55769();
                                        if (C1194.f82045 == 0) {
                                            iM55688 = (i44 - C0946.m55979("֫ۜ")) * (-13);
                                            i46 = ((iM55688 ^ i45) * 31515) ^ (-4433984);
                                            i47 = 205613521;
                                        } else {
                                            iM55688 = (C0946.m55979("ܽۘ") + i45) * 73;
                                            i46 = ((iM55688 ^ i44) * 20917) ^ (-840440715);
                                            i47 = 2071121458;
                                        }
                                        break;
                                    case -1833632828:
                                    case 1508412156:
                                        if (C1028.m56247() >= 0) {
                                            iM55688 = C0946.m55979("᩸᩺") ^ i44;
                                            i46 = ((iM55688 ^ i45) * 32627) ^ (-381008410);
                                            i47 = -1322334645;
                                        } else {
                                            iM55688 = (i45 - C0946.m55979("᩹᩷")) * (-123);
                                            i46 = ((iM55688 ^ i44) * (-13977)) ^ (-1762786752);
                                            i47 = 1610210584;
                                        }
                                        break;
                                    case -1597172856:
                                    case 1250343622:
                                        if (AbstractC0942.f81890 <= 0) {
                                            iM55688 = C0946.m55979("᩸᩺") ^ i44;
                                            i46 = ((iM55688 ^ i45) * 32627) ^ (-381008410);
                                            i47 = -1322334645;
                                        } else {
                                            iM55688 = (i44 - C0873.m55680("۬۠")) * (-63);
                                            i46 = ((iM55688 ^ i45) * 11991) ^ 1067618936;
                                            i47 = -1291503213;
                                        }
                                        break;
                                    case -1347490999:
                                    case -1016981982:
                                        C1028.m56247();
                                        C1929.m56553();
                                        iM55688 = C0873.m55680("֫ܺ") ^ i44;
                                        i46 = ((iM55688 ^ i45) * (-6637)) ^ (-1310094709);
                                        i47 = -240817463;
                                        break;
                                    case -1275746462:
                                    case 1697458423:
                                        if (C1964.m56597() != 0) {
                                            iM55688 = (i44 - C0946.m55979("֫ۜ")) * (-13);
                                            i46 = ((iM55688 ^ i45) * 31515) ^ (-4433984);
                                            i47 = 205613521;
                                        } else {
                                            iM55688 = (C0873.m55680("᩺᩶") ^ i44) * (-31);
                                            i46 = ((iM55688 ^ i45) * 13065) ^ 945581705;
                                            i47 = 1450527429;
                                        }
                                        break;
                                    case -901408715:
                                    case 1280240177:
                                        C0890.m55740();
                                        if (C1071.f81975 <= 0) {
                                            iM55688 = (C0946.m55979("ܽۘ") + i45) * 73;
                                            i46 = ((iM55688 ^ i44) * 20917) ^ (-840440715);
                                            i47 = 2071121458;
                                        } else {
                                            iM55688 = C0873.m55680("֫ܺ") ^ i44;
                                            i46 = ((iM55688 ^ i45) * (-6637)) ^ (-1310094709);
                                            i47 = -240817463;
                                        }
                                        break;
                                    case -640881323:
                                    case 1236937722:
                                        if (C0866.m55648(dialogInterfaceC25610)) {
                                            iM55688 = C0873.m55680("۫ۙ") ^ i44;
                                            i46 = ((iM55688 ^ i45) * 18769) ^ (-540579779);
                                            i47 = 1632408343;
                                        } else {
                                            iM55688 = (C0873.m55680("᩺᩻") ^ i45) * (-25);
                                            i46 = ((iM55688 ^ i44) * (-16823)) ^ (-981166304);
                                            i47 = -871995452;
                                        }
                                        break;
                                    case -479097350:
                                    case 1008140410:
                                        if (C0937.f81884) {
                                            iM55688 = (i44 - C0873.m55680("֫᩵")) * (-117);
                                            i46 = ((iM55688 ^ i45) * 19129) ^ 728718881;
                                            i47 = -802523447;
                                        } else {
                                            iM55688 = (i44 - C0946.m55979("֫ۜ")) * (-13);
                                            i46 = ((iM55688 ^ i45) * 31515) ^ (-4433984);
                                            i47 = 205613521;
                                        }
                                        break;
                                    case -284994492:
                                    case 544475346:
                                        C0917.m55847(dialogInterfaceC25610);
                                        iM55688 = (C0873.m55680("᩺᩻") ^ i45) * (-25);
                                        i46 = ((iM55688 ^ i44) * (-16823)) ^ (-981166304);
                                        i47 = -871995452;
                                        break;
                                    case -46149666:
                                    case 2146092603:
                                        RunnableC0897.m55784();
                                        C1046.m56302();
                                        break;
                                    case 141187766:
                                    case 1237403311:
                                        dialogInterfaceC25610 = dialogInterfaceC2568;
                                        if (C0873.f81841 <= 0) {
                                            iM55688 = (C0873.m55680("᩻ۛ") + i45) * (-85);
                                            i46 = ((iM55688 ^ i44) * 27739) ^ 1894855348;
                                            i47 = 18093396;
                                        } else {
                                            iM55688 = (C0873.m55680("᩷᩹") + i44) * (-107);
                                            i46 = ((iM55688 ^ i45) * (-20943)) ^ (-1955411970);
                                            i47 = -876150651;
                                        }
                                        break;
                                    case 146091023:
                                    case 644595326:
                                        if (C1017.f81942 >= 0) {
                                            iM55688 = C0946.m55979("᩸᩺") ^ i44;
                                            i46 = ((iM55688 ^ i45) * 32627) ^ (-381008410);
                                            i47 = -1322334645;
                                        } else {
                                            iM55688 = C0946.m55979("ۤ۠") ^ i45;
                                            i46 = ((iM55688 ^ i44) * (-29851)) ^ 286889411;
                                            i47 = 1761558226;
                                        }
                                        break;
                                    case 251848067:
                                    case 1212751342:
                                        if (AbstractC0942.f81890 <= 0) {
                                            iM55688 = (C0946.m55979("ܽۘ") + i45) * 73;
                                            i46 = ((iM55688 ^ i44) * 20917) ^ (-840440715);
                                            i47 = 2071121458;
                                        } else {
                                            iM55688 = C0873.m55680("ۢ᩸") ^ i45;
                                            i46 = ((iM55688 ^ i44) * 24833) ^ (-1870390908);
                                            i47 = -8427861;
                                        }
                                        break;
                                    case 639566648:
                                    case 2102096008:
                                        if (C1036.f81953 >= 0) {
                                            iM55688 = C0946.m55979("᩸᩺") ^ i44;
                                            i46 = ((iM55688 ^ i45) * 32627) ^ (-381008410);
                                            i47 = -1322334645;
                                        } else {
                                            iM55688 = (C0873.m55680("۠֫") ^ i45) * (-23);
                                            i46 = ((iM55688 ^ i44) * C0254q.f1218h) ^ 1606616415;
                                            i47 = -1048642267;
                                        }
                                        break;
                                    case 1063424852:
                                    case 2074854343:
                                        C0992.m56107();
                                        if (ViewOnClickListenerC0939.f81888 > 0) {
                                            iM55688 = (C0873.m55680("᩻ۛ") + i45) * (-85);
                                            i46 = ((iM55688 ^ i44) * 27739) ^ 1894855348;
                                            i47 = 18093396;
                                        } else {
                                            iM55688 = (C0946.m55979("ܽۘ") + i45) * 73;
                                            i46 = ((iM55688 ^ i44) * 20917) ^ (-840440715);
                                            i47 = 2071121458;
                                        }
                                        break;
                                    case 1760829033:
                                    case 1846926139:
                                        break;
                                    default:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM55688 = (C0873.m55680("᩻ۛ") + i45) * (-85);
                                            i46 = ((iM55688 ^ i44) * 27739) ^ 1894855348;
                                            i47 = 18093396;
                                        } else {
                                            iM55688 = C0873.m55680("᩺᩵") ^ i45;
                                            i46 = ((iM55688 ^ i44) * (-11443)) ^ (-1371093533);
                                            i47 = -1852854223;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    iM55680 = C0873.m55680("֫ۚ") ^ i24;
                    i35 = ((iM55680 ^ i25) * (-14619)) ^ (-1365901160);
                    i8 = -1288419812;
                    i36 = iM55680 ^ i8;
                    break;
                case -757187266:
                case 2042101251:
                    weakReference = f3724;
                    if (weakReference != null) {
                        iM55680 = (i25 - C0946.m55979("۬ᩴ")) * 67;
                        i35 = ((iM55680 ^ i24) * 6155) ^ (-1301035821);
                        i8 = -1970439227;
                    } else {
                        iM55680 = C0946.m55979("᩺ۤ") ^ i24;
                        i35 = ((iM55680 ^ i25) * (-13139)) ^ (-686681514);
                        i8 = 1316688161;
                    }
                    i36 = iM55680 ^ i8;
                    break;
                case -686096415:
                case -89500139:
                    short[] sArr16 = sArr9;
                    i6 = i32;
                    C0947.m55996(C1404.m56465(view, C0873.m55680(C0866.m55652(sArr16, i37, i6, i28)) ^ 2128228840), viewOnClickListenerC2424);
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    sArr2 = sArr16;
                    iM559714 = C0946.m55979(C1044.m56276(f81822, 56, 3, i28)) ^ 2124410900;
                    if (!C0937.f81884) {
                        i = i6;
                        int i43 = i31;
                        sArr3 = sArr8;
                        i4 = i43;
                        iM55681 = C0946.m55979("۟ۨ") ^ i25;
                        i9 = ((iM55681 ^ i24) * 2731) ^ 318718819;
                        i10 = 1097620547;
                        i36 = i10 ^ iM55681;
                        viewOnClickListenerC2424 = this;
                        i33 = i33;
                        i34 = i34;
                        sArr7 = sArr7;
                        i35 = i9;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i;
                        i30 = i30;
                        str5 = str5;
                        short[] sArr17 = sArr3;
                        i31 = i4;
                        sArr8 = sArr17;
                    } else {
                        int iM55688 = C0873.m55680("۫֫") ^ i25;
                        int i44 = ((iM55688 ^ i24) * (-19061)) ^ (-1905938990);
                        i7 = iM55688 ^ 124232854;
                        i35 = i44;
                        i36 = i7;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i6;
                    }
                    break;
                case -661254394:
                case 2116805061:
                    if (!f3725.m24761()) {
                        iM55683 = (C0946.m55979("ܳۙ") + i24) * (-79);
                        i21 = ((iM55683 ^ i25) * (-8617)) ^ (-2002290246);
                        i22 = 1402382319;
                        i36 = iM55683 ^ i22;
                        i35 = i21;
                    } else {
                        iM55680 = C0873.m55680("֫ۗ") ^ i25;
                        i35 = ((iM55680 ^ i24) * 19703) ^ (-1266708513);
                        i8 = 1979475459;
                        i36 = iM55680 ^ i8;
                    }
                    break;
                case -649100357:
                case -531690795:
                    ViewOnClickListenerC0939.m55945(C1404.m56465(view, iM559714), 0.8f);
                    C0906.m55807(C1404.m56465(view, iM559712), 0.8f);
                    iM55683 = C0873.m55680("ܿ᩵") ^ i25;
                    i21 = ((iM55683 ^ i24) * (-975)) ^ (-917581198);
                    i22 = 792813788;
                    i36 = iM55683 ^ i22;
                    i35 = i21;
                    break;
                case -619436707:
                case 1121724542:
                    if (C0930.m55889(dialogInterfaceC2568)) {
                        iM55680 = C0946.m55979("ܳۤ") ^ i24;
                        i35 = ((iM55680 ^ i25) * (-18167)) ^ (-842691157);
                        i8 = -1543316704;
                    } else {
                        iM55680 = C0873.m55680("֫ۚ") ^ i24;
                        i35 = ((iM55680 ^ i25) * (-14619)) ^ (-1365901160);
                        i8 = -1288419812;
                    }
                    i36 = iM55680 ^ i8;
                    break;
                case -560977396:
                case -410442009:
                    i6 = i32;
                    sArr2 = sArr9;
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    EditText editText2 = editText;
                    editText2.setOnKeyListener(new View.OnKeyListener(viewOnClickListenerC2424) { // from class: l.᩷֡ۡ

                        /* JADX INFO: renamed from: ۖۤ۫, reason: not valid java name and contains not printable characters */
                        private static final short[] f82980 = {1287, -20552, -32246, 24871, -7772, -7765, -7764, -7770, -7788, -7765, -7769, -7755, -7808, -7749, -7797, -7770, -7702, -7700, -7700, -7700, -7701};

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ ViewOnClickListenerC2424 f68805;

                        {
                            int i45 = -2110629755;
                            int i46 = ServiceConnectionC1013.f81940;
                            int i47 = C1404.f82149;
                            int iM55689 = C0873.m55680("ۢ᩵") ^ i46;
                            int i48 = ((iM55689 ^ i47) * 17981) ^ 339770470;
                            int i49 = -113195477;
                            while (true) {
                                i45 = ((((i45 ^ i47) * 30267) >> 31) & i48) ^ (iM55689 ^ i49);
                                switch (i45) {
                                    case -1961960487:
                                    case -364600344:
                                        if (C0967.m56074()) {
                                            iM55689 = C0873.m55680("֡ۚ") ^ i47;
                                            i48 = ((iM55689 ^ i46) * 11765) ^ (-2039897449);
                                            i49 = -1157810154;
                                        } else {
                                            iM55689 = C0946.m55979("᩷۠") ^ i47;
                                            i48 = ((iM55689 ^ i46) * (-2513)) ^ (-1132483580);
                                            i49 = -1145064049;
                                        }
                                        break;
                                    case -1948100569:
                                    case 908342737:
                                        C0882.m55710();
                                        throw new RuntimeException();
                                    case -1713059988:
                                    case 1781302094:
                                        if (C0937.f81884) {
                                            iM55689 = (i46 - C0946.m55979("ۜ᩷")) * (-55);
                                            i48 = ((iM55689 ^ i47) * 5559) ^ (-80464634);
                                            i49 = -56033195;
                                        } else {
                                            iM55689 = (i46 - C0946.m55979("ܺۡ")) * 91;
                                            i48 = ((iM55689 ^ i47) * 24931) ^ 2010513595;
                                            i49 = 234233698;
                                        }
                                        break;
                                    case -1712200792:
                                    case -175685614:
                                        if (C1036.f81953 >= 0) {
                                            iM55689 = C0946.m55979("ۖۛ") ^ i47;
                                            i48 = ((iM55689 ^ i46) * 16395) ^ (-1403680565);
                                            i49 = -2111849911;
                                        } else {
                                            iM55689 = C0946.m55979("ۛܺ") ^ i47;
                                            i48 = ((iM55689 ^ i46) * (-1843)) ^ 1212580039;
                                            i49 = -1962868058;
                                        }
                                        break;
                                    case -1452458495:
                                    case 324138194:
                                        if (!C0892.f81851) {
                                            iM55689 = (i46 - C0946.m55979("ܺۡ")) * 91;
                                            i48 = ((iM55689 ^ i47) * 24931) ^ 2010513595;
                                            i49 = 234233698;
                                        } else {
                                            iM55689 = C0873.m55680("֡ۚ") ^ i47;
                                            i48 = ((iM55689 ^ i46) * 11765) ^ (-2039897449);
                                            i49 = -1157810154;
                                        }
                                        break;
                                    case -1260344588:
                                    case 1410456851:
                                        return;
                                    case -1257669128:
                                    case -819798661:
                                        if (C0861.m55626()) {
                                            iM55689 = C0873.m55680("֡ۚ") ^ i47;
                                            i48 = ((iM55689 ^ i46) * 11765) ^ (-2039897449);
                                            i49 = -1157810154;
                                        } else {
                                            iM55689 = C0946.m55979("ۡ᩶") ^ i47;
                                            i48 = ((iM55689 ^ i46) * (-23289)) ^ 800906001;
                                            i49 = 1688115710;
                                        }
                                        break;
                                    case -1210310283:
                                    case 1596718629:
                                        if (C1071.f81975 <= 0) {
                                            iM55689 = C0873.m55680("۟ۚ") ^ i46;
                                            i48 = ((iM55689 ^ i47) * 27511) ^ 1811765474;
                                            i49 = -5842311;
                                        } else {
                                            iM55689 = (i47 - C0873.m55680("ܺۜ")) * (-119);
                                            i48 = ((iM55689 ^ i46) * 27119) ^ 2003312549;
                                            i49 = 361764011;
                                        }
                                        break;
                                    case -1078177539:
                                    case 1859627635:
                                        C0906.m55809();
                                        iM55689 = (i46 - C0946.m55979("ܺۡ")) * 91;
                                        i48 = ((iM55689 ^ i47) * 24931) ^ 2010513595;
                                        i49 = 234233698;
                                        break;
                                    case -174377438:
                                    case 1967325825:
                                        if (C0906.f81862 >= 0) {
                                            iM55689 = C0946.m55979("ᩴۢ") ^ i46;
                                            i48 = ((iM55689 ^ i47) * (-1557)) ^ 129890213;
                                            i49 = -1881266163;
                                        } else {
                                            iM55689 = (i46 - C0873.m55680("ۖ۫")) * (-55);
                                            i48 = ((iM55689 ^ i47) * (-23495)) ^ (-1046674128);
                                            i49 = 1123587488;
                                        }
                                        break;
                                    case 174491661:
                                    case 364371080:
                                        this.f68805 = viewOnClickListenerC2424;
                                        if (C0947.f81895) {
                                            iM55689 = C0946.m55979("ۖۛ") ^ i47;
                                            i48 = ((iM55689 ^ i46) * 16395) ^ (-1403680565);
                                            i49 = -2111849911;
                                        } else {
                                            iM55689 = (C0946.m55979("ۗۛ") ^ i46) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i48 = ((iM55689 ^ i47) * 9589) ^ (-1684115485);
                                            i49 = -999145561;
                                        }
                                        break;
                                    case 860311410:
                                    case 1114522974:
                                        if (C1017.f81942 >= 0) {
                                            iM55689 = (i46 - C0946.m55979("ܺۡ")) * 91;
                                            i48 = ((iM55689 ^ i47) * 24931) ^ 2010513595;
                                            i49 = 234233698;
                                        } else {
                                            iM55689 = (C0873.m55680("۟᩶") + i46) * 109;
                                            i48 = ((iM55689 ^ i47) * 29765) ^ 1117863801;
                                            i49 = 2080937459;
                                        }
                                        break;
                                    case 1237406360:
                                    case 1446332336:
                                        if (C0890.f81849 != 0) {
                                            iM55689 = C0873.m55680("۟ۚ") ^ i46;
                                            i48 = ((iM55689 ^ i47) * 27511) ^ 1811765474;
                                            i49 = -5842311;
                                        } else {
                                            iM55689 = (i46 - C0946.m55979("ܺۡ")) * 91;
                                            i48 = ((iM55689 ^ i47) * 24931) ^ 2010513595;
                                            i49 = 234233698;
                                        }
                                        break;
                                    case 1663756179:
                                    case 2027163264:
                                        C1046.m56302();
                                        if (C0894.f81854 >= 0) {
                                            iM55689 = C0946.m55979("ۖۛ") ^ i47;
                                            i48 = ((iM55689 ^ i46) * 16395) ^ (-1403680565);
                                            i49 = -2111849911;
                                        } else {
                                            iM55689 = C0873.m55680("۟ۚ") ^ i46;
                                            i48 = ((iM55689 ^ i47) * 27511) ^ 1811765474;
                                            i49 = -5842311;
                                        }
                                        break;
                                    case 1748733973:
                                    case 1872144890:
                                        if (C0946.f81894 != 0) {
                                            iM55689 = C0873.m55680("֡ۚ") ^ i47;
                                            i48 = ((iM55689 ^ i46) * 11765) ^ (-2039897449);
                                            i49 = -1157810154;
                                        } else {
                                            iM55689 = C0873.m55680("᩻᩶") ^ i46;
                                            i48 = ((iM55689 ^ i47) * 3895) ^ 841028317;
                                            i49 = -1365573771;
                                        }
                                        break;
                                    default:
                                        if (C0873.f81841 <= 0) {
                                            iM55689 = C0873.m55680("۟ۚ") ^ i46;
                                            i48 = ((iM55689 ^ i47) * 27511) ^ 1811765474;
                                            i49 = -5842311;
                                        } else {
                                            iM55689 = C0946.m55979("᩺ۛ") ^ i47;
                                            i48 = ((iM55689 ^ i46) * 21949) ^ (-201973541);
                                            i49 = 1305336817;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:53:0x01b3  */
                        /* JADX WARN: Code duplicated, block: B:82:0x02e9 A[PHI: r3 r4 r11 r13 r14 r15 r17
                          0x02e9: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v4 int) binds: [B:81:0x02e7, B:6:0x0056, B:115:0x02e9, B:114:0x02e9, B:112:0x02e9] A[DONT_GENERATE, DONT_INLINE]
                          0x02e9: PHI (r4v3 android.view.View) = 
                          (r4v2 android.view.View)
                          (r4v2 android.view.View)
                          (r4v2 android.view.View)
                          (r4v2 android.view.View)
                          (r4v4 android.view.View)
                         binds: [B:81:0x02e7, B:6:0x0056, B:115:0x02e9, B:114:0x02e9, B:112:0x02e9] A[DONT_GENERATE, DONT_INLINE]
                          0x02e9: PHI (r11v4 short) = (r11v2 short), (r11v2 short), (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:81:0x02e7, B:6:0x0056, B:115:0x02e9, B:114:0x02e9, B:112:0x02e9] A[DONT_GENERATE, DONT_INLINE]
                          0x02e9: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:81:0x02e7, B:6:0x0056, B:115:0x02e9, B:114:0x02e9, B:112:0x02e9] A[DONT_GENERATE, DONT_INLINE]
                          0x02e9: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:81:0x02e7, B:6:0x0056, B:115:0x02e9, B:114:0x02e9, B:112:0x02e9] A[DONT_GENERATE, DONT_INLINE]
                          0x02e9: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:81:0x02e7, B:6:0x0056, B:115:0x02e9, B:114:0x02e9, B:112:0x02e9] A[DONT_GENERATE, DONT_INLINE]
                          0x02e9: PHI (r17v4 int) = (r17v2 int), (r17v2 int), (r17v3 int), (r17v2 int), (r17v2 int) binds: [B:81:0x02e7, B:6:0x0056, B:115:0x02e9, B:114:0x02e9, B:112:0x02e9] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
                        
                            if (p067l.C1025.f81947 < 0) goto L10;
                         */
                        @Override // android.view.View.OnKeyListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final boolean onKey(View view2, int i45, KeyEvent keyEvent) {
                            int iM55689;
                            int i46;
                            int iM559718;
                            int i47;
                            int i48;
                            short[] sArr18;
                            ViewOnKeyListenerC21872 viewOnKeyListenerC21872 = this;
                            int i49 = -1032116630;
                            int i50 = C1012.f81938;
                            int i51 = C1229.f82066;
                            int iM556810 = C0873.m55680("ۖۨ") ^ i51;
                            int i52 = ((iM556810 ^ i50) * (-4033)) ^ (-611037150);
                            int i53 = iM556810 ^ 1215315426;
                            View viewM55755 = null;
                            short[] sArr19 = null;
                            short[] sArr20 = null;
                            short[] sArr21 = null;
                            int iM559719 = 0;
                            int i54 = 0;
                            int i55 = 0;
                            short s2 = 0;
                            int i56 = 0;
                            int i57 = 0;
                            int i58 = 0;
                            int i59 = 0;
                            int i60 = 0;
                            short s3 = 0;
                            View view3 = null;
                            int i61 = 0;
                            while (true) {
                                i49 = i53 ^ (i52 & (((i49 ^ i50) * (-11833)) >> 31));
                                switch (i49) {
                                    case -2147237314:
                                    case 1072720040:
                                        if (C1404.f82149 >= 0) {
                                            iM55689 = C0873.m55680("᩵ۗ") ^ i51;
                                            i52 = ((iM55689 ^ i50) * 13593) ^ 2001994411;
                                            i46 = -1264351840;
                                        } else {
                                            iM55689 = (C0873.m55680("᩸ۜ") + i51) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i52 = ((iM55689 ^ i50) * (-29975)) ^ (-651878234);
                                            i46 = 347793086;
                                        }
                                        i53 = iM55689 ^ i46;
                                        viewOnKeyListenerC21872 = this;
                                        break;
                                    case -2137418879:
                                    case 474892004:
                                        iM559719 = C0946.m55979(C1017.m56189(sArr20, i57, i58, i56));
                                        if (C1028.f81950 > 0) {
                                            iM559718 = C0946.m55979("ۤ֫") ^ i50;
                                            i47 = ((iM559718 ^ i51) * (-9139)) ^ 71552538;
                                            i48 = -637197746;
                                            i53 = iM559718 ^ i48;
                                            i52 = i47;
                                        } else {
                                            sArr18 = sArr19;
                                            int iM556811 = C0873.m55680("ۖ᩵") ^ i50;
                                            i53 = iM556811 ^ 391407936;
                                            sArr19 = sArr18;
                                            i52 = ((iM556811 ^ i51) * 4407) ^ 1861287502;
                                            viewOnKeyListenerC21872 = this;
                                        }
                                        break;
                                    case -2104576727:
                                    case 271332888:
                                        break;
                                    case -2064520254:
                                    case -756454904:
                                        i56 = 208;
                                        iM559718 = C0873.m55680("۫ᩳ") ^ i50;
                                        i47 = ((iM559718 ^ i51) * (-22601)) ^ 1866909680;
                                        i48 = -1916583072;
                                        i53 = iM559718 ^ i48;
                                        i52 = i47;
                                        break;
                                    case -1912578313:
                                    case 593898989:
                                        viewM55755 = C0892.m55755(view3, i61);
                                        sArr21 = f82980;
                                        i54 = 4;
                                        i55 = 17;
                                        if (C0854.m55595() < 0) {
                                            iM559718 = (C0946.m55979("ܶۚ") ^ i50) * (-29);
                                            i47 = ((iM559718 ^ i51) * 22189) ^ 1554501981;
                                            i48 = -1956803132;
                                            i53 = iM559718 ^ i48;
                                            i52 = i47;
                                        } else {
                                            iM55689 = C0873.m55680("᩵ۗ") ^ i51;
                                            i52 = ((iM55689 ^ i50) * 13593) ^ 2001994411;
                                            i46 = -1264351840;
                                            i53 = iM55689 ^ i46;
                                            viewOnKeyListenerC21872 = this;
                                        }
                                        break;
                                    case -1837328826:
                                    case 2057681719:
                                        s3 = sArr19[0];
                                        i59 = s3 * s3;
                                        if (C1028.m56247() < 0) {
                                            iM559718 = C0946.m55979("۠۠") ^ i50;
                                            i47 = ((iM559718 ^ i51) * 20981) ^ (-1916483586);
                                            i48 = 1789987053;
                                            i53 = iM559718 ^ i48;
                                            i52 = i47;
                                        } else {
                                            iM55689 = C0873.m55680("᩵ۗ") ^ i51;
                                            i52 = ((iM55689 ^ i50) * 13593) ^ 2001994411;
                                            i46 = -1264351840;
                                            i53 = iM55689 ^ i46;
                                            viewOnKeyListenerC21872 = this;
                                        }
                                        break;
                                    case -1692586385:
                                    case -934311796:
                                        if (keyEvent.getAction() == 0) {
                                            iM559718 = C0873.m55680("ᩴۨ") ^ i51;
                                            i47 = ((iM559718 ^ i50) * (-13685)) ^ (-1919725918);
                                            i48 = 760393799;
                                        } else {
                                            iM559718 = C0873.m55680("֡ܺ") ^ i50;
                                            i47 = ((iM559718 ^ i51) * (-25601)) ^ (-1578863200);
                                            i48 = -1362800992;
                                        }
                                        i53 = iM559718 ^ i48;
                                        i52 = i47;
                                        break;
                                    case -1667149836:
                                    case -599806081:
                                        sArr20 = f82980;
                                        i57 = 1;
                                        i58 = 3;
                                        if (!C1048.f81963) {
                                            iM55689 = C0946.m55979("ۜ᩻") ^ i51;
                                            i52 = ((iM55689 ^ i50) * 26815) ^ (-433806943);
                                            i46 = -1579410368;
                                            i53 = iM55689 ^ i46;
                                            viewOnKeyListenerC21872 = this;
                                        } else {
                                            iM559718 = (i50 - C0946.m55979("۠֡")) * (-19);
                                            i47 = ((iM559718 ^ i51) * (-28639)) ^ (-1750141447);
                                            i48 = -1815920961;
                                            i53 = iM559718 ^ i48;
                                            i52 = i47;
                                        }
                                        break;
                                    case -1636347552:
                                    case 1202854323:
                                        C0955.m56025();
                                        return false;
                                    case -1572807625:
                                    case -197695447:
                                        C0955.m56025();
                                        iM559718 = (i51 - C0946.m55979("ܶ᩺")) * 29;
                                        i47 = ((iM559718 ^ i50) * 31859) ^ 27912222;
                                        i48 = 1872240420;
                                        i53 = iM559718 ^ i48;
                                        i52 = i47;
                                        break;
                                    case -1256588544:
                                    case -542797883:
                                        int i62 = i59 + 177156100;
                                        i60 = i62 + i62;
                                        s2 = 13310;
                                        if (C0906.m55809() > 0) {
                                            iM559718 = C0873.m55680("ܿۚ") ^ i51;
                                            i47 = ((iM559718 ^ i50) * 7125) ^ 1621485613;
                                            i48 = -1156288687;
                                            i53 = iM559718 ^ i48;
                                            i52 = i47;
                                        } else {
                                            iM55689 = C0946.m55979("ۜ᩻") ^ i51;
                                            i52 = ((iM55689 ^ i50) * 26815) ^ (-433806943);
                                            i46 = -1579410368;
                                            i53 = iM55689 ^ i46;
                                            viewOnKeyListenerC21872 = this;
                                        }
                                        break;
                                    case -1139342031:
                                    case -735121744:
                                        C1053.m56327();
                                        if (C1012.f81938 >= 0) {
                                            sArr18 = sArr19;
                                            int iM556812 = C0873.m55680("ۖ᩵") ^ i50;
                                            i53 = iM556812 ^ 391407936;
                                            sArr19 = sArr18;
                                            i52 = ((iM556812 ^ i51) * 4407) ^ 1861287502;
                                            viewOnKeyListenerC21872 = this;
                                        } else {
                                            iM559718 = (i51 - C0946.m55979("ܶ᩺")) * 29;
                                            i47 = ((iM559718 ^ i50) * 31859) ^ 27912222;
                                            i48 = 1872240420;
                                            i53 = iM559718 ^ i48;
                                            i52 = i47;
                                        }
                                        break;
                                    case -839554858:
                                    case -109043081:
                                        if (C0894.f81854 >= 0) {
                                            iM55689 = C0946.m55979("ۜ᩻") ^ i51;
                                            i52 = ((iM55689 ^ i50) * 26815) ^ (-433806943);
                                            i46 = -1579410368;
                                        } else {
                                            iM55689 = C0873.m55680("ۗᩳ") ^ i50;
                                            i52 = ((iM55689 ^ i51) * 8463) ^ 69643915;
                                            i46 = 890730346;
                                        }
                                        i53 = iM55689 ^ i46;
                                        viewOnKeyListenerC21872 = this;
                                        break;
                                    case -381359560:
                                    case -11065518:
                                        sArr18 = f82980;
                                        if (C1071.f81975 > 0) {
                                            int iM559720 = C0946.m55979("ۙܰ") ^ i51;
                                            i47 = ((iM559720 ^ i50) * 479) ^ (-809211239);
                                            i53 = iM559720 ^ (-883579641);
                                            viewOnKeyListenerC21872 = this;
                                            sArr19 = sArr18;
                                            i52 = i47;
                                        } else {
                                            int iM556813 = C0873.m55680("ۖ᩵") ^ i50;
                                            i53 = iM556813 ^ 391407936;
                                            sArr19 = sArr18;
                                            i52 = ((iM556813 ^ i51) * 4407) ^ 1861287502;
                                            viewOnKeyListenerC21872 = this;
                                        }
                                        break;
                                    case -134544480:
                                    case 1808947802:
                                        C0947.m55988(viewM55755, C0873.m55689(sArr21, i54, i55, i56));
                                        viewOnKeyListenerC21872.f68805.onClick(viewM55755);
                                        iM559718 = C0873.m55680("֡ܺ") ^ i50;
                                        i47 = ((iM559718 ^ i51) * (-25601)) ^ (-1578863200);
                                        i48 = -1362800992;
                                        i53 = iM559718 ^ i48;
                                        i52 = i47;
                                        break;
                                    case 17467036:
                                    case 1755887186:
                                        i56 = 57794;
                                        iM559718 = C0873.m55680("۫ᩳ") ^ i50;
                                        i47 = ((iM559718 ^ i51) * (-22601)) ^ 1866909680;
                                        i48 = -1916583072;
                                        i53 = iM559718 ^ i48;
                                        i52 = i47;
                                        break;
                                    case 89160677:
                                    case 500875755:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM559718 = (i51 - C0946.m55979("ܶ᩺")) * 29;
                                            i47 = ((iM559718 ^ i50) * 31859) ^ 27912222;
                                            i48 = 1872240420;
                                        } else {
                                            iM559718 = C0873.m55680("֫ᩴ") ^ i50;
                                            i47 = ((iM559718 ^ i51) * (-24569)) ^ (-358750613);
                                            i48 = 151229488;
                                        }
                                        i53 = iM559718 ^ i48;
                                        i52 = i47;
                                        break;
                                    case 182734189:
                                    case 1083997412:
                                        int i63 = s3 + s2;
                                        if ((i63 * i63) - i60 <= 0) {
                                            iM559718 = C0946.m55979("᩹ۛ") ^ i51;
                                            i47 = ((iM559718 ^ i50) * 8861) ^ (-1346892649);
                                            i48 = -1325828007;
                                        } else {
                                            iM559718 = C0946.m55979("۬ۧ") ^ i50;
                                            i47 = ((iM559718 ^ i51) * 3801) ^ (-146836930);
                                            i48 = 837119377;
                                        }
                                        i53 = iM559718 ^ i48;
                                        i52 = i47;
                                        break;
                                    case 466722865:
                                    case 1674176955:
                                        return true;
                                    case 498684872:
                                    case 1938383292:
                                        if (i45 != 160) {
                                            iM559718 = C0873.m55680("۫ۨ") ^ i51;
                                            i47 = ((iM559718 ^ i50) * 22639) ^ (-2079193792);
                                            i48 = -280435138;
                                        } else {
                                            iM559718 = C0873.m55680("ۘᩳ") ^ i51;
                                            i47 = ((iM559718 ^ i50) * (-1445)) ^ 836552799;
                                            i48 = 2042602320;
                                        }
                                        i53 = iM559718 ^ i48;
                                        i52 = i47;
                                        break;
                                    case 901595443:
                                    case 1863426593:
                                        i61 = iM559719 ^ 2117676723;
                                        view3 = view;
                                        if (C1003.f81929 > 0) {
                                            iM559718 = (C0873.m55680("֫۠") ^ i51) * (-121);
                                            i47 = ((iM559718 ^ i50) * (-20383)) ^ (-108117556);
                                            i48 = -968922029;
                                            i53 = iM559718 ^ i48;
                                            i52 = i47;
                                        } else {
                                            iM55689 = C0946.m55979("ۜ᩻") ^ i51;
                                            i52 = ((iM55689 ^ i50) * 26815) ^ (-433806943);
                                            i46 = -1579410368;
                                            i53 = iM55689 ^ i46;
                                            viewOnKeyListenerC21872 = this;
                                        }
                                        break;
                                    case 953673888:
                                    case 1129266385:
                                        if (i45 != 66) {
                                            iM559718 = (i51 - C0873.m55680("֫ܳ")) * 29;
                                            i47 = ((iM559718 ^ i50) * (-3425)) ^ (-387928447);
                                            i48 = 898167563;
                                        } else {
                                            iM559718 = C0873.m55680("ۘᩳ") ^ i51;
                                            i47 = ((iM559718 ^ i50) * (-1445)) ^ 836552799;
                                            i48 = 2042602320;
                                        }
                                        i53 = iM559718 ^ i48;
                                        i52 = i47;
                                        break;
                                    case 1287170506:
                                    case 1589181988:
                                        return false;
                                    default:
                                        if (RunnableC0938.m55938() != 0) {
                                            iM55689 = C0946.m55979("ۜ᩻") ^ i51;
                                            i52 = ((iM55689 ^ i50) * 26815) ^ (-433806943);
                                            i46 = -1579410368;
                                        } else {
                                            iM55689 = C0873.m55680("֡۫") ^ i50;
                                            i52 = ((iM55689 ^ i51) * (-24819)) ^ (-581269717);
                                            i46 = 1245956368;
                                        }
                                        i53 = iM55689 ^ i46;
                                        viewOnKeyListenerC21872 = this;
                                        break;
                                }
                            }
                        }
                    });
                    C2641.m4029(textInputLayout2);
                    C2641.m4029(textInputLayout);
                    sArr8 = f81822;
                    i31 = 47;
                    i30 = 3;
                    if (C0854.f81826 == 0) {
                        int iM559718 = (C0946.m55979("ۜۛ") + i24) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i35 = ((iM559718 ^ i25) * (-3485)) ^ (-668441793);
                        i7 = iM559718 ^ 1354513936;
                        editText = editText2;
                        i36 = i7;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i6;
                    } else {
                        editText = editText2;
                        i = i6;
                        str5 = str5;
                        sArr = sArr7;
                        i2 = i33;
                        i3 = i34;
                        i30 = 3;
                        int iM55689 = (i24 - C0873.m55680("᩺᩺")) * (-11);
                        i33 = i2;
                        i34 = i3;
                        sArr7 = sArr;
                        i35 = ((iM55689 ^ i25) * 7853) ^ 1865639635;
                        i36 = iM55689 ^ 996485779;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i;
                        i30 = i30;
                        str5 = str5;
                    }
                    break;
                case -366597234:
                case -237984594:
                    i11 = i30;
                    i12 = i32;
                    sArr2 = sArr9;
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    int i45 = i31;
                    sArr3 = sArr8;
                    i4 = i45;
                    View viewM55755 = C0892.m55755(view, i29 ^ 2122122643);
                    strM55810 = C0906.m55810(f81822, 24, 17, i28);
                    C0947.m55988(viewM55755, strM55810);
                    viewOnClickListenerC2424.f3730 = viewM55755;
                    sArr7 = f81822;
                    i33 = 41;
                    i34 = 3;
                    if (C0955.m56025()) {
                        iM55979 = (i25 - C0873.m55680("ܽۛ")) * (-13);
                        i35 = ((iM55979 ^ i24) * 13829) ^ 1210847436;
                        i13 = 214211900;
                    } else {
                        iM55979 = C0946.m55979("ܽ۬") ^ i24;
                        i35 = ((iM55979 ^ i25) * 22351) ^ (-2117726772);
                        i13 = 774800226;
                    }
                    String str6 = strM55810;
                    i36 = iM55979 ^ i13;
                    dialogInterfaceC2568 = dialogInterfaceC2564;
                    sArr9 = sArr2;
                    i32 = i12;
                    i30 = i11;
                    str5 = str6;
                    short[] sArr18 = sArr3;
                    i31 = i4;
                    sArr8 = sArr18;
                    break;
                case -83273915:
                case 648997348:
                    str5 = str5;
                    i30 = i30;
                    i = i32;
                    sArr7 = sArr7;
                    i33 = i33;
                    i34 = i34;
                    sArr2 = sArr9;
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    int i46 = i31;
                    sArr3 = sArr8;
                    i4 = i46;
                    viewOnClickListenerC2424.f3731 = abstractActivityC5549;
                    iM559713 = C0946.m55979(RunnableC0938.m55936(f81822, 18, 3, i28)) ^ 2126118625;
                    if (C1017.m56187() <= 0) {
                        iM55681 = C0946.m55979("۟ۨ") ^ i25;
                        i9 = ((iM55681 ^ i24) * 2731) ^ 318718819;
                        i10 = 1097620547;
                    } else {
                        iM55681 = (C0873.m55680("᩺ۡ") + i25) * (-43);
                        i9 = ((iM55681 ^ i24) * 22355) ^ 690556298;
                        i10 = 643430908;
                    }
                    i36 = i10 ^ iM55681;
                    viewOnClickListenerC2424 = this;
                    i33 = i33;
                    i34 = i34;
                    sArr7 = sArr7;
                    i35 = i9;
                    dialogInterfaceC2568 = dialogInterfaceC2564;
                    sArr9 = sArr2;
                    i32 = i;
                    i30 = i30;
                    str5 = str5;
                    short[] sArr19 = sArr3;
                    i31 = i4;
                    sArr8 = sArr19;
                    break;
                case 78983317:
                case 1329658275:
                    C0861.m55626();
                    if (C0845.f81821 < 0) {
                        iM55680 = C0873.m55680("᩷֫") ^ i24;
                        i35 = ((iM55680 ^ i25) * (-685)) ^ 34593006;
                        i8 = 20062041;
                        i36 = iM55680 ^ i8;
                    } else {
                        str5 = str5;
                        i30 = i30;
                        i = i32;
                        sArr = sArr7;
                        i2 = i33;
                        i3 = i34;
                        sArr2 = sArr9;
                        dialogInterfaceC2564 = dialogInterfaceC2568;
                        int iM556810 = (i24 - C0873.m55680("᩺᩺")) * (-11);
                        i33 = i2;
                        i34 = i3;
                        sArr7 = sArr;
                        i35 = ((iM556810 ^ i25) * 7853) ^ 1865639635;
                        i36 = iM556810 ^ 996485779;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i;
                        i30 = i30;
                        str5 = str5;
                    }
                    break;
                case 202420540:
                case 1024256807:
                    if (C1036.f81953 < 0) {
                        short[] sArr20 = sArr9;
                        dialogInterfaceC2566 = dialogInterfaceC2568;
                        sArr6 = sArr20;
                        iM559710 = (C0946.m55979("۬֡") ^ i24) * (-91);
                        i19 = ((iM559710 ^ i25) * (-14495)) ^ (-1874031187);
                        i20 = 1791617422;
                        i36 = iM559710 ^ i20;
                        i35 = i19;
                        DialogInterfaceC2564 dialogInterfaceC25610 = dialogInterfaceC2566;
                        sArr9 = sArr6;
                        dialogInterfaceC2568 = dialogInterfaceC25610;
                    } else {
                        iM55680 = C0946.m55979("ۙܳ") ^ i25;
                        i35 = ((iM55680 ^ i24) * 1763) ^ 1847083578;
                        i8 = 1851993515;
                        i36 = iM55680 ^ i8;
                    }
                    break;
                case 303937437:
                case 1075828332:
                    weakReference2 = C12996.f36564;
                    if (weakReference2 != null) {
                        iM55680 = C0946.m55979("۬᩷") ^ i25;
                        i35 = ((iM55680 ^ i24) * (-29647)) ^ (-151449699);
                        i8 = -422887217;
                    } else {
                        iM55680 = C0873.m55680("֫ۚ") ^ i24;
                        i35 = ((iM55680 ^ i25) * (-14619)) ^ (-1365901160);
                        i8 = -1288419812;
                    }
                    i36 = iM55680 ^ i8;
                    break;
                case 446864681:
                case 585936771:
                    int i47 = DialogInterfaceC2564.f4230;
                    C20671 c20671 = new C20671(abstractActivityC5549);
                    C0882.m55725(c20671, view);
                    c20671.m46713(onCancelListener);
                    dialogInterfaceC2564M46709 = c20671.m46709();
                    viewOnClickListenerC2424.f3732 = dialogInterfaceC2564M46709;
                    if (RunnableC0938.m55924()) {
                        iM55683 = (C0946.m55979("ܳۙ") + i24) * (-79);
                        i21 = ((iM55683 ^ i25) * (-8617)) ^ (-2002290246);
                        i22 = 1402382319;
                    } else {
                        iM55683 = (i25 - C0946.m55979("ܺ֫")) * (-89);
                        i21 = ((iM55683 ^ i24) * 75) ^ 1504712754;
                        i22 = -1661699432;
                    }
                    i36 = iM55683 ^ i22;
                    i35 = i21;
                    break;
                case 449079207:
                case 1955561801:
                    if (C1071.f81975 > 0) {
                        short[] sArr21 = sArr9;
                        dialogInterfaceC2565 = dialogInterfaceC2568;
                        str4 = str5;
                        i16 = i30;
                        i17 = i32;
                        sArr5 = sArr21;
                        int i48 = i31;
                        sArr3 = sArr8;
                        i4 = i48;
                        iM55682 = (C0946.m55979("᩵ܿ") + i24) * (-115);
                        i35 = ((iM55682 ^ i25) * (-3279)) ^ 1240759749;
                        i18 = 591453956;
                        i36 = iM55682 ^ i18;
                        int i49 = i16;
                        str5 = str4;
                        dialogInterfaceC2568 = dialogInterfaceC2565;
                        sArr9 = sArr5;
                        i32 = i17;
                        i30 = i49;
                        short[] sArr110 = sArr3;
                        i31 = i4;
                        sArr8 = sArr110;
                    } else {
                        iM55680 = (C0873.m55680("ܿۡ") ^ i25) * (-59);
                        i35 = ((iM55680 ^ i24) * 21967) ^ (-947781277);
                        i8 = -1737769063;
                        i36 = iM55680 ^ i8;
                    }
                    break;
                case 558970287:
                case 937089442:
                    C0949.m56012();
                    if (C1024.f81946) {
                        iM55680 = C0946.m55979("ۙܳ") ^ i25;
                        i35 = ((iM55680 ^ i24) * 1763) ^ 1847083578;
                        i8 = 1851993515;
                    } else {
                        iM55680 = (C0873.m55680("ܿۡ") ^ i25) * (-59);
                        i35 = ((iM55680 ^ i24) * 21967) ^ (-947781277);
                        i8 = -1737769063;
                    }
                    i36 = iM55680 ^ i8;
                    break;
                case 798156582:
                case 1794543460:
                    dialogInterfaceC2564M46709.m3862();
                    f3724 = new WeakReference(dialogInterfaceC2564M46709);
                    if (RunnableC0938.m55935(editTextM55882) > 0) {
                        iM55680 = C0873.m55680("ۡܶ") ^ i25;
                        i35 = ((iM55680 ^ i24) * (-25613)) ^ (-232397134);
                        i8 = 1674883657;
                    } else {
                        iM55680 = (C0873.m55680("۫ܳ") + i24) * (-9);
                        i35 = ((iM55680 ^ i25) * 10315) ^ 517283699;
                        i8 = 1152645755;
                    }
                    i36 = iM55680 ^ i8;
                    break;
                case 813352543:
                case 2089346895:
                    int i50 = i32;
                    sArr5 = sArr9;
                    dialogInterfaceC2565 = dialogInterfaceC2568;
                    str4 = str5;
                    int i51 = i31;
                    sArr3 = sArr8;
                    i4 = i51;
                    viewOnClickListenerC2424.f3729 = textInputLayout2;
                    i16 = i30;
                    i17 = i50;
                    iM55684 = C0873.m55680(C0927.m55863(f81822, 44, 3, i28));
                    if (C1028.f81950 <= 0) {
                        iM55682 = (C0946.m55979("᩵ܿ") + i24) * (-115);
                        i35 = ((iM55682 ^ i25) * (-3279)) ^ 1240759749;
                        i18 = 591453956;
                    } else {
                        iM55682 = C0873.m55680("ᩴܶ") ^ i25;
                        i35 = ((iM55682 ^ i24) * (-11899)) ^ (-1495604473);
                        i18 = 2074769358;
                    }
                    i36 = iM55682 ^ i18;
                    int i410 = i16;
                    str5 = str4;
                    dialogInterfaceC2568 = dialogInterfaceC2565;
                    sArr9 = sArr5;
                    i32 = i17;
                    i30 = i410;
                    short[] sArr111 = sArr3;
                    i31 = i4;
                    sArr8 = sArr111;
                    break;
                case 847543893:
                case 1274260797:
                    C1048.m56304(C1404.m56465(view, iM559714), viewOnClickListenerC2424);
                    iM559712 = C0946.m55979(C0890.m55726(f81822, 59, 3, i28)) ^ 2121930738;
                    C1048.m56304(C1404.m56465(view, iM559712), viewOnClickListenerC2424);
                    if (C23223.m51768()) {
                        iM55683 = (C0873.m55680("᩷ܿ") + i24) * 55;
                        i21 = ((iM55683 ^ i25) * (-12139)) ^ (-194381490);
                        i22 = -747928840;
                    } else {
                        iM55683 = C0873.m55680("ܿ᩵") ^ i25;
                        i21 = ((iM55683 ^ i24) * (-975)) ^ (-917581198);
                        i22 = 792813788;
                    }
                    i36 = iM55683 ^ i22;
                    i35 = i21;
                    break;
                case 1226925536:
                case 1526880118:
                    C0917.m55854();
                    C1071.m56343();
                    iM55680 = C0946.m55979("ۙܳ") ^ i25;
                    i35 = ((iM55680 ^ i24) * 1763) ^ 1847083578;
                    i8 = 1851993515;
                    i36 = iM55680 ^ i8;
                    break;
                case 1313491567:
                case 1326197588:
                    int i52 = i30;
                    i5 = i32;
                    sArr2 = sArr9;
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    int i53 = i31;
                    sArr3 = sArr8;
                    i4 = i53;
                    View viewM56466 = C1404.m56465(view, iM55684 ^ 2121480963);
                    C0947.m55988(viewM56466, str5);
                    textInputLayout = (TextInputLayout) viewM56466;
                    viewOnClickListenerC2424.f3727 = textInputLayout;
                    editTextM55882 = C0930.m55882(textInputLayout2);
                    C0877.m55699(editTextM55882);
                    EditText editTextM55656 = C0866.m55656(textInputLayout);
                    C0949.m56008(editTextM55656);
                    RunnableC0938.m55928(editTextM55882, str);
                    C0894.m55771(editTextM55656, str2);
                    if (C1028.f81950 > 0) {
                        int iM556811 = (C0873.m55680("ۨۙ") ^ i24) * 91;
                        int i54 = ((iM556811 ^ i25) * (-10865)) ^ (-1316111758);
                        i36 = iM556811 ^ 700255571;
                        editText = editTextM55656;
                        i30 = i52;
                        i35 = i54;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i5;
                        short[] sArr112 = sArr3;
                        i31 = i4;
                        sArr8 = sArr112;
                    } else {
                        editText = editTextM55656;
                        i12 = i5;
                        strM55810 = str5;
                        i11 = i52;
                        iM55979 = (i25 - C0873.m55680("ܽۛ")) * (-13);
                        i35 = ((iM55979 ^ i24) * 13829) ^ 1210847436;
                        i13 = 214211900;
                        String str7 = strM55810;
                        i36 = iM55979 ^ i13;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i12;
                        i30 = i11;
                        str5 = str7;
                        short[] sArr113 = sArr3;
                        i31 = i4;
                        sArr8 = sArr113;
                    }
                    break;
                case 1625024736:
                case 2087453216:
                    if (!RunnableC1014.m56177()) {
                        str5 = str5;
                        i30 = i30;
                        i = i32;
                        sArr = sArr7;
                        i2 = i33;
                        i3 = i34;
                        sArr2 = sArr9;
                        dialogInterfaceC2564 = dialogInterfaceC2568;
                        int iM556812 = (i24 - C0873.m55680("᩺᩺")) * (-11);
                        i33 = i2;
                        i34 = i3;
                        sArr7 = sArr;
                        i35 = ((iM556812 ^ i25) * 7853) ^ 1865639635;
                        i36 = iM556812 ^ 996485779;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i;
                        i30 = i30;
                        str5 = str5;
                    } else {
                        short[] sArr22 = sArr9;
                        dialogInterfaceC2565 = dialogInterfaceC2568;
                        str4 = str5;
                        i16 = i30;
                        i17 = i32;
                        sArr5 = sArr22;
                        int i411 = i31;
                        sArr3 = sArr8;
                        i4 = i411;
                        iM55682 = (C0946.m55979("᩵ܿ") + i24) * (-115);
                        i35 = ((iM55682 ^ i25) * (-3279)) ^ 1240759749;
                        i18 = 591453956;
                        i36 = iM55682 ^ i18;
                        int i412 = i16;
                        str5 = str4;
                        dialogInterfaceC2568 = dialogInterfaceC2565;
                        sArr9 = sArr5;
                        i32 = i17;
                        i30 = i412;
                        short[] sArr114 = sArr3;
                        i31 = i4;
                        sArr8 = sArr114;
                    }
                    break;
                default:
                    int i55 = i30;
                    int i56 = i31;
                    i5 = i32;
                    sArr2 = sArr9;
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    short[] sArr23 = sArr8;
                    sArr3 = sArr23;
                    C0947.m55996(C1404.m56465(view, C0946.m55979(C0937.m55921(sArr23, i56, i55, i28)) ^ 2102172463), viewOnClickListenerC2424);
                    if (C0845.f81821 < 0) {
                        int iM556813 = C0873.m55680("ۚᩴ") ^ i25;
                        i4 = i56;
                        i30 = i55;
                        i35 = ((iM556813 ^ i24) * 31453) ^ 1720743477;
                        i36 = iM556813 ^ 144241292;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i5;
                        short[] sArr115 = sArr3;
                        i31 = i4;
                        sArr8 = sArr115;
                    } else {
                        i = i5;
                        str5 = str5;
                        sArr8 = sArr3;
                        sArr = sArr7;
                        i3 = i34;
                        i31 = i56;
                        i30 = i55;
                        i2 = i33;
                        int iM556814 = (i24 - C0873.m55680("᩺᩺")) * (-11);
                        i33 = i2;
                        i34 = i3;
                        sArr7 = sArr;
                        i35 = ((iM556814 ^ i25) * 7853) ^ 1865639635;
                        i36 = iM556814 ^ 996485779;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        sArr9 = sArr2;
                        i32 = i;
                        i30 = i30;
                        str5 = str5;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC2424(AbstractActivityC5549 abstractActivityC5549) {
        this(abstractActivityC5549, null);
        int i = 1061409777;
        int i2 = C0967.f81910;
        int i3 = ViewOnClickListenerC0939.f81888;
        short s = f81822[0];
        RunnableC0871.m55661(abstractActivityC5549, C1194.m56386(f81822, 1, 8, ((s * s) + 9205156) - (s * 6068) >= 0 ? 23316 : 34332));
        int iM55979 = C0946.m55979("۟᩵") ^ i2;
        int i4 = ((iM55979 ^ i3) * 2257) ^ (-383224881);
        int i5 = -753012764;
        while (true) {
            i = ((((i ^ i3) * 32579) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1864355009:
                case 1571767663:
                    if (C0854.f81826 != 0) {
                        iM55979 = C0946.m55979("ۚᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-12861)) ^ (-1379482207);
                        i5 = 1283635818;
                    } else {
                        iM55979 = C0873.m55680("֨ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-8515)) ^ 1466979790;
                        i5 = -1363882776;
                    }
                    break;
                case -1495386281:
                case -793736836:
                    C1929.m56553();
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0873.m55680("ܳ֨") ^ i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 20269) ^ (-767717487);
                        i5 = -1604242280;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ܿۗ")) * 47;
                        i4 = ((iM55979 ^ i2) * 27291) ^ 1565427351;
                        i5 = -494889938;
                    }
                    break;
                case -1078543748:
                case -710775590:
                    return;
                case -953770780:
                case 802025134:
                    RunnableC0897.m55784();
                    throw new RuntimeException();
                case 137041708:
                case 1488570566:
                    if (C0946.f81894 != 0) {
                        iM55979 = C0873.m55680("᩺֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24283) ^ (-1147085516);
                        i5 = 762955117;
                    } else {
                        iM55979 = C0873.m55680("֨ۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-1619)) ^ 1036164556;
                        i5 = -2122219812;
                    }
                    break;
                case 1481212245:
                case 1760533878:
                    C1003.m56123();
                    C1044.m56286();
                    iM55979 = C0946.m55979("ۚᩴ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-12861)) ^ (-1379482207);
                    i5 = 1283635818;
                    break;
                default:
                    if (C1964.f83032 > 0) {
                        iM55979 = (C0873.m55680("ܳ֨") ^ i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 20269) ^ (-767717487);
                        i5 = -1604242280;
                    } else {
                        iM55979 = C0946.m55979("ۚᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-12861)) ^ (-1379482207);
                        i5 = 1283635818;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewOnClickListenerC2424(AbstractActivityC5549 abstractActivityC5549, DialogInterfaceOnCancelListenerC8559 dialogInterfaceOnCancelListenerC8559) {
        int i = -1370445476;
        int i2 = C0877.f81843;
        int i3 = C0898.f81858;
        short s = f81822[62];
        int i4 = ((s * s) + 85562500) - (s * 18500) < 0 ? 30357 : 21846;
        RunnableC0871.m55661(abstractActivityC5549, C1124.m56373(f81822, 63, 8, i4));
        this(abstractActivityC5549, C1053.m56333(ApplicationC21448.f67649, C1036.m56252(f81822, 71, 9, i4), null), "", dialogInterfaceOnCancelListenerC8559);
        int iM55979 = (i3 - C0946.m55979("᩸֨")) * 83;
        int i5 = ((iM55979 ^ i2) * (-23229)) ^ 2029212033;
        int i6 = 1414324324;
        while (true) {
            i = (iM55979 ^ i6) ^ (i5 & (((i ^ i2) * 5663) >> 31));
            switch (i) {
                case -2051002351:
                case -1202663219:
                    if (C0882.f81846) {
                        iM55979 = C0873.m55680("֡ᩴ") ^ i3;
                        i5 = ((iM55979 ^ i2) * 10281) ^ (-723409573);
                        i6 = -227435438;
                    } else {
                        iM55979 = (C0873.m55680("۠۫") ^ i2) * 91;
                        i5 = ((iM55979 ^ i3) * 4537) ^ 1744507687;
                        i6 = 1689941402;
                    }
                    break;
                case -2038403124:
                case -971446856:
                    C0992.m56107();
                    C0845.m55584();
                    throw new RuntimeException();
                case -1785837524:
                case -1630770030:
                    if (C0898.m55800() <= 0) {
                        iM55979 = C0946.m55979("֡᩹") ^ i3;
                        i5 = ((iM55979 ^ i2) * (-23793)) ^ (-468663169);
                        i6 = -1924858079;
                    } else {
                        iM55979 = C0873.m55680("ۙۛ") ^ i2;
                        i5 = ((iM55979 ^ i3) * (-30121)) ^ (-1355050778);
                        i6 = -293430346;
                    }
                    break;
                case -999670986:
                case 271370138:
                    C1025.m56230();
                    iM55979 = C0946.m55979("ۡ۟") ^ i3;
                    i5 = ((iM55979 ^ i2) * (-1757)) ^ (-1693025355);
                    i6 = -1912294374;
                    break;
                case -220128184:
                case 819742117:
                    if (C0946.f81894 == 0) {
                        iM55979 = C0873.m55680("֡ᩴ") ^ i3;
                        i5 = ((iM55979 ^ i2) * 10281) ^ (-723409573);
                        i6 = -227435438;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۤۧ")) * 93;
                        i5 = ((iM55979 ^ i3) * 17195) ^ (-330598382);
                        i6 = -1572821144;
                    }
                    break;
                case 779880862:
                case 1624070793:
                    return;
                default:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (i2 - C0873.m55680("ۤۧ")) * 93;
                        i5 = ((iM55979 ^ i3) * 17195) ^ (-330598382);
                        i6 = -1572821144;
                    } else {
                        iM55979 = C0946.m55979("ۡ۟") ^ i3;
                        i5 = ((iM55979 ^ i2) * (-1757)) ^ (-1693025355);
                        i6 = -1912294374;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x019f A[PHI: r2 r3 r8 r15 r20
      0x019f: PHI (r2v4 l.֡ۚۢ) = (r2v3 l.֡ۚۢ), (r2v2 l.֡ۚۢ), (r2v2 l.֡ۚۢ) binds: [B:49:0x019d, B:33:0x00fa, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r3v5 int) = (r3v4 int), (r3v2 int), (r3v2 int) binds: [B:49:0x019d, B:33:0x00fa, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:49:0x019d, B:33:0x00fa, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:49:0x019d, B:33:0x00fa, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r20v21 short) = (r20v11 short), (r20v16 short), (r20v22 short) binds: [B:49:0x019d, B:33:0x00fa, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x022f A[PHI: r4 r7 r12 r13 r20
      0x022f: PHI (r4v4 android.view.View) = (r4v2 android.view.View), (r4v3 android.view.View), (r4v2 android.view.View), (r4v2 android.view.View) binds: [B:60:0x022d, B:45:0x0178, B:29:0x00d6, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:60:0x022d, B:45:0x0178, B:29:0x00d6, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:60:0x022d, B:45:0x0178, B:29:0x00d6, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:60:0x022d, B:45:0x0178, B:29:0x00d6, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r20v19 short) = (r20v6 short), (r20v12 short), (r20v17 short), (r20v20 short) binds: [B:60:0x022d, B:45:0x0178, B:29:0x00d6, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02b6 A[PHI: r6 r16 r20 r21
      0x02b6: PHI (r6v3 float[]) = (r6v2 float[]), (r6v2 float[]), (r6v4 float[]) binds: [B:73:0x02b4, B:69:0x0295, B:37:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:73:0x02b4, B:69:0x0295, B:37:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r20v14 short) = (r20v2 short), (r20v3 short), (r20v15 short) binds: [B:73:0x02b4, B:69:0x0295, B:37:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r21v5 char) = (r21v3 char), (r21v4 char), (r21v3 char) binds: [B:73:0x02b4, B:69:0x0295, B:37:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    private final C4437 m3384(boolean z) {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4 = C1046.f81962;
        int i5 = C0877.f81843;
        int iM55681 = C0873.m55680("ۖ֨") ^ i5;
        int i6 = ((iM55681 ^ i4) * (-3683)) ^ 1949155356;
        View view = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM55681 ^ 1161501295;
        DialogInterfaceC2564 dialogInterfaceC2564 = null;
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 799568073;
        char c = 0;
        String strM55750 = null;
        float[] fArr = null;
        int i15 = 0;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i4) * 17889) >> 31));
            switch (i14) {
                case -2118446131:
                case 892945151:
                    s = s;
                    view = this.f3730;
                    C0898.m55802(view, i8);
                    if (C1017.m56187() <= 0) {
                        iM55680 = C0873.m55680("ۖ᩹") ^ i5;
                        i = ((iM55680 ^ i4) * 17723) ^ 1516195388;
                        i2 = 31755687;
                    } else {
                        iM55680 = C0873.m55680("֡ᩳ") ^ i4;
                        i = ((iM55680 ^ i5) * 3965) ^ (-1795875676);
                        i2 = -1407379620;
                    }
                    int i16 = iM55680 ^ i2;
                    s = s;
                    i7 = i16;
                    i6 = i;
                    break;
                case -2090523263:
                case 1499674132:
                    s = s;
                    i11 = i10 * i10;
                    i12 = s * 2;
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("ۖ᩹") ^ i5;
                        i = ((iM55680 ^ i4) * 17723) ^ 1516195388;
                        i2 = 31755687;
                    } else {
                        iM55680 = C0946.m55979("ۖܳ") ^ i5;
                        i = ((iM55680 ^ i4) * 10903) ^ (-475778573);
                        i2 = 403790747;
                    }
                    int i17 = iM55680 ^ i2;
                    s = s;
                    i7 = i17;
                    i6 = i;
                    break;
                case -1772184933:
                case -1212948759:
                    s = s;
                    if (i11 - (i12 + 1) < 0) {
                        iM55680 = (i5 - C0873.m55680("ۜۛ")) * 119;
                        i = ((iM55680 ^ i4) * 5953) ^ (-2000503759);
                        i2 = 161358966;
                    } else {
                        iM55680 = (C0946.m55979("᩶ۗ") ^ i4) * (-125);
                        i = ((iM55680 ^ i5) * 23613) ^ 1198261210;
                        i2 = -1058975292;
                    }
                    int i18 = iM55680 ^ i2;
                    s = s;
                    i7 = i18;
                    i6 = i;
                    break;
                case -1723403055:
                case 658743015:
                    final C4437 c4437 = new C4437();
                    dialogInterfaceC2564.m3850(new DialogInterface.OnKeyListener() { // from class: l.ۢ֡ۡ
                        {
                            int i19 = 310280779;
                            int i20 = C1229.f82066;
                            int i21 = AbstractC0942.f81890;
                            int iM559710 = (C0946.m55979("۫᩻") + i21) * (-27);
                            int i22 = ((iM559710 ^ i20) * (-23015)) ^ (-1677924517);
                            int i23 = 458615429;
                            while (true) {
                                i19 = ((((i19 ^ i20) * 17103) >> 31) & i22) ^ (iM559710 ^ i23);
                                switch (i19) {
                                    case -1634699975:
                                    case 1335118886:
                                        if (C1046.m56302() != 0) {
                                            iM559710 = C0946.m55979("ۚۧ") ^ i20;
                                            i22 = ((iM559710 ^ i21) * (-5661)) ^ 211330643;
                                            i23 = -1813013510;
                                        } else {
                                            iM559710 = (i20 - C0946.m55979("֫۫")) * 75;
                                            i22 = ((iM559710 ^ i21) * (-24629)) ^ (-510275834);
                                            i23 = -2063902933;
                                        }
                                        break;
                                    case -1515250234:
                                    case -636669190:
                                        if (C0873.f81841 <= 0) {
                                            iM559710 = C0946.m55979("ܺۙ") ^ i21;
                                            i22 = ((iM559710 ^ i20) * (-24879)) ^ (-765680307);
                                            i23 = -1216064769;
                                        } else {
                                            iM559710 = C0946.m55979("ۨܰ") ^ i20;
                                            i22 = ((iM559710 ^ i21) * 31581) ^ 1966736899;
                                            i23 = 1596691769;
                                        }
                                        break;
                                    case -1369839411:
                                    case 1168275590:
                                        if (C0912.f81867 <= 0) {
                                            iM559710 = (C0873.m55680("֫ۧ") ^ i21) * (-67);
                                            i22 = ((iM559710 ^ i20) * (-29819)) ^ 803977811;
                                            i23 = -382583738;
                                        } else {
                                            iM559710 = C0873.m55680("ۤۗ") ^ i20;
                                            i22 = ((iM559710 ^ i21) * 19813) ^ (-1936722838);
                                            i23 = -170850946;
                                        }
                                        break;
                                    case -1203687259:
                                    case -18529086:
                                        C1024.m56209();
                                        if (C1964.f83032 <= 0) {
                                            iM559710 = (C0873.m55680("ۢۡ") ^ i20) * (-33);
                                            i22 = ((iM559710 ^ i21) * 3171) ^ 1282430991;
                                            i23 = 1380027486;
                                        } else {
                                            iM559710 = C0946.m55979("ۚۧ") ^ i20;
                                            i22 = ((iM559710 ^ i21) * (-5661)) ^ 211330643;
                                            i23 = -1813013510;
                                        }
                                        break;
                                    case -1097165152:
                                    case 1334756761:
                                        C1124.m56367();
                                        iM559710 = C0946.m55979("ۚۧ") ^ i20;
                                        i22 = ((iM559710 ^ i21) * (-5661)) ^ 211330643;
                                        i23 = -1813013510;
                                        break;
                                    case -1061381798:
                                    case 152115929:
                                        if (C1046.f81962 <= 0) {
                                            iM559710 = C0873.m55680("ۙۧ") ^ i21;
                                            i22 = ((iM559710 ^ i20) * 18443) ^ (-1728428489);
                                            i23 = -399457779;
                                        } else {
                                            iM559710 = C0946.m55979("᩵ۢ") ^ i21;
                                            i22 = ((iM559710 ^ i20) * (-16057)) ^ (-953351412);
                                            i23 = 1617346841;
                                        }
                                        break;
                                    case -901360296:
                                    case 657247413:
                                        if (C0898.m55800() <= 0) {
                                            iM559710 = C0946.m55979("ۚۧ") ^ i20;
                                            i22 = ((iM559710 ^ i21) * (-5661)) ^ 211330643;
                                            i23 = -1813013510;
                                        } else {
                                            iM559710 = C0873.m55680("ۛܰ") ^ i21;
                                            i22 = ((iM559710 ^ i20) * 24193) ^ (-735303483);
                                            i23 = 1772818905;
                                        }
                                        break;
                                    case -684957404:
                                    case 919565719:
                                        if (C1003.f81929 <= 0) {
                                            iM559710 = (C0873.m55680("ۢۡ") ^ i20) * (-33);
                                            i22 = ((iM559710 ^ i21) * 3171) ^ 1282430991;
                                            i23 = 1380027486;
                                        } else {
                                            iM559710 = (i20 - C0873.m55680("۟ۤ")) * (-121);
                                            i22 = ((iM559710 ^ i21) * (-11979)) ^ 2008840639;
                                            i23 = -912851320;
                                        }
                                        break;
                                    case -517063773:
                                    case 408335077:
                                        if (C1017.m56187() > 0) {
                                            iM559710 = C0873.m55680("ۙۧ") ^ i21;
                                            i22 = ((iM559710 ^ i20) * 18443) ^ (-1728428489);
                                            i23 = -399457779;
                                        } else {
                                            iM559710 = C0946.m55979("ۚۧ") ^ i20;
                                            i22 = ((iM559710 ^ i21) * (-5661)) ^ 211330643;
                                            i23 = -1813013510;
                                        }
                                        break;
                                    case -287601354:
                                    case 156818153:
                                        if (C1017.f81942 >= 0) {
                                            iM559710 = C0946.m55979("ۚۧ") ^ i20;
                                            i22 = ((iM559710 ^ i21) * (-5661)) ^ 211330643;
                                            i23 = -1813013510;
                                        } else {
                                            iM559710 = (C0946.m55979("ۖᩳ") + i21) * (-107);
                                            i22 = ((iM559710 ^ i20) * (-27047)) ^ (-716960316);
                                            i23 = -2081416218;
                                        }
                                        break;
                                    case 315970456:
                                    case 1112357846:
                                        if (C0949.f81897 < 0) {
                                            iM559710 = C0946.m55979("ܺۙ") ^ i21;
                                            i22 = ((iM559710 ^ i20) * (-24879)) ^ (-765680307);
                                            i23 = -1216064769;
                                        } else {
                                            iM559710 = C0873.m55680("ۙۧ") ^ i21;
                                            i22 = ((iM559710 ^ i20) * 18443) ^ (-1728428489);
                                            i23 = -399457779;
                                        }
                                        break;
                                    case 572491248:
                                    case 750558936:
                                        C1017.m56187();
                                        C0892.m55749();
                                        throw new RuntimeException();
                                    case 739003942:
                                    case 1725163208:
                                        if (C0854.m55595() >= 0) {
                                            iM559710 = C0946.m55979("ۚۧ") ^ i20;
                                            i22 = ((iM559710 ^ i21) * (-5661)) ^ 211330643;
                                            i23 = -1813013510;
                                        } else {
                                            iM559710 = C0946.m55979("ۧۢ") ^ i20;
                                            i22 = ((iM559710 ^ i21) * (-19899)) ^ 751279542;
                                            i23 = 2075544772;
                                        }
                                        break;
                                    case 1026009819:
                                    case 1057048047:
                                        if (C0917.f81868) {
                                            iM559710 = C0873.m55680("ۙۧ") ^ i21;
                                            i22 = ((iM559710 ^ i20) * 18443) ^ (-1728428489);
                                            i23 = -399457779;
                                        } else {
                                            iM559710 = (i21 - C0873.m55680("ۤܳ")) * 31;
                                            i22 = ((iM559710 ^ i20) * 30597) ^ 1313856040;
                                            i23 = 823717866;
                                        }
                                        break;
                                    case 1143020618:
                                    case 1320970515:
                                        if (C1017.f81942 >= 0) {
                                            iM559710 = (C0873.m55680("֫ۧ") ^ i21) * (-67);
                                            i22 = ((iM559710 ^ i20) * (-29819)) ^ 803977811;
                                            i23 = -382583738;
                                        } else {
                                            iM559710 = C0873.m55680("ۨ۟") ^ i21;
                                            i22 = ((iM559710 ^ i20) * 29749) ^ (-700385159);
                                            i23 = 41518846;
                                        }
                                        break;
                                    default:
                                        return;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnKeyListener
                        public final boolean onKey(DialogInterface dialogInterface, int i19, KeyEvent keyEvent) {
                            int i20 = -673456540;
                            int i21 = C0866.f81837;
                            int i22 = C1044.f81959;
                            int iM55682 = C0873.m55680("ᩳܺ") ^ i21;
                            int i23 = ((iM55682 ^ i22) * (-5555)) ^ 1294164209;
                            int i24 = -1465395612;
                            while (true) {
                                i20 = ((((i20 ^ i22) * (-7425)) >> 31) & i23) ^ (iM55682 ^ i24);
                                switch (i20) {
                                    case -2000187626:
                                    case -1564722325:
                                        if (C0967.f81910 >= 0) {
                                            iM55682 = (C0873.m55680("ۤ۫") ^ i22) * (-109);
                                            i23 = ((iM55682 ^ i21) * (-109)) ^ (-1023691406);
                                            i24 = -1092804523;
                                        } else {
                                            iM55682 = C0946.m55979("ۡ֡") ^ i21;
                                            i23 = ((iM55682 ^ i22) * 28019) ^ 436026543;
                                            i24 = -754645474;
                                        }
                                        break;
                                    case -1983761283:
                                    case 2005384000:
                                        if (C0912.f81867 <= 0) {
                                            iM55682 = (C0873.m55680("۟ۚ") ^ i21) * (-45);
                                            i23 = ((iM55682 ^ i22) * 17715) ^ (-254100300);
                                            i24 = 1506655260;
                                        } else {
                                            iM55682 = C0946.m55979("ۗۧ") ^ i21;
                                            i23 = ((iM55682 ^ i22) * 1401) ^ (-1036653458);
                                            i24 = -1992538601;
                                        }
                                        break;
                                    case -1626493676:
                                    case 533604560:
                                        if (C0906.f81862 < 0) {
                                            iM55682 = C0873.m55680("᩵ᩴ") ^ i22;
                                            i23 = ((iM55682 ^ i21) * (-31753)) ^ 612882053;
                                            i24 = -820201473;
                                        } else {
                                            iM55682 = (C0873.m55680("ۤ۫") ^ i22) * (-109);
                                            i23 = ((iM55682 ^ i21) * (-109)) ^ (-1023691406);
                                            i24 = -1092804523;
                                        }
                                        break;
                                    case -1476518631:
                                    case -539894290:
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM55682 = (C0873.m55680("۟ۚ") ^ i21) * (-45);
                                            i23 = ((iM55682 ^ i22) * 17715) ^ (-254100300);
                                            i24 = 1506655260;
                                        } else {
                                            iM55682 = (C0946.m55979("ۤ۟") + i22) * 73;
                                            i23 = ((iM55682 ^ i21) * (-6627)) ^ 1299128283;
                                            i24 = -506352533;
                                        }
                                        break;
                                    case -532389217:
                                    case 1671540092:
                                        return ViewOnClickListenerC2424.m3387(c4437, this, i19, keyEvent);
                                    case -254214088:
                                    case -142016809:
                                        if (C1229.f82066 >= 0) {
                                            iM55682 = (C0873.m55680("ۤ۫") ^ i22) * (-109);
                                            i23 = ((iM55682 ^ i21) * (-109)) ^ (-1023691406);
                                            i24 = -1092804523;
                                        } else {
                                            iM55682 = (i22 - C0946.m55979("۟᩹")) * 47;
                                            i23 = ((iM55682 ^ i21) * (-29485)) ^ 1542613530;
                                            i24 = 1307480520;
                                        }
                                        break;
                                    case -210896047:
                                    case -10731151:
                                        if (C0898.f81858 <= 0) {
                                            iM55682 = C0946.m55979("ܿܳ") ^ i21;
                                            i23 = ((iM55682 ^ i22) * 1809) ^ 1583216575;
                                            i24 = -959931895;
                                        } else {
                                            iM55682 = (C0873.m55680("ܽۛ") ^ i21) * 31;
                                            i23 = ((iM55682 ^ i22) * 24811) ^ (-103176634);
                                            i24 = -175409573;
                                        }
                                        break;
                                    case -161727469:
                                    case 65493440:
                                        if (C1048.m56305() >= 0) {
                                            iM55682 = (C0873.m55680("۟ۚ") ^ i21) * (-45);
                                            i23 = ((iM55682 ^ i22) * 17715) ^ (-254100300);
                                            i24 = 1506655260;
                                        } else {
                                            iM55682 = (C0873.m55680("ᩳ֡") + i22) * (-55);
                                            i23 = ((iM55682 ^ i21) * (-11905)) ^ (-296902634);
                                            i24 = 997868032;
                                        }
                                        break;
                                    case 321905029:
                                    case 1108907418:
                                        C0930.m55885();
                                        iM55682 = (C0873.m55680("ۤ۫") ^ i22) * (-109);
                                        i23 = ((iM55682 ^ i21) * (-109)) ^ (-1023691406);
                                        i24 = -1092804523;
                                        break;
                                    case 434842590:
                                    case 1557517726:
                                        if (C1046.f81962 > 0) {
                                            iM55682 = (i21 - C0946.m55979("֫ۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i23 = ((iM55682 ^ i22) * (-3029)) ^ 986756586;
                                            i24 = 1835500034;
                                        } else {
                                            iM55682 = (C0873.m55680("ۤ۫") ^ i22) * (-109);
                                            i23 = ((iM55682 ^ i21) * (-109)) ^ (-1023691406);
                                            i24 = -1092804523;
                                        }
                                        break;
                                    case 658376409:
                                    case 1444924132:
                                        if (C1017.f81942 >= 0) {
                                            iM55682 = (C0873.m55680("۟ۚ") ^ i21) * (-45);
                                            i23 = ((iM55682 ^ i22) * 17715) ^ (-254100300);
                                            i24 = 1506655260;
                                        } else {
                                            iM55682 = (C0873.m55680("ܺ֨") ^ i22) * (-77);
                                            i23 = ((iM55682 ^ i21) * 11201) ^ 1094104511;
                                            i24 = -1032686912;
                                        }
                                        break;
                                    case 711905312:
                                    case 1312075480:
                                        C0890.m55740();
                                        C0877.m55696();
                                        return false;
                                    case 938246817:
                                    case 1195698360:
                                        if (!C0892.f81851) {
                                            iM55682 = (i21 - C0946.m55979("֫ۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i23 = ((iM55682 ^ i22) * (-3029)) ^ 986756586;
                                            i24 = 1835500034;
                                        } else {
                                            iM55682 = C0946.m55979("ܿܳ") ^ i21;
                                            i23 = ((iM55682 ^ i22) * 1809) ^ 1583216575;
                                            i24 = -959931895;
                                        }
                                        break;
                                    case 1042614850:
                                    case 1098188220:
                                        if (C0949.f81897 >= 0) {
                                            iM55682 = C0946.m55979("ܿܳ") ^ i21;
                                            i23 = ((iM55682 ^ i22) * 1809) ^ 1583216575;
                                            i24 = -959931895;
                                        } else {
                                            iM55682 = C0946.m55979("֨᩷") ^ i21;
                                            i23 = ((iM55682 ^ i22) * 21439) ^ 556645403;
                                            i24 = 2027782869;
                                        }
                                        break;
                                    case 1164107402:
                                    case 1936779267:
                                        if (C0877.f81843 >= 0) {
                                            iM55682 = (C0873.m55680("۟ۚ") ^ i21) * (-45);
                                            i23 = ((iM55682 ^ i22) * 17715) ^ (-254100300);
                                            i24 = 1506655260;
                                        } else {
                                            iM55682 = C0946.m55979("ᩴ۠") ^ i21;
                                            i23 = ((iM55682 ^ i22) * (-6739)) ^ (-1680138552);
                                            i24 = -1132346989;
                                        }
                                        break;
                                    default:
                                        if (C1964.m56597() != 0) {
                                            iM55682 = C0873.m55680("᩵ᩴ") ^ i22;
                                            i23 = ((iM55682 ^ i21) * (-31753)) ^ 612882053;
                                            i24 = -820201473;
                                        } else {
                                            iM55682 = C0946.m55979("۠ܿ") ^ i22;
                                            i23 = ((iM55682 ^ i21) * 23597) ^ (-1272480748);
                                            i24 = 2067150550;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    return c4437;
                case -1616682570:
                case 1325050541:
                    s = s;
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    sArr2 = f81822;
                    i9 = 81;
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0873.m55680("ܶۜ") ^ i4) * 37;
                        i = ((iM55680 ^ i5) * (-6921)) ^ 668895795;
                        i2 = -680988522;
                    } else {
                        iM55680 = C0946.m55979("ۜ᩶") ^ i5;
                        i = ((iM55680 ^ i4) * 19803) ^ (-175201570);
                        i2 = 1194276472;
                    }
                    int i19 = iM55680 ^ i2;
                    s = s;
                    i7 = i19;
                    i6 = i;
                    break;
                case -1615766651:
                case 261426547:
                    return null;
                case -1149967665:
                case -287808256:
                    s = s;
                    fArr = new float[i15];
                    if (C1404.m56468()) {
                        iM55680 = (C0873.m55680("ۚۘ") + i4) * (-109);
                        i = ((iM55680 ^ i5) * 26657) ^ (-54110023);
                        i2 = 1160865746;
                    } else {
                        iM55680 = C0873.m55680("᩻ᩴ") ^ i5;
                        i = ((iM55680 ^ i4) * (-23503)) ^ 470428483;
                        i2 = -1759714841;
                    }
                    int i110 = iM55680 ^ i2;
                    s = s;
                    i7 = i110;
                    i6 = i;
                    break;
                case -1126000352:
                case 801193732:
                    i13 = 11009;
                    iM55680 = (i4 - C0873.m55680("᩹᩵")) * 13;
                    i = ((iM55680 ^ i5) * 5587) ^ (-539015944);
                    i2 = 1579422249;
                    int i111 = iM55680 ^ i2;
                    s = s;
                    i7 = i111;
                    i6 = i;
                    break;
                case -1033546527:
                case -573876838:
                    C1044.m56286();
                    C1229.m56410();
                    return null;
                case -916405377:
                case 1538436161:
                    s = s;
                    strM55750 = C0892.m55750(sArr2, i9, 5, i13);
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0873.m55680("ۖ᩹") ^ i5;
                        i = ((iM55680 ^ i4) * 17723) ^ 1516195388;
                        i2 = 31755687;
                    } else {
                        iM55680 = C0873.m55680("᩺ۘ") ^ i4;
                        i = ((iM55680 ^ i5) * 18985) ^ (-1351432756);
                        i2 = 1076176878;
                    }
                    int i112 = iM55680 ^ i2;
                    s = s;
                    i7 = i112;
                    i6 = i;
                    break;
                case -881534496:
                case 1416776820:
                    s = s;
                    sArr = f81822;
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0873.m55680("᩻ᩴ") ^ i5;
                        i = ((iM55680 ^ i4) * (-23503)) ^ 470428483;
                        i2 = -1759714841;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ۘ۟")) * (-37);
                        i = ((iM55680 ^ i5) * 12997) ^ (-1280828244);
                        i2 = 1424229743;
                    }
                    int i113 = iM55680 ^ i2;
                    s = s;
                    i7 = i113;
                    i6 = i;
                    break;
                case -769402128:
                case 1484026265:
                    C0992.m56107();
                    C0967.m56074();
                    iM55979 = (i4 - C0946.m55979("᩺ۙ")) * (-111);
                    i = ((iM55979 ^ i5) * 29507) ^ (-1231304316);
                    i3 = -2110284270;
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case -333569057:
                case 384796375:
                    s = s;
                    C1929.m56565(C0927.m55867(C0967.m56066(view, strM55750, fArr), 200L));
                    if (z) {
                        iM55680 = C0946.m55979("ۡᩴ") ^ i5;
                        i = ((iM55680 ^ i4) * 7179) ^ (-1074877611);
                        i2 = 386466175;
                    } else {
                        iM55680 = C0873.m55680("ۧۜ") ^ i5;
                        i = ((iM55680 ^ i4) * 14973) ^ (-1163387195);
                        i2 = -2116367429;
                    }
                    int i114 = iM55680 ^ i2;
                    s = s;
                    i7 = i114;
                    i6 = i;
                    break;
                case -275317622:
                case 144630325:
                    s = sArr[c];
                    i10 = s + 1;
                    if (C0967.f81910 >= 0) {
                        iM55979 = (i4 - C0946.m55979("᩺ۙ")) * (-111);
                        i = ((iM55979 ^ i5) * 29507) ^ (-1231304316);
                        i3 = -2110284270;
                    } else {
                        iM55979 = C0946.m55979("ۤᩳ") ^ i4;
                        i = ((iM55979 ^ i5) * 22439) ^ 705108614;
                        i3 = 262823100;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case -101918075:
                case -86751991:
                    s = s;
                    ViewOnClickListenerC0939.m55945(view, 0.0f);
                    i15 = 2;
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0873.m55680("ۜ᩷") ^ i4;
                        i = ((iM55680 ^ i5) * (-20479)) ^ 1609807048;
                        i2 = -2064994484;
                    } else {
                        iM55680 = (C0946.m55979("ܽܳ") + i5) * (-121);
                        i = ((iM55680 ^ i4) * 373) ^ 398419301;
                        i2 = 123457706;
                    }
                    int i115 = iM55680 ^ i2;
                    s = s;
                    i7 = i115;
                    i6 = i;
                    break;
                case 424719523:
                case 1606265235:
                    C0898.m55800();
                    if (C0906.f81862 >= 0) {
                        s = s;
                        iM55680 = (C0873.m55680("ܶۜ") ^ i4) * 37;
                        i = ((iM55680 ^ i5) * (-6921)) ^ 668895795;
                        i2 = -680988522;
                        int i116 = iM55680 ^ i2;
                        s = s;
                        i7 = i116;
                        i6 = i;
                    }
                    iM55979 = (i4 - C0946.m55979("᩺ۙ")) * (-111);
                    i = ((iM55979 ^ i5) * 29507) ^ (-1231304316);
                    i3 = -2110284270;
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case 538462351:
                case 1619151762:
                    s = s;
                    c = 'P';
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("᩻ᩴ") ^ i5;
                        i = ((iM55680 ^ i4) * (-23503)) ^ 470428483;
                        i2 = -1759714841;
                    } else {
                        iM55680 = (C0873.m55680("ۢܽ") + i5) * 93;
                        i = ((iM55680 ^ i4) * (-5947)) ^ (-1270741756);
                        i2 = -1148042515;
                    }
                    int i117 = iM55680 ^ i2;
                    s = s;
                    i7 = i117;
                    i6 = i;
                    break;
                case 648853256:
                case 1551366003:
                    if (C0927.m55873() > 0) {
                        s = s;
                        iM55680 = C0873.m55680("ۖ᩹") ^ i5;
                        i = ((iM55680 ^ i4) * 17723) ^ 1516195388;
                        i2 = 31755687;
                        int i118 = iM55680 ^ i2;
                        s = s;
                        i7 = i118;
                        i6 = i;
                    }
                    iM55979 = (i4 - C0946.m55979("᩺ۙ")) * (-111);
                    i = ((iM55979 ^ i5) * 29507) ^ (-1231304316);
                    i3 = -2110284270;
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case 691529375:
                case 1609461846:
                    i13 = 4430;
                    iM55680 = (i4 - C0873.m55680("᩹᩵")) * 13;
                    i = ((iM55680 ^ i5) * 5587) ^ (-539015944);
                    i2 = 1579422249;
                    int i119 = iM55680 ^ i2;
                    s = s;
                    i7 = i119;
                    i6 = i;
                    break;
                case 909493286:
                case 1328884744:
                    s = s;
                    dialogInterfaceC2564 = this.f3732;
                    i8 = 0;
                    dialogInterfaceC2564.m3854(false);
                    if (C1012.m56134() <= 0) {
                        iM55680 = (C0873.m55680("ܶۜ") ^ i4) * 37;
                        i = ((iM55680 ^ i5) * (-6921)) ^ 668895795;
                        i2 = -680988522;
                    } else {
                        iM55680 = C0873.m55680("᩶ۡ") ^ i5;
                        i = ((iM55680 ^ i4) * 15961) ^ 493421147;
                        i2 = -1149934647;
                    }
                    int i1110 = iM55680 ^ i2;
                    s = s;
                    i7 = i1110;
                    i6 = i;
                    break;
                default:
                    if (!C0917.f81868) {
                        s = s;
                        iM55680 = C0873.m55680("ۜ᩷") ^ i4;
                        i = ((iM55680 ^ i5) * (-20479)) ^ 1609807048;
                        i2 = -2064994484;
                        int i1111 = iM55680 ^ i2;
                        s = s;
                        i7 = i1111;
                        i6 = i;
                    }
                    iM55979 = (i4 - C0946.m55979("᩺ۙ")) * (-111);
                    i = ((iM55979 ^ i5) * 29507) ^ (-1231304316);
                    i3 = -2110284270;
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0144 A[PHI: r4
      0x0144: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:40:0x0142, B:18:0x008d, B:16:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x020d A[PHI: r2 r8 r9 r15 r16 r17
      0x020d: PHI (r2v4 l.֡ۚۢ) = (r2v2 l.֡ۚۢ), (r2v3 l.֡ۚۢ), (r2v2 l.֡ۚۢ), (r2v2 l.֡ۚۢ), (r2v2 l.֡ۚۢ) binds: [B:56:0x020b, B:45:0x0192, B:24:0x00b4, B:16:0x0089, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r8v4 android.animation.ObjectAnimator) = 
      (r8v2 android.animation.ObjectAnimator)
      (r8v2 android.animation.ObjectAnimator)
      (r8v3 android.animation.ObjectAnimator)
      (r8v2 android.animation.ObjectAnimator)
      (r8v2 android.animation.ObjectAnimator)
     binds: [B:56:0x020b, B:45:0x0192, B:24:0x00b4, B:16:0x0089, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r9v3 long) = (r9v1 long), (r9v1 long), (r9v2 long), (r9v1 long), (r9v1 long) binds: [B:56:0x020b, B:45:0x0192, B:24:0x00b4, B:16:0x0089, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:56:0x020b, B:45:0x0192, B:24:0x00b4, B:16:0x0089, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:56:0x020b, B:45:0x0192, B:24:0x00b4, B:16:0x0089, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r17v4 int) = (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:56:0x020b, B:45:0x0192, B:24:0x00b4, B:16:0x0089, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0244 A[PHI: r3 r12 r14 r24
      0x0244: PHI (r3v3 boolean) = (r3v2 boolean), (r3v2 boolean), (r3v5 boolean) binds: [B:60:0x0242, B:32:0x00fb, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:60:0x0242, B:32:0x00fb, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r14v4 short) = (r14v3 short), (r14v2 short), (r14v2 short) binds: [B:60:0x0242, B:32:0x00fb, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r24v5 short) = (r24v4 short), (r24v3 short), (r24v3 short) binds: [B:60:0x0242, B:32:0x00fb, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x027a A[PHI: r5 r6 r7 r18 r19
      0x027a: PHI (r5v4 float[]) = (r5v2 float[]), (r5v3 float[]), (r5v2 float[]), (r5v2 float[]) binds: [B:64:0x0278, B:36:0x0120, B:28:0x00d9, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r6v4 android.view.View) = (r6v2 android.view.View), (r6v3 android.view.View), (r6v2 android.view.View), (r6v2 android.view.View) binds: [B:64:0x0278, B:36:0x0120, B:28:0x00d9, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r7v5 java.lang.String) = (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v4 java.lang.String), (r7v2 java.lang.String) binds: [B:64:0x0278, B:36:0x0120, B:28:0x00d9, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:64:0x0278, B:36:0x0120, B:28:0x00d9, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r19v4 char) = (r19v3 char), (r19v2 char), (r19v2 char), (r19v2 char) binds: [B:64:0x0278, B:36:0x0120, B:28:0x00d9, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public final void m3388() {
        int iM55979;
        int i;
        int i2;
        int i3 = ServiceConnectionC1013.f81940;
        int i4 = RunnableC0938.f81886;
        int iM55680 = C0873.m55680("ۘ۬") ^ i3;
        int i5 = ((iM55680 ^ i4) * (-17135)) ^ (-1364763461);
        short[] sArr = null;
        int i6 = iM55680 ^ (-37091618);
        DialogInterfaceC2564 dialogInterfaceC2564 = null;
        boolean z = false;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        char c = 0;
        int i11 = -1963605608;
        short s2 = 0;
        short[] sArr2 = null;
        long j = 0;
        ObjectAnimator objectAnimatorM56368 = null;
        String strM55792 = null;
        View view = null;
        float[] fArr = null;
        int i12 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * 10591) >> 31));
            switch (i11) {
                case -2121399617:
                case -1959411513:
                    fArr = new float[i12];
                    // fill-array-data instruction
                    fArr[0] = 1.0f;
                    fArr[1] = 0.0f;
                    view = this.f3730;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (C0946.m55979("ܳ֫") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i3) * 8813) ^ (-799404395);
                        i2 = 1810028598;
                    } else {
                        iM55979 = (C0946.m55979("ۜۤ") ^ i4) * 119;
                        i = ((iM55979 ^ i3) * 28827) ^ (-1935476142);
                        i2 = -759195795;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2003518933:
                case -345880285:
                    if ((i9 + i10) - i8 >= 0) {
                        iM55979 = C0873.m55680("ۗۢ") ^ i4;
                        i = ((iM55979 ^ i3) * 21845) ^ 1295965656;
                        i2 = -121042130;
                    } else {
                        iM55979 = (C0946.m55979("᩺ۧ") ^ i4) * (-113);
                        i = ((iM55979 ^ i3) * (-20505)) ^ 991222602;
                        i2 = -1088633912;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1853934368:
                case -474886693:
                    if (C1071.f81975 > 0) {
                        iM55979 = (i4 - C0946.m55979("ۡ۬")) * 119;
                        i = ((iM55979 ^ i3) * (-14433)) ^ 1060656338;
                        i2 = 1900027851;
                    } else {
                        iM55979 = (C0946.m55979("ᩳܽ") + i3) * (-77);
                        i = ((iM55979 ^ i4) * 7597) ^ (-448993699);
                        i2 = 132396434;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1650231026:
                case 1460293312:
                    C0927.m55873();
                    C0866.m55645();
                    break;
                case -1580827838:
                case -537454793:
                    C0906.m55809();
                    C0955.m56025();
                    iM55979 = (C0946.m55979("۟ۨ") + i3) * 101;
                    i = ((iM55979 ^ i4) * (-2549)) ^ (-1166745965);
                    i2 = -477503213;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1080667076:
                case -1061682859:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (C0946.m55979("۟ۨ") + i3) * 101;
                        i = ((iM55979 ^ i4) * (-2549)) ^ (-1166745965);
                        i2 = -477503213;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۡ۬")) * 119;
                        i = ((iM55979 ^ i3) * (-14433)) ^ 1060656338;
                        i2 = 1900027851;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -874024404:
                case 493705763:
                    dialogInterfaceC2564.m3854(z);
                    i12 = 2;
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0946.m55979("۟ۨ") + i3) * 101;
                        i = ((iM55979 ^ i4) * (-2549)) ^ (-1166745965);
                        i2 = -477503213;
                    } else {
                        iM55979 = C0873.m55680("᩶ܺ") ^ i3;
                        i = ((iM55979 ^ i4) * 21899) ^ (-1630622734);
                        i2 = 1740705331;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -852831632:
                case 153509542:
                    strM55792 = C0898.m55792(sArr, 133, 5, i7);
                    if (C1229.m56410() != 0) {
                        iM55979 = (C0946.m55979("ܳ֫") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i3) * 8813) ^ (-799404395);
                        i2 = 1810028598;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ᩳۚ")) * (-75);
                        i = ((iM55979 ^ i3) * (-24923)) ^ 271120853;
                        i2 = -1392573040;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -817131131:
                case 1110047464:
                    i8 = s2 * s;
                    i9 = s2 * s2;
                    i10 = 6370576;
                    if (C0946.f81894 != 0) {
                        iM55979 = (i4 - C0946.m55979("ۡ۬")) * 119;
                        i = ((iM55979 ^ i3) * (-14433)) ^ 1060656338;
                        i2 = 1900027851;
                    } else {
                        iM55979 = C0873.m55680("ܽۖ") ^ i3;
                        i = ((iM55979 ^ i4) * 6731) ^ (-1576875767);
                        i2 = 1684252770;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -754166329:
                case -641751636:
                    s2 = sArr2[c];
                    s = 5048;
                    if (C0917.m55854()) {
                        iM55979 = (C0873.m55680("۫۠") ^ i4) * (-23);
                        i = ((iM55979 ^ i3) * (-26835)) ^ 1032457206;
                        i2 = 735139602;
                    } else {
                        iM55979 = (C0873.m55680("ܳ᩺") ^ i3) * (-99);
                        i = ((iM55979 ^ i4) * (-4325)) ^ (-1526990740);
                        i2 = 1216290886;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -719440188:
                case 495211872:
                    dialogInterfaceC2564 = this.f3732;
                    dialogInterfaceC2564.m3850((DialogInterface.OnKeyListener) null);
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (i4 - C0946.m55979("ۡ۬")) * 119;
                        i = ((iM55979 ^ i3) * (-14433)) ^ 1060656338;
                        i2 = 1900027851;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۙܶ")) * 57;
                        i = ((iM55979 ^ i4) * (-32211)) ^ 1781005894;
                        i2 = 200826357;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -271527057:
                case 1732904849:
                    objectAnimatorM56368 = C1124.m56368(view, strM55792, fArr);
                    j = 200;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (i4 - C0946.m55979("ۡ۬")) * 119;
                        i = ((iM55979 ^ i3) * (-14433)) ^ 1060656338;
                        i2 = 1900027851;
                    } else {
                        iM55979 = C0946.m55979("۬֫") ^ i4;
                        i = ((iM55979 ^ i3) * 10775) ^ (-541767417);
                        i2 = -2104291398;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 37269539:
                case 2060460539:
                    sArr = f81822;
                    if (C0873.m55678()) {
                        iM55979 = (C0873.m55680("ܳ᩺") ^ i3) * (-99);
                        i = ((iM55979 ^ i4) * (-4325)) ^ (-1526990740);
                        i2 = 1216290886;
                    } else {
                        iM55979 = (C0946.m55979("ܽ᩻") + i3) * (-13);
                        i = ((iM55979 ^ i4) * 1817) ^ (-730647818);
                        i2 = 980491898;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 193205658:
                case 336144541:
                    if (C1229.f82066 < 0) {
                        iM55979 = (C0946.m55979("ᩳܽ") + i3) * (-77);
                        i = ((iM55979 ^ i4) * 7597) ^ (-448993699);
                        i2 = 132396434;
                    } else {
                        iM55979 = (C0946.m55979("ܳ֫") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i3) * 8813) ^ (-799404395);
                        i2 = 1810028598;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 289220794:
                case 1822877743:
                    sArr2 = f81822;
                    c = 132;
                    if (C0947.f81895) {
                        iM55979 = (C0946.m55979("ܳ֫") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i3) * 8813) ^ (-799404395);
                        i2 = 1810028598;
                    } else {
                        iM55979 = (C0946.m55979("֫֫") + i3) * 73;
                        i = ((iM55979 ^ i4) * (-14441)) ^ 1270174621;
                        i2 = 1105518743;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 326110383:
                case 1636561083:
                    C1964.m56585(C0927.m55867(objectAnimatorM56368, j));
                    ViewOnClickListenerC0939.m55955(new Runnable() { // from class: l.ۡ֡ۡ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC2424.m3385(this.f28968);
                        }
                    }, j);
                    break;
                case 614982561:
                case 1230264420:
                    i7 = 30491;
                    iM55979 = C0946.m55979("۬۬") ^ i3;
                    i = ((iM55979 ^ i4) * (-22831)) ^ 1986123614;
                    i2 = 971578932;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1607105778:
                case 1764364015:
                    i7 = 53263;
                    iM55979 = C0946.m55979("۬۬") ^ i3;
                    i = ((iM55979 ^ i4) * (-22831)) ^ 1986123614;
                    i2 = 971578932;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    z = true;
                    if (C0989.m56095() <= 0) {
                        iM55979 = (C0873.m55680("ܳ᩺") ^ i3) * (-99);
                        i = ((iM55979 ^ i4) * (-4325)) ^ (-1526990740);
                        i2 = 1216290886;
                    } else {
                        iM55979 = (C0946.m55979("۟᩵") ^ i4) * 67;
                        i = ((iM55979 ^ i3) * 18167) ^ (-2015667341);
                        i2 = 857272887;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3393() {
        this.f3728 = true;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x048c A[PHI: r16 r17 r30
      0x048c: PHI (r16v4 android.text.Editable) = (r16v2 android.text.Editable), (r16v3 android.text.Editable), (r16v2 android.text.Editable) binds: [B:105:0x048a, B:81:0x036c, B:14:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r17v4 java.lang.String) = (r17v3 java.lang.String), (r17v2 java.lang.String), (r17v2 java.lang.String) binds: [B:105:0x048a, B:81:0x036c, B:14:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x048c: PHI (r30v52 int) = (r30v31 int), (r30v35 int), (r30v53 int) binds: [B:105:0x048a, B:81:0x036c, B:14:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x0806 A[PHI: r4 r5 r18 r19 r20 r21 r22 r25 r26 r27 r28 r30 r34 r35
      0x0806: PHI (r4v5 int) = (r4v4 int), (r4v6 int) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x0806: PHI (r5v5 int) = (r5v4 int), (r5v6 int) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x0806: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x0806: PHI (r19v4 char) = (r19v3 char), (r19v2 char) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x0806: PHI (r20v3 short) = (r20v2 short), (r20v4 short) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x0806: PHI (r21v3 int) = (r21v2 int), (r21v4 int) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x0806: PHI (r22v4 int) = (r22v3 int), (r22v5 int) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x0806: PHI (r25v4 l.᩵֡ۡ) = (r25v3 l.᩵֡ۡ), (r25v5 l.᩵֡ۡ) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x0806: PHI (r26v5 int) = (r26v4 int), (r26v6 int) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x0806: PHI (r27v5 short[]) = (r27v4 short[]), (r27v6 short[]) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x0806: PHI (r28v4 boolean) = (r28v3 boolean), (r28v5 boolean) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x0806: PHI (r30v3 int) = (r30v2 int), (r30v4 int) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x0806: PHI (r34v7 short[]) = (r34v6 short[]), (r34v8 short[]) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x0806: PHI (r35v1 int) = (r35v0 int), (r35v2 int) binds: [B:161:0x0804, B:157:0x07cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02d2 A[PHI: r30
      0x02d2: PHI (r30v39 int) = (r30v38 int), (r30v40 int) binds: [B:69:0x02bb, B:66:0x029c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int iM55979;
        int i2;
        int i3;
        int i4;
        int iM559710;
        int iM559711;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iM559712;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM55680;
        int i15;
        ViewOnClickListenerC2424 viewOnClickListenerC2424 = this;
        int iM55718 = 0;
        DialogInterfaceC2564 dialogInterfaceC2564 = null;
        String strM55639 = null;
        String strM556310 = null;
        short[] sArr = null;
        int i16 = 748516027;
        int i17 = C0866.f81837;
        int i18 = C0845.f81821;
        int iM559713 = (C0946.m55979("ۤۢ") + i17) * 23;
        int i19 = ((iM559713 ^ i18) * 10689) ^ 2015813745;
        int i20 = iM559713 ^ (-6593924);
        TextInputLayout[] textInputLayoutArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i21 = 0;
        boolean z = false;
        int i22 = 0;
        char c = 0;
        short s = 0;
        int i23 = 0;
        int iM55719 = 0;
        int i24 = 0;
        int iM55874 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        AbstractActivityC5549 abstractActivityC5549 = null;
        C20531 c20531 = null;
        String strM55707 = null;
        int i29 = 0;
        Editable editableM56288 = null;
        TextInputLayout textInputLayout = null;
        TextInputLayout textInputLayout2 = null;
        boolean z2 = false;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i18) * (-28133)) >> 31));
            switch (i16) {
                case -2126229432:
                case -1823945256:
                    i10 = i22;
                    strM55707 = C0877.m55707(f81822, 149, 3, i21);
                    if (C1124.f82007 >= 0) {
                        iM559712 = C0873.m55680("᩸ۙ") ^ i17;
                        i11 = ((iM559712 ^ i18) * (-7085)) ^ 205421043;
                        i12 = -11308212;
                    } else {
                        iM559712 = C0946.m55979("֫ۘ") ^ i17;
                        i11 = ((iM559712 ^ i18) * 25041) ^ (-880529205);
                        i12 = 1682465478;
                    }
                    i20 = iM559712 ^ i12;
                    i19 = i11;
                    i22 = i10;
                    break;
                case -2019466965:
                case -1349555937:
                    C0882.m55710();
                    if (!C0947.f81895) {
                        i10 = i22;
                        iM559712 = C0873.m55680("᩸ۙ") ^ i17;
                        i11 = ((iM559712 ^ i18) * (-7085)) ^ 205421043;
                        i12 = -11308212;
                        i20 = iM559712 ^ i12;
                        i19 = i11;
                        i22 = i10;
                    } else {
                        iM55680 = C0946.m55979("ܺۜ") ^ i17;
                        i14 = ((iM55680 ^ i18) * 30713) ^ (-904836511);
                        i15 = 1792956718;
                        i20 = iM55680 ^ i15;
                        i19 = i14;
                    }
                    break;
                case -1953819471:
                case 1550516601:
                    iM55719 = iM55719;
                    i26 = i26;
                    sArr3 = sArr3;
                    i27 = i27;
                    i28 = i28;
                    sArr = sArr;
                    c20531 = c20531;
                    z = z ? 1 : 0;
                    int i30 = i25;
                    i29 = i29;
                    i = i30;
                    int i31 = s + 1;
                    if ((i23 + 1) - (i31 * i31) <= 0) {
                        iM55979 = C0946.m55979("ᩴۡ") ^ i17;
                        i2 = ((iM55979 ^ i18) * (-8983)) ^ (-1907738782);
                        i3 = -1462016118;
                    } else {
                        iM55979 = C0946.m55979("ۚܽ") ^ i18;
                        i2 = ((iM55979 ^ i17) * (-13647)) ^ 1330187302;
                        i3 = -414214282;
                    }
                    i9 = iM55979 ^ i3;
                    i19 = i2;
                    i28 = i28;
                    i27 = i27;
                    z = z;
                    sArr3 = sArr3;
                    iM55719 = iM55719;
                    i20 = i9;
                    c20531 = c20531;
                    sArr = sArr;
                    i26 = i26;
                    viewOnClickListenerC2424 = this;
                    int i32 = i29;
                    i25 = i;
                    i29 = i32;
                    break;
                case -1951247118:
                case 421121607:
                    i10 = i22;
                    if (C0882.m55719(strM556310) < 7) {
                        iM559712 = C0873.m55680("᩷᩺") ^ i17;
                        i11 = ((iM559712 ^ i18) * 12781) ^ 234138357;
                        i12 = -2059796217;
                    } else {
                        iM559712 = C0873.m55680("ܽ᩸") ^ i17;
                        i11 = ((iM559712 ^ i18) * (-24899)) ^ (-1914284739);
                        i12 = -499658720;
                    }
                    i20 = iM559712 ^ i12;
                    i19 = i11;
                    i22 = i10;
                    break;
                case -1899185617:
                case 382034770:
                    i10 = i22;
                    EditText editTextM55656 = C0866.m55656(textInputLayout2);
                    C0877.m55699(editTextM55656);
                    strM55639 = C0863.m55639(C0989.m56089(editTextM55656));
                    if (RunnableC0871.f81839 >= 0) {
                        iM559712 = (i17 - C0946.m55979("ۘᩴ")) * 61;
                        i11 = ((iM559712 ^ i18) * (-10623)) ^ (-1481163208);
                        i12 = 957404493;
                    } else {
                        iM559712 = (C0873.m55680("ۢ۫") + i18) * (-43);
                        i11 = ((iM559712 ^ i17) * 22953) ^ 671276765;
                        i12 = -777960185;
                    }
                    i20 = iM559712 ^ i12;
                    i19 = i11;
                    i22 = i10;
                    break;
                case -1896668315:
                case 2119083322:
                    viewOnClickListenerC2424.m3384(z2);
                    C8460 c8460 = new C8460(viewOnClickListenerC2424, strM556310);
                    i10 = i22;
                    if (C0898.f81858 > 0) {
                        C1404.m56457(new Thread(new RunnableC19880(0, strM556310, strM55639, abstractActivityC5549, c8460)));
                    }
                    iM559712 = (i17 - C0946.m55979("ۘᩴ")) * 61;
                    i11 = ((iM559712 ^ i18) * (-10623)) ^ (-1481163208);
                    i12 = 957404493;
                    i20 = iM559712 ^ i12;
                    i19 = i11;
                    i22 = i10;
                    break;
                case -1833225737:
                case 1927784183:
                    iM55719 = iM55719;
                    i26 = i26;
                    sArr3 = sArr3;
                    i28 = i28;
                    sArr = sArr;
                    c20531 = c20531;
                    z = z ? 1 : 0;
                    int i33 = i25;
                    i29 = i29;
                    i = i33;
                    i27 = i27;
                    RunnableC0871.m55661(view, C0947.m55993(f81822, 139, 1, i21));
                    if (C1044.m56281(f3725)) {
                        iM55979 = (C0946.m55979("ܽܶ") + i17) * (-37);
                        i2 = ((iM55979 ^ i18) * 30823) ^ 446243569;
                        i3 = -136021478;
                    } else {
                        iM55979 = C0946.m55979("ۙܰ") ^ i18;
                        i2 = ((iM55979 ^ i17) * 30901) ^ (-2040063619);
                        i3 = -1434654253;
                    }
                    i9 = iM55979 ^ i3;
                    i19 = i2;
                    i28 = i28;
                    i27 = i27;
                    z = z;
                    sArr3 = sArr3;
                    iM55719 = iM55719;
                    i20 = i9;
                    c20531 = c20531;
                    sArr = sArr;
                    i26 = i26;
                    viewOnClickListenerC2424 = this;
                    int i34 = i29;
                    i25 = i;
                    i29 = i34;
                    break;
                case -1821404100:
                case 1507600442:
                    if (C0894.f81854 >= 0) {
                        i13 = i29;
                        int iM559714 = C0946.m55979("֨ܺ") ^ i18;
                        short[] sArr5 = sArr;
                        i19 = ((iM559714 ^ i17) * (-30063)) ^ (-693718297);
                        i20 = iM559714 ^ (-844806257);
                        i29 = i13;
                        i25 = i25;
                        c20531 = c20531;
                        sArr = sArr5;
                    } else {
                        i10 = i22;
                        iM559712 = C0873.m55680("᩸ۙ") ^ i17;
                        i11 = ((iM559712 ^ i18) * (-7085)) ^ 205421043;
                        i12 = -11308212;
                        i20 = iM559712 ^ i12;
                        i19 = i11;
                        i22 = i10;
                    }
                    break;
                case -1803854165:
                case -774876961:
                    C1036.m56257();
                    if (C1071.m56343() != 0) {
                        iM55680 = (i18 - C0946.m55979("۫᩶")) * 11;
                        i14 = ((iM55680 ^ i17) * (-21031)) ^ 1272437407;
                        i15 = 1954709823;
                        i20 = iM55680 ^ i15;
                        i19 = i14;
                    } else {
                        i13 = i29;
                        int iM559715 = C0946.m55979("֨ܺ") ^ i18;
                        short[] sArr6 = sArr;
                        i19 = ((iM559715 ^ i17) * (-30063)) ^ (-693718297);
                        i20 = iM559715 ^ (-844806257);
                        i29 = i13;
                        i25 = i25;
                        c20531 = c20531;
                        sArr = sArr6;
                    }
                    break;
                case -1698838753:
                case 1043667058:
                    new ViewOnClickListenerC15835(abstractActivityC5549, dialogInterfaceC2564);
                    C1024.m56208(dialogInterfaceC2564);
                    break;
                case -1576995073:
                case -1486171269:
                    if (!C0967.m56074()) {
                        iM55680 = (i18 - C0946.m55979("۫᩶")) * 11;
                        i14 = ((iM55680 ^ i17) * (-21031)) ^ 1272437407;
                        i15 = 1954709823;
                        i20 = iM55680 ^ i15;
                        i19 = i14;
                    } else {
                        i10 = i22;
                        iM559712 = (i17 - C0946.m55979("ۘᩴ")) * 61;
                        i11 = ((iM559712 ^ i18) * (-10623)) ^ (-1481163208);
                        i12 = 957404493;
                        i20 = iM559712 ^ i12;
                        i19 = i11;
                        i22 = i10;
                    }
                    break;
                case -1572870970:
                case 1210540654:
                    break;
                case -1507567552:
                case -770473251:
                    int i35 = i26;
                    short[] sArr7 = sArr;
                    int i36 = i25;
                    i29 = i29;
                    i = i36;
                    C20531 c20532 = new C20531(viewOnClickListenerC2424.m3384(z), viewOnClickListenerC2424);
                    int iM557110 = C0882.m55718(view);
                    Object[] objArr = z ? 1 : 0;
                    i24 = i24;
                    if (iM557110 == i24) {
                        iM559711 = (C0946.m55979("ۛ᩺") ^ i18) * 51;
                        i5 = ((iM559711 ^ i17) * (-25409)) ^ 615502693;
                        i6 = -1215306375;
                    } else {
                        iM559711 = C0946.m55979("ۖ᩸") ^ i18;
                        i5 = ((iM559711 ^ i17) * (-27223)) ^ 1504733343;
                        i6 = -317590721;
                    }
                    i20 = iM559711 ^ i6;
                    i19 = i5;
                    sArr = sArr7;
                    z = objArr == true ? 1 : 0;
                    i26 = i35;
                    c20531 = c20532;
                    int i37 = i29;
                    i25 = i;
                    i29 = i37;
                    break;
                case -1415079792:
                case -1005635337:
                    i10 = i22;
                    strM556310 = C0863.m55639(editableM56288);
                    if (C5235.m11295((CharSequence) strM55639, (CharSequence) C0955.m56029(f81822, 152, 1, i21), z2)) {
                        iM559712 = C0946.m55979("᩸֨") ^ i17;
                        i11 = ((iM559712 ^ i18) * 32317) ^ (-1433195657);
                        i12 = 657328049;
                    } else {
                        iM559712 = (C0946.m55979("ۖ᩻") ^ i18) * 71;
                        i11 = ((iM559712 ^ i17) * 7591) ^ (-921309586);
                        i12 = -823816726;
                    }
                    i20 = iM559712 ^ i12;
                    i19 = i11;
                    i22 = i10;
                    break;
                case -1353762195:
                case -1232017219:
                    RunnableC1014.m56168(textInputLayout2, C0873.m55680(C0937.m55921(f81822, 159, 3, i21)) ^ 2097743574);
                    break;
                case -1253692883:
                case 1182051620:
                    new ViewOnClickListenerC19209(abstractActivityC5549, dialogInterfaceC2564);
                    C1024.m56208(dialogInterfaceC2564);
                    break;
                case -1241650737:
                case 1465144308:
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0873.m55680("ۡ᩶") ^ i18) * 51;
                        i14 = ((iM55680 ^ i17) * (-17897)) ^ (-1178216278);
                        i15 = 1837261143;
                        i20 = iM55680 ^ i15;
                        i19 = i14;
                    } else {
                        i10 = i22;
                        iM559712 = C0873.m55680("᩸ۙ") ^ i17;
                        i11 = ((iM559712 ^ i18) * (-7085)) ^ 205421043;
                        i12 = -11308212;
                        i20 = iM559712 ^ i12;
                        i19 = i11;
                        i22 = i10;
                    }
                    break;
                case -1150582200:
                case 1471373398:
                    i10 = i22;
                    int iM559716 = C0946.m55979(strM55707) ^ 2118682522;
                    dialogInterfaceC2564 = viewOnClickListenerC2424.f3732;
                    if (iM55718 == iM559716) {
                        iM559712 = C0946.m55979("᩹ۨ") ^ i17;
                        i11 = ((iM559712 ^ i18) * (-22357)) ^ 678390756;
                        i12 = -1722498904;
                    } else {
                        iM559712 = C0873.m55680("֡᩹") ^ i17;
                        i11 = ((iM559712 ^ i18) * (-10103)) ^ 1524639325;
                        i12 = -518617463;
                    }
                    i20 = iM559712 ^ i12;
                    i19 = i11;
                    i22 = i10;
                    break;
                case -1020570327:
                case 1254536876:
                    AbstractC0942.m55968(textInputLayout2, C0873.m55680(C0892.m55750(f81822, 156, 3, i21)) ^ 2104633238);
                    break;
                case -978289955:
                case 415464999:
                    C0930.m55885();
                    C0992.m56107();
                    i10 = i22;
                    iM559712 = C0873.m55680("᩸ۙ") ^ i17;
                    i11 = ((iM559712 ^ i18) * (-7085)) ^ 205421043;
                    i12 = -11308212;
                    i20 = iM559712 ^ i12;
                    i19 = i11;
                    i22 = i10;
                    break;
                case -944535914:
                case 544415278:
                    C1053.m56327();
                    break;
                case -863465679:
                case 99724226:
                    i10 = i22;
                    if (C24553.m54156(strM55639)) {
                        iM559712 = C0873.m55680("۟ۡ") ^ i18;
                        i11 = ((iM559712 ^ i17) * (-27637)) ^ 1399580155;
                        i12 = -440661778;
                    } else {
                        iM559712 = (C0946.m55979("ۤۖ") ^ i18) * 101;
                        i11 = ((iM559712 ^ i17) * 22291) ^ 1940922506;
                        i12 = 36307216;
                    }
                    i20 = iM559712 ^ i12;
                    i19 = i11;
                    i22 = i10;
                    break;
                case -789440381:
                case 1139348838:
                    short[] sArr8 = sArr4;
                    if (iM55718 == (C0873.m55680(C0854.m55597(sArr8, i22, i29, i21)) ^ 2127720195)) {
                        int iM559717 = (C0946.m55979("ۙۨ") ^ i18) * (-71);
                        sArr4 = sArr8;
                        i19 = ((iM559717 ^ i17) * 13361) ^ 1077139025;
                        i20 = iM559717 ^ (-371480393);
                    } else {
                        sArr4 = sArr8;
                        iM55680 = C0946.m55979("᩷᩹") ^ i17;
                        i14 = ((iM55680 ^ i18) * (-7121)) ^ (-356388954);
                        i15 = 1583630505;
                        i20 = iM55680 ^ i15;
                        i19 = i14;
                    }
                    break;
                case -778889000:
                case 948767181:
                    C0845.m55584();
                    if (C0906.f81862 < 0) {
                        i26 = i26;
                        sArr = sArr;
                        c20531 = c20531;
                        int i38 = i25;
                        i29 = i29;
                        i = i38;
                        iM559710 = C0946.m55979("ۙܿ") ^ i17;
                        i19 = ((iM559710 ^ i18) * 25089) ^ 1816580296;
                        i4 = 1280055737;
                        i20 = iM559710 ^ i4;
                        viewOnClickListenerC2424 = this;
                        c20531 = c20531;
                        sArr = sArr;
                        i26 = i26;
                        int i39 = i29;
                        i25 = i;
                        i29 = i39;
                    } else {
                        i13 = i29;
                        int iM559718 = C0946.m55979("֨ܺ") ^ i18;
                        short[] sArr9 = sArr;
                        i19 = ((iM559718 ^ i17) * (-30063)) ^ (-693718297);
                        i20 = iM559718 ^ (-844806257);
                        i29 = i13;
                        i25 = i25;
                        c20531 = c20531;
                        sArr = sArr9;
                    }
                    break;
                case -773817577:
                case 334562887:
                    iM55718 = C0882.m55718(view);
                    sArr4 = f81822;
                    i22 = 146;
                    i29 = 3;
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0946.m55979("ܺۜ") ^ i17;
                        i14 = ((iM55680 ^ i18) * 30713) ^ (-904836511);
                        i15 = 1792956718;
                    } else {
                        iM55680 = (i18 - C0873.m55680("ᩳۢ")) * 67;
                        i14 = ((iM55680 ^ i17) * 22857) ^ 880286986;
                        i15 = -827564297;
                    }
                    i20 = iM55680 ^ i15;
                    i19 = i14;
                    break;
                case -757371989:
                case 1039428521:
                    iM55719 = iM55719;
                    i26 = i26;
                    sArr3 = sArr3;
                    i27 = i27;
                    i28 = i28;
                    sArr = sArr;
                    c20531 = c20531;
                    z = z ? 1 : 0;
                    int i40 = i25;
                    i29 = i29;
                    i = i40;
                    s = sArr2[c];
                    i23 = s * 2;
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0873.m55680("ۧۗ") + i18) * 101;
                        i2 = ((iM55979 ^ i17) * 17155) ^ (-1513488792);
                        i3 = 259742296;
                    } else {
                        iM55979 = (i18 - C0946.m55979("ۘ᩻")) * (-29);
                        i2 = ((iM55979 ^ i17) * (-1305)) ^ (-634899019);
                        i3 = -353525175;
                    }
                    i9 = iM55979 ^ i3;
                    i19 = i2;
                    i28 = i28;
                    i27 = i27;
                    z = z;
                    sArr3 = sArr3;
                    iM55719 = iM55719;
                    i20 = i9;
                    c20531 = c20531;
                    sArr = sArr;
                    i26 = i26;
                    viewOnClickListenerC2424 = this;
                    int i310 = i29;
                    i25 = i;
                    i29 = i310;
                    break;
                case -674408634:
                case 47386927:
                    i10 = i22;
                    textInputLayoutArr[z2 ? 1 : 0] = textInputLayout2;
                    textInputLayout = viewOnClickListenerC2424.f3727;
                    textInputLayoutArr[z ? 1 : 0] = textInputLayout;
                    if (!C2641.m4032(textInputLayoutArr)) {
                        iM559712 = C0946.m55979("ܺܽ") ^ i18;
                        i11 = ((iM559712 ^ i17) * 25317) ^ (-849493334);
                        i12 = 1919500327;
                        i20 = iM559712 ^ i12;
                        i19 = i11;
                        i22 = i10;
                    } else {
                        iM55719 = iM55719;
                        i22 = i10;
                        sArr3 = sArr3;
                        i27 = i27;
                        i28 = i28;
                        i26 = i26;
                        sArr = sArr;
                        c20531 = c20531;
                        z = z ? 1 : 0;
                        int i41 = i25;
                        i29 = i29;
                        i = i41;
                        iM55979 = (C0946.m55979("ܽܶ") + i17) * (-37);
                        i2 = ((iM55979 ^ i18) * 30823) ^ 446243569;
                        i3 = -136021478;
                        i9 = iM55979 ^ i3;
                        i19 = i2;
                        i28 = i28;
                        i27 = i27;
                        z = z;
                        sArr3 = sArr3;
                        iM55719 = iM55719;
                        i20 = i9;
                        c20531 = c20531;
                        sArr = sArr;
                        i26 = i26;
                        viewOnClickListenerC2424 = this;
                        int i311 = i29;
                        i25 = i;
                        i29 = i311;
                    }
                    break;
                case -589038552:
                case 491510177:
                    i10 = i22;
                    if (C0927.m55878(strM55639) < 4) {
                        iM559712 = C0946.m55979("֨᩶") ^ i18;
                        i11 = ((iM559712 ^ i17) * 29233) ^ 1883633277;
                        i12 = 559235381;
                    } else {
                        iM559712 = (C0946.m55979("ۗۚ") + i17) * (-35);
                        i11 = ((iM559712 ^ i18) * 6945) ^ 1587341718;
                        i12 = 2080176972;
                    }
                    i20 = iM559712 ^ i12;
                    i19 = i11;
                    i22 = i10;
                    break;
                case -571435600:
                case 527156331:
                    AbstractC0942.m55968(textInputLayout2, C0873.m55680(C0947.m55993(f81822, 153, 3, i21)) ^ 2128123483);
                    break;
                case -511725031:
                case 1457074159:
                    i26 = i26;
                    sArr = sArr;
                    c20531 = c20531;
                    int i42 = i25;
                    i29 = i29;
                    i = i42;
                    iM55719 = C0882.m55718(view);
                    z = true;
                    z = true;
                    sArr3 = f81822;
                    i27 = 140;
                    i28 = 3;
                    if (C0898.f81858 <= 0) {
                        iM559710 = C0946.m55979("ۙܿ") ^ i17;
                        i19 = ((iM559710 ^ i18) * 25089) ^ 1816580296;
                        i4 = 1280055737;
                    } else {
                        iM559710 = (C0873.m55680("ۡ۫") + i18) * 37;
                        i19 = ((iM559710 ^ i17) * (-15709)) ^ 2118963675;
                        i4 = 147086016;
                    }
                    i20 = iM559710 ^ i4;
                    viewOnClickListenerC2424 = this;
                    c20531 = c20531;
                    sArr = sArr;
                    i26 = i26;
                    int i312 = i29;
                    i25 = i;
                    i29 = i312;
                    break;
                case -494900827:
                case 1473743521:
                    C13686.m31090(abstractActivityC5549, c20531);
                    break;
                case -490499679:
                case 1479161996:
                    i13 = i29;
                    c20531 = c20531;
                    iM55874 = C0927.m55874(view);
                    sArr = f81822;
                    i26 = 143;
                    if (!C0873.m55678()) {
                        int iM559719 = C0946.m55979("ۚ֫") ^ i17;
                        i14 = ((iM559719 ^ i18) * 15075) ^ (-700935106);
                        i20 = iM559719 ^ (-1552083736);
                        c20531 = c20531;
                        i29 = i13;
                        i25 = 3;
                        sArr = sArr;
                        i19 = i14;
                    } else {
                        i25 = 3;
                        int iM5597110 = C0946.m55979("֨ܺ") ^ i18;
                        short[] sArr10 = sArr;
                        i19 = ((iM5597110 ^ i17) * (-30063)) ^ (-693718297);
                        i20 = iM5597110 ^ (-844806257);
                        i29 = i13;
                        i25 = i25;
                        c20531 = c20531;
                        sArr = sArr10;
                    }
                    break;
                case -367952314:
                case -203691029:
                    iM55719 = iM55719;
                    i26 = i26;
                    sArr3 = sArr3;
                    i27 = i27;
                    i28 = i28;
                    sArr = sArr;
                    c20531 = c20531;
                    z = z ? 1 : 0;
                    int i43 = i25;
                    i29 = i29;
                    i = i43;
                    sArr2 = f81822;
                    c = 138;
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0873.m55680("ۧۗ") + i18) * 101;
                        i2 = ((iM55979 ^ i17) * 17155) ^ (-1513488792);
                        i3 = 259742296;
                    } else {
                        iM55979 = C0946.m55979("ۨᩴ") ^ i17;
                        i2 = ((iM55979 ^ i18) * 17291) ^ 1650671470;
                        i3 = 234409252;
                    }
                    i9 = iM55979 ^ i3;
                    i19 = i2;
                    i28 = i28;
                    i27 = i27;
                    z = z;
                    sArr3 = sArr3;
                    iM55719 = iM55719;
                    i20 = i9;
                    c20531 = c20531;
                    sArr = sArr;
                    i26 = i26;
                    viewOnClickListenerC2424 = this;
                    int i313 = i29;
                    i25 = i;
                    i29 = i313;
                    break;
                case -133272702:
                case 1983404397:
                    i10 = i22;
                    if (C24553.m54152(strM55639)) {
                        iM559712 = C0873.m55680("۟ۡ") ^ i18;
                        i11 = ((iM559712 ^ i17) * (-27637)) ^ 1399580155;
                        i12 = -440661778;
                    } else {
                        iM559712 = C0873.m55680("۟᩻") ^ i17;
                        i11 = ((iM559712 ^ i18) * (-14357)) ^ 736412729;
                        i12 = -1780150317;
                    }
                    i20 = iM559712 ^ i12;
                    i19 = i11;
                    i22 = i10;
                    break;
                case 30741195:
                case 822144086:
                    C0927.m55873();
                    if (C1028.f81950 <= 0) {
                        iM55680 = (C0873.m55680("ۨۚ") ^ i17) * 87;
                        i14 = ((iM55680 ^ i18) * (-6145)) ^ (-415387218);
                        i15 = -841528896;
                        i20 = iM55680 ^ i15;
                        i19 = i14;
                    } else {
                        i10 = i22;
                        iM559712 = C0873.m55680("᩸ۙ") ^ i17;
                        i11 = ((iM559712 ^ i18) * (-7085)) ^ 205421043;
                        i12 = -11308212;
                        i20 = iM559712 ^ i12;
                        i19 = i11;
                        i22 = i10;
                    }
                    break;
                case 76079413:
                case 132010739:
                    i10 = i22;
                    textInputLayoutArr = new TextInputLayout[2];
                    z2 = false;
                    z2 = false;
                    textInputLayout2 = viewOnClickListenerC2424.f3729;
                    if (C1012.m56134() > 0) {
                        iM559712 = C0946.m55979("۠֨") ^ i18;
                        i11 = ((iM559712 ^ i17) * 6891) ^ (-1840195863);
                        i12 = -25766228;
                        i20 = iM559712 ^ i12;
                        i19 = i11;
                        i22 = i10;
                    } else {
                        i22 = i10;
                        i13 = i29;
                        int iM5597111 = C0946.m55979("֨ܺ") ^ i18;
                        short[] sArr11 = sArr;
                        i19 = ((iM5597111 ^ i17) * (-30063)) ^ (-693718297);
                        i20 = iM5597111 ^ (-844806257);
                        i29 = i13;
                        i25 = i25;
                        c20531 = c20531;
                        sArr = sArr11;
                    }
                    break;
                case 197056062:
                case 304248518:
                    if (C0854.f81826 != 0) {
                        iM55680 = (i18 - C0946.m55979("᩹֨")) * (-19);
                        i14 = ((iM55680 ^ i17) * (-19535)) ^ 12819179;
                        i15 = -1417184793;
                        i20 = iM55680 ^ i15;
                        i19 = i14;
                    } else {
                        i10 = i22;
                        iM559712 = C0873.m55680("᩸ۙ") ^ i17;
                        i11 = ((iM559712 ^ i18) * (-7085)) ^ 205421043;
                        i12 = -11308212;
                        i20 = iM559712 ^ i12;
                        i19 = i11;
                        i22 = i10;
                    }
                    break;
                case 265636189:
                case 1511660007:
                    AbstractC0942.m55968(textInputLayout, C0946.m55979(C0927.m55863(f81822, 162, 3, i21)) ^ 2123188787);
                    break;
                case 297009174:
                case 1692275251:
                    C13686.m31087(abstractActivityC5549, c20531);
                    break;
                case 444922434:
                case 1024752888:
                    i10 = i22;
                    if (C24553.m54154(strM556310)) {
                        iM559712 = C0873.m55680("᩵ᩴ") ^ i18;
                        i11 = ((iM559712 ^ i17) * (-19319)) ^ 1959381584;
                        i12 = 1918202033;
                    } else {
                        iM559712 = (i18 - C0873.m55680("ۡۧ")) * (-49);
                        i11 = ((iM559712 ^ i17) * (-7161)) ^ 1993813045;
                        i12 = -2075338022;
                    }
                    i20 = iM559712 ^ i12;
                    i19 = i11;
                    i22 = i10;
                    break;
                case 468341150:
                case 2044460483:
                    i = i25;
                    i21 = 37133;
                    iM55979 = (C0946.m55979("ۢۜ") + i17) * 79;
                    i2 = ((iM55979 ^ i18) * 28377) ^ 13005528;
                    i3 = -1362352604;
                    i9 = iM55979 ^ i3;
                    i19 = i2;
                    i28 = i28;
                    i27 = i27;
                    z = z;
                    sArr3 = sArr3;
                    iM55719 = iM55719;
                    i20 = i9;
                    c20531 = c20531;
                    sArr = sArr;
                    i26 = i26;
                    viewOnClickListenerC2424 = this;
                    int i314 = i29;
                    i25 = i;
                    i29 = i314;
                    break;
                case 549674289:
                case 751840348:
                    RunnableC1014.m56168(textInputLayout, C0873.m55680(C0917.m55852(f81822, 165, 3, i21)) ^ 2101450489);
                    break;
                case 679195969:
                case 1102991651:
                    i10 = i22;
                    EditText editTextM55882 = C0930.m55882(textInputLayout);
                    C0949.m56008(editTextM55882);
                    editableM56288 = C1046.m56288(editTextM55882);
                    if (C1012.f81938 >= 0) {
                        iM559712 = C0873.m55680("᩸ۙ") ^ i17;
                        i11 = ((iM559712 ^ i18) * (-7085)) ^ 205421043;
                        i12 = -11308212;
                    } else {
                        iM559712 = (i17 - C0946.m55979("ۧۛ")) * (-41);
                        i11 = ((iM559712 ^ i18) * 7787) ^ 185089665;
                        i12 = -388165655;
                    }
                    i20 = iM559712 ^ i12;
                    i19 = i11;
                    i22 = i10;
                    break;
                case 1462175535:
                case 2086574330:
                    short[] sArr12 = sArr;
                    int i44 = i26;
                    c20531 = c20531;
                    int i45 = i25;
                    i29 = i29;
                    i = i45;
                    i26 = i44;
                    int iM55681 = C0873.m55680(C1048.m56318(sArr12, i44, i, i21)) ^ 2125453100;
                    sArr = sArr12;
                    int i46 = iM55874;
                    if (i46 != iM55681) {
                        int iM55682 = C0873.m55680("ۖ᩶") ^ i17;
                        iM55874 = i46;
                        i20 = iM55682 ^ (-858603996);
                        i19 = ((iM55682 ^ i18) * (-27965)) ^ (-158736344);
                        c20531 = c20531;
                        sArr = sArr;
                        i26 = i26;
                        int i315 = i29;
                        i25 = i;
                        i29 = i315;
                    } else {
                        z = z ? 1 : 0;
                        iM55874 = i46;
                        iM55719 = iM55719;
                        sArr3 = sArr3;
                        i7 = i27;
                        i8 = i28;
                        int iM559720 = C0946.m55979("۠ܶ") ^ i17;
                        i19 = ((iM559720 ^ i18) * (-16637)) ^ 1241710023;
                        i9 = iM559720 ^ 2030555669;
                        i27 = i7;
                        i28 = i8;
                        z = z;
                        sArr3 = sArr3;
                        iM55719 = iM55719;
                        i20 = i9;
                        c20531 = c20531;
                        sArr = sArr;
                        i26 = i26;
                        viewOnClickListenerC2424 = this;
                        int i316 = i29;
                        i25 = i;
                        i29 = i316;
                    }
                    break;
                case 1774716715:
                case 2012941156:
                    i = i25;
                    i21 = 28525;
                    iM55979 = (C0946.m55979("ۢۜ") + i17) * 79;
                    i2 = ((iM55979 ^ i18) * 28377) ^ 13005528;
                    i3 = -1362352604;
                    i9 = iM55979 ^ i3;
                    i19 = i2;
                    i28 = i28;
                    i27 = i27;
                    z = z;
                    sArr3 = sArr3;
                    iM55719 = iM55719;
                    i20 = i9;
                    c20531 = c20531;
                    sArr = sArr;
                    i26 = i26;
                    viewOnClickListenerC2424 = this;
                    int i317 = i29;
                    i25 = i;
                    i29 = i317;
                    break;
                default:
                    i26 = i26;
                    short[] sArr13 = sArr3;
                    i8 = i28;
                    sArr = sArr;
                    c20531 = c20531;
                    z = z ? 1 : 0;
                    i7 = i27;
                    int i47 = i25;
                    i29 = i29;
                    i = i47;
                    int iM559721 = C0946.m55979(C1024.m56203(sArr13, i7, i8, i21)) ^ 2118347886;
                    sArr3 = sArr13;
                    AbstractActivityC5549 abstractActivityC55410 = viewOnClickListenerC2424.f3731;
                    int i48 = iM55719;
                    if (i48 != iM559721) {
                        int iM55683 = (C0873.m55680("ܰۢ") ^ i18) * (-39);
                        int i49 = ((iM55683 ^ i17) * (-17399)) ^ 1388852623;
                        i27 = i7;
                        i28 = i8;
                        i24 = iM559721;
                        z = z ? 1 : 0;
                        sArr3 = sArr3;
                        abstractActivityC5549 = abstractActivityC55410;
                        i20 = iM55683 ^ (-627234147);
                        c20531 = c20531;
                        sArr = sArr;
                        i26 = i26;
                        iM55719 = i48;
                        i19 = i49;
                    } else {
                        iM55719 = i48;
                        i24 = iM559721;
                        abstractActivityC5549 = abstractActivityC55410;
                        int iM559722 = C0946.m55979("۠ܶ") ^ i17;
                        i19 = ((iM559722 ^ i18) * (-16637)) ^ 1241710023;
                        i9 = iM559722 ^ 2030555669;
                        i27 = i7;
                        i28 = i8;
                        z = z;
                        sArr3 = sArr3;
                        iM55719 = iM55719;
                        i20 = i9;
                        c20531 = c20531;
                        sArr = sArr;
                        i26 = i26;
                    }
                    viewOnClickListenerC2424 = this;
                    int i318 = i29;
                    i25 = i;
                    i29 = i318;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m3389(ViewOnClickListenerC2424 viewOnClickListenerC2424) {
        int i = -1105148104;
        int i2 = C1028.f81950;
        int i3 = C0894.f81854;
        int iM55680 = (C0873.m55680("ܶ᩶") ^ i3) * 67;
        int i4 = ((iM55680 ^ i2) * (-26177)) ^ (-308777834);
        int i5 = -874034628;
        while (true) {
            i = ((((i ^ i2) * (-10335)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2004172525:
                case 378211912:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = (C0873.m55680("ۚ֨") ^ i3) * 95;
                        i4 = ((iM55680 ^ i2) * 18333) ^ 787834847;
                        i5 = 491712602;
                    } else {
                        iM55680 = C0946.m55979("ۢܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 27359) ^ (-699471716);
                        i5 = 360929069;
                    }
                    break;
                case -1137897818:
                case -853493406:
                    C0861.m55626();
                    C0946.m55980();
                    iM55680 = (C0873.m55680("ۘۡ") ^ i2) * 53;
                    i4 = ((iM55680 ^ i3) * (-4817)) ^ (-338466702);
                    i5 = 836237195;
                    break;
                case -850554297:
                case 1474080051:
                    if (C0861.m55626()) {
                        iM55680 = (C0873.m55680("ۘۡ") ^ i2) * 53;
                        i4 = ((iM55680 ^ i3) * (-4817)) ^ (-338466702);
                        i5 = 836237195;
                    } else {
                        if (C0967.f81910 < 0) {
                            if (C1044.f81959 < 0) {
                                if (C1929.m56553()) {
                                    iM55680 = C0946.m55979("ۢܶ") ^ i2;
                                    i4 = ((iM55680 ^ i3) * 27359) ^ (-699471716);
                                    i5 = 360929069;
                                } else {
                                    if (RunnableC0871.f81839 < 0) {
                                        if (C0930.m55885() > 0) {
                                            if (C0892.f81851 && RunnableC0938.f81886 < 0 && C0894.f81854 < 0) {
                                                AbstractActivityC5549 abstractActivityC5549 = viewOnClickListenerC2424.f3731;
                                                if (C0937.m55918() < 0) {
                                                    ServiceConnectionC1013.m56163(abstractActivityC5549, new Intent(abstractActivityC5549, (Class<?>) ViewOnClickListenerC7928.class));
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    iM55680 = (C0946.m55979("ۚ᩺") + i3) * (-85);
                                    i4 = ((iM55680 ^ i2) * (-13059)) ^ (-1313481910);
                                    i5 = -873047391;
                                }
                            }
                            iM55680 = C0946.m55979("۟۟") ^ i3;
                            i4 = ((iM55680 ^ i2) * 20107) ^ (-1299162113);
                            i5 = 99753882;
                        }
                        iM55680 = (C0873.m55680("ۚ֨") ^ i3) * 95;
                        i4 = ((iM55680 ^ i2) * 18333) ^ 787834847;
                        i5 = 491712602;
                    }
                    break;
                case 292138320:
                case 1653872483:
                    if (RunnableC0938.m55938() == 0) {
                        iM55680 = C0946.m55979("ۢܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 27359) ^ (-699471716);
                        i5 = 360929069;
                    } else {
                        iM55680 = (C0873.m55680("ۘۡ") ^ i2) * 53;
                        i4 = ((iM55680 ^ i3) * (-4817)) ^ (-338466702);
                        i5 = 836237195;
                    }
                    break;
                case 1270020126:
                case 2061264983:
                    C1053.m56327();
                    break;
                default:
                    if (ServiceConnectionC1013.m56157() > 0) {
                        iM55680 = (C0946.m55979("ۚ᩺") + i3) * (-85);
                        i4 = ((iM55680 ^ i2) * (-13059)) ^ (-1313481910);
                        i5 = -873047391;
                    } else {
                        iM55680 = (C0873.m55680("ۘۡ") ^ i2) * 53;
                        i4 = ((iM55680 ^ i3) * (-4817)) ^ (-338466702);
                        i5 = 836237195;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3386(ViewOnClickListenerC2424 viewOnClickListenerC2424, String str, C25065 c25065) {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        TextInputLayout textInputLayout;
        short[] sArr;
        C20671 c20671;
        int iM559710;
        int i4;
        int i5;
        short[] sArr2;
        int i6;
        int iM55681;
        int i7;
        C20671 c20672;
        int i8;
        int i9;
        short[] sArr3;
        int iM559711;
        int i10;
        int i11;
        int i12;
        int iM55682;
        int i13;
        int i14;
        final ViewOnClickListenerC2424 viewOnClickListenerC2425 = viewOnClickListenerC2424;
        int i15 = C1229.f82066;
        int i16 = C0912.f81867;
        int iM559712 = C0946.m55979("۠ۗ") ^ i16;
        int i17 = ((iM559712 ^ i15) * 9255) ^ (-1572658549);
        AbstractActivityC5549 abstractActivityC5549 = null;
        Runnable runnable = null;
        C20671 c20671M55888 = null;
        C20671 c20671M55654 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i18 = iM559712 ^ (-835002102);
        TextInputLayout textInputLayout2 = null;
        int i19 = 0;
        int iM55683 = 0;
        int iM56557 = 0;
        int i20 = 0;
        int i21 = 0;
        int iM55684 = 0;
        int i22 = 0;
        int iM559713 = 0;
        int iM55685 = 0;
        int i23 = 0;
        short s = 0;
        short s2 = 0;
        boolean zM55655 = false;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = -1269600967;
        int iM55686 = 0;
        while (true) {
            i27 = i18 ^ (i17 & (((i27 ^ i15) * (-15395)) >> 31));
            switch (i27) {
                case -2147044815:
                case 1632023533:
                    if (!C0949.m56012()) {
                        textInputLayout2 = textInputLayout2;
                        sArr5 = sArr5;
                        sArr4 = sArr4;
                        i25 = i25;
                        i26 = i26;
                        c20671M55888 = c20671M55888;
                        i24 = i24;
                        iM55681 = (C0946.m55979("֨ۡ") ^ i15) * 61;
                        i17 = ((iM55681 ^ i16) * 10281) ^ (-1492148950);
                        i7 = 456712212;
                        i9 = iM55681 ^ i7;
                        c20671M55888 = c20671M55888;
                        i24 = i24;
                        textInputLayout2 = textInputLayout2;
                        i25 = i25;
                        i26 = i26;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i18 = i9;
                        viewOnClickListenerC2425 = viewOnClickListenerC2424;
                    } else {
                        textInputLayout2 = textInputLayout2;
                        sArr5 = sArr5;
                        iM55680 = C0946.m55979("ۡᩴ") ^ i16;
                        i = ((iM55680 ^ i15) * 13341) ^ 1775177478;
                        i2 = 830445767;
                        i6 = iM55680 ^ i2;
                        textInputLayout2 = textInputLayout2;
                        sArr2 = sArr5;
                        i18 = i6;
                        i17 = i;
                        sArr5 = sArr2;
                    }
                    break;
                case -2078081820:
                case 2126261399:
                    textInputLayout2 = textInputLayout2;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    i25 = i25;
                    i26 = i26;
                    c20671M55888 = c20671M55888;
                    i24 = i24;
                    RunnableC0871.m55661(c25065, C1036.m56252(f81822, 87, 6, i19));
                    if (C1025.f81947 >= 0) {
                        iM55681 = (C0946.m55979("֨ۡ") ^ i15) * 61;
                        i17 = ((iM55681 ^ i16) * 10281) ^ (-1492148950);
                        i7 = 456712212;
                    } else {
                        iM55681 = C0873.m55680("ܰ᩶") ^ i16;
                        i17 = ((iM55681 ^ i15) * (-1393)) ^ (-1154628640);
                        i7 = -543216547;
                    }
                    i9 = iM55681 ^ i7;
                    c20671M55888 = c20671M55888;
                    i24 = i24;
                    textInputLayout2 = textInputLayout2;
                    i25 = i25;
                    i26 = i26;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i18 = i9;
                    viewOnClickListenerC2425 = viewOnClickListenerC2424;
                    break;
                case -1961151618:
                case 1779749036:
                    AbstractC0942.m55968(textInputLayout2, C0946.m55979(C0877.m55707(f81822, 108, 3, i19)) ^ 2127181387);
                    break;
                case -1946403698:
                case -200649787:
                    C0854.m55595();
                    if (C0894.f81854 < 0) {
                        iM55682 = C0946.m55979("ܿۡ") ^ i16;
                        i13 = ((iM55682 ^ i15) * 921) ^ 766622155;
                        i14 = -650558333;
                        i18 = iM55682 ^ i14;
                        i17 = i13;
                    } else {
                        textInputLayout2 = textInputLayout2;
                        sArr5 = sArr5;
                        int iM55687 = C0873.m55680("۫᩺") ^ i15;
                        i10 = ((iM55687 ^ i16) * (-22645)) ^ (-395542712);
                        i12 = iM55687 ^ (-793344443);
                        sArr5 = sArr5;
                        i18 = i12;
                        i17 = i10;
                        textInputLayout2 = textInputLayout2;
                    }
                    break;
                case -1913593495:
                case 85908382:
                    textInputLayout2 = textInputLayout2;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    i25 = i25;
                    i26 = i26;
                    c20671M55888 = c20671M55888;
                    i24 = i24;
                    s = f81822[86];
                    s2 = 2;
                    if (C1071.f81975 <= 0) {
                        iM55681 = C0873.m55680("ܳܰ") ^ i15;
                        i17 = ((iM55681 ^ i16) * (-7765)) ^ (-219427692);
                        i7 = 1895048862;
                    } else {
                        iM55681 = C0946.m55979("ܽۛ") ^ i16;
                        i17 = ((iM55681 ^ i15) * 20725) ^ (-1105441528);
                        i7 = 1308360938;
                    }
                    i9 = iM55681 ^ i7;
                    c20671M55888 = c20671M55888;
                    i24 = i24;
                    textInputLayout2 = textInputLayout2;
                    i25 = i25;
                    i26 = i26;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i18 = i9;
                    viewOnClickListenerC2425 = viewOnClickListenerC2424;
                    break;
                case -1907027226:
                case 604158388:
                    C0861.m55627(c20671M55654, iM55684);
                    sArr5 = sArr5;
                    iM55685 = C0873.m55680(C0866.m55652(f81822, 114, 3, i19));
                    i23 = 2103238362;
                    if (!C0955.f81898) {
                        iM55979 = (i15 - C0946.m55979("ۤ᩻")) * 17;
                        i = ((iM55979 ^ i16) * (-715)) ^ 1546518725;
                        i3 = 1115159576;
                        i6 = iM55979 ^ i3;
                        sArr2 = sArr5;
                        i18 = i6;
                        i17 = i;
                        sArr5 = sArr2;
                    } else {
                        textInputLayout2 = textInputLayout2;
                        sArr4 = sArr4;
                        i25 = i25;
                        i26 = i26;
                        c20671M55888 = c20671M55888;
                        i24 = i24;
                        iM55681 = C0873.m55680("ܳܰ") ^ i15;
                        i17 = ((iM55681 ^ i16) * (-7765)) ^ (-219427692);
                        i7 = 1895048862;
                        i9 = iM55681 ^ i7;
                        c20671M55888 = c20671M55888;
                        i24 = i24;
                        textInputLayout2 = textInputLayout2;
                        i25 = i25;
                        i26 = i26;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i18 = i9;
                        viewOnClickListenerC2425 = viewOnClickListenerC2424;
                    }
                    break;
                case -1835346904:
                case 836653081:
                    C1194.m56390(c20671M55654, iM55685 ^ i23);
                    C0906.m55817(c20671M55654, iM55683, new DialogInterface.OnClickListener() { // from class: l.ܺ֡ۡ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i28) {
                            int i29 = 1078593871;
                            int i30 = RunnableC0871.f81839;
                            int i31 = C1044.f81959;
                            int iM559714 = C0946.m55979("ܶ᩷") ^ i30;
                            int i32 = ((iM559714 ^ i31) * (-9777)) ^ 2090250734;
                            int i33 = 1387419160;
                            while (true) {
                                i29 = ((((i29 ^ i31) * 29261) >> 31) & i32) ^ (iM559714 ^ i33);
                                switch (i29) {
                                    case -2077337044:
                                    case -657199288:
                                        if (RunnableC0871.f81839 < 0) {
                                            iM559714 = C0946.m55979("ۨۘ") ^ i31;
                                            i32 = ((iM559714 ^ i30) * 32735) ^ 1607562298;
                                            i33 = -1796129205;
                                        } else {
                                            iM559714 = (C0873.m55680("ܳ᩸") + i30) * (-21);
                                            i32 = ((iM559714 ^ i31) * (-17511)) ^ (-210663086);
                                            i33 = -17833752;
                                        }
                                        break;
                                    case -2018281950:
                                    case -872062498:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM559714 = (C0873.m55680("۠ۨ") ^ i31) * 11;
                                            i32 = ((iM559714 ^ i30) * 1165) ^ 507618612;
                                            i33 = -1940874661;
                                        } else {
                                            iM559714 = C0946.m55979("ۘܺ") ^ i30;
                                            i32 = ((iM559714 ^ i31) * 12989) ^ 359060291;
                                            i33 = 1259570824;
                                        }
                                        break;
                                    case -1976878201:
                                    case -756506043:
                                        ViewOnClickListenerC2424.m3389(this.f51145);
                                        break;
                                    case -1971218871:
                                    case 2101357936:
                                        if (C1071.f81975 <= 0) {
                                            iM559714 = (C0873.m55680("۠ۨ") ^ i31) * 11;
                                            i32 = ((iM559714 ^ i30) * 1165) ^ 507618612;
                                            i33 = -1940874661;
                                        } else {
                                            iM559714 = (C0946.m55979("ۡ᩷") ^ i30) * 27;
                                            i32 = ((iM559714 ^ i31) * 19255) ^ 883300695;
                                            i33 = 1058106702;
                                        }
                                        break;
                                    case -1863877696:
                                    case 480965475:
                                        C0890.m55740();
                                        break;
                                    case -1596953356:
                                    case 1346212738:
                                        RunnableC0897.m55784();
                                        if (ServiceConnectionC1013.f81940 < 0) {
                                            iM559714 = (C0946.m55979("᩻ۡ") ^ i30) * 109;
                                            i32 = ((iM559714 ^ i31) * 15655) ^ 2026061509;
                                            i33 = -1808761026;
                                        } else {
                                            iM559714 = C0946.m55979("ۨۘ") ^ i31;
                                            i32 = ((iM559714 ^ i30) * 32735) ^ 1607562298;
                                            i33 = -1796129205;
                                        }
                                        break;
                                    case -1276898397:
                                    case 1444850506:
                                        if (C1044.m56286() <= 0) {
                                            iM559714 = (C0946.m55979("᩻ۡ") ^ i30) * 109;
                                            i32 = ((iM559714 ^ i31) * 15655) ^ 2026061509;
                                            i33 = -1808761026;
                                        } else {
                                            iM559714 = (C0946.m55979("ܳۡ") ^ i30) * (-59);
                                            i32 = ((iM559714 ^ i31) * (-10853)) ^ (-61480799);
                                            i33 = -929920617;
                                        }
                                        break;
                                    case -1003226820:
                                    case 1270062706:
                                        if (C1012.f81938 >= 0) {
                                            iM559714 = C0946.m55979("ۨۘ") ^ i31;
                                            i32 = ((iM559714 ^ i30) * 32735) ^ 1607562298;
                                            i33 = -1796129205;
                                        } else {
                                            iM559714 = C0873.m55680("ܽ֨") ^ i31;
                                            i32 = ((iM559714 ^ i30) * 7773) ^ (-538958283);
                                            i33 = -182723933;
                                        }
                                        break;
                                    case -884386890:
                                    case 1787654962:
                                        if (C0845.f81821 >= 0) {
                                            iM559714 = C0946.m55979("ۨۘ") ^ i31;
                                            i32 = ((iM559714 ^ i30) * 32735) ^ 1607562298;
                                            i33 = -1796129205;
                                        } else {
                                            iM559714 = (i31 - C0946.m55979("۬۟")) * (-89);
                                            i32 = ((iM559714 ^ i30) * 11409) ^ 715498574;
                                            i33 = 1682959271;
                                        }
                                        break;
                                    case -806116725:
                                    case 1612396094:
                                        if (C1404.f82149 >= 0) {
                                            iM559714 = (C0873.m55680("۠ۨ") ^ i31) * 11;
                                            i32 = ((iM559714 ^ i30) * 1165) ^ 507618612;
                                            i33 = -1940874661;
                                        } else {
                                            iM559714 = (C0946.m55979("᩵۠") + i31) * 97;
                                            i32 = ((iM559714 ^ i30) * 29763) ^ (-1059200008);
                                            i33 = 1740522461;
                                        }
                                        break;
                                    case -204280105:
                                    case 40624109:
                                        if (C0937.m55918() >= 0) {
                                            iM559714 = (C0946.m55979("᩻ۡ") ^ i30) * 109;
                                            i32 = ((iM559714 ^ i31) * 15655) ^ 2026061509;
                                            i33 = -1808761026;
                                        } else {
                                            iM559714 = C0873.m55680("᩶۟") ^ i31;
                                            i32 = ((iM559714 ^ i30) * (-9659)) ^ (-1064035613);
                                            i33 = 1202423930;
                                        }
                                        break;
                                    case -51633340:
                                    case 976348422:
                                        if (C1046.f81962 <= 0) {
                                            iM559714 = C0946.m55979("ۨۘ") ^ i31;
                                            i32 = ((iM559714 ^ i30) * 32735) ^ 1607562298;
                                            i33 = -1796129205;
                                        } else {
                                            iM559714 = C0946.m55979("ᩳᩳ") ^ i30;
                                            i32 = ((iM559714 ^ i31) * 9087) ^ 880822505;
                                            i33 = -1404424820;
                                        }
                                        break;
                                    case 450617227:
                                    case 2099962325:
                                        RunnableC0897.m55784();
                                        C1012.m56134();
                                        iM559714 = C0946.m55979("ۨۘ") ^ i31;
                                        i32 = ((iM559714 ^ i30) * 32735) ^ 1607562298;
                                        i33 = -1796129205;
                                        break;
                                    case 507331779:
                                    case 900897859:
                                        if (C0873.f81841 <= 0) {
                                            iM559714 = (C0946.m55979("ܽܳ") ^ i31) * 13;
                                            i32 = ((iM559714 ^ i30) * 12059) ^ 2052202247;
                                            i33 = 880307902;
                                        } else {
                                            iM559714 = (C0873.m55680("᩵᩻") ^ i31) * (-35);
                                            i32 = ((iM559714 ^ i30) * 13895) ^ 1884204863;
                                            i33 = 1755301498;
                                        }
                                        break;
                                    case 687783324:
                                    case 863319996:
                                        if (C0989.f81920 >= 0) {
                                            iM559714 = (C0873.m55680("۠ۨ") ^ i31) * 11;
                                            i32 = ((iM559714 ^ i30) * 1165) ^ 507618612;
                                            i33 = -1940874661;
                                        } else {
                                            iM559714 = C0873.m55680("ܰۢ") ^ i30;
                                            i32 = ((iM559714 ^ i31) * (-17785)) ^ 1842671114;
                                            i33 = 706677182;
                                        }
                                        break;
                                    default:
                                        C1194.m56396();
                                        if (C0873.f81841 <= 0) {
                                            iM559714 = (C0946.m55979("ܽܳ") ^ i31) * 13;
                                            i32 = ((iM559714 ^ i30) * 12059) ^ 2052202247;
                                            i33 = 880307902;
                                        } else {
                                            iM559714 = (C0946.m55979("᩻ۡ") ^ i30) * 109;
                                            i32 = ((iM559714 ^ i31) * 15655) ^ 2026061509;
                                            i33 = -1808761026;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    sArr5 = f81822;
                    i21 = BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    if (C0912.f81867 <= 0) {
                        iM55682 = (C0946.m55979("ۨᩴ") + i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i13 = ((iM55682 ^ i15) * 14083) ^ (-341950466);
                        i14 = 137238885;
                    } else {
                        iM55682 = C0873.m55680("ᩴ᩵") ^ i16;
                        i13 = ((iM55682 ^ i15) * 14235) ^ (-515332778);
                        i14 = 78757197;
                    }
                    i18 = iM55682 ^ i14;
                    i17 = i13;
                    break;
                case -1830831826:
                case -166160495:
                    break;
                case -1798171110:
                case -1398601598:
                    C22682.m50796(AbstractC0942.m55960(c25065, i20));
                    break;
                case -1700454966:
                case -1056701052:
                    if (C1046.f81962 > 0) {
                        iM55682 = (C0946.m55979("ۨᩴ") + i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i13 = ((iM55682 ^ i15) * 14083) ^ (-341950466);
                        i14 = 137238885;
                        i18 = iM55682 ^ i14;
                        i17 = i13;
                    } else {
                        textInputLayout2 = textInputLayout2;
                        sArr5 = sArr5;
                        int iM55688 = C0873.m55680("۫᩺") ^ i15;
                        i10 = ((iM55688 ^ i16) * (-22645)) ^ (-395542712);
                        i12 = iM55688 ^ (-793344443);
                        sArr5 = sArr5;
                        i18 = i12;
                        i17 = i10;
                        textInputLayout2 = textInputLayout2;
                    }
                    break;
                case -1695319915:
                case -1050135241:
                    C1124.m56367();
                    if (!C0882.f81846) {
                        textInputLayout2 = textInputLayout2;
                        sArr5 = sArr5;
                        int iM55689 = C0873.m55680("۫᩺") ^ i15;
                        i10 = ((iM55689 ^ i16) * (-22645)) ^ (-395542712);
                        i12 = iM55689 ^ (-793344443);
                        sArr5 = sArr5;
                        i18 = i12;
                        i17 = i10;
                        textInputLayout2 = textInputLayout2;
                    } else {
                        textInputLayout2 = textInputLayout2;
                        sArr5 = sArr5;
                        sArr4 = sArr4;
                        i25 = i25;
                        i26 = i26;
                        c20671M55888 = c20671M55888;
                        i24 = i24;
                        iM55681 = (C0946.m55979("֨ۡ") ^ i15) * 61;
                        i17 = ((iM55681 ^ i16) * 10281) ^ (-1492148950);
                        i7 = 456712212;
                        i9 = iM55681 ^ i7;
                        c20671M55888 = c20671M55888;
                        i24 = i24;
                        textInputLayout2 = textInputLayout2;
                        i25 = i25;
                        i26 = i26;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i18 = i9;
                        viewOnClickListenerC2425 = viewOnClickListenerC2424;
                    }
                    break;
                case -1672147313:
                case -905899180:
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    i25 = i25;
                    i26 = i26;
                    c20672 = c20671M55888;
                    i8 = i24;
                    viewOnClickListenerC2424.m3388();
                    textInputLayout2 = viewOnClickListenerC2425.f3729;
                    abstractActivityC5549 = viewOnClickListenerC2425.f3731;
                    zM55655 = C0866.m55655(c25065);
                    if (C1012.m56134() <= 0) {
                        int iM556810 = (i15 - C0873.m55680("ᩴۤ")) * 37;
                        c20671M55888 = c20672;
                        i24 = i8;
                        i25 = i25;
                        i26 = i26;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i18 = iM556810 ^ (-1688895020);
                        i17 = ((iM556810 ^ i16) * (-14851)) ^ 1302414423;
                    } else {
                        int iM556811 = (C0873.m55680("᩻᩻") + i15) * 123;
                        i17 = ((iM556811 ^ i16) * 24795) ^ 2142191380;
                        i9 = iM556811 ^ (-1558251027);
                        c20671M55888 = c20672;
                        i24 = i8;
                        i25 = i25;
                        i26 = i26;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i18 = i9;
                    }
                    viewOnClickListenerC2425 = viewOnClickListenerC2424;
                    break;
                case -1496245531:
                case 1534846755:
                    RunnableC1014.m56168(textInputLayout2, C0873.m55680(C1048.m56318(f81822, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 3, i19)) ^ 2119397759);
                    break;
                case -1185017206:
                case 2013855670:
                    textInputLayout2 = textInputLayout2;
                    sArr5 = sArr5;
                    iM559713 = C0946.m55979(C1404.m56462(f81822, IShizukuService.Stub.TRANSACTION_attachUserService, 3, i19));
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0946.m55979("ۡᩴ") ^ i16;
                        i = ((iM55680 ^ i15) * 13341) ^ 1775177478;
                        i2 = 830445767;
                    } else {
                        iM55680 = C0873.m55680("ܶ۫") ^ i16;
                        i = ((iM55680 ^ i15) * 3511) ^ (-1778048219);
                        i2 = -1872423039;
                    }
                    i6 = iM55680 ^ i2;
                    textInputLayout2 = textInputLayout2;
                    sArr2 = sArr5;
                    i18 = i6;
                    i17 = i;
                    sArr5 = sArr2;
                    break;
                case -947848468:
                case 1250613788:
                    sArr = sArr5;
                    C19860.m45103(abstractActivityC5549);
                    textInputLayout = textInputLayout2;
                    c20671 = c20671M55888;
                    iM559710 = (C0946.m55979("ᩴ᩶") ^ i15) * 83;
                    i4 = ((iM559710 ^ i16) * (-30455)) ^ (-1640503905);
                    i5 = 145244757;
                    int i28 = iM559710 ^ i5;
                    c20671M55888 = c20671;
                    i17 = i4;
                    textInputLayout2 = textInputLayout;
                    sArr2 = sArr;
                    i18 = i28;
                    sArr5 = sArr2;
                    break;
                case -813825091:
                case 205172585:
                    textInputLayout2 = textInputLayout2;
                    sArr5 = sArr5;
                    C20671 c20673 = c20671M55888;
                    iM56557 = C1929.m56557(c25065);
                    i24 = 9;
                    sArr4 = f81822;
                    i26 = 3;
                    if (C1964.f83032 <= 0) {
                        c20671M55888 = c20673;
                        i25 = 96;
                        int iM556812 = C0873.m55680("۫᩺") ^ i15;
                        i10 = ((iM556812 ^ i16) * (-22645)) ^ (-395542712);
                        i12 = iM556812 ^ (-793344443);
                        sArr5 = sArr5;
                        i18 = i12;
                        i17 = i10;
                    } else {
                        int iM559714 = (i15 - C0946.m55979("ۤܺ")) * (-77);
                        i17 = ((iM559714 ^ i16) * 13747) ^ (-1060454153);
                        c20671M55888 = c20673;
                        sArr5 = sArr5;
                        i25 = 96;
                        i18 = iM559714 ^ 1164222095;
                    }
                    textInputLayout2 = textInputLayout2;
                    break;
                case -743495072:
                case 1667376623:
                    textInputLayout2 = textInputLayout2;
                    sArr5 = sArr5;
                    C0917.m55842(iM559713 ^ 2129841422);
                    if (!C0882.f81846) {
                        iM55680 = (C0873.m55680("᩺ۛ") + i15) * (-81);
                        i = ((iM55680 ^ i16) * 21433) ^ 5851508;
                        i2 = -1096993178;
                        i6 = iM55680 ^ i2;
                        textInputLayout2 = textInputLayout2;
                        sArr2 = sArr5;
                        i18 = i6;
                        i17 = i;
                        sArr5 = sArr2;
                    } else {
                        sArr4 = sArr4;
                        i25 = i25;
                        i26 = i26;
                        c20671M55888 = c20671M55888;
                        i24 = i24;
                        iM55681 = (C0946.m55979("֨ۡ") ^ i15) * 61;
                        i17 = ((iM55681 ^ i16) * 10281) ^ (-1492148950);
                        i7 = 456712212;
                        i9 = iM55681 ^ i7;
                        c20671M55888 = c20671M55888;
                        i24 = i24;
                        textInputLayout2 = textInputLayout2;
                        i25 = i25;
                        i26 = i26;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i18 = i9;
                        viewOnClickListenerC2425 = viewOnClickListenerC2424;
                    }
                    break;
                case -645328313:
                case 591155890:
                    i19 = 40069;
                    iM55681 = C0873.m55680("ۢۗ") ^ i16;
                    i17 = ((iM55681 ^ i15) * 5347) ^ (-1681254015);
                    i7 = -941032635;
                    i9 = iM55681 ^ i7;
                    c20671M55888 = c20671M55888;
                    i24 = i24;
                    textInputLayout2 = textInputLayout2;
                    i25 = i25;
                    i26 = i26;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i18 = i9;
                    viewOnClickListenerC2425 = viewOnClickListenerC2424;
                    break;
                case -559130629:
                case 278607781:
                    textInputLayout = textInputLayout2;
                    sArr = sArr5;
                    c20671 = c20671M55888;
                    C0917.m55847(viewOnClickListenerC2425.f3732);
                    if (C0882.m55713()) {
                        iM559710 = (i16 - C0946.m55979("ۤۖ")) * 33;
                        i4 = ((iM559710 ^ i15) * (-28531)) ^ (-1450970479);
                        i5 = 2055805326;
                    } else {
                        iM559710 = (C0946.m55979("ᩴ᩶") ^ i15) * 83;
                        i4 = ((iM559710 ^ i16) * (-30455)) ^ (-1640503905);
                        i5 = 145244757;
                    }
                    int i29 = iM559710 ^ i5;
                    c20671M55888 = c20671;
                    i17 = i4;
                    textInputLayout2 = textInputLayout;
                    sArr2 = sArr;
                    i18 = i29;
                    sArr5 = sArr2;
                    break;
                case -537681633:
                case 892150202:
                    textInputLayout2 = textInputLayout2;
                    sArr5 = sArr5;
                    c20671M55888 = C0930.m55888(abstractActivityC5549);
                    iM55686 = C0873.m55680(C1025.m56233(f81822, 99, 3, i19));
                    i22 = 2098643691;
                    if (C1229.f82066 < 0) {
                        iM55680 = (C0873.m55680("ۖ᩸") + i16) * 25;
                        i = ((iM55680 ^ i15) * 17405) ^ 65323216;
                        i2 = -1110363456;
                        i6 = iM55680 ^ i2;
                        textInputLayout2 = textInputLayout2;
                        sArr2 = sArr5;
                        i18 = i6;
                        i17 = i;
                        sArr5 = sArr2;
                    } else {
                        int iM556813 = C0873.m55680("۫᩺") ^ i15;
                        i10 = ((iM556813 ^ i16) * (-22645)) ^ (-395542712);
                        i12 = iM556813 ^ (-793344443);
                        sArr5 = sArr5;
                        i18 = i12;
                        i17 = i10;
                        textInputLayout2 = textInputLayout2;
                    }
                    break;
                case -503181990:
                case 2104714514:
                    ViewOnClickListenerC0939.m55941();
                    C1028.m56247();
                    break;
                case -467776530:
                case 1068730508:
                    textInputLayout2 = textInputLayout2;
                    sArr5 = sArr5;
                    sArr3 = sArr4;
                    int i30 = i25;
                    int i31 = i26;
                    C20671 c20674 = c20671M55888;
                    int iM559715 = C0946.m55979(C0866.m55652(sArr3, i30, i31, i19)) ^ 2129083000;
                    int i32 = i24;
                    if (iM56557 != i32) {
                        int iM559716 = (C0946.m55979("ۨ֡") + i15) * (-79);
                        i17 = ((iM559716 ^ i16) * (-6379)) ^ 1985922925;
                        c20671M55888 = c20674;
                        textInputLayout2 = textInputLayout2;
                        i25 = i30;
                        sArr4 = sArr3;
                        sArr5 = sArr5;
                        i18 = iM559716 ^ 1411471196;
                        i24 = i32;
                        i26 = i31;
                        i20 = iM559715;
                    } else {
                        int iM559717 = C0946.m55979("ۗ᩹") ^ i16;
                        i10 = ((iM559717 ^ i15) * 10803) ^ 133540486;
                        i12 = iM559717 ^ 1994855596;
                        c20671M55888 = c20674;
                        i24 = i32;
                        i26 = i31;
                        i25 = i30;
                        i20 = iM559715;
                        sArr4 = sArr3;
                        sArr5 = sArr5;
                        i18 = i12;
                        i17 = i10;
                        textInputLayout2 = textInputLayout2;
                    }
                    break;
                case -400872683:
                case 1112409692:
                    textInputLayout2 = textInputLayout2;
                    sArr5 = sArr5;
                    if (iM56557 != 1001) {
                        iM55680 = C0946.m55979("᩹᩻") ^ i15;
                        i = ((iM55680 ^ i16) * (-16767)) ^ 299949897;
                        i2 = -820535967;
                    } else {
                        iM55680 = C0946.m55979("᩵֡") ^ i16;
                        i = ((iM55680 ^ i15) * 31269) ^ (-538407255);
                        i2 = 702362356;
                    }
                    i6 = iM55680 ^ i2;
                    textInputLayout2 = textInputLayout2;
                    sArr2 = sArr5;
                    i18 = i6;
                    i17 = i;
                    sArr5 = sArr2;
                    break;
                case -352807482:
                case 354529237:
                    AbstractC0942.m55968(viewOnClickListenerC2425.f3727, C0873.m55680(C1929.m56558(f81822, 123, 3, i19)) ^ 2122121743);
                    break;
                case -257864039:
                case 238435392:
                    textInputLayout2 = textInputLayout2;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    i25 = i25;
                    i26 = i26;
                    c20671M55888 = c20671M55888;
                    i24 = i24;
                    int i33 = s + 1;
                    if ((i33 * i33) - ((s * s2) + 1) >= 0) {
                        iM55681 = (C0873.m55680("ᩴ۫") + i15) * (-37);
                        i17 = ((iM55681 ^ i16) * 2831) ^ (-449239113);
                        i7 = 1686611384;
                    } else {
                        iM55681 = (C0946.m55979("۬᩸") + i15) * 33;
                        i17 = ((iM55681 ^ i16) * (-10691)) ^ (-1462404061);
                        i7 = -191362631;
                    }
                    i9 = iM55681 ^ i7;
                    c20671M55888 = c20671M55888;
                    i24 = i24;
                    textInputLayout2 = textInputLayout2;
                    i25 = i25;
                    i26 = i26;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i18 = i9;
                    viewOnClickListenerC2425 = viewOnClickListenerC2424;
                    break;
                case -233010173:
                case 288269623:
                    if (iM56557 != 1200) {
                        iM55682 = C0873.m55680("ᩴ֡") ^ i16;
                        i13 = ((iM55682 ^ i15) * 11671) ^ (-740921398);
                        i14 = -278205765;
                    } else {
                        iM55682 = C0873.m55680("ۧ۫") ^ i15;
                        i13 = ((iM55682 ^ i16) * (-9641)) ^ 1727720610;
                        i14 = -1529760138;
                    }
                    i18 = iM55682 ^ i14;
                    i17 = i13;
                    break;
                case -215671231:
                case -121933310:
                    sArr5 = sArr5;
                    c20671M55654 = C0866.m55654(abstractActivityC5549);
                    iM55684 = C0873.m55680(C1028.m56235(f81822, UMErrorCode.E_UM_BE_CREATE_FAILED, 3, i19)) ^ 2120759449;
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = (C0873.m55680("᩷ܰ") ^ i16) * 119;
                        i = ((iM55979 ^ i15) * 17877) ^ (-98291346);
                        i3 = 209859821;
                        i6 = iM55979 ^ i3;
                        sArr2 = sArr5;
                        i18 = i6;
                        i17 = i;
                        sArr5 = sArr2;
                    } else {
                        sArr5 = sArr5;
                        iM55682 = (C0946.m55979("ۨᩴ") + i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i13 = ((iM55682 ^ i15) * 14083) ^ (-341950466);
                        i14 = 137238885;
                        i18 = iM55682 ^ i14;
                        i17 = i13;
                    }
                    break;
                case -186352001:
                case 42185818:
                    int i34 = C12996.f36563;
                    C9900.m23181(abstractActivityC5549, false, true, runnable);
                    sArr5 = sArr5;
                    iM55979 = C0873.m55680("֫֨") ^ i15;
                    i = ((iM55979 ^ i16) * (-16777)) ^ 499912125;
                    i3 = 590334260;
                    i6 = iM55979 ^ i3;
                    sArr2 = sArr5;
                    i18 = i6;
                    i17 = i;
                    sArr5 = sArr2;
                    break;
                case 78678282:
                case 362719074:
                    i19 = 13703;
                    iM55681 = C0873.m55680("ۢۗ") ^ i16;
                    i17 = ((iM55681 ^ i15) * 5347) ^ (-1681254015);
                    i7 = -941032635;
                    i9 = iM55681 ^ i7;
                    c20671M55888 = c20671M55888;
                    i24 = i24;
                    textInputLayout2 = textInputLayout2;
                    i25 = i25;
                    i26 = i26;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i18 = i9;
                    viewOnClickListenerC2425 = viewOnClickListenerC2424;
                    break;
                case 257327358:
                case 1450014758:
                    sArr5 = sArr5;
                    textInputLayout2 = textInputLayout2;
                    if (new C6576(C0912.m55822(f81822, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 3, i19)).m15030((CharSequence) str)) {
                        iM55680 = (C0873.m55680("ۙ᩺") + i15) * 5;
                        i = ((iM55680 ^ i16) * 30593) ^ (-1782788609);
                        i2 = -1969382807;
                    } else {
                        iM55680 = (C0873.m55680("᩹۟") ^ i16) * 83;
                        i = ((iM55680 ^ i15) * 27355) ^ (-138969009);
                        i2 = -539892682;
                    }
                    i6 = iM55680 ^ i2;
                    textInputLayout2 = textInputLayout2;
                    sArr2 = sArr5;
                    i18 = i6;
                    i17 = i;
                    sArr5 = sArr2;
                    break;
                case 590842822:
                case 1265533995:
                    C20671 c20675 = c20671M55888;
                    C0861.m55627(c20675, iM55686 ^ i22);
                    C0992.m56104(c20675, RunnableC1014.m56178(c25065, i20));
                    C0906.m55817(c20675, iM55683, runnable);
                    RunnableC0871.m55669(c20675);
                    break;
                case 593171920:
                case 1553454935:
                    textInputLayout2 = textInputLayout2;
                    sArr5 = sArr5;
                    sArr3 = sArr4;
                    int i35 = i25;
                    int i36 = i26;
                    C20671 c20676 = c20671M55888;
                    int i37 = i24;
                    runnable = null;
                    iM55683 = C0873.m55680(AbstractC0942.m55970(f81822, 93, 3, i19)) ^ 2120639941;
                    if (zM55655) {
                        iM559711 = (C0873.m55680("ܳۖ") ^ i15) * (-117);
                        i10 = ((iM559711 ^ i16) * (-25807)) ^ 854177958;
                        i11 = -1113270711;
                    } else {
                        iM559711 = (C0946.m55979("֫۬") ^ i16) * 63;
                        i10 = ((iM559711 ^ i15) * (-25801)) ^ (-1032475776);
                        i11 = 1638851510;
                    }
                    i12 = iM559711 ^ i11;
                    c20671M55888 = c20676;
                    i24 = i37;
                    i25 = i35;
                    i26 = i36;
                    sArr4 = sArr3;
                    sArr5 = sArr5;
                    i18 = i12;
                    i17 = i10;
                    textInputLayout2 = textInputLayout2;
                    break;
                case 684122172:
                case 2128877316:
                    sArr5 = sArr5;
                    if (iM56557 != 1101) {
                        iM55979 = C0946.m55979("ۚۗ") ^ i16;
                        i = ((iM55979 ^ i15) * 12981) ^ 1560560754;
                        i3 = 1390716318;
                    } else {
                        iM55979 = (C0946.m55979("ܳۧ") ^ i15) * (-103);
                        i = ((iM55979 ^ i16) * (-1109)) ^ 775960771;
                        i3 = 857353912;
                    }
                    i6 = iM55979 ^ i3;
                    sArr2 = sArr5;
                    i18 = i6;
                    i17 = i;
                    sArr5 = sArr2;
                    break;
                case 738295623:
                case 744604155:
                    C1024.m56209();
                    C1404.m56468();
                    textInputLayout2 = textInputLayout2;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    i25 = i25;
                    i26 = i26;
                    c20671M55888 = c20671M55888;
                    i24 = i24;
                    iM55681 = (C0946.m55979("֨ۡ") ^ i15) * 61;
                    i17 = ((iM55681 ^ i16) * 10281) ^ (-1492148950);
                    i7 = 456712212;
                    i9 = iM55681 ^ i7;
                    c20671M55888 = c20671M55888;
                    i24 = i24;
                    textInputLayout2 = textInputLayout2;
                    i25 = i25;
                    i26 = i26;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i18 = i9;
                    viewOnClickListenerC2425 = viewOnClickListenerC2424;
                    break;
                case 1199056984:
                case 1590014632:
                    C0967.m56076(c20671M55654, C0873.m55680(C0992.m56102(sArr5, i21, 3, i19)) ^ 2101567332, runnable);
                    C1025.m56221(c20671M55654);
                    textInputLayout2 = textInputLayout2;
                    sArr5 = sArr5;
                    iM55680 = (C0873.m55680("᩹۟") ^ i16) * 83;
                    i = ((iM55680 ^ i15) * 27355) ^ (-138969009);
                    i2 = -539892682;
                    i6 = iM55680 ^ i2;
                    textInputLayout2 = textInputLayout2;
                    sArr2 = sArr5;
                    i18 = i6;
                    i17 = i;
                    sArr5 = sArr2;
                    break;
                case 1924508896:
                case 1926132742:
                    if (C1017.m56187() > 0) {
                        sArr5 = sArr5;
                        sArr4 = sArr4;
                        i25 = i25;
                        i26 = i26;
                        c20672 = c20671M55888;
                        i8 = i24;
                        int iM556814 = (i15 - C0873.m55680("ᩴۤ")) * 37;
                        c20671M55888 = c20672;
                        i24 = i8;
                        i25 = i25;
                        i26 = i26;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i18 = iM556814 ^ (-1688895020);
                        i17 = ((iM556814 ^ i16) * (-14851)) ^ 1302414423;
                        viewOnClickListenerC2425 = viewOnClickListenerC2424;
                    }
                    textInputLayout2 = textInputLayout2;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    i25 = i25;
                    i26 = i26;
                    c20671M55888 = c20671M55888;
                    i24 = i24;
                    iM55681 = (C0946.m55979("֨ۡ") ^ i15) * 61;
                    i17 = ((iM55681 ^ i16) * 10281) ^ (-1492148950);
                    i7 = 456712212;
                    i9 = iM55681 ^ i7;
                    c20671M55888 = c20671M55888;
                    i24 = i24;
                    textInputLayout2 = textInputLayout2;
                    i25 = i25;
                    i26 = i26;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i18 = i9;
                    viewOnClickListenerC2425 = viewOnClickListenerC2424;
                    break;
                default:
                    sArr5 = sArr5;
                    if (viewOnClickListenerC2425.f3728) {
                        iM55979 = C0946.m55979("۟ܰ") ^ i16;
                        i = ((iM55979 ^ i15) * 24633) ^ 239988343;
                        i3 = -1221690918;
                    } else {
                        iM55979 = C0873.m55680("֫֨") ^ i15;
                        i = ((iM55979 ^ i16) * (-16777)) ^ 499912125;
                        i3 = 590334260;
                    }
                    i6 = iM55979 ^ i3;
                    sArr2 = sArr5;
                    i18 = i6;
                    i17 = i;
                    sArr5 = sArr2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x021b A[PHI: r1 r2 r4 r5 r6
      0x021b: PHI (r1v5 int) = (r1v2 int), (r1v4 int), (r1v2 int), (r1v2 int) binds: [B:64:0x0219, B:44:0x0160, B:33:0x00df, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r2v4 short) = (r2v2 short), (r2v3 short), (r2v2 short), (r2v2 short) binds: [B:64:0x0219, B:44:0x0160, B:33:0x00df, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r4v4 short[]) = (r4v2 short[]), (r4v2 short[]), (r4v3 short[]), (r4v2 short[]) binds: [B:64:0x0219, B:44:0x0160, B:33:0x00df, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:64:0x0219, B:44:0x0160, B:33:0x00df, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:64:0x0219, B:44:0x0160, B:33:0x00df, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x024f A[PHI: r0
      0x024f: PHI (r0v3 short) = (r0v2 short), (r0v2 short), (r0v2 short), (r0v5 short) binds: [B:68:0x024d, B:60:0x01fa, B:52:0x01a6, B:48:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x029c  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m3387(C4437 c4437, ViewOnClickListenerC2424 viewOnClickListenerC2424, int i, KeyEvent keyEvent) {
        int iM55979;
        int i2;
        int i3;
        short s = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = -27284141;
        int i9 = C0967.f81910;
        int i10 = C1046.f81962;
        int iM55680 = C0873.m55680("ۗۚ") ^ i9;
        int i11 = ((iM55680 ^ i10) * (-12243)) ^ (-630556994);
        int i12 = 336240186;
        while (true) {
            int i13 = iM55680 ^ i12;
            while (true) {
                i8 = ((((i8 ^ i10) * (-1297)) >> 31) & i11) ^ i13;
                switch (i8) {
                    case -2144215424:
                    case -1946557228:
                        sArr = f81822;
                        i6 = 127;
                        i7 = 5;
                        if (C1003.f81929 <= 0) {
                            iM55979 = (C0873.m55680("ۗۖ") + i9) * (-97);
                            i2 = ((iM55979 ^ i10) * (-14639)) ^ 538057025;
                            i3 = 2012274830;
                        } else {
                            iM55979 = (C0873.m55680("ۢ֫") + i9) * (-45);
                            i2 = ((iM55979 ^ i10) * 14491) ^ 1282075982;
                            i3 = 1487053059;
                        }
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case -2040064931:
                    case 1544290046:
                        C0947.m55997();
                        C0930.m55885();
                        return false;
                    case -1960204577:
                    case 1780908457:
                        i5 = 44170;
                        iM55979 = C0873.m55680("ܰᩳ") ^ i9;
                        i2 = ((iM55979 ^ i10) * 9665) ^ (-1028200988);
                        i3 = 194375575;
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case -1916922111:
                    case 404559227:
                        if (C0854.m55595() >= 0) {
                            iM55979 = (i9 - C0873.m55680("ۛܶ")) * 51;
                            i2 = ((iM55979 ^ i10) * 2117) ^ (-1568031841);
                            i3 = -1242309788;
                        } else {
                            iM55979 = C0873.m55680("ۛ᩺") ^ i10;
                            i2 = ((iM55979 ^ i9) * (-31051)) ^ 858793299;
                            i3 = -1755817852;
                        }
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case -1630447536:
                    case 327658449:
                        i4 = 38852 * s;
                        s2 = 9713;
                        if (C0927.m55873() <= 0) {
                            iM55979 = (C0873.m55680("ۗۖ") + i9) * (-97);
                            i2 = ((iM55979 ^ i10) * (-14639)) ^ 538057025;
                            i3 = 2012274830;
                        } else {
                            iM55979 = C0873.m55680("ۘ᩸") ^ i10;
                            i2 = ((iM55979 ^ i9) * (-26495)) ^ 1820157143;
                            i3 = -1134786037;
                        }
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case -1615950707:
                    case 662245603:
                        if (C0927.f81875) {
                            iM55979 = (i10 - C0946.m55979("᩺֨")) * 17;
                            i2 = ((iM55979 ^ i9) * (-4875)) ^ 1729041378;
                            i3 = -1624793801;
                        } else {
                            iM55979 = C0946.m55979("֡ۨ") ^ i9;
                            i2 = ((iM55979 ^ i10) * (-18147)) ^ 70561014;
                            i3 = -716484217;
                        }
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case -1550335281:
                    case 1477291136:
                        return false;
                    case -1336330765:
                    case -1047450404:
                        if (ServiceConnectionC1013.f81940 >= 0) {
                            iM55979 = (C0873.m55680("ܺ۫") ^ i10) * (-85);
                            i2 = ((iM55979 ^ i9) * 15635) ^ (-1859115468);
                            i3 = 1802414235;
                        } else {
                            iM55979 = (C0873.m55680("᩶۬") + i9) * (-101);
                            i2 = ((iM55979 ^ i10) * (-19757)) ^ 1685528543;
                            i3 = 4110819;
                        }
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case -1273281521:
                    case 1148657641:
                        C0992.m56107();
                        if (C1028.f81950 > 0) {
                        }
                        iM55979 = (i10 - C0946.m55979("᩺֨")) * 17;
                        i2 = ((iM55979 ^ i9) * (-4875)) ^ 1729041378;
                        i3 = -1624793801;
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case -1156270155:
                    case 664980656:
                        if (i == 4) {
                            int iM559710 = C0946.m55979("ۡ᩶") ^ i10;
                            int i14 = ((iM559710 ^ i9) * 19069) ^ (-911077290);
                            i13 = iM559710 ^ 32982809;
                            i11 = i14;
                        } else {
                            iM55979 = (C0946.m55979("ܳ۫") + i10) * (-119);
                            i2 = ((iM55979 ^ i9) * (-26399)) ^ (-581550004);
                            i3 = 71951864;
                            i13 = iM55979 ^ i3;
                            i11 = i2;
                        }
                        break;
                    case -1058885754:
                    case 1592732852:
                        if (C1964.f83032 <= 0) {
                            iM55979 = (i10 - C0946.m55979("᩺֨")) * 17;
                            i2 = ((iM55979 ^ i9) * (-4875)) ^ 1729041378;
                            i3 = -1624793801;
                        } else {
                            iM55979 = C0873.m55680("ᩳ᩺") ^ i10;
                            i2 = ((iM55979 ^ i9) * (-13607)) ^ (-234220078);
                            i3 = 152226715;
                        }
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case -711128067:
                    case 1607999323:
                        if (C0898.m55800() <= 0) {
                            iM55979 = (i9 - C0873.m55680("ۛܶ")) * 51;
                            i2 = ((iM55979 ^ i10) * 2117) ^ (-1568031841);
                            i3 = -1242309788;
                        } else {
                            iM55979 = C0946.m55979("ۖ֨") ^ i10;
                            i2 = ((iM55979 ^ i9) * 28823) ^ (-1574012787);
                            i3 = 1003174268;
                        }
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case -689293496:
                    case 1640876323:
                        if (C0877.f81843 < 0) {
                        }
                        iM55979 = (C0873.m55680("ܺ۫") ^ i10) * (-85);
                        i2 = ((iM55979 ^ i9) * 15635) ^ (-1859115468);
                        i3 = 1802414235;
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case -427285651:
                    case 1147117433:
                        if (C0854.m55595() >= 0) {
                            iM55979 = (i9 - C0873.m55680("ۛܶ")) * 51;
                            i2 = ((iM55979 ^ i10) * 2117) ^ (-1568031841);
                            i3 = -1242309788;
                        } else {
                            iM55979 = C0946.m55979("ۖ᩹") ^ i9;
                            i2 = ((iM55979 ^ i10) * (-14959)) ^ 1635092209;
                            i3 = -1555282083;
                        }
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case -359268852:
                    case 2032318216:
                        int i15 = s + s2;
                        if (i4 - (i15 * i15) <= 0) {
                            iM55979 = (C0946.m55979("ܺ᩶") + i9) * 11;
                            i2 = ((iM55979 ^ i10) * (-25779)) ^ 1409945455;
                            i3 = 477840927;
                        } else {
                            iM55979 = C0946.m55979("᩶᩶") ^ i10;
                            i2 = ((iM55979 ^ i9) * (-18837)) ^ 1506815015;
                            i3 = -572296520;
                        }
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case -312218896:
                    case -226888053:
                        C0906.m55809();
                        RunnableC0938.m55938();
                        iM55979 = (i10 - C0946.m55979("᩺֨")) * 17;
                        i2 = ((iM55979 ^ i9) * (-4875)) ^ 1729041378;
                        i3 = -1624793801;
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case 476322031:
                    case 726445227:
                        i5 = 30414;
                        iM55979 = C0873.m55680("ܰᩳ") ^ i9;
                        i2 = ((iM55979 ^ i10) * 9665) ^ (-1028200988);
                        i3 = 194375575;
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case 686317930:
                    case 1764719115:
                        s = f81822[126];
                        if (C1003.m56123() != 0) {
                            iM55979 = (i9 - C0873.m55680("ۛܶ")) * 51;
                            i2 = ((iM55979 ^ i10) * 2117) ^ (-1568031841);
                            i3 = -1242309788;
                        } else {
                            iM55979 = C0946.m55979("᩷ܺ") ^ i10;
                            i2 = ((iM55979 ^ i9) * 16133) ^ (-230404847);
                            i3 = 1162676949;
                        }
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case 725674404:
                    case 1884431082:
                        C1025.m56218(keyEvent, C1036.m56252(sArr, i6, i7, i5));
                        if (keyEvent.getAction() == 0) {
                            iM55979 = C0946.m55979("ۜܶ") ^ i9;
                            i2 = ((iM55979 ^ i10) * 12379) ^ (-1559164266);
                            i3 = -1408835778;
                        } else {
                            iM55979 = (C0946.m55979("ܳ۫") + i10) * (-119);
                            i2 = ((iM55979 ^ i9) * (-26399)) ^ (-581550004);
                            i3 = 71951864;
                        }
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case 1203479795:
                    case 1828878921:
                        if (C0854.m55595() >= 0) {
                            iM55979 = (C0873.m55680("ۗۖ") + i9) * (-97);
                            i2 = ((iM55979 ^ i10) * (-14639)) ^ 538057025;
                            i3 = 2012274830;
                        } else {
                            iM55979 = C0946.m55979("۠֫") ^ i9;
                            i2 = ((iM55979 ^ i10) * 27115) ^ (-1513619182);
                            i3 = -1816590364;
                        }
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    case 1305473484:
                    case 1683749151:
                        if (C1048.f81963) {
                            iM55979 = (C0873.m55680("ۗۖ") + i9) * (-97);
                            i2 = ((iM55979 ^ i10) * (-14639)) ^ 538057025;
                            i3 = 2012274830;
                            i13 = iM55979 ^ i3;
                            i11 = i2;
                        }
                        iM55979 = (C0873.m55680("ܺ۫") ^ i10) * (-85);
                        i2 = ((iM55979 ^ i9) * 15635) ^ (-1859115468);
                        i3 = 1802414235;
                        i13 = iM55979 ^ i3;
                        i11 = i2;
                        break;
                    default:
                        c4437.m9272();
                        viewOnClickListenerC2424.m3388();
                        return true;
                }
            }
            iM55680 = (i9 - C0946.m55979("ۢۖ")) * 67;
            i11 = ((iM55680 ^ i10) * 12353) ^ 374359292;
            i12 = 1720002192;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3385(ViewOnClickListenerC2424 viewOnClickListenerC2424) {
        C1028.m56238(viewOnClickListenerC2424.f3730, 8);
    }
}
