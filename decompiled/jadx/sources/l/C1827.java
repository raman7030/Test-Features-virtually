package l;

import android.view.View;
import android.widget.CompoundButton;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1827 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩳ᩸ۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f6260 = {1485, -2884, -2899, -2890, -2942, -2898, -2892, -2886, -2893, -2884, -2903, -2904, -2897, -2888, -2942, -2892, -2893, -2885, -2894, -2942, -2884, -2887, -2887, -2942, -2882, -2894, -2895, -2894, -2893};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6261;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6262;

    public /* synthetic */ C1827(int i, Object obj) {
        int i2 = -1386315014;
        int i3 = C2167.f7158;
        int i4 = C3019.f9544;
        this.f6261 = i;
        this.f6262 = obj;
        int iM6981 = C2105.m6981("ۤܿ") ^ i3;
        int i5 = ((iM6981 ^ i4) * (-29175)) ^ 1879777836;
        int i6 = -783182606;
        while (true) {
            i2 = (iM6981 ^ i6) ^ (i5 & (((i2 ^ i4) * (-31007)) >> 31));
            switch (i2) {
                case -1505042613:
                case 1181898261:
                    C2126.m7040();
                    iM6981 = (i4 - C2105.m6981("ۘۗ")) * 15;
                    i5 = ((iM6981 ^ i3) * 27251) ^ 1411676920;
                    i6 = -665668746;
                    break;
                case -400592723:
                case 762489315:
                    C2958.m9034();
                    if (C4263.f13799 > 0) {
                        iM6981 = (C0630.m2566("ᩳۜ") + i4) * 93;
                        i5 = ((iM6981 ^ i3) * (-12561)) ^ (-1933887005);
                        i6 = 313073952;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۘۗ")) * 15;
                        i5 = ((iM6981 ^ i3) * 27251) ^ 1411676920;
                        i6 = -665668746;
                    }
                    break;
                case 100806998:
                case 134726671:
                    if (C3663.f11553) {
                        iM6981 = (i4 - C0630.m2566("֫ۜ")) * 71;
                        i5 = ((iM6981 ^ i3) * 979) ^ (-1703596069);
                        i6 = 986258863;
                    } else {
                        iM6981 = (C0630.m2566("ۜۢ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM6981 ^ i4) * 29917) ^ (-1118962643);
                        i6 = -1332649439;
                    }
                    break;
                case 661497600:
                case 2134727916:
                    if (RunnableC0588.f2309 < 0) {
                        iM6981 = (i4 - C2105.m6981("ۘۗ")) * 15;
                        i5 = ((iM6981 ^ i3) * 27251) ^ 1411676920;
                        i6 = -665668746;
                    } else {
                        iM6981 = (C2105.m6981("᩸᩺") + i3) * (-69);
                        i5 = ((iM6981 ^ i4) * (-22287)) ^ (-2032719354);
                        i6 = 1203062747;
                    }
                    break;
                case 876147561:
                case 1992547850:
                    RunnableC3474.m10630();
                    throw new RuntimeException();
                case 1736965569:
                case 2093435452:
                    return;
                default:
                    C1005.m3501();
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C0630.m2566("ᩳۜ") + i4) * 93;
                        i5 = ((iM6981 ^ i3) * (-12561)) ^ (-1933887005);
                        i6 = 313073952;
                    } else {
                        iM6981 = C2105.m6981("֫ۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-12155)) ^ 1264551633;
                        i6 = -29647447;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x013c A[PHI: r5
      0x013c: PHI (r5v6 l.۬ۤۡ) = (r5v3 l.۬ۤۡ), (r5v2 l.۬ۤۡ), (r5v2 l.۬ۤۡ), (r5v2 l.۬ۤۡ) binds: [B:41:0x013a, B:18:0x0082, B:16:0x007e, B:110:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0206 A[PHI: r14
      0x0206: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:57:0x0204, B:16:0x007e, B:111:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        short[] sArr;
        C1827 c1827 = this;
        int i4 = 1933628512;
        int i5 = C4263.f13799;
        int i6 = C1294.f4556;
        int iM6982 = C2105.m6981("᩺᩹") ^ i6;
        int i7 = ((iM6982 ^ i5) * 1333) ^ 1837996247;
        int i8 = iM6982 ^ 933524887;
        View view = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short s = 0;
        short s2 = 0;
        InterfaceC13049 interfaceC13049M13549 = null;
        InterfaceC13049 interfaceC13049M4377 = null;
        InterfaceC12344 interfaceC12344 = null;
        RunnableC13135 runnableC13135 = null;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i5) * (-22985)) >> 31));
            switch (i4) {
                case -1997795232:
                case 1456409221:
                    if (C0382.f1805) {
                        iM2566 = (C2105.m6981("ۗܳ") ^ i5) * (-47);
                        i7 = ((iM2566 ^ i6) * 1671) ^ 1730282530;
                        i3 = -1537181725;
                    } else {
                        iM2566 = C2105.m6981("ᩴ۬") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-16397)) ^ (-793443724);
                        i3 = -1639254189;
                    }
                    i8 = iM2566 ^ i3;
                    c1827 = this;
                    break;
                case -1950367366:
                case -1548137582:
                    interfaceC13049M13549 = C4616.m13549(interfaceC13049M4377, C3537.m10748(sArr3, i10, 28, i14), z);
                    if (C3683.f11629 < 0) {
                        iM6981 = (i6 - C2105.m6981("ܿۡ")) * (-43);
                        i = ((iM6981 ^ i5) * 19781) ^ (-13946336);
                        i2 = -599476992;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        iM2566 = C2105.m6981("۬᩺") ^ i5;
                        i7 = ((iM2566 ^ i6) * 31557) ^ 1292315867;
                        i3 = -2110555145;
                        i8 = iM2566 ^ i3;
                        c1827 = this;
                    }
                    break;
                case -1781962869:
                case -1234197551:
                    if (C3245.f10203 > 0) {
                        iM6981 = C0630.m2566("ۨܽ") ^ i6;
                        i = ((iM6981 ^ i5) * 5073) ^ 81494205;
                        i2 = 330948523;
                    } else {
                        iM6981 = (C2105.m6981("۠۠") + i5) * (-33);
                        i = ((iM6981 ^ i6) * (-22251)) ^ (-209898270);
                        i2 = 809116700;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1759425876:
                case -571461354:
                    i14 = 62685;
                    iM6981 = (C2105.m6981("۟ۗ") + i6) * (-53);
                    i = ((iM6981 ^ i5) * 15969) ^ 1514952494;
                    i2 = -651294185;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1733325693:
                case 354245688:
                    if (C0964.m3413()) {
                        iM2566 = (C0630.m2566("ۡۤ") ^ i6) * 41;
                        i7 = ((iM2566 ^ i5) * (-7433)) ^ (-1982029755);
                        i3 = -2135626968;
                    } else {
                        iM2566 = C2105.m6981("۬᩺") ^ i5;
                        i7 = ((iM2566 ^ i6) * 31557) ^ 1292315867;
                        i3 = -2110555145;
                    }
                    i8 = iM2566 ^ i3;
                    c1827 = this;
                    break;
                case -1578354324:
                case -963642953:
                    sArr = f6260;
                    if (C2520.f8000 < 0) {
                        int iM6983 = C2105.m6981("᩸۟") ^ i6;
                        i = ((iM6983 ^ i5) * (-2243)) ^ 971833592;
                        i8 = iM6983 ^ (-733794891);
                        c1827 = this;
                        sArr2 = sArr;
                        i7 = i;
                    } else {
                        int iM2567 = (C0630.m2566("ۚ֫") ^ i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = iM2567 ^ (-1416044803);
                        sArr2 = sArr;
                        i7 = ((iM2567 ^ i5) * 5719) ^ 403817002;
                        c1827 = this;
                    }
                    break;
                case -1521149484:
                case -282262648:
                    view = (View) c1827.f6262;
                    if (z) {
                        iM6981 = (C2105.m6981("ۚ۠") + i6) * 69;
                        i = ((iM6981 ^ i5) * (-1963)) ^ 1143960152;
                        i2 = 193061312;
                    } else {
                        iM6981 = C0630.m2566("ܽ֫") ^ i5;
                        i = ((iM6981 ^ i6) * 25381) ^ (-952587070);
                        i2 = 649337112;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1461928354:
                case -1129204523:
                    RunnableC1108.m3790();
                    break;
                case -1379989547:
                case 2068357369:
                    s = sArr2[0];
                    s2 = 9090;
                    if (!C3663.f11553) {
                        iM6981 = (i5 - C2105.m6981("֡۫")) * 67;
                        i = ((iM6981 ^ i6) * 9859) ^ 2005659267;
                        i2 = -1807182744;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        iM2566 = C2105.m6981("ᩴ۬") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-16397)) ^ (-793443724);
                        i3 = -1639254189;
                        i8 = iM2566 ^ i3;
                        c1827 = this;
                    }
                    break;
                case -1344429613:
                case 1642904887:
                    if (!RunnableC3474.m10630()) {
                        iM6981 = (C2105.m6981("۠۠") + i5) * (-33);
                        i = ((iM6981 ^ i6) * (-22251)) ^ (-209898270);
                        i2 = 809116700;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        iM2566 = C2105.m6981("۬᩺") ^ i5;
                        i7 = ((iM2566 ^ i6) * 31557) ^ 1292315867;
                        i3 = -2110555145;
                        i8 = iM2566 ^ i3;
                        c1827 = this;
                    }
                    break;
                case -1109177326:
                case 74477840:
                    interfaceC13049M4377 = C1294.m4377(interfaceC12344);
                    if (C2167.f7158 >= 0) {
                        iM6981 = C0630.m2566("ۨܽ") ^ i6;
                        i = ((iM6981 ^ i5) * 5073) ^ 81494205;
                        i2 = 330948523;
                    } else {
                        iM6981 = C0630.m2566("ۚۧ") ^ i6;
                        i = ((iM6981 ^ i5) * 13323) ^ (-918642649);
                        i2 = 2129427275;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -875167971:
                case 317249086:
                    i9 = 8;
                    iM6981 = C0630.m2566("ۢܳ") ^ i5;
                    i = ((iM6981 ^ i6) * (-309)) ^ (-873623951);
                    i2 = 280889668;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -773581267:
                case -760975024:
                    sArr3 = f6260;
                    i10 = 1;
                    if (C0964.f3626 == 0) {
                        iM6981 = (i5 - C2105.m6981("᩹᩺")) * (-5);
                        i = ((iM6981 ^ i6) * (-5295)) ^ (-54194114);
                        i2 = 1912372391;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        iM2566 = C2105.m6981("ᩴ۬") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-16397)) ^ (-793443724);
                        i3 = -1639254189;
                        i8 = iM2566 ^ i3;
                        c1827 = this;
                    }
                    break;
                case -755389515:
                case 826375040:
                    if (!C4159.f13567) {
                        iM6981 = C0630.m2566("ۨܽ") ^ i6;
                        i = ((iM6981 ^ i5) * 5073) ^ 81494205;
                        i2 = 330948523;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        sArr = sArr2;
                        int iM2568 = (C0630.m2566("ۚ֫") ^ i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = iM2568 ^ (-1416044803);
                        sArr2 = sArr;
                        i7 = ((iM2568 ^ i5) * 5719) ^ 403817002;
                        c1827 = this;
                    }
                    break;
                case -157268508:
                case 1574428741:
                    runnableC13135 = (RunnableC13135) c1827.f6262;
                    interfaceC12344 = ApplicationC20075.f65008;
                    if (RunnableC3474.f10992 > 0) {
                        iM6981 = (C0630.m2566("֨᩸") ^ i5) * (-111);
                        i = ((iM6981 ^ i6) * (-23349)) ^ (-1569095981);
                        i2 = -161925014;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        iM2566 = C2105.m6981("ᩴ۬") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-16397)) ^ (-793443724);
                        i3 = -1639254189;
                        i8 = iM2566 ^ i3;
                        c1827 = this;
                    }
                    break;
                case 26062321:
                case 439013238:
                    switch (c1827.f6261) {
                        case 0:
                            iM6981 = (i5 - C2105.m6981("ۗۢ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i = ((iM6981 ^ i6) * (-29819)) ^ (-712175079);
                            i2 = 1161210263;
                            break;
                        default:
                            iM6981 = (C2105.m6981("ܽ᩶") ^ i6) * 37;
                            i = ((iM6981 ^ i5) * (-15305)) ^ (-2068325310);
                            i2 = -379189458;
                            break;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case 317843604:
                case 1741694087:
                    i13 = 82628100;
                    if (C3663.f11553) {
                        iM6981 = (C2105.m6981("۠۠") + i5) * (-33);
                        i = ((iM6981 ^ i6) * (-22251)) ^ (-209898270);
                        i2 = 809116700;
                    } else {
                        iM6981 = C2105.m6981("ܺ᩶") ^ i6;
                        i = ((iM6981 ^ i5) * (-28443)) ^ (-117429040);
                        i2 = -1738528495;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case 470933214:
                case 973790991:
                    i14 = 42296;
                    iM6981 = (C2105.m6981("۟ۗ") + i6) * (-53);
                    i = ((iM6981 ^ i5) * 15969) ^ 1514952494;
                    i2 = -651294185;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case 618855677:
                case 1816461898:
                    C3746.m11360(view, i9);
                    break;
                case 638964405:
                case 749172748:
                    i9 = 0;
                    iM6981 = C0630.m2566("ۢܳ") ^ i5;
                    i = ((iM6981 ^ i6) * (-309)) ^ (-873623951);
                    i2 = 280889668;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case 665312978:
                case 1780479074:
                    int i15 = s + s2;
                    i11 = i15 * i15;
                    i12 = s * s;
                    if (C2105.f7037 == 0) {
                        iM6981 = C2105.m6981("ܿ᩶") ^ i5;
                        i = ((iM6981 ^ i6) * 4405) ^ (-1237336009);
                        i2 = 648886955;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        iM2566 = C2105.m6981("ᩴ۬") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-16397)) ^ (-793443724);
                        i3 = -1639254189;
                        i8 = iM2566 ^ i3;
                        c1827 = this;
                    }
                    break;
                case 1125338996:
                case 1173683357:
                    C7106.m19107(interfaceC13049M13549);
                    runnableC13135.run();
                    break;
                case 1797806281:
                case 1882747332:
                    C0964.m3413();
                    C1128.m3851();
                    iM6981 = C0630.m2566("ۨܽ") ^ i6;
                    i = ((iM6981 ^ i5) * 5073) ^ 81494205;
                    i2 = 330948523;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                default:
                    int i16 = i12 + i13;
                    if ((i16 + i16) - i11 >= 0) {
                        iM6981 = C2105.m6981("۠᩹") ^ i5;
                        i = ((iM6981 ^ i6) * 28417) ^ 1928744224;
                        i2 = -1552053219;
                    } else {
                        iM6981 = (C0630.m2566("᩺᩻") + i6) * (-115);
                        i = ((iM6981 ^ i5) * (-24445)) ^ (-592096211);
                        i2 = 1737707379;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
            }
            return;
        }
    }
}
