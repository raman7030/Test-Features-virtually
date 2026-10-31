package l;

import android.view.KeyEvent;
import android.view.View;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩴܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L61J */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC18869 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59484;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f59485;

    public /* synthetic */ ViewOnClickListenerC18869(KeyEvent.Callback callback, int i) {
        int i2 = -267714655;
        int i3 = C2167.f7158;
        int i4 = C5695.f17556;
        this.f59484 = i;
        this.f59485 = callback;
        int iM2566 = (C0630.m2566("ܰ᩷") ^ i3) * 35;
        int i5 = ((iM2566 ^ i4) * 24111) ^ 1038629379;
        int i6 = -1721577607;
        while (true) {
            i2 = (iM2566 ^ i6) ^ (i5 & (((i2 ^ i4) * 9079) >> 31));
            switch (i2) {
                case -1684132767:
                case 1202888518:
                    return;
                case -1150544558:
                case -997173520:
                    C0382.m1848();
                    throw new RuntimeException();
                case -770310587:
                case 1395021254:
                    C7106.m19120();
                    C2958.m9034();
                    iM2566 = (C2105.m6981("᩸ᩳ") ^ i3) * 99;
                    i5 = ((iM2566 ^ i4) * (-30707)) ^ (-483130622);
                    i6 = -927330937;
                    break;
                case 387618453:
                case 800113466:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C0630.m2566("᩶ܶ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 8269) ^ 2061819369;
                        i6 = -2044145599;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۜ") ^ i4) * (-53);
                        i5 = ((iM2566 ^ i3) * 31969) ^ 928024020;
                        i6 = 2141739540;
                    }
                    break;
                case 473105650:
                case 642039554:
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        iM2566 = (i3 - C2105.m6981("ۡᩳ")) * 69;
                        i5 = ((iM2566 ^ i4) * (-5911)) ^ 1643636680;
                        i6 = -952795518;
                    } else {
                        iM2566 = (C2105.m6981("᩺ۙ") + i4) * (-89);
                        i5 = ((iM2566 ^ i3) * 12723) ^ 660703590;
                        i6 = 876212585;
                    }
                    break;
                case 826042739:
                case 1602054119:
                    C2520.m8026();
                    if (C1047.f3863 < 0) {
                        iM2566 = (i3 - C2105.m6981("ۡᩳ")) * 69;
                        i5 = ((iM2566 ^ i4) * (-5911)) ^ 1643636680;
                        i6 = -952795518;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۘۙ")) * (-9);
                        i5 = ((iM2566 ^ i3) * (-24481)) ^ 2094683476;
                        i6 = -1255896312;
                    }
                    break;
                default:
                    if (C0237.m1481() < 0) {
                        iM2566 = (i3 - C2105.m6981("ۡᩳ")) * 69;
                        i5 = ((iM2566 ^ i4) * (-5911)) ^ 1643636680;
                        i6 = -952795518;
                    } else {
                        iM2566 = (C2105.m6981("᩸ᩳ") ^ i3) * 99;
                        i5 = ((iM2566 ^ i4) * (-30707)) ^ (-483130622);
                        i6 = -927330937;
                    }
                    break;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM2566;
        int i;
        KeyEvent.Callback callback = null;
        AbstractActivityC3346 abstractActivityC3346 = null;
        int i2 = -786238812;
        int i3 = C7811.f24123;
        int i4 = C2520.f8000;
        int iM6981 = C2105.m6981("۟ۛ") ^ i4;
        int i5 = ((iM6981 ^ i3) * (-21137)) ^ (-1625736697);
        int i6 = 1000863986;
        while (true) {
            int i7 = iM6981 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * (-15439)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2027970305:
                    case -998537552:
                        if (!C2272.f7362) {
                            iM6981 = (C0630.m2566("᩻۬") + i3) * (-99);
                            i5 = ((iM6981 ^ i4) * 13639) ^ (-741746668);
                            i6 = 453530416;
                        } else {
                            iM6981 = (C2105.m6981("ᩳ᩻") + i4) * (-27);
                            i5 = ((iM6981 ^ i3) * 15771) ^ 352513174;
                            i6 = 1993585108;
                        }
                        break;
                    case -2027762711:
                    case -754174364:
                        if (C0050.f910 < 0) {
                            iM6981 = C0630.m2566("ۗ᩷") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-1129)) ^ (-1587912935);
                            i6 = -1488692634;
                        } else {
                            iM6981 = (i3 - C0630.m2566("ۗ۫")) * (-55);
                            i5 = ((iM6981 ^ i4) * (-3923)) ^ 498340320;
                            i6 = 1113755765;
                        }
                        break;
                    case -1801670777:
                    case 1705544741:
                        if (C0964.f3626 == 0) {
                            iM6981 = (i3 - C0630.m2566("ܶܰ")) * (-5);
                            i5 = ((iM6981 ^ i4) * 5267) ^ 1212066812;
                            i6 = 24276182;
                        } else {
                            iM6981 = (i3 - C0630.m2566("ۗ۫")) * (-55);
                            i5 = ((iM6981 ^ i4) * (-3923)) ^ 498340320;
                            i6 = 1113755765;
                        }
                        break;
                    case -1616032149:
                    case -978458426:
                        if (C7811.f24123 < 0) {
                            iM6981 = (C2105.m6981("۠᩷") ^ i4) * (-47);
                            i5 = ((iM6981 ^ i3) * 9105) ^ (-1688940522);
                            i6 = -935322444;
                        } else {
                            iM6981 = C0630.m2566("ۚۚ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 6241) ^ 1297668924;
                            i6 = 921681656;
                        }
                        break;
                    case -1484478067:
                    case 379860338:
                        int i8 = ViewOnClickListenerC7042.f21692;
                        ((ViewOnClickListenerC7042) callback).m19026();
                        break;
                    case -1419306005:
                    case 952261263:
                        int i9 = this.f59484;
                        KeyEvent.Callback callback2 = this.f59485;
                        switch (i9) {
                            case 0:
                                iM2566 = (C0630.m2566("ۘۜ") + i3) * 57;
                                i5 = ((iM2566 ^ i4) * (-20285)) ^ 836330233;
                                i = 2019044381;
                                break;
                            case 1:
                                iM2566 = C0630.m2566("֡ܽ") ^ i4;
                                i5 = ((iM2566 ^ i3) * 11347) ^ 365162759;
                                i = -203841239;
                                break;
                            case 2:
                                iM2566 = (i3 - C2105.m6981("ܳܽ")) * (-77);
                                i5 = ((iM2566 ^ i4) * 19915) ^ (-456576340);
                                i = 1633095970;
                                break;
                            case 3:
                                iM2566 = C2105.m6981("ۘۡ") ^ i4;
                                i5 = ((iM2566 ^ i3) * 9379) ^ (-1556126095);
                                i = 740342480;
                                break;
                            default:
                                iM2566 = C0630.m2566("᩻᩻") ^ i4;
                                i5 = ((iM2566 ^ i3) * 32535) ^ 1998720271;
                                i = -1434280794;
                                break;
                        }
                        i7 = iM2566 ^ i;
                        callback = callback2;
                        break;
                    case -1385151768:
                    case 900448392:
                        ServiceConnectionC3453.m10564();
                        break;
                    case -1341920390:
                    case -432089156:
                        if (C5695.f17556 < 0) {
                            iM6981 = (C0630.m2566("ۤ᩺") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i5 = ((iM6981 ^ i4) * (-30921)) ^ 1042754363;
                            i6 = -139261231;
                        } else {
                            iM6981 = (C0630.m2566("᩻۬") + i3) * (-99);
                            i5 = ((iM6981 ^ i4) * 13639) ^ (-741746668);
                            i6 = 453530416;
                        }
                        break;
                    case -1287703273:
                    case 1534101546:
                        ViewOnClickListenerC7042.m19011(abstractActivityC3346, false);
                        break;
                    case -1179962164:
                    case 45794102:
                        AbstractC2021.m6565(abstractActivityC3346);
                        if (C1916.m6308() < 0) {
                            iM6981 = (i3 - C0630.m2566("ۜᩴ")) * 127;
                            i5 = ((iM6981 ^ i4) * 16045) ^ 1911649116;
                            i6 = 512477563;
                        } else {
                            iM6981 = (i3 - C0630.m2566("ۗ۫")) * (-55);
                            i5 = ((iM6981 ^ i4) * (-3923)) ^ 498340320;
                            i6 = 1113755765;
                        }
                        break;
                    case -775351352:
                    case 556080018:
                        int i10 = C14771.f45094;
                        ((C14771) callback).m35122();
                        break;
                    case -708589736:
                    case 462349989:
                        ((ActivityC0921) callback).m3296(true);
                        break;
                    case -426468178:
                    case 2139494818:
                        abstractActivityC3346 = (AbstractActivityC3346) callback;
                        int i11 = AbstractActivityC3346.f10575;
                        if (C1916.m6308() < 0) {
                            iM6981 = (i4 - C2105.m6981("ᩴۖ")) * 99;
                            i5 = ((iM6981 ^ i3) * 29885) ^ (-32966089);
                            i6 = -37523424;
                        } else {
                            iM6981 = C2105.m6981("᩹ܺ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-6549)) ^ 1524264895;
                            i6 = -1395715828;
                        }
                        break;
                    case -76681696:
                    case 661185209:
                        C0630.m2564();
                        if (RunnableC0588.m2441() >= 0) {
                            iM6981 = C0630.m2566("ۚۚ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 6241) ^ 1297668924;
                            i6 = 921681656;
                            break;
                        }
                        iM6981 = (C2105.m6981("ᩳ᩻") + i4) * (-27);
                        i5 = ((iM6981 ^ i3) * 15771) ^ 352513174;
                        i6 = 1993585108;
                        break;
                    case 344709499:
                    case 2021514433:
                        ((ActivityC8259) callback).m21856();
                        break;
                    case 752909490:
                    case 840597278:
                        if (!C0382.f1805) {
                            iM6981 = C2105.m6981("᩹ܺ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-6549)) ^ 1524264895;
                            i6 = -1395715828;
                            break;
                        }
                        iM6981 = C2105.m6981("ܽܶ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 32221) ^ (-1366847834);
                        i6 = -1633526374;
                        break;
                    case 793935684:
                    case 1342581440:
                        if (C1294.f4556 < 0) {
                            iM6981 = (i4 - C0630.m2566("᩺᩸")) * (-63);
                            i5 = ((iM6981 ^ i3) * (-20573)) ^ (-1128401790);
                            i6 = -691337158;
                        } else {
                            iM6981 = (i3 - C0630.m2566("ۗ۫")) * (-55);
                            i5 = ((iM6981 ^ i4) * (-3923)) ^ 498340320;
                            i6 = 1113755765;
                        }
                        break;
                    case 865479672:
                    case 1192854439:
                        C4159.m12565();
                        iM6981 = (C0630.m2566("᩻۬") + i3) * (-99);
                        i5 = ((iM6981 ^ i4) * 13639) ^ (-741746668);
                        i6 = 453530416;
                        break;
                    case 1045154109:
                    case 1971862444:
                        if (C2167.f7158 < 0) {
                            iM6981 = (i3 - C0630.m2566("ۨۡ")) * 11;
                            i5 = ((iM6981 ^ i4) * (-16187)) ^ 516982946;
                            i6 = -1651727915;
                        } else {
                            iM6981 = C0630.m2566("ۚۚ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 6241) ^ 1297668924;
                            i6 = 921681656;
                        }
                        break;
                    case 1612085574:
                    case 1821473176:
                        if (!C11340.m28031()) {
                            iM6981 = C0630.m2566("ۚۚ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 6241) ^ 1297668924;
                            i6 = 921681656;
                            break;
                        }
                        iM6981 = (C0630.m2566("᩹۠") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM6981 ^ i3) * 19097) ^ (-1783638223);
                        i6 = -942680451;
                        break;
                    default:
                        C2126.m7040();
                        if (C1294.f4556 < 0) {
                            iM6981 = C2105.m6981("᩹ܺ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-6549)) ^ 1524264895;
                            i6 = -1395715828;
                            break;
                        }
                        iM6981 = (C2105.m6981("ᩳ᩻") + i4) * (-27);
                        i5 = ((iM6981 ^ i3) * 15771) ^ 352513174;
                        i6 = 1993585108;
                        break;
                }
                return;
            }
        }
    }
}
