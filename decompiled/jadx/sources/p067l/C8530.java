package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.ClipboardManager;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۜۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C14K */
/* JADX INFO: loaded from: classes2.dex */
public class C8530 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۛᩴ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f82027 = {1578, -4930, -4943, -4940, -4947, -4929, -4942, -4932, -4945, -4935, -4944, -4951, -4877, -4930, -4943, -4940, -4947, -4947, -4936, -4945, -4877, -4946, -4936, -4951, -4944, -4951, -4877, -4930, -4943, -4940, -4947, -4947, -4936, -4945, -4877, -4934, -4936, -4951, -4951, -4936, -4955, -4951, -4973, -4942, -4867, -4951, -4936, -4955, -4951, -4867, -4940, -4946, -4867, -4947, -4945, -4942, -4949, -4940, -4935, -4936, -4935, -4877, -4867, -4984, -4946, -4936, -4867, -4880, -4936, -4867, -4951, -4936, -4955, -4951, -4867, -4865, -4951, -4936, -4955, -4951, -4867, -4951, -4942, -4867, -4929, -4936, -4867, -4947, -4932, -4946, -4951, -4936, -4935, -4865, -24747, -19818, -26538, -4905};

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iM55979;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        int iM559710;
        int i4;
        String str3;
        int iM559711;
        int i5;
        int i6;
        int i7;
        int iM55680;
        int i8;
        int i9;
        int iM55681;
        int i10;
        C8530 c8530 = this;
        int i11 = C0949.f81897;
        int i12 = C0877.f81843;
        int iM559712 = C0946.m55979("֡ܰ") ^ i11;
        int i13 = ((iM559712 ^ i12) * (-17117)) ^ 208864257;
        String strM55810 = null;
        short[] sArr = null;
        int i14 = iM559712 ^ (-937924177);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short s = 0;
        short s2 = 0;
        int i18 = 0;
        int i19 = -1051216839;
        short s3 = 0;
        String action = null;
        short[] sArr2 = null;
        ClipboardManager clipboardManager = null;
        String strM55893 = null;
        String strM55592 = null;
        CharSequence text = null;
        String strM56175 = null;
        int i20 = 0;
        while (true) {
            i19 = i14 ^ (i13 & (((i19 ^ i12) * 23071) >> 31));
            switch (i19) {
                case -2102129659:
                case -1948125201:
                    str3 = strM55592;
                    s = s;
                    text = clipboardManager.getText();
                    if (text != null) {
                        iM559711 = (C0873.m55680("ۢ᩻") ^ i11) * (-53);
                        i5 = ((iM559711 ^ i12) * (-15413)) ^ (-554314713);
                        i6 = -1160640043;
                    } else {
                        iM559711 = C0873.m55680("ۡ֫") ^ i11;
                        i5 = ((iM559711 ^ i12) * (-3257)) ^ 1258366385;
                        i6 = 1796866274;
                    }
                    s = s;
                    i14 = iM559711 ^ i6;
                    i13 = i5;
                    strM55592 = str3;
                    break;
                case -2069126487:
                case 284247702:
                    str3 = strM55592;
                    s = s;
                    strM55893 = C0930.m55893(sArr, i17, 3, i16);
                    if (!C0892.m55749()) {
                        strM55592 = str3;
                        iM55680 = C0946.m55979("ᩳۚ") ^ i12;
                        i8 = ((iM55680 ^ i11) * (-12877)) ^ 309130072;
                        i9 = 1849380733;
                        c8530 = this;
                        strM55592 = strM55592;
                        i13 = i8;
                        s = s;
                        i14 = iM55680 ^ i9;
                    } else {
                        iM559711 = C0946.m55979("۟ۙ") ^ i12;
                        i5 = ((iM559711 ^ i11) * (-20447)) ^ (-1991869597);
                        i6 = -2053331975;
                        s = s;
                        i14 = iM559711 ^ i6;
                        i13 = i5;
                        strM55592 = str3;
                    }
                    break;
                case -1726364072:
                case 1562786679:
                    strM55592 = strM55592;
                    s = s;
                    s3 = sArr2[0];
                    s2 = 2;
                    if (C1053.f81965 <= 0) {
                        iM55979 = (i12 - C0873.m55680("ۨ۬")) * 73;
                        i = ((iM55979 ^ i11) * (-2195)) ^ 1713033517;
                        i2 = 1703497994;
                    } else {
                        iM55979 = C0946.m55979("ۗ֡") ^ i12;
                        i = ((iM55979 ^ i11) * 6545) ^ 455049693;
                        i2 = -969520013;
                    }
                    i7 = iM55979 ^ i2;
                    strM55592 = strM55592;
                    i13 = i;
                    s = s;
                    i14 = i7;
                    c8530 = this;
                    break;
                case -1652739016:
                case 1215926212:
                    str = strM55592;
                    i18 = (s3 * s2) + 1;
                    s = 1;
                    if (C0894.m55769() < 0) {
                        int iM55682 = (i12 - C0873.m55680("᩺ܽ")) * (-51);
                        i3 = ((iM55682 ^ i11) * 22199) ^ (-40980099);
                        i14 = iM55682 ^ 1761299027;
                        c8530 = this;
                        strM55592 = str;
                        i13 = i3;
                    } else {
                        int iM559713 = (i11 - C0946.m55979("ۢ֨")) * 89;
                        i14 = iM559713 ^ 727861835;
                        strM55592 = str;
                        i13 = ((iM559713 ^ i12) * (-25537)) ^ (-1237510005);
                        c8530 = this;
                    }
                    break;
                case -1515659669:
                case -421794845:
                    C0949.m56012();
                    strM55592 = strM55592;
                    s = s;
                    iM55680 = C0946.m55979("ᩳ۬") ^ i12;
                    i8 = ((iM55680 ^ i11) * 14301) ^ 2117622520;
                    i9 = 544657369;
                    c8530 = this;
                    strM55592 = strM55592;
                    i13 = i8;
                    s = s;
                    i14 = iM55680 ^ i9;
                    break;
                case -1371869411:
                case 1026128127:
                    C0947.m55997();
                    break;
                case -1307146343:
                case 1676912780:
                    i16 = 60637;
                    iM55680 = (i12 - C0946.m55979("֫ᩳ")) * 123;
                    i8 = ((iM55680 ^ i11) * 359) ^ 140928616;
                    i9 = 1935033501;
                    c8530 = this;
                    strM55592 = strM55592;
                    i13 = i8;
                    s = s;
                    i14 = iM55680 ^ i9;
                    break;
                case -1303620050:
                case 642827112:
                    str2 = strM55592;
                    s = s;
                    c8530.setResultCode(i15);
                    c8530.setResultData("");
                    iM559710 = C0873.m55680("֡᩹") ^ i11;
                    i13 = ((iM559710 ^ i12) * 569) ^ 377288027;
                    i4 = 511289214;
                    i7 = iM559710 ^ i4;
                    s = s;
                    strM55592 = str2;
                    i14 = i7;
                    c8530 = this;
                    break;
                case -1144044064:
                case 1660442751:
                    c8530.setResultCode(i20);
                    short[] sArr3 = f82027;
                    s = s;
                    if (C1012.f81938 < 0) {
                        str2 = strM55592;
                        String strM56189 = C1017.m56189(sArr3, 97, 1, i16);
                        if (!C0947.m55997()) {
                            StringBuilder sb = new StringBuilder(strM56189);
                            C0912.m55825(sb, C0845.m55591(text));
                            c8530.setResultData(C0863.m55639(sb));
                        } else {
                            s = s;
                            str = str2;
                            int iM559714 = (i11 - C0946.m55979("ۢ֨")) * 89;
                            i14 = iM559714 ^ 727861835;
                            strM55592 = str;
                            i13 = ((iM559714 ^ i12) * (-25537)) ^ (-1237510005);
                            c8530 = this;
                        }
                    } else {
                        iM55979 = C0946.m55979("᩻۠") ^ i11;
                        i = ((iM55979 ^ i12) * 20639) ^ (-1500876008);
                        i2 = -890750345;
                        i7 = iM55979 ^ i2;
                        strM55592 = strM55592;
                        i13 = i;
                        s = s;
                        i14 = i7;
                        c8530 = this;
                    }
                    break;
                case -1090064506:
                case 331856136:
                    str3 = strM55592;
                    s = s;
                    clipboardManager.setText(strM56175);
                    c8530.setResultCode(i20);
                    sArr = f82027;
                    i17 = 94;
                    if (C0894.f81854 < 0) {
                        iM559711 = C0946.m55979("᩸۠") ^ i11;
                        i5 = ((iM559711 ^ i12) * (-20657)) ^ (-465642078);
                        i6 = -911937064;
                        s = s;
                        i14 = iM559711 ^ i6;
                        i13 = i5;
                        strM55592 = str3;
                    } else {
                        strM55592 = str3;
                        iM55979 = C0946.m55979("᩻۠") ^ i11;
                        i = ((iM55979 ^ i12) * 20639) ^ (-1500876008);
                        i2 = -890750345;
                        i7 = iM55979 ^ i2;
                        strM55592 = strM55592;
                        i13 = i;
                        s = s;
                        i14 = i7;
                        c8530 = this;
                    }
                    break;
                case -953162848:
                case 1177586064:
                    break;
                case -844934296:
                case -748663288:
                    c8530.setResultCode(i15);
                    c8530.setResultData(RunnableC0871.m55667(f82027, 42, 52, i16));
                    break;
                case -837186943:
                case -399785584:
                    strM55592 = strM55592;
                    s = s;
                    int i21 = s3 + s;
                    if (i18 - (i21 * i21) > 0) {
                        iM55680 = (C0873.m55680("۠ۧ") ^ i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i8 = ((iM55680 ^ i12) * 17709) ^ 98123293;
                        i9 = -1262220336;
                    } else {
                        iM55680 = C0873.m55680("ۜ᩷") ^ i11;
                        i8 = ((iM55680 ^ i12) * 25443) ^ 1498683509;
                        i9 = -1163539535;
                    }
                    c8530 = this;
                    strM55592 = strM55592;
                    i13 = i8;
                    s = s;
                    i14 = iM55680 ^ i9;
                    break;
                case -736414667:
                case 795591997:
                    strM55592 = strM55592;
                    s = s;
                    clipboardManager = (ClipboardManager) RunnableC0897.m55787(context, strM55592);
                    action = intent.getAction();
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0946.m55979("ᩳۚ") ^ i12;
                        i8 = ((iM55680 ^ i11) * (-12877)) ^ 309130072;
                        i9 = 1849380733;
                    } else {
                        iM55680 = C0946.m55979("֫֨") ^ i11;
                        i8 = ((iM55680 ^ i12) * 21895) ^ (-680776749);
                        i9 = -1823265554;
                    }
                    c8530 = this;
                    strM55592 = strM55592;
                    i13 = i8;
                    s = s;
                    i14 = iM55680 ^ i9;
                    break;
                case -660561399:
                case 367994872:
                    str2 = strM55592;
                    s = s;
                    i15 = 0;
                    i20 = -1;
                    if (C0906.m55806(strM55810, action)) {
                        iM559710 = C0946.m55979("ۙ֡") ^ i12;
                        i13 = ((iM559710 ^ i11) * (-9025)) ^ 1949977780;
                        i4 = -1533723111;
                    } else {
                        iM559710 = C0873.m55680("۬ۘ") ^ i11;
                        i13 = ((iM559710 ^ i12) * 1093) ^ 1399877167;
                        i4 = 957755492;
                    }
                    i7 = iM559710 ^ i4;
                    s = s;
                    strM55592 = str2;
                    i14 = i7;
                    c8530 = this;
                    break;
                case -630475124:
                case 1241847189:
                    str2 = strM55592;
                    s = s;
                    strM55810 = C0906.m55810(f82027, 10, 14, i16);
                    if (C1025.f81947 < 0) {
                        iM559710 = (C0946.m55979("ᩳ᩷") + i12) * (-105);
                        i13 = ((iM559710 ^ i11) * 25487) ^ (-272414034);
                        i4 = 2022932766;
                        i7 = iM559710 ^ i4;
                        s = s;
                        strM55592 = str2;
                        i14 = i7;
                        c8530 = this;
                    } else {
                        s = s;
                        str = str2;
                        int iM559715 = (i11 - C0946.m55979("ۢ֨")) * 89;
                        i14 = iM559715 ^ 727861835;
                        strM55592 = str;
                        i13 = ((iM559715 ^ i12) * (-25537)) ^ (-1237510005);
                        c8530 = this;
                    }
                    break;
                case -624521650:
                case 331189652:
                    C1036.m56257();
                    if (C0989.m56095() > 0) {
                        strM55592 = strM55592;
                        s = s;
                        iM55680 = C0946.m55979("ᩳۚ") ^ i12;
                        i8 = ((iM55680 ^ i11) * (-12877)) ^ 309130072;
                        i9 = 1849380733;
                        c8530 = this;
                        strM55592 = strM55592;
                        i13 = i8;
                        s = s;
                        i14 = iM55680 ^ i9;
                    }
                    strM55592 = strM55592;
                    s = s;
                    iM55680 = C0946.m55979("ᩳ۬") ^ i12;
                    i8 = ((iM55680 ^ i11) * 14301) ^ 2117622520;
                    i9 = 544657369;
                    c8530 = this;
                    strM55592 = strM55592;
                    i13 = i8;
                    s = s;
                    i14 = iM55680 ^ i9;
                    break;
                case -532651730:
                case 1842259314:
                    str2 = strM55592;
                    s = s;
                    if (ViewOnClickListenerC0939.m55949(C0937.m55921(f82027, 24, 14, i16), intent.getAction())) {
                        iM559710 = (C0946.m55979("ۗ᩻") ^ i11) * 5;
                        i13 = ((iM559710 ^ i12) * 18031) ^ 1014087987;
                        i4 = -1139023569;
                    } else {
                        iM559710 = C0873.m55680("֡᩹") ^ i11;
                        i13 = ((iM559710 ^ i12) * 569) ^ 377288027;
                        i4 = 511289214;
                    }
                    i7 = iM559710 ^ i4;
                    s = s;
                    strM55592 = str2;
                    i14 = i7;
                    c8530 = this;
                    break;
                case -529043545:
                case 1697340619:
                    if (C1028.f81950 <= 0) {
                        str = strM55592;
                        int iM559716 = (i11 - C0946.m55979("ۢ֨")) * 89;
                        i14 = iM559716 ^ 727861835;
                        strM55592 = str;
                        i13 = ((iM559716 ^ i12) * (-25537)) ^ (-1237510005);
                        c8530 = this;
                    } else {
                        strM55592 = strM55592;
                        s = s;
                        iM55680 = C0946.m55979("ᩳ۬") ^ i12;
                        i8 = ((iM55680 ^ i11) * 14301) ^ 2117622520;
                        i9 = 544657369;
                        c8530 = this;
                        strM55592 = strM55592;
                        i13 = i8;
                        s = s;
                        i14 = iM55680 ^ i9;
                    }
                    break;
                case -238666453:
                case 2096680957:
                    if (C0947.f81895) {
                        s = s;
                        iM55979 = C0946.m55979("᩻۠") ^ i11;
                        i = ((iM55979 ^ i12) * 20639) ^ (-1500876008);
                        i2 = -890750345;
                        i7 = iM55979 ^ i2;
                        strM55592 = strM55592;
                        i13 = i;
                        s = s;
                        i14 = i7;
                        c8530 = this;
                    }
                    str = strM55592;
                    int iM559717 = (i11 - C0946.m55979("ۢ֨")) * 89;
                    i14 = iM559717 ^ 727861835;
                    strM55592 = str;
                    i13 = ((iM559717 ^ i12) * (-25537)) ^ (-1237510005);
                    c8530 = this;
                    break;
                case 44540864:
                case 1541231937:
                    i16 = 53851;
                    iM55680 = (i12 - C0946.m55979("֫ᩳ")) * 123;
                    i8 = ((iM55680 ^ i11) * 359) ^ 140928616;
                    i9 = 1935033501;
                    c8530 = this;
                    strM55592 = strM55592;
                    i13 = i8;
                    s = s;
                    i14 = iM55680 ^ i9;
                    break;
                case 290344998:
                case 1226667291:
                    strM55592 = strM55592;
                    s = s;
                    sArr2 = f82027;
                    if (C0854.f81826 != 0) {
                        iM55979 = C0946.m55979("᩻۠") ^ i11;
                        i = ((iM55979 ^ i12) * 20639) ^ (-1500876008);
                        i2 = -890750345;
                    } else {
                        iM55979 = C0946.m55979("ۙ᩷") ^ i11;
                        i = ((iM55979 ^ i12) * 25379) ^ 103355392;
                        i2 = 1078961344;
                    }
                    i7 = iM55979 ^ i2;
                    strM55592 = strM55592;
                    i13 = i;
                    s = s;
                    i14 = i7;
                    c8530 = this;
                    break;
                case 718994924:
                case 843600693:
                    String str4 = strM55592;
                    short s4 = s;
                    strM56175 = RunnableC1014.m56175(intent, C0898.m55792(f82027, 38, 4, i16));
                    if (strM56175 != null) {
                        iM55681 = (i12 - C0946.m55979("᩷ۚ")) * 81;
                        i3 = ((iM55681 ^ i11) * (-30651)) ^ (-809584702);
                        i10 = 365313010;
                    } else {
                        iM55681 = (C0873.m55680("֡۫") + i12) * (-29);
                        i3 = ((iM55681 ^ i11) * 12179) ^ 750692617;
                        i10 = 760622813;
                    }
                    int i22 = iM55681 ^ i10;
                    s = s4;
                    strM55592 = str4;
                    i14 = i22;
                    i13 = i3;
                    break;
                case 754331178:
                case 1621957909:
                    s = s;
                    strM55592 = C0845.m55592(f82027, 1, 9, i16);
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0946.m55979("ᩳ۬") ^ i12;
                        i8 = ((iM55680 ^ i11) * 14301) ^ 2117622520;
                        i9 = 544657369;
                    } else {
                        iM55680 = (i12 - C0873.m55680("ܽۧ")) * (-51);
                        i8 = ((iM55680 ^ i11) * (-29579)) ^ (-1501795443);
                        i9 = 1920003010;
                    }
                    c8530 = this;
                    strM55592 = strM55592;
                    i13 = i8;
                    s = s;
                    i14 = iM55680 ^ i9;
                    break;
                default:
                    c8530.setResultData(C1044.m56275(C0873.m55680(strM55893) ^ 2125437769));
                    break;
            }
            return;
        }
    }
}
