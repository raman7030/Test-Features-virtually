package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܿۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17245 implements InterfaceC18862, InterfaceC23206, InterfaceC4644, InterfaceC11918, InterfaceC21013, InterfaceC6403 {

    /* JADX INFO: renamed from: ֡ܶۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f52862 = {8317, -30368, 28666, -17061, -26236, -32311, -32532, -6823, -6821, -6817, 25997, -20131, 28738, 29546, 24933, -27459, -17782, -19128, 28189, 28919, -22015, 30497, -6823, -6821, -6830, -6827, -6823, -6821, -6833, -6838, -6829, -30842, 27028, -31245, 26054, 27028, -25003};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52863;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52864;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private final /* synthetic */ void m40529() {
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private final /* synthetic */ void m40530() {
    }

    @Override // l.InterfaceC23206
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo7078() {
        return false;
    }

    @Override // l.InterfaceC4644
    /* JADX INFO: renamed from: ֫ */
    public Bitmap mo5660() {
        return C17447.m40782((InterfaceC11098) this.f52864);
    }

    public /* synthetic */ C17245(int i, Object obj) {
        int i2 = 1540199012;
        int i3 = C3019.f9544;
        int i4 = C1773.f6144;
        this.f52863 = i;
        this.f52864 = obj;
        int iM2566 = (C0630.m2566("ۙ᩵") ^ i4) * (-111);
        int i5 = ((iM2566 ^ i3) * (-18127)) ^ 1028228312;
        int i6 = 822169558;
        while (true) {
            i2 = (iM2566 ^ i6) ^ (i5 & (((i2 ^ i3) * (-7127)) >> 31));
            switch (i2) {
                case -1966108356:
                case 497115166:
                    if (C1005.f3721) {
                        iM2566 = C2105.m6981("ۚۧ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-1763)) ^ (-465526860);
                        i6 = -1144430290;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܽۛ")) * 87;
                        i5 = ((iM2566 ^ i4) * (-7159)) ^ (-1346500605);
                        i6 = -887072045;
                    }
                    break;
                case -1787503723:
                case 637437534:
                    return;
                case -1370799414:
                case 550976369:
                    if (C7106.f21815 != 0) {
                        iM2566 = (C2105.m6981("ۨܽ") + i3) * (-21);
                        i5 = ((iM2566 ^ i4) * (-13707)) ^ 1103965674;
                        i6 = -1304436696;
                    } else {
                        iM2566 = C2105.m6981("ۡ۟") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-6831)) ^ (-455491410);
                        i6 = -150545928;
                    }
                    break;
                case 4995840:
                case 865232767:
                    C1294.m4372();
                    iM2566 = C2105.m6981("ۡ۟") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-6831)) ^ (-455491410);
                    i6 = -150545928;
                    break;
                case 179769517:
                case 1857142630:
                    C1773.m5908();
                    if (C0798.f2919) {
                        iM2566 = (C2105.m6981("ۨܽ") + i3) * (-21);
                        i5 = ((iM2566 ^ i4) * (-13707)) ^ 1103965674;
                        i6 = -1304436696;
                    } else {
                        iM2566 = (C0630.m2566("۬ܽ") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM2566 ^ i3) * 5113) ^ (-183335614);
                        i6 = -178084363;
                    }
                    break;
                case 637847311:
                case 1419946178:
                    if (C11340.f33930 < 0) {
                        iM2566 = C2105.m6981("ۡ۟") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-6831)) ^ (-455491410);
                        i6 = -150545928;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܳۙ")) * (-73);
                        i5 = ((iM2566 ^ i3) * 13565) ^ 1490616923;
                        i6 = -1936223263;
                    }
                    break;
                default:
                    C0714.m2805();
                    C2167.m7155();
                    throw new RuntimeException();
            }
        }
    }

    @Override // l.InterfaceC11918
    public void onGetPath(Bundle bundle, String str) {
        int i = -1065323188;
        int i2 = C0050.f910;
        int i3 = C3245.f10203;
        int iM6981 = C2105.m6981("ۖ᩸") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-11629)) ^ (-754717407);
        int i5 = -100262243;
        while (true) {
            i = ((((i ^ i3) * (-8039)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2075088698:
                case 111406516:
                    if (C1916.m6308() >= 0) {
                        iM6981 = (C2105.m6981("۟ܿ") + i3) * 23;
                        i4 = ((iM6981 ^ i2) * (-24835)) ^ 1799510492;
                        i5 = -626605368;
                    } else {
                        iM6981 = C0630.m2566("ܽۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-18589)) ^ 218108397;
                        i5 = 1968826845;
                    }
                    break;
                case -2061721776:
                case 125031074:
                    if (C1420.m4913()) {
                        iM6981 = C0630.m2566("֡᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22669) ^ 682929983;
                        i5 = 4684872;
                    } else {
                        iM6981 = C0630.m2566("ᩳܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8975)) ^ 946623447;
                        i5 = 1706084894;
                    }
                    break;
                case -2053024837:
                case 1068577990:
                    ViewOnClickListenerC21628 viewOnClickListenerC21628 = (ViewOnClickListenerC21628) this.f52864;
                    viewOnClickListenerC21628.m48868(new Runnable() { // from class: l.ܳܰ᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            String string = bundle.getString(MotionUtils.EASING_TYPE_PATH);
                            ViewOnClickListenerC21628 viewOnClickListenerC21629 = viewOnClickListenerC21628;
                            new C0460(viewOnClickListenerC21629, (AbstractActivityC3346) viewOnClickListenerC21629.requireActivity(), str, string).m20274();
                        }
                    });
                    break;
                case -1979968599:
                case -1041975664:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C0630.m2566("֡᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22669) ^ 682929983;
                        i5 = 4684872;
                    } else {
                        iM6981 = (C2105.m6981("ۙ۠") ^ i3) * 87;
                        i4 = ((iM6981 ^ i2) * (-25439)) ^ (-1248840640);
                        i5 = 87224710;
                    }
                    break;
                case -1883366621:
                case -655594181:
                    if (C2167.f7158 >= 0) {
                        iM6981 = C0630.m2566("ۚᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27683) ^ (-1190322908);
                        i5 = 1117366629;
                    } else {
                        iM6981 = C0630.m2566("᩸ۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 23119) ^ (-481372663);
                        i5 = 2030531999;
                    }
                    break;
                case -1869987216:
                case 182382958:
                    if (C3663.f11553) {
                        iM6981 = C0630.m2566("ۚᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27683) ^ (-1190322908);
                        i5 = 1117366629;
                    } else {
                        iM6981 = (C0630.m2566("ۚۘ") ^ i3) * 39;
                        i4 = ((iM6981 ^ i2) * (-6703)) ^ (-1031770055);
                        i5 = -818079431;
                    }
                    break;
                case -1844031539:
                case -1300664737:
                    if (C3746.f11829 <= 0) {
                        iM6981 = C0630.m2566("ۚᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27683) ^ (-1190322908);
                        i5 = 1117366629;
                    } else {
                        iM6981 = C2105.m6981("֨֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-1317)) ^ (-36470699);
                        i5 = -1628015557;
                    }
                    break;
                case -1581489241:
                case 511610016:
                    C11340.m28031();
                    C2105.m6982();
                    break;
                case -1131439792:
                case 943501925:
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("֡᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22669) ^ 682929983;
                        i5 = 4684872;
                    } else {
                        iM6981 = (C0630.m2566("ܳۡ") ^ i2) * (-113);
                        i4 = ((iM6981 ^ i3) * (-27621)) ^ 1241580375;
                        i5 = 689368976;
                    }
                    break;
                case -1111115253:
                case -1034126896:
                    C2167.m7155();
                    C11340.m28031();
                    iM6981 = C0630.m2566("ܶ᩺") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-17979)) ^ (-115759356);
                    i5 = -488936465;
                    break;
                case -343413718:
                case 1848161649:
                    if (C4159.f13567) {
                        iM6981 = (i2 - C0630.m2566("᩵ᩴ")) * (-61);
                        i4 = ((iM6981 ^ i3) * 31513) ^ (-472290158);
                        i5 = -944820118;
                    } else {
                        iM6981 = C0630.m2566("ܶ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17979)) ^ (-115759356);
                        i5 = -488936465;
                    }
                    break;
                case -52254220:
                case 1147992847:
                    C2272.m7503();
                    if (!C1504.f5354) {
                        iM6981 = C0630.m2566("ܶ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17979)) ^ (-115759356);
                        i5 = -488936465;
                    } else {
                        iM6981 = (C2105.m6981("۟ܿ") + i3) * 23;
                        i4 = ((iM6981 ^ i2) * (-24835)) ^ 1799510492;
                        i5 = -626605368;
                    }
                    break;
                case 103577533:
                case 1403713819:
                    if (C1005.f3721) {
                        iM6981 = C0630.m2566("᩶۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32077) ^ (-1414756624);
                        i5 = -69864256;
                    } else {
                        iM6981 = C0630.m2566("֡᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22669) ^ 682929983;
                        i5 = 4684872;
                    }
                    break;
                case 487312978:
                case 1204463958:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C0630.m2566("֡᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22669) ^ 682929983;
                        i5 = 4684872;
                    } else {
                        iM6981 = C0630.m2566("ۖ᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14649)) ^ (-1156309455);
                        i5 = -906077657;
                    }
                    break;
                case 1230343672:
                case 1625300951:
                    C7811.m20844();
                    if (C3245.m9925() == 0) {
                        iM6981 = C0630.m2566("ܶ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17979)) ^ (-115759356);
                        i5 = -488936465;
                    } else {
                        iM6981 = (C0630.m2566("ۗ᩷") ^ i3) * (-41);
                        i4 = ((iM6981 ^ i2) * 24117) ^ (-1876162381);
                        i5 = 1370964155;
                    }
                    break;
                default:
                    if (!C21923.m49329()) {
                        iM6981 = (C2105.m6981("۟ܿ") + i3) * 23;
                        i4 = ((iM6981 ^ i2) * (-24835)) ^ 1799510492;
                        i5 = -626605368;
                    } else {
                        iM6981 = C0630.m2566("֡᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22669) ^ 682929983;
                        i5 = 4684872;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC23206
    /* JADX INFO: renamed from: ֫ */
    public void mo8486(String str) {
        Object obj = null;
        int i = 699426448;
        int i2 = AbstractC2021.f6743;
        int i3 = C1773.f6144;
        int iM2566 = (C0630.m2566("ۧۖ") + i2) * 87;
        int i4 = ((iM2566 ^ i3) * (-21485)) ^ (-506779448);
        int i5 = 990865021;
        while (true) {
            i = ((((i ^ i3) * (-12853)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2088698921:
                case -1187439355:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 13165) ^ 503388136;
                        i5 = 1615097769;
                    } else {
                        iM2566 = C0630.m2566("ۖ۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4071)) ^ (-257229014);
                        i5 = 2088163631;
                    }
                    break;
                case -1668397589:
                case 719096934:
                    if (C1005.f3721) {
                        iM2566 = (C2105.m6981("ۖ᩻") + i3) * 101;
                        i4 = ((iM2566 ^ i2) * 8229) ^ (-766369877);
                        i5 = 741298117;
                    } else {
                        iM2566 = (C2105.m6981("ܶܺ") ^ i3) * (-3);
                        i4 = ((iM2566 ^ i2) * (-27253)) ^ 159648103;
                        i5 = 2102171662;
                    }
                    break;
                case -1541251794:
                case 810874798:
                    if (C0964.f3626 != 0) {
                        iM2566 = (C2105.m6981("ܶܺ") ^ i3) * (-3);
                        i4 = ((iM2566 ^ i2) * (-27253)) ^ 159648103;
                        i5 = 2102171662;
                    } else {
                        iM2566 = C2105.m6981("ۖۤ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 683) ^ (-642525572);
                        i5 = -362576449;
                    }
                    break;
                case -1469063479:
                case 584814479:
                    obj = this.f52864;
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 13165) ^ 503388136;
                        i5 = 1615097769;
                    } else {
                        iM2566 = C2105.m6981("᩸᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-8817)) ^ 1544823894;
                        i5 = -1522543168;
                    }
                    break;
                case -1042291047:
                case 1259826628:
                    if (C0483.f2088 >= 0) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 13165) ^ 503388136;
                        i5 = 1615097769;
                    } else {
                        iM2566 = C2105.m6981("ۨᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25391)) ^ (-2005842920);
                        i5 = -2033037388;
                    }
                    break;
                case -992067961:
                case 2021934610:
                    if (C0382.f1805) {
                        iM2566 = (i2 - C2105.m6981("֡ۖ")) * (-19);
                        i4 = ((iM2566 ^ i3) * 3981) ^ (-421217091);
                        i5 = -629955758;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۤ᩺")) * 93;
                        i4 = ((iM2566 ^ i2) * 2335) ^ (-1279929301);
                        i5 = -870827304;
                    }
                    break;
                case -479693194:
                case 1728349658:
                    RunnableC3474.m10630();
                    if (C1711.m5736() > 0) {
                        iM2566 = (C2105.m6981("ܶܺ") ^ i3) * (-3);
                        i4 = ((iM2566 ^ i2) * (-27253)) ^ 159648103;
                        i5 = 2102171662;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۙ") ^ i2) * (-13);
                        i4 = ((iM2566 ^ i3) * (-27051)) ^ (-1300038335);
                        i5 = 176629287;
                    }
                    break;
                case -333584574:
                case 1325006410:
                    C1047.m3599();
                    if (C4263.m12819() >= 0) {
                        iM2566 = (i3 - C2105.m6981("ۤ᩺")) * 93;
                        i4 = ((iM2566 ^ i2) * 2335) ^ (-1279929301);
                        i5 = -870827304;
                    } else {
                        iM2566 = C2105.m6981("ܿ᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * 2041) ^ (-194698839);
                        i5 = -1245576467;
                    }
                    break;
                case -300901298:
                case -208268099:
                    ((ActivityC19932) obj).f64529.mo1669(str);
                    break;
                case 243115268:
                case 1825659566:
                    if (C1916.m6308() >= 0) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 13165) ^ 503388136;
                        i5 = 1615097769;
                    } else {
                        iM2566 = (C2105.m6981("᩸᩵") ^ i2) * 81;
                        i4 = ((iM2566 ^ i3) * 25405) ^ (-2143589448);
                        i5 = 1949532334;
                    }
                    break;
                case 244052580:
                case 1687980416:
                    RunnableC0588.m2441();
                    C1005.m3501();
                    iM2566 = (C0630.m2566("ᩴۙ") ^ i2) * (-13);
                    i4 = ((iM2566 ^ i3) * (-27051)) ^ (-1300038335);
                    i5 = 176629287;
                    break;
                case 528857200:
                case 1217422656:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C2105.m6981("ܶܺ") ^ i3) * (-3);
                        i4 = ((iM2566 ^ i2) * (-27253)) ^ 159648103;
                        i5 = 2102171662;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩺᩸")) * (-13);
                        i4 = ((iM2566 ^ i2) * (-10555)) ^ (-900004667);
                        i5 = 431231405;
                    }
                    break;
                case 693688829:
                case 1564146722:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C2105.m6981("ܿ᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * 2041) ^ (-194698839);
                        i5 = -1245576467;
                    } else {
                        iM2566 = (C2105.m6981("ۘܳ") ^ i2) * 61;
                        i4 = ((iM2566 ^ i3) * 7323) ^ (-1144896134);
                        i5 = -1765621546;
                    }
                    break;
                case 913138872:
                case 1218696686:
                    AbstractC2021.m6574();
                    if (C0483.f2088 < 0) {
                        iM2566 = C2105.m6981("ܿ᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * 2041) ^ (-194698839);
                        i5 = -1245576467;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۙ") ^ i2) * (-13);
                        i4 = ((iM2566 ^ i3) * (-27051)) ^ (-1300038335);
                        i5 = 176629287;
                    }
                    break;
                case 1330555299:
                case 2032029075:
                    if (C3663.f11553) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 13165) ^ 503388136;
                        i5 = 1615097769;
                    } else {
                        iM2566 = C0630.m2566("ۧܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-21441)) ^ (-1838116531);
                        i5 = 1114433140;
                    }
                    break;
                default:
                    RunnableC1937.m6387();
                    RunnableC1108.m3790();
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫ */
    public void mo7076(AbstractC5698 abstractC5698) {
        Object obj = null;
        int i = 1509016512;
        int i2 = C1047.f3863;
        int i3 = C11340.f33930;
        int iM2566 = C0630.m2566("ۘܶ") ^ i3;
        int i4 = ((iM2566 ^ i2) * 24299) ^ 80310015;
        int i5 = 1244694136;
        while (true) {
            i = ((((i ^ i2) * 5489) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2113680987:
                case 791326487:
                    obj = this.f52864;
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C2105.m6981("۫ᩳ") ^ i2) * (-49);
                        i4 = ((iM2566 ^ i3) * 2413) ^ 1134185975;
                        i5 = -34800357;
                    } else {
                        iM2566 = (C2105.m6981("ۙۜ") ^ i2) * (-73);
                        i4 = ((iM2566 ^ i3) * (-14977)) ^ (-1987544801);
                        i5 = -367428812;
                    }
                    break;
                case -2039073887:
                case 211339868:
                    if (C0422.m1963()) {
                        iM2566 = (i2 - C0630.m2566("ۘᩳ")) * (-45);
                        i4 = ((iM2566 ^ i3) * (-16217)) ^ (-512562689);
                        i5 = -817607972;
                    } else {
                        iM2566 = (C0630.m2566("۠᩻") + i2) * (-101);
                        i4 = ((iM2566 ^ i3) * 31947) ^ 1820193980;
                        i5 = 1679154710;
                    }
                    break;
                case -2013458373:
                case 1576113216:
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C2105.m6981("۫ᩳ") ^ i2) * (-49);
                        i4 = ((iM2566 ^ i3) * 2413) ^ 1134185975;
                        i5 = -34800357;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۙۢ")) * 23;
                        i4 = ((iM2566 ^ i2) * (-10789)) ^ (-19538298);
                        i5 = -1917445104;
                    }
                    break;
                case -2000475896:
                case 1164048980:
                    if (AbstractC2021.m6574()) {
                        iM2566 = (C0630.m2566("ۡۢ") + i3) * 45;
                        i4 = ((iM2566 ^ i2) * (-8419)) ^ (-2037276295);
                        i5 = 468812524;
                    } else {
                        iM2566 = (C2105.m6981("᩹ۡ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2566 ^ i3) * (-25243)) ^ 141804830;
                        i5 = 1766440781;
                    }
                    break;
                case -1873242059:
                case 776613636:
                    if (C4159.f13567) {
                        iM2566 = C2105.m6981("ܽۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-25631)) ^ (-1863640620);
                        i5 = -1909777422;
                    } else {
                        iM2566 = (C0630.m2566("ۡۢ") + i3) * 45;
                        i4 = ((iM2566 ^ i2) * (-8419)) ^ (-2037276295);
                        i5 = 468812524;
                    }
                    break;
                case -1820832172:
                case 372637524:
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = (C0630.m2566("ۡۢ") + i3) * 45;
                        i4 = ((iM2566 ^ i2) * (-8419)) ^ (-2037276295);
                        i5 = 468812524;
                    } else {
                        iM2566 = (C2105.m6981("֫ۨ") + i3) * 37;
                        i4 = ((iM2566 ^ i2) * 29313) ^ 2010603525;
                        i5 = 980060264;
                    }
                    break;
                case -1737069077:
                case 1116858322:
                    ((InterfaceC6403) obj).mo7076(abstractC5698);
                    break;
                case -1720377400:
                case -73955449:
                    if (C0964.m3413()) {
                        iM2566 = C2105.m6981("᩵֨") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-17791)) ^ 240434941;
                        i5 = -1982297425;
                    } else {
                        iM2566 = (C0630.m2566("ۡۢ") + i3) * 45;
                        i4 = ((iM2566 ^ i2) * (-8419)) ^ (-2037276295);
                        i5 = 468812524;
                    }
                    break;
                case -1642431974:
                case -330320900:
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C0630.m2566("۠᩻") + i2) * (-101);
                        i4 = ((iM2566 ^ i3) * 31947) ^ 1820193980;
                        i5 = 1679154710;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۫۬")) * (-35);
                        i4 = ((iM2566 ^ i2) * 26781) ^ 1118876019;
                        i5 = -222155437;
                    }
                    break;
                case -1128025700:
                case 1353702629:
                    if (C0798.f2919) {
                        iM2566 = (C0630.m2566("۠᩻") + i2) * (-101);
                        i4 = ((iM2566 ^ i3) * 31947) ^ 1820193980;
                        i5 = 1679154710;
                    } else {
                        iM2566 = C0630.m2566("ۜۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-17967)) ^ (-1958622745);
                        i5 = 336445916;
                    }
                    break;
                case -444528493:
                case -313215210:
                    if (C2958.m9034() <= 0) {
                        iM2566 = (C0630.m2566("ۡۢ") + i3) * 45;
                        i4 = ((iM2566 ^ i2) * (-8419)) ^ (-2037276295);
                        i5 = 468812524;
                    } else {
                        iM2566 = (C0630.m2566("ܺۛ") ^ i3) * (-73);
                        i4 = ((iM2566 ^ i2) * (-163)) ^ (-1207001514);
                        i5 = -150102285;
                    }
                    break;
                case 55835088:
                case 1245874522:
                    if (!C4159.f13567) {
                        iM2566 = (C0630.m2566("ۡۢ") + i3) * 45;
                        i4 = ((iM2566 ^ i2) * (-8419)) ^ (-2037276295);
                        i5 = 468812524;
                    } else {
                        iM2566 = (C0630.m2566("۠᩻") + i2) * (-101);
                        i4 = ((iM2566 ^ i3) * 31947) ^ 1820193980;
                        i5 = 1679154710;
                    }
                    break;
                case 273501763:
                case 825792306:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C0630.m2566("ۡۢ") + i3) * 45;
                        i4 = ((iM2566 ^ i2) * (-8419)) ^ (-2037276295);
                        i5 = 468812524;
                    } else {
                        iM2566 = C2105.m6981("ܽ᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-18621)) ^ (-133816931);
                        i5 = 379511719;
                    }
                    break;
                case 1141316278:
                case 1263700858:
                    C1047.m3599();
                    iM2566 = (C0630.m2566("ۡۢ") + i3) * 45;
                    i4 = ((iM2566 ^ i2) * (-8419)) ^ (-2037276295);
                    i5 = 468812524;
                    break;
                case 1350440373:
                case 1994189756:
                    C1047.m3599();
                    break;
                default:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (C0630.m2566("ۡۢ") + i3) * 45;
                        i4 = ((iM2566 ^ i2) * (-8419)) ^ (-2037276295);
                        i5 = 468812524;
                    } else {
                        iM2566 = (C0630.m2566("ܽ֨") + i3) * (-91);
                        i4 = ((iM2566 ^ i2) * (-3917)) ^ (-2010279513);
                        i5 = 678557279;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC21013
    /* JADX INFO: renamed from: ۧ */
    public Object mo12796() {
        Object obj = null;
        String str = null;
        int i = -1790390133;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = RunnableC3474.f10992;
        int iM2566 = C0630.m2566("᩵֨") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-1427)) ^ (-1543024173);
        int i5 = 1080695392;
        while (true) {
            i = ((((i ^ i2) * 28505) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2100321528:
                case 38021529:
                    if (C0798.f2919) {
                        iM2566 = C0630.m2566("᩺ᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18997) ^ (-1470952685);
                        i5 = -1081510213;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩷᩺")) * (-11);
                        i4 = ((iM2566 ^ i2) * (-955)) ^ 412724819;
                        i5 = -580303507;
                    }
                    break;
                case -1645724411:
                case 1555135073:
                    if (C4075.f12947 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ܰۧ")) * (-109);
                        i4 = ((iM2566 ^ i2) * 12715) ^ (-1427229379);
                        i5 = 431177532;
                    } else {
                        iM2566 = C2105.m6981("۟ܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16659)) ^ (-156326243);
                        i5 = -1515142689;
                    }
                    break;
                case -1560073338:
                case -166863889:
                    C3019.m9255();
                    C3663.m11168();
                    iM2566 = (i2 - C2105.m6981("۠֫")) * (-29);
                    i4 = ((iM2566 ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION) ^ (-1585733893);
                    i5 = -827032056;
                    break;
                case -1396259112:
                case 562294302:
                    obj = this.f52864;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C0630.m2566("۠ܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14509) ^ (-1642794125);
                        i5 = -1507592105;
                    } else {
                        iM2566 = (C2105.m6981("ܶۨ") + i3) * (-13);
                        i4 = ((iM2566 ^ i2) * 18963) ^ (-1879157899);
                        i5 = -1050526191;
                    }
                    break;
                case -1350721581:
                case 1561498713:
                    if (C4075.f12947 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ܰۧ")) * (-109);
                        i4 = ((iM2566 ^ i2) * 12715) ^ (-1427229379);
                        i5 = 431177532;
                    } else {
                        iM2566 = (C0630.m2566("ۡ֡") + i2) * 45;
                        i4 = ((iM2566 ^ i3) * (-22613)) ^ (-760054042);
                        i5 = 2137433220;
                    }
                    break;
                case -1257442417:
                case -1097000053:
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C0630.m2566("ۜ۟") ^ i3) * (-127);
                        i4 = ((iM2566 ^ i2) * 941) ^ 776546956;
                        i5 = -1697438527;
                    } else {
                        iM2566 = C0630.m2566("ۙۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 16963) ^ 780323155;
                        i5 = 1260965917;
                    }
                    break;
                case -1229238068:
                case -1043324726:
                    C1773.m5908();
                    return null;
                case -943068759:
                case 550423055:
                    AbstractC2021.m6574();
                    if (C0422.f1886 <= 0) {
                        iM2566 = (i3 - C0630.m2566("ܰۧ")) * (-109);
                        i4 = ((iM2566 ^ i2) * 12715) ^ (-1427229379);
                        i5 = 431177532;
                    } else {
                        iM2566 = (i2 - C2105.m6981("۠֫")) * (-29);
                        i4 = ((iM2566 ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION) ^ (-1585733893);
                        i5 = -827032056;
                    }
                    break;
                case -841613409:
                case -241976874:
                    if (C2105.f7037 != 0) {
                        iM2566 = C0630.m2566("۠ܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14509) ^ (-1642794125);
                        i5 = -1507592105;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۫ܺ")) * 91;
                        i4 = ((iM2566 ^ i2) * 5967) ^ 459172866;
                        i5 = -865311021;
                    }
                    break;
                case -783182435:
                case 1212293500:
                    if (C0964.f3626 != 0) {
                        iM2566 = (C0630.m2566("ۜ۟") ^ i3) * (-127);
                        i4 = ((iM2566 ^ i2) * 941) ^ 776546956;
                        i5 = -1697438527;
                    } else {
                        iM2566 = (C2105.m6981("۬᩻") ^ i3) * 17;
                        i4 = ((iM2566 ^ i2) * 15767) ^ 542143497;
                        i5 = -576941413;
                    }
                    break;
                case -771839611:
                case -341205578:
                    if (C3245.f10203 > 0) {
                        iM2566 = (C0630.m2566("ۜ۟") ^ i3) * (-127);
                        i4 = ((iM2566 ^ i2) * 941) ^ 776546956;
                        i5 = -1697438527;
                    } else {
                        iM2566 = (i2 - C2105.m6981("۠֫")) * (-29);
                        i4 = ((iM2566 ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION) ^ (-1585733893);
                        i5 = -827032056;
                    }
                    break;
                case -645588121:
                case 501858506:
                    throw new C13934(str);
                case 375703615:
                case 540471893:
                    str = (String) obj;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("۠ܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14509) ^ (-1642794125);
                        i5 = -1507592105;
                    } else {
                        iM2566 = C0630.m2566("ᩴۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-8481)) ^ 943996164;
                        i5 = 1237933584;
                    }
                    break;
                case 520859402:
                case 575986935:
                    if (C0964.m3413()) {
                        iM2566 = C2105.m6981("ۡ۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6729) ^ 329354781;
                        i5 = 1029401575;
                    } else {
                        iM2566 = (i2 - C2105.m6981("۠֫")) * (-29);
                        i4 = ((iM2566 ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION) ^ (-1585733893);
                        i5 = -827032056;
                    }
                    break;
                case 1335364964:
                case 1457193854:
                    C0714.m2805();
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("᩺ᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18997) ^ (-1470952685);
                        i5 = -1081510213;
                    } else {
                        iM2566 = (C0630.m2566("ۜ۟") ^ i3) * (-127);
                        i4 = ((iM2566 ^ i2) * 941) ^ 776546956;
                        i5 = -1697438527;
                    }
                    break;
                default:
                    if (C3663.f11553) {
                        iM2566 = (i2 - C2105.m6981("۠֫")) * (-29);
                        i4 = ((iM2566 ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION) ^ (-1585733893);
                        i5 = -827032056;
                    } else {
                        iM2566 = (C2105.m6981("ۜ᩸") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2566 ^ i3) * (-14059)) ^ (-1569644983);
                        i5 = -1441005000;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0156, code lost:
    
        if (l.C4159.m12565() < 0) goto L16;
     */
    @Override // l.InterfaceC18862
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6267(AbstractC15440 abstractC15440) {
        final TextView textView;
        boolean z;
        String str;
        short[] sArr;
        int i;
        short[] sArr2;
        DialogInterface.OnClickListener onClickListener;
        short[] sArr3;
        InterfaceC12344 interfaceC12344;
        short[] sArr4;
        short[] sArr5;
        C2978 c2978;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int i6;
        short[] sArr6;
        InterfaceC12344 interfaceC12345;
        short[] sArr7;
        short[] sArr8;
        short[] sArr9;
        int i7;
        short[] sArr10;
        short[] sArr11;
        DialogInterface.OnClickListener onClickListener2;
        InterfaceC12344 interfaceC12346;
        int iM2566;
        int i8;
        int i9;
        short[] sArr12;
        short[] sArr13;
        short[] sArr14;
        DialogInterface.OnClickListener onClickListener3;
        int iM6983;
        int i10;
        int i11;
        int iM6984;
        TextView textView2;
        short[] sArr15;
        short[] sArr16;
        int i12;
        short[] sArr17;
        DialogInterface.OnClickListener onClickListener4;
        int i13;
        short[] sArr18;
        int i14;
        int i15 = 0;
        String strM1483 = null;
        int iM6985 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 381106673;
        int i19 = AbstractC2021.f6743;
        int i20 = C0714.f2697;
        int iM6986 = C2105.m6981("ۚᩳ") ^ i20;
        int i21 = ((iM6986 ^ i19) * (-27993)) ^ 1064445776;
        int i22 = iM6986 ^ 532786075;
        C8901 c8901 = null;
        String strM3603 = null;
        TextView textView3 = null;
        C2978 c2979 = null;
        C19258 c19258 = null;
        DialogInterface.OnClickListener onClickListener5 = null;
        short[] sArr19 = null;
        short[] sArr20 = null;
        short[] sArr21 = null;
        short[] sArr22 = null;
        short[] sArr23 = null;
        boolean z2 = false;
        boolean z3 = false;
        C16560 c16560 = null;
        short s = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        Main main = null;
        InterfaceC12344 interfaceC12347 = null;
        final TextView textView4 = null;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = null;
        InterfaceC12344 interfaceC12348 = null;
        short[] sArr24 = null;
        int i27 = 0;
        final Spinner spinnerM22974 = null;
        View viewM3507 = null;
        View viewM9259 = null;
        int i28 = 0;
        C2978 c29710 = null;
        final C2978 c29711 = null;
        String strM4373 = null;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i19) * (-13895)) >> 31));
            switch (i18) {
                case -2137407047:
                case 972092989:
                    TextView textView5 = textView4;
                    InterfaceC12344 interfaceC12349 = interfaceC12348;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener3 = onCheckedChangeListener2;
                    C2978 c29712 = c2979;
                    boolean z4 = z3;
                    c8901 = c8901;
                    z = z4;
                    C4263.m12814(c29712, C4263.m12818(interfaceC12349, strM4373, z2));
                    C1504.m5166(c29712, new C1845(0));
                    C19258 c19258M2130 = C0483.m2130(main);
                    C0798.m3013(c19258M2130, viewM9259);
                    int iM2567 = (C0630.m2566("ᩳ᩹") ^ i19) * 31;
                    i22 = iM2567 ^ 1669858929;
                    onCheckedChangeListener2 = onCheckedChangeListener3;
                    c2979 = c29712;
                    i21 = ((iM2567 ^ i20) * (-29255)) ^ 1222307573;
                    textView3 = textView3;
                    interfaceC12348 = interfaceC12349;
                    c29711 = c29711;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView5;
                    c19258 = c19258M2130;
                    C8901 c8902 = c8901;
                    z3 = z;
                    c8901 = c8902;
                    break;
                case -2113782615:
                case 914154684:
                    short[] sArr25 = sArr24;
                    c29711 = c29711;
                    InterfaceC12344 interfaceC123410 = interfaceC12347;
                    c2979 = c2979;
                    c19258 = c19258;
                    interfaceC12348 = interfaceC12348;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    DialogInterface.OnClickListener onClickListener6 = onClickListener5;
                    String str2 = strM3603;
                    TextView textView6 = textView3;
                    textView4 = textView4;
                    spinnerM22974 = spinnerM22974;
                    textView = textView6;
                    boolean z5 = z3;
                    c8901 = c8901;
                    z = z5;
                    boolean zM12818 = C4263.m12818(interfaceC123410, str2, z2);
                    C2978 c29713 = c29710;
                    C0964.m3401(c29713, zM12818);
                    C3663.m11173(c29713, new C13551());
                    int iM6987 = C2105.m6981("ۛܰ") ^ i20;
                    c29710 = c29713;
                    i21 = ((iM6987 ^ i19) * (-32233)) ^ 122208953;
                    i22 = iM6987 ^ 1904185947;
                    sArr22 = sArr22;
                    interfaceC12347 = interfaceC123410;
                    sArr24 = sArr25;
                    sArr23 = sArr23;
                    i25 = i25;
                    sArr21 = sArr21;
                    strM3603 = str2;
                    onClickListener5 = onClickListener6;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    c2979 = c2979;
                    c29711 = c29711;
                    TextView textView7 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView7;
                    C8901 c8903 = c8901;
                    z3 = z;
                    c8901 = c8903;
                    break;
                case -1968845127:
                case -1554570632:
                    sArr3 = sArr24;
                    c29711 = c29711;
                    c2979 = c2979;
                    sArr = sArr21;
                    i = i25;
                    sArr2 = sArr23;
                    c19258 = c19258;
                    interfaceC12348 = interfaceC12348;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    onClickListener = onClickListener5;
                    String str3 = strM3603;
                    interfaceC12344 = interfaceC12347;
                    sArr5 = sArr22;
                    TextView textView8 = textView3;
                    textView4 = textView4;
                    spinnerM22974 = spinnerM22974;
                    textView = textView8;
                    boolean z6 = z3;
                    c8901 = c8901;
                    z = z6;
                    str = str3;
                    sArr4 = sArr20;
                    c29710 = (C2978) C11340.m28028(viewM9259, C2105.m6981(C3019.m9250(sArr4, 4, 3, i27)) ^ 2129319072);
                    iM6982 = (C0630.m2566("ܳ᩷") + i19) * (-65);
                    i5 = ((iM6982 ^ i20) * 22909) ^ (-1975832465);
                    i6 = 1910710676;
                    i22 = iM6982 ^ i6;
                    sArr20 = sArr4;
                    i21 = i5;
                    sArr22 = sArr5;
                    interfaceC12347 = interfaceC12344;
                    onClickListener5 = onClickListener;
                    sArr24 = sArr3;
                    sArr23 = sArr2;
                    i25 = i;
                    sArr21 = sArr;
                    strM3603 = str;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    c2979 = c2979;
                    c29711 = c29711;
                    TextView textView9 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView9;
                    C8901 c8904 = c8901;
                    z3 = z;
                    c8901 = c8904;
                    break;
                case -1956901834:
                case 1895373669:
                    c29711 = c29711;
                    TextView textView10 = textView4;
                    Spinner spinner = spinnerM22974;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener4 = onCheckedChangeListener2;
                    C2978 c29714 = c2979;
                    textView = textView3;
                    c19258 = c19258;
                    boolean z7 = z3;
                    c8901 = c8901;
                    z = z7;
                    C4263.m12814(c29711, z);
                    interfaceC12348 = ApplicationC20075.f65008;
                    strM4373 = C1294.m4373(f52862, 26, 5, i27);
                    if (C22628.f73083 > 0) {
                        int iM6988 = (i20 - C2105.m6981("ۤ᩹")) * (-109);
                        i22 = iM6988 ^ 1363733669;
                        onCheckedChangeListener2 = onCheckedChangeListener4;
                        i21 = ((iM6988 ^ i19) * (-28789)) ^ 959397165;
                        textView3 = textView;
                        c19258 = c19258;
                        spinnerM22974 = spinner;
                        textView4 = textView10;
                        c2979 = c29714;
                        c29711 = c29711;
                        C8901 c8905 = c8901;
                        z3 = z;
                        c8901 = c8905;
                    } else {
                        c2978 = c29714;
                        spinnerM22974 = spinner;
                        textView4 = textView10;
                        onCheckedChangeListener = onCheckedChangeListener4;
                        interfaceC12345 = interfaceC12347;
                        sArr6 = sArr19;
                        sArr7 = sArr22;
                        int iM2568 = (i20 - C0630.m2566("۟ۡ")) * 55;
                        short[] sArr26 = sArr6;
                        i21 = ((iM2568 ^ i19) * (-12133)) ^ (-2028928387);
                        i22 = iM2568 ^ 1841716521;
                        i24 = i24;
                        i23 = i23;
                        sArr22 = sArr7;
                        interfaceC12347 = interfaceC12345;
                        onClickListener5 = onClickListener5;
                        sArr24 = sArr24;
                        sArr23 = sArr23;
                        i25 = i25;
                        sArr21 = sArr21;
                        strM3603 = strM3603;
                        sArr19 = sArr26;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                        c29711 = c29711;
                        TextView textView11 = textView;
                        spinnerM22974 = spinnerM22974;
                        textView4 = textView4;
                        textView3 = textView11;
                        C8901 c8906 = c8901;
                        z3 = z;
                        c8901 = c8906;
                        C19258 c19259 = c19258;
                        c2979 = c2978;
                        c19258 = c19259;
                    }
                    break;
                case -1886319475:
                case 330202134:
                    sArr8 = sArr24;
                    c29711 = c29711;
                    c2979 = c2979;
                    sArr9 = sArr21;
                    i7 = i25;
                    sArr10 = sArr22;
                    sArr11 = sArr23;
                    c19258 = c19258;
                    interfaceC12348 = interfaceC12348;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    onClickListener2 = onClickListener5;
                    TextView textView12 = textView3;
                    textView4 = textView4;
                    spinnerM22974 = spinnerM22974;
                    textView = textView12;
                    boolean z8 = z3;
                    c8901 = c8901;
                    z = z8;
                    interfaceC12346 = ApplicationC20075.f65008;
                    strM3603 = C1047.m3603(f52862, 7, 3, i27);
                    z2 = true;
                    if (C1047.f3863 >= 0) {
                        iM2566 = (i19 - C2105.m6981("᩻ܽ")) * (-69);
                        i8 = ((iM2566 ^ i20) * 13807) ^ 982656548;
                        i9 = 1360329288;
                    } else {
                        iM2566 = (C0630.m2566("ܺ᩺") + i19) * 81;
                        i8 = ((iM2566 ^ i20) * 1165) ^ 308605699;
                        i9 = -297494950;
                    }
                    i22 = iM2566 ^ i9;
                    sArr22 = sArr10;
                    onClickListener5 = onClickListener2;
                    sArr23 = sArr11;
                    i25 = i7;
                    sArr21 = sArr9;
                    interfaceC12347 = interfaceC12346;
                    i21 = i8;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    sArr24 = sArr8;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    c2979 = c2979;
                    c29711 = c29711;
                    TextView textView13 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView13;
                    C8901 c8907 = c8901;
                    z3 = z;
                    c8901 = c8907;
                    break;
                case -1852940449:
                case 1279693150:
                    i2 = i23;
                    textView = textView3;
                    z = z3;
                    s = f52862[0];
                    i17 = (s * s) + 6497401;
                    int iM6989 = C2105.m6981("ۗۢ") ^ i19;
                    i22 = iM6989 ^ (-1275143440);
                    i21 = ((iM6989 ^ i20) * (-16491)) ^ (-122130676);
                    sArr22 = sArr22;
                    interfaceC12347 = interfaceC12347;
                    onClickListener5 = onClickListener5;
                    sArr24 = sArr24;
                    sArr23 = sArr23;
                    i25 = i25;
                    sArr21 = sArr21;
                    strM3603 = strM3603;
                    sArr20 = sArr20;
                    sArr19 = sArr19;
                    i23 = i2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    c2979 = c2979;
                    c29711 = c29711;
                    TextView textView14 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView14;
                    C8901 c8908 = c8901;
                    z3 = z;
                    c8901 = c8908;
                    break;
                case -1611251615:
                case -349211132:
                    RunnableC1937.m6387();
                    C1711.m5736();
                    break;
                case -1571209640:
                case -373493336:
                    C2978 c29715 = c29711;
                    TextView textView15 = textView4;
                    Spinner spinner2 = spinnerM22974;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener5 = onCheckedChangeListener2;
                    TextView textView16 = textView3;
                    C1504.m5166(c29715, onCheckedChangeListener5);
                    boolean zM3400 = C0964.m3400(ApplicationC20075.f65008, C2958.m9031(f52862, 22, 4, i27), false);
                    int iM69810 = (i19 - C2105.m6981("ۧܽ")) * (-9);
                    int i29 = ((iM69810 ^ i20) * 23373) ^ (-968880243);
                    i22 = iM69810 ^ (-2064539602);
                    onCheckedChangeListener2 = onCheckedChangeListener5;
                    c8901 = c8901;
                    textView4 = textView15;
                    z3 = zM3400;
                    i21 = i29;
                    textView3 = textView16;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    spinnerM22974 = spinner2;
                    c2979 = c2979;
                    c29711 = c29715;
                    break;
                case -1569176010:
                case -791499230:
                    C2978 c29716 = c29711;
                    boolean z9 = z3;
                    C2978 c29717 = c2979;
                    C19258 c192510 = c19258;
                    InterfaceC12344 interfaceC123411 = interfaceC12348;
                    c16560 = (C16560) this.f52864;
                    C8901 c8909 = new C8901(abstractC15440);
                    Main mainM50612 = C22628.m50612(c16560);
                    int iM2569 = C0630.m2566("ܽ᩸") ^ i19;
                    i21 = ((iM2569 ^ i20) * (-4533)) ^ (-143452245);
                    i22 = iM2569 ^ 588373138;
                    sArr20 = sArr20;
                    i23 = i23;
                    sArr22 = sArr22;
                    interfaceC12347 = interfaceC12347;
                    onClickListener5 = onClickListener5;
                    sArr24 = sArr24;
                    sArr23 = sArr23;
                    i25 = i25;
                    sArr21 = sArr21;
                    strM3603 = strM3603;
                    sArr19 = sArr19;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    interfaceC12348 = interfaceC123411;
                    c19258 = c192510;
                    c2979 = c29717;
                    c29711 = c29716;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView3;
                    z3 = z9;
                    c8901 = c8909;
                    main = mainM50612;
                    break;
                case -1435171037:
                case -16186492:
                    break;
                case -1385092294:
                case -425496357:
                    textView = textView3;
                    z = z3;
                    i27 = 24895;
                    int iM69811 = (i20 - C2105.m6981("ܿ۟")) * (-19);
                    i22 = iM69811 ^ (-1595895685);
                    i21 = ((iM69811 ^ i19) * 6699) ^ (-1893930102);
                    i23 = i23;
                    sArr22 = sArr22;
                    interfaceC12347 = interfaceC12347;
                    onClickListener5 = onClickListener5;
                    sArr24 = sArr24;
                    sArr23 = sArr23;
                    i25 = i25;
                    sArr21 = sArr21;
                    strM3603 = strM3603;
                    sArr20 = sArr20;
                    sArr19 = sArr19;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    c2979 = c2979;
                    c29711 = c29711;
                    TextView textView17 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView17;
                    C8901 c89010 = c8901;
                    z3 = z;
                    c8901 = c89010;
                    break;
                case -1364591195:
                case -1028024608:
                    textView = textView3;
                    z = z3;
                    i27 = 58685;
                    int iM69812 = (i20 - C2105.m6981("ܿ۟")) * (-19);
                    i22 = iM69812 ^ (-1595895685);
                    i21 = ((iM69812 ^ i19) * 6699) ^ (-1893930102);
                    i23 = i23;
                    sArr22 = sArr22;
                    interfaceC12347 = interfaceC12347;
                    onClickListener5 = onClickListener5;
                    sArr24 = sArr24;
                    sArr23 = sArr23;
                    i25 = i25;
                    sArr21 = sArr21;
                    strM3603 = strM3603;
                    sArr20 = sArr20;
                    sArr19 = sArr19;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    c2979 = c2979;
                    c29711 = c29711;
                    TextView textView18 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView18;
                    C8901 c89011 = c8901;
                    z3 = z;
                    c8901 = c89011;
                    break;
                case -1160665704:
                case 34776811:
                    if (C1047.f3863 >= 0) {
                        sArr8 = sArr24;
                        c29711 = c29711;
                        interfaceC12346 = interfaceC12347;
                        c2979 = c2979;
                        sArr9 = sArr21;
                        i7 = i25;
                        sArr10 = sArr22;
                        sArr11 = sArr23;
                        c19258 = c19258;
                        interfaceC12348 = interfaceC12348;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        onClickListener2 = onClickListener5;
                        TextView textView19 = textView3;
                        textView4 = textView4;
                        spinnerM22974 = spinnerM22974;
                        textView = textView19;
                        boolean z10 = z3;
                        c8901 = c8901;
                        z = z10;
                        iM2566 = (i19 - C2105.m6981("᩻ܽ")) * (-69);
                        i8 = ((iM2566 ^ i20) * 13807) ^ 982656548;
                        i9 = 1360329288;
                        i22 = iM2566 ^ i9;
                        sArr22 = sArr10;
                        onClickListener5 = onClickListener2;
                        sArr23 = sArr11;
                        i25 = i7;
                        sArr21 = sArr9;
                        interfaceC12347 = interfaceC12346;
                        i21 = i8;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        sArr24 = sArr8;
                        interfaceC12348 = interfaceC12348;
                        c19258 = c19258;
                        c2979 = c2979;
                        c29711 = c29711;
                        TextView textView110 = textView;
                        spinnerM22974 = spinnerM22974;
                        textView4 = textView4;
                        textView3 = textView110;
                        C8901 c89012 = c8901;
                        z3 = z;
                        c8901 = c89012;
                    }
                    sArr15 = sArr24;
                    c29711 = c29711;
                    c2979 = c2979;
                    sArr16 = sArr21;
                    i12 = i26;
                    sArr17 = sArr23;
                    c19258 = c19258;
                    interfaceC12348 = interfaceC12348;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    onClickListener4 = onClickListener5;
                    i13 = i25;
                    TextView textView20 = textView3;
                    textView4 = textView4;
                    spinnerM22974 = spinnerM22974;
                    textView = textView20;
                    boolean z11 = z3;
                    c8901 = c8901;
                    z = z11;
                    int iM69813 = (C2105.m6981("ۤۗ") ^ i20) * 37;
                    sArr18 = sArr16;
                    i21 = ((iM69813 ^ i19) * 11457) ^ 1500286696;
                    i22 = iM69813 ^ 1399065897;
                    i25 = i13;
                    i26 = i12;
                    onClickListener5 = onClickListener4;
                    sArr24 = sArr15;
                    sArr23 = sArr17;
                    sArr21 = sArr18;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    c2979 = c2979;
                    c29711 = c29711;
                    TextView textView111 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView111;
                    C8901 c89013 = c8901;
                    z3 = z;
                    c8901 = c89013;
                    break;
                case -1071618427:
                case 1776930204:
                    sArr12 = sArr24;
                    c29711 = c29711;
                    spinnerM22974 = spinnerM22974;
                    c2979 = c2979;
                    short[] sArr27 = sArr23;
                    textView = textView3;
                    c19258 = c19258;
                    interfaceC12348 = interfaceC12348;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    onClickListener3 = onClickListener5;
                    boolean z12 = z3;
                    c8901 = c8901;
                    z = z12;
                    textView2 = (TextView) viewM3507;
                    iM6984 = C2105.m6981(C1711.m5726(f52862, 16, 3, i27));
                    if (C4117.f13076 <= 0) {
                        sArr14 = sArr27;
                        sArr13 = sArr22;
                        int iM25610 = C0630.m2566("֫۟") ^ i19;
                        i14 = ((iM25610 ^ i20) * (-3461)) ^ 384715453;
                        i22 = iM25610 ^ 1421385724;
                        sArr22 = sArr13;
                        onClickListener5 = onClickListener3;
                        sArr24 = sArr12;
                        sArr23 = sArr14;
                    } else {
                        int iM25611 = (C0630.m2566("ᩳۤ") ^ i19) * (-25);
                        i14 = ((iM25611 ^ i20) * (-9163)) ^ 1510321984;
                        i22 = iM25611 ^ 1100180333;
                        sArr23 = sArr27;
                        onClickListener5 = onClickListener3;
                        sArr24 = sArr12;
                    }
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    c2979 = c2979;
                    c29711 = c29711;
                    TextView textView21 = textView2;
                    i15 = iM6984;
                    i21 = i14;
                    textView3 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView21;
                    C8901 c89014 = c8901;
                    z3 = z;
                    c8901 = c89014;
                    break;
                case -1025269553:
                case 1904174082:
                    C3663.m11168();
                    C3019.m9255();
                    sArr3 = sArr24;
                    c29711 = c29711;
                    str = strM3603;
                    c2979 = c2979;
                    sArr = sArr21;
                    i = i25;
                    sArr2 = sArr23;
                    c19258 = c19258;
                    interfaceC12344 = interfaceC12347;
                    interfaceC12348 = interfaceC12348;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    sArr5 = sArr22;
                    onClickListener = onClickListener5;
                    sArr4 = sArr20;
                    TextView textView22 = textView3;
                    textView4 = textView4;
                    spinnerM22974 = spinnerM22974;
                    textView = textView22;
                    boolean z13 = z3;
                    c8901 = c8901;
                    z = z13;
                    iM6982 = (C0630.m2566("֡ᩴ") + i19) * (-115);
                    i5 = ((iM6982 ^ i20) * 22125) ^ 1802710210;
                    i6 = -98028294;
                    i22 = iM6982 ^ i6;
                    sArr20 = sArr4;
                    i21 = i5;
                    sArr22 = sArr5;
                    interfaceC12347 = interfaceC12344;
                    onClickListener5 = onClickListener;
                    sArr24 = sArr3;
                    sArr23 = sArr2;
                    i25 = i;
                    sArr21 = sArr;
                    strM3603 = str;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    c2979 = c2979;
                    c29711 = c29711;
                    TextView textView112 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView112;
                    C8901 c89015 = c8901;
                    z3 = z;
                    c8901 = c89015;
                    break;
                case -964103021:
                case 879032772:
                    sArr12 = sArr24;
                    c29711 = c29711;
                    c2979 = c2979;
                    c19258 = c19258;
                    interfaceC12348 = interfaceC12348;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    onClickListener3 = onClickListener5;
                    TextView textView23 = textView3;
                    textView4 = textView4;
                    spinnerM22974 = spinnerM22974;
                    textView = textView23;
                    boolean z14 = z3;
                    c8901 = c8901;
                    z = z14;
                    sArr14 = sArr23;
                    sArr13 = sArr22;
                    viewM3507 = C1005.m3507(viewM9259, C0630.m2566(C2167.m7159(sArr13, 13, 3, i27)) ^ 2102318859);
                    iM6983 = C2105.m6981("ۙ֫") ^ i20;
                    i10 = ((iM6983 ^ i19) * (-20031)) ^ 1803608693;
                    i11 = 1315939690;
                    i22 = iM6983 ^ i11;
                    i21 = i10;
                    sArr22 = sArr13;
                    onClickListener5 = onClickListener3;
                    sArr24 = sArr12;
                    sArr23 = sArr14;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    c2979 = c2979;
                    c29711 = c29711;
                    TextView textView113 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView113;
                    C8901 c89016 = c8901;
                    z3 = z;
                    c8901 = c89016;
                    break;
                case -922869357:
                case 876698668:
                    short[] sArr28 = sArr24;
                    C2978 c29718 = c2979;
                    C19258 c192511 = c19258;
                    InterfaceC12344 interfaceC123412 = interfaceC12348;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener6 = onCheckedChangeListener2;
                    DialogInterface.OnClickListener onClickListener7 = onClickListener5;
                    TextView textView24 = textView3;
                    textView4 = textView4;
                    spinnerM22974 = spinnerM22974;
                    textView = textView24;
                    boolean z15 = z3;
                    c8901 = c8901;
                    z = z15;
                    C2978 c29719 = (C2978) C1005.m3507(viewM9259, i15 ^ 2122027573);
                    sArr23 = f52862;
                    int iM69814 = C2105.m6981("ܰ᩸") ^ i19;
                    int i30 = ((iM69814 ^ i20) * (-20879)) ^ 55358931;
                    i22 = iM69814 ^ 1803867586;
                    onClickListener5 = onClickListener7;
                    onCheckedChangeListener2 = onCheckedChangeListener6;
                    interfaceC12348 = interfaceC123412;
                    c19258 = c192511;
                    c2979 = c29718;
                    c29711 = c29719;
                    i21 = i30;
                    sArr24 = sArr28;
                    TextView textView114 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView114;
                    C8901 c89017 = c8901;
                    z3 = z;
                    c8901 = c89017;
                    break;
                case -475896238:
                case -409145174:
                    sArr15 = sArr24;
                    c29711 = c29711;
                    textView4 = textView4;
                    spinnerM22974 = spinnerM22974;
                    c2979 = c2979;
                    sArr16 = sArr21;
                    i12 = i26;
                    sArr17 = sArr23;
                    c19258 = c19258;
                    interfaceC12348 = interfaceC12348;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    onClickListener4 = onClickListener5;
                    i13 = i25;
                    boolean z16 = z3;
                    c8901 = c8901;
                    z = z16;
                    textView = (TextView) C11340.m28028(viewM9259, C0630.m2566(C2105.m6988(sArr16, i13, i12, i27)) ^ 2129126013);
                    sArr22 = f52862;
                    if (C1773.f6144 <= 0) {
                        int iM69815 = (C2105.m6981("ۤۗ") ^ i20) * 37;
                        sArr18 = sArr16;
                        i21 = ((iM69815 ^ i19) * 11457) ^ 1500286696;
                        i22 = iM69815 ^ 1399065897;
                        i25 = i13;
                        i26 = i12;
                        onClickListener5 = onClickListener4;
                        sArr24 = sArr15;
                        sArr23 = sArr17;
                    } else {
                        sArr18 = sArr16;
                        int iM69816 = C2105.m6981("᩸ܰ") ^ i20;
                        i22 = iM69816 ^ (-1171728287);
                        i21 = ((iM69816 ^ i19) * (-28105)) ^ (-2007557251);
                        i26 = i12;
                        onClickListener5 = onClickListener4;
                        sArr24 = sArr15;
                        sArr23 = sArr17;
                        i25 = i13;
                    }
                    sArr21 = sArr18;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    c2979 = c2979;
                    c29711 = c29711;
                    TextView textView115 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView115;
                    C8901 c89018 = c8901;
                    z3 = z;
                    c8901 = c89018;
                    break;
                case -447443048:
                case 430336653:
                    textView = textView3;
                    z = z3;
                    i2 = i23;
                    short s2 = s;
                    int i31 = s2 + 2549;
                    if ((i17 + i17) - (i31 * i31) < 0) {
                        iM6981 = (i19 - C2105.m6981("۟ۛ")) * 65;
                        i3 = ((iM6981 ^ i20) * (-11737)) ^ (-1952846729);
                        i4 = -407507524;
                    } else {
                        iM6981 = (i20 - C2105.m6981("ۧ᩸")) * (-67);
                        i3 = ((iM6981 ^ i19) * (-4201)) ^ (-2053052244);
                        i4 = 53641500;
                    }
                    i22 = iM6981 ^ i4;
                    s = s2;
                    i21 = i3;
                    sArr22 = sArr22;
                    interfaceC12347 = interfaceC12347;
                    onClickListener5 = onClickListener5;
                    sArr24 = sArr24;
                    sArr23 = sArr23;
                    i25 = i25;
                    sArr21 = sArr21;
                    strM3603 = strM3603;
                    sArr20 = sArr20;
                    sArr19 = sArr19;
                    i23 = i2;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    c2979 = c2979;
                    c29711 = c29711;
                    TextView textView116 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView116;
                    C8901 c89019 = c8901;
                    z3 = z;
                    c8901 = c89019;
                    break;
                case -341049002:
                case 1975232970:
                    sArr3 = sArr24;
                    c29711 = c29711;
                    str = strM3603;
                    c2979 = c2979;
                    sArr = sArr21;
                    i = i25;
                    sArr2 = sArr23;
                    c19258 = c19258;
                    interfaceC12344 = interfaceC12347;
                    interfaceC12348 = interfaceC12348;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    sArr5 = sArr22;
                    onClickListener = onClickListener5;
                    sArr4 = sArr20;
                    TextView textView25 = textView3;
                    textView4 = textView4;
                    spinnerM22974 = spinnerM22974;
                    textView = textView25;
                    boolean z17 = z3;
                    c8901 = c8901;
                    z = z17;
                    sArr19 = f52862;
                    i23 = 1;
                    i24 = 3;
                    if (C3019.m9255() <= 0) {
                        iM6982 = (C0630.m2566("֡ᩴ") + i19) * (-115);
                        i5 = ((iM6982 ^ i20) * 22125) ^ 1802710210;
                        i6 = -98028294;
                    } else {
                        iM6982 = (C2105.m6981("֨᩸") + i20) * (-15);
                        i5 = ((iM6982 ^ i19) * (-10615)) ^ (-1577058451);
                        i6 = -1556807865;
                    }
                    i22 = iM6982 ^ i6;
                    sArr20 = sArr4;
                    i21 = i5;
                    sArr22 = sArr5;
                    interfaceC12347 = interfaceC12344;
                    onClickListener5 = onClickListener;
                    sArr24 = sArr3;
                    sArr23 = sArr2;
                    i25 = i;
                    sArr21 = sArr;
                    strM3603 = str;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    interfaceC12348 = interfaceC12348;
                    c19258 = c19258;
                    c2979 = c2979;
                    c29711 = c29711;
                    TextView textView117 = textView;
                    spinnerM22974 = spinnerM22974;
                    textView4 = textView4;
                    textView3 = textView117;
                    C8901 c890110 = c8901;
                    z3 = z;
                    c8901 = c890110;
                    break;
                case -168657773:
                case 1051590765:
                    C0422.m1963();
                    if (!C0964.m3413()) {
                        sArr15 = sArr24;
                        c29711 = c29711;
                        c2979 = c2979;
                        sArr16 = sArr21;
                        i12 = i26;
                        sArr17 = sArr23;
                        c19258 = c19258;
                        interfaceC12348 = interfaceC12348;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        onClickListener4 = onClickListener5;
                        i13 = i25;
                        TextView textView26 = textView3;
                        textView4 = textView4;
                        spinnerM22974 = spinnerM22974;
                        textView = textView26;
                        boolean z18 = z3;
                        c8901 = c8901;
                        z = z18;
                        int iM69817 = (C2105.m6981("ۤۗ") ^ i20) * 37;
                        sArr18 = sArr16;
                        i21 = ((iM69817 ^ i19) * 11457) ^ 1500286696;
                        i22 = iM69817 ^ 1399065897;
                        i25 = i13;
                        i26 = i12;
                        onClickListener5 = onClickListener4;
                        sArr24 = sArr15;
                        sArr23 = sArr17;
                        sArr21 = sArr18;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        interfaceC12348 = interfaceC12348;
                        c19258 = c19258;
                        c2979 = c2979;
                        c29711 = c29711;
                        TextView textView118 = textView;
                        spinnerM22974 = spinnerM22974;
                        textView4 = textView4;
                        textView3 = textView118;
                        C8901 c890111 = c8901;
                        z3 = z;
                        c8901 = c890111;
                    } else {
                        sArr24 = sArr24;
                        c29711 = c29711;
                        strM3603 = strM3603;
                        onCheckedChangeListener = onCheckedChangeListener2;
                        sArr6 = sArr19;
                        i23 = i23;
                        sArr21 = sArr21;
                        i25 = i25;
                        sArr23 = sArr23;
                        onClickListener5 = onClickListener5;
                        interfaceC12345 = interfaceC12347;
                        i24 = i24;
                        sArr7 = sArr22;
                        TextView textView27 = textView3;
                        textView4 = textView4;
                        spinnerM22974 = spinnerM22974;
                        textView = textView27;
                        boolean z19 = z3;
                        c8901 = c8901;
                        z = z19;
                        C2978 c29720 = c2979;
                        c19258 = c19258;
                        c2978 = c29720;
                        int iM25612 = (i20 - C0630.m2566("۟ۡ")) * 55;
                        short[] sArr29 = sArr6;
                        i21 = ((iM25612 ^ i19) * (-12133)) ^ (-2028928387);
                        i22 = iM25612 ^ 1841716521;
                        i24 = i24;
                        i23 = i23;
                        sArr22 = sArr7;
                        interfaceC12347 = interfaceC12345;
                        onClickListener5 = onClickListener5;
                        sArr24 = sArr24;
                        sArr23 = sArr23;
                        i25 = i25;
                        sArr21 = sArr21;
                        strM3603 = strM3603;
                        sArr19 = sArr29;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                        c29711 = c29711;
                        TextView textView119 = textView;
                        spinnerM22974 = spinnerM22974;
                        textView4 = textView4;
                        textView3 = textView119;
                        C8901 c89020 = c8901;
                        z3 = z;
                        c8901 = c89020;
                        C19258 c192512 = c19258;
                        c2979 = c2978;
                        c19258 = c192512;
                    }
                    break;
                case -13609997:
                case 1482181271:
                    sArr12 = sArr24;
                    c29711 = c29711;
                    c2979 = c2979;
                    sArr13 = sArr22;
                    sArr14 = sArr23;
                    c19258 = c19258;
                    interfaceC12348 = interfaceC12348;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    onClickListener3 = onClickListener5;
                    TextView textView28 = textView3;
                    textView4 = textView4;
                    spinnerM22974 = spinnerM22974;
                    textView = textView28;
                    boolean z20 = z3;
                    c8901 = c8901;
                    z = z20;
                    sArr21 = f52862;
                    i25 = 10;
                    i26 = 3;
                    if (RunnableC3474.f10992 > 0) {
                        iM6983 = (C2105.m6981("۟۠") + i19) * 63;
                        i10 = ((iM6983 ^ i20) * (-25101)) ^ (-10216821);
                        i11 = -1280074442;
                        i22 = iM6983 ^ i11;
                        i21 = i10;
                        sArr22 = sArr13;
                        onClickListener5 = onClickListener3;
                        sArr24 = sArr12;
                        sArr23 = sArr14;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        interfaceC12348 = interfaceC12348;
                        c19258 = c19258;
                        c2979 = c2979;
                        c29711 = c29711;
                        TextView textView1110 = textView;
                        spinnerM22974 = spinnerM22974;
                        textView4 = textView4;
                        textView3 = textView1110;
                        C8901 c890112 = c8901;
                        z3 = z;
                        c8901 = c890112;
                    } else {
                        iM6984 = i15;
                        textView2 = textView4;
                        int iM25613 = C0630.m2566("֫۟") ^ i19;
                        i14 = ((iM25613 ^ i20) * (-3461)) ^ 384715453;
                        i22 = iM25613 ^ 1421385724;
                        sArr22 = sArr13;
                        onClickListener5 = onClickListener3;
                        sArr24 = sArr12;
                        sArr23 = sArr14;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        interfaceC12348 = interfaceC12348;
                        c19258 = c19258;
                        c2979 = c2979;
                        c29711 = c29711;
                        TextView textView29 = textView2;
                        i15 = iM6984;
                        i21 = i14;
                        textView3 = textView;
                        spinnerM22974 = spinnerM22974;
                        textView4 = textView29;
                        C8901 c890113 = c8901;
                        z3 = z;
                        c8901 = c890113;
                    }
                    break;
                case 174414426:
                case 1676756921:
                    sArr24 = sArr24;
                    c29711 = c29711;
                    textView = textView3;
                    strM3603 = strM3603;
                    c2979 = c2979;
                    sArr6 = sArr19;
                    i23 = i23;
                    sArr21 = sArr21;
                    i25 = i25;
                    sArr23 = sArr23;
                    textView4 = textView4;
                    c19258 = c19258;
                    interfaceC12345 = interfaceC12347;
                    interfaceC12348 = interfaceC12348;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    sArr7 = sArr22;
                    onClickListener5 = onClickListener5;
                    i24 = i24;
                    boolean z21 = z3;
                    c8901 = c8901;
                    z = z21;
                    viewM9259 = C3019.m9259(main, C2105.m6981(C0050.m948(sArr6, i23, i24, i27)) ^ 2125131633);
                    spinnerM22974 = C8901.m22974(main, viewM9259);
                    sArr20 = f52862;
                    if (!C1504.f5354) {
                        sArr19 = sArr6;
                        int iM25614 = C0630.m2566("᩷᩸") ^ i20;
                        i22 = iM25614 ^ 82418245;
                        i21 = ((iM25614 ^ i19) * (-25897)) ^ 127881576;
                        i23 = i23;
                        sArr22 = sArr7;
                        interfaceC12347 = interfaceC12345;
                        onClickListener5 = onClickListener5;
                        sArr24 = sArr24;
                        sArr23 = sArr23;
                        i25 = i25;
                        sArr21 = sArr21;
                        strM3603 = strM3603;
                        i24 = i24;
                        sArr19 = sArr19;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        interfaceC12348 = interfaceC12348;
                        c19258 = c19258;
                        c2979 = c2979;
                        c29711 = c29711;
                        TextView textView1111 = textView;
                        spinnerM22974 = spinnerM22974;
                        textView4 = textView4;
                        textView3 = textView1111;
                        C8901 c890114 = c8901;
                        z3 = z;
                        c8901 = c890114;
                    } else {
                        c2978 = c2979;
                        onCheckedChangeListener = onCheckedChangeListener2;
                        interfaceC12348 = interfaceC12348;
                        int iM25615 = (i20 - C0630.m2566("۟ۡ")) * 55;
                        short[] sArr210 = sArr6;
                        i21 = ((iM25615 ^ i19) * (-12133)) ^ (-2028928387);
                        i22 = iM25615 ^ 1841716521;
                        i24 = i24;
                        i23 = i23;
                        sArr22 = sArr7;
                        interfaceC12347 = interfaceC12345;
                        onClickListener5 = onClickListener5;
                        sArr24 = sArr24;
                        sArr23 = sArr23;
                        i25 = i25;
                        sArr21 = sArr21;
                        strM3603 = strM3603;
                        sArr19 = sArr210;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                        c29711 = c29711;
                        TextView textView1112 = textView;
                        spinnerM22974 = spinnerM22974;
                        textView4 = textView4;
                        textView3 = textView1112;
                        C8901 c89021 = c8901;
                        z3 = z;
                        c8901 = c89021;
                        C19258 c192513 = c19258;
                        c2979 = c2978;
                        c19258 = c192513;
                    }
                    break;
                case 260470739:
                case 1977953512:
                    c29711 = c29711;
                    TextView textView30 = textView4;
                    Spinner spinner3 = spinnerM22974;
                    c19258 = c19258;
                    InterfaceC12344 interfaceC123413 = interfaceC12348;
                    textView = textView3;
                    boolean z22 = z3;
                    c8901 = c8901;
                    z = z22;
                    final C2978 c29721 = (C2978) C11340.m28028(viewM9259, C0630.m2566(strM1483) ^ 2100719826);
                    spinnerM22974 = spinner3;
                    textView4 = textView30;
                    onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.۟ۗܳ
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z23) {
                            textView.setText(!z23 ? R.string.MT_Protector : R.string.MT_Protector);
                            textView4.setVisibility(!z23 ? 0 : 8);
                            c29721.setVisibility(z23 ? 8 : 0);
                            spinnerM22974.setEnabled(!z23);
                            C22870.m50970(ApplicationC20075.f65008, "dfoh", z23);
                        }
                    };
                    if (C7106.f21815 == 0) {
                        int iM25616 = (C0630.m2566("ۙ᩷") + i20) * 101;
                        i21 = ((iM25616 ^ i19) * 5031) ^ 1009088588;
                        i22 = iM25616 ^ (-2016788417);
                        interfaceC12348 = interfaceC123413;
                        c19258 = c19258;
                        c2979 = c29721;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                        c29711 = c29711;
                        TextView textView1113 = textView;
                        spinnerM22974 = spinnerM22974;
                        textView4 = textView4;
                        textView3 = textView1113;
                        C8901 c890115 = c8901;
                        z3 = z;
                        c8901 = c890115;
                    } else {
                        interfaceC12348 = interfaceC123413;
                        c2978 = c29721;
                        interfaceC12345 = interfaceC12347;
                        sArr6 = sArr19;
                        sArr7 = sArr22;
                        int iM25617 = (i20 - C0630.m2566("۟ۡ")) * 55;
                        short[] sArr211 = sArr6;
                        i21 = ((iM25617 ^ i19) * (-12133)) ^ (-2028928387);
                        i22 = iM25617 ^ 1841716521;
                        i24 = i24;
                        i23 = i23;
                        sArr22 = sArr7;
                        interfaceC12347 = interfaceC12345;
                        onClickListener5 = onClickListener5;
                        sArr24 = sArr24;
                        sArr23 = sArr23;
                        i25 = i25;
                        sArr21 = sArr21;
                        strM3603 = strM3603;
                        sArr19 = sArr211;
                        onCheckedChangeListener2 = onCheckedChangeListener;
                        c29711 = c29711;
                        TextView textView1114 = textView;
                        spinnerM22974 = spinnerM22974;
                        textView4 = textView4;
                        textView3 = textView1114;
                        C8901 c89022 = c8901;
                        z3 = z;
                        c8901 = c89022;
                        C19258 c192514 = c19258;
                        c2979 = c2978;
                        c19258 = c192514;
                    }
                    break;
                case 486964426:
                case 1216927689:
                    C2978 c29722 = c29711;
                    TextView textView31 = textView4;
                    Spinner spinner4 = spinnerM22974;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener7 = onCheckedChangeListener2;
                    C2978 c29723 = c2979;
                    textView = textView3;
                    c19258 = c19258;
                    interfaceC12348 = interfaceC12348;
                    boolean z23 = z3;
                    c8901 = c8901;
                    z = z23;
                    iM6985 = C2105.m6981(C22628.m50602(f52862, 31, 3, i27));
                    i16 = 2123761694;
                    if (C22628.f73083 > 0) {
                        int iM69818 = (C2105.m6981("ۢۖ") + i19) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i22 = iM69818 ^ 1525181252;
                        textView3 = textView;
                        interfaceC12348 = interfaceC12348;
                        c19258 = c19258;
                        spinnerM22974 = spinner4;
                        textView4 = textView31;
                        c2979 = c29723;
                        onCheckedChangeListener2 = onCheckedChangeListener7;
                        i21 = ((iM69818 ^ i20) * (-4563)) ^ (-693007576);
                        c29711 = c29722;
                        C8901 c89023 = c8901;
                        z3 = z;
                        c8901 = c89023;
                    } else {
                        onCheckedChangeListener2 = onCheckedChangeListener7;
                        str = strM3603;
                        c2979 = c29723;
                        c29711 = c29722;
                        spinnerM22974 = spinner4;
                        textView4 = textView31;
                        sArr = sArr21;
                        i = i25;
                        sArr2 = sArr23;
                        onClickListener = onClickListener5;
                        sArr3 = sArr24;
                        interfaceC12344 = interfaceC12347;
                        sArr4 = sArr20;
                        sArr5 = sArr22;
                        iM6982 = (C0630.m2566("֡ᩴ") + i19) * (-115);
                        i5 = ((iM6982 ^ i20) * 22125) ^ 1802710210;
                        i6 = -98028294;
                        i22 = iM6982 ^ i6;
                        sArr20 = sArr4;
                        i21 = i5;
                        sArr22 = sArr5;
                        interfaceC12347 = interfaceC12344;
                        onClickListener5 = onClickListener;
                        sArr24 = sArr3;
                        sArr23 = sArr2;
                        i25 = i;
                        sArr21 = sArr;
                        strM3603 = str;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        interfaceC12348 = interfaceC12348;
                        c19258 = c19258;
                        c2979 = c2979;
                        c29711 = c29711;
                        TextView textView1115 = textView;
                        spinnerM22974 = spinnerM22974;
                        textView4 = textView4;
                        textView3 = textView1115;
                        C8901 c890116 = c8901;
                        z3 = z;
                        c8901 = c890116;
                    }
                    break;
                case 1026466569:
                case 2114611372:
                    c29711 = c29711;
                    c2979 = c2979;
                    c19258 = c19258;
                    interfaceC12348 = interfaceC12348;
                    onCheckedChangeListener2 = onCheckedChangeListener2;
                    TextView textView32 = textView3;
                    textView4 = textView4;
                    spinnerM22974 = spinnerM22974;
                    textView = textView32;
                    boolean z24 = z3;
                    c8901 = c8901;
                    z = z24;
                    onClickListener2 = onClickListener5;
                    sArr8 = sArr24;
                    short[] sArr30 = sArr23;
                    strM1483 = C0237.m1483(sArr30, 19, 3, i27);
                    if (C3911.f12484 < 0) {
                        int iM25618 = C0630.m2566("ᩴۧ") ^ i20;
                        i22 = iM25618 ^ (-72807418);
                        i21 = ((iM25618 ^ i19) * 16935) ^ (-29521760);
                        sArr23 = sArr30;
                        onClickListener5 = onClickListener2;
                        sArr24 = sArr8;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        interfaceC12348 = interfaceC12348;
                        c19258 = c19258;
                        c2979 = c2979;
                        c29711 = c29711;
                        TextView textView1116 = textView;
                        spinnerM22974 = spinnerM22974;
                        textView4 = textView4;
                        textView3 = textView1116;
                        C8901 c890117 = c8901;
                        z3 = z;
                        c8901 = c890117;
                    } else {
                        sArr11 = sArr30;
                        interfaceC12346 = interfaceC12347;
                        sArr9 = sArr21;
                        i7 = i25;
                        sArr10 = sArr22;
                        iM2566 = (i19 - C2105.m6981("᩻ܽ")) * (-69);
                        i8 = ((iM2566 ^ i20) * 13807) ^ 982656548;
                        i9 = 1360329288;
                        i22 = iM2566 ^ i9;
                        sArr22 = sArr10;
                        onClickListener5 = onClickListener2;
                        sArr23 = sArr11;
                        i25 = i7;
                        sArr21 = sArr9;
                        interfaceC12347 = interfaceC12346;
                        i21 = i8;
                        onCheckedChangeListener2 = onCheckedChangeListener2;
                        sArr24 = sArr8;
                        interfaceC12348 = interfaceC12348;
                        c19258 = c19258;
                        c2979 = c2979;
                        c29711 = c29711;
                        TextView textView1117 = textView;
                        spinnerM22974 = spinnerM22974;
                        textView4 = textView4;
                        textView3 = textView1117;
                        C8901 c890118 = c8901;
                        z3 = z;
                        c8901 = c890118;
                    }
                    break;
                case 1352322198:
                case 1784100378:
                    ViewOnClickListenerC1958.m6441(c19258, C0630.m2566(C3537.m10748(sArr24, i28, 3, i27)) ^ 2129114384, onClickListener5);
                    C3683.m11213(c19258);
                    break;
                default:
                    C2520.m8029(c19258, iM6985 ^ i16, null);
                    InterfaceC12344 interfaceC123414 = interfaceC12348;
                    boolean z25 = z3;
                    final C8901 c89024 = c8901;
                    c8901 = c8901;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener8 = onCheckedChangeListener2;
                    z = z25;
                    final Spinner spinner5 = spinnerM22974;
                    final C2978 c29724 = c2979;
                    C19258 c192515 = c19258;
                    final Main main2 = main;
                    C2978 c29725 = c29711;
                    Spinner spinner6 = spinnerM22974;
                    TextView textView33 = textView4;
                    TextView textView34 = textView3;
                    final C16560 c16561 = c16560;
                    DialogInterface.OnClickListener onClickListener8 = new DialogInterface.OnClickListener() { // from class: l.ۧ۬ܳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i32) {
                            new C18073(c89024, spinner5, main2, c29711, c29724, c16561).m20274();
                        }
                    };
                    sArr24 = f52862;
                    i28 = 34;
                    int iM69819 = C2105.m6981("ۗۛ") ^ i20;
                    int i32 = ((iM69819 ^ i19) * 28149) ^ 209845070;
                    i22 = iM69819 ^ (-556462993);
                    textView3 = textView34;
                    onClickListener5 = onClickListener8;
                    c29711 = c29725;
                    spinnerM22974 = spinner6;
                    textView4 = textView33;
                    interfaceC12348 = interfaceC123414;
                    c19258 = c192515;
                    c2979 = c29724;
                    onCheckedChangeListener2 = onCheckedChangeListener8;
                    i21 = i32;
                    C8901 c89025 = c8901;
                    z3 = z;
                    c8901 = c89025;
                    break;
            }
            return;
        }
    }
}
