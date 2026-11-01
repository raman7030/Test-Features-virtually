package p067l;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.widget.TextView;
import com.alipay.sdk.p010m.p058y.C0254q;
import java.io.PrintStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩴ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes4.dex */
public final class C20199 implements TextWatcher {

    /* JADX INFO: renamed from: ۜ᩸᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f82317 = {7874, 433, 433, 458, 461, 482, 427, 460, 442, 476, 469, 420, 433, 326, 476, 469, 420, 433, 9099, 450, 473, 464, 416, 433, 326, 450, 473, 464, 416, 433, 9099, 482, 496, 511, 482, 444, 482, 500, 483, 504, 503, 450, 473, 464, 419, 420, 423, 433, 326, 450, 473, 464, 419, 420, 423, 433, 9099, 430, 473, 464, 450, 473, 433, 9099, 466, 451, 466, 418, 419, 433, 9099};

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ String f62491;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String f62492;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ TextView f62493;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f62494;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C3434 f62495;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String f62496;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = -1249168105;
        int i5 = C1012.f81938;
        int i6 = C1017.f81942;
        int iM55680 = C0873.m55680("ۧ᩷") ^ i6;
        int i7 = ((iM55680 ^ i5) * (-6071)) ^ 2135073601;
        int i8 = 723186017;
        while (true) {
            i4 = ((((i4 ^ i5) * 2937) >> 31) & i7) ^ (iM55680 ^ i8);
            switch (i4) {
                case -2069926409:
                case 1283057157:
                    if (!C0955.f81898) {
                        iM55680 = C0873.m55680("۠ܿ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 23931) ^ 60016845;
                        i8 = 524631843;
                    } else {
                        iM55680 = C0946.m55979("֨۟") ^ i6;
                        i7 = ((iM55680 ^ i5) * 21237) ^ (-472144303);
                        i8 = 2080340306;
                    }
                    break;
                case -1848447898:
                case -1298755431:
                    if (C0927.f81875) {
                        iM55680 = C0873.m55680("۠ܿ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 23931) ^ 60016845;
                        i8 = 524631843;
                    } else {
                        iM55680 = (C0873.m55680("ܿ᩻") + i6) * 99;
                        i7 = ((iM55680 ^ i5) * 24599) ^ (-2010410811);
                        i8 = 1979651756;
                    }
                    break;
                case -1813736936:
                case -376417312:
                    C1003.m56123();
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("֨۟") ^ i6;
                        i7 = ((iM55680 ^ i5) * 21237) ^ (-472144303);
                        i8 = 2080340306;
                    } else {
                        iM55680 = (i6 - C0946.m55979("᩻ۡ")) * (-29);
                        i7 = ((iM55680 ^ i5) * (-2391)) ^ 1177383478;
                        i8 = -1158148869;
                    }
                    break;
                case -1660002324:
                case -543699544:
                    if (C0892.m55749()) {
                        iM55680 = (C0946.m55979("ۡ֨") + i6) * 7;
                        i7 = ((iM55680 ^ i5) * (-24463)) ^ (-1233083491);
                        i8 = -1704273001;
                    } else {
                        iM55680 = C0873.m55680("۠ܿ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 23931) ^ 60016845;
                        i8 = 524631843;
                    }
                    break;
                case -1631194441:
                case 807552496:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("ܿܺ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 23753) ^ 227998905;
                        i8 = 1552215827;
                    } else {
                        iM55680 = (C0873.m55680("ۚ᩹") + i5) * (-31);
                        i7 = ((iM55680 ^ i6) * 6973) ^ 34649350;
                        i8 = -1594189378;
                    }
                    break;
                case -1438203089:
                case 1158186279:
                    C0861.m55626();
                    break;
                case -1437484972:
                case -1019904042:
                    C0873.m55678();
                    iM55680 = C0946.m55979("֨۟") ^ i6;
                    i7 = ((iM55680 ^ i5) * 21237) ^ (-472144303);
                    i8 = 2080340306;
                    break;
                case -1424187281:
                case 1573192353:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("֨۟") ^ i6;
                        i7 = ((iM55680 ^ i5) * 21237) ^ (-472144303);
                        i8 = 2080340306;
                    } else {
                        iM55680 = (C0873.m55680("ۨ֨") + i5) * (-97);
                        i7 = ((iM55680 ^ i6) * (-4589)) ^ 685172614;
                        i8 = -1156676782;
                    }
                    break;
                case -638013110:
                case 1297189594:
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0873.m55680("ܳۖ") ^ i6) * 55;
                        i7 = ((iM55680 ^ i5) * 9199) ^ (-624492600);
                        i8 = 1964587745;
                    } else {
                        iM55680 = C0946.m55979("۠۠") ^ i6;
                        i7 = ((iM55680 ^ i5) * 11701) ^ (-1302631859);
                        i8 = -1140155969;
                    }
                    break;
                case -398763464:
                case -89977509:
                    if (C0946.f81894 != 0) {
                        iM55680 = C0873.m55680("ܿܺ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 23753) ^ 227998905;
                        i8 = 1552215827;
                    } else {
                        iM55680 = (C0946.m55979("᩺᩶") + i5) * (-23);
                        i7 = ((iM55680 ^ i6) * 635) ^ 625869374;
                        i8 = 668069608;
                    }
                    break;
                case 85637970:
                case 645892544:
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0873.m55680("ܳۖ") ^ i6) * 55;
                        i7 = ((iM55680 ^ i5) * 9199) ^ (-624492600);
                        i8 = 1964587745;
                    } else {
                        iM55680 = C0946.m55979("ۧ᩸") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-17985)) ^ 1223003269;
                        i8 = -2071902505;
                    }
                    break;
                case 408716396:
                case 2016389416:
                    break;
                case 452695439:
                case 2078830414:
                    RunnableC0938.m55938();
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("ܿܺ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 23753) ^ 227998905;
                        i8 = 1552215827;
                    } else {
                        iM55680 = C0946.m55979("֨۟") ^ i6;
                        i7 = ((iM55680 ^ i5) * 21237) ^ (-472144303);
                        i8 = 2080340306;
                    }
                    break;
                case 1735242509:
                case 1863305950:
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0873.m55680("ܳۖ") ^ i6) * 55;
                        i7 = ((iM55680 ^ i5) * 9199) ^ (-624492600);
                        i8 = 1964587745;
                    } else {
                        iM55680 = (i5 - C0873.m55680("ۘᩴ")) * (-67);
                        i7 = ((iM55680 ^ i6) * (-9475)) ^ 1810378234;
                        i8 = -2085219536;
                    }
                    break;
                case 1840466421:
                case 1876682226:
                    if (C0947.f81895) {
                        iM55680 = C0873.m55680("ܿܺ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 23753) ^ 227998905;
                        i8 = 1552215827;
                    } else {
                        iM55680 = C0946.m55979("۟᩶") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-25143)) ^ 1892867642;
                        i8 = 1333531018;
                    }
                    break;
                default:
                    if (C1194.f82045 != 0) {
                        iM55680 = (C0873.m55680("ܳۖ") ^ i6) * 55;
                        i7 = ((iM55680 ^ i5) * 9199) ^ (-624492600);
                        i8 = 1964587745;
                    } else {
                        iM55680 = (i5 - C0873.m55680("ܳ᩻")) * 35;
                        i7 = ((iM55680 ^ i6) * 10293) ^ (-897232100);
                        i8 = -1671211487;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = -1811469437;
        int i5 = C1003.f81929;
        int i6 = C0894.f81854;
        int iM55680 = C0873.m55680("۟ܿ") ^ i5;
        int i7 = ((iM55680 ^ i6) * 20761) ^ 1273532819;
        int i8 = -826524646;
        while (true) {
            i4 = ((((i4 ^ i6) * 30175) >> 31) & i7) ^ (iM55680 ^ i8);
            switch (i4) {
                case -2124890240:
                case 807186721:
                    break;
                case -2016473661:
                case 1599972472:
                    if (RunnableC0938.m55938() == 0) {
                        iM55680 = (C0873.m55680("۬ۙ") + i6) * 45;
                        i7 = ((iM55680 ^ i5) * (-26361)) ^ (-1072338569);
                        i8 = -920120241;
                    } else {
                        iM55680 = (C0946.m55979("ܿۡ") + i5) * 35;
                        i7 = ((iM55680 ^ i6) * 25735) ^ (-976538115);
                        i8 = -2016491848;
                    }
                    break;
                case -1404297918:
                case 2093037423:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("᩻ۛ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 19339) ^ (-138386122);
                        i8 = -169158795;
                    } else {
                        iM55680 = C0873.m55680("ۛܿ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 22287) ^ (-448659525);
                        i8 = 244047587;
                    }
                    break;
                case -1104046822:
                case 829979206:
                    C0890.m55740();
                    break;
                case -843575464:
                case 52655753:
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = (C0946.m55979("ܿۡ") + i5) * 35;
                        i7 = ((iM55680 ^ i6) * 25735) ^ (-976538115);
                        i8 = -2016491848;
                    } else {
                        iM55680 = C0873.m55680("۫᩹") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-4437)) ^ 392776328;
                        i8 = -239484184;
                    }
                    break;
                case -741396114:
                case 231867365:
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0873.m55680("ۛۛ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 10879) ^ (-916505180);
                        i8 = 2099521392;
                    } else {
                        iM55680 = C0873.m55680("᩸᩸") ^ i5;
                        i7 = ((iM55680 ^ i6) * (-16719)) ^ 1190547441;
                        i8 = -941819004;
                    }
                    break;
                case -728067156:
                case -442045204:
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0873.m55680("۬ۙ") + i6) * 45;
                        i7 = ((iM55680 ^ i5) * (-26361)) ^ (-1072338569);
                        i8 = -920120241;
                    } else {
                        iM55680 = C0946.m55979("᩶᩹") ^ i6;
                        i7 = ((iM55680 ^ i5) * 1315) ^ 1869875882;
                        i8 = -916053266;
                    }
                    break;
                case -591258008:
                case 1142778180:
                    if (C0937.f81884) {
                        iM55680 = (C0946.m55979("֫ۤ") + i5) * (-13);
                        i7 = ((iM55680 ^ i6) * (-32303)) ^ (-1732658061);
                        i8 = 1749296172;
                    } else {
                        iM55680 = (C0873.m55680("۬ۙ") + i6) * 45;
                        i7 = ((iM55680 ^ i5) * (-26361)) ^ (-1072338569);
                        i8 = -920120241;
                    }
                    break;
                case -322586574:
                case 908466680:
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("᩻ۛ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 19339) ^ (-138386122);
                        i8 = -169158795;
                    } else {
                        iM55680 = C0946.m55979("᩵᩺") ^ i5;
                        i7 = ((iM55680 ^ i6) * (-25917)) ^ (-1269111747);
                        i8 = -272492139;
                    }
                    break;
                case -236926129:
                case 979436878:
                    if (C0898.m55800() <= 0) {
                        iM55680 = C0873.m55680("᩻ۛ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 19339) ^ (-138386122);
                        i8 = -169158795;
                    } else {
                        iM55680 = (C0946.m55979("۠ܺ") + i6) * (-43);
                        i7 = ((iM55680 ^ i5) * (-4689)) ^ 676563186;
                        i8 = 828381146;
                    }
                    break;
                case 206600831:
                case 754081103:
                    if (C0937.f81884) {
                        iM55680 = (C0946.m55979("᩺ܰ") ^ i6) * (-17);
                        i7 = ((iM55680 ^ i5) * 3889) ^ 863340944;
                        i8 = -938326631;
                    } else {
                        iM55680 = (i5 - C0873.m55680("ᩴ֡")) * 65;
                        i7 = ((iM55680 ^ i6) * (-13879)) ^ (-725349334);
                        i8 = -876133801;
                    }
                    break;
                case 387435473:
                case 1379606300:
                    C0892.m55749();
                    iM55680 = (C0946.m55979("ܿۡ") + i5) * 35;
                    i7 = ((iM55680 ^ i6) * 25735) ^ (-976538115);
                    i8 = -2016491848;
                    break;
                case 643940785:
                case 1388483304:
                    if (C1017.m56187() <= 0) {
                        iM55680 = (i5 - C0873.m55680("ᩴ֡")) * 65;
                        i7 = ((iM55680 ^ i6) * (-13879)) ^ (-725349334);
                        i8 = -876133801;
                    } else {
                        iM55680 = (i5 - C0946.m55979("ۧ᩷")) * (-93);
                        i7 = ((iM55680 ^ i6) * (-3255)) ^ 1105412296;
                        i8 = -1952255577;
                    }
                    break;
                case 827327510:
                case 1468602591:
                    if (C1017.f81942 >= 0) {
                        iM55680 = (i5 - C0873.m55680("ᩴ֡")) * 65;
                        i7 = ((iM55680 ^ i6) * (-13879)) ^ (-725349334);
                        i8 = -876133801;
                    } else {
                        iM55680 = (C0946.m55979("ܽۘ") ^ i6) * (-95);
                        i7 = ((iM55680 ^ i5) * (-17527)) ^ 191879275;
                        i8 = 24951826;
                    }
                    break;
                case 1307622180:
                case 1949994796:
                    ServiceConnectionC1013.m56157();
                    if (C0845.m55584() <= 0) {
                        iM55680 = C0873.m55680("᩻ۛ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 19339) ^ (-138386122);
                        i8 = -169158795;
                    } else {
                        iM55680 = C0873.m55680("ۛۛ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 10879) ^ (-916505180);
                        i8 = 2099521392;
                    }
                    break;
                default:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = C0873.m55680("ۛۛ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 10879) ^ (-916505180);
                        i8 = 2099521392;
                    } else {
                        iM55680 = (C0946.m55979("ܿۡ") + i5) * 35;
                        i7 = ((iM55680 ^ i6) * 25735) ^ (-976538115);
                        i8 = -2016491848;
                    }
                    break;
            }
            return;
        }
    }

    public C20199(TextView textView, String str, String str2, String str3, String str4, C3434 c3434) {
        int i = -166412077;
        int i2 = C1046.f81962;
        int i3 = C0863.f81833;
        int iM55979 = (C0946.m55979("ۛۛ") ^ i2) * (-37);
        int i4 = ((iM55979 ^ i3) * 24873) ^ 1603620929;
        int i5 = 363551332;
        while (true) {
            i = ((((i ^ i3) * (-27915)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1977229113:
                case 637417651:
                    if (C0946.f81894 != 0) {
                        iM55979 = C0873.m55680("֫ܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11105)) ^ 932192371;
                        i5 = 1911940788;
                    } else {
                        iM55979 = (C0873.m55680("᩺᩶") ^ i2) * 51;
                        i4 = ((iM55979 ^ i3) * 19197) ^ 998600342;
                        i5 = -1240442965;
                    }
                    break;
                case -1801760543:
                case 1546974101:
                    C0947.m55997();
                    C1046.m56302();
                    throw new RuntimeException();
                case -1474025122:
                case 864252018:
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0873.m55680("ܳܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25079) ^ 1939115799;
                        i5 = 1297322586;
                    } else {
                        iM55979 = C0873.m55680("֫ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8153) ^ (-1375401935);
                        i5 = -1938774773;
                    }
                    break;
                case -1393586014:
                case -699424317:
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0946.m55979("۫ܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29863)) ^ (-1514403821);
                        i5 = 1376526617;
                    } else {
                        iM55979 = (C0873.m55680("ۢᩴ") ^ i2) * 79;
                        i4 = ((iM55979 ^ i3) * (-26533)) ^ 1046981993;
                        i5 = -537000730;
                    }
                    break;
                case -1030100463:
                case 1704848788:
                    this.f62492 = str3;
                    this.f62491 = str4;
                    this.f62495 = c3434;
                    return;
                case -1026710082:
                case 1763578704:
                    if (C1017.m56187() <= 0) {
                        iM55979 = C0946.m55979("۫ܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29863)) ^ (-1514403821);
                        i5 = 1376526617;
                    } else {
                        iM55979 = (C0946.m55979("᩹ۗ") ^ i2) * (-57);
                        i4 = ((iM55979 ^ i3) * (-4799)) ^ 1889234434;
                        i5 = -1620932899;
                    }
                    break;
                case -720046473:
                case -414491221:
                    this.f62496 = str2;
                    if (C1012.m56134() <= 0) {
                        iM55979 = C0873.m55680("֫ܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11105)) ^ 932192371;
                        i5 = 1911940788;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܶ᩻")) * 13;
                        i4 = ((iM55979 ^ i2) * 13375) ^ (-2008469552);
                        i5 = 645421400;
                    }
                    break;
                case -606794244:
                case 2028570310:
                    if (C0906.m55809() <= 0) {
                        iM55979 = C0873.m55680("ܳܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25079) ^ 1939115799;
                        i5 = 1297322586;
                    } else {
                        iM55979 = C0873.m55680("᩸ۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 30619) ^ 1368482470;
                        i5 = 1537175432;
                    }
                    break;
                case 262384980:
                case 1630078225:
                    if (C0927.f81875) {
                        iM55979 = C0873.m55680("֫ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8153) ^ (-1375401935);
                        i5 = -1938774773;
                    } else {
                        iM55979 = C0873.m55680("᩶ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-24177)) ^ (-1109728946);
                        i5 = 1024868402;
                    }
                    break;
                case 399850493:
                case 733158314:
                    if (C0949.m56012()) {
                        iM55979 = C0873.m55680("֫ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8153) ^ (-1375401935);
                        i5 = -1938774773;
                    } else {
                        iM55979 = (C0946.m55979("ܰۡ") ^ i3) * (-107);
                        i4 = ((iM55979 ^ i2) * (-6555)) ^ (-935498602);
                        i5 = -190295711;
                    }
                    break;
                case 458817156:
                case 1631724633:
                    this.f62493 = textView;
                    this.f62494 = str;
                    if (C1404.m56468()) {
                        iM55979 = (C0946.m55979("ᩳ᩸") ^ i3) * 127;
                        i4 = ((iM55979 ^ i2) * (-19221)) ^ (-880262493);
                        i5 = 1934464883;
                    } else {
                        iM55979 = C0873.m55680("֫ܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11105)) ^ 932192371;
                        i5 = 1911940788;
                    }
                    break;
                case 463138449:
                case 892957792:
                    C0890.m55740();
                    C1124.m56367();
                    iM55979 = C0873.m55680("֫ܶ") ^ i3;
                    i4 = ((iM55979 ^ i2) * 8153) ^ (-1375401935);
                    i5 = -1938774773;
                    break;
                case 471290049:
                case 1131878371:
                    if (C1053.m56327() >= 0) {
                        iM55979 = C0873.m55680("֫ܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11105)) ^ 932192371;
                        i5 = 1911940788;
                    } else {
                        iM55979 = C0873.m55680("ܶܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17555) ^ (-992029618);
                        i5 = -1316871732;
                    }
                    break;
                case 676541423:
                case 768077157:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0873.m55680("֫ܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11105)) ^ 932192371;
                        i5 = 1911940788;
                    } else {
                        iM55979 = C0873.m55680("ܽۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12089) ^ (-708946718);
                        i5 = -98112200;
                    }
                    break;
                case 1256701879:
                case 1923153285:
                    C0992.m56107();
                    if (!C0890.m55740()) {
                        iM55979 = (C0946.m55979("᩹ۗ") ^ i2) * (-57);
                        i4 = ((iM55979 ^ i3) * (-4799)) ^ 1889234434;
                        i5 = -1620932899;
                    } else {
                        iM55979 = C0873.m55680("ܳܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25079) ^ 1939115799;
                        i5 = 1297322586;
                    }
                    break;
                default:
                    if (C0937.m55918() >= 0) {
                        iM55979 = C0873.m55680("ܳܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25079) ^ 1939115799;
                        i5 = 1297322586;
                    } else {
                        iM55979 = C0873.m55680("ܶܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10555)) ^ 583547216;
                        i5 = -1927515745;
                    }
                    break;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        PrintStream printStream;
        String str2;
        TextView textView;
        short s;
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        short[] sArr;
        int i8;
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilderM56254;
        int iM559710;
        int i9;
        int i10;
        String str3;
        PrintStream printStream2;
        String str4;
        int i11;
        int iM559711;
        int i12;
        int i13;
        int iM55681;
        int i14;
        int i15;
        int i16;
        String str5;
        int iM559712;
        int i17;
        int i18;
        int iM559713;
        int i19;
        int i20;
        int iM55682;
        int i21;
        int i22;
        int iM55683;
        int i23;
        int i24;
        String strM55757;
        int iM559714;
        int i25;
        int iM55684;
        int i26;
        Integer numM55836;
        int i27;
        int iM559715;
        int i28;
        C20199 c20199 = this;
        int i29 = 0;
        int i30 = -862434130;
        int i31 = C0877.f81843;
        int i32 = C0949.f81897;
        int iM559716 = (i32 - C0946.m55979("֫ᩳ")) * C0254q.f1218h;
        int i33 = ((iM559716 ^ i31) * (-20269)) ^ (-726493332);
        int i34 = iM559716 ^ 538708624;
        String strM55639 = null;
        String str6 = null;
        PrintStream printStream3 = null;
        String str7 = null;
        ForegroundColorSpan foregroundColorSpan = null;
        String strM55970 = null;
        C3434 c3434 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int iM55933 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        char c = 0;
        int i38 = 0;
        short s2 = 0;
        int i39 = 0;
        String str8 = null;
        SpannableStringBuilder spannableStringBuilder2 = null;
        SpannableStringBuilder spannableStringBuilder3 = null;
        String strM55929 = null;
        String str9 = null;
        TypefaceSpan typefaceSpan = null;
        String str10 = null;
        Integer num = null;
        TextView textView2 = null;
        int iM56300 = 0;
        int i40 = 0;
        int iM55878 = 0;
        String str11 = null;
        int i41 = 0;
        while (true) {
            i30 = i34 ^ (i33 & (((i30 ^ i31) * (-25363)) >> 31));
            switch (i30) {
                case -2040726936:
                case -101865927:
                    iM55933 = iM55933;
                    if (C11774.m27005(str10)) {
                        iM55684 = (i32 - C0873.m55680("ۨ۠")) * (-25);
                        i21 = ((iM55684 ^ i31) * (-18315)) ^ 476614760;
                        i26 = -471037872;
                    } else {
                        iM55684 = C0873.m55680("ۙ۬") ^ i32;
                        i21 = ((iM55684 ^ i31) * 1363) ^ 1478379462;
                        i26 = 13246200;
                    }
                    i27 = iM55684 ^ i26;
                    iM55933 = iM55933;
                    i34 = i27;
                    i33 = i21;
                    break;
                case -2021119735:
                case 1637517526:
                    str3 = str10;
                    i20 = i38;
                    ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i20);
                    iM55933 = RunnableC0938.m55933(spannableStringBuilder3);
                    if (C1028.f81950 > 0) {
                        int iM55685 = (C0873.m55680("ܽ᩻") ^ i32) * (-99);
                        int i42 = ((iM55685 ^ i31) * (-29683)) ^ 143255215;
                        i11 = iM55685 ^ 455299064;
                        foregroundColorSpan = foregroundColorSpan2;
                        i38 = i20;
                        i33 = i42;
                        str10 = str3;
                        i35 = 33;
                        i34 = i11;
                    } else {
                        foregroundColorSpan = foregroundColorSpan2;
                        i35 = 33;
                        iM55682 = C0873.m55680("ۤܺ") ^ i32;
                        i21 = ((iM55682 ^ i31) * 32379) ^ 495819460;
                        i22 = -1569081844;
                        i27 = iM55682 ^ i22;
                        i38 = i20;
                        str10 = str3;
                        i34 = i27;
                        i33 = i21;
                    }
                    break;
                case -1971733682:
                case 1531472249:
                    str10 = str10;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    strM55639 = strM55639;
                    str6 = str6;
                    printStream3 = printStream3;
                    str8 = str8;
                    i39 = i39;
                    textView2 = textView2;
                    s = s2;
                    if ((s * 26848) - (i29 + 180203776) > 0) {
                        iM55979 = C0873.m55680("ܺ᩹") ^ i32;
                        i = ((iM55979 ^ i31) * 29245) ^ 835207387;
                        i2 = -154770969;
                    } else {
                        iM55979 = C0946.m55979("ᩳ᩹") ^ i31;
                        i = ((iM55979 ^ i32) * (-30365)) ^ 1602187113;
                        i2 = -981762629;
                    }
                    i4 = iM55979 ^ i2;
                    s2 = s;
                    i33 = i;
                    textView2 = textView2;
                    i39 = i39;
                    str10 = str10;
                    i34 = i4;
                    str8 = str8;
                    printStream3 = printStream3;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    c20199 = this;
                    str6 = str6;
                    strM55639 = strM55639;
                    break;
                case -1962953775:
                case 1245695017:
                    C1036.m56254(spannableStringBuilder3, strM55970);
                    iM55684 = (C0873.m55680("۠ۙ") + i32) * 83;
                    i21 = ((iM55684 ^ i31) * (-8575)) ^ (-1485900179);
                    i26 = 1407844228;
                    i27 = iM55684 ^ i26;
                    iM55933 = iM55933;
                    i34 = i27;
                    i33 = i21;
                    break;
                case -1853197464:
                case 437023273:
                    C0927.m55873();
                    if (C0967.f81910 < 0) {
                        str = str10;
                        spannableStringBuilderM56254 = spannableStringBuilder3;
                        strM55639 = strM55639;
                        str6 = str6;
                        printStream = printStream3;
                        str2 = str8;
                        sArr = sArr3;
                        i8 = i39;
                        textView = textView2;
                        spannableStringBuilder = spannableStringBuilder2;
                        int iM55686 = C0873.m55680("ܿܽ") ^ i31;
                        SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder;
                        sArr3 = sArr;
                        i39 = i8;
                        str8 = str2;
                        i33 = ((iM55686 ^ i32) * (-26901)) ^ 1973353897;
                        spannableStringBuilder3 = spannableStringBuilderM56254;
                        textView2 = textView;
                        str10 = str;
                        i34 = iM55686 ^ (-1721694801);
                        printStream3 = printStream;
                        spannableStringBuilder2 = spannableStringBuilder4;
                        str6 = str6;
                        strM55639 = strM55639;
                    } else {
                        iM559715 = C0946.m55979("ۙ۫") ^ i31;
                        i21 = ((iM559715 ^ i32) * 10969) ^ (-635473916);
                        i28 = 1233511449;
                        i34 = iM559715 ^ i28;
                        i33 = i21;
                    }
                    break;
                case -1846463696:
                case 714387505:
                    iM55933 = iM55933;
                    int iM55631 = C0863.m55631(num);
                    c3434 = c20199.f62495;
                    if (iM55631 == c3434.f6850) {
                        iM55684 = (C0873.m55680("ܳۖ") + i31) * 91;
                        i21 = ((iM55684 ^ i32) * (-23619)) ^ 503962276;
                        i26 = 1823215185;
                    } else {
                        iM55684 = C0873.m55680("ܳ۫") ^ i31;
                        i21 = ((iM55684 ^ i32) * (-25847)) ^ (-573513041);
                        i26 = 1479717852;
                    }
                    i27 = iM55684 ^ i26;
                    iM55933 = iM55933;
                    i34 = i27;
                    i33 = i21;
                    break;
                case -1827133685:
                case 1732921004:
                    C1036.m56254(spannableStringBuilder3, C0989.m56092(f82317, 19, 6, i40));
                    i24 = C23223.f73004;
                    i38 = i24;
                    iM559714 = (i31 - C0873.m55680("ᩳܿ")) * (-73);
                    i14 = ((iM559714 ^ i32) * 21885) ^ (-1095704446);
                    i25 = -338344882;
                    i16 = iM559714 ^ i25;
                    str5 = str10;
                    i34 = i16;
                    i33 = i14;
                    str10 = str5;
                    break;
                case -1803416588:
                case 616512905:
                    i38 = -16776961;
                    str10 = str10;
                    iM559714 = (i31 - C0873.m55680("ᩳܿ")) * (-73);
                    i14 = ((iM559714 ^ i32) * 21885) ^ (-1095704446);
                    i25 = -338344882;
                    i16 = iM559714 ^ i25;
                    str5 = str10;
                    i34 = i16;
                    i33 = i14;
                    str10 = str5;
                    break;
                case -1801932997:
                case -86244047:
                    C0854.m55604(spannableStringBuilder3, C1024.m56203(f82317, 58, 6, i40));
                    iM55933 = iM55933;
                    i38 = i37;
                    iM559714 = (i31 - C0873.m55680("ᩳܿ")) * (-73);
                    i14 = ((iM559714 ^ i32) * 21885) ^ (-1095704446);
                    i25 = -338344882;
                    i16 = iM559714 ^ i25;
                    str5 = str10;
                    i34 = i16;
                    i33 = i14;
                    str10 = str5;
                    break;
                case -1660224698:
                case -1094588430:
                    textView2 = textView2;
                    str10 = str10;
                    String str12 = str8;
                    strM55639 = strM55639;
                    String str13 = str6;
                    strM55929 = RunnableC0938.m55929(C1053.m56320(strM55639, str13, ""));
                    PrintStream printStream4 = System.out;
                    if (C0906.f81862 >= 0) {
                        printStream3 = printStream4;
                        str6 = str13;
                        spannableStringBuilder2 = spannableStringBuilder2;
                        i39 = i39;
                        str8 = str12;
                        iM55680 = (C0873.m55680("ۧ᩷") ^ i31) * (-119);
                        i33 = ((iM55680 ^ i32) * (-255)) ^ (-1502592641);
                        i3 = -829490346;
                        i4 = iM55680 ^ i3;
                        textView2 = textView2;
                        i39 = i39;
                        str10 = str10;
                        i34 = i4;
                        str8 = str8;
                        printStream3 = printStream3;
                        spannableStringBuilder2 = spannableStringBuilder2;
                        c20199 = this;
                        str6 = str6;
                    } else {
                        int iM559717 = C0946.m55979("ܰ֨") ^ i32;
                        str8 = str12;
                        i33 = ((iM559717 ^ i31) * 16643) ^ (-441034748);
                        textView2 = textView2;
                        printStream3 = printStream4;
                        str6 = str13;
                        str10 = str10;
                        i34 = iM559717 ^ (-1863089324);
                    }
                    strM55639 = strM55639;
                    break;
                case -1615036826:
                case -1076502098:
                    C0967.m56074();
                    if (C0927.f81875) {
                        iM559715 = C0946.m55979("ܰۨ") ^ i31;
                        i21 = ((iM559715 ^ i32) * 23343) ^ (-548759185);
                        i28 = 1235662343;
                        i34 = iM559715 ^ i28;
                        i33 = i21;
                    }
                    str3 = str10;
                    i20 = i38;
                    iM55682 = C0873.m55680("ۤܺ") ^ i32;
                    i21 = ((iM55682 ^ i31) * 32379) ^ 495819460;
                    i22 = -1569081844;
                    i27 = iM55682 ^ i22;
                    i38 = i20;
                    str10 = str3;
                    i34 = i27;
                    i33 = i21;
                    break;
                case -1513846016:
                case -384795686:
                    C0854.m55604(spannableStringBuilder3, RunnableC0938.m55936(f82317, 9, 5, i40));
                    i24 = C23223.f73004;
                    i38 = i24;
                    iM559714 = (i31 - C0873.m55680("ᩳܿ")) * (-73);
                    i14 = ((iM559714 ^ i32) * 21885) ^ (-1095704446);
                    i25 = -338344882;
                    i16 = iM559714 ^ i25;
                    str5 = str10;
                    i34 = i16;
                    i33 = i14;
                    str10 = str5;
                    break;
                case -1476384942:
                case 520989154:
                    C0854.m55604(spannableStringBuilder3, strM55970);
                    iM55684 = (C0873.m55680("۠ۙ") + i32) * 83;
                    i21 = ((iM55684 ^ i31) * (-8575)) ^ (-1485900179);
                    i26 = 1407844228;
                    i27 = iM55684 ^ i26;
                    iM55933 = iM55933;
                    i34 = i27;
                    i33 = i21;
                    break;
                case -1435811773:
                case 1419705998:
                    C0873.m55690(spannableStringBuilder3, typefaceSpan, i41, RunnableC0938.m55933(spannableStringBuilder3), i35);
                    RunnableC0938.m55928(textView2, spannableStringBuilder3);
                    break;
                case -1238023733:
                case -1064333219:
                    String str14 = str10;
                    PrintStream printStream5 = printStream3;
                    String str15 = str8;
                    TextView textView3 = textView2;
                    strM55639 = C0863.m55639(editable);
                    String strM55717 = C0882.m55717(f82317, 3, 6, i40);
                    if (C0854.f81826 != 0) {
                        iM559710 = (C0873.m55680("ܶۖ") + i32) * (-107);
                        i9 = ((iM559710 ^ i31) * (-31711)) ^ (-1520237057);
                        i10 = -903984630;
                    } else {
                        iM559710 = (C0946.m55979("᩵ᩴ") ^ i31) * 101;
                        i9 = ((iM559710 ^ i32) * 29123) ^ 1332335600;
                        i10 = -1696812872;
                    }
                    int i43 = iM559710 ^ i10;
                    str8 = str15;
                    i33 = i9;
                    str6 = strM55717;
                    textView2 = textView3;
                    printStream3 = printStream5;
                    i34 = i43;
                    str10 = str14;
                    break;
                case -1176455848:
                case 1215220666:
                    C1036.m56254(spannableStringBuilder3, C0892.m55750(f82317, 14, 5, i40));
                    i38 = i37;
                    iM559714 = (i31 - C0873.m55680("ᩳܿ")) * (-73);
                    i14 = ((iM559714 ^ i32) * 21885) ^ (-1095704446);
                    i25 = -338344882;
                    i16 = iM559714 ^ i25;
                    str5 = str10;
                    i34 = i16;
                    i33 = i14;
                    str10 = str5;
                    break;
                case -1024130609:
                case -321211176:
                    str10 = str10;
                    int iM55719 = C0882.m55719(strM55929);
                    String str16 = c20199.f62491;
                    if (iM55719 == C0927.m55878(str16)) {
                        iM559713 = (i32 - C0873.m55680("᩵ܳ")) * (-69);
                        i14 = ((iM559713 ^ i31) * 8963) ^ 89906437;
                        i19 = 1862971425;
                    } else {
                        iM559713 = (C0946.m55979("ۢܰ") ^ i31) * (-117);
                        i14 = ((iM559713 ^ i32) * (-20815)) ^ (-306760169);
                        i19 = -1142092566;
                    }
                    i16 = iM559713 ^ i19;
                    str7 = str16;
                    str5 = str10;
                    i34 = i16;
                    i33 = i14;
                    str10 = str5;
                    break;
                case -1023014348:
                case -907152025:
                    C0854.m55604(spannableStringBuilder3, AbstractC0942.m55970(f82317, 49, 8, i40));
                    iM55933 = iM55933;
                    i38 = i37;
                    iM559714 = (i31 - C0873.m55680("ᩳܿ")) * (-73);
                    i14 = ((iM559714 ^ i32) * 21885) ^ (-1095704446);
                    i25 = -338344882;
                    i16 = iM559714 ^ i25;
                    str5 = str10;
                    i34 = i16;
                    i33 = i14;
                    str10 = str5;
                    break;
                case -987388657:
                case 374668291:
                    C1053.m56327();
                    if (C1964.m56597() == 0) {
                        str = str10;
                        strM55639 = strM55639;
                        str6 = str6;
                        printStream = printStream3;
                        str2 = str8;
                        textView = textView2;
                        int iM55687 = (C0873.m55680("ۨۡ") + i32) * (-47);
                        i5 = ((iM55687 ^ i31) * (-17129)) ^ 181100438;
                        i6 = iM55687 ^ (-1490660639);
                        str8 = str2;
                        i33 = i5;
                        str10 = str;
                        i34 = i6;
                        textView2 = textView;
                        printStream3 = printStream;
                        str6 = str6;
                        strM55639 = strM55639;
                    } else {
                        iM559715 = C0946.m55979("ۙ۫") ^ i31;
                        i21 = ((iM559715 ^ i32) * 10969) ^ (-635473916);
                        i28 = 1233511449;
                        i34 = iM559715 ^ i28;
                        i33 = i21;
                    }
                    break;
                case -943053514:
                case -423586925:
                    if (C1046.f81962 > 0) {
                        str10 = str10;
                        iM559714 = (i32 - C0873.m55680("ۖ᩷")) * 9;
                        i14 = ((iM559714 ^ i31) * (-15083)) ^ (-747040500);
                        i25 = -1193533722;
                        i16 = iM559714 ^ i25;
                        str5 = str10;
                        i34 = i16;
                        i33 = i14;
                        str10 = str5;
                    } else {
                        iM559715 = C0946.m55979("ۚۖ") ^ i32;
                        i21 = ((iM559715 ^ i31) * (-30995)) ^ 1035838;
                        i28 = 225969759;
                        i34 = iM559715 ^ i28;
                        i33 = i21;
                    }
                    break;
                case -941012574:
                case 286791360:
                    if (!C0892.f81851) {
                        str3 = str10;
                        i20 = i38;
                        iM55682 = C0873.m55680("ۤܺ") ^ i32;
                        i21 = ((iM55682 ^ i31) * 32379) ^ 495819460;
                        i22 = -1569081844;
                        i27 = iM55682 ^ i22;
                        i38 = i20;
                        str10 = str3;
                        i34 = i27;
                        i33 = i21;
                    } else {
                        str = str10;
                        spannableStringBuilderM56254 = spannableStringBuilder3;
                        strM55639 = strM55639;
                        str6 = str6;
                        printStream = printStream3;
                        str2 = str8;
                        sArr = sArr3;
                        i8 = i39;
                        textView = textView2;
                        spannableStringBuilder = spannableStringBuilder2;
                        int iM55688 = C0873.m55680("ܿܽ") ^ i31;
                        SpannableStringBuilder spannableStringBuilder5 = spannableStringBuilder;
                        sArr3 = sArr;
                        i39 = i8;
                        str8 = str2;
                        i33 = ((iM55688 ^ i32) * (-26901)) ^ 1973353897;
                        spannableStringBuilder3 = spannableStringBuilderM56254;
                        textView2 = textView;
                        str10 = str;
                        i34 = iM55688 ^ (-1721694801);
                        printStream3 = printStream;
                        spannableStringBuilder2 = spannableStringBuilder5;
                        str6 = str6;
                        strM55639 = strM55639;
                    }
                    break;
                case -917716718:
                case 559278095:
                    str10 = str10;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    strM55639 = strM55639;
                    str6 = str6;
                    printStream3 = printStream3;
                    i39 = i39;
                    int iM56149 = ServiceConnectionC1013.m56149(editable);
                    textView2 = c20199.f62493;
                    str8 = c20199.f62494;
                    if (iM56149 == 0) {
                        int iM559718 = (C0946.m55979("᩻᩷") + i32) * 15;
                        i34 = iM559718 ^ (-704559143);
                        i33 = ((iM559718 ^ i31) * 25449) ^ 1506837833;
                    } else {
                        int iM559719 = C0946.m55979("ۡۘ") ^ i31;
                        i33 = ((iM559719 ^ i32) * (-27669)) ^ (-48234300);
                        i34 = iM559719 ^ 1751365501;
                    }
                    c20199 = this;
                    break;
                case -871266700:
                case 1214963704:
                    str = str10;
                    String str17 = str11;
                    if (C0906.m55806(strM55929, str17)) {
                        iM559712 = C0946.m55979("ۧ֡") ^ i32;
                        i17 = ((iM559712 ^ i31) * 7299) ^ (-1476514943);
                        i18 = -1858561018;
                    } else {
                        iM559712 = (C0946.m55979("᩺ۨ") + i31) * 31;
                        i17 = ((iM559712 ^ i32) * 28131) ^ 838414947;
                        i18 = -756541361;
                    }
                    i7 = iM559712 ^ i18;
                    str11 = str17;
                    i33 = i17;
                    str5 = str;
                    i34 = i7;
                    str10 = str5;
                    break;
                case -735162043:
                case 1201104384:
                    C1048.m56305();
                    break;
                case -719092282:
                case 690482452:
                    C1036.m56254(spannableStringBuilder3, C1053.m56325(f82317, 25, 6, i40));
                    i38 = i37;
                    iM559714 = (i31 - C0873.m55680("ᩳܿ")) * (-73);
                    i14 = ((iM559714 ^ i32) * 21885) ^ (-1095704446);
                    i25 = -338344882;
                    i16 = iM559714 ^ i25;
                    str5 = str10;
                    i34 = i16;
                    i33 = i14;
                    str10 = str5;
                    break;
                case -696430631:
                case 218795853:
                    iM55933 = iM55933;
                    if (C0845.m55586(num) == c3434.f6849) {
                        iM55684 = (C0873.m55680("ۛۚ") ^ i31) * (-61);
                        i21 = ((iM55684 ^ i32) * (-9511)) ^ (-1797757948);
                        i26 = -939519015;
                    } else {
                        iM55684 = (C0946.m55979("֡۫") ^ i32) * 23;
                        i21 = ((iM55684 ^ i31) * 29577) ^ 1979257449;
                        i26 = -863966723;
                    }
                    i27 = iM55684 ^ i26;
                    iM55933 = iM55933;
                    i34 = i27;
                    i33 = i21;
                    break;
                case -681776441:
                case 1235610378:
                    str3 = str10;
                    printStream2 = printStream3;
                    str4 = str8;
                    printStream2.println(strM55929);
                    iM55878 = C0927.m55878(str4);
                    if (C1044.f81959 >= 0) {
                        int iM55689 = (i32 - C0873.m55680("ۚ᩵")) * (-11);
                        int i44 = ((iM55689 ^ i31) * 15469) ^ (-146338157);
                        i11 = iM55689 ^ 953700015;
                        str8 = str4;
                        printStream3 = printStream2;
                        i33 = i44;
                        typefaceSpan = null;
                    } else {
                        int iM559720 = (C0946.m55979("۬ۧ") ^ i31) * (-125);
                        TextView textView4 = textView2;
                        int i45 = ((iM559720 ^ i32) * (-22057)) ^ (-1609948325);
                        i11 = iM559720 ^ (-439275203);
                        str8 = str4;
                        i33 = i45;
                        textView2 = textView4;
                        printStream3 = printStream2;
                    }
                    str10 = str3;
                    i34 = i11;
                    break;
                case -644068883:
                case 976695219:
                    iM55933 = iM55933;
                    if (C11774.m27009(str10)) {
                        iM55684 = C0946.m55979("᩸ܿ") ^ i31;
                        i21 = ((iM55684 ^ i32) * 16439) ^ (-1880306529);
                        i26 = 2024857215;
                    } else {
                        iM55684 = (i32 - C0946.m55979("ۢۘ")) * 67;
                        i21 = ((iM55684 ^ i31) * (-24555)) ^ (-44700635);
                        i26 = -1263222892;
                    }
                    i27 = iM55684 ^ i26;
                    iM55933 = iM55933;
                    i34 = i27;
                    i33 = i21;
                    break;
                case -553721697:
                case 1221410043:
                    C1036.m56254(spannableStringBuilder3, C0873.m55689(f82317, 64, 7, i40));
                    iM55933 = iM55933;
                    i38 = i37;
                    iM559714 = (i31 - C0873.m55680("ᩳܿ")) * (-73);
                    i14 = ((iM559714 ^ i32) * 21885) ^ (-1095704446);
                    i25 = -338344882;
                    i16 = iM559714 ^ i25;
                    str5 = str10;
                    i34 = i16;
                    i33 = i14;
                    str10 = str5;
                    break;
                case -544752794:
                case 1373138113:
                    C0854.m55604(spannableStringBuilder3, C1025.m56233(f82317, 41, 8, i40));
                    i38 = C23223.f73004;
                    iM55933 = iM55933;
                    str10 = str10;
                    iM559714 = (i31 - C0873.m55680("ᩳܿ")) * (-73);
                    i14 = ((iM559714 ^ i32) * 21885) ^ (-1095704446);
                    i25 = -338344882;
                    i16 = iM559714 ^ i25;
                    str5 = str10;
                    i34 = i16;
                    i33 = i14;
                    str10 = str5;
                    break;
                case -496145420:
                case 131050056:
                    C0949.m56012();
                    if (!C0937.f81884) {
                        str10 = str10;
                        spannableStringBuilder2 = spannableStringBuilder2;
                        strM55639 = strM55639;
                        str6 = str6;
                        printStream3 = printStream3;
                        str8 = str8;
                        i39 = i39;
                        textView2 = textView2;
                        iM55680 = (C0873.m55680("ۧ᩷") ^ i31) * (-119);
                        i33 = ((iM55680 ^ i32) * (-255)) ^ (-1502592641);
                        i3 = -829490346;
                        i4 = iM55680 ^ i3;
                        textView2 = textView2;
                        i39 = i39;
                        str10 = str10;
                        i34 = i4;
                        str8 = str8;
                        printStream3 = printStream3;
                        spannableStringBuilder2 = spannableStringBuilder2;
                        c20199 = this;
                        str6 = str6;
                        strM55639 = strM55639;
                    } else {
                        iM559715 = C0946.m55979("ۚۖ") ^ i32;
                        i21 = ((iM559715 ^ i31) * (-30995)) ^ 1035838;
                        i28 = 225969759;
                        i34 = iM559715 ^ i28;
                        i33 = i21;
                    }
                    break;
                case -433294985:
                case 883829719:
                    str = str10;
                    strM55639 = strM55639;
                    str6 = str6;
                    printStream = printStream3;
                    str2 = str8;
                    textView = textView2;
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(str2);
                    sArr3 = f82317;
                    i39 = 1;
                    if (!C0890.m55740()) {
                        spannableStringBuilder2 = spannableStringBuilder6;
                        int iM556810 = (C0873.m55680("ۨۡ") + i32) * (-47);
                        i5 = ((iM556810 ^ i31) * (-17129)) ^ 181100438;
                        i6 = iM556810 ^ (-1490660639);
                        str8 = str2;
                        i33 = i5;
                        str10 = str;
                        i34 = i6;
                        textView2 = textView;
                        printStream3 = printStream;
                        str6 = str6;
                        strM55639 = strM55639;
                    } else {
                        int iM556811 = C0873.m55680("ᩳ۬") ^ i31;
                        i33 = ((iM556811 ^ i32) * (-32379)) ^ 1381592497;
                        i7 = iM556811 ^ (-1608837019);
                        str8 = str2;
                        spannableStringBuilder2 = spannableStringBuilder6;
                        textView2 = textView;
                        printStream3 = printStream;
                        str6 = str6;
                        strM55639 = strM55639;
                        str5 = str;
                        i34 = i7;
                        str10 = str5;
                    }
                    break;
                case -391335456:
                case 459015950:
                    ForegroundColorSpan foregroundColorSpan3 = foregroundColorSpan;
                    C0873.m55690(spannableStringBuilder3, foregroundColorSpan3, i41, iM55933, i35);
                    short[] sArr4 = f82317;
                    if (C0854.f81826 == 0) {
                        foregroundColorSpan = foregroundColorSpan3;
                        str10 = str10;
                        typefaceSpan = new TypefaceSpan(C0898.m55792(sArr4, 31, 10, i40));
                        if (RunnableC0897.f81856) {
                            iM559714 = (C0946.m55979("ܺᩴ") ^ i32) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i14 = ((iM559714 ^ i31) * 15785) ^ 1131506764;
                            i25 = -610083001;
                        } else {
                            iM559714 = (i32 - C0873.m55680("ۖ᩷")) * 9;
                            i14 = ((iM559714 ^ i31) * (-15083)) ^ (-747040500);
                            i25 = -1193533722;
                        }
                        i16 = iM559714 ^ i25;
                        str5 = str10;
                        i34 = i16;
                        i33 = i14;
                        str10 = str5;
                    } else {
                        foregroundColorSpan = foregroundColorSpan3;
                        str3 = str10;
                        printStream2 = printStream3;
                        str4 = str8;
                        int iM556812 = (i32 - C0873.m55680("ۚ᩵")) * (-11);
                        int i46 = ((iM556812 ^ i31) * 15469) ^ (-146338157);
                        i11 = iM556812 ^ 953700015;
                        str8 = str4;
                        printStream3 = printStream2;
                        i33 = i46;
                        typefaceSpan = null;
                        str10 = str3;
                        i34 = i11;
                    }
                    break;
                case -258696469:
                case 1315385915:
                    str3 = str10;
                    i20 = i38;
                    iM56300 = C1046.m56300(strM55929, 40);
                    if (iM56300 == -1) {
                        strM55757 = strM55929;
                        int iM559721 = (C0946.m55979("ܽۤ") ^ i31) * (-9);
                        String str18 = strM55757;
                        i33 = ((iM559721 ^ i32) * (-13837)) ^ (-1555257640);
                        i34 = iM559721 ^ (-889569422);
                        str5 = str18;
                        i38 = i20;
                        str10 = str5;
                    } else {
                        iM55682 = C0946.m55979("ۤ֫") ^ i31;
                        i21 = ((iM55682 ^ i32) * (-30709)) ^ (-1084679206);
                        i22 = -932741181;
                        i27 = iM55682 ^ i22;
                        i38 = i20;
                        str10 = str3;
                        i34 = i27;
                        i33 = i21;
                    }
                    break;
                case -245106004:
                case 902441124:
                    iM55933 = iM55933;
                    if (C11774.m27015(str10)) {
                        iM55684 = C0873.m55680("ۤ֡") ^ i31;
                        i21 = ((iM55684 ^ i32) * (-12231)) ^ 608397870;
                        i26 = 1992750999;
                    } else {
                        iM55684 = (i32 - C0873.m55680("᩻᩹")) * (-123);
                        i21 = ((iM55684 ^ i31) * (-1887)) ^ (-910999740);
                        i26 = 1827433937;
                    }
                    i27 = iM55684 ^ i26;
                    iM55933 = iM55933;
                    i34 = i27;
                    i33 = i21;
                    break;
                case -151191643:
                case 455758366:
                    numM55836 = C0912.m55836(C11774.m27008(C1012.m56135(str10, i36)));
                    num = numM55836;
                    iM55684 = C0946.m55979("᩷ܺ") ^ i31;
                    i21 = ((iM55684 ^ i32) * (-5739)) ^ 662019737;
                    i26 = -137314848;
                    i27 = iM55684 ^ i26;
                    iM55933 = iM55933;
                    i34 = i27;
                    i33 = i21;
                    break;
                case -125225289:
                case 2063293135:
                    numM55836 = C0912.m55836(AbstractC0942.m55969(str10));
                    num = numM55836;
                    iM55684 = C0946.m55979("᩷ܺ") ^ i31;
                    i21 = ((iM55684 ^ i32) * (-5739)) ^ 662019737;
                    i26 = -137314848;
                    i27 = iM55684 ^ i26;
                    iM55933 = iM55933;
                    i34 = i27;
                    i33 = i21;
                    break;
                case -94281824:
                case 265035280:
                    str10 = str10;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    strM55639 = strM55639;
                    str6 = str6;
                    printStream3 = printStream3;
                    str8 = str8;
                    i39 = i39;
                    textView2 = textView2;
                    s2 = sArr2[c];
                    i29 = s2 * s2;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0873.m55680("ۧ᩷") ^ i31) * (-119);
                        i33 = ((iM55680 ^ i32) * (-255)) ^ (-1502592641);
                        i3 = -829490346;
                    } else {
                        iM55680 = (C0873.m55680("ۙ᩸") + i31) * (-101);
                        i33 = ((iM55680 ^ i32) * (-11989)) ^ 862467633;
                        i3 = 1343568506;
                    }
                    i4 = iM55680 ^ i3;
                    textView2 = textView2;
                    i39 = i39;
                    str10 = str10;
                    i34 = i4;
                    str8 = str8;
                    printStream3 = printStream3;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    c20199 = this;
                    str6 = str6;
                    strM55639 = strM55639;
                    break;
                case -7205736:
                case 1725600271:
                    str = str10;
                    String str19 = str8;
                    i41 = iM55878 + 2;
                    int iM557110 = C0882.m55719(strM55929);
                    String str20 = c20199.f62496;
                    if (iM557110 == C0927.m55878(str20)) {
                        iM559711 = (i32 - C0873.m55680("ۨܽ")) * 63;
                        i12 = ((iM559711 ^ i31) * 25199) ^ (-1227546654);
                        i13 = 880597655;
                    } else {
                        iM559711 = C0946.m55979("ۛۘ") ^ i31;
                        i12 = ((iM559711 ^ i32) * 24015) ^ (-2111458058);
                        i13 = -1004745166;
                    }
                    i7 = iM559711 ^ i13;
                    str8 = str19;
                    str11 = str20;
                    i33 = i12;
                    i36 = 2;
                    i37 = -16724992;
                    str5 = str;
                    i34 = i7;
                    str10 = str5;
                    break;
                case -7156304:
                case 1440330820:
                    numM55836 = null;
                    num = numM55836;
                    iM55684 = C0946.m55979("᩷ܺ") ^ i31;
                    i21 = ((iM55684 ^ i32) * (-5739)) ^ 662019737;
                    i26 = -137314848;
                    i27 = iM55684 ^ i26;
                    iM55933 = iM55933;
                    i34 = i27;
                    i33 = i21;
                    break;
                case 58821177:
                case 2121750579:
                    str3 = str10;
                    String str21 = str7;
                    i20 = i38;
                    if (!C0906.m55806(strM55929, str21)) {
                        str7 = str21;
                        iM55682 = C0946.m55979("ۖ᩹") ^ i32;
                        i21 = ((iM55682 ^ i31) * (-3119)) ^ 1592856703;
                        i22 = 114415907;
                        i27 = iM55682 ^ i22;
                        i38 = i20;
                        str10 = str3;
                        i34 = i27;
                        i33 = i21;
                    } else {
                        iM55683 = C0946.m55979("ۖ᩻") ^ i31;
                        str7 = str21;
                        i33 = ((iM55683 ^ i32) * (-31367)) ^ (-455129795);
                        i23 = 1296694860;
                        i11 = iM55683 ^ i23;
                        i38 = i20;
                        str10 = str3;
                        i34 = i11;
                    }
                    break;
                case 159563506:
                case 388954220:
                    if (C0898.m55800() <= 0) {
                        iM559715 = C0946.m55979("ۚۖ") ^ i32;
                        i21 = ((iM559715 ^ i31) * (-30995)) ^ 1035838;
                        i28 = 225969759;
                    } else {
                        iM559715 = C0946.m55979("ۙ۫") ^ i31;
                        i21 = ((iM559715 ^ i32) * 10969) ^ (-635473916);
                        i28 = 1233511449;
                    }
                    i34 = iM559715 ^ i28;
                    i33 = i21;
                    break;
                case 220021585:
                case 797972414:
                    i40 = 32302;
                    iM55680 = C0873.m55680("ܽۧ") ^ i32;
                    i33 = ((iM55680 ^ i31) * 3809) ^ 428460876;
                    i3 = 270183038;
                    i4 = iM55680 ^ i3;
                    textView2 = textView2;
                    i39 = i39;
                    str10 = str10;
                    i34 = i4;
                    str8 = str8;
                    printStream3 = printStream3;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    c20199 = this;
                    str6 = str6;
                    strM55639 = strM55639;
                    break;
                case 302474175:
                case 2040306782:
                    iM55933 = iM55933;
                    strM55970 = AbstractC0942.m55970(f82317, 57, 1, i40);
                    if (num != null) {
                        iM55684 = C0873.m55680("ۖۤ") ^ i32;
                        i21 = ((iM55684 ^ i31) * 3963) ^ (-271591498);
                        i26 = -205330727;
                    } else {
                        iM55684 = (i31 - C0946.m55979("ۤۘ")) * 83;
                        i21 = ((iM55684 ^ i32) * (-8843)) ^ 27927777;
                        i26 = -1956783463;
                    }
                    i27 = iM55684 ^ i26;
                    iM55933 = iM55933;
                    i34 = i27;
                    i33 = i21;
                    break;
                case 414552343:
                case 1177075353:
                    strM55757 = C0892.m55757(strM55929, 0, iM56300);
                    i20 = i38;
                    int iM559722 = (C0946.m55979("ܽۤ") ^ i31) * (-9);
                    String str110 = strM55757;
                    i33 = ((iM559722 ^ i32) * (-13837)) ^ (-1555257640);
                    i34 = iM559722 ^ (-889569422);
                    str5 = str110;
                    i38 = i20;
                    str10 = str5;
                    break;
                case 484349195:
                case 1478306999:
                    C0912.m55833();
                    C0892.m55749();
                    iM559715 = C0946.m55979("ۚۖ") ^ i32;
                    i21 = ((iM559715 ^ i31) * (-30995)) ^ 1035838;
                    i28 = 225969759;
                    i34 = iM559715 ^ i28;
                    i33 = i21;
                    break;
                case 508353467:
                case 1053012886:
                    str10 = str10;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    strM55639 = strM55639;
                    str6 = str6;
                    printStream3 = printStream3;
                    str8 = str8;
                    s = s2;
                    i39 = i39;
                    textView2 = textView2;
                    sArr2 = f82317;
                    c = 0;
                    if (C0930.f81879 > 0) {
                        iM55979 = (i32 - C0946.m55979("ۖۨ")) * (-117);
                        i = ((iM55979 ^ i31) * (-13579)) ^ (-1151710523);
                        i2 = 1370794812;
                        i4 = iM55979 ^ i2;
                        s2 = s;
                        i33 = i;
                        textView2 = textView2;
                        i39 = i39;
                        str10 = str10;
                        i34 = i4;
                        str8 = str8;
                        printStream3 = printStream3;
                        spannableStringBuilder2 = spannableStringBuilder2;
                        c20199 = this;
                        str6 = str6;
                        strM55639 = strM55639;
                    } else {
                        s2 = s;
                        iM55680 = (C0873.m55680("ۧ᩷") ^ i31) * (-119);
                        i33 = ((iM55680 ^ i32) * (-255)) ^ (-1502592641);
                        i3 = -829490346;
                        i4 = iM55680 ^ i3;
                        textView2 = textView2;
                        i39 = i39;
                        str10 = str10;
                        i34 = i4;
                        str8 = str8;
                        printStream3 = printStream3;
                        spannableStringBuilder2 = spannableStringBuilder2;
                        c20199 = this;
                        str6 = str6;
                        strM55639 = strM55639;
                    }
                    break;
                case 545666654:
                case 1261906368:
                    i40 = 401;
                    iM55680 = C0873.m55680("ܽۧ") ^ i32;
                    i33 = ((iM55680 ^ i31) * 3809) ^ 428460876;
                    i3 = 270183038;
                    i4 = iM55680 ^ i3;
                    textView2 = textView2;
                    i39 = i39;
                    str10 = str10;
                    i34 = i4;
                    str8 = str8;
                    printStream3 = printStream3;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    c20199 = this;
                    str6 = str6;
                    strM55639 = strM55639;
                    break;
                case 616061457:
                case 625831122:
                    numM55836 = C1003.m56129(C11774.m27008(str10));
                    num = numM55836;
                    iM55684 = C0946.m55979("᩷ܺ") ^ i31;
                    i21 = ((iM55684 ^ i32) * (-5739)) ^ 662019737;
                    i26 = -137314848;
                    i27 = iM55684 ^ i26;
                    iM55933 = iM55933;
                    i34 = i27;
                    i33 = i21;
                    break;
                case 715512295:
                case 2066736892:
                    AbstractC0942.m55971();
                    if (RunnableC0938.f81886 < 0) {
                        str3 = str10;
                        printStream2 = printStream3;
                        str4 = str8;
                        int iM556813 = (i32 - C0873.m55680("ۚ᩵")) * (-11);
                        int i47 = ((iM556813 ^ i31) * 15469) ^ (-146338157);
                        i11 = iM556813 ^ 953700015;
                        str8 = str4;
                        printStream3 = printStream2;
                        i33 = i47;
                        typefaceSpan = null;
                        str10 = str3;
                        i34 = i11;
                    } else {
                        str = str10;
                        spannableStringBuilderM56254 = spannableStringBuilder3;
                        strM55639 = strM55639;
                        str6 = str6;
                        printStream = printStream3;
                        str2 = str8;
                        sArr = sArr3;
                        i8 = i39;
                        textView = textView2;
                        spannableStringBuilder = spannableStringBuilder2;
                        int iM556814 = C0873.m55680("ܿܽ") ^ i31;
                        SpannableStringBuilder spannableStringBuilder7 = spannableStringBuilder;
                        sArr3 = sArr;
                        i39 = i8;
                        str8 = str2;
                        i33 = ((iM556814 ^ i32) * (-26901)) ^ 1973353897;
                        spannableStringBuilder3 = spannableStringBuilderM56254;
                        textView2 = textView;
                        str10 = str;
                        i34 = iM556814 ^ (-1721694801);
                        printStream3 = printStream;
                        spannableStringBuilder2 = spannableStringBuilder7;
                        str6 = str6;
                        strM55639 = strM55639;
                    }
                    break;
                case 777468065:
                case 2031740538:
                    str = str10;
                    strM55639 = strM55639;
                    str2 = str8;
                    PrintStream printStream6 = printStream3;
                    textView = textView2;
                    String str22 = str6;
                    printStream = printStream6;
                    str6 = str22;
                    sArr = sArr3;
                    int i48 = i39;
                    String strM55652 = C0866.m55652(sArr, i48, 2, i40);
                    i8 = i48;
                    spannableStringBuilder = spannableStringBuilder2;
                    spannableStringBuilderM56254 = C1036.m56254(spannableStringBuilder, strM55652);
                    if (C0992.f81922 >= 0) {
                        int iM556815 = C0873.m55680("ܿܽ") ^ i31;
                        SpannableStringBuilder spannableStringBuilder8 = spannableStringBuilder;
                        sArr3 = sArr;
                        i39 = i8;
                        str8 = str2;
                        i33 = ((iM556815 ^ i32) * (-26901)) ^ 1973353897;
                        spannableStringBuilder3 = spannableStringBuilderM56254;
                        textView2 = textView;
                        str10 = str;
                        i34 = iM556815 ^ (-1721694801);
                        printStream3 = printStream;
                        spannableStringBuilder2 = spannableStringBuilder8;
                    } else {
                        int iM559723 = C0946.m55979("ܽ֫") ^ i32;
                        i5 = ((iM559723 ^ i31) * 19121) ^ (-440453325);
                        i6 = iM559723 ^ 433715829;
                        sArr3 = sArr;
                        spannableStringBuilder3 = spannableStringBuilderM56254;
                        i39 = i8;
                        spannableStringBuilder2 = spannableStringBuilder;
                        str8 = str2;
                        i33 = i5;
                        str10 = str;
                        i34 = i6;
                        textView2 = textView;
                        printStream3 = printStream;
                    }
                    str6 = str6;
                    strM55639 = strM55639;
                    break;
                case 1246957426:
                case 1457854718:
                    str10 = str10;
                    int iM55879 = C0927.m55878(strM55929);
                    String str23 = c20199.f62492;
                    if (iM55879 == C0882.m55719(str23)) {
                        iM55681 = C0946.m55979("ܺۢ") ^ i31;
                        i14 = ((iM55681 ^ i32) * (-28127)) ^ 1934571321;
                        i15 = -297310930;
                    } else {
                        iM55681 = (C0873.m55680("֨ᩴ") + i32) * 59;
                        i14 = ((iM55681 ^ i31) * 4423) ^ (-720820566);
                        i15 = -67470818;
                    }
                    i16 = iM55681 ^ i15;
                    str9 = str23;
                    str5 = str10;
                    i34 = i16;
                    i33 = i14;
                    str10 = str5;
                    break;
                case 1485524945:
                case 1611176411:
                    str3 = str10;
                    String str24 = str9;
                    i20 = i38;
                    if (!ViewOnClickListenerC0939.m55949(strM55929, str24)) {
                        str9 = str24;
                        iM55682 = C0873.m55680("ᩴۤ") ^ i32;
                        i21 = ((iM55682 ^ i31) * (-8559)) ^ 1064995164;
                        i22 = 1246597597;
                        i27 = iM55682 ^ i22;
                        i38 = i20;
                        str10 = str3;
                        i34 = i27;
                        i33 = i21;
                    } else {
                        iM55683 = C0873.m55680("ۖܿ") ^ i31;
                        str9 = str24;
                        i33 = ((iM55683 ^ i32) * (-7105)) ^ 1456445372;
                        i23 = -1486345184;
                        i11 = iM55683 ^ i23;
                        i38 = i20;
                        str10 = str3;
                        i34 = i11;
                    }
                    break;
                default:
                    C0894.m55771(textView2, str8);
                    break;
            }
            return;
        }
    }
}
