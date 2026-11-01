package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩻ܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A1FQ */
/* JADX INFO: loaded from: classes.dex */
public class C24995 extends AbstractC5996 {

    /* JADX INFO: renamed from: ۖ֫ */
    public static final /* synthetic */ int f79786 = 0;

    /* JADX INFO: renamed from: ᩸ۛ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f83061 = {1256, 32210, 32221, 32216, 32209, -5823, -3798, 9921, 8811, -10210, -10212, -10233, -10239, -10212, -10233, -10214, -10217, -10181, -10212, -10238, -10213, -10212, -10238, -10211, -10234, -10225, -10145, -10232, -10233, -10238, -10229, -10160, -10160, -10162, -10198, -10239, -10215, -10240, -10238, -10239, -10225, -10230, -10162, -10137, -10238, -10239, -10227, -10225, -10214, -10233, -10239, -10240, -10179, -10202, -10193, -10145, -10137, -10179, -10213, -10227, -10227, -10229, -10211, -10211, -10161, -10137, -10200, -10233, -10238, -10229, -10162, -10179, -10202, -10193, -10145, -10162, -10227, -10234, -10229, -10227, -10235, -10162, -10232, -10225, -10233, -10238, -10229, -10230, -10156, -10162, -10229, -10218, -10210, -10229, -10227, -10214, -10229, -10230, -10157, -10174, -10162, -10231, -10239, -10214, -10157, -10137, -10179, -10229, -10212, -10216, -10229, -10212, -10162, -10212, -10229, -10214, -10213, -10212, -10240, -10229, -10230, -10162, -10202, -10182, -10182, -10178, -10162, -10162, -10137, -10180, -10229, -10230, -10233, -10212, -10229, -10227, -10214, -10162, -10214, -10239, -10162, 1383, -27793, -26522, -20198, -7301, -7320, -7297, -7298, -7324, -7326, -7325, -7357, -7316, -7328, -7320, -7301, -7320, -7297, -7298, -7324, -7326, -7325, -7356, -7325, -7317, -7326, -16502, 24598, 26182, -7379, -20204, 28358, 31645, 29896, -18472, -27328, 2642, -6716, 5099, -4344, -26392, -26393, -26398, -26389};

    /* JADX INFO: renamed from: ۡ֫ */
    public AbstractC17043 f79787;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f79788 = true;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009e, code lost:
    
        if (p067l.C1025.f81947 < 0) goto L10;
     */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DialogInterfaceC2564 mo12166(AbstractActivityC5549 abstractActivityC5549) {
        int iM55979;
        int i;
        int i2;
        short[] sArr;
        int i3;
        int i4;
        StringBuilder sb;
        int iM559710;
        int i5;
        int iM55680;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        short[] sArr2;
        int i10;
        int i11;
        int iM55681;
        int i12;
        int i13;
        int iM55682;
        int i14;
        int iM559711;
        int i15;
        int i16;
        String str;
        StringBuilder sb2;
        String str2;
        final C24995 c24995 = this;
        int iM559712 = 0;
        boolean z2 = false;
        C20671 c20671 = null;
        Object obj = null;
        DialogInterface.OnClickListener onClickListener = null;
        DialogInterfaceC2564 dialogInterfaceC2564M55669 = null;
        final DialogInterfaceC2564 dialogInterfaceC2564M20553 = null;
        Button buttonM56405 = null;
        final Button buttonM56567 = null;
        String strM56584 = null;
        int iM559713 = 0;
        int iM559714 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 12169255;
        int i20 = ServiceConnectionC1013.f81940;
        int i21 = C1229.f82066;
        int iM559715 = (C0946.m55979("ܺᩴ") + i21) * (-121);
        int i22 = ((iM559715 ^ i20) * 2117) ^ 1620485030;
        int i23 = iM559715 ^ 2139913956;
        String strM13492 = null;
        String strM56336 = null;
        String str3 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        boolean z3 = false;
        int i24 = 0;
        boolean z4 = false;
        short s = 0;
        int i25 = 0;
        int i26 = 0;
        StringBuilder sb3 = null;
        int i27 = 0;
        String strM56156 = null;
        C7350 c7350M13468 = null;
        while (true) {
            i19 = i23 ^ (i22 & (((i19 ^ i20) * 15865) >> 31));
            switch (i19) {
                case -1953689214:
                case -1236007043:
                    i9 = iM559712;
                    sArr2 = sArr3;
                    i11 = i26;
                    StringBuilder sb4 = sb3;
                    str3 = str3;
                    sArr4 = sArr4;
                    sb = sb4;
                    short[] sArr5 = f83061;
                    i10 = i25;
                    z = z2 ? 1 : 0;
                    strM56336 = C1071.m56336(sArr5, 156, 11, i24);
                    if (RunnableC0938.f81886 >= 0) {
                        iM55681 = C0946.m55979("ۢ֨") ^ i21;
                        i12 = ((iM55681 ^ i20) * (-23577)) ^ 395944815;
                        i13 = -1216535203;
                    } else {
                        iM55681 = (i20 - C0946.m55979("ۘ᩵")) * (-49);
                        i12 = ((iM55681 ^ i21) * (-8339)) ^ (-563230048);
                        i13 = -1854773536;
                    }
                    int i28 = iM55681 ^ i13;
                    i26 = i11;
                    i25 = i10;
                    sArr3 = sArr2;
                    z2 = z;
                    i23 = i28;
                    i22 = i12;
                    iM559712 = i9;
                    StringBuilder sb5 = sb;
                    sArr4 = sArr4;
                    str3 = str3;
                    sb3 = sb5;
                    break;
                case -1924508285:
                case 1027365115:
                    sb = sb3;
                    i24 = 59043;
                    iM559710 = C0946.m55979("ۨ۬") ^ i21;
                    i22 = ((iM559710 ^ i20) * (-8015)) ^ (-1068325029);
                    i5 = 1444317930;
                    i8 = iM559710 ^ i5;
                    i26 = i26;
                    iM559712 = iM559712;
                    i25 = i25;
                    sArr3 = sArr3;
                    z2 = z2;
                    i23 = i8;
                    c24995 = this;
                    StringBuilder sb6 = sb;
                    sArr4 = sArr4;
                    str3 = str3;
                    sb3 = sb6;
                    break;
                case -1811964884:
                case 1644692091:
                    sArr = sArr3;
                    i3 = i25;
                    i4 = i26;
                    StringBuilder sb7 = sb3;
                    str3 = str3;
                    sArr4 = sArr4;
                    sb = sb7;
                    iM559712 = 2124883470 ^ C0946.m55979(strM56584);
                    if (z4) {
                        int iM559716 = (i20 - C0946.m55979("ۡᩴ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i23 = iM559716 ^ 529003590;
                        i22 = ((iM559716 ^ i21) * (-18939)) ^ (-822914144);
                        i26 = i4;
                        i25 = i3;
                        sArr3 = sArr;
                        z2 = false;
                    } else {
                        z2 = false;
                        int iM55683 = (C0873.m55680("۬ܿ") + i20) * (-15);
                        i23 = iM55683 ^ 696192007;
                        i22 = ((iM55683 ^ i21) * 27769) ^ (-414599400);
                        i26 = i4;
                        iM559712 = iM559712;
                        i25 = i3;
                        sArr3 = sArr;
                    }
                    StringBuilder sb8 = sb;
                    sArr4 = sArr4;
                    str3 = str3;
                    sb3 = sb8;
                    break;
                case -1771909653:
                case -114966008:
                    C0967.m56076(c20671, iM559714 ^ 2102818755, onClickListener);
                    C1124.m56363(c20671, iM559712, obj);
                    dialogInterfaceC2564M55669 = RunnableC0871.m55669(c20671);
                    iM55979 = C0873.m55680("ۡܶ") ^ i21;
                    i = ((iM55979 ^ i20) * 3647) ^ 669990371;
                    i2 = 1894627374;
                    i23 = iM55979 ^ i2;
                    i22 = i;
                    break;
                case -1691344093:
                case 1644999126:
                    iM559712 = iM559712;
                    z2 = z2 ? 1 : 0;
                    sArr3 = sArr3;
                    i25 = i25;
                    i26 = i26;
                    StringBuilder sb9 = sb3;
                    str3 = str3;
                    sArr4 = sArr4;
                    sb = sb9;
                    s = f83061[141];
                    i17 = s * s;
                    i18 = 20430400;
                    iM559710 = (i20 - C0946.m55979("ۢ᩹")) * 99;
                    i22 = ((iM559710 ^ i21) * 24749) ^ 538089218;
                    i5 = -1540021923;
                    i8 = iM559710 ^ i5;
                    i26 = i26;
                    iM559712 = iM559712;
                    i25 = i25;
                    sArr3 = sArr3;
                    z2 = z2;
                    i23 = i8;
                    c24995 = this;
                    StringBuilder sb10 = sb;
                    sArr4 = sArr4;
                    str3 = str3;
                    sb3 = sb10;
                    break;
                case -1626454077:
                case 286718512:
                    C1048.m56304(dialogInterfaceC2564M20553.m3859(), new View.OnClickListener(c24995) { // from class: l.֫ܺ᩷

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C24995 f9255;

                        {
                            int i29 = 523476205;
                            int i30 = C1964.f83032;
                            int i31 = RunnableC1014.f81941;
                            int iM55684 = (C0873.m55680("۟᩻") + i30) * 99;
                            int i32 = ((iM55684 ^ i31) * 29133) ^ 783599777;
                            int i33 = 1034479482;
                            while (true) {
                                i29 = ((((i29 ^ i31) * (-19293)) >> 31) & i32) ^ (iM55684 ^ i33);
                                switch (i29) {
                                    case -2119697233:
                                    case -876879655:
                                        if (C0989.m56095() <= 0) {
                                            iM55684 = (i31 - C0873.m55680("ۤۨ")) * (-109);
                                            i32 = ((iM55684 ^ i30) * 20043) ^ (-1594315102);
                                            i33 = 1247432188;
                                        } else {
                                            iM55684 = C0946.m55979("᩹ۘ") ^ i30;
                                            i32 = ((iM55684 ^ i31) * 6431) ^ 790099428;
                                            i33 = -1680332654;
                                        }
                                        break;
                                    case -2117570552:
                                    case -837771579:
                                        if (C0937.f81884) {
                                            iM55684 = (i30 - C0946.m55979("۬۬")) * 75;
                                            i32 = ((iM55684 ^ i31) * (-12311)) ^ 1370799647;
                                            i33 = -621741945;
                                        } else {
                                            iM55684 = C0946.m55979("ۚۘ") ^ i30;
                                            i32 = ((iM55684 ^ i31) * 17787) ^ (-674488591);
                                            i33 = -1435976970;
                                        }
                                        break;
                                    case -2020673107:
                                    case 87956599:
                                        RunnableC1014.m56177();
                                        C0906.m55809();
                                        throw new RuntimeException();
                                    case -1821785516:
                                    case 1690498358:
                                        if (C0992.f81922 >= 0) {
                                            iM55684 = C0946.m55979("ۚۘ") ^ i30;
                                            i32 = ((iM55684 ^ i31) * 17787) ^ (-674488591);
                                            i33 = -1435976970;
                                        } else {
                                            iM55684 = C0946.m55979("ܺܰ") ^ i30;
                                            i32 = ((iM55684 ^ i31) * (-9141)) ^ 924399978;
                                            i33 = 1083207538;
                                        }
                                        break;
                                    case -1796656320:
                                    case 1017244026:
                                        C0882.m55710();
                                        iM55684 = (i31 - C0873.m55680("ۤۨ")) * (-109);
                                        i32 = ((iM55684 ^ i30) * 20043) ^ (-1594315102);
                                        i33 = 1247432188;
                                        break;
                                    case -1727502171:
                                    case -419430522:
                                        ViewOnClickListenerC0939.m55941();
                                        if (C1017.f81942 >= 0) {
                                            iM55684 = (i31 - C0946.m55979("᩹֫")) * (-113);
                                            i32 = ((iM55684 ^ i30) * 22135) ^ (-1948960971);
                                            i33 = -1876650490;
                                        } else {
                                            iM55684 = C0946.m55979("ۚۘ") ^ i30;
                                            i32 = ((iM55684 ^ i31) * 17787) ^ (-674488591);
                                            i33 = -1435976970;
                                        }
                                        break;
                                    case -1718719478:
                                    case -1618254037:
                                        C0892.m55749();
                                        if (RunnableC0871.f81839 < 0) {
                                            iM55684 = (i30 - C0946.m55979("ܿۨ")) * (-49);
                                            i32 = ((iM55684 ^ i31) * 26989) ^ (-1089175371);
                                            i33 = 996068486;
                                        } else {
                                            iM55684 = (i31 - C0873.m55680("ۤۨ")) * (-109);
                                            i32 = ((iM55684 ^ i30) * 20043) ^ (-1594315102);
                                            i33 = 1247432188;
                                        }
                                        break;
                                    case -1648359144:
                                    case 411588054:
                                        if (C0898.f81858 <= 0) {
                                            iM55684 = (i31 - C0946.m55979("᩹֫")) * (-113);
                                            i32 = ((iM55684 ^ i30) * 22135) ^ (-1948960971);
                                            i33 = -1876650490;
                                        } else {
                                            iM55684 = (C0946.m55979("᩸ۜ") + i31) * (-59);
                                            i32 = ((iM55684 ^ i30) * (-21711)) ^ 366704644;
                                            i33 = -1329308392;
                                        }
                                        break;
                                    case -1372056306:
                                    case -1075298811:
                                        if (C1003.f81929 <= 0) {
                                            iM55684 = (C0873.m55680("ۚۙ") ^ i31) * 73;
                                            i32 = ((iM55684 ^ i30) * (-24283)) ^ (-1996980154);
                                            i33 = 222269476;
                                        } else {
                                            iM55684 = C0873.m55680("۫ۗ") ^ i31;
                                            i32 = ((iM55684 ^ i30) * (-25893)) ^ (-1697733746);
                                            i33 = 1567022602;
                                        }
                                        break;
                                    case -960696580:
                                    case 1491296979:
                                        if (!C0967.m56074()) {
                                            iM55684 = C0946.m55979("ۚۘ") ^ i30;
                                            i32 = ((iM55684 ^ i31) * 17787) ^ (-674488591);
                                            i33 = -1435976970;
                                        } else {
                                            iM55684 = (i31 - C0873.m55680("ۤۨ")) * (-109);
                                            i32 = ((iM55684 ^ i30) * 20043) ^ (-1594315102);
                                            i33 = 1247432188;
                                        }
                                        break;
                                    case -555240435:
                                    case 1266519071:
                                        if (C1048.f81963) {
                                            iM55684 = C0946.m55979("ܽ֡") ^ i30;
                                            i32 = ((iM55684 ^ i31) * (-29489)) ^ (-2059470821);
                                            i33 = -1272213265;
                                        } else {
                                            iM55684 = (i31 - C0873.m55680("ۤۨ")) * (-109);
                                            i32 = ((iM55684 ^ i30) * 20043) ^ (-1594315102);
                                            i33 = 1247432188;
                                        }
                                        break;
                                    case -482121005:
                                    case 1015860971:
                                        return;
                                    case -360668729:
                                    case -48299338:
                                        this.f9255 = c24995;
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM55684 = (i30 - C0946.m55979("ܿۨ")) * (-49);
                                            i32 = ((iM55684 ^ i31) * 26989) ^ (-1089175371);
                                            i33 = 996068486;
                                        } else {
                                            iM55684 = C0946.m55979("ۙܺ") ^ i30;
                                            i32 = ((iM55684 ^ i31) * (-24977)) ^ 2131216454;
                                            i33 = -893163038;
                                        }
                                        break;
                                    case -14633856:
                                    case 2002286343:
                                        if (C1071.f81975 <= 0) {
                                            iM55684 = (i30 - C0946.m55979("ܿۨ")) * (-49);
                                            i32 = ((iM55684 ^ i31) * 26989) ^ (-1089175371);
                                            i33 = 996068486;
                                        } else {
                                            iM55684 = C0873.m55680("᩶ۜ") ^ i31;
                                            i32 = ((iM55684 ^ i30) * 18695) ^ (-1653535302);
                                            i33 = 86705085;
                                        }
                                        break;
                                    case 369463525:
                                    case 1970507431:
                                        if (C0866.f81837 >= 0) {
                                            iM55684 = (i31 - C0946.m55979("᩹֫")) * (-113);
                                            i32 = ((iM55684 ^ i30) * 22135) ^ (-1948960971);
                                            i33 = -1876650490;
                                        } else {
                                            iM55684 = C0946.m55979("᩶᩹") ^ i31;
                                            i32 = ((iM55684 ^ i30) * 23825) ^ (-494974061);
                                            i33 = -64386442;
                                        }
                                        break;
                                    default:
                                        if (C0882.f81846) {
                                            iM55684 = C0946.m55979("ۚۘ") ^ i30;
                                            i32 = ((iM55684 ^ i31) * 17787) ^ (-674488591);
                                            i33 = -1435976970;
                                        } else {
                                            iM55684 = C0873.m55680("ۢ᩶") ^ i31;
                                            i32 = ((iM55684 ^ i30) * 12591) ^ 1739796016;
                                            i33 = -1437482336;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C24995 c24996 = null;
                            int i29 = 1083917342;
                            int i30 = C0873.f81841;
                            int i31 = C0930.f81879;
                            int iM559717 = (C0946.m55979("ۡܺ") + i31) * (-65);
                            int i32 = ((iM559717 ^ i30) * (-31689)) ^ (-114354466);
                            int i33 = 1838286320;
                            while (true) {
                                i29 = ((((i29 ^ i30) * 22589) >> 31) & i32) ^ (iM559717 ^ i33);
                                switch (i29) {
                                    case -1808337098:
                                    case 1136589279:
                                        if (C0892.f81851) {
                                            iM559717 = C0946.m55979("ܶ᩸") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 13129) ^ (-1522410596);
                                            i33 = 273493581;
                                        } else {
                                            iM559717 = C0873.m55680("᩹ܺ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 14159) ^ (-1357290746);
                                            i33 = 1698279018;
                                        }
                                        break;
                                    case -1668682636:
                                    case -1453225500:
                                        if (C1124.f82007 >= 0) {
                                            iM559717 = C0873.m55680("᩹ܺ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 14159) ^ (-1357290746);
                                            i33 = 1698279018;
                                        } else {
                                            iM559717 = (C0873.m55680("ۧۙ") + i30) * 65;
                                            i32 = ((iM559717 ^ i31) * (-7857)) ^ (-299058533);
                                            i33 = 1150954439;
                                        }
                                        break;
                                    case -1614387822:
                                    case -1235978671:
                                        if (C0863.f81833 > 0) {
                                            iM559717 = C0946.m55979("۟ۜ") ^ i30;
                                            i32 = ((iM559717 ^ i31) * (-3561)) ^ (-2097169485);
                                            i33 = 1702673122;
                                        } else {
                                            iM559717 = C0873.m55680("᩹ܺ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 14159) ^ (-1357290746);
                                            i33 = 1698279018;
                                        }
                                        break;
                                    case -1502129010:
                                    case 1277173793:
                                        if (C0854.f81826 != 0) {
                                            iM559717 = C0946.m55979("۟ۜ") ^ i30;
                                            i32 = ((iM559717 ^ i31) * (-3561)) ^ (-2097169485);
                                            i33 = 1702673122;
                                        } else {
                                            iM559717 = (i31 - C0873.m55680("ۤۧ")) * (-51);
                                            i32 = ((iM559717 ^ i30) * 8273) ^ 1796575905;
                                            i33 = 861461207;
                                        }
                                        break;
                                    case -1432535029:
                                    case -701306907:
                                        if (RunnableC0897.f81856) {
                                            iM559717 = C0873.m55680("ܽ᩺") ^ i31;
                                            i32 = ((iM559717 ^ i30) * (-9707)) ^ 1377400386;
                                            i33 = 1320661861;
                                        } else {
                                            iM559717 = C0873.m55680("᩹ܺ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 14159) ^ (-1357290746);
                                            i33 = 1698279018;
                                        }
                                        break;
                                    case -1212088067:
                                    case 1611278414:
                                        int i34 = C24995.f79786;
                                        if (C1024.f81946) {
                                            iM559717 = (i30 - C0946.m55979("ۙܳ")) * 67;
                                            i32 = ((iM559717 ^ i31) * (-30603)) ^ (-1561819347);
                                            i33 = 1396295762;
                                        } else {
                                            iM559717 = C0946.m55979("ᩳ֡") ^ i30;
                                            i32 = ((iM559717 ^ i31) * 13593) ^ 1929381653;
                                            i33 = 1767214808;
                                        }
                                        break;
                                    case -962096696:
                                    case 435256038:
                                        C0930.m55885();
                                        if (C1071.f81975 > 0) {
                                            iM559717 = (i30 - C0946.m55979("ۙܳ")) * 67;
                                            i32 = ((iM559717 ^ i31) * (-30603)) ^ (-1561819347);
                                            i33 = 1396295762;
                                        } else {
                                            iM559717 = C0873.m55680("ۚܽ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 28501) ^ 2042785676;
                                            i33 = -1317281849;
                                        }
                                        break;
                                    case -612273090:
                                    case 293149516:
                                        c24996.cancel();
                                        C0917.m55847(dialogInterfaceC2564M20553);
                                        break;
                                    case -469428190:
                                    case 798958186:
                                        if (C1024.f81946) {
                                            iM559717 = C0873.m55680("۠ۛ") ^ i30;
                                            i32 = ((iM559717 ^ i31) * 2529) ^ (-1461620027);
                                            i33 = -1676171915;
                                        } else {
                                            iM559717 = (C0873.m55680("ۚۡ") ^ i30) * (-29);
                                            i32 = ((iM559717 ^ i31) * 7197) ^ (-1769175153);
                                            i33 = 1815673862;
                                        }
                                        break;
                                    case -282270154:
                                    case 1817939105:
                                        if (C0890.f81849 == 0) {
                                            iM559717 = C0873.m55680("ۚܽ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 28501) ^ 2042785676;
                                            i33 = -1317281849;
                                        } else {
                                            iM559717 = C0873.m55680("᩹ܺ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 14159) ^ (-1357290746);
                                            i33 = 1698279018;
                                        }
                                        break;
                                    case 2480264:
                                    case 2006596594:
                                        if (C1024.f81946) {
                                            iM559717 = C0873.m55680("᩹ܺ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 14159) ^ (-1357290746);
                                            i33 = 1698279018;
                                        } else {
                                            iM559717 = C0873.m55680("ۗۖ") ^ i30;
                                            i32 = ((iM559717 ^ i31) * (-19219)) ^ (-1327756149);
                                            i33 = -1095422533;
                                        }
                                        break;
                                    case 263553793:
                                    case 1070370425:
                                        RunnableC0938.m55938();
                                        iM559717 = C0873.m55680("᩹ܺ") ^ i31;
                                        i32 = ((iM559717 ^ i30) * 14159) ^ (-1357290746);
                                        i33 = 1698279018;
                                        break;
                                    case 501271940:
                                    case 1267201149:
                                        C1053.m56327();
                                        C0955.m56025();
                                        break;
                                    case 565830667:
                                    case 870733840:
                                        c24996 = this.f9255;
                                        if (C1124.m56367() >= 0) {
                                            iM559717 = C0873.m55680("۠ۛ") ^ i30;
                                            i32 = ((iM559717 ^ i31) * 2529) ^ (-1461620027);
                                            i33 = -1676171915;
                                        } else {
                                            iM559717 = (C0946.m55979("ܽ᩵") + i31) * (-27);
                                            i32 = ((iM559717 ^ i30) * (-25399)) ^ 769265266;
                                            i33 = -898809224;
                                        }
                                        break;
                                    case 1055962553:
                                    case 1571082983:
                                        if (C0989.f81920 >= 0) {
                                            iM559717 = C0873.m55680("ۚܽ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 28501) ^ 2042785676;
                                            i33 = -1317281849;
                                        } else {
                                            iM559717 = C0946.m55979("᩹ۡ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * (-67)) ^ (-677809886);
                                            i33 = 1495556492;
                                        }
                                        break;
                                    default:
                                        if (C1003.f81929 <= 0) {
                                            iM559717 = C0946.m55979("۟ۜ") ^ i30;
                                            i32 = ((iM559717 ^ i31) * (-3561)) ^ (-2097169485);
                                            i33 = 1702673122;
                                        } else {
                                            iM559717 = (C0946.m55979("ܶۖ") ^ i30) * (-67);
                                            i32 = ((iM559717 ^ i31) * 16681) ^ 609831976;
                                            i33 = -547063942;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    buttonM56405 = C1229.m56405(dialogInterfaceC2564M20553);
                    C0898.m55802(buttonM56405, z2 ? 1 : 0);
                    C0946.m55976(buttonM56405, iM559712);
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0946.m55979("᩺۠") + i21) * 23;
                        i = ((iM55979 ^ i20) * (-2883)) ^ 1581834588;
                        i2 = 1150877771;
                    } else {
                        iM55979 = (C0946.m55979("۠۬") + i20) * 127;
                        i = ((iM55979 ^ i21) * 19619) ^ (-1434000742);
                        i2 = 1829487655;
                    }
                    i23 = iM55979 ^ i2;
                    i22 = i;
                    break;
                case -1555114411:
                case -173633142:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("ۗᩴ") ^ i20;
                        i = ((iM55979 ^ i21) * 8693) ^ 1222477245;
                        i2 = 1980983064;
                        i23 = iM55979 ^ i2;
                        i22 = i;
                    } else {
                        i9 = iM559712;
                        StringBuilder sb11 = sb3;
                        str3 = str3;
                        sArr4 = sArr4;
                        sb = sb11;
                        iM55682 = C0946.m55979("ᩴۨ") ^ i20;
                        i12 = ((iM55682 ^ i21) * (-7157)) ^ (-1287473966);
                        i14 = -1104491888;
                        i23 = iM55682 ^ i14;
                        i22 = i12;
                        iM559712 = i9;
                        StringBuilder sb12 = sb;
                        sArr4 = sArr4;
                        str3 = str3;
                        sb3 = sb12;
                    }
                    break;
                case -1538825430:
                case 1962642:
                    return dialogInterfaceC2564M20553;
                case -1510920918:
                case 409398263:
                    RunnableC0897.m55782(c7350M13468, dialogInterfaceC2564M20553, new InterfaceC3326() { // from class: l.ܽܺ᩷

                        /* JADX INFO: renamed from: ᩴܺ۟, reason: not valid java name and contains not printable characters */
                        private static final short[] f82267 = {6470, -27281};

                        /* JADX WARN: Code duplicated, block: B:61:0x0234 A[PHI: r3 r5 r6 r17
                          0x0234: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:60:0x0232, B:52:0x01da, B:23:0x0078, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
                          0x0234: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:60:0x0232, B:52:0x01da, B:23:0x0078, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
                          0x0234: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:60:0x0232, B:52:0x01da, B:23:0x0078, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
                          0x0234: PHI (r17v22 java.lang.StringBuilder) = 
                          (r17v3 java.lang.StringBuilder)
                          (r17v3 java.lang.StringBuilder)
                          (r17v20 java.lang.StringBuilder)
                          (r17v3 java.lang.StringBuilder)
                         binds: [B:60:0x0232, B:52:0x01da, B:23:0x0078, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
                        
                            if (p067l.RunnableC1014.f81941 <= 0) goto L14;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
                        
                            if (p067l.C0955.f81898 != false) goto L17;
                         */
                        @Override // p067l.InterfaceC3326
                        /* JADX INFO: renamed from: ֫ */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void mo4017(Object obj2) {
                            int iM559717;
                            int i29;
                            int i30;
                            String strM55726 = null;
                            short[] sArr6 = null;
                            char c = 0;
                            short s2 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            int i33 = 0;
                            int i34 = 0;
                            int i35 = 0;
                            short[] sArr7 = null;
                            int i36 = 1465180201;
                            int i37 = C0866.f81837;
                            int i38 = C1044.f81959;
                            int iM55684 = C0873.m55680("ۤ֡") ^ i37;
                            int i39 = ((iM55684 ^ i38) * (-29499)) ^ (-401017544);
                            int i40 = iM55684 ^ (-1469049044);
                            AbstractC5996 abstractC5996 = null;
                            while (true) {
                                StringBuilder sb13 = null;
                                while (true) {
                                    i36 = i40 ^ (i39 & (((i36 ^ i38) * 10985) >> 31));
                                    switch (i36) {
                                        case -2135736302:
                                        case 1486207310:
                                            i32 = i31 * i31;
                                            i33 = s2 * s2;
                                            i34 = 55160329;
                                            if (C0992.m56107() <= 0) {
                                                iM559717 = (C0873.m55680("ܽܺ") + i37) * (-97);
                                                i29 = ((iM559717 ^ i38) * 5441) ^ (-93222554);
                                                i30 = -1871476353;
                                            } else {
                                                iM559717 = C0873.m55680("ۜۛ") ^ i37;
                                                i29 = ((iM559717 ^ i38) * (-3783)) ^ (-633667738);
                                                i30 = 207795566;
                                            }
                                            i40 = iM559717 ^ i30;
                                            i39 = i29;
                                            break;
                                        case -2032784641:
                                        case -1597416048:
                                            C0937.m55918();
                                            C0877.m55696();
                                            iM559717 = (C0873.m55680("ܽܺ") + i37) * (-97);
                                            i29 = ((iM559717 ^ i38) * 5441) ^ (-93222554);
                                            i30 = -1871476353;
                                            i40 = iM559717 ^ i30;
                                            i39 = i29;
                                            break;
                                        case -2022032402:
                                        case 1561109821:
                                            StringBuilder sb14 = sb13;
                                            C1003.m56121(sb14, strM55726);
                                            if (C1194.m56396() <= 0) {
                                                sb13 = sb14;
                                                iM559717 = (C0946.m55979("֡᩷") + i38) * 33;
                                                i29 = ((iM559717 ^ i37) * 23513) ^ 1009836010;
                                                i30 = 352394865;
                                                i40 = iM559717 ^ i30;
                                            } else {
                                                int iM55685 = (C0873.m55680("ۛ᩸") ^ i38) * (-53);
                                                i29 = ((iM55685 ^ i37) * (-1085)) ^ 2126508832;
                                                i40 = iM55685 ^ 230345576;
                                                sb13 = sb14;
                                            }
                                            i39 = i29;
                                            break;
                                        case -1726319773:
                                        case 528804693:
                                            StringBuilder sb15 = sb13;
                                            C0845.m55589(sb15, abstractC5996.m13475());
                                            sArr7 = f82267;
                                            if (C1012.f81938 >= 0) {
                                                sb13 = sb15;
                                                iM559717 = C0873.m55680("֡ۚ") ^ i38;
                                                i29 = ((iM559717 ^ i37) * 15515) ^ 1267715643;
                                                i30 = -827817601;
                                                i40 = iM559717 ^ i30;
                                                i39 = i29;
                                            } else {
                                                int iM559718 = (C0946.m55979("᩸֫") + i38) * (-53);
                                                sb13 = sb15;
                                                i39 = ((iM559718 ^ i37) * 2467) ^ (-1014473753);
                                                i40 = iM559718 ^ 329223349;
                                            }
                                            break;
                                        case -1612565627:
                                        case -672805620:
                                            StringBuilder sb16 = sb13;
                                            strM55726 = C0890.m55726(sArr7, 1, 1, i35);
                                            if (C0946.f81894 != 0) {
                                                sb13 = sb16;
                                                iM559717 = (C0873.m55680("ܽܺ") + i37) * (-97);
                                                i29 = ((iM559717 ^ i38) * 5441) ^ (-93222554);
                                                i30 = -1871476353;
                                                i40 = iM559717 ^ i30;
                                                i39 = i29;
                                            } else {
                                                int iM559719 = C0946.m55979("֡ۧ") ^ i37;
                                                i40 = iM559719 ^ 1482283147;
                                                sb13 = sb16;
                                                i39 = ((iM559719 ^ i38) * (-51)) ^ 1217477258;
                                            }
                                            break;
                                        case -1520928774:
                                        case 161614810:
                                            sArr6 = f82267;
                                            if (RunnableC1014.m56177()) {
                                                iM559717 = (C0946.m55979("۠ۖ") ^ i37) * 3;
                                                i29 = ((iM559717 ^ i38) * 13563) ^ 429411165;
                                                i30 = 1933442291;
                                            } else {
                                                iM559717 = (C0946.m55979("֡᩷") + i38) * 33;
                                                i29 = ((iM559717 ^ i37) * 23513) ^ 1009836010;
                                                i30 = 352394865;
                                            }
                                            i40 = iM559717 ^ i30;
                                            i39 = i29;
                                            break;
                                        case -1323308189:
                                        case 1356083323:
                                            s2 = sArr6[c];
                                            i31 = s2 + 7427;
                                            if (C1404.f82149 >= 0) {
                                                iM559717 = (C0946.m55979("֡᩷") + i38) * 33;
                                                i29 = ((iM559717 ^ i37) * 23513) ^ 1009836010;
                                                i30 = 352394865;
                                            } else {
                                                iM559717 = C0873.m55680("᩸ۧ") ^ i38;
                                                i29 = ((iM559717 ^ i37) * 32501) ^ 1487407384;
                                                i30 = 149645989;
                                            }
                                            i40 = iM559717 ^ i30;
                                            i39 = i29;
                                            break;
                                        case -750700526:
                                        case 1641448432:
                                            int i41 = i33 + i34;
                                            if (i32 - (i41 + i41) > 0) {
                                                iM559717 = C0946.m55979("۬᩵") ^ i38;
                                                i29 = ((iM559717 ^ i37) * (-20169)) ^ 1041527492;
                                                i30 = 1467145237;
                                            } else {
                                                iM559717 = (C0946.m55979("ۨۛ") + i38) * 97;
                                                i29 = ((iM559717 ^ i37) * 28915) ^ (-907634497);
                                                i30 = -230760935;
                                            }
                                            i40 = iM559717 ^ i30;
                                            i39 = i29;
                                            break;
                                        case -688127150:
                                        case 1141976229:
                                            abstractC5996 = (AbstractC5996) obj2;
                                            int i42 = C24995.f79786;
                                            if (C0854.f81826 == 0) {
                                                sb13 = new StringBuilder();
                                                if (C0845.f81821 >= 0) {
                                                    iM559717 = (C0946.m55979("ܺۖ") ^ i37) * (-67);
                                                    i29 = ((iM559717 ^ i38) * 11747) ^ (-1898773949);
                                                    i30 = -1618435264;
                                                } else {
                                                    iM559717 = C0946.m55979("۬ۡ") ^ i37;
                                                    i29 = ((iM559717 ^ i38) * (-28381)) ^ 754265084;
                                                    i30 = 1178204181;
                                                }
                                                i40 = iM559717 ^ i30;
                                                i39 = i29;
                                            }
                                            break;
                                        case -550945596:
                                        case 1807300382:
                                            i35 = 11695;
                                            iM559717 = C0946.m55979("᩹ܶ") ^ i37;
                                            i29 = ((iM559717 ^ i38) * (-25455)) ^ (-1030502255);
                                            i30 = -1691270789;
                                            i40 = iM559717 ^ i30;
                                            i39 = i29;
                                            break;
                                        case -482922721:
                                        case 1146690497:
                                            C1071.m56343();
                                            break;
                                        case -296266452:
                                        case 384812204:
                                            c = 0;
                                            if (C1229.m56410() == 0) {
                                                iM559717 = C0946.m55979("֨᩸") ^ i37;
                                                i29 = ((iM559717 ^ i38) * (-27119)) ^ 100350883;
                                                i30 = -1879593048;
                                                i40 = iM559717 ^ i30;
                                                i39 = i29;
                                            }
                                            break;
                                        case 102766307:
                                        case 906456241:
                                            C1017.m56187();
                                            break;
                                        case 391994872:
                                        case 1258193160:
                                            break;
                                        case 938732500:
                                        case 2001967634:
                                            if (C1053.f81965 <= 0) {
                                                iM559717 = C0873.m55680("֡ۚ") ^ i38;
                                                i29 = ((iM559717 ^ i37) * 15515) ^ 1267715643;
                                                i30 = -827817601;
                                            } else {
                                                iM559717 = (C0946.m55979("᩺᩺") ^ i38) * 11;
                                                i29 = ((iM559717 ^ i37) * 31009) ^ 399881931;
                                                i30 = 2123655026;
                                            }
                                            i40 = iM559717 ^ i30;
                                            i39 = i29;
                                            break;
                                        case 1029643381:
                                        case 1491838194:
                                            i35 = 38218;
                                            iM559717 = C0946.m55979("᩹ܶ") ^ i37;
                                            i29 = ((iM559717 ^ i38) * (-25455)) ^ (-1030502255);
                                            i30 = -1691270789;
                                            i40 = iM559717 ^ i30;
                                            i39 = i29;
                                            break;
                                        case 1114482547:
                                        case 1190340094:
                                            if (C0882.f81846) {
                                            }
                                            iM559717 = (C0946.m55979("ܺۖ") ^ i37) * (-67);
                                            i29 = ((iM559717 ^ i38) * 11747) ^ (-1898773949);
                                            i30 = -1618435264;
                                            i40 = iM559717 ^ i30;
                                            i39 = i29;
                                            break;
                                        default:
                                            RunnableC0938.m55928(buttonM56567, C0863.m55639(sb13));
                                            break;
                                    }
                                    return;
                                }
                                int iM55686 = (C0873.m55680("᩵ۜ") ^ i38) * 77;
                                i40 = iM55686 ^ 366590187;
                                i39 = ((iM55686 ^ i37) * 7789) ^ 1522581792;
                            }
                        }
                    });
                    if (((AbstractActivityC5549) C7453.m17221(dialogInterfaceC2564M20553.m3845())) != abstractActivityC5549) {
                        sArr = sArr3;
                        i3 = i25;
                        i4 = i26;
                        StringBuilder sb13 = sb3;
                        str3 = str3;
                        sArr4 = sArr4;
                        sb = sb13;
                        int iM55684 = (C0873.m55680("۬ܿ") + i20) * (-15);
                        i23 = iM55684 ^ 696192007;
                        i22 = ((iM55684 ^ i21) * 27769) ^ (-414599400);
                        i26 = i4;
                        iM559712 = iM559712;
                        i25 = i3;
                        sArr3 = sArr;
                        StringBuilder sb14 = sb;
                        sArr4 = sArr4;
                        str3 = str3;
                        sb3 = sb14;
                    } else {
                        iM55979 = (C0873.m55680("᩸ܶ") ^ i21) * (-105);
                        i = ((iM55979 ^ i20) * 25393) ^ (-436363833);
                        i2 = 49387853;
                        i23 = iM55979 ^ i2;
                        i22 = i;
                    }
                    break;
                case -1506789645:
                case -296299780:
                    i9 = iM559712;
                    obj = null;
                    ViewOnClickListenerC0939.m55953(c20671, iM559713 ^ 2119694667, null);
                    if (C0890.f81849 == 0) {
                        iM559711 = (C0946.m55979("ܳ᩵") + i21) * 51;
                        i15 = ((iM559711 ^ i20) * (-6337)) ^ (-1184758614);
                        i16 = 601640508;
                        i23 = iM559711 ^ i16;
                        i22 = i15;
                        iM559712 = i9;
                    } else {
                        str = strM56156;
                        sb2 = sb3;
                        str2 = str3;
                        int iM55685 = (C0873.m55680("ۙ᩻") + i20) * (-35);
                        strM56156 = str;
                        i22 = ((iM55685 ^ i21) * 14639) ^ 1974572764;
                        i23 = iM55685 ^ 1818123424;
                        str3 = str2;
                        iM559712 = i9;
                        sb3 = sb2;
                    }
                    break;
                case -1255383871:
                case -1055022820:
                    C8902.m20556(dialogInterfaceC2564M55669);
                    final Button buttonM56591 = C1964.m56591(dialogInterfaceC2564M55669);
                    if (RunnableC0897.f81856) {
                        C0947.m55996(buttonM56591, new ViewOnClickListenerC10146(1));
                        C0955.m56030(m13468(), dialogInterfaceC2564M55669, new InterfaceC3326() { // from class: l.ܿܺ᩷

                            /* JADX INFO: renamed from: ۡ۟ۚ, reason: not valid java name and contains not printable characters */
                            private static final short[] f82285 = {8687, -7817};

                            /* JADX WARN: Code duplicated, block: B:62:0x023b A[PHI: r3 r16 r17
                              0x023b: PHI (r3v3 short[]) = (r3v2 short[]), (r3v2 short[]), (r3v7 short[]) binds: [B:40:0x0139, B:15:0x0054, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
                              0x023b: PHI (r16v6 l.ۘ۠ۢ) = (r16v4 l.ۘ۠ۢ), (r16v2 l.ۘ۠ۢ), (r16v2 l.ۘ۠ۢ) binds: [B:40:0x0139, B:15:0x0054, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
                              0x023b: PHI (r17v20 java.lang.StringBuilder) = (r17v7 java.lang.StringBuilder), (r17v3 java.lang.StringBuilder), (r17v3 java.lang.StringBuilder) binds: [B:40:0x0139, B:15:0x0054, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:66:0x026e A[PHI: r4
                              0x026e: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char) binds: [B:65:0x026c, B:59:0x0224, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
                            
                                if (p067l.C0873.m55678() == false) goto L18;
                             */
                            @Override // p067l.InterfaceC3326
                            /* JADX INFO: renamed from: ֫ */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void mo4017(Object obj2) {
                                int iM55686;
                                int i29;
                                int i30;
                                String strM55635 = null;
                                short[] sArr6 = null;
                                char c = 0;
                                short s2 = 0;
                                short s3 = 0;
                                int i31 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                int i34 = 0;
                                short[] sArr7 = null;
                                int i35 = -1938368193;
                                int i36 = C0845.f81821;
                                int i37 = AbstractC0942.f81890;
                                int iM559717 = C0946.m55979("ܺ᩺") ^ i37;
                                int i38 = ((iM559717 ^ i36) * (-8125)) ^ 1733340214;
                                int i39 = iM559717 ^ (-417854528);
                                AbstractC5996 abstractC5996 = null;
                                while (true) {
                                    StringBuilder sb15 = null;
                                    while (true) {
                                        i35 = i39 ^ (i38 & (((i35 ^ i36) * (-32615)) >> 31));
                                        switch (i35) {
                                            case -1992207499:
                                            case -1448534597:
                                                i34 = 52830;
                                                iM55686 = (C0946.m55979("ۚۗ") + i37) * 65;
                                                i29 = ((iM55686 ^ i36) * (-6161)) ^ (-318875511);
                                                i30 = -981259222;
                                                i39 = iM55686 ^ i30;
                                                i38 = i29;
                                                break;
                                            case -1854250564:
                                            case 1686047245:
                                                StringBuilder sb16 = sb15;
                                                strM55635 = C0863.m55635(sArr7, 1, 1, i34);
                                                if (C0947.f81895) {
                                                    sb15 = sb16;
                                                    iM55686 = C0873.m55680("᩺ۜ") ^ i36;
                                                    i29 = ((iM55686 ^ i37) * (-10753)) ^ 127513177;
                                                    i30 = -1555975298;
                                                    i39 = iM55686 ^ i30;
                                                    i38 = i29;
                                                } else {
                                                    int iM559718 = C0946.m55979("ۘ᩻") ^ i36;
                                                    i39 = iM559718 ^ (-1553307082);
                                                    sb15 = sb16;
                                                    i38 = ((iM559718 ^ i37) * (-5731)) ^ (-1533139284);
                                                    strM55635 = strM55635;
                                                }
                                                break;
                                            case -1789956269:
                                            case 1120972771:
                                                i31 = s2 * s3;
                                                i32 = s2 * s2;
                                                i33 = 2079364;
                                                if (C0946.m55980() != 0) {
                                                    iM55686 = C0873.m55680("ܿܰ") ^ i37;
                                                    i29 = ((iM55686 ^ i36) * 16639) ^ 904423975;
                                                    i30 = 482182291;
                                                } else {
                                                    iM55686 = (C0946.m55979("᩷ۛ") + i36) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                    i29 = ((iM55686 ^ i37) * (-31585)) ^ 1773064;
                                                    i30 = 523390999;
                                                }
                                                i39 = iM55686 ^ i30;
                                                i38 = i29;
                                                break;
                                            case -1313702205:
                                            case 1109235757:
                                                if (C1003.f81929 <= 0) {
                                                    iM55686 = C0873.m55680("ۖۢ") ^ i36;
                                                    i29 = ((iM55686 ^ i37) * 2211) ^ (-1748401164);
                                                    i30 = -1764177939;
                                                } else {
                                                    iM55686 = C0873.m55680("ۨ۠") ^ i36;
                                                    i29 = ((iM55686 ^ i37) * 11053) ^ (-578629219);
                                                    i30 = 576669102;
                                                }
                                                i39 = iM55686 ^ i30;
                                                i38 = i29;
                                                break;
                                            case -1149989304:
                                            case 1973284320:
                                                C0894.m55771(buttonM56591, C0845.m55591(sb15));
                                                break;
                                            case -1009767638:
                                            case -395172159:
                                                c = 0;
                                                if (C1003.f81929 <= 0) {
                                                    iM55686 = C0873.m55680("ۖۢ") ^ i36;
                                                    i29 = ((iM55686 ^ i37) * 2211) ^ (-1748401164);
                                                    i30 = -1764177939;
                                                } else {
                                                    iM55686 = C0946.m55979("ۢ۟") ^ i37;
                                                    i29 = ((iM55686 ^ i36) * 743) ^ (-433019567);
                                                    i30 = 6829637;
                                                }
                                                i39 = iM55686 ^ i30;
                                                i38 = i29;
                                                break;
                                            case -1006291222:
                                            case -821290586:
                                                abstractC5996 = (AbstractC5996) obj2;
                                                int i40 = C24995.f79786;
                                                if (C0863.f81833 > 0) {
                                                    sb15 = new StringBuilder();
                                                    if (C0930.f81879 <= 0) {
                                                        iM55686 = (C0873.m55680("ۗۗ") ^ i37) * (-117);
                                                        i29 = ((iM55686 ^ i36) * (-22609)) ^ 31620382;
                                                        i30 = 1749859249;
                                                    } else {
                                                        iM55686 = (C0946.m55979("ܰ֨") + i36) * (-21);
                                                        i29 = ((iM55686 ^ i37) * (-20591)) ^ 930307332;
                                                        i30 = 615096708;
                                                    }
                                                    i39 = iM55686 ^ i30;
                                                    i38 = i29;
                                                }
                                                break;
                                            case -571594824:
                                            case 971747498:
                                                break;
                                            case -136867682:
                                            case 2025630139:
                                                i34 = 57682;
                                                iM55686 = (C0946.m55979("ۚۗ") + i37) * 65;
                                                i29 = ((iM55686 ^ i36) * (-6161)) ^ (-318875511);
                                                i30 = -981259222;
                                                i39 = iM55686 ^ i30;
                                                i38 = i29;
                                                break;
                                            case 208290416:
                                            case 1782415160:
                                                C1036.m56257();
                                                C0906.m55809();
                                                iM55686 = C0873.m55680("᩺ۜ") ^ i36;
                                                i29 = ((iM55686 ^ i37) * (-10753)) ^ 127513177;
                                                i30 = -1555975298;
                                                i39 = iM55686 ^ i30;
                                                i38 = i29;
                                                break;
                                            case 442094936:
                                            case 1609012631:
                                                C1046.m56302();
                                                C0949.m56012();
                                                break;
                                            case 469766125:
                                            case 1607440862:
                                                StringBuilder sb17 = sb15;
                                                C1003.m56121(sb17, strM55635);
                                                if (!C0890.m55740()) {
                                                }
                                                int iM55687 = C0873.m55680("۟ۘ") ^ i37;
                                                i29 = ((iM55687 ^ i36) * (-16983)) ^ (-1927370095);
                                                i39 = iM55687 ^ (-304162286);
                                                sb15 = sb17;
                                                i38 = i29;
                                                break;
                                                break;
                                            case 580708793:
                                            case 1455580667:
                                                s2 = sArr6[c];
                                                s3 = 2884;
                                                if (RunnableC0871.f81839 >= 0) {
                                                    iM55686 = C0873.m55680("᩺ۜ") ^ i36;
                                                    i29 = ((iM55686 ^ i37) * (-10753)) ^ 127513177;
                                                    i30 = -1555975298;
                                                } else {
                                                    iM55686 = C0873.m55680("ܶܿ") ^ i36;
                                                    i29 = ((iM55686 ^ i37) * 22067) ^ (-980176253);
                                                    i30 = -1099606943;
                                                }
                                                i39 = iM55686 ^ i30;
                                                i38 = i29;
                                                break;
                                            case 1011775762:
                                            case 1786577002:
                                                if (C1028.f81950 <= 0) {
                                                }
                                                iM55686 = (C0873.m55680("ۗۗ") ^ i37) * (-117);
                                                i29 = ((iM55686 ^ i36) * (-22609)) ^ 31620382;
                                                i30 = 1749859249;
                                                i39 = iM55686 ^ i30;
                                                i38 = i29;
                                                break;
                                            case 1028941057:
                                            case 1243081921:
                                                C0898.m55800();
                                                if (C0898.m55800() > 0) {
                                                    iM55686 = C0873.m55680("ۖۢ") ^ i36;
                                                    i29 = ((iM55686 ^ i37) * 2211) ^ (-1748401164);
                                                    i30 = -1764177939;
                                                    i39 = iM55686 ^ i30;
                                                    i38 = i29;
                                                }
                                                break;
                                            case 1067912676:
                                            case 1956875136:
                                                if (i31 - (i32 + i33) <= 0) {
                                                    iM55686 = (C0946.m55979("۬ۡ") + i37) * 31;
                                                    i29 = ((iM55686 ^ i36) * 22299) ^ 1587214388;
                                                    i30 = -1995070826;
                                                } else {
                                                    iM55686 = C0946.m55979("۟۫") ^ i36;
                                                    i29 = ((iM55686 ^ i37) * (-6045)) ^ 1977984546;
                                                    i30 = 1426905884;
                                                }
                                                i39 = iM55686 ^ i30;
                                                i38 = i29;
                                                break;
                                            case 1657305733:
                                            case 2027330595:
                                                StringBuilder sb18 = sb15;
                                                C0845.m55589(sb18, abstractC5996.m13475());
                                                sArr7 = f82285;
                                                if (C1044.f81959 >= 0) {
                                                    sb15 = sb18;
                                                    iM55686 = C0873.m55680("ܿܰ") ^ i37;
                                                    i29 = ((iM55686 ^ i36) * 16639) ^ 904423975;
                                                    i30 = 482182291;
                                                    i39 = iM55686 ^ i30;
                                                    i38 = i29;
                                                } else {
                                                    int iM55688 = (C0873.m55680("ۚܶ") ^ i37) * (-29);
                                                    sb15 = sb18;
                                                    i38 = ((iM55688 ^ i36) * 5937) ^ 812208871;
                                                    i39 = iM55688 ^ (-1077012031);
                                                }
                                                break;
                                            default:
                                                sArr6 = f82285;
                                                if (AbstractC0942.f81890 <= 0) {
                                                    iM55686 = (C0873.m55680("ۗۗ") ^ i37) * (-117);
                                                    i29 = ((iM55686 ^ i36) * (-22609)) ^ 31620382;
                                                    i30 = 1749859249;
                                                } else {
                                                    iM55686 = (i37 - C0946.m55979("ᩳ᩹")) * (-123);
                                                    i29 = ((iM55686 ^ i36) * (-8287)) ^ 1117357425;
                                                    i30 = -1636590533;
                                                }
                                                i39 = iM55686 ^ i30;
                                                i38 = i29;
                                                break;
                                        }
                                        return;
                                    }
                                    int iM55689 = (C0873.m55680("֡ܳ") ^ i37) * (-85);
                                    i39 = iM55689 ^ 9510161;
                                    i38 = ((iM55689 ^ i36) * (-8627)) ^ 718130978;
                                }
                            }
                        });
                        return dialogInterfaceC2564M55669;
                    }
                    i9 = iM559712;
                    str = strM56156;
                    sb2 = sb3;
                    str2 = str3;
                    int iM55686 = (C0873.m55680("ۙ᩻") + i20) * (-35);
                    strM56156 = str;
                    i22 = ((iM55686 ^ i21) * 14639) ^ 1974572764;
                    i23 = iM55686 ^ 1818123424;
                    str3 = str2;
                    iM559712 = i9;
                    sb3 = sb2;
                    break;
                case -1200286464:
                case 1881945043:
                    break;
                case -1152470216:
                case 1856198686:
                    int i29 = iM559712;
                    short[] sArr6 = sArr3;
                    int i30 = i25;
                    int i31 = i26;
                    StringBuilder sb15 = sb3;
                    str3 = str3;
                    sArr4 = sArr4;
                    sb = sb15;
                    strM56156 = ServiceConnectionC1013.m56156(C0946.m55979(C0890.m55726(sArr6, i30, i31, i24)) ^ 2121907399);
                    int iM559717 = C0946.m55979("᩺ۡ") ^ i20;
                    sArr = sArr6;
                    i22 = ((iM559717 ^ i21) * 31823) ^ (-1198104753);
                    i23 = iM559717 ^ (-1584870515);
                    i25 = i30;
                    i26 = i31;
                    iM559712 = i29;
                    sArr3 = sArr;
                    StringBuilder sb16 = sb;
                    sArr4 = sArr4;
                    str3 = str3;
                    sb3 = sb16;
                    break;
                case -1014628681:
                case 530555026:
                    if (!C0866.m55648(dialogInterfaceC2564M20553)) {
                        sArr = sArr3;
                        i3 = i25;
                        i4 = i26;
                        StringBuilder sb17 = sb3;
                        str3 = str3;
                        sArr4 = sArr4;
                        sb = sb17;
                        int iM55687 = (C0873.m55680("۬ܿ") + i20) * (-15);
                        i23 = iM55687 ^ 696192007;
                        i22 = ((iM55687 ^ i21) * 27769) ^ (-414599400);
                        i26 = i4;
                        iM559712 = iM559712;
                        i25 = i3;
                        sArr3 = sArr;
                        StringBuilder sb18 = sb;
                        sArr4 = sArr4;
                        str3 = str3;
                        sb3 = sb18;
                    } else {
                        iM55979 = (C0873.m55680("ܶ۫") ^ i20) * 123;
                        i = ((iM55979 ^ i21) * (-26751)) ^ 1951296467;
                        i2 = 1169712292;
                        i23 = iM55979 ^ i2;
                        i22 = i;
                    }
                    break;
                case -977749851:
                case 1783179976:
                    i9 = iM559712;
                    StringBuilder sb19 = sb3;
                    str3 = str3;
                    sArr4 = sArr4;
                    sb = sb19;
                    sArr3 = f83061;
                    i25 = 167;
                    i26 = 3;
                    if (C0947.f81895) {
                        iM55682 = C0946.m55979("ᩴۨ") ^ i20;
                        i12 = ((iM55682 ^ i21) * (-7157)) ^ (-1287473966);
                        i14 = -1104491888;
                    } else {
                        iM55682 = (C0873.m55680("᩷ܿ") + i21) * (-7);
                        i12 = ((iM55682 ^ i20) * (-16977)) ^ (-2028762897);
                        i14 = -1726133681;
                    }
                    i23 = iM55682 ^ i14;
                    i22 = i12;
                    iM559712 = i9;
                    StringBuilder sb110 = sb;
                    sArr4 = sArr4;
                    str3 = str3;
                    sb3 = sb110;
                    break;
                case -858520136:
                case 873763604:
                    i9 = iM559712;
                    z = z2 ? 1 : 0;
                    sArr2 = sArr3;
                    i10 = i25;
                    i11 = i26;
                    StringBuilder sb20 = sb3;
                    str3 = str3;
                    sArr4 = sArr4;
                    sb = sb20;
                    strM13492 = c24995.m13492(C0894.m55773(f83061, 145, 11, i24));
                    iM55681 = C0873.m55680("۠ۘ") ^ i21;
                    i12 = ((iM55681 ^ i20) * (-15483)) ^ 1278490996;
                    i13 = 981274429;
                    int i210 = iM55681 ^ i13;
                    i26 = i11;
                    i25 = i10;
                    sArr3 = sArr2;
                    z2 = z;
                    i23 = i210;
                    i22 = i12;
                    iM559712 = i9;
                    StringBuilder sb111 = sb;
                    sArr4 = sArr4;
                    str3 = str3;
                    sb3 = sb111;
                    break;
                case -518645152:
                case 1528705745:
                    i9 = iM559712;
                    iM559713 = C0946.m55979(C0955.m56029(f83061, 171, 3, i24));
                    iM559711 = C0873.m55680("ܺۤ") ^ i20;
                    i15 = ((iM559711 ^ i21) * 29827) ^ 1614410520;
                    i16 = 1254565225;
                    i23 = iM559711 ^ i16;
                    i22 = i15;
                    iM559712 = i9;
                    break;
                case -496752477:
                case 1465889040:
                    C1048.m56304(buttonM56405, new ViewOnClickListenerC12926(0, dialogInterfaceC2564M20553));
                    buttonM56567 = C1929.m56567(dialogInterfaceC2564M20553);
                    z3 = true;
                    if (C0882.f81846) {
                        iM55979 = C0873.m55680("ۗᩴ") ^ i20;
                        i = ((iM55979 ^ i21) * 8693) ^ 1222477245;
                        i2 = 1980983064;
                    } else {
                        iM55979 = C0873.m55680("ܿۙ") ^ i21;
                        i = ((iM55979 ^ i20) * 31131) ^ 1938702575;
                        i2 = -1622626094;
                    }
                    i23 = iM55979 ^ i2;
                    i22 = i;
                    break;
                case -479906146:
                case 492705341:
                    sb = sb3;
                    i24 = 58125;
                    iM559710 = C0946.m55979("ۨ۬") ^ i21;
                    i22 = ((iM559710 ^ i20) * (-8015)) ^ (-1068325029);
                    i5 = 1444317930;
                    i8 = iM559710 ^ i5;
                    i26 = i26;
                    iM559712 = iM559712;
                    i25 = i25;
                    sArr3 = sArr3;
                    z2 = z2;
                    i23 = i8;
                    c24995 = this;
                    StringBuilder sb112 = sb;
                    sArr4 = sArr4;
                    str3 = str3;
                    sb3 = sb112;
                    break;
                case -404319575:
                case 1935709617:
                    sb = sb3;
                    boolean z5 = c24995.f79788;
                    strM56584 = C1964.m56584(f83061, 142, 3, i24);
                    int iM55688 = C0873.m55680("ᩳ֨") ^ i21;
                    i6 = ((iM55688 ^ i20) * 6707) ^ 20955409;
                    i8 = iM55688 ^ 571236606;
                    z4 = z5;
                    i22 = i6;
                    i26 = i26;
                    iM559712 = iM559712;
                    i25 = i25;
                    sArr3 = sArr3;
                    z2 = z2;
                    i23 = i8;
                    c24995 = this;
                    StringBuilder sb113 = sb;
                    sArr4 = sArr4;
                    str3 = str3;
                    sb3 = sb113;
                    break;
                case -113661919:
                case 1655859842:
                    i9 = iM559712;
                    short[] sArr7 = sArr4;
                    sb2 = sb3;
                    C1003.m56121(sb2, C0946.m55986(sArr7, i27, 1, i24));
                    C0912.m55825(sb2, strM13492);
                    c20671.m46730(C0863.m55639(sb2));
                    String str4 = str3;
                    C0992.m56104(c20671, str4);
                    if (C1964.f83032 <= 0) {
                        str2 = str4;
                        sArr4 = sArr7;
                        str = strM56156;
                        int iM55689 = (C0873.m55680("ۙ᩻") + i20) * (-35);
                        strM56156 = str;
                        i22 = ((iM55689 ^ i21) * 14639) ^ 1974572764;
                        i23 = iM55689 ^ 1818123424;
                    } else {
                        int iM556810 = C0873.m55680("ۛۖ") ^ i21;
                        str2 = str4;
                        i22 = ((iM556810 ^ i20) * 17989) ^ (-2021010259);
                        i23 = iM556810 ^ (-353489715);
                        sArr4 = sArr7;
                    }
                    str3 = str2;
                    iM559712 = i9;
                    sb3 = sb2;
                    break;
                case 10548292:
                case 109919004:
                    C0873.m55678();
                    i9 = iM559712;
                    StringBuilder sb114 = sb3;
                    str3 = str3;
                    sArr4 = sArr4;
                    sb = sb114;
                    iM55682 = C0946.m55979("ᩴۨ") ^ i20;
                    i12 = ((iM55682 ^ i21) * (-7157)) ^ (-1287473966);
                    i14 = -1104491888;
                    i23 = iM55682 ^ i14;
                    i22 = i12;
                    iM559712 = i9;
                    StringBuilder sb115 = sb;
                    sArr4 = sArr4;
                    str3 = str3;
                    sb3 = sb115;
                    break;
                case 129108854:
                case 1400231816:
                    sb = sb3;
                    short s2 = s;
                    if ((i17 + i18) - (s2 * 9040) < 0) {
                        iM55680 = (i20 - C0946.m55979("᩻᩻")) * (-81);
                        i6 = ((iM55680 ^ i21) * 24695) ^ (-1817300631);
                        i7 = -1948442253;
                    } else {
                        iM55680 = C0873.m55680("ۢܶ") ^ i21;
                        i6 = ((iM55680 ^ i20) * (-1063)) ^ 1243826056;
                        i7 = -1397878802;
                    }
                    i8 = iM55680 ^ i7;
                    s = s2;
                    i22 = i6;
                    i26 = i26;
                    iM559712 = iM559712;
                    i25 = i25;
                    sArr3 = sArr3;
                    z2 = z2;
                    i23 = i8;
                    c24995 = this;
                    StringBuilder sb116 = sb;
                    sArr4 = sArr4;
                    str3 = str3;
                    sb3 = sb116;
                    break;
                case 347640249:
                case 2077438337:
                    c24995.f79788 = z2;
                    dialogInterfaceC2564M20553 = C8902.m20553();
                    if (dialogInterfaceC2564M20553 == null) {
                        sArr = sArr3;
                        i3 = i25;
                        i4 = i26;
                        StringBuilder sb117 = sb3;
                        str3 = str3;
                        sArr4 = sArr4;
                        sb = sb117;
                        int iM556811 = (C0873.m55680("۬ܿ") + i20) * (-15);
                        i23 = iM556811 ^ 696192007;
                        i22 = ((iM556811 ^ i21) * 27769) ^ (-414599400);
                        i26 = i4;
                        iM559712 = iM559712;
                        i25 = i3;
                        sArr3 = sArr;
                        StringBuilder sb118 = sb;
                        sArr4 = sArr4;
                        str3 = str3;
                        sb3 = sb118;
                    } else {
                        iM55979 = (C0946.m55979("᩻ܺ") ^ i21) * 67;
                        i = ((iM55979 ^ i20) * (-3007)) ^ 958114653;
                        i2 = -1924799846;
                        i23 = iM55979 ^ i2;
                        i22 = i;
                    }
                    break;
                case 783848175:
                case 1437864607:
                    C1929.m56554(buttonM56567, z3);
                    C0947.m55996(buttonM56567, new ViewOnClickListenerC10146(1));
                    c7350M13468 = m13468();
                    if (C0863.f81833 > 0) {
                        iM55979 = C0873.m55680("ۤܳ") ^ i20;
                        i = ((iM55979 ^ i21) * 10049) ^ 1770730533;
                        i2 = 1225131157;
                        i23 = iM55979 ^ i2;
                        i22 = i;
                    } else {
                        i9 = iM559712;
                        str = strM56156;
                        sb2 = sb3;
                        str2 = str3;
                        int iM556812 = (C0873.m55680("ۙ᩻") + i20) * (-35);
                        strM56156 = str;
                        i22 = ((iM556812 ^ i21) * 14639) ^ 1974572764;
                        i23 = iM556812 ^ 1818123424;
                        str3 = str2;
                        iM559712 = i9;
                        sb3 = sb2;
                    }
                    break;
                case 854899471:
                case 902158205:
                    short[] sArr8 = sArr4;
                    String strM13493 = c24995.m13492(strM56336);
                    C20671 c20671M55888 = C0930.m55888(abstractActivityC5549);
                    C0930.m55881(c20671M55888, z2);
                    sb3 = new StringBuilder();
                    int iM556813 = C0873.m55680("ۘᩳ") ^ i20;
                    i22 = ((iM556813 ^ i21) * 2711) ^ (-2119787239);
                    i23 = iM556813 ^ 693085006;
                    i25 = i25;
                    i26 = i26;
                    sArr4 = sArr8;
                    iM559712 = iM559712;
                    sArr3 = sArr3;
                    str3 = strM13493;
                    c20671 = c20671M55888;
                    break;
                case 1299973466:
                case 1546849125:
                    i9 = iM559712;
                    str = strM56156;
                    sb2 = sb3;
                    str2 = str3;
                    C0912.m55825(sb2, str);
                    sArr4 = f83061;
                    i27 = 170;
                    if (C1053.f81965 <= 0) {
                        int iM556814 = (C0873.m55680("ۙ᩻") + i20) * (-35);
                        strM56156 = str;
                        i22 = ((iM556814 ^ i21) * 14639) ^ 1974572764;
                        i23 = iM556814 ^ 1818123424;
                    } else {
                        strM56156 = str;
                        int iM559718 = (C0946.m55979("۬᩸") + i21) * (-123);
                        i23 = iM559718 ^ 2045038142;
                        i22 = ((iM559718 ^ i20) * (-7883)) ^ (-1484925352);
                    }
                    str3 = str2;
                    iM559712 = i9;
                    sb3 = sb2;
                    break;
                case 1358251607:
                case 2025841752:
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.ᩳܺ᩷
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i32) {
                            int i33 = -1889229838;
                            int i34 = C0912.f81867;
                            int i35 = ViewOnClickListenerC0939.f81888;
                            int iM556815 = (C0873.m55680("᩺᩸") + i35) * (-67);
                            int i36 = ((iM556815 ^ i34) * 20057) ^ (-270888799);
                            int i37 = 1792785269;
                            while (true) {
                                i33 = ((((i33 ^ i34) * 30629) >> 31) & i36) ^ (iM556815 ^ i37);
                                switch (i33) {
                                    case -2132505030:
                                    case 535383445:
                                        C0955.m56025();
                                        if (!C0927.f81875) {
                                            iM556815 = C0946.m55979("ܳܿ") ^ i34;
                                            i36 = ((iM556815 ^ i35) * (-3205)) ^ 601619205;
                                            i37 = 146255362;
                                        } else {
                                            iM556815 = C0946.m55979("᩺֨") ^ i35;
                                            i36 = ((iM556815 ^ i34) * (-4217)) ^ (-68817802);
                                            i37 = 849646799;
                                        }
                                        break;
                                    case -2074329731:
                                    case -855921699:
                                        int i38 = C24995.f79786;
                                        this.f59684.cancel();
                                        break;
                                    case -1976798449:
                                    case -1204931726:
                                        if (C0912.f81867 <= 0) {
                                            iM556815 = C0946.m55979("᩺֨") ^ i35;
                                            i36 = ((iM556815 ^ i34) * (-4217)) ^ (-68817802);
                                            i37 = 849646799;
                                        } else {
                                            iM556815 = (C0946.m55979("۠᩻") + i35) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i36 = ((iM556815 ^ i34) * (-6009)) ^ (-161596134);
                                            i37 = 2068573757;
                                        }
                                        break;
                                    case -1900514942:
                                    case 44387414:
                                        if (C0930.f81879 <= 0) {
                                            iM556815 = C0946.m55979("ۛ֡") ^ i35;
                                            i36 = ((iM556815 ^ i34) * 11853) ^ (-1308005202);
                                            i37 = -725094357;
                                        } else {
                                            iM556815 = C0946.m55979("ۜܳ") ^ i34;
                                            i36 = ((iM556815 ^ i35) * (-687)) ^ 1593851940;
                                            i37 = 2120974066;
                                        }
                                        break;
                                    case -1870015237:
                                    case 1719929494:
                                        C0882.m55710();
                                        if (C1124.f82007 < 0) {
                                            iM556815 = C0946.m55979("ܳܿ") ^ i34;
                                            i36 = ((iM556815 ^ i35) * (-3205)) ^ 601619205;
                                            i37 = 146255362;
                                        } else {
                                            iM556815 = C0873.m55680("ۚ۠") ^ i35;
                                            i36 = ((iM556815 ^ i34) * 20065) ^ (-609380);
                                            i37 = -1919071722;
                                        }
                                        break;
                                    case -1827278060:
                                    case 1818457496:
                                        if (C1036.f81953 >= 0) {
                                            iM556815 = (C0873.m55680("ܶܳ") + i34) * (-57);
                                            i36 = ((iM556815 ^ i35) * (-18073)) ^ (-155047581);
                                            i37 = 488073687;
                                        } else {
                                            iM556815 = C0873.m55680("ܳ۬") ^ i35;
                                            i36 = ((iM556815 ^ i34) * (-31449)) ^ (-1482841671);
                                            i37 = -1392258247;
                                        }
                                        break;
                                    case -1808286296:
                                    case 448889518:
                                        if (C0890.m55740()) {
                                            iM556815 = C0946.m55979("ۛ᩵") ^ i34;
                                            i36 = ((iM556815 ^ i35) * (-28455)) ^ 661062668;
                                            i37 = -907655583;
                                        } else {
                                            iM556815 = C0946.m55979("ܳܿ") ^ i34;
                                            i36 = ((iM556815 ^ i35) * (-3205)) ^ 601619205;
                                            i37 = 146255362;
                                        }
                                        break;
                                    case -1577281725:
                                    case 2119717695:
                                        if (C0877.f81843 >= 0) {
                                            iM556815 = C0946.m55979("᩺֨") ^ i35;
                                            i36 = ((iM556815 ^ i34) * (-4217)) ^ (-68817802);
                                            i37 = 849646799;
                                        } else {
                                            iM556815 = (C0873.m55680("ۨᩴ") ^ i35) * 87;
                                            i36 = ((iM556815 ^ i34) * 31827) ^ (-1948612056);
                                            i37 = 795163713;
                                        }
                                        break;
                                    case -1575212545:
                                    case -1218119732:
                                        if (RunnableC1014.m56177()) {
                                            iM556815 = C0873.m55680("ܰ֫") ^ i34;
                                            i36 = ((iM556815 ^ i35) * 15717) ^ 1374380696;
                                            i37 = -946470254;
                                        } else {
                                            iM556815 = C0946.m55979("ۛ֡") ^ i35;
                                            i36 = ((iM556815 ^ i34) * 11853) ^ (-1308005202);
                                            i37 = -725094357;
                                        }
                                        break;
                                    case -1319202271:
                                    case 1033993905:
                                        if (C1024.f81946) {
                                            iM556815 = C0873.m55680("ۚ۠") ^ i35;
                                            i36 = ((iM556815 ^ i34) * 20065) ^ (-609380);
                                            i37 = -1919071722;
                                        } else {
                                            iM556815 = (C0873.m55680("ۙ᩻") + i34) * (-27);
                                            i36 = ((iM556815 ^ i35) * 11503) ^ (-2023578122);
                                            i37 = -1787949332;
                                        }
                                        break;
                                    case -926217334:
                                    case 1266521082:
                                        if (!C0861.m55626()) {
                                            iM556815 = (C0873.m55680("ܶܳ") + i34) * (-57);
                                            i36 = ((iM556815 ^ i35) * (-18073)) ^ (-155047581);
                                            i37 = 488073687;
                                        } else {
                                            iM556815 = C0873.m55680("ۚ۠") ^ i35;
                                            i36 = ((iM556815 ^ i34) * 20065) ^ (-609380);
                                            i37 = -1919071722;
                                        }
                                        break;
                                    case -537769629:
                                    case 1290774018:
                                        if (C0992.f81922 >= 0) {
                                            iM556815 = C0946.m55979("᩺֨") ^ i35;
                                            i36 = ((iM556815 ^ i34) * (-4217)) ^ (-68817802);
                                            i37 = 849646799;
                                        } else {
                                            iM556815 = (i35 - C0946.m55979("ۚܶ")) * 85;
                                            i36 = ((iM556815 ^ i34) * 8699) ^ 2043207319;
                                            i37 = -179496487;
                                        }
                                        break;
                                    case -115306217:
                                    case 956775928:
                                        if (C0967.m56074()) {
                                            iM556815 = (C0873.m55680("ܶܳ") + i34) * (-57);
                                            i36 = ((iM556815 ^ i35) * (-18073)) ^ (-155047581);
                                            i37 = 488073687;
                                        } else {
                                            iM556815 = (i34 - C0873.m55680("ܰۡ")) * (-123);
                                            i36 = ((iM556815 ^ i35) * 14731) ^ (-445484270);
                                            i37 = 1220952554;
                                        }
                                        break;
                                    case -88681952:
                                    case 788036867:
                                        C0927.m55873();
                                        C1929.m56553();
                                        iM556815 = C0873.m55680("ۚ۠") ^ i35;
                                        i36 = ((iM556815 ^ i34) * 20065) ^ (-609380);
                                        i37 = -1919071722;
                                        break;
                                    case 623942149:
                                    case 807496543:
                                        if (C0930.f81879 <= 0) {
                                            iM556815 = (C0873.m55680("ܶܳ") + i34) * (-57);
                                            i36 = ((iM556815 ^ i35) * (-18073)) ^ (-155047581);
                                            i37 = 488073687;
                                        } else {
                                            iM556815 = (C0873.m55680("᩶ۛ") + i35) * (-17);
                                            i36 = ((iM556815 ^ i34) * 25127) ^ (-251292220);
                                            i37 = 1808688818;
                                        }
                                        break;
                                    default:
                                        C0866.m55645();
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    i9 = iM559712;
                    iM559714 = C0946.m55979(C0894.m55773(f83061, 174, 3, i24));
                    if (C0912.f81867 > 0) {
                        iM559711 = (C0946.m55979("᩶᩺") + i20) * (-31);
                        i15 = ((iM559711 ^ i21) * (-13857)) ^ (-561239730);
                        i16 = -1263042628;
                        i23 = iM559711 ^ i16;
                        i22 = i15;
                        iM559712 = i9;
                    } else {
                        StringBuilder sb119 = sb3;
                        str3 = str3;
                        sArr4 = sArr4;
                        sb = sb119;
                        iM55682 = C0946.m55979("ᩴۨ") ^ i20;
                        i12 = ((iM55682 ^ i21) * (-7157)) ^ (-1287473966);
                        i14 = -1104491888;
                        i23 = iM55682 ^ i14;
                        i22 = i12;
                        iM559712 = i9;
                        StringBuilder sb1110 = sb;
                        sArr4 = sArr4;
                        str3 = str3;
                        sb3 = sb1110;
                    }
                    break;
                case 1390282004:
                case 1818465191:
                    ViewOnClickListenerC0939.m55941();
                    return null;
                default:
                    if (C1194.f82045 == 0) {
                        iM55979 = (C0946.m55979("᩺۠") + i21) * 23;
                        i = ((iM55979 ^ i20) * (-2883)) ^ 1581834588;
                        i2 = 1150877771;
                        i23 = iM55979 ^ i2;
                        i22 = i;
                    } else {
                        i9 = iM559712;
                        z = z2 ? 1 : 0;
                        sArr2 = sArr3;
                        i10 = i25;
                        i11 = i26;
                        StringBuilder sb21 = sb3;
                        str3 = str3;
                        sArr4 = sArr4;
                        sb = sb21;
                        iM55681 = C0946.m55979("ۢ֨") ^ i21;
                        i12 = ((iM55681 ^ i20) * (-23577)) ^ 395944815;
                        i13 = -1216535203;
                        int i211 = iM55681 ^ i13;
                        i26 = i11;
                        i25 = i10;
                        sArr3 = sArr2;
                        z2 = z;
                        i23 = i211;
                        i22 = i12;
                        iM559712 = i9;
                        StringBuilder sb1111 = sb;
                        sArr4 = sArr4;
                        str3 = str3;
                        sb3 = sb1111;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        int iM55979;
        int i;
        short s;
        int iM55680;
        int i2;
        int i3;
        int iM559710;
        int i4;
        C24995 c24995 = this;
        int i5 = C1012.f81938;
        int i6 = C0912.f81867;
        int iM55681 = (C0873.m55680("᩷۟") ^ i5) * 37;
        int i7 = ((iM55681 ^ i6) * (-1107)) ^ 476144460;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM55681 ^ (-975224750);
        String strM56252 = null;
        int iM559711 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        int i18 = 378254714;
        short s2 = 0;
        while (true) {
            i18 = i8 ^ (i7 & (((i18 ^ i6) * 16725) >> 31));
            switch (i18) {
                case -2087213558:
                case -1307593174:
                    sArr2 = f83061;
                    i16 = 178;
                    i17 = 3;
                    if (C0898.m55800() > 0) {
                        iM559710 = (i6 - C0946.m55979("᩵ܳ")) * (-53);
                        i2 = ((iM559710 ^ i5) * 537) ^ 10901819;
                        i4 = 1008484586;
                        i8 = iM559710 ^ i4;
                        i7 = i2;
                    } else {
                        s = s2;
                        int iM55682 = (C0873.m55680("۠ᩳ") + i6) * 27;
                        i8 = iM55682 ^ 819868638;
                        s2 = s;
                        i7 = ((iM55682 ^ i5) * 29591) ^ (-1447195241);
                        c24995 = this;
                    }
                    break;
                case -1943555345:
                case -1327671799:
                    C1028.m56239(c24995, 2130028891 ^ iM559711);
                    if (C0873.f81841 > 0) {
                        iM559710 = C0946.m55979("ܺۤ") ^ i6;
                        i2 = ((iM559710 ^ i5) * (-21713)) ^ (-1719271919);
                        i4 = -1306319778;
                        i8 = iM559710 ^ i4;
                        i7 = i2;
                    } else {
                        s = s2;
                        iM55680 = C0946.m55979("֨۟") ^ i6;
                        i2 = ((iM55680 ^ i5) * (-7259)) ^ 832971189;
                        i3 = -366296622;
                        i8 = iM55680 ^ i3;
                        c24995 = this;
                        s2 = s;
                        i7 = i2;
                    }
                    break;
                case -1928787957:
                case -883400719:
                    C0873.m55686(c24995, c24995.m13453(strM56252));
                    c24995.mo13474(0);
                    break;
                case -1653764129:
                case 1338892415:
                    C0890.m55740();
                    break;
                case -1444893583:
                case 1766712659:
                    C1028.m56247();
                    if (C1964.f83032 > 0) {
                        iM559710 = (C0873.m55680("ۛܳ") ^ i5) * (-59);
                        i2 = ((iM559710 ^ i6) * (-16955)) ^ 1682450316;
                        i4 = 824356671;
                        i8 = iM559710 ^ i4;
                        i7 = i2;
                    }
                    s = s2;
                    iM55680 = (C0946.m55979("᩻᩶") + i5) * (-103);
                    i2 = ((iM55680 ^ i6) * (-6283)) ^ (-205287958);
                    i3 = 1209212260;
                    i8 = iM55680 ^ i3;
                    c24995 = this;
                    s2 = s;
                    i7 = i2;
                    break;
                case -1395467634:
                case 440936272:
                    i15 = 39054;
                    iM559710 = C0873.m55680("᩶ۘ") ^ i6;
                    i2 = ((iM559710 ^ i5) * 31923) ^ 846374746;
                    i4 = -238659940;
                    i8 = iM559710 ^ i4;
                    i7 = i2;
                    break;
                case -1213744374:
                case 1185560971:
                    s2 = sArr[c];
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("ۨۨ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 13797) ^ 217164428;
                        i = 679021047;
                    } else {
                        iM55979 = C0946.m55979("᩻ܺ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 29153) ^ 1525301249;
                        i = 1709272061;
                    }
                    i8 = iM55979 ^ i;
                    c24995 = this;
                    break;
                case -926626199:
                case -877161416:
                    iM559711 = C0946.m55979(C1046.m56293(sArr2, i16, i17, i15));
                    if (C1404.f82149 < 0) {
                        iM559710 = (C0873.m55680("ۖ᩷") + i5) * 55;
                        i2 = ((iM559710 ^ i6) * 15321) ^ (-1597388763);
                        i4 = 1464834662;
                        i8 = iM559710 ^ i4;
                        i7 = i2;
                    }
                    s = s2;
                    iM55680 = (C0946.m55979("᩻᩶") + i5) * (-103);
                    i2 = ((iM55680 ^ i6) * (-6283)) ^ (-205287958);
                    i3 = 1209212260;
                    i8 = iM55680 ^ i3;
                    c24995 = this;
                    s2 = s;
                    i7 = i2;
                    break;
                case -789181238:
                case 1396372104:
                    s = s2;
                    i11 = s + 10533;
                    if (C0894.f81854 < 0) {
                        iM55680 = (C0873.m55680("᩶ۗ") ^ i6) * (-87);
                        i2 = ((iM55680 ^ i5) * (-22191)) ^ 1454773837;
                        i3 = 529103306;
                        i8 = iM55680 ^ i3;
                        c24995 = this;
                        s2 = s;
                        i7 = i2;
                    } else {
                        int iM55683 = (C0873.m55680("۠ᩳ") + i6) * 27;
                        i8 = iM55683 ^ 819868638;
                        s2 = s;
                        i7 = ((iM55683 ^ i5) * 29591) ^ (-1447195241);
                        c24995 = this;
                    }
                    break;
                case -685226342:
                case -373314126:
                    s = s2;
                    sArr = f83061;
                    if (C0955.f81898) {
                        iM55680 = (C0946.m55979("᩻᩶") + i5) * (-103);
                        i2 = ((iM55680 ^ i6) * (-6283)) ^ (-205287958);
                        i3 = 1209212260;
                    } else {
                        iM55680 = (i6 - C0873.m55680("᩹᩵")) * 51;
                        i2 = ((iM55680 ^ i5) * (-23615)) ^ 2121760062;
                        i3 = -1605632842;
                    }
                    i8 = iM55680 ^ i3;
                    c24995 = this;
                    s2 = s;
                    i7 = i2;
                    break;
                case -370287689:
                case 1297665311:
                    i12 = i11 * i11;
                    i13 = s2 * s2;
                    i14 = 110944089;
                    if (C0863.f81833 > 0) {
                        iM559710 = C0946.m55979("֨ܺ") ^ i5;
                        i2 = ((iM559710 ^ i6) * (-23345)) ^ (-2117417741);
                        i4 = -2089364050;
                        i8 = iM559710 ^ i4;
                        i7 = i2;
                    } else {
                        s = s2;
                        int iM55684 = (C0873.m55680("۠ᩳ") + i6) * 27;
                        i8 = iM55684 ^ 819868638;
                        s2 = s;
                        i7 = ((iM55684 ^ i5) * 29591) ^ (-1447195241);
                        c24995 = this;
                    }
                    break;
                case -310395801:
                case 655923159:
                    i15 = 47007;
                    iM559710 = C0873.m55680("᩶ۘ") ^ i6;
                    i2 = ((iM559710 ^ i5) * 31923) ^ 846374746;
                    i4 = -238659940;
                    i8 = iM559710 ^ i4;
                    i7 = i2;
                    break;
                case -236381920:
                case 313974011:
                    sArr3 = f83061;
                    i9 = 181;
                    i10 = 4;
                    if (C0854.m55595() < 0) {
                        iM559710 = (C0873.m55680("ۚ۟") + i5) * C0254q.f1218h;
                        i2 = ((iM559710 ^ i6) * 12809) ^ (-649762546);
                        i4 = 1235585112;
                        i8 = iM559710 ^ i4;
                        i7 = i2;
                    } else {
                        s = s2;
                        int iM55685 = (C0873.m55680("۠ᩳ") + i6) * 27;
                        i8 = iM55685 ^ 819868638;
                        s2 = s;
                        i7 = ((iM55685 ^ i5) * 29591) ^ (-1447195241);
                        c24995 = this;
                    }
                    break;
                case 135989920:
                case 545982302:
                    s = s2;
                    c = 177;
                    if (C1048.f81963) {
                        iM55680 = (C0873.m55680("ܶ᩶") + i5) * (-67);
                        i2 = ((iM55680 ^ i6) * 25403) ^ 103250933;
                        i3 = 751635842;
                    } else {
                        iM55680 = C0946.m55979("֨۟") ^ i6;
                        i2 = ((iM55680 ^ i5) * (-7259)) ^ 832971189;
                        i3 = -366296622;
                    }
                    i8 = iM55680 ^ i3;
                    c24995 = this;
                    s2 = s;
                    i7 = i2;
                    break;
                case 379608771:
                case 383916823:
                    C0866.m55645();
                    if (!C0892.f81851) {
                        iM55979 = C0946.m55979("ۨۨ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 13797) ^ 217164428;
                        i = 679021047;
                        i8 = iM55979 ^ i;
                        c24995 = this;
                    } else {
                        s = s2;
                        iM55680 = (C0946.m55979("᩻᩶") + i5) * (-103);
                        i2 = ((iM55680 ^ i6) * (-6283)) ^ (-205287958);
                        i3 = 1209212260;
                        i8 = iM55680 ^ i3;
                        c24995 = this;
                        s2 = s;
                        i7 = i2;
                    }
                    break;
                case 587078497:
                case 922102394:
                    strM56252 = C1036.m56252(sArr3, i9, i10, i15);
                    if (C0866.f81837 < 0) {
                        iM559710 = (C0873.m55680("ۗۨ") + i6) * (-95);
                        i2 = ((iM559710 ^ i5) * (-18565)) ^ 1057072197;
                        i4 = 1517178030;
                        i8 = iM559710 ^ i4;
                        i7 = i2;
                    } else {
                        s = s2;
                        int iM55686 = (C0873.m55680("۠ᩳ") + i6) * 27;
                        i8 = iM55686 ^ 819868638;
                        s2 = s;
                        i7 = ((iM55686 ^ i5) * 29591) ^ (-1447195241);
                        c24995 = this;
                    }
                    break;
                case 912406548:
                case 1973271509:
                    int i19 = i13 + i14;
                    if (i12 - (i19 + i19) <= 0) {
                        iM559710 = C0946.m55979("᩻ۛ") ^ i6;
                        i2 = ((iM559710 ^ i5) * (-8925)) ^ (-650883030);
                        i4 = -283428134;
                    } else {
                        iM559710 = (C0946.m55979("ۡ᩷") + i5) * (-37);
                        i2 = ((iM559710 ^ i6) * 1181) ^ (-908588810);
                        i4 = -185288131;
                    }
                    i8 = iM559710 ^ i4;
                    i7 = i2;
                    break;
                case 1802074159:
                case 1988722990:
                    C0861.m55626();
                    iM55979 = C0946.m55979("ۨۨ") ^ i5;
                    i7 = ((iM55979 ^ i6) * 13797) ^ 217164428;
                    i = 679021047;
                    i8 = iM55979 ^ i;
                    c24995 = this;
                    break;
                default:
                    C1044.m56286();
                    if (C1017.f81942 < 0) {
                        s = s2;
                        int iM55687 = (C0873.m55680("۠ᩳ") + i6) * 27;
                        i8 = iM55687 ^ 819868638;
                        s2 = s;
                        i7 = ((iM55687 ^ i5) * 29591) ^ (-1447195241);
                        c24995 = this;
                    } else {
                        s = s2;
                        iM55680 = (C0946.m55979("᩻᩶") + i5) * (-103);
                        i2 = ((iM55680 ^ i6) * (-6283)) ^ (-205287958);
                        i3 = 1209212260;
                        i8 = iM55680 ^ i3;
                        c24995 = this;
                        s2 = s;
                        i7 = i2;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        int i = 1442226035;
        int i2 = C1404.f82149;
        int i3 = C0877.f81843;
        int iM55680 = C0873.m55680("᩸᩺") ^ i2;
        int i4 = ((iM55680 ^ i3) * 30641) ^ (-321943361);
        int i5 = 1161651021;
        while (true) {
            i = ((((i ^ i3) * 13641) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2097975005:
                case -1906582045:
                    C0917.m55854();
                    C0877.m55696();
                    iM55680 = C0873.m55680("ۢܺ") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-24713)) ^ 750569156;
                    i5 = -1312129340;
                    break;
                case -2004103790:
                case -98723229:
                    if (C0992.f81922 >= 0) {
                        iM55680 = (C0873.m55680("ܺ᩺") ^ i2) * 65;
                        i4 = ((iM55680 ^ i3) * (-18527)) ^ (-2004190111);
                        i5 = 268883581;
                    } else {
                        iM55680 = C0946.m55979("ۜܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 14201) ^ 1390311839;
                        i5 = -430215261;
                    }
                    break;
                case -1860957325:
                case 1647881471:
                    if (C0892.m55749()) {
                        iM55680 = C0873.m55680("ۧܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 2537) ^ (-1278923693);
                        i5 = -712585678;
                    } else {
                        iM55680 = (C0873.m55680("ܺ᩺") ^ i2) * 65;
                        i4 = ((iM55680 ^ i3) * (-18527)) ^ (-2004190111);
                        i5 = 268883581;
                    }
                    break;
                case -1589516039:
                case 352156496:
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0946.m55979("ۚ᩵") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-3437)) ^ 732452832;
                        i5 = -1395454236;
                    } else {
                        iM55680 = C0946.m55979("֨ᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-10631)) ^ (-43727118);
                        i5 = 1887031475;
                    }
                    break;
                case -1543365832:
                case 1746185834:
                    if (C0967.m56074()) {
                        iM55680 = (C0873.m55680("۟ۨ") + i3) * (-53);
                        i4 = ((iM55680 ^ i2) * (-10609)) ^ 2048760290;
                        i5 = 663551329;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ۫") ^ i2) * 27;
                        i4 = ((iM55680 ^ i3) * 5469) ^ (-431995407);
                        i5 = 1081229934;
                    }
                    break;
                case -1469768932:
                case 1205302195:
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0946.m55979("ۚ᩵") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-3437)) ^ 732452832;
                        i5 = -1395454236;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۚۢ")) * 61;
                        i4 = ((iM55680 ^ i3) * (-7727)) ^ (-1890408306);
                        i5 = 1431390259;
                    }
                    break;
                case -1359024733:
                case 2146758307:
                    C1071.m56343();
                    if (C1929.f83011 == 0) {
                        iM55680 = (C0873.m55680("ܺ᩺") ^ i2) * 65;
                        i4 = ((iM55680 ^ i3) * (-18527)) ^ (-2004190111);
                        i5 = 268883581;
                    } else {
                        iM55680 = C0946.m55979("ܰܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-7673)) ^ (-2051822290);
                        i5 = 1457106972;
                    }
                    break;
                case -1183667733:
                case 877220415:
                    if (C0873.m55678()) {
                        iM55680 = C0946.m55979("ܰܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-7673)) ^ (-2051822290);
                        i5 = 1457106972;
                    } else {
                        iM55680 = C0873.m55680("᩸۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * 21483) ^ (-43233645);
                        i5 = -1653201771;
                    }
                    break;
                case -823878975:
                case 153187553:
                    if (RunnableC1014.f81941 > 0) {
                        iM55680 = C0946.m55979("ܰܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-7673)) ^ (-2051822290);
                        i5 = 1457106972;
                    } else {
                        iM55680 = C0873.m55680("ۢܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-24713)) ^ 750569156;
                        i5 = -1312129340;
                    }
                    break;
                case -782089456:
                case -662286057:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0873.m55680("۟ۨ") + i3) * (-53);
                        i4 = ((iM55680 ^ i2) * (-10609)) ^ 2048760290;
                        i5 = 663551329;
                    } else {
                        iM55680 = C0946.m55979("ۛ᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-17991)) ^ 1732632223;
                        i5 = 1951559297;
                    }
                    break;
                case -682123472:
                case 60730301:
                    C21898.m49403(main, this.f79787, C7050.m16234());
                    iM55680 = (i2 - C0946.m55979("ۘܰ")) * 81;
                    i4 = ((iM55680 ^ i3) * (-29075)) ^ (-962983913);
                    i5 = 85319175;
                    break;
                case -30014619:
                case 55614221:
                    if (C0992.m56110(c18736)) {
                        iM55680 = (C0873.m55680("۬֨") + i3) * (-83);
                        i4 = ((iM55680 ^ i2) * (-1559)) ^ 947054924;
                        i5 = 189054485;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۘܰ")) * 81;
                        i4 = ((iM55680 ^ i3) * (-29075)) ^ (-962983913);
                        i5 = 85319175;
                    }
                    break;
                case 539256162:
                case 1464448190:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0873.m55680("ۢܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-24713)) ^ 750569156;
                        i5 = -1312129340;
                    } else {
                        iM55680 = C0873.m55680("۫ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21939) ^ (-2047154812);
                        i5 = 1834505094;
                    }
                    break;
                case 558599793:
                case 604298531:
                    break;
                case 580712994:
                case 1607835980:
                    if (!C0892.f81851) {
                        iM55680 = (C0873.m55680("ܺ᩺") ^ i2) * 65;
                        i4 = ((iM55680 ^ i3) * (-18527)) ^ (-2004190111);
                        i5 = 268883581;
                    } else {
                        iM55680 = (C0873.m55680("۟ۨ") + i3) * (-53);
                        i4 = ((iM55680 ^ i2) * (-10609)) ^ 2048760290;
                        i5 = 663551329;
                    }
                    break;
                case 865449773:
                case 1539901724:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0873.m55680("۟ۨ") + i3) * (-53);
                        i4 = ((iM55680 ^ i2) * (-10609)) ^ 2048760290;
                        i5 = 663551329;
                    } else {
                        iM55680 = (C0946.m55979("ܽܳ") ^ i2) * (-47);
                        i4 = ((iM55680 ^ i3) * 19635) ^ 2094469370;
                        i5 = -1539064874;
                    }
                    break;
                case 1065728065:
                case 2045619578:
                    C0894.m55769();
                    C0882.m55710();
                    break;
                default:
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = C0873.m55680("ۢܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-24713)) ^ 750569156;
                        i5 = -1312129340;
                    } else {
                        iM55680 = C0946.m55979("᩸ۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27705)) ^ 1629399633;
                        i5 = -1059821819;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79710;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 26041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final p067l.C18736 mo5125() {
        /*
            Method dump skipped, instruction units count: 2604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C24995.mo5125():l.ܿ۠ۢ");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        int i = -784673031;
        int i2 = C0989.f81920;
        int i3 = C1404.f82149;
        int iM55979 = C0946.m55979("ܰ۠") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-7825)) ^ 1070174810;
        int i5 = 119103435;
        while (true) {
            i = ((((i ^ i3) * (-8779)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1875038542:
                case 1390087772:
                    if (C0854.m55595() >= 0) {
                        iM55979 = (C0946.m55979("ۖܿ") + i2) * 119;
                        i4 = ((iM55979 ^ i3) * (-13507)) ^ 2001833879;
                        i5 = 1621783714;
                    } else {
                        iM55979 = C0873.m55680("ۧ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * 32543) ^ 984122652;
                        i5 = -521333158;
                    }
                    break;
                case -1825371934:
                case -1213290503:
                    C0947.m55997();
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0873.m55680("᩵ۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17803) ^ (-1084535157);
                        i5 = -1928858396;
                    } else {
                        iM55979 = C0873.m55680("᩵ᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14585)) ^ 743343837;
                        i5 = 1615878552;
                    }
                    break;
                case -1787703920:
                case -179037919:
                    if (C0894.m55769() >= 0) {
                        iM55979 = (i2 - C0946.m55979("ܶᩴ")) * 19;
                        i4 = ((iM55979 ^ i3) * 29513) ^ 934810094;
                        i5 = -2043124354;
                    } else {
                        iM55979 = (C0873.m55680("۬֡") ^ i3) * 9;
                        i4 = ((iM55979 ^ i2) * 8303) ^ (-1191363823);
                        i5 = 713068912;
                    }
                    break;
                case -1704600573:
                case -230989588:
                    if (C0927.f81875) {
                        iM55979 = (C0946.m55979("ۖܿ") + i2) * 119;
                        i4 = ((iM55979 ^ i3) * (-13507)) ^ 2001833879;
                        i5 = 1621783714;
                    } else {
                        iM55979 = (C0946.m55979("֫ۧ") + i2) * (-23);
                        i4 = ((iM55979 ^ i3) * 3403) ^ 869048181;
                        i5 = -33114141;
                    }
                    break;
                case -1668129002:
                case 1110989346:
                    RunnableC1014.m56173(this.f79787);
                    iM55979 = C0873.m55680("ۛۡ") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-12097)) ^ (-1929895104);
                    i5 = 1965680909;
                    break;
                case -1593633449:
                case 808826084:
                    break;
                case -1212428763:
                case 661164436:
                    C0917.m55854();
                    C0949.m56012();
                    iM55979 = (C0873.m55680("۬֡") ^ i3) * 9;
                    i4 = ((iM55979 ^ i2) * 8303) ^ (-1191363823);
                    i5 = 713068912;
                    break;
                case -256403603:
                case 885506327:
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0873.m55680("᩵ۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17803) ^ (-1084535157);
                        i5 = -1928858396;
                    } else {
                        iM55979 = (C0946.m55979("ܺ۠") + i2) * (-59);
                        i4 = ((iM55979 ^ i3) * 14743) ^ (-475304816);
                        i5 = -172873206;
                    }
                    break;
                case -240223490:
                case 2141856037:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0873.m55680("۬֡") ^ i3) * 9;
                        i4 = ((iM55979 ^ i2) * 8303) ^ (-1191363823);
                        i5 = 713068912;
                    } else {
                        iM55979 = C0873.m55680("ܿۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-25409)) ^ 1838979731;
                        i5 = -1942004061;
                    }
                    break;
                case -107439377:
                case 1360191254:
                    if (C0917.f81868) {
                        iM55979 = (i2 - C0946.m55979("ܶᩴ")) * 19;
                        i4 = ((iM55979 ^ i3) * 29513) ^ 934810094;
                        i5 = -2043124354;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩵᩻")) * (-61);
                        i4 = ((iM55979 ^ i2) * 25153) ^ 804550420;
                        i5 = 1169047423;
                    }
                    break;
                case -73762318:
                case 1496246484:
                    if (C1229.m56410() == 0) {
                        iM55979 = C0873.m55680("᩵ᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14585)) ^ 743343837;
                        i5 = 1615878552;
                    } else {
                        iM55979 = (C0873.m55680("۬֡") ^ i3) * 9;
                        i4 = ((iM55979 ^ i2) * 8303) ^ (-1191363823);
                        i5 = 713068912;
                    }
                    break;
                case -39379874:
                case 351285366:
                    if (C0863.m55643()) {
                        iM55979 = C0946.m55979("ۨܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-6227)) ^ 155420186;
                        i5 = -1417618601;
                    } else {
                        iM55979 = C0873.m55680("᩵ۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17803) ^ (-1084535157);
                        i5 = -1928858396;
                    }
                    break;
                case 130761608:
                case 211913088:
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0873.m55680("᩵ᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14585)) ^ 743343837;
                        i5 = 1615878552;
                    } else {
                        iM55979 = C0946.m55979("᩺᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11721)) ^ 1032473300;
                        i5 = -2030934435;
                    }
                    break;
                case 560170474:
                case 1593983521:
                    ServiceConnectionC1013.m56157();
                    C1017.m56187();
                    break;
                case 923818813:
                case 2000540220:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (i2 - C0946.m55979("ܶᩴ")) * 19;
                        i4 = ((iM55979 ^ i3) * 29513) ^ 934810094;
                        i5 = -2043124354;
                    } else {
                        iM55979 = (C0873.m55680("ۜᩳ") ^ i2) * 99;
                        i4 = ((iM55979 ^ i3) * 13159) ^ 363900044;
                        i5 = 832416990;
                    }
                    break;
                case 1484499712:
                case 1970291259:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = (C0873.m55680("۬֡") ^ i3) * 9;
                        i4 = ((iM55979 ^ i2) * 8303) ^ (-1191363823);
                        i5 = 713068912;
                    } else {
                        iM55979 = (C0873.m55680("֫ۤ") ^ i2) * (-37);
                        i4 = ((iM55979 ^ i3) * (-31305)) ^ 1261383795;
                        i5 = -1022050580;
                    }
                    break;
                case 1850874620:
                case 2031969207:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0946.m55979("ۖܿ") + i2) * 119;
                        i4 = ((iM55979 ^ i3) * (-13507)) ^ 2001833879;
                        i5 = 1621783714;
                    } else {
                        iM55979 = (C0873.m55680("ۧۨ") + i3) * (-59);
                        i4 = ((iM55979 ^ i2) * 5355) ^ 290535964;
                        i5 = -1854751494;
                    }
                    break;
                default:
                    if (C1017.m56186(c18736)) {
                        iM55979 = C0873.m55680("ۛۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-12097)) ^ (-1929895104);
                        i5 = 1965680909;
                    } else {
                        iM55979 = C0873.m55680("ۛ۫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11871) ^ 1739309169;
                        i5 = 1773166321;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0111 A[PHI: r12 r13 r14
      0x0111: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]) binds: [B:36:0x010f, B:8:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:36:0x010f, B:8:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r14v4 int) = (r14v3 int), (r14v2 int) binds: [B:36:0x010f, B:8:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01bc A[PHI: r1 r2 r8 r9 r10 r15
      0x01bc: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v3 java.lang.String), (r1v2 java.lang.String) binds: [B:51:0x01ba, B:47:0x019b, B:32:0x00ef, B:86:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r2v4 java.lang.String[]) = (r2v2 java.lang.String[]), (r2v2 java.lang.String[]), (r2v2 java.lang.String[]), (r2v7 java.lang.String[]) binds: [B:51:0x01ba, B:47:0x019b, B:32:0x00ef, B:86:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r8v5 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:51:0x01ba, B:47:0x019b, B:32:0x00ef, B:86:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r9v5 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:51:0x01ba, B:47:0x019b, B:32:0x00ef, B:86:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:51:0x01ba, B:47:0x019b, B:32:0x00ef, B:86:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v6 short[]) binds: [B:51:0x01ba, B:47:0x019b, B:32:0x00ef, B:86:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01f2 A[PHI: r7
      0x01f2: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:55:0x01f0, B:11:0x0065, B:8:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0224 A[PHI: r3 r6
      0x0224: PHI (r3v5 java.lang.String) = (r3v2 java.lang.String), (r3v4 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:59:0x0222, B:24:0x00a3, B:16:0x006f, B:14:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:59:0x0222, B:24:0x00a3, B:16:0x006f, B:14:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0256 A[PHI: r4 r20
      0x0256: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:63:0x0254, B:20:0x0081, B:14:0x006b, B:11:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:63:0x0254, B:20:0x0081, B:14:0x006b, B:11:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        int iM55979;
        int i;
        int i2;
        int i3 = AbstractC0942.f81890;
        int i4 = C1964.f83032;
        int iM55680 = (C0873.m55680("ۡܿ") + i4) * (-37);
        int i5 = ((iM55680 ^ i3) * 12249) ^ 321200219;
        String strM56318 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM55680 ^ 1620818496;
        int iM559710 = 0;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -299533514;
        String[] strArr = null;
        String strM55993 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 13567) >> 31));
            switch (i13) {
                case -2038478354:
                case -132552681:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (i3 - C0873.m55680("᩷۫")) * 123;
                        i = ((iM55979 ^ i4) * 4257) ^ (-420960545);
                        i2 = 629683190;
                    } else {
                        iM55979 = (C0946.m55979("ۡۘ") + i4) * 7;
                        i = ((iM55979 ^ i3) * (-15217)) ^ 475035850;
                        i2 = 1104284840;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2014494365:
                case -741115510:
                    C0930.m55885();
                    return null;
                case -2002685652:
                case 554560848:
                    c = 0;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (i3 - C0873.m55680("᩷۫")) * 123;
                        i = ((iM55979 ^ i4) * 4257) ^ (-420960545);
                        i2 = 629683190;
                    } else {
                        iM55979 = C0946.m55979("ܳ۫") ^ i3;
                        i = ((iM55979 ^ i4) * 24885) ^ (-647456840);
                        i2 = 819722861;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1516379413:
                case 711131114:
                    strM55993 = C0947.m55993(sArr2, i11, i12, i10);
                    if (C0866.m55645()) {
                        iM55979 = C0946.m55979("۟᩶") ^ i4;
                        i = ((iM55979 ^ i3) * 25405) ^ 1823074039;
                        i2 = 1644062106;
                    } else {
                        iM55979 = (C0946.m55979("ۛ᩸") + i3) * 81;
                        i = ((iM55979 ^ i4) * (-5879)) ^ (-217381420);
                        i2 = 850732979;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1507891926:
                case 1261016501:
                    C1229.m56410();
                    if (C1053.f81965 > 0) {
                        iM55979 = (C0946.m55979("ۡۘ") + i4) * 7;
                        i = ((iM55979 ^ i3) * (-15217)) ^ 475035850;
                        i2 = 1104284840;
                    } else {
                        iM55979 = C0946.m55979("ܽۢ") ^ i3;
                        i = ((iM55979 ^ i4) * 11471) ^ (-1725412846);
                        i2 = -791338712;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -699833757:
                case 365865375:
                    sArr2 = f83061;
                    i11 = 1;
                    i12 = 4;
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("᩻۟") ^ i4;
                        i = ((iM55979 ^ i3) * 2091) ^ (-300429037);
                        i2 = -1811982323;
                    } else {
                        iM55979 = C0873.m55680("ۙܳ") ^ i3;
                        i = ((iM55979 ^ i4) * (-1589)) ^ 907704735;
                        i2 = -214452718;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -563507306:
                case 1718719478:
                    s = sArr[c];
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0946.m55979("ܽۢ") ^ i3;
                        i = ((iM55979 ^ i4) * 11471) ^ (-1725412846);
                        i2 = -791338712;
                    } else {
                        iM55979 = (C0946.m55979("ۜܿ") ^ i4) * (-23);
                        i = ((iM55979 ^ i3) * (-27637)) ^ 1341028515;
                        i2 = 300355089;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -378025715:
                case 701799124:
                    strM56318 = C1048.m56318(sArr3, 5, 3, i10);
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (i3 - C0873.m55680("᩷۫")) * 123;
                        i = ((iM55979 ^ i4) * 4257) ^ (-420960545);
                        i2 = 629683190;
                    } else {
                        iM55979 = C0946.m55979("᩵ۖ") ^ i3;
                        i = ((iM55979 ^ i4) * (-14037)) ^ (-167143349);
                        i2 = 308466212;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -355171550:
                case 643365744:
                    i8 = i7 * i7;
                    i9 = s * 2;
                    if (C0947.f81895) {
                        iM55979 = (C0946.m55979("ۛ᩸") + i3) * 81;
                        i = ((iM55979 ^ i4) * (-5879)) ^ (-217381420);
                        i2 = 850732979;
                    } else {
                        iM55979 = (C0873.m55680("ۨۙ") + i4) * 85;
                        i = ((iM55979 ^ i3) * 14689) ^ 149332912;
                        i2 = -1441839793;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 28879448:
                case 1451989179:
                    sArr = f83061;
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0946.m55979("ۡۘ") + i4) * 7;
                        i = ((iM55979 ^ i3) * (-15217)) ^ 475035850;
                        i2 = 1104284840;
                    } else {
                        iM55979 = (i4 - C0946.m55979("۠֫")) * 23;
                        i = ((iM55979 ^ i3) * 32591) ^ 1952119993;
                        i2 = 1609598724;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 302171860:
                case 1277421207:
                    i10 = 32180;
                    iM55979 = (C0946.m55979("۠᩶") ^ i4) * (-9);
                    i = ((iM55979 ^ i3) * (-3683)) ^ 22028316;
                    i2 = 254960508;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 335274406:
                case 1154180774:
                    iM559710 = C0946.m55979(strM56318);
                    if (C0866.m55645()) {
                        iM55979 = C0873.m55680("ۛ۠") ^ i4;
                        i = ((iM55979 ^ i3) * 32651) ^ 1368763713;
                        i2 = 1270036231;
                    } else {
                        iM55979 = (C0946.m55979("ۡۘ") + i4) * 7;
                        i = ((iM55979 ^ i3) * (-15217)) ^ 475035850;
                        i2 = 1104284840;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 843862658:
                case 1411222542:
                    strArr = new String[]{m13453(strM55993)};
                    sArr3 = f83061;
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0946.m55979("ۛ᩸") + i3) * 81;
                        i = ((iM55979 ^ i4) * (-5879)) ^ (-217381420);
                        i2 = 850732979;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM559711 = C0946.m55979("ۗᩴ") ^ i4;
                        i5 = ((iM559711 ^ i3) * 18687) ^ 1270779450;
                        i6 = iM559711 ^ (-594271853);
                    }
                    break;
                case 846674151:
                case 1515838263:
                    i10 = 38729;
                    iM55979 = (C0946.m55979("۠᩶") ^ i4) * (-9);
                    i = ((iM55979 ^ i3) * (-3683)) ^ 22028316;
                    i2 = 254960508;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 954808446:
                case 1321662671:
                    C0845.m55584();
                    iM55979 = (i3 - C0873.m55680("᩷۫")) * 123;
                    i = ((iM55979 ^ i4) * 4257) ^ (-420960545);
                    i2 = 629683190;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 962603793:
                case 1586060307:
                    i7 = s + 1;
                    if (C1048.f81963) {
                        iM55979 = (C0946.m55979("۟ۘ") + i3) * 19;
                        i = ((iM55979 ^ i4) * (-17695)) ^ (-346714363);
                        i2 = 1222642852;
                    } else {
                        iM55979 = (C0946.m55979("ۛ᩸") + i3) * 81;
                        i = ((iM55979 ^ i4) * (-5879)) ^ (-217381420);
                        i2 = 850732979;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1038021404:
                case 1319493675:
                    if ((i9 + 1) - i8 <= 0) {
                        iM55979 = (C0873.m55680("ᩳܶ") ^ i3) * (-39);
                        i = ((iM55979 ^ i4) * 14703) ^ 550837070;
                        i2 = -2147050185;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩵ܽ")) * 17;
                        i = ((iM55979 ^ i4) * 193) ^ (-595389704);
                        i2 = -211047124;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1593188659:
                case 1802123932:
                    C0992.m56107();
                    if (C1048.f81963) {
                        iM55979 = C0946.m55979("᩻۟") ^ i4;
                        i = ((iM55979 ^ i3) * 2091) ^ (-300429037);
                        i2 = -1811982323;
                    } else {
                        iM55979 = C0946.m55979("ܽۢ") ^ i3;
                        i = ((iM55979 ^ i4) * 11471) ^ (-1725412846);
                        i2 = -791338712;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    return C1003.m56122(2102559845 ^ iM559710, strArr);
            }
        }
    }
}
