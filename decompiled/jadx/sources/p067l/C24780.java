package p067l;

import android.os.Process;
import bin.p000mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24780 implements Consumer {

    /* JADX INFO: renamed from: ܳܿᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f83056 = {2527, 32751, 32676, 32755, 32683, 32682, 32677, 32670, 32751, 32676, 32755, 32748, 32748, 32687, 32676, 32694, 32748, 32748, 32677, 32676, 32685, 32676, 32693, 32676, 32677, 32748};

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f79218;

    public /* synthetic */ C24780(int i) {
        this.f79218 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0108, code lost:
    
        if (p067l.C0845.f81821 < 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0110, code lost:
    
        if (p067l.C1048.m56305() >= 0) goto L8;
     */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m45213n(Object obj) {
        int iM55979;
        int i;
        int i2;
        String str;
        short[] sArr;
        int iM559710;
        int i3;
        int i4;
        String str2;
        InterfaceC14770 interfaceC14770;
        int iM559711;
        int i5;
        short[] sArr2;
        int iM55680;
        int i6;
        int i7;
        int iM55681;
        int i8;
        int i9;
        int i10;
        String strM56460 = null;
        InterfaceC14770 interfaceC14771 = null;
        String strM55639 = null;
        int iIndexOf = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        InterfaceC22097 interfaceC22097M20115of = null;
        InterfaceC22097 interfaceC22097ResolveSibling = null;
        C23731 c23731M52765 = null;
        FutureC5767 futureC5767M12897 = null;
        int i14 = 0;
        int i15 = 0;
        String strM56454 = null;
        boolean zM55949 = false;
        short[] sArr3 = null;
        char c = 0;
        short s = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        short s2 = 0;
        int i19 = 1263467526;
        int i20 = C1124.f82007;
        int i21 = C0989.f81920;
        int iM55682 = C0873.m55680("֨᩷") ^ i21;
        int i22 = ((iM55682 ^ i20) * 23081) ^ 1306349012;
        int i23 = iM55682 ^ (-1184778669);
        String strM556310 = null;
        String strM36658 = null;
        short[] sArr4 = null;
        int i24 = 0;
        int i25 = 0;
        AbstractC17043 abstractC17043 = null;
        while (true) {
            InterfaceC14770 interfaceC14770M55950 = interfaceC14771;
            while (true) {
                i19 = i23 ^ (i22 & (((i19 ^ i20) * (-23705)) >> 31));
                switch (i19) {
                    case -2101355621:
                    case -434321844:
                        AbstractC0942.m55966(abstractC17043);
                        str = strM55639;
                        interfaceC14771 = interfaceC14770M55950;
                        sArr2 = sArr4;
                    case -2082177361:
                    case 1550906696:
                        try {
                            String str3 = strM56454;
                            try {
                                zM55949 = ViewOnClickListenerC0939.m55949(C0863.m55639(UUID.fromString(strM56454)), str3);
                                iM55681 = C0946.m55979("۟۫") ^ i20;
                                strM56454 = str3;
                                i8 = ((iM55681 ^ i21) * (-13979)) ^ (-1662299038);
                                i9 = -1998303545;
                                i23 = iM55681 ^ i9;
                                i22 = i8;
                            } catch (IllegalArgumentException unused) {
                                strM56454 = str3;
                            }
                        } catch (IllegalArgumentException unused2) {
                        }
                        break;
                    case -2065023179:
                    case 803374417:
                        i25 = 17691;
                        iM55979 = C0873.m55680("ۨᩳ") ^ i21;
                        i = ((iM55979 ^ i20) * 9257) ^ 281464112;
                        i2 = 1239664563;
                        int i26 = iM55979 ^ i2;
                        i22 = i;
                        sArr4 = sArr4;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i10 = i24;
                        i23 = i26;
                        i24 = i10;
                        break;
                    case -2019332408:
                    case -362736501:
                        C1053.m56327();
                        if (RunnableC1014.f81941 > 0) {
                            i24 = i24;
                            strM55639 = strM55639;
                            interfaceC14770M55950 = interfaceC14770M55950;
                            sArr4 = sArr4;
                            iM55979 = (C0946.m55979("ܿ֨") ^ i21) * (-107);
                            i = ((iM55979 ^ i20) * (-10159)) ^ 610019490;
                            i2 = -799470730;
                            int i27 = iM55979 ^ i2;
                            i22 = i;
                            sArr4 = sArr4;
                            strM55639 = strM55639;
                            interfaceC14770M55950 = interfaceC14770M55950;
                            i10 = i24;
                            i23 = i27;
                            i24 = i10;
                        }
                        i24 = i24;
                        iM55680 = C0946.m55979("ܳ᩷") ^ i20;
                        i3 = ((iM55680 ^ i21) * (-32579)) ^ (-1630265817);
                        i6 = -2044003990;
                        i7 = iM55680 ^ i6;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case -2016142949:
                    case 85828533:
                        C0912.m55833();
                        if (!C0877.m55696()) {
                            i24 = i24;
                            strM55639 = strM55639;
                            interfaceC14770M55950 = interfaceC14770M55950;
                            sArr4 = sArr4;
                            iM55979 = C0873.m55680("֨ۙ") ^ i20;
                            i = ((iM55979 ^ i21) * 21461) ^ (-1253463428);
                            i2 = 804595670;
                            int i28 = iM55979 ^ i2;
                            i22 = i;
                            sArr4 = sArr4;
                            strM55639 = strM55639;
                            interfaceC14770M55950 = interfaceC14770M55950;
                            i10 = i24;
                            i23 = i28;
                            i24 = i10;
                        } else {
                            iM55681 = (i20 - C0873.m55680("᩷֫")) * 35;
                            i8 = ((iM55681 ^ i21) * 11157) ^ 648003512;
                            i9 = -1743074330;
                            i23 = iM55681 ^ i9;
                            i22 = i8;
                        }
                        break;
                    case -1997757866:
                    case -1078919610:
                        strM56454 = C1404.m56454(strM56460, i15, i24);
                        iM55681 = (C0873.m55680("ۤܰ") + i21) * (-5);
                        i8 = ((iM55681 ^ i20) * (-5251)) ^ (-48330551);
                        i9 = 1782423129;
                        i23 = iM55681 ^ i9;
                        i22 = i8;
                        break;
                    case -1931986799:
                    case -1212525179:
                        String str4 = strM36658;
                        C0937.m55912(RunnableC0871.m55665(interfaceC14770M55950, strM55639, str4));
                        C19701.m44740(str4);
                        break;
                    case -1871469655:
                    case 458581689:
                        i15 = i13 + i14;
                        i24 = i15 + 36;
                        if (i24 <= C0882.m55719(strM56460)) {
                            iM55681 = (i21 - C0946.m55979("ᩴ۠")) * 73;
                            i8 = ((iM55681 ^ i20) * 5727) ^ (-1345471492);
                            i9 = 1504999813;
                            i23 = iM55681 ^ i9;
                            i22 = i8;
                        } else {
                            str = strM55639;
                            interfaceC14771 = interfaceC14770M55950;
                            sArr2 = sArr4;
                        }
                        break;
                    case -1776396779:
                    case 1146218779:
                        i24 = i24;
                        strM556310 = C0863.m55639(UUID.randomUUID());
                        str = strM55639;
                        interfaceC14771 = interfaceC14770M55950;
                        sArr = sArr4;
                        iM559710 = (C0873.m55680("ܰ֫") ^ i20) * 77;
                        i3 = ((iM559710 ^ i21) * (-26067)) ^ (-850877025);
                        i4 = 427472882;
                        i7 = iM559710 ^ i4;
                        sArr4 = sArr;
                        strM55639 = str;
                        interfaceC14770M55950 = interfaceC14771;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case -1699752892:
                    case -1307070752:
                        i24 = i24;
                        str = strM55639;
                        interfaceC14771 = interfaceC14770M55950;
                        sArr = sArr4;
                        String str5 = (String) obj;
                        int i29 = Main.f30;
                        if (str5 == null) {
                            iM559710 = C0946.m55979("ᩳۨ") ^ i21;
                            i3 = ((iM559710 ^ i20) * (-27547)) ^ 901731143;
                            i4 = -1318057639;
                        } else {
                            strM556310 = str5;
                            iM559710 = (C0873.m55680("ܰ֫") ^ i20) * 77;
                            i3 = ((iM559710 ^ i21) * (-26067)) ^ (-850877025);
                            i4 = 427472882;
                        }
                        i7 = iM559710 ^ i4;
                        sArr4 = sArr;
                        strM55639 = str;
                        interfaceC14770M55950 = interfaceC14771;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case -1662464339:
                    case -315893514:
                        i13 += i14 + 36;
                        iM55680 = (C0873.m55680("۬ۚ") ^ i20) * 93;
                        i3 = ((iM55680 ^ i21) * 703) ^ 780382222;
                        i6 = 1783757346;
                        i7 = iM55680 ^ i6;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case -1576146007:
                    case 1399296612:
                        RunnableC1014.m56177();
                        break;
                    case -1564871715:
                    case 686410050:
                        i24 = i24;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        sArr4 = sArr4;
                        s = sArr3[c];
                        i16 = s * s;
                        i17 = 1336336;
                        if (C0937.f81884) {
                            iM55979 = (C0946.m55979("۟ۡ") ^ i20) * 69;
                            i = ((iM55979 ^ i21) * (-12627)) ^ (-1453424997);
                            i2 = 1148153985;
                        } else {
                            iM55979 = (C0946.m55979("ܿ֨") ^ i21) * (-107);
                            i = ((iM55979 ^ i20) * (-10159)) ^ 610019490;
                            i2 = -799470730;
                        }
                        int i210 = iM55979 ^ i2;
                        i22 = i;
                        sArr4 = sArr4;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i10 = i24;
                        i23 = i210;
                        i24 = i10;
                        break;
                    case -1412917086:
                    case -646643215:
                        i24 = i24;
                        interfaceC22097M20115of = C8685.m20115of(C0989.m56086(abstractC17043), new String[i12]);
                        interfaceC22097ResolveSibling = interfaceC22097M20115of.resolveSibling(C0892.m55757(strM56460, i12, i11));
                        if (C1017.f81942 < 0) {
                            iM55680 = (i20 - C0946.m55979("ۗۡ")) * 67;
                            i3 = ((iM55680 ^ i21) * 23077) ^ 157655019;
                            i6 = -722106724;
                            i7 = iM55680 ^ i6;
                            i10 = i24;
                            i23 = i7;
                            i22 = i3;
                            i24 = i10;
                        }
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        sArr4 = sArr4;
                        iM55979 = C0873.m55680("֨ۙ") ^ i20;
                        i = ((iM55979 ^ i21) * 21461) ^ (-1253463428);
                        i2 = 804595670;
                        int i211 = iM55979 ^ i2;
                        i22 = i;
                        sArr4 = sArr4;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i10 = i24;
                        i23 = i211;
                        i24 = i10;
                        break;
                    case -1340555670:
                    case 1797071001:
                        C1003.m56123();
                        C1071.m56343();
                        i24 = i24;
                        iM55680 = C0873.m55680("ۛ۫") ^ i20;
                        i3 = ((iM55680 ^ i21) * 19613) ^ (-73428675);
                        i6 = -1102026429;
                        i7 = iM55680 ^ i6;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case -1299999979:
                    case 980718749:
                        futureC5767M12897.m12887((InterfaceC9988) new C7638(c23731M52765));
                        str = strM55639;
                        interfaceC14771 = interfaceC14770M55950;
                        sArr2 = sArr4;
                        break;
                    case -1267095736:
                    case 1152873813:
                        i24 = i24;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        sArr4 = sArr4;
                        int i30 = i16 + i17;
                        i18 = i30 + i30;
                        s2 = 1156;
                        if (C0989.f81920 >= 0) {
                            iM55979 = C0873.m55680("֨ۙ") ^ i20;
                            i = ((iM55979 ^ i21) * 21461) ^ (-1253463428);
                            i2 = 804595670;
                        } else {
                            iM55979 = (C0946.m55979("ۢۧ") ^ i21) * 71;
                            i = ((iM55979 ^ i20) * 16909) ^ (-227800991);
                            i2 = -1027265786;
                        }
                        int i212 = iM55979 ^ i2;
                        i22 = i;
                        sArr4 = sArr4;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i10 = i24;
                        i23 = i212;
                        i24 = i10;
                        break;
                    case -1186961314:
                    case 1086109390:
                        i24 = i24;
                        strM36658 = C16111.m36658(strM556310);
                        interfaceC14770M55950 = ViewOnClickListenerC0939.m55950(ApplicationC21448.f67649);
                        short[] sArr5 = f83056;
                        if (C1028.f81950 > 0) {
                            String str6 = strM55639;
                            String strM56403 = C1229.m56403(sArr5, 4, 4, i25);
                            if (C0894.f81854 < 0) {
                                StringBuilder sb = new StringBuilder(strM56403);
                                C0863.m55629(sb, Process.myUid());
                                strM55639 = C0863.m55639(sb);
                                if (C0873.f81841 > 0) {
                                    iM55680 = C0873.m55680("ܶۤ") ^ i21;
                                    i3 = ((iM55680 ^ i20) * (-12287)) ^ 433459642;
                                    i6 = 2046428264;
                                }
                                i7 = iM55680 ^ i6;
                                i10 = i24;
                                i23 = i7;
                                i22 = i3;
                                i24 = i10;
                            } else {
                                strM55639 = str6;
                            }
                            iM55680 = C0873.m55680("᩻ۤ") ^ i20;
                            i3 = ((iM55680 ^ i21) * (-7633)) ^ 229490676;
                            i6 = 745659873;
                            i7 = iM55680 ^ i6;
                            i10 = i24;
                            i23 = i7;
                            i22 = i3;
                            i24 = i10;
                        }
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        sArr4 = sArr4;
                        iM55979 = C0873.m55680("֨ۙ") ^ i20;
                        i = ((iM55979 ^ i21) * 21461) ^ (-1253463428);
                        i2 = 804595670;
                        int i213 = iM55979 ^ i2;
                        i22 = i;
                        sArr4 = sArr4;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i10 = i24;
                        i23 = i213;
                        i24 = i10;
                        break;
                    case -1129036384:
                    case -1044271845:
                        i24 = i24;
                        c23731M52765 = C23731.m52765(interfaceC22097ResolveSibling);
                        FutureC5767 futureC5767M52768 = c23731M52765.m52768();
                        if (C0861.f81831) {
                            futureC5767M12897 = futureC5767M52768.m12897(new RunnableC9941(1, interfaceC22097M20115of), C4081.f8988);
                            if (C1194.f82045 != 0) {
                                iM55680 = C0946.m55979("ܳ᩷") ^ i20;
                                i3 = ((iM55680 ^ i21) * (-32579)) ^ (-1630265817);
                                i6 = -2044003990;
                            } else {
                                iM55680 = C0873.m55680("۬ᩳ") ^ i21;
                                i3 = ((iM55680 ^ i20) * (-4383)) ^ 660364399;
                                i6 = -816398579;
                            }
                        } else {
                            iM55680 = C0873.m55680("ۛ۫") ^ i20;
                            i3 = ((iM55680 ^ i21) * 19613) ^ (-73428675);
                            i6 = -1102026429;
                        }
                        i7 = iM55680 ^ i6;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case -1128141393:
                    case 2094404252:
                        i24 = i24;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        sArr4 = sArr4;
                        switch (this.f79218) {
                            case 0:
                                iM55979 = C0873.m55680("᩺᩵") ^ i21;
                                i = ((iM55979 ^ i20) * (-5137)) ^ (-1996606223);
                                i2 = 1194736460;
                                break;
                            case 1:
                                iM55979 = C0873.m55680("᩶᩸") ^ i20;
                                i = ((iM55979 ^ i21) * 3379) ^ (-1178868531);
                                i2 = -619488466;
                                break;
                            default:
                                iM55979 = (C0946.m55979("ܽۗ") + i21) * 27;
                                i = ((iM55979 ^ i20) * (-14793)) ^ 844479980;
                                i2 = 677143296;
                                break;
                        }
                        int i214 = iM55979 ^ i2;
                        i22 = i;
                        sArr4 = sArr4;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i10 = i24;
                        i23 = i214;
                        i24 = i10;
                        break;
                    case -1052391809:
                    case 224795436:
                        ViewOnClickListenerC0939.m55941();
                        if (!C0955.f81898) {
                            i24 = i24;
                            str2 = strM55639;
                            interfaceC14770 = interfaceC14770M55950;
                            iM559711 = (C0946.m55979("᩵ۡ") + i21) * (-11);
                            i3 = ((iM559711 ^ i20) * (-26747)) ^ 671374950;
                            i5 = 1916842570;
                            i7 = iM559711 ^ i5;
                            interfaceC14770M55950 = interfaceC14770;
                            strM55639 = str2;
                            i10 = i24;
                            i23 = i7;
                            i22 = i3;
                            i24 = i10;
                        }
                        i24 = i24;
                        iM55680 = C0946.m55979("ܳ᩷") ^ i20;
                        i3 = ((iM55680 ^ i21) * (-32579)) ^ (-1630265817);
                        i6 = -2044003990;
                        i7 = iM55680 ^ i6;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case -910921338:
                    case 1277135860:
                        if (i14 == 0) {
                            str = strM55639;
                            interfaceC14771 = interfaceC14770M55950;
                            sArr2 = sArr4;
                        }
                        iM55681 = (C0873.m55680("֡ۙ") ^ i20) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((iM55681 ^ i21) * 15189) ^ 847426960;
                        i9 = -1892231234;
                        i23 = iM55681 ^ i9;
                        i22 = i8;
                        break;
                        break;
                    case -867332925:
                    case 341715022:
                        C0967.m56074();
                        if (C1012.f81938 < 0) {
                            iM55681 = C0946.m55979("֡᩹") ^ i21;
                            i8 = ((iM55681 ^ i20) * (-23103)) ^ (-220033413);
                            i9 = 524486372;
                            i23 = iM55681 ^ i9;
                            i22 = i8;
                        } else {
                            i24 = i24;
                            strM55639 = strM55639;
                            interfaceC14770M55950 = interfaceC14770M55950;
                            sArr4 = sArr4;
                            iM55979 = (i21 - C0873.m55680("᩶᩷")) * (-25);
                            i = ((iM55979 ^ i20) * 857) ^ 1592509352;
                            i2 = 2109547065;
                            int i215 = iM55979 ^ i2;
                            i22 = i;
                            sArr4 = sArr4;
                            strM55639 = strM55639;
                            interfaceC14770M55950 = interfaceC14770M55950;
                            i10 = i24;
                            i23 = i215;
                            i24 = i10;
                        }
                        break;
                    case -830237028:
                    case -514793290:
                        i24 = i24;
                        if (strM56460.startsWith(C0854.m55597(f83056, 17, 9, i25), i13)) {
                            iM55680 = (C0873.m55680("ܰ۬") ^ i21) * (-107);
                            i3 = ((iM55680 ^ i20) * 3671) ^ (-1506942055);
                            i6 = -149320489;
                        } else {
                            i14 = i12;
                            iM55680 = (C0873.m55680("᩹֫") + i20) * 91;
                            i3 = ((iM55680 ^ i21) * 24687) ^ (-1751309490);
                            i6 = 530690535;
                        }
                        i7 = iM55680 ^ i6;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case -563344093:
                    case -224849397:
                        ((ActivityC18686) obj).m42595();
                        break;
                    case -489291039:
                    case -167595825:
                        break;
                    case -409854446:
                    case 198896221:
                        i11 = iIndexOf + 3;
                        i13 = i11;
                        iM55680 = (C0873.m55680("۬ۚ") ^ i20) * 93;
                        i3 = ((iM55680 ^ i21) * 703) ^ 780382222;
                        i6 = 1783757346;
                        i7 = iM55680 ^ i6;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case -265094829:
                    case 1525253184:
                        RunnableC0871.m55672();
                        if (C0912.f81867 <= 0) {
                            iM55681 = (i20 - C0873.m55680("᩷֫")) * 35;
                            i8 = ((iM55681 ^ i21) * 11157) ^ 648003512;
                            i9 = -1743074330;
                            i23 = iM55681 ^ i9;
                            i22 = i8;
                        } else {
                            i24 = i24;
                            strM55639 = strM55639;
                            interfaceC14770M55950 = interfaceC14770M55950;
                            sArr4 = sArr4;
                            iM55979 = (i21 - C0873.m55680("᩶᩷")) * (-25);
                            i = ((iM55979 ^ i20) * 857) ^ 1592509352;
                            i2 = 2109547065;
                            int i216 = iM55979 ^ i2;
                            i22 = i;
                            sArr4 = sArr4;
                            strM55639 = strM55639;
                            interfaceC14770M55950 = interfaceC14770M55950;
                            i10 = i24;
                            i23 = i216;
                            i24 = i10;
                        }
                        break;
                    case -206139747:
                    case 145294422:
                        i24 = i24;
                        i14 = 5;
                        iM55680 = (C0873.m55680("᩹֫") + i20) * 91;
                        i3 = ((iM55680 ^ i21) * 24687) ^ (-1751309490);
                        i6 = 530690535;
                        i7 = iM55680 ^ i6;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case 84273547:
                    case 756789721:
                        i25 = 32705;
                        iM55979 = C0873.m55680("ۨᩳ") ^ i21;
                        i = ((iM55979 ^ i20) * 9257) ^ 281464112;
                        i2 = 1239664563;
                        int i217 = iM55979 ^ i2;
                        i22 = i;
                        sArr4 = sArr4;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i10 = i24;
                        i23 = i217;
                        i24 = i10;
                        break;
                    case 149146636:
                    case 1051381560:
                        i24 = i24;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        sArr4 = sArr4;
                        int i31 = s + s2;
                        if (i18 - (i31 * i31) >= 0) {
                            iM55979 = (C0873.m55680("ܿ᩸") ^ i20) * (-9);
                            i = ((iM55979 ^ i21) * (-2575)) ^ (-841717289);
                            i2 = -1408457783;
                        } else {
                            iM55979 = C0873.m55680("ۤܿ") ^ i20;
                            i = ((iM55979 ^ i21) * 9111) ^ (-1280864119);
                            i2 = 1776141241;
                        }
                        int i218 = iM55979 ^ i2;
                        i22 = i;
                        sArr4 = sArr4;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i10 = i24;
                        i23 = i218;
                        i24 = i10;
                        break;
                    case 252527426:
                    case 1708373372:
                        if (!zM55949) {
                            str = strM55639;
                            interfaceC14771 = interfaceC14770M55950;
                            sArr2 = sArr4;
                        }
                        iM55681 = (C0946.m55979("᩵ۙ") + i21) * (-113);
                        i8 = ((iM55681 ^ i20) * 26763) ^ 1576664333;
                        i9 = 656125539;
                        i23 = iM55681 ^ i9;
                        i22 = i8;
                        break;
                        break;
                    case 259244487:
                    case 1191643031:
                        i24 = i24;
                        i12 = 0;
                        if (i13 < C0882.m55719(strM56460)) {
                            iM55680 = (C0946.m55979("ۤ᩵") + i20) * 99;
                            i3 = ((iM55680 ^ i21) * 8021) ^ 914584067;
                            i6 = -1920135322;
                        } else {
                            iM55680 = (C0946.m55979("ۡۘ") ^ i21) * (-87);
                            i3 = ((iM55680 ^ i20) * 8037) ^ 1094268544;
                            i6 = 447173154;
                        }
                        i7 = iM55680 ^ i6;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case 261891340:
                    case 353823297:
                        break;
                    case 660541042:
                    case 2041138533:
                        i24 = i24;
                        str = strM55639;
                        interfaceC14771 = interfaceC14770M55950;
                        sArr2 = sArr4;
                        if (!C0898.m55799(strM56460, C0955.m56029(sArr2, 1, 3, i25))) {
                            sArr = sArr2;
                            iM559710 = C0873.m55680("ۤ֫") ^ i20;
                            i3 = ((iM559710 ^ i21) * 14023) ^ 721976285;
                            i4 = -1805075753;
                            i7 = iM559710 ^ i4;
                            sArr4 = sArr;
                            strM55639 = str;
                            interfaceC14770M55950 = interfaceC14771;
                            i10 = i24;
                            i23 = i7;
                            i22 = i3;
                            i24 = i10;
                        } else {
                            i24 = i24;
                        }
                        break;
                    case 824399710:
                    case 1759162438:
                        i24 = i24;
                        if (strM56460.startsWith(C0992.m56102(f83056, 12, 5, i25), i13)) {
                            iM55680 = (C0946.m55979("ܳ᩻") + i21) * (-7);
                            i3 = ((iM55680 ^ i20) * 28145) ^ (-355705893);
                            i6 = 1152136721;
                        } else {
                            iM55680 = C0946.m55979("ᩴܿ") ^ i20;
                            i3 = ((iM55680 ^ i21) * 307) ^ (-862359653);
                            i6 = 207944618;
                        }
                        i7 = iM55680 ^ i6;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case 908539323:
                    case 2083858192:
                        i24 = i24;
                        str2 = strM55639;
                        interfaceC14770 = interfaceC14770M55950;
                        abstractC17043 = (AbstractC17043) obj;
                        int i32 = ActivityC17874.f53400;
                        strM56460 = C1404.m56460(abstractC17043);
                        sArr4 = f83056;
                        if (C0877.f81843 >= 0) {
                            iM559711 = (C0946.m55979("᩵ۡ") + i21) * (-11);
                            i3 = ((iM559711 ^ i20) * (-26747)) ^ 671374950;
                            i5 = 1916842570;
                        } else {
                            iM559711 = (C0946.m55979("ۛۨ") + i20) * 7;
                            i3 = ((iM559711 ^ i21) * (-7261)) ^ (-1305319082);
                            i5 = 86945593;
                        }
                        i7 = iM559711 ^ i5;
                        interfaceC14770M55950 = interfaceC14770;
                        strM55639 = str2;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case 1279501579:
                    case 1321638840:
                        i24 = i24;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        sArr4 = sArr4;
                        sArr3 = f83056;
                        c = 0;
                        if (C1404.f82149 >= 0) {
                            iM55979 = (i21 - C0873.m55680("᩶᩷")) * (-25);
                            i = ((iM55979 ^ i20) * 857) ^ 1592509352;
                            i2 = 2109547065;
                        } else {
                            iM55979 = C0946.m55979("᩺᩶") ^ i21;
                            i = ((iM55979 ^ i20) * (-29363)) ^ (-2126204333);
                            i2 = 1469605494;
                        }
                        int i219 = iM55979 ^ i2;
                        i22 = i;
                        sArr4 = sArr4;
                        strM55639 = strM55639;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i10 = i24;
                        i23 = i219;
                        i24 = i10;
                        break;
                    case 1418898553:
                    case 2109085136:
                        i24 = i24;
                        i14 = 9;
                        iM55680 = (C0873.m55680("᩹֫") + i20) * 91;
                        i3 = ((iM55680 ^ i21) * 24687) ^ (-1751309490);
                        i6 = 530690535;
                        i7 = iM55680 ^ i6;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    case 1488126030:
                    case 1918269987:
                        break;
                    case 2036285895:
                    case 2133373931:
                        i24 = i24;
                        iIndexOf = strM56460.indexOf(C0927.m55863(f83056, 8, 4, i25));
                        if (iIndexOf < 0) {
                            iM55680 = C0873.m55680("ܶᩳ") ^ i21;
                            i3 = ((iM55680 ^ i20) * 21871) ^ 260879780;
                            i6 = 2006841585;
                        } else {
                            iM55680 = (C0946.m55979("ۨۢ") + i20) * (-115);
                            i3 = ((iM55680 ^ i21) * 2393) ^ 1354559285;
                            i6 = -2008339825;
                        }
                        i7 = iM55680 ^ i6;
                        i10 = i24;
                        i23 = i7;
                        i22 = i3;
                        i24 = i10;
                        break;
                    default:
                        C1044.m56286();
                        if (C1044.m56286() <= 0) {
                            iM55681 = C0873.m55680("ᩳ᩻") ^ i20;
                            i8 = ((iM55681 ^ i21) * (-15349)) ^ 1857144757;
                            i9 = -110475663;
                            i23 = iM55681 ^ i9;
                            i22 = i8;
                        } else {
                            i24 = i24;
                            iM55680 = C0873.m55680("ۛ۫") ^ i20;
                            i3 = ((iM55680 ^ i21) * 19613) ^ (-73428675);
                            i6 = -1102026429;
                            i7 = iM55680 ^ i6;
                            i10 = i24;
                            i23 = i7;
                            i22 = i3;
                            i24 = i10;
                        }
                        break;
                }
                return;
            }
            int iM559712 = C0946.m55979("ۧ۬") ^ i21;
            short[] sArr6 = sArr2;
            i22 = ((iM559712 ^ i20) * (-759)) ^ (-2084493568);
            i23 = iM559712 ^ (-88202370);
            sArr4 = sArr6;
            strM55639 = str;
        }
    }
}
