package p067l;

import android.content.SharedPreferences;
import android.os.Process;
import java.util.UUID;
import java.util.function.Consumer;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֨ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 154F */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3342 implements Consumer {

    /* JADX INFO: renamed from: ᩶᩻ܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f81853 = {3709, 17613, 17612, 17603, 17656};

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        String strM36658 = null;
        InterfaceC14770 interfaceC14770M55814 = null;
        String strM55591 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 303310946;
        int i9 = C1071.f81975;
        int i10 = C1017.f81942;
        int iM559711 = (C0946.m55979("۠ᩴ") + i9) * 23;
        int i11 = ((iM559711 ^ i10) * 28517) ^ (-1999557936);
        int i12 = iM559711 ^ 1752818373;
        String strM55639 = null;
        while (true) {
            StringBuilder sb = null;
            while (true) {
                i8 = i12 ^ (i11 & (((i8 ^ i10) * 28423) >> 31));
                switch (i8) {
                    case -1987093884:
                    case -651952315:
                        strM36658 = C16111.m36658(strM55639);
                        interfaceC14770M55814 = C0906.m55814(ApplicationC21448.f67649);
                        if (C1929.f83011 == 0) {
                            int iM55680 = C0873.m55680("۫᩶") ^ i9;
                            i12 = (-1436897725) ^ iM55680;
                            i11 = ((iM55680 ^ i10) * 26757) ^ (-68139940);
                        } else {
                            int iM559712 = (C0946.m55979("᩸᩵") + i9) * (-3);
                            i12 = 1423382333 ^ iM559712;
                            i11 = ((iM559712 ^ i10) * (-7401)) ^ 1922678271;
                        }
                        break;
                    case -1984170290:
                    case -552246796:
                        RunnableC0938.m55938();
                        if (C1229.m56410() != 0) {
                            iM55979 = C0946.m55979("ᩳۘ") ^ i10;
                            i = ((iM55979 ^ i9) * 19021) ^ 1916286055;
                            i2 = 1279007651;
                            int i13 = i;
                            i12 = iM55979 ^ i2;
                            i11 = i13;
                        } else {
                            strM36658 = strM36658;
                            iM559710 = (C0946.m55979("۫֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i3 = ((iM559710 ^ i10) * 12377) ^ (-172144185);
                            i4 = 1066459483;
                            i12 = iM559710 ^ i4;
                            i11 = i3;
                            strM36658 = strM36658;
                        }
                        break;
                    case -1958813561:
                    case 311389001:
                        strM36658 = strM36658;
                        if (RunnableC0871.f81839 < 0) {
                            iM559710 = (C0946.m55979("ܺۧ") ^ i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i3 = ((iM559710 ^ i10) * (-18001)) ^ 518764333;
                            i4 = -948805855;
                            i12 = iM559710 ^ i4;
                            i11 = i3;
                            strM36658 = strM36658;
                        } else {
                            strM36658 = strM36658;
                            int iM559713 = (C0946.m55979("᩸᩵") + i9) * (-3);
                            i12 = 1423382333 ^ iM559713;
                            i11 = ((iM559713 ^ i10) * (-7401)) ^ 1922678271;
                        }
                        break;
                    case -1931378584:
                    case 1157791825:
                        short[] sArr2 = f81853;
                        if (C1046.m56302() == 0) {
                            strM36658 = strM36658;
                            String strM55810 = C0906.m55810(sArr2, 1, 4, i7);
                            if (C0949.f81897 < 0) {
                                StringBuilder sb2 = new StringBuilder(strM55810);
                                C0863.m55629(sb2, Process.myUid());
                                if (C1071.f81975 <= 0) {
                                    sb = sb2;
                                    iM559710 = C0873.m55680("۟᩺") ^ i10;
                                    i3 = ((iM559710 ^ i9) * 12021) ^ (-965073076);
                                    i4 = 1857660011;
                                    i12 = iM559710 ^ i4;
                                    i11 = i3;
                                } else {
                                    int iM55681 = (C0873.m55680("ܳۡ") + i9) * (-11);
                                    i12 = 138773011 ^ iM55681;
                                    sb = sb2;
                                    i11 = ((iM55681 ^ i10) * 13973) ^ (-673888649);
                                }
                                strM36658 = strM36658;
                            } else {
                                strM36658 = strM36658;
                                int iM559714 = (C0946.m55979("᩸᩵") + i9) * (-3);
                                i12 = 1423382333 ^ iM559714;
                                i11 = ((iM559714 ^ i10) * (-7401)) ^ 1922678271;
                            }
                        } else {
                            strM36658 = strM36658;
                            int iM559715 = C0946.m55979("᩶᩷") ^ i9;
                            i12 = iM559715 ^ 541285732;
                            i11 = ((iM559715 ^ i10) * (-10631)) ^ 1300025604;
                            strM36658 = strM36658;
                        }
                        break;
                    case -1679182851:
                    case 2037077206:
                        strM55639 = C0863.m55639(UUID.randomUUID());
                        strM36658 = strM36658;
                        iM559710 = (i10 - C0873.m55680("ۙ᩺")) * 119;
                        i3 = ((iM559710 ^ i9) * (-19679)) ^ (-76993906);
                        i4 = -1514781206;
                        i12 = iM559710 ^ i4;
                        i11 = i3;
                        strM36658 = strM36658;
                        break;
                    case -1652150996:
                    case 923249800:
                        if (C1025.f81947 >= 0) {
                            strM36658 = strM36658;
                            iM559710 = C0873.m55680("۟᩺") ^ i10;
                            i3 = ((iM559710 ^ i9) * 12021) ^ (-965073076);
                            i4 = 1857660011;
                            i12 = iM559710 ^ i4;
                            i11 = i3;
                            strM36658 = strM36658;
                        }
                        strM36658 = strM36658;
                        iM559710 = (C0946.m55979("۫֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM559710 ^ i10) * 12377) ^ (-172144185);
                        i4 = 1066459483;
                        i12 = iM559710 ^ i4;
                        i11 = i3;
                        strM36658 = strM36658;
                        break;
                    case -1616468409:
                    case -994006797:
                        strM36658 = strM36658;
                        c = 0;
                        if (!C0877.m55696()) {
                            int iM559716 = C0946.m55979("᩶᩷") ^ i9;
                            i12 = iM559716 ^ 541285732;
                            i11 = ((iM559716 ^ i10) * (-10631)) ^ 1300025604;
                            strM36658 = strM36658;
                        } else {
                            iM559710 = C0946.m55979("᩹۬") ^ i9;
                            i3 = ((iM559710 ^ i10) * (-21153)) ^ 61700089;
                            i4 = 1585895446;
                            i12 = iM559710 ^ i4;
                            i11 = i3;
                            strM36658 = strM36658;
                        }
                        break;
                    case -1603226840:
                    case -147708434:
                        strM36658 = strM36658;
                        sArr = f81853;
                        if (RunnableC0871.f81839 >= 0) {
                            iM559710 = (C0946.m55979("۫֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i3 = ((iM559710 ^ i10) * 12377) ^ (-172144185);
                            i4 = 1066459483;
                        } else {
                            iM559710 = (i10 - C0873.m55680("ۜ֨")) * (-13);
                            i3 = ((iM559710 ^ i9) * 1247) ^ 1832809298;
                            i4 = -972828579;
                        }
                        i12 = iM559710 ^ i4;
                        i11 = i3;
                        strM36658 = strM36658;
                        break;
                    case -1478358558:
                    case -1282422305:
                        i7 = 17575;
                        iM559710 = C0873.m55680("ܺܰ") ^ i10;
                        i3 = ((iM559710 ^ i9) * (-14521)) ^ (-1273981117);
                        i4 = 848640995;
                        i12 = iM559710 ^ i4;
                        i11 = i3;
                        strM36658 = strM36658;
                        break;
                    case -1422731618:
                    case 1571162421:
                        strM55591 = C0845.m55591(sb);
                        if (C1071.m56343() == 0) {
                            iM55979 = (C0873.m55680("ܽۨ") + i10) * 19;
                            i = ((iM55979 ^ i9) * (-24673)) ^ (-365919735);
                            i2 = 2090272981;
                            int i14 = i;
                            i12 = iM55979 ^ i2;
                            i11 = i14;
                        } else {
                            int iM559717 = (C0946.m55979("᩸᩵") + i9) * (-3);
                            i12 = 1423382333 ^ iM559717;
                            i11 = ((iM559717 ^ i10) * (-7401)) ^ 1922678271;
                        }
                        break;
                    case -1254296141:
                    case -1090500774:
                        if (C1028.f81950 > 0) {
                            strM36658 = strM36658;
                            int iM559718 = C0946.m55979("᩶᩷") ^ i9;
                            i12 = iM559718 ^ 541285732;
                            i11 = ((iM559718 ^ i10) * (-10631)) ^ 1300025604;
                            strM36658 = strM36658;
                        }
                        strM36658 = strM36658;
                        iM559710 = (C0946.m55979("۫֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM559710 ^ i10) * 12377) ^ (-172144185);
                        i4 = 1066459483;
                        i12 = iM559710 ^ i4;
                        i11 = i3;
                        strM36658 = strM36658;
                        break;
                    case -987378332:
                    case 1045034346:
                        i7 = 51369;
                        iM559710 = C0873.m55680("ܺܰ") ^ i10;
                        i3 = ((iM559710 ^ i9) * (-14521)) ^ (-1273981117);
                        i4 = 848640995;
                        i12 = iM559710 ^ i4;
                        i11 = i3;
                        strM36658 = strM36658;
                        break;
                    case -483602273:
                    case 1419398392:
                        strM36658 = strM36658;
                        String str = (String) obj;
                        SharedPreferences sharedPreferences = ApplicationC21448.f67650;
                        if (str == null) {
                            iM559710 = C0873.m55680("᩻ۜ") ^ i10;
                            i3 = ((iM559710 ^ i9) * 24173) ^ 1039874500;
                            i4 = -1462672547;
                        } else {
                            strM55639 = str;
                            iM559710 = (i10 - C0873.m55680("ۙ᩺")) * 119;
                            i3 = ((iM559710 ^ i9) * (-19679)) ^ (-76993906);
                            i4 = -1514781206;
                        }
                        i12 = iM559710 ^ i4;
                        i11 = i3;
                        strM36658 = strM36658;
                        break;
                    case -329638694:
                    case 1451563330:
                        C0937.m55912(C1025.m56231(interfaceC14770M55814, strM55591, strM36658));
                        C19701.m44740(strM36658);
                        break;
                    case 117165413:
                    case 932810002:
                        C1194.m56396();
                        strM36658 = strM36658;
                        iM559710 = (C0946.m55979("۫֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM559710 ^ i10) * 12377) ^ (-172144185);
                        i4 = 1066459483;
                        i12 = iM559710 ^ i4;
                        i11 = i3;
                        strM36658 = strM36658;
                        break;
                    case 198375400:
                    case 1805561655:
                        strM36658 = strM36658;
                        i6 = i5 + 1;
                        s2 = 1;
                        if (!C0955.m56025()) {
                            iM559710 = (C0946.m55979("ۧۙ") ^ i10) * (-57);
                            i3 = ((iM559710 ^ i9) * 6701) ^ (-523049432);
                            i4 = 475233054;
                            i12 = iM559710 ^ i4;
                            i11 = i3;
                            strM36658 = strM36658;
                        } else {
                            int iM559719 = C0946.m55979("᩶᩷") ^ i9;
                            i12 = iM559719 ^ 541285732;
                            i11 = ((iM559719 ^ i10) * (-10631)) ^ 1300025604;
                            strM36658 = strM36658;
                        }
                        break;
                    case 723901398:
                    case 1374942518:
                        strM36658 = strM36658;
                        int i15 = s + s2;
                        if ((i15 * i15) - i6 < 0) {
                            iM559710 = (C0873.m55680("ܿ᩵") ^ i9) * 19;
                            i3 = ((iM559710 ^ i10) * 11881) ^ (-916963610);
                            i4 = -508937336;
                        } else {
                            iM559710 = C0946.m55979("ۘۜ") ^ i9;
                            i3 = ((iM559710 ^ i10) * 24437) ^ (-1323839525);
                            i4 = -1791701989;
                        }
                        i12 = iM559710 ^ i4;
                        i11 = i3;
                        strM36658 = strM36658;
                        break;
                    case 1890660347:
                    case 2017344837:
                        strM36658 = strM36658;
                        s = sArr[c];
                        i5 = s * 2;
                        if (C0854.f81826 == 0) {
                            iM559710 = C0946.m55979("ۜ᩻") ^ i10;
                            i3 = ((iM559710 ^ i9) * 23173) ^ 2107390134;
                            i4 = -630516547;
                            i12 = iM559710 ^ i4;
                            i11 = i3;
                            strM36658 = strM36658;
                        } else {
                            int iM5597110 = C0946.m55979("᩶᩷") ^ i9;
                            i12 = iM5597110 ^ 541285732;
                            i11 = ((iM5597110 ^ i10) * (-10631)) ^ 1300025604;
                            strM36658 = strM36658;
                        }
                        break;
                    default:
                        C0930.m55885();
                        break;
                }
                return;
            }
        }
    }
}
