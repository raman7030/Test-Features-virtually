package p067l;

import android.content.DialogInterface;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۧۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1R6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC12623 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f35426;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractActivityC5549 f35427;

    public /* synthetic */ DialogInterfaceOnDismissListenerC12623(AbstractActivityC5549 abstractActivityC5549, int i) {
        int i2 = -127101628;
        int i3 = C0845.f81821;
        int i4 = C0894.f81854;
        this.f35426 = i;
        this.f35427 = abstractActivityC5549;
        int iM55979 = (C0946.m55979("۫ᩳ") + i4) * 109;
        int i5 = ((iM55979 ^ i3) * (-20979)) ^ 1424224558;
        int i6 = -1901197148;
        while (true) {
            i2 = (iM55979 ^ i6) ^ (i5 & (((i2 ^ i3) * 16451) >> 31));
            switch (i2) {
                case -1657381053:
                case 1771518766:
                    C1003.m56123();
                    C1124.m56367();
                    throw new RuntimeException();
                case -1305548583:
                case 1881118281:
                    if (C1003.f81929 <= 0) {
                        iM55979 = (i4 - C0946.m55979("ۘ᩷")) * 79;
                        i5 = ((iM55979 ^ i3) * (-1817)) ^ 710041893;
                        i6 = 1360995696;
                    } else {
                        iM55979 = (C0873.m55680("ܿ۬") ^ i3) * 55;
                        i5 = ((iM55979 ^ i4) * 543) ^ (-1708062887);
                        i6 = 42557692;
                    }
                    break;
                case -1080739592:
                case 351473727:
                    C1003.m56123();
                    C0882.m55710();
                    iM55979 = C0946.m55979("ܶ۟") ^ i4;
                    i5 = ((iM55979 ^ i3) * (-20255)) ^ 1074031494;
                    i6 = -454043602;
                    break;
                case -847090857:
                case 865196716:
                    if (C1044.f81959 < 0) {
                        iM55979 = (i4 - C0946.m55979("۠۠")) * (-71);
                        i5 = ((iM55979 ^ i3) * (-3725)) ^ (-872712039);
                        i6 = -687828002;
                    } else {
                        iM55979 = C0946.m55979("ܶ۟") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-20255)) ^ 1074031494;
                        i6 = -454043602;
                    }
                    break;
                case -594108402:
                case 831336953:
                    C1404.m56468();
                    if (C1071.f81975 > 0) {
                        iM55979 = C0946.m55979("ۚۜ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-12827)) ^ 1398805787;
                        i6 = -818668379;
                    } else {
                        iM55979 = (i4 - C0946.m55979("۠۠")) * (-71);
                        i5 = ((iM55979 ^ i3) * (-3725)) ^ (-872712039);
                        i6 = -687828002;
                    }
                    break;
                case -301524142:
                case 1159823478:
                    return;
                default:
                    C0967.m56074();
                    if (C0892.f81851) {
                        iM55979 = C0946.m55979("ۧܽ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-23477)) ^ 1144921387;
                        i6 = 540237939;
                    } else {
                        iM55979 = C0946.m55979("ۚۜ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-12827)) ^ 1398805787;
                        i6 = -818668379;
                    }
                    break;
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 1328800123;
        int i2 = C1036.f81953;
        int i3 = C1003.f81929;
        int iM55680 = C0873.m55680("ۙۖ") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-29703)) ^ 1718038473;
        int i5 = 1786619097;
        while (true) {
            i = ((((i ^ i3) * 23889) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1936400505:
                case -1283862225:
                    C0930.m55885();
                    ViewOnClickListenerC0939.m55941();
                    iM55680 = C0946.m55979("ۧ֡") ^ i2;
                    i4 = ((iM55680 ^ i3) * 17571) ^ (-730053622);
                    i5 = 545831842;
                    break;
                case -1935779375:
                case 1714195576:
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0946.m55979("᩶᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27145)) ^ (-1912489631);
                        i5 = -545729882;
                    } else {
                        iM55680 = C0946.m55979("ܳ۫") ^ i3;
                        i4 = ((iM55680 ^ i2) * 25031) ^ 776336372;
                        i5 = 1147103754;
                    }
                    break;
                case -1812184304:
                case -1451650105:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("۬֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * 17601) ^ 1384012529;
                        i5 = -2147328027;
                    } else {
                        iM55680 = (C0946.m55979("ܰ֫") + i2) * (-83);
                        i4 = ((iM55680 ^ i3) * 26505) ^ 1720838846;
                        i5 = 199118123;
                    }
                    break;
                case -1805614541:
                case 956338095:
                    if (C1048.f81963) {
                        iM55680 = C0946.m55979("᩵֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1187) ^ 1460450711;
                        i5 = -2067918983;
                    } else {
                        iM55680 = C0946.m55979("ۧ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 17571) ^ (-730053622);
                        i5 = 545831842;
                    }
                    break;
                case -1759865585:
                case 1929011042:
                    switch (this.f35426) {
                        case 0:
                            iM55680 = C0946.m55979("ۗۧ") ^ i3;
                            i4 = ((iM55680 ^ i2) * (-23673)) ^ (-867677183);
                            i5 = -4797435;
                            break;
                        default:
                            iM55680 = C0873.m55680("ܳ᩵") ^ i2;
                            i4 = ((iM55680 ^ i3) * 26125) ^ 1711701999;
                            i5 = -1477113016;
                            break;
                    }
                    break;
                case -1568941134:
                case -1146594687:
                    C0854.m55595();
                    if (!C0861.f81831) {
                        iM55680 = C0873.m55680("۠ܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 10767) ^ 576643938;
                        i5 = -1984275776;
                    } else {
                        iM55680 = C0946.m55979("ۧ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 17571) ^ (-730053622);
                        i5 = 545831842;
                    }
                    break;
                case -1497076025:
                case 1669306033:
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("۬֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * 17601) ^ 1384012529;
                        i5 = -2147328027;
                    } else {
                        iM55680 = (C0873.m55680("᩸ܰ") + i2) * (-55);
                        i4 = ((iM55680 ^ i3) * 12301) ^ (-1939209836);
                        i5 = 377136023;
                    }
                    break;
                case -1427412157:
                case 1092015359:
                    C0955.m56027(this.f35427);
                    break;
                case -1413226754:
                case 1782035225:
                    C0861.m55626();
                    if (C1024.m56209() >= 0) {
                        iM55680 = C0946.m55979("᩶᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27145)) ^ (-1912489631);
                        i5 = -545729882;
                    } else {
                        iM55680 = C0946.m55979("ۧ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 17571) ^ (-730053622);
                        i5 = 545831842;
                    }
                    break;
                case -1237418947:
                case 802086523:
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("᩶᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27145)) ^ (-1912489631);
                        i5 = -545729882;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ۫") + i3) * 23;
                        i4 = ((iM55680 ^ i2) * 3543) ^ (-2024965706);
                        i5 = 471098339;
                    }
                    break;
                case -966048211:
                case 1352662066:
                    C1024.m56209();
                    C0894.m55769();
                    break;
                case 86333731:
                case 109389686:
                    if (C1053.m56327() >= 0) {
                        iM55680 = (C0946.m55979("ۨܺ") ^ i3) * (-19);
                        i4 = ((iM55680 ^ i2) * (-19431)) ^ 1226385639;
                        i5 = -59784395;
                    } else {
                        iM55680 = (C0946.m55979("ܳܳ") + i2) * (-91);
                        i4 = ((iM55680 ^ i3) * (-18105)) ^ 1915346177;
                        i5 = -1992906706;
                    }
                    break;
                case 535304863:
                case 966310518:
                    if (!C0912.m55833()) {
                        iM55680 = C0946.m55979("ۧ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 17571) ^ (-730053622);
                        i5 = 545831842;
                    } else {
                        iM55680 = (C0946.m55979("ۨܺ") ^ i3) * (-19);
                        i4 = ((iM55680 ^ i2) * (-19431)) ^ 1226385639;
                        i5 = -59784395;
                    }
                    break;
                case 793518323:
                case 1750219130:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("۠ܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 10767) ^ 576643938;
                        i5 = -1984275776;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۖܶ")) * 75;
                        i4 = ((iM55680 ^ i2) * (-6833)) ^ 1480811476;
                        i5 = -1968113912;
                    }
                    break;
                case 797547533:
                case 1713820794:
                    if (C0937.f81884) {
                        iM55680 = (i2 - C0873.m55680("ۧܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * 3201) ^ (-1643312021);
                        i5 = -901286791;
                    } else {
                        iM55680 = C0946.m55979("۬֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * 17601) ^ 1384012529;
                        i5 = -2147328027;
                    }
                    break;
                case 943244377:
                case 1080283212:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0946.m55979("ۧ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 17571) ^ (-730053622);
                        i5 = 545831842;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩷֨")) * 25;
                        i4 = ((iM55680 ^ i2) * 12093) ^ (-560721186);
                        i5 = -907512756;
                    }
                    break;
                case 1708735047:
                case 1849382913:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0873.m55680("۠ܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 10767) ^ 576643938;
                        i5 = -1984275776;
                    } else {
                        iM55680 = (C0873.m55680("᩺ᩴ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55680 ^ i3) * (-28387)) ^ 661150384;
                        i5 = 1569656077;
                    }
                    break;
                default:
                    ViewOnClickListenerC7928.m18306((ViewOnClickListenerC7928) this.f35427);
                    break;
            }
            return;
        }
    }
}
