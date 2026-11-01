package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* JADX INFO: renamed from: l.ᩴ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAGX */
/* JADX INFO: loaded from: classes4.dex */
public final class C20218 {

    /* JADX INFO: renamed from: ֨᩷ܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f82318 = {1356, 10596, 3340, -15199, 10177, -9380, -13305, -8776, 16064, 1944, 15350, 12563, -9408, 1130, 18053, 20381, 21775, 17123, -24262, 22830, 29262, -22151, 19222, 23947, 27434, -17846, 15384, 15386, -16914, 22428, -23363, 19684, -20274, -16602, 22442, 25063, 24589, 15371, 2438, -4821, -4806, -4817, -4813, -4824, -4803, -4814, -4809, -4802, -4816, -4802, -4802, -4821, -4838, -4821, -4816, -4856, -4814, -4804, -4839, -4809, -4812, -4808, -4816};

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 f62512;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f62513;

    /* JADX INFO: renamed from: ܽ */
    public final C18107 f62514;

    public C20218(AbstractC17043 abstractC17043, C18107 c18107, String str) {
        ArrayList arrayList = null;
        int i = 1669448887;
        int i2 = C1124.f82007;
        int i3 = C1003.f81929;
        int iM55979 = (C0946.m55979("ۘۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i4 = ((iM55979 ^ i3) * 16691) ^ 2071855177;
        int i5 = 272633075;
        while (true) {
            i = ((((i ^ i3) * (-19375)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1891405270:
                case -1790230353:
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0873.m55680("᩵۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 13939) ^ 706261226;
                        i5 = 1982548533;
                    } else {
                        iM55979 = C0946.m55979("ۧ۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-22865)) ^ (-463488591);
                        i5 = 552977198;
                    }
                    break;
                case -1647914430:
                case -259080067:
                    C1012.m56134();
                    iM55979 = C0873.m55680("᩵۬") ^ i3;
                    i4 = ((iM55979 ^ i2) * 13939) ^ 706261226;
                    i5 = 1982548533;
                    break;
                case -1600055809:
                case -514730034:
                    this.f62512 = abstractC17043;
                    if (C0890.m55740()) {
                        C0890.m55729(new C17534(this, c18107, abstractC17043, str));
                        return;
                    }
                    iM55979 = C0873.m55680("᩵۬") ^ i3;
                    i4 = ((iM55979 ^ i2) * 13939) ^ 706261226;
                    i5 = 1982548533;
                    break;
                case -1411019713:
                case 1743347247:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0873.m55680("۬۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-20929)) ^ 1652021724;
                        i5 = 1966572303;
                    } else {
                        iM55979 = (i2 - C0873.m55680("۫᩵")) * 37;
                        i4 = ((iM55979 ^ i3) * (-28249)) ^ (-375046469);
                        i5 = 990555032;
                    }
                    break;
                case -1040991523:
                case 1943957849:
                    this.f62513 = arrayList;
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0946.m55979("᩵ܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 5707) ^ 841229890;
                        i5 = 498785090;
                    } else {
                        iM55979 = C0873.m55680("ۤ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-20291)) ^ (-1584485627);
                        i5 = 1416474892;
                    }
                    break;
                case -862400150:
                case 415696483:
                    C0894.m55769();
                    if (C1229.f82066 < 0) {
                        iM55979 = C0873.m55680("֫ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13651)) ^ (-238232944);
                        i5 = -1954259094;
                    } else {
                        iM55979 = C0873.m55680("᩵۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 13939) ^ 706261226;
                        i5 = 1982548533;
                    }
                    break;
                case -686600785:
                case -180196628:
                    if (C0946.f81894 != 0) {
                        iM55979 = C0873.m55680("֫ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13651)) ^ (-238232944);
                        i5 = -1954259094;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۙۚ")) * (-27);
                        i4 = ((iM55979 ^ i2) * (-8923)) ^ 1362296097;
                        i5 = -771114071;
                    }
                    break;
                case -428195014:
                case 1464731367:
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0946.m55979("᩵ܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 5707) ^ 841229890;
                        i5 = 498785090;
                    } else {
                        iM55979 = C0873.m55680("᩵۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 13939) ^ 706261226;
                        i5 = 1982548533;
                    }
                    break;
                case -271063894:
                case 1723058604:
                    if (C0930.f81879 > 0) {
                        iM55979 = C0873.m55680("۬۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-20929)) ^ 1652021724;
                        i5 = 1966572303;
                    } else {
                        iM55979 = C0946.m55979("᩵ܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 5707) ^ 841229890;
                        i5 = 498785090;
                    }
                    break;
                case 362152792:
                case 1414605130:
                    C0894.m55769();
                    C1044.m56286();
                    throw new RuntimeException();
                case 791686937:
                case 981467333:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0873.m55680("֫ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13651)) ^ (-238232944);
                        i5 = -1954259094;
                    } else {
                        iM55979 = C0873.m55680("᩶᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 22751) ^ 1031277542;
                        i5 = -684164032;
                    }
                    break;
                case 908445776:
                case 1490620264:
                    arrayList = new ArrayList();
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("۬۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-20929)) ^ 1652021724;
                        i5 = 1966572303;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ܶۗ")) * (-55);
                        i4 = ((iM55979 ^ i3) * 28661) ^ (-1748422790);
                        i5 = 869895395;
                    }
                    break;
                case 975821576:
                case 1210159491:
                    if (C0930.m55885() <= 0) {
                        iM55979 = C0873.m55680("۬۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-20929)) ^ 1652021724;
                        i5 = 1966572303;
                    } else {
                        iM55979 = C0946.m55979("ۤۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17721)) ^ 1763247209;
                        i5 = 1167121095;
                    }
                    break;
                case 1442251826:
                case 1981028722:
                    this.f62514 = c18107;
                    if (C0890.m55740()) {
                        iM55979 = C0946.m55979("ۛۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24975) ^ (-651918560);
                        i5 = 1301737160;
                    } else {
                        iM55979 = C0946.m55979("᩵ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-13475)) ^ (-2031980759);
                        i5 = -287127651;
                    }
                    break;
                default:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("֫ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13651)) ^ (-238232944);
                        i5 = -1954259094;
                    } else {
                        iM55979 = C0946.m55979("ܳܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22913) ^ (-1180466473);
                        i5 = -685892292;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45706(final C20218 c20218, final String str) {
        short[] sArr;
        int i;
        int iM55680;
        int i2;
        int i3;
        int i4;
        short[] sArr2;
        View view;
        short[] sArr3;
        int i5;
        Main main;
        short[] sArr4;
        View view2;
        short[] sArr5;
        int i6;
        int i7;
        int i8;
        int iM55979;
        int i9;
        int i10;
        int i11;
        int iM559710;
        int i12;
        int i13;
        int iM559711;
        int i14;
        int i15;
        int iM559712;
        int i16;
        int i17;
        DialogInterfaceC2564 dialogInterfaceC2564M21200 = null;
        int i18 = -2062211178;
        int i19 = C0912.f81867;
        int i20 = C0949.f81897;
        int iM55681 = C0873.m55680("᩶ܽ") ^ i20;
        int i21 = ((iM55681 ^ i19) * (-16833)) ^ 1479903149;
        int i22 = iM55681 ^ (-55607014);
        C15993 c15993M36344 = null;
        Iterator itM55766 = null;
        StringBuilder sb = null;
        String strM55689 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i23 = 0;
        int i24 = 0;
        C15556 c15556 = null;
        int iM559713 = 0;
        int i25 = 0;
        int iM55682 = 0;
        int iM559714 = 0;
        int i26 = 0;
        int i27 = 0;
        short s = 0;
        int iM559715 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        TextView textView = null;
        C20671 c20671M55888 = null;
        String strM56233 = null;
        HashSet hashSet = null;
        String str2 = null;
        int iM55683 = 0;
        C14849 c14849 = null;
        short[] sArr10 = null;
        View view3 = null;
        final Main mainM56560 = null;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i19) * 4435) >> 31));
            switch (i18) {
                case -2086442972:
                case 1472792896:
                    C0992.m56107();
                    i23 = i23;
                    sArr10 = sArr10;
                    view3 = view3;
                    sArr = sArr6;
                    i = i29;
                    sArr7 = sArr7;
                    i30 = i30;
                    sArr8 = sArr8;
                    i28 = i28;
                    int iM559716 = (i19 - C0946.m55979("֡۬")) * (-65);
                    int i31 = i;
                    i21 = ((iM559716 ^ i20) * (-31805)) ^ 2104474169;
                    sArr6 = sArr;
                    i28 = i28;
                    i30 = i30;
                    sArr8 = sArr8;
                    i23 = i23;
                    sArr10 = sArr10;
                    sArr7 = sArr7;
                    view3 = view3;
                    i22 = iM559716 ^ 2123947851;
                    i29 = i31;
                    break;
                case -2069335795:
                case 42110898:
                    i24 = 57922;
                    iM55680 = C0946.m55979("ܶܿ") ^ i19;
                    i2 = ((iM55680 ^ i20) * 19245) ^ 1851050991;
                    i3 = 1440921741;
                    i11 = iM55680 ^ i3;
                    i28 = i28;
                    i30 = i30;
                    sArr8 = sArr8;
                    sArr10 = sArr10;
                    sArr7 = sArr7;
                    view3 = view3;
                    sArr6 = sArr6;
                    i29 = i29;
                    i22 = i11;
                    i21 = i2;
                    i23 = i23;
                    break;
                case -2023043307:
                case 410956529:
                    C18676 c18676 = (C18676) RunnableC0897.m55785(itM55766);
                    sb = new StringBuilder();
                    C0912.m55825(sb, c18676.m42501());
                    sArr9 = f82318;
                    iM559712 = C0946.m55979("۟ܰ") ^ i20;
                    i16 = ((iM559712 ^ i19) * 18019) ^ (-683951548);
                    i17 = 542063269;
                    i22 = iM559712 ^ i17;
                    i21 = i16;
                    break;
                case -2004442247:
                case -500797056:
                    i5 = i23;
                    View view4 = view3;
                    TextView textView2 = textView;
                    C0873.m55684(textView2, iM55682 ^ 2120993727);
                    C7040.m16183(c14849);
                    short[] sArr11 = f82318;
                    if (C1229.f82066 < 0) {
                        textView = textView2;
                        short[] sArr12 = sArr8;
                        c15556 = new C15556(C15556.m35366(C1404.m56462(sArr11, 26, 2, i24)));
                        c15993M36344 = C15993.m36344(c20218.f62513);
                        int iM55684 = (C0873.m55680("ۧ֨") ^ i19) * (-47);
                        i23 = i5;
                        i2 = ((iM55684 ^ i20) * 8621) ^ (-1330241888);
                        i22 = iM55684 ^ (-1934645226);
                        sArr8 = sArr12;
                        view3 = view4;
                        i21 = i2;
                        i23 = i23;
                    } else {
                        view2 = view4;
                        textView = textView2;
                        sArr3 = sArr8;
                        sArr4 = sArr10;
                        sArr5 = sArr7;
                        i6 = i30;
                        main = mainM56560;
                        int iM55685 = C0873.m55680("ۛ᩷") ^ i19;
                        i7 = ((iM55685 ^ i20) * (-27589)) ^ 447068142;
                        i8 = iM55685 ^ (-680361607);
                        i28 = i28;
                        i30 = i6;
                        sArr8 = sArr3;
                        sArr10 = sArr4;
                        sArr7 = sArr5;
                        view3 = view2;
                        sArr6 = sArr6;
                        i29 = i29;
                        c15556 = null;
                        i22 = i8;
                        i23 = i5;
                        Main main2 = main;
                        s = s;
                        i21 = i7;
                        mainM56560 = main2;
                    }
                    break;
                case -1998816386:
                case -231977798:
                    i23 = i23;
                    view3 = view3;
                    if (C0866.m55647(itM55766)) {
                        iM559711 = C0873.m55680("ܽ۠") ^ i20;
                        i14 = ((iM559711 ^ i19) * 13789) ^ 1995626729;
                        i15 = -1054287468;
                    } else {
                        iM559711 = (i20 - C0946.m55979("ܳܽ")) * 83;
                        i14 = ((iM559711 ^ i19) * 8991) ^ 818154241;
                        i15 = 881965898;
                    }
                    i22 = iM559711 ^ i15;
                    view3 = view3;
                    i21 = i14;
                    i23 = i23;
                    break;
                case -1971746466:
                case 1243086576:
                    i24 = 15396;
                    iM55680 = C0946.m55979("ܶܿ") ^ i19;
                    i2 = ((iM55680 ^ i20) * 19245) ^ 1851050991;
                    i3 = 1440921741;
                    i11 = iM55680 ^ i3;
                    i28 = i28;
                    i30 = i30;
                    sArr8 = sArr8;
                    sArr10 = sArr10;
                    sArr7 = sArr7;
                    view3 = view3;
                    sArr6 = sArr6;
                    i29 = i29;
                    i22 = i11;
                    i21 = i2;
                    i23 = i23;
                    break;
                case -1902492131:
                case 637155003:
                    i5 = i23;
                    main = mainM56560;
                    sArr4 = sArr10;
                    view2 = view3;
                    sArr6 = sArr6;
                    i29 = i29;
                    sArr5 = sArr7;
                    i6 = i30;
                    sArr3 = sArr8;
                    i28 = i28;
                    s = f82318[13];
                    i26 = s * s;
                    i27 = 66683556;
                    if (C0861.m55626()) {
                        int iM55686 = C0873.m55680("ۛ᩷") ^ i19;
                        i7 = ((iM55686 ^ i20) * (-27589)) ^ 447068142;
                        i8 = iM55686 ^ (-680361607);
                        i28 = i28;
                        i30 = i6;
                        sArr8 = sArr3;
                        sArr10 = sArr4;
                        sArr7 = sArr5;
                        view3 = view2;
                        sArr6 = sArr6;
                        i29 = i29;
                        c15556 = null;
                    } else {
                        int iM55687 = (C0873.m55680("ۗܶ") ^ i19) * (-111);
                        i7 = ((iM55687 ^ i20) * 26429) ^ (-152295962);
                        i8 = iM55687 ^ (-1732345027);
                        i28 = i28;
                        i30 = i6;
                        sArr8 = sArr3;
                        sArr10 = sArr4;
                        sArr7 = sArr5;
                        view3 = view2;
                        sArr6 = sArr6;
                        i29 = i29;
                    }
                    i22 = i8;
                    i23 = i5;
                    Main main3 = main;
                    s = s;
                    i21 = i7;
                    mainM56560 = main3;
                    break;
                case -1887204195:
                case 1371401901:
                    i4 = i23;
                    sArr3 = sArr8;
                    sArr2 = sArr10;
                    short[] sArr13 = sArr7;
                    int i32 = i30;
                    View viewM56111 = C0992.m56111(mainM56560, iM55683 ^ i25);
                    String strM56373 = C1124.m56373(f82318, 17, 3, i24);
                    if (C1071.f81975 <= 0) {
                        i30 = i32;
                        sArr7 = sArr13;
                        str2 = strM56373;
                        view = viewM56111;
                        iM559710 = C0873.m55680("ۖᩳ") ^ i20;
                        i12 = ((iM559710 ^ i19) * 28749) ^ (-971629177);
                        i13 = -1902154949;
                        i22 = iM559710 ^ i13;
                        i23 = i4;
                        sArr10 = sArr2;
                        short[] sArr14 = sArr3;
                        view3 = view;
                        i21 = i12;
                        sArr8 = sArr14;
                    } else {
                        int iM55688 = (C0873.m55680("ܶ᩹") ^ i19) * (-67);
                        int i33 = ((iM55688 ^ i20) * 15023) ^ (-264724206);
                        i22 = iM55688 ^ (-1603329282);
                        i30 = i32;
                        i23 = i4;
                        sArr10 = sArr2;
                        sArr7 = sArr13;
                        str2 = strM56373;
                        i21 = i33;
                        sArr8 = sArr3;
                        view3 = viewM56111;
                    }
                    break;
                case -1799834607:
                case 233623301:
                    if (C1229.f82066 >= 0) {
                        iM559712 = (i20 - C0873.m55680("ۙܽ")) * 83;
                        i16 = ((iM559712 ^ i19) * 23849) ^ 1679311456;
                        i17 = 2129314893;
                        i22 = iM559712 ^ i17;
                        i21 = i16;
                    } else {
                        i4 = i23;
                        sArr2 = sArr10;
                        view = view3;
                        sArr3 = sArr8;
                        iM559710 = C0873.m55680("ۖᩳ") ^ i20;
                        i12 = ((iM559710 ^ i19) * 28749) ^ (-971629177);
                        i13 = -1902154949;
                        i22 = iM559710 ^ i13;
                        i23 = i4;
                        sArr10 = sArr2;
                        short[] sArr15 = sArr3;
                        view3 = view;
                        i21 = i12;
                        sArr8 = sArr15;
                    }
                    break;
                case -1638524574:
                case -1123214917:
                    i23 = i23;
                    sArr10 = sArr10;
                    view3 = view3;
                    sArr = sArr6;
                    i = i29;
                    sArr7 = sArr7;
                    i30 = i30;
                    sArr8 = sArr8;
                    i28 = i28;
                    iM55683 = C0873.m55680(C0906.m55810(sArr, i28, i, i24));
                    i25 = 2128069204;
                    if (!C0927.f81875) {
                        i29 = i;
                        iM55680 = C0873.m55680("ۧۜ") ^ i19;
                        sArr6 = sArr;
                        i2 = ((iM55680 ^ i20) * (-1025)) ^ 755743401;
                        i3 = -867595300;
                        i11 = iM55680 ^ i3;
                        i28 = i28;
                        i30 = i30;
                        sArr8 = sArr8;
                        sArr10 = sArr10;
                        sArr7 = sArr7;
                        view3 = view3;
                        sArr6 = sArr6;
                        i29 = i29;
                        i22 = i11;
                        i21 = i2;
                        i23 = i23;
                    } else {
                        int iM559717 = (i19 - C0946.m55979("֡۬")) * (-65);
                        int i34 = i;
                        i21 = ((iM559717 ^ i20) * (-31805)) ^ 2104474169;
                        sArr6 = sArr;
                        i28 = i28;
                        i30 = i30;
                        sArr8 = sArr8;
                        i23 = i23;
                        sArr10 = sArr10;
                        sArr7 = sArr7;
                        view3 = view3;
                        i22 = iM559717 ^ 2123947851;
                        i29 = i34;
                    }
                    break;
                case -1635880089:
                case -1098458535:
                    i5 = i23;
                    sArr4 = sArr10;
                    view = view3;
                    sArr3 = sArr8;
                    short[] sArr16 = sArr7;
                    i6 = i30;
                    iM559715 = C0946.m55979(C1044.m56276(sArr16, i6, 3, i24)) ^ 2117266367;
                    if (C1012.f81938 < 0) {
                        int iM55689 = (C0873.m55680("᩺ܶ") ^ i20) * 87;
                        i12 = ((iM55689 ^ i19) * (-29191)) ^ 1221192275;
                        i22 = iM55689 ^ (-1636490382);
                        i30 = i6;
                        i23 = i5;
                        sArr10 = sArr4;
                        sArr7 = sArr16;
                        short[] sArr17 = sArr3;
                        view3 = view;
                        i21 = i12;
                        sArr8 = sArr17;
                    } else {
                        view2 = view;
                        sArr5 = sArr16;
                        main = mainM56560;
                        int iM556810 = C0873.m55680("ۛ᩷") ^ i19;
                        i7 = ((iM556810 ^ i20) * (-27589)) ^ 447068142;
                        i8 = iM556810 ^ (-680361607);
                        i28 = i28;
                        i30 = i6;
                        sArr8 = sArr3;
                        sArr10 = sArr4;
                        sArr7 = sArr5;
                        view3 = view2;
                        sArr6 = sArr6;
                        i29 = i29;
                        c15556 = null;
                        i22 = i8;
                        i23 = i5;
                        Main main4 = main;
                        s = s;
                        i21 = i7;
                        mainM56560 = main4;
                    }
                    break;
                case -1478866234:
                case -1202905996:
                    iM559713 = C0946.m55979(strM56233) ^ 2129058849;
                    sArr10 = f82318;
                    i23 = 31;
                    iM559712 = (i20 - C0946.m55979("ᩳۡ")) * (-65);
                    i16 = ((iM559712 ^ i19) * (-1139)) ^ 1245017906;
                    i17 = 1724947868;
                    i22 = iM559712 ^ i17;
                    i21 = i16;
                    break;
                case -1232267937:
                case -115774798:
                    C0912.m55825(sb, C0949.m56016(sArr9, 37, 1, i24));
                    ServiceConnectionC1013.m56151(hashSet, C0845.m55591(sb));
                    iM559711 = (i20 - C0946.m55979("᩷᩸")) * (-37);
                    i14 = ((iM559711 ^ i19) * 14557) ^ 1313200931;
                    i15 = 1691642301;
                    i22 = iM559711 ^ i15;
                    view3 = view3;
                    i21 = i14;
                    i23 = i23;
                    break;
                case -1224161996:
                case -358633974:
                    iM559714 = C0946.m55979(C0946.m55986(sArr10, i23, 3, i24));
                    if (C0930.f81879 > 0) {
                        iM559712 = (C0873.m55680("ܶᩴ") ^ i20) * (-83);
                        i16 = ((iM559712 ^ i19) * (-21887)) ^ 505284820;
                        i17 = -1129247510;
                        i22 = iM559712 ^ i17;
                        i21 = i16;
                    } else {
                        i4 = i23;
                        sArr2 = sArr10;
                        view = view3;
                        sArr3 = sArr8;
                        iM559710 = C0873.m55680("ۖᩳ") ^ i20;
                        i12 = ((iM559710 ^ i19) * 28749) ^ (-971629177);
                        i13 = -1902154949;
                        i22 = iM559710 ^ i13;
                        i23 = i4;
                        sArr10 = sArr2;
                        short[] sArr18 = sArr3;
                        view3 = view;
                        i21 = i12;
                        sArr8 = sArr18;
                    }
                    break;
                case -1221687242:
                case -1221291812:
                    ServiceConnectionC1013.m56157();
                    break;
                case -1182201275:
                case 1112823908:
                    i4 = i23;
                    view = view3;
                    sArr3 = sArr8;
                    c14849 = (C14849) C1404.m56465(view, iM559715);
                    sArr2 = sArr10;
                    iM55682 = C0873.m55680(C0947.m55993(f82318, 23, 3, i24));
                    if (C1071.f81975 <= 0) {
                        iM559710 = C0946.m55979("ۙܺ") ^ i19;
                        i12 = ((iM559710 ^ i20) * (-26945)) ^ (-5644382);
                        i13 = 1973874974;
                    } else {
                        iM559710 = (i19 - C0873.m55680("ۚᩳ")) * 29;
                        i12 = ((iM559710 ^ i20) * 12795) ^ (-405003734);
                        i13 = 626618966;
                    }
                    i22 = iM559710 ^ i13;
                    i23 = i4;
                    sArr10 = sArr2;
                    short[] sArr19 = sArr3;
                    view3 = view;
                    i21 = i12;
                    sArr8 = sArr19;
                    break;
                case -866218167:
                case 64435942:
                    i23 = i23;
                    short[] sArr20 = sArr10;
                    View view5 = view3;
                    short[] sArr21 = sArr6;
                    int i35 = i29;
                    short[] sArr22 = sArr7;
                    int i36 = i30;
                    short[] sArr23 = sArr8;
                    int i37 = i28;
                    int i38 = i26 + i27;
                    short s2 = s;
                    Main main5 = mainM56560;
                    int i39 = s2 + 8166;
                    if ((i39 * i39) - (i38 + i38) > 0) {
                        iM55979 = C0946.m55979("ۗ۬") ^ i20;
                        i9 = ((iM55979 ^ i19) * 9255) ^ 396197742;
                        i10 = 1576937438;
                    } else {
                        iM55979 = (i20 - C0946.m55979("ۨۚ")) * 5;
                        i9 = ((iM55979 ^ i19) * 11761) ^ (-610703042);
                        i10 = 1958449908;
                    }
                    int i40 = iM55979 ^ i10;
                    i28 = i37;
                    i30 = i36;
                    sArr8 = sArr23;
                    sArr10 = sArr20;
                    sArr7 = sArr22;
                    view3 = view5;
                    sArr6 = sArr21;
                    i29 = i35;
                    i22 = i40;
                    i21 = i9;
                    mainM56560 = main5;
                    s = s2;
                    i23 = i23;
                    break;
                case -810307158:
                case 877053458:
                    dialogInterfaceC2564M21200 = C9199.m21200(c20671M55888, iM559713, (DialogInterface.OnClickListener) null, iM559714 ^ 2125124934, (DialogInterface.OnClickListener) null);
                    sArr8 = f82318;
                    iM559712 = (C0946.m55979("᩶᩹") + i19) * 59;
                    i16 = ((iM559712 ^ i20) * (-6553)) ^ 2127427940;
                    i17 = -1478268712;
                    i22 = iM559712 ^ i17;
                    i21 = i16;
                    break;
                case -495577211:
                case 691043844:
                    i4 = i23;
                    sArr2 = sArr10;
                    view = view3;
                    sArr3 = sArr8;
                    textView = (TextView) C1404.m56465(view, C0946.m55979(str2) ^ 2128958082);
                    sArr7 = f82318;
                    i30 = 20;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM559710 = C0873.m55680("ۖᩳ") ^ i20;
                        i12 = ((iM559710 ^ i19) * 28749) ^ (-971629177);
                        i13 = -1902154949;
                    } else {
                        iM559710 = (C0946.m55979("ۜ֨") ^ i20) * (-85);
                        i12 = ((iM559710 ^ i19) * 31825) ^ (-2094174140);
                        i13 = 1210793385;
                    }
                    i22 = iM559710 ^ i13;
                    i23 = i4;
                    sArr10 = sArr2;
                    short[] sArr110 = sArr3;
                    view3 = view;
                    i21 = i12;
                    sArr8 = sArr110;
                    break;
                case 21388883:
                case 1172059924:
                    C18676 c18676M36348 = c15993M36344.m36348();
                    c15556.m35379(c18676M36348);
                    HashSet hashSet2 = new HashSet();
                    itM55766 = C0894.m55766(c18676M36348.m42496());
                    hashSet = hashSet2;
                    iM559711 = (i20 - C0946.m55979("᩷᩸")) * (-37);
                    i14 = ((iM559711 ^ i19) * 14557) ^ 1313200931;
                    i15 = 1691642301;
                    i22 = iM559711 ^ i15;
                    view3 = view3;
                    i21 = i14;
                    i23 = i23;
                    break;
                case 123775701:
                case 592398076:
                    strM55689 = C0873.m55689(sArr8, 34, 3, i24);
                    if (!C1048.f81963) {
                        i5 = i23;
                        sArr4 = sArr10;
                        s = s;
                        view2 = view3;
                        sArr6 = sArr6;
                        i29 = i29;
                        sArr5 = sArr7;
                        i6 = i30;
                        main = mainM56560;
                        sArr3 = sArr8;
                        i28 = i28;
                        int iM556811 = C0873.m55680("ۛ᩷") ^ i19;
                        i7 = ((iM556811 ^ i20) * (-27589)) ^ 447068142;
                        i8 = iM556811 ^ (-680361607);
                        i28 = i28;
                        i30 = i6;
                        sArr8 = sArr3;
                        sArr10 = sArr4;
                        sArr7 = sArr5;
                        view3 = view2;
                        sArr6 = sArr6;
                        i29 = i29;
                        c15556 = null;
                        i22 = i8;
                        i23 = i5;
                        Main main6 = main;
                        s = s;
                        i21 = i7;
                        mainM56560 = main6;
                    } else {
                        iM559712 = (C0946.m55979("ۧۛ") + i19) * (-105);
                        i16 = ((iM559712 ^ i20) * (-5427)) ^ 1942206084;
                        i17 = 1748711821;
                        i22 = iM559712 ^ i17;
                        i21 = i16;
                    }
                    break;
                case 136478923:
                case 487571785:
                    if (!C0955.m56025()) {
                        i4 = i23;
                        sArr2 = sArr10;
                        view = view3;
                        sArr3 = sArr8;
                        iM559710 = C0946.m55979("ۙܺ") ^ i19;
                        i12 = ((iM559710 ^ i20) * (-26945)) ^ (-5644382);
                        i13 = 1973874974;
                        i22 = iM559710 ^ i13;
                        i23 = i4;
                        sArr10 = sArr2;
                        short[] sArr111 = sArr3;
                        view3 = view;
                        i21 = i12;
                        sArr8 = sArr111;
                    } else {
                        i23 = i23;
                        sArr10 = sArr10;
                        view3 = view3;
                        sArr = sArr6;
                        i = i29;
                        sArr7 = sArr7;
                        i30 = i30;
                        sArr8 = sArr8;
                        i28 = i28;
                        int iM559718 = (i19 - C0946.m55979("֡۬")) * (-65);
                        int i310 = i;
                        i21 = ((iM559718 ^ i20) * (-31805)) ^ 2104474169;
                        sArr6 = sArr;
                        i28 = i28;
                        i30 = i30;
                        sArr8 = sArr8;
                        i23 = i23;
                        sArr10 = sArr10;
                        sArr7 = sArr7;
                        view3 = view3;
                        i22 = iM559718 ^ 2123947851;
                        i29 = i310;
                    }
                    break;
                case 293322783:
                case 1112867006:
                    i23 = i23;
                    c15556.m35374(hashSet);
                    c15556.m35401();
                    C0906.m55818(c14849, c15556);
                    c20671M55888 = C0930.m55888(mainM56560);
                    view3 = view3;
                    C0882.m55725(c20671M55888, view3);
                    iM559711 = (i19 - C0873.m55680("᩻᩺")) * (-43);
                    i14 = ((iM559711 ^ i20) * (-1239)) ^ 1710953743;
                    i15 = -1337455237;
                    i22 = iM559711 ^ i15;
                    view3 = view3;
                    i21 = i14;
                    i23 = i23;
                    break;
                case 371754448:
                case 1844868512:
                    i23 = i23;
                    mainM56560 = C1929.m56560(c20218.f62514);
                    sArr6 = f82318;
                    i28 = 14;
                    i29 = 3;
                    int iM559719 = (i20 - C0946.m55979("ۗܺ")) * 89;
                    i2 = ((iM559719 ^ i19) * (-383)) ^ 1867736614;
                    i11 = iM559719 ^ 278685577;
                    i30 = i30;
                    sArr8 = sArr8;
                    sArr10 = sArr10;
                    sArr7 = sArr7;
                    view3 = view3;
                    i22 = i11;
                    i21 = i2;
                    i23 = i23;
                    break;
                case 913109259:
                case 1098535588:
                    if (C1025.f81947 >= 0) {
                        i4 = i23;
                        sArr2 = sArr10;
                        view = view3;
                        sArr3 = sArr8;
                        iM559710 = C0873.m55680("ۖᩳ") ^ i20;
                        i12 = ((iM559710 ^ i19) * 28749) ^ (-971629177);
                        i13 = -1902154949;
                        i22 = iM559710 ^ i13;
                        i23 = i4;
                        sArr10 = sArr2;
                        short[] sArr112 = sArr3;
                        view3 = view;
                        i21 = i12;
                        sArr8 = sArr112;
                    } else {
                        i23 = i23;
                        sArr10 = sArr10;
                        view3 = view3;
                        sArr = sArr6;
                        i = i29;
                        sArr7 = sArr7;
                        i30 = i30;
                        sArr8 = sArr8;
                        i28 = i28;
                        int iM5597110 = (i19 - C0946.m55979("֡۬")) * (-65);
                        int i311 = i;
                        i21 = ((iM5597110 ^ i20) * (-31805)) ^ 2104474169;
                        sArr6 = sArr;
                        i28 = i28;
                        i30 = i30;
                        sArr8 = sArr8;
                        i23 = i23;
                        sArr10 = sArr10;
                        sArr7 = sArr7;
                        view3 = view3;
                        i22 = iM5597110 ^ 2123947851;
                        i29 = i311;
                    }
                    break;
                case 1365786551:
                case 1498047701:
                    C0882.m55716(C0873.m55680(strM55689) ^ 2123202150);
                    final DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M21200;
                    final C15556 c15557 = c15556;
                    C0947.m55996(C1964.m56591(dialogInterfaceC2564M21200), new View.OnClickListener(c20218) { // from class: l.ۢ۬ܽ

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C20218 f32098;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            Main main7 = null;
                            String str3 = null;
                            C20218 c20219 = null;
                            DialogInterfaceC2564 dialogInterfaceC2565 = null;
                            int i41 = -994217488;
                            int i42 = C0992.f81922;
                            int i43 = RunnableC1014.f81941;
                            int iM556812 = (C0873.m55680("۫᩵") + i43) * 61;
                            int i44 = ((iM556812 ^ i42) * 18357) ^ 1139314420;
                            int i45 = 417847575;
                            while (true) {
                                i41 = ((((i41 ^ i42) * 20571) >> 31) & i44) ^ (iM556812 ^ i45);
                                switch (i41) {
                                    case -1582621812:
                                    case 216278072:
                                        main7 = mainM56560;
                                        if (C0898.f81858 <= 0) {
                                            iM556812 = (i42 - C0873.m55680("ۤᩳ")) * (-67);
                                            i44 = ((iM556812 ^ i43) * 5541) ^ (-764061778);
                                            i45 = 1770607935;
                                        } else {
                                            iM556812 = (i43 - C0946.m55979("۫۬")) * (-23);
                                            i44 = ((iM556812 ^ i42) * 4955) ^ 1749104167;
                                            i45 = -1800967372;
                                        }
                                        break;
                                    case -1487142376:
                                    case 132347403:
                                        str3 = str;
                                        if (C1017.f81942 >= 0) {
                                            iM556812 = C0946.m55979("ᩳܽ") ^ i43;
                                            i44 = ((iM556812 ^ i42) * (-3735)) ^ (-1572908968);
                                            i45 = 1599773628;
                                        } else {
                                            iM556812 = C0946.m55979("ۘ᩺") ^ i42;
                                            i44 = ((iM556812 ^ i43) * 9133) ^ 840815701;
                                            i45 = -1039758514;
                                        }
                                        break;
                                    case -1466958865:
                                    case -7846509:
                                        C1124.m56367();
                                        C0947.m55997();
                                        iM556812 = (i42 - C0873.m55680("ۤᩳ")) * (-67);
                                        i44 = ((iM556812 ^ i43) * 5541) ^ (-764061778);
                                        i45 = 1770607935;
                                        break;
                                    case -1403003644:
                                    case 189568345:
                                        if (C1404.f82149 >= 0) {
                                            iM556812 = (i43 - C0873.m55680("֨۟")) * 5;
                                            i44 = ((iM556812 ^ i42) * 25579) ^ (-1586380266);
                                            i45 = 1092456097;
                                        } else {
                                            iM556812 = C0946.m55979("ܰ۠") ^ i42;
                                            i44 = ((iM556812 ^ i43) * (-31885)) ^ (-645035520);
                                            i45 = 726485273;
                                        }
                                        break;
                                    case -1084227182:
                                    case -732246395:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM556812 = C0873.m55680("᩵᩹") ^ i42;
                                            i44 = ((iM556812 ^ i43) * (-13267)) ^ (-366443368);
                                            i45 = 948308218;
                                        } else {
                                            iM556812 = C0873.m55680("ۡۜ") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 317) ^ 1915193606;
                                            i45 = 1538258632;
                                        }
                                        break;
                                    case -957602471:
                                    case 143174446:
                                        if (C0892.m55749()) {
                                            iM556812 = (i42 - C0946.m55979("۟᩸")) * (-33);
                                            i44 = ((iM556812 ^ i43) * (-11797)) ^ 1614479819;
                                            i45 = 113503695;
                                        } else {
                                            iM556812 = (i43 - C0873.m55680("֨۟")) * 5;
                                            i44 = ((iM556812 ^ i42) * 25579) ^ (-1586380266);
                                            i45 = 1092456097;
                                        }
                                        break;
                                    case -825209696:
                                    case 2086784317:
                                        C20218.m45705(c20219, main7, dialogInterfaceC2565, c15557, str3);
                                        break;
                                    case -719007826:
                                    case 962794227:
                                        C0930.m55885();
                                        if (C1046.f81962 > 0) {
                                            iM556812 = C0946.m55979("֨ܶ") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 4233) ^ (-263732533);
                                            i45 = 1193166058;
                                        } else {
                                            iM556812 = (i43 - C0873.m55680("֨۟")) * 5;
                                            i44 = ((iM556812 ^ i42) * 25579) ^ (-1586380266);
                                            i45 = 1092456097;
                                        }
                                        break;
                                    case -691506260:
                                    case 1051946299:
                                        if (C1012.f81938 >= 0) {
                                            iM556812 = C0873.m55680("᩵᩹") ^ i42;
                                            i44 = ((iM556812 ^ i43) * (-13267)) ^ (-366443368);
                                            i45 = 948308218;
                                        } else {
                                            iM556812 = (i43 - C0873.m55680("֨۟")) * 5;
                                            i44 = ((iM556812 ^ i42) * 25579) ^ (-1586380266);
                                            i45 = 1092456097;
                                        }
                                        break;
                                    case -615429409:
                                    case 1305194732:
                                        if (C1003.f81929 <= 0) {
                                            iM556812 = C0946.m55979("֨ܶ") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 4233) ^ (-263732533);
                                            i45 = 1193166058;
                                        } else {
                                            iM556812 = C0873.m55680("ۙ᩹") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 30021) ^ (-1035078388);
                                            i45 = 1789310516;
                                        }
                                        break;
                                    case -357130072:
                                    case 529228400:
                                        if (C1028.f81950 <= 0) {
                                            iM556812 = C0946.m55979("ᩳܽ") ^ i43;
                                            i44 = ((iM556812 ^ i42) * (-3735)) ^ (-1572908968);
                                            i45 = 1599773628;
                                        } else {
                                            iM556812 = (i42 - C0873.m55680("ۜۨ")) * 123;
                                            i44 = ((iM556812 ^ i43) * 6703) ^ (-120455365);
                                            i45 = -1919364736;
                                        }
                                        break;
                                    case -235282218:
                                    case 977659774:
                                        if (C0873.m55678()) {
                                            iM556812 = C0946.m55979("ᩳܽ") ^ i43;
                                            i44 = ((iM556812 ^ i42) * (-3735)) ^ (-1572908968);
                                            i45 = 1599773628;
                                        } else {
                                            iM556812 = C0873.m55680("ܶ֫") ^ i42;
                                            i44 = ((iM556812 ^ i43) * 2775) ^ 854547584;
                                            i45 = 119000173;
                                        }
                                        break;
                                    case -213800447:
                                    case 1485831014:
                                        if (C1071.m56343() != 0) {
                                            iM556812 = C0873.m55680("᩵᩹") ^ i42;
                                            i44 = ((iM556812 ^ i43) * (-13267)) ^ (-366443368);
                                            i45 = 948308218;
                                        } else {
                                            iM556812 = (i43 - C0873.m55680("᩸ۙ")) * 97;
                                            i44 = ((iM556812 ^ i42) * 31163) ^ 1235454915;
                                            i45 = -857431991;
                                        }
                                        break;
                                    case 90300393:
                                    case 653541321:
                                        if (C0906.f81862 >= 0) {
                                            iM556812 = (i43 - C0873.m55680("֨۟")) * 5;
                                            i44 = ((iM556812 ^ i42) * 25579) ^ (-1586380266);
                                            i45 = 1092456097;
                                        } else {
                                            iM556812 = (i42 - C0873.m55680("ۤᩳ")) * (-67);
                                            i44 = ((iM556812 ^ i43) * 5541) ^ (-764061778);
                                            i45 = 1770607935;
                                        }
                                        break;
                                    case 799534108:
                                    case 976835354:
                                        c20219 = this.f32098;
                                        dialogInterfaceC2565 = dialogInterfaceC2564;
                                        if (C0917.f81868) {
                                            iM556812 = C0946.m55979("֨ܶ") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 4233) ^ (-263732533);
                                            i45 = 1193166058;
                                        } else {
                                            iM556812 = (i43 - C0873.m55680("ܺ֡")) * 33;
                                            i44 = ((iM556812 ^ i42) * 9443) ^ 621235071;
                                            i45 = 1375118438;
                                        }
                                        break;
                                    default:
                                        C0930.m55885();
                                        C1929.m56553();
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i41 = 190251717;
                            int i42 = C1046.f81962;
                            int i43 = C1025.f81947;
                            int iM556812 = (C0873.m55680("֨۟") ^ i42) * 39;
                            int i44 = ((iM556812 ^ i43) * (-17561)) ^ 2017364567;
                            int i45 = 1771181239;
                            while (true) {
                                i41 = ((((i41 ^ i43) * 26213) >> 31) & i44) ^ (iM556812 ^ i45);
                                switch (i41) {
                                    case -2132565499:
                                    case -1623860697:
                                        C0917.m55854();
                                        if (!RunnableC0897.f81856) {
                                            iM556812 = C0873.m55680("ۙ۠") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        } else {
                                            iM556812 = C0946.m55979("᩵֨") ^ i42;
                                            i44 = ((iM556812 ^ i43) * 24147) ^ (-364044803);
                                            i45 = 316600945;
                                        }
                                        break;
                                    case -1874507013:
                                    case -441771912:
                                        if (C1017.f81942 >= 0) {
                                            iM556812 = C0873.m55680("ۙ۠") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        } else {
                                            iM556812 = C0873.m55680("۟᩷") ^ i42;
                                            i44 = ((iM556812 ^ i43) * 8357) ^ (-1732915949);
                                            i45 = -1482833812;
                                        }
                                        break;
                                    case -1626221211:
                                    case -709604077:
                                        return;
                                    case -1491965597:
                                    case 1142182149:
                                        if (C1964.f83032 > 0) {
                                            iM556812 = C0873.m55680("ۙ۠") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        } else {
                                            iM556812 = (C0946.m55979("ܳ᩸") ^ i42) * 109;
                                            i44 = ((iM556812 ^ i43) * 25287) ^ 1351150969;
                                            i45 = -602045638;
                                        }
                                        break;
                                    case -1168252003:
                                    case 570923919:
                                        ServiceConnectionC1013.m56157();
                                        C0955.m56025();
                                        throw new RuntimeException();
                                    case -830694997:
                                    case -689956566:
                                        if (C1071.m56343() != 0) {
                                            iM556812 = C0873.m55680("ۙ۠") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        } else {
                                            iM556812 = (C0946.m55979("ۘ۫") ^ i43) * (-61);
                                            i44 = ((iM556812 ^ i42) * 20291) ^ (-769892526);
                                            i45 = -1174789138;
                                        }
                                        break;
                                    case -821961824:
                                    case 452405616:
                                        if (C0898.f81858 <= 0) {
                                            iM556812 = C0873.m55680("ۙ۠") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        } else {
                                            iM556812 = C0873.m55680("ܶᩳ") ^ i43;
                                            i44 = ((iM556812 ^ i42) * (-19559)) ^ 803235548;
                                            i45 = 288104552;
                                        }
                                        break;
                                    case -454180711:
                                    case 2090115360:
                                        if (C0863.f81833 <= 0) {
                                            iM556812 = C0946.m55979("᩵֨") ^ i42;
                                            i44 = ((iM556812 ^ i43) * 24147) ^ (-364044803);
                                            i45 = 316600945;
                                        } else {
                                            iM556812 = (C0946.m55979("ۖۗ") + i42) * (-69);
                                            i44 = ((iM556812 ^ i43) * (-14623)) ^ (-1160218203);
                                            i45 = 1416593752;
                                        }
                                        break;
                                    case -441868271:
                                    case 37008020:
                                        if (C1964.f83032 <= 0) {
                                            iM556812 = C0946.m55979("᩵֨") ^ i42;
                                            i44 = ((iM556812 ^ i43) * 24147) ^ (-364044803);
                                            i45 = 316600945;
                                        } else {
                                            iM556812 = (C0946.m55979("֡ۢ") + i42) * 33;
                                            i44 = ((iM556812 ^ i43) * (-10581)) ^ 164397923;
                                            i45 = 643462986;
                                        }
                                        break;
                                    case -385889012:
                                    case 2042528802:
                                        if (C1404.f82149 >= 0) {
                                            iM556812 = (C0946.m55979("֡ۗ") + i43) * (-9);
                                            i44 = ((iM556812 ^ i42) * (-16821)) ^ 91775156;
                                            i45 = -133819262;
                                        } else {
                                            iM556812 = (i43 - C0946.m55979("ܰܺ")) * 83;
                                            i44 = ((iM556812 ^ i42) * (-7833)) ^ (-79324969);
                                            i45 = -1133113492;
                                        }
                                        break;
                                    case -246106701:
                                    case 446766234:
                                        if (C0949.f81897 >= 0) {
                                            iM556812 = (C0946.m55979("֡ۗ") + i43) * (-9);
                                            i44 = ((iM556812 ^ i42) * (-16821)) ^ 91775156;
                                            i45 = -133819262;
                                        } else {
                                            iM556812 = C0873.m55680("ۙ֨") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 8623) ^ (-2084316443);
                                            i45 = -1925604320;
                                        }
                                        break;
                                    case -70302219:
                                    case 1537645520:
                                        if (AbstractC0942.f81890 <= 0) {
                                            iM556812 = (C0946.m55979("ܽۙ") + i43) * 99;
                                            i44 = ((iM556812 ^ i42) * (-9019)) ^ 2093755460;
                                            i45 = -2137984055;
                                        } else {
                                            iM556812 = (C0873.m55680("ۧ۫") ^ i42) * 119;
                                            i44 = ((iM556812 ^ i43) * (-17023)) ^ (-1183454018);
                                            i45 = -2110004170;
                                        }
                                        break;
                                    case 122590166:
                                    case 374220354:
                                        if (C1229.m56410() != 0) {
                                            iM556812 = C0873.m55680("ۙ۠") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        } else {
                                            iM556812 = (C0873.m55680("֡֡") ^ i43) * (-75);
                                            i44 = ((iM556812 ^ i42) * (-9939)) ^ (-225508697);
                                            i45 = 549772753;
                                        }
                                        break;
                                    case 273258770:
                                    case 1706175034:
                                        C1071.m56343();
                                        if (C1229.m56410() != 0) {
                                            iM556812 = (C0946.m55979("֡ۗ") + i43) * (-9);
                                            i44 = ((iM556812 ^ i42) * (-16821)) ^ 91775156;
                                            i45 = -133819262;
                                        } else {
                                            iM556812 = C0873.m55680("ۙ۠") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        }
                                        break;
                                    case 443960152:
                                    case 799188192:
                                        C1024.m56209();
                                        iM556812 = C0873.m55680("ۙ۠") ^ i43;
                                        i44 = ((iM556812 ^ i42) * 7415) ^ (-1215058631);
                                        i45 = 1322973527;
                                        break;
                                    default:
                                        this.f32098 = c20218;
                                        if (C0892.f81851) {
                                            iM556812 = (C0946.m55979("ۤ᩻") + i42) * (-123);
                                            i44 = ((iM556812 ^ i43) * (-13565)) ^ (-641765488);
                                            i45 = -2100048099;
                                        } else {
                                            iM556812 = C0873.m55680("ۙ۠") ^ i43;
                                            i44 = ((iM556812 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    break;
                default:
                    i23 = i23;
                    strM56233 = C1025.m56233(f82318, 28, 3, i24);
                    if (C0898.f81858 > 0) {
                        int iM559720 = (C0946.m55979("۟֫") + i19) * 49;
                        i2 = ((iM559720 ^ i20) * 24605) ^ (-481913028);
                        i22 = iM559720 ^ 1102118452;
                        i21 = i2;
                        i23 = i23;
                    } else {
                        sArr10 = sArr10;
                        view3 = view3;
                        sArr = sArr6;
                        i = i29;
                        sArr7 = sArr7;
                        i30 = i30;
                        sArr8 = sArr8;
                        i28 = i28;
                        int iM5597111 = (i19 - C0946.m55979("֡۬")) * (-65);
                        int i312 = i;
                        i21 = ((iM5597111 ^ i20) * (-31805)) ^ 2104474169;
                        sArr6 = sArr;
                        i28 = i28;
                        i30 = i30;
                        sArr8 = sArr8;
                        i23 = i23;
                        sArr10 = sArr10;
                        sArr7 = sArr7;
                        view3 = view3;
                        i22 = iM5597111 ^ 2123947851;
                        i29 = i312;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0219 A[PHI: r1 r7 r12 r13 r21 r23
      0x0219: PHI (r1v8 l.᩵ۚۢ) = (r1v2 l.᩵ۚۢ), (r1v7 l.᩵ۚۢ), (r1v2 l.᩵ۚۢ) binds: [B:10:0x0064, B:49:0x0217, B:45:0x01e5] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:10:0x0064, B:49:0x0217, B:45:0x01e5] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v5 short[]) binds: [B:10:0x0064, B:49:0x0217, B:45:0x01e5] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v5 int) binds: [B:10:0x0064, B:49:0x0217, B:45:0x01e5] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r21v24 android.content.DialogInterface$OnClickListener) = 
      (r21v2 android.content.DialogInterface$OnClickListener)
      (r21v23 android.content.DialogInterface$OnClickListener)
      (r21v27 android.content.DialogInterface$OnClickListener)
     binds: [B:10:0x0064, B:49:0x0217, B:45:0x01e5] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r23v18 int) = (r23v0 int), (r23v17 int), (r23v20 int) binds: [B:10:0x0064, B:49:0x0217, B:45:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m45705(final C20218 c20218, final Main main, final DialogInterfaceC2564 dialogInterfaceC2564, final C15556 c15556, final String str) {
        DialogInterface.OnClickListener onClickListener;
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        DialogInterface.OnClickListener onClickListener2;
        short s;
        int iM55979;
        int i5;
        int i6;
        int i7 = C0898.f81858;
        int i8 = C0906.f81862;
        int iM55682 = C0873.m55680("ۚۡ") ^ i7;
        int i9 = ((iM55682 ^ i8) * 12067) ^ (-1388014384);
        DialogInterface.OnClickListener onClickListener3 = null;
        Object obj = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM55682 ^ 1729689788;
        C20671 c20671M55888 = null;
        int iM55683 = 0;
        int iM559710 = 0;
        int i11 = 0;
        int iM55684 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short s2 = 0;
        int i15 = 0;
        int i16 = 458218538;
        int i17 = 0;
        short[] sArr3 = null;
        int i18 = 0;
        while (true) {
            i16 = i10 ^ (i9 & (((i16 ^ i8) * (-8383)) >> 31));
            switch (i16) {
                case -2139465772:
                case -267218161:
                    iM55683 = iM55683;
                    onClickListener3 = onClickListener3;
                    int i19 = i17 + 269583561;
                    if (i15 - (i19 + i19) > 0) {
                        iM55681 = (C0873.m55680("֨ۤ") + i8) * (-79);
                        i3 = ((iM55681 ^ i7) * 3803) ^ (-956385719);
                        i4 = 1797836258;
                    } else {
                        iM55681 = (i7 - C0946.m55979("᩶۫")) * 11;
                        i3 = ((iM55681 ^ i8) * 7011) ^ (-854847955);
                        i4 = -840240021;
                    }
                    int i20 = iM55681 ^ i4;
                    onClickListener3 = onClickListener3;
                    i10 = i20;
                    i9 = i3;
                    iM55683 = iM55683;
                    break;
                case -1927133133:
                case -613659929:
                    if (!C0861.f81831) {
                        iM55680 = (C0873.m55680("᩶ۛ") + i8) * 97;
                        onClickListener = onClickListener3;
                        i = ((iM55680 ^ i7) * (-7339)) ^ 688488788;
                        i2 = 1293644259;
                        DialogInterface.OnClickListener onClickListener4 = onClickListener;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                        onClickListener3 = onClickListener4;
                    } else {
                        iM55683 = iM55683;
                        onClickListener2 = onClickListener3;
                        s = s2;
                        iM55979 = C0946.m55979("ۙܽ") ^ i8;
                        i5 = ((iM55979 ^ i7) * 22645) ^ 1724677501;
                        i6 = -661631732;
                        int i21 = iM55979 ^ i6;
                        s2 = s;
                        i9 = i5;
                        onClickListener3 = onClickListener2;
                        i10 = i21;
                        iM55683 = iM55683;
                    }
                    break;
                case -1872609734:
                case 163524921:
                    i14 = 22794;
                    iM55681 = (i7 - C0873.m55680("ܳ᩶")) * (-57);
                    i3 = ((iM55681 ^ i8) * (-7721)) ^ (-1951546046);
                    i4 = -160713538;
                    int i22 = iM55681 ^ i4;
                    onClickListener3 = onClickListener3;
                    i10 = i22;
                    i9 = i3;
                    iM55683 = iM55683;
                    break;
                case -1798128302:
                case -1291779917:
                    iM55683 = iM55683;
                    onClickListener3 = onClickListener3;
                    C1012.m56146(c20671M55888, 2124602408 ^ iM55684);
                    sArr = f82318;
                    i18 = 4;
                    if (C1229.m56410() != 0) {
                        iM55681 = (i7 - C0946.m55979("᩵ᩳ")) * (-89);
                        i3 = ((iM55681 ^ i8) * (-20873)) ^ 1083257765;
                        i4 = -408116006;
                    } else {
                        iM55681 = (C0946.m55979("᩵ۛ") + i8) * (-17);
                        i3 = ((iM55681 ^ i7) * (-13935)) ^ 1362475356;
                        i4 = 1883307996;
                    }
                    int i23 = iM55681 ^ i4;
                    onClickListener3 = onClickListener3;
                    i10 = i23;
                    i9 = i3;
                    iM55683 = iM55683;
                    break;
                case -1757462059:
                case 438387385:
                    i14 = 18429;
                    iM55681 = (i7 - C0873.m55680("ܳ᩶")) * (-57);
                    i3 = ((iM55681 ^ i8) * (-7721)) ^ (-1951546046);
                    i4 = -160713538;
                    int i24 = iM55681 ^ i4;
                    onClickListener3 = onClickListener3;
                    i10 = i24;
                    i9 = i3;
                    iM55683 = iM55683;
                    break;
                case -1525370594:
                case 998259094:
                    C1024.m56208(dialogInterfaceC2564);
                    break;
                case -966320737:
                case 513613491:
                    C1048.m56305();
                    C0894.m55769();
                    iM55683 = iM55683;
                    onClickListener2 = onClickListener3;
                    s = s2;
                    iM55979 = C0946.m55979("ۙܽ") ^ i8;
                    i5 = ((iM55979 ^ i7) * 22645) ^ 1724677501;
                    i6 = -661631732;
                    int i25 = iM55979 ^ i6;
                    s2 = s;
                    i9 = i5;
                    onClickListener3 = onClickListener2;
                    i10 = i25;
                    iM55683 = iM55683;
                    break;
                case -699780321:
                case 31281563:
                    C0906.m55817(c20671M55888, iM559710, onClickListener3);
                    sArr2 = f82318;
                    i13 = 3;
                    if (C1017.m56187() <= 0) {
                        i12 = 10;
                        int iM559711 = C0946.m55979("ܳۡ") ^ i8;
                        i10 = iM559711 ^ (-615891026);
                        i9 = ((iM559711 ^ i7) * 2355) ^ 2124106081;
                        c20671M55888 = c20671M55888;
                    } else {
                        int iM559712 = C0946.m55979("᩵ܶ") ^ i8;
                        i10 = iM559712 ^ 1975988338;
                        i9 = ((iM559712 ^ i7) * (-11207)) ^ 515531787;
                        i12 = 10;
                    }
                    break;
                case -624116424:
                case 1733404609:
                    int iM55685 = C0873.m55680(C1404.m56462(sArr2, i12, i13, i14)) ^ 2123542547;
                    if (C0873.f81841 <= 0) {
                        i11 = iM55685;
                        obj = null;
                        iM55680 = (C0873.m55680("᩶ۛ") + i8) * 97;
                        onClickListener = onClickListener3;
                        i = ((iM55680 ^ i7) * (-7339)) ^ 688488788;
                        i2 = 1293644259;
                        DialogInterface.OnClickListener onClickListener5 = onClickListener;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                        onClickListener3 = onClickListener5;
                    } else {
                        int iM55686 = C0873.m55680("᩶ܰ") ^ i7;
                        int i26 = ((iM55686 ^ i8) * 15223) ^ 713903540;
                        i10 = iM55686 ^ (-158068016);
                        i11 = iM55685;
                        i9 = i26;
                        obj = null;
                    }
                    break;
                case -386512766:
                case 2000059529:
                    iM55683 = iM55683;
                    onClickListener2 = onClickListener3;
                    s = s2;
                    int i27 = s + 16419;
                    i15 = i27 * i27;
                    i17 = s * s;
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0946.m55979("ۙܽ") ^ i8;
                        i5 = ((iM55979 ^ i7) * 22645) ^ 1724677501;
                        i6 = -661631732;
                    } else {
                        iM55979 = C0946.m55979("ܰ֨") ^ i8;
                        i5 = ((iM55979 ^ i7) * 22829) ^ 1292184548;
                        i6 = 1595588956;
                    }
                    int i28 = iM55979 ^ i6;
                    s2 = s;
                    i9 = i5;
                    onClickListener3 = onClickListener2;
                    i10 = i28;
                    iM55683 = iM55683;
                    break;
                case -362436108:
                case 818273053:
                    iM559710 = 2129467184 ^ C0946.m55979(C1929.m56558(sArr3, 7, 3, i14));
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0873.m55680("᩶ۛ") + i8) * 97;
                        onClickListener = onClickListener3;
                        i = ((iM55680 ^ i7) * (-7339)) ^ 688488788;
                        i2 = 1293644259;
                    } else {
                        onClickListener = onClickListener3;
                        iM55680 = (C0946.m55979("۫᩺") ^ i8) * 41;
                        i = ((iM55680 ^ i7) * 12103) ^ 343073584;
                        i2 = -568760709;
                    }
                    DialogInterface.OnClickListener onClickListener6 = onClickListener;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    onClickListener3 = onClickListener6;
                    break;
                case -325909316:
                case 477398226:
                    if (C0866.f81837 >= 0) {
                        iM55683 = iM55683;
                        onClickListener2 = onClickListener3;
                        s = s2;
                        iM55979 = C0946.m55979("ۙܽ") ^ i8;
                        i5 = ((iM55979 ^ i7) * 22645) ^ 1724677501;
                        i6 = -661631732;
                        int i29 = iM55979 ^ i6;
                        s2 = s;
                        i9 = i5;
                        onClickListener3 = onClickListener2;
                        i10 = i29;
                        iM55683 = iM55683;
                    } else {
                        int iM55687 = (i7 - C0873.m55680("᩹ۨ")) * (-111);
                        i10 = iM55687 ^ (-586859654);
                        i9 = ((iM55687 ^ i8) * (-24831)) ^ (-1288986186);
                    }
                    break;
                case -323326595:
                case 35146727:
                    iM55683 = iM55683;
                    onClickListener3 = onClickListener3;
                    if (c15556.m35388().isEmpty()) {
                        iM55681 = (C0946.m55979("ۡۨ") + i7) * 15;
                        i3 = ((iM55681 ^ i8) * (-27587)) ^ 1890796426;
                        i4 = -622990817;
                    } else {
                        iM55681 = C0873.m55680("ܰۡ") ^ i8;
                        i3 = ((iM55681 ^ i7) * (-9343)) ^ 2030589533;
                        i4 = -31976047;
                    }
                    int i210 = iM55681 ^ i4;
                    onClickListener3 = onClickListener3;
                    i10 = i210;
                    i9 = i3;
                    iM55683 = iM55683;
                    break;
                case -32297374:
                case 741659593:
                    C0967.m56076(c20671M55888, i11, obj);
                    C11896.m27216(c20218.f62514, C1025.m56221(c20671M55888), str);
                    break;
                case 121688920:
                case 276038755:
                    onClickListener = onClickListener3;
                    iM55683 = 2130599219 ^ C0873.m55680(C0955.m56029(sArr, i18, 3, i14));
                    if (!C0955.f81898) {
                        iM55680 = (C0873.m55680("᩷ܰ") ^ i7) * (-27);
                        i = ((iM55680 ^ i8) * (-23033)) ^ (-1161018675);
                        i2 = 1367220353;
                        DialogInterface.OnClickListener onClickListener7 = onClickListener;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                        onClickListener3 = onClickListener7;
                    } else {
                        onClickListener3 = onClickListener;
                        int iM559713 = C0946.m55979("ܳۡ") ^ i8;
                        i10 = iM559713 ^ (-615891026);
                        i9 = ((iM559713 ^ i7) * 2355) ^ 2124106081;
                        c20671M55888 = c20671M55888;
                    }
                    break;
                case 228504324:
                case 1360021003:
                    iM55683 = iM55683;
                    onClickListener3 = onClickListener3;
                    c20671M55888 = C0930.m55888(main);
                    iM55684 = C0873.m55680(C0992.m56102(f82318, 1, 3, i14));
                    if (C1053.f81965 <= 0) {
                        iM55681 = (i7 - C0946.m55979("᩵ᩳ")) * (-89);
                        i3 = ((iM55681 ^ i8) * (-20873)) ^ 1083257765;
                        i4 = -408116006;
                    } else {
                        iM55681 = C0946.m55979("ܺܿ") ^ i7;
                        i3 = ((iM55681 ^ i8) * (-13017)) ^ (-1228038997);
                        i4 = -1148854210;
                    }
                    int i211 = iM55681 ^ i4;
                    onClickListener3 = onClickListener3;
                    i10 = i211;
                    i9 = i3;
                    iM55683 = iM55683;
                    break;
                case 395076488:
                case 1805219273:
                    iM55683 = iM55683;
                    onClickListener3 = onClickListener3;
                    s2 = f82318[0];
                    if (C1053.f81965 > 0) {
                        iM55681 = (C0873.m55680("֡ۛ") ^ i8) * 59;
                        i3 = ((iM55681 ^ i7) * (-22263)) ^ 1483528656;
                        i4 = 569292674;
                        int i212 = iM55681 ^ i4;
                        onClickListener3 = onClickListener3;
                        i10 = i212;
                        i9 = i3;
                        iM55683 = iM55683;
                    } else {
                        onClickListener3 = onClickListener3;
                        iM55683 = iM55683;
                        int iM559714 = C0946.m55979("ܳۡ") ^ i8;
                        i10 = iM559714 ^ (-615891026);
                        i9 = ((iM559714 ^ i7) * 2355) ^ 2124106081;
                        c20671M55888 = c20671M55888;
                    }
                    break;
                case 1220707316:
                case 1567049899:
                    C1194.m56390(c20671M55888, iM55683);
                    onClickListener3 = new DialogInterface.OnClickListener(c20218) { // from class: l.ۡ۬ܽ

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C20218 f30000;

                        {
                            int i30 = 1408432975;
                            int i31 = C0906.f81862;
                            int i32 = C0873.f81841;
                            int iM55688 = (C0873.m55680("۟ۚ") ^ i32) * (-83);
                            int i33 = ((iM55688 ^ i31) * (-24039)) ^ (-334500984);
                            int i34 = -1362618415;
                            while (true) {
                                i30 = ((((i30 ^ i31) * (-21755)) >> 31) & i33) ^ (iM55688 ^ i34);
                                switch (i30) {
                                    case -2055656598:
                                    case 560312410:
                                        if (C0882.f81846) {
                                            iM55688 = C0873.m55680("ۙܶ") ^ i31;
                                            i33 = ((iM55688 ^ i32) * 14215) ^ (-841742393);
                                            i34 = -1297308216;
                                        } else {
                                            iM55688 = (i32 - C0946.m55979("۫֡")) * (-113);
                                            i33 = ((iM55688 ^ i31) * (-29353)) ^ (-1423424574);
                                            i34 = 625225057;
                                        }
                                        break;
                                    case -1948710868:
                                    case 1538109961:
                                        if (C0912.f81867 <= 0) {
                                            iM55688 = C0946.m55979("᩺ۚ") ^ i31;
                                            i33 = ((iM55688 ^ i32) * 6341) ^ 1128664525;
                                            i34 = 1945958068;
                                        } else {
                                            iM55688 = C0946.m55979("᩵᩷") ^ i32;
                                            i33 = ((iM55688 ^ i31) * 13259) ^ 154565749;
                                            i34 = 1180400311;
                                        }
                                        break;
                                    case -1792639621:
                                    case 1829716421:
                                        if (C1036.f81953 >= 0) {
                                            iM55688 = (i32 - C0873.m55680("ۗ᩵")) * (-89);
                                            i33 = ((iM55688 ^ i31) * 18519) ^ 2129389200;
                                            i34 = 1574620851;
                                        } else {
                                            iM55688 = (i31 - C0873.m55680("᩵ܶ")) * (-5);
                                            i33 = ((iM55688 ^ i32) * 32689) ^ (-292804848);
                                            i34 = 830945452;
                                        }
                                        break;
                                    case -1710117043:
                                    case 53253559:
                                        if (C0854.m55595() >= 0) {
                                            iM55688 = (i32 - C0873.m55680("ۡ֡")) * 7;
                                            i33 = ((iM55688 ^ i31) * 7465) ^ 1504480038;
                                            i34 = -404731191;
                                        } else {
                                            iM55688 = C0946.m55979("᩹᩹") ^ i32;
                                            i33 = ((iM55688 ^ i31) * (-19363)) ^ 539219524;
                                            i34 = 239568583;
                                        }
                                        break;
                                    case -1657748477:
                                    case 2056181292:
                                        C1071.m56343();
                                        C0854.m55595();
                                        iM55688 = C0873.m55680("ۙܶ") ^ i31;
                                        i33 = ((iM55688 ^ i32) * 14215) ^ (-841742393);
                                        i34 = -1297308216;
                                        break;
                                    case -1520196958:
                                    case -981709958:
                                        if (C1044.f81959 >= 0) {
                                            iM55688 = (i32 - C0873.m55680("ۗ᩵")) * (-89);
                                            i33 = ((iM55688 ^ i31) * 18519) ^ 2129389200;
                                            i34 = 1574620851;
                                        } else {
                                            iM55688 = (i31 - C0873.m55680("᩶ۛ")) * 55;
                                            i33 = ((iM55688 ^ i32) * 3029) ^ (-1632970746);
                                            i34 = 3981575;
                                        }
                                        break;
                                    case -979554962:
                                    case 1934217893:
                                        if (C1017.f81942 >= 0) {
                                            iM55688 = (C0946.m55979("ۜ᩹") + i31) * (-11);
                                            i33 = ((iM55688 ^ i32) * (-26815)) ^ (-1268724990);
                                            i34 = 410906977;
                                        } else {
                                            iM55688 = C0946.m55979("᩺᩵") ^ i32;
                                            i33 = ((iM55688 ^ i31) * 32085) ^ 154096688;
                                            i34 = 935125432;
                                        }
                                        break;
                                    case -829436644:
                                    case 1425286817:
                                        if (C1194.f82045 != 0) {
                                            iM55688 = C0946.m55979("᩺ۚ") ^ i31;
                                            i33 = ((iM55688 ^ i32) * 6341) ^ 1128664525;
                                            i34 = 1945958068;
                                        } else {
                                            iM55688 = (C0946.m55979("ۛۧ") + i31) * 51;
                                            i33 = ((iM55688 ^ i32) * DilithiumEngine.DilithiumRootOfUnity) ^ (-1803334530);
                                            i34 = -2059029732;
                                        }
                                        break;
                                    case -587760833:
                                    case 902252851:
                                        ServiceConnectionC1013.m56157();
                                        if (C0927.m55873() <= 0) {
                                            iM55688 = (C0946.m55979("ۜ᩹") + i31) * (-11);
                                            i33 = ((iM55688 ^ i32) * (-26815)) ^ (-1268724990);
                                            i34 = 410906977;
                                        } else {
                                            iM55688 = (i32 - C0873.m55680("ۡ֡")) * 7;
                                            i33 = ((iM55688 ^ i31) * 7465) ^ 1504480038;
                                            i34 = -404731191;
                                        }
                                        break;
                                    case -586962255:
                                    case 1851642430:
                                        if (C0906.f81862 >= 0) {
                                            iM55688 = (i32 - C0873.m55680("ۡ֡")) * 7;
                                            i33 = ((iM55688 ^ i31) * 7465) ^ 1504480038;
                                            i34 = -404731191;
                                        } else {
                                            iM55688 = C0873.m55680("۫᩹") ^ i31;
                                            i33 = ((iM55688 ^ i32) * (-29517)) ^ (-1784949422);
                                            i34 = 1788177323;
                                        }
                                        break;
                                    case -397489879:
                                    case 497338526:
                                        C1194.m56396();
                                        C1194.m56396();
                                        throw new RuntimeException();
                                    case 267599138:
                                    case 940404636:
                                        if (C1964.f83032 <= 0) {
                                            iM55688 = C0873.m55680("ۙܶ") ^ i31;
                                            i33 = ((iM55688 ^ i32) * 14215) ^ (-841742393);
                                            i34 = -1297308216;
                                        } else {
                                            iM55688 = (C0873.m55680("۫ۡ") ^ i31) * (-125);
                                            i33 = ((iM55688 ^ i32) * 3935) ^ 1414475679;
                                            i34 = -1450822739;
                                        }
                                        break;
                                    case 485022547:
                                    case 885307651:
                                        return;
                                    case 533830306:
                                    case 907470536:
                                        this.f30000 = c20218;
                                        if (RunnableC0897.m55784()) {
                                            iM55688 = (i32 - C0873.m55680("ۡ֡")) * 7;
                                            i33 = ((iM55688 ^ i31) * 7465) ^ 1504480038;
                                            i34 = -404731191;
                                        } else {
                                            iM55688 = (C0873.m55680("ۖۢ") ^ i32) * 39;
                                            i33 = ((iM55688 ^ i31) * 29723) ^ 894648321;
                                            i34 = -550824668;
                                        }
                                        break;
                                    case 781092773:
                                    case 1659376777:
                                        AbstractC0942.m55971();
                                        if (C1929.f83011 == 0) {
                                            iM55688 = (i32 - C0873.m55680("ۗ᩵")) * (-89);
                                            i33 = ((iM55688 ^ i31) * 18519) ^ 2129389200;
                                            i34 = 1574620851;
                                        } else {
                                            iM55688 = (i32 - C0873.m55680("ۡ֡")) * 7;
                                            i33 = ((iM55688 ^ i31) * 7465) ^ 1504480038;
                                            i34 = -404731191;
                                        }
                                        break;
                                    default:
                                        if (C1003.m56123() != 0) {
                                            iM55688 = (i32 - C0873.m55680("ۡ֡")) * 7;
                                            i33 = ((iM55688 ^ i31) * 7465) ^ 1504480038;
                                            i34 = -404731191;
                                        } else {
                                            iM55688 = C0873.m55680("ۙܶ") ^ i31;
                                            i33 = ((iM55688 ^ i32) * 14215) ^ (-841742393);
                                            i34 = -1297308216;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i30) {
                            DialogInterfaceC2564 dialogInterfaceC2565 = null;
                            int i31 = 436837254;
                            int i32 = C1003.f81929;
                            int i33 = C0877.f81843;
                            int iM559715 = (C0946.m55979("ۤۨ") + i32) * 7;
                            int i34 = ((iM559715 ^ i33) * (-22191)) ^ 1370063761;
                            int i35 = 1747916272;
                            while (true) {
                                i31 = ((((i31 ^ i33) * 28203) >> 31) & i34) ^ (iM559715 ^ i35);
                                switch (i31) {
                                    case -2095602364:
                                    case 1114406178:
                                        if (C1012.m56134() > 0) {
                                            iM559715 = C0873.m55680("۫᩵") ^ i33;
                                            i34 = ((iM559715 ^ i32) * (-20593)) ^ (-227916227);
                                            i35 = 11523142;
                                        } else {
                                            iM559715 = (i32 - C0946.m55979("ۧ᩺")) * (-43);
                                            i34 = ((iM559715 ^ i33) * 25035) ^ (-1327750917);
                                            i35 = -1534348359;
                                        }
                                        break;
                                    case -2030437932:
                                    case -1749859207:
                                        if (C0892.f81851) {
                                            iM559715 = C0873.m55680("۫ܳ") ^ i33;
                                            i34 = ((iM559715 ^ i32) * (-18179)) ^ 1680093804;
                                            i35 = -838045575;
                                        } else {
                                            iM559715 = C0873.m55680("ۤ᩶") ^ i33;
                                            i34 = ((iM559715 ^ i32) * 5757) ^ 192032301;
                                            i35 = -870082771;
                                        }
                                        break;
                                    case -1897906511:
                                    case -1736241315:
                                        if (C1053.f81965 <= 0) {
                                            iM559715 = (i32 - C0946.m55979("ۧ᩺")) * (-43);
                                            i34 = ((iM559715 ^ i33) * 25035) ^ (-1327750917);
                                            i35 = -1534348359;
                                        } else {
                                            iM559715 = C0873.m55680("᩵۟") ^ i32;
                                            i34 = ((iM559715 ^ i33) * (-28725)) ^ (-853994939);
                                            i35 = 1726691257;
                                        }
                                        break;
                                    case -1861150269:
                                    case -1685996476:
                                        C1024.m56208(dialogInterfaceC2565);
                                        if (ViewOnClickListenerC0939.m55941() < 0) {
                                            C20218 c20219 = this.f30000;
                                            C15556 c15557 = c15556;
                                            Main main2 = main;
                                            if (!C0927.f81875) {
                                                C11896.m27214(new C16592(c20219, c15557, main2), main2, str);
                                            }
                                            iM559715 = C0946.m55979("᩵ۘ") ^ i33;
                                            i34 = ((iM559715 ^ i32) * 14597) ^ (-1291233762);
                                            i35 = -1672493570;
                                        } else {
                                            iM559715 = C0873.m55680("ۤ᩶") ^ i33;
                                            i34 = ((iM559715 ^ i32) * 5757) ^ 192032301;
                                            i35 = -870082771;
                                        }
                                        break;
                                    case -1857209760:
                                    case -159094025:
                                        C0892.m55749();
                                        if (C1028.f81950 > 0) {
                                            iM559715 = C0873.m55680("᩵۟") ^ i32;
                                            i34 = ((iM559715 ^ i33) * (-28725)) ^ (-853994939);
                                            i35 = 1726691257;
                                        } else {
                                            iM559715 = C0946.m55979("᩵ۘ") ^ i33;
                                            i34 = ((iM559715 ^ i32) * 14597) ^ (-1291233762);
                                            i35 = -1672493570;
                                        }
                                        break;
                                    case -1720162428:
                                    case 602717740:
                                        if (C0946.f81894 != 0) {
                                            iM559715 = C0873.m55680("ۤ᩶") ^ i33;
                                            i34 = ((iM559715 ^ i32) * 5757) ^ 192032301;
                                            i35 = -870082771;
                                        } else {
                                            iM559715 = C0946.m55979("ܳܿ") ^ i32;
                                            i34 = ((iM559715 ^ i33) * 4243) ^ 811324100;
                                            i35 = 2039877707;
                                        }
                                        break;
                                    case -1385005302:
                                    case -576131442:
                                        if (C0854.f81826 != 0) {
                                            iM559715 = C0946.m55979("᩵ۘ") ^ i33;
                                            i34 = ((iM559715 ^ i32) * 14597) ^ (-1291233762);
                                            i35 = -1672493570;
                                        } else {
                                            iM559715 = C0946.m55979("۫֫") ^ i32;
                                            i34 = ((iM559715 ^ i33) * (-30189)) ^ (-1973932062);
                                            i35 = -1245003727;
                                        }
                                        break;
                                    case -711594692:
                                    case 510487853:
                                        if (C0992.f81922 >= 0) {
                                            iM559715 = C0873.m55680("۫᩵") ^ i33;
                                            i34 = ((iM559715 ^ i32) * (-20593)) ^ (-227916227);
                                            i35 = 11523142;
                                        } else {
                                            iM559715 = (C0946.m55979("ۘܽ") ^ i32) * (-125);
                                            i34 = ((iM559715 ^ i33) * (-1561)) ^ (-836516437);
                                            i35 = 717256257;
                                        }
                                        break;
                                    case -467920976:
                                    case 302245088:
                                        C0882.m55710();
                                        break;
                                    case -347941789:
                                    case 193622100:
                                        if (AbstractC0942.f81890 <= 0) {
                                            iM559715 = C0946.m55979("᩵ۘ") ^ i33;
                                            i34 = ((iM559715 ^ i32) * 14597) ^ (-1291233762);
                                            i35 = -1672493570;
                                        } else {
                                            iM559715 = C0873.m55680("ܿ֡") ^ i33;
                                            i34 = ((iM559715 ^ i32) * (-7611)) ^ (-930918206);
                                            i35 = -1876782734;
                                        }
                                        break;
                                    case -245215031:
                                    case 1078179788:
                                        dialogInterfaceC2565 = dialogInterfaceC2564;
                                        if (C0882.f81846) {
                                            iM559715 = C0946.m55979("᩵ۘ") ^ i33;
                                            i34 = ((iM559715 ^ i32) * 14597) ^ (-1291233762);
                                            i35 = -1672493570;
                                        } else {
                                            iM559715 = (i32 - C0946.m55979("ܽۗ")) * (-75);
                                            i34 = ((iM559715 ^ i33) * (-2095)) ^ (-517550836);
                                            i35 = 2100784066;
                                        }
                                        break;
                                    case 7042278:
                                    case 1131251867:
                                        if (C0955.f81898) {
                                            iM559715 = C0873.m55680("ۤ᩶") ^ i33;
                                            i34 = ((iM559715 ^ i32) * 5757) ^ 192032301;
                                            i35 = -870082771;
                                        } else {
                                            iM559715 = (i33 - C0873.m55680("֡᩻")) * 19;
                                            i34 = ((iM559715 ^ i32) * (-26229)) ^ 1458608991;
                                            i35 = 1383656215;
                                        }
                                        break;
                                    case 638957264:
                                    case 1542434383:
                                        if (C0845.f81821 >= 0) {
                                            iM559715 = C0946.m55979("᩵ۘ") ^ i33;
                                            i34 = ((iM559715 ^ i32) * 14597) ^ (-1291233762);
                                            i35 = -1672493570;
                                        } else {
                                            iM559715 = C0873.m55680("ܳۘ") ^ i33;
                                            i34 = ((iM559715 ^ i32) * (-16693)) ^ (-1742266137);
                                            i35 = -2050651060;
                                        }
                                        break;
                                    default:
                                        RunnableC0938.m55938();
                                        iM559715 = C0946.m55979("᩵ۘ") ^ i33;
                                        i34 = ((iM559715 ^ i32) * 14597) ^ (-1291233762);
                                        i35 = -1672493570;
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr3 = f82318;
                    if (!C0892.f81851) {
                        int iM559715 = C0946.m55979("ܳۡ") ^ i8;
                        i10 = iM559715 ^ (-615891026);
                        i9 = ((iM559715 ^ i7) * 2355) ^ 2124106081;
                        c20671M55888 = c20671M55888;
                    } else {
                        int iM559716 = (i7 - C0946.m55979("ܺܽ")) * (-79);
                        iM55683 = iM55683;
                        i3 = ((iM559716 ^ i8) * 17651) ^ (-2141652909);
                        i10 = iM559716 ^ 1867329000;
                        i9 = i3;
                        iM55683 = iM55683;
                    }
                    break;
                case 1523974109:
                case 1950510987:
                    C1024.m56209();
                    if (C1048.m56305() < 0) {
                        iM55683 = iM55683;
                        onClickListener3 = onClickListener3;
                        iM55681 = (i7 - C0946.m55979("᩵ᩳ")) * (-89);
                        i3 = ((iM55681 ^ i8) * (-20873)) ^ 1083257765;
                        i4 = -408116006;
                        int i213 = iM55681 ^ i4;
                        onClickListener3 = onClickListener3;
                        i10 = i213;
                        i9 = i3;
                        iM55683 = iM55683;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۛ") + i8) * 97;
                        onClickListener = onClickListener3;
                        i = ((iM55680 ^ i7) * (-7339)) ^ 688488788;
                        i2 = 1293644259;
                        DialogInterface.OnClickListener onClickListener8 = onClickListener;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                        onClickListener3 = onClickListener8;
                    }
                    break;
                case 1830682767:
                case 1872503859:
                    iM55683 = iM55683;
                    onClickListener3 = onClickListener3;
                    short s3 = s2;
                    if (C1229.f82066 >= 0) {
                        s2 = s3;
                        onClickListener3 = onClickListener3;
                        iM55683 = iM55683;
                        int iM559717 = C0946.m55979("ܳۡ") ^ i8;
                        i10 = iM559717 ^ (-615891026);
                        i9 = ((iM559717 ^ i7) * 2355) ^ 2124106081;
                    } else {
                        int iM55688 = C0873.m55680("ۗۡ") ^ i7;
                        s2 = s3;
                        i9 = ((iM55688 ^ i8) * 10617) ^ (-761913856);
                        onClickListener3 = onClickListener3;
                        iM55683 = iM55683;
                        i10 = iM55688 ^ 520666794;
                    }
                    c20671M55888 = c20671M55888;
                    break;
                default:
                    C1929.m56553();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x02e4 A[PHI: r2 r3 r16 r17 r21 r23
      0x02e4: PHI (r2v4 l.֨۠ۢ) = (r2v3 l.֨۠ۢ), (r2v2 l.֨۠ۢ), (r2v2 l.֨۠ۢ) binds: [B:52:0x021f, B:16:0x007c, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r3v4 java.util.HashSet) = (r3v3 java.util.HashSet), (r3v2 java.util.HashSet), (r3v2 java.util.HashSet) binds: [B:52:0x021f, B:16:0x007c, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r16v3 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v7 short[]) binds: [B:52:0x021f, B:16:0x007c, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r17v3 char) = (r17v2 char), (r17v2 char), (r17v7 char) binds: [B:52:0x021f, B:16:0x007c, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r21v25 short[]) = (r21v10 short[]), (r21v22 short[]), (r21v29 short[]) binds: [B:52:0x021f, B:16:0x007c, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r23v28 l.ܶ᩵ܿ) = (r23v8 l.ܶ᩵ܿ), (r23v25 l.ܶ᩵ܿ), (r23v30 l.ܶ᩵ܿ) binds: [B:52:0x021f, B:16:0x007c, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0318 A[PHI: r4 r5 r9 r14 r15 r21 r23
      0x0318: PHI (r4v4 java.lang.Object[]) = (r4v2 java.lang.Object[]), (r4v2 java.lang.Object[]), (r4v3 java.lang.Object[]), (r4v2 java.lang.Object[]) binds: [B:11:0x006b, B:69:0x0316, B:48:0x01ef, B:44:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r5v3 java.lang.String[]) = (r5v2 java.lang.String[]), (r5v2 java.lang.String[]), (r5v2 java.lang.String[]), (r5v5 java.lang.String[]) binds: [B:11:0x006b, B:69:0x0316, B:48:0x01ef, B:44:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:11:0x006b, B:69:0x0316, B:48:0x01ef, B:44:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v4 short[]) binds: [B:11:0x006b, B:69:0x0316, B:48:0x01ef, B:44:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:11:0x006b, B:69:0x0316, B:48:0x01ef, B:44:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r21v12 short[]) = (r21v3 short[]), (r21v4 short[]), (r21v11 short[]), (r21v13 short[]) binds: [B:11:0x006b, B:69:0x0316, B:48:0x01ef, B:44:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r23v10 l.ܶ᩵ܿ) = (r23v1 l.ܶ᩵ܿ), (r23v2 l.ܶ᩵ܿ), (r23v9 l.ܶ᩵ܿ), (r23v11 l.ܶ᩵ܿ) binds: [B:11:0x006b, B:69:0x0316, B:48:0x01ef, B:44:0x01c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m45707(C20218 c20218, C15556 c15556, Main main, C13457 c13457, boolean z) {
        int iM55680;
        int i;
        short[] sArr;
        int i2;
        C20218 c20219 = c20218;
        int i3 = AbstractC0942.f81890;
        int i4 = C1025.f81947;
        int iM55681 = C0873.m55680("۫᩹") ^ i4;
        int i5 = ((iM55681 ^ i3) * 7173) ^ 431996311;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM55681 ^ 1745059671;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        char c = 0;
        int i10 = -91701801;
        int i11 = 0;
        short[] sArr4 = null;
        String strM55750 = null;
        String strM56297 = null;
        AbstractC17043 abstractC17043 = null;
        String[] strArr = null;
        Object[] array = null;
        HashSet hashSetM35388 = null;
        C3313 c3313 = null;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i3) * 25319) >> 31));
            switch (i10) {
                case -2022493580:
                case -1669540108:
                    C1036.m56257();
                    C0967.m56074();
                    int iM55682 = C0873.m55680("ۗۤ") ^ i4;
                    i6 = iM55682 ^ 1024982066;
                    i5 = ((iM55682 ^ i3) * 24523) ^ 652836302;
                    break;
                case -1946005892:
                case 1357369062:
                    abstractC17043 = abstractC17043;
                    sArr3 = sArr3;
                    s = sArr4[c];
                    i11 = (s * s) + 7645225;
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0873.m55680("ۛۤ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 24617) ^ 169908895;
                        i = -891911650;
                    } else {
                        iM55680 = C0873.m55680("ۚ᩵") ^ i3;
                        i5 = ((iM55680 ^ i4) * 24333) ^ 2113762077;
                        i = 1279355428;
                    }
                    i2 = iM55680 ^ i;
                    sArr3 = sArr3;
                    abstractC17043 = abstractC17043;
                    i6 = i2;
                    c20219 = c20218;
                    break;
                case -1837033588:
                case -1200999054:
                    C0866.m55645();
                    if (C1044.f81959 < 0) {
                        abstractC17043 = abstractC17043;
                        sArr3 = sArr3;
                        iM55680 = C0873.m55680("ۛۤ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 24617) ^ 169908895;
                        i = -891911650;
                        i2 = iM55680 ^ i;
                        sArr3 = sArr3;
                        abstractC17043 = abstractC17043;
                        i6 = i2;
                        c20219 = c20218;
                    } else {
                        int iM55683 = C0873.m55680("ۗۤ") ^ i4;
                        i6 = iM55683 ^ 1024982066;
                        i5 = ((iM55683 ^ i3) * 24523) ^ 652836302;
                    }
                    break;
                case -1669050796:
                case -1367258301:
                    abstractC17043 = abstractC17043;
                    sArr3 = sArr3;
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("ᩴ֨") ^ i4;
                        i5 = ((iM55680 ^ i3) * 20373) ^ 1150228176;
                        i = -903074301;
                    } else {
                        iM55680 = (C0873.m55680("᩺ܽ") + i4) * (-103);
                        i5 = ((iM55680 ^ i3) * 11463) ^ 1648499480;
                        i = -976251150;
                    }
                    i2 = iM55680 ^ i;
                    sArr3 = sArr3;
                    abstractC17043 = abstractC17043;
                    i6 = i2;
                    c20219 = c20218;
                    break;
                case -1383326592:
                case 654682329:
                    sArr = sArr3;
                    strM56297 = C1046.m56297(abstractC17043);
                    AbstractC17043 abstractC17044 = abstractC17043;
                    strM55750 = C0892.m55750(f82318, 44, 4, i8);
                    if (C1124.m56367() >= 0) {
                        abstractC17043 = abstractC17044;
                        int iM55684 = C0873.m55680("ۤᩳ") ^ i3;
                        sArr3 = sArr;
                        i6 = iM55684 ^ 490408228;
                        i5 = ((iM55684 ^ i4) * 8773) ^ (-1922682813);
                        c20219 = c20218;
                    } else {
                        int iM55685 = C0873.m55680("ᩴۛ") ^ i4;
                        sArr3 = sArr;
                        i6 = iM55685 ^ (-1076161473);
                        i5 = ((iM55685 ^ i3) * (-10939)) ^ 1160742475;
                        abstractC17043 = abstractC17044;
                    }
                    break;
                case -1381698511:
                case -497845394:
                    abstractC17043 = abstractC17043;
                    sArr3 = sArr3;
                    strArr = (String[]) array;
                    sArr2 = f82318;
                    i9 = 39;
                    i7 = 5;
                    if (AbstractC0942.m55971()) {
                        iM55680 = C0873.m55680("ᩴ֨") ^ i4;
                        i5 = ((iM55680 ^ i3) * 20373) ^ 1150228176;
                        i = -903074301;
                    } else {
                        iM55680 = C0946.m55979("ܶ֨") ^ i4;
                        i5 = ((iM55680 ^ i3) * 25615) ^ (-194455221);
                        i = 701333628;
                    }
                    i2 = iM55680 ^ i;
                    sArr3 = sArr3;
                    abstractC17043 = abstractC17043;
                    i6 = i2;
                    c20219 = c20218;
                    break;
                case -969947288:
                case 1051252314:
                    if (C0906.f81862 >= 0) {
                        abstractC17043 = abstractC17043;
                        sArr3 = sArr3;
                        iM55680 = C0946.m55979("ܶ᩻") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-21439)) ^ 76321237;
                        i = 1290604186;
                        i2 = iM55680 ^ i;
                        sArr3 = sArr3;
                        abstractC17043 = abstractC17043;
                        i6 = i2;
                        c20219 = c20218;
                    } else {
                        int iM55686 = C0873.m55680("ۗۤ") ^ i4;
                        i6 = iM55686 ^ 1024982066;
                        i5 = ((iM55686 ^ i3) * 24523) ^ 652836302;
                    }
                    break;
                case -913250510:
                case 1798896157:
                    C1036.m56257();
                    break;
                case -845137450:
                case 591700944:
                    i8 = 48940;
                    iM55680 = (i3 - C0946.m55979("֫ܶ")) * (-3);
                    i5 = ((iM55680 ^ i4) * (-919)) ^ (-1403364185);
                    i = -634688028;
                    i2 = iM55680 ^ i;
                    sArr3 = sArr3;
                    abstractC17043 = abstractC17043;
                    i6 = i2;
                    c20219 = c20218;
                    break;
                case -582310749:
                case 2126415756:
                    sArr = sArr3;
                    c3313.m5780(RunnableC0938.m55936(sArr2, i9, i7, i8), strArr);
                    abstractC17043 = c20219.f62512;
                    if (C1053.f81965 <= 0) {
                        int iM55687 = C0873.m55680("ۤᩳ") ^ i3;
                        sArr3 = sArr;
                        i6 = iM55687 ^ 490408228;
                        i5 = ((iM55687 ^ i4) * 8773) ^ (-1922682813);
                    } else {
                        int iM55688 = C0873.m55680("֡ۘ") ^ i3;
                        i5 = ((iM55688 ^ i4) * (-23359)) ^ 887643552;
                        i2 = iM55688 ^ 1907331597;
                        sArr3 = sArr;
                        i6 = i2;
                    }
                    c20219 = c20218;
                    break;
                case -427684717:
                case 1264578357:
                    C0894.m55764(c3313, strM55750, strM56297);
                    c3313.m5775(main, c13457);
                    sArr3 = f82318;
                    if (C0898.m55800() <= 0) {
                        abstractC17043 = abstractC17043;
                        iM55680 = C0873.m55680("ۛۤ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 24617) ^ 169908895;
                        i = -891911650;
                        i2 = iM55680 ^ i;
                        sArr3 = sArr3;
                        abstractC17043 = abstractC17043;
                        i6 = i2;
                        c20219 = c20218;
                    } else {
                        int iM55979 = (C0946.m55979("ܺۜ") + i3) * (-11);
                        i5 = ((iM55979 ^ i4) * 19593) ^ (-1688620197);
                        sArr3 = sArr3;
                        i6 = iM55979 ^ 64531102;
                    }
                    break;
                case -309701338:
                case 640228316:
                    abstractC17043 = abstractC17043;
                    sArr3 = sArr3;
                    int i12 = C16723.f49313;
                    c3313 = new C3313(C6136.class);
                    hashSetM35388 = c15556.m35388();
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0946.m55979("ܶ᩻") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-21439)) ^ 76321237;
                        i = 1290604186;
                    } else {
                        iM55680 = (C0946.m55979("ۨ۫") + i4) * 65;
                        i5 = ((iM55680 ^ i3) * 5001) ^ 1721605499;
                        i = 796100618;
                    }
                    i2 = iM55680 ^ i;
                    sArr3 = sArr3;
                    abstractC17043 = abstractC17043;
                    i6 = i2;
                    c20219 = c20218;
                    break;
                case -13814361:
                case 1778446906:
                    i8 = 60763;
                    iM55680 = (i3 - C0946.m55979("֫ܶ")) * (-3);
                    i5 = ((iM55680 ^ i4) * (-919)) ^ (-1403364185);
                    i = -634688028;
                    i2 = iM55680 ^ i;
                    sArr3 = sArr3;
                    abstractC17043 = abstractC17043;
                    i6 = i2;
                    c20219 = c20218;
                    break;
                case 258634958:
                case 1267824296:
                    if (C0845.f81821 >= 0) {
                        abstractC17043 = abstractC17043;
                        sArr3 = sArr3;
                        iM55680 = C0873.m55680("ᩴ֨") ^ i4;
                        i5 = ((iM55680 ^ i3) * 20373) ^ 1150228176;
                        i = -903074301;
                        i2 = iM55680 ^ i;
                        sArr3 = sArr3;
                        abstractC17043 = abstractC17043;
                        i6 = i2;
                        c20219 = c20218;
                    } else {
                        int iM55689 = C0873.m55680("ۗۤ") ^ i4;
                        i6 = iM55689 ^ 1024982066;
                        i5 = ((iM55689 ^ i3) * 24523) ^ 652836302;
                    }
                    break;
                case 325946378:
                case 969134842:
                    abstractC17043 = abstractC17043;
                    sArr3 = sArr3;
                    array = hashSetM35388.toArray(new String[0]);
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0873.m55680("ᩴ֨") ^ i4;
                        i5 = ((iM55680 ^ i3) * 20373) ^ 1150228176;
                        i = -903074301;
                    } else {
                        iM55680 = C0873.m55680("ܰ۟") ^ i3;
                        i5 = ((iM55680 ^ i4) * 24709) ^ 768939034;
                        i = -1258745534;
                    }
                    i2 = iM55680 ^ i;
                    sArr3 = sArr3;
                    abstractC17043 = abstractC17043;
                    i6 = i2;
                    c20219 = c20218;
                    break;
                case 451611516:
                case 1306668112:
                    abstractC17043 = abstractC17043;
                    sArr3 = sArr3;
                    if ((s * 5530) - i11 <= 0) {
                        iM55680 = C0946.m55979("᩵۬") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-29179)) ^ (-273305920);
                        i = 195678045;
                    } else {
                        iM55680 = C0946.m55979("֨ܰ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-30177)) ^ (-1674344996);
                        i = -675031883;
                    }
                    i2 = iM55680 ^ i;
                    sArr3 = sArr3;
                    abstractC17043 = abstractC17043;
                    i6 = i2;
                    c20219 = c20218;
                    break;
                case 470026618:
                case 1439639598:
                    c3313.m5783(c20219.f62514);
                    c3313.m5772();
                    break;
                case 1165574967:
                case 1954499592:
                    C1036.m56263(c3313, C0882.m55717(sArr3, 48, 15, i8), z);
                    if (C0917.f81868) {
                        abstractC17043 = abstractC17043;
                        sArr3 = sArr3;
                        iM55680 = C0946.m55979("ܶ᩻") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-21439)) ^ 76321237;
                        i = 1290604186;
                        i2 = iM55680 ^ i;
                        sArr3 = sArr3;
                        abstractC17043 = abstractC17043;
                        i6 = i2;
                        c20219 = c20218;
                    } else {
                        int iM559710 = C0946.m55979("᩹ᩴ") ^ i3;
                        i6 = iM559710 ^ 57075894;
                        i5 = ((iM559710 ^ i4) * (-22291)) ^ 500957189;
                        sArr3 = sArr3;
                    }
                    break;
                default:
                    abstractC17043 = abstractC17043;
                    sArr3 = sArr3;
                    sArr4 = f82318;
                    c = '&';
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("ܶ᩻") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-21439)) ^ 76321237;
                        i = 1290604186;
                    } else {
                        iM55680 = C0946.m55979("ۜᩳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-7767)) ^ 1433694587;
                        i = -626512152;
                    }
                    i2 = iM55680 ^ i;
                    sArr3 = sArr3;
                    abstractC17043 = abstractC17043;
                    i6 = i2;
                    c20219 = c20218;
                    break;
            }
            return;
        }
    }
}
