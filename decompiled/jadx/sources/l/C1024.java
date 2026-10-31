package l;

import android.content.SharedPreferences;
import android.os.Process;
import java.util.UUID;
import java.util.function.Consumer;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֨ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 154F */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1024 implements Consumer {

    /* JADX INFO: renamed from: ᩶᩻ܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f3755 = {3709, 17613, 17612, 17603, 17656};

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        String strM34524 = null;
        InterfaceC13049 interfaceC13049M4377 = null;
        String strM947 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 303310946;
        int i9 = C4616.f14690;
        int i10 = C3537.f11231;
        int iM6983 = (C2105.m6981("۠ᩴ") + i9) * 23;
        int i11 = ((iM6983 ^ i10) * 28517) ^ (-1999557936);
        int i12 = iM6983 ^ 1752818373;
        String strM1959 = null;
        while (true) {
            StringBuilder sb = null;
            while (true) {
                i8 = i12 ^ (i11 & (((i8 ^ i10) * 28423) >> 31));
                switch (i8) {
                    case -1987093884:
                    case -651952315:
                        strM34524 = C14460.m34524(strM1959);
                        interfaceC13049M4377 = C1294.m4377(ApplicationC20075.f65008);
                        if (C21923.f70183 == 0) {
                            int iM2566 = C0630.m2566("۫᩶") ^ i9;
                            i12 = (-1436897725) ^ iM2566;
                            i11 = ((iM2566 ^ i10) * 26757) ^ (-68139940);
                        } else {
                            int iM6984 = (C2105.m6981("᩸᩵") + i9) * (-3);
                            i12 = 1423382333 ^ iM6984;
                            i11 = ((iM6984 ^ i10) * (-7401)) ^ 1922678271;
                        }
                        break;
                    case -1984170290:
                    case -552246796:
                        RunnableC1937.m6387();
                        if (C7811.m20844() != 0) {
                            iM6981 = C2105.m6981("ᩳۘ") ^ i10;
                            i = ((iM6981 ^ i9) * 19021) ^ 1916286055;
                            i2 = 1279007651;
                            int i13 = i;
                            i12 = iM6981 ^ i2;
                            i11 = i13;
                        } else {
                            strM34524 = strM34524;
                            iM6982 = (C2105.m6981("۫֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i3 = ((iM6982 ^ i10) * 12377) ^ (-172144185);
                            i4 = 1066459483;
                            i12 = iM6982 ^ i4;
                            i11 = i3;
                            strM34524 = strM34524;
                        }
                        break;
                    case -1958813561:
                    case 311389001:
                        strM34524 = strM34524;
                        if (RunnableC0588.f2309 < 0) {
                            iM6982 = (C2105.m6981("ܺۧ") ^ i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i3 = ((iM6982 ^ i10) * (-18001)) ^ 518764333;
                            i4 = -948805855;
                            i12 = iM6982 ^ i4;
                            i11 = i3;
                            strM34524 = strM34524;
                        } else {
                            strM34524 = strM34524;
                            int iM6985 = (C2105.m6981("᩸᩵") + i9) * (-3);
                            i12 = 1423382333 ^ iM6985;
                            i11 = ((iM6985 ^ i10) * (-7401)) ^ 1922678271;
                        }
                        break;
                    case -1931378584:
                    case 1157791825:
                        short[] sArr2 = f3755;
                        if (C4117.m12364() == 0) {
                            strM34524 = strM34524;
                            String strM4373 = C1294.m4373(sArr2, 1, 4, i7);
                            if (C2167.f7158 < 0) {
                                StringBuilder sb2 = new StringBuilder(strM4373);
                                C0422.m1944(sb2, Process.myUid());
                                if (C4616.f14690 <= 0) {
                                    sb = sb2;
                                    iM6982 = C0630.m2566("۟᩺") ^ i10;
                                    i3 = ((iM6982 ^ i9) * 12021) ^ (-965073076);
                                    i4 = 1857660011;
                                    i12 = iM6982 ^ i4;
                                    i11 = i3;
                                } else {
                                    int iM2567 = (C0630.m2566("ܳۡ") + i9) * (-11);
                                    i12 = 138773011 ^ iM2567;
                                    sb = sb2;
                                    i11 = ((iM2567 ^ i10) * 13973) ^ (-673888649);
                                }
                                strM34524 = strM34524;
                            } else {
                                strM34524 = strM34524;
                                int iM6986 = (C2105.m6981("᩸᩵") + i9) * (-3);
                                i12 = 1423382333 ^ iM6986;
                                i11 = ((iM6986 ^ i10) * (-7401)) ^ 1922678271;
                            }
                        } else {
                            strM34524 = strM34524;
                            int iM6987 = C2105.m6981("᩶᩷") ^ i9;
                            i12 = iM6987 ^ 541285732;
                            i11 = ((iM6987 ^ i10) * (-10631)) ^ 1300025604;
                            strM34524 = strM34524;
                        }
                        break;
                    case -1679182851:
                    case 2037077206:
                        strM1959 = C0422.m1959(UUID.randomUUID());
                        strM34524 = strM34524;
                        iM6982 = (i10 - C0630.m2566("ۙ᩺")) * 119;
                        i3 = ((iM6982 ^ i9) * (-19679)) ^ (-76993906);
                        i4 = -1514781206;
                        i12 = iM6982 ^ i4;
                        i11 = i3;
                        strM34524 = strM34524;
                        break;
                    case -1652150996:
                    case 923249800:
                        if (C3683.f11629 >= 0) {
                            strM34524 = strM34524;
                            iM6982 = C0630.m2566("۟᩺") ^ i10;
                            i3 = ((iM6982 ^ i9) * 12021) ^ (-965073076);
                            i4 = 1857660011;
                            i12 = iM6982 ^ i4;
                            i11 = i3;
                            strM34524 = strM34524;
                        }
                        strM34524 = strM34524;
                        iM6982 = (C2105.m6981("۫֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM6982 ^ i10) * 12377) ^ (-172144185);
                        i4 = 1066459483;
                        i12 = iM6982 ^ i4;
                        i11 = i3;
                        strM34524 = strM34524;
                        break;
                    case -1616468409:
                    case -994006797:
                        strM34524 = strM34524;
                        c = 0;
                        if (!C0714.m2805()) {
                            int iM6988 = C2105.m6981("᩶᩷") ^ i9;
                            i12 = iM6988 ^ 541285732;
                            i11 = ((iM6988 ^ i10) * (-10631)) ^ 1300025604;
                            strM34524 = strM34524;
                        } else {
                            iM6982 = C2105.m6981("᩹۬") ^ i9;
                            i3 = ((iM6982 ^ i10) * (-21153)) ^ 61700089;
                            i4 = 1585895446;
                            i12 = iM6982 ^ i4;
                            i11 = i3;
                            strM34524 = strM34524;
                        }
                        break;
                    case -1603226840:
                    case -147708434:
                        strM34524 = strM34524;
                        sArr = f3755;
                        if (RunnableC0588.f2309 >= 0) {
                            iM6982 = (C2105.m6981("۫֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i3 = ((iM6982 ^ i10) * 12377) ^ (-172144185);
                            i4 = 1066459483;
                        } else {
                            iM6982 = (i10 - C0630.m2566("ۜ֨")) * (-13);
                            i3 = ((iM6982 ^ i9) * 1247) ^ 1832809298;
                            i4 = -972828579;
                        }
                        i12 = iM6982 ^ i4;
                        i11 = i3;
                        strM34524 = strM34524;
                        break;
                    case -1478358558:
                    case -1282422305:
                        i7 = 17575;
                        iM6982 = C0630.m2566("ܺܰ") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-14521)) ^ (-1273981117);
                        i4 = 848640995;
                        i12 = iM6982 ^ i4;
                        i11 = i3;
                        strM34524 = strM34524;
                        break;
                    case -1422731618:
                    case 1571162421:
                        strM947 = C0050.m947(sb);
                        if (C4616.m13552() == 0) {
                            iM6981 = (C0630.m2566("ܽۨ") + i10) * 19;
                            i = ((iM6981 ^ i9) * (-24673)) ^ (-365919735);
                            i2 = 2090272981;
                            int i14 = i;
                            i12 = iM6981 ^ i2;
                            i11 = i14;
                        } else {
                            int iM6989 = (C2105.m6981("᩸᩵") + i9) * (-3);
                            i12 = 1423382333 ^ iM6989;
                            i11 = ((iM6989 ^ i10) * (-7401)) ^ 1922678271;
                        }
                        break;
                    case -1254296141:
                    case -1090500774:
                        if (C3746.f11829 > 0) {
                            strM34524 = strM34524;
                            int iM69810 = C2105.m6981("᩶᩷") ^ i9;
                            i12 = iM69810 ^ 541285732;
                            i11 = ((iM69810 ^ i10) * (-10631)) ^ 1300025604;
                            strM34524 = strM34524;
                        }
                        strM34524 = strM34524;
                        iM6982 = (C2105.m6981("۫֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM6982 ^ i10) * 12377) ^ (-172144185);
                        i4 = 1066459483;
                        i12 = iM6982 ^ i4;
                        i11 = i3;
                        strM34524 = strM34524;
                        break;
                    case -987378332:
                    case 1045034346:
                        i7 = 51369;
                        iM6982 = C0630.m2566("ܺܰ") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-14521)) ^ (-1273981117);
                        i4 = 848640995;
                        i12 = iM6982 ^ i4;
                        i11 = i3;
                        strM34524 = strM34524;
                        break;
                    case -483602273:
                    case 1419398392:
                        strM34524 = strM34524;
                        String str = (String) obj;
                        SharedPreferences sharedPreferences = ApplicationC20075.f65010;
                        if (str == null) {
                            iM6982 = C0630.m2566("᩻ۜ") ^ i10;
                            i3 = ((iM6982 ^ i9) * 24173) ^ 1039874500;
                            i4 = -1462672547;
                        } else {
                            strM1959 = str;
                            iM6982 = (i10 - C0630.m2566("ۙ᩺")) * 119;
                            i3 = ((iM6982 ^ i9) * (-19679)) ^ (-76993906);
                            i4 = -1514781206;
                        }
                        i12 = iM6982 ^ i4;
                        i11 = i3;
                        strM34524 = strM34524;
                        break;
                    case -329638694:
                    case 1451563330:
                        C1916.m6302(C3683.m11223(interfaceC13049M4377, strM947, strM34524));
                        C18237.m42481(strM34524);
                        break;
                    case 117165413:
                    case 932810002:
                        C7106.m19120();
                        strM34524 = strM34524;
                        iM6982 = (C2105.m6981("۫֨") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM6982 ^ i10) * 12377) ^ (-172144185);
                        i4 = 1066459483;
                        i12 = iM6982 ^ i4;
                        i11 = i3;
                        strM34524 = strM34524;
                        break;
                    case 198375400:
                    case 1805561655:
                        strM34524 = strM34524;
                        i6 = i5 + 1;
                        s2 = 1;
                        if (!C2272.m7503()) {
                            iM6982 = (C2105.m6981("ۧۙ") ^ i10) * (-57);
                            i3 = ((iM6982 ^ i9) * 6701) ^ (-523049432);
                            i4 = 475233054;
                            i12 = iM6982 ^ i4;
                            i11 = i3;
                            strM34524 = strM34524;
                        } else {
                            int iM69811 = C2105.m6981("᩶᩷") ^ i9;
                            i12 = iM69811 ^ 541285732;
                            i11 = ((iM69811 ^ i10) * (-10631)) ^ 1300025604;
                            strM34524 = strM34524;
                        }
                        break;
                    case 723901398:
                    case 1374942518:
                        strM34524 = strM34524;
                        int i15 = s + s2;
                        if ((i15 * i15) - i6 < 0) {
                            iM6982 = (C0630.m2566("ܿ᩵") ^ i9) * 19;
                            i3 = ((iM6982 ^ i10) * 11881) ^ (-916963610);
                            i4 = -508937336;
                        } else {
                            iM6982 = C2105.m6981("ۘۜ") ^ i9;
                            i3 = ((iM6982 ^ i10) * 24437) ^ (-1323839525);
                            i4 = -1791701989;
                        }
                        i12 = iM6982 ^ i4;
                        i11 = i3;
                        strM34524 = strM34524;
                        break;
                    case 1890660347:
                    case 2017344837:
                        strM34524 = strM34524;
                        s = sArr[c];
                        i5 = s * 2;
                        if (C0237.f1507 == 0) {
                            iM6982 = C2105.m6981("ۜ᩻") ^ i10;
                            i3 = ((iM6982 ^ i9) * 23173) ^ 2107390134;
                            i4 = -630516547;
                            i12 = iM6982 ^ i4;
                            i11 = i3;
                            strM34524 = strM34524;
                        } else {
                            int iM69812 = C2105.m6981("᩶᩷") ^ i9;
                            i12 = iM69812 ^ 541285732;
                            i11 = ((iM69812 ^ i10) * (-10631)) ^ 1300025604;
                            strM34524 = strM34524;
                        }
                        break;
                    default:
                        C1773.m5908();
                        break;
                }
                return;
            }
        }
    }
}
