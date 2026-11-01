package p067l;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Random;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC7218 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܿܰۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f81989 = {8600, 9403, 9407, 9378, 9401, 9388, 9401, 9380, 9378, 9379};

    /* JADX INFO: renamed from: ۙ */
    public boolean f18837;

    /* JADX INFO: renamed from: ᩶ */
    public Random f18838;

    /* JADX INFO: renamed from: ᩸ */
    public ObjectAnimator f18839;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f18840;

    public ViewOnClickListenerC7218() {
        Random random = null;
        int i = -37507150;
        int i2 = C0863.f81833;
        int i3 = C0949.f81897;
        int iM55979 = C0946.m55979("֨ۧ") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-1331)) ^ (-681109440);
        int i5 = 1380897775;
        while (true) {
            i = ((((i ^ i3) * 6363) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2142016705:
                case -1129979815:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("ۗۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-3301)) ^ 582827246;
                        i5 = -53409844;
                    } else {
                        iM55979 = (C0873.m55680("ܶܺ") ^ i3) * 7;
                        i4 = ((iM55979 ^ i2) * 10507) ^ 669839872;
                        i5 = -1528545517;
                    }
                    break;
                case -2132437729:
                case 1859542791:
                    if (C1044.f81959 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ۜ֫")) * 83;
                        i4 = ((iM55979 ^ i2) * 11085) ^ 316703190;
                        i5 = -2068895323;
                    } else {
                        iM55979 = (C0946.m55979("ᩴܿ") + i3) * 123;
                        i4 = ((iM55979 ^ i2) * (-27901)) ^ 256195799;
                        i5 = 1797710460;
                    }
                    break;
                case -1835454857:
                case -1652997647:
                    if (!C0955.f81898) {
                        iM55979 = C0946.m55979("ۨ۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11659)) ^ 1553114283;
                        i5 = -1614498103;
                    } else {
                        iM55979 = C0946.m55979("ۗۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-3301)) ^ 582827246;
                        i5 = -53409844;
                    }
                    break;
                case -1683217602:
                case 84160823:
                    if (C0890.f81849 != 0) {
                        iM55979 = C0946.m55979("ۨ۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11659)) ^ 1553114283;
                        i5 = -1614498103;
                    } else {
                        iM55979 = C0946.m55979("ۚۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 20527) ^ (-582579919);
                        i5 = -852348837;
                    }
                    break;
                case -1601810110:
                case -707155950:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ۜ֫")) * 83;
                        i4 = ((iM55979 ^ i2) * 11085) ^ 316703190;
                        i5 = -2068895323;
                    } else {
                        iM55979 = C0873.m55680("ܽ۫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25003) ^ 1261129062;
                        i5 = 72228599;
                    }
                    break;
                case -1063004539:
                case 1290095666:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0946.m55979("ۖ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16477) ^ (-1510783202);
                        i5 = -1972206807;
                    } else {
                        iM55979 = C0873.m55680("ᩴܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 20265) ^ 450606528;
                        i5 = 1504715270;
                    }
                    break;
                case -907927070:
                case -228097776:
                    C0946.m55980();
                    if (C1124.m56367() < 0) {
                        iM55979 = C0946.m55979("ۖ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16477) ^ (-1510783202);
                        i5 = -1972206807;
                    } else {
                        iM55979 = C0946.m55979("ۗۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-3301)) ^ 582827246;
                        i5 = -53409844;
                    }
                    break;
                case -876566281:
                case 151776331:
                    this.f18838 = random;
                    return;
                case -465920472:
                case 307352496:
                    ServiceConnectionC1013.m56157();
                    iM55979 = C0946.m55979("ۨ۟") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-11659)) ^ 1553114283;
                    i5 = -1614498103;
                    break;
                case -419094145:
                case 1265877695:
                    if (C0890.f81849 != 0) {
                        iM55979 = C0946.m55979("ۨ۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11659)) ^ 1553114283;
                        i5 = -1614498103;
                    } else {
                        iM55979 = C0946.m55979("ۨܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7499)) ^ (-1537561233);
                        i5 = -461622668;
                    }
                    break;
                case 128397112:
                case 1438176061:
                    if (C0892.f81851) {
                        iM55979 = (C0873.m55680("ܰᩴ") + i2) * (-111);
                        i4 = ((iM55979 ^ i3) * (-28579)) ^ (-268144825);
                        i5 = 2061638826;
                    } else {
                        iM55979 = (C0946.m55979("᩶ۤ") ^ i3) * (-95);
                        i4 = ((iM55979 ^ i2) * (-8575)) ^ 798496690;
                        i5 = 281979311;
                    }
                    break;
                case 480623288:
                case 1109864701:
                    if (C1024.f81946) {
                        iM55979 = (C0946.m55979("᩶ۤ") ^ i3) * (-95);
                        i4 = ((iM55979 ^ i2) * (-8575)) ^ 798496690;
                        i5 = 281979311;
                    } else {
                        iM55979 = (C0873.m55680("۟ۡ") ^ i3) * (-67);
                        i4 = ((iM55979 ^ i2) * (-9491)) ^ (-10225363);
                        i5 = 393014271;
                    }
                    break;
                case 773936809:
                case 1252337361:
                    random = new Random();
                    if (C1044.m56286() <= 0) {
                        iM55979 = (i3 - C0946.m55979("ۜ֫")) * 83;
                        i4 = ((iM55979 ^ i2) * 11085) ^ 316703190;
                        i5 = -2068895323;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩹") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-23715)) ^ (-1878448012);
                        i5 = -1538372539;
                    }
                    break;
                case 1026188032:
                case 1274321110:
                    if (C0930.m55885() <= 0) {
                        iM55979 = C0946.m55979("ۖ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16477) ^ (-1510783202);
                        i5 = -1972206807;
                    } else {
                        iM55979 = C0873.m55680("ۙۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 3253) ^ 1540952863;
                        i5 = -666349909;
                    }
                    break;
                case 1225851804:
                case 1241496999:
                    if (!C1024.f81946) {
                        iM55979 = (i3 - C0946.m55979("ۜ֫")) * 83;
                        i4 = ((iM55979 ^ i2) * 11085) ^ 316703190;
                        i5 = -2068895323;
                    } else {
                        iM55979 = C0946.m55979("ۖ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16477) ^ (-1510783202);
                        i5 = -1972206807;
                    }
                    break;
                default:
                    C0930.m55885();
                    throw new RuntimeException();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int iM55680;
        int i2;
        int i3;
        int i4;
        String str;
        int iM55979;
        int i5;
        int i6;
        int i7;
        String str2;
        String strM56016;
        int i8;
        short[] sArr;
        int i9;
        int iM559710;
        int i10;
        int i11;
        int i12;
        int iM559711;
        int i13;
        int i14;
        int iM559712;
        int i15;
        int i16;
        int iM55681;
        int i17;
        int i18;
        ViewOnClickListenerC7218 viewOnClickListenerC7218 = this;
        int i19 = 1066516533;
        int i20 = C1036.f81953;
        int i21 = ViewOnClickListenerC0939.f81888;
        int iM55682 = C0873.m55680("۫ܶ") ^ i20;
        int i22 = ((iM55682 ^ i21) * 8367) ^ (-1836713291);
        int i23 = iM55682 ^ 1870084509;
        String str3 = null;
        ObjectAnimator objectAnimatorM55867 = null;
        ObjectAnimator objectAnimatorM56066 = null;
        ObjectAnimator objectAnimatorM55720 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        boolean z = false;
        boolean z2 = false;
        int i24 = 0;
        float f = 0.0f;
        int iNextInt = 0;
        String strM55592 = null;
        float rotation = 0.0f;
        float f2 = 0.0f;
        float rotation2 = 0.0f;
        char c = 0;
        short s = 0;
        int i25 = 0;
        int i26 = 0;
        short s2 = 0;
        boolean z3 = false;
        int i27 = 0;
        int i28 = 0;
        ObjectAnimator objectAnimator = null;
        float[] fArr = null;
        int i29 = 0;
        boolean z4 = false;
        while (true) {
            i19 = i23 ^ (i22 & (((i19 ^ i21) * 813) >> 31));
            switch (i19) {
                case -2026276195:
                case -1636420411:
                    if (C0882.m55710() == 0) {
                        iNextInt = iNextInt;
                        str = strM55592;
                        i4 = i27;
                        int iM55683 = C0873.m55680("۠ۧ") ^ i20;
                        int i30 = ((iM55683 ^ i21) * (-13635)) ^ 294032715;
                        i12 = iM55683 ^ (-978744189);
                        strM55592 = str;
                        i22 = i30;
                        i27 = i4;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC7218 = this;
                    } else {
                        iM55681 = C0873.m55680("ܰ۫") ^ i20;
                        i17 = ((iM55681 ^ i21) * 31685) ^ (-1892879672);
                        i18 = 1816273047;
                        i23 = iM55681 ^ i18;
                        i22 = i17;
                    }
                    break;
                case -1993033256:
                case 1673889580:
                    iNextInt = viewOnClickListenerC7218.f18838.nextInt(340) + 370;
                    z4 = viewOnClickListenerC7218.f18837;
                    if (z4) {
                        iM55681 = (C0873.m55680("ۜܳ") + i20) * (-39);
                        i17 = ((iM55681 ^ i21) * (-28175)) ^ (-1017508371);
                        i18 = 1758945195;
                    } else {
                        i29 = iNextInt;
                        iM55681 = C0873.m55680("ܺܽ") ^ i21;
                        i17 = ((iM55681 ^ i20) * 20997) ^ 1289974500;
                        i18 = 791514627;
                    }
                    i23 = iM55681 ^ i18;
                    i22 = i17;
                    break;
                case -1986739677:
                case 644044337:
                    i29 = i29;
                    iNextInt = iNextInt;
                    str = strM55592;
                    i4 = i27;
                    sArr3 = sArr3;
                    sArr2 = f81989;
                    c = 0;
                    if (C1071.f81975 <= 0) {
                        iM559710 = C0946.m55979("ۡۜ") ^ i21;
                        i10 = ((iM559710 ^ i20) * 12797) ^ 1667844365;
                        i11 = -900379415;
                    } else {
                        iM559710 = (C0946.m55979("֨۫") + i20) * 25;
                        i10 = ((iM559710 ^ i21) * 20247) ^ (-1330774877);
                        i11 = -736270847;
                    }
                    i12 = iM559710 ^ i11;
                    strM55592 = str;
                    i22 = i10;
                    i27 = i4;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC7218 = this;
                    break;
                case -1974753442:
                case -575348619:
                    C1012.m56134();
                    if (C1046.f81962 > 0) {
                        iM55681 = C0873.m55680("ܰ۫") ^ i20;
                        i17 = ((iM55681 ^ i21) * 31685) ^ (-1892879672);
                        i18 = 1816273047;
                        i23 = iM55681 ^ i18;
                        i22 = i17;
                    } else {
                        i = iNextInt;
                        iM55680 = C0946.m55979("᩺ۗ") ^ i21;
                        i2 = ((iM55680 ^ i20) * (-6981)) ^ 1468375432;
                        i3 = -1947590493;
                        i23 = iM55680 ^ i3;
                        int i31 = i2;
                        iNextInt = i;
                        i22 = i31;
                    }
                    break;
                case -1969102023:
                case -94688692:
                    RunnableC0871.m55672();
                    RunnableC1014.m56177();
                    i = iNextInt;
                    iM55680 = C0946.m55979("᩺ۗ") ^ i21;
                    i2 = ((iM55680 ^ i20) * (-6981)) ^ 1468375432;
                    i3 = -1947590493;
                    i23 = iM55680 ^ i3;
                    int i32 = i2;
                    iNextInt = i;
                    i22 = i32;
                    break;
                case -1909809002:
                case 1152021446:
                    z3 = false;
                    iM559712 = C0873.m55680("ᩴ᩵") ^ i20;
                    i15 = ((iM559712 ^ i21) * (-32219)) ^ 1823882295;
                    i16 = -1011282520;
                    i27 = i27;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i14 = i29;
                    i23 = iM559712 ^ i16;
                    i22 = i15;
                    i29 = i14;
                    break;
                case -1665370426:
                case 1718457693:
                    iNextInt = iNextInt;
                    fArr = new float[i24];
                    fArr[z2 ? 1 : 0] = view.getRotation();
                    fArr[z ? 1 : 0] = f;
                    if (C0967.f81910 < 0) {
                        iM55979 = (C0946.m55979("᩺ܶ") ^ i21) * 97;
                        i5 = ((iM55979 ^ i20) * 28649) ^ 613660183;
                        i6 = 2073198867;
                        i23 = iM55979 ^ i6;
                        i22 = i5;
                        iNextInt = iNextInt;
                    } else {
                        str = strM55592;
                        i4 = i27;
                        int iM55684 = C0873.m55680("۠ۧ") ^ i20;
                        int i33 = ((iM55684 ^ i21) * (-13635)) ^ 294032715;
                        i12 = iM55684 ^ (-978744189);
                        strM55592 = str;
                        i22 = i33;
                        i27 = i4;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC7218 = this;
                    }
                    break;
                case -1542858552:
                case -77807909:
                    iNextInt = iNextInt;
                    i27 = i27;
                    sArr3 = sArr3;
                    if (!objectAnimator.isRunning()) {
                        i7 = i29;
                        str2 = strM55592;
                        int iM559713 = (C0946.m55979("᩸ۜ") ^ i20) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        strM55592 = str2;
                        i27 = i27;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i22 = ((iM559713 ^ i21) * (-18033)) ^ 161949474;
                        viewOnClickListenerC7218 = this;
                        i14 = i7;
                        i23 = iM559713 ^ 1069986767;
                        i29 = i14;
                    } else {
                        iM559712 = C0946.m55979("ۡ֨") ^ i20;
                        i29 = i29;
                        i15 = ((iM559712 ^ i21) * 7915) ^ (-1396995268);
                        i16 = 166707988;
                        i27 = i27;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i14 = i29;
                        i23 = iM559712 ^ i16;
                        i22 = i15;
                        i29 = i14;
                    }
                    break;
                case -1528245244:
                case -540360951:
                    C0873.m55678();
                    C1124.m56367();
                    break;
                case -1321646911:
                case -1147868505:
                    i29 = -iNextInt;
                    iM55681 = C0873.m55680("ܺܽ") ^ i21;
                    i17 = ((iM55681 ^ i20) * 20997) ^ 1289974500;
                    i18 = 791514627;
                    i23 = iM55681 ^ i18;
                    i22 = i17;
                    break;
                case -1202665291:
                case -530591456:
                    if (C0882.m55710() != 0) {
                        iM55681 = (C0873.m55680("ܺ֡") + i20) * (-75);
                        i17 = ((iM55681 ^ i21) * 17821) ^ 1039557665;
                        i18 = 1059075567;
                        i23 = iM55681 ^ i18;
                        i22 = i17;
                    } else {
                        iNextInt = iNextInt;
                        str = strM55592;
                        i4 = i27;
                        int iM55685 = C0873.m55680("۠ۧ") ^ i20;
                        int i34 = ((iM55685 ^ i21) * (-13635)) ^ 294032715;
                        i12 = iM55685 ^ (-978744189);
                        strM55592 = str;
                        i22 = i34;
                        i27 = i4;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC7218 = this;
                    }
                    break;
                case -974758889:
                case 47105895:
                    objectAnimatorM55720.setInterpolator(new AccelerateInterpolator());
                    viewOnClickListenerC7218.f18840 = z2;
                    iM55979 = C0873.m55680("ᩳۡ") ^ i21;
                    i5 = ((iM55979 ^ i20) * (-24509)) ^ (-386165261);
                    i6 = -1139643051;
                    i23 = iM55979 ^ i6;
                    i22 = i5;
                    iNextInt = iNextInt;
                    break;
                case -823111430:
                case 1962921317:
                    i = iNextInt;
                    float[] fArr2 = new float[i24];
                    fArr2[z2 ? 1 : 0] = rotation;
                    fArr2[z ? 1 : 0] = f2;
                    objectAnimatorM56066 = C0967.m56066(view, str3, fArr2);
                    if (C1028.m56247() < 0) {
                        iM55680 = C0873.m55680("ܳۢ") ^ i20;
                        i2 = ((iM55680 ^ i21) * (-20141)) ^ (-2105833241);
                        i3 = 230277693;
                        i23 = iM55680 ^ i3;
                        int i35 = i2;
                        iNextInt = i;
                        i22 = i35;
                    } else {
                        iNextInt = i;
                        iM55979 = (C0873.m55680("ܳ֨") + i21) * 3;
                        i5 = ((iM55979 ^ i20) * (-9439)) ^ (-1828628540);
                        i6 = 1144869777;
                        i23 = iM55979 ^ i6;
                        i22 = i5;
                        iNextInt = iNextInt;
                    }
                    break;
                case -660955198:
                case 714829821:
                    i7 = i29;
                    iNextInt = iNextInt;
                    str2 = strM55592;
                    i27 = i27;
                    sArr3 = sArr3;
                    C1025.m56218(view, str2);
                    ObjectAnimator objectAnimator2 = viewOnClickListenerC7218.f18839;
                    z2 = false;
                    z2 = false;
                    if (objectAnimator2 != null) {
                        int iM55686 = (C0873.m55680("֨ۚ") + i21) * (-103);
                        int i36 = ((iM55686 ^ i20) * (-6795)) ^ (-755828745);
                        objectAnimator = objectAnimator2;
                        i27 = i27;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i29 = i7;
                        i23 = iM55686 ^ (-2125052151);
                        strM55592 = str2;
                        i22 = i36;
                        z = true;
                    } else {
                        objectAnimator = objectAnimator2;
                        z = true;
                        int iM559714 = (C0946.m55979("᩸ۜ") ^ i20) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        strM55592 = str2;
                        i27 = i27;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i22 = ((iM559714 ^ i21) * (-18033)) ^ 161949474;
                        viewOnClickListenerC7218 = this;
                        i14 = i7;
                        i23 = iM559714 ^ 1069986767;
                        i29 = i14;
                    }
                    break;
                case -660305827:
                case 670767026:
                    iNextInt = iNextInt;
                    if (!z3) {
                        iM55979 = C0873.m55680("֨ۡ") ^ i20;
                        i5 = ((iM55979 ^ i21) * 24535) ^ (-2012208074);
                        i6 = -2138176143;
                        i23 = iM55979 ^ i6;
                        i22 = i5;
                        iNextInt = iNextInt;
                    } else {
                        strM56016 = str3;
                        i8 = i27;
                        sArr = sArr3;
                        i9 = i28;
                        int iM559715 = C0946.m55979("ۛ᩷") ^ i21;
                        int i37 = ((iM559715 ^ i20) * (-33)) ^ 532728214;
                        i23 = iM559715 ^ 937872871;
                        i28 = i9;
                        i27 = i8;
                        sArr3 = sArr;
                        iNextInt = iNextInt;
                        str3 = strM56016;
                        i22 = i37;
                    }
                    break;
                case -557213996:
                case 1257433508:
                    i27 = 9421;
                    int iM559716 = (C0946.m55979("֨֡") ^ i21) * (-21);
                    int i38 = ((iM559716 ^ i20) * 20677) ^ (-359844126);
                    i12 = iM559716 ^ 1240892538;
                    strM55592 = strM55592;
                    i22 = i38;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC7218 = this;
                    break;
                case -481352179:
                case -284409882:
                    iNextInt = iNextInt;
                    ObjectAnimator objectAnimator3 = viewOnClickListenerC7218.f18839;
                    C0949.m56008(objectAnimator3);
                    objectAnimator3.cancel();
                    if (!viewOnClickListenerC7218.f18840) {
                        i7 = i29;
                        str2 = strM55592;
                        i27 = i27;
                        sArr3 = sArr3;
                        int iM559717 = (C0946.m55979("᩸ۜ") ^ i20) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        strM55592 = str2;
                        i27 = i27;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i22 = ((iM559717 ^ i21) * (-18033)) ^ 161949474;
                        viewOnClickListenerC7218 = this;
                        i14 = i7;
                        i23 = iM559717 ^ 1069986767;
                        i29 = i14;
                    } else {
                        iM55979 = (i20 - C0946.m55979("۠ܿ")) * 73;
                        i5 = ((iM55979 ^ i21) * 3653) ^ (-982513058);
                        i6 = 1049457018;
                        i23 = iM55979 ^ i6;
                        i22 = i5;
                        iNextInt = iNextInt;
                    }
                    break;
                case -451613362:
                case 74710579:
                    i27 = 47395;
                    int iM559718 = (C0946.m55979("֨֡") ^ i21) * (-21);
                    int i39 = ((iM559718 ^ i20) * 20677) ^ (-359844126);
                    i12 = iM559718 ^ 1240892538;
                    strM55592 = strM55592;
                    i22 = i39;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC7218 = this;
                    break;
                case -432138834:
                case -236838438:
                    viewOnClickListenerC7218.f18839 = objectAnimatorM55867;
                    C0877.m55699(objectAnimatorM55867);
                    objectAnimatorM55867.setInterpolator(new DecelerateInterpolator());
                    viewOnClickListenerC7218.f18840 = z;
                    iM55979 = C0873.m55680("ᩳۡ") ^ i21;
                    i5 = ((iM55979 ^ i20) * (-24509)) ^ (-386165261);
                    i6 = -1139643051;
                    i23 = iM55979 ^ i6;
                    i22 = i5;
                    iNextInt = iNextInt;
                    break;
                case -401967716:
                case 441498007:
                    z3 = true;
                    iM559712 = C0873.m55680("ᩴ᩵") ^ i20;
                    i15 = ((iM559712 ^ i21) * (-32219)) ^ 1823882295;
                    i16 = -1011282520;
                    i27 = i27;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i14 = i29;
                    i23 = iM559712 ^ i16;
                    i22 = i15;
                    i29 = i14;
                    break;
                case -399314004:
                case 1663665051:
                    ObjectAnimator objectAnimator4 = viewOnClickListenerC7218.f18839;
                    C0949.m56008(objectAnimator4);
                    C1964.m56585(objectAnimator4);
                    break;
                case -346422745:
                case -61399721:
                    i = iNextInt;
                    objectAnimatorM55720 = C0882.m55720(objectAnimatorM56066, 500L);
                    viewOnClickListenerC7218.f18839 = objectAnimatorM55720;
                    C0949.m56008(objectAnimatorM55720);
                    if (!C0949.m56012()) {
                        iM55680 = (C0873.m55680("ᩴ۫") + i21) * (-3);
                        i2 = ((iM55680 ^ i20) * (-2019)) ^ 2105818183;
                        i3 = 21341457;
                        i23 = iM55680 ^ i3;
                        int i310 = i2;
                        iNextInt = i;
                        i22 = i310;
                    } else {
                        iNextInt = i;
                        i4 = i27;
                        sArr3 = sArr3;
                        iM559711 = (C0946.m55979("۠ۢ") + i21) * 3;
                        i22 = ((iM559711 ^ i20) * 16361) ^ 287425477;
                        i13 = 567894238;
                        i12 = iM559711 ^ i13;
                        i27 = i4;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC7218 = this;
                    }
                    break;
                case -284299645:
                case 1482547865:
                    i29 = i29;
                    iNextInt = iNextInt;
                    str = strM55592;
                    i4 = i27;
                    sArr3 = sArr3;
                    s = sArr2[c];
                    i25 = s * 2;
                    if (C1046.f81962 > 0) {
                        iM559710 = C0946.m55979("۫᩷") ^ i21;
                        i10 = ((iM559710 ^ i20) * (-28485)) ^ 541081974;
                        i11 = 704818011;
                        i12 = iM559710 ^ i11;
                        strM55592 = str;
                        i22 = i10;
                        i27 = i4;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC7218 = this;
                    }
                    sArr3 = sArr3;
                    int iM55687 = C0873.m55680("۠ۧ") ^ i20;
                    int i311 = ((iM55687 ^ i21) * (-13635)) ^ 294032715;
                    i12 = iM55687 ^ (-978744189);
                    strM55592 = str;
                    i22 = i311;
                    i27 = i4;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC7218 = this;
                    break;
                case -4072526:
                case 1293260444:
                    i29 = i29;
                    iNextInt = iNextInt;
                    str = strM55592;
                    i4 = i27;
                    sArr3 = sArr3;
                    int i40 = s + s2;
                    if (i26 - (i40 * i40) <= 0) {
                        iM559710 = C0946.m55979("ۨ᩷") ^ i20;
                        i10 = ((iM559710 ^ i21) * (-19503)) ^ (-1734022835);
                        i11 = 942293070;
                    } else {
                        iM559710 = (C0873.m55680("ᩳۛ") ^ i20) * (-103);
                        i10 = ((iM559710 ^ i21) * 20907) ^ 837080779;
                        i11 = -20935077;
                    }
                    i12 = iM559710 ^ i11;
                    strM55592 = str;
                    i22 = i10;
                    i27 = i4;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC7218 = this;
                    break;
                case 592082577:
                case 1457868939:
                    C0947.m55997();
                    if (C1229.f82066 >= 0) {
                        iNextInt = iNextInt;
                        i4 = i27;
                        sArr3 = sArr3;
                        iM559711 = (C0946.m55979("۠ۢ") + i21) * 3;
                        i22 = ((iM559711 ^ i20) * 16361) ^ 287425477;
                        i13 = 567894238;
                        i12 = iM559711 ^ i13;
                        i27 = i4;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC7218 = this;
                    } else {
                        iM55681 = C0873.m55680("ܰ۫") ^ i20;
                        i17 = ((iM55681 ^ i21) * 31685) ^ (-1892879672);
                        i18 = 1816273047;
                        i23 = iM55681 ^ i18;
                        i22 = i17;
                    }
                    break;
                case 626615612:
                case 1048248452:
                    iNextInt = iNextInt;
                    i4 = i27;
                    rotation2 = view.getRotation();
                    i24 = 2;
                    sArr3 = f81989;
                    i28 = 2;
                    if (C0890.f81849 == 0) {
                        int iM559719 = C0946.m55979("֫֨") ^ i21;
                        i23 = iM559719 ^ 2100488481;
                        i27 = i4;
                        i22 = ((iM559719 ^ i20) * (-8879)) ^ 970013563;
                        iNextInt = iNextInt;
                    } else {
                        i29 = i29;
                        str = strM55592;
                        int iM55688 = C0873.m55680("۠ۧ") ^ i20;
                        int i312 = ((iM55688 ^ i21) * (-13635)) ^ 294032715;
                        i12 = iM55688 ^ (-978744189);
                        strM55592 = str;
                        i22 = i312;
                        i27 = i4;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC7218 = this;
                    }
                    break;
                case 689043531:
                case 1476129055:
                    iNextInt = iNextInt;
                    i8 = i27;
                    sArr = sArr3;
                    i9 = i28;
                    strM56016 = C0949.m56016(sArr, i9, 8, i8);
                    f = 0.0f;
                    if (rotation2 == 0.0f) {
                        int iM5597110 = C0946.m55979("ۛ᩷") ^ i21;
                        int i313 = ((iM5597110 ^ i20) * (-33)) ^ 532728214;
                        i23 = iM5597110 ^ 937872871;
                        i28 = i9;
                        i27 = i8;
                        sArr3 = sArr;
                        iNextInt = iNextInt;
                        str3 = strM56016;
                        i22 = i313;
                    } else {
                        int iM559720 = (i21 - C0946.m55979("ۨ֨")) * 37;
                        int i41 = ((iM559720 ^ i20) * 17287) ^ 884998373;
                        i23 = iM559720 ^ (-241012370);
                        i28 = i9;
                        i27 = i8;
                        sArr3 = sArr;
                        iNextInt = iNextInt;
                        str3 = strM56016;
                        i22 = i41;
                        f = 0.0f;
                    }
                    break;
                case 701936502:
                case 2064567671:
                    i = iNextInt;
                    viewOnClickListenerC7218.f18837 = (z4 ? 1 : 0) ^ (z ? 1 : 0);
                    rotation = view.getRotation();
                    float f3 = -i29;
                    if (C1003.f81929 > 0) {
                        int iM559721 = C0946.m55979("ᩴ᩹") ^ i20;
                        iNextInt = i;
                        i22 = ((iM559721 ^ i21) * 8915) ^ (-494909894);
                        i23 = iM559721 ^ (-1843419659);
                        f2 = f3;
                        iNextInt = iNextInt;
                    } else {
                        f2 = f3;
                        iM55680 = C0946.m55979("᩺ۗ") ^ i21;
                        i2 = ((iM55680 ^ i20) * (-6981)) ^ 1468375432;
                        i3 = -1947590493;
                        i23 = iM55680 ^ i3;
                        int i314 = i2;
                        iNextInt = i;
                        i22 = i314;
                    }
                    break;
                case 812986989:
                case 1678817795:
                    C1964.m56597();
                    if (C0854.f81826 == 0) {
                        i29 = i29;
                        iNextInt = iNextInt;
                        str = strM55592;
                        i4 = i27;
                        sArr3 = sArr3;
                        iM559710 = C0946.m55979("ۡۜ") ^ i21;
                        i10 = ((iM559710 ^ i20) * 12797) ^ 1667844365;
                        i11 = -900379415;
                        i12 = iM559710 ^ i11;
                        strM55592 = str;
                        i22 = i10;
                        i27 = i4;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC7218 = this;
                    }
                    iNextInt = iNextInt;
                    str = strM55592;
                    i4 = i27;
                    int iM55689 = C0873.m55680("۠ۧ") ^ i20;
                    int i315 = ((iM55689 ^ i21) * (-13635)) ^ 294032715;
                    i12 = iM55689 ^ (-978744189);
                    strM55592 = str;
                    i22 = i315;
                    i27 = i4;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC7218 = this;
                    break;
                case 1043858060:
                case 2116157312:
                    i29 = i29;
                    iNextInt = iNextInt;
                    str = strM55592;
                    i4 = i27;
                    sArr3 = sArr3;
                    i26 = i25 + 1;
                    s2 = 1;
                    if (C0866.f81837 < 0) {
                        iM559710 = C0873.m55680("ۡۧ") ^ i21;
                        i10 = ((iM559710 ^ i20) * 13805) ^ (-44461926);
                        i11 = 423030413;
                        i12 = iM559710 ^ i11;
                        strM55592 = str;
                        i22 = i10;
                        i27 = i4;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC7218 = this;
                    }
                    sArr3 = sArr3;
                    int iM556810 = C0873.m55680("۠ۧ") ^ i20;
                    int i316 = ((iM556810 ^ i21) * (-13635)) ^ 294032715;
                    i12 = iM556810 ^ (-978744189);
                    strM55592 = str;
                    i22 = i316;
                    i27 = i4;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC7218 = this;
                    break;
                case 1294677257:
                case 1357454176:
                    i29 = i29;
                    iNextInt = iNextInt;
                    i4 = i27;
                    sArr3 = sArr3;
                    strM55592 = C0845.m55592(f81989, 1, 1, i4);
                    if (C1017.m56187() <= 0) {
                        iM559711 = (C0946.m55979("۠ۢ") + i21) * 3;
                        i22 = ((iM559711 ^ i20) * 16361) ^ 287425477;
                        i13 = 567894238;
                    } else {
                        iM559711 = (i21 - C0946.m55979("۠ܳ")) * (-15);
                        i22 = ((iM559711 ^ i20) * (-22547)) ^ (-1191039518);
                        i13 = -915614106;
                    }
                    i12 = iM559711 ^ i13;
                    i27 = i4;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC7218 = this;
                    break;
                default:
                    iNextInt = iNextInt;
                    objectAnimatorM55867 = C0927.m55867(C1124.m56368(view, str3, fArr), 800L);
                    if (C0955.f81898) {
                        iM55979 = (C0873.m55680("ܳ֨") + i21) * 3;
                        i5 = ((iM55979 ^ i20) * (-9439)) ^ (-1828628540);
                        i6 = 1144869777;
                    } else {
                        iM55979 = (C0873.m55680("᩺᩺") ^ i20) * (-67);
                        i5 = ((iM55979 ^ i21) * 10899) ^ (-1875258570);
                        i6 = 1655066395;
                    }
                    i23 = iM55979 ^ i6;
                    i22 = i5;
                    iNextInt = iNextInt;
                    break;
            }
            return;
        }
    }
}
