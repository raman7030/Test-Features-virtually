package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.falcon.FalconVrfy;

/* JADX INFO: renamed from: l.ܳܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O3YD */
/* JADX INFO: loaded from: classes4.dex */
public final class C16237 extends AbstractC21283 {

    /* JADX INFO: renamed from: ۨܰ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f82219 = {2857, 19571, -30086, 22644, 18716, -22823, 24180};

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC20262 f47788;

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        int iM55680;
        int i2;
        ActivityC20262 activityC20262 = null;
        ViewOnClickListenerC10874 viewOnClickListenerC10874 = null;
        Object objM56196 = null;
        C8862 c8862 = null;
        Object objM56197 = null;
        int i3 = 1158932099;
        int i4 = C0877.f81843;
        int i5 = AbstractC0942.f81890;
        int iM55681 = C0873.m55680("֡ܺ") ^ i4;
        int i6 = ((iM55681 ^ i5) * (-9259)) ^ (-1642983662);
        int i7 = 10168245;
        while (true) {
            int i8 = iM55681 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i5) * 18851) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2125696354:
                    case -1561147757:
                        c8862.m20464((AbstractC9791) objM56197);
                        return;
                    case -1977863591:
                    case 1969959776:
                        if (C0930.f81879 > 0) {
                            iM55681 = C0946.m55979("ۜۖ") ^ i4;
                            i6 = ((iM55681 ^ i5) * (-31579)) ^ (-153054019);
                            i7 = -1924393690;
                        } else {
                            iM55681 = C0946.m55979("ܶ۫") ^ i4;
                            i6 = ((iM55681 ^ i5) * (-8725)) ^ (-700667520);
                            i7 = 1988098659;
                        }
                        break;
                    case -1905968600:
                    case 1842337701:
                        if (C0946.m55980() == 0) {
                            iM55681 = (i5 - C0873.m55680("᩶ۚ")) * 41;
                            i6 = ((iM55681 ^ i4) * 3235) ^ (-952876989);
                            i7 = 420296613;
                        } else {
                            iM55681 = C0946.m55979("ܶ۫") ^ i4;
                            i6 = ((iM55681 ^ i5) * (-8725)) ^ (-700667520);
                            i7 = 1988098659;
                        }
                        break;
                    case -1898674159:
                    case 1211669104:
                        if (!C0866.m55645()) {
                            iM55681 = C0873.m55680("ۨ᩵") ^ i5;
                            i6 = ((iM55681 ^ i4) * (-21207)) ^ (-1699967363);
                            i7 = 1712816530;
                        } else {
                            iM55681 = C0873.m55680("᩷ۘ") ^ i4;
                            i6 = ((iM55681 ^ i5) * 5201) ^ 1158425858;
                            i7 = -477890823;
                        }
                        break;
                    case -1782257614:
                    case -131070453:
                        C1024.m56209();
                        if (C0989.f81920 >= 0) {
                            iM55681 = (C0873.m55680("᩵᩶") + i5) * 123;
                            i6 = ((iM55681 ^ i4) * 26897) ^ 1224473294;
                            i7 = 1005997776;
                        } else {
                            iM55681 = C0873.m55680("ۤܽ") ^ i4;
                            i6 = ((iM55681 ^ i5) * (-30115)) ^ (-759779089);
                            i7 = 643986255;
                        }
                        break;
                    case -1699698548:
                    case 344014382:
                        if (!(abstractC5462 instanceof C8862)) {
                            iM55681 = C0873.m55680("᩶ۡ") ^ i4;
                            i6 = ((iM55681 ^ i5) * (-32605)) ^ (-612165565);
                            i7 = -1008618842;
                        } else {
                            iM55681 = (i5 - C0946.m55979("ۙۚ")) * (-51);
                            i6 = ((iM55681 ^ i4) * 12097) ^ 1542180304;
                            i7 = -383913583;
                        }
                        break;
                    case -1635781220:
                    case -1226907597:
                        if (!C0917.f81868) {
                            iM55681 = C0873.m55680("ۢۙ") ^ i4;
                            i6 = ((iM55681 ^ i5) * 23787) ^ 1489869553;
                            i7 = -1878317657;
                        } else {
                            iM55681 = C0873.m55680("ۨ᩵") ^ i5;
                            i6 = ((iM55681 ^ i4) * (-21207)) ^ (-1699967363);
                            i7 = 1712816530;
                        }
                        break;
                    case -1473399413:
                    case 1629479343:
                        C1229.m56410();
                        iM55681 = C0873.m55680("ۨ᩵") ^ i5;
                        i6 = ((iM55681 ^ i4) * (-21207)) ^ (-1699967363);
                        i7 = 1712816530;
                        break;
                    case -1240626833:
                    case -104745838:
                        if (C1404.f82149 < 0) {
                            iM55681 = (C0946.m55979("ܶ᩺") + i5) * 73;
                            i6 = ((iM55681 ^ i4) * (-19633)) ^ (-1972201298);
                            i7 = -868801205;
                        } else {
                            iM55681 = (C0873.m55680("᩵᩶") + i5) * 123;
                            i6 = ((iM55681 ^ i4) * 26897) ^ 1224473294;
                            i7 = 1005997776;
                        }
                        break;
                    case -1010555785:
                    case 144826626:
                        if (ViewOnClickListenerC0939.m55941() < 0) {
                            iM55681 = C0873.m55680("֫ۗ") ^ i5;
                            i6 = ((iM55681 ^ i4) * (-31651)) ^ 825623731;
                            i7 = -592049322;
                        } else {
                            iM55681 = C0873.m55680("ۤܽ") ^ i4;
                            i6 = ((iM55681 ^ i5) * (-30115)) ^ (-759779089);
                            i7 = 643986255;
                        }
                        break;
                    case -965074081:
                    case 507831181:
                        RunnableC0871.m55672();
                        if (C0989.f81920 >= 0) {
                            iM55681 = C0873.m55680("ۤܽ") ^ i4;
                            i6 = ((iM55681 ^ i5) * (-30115)) ^ (-759779089);
                            i7 = 643986255;
                            break;
                        }
                        iM55681 = C0873.m55680("ۨ᩵") ^ i5;
                        i6 = ((iM55681 ^ i4) * (-21207)) ^ (-1699967363);
                        i7 = 1712816530;
                        break;
                    case -545690504:
                    case 1635306118:
                        if (!C1929.m56553()) {
                            iM55681 = (i5 - C0946.m55979("᩷ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM55681 ^ i4) * (-1153)) ^ 117034951;
                            i7 = 1505011748;
                        } else {
                            iM55681 = C0873.m55680("ۤܽ") ^ i4;
                            i6 = ((iM55681 ^ i5) * (-30115)) ^ (-759779089);
                            i7 = 643986255;
                        }
                        break;
                    case -489583082:
                    case 1499755330:
                        viewOnClickListenerC10874.m25046((AbstractC9791) objM56196);
                        return;
                    case -152471574:
                    case 817757852:
                        RunnableC0897.m55784();
                        C0892.m55749();
                        return;
                    case -80830180:
                    case 1429004779:
                        c8862 = (C8862) abstractC5462;
                        objM56197 = C1017.m56196(activityC20262.f62622, i);
                        if (ViewOnClickListenerC0939.f81888 > 0) {
                            iM55681 = C0873.m55680("۟ۢ") ^ i4;
                            i6 = ((iM55681 ^ i5) * (-17481)) ^ 511565398;
                            i7 = 251900768;
                        } else {
                            iM55681 = C0873.m55680("ۨ᩵") ^ i5;
                            i6 = ((iM55681 ^ i4) * (-21207)) ^ (-1699967363);
                            i7 = 1712816530;
                        }
                        break;
                    case 50582593:
                    case 1282811912:
                        boolean z = abstractC5462 instanceof ViewOnClickListenerC10874;
                        ActivityC20262 activityC20263 = this.f47788;
                        if (z) {
                            iM55680 = C0946.m55979("ܿ᩹") ^ i5;
                            i6 = ((iM55680 ^ i4) * 29375) ^ (-564353361);
                            i2 = 485494742;
                        } else {
                            iM55680 = C0873.m55680("᩺ܶ") ^ i4;
                            i6 = ((iM55680 ^ i5) * 23229) ^ (-1246976776);
                            i2 = 352094573;
                        }
                        i8 = iM55680 ^ i2;
                        activityC20262 = activityC20263;
                        break;
                    case 1023217060:
                    case 2061308468:
                        if (!C0927.f81875) {
                            iM55681 = (C0946.m55979("᩻۠") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM55681 ^ i5) * 10007) ^ (-573506390);
                            i7 = 1510928277;
                        } else {
                            iM55681 = C0873.m55680("ۢۙ") ^ i4;
                            i6 = ((iM55681 ^ i5) * 23787) ^ 1489869553;
                            i7 = -1878317657;
                        }
                        break;
                    case 1247443791:
                    case 1784865180:
                        viewOnClickListenerC10874 = (ViewOnClickListenerC10874) abstractC5462;
                        objM56196 = C1017.m56196(activityC20262.f62622, i);
                        if (!C1404.m56468()) {
                            iM55681 = C0873.m55680("ۨ᩵") ^ i5;
                            i6 = ((iM55681 ^ i4) * (-21207)) ^ (-1699967363);
                            i7 = 1712816530;
                            break;
                        }
                        iM55681 = C0873.m55680("۠֫") ^ i5;
                        i6 = ((iM55681 ^ i4) * (-6069)) ^ (-1341409101);
                        i7 = 265168394;
                        break;
                    case 1303221136:
                    case 1437087468:
                        throw new RuntimeException();
                    default:
                        if (!C0861.m55626()) {
                            iM55681 = (i4 - C0946.m55979("ۜ᩶")) * (-103);
                            i6 = ((iM55681 ^ i5) * (-32717)) ^ (-1636053338);
                            i7 = -537625779;
                        } else {
                            iM55681 = C0873.m55680("ۢۙ") ^ i4;
                            i6 = ((iM55681 ^ i5) * 23787) ^ 1489869553;
                            i7 = -1878317657;
                        }
                        break;
                }
            }
        }
    }

    public C16237(ActivityC20262 activityC20262) {
        this.f47788 = activityC20262;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a6 A[PHI: r8
      0x00a6: PHI (r8v7 int) = (r8v4 int), (r8v3 int) binds: [B:24:0x00a4, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00df A[PHI: r6 r10 r11 r12
      0x00df: PHI (r6v5 android.view.LayoutInflater) = (r6v4 android.view.LayoutInflater), (r6v3 android.view.LayoutInflater), (r6v3 android.view.LayoutInflater) binds: [B:28:0x00dd, B:16:0x007b, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r10v5 short[]) = (r10v4 short[]), (r10v3 short[]), (r10v3 short[]) binds: [B:28:0x00dd, B:16:0x007b, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r11v5 int) = (r11v4 int), (r11v3 int), (r11v3 int) binds: [B:28:0x00dd, B:16:0x007b, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r12v5 int) = (r12v4 int), (r12v3 int), (r12v3 int) binds: [B:28:0x00dd, B:16:0x007b, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (p067l.C0890.f81849 != 0) goto L13;
     */
    @Override // p067l.AbstractC21283
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        short s;
        int i2;
        int iM55979;
        int i3;
        int i4;
        int iM559710;
        int i5;
        int i6;
        int iM55680;
        int i7;
        int i8;
        int iM559711;
        int i9;
        int iM559712;
        int i10;
        viewGroup = viewGroup;
        int i11 = C0906.f81862;
        int i12 = RunnableC1014.f81941;
        int iM55681 = C0873.m55680("ۢܳ") ^ i12;
        int i13 = ((iM55681 ^ i11) * (-19981)) ^ 470098844;
        LayoutInflater layoutInflater = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i14 = iM55681 ^ 2101876806;
        int iM55682 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        short s2 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 392458072;
        int i22 = 0;
        View viewInflate = null;
        short[] sArr3 = null;
        int iM55683 = 0;
        LayoutInflater layoutInflater2 = null;
        ActivityC20262 activityC20262 = null;
        while (true) {
            while (true) {
                i21 = i14 ^ (i13 & (((i21 ^ i11) * 19111) >> 31));
                switch (i21) {
                    case -2115772056:
                    case -741902978:
                        C1017.m56187();
                        i22 = i22;
                        iM55979 = (i12 - C0946.m55979("֨᩷")) * 31;
                        i3 = ((iM55979 ^ i11) * 12035) ^ 1721750156;
                        i4 = 457217964;
                        i14 = iM55979 ^ i4;
                        viewGroup = viewGroup;
                        i22 = i22;
                        i13 = i3;
                        break;
                    case -1921203286:
                    case 263096348:
                        i17 = 53702;
                        iM559711 = (C0946.m55979("ܶ᩻") + i11) * 27;
                        i8 = ((iM559711 ^ i12) * 12675) ^ (-1655044663);
                        i9 = 2107274868;
                        i14 = iM559711 ^ i9;
                        i22 = i22;
                        i13 = i8;
                        viewGroup = viewGroup;
                        break;
                    case -1745940305:
                    case -689545232:
                        i22 = i22;
                        iM55682 = C0873.m55680(C1404.m56462(sArr, i18, i22, i17));
                        if (C0894.f81854 < 0) {
                            iM559711 = (C0873.m55680("ܳ᩺") ^ i11) * (-111);
                            i8 = ((iM559711 ^ i12) * 12453) ^ 393601228;
                            i9 = 1972958634;
                            i14 = iM559711 ^ i9;
                            i22 = i22;
                            i13 = i8;
                            viewGroup = viewGroup;
                        }
                        i22 = i22;
                        iM559712 = (C0873.m55680("᩷۫") + i12) * (-21);
                        i13 = ((iM559712 ^ i11) * (-27567)) ^ 1791534430;
                        i10 = 1276416611;
                        i14 = iM559712 ^ i10;
                        viewGroup = viewGroup;
                        break;
                    case -1716292838:
                    case 195027812:
                        break;
                    case -1622681216:
                    case 101260574:
                        i2 = i22;
                        s = s2;
                        int i23 = s * 31936;
                        i20 = s * s;
                        if (!C1929.m56553()) {
                            int iM55684 = C0873.m55680("֡֫") ^ i11;
                            i19 = i23;
                            i8 = ((iM55684 ^ i12) * (-28913)) ^ 429203250;
                            i14 = iM55684 ^ (-1505543456);
                            i22 = i2;
                            s2 = s;
                            i13 = i8;
                            viewGroup = viewGroup;
                        } else {
                            i19 = i23;
                            iM55680 = (i12 - C0946.m55979("۬ᩴ")) * (-97);
                            i6 = i2;
                            i13 = ((iM55680 ^ i11) * 28069) ^ 1591415538;
                            i7 = 796825238;
                            i14 = iM55680 ^ i7;
                            viewGroup = viewGroup;
                            i22 = i6;
                            s2 = s;
                        }
                        break;
                    case -1529857233:
                    case 1862105062:
                        viewInflate = layoutInflater2.inflate(2102831244 ^ iM55682, viewGroup, false);
                        if (C0906.m55809() > 0) {
                            iM559710 = C0946.m55979("ܶۡ") ^ i12;
                            i3 = ((iM559710 ^ i11) * 12529) ^ (-1850696151);
                            i5 = 672761560;
                            i14 = iM559710 ^ i5;
                            i13 = i3;
                        }
                        i22 = i22;
                        iM55979 = (i12 - C0946.m55979("֨᩷")) * 31;
                        i3 = ((iM55979 ^ i11) * 12035) ^ 1721750156;
                        i4 = 457217964;
                        i14 = iM55979 ^ i4;
                        viewGroup = viewGroup;
                        i22 = i22;
                        i13 = i3;
                        break;
                    case -1396792433:
                    case -920783891:
                        C0890.m55740();
                        break;
                    case -1391114110:
                    case 322951755:
                        i17 = 15105;
                        iM559711 = (C0946.m55979("ܶ᩻") + i11) * 27;
                        i8 = ((iM559711 ^ i12) * 12675) ^ (-1655044663);
                        i9 = 2107274868;
                        i14 = iM559711 ^ i9;
                        i22 = i22;
                        i13 = i8;
                        viewGroup = viewGroup;
                        break;
                    case -1150431096:
                    case 963118358:
                        if (C0877.f81843 >= 0) {
                            iM559710 = (C0873.m55680("۠۠") ^ i11) * (-35);
                            i3 = ((iM559710 ^ i12) * (-12551)) ^ 1538754100;
                            i5 = -1875206793;
                        } else {
                            iM559710 = C0873.m55680("ܽۚ") ^ i11;
                            i3 = ((iM559710 ^ i12) * 22393) ^ (-37043188);
                            i5 = -312681449;
                        }
                        i14 = iM559710 ^ i5;
                        i13 = i3;
                        break;
                    case -1080013935:
                    case -903347030:
                        i22 = i22;
                        layoutInflater2 = activityC20262.getLayoutInflater();
                        sArr = f82219;
                        i18 = 1;
                        if (C1048.f81963) {
                            iM55979 = C0873.m55680("ۡۢ") ^ i12;
                            i3 = ((iM55979 ^ i11) * 31179) ^ 1457994732;
                            i4 = 1826662389;
                        } else {
                            iM55979 = (i12 - C0946.m55979("֨᩷")) * 31;
                            i3 = ((iM55979 ^ i11) * 12035) ^ 1721750156;
                            i4 = 457217964;
                        }
                        i14 = iM55979 ^ i4;
                        viewGroup = viewGroup;
                        i22 = i22;
                        i13 = i3;
                        break;
                    case -1072242610:
                    case 1681464985:
                        C0906.m55809();
                        C0873.m55678();
                        return null;
                    case -883543371:
                    case 333505120:
                        s = s2;
                        i2 = i22;
                        sArr3 = f82219;
                        if (C1024.f81946) {
                            iM55680 = (i12 - C0946.m55979("۬ᩴ")) * (-97);
                            i6 = i2;
                            i13 = ((iM55680 ^ i11) * 28069) ^ 1591415538;
                            i7 = 796825238;
                        } else {
                            i6 = i2;
                            iM55680 = (C0873.m55680("۠ۚ") ^ i11) * 95;
                            i13 = ((iM55680 ^ i12) * 4591) ^ (-906340728);
                            i7 = 761850921;
                        }
                        i14 = iM55680 ^ i7;
                        viewGroup = viewGroup;
                        i22 = i6;
                        s2 = s;
                        break;
                    case -674631435:
                    case 432036942:
                        layoutInflater = activityC20262.getLayoutInflater();
                        sArr2 = f82219;
                        i15 = 4;
                        i16 = 3;
                        if (C1964.f83032 <= 0) {
                            iM559710 = (C0873.m55680("۠۠") ^ i11) * (-35);
                            i3 = ((iM559710 ^ i12) * (-12551)) ^ 1538754100;
                            i5 = -1875206793;
                        } else {
                            iM559710 = (i12 - C0873.m55680("ۚᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i3 = ((iM559710 ^ i11) * 2861) ^ (-1054731716);
                            i5 = -1840027610;
                        }
                        i14 = iM559710 ^ i5;
                        i13 = i3;
                        break;
                    case -649581402:
                    case 1379139216:
                        i22 = i22;
                        s2 = sArr3[0];
                        if (!C0955.f81898) {
                            iM55979 = (C0946.m55979("ܽۢ") ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i3 = ((iM55979 ^ i11) * 6755) ^ (-787473129);
                            i4 = -972259050;
                            i14 = iM55979 ^ i4;
                            viewGroup = viewGroup;
                            i22 = i22;
                            i13 = i3;
                        } else {
                            i22 = i22;
                            iM559712 = (C0873.m55680("᩷۫") + i12) * (-21);
                            i13 = ((iM559712 ^ i11) * (-27567)) ^ 1791534430;
                            i10 = 1276416611;
                            i14 = iM559712 ^ i10;
                            viewGroup = viewGroup;
                        }
                        break;
                    case -381873756:
                    case 16830215:
                        return new ViewOnClickListenerC10874(activityC20262, layoutInflater.inflate(2101462949 ^ iM55683, viewGroup, false));
                    case -146026813:
                    case 65147593:
                        iM55683 = C0873.m55680(C0946.m55986(sArr2, i15, i16, i17));
                        if (RunnableC0938.m55938() != 0) {
                            iM559710 = C0873.m55680("ܽۚ") ^ i11;
                            i3 = ((iM559710 ^ i12) * 22393) ^ (-37043188);
                            i5 = -312681449;
                        } else {
                            iM559710 = (C0946.m55979("᩹ۡ") + i11) * 53;
                            i3 = ((iM559710 ^ i12) * (-6093)) ^ 2122599397;
                            i5 = -733733973;
                        }
                        i14 = iM559710 ^ i5;
                        i13 = i3;
                        break;
                    case 155924705:
                    case 289478855:
                        i22 = i22;
                        if ((i20 + 254977024) - i19 >= 0) {
                            iM55979 = C0873.m55680("ۜܽ") ^ i12;
                            i3 = ((iM55979 ^ i11) * 11243) ^ 2015936571;
                            i4 = -325659162;
                        } else {
                            iM55979 = C0873.m55680("ܽۗ") ^ i11;
                            i3 = ((iM55979 ^ i12) * (-25025)) ^ (-1746007923);
                            i4 = -1137210534;
                        }
                        i14 = iM55979 ^ i4;
                        viewGroup = viewGroup;
                        i22 = i22;
                        i13 = i3;
                        break;
                    case 218805881:
                    case 1964338680:
                        i22 = 3;
                        if (C0863.m55643()) {
                            iM559712 = (C0946.m55979("ܽۙ") ^ i11) * 69;
                            i13 = ((iM559712 ^ i12) * 25551) ^ 245574813;
                            i10 = -69499709;
                        } else {
                            iM559712 = (C0873.m55680("᩷۫") + i12) * (-21);
                            i13 = ((iM559712 ^ i11) * (-27567)) ^ 1791534430;
                            i10 = 1276416611;
                        }
                        i14 = iM559712 ^ i10;
                        viewGroup = viewGroup;
                        break;
                    case 480381306:
                    case 1865657139:
                        s = s2;
                        i6 = i22;
                        if (RunnableC1014.f81941 > 0) {
                            iM55680 = C0873.m55680("ۡۖ") ^ i12;
                            i13 = ((iM55680 ^ i11) * 28527) ^ 576304488;
                            i7 = 1913320408;
                            i14 = iM55680 ^ i7;
                            viewGroup = viewGroup;
                            i22 = i6;
                            s2 = s;
                        } else {
                            i22 = i6;
                            s2 = s;
                            iM559712 = (C0873.m55680("᩷۫") + i12) * (-21);
                            i13 = ((iM559712 ^ i11) * (-27567)) ^ 1791534430;
                            i10 = 1276416611;
                            i14 = iM559712 ^ i10;
                            viewGroup = viewGroup;
                        }
                        break;
                    case 1112837377:
                    case 1942087790:
                        if (C1194.f82045 != 0) {
                            s = s2;
                            i2 = i22;
                            iM55680 = (i12 - C0946.m55979("۬ᩴ")) * (-97);
                            i6 = i2;
                            i13 = ((iM55680 ^ i11) * 28069) ^ 1591415538;
                            i7 = 796825238;
                            i14 = iM55680 ^ i7;
                            viewGroup = viewGroup;
                            i22 = i6;
                            s2 = s;
                        } else {
                            i22 = i22;
                            iM55979 = (i12 - C0946.m55979("֨᩷")) * 31;
                            i3 = ((iM55979 ^ i11) * 12035) ^ 1721750156;
                            i4 = 457217964;
                            i14 = iM55979 ^ i4;
                            viewGroup = viewGroup;
                            i22 = i22;
                            i13 = i3;
                        }
                        break;
                    default:
                        return new C8862(viewInflate);
                }
            }
            i22 = i22;
            activityC20262 = this.f47788;
            if (i == 0) {
                int iM559713 = C0946.m55979("۟ۖ") ^ i11;
                i13 = ((iM559713 ^ i12) * (-11269)) ^ (-871538992);
                i14 = iM559713 ^ 2025954569;
            } else {
                int iM559714 = (i12 - C0946.m55979("ۖۢ")) * 95;
                i14 = iM559714 ^ (-1611061803);
                i13 = ((iM559714 ^ i11) * (-30585)) ^ 1011294839;
            }
        }
    }

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        ActivityC20262 activityC20262 = null;
        ArrayList arrayList = null;
        AbstractC9791 abstractC9791 = null;
        int i2 = 620314503;
        int i3 = C1003.f81929;
        int i4 = C1036.f81953;
        int iM55979 = (C0946.m55979("᩵۟") + i4) * 47;
        int i5 = ((iM55979 ^ i3) * (-20841)) ^ 173926752;
        int i6 = -290218901;
        while (true) {
            i2 = ((((i2 ^ i3) * (-2139)) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -1963439910:
                case -1240059835:
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("ᩴۜ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM55979 ^ i3) * (-23661)) ^ (-513517643);
                        i6 = -1936498557;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۢۚ")) * (-87);
                        i5 = ((iM55979 ^ i3) * 8063) ^ (-325264626);
                        i6 = -660363231;
                    }
                    break;
                case -1655770014:
                case 1687807308:
                    if (C1124.m56367() >= 0) {
                        iM55979 = C0873.m55680("᩹۟") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-18339)) ^ 1579139786;
                        i6 = 338672697;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۘܳ")) * (-125);
                        i5 = ((iM55979 ^ i4) * 7739) ^ (-896175333);
                        i6 = 1132294213;
                    }
                    break;
                case -1498054645:
                case -813475291:
                    return 1;
                case -1489281055:
                case 1035459268:
                    return 0;
                case -1368344810:
                case 2103780836:
                    C0930.m55885();
                    if (C0866.f81837 < 0) {
                        iM55979 = C0873.m55680("ۢ֨") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-24569)) ^ 1682516395;
                        i6 = 80221257;
                    } else {
                        iM55979 = C0946.m55979("ܿۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    }
                    break;
                case -1340281173:
                case 1895279995:
                    if (abstractC9791.mo7887() == EnumC15825.f45813) {
                        iM55979 = C0873.m55680("֨ۛ") ^ i4;
                        i5 = ((iM55979 ^ i3) * FalconVrfy.f81605R) ^ (-1136120748);
                        i6 = 1079382061;
                    } else {
                        iM55979 = C0873.m55680("ܰ᩸") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-11857)) ^ (-1673316578);
                        i6 = 533625828;
                    }
                    break;
                case -1089258651:
                case 1615979077:
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0946.m55979("ܿۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    } else {
                        iM55979 = C0873.m55680("ܳᩴ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 11319) ^ 2083432912;
                        i6 = 1876474139;
                    }
                    break;
                case -940989922:
                case -934280426:
                    RunnableC0871.m55672();
                    iM55979 = C0873.m55680("ۧۨ") ^ i4;
                    i5 = ((iM55979 ^ i3) * (-20945)) ^ (-210528669);
                    i6 = -474597812;
                    break;
                case -711497500:
                case 2068732938:
                    arrayList = activityC20262.f62622;
                    if (C0892.m55749()) {
                        iM55979 = C0946.m55979("ۙ᩹") ^ i4;
                        i5 = ((iM55979 ^ i3) * 24005) ^ (-76067585);
                        i6 = 286524133;
                    } else {
                        iM55979 = C0873.m55680("᩹۟") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-18339)) ^ 1579139786;
                        i6 = 338672697;
                    }
                    break;
                case -134755792:
                case 2097581246:
                    abstractC9791 = (AbstractC9791) C1017.m56196(arrayList, i);
                    if (RunnableC1014.m56177()) {
                        iM55979 = C0946.m55979("᩵ۗ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 19023) ^ 965241825;
                        i6 = -1838772799;
                    } else {
                        iM55979 = C0873.m55680("ۧۨ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-20945)) ^ (-210528669);
                        i6 = -474597812;
                    }
                    break;
                case -50155194:
                case 1302403282:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("᩹۟") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-18339)) ^ 1579139786;
                        i6 = 338672697;
                    } else {
                        iM55979 = C0946.m55979("۠᩷") ^ i4;
                        i5 = ((iM55979 ^ i3) * 8115) ^ 1764080482;
                        i6 = -1636261825;
                    }
                    break;
                case 89509048:
                case 1718335615:
                    AbstractC0942.m55971();
                    return 0;
                case 550820049:
                case 649172775:
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("ܿۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    } else {
                        iM55979 = C0873.m55680("ۧۨ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-20945)) ^ (-210528669);
                        i6 = -474597812;
                    }
                    break;
                case 666224946:
                case 911597527:
                    if (C1036.m56257() > 0) {
                        iM55979 = (C0873.m55680("ᩴۜ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM55979 ^ i3) * (-23661)) ^ (-513517643);
                        i6 = -1936498557;
                    } else {
                        iM55979 = C0946.m55979("ܿۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    }
                    break;
                case 1040289345:
                case 2023451069:
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0873.m55680("ᩴۜ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM55979 ^ i3) * (-23661)) ^ (-513517643);
                        i6 = -1936498557;
                    } else {
                        iM55979 = C0873.m55680("֫֡") ^ i3;
                        i5 = ((iM55979 ^ i4) * 12703) ^ 1154513819;
                        i6 = -1086908068;
                    }
                    break;
                case 1307237167:
                case 1341658672:
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0873.m55680("ۧۨ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-20945)) ^ (-210528669);
                        i6 = -474597812;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۗ᩹")) * (-71);
                        i5 = ((iM55979 ^ i3) * 23119) ^ 213844157;
                        i6 = -1760332674;
                    }
                    break;
                case 1371229636:
                case 1716948281:
                    if (C1124.m56367() >= 0) {
                        iM55979 = C0873.m55680("ۢ֨") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-24569)) ^ 1682516395;
                        i6 = 80221257;
                    } else {
                        iM55979 = C0946.m55979("ۘ۬") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-24723)) ^ 523856298;
                        i6 = 1837208908;
                    }
                    break;
                default:
                    activityC20262 = this.f47788;
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0946.m55979("ܿۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    } else {
                        iM55979 = C0873.m55680("֡ۘ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-29485)) ^ 1230987120;
                        i6 = -1649553592;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return C0861.m55625(this.f47788.f62622);
    }
}
