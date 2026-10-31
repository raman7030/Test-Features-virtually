package l;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۗ۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3120 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bitmap f9743;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f9744;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f9745;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = null;
        View view = null;
        int i = 1929086003;
        int i2 = C5695.f17556;
        int i3 = C3019.f9544;
        int iM6981 = C2105.m6981("ܿ۫") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-25127)) ^ (-1063960492);
        int i5 = -1393770675;
        while (true) {
            i = ((((i ^ i2) * 11253) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1904042940:
                case 426120947:
                    if (C5695.m16023() >= 0) {
                        iM6981 = C2105.m6981("ۤ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21023) ^ 48090557;
                        i5 = -1345107849;
                    } else {
                        iM6981 = C2105.m6981("ۜۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14577) ^ (-2022342472);
                        i5 = -1286082704;
                    }
                    break;
                case -1357200625:
                case 1593228544:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C2105.m6981("ۤ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21023) ^ 48090557;
                        i5 = -1345107849;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܿۖ")) * (-5);
                        i4 = ((iM6981 ^ i2) * 11873) ^ 693546466;
                        i5 = 16005344;
                    }
                    break;
                case -1165439556:
                case -447478601:
                    view = this.f9744;
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("ܶ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9301) ^ 2049023962;
                        i5 = -1338059607;
                    } else {
                        iM6981 = (C0630.m2566("ܶۘ") + i3) * (-55);
                        i4 = ((iM6981 ^ i2) * 563) ^ 1123998320;
                        i5 = -969656753;
                    }
                    break;
                case -951909931:
                case 1529408323:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C0630.m2566("ۧۚ") ^ i3) * (-69);
                        i4 = ((iM6981 ^ i2) * (-24727)) ^ 2028989886;
                        i5 = 545328392;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩻ۨ")) * (-69);
                        i4 = ((iM6981 ^ i3) * (-23731)) ^ (-495170626);
                        i5 = 2017277915;
                    }
                    break;
                case -754646887:
                case 416230673:
                    C2105.m6982();
                    break;
                case -707533743:
                case 156069141:
                    if (C1047.f3863 >= 0) {
                        iM6981 = C2105.m6981("ۤ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21023) ^ 48090557;
                        i5 = -1345107849;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩷֡")) * 47;
                        i4 = ((iM6981 ^ i3) * (-16889)) ^ (-647310895);
                        i5 = 1998026569;
                    }
                    break;
                case -554356714:
                case 1095618865:
                    if (C1916.f6442) {
                        iM6981 = (C2105.m6981("۬ۚ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * 1249) ^ 460640042;
                        i5 = 1385235262;
                    } else {
                        iM6981 = C0630.m2566("ܶ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9301) ^ 2049023962;
                        i5 = -1338059607;
                    }
                    break;
                case -494256942:
                case 875423789:
                    viewGroup.removeView(view);
                    this.f9743.recycle();
                    break;
                case 62984804:
                case 1122284636:
                    RunnableC1937.m6387();
                    iM6981 = (C0630.m2566("ۧۚ") ^ i3) * (-69);
                    i4 = ((iM6981 ^ i2) * (-24727)) ^ 2028989886;
                    i5 = 545328392;
                    break;
                case 77957221:
                case 105911507:
                    viewGroup = this.f9745;
                    if (C3537.m10746() <= 0) {
                        iM6981 = C2105.m6981("ܶᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16233) ^ 1110724897;
                        i5 = -915754763;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۠ܰ")) * (-7);
                        i4 = ((iM6981 ^ i3) * (-10579)) ^ 509181848;
                        i5 = 1724917624;
                    }
                    break;
                case 610101596:
                case 1560667132:
                    C4075.m12263();
                    if (C1047.f3863 < 0) {
                        iM6981 = C2105.m6981("ۤ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21023) ^ 48090557;
                        i5 = -1345107849;
                    } else {
                        iM6981 = (C0630.m2566("ۧۚ") ^ i3) * (-69);
                        i4 = ((iM6981 ^ i2) * (-24727)) ^ 2028989886;
                        i5 = 545328392;
                    }
                    break;
                case 983971252:
                case 1869823575:
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = C2105.m6981("ܶᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16233) ^ 1110724897;
                        i5 = -915754763;
                    } else {
                        iM6981 = (C0630.m2566("ۧۚ") ^ i3) * (-69);
                        i4 = ((iM6981 ^ i2) * (-24727)) ^ 2028989886;
                        i5 = 545328392;
                    }
                    break;
                case 1197110541:
                case 1765691669:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C0630.m2566("ܶ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9301) ^ 2049023962;
                        i5 = -1338059607;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܰۖ")) * (-95);
                        i4 = ((iM6981 ^ i2) * 3131) ^ 97603499;
                        i5 = -668047969;
                    }
                    break;
                case 1423628237:
                case 1517332815:
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("ܶᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16233) ^ 1110724897;
                        i5 = -915754763;
                    } else {
                        iM6981 = (C2105.m6981("ۢ۠") ^ i3) * 67;
                        i4 = ((iM6981 ^ i2) * 18971) ^ 1492389209;
                        i5 = 929652793;
                    }
                    break;
                case 1570744157:
                case 1913817496:
                    C1005.m3501();
                    if (C4117.m12364() != 0) {
                        iM6981 = (C0630.m2566("ۧۚ") ^ i3) * (-69);
                        i4 = ((iM6981 ^ i2) * (-24727)) ^ 2028989886;
                        i5 = 545328392;
                    } else {
                        iM6981 = (C2105.m6981("᩺ۧ") + i3) * 123;
                        i4 = ((iM6981 ^ i2) * (-15385)) ^ (-1593552021);
                        i5 = 344770523;
                    }
                    break;
                default:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C2105.m6981("ۤ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21023) ^ 48090557;
                        i5 = -1345107849;
                    } else {
                        iM6981 = (C2105.m6981("۬ᩴ") ^ i2) * 85;
                        i4 = ((iM6981 ^ i3) * (-32101)) ^ (-1332551173);
                        i5 = -1711788604;
                    }
                    break;
            }
            return;
        }
    }

    public C3120(ViewGroup viewGroup, View view, Bitmap bitmap) {
        int i = 1130598176;
        int i2 = C2167.f7158;
        int i3 = C1128.f4106;
        int iM6981 = C2105.m6981("۬ۡ") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-9439)) ^ (-1065539366);
        int i5 = 590479142;
        while (true) {
            i = ((((i ^ i2) * 3613) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2146962687:
                case 1277020936:
                    if (C2272.f7362) {
                        iM6981 = (C2105.m6981("ۧ᩵") + i3) * 15;
                        i4 = ((iM6981 ^ i2) * 12537) ^ 1079515955;
                        i5 = 5512493;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩻ۛ")) * 99;
                        i4 = ((iM6981 ^ i2) * 26139) ^ 44201020;
                        i5 = -1277779453;
                    }
                    break;
                case -1952203981:
                case -1078194641:
                    C2272.m7503();
                    iM6981 = (C2105.m6981("ۧ᩵") + i3) * 15;
                    i4 = ((iM6981 ^ i2) * 12537) ^ 1079515955;
                    i5 = 5512493;
                    break;
                case -1265897533:
                case -784154467:
                    this.f9743 = bitmap;
                    return;
                case -1257753925:
                case 1529684419:
                    if (C7106.f21815 != 0) {
                        iM6981 = (C0630.m2566("ۢۖ") ^ i2) * 49;
                        i4 = ((iM6981 ^ i3) * (-6115)) ^ 2032835598;
                        i5 = 304539713;
                    } else {
                        iM6981 = (C2105.m6981("ۡܽ") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * 14681) ^ 2122244062;
                        i5 = -1279343200;
                    }
                    break;
                case -1091186888:
                case -191353619:
                    if (C1047.m3599() < 0) {
                        iM6981 = C0630.m2566("ۡۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14513)) ^ 664980192;
                        i5 = 350641278;
                    } else {
                        iM6981 = (C0630.m2566("ۢۖ") ^ i2) * 49;
                        i4 = ((iM6981 ^ i3) * (-6115)) ^ 2032835598;
                        i5 = 304539713;
                    }
                    break;
                case -849413030:
                case 1086845916:
                    if (C0422.f1886 <= 0) {
                        iM6981 = C0630.m2566("ۡۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14513)) ^ 664980192;
                        i5 = 350641278;
                    } else {
                        iM6981 = C2105.m6981("ᩳۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 28001) ^ 650205301;
                        i5 = 1403657416;
                    }
                    break;
                case -844100482:
                case 5195814:
                    if (C0422.f1886 > 0) {
                        iM6981 = (C2105.m6981("ۧ᩵") + i3) * 15;
                        i4 = ((iM6981 ^ i2) * 12537) ^ 1079515955;
                        i5 = 5512493;
                    } else {
                        iM6981 = C0630.m2566("ۢ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9441) ^ (-1075978221);
                        i5 = 2073235217;
                    }
                    break;
                case -729537547:
                case 815386941:
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("᩹ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15901) ^ (-954885336);
                        i5 = 768449348;
                    } else {
                        iM6981 = (C2105.m6981("᩺ۖ") + i2) * (-15);
                        i4 = ((iM6981 ^ i3) * 11773) ^ (-1508565301);
                        i5 = -1011173213;
                    }
                    break;
                case -613229732:
                case 1482723875:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C2105.m6981("ۧ᩵") + i3) * 15;
                        i4 = ((iM6981 ^ i2) * 12537) ^ 1079515955;
                        i5 = 5512493;
                    } else {
                        iM6981 = C0630.m2566("᩹᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17051) ^ 746138524;
                        i5 = -1805904865;
                    }
                    break;
                case -99072741:
                case 41169581:
                    if (RunnableC1108.m3790()) {
                        iM6981 = C0630.m2566("᩹ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15901) ^ (-954885336);
                        i5 = 768449348;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۖۜ")) * (-27);
                        i4 = ((iM6981 ^ i3) * (-25653)) ^ (-822392346);
                        i5 = -1484937949;
                    }
                    break;
                case 516121926:
                case 1572369314:
                    if (C21923.f70183 != 0) {
                        iM6981 = C0630.m2566("ۡۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14513)) ^ 664980192;
                        i5 = 350641278;
                    } else {
                        iM6981 = (C2105.m6981("ܽܽ") + i3) * 87;
                        i4 = ((iM6981 ^ i2) * 19857) ^ (-1681191018);
                        i5 = 833191853;
                    }
                    break;
                case 733291931:
                case 1313918906:
                    this.f9745 = viewGroup;
                    this.f9744 = view;
                    if (AbstractC2021.m6574()) {
                        iM6981 = C0630.m2566("᩹ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15901) ^ (-954885336);
                        i5 = 768449348;
                    } else {
                        iM6981 = (C2105.m6981("᩻ۘ") + i2) * (-23);
                        i4 = ((iM6981 ^ i3) * 29061) ^ 665935730;
                        i5 = 688075455;
                    }
                    break;
                case 855122852:
                case 1930941587:
                    C3019.m9255();
                    if (C1773.f6144 > 0) {
                        iM6981 = (C0630.m2566("ۢۖ") ^ i2) * 49;
                        i4 = ((iM6981 ^ i3) * (-6115)) ^ 2032835598;
                        i5 = 304539713;
                    } else {
                        iM6981 = (C2105.m6981("ۧ᩵") + i3) * 15;
                        i4 = ((iM6981 ^ i2) * 12537) ^ 1079515955;
                        i5 = 5512493;
                    }
                    break;
                case 1292490535:
                case 2142822891:
                    if (C0050.f910 >= 0) {
                        iM6981 = (C0630.m2566("ۢۖ") ^ i2) * 49;
                        i4 = ((iM6981 ^ i3) * (-6115)) ^ 2032835598;
                        i5 = 304539713;
                    } else {
                        iM6981 = (C2105.m6981("ᩳ۟") ^ i3) * 7;
                        i4 = ((iM6981 ^ i2) * (-14951)) ^ (-2000151508);
                        i5 = 2071288000;
                    }
                    break;
                case 1892915096:
                case 2141099527:
                    C11340.m28031();
                    throw new RuntimeException();
                default:
                    if (C5695.m16023() >= 0) {
                        iM6981 = C0630.m2566("ۡۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14513)) ^ 664980192;
                        i5 = 350641278;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩷ۚ")) * (-89);
                        i4 = ((iM6981 ^ i2) * 1527) ^ (-1282675316);
                        i5 = 1398306784;
                    }
                    break;
            }
        }
    }
}
