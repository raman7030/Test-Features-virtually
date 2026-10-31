package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC7388 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22737;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22738;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22739;

    public /* synthetic */ DialogInterfaceOnClickListenerC7388(int i, Object obj, Object obj2) {
        int i2 = -1493491963;
        int i3 = C11340.f33930;
        int i4 = C1047.f3863;
        this.f22738 = i;
        this.f22739 = obj;
        this.f22737 = obj2;
        int iM6981 = (i3 - C2105.m6981("ۜۢ")) * 83;
        int i5 = ((iM6981 ^ i4) * (-6165)) ^ 1104244309;
        int i6 = -1424065451;
        while (true) {
            i2 = (iM6981 ^ i6) ^ (i5 & (((i2 ^ i4) * (-11557)) >> 31));
            switch (i2) {
                case -2129946769:
                case 1983875522:
                    C1128.m3851();
                    C3432.m10477();
                    break;
                case -2042635690:
                case -800626906:
                    return;
                case -1971732838:
                case 187027399:
                    if (!C3663.f11553) {
                        iM6981 = (i4 - C0630.m2566("᩷ۙ")) * (-103);
                        i5 = ((iM6981 ^ i3) * 6559) ^ 2050231232;
                        i6 = 1614619533;
                    }
                    break;
                case -1871904246:
                case 952336851:
                    if (C1005.f3721) {
                        iM6981 = C2105.m6981("ۘ᩶") ^ i4;
                        i5 = ((iM6981 ^ i3) * 4983) ^ (-930386478);
                        i6 = -1461572710;
                    }
                    break;
                case -143184837:
                case 1652420695:
                    if (C1773.f6144 <= 0) {
                        iM6981 = (i3 - C0630.m2566("᩵ۢ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM6981 ^ i4) * (-20717)) ^ 240511119;
                        i6 = 1705309041;
                    } else {
                        iM6981 = (C0630.m2566("ۜ۫") + i3) * 45;
                        i5 = ((iM6981 ^ i4) * (-3091)) ^ (-142574530);
                        i6 = -1681384823;
                        continue;
                    }
                    break;
                case 630898797:
                case 1201794786:
                    if (C3019.m9255() <= 0) {
                        iM6981 = (C0630.m2566("᩺ᩴ") + i3) * 37;
                        i5 = ((iM6981 ^ i4) * 17805) ^ (-1806549786);
                        i6 = 552313236;
                    }
                    break;
                default:
                    C4075.m12263();
                    throw new RuntimeException();
            }
            iM6981 = (C2105.m6981("ۡܺ") ^ i4) * (-79);
            i5 = ((iM6981 ^ i3) * 5793) ^ (-1447150794);
            i6 = 77767544;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0176 A[PHI: r4 r18
      0x0176: PHI (r4v5 l.᩵ۙ᩷) = (r4v2 l.᩵ۙ᩷), (r4v4 l.᩵ۙ᩷), (r4v2 l.᩵ۙ᩷), (r4v2 l.᩵ۙ᩷) binds: [B:129:0x0176, B:46:0x0174, B:13:0x0082, B:7:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r18v5 java.lang.Object) = (r18v2 java.lang.Object), (r18v3 java.lang.Object), (r18v2 java.lang.Object), (r18v2 java.lang.Object) binds: [B:129:0x0176, B:46:0x0174, B:13:0x0082, B:7:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x023f A[PHI: r12 r13 r14
      0x023f: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:64:0x023d, B:60:0x021d, B:15:0x0086, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:64:0x023d, B:60:0x021d, B:15:0x0086, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r14v4 java.util.ArrayList) = (r14v2 java.util.ArrayList), (r14v3 java.util.ArrayList), (r14v2 java.util.ArrayList), (r14v2 java.util.ArrayList) binds: [B:64:0x023d, B:60:0x021d, B:15:0x0086, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02b1 A[PHI: r25
      0x02b1: PHI (r25v6 l.ᩴܶܳ) = (r25v5 l.ᩴܶܳ), (r25v3 l.ᩴܶܳ) binds: [B:72:0x02af, B:7:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int iM2566;
        int i2;
        int i3;
        int iM2567;
        int i4;
        int iM6981;
        int i5;
        int i6 = i;
        int i7 = C11340.f33930;
        int i8 = C4117.f13076;
        int iM2568 = (i8 - C0630.m2566("ۛܳ")) * 73;
        int i9 = ((iM2568 ^ i7) * (-30101)) ^ (-1399863589);
        Object obj = null;
        C18841 c18841 = null;
        C3318 c3318 = null;
        Main mainM49336 = null;
        Intent intent = null;
        int i10 = iM2568 ^ (-380610380);
        int bindingAdapterPosition = 0;
        int i11 = 0;
        int i12 = -1561660130;
        int iM10143 = 0;
        C19547 c19547 = null;
        Object obj2 = null;
        Object obj3 = null;
        InterfaceC17889 interfaceC17889 = null;
        C19246 c19246 = null;
        C16560 c16560 = null;
        Object obj4 = null;
        C10738 c10738 = null;
        ArrayList arrayList = null;
        int i13 = 0;
        while (true) {
            i12 = i10 ^ (i9 & (((i12 ^ i7) * (-13535)) >> 31));
            switch (i12) {
                case -2137918817:
                case 2090614893:
                    C4075.m12261(mainM49336, intent);
                    C9340.m24035(interfaceC17889, 2000);
                    iM2566 = (C2105.m6981("ۜۙ") ^ i8) * 19;
                    i2 = ((iM2566 ^ i7) * 13769) ^ (-805735649);
                    i3 = 592894629;
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case -2005557573:
                case 1041998449:
                    C10738.m26926(c10738, (ArrayList) obj4);
                    break;
                case -1997140643:
                case 763769117:
                    arrayList.remove(i13);
                    C9068.m23422().m18782(i13);
                    if (C3432.m10481(arrayList) > 0) {
                        iM2566 = (C2105.m6981("ۧ᩺") + i7) * (-81);
                        i2 = ((iM2566 ^ i8) * 7715) ^ 515609858;
                        i3 = -1107775758;
                    } else {
                        iM2566 = (C0630.m2566("᩹ۙ") ^ i8) * 93;
                        i2 = ((iM2566 ^ i7) * (-28985)) ^ (-346929828);
                        i3 = -1200085055;
                    }
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case -1883281281:
                case -727637071:
                    C1294.m4372();
                    C4263.m12819();
                    break;
                case -1734030335:
                case 1450060435:
                    switch (this.f22738) {
                        case 0:
                            iM6981 = (i7 - C2105.m6981("ܽۜ")) * 65;
                            i9 = ((iM6981 ^ i8) * (-10635)) ^ 1823409905;
                            i5 = -1529336980;
                            break;
                        case 1:
                            iM6981 = (i8 - C0630.m2566("ۜ᩷")) * (-85);
                            i9 = ((iM6981 ^ i7) * (-2019)) ^ 734939123;
                            i5 = 1273127031;
                            break;
                        case 2:
                            iM6981 = (C0630.m2566("ۚᩴ") + i7) * 47;
                            i9 = ((iM6981 ^ i8) * (-23831)) ^ 456929329;
                            i5 = -1336439738;
                            break;
                        default:
                            iM6981 = (C2105.m6981("ۢۤ") ^ i8) * 39;
                            i9 = ((iM6981 ^ i7) * (-24163)) ^ (-623567140);
                            i5 = 983742135;
                            break;
                    }
                    i10 = iM6981 ^ i5;
                    i6 = i;
                    break;
                case -1725720540:
                case -510656452:
                    if (i6 != 2) {
                        iM2566 = (C2105.m6981("ۜۙ") ^ i8) * 19;
                        i2 = ((iM2566 ^ i7) * 13769) ^ (-805735649);
                        i3 = 592894629;
                    } else {
                        iM2566 = (i7 - C2105.m6981("֫ۡ")) * (-125);
                        i2 = ((iM2566 ^ i8) * (-17975)) ^ 2091616119;
                        i3 = 817799250;
                    }
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case -1649721128:
                case 1690135283:
                    c19547 = (C19547) this.f22739;
                    Object obj5 = this.f22737;
                    if (C7811.f24123 < 0) {
                        iM2567 = (C2105.m6981("ܰ۟") + i7) * 91;
                        obj = obj5;
                        i9 = ((iM2567 ^ i8) * (-17603)) ^ (-1815460986);
                        i4 = -540212762;
                        i10 = iM2567 ^ i4;
                    } else {
                        obj = obj5;
                        int iM2569 = (C0630.m2566("֫ܿ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i10 = iM2569 ^ 1747323074;
                        i9 = ((iM2569 ^ i8) * 8705) ^ 1473038989;
                        intent = null;
                    }
                    break;
                case -1534481813:
                case -432376841:
                    C19568.m45007(c16560, interfaceC17889, ActivityC16315.class);
                    iM2566 = (C2105.m6981("ۜۙ") ^ i8) * 19;
                    i2 = ((iM2566 ^ i7) * 13769) ^ (-805735649);
                    i3 = 592894629;
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case -1266641297:
                case 933455903:
                    c18841 = (C18841) obj;
                    AbstractC2021.m6565(c19547);
                    if (C1420.f5096 <= 0) {
                        iM2566 = (i8 - C2105.m6981("ܺۨ")) * (-81);
                        i2 = ((iM2566 ^ i7) * 1519) ^ 1535673759;
                        i3 = 1836993091;
                    } else {
                        iM2566 = C2105.m6981("᩸ۘ") ^ i7;
                        i2 = ((iM2566 ^ i8) * (-21897)) ^ 1943692230;
                        i3 = -1514162198;
                    }
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case -1266423190:
                case 1467834016:
                    mainM49336 = C21923.m49336(c16560);
                    if (C4616.f14690 > 0) {
                        intent = new Intent(mainM49336, (Class<?>) ActivityC23269.class);
                        if (C4616.f14690 > 0) {
                            iM2566 = (C0630.m2566("۬ܽ") + i8) * 101;
                            i2 = ((iM2566 ^ i7) * 3309) ^ 17145446;
                            i3 = -1116703289;
                            i10 = iM2566 ^ i3;
                            i9 = i2;
                            break;
                        }
                    }
                    int iM25610 = (C0630.m2566("֫ܿ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i10 = iM25610 ^ 1747323074;
                    i9 = ((iM25610 ^ i8) * 8705) ^ 1473038989;
                    intent = null;
                    break;
                case -1152856963:
                case -978758590:
                    C2272.m7514(c16560, interfaceC17889, new C17951(c16560));
                    iM2566 = (C2105.m6981("ۜۙ") ^ i8) * 19;
                    i2 = ((iM2566 ^ i7) * 13769) ^ (-805735649);
                    i3 = 592894629;
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case -1148574838:
                case -329523829:
                    if (i6 != 1) {
                        iM2566 = C0630.m2566("ᩳۢ") ^ i8;
                        i2 = ((iM2566 ^ i7) * (-15679)) ^ 852244044;
                        i3 = -806799284;
                    } else {
                        iM2566 = C2105.m6981("۬ܰ") ^ i7;
                        i2 = ((iM2566 ^ i8) * 17311) ^ (-1883086435);
                        i3 = 839944463;
                    }
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case -1065254325:
                case 34306644:
                    c19246 = (C19246) this.f22739;
                    Object obj6 = this.f22737;
                    if (C1294.f4556 < 0) {
                        iM2567 = C2105.m6981("ۖ֫") ^ i7;
                        obj2 = obj6;
                        i9 = ((iM2567 ^ i8) * (-18697)) ^ (-1482097177);
                        i4 = -1467679478;
                        i10 = iM2567 ^ i4;
                    } else {
                        obj2 = obj6;
                        iM2566 = (C0630.m2566("۠ۢ") + i7) * 79;
                        i2 = ((iM2566 ^ i8) * (-29775)) ^ (-785917185);
                        i3 = 743179500;
                        i10 = iM2566 ^ i3;
                        i9 = i2;
                    }
                    break;
                case -997797180:
                case 1426719950:
                    C4263.m12819();
                    C7811.m20844();
                    iM2566 = C2105.m6981("ۖۛ") ^ i8;
                    i2 = ((iM2566 ^ i7) * 2515) ^ (-1156658252);
                    i3 = -646567907;
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case -862001482:
                case 1404647819:
                    break;
                case -803485438:
                case 1286843594:
                    arrayList = c19547.f37525;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C2105.m6981("ۖۛ") ^ i8;
                        i2 = ((iM2566 ^ i7) * 2515) ^ (-1156658252);
                        i3 = -646567907;
                    } else {
                        iM2566 = C0630.m2566("֨ܿ") ^ i7;
                        i2 = ((iM2566 ^ i8) * (-25033)) ^ (-1845691436);
                        i3 = 1557961974;
                    }
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case -640295247:
                case -374997035:
                    i11 = 1;
                    i13 = (bindingAdapterPosition - iM10143) - 1;
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("ۖۛ") ^ i8;
                        i2 = ((iM2566 ^ i7) * 2515) ^ (-1156658252);
                        i3 = -646567907;
                    } else {
                        iM2566 = (C2105.m6981("ۙ۠") ^ i8) * 41;
                        i2 = ((iM2566 ^ i7) * 8489) ^ (-573464108);
                        i3 = -1433874102;
                    }
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case -616454064:
                case -226023591:
                    interfaceC17889 = (InterfaceC17889) obj3;
                    dialogInterface.dismiss();
                    if (i6 != 0) {
                        iM2566 = C0630.m2566("ܰᩳ") ^ i8;
                        i2 = ((iM2566 ^ i7) * (-4873)) ^ (-801672599);
                        i3 = -1164788113;
                    } else {
                        iM2566 = C0630.m2566("ܺۚ") ^ i7;
                        i2 = ((iM2566 ^ i8) * (-24915)) ^ 343811104;
                        i3 = 293836190;
                    }
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case -419338188:
                case 116622766:
                    C22628.m50615();
                    if (C3683.f11629 < 0) {
                        int iM25611 = (C0630.m2566("֫ܿ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i10 = iM25611 ^ 1747323074;
                        i9 = ((iM25611 ^ i8) * 8705) ^ 1473038989;
                        intent = null;
                    } else {
                        iM2566 = (C0630.m2566("۠ۢ") + i7) * 79;
                        i2 = ((iM2566 ^ i8) * (-29775)) ^ (-785917185);
                        i3 = 743179500;
                        i10 = iM2566 ^ i3;
                        i9 = i2;
                    }
                    break;
                case -266310936:
                case 543493234:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("ۖۛ") ^ i8;
                        i2 = ((iM2566 ^ i7) * 2515) ^ (-1156658252);
                        i3 = -646567907;
                    } else {
                        iM2566 = (C0630.m2566("۠ۢ") + i7) * 79;
                        i2 = ((iM2566 ^ i8) * (-29775)) ^ (-785917185);
                        i3 = 743179500;
                    }
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case 210598152:
                case 1136558668:
                    c10738 = (C10738) this.f22739;
                    Object obj7 = this.f22737;
                    if (C1294.m4372() > 0) {
                        iM2567 = (i8 - C0630.m2566("ۙ֡")) * (-127);
                        obj4 = obj7;
                        i9 = ((iM2567 ^ i7) * 5659) ^ 225417371;
                        i4 = 2048786308;
                        i10 = iM2567 ^ i4;
                    } else {
                        obj4 = obj7;
                        iM2566 = (C0630.m2566("ۧᩳ") ^ i7) * (-77);
                        i2 = ((iM2566 ^ i8) * 551) ^ 1646741590;
                        i3 = 1421465089;
                        i10 = iM2566 ^ i3;
                        i9 = i2;
                    }
                    break;
                case 556902374:
                case 2074405617:
                    C0237.m1481();
                    if (C1294.m4372() <= 0) {
                        iM2566 = (C0630.m2566("۠ۢ") + i7) * 79;
                        i2 = ((iM2566 ^ i8) * (-29775)) ^ (-785917185);
                        i3 = 743179500;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ܺۨ")) * (-81);
                        i2 = ((iM2566 ^ i7) * 1519) ^ 1535673759;
                        i3 = 1836993091;
                    }
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case 1109090617:
                case 2076118333:
                    C19547.f63205.mo1664(Object.class);
                    break;
                case 1434420166:
                case 2091778979:
                    C19246.m44376(c19246, (boolean[]) obj2);
                    break;
                case 1671769939:
                case 2054479747:
                    c3318.notifyItemRangeRemoved(bindingAdapterPosition, i11);
                    iM2566 = C2105.m6981("ۢۢ") ^ i7;
                    i2 = ((iM2566 ^ i8) * (-31765)) ^ 643205389;
                    i3 = -1775134139;
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case 1800053981:
                case 1905699766:
                    bindingAdapterPosition = c18841.getBindingAdapterPosition();
                    c3318 = c19547.f37526;
                    iM10143 = c3318.m10143(c19547);
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C0630.m2566("ۧᩳ") ^ i7) * (-77);
                        i2 = ((iM2566 ^ i8) * 551) ^ 1646741590;
                        i3 = 1421465089;
                    } else {
                        iM2566 = C2105.m6981("֨۫") ^ i8;
                        i2 = ((iM2566 ^ i7) * (-10955)) ^ (-965473572);
                        i3 = -1083387087;
                    }
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
                case 1805547970:
                case 2057376849:
                    c16560 = (C16560) this.f22739;
                    Object obj8 = this.f22737;
                    if (C3019.f9544 < 0) {
                        int iM6982 = (C2105.m6981("ۙܰ") ^ i8) * 59;
                        i10 = iM6982 ^ (-219869783);
                        obj3 = obj8;
                        i9 = ((iM6982 ^ i7) * (-17145)) ^ (-610438243);
                        i6 = i;
                    } else {
                        obj3 = obj8;
                        int iM25612 = (C0630.m2566("֫ܿ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i10 = iM25612 ^ 1747323074;
                        i9 = ((iM25612 ^ i8) * 8705) ^ 1473038989;
                        intent = null;
                    }
                    break;
                default:
                    c3318.notifyItemRangeRemoved(bindingAdapterPosition - i11, 2);
                    iM2566 = C2105.m6981("ۢۢ") ^ i7;
                    i2 = ((iM2566 ^ i8) * (-31765)) ^ 643205389;
                    i3 = -1775134139;
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    break;
            }
            return;
        }
    }
}
