package l;

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
public final class C14592 extends AbstractC19902 {

    /* JADX INFO: renamed from: ۨܰ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f44680 = {2857, 19571, -30086, 22644, 18716, -22823, 24180};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18827 f44681;

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        int iM2566;
        int i2;
        ActivityC18827 activityC18827 = null;
        ViewOnClickListenerC8949 viewOnClickListenerC8949 = null;
        Object objM10755 = null;
        C6832 c6832 = null;
        Object objM10756 = null;
        int i3 = 1158932099;
        int i4 = C0714.f2697;
        int i5 = AbstractC2021.f6743;
        int iM2567 = C0630.m2566("֡ܺ") ^ i4;
        int i6 = ((iM2567 ^ i5) * (-9259)) ^ (-1642983662);
        int i7 = 10168245;
        while (true) {
            int i8 = iM2567 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i5) * 18851) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2125696354:
                    case -1561147757:
                        c6832.m18515((AbstractC7809) objM10756);
                        return;
                    case -1977863591:
                    case 1969959776:
                        if (C1773.f6144 > 0) {
                            iM2567 = C2105.m6981("ۜۖ") ^ i4;
                            i6 = ((iM2567 ^ i5) * (-31579)) ^ (-153054019);
                            i7 = -1924393690;
                        } else {
                            iM2567 = C2105.m6981("ܶ۫") ^ i4;
                            i6 = ((iM2567 ^ i5) * (-8725)) ^ (-700667520);
                            i7 = 1988098659;
                        }
                        break;
                    case -1905968600:
                    case 1842337701:
                        if (C2105.m6982() == 0) {
                            iM2567 = (i5 - C0630.m2566("᩶ۚ")) * 41;
                            i6 = ((iM2567 ^ i4) * 3235) ^ (-952876989);
                            i7 = 420296613;
                        } else {
                            iM2567 = C2105.m6981("ܶ۫") ^ i4;
                            i6 = ((iM2567 ^ i5) * (-8725)) ^ (-700667520);
                            i7 = 1988098659;
                        }
                        break;
                    case -1898674159:
                    case 1211669104:
                        if (!C0483.m2121()) {
                            iM2567 = C0630.m2566("ۨ᩵") ^ i5;
                            i6 = ((iM2567 ^ i4) * (-21207)) ^ (-1699967363);
                            i7 = 1712816530;
                        } else {
                            iM2567 = C0630.m2566("᩷ۘ") ^ i4;
                            i6 = ((iM2567 ^ i5) * 5201) ^ 1158425858;
                            i7 = -477890823;
                        }
                        break;
                    case -1782257614:
                    case -131070453:
                        C3663.m11168();
                        if (C2958.f9394 >= 0) {
                            iM2567 = (C0630.m2566("᩵᩶") + i5) * 123;
                            i6 = ((iM2567 ^ i4) * 26897) ^ 1224473294;
                            i7 = 1005997776;
                        } else {
                            iM2567 = C0630.m2566("ۤܽ") ^ i4;
                            i6 = ((iM2567 ^ i5) * (-30115)) ^ (-759779089);
                            i7 = 643986255;
                        }
                        break;
                    case -1699698548:
                    case 344014382:
                        if (!(abstractC3255 instanceof C6832)) {
                            iM2567 = C0630.m2566("᩶ۡ") ^ i4;
                            i6 = ((iM2567 ^ i5) * (-32605)) ^ (-612165565);
                            i7 = -1008618842;
                        } else {
                            iM2567 = (i5 - C2105.m6981("ۙۚ")) * (-51);
                            i6 = ((iM2567 ^ i4) * 12097) ^ 1542180304;
                            i7 = -383913583;
                        }
                        break;
                    case -1635781220:
                    case -1226907597:
                        if (!C1504.f5354) {
                            iM2567 = C0630.m2566("ۢۙ") ^ i4;
                            i6 = ((iM2567 ^ i5) * 23787) ^ 1489869553;
                            i7 = -1878317657;
                        } else {
                            iM2567 = C0630.m2566("ۨ᩵") ^ i5;
                            i6 = ((iM2567 ^ i4) * (-21207)) ^ (-1699967363);
                            i7 = 1712816530;
                        }
                        break;
                    case -1473399413:
                    case 1629479343:
                        C7811.m20844();
                        iM2567 = C0630.m2566("ۨ᩵") ^ i5;
                        i6 = ((iM2567 ^ i4) * (-21207)) ^ (-1699967363);
                        i7 = 1712816530;
                        break;
                    case -1240626833:
                    case -104745838:
                        if (C11340.f33930 < 0) {
                            iM2567 = (C2105.m6981("ܶ᩺") + i5) * 73;
                            i6 = ((iM2567 ^ i4) * (-19633)) ^ (-1972201298);
                            i7 = -868801205;
                        } else {
                            iM2567 = (C0630.m2566("᩵᩶") + i5) * 123;
                            i6 = ((iM2567 ^ i4) * 26897) ^ 1224473294;
                            i7 = 1005997776;
                        }
                        break;
                    case -1010555785:
                    case 144826626:
                        if (ViewOnClickListenerC1958.m6429() < 0) {
                            iM2567 = C0630.m2566("֫ۗ") ^ i5;
                            i6 = ((iM2567 ^ i4) * (-31651)) ^ 825623731;
                            i7 = -592049322;
                        } else {
                            iM2567 = C0630.m2566("ۤܽ") ^ i4;
                            i6 = ((iM2567 ^ i5) * (-30115)) ^ (-759779089);
                            i7 = 643986255;
                        }
                        break;
                    case -965074081:
                    case 507831181:
                        RunnableC0588.m2441();
                        if (C2958.f9394 >= 0) {
                            iM2567 = C0630.m2566("ۤܽ") ^ i4;
                            i6 = ((iM2567 ^ i5) * (-30115)) ^ (-759779089);
                            i7 = 643986255;
                            break;
                        }
                        iM2567 = C0630.m2566("ۨ᩵") ^ i5;
                        i6 = ((iM2567 ^ i4) * (-21207)) ^ (-1699967363);
                        i7 = 1712816530;
                        break;
                    case -545690504:
                    case 1635306118:
                        if (!C21923.m49329()) {
                            iM2567 = (i5 - C2105.m6981("᩷ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM2567 ^ i4) * (-1153)) ^ 117034951;
                            i7 = 1505011748;
                        } else {
                            iM2567 = C0630.m2566("ۤܽ") ^ i4;
                            i6 = ((iM2567 ^ i5) * (-30115)) ^ (-759779089);
                            i7 = 643986255;
                        }
                        break;
                    case -489583082:
                    case 1499755330:
                        viewOnClickListenerC8949.m23072((AbstractC7809) objM10755);
                        return;
                    case -152471574:
                    case 817757852:
                        RunnableC1108.m3790();
                        C1005.m3501();
                        return;
                    case -80830180:
                    case 1429004779:
                        c6832 = (C6832) abstractC3255;
                        objM10756 = C3537.m10755(activityC18827.f59394, i);
                        if (ViewOnClickListenerC1958.f6529 > 0) {
                            iM2567 = C0630.m2566("۟ۢ") ^ i4;
                            i6 = ((iM2567 ^ i5) * (-17481)) ^ 511565398;
                            i7 = 251900768;
                        } else {
                            iM2567 = C0630.m2566("ۨ᩵") ^ i5;
                            i6 = ((iM2567 ^ i4) * (-21207)) ^ (-1699967363);
                            i7 = 1712816530;
                        }
                        break;
                    case 50582593:
                    case 1282811912:
                        boolean z = abstractC3255 instanceof ViewOnClickListenerC8949;
                        ActivityC18827 activityC18828 = this.f44681;
                        if (z) {
                            iM2566 = C2105.m6981("ܿ᩹") ^ i5;
                            i6 = ((iM2566 ^ i4) * 29375) ^ (-564353361);
                            i2 = 485494742;
                        } else {
                            iM2566 = C0630.m2566("᩺ܶ") ^ i4;
                            i6 = ((iM2566 ^ i5) * 23229) ^ (-1246976776);
                            i2 = 352094573;
                        }
                        i8 = iM2566 ^ i2;
                        activityC18827 = activityC18828;
                        break;
                    case 1023217060:
                    case 2061308468:
                        if (!C1711.f5919) {
                            iM2567 = (C2105.m6981("᩻۠") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM2567 ^ i5) * 10007) ^ (-573506390);
                            i7 = 1510928277;
                        } else {
                            iM2567 = C0630.m2566("ۢۙ") ^ i4;
                            i6 = ((iM2567 ^ i5) * 23787) ^ 1489869553;
                            i7 = -1878317657;
                        }
                        break;
                    case 1247443791:
                    case 1784865180:
                        viewOnClickListenerC8949 = (ViewOnClickListenerC8949) abstractC3255;
                        objM10755 = C3537.m10755(activityC18827.f59394, i);
                        if (!C11340.m28031()) {
                            iM2567 = C0630.m2566("ۨ᩵") ^ i5;
                            i6 = ((iM2567 ^ i4) * (-21207)) ^ (-1699967363);
                            i7 = 1712816530;
                            break;
                        }
                        iM2567 = C0630.m2566("۠֫") ^ i5;
                        i6 = ((iM2567 ^ i4) * (-6069)) ^ (-1341409101);
                        i7 = 265168394;
                        break;
                    case 1303221136:
                    case 1437087468:
                        throw new RuntimeException();
                    default:
                        if (!C0382.m1848()) {
                            iM2567 = (i4 - C2105.m6981("ۜ᩶")) * (-103);
                            i6 = ((iM2567 ^ i5) * (-32717)) ^ (-1636053338);
                            i7 = -537625779;
                        } else {
                            iM2567 = C0630.m2566("ۢۙ") ^ i4;
                            i6 = ((iM2567 ^ i5) * 23787) ^ 1489869553;
                            i7 = -1878317657;
                        }
                        break;
                }
            }
        }
    }

    public C14592(ActivityC18827 activityC18827) {
        this.f44681 = activityC18827;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a6 A[PHI: r8
      0x00a6: PHI (r8v7 int) = (r8v4 int), (r8v3 int) binds: [B:24:0x00a4, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00df A[PHI: r6 r10 r11 r12
      0x00df: PHI (r6v5 android.view.LayoutInflater) = (r6v4 android.view.LayoutInflater), (r6v3 android.view.LayoutInflater), (r6v3 android.view.LayoutInflater) binds: [B:28:0x00dd, B:16:0x007b, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r10v5 short[]) = (r10v4 short[]), (r10v3 short[]), (r10v3 short[]) binds: [B:28:0x00dd, B:16:0x007b, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r11v5 int) = (r11v4 int), (r11v3 int), (r11v3 int) binds: [B:28:0x00dd, B:16:0x007b, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r12v5 int) = (r12v4 int), (r12v3 int), (r12v3 int) binds: [B:28:0x00dd, B:16:0x007b, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (l.C0964.f3626 != 0) goto L13;
     */
    @Override // l.AbstractC19902
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        short s;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int i6;
        int iM2566;
        int i7;
        int i8;
        int iM6983;
        int i9;
        int iM6984;
        int i10;
        viewGroup = viewGroup;
        int i11 = C1294.f4556;
        int i12 = RunnableC3474.f10992;
        int iM2567 = C0630.m2566("ۢܳ") ^ i12;
        int i13 = ((iM2567 ^ i11) * (-19981)) ^ 470098844;
        LayoutInflater layoutInflater = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i14 = iM2567 ^ 2101876806;
        int iM2568 = 0;
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
        int iM2569 = 0;
        LayoutInflater layoutInflater2 = null;
        ActivityC18827 activityC18827 = null;
        while (true) {
            while (true) {
                i21 = i14 ^ (i13 & (((i21 ^ i11) * 19111) >> 31));
                switch (i21) {
                    case -2115772056:
                    case -741902978:
                        C3537.m10746();
                        i22 = i22;
                        iM6981 = (i12 - C2105.m6981("֨᩷")) * 31;
                        i3 = ((iM6981 ^ i11) * 12035) ^ 1721750156;
                        i4 = 457217964;
                        i14 = iM6981 ^ i4;
                        viewGroup = viewGroup;
                        i22 = i22;
                        i13 = i3;
                        break;
                    case -1921203286:
                    case 263096348:
                        i17 = 53702;
                        iM6983 = (C2105.m6981("ܶ᩻") + i11) * 27;
                        i8 = ((iM6983 ^ i12) * 12675) ^ (-1655044663);
                        i9 = 2107274868;
                        i14 = iM6983 ^ i9;
                        i22 = i22;
                        i13 = i8;
                        viewGroup = viewGroup;
                        break;
                    case -1745940305:
                    case -689545232:
                        i22 = i22;
                        iM2568 = C0630.m2566(C11340.m28025(sArr, i18, i22, i17));
                        if (C1047.f3863 < 0) {
                            iM6983 = (C0630.m2566("ܳ᩺") ^ i11) * (-111);
                            i8 = ((iM6983 ^ i12) * 12453) ^ 393601228;
                            i9 = 1972958634;
                            i14 = iM6983 ^ i9;
                            i22 = i22;
                            i13 = i8;
                            viewGroup = viewGroup;
                        }
                        i22 = i22;
                        iM6984 = (C0630.m2566("᩷۫") + i12) * (-21);
                        i13 = ((iM6984 ^ i11) * (-27567)) ^ 1791534430;
                        i10 = 1276416611;
                        i14 = iM6984 ^ i10;
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
                        if (!C21923.m49329()) {
                            int iM25610 = C0630.m2566("֡֫") ^ i11;
                            i19 = i23;
                            i8 = ((iM25610 ^ i12) * (-28913)) ^ 429203250;
                            i14 = iM25610 ^ (-1505543456);
                            i22 = i2;
                            s2 = s;
                            i13 = i8;
                            viewGroup = viewGroup;
                        } else {
                            i19 = i23;
                            iM2566 = (i12 - C2105.m6981("۬ᩴ")) * (-97);
                            i6 = i2;
                            i13 = ((iM2566 ^ i11) * 28069) ^ 1591415538;
                            i7 = 796825238;
                            i14 = iM2566 ^ i7;
                            viewGroup = viewGroup;
                            i22 = i6;
                            s2 = s;
                        }
                        break;
                    case -1529857233:
                    case 1862105062:
                        viewInflate = layoutInflater2.inflate(2102831244 ^ iM2568, viewGroup, false);
                        if (C1294.m4372() > 0) {
                            iM6982 = C2105.m6981("ܶۡ") ^ i12;
                            i3 = ((iM6982 ^ i11) * 12529) ^ (-1850696151);
                            i5 = 672761560;
                            i14 = iM6982 ^ i5;
                            i13 = i3;
                        }
                        i22 = i22;
                        iM6981 = (i12 - C2105.m6981("֨᩷")) * 31;
                        i3 = ((iM6981 ^ i11) * 12035) ^ 1721750156;
                        i4 = 457217964;
                        i14 = iM6981 ^ i4;
                        viewGroup = viewGroup;
                        i22 = i22;
                        i13 = i3;
                        break;
                    case -1396792433:
                    case -920783891:
                        C0964.m3413();
                        break;
                    case -1391114110:
                    case 322951755:
                        i17 = 15105;
                        iM6983 = (C2105.m6981("ܶ᩻") + i11) * 27;
                        i8 = ((iM6983 ^ i12) * 12675) ^ (-1655044663);
                        i9 = 2107274868;
                        i14 = iM6983 ^ i9;
                        i22 = i22;
                        i13 = i8;
                        viewGroup = viewGroup;
                        break;
                    case -1150431096:
                    case 963118358:
                        if (C0714.f2697 >= 0) {
                            iM6982 = (C0630.m2566("۠۠") ^ i11) * (-35);
                            i3 = ((iM6982 ^ i12) * (-12551)) ^ 1538754100;
                            i5 = -1875206793;
                        } else {
                            iM6982 = C0630.m2566("ܽۚ") ^ i11;
                            i3 = ((iM6982 ^ i12) * 22393) ^ (-37043188);
                            i5 = -312681449;
                        }
                        i14 = iM6982 ^ i5;
                        i13 = i3;
                        break;
                    case -1080013935:
                    case -903347030:
                        i22 = i22;
                        layoutInflater2 = activityC18827.getLayoutInflater();
                        sArr = f44680;
                        i18 = 1;
                        if (C4159.f13567) {
                            iM6981 = C0630.m2566("ۡۢ") ^ i12;
                            i3 = ((iM6981 ^ i11) * 31179) ^ 1457994732;
                            i4 = 1826662389;
                        } else {
                            iM6981 = (i12 - C2105.m6981("֨᩷")) * 31;
                            i3 = ((iM6981 ^ i11) * 12035) ^ 1721750156;
                            i4 = 457217964;
                        }
                        i14 = iM6981 ^ i4;
                        viewGroup = viewGroup;
                        i22 = i22;
                        i13 = i3;
                        break;
                    case -1072242610:
                    case 1681464985:
                        C1294.m4372();
                        C0630.m2564();
                        return null;
                    case -883543371:
                    case 333505120:
                        s = s2;
                        i2 = i22;
                        sArr3 = f44680;
                        if (C3663.f11553) {
                            iM2566 = (i12 - C2105.m6981("۬ᩴ")) * (-97);
                            i6 = i2;
                            i13 = ((iM2566 ^ i11) * 28069) ^ 1591415538;
                            i7 = 796825238;
                        } else {
                            i6 = i2;
                            iM2566 = (C0630.m2566("۠ۚ") ^ i11) * 95;
                            i13 = ((iM2566 ^ i12) * 4591) ^ (-906340728);
                            i7 = 761850921;
                        }
                        i14 = iM2566 ^ i7;
                        viewGroup = viewGroup;
                        i22 = i6;
                        s2 = s;
                        break;
                    case -674631435:
                    case 432036942:
                        layoutInflater = activityC18827.getLayoutInflater();
                        sArr2 = f44680;
                        i15 = 4;
                        i16 = 3;
                        if (C22628.f73083 <= 0) {
                            iM6982 = (C0630.m2566("۠۠") ^ i11) * (-35);
                            i3 = ((iM6982 ^ i12) * (-12551)) ^ 1538754100;
                            i5 = -1875206793;
                        } else {
                            iM6982 = (i12 - C0630.m2566("ۚᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i3 = ((iM6982 ^ i11) * 2861) ^ (-1054731716);
                            i5 = -1840027610;
                        }
                        i14 = iM6982 ^ i5;
                        i13 = i3;
                        break;
                    case -649581402:
                    case 1379139216:
                        i22 = i22;
                        s2 = sArr3[0];
                        if (!C2272.f7362) {
                            iM6981 = (C2105.m6981("ܽۢ") ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i3 = ((iM6981 ^ i11) * 6755) ^ (-787473129);
                            i4 = -972259050;
                            i14 = iM6981 ^ i4;
                            viewGroup = viewGroup;
                            i22 = i22;
                            i13 = i3;
                        } else {
                            i22 = i22;
                            iM6984 = (C0630.m2566("᩷۫") + i12) * (-21);
                            i13 = ((iM6984 ^ i11) * (-27567)) ^ 1791534430;
                            i10 = 1276416611;
                            i14 = iM6984 ^ i10;
                            viewGroup = viewGroup;
                        }
                        break;
                    case -381873756:
                    case 16830215:
                        return new ViewOnClickListenerC8949(activityC18827, layoutInflater.inflate(2101462949 ^ iM2569, viewGroup, false));
                    case -146026813:
                    case 65147593:
                        iM2569 = C0630.m2566(C2105.m6988(sArr2, i15, i16, i17));
                        if (RunnableC1937.m6387() != 0) {
                            iM6982 = C0630.m2566("ܽۚ") ^ i11;
                            i3 = ((iM6982 ^ i12) * 22393) ^ (-37043188);
                            i5 = -312681449;
                        } else {
                            iM6982 = (C2105.m6981("᩹ۡ") + i11) * 53;
                            i3 = ((iM6982 ^ i12) * (-6093)) ^ 2122599397;
                            i5 = -733733973;
                        }
                        i14 = iM6982 ^ i5;
                        i13 = i3;
                        break;
                    case 155924705:
                    case 289478855:
                        i22 = i22;
                        if ((i20 + 254977024) - i19 >= 0) {
                            iM6981 = C0630.m2566("ۜܽ") ^ i12;
                            i3 = ((iM6981 ^ i11) * 11243) ^ 2015936571;
                            i4 = -325659162;
                        } else {
                            iM6981 = C0630.m2566("ܽۗ") ^ i11;
                            i3 = ((iM6981 ^ i12) * (-25025)) ^ (-1746007923);
                            i4 = -1137210534;
                        }
                        i14 = iM6981 ^ i4;
                        viewGroup = viewGroup;
                        i22 = i22;
                        i13 = i3;
                        break;
                    case 218805881:
                    case 1964338680:
                        i22 = 3;
                        if (C0422.m1963()) {
                            iM6984 = (C2105.m6981("ܽۙ") ^ i11) * 69;
                            i13 = ((iM6984 ^ i12) * 25551) ^ 245574813;
                            i10 = -69499709;
                        } else {
                            iM6984 = (C0630.m2566("᩷۫") + i12) * (-21);
                            i13 = ((iM6984 ^ i11) * (-27567)) ^ 1791534430;
                            i10 = 1276416611;
                        }
                        i14 = iM6984 ^ i10;
                        viewGroup = viewGroup;
                        break;
                    case 480381306:
                    case 1865657139:
                        s = s2;
                        i6 = i22;
                        if (RunnableC3474.f10992 > 0) {
                            iM2566 = C0630.m2566("ۡۖ") ^ i12;
                            i13 = ((iM2566 ^ i11) * 28527) ^ 576304488;
                            i7 = 1913320408;
                            i14 = iM2566 ^ i7;
                            viewGroup = viewGroup;
                            i22 = i6;
                            s2 = s;
                        } else {
                            i22 = i6;
                            s2 = s;
                            iM6984 = (C0630.m2566("᩷۫") + i12) * (-21);
                            i13 = ((iM6984 ^ i11) * (-27567)) ^ 1791534430;
                            i10 = 1276416611;
                            i14 = iM6984 ^ i10;
                            viewGroup = viewGroup;
                        }
                        break;
                    case 1112837377:
                    case 1942087790:
                        if (C7106.f21815 != 0) {
                            s = s2;
                            i2 = i22;
                            iM2566 = (i12 - C2105.m6981("۬ᩴ")) * (-97);
                            i6 = i2;
                            i13 = ((iM2566 ^ i11) * 28069) ^ 1591415538;
                            i7 = 796825238;
                            i14 = iM2566 ^ i7;
                            viewGroup = viewGroup;
                            i22 = i6;
                            s2 = s;
                        } else {
                            i22 = i22;
                            iM6981 = (i12 - C2105.m6981("֨᩷")) * 31;
                            i3 = ((iM6981 ^ i11) * 12035) ^ 1721750156;
                            i4 = 457217964;
                            i14 = iM6981 ^ i4;
                            viewGroup = viewGroup;
                            i22 = i22;
                            i13 = i3;
                        }
                        break;
                    default:
                        return new C6832(viewInflate);
                }
            }
            i22 = i22;
            activityC18827 = this.f44681;
            if (i == 0) {
                int iM6985 = C2105.m6981("۟ۖ") ^ i11;
                i13 = ((iM6985 ^ i12) * (-11269)) ^ (-871538992);
                i14 = iM6985 ^ 2025954569;
            } else {
                int iM6986 = (i12 - C2105.m6981("ۖۢ")) * 95;
                i14 = iM6986 ^ (-1611061803);
                i13 = ((iM6986 ^ i11) * (-30585)) ^ 1011294839;
            }
        }
    }

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        ActivityC18827 activityC18827 = null;
        ArrayList arrayList = null;
        AbstractC7809 abstractC7809 = null;
        int i2 = 620314503;
        int i3 = C3245.f10203;
        int i4 = C3911.f12484;
        int iM6981 = (C2105.m6981("᩵۟") + i4) * 47;
        int i5 = ((iM6981 ^ i3) * (-20841)) ^ 173926752;
        int i6 = -290218901;
        while (true) {
            i2 = ((((i2 ^ i3) * (-2139)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -1963439910:
                case -1240059835:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C0630.m2566("ᩴۜ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM6981 ^ i3) * (-23661)) ^ (-513517643);
                        i6 = -1936498557;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۢۚ")) * (-87);
                        i5 = ((iM6981 ^ i3) * 8063) ^ (-325264626);
                        i6 = -660363231;
                    }
                    break;
                case -1655770014:
                case 1687807308:
                    if (C5695.m16023() >= 0) {
                        iM6981 = C0630.m2566("᩹۟") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-18339)) ^ 1579139786;
                        i6 = 338672697;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۘܳ")) * (-125);
                        i5 = ((iM6981 ^ i4) * 7739) ^ (-896175333);
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
                    C1773.m5908();
                    if (C0483.f2088 < 0) {
                        iM6981 = C0630.m2566("ۢ֨") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-24569)) ^ 1682516395;
                        i6 = 80221257;
                    } else {
                        iM6981 = C2105.m6981("ܿۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    }
                    break;
                case -1340281173:
                case 1895279995:
                    if (abstractC7809.mo5657() == EnumC14158.f42725) {
                        iM6981 = C0630.m2566("֨ۛ") ^ i4;
                        i5 = ((iM6981 ^ i3) * FalconVrfy.R) ^ (-1136120748);
                        i6 = 1079382061;
                    } else {
                        iM6981 = C0630.m2566("ܰ᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-11857)) ^ (-1673316578);
                        i6 = 533625828;
                    }
                    break;
                case -1089258651:
                case 1615979077:
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("ܿۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    } else {
                        iM6981 = C0630.m2566("ܳᩴ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 11319) ^ 2083432912;
                        i6 = 1876474139;
                    }
                    break;
                case -940989922:
                case -934280426:
                    RunnableC0588.m2441();
                    iM6981 = C0630.m2566("ۧۨ") ^ i4;
                    i5 = ((iM6981 ^ i3) * (-20945)) ^ (-210528669);
                    i6 = -474597812;
                    break;
                case -711497500:
                case 2068732938:
                    arrayList = activityC18827.f59394;
                    if (C1005.m3501()) {
                        iM6981 = C2105.m6981("ۙ᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * 24005) ^ (-76067585);
                        i6 = 286524133;
                    } else {
                        iM6981 = C0630.m2566("᩹۟") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-18339)) ^ 1579139786;
                        i6 = 338672697;
                    }
                    break;
                case -134755792:
                case 2097581246:
                    abstractC7809 = (AbstractC7809) C3537.m10755(arrayList, i);
                    if (RunnableC3474.m10630()) {
                        iM6981 = C2105.m6981("᩵ۗ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 19023) ^ 965241825;
                        i6 = -1838772799;
                    } else {
                        iM6981 = C0630.m2566("ۧۨ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-20945)) ^ (-210528669);
                        i6 = -474597812;
                    }
                    break;
                case -50155194:
                case 1302403282:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C0630.m2566("᩹۟") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-18339)) ^ 1579139786;
                        i6 = 338672697;
                    } else {
                        iM6981 = C2105.m6981("۠᩷") ^ i4;
                        i5 = ((iM6981 ^ i3) * 8115) ^ 1764080482;
                        i6 = -1636261825;
                    }
                    break;
                case 89509048:
                case 1718335615:
                    AbstractC2021.m6574();
                    return 0;
                case 550820049:
                case 649172775:
                    if (C0483.f2088 >= 0) {
                        iM6981 = C2105.m6981("ܿۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    } else {
                        iM6981 = C0630.m2566("ۧۨ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-20945)) ^ (-210528669);
                        i6 = -474597812;
                    }
                    break;
                case 666224946:
                case 911597527:
                    if (C3911.m11924() > 0) {
                        iM6981 = (C0630.m2566("ᩴۜ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM6981 ^ i3) * (-23661)) ^ (-513517643);
                        i6 = -1936498557;
                    } else {
                        iM6981 = C2105.m6981("ܿۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    }
                    break;
                case 1040289345:
                case 2023451069:
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C0630.m2566("ᩴۜ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM6981 ^ i3) * (-23661)) ^ (-513517643);
                        i6 = -1936498557;
                    } else {
                        iM6981 = C0630.m2566("֫֡") ^ i3;
                        i5 = ((iM6981 ^ i4) * 12703) ^ 1154513819;
                        i6 = -1086908068;
                    }
                    break;
                case 1307237167:
                case 1341658672:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("ۧۨ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-20945)) ^ (-210528669);
                        i6 = -474597812;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۗ᩹")) * (-71);
                        i5 = ((iM6981 ^ i3) * 23119) ^ 213844157;
                        i6 = -1760332674;
                    }
                    break;
                case 1371229636:
                case 1716948281:
                    if (C5695.m16023() >= 0) {
                        iM6981 = C0630.m2566("ۢ֨") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-24569)) ^ 1682516395;
                        i6 = 80221257;
                    } else {
                        iM6981 = C2105.m6981("ۘ۬") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-24723)) ^ 523856298;
                        i6 = 1837208908;
                    }
                    break;
                default:
                    activityC18827 = this.f44681;
                    if (C0422.f1886 <= 0) {
                        iM6981 = C2105.m6981("ܿۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 16259) ^ (-1451398886);
                        i6 = -443540211;
                    } else {
                        iM6981 = C0630.m2566("֡ۘ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-29485)) ^ 1230987120;
                        i6 = -1649553592;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return C0382.m1847(this.f44681.f59394);
    }
}
