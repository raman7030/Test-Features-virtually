package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.p000mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC9390 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f25649;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f25650;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f25651;

    public /* synthetic */ DialogInterfaceOnClickListenerC9390(int i, Object obj, Object obj2) {
        int i2 = -1493491963;
        int i3 = C1404.f82149;
        int i4 = C0894.f81854;
        this.f25650 = i;
        this.f25651 = obj;
        this.f25649 = obj2;
        int iM55979 = (i3 - C0946.m55979("ۜۢ")) * 83;
        int i5 = ((iM55979 ^ i4) * (-6165)) ^ 1104244309;
        int i6 = -1424065451;
        while (true) {
            i2 = (iM55979 ^ i6) ^ (i5 & (((i2 ^ i4) * (-11557)) >> 31));
            switch (i2) {
                case -2129946769:
                case 1983875522:
                    C0898.m55800();
                    C1012.m56134();
                    break;
                case -2042635690:
                case -800626906:
                    return;
                case -1971732838:
                case 187027399:
                    if (!C1024.f81946) {
                        iM55979 = (i4 - C0873.m55680("᩷ۙ")) * (-103);
                        i5 = ((iM55979 ^ i3) * 6559) ^ 2050231232;
                        i6 = 1614619533;
                    }
                    break;
                case -1871904246:
                case 952336851:
                    if (C0892.f81851) {
                        iM55979 = C0946.m55979("ۘ᩶") ^ i4;
                        i5 = ((iM55979 ^ i3) * 4983) ^ (-930386478);
                        i6 = -1461572710;
                    }
                    break;
                case -143184837:
                case 1652420695:
                    if (C0930.f81879 <= 0) {
                        iM55979 = (i3 - C0873.m55680("᩵ۢ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM55979 ^ i4) * (-20717)) ^ 240511119;
                        i6 = 1705309041;
                    } else {
                        iM55979 = (C0873.m55680("ۜ۫") + i3) * 45;
                        i5 = ((iM55979 ^ i4) * (-3091)) ^ (-142574530);
                        i6 = -1681384823;
                        continue;
                    }
                    break;
                case 630898797:
                case 1201794786:
                    if (C0992.m56107() <= 0) {
                        iM55979 = (C0873.m55680("᩺ᩴ") + i3) * 37;
                        i5 = ((iM55979 ^ i4) * 17805) ^ (-1806549786);
                        i6 = 552313236;
                    }
                    break;
                default:
                    C1044.m56286();
                    throw new RuntimeException();
            }
            iM55979 = (C0946.m55979("ۡܺ") ^ i4) * (-79);
            i5 = ((iM55979 ^ i3) * 5793) ^ (-1447150794);
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
        int iM55680;
        int i2;
        int i3;
        int iM55681;
        int i4;
        int iM55979;
        int i5;
        int i6 = i;
        int i7 = C1404.f82149;
        int i8 = C1046.f81962;
        int iM55682 = (i8 - C0873.m55680("ۛܳ")) * 73;
        int i9 = ((iM55682 ^ i7) * (-30101)) ^ (-1399863589);
        Object obj = null;
        C20275 c20275 = null;
        C5522 c5522 = null;
        Main mainM56560 = null;
        Intent intent = null;
        int i10 = iM55682 ^ (-380610380);
        int bindingAdapterPosition = 0;
        int i11 = 0;
        int i12 = -1561660130;
        int iM12179 = 0;
        C20946 c20946 = null;
        Object obj2 = null;
        Object obj3 = null;
        InterfaceC19370 interfaceC19370 = null;
        C20660 c20660 = null;
        C18107 c18107 = null;
        Object obj4 = null;
        C12574 c12574 = null;
        ArrayList arrayList = null;
        int i13 = 0;
        while (true) {
            i12 = i10 ^ (i9 & (((i12 ^ i7) * (-13535)) >> 31));
            switch (i12) {
                case -2137918817:
                case 2090614893:
                    C1044.m56284(mainM56560, intent);
                    C11245.m26044(interfaceC19370, 2000);
                    iM55680 = (C0946.m55979("ۜۙ") ^ i8) * 19;
                    i2 = ((iM55680 ^ i7) * 13769) ^ (-805735649);
                    i3 = 592894629;
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case -2005557573:
                case 1041998449:
                    C12574.m28970(c12574, (ArrayList) obj4);
                    break;
                case -1997140643:
                case 763769117:
                    arrayList.remove(i13);
                    C10987.m25368().m20736(i13);
                    if (C1012.m56137(arrayList) > 0) {
                        iM55680 = (C0946.m55979("ۧ᩺") + i7) * (-81);
                        i2 = ((iM55680 ^ i8) * 7715) ^ 515609858;
                        i3 = -1107775758;
                    } else {
                        iM55680 = (C0873.m55680("᩹ۙ") ^ i8) * 93;
                        i2 = ((iM55680 ^ i7) * (-28985)) ^ (-346929828);
                        i3 = -1200085055;
                    }
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case -1883281281:
                case -727637071:
                    C0906.m55809();
                    C1053.m56327();
                    break;
                case -1734030335:
                case 1450060435:
                    switch (this.f25650) {
                        case 0:
                            iM55979 = (i7 - C0946.m55979("ܽۜ")) * 65;
                            i9 = ((iM55979 ^ i8) * (-10635)) ^ 1823409905;
                            i5 = -1529336980;
                            break;
                        case 1:
                            iM55979 = (i8 - C0873.m55680("ۜ᩷")) * (-85);
                            i9 = ((iM55979 ^ i7) * (-2019)) ^ 734939123;
                            i5 = 1273127031;
                            break;
                        case 2:
                            iM55979 = (C0873.m55680("ۚᩴ") + i7) * 47;
                            i9 = ((iM55979 ^ i8) * (-23831)) ^ 456929329;
                            i5 = -1336439738;
                            break;
                        default:
                            iM55979 = (C0946.m55979("ۢۤ") ^ i8) * 39;
                            i9 = ((iM55979 ^ i7) * (-24163)) ^ (-623567140);
                            i5 = 983742135;
                            break;
                    }
                    i10 = iM55979 ^ i5;
                    i6 = i;
                    break;
                case -1725720540:
                case -510656452:
                    if (i6 != 2) {
                        iM55680 = (C0946.m55979("ۜۙ") ^ i8) * 19;
                        i2 = ((iM55680 ^ i7) * 13769) ^ (-805735649);
                        i3 = 592894629;
                    } else {
                        iM55680 = (i7 - C0946.m55979("֫ۡ")) * (-125);
                        i2 = ((iM55680 ^ i8) * (-17975)) ^ 2091616119;
                        i3 = 817799250;
                    }
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case -1649721128:
                case 1690135283:
                    c20946 = (C20946) this.f25651;
                    Object obj5 = this.f25649;
                    if (C1229.f82066 < 0) {
                        iM55681 = (C0946.m55979("ܰ۟") + i7) * 91;
                        obj = obj5;
                        i9 = ((iM55681 ^ i8) * (-17603)) ^ (-1815460986);
                        i4 = -540212762;
                        i10 = iM55681 ^ i4;
                    } else {
                        obj = obj5;
                        int iM55683 = (C0873.m55680("֫ܿ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i10 = iM55683 ^ 1747323074;
                        i9 = ((iM55683 ^ i8) * 8705) ^ 1473038989;
                        intent = null;
                    }
                    break;
                case -1534481813:
                case -432376841:
                    C20966.m47302(c18107, interfaceC19370, ActivityC17874.class);
                    iM55680 = (C0946.m55979("ۜۙ") ^ i8) * 19;
                    i2 = ((iM55680 ^ i7) * 13769) ^ (-805735649);
                    i3 = 592894629;
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case -1266641297:
                case 933455903:
                    c20275 = (C20275) obj;
                    AbstractC0942.m55962(c20946);
                    if (C0912.f81867 <= 0) {
                        iM55680 = (i8 - C0946.m55979("ܺۨ")) * (-81);
                        i2 = ((iM55680 ^ i7) * 1519) ^ 1535673759;
                        i3 = 1836993091;
                    } else {
                        iM55680 = C0946.m55979("᩸ۘ") ^ i7;
                        i2 = ((iM55680 ^ i8) * (-21897)) ^ 1943692230;
                        i3 = -1514162198;
                    }
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case -1266423190:
                case 1467834016:
                    mainM56560 = C1929.m56560(c18107);
                    if (C1071.f81975 > 0) {
                        intent = new Intent(mainM56560, (Class<?>) ActivityC24484.class);
                        if (C1071.f81975 > 0) {
                            iM55680 = (C0873.m55680("۬ܽ") + i8) * 101;
                            i2 = ((iM55680 ^ i7) * 3309) ^ 17145446;
                            i3 = -1116703289;
                            i10 = iM55680 ^ i3;
                            i9 = i2;
                            break;
                        }
                    }
                    int iM55684 = (C0873.m55680("֫ܿ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i10 = iM55684 ^ 1747323074;
                    i9 = ((iM55684 ^ i8) * 8705) ^ 1473038989;
                    intent = null;
                    break;
                case -1152856963:
                case -978758590:
                    C0955.m56036(c18107, interfaceC19370, new C19429(c18107));
                    iM55680 = (C0946.m55979("ۜۙ") ^ i8) * 19;
                    i2 = ((iM55680 ^ i7) * 13769) ^ (-805735649);
                    i3 = 592894629;
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case -1148574838:
                case -329523829:
                    if (i6 != 1) {
                        iM55680 = C0873.m55680("ᩳۢ") ^ i8;
                        i2 = ((iM55680 ^ i7) * (-15679)) ^ 852244044;
                        i3 = -806799284;
                    } else {
                        iM55680 = C0946.m55979("۬ܰ") ^ i7;
                        i2 = ((iM55680 ^ i8) * 17311) ^ (-1883086435);
                        i3 = 839944463;
                    }
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case -1065254325:
                case 34306644:
                    c20660 = (C20660) this.f25651;
                    Object obj6 = this.f25649;
                    if (C0906.f81862 < 0) {
                        iM55681 = C0946.m55979("ۖ֫") ^ i7;
                        obj2 = obj6;
                        i9 = ((iM55681 ^ i8) * (-18697)) ^ (-1482097177);
                        i4 = -1467679478;
                        i10 = iM55681 ^ i4;
                    } else {
                        obj2 = obj6;
                        iM55680 = (C0873.m55680("۠ۢ") + i7) * 79;
                        i2 = ((iM55680 ^ i8) * (-29775)) ^ (-785917185);
                        i3 = 743179500;
                        i10 = iM55680 ^ i3;
                        i9 = i2;
                    }
                    break;
                case -997797180:
                case 1426719950:
                    C1053.m56327();
                    C1229.m56410();
                    iM55680 = C0946.m55979("ۖۛ") ^ i8;
                    i2 = ((iM55680 ^ i7) * 2515) ^ (-1156658252);
                    i3 = -646567907;
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case -862001482:
                case 1404647819:
                    break;
                case -803485438:
                case 1286843594:
                    arrayList = c20946.f40548;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0946.m55979("ۖۛ") ^ i8;
                        i2 = ((iM55680 ^ i7) * 2515) ^ (-1156658252);
                        i3 = -646567907;
                    } else {
                        iM55680 = C0873.m55680("֨ܿ") ^ i7;
                        i2 = ((iM55680 ^ i8) * (-25033)) ^ (-1845691436);
                        i3 = 1557961974;
                    }
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case -640295247:
                case -374997035:
                    i11 = 1;
                    i13 = (bindingAdapterPosition - iM12179) - 1;
                    if (C1024.f81946) {
                        iM55680 = C0946.m55979("ۖۛ") ^ i8;
                        i2 = ((iM55680 ^ i7) * 2515) ^ (-1156658252);
                        i3 = -646567907;
                    } else {
                        iM55680 = (C0946.m55979("ۙ۠") ^ i8) * 41;
                        i2 = ((iM55680 ^ i7) * 8489) ^ (-573464108);
                        i3 = -1433874102;
                    }
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case -616454064:
                case -226023591:
                    interfaceC19370 = (InterfaceC19370) obj3;
                    dialogInterface.dismiss();
                    if (i6 != 0) {
                        iM55680 = C0873.m55680("ܰᩳ") ^ i8;
                        i2 = ((iM55680 ^ i7) * (-4873)) ^ (-801672599);
                        i3 = -1164788113;
                    } else {
                        iM55680 = C0873.m55680("ܺۚ") ^ i7;
                        i2 = ((iM55680 ^ i8) * (-24915)) ^ 343811104;
                        i3 = 293836190;
                    }
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case -419338188:
                case 116622766:
                    C1964.m56597();
                    if (C1025.f81947 < 0) {
                        int iM55685 = (C0873.m55680("֫ܿ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i10 = iM55685 ^ 1747323074;
                        i9 = ((iM55685 ^ i8) * 8705) ^ 1473038989;
                        intent = null;
                    } else {
                        iM55680 = (C0873.m55680("۠ۢ") + i7) * 79;
                        i2 = ((iM55680 ^ i8) * (-29775)) ^ (-785917185);
                        i3 = 743179500;
                        i10 = iM55680 ^ i3;
                        i9 = i2;
                    }
                    break;
                case -266310936:
                case 543493234:
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0946.m55979("ۖۛ") ^ i8;
                        i2 = ((iM55680 ^ i7) * 2515) ^ (-1156658252);
                        i3 = -646567907;
                    } else {
                        iM55680 = (C0873.m55680("۠ۢ") + i7) * 79;
                        i2 = ((iM55680 ^ i8) * (-29775)) ^ (-785917185);
                        i3 = 743179500;
                    }
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case 210598152:
                case 1136558668:
                    c12574 = (C12574) this.f25651;
                    Object obj7 = this.f25649;
                    if (C0906.m55809() > 0) {
                        iM55681 = (i8 - C0873.m55680("ۙ֡")) * (-127);
                        obj4 = obj7;
                        i9 = ((iM55681 ^ i7) * 5659) ^ 225417371;
                        i4 = 2048786308;
                        i10 = iM55681 ^ i4;
                    } else {
                        obj4 = obj7;
                        iM55680 = (C0873.m55680("ۧᩳ") ^ i7) * (-77);
                        i2 = ((iM55680 ^ i8) * 551) ^ 1646741590;
                        i3 = 1421465089;
                        i10 = iM55680 ^ i3;
                        i9 = i2;
                    }
                    break;
                case 556902374:
                case 2074405617:
                    C0854.m55595();
                    if (C0906.m55809() <= 0) {
                        iM55680 = (C0873.m55680("۠ۢ") + i7) * 79;
                        i2 = ((iM55680 ^ i8) * (-29775)) ^ (-785917185);
                        i3 = 743179500;
                    } else {
                        iM55680 = (i8 - C0946.m55979("ܺۨ")) * (-81);
                        i2 = ((iM55680 ^ i7) * 1519) ^ 1535673759;
                        i3 = 1836993091;
                    }
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case 1109090617:
                case 2076118333:
                    C20946.f65825.mo4062(Object.class);
                    break;
                case 1434420166:
                case 2091778979:
                    C20660.m46670(c20660, (boolean[]) obj2);
                    break;
                case 1671769939:
                case 2054479747:
                    c5522.notifyItemRangeRemoved(bindingAdapterPosition, i11);
                    iM55680 = C0946.m55979("ۢۢ") ^ i7;
                    i2 = ((iM55680 ^ i8) * (-31765)) ^ 643205389;
                    i3 = -1775134139;
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case 1800053981:
                case 1905699766:
                    bindingAdapterPosition = c20275.getBindingAdapterPosition();
                    c5522 = c20946.f40549;
                    iM12179 = c5522.m12179(c20946);
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0873.m55680("ۧᩳ") ^ i7) * (-77);
                        i2 = ((iM55680 ^ i8) * 551) ^ 1646741590;
                        i3 = 1421465089;
                    } else {
                        iM55680 = C0946.m55979("֨۫") ^ i8;
                        i2 = ((iM55680 ^ i7) * (-10955)) ^ (-965473572);
                        i3 = -1083387087;
                    }
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
                case 1805547970:
                case 2057376849:
                    c18107 = (C18107) this.f25651;
                    Object obj8 = this.f25649;
                    if (C0992.f81922 < 0) {
                        int iM559710 = (C0946.m55979("ۙܰ") ^ i8) * 59;
                        i10 = iM559710 ^ (-219869783);
                        obj3 = obj8;
                        i9 = ((iM559710 ^ i7) * (-17145)) ^ (-610438243);
                        i6 = i;
                    } else {
                        obj3 = obj8;
                        int iM55686 = (C0873.m55680("֫ܿ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i10 = iM55686 ^ 1747323074;
                        i9 = ((iM55686 ^ i8) * 8705) ^ 1473038989;
                        intent = null;
                    }
                    break;
                default:
                    c5522.notifyItemRangeRemoved(bindingAdapterPosition - i11, 2);
                    iM55680 = C0946.m55979("ۢۢ") ^ i7;
                    i2 = ((iM55680 ^ i8) * (-31765)) ^ 643205389;
                    i3 = -1775134139;
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    break;
            }
            return;
        }
    }
}
