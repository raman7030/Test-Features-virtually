package l;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Random;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC5103 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܿܰۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f16002 = {8600, 9403, 9407, 9378, 9401, 9388, 9401, 9380, 9378, 9379};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16003;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Random f16004;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ObjectAnimator f16005;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f16006;

    public ViewOnClickListenerC5103() {
        Random random = null;
        int i = -37507150;
        int i2 = C0422.f1886;
        int i3 = C2167.f7158;
        int iM6981 = C2105.m6981("֨ۧ") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-1331)) ^ (-681109440);
        int i5 = 1380897775;
        while (true) {
            i = ((((i ^ i3) * 6363) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2142016705:
                case -1129979815:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C2105.m6981("ۗۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3301)) ^ 582827246;
                        i5 = -53409844;
                    } else {
                        iM6981 = (C0630.m2566("ܶܺ") ^ i3) * 7;
                        i4 = ((iM6981 ^ i2) * 10507) ^ 669839872;
                        i5 = -1528545517;
                    }
                    break;
                case -2132437729:
                case 1859542791:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۜ֫")) * 83;
                        i4 = ((iM6981 ^ i2) * 11085) ^ 316703190;
                        i5 = -2068895323;
                    } else {
                        iM6981 = (C2105.m6981("ᩴܿ") + i3) * 123;
                        i4 = ((iM6981 ^ i2) * (-27901)) ^ 256195799;
                        i5 = 1797710460;
                    }
                    break;
                case -1835454857:
                case -1652997647:
                    if (!C2272.f7362) {
                        iM6981 = C2105.m6981("ۨ۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11659)) ^ 1553114283;
                        i5 = -1614498103;
                    } else {
                        iM6981 = C2105.m6981("ۗۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3301)) ^ 582827246;
                        i5 = -53409844;
                    }
                    break;
                case -1683217602:
                case 84160823:
                    if (C0964.f3626 != 0) {
                        iM6981 = C2105.m6981("ۨ۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11659)) ^ 1553114283;
                        i5 = -1614498103;
                    } else {
                        iM6981 = C2105.m6981("ۚۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 20527) ^ (-582579919);
                        i5 = -852348837;
                    }
                    break;
                case -1601810110:
                case -707155950:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۜ֫")) * 83;
                        i4 = ((iM6981 ^ i2) * 11085) ^ 316703190;
                        i5 = -2068895323;
                    } else {
                        iM6981 = C0630.m2566("ܽ۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 25003) ^ 1261129062;
                        i5 = 72228599;
                    }
                    break;
                case -1063004539:
                case 1290095666:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("ۖ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16477) ^ (-1510783202);
                        i5 = -1972206807;
                    } else {
                        iM6981 = C0630.m2566("ᩴܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 20265) ^ 450606528;
                        i5 = 1504715270;
                    }
                    break;
                case -907927070:
                case -228097776:
                    C2105.m6982();
                    if (C5695.m16023() < 0) {
                        iM6981 = C2105.m6981("ۖ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16477) ^ (-1510783202);
                        i5 = -1972206807;
                    } else {
                        iM6981 = C2105.m6981("ۗۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3301)) ^ 582827246;
                        i5 = -53409844;
                    }
                    break;
                case -876566281:
                case 151776331:
                    this.f16004 = random;
                    return;
                case -465920472:
                case 307352496:
                    ServiceConnectionC3453.m10564();
                    iM6981 = C2105.m6981("ۨ۟") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-11659)) ^ 1553114283;
                    i5 = -1614498103;
                    break;
                case -419094145:
                case 1265877695:
                    if (C0964.f3626 != 0) {
                        iM6981 = C2105.m6981("ۨ۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11659)) ^ 1553114283;
                        i5 = -1614498103;
                    } else {
                        iM6981 = C2105.m6981("ۨܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-7499)) ^ (-1537561233);
                        i5 = -461622668;
                    }
                    break;
                case 128397112:
                case 1438176061:
                    if (C1005.f3721) {
                        iM6981 = (C0630.m2566("ܰᩴ") + i2) * (-111);
                        i4 = ((iM6981 ^ i3) * (-28579)) ^ (-268144825);
                        i5 = 2061638826;
                    } else {
                        iM6981 = (C2105.m6981("᩶ۤ") ^ i3) * (-95);
                        i4 = ((iM6981 ^ i2) * (-8575)) ^ 798496690;
                        i5 = 281979311;
                    }
                    break;
                case 480623288:
                case 1109864701:
                    if (C3663.f11553) {
                        iM6981 = (C2105.m6981("᩶ۤ") ^ i3) * (-95);
                        i4 = ((iM6981 ^ i2) * (-8575)) ^ 798496690;
                        i5 = 281979311;
                    } else {
                        iM6981 = (C0630.m2566("۟ۡ") ^ i3) * (-67);
                        i4 = ((iM6981 ^ i2) * (-9491)) ^ (-10225363);
                        i5 = 393014271;
                    }
                    break;
                case 773936809:
                case 1252337361:
                    random = new Random();
                    if (C4075.m12263() <= 0) {
                        iM6981 = (i3 - C2105.m6981("ۜ֫")) * 83;
                        i4 = ((iM6981 ^ i2) * 11085) ^ 316703190;
                        i5 = -2068895323;
                    } else {
                        iM6981 = C2105.m6981("ۜ᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23715)) ^ (-1878448012);
                        i5 = -1538372539;
                    }
                    break;
                case 1026188032:
                case 1274321110:
                    if (C1773.m5908() <= 0) {
                        iM6981 = C2105.m6981("ۖ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16477) ^ (-1510783202);
                        i5 = -1972206807;
                    } else {
                        iM6981 = C0630.m2566("ۙۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3253) ^ 1540952863;
                        i5 = -666349909;
                    }
                    break;
                case 1225851804:
                case 1241496999:
                    if (!C3663.f11553) {
                        iM6981 = (i3 - C2105.m6981("ۜ֫")) * 83;
                        i4 = ((iM6981 ^ i2) * 11085) ^ 316703190;
                        i5 = -2068895323;
                    } else {
                        iM6981 = C2105.m6981("ۖ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16477) ^ (-1510783202);
                        i5 = -1972206807;
                    }
                    break;
                default:
                    C1773.m5908();
                    throw new RuntimeException();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int iM2566;
        int i2;
        int i3;
        int i4;
        String str;
        int iM6981;
        int i5;
        int i6;
        int i7;
        String str2;
        String strM7159;
        int i8;
        short[] sArr;
        int i9;
        int iM6982;
        int i10;
        int i11;
        int i12;
        int iM6983;
        int i13;
        int i14;
        int iM6984;
        int i15;
        int i16;
        int iM2567;
        int i17;
        int i18;
        ViewOnClickListenerC5103 viewOnClickListenerC5103 = this;
        int i19 = 1066516533;
        int i20 = C3911.f12484;
        int i21 = ViewOnClickListenerC1958.f6529;
        int iM2568 = C0630.m2566("۫ܶ") ^ i20;
        int i22 = ((iM2568 ^ i21) * 8367) ^ (-1836713291);
        int i23 = iM2568 ^ 1870084509;
        String str3 = null;
        ObjectAnimator objectAnimatorM5730 = null;
        ObjectAnimator objectAnimatorM8018 = null;
        ObjectAnimator objectAnimatorM3008 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        boolean z = false;
        boolean z2 = false;
        int i24 = 0;
        float f = 0.0f;
        int iNextInt = 0;
        String strM948 = null;
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
                    if (C0798.m2998() == 0) {
                        iNextInt = iNextInt;
                        str = strM948;
                        i4 = i27;
                        int iM2569 = C0630.m2566("۠ۧ") ^ i20;
                        int i30 = ((iM2569 ^ i21) * (-13635)) ^ 294032715;
                        i12 = iM2569 ^ (-978744189);
                        strM948 = str;
                        i22 = i30;
                        i27 = i4;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC5103 = this;
                    } else {
                        iM2567 = C0630.m2566("ܰ۫") ^ i20;
                        i17 = ((iM2567 ^ i21) * 31685) ^ (-1892879672);
                        i18 = 1816273047;
                        i23 = iM2567 ^ i18;
                        i22 = i17;
                    }
                    break;
                case -1993033256:
                case 1673889580:
                    iNextInt = viewOnClickListenerC5103.f16004.nextInt(340) + 370;
                    z4 = viewOnClickListenerC5103.f16003;
                    if (z4) {
                        iM2567 = (C0630.m2566("ۜܳ") + i20) * (-39);
                        i17 = ((iM2567 ^ i21) * (-28175)) ^ (-1017508371);
                        i18 = 1758945195;
                    } else {
                        i29 = iNextInt;
                        iM2567 = C0630.m2566("ܺܽ") ^ i21;
                        i17 = ((iM2567 ^ i20) * 20997) ^ 1289974500;
                        i18 = 791514627;
                    }
                    i23 = iM2567 ^ i18;
                    i22 = i17;
                    break;
                case -1986739677:
                case 644044337:
                    i29 = i29;
                    iNextInt = iNextInt;
                    str = strM948;
                    i4 = i27;
                    sArr3 = sArr3;
                    sArr2 = f16002;
                    c = 0;
                    if (C4616.f14690 <= 0) {
                        iM6982 = C2105.m6981("ۡۜ") ^ i21;
                        i10 = ((iM6982 ^ i20) * 12797) ^ 1667844365;
                        i11 = -900379415;
                    } else {
                        iM6982 = (C2105.m6981("֨۫") + i20) * 25;
                        i10 = ((iM6982 ^ i21) * 20247) ^ (-1330774877);
                        i11 = -736270847;
                    }
                    i12 = iM6982 ^ i11;
                    strM948 = str;
                    i22 = i10;
                    i27 = i4;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC5103 = this;
                    break;
                case -1974753442:
                case -575348619:
                    C3432.m10477();
                    if (C4117.f13076 > 0) {
                        iM2567 = C0630.m2566("ܰ۫") ^ i20;
                        i17 = ((iM2567 ^ i21) * 31685) ^ (-1892879672);
                        i18 = 1816273047;
                        i23 = iM2567 ^ i18;
                        i22 = i17;
                    } else {
                        i = iNextInt;
                        iM2566 = C2105.m6981("᩺ۗ") ^ i21;
                        i2 = ((iM2566 ^ i20) * (-6981)) ^ 1468375432;
                        i3 = -1947590493;
                        i23 = iM2566 ^ i3;
                        int i31 = i2;
                        iNextInt = i;
                        i22 = i31;
                    }
                    break;
                case -1969102023:
                case -94688692:
                    RunnableC0588.m2441();
                    RunnableC3474.m10630();
                    i = iNextInt;
                    iM2566 = C2105.m6981("᩺ۗ") ^ i21;
                    i2 = ((iM2566 ^ i20) * (-6981)) ^ 1468375432;
                    i3 = -1947590493;
                    i23 = iM2566 ^ i3;
                    int i32 = i2;
                    iNextInt = i;
                    i22 = i32;
                    break;
                case -1909809002:
                case 1152021446:
                    z3 = false;
                    iM6984 = C0630.m2566("ᩴ᩵") ^ i20;
                    i15 = ((iM6984 ^ i21) * (-32219)) ^ 1823882295;
                    i16 = -1011282520;
                    i27 = i27;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i14 = i29;
                    i23 = iM6984 ^ i16;
                    i22 = i15;
                    i29 = i14;
                    break;
                case -1665370426:
                case 1718457693:
                    iNextInt = iNextInt;
                    fArr = new float[i24];
                    fArr[z2 ? 1 : 0] = view.getRotation();
                    fArr[z ? 1 : 0] = f;
                    if (C2520.f8000 < 0) {
                        iM6981 = (C2105.m6981("᩺ܶ") ^ i21) * 97;
                        i5 = ((iM6981 ^ i20) * 28649) ^ 613660183;
                        i6 = 2073198867;
                        i23 = iM6981 ^ i6;
                        i22 = i5;
                        iNextInt = iNextInt;
                    } else {
                        str = strM948;
                        i4 = i27;
                        int iM25610 = C0630.m2566("۠ۧ") ^ i20;
                        int i33 = ((iM25610 ^ i21) * (-13635)) ^ 294032715;
                        i12 = iM25610 ^ (-978744189);
                        strM948 = str;
                        i22 = i33;
                        i27 = i4;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC5103 = this;
                    }
                    break;
                case -1542858552:
                case -77807909:
                    iNextInt = iNextInt;
                    i27 = i27;
                    sArr3 = sArr3;
                    if (!objectAnimator.isRunning()) {
                        i7 = i29;
                        str2 = strM948;
                        int iM6985 = (C2105.m6981("᩸ۜ") ^ i20) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        strM948 = str2;
                        i27 = i27;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i22 = ((iM6985 ^ i21) * (-18033)) ^ 161949474;
                        viewOnClickListenerC5103 = this;
                        i14 = i7;
                        i23 = iM6985 ^ 1069986767;
                        i29 = i14;
                    } else {
                        iM6984 = C2105.m6981("ۡ֨") ^ i20;
                        i29 = i29;
                        i15 = ((iM6984 ^ i21) * 7915) ^ (-1396995268);
                        i16 = 166707988;
                        i27 = i27;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i14 = i29;
                        i23 = iM6984 ^ i16;
                        i22 = i15;
                        i29 = i14;
                    }
                    break;
                case -1528245244:
                case -540360951:
                    C0630.m2564();
                    C5695.m16023();
                    break;
                case -1321646911:
                case -1147868505:
                    i29 = -iNextInt;
                    iM2567 = C0630.m2566("ܺܽ") ^ i21;
                    i17 = ((iM2567 ^ i20) * 20997) ^ 1289974500;
                    i18 = 791514627;
                    i23 = iM2567 ^ i18;
                    i22 = i17;
                    break;
                case -1202665291:
                case -530591456:
                    if (C0798.m2998() != 0) {
                        iM2567 = (C0630.m2566("ܺ֡") + i20) * (-75);
                        i17 = ((iM2567 ^ i21) * 17821) ^ 1039557665;
                        i18 = 1059075567;
                        i23 = iM2567 ^ i18;
                        i22 = i17;
                    } else {
                        iNextInt = iNextInt;
                        str = strM948;
                        i4 = i27;
                        int iM25611 = C0630.m2566("۠ۧ") ^ i20;
                        int i34 = ((iM25611 ^ i21) * (-13635)) ^ 294032715;
                        i12 = iM25611 ^ (-978744189);
                        strM948 = str;
                        i22 = i34;
                        i27 = i4;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC5103 = this;
                    }
                    break;
                case -974758889:
                case 47105895:
                    objectAnimatorM3008.setInterpolator(new AccelerateInterpolator());
                    viewOnClickListenerC5103.f16006 = z2;
                    iM6981 = C0630.m2566("ᩳۡ") ^ i21;
                    i5 = ((iM6981 ^ i20) * (-24509)) ^ (-386165261);
                    i6 = -1139643051;
                    i23 = iM6981 ^ i6;
                    i22 = i5;
                    iNextInt = iNextInt;
                    break;
                case -823111430:
                case 1962921317:
                    i = iNextInt;
                    float[] fArr2 = new float[i24];
                    fArr2[z2 ? 1 : 0] = rotation;
                    fArr2[z ? 1 : 0] = f2;
                    objectAnimatorM8018 = C2520.m8018(view, str3, fArr2);
                    if (C3746.m11369() < 0) {
                        iM2566 = C0630.m2566("ܳۢ") ^ i20;
                        i2 = ((iM2566 ^ i21) * (-20141)) ^ (-2105833241);
                        i3 = 230277693;
                        i23 = iM2566 ^ i3;
                        int i35 = i2;
                        iNextInt = i;
                        i22 = i35;
                    } else {
                        iNextInt = i;
                        iM6981 = (C0630.m2566("ܳ֨") + i21) * 3;
                        i5 = ((iM6981 ^ i20) * (-9439)) ^ (-1828628540);
                        i6 = 1144869777;
                        i23 = iM6981 ^ i6;
                        i22 = i5;
                        iNextInt = iNextInt;
                    }
                    break;
                case -660955198:
                case 714829821:
                    i7 = i29;
                    iNextInt = iNextInt;
                    str2 = strM948;
                    i27 = i27;
                    sArr3 = sArr3;
                    C3683.m11210(view, str2);
                    ObjectAnimator objectAnimator2 = viewOnClickListenerC5103.f16005;
                    z2 = false;
                    z2 = false;
                    if (objectAnimator2 != null) {
                        int iM25612 = (C0630.m2566("֨ۚ") + i21) * (-103);
                        int i36 = ((iM25612 ^ i20) * (-6795)) ^ (-755828745);
                        objectAnimator = objectAnimator2;
                        i27 = i27;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i29 = i7;
                        i23 = iM25612 ^ (-2125052151);
                        strM948 = str2;
                        i22 = i36;
                        z = true;
                    } else {
                        objectAnimator = objectAnimator2;
                        z = true;
                        int iM6986 = (C2105.m6981("᩸ۜ") ^ i20) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        strM948 = str2;
                        i27 = i27;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i22 = ((iM6986 ^ i21) * (-18033)) ^ 161949474;
                        viewOnClickListenerC5103 = this;
                        i14 = i7;
                        i23 = iM6986 ^ 1069986767;
                        i29 = i14;
                    }
                    break;
                case -660305827:
                case 670767026:
                    iNextInt = iNextInt;
                    if (!z3) {
                        iM6981 = C0630.m2566("֨ۡ") ^ i20;
                        i5 = ((iM6981 ^ i21) * 24535) ^ (-2012208074);
                        i6 = -2138176143;
                        i23 = iM6981 ^ i6;
                        i22 = i5;
                        iNextInt = iNextInt;
                    } else {
                        strM7159 = str3;
                        i8 = i27;
                        sArr = sArr3;
                        i9 = i28;
                        int iM6987 = C2105.m6981("ۛ᩷") ^ i21;
                        int i37 = ((iM6987 ^ i20) * (-33)) ^ 532728214;
                        i23 = iM6987 ^ 937872871;
                        i28 = i9;
                        i27 = i8;
                        sArr3 = sArr;
                        iNextInt = iNextInt;
                        str3 = strM7159;
                        i22 = i37;
                    }
                    break;
                case -557213996:
                case 1257433508:
                    i27 = 9421;
                    int iM6988 = (C2105.m6981("֨֡") ^ i21) * (-21);
                    int i38 = ((iM6988 ^ i20) * 20677) ^ (-359844126);
                    i12 = iM6988 ^ 1240892538;
                    strM948 = strM948;
                    i22 = i38;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC5103 = this;
                    break;
                case -481352179:
                case -284409882:
                    iNextInt = iNextInt;
                    ObjectAnimator objectAnimator3 = viewOnClickListenerC5103.f16005;
                    C2167.m7151(objectAnimator3);
                    objectAnimator3.cancel();
                    if (!viewOnClickListenerC5103.f16006) {
                        i7 = i29;
                        str2 = strM948;
                        i27 = i27;
                        sArr3 = sArr3;
                        int iM6989 = (C2105.m6981("᩸ۜ") ^ i20) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        strM948 = str2;
                        i27 = i27;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i22 = ((iM6989 ^ i21) * (-18033)) ^ 161949474;
                        viewOnClickListenerC5103 = this;
                        i14 = i7;
                        i23 = iM6989 ^ 1069986767;
                        i29 = i14;
                    } else {
                        iM6981 = (i20 - C2105.m6981("۠ܿ")) * 73;
                        i5 = ((iM6981 ^ i21) * 3653) ^ (-982513058);
                        i6 = 1049457018;
                        i23 = iM6981 ^ i6;
                        i22 = i5;
                        iNextInt = iNextInt;
                    }
                    break;
                case -451613362:
                case 74710579:
                    i27 = 47395;
                    int iM69810 = (C2105.m6981("֨֡") ^ i21) * (-21);
                    int i39 = ((iM69810 ^ i20) * 20677) ^ (-359844126);
                    i12 = iM69810 ^ 1240892538;
                    strM948 = strM948;
                    i22 = i39;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC5103 = this;
                    break;
                case -432138834:
                case -236838438:
                    viewOnClickListenerC5103.f16005 = objectAnimatorM5730;
                    C0714.m2808(objectAnimatorM5730);
                    objectAnimatorM5730.setInterpolator(new DecelerateInterpolator());
                    viewOnClickListenerC5103.f16006 = z;
                    iM6981 = C0630.m2566("ᩳۡ") ^ i21;
                    i5 = ((iM6981 ^ i20) * (-24509)) ^ (-386165261);
                    i6 = -1139643051;
                    i23 = iM6981 ^ i6;
                    i22 = i5;
                    iNextInt = iNextInt;
                    break;
                case -401967716:
                case 441498007:
                    z3 = true;
                    iM6984 = C0630.m2566("ᩴ᩵") ^ i20;
                    i15 = ((iM6984 ^ i21) * (-32219)) ^ 1823882295;
                    i16 = -1011282520;
                    i27 = i27;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i14 = i29;
                    i23 = iM6984 ^ i16;
                    i22 = i15;
                    i29 = i14;
                    break;
                case -399314004:
                case 1663665051:
                    ObjectAnimator objectAnimator4 = viewOnClickListenerC5103.f16005;
                    C2167.m7151(objectAnimator4);
                    C22628.m50603(objectAnimator4);
                    break;
                case -346422745:
                case -61399721:
                    i = iNextInt;
                    objectAnimatorM3008 = C0798.m3008(objectAnimatorM8018, 500L);
                    viewOnClickListenerC5103.f16005 = objectAnimatorM3008;
                    C2167.m7151(objectAnimatorM3008);
                    if (!C2167.m7155()) {
                        iM2566 = (C0630.m2566("ᩴ۫") + i21) * (-3);
                        i2 = ((iM2566 ^ i20) * (-2019)) ^ 2105818183;
                        i3 = 21341457;
                        i23 = iM2566 ^ i3;
                        int i310 = i2;
                        iNextInt = i;
                        i22 = i310;
                    } else {
                        iNextInt = i;
                        i4 = i27;
                        sArr3 = sArr3;
                        iM6983 = (C2105.m6981("۠ۢ") + i21) * 3;
                        i22 = ((iM6983 ^ i20) * 16361) ^ 287425477;
                        i13 = 567894238;
                        i12 = iM6983 ^ i13;
                        i27 = i4;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC5103 = this;
                    }
                    break;
                case -284299645:
                case 1482547865:
                    i29 = i29;
                    iNextInt = iNextInt;
                    str = strM948;
                    i4 = i27;
                    sArr3 = sArr3;
                    s = sArr2[c];
                    i25 = s * 2;
                    if (C4117.f13076 > 0) {
                        iM6982 = C2105.m6981("۫᩷") ^ i21;
                        i10 = ((iM6982 ^ i20) * (-28485)) ^ 541081974;
                        i11 = 704818011;
                        i12 = iM6982 ^ i11;
                        strM948 = str;
                        i22 = i10;
                        i27 = i4;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC5103 = this;
                    }
                    sArr3 = sArr3;
                    int iM25613 = C0630.m2566("۠ۧ") ^ i20;
                    int i311 = ((iM25613 ^ i21) * (-13635)) ^ 294032715;
                    i12 = iM25613 ^ (-978744189);
                    strM948 = str;
                    i22 = i311;
                    i27 = i4;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC5103 = this;
                    break;
                case -4072526:
                case 1293260444:
                    i29 = i29;
                    iNextInt = iNextInt;
                    str = strM948;
                    i4 = i27;
                    sArr3 = sArr3;
                    int i40 = s + s2;
                    if (i26 - (i40 * i40) <= 0) {
                        iM6982 = C2105.m6981("ۨ᩷") ^ i20;
                        i10 = ((iM6982 ^ i21) * (-19503)) ^ (-1734022835);
                        i11 = 942293070;
                    } else {
                        iM6982 = (C0630.m2566("ᩳۛ") ^ i20) * (-103);
                        i10 = ((iM6982 ^ i21) * 20907) ^ 837080779;
                        i11 = -20935077;
                    }
                    i12 = iM6982 ^ i11;
                    strM948 = str;
                    i22 = i10;
                    i27 = i4;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC5103 = this;
                    break;
                case 592082577:
                case 1457868939:
                    C2126.m7040();
                    if (C7811.f24123 >= 0) {
                        iNextInt = iNextInt;
                        i4 = i27;
                        sArr3 = sArr3;
                        iM6983 = (C2105.m6981("۠ۢ") + i21) * 3;
                        i22 = ((iM6983 ^ i20) * 16361) ^ 287425477;
                        i13 = 567894238;
                        i12 = iM6983 ^ i13;
                        i27 = i4;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC5103 = this;
                    } else {
                        iM2567 = C0630.m2566("ܰ۫") ^ i20;
                        i17 = ((iM2567 ^ i21) * 31685) ^ (-1892879672);
                        i18 = 1816273047;
                        i23 = iM2567 ^ i18;
                        i22 = i17;
                    }
                    break;
                case 626615612:
                case 1048248452:
                    iNextInt = iNextInt;
                    i4 = i27;
                    rotation2 = view.getRotation();
                    i24 = 2;
                    sArr3 = f16002;
                    i28 = 2;
                    if (C0964.f3626 == 0) {
                        int iM69811 = C2105.m6981("֫֨") ^ i21;
                        i23 = iM69811 ^ 2100488481;
                        i27 = i4;
                        i22 = ((iM69811 ^ i20) * (-8879)) ^ 970013563;
                        iNextInt = iNextInt;
                    } else {
                        i29 = i29;
                        str = strM948;
                        int iM25614 = C0630.m2566("۠ۧ") ^ i20;
                        int i312 = ((iM25614 ^ i21) * (-13635)) ^ 294032715;
                        i12 = iM25614 ^ (-978744189);
                        strM948 = str;
                        i22 = i312;
                        i27 = i4;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC5103 = this;
                    }
                    break;
                case 689043531:
                case 1476129055:
                    iNextInt = iNextInt;
                    i8 = i27;
                    sArr = sArr3;
                    i9 = i28;
                    strM7159 = C2167.m7159(sArr, i9, 8, i8);
                    f = 0.0f;
                    if (rotation2 == 0.0f) {
                        int iM69812 = C2105.m6981("ۛ᩷") ^ i21;
                        int i313 = ((iM69812 ^ i20) * (-33)) ^ 532728214;
                        i23 = iM69812 ^ 937872871;
                        i28 = i9;
                        i27 = i8;
                        sArr3 = sArr;
                        iNextInt = iNextInt;
                        str3 = strM7159;
                        i22 = i313;
                    } else {
                        int iM69813 = (i21 - C2105.m6981("ۨ֨")) * 37;
                        int i41 = ((iM69813 ^ i20) * 17287) ^ 884998373;
                        i23 = iM69813 ^ (-241012370);
                        i28 = i9;
                        i27 = i8;
                        sArr3 = sArr;
                        iNextInt = iNextInt;
                        str3 = strM7159;
                        i22 = i41;
                        f = 0.0f;
                    }
                    break;
                case 701936502:
                case 2064567671:
                    i = iNextInt;
                    viewOnClickListenerC5103.f16003 = (z4 ? 1 : 0) ^ (z ? 1 : 0);
                    rotation = view.getRotation();
                    float f3 = -i29;
                    if (C3245.f10203 > 0) {
                        int iM69814 = C2105.m6981("ᩴ᩹") ^ i20;
                        iNextInt = i;
                        i22 = ((iM69814 ^ i21) * 8915) ^ (-494909894);
                        i23 = iM69814 ^ (-1843419659);
                        f2 = f3;
                        iNextInt = iNextInt;
                    } else {
                        f2 = f3;
                        iM2566 = C2105.m6981("᩺ۗ") ^ i21;
                        i2 = ((iM2566 ^ i20) * (-6981)) ^ 1468375432;
                        i3 = -1947590493;
                        i23 = iM2566 ^ i3;
                        int i314 = i2;
                        iNextInt = i;
                        i22 = i314;
                    }
                    break;
                case 812986989:
                case 1678817795:
                    C22628.m50615();
                    if (C0237.f1507 == 0) {
                        i29 = i29;
                        iNextInt = iNextInt;
                        str = strM948;
                        i4 = i27;
                        sArr3 = sArr3;
                        iM6982 = C2105.m6981("ۡۜ") ^ i21;
                        i10 = ((iM6982 ^ i20) * 12797) ^ 1667844365;
                        i11 = -900379415;
                        i12 = iM6982 ^ i11;
                        strM948 = str;
                        i22 = i10;
                        i27 = i4;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC5103 = this;
                    }
                    iNextInt = iNextInt;
                    str = strM948;
                    i4 = i27;
                    int iM25615 = C0630.m2566("۠ۧ") ^ i20;
                    int i315 = ((iM25615 ^ i21) * (-13635)) ^ 294032715;
                    i12 = iM25615 ^ (-978744189);
                    strM948 = str;
                    i22 = i315;
                    i27 = i4;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC5103 = this;
                    break;
                case 1043858060:
                case 2116157312:
                    i29 = i29;
                    iNextInt = iNextInt;
                    str = strM948;
                    i4 = i27;
                    sArr3 = sArr3;
                    i26 = i25 + 1;
                    s2 = 1;
                    if (C0483.f2088 < 0) {
                        iM6982 = C0630.m2566("ۡۧ") ^ i21;
                        i10 = ((iM6982 ^ i20) * 13805) ^ (-44461926);
                        i11 = 423030413;
                        i12 = iM6982 ^ i11;
                        strM948 = str;
                        i22 = i10;
                        i27 = i4;
                        sArr3 = sArr3;
                        iNextInt = iNextInt;
                        i29 = i29;
                        i23 = i12;
                        viewOnClickListenerC5103 = this;
                    }
                    sArr3 = sArr3;
                    int iM25616 = C0630.m2566("۠ۧ") ^ i20;
                    int i316 = ((iM25616 ^ i21) * (-13635)) ^ 294032715;
                    i12 = iM25616 ^ (-978744189);
                    strM948 = str;
                    i22 = i316;
                    i27 = i4;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC5103 = this;
                    break;
                case 1294677257:
                case 1357454176:
                    i29 = i29;
                    iNextInt = iNextInt;
                    i4 = i27;
                    sArr3 = sArr3;
                    strM948 = C0050.m948(f16002, 1, 1, i4);
                    if (C3537.m10746() <= 0) {
                        iM6983 = (C2105.m6981("۠ۢ") + i21) * 3;
                        i22 = ((iM6983 ^ i20) * 16361) ^ 287425477;
                        i13 = 567894238;
                    } else {
                        iM6983 = (i21 - C2105.m6981("۠ܳ")) * (-15);
                        i22 = ((iM6983 ^ i20) * (-22547)) ^ (-1191039518);
                        i13 = -915614106;
                    }
                    i12 = iM6983 ^ i13;
                    i27 = i4;
                    sArr3 = sArr3;
                    iNextInt = iNextInt;
                    i29 = i29;
                    i23 = i12;
                    viewOnClickListenerC5103 = this;
                    break;
                default:
                    iNextInt = iNextInt;
                    objectAnimatorM5730 = C1711.m5730(C5695.m16025(view, str3, fArr), 800L);
                    if (C2272.f7362) {
                        iM6981 = (C0630.m2566("ܳ֨") + i21) * 3;
                        i5 = ((iM6981 ^ i20) * (-9439)) ^ (-1828628540);
                        i6 = 1144869777;
                    } else {
                        iM6981 = (C0630.m2566("᩺᩺") ^ i20) * (-67);
                        i5 = ((iM6981 ^ i21) * 10899) ^ (-1875258570);
                        i6 = 1655066395;
                    }
                    i23 = iM6981 ^ i6;
                    i22 = i5;
                    iNextInt = iNextInt;
                    break;
            }
            return;
        }
    }
}
