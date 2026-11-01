package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.p000mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6688 implements Runnable {

    /* JADX INFO: renamed from: ۛ᩶ۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f81972 = {4430, 6632, 4806, 15421, 26976, 26955, 26968, 26904, 26990, 26959, 26962, -807, 3256, -5487, -1399, -4936, -6716, 15992, -2638, 15085, 5642, 7583, 15915};

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String[] f17330;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC19370 f17331;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean[] f17332;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C18107 f17333;

    public /* synthetic */ RunnableC6688(InterfaceC19370 interfaceC19370, C18107 c18107, String[] strArr, boolean[] zArr) {
        int i = -973647044;
        int i2 = AbstractC0942.f81890;
        int i3 = C0912.f81867;
        int iM55979 = C0946.m55979("۠۠") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-13353)) ^ (-519709493);
        int i5 = 1065308673;
        while (true) {
            i = ((((i ^ i3) * (-17717)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2124525429:
                case 1258445909:
                    if (C1046.m56302() != 0) {
                        iM55979 = (C0946.m55979("ܽܺ") ^ i3) * (-97);
                        i4 = ((iM55979 ^ i2) * (-27627)) ^ 243581739;
                        i5 = 2035909376;
                    } else {
                        iM55979 = C0873.m55680("ܰ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-1795)) ^ (-274264114);
                        i5 = 2089747039;
                    }
                    break;
                case -2080511304:
                case 1603144963:
                    C0967.m56074();
                    if (!RunnableC0897.f81856) {
                        iM55979 = (C0873.m55680("ܶ᩹") + i3) * 3;
                        i4 = ((iM55979 ^ i2) * (-4431)) ^ (-837974733);
                        i5 = 1786205637;
                    } else {
                        iM55979 = C0946.m55979("ۤ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 8625) ^ (-314131850);
                        i5 = 2060451832;
                    }
                    break;
                case -1985357362:
                case -1426788648:
                    if (C0967.f81910 >= 0) {
                        iM55979 = (C0873.m55680("ܶ᩹") + i3) * 3;
                        i4 = ((iM55979 ^ i2) * (-4431)) ^ (-837974733);
                        i5 = 1786205637;
                    } else {
                        iM55979 = (C0946.m55979("۟ۢ") + i3) * 57;
                        i4 = ((iM55979 ^ i2) * 30785) ^ (-1100597709);
                        i5 = 1079708669;
                    }
                    break;
                case -1938668253:
                case 820692210:
                    if (C0992.f81922 >= 0) {
                        iM55979 = (C0946.m55979("ܽܺ") ^ i3) * (-97);
                        i4 = ((iM55979 ^ i2) * (-27627)) ^ 243581739;
                        i5 = 2035909376;
                    } else {
                        iM55979 = C0946.m55979("ܳ֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9781)) ^ (-456295315);
                        i5 = 153380437;
                    }
                    break;
                case -1815618942:
                case -70971870:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("ܳ֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9781)) ^ (-456295315);
                        i5 = 153380437;
                    } else {
                        iM55979 = C0873.m55680("ܳ᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 20655) ^ 858465029;
                        i5 = -1813747225;
                    }
                    break;
                case -1679166635:
                case -1592470272:
                    C0845.m55584();
                    C1404.m56468();
                    iM55979 = C0946.m55979("ۤ֫") ^ i2;
                    i4 = ((iM55979 ^ i3) * 8625) ^ (-314131850);
                    i5 = 2060451832;
                    break;
                case -1349017845:
                case 717518712:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0946.m55979("ܳ֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9781)) ^ (-456295315);
                        i5 = 153380437;
                    } else {
                        iM55979 = (C0873.m55680("᩷ܳ") + i3) * (-15);
                        i4 = ((iM55979 ^ i2) * (-18783)) ^ 270699141;
                        i5 = -1407694104;
                    }
                    break;
                case -984735807:
                case 624648298:
                    if (C0927.f81875) {
                        iM55979 = C0946.m55979("ۤ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 8625) ^ (-314131850);
                        i5 = 2060451832;
                    } else {
                        iM55979 = C0873.m55680("ܶ֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25689) ^ 356507459;
                        i5 = -1693654875;
                    }
                    break;
                case -898903731:
                case 1476448898:
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0946.m55979("ܽܺ") ^ i3) * (-97);
                        i4 = ((iM55979 ^ i2) * (-27627)) ^ 243581739;
                        i5 = 2035909376;
                    } else {
                        iM55979 = C0946.m55979("ۗᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27639)) ^ (-1715225245);
                        i5 = -1385205795;
                    }
                    break;
                case -876417458:
                case 1061494925:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("ܳ֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9781)) ^ (-456295315);
                        i5 = 153380437;
                    } else {
                        iM55979 = C0873.m55680("ᩴ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11277) ^ (-798931265);
                        i5 = 2082488189;
                    }
                    break;
                case -703799594:
                case 713656649:
                    if (C0890.m55740()) {
                        iM55979 = (C0946.m55979("֡᩷") ^ i3) * (-121);
                        i4 = ((iM55979 ^ i2) * 2399) ^ 2093678989;
                        i5 = -37630472;
                    } else {
                        iM55979 = (i2 - C0873.m55680("۫ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55979 ^ i3) * 30327) ^ 1363289183;
                        i5 = -288093436;
                    }
                    break;
                case -658055677:
                case -30865251:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0873.m55680("ܶ᩹") + i3) * 3;
                        i4 = ((iM55979 ^ i2) * (-4431)) ^ (-837974733);
                        i5 = 1786205637;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩷᩵")) * (-53);
                        i4 = ((iM55979 ^ i3) * (-31233)) ^ 1169344355;
                        i5 = 1146995074;
                    }
                    break;
                case -112227304:
                case 688309143:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("ܳ֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9781)) ^ (-456295315);
                        i5 = 153380437;
                    } else {
                        iM55979 = (C0873.m55680("ܶ᩹") + i3) * 3;
                        i4 = ((iM55979 ^ i2) * (-4431)) ^ (-837974733);
                        i5 = 1786205637;
                    }
                    break;
                case -81823974:
                case 744860476:
                    RunnableC0871.m55672();
                    throw new RuntimeException();
                case 1775567234:
                case 2134201624:
                    this.f17332 = zArr;
                    this.f17333 = c18107;
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("ۤ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 8625) ^ (-314131850);
                        i5 = 2060451832;
                    } else {
                        iM55979 = C0873.m55680("۬۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25493) ^ 1127649680;
                        i5 = 2087593339;
                    }
                    break;
                default:
                    this.f17331 = interfaceC19370;
                    this.f17330 = strArr;
                    return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        if (p067l.RunnableC1014.f81941 <= 0) goto L15;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        short[] sArr;
        int iM55979;
        int i2;
        int i3;
        int iM55680;
        int i4;
        int i5;
        int iM55681;
        int i6;
        int i7;
        int i8;
        short[] sArr2;
        short[] sArr3;
        boolean[] zArr;
        int iM559710;
        int i9;
        int iM55682;
        int i10;
        int i11;
        int iM559711;
        int i12;
        int i13;
        int i14;
        RunnableC6688 runnableC6688 = this;
        int i15 = C0967.f81910;
        int i16 = C1044.f81959;
        int iM559712 = (i15 - C0946.m55979("ᩴܰ")) * (-13);
        int i17 = ((iM559712 ^ i16) * 30739) ^ (-1967548181);
        String[] strArr = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i18 = iM559712 ^ (-1061471221);
        final boolean[] zArr2 = null;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int iM559713 = 0;
        int i22 = 0;
        short s = 0;
        int i23 = 0;
        boolean z = false;
        char c = 0;
        int iM559714 = 0;
        char c2 = 0;
        int i24 = 1113166628;
        int iM559715 = 0;
        C20671 c20671M55654 = null;
        String strM56156 = null;
        String[] strArr2 = null;
        int i25 = 0;
        while (true) {
            i24 = i18 ^ (i17 & (((i24 ^ i16) * (-22083)) >> 31));
            switch (i24) {
                case -1940554788:
                case 807688505:
                    C0949.m56012();
                    C1046.m56302();
                    break;
                case -1792932511:
                case 1013357348:
                    strArr2[3] = ServiceConnectionC1013.m56156(C0946.m55979(C0955.m56029(sArr7, i21, 3, i22)) ^ 2118719376);
                    strArr = strArr2;
                    i19 = i19;
                    int iM559716 = C0946.m55979("ۗܽ") ^ i16;
                    i12 = ((iM559716 ^ i15) * 24435) ^ (-1998190513);
                    i14 = iM559716 ^ (-126069391);
                    int i26 = iM559713;
                    i18 = i14;
                    i17 = i12;
                    zArr2 = zArr2;
                    sArr5 = sArr5;
                    iM559713 = i26;
                    break;
                case -1789484770:
                case 1881645039:
                    final C18107 c18107 = runnableC6688.f17333;
                    c20671M55654 = C0866.m55654(C1964.m56594(c18107));
                    i = iM559713;
                    final InterfaceC19370 interfaceC19370 = runnableC6688.f17331;
                    if (C1053.f81965 > 0) {
                        i5 = i19;
                        final String[] strArr3 = runnableC6688.f17330;
                        c20671M55654.m46723(strArr, -1, new DialogInterface.OnClickListener() { // from class: l.ܽۡܳ

                            /* JADX INFO: renamed from: ۠ۜۤ, reason: not valid java name and contains not printable characters */
                            private static final short[] f82261 = {9060, -25362, -25363, -25375, -25373, -25362, -25364, -25369, -25354, 5567, -14520, 5788, -7144, -1490, -7745, -6070, 548, 925, -1192, -5106, -373, -25405, -25390, -25397, -25438, -25424, -25420, -25438, -25430, -25402, -25369, -25350, -25438, -25422, -25423, -25414, -25429, -25405, -25390, -25397, -25438, -25424, -25414, -25438, -25430, -25402, -25369, -25350, -25438, -25422, -25423, -25413, -25429, -25405, -25390, -25397, -25438, -25421, -25423, -25438, -25430, -25402, -25369, -25350, -25438, -25422, -25423, -25417, -25429, -25405, -25390, -25397, -25438, -25424, -25421, -25438, -25430, -25402, -25369, -25350, -25438, -25422, -25423, -25417, -25429, -25405, -25390, -25397, -25438, -25424, -25418, -25438, -25430, -25402, -25369, -25350, -25438, -25422, -25423, -25419, -25429, -25370, -25368, -25373, -251, -6267, -409, -12563, -12924, 2950, -15322, -13533, 5311};

                            {
                                int i27 = 31357195;
                                int i28 = C0967.f81910;
                                int i29 = C1046.f81962;
                                int iM55683 = C0873.m55680("ۛ᩸") ^ i28;
                                int i30 = ((iM55683 ^ i29) * (-29321)) ^ (-957931686);
                                int i31 = -1347308080;
                                while (true) {
                                    i27 = ((((i27 ^ i29) * (-22377)) >> 31) & i30) ^ (iM55683 ^ i31);
                                    switch (i27) {
                                        case -1970497954:
                                        case 1964019447:
                                            C0912.m55833();
                                            if (C0890.f81849 != 0) {
                                                iM55683 = C0946.m55979("ۛ۠") ^ i28;
                                                i30 = ((iM55683 ^ i29) * 13531) ^ 335168471;
                                                i31 = -709561149;
                                            } else {
                                                iM55683 = (C0873.m55680("᩷᩸") ^ i29) * 29;
                                                i30 = ((iM55683 ^ i28) * (-18557)) ^ (-338818851);
                                                i31 = -2089813968;
                                            }
                                            break;
                                        case -1312997829:
                                        case -1111596061:
                                            if (RunnableC1014.f81941 <= 0) {
                                                iM55683 = C0873.m55680("ܺۖ") ^ i28;
                                                i30 = ((iM55683 ^ i29) * 25769) ^ (-925017138);
                                                i31 = 884312533;
                                            } else {
                                                iM55683 = (C0873.m55680("ܺ᩻") ^ i29) * (-77);
                                                i30 = ((iM55683 ^ i28) * (-32015)) ^ 1917535421;
                                                i31 = -689313776;
                                            }
                                            break;
                                        case -1212368542:
                                        case 174977594:
                                            if (C0992.f81922 >= 0) {
                                                iM55683 = C0873.m55680("ۙܽ") ^ i28;
                                                i30 = ((iM55683 ^ i29) * (-18113)) ^ (-627957085);
                                                i31 = -1377096321;
                                            } else {
                                                iM55683 = (i28 - C0873.m55680("ۗۢ")) * 15;
                                                i30 = ((iM55683 ^ i29) * (-25835)) ^ (-264491201);
                                                i31 = -123224297;
                                            }
                                            break;
                                        case -1089362083:
                                        case 1879225236:
                                            C1929.m56553();
                                            if (!RunnableC0897.f81856) {
                                                iM55683 = (i29 - C0873.m55680("᩺ۡ")) * (-69);
                                                i30 = ((iM55683 ^ i28) * (-21681)) ^ (-1365213115);
                                                i31 = -375854089;
                                            } else {
                                                iM55683 = (C0873.m55680("᩷᩸") ^ i29) * 29;
                                                i30 = ((iM55683 ^ i28) * (-18557)) ^ (-338818851);
                                                i31 = -2089813968;
                                            }
                                            break;
                                        case -969214014:
                                        case 1881983860:
                                            return;
                                        case -893117425:
                                        case 405214829:
                                            if (C0955.f81898) {
                                                iM55683 = C0873.m55680("ܺۖ") ^ i28;
                                                i30 = ((iM55683 ^ i29) * 25769) ^ (-925017138);
                                                i31 = 884312533;
                                            } else {
                                                iM55683 = (C0873.m55680("ܿܰ") ^ i29) * 41;
                                                i30 = ((iM55683 ^ i28) * 7611) ^ 74745270;
                                                i31 = -882852201;
                                            }
                                            break;
                                        case -733511537:
                                        case -700623312:
                                            if (C0877.f81843 >= 0) {
                                                iM55683 = C0946.m55979("ۛ۠") ^ i28;
                                                i30 = ((iM55683 ^ i29) * 13531) ^ 335168471;
                                                i31 = -709561149;
                                            } else {
                                                iM55683 = (C0873.m55680("ۡᩳ") ^ i29) * (-23);
                                                i30 = ((iM55683 ^ i28) * (-1803)) ^ 1466745860;
                                                i31 = 281140521;
                                            }
                                            break;
                                        case -536228027:
                                        case 642727599:
                                            C0992.m56107();
                                            throw new RuntimeException();
                                        case -515010697:
                                        case 1578166258:
                                            if (C0894.f81854 >= 0) {
                                                iM55683 = (C0873.m55680("᩷᩸") ^ i29) * 29;
                                                i30 = ((iM55683 ^ i28) * (-18557)) ^ (-338818851);
                                                i31 = -2089813968;
                                            } else {
                                                iM55683 = C0873.m55680("ۙܽ") ^ i28;
                                                i30 = ((iM55683 ^ i29) * (-18113)) ^ (-627957085);
                                                i31 = -1377096321;
                                            }
                                            break;
                                        case -373412499:
                                        case 1020992130:
                                            if (C0890.f81849 != 0) {
                                                iM55683 = C0946.m55979("ۛ۠") ^ i28;
                                                i30 = ((iM55683 ^ i29) * 13531) ^ 335168471;
                                                i31 = -709561149;
                                            } else {
                                                iM55683 = (C0946.m55979("ܰۛ") ^ i29) * 3;
                                                i30 = ((iM55683 ^ i28) * (-21725)) ^ 381797256;
                                                i31 = -1243528417;
                                            }
                                            break;
                                        case -217793087:
                                        case 757442929:
                                            if (C0863.m55643()) {
                                                iM55683 = (C0946.m55979("ۧ᩻") ^ i28) * (-33);
                                                i30 = ((iM55683 ^ i29) * 14905) ^ (-1733836512);
                                                i31 = 376106637;
                                            } else {
                                                iM55683 = C0873.m55680("ܺۖ") ^ i28;
                                                i30 = ((iM55683 ^ i29) * 25769) ^ (-925017138);
                                                i31 = 884312533;
                                            }
                                            break;
                                        case 589801012:
                                        case 913321709:
                                            if (RunnableC0897.m55784()) {
                                                iM55683 = C0946.m55979("ۛ۠") ^ i28;
                                                i30 = ((iM55683 ^ i29) * 13531) ^ 335168471;
                                                i31 = -709561149;
                                            } else {
                                                iM55683 = C0873.m55680("ۖܺ") ^ i28;
                                                i30 = ((iM55683 ^ i29) * 16539) ^ (-1591001265);
                                                i31 = -1820130019;
                                            }
                                            break;
                                        case 864550018:
                                        case 899471961:
                                            if (C0955.f81898) {
                                                iM55683 = C0873.m55680("ܺۖ") ^ i28;
                                                i30 = ((iM55683 ^ i29) * 25769) ^ (-925017138);
                                                i31 = 884312533;
                                            } else {
                                                iM55683 = (C0946.m55979("ۡ᩵") + i28) * (-99);
                                                i30 = ((iM55683 ^ i29) * (-31123)) ^ (-2038854379);
                                                i31 = 953361194;
                                            }
                                            break;
                                        case 977647511:
                                        case 1395606378:
                                            if (C0947.m55997()) {
                                                iM55683 = C0946.m55979("ۛ۠") ^ i28;
                                                i30 = ((iM55683 ^ i29) * 13531) ^ 335168471;
                                                i31 = -709561149;
                                            } else {
                                                iM55683 = (C0873.m55680("ۖ᩵") + i29) * 57;
                                                i30 = ((iM55683 ^ i28) * 4257) ^ (-1361321958);
                                                i31 = 1500868716;
                                            }
                                            break;
                                        case 1469445086:
                                        case 2079712557:
                                            C0937.m55918();
                                            iM55683 = C0873.m55680("ۙܽ") ^ i28;
                                            i30 = ((iM55683 ^ i29) * (-18113)) ^ (-627957085);
                                            i31 = -1377096321;
                                            break;
                                        default:
                                            if (C1929.f83011 != 0) {
                                                iM55683 = (i29 - C0873.m55680("᩺ۡ")) * (-69);
                                                i30 = ((iM55683 ^ i28) * (-21681)) ^ (-1365213115);
                                                i31 = -375854089;
                                            } else {
                                                iM55683 = (i28 - C0946.m55979("۟ۢ")) * 65;
                                                i30 = ((iM55683 ^ i29) * 22419) ^ 1244768351;
                                                i31 = 665865179;
                                            }
                                            break;
                                    }
                                }
                            }

                            /* JADX WARN: Code duplicated, block: B:36:0x01b1  */
                            /* JADX WARN: Code duplicated, block: B:44:0x0205 A[PHI: r4 r7 r13
                              0x0205: PHI (r4v7 int) = (r4v4 int), (r4v2 int) binds: [B:43:0x0203, B:9:0x00b4] A[DONT_GENERATE, DONT_INLINE]
                              0x0205: PHI (r7v5 short[]) = (r7v3 short[]), (r7v2 short[]) binds: [B:43:0x0203, B:9:0x00b4] A[DONT_GENERATE, DONT_INLINE]
                              0x0205: PHI (r13v5 int) = (r13v3 int), (r13v2 int) binds: [B:43:0x0203, B:9:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i27) {
                                int iM55683;
                                int i28;
                                int i29;
                                String str;
                                String str2;
                                InterfaceC14100 interfaceC14100;
                                int iM55684;
                                int i30;
                                int i31;
                                int i32;
                                int iM55685;
                                int i33;
                                int iM55686;
                                int i34;
                                String[] strArr4;
                                String[] strArr5;
                                String[] strArr6;
                                int i35;
                                short[] sArr8;
                                String str3;
                                int i36;
                                DialogInterface.OnClickListener onClickListener;
                                Spinner spinner;
                                int iM55687;
                                int i37;
                                int i38;
                                short[] sArr9;
                                Spinner spinner2;
                                String[] strArr7;
                                int i39;
                                DialogInterface.OnClickListener onClickListener2;
                                int iM559717;
                                int[] iArr;
                                int i40;
                                int i41;
                                short[] sArr10;
                                String[] strArr8;
                                int i42;
                                short[] sArr11;
                                int i43;
                                DialogInterface.OnClickListener onClickListener3;
                                String[] strArr9;
                                InterfaceC14100 interfaceC14101;
                                int iM55688;
                                int i44;
                                int i45;
                                short[] sArr12;
                                String[] strArr10;
                                int i46;
                                short[] sArr13;
                                int i47;
                                DialogInterface.OnClickListener onClickListener4;
                                int iM559718;
                                int i48;
                                int i49;
                                String[] strArr11;
                                int i50;
                                int iM55689 = 0;
                                int i51 = -1492681873;
                                int i52 = C0967.f81910;
                                int i53 = C0863.f81833;
                                int iM559719 = (C0946.m55979("᩸᩹") ^ i53) * 29;
                                int i54 = ((iM559719 ^ i52) * (-1205)) ^ 1344445339;
                                int i55 = iM559719 ^ (-495723057);
                                String[] strArr12 = null;
                                String str4 = null;
                                String[] strArr13 = null;
                                final int[] iArr2 = null;
                                C20671 c20671M55888 = null;
                                DialogInterface.OnClickListener onClickListener5 = null;
                                short[] sArr14 = null;
                                short[] sArr15 = null;
                                short[] sArr16 = null;
                                short[] sArr17 = null;
                                int i56 = 0;
                                final C18107 c18108 = null;
                                int iM559720 = 0;
                                int i57 = 0;
                                int i58 = 0;
                                int i59 = 0;
                                int i60 = 0;
                                int i61 = 0;
                                int i62 = 0;
                                int i63 = 0;
                                boolean[] zArr3 = null;
                                Main mainM56560 = null;
                                Spinner spinner3 = null;
                                String str5 = null;
                                InterfaceC14100 interfaceC14102 = null;
                                int i64 = 0;
                                final InterfaceC19370 interfaceC19371 = null;
                                Main mainM56594 = null;
                                View viewM56111 = null;
                                String str6 = null;
                                final int[] iArr3 = null;
                                int i65 = 0;
                                int i66 = 0;
                                String str7 = null;
                                int i67 = 0;
                                while (true) {
                                    i51 = i55 ^ (i54 & (((i51 ^ i52) * 10481) >> 31));
                                    switch (i51) {
                                        case -2075179385:
                                        case 1733336634:
                                            sArr10 = sArr16;
                                            strArr11 = strArr12;
                                            spinner2 = spinner3;
                                            strArr8 = strArr13;
                                            i42 = i65;
                                            i50 = i60;
                                            if (i50 < 5) {
                                                int iM559721 = C0946.m55979("ۖ֨") ^ i52;
                                                i60 = i50;
                                                int i68 = ((iM559721 ^ i53) * 1041) ^ (-1717964522);
                                                i55 = iM559721 ^ 37974229;
                                                strArr13 = strArr8;
                                                sArr16 = sArr10;
                                                spinner3 = spinner2;
                                                int i69 = i42;
                                                strArr12 = strArr11;
                                                i54 = i68;
                                                i65 = i69;
                                            } else {
                                                strArr9 = strArr11;
                                                i60 = i50;
                                                sArr11 = sArr17;
                                                interfaceC14101 = interfaceC14102;
                                                i43 = i61;
                                                onClickListener3 = onClickListener5;
                                                iM55688 = C0946.m55979("ᩴۚ") ^ i53;
                                                i44 = ((iM55688 ^ i52) * 14363) ^ 2142623731;
                                                i45 = 416639391;
                                                i55 = iM55688 ^ i45;
                                                interfaceC14102 = interfaceC14101;
                                                i54 = i44;
                                                onClickListener5 = onClickListener3;
                                                sArr17 = sArr11;
                                                sArr16 = sArr10;
                                                i61 = i43;
                                                i65 = i42;
                                                strArr13 = strArr8;
                                                strArr12 = strArr9;
                                                spinner3 = spinner2;
                                            }
                                            break;
                                        case -2054808084:
                                        case 522613865:
                                            sArr16 = sArr16;
                                            int i70 = i65;
                                            InterfaceC14100 interfaceC14103 = interfaceC14102;
                                            int i71 = i61;
                                            Spinner spinner4 = spinner3;
                                            String[] strArr14 = strArr13;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            onClickListener5 = onClickListener5;
                                            short[] sArr18 = sArr17;
                                            String str8 = str7;
                                            int i72 = i58;
                                            String str9 = str4;
                                            i64 = i64;
                                            str = str9;
                                            String str10 = str5;
                                            i66 = i66;
                                            str2 = str10;
                                            boolean[] zArr4 = zArr2;
                                            String[] strArr15 = strArr3;
                                            zArr3 = zArr4;
                                            if (i27 != 1) {
                                                int iM556810 = (C0873.m55680("᩻ۧ") + i52) * (-27);
                                                i54 = ((iM556810 ^ i53) * 17527) ^ 1505290334;
                                                i55 = iM556810 ^ 1013417114;
                                                i61 = i71;
                                            } else {
                                                int iM559722 = C0946.m55979("۫᩷") ^ i53;
                                                i61 = i71;
                                                i55 = iM559722 ^ (-483222661);
                                                i54 = ((iM559722 ^ i52) * 1637) ^ (-407256583);
                                            }
                                            i58 = i72;
                                            str7 = str8;
                                            i65 = i70;
                                            strArr12 = strArr15;
                                            interfaceC14102 = interfaceC14103;
                                            sArr17 = sArr18;
                                            i57 = 1;
                                            strArr13 = strArr14;
                                            spinner3 = spinner4;
                                            int i73 = i64;
                                            str4 = str;
                                            i64 = i73;
                                            int i74 = i66;
                                            str5 = str2;
                                            i66 = i74;
                                            break;
                                        case -1981325037:
                                        case 368118578:
                                            sArr9 = sArr16;
                                            String[] strArr16 = strArr13;
                                            spinner2 = spinner3;
                                            spinner2.setAdapter((SpinnerAdapter) new C17611(C1929.m56560(c18108), strArr16));
                                            spinner2.setSelection(iArr3[i61]);
                                            spinner2.setOnItemSelectedListener(new C4872(iArr3));
                                            if (C0906.m55809() <= 0) {
                                                strArr7 = strArr16;
                                                i39 = i61;
                                                onClickListener2 = onClickListener5;
                                                iM559717 = C0873.m55680("ۜ۟") ^ i52;
                                                iArr = iArr3;
                                                i40 = ((iM559717 ^ i53) * (-1651)) ^ (-456820570);
                                                i41 = 1189822;
                                                i55 = iM559717 ^ i41;
                                                i54 = i40;
                                                i58 = i58;
                                                iArr3 = iArr;
                                                onClickListener5 = onClickListener2;
                                                sArr16 = sArr9;
                                                i61 = i39;
                                                i57 = i57;
                                                i65 = i65;
                                                sArr17 = sArr17;
                                                strArr12 = strArr12;
                                                strArr13 = strArr7;
                                            } else {
                                                int iM559723 = C0946.m55979("ܶ֡") ^ i52;
                                                i55 = iM559723 ^ (-179296733);
                                                i54 = ((iM559723 ^ i53) * 27473) ^ 457207359;
                                                strArr13 = strArr16;
                                                sArr16 = sArr9;
                                            }
                                            spinner3 = spinner2;
                                            break;
                                        case -1950993303:
                                        case -1744115951:
                                            if (C1964.f83032 <= 0) {
                                                iM55683 = (C0946.m55979("ܳᩳ") + i52) * (-35);
                                                i28 = ((iM55683 ^ i53) * 8187) ^ 905378417;
                                                i29 = -1020275117;
                                                i55 = iM55683 ^ i29;
                                                i54 = i28;
                                            } else {
                                                strArr5 = strArr12;
                                                spinner = spinner3;
                                                strArr6 = strArr13;
                                                i35 = i65;
                                                sArr8 = sArr17;
                                                str3 = str6;
                                                i36 = i61;
                                                onClickListener = onClickListener5;
                                                InterfaceC14100 interfaceC14104 = interfaceC14102;
                                                str7 = str7;
                                                i58 = i58;
                                                i57 = i57;
                                                interfaceC14100 = interfaceC14104;
                                                int iM559724 = C0946.m55979("۠᩺") ^ i53;
                                                i55 = iM559724 ^ (-631507210);
                                                i54 = ((iM559724 ^ i52) * 13509) ^ 1142338981;
                                                sArr16 = sArr16;
                                                onClickListener5 = onClickListener;
                                                i61 = i36;
                                                str6 = str3;
                                                i65 = i35;
                                                sArr17 = sArr8;
                                                strArr12 = strArr5;
                                                strArr13 = strArr6;
                                                spinner3 = spinner;
                                                int i75 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i75;
                                            }
                                            break;
                                        case -1942909140:
                                        case -1006619492:
                                            C0989.m56095();
                                            if (C0898.f81858 <= 0) {
                                                iM55683 = C0946.m55979("ۖۘ") ^ i53;
                                                i28 = ((iM55683 ^ i52) * (-32453)) ^ (-1776351797);
                                                i29 = 781585319;
                                            } else {
                                                iM55683 = C0946.m55979("ۧ۟") ^ i52;
                                                i28 = ((iM55683 ^ i53) * 5049) ^ 810457089;
                                                i29 = 83702360;
                                            }
                                            i55 = iM55683 ^ i29;
                                            i54 = i28;
                                            break;
                                        case -1889982764:
                                        case -389937872:
                                            if (C0930.f81879 > 0) {
                                                sArr16 = sArr16;
                                                strArr12 = strArr12;
                                                spinner3 = spinner3;
                                                strArr13 = strArr13;
                                                sArr14 = sArr14;
                                                i62 = i62;
                                                i65 = i65;
                                                sArr17 = sArr17;
                                                i61 = i61;
                                                onClickListener5 = onClickListener5;
                                                String str11 = str4;
                                                i64 = i64;
                                                str = str11;
                                                String str12 = str5;
                                                i66 = i66;
                                                str2 = str12;
                                                InterfaceC14100 interfaceC14105 = interfaceC14102;
                                                str7 = str7;
                                                i58 = i58;
                                                i57 = i57;
                                                interfaceC14100 = interfaceC14105;
                                                iM55685 = (C0873.m55680("֡֨") ^ i53) * (-123);
                                                i54 = ((iM55685 ^ i52) * 4529) ^ (-825200732);
                                                i33 = -1742086412;
                                                i55 = iM55685 ^ i33;
                                                onClickListener5 = onClickListener5;
                                                sArr17 = sArr17;
                                                sArr16 = sArr16;
                                                sArr14 = sArr14;
                                                i62 = i62;
                                                i61 = i61;
                                                i65 = i65;
                                                strArr13 = strArr13;
                                                strArr12 = strArr12;
                                                spinner3 = spinner3;
                                                int i76 = i64;
                                                str4 = str;
                                                i64 = i76;
                                                int i77 = i66;
                                                str5 = str2;
                                                i66 = i77;
                                                int i78 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i78;
                                            } else {
                                                iM55683 = C0873.m55680("᩺ܿ") ^ i53;
                                                i28 = ((iM55683 ^ i52) * (-2659)) ^ (-727704413);
                                                i29 = 573386022;
                                                i55 = iM55683 ^ i29;
                                                i54 = i28;
                                            }
                                            break;
                                        case -1845416858:
                                        case -1733310915:
                                            sArr16 = sArr16;
                                            sArr17 = sArr17;
                                            int i79 = i57;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            i65 = i65;
                                            i61 = i61;
                                            onClickListener5 = onClickListener5;
                                            interfaceC14100 = interfaceC14102;
                                            i57 = i79;
                                            String str13 = str7;
                                            String str14 = str6;
                                            String str15 = str4;
                                            i64 = i64;
                                            str = str15;
                                            String str16 = str5;
                                            i66 = i66;
                                            str2 = str16;
                                            strArr4 = new String[]{str, str2, C0947.m55993(f82261, 85, 16, i56), str13, str14};
                                            i58 = 26;
                                            if (ServiceConnectionC1013.f81940 < 0) {
                                                int iM556811 = C0873.m55680("۟ۙ") ^ i52;
                                                int i80 = ((iM556811 ^ i53) * 381) ^ 59333820;
                                                i55 = iM556811 ^ (-156728382);
                                                str7 = str13;
                                                str6 = str14;
                                                spinner3 = spinner3;
                                                onClickListener5 = onClickListener5;
                                                sArr17 = sArr17;
                                                i54 = i80;
                                                i61 = i61;
                                                strArr13 = strArr4;
                                                i65 = i65;
                                                sArr16 = sArr16;
                                                strArr12 = strArr12;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i57;
                                                i58 = 26;
                                                int i710 = i64;
                                                str4 = str;
                                                i64 = i710;
                                                int i711 = i66;
                                                str5 = str2;
                                                i66 = i711;
                                            } else {
                                                str7 = str13;
                                                str6 = str14;
                                                sArr14 = sArr14;
                                                i62 = i62;
                                                int iM559725 = (C0946.m55979("ۤ۫") + i53) * 55;
                                                i55 = iM559725 ^ (-1013849606);
                                                i54 = ((iM559725 ^ i52) * (-2721)) ^ (-468063375);
                                                spinner3 = spinner3;
                                                onClickListener5 = onClickListener5;
                                                sArr17 = sArr17;
                                                sArr14 = sArr14;
                                                i62 = i62;
                                                strArr13 = strArr4;
                                                i61 = i61;
                                                i65 = i65;
                                                sArr16 = sArr16;
                                                strArr12 = strArr12;
                                                int i712 = i64;
                                                str4 = str;
                                                i64 = i712;
                                                int i713 = i66;
                                                str5 = str2;
                                                i66 = i713;
                                                int i714 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i714;
                                            }
                                            break;
                                        case -1725225022:
                                        case 851081895:
                                            if (ServiceConnectionC1013.f81940 >= 0) {
                                                iM55683 = (C0946.m55979("ܳᩳ") + i52) * (-35);
                                                i28 = ((iM55683 ^ i53) * 8187) ^ 905378417;
                                                i29 = -1020275117;
                                            } else {
                                                iM55683 = C0873.m55680("᩺ܿ") ^ i53;
                                                i28 = ((iM55683 ^ i52) * (-2659)) ^ (-727704413);
                                                i29 = 573386022;
                                            }
                                            i55 = iM55683 ^ i29;
                                            i54 = i28;
                                            break;
                                        case -1677845816:
                                        case 394049962:
                                            str = str4;
                                            str2 = str5;
                                            interfaceC14100 = interfaceC14102;
                                            iM55686 = C0873.m55680(C0854.m55597(f82261, 9, 3, i56));
                                            i34 = 2099042045;
                                            i59 = iM55686 ^ i34;
                                            iM55685 = C0946.m55979("ܺ᩸") ^ i52;
                                            i54 = ((iM55685 ^ i53) * (-13897)) ^ (-964625184);
                                            i33 = 656183630;
                                            i55 = iM55685 ^ i33;
                                            onClickListener5 = onClickListener5;
                                            sArr17 = sArr17;
                                            sArr16 = sArr16;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i61 = i61;
                                            i65 = i65;
                                            strArr13 = strArr13;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            int i715 = i64;
                                            str4 = str;
                                            i64 = i715;
                                            int i716 = i66;
                                            str5 = str2;
                                            i66 = i716;
                                            int i717 = i57;
                                            i58 = i58;
                                            str7 = str7;
                                            interfaceC14102 = interfaceC14100;
                                            i57 = i717;
                                            break;
                                        case -1654406620:
                                        case -1635148214:
                                            if (C1071.f81975 > 0) {
                                                iM55683 = C0946.m55979("ۖۘ") ^ i53;
                                                i28 = ((iM55683 ^ i52) * (-32453)) ^ (-1776351797);
                                                i29 = 781585319;
                                            } else {
                                                iM55683 = (C0873.m55680("᩸ۨ") + i52) * (-39);
                                                i28 = ((iM55683 ^ i53) * 27235) ^ 1797885598;
                                                i29 = 526261982;
                                            }
                                            i55 = iM55683 ^ i29;
                                            i54 = i28;
                                            break;
                                        case -1506184198:
                                        case 1229051691:
                                            if (C0912.f81867 > 0) {
                                                sArr16 = sArr16;
                                                strArr12 = strArr12;
                                                spinner3 = spinner3;
                                                strArr4 = strArr13;
                                                sArr14 = sArr14;
                                                i62 = i62;
                                                i65 = i65;
                                                sArr17 = sArr17;
                                                i61 = i61;
                                                onClickListener5 = onClickListener5;
                                                String str17 = str4;
                                                i64 = i64;
                                                str = str17;
                                                String str18 = str5;
                                                i66 = i66;
                                                str2 = str18;
                                                InterfaceC14100 interfaceC14106 = interfaceC14102;
                                                str7 = str7;
                                                i58 = i58;
                                                i57 = i57;
                                                interfaceC14100 = interfaceC14106;
                                                int iM559726 = (C0946.m55979("ۤ۫") + i53) * 55;
                                                i55 = iM559726 ^ (-1013849606);
                                                i54 = ((iM559726 ^ i52) * (-2721)) ^ (-468063375);
                                                spinner3 = spinner3;
                                                onClickListener5 = onClickListener5;
                                                sArr17 = sArr17;
                                                sArr14 = sArr14;
                                                i62 = i62;
                                                strArr13 = strArr4;
                                                i61 = i61;
                                                i65 = i65;
                                                sArr16 = sArr16;
                                                strArr12 = strArr12;
                                                int i718 = i64;
                                                str4 = str;
                                                i64 = i718;
                                                int i719 = i66;
                                                str5 = str2;
                                                i66 = i719;
                                                int i7110 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i7110;
                                            } else {
                                                strArr5 = strArr12;
                                                spinner = spinner3;
                                                strArr6 = strArr13;
                                                i35 = i65;
                                                sArr8 = sArr17;
                                                str3 = str6;
                                                i36 = i61;
                                                onClickListener = onClickListener5;
                                                InterfaceC14100 interfaceC14107 = interfaceC14102;
                                                str7 = str7;
                                                i58 = i58;
                                                i57 = i57;
                                                interfaceC14100 = interfaceC14107;
                                                int iM559727 = C0946.m55979("۠᩺") ^ i53;
                                                i55 = iM559727 ^ (-631507210);
                                                i54 = ((iM559727 ^ i52) * 13509) ^ 1142338981;
                                                sArr16 = sArr16;
                                                onClickListener5 = onClickListener;
                                                i61 = i36;
                                                str6 = str3;
                                                i65 = i35;
                                                sArr17 = sArr8;
                                                strArr12 = strArr5;
                                                strArr13 = strArr6;
                                                spinner3 = spinner;
                                                int i720 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i720;
                                            }
                                            break;
                                        case -1429554415:
                                        case -71239360:
                                            sArr16 = sArr16;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            strArr13 = strArr13;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i65 = i65;
                                            sArr17 = sArr17;
                                            i61 = i61;
                                            onClickListener5 = onClickListener5;
                                            String str19 = str4;
                                            i64 = i64;
                                            str = str19;
                                            String str20 = str5;
                                            i66 = i66;
                                            str2 = str20;
                                            InterfaceC14100 interfaceC14108 = interfaceC14102;
                                            str7 = str7;
                                            i58 = i58;
                                            i57 = i57;
                                            interfaceC14100 = interfaceC14108;
                                            viewM56111 = C0992.m56111(mainM56594, iM559720);
                                            iM55689 = C0873.m55680(C1044.m56276(f82261, 18, 3, i56));
                                            if (ServiceConnectionC1013.f81940 >= 0) {
                                                iM55685 = (C0873.m55680("֡֨") ^ i53) * (-123);
                                                i54 = ((iM55685 ^ i52) * 4529) ^ (-825200732);
                                                i33 = -1742086412;
                                            } else {
                                                iM55685 = C0946.m55979("᩵۫") ^ i53;
                                                i54 = ((iM55685 ^ i52) * 10505) ^ (-227154670);
                                                i33 = -136127734;
                                            }
                                            i55 = iM55685 ^ i33;
                                            onClickListener5 = onClickListener5;
                                            sArr17 = sArr17;
                                            sArr16 = sArr16;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i61 = i61;
                                            i65 = i65;
                                            strArr13 = strArr13;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            int i7111 = i64;
                                            str4 = str;
                                            i64 = i7111;
                                            int i7112 = i66;
                                            str5 = str2;
                                            i66 = i7112;
                                            int i7113 = i57;
                                            i58 = i58;
                                            str7 = str7;
                                            interfaceC14102 = interfaceC14100;
                                            i57 = i7113;
                                            break;
                                        case -1427834179:
                                        case 2129922908:
                                            c20671M55888 = C0930.m55888(C1964.m56594(c18108));
                                            C0882.m55725(c20671M55888, viewM56111);
                                            onClickListener5 = new DialogInterface.OnClickListener() { // from class: l.ܶۡܳ
                                                {
                                                    int i81 = -1746149050;
                                                    int i82 = C0930.f81879;
                                                    int i83 = C0912.f81867;
                                                    int iM556812 = C0873.m55680("ܽᩴ") ^ i82;
                                                    int i84 = ((iM556812 ^ i83) * 19105) ^ (-537114);
                                                    int i85 = -1687716987;
                                                    while (true) {
                                                        i81 = ((((i81 ^ i83) * (-30771)) >> 31) & i84) ^ (iM556812 ^ i85);
                                                        switch (i81) {
                                                            case -1976449311:
                                                            case -631382271:
                                                                C1003.m56123();
                                                                if (C1964.m56597() != 0) {
                                                                    iM556812 = (i83 - C0873.m55680("ۧᩳ")) * (-19);
                                                                    i84 = ((iM556812 ^ i82) * 4215) ^ 689312143;
                                                                    i85 = -49851068;
                                                                } else {
                                                                    iM556812 = C0946.m55979("ۗᩴ") ^ i82;
                                                                    i84 = ((iM556812 ^ i83) * (-23289)) ^ (-809411915);
                                                                    i85 = -724333231;
                                                                }
                                                                break;
                                                            case -1495086317:
                                                            case 28354558:
                                                                if (C0947.m55997()) {
                                                                    iM556812 = C0946.m55979("ۗۖ") ^ i83;
                                                                    i84 = ((iM556812 ^ i82) * 32131) ^ 507433047;
                                                                    i85 = -1718100406;
                                                                } else {
                                                                    iM556812 = C0873.m55680("ۚ۟") ^ i82;
                                                                    i84 = ((iM556812 ^ i83) * (-3013)) ^ (-1074995775);
                                                                    i85 = 1455200599;
                                                                }
                                                                break;
                                                            case -1494016074:
                                                            case -93453606:
                                                                C1229.m56410();
                                                                ViewOnClickListenerC0939.m55941();
                                                                throw new RuntimeException();
                                                            case -1292059797:
                                                            case -455886461:
                                                                if (C1048.f81963) {
                                                                    iM556812 = C0873.m55680("ۗ᩸") ^ i83;
                                                                    i84 = ((iM556812 ^ i82) * (-18521)) ^ (-588336517);
                                                                    i85 = -1285063548;
                                                                } else {
                                                                    iM556812 = C0946.m55979("ۗᩴ") ^ i82;
                                                                    i84 = ((iM556812 ^ i83) * (-23289)) ^ (-809411915);
                                                                    i85 = -724333231;
                                                                }
                                                                break;
                                                            case -1246711036:
                                                            case -1124777533:
                                                                if (C1044.f81959 >= 0) {
                                                                    iM556812 = (i83 - C0873.m55680("ۧᩳ")) * (-19);
                                                                    i84 = ((iM556812 ^ i82) * 4215) ^ 689312143;
                                                                    i85 = -49851068;
                                                                } else {
                                                                    iM556812 = (C0873.m55680("᩷ۘ") ^ i83) * (-71);
                                                                    i84 = ((iM556812 ^ i82) * (-22325)) ^ (-42006911);
                                                                    i85 = -2114052218;
                                                                }
                                                                break;
                                                            case -1243946844:
                                                            case 446246551:
                                                                if (C0861.f81831) {
                                                                    iM556812 = C0946.m55979("ܰۡ") ^ i82;
                                                                    i84 = ((iM556812 ^ i83) * 15347) ^ 1365867020;
                                                                    i85 = -184250835;
                                                                } else {
                                                                    iM556812 = (i83 - C0873.m55680("ۧᩳ")) * (-19);
                                                                    i84 = ((iM556812 ^ i82) * 4215) ^ 689312143;
                                                                    i85 = -49851068;
                                                                }
                                                                break;
                                                            case -1088247144:
                                                            case -233541613:
                                                                if (C1048.f81963) {
                                                                    iM556812 = C0873.m55680("᩷֫") ^ i82;
                                                                    i84 = ((iM556812 ^ i83) * (-8375)) ^ (-1862975667);
                                                                    i85 = 362156018;
                                                                } else {
                                                                    iM556812 = (i82 - C0946.m55979("ۧ᩹")) * (-117);
                                                                    i84 = ((iM556812 ^ i83) * (-4721)) ^ 237098463;
                                                                    i85 = -979193343;
                                                                }
                                                                break;
                                                            case -608630166:
                                                            case -508172753:
                                                                if (C0854.m55595() >= 0) {
                                                                    iM556812 = C0946.m55979("ۗᩴ") ^ i82;
                                                                    i84 = ((iM556812 ^ i83) * (-23289)) ^ (-809411915);
                                                                    i85 = -724333231;
                                                                } else {
                                                                    iM556812 = C0873.m55680("ۢܰ") ^ i83;
                                                                    i84 = ((iM556812 ^ i82) * 14691) ^ (-1507753009);
                                                                    i85 = -1310820599;
                                                                }
                                                                break;
                                                            case -545693729:
                                                            case 1790763825:
                                                                return;
                                                            case -307082799:
                                                            case 84203852:
                                                                C1124.m56367();
                                                                C0946.m55980();
                                                                iM556812 = C0946.m55979("ۗᩴ") ^ i82;
                                                                i84 = ((iM556812 ^ i83) * (-23289)) ^ (-809411915);
                                                                i85 = -724333231;
                                                                break;
                                                            case -257078895:
                                                            case 1306550015:
                                                                if (C1036.f81953 >= 0) {
                                                                    iM556812 = (i83 - C0946.m55979("ܳܽ")) * (-17);
                                                                    i84 = ((iM556812 ^ i82) * (-8133)) ^ 1853773402;
                                                                    i85 = 1086936126;
                                                                } else {
                                                                    iM556812 = C0946.m55979("᩸֨") ^ i82;
                                                                    i84 = ((iM556812 ^ i83) * (-20175)) ^ 1249312092;
                                                                    i85 = 1141029111;
                                                                }
                                                                break;
                                                            case -179368048:
                                                            case 283799797:
                                                                if (C1036.f81953 >= 0) {
                                                                    iM556812 = (i83 - C0873.m55680("ۧᩳ")) * (-19);
                                                                    i84 = ((iM556812 ^ i82) * 4215) ^ 689312143;
                                                                    i85 = -49851068;
                                                                } else {
                                                                    iM556812 = (C0946.m55979("ۙᩴ") + i83) * 65;
                                                                    i84 = ((iM556812 ^ i82) * 8703) ^ (-248922390);
                                                                    i85 = -1872980708;
                                                                }
                                                                break;
                                                            case 1063250952:
                                                            case 1757582610:
                                                                C1012.m56134();
                                                                if (C0930.f81879 <= 0) {
                                                                    iM556812 = (i82 - C0946.m55979("ۧ᩹")) * (-117);
                                                                    i84 = ((iM556812 ^ i83) * (-4721)) ^ 237098463;
                                                                    i85 = -979193343;
                                                                } else {
                                                                    iM556812 = C0946.m55979("ۗۖ") ^ i83;
                                                                    i84 = ((iM556812 ^ i82) * 32131) ^ 507433047;
                                                                    i85 = -1718100406;
                                                                }
                                                                break;
                                                            case 1663204154:
                                                            case 1715645613:
                                                                ViewOnClickListenerC0939.m55941();
                                                                if (!C1025.m56230()) {
                                                                    iM556812 = C0946.m55979("ۗۖ") ^ i83;
                                                                    i84 = ((iM556812 ^ i82) * 32131) ^ 507433047;
                                                                    i85 = -1718100406;
                                                                } else {
                                                                    iM556812 = (i83 - C0873.m55680("ۧᩳ")) * (-19);
                                                                    i84 = ((iM556812 ^ i82) * 4215) ^ 689312143;
                                                                    i85 = -49851068;
                                                                }
                                                                break;
                                                            case 1712878040:
                                                            case 2013340644:
                                                                if (C1053.f81965 <= 0) {
                                                                    iM556812 = (i83 - C0946.m55979("ܳܽ")) * (-17);
                                                                    i84 = ((iM556812 ^ i82) * (-8133)) ^ 1853773402;
                                                                    i85 = 1086936126;
                                                                } else {
                                                                    iM556812 = (C0946.m55979("ܺܳ") + i82) * (-105);
                                                                    i84 = ((iM556812 ^ i83) * 10409) ^ 737720178;
                                                                    i85 = 1862711930;
                                                                }
                                                                break;
                                                            default:
                                                                if (C0882.m55710() != 0) {
                                                                    iM556812 = C0946.m55979("ۗۖ") ^ i83;
                                                                    i84 = ((iM556812 ^ i82) * 32131) ^ 507433047;
                                                                    i85 = -1718100406;
                                                                } else {
                                                                    iM556812 = C0946.m55979("ۢ᩵") ^ i83;
                                                                    i84 = ((iM556812 ^ i82) * (-26235)) ^ 1042297488;
                                                                    i85 = 1394623666;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }

                                                /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
                                                /* JADX WARN: Code duplicated, block: B:45:0x0102  */
                                                /* JADX WARN: Code duplicated, block: B:49:0x0134  */
                                                /* JADX WARN: Code duplicated, block: B:53:0x0162 A[PHI: r5 r9
                                                  0x0162: PHI (r5v8 l.ᩴܺܳ) = (r5v4 l.ᩴܺܳ), (r5v7 l.ᩴܺܳ), (r5v4 l.ᩴܺܳ) binds: [B:52:0x0160, B:27:0x006a, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0162: PHI (r9v6 l.ܽۢܳ) = (r9v3 l.ܽۢܳ), (r9v5 l.ܽۢܳ), (r9v3 l.ܽۢܳ) binds: [B:52:0x0160, B:27:0x006a, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface2, int i81) {
                                                    int iM556812;
                                                    int i82;
                                                    final C18107 c18109 = null;
                                                    int i83 = 1997084410;
                                                    int i84 = C1017.f81942;
                                                    int i85 = C0949.f81897;
                                                    int iM559728 = (i85 - C0946.m55979("ۤܶ")) * 63;
                                                    int i86 = ((iM559728 ^ i84) * (-10747)) ^ 1905980113;
                                                    int i87 = 286860926;
                                                    while (true) {
                                                        int i88 = iM559728 ^ i87;
                                                        InterfaceC20295 interfaceC20295 = null;
                                                        while (true) {
                                                            i83 = ((((i83 ^ i84) * (-8011)) >> 31) & i86) ^ i88;
                                                            switch (i83) {
                                                                case -1991703136:
                                                                case 45548488:
                                                                    C0955.m56036(c18109, interfaceC19371, interfaceC20295);
                                                                    break;
                                                                case -1494273917:
                                                                case 1175405389:
                                                                    if (RunnableC0938.f81886 < 0) {
                                                                        iM556812 = C0873.m55680("ܰܳ") ^ i85;
                                                                        i86 = ((iM556812 ^ i84) * 22357) ^ 1216322833;
                                                                        i82 = -146300682;
                                                                        i88 = iM556812 ^ i82;
                                                                    }
                                                                    break;
                                                                case -1341361532:
                                                                case -1021793864:
                                                                    c18109 = c18108;
                                                                    if (C0967.f81910 < 0) {
                                                                        final int[] iArr4 = iArr2;
                                                                        final int[] iArr5 = iArr3;
                                                                        interfaceC20295 = new InterfaceC20295() { // from class: l.᩸ۡܳ
                                                                            {
                                                                                int i89 = 88070236;
                                                                                int i90 = C0989.f81920;
                                                                                int i91 = C1053.f81965;
                                                                                int iM559729 = C0946.m55979("᩸ᩳ") ^ i91;
                                                                                int i92 = ((iM559729 ^ i90) * (-21087)) ^ (-1480269080);
                                                                                int i93 = -628222406;
                                                                                while (true) {
                                                                                    i89 = ((((i89 ^ i90) * 27731) >> 31) & i92) ^ (iM559729 ^ i93);
                                                                                    switch (i89) {
                                                                                        case -2037984965:
                                                                                        case -1393086378:
                                                                                            if (C0892.f81851) {
                                                                                                iM559729 = (i91 - C0946.m55979("᩹ۧ")) * (-39);
                                                                                                i92 = ((iM559729 ^ i90) * (-26901)) ^ 563619463;
                                                                                                i93 = 938798317;
                                                                                            } else {
                                                                                                iM559729 = (C0873.m55680("۟ܿ") + i90) * 77;
                                                                                                i92 = ((iM559729 ^ i91) * (-15629)) ^ 1682105260;
                                                                                                i93 = 38922946;
                                                                                            }
                                                                                            break;
                                                                                        case -1769328490:
                                                                                        case -1573805135:
                                                                                            C1012.m56134();
                                                                                            if (C1003.m56123() != 0) {
                                                                                                iM559729 = (C0873.m55680("۟ܿ") + i90) * 77;
                                                                                                i92 = ((iM559729 ^ i91) * (-15629)) ^ 1682105260;
                                                                                                i93 = 38922946;
                                                                                            } else {
                                                                                                iM559729 = C0946.m55979("᩸ۘ") ^ i91;
                                                                                                i92 = ((iM559729 ^ i90) * (-3237)) ^ 544196944;
                                                                                                i93 = 979838035;
                                                                                            }
                                                                                            break;
                                                                                        case -1621601033:
                                                                                        case 230575817:
                                                                                            if (C0937.f81884) {
                                                                                                iM559729 = (C0873.m55680("ᩳ᩻") + i90) * 21;
                                                                                                i92 = ((iM559729 ^ i91) * 12861) ^ 1318282563;
                                                                                                i93 = 531070851;
                                                                                            } else {
                                                                                                iM559729 = C0946.m55979("᩸ۘ") ^ i91;
                                                                                                i92 = ((iM559729 ^ i90) * (-3237)) ^ 544196944;
                                                                                                i93 = 979838035;
                                                                                            }
                                                                                            break;
                                                                                        case -1566349115:
                                                                                        case -288263703:
                                                                                            if (C1025.f81947 >= 0) {
                                                                                                iM559729 = (C0873.m55680("֡᩻") ^ i91) * (-57);
                                                                                                i92 = ((iM559729 ^ i90) * 4539) ^ (-2089135693);
                                                                                                i93 = 1490130772;
                                                                                            } else {
                                                                                                iM559729 = (i91 - C0946.m55979("۟ܶ")) * (-23);
                                                                                                i92 = ((iM559729 ^ i90) * (-4265)) ^ 1265040561;
                                                                                                i93 = -1330896158;
                                                                                            }
                                                                                            break;
                                                                                        case -1420424822:
                                                                                        case -588306392:
                                                                                            return;
                                                                                        case -1215618040:
                                                                                        case -77581125:
                                                                                            if (C0949.f81897 >= 0) {
                                                                                                iM559729 = C0946.m55979("᩸ۘ") ^ i91;
                                                                                                i92 = ((iM559729 ^ i90) * (-3237)) ^ 544196944;
                                                                                                i93 = 979838035;
                                                                                            } else {
                                                                                                iM559729 = (C0873.m55680("֡ܳ") + i90) * (-51);
                                                                                                i92 = ((iM559729 ^ i91) * (-25505)) ^ 1460305085;
                                                                                                i93 = -1229843070;
                                                                                            }
                                                                                            break;
                                                                                        case -1192889572:
                                                                                        case 964714401:
                                                                                            if (C1404.f82149 >= 0) {
                                                                                                iM559729 = C0946.m55979("᩸ۘ") ^ i91;
                                                                                                i92 = ((iM559729 ^ i90) * (-3237)) ^ 544196944;
                                                                                                i93 = 979838035;
                                                                                            } else {
                                                                                                iM559729 = (C0946.m55979("ܳۙ") + i90) * (-119);
                                                                                                i92 = ((iM559729 ^ i91) * 8693) ^ 870129297;
                                                                                                i93 = 2071955764;
                                                                                            }
                                                                                            break;
                                                                                        case -1175710615:
                                                                                        case 1015226524:
                                                                                            if (RunnableC0871.f81839 < 0) {
                                                                                                iM559729 = C0946.m55979("᩸ۘ") ^ i91;
                                                                                                i92 = ((iM559729 ^ i90) * (-3237)) ^ 544196944;
                                                                                                i93 = 979838035;
                                                                                            } else {
                                                                                                iM559729 = C0873.m55680("۬᩹") ^ i90;
                                                                                                i92 = ((iM559729 ^ i91) * (-11817)) ^ 592587701;
                                                                                                i93 = -100987684;
                                                                                            }
                                                                                            break;
                                                                                        case -675204481:
                                                                                        case 830939495:
                                                                                            if (C0863.m55643()) {
                                                                                                iM559729 = (C0873.m55680("ۨۨ") + i90) * (-91);
                                                                                                i92 = ((iM559729 ^ i91) * 23309) ^ (-1983254654);
                                                                                                i93 = -439491854;
                                                                                            } else {
                                                                                                iM559729 = C0946.m55979("᩸ۘ") ^ i91;
                                                                                                i92 = ((iM559729 ^ i90) * (-3237)) ^ 544196944;
                                                                                                i93 = 979838035;
                                                                                            }
                                                                                            break;
                                                                                        case -658378455:
                                                                                        case 652430397:
                                                                                            if (ServiceConnectionC1013.f81940 >= 0) {
                                                                                                iM559729 = C0946.m55979("᩸ۘ") ^ i91;
                                                                                                i92 = ((iM559729 ^ i90) * (-3237)) ^ 544196944;
                                                                                                i93 = 979838035;
                                                                                            } else {
                                                                                                iM559729 = (i91 - C0946.m55979("᩵᩸")) * (-81);
                                                                                                i92 = ((iM559729 ^ i90) * 4303) ^ (-289512965);
                                                                                                i93 = -1893559457;
                                                                                            }
                                                                                            break;
                                                                                        case -550751062:
                                                                                        case 260058986:
                                                                                            C0967.m56074();
                                                                                            throw new RuntimeException();
                                                                                        case -524269388:
                                                                                        case 791075339:
                                                                                            if (C0863.f81833 <= 0) {
                                                                                                iM559729 = (i91 - C0873.m55680("ܽ۠")) * (-95);
                                                                                                i92 = ((iM559729 ^ i90) * (-6065)) ^ (-196701143);
                                                                                                i93 = 78167187;
                                                                                            } else {
                                                                                                iM559729 = (C0946.m55979("ۨܶ") ^ i90) * 63;
                                                                                                i92 = ((iM559729 ^ i91) * (-27853)) ^ (-1013583664);
                                                                                                i93 = -707182756;
                                                                                            }
                                                                                            break;
                                                                                        case -14872911:
                                                                                        case 1998519857:
                                                                                            if (C1017.f81942 >= 0) {
                                                                                                iM559729 = (i91 - C0873.m55680("ܽ۠")) * (-95);
                                                                                                i92 = ((iM559729 ^ i90) * (-6065)) ^ (-196701143);
                                                                                                i93 = 78167187;
                                                                                            } else {
                                                                                                iM559729 = (C0946.m55979("ܰᩳ") + i91) * (-45);
                                                                                                i92 = ((iM559729 ^ i90) * (-8277)) ^ (-1909831104);
                                                                                                i93 = 391109401;
                                                                                            }
                                                                                            break;
                                                                                        case 215557958:
                                                                                        case 1910413709:
                                                                                            C0890.m55740();
                                                                                            C0845.m55584();
                                                                                            iM559729 = (C0873.m55680("֡᩻") ^ i91) * (-57);
                                                                                            i92 = ((iM559729 ^ i90) * 4539) ^ (-2089135693);
                                                                                            i93 = 1490130772;
                                                                                            break;
                                                                                        case 238564891:
                                                                                        case 1255467790:
                                                                                            C1046.m56302();
                                                                                            if (C1404.f82149 < 0) {
                                                                                                iM559729 = C0873.m55680("۬᩹") ^ i90;
                                                                                                i92 = ((iM559729 ^ i91) * (-11817)) ^ 592587701;
                                                                                                i93 = -100987684;
                                                                                            } else {
                                                                                                iM559729 = (C0873.m55680("֡᩻") ^ i91) * (-57);
                                                                                                i92 = ((iM559729 ^ i90) * 4539) ^ (-2089135693);
                                                                                                i93 = 1490130772;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            if (C1124.f82007 >= 0) {
                                                                                                iM559729 = (i91 - C0873.m55680("ܽ۠")) * (-95);
                                                                                                i92 = ((iM559729 ^ i90) * (-6065)) ^ (-196701143);
                                                                                                i93 = 78167187;
                                                                                            } else {
                                                                                                iM559729 = C0946.m55979("֡ۙ") ^ i91;
                                                                                                i92 = ((iM559729 ^ i90) * (-4381)) ^ 1339956673;
                                                                                                i93 = -325227175;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }

                                                                            @Override // p067l.InterfaceC20295
                                                                            /* JADX INFO: renamed from: ۧ */
                                                                            public final void mo8469(AbstractC17043 abstractC17043) {
                                                                                int i89 = 1963287986;
                                                                                int i90 = C0949.f81897;
                                                                                int i91 = AbstractC0942.f81890;
                                                                                int iM559729 = C0946.m55979("᩻ܿ") ^ i90;
                                                                                int i92 = ((iM559729 ^ i91) * (-27807)) ^ 606269467;
                                                                                int i93 = 1759017451;
                                                                                while (true) {
                                                                                    i89 = ((((i89 ^ i91) * (-29693)) >> 31) & i92) ^ (iM559729 ^ i93);
                                                                                    switch (i89) {
                                                                                        case -2127820175:
                                                                                        case -2010107408:
                                                                                            C1024.m56209();
                                                                                            C1229.m56410();
                                                                                            break;
                                                                                        case -2036731558:
                                                                                        case 1084191273:
                                                                                            if (C1028.f81950 <= 0) {
                                                                                                iM559729 = (i91 - C0946.m55979("᩵۠")) * 53;
                                                                                                i92 = ((iM559729 ^ i90) * 5041) ^ (-1878881800);
                                                                                                i93 = -1155462735;
                                                                                            } else {
                                                                                                iM559729 = C0873.m55680("ܽܶ") ^ i90;
                                                                                                i92 = ((iM559729 ^ i91) * 4189) ^ (-970319074);
                                                                                                i93 = -1339709732;
                                                                                            }
                                                                                            break;
                                                                                        case -1907515970:
                                                                                        case -1652648778:
                                                                                            C1046.m56302();
                                                                                            if (C0912.f81867 > 0) {
                                                                                                iM559729 = (i91 - C0946.m55979("᩵۠")) * 53;
                                                                                                i92 = ((iM559729 ^ i90) * 5041) ^ (-1878881800);
                                                                                                i93 = -1155462735;
                                                                                            } else {
                                                                                                iM559729 = (C0873.m55680("᩵ۤ") ^ i90) * 53;
                                                                                                i92 = ((iM559729 ^ i91) * (-7231)) ^ 1861445375;
                                                                                                i93 = 2140332300;
                                                                                            }
                                                                                            break;
                                                                                        case -1592075708:
                                                                                        case 184064931:
                                                                                            if (C0955.m56025()) {
                                                                                                iM559729 = C0946.m55979("֡ᩴ") ^ i90;
                                                                                                i92 = ((iM559729 ^ i91) * 16503) ^ 845876722;
                                                                                                i93 = 1461442923;
                                                                                            } else {
                                                                                                iM559729 = C0946.m55979("ۚ֫") ^ i91;
                                                                                                i92 = ((iM559729 ^ i90) * 9075) ^ (-751739344);
                                                                                                i93 = -1138383004;
                                                                                            }
                                                                                            break;
                                                                                        case -1316107799:
                                                                                        case 1946295059:
                                                                                            if (C0894.f81854 >= 0) {
                                                                                                iM559729 = (C0873.m55680("ܿᩴ") + i91) * 123;
                                                                                                i92 = ((iM559729 ^ i90) * 32527) ^ (-1740111696);
                                                                                                i93 = -1602493945;
                                                                                            } else {
                                                                                                iM559729 = C0946.m55979("֫᩶") ^ i91;
                                                                                                i92 = ((iM559729 ^ i90) * 4667) ^ 275491528;
                                                                                                i93 = 67767135;
                                                                                            }
                                                                                            break;
                                                                                        case -1300529231:
                                                                                        case 1769196899:
                                                                                            if (C0967.f81910 >= 0) {
                                                                                                iM559729 = (C0873.m55680("᩵ۤ") ^ i90) * 53;
                                                                                                i92 = ((iM559729 ^ i91) * (-7231)) ^ 1861445375;
                                                                                                i93 = 2140332300;
                                                                                            } else {
                                                                                                iM559729 = C0873.m55680("᩺ۨ") ^ i90;
                                                                                                i92 = ((iM559729 ^ i91) * 18857) ^ 2106942372;
                                                                                                i93 = 2018471372;
                                                                                            }
                                                                                            break;
                                                                                        case -748911345:
                                                                                        case 1267037545:
                                                                                            C0861.m55626();
                                                                                            C1964.m56597();
                                                                                            iM559729 = (C0873.m55680("᩵ۤ") ^ i90) * 53;
                                                                                            i92 = ((iM559729 ^ i91) * (-7231)) ^ 1861445375;
                                                                                            i93 = 2140332300;
                                                                                            break;
                                                                                        case -359664906:
                                                                                        case 2045233946:
                                                                                            if (ServiceConnectionC1013.f81940 >= 0) {
                                                                                                iM559729 = (i91 - C0946.m55979("᩵۠")) * 53;
                                                                                                i92 = ((iM559729 ^ i90) * 5041) ^ (-1878881800);
                                                                                                i93 = -1155462735;
                                                                                            } else {
                                                                                                iM559729 = (i91 - C0873.m55680("ۙ᩺")) * (-3);
                                                                                                i92 = ((iM559729 ^ i90) * (-29157)) ^ 931119340;
                                                                                                i93 = -309858472;
                                                                                            }
                                                                                            break;
                                                                                        case -204091014:
                                                                                        case 293925602:
                                                                                            if (!C0917.f81868) {
                                                                                                C18107 c181010 = c18109;
                                                                                                if (C1929.f83011 == 0) {
                                                                                                    int[] iArr6 = iArr4;
                                                                                                    int[] iArr7 = iArr5;
                                                                                                    if (C0866.f81837 < 0) {
                                                                                                        C0890.m55729(new C13394(abstractC17043, c181010, iArr6, iArr7));
                                                                                                    }
                                                                                                } else {
                                                                                                    iM559729 = (C0873.m55680("ܿᩴ") + i91) * 123;
                                                                                                    i92 = ((iM559729 ^ i90) * 32527) ^ (-1740111696);
                                                                                                    i93 = -1602493945;
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            iM559729 = (i91 - C0946.m55979("᩵۠")) * 53;
                                                                                            i92 = ((iM559729 ^ i90) * 5041) ^ (-1878881800);
                                                                                            i93 = -1155462735;
                                                                                            break;
                                                                                        case -69999766:
                                                                                        case 837431489:
                                                                                            if (C1229.m56410() != 0) {
                                                                                                iM559729 = (C0873.m55680("ܿᩴ") + i91) * 123;
                                                                                                i92 = ((iM559729 ^ i90) * 32527) ^ (-1740111696);
                                                                                                i93 = -1602493945;
                                                                                            } else {
                                                                                                iM559729 = (i91 - C0946.m55979("ۙ᩶")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                                                i92 = ((iM559729 ^ i90) * (-12901)) ^ 360127547;
                                                                                                i93 = 488606500;
                                                                                            }
                                                                                            break;
                                                                                        case 68187407:
                                                                                        case 994581517:
                                                                                            C0894.m55769();
                                                                                            if (C1071.f81975 <= 0) {
                                                                                                iM559729 = (i91 - C0946.m55979("᩵۠")) * 53;
                                                                                                i92 = ((iM559729 ^ i90) * 5041) ^ (-1878881800);
                                                                                                i93 = -1155462735;
                                                                                            } else {
                                                                                                iM559729 = C0946.m55979("ۤܰ") ^ i90;
                                                                                                i92 = ((iM559729 ^ i91) * 1573) ^ (-755242960);
                                                                                                i93 = -1775947050;
                                                                                            }
                                                                                            break;
                                                                                        case 557861409:
                                                                                        case 1332961852:
                                                                                            C1048.m56305();
                                                                                            if (C0906.m55809() <= 0) {
                                                                                                iM559729 = C0946.m55979("֡ᩴ") ^ i90;
                                                                                                i92 = ((iM559729 ^ i91) * 16503) ^ 845876722;
                                                                                                i93 = 1461442923;
                                                                                            } else {
                                                                                                iM559729 = (i91 - C0946.m55979("᩵۠")) * 53;
                                                                                                i92 = ((iM559729 ^ i90) * 5041) ^ (-1878881800);
                                                                                                i93 = -1155462735;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            if (C0894.f81854 >= 0) {
                                                                                                iM559729 = (C0873.m55680("᩵ۤ") ^ i90) * 53;
                                                                                                i92 = ((iM559729 ^ i91) * (-7231)) ^ 1861445375;
                                                                                                i93 = 2140332300;
                                                                                            } else {
                                                                                                iM559729 = (C0946.m55979("ܽ᩷") ^ i90) * 79;
                                                                                                i92 = ((iM559729 ^ i91) * (-20549)) ^ 1082095478;
                                                                                                i93 = -360885074;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                            }
                                                                        };
                                                                        if (C1025.f81947 >= 0) {
                                                                            iM556812 = C0873.m55680("ۨܽ") ^ i84;
                                                                            i86 = ((iM556812 ^ i85) * (-12633)) ^ 409664974;
                                                                            i82 = -1748609971;
                                                                        } else {
                                                                            iM556812 = C0873.m55680("ܰۖ") ^ i84;
                                                                            i86 = ((iM556812 ^ i85) * 21263) ^ (-1342606658);
                                                                            i82 = -753997276;
                                                                        }
                                                                        i88 = iM556812 ^ i82;
                                                                    }
                                                                    break;
                                                                case -1275871326:
                                                                case 768044027:
                                                                    if (RunnableC0871.f81839 >= 0) {
                                                                        iM556812 = C0946.m55979("ᩳۧ") ^ i85;
                                                                        i86 = ((iM556812 ^ i84) * (-12569)) ^ (-1352304968);
                                                                        i82 = -192008531;
                                                                    } else {
                                                                        iM556812 = (C0946.m55979("ۘܽ") + i85) * 59;
                                                                        i86 = ((iM556812 ^ i84) * (-26219)) ^ (-737550478);
                                                                        i82 = -389889560;
                                                                    }
                                                                    i88 = iM556812 ^ i82;
                                                                    break;
                                                                case -1155931011:
                                                                case 1829700562:
                                                                    if (AbstractC0942.f81890 > 0) {
                                                                        iM556812 = C0873.m55680("ۖۘ") ^ i85;
                                                                        i86 = ((iM556812 ^ i84) * 6003) ^ (-1153745637);
                                                                        i82 = -412186478;
                                                                        i88 = iM556812 ^ i82;
                                                                    }
                                                                    break;
                                                                case -935201435:
                                                                case -629823867:
                                                                    if (C1028.f81950 > 0) {
                                                                        iM556812 = (C0946.m55979("ۘܽ") + i85) * 59;
                                                                        i86 = ((iM556812 ^ i84) * (-26219)) ^ (-737550478);
                                                                        i82 = -389889560;
                                                                    } else {
                                                                        iM556812 = (C0873.m55680("᩷ۡ") + i85) * 89;
                                                                        i86 = ((iM556812 ^ i84) * (-18199)) ^ (-1006072301);
                                                                        i82 = 600173138;
                                                                    }
                                                                    i88 = iM556812 ^ i82;
                                                                    break;
                                                                case -348135052:
                                                                case 170811542:
                                                                    if (C0992.f81922 >= 0) {
                                                                        iM556812 = (C0946.m55979("ۘܽ") + i85) * 59;
                                                                        i86 = ((iM556812 ^ i84) * (-26219)) ^ (-737550478);
                                                                        i82 = -389889560;
                                                                    } else {
                                                                        iM556812 = (C0873.m55680("᩵ۖ") ^ i84) * (-63);
                                                                        i86 = ((iM556812 ^ i85) * (-1509)) ^ 694292465;
                                                                        i82 = -977054712;
                                                                    }
                                                                    i88 = iM556812 ^ i82;
                                                                    break;
                                                                case -216996540:
                                                                case 1603780928:
                                                                    if (C1044.f81959 >= 0) {
                                                                        iM556812 = (C0873.m55680("᩷ۡ") + i85) * 89;
                                                                        i86 = ((iM556812 ^ i84) * (-18199)) ^ (-1006072301);
                                                                        i82 = 600173138;
                                                                    } else {
                                                                        iM556812 = (C0873.m55680("֡۫") + i85) * (-49);
                                                                        i86 = ((iM556812 ^ i84) * (-12181)) ^ 986762460;
                                                                        i82 = -1921805820;
                                                                    }
                                                                    i88 = iM556812 ^ i82;
                                                                    break;
                                                                case -1696543:
                                                                case 826742124:
                                                                    if (C1025.f81947 >= 0) {
                                                                        iM556812 = C0946.m55979("ᩳۧ") ^ i85;
                                                                        i86 = ((iM556812 ^ i84) * (-12569)) ^ (-1352304968);
                                                                        i82 = -192008531;
                                                                    } else {
                                                                        iM556812 = C0873.m55680("ۨܽ") ^ i84;
                                                                        i86 = ((iM556812 ^ i85) * (-12633)) ^ 409664974;
                                                                        i82 = -1748609971;
                                                                    }
                                                                    i88 = iM556812 ^ i82;
                                                                    break;
                                                                case 27835719:
                                                                case 1043914358:
                                                                    if (C0946.m55980() != 0) {
                                                                        iM556812 = C0873.m55680("ۨܽ") ^ i84;
                                                                        i86 = ((iM556812 ^ i85) * (-12633)) ^ 409664974;
                                                                        i82 = -1748609971;
                                                                    } else {
                                                                        iM556812 = (i84 - C0946.m55979("᩸ܶ")) * (-59);
                                                                        i86 = ((iM556812 ^ i85) * (-16965)) ^ (-868136826);
                                                                        i82 = -1900444375;
                                                                    }
                                                                    i88 = iM556812 ^ i82;
                                                                    break;
                                                                case 315707757:
                                                                case 631335573:
                                                                    if (C1036.m56257() <= 0) {
                                                                        iM556812 = C0946.m55979("ᩳۧ") ^ i85;
                                                                        i86 = ((iM556812 ^ i84) * (-12569)) ^ (-1352304968);
                                                                        i82 = -192008531;
                                                                    } else {
                                                                        iM556812 = (C0946.m55979("ۗۙ") ^ i84) * 59;
                                                                        i86 = ((iM556812 ^ i85) * 10153) ^ 422619722;
                                                                        i82 = -1497063940;
                                                                    }
                                                                    i88 = iM556812 ^ i82;
                                                                    break;
                                                                case 769366111:
                                                                case 1402626799:
                                                                    C1194.m56396();
                                                                    C1017.m56187();
                                                                    break;
                                                                case 772917971:
                                                                case 891481113:
                                                                    if (RunnableC0871.m55672() >= 0) {
                                                                        iM556812 = (C0873.m55680("᩷ۡ") + i85) * 89;
                                                                        i86 = ((iM556812 ^ i84) * (-18199)) ^ (-1006072301);
                                                                        i82 = 600173138;
                                                                    } else {
                                                                        iM556812 = (i84 - C0946.m55979("ۜܿ")) * 11;
                                                                        i86 = ((iM556812 ^ i85) * 13667) ^ (-1854951481);
                                                                        i82 = 2070797057;
                                                                    }
                                                                    i88 = iM556812 ^ i82;
                                                                    break;
                                                                case 1182762322:
                                                                case 1306908339:
                                                                    C0927.m55873();
                                                                    C1929.m56553();
                                                                    iM556812 = C0946.m55979("ᩳۧ") ^ i85;
                                                                    i86 = ((iM556812 ^ i84) * (-12569)) ^ (-1352304968);
                                                                    i82 = -192008531;
                                                                    i88 = iM556812 ^ i82;
                                                                    break;
                                                                default:
                                                                    if (C0949.f81897 >= 0) {
                                                                        iM556812 = (C0873.m55680("᩷ۡ") + i85) * 89;
                                                                        i86 = ((iM556812 ^ i84) * (-18199)) ^ (-1006072301);
                                                                        i82 = 600173138;
                                                                    } else {
                                                                        iM556812 = C0873.m55680("ۧ᩶") ^ i85;
                                                                        i86 = ((iM556812 ^ i84) * 23063) ^ (-1980709511);
                                                                        i82 = 441374193;
                                                                    }
                                                                    i88 = iM556812 ^ i82;
                                                                    break;
                                                            }
                                                            return;
                                                        }
                                                        iM559728 = (C0873.m55680("᩵᩹") + i84) * (-57);
                                                        i86 = ((iM559728 ^ i85) * 29105) ^ (-285251068);
                                                        i87 = -1753585785;
                                                    }
                                                }
                                            };
                                            sArr16 = f82261;
                                            i66 = IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i64 = 3;
                                            if (C0854.m55595() < 0) {
                                                iM55683 = (C0873.m55680("֡ۡ") + i53) * (-113);
                                                i28 = ((iM55683 ^ i52) * (-22597)) ^ (-889379873);
                                                i29 = -457886732;
                                                i55 = iM55683 ^ i29;
                                                i54 = i28;
                                            } else {
                                                strArr5 = strArr12;
                                                spinner = spinner3;
                                                strArr6 = strArr13;
                                                i35 = i65;
                                                sArr8 = sArr17;
                                                str3 = str6;
                                                i36 = i61;
                                                onClickListener = onClickListener5;
                                                InterfaceC14100 interfaceC14109 = interfaceC14102;
                                                str7 = str7;
                                                i58 = i58;
                                                i57 = i57;
                                                interfaceC14100 = interfaceC14109;
                                                int iM559728 = C0946.m55979("۠᩺") ^ i53;
                                                i55 = iM559728 ^ (-631507210);
                                                i54 = ((iM559728 ^ i52) * 13509) ^ 1142338981;
                                                sArr16 = sArr16;
                                                onClickListener5 = onClickListener;
                                                i61 = i36;
                                                str6 = str3;
                                                i65 = i35;
                                                sArr17 = sArr8;
                                                strArr12 = strArr5;
                                                strArr13 = strArr6;
                                                spinner3 = spinner;
                                                int i721 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i721;
                                            }
                                            break;
                                        case -1397185692:
                                        case 1447163705:
                                            mainM56560.m12253(C0946.m55979(C1929.m56558(f82261, IShizukuService.Stub.TRANSACTION_isHidden, 3, i56)) ^ 2123820275, i59, (boolean) i61);
                                            break;
                                        case -1359263361:
                                        case 1339927071:
                                            short[] sArr19 = sArr16;
                                            int i81 = i58;
                                            String[] strArr17 = strArr12;
                                            Spinner spinner5 = spinner3;
                                            String[] strArr18 = strArr13;
                                            short[] sArr20 = sArr14;
                                            int i82 = i62;
                                            int i83 = i65;
                                            short[] sArr21 = sArr17;
                                            int i84 = i57;
                                            InterfaceC14100 interfaceC141010 = interfaceC14102;
                                            int i85 = i61;
                                            int i86 = i63;
                                            DialogInterface.OnClickListener onClickListener6 = onClickListener5;
                                            String str21 = str4;
                                            i64 = i64;
                                            str = str21;
                                            String str22 = str5;
                                            i66 = i66;
                                            str2 = str22;
                                            String strM55792 = C0898.m55792(sArr20, i82, i86, i56);
                                            String strM56336 = C1071.m56336(f82261, 37, 16, i56);
                                            sArr15 = f82261;
                                            if (C1229.f82066 >= 0) {
                                                iM55687 = C0873.m55680("᩻᩸") ^ i52;
                                                i37 = ((iM55687 ^ i53) * (-17349)) ^ (-961628568);
                                                i38 = 1336390549;
                                            } else {
                                                iM55687 = C0873.m55680("ۙ᩹") ^ i52;
                                                i37 = ((iM55687 ^ i53) * 15855) ^ 1212940935;
                                                i38 = 1930490679;
                                            }
                                            i55 = iM55687 ^ i38;
                                            i54 = i37;
                                            i63 = i86;
                                            onClickListener5 = onClickListener6;
                                            sArr17 = sArr21;
                                            sArr14 = sArr20;
                                            i62 = i82;
                                            i61 = i85;
                                            interfaceC14102 = interfaceC141010;
                                            i57 = i84;
                                            i65 = i83;
                                            strArr13 = strArr18;
                                            strArr12 = strArr17;
                                            spinner3 = spinner5;
                                            i58 = i81;
                                            str7 = strM55792;
                                            str6 = strM56336;
                                            sArr16 = sArr19;
                                            int i7114 = i64;
                                            str4 = str;
                                            i64 = i7114;
                                            int i7115 = i66;
                                            str5 = str2;
                                            i66 = i7115;
                                            break;
                                        case -1339039313:
                                        case -639860675:
                                            C0955.m56036(c18108, interfaceC19371, new C4677(c18108, strArr12));
                                            break;
                                        case -1224956690:
                                        case -1132961496:
                                            str = str4;
                                            str2 = str5;
                                            interfaceC14100 = interfaceC14102;
                                            iM55686 = C0873.m55680(C0894.m55773(f82261, 12, 3, i56));
                                            i34 = 2126750950;
                                            i59 = iM55686 ^ i34;
                                            iM55685 = C0946.m55979("ܺ᩸") ^ i52;
                                            i54 = ((iM55685 ^ i53) * (-13897)) ^ (-964625184);
                                            i33 = 656183630;
                                            i55 = iM55685 ^ i33;
                                            onClickListener5 = onClickListener5;
                                            sArr17 = sArr17;
                                            sArr16 = sArr16;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i61 = i61;
                                            i65 = i65;
                                            strArr13 = strArr13;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            int i7116 = i64;
                                            str4 = str;
                                            i64 = i7116;
                                            int i7117 = i66;
                                            str5 = str2;
                                            i66 = i7117;
                                            int i7118 = i57;
                                            i58 = i58;
                                            str7 = str7;
                                            interfaceC14102 = interfaceC14100;
                                            i57 = i7118;
                                            break;
                                        case -1166932700:
                                        case 1445271169:
                                            sArr16 = sArr16;
                                            strArr12 = strArr12;
                                            i61 = i61;
                                            spinner3 = spinner3;
                                            strArr13 = strArr13;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i65 = i65;
                                            onClickListener5 = onClickListener5;
                                            sArr17 = sArr17;
                                            String str23 = str4;
                                            i64 = i64;
                                            str = str23;
                                            String str24 = str5;
                                            i66 = i66;
                                            str2 = str24;
                                            InterfaceC14100 interfaceC141011 = interfaceC14102;
                                            str7 = str7;
                                            i58 = i58;
                                            i57 = i57;
                                            interfaceC14100 = interfaceC141011;
                                            interfaceC19371 = interfaceC19370;
                                            if (i27 != 0) {
                                                iM55684 = (C0946.m55979("ۚ۟") ^ i52) * (-81);
                                                i30 = ((iM55684 ^ i53) * 6359) ^ 528017719;
                                                i31 = 1418979955;
                                            } else {
                                                iM55684 = (C0873.m55680("۟ۡ") ^ i52) * (-79);
                                                i30 = ((iM55684 ^ i53) * 17165) ^ 626135971;
                                                i31 = 318345807;
                                            }
                                            int i87 = iM55684 ^ i31;
                                            onClickListener5 = onClickListener5;
                                            sArr17 = sArr17;
                                            sArr16 = sArr16;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i61 = i61;
                                            i55 = i87;
                                            i54 = i30;
                                            i65 = i65;
                                            strArr13 = strArr13;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            int i7119 = i64;
                                            str4 = str;
                                            i64 = i7119;
                                            int i71110 = i66;
                                            str5 = str2;
                                            i66 = i71110;
                                            int i71111 = i57;
                                            i58 = i58;
                                            str7 = str7;
                                            interfaceC14102 = interfaceC14100;
                                            i57 = i71111;
                                            break;
                                        case -1080329279:
                                        case 1184210558:
                                            break;
                                        case -1072871212:
                                        case -407997178:
                                            sArr16 = sArr16;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            strArr13 = strArr13;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i65 = i65;
                                            sArr17 = sArr17;
                                            i61 = i61;
                                            onClickListener5 = onClickListener5;
                                            String str25 = str4;
                                            i64 = i64;
                                            str = str25;
                                            String str26 = str5;
                                            i66 = i66;
                                            str2 = str26;
                                            InterfaceC14100 interfaceC141012 = interfaceC14102;
                                            str7 = str7;
                                            i58 = i58;
                                            i57 = i57;
                                            interfaceC14100 = interfaceC141012;
                                            boolean zM55790 = C0898.m55790(c18108, RunnableC0871.m55667(f82261, 6, 3, i56));
                                            mainM56560 = C1929.m56560(c18108);
                                            if (zM55790) {
                                                iM55685 = C0873.m55680("ᩴܰ") ^ i52;
                                                i54 = ((iM55685 ^ i53) * (-5375)) ^ 1112594095;
                                                i33 = 937398848;
                                            } else {
                                                iM55685 = (C0873.m55680("ܳ۫") ^ i53) * 27;
                                                i54 = ((iM55685 ^ i52) * 7607) ^ (-480484877);
                                                i33 = -1213804535;
                                            }
                                            i55 = iM55685 ^ i33;
                                            onClickListener5 = onClickListener5;
                                            sArr17 = sArr17;
                                            sArr16 = sArr16;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i61 = i61;
                                            i65 = i65;
                                            strArr13 = strArr13;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            int i71112 = i64;
                                            str4 = str;
                                            i64 = i71112;
                                            int i71113 = i66;
                                            str5 = str2;
                                            i66 = i71113;
                                            int i71114 = i57;
                                            i58 = i58;
                                            str7 = str7;
                                            interfaceC14102 = interfaceC14100;
                                            i57 = i71114;
                                            break;
                                        case -1028882369:
                                        case -122366557:
                                            short[] sArr22 = sArr16;
                                            int i88 = i64;
                                            int i89 = i66;
                                            String str27 = str7;
                                            i58 = i58;
                                            strArr5 = strArr12;
                                            spinner = spinner3;
                                            strArr6 = strArr13;
                                            i35 = i65;
                                            sArr8 = sArr17;
                                            str3 = str6;
                                            i57 = i57;
                                            interfaceC14100 = interfaceC14102;
                                            i36 = i61;
                                            onClickListener = onClickListener5;
                                            short[] sArr23 = sArr15;
                                            String strM56337 = C1071.m56336(sArr23, 53, 16, i56);
                                            str7 = str27;
                                            String strM55783 = RunnableC0897.m55783(f82261, 69, 16, i56);
                                            if (C1025.m56230()) {
                                                sArr15 = sArr23;
                                                i64 = i88;
                                                i66 = i89;
                                                str4 = strM56337;
                                                str5 = strM55783;
                                                sArr16 = sArr22;
                                                int iM559729 = C0946.m55979("۠᩺") ^ i53;
                                                i55 = iM559729 ^ (-631507210);
                                                i54 = ((iM559729 ^ i52) * 13509) ^ 1142338981;
                                                sArr16 = sArr16;
                                                onClickListener5 = onClickListener;
                                                i61 = i36;
                                                str6 = str3;
                                                i65 = i35;
                                                sArr17 = sArr8;
                                            } else {
                                                int iM559730 = (C0946.m55979("֫᩻") + i53) * (-121);
                                                i55 = iM559730 ^ (-1435701327);
                                                i54 = ((iM559730 ^ i52) * 12677) ^ (-402004908);
                                                sArr15 = sArr23;
                                                i64 = i88;
                                                i66 = i89;
                                                str4 = strM56337;
                                                onClickListener5 = onClickListener;
                                                str5 = strM55783;
                                                i61 = i36;
                                                str6 = str3;
                                                i65 = i35;
                                                sArr17 = sArr8;
                                                sArr16 = sArr22;
                                            }
                                            strArr12 = strArr5;
                                            strArr13 = strArr6;
                                            spinner3 = spinner;
                                            int i722 = i57;
                                            i58 = i58;
                                            str7 = str7;
                                            interfaceC14102 = interfaceC14100;
                                            i57 = i722;
                                            break;
                                        case -1028629907:
                                        case -97226621:
                                            C0873.m55678();
                                            break;
                                        case -1023940452:
                                        case 446919839:
                                            sArr12 = sArr16;
                                            strArr10 = strArr12;
                                            spinner2 = spinner3;
                                            strArr7 = strArr13;
                                            i46 = i65;
                                            sArr13 = sArr17;
                                            i47 = i61;
                                            onClickListener4 = onClickListener5;
                                            if (zArr3[i47]) {
                                                iM559718 = (C0946.m55979("֨ۙ") + i53) * 39;
                                                i48 = ((iM559718 ^ i52) * (-32165)) ^ 2112117564;
                                                i49 = -545471783;
                                            } else {
                                                iM559718 = (i52 - C0946.m55979("ܺܿ")) * (-109);
                                                i48 = ((iM559718 ^ i53) * 13153) ^ 402045859;
                                                i49 = 883054428;
                                            }
                                            i55 = iM559718 ^ i49;
                                            onClickListener5 = onClickListener4;
                                            sArr16 = sArr12;
                                            i61 = i47;
                                            i65 = i46;
                                            strArr12 = strArr10;
                                            i54 = i48;
                                            sArr17 = sArr13;
                                            strArr13 = strArr7;
                                            spinner3 = spinner2;
                                            break;
                                        case -963341385:
                                        case 413922898:
                                            str = str4;
                                            str2 = str5;
                                            interfaceC14100 = interfaceC14102;
                                            i56 = 7611;
                                            iM55684 = (C0946.m55979("۬᩺") + i52) * (-23);
                                            i30 = ((iM55684 ^ i53) * (-4095)) ^ 1809055202;
                                            i31 = 759349221;
                                            int i810 = iM55684 ^ i31;
                                            onClickListener5 = onClickListener5;
                                            sArr17 = sArr17;
                                            sArr16 = sArr16;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i61 = i61;
                                            i55 = i810;
                                            i54 = i30;
                                            i65 = i65;
                                            strArr13 = strArr13;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            int i71115 = i64;
                                            str4 = str;
                                            i64 = i71115;
                                            int i71116 = i66;
                                            str5 = str2;
                                            i66 = i71116;
                                            int i71117 = i57;
                                            i58 = i58;
                                            str7 = str7;
                                            interfaceC14102 = interfaceC14100;
                                            i57 = i71117;
                                            break;
                                        case -930304310:
                                        case 1501357084:
                                            str = str4;
                                            str2 = str5;
                                            interfaceC14100 = interfaceC14102;
                                            i56 = 40066;
                                            iM55684 = (C0946.m55979("۬᩺") + i52) * (-23);
                                            i30 = ((iM55684 ^ i53) * (-4095)) ^ 1809055202;
                                            i31 = 759349221;
                                            int i811 = iM55684 ^ i31;
                                            onClickListener5 = onClickListener5;
                                            sArr17 = sArr17;
                                            sArr16 = sArr16;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i61 = i61;
                                            i55 = i811;
                                            i54 = i30;
                                            i65 = i65;
                                            strArr13 = strArr13;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            int i71118 = i64;
                                            str4 = str;
                                            i64 = i71118;
                                            int i71119 = i66;
                                            str5 = str2;
                                            i66 = i71119;
                                            int i711110 = i57;
                                            i58 = i58;
                                            str7 = str7;
                                            interfaceC14102 = interfaceC14100;
                                            i57 = i711110;
                                            break;
                                        case -909184762:
                                        case 1499391959:
                                            sArr16 = sArr16;
                                            onClickListener5 = onClickListener5;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            strArr13 = strArr13;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i65 = i65;
                                            sArr17 = sArr17;
                                            String str28 = str4;
                                            i64 = i64;
                                            str = str28;
                                            String str29 = str5;
                                            i66 = i66;
                                            str2 = str29;
                                            InterfaceC14100 interfaceC141013 = interfaceC14102;
                                            str7 = str7;
                                            i58 = i58;
                                            i57 = i57;
                                            interfaceC14100 = interfaceC141013;
                                            dialogInterface.dismiss();
                                            c18108 = c18107;
                                            i32 = 0;
                                            if (i27 > 0) {
                                                int iM556812 = (i53 - C0873.m55680("ۖ۬")) * 63;
                                                i55 = iM556812 ^ 1304739090;
                                                i54 = ((iM556812 ^ i52) * (-10749)) ^ (-1860310557);
                                                i65 = i65;
                                                onClickListener5 = onClickListener5;
                                                sArr17 = sArr17;
                                                sArr16 = sArr16;
                                                strArr12 = strArr12;
                                                sArr14 = sArr14;
                                                i62 = i62;
                                                i61 = 0;
                                            } else {
                                                int iM556813 = C0873.m55680("ۗܶ") ^ i53;
                                                int i90 = ((iM556813 ^ i52) * 19725) ^ (-1167989561);
                                                i55 = iM556813 ^ 1322159807;
                                                i65 = i65;
                                                onClickListener5 = onClickListener5;
                                                sArr16 = sArr16;
                                                strArr12 = strArr12;
                                                sArr14 = sArr14;
                                                i62 = i62;
                                                i61 = i32;
                                                i54 = i90;
                                                sArr17 = sArr17;
                                            }
                                            strArr13 = strArr13;
                                            spinner3 = spinner3;
                                            int i711111 = i64;
                                            str4 = str;
                                            i64 = i711111;
                                            int i711112 = i66;
                                            str5 = str2;
                                            i66 = i711112;
                                            int i711113 = i57;
                                            i58 = i58;
                                            str7 = str7;
                                            interfaceC14102 = interfaceC14100;
                                            i57 = i711113;
                                            break;
                                        case -850896335:
                                        case 1040941844:
                                            C0955.m56036(c18108, interfaceC19371, new C20100(c18108, strArr12));
                                            break;
                                        case -726873400:
                                        case 809140687:
                                            sArr16 = sArr16;
                                            strArr12 = strArr12;
                                            i61 = i61;
                                            spinner3 = spinner3;
                                            strArr13 = strArr13;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i65 = i65;
                                            onClickListener5 = onClickListener5;
                                            sArr17 = sArr17;
                                            String str30 = str4;
                                            i64 = i64;
                                            str = str30;
                                            String str31 = str5;
                                            i66 = i66;
                                            str2 = str31;
                                            InterfaceC14100 interfaceC141014 = interfaceC14102;
                                            str7 = str7;
                                            i58 = i58;
                                            i57 = i57;
                                            interfaceC14100 = interfaceC141014;
                                            short s2 = f82261[0];
                                            if (((s2 * s2) + 86359849) - (s2 * 18586) < 0) {
                                                iM55684 = C0873.m55680("ۜ᩶") ^ i52;
                                                i30 = ((iM55684 ^ i53) * (-21857)) ^ 212051700;
                                                i31 = 1295037689;
                                            } else {
                                                iM55684 = (C0873.m55680("᩵ۧ") ^ i53) * 45;
                                                i30 = ((iM55684 ^ i52) * (-14607)) ^ (-2112832251);
                                                i31 = -1471040099;
                                            }
                                            int i812 = iM55684 ^ i31;
                                            onClickListener5 = onClickListener5;
                                            sArr17 = sArr17;
                                            sArr16 = sArr16;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i61 = i61;
                                            i55 = i812;
                                            i54 = i30;
                                            i65 = i65;
                                            strArr13 = strArr13;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            int i711114 = i64;
                                            str4 = str;
                                            i64 = i711114;
                                            int i711115 = i66;
                                            str5 = str2;
                                            i66 = i711115;
                                            int i711116 = i57;
                                            i58 = i58;
                                            str7 = str7;
                                            interfaceC14102 = interfaceC14100;
                                            i57 = i711116;
                                            break;
                                        case -665874479:
                                        case -89884519:
                                            RunnableC0897.m55789(c18108, interfaceC19371, new C4183(c18108));
                                            break;
                                        case -471310297:
                                        case 1818959751:
                                            sArr16 = sArr16;
                                            strArr12 = strArr12;
                                            i61 = i61;
                                            spinner3 = spinner3;
                                            strArr13 = strArr13;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i65 = i65;
                                            onClickListener5 = onClickListener5;
                                            sArr17 = sArr17;
                                            String str32 = str4;
                                            i64 = i64;
                                            str = str32;
                                            String str33 = str5;
                                            i66 = i66;
                                            str2 = str33;
                                            InterfaceC14100 interfaceC141015 = interfaceC14102;
                                            str7 = str7;
                                            i58 = i58;
                                            i57 = i57;
                                            interfaceC14100 = interfaceC141015;
                                            if (!C1028.m56234(c18108, C0890.m55726(f82261, 1, 5, i56))) {
                                                iM55684 = C0873.m55680("ۙۤ") ^ i53;
                                                i30 = ((iM55684 ^ i52) * 24873) ^ (-2104451076);
                                                i31 = -12194516;
                                                int i813 = iM55684 ^ i31;
                                                onClickListener5 = onClickListener5;
                                                sArr17 = sArr17;
                                                sArr16 = sArr16;
                                                sArr14 = sArr14;
                                                i62 = i62;
                                                i61 = i61;
                                                i55 = i813;
                                                i54 = i30;
                                                i65 = i65;
                                                strArr13 = strArr13;
                                                strArr12 = strArr12;
                                                spinner3 = spinner3;
                                                int i711117 = i64;
                                                str4 = str;
                                                i64 = i711117;
                                                int i711118 = i66;
                                                str5 = str2;
                                                i66 = i711118;
                                                int i711119 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i711119;
                                            } else {
                                                i32 = i61;
                                                int iM556814 = C0873.m55680("ۗܶ") ^ i53;
                                                int i91 = ((iM556814 ^ i52) * 19725) ^ (-1167989561);
                                                i55 = iM556814 ^ 1322159807;
                                                i65 = i65;
                                                onClickListener5 = onClickListener5;
                                                sArr16 = sArr16;
                                                strArr12 = strArr12;
                                                sArr14 = sArr14;
                                                i62 = i62;
                                                i61 = i32;
                                                i54 = i91;
                                                sArr17 = sArr17;
                                                strArr13 = strArr13;
                                                spinner3 = spinner3;
                                                int i7111110 = i64;
                                                str4 = str;
                                                i64 = i7111110;
                                                int i7111111 = i66;
                                                str5 = str2;
                                                i66 = i7111111;
                                                int i7111112 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i7111112;
                                            }
                                            break;
                                        case -464604527:
                                        case 986010146:
                                            if (C0894.f81854 < 0) {
                                                sArr9 = sArr16;
                                                spinner2 = spinner3;
                                                strArr7 = strArr13;
                                                i39 = i61;
                                                onClickListener2 = onClickListener5;
                                                iM559717 = C0873.m55680("ۜ۟") ^ i52;
                                                iArr = iArr3;
                                                i40 = ((iM559717 ^ i53) * (-1651)) ^ (-456820570);
                                                i41 = 1189822;
                                                i55 = iM559717 ^ i41;
                                                i54 = i40;
                                                i58 = i58;
                                                iArr3 = iArr;
                                                onClickListener5 = onClickListener2;
                                                sArr16 = sArr9;
                                                i61 = i39;
                                                i57 = i57;
                                                i65 = i65;
                                                sArr17 = sArr17;
                                                strArr12 = strArr12;
                                                strArr13 = strArr7;
                                                spinner3 = spinner2;
                                            } else {
                                                strArr5 = strArr12;
                                                spinner = spinner3;
                                                strArr6 = strArr13;
                                                i35 = i65;
                                                sArr8 = sArr17;
                                                str3 = str6;
                                                i36 = i61;
                                                onClickListener = onClickListener5;
                                                InterfaceC14100 interfaceC141016 = interfaceC14102;
                                                str7 = str7;
                                                i58 = i58;
                                                i57 = i57;
                                                interfaceC14100 = interfaceC141016;
                                                int iM5597210 = C0946.m55979("۠᩺") ^ i53;
                                                i55 = iM5597210 ^ (-631507210);
                                                i54 = ((iM5597210 ^ i52) * 13509) ^ 1142338981;
                                                sArr16 = sArr16;
                                                onClickListener5 = onClickListener;
                                                i61 = i36;
                                                str6 = str3;
                                                i65 = i35;
                                                sArr17 = sArr8;
                                                strArr12 = strArr5;
                                                strArr13 = strArr6;
                                                spinner3 = spinner;
                                                int i723 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i723;
                                            }
                                            break;
                                        case -417149806:
                                        case -69654378:
                                            sArr16 = sArr16;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            strArr13 = strArr13;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i65 = i65;
                                            sArr17 = sArr17;
                                            i61 = i61;
                                            onClickListener5 = onClickListener5;
                                            String str34 = str4;
                                            i64 = i64;
                                            str = str34;
                                            String str35 = str5;
                                            i66 = i66;
                                            str2 = str35;
                                            InterfaceC14100 interfaceC141017 = interfaceC14102;
                                            str7 = str7;
                                            i58 = i58;
                                            i57 = i57;
                                            interfaceC14100 = interfaceC141017;
                                            if (zArr3[i61]) {
                                                iM55685 = C0946.m55979("۬֨") ^ i52;
                                                i54 = ((iM55685 ^ i53) * 18457) ^ (-626626349);
                                                i33 = 999028167;
                                            } else {
                                                iM55685 = C0946.m55979("ۨ᩶") ^ i52;
                                                i54 = ((iM55685 ^ i53) * 21811) ^ (-1354535889);
                                                i33 = -1603917890;
                                            }
                                            i55 = iM55685 ^ i33;
                                            onClickListener5 = onClickListener5;
                                            sArr17 = sArr17;
                                            sArr16 = sArr16;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i61 = i61;
                                            i65 = i65;
                                            strArr13 = strArr13;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            int i7111113 = i64;
                                            str4 = str;
                                            i64 = i7111113;
                                            int i7111114 = i66;
                                            str5 = str2;
                                            i66 = i7111114;
                                            int i7111115 = i57;
                                            i58 = i58;
                                            str7 = str7;
                                            interfaceC14102 = interfaceC14100;
                                            i57 = i7111115;
                                            break;
                                        case -404387166:
                                        case 1468679573:
                                            C0967.m56076(c20671M55888, C0873.m55680(C0877.m55707(sArr17, i65, i67, i56)) ^ 2118509886, null);
                                            C10884.m25071(C1025.m56221(c20671M55888));
                                            break;
                                        case -284515555:
                                        case 1754508116:
                                            short[] sArr24 = sArr16;
                                            strArr5 = strArr12;
                                            strArr6 = strArr13;
                                            i35 = i65;
                                            sArr8 = sArr17;
                                            str3 = str6;
                                            i36 = i61;
                                            onClickListener = onClickListener5;
                                            String str36 = str4;
                                            i64 = i64;
                                            str = str36;
                                            String str37 = str5;
                                            i66 = i66;
                                            str2 = str37;
                                            InterfaceC14100 interfaceC141018 = interfaceC14102;
                                            str7 = str7;
                                            i58 = i58;
                                            i57 = i57;
                                            interfaceC14100 = interfaceC141018;
                                            Spinner spinner6 = (Spinner) C1404.m56465(viewM56111, iM55689 ^ 2124011780);
                                            sArr14 = f82261;
                                            i62 = 21;
                                            i63 = 16;
                                            if (RunnableC0871.f81839 < 0) {
                                                int iM556815 = C0873.m55680("ܿۚ") ^ i52;
                                                i55 = iM556815 ^ 627009104;
                                                str6 = str3;
                                                i54 = ((iM556815 ^ i53) * 8809) ^ 383228350;
                                                onClickListener5 = onClickListener;
                                                sArr17 = sArr8;
                                                i61 = i36;
                                                i65 = i35;
                                                strArr13 = strArr6;
                                                strArr12 = strArr5;
                                                spinner3 = spinner6;
                                                sArr16 = sArr24;
                                                int i7111116 = i64;
                                                str4 = str;
                                                i64 = i7111116;
                                                int i7111117 = i66;
                                                str5 = str2;
                                                i66 = i7111117;
                                                int i7111118 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i7111118;
                                            } else {
                                                spinner = spinner6;
                                                sArr16 = sArr24;
                                                str4 = str;
                                                i64 = i64;
                                                str5 = str2;
                                                i66 = i66;
                                                int iM5597211 = C0946.m55979("۠᩺") ^ i53;
                                                i55 = iM5597211 ^ (-631507210);
                                                i54 = ((iM5597211 ^ i52) * 13509) ^ 1142338981;
                                                sArr16 = sArr16;
                                                onClickListener5 = onClickListener;
                                                i61 = i36;
                                                str6 = str3;
                                                i65 = i35;
                                                sArr17 = sArr8;
                                                strArr12 = strArr5;
                                                strArr13 = strArr6;
                                                spinner3 = spinner;
                                                int i724 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i724;
                                            }
                                            break;
                                        case 4001912:
                                        case 813507178:
                                            sArr10 = sArr16;
                                            strArr11 = strArr12;
                                            spinner2 = spinner3;
                                            strArr8 = strArr13;
                                            i42 = i65;
                                            i50 = i60;
                                            iArr3[i61] = i61;
                                            int iM5597212 = C0946.m55979("ۖ֨") ^ i52;
                                            i60 = i50;
                                            int i610 = ((iM5597212 ^ i53) * 1041) ^ (-1717964522);
                                            i55 = iM5597212 ^ 37974229;
                                            strArr13 = strArr8;
                                            sArr16 = sArr10;
                                            spinner3 = spinner2;
                                            int i611 = i42;
                                            strArr12 = strArr11;
                                            i54 = i610;
                                            i65 = i611;
                                            break;
                                        case 44731061:
                                        case 344863815:
                                            sArr12 = sArr16;
                                            strArr10 = strArr12;
                                            spinner2 = spinner3;
                                            strArr7 = strArr13;
                                            RunnableC0897.m55789(c18108, interfaceC19371, new C6018(c18108, strArr10));
                                            i46 = i65;
                                            sArr13 = sArr17;
                                            i47 = i61;
                                            onClickListener4 = onClickListener5;
                                            iM559718 = (i52 - C0946.m55979("ܺܿ")) * (-109);
                                            i48 = ((iM559718 ^ i53) * 13153) ^ 402045859;
                                            i49 = 883054428;
                                            i55 = iM559718 ^ i49;
                                            onClickListener5 = onClickListener4;
                                            sArr16 = sArr12;
                                            i61 = i47;
                                            i65 = i46;
                                            strArr12 = strArr10;
                                            i54 = i48;
                                            sArr17 = sArr13;
                                            strArr13 = strArr7;
                                            spinner3 = spinner2;
                                            break;
                                        case 459435739:
                                        case 820584669:
                                            C0906.m55817(c20671M55888, C0946.m55979(C1964.m56584(sArr16, i66, i64, i56)) ^ 2116935271, onClickListener5);
                                            sArr17 = f82261;
                                            i65 = UMErrorCode.E_UM_BE_JSON_FAILED;
                                            i67 = 3;
                                            if (C1044.m56286() <= 0) {
                                                iM55683 = C0946.m55979("ۧ۟") ^ i52;
                                                i28 = ((iM55683 ^ i53) * 5049) ^ 810457089;
                                                i29 = 83702360;
                                            } else {
                                                iM55683 = C0873.m55680("ܺۜ") ^ i52;
                                                i28 = ((iM55683 ^ i53) * 2091) ^ (-1985287542);
                                                i29 = 1816241172;
                                            }
                                            i55 = iM55683 ^ i29;
                                            i54 = i28;
                                            break;
                                        case 573895394:
                                        case 2058663271:
                                            sArr10 = sArr16;
                                            String[] strArr19 = strArr12;
                                            spinner2 = spinner3;
                                            strArr8 = strArr13;
                                            i42 = i65;
                                            sArr11 = sArr17;
                                            i43 = i61;
                                            onClickListener3 = onClickListener5;
                                            strArr9 = strArr19;
                                            interfaceC14101 = interfaceC14102;
                                            i60 = interfaceC14101.getInt(C1012.m56144(f82261, 101, 3, i56), i43);
                                            iArr3[i43] = i60;
                                            if (i60 >= 0) {
                                                iM55688 = (C0873.m55680("ۗۛ") + i52) * (-41);
                                                i44 = ((iM55688 ^ i53) * 16981) ^ (-518273216);
                                                i45 = 641178255;
                                            } else {
                                                iM55688 = C0946.m55979("ᩴۚ") ^ i53;
                                                i44 = ((iM55688 ^ i52) * 14363) ^ 2142623731;
                                                i45 = 416639391;
                                            }
                                            i55 = iM55688 ^ i45;
                                            interfaceC14102 = interfaceC14101;
                                            i54 = i44;
                                            onClickListener5 = onClickListener3;
                                            sArr17 = sArr11;
                                            sArr16 = sArr10;
                                            i61 = i43;
                                            i65 = i42;
                                            strArr13 = strArr8;
                                            strArr12 = strArr9;
                                            spinner3 = spinner2;
                                            break;
                                        case 734142308:
                                        case 947130602:
                                            sArr16 = sArr16;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            strArr13 = strArr13;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i65 = i65;
                                            sArr17 = sArr17;
                                            i61 = i61;
                                            onClickListener5 = onClickListener5;
                                            String str38 = str4;
                                            i64 = i64;
                                            str = str38;
                                            String str39 = str5;
                                            i66 = i66;
                                            str2 = str39;
                                            InterfaceC14100 interfaceC141019 = interfaceC14102;
                                            str7 = str7;
                                            i58 = i58;
                                            i57 = i57;
                                            interfaceC14100 = interfaceC141019;
                                            mainM56594 = C1964.m56594(c18108);
                                            iM559720 = C0946.m55979(C0882.m55717(f82261, 15, 3, i56)) ^ 2126985416;
                                            if (C1053.f81965 > 0) {
                                                iM55685 = C0946.m55979("ۨۚ") ^ i53;
                                                i54 = ((iM55685 ^ i52) * 25503) ^ 2082949096;
                                                i33 = -1306450718;
                                                i55 = iM55685 ^ i33;
                                                onClickListener5 = onClickListener5;
                                                sArr17 = sArr17;
                                                sArr16 = sArr16;
                                                sArr14 = sArr14;
                                                i62 = i62;
                                                i61 = i61;
                                                i65 = i65;
                                                strArr13 = strArr13;
                                                strArr12 = strArr12;
                                                spinner3 = spinner3;
                                                int i7111119 = i64;
                                                str4 = str;
                                                i64 = i7111119;
                                                int i71111110 = i66;
                                                str5 = str2;
                                                i66 = i71111110;
                                                int i71111111 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i71111111;
                                            } else {
                                                strArr4 = strArr13;
                                                int iM5597213 = (C0946.m55979("ۤ۫") + i53) * 55;
                                                i55 = iM5597213 ^ (-1013849606);
                                                i54 = ((iM5597213 ^ i52) * (-2721)) ^ (-468063375);
                                                spinner3 = spinner3;
                                                onClickListener5 = onClickListener5;
                                                sArr17 = sArr17;
                                                sArr14 = sArr14;
                                                i62 = i62;
                                                strArr13 = strArr4;
                                                i61 = i61;
                                                i65 = i65;
                                                sArr16 = sArr16;
                                                strArr12 = strArr12;
                                                int i71111112 = i64;
                                                str4 = str;
                                                i64 = i71111112;
                                                int i71111113 = i66;
                                                str5 = str2;
                                                i66 = i71111113;
                                                int i71111114 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i71111114;
                                            }
                                            break;
                                        case 914199140:
                                        case 967799650:
                                            C0937.m55918();
                                            C1046.m56302();
                                            strArr5 = strArr12;
                                            spinner = spinner3;
                                            strArr6 = strArr13;
                                            i35 = i65;
                                            sArr8 = sArr17;
                                            str3 = str6;
                                            i36 = i61;
                                            onClickListener = onClickListener5;
                                            InterfaceC14100 interfaceC1410110 = interfaceC14102;
                                            str7 = str7;
                                            i58 = i58;
                                            i57 = i57;
                                            interfaceC14100 = interfaceC1410110;
                                            int iM5597214 = C0946.m55979("۠᩺") ^ i53;
                                            i55 = iM5597214 ^ (-631507210);
                                            i54 = ((iM5597214 ^ i52) * 13509) ^ 1142338981;
                                            sArr16 = sArr16;
                                            onClickListener5 = onClickListener;
                                            i61 = i36;
                                            str6 = str3;
                                            i65 = i35;
                                            sArr17 = sArr8;
                                            strArr12 = strArr5;
                                            strArr13 = strArr6;
                                            spinner3 = spinner;
                                            int i725 = i57;
                                            i58 = i58;
                                            str7 = str7;
                                            interfaceC14102 = interfaceC14100;
                                            i57 = i725;
                                            break;
                                        case 932301504:
                                        case 2065158912:
                                            sArr12 = sArr16;
                                            strArr10 = strArr12;
                                            spinner2 = spinner3;
                                            strArr7 = strArr13;
                                            i46 = i65;
                                            i47 = i61;
                                            onClickListener4 = onClickListener5;
                                            if (i27 != 3) {
                                                sArr13 = sArr17;
                                                iM559718 = (i52 - C0946.m55979("ܺܿ")) * (-109);
                                                i48 = ((iM559718 ^ i53) * 13153) ^ 402045859;
                                                i49 = 883054428;
                                            } else {
                                                iM559718 = (C0873.m55680("۟ܶ") + i53) * 21;
                                                sArr13 = sArr17;
                                                i48 = ((iM559718 ^ i52) * (-12905)) ^ (-1005491087);
                                                i49 = 894766220;
                                            }
                                            i55 = iM559718 ^ i49;
                                            onClickListener5 = onClickListener4;
                                            sArr16 = sArr12;
                                            i61 = i47;
                                            i65 = i46;
                                            strArr12 = strArr10;
                                            i54 = i48;
                                            sArr17 = sArr13;
                                            strArr13 = strArr7;
                                            spinner3 = spinner2;
                                            break;
                                        case 1133455395:
                                        case 2097975372:
                                            sArr9 = sArr16;
                                            strArr12 = strArr12;
                                            spinner2 = spinner3;
                                            strArr7 = strArr13;
                                            i65 = i65;
                                            sArr17 = sArr17;
                                            i39 = i61;
                                            onClickListener2 = onClickListener5;
                                            i58 = i58;
                                            iArr2 = new int[]{13, 21, 24, i58, 28};
                                            i57 = i57;
                                            iArr3 = new int[i57];
                                            interfaceC14102 = ApplicationC21448.f67649;
                                            if (C0906.m55809() <= 0) {
                                                iM559717 = C0873.m55680("ۜ۟") ^ i52;
                                                iArr = iArr3;
                                                i40 = ((iM559717 ^ i53) * (-1651)) ^ (-456820570);
                                                i41 = 1189822;
                                            } else {
                                                iM559717 = C0946.m55979("ۙۜ") ^ i53;
                                                iArr = iArr3;
                                                i40 = ((iM559717 ^ i52) * 15631) ^ (-548301969);
                                                i41 = 987720384;
                                            }
                                            i55 = iM559717 ^ i41;
                                            i54 = i40;
                                            i58 = i58;
                                            iArr3 = iArr;
                                            onClickListener5 = onClickListener2;
                                            sArr16 = sArr9;
                                            i61 = i39;
                                            i57 = i57;
                                            i65 = i65;
                                            sArr17 = sArr17;
                                            strArr12 = strArr12;
                                            strArr13 = strArr7;
                                            spinner3 = spinner2;
                                            break;
                                        case 1393942451:
                                        case 2032145466:
                                            sArr16 = sArr16;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            strArr13 = strArr13;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i65 = i65;
                                            sArr17 = sArr17;
                                            i61 = i61;
                                            onClickListener5 = onClickListener5;
                                            String str40 = str4;
                                            i64 = i64;
                                            str = str40;
                                            String str41 = str5;
                                            i66 = i66;
                                            str2 = str41;
                                            InterfaceC14100 interfaceC141020 = interfaceC14102;
                                            str7 = str7;
                                            i58 = i58;
                                            i57 = i57;
                                            interfaceC14100 = interfaceC141020;
                                            if (i27 != 2) {
                                                iM55685 = C0873.m55680("ܰ᩷") ^ i53;
                                                i54 = ((iM55685 ^ i52) * (-21149)) ^ 2033934134;
                                                i33 = 1677486406;
                                            } else {
                                                iM55685 = (i53 - C0946.m55979("֨ۖ")) * (-63);
                                                i54 = ((iM55685 ^ i52) * 4003) ^ (-586311114);
                                                i33 = 481341583;
                                            }
                                            i55 = iM55685 ^ i33;
                                            onClickListener5 = onClickListener5;
                                            sArr17 = sArr17;
                                            sArr16 = sArr16;
                                            sArr14 = sArr14;
                                            i62 = i62;
                                            i61 = i61;
                                            i65 = i65;
                                            strArr13 = strArr13;
                                            strArr12 = strArr12;
                                            spinner3 = spinner3;
                                            int i71111115 = i64;
                                            str4 = str;
                                            i64 = i71111115;
                                            int i71111116 = i66;
                                            str5 = str2;
                                            i66 = i71111116;
                                            int i71111117 = i57;
                                            i58 = i58;
                                            str7 = str7;
                                            interfaceC14102 = interfaceC14100;
                                            i57 = i71111117;
                                            break;
                                        default:
                                            RunnableC0897.m55784();
                                            if (C1071.f81975 <= 0) {
                                                iM55683 = C0946.m55979("ۖۘ") ^ i53;
                                                i28 = ((iM55683 ^ i52) * (-32453)) ^ (-1776351797);
                                                i29 = 781585319;
                                                i55 = iM55683 ^ i29;
                                                i54 = i28;
                                            } else {
                                                strArr5 = strArr12;
                                                spinner = spinner3;
                                                strArr6 = strArr13;
                                                i35 = i65;
                                                sArr8 = sArr17;
                                                str3 = str6;
                                                i36 = i61;
                                                onClickListener = onClickListener5;
                                                InterfaceC14100 interfaceC1410111 = interfaceC14102;
                                                str7 = str7;
                                                i58 = i58;
                                                i57 = i57;
                                                interfaceC14100 = interfaceC1410111;
                                                int iM5597215 = C0946.m55979("۠᩺") ^ i53;
                                                i55 = iM5597215 ^ (-631507210);
                                                i54 = ((iM5597215 ^ i52) * 13509) ^ 1142338981;
                                                sArr16 = sArr16;
                                                onClickListener5 = onClickListener;
                                                i61 = i36;
                                                str6 = str3;
                                                i65 = i35;
                                                sArr17 = sArr8;
                                                strArr12 = strArr5;
                                                strArr13 = strArr6;
                                                spinner3 = spinner;
                                                int i726 = i57;
                                                i58 = i58;
                                                str7 = str7;
                                                interfaceC14102 = interfaceC14100;
                                                i57 = i726;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        if (C0854.m55595() < 0) {
                            iM55681 = (C0873.m55680("ܺۨ") + i15) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i6 = ((iM55681 ^ i16) * 28193) ^ 1405173424;
                            i7 = 1549434750;
                            iM559713 = i;
                            i18 = iM55681 ^ i7;
                            i17 = i6;
                            i19 = i5;
                        } else {
                            iM559713 = i;
                            int iM55683 = (C0873.m55680("᩻ܳ") ^ i16) * 109;
                            i6 = ((iM55683 ^ i15) * (-5905)) ^ (-1567608963);
                            i18 = iM55683 ^ 1866822708;
                            i17 = i6;
                            i19 = i5;
                        }
                    } else {
                        sArr2 = sArr4;
                        sArr3 = sArr5;
                        zArr = zArr2;
                        iM559710 = (C0873.m55680("ᩴ᩶") ^ i15) * 87;
                        i17 = ((iM559710 ^ i16) * (-27781)) ^ 2128736374;
                        i9 = 1600652967;
                        i11 = iM559710 ^ i9;
                        sArr4 = sArr2;
                        zArr2 = zArr;
                        sArr5 = sArr3;
                        iM559713 = i;
                        i18 = i11;
                        runnableC6688 = this;
                    }
                    break;
                case -1536197608:
                case 678488515:
                    i = iM559713;
                    sArr2 = sArr4;
                    sArr3 = sArr5;
                    zArr = zArr2;
                    s = f81972[0];
                    i23 = s * s;
                    if (C1053.f81965 <= 0) {
                        iM559710 = (C0873.m55680("ᩴ᩶") ^ i15) * 87;
                        i17 = ((iM559710 ^ i16) * (-27781)) ^ 2128736374;
                        i9 = 1600652967;
                    } else {
                        iM559710 = (i15 - C0946.m55979("ᩴ᩺")) * 47;
                        i17 = ((iM559710 ^ i16) * 15721) ^ (-109241533);
                        i9 = 1329205948;
                    }
                    i11 = iM559710 ^ i9;
                    sArr4 = sArr2;
                    zArr2 = zArr;
                    sArr5 = sArr3;
                    iM559713 = i;
                    i18 = i11;
                    runnableC6688 = this;
                    break;
                case -1200455091:
                case 1095488074:
                    i = iM559713;
                    strArr2[c2] = ServiceConnectionC1013.m56156(iM559715 ^ 2100148199);
                    sArr6 = f81972;
                    i19 = 14;
                    i25 = 3;
                    if (RunnableC0938.f81886 < 0) {
                        iM55680 = C0873.m55680("֫᩶") ^ i16;
                        i2 = ((iM55680 ^ i15) * 25885) ^ 62749181;
                        i4 = -240830509;
                        i8 = iM55680 ^ i4;
                        iM559713 = i;
                        i18 = i8;
                        i17 = i2;
                    }
                    sArr = sArr5;
                    iM55979 = C0946.m55979("᩷᩵") ^ i16;
                    i2 = ((iM55979 ^ i15) * 26105) ^ (-702063244);
                    i3 = -209709453;
                    i8 = iM55979 ^ i3;
                    sArr5 = sArr;
                    iM559713 = i;
                    i18 = i8;
                    i17 = i2;
                    break;
                case -1063117569:
                case 1536429407:
                    i22 = 26922;
                    iM559711 = C0946.m55979("ᩴᩳ") ^ i16;
                    i12 = ((iM559711 ^ i15) * 28615) ^ (-452243411);
                    i13 = -452186004;
                    i14 = iM559711 ^ i13;
                    sArr4 = sArr4;
                    int i27 = iM559713;
                    i18 = i14;
                    i17 = i12;
                    zArr2 = zArr2;
                    sArr5 = sArr5;
                    iM559713 = i27;
                    break;
                case -1027848998:
                case 1100668478:
                    iM559713 = iM559713;
                    sArr5 = sArr5;
                    zArr2 = zArr2;
                    sArr4 = sArr4;
                    iM559714 = C0946.m55979(C0955.m56029(sArr4, 1, 3, i22)) ^ 2124715443;
                    if (z) {
                        iM559711 = (C0873.m55680("۠᩻") ^ i16) * (-89);
                        i12 = ((iM559711 ^ i15) * (-4055)) ^ 835797902;
                        i13 = -1068340233;
                    } else {
                        iM559711 = C0946.m55979("ۙܿ") ^ i16;
                        i12 = ((iM559711 ^ i15) * 31305) ^ (-1301147438);
                        i13 = -1736468431;
                    }
                    i14 = iM559711 ^ i13;
                    sArr4 = sArr4;
                    int i28 = iM559713;
                    i18 = i14;
                    i17 = i12;
                    zArr2 = zArr2;
                    sArr5 = sArr5;
                    iM559713 = i28;
                    break;
                case -700251523:
                case 713479197:
                    if (C1404.f82149 >= 0) {
                        i5 = i19;
                        int iM55684 = (C0873.m55680("᩻ܳ") ^ i16) * 109;
                        i6 = ((iM55684 ^ i15) * (-5905)) ^ (-1567608963);
                        i18 = iM55684 ^ 1866822708;
                        i17 = i6;
                        i19 = i5;
                    } else {
                        i = iM559713;
                        sArr = sArr5;
                        iM55979 = (C0946.m55979("ܳ᩺") + i15) * (-125);
                        i2 = ((iM55979 ^ i16) * (-11181)) ^ 292824878;
                        i3 = 1548039085;
                        i8 = iM55979 ^ i3;
                        sArr5 = sArr;
                        iM559713 = i;
                        i18 = i8;
                        i17 = i2;
                    }
                    break;
                case -662770113:
                case 2106669525:
                    C1012.m56146(c20671M55654, 2130294268 ^ iM559713);
                    C1025.m56221(c20671M55654);
                    break;
                case -444997251:
                case 697633637:
                    i = iM559713;
                    sArr = sArr5;
                    iM559715 = C0946.m55979(C1028.m56235(sArr, 11, 3, i22));
                    if (C1124.m56367() >= 0) {
                        iM55979 = (C0946.m55979("ܳ᩺") + i15) * (-125);
                        i2 = ((iM55979 ^ i16) * (-11181)) ^ 292824878;
                        i3 = 1548039085;
                    } else {
                        iM55979 = (C0873.m55680("ۙ֫") ^ i15) * (-83);
                        i2 = ((iM55979 ^ i16) * (-3863)) ^ 843421153;
                        i3 = -125463196;
                    }
                    i8 = iM55979 ^ i3;
                    sArr5 = sArr;
                    iM559713 = i;
                    i18 = i8;
                    i17 = i2;
                    break;
                case -308326802:
                case 776646199:
                    i = iM559713;
                    sArr2 = sArr4;
                    sArr3 = sArr5;
                    zArr = zArr2;
                    short s2 = s;
                    if ((s2 * 7696) - (i23 + 14807104) <= 0) {
                        iM55682 = (i16 - C0873.m55680("ܽ᩹")) * (-31);
                        i17 = ((iM55682 ^ i15) * 11829) ^ (-265612568);
                        i10 = -1112200317;
                    } else {
                        iM55682 = C0873.m55680("ܿ᩵") ^ i15;
                        i17 = ((iM55682 ^ i16) * 31207) ^ 2101872377;
                        i10 = -1169578113;
                    }
                    i11 = iM55682 ^ i10;
                    s = s2;
                    sArr4 = sArr2;
                    zArr2 = zArr;
                    sArr5 = sArr3;
                    iM559713 = i;
                    i18 = i11;
                    runnableC6688 = this;
                    break;
                case -296445261:
                case 1182443618:
                    C0894.m55769();
                    C1964.m56597();
                    i = iM559713;
                    sArr = sArr5;
                    iM55979 = (C0946.m55979("ܳ᩺") + i15) * (-125);
                    i2 = ((iM55979 ^ i16) * (-11181)) ^ 292824878;
                    i3 = 1548039085;
                    i8 = iM55979 ^ i3;
                    sArr5 = sArr;
                    iM559713 = i;
                    i18 = i8;
                    i17 = i2;
                    break;
                case -219375597:
                case 1142404911:
                    i5 = i19;
                    i = iM559713;
                    strArr2[i20] = strM56156;
                    sArr7 = f81972;
                    i21 = 17;
                    if (C0927.m55873() > 0) {
                        iM55681 = C0873.m55680("ܳۙ") ^ i15;
                        i6 = ((iM55681 ^ i16) * (-11333)) ^ (-1542669941);
                        i7 = 512109363;
                        iM559713 = i;
                        i18 = iM55681 ^ i7;
                        i17 = i6;
                        i19 = i5;
                    } else {
                        sArr = sArr5;
                        i19 = i5;
                        iM55979 = C0946.m55979("᩷᩵") ^ i16;
                        i2 = ((iM55979 ^ i15) * 26105) ^ (-702063244);
                        i3 = -209709453;
                        i8 = iM55979 ^ i3;
                        sArr5 = sArr;
                        iM559713 = i;
                        i18 = i8;
                        i17 = i2;
                    }
                    break;
                case 149297767:
                case 270815855:
                    String[] strArr4 = new String[i20];
                    strArr4[c] = ServiceConnectionC1013.m56156(iM559714);
                    strArr4[c2] = C1229.m56403(f81972, 4, 7, i22);
                    strArr = strArr4;
                    int iM559717 = C0946.m55979("ۗܽ") ^ i16;
                    i12 = ((iM559717 ^ i15) * 24435) ^ (-1998190513);
                    i14 = iM559717 ^ (-126069391);
                    int i29 = iM559713;
                    i18 = i14;
                    i17 = i12;
                    zArr2 = zArr2;
                    sArr5 = sArr5;
                    iM559713 = i29;
                    break;
                case 228063653:
                case 1657671412:
                    RunnableC0938.m55938();
                    break;
                case 392381699:
                case 1834250187:
                    i = iM559713;
                    sArr = sArr5;
                    zArr2 = runnableC6688.f17332;
                    c = 0;
                    z = zArr2[0];
                    i20 = 2;
                    c2 = 1;
                    sArr4 = f81972;
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("ܽ֨") ^ i15;
                        i2 = ((iM55979 ^ i16) * 17825) ^ (-863974397);
                        i3 = 1226336901;
                    } else {
                        iM55979 = C0946.m55979("᩷᩵") ^ i16;
                        i2 = ((iM55979 ^ i15) * 26105) ^ (-702063244);
                        i3 = -209709453;
                    }
                    i8 = iM55979 ^ i3;
                    sArr5 = sArr;
                    iM559713 = i;
                    i18 = i8;
                    i17 = i2;
                    break;
                case 447651180:
                case 1979751126:
                    iM559713 = C0946.m55979(C0989.m56092(f81972, 20, 3, i22));
                    if (RunnableC0938.f81886 < 0) {
                        int iM55685 = C0873.m55680("۟ᩴ") ^ i16;
                        i2 = ((iM55685 ^ i15) * 11827) ^ 39282289;
                        i18 = iM55685 ^ 1344606354;
                        i17 = i2;
                    } else {
                        i5 = i19;
                        int iM55686 = (C0873.m55680("᩻ܳ") ^ i16) * 109;
                        i6 = ((iM55686 ^ i15) * (-5905)) ^ (-1567608963);
                        i18 = iM55686 ^ 1866822708;
                        i17 = i6;
                        i19 = i5;
                    }
                    break;
                case 631086275:
                case 2077772149:
                    C1929.m56553();
                    if (C0967.f81910 >= 0) {
                        i = iM559713;
                        sArr2 = sArr4;
                        sArr3 = sArr5;
                        zArr = zArr2;
                        iM559710 = (C0873.m55680("ᩴ᩶") ^ i15) * 87;
                        i17 = ((iM559710 ^ i16) * (-27781)) ^ 2128736374;
                        i9 = 1600652967;
                        i11 = iM559710 ^ i9;
                        sArr4 = sArr2;
                        zArr2 = zArr;
                        sArr5 = sArr3;
                        iM559713 = i;
                        i18 = i11;
                        runnableC6688 = this;
                    } else {
                        i = iM559713;
                        iM55680 = C0873.m55680("ۤ᩹") ^ i15;
                        i2 = ((iM55680 ^ i16) * (-23491)) ^ (-386408540);
                        i4 = -841052125;
                        i8 = iM55680 ^ i4;
                        iM559713 = i;
                        i18 = i8;
                        i17 = i2;
                    }
                    break;
                case 837653565:
                case 2117505074:
                    i22 = 34594;
                    iM559711 = C0946.m55979("ᩴᩳ") ^ i16;
                    i12 = ((iM559711 ^ i15) * 28615) ^ (-452243411);
                    i13 = -452186004;
                    i14 = iM559711 ^ i13;
                    sArr4 = sArr4;
                    int i210 = iM559713;
                    i18 = i14;
                    i17 = i12;
                    zArr2 = zArr2;
                    sArr5 = sArr5;
                    iM559713 = i210;
                    break;
                case 1826982198:
                case 2046749728:
                    i = iM559713;
                    strM56156 = ServiceConnectionC1013.m56156(C0873.m55680(C1929.m56558(sArr6, i19, i25, i22)) ^ 2099835422);
                    if (C1229.f82066 < 0) {
                        iM55680 = C0873.m55680("ۖ֡") ^ i16;
                        i2 = ((iM55680 ^ i15) * (-24207)) ^ (-1804122837);
                        i4 = 2058833984;
                        i8 = iM55680 ^ i4;
                        iM559713 = i;
                        i18 = i8;
                        i17 = i2;
                    }
                    sArr = sArr5;
                    iM55979 = C0946.m55979("᩷᩵") ^ i16;
                    i2 = ((iM55979 ^ i15) * 26105) ^ (-702063244);
                    i3 = -209709453;
                    i8 = iM55979 ^ i3;
                    sArr5 = sArr;
                    iM559713 = i;
                    i18 = i8;
                    i17 = i2;
                    break;
                default:
                    i = iM559713;
                    strArr2 = new String[4];
                    strArr2[c] = ServiceConnectionC1013.m56156(iM559714);
                    sArr5 = f81972;
                    if (C0854.m55595() >= 0) {
                        iM55680 = C0873.m55680("ۤ᩹") ^ i15;
                        i2 = ((iM55680 ^ i16) * (-23491)) ^ (-386408540);
                        i4 = -841052125;
                    } else {
                        iM55680 = C0873.m55680("ۢۨ") ^ i15;
                        i2 = ((iM55680 ^ i16) * 9779) ^ 1783023910;
                        i4 = -1573838985;
                    }
                    i8 = iM55680 ^ i4;
                    iM559713 = i;
                    i18 = i8;
                    i17 = i2;
                    break;
            }
            return;
        }
    }
}
