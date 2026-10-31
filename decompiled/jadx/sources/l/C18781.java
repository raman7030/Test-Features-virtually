package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* JADX INFO: renamed from: l.ᩴ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAGX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18781 {

    /* JADX INFO: renamed from: ֨᩷ܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f59290 = {1356, 10596, 3340, -15199, 10177, -9380, -13305, -8776, 16064, 1944, 15350, 12563, -9408, 1130, 18053, 20381, 21775, 17123, -24262, 22830, 29262, -22151, 19222, 23947, 27434, -17846, 15384, 15386, -16914, 22428, -23363, 19684, -20274, -16602, 22442, 25063, 24589, 15371, 2438, -4821, -4806, -4817, -4813, -4824, -4803, -4814, -4809, -4802, -4816, -4802, -4802, -4821, -4838, -4821, -4816, -4856, -4814, -4804, -4839, -4809, -4812, -4808, -4816};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f59291;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59292;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16560 f59293;

    public C18781(AbstractC15440 abstractC15440, C16560 c16560, String str) {
        ArrayList arrayList = null;
        int i = 1669448887;
        int i2 = C5695.f17556;
        int i3 = C3245.f10203;
        int iM6981 = (C2105.m6981("ۘۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i4 = ((iM6981 ^ i3) * 16691) ^ 2071855177;
        int i5 = 272633075;
        while (true) {
            i = ((((i ^ i3) * (-19375)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1891405270:
                case -1790230353:
                    if (C0050.f910 >= 0) {
                        iM6981 = C0630.m2566("᩵۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 13939) ^ 706261226;
                        i5 = 1982548533;
                    } else {
                        iM6981 = C2105.m6981("ۧ۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22865)) ^ (-463488591);
                        i5 = 552977198;
                    }
                    break;
                case -1647914430:
                case -259080067:
                    C3432.m10477();
                    iM6981 = C0630.m2566("᩵۬") ^ i3;
                    i4 = ((iM6981 ^ i2) * 13939) ^ 706261226;
                    i5 = 1982548533;
                    break;
                case -1600055809:
                case -514730034:
                    this.f59291 = abstractC15440;
                    if (C0964.m3413()) {
                        C0964.m3402(new C15957(this, c16560, abstractC15440, str));
                        return;
                    }
                    iM6981 = C0630.m2566("᩵۬") ^ i3;
                    i4 = ((iM6981 ^ i2) * 13939) ^ 706261226;
                    i5 = 1982548533;
                    break;
                case -1411019713:
                case 1743347247:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-20929)) ^ 1652021724;
                        i5 = 1966572303;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۫᩵")) * 37;
                        i4 = ((iM6981 ^ i3) * (-28249)) ^ (-375046469);
                        i5 = 990555032;
                    }
                    break;
                case -1040991523:
                case 1943957849:
                    this.f59292 = arrayList;
                    if (C1047.f3863 >= 0) {
                        iM6981 = C2105.m6981("᩵ܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 5707) ^ 841229890;
                        i5 = 498785090;
                    } else {
                        iM6981 = C0630.m2566("ۤ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-20291)) ^ (-1584485627);
                        i5 = 1416474892;
                    }
                    break;
                case -862400150:
                case 415696483:
                    C1047.m3599();
                    if (C7811.f24123 < 0) {
                        iM6981 = C0630.m2566("֫ۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-13651)) ^ (-238232944);
                        i5 = -1954259094;
                    } else {
                        iM6981 = C0630.m2566("᩵۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 13939) ^ 706261226;
                        i5 = 1982548533;
                    }
                    break;
                case -686600785:
                case -180196628:
                    if (C2105.f7037 != 0) {
                        iM6981 = C0630.m2566("֫ۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-13651)) ^ (-238232944);
                        i5 = -1954259094;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۙۚ")) * (-27);
                        i4 = ((iM6981 ^ i2) * (-8923)) ^ 1362296097;
                        i5 = -771114071;
                    }
                    break;
                case -428195014:
                case 1464731367:
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("᩵ܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 5707) ^ 841229890;
                        i5 = 498785090;
                    } else {
                        iM6981 = C0630.m2566("᩵۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 13939) ^ 706261226;
                        i5 = 1982548533;
                    }
                    break;
                case -271063894:
                case 1723058604:
                    if (C1773.f6144 > 0) {
                        iM6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-20929)) ^ 1652021724;
                        i5 = 1966572303;
                    } else {
                        iM6981 = C2105.m6981("᩵ܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 5707) ^ 841229890;
                        i5 = 498785090;
                    }
                    break;
                case 362152792:
                case 1414605130:
                    C1047.m3599();
                    C4075.m12263();
                    throw new RuntimeException();
                case 791686937:
                case 981467333:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C0630.m2566("֫ۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-13651)) ^ (-238232944);
                        i5 = -1954259094;
                    } else {
                        iM6981 = C0630.m2566("᩶᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22751) ^ 1031277542;
                        i5 = -684164032;
                    }
                    break;
                case 908445776:
                case 1490620264:
                    arrayList = new ArrayList();
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-20929)) ^ 1652021724;
                        i5 = 1966572303;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ܶۗ")) * (-55);
                        i4 = ((iM6981 ^ i3) * 28661) ^ (-1748422790);
                        i5 = 869895395;
                    }
                    break;
                case 975821576:
                case 1210159491:
                    if (C1773.m5908() <= 0) {
                        iM6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-20929)) ^ 1652021724;
                        i5 = 1966572303;
                    } else {
                        iM6981 = C2105.m6981("ۤۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-17721)) ^ 1763247209;
                        i5 = 1167121095;
                    }
                    break;
                case 1442251826:
                case 1981028722:
                    this.f59293 = c16560;
                    if (C0964.m3413()) {
                        iM6981 = C2105.m6981("ۛۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 24975) ^ (-651918560);
                        i5 = 1301737160;
                    } else {
                        iM6981 = C2105.m6981("᩵ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13475)) ^ (-2031980759);
                        i5 = -287127651;
                    }
                    break;
                default:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("֫ۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-13651)) ^ (-238232944);
                        i5 = -1954259094;
                    } else {
                        iM6981 = C2105.m6981("ܳܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22913) ^ (-1180466473);
                        i5 = -685892292;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43438(final C18781 c18781, final String str) {
        short[] sArr;
        int i;
        int iM2566;
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
        int iM6981;
        int i9;
        int i10;
        int i11;
        int iM6982;
        int i12;
        int i13;
        int iM6983;
        int i14;
        int i15;
        int iM6984;
        int i16;
        int i17;
        DialogInterfaceC0206 dialogInterfaceC0206M19253 = null;
        int i18 = -2062211178;
        int i19 = C1420.f5096;
        int i20 = C2167.f7158;
        int iM2567 = C0630.m2566("᩶ܽ") ^ i20;
        int i21 = ((iM2567 ^ i19) * (-16833)) ^ 1479903149;
        int i22 = iM2567 ^ (-55607014);
        C14336 c14336M34211 = null;
        Iterator itM3596 = null;
        StringBuilder sb = null;
        String strM2575 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i23 = 0;
        int i24 = 0;
        C13876 c13876 = null;
        int iM6985 = 0;
        int i25 = 0;
        int iM2568 = 0;
        int iM6986 = 0;
        int i26 = 0;
        int i27 = 0;
        short s = 0;
        int iM6987 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        TextView textView = null;
        C19258 c19258M5912 = null;
        String strM11225 = null;
        HashSet hashSet = null;
        String str2 = null;
        int iM2569 = 0;
        C13132 c13132 = null;
        short[] sArr10 = null;
        View view3 = null;
        final Main mainM49336 = null;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i19) * 4435) >> 31));
            switch (i18) {
                case -2086442972:
                case 1472792896:
                    C3019.m9255();
                    i23 = i23;
                    sArr10 = sArr10;
                    view3 = view3;
                    sArr = sArr6;
                    i = i29;
                    sArr7 = sArr7;
                    i30 = i30;
                    sArr8 = sArr8;
                    i28 = i28;
                    int iM6988 = (i19 - C2105.m6981("֡۬")) * (-65);
                    int i31 = i;
                    i21 = ((iM6988 ^ i20) * (-31805)) ^ 2104474169;
                    sArr6 = sArr;
                    i28 = i28;
                    i30 = i30;
                    sArr8 = sArr8;
                    i23 = i23;
                    sArr10 = sArr10;
                    sArr7 = sArr7;
                    view3 = view3;
                    i22 = iM6988 ^ 2123947851;
                    i29 = i31;
                    break;
                case -2069335795:
                case 42110898:
                    i24 = 57922;
                    iM2566 = C2105.m6981("ܶܿ") ^ i19;
                    i2 = ((iM2566 ^ i20) * 19245) ^ 1851050991;
                    i3 = 1440921741;
                    i11 = iM2566 ^ i3;
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
                    C17159 c17159 = (C17159) RunnableC1108.m3791(itM3596);
                    sb = new StringBuilder();
                    C1420.m4905(sb, c17159.m40256());
                    sArr9 = f59290;
                    iM6984 = C2105.m6981("۟ܰ") ^ i20;
                    i16 = ((iM6984 ^ i19) * 18019) ^ (-683951548);
                    i17 = 542063269;
                    i22 = iM6984 ^ i17;
                    i21 = i16;
                    break;
                case -2004442247:
                case -500797056:
                    i5 = i23;
                    View view4 = view3;
                    TextView textView2 = textView;
                    C0630.m2570(textView2, iM2568 ^ 2120993727);
                    C4915.m14286(c13132);
                    short[] sArr11 = f59290;
                    if (C7811.f24123 < 0) {
                        textView = textView2;
                        short[] sArr12 = sArr8;
                        c13876 = new C13876(C13876.m33247(C11340.m28025(sArr11, 26, 2, i24)));
                        c14336M34211 = C14336.m34211(c18781.f59292);
                        int iM25610 = (C0630.m2566("ۧ֨") ^ i19) * (-47);
                        i23 = i5;
                        i2 = ((iM25610 ^ i20) * 8621) ^ (-1330241888);
                        i22 = iM25610 ^ (-1934645226);
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
                        main = mainM49336;
                        int iM25611 = C0630.m2566("ۛ᩷") ^ i19;
                        i7 = ((iM25611 ^ i20) * (-27589)) ^ 447068142;
                        i8 = iM25611 ^ (-680361607);
                        i28 = i28;
                        i30 = i6;
                        sArr8 = sArr3;
                        sArr10 = sArr4;
                        sArr7 = sArr5;
                        view3 = view2;
                        sArr6 = sArr6;
                        i29 = i29;
                        c13876 = null;
                        i22 = i8;
                        i23 = i5;
                        Main main2 = main;
                        s = s;
                        i21 = i7;
                        mainM49336 = main2;
                    }
                    break;
                case -1998816386:
                case -231977798:
                    i23 = i23;
                    view3 = view3;
                    if (C0483.m2123(itM3596)) {
                        iM6983 = C0630.m2566("ܽ۠") ^ i20;
                        i14 = ((iM6983 ^ i19) * 13789) ^ 1995626729;
                        i15 = -1054287468;
                    } else {
                        iM6983 = (i20 - C2105.m6981("ܳܽ")) * 83;
                        i14 = ((iM6983 ^ i19) * 8991) ^ 818154241;
                        i15 = 881965898;
                    }
                    i22 = iM6983 ^ i15;
                    view3 = view3;
                    i21 = i14;
                    i23 = i23;
                    break;
                case -1971746466:
                case 1243086576:
                    i24 = 15396;
                    iM2566 = C2105.m6981("ܶܿ") ^ i19;
                    i2 = ((iM2566 ^ i20) * 19245) ^ 1851050991;
                    i3 = 1440921741;
                    i11 = iM2566 ^ i3;
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
                    main = mainM49336;
                    sArr4 = sArr10;
                    view2 = view3;
                    sArr6 = sArr6;
                    i29 = i29;
                    sArr5 = sArr7;
                    i6 = i30;
                    sArr3 = sArr8;
                    i28 = i28;
                    s = f59290[13];
                    i26 = s * s;
                    i27 = 66683556;
                    if (C0382.m1848()) {
                        int iM25612 = C0630.m2566("ۛ᩷") ^ i19;
                        i7 = ((iM25612 ^ i20) * (-27589)) ^ 447068142;
                        i8 = iM25612 ^ (-680361607);
                        i28 = i28;
                        i30 = i6;
                        sArr8 = sArr3;
                        sArr10 = sArr4;
                        sArr7 = sArr5;
                        view3 = view2;
                        sArr6 = sArr6;
                        i29 = i29;
                        c13876 = null;
                    } else {
                        int iM25613 = (C0630.m2566("ۗܶ") ^ i19) * (-111);
                        i7 = ((iM25613 ^ i20) * 26429) ^ (-152295962);
                        i8 = iM25613 ^ (-1732345027);
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
                    mainM49336 = main3;
                    break;
                case -1887204195:
                case 1371401901:
                    i4 = i23;
                    sArr3 = sArr8;
                    sArr2 = sArr10;
                    short[] sArr13 = sArr7;
                    int i32 = i30;
                    View viewM9259 = C3019.m9259(mainM49336, iM2569 ^ i25);
                    String strM16034 = C5695.m16034(f59290, 17, 3, i24);
                    if (C4616.f14690 <= 0) {
                        i30 = i32;
                        sArr7 = sArr13;
                        str2 = strM16034;
                        view = viewM9259;
                        iM6982 = C0630.m2566("ۖᩳ") ^ i20;
                        i12 = ((iM6982 ^ i19) * 28749) ^ (-971629177);
                        i13 = -1902154949;
                        i22 = iM6982 ^ i13;
                        i23 = i4;
                        sArr10 = sArr2;
                        short[] sArr14 = sArr3;
                        view3 = view;
                        i21 = i12;
                        sArr8 = sArr14;
                    } else {
                        int iM25614 = (C0630.m2566("ܶ᩹") ^ i19) * (-67);
                        int i33 = ((iM25614 ^ i20) * 15023) ^ (-264724206);
                        i22 = iM25614 ^ (-1603329282);
                        i30 = i32;
                        i23 = i4;
                        sArr10 = sArr2;
                        sArr7 = sArr13;
                        str2 = strM16034;
                        i21 = i33;
                        sArr8 = sArr3;
                        view3 = viewM9259;
                    }
                    break;
                case -1799834607:
                case 233623301:
                    if (C7811.f24123 >= 0) {
                        iM6984 = (i20 - C0630.m2566("ۙܽ")) * 83;
                        i16 = ((iM6984 ^ i19) * 23849) ^ 1679311456;
                        i17 = 2129314893;
                        i22 = iM6984 ^ i17;
                        i21 = i16;
                    } else {
                        i4 = i23;
                        sArr2 = sArr10;
                        view = view3;
                        sArr3 = sArr8;
                        iM6982 = C0630.m2566("ۖᩳ") ^ i20;
                        i12 = ((iM6982 ^ i19) * 28749) ^ (-971629177);
                        i13 = -1902154949;
                        i22 = iM6982 ^ i13;
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
                    iM2569 = C0630.m2566(C1294.m4373(sArr, i28, i, i24));
                    i25 = 2128069204;
                    if (!C1711.f5919) {
                        i29 = i;
                        iM2566 = C0630.m2566("ۧۜ") ^ i19;
                        sArr6 = sArr;
                        i2 = ((iM2566 ^ i20) * (-1025)) ^ 755743401;
                        i3 = -867595300;
                        i11 = iM2566 ^ i3;
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
                        int iM6989 = (i19 - C2105.m6981("֡۬")) * (-65);
                        int i34 = i;
                        i21 = ((iM6989 ^ i20) * (-31805)) ^ 2104474169;
                        sArr6 = sArr;
                        i28 = i28;
                        i30 = i30;
                        sArr8 = sArr8;
                        i23 = i23;
                        sArr10 = sArr10;
                        sArr7 = sArr7;
                        view3 = view3;
                        i22 = iM6989 ^ 2123947851;
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
                    iM6987 = C2105.m6981(C4075.m12252(sArr16, i6, 3, i24)) ^ 2117266367;
                    if (C3432.f10845 < 0) {
                        int iM25615 = (C0630.m2566("᩺ܶ") ^ i20) * 87;
                        i12 = ((iM25615 ^ i19) * (-29191)) ^ 1221192275;
                        i22 = iM25615 ^ (-1636490382);
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
                        main = mainM49336;
                        int iM25616 = C0630.m2566("ۛ᩷") ^ i19;
                        i7 = ((iM25616 ^ i20) * (-27589)) ^ 447068142;
                        i8 = iM25616 ^ (-680361607);
                        i28 = i28;
                        i30 = i6;
                        sArr8 = sArr3;
                        sArr10 = sArr4;
                        sArr7 = sArr5;
                        view3 = view2;
                        sArr6 = sArr6;
                        i29 = i29;
                        c13876 = null;
                        i22 = i8;
                        i23 = i5;
                        Main main4 = main;
                        s = s;
                        i21 = i7;
                        mainM49336 = main4;
                    }
                    break;
                case -1478866234:
                case -1202905996:
                    iM6985 = C2105.m6981(strM11225) ^ 2129058849;
                    sArr10 = f59290;
                    i23 = 31;
                    iM6984 = (i20 - C2105.m6981("ᩳۡ")) * (-65);
                    i16 = ((iM6984 ^ i19) * (-1139)) ^ 1245017906;
                    i17 = 1724947868;
                    i22 = iM6984 ^ i17;
                    i21 = i16;
                    break;
                case -1232267937:
                case -115774798:
                    C1420.m4905(sb, C2167.m7159(sArr9, 37, 1, i24));
                    ServiceConnectionC3453.m10557(hashSet, C0050.m947(sb));
                    iM6983 = (i20 - C2105.m6981("᩷᩸")) * (-37);
                    i14 = ((iM6983 ^ i19) * 14557) ^ 1313200931;
                    i15 = 1691642301;
                    i22 = iM6983 ^ i15;
                    view3 = view3;
                    i21 = i14;
                    i23 = i23;
                    break;
                case -1224161996:
                case -358633974:
                    iM6986 = C2105.m6981(C2105.m6988(sArr10, i23, 3, i24));
                    if (C1773.f6144 > 0) {
                        iM6984 = (C0630.m2566("ܶᩴ") ^ i20) * (-83);
                        i16 = ((iM6984 ^ i19) * (-21887)) ^ 505284820;
                        i17 = -1129247510;
                        i22 = iM6984 ^ i17;
                        i21 = i16;
                    } else {
                        i4 = i23;
                        sArr2 = sArr10;
                        view = view3;
                        sArr3 = sArr8;
                        iM6982 = C0630.m2566("ۖᩳ") ^ i20;
                        i12 = ((iM6982 ^ i19) * 28749) ^ (-971629177);
                        i13 = -1902154949;
                        i22 = iM6982 ^ i13;
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
                    ServiceConnectionC3453.m10564();
                    break;
                case -1182201275:
                case 1112823908:
                    i4 = i23;
                    view = view3;
                    sArr3 = sArr8;
                    c13132 = (C13132) C11340.m28028(view, iM6987);
                    sArr2 = sArr10;
                    iM2568 = C0630.m2566(C2126.m7036(f59290, 23, 3, i24));
                    if (C4616.f14690 <= 0) {
                        iM6982 = C2105.m6981("ۙܺ") ^ i19;
                        i12 = ((iM6982 ^ i20) * (-26945)) ^ (-5644382);
                        i13 = 1973874974;
                    } else {
                        iM6982 = (i19 - C0630.m2566("ۚᩳ")) * 29;
                        i12 = ((iM6982 ^ i20) * 12795) ^ (-405003734);
                        i13 = 626618966;
                    }
                    i22 = iM6982 ^ i13;
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
                    Main main5 = mainM49336;
                    int i39 = s2 + 8166;
                    if ((i39 * i39) - (i38 + i38) > 0) {
                        iM6981 = C2105.m6981("ۗ۬") ^ i20;
                        i9 = ((iM6981 ^ i19) * 9255) ^ 396197742;
                        i10 = 1576937438;
                    } else {
                        iM6981 = (i20 - C2105.m6981("ۨۚ")) * 5;
                        i9 = ((iM6981 ^ i19) * 11761) ^ (-610703042);
                        i10 = 1958449908;
                    }
                    int i40 = iM6981 ^ i10;
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
                    mainM49336 = main5;
                    s = s2;
                    i23 = i23;
                    break;
                case -810307158:
                case 877053458:
                    dialogInterfaceC0206M19253 = C7187.m19253(c19258M5912, iM6985, (DialogInterface.OnClickListener) null, iM6986 ^ 2125124934, (DialogInterface.OnClickListener) null);
                    sArr8 = f59290;
                    iM6984 = (C2105.m6981("᩶᩹") + i19) * 59;
                    i16 = ((iM6984 ^ i20) * (-6553)) ^ 2127427940;
                    i17 = -1478268712;
                    i22 = iM6984 ^ i17;
                    i21 = i16;
                    break;
                case -495577211:
                case 691043844:
                    i4 = i23;
                    sArr2 = sArr10;
                    view = view3;
                    sArr3 = sArr8;
                    textView = (TextView) C11340.m28028(view, C2105.m6981(str2) ^ 2128958082);
                    sArr7 = f59290;
                    i30 = 20;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6982 = C0630.m2566("ۖᩳ") ^ i20;
                        i12 = ((iM6982 ^ i19) * 28749) ^ (-971629177);
                        i13 = -1902154949;
                    } else {
                        iM6982 = (C2105.m6981("ۜ֨") ^ i20) * (-85);
                        i12 = ((iM6982 ^ i19) * 31825) ^ (-2094174140);
                        i13 = 1210793385;
                    }
                    i22 = iM6982 ^ i13;
                    i23 = i4;
                    sArr10 = sArr2;
                    short[] sArr110 = sArr3;
                    view3 = view;
                    i21 = i12;
                    sArr8 = sArr110;
                    break;
                case 21388883:
                case 1172059924:
                    C17159 c17159M34215 = c14336M34211.m34215();
                    c13876.m33260(c17159M34215);
                    HashSet hashSet2 = new HashSet();
                    itM3596 = C1047.m3596(c17159M34215.m40251());
                    hashSet = hashSet2;
                    iM6983 = (i20 - C2105.m6981("᩷᩸")) * (-37);
                    i14 = ((iM6983 ^ i19) * 14557) ^ 1313200931;
                    i15 = 1691642301;
                    i22 = iM6983 ^ i15;
                    view3 = view3;
                    i21 = i14;
                    i23 = i23;
                    break;
                case 123775701:
                case 592398076:
                    strM2575 = C0630.m2575(sArr8, 34, 3, i24);
                    if (!C4159.f13567) {
                        i5 = i23;
                        sArr4 = sArr10;
                        s = s;
                        view2 = view3;
                        sArr6 = sArr6;
                        i29 = i29;
                        sArr5 = sArr7;
                        i6 = i30;
                        main = mainM49336;
                        sArr3 = sArr8;
                        i28 = i28;
                        int iM25617 = C0630.m2566("ۛ᩷") ^ i19;
                        i7 = ((iM25617 ^ i20) * (-27589)) ^ 447068142;
                        i8 = iM25617 ^ (-680361607);
                        i28 = i28;
                        i30 = i6;
                        sArr8 = sArr3;
                        sArr10 = sArr4;
                        sArr7 = sArr5;
                        view3 = view2;
                        sArr6 = sArr6;
                        i29 = i29;
                        c13876 = null;
                        i22 = i8;
                        i23 = i5;
                        Main main6 = main;
                        s = s;
                        i21 = i7;
                        mainM49336 = main6;
                    } else {
                        iM6984 = (C2105.m6981("ۧۛ") + i19) * (-105);
                        i16 = ((iM6984 ^ i20) * (-5427)) ^ 1942206084;
                        i17 = 1748711821;
                        i22 = iM6984 ^ i17;
                        i21 = i16;
                    }
                    break;
                case 136478923:
                case 487571785:
                    if (!C2272.m7503()) {
                        i4 = i23;
                        sArr2 = sArr10;
                        view = view3;
                        sArr3 = sArr8;
                        iM6982 = C2105.m6981("ۙܺ") ^ i19;
                        i12 = ((iM6982 ^ i20) * (-26945)) ^ (-5644382);
                        i13 = 1973874974;
                        i22 = iM6982 ^ i13;
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
                        int iM69810 = (i19 - C2105.m6981("֡۬")) * (-65);
                        int i310 = i;
                        i21 = ((iM69810 ^ i20) * (-31805)) ^ 2104474169;
                        sArr6 = sArr;
                        i28 = i28;
                        i30 = i30;
                        sArr8 = sArr8;
                        i23 = i23;
                        sArr10 = sArr10;
                        sArr7 = sArr7;
                        view3 = view3;
                        i22 = iM69810 ^ 2123947851;
                        i29 = i310;
                    }
                    break;
                case 293322783:
                case 1112867006:
                    i23 = i23;
                    c13876.m33255(hashSet);
                    c13876.m33282();
                    C1294.m4381(c13132, c13876);
                    c19258M5912 = C1773.m5912(mainM49336);
                    view3 = view3;
                    C0798.m3013(c19258M5912, view3);
                    iM6983 = (i19 - C0630.m2566("᩻᩺")) * (-43);
                    i14 = ((iM6983 ^ i20) * (-1239)) ^ 1710953743;
                    i15 = -1337455237;
                    i22 = iM6983 ^ i15;
                    view3 = view3;
                    i21 = i14;
                    i23 = i23;
                    break;
                case 371754448:
                case 1844868512:
                    i23 = i23;
                    mainM49336 = C21923.m49336(c18781.f59293);
                    sArr6 = f59290;
                    i28 = 14;
                    i29 = 3;
                    int iM69811 = (i20 - C2105.m6981("ۗܺ")) * 89;
                    i2 = ((iM69811 ^ i19) * (-383)) ^ 1867736614;
                    i11 = iM69811 ^ 278685577;
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
                    if (C3683.f11629 >= 0) {
                        i4 = i23;
                        sArr2 = sArr10;
                        view = view3;
                        sArr3 = sArr8;
                        iM6982 = C0630.m2566("ۖᩳ") ^ i20;
                        i12 = ((iM6982 ^ i19) * 28749) ^ (-971629177);
                        i13 = -1902154949;
                        i22 = iM6982 ^ i13;
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
                        int iM69812 = (i19 - C2105.m6981("֡۬")) * (-65);
                        int i311 = i;
                        i21 = ((iM69812 ^ i20) * (-31805)) ^ 2104474169;
                        sArr6 = sArr;
                        i28 = i28;
                        i30 = i30;
                        sArr8 = sArr8;
                        i23 = i23;
                        sArr10 = sArr10;
                        sArr7 = sArr7;
                        view3 = view3;
                        i22 = iM69812 ^ 2123947851;
                        i29 = i311;
                    }
                    break;
                case 1365786551:
                case 1498047701:
                    C0798.m3004(C0630.m2566(strM2575) ^ 2123202150);
                    final DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M19253;
                    final C13876 c13877 = c13876;
                    C2126.m7039(C22628.m50609(dialogInterfaceC0206M19253), new View.OnClickListener(c18781) { // from class: l.ۢ۬ܽ

                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C18781 f29151;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            Main main7 = null;
                            String str3 = null;
                            C18781 c18782 = null;
                            DialogInterfaceC0206 dialogInterfaceC0207 = null;
                            int i41 = -994217488;
                            int i42 = C3019.f9544;
                            int i43 = RunnableC3474.f10992;
                            int iM25618 = (C0630.m2566("۫᩵") + i43) * 61;
                            int i44 = ((iM25618 ^ i42) * 18357) ^ 1139314420;
                            int i45 = 417847575;
                            while (true) {
                                i41 = ((((i41 ^ i42) * 20571) >> 31) & i44) ^ (iM25618 ^ i45);
                                switch (i41) {
                                    case -1582621812:
                                    case 216278072:
                                        main7 = mainM49336;
                                        if (C1128.f4106 <= 0) {
                                            iM25618 = (i42 - C0630.m2566("ۤᩳ")) * (-67);
                                            i44 = ((iM25618 ^ i43) * 5541) ^ (-764061778);
                                            i45 = 1770607935;
                                        } else {
                                            iM25618 = (i43 - C2105.m6981("۫۬")) * (-23);
                                            i44 = ((iM25618 ^ i42) * 4955) ^ 1749104167;
                                            i45 = -1800967372;
                                        }
                                        break;
                                    case -1487142376:
                                    case 132347403:
                                        str3 = str;
                                        if (C3537.f11231 >= 0) {
                                            iM25618 = C2105.m6981("ᩳܽ") ^ i43;
                                            i44 = ((iM25618 ^ i42) * (-3735)) ^ (-1572908968);
                                            i45 = 1599773628;
                                        } else {
                                            iM25618 = C2105.m6981("ۘ᩺") ^ i42;
                                            i44 = ((iM25618 ^ i43) * 9133) ^ 840815701;
                                            i45 = -1039758514;
                                        }
                                        break;
                                    case -1466958865:
                                    case -7846509:
                                        C5695.m16023();
                                        C2126.m7040();
                                        iM25618 = (i42 - C0630.m2566("ۤᩳ")) * (-67);
                                        i44 = ((iM25618 ^ i43) * 5541) ^ (-764061778);
                                        i45 = 1770607935;
                                        break;
                                    case -1403003644:
                                    case 189568345:
                                        if (C11340.f33930 >= 0) {
                                            iM25618 = (i43 - C0630.m2566("֨۟")) * 5;
                                            i44 = ((iM25618 ^ i42) * 25579) ^ (-1586380266);
                                            i45 = 1092456097;
                                        } else {
                                            iM25618 = C2105.m6981("ܰ۠") ^ i42;
                                            i44 = ((iM25618 ^ i43) * (-31885)) ^ (-645035520);
                                            i45 = 726485273;
                                        }
                                        break;
                                    case -1084227182:
                                    case -732246395:
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM25618 = C0630.m2566("᩵᩹") ^ i42;
                                            i44 = ((iM25618 ^ i43) * (-13267)) ^ (-366443368);
                                            i45 = 948308218;
                                        } else {
                                            iM25618 = C0630.m2566("ۡۜ") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 317) ^ 1915193606;
                                            i45 = 1538258632;
                                        }
                                        break;
                                    case -957602471:
                                    case 143174446:
                                        if (C1005.m3501()) {
                                            iM25618 = (i42 - C2105.m6981("۟᩸")) * (-33);
                                            i44 = ((iM25618 ^ i43) * (-11797)) ^ 1614479819;
                                            i45 = 113503695;
                                        } else {
                                            iM25618 = (i43 - C0630.m2566("֨۟")) * 5;
                                            i44 = ((iM25618 ^ i42) * 25579) ^ (-1586380266);
                                            i45 = 1092456097;
                                        }
                                        break;
                                    case -825209696:
                                    case 2086784317:
                                        C18781.m43437(c18782, main7, dialogInterfaceC0207, c13877, str3);
                                        break;
                                    case -719007826:
                                    case 962794227:
                                        C1773.m5908();
                                        if (C4117.f13076 > 0) {
                                            iM25618 = C2105.m6981("֨ܶ") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 4233) ^ (-263732533);
                                            i45 = 1193166058;
                                        } else {
                                            iM25618 = (i43 - C0630.m2566("֨۟")) * 5;
                                            i44 = ((iM25618 ^ i42) * 25579) ^ (-1586380266);
                                            i45 = 1092456097;
                                        }
                                        break;
                                    case -691506260:
                                    case 1051946299:
                                        if (C3432.f10845 >= 0) {
                                            iM25618 = C0630.m2566("᩵᩹") ^ i42;
                                            i44 = ((iM25618 ^ i43) * (-13267)) ^ (-366443368);
                                            i45 = 948308218;
                                        } else {
                                            iM25618 = (i43 - C0630.m2566("֨۟")) * 5;
                                            i44 = ((iM25618 ^ i42) * 25579) ^ (-1586380266);
                                            i45 = 1092456097;
                                        }
                                        break;
                                    case -615429409:
                                    case 1305194732:
                                        if (C3245.f10203 <= 0) {
                                            iM25618 = C2105.m6981("֨ܶ") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 4233) ^ (-263732533);
                                            i45 = 1193166058;
                                        } else {
                                            iM25618 = C0630.m2566("ۙ᩹") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 30021) ^ (-1035078388);
                                            i45 = 1789310516;
                                        }
                                        break;
                                    case -357130072:
                                    case 529228400:
                                        if (C3746.f11829 <= 0) {
                                            iM25618 = C2105.m6981("ᩳܽ") ^ i43;
                                            i44 = ((iM25618 ^ i42) * (-3735)) ^ (-1572908968);
                                            i45 = 1599773628;
                                        } else {
                                            iM25618 = (i42 - C0630.m2566("ۜۨ")) * 123;
                                            i44 = ((iM25618 ^ i43) * 6703) ^ (-120455365);
                                            i45 = -1919364736;
                                        }
                                        break;
                                    case -235282218:
                                    case 977659774:
                                        if (C0630.m2564()) {
                                            iM25618 = C2105.m6981("ᩳܽ") ^ i43;
                                            i44 = ((iM25618 ^ i42) * (-3735)) ^ (-1572908968);
                                            i45 = 1599773628;
                                        } else {
                                            iM25618 = C0630.m2566("ܶ֫") ^ i42;
                                            i44 = ((iM25618 ^ i43) * 2775) ^ 854547584;
                                            i45 = 119000173;
                                        }
                                        break;
                                    case -213800447:
                                    case 1485831014:
                                        if (C4616.m13552() != 0) {
                                            iM25618 = C0630.m2566("᩵᩹") ^ i42;
                                            i44 = ((iM25618 ^ i43) * (-13267)) ^ (-366443368);
                                            i45 = 948308218;
                                        } else {
                                            iM25618 = (i43 - C0630.m2566("᩸ۙ")) * 97;
                                            i44 = ((iM25618 ^ i42) * 31163) ^ 1235454915;
                                            i45 = -857431991;
                                        }
                                        break;
                                    case 90300393:
                                    case 653541321:
                                        if (C1294.f4556 >= 0) {
                                            iM25618 = (i43 - C0630.m2566("֨۟")) * 5;
                                            i44 = ((iM25618 ^ i42) * 25579) ^ (-1586380266);
                                            i45 = 1092456097;
                                        } else {
                                            iM25618 = (i42 - C0630.m2566("ۤᩳ")) * (-67);
                                            i44 = ((iM25618 ^ i43) * 5541) ^ (-764061778);
                                            i45 = 1770607935;
                                        }
                                        break;
                                    case 799534108:
                                    case 976835354:
                                        c18782 = this.f29151;
                                        dialogInterfaceC0207 = dialogInterfaceC0206;
                                        if (C1504.f5354) {
                                            iM25618 = C2105.m6981("֨ܶ") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 4233) ^ (-263732533);
                                            i45 = 1193166058;
                                        } else {
                                            iM25618 = (i43 - C0630.m2566("ܺ֡")) * 33;
                                            i44 = ((iM25618 ^ i42) * 9443) ^ 621235071;
                                            i45 = 1375118438;
                                        }
                                        break;
                                    default:
                                        C1773.m5908();
                                        C21923.m49329();
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i41 = 190251717;
                            int i42 = C4117.f13076;
                            int i43 = C3683.f11629;
                            int iM25618 = (C0630.m2566("֨۟") ^ i42) * 39;
                            int i44 = ((iM25618 ^ i43) * (-17561)) ^ 2017364567;
                            int i45 = 1771181239;
                            while (true) {
                                i41 = ((((i41 ^ i43) * 26213) >> 31) & i44) ^ (iM25618 ^ i45);
                                switch (i41) {
                                    case -2132565499:
                                    case -1623860697:
                                        C1504.m5179();
                                        if (!RunnableC1108.f4040) {
                                            iM25618 = C0630.m2566("ۙ۠") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        } else {
                                            iM25618 = C2105.m6981("᩵֨") ^ i42;
                                            i44 = ((iM25618 ^ i43) * 24147) ^ (-364044803);
                                            i45 = 316600945;
                                        }
                                        break;
                                    case -1874507013:
                                    case -441771912:
                                        if (C3537.f11231 >= 0) {
                                            iM25618 = C0630.m2566("ۙ۠") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        } else {
                                            iM25618 = C0630.m2566("۟᩷") ^ i42;
                                            i44 = ((iM25618 ^ i43) * 8357) ^ (-1732915949);
                                            i45 = -1482833812;
                                        }
                                        break;
                                    case -1626221211:
                                    case -709604077:
                                        return;
                                    case -1491965597:
                                    case 1142182149:
                                        if (C22628.f73083 > 0) {
                                            iM25618 = C0630.m2566("ۙ۠") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        } else {
                                            iM25618 = (C2105.m6981("ܳ᩸") ^ i42) * 109;
                                            i44 = ((iM25618 ^ i43) * 25287) ^ 1351150969;
                                            i45 = -602045638;
                                        }
                                        break;
                                    case -1168252003:
                                    case 570923919:
                                        ServiceConnectionC3453.m10564();
                                        C2272.m7503();
                                        throw new RuntimeException();
                                    case -830694997:
                                    case -689956566:
                                        if (C4616.m13552() != 0) {
                                            iM25618 = C0630.m2566("ۙ۠") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        } else {
                                            iM25618 = (C2105.m6981("ۘ۫") ^ i43) * (-61);
                                            i44 = ((iM25618 ^ i42) * 20291) ^ (-769892526);
                                            i45 = -1174789138;
                                        }
                                        break;
                                    case -821961824:
                                    case 452405616:
                                        if (C1128.f4106 <= 0) {
                                            iM25618 = C0630.m2566("ۙ۠") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        } else {
                                            iM25618 = C0630.m2566("ܶᩳ") ^ i43;
                                            i44 = ((iM25618 ^ i42) * (-19559)) ^ 803235548;
                                            i45 = 288104552;
                                        }
                                        break;
                                    case -454180711:
                                    case 2090115360:
                                        if (C0422.f1886 <= 0) {
                                            iM25618 = C2105.m6981("᩵֨") ^ i42;
                                            i44 = ((iM25618 ^ i43) * 24147) ^ (-364044803);
                                            i45 = 316600945;
                                        } else {
                                            iM25618 = (C2105.m6981("ۖۗ") + i42) * (-69);
                                            i44 = ((iM25618 ^ i43) * (-14623)) ^ (-1160218203);
                                            i45 = 1416593752;
                                        }
                                        break;
                                    case -441868271:
                                    case 37008020:
                                        if (C22628.f73083 <= 0) {
                                            iM25618 = C2105.m6981("᩵֨") ^ i42;
                                            i44 = ((iM25618 ^ i43) * 24147) ^ (-364044803);
                                            i45 = 316600945;
                                        } else {
                                            iM25618 = (C2105.m6981("֡ۢ") + i42) * 33;
                                            i44 = ((iM25618 ^ i43) * (-10581)) ^ 164397923;
                                            i45 = 643462986;
                                        }
                                        break;
                                    case -385889012:
                                    case 2042528802:
                                        if (C11340.f33930 >= 0) {
                                            iM25618 = (C2105.m6981("֡ۗ") + i43) * (-9);
                                            i44 = ((iM25618 ^ i42) * (-16821)) ^ 91775156;
                                            i45 = -133819262;
                                        } else {
                                            iM25618 = (i43 - C2105.m6981("ܰܺ")) * 83;
                                            i44 = ((iM25618 ^ i42) * (-7833)) ^ (-79324969);
                                            i45 = -1133113492;
                                        }
                                        break;
                                    case -246106701:
                                    case 446766234:
                                        if (C2167.f7158 >= 0) {
                                            iM25618 = (C2105.m6981("֡ۗ") + i43) * (-9);
                                            i44 = ((iM25618 ^ i42) * (-16821)) ^ 91775156;
                                            i45 = -133819262;
                                        } else {
                                            iM25618 = C0630.m2566("ۙ֨") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 8623) ^ (-2084316443);
                                            i45 = -1925604320;
                                        }
                                        break;
                                    case -70302219:
                                    case 1537645520:
                                        if (AbstractC2021.f6743 <= 0) {
                                            iM25618 = (C2105.m6981("ܽۙ") + i43) * 99;
                                            i44 = ((iM25618 ^ i42) * (-9019)) ^ 2093755460;
                                            i45 = -2137984055;
                                        } else {
                                            iM25618 = (C0630.m2566("ۧ۫") ^ i42) * 119;
                                            i44 = ((iM25618 ^ i43) * (-17023)) ^ (-1183454018);
                                            i45 = -2110004170;
                                        }
                                        break;
                                    case 122590166:
                                    case 374220354:
                                        if (C7811.m20844() != 0) {
                                            iM25618 = C0630.m2566("ۙ۠") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        } else {
                                            iM25618 = (C0630.m2566("֡֡") ^ i43) * (-75);
                                            i44 = ((iM25618 ^ i42) * (-9939)) ^ (-225508697);
                                            i45 = 549772753;
                                        }
                                        break;
                                    case 273258770:
                                    case 1706175034:
                                        C4616.m13552();
                                        if (C7811.m20844() != 0) {
                                            iM25618 = (C2105.m6981("֡ۗ") + i43) * (-9);
                                            i44 = ((iM25618 ^ i42) * (-16821)) ^ 91775156;
                                            i45 = -133819262;
                                        } else {
                                            iM25618 = C0630.m2566("ۙ۠") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 7415) ^ (-1215058631);
                                            i45 = 1322973527;
                                        }
                                        break;
                                    case 443960152:
                                    case 799188192:
                                        C3663.m11168();
                                        iM25618 = C0630.m2566("ۙ۠") ^ i43;
                                        i44 = ((iM25618 ^ i42) * 7415) ^ (-1215058631);
                                        i45 = 1322973527;
                                        break;
                                    default:
                                        this.f29151 = c18781;
                                        if (C1005.f3721) {
                                            iM25618 = (C2105.m6981("ۤ᩻") + i42) * (-123);
                                            i44 = ((iM25618 ^ i43) * (-13565)) ^ (-641765488);
                                            i45 = -2100048099;
                                        } else {
                                            iM25618 = C0630.m2566("ۙ۠") ^ i43;
                                            i44 = ((iM25618 ^ i42) * 7415) ^ (-1215058631);
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
                    strM11225 = C3683.m11225(f59290, 28, 3, i24);
                    if (C1128.f4106 > 0) {
                        int iM69813 = (C2105.m6981("۟֫") + i19) * 49;
                        i2 = ((iM69813 ^ i20) * 24605) ^ (-481913028);
                        i22 = iM69813 ^ 1102118452;
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
                        int iM69814 = (i19 - C2105.m6981("֡۬")) * (-65);
                        int i312 = i;
                        i21 = ((iM69814 ^ i20) * (-31805)) ^ 2104474169;
                        sArr6 = sArr;
                        i28 = i28;
                        i30 = i30;
                        sArr8 = sArr8;
                        i23 = i23;
                        sArr10 = sArr10;
                        sArr7 = sArr7;
                        view3 = view3;
                        i22 = iM69814 ^ 2123947851;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43437(final C18781 c18781, final Main main, final DialogInterfaceC0206 dialogInterfaceC0206, final C13876 c13876, final String str) {
        DialogInterface.OnClickListener onClickListener;
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        DialogInterface.OnClickListener onClickListener2;
        short s;
        int iM6981;
        int i5;
        int i6;
        int i7 = C1128.f4106;
        int i8 = C1294.f4556;
        int iM2568 = C0630.m2566("ۚۡ") ^ i7;
        int i9 = ((iM2568 ^ i8) * 12067) ^ (-1388014384);
        DialogInterface.OnClickListener onClickListener3 = null;
        Object obj = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM2568 ^ 1729689788;
        C19258 c19258M5912 = null;
        int iM2569 = 0;
        int iM6982 = 0;
        int i11 = 0;
        int iM25610 = 0;
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
                    iM2569 = iM2569;
                    onClickListener3 = onClickListener3;
                    int i19 = i17 + 269583561;
                    if (i15 - (i19 + i19) > 0) {
                        iM2567 = (C0630.m2566("֨ۤ") + i8) * (-79);
                        i3 = ((iM2567 ^ i7) * 3803) ^ (-956385719);
                        i4 = 1797836258;
                    } else {
                        iM2567 = (i7 - C2105.m6981("᩶۫")) * 11;
                        i3 = ((iM2567 ^ i8) * 7011) ^ (-854847955);
                        i4 = -840240021;
                    }
                    int i20 = iM2567 ^ i4;
                    onClickListener3 = onClickListener3;
                    i10 = i20;
                    i9 = i3;
                    iM2569 = iM2569;
                    break;
                case -1927133133:
                case -613659929:
                    if (!C0382.f1805) {
                        iM2566 = (C0630.m2566("᩶ۛ") + i8) * 97;
                        onClickListener = onClickListener3;
                        i = ((iM2566 ^ i7) * (-7339)) ^ 688488788;
                        i2 = 1293644259;
                        DialogInterface.OnClickListener onClickListener4 = onClickListener;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                        onClickListener3 = onClickListener4;
                    } else {
                        iM2569 = iM2569;
                        onClickListener2 = onClickListener3;
                        s = s2;
                        iM6981 = C2105.m6981("ۙܽ") ^ i8;
                        i5 = ((iM6981 ^ i7) * 22645) ^ 1724677501;
                        i6 = -661631732;
                        int i21 = iM6981 ^ i6;
                        s2 = s;
                        i9 = i5;
                        onClickListener3 = onClickListener2;
                        i10 = i21;
                        iM2569 = iM2569;
                    }
                    break;
                case -1872609734:
                case 163524921:
                    i14 = 22794;
                    iM2567 = (i7 - C0630.m2566("ܳ᩶")) * (-57);
                    i3 = ((iM2567 ^ i8) * (-7721)) ^ (-1951546046);
                    i4 = -160713538;
                    int i22 = iM2567 ^ i4;
                    onClickListener3 = onClickListener3;
                    i10 = i22;
                    i9 = i3;
                    iM2569 = iM2569;
                    break;
                case -1798128302:
                case -1291779917:
                    iM2569 = iM2569;
                    onClickListener3 = onClickListener3;
                    C3432.m10490(c19258M5912, 2124602408 ^ iM25610);
                    sArr = f59290;
                    i18 = 4;
                    if (C7811.m20844() != 0) {
                        iM2567 = (i7 - C2105.m6981("᩵ᩳ")) * (-89);
                        i3 = ((iM2567 ^ i8) * (-20873)) ^ 1083257765;
                        i4 = -408116006;
                    } else {
                        iM2567 = (C2105.m6981("᩵ۛ") + i8) * (-17);
                        i3 = ((iM2567 ^ i7) * (-13935)) ^ 1362475356;
                        i4 = 1883307996;
                    }
                    int i23 = iM2567 ^ i4;
                    onClickListener3 = onClickListener3;
                    i10 = i23;
                    i9 = i3;
                    iM2569 = iM2569;
                    break;
                case -1757462059:
                case 438387385:
                    i14 = 18429;
                    iM2567 = (i7 - C0630.m2566("ܳ᩶")) * (-57);
                    i3 = ((iM2567 ^ i8) * (-7721)) ^ (-1951546046);
                    i4 = -160713538;
                    int i24 = iM2567 ^ i4;
                    onClickListener3 = onClickListener3;
                    i10 = i24;
                    i9 = i3;
                    iM2569 = iM2569;
                    break;
                case -1525370594:
                case 998259094:
                    C3663.m11167(dialogInterfaceC0206);
                    break;
                case -966320737:
                case 513613491:
                    C4159.m12565();
                    C1047.m3599();
                    iM2569 = iM2569;
                    onClickListener2 = onClickListener3;
                    s = s2;
                    iM6981 = C2105.m6981("ۙܽ") ^ i8;
                    i5 = ((iM6981 ^ i7) * 22645) ^ 1724677501;
                    i6 = -661631732;
                    int i25 = iM6981 ^ i6;
                    s2 = s;
                    i9 = i5;
                    onClickListener3 = onClickListener2;
                    i10 = i25;
                    iM2569 = iM2569;
                    break;
                case -699780321:
                case 31281563:
                    C1294.m4380(c19258M5912, iM6982, onClickListener3);
                    sArr2 = f59290;
                    i13 = 3;
                    if (C3537.m10746() <= 0) {
                        i12 = 10;
                        int iM6983 = C2105.m6981("ܳۡ") ^ i8;
                        i10 = iM6983 ^ (-615891026);
                        i9 = ((iM6983 ^ i7) * 2355) ^ 2124106081;
                        c19258M5912 = c19258M5912;
                    } else {
                        int iM6984 = C2105.m6981("᩵ܶ") ^ i8;
                        i10 = iM6984 ^ 1975988338;
                        i9 = ((iM6984 ^ i7) * (-11207)) ^ 515531787;
                        i12 = 10;
                    }
                    break;
                case -624116424:
                case 1733404609:
                    int iM25611 = C0630.m2566(C11340.m28025(sArr2, i12, i13, i14)) ^ 2123542547;
                    if (C0630.f2410 <= 0) {
                        i11 = iM25611;
                        obj = null;
                        iM2566 = (C0630.m2566("᩶ۛ") + i8) * 97;
                        onClickListener = onClickListener3;
                        i = ((iM2566 ^ i7) * (-7339)) ^ 688488788;
                        i2 = 1293644259;
                        DialogInterface.OnClickListener onClickListener5 = onClickListener;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                        onClickListener3 = onClickListener5;
                    } else {
                        int iM25612 = C0630.m2566("᩶ܰ") ^ i7;
                        int i26 = ((iM25612 ^ i8) * 15223) ^ 713903540;
                        i10 = iM25612 ^ (-158068016);
                        i11 = iM25611;
                        i9 = i26;
                        obj = null;
                    }
                    break;
                case -386512766:
                case 2000059529:
                    iM2569 = iM2569;
                    onClickListener2 = onClickListener3;
                    s = s2;
                    int i27 = s + 16419;
                    i15 = i27 * i27;
                    i17 = s * s;
                    if (C2520.f8000 >= 0) {
                        iM6981 = C2105.m6981("ۙܽ") ^ i8;
                        i5 = ((iM6981 ^ i7) * 22645) ^ 1724677501;
                        i6 = -661631732;
                    } else {
                        iM6981 = C2105.m6981("ܰ֨") ^ i8;
                        i5 = ((iM6981 ^ i7) * 22829) ^ 1292184548;
                        i6 = 1595588956;
                    }
                    int i28 = iM6981 ^ i6;
                    s2 = s;
                    i9 = i5;
                    onClickListener3 = onClickListener2;
                    i10 = i28;
                    iM2569 = iM2569;
                    break;
                case -362436108:
                case 818273053:
                    iM6982 = 2129467184 ^ C2105.m6981(C21923.m49334(sArr3, 7, 3, i14));
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C0630.m2566("᩶ۛ") + i8) * 97;
                        onClickListener = onClickListener3;
                        i = ((iM2566 ^ i7) * (-7339)) ^ 688488788;
                        i2 = 1293644259;
                    } else {
                        onClickListener = onClickListener3;
                        iM2566 = (C2105.m6981("۫᩺") ^ i8) * 41;
                        i = ((iM2566 ^ i7) * 12103) ^ 343073584;
                        i2 = -568760709;
                    }
                    DialogInterface.OnClickListener onClickListener6 = onClickListener;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    onClickListener3 = onClickListener6;
                    break;
                case -325909316:
                case 477398226:
                    if (C0483.f2088 >= 0) {
                        iM2569 = iM2569;
                        onClickListener2 = onClickListener3;
                        s = s2;
                        iM6981 = C2105.m6981("ۙܽ") ^ i8;
                        i5 = ((iM6981 ^ i7) * 22645) ^ 1724677501;
                        i6 = -661631732;
                        int i29 = iM6981 ^ i6;
                        s2 = s;
                        i9 = i5;
                        onClickListener3 = onClickListener2;
                        i10 = i29;
                        iM2569 = iM2569;
                    } else {
                        int iM25613 = (i7 - C0630.m2566("᩹ۨ")) * (-111);
                        i10 = iM25613 ^ (-586859654);
                        i9 = ((iM25613 ^ i8) * (-24831)) ^ (-1288986186);
                    }
                    break;
                case -323326595:
                case 35146727:
                    iM2569 = iM2569;
                    onClickListener3 = onClickListener3;
                    if (c13876.m33269().isEmpty()) {
                        iM2567 = (C2105.m6981("ۡۨ") + i7) * 15;
                        i3 = ((iM2567 ^ i8) * (-27587)) ^ 1890796426;
                        i4 = -622990817;
                    } else {
                        iM2567 = C0630.m2566("ܰۡ") ^ i8;
                        i3 = ((iM2567 ^ i7) * (-9343)) ^ 2030589533;
                        i4 = -31976047;
                    }
                    int i210 = iM2567 ^ i4;
                    onClickListener3 = onClickListener3;
                    i10 = i210;
                    i9 = i3;
                    iM2569 = iM2569;
                    break;
                case -32297374:
                case 741659593:
                    C2520.m8029(c19258M5912, i11, obj);
                    C10025.m25199(c18781.f59293, C3683.m11213(c19258M5912), str);
                    break;
                case 121688920:
                case 276038755:
                    onClickListener = onClickListener3;
                    iM2569 = 2130599219 ^ C0630.m2566(C2272.m7507(sArr, i18, 3, i14));
                    if (!C2272.f7362) {
                        iM2566 = (C0630.m2566("᩷ܰ") ^ i7) * (-27);
                        i = ((iM2566 ^ i8) * (-23033)) ^ (-1161018675);
                        i2 = 1367220353;
                        DialogInterface.OnClickListener onClickListener7 = onClickListener;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                        onClickListener3 = onClickListener7;
                    } else {
                        onClickListener3 = onClickListener;
                        int iM6985 = C2105.m6981("ܳۡ") ^ i8;
                        i10 = iM6985 ^ (-615891026);
                        i9 = ((iM6985 ^ i7) * 2355) ^ 2124106081;
                        c19258M5912 = c19258M5912;
                    }
                    break;
                case 228504324:
                case 1360021003:
                    iM2569 = iM2569;
                    onClickListener3 = onClickListener3;
                    c19258M5912 = C1773.m5912(main);
                    iM25610 = C0630.m2566(C3019.m9250(f59290, 1, 3, i14));
                    if (C4263.f13799 <= 0) {
                        iM2567 = (i7 - C2105.m6981("᩵ᩳ")) * (-89);
                        i3 = ((iM2567 ^ i8) * (-20873)) ^ 1083257765;
                        i4 = -408116006;
                    } else {
                        iM2567 = C2105.m6981("ܺܿ") ^ i7;
                        i3 = ((iM2567 ^ i8) * (-13017)) ^ (-1228038997);
                        i4 = -1148854210;
                    }
                    int i211 = iM2567 ^ i4;
                    onClickListener3 = onClickListener3;
                    i10 = i211;
                    i9 = i3;
                    iM2569 = iM2569;
                    break;
                case 395076488:
                case 1805219273:
                    iM2569 = iM2569;
                    onClickListener3 = onClickListener3;
                    s2 = f59290[0];
                    if (C4263.f13799 > 0) {
                        iM2567 = (C0630.m2566("֡ۛ") ^ i8) * 59;
                        i3 = ((iM2567 ^ i7) * (-22263)) ^ 1483528656;
                        i4 = 569292674;
                        int i212 = iM2567 ^ i4;
                        onClickListener3 = onClickListener3;
                        i10 = i212;
                        i9 = i3;
                        iM2569 = iM2569;
                    } else {
                        onClickListener3 = onClickListener3;
                        iM2569 = iM2569;
                        int iM6986 = C2105.m6981("ܳۡ") ^ i8;
                        i10 = iM6986 ^ (-615891026);
                        i9 = ((iM6986 ^ i7) * 2355) ^ 2124106081;
                        c19258M5912 = c19258M5912;
                    }
                    break;
                case 1220707316:
                case 1567049899:
                    C7106.m19114(c19258M5912, iM2569);
                    onClickListener3 = new DialogInterface.OnClickListener(c18781) { // from class: l.ۡ۬ܽ

                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C18781 f27077;

                        {
                            int i30 = 1408432975;
                            int i31 = C1294.f4556;
                            int i32 = C0630.f2410;
                            int iM25614 = (C0630.m2566("۟ۚ") ^ i32) * (-83);
                            int i33 = ((iM25614 ^ i31) * (-24039)) ^ (-334500984);
                            int i34 = -1362618415;
                            while (true) {
                                i30 = ((((i30 ^ i31) * (-21755)) >> 31) & i33) ^ (iM25614 ^ i34);
                                switch (i30) {
                                    case -2055656598:
                                    case 560312410:
                                        if (C0798.f2919) {
                                            iM25614 = C0630.m2566("ۙܶ") ^ i31;
                                            i33 = ((iM25614 ^ i32) * 14215) ^ (-841742393);
                                            i34 = -1297308216;
                                        } else {
                                            iM25614 = (i32 - C2105.m6981("۫֡")) * (-113);
                                            i33 = ((iM25614 ^ i31) * (-29353)) ^ (-1423424574);
                                            i34 = 625225057;
                                        }
                                        break;
                                    case -1948710868:
                                    case 1538109961:
                                        if (C1420.f5096 <= 0) {
                                            iM25614 = C2105.m6981("᩺ۚ") ^ i31;
                                            i33 = ((iM25614 ^ i32) * 6341) ^ 1128664525;
                                            i34 = 1945958068;
                                        } else {
                                            iM25614 = C2105.m6981("᩵᩷") ^ i32;
                                            i33 = ((iM25614 ^ i31) * 13259) ^ 154565749;
                                            i34 = 1180400311;
                                        }
                                        break;
                                    case -1792639621:
                                    case 1829716421:
                                        if (C3911.f12484 >= 0) {
                                            iM25614 = (i32 - C0630.m2566("ۗ᩵")) * (-89);
                                            i33 = ((iM25614 ^ i31) * 18519) ^ 2129389200;
                                            i34 = 1574620851;
                                        } else {
                                            iM25614 = (i31 - C0630.m2566("᩵ܶ")) * (-5);
                                            i33 = ((iM25614 ^ i32) * 32689) ^ (-292804848);
                                            i34 = 830945452;
                                        }
                                        break;
                                    case -1710117043:
                                    case 53253559:
                                        if (C0237.m1481() >= 0) {
                                            iM25614 = (i32 - C0630.m2566("ۡ֡")) * 7;
                                            i33 = ((iM25614 ^ i31) * 7465) ^ 1504480038;
                                            i34 = -404731191;
                                        } else {
                                            iM25614 = C2105.m6981("᩹᩹") ^ i32;
                                            i33 = ((iM25614 ^ i31) * (-19363)) ^ 539219524;
                                            i34 = 239568583;
                                        }
                                        break;
                                    case -1657748477:
                                    case 2056181292:
                                        C4616.m13552();
                                        C0237.m1481();
                                        iM25614 = C0630.m2566("ۙܶ") ^ i31;
                                        i33 = ((iM25614 ^ i32) * 14215) ^ (-841742393);
                                        i34 = -1297308216;
                                        break;
                                    case -1520196958:
                                    case -981709958:
                                        if (C4075.f12947 >= 0) {
                                            iM25614 = (i32 - C0630.m2566("ۗ᩵")) * (-89);
                                            i33 = ((iM25614 ^ i31) * 18519) ^ 2129389200;
                                            i34 = 1574620851;
                                        } else {
                                            iM25614 = (i31 - C0630.m2566("᩶ۛ")) * 55;
                                            i33 = ((iM25614 ^ i32) * 3029) ^ (-1632970746);
                                            i34 = 3981575;
                                        }
                                        break;
                                    case -979554962:
                                    case 1934217893:
                                        if (C3537.f11231 >= 0) {
                                            iM25614 = (C2105.m6981("ۜ᩹") + i31) * (-11);
                                            i33 = ((iM25614 ^ i32) * (-26815)) ^ (-1268724990);
                                            i34 = 410906977;
                                        } else {
                                            iM25614 = C2105.m6981("᩺᩵") ^ i32;
                                            i33 = ((iM25614 ^ i31) * 32085) ^ 154096688;
                                            i34 = 935125432;
                                        }
                                        break;
                                    case -829436644:
                                    case 1425286817:
                                        if (C7106.f21815 != 0) {
                                            iM25614 = C2105.m6981("᩺ۚ") ^ i31;
                                            i33 = ((iM25614 ^ i32) * 6341) ^ 1128664525;
                                            i34 = 1945958068;
                                        } else {
                                            iM25614 = (C2105.m6981("ۛۧ") + i31) * 51;
                                            i33 = ((iM25614 ^ i32) * DilithiumEngine.DilithiumRootOfUnity) ^ (-1803334530);
                                            i34 = -2059029732;
                                        }
                                        break;
                                    case -587760833:
                                    case 902252851:
                                        ServiceConnectionC3453.m10564();
                                        if (C1711.m5736() <= 0) {
                                            iM25614 = (C2105.m6981("ۜ᩹") + i31) * (-11);
                                            i33 = ((iM25614 ^ i32) * (-26815)) ^ (-1268724990);
                                            i34 = 410906977;
                                        } else {
                                            iM25614 = (i32 - C0630.m2566("ۡ֡")) * 7;
                                            i33 = ((iM25614 ^ i31) * 7465) ^ 1504480038;
                                            i34 = -404731191;
                                        }
                                        break;
                                    case -586962255:
                                    case 1851642430:
                                        if (C1294.f4556 >= 0) {
                                            iM25614 = (i32 - C0630.m2566("ۡ֡")) * 7;
                                            i33 = ((iM25614 ^ i31) * 7465) ^ 1504480038;
                                            i34 = -404731191;
                                        } else {
                                            iM25614 = C0630.m2566("۫᩹") ^ i31;
                                            i33 = ((iM25614 ^ i32) * (-29517)) ^ (-1784949422);
                                            i34 = 1788177323;
                                        }
                                        break;
                                    case -397489879:
                                    case 497338526:
                                        C7106.m19120();
                                        C7106.m19120();
                                        throw new RuntimeException();
                                    case 267599138:
                                    case 940404636:
                                        if (C22628.f73083 <= 0) {
                                            iM25614 = C0630.m2566("ۙܶ") ^ i31;
                                            i33 = ((iM25614 ^ i32) * 14215) ^ (-841742393);
                                            i34 = -1297308216;
                                        } else {
                                            iM25614 = (C0630.m2566("۫ۡ") ^ i31) * (-125);
                                            i33 = ((iM25614 ^ i32) * 3935) ^ 1414475679;
                                            i34 = -1450822739;
                                        }
                                        break;
                                    case 485022547:
                                    case 885307651:
                                        return;
                                    case 533830306:
                                    case 907470536:
                                        this.f27077 = c18781;
                                        if (RunnableC1108.m3790()) {
                                            iM25614 = (i32 - C0630.m2566("ۡ֡")) * 7;
                                            i33 = ((iM25614 ^ i31) * 7465) ^ 1504480038;
                                            i34 = -404731191;
                                        } else {
                                            iM25614 = (C0630.m2566("ۖۢ") ^ i32) * 39;
                                            i33 = ((iM25614 ^ i31) * 29723) ^ 894648321;
                                            i34 = -550824668;
                                        }
                                        break;
                                    case 781092773:
                                    case 1659376777:
                                        AbstractC2021.m6574();
                                        if (C21923.f70183 == 0) {
                                            iM25614 = (i32 - C0630.m2566("ۗ᩵")) * (-89);
                                            i33 = ((iM25614 ^ i31) * 18519) ^ 2129389200;
                                            i34 = 1574620851;
                                        } else {
                                            iM25614 = (i32 - C0630.m2566("ۡ֡")) * 7;
                                            i33 = ((iM25614 ^ i31) * 7465) ^ 1504480038;
                                            i34 = -404731191;
                                        }
                                        break;
                                    default:
                                        if (C3245.m9925() != 0) {
                                            iM25614 = (i32 - C0630.m2566("ۡ֡")) * 7;
                                            i33 = ((iM25614 ^ i31) * 7465) ^ 1504480038;
                                            i34 = -404731191;
                                        } else {
                                            iM25614 = C0630.m2566("ۙܶ") ^ i31;
                                            i33 = ((iM25614 ^ i32) * 14215) ^ (-841742393);
                                            i34 = -1297308216;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i30) {
                            DialogInterfaceC0206 dialogInterfaceC0207 = null;
                            int i31 = 436837254;
                            int i32 = C3245.f10203;
                            int i33 = C0714.f2697;
                            int iM6987 = (C2105.m6981("ۤۨ") + i32) * 7;
                            int i34 = ((iM6987 ^ i33) * (-22191)) ^ 1370063761;
                            int i35 = 1747916272;
                            while (true) {
                                i31 = ((((i31 ^ i33) * 28203) >> 31) & i34) ^ (iM6987 ^ i35);
                                switch (i31) {
                                    case -2095602364:
                                    case 1114406178:
                                        if (C3432.m10477() > 0) {
                                            iM6987 = C0630.m2566("۫᩵") ^ i33;
                                            i34 = ((iM6987 ^ i32) * (-20593)) ^ (-227916227);
                                            i35 = 11523142;
                                        } else {
                                            iM6987 = (i32 - C2105.m6981("ۧ᩺")) * (-43);
                                            i34 = ((iM6987 ^ i33) * 25035) ^ (-1327750917);
                                            i35 = -1534348359;
                                        }
                                        break;
                                    case -2030437932:
                                    case -1749859207:
                                        if (C1005.f3721) {
                                            iM6987 = C0630.m2566("۫ܳ") ^ i33;
                                            i34 = ((iM6987 ^ i32) * (-18179)) ^ 1680093804;
                                            i35 = -838045575;
                                        } else {
                                            iM6987 = C0630.m2566("ۤ᩶") ^ i33;
                                            i34 = ((iM6987 ^ i32) * 5757) ^ 192032301;
                                            i35 = -870082771;
                                        }
                                        break;
                                    case -1897906511:
                                    case -1736241315:
                                        if (C4263.f13799 <= 0) {
                                            iM6987 = (i32 - C2105.m6981("ۧ᩺")) * (-43);
                                            i34 = ((iM6987 ^ i33) * 25035) ^ (-1327750917);
                                            i35 = -1534348359;
                                        } else {
                                            iM6987 = C0630.m2566("᩵۟") ^ i32;
                                            i34 = ((iM6987 ^ i33) * (-28725)) ^ (-853994939);
                                            i35 = 1726691257;
                                        }
                                        break;
                                    case -1861150269:
                                    case -1685996476:
                                        C3663.m11167(dialogInterfaceC0207);
                                        if (ViewOnClickListenerC1958.m6429() < 0) {
                                            C18781 c18782 = this.f27077;
                                            C13876 c13877 = c13876;
                                            Main main2 = main;
                                            if (!C1711.f5919) {
                                                C10025.m25197(new C14966(c18782, c13877, main2), main2, str);
                                            }
                                            iM6987 = C2105.m6981("᩵ۘ") ^ i33;
                                            i34 = ((iM6987 ^ i32) * 14597) ^ (-1291233762);
                                            i35 = -1672493570;
                                        } else {
                                            iM6987 = C0630.m2566("ۤ᩶") ^ i33;
                                            i34 = ((iM6987 ^ i32) * 5757) ^ 192032301;
                                            i35 = -870082771;
                                        }
                                        break;
                                    case -1857209760:
                                    case -159094025:
                                        C1005.m3501();
                                        if (C3746.f11829 > 0) {
                                            iM6987 = C0630.m2566("᩵۟") ^ i32;
                                            i34 = ((iM6987 ^ i33) * (-28725)) ^ (-853994939);
                                            i35 = 1726691257;
                                        } else {
                                            iM6987 = C2105.m6981("᩵ۘ") ^ i33;
                                            i34 = ((iM6987 ^ i32) * 14597) ^ (-1291233762);
                                            i35 = -1672493570;
                                        }
                                        break;
                                    case -1720162428:
                                    case 602717740:
                                        if (C2105.f7037 != 0) {
                                            iM6987 = C0630.m2566("ۤ᩶") ^ i33;
                                            i34 = ((iM6987 ^ i32) * 5757) ^ 192032301;
                                            i35 = -870082771;
                                        } else {
                                            iM6987 = C2105.m6981("ܳܿ") ^ i32;
                                            i34 = ((iM6987 ^ i33) * 4243) ^ 811324100;
                                            i35 = 2039877707;
                                        }
                                        break;
                                    case -1385005302:
                                    case -576131442:
                                        if (C0237.f1507 != 0) {
                                            iM6987 = C2105.m6981("᩵ۘ") ^ i33;
                                            i34 = ((iM6987 ^ i32) * 14597) ^ (-1291233762);
                                            i35 = -1672493570;
                                        } else {
                                            iM6987 = C2105.m6981("۫֫") ^ i32;
                                            i34 = ((iM6987 ^ i33) * (-30189)) ^ (-1973932062);
                                            i35 = -1245003727;
                                        }
                                        break;
                                    case -711594692:
                                    case 510487853:
                                        if (C3019.f9544 >= 0) {
                                            iM6987 = C0630.m2566("۫᩵") ^ i33;
                                            i34 = ((iM6987 ^ i32) * (-20593)) ^ (-227916227);
                                            i35 = 11523142;
                                        } else {
                                            iM6987 = (C2105.m6981("ۘܽ") ^ i32) * (-125);
                                            i34 = ((iM6987 ^ i33) * (-1561)) ^ (-836516437);
                                            i35 = 717256257;
                                        }
                                        break;
                                    case -467920976:
                                    case 302245088:
                                        C0798.m2998();
                                        break;
                                    case -347941789:
                                    case 193622100:
                                        if (AbstractC2021.f6743 <= 0) {
                                            iM6987 = C2105.m6981("᩵ۘ") ^ i33;
                                            i34 = ((iM6987 ^ i32) * 14597) ^ (-1291233762);
                                            i35 = -1672493570;
                                        } else {
                                            iM6987 = C0630.m2566("ܿ֡") ^ i33;
                                            i34 = ((iM6987 ^ i32) * (-7611)) ^ (-930918206);
                                            i35 = -1876782734;
                                        }
                                        break;
                                    case -245215031:
                                    case 1078179788:
                                        dialogInterfaceC0207 = dialogInterfaceC0206;
                                        if (C0798.f2919) {
                                            iM6987 = C2105.m6981("᩵ۘ") ^ i33;
                                            i34 = ((iM6987 ^ i32) * 14597) ^ (-1291233762);
                                            i35 = -1672493570;
                                        } else {
                                            iM6987 = (i32 - C2105.m6981("ܽۗ")) * (-75);
                                            i34 = ((iM6987 ^ i33) * (-2095)) ^ (-517550836);
                                            i35 = 2100784066;
                                        }
                                        break;
                                    case 7042278:
                                    case 1131251867:
                                        if (C2272.f7362) {
                                            iM6987 = C0630.m2566("ۤ᩶") ^ i33;
                                            i34 = ((iM6987 ^ i32) * 5757) ^ 192032301;
                                            i35 = -870082771;
                                        } else {
                                            iM6987 = (i33 - C0630.m2566("֡᩻")) * 19;
                                            i34 = ((iM6987 ^ i32) * (-26229)) ^ 1458608991;
                                            i35 = 1383656215;
                                        }
                                        break;
                                    case 638957264:
                                    case 1542434383:
                                        if (C0050.f910 >= 0) {
                                            iM6987 = C2105.m6981("᩵ۘ") ^ i33;
                                            i34 = ((iM6987 ^ i32) * 14597) ^ (-1291233762);
                                            i35 = -1672493570;
                                        } else {
                                            iM6987 = C0630.m2566("ܳۘ") ^ i33;
                                            i34 = ((iM6987 ^ i32) * (-16693)) ^ (-1742266137);
                                            i35 = -2050651060;
                                        }
                                        break;
                                    default:
                                        RunnableC1937.m6387();
                                        iM6987 = C2105.m6981("᩵ۘ") ^ i33;
                                        i34 = ((iM6987 ^ i32) * 14597) ^ (-1291233762);
                                        i35 = -1672493570;
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr3 = f59290;
                    if (!C1005.f3721) {
                        int iM6987 = C2105.m6981("ܳۡ") ^ i8;
                        i10 = iM6987 ^ (-615891026);
                        i9 = ((iM6987 ^ i7) * 2355) ^ 2124106081;
                        c19258M5912 = c19258M5912;
                    } else {
                        int iM6988 = (i7 - C2105.m6981("ܺܽ")) * (-79);
                        iM2569 = iM2569;
                        i3 = ((iM6988 ^ i8) * 17651) ^ (-2141652909);
                        i10 = iM6988 ^ 1867329000;
                        i9 = i3;
                        iM2569 = iM2569;
                    }
                    break;
                case 1523974109:
                case 1950510987:
                    C3663.m11168();
                    if (C4159.m12565() < 0) {
                        iM2569 = iM2569;
                        onClickListener3 = onClickListener3;
                        iM2567 = (i7 - C2105.m6981("᩵ᩳ")) * (-89);
                        i3 = ((iM2567 ^ i8) * (-20873)) ^ 1083257765;
                        i4 = -408116006;
                        int i213 = iM2567 ^ i4;
                        onClickListener3 = onClickListener3;
                        i10 = i213;
                        i9 = i3;
                        iM2569 = iM2569;
                    } else {
                        iM2566 = (C0630.m2566("᩶ۛ") + i8) * 97;
                        onClickListener = onClickListener3;
                        i = ((iM2566 ^ i7) * (-7339)) ^ 688488788;
                        i2 = 1293644259;
                        DialogInterface.OnClickListener onClickListener8 = onClickListener;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                        onClickListener3 = onClickListener8;
                    }
                    break;
                case 1830682767:
                case 1872503859:
                    iM2569 = iM2569;
                    onClickListener3 = onClickListener3;
                    short s3 = s2;
                    if (C7811.f24123 >= 0) {
                        s2 = s3;
                        onClickListener3 = onClickListener3;
                        iM2569 = iM2569;
                        int iM6989 = C2105.m6981("ܳۡ") ^ i8;
                        i10 = iM6989 ^ (-615891026);
                        i9 = ((iM6989 ^ i7) * 2355) ^ 2124106081;
                    } else {
                        int iM25614 = C0630.m2566("ۗۡ") ^ i7;
                        s2 = s3;
                        i9 = ((iM25614 ^ i8) * 10617) ^ (-761913856);
                        onClickListener3 = onClickListener3;
                        iM2569 = iM2569;
                        i10 = iM25614 ^ 520666794;
                    }
                    c19258M5912 = c19258M5912;
                    break;
                default:
                    C21923.m49329();
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43439(C18781 c18781, C13876 c13876, Main main, C11667 c11667, boolean z) {
        int iM2566;
        int i;
        short[] sArr;
        int i2;
        C18781 c18782 = c18781;
        int i3 = AbstractC2021.f6743;
        int i4 = C3683.f11629;
        int iM2567 = C0630.m2566("۫᩹") ^ i4;
        int i5 = ((iM2567 ^ i3) * 7173) ^ 431996311;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2567 ^ 1745059671;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        char c = 0;
        int i10 = -91701801;
        int i11 = 0;
        short[] sArr4 = null;
        String strM3502 = null;
        String strM12359 = null;
        AbstractC15440 abstractC15440 = null;
        String[] strArr = null;
        Object[] array = null;
        HashSet hashSetM33269 = null;
        C0994 c0994 = null;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i3) * 25319) >> 31));
            switch (i10) {
                case -2022493580:
                case -1669540108:
                    C3911.m11924();
                    C2520.m8026();
                    int iM2568 = C0630.m2566("ۗۤ") ^ i4;
                    i6 = iM2568 ^ 1024982066;
                    i5 = ((iM2568 ^ i3) * 24523) ^ 652836302;
                    break;
                case -1946005892:
                case 1357369062:
                    abstractC15440 = abstractC15440;
                    sArr3 = sArr3;
                    s = sArr4[c];
                    i11 = (s * s) + 7645225;
                    if (C1420.f5096 <= 0) {
                        iM2566 = C0630.m2566("ۛۤ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 24617) ^ 169908895;
                        i = -891911650;
                    } else {
                        iM2566 = C0630.m2566("ۚ᩵") ^ i3;
                        i5 = ((iM2566 ^ i4) * 24333) ^ 2113762077;
                        i = 1279355428;
                    }
                    i2 = iM2566 ^ i;
                    sArr3 = sArr3;
                    abstractC15440 = abstractC15440;
                    i6 = i2;
                    c18782 = c18781;
                    break;
                case -1837033588:
                case -1200999054:
                    C0483.m2121();
                    if (C4075.f12947 < 0) {
                        abstractC15440 = abstractC15440;
                        sArr3 = sArr3;
                        iM2566 = C0630.m2566("ۛۤ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 24617) ^ 169908895;
                        i = -891911650;
                        i2 = iM2566 ^ i;
                        sArr3 = sArr3;
                        abstractC15440 = abstractC15440;
                        i6 = i2;
                        c18782 = c18781;
                    } else {
                        int iM2569 = C0630.m2566("ۗۤ") ^ i4;
                        i6 = iM2569 ^ 1024982066;
                        i5 = ((iM2569 ^ i3) * 24523) ^ 652836302;
                    }
                    break;
                case -1669050796:
                case -1367258301:
                    abstractC15440 = abstractC15440;
                    sArr3 = sArr3;
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("ᩴ֨") ^ i4;
                        i5 = ((iM2566 ^ i3) * 20373) ^ 1150228176;
                        i = -903074301;
                    } else {
                        iM2566 = (C0630.m2566("᩺ܽ") + i4) * (-103);
                        i5 = ((iM2566 ^ i3) * 11463) ^ 1648499480;
                        i = -976251150;
                    }
                    i2 = iM2566 ^ i;
                    sArr3 = sArr3;
                    abstractC15440 = abstractC15440;
                    i6 = i2;
                    c18782 = c18781;
                    break;
                case -1383326592:
                case 654682329:
                    sArr = sArr3;
                    strM12359 = C4117.m12359(abstractC15440);
                    AbstractC15440 abstractC15441 = abstractC15440;
                    strM3502 = C1005.m3502(f59290, 44, 4, i8);
                    if (C5695.m16023() >= 0) {
                        abstractC15440 = abstractC15441;
                        int iM25610 = C0630.m2566("ۤᩳ") ^ i3;
                        sArr3 = sArr;
                        i6 = iM25610 ^ 490408228;
                        i5 = ((iM25610 ^ i4) * 8773) ^ (-1922682813);
                        c18782 = c18781;
                    } else {
                        int iM25611 = C0630.m2566("ᩴۛ") ^ i4;
                        sArr3 = sArr;
                        i6 = iM25611 ^ (-1076161473);
                        i5 = ((iM25611 ^ i3) * (-10939)) ^ 1160742475;
                        abstractC15440 = abstractC15441;
                    }
                    break;
                case -1381698511:
                case -497845394:
                    abstractC15440 = abstractC15440;
                    sArr3 = sArr3;
                    strArr = (String[]) array;
                    sArr2 = f59290;
                    i9 = 39;
                    i7 = 5;
                    if (AbstractC2021.m6574()) {
                        iM2566 = C0630.m2566("ᩴ֨") ^ i4;
                        i5 = ((iM2566 ^ i3) * 20373) ^ 1150228176;
                        i = -903074301;
                    } else {
                        iM2566 = C2105.m6981("ܶ֨") ^ i4;
                        i5 = ((iM2566 ^ i3) * 25615) ^ (-194455221);
                        i = 701333628;
                    }
                    i2 = iM2566 ^ i;
                    sArr3 = sArr3;
                    abstractC15440 = abstractC15440;
                    i6 = i2;
                    c18782 = c18781;
                    break;
                case -969947288:
                case 1051252314:
                    if (C1294.f4556 >= 0) {
                        abstractC15440 = abstractC15440;
                        sArr3 = sArr3;
                        iM2566 = C2105.m6981("ܶ᩻") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-21439)) ^ 76321237;
                        i = 1290604186;
                        i2 = iM2566 ^ i;
                        sArr3 = sArr3;
                        abstractC15440 = abstractC15440;
                        i6 = i2;
                        c18782 = c18781;
                    } else {
                        int iM25612 = C0630.m2566("ۗۤ") ^ i4;
                        i6 = iM25612 ^ 1024982066;
                        i5 = ((iM25612 ^ i3) * 24523) ^ 652836302;
                    }
                    break;
                case -913250510:
                case 1798896157:
                    C3911.m11924();
                    break;
                case -845137450:
                case 591700944:
                    i8 = 48940;
                    iM2566 = (i3 - C2105.m6981("֫ܶ")) * (-3);
                    i5 = ((iM2566 ^ i4) * (-919)) ^ (-1403364185);
                    i = -634688028;
                    i2 = iM2566 ^ i;
                    sArr3 = sArr3;
                    abstractC15440 = abstractC15440;
                    i6 = i2;
                    c18782 = c18781;
                    break;
                case -582310749:
                case 2126415756:
                    sArr = sArr3;
                    c0994.m3477(RunnableC1937.m6385(sArr2, i9, i7, i8), strArr);
                    abstractC15440 = c18782.f59291;
                    if (C4263.f13799 <= 0) {
                        int iM25613 = C0630.m2566("ۤᩳ") ^ i3;
                        sArr3 = sArr;
                        i6 = iM25613 ^ 490408228;
                        i5 = ((iM25613 ^ i4) * 8773) ^ (-1922682813);
                    } else {
                        int iM25614 = C0630.m2566("֡ۘ") ^ i3;
                        i5 = ((iM25614 ^ i4) * (-23359)) ^ 887643552;
                        i2 = iM25614 ^ 1907331597;
                        sArr3 = sArr;
                        i6 = i2;
                    }
                    c18782 = c18781;
                    break;
                case -427684717:
                case 1264578357:
                    C1047.m3594(c0994, strM3502, strM12359);
                    c0994.m3472(main, c11667);
                    sArr3 = f59290;
                    if (C1128.m3851() <= 0) {
                        abstractC15440 = abstractC15440;
                        iM2566 = C0630.m2566("ۛۤ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 24617) ^ 169908895;
                        i = -891911650;
                        i2 = iM2566 ^ i;
                        sArr3 = sArr3;
                        abstractC15440 = abstractC15440;
                        i6 = i2;
                        c18782 = c18781;
                    } else {
                        int iM6981 = (C2105.m6981("ܺۜ") + i3) * (-11);
                        i5 = ((iM6981 ^ i4) * 19593) ^ (-1688620197);
                        sArr3 = sArr3;
                        i6 = iM6981 ^ 64531102;
                    }
                    break;
                case -309701338:
                case 640228316:
                    abstractC15440 = abstractC15440;
                    sArr3 = sArr3;
                    int i12 = C15104.f46193;
                    c0994 = new C0994(C3964.class);
                    hashSetM33269 = c13876.m33269();
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("ܶ᩻") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-21439)) ^ 76321237;
                        i = 1290604186;
                    } else {
                        iM2566 = (C2105.m6981("ۨ۫") + i4) * 65;
                        i5 = ((iM2566 ^ i3) * 5001) ^ 1721605499;
                        i = 796100618;
                    }
                    i2 = iM2566 ^ i;
                    sArr3 = sArr3;
                    abstractC15440 = abstractC15440;
                    i6 = i2;
                    c18782 = c18781;
                    break;
                case -13814361:
                case 1778446906:
                    i8 = 60763;
                    iM2566 = (i3 - C2105.m6981("֫ܶ")) * (-3);
                    i5 = ((iM2566 ^ i4) * (-919)) ^ (-1403364185);
                    i = -634688028;
                    i2 = iM2566 ^ i;
                    sArr3 = sArr3;
                    abstractC15440 = abstractC15440;
                    i6 = i2;
                    c18782 = c18781;
                    break;
                case 258634958:
                case 1267824296:
                    if (C0050.f910 >= 0) {
                        abstractC15440 = abstractC15440;
                        sArr3 = sArr3;
                        iM2566 = C0630.m2566("ᩴ֨") ^ i4;
                        i5 = ((iM2566 ^ i3) * 20373) ^ 1150228176;
                        i = -903074301;
                        i2 = iM2566 ^ i;
                        sArr3 = sArr3;
                        abstractC15440 = abstractC15440;
                        i6 = i2;
                        c18782 = c18781;
                    } else {
                        int iM25615 = C0630.m2566("ۗۤ") ^ i4;
                        i6 = iM25615 ^ 1024982066;
                        i5 = ((iM25615 ^ i3) * 24523) ^ 652836302;
                    }
                    break;
                case 325946378:
                case 969134842:
                    abstractC15440 = abstractC15440;
                    sArr3 = sArr3;
                    array = hashSetM33269.toArray(new String[0]);
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("ᩴ֨") ^ i4;
                        i5 = ((iM2566 ^ i3) * 20373) ^ 1150228176;
                        i = -903074301;
                    } else {
                        iM2566 = C0630.m2566("ܰ۟") ^ i3;
                        i5 = ((iM2566 ^ i4) * 24709) ^ 768939034;
                        i = -1258745534;
                    }
                    i2 = iM2566 ^ i;
                    sArr3 = sArr3;
                    abstractC15440 = abstractC15440;
                    i6 = i2;
                    c18782 = c18781;
                    break;
                case 451611516:
                case 1306668112:
                    abstractC15440 = abstractC15440;
                    sArr3 = sArr3;
                    if ((s * 5530) - i11 <= 0) {
                        iM2566 = C2105.m6981("᩵۬") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-29179)) ^ (-273305920);
                        i = 195678045;
                    } else {
                        iM2566 = C2105.m6981("֨ܰ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-30177)) ^ (-1674344996);
                        i = -675031883;
                    }
                    i2 = iM2566 ^ i;
                    sArr3 = sArr3;
                    abstractC15440 = abstractC15440;
                    i6 = i2;
                    c18782 = c18781;
                    break;
                case 470026618:
                case 1439639598:
                    c0994.m3480(c18782.f59293);
                    c0994.m3469();
                    break;
                case 1165574967:
                case 1954499592:
                    C3911.m11930(c0994, C0798.m3005(sArr3, 48, 15, i8), z);
                    if (C1504.f5354) {
                        abstractC15440 = abstractC15440;
                        sArr3 = sArr3;
                        iM2566 = C2105.m6981("ܶ᩻") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-21439)) ^ 76321237;
                        i = 1290604186;
                        i2 = iM2566 ^ i;
                        sArr3 = sArr3;
                        abstractC15440 = abstractC15440;
                        i6 = i2;
                        c18782 = c18781;
                    } else {
                        int iM6982 = C2105.m6981("᩹ᩴ") ^ i3;
                        i6 = iM6982 ^ 57075894;
                        i5 = ((iM6982 ^ i4) * (-22291)) ^ 500957189;
                        sArr3 = sArr3;
                    }
                    break;
                default:
                    abstractC15440 = abstractC15440;
                    sArr3 = sArr3;
                    sArr4 = f59290;
                    c = '&';
                    if (C4616.f14690 <= 0) {
                        iM2566 = C2105.m6981("ܶ᩻") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-21439)) ^ 76321237;
                        i = 1290604186;
                    } else {
                        iM2566 = C2105.m6981("ۜᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-7767)) ^ 1433694587;
                        i = -626512152;
                    }
                    i2 = iM2566 ^ i;
                    sArr3 = sArr3;
                    abstractC15440 = abstractC15440;
                    i6 = i2;
                    c18782 = c18781;
                    break;
            }
            return;
        }
    }
}
