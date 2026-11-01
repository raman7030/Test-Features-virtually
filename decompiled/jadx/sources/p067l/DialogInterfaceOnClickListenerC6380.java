package p067l;

import android.app.Application;
import android.content.DialogInterface;
import android.view.View;
import com.umeng.analytics.MobclickAgent;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VR */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC6380 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֨ۧܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f81964 = {9621, 11235, 11229, 11209, 11239, 11210, 11153, 11259, 11229, 11211, 11228, 11200, 11215, 11203, 11211, 11259, 11229, 11211, 11228, 11258, 11223, 11230, 11211, 11212, 11227, 11226, 11226, 11201, 11200, 11244, 11227, 11226, 11226, 11201, 11200, 11230, 11227, 11229, 11206, 11139, 11213, 11202, 11207, 11213, 11205, 6768, -8603, -8613, -8625, -8607, -8628, -8681, -8579, -8613, -8627, -8614, -8634, -8631, -8635, -8627, -8579, -8613, -8627, -8614, -8580, -8623, -8616, -8627, -8630, -8611, -8612, -8612, -8633, -8634, -8598, -8611, -8612, -8612, -8633, -8634, -8616, -8611, -8613, -8640, -8699, -8629, -8636, -8639, -8629, -8637};

    /* JADX INFO: renamed from: ۗ */
    public String f16507;

    /* JADX INFO: renamed from: ۙ */
    public Runnable f16508;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f16509;

    /* JADX INFO: renamed from: ᩸ */
    public int f16510;

    /* JADX INFO: renamed from: ᩹ */
    public int f16511;

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ boolean m14592(DialogInterfaceOnClickListenerC6380 dialogInterfaceOnClickListenerC6380) {
        return dialogInterfaceOnClickListenerC6380.f16509;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* bridge */ /* synthetic */ String m14593(DialogInterfaceOnClickListenerC6380 dialogInterfaceOnClickListenerC6380) {
        return dialogInterfaceOnClickListenerC6380.f16507;
    }

    public DialogInterfaceOnClickListenerC6380(int i, int i2) {
        int i3 = -1020899957;
        int i4 = C0873.f81841;
        int i5 = C0866.f81837;
        int iM55680 = C0873.m55680("ۧܽ") ^ i5;
        int i6 = ((iM55680 ^ i4) * (-9921)) ^ (-901354387);
        int i7 = -731266889;
        while (true) {
            i3 = ((((i3 ^ i4) * (-29429)) >> 31) & i6) ^ (iM55680 ^ i7);
            switch (i3) {
                case -2081862443:
                case 1506049539:
                    C0949.m56012();
                    if (!C1048.f81963) {
                        iM55680 = C0946.m55979("᩵᩹") ^ i5;
                        i6 = ((iM55680 ^ i4) * 5951) ^ 1150143315;
                        i7 = -997522593;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۜܰ")) * 85;
                        i6 = ((iM55680 ^ i5) * (-3635)) ^ (-2018360994);
                        i7 = -1552522231;
                    }
                    break;
                case -2027313238:
                case 1955512686:
                    C0894.m55769();
                    if (C1053.m56327() >= 0) {
                        iM55680 = (i5 - C0946.m55979("֡᩵")) * (-93);
                        i6 = ((iM55680 ^ i4) * 22437) ^ (-1227411521);
                        i7 = -1843808975;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۜܰ")) * 85;
                        i6 = ((iM55680 ^ i5) * (-3635)) ^ (-2018360994);
                        i7 = -1552522231;
                    }
                    break;
                case -1848780655:
                case 1881157164:
                    if (C0937.m55918() >= 0) {
                        iM55680 = C0873.m55680("᩵۬") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-1999)) ^ (-13564042);
                        i7 = -1414615942;
                    } else {
                        iM55680 = (C0873.m55680("᩻ۘ") ^ i5) * (-77);
                        i6 = ((iM55680 ^ i4) * 17245) ^ (-1971184422);
                        i7 = -1171218732;
                    }
                    break;
                case -1410067294:
                case 189418370:
                    this.f16511 = i;
                    if (C0949.f81897 >= 0) {
                        iM55680 = (i4 - C0946.m55979("ۜܰ")) * 85;
                        i6 = ((iM55680 ^ i5) * (-3635)) ^ (-2018360994);
                        i7 = -1552522231;
                    } else {
                        iM55680 = C0873.m55680("ܳۨ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-9571)) ^ 1300904973;
                        i7 = -1374806642;
                    }
                    break;
                case -1307591488:
                case -188869411:
                    if (C1194.f82045 != 0) {
                        iM55680 = C0873.m55680("ۧۧ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 17153) ^ (-1023367565);
                        i7 = 57953701;
                    } else {
                        iM55680 = C0946.m55979("᩺ۧ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 14617) ^ 538647057;
                        i7 = 447453681;
                    }
                    break;
                case -1143674892:
                case 464198648:
                    C0917.m55854();
                    C1053.m56327();
                    iM55680 = (i4 - C0946.m55979("ۜܰ")) * 85;
                    i6 = ((iM55680 ^ i5) * (-3635)) ^ (-2018360994);
                    i7 = -1552522231;
                    break;
                case -1090514733:
                case 1452302664:
                    C0873.m55678();
                    C0912.m55833();
                    throw new RuntimeException();
                case -980683681:
                case -573399322:
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0873.m55680("᩵۬") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-1999)) ^ (-13564042);
                        i7 = -1414615942;
                    } else {
                        iM55680 = (C0946.m55979("۫ܽ") + i4) * 123;
                        i6 = ((iM55680 ^ i5) * (-17965)) ^ (-738544289);
                        i7 = -2132970494;
                    }
                    break;
                case -642548012:
                case 1651209404:
                    if (C0877.f81843 < 0) {
                        iM55680 = C0873.m55680("ۧۧ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 17153) ^ (-1023367565);
                        i7 = 57953701;
                    } else {
                        iM55680 = C0946.m55979("᩵᩹") ^ i5;
                        i6 = ((iM55680 ^ i4) * 5951) ^ 1150143315;
                        i7 = -997522593;
                    }
                    break;
                case -380792991:
                case 1906660471:
                    if (C0946.f81894 != 0) {
                        iM55680 = (i4 - C0946.m55979("ۜܰ")) * 85;
                        i6 = ((iM55680 ^ i5) * (-3635)) ^ (-2018360994);
                        i7 = -1552522231;
                    } else {
                        iM55680 = (C0873.m55680("ۨ۫") ^ i5) * (-57);
                        i6 = ((iM55680 ^ i4) * (-24535)) ^ 237124934;
                        i7 = 1844913239;
                    }
                    break;
                case -173869308:
                case 330305322:
                    if (C0992.m56107() <= 0) {
                        iM55680 = C0873.m55680("ۧۧ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 17153) ^ (-1023367565);
                        i7 = 57953701;
                    } else {
                        iM55680 = (C0946.m55979("֫۬") ^ i5) * (-53);
                        i6 = ((iM55680 ^ i4) * (-15671)) ^ (-195680712);
                        i7 = 294675604;
                    }
                    break;
                case 1021389143:
                case 2048715047:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0873.m55680("ۧۧ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 17153) ^ (-1023367565);
                        i7 = 57953701;
                    } else {
                        iM55680 = C0873.m55680("᩶ۜ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 32585) ^ (-91942350);
                        i7 = 930901118;
                    }
                    break;
                case 1157097848:
                case 1494115086:
                    this.f16510 = i2;
                    return;
                case 1313750226:
                case 1538267913:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (i4 - C0946.m55979("ۜܰ")) * 85;
                        i6 = ((iM55680 ^ i5) * (-3635)) ^ (-2018360994);
                        i7 = -1552522231;
                    } else {
                        iM55680 = C0873.m55680("ۙ᩸") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-14411)) ^ 1132167039;
                        i7 = -880944792;
                    }
                    break;
                case 1370415383:
                case 1842329630:
                    if (C1024.f81946) {
                        iM55680 = C0946.m55979("᩵᩹") ^ i5;
                        i6 = ((iM55680 ^ i4) * 5951) ^ 1150143315;
                        i7 = -997522593;
                    } else {
                        iM55680 = C0946.m55979("ܺۘ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 28615) ^ (-1442995802);
                        i7 = -2070697004;
                    }
                    break;
                default:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (i5 - C0946.m55979("֡᩵")) * (-93);
                        i6 = ((iM55680 ^ i4) * 22437) ^ (-1227411521);
                        i7 = -1843808975;
                    } else {
                        iM55680 = C0873.m55680("֫ܿ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-20171)) ^ (-579699789);
                        i7 = 722800069;
                    }
                    break;
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int iM55680;
        int i2;
        int i3;
        String str;
        String strM56174;
        int i4;
        int iM55979;
        int i5;
        Runnable runnable;
        int iM559710;
        int i6;
        int i7;
        DialogInterfaceOnClickListenerC6380 dialogInterfaceOnClickListenerC6380 = this;
        int i8 = -1289632541;
        int i9 = RunnableC0938.f81886;
        int i10 = C0898.f81858;
        int iM559711 = C0946.m55979("ܺܿ") ^ i9;
        int i11 = ((iM559711 ^ i10) * 13511) ^ (-257029027);
        int i12 = iM559711 ^ 1890502292;
        String strM55642 = null;
        String str2 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        HashMap map = null;
        int i13 = 0;
        StringBuilder sb = null;
        int i14 = 0;
        short s = 0;
        Runnable runnable2 = null;
        short[] sArr4 = null;
        int i15 = 0;
        Application applicationM56136 = null;
        String strM55591 = null;
        int i16 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * (-22447)) >> 31));
            switch (i8) {
                case -1859989676:
                case 723583583:
                    runnable2 = runnable2;
                    sArr2 = f81964;
                    i14 = 15;
                    i13 = 8;
                    if (C0890.f81849 == 0) {
                        iM55680 = (i10 - C0946.m55979("ۨۗ")) * 59;
                        i2 = ((iM55680 ^ i9) * (-11715)) ^ (-102068699);
                        i3 = 1842793841;
                        i4 = iM55680 ^ i3;
                        runnable2 = runnable2;
                        i12 = i4;
                        i11 = i2;
                    } else {
                        str = strM55642;
                        int iM55681 = (i9 - C0873.m55680("ܰܽ")) * (-93);
                        sArr = sArr;
                        strM55642 = str;
                        i11 = ((iM55681 ^ i10) * (-2403)) ^ (-1608070461);
                        dialogInterfaceOnClickListenerC6380 = this;
                        runnable = runnable2;
                        i12 = iM55681 ^ (-566833635);
                        runnable2 = runnable;
                    }
                    break;
                case -1788038319:
                case -254126532:
                    runnable2 = runnable2;
                    map = new HashMap();
                    strM55642 = C0863.m55642(dialogInterfaceOnClickListenerC6380.f16511);
                    sArr4 = f81964;
                    if (C0949.m56012()) {
                        iM55680 = C0946.m55979("᩻᩸") ^ i10;
                        i2 = ((iM55680 ^ i9) * 12597) ^ (-1494197167);
                        i3 = 375463688;
                    } else {
                        iM55680 = (C0946.m55979("ᩴۘ") + i9) * (-3);
                        i2 = ((iM55680 ^ i10) * (-19627)) ^ (-1376911329);
                        i3 = 405508278;
                    }
                    i4 = iM55680 ^ i3;
                    runnable2 = runnable2;
                    i12 = i4;
                    i11 = i2;
                    break;
                case -1679020686:
                case -680784494:
                    runnable2 = runnable2;
                    C1028.m56246(map, C1404.m56462(sArr2, i14, i13, i15), C20462.m46157());
                    if (C1046.f81962 > 0) {
                        short[] sArr5 = f81964;
                        if (!C0947.f81895) {
                            sb = new StringBuilder(C1046.m56293(sArr5, 23, 6, i15));
                            i16 = dialogInterfaceOnClickListenerC6380.f16510;
                            if (C1012.f81938 < 0) {
                                iM55680 = C0873.m55680("ۧ᩶") ^ i9;
                                i2 = ((iM55680 ^ i10) * 32265) ^ 1141941632;
                                i3 = -284904115;
                                i4 = iM55680 ^ i3;
                                runnable2 = runnable2;
                                i12 = i4;
                                i11 = i2;
                            } else {
                                strM55642 = strM55642;
                                iM559710 = (i9 - C0946.m55979("ۖۗ")) * (-33);
                                i6 = ((iM559710 ^ i10) * 26115) ^ 1268436593;
                                i7 = 1020266397;
                                int i17 = iM559710 ^ i7;
                                strM55642 = strM55642;
                                runnable = runnable2;
                                i12 = i17;
                                i11 = i6;
                                runnable2 = runnable;
                            }
                            break;
                        }
                    }
                    int iM559712 = (C0946.m55979("᩸᩸") ^ i9) * (-11);
                    i2 = ((iM559712 ^ i10) * (-2933)) ^ (-1694658139);
                    i4 = iM559712 ^ 1948572804;
                    runnable2 = runnable2;
                    sb = null;
                    i12 = i4;
                    i11 = i2;
                    break;
                case -1528970500:
                case -1434860089:
                    C0927.m55868(runnable2);
                    iM55979 = (C0873.m55680("ܶۢ") ^ i10) * 79;
                    i2 = ((iM55979 ^ i9) * (-15371)) ^ 145942408;
                    i5 = 2034896547;
                    i12 = iM55979 ^ i5;
                    i11 = i2;
                    break;
                case -1403831848:
                case -677687613:
                    runnable2 = runnable2;
                    strM55642 = strM55642;
                    s = sArr[0];
                    if (C1048.f81963) {
                        iM559710 = C0873.m55680("ۢۙ") ^ i9;
                        i6 = ((iM559710 ^ i10) * (-17463)) ^ 1114905656;
                        i7 = 1591073834;
                    } else {
                        iM559710 = (i9 - C0946.m55979("ۖۗ")) * (-33);
                        i6 = ((iM559710 ^ i10) * 26115) ^ 1268436593;
                        i7 = 1020266397;
                    }
                    int i18 = iM559710 ^ i7;
                    strM55642 = strM55642;
                    runnable = runnable2;
                    i12 = i18;
                    i11 = i6;
                    runnable2 = runnable;
                    break;
                case -1161235897:
                case 518412189:
                    C1017.m56187();
                    C0882.m55710();
                    break;
                case -1140155109:
                case 2062284427:
                    runnable2 = runnable2;
                    C0898.m55805(map, C0861.m55618(f81964, 7, 8, i15), str2);
                    if (C1048.m56305() < 0) {
                        iM55680 = C0873.m55680("᩹ۘ") ^ i10;
                        i2 = ((iM55680 ^ i9) * 15215) ^ 2033200408;
                        i3 = -1717177373;
                        i4 = iM55680 ^ i3;
                        runnable2 = runnable2;
                        i12 = i4;
                        i11 = i2;
                    } else {
                        str = strM55642;
                        int iM55682 = (i9 - C0873.m55680("ܰܽ")) * (-93);
                        sArr = sArr;
                        strM55642 = str;
                        i11 = ((iM55682 ^ i10) * (-2403)) ^ (-1608070461);
                        dialogInterfaceOnClickListenerC6380 = this;
                        runnable = runnable2;
                        i12 = iM55682 ^ (-566833635);
                        runnable2 = runnable;
                    }
                    break;
                case -977902645:
                case -766519457:
                    strM56174 = RunnableC1014.m56174();
                    str2 = strM56174;
                    iM55680 = C0946.m55979("ۤ֡") ^ i9;
                    i2 = ((iM55680 ^ i10) * (-17225)) ^ (-1921129479);
                    i3 = 770283788;
                    i4 = iM55680 ^ i3;
                    runnable2 = runnable2;
                    i12 = i4;
                    i11 = i2;
                    break;
                case -957219648:
                case 1619639731:
                    i15 = 11182;
                    iM559710 = C0873.m55680("᩵᩻") ^ i10;
                    i6 = ((iM559710 ^ i9) * (-8077)) ^ 819062241;
                    i7 = -128114862;
                    int i19 = iM559710 ^ i7;
                    strM55642 = strM55642;
                    runnable = runnable2;
                    i12 = i19;
                    i11 = i6;
                    runnable2 = runnable;
                    break;
                case -920783629:
                case -914853696:
                    runnable2 = dialogInterfaceOnClickListenerC6380.f16508;
                    if (runnable2 != null) {
                        iM55979 = (C0946.m55979("ۨۢ") + i9) * (-91);
                        i2 = ((iM55979 ^ i10) * 6727) ^ 1860666079;
                        i5 = -1983325453;
                    } else {
                        iM55979 = (C0873.m55680("ܶۢ") ^ i10) * 79;
                        i2 = ((iM55979 ^ i9) * (-15371)) ^ 145942408;
                        i5 = 2034896547;
                    }
                    i12 = iM55979 ^ i5;
                    i11 = i2;
                    break;
                case -818487497:
                case 551002418:
                    runnable2 = runnable2;
                    strM55642 = strM55642;
                    if ((36212 * s) - ((s * s) + 327827236) <= 0) {
                        iM559710 = (i9 - C0946.m55979("ۛܳ")) * (-21);
                        i6 = ((iM559710 ^ i10) * 22837) ^ 383157685;
                        i7 = -829338778;
                    } else {
                        iM559710 = (C0946.m55979("ۜ᩸") + i10) * 35;
                        i6 = ((iM559710 ^ i9) * 30223) ^ 1552158474;
                        i7 = 1938795557;
                    }
                    int i110 = iM559710 ^ i7;
                    strM55642 = strM55642;
                    runnable = runnable2;
                    i12 = i110;
                    i11 = i6;
                    runnable2 = runnable;
                    break;
                case -813886794:
                case 376730029:
                    if (C1124.f82007 >= 0) {
                        runnable2 = runnable2;
                        iM55680 = (C0873.m55680("֡ܽ") ^ i10) * 43;
                        i2 = ((iM55680 ^ i9) * 19783) ^ 1334730775;
                        i3 = 99044851;
                        i4 = iM55680 ^ i3;
                        runnable2 = runnable2;
                        i12 = i4;
                        i11 = i2;
                    } else {
                        runnable2 = runnable2;
                        strM55642 = strM55642;
                        iM559710 = (i9 - C0946.m55979("ۖۗ")) * (-33);
                        i6 = ((iM559710 ^ i10) * 26115) ^ 1268436593;
                        i7 = 1020266397;
                        int i111 = iM559710 ^ i7;
                        strM55642 = strM55642;
                        runnable = runnable2;
                        i12 = i111;
                        i11 = i6;
                        runnable2 = runnable;
                    }
                    break;
                case -666128577:
                case 6860441:
                    break;
                case -558018966:
                case 681791114:
                    C0894.m55769();
                    if (C0866.f81837 < 0) {
                        runnable2 = runnable2;
                        strM55642 = strM55642;
                        iM559710 = (i9 - C0946.m55979("ۖۗ")) * (-33);
                        i6 = ((iM559710 ^ i10) * 26115) ^ 1268436593;
                        i7 = 1020266397;
                        int i112 = iM559710 ^ i7;
                        strM55642 = strM55642;
                        runnable = runnable2;
                        i12 = i112;
                        i11 = i6;
                        runnable2 = runnable;
                    } else {
                        runnable2 = runnable2;
                        iM55680 = C0946.m55979("᩻᩸") ^ i10;
                        i2 = ((iM55680 ^ i9) * 12597) ^ (-1494197167);
                        i3 = 375463688;
                        i4 = iM55680 ^ i3;
                        runnable2 = runnable2;
                        i12 = i4;
                        i11 = i2;
                    }
                    break;
                case -514982149:
                case 701731959:
                    runnable2 = runnable2;
                    str = strM55642;
                    sArr = f81964;
                    if (RunnableC0938.m55938() != 0) {
                        int iM55683 = (i9 - C0873.m55680("ܰܽ")) * (-93);
                        sArr = sArr;
                        strM55642 = str;
                        i11 = ((iM55683 ^ i10) * (-2403)) ^ (-1608070461);
                        dialogInterfaceOnClickListenerC6380 = this;
                        runnable = runnable2;
                        i12 = iM55683 ^ (-566833635);
                        runnable2 = runnable;
                    } else {
                        int iM559713 = C0946.m55979("۬ᩴ") ^ i10;
                        sArr = sArr;
                        strM55642 = str;
                        i11 = ((iM559713 ^ i9) * 17831) ^ (-1689248067);
                        runnable2 = runnable2;
                        i12 = iM559713 ^ (-551569405);
                        dialogInterfaceOnClickListenerC6380 = this;
                    }
                    break;
                case -348438809:
                case 1923882885:
                    runnable2 = runnable2;
                    MobclickAgent.onEvent(applicationM56136, C0863.m55635(f81964, 35, 10, i15), map);
                    iM55680 = (C0946.m55979("ܰ۟") + i10) * (-105);
                    i2 = ((iM55680 ^ i9) * 14445) ^ (-1744449460);
                    i3 = 1214738114;
                    i4 = iM55680 ^ i3;
                    runnable2 = runnable2;
                    i12 = i4;
                    i11 = i2;
                    break;
                case -290539145:
                case -141012016:
                    runnable2 = runnable2;
                    C1028.m56246(map, C1404.m56462(sArr3, 29, 6, i15), strM55591);
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (C0873.m55680("֡ܽ") ^ i10) * 43;
                        i2 = ((iM55680 ^ i9) * 19783) ^ 1334730775;
                        i3 = 99044851;
                    } else {
                        iM55680 = C0873.m55680("ۘܰ") ^ i10;
                        i2 = ((iM55680 ^ i9) * (-31437)) ^ (-1505354731);
                        i3 = -161983217;
                    }
                    i4 = iM55680 ^ i3;
                    runnable2 = runnable2;
                    i12 = i4;
                    i11 = i2;
                    break;
                case -28028791:
                case 1382097248:
                    runnable2 = runnable2;
                    strM55642 = strM55642;
                    C1028.m56246(map, C1017.m56189(sArr4, 1, 5, i15), strM55642);
                    if (RunnableC0938.m55924()) {
                        iM559710 = C0873.m55680("֨۠") ^ i10;
                        i6 = ((iM559710 ^ i9) * 17381) ^ 1550877590;
                        i7 = -624204113;
                    } else {
                        iM559710 = (C0873.m55680("֫ܺ") + i9) * 51;
                        i6 = ((iM559710 ^ i10) * 20121) ^ 503316977;
                        i7 = 780598348;
                    }
                    int i113 = iM559710 ^ i7;
                    strM55642 = strM55642;
                    runnable = runnable2;
                    i12 = i113;
                    i11 = i6;
                    runnable2 = runnable;
                    break;
                case -19101281:
                case 1210185092:
                    runnable2 = runnable2;
                    applicationM56136 = C1012.m56136();
                    int i20 = C8775.f23820;
                    if (C17452.m39788()) {
                        iM55680 = (C0946.m55979("ܰ۟") + i10) * (-105);
                        i2 = ((iM55680 ^ i9) * 14445) ^ (-1744449460);
                        i3 = 1214738114;
                    } else {
                        iM55680 = (i9 - C0873.m55680("ܺ᩹")) * (-51);
                        i2 = ((iM55680 ^ i10) * (-6525)) ^ 1736662679;
                        i3 = -1654624662;
                    }
                    i4 = iM55680 ^ i3;
                    runnable2 = runnable2;
                    i12 = i4;
                    i11 = i2;
                    break;
                case 130868313:
                case 1503816969:
                    i15 = 43199;
                    iM559710 = C0873.m55680("᩵᩻") ^ i10;
                    i6 = ((iM559710 ^ i9) * (-8077)) ^ 819062241;
                    i7 = -128114862;
                    int i114 = iM559710 ^ i7;
                    strM55642 = strM55642;
                    runnable = runnable2;
                    i12 = i114;
                    i11 = i6;
                    runnable2 = runnable;
                    break;
                case 225208810:
                case 1665003686:
                    C1025.m56230();
                    C0949.m56012();
                    runnable2 = runnable2;
                    iM55680 = C0946.m55979("᩻᩸") ^ i10;
                    i2 = ((iM55680 ^ i9) * 12597) ^ (-1494197167);
                    i3 = 375463688;
                    i4 = iM55680 ^ i3;
                    runnable2 = runnable2;
                    i12 = i4;
                    i11 = i2;
                    break;
                case 274918781:
                case 2129107464:
                    runnable2 = runnable2;
                    C0845.m55589(sb, i16);
                    strM55591 = C0845.m55591(sb);
                    sArr3 = f81964;
                    if (C1053.f81965 <= 0) {
                        int iM559714 = (C0946.m55979("᩸᩸") ^ i9) * (-11);
                        i2 = ((iM559714 ^ i10) * (-2933)) ^ (-1694658139);
                        i4 = iM559714 ^ 1948572804;
                        runnable2 = runnable2;
                        sb = null;
                    } else {
                        iM55680 = C0946.m55979("᩺ܳ") ^ i9;
                        i2 = ((iM55680 ^ i10) * (-24585)) ^ (-545321302);
                        i3 = 2135842212;
                        i4 = iM55680 ^ i3;
                        runnable2 = runnable2;
                    }
                    i12 = i4;
                    i11 = i2;
                    break;
                case 832088898:
                case 1806611599:
                    if (C0894.m55769() >= 0) {
                        runnable2 = runnable2;
                        str = strM55642;
                        int iM55684 = (i9 - C0873.m55680("ܰܽ")) * (-93);
                        sArr = sArr;
                        strM55642 = str;
                        i11 = ((iM55684 ^ i10) * (-2403)) ^ (-1608070461);
                        dialogInterfaceOnClickListenerC6380 = this;
                        runnable = runnable2;
                        i12 = iM55684 ^ (-566833635);
                        runnable2 = runnable;
                    } else {
                        runnable2 = runnable2;
                        iM55680 = C0946.m55979("᩻᩸") ^ i10;
                        i2 = ((iM55680 ^ i9) * 12597) ^ (-1494197167);
                        i3 = 375463688;
                        i4 = iM55680 ^ i3;
                        runnable2 = runnable2;
                        i12 = i4;
                        i11 = i2;
                    }
                    break;
                default:
                    strM56174 = C0946.m55986(f81964, 6, 1, i15);
                    str2 = strM56174;
                    iM55680 = C0946.m55979("ۤ֡") ^ i9;
                    i2 = ((iM55680 ^ i10) * (-17225)) ^ (-1921129479);
                    i3 = 770283788;
                    i4 = iM55680 ^ i3;
                    runnable2 = runnable2;
                    i12 = i4;
                    i11 = i2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01f9 A[PHI: r10 r11 r12 r23
      0x01f9: PHI (r10v7 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:54:0x01f7, B:35:0x0151, B:10:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r11v7 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:54:0x01f7, B:35:0x0151, B:10:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r12v7 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:54:0x01f7, B:35:0x0151, B:10:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r23v42 java.lang.Runnable) = (r23v20 java.lang.Runnable), (r23v24 java.lang.Runnable), (r23v43 java.lang.Runnable) binds: [B:54:0x01f7, B:35:0x0151, B:10:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        if (p067l.C1929.f83011 != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a0, code lost:
    
        if (p067l.C1053.m56327() < 0) goto L19;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int iM55979;
        int i;
        int i2;
        short s;
        String str;
        int iM55680;
        int i3;
        int i4;
        int iM559710;
        int i5;
        int i6;
        String strM55707;
        int iM559711;
        int i7;
        int iM55681;
        int i8;
        int i9;
        DialogInterfaceOnClickListenerC6380 dialogInterfaceOnClickListenerC6380 = this;
        int i10 = 1859130829;
        int i11 = C1012.f81938;
        int i12 = C1404.f82149;
        int iM55682 = C0873.m55680("ۜۘ") ^ i12;
        int i13 = ((iM55682 ^ i11) * (-18737)) ^ 638640631;
        int i14 = iM55682 ^ 312611066;
        String strM55579 = null;
        String str2 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        HashMap map = null;
        int i15 = 0;
        int i16 = 0;
        StringBuilder sb = null;
        int i17 = 0;
        char c = 0;
        short s2 = 0;
        int i18 = 0;
        int i19 = 0;
        short[] sArr4 = null;
        Runnable runnable = null;
        Application applicationM56136 = null;
        String strM55639 = null;
        int i20 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * 9783) >> 31));
            switch (i10) {
                case -2090224100:
                case 1728866018:
                    runnable = dialogInterfaceOnClickListenerC6380.f16508;
                    if (runnable != null) {
                        iM55681 = C0873.m55680("ۛܳ") ^ i11;
                        i5 = ((iM55681 ^ i12) * 7391) ^ 569107479;
                        i8 = -1419693039;
                    } else {
                        iM55681 = C0873.m55680("ۖܽ") ^ i12;
                        i5 = ((iM55681 ^ i11) * 19979) ^ (-1925062240);
                        i8 = 492077048;
                    }
                    i14 = iM55681 ^ i8;
                    i13 = i5;
                    break;
                case -2082550706:
                case -810670662:
                    i17 = 56872;
                    iM55979 = (C0946.m55979("ܺۧ") + i12) * 3;
                    i = ((iM55979 ^ i11) * 22149) ^ 120840552;
                    i2 = 1082066695;
                    int i21 = iM55979 ^ i2;
                    strM55579 = strM55579;
                    Runnable runnable2 = runnable;
                    i14 = i21;
                    i13 = i;
                    runnable = runnable2;
                    break;
                case -2004853470:
                case -36835259:
                    runnable = runnable;
                    sArr2 = f81964;
                    i15 = 60;
                    i16 = 8;
                    if (RunnableC0938.f81886 >= 0) {
                        iM559710 = C0946.m55979("ۗۧ") ^ i11;
                        i5 = ((iM559710 ^ i12) * 10525) ^ (-443093022);
                        i6 = -1543285934;
                    } else {
                        iM559710 = (i12 - C0946.m55979("۫ܿ")) * (-83);
                        i5 = ((iM559710 ^ i11) * 3475) ^ 1723596292;
                        i6 = -1912413459;
                    }
                    i9 = iM559710 ^ i6;
                    runnable = runnable;
                    i14 = i9;
                    i13 = i5;
                    break;
                case -1756204161:
                case -292081640:
                    i17 = 31518;
                    iM55979 = (C0946.m55979("ܺۧ") + i12) * 3;
                    i = ((iM55979 ^ i11) * 22149) ^ 120840552;
                    i2 = 1082066695;
                    int i22 = iM55979 ^ i2;
                    strM55579 = strM55579;
                    Runnable runnable3 = runnable;
                    i14 = i22;
                    i13 = i;
                    runnable = runnable3;
                    break;
                case -1657798720:
                case -661057618:
                    runnable = runnable;
                    applicationM56136 = C1012.m56136();
                    int i23 = C8775.f23820;
                    if (C17452.m39788()) {
                        iM559710 = (C0873.m55680("᩶ۛ") + i11) * 55;
                        i5 = ((iM559710 ^ i12) * 8669) ^ 1276615941;
                        i6 = -1893913495;
                    } else {
                        iM559710 = (i12 - C0873.m55680("ܳ۫")) * 19;
                        i5 = ((iM559710 ^ i11) * (-395)) ^ 1691228711;
                        i6 = 1757795026;
                    }
                    i9 = iM559710 ^ i6;
                    runnable = runnable;
                    i14 = i9;
                    i13 = i5;
                    break;
                case -1652022271:
                case -1365011857:
                    runnable = runnable;
                    C0863.m55629(sb, i20);
                    strM55639 = C0863.m55639(sb);
                    sArr3 = f81964;
                    if (C0861.f81831) {
                        iM559710 = C0946.m55979("ۧۤ") ^ i12;
                        i5 = ((iM559710 ^ i11) * 69) ^ 974934161;
                        i6 = 376411888;
                        i9 = iM559710 ^ i6;
                        runnable = runnable;
                        i14 = i9;
                        i13 = i5;
                    }
                    iM559711 = C0946.m55979("۟ܺ") ^ i11;
                    i5 = ((iM559711 ^ i12) * 27639) ^ 30803304;
                    i7 = 1528942565;
                    i9 = iM559711 ^ i7;
                    runnable = runnable;
                    sb = null;
                    i14 = i9;
                    i13 = i5;
                    break;
                case -1445477899:
                case -1139884764:
                    AbstractC0942.m55971();
                    break;
                case -1334538686:
                case 511030401:
                    C0882.m55724(runnable);
                    iM55681 = C0873.m55680("ۖܽ") ^ i12;
                    i5 = ((iM55681 ^ i11) * 19979) ^ (-1925062240);
                    i8 = 492077048;
                    i14 = iM55681 ^ i8;
                    i13 = i5;
                    break;
                case -1302356653:
                case 520931917:
                    runnable = runnable;
                    str = strM55579;
                    int i24 = i18 + i19;
                    s = s2;
                    int i25 = s + 16802;
                    if ((i25 * i25) - (i24 + i24) > 0) {
                        iM55680 = (i12 - C0946.m55979("ۤᩳ")) * (-109);
                        i13 = ((iM55680 ^ i11) * (-29699)) ^ (-347496348);
                        i3 = 1025634984;
                    } else {
                        iM55680 = C0873.m55680("ۗۤ") ^ i11;
                        i13 = ((iM55680 ^ i12) * (-16573)) ^ (-948923425);
                        i3 = 919227787;
                    }
                    i4 = iM55680 ^ i3;
                    strM55579 = str;
                    s2 = s;
                    runnable = runnable;
                    i14 = i4;
                    dialogInterfaceOnClickListenerC6380 = this;
                    break;
                case -1246110025:
                case 1536469234:
                    break;
                case -1197487611:
                case 1558840129:
                    runnable = runnable;
                    C1028.m56246(map, AbstractC0942.m55970(sArr2, i15, i16, i17), C20462.m46157());
                    if (C1046.f81962 > 0) {
                        short[] sArr5 = f81964;
                        if (ServiceConnectionC1013.m56157() > 0) {
                            sb = new StringBuilder(C0912.m55822(sArr5, 68, 6, i17));
                            i20 = dialogInterfaceOnClickListenerC6380.f16510;
                            if (C1044.f81959 < 0) {
                                iM559710 = (C0946.m55979("ۙۚ") ^ i11) * (-13);
                                i5 = ((iM559710 ^ i12) * 5653) ^ 1675212653;
                                i6 = 1666641380;
                                i9 = iM559710 ^ i6;
                                runnable = runnable;
                                i14 = i9;
                                i13 = i5;
                            } else {
                                int iM559712 = (C0946.m55979("ܳ۠") ^ i12) * 95;
                                i13 = ((iM559712 ^ i11) * 6143) ^ 822856636;
                                i4 = iM559712 ^ (-532080163);
                                runnable = runnable;
                                i14 = i4;
                                dialogInterfaceOnClickListenerC6380 = this;
                            }
                        } else {
                            iM559711 = C0946.m55979("֨ܽ") ^ i11;
                            i5 = ((iM559711 ^ i12) * 31665) ^ (-1431205259);
                            i7 = -960273094;
                            i9 = iM559711 ^ i7;
                            runnable = runnable;
                            sb = null;
                            i14 = i9;
                            i13 = i5;
                        }
                    } else {
                        iM559711 = C0946.m55979("۟ܺ") ^ i11;
                        i5 = ((iM559711 ^ i12) * 27639) ^ 30803304;
                        i7 = 1528942565;
                        i9 = iM559711 ^ i7;
                        runnable = runnable;
                        sb = null;
                        i14 = i9;
                        i13 = i5;
                    }
                    break;
                case -1093403453:
                case 1943505031:
                    if (!C1024.f81946) {
                        runnable = runnable;
                        int iM559713 = (C0946.m55979("ܳ۠") ^ i12) * 95;
                        i13 = ((iM559713 ^ i11) * 6143) ^ 822856636;
                        i4 = iM559713 ^ (-532080163);
                        runnable = runnable;
                        i14 = i4;
                        dialogInterfaceOnClickListenerC6380 = this;
                    } else {
                        runnable = runnable;
                        iM559710 = C0946.m55979("ۗۧ") ^ i11;
                        i5 = ((iM559710 ^ i12) * 10525) ^ (-443093022);
                        i6 = -1543285934;
                        i9 = iM559710 ^ i6;
                        runnable = runnable;
                        i14 = i9;
                        i13 = i5;
                    }
                    break;
                case -1035637487:
                case -843551827:
                    runnable = runnable;
                    C0898.m55805(map, C0949.m56016(sArr3, 74, 6, i17), strM55639);
                    if (C1124.f82007 >= 0) {
                        iM559710 = C0946.m55979("ۗۧ") ^ i11;
                        i5 = ((iM559710 ^ i12) * 10525) ^ (-443093022);
                        i6 = -1543285934;
                    } else {
                        iM559710 = C0946.m55979("ۧܺ") ^ i11;
                        i5 = ((iM559710 ^ i12) * 10125) ^ 1606238997;
                        i6 = 1837992373;
                    }
                    i9 = iM559710 ^ i6;
                    runnable = runnable;
                    i14 = i9;
                    i13 = i5;
                    break;
                case -969474026:
                case 482509422:
                    strM55707 = AbstractC0942.m55964();
                    str2 = strM55707;
                    iM559710 = (C0946.m55979("֫ܿ") ^ i11) * 55;
                    i5 = ((iM559710 ^ i12) * (-14497)) ^ (-1066620588);
                    i6 = 231549681;
                    i9 = iM559710 ^ i6;
                    runnable = runnable;
                    i14 = i9;
                    i13 = i5;
                    break;
                case -964105030:
                case 1708998741:
                    runnable = runnable;
                    s = s2;
                    str = strM55579;
                    sArr4 = f81964;
                    c = '-';
                    if (C1229.f82066 < 0) {
                        iM55680 = C0873.m55680("ᩳۤ") ^ i12;
                        i13 = ((iM55680 ^ i11) * 27335) ^ (-1299131368);
                        i3 = -1149839744;
                        i4 = iM55680 ^ i3;
                        strM55579 = str;
                        s2 = s;
                        runnable = runnable;
                        i14 = i4;
                        dialogInterfaceOnClickListenerC6380 = this;
                    } else {
                        strM55579 = str;
                        s2 = s;
                        int iM559714 = (C0946.m55979("ܳ۠") ^ i12) * 95;
                        i13 = ((iM559714 ^ i11) * 6143) ^ 822856636;
                        i4 = iM559714 ^ (-532080163);
                        runnable = runnable;
                        i14 = i4;
                        dialogInterfaceOnClickListenerC6380 = this;
                    }
                    break;
                case -914455581:
                case 10345330:
                    break;
                case -729872627:
                case -674625666:
                    runnable = runnable;
                    MobclickAgent.onEvent(applicationM56136, C0906.m55810(f81964, 80, 10, i17), map);
                    iM559710 = (C0873.m55680("᩶ۛ") + i11) * 55;
                    i5 = ((iM559710 ^ i12) * 8669) ^ 1276615941;
                    i6 = -1893913495;
                    i9 = iM559710 ^ i6;
                    runnable = runnable;
                    i14 = i9;
                    i13 = i5;
                    break;
                case -713552373:
                case 1023290748:
                    runnable = runnable;
                    map = new HashMap();
                    strM55579 = C0845.m55579(dialogInterfaceOnClickListenerC6380.f16511);
                    sArr = f81964;
                    if (RunnableC0938.f81886 < 0) {
                        iM559710 = (i11 - C0946.m55979("᩹֫")) * 73;
                        i5 = ((iM559710 ^ i12) * (-9053)) ^ 1349432184;
                        i6 = 1760206471;
                        i9 = iM559710 ^ i6;
                        runnable = runnable;
                        i14 = i9;
                        i13 = i5;
                    } else {
                        int iM559715 = (C0946.m55979("ܳ۠") ^ i12) * 95;
                        i13 = ((iM559715 ^ i11) * 6143) ^ 822856636;
                        i4 = iM559715 ^ (-532080163);
                        runnable = runnable;
                        i14 = i4;
                        dialogInterfaceOnClickListenerC6380 = this;
                    }
                    break;
                case -357420875:
                case 992775785:
                    runnable = runnable;
                    C0898.m55805(map, C0946.m55986(f81964, 52, 8, i17), str2);
                    if (C1404.f82149 < 0) {
                        iM559710 = C0873.m55680("֫ۨ") ^ i12;
                        i5 = ((iM559710 ^ i11) * (-27879)) ^ (-1213669626);
                        i6 = 703029732;
                        i9 = iM559710 ^ i6;
                        runnable = runnable;
                        i14 = i9;
                        i13 = i5;
                    }
                    iM559711 = C0946.m55979("֨ܽ") ^ i11;
                    i5 = ((iM559711 ^ i12) * 31665) ^ (-1431205259);
                    i7 = -960273094;
                    i9 = iM559711 ^ i7;
                    runnable = runnable;
                    sb = null;
                    i14 = i9;
                    i13 = i5;
                    break;
                case -298497802:
                case -276594745:
                    C0955.m56025();
                    iM55681 = (i12 - C0873.m55680("᩻ܰ")) * (-41);
                    i5 = ((iM55681 ^ i11) * 22821) ^ (-147751044);
                    i8 = -1408002252;
                    i14 = iM55681 ^ i8;
                    i13 = i5;
                    break;
                case -128821572:
                case 286773898:
                    ServiceConnectionC1013.m56157();
                    break;
                case 289182104:
                case 1252077020:
                    strM55707 = C0877.m55707(f81964, 51, 1, i17);
                    str2 = strM55707;
                    iM559710 = (C0946.m55979("֫ܿ") ^ i11) * 55;
                    i5 = ((iM559710 ^ i12) * (-14497)) ^ (-1066620588);
                    i6 = 231549681;
                    i9 = iM559710 ^ i6;
                    runnable = runnable;
                    i14 = i9;
                    i13 = i5;
                    break;
                case 673221206:
                case 1868548973:
                    runnable = runnable;
                    String str3 = strM55579;
                    s2 = sArr4[c];
                    i18 = s2 * s2;
                    i19 = 282307204;
                    if (C1053.m56327() >= 0) {
                        strM55579 = str3;
                        int iM559716 = (C0946.m55979("ܳ۠") ^ i12) * 95;
                        i13 = ((iM559716 ^ i11) * 6143) ^ 822856636;
                        i4 = iM559716 ^ (-532080163);
                    } else {
                        int iM55683 = C0873.m55680("ۢ֨") ^ i11;
                        i13 = ((iM55683 ^ i12) * 21295) ^ (-2013735600);
                        i4 = iM55683 ^ 122363261;
                        strM55579 = str3;
                    }
                    runnable = runnable;
                    i14 = i4;
                    dialogInterfaceOnClickListenerC6380 = this;
                    break;
                default:
                    runnable = runnable;
                    strM55579 = strM55579;
                    C0898.m55805(map, RunnableC0938.m55936(sArr, 46, 5, i17), strM55579);
                    if (RunnableC0938.m55924()) {
                        iM55979 = C0873.m55680("۟ۚ") ^ i12;
                        i = ((iM55979 ^ i11) * (-2117)) ^ 237752141;
                        i2 = 303955185;
                    } else {
                        iM55979 = C0946.m55979("ܳۙ") ^ i11;
                        i = ((iM55979 ^ i12) * 29571) ^ (-1180479118);
                        i2 = -4878094;
                    }
                    int i26 = iM55979 ^ i2;
                    strM55579 = strM55579;
                    Runnable runnable4 = runnable;
                    i14 = i26;
                    i13 = i;
                    runnable = runnable4;
                    break;
            }
            return;
        }
    }
}
