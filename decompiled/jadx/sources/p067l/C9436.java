package p067l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.۟ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X2T2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9436 extends AbstractC21283 {

    /* JADX INFO: renamed from: ܿ᩶ۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f82057 = {244, 2874, 15451, 1499, 26887, 26887, 26887, 3165, -4016, 14559, 15527, -2437, 15562, 4625, 26322, 25962, -22313, -32693, 32040, 27043};

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C18309 f25765;

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        C18309 c18309 = null;
        int iM55989 = 0;
        int i = 1314038087;
        int i2 = C0930.f81879;
        int i3 = ServiceConnectionC1013.f81940;
        int iM55680 = (C0873.m55680("ۜۢ") + i3) * 51;
        int i4 = ((iM55680 ^ i2) * (-20849)) ^ 1231817682;
        int i5 = 637397296;
        while (true) {
            i = ((((i ^ i2) * (-20335)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2145747219:
                case -1380961576:
                    C1044.m56286();
                    return 0;
                case -2127436884:
                case 275531826:
                    c18309 = this.f25765;
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0946.m55979("֨ۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19031)) ^ (-1485853112);
                        i5 = -1364743896;
                    } else {
                        iM55680 = C0873.m55680("ۛܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 5755) ^ 683877740;
                        i5 = -1794388371;
                    }
                    break;
                case -1638612003:
                case 416336620:
                    iM55989 = C0947.m55989(c18309.f54696);
                    if (C1053.f81965 <= 0) {
                        iM55680 = (i3 - C0873.m55680("ܽᩳ")) * 119;
                        i4 = ((iM55680 ^ i2) * (-14413)) ^ 592643542;
                        i5 = 1929693190;
                    } else {
                        iM55680 = C0873.m55680("ۤۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-14359)) ^ (-1294309267);
                        i5 = -943999591;
                    }
                    break;
                case -1621286930:
                case -1038398050:
                    if (c18309.f54685) {
                        iM55680 = C0946.m55979("ۖ۫") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20619) ^ 640879553;
                        i5 = 1319488273;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۙۤ")) * (-113);
                        i4 = ((iM55680 ^ i2) * (-11605)) ^ (-601487899);
                        i5 = -1090150307;
                    }
                    break;
                case -1571625804:
                case 850630756:
                    return 0;
                case -1206619381:
                case 214180021:
                    if (C0912.f81867 <= 0) {
                        iM55680 = (i3 - C0873.m55680("ܽᩳ")) * 119;
                        i4 = ((iM55680 ^ i2) * (-14413)) ^ 592643542;
                        i5 = 1929693190;
                    } else {
                        iM55680 = (C0873.m55680("ܿۘ") + i2) * 81;
                        i4 = ((iM55680 ^ i3) * 11709) ^ 1933508176;
                        i5 = -2060880988;
                    }
                    break;
                case -1145670561:
                case 804688261:
                    if (C0854.m55595() >= 0) {
                        iM55680 = C0946.m55979("֨ۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19031)) ^ (-1485853112);
                        i5 = -1364743896;
                    } else {
                        iM55680 = C0873.m55680("ܳۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 15985) ^ (-1260211805);
                        i5 = -1183886552;
                    }
                    break;
                case -838049834:
                case 1429835335:
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("ۗۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-25985)) ^ (-460838247);
                        i5 = -812684125;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܽᩳ")) * 119;
                        i4 = ((iM55680 ^ i2) * (-14413)) ^ 592643542;
                        i5 = 1929693190;
                    }
                    break;
                case -758595878:
                case 726441116:
                    return iM55989 + 1;
                case -639055914:
                case -377021108:
                    if (C0949.m56018(c18309.f54696)) {
                        iM55680 = C0946.m55979("ۖ۫") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20619) ^ 640879553;
                        i5 = 1319488273;
                    } else {
                        iM55680 = C0946.m55979("ۗ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-31459)) ^ (-935455269);
                        i5 = 913142254;
                    }
                    break;
                case -421100379:
                case 491615048:
                    C0877.m55696();
                    iM55680 = C0946.m55979("֨ۛ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-19031)) ^ (-1485853112);
                    i5 = -1364743896;
                    break;
                case -418019304:
                case 1327255483:
                    if (C0863.f81833 <= 0) {
                        iM55680 = (i2 - C0873.m55680("ܶ֨")) * 31;
                        i4 = ((iM55680 ^ i3) * (-1259)) ^ 636906833;
                        i5 = 1312136985;
                    } else {
                        iM55680 = C0873.m55680("ܽܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 29103) ^ (-1885492391);
                        i5 = 1209896545;
                    }
                    break;
                case 5357360:
                case 595084087:
                    if (C1194.f82045 != 0) {
                        iM55680 = (i2 - C0873.m55680("ܶ֨")) * 31;
                        i4 = ((iM55680 ^ i3) * (-1259)) ^ 636906833;
                        i5 = 1312136985;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ܽܿ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i3) * 16703) ^ 1325612177;
                        i5 = -2116685781;
                    }
                    break;
                case 62439730:
                case 551817023:
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("֨ۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19031)) ^ (-1485853112);
                        i5 = -1364743896;
                    } else {
                        iM55680 = C0946.m55979("ۚܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-5235)) ^ (-1221993455);
                        i5 = -324601909;
                    }
                    break;
                case 736614221:
                case 1436041289:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0873.m55680("ۘۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-12841)) ^ 1154474182;
                        i5 = 1590012441;
                    } else {
                        iM55680 = C0946.m55979("᩹᩵") ^ i3;
                        i4 = ((iM55680 ^ i2) * 25679) ^ 2051194680;
                        i5 = -533685543;
                    }
                    break;
                case 833800038:
                case 1439348112:
                    AbstractC0942.m55971();
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0873.m55680("ۘۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-12841)) ^ 1154474182;
                        i5 = 1590012441;
                    } else {
                        iM55680 = C0946.m55979("֨ۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19031)) ^ (-1485853112);
                        i5 = -1364743896;
                    }
                    break;
                case 1149813350:
                case 1721763854:
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0873.m55680("ۤ᩸") ^ i3) * (-111);
                        i4 = ((iM55680 ^ i2) * (-23835)) ^ (-125893891);
                        i5 = -1347166255;
                    } else {
                        iM55680 = C0873.m55680("ۨ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31347) ^ 920603915;
                        i5 = -1177638961;
                    }
                    break;
                case 1785871689:
                case 1886916880:
                    RunnableC0897.m55784();
                    if (C1012.m56134() <= 0) {
                        iM55680 = (C0873.m55680("ۤ᩸") ^ i3) * (-111);
                        i4 = ((iM55680 ^ i2) * (-23835)) ^ (-125893891);
                        i5 = -1347166255;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ܶ֨")) * 31;
                        i4 = ((iM55680 ^ i3) * (-1259)) ^ 636906833;
                        i5 = 1312136985;
                    }
                    break;
                default:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (i2 - C0873.m55680("ܶ֨")) * 31;
                        i4 = ((iM55680 ^ i3) * (-1259)) ^ 636906833;
                        i5 = 1312136985;
                    } else {
                        iM55680 = C0946.m55979("֨ۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19031)) ^ (-1485853112);
                        i5 = -1364743896;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        int i2;
        TextView textView;
        String str;
        short[] sArr;
        int iM55680;
        int i3;
        int i4;
        int i5;
        TextView textView2;
        String str2;
        int i6;
        int iM55979;
        int i7;
        int i8;
        String str3;
        TextView textView3;
        int iM559710;
        int i9;
        int i10;
        int i11;
        int i12;
        String str4;
        short[] sArr2;
        ImageView imageView;
        int i13;
        TextView textView4;
        int iM559711;
        int i14;
        int i15;
        int i16;
        int iM51761;
        int iM55681;
        int i17;
        int i18 = 0;
        int i19 = 0;
        int i20 = -707881934;
        int i21 = C0877.f81843;
        int i22 = C1053.f81965;
        int iM55682 = C0873.m55680("᩸᩷") ^ i21;
        int i23 = ((iM55682 ^ i22) * (-1125)) ^ (-993521298);
        int i24 = iM55682 ^ (-764486514);
        TextView textView5 = null;
        String strM46298 = null;
        C18249 c18249M34318 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i25 = 0;
        int i26 = 0;
        int iM55762 = 0;
        int i27 = 0;
        int iM559712 = 0;
        int iM559713 = 0;
        int i28 = 0;
        C18309 c18309 = null;
        int i29 = 0;
        short s = 0;
        ImageView imageView2 = null;
        String strM55936 = null;
        C20521 c20521 = null;
        SpannableStringBuilder spannableStringBuilderM55604 = null;
        ViewOnClickListenerC4228 viewOnClickListenerC4228 = null;
        SpannableStringBuilder spannableStringBuilder = null;
        int i30 = 0;
        while (true) {
            i20 = i24 ^ (i23 & (((i20 ^ i22) * 15569) >> 31));
            switch (i20) {
                case -2128027881:
                case -1780582395:
                    C18309.m41697(c18309, (ViewOnClickListenerC12946) abstractC5462);
                    break;
                case -2124266346:
                case -954803164:
                    i5 = i27;
                    i29 = i29;
                    textView2 = textView5;
                    str2 = strM46298;
                    sArr5 = sArr5;
                    i30 = i30;
                    int i31 = i19;
                    imageView2 = imageView2;
                    i6 = i31;
                    s = sArr3[0];
                    i18 = s * s;
                    if (C1012.f81938 >= 0) {
                        iM559710 = (i21 - C0946.m55979("֡ܳ")) * 61;
                        i23 = ((iM559710 ^ i22) * 6855) ^ (-1013205287);
                        i9 = -323921780;
                    } else {
                        iM559710 = C0946.m55979("ۢ᩶") ^ i22;
                        i23 = ((iM559710 ^ i21) * 27229) ^ 207899579;
                        i9 = 49080403;
                    }
                    i10 = iM559710 ^ i9;
                    i30 = i30;
                    strM46298 = str2;
                    i16 = i5;
                    i24 = i10;
                    sArr5 = sArr5;
                    textView5 = textView2;
                    i29 = i29;
                    i27 = i16;
                    ImageView imageView3 = imageView2;
                    i19 = i6;
                    imageView2 = imageView3;
                    break;
                case -1963211412:
                case 956587538:
                    C0946.m55980();
                    iM55681 = (i22 - C0946.m55979("֫ܳ")) * (-105);
                    i14 = ((iM55681 ^ i21) * 28741) ^ 1152863937;
                    i17 = -1736871323;
                    i24 = iM55681 ^ i17;
                    i23 = i14;
                    break;
                case -1960402955:
                case 693938650:
                    i5 = i27;
                    C0894.m55771(viewOnClickListenerC4228.f9303, spannableStringBuilder);
                    C0894.m55771(viewOnClickListenerC4228.f9306, c20521.m46281());
                    if (!C1048.f81963) {
                        textView3 = textView5;
                        str3 = strM46298;
                        int i32 = i19;
                        imageView2 = imageView2;
                        i6 = i32;
                        int iM55683 = C0873.m55680("ۗܺ") ^ i21;
                        String str5 = str3;
                        s = s;
                        i23 = ((iM55683 ^ i22) * (-29037)) ^ 313786935;
                        sArr5 = sArr5;
                        textView5 = textView3;
                        i16 = i5;
                        i24 = iM55683 ^ (-1886886705);
                        i30 = i30;
                        strM46298 = str5;
                        i29 = i29;
                        i27 = i16;
                        ImageView imageView4 = imageView2;
                        i19 = i6;
                        imageView2 = imageView4;
                    } else {
                        iM559711 = C0946.m55979("ۗܿ") ^ i21;
                        i14 = ((iM559711 ^ i22) * 23085) ^ (-2057344766);
                        i15 = 685227834;
                        int i33 = iM559711 ^ i15;
                        i27 = i5;
                        i24 = i33;
                        i23 = i14;
                    }
                    break;
                case -1761814380:
                case -1499955601:
                    C17837.m40506(C1048.m56317(c20521), c20521.m46311(), c20521.m46289(), viewOnClickListenerC4228.f9308);
                    break;
                case -1688202801:
                case -857971469:
                    if (C1053.f81965 <= 0) {
                        i5 = i27;
                        i29 = i29;
                        textView2 = textView5;
                        str2 = strM46298;
                        sArr5 = sArr5;
                        i30 = i30;
                        int i34 = i19;
                        imageView2 = imageView2;
                        i6 = i34;
                        iM559710 = (i21 - C0946.m55979("֡ܳ")) * 61;
                        i23 = ((iM559710 ^ i22) * 6855) ^ (-1013205287);
                        i9 = -323921780;
                        i10 = iM559710 ^ i9;
                        i30 = i30;
                        strM46298 = str2;
                        i16 = i5;
                        i24 = i10;
                        sArr5 = sArr5;
                        textView5 = textView2;
                        i29 = i29;
                        i27 = i16;
                        ImageView imageView5 = imageView2;
                        i19 = i6;
                        imageView2 = imageView5;
                    } else {
                        i2 = i27;
                        textView = textView5;
                        str = strM46298;
                        sArr = sArr5;
                        iM55680 = (i21 - C0873.m55680("ᩳܰ")) * (-121);
                        i3 = ((iM55680 ^ i22) * 4837) ^ 1835333814;
                        i4 = -2027436270;
                        int i35 = iM55680 ^ i4;
                        strM46298 = str;
                        int i36 = i2;
                        i24 = i35;
                        sArr5 = sArr;
                        textView5 = textView;
                        i23 = i3;
                        i27 = i36;
                    }
                    break;
                case -1679020745:
                case 1712857350:
                    i5 = i27;
                    iM559713 = C0946.m55979(RunnableC1014.m56180(f82057, 10, 3, i30));
                    i28 = 2118556974;
                    if (RunnableC0871.f81839 < 0) {
                        iM559711 = C0946.m55979("ۤۖ") ^ i21;
                        i14 = ((iM559711 ^ i22) * (-22953)) ^ 1020884268;
                        i15 = -1818408428;
                        int i37 = iM559711 ^ i15;
                        i27 = i5;
                        i24 = i37;
                        i23 = i14;
                    } else {
                        i29 = i29;
                        textView2 = textView5;
                        str2 = strM46298;
                        sArr5 = sArr5;
                        i30 = i30;
                        int i38 = i19;
                        imageView2 = imageView2;
                        i6 = i38;
                        iM559710 = (i21 - C0946.m55979("֡ܳ")) * 61;
                        i23 = ((iM559710 ^ i22) * 6855) ^ (-1013205287);
                        i9 = -323921780;
                        i10 = iM559710 ^ i9;
                        i30 = i30;
                        strM46298 = str2;
                        i16 = i5;
                        i24 = i10;
                        sArr5 = sArr5;
                        textView5 = textView2;
                        i29 = i29;
                        i27 = i16;
                        ImageView imageView6 = imageView2;
                        i19 = i6;
                        imageView2 = imageView6;
                    }
                    break;
                case -1580387278:
                case 914043461:
                    i5 = i27;
                    i29 = i29;
                    textView2 = textView5;
                    str2 = strM46298;
                    sArr5 = sArr5;
                    i30 = i30;
                    int i39 = i19;
                    imageView2 = imageView2;
                    i6 = i39;
                    boolean z = abstractC5462 instanceof ViewOnClickListenerC4228;
                    C18309 c183010 = this.f25765;
                    if (z) {
                        int iM559714 = (C0946.m55979("ۚܺ") + i21) * (-75);
                        c18309 = c183010;
                        int i40 = ((iM559714 ^ i22) * 2481) ^ (-1592203101);
                        int i41 = iM559714 ^ 423832876;
                        i30 = i30;
                        strM46298 = str2;
                        i23 = i40;
                        sArr5 = sArr5;
                        textView5 = textView2;
                        i29 = i29;
                        i27 = i5;
                        i24 = i41;
                    } else {
                        c18309 = c183010;
                        int iM559715 = C0946.m55979("ܰܺ") ^ i21;
                        i23 = ((iM559715 ^ i22) * (-7799)) ^ 960289445;
                        i10 = iM559715 ^ 258417408;
                        i30 = i30;
                        strM46298 = str2;
                        i16 = i5;
                        i24 = i10;
                        sArr5 = sArr5;
                        textView5 = textView2;
                        i29 = i29;
                        i27 = i16;
                    }
                    ImageView imageView7 = imageView2;
                    i19 = i6;
                    imageView2 = imageView7;
                    break;
                case -1478476034:
                case 1326926709:
                    i5 = i27;
                    TextView textView6 = textView5;
                    String str6 = strM46298;
                    C0894.m55771(textView6, str6);
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilderM55604 = C0854.m55604(spannableStringBuilder, c20521.m46280());
                    if (C1929.m56553()) {
                        str3 = str6;
                        textView3 = textView6;
                        int i310 = i19;
                        imageView2 = imageView2;
                        i6 = i310;
                        int iM55684 = C0873.m55680("ۗܺ") ^ i21;
                        String str7 = str3;
                        s = s;
                        i23 = ((iM55684 ^ i22) * (-29037)) ^ 313786935;
                        sArr5 = sArr5;
                        textView5 = textView3;
                        i16 = i5;
                        i24 = iM55684 ^ (-1886886705);
                        i30 = i30;
                        strM46298 = str7;
                        i29 = i29;
                        i27 = i16;
                        ImageView imageView8 = imageView2;
                        i19 = i6;
                        imageView2 = imageView8;
                    } else {
                        int iM559716 = C0946.m55979("ۗܰ") ^ i21;
                        strM46298 = str6;
                        i23 = ((iM559716 ^ i22) * (-27695)) ^ (-1134528169);
                        sArr5 = sArr5;
                        textView5 = textView6;
                        i24 = iM559716 ^ (-1369387141);
                        i27 = i5;
                    }
                    break;
                case -1028937748:
                case 508161004:
                    i6 = i19;
                    i11 = 45276;
                    int iM55685 = (C0873.m55680("᩸ۡ") ^ i22) * (-51);
                    i30 = i11;
                    strM46298 = strM46298;
                    i23 = ((iM55685 ^ i21) * (-26787)) ^ 1786922663;
                    sArr5 = sArr5;
                    textView5 = textView5;
                    i29 = i29;
                    i27 = i27;
                    i24 = iM55685 ^ 818047295;
                    c18309 = c18309;
                    ImageView imageView9 = imageView2;
                    i19 = i6;
                    imageView2 = imageView9;
                    break;
                case -949021801:
                case 1473260685:
                    i5 = i27;
                    i12 = i29;
                    TextView textView7 = textView5;
                    str4 = strM46298;
                    sArr2 = sArr5;
                    int i42 = i19;
                    imageView = imageView2;
                    i13 = i42;
                    viewOnClickListenerC4228 = (ViewOnClickListenerC4228) abstractC5462;
                    textView4 = textView7;
                    c20521 = (C20521) C1929.m56563(c18309.f54696, i);
                    viewOnClickListenerC4228.f9307 = c20521;
                    if (C0912.f81867 <= 0) {
                        int iM55686 = C0873.m55680("ۤۜ") ^ i22;
                        i23 = ((iM55686 ^ i21) * (-29979)) ^ 339469533;
                        sArr5 = sArr2;
                        textView5 = textView4;
                        i29 = i12;
                        i27 = i5;
                        i24 = iM55686 ^ (-1354963809);
                    } else {
                        int iM55687 = C0873.m55680("۠ᩴ") ^ i22;
                        sArr5 = sArr2;
                        textView5 = textView4;
                        i29 = i12;
                        i27 = i5;
                        i24 = iM55687 ^ 1346418874;
                        i23 = ((iM55687 ^ i21) * 27233) ^ 17973364;
                        i30 = i30;
                    }
                    strM46298 = str4;
                    ImageView imageView10 = imageView;
                    i19 = i13;
                    imageView2 = imageView10;
                    break;
                case -848449972:
                case 1545767020:
                    i5 = i27;
                    i29 = i29;
                    textView2 = textView5;
                    str2 = strM46298;
                    s = s;
                    sArr5 = sArr5;
                    i30 = i30;
                    int i43 = i19;
                    imageView2 = imageView2;
                    i6 = i43;
                    sArr3 = f82057;
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = (C0946.m55979("ۖᩴ") + i21) * 95;
                        i7 = ((iM55979 ^ i22) * 28343) ^ (-1993206151);
                        i8 = 145095041;
                        i10 = iM55979 ^ i8;
                        s = s;
                        i23 = i7;
                        i30 = i30;
                        strM46298 = str2;
                        i16 = i5;
                        i24 = i10;
                        sArr5 = sArr5;
                        textView5 = textView2;
                        i29 = i29;
                        i27 = i16;
                        ImageView imageView11 = imageView2;
                        i19 = i6;
                        imageView2 = imageView11;
                    } else {
                        str3 = str2;
                        textView3 = textView2;
                        int iM55688 = C0873.m55680("ۗܺ") ^ i21;
                        String str8 = str3;
                        s = s;
                        i23 = ((iM55688 ^ i22) * (-29037)) ^ 313786935;
                        sArr5 = sArr5;
                        textView5 = textView3;
                        i16 = i5;
                        i24 = iM55688 ^ (-1886886705);
                        i30 = i30;
                        strM46298 = str8;
                        i29 = i29;
                        i27 = i16;
                        ImageView imageView12 = imageView2;
                        i19 = i6;
                        imageView2 = imageView12;
                    }
                    break;
                case -825279140:
                case 2124496272:
                    sArr5 = sArr5;
                    i5 = i27;
                    short[] sArr6 = sArr4;
                    int i44 = i19;
                    i29 = i29;
                    int iM55689 = C0873.m55680(C0894.m55773(sArr6, i29, i44, i30)) ^ 2121471814;
                    sArr4 = sArr6;
                    ImageView imageView13 = imageView2;
                    imageView13.setImageResource(iM55689);
                    textView3 = viewOnClickListenerC4228.f9304;
                    strM46298 = c20521.m46298();
                    if (C1003.m56123() != 0) {
                        imageView2 = imageView13;
                        i6 = i44;
                        str3 = strM46298;
                        s = s;
                        i30 = i30;
                        int iM556810 = C0873.m55680("ۗܺ") ^ i21;
                        String str9 = str3;
                        s = s;
                        i23 = ((iM556810 ^ i22) * (-29037)) ^ 313786935;
                        sArr5 = sArr5;
                        textView5 = textView3;
                        i16 = i5;
                        i24 = iM556810 ^ (-1886886705);
                        i30 = i30;
                        strM46298 = str9;
                        i29 = i29;
                        i27 = i16;
                        ImageView imageView14 = imageView2;
                        i19 = i6;
                        imageView2 = imageView14;
                    } else {
                        int iM556811 = (C0873.m55680("ۨ᩸") ^ i22) * (-17);
                        int i45 = ((iM556811 ^ i21) * (-2103)) ^ 1169379254;
                        i29 = i29;
                        i27 = i5;
                        i24 = iM556811 ^ 573944886;
                        imageView2 = imageView13;
                        i19 = i44;
                        i23 = i45;
                        sArr5 = sArr5;
                        textView5 = textView3;
                    }
                    break;
                case -692842850:
                case -70191691:
                    i5 = i27;
                    C0946.m55983(spannableStringBuilder, new ForegroundColorSpan(i27), iM55762, C0894.m55762(spannableStringBuilder), 33);
                    iM559711 = C0873.m55680("ۘ᩻") ^ i22;
                    i14 = ((iM559711 ^ i21) * (-20263)) ^ 669893129;
                    i15 = -1082500994;
                    int i311 = iM559711 ^ i15;
                    i27 = i5;
                    i24 = i311;
                    i23 = i14;
                    break;
                case -645502832:
                case -645432672:
                    i5 = i27;
                    C0854.m55604(spannableStringBuilder, strM55936);
                    iM55762 = C0894.m55762(spannableStringBuilder);
                    if (c18249M34318.m41556() < c20521.m46311()) {
                        iM559711 = C0946.m55979("۬֫") ^ i22;
                        i14 = ((iM559711 ^ i21) * 31275) ^ 1018685087;
                        i15 = 1380242449;
                    } else {
                        iM559711 = (i21 - C0873.m55680("ܺۤ")) * 25;
                        i14 = ((iM559711 ^ i22) * (-30795)) ^ 1131437913;
                        i15 = -794515778;
                    }
                    int i312 = iM559711 ^ i15;
                    i27 = i5;
                    i24 = i312;
                    i23 = i14;
                    break;
                case -537952909:
                case 1679588870:
                    i2 = i27;
                    textView = textView5;
                    str = strM46298;
                    sArr = sArr5;
                    imageView2 = viewOnClickListenerC4228.f9308;
                    sArr4 = f82057;
                    i29 = 1;
                    i19 = 3;
                    if (C1046.f81962 <= 0) {
                        iM55680 = (i21 - C0873.m55680("ᩳܰ")) * (-121);
                        i3 = ((iM55680 ^ i22) * 4837) ^ 1835333814;
                        i4 = -2027436270;
                    } else {
                        iM55680 = C0873.m55680("ۢۢ") ^ i21;
                        i3 = ((iM55680 ^ i22) * 1963) ^ 1723016939;
                        i4 = -252773427;
                    }
                    int i313 = iM55680 ^ i4;
                    strM46298 = str;
                    int i314 = i2;
                    i24 = i313;
                    sArr5 = sArr;
                    textView5 = textView;
                    i23 = i3;
                    i27 = i314;
                    break;
                case -467314699:
                case 503796133:
                    C1024.m56209();
                    C0946.m55980();
                    break;
                case -394788183:
                case 917515951:
                    i5 = i27;
                    i29 = i29;
                    textView2 = textView5;
                    str2 = strM46298;
                    sArr5 = sArr5;
                    i30 = i30;
                    int i46 = i19;
                    imageView2 = imageView2;
                    i6 = i46;
                    int i47 = i18 + 98644624;
                    s = s;
                    int i48 = s + 9932;
                    if ((i47 + i47) - (i48 * i48) < 0) {
                        iM55979 = (C0946.m55979("᩻ۨ") ^ i22) * (-27);
                        i7 = ((iM55979 ^ i21) * 19443) ^ (-1491301620);
                        i8 = 1739647541;
                    } else {
                        iM55979 = (C0873.m55680("۠ۨ") ^ i21) * 37;
                        i7 = ((iM55979 ^ i22) * 22231) ^ 1839206635;
                        i8 = -1642257396;
                    }
                    i10 = iM55979 ^ i8;
                    s = s;
                    i23 = i7;
                    i30 = i30;
                    strM46298 = str2;
                    i16 = i5;
                    i24 = i10;
                    sArr5 = sArr5;
                    textView5 = textView2;
                    i29 = i29;
                    i27 = i16;
                    ImageView imageView15 = imageView2;
                    i19 = i6;
                    imageView2 = imageView15;
                    break;
                case -392542108:
                case 29861265:
                    if (!C0890.m55740()) {
                        i5 = i27;
                        i12 = i29;
                        textView4 = textView5;
                        str4 = strM46298;
                        sArr2 = sArr5;
                        int i49 = i19;
                        imageView = imageView2;
                        i13 = i49;
                        int iM556812 = C0873.m55680("ۤۜ") ^ i22;
                        i23 = ((iM556812 ^ i21) * (-29979)) ^ 339469533;
                        sArr5 = sArr2;
                        textView5 = textView4;
                        i29 = i12;
                        i27 = i5;
                        i24 = iM556812 ^ (-1354963809);
                        strM46298 = str4;
                        ImageView imageView16 = imageView;
                        i19 = i13;
                        imageView2 = imageView16;
                    } else {
                        iM55681 = (i22 - C0946.m55979("֫ܳ")) * (-105);
                        i14 = ((iM55681 ^ i21) * 28741) ^ 1152863937;
                        i17 = -1736871323;
                        i24 = iM55681 ^ i17;
                        i23 = i14;
                    }
                    break;
                case -331603260:
                case 539954783:
                    i5 = i27;
                    sArr5 = f82057;
                    i25 = 4;
                    i26 = 3;
                    if (C0946.f81894 == 0) {
                        iM559711 = C0946.m55979("ܺ᩶") ^ i22;
                        i14 = ((iM559711 ^ i21) * 10733) ^ 444936028;
                        i15 = 1357602645;
                        int i315 = iM559711 ^ i15;
                        i27 = i5;
                        i24 = i315;
                        i23 = i14;
                    } else {
                        i12 = i29;
                        textView4 = textView5;
                        str4 = strM46298;
                        sArr2 = sArr5;
                        int i410 = i19;
                        imageView = imageView2;
                        i13 = i410;
                        int iM556813 = C0873.m55680("ۤۜ") ^ i22;
                        i23 = ((iM556813 ^ i21) * (-29979)) ^ 339469533;
                        sArr5 = sArr2;
                        textView5 = textView4;
                        i29 = i12;
                        i27 = i5;
                        i24 = iM556813 ^ (-1354963809);
                        strM46298 = str4;
                        ImageView imageView17 = imageView;
                        i19 = i13;
                        imageView2 = imageView17;
                    }
                    break;
                case -140514530:
                case 1689717376:
                    C0854.m55604(spannableStringBuilder, ServiceConnectionC1013.m56156(2124272352 ^ iM559712));
                    iM51761 = C23223.f72969;
                    i27 = iM51761;
                    iM55681 = C0873.m55680("ۧܽ") ^ i22;
                    i14 = ((iM55681 ^ i21) * 15115) ^ (-1143926774);
                    i17 = -488048000;
                    i24 = iM55681 ^ i17;
                    i23 = i14;
                    break;
                case 261784837:
                case 1763769433:
                    i6 = i19;
                    i11 = 26919;
                    int iM556814 = (C0873.m55680("᩸ۡ") ^ i22) * (-51);
                    i30 = i11;
                    strM46298 = strM46298;
                    i23 = ((iM556814 ^ i21) * (-26787)) ^ 1786922663;
                    sArr5 = sArr5;
                    textView5 = textView5;
                    i29 = i29;
                    i27 = i27;
                    i24 = iM556814 ^ 818047295;
                    c18309 = c18309;
                    ImageView imageView18 = imageView2;
                    i19 = i6;
                    imageView2 = imageView18;
                    break;
                case 297577160:
                case 1689750529:
                    i5 = i27;
                    strM55936 = RunnableC0938.m55936(sArr5, i25, i26, i30);
                    C0854.m55604(C1036.m56254(spannableStringBuilderM55604, strM55936), C24158.m53411(c20521.m46292()));
                    c18249M34318 = C14976.m34318(C0947.m55990(c20521));
                    if (c18249M34318 != null) {
                        iM559711 = C0873.m55680("ۧܶ") ^ i22;
                        i14 = ((iM559711 ^ i21) * 30761) ^ 617365530;
                        i15 = -304440169;
                    } else {
                        iM559711 = C0873.m55680("ۘ᩻") ^ i22;
                        i14 = ((iM559711 ^ i21) * (-20263)) ^ 669893129;
                        i15 = -1082500994;
                    }
                    int i316 = iM559711 ^ i15;
                    i27 = i5;
                    i24 = i316;
                    i23 = i14;
                    break;
                case 464298614:
                case 500337787:
                    C0854.m55604(spannableStringBuilder, C1044.m56275(iM559713 ^ i28));
                    iM51761 = C23223.m51761(-1996767, -29696);
                    i27 = iM51761;
                    iM55681 = C0873.m55680("ۧܽ") ^ i22;
                    i14 = ((iM55681 ^ i21) * 15115) ^ (-1143926774);
                    i17 = -488048000;
                    i24 = iM55681 ^ i17;
                    i23 = i14;
                    break;
                case 889608517:
                case 1943154227:
                    i5 = i27;
                    iM559712 = C0946.m55979(C1028.m56235(f82057, 7, 3, i30));
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM559711 = C0946.m55979("ۚۗ") ^ i21;
                        i14 = ((iM559711 ^ i22) * (-4099)) ^ 7022198;
                        i15 = 2043685438;
                        int i317 = iM559711 ^ i15;
                        i27 = i5;
                        i24 = i317;
                        i23 = i14;
                    } else {
                        i12 = i29;
                        textView4 = textView5;
                        str4 = strM46298;
                        sArr2 = sArr5;
                        int i411 = i19;
                        imageView = imageView2;
                        i13 = i411;
                        int iM556815 = C0873.m55680("ۤۜ") ^ i22;
                        i23 = ((iM556815 ^ i21) * (-29979)) ^ 339469533;
                        sArr5 = sArr2;
                        textView5 = textView4;
                        i29 = i12;
                        i27 = i5;
                        i24 = iM556815 ^ (-1354963809);
                        strM46298 = str4;
                        ImageView imageView19 = imageView;
                        i19 = i13;
                        imageView2 = imageView19;
                    }
                    break;
                default:
                    C0912.m55833();
                    if (!C0882.f81846) {
                        iM55681 = (i22 - C0946.m55979("֫ܳ")) * (-105);
                        i14 = ((iM55681 ^ i21) * 28741) ^ 1152863937;
                        i17 = -1736871323;
                        i24 = iM55681 ^ i17;
                        i23 = i14;
                    } else {
                        i2 = i27;
                        textView = textView5;
                        str = strM46298;
                        sArr = sArr5;
                        iM55680 = (i21 - C0873.m55680("ᩳܰ")) * (-121);
                        i3 = ((iM55680 ^ i22) * 4837) ^ 1835333814;
                        i4 = -2027436270;
                        int i318 = iM55680 ^ i4;
                        strM46298 = str;
                        int i319 = i2;
                        i24 = i318;
                        sArr5 = sArr;
                        textView5 = textView;
                        i23 = i3;
                        i27 = i319;
                    }
                    break;
            }
            return;
        }
    }

    public C9436(C18309 c18309) {
        this.f25765 = c18309;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0162 A[PHI: r8 r9
      0x0162: PHI (r8v5 java.lang.String) = (r8v3 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:41:0x0160, B:27:0x00e7, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v3 java.lang.String), (r9v2 java.lang.String) binds: [B:41:0x0160, B:27:0x00e7, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0091, code lost:
    
        if (p067l.C1964.f83032 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        if (p067l.C1964.f83032 > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0089, code lost:
    
        if (p067l.C0892.f81851 != false) goto L10;
     */
    @Override // p067l.AbstractC21283
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iM55979;
        int i2;
        int i3;
        int iM559710;
        int i4;
        ViewGroup viewGroup2 = viewGroup;
        int i5 = C1025.f81947;
        int i6 = C0989.f81920;
        int iM55680 = C0873.m55680("ܰۖ") ^ i6;
        int i7 = ((iM55680 ^ i5) * (-4115)) ^ 1130395802;
        LayoutInflater layoutInflaterFrom = null;
        LayoutInflater layoutInflaterFrom2 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM55680 ^ 858988735;
        int iM55681 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1749390592;
        int i15 = 0;
        C18309 c18309 = null;
        short[] sArr3 = null;
        boolean z = false;
        String strM56203 = null;
        String strM56336 = null;
        int iM559711 = 0;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i5) * (-18261)) >> 31));
            switch (i14) {
                case -2102201507:
                case -1788995315:
                    i9 = 61501;
                    int iM559712 = C0946.m55979("֡ᩴ") ^ i5;
                    i8 = iM559712 ^ (-618578705);
                    i7 = ((iM559712 ^ i6) * (-11521)) ^ (-1448005414);
                    viewGroup2 = viewGroup;
                    break;
                case -2046054908:
                case -1576199405:
                    return new ViewOnClickListenerC4228(c18309, layoutInflaterFrom2.inflate(iM559711, viewGroup2, z));
                case -1899541728:
                case 1207700498:
                    iM559711 = 2126175013 ^ C0946.m55979(strM56203);
                    if (C1044.f81959 < 0) {
                        iM559710 = (i6 - C0873.m55680("֨᩵")) * 51;
                        i2 = ((iM559710 ^ i5) * (-4465)) ^ 806462410;
                        i4 = 1405285946;
                        i8 = iM559710 ^ i4;
                        i7 = i2;
                    } else {
                        iM55979 = C0873.m55680("ۖ۠") ^ i5;
                        i2 = ((iM55979 ^ i6) * (-23523)) ^ (-1737136087);
                        i3 = -1839148098;
                        i8 = iM55979 ^ i3;
                        viewGroup2 = viewGroup;
                        i7 = i2;
                    }
                    break;
                case -1452736351:
                case -1132147112:
                    layoutInflaterFrom2 = LayoutInflater.from(c18309.f54678);
                    sArr2 = f82057;
                    i11 = 17;
                    if (!C1929.m56553()) {
                        iM559710 = C0873.m55680("֨᩻") ^ i6;
                        i2 = ((iM559710 ^ i5) * 1963) ^ 1772408299;
                        i4 = -739268825;
                        i8 = iM559710 ^ i4;
                        i7 = i2;
                    }
                    iM55979 = C0946.m55979("᩵ۚ") ^ i5;
                    i2 = ((iM55979 ^ i6) * 28383) ^ 384306767;
                    i3 = 684992852;
                    i8 = iM55979 ^ i3;
                    viewGroup2 = viewGroup;
                    i7 = i2;
                    break;
                case -1177197758:
                case -160072445:
                    sArr3 = f82057;
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0946.m55979("ۜۛ") ^ i5;
                        i2 = ((iM55979 ^ i6) * (-10441)) ^ (-892239224);
                        i3 = 1258096296;
                    } else {
                        iM55979 = C0946.m55979("᩺ۙ") ^ i6;
                        i2 = ((iM55979 ^ i5) * 2275) ^ (-1455920988);
                        i3 = 1050522798;
                    }
                    i8 = iM55979 ^ i3;
                    viewGroup2 = viewGroup;
                    i7 = i2;
                    break;
                case -1167005023:
                case -1099293638:
                    break;
                case -976065011:
                case -876849754:
                    s = sArr3[13];
                    s2 = 11942;
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("ۖ۠") ^ i5;
                        i2 = ((iM55979 ^ i6) * (-23523)) ^ (-1737136087);
                        i3 = -1839148098;
                    } else {
                        iM55979 = C0946.m55979("ۗ᩹") ^ i6;
                        i2 = ((iM55979 ^ i5) * (-9043)) ^ 231864777;
                        i3 = -699294004;
                    }
                    i8 = iM55979 ^ i3;
                    viewGroup2 = viewGroup;
                    i7 = i2;
                    break;
                case -971956338:
                case 95498936:
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("᩵ۚ") ^ i5;
                        i2 = ((iM55979 ^ i6) * 28383) ^ 384306767;
                        i3 = 684992852;
                    } else {
                        iM55979 = C0946.m55979("ۢ֨") ^ i5;
                        i2 = ((iM55979 ^ i6) * (-25737)) ^ 280728549;
                        i3 = 1297250729;
                    }
                    i8 = iM55979 ^ i3;
                    viewGroup2 = viewGroup;
                    i7 = i2;
                    break;
                case -930826692:
                case 195205677:
                    return new ViewOnClickListenerC12946(c18309, layoutInflaterFrom.inflate(iM55681, viewGroup2, z));
                case -927221402:
                case 99728236:
                    int i16 = i13 + i15;
                    if ((i16 + i16) - i12 >= 0) {
                        iM55979 = C0946.m55979("֫ܳ") ^ i6;
                        i2 = ((iM55979 ^ i5) * (-11547)) ^ (-1545015862);
                        i3 = 1618769266;
                    } else {
                        iM55979 = (C0873.m55680("ۨܿ") ^ i5) * (-83);
                        i2 = ((iM55979 ^ i6) * 15135) ^ (-1181356967);
                        i3 = -1857955837;
                    }
                    i8 = iM55979 ^ i3;
                    viewGroup2 = viewGroup;
                    i7 = i2;
                    break;
                case -598682692:
                case 454311250:
                    C0890.m55740();
                    C0930.m55885();
                    return null;
                case -586357567:
                case 753414741:
                    layoutInflaterFrom = LayoutInflater.from(c18309.f54678);
                    sArr = f82057;
                    i10 = 14;
                    if (!C0882.f81846) {
                        iM559710 = (C0946.m55979("۬۠") + i5) * 91;
                        i2 = ((iM559710 ^ i6) * 9371) ^ 720047443;
                        i4 = -1869049766;
                        i8 = iM559710 ^ i4;
                        i7 = i2;
                    }
                    iM55979 = C0946.m55979("ۜۛ") ^ i5;
                    i2 = ((iM55979 ^ i6) * (-10441)) ^ (-892239224);
                    i3 = 1258096296;
                    i8 = iM55979 ^ i3;
                    viewGroup2 = viewGroup;
                    i7 = i2;
                    break;
                case -399373432:
                case 594782937:
                    int i17 = s + s2;
                    i12 = i17 * i17;
                    i13 = s * s;
                    i15 = 142611364;
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0873.m55680("֡ܶ") ^ i6;
                        i2 = ((iM55979 ^ i5) * 25425) ^ (-1201723510);
                        i3 = -1717025069;
                    } else {
                        iM55979 = (C0873.m55680("ᩳۧ") + i5) * 7;
                        i2 = ((iM55979 ^ i6) * 15547) ^ (-1922131206);
                        i3 = 1735872545;
                    }
                    i8 = iM55979 ^ i3;
                    viewGroup2 = viewGroup;
                    i7 = i2;
                    break;
                case -303092629:
                case 651015267:
                    strM56203 = C1024.m56203(sArr2, i11, 3, i9);
                    if (C0927.f81875) {
                        iM559710 = C0873.m55680("ۙ۟") ^ i6;
                        i2 = ((iM559710 ^ i5) * (-23887)) ^ (-461441600);
                        i4 = 209199557;
                    } else {
                        iM559710 = C0873.m55680("ۢܿ") ^ i5;
                        i2 = ((iM559710 ^ i6) * (-7525)) ^ 1489613295;
                        i4 = -1283780254;
                    }
                    i8 = iM559710 ^ i4;
                    i7 = i2;
                    break;
                case -111533964:
                case 1541202472:
                    break;
                case -31172714:
                case 2080913185:
                    strM56336 = C1071.m56336(sArr, i10, 3, i9);
                    if (C1053.m56327() >= 0) {
                        iM559710 = C0873.m55680("ۙ۟") ^ i6;
                        i2 = ((iM559710 ^ i5) * (-23887)) ^ (-461441600);
                        i4 = 209199557;
                    } else {
                        iM559710 = C0873.m55680("ۨᩴ") ^ i6;
                        i2 = ((iM559710 ^ i5) * (-6995)) ^ 1693626478;
                        i4 = 200055427;
                    }
                    i8 = iM559710 ^ i4;
                    i7 = i2;
                    break;
                case -20008808:
                case 1835896264:
                    iM55681 = 2101609589 ^ C0873.m55680(strM56336);
                    if (!C0917.f81868) {
                        iM559710 = C0946.m55979("۟ܳ") ^ i6;
                        i2 = ((iM559710 ^ i5) * 3877) ^ 814042199;
                        i4 = 1034334367;
                        i8 = iM559710 ^ i4;
                        i7 = i2;
                    }
                    iM55979 = C0946.m55979("᩵ۚ") ^ i5;
                    i2 = ((iM55979 ^ i6) * 28383) ^ 384306767;
                    i3 = 684992852;
                    i8 = iM55979 ^ i3;
                    viewGroup2 = viewGroup;
                    i7 = i2;
                    break;
                case 695236529:
                case 1103048083:
                    i9 = 30629;
                    int iM559713 = C0946.m55979("֡ᩴ") ^ i5;
                    i8 = iM559713 ^ (-618578705);
                    i7 = ((iM559713 ^ i6) * (-11521)) ^ (-1448005414);
                    viewGroup2 = viewGroup;
                    break;
                case 1288917508:
                case 1820994033:
                    C1929.m56553();
                    C0955.m56025();
                    iM55979 = C0946.m55979("᩵ۚ") ^ i5;
                    i2 = ((iM55979 ^ i6) * 28383) ^ 384306767;
                    i3 = 684992852;
                    i8 = iM55979 ^ i3;
                    viewGroup2 = viewGroup;
                    i7 = i2;
                    break;
                case 1622741056:
                case 1726466201:
                    RunnableC0897.m55784();
                    break;
                default:
                    c18309 = this.f25765;
                    if (i == 0) {
                        int iM559714 = (C0946.m55979("᩸۠") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((iM559714 ^ i6) * 21903) ^ 1334489847;
                        i8 = iM559714 ^ 1306336477;
                    } else {
                        int iM55682 = (C0873.m55680("֨᩸") ^ i6) * 31;
                        i8 = iM55682 ^ (-2084018228);
                        i7 = ((iM55682 ^ i5) * (-22021)) ^ 406845224;
                    }
                    z = false;
                    break;
            }
        }
    }

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        int itemCount = 0;
        int i2 = 0;
        int i3 = 295114983;
        int i4 = C0866.f81837;
        int i5 = ServiceConnectionC1013.f81940;
        int iM55979 = C0946.m55979("᩸ۘ") ^ i4;
        int i6 = ((iM55979 ^ i5) * (-161)) ^ (-1339324404);
        int i7 = -886054655;
        while (true) {
            i3 = ((((i3 ^ i5) * (-17829)) >> 31) & i6) ^ (iM55979 ^ i7);
            switch (i3) {
                case -2096390125:
                case -1051889235:
                    return i2;
                case -1925469637:
                case -409584177:
                    if (C0890.f81849 != 0) {
                        iM55979 = C0946.m55979("᩻᩹") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-26301)) ^ (-188448665);
                        i7 = 2041855855;
                    } else {
                        iM55979 = (C0873.m55680("ܿۙ") ^ i4) * 69;
                        i6 = ((iM55979 ^ i5) * 25695) ^ 611100214;
                        i7 = 1667218768;
                    }
                    break;
                case -1798682735:
                case 1397616095:
                    i2 = 1;
                    if (i == itemCount - 1) {
                        iM55979 = C0946.m55979("ܽۗ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-23177)) ^ (-517792943);
                        i7 = 510574740;
                    } else {
                        iM55979 = C0873.m55680("ܺ᩻") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-31219)) ^ 76492610;
                        i7 = -1791204476;
                    }
                    break;
                case -1500240334:
                case -483650926:
                    if (C1124.f82007 < 0) {
                        iM55979 = (C0873.m55680("ܿۙ") ^ i4) * 69;
                        i6 = ((iM55979 ^ i5) * 25695) ^ 611100214;
                        i7 = 1667218768;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ۨܺ")) * 33;
                        i6 = ((iM55979 ^ i4) * (-12325)) ^ 983055455;
                        i7 = -1257966172;
                    }
                    break;
                case -1404749411:
                case -610442100:
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0873.m55680("۟ۤ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-6241)) ^ 463317214;
                        i7 = 190911322;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ۨܺ")) * 33;
                        i6 = ((iM55979 ^ i4) * (-12325)) ^ 983055455;
                        i7 = -1257966172;
                    }
                    break;
                case -1051895709:
                case 336563298:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("۟ۤ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-6241)) ^ 463317214;
                        i7 = 190911322;
                    } else {
                        iM55979 = C0946.m55979("᩷۫") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-10115)) ^ (-1283100166);
                        i7 = -1472597716;
                    }
                    break;
                case -643826195:
                case 1041404276:
                    itemCount = getItemCount();
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0873.m55680("֫۠") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-12945)) ^ 1329656235;
                        i7 = 79594522;
                    } else {
                        iM55979 = C0946.m55979("᩶ۙ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 20625) ^ 2066870046;
                        i7 = -1938980609;
                    }
                    break;
                case -257184910:
                case 1918222138:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0873.m55680("ܿۙ") ^ i4) * 69;
                        i6 = ((iM55979 ^ i5) * 25695) ^ 611100214;
                        i7 = 1667218768;
                    } else {
                        iM55979 = (C0946.m55979("ۨۧ") ^ i5) * (-49);
                        i6 = ((iM55979 ^ i4) * (-32257)) ^ 506250008;
                        i7 = -910983356;
                    }
                    break;
                case -196907198:
                case 1731902723:
                    if (C1036.m56257() <= 0) {
                        iM55979 = (i5 - C0946.m55979("ۨܺ")) * 33;
                        i6 = ((iM55979 ^ i4) * (-12325)) ^ 983055455;
                        i7 = -1257966172;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۨܶ")) * 77;
                        i6 = ((iM55979 ^ i5) * (-8737)) ^ (-860432745);
                        i7 = -302652157;
                    }
                    break;
                case -48718550:
                case 1054797434:
                    ServiceConnectionC1013.m56157();
                    C1194.m56396();
                    return 0;
                case 18691273:
                case 1533610360:
                    if (C0894.m55769() >= 0) {
                        iM55979 = C0873.m55680("۟ۤ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-6241)) ^ 463317214;
                        i7 = 190911322;
                    } else {
                        iM55979 = C0946.m55979("ᩴܺ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 29947) ^ 1658278766;
                        i7 = -756654270;
                    }
                    break;
                case 158945699:
                case 1828877541:
                    if (C1124.m56367() >= 0) {
                        iM55979 = C0873.m55680("֫۠") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-12945)) ^ 1329656235;
                        i7 = 79594522;
                    } else {
                        iM55979 = C0873.m55680("۟ۖ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 6001) ^ (-1377058347);
                        i7 = -566314723;
                    }
                    break;
                case 208798984:
                case 1203857613:
                    C1964.m56597();
                    C1046.m56302();
                    iM55979 = (i5 - C0946.m55979("ۨܺ")) * 33;
                    i6 = ((iM55979 ^ i4) * (-12325)) ^ 983055455;
                    i7 = -1257966172;
                    break;
                case 239054055:
                case 511882275:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("᩻᩹") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-26301)) ^ (-188448665);
                        i7 = 2041855855;
                    } else {
                        iM55979 = (C0946.m55979("۟ܿ") + i5) * (-119);
                        i6 = ((iM55979 ^ i4) * 21651) ^ (-90469255);
                        i7 = -35236725;
                    }
                    break;
                case 330268285:
                case 2043374709:
                    return 0;
                case 632345531:
                case 778077067:
                    if (C0898.m55800() <= 0) {
                        iM55979 = C0873.m55680("֫۠") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-12945)) ^ 1329656235;
                        i7 = 79594522;
                    } else {
                        iM55979 = (C0946.m55979("ۨۚ") ^ i4) * 41;
                        i6 = ((iM55979 ^ i5) * 14619) ^ (-325713232);
                        i7 = 828605058;
                    }
                    break;
                case 1154301704:
                case 1463254521:
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0946.m55979("֫ܽ") + i4) * (-67);
                        i6 = ((iM55979 ^ i5) * 21667) ^ (-1583357289);
                        i7 = -1750124794;
                    } else {
                        iM55979 = (C0873.m55680("ܿۙ") ^ i4) * 69;
                        i6 = ((iM55979 ^ i5) * 25695) ^ 611100214;
                        i7 = 1667218768;
                    }
                    break;
                default:
                    if (C0947.f81895) {
                        iM55979 = (C0873.m55680("ܿۙ") ^ i4) * 69;
                        i6 = ((iM55979 ^ i5) * 25695) ^ 611100214;
                        i7 = 1667218768;
                    } else {
                        iM55979 = (C0946.m55979("᩹ܰ") ^ i5) * (-89);
                        i6 = ((iM55979 ^ i4) * (-17115)) ^ (-596053061);
                        i7 = 1789348019;
                    }
                    break;
            }
        }
    }
}
