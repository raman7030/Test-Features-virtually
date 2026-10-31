package l;

import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.᩻ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23800 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖܽۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f77009 = {7816, -26545, -26500, -26515, -26522, -26521, -26504, -26517, -26578, -26520, -26521, -26526, -26517, -26578, -26515, -26513, -26528, -26583, -26502, -26578, -26516, -26517, -26578, -26527, -26498, -26517, -26528, -26517, -26518, -26578, -26503, -26521, -26502, -26522, -26578, -26513, -26528, -26505, -26578, -26527, -26520, -26578, -26502, -26522, -26517, -26578, -26500, -26517, -26519, -26521, -26499, -26502, -26517, -26500, -26517, -26518, -26578, -26515, -26527, -26518, -26517, -26515, -26499, 5894, 894, 7623};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C10917 f77010;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f77011;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f77012;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77013;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5168 f77014;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f77015;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f77016;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C10917 c10917 = null;
        int i = 1126261205;
        int i2 = C2167.f7158;
        int i3 = C11340.f33930;
        int iM2566 = (i3 - C0630.m2566("ܿ۟")) * 51;
        int i4 = ((iM2566 ^ i2) * (-6727)) ^ 548675061;
        int i5 = -1001591086;
        while (true) {
            i = ((((i ^ i2) * (-8463)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2139399002:
                case -646176239:
                    c10917 = this.f77010;
                    if (C1711.f5919) {
                        iM2566 = (C0630.m2566("۟ᩳ") + i2) * (-127);
                        i4 = ((iM2566 ^ i3) * 12725) ^ 1157396359;
                        i5 = 162023569;
                    } else {
                        iM2566 = C0630.m2566("ۗۖ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 7557) ^ 454804390;
                        i5 = 1505934301;
                    }
                    break;
                case -2137723612:
                case -2130361637:
                    if (C3019.m9255() <= 0) {
                        iM2566 = (C0630.m2566("۟ᩳ") + i2) * (-127);
                        i4 = ((iM2566 ^ i3) * 12725) ^ 1157396359;
                        i5 = 162023569;
                    } else {
                        iM2566 = C0630.m2566("ۙۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1203) ^ (-176683422);
                        i5 = 2045527103;
                    }
                    break;
                case -2073173215:
                case 1320050820:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C2105.m6981("ۤۨ") ^ i3) * (-85);
                        i4 = ((iM2566 ^ i2) * 12647) ^ 1184599953;
                        i5 = 1896899917;
                    } else {
                        iM2566 = (C0630.m2566("۟ۛ") + i3) * (-15);
                        i4 = ((iM2566 ^ i2) * (-1727)) ^ (-721186399);
                        i5 = 1029506641;
                    }
                    break;
                case -1987802670:
                case 607249931:
                    if (C2167.f7158 < 0) {
                        iM2566 = (C2105.m6981("ۤۨ") ^ i3) * (-85);
                        i4 = ((iM2566 ^ i2) * 12647) ^ 1184599953;
                        i5 = 1896899917;
                    } else {
                        iM2566 = (C2105.m6981("᩸֫") + i2) * (-21);
                        i4 = ((iM2566 ^ i3) * 6873) ^ 2130448405;
                        i5 = -472785184;
                    }
                    break;
                case -1952271821:
                case 1874314499:
                    break;
                case -1570989494:
                case -299553733:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C2105.m6981("ۤۨ") ^ i3) * (-85);
                        i4 = ((iM2566 ^ i2) * 12647) ^ 1184599953;
                        i5 = 1896899917;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۙ᩶")) * (-107);
                        i4 = ((iM2566 ^ i2) * 5971) ^ 1442142698;
                        i5 = 1471891164;
                    }
                    break;
                case -1449955963:
                case 573333287:
                    if (C3019.f9544 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ᩴܰ")) * (-15);
                        i4 = ((iM2566 ^ i3) * 17327) ^ 1977770778;
                        i5 = 2128058769;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۡ᩶")) * (-117);
                        i4 = ((iM2566 ^ i2) * (-24225)) ^ (-505807247);
                        i5 = 1918222900;
                    }
                    break;
                case -1406674999:
                case 1704451414:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C0630.m2566("۟ᩳ") + i2) * (-127);
                        i4 = ((iM2566 ^ i3) * 12725) ^ 1157396359;
                        i5 = 162023569;
                    } else {
                        iM2566 = C0630.m2566("۟᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-14193)) ^ 1333058527;
                        i5 = 1635276696;
                    }
                    break;
                case -1403593539:
                case 2071747961:
                    if (c10917.m27225()) {
                        iM2566 = C2105.m6981("۟᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * 19283) ^ 591438900;
                        i5 = 1602779769;
                    } else {
                        iM2566 = C2105.m6981("᩵ۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1549) ^ (-545104217);
                        i5 = 427526771;
                    }
                    break;
                case -1379485662:
                case 125688577:
                    if (C7811.m20844() != 0) {
                        iM2566 = (i2 - C2105.m6981("ᩴܰ")) * (-15);
                        i4 = ((iM2566 ^ i3) * 17327) ^ 1977770778;
                        i5 = 2128058769;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۘۤ")) * (-99);
                        i4 = ((iM2566 ^ i3) * (-5187)) ^ (-1883438925);
                        i5 = 2008113619;
                    }
                    break;
                case -1372594501:
                case -1204931388:
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C2105.m6981("ۤۨ") ^ i3) * (-85);
                        i4 = ((iM2566 ^ i2) * 12647) ^ 1184599953;
                        i5 = 1896899917;
                    } else {
                        iM2566 = C2105.m6981("᩵ۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29203)) ^ 1350055422;
                        i5 = -753304923;
                    }
                    break;
                case -1284020124:
                case -1070711472:
                    if (this.f77016) {
                        iM2566 = C2105.m6981("۟᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * 19283) ^ 591438900;
                        i5 = 1602779769;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۬᩷")) * (-27);
                        i4 = ((iM2566 ^ i2) * (-10421)) ^ (-1007475540);
                        i5 = 1155712881;
                    }
                    break;
                case -931961773:
                case -868130703:
                    C2105.m6982();
                    C3683.m11222();
                    break;
                case -616198236:
                case 150954809:
                    this.f77011.m39007((AbstractC16891) this.f77014);
                    iM2566 = C2105.m6981("۟᩵") ^ i3;
                    i4 = ((iM2566 ^ i2) * 19283) ^ 591438900;
                    i5 = 1602779769;
                    break;
                case -605967702:
                case 92152887:
                    if (C0714.f2697 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ᩴܰ")) * (-15);
                        i4 = ((iM2566 ^ i3) * 17327) ^ 1977770778;
                        i5 = 2128058769;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩹ۘ")) * 101;
                        i4 = ((iM2566 ^ i3) * (-995)) ^ (-1487189535);
                        i5 = 340638822;
                    }
                    break;
                case -438685774:
                case -112727164:
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C0630.m2566("۟ᩳ") + i2) * (-127);
                        i4 = ((iM2566 ^ i3) * 12725) ^ 1157396359;
                        i5 = 162023569;
                    } else {
                        iM2566 = (C2105.m6981("᩸֫") + i2) * (-21);
                        i4 = ((iM2566 ^ i3) * 6873) ^ 2130448405;
                        i5 = -472785184;
                    }
                    break;
                case -55963995:
                case 966668502:
                    C1773.m5908();
                    iM2566 = (C2105.m6981("᩸֫") + i2) * (-21);
                    i4 = ((iM2566 ^ i3) * 6873) ^ 2130448405;
                    i5 = -472785184;
                    break;
                case 91522411:
                case 986307547:
                    C0422.m1963();
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = C0630.m2566("֨ۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-4011)) ^ (-1526745486);
                        i5 = 837861024;
                    } else {
                        iM2566 = (C2105.m6981("᩸֫") + i2) * (-21);
                        i4 = ((iM2566 ^ i3) * 6873) ^ 2130448405;
                        i5 = -472785184;
                    }
                    break;
                default:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("֨ۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-4011)) ^ (-1526745486);
                        i5 = 837861024;
                    } else {
                        iM2566 = C0630.m2566("᩻ۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 12917) ^ 1509201029;
                        i5 = 930126755;
                    }
                    break;
            }
            return;
        }
    }

    public C23800(AbstractC15440 abstractC15440, C16560 c16560, String str) {
        ArrayList arrayList = null;
        int i = -1875299768;
        int i2 = C1128.f4106;
        int i3 = RunnableC0588.f2309;
        this.f77011 = c16560;
        this.f77015 = abstractC15440;
        this.f77012 = str;
        int iM6981 = (C2105.m6981("ۖ۬") + i2) * (-47);
        int i4 = ((iM6981 ^ i3) * (-31997)) ^ (-1086003518);
        int i5 = -1124051073;
        while (true) {
            i = (iM6981 ^ i5) ^ (i4 & (((i ^ i3) * 613) >> 31));
            switch (i) {
                case -1689366142:
                case 1889850974:
                    if (C0714.f2697 >= 0) {
                        iM6981 = (C2105.m6981("᩺ۗ") ^ i3) * (-111);
                        i4 = ((iM6981 ^ i2) * 30575) ^ 667119103;
                        i5 = -753567402;
                    } else {
                        iM6981 = C0630.m2566("ܿۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-13397)) ^ 2113055428;
                        i5 = -718726035;
                    }
                    break;
                case -1570534684:
                case 2032312837:
                    C2126.m7040();
                    C4616.m13552();
                    iM6981 = C0630.m2566("ܿۧ") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-13397)) ^ 2113055428;
                    i5 = -718726035;
                    break;
                case -1315400312:
                case 838698653:
                    if (C0382.f1805) {
                        iM6981 = (C2105.m6981("֫ۜ") + i2) * (-75);
                        i4 = ((iM6981 ^ i3) * (-4853)) ^ (-45619841);
                        i5 = 1802075117;
                    } else {
                        iM6981 = C0630.m2566("ۙܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 23755) ^ (-512643538);
                        i5 = 1982109732;
                    }
                    break;
                case -1297282491:
                case 2123992208:
                    if (C0964.f3626 != 0) {
                        iM6981 = C0630.m2566("ۙܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 23755) ^ (-512643538);
                        i5 = 1982109732;
                    } else {
                        iM6981 = C2105.m6981("۬֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32571) ^ 1744639048;
                        i5 = -976114645;
                    }
                    break;
                case -1039658011:
                case 280483331:
                    if (C0964.f3626 != 0) {
                        iM6981 = C2105.m6981("ۚۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17795)) ^ (-1400850908);
                        i5 = -1815442059;
                    } else {
                        iM6981 = C0630.m2566("ۛۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 23475) ^ 1832853227;
                        i5 = 964254264;
                    }
                    break;
                case -994042313:
                case 1274653171:
                    if (C0630.m2564()) {
                        iM6981 = C2105.m6981("ۚۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17795)) ^ (-1400850908);
                        i5 = -1815442059;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۜ۠")) * (-15);
                        i4 = ((iM6981 ^ i2) * (-13653)) ^ 613126775;
                        i5 = -352372872;
                    }
                    break;
                case -917099095:
                case -361414656:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("ܿۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-13397)) ^ 2113055428;
                        i5 = -718726035;
                    } else {
                        iM6981 = C2105.m6981("ۛ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31371)) ^ 1704796083;
                        i5 = 1725997951;
                    }
                    break;
                case -850036772:
                case 838691804:
                    this.f77013 = arrayList;
                    return;
                case -761646207:
                case 1469092272:
                    arrayList = new ArrayList();
                    if (C0237.f1507 != 0) {
                        iM6981 = C2105.m6981("ۚۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17795)) ^ (-1400850908);
                        i5 = -1815442059;
                    } else {
                        iM6981 = C0630.m2566("ۘܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4161) ^ (-481774791);
                        i5 = 452000479;
                    }
                    break;
                case -575800275:
                case 2115145548:
                    C0422.m1963();
                    throw new RuntimeException();
                case -308024578:
                case 1487222283:
                    if (C21923.f70183 != 0) {
                        iM6981 = C0630.m2566("ۙܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 23755) ^ (-512643538);
                        i5 = 1982109732;
                    } else {
                        iM6981 = C0630.m2566("᩵ܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27351)) ^ (-346621964);
                        i5 = -413054879;
                    }
                    break;
                case -298346748:
                case 268510525:
                    AbstractC2021.m6574();
                    if (C1294.f4556 < 0) {
                        iM6981 = C0630.m2566("ܿۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-13397)) ^ 2113055428;
                        i5 = -718726035;
                    } else {
                        iM6981 = C2105.m6981("ۢ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10159) ^ 254955318;
                        i5 = -522616428;
                    }
                    break;
                case -215747088:
                case -14973194:
                    if (C0630.m2564()) {
                        iM6981 = C2105.m6981("ۚۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17795)) ^ (-1400850908);
                        i5 = -1815442059;
                    } else {
                        iM6981 = C0630.m2566("᩶ۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-1911)) ^ 574903546;
                        i5 = -1201498432;
                    }
                    break;
                case -159914278:
                case 563761757:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("ۚۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17795)) ^ (-1400850908);
                        i5 = -1815442059;
                    } else {
                        iM6981 = C2105.m6981("ۗ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-12661)) ^ (-1639904944);
                        i5 = -450414626;
                    }
                    break;
                case 306653001:
                case 309601868:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("ܿۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-13397)) ^ 2113055428;
                        i5 = -718726035;
                    } else {
                        iM6981 = C2105.m6981("ܿۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-3093)) ^ (-1809540851);
                        i5 = 1564149476;
                    }
                    break;
                default:
                    C3663.m11168();
                    if (C11340.f33930 >= 0) {
                        iM6981 = C2105.m6981("ۚۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17795)) ^ (-1400850908);
                        i5 = -1815442059;
                    } else {
                        iM6981 = (C2105.m6981("᩺ۗ") ^ i3) * (-111);
                        i4 = ((iM6981 ^ i2) * 30575) ^ 667119103;
                        i5 = -753567402;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C16560 c16560 = null;
        Main mainM49336 = null;
        int i = 58636086;
        int i2 = C0422.f1886;
        int i3 = C3432.f10845;
        int iM6981 = C2105.m6981("ᩴۤ") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-9891)) ^ 1721096845;
        int i5 = 1172609137;
        while (true) {
            i = ((((i ^ i3) * (-927)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1746625693:
                case 1930991846:
                    C3537.m10746();
                    if (C3537.f11231 < 0) {
                        iM6981 = (C2105.m6981("۬᩷") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * (-2193)) ^ (-455656965);
                        i5 = -2092805170;
                    } else {
                        iM6981 = C0630.m2566("᩷֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3717) ^ 530069365;
                        i5 = 1698053263;
                    }
                    break;
                case -1600035441:
                case 774861845:
                    if (C1916.m6308() >= 0) {
                        iM6981 = (C2105.m6981("۬᩷") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * (-2193)) ^ (-455656965);
                        i5 = -2092805170;
                    } else {
                        iM6981 = C0630.m2566("ۗۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6007)) ^ 288696082;
                        i5 = -2000792262;
                    }
                    break;
                case -1498522458:
                case 2047356795:
                    if (C3746.f11829 <= 0) {
                        iM6981 = C2105.m6981("ᩳ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2135)) ^ (-1180432275);
                        i5 = -461973783;
                    } else {
                        iM6981 = (C2105.m6981("ۘ᩹") ^ i2) * (-29);
                        i4 = ((iM6981 ^ i3) * (-24817)) ^ (-1598868190);
                        i5 = -1913900689;
                    }
                    break;
                case -1490655656:
                case -150352938:
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("ۨܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 759) ^ 1039418963;
                        i5 = 331012805;
                    } else {
                        iM6981 = (C2105.m6981("۬᩷") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * (-2193)) ^ (-455656965);
                        i5 = -2092805170;
                    }
                    break;
                case -1393685793:
                case -565855484:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C2105.m6981("۬᩷") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * (-2193)) ^ (-455656965);
                        i5 = -2092805170;
                    } else {
                        iM6981 = C2105.m6981("ۘۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27825) ^ (-1049890238);
                        i5 = -1504944026;
                    }
                    break;
                case -1351708891:
                case -1146942686:
                    C4159.m12565();
                    C1711.m5736();
                    iM6981 = C0630.m2566("᩷֡") ^ i3;
                    i4 = ((iM6981 ^ i2) * 3717) ^ 530069365;
                    i5 = 1698053263;
                    break;
                case -1179220124:
                case -56697974:
                    C4117.m12364();
                    if (C0050.f910 < 0) {
                        iM6981 = (C2105.m6981("ۛ᩹") ^ i3) * (-31);
                        i4 = ((iM6981 ^ i2) * 24615) ^ (-989681660);
                        i5 = -2053545867;
                    } else {
                        iM6981 = C0630.m2566("᩷֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3717) ^ 530069365;
                        i5 = 1698053263;
                    }
                    break;
                case -849911135:
                case 1683394904:
                    if (C0714.f2697 >= 0) {
                        iM6981 = C0630.m2566("᩷֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3717) ^ 530069365;
                        i5 = 1698053263;
                    } else {
                        iM6981 = C2105.m6981("۠ܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14847)) ^ (-346729487);
                        i5 = -270379903;
                    }
                    break;
                case -803119699:
                case -496841481:
                    C5695.m16023();
                    C1005.m3501();
                    break;
                case -434587131:
                case 324591693:
                    if (C3019.m9255() <= 0) {
                        iM6981 = C2105.m6981("ᩳ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2135)) ^ (-1180432275);
                        i5 = -461973783;
                    } else {
                        iM6981 = C2105.m6981("ۛᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-31891)) ^ (-1283885719);
                        i5 = -709046439;
                    }
                    break;
                case -254762280:
                case 1561125248:
                    c16560 = this.f77011;
                    if (C3245.m9925() != 0) {
                        iM6981 = C0630.m2566("᩷֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3717) ^ 530069365;
                        i5 = 1698053263;
                    } else {
                        iM6981 = C0630.m2566("ۘ᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14441)) ^ 1571985395;
                        i5 = 1144979991;
                    }
                    break;
                case -248793188:
                case 143429897:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C2105.m6981("ۛ᩹") ^ i3) * (-31);
                        i4 = ((iM6981 ^ i2) * 24615) ^ (-989681660);
                        i5 = -2053545867;
                    } else {
                        iM6981 = C0630.m2566("ۚ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 2133) ^ (-1230181888);
                        i5 = -1274703208;
                    }
                    break;
                case 251865353:
                case 1034605823:
                    mainM49336 = C21923.m49336(c16560);
                    if (RunnableC0588.m2441() >= 0) {
                        iM6981 = (C2105.m6981("ܶ᩵") ^ i3) * 45;
                        i4 = ((iM6981 ^ i2) * (-14375)) ^ 1623443868;
                        i5 = -2128943701;
                    } else {
                        iM6981 = (C0630.m2566("᩵ܶ") + i2) * (-87);
                        i4 = ((iM6981 ^ i3) * (-9897)) ^ (-623815126);
                        i5 = -357923399;
                    }
                    break;
                case 1438284384:
                case 2103221958:
                    if (C2105.m6982() != 0) {
                        iM6981 = C2105.m6981("ᩳ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2135)) ^ (-1180432275);
                        i5 = -461973783;
                    } else {
                        iM6981 = (C2105.m6981("۬᩷") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * (-2193)) ^ (-455656965);
                        i5 = -2092805170;
                    }
                    break;
                default:
                    if (C0422.f1886 > 0) {
                        C9924.m25035(mainM49336, this.f77015, new C14627(this));
                    }
                    iM6981 = (C2105.m6981("ܶ᩵") ^ i3) * 45;
                    i4 = ((iM6981 ^ i2) * (-14375)) ^ 1623443868;
                    i5 = -2128943701;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        boolean z = false;
        Runnable runnable = null;
        int i = -1785069681;
        int i2 = C1128.f4106;
        int i3 = C3432.f10845;
        int iM2566 = C0630.m2566("ܺ᩹") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-10991)) ^ (-382144009);
        int i5 = 327068034;
        while (true) {
            i = ((((i ^ i2) * (-14993)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2087107799:
                case 1289797814:
                    C3432.m10477();
                    break;
                case -1958796632:
                case 678079338:
                    if (C5695.m16023() >= 0) {
                        iM2566 = (i2 - C0630.m2566("᩻۬")) * 11;
                        i4 = ((iM2566 ^ i3) * 28451) ^ 1610419925;
                        i5 = 386655786;
                    } else {
                        iM2566 = (C2105.m6981("ۜܶ") ^ i3) * 39;
                        i4 = ((iM2566 ^ i2) * (-1455)) ^ 1062126409;
                        i5 = -2055369866;
                    }
                    break;
                case -1522468585:
                case 325201832:
                    if (C7811.m20844() != 0) {
                        iM2566 = (i2 - C0630.m2566("᩻۬")) * 11;
                        i4 = ((iM2566 ^ i3) * 28451) ^ 1610419925;
                        i5 = 386655786;
                    } else {
                        iM2566 = (C2105.m6981("ܶۡ") ^ i2) * 35;
                        i4 = ((iM2566 ^ i3) * 5729) ^ (-2078977485);
                        i5 = 872643164;
                    }
                    break;
                case -1503000363:
                case 97297069:
                    z = true;
                    if (C3432.m10477() <= 0) {
                        iM2566 = C2105.m6981("۟ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29187) ^ 1658814068;
                        i5 = -1155233492;
                    } else {
                        iM2566 = (C0630.m2566("֫ۤ") + i2) * (-57);
                        i4 = ((iM2566 ^ i3) * (-16617)) ^ 752482381;
                        i5 = 1030807295;
                    }
                    break;
                case -1495174947:
                case 1250108855:
                    AbstractC2021.m6574();
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = (C0630.m2566("ۚ۬") ^ i3) * 3;
                        i4 = ((iM2566 ^ i2) * 10723) ^ 788340051;
                        i5 = -1479846684;
                    } else {
                        iM2566 = C0630.m2566("ۤۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-28631)) ^ (-1161113179);
                        i5 = 44426605;
                    }
                    break;
                case -1281338055:
                case 1167430906:
                    ServiceConnectionC3453.m10564();
                    if (C1128.f4106 > 0) {
                        iM2566 = (i2 - C0630.m2566("᩻۬")) * 11;
                        i4 = ((iM2566 ^ i3) * 28451) ^ 1610419925;
                        i5 = 386655786;
                    } else {
                        iM2566 = (C0630.m2566("᩷ܿ") + i2) * (-117);
                        i4 = ((iM2566 ^ i3) * 23063) ^ (-2090179625);
                        i5 = 1456401766;
                    }
                    break;
                case -1213111753:
                case 782173424:
                    C2105.m6982();
                    C3245.m9925();
                    iM2566 = (C0630.m2566("᩷ܿ") + i2) * (-117);
                    i4 = ((iM2566 ^ i3) * 23063) ^ (-2090179625);
                    i5 = 1456401766;
                    break;
                case -1191783030:
                case 1444492267:
                    C2167.m7155();
                    if (C4263.f13799 > 0) {
                        iM2566 = C0630.m2566("ۤۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-28631)) ^ (-1161113179);
                        i5 = 44426605;
                    } else {
                        iM2566 = (C0630.m2566("᩷ܿ") + i2) * (-117);
                        i4 = ((iM2566 ^ i3) * 23063) ^ (-2090179625);
                        i5 = 1456401766;
                    }
                    break;
                case -1017021850:
                case 932298789:
                    this.f77010 = this.f77011.m38992(z, runnable);
                    break;
                case -1006160327:
                case 246641591:
                    if (C0422.f1886 <= 0) {
                        iM2566 = (C0630.m2566("ۚ۬") ^ i3) * 3;
                        i4 = ((iM2566 ^ i2) * 10723) ^ 788340051;
                        i5 = -1479846684;
                    } else {
                        iM2566 = (C2105.m6981("۬ܳ") + i2) * (-17);
                        i4 = ((iM2566 ^ i3) * 31965) ^ 792674604;
                        i5 = 1923738256;
                    }
                    break;
                case -514759732:
                case 654394008:
                    if (C0237.m1481() >= 0) {
                        iM2566 = C0630.m2566("ۤۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-28631)) ^ (-1161113179);
                        i5 = 44426605;
                    } else {
                        iM2566 = (C0630.m2566("ᩴ᩺") + i3) * (-121);
                        i4 = ((iM2566 ^ i2) * (-32759)) ^ (-1912275908);
                        i5 = 1020951225;
                    }
                    break;
                case -8571432:
                case 495266577:
                    if (C0237.f1507 != 0) {
                        iM2566 = (C0630.m2566("᩷ܿ") + i2) * (-117);
                        i4 = ((iM2566 ^ i3) * 23063) ^ (-2090179625);
                        i5 = 1456401766;
                    } else {
                        iM2566 = C2105.m6981("ᩳ۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3471) ^ 525350915;
                        i5 = 1852520901;
                    }
                    break;
                case 406503936:
                case 1726743764:
                    if (C22628.f73083 <= 0) {
                        iM2566 = C2105.m6981("۟ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29187) ^ 1658814068;
                        i5 = -1155233492;
                    } else {
                        iM2566 = (C0630.m2566("ܰۗ") + i3) * (-21);
                        i4 = ((iM2566 ^ i2) * (-14429)) ^ (-2129568699);
                        i5 = -1367437907;
                    }
                    break;
                case 506045205:
                case 803163623:
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ۤۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-28631)) ^ (-1161113179);
                        i5 = 44426605;
                    } else {
                        iM2566 = C2105.m6981("֫ۜ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 11547) ^ 154834654;
                        i5 = -1999459536;
                    }
                    break;
                case 1036404361:
                case 1132611260:
                    runnable = null;
                    if (C2520.m8026()) {
                        iM2566 = C2105.m6981("۟ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29187) ^ 1658814068;
                        i5 = -1155233492;
                    } else {
                        iM2566 = C0630.m2566("᩸ۖ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-12797)) ^ (-1702387335);
                        i5 = 1058471091;
                    }
                    break;
                default:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C0630.m2566("ۤۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-28631)) ^ (-1161113179);
                        i5 = 44426605;
                    } else {
                        iM2566 = (C2105.m6981("ۗܶ") ^ i3) * (-83);
                        i4 = ((iM2566 ^ i2) * (-25029)) ^ (-163845121);
                        i5 = 1156123452;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x02b3 A[PHI: r6 r7 r20 r21
      0x02b3: PHI (r6v3 short) = (r6v2 short), (r6v2 short), (r6v4 short) binds: [B:10:0x0063, B:69:0x02b1, B:65:0x028f] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:10:0x0063, B:69:0x02b1, B:65:0x028f] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r20v8 java.lang.String) = (r20v5 java.lang.String), (r20v7 java.lang.String), (r20v9 java.lang.String) binds: [B:10:0x0063, B:69:0x02b1, B:65:0x028f] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r21v5 char) = (r21v3 char), (r21v4 char), (r21v3 char) binds: [B:10:0x0063, B:69:0x02b1, B:65:0x028f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02eb A[PHI: r4 r8 r10 r14 r15 r16 r20
      0x02eb: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:29:0x00d8, B:73:0x02e9, B:61:0x0269, B:53:0x020a] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:29:0x00d8, B:73:0x02e9, B:61:0x0269, B:53:0x020a] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r10v3 short) = (r10v2 short), (r10v2 short), (r10v2 short), (r10v4 short) binds: [B:29:0x00d8, B:73:0x02e9, B:61:0x0269, B:53:0x020a] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:29:0x00d8, B:73:0x02e9, B:61:0x0269, B:53:0x020a] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:29:0x00d8, B:73:0x02e9, B:61:0x0269, B:53:0x020a] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:29:0x00d8, B:73:0x02e9, B:61:0x0269, B:53:0x020a] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r20v12 java.lang.String) = (r20v2 java.lang.String), (r20v6 java.lang.String), (r20v10 java.lang.String), (r20v13 java.lang.String) binds: [B:29:0x00d8, B:73:0x02e9, B:61:0x0269, B:53:0x020a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        C23800 c23800 = this;
        int i5 = C2167.f7158;
        int i6 = C1047.f3863;
        int iM2566 = (C0630.m2566("᩹ۡ") ^ i6) * 91;
        int i7 = ((iM2566 ^ i5) * 2291) ^ 1089170124;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM2566 ^ (-1466609874);
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 66822785;
        char c = 0;
        String strM3005 = null;
        String strM20847 = null;
        while (true) {
            i16 = i8 ^ (i7 & (((i16 ^ i5) * (-25577)) >> 31));
            switch (i16) {
                case -2144879801:
                case 1339981460:
                    C5695.m16023();
                    int iM2567 = C0630.m2566("ۛܶ") ^ i6;
                    i8 = iM2567 ^ 1484218407;
                    i7 = ((iM2567 ^ i5) * (-4691)) ^ 1882456804;
                    c23800 = this;
                    break;
                case -2111278390:
                case 198929587:
                    strM20847 = strM20847;
                    if (c23800.f77010.m27225()) {
                        iM6982 = C0630.m2566("᩹ܿ") ^ i5;
                        i3 = ((iM6982 ^ i6) * (-20725)) ^ 61107759;
                        i4 = -1126396542;
                    } else {
                        iM6982 = C2105.m6981("ۜۨ") ^ i5;
                        i3 = ((iM6982 ^ i6) * (-14207)) ^ (-954433954);
                        i4 = -1095354175;
                    }
                    String str = strM20847;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    strM20847 = str;
                    break;
                case -1813215476:
                case 1795992264:
                    strM20847 = strM20847;
                    sArr = f77009;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6982 = (C0630.m2566("ܳۘ") ^ i6) * (-23);
                        i3 = ((iM6982 ^ i5) * (-5753)) ^ 688447541;
                        i4 = -1548465705;
                    } else {
                        iM6982 = C2105.m6981("֨ܰ") ^ i6;
                        i3 = ((iM6982 ^ i5) * 9113) ^ 240860807;
                        i4 = 444634913;
                    }
                    String str2 = strM20847;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    strM20847 = str2;
                    break;
                case -1748294819:
                case 427013890:
                    strM3005 = C0798.m3005(sArr3, i15, i9, i13);
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C0630.m2566("ܿ۟") ^ i5) * 35;
                        i = ((iM6981 ^ i6) * (-11397)) ^ (-849037846);
                        i2 = 922160373;
                    } else {
                        iM6981 = (C2105.m6981("ܺ֨") ^ i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM6981 ^ i6) * 17939) ^ 178215319;
                        i2 = 1288912660;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1745345344:
                case 1006586024:
                    strM20847 = strM20847;
                    c = 0;
                    if (C0798.f2919) {
                        iM6982 = (i5 - C0630.m2566("᩻۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((iM6982 ^ i6) * 29811) ^ 442007564;
                        i4 = -1420232258;
                    } else {
                        iM6982 = (i6 - C2105.m6981("ۢ᩸")) * 115;
                        i3 = ((iM6982 ^ i5) * (-12477)) ^ (-909091850);
                        i4 = 2069051136;
                    }
                    String str3 = strM20847;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    strM20847 = str3;
                    break;
                case -1612821171:
                case 999747031:
                    if (C3683.m11218(strM20847, C2126.m7036(sArr2, i14, 62, i13))) {
                        iM6982 = (i6 - C2105.m6981("ܽ֡")) * 7;
                        strM20847 = strM20847;
                        i3 = ((iM6982 ^ i5) * (-15633)) ^ (-224752494);
                        i4 = 1645377821;
                    } else {
                        strM20847 = strM20847;
                        iM6982 = (i6 - C2105.m6981("۠ܶ")) * (-71);
                        i3 = ((iM6982 ^ i5) * 11115) ^ 587915983;
                        i4 = -892370283;
                    }
                    String str4 = strM20847;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    strM20847 = str4;
                    break;
                case -1422927438:
                case -148011511:
                    strM20847 = strM20847;
                    s = sArr[c];
                    i10 = s * s;
                    if (C3663.f11553) {
                        iM6982 = (i5 - C0630.m2566("᩻۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((iM6982 ^ i6) * 29811) ^ 442007564;
                        i4 = -1420232258;
                    } else {
                        iM6982 = (C0630.m2566("۫ۛ") + i5) * 55;
                        i3 = ((iM6982 ^ i6) * (-22683)) ^ (-63083562);
                        i4 = -190838078;
                    }
                    String str5 = strM20847;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    strM20847 = str5;
                    break;
                case -1268230022:
                case -608396188:
                    strM20847 = strM20847;
                    int i17 = i10 + i11;
                    i12 = i17 + i17;
                    if (C3432.m10477() <= 0) {
                        iM6982 = (C0630.m2566("᩵᩶") + i6) * (-75);
                        i3 = ((iM6982 ^ i5) * (-29931)) ^ 1082861576;
                        i4 = -1403278383;
                    } else {
                        iM6982 = C2105.m6981("۫ۗ") ^ i6;
                        i3 = ((iM6982 ^ i5) * 22425) ^ 2147359493;
                        i4 = -606003105;
                    }
                    String str6 = strM20847;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    strM20847 = str6;
                    break;
                case -1186417017:
                case -1135369506:
                    sArr3 = f77009;
                    i15 = 63;
                    i9 = 3;
                    if (RunnableC1937.m6387() == 0) {
                        iM6981 = C2105.m6981("ܳۤ") ^ i5;
                        i = ((iM6981 ^ i6) * (-26917)) ^ 1193594165;
                        i2 = 1318930794;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        strM20847 = strM20847;
                        iM6982 = (C0630.m2566("ܳۘ") ^ i6) * (-23);
                        i3 = ((iM6982 ^ i5) * (-5753)) ^ 688447541;
                        i4 = -1548465705;
                        String str7 = strM20847;
                        i8 = iM6982 ^ i4;
                        i7 = i3;
                        strM20847 = str7;
                    }
                    break;
                case -720388363:
                case -702656779:
                    RunnableC3474.m10630();
                    break;
                case -663598522:
                case 207835866:
                    i13 = 38926;
                    iM6982 = (C2105.m6981("ܰ۫") ^ i6) * 5;
                    i3 = ((iM6982 ^ i5) * (-17723)) ^ (-2028515243);
                    i4 = 1098127056;
                    String str8 = strM20847;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    strM20847 = str8;
                    break;
                case -497412395:
                case 1258656990:
                    String str9 = strM20847;
                    if (C7811.f24123 >= 0) {
                        strM20847 = str9;
                        int iM2568 = C0630.m2566("ۛܶ") ^ i6;
                        i8 = iM2568 ^ 1484218407;
                        i7 = ((iM2568 ^ i5) * (-4691)) ^ 1882456804;
                    } else {
                        int iM2569 = C0630.m2566("᩹᩶") ^ i5;
                        i7 = ((iM2569 ^ i6) * (-28217)) ^ 1853339258;
                        strM20847 = str9;
                        i8 = iM2569 ^ 1253655607;
                    }
                    c23800 = this;
                    break;
                case -375924581:
                case -41761720:
                    if (C7811.f24123 < 0) {
                        strM20847 = strM20847;
                        iM6982 = (i5 - C0630.m2566("᩻۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((iM6982 ^ i6) * 29811) ^ 442007564;
                        i4 = -1420232258;
                        String str10 = strM20847;
                        i8 = iM6982 ^ i4;
                        i7 = i3;
                        strM20847 = str10;
                    } else {
                        iM6981 = (C0630.m2566("ܿ۟") ^ i5) * 35;
                        i = ((iM6981 ^ i6) * (-11397)) ^ (-849037846);
                        i2 = 922160373;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case -373219978:
                case 1742761835:
                    strM20847 = C7811.m20847(exc);
                    sArr2 = f77009;
                    if (C1773.f6144 <= 0) {
                        i14 = 1;
                        int iM25610 = C0630.m2566("ۛܶ") ^ i6;
                        i8 = iM25610 ^ 1484218407;
                        i7 = ((iM25610 ^ i5) * (-4691)) ^ 1882456804;
                        c23800 = this;
                    } else {
                        int iM6983 = C2105.m6981("۠᩻") ^ i6;
                        i8 = iM6983 ^ 312911807;
                        i7 = ((iM6983 ^ i5) * MLKEMEngine.KyberQ) ^ 187664974;
                        i14 = 1;
                    }
                    break;
                case -331908953:
                case 175060008:
                    strM20847 = strM20847;
                    int i18 = s + s2;
                    if (i12 - (i18 * i18) < 0) {
                        iM6982 = C0630.m2566("᩵ᩴ") ^ i5;
                        i3 = ((iM6982 ^ i6) * 8167) ^ (-822234359);
                        i4 = -809690964;
                    } else {
                        iM6982 = C0630.m2566("֡ۛ") ^ i6;
                        i3 = ((iM6982 ^ i5) * 14479) ^ (-152486105);
                        i4 = -2128878871;
                    }
                    String str11 = strM20847;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    strM20847 = str11;
                    break;
                case -315468975:
                case 1164419736:
                    strM20847 = strM20847;
                    i11 = 19678096;
                    if (C1294.f4556 >= 0) {
                        iM6982 = (C0630.m2566("ܳۘ") ^ i6) * (-23);
                        i3 = ((iM6982 ^ i5) * (-5753)) ^ 688447541;
                        i4 = -1548465705;
                    } else {
                        iM6982 = (i5 - C2105.m6981("᩻᩻")) * (-51);
                        i3 = ((iM6982 ^ i6) * 28877) ^ (-1725484571);
                        i4 = 1876326634;
                    }
                    String str12 = strM20847;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    strM20847 = str12;
                    break;
                case 164666296:
                case 1889861356:
                    C1504.m5167(C0630.m2566(strM3005) ^ 2101232240);
                    break;
                case 266097551:
                case 545639107:
                    if (!C0382.m1848()) {
                        iM6981 = (C0630.m2566("ܿ۟") ^ i5) * 35;
                        i = ((iM6981 ^ i6) * (-11397)) ^ (-849037846);
                        i2 = 922160373;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        int iM25611 = C0630.m2566("ۛܶ") ^ i6;
                        i8 = iM25611 ^ 1484218407;
                        i7 = ((iM25611 ^ i5) * (-4691)) ^ 1882456804;
                        c23800 = this;
                    }
                    break;
                case 322438247:
                case 596112251:
                    C4159.m12565();
                    if (C1047.m3599() >= 0) {
                        strM20847 = strM20847;
                        iM6982 = (C0630.m2566("᩵᩶") + i6) * (-75);
                        i3 = ((iM6982 ^ i5) * (-29931)) ^ 1082861576;
                        i4 = -1403278383;
                        String str13 = strM20847;
                        i8 = iM6982 ^ i4;
                        i7 = i3;
                        strM20847 = str13;
                    } else {
                        int iM25612 = C0630.m2566("ۛܶ") ^ i6;
                        i8 = iM25612 ^ 1484218407;
                        i7 = ((iM25612 ^ i5) * (-4691)) ^ 1882456804;
                        c23800 = this;
                    }
                    break;
                case 384358933:
                case 1486099884:
                    i13 = 63833;
                    iM6982 = (C2105.m6981("ܰ۫") ^ i6) * 5;
                    i3 = ((iM6982 ^ i5) * (-17723)) ^ (-2028515243);
                    i4 = 1098127056;
                    String str14 = strM20847;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    strM20847 = str14;
                    break;
                case 660265396:
                case 1452931194:
                    strM20847 = strM20847;
                    s2 = 4436;
                    if (RunnableC1108.f4040) {
                        iM6982 = C0630.m2566("۬ۡ") ^ i5;
                        i3 = ((iM6982 ^ i6) * 11545) ^ (-1156831451);
                        i4 = 895560180;
                    } else {
                        iM6982 = (C0630.m2566("ܳۘ") ^ i6) * (-23);
                        i3 = ((iM6982 ^ i5) * (-5753)) ^ 688447541;
                        i4 = -1548465705;
                    }
                    String str15 = strM20847;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    strM20847 = str15;
                    break;
                case 1312972846:
                case 1703492162:
                    break;
                default:
                    C4075.m12246(C22628.m50612(c23800.f77011), exc, null);
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f77010.m27224();
    }
}
