package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06A0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12152 extends C16483 {

    /* JADX INFO: renamed from: ֫ܶ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f82127 = {5201, -696, -666, -659, -662, -725, -663, -656, -725, -649, -659, -669, -662, -667, -656, -655, -650, -671, -725, -689, -659, -664, -664, -671, -650, -699, -652, -652, -664, -659, -665, -667, -656, -659, -661, -662};

    /* JADX INFO: renamed from: ֫ */
    public String f33970 = m28078();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C13493 f33971;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ String f33972;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f33973;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ String f33974;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ String f33975;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ String f33976;

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    /* JADX WARN: Code duplicated, block: B:25:0x0036  */
    /* JADX WARN: Code duplicated, block: B:40:0x0061  */
    /* JADX WARN: Code duplicated, block: B:43:0x0069  */
    /* JADX INFO: renamed from: ܽ */
    public static String m28078() {
        short[] sArr = f82127;
        if (C0882.f81846) {
            if (!C0861.f81831) {
                C1071.m56343();
                if (C1024.f81946) {
                    C0854.m55595();
                }
            } else {
                C1036.m56257();
                if (C1071.f81975 <= 0) {
                    C0854.m55595();
                } else {
                    C1071.m56343();
                    if (C1024.f81946) {
                        C0854.m55595();
                    }
                }
            }
        } else if (C1048.m56305() >= 0) {
            C0854.m55595();
        } else if (C0967.f81910 < 0) {
            if (C0861.f81831) {
                short s = sArr[0];
                if (C0890.f81849 == 0) {
                    if (AbstractC0942.m55971()) {
                        C1036.m56257();
                        if (C1071.f81975 <= 0) {
                            C1071.m56343();
                            if (C1024.f81946) {
                            }
                        }
                    } else {
                        int i = s + 12143;
                        int i2 = i * i;
                        if (C1024.m56209() < 0) {
                            int i3 = s * s;
                            if (C0912.f81867 > 0) {
                                int i4 = i3 + 147452449;
                                if (C0890.f81849 == 0) {
                                    int i5 = i2 - (i4 + i4) <= 0 ? 64772 : 3596;
                                    short[] sArr2 = f82127;
                                    if (C1036.m56257() > 0) {
                                        return C0854.m55597(sArr2, 1, 35, i5);
                                    }
                                }
                            }
                        } else if (!C0861.f81831) {
                            C1036.m56257();
                            if (C1071.f81975 <= 0) {
                            }
                        }
                        C1071.m56343();
                        if (C1024.f81946) {
                        }
                    }
                    C0854.m55595();
                }
            } else {
                C1071.m56343();
                if (C1024.f81946) {
                    C0854.m55595();
                }
            }
        } else if (!C0861.f81831) {
            C1071.m56343();
            if (C1024.f81946) {
                C0854.m55595();
            }
        } else {
            C1036.m56257();
            if (C1071.f81975 <= 0) {
                C0854.m55595();
            } else {
                C1071.m56343();
                if (C1024.f81946) {
                    C0854.m55595();
                }
            }
        }
        C0892.m55749();
        return null;
    }

    public C12152(C13493 c13493, String str, String str2, String str3, String str4, String str5) {
        this.f33971 = c13493;
        this.f33976 = str;
        this.f33974 = str2;
        this.f33972 = str3;
        this.f33975 = str4;
        this.f33973 = str5;
    }

    @Override // p067l.C16483
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19837 mo3630() {
        int i = -1047986873;
        int i2 = C0906.f81862;
        int i3 = C1053.f81965;
        int iM55979 = C0946.m55979("ۧ֨") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-25225)) ^ 1109348468;
        int i5 = 2031296372;
        while (true) {
            i = ((((i ^ i2) * (-31893)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1829634873:
                case 1297083901:
                    if (!C0882.f81846) {
                        if (C1964.f83032 > 0 && C1003.f81929 > 0) {
                            if (C1025.f81947 < 0) {
                                if (C1044.f81959 < 0 && C0946.f81894 == 0) {
                                    if (C1194.f82045 != 0) {
                                        iM55979 = C0873.m55680("ۡܶ") ^ i3;
                                        i4 = ((iM55979 ^ i2) * (-10231)) ^ (-1408948726);
                                        i5 = 1944201041;
                                    } else if (RunnableC0871.f81839 < 0) {
                                        final String str = this.f33976;
                                        if (C0892.f81851) {
                                            final String str2 = this.f33974;
                                            if (!C1929.m56553()) {
                                                final String str3 = this.f33972;
                                                final String str4 = this.f33975;
                                                return new InterfaceC19837(this) { // from class: l.۫۫ܽ

                                                    /* JADX INFO: renamed from: ᩵֡᩸, reason: not valid java name and contains not printable characters */
                                                    private static final short[] f82174 = {3106, 24485, 24485, 24485, 24521, 24532, 24527, 24513, 24527, 24520, 24537, 24534, 24519, 24530, 24526, 24485, 24485, 24485, 24485, 24485, 24485, 24533, 24527, 24513, 24520, 24519, 24530, 24531, 24532, 24515, 24537, 24516, 24519, 24533, 24515, 24496, 24498, 24485, 24485, 24485, 24485, 24485, 24485, 24515, 24542, 24530, 24532, 24519, 24517, 24530, 24537, 24534, 24519, 24530, 24526, 24485, 24485, 24485, 24485, 24485, 24485, 24534, 24519, 24517, 24525, 24519, 24513, 24515, 24537, 24520, 24519, 24523, 24515, 24485, 24485, 24485, 24485, 24485, 24485, 24522, 24527, 24516, 24532, 24519, 24532, 24543, 24537, 24520, 24519, 24523, 24515, 24485, 24485, 24485};

                                                    /* JADX INFO: renamed from: ֫ */
                                                    public final /* synthetic */ C12152 f40390;

                                                    {
                                                        int i6 = 2005162213;
                                                        int i7 = C0992.f81922;
                                                        int i8 = C1404.f82149;
                                                        int iM55680 = (i8 - C0873.m55680("᩸ܺ")) * 119;
                                                        int i9 = ((iM55680 ^ i7) * 11975) ^ (-1908497370);
                                                        int i10 = -1860087627;
                                                        while (true) {
                                                            i6 = ((((i6 ^ i7) * 19155) >> 31) & i9) ^ (iM55680 ^ i10);
                                                            switch (i6) {
                                                                case -1918371375:
                                                                case -1311423286:
                                                                    return;
                                                                case -1915919777:
                                                                case 1535985688:
                                                                    if (C0882.m55710() != 0) {
                                                                        iM55680 = C0873.m55680("ᩳۨ") ^ i7;
                                                                        i9 = ((iM55680 ^ i8) * (-27113)) ^ 910587653;
                                                                        i10 = 84338652;
                                                                    } else {
                                                                        iM55680 = C0873.m55680("ۨ֡") ^ i7;
                                                                        i9 = ((iM55680 ^ i8) * (-4435)) ^ (-223045493);
                                                                        i10 = 529625111;
                                                                    }
                                                                    break;
                                                                case -1370262565:
                                                                case 1434965626:
                                                                    if (C1124.m56367() >= 0) {
                                                                        iM55680 = (i8 - C0873.m55680("ۚۤ")) * 21;
                                                                        i9 = ((iM55680 ^ i7) * 3889) ^ 2133344654;
                                                                        i10 = 803767542;
                                                                    } else {
                                                                        iM55680 = (C0946.m55979("᩵ܳ") ^ i8) * (-91);
                                                                        i9 = ((iM55680 ^ i7) * (-9047)) ^ (-1469312361);
                                                                        i10 = 595681197;
                                                                    }
                                                                    break;
                                                                case -1295788489:
                                                                case 218424140:
                                                                    if (C0989.f81920 >= 0) {
                                                                        iM55680 = (i8 - C0873.m55680("ۚۤ")) * 21;
                                                                        i9 = ((iM55680 ^ i7) * 3889) ^ 2133344654;
                                                                        i10 = 803767542;
                                                                    } else {
                                                                        iM55680 = (C0873.m55680("۫ܺ") + i8) * (-73);
                                                                        i9 = ((iM55680 ^ i7) * 1533) ^ (-630544446);
                                                                        i10 = -233021140;
                                                                    }
                                                                    break;
                                                                case -1262104618:
                                                                case 1138859896:
                                                                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                                                                        iM55680 = C0873.m55680("ᩳۨ") ^ i7;
                                                                        i9 = ((iM55680 ^ i8) * (-27113)) ^ 910587653;
                                                                        i10 = 84338652;
                                                                    } else {
                                                                        iM55680 = (i7 - C0946.m55979("۫ܶ")) * 21;
                                                                        i9 = ((iM55680 ^ i8) * (-10297)) ^ 2143806834;
                                                                        i10 = -797093262;
                                                                    }
                                                                    break;
                                                                case -1226590585:
                                                                case 567534586:
                                                                    if (C0877.f81843 >= 0) {
                                                                        iM55680 = (C0873.m55680("۟ᩴ") ^ i8) * 65;
                                                                        i9 = ((iM55680 ^ i7) * (-9497)) ^ (-135728944);
                                                                        i10 = 1036101866;
                                                                    } else {
                                                                        iM55680 = (C0946.m55979("ܺۨ") ^ i8) * 109;
                                                                        i9 = ((iM55680 ^ i7) * (-6699)) ^ (-1944021147);
                                                                        i10 = -604380107;
                                                                    }
                                                                    break;
                                                                case -1067434328:
                                                                case 1217117740:
                                                                    if (ServiceConnectionC1013.m56157() <= 0) {
                                                                        iM55680 = (C0873.m55680("۟ᩴ") ^ i8) * 65;
                                                                        i9 = ((iM55680 ^ i7) * (-9497)) ^ (-135728944);
                                                                        i10 = 1036101866;
                                                                    } else {
                                                                        iM55680 = C0873.m55680("֫ۚ") ^ i8;
                                                                        i9 = ((iM55680 ^ i7) * 16569) ^ (-541439759);
                                                                        i10 = -1515076607;
                                                                    }
                                                                    break;
                                                                case -817373540:
                                                                case -484609437:
                                                                    if (C0890.f81849 == 0) {
                                                                        iM55680 = C0873.m55680("ᩳۨ") ^ i7;
                                                                        i9 = ((iM55680 ^ i8) * (-27113)) ^ 910587653;
                                                                        i10 = 84338652;
                                                                    } else {
                                                                        iM55680 = (C0946.m55979("ܿۛ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                                        i9 = ((iM55680 ^ i8) * 20207) ^ 1096758849;
                                                                        i10 = -988017026;
                                                                    }
                                                                    break;
                                                                case -566520674:
                                                                case 1938863820:
                                                                    if (RunnableC0871.f81839 >= 0) {
                                                                        iM55680 = C0873.m55680("ᩳۨ") ^ i7;
                                                                        i9 = ((iM55680 ^ i8) * (-27113)) ^ 910587653;
                                                                        i10 = 84338652;
                                                                    } else {
                                                                        iM55680 = C0873.m55680("ۘ֨") ^ i7;
                                                                        i9 = ((iM55680 ^ i8) * 12371) ^ 967347898;
                                                                        i10 = 1499766774;
                                                                    }
                                                                    break;
                                                                case -491876653:
                                                                case 2024666127:
                                                                    if (C1929.f83011 != 0) {
                                                                        iM55680 = (C0873.m55680("۟ᩴ") ^ i8) * 65;
                                                                        i9 = ((iM55680 ^ i7) * (-9497)) ^ (-135728944);
                                                                        i10 = 1036101866;
                                                                    } else {
                                                                        iM55680 = C0946.m55979("᩸ۢ") ^ i8;
                                                                        i9 = ((iM55680 ^ i7) * 11095) ^ 587887814;
                                                                        i10 = -866148061;
                                                                    }
                                                                    break;
                                                                case -391883527:
                                                                case 1125177283:
                                                                    if (C1071.f81975 > 0) {
                                                                        iM55680 = C0873.m55680("֫ۚ") ^ i8;
                                                                        i9 = ((iM55680 ^ i7) * 16569) ^ (-541439759);
                                                                        i10 = -1515076607;
                                                                    } else {
                                                                        iM55680 = (C0946.m55979("ܿۛ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                                        i9 = ((iM55680 ^ i8) * 20207) ^ 1096758849;
                                                                        i10 = -988017026;
                                                                    }
                                                                    break;
                                                                case -231726498:
                                                                case 343448772:
                                                                    if (C0989.m56095() <= 0) {
                                                                        iM55680 = C0873.m55680("ᩳۨ") ^ i7;
                                                                        i9 = ((iM55680 ^ i8) * (-27113)) ^ 910587653;
                                                                        i10 = 84338652;
                                                                    } else {
                                                                        iM55680 = C0873.m55680("ۢܳ") ^ i7;
                                                                        i9 = ((iM55680 ^ i8) * 13901) ^ 114701954;
                                                                        i10 = 1600291670;
                                                                    }
                                                                    break;
                                                                case 255206659:
                                                                case 1436168015:
                                                                    this.f40390 = this;
                                                                    if (C1053.f81965 <= 0) {
                                                                        iM55680 = C0873.m55680("ᩳۨ") ^ i7;
                                                                        i9 = ((iM55680 ^ i8) * (-27113)) ^ 910587653;
                                                                        i10 = 84338652;
                                                                    } else {
                                                                        iM55680 = C0873.m55680("ۙۨ") ^ i7;
                                                                        i9 = ((iM55680 ^ i8) * (-22223)) ^ 77730223;
                                                                        i10 = 252697612;
                                                                    }
                                                                    break;
                                                                case 410434933:
                                                                case 1173451993:
                                                                    if (AbstractC0942.f81890 <= 0) {
                                                                        iM55680 = (C0946.m55979("ܿۛ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                                        i9 = ((iM55680 ^ i8) * 20207) ^ 1096758849;
                                                                        i10 = -988017026;
                                                                    } else {
                                                                        iM55680 = C0946.m55979("ܶۙ") ^ i8;
                                                                        i9 = ((iM55680 ^ i7) * (-19721)) ^ (-1198068597);
                                                                        i10 = 168908225;
                                                                    }
                                                                    break;
                                                                case 546292851:
                                                                case 1497869322:
                                                                    C1025.m56230();
                                                                    C0937.m55918();
                                                                    throw new RuntimeException();
                                                                default:
                                                                    C1036.m56257();
                                                                    C0845.m55584();
                                                                    iM55680 = (C0946.m55979("ܿۛ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                                    i9 = ((iM55680 ^ i8) * 20207) ^ 1096758849;
                                                                    i10 = -988017026;
                                                                    break;
                                                            }
                                                        }
                                                    }

                                                    @Override // p067l.InterfaceC19837
                                                    /* JADX INFO: renamed from: ֫ */
                                                    public final Object mo6575(Object obj) {
                                                        int iM559710;
                                                        int i6;
                                                        int i7;
                                                        byte b;
                                                        int i8;
                                                        int i9;
                                                        C12152 c12152;
                                                        int iM55680;
                                                        int i10;
                                                        int i11;
                                                        int iM55681;
                                                        int i12;
                                                        C12152 c12153;
                                                        int iM559711;
                                                        int i13;
                                                        int i14;
                                                        C14163 c14163 = this;
                                                        C12152 c12154 = null;
                                                        String string = null;
                                                        byte b2 = 0;
                                                        int i15 = 0;
                                                        int i16 = 510622835;
                                                        int i17 = C0912.f81867;
                                                        int i18 = C0906.f81862;
                                                        int iM559712 = (C0946.m55979("֫ܶ") + i17) * (-63);
                                                        int i19 = ((iM559712 ^ i18) * 1615) ^ (-1963669853);
                                                        int i20 = iM559712 ^ (-751674699);
                                                        short[] sArr = null;
                                                        short[] sArr2 = null;
                                                        short[] sArr3 = null;
                                                        int i21 = 0;
                                                        int i22 = 0;
                                                        int i23 = 0;
                                                        int i24 = 0;
                                                        int i25 = 0;
                                                        int i26 = 0;
                                                        byte b3 = 0;
                                                        char c = 0;
                                                        int i27 = 0;
                                                        int i28 = 0;
                                                        int i29 = 0;
                                                        short s = 0;
                                                        short s2 = 0;
                                                        int i30 = 0;
                                                        InterfaceC16954 interfaceC16954 = null;
                                                        int i31 = 0;
                                                        short[] sArr4 = null;
                                                        short[] sArr5 = null;
                                                        while (true) {
                                                            i16 = i20 ^ (i19 & (((i16 ^ i18) * (-24075)) >> 31));
                                                            switch (i16) {
                                                                case -2083215350:
                                                                case -1727869179:
                                                                    c12154 = c12154;
                                                                    i30 = i30;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    sArr4 = f82174;
                                                                    if (C0992.f81922 >= 0) {
                                                                        iM55681 = (i18 - C0946.m55979("ۘۧ")) * 39;
                                                                        i19 = ((iM55681 ^ i17) * 2291) ^ 1609508960;
                                                                        i12 = 1278892383;
                                                                    } else {
                                                                        iM55681 = C0873.m55680("᩷ۛ") ^ i17;
                                                                        i19 = ((iM55681 ^ i18) * (-2893)) ^ (-1226382588);
                                                                        i12 = 1900952316;
                                                                    }
                                                                    int i32 = iM55681 ^ i12;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12154;
                                                                    i20 = i32;
                                                                    c14163 = this;
                                                                    break;
                                                                case -2056814981:
                                                                case -1241176460:
                                                                    c12154 = c12154;
                                                                    sArr3 = f82174;
                                                                    i21 = 58;
                                                                    i26 = 18;
                                                                    if (C0937.f81884) {
                                                                        iM55680 = C0873.m55680("ۚᩴ") ^ i17;
                                                                        i10 = ((iM55680 ^ i18) * 22465) ^ 1362975136;
                                                                        i11 = 1521014794;
                                                                    } else {
                                                                        iM55680 = (C0946.m55979("ۚ۫") ^ i17) * (-25);
                                                                        i10 = ((iM55680 ^ i18) * 1559) ^ (-182872303);
                                                                        i11 = -1022273904;
                                                                    }
                                                                    c12152 = c12154;
                                                                    i20 = iM55680 ^ i11;
                                                                    i19 = i10;
                                                                    c12154 = c12152;
                                                                    break;
                                                                case -1995692943:
                                                                case -1419015309:
                                                                    i15 = 24454;
                                                                    iM55681 = C0946.m55979("᩷۬") ^ i17;
                                                                    i19 = ((iM55681 ^ i18) * (-21361)) ^ 1379021101;
                                                                    i12 = 1199576148;
                                                                    int i33 = iM55681 ^ i12;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12154;
                                                                    i20 = i33;
                                                                    c14163 = this;
                                                                    break;
                                                                case -1940280249:
                                                                case -1693266076:
                                                                    c12154 = c12154;
                                                                    if (ViewOnClickListenerC0939.m55949(string, C0906.m55810(sArr2, i25, i23, i15))) {
                                                                        iM55680 = C0873.m55680("ۛ᩶") ^ i17;
                                                                        i10 = ((iM55680 ^ i18) * (-13705)) ^ (-285487402);
                                                                        i11 = 464059266;
                                                                        c12152 = c12154;
                                                                        i20 = iM55680 ^ i11;
                                                                        i19 = i10;
                                                                        c12154 = c12152;
                                                                    }
                                                                    i30 = i30;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    b = b3;
                                                                    b2 = b;
                                                                    b3 = b2;
                                                                    iM559710 = C0873.m55680("ܺᩳ") ^ i18;
                                                                    i6 = ((iM559710 ^ i17) * (-5783)) ^ (-1257391985);
                                                                    i7 = -2046503384;
                                                                    int i34 = iM559710 ^ i7;
                                                                    i31 = i31;
                                                                    c12152 = c12154;
                                                                    i20 = i34;
                                                                    i19 = i6;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12152;
                                                                    break;
                                                                case -1856394433:
                                                                case 2114065942:
                                                                    b2 = 3;
                                                                    i21 = i21;
                                                                    iM559710 = C0873.m55680("ܺᩳ") ^ i18;
                                                                    i6 = ((iM559710 ^ i17) * (-5783)) ^ (-1257391985);
                                                                    i7 = -2046503384;
                                                                    int i35 = iM559710 ^ i7;
                                                                    i31 = i31;
                                                                    c12152 = c12154;
                                                                    i20 = i35;
                                                                    i19 = i6;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12152;
                                                                    break;
                                                                case -1845329676:
                                                                case 2074256581:
                                                                    b2 = 0;
                                                                    i21 = i21;
                                                                    iM559710 = C0873.m55680("ܺᩳ") ^ i18;
                                                                    i6 = ((iM559710 ^ i17) * (-5783)) ^ (-1257391985);
                                                                    i7 = -2046503384;
                                                                    int i36 = iM559710 ^ i7;
                                                                    i31 = i31;
                                                                    c12152 = c12154;
                                                                    i20 = i36;
                                                                    i19 = i6;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12152;
                                                                    break;
                                                                case -1754509936:
                                                                case -1402750737:
                                                                    return new C12302(str3);
                                                                case -1747961991:
                                                                case -806314395:
                                                                    c12154 = c12154;
                                                                    i30 = i30;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    string = interfaceC16954.getString();
                                                                    if (C0989.f81920 < 0) {
                                                                        iM559710 = (i17 - C0946.m55979("۟᩻")) * (-113);
                                                                        i6 = ((iM559710 ^ i18) * (-20147)) ^ 478085294;
                                                                        i7 = 655254336;
                                                                        int i37 = iM559710 ^ i7;
                                                                        i31 = i31;
                                                                        c12152 = c12154;
                                                                        i20 = i37;
                                                                        i19 = i6;
                                                                        i21 = i21;
                                                                        i30 = i30;
                                                                        c12154 = c12152;
                                                                    } else {
                                                                        iM55681 = (C0873.m55680("ۙۜ") + i17) * 127;
                                                                        i19 = ((iM55681 ^ i18) * 16067) ^ 1615079725;
                                                                        i12 = 1121079955;
                                                                        int i38 = iM55681 ^ i12;
                                                                        i31 = i31;
                                                                        i21 = i21;
                                                                        i30 = i30;
                                                                        c12154 = c12154;
                                                                        i20 = i38;
                                                                        c14163 = this;
                                                                    }
                                                                    break;
                                                                case -1727987442:
                                                                case 71955605:
                                                                    i30 = i30;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    interfaceC16954 = (InterfaceC16954) obj;
                                                                    c12153 = c14163.f40390;
                                                                    AbstractC0942.m55962(c12153);
                                                                    if (C0989.m56095() > 0) {
                                                                        int iM55682 = C0873.m55680("ۙܰ") ^ i18;
                                                                        int i39 = ((iM55682 ^ i17) * (-15589)) ^ (-891603452);
                                                                        i20 = iM55682 ^ 1626927929;
                                                                        i31 = i31;
                                                                        i21 = i21;
                                                                        i30 = i30;
                                                                        c12154 = c12153;
                                                                        i19 = i39;
                                                                        c14163 = this;
                                                                    } else {
                                                                        int iM55683 = (C0873.m55680("֨֫") + i18) * (-73);
                                                                        int i40 = ((iM55683 ^ i17) * (-26869)) ^ (-1941657283);
                                                                        i20 = iM55683 ^ 1590370617;
                                                                        c14163 = this;
                                                                        i31 = i31;
                                                                        int i41 = i30;
                                                                        c12154 = c12153;
                                                                        i19 = i40;
                                                                        i21 = i21;
                                                                        i30 = i41;
                                                                    }
                                                                    break;
                                                                case -1710261718:
                                                                case 872158209:
                                                                    return interfaceC16954;
                                                                case -1662552829:
                                                                case -1343762325:
                                                                    return new C12302(str);
                                                                case -1571505581:
                                                                case 240760730:
                                                                    RunnableC0938.m55938();
                                                                    C1017.m56187();
                                                                    return null;
                                                                case -1427793615:
                                                                case -773183670:
                                                                    C0854.m55595();
                                                                    if (C0863.f81833 <= 0) {
                                                                        c12154 = c12154;
                                                                        i30 = i30;
                                                                        i31 = i31;
                                                                        i21 = i21;
                                                                        iM55681 = (i18 - C0946.m55979("ۘۧ")) * 39;
                                                                        i19 = ((iM55681 ^ i17) * 2291) ^ 1609508960;
                                                                        i12 = 1278892383;
                                                                        int i310 = iM55681 ^ i12;
                                                                        i31 = i31;
                                                                        i21 = i21;
                                                                        i30 = i30;
                                                                        c12154 = c12154;
                                                                        i20 = i310;
                                                                        c14163 = this;
                                                                    } else {
                                                                        iM559711 = (C0873.m55680("۫ۡ") + i17) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                        i13 = ((iM559711 ^ i18) * (-17707)) ^ 993625420;
                                                                        i14 = 618918764;
                                                                        i20 = iM559711 ^ i14;
                                                                        i19 = i13;
                                                                    }
                                                                    break;
                                                                case -1339839321:
                                                                case 1482870509:
                                                                    b2 = 2;
                                                                    i21 = i21;
                                                                    iM559710 = C0873.m55680("ܺᩳ") ^ i18;
                                                                    i6 = ((iM559710 ^ i17) * (-5783)) ^ (-1257391985);
                                                                    i7 = -2046503384;
                                                                    int i311 = iM559710 ^ i7;
                                                                    i31 = i31;
                                                                    c12152 = c12154;
                                                                    i20 = i311;
                                                                    i19 = i6;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12152;
                                                                    break;
                                                                case -1338919825:
                                                                case -166878064:
                                                                    c12154 = c12154;
                                                                    if (ViewOnClickListenerC0939.m55949(string, C0947.m55993(sArr5, i22, i24, i15))) {
                                                                        iM55680 = (C0873.m55680("۬ܽ") + i18) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                                        i10 = ((iM55680 ^ i17) * (-26627)) ^ (-914283890);
                                                                        i11 = 258254475;
                                                                        c12152 = c12154;
                                                                        i20 = iM55680 ^ i11;
                                                                        i19 = i10;
                                                                        c12154 = c12152;
                                                                    }
                                                                    i30 = i30;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    b = b3;
                                                                    b2 = b;
                                                                    b3 = b2;
                                                                    iM559710 = C0873.m55680("ܺᩳ") ^ i18;
                                                                    i6 = ((iM559710 ^ i17) * (-5783)) ^ (-1257391985);
                                                                    i7 = -2046503384;
                                                                    int i312 = iM559710 ^ i7;
                                                                    i31 = i31;
                                                                    c12152 = c12154;
                                                                    i20 = i312;
                                                                    i19 = i6;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12152;
                                                                    break;
                                                                case -1282330463:
                                                                case 886090280:
                                                                    c12154 = c12154;
                                                                    i30 = i30;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    AbstractC0942.m55962(string);
                                                                    b3 = -1;
                                                                    switch (C0946.m55979(string)) {
                                                                        case 463632360:
                                                                            iM559710 = C0873.m55680("ۙᩴ") ^ i18;
                                                                            i6 = ((iM559710 ^ i17) * 24633) ^ (-205822861);
                                                                            i7 = 1249070210;
                                                                            break;
                                                                        case 902227082:
                                                                            iM559710 = C0873.m55680("۬ᩳ") ^ i18;
                                                                            i6 = ((iM559710 ^ i17) * (-3801)) ^ 1130037716;
                                                                            i7 = 1639899118;
                                                                            break;
                                                                        case 1078932861:
                                                                            iM559710 = (C0946.m55979("ۗۢ") ^ i18) * (-13);
                                                                            i6 = ((iM559710 ^ i17) * 13925) ^ (-1331421282);
                                                                            i7 = 1049819783;
                                                                            break;
                                                                        case 2083749916:
                                                                            iM559710 = (C0873.m55680("᩶ܿ") ^ i18) * 95;
                                                                            i6 = ((iM559710 ^ i17) * 19627) ^ (-709875679);
                                                                            i7 = 1129097578;
                                                                            break;
                                                                        case 2139958161:
                                                                            iM559710 = C0946.m55979("ۢۜ") ^ i18;
                                                                            i6 = ((iM559710 ^ i17) * 559) ^ (-1662902746);
                                                                            i7 = -1890098256;
                                                                            break;
                                                                        default:
                                                                            b = -1;
                                                                            b2 = b;
                                                                            b3 = b2;
                                                                            iM559710 = C0873.m55680("ܺᩳ") ^ i18;
                                                                            i6 = ((iM559710 ^ i17) * (-5783)) ^ (-1257391985);
                                                                            i7 = -2046503384;
                                                                            break;
                                                                    }
                                                                    int i313 = iM559710 ^ i7;
                                                                    i31 = i31;
                                                                    c12152 = c12154;
                                                                    i20 = i313;
                                                                    i19 = i6;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12152;
                                                                    break;
                                                                case -1188482077:
                                                                case 1585515176:
                                                                    return new C12302(str4);
                                                                case -1095705723:
                                                                case -444918766:
                                                                    c12154 = c12154;
                                                                    i8 = i21;
                                                                    sArr = f82174;
                                                                    i31 = 1;
                                                                    i9 = 17;
                                                                    if (!C1048.f81963) {
                                                                        int iM55684 = (i17 - C0873.m55680("᩶ۘ")) * 85;
                                                                        int i42 = i8;
                                                                        i30 = i9;
                                                                        i19 = ((iM55684 ^ i18) * 21575) ^ (-1938622376);
                                                                        i21 = i42;
                                                                        C12152 c12155 = c12154;
                                                                        i20 = iM55684 ^ 870651851;
                                                                        c12154 = c12155;
                                                                    } else {
                                                                        int iM559713 = C0946.m55979("۫ܿ") ^ i17;
                                                                        i19 = ((iM559713 ^ i18) * 6649) ^ 781514092;
                                                                        i21 = i8;
                                                                        i30 = 17;
                                                                        c12152 = c12154;
                                                                        i20 = iM559713 ^ 1468966304;
                                                                        c12154 = c12152;
                                                                    }
                                                                    break;
                                                                case -1063389903:
                                                                case 1281291447:
                                                                    b2 = 1;
                                                                    i21 = i21;
                                                                    iM559710 = C0873.m55680("ܺᩳ") ^ i18;
                                                                    i6 = ((iM559710 ^ i17) * (-5783)) ^ (-1257391985);
                                                                    i7 = -2046503384;
                                                                    int i314 = iM559710 ^ i7;
                                                                    i31 = i31;
                                                                    c12152 = c12154;
                                                                    i20 = i314;
                                                                    i19 = i6;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12152;
                                                                    break;
                                                                case -1027731459:
                                                                case 570458311:
                                                                    c12154 = c12154;
                                                                    sArr2 = f82174;
                                                                    i25 = 40;
                                                                    i23 = 18;
                                                                    if (C0912.f81867 <= 0) {
                                                                        iM55680 = C0946.m55979("ܶ᩶") ^ i18;
                                                                        i10 = ((iM55680 ^ i17) * (-29403)) ^ (-1225089056);
                                                                        i11 = 2128767841;
                                                                    } else {
                                                                        iM55680 = C0946.m55979("ۙ֡") ^ i17;
                                                                        i10 = ((iM55680 ^ i18) * 30731) ^ 1739449502;
                                                                        i11 = -656880360;
                                                                    }
                                                                    c12152 = c12154;
                                                                    i20 = iM55680 ^ i11;
                                                                    i19 = i10;
                                                                    c12154 = c12152;
                                                                    break;
                                                                case -851409165:
                                                                case -108983882:
                                                                    b2 = 4;
                                                                    i21 = i21;
                                                                    iM559710 = C0873.m55680("ܺᩳ") ^ i18;
                                                                    i6 = ((iM559710 ^ i17) * (-5783)) ^ (-1257391985);
                                                                    i7 = -2046503384;
                                                                    int i315 = iM559710 ^ i7;
                                                                    i31 = i31;
                                                                    c12152 = c12154;
                                                                    i20 = i315;
                                                                    i19 = i6;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12152;
                                                                    break;
                                                                case -826894142:
                                                                case 664437022:
                                                                    c12154 = c12154;
                                                                    sArr5 = f82174;
                                                                    i22 = 18;
                                                                    i24 = 22;
                                                                    if (C1071.f81975 > 0) {
                                                                        iM55680 = (C0873.m55680("۟۠") + i17) * (-77);
                                                                        i10 = ((iM55680 ^ i18) * (-26571)) ^ (-1866861877);
                                                                        i11 = 730359200;
                                                                        c12152 = c12154;
                                                                        i20 = iM55680 ^ i11;
                                                                        i19 = i10;
                                                                        c12154 = c12152;
                                                                    } else {
                                                                        i9 = i30;
                                                                        i8 = i21;
                                                                        int iM55685 = (i17 - C0873.m55680("᩶ۘ")) * 85;
                                                                        int i43 = i8;
                                                                        i30 = i9;
                                                                        i19 = ((iM55685 ^ i18) * 21575) ^ (-1938622376);
                                                                        i21 = i43;
                                                                        C12152 c12156 = c12154;
                                                                        i20 = iM55685 ^ 870651851;
                                                                        c12154 = c12156;
                                                                    }
                                                                    break;
                                                                case -787228991:
                                                                case 425913668:
                                                                    c12154 = c12154;
                                                                    if (C0906.m55806(string, C1929.m56558(sArr3, i21, i26, i15))) {
                                                                        iM55680 = (C0946.m55979("֨᩹") + i18) * (-123);
                                                                        i10 = ((iM55680 ^ i17) * (-16437)) ^ (-1317144575);
                                                                        i11 = 2000038611;
                                                                        c12152 = c12154;
                                                                        i20 = iM55680 ^ i11;
                                                                        i19 = i10;
                                                                        c12154 = c12152;
                                                                    }
                                                                    i30 = i30;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    b = b3;
                                                                    b2 = b;
                                                                    b3 = b2;
                                                                    iM559710 = C0873.m55680("ܺᩳ") ^ i18;
                                                                    i6 = ((iM559710 ^ i17) * (-5783)) ^ (-1257391985);
                                                                    i7 = -2046503384;
                                                                    int i316 = iM559710 ^ i7;
                                                                    i31 = i31;
                                                                    c12152 = c12154;
                                                                    i20 = i316;
                                                                    i19 = i6;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12152;
                                                                    break;
                                                                case -683750395:
                                                                case 1896484933:
                                                                    c12154 = c12154;
                                                                    i30 = i30;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    int i44 = i27 + i28;
                                                                    i29 = i44 + i44;
                                                                    s2 = 8777;
                                                                    if (!RunnableC0897.f81856) {
                                                                        c12153 = c12154;
                                                                        int iM55686 = (C0873.m55680("֨֫") + i18) * (-73);
                                                                        int i45 = ((iM55686 ^ i17) * (-26869)) ^ (-1941657283);
                                                                        i20 = iM55686 ^ 1590370617;
                                                                        c14163 = this;
                                                                        i31 = i31;
                                                                        int i46 = i30;
                                                                        c12154 = c12153;
                                                                        i19 = i45;
                                                                        i21 = i21;
                                                                        i30 = i46;
                                                                    } else {
                                                                        iM55681 = (C0946.m55979("ᩴ᩸") + i18) * (-69);
                                                                        i19 = ((iM55681 ^ i17) * (-24039)) ^ 1457318523;
                                                                        i12 = -1111119031;
                                                                        int i317 = iM55681 ^ i12;
                                                                        i31 = i31;
                                                                        i21 = i21;
                                                                        i30 = i30;
                                                                        c12154 = c12154;
                                                                        i20 = i317;
                                                                        c14163 = this;
                                                                    }
                                                                    break;
                                                                case -668341003:
                                                                case 1157033330:
                                                                    c12154 = c12154;
                                                                    i30 = i30;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    s = sArr4[c];
                                                                    i27 = s * s;
                                                                    i28 = 77035729;
                                                                    if (C1071.f81975 <= 0) {
                                                                        iM55681 = (C0873.m55680("ۙۜ") + i17) * 127;
                                                                        i19 = ((iM55681 ^ i18) * 16067) ^ 1615079725;
                                                                        i12 = 1121079955;
                                                                    } else {
                                                                        iM55681 = (C0946.m55979("ܰۛ") ^ i17) * (-75);
                                                                        i19 = ((iM55681 ^ i18) * 25911) ^ 988199200;
                                                                        i12 = -192868466;
                                                                    }
                                                                    int i318 = iM55681 ^ i12;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12154;
                                                                    i20 = i318;
                                                                    c14163 = this;
                                                                    break;
                                                                case -654806626:
                                                                case 1028019807:
                                                                    if (C1194.f82045 != 0) {
                                                                        c12154 = c12154;
                                                                        i30 = i30;
                                                                        i31 = i31;
                                                                        i21 = i21;
                                                                        iM55681 = C0946.m55979("᩷ܿ") ^ i18;
                                                                        i19 = ((iM55681 ^ i17) * (-23125)) ^ 903270789;
                                                                        i12 = -831844160;
                                                                        int i319 = iM55681 ^ i12;
                                                                        i31 = i31;
                                                                        i21 = i21;
                                                                        i30 = i30;
                                                                        c12154 = c12154;
                                                                        i20 = i319;
                                                                        c14163 = this;
                                                                    } else {
                                                                        c12153 = c12154;
                                                                        i30 = i30;
                                                                        i31 = i31;
                                                                        i21 = i21;
                                                                        int iM55687 = (C0873.m55680("֨֫") + i18) * (-73);
                                                                        int i47 = ((iM55687 ^ i17) * (-26869)) ^ (-1941657283);
                                                                        i20 = iM55687 ^ 1590370617;
                                                                        c14163 = this;
                                                                        i31 = i31;
                                                                        int i48 = i30;
                                                                        c12154 = c12153;
                                                                        i19 = i47;
                                                                        i21 = i21;
                                                                        i30 = i48;
                                                                    }
                                                                    break;
                                                                case -522324390:
                                                                case 577749329:
                                                                    if (!C0917.f81868) {
                                                                        c12154 = c12154;
                                                                        i30 = i30;
                                                                        i31 = i31;
                                                                        i21 = i21;
                                                                        iM55681 = C0946.m55979("᩷ܿ") ^ i18;
                                                                        i19 = ((iM55681 ^ i17) * (-23125)) ^ 903270789;
                                                                        i12 = -831844160;
                                                                        int i3110 = iM55681 ^ i12;
                                                                        i31 = i31;
                                                                        i21 = i21;
                                                                        i30 = i30;
                                                                        c12154 = c12154;
                                                                        i20 = i3110;
                                                                        c14163 = this;
                                                                    } else {
                                                                        c12154 = c12154;
                                                                        i9 = i30;
                                                                        i8 = i21;
                                                                        int iM55688 = (i17 - C0873.m55680("᩶ۘ")) * 85;
                                                                        int i49 = i8;
                                                                        i30 = i9;
                                                                        i19 = ((iM55688 ^ i18) * 21575) ^ (-1938622376);
                                                                        i21 = i49;
                                                                        C12152 c12157 = c12154;
                                                                        i20 = iM55688 ^ 870651851;
                                                                        c12154 = c12157;
                                                                    }
                                                                    break;
                                                                case -435668965:
                                                                case 1695073035:
                                                                    RunnableC0871.m55672();
                                                                    if (C0877.f81843 >= 0) {
                                                                        iM559711 = (C0873.m55680("۫ۡ") + i17) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                        i13 = ((iM559711 ^ i18) * (-17707)) ^ 993625420;
                                                                        i14 = 618918764;
                                                                    } else {
                                                                        iM559711 = (C0873.m55680("֨᩺") + i17) * 13;
                                                                        i13 = ((iM559711 ^ i18) * (-1025)) ^ (-213421194);
                                                                        i14 = 368202632;
                                                                    }
                                                                    i20 = iM559711 ^ i14;
                                                                    i19 = i13;
                                                                    break;
                                                                case -92651471:
                                                                case 1132716516:
                                                                    return new C12302(str2);
                                                                case -42025740:
                                                                case 1218137819:
                                                                    C0861.m55626();
                                                                    C0989.m56095();
                                                                    c12154 = c12154;
                                                                    iM55680 = (C0946.m55979("ۚ۫") ^ i17) * (-25);
                                                                    i10 = ((iM55680 ^ i18) * 1559) ^ (-182872303);
                                                                    i11 = -1022273904;
                                                                    c12152 = c12154;
                                                                    i20 = iM55680 ^ i11;
                                                                    i19 = i10;
                                                                    c12154 = c12152;
                                                                    break;
                                                                case -8571735:
                                                                case 847764012:
                                                                    c12154 = c12154;
                                                                    i30 = i30;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    c = 0;
                                                                    if (C0946.f81894 != 0) {
                                                                        iM55681 = C0946.m55979("᩷ܿ") ^ i18;
                                                                        i19 = ((iM55681 ^ i17) * (-23125)) ^ 903270789;
                                                                        i12 = -831844160;
                                                                    } else {
                                                                        iM55681 = (i18 - C0946.m55979("ܿۘ")) * 47;
                                                                        i19 = ((iM55681 ^ i17) * (-12119)) ^ 830166733;
                                                                        i12 = 1721245660;
                                                                    }
                                                                    int i3111 = iM55681 ^ i12;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12154;
                                                                    i20 = i3111;
                                                                    c14163 = this;
                                                                    break;
                                                                case 8223992:
                                                                case 1063741091:
                                                                    i15 = 11767;
                                                                    iM55681 = C0946.m55979("᩷۬") ^ i17;
                                                                    i19 = ((iM55681 ^ i18) * (-21361)) ^ 1379021101;
                                                                    i12 = 1199576148;
                                                                    int i3112 = iM55681 ^ i12;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12154;
                                                                    i20 = i3112;
                                                                    c14163 = this;
                                                                    break;
                                                                case 340042624:
                                                                case 1985878879:
                                                                    c12154 = c12154;
                                                                    i30 = i30;
                                                                    short[] sArr6 = sArr;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    if (C0906.m55806(string, C0861.m55618(sArr6, i31, i30, i15))) {
                                                                        int iM55689 = (C0873.m55680("ۢ۠") + i17) * 47;
                                                                        sArr = sArr6;
                                                                        i19 = ((iM55689 ^ i18) * 26915) ^ (-1906320706);
                                                                        i31 = i31;
                                                                        i30 = i30;
                                                                        c12154 = c12154;
                                                                        i20 = iM55689 ^ (-530301062);
                                                                        i21 = i21;
                                                                    } else {
                                                                        sArr = sArr6;
                                                                        b = b3;
                                                                        b2 = b;
                                                                        b3 = b2;
                                                                        iM559710 = C0873.m55680("ܺᩳ") ^ i18;
                                                                        i6 = ((iM559710 ^ i17) * (-5783)) ^ (-1257391985);
                                                                        i7 = -2046503384;
                                                                        int i3113 = iM559710 ^ i7;
                                                                        i31 = i31;
                                                                        c12152 = c12154;
                                                                        i20 = i3113;
                                                                        i19 = i6;
                                                                        i21 = i21;
                                                                        i30 = i30;
                                                                        c12154 = c12152;
                                                                    }
                                                                    break;
                                                                case 372492990:
                                                                case 1812404124:
                                                                    c12154 = c12154;
                                                                    i30 = i30;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    int i50 = s + s2;
                                                                    if ((i50 * i50) - i29 > 0) {
                                                                        iM55681 = C0946.m55979("᩺᩶") ^ i17;
                                                                        i19 = ((iM55681 ^ i18) * 7849) ^ (-762234848);
                                                                        i12 = 2091840011;
                                                                    } else {
                                                                        iM55681 = (i18 - C0946.m55979("᩵ۗ")) * 47;
                                                                        i19 = ((iM55681 ^ i17) * 20037) ^ 1763073309;
                                                                        i12 = -1989535756;
                                                                    }
                                                                    int i3114 = iM55681 ^ i12;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12154;
                                                                    i20 = i3114;
                                                                    c14163 = this;
                                                                    break;
                                                                case 543099297:
                                                                case 1100789484:
                                                                    c12154 = c12154;
                                                                    if (C0906.m55806(string, C1071.m56336(f82174, 76, 18, i15))) {
                                                                        iM55680 = (i17 - C0873.m55680("᩷ۢ")) * (-27);
                                                                        i10 = ((iM55680 ^ i18) * 25505) ^ (-237457565);
                                                                        i11 = 544412155;
                                                                        c12152 = c12154;
                                                                        i20 = iM55680 ^ i11;
                                                                        i19 = i10;
                                                                        c12154 = c12152;
                                                                    }
                                                                    i30 = i30;
                                                                    i31 = i31;
                                                                    i21 = i21;
                                                                    b = b3;
                                                                    b2 = b;
                                                                    b3 = b2;
                                                                    iM559710 = C0873.m55680("ܺᩳ") ^ i18;
                                                                    i6 = ((iM559710 ^ i17) * (-5783)) ^ (-1257391985);
                                                                    i7 = -2046503384;
                                                                    int i3115 = iM559710 ^ i7;
                                                                    i31 = i31;
                                                                    c12152 = c12154;
                                                                    i20 = i3115;
                                                                    i19 = i6;
                                                                    i21 = i21;
                                                                    i30 = i30;
                                                                    c12154 = c12152;
                                                                    break;
                                                                case 688691834:
                                                                case 1009538243:
                                                                    switch (b2) {
                                                                        case 0:
                                                                            iM559711 = C0946.m55979("ᩴۤ") ^ i18;
                                                                            i13 = ((iM559711 ^ i17) * (-20141)) ^ 598874338;
                                                                            i14 = 57160756;
                                                                            break;
                                                                        case 1:
                                                                            iM559711 = (i17 - C0946.m55979("᩹ۚ")) * (-113);
                                                                            i13 = ((iM559711 ^ i18) * (-3075)) ^ (-89491530);
                                                                            i14 = -1157265418;
                                                                            break;
                                                                        case 2:
                                                                            iM559711 = (C0946.m55979("ۙܿ") + i18) * 65;
                                                                            i13 = ((iM559711 ^ i17) * 17243) ^ 668937644;
                                                                            i14 = 804058969;
                                                                            break;
                                                                        case 3:
                                                                            iM559711 = C0946.m55979("᩵᩷") ^ i17;
                                                                            i13 = ((iM559711 ^ i18) * (-22477)) ^ (-429703218);
                                                                            i14 = 46842023;
                                                                            break;
                                                                        case 4:
                                                                            iM559711 = C0946.m55979("᩹ᩳ") ^ i18;
                                                                            i13 = ((iM559711 ^ i17) * (-7549)) ^ 1027392954;
                                                                            i14 = 1433516288;
                                                                            break;
                                                                        default:
                                                                            iM559711 = (C0946.m55979("۫۫") + i17) * 27;
                                                                            i13 = ((iM559711 ^ i18) * (-2547)) ^ (-649493888);
                                                                            i14 = 360748477;
                                                                            break;
                                                                    }
                                                                    i20 = iM559711 ^ i14;
                                                                    i19 = i13;
                                                                    break;
                                                                case 897735979:
                                                                case 1688548774:
                                                                    C0967.m56074();
                                                                    if (!C0927.f81875) {
                                                                        c12154 = c12154;
                                                                        iM55680 = (C0946.m55979("ۚ۫") ^ i17) * (-25);
                                                                        i10 = ((iM55680 ^ i18) * 1559) ^ (-182872303);
                                                                        i11 = -1022273904;
                                                                        c12152 = c12154;
                                                                        i20 = iM55680 ^ i11;
                                                                        i19 = i10;
                                                                        c12154 = c12152;
                                                                    } else {
                                                                        iM559711 = (C0873.m55680("۫ۡ") + i17) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                        i13 = ((iM559711 ^ i18) * (-17707)) ^ 993625420;
                                                                        i14 = 618918764;
                                                                        i20 = iM559711 ^ i14;
                                                                        i19 = i13;
                                                                    }
                                                                    break;
                                                                case 1060903067:
                                                                case 1633721667:
                                                                    if (C0863.f81833 > 0) {
                                                                        c12153 = c12154;
                                                                        i30 = i30;
                                                                        i31 = i31;
                                                                        i21 = i21;
                                                                        int iM556810 = (C0873.m55680("֨֫") + i18) * (-73);
                                                                        int i410 = ((iM556810 ^ i17) * (-26869)) ^ (-1941657283);
                                                                        i20 = iM556810 ^ 1590370617;
                                                                        c14163 = this;
                                                                        i31 = i31;
                                                                        int i411 = i30;
                                                                        c12154 = c12153;
                                                                        i19 = i410;
                                                                        i21 = i21;
                                                                        i30 = i411;
                                                                    } else {
                                                                        c12154 = c12154;
                                                                        iM55680 = (C0946.m55979("ۚ۫") ^ i17) * (-25);
                                                                        i10 = ((iM55680 ^ i18) * 1559) ^ (-182872303);
                                                                        i11 = -1022273904;
                                                                        c12152 = c12154;
                                                                        i20 = iM55680 ^ i11;
                                                                        i19 = i10;
                                                                        c12154 = c12152;
                                                                    }
                                                                    break;
                                                                case 1090737553:
                                                                case 1627942040:
                                                                    return new C12302(c12154.f33971.f37913);
                                                                default:
                                                                    RunnableC0871.m55672();
                                                                    if (C1964.f83032 <= 0) {
                                                                        c12154 = c12154;
                                                                        iM55680 = C0946.m55979("ܶ᩶") ^ i18;
                                                                        i10 = ((iM55680 ^ i17) * (-29403)) ^ (-1225089056);
                                                                        i11 = 2128767841;
                                                                        c12152 = c12154;
                                                                        i20 = iM55680 ^ i11;
                                                                        i19 = i10;
                                                                        c12154 = c12152;
                                                                    } else {
                                                                        iM559711 = (C0873.m55680("۫ۡ") + i17) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                        i13 = ((iM559711 ^ i18) * (-17707)) ^ 993625420;
                                                                        i14 = 618918764;
                                                                        i20 = iM559711 ^ i14;
                                                                        i19 = i13;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                };
                                            }
                                            iM55979 = C0873.m55680("ۨۖ") ^ i2;
                                            i4 = ((iM55979 ^ i3) * 25203) ^ 11769546;
                                            i5 = -190900501;
                                        }
                                    }
                                }
                            }
                            iM55979 = (i2 - C0946.m55979("۬ܳ")) * 7;
                            i4 = ((iM55979 ^ i3) * (-26279)) ^ (-1568473910);
                            i5 = 318482759;
                        } else {
                            iM55979 = (C0946.m55979("ۗ۬") ^ i3) * (-25);
                            i4 = ((iM55979 ^ i2) * 25267) ^ (-639865270);
                            i5 = 1454013251;
                        }
                        break;
                    }
                    iM55979 = C0873.m55680("ۙۡ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 11353) ^ 856757398;
                    i5 = -1012936596;
                    break;
                case -1810129502:
                case -1270459352:
                    C0912.m55833();
                    C0955.m56025();
                    iM55979 = (i2 - C0946.m55979("۬ܳ")) * 7;
                    i4 = ((iM55979 ^ i3) * (-26279)) ^ (-1568473910);
                    i5 = 318482759;
                    break;
                case -607304709:
                case 1545784645:
                    C1028.m56247();
                    return null;
                case 595967754:
                case 1821883759:
                    if (!C0947.m55997()) {
                        iM55979 = C0873.m55680("ۡܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-10231)) ^ (-1408948726);
                        i5 = 1944201041;
                    } else {
                        iM55979 = (C0946.m55979("ۗ۬") ^ i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 25267) ^ (-639865270);
                        i5 = 1454013251;
                    }
                    break;
                case 1409275795:
                case 1536654382:
                    C1028.m56247();
                    if (C0992.f81922 < 0) {
                        iM55979 = C0873.m55680("ۙۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11353) ^ 856757398;
                        i5 = -1012936596;
                    } else {
                        iM55979 = (i2 - C0946.m55979("۬ܳ")) * 7;
                        i4 = ((iM55979 ^ i3) * (-26279)) ^ (-1568473910);
                        i5 = 318482759;
                    }
                    break;
                default:
                    if (C0894.f81854 < 0) {
                        iM55979 = (C0946.m55979("ۗ۬") ^ i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 25267) ^ (-639865270);
                        i5 = 1454013251;
                    } else {
                        iM55979 = (i2 - C0946.m55979("۬ܳ")) * 7;
                        i4 = ((iM55979 ^ i3) * (-26279)) ^ (-1568473910);
                        i5 = 318482759;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ String m28077(C12152 c12152, String str, String str2) {
        String str3 = null;
        StringBuilder sb = null;
        int iM55719 = 0;
        int i = 0;
        int i2 = 1114213009;
        int i3 = C1017.f81942;
        int i4 = C0992.f81922;
        int iM55979 = C0946.m55979("ۤᩴ") ^ i4;
        int i5 = ((iM55979 ^ i3) * 3089) ^ (-103232806);
        int i6 = 400316598;
        while (true) {
            i2 = ((((i2 ^ i3) * 11913) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -1687595377:
                case 1204590596:
                    C0989.m56095();
                    return null;
                case -1547248672:
                case 808633944:
                    if (!C0861.f81831) {
                        iM55979 = (C0946.m55979("ۗۨ") + i3) * (-9);
                        i5 = ((iM55979 ^ i4) * (-27149)) ^ (-1974041377);
                        i6 = -78155235;
                    } else {
                        iM55979 = (C0946.m55979("᩷᩹") ^ i4) * (-25);
                        i5 = ((iM55979 ^ i3) * (-20095)) ^ 712097791;
                        i6 = -1932126406;
                    }
                    break;
                case -1452392745:
                case 1427737552:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0946.m55979("ۗۨ") + i3) * (-9);
                        i5 = ((iM55979 ^ i4) * (-27149)) ^ (-1974041377);
                        i6 = -78155235;
                    } else {
                        iM55979 = (C0873.m55680("ᩳܶ") ^ i3) * (-13);
                        i5 = ((iM55979 ^ i4) * 29643) ^ 77862712;
                        i6 = -1353683021;
                    }
                    break;
                case -1059190948:
                case -710336562:
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0946.m55979("᩸ۧ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-12983)) ^ 238406752;
                        i6 = -1411124517;
                    } else {
                        iM55979 = C0946.m55979("ۘ᩷") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-24229)) ^ 1099886023;
                        i6 = -582891294;
                    }
                    break;
                case -928388936:
                case 423044841:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = (C0946.m55979("֫ۖ") ^ i4) * (-123);
                        i5 = ((iM55979 ^ i3) * (-13063)) ^ (-1453515932);
                        i6 = -486762906;
                    } else {
                        iM55979 = C0946.m55979("ۗ֡") ^ i3;
                        i5 = ((iM55979 ^ i4) * 10439) ^ (-1603670479);
                        i6 = -1764451089;
                    }
                    break;
                case -736121440:
                case 830138753:
                    if (C0882.m55710() == 0) {
                        iM55979 = (C0946.m55979("ۗۨ") + i3) * (-9);
                        i5 = ((iM55979 ^ i4) * (-27149)) ^ (-1974041377);
                        i6 = -78155235;
                    } else {
                        iM55979 = C0873.m55680("ۤ֫") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-24751)) ^ 1414278325;
                        i6 = -510979755;
                    }
                    break;
                case -728729703:
                case 1178681412:
                    C0882.m55710();
                    if (C0845.m55584() > 0) {
                        iM55979 = (C0946.m55979("֫ۖ") ^ i4) * (-123);
                        i5 = ((iM55979 ^ i3) * (-13063)) ^ (-1453515932);
                        i6 = -486762906;
                    } else {
                        iM55979 = (C0946.m55979("ۗۨ") + i3) * (-9);
                        i5 = ((iM55979 ^ i4) * (-27149)) ^ (-1974041377);
                        i6 = -78155235;
                    }
                    break;
                case -301241232:
                case 13069868:
                    C1003.m56121(sb, C1404.m56454(str, 0, i));
                    if (C0890.f81849 != 0) {
                        iM55979 = C0946.m55979("᩸ۧ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-12983)) ^ 238406752;
                        i6 = -1411124517;
                    } else {
                        iM55979 = (C0946.m55979("ܽ۬") ^ i4) * 75;
                        i5 = ((iM55979 ^ i3) * 7773) ^ 1082573133;
                        i6 = -717308037;
                    }
                    break;
                case -289616434:
                case 612333991:
                    return str2;
                case -185361399:
                case -153403368:
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55979 = (C0946.m55979("᩷᩹") ^ i4) * (-25);
                        i5 = ((iM55979 ^ i3) * (-20095)) ^ 712097791;
                        i6 = -1932126406;
                    } else {
                        iM55979 = C0946.m55979("֡ۚ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 14377) ^ (-1678135);
                        i6 = 763313141;
                    }
                    break;
                case -100778125:
                case 1047711731:
                    sb = new StringBuilder();
                    iM55719 = C0882.m55719(str);
                    if (C0930.m55885() <= 0) {
                        iM55979 = (C0946.m55979("֫ۖ") ^ i4) * (-123);
                        i5 = ((iM55979 ^ i3) * (-13063)) ^ (-1453515932);
                        i6 = -486762906;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۖ֫")) * (-115);
                        i5 = ((iM55979 ^ i4) * (-12373)) ^ 2021054849;
                        i6 = 713867916;
                    }
                    break;
                case -92462762:
                case 545661894:
                    if (C1048.m56305() >= 0) {
                        iM55979 = (C0946.m55979("᩷᩹") ^ i4) * (-25);
                        i5 = ((iM55979 ^ i3) * (-20095)) ^ 712097791;
                        i6 = -1932126406;
                    } else {
                        iM55979 = C0946.m55979("ܺ᩶") ^ i4;
                        i5 = ((iM55979 ^ i3) * 15287) ^ 1265317595;
                        i6 = -191474331;
                    }
                    break;
                case -83894175:
                case 281069996:
                    if (C0890.f81849 != 0) {
                        iM55979 = (C0946.m55979("֫ۖ") ^ i4) * (-123);
                        i5 = ((iM55979 ^ i3) * (-13063)) ^ (-1453515932);
                        i6 = -486762906;
                    } else {
                        iM55979 = C0873.m55680("۟᩺") ^ i4;
                        i5 = ((iM55979 ^ i3) * 30237) ^ (-208750374);
                        i6 = 1154439260;
                    }
                    break;
                case 814332328:
                case 1528933616:
                    AbstractC0942.m55971();
                    C0863.m55643();
                    iM55979 = (C0946.m55979("᩷᩹") ^ i4) * (-25);
                    i5 = ((iM55979 ^ i3) * (-20095)) ^ 712097791;
                    i6 = -1932126406;
                    break;
                case 820031373:
                case 1032132973:
                    str3 = c12152.f33970;
                    if (C1071.m56345(str2, str3)) {
                        iM55979 = (C0873.m55680("᩺ܰ") ^ i4) * 95;
                        i5 = ((iM55979 ^ i3) * 12127) ^ (-1454969584);
                        i6 = 286449609;
                    } else {
                        iM55979 = C0873.m55680("֨ۡ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 19001) ^ (-1434131902);
                        i6 = -171523116;
                    }
                    break;
                case 1198344463:
                case 1649850190:
                    if (C1024.m56209() >= 0) {
                        iM55979 = (C0946.m55979("ۗۨ") + i3) * (-9);
                        i5 = ((iM55979 ^ i4) * (-27149)) ^ (-1974041377);
                        i6 = -78155235;
                    } else {
                        iM55979 = (C0873.m55680("ۡܽ") + i3) * 127;
                        i5 = ((iM55979 ^ i4) * 31807) ^ (-1605763205);
                        i6 = 469414806;
                    }
                    break;
                case 1266011790:
                case 2116493216:
                    return C21459.m48621(C0927.m55878(str3), str2, sb);
                default:
                    i = iM55719 - 1;
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0946.m55979("᩸ۧ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-12983)) ^ 238406752;
                        i6 = -1411124517;
                    } else {
                        iM55979 = (C0946.m55979("ۗ֫") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM55979 ^ i4) * (-32593)) ^ (-77339410);
                        i6 = 2097944942;
                    }
                    break;
            }
        }
    }

    @Override // p067l.C16483
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19837 mo3631() {
        final String str = this.f33973;
        return new InterfaceC19837(this) { // from class: l.۬۫ܽ

            /* JADX INFO: renamed from: ֫ */
            public final /* synthetic */ C12152 f42307;

            {
                int i = 1401770390;
                int i2 = C0949.f81897;
                int i3 = C0873.f81841;
                int iM55979 = C0946.m55979("ᩳ᩺") ^ i3;
                int i4 = ((iM55979 ^ i2) * (-30059)) ^ (-768249326);
                int i5 = -1496503043;
                while (true) {
                    i = ((((i ^ i2) * 10957) >> 31) & i4) ^ (iM55979 ^ i5);
                    switch (i) {
                        case -2051370226:
                        case -362798734:
                            if (C1003.f81929 <= 0) {
                                iM55979 = C0873.m55680("ۨ᩺") ^ i3;
                                i4 = ((iM55979 ^ i2) * (-25931)) ^ 1734673286;
                                i5 = 1599486477;
                            } else {
                                iM55979 = C0946.m55979("ۛ֡") ^ i2;
                                i4 = ((iM55979 ^ i3) * (-23389)) ^ (-1690456307);
                                i5 = -1974634321;
                            }
                            break;
                        case -1896603701:
                        case -1040777040:
                            C1024.m56209();
                            if (C0873.f81841 <= 0) {
                                iM55979 = C0873.m55680("ۨ᩺") ^ i3;
                                i4 = ((iM55979 ^ i2) * (-25931)) ^ 1734673286;
                                i5 = 1599486477;
                            } else {
                                iM55979 = C0873.m55680("ۡܿ") ^ i2;
                                i4 = ((iM55979 ^ i3) * 29487) ^ 1663184372;
                                i5 = 2113524117;
                            }
                            break;
                        case -1562902371:
                        case -954358365:
                            if (C0992.f81922 >= 0) {
                                iM55979 = C0946.m55979("᩻۬") ^ i3;
                                i4 = ((iM55979 ^ i2) * 29649) ^ (-898580431);
                                i5 = 836538226;
                            } else {
                                iM55979 = C0873.m55680("ۡܿ") ^ i2;
                                i4 = ((iM55979 ^ i3) * 29487) ^ 1663184372;
                                i5 = 2113524117;
                            }
                            break;
                        case -1556065424:
                        case 820758933:
                            if (C0912.f81867 <= 0) {
                                iM55979 = C0873.m55680("ۡܿ") ^ i2;
                                i4 = ((iM55979 ^ i3) * 29487) ^ 1663184372;
                                i5 = 2113524117;
                            } else {
                                iM55979 = (i3 - C0946.m55979("ܶۨ")) * 63;
                                i4 = ((iM55979 ^ i2) * (-4425)) ^ 1937290210;
                                i5 = -1111280686;
                            }
                            break;
                        case -1532001843:
                        case 414858427:
                            C0949.m56012();
                            throw new RuntimeException();
                        case -1071976306:
                        case 1619731584:
                            if (C1194.f82045 != 0) {
                                iM55979 = (C0873.m55680("᩹ۙ") ^ i3) * 75;
                                i4 = ((iM55979 ^ i2) * (-23701)) ^ (-1729446862);
                                i5 = 1437791137;
                            } else {
                                iM55979 = C0873.m55680("۫᩻") ^ i2;
                                i4 = ((iM55979 ^ i3) * (-13687)) ^ 187680546;
                                i5 = -1024524687;
                            }
                            break;
                        case -849060818:
                        case -122941064:
                            if (C1036.f81953 >= 0) {
                                iM55979 = (C0946.m55979("᩸ܿ") + i2) * (-67);
                                i4 = ((iM55979 ^ i3) * 12925) ^ 1624210744;
                                i5 = -1821068494;
                            } else {
                                iM55979 = C0873.m55680("ܺۨ") ^ i3;
                                i4 = ((iM55979 ^ i2) * (-8003)) ^ 820973016;
                                i5 = 976956712;
                            }
                            break;
                        case -646689232:
                        case 1394290351:
                            if (C0989.m56095() <= 0) {
                                iM55979 = (C0946.m55979("᩸ܿ") + i2) * (-67);
                                i4 = ((iM55979 ^ i3) * 12925) ^ 1624210744;
                                i5 = -1821068494;
                            } else {
                                iM55979 = (i2 - C0873.m55680("֨᩺")) * 97;
                                i4 = ((iM55979 ^ i3) * 32397) ^ 820426895;
                                i5 = 1771399233;
                            }
                            break;
                        case -472654443:
                        case 465076903:
                            if (C1071.f81975 <= 0) {
                                iM55979 = C0873.m55680("ۨ᩺") ^ i3;
                                i4 = ((iM55979 ^ i2) * (-25931)) ^ 1734673286;
                                i5 = 1599486477;
                            } else {
                                iM55979 = (i3 - C0873.m55680("۠۟")) * 95;
                                i4 = ((iM55979 ^ i2) * 20723) ^ 604163982;
                                i5 = -1923051774;
                            }
                            break;
                        case -326033410:
                        case 2011438906:
                            if (C1404.f82149 >= 0) {
                                iM55979 = C0946.m55979("᩻۬") ^ i3;
                                i4 = ((iM55979 ^ i2) * 29649) ^ (-898580431);
                                i5 = 836538226;
                            } else {
                                iM55979 = C0873.m55680("۟۬") ^ i2;
                                i4 = ((iM55979 ^ i3) * 1239) ^ 1416593213;
                                i5 = 338824165;
                            }
                            break;
                        case -58815012:
                        case 266994909:
                            this.f42307 = this;
                            if (C1017.m56187() <= 0) {
                                iM55979 = (C0873.m55680("᩹ۙ") ^ i3) * 75;
                                i4 = ((iM55979 ^ i2) * (-23701)) ^ (-1729446862);
                                i5 = 1437791137;
                            } else {
                                iM55979 = (C0873.m55680("᩻ܰ") + i3) * (-33);
                                i4 = ((iM55979 ^ i2) * 32337) ^ 711326767;
                                i5 = -1532606409;
                            }
                            break;
                        case 26675269:
                        case 98969049:
                            C1012.m56134();
                            iM55979 = C0873.m55680("ۡܿ") ^ i2;
                            i4 = ((iM55979 ^ i3) * 29487) ^ 1663184372;
                            i5 = 2113524117;
                            break;
                        case 336293973:
                        case 1802460133:
                            C0861.m55626();
                            if (C1124.f82007 >= 0) {
                                iM55979 = (C0946.m55979("᩸ܿ") + i2) * (-67);
                                i4 = ((iM55979 ^ i3) * 12925) ^ 1624210744;
                                i5 = -1821068494;
                            } else {
                                iM55979 = C0873.m55680("ۨ᩺") ^ i3;
                                i4 = ((iM55979 ^ i2) * (-25931)) ^ 1734673286;
                                i5 = 1599486477;
                            }
                            break;
                        case 586058914:
                        case 1768433252:
                            return;
                        case 708290651:
                        case 790109784:
                            if (C1024.f81946) {
                                iM55979 = C0946.m55979("᩻۬") ^ i3;
                                i4 = ((iM55979 ^ i2) * 29649) ^ (-898580431);
                                i5 = 836538226;
                            } else {
                                iM55979 = C0873.m55680("ۖ۠") ^ i2;
                                i4 = ((iM55979 ^ i3) * (-7377)) ^ (-120549305);
                                i5 = 1263286417;
                            }
                            break;
                        default:
                            if (C0873.f81841 <= 0) {
                                iM55979 = (C0873.m55680("᩹ۙ") ^ i3) * 75;
                                i4 = ((iM55979 ^ i2) * (-23701)) ^ (-1729446862);
                                i5 = 1437791137;
                            } else {
                                iM55979 = C0946.m55979("ۜۛ") ^ i3;
                                i4 = ((iM55979 ^ i2) * (-31543)) ^ (-2056182127);
                                i5 = 2019473563;
                            }
                            break;
                    }
                }
            }

            @Override // p067l.InterfaceC19837
            /* JADX INFO: renamed from: ֫ */
            public final Object mo6575(Object obj) {
                String str2 = null;
                int i = -2109440856;
                int i2 = C0898.f81858;
                int i3 = C1404.f82149;
                int iM55680 = (i3 - C0873.m55680("ۘ۟")) * (-121);
                int i4 = ((iM55680 ^ i2) * (-12451)) ^ 1195767568;
                int i5 = 878531320;
                while (true) {
                    i = ((((i ^ i2) * 8021) >> 31) & i4) ^ (iM55680 ^ i5);
                    switch (i) {
                        case -1943558133:
                        case -1253315468:
                            if (C1012.f81938 >= 0) {
                                iM55680 = (i3 - C0946.m55979("ۛ᩺")) * (-97);
                                i4 = ((iM55680 ^ i2) * 18645) ^ (-1181473951);
                                i5 = -733472155;
                            } else {
                                iM55680 = C0946.m55979("ܿ᩸") ^ i3;
                                i4 = ((iM55680 ^ i2) * (-2037)) ^ (-60961724);
                                i5 = -1579986676;
                            }
                            break;
                        case -1929360830:
                        case 1979288873:
                            if (C0845.m55584() <= 0) {
                                iM55680 = C0946.m55979("۬۠") ^ i2;
                                i4 = ((iM55680 ^ i3) * (-15095)) ^ 2012923866;
                                i5 = 1166790318;
                            } else {
                                iM55680 = (C0873.m55680("ۤܿ") + i2) * (-9);
                                i4 = ((iM55680 ^ i3) * (-1749)) ^ 29580472;
                                i5 = -1810071880;
                            }
                            break;
                        case -1893015923:
                        case 891490613:
                            C0898.m55800();
                            if (C0845.f81821 >= 0) {
                                iM55680 = C0946.m55979("۬۠") ^ i2;
                                i4 = ((iM55680 ^ i3) * (-15095)) ^ 2012923866;
                                i5 = 1166790318;
                            } else {
                                iM55680 = (i3 - C0946.m55979("ۛ᩺")) * (-97);
                                i4 = ((iM55680 ^ i2) * 18645) ^ (-1181473951);
                                i5 = -733472155;
                            }
                            break;
                        case -1774728474:
                        case -1566614498:
                            return C12152.m28077(this.f42307, str2, (String) obj);
                        case -1715622802:
                        case -1087925809:
                            if (C0898.f81858 <= 0) {
                                iM55680 = C0873.m55680("ۙۛ") ^ i3;
                                i4 = ((iM55680 ^ i2) * (-26249)) ^ (-1011101932);
                                i5 = -849867874;
                            } else {
                                iM55680 = C0873.m55680("֫ۢ") ^ i3;
                                i4 = ((iM55680 ^ i2) * 16339) ^ (-364944286);
                                i5 = -1911615276;
                            }
                            break;
                        case -1690790485:
                        case -1569137038:
                            if (C1046.f81962 <= 0) {
                                iM55680 = (i3 - C0946.m55979("ۛ᩺")) * (-97);
                                i4 = ((iM55680 ^ i2) * 18645) ^ (-1181473951);
                                i5 = -733472155;
                            } else {
                                iM55680 = C0946.m55979("ܳۖ") ^ i3;
                                i4 = ((iM55680 ^ i2) * (-16529)) ^ (-1245970336);
                                i5 = -1783443126;
                            }
                            break;
                        case -1616693711:
                        case 390681932:
                            str2 = str;
                            if (C1003.f81929 <= 0) {
                                iM55680 = (i3 - C0946.m55979("᩺֫")) * 51;
                                i4 = ((iM55680 ^ i2) * 31297) ^ (-1452307391);
                                i5 = 1994538308;
                            } else {
                                iM55680 = (C0873.m55680("ܶۤ") + i3) * (-19);
                                i4 = ((iM55680 ^ i2) * (-25847)) ^ 1860653058;
                                i5 = -688245116;
                            }
                            break;
                        case -1150837236:
                        case 1100484725:
                            if (C1229.f82066 >= 0) {
                                iM55680 = (i3 - C0946.m55979("᩺֫")) * 51;
                                i4 = ((iM55680 ^ i2) * 31297) ^ (-1452307391);
                                i5 = 1994538308;
                            } else {
                                iM55680 = (C0946.m55979("ۛۛ") + i3) * C0254q.f1218h;
                                i4 = ((iM55680 ^ i2) * (-18615)) ^ (-742438507);
                                i5 = -545166957;
                            }
                            break;
                        case -966036998:
                        case 1213879203:
                            C0890.m55740();
                            iM55680 = C0873.m55680("ۙۛ") ^ i3;
                            i4 = ((iM55680 ^ i2) * (-26249)) ^ (-1011101932);
                            i5 = -849867874;
                            break;
                        case -749771498:
                        case -622251035:
                            if (C1003.m56123() != 0) {
                                iM55680 = C0873.m55680("ۙۛ") ^ i3;
                                i4 = ((iM55680 ^ i2) * (-26249)) ^ (-1011101932);
                                i5 = -849867874;
                            } else {
                                iM55680 = (C0873.m55680("ۘۛ") + i2) * (-87);
                                i4 = ((iM55680 ^ i3) * (-851)) ^ (-885945038);
                                i5 = -2090122899;
                            }
                            break;
                        case -188035346:
                        case 426964864:
                            C0937.m55918();
                            RunnableC0871.m55672();
                            return null;
                        case 659523837:
                        case 708260886:
                            if (C1017.f81942 >= 0) {
                                iM55680 = C0946.m55979("۬۠") ^ i2;
                                i4 = ((iM55680 ^ i3) * (-15095)) ^ 2012923866;
                                i5 = 1166790318;
                            } else {
                                iM55680 = C0873.m55680("ۨ۟") ^ i2;
                                i4 = ((iM55680 ^ i3) * 31693) ^ (-227183426);
                                i5 = -1816375660;
                            }
                            break;
                        case 1182871487:
                        case 1389535278:
                            if (C1046.m56302() != 0) {
                                iM55680 = (C0873.m55680("ܽ᩻") + i2) * 13;
                                i4 = ((iM55680 ^ i3) * (-31649)) ^ 143811383;
                                i5 = 647721421;
                            } else {
                                iM55680 = C0873.m55680("᩺ۖ") ^ i2;
                                i4 = ((iM55680 ^ i3) * 10755) ^ (-182438709);
                                i5 = -607626942;
                            }
                            break;
                        case 1292833810:
                        case 1464842824:
                            C0992.m56107();
                            if (C1044.f81959 >= 0) {
                                iM55680 = (i3 - C0946.m55979("ۛ᩺")) * (-97);
                                i4 = ((iM55680 ^ i2) * 18645) ^ (-1181473951);
                                i5 = -733472155;
                            } else {
                                iM55680 = C0873.m55680("ۙۛ") ^ i3;
                                i4 = ((iM55680 ^ i2) * (-26249)) ^ (-1011101932);
                                i5 = -849867874;
                            }
                            break;
                        case 1512407423:
                        case 1794291076:
                            if (C0898.f81858 <= 0) {
                                iM55680 = C0873.m55680("ۙۛ") ^ i3;
                                i4 = ((iM55680 ^ i2) * (-26249)) ^ (-1011101932);
                                i5 = -849867874;
                            } else {
                                iM55680 = C0873.m55680("᩻᩻") ^ i2;
                                i4 = ((iM55680 ^ i3) * 31269) ^ 81251097;
                                i5 = 533601764;
                            }
                            break;
                        default:
                            C0892.m55749();
                            if (ViewOnClickListenerC0939.f81888 > 0) {
                                iM55680 = (C0873.m55680("ܽ᩻") + i2) * 13;
                                i4 = ((iM55680 ^ i3) * (-31649)) ^ 143811383;
                                i5 = 647721421;
                            } else {
                                iM55680 = C0873.m55680("ۙۛ") ^ i3;
                                i4 = ((iM55680 ^ i2) * (-26249)) ^ (-1011101932);
                                i5 = -849867874;
                            }
                            break;
                    }
                }
            }
        };
    }
}
