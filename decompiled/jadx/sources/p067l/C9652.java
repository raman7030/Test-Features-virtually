package p067l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.concurrent.atomic.AtomicInteger;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9652 {

    /* JADX INFO: renamed from: ֫ */
    public final ViewOnClickListenerC24404 f26572;

    /* JADX INFO: renamed from: ۧ */
    public final DialogInterfaceC2564 f26573;

    /* JADX INFO: renamed from: ܽ */
    public final int f26574;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ViewOnClickListenerC4308 f26575;

    public C9652(ViewOnClickListenerC4308 viewOnClickListenerC4308, ViewOnClickListenerC24404 viewOnClickListenerC24404, DialogInterfaceC2564 dialogInterfaceC2564) {
        AtomicInteger atomicInteger = null;
        int iM55708 = 0;
        int i = 852775550;
        int i2 = C0906.f81862;
        int i3 = ViewOnClickListenerC0939.f81888;
        int iM55979 = (C0946.m55979("ۜᩴ") + i3) * (-43);
        int i4 = ((iM55979 ^ i2) * (-29675)) ^ (-728796428);
        int i5 = -177591691;
        while (true) {
            i = ((((i ^ i2) * 9351) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2024725064:
                case 1345693389:
                    iM55708 = C0877.m55708(atomicInteger);
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0873.m55680("ۘۘ") + i2) * 109;
                        i4 = ((iM55979 ^ i3) * (-1895)) ^ 109369545;
                        i5 = -1876218029;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۚ֫")) * (-89);
                        i4 = ((iM55979 ^ i3) * (-20093)) ^ 101642931;
                        i5 = 603632979;
                    }
                    break;
                case -1890984941:
                case -188610956:
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0946.m55979("᩷᩵") + i2) * 61;
                        i4 = ((iM55979 ^ i3) * (-21899)) ^ 1938932270;
                        i5 = -853792265;
                    } else {
                        iM55979 = C0873.m55680("ۨۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1883)) ^ (-1966666850);
                        i5 = 147793027;
                    }
                    break;
                case -1559750678:
                case 682716110:
                    this.f26575 = viewOnClickListenerC4308;
                    atomicInteger = viewOnClickListenerC4308.f9599;
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0873.m55680("ܶ֨") ^ i2) * 75;
                        i4 = ((iM55979 ^ i3) * 25199) ^ (-443574021);
                        i5 = 1238911152;
                    } else {
                        iM55979 = (C0946.m55979("ܶܳ") + i3) * (-23);
                        i4 = ((iM55979 ^ i2) * 5651) ^ (-2128780971);
                        i5 = -1573794041;
                    }
                    break;
                case -1480110504:
                case -1446724646:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0873.m55680("ۘۘ") + i2) * 109;
                        i4 = ((iM55979 ^ i3) * (-1895)) ^ 109369545;
                        i5 = -1876218029;
                    } else {
                        iM55979 = C0873.m55680("ۘ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 7747) ^ (-1174005065);
                        i5 = 1974021831;
                    }
                    break;
                case -1397105049:
                case -563148228:
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0873.m55680("ۡ֡") + i3) * (-53);
                        i4 = ((iM55979 ^ i2) * 26373) ^ 814393859;
                        i5 = 775907192;
                    } else {
                        iM55979 = C0946.m55979("ܰ۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27085)) ^ (-1823948888);
                        i5 = -1996547325;
                    }
                    break;
                case -1169238203:
                case 1342932264:
                    if (C1036.f81953 < 0) {
                        iM55979 = (i3 - C0946.m55979("֡ᩳ")) * (-73);
                        i4 = ((iM55979 ^ i2) * 20753) ^ (-628221973);
                        i5 = -277689790;
                    } else {
                        iM55979 = (C0873.m55680("ܶ֨") ^ i2) * 75;
                        i4 = ((iM55979 ^ i3) * 25199) ^ (-443574021);
                        i5 = 1238911152;
                    }
                    break;
                case -1164807516:
                case 105076512:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0873.m55680("ܶ֨") ^ i2) * 75;
                        i4 = ((iM55979 ^ i3) * 25199) ^ (-443574021);
                        i5 = 1238911152;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۙܰ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM55979 ^ i2) * (-5821)) ^ 599182682;
                        i5 = -186195332;
                    }
                    break;
                case -1131396499:
                case 389668892:
                    if (C1003.f81929 > 0) {
                        iM55979 = (C0946.m55979("᩷᩵") + i2) * 61;
                        i4 = ((iM55979 ^ i3) * (-21899)) ^ 1938932270;
                        i5 = -853792265;
                    } else {
                        iM55979 = (C0873.m55680("ۡ֡") + i3) * (-53);
                        i4 = ((iM55979 ^ i2) * 26373) ^ 814393859;
                        i5 = 775907192;
                    }
                    break;
                case -1042671102:
                case -310529263:
                    C1929.m56553();
                    iM55979 = (C0873.m55680("ܶ֨") ^ i2) * 75;
                    i4 = ((iM55979 ^ i3) * 25199) ^ (-443574021);
                    i5 = 1238911152;
                    break;
                case -909498426:
                case 2025921234:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0873.m55680("ۡ֡") + i3) * (-53);
                        i4 = ((iM55979 ^ i2) * 26373) ^ 814393859;
                        i5 = 775907192;
                    } else {
                        iM55979 = (i3 - C0946.m55979("֡ᩳ")) * (-73);
                        i4 = ((iM55979 ^ i2) * 20753) ^ (-628221973);
                        i5 = -277689790;
                    }
                    break;
                case -762950893:
                case 1511591659:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0946.m55979("᩷᩵") + i2) * 61;
                        i4 = ((iM55979 ^ i3) * (-21899)) ^ 1938932270;
                        i5 = -853792265;
                    } else {
                        iM55979 = C0873.m55680("֡ۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 31079) ^ (-885906301);
                        i5 = 1539966271;
                    }
                    break;
                case 96391077:
                case 2128171221:
                    this.f26574 = iM55708;
                    this.f26572 = viewOnClickListenerC24404;
                    this.f26573 = dialogInterfaceC2564;
                    return;
                case 245895395:
                case 1664040772:
                    C1028.m56247();
                    throw new RuntimeException();
                case 562713401:
                case 1171588913:
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0946.m55979("᩷᩵") + i2) * 61;
                        i4 = ((iM55979 ^ i3) * (-21899)) ^ 1938932270;
                        i5 = -853792265;
                    } else {
                        iM55979 = C0873.m55680("᩷ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24547) ^ 656922041;
                        i5 = -1454843320;
                    }
                    break;
                case 670517383:
                case 1636683142:
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0946.m55979("᩷᩵") + i2) * 61;
                        i4 = ((iM55979 ^ i3) * (-21899)) ^ 1938932270;
                        i5 = -853792265;
                    } else {
                        iM55979 = C0946.m55979("ۗᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 23317) ^ (-769743872);
                        i5 = 1618365191;
                    }
                    break;
                default:
                    if (C0906.f81862 >= 0) {
                        iM55979 = (i3 - C0946.m55979("֡ᩳ")) * (-73);
                        i4 = ((iM55979 ^ i2) * 20753) ^ (-628221973);
                        i5 = -277689790;
                    } else {
                        iM55979 = C0873.m55680("᩻ۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-24885)) ^ 532142556;
                        i5 = 68499773;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m22442() {
        int iM55680;
        int i;
        ViewOnClickListenerC24404 viewOnClickListenerC24404 = null;
        ViewOnClickListenerC4308 viewOnClickListenerC4308 = null;
        AtomicInteger atomicInteger = null;
        boolean z = false;
        PackageInfo packageInfo = null;
        ApplicationInfo applicationInfo = null;
        DialogInterfaceC2564 dialogInterfaceC2564 = null;
        int i2 = -108894285;
        int i3 = C1071.f81975;
        int i4 = C1036.f81953;
        int iM55681 = C0873.m55680("ۤ᩵") ^ i3;
        int i5 = ((iM55681 ^ i4) * 17721) ^ 305487971;
        int i6 = 1842548423;
        while (true) {
            int i7 = iM55681 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * (-24779)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2102452001:
                    case 1654725872:
                        applicationInfo = packageInfo.applicationInfo;
                        if (C0898.f81858 > 0) {
                            iM55681 = C0946.m55979("֡ۘ") ^ i4;
                            i5 = ((iM55681 ^ i3) * 28847) ^ 1911354718;
                            i6 = -671939036;
                            break;
                        }
                        iM55681 = (C0873.m55680("ܽۨ") + i4) * (-11);
                        i5 = ((iM55681 ^ i3) * 10221) ^ (-2118013760);
                        i6 = -78894545;
                        break;
                    case -1927368019:
                    case 1381102773:
                        viewOnClickListenerC4308 = this.f26575;
                        if (RunnableC0871.f81839 < 0) {
                            iM55681 = C0873.m55680("ܽۜ") ^ i4;
                            i5 = ((iM55681 ^ i3) * 14757) ^ 24052756;
                            i6 = -1641031588;
                            break;
                        }
                        iM55681 = C0873.m55680("᩻᩹") ^ i3;
                        i5 = ((iM55681 ^ i4) * 24105) ^ (-1668367340);
                        i6 = 1946509428;
                        break;
                    case -1650577344:
                    case -528563389:
                        if (C1194.f82045 == 0) {
                            iM55681 = C0873.m55680("ۛ᩸") ^ i4;
                            i5 = ((iM55681 ^ i3) * 14171) ^ (-1822605792);
                            i6 = 1811774021;
                            break;
                        }
                        iM55681 = (C0873.m55680("ܽۨ") + i4) * (-11);
                        i5 = ((iM55681 ^ i3) * 10221) ^ (-2118013760);
                        i6 = -78894545;
                        break;
                        break;
                    case -1306123587:
                    case 1388179946:
                        if (!C0947.f81895) {
                            iM55681 = (C0873.m55680("ܽۨ") + i4) * (-11);
                            i5 = ((iM55681 ^ i3) * 10221) ^ (-2118013760);
                            i6 = -78894545;
                            break;
                            break;
                        }
                        iM55681 = (C0946.m55979("ܶ۫") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55681 ^ i4) * 24501) ^ (-200566375);
                        i6 = 868961815;
                        break;
                    case -1294771405:
                    case -132984852:
                        RunnableC0897.m55784();
                        C0861.m55626();
                        return false;
                    case -934004446:
                    case -754723991:
                        return false;
                    case -726956079:
                    case 1265115158:
                        viewOnClickListenerC24404 = this.f26572;
                        if (C1028.f81950 > 0) {
                            iM55681 = C0946.m55979("ۗۛ") ^ i3;
                            i5 = ((iM55681 ^ i4) * (-1729)) ^ (-605001588);
                            i6 = -254025324;
                            break;
                        }
                        iM55681 = (C0946.m55979("ܶ۫") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55681 ^ i4) * 24501) ^ (-200566375);
                        i6 = 868961815;
                        break;
                        break;
                    case -698292816:
                    case -514744781:
                        if (C1028.f81950 > 0) {
                            iM55681 = C0946.m55979("۠ܿ") ^ i4;
                            i5 = ((iM55681 ^ i3) * 11493) ^ 954376202;
                            i6 = -1365281568;
                            break;
                        }
                        iM55681 = (C0946.m55979("ܶ۫") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55681 ^ i4) * 24501) ^ (-200566375);
                        i6 = 868961815;
                        break;
                        break;
                    case -388712199:
                    case 2129391819:
                        if (this.f26574 != C0949.m56004(atomicInteger)) {
                            iM55680 = C0946.m55979("ۢۧ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 8025) ^ (-1529662090);
                            i = -1805593225;
                        } else {
                            iM55680 = (C0873.m55680("ۗۘ") + i3) * 115;
                            i5 = ((iM55680 ^ i4) * (-871)) ^ (-1496174689);
                            i = -1959774690;
                        }
                        i7 = iM55680 ^ i;
                        z = true;
                        break;
                    case -302557875:
                    case 1337799684:
                        try {
                            C7050.m16201(viewOnClickListenerC24404.f77266.f18124);
                            iM55681 = C0946.m55979("ۤۡ") ^ i4;
                            i5 = ((iM55681 ^ i3) * (-9305)) ^ (-1486599213);
                            i6 = 783795018;
                        } catch (PackageManager.NameNotFoundException unused) {
                            iM55681 = (i4 - C0873.m55680("ܰۜ")) * 65;
                            i5 = ((iM55681 ^ i3) * 16875) ^ 2082757496;
                            i6 = -1870102933;
                        }
                        break;
                    case -297486672:
                    case 2026641782:
                        atomicInteger = viewOnClickListenerC4308.f9599;
                        if (ServiceConnectionC1013.m56157() > 0) {
                            iM55681 = (C0946.m55979("۫ᩴ") ^ i3) * (-29);
                            i5 = ((iM55681 ^ i4) * 31503) ^ 1537508256;
                            i6 = 1948220834;
                            break;
                        }
                        iM55681 = C0873.m55680("ۛᩳ") ^ i3;
                        i5 = ((iM55681 ^ i4) * (-5323)) ^ 1624192580;
                        i6 = -571761859;
                        break;
                    case -276871473:
                    case -183423569:
                        C1404.m56468();
                        iM55681 = (C0946.m55979("ܶ۫") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55681 ^ i4) * 24501) ^ (-200566375);
                        i6 = 868961815;
                        break;
                        break;
                    case -220348163:
                    case 1230693231:
                        return z;
                    case -78599419:
                    case 66419472:
                        C0946.m55980();
                        if (!C0866.m55645()) {
                            iM55681 = C0873.m55680("᩶ᩴ") ^ i4;
                            i5 = ((iM55681 ^ i3) * 109) ^ 1979265219;
                            i6 = 450426835;
                            break;
                        }
                        iM55681 = (C0873.m55680("ܽۨ") + i4) * (-11);
                        i5 = ((iM55681 ^ i3) * 10221) ^ (-2118013760);
                        i6 = -78894545;
                        break;
                        break;
                    case -63398024:
                    case 1858929716:
                        if (C0946.f81894 != 0) {
                            iM55681 = C0873.m55680("᩻᩹") ^ i3;
                            i5 = ((iM55681 ^ i4) * 24105) ^ (-1668367340);
                            i6 = 1946509428;
                            break;
                            break;
                        }
                        iM55681 = (C0873.m55680("ܽۨ") + i4) * (-11);
                        i5 = ((iM55681 ^ i3) * 10221) ^ (-2118013760);
                        i6 = -78894545;
                        break;
                        break;
                    case -58018443:
                    case 1277967687:
                        viewOnClickListenerC4308.f9598.f13641.m49008(viewOnClickListenerC24404);
                        iM55681 = (i3 - C0946.m55979("۟֨")) * 79;
                        i5 = ((iM55681 ^ i4) * (-21941)) ^ (-4407299);
                        i6 = -1650849838;
                        break;
                    case 14309154:
                    case 1404350265:
                        if (C0992.f81922 < 0) {
                            iM55681 = C0873.m55680("ۛܳ") ^ i3;
                            i5 = ((iM55681 ^ i4) * (-1981)) ^ (-993708198);
                            i6 = 1165510620;
                            break;
                        }
                        iM55681 = (C0873.m55680("ܽۨ") + i4) * (-11);
                        i5 = ((iM55681 ^ i3) * 10221) ^ (-2118013760);
                        i6 = -78894545;
                        break;
                        break;
                    case 25323954:
                    case 1848394955:
                        dialogInterfaceC2564 = this.f26573;
                        if (!C0866.m55648(dialogInterfaceC2564)) {
                            iM55681 = (C0946.m55979("ᩳ᩻") + i4) * 13;
                            i5 = ((iM55681 ^ i3) * (-11381)) ^ 1404209537;
                            i6 = -253163210;
                            break;
                        }
                        iM55681 = (C0946.m55979("ۡ᩷") ^ i4) * 53;
                        i5 = ((iM55681 ^ i3) * (-11407)) ^ 33933712;
                        i6 = -1373736208;
                        break;
                    case 802914931:
                    case 1362122658:
                        viewOnClickListenerC4308.f9605.f13641.m49008(viewOnClickListenerC24404);
                        iM55681 = (i3 - C0946.m55979("۟֨")) * 79;
                        i5 = ((iM55681 ^ i4) * (-21941)) ^ (-4407299);
                        i6 = -1650849838;
                        break;
                        break;
                    case 823170406:
                    case 1589230566:
                        if ((applicationInfo.flags & 129) != 0) {
                            iM55681 = (i3 - C0946.m55979("᩷۬")) * (-43);
                            i5 = ((iM55681 ^ i4) * (-20233)) ^ 1371465324;
                            i6 = 852537408;
                            break;
                        }
                        iM55681 = (C0873.m55680("ܺܶ") + i3) * (-79);
                        i5 = ((iM55681 ^ i4) * 23543) ^ 670377054;
                        i6 = 1519300766;
                        break;
                    case 854829177:
                    case 1673740964:
                        if (C1071.m56343() == 0) {
                            iM55681 = (i3 - C0946.m55979("ܺۢ")) * (-7);
                            i5 = ((iM55681 ^ i4) * (-27909)) ^ (-114939716);
                            i6 = 1836910936;
                            break;
                        }
                        iM55681 = (C0873.m55680("ܽۨ") + i4) * (-11);
                        i5 = ((iM55681 ^ i3) * 10221) ^ (-2118013760);
                        i6 = -78894545;
                        break;
                        break;
                    case 1170098642:
                    case 1216122538:
                        if (!C0861.f81831) {
                            iM55681 = C0873.m55680("᩶ᩴ") ^ i4;
                            i5 = ((iM55681 ^ i3) * 109) ^ 1979265219;
                            i6 = 450426835;
                            break;
                            break;
                        }
                        iM55681 = C0873.m55680("֡ۗ") ^ i4;
                        i5 = ((iM55681 ^ i3) * (-22483)) ^ 663642140;
                        i6 = -1252574086;
                        break;
                    case 1564621889:
                    case 1921199911:
                        return z;
                    case 1664535631:
                    case 1965310160:
                        C1024.m56208(dialogInterfaceC2564);
                        iM55681 = (C0946.m55979("ᩳ᩻") + i4) * 13;
                        i5 = ((iM55681 ^ i3) * (-11381)) ^ 1404209537;
                        i6 = -253163210;
                        break;
                        break;
                    default:
                        packageInfo = viewOnClickListenerC24404.f77266.f18120;
                        if (C1071.f81975 > 0) {
                            iM55681 = C0946.m55979("ۢ۟") ^ i3;
                            i5 = ((iM55681 ^ i4) * (-6985)) ^ 989281783;
                            i6 = -1542184414;
                            break;
                        }
                        iM55681 = (C0946.m55979("ܶ۫") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55681 ^ i4) * 24501) ^ (-200566375);
                        i6 = 868961815;
                        break;
                        break;
                }
            }
        }
    }
}
