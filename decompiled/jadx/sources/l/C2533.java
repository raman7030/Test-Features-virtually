package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.concurrent.atomic.AtomicBoolean;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.custom.sec.SecP192K1Field;

/* JADX INFO: renamed from: l.ۖ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes2.dex */
public final class C2533 extends AbstractC7548 {

    /* JADX INFO: renamed from: ֫ۡ᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f8039 = {5253, 14044, -15194, 15439};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C22250 f8040;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f8041;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f8042;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f8043;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f8044;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17066 f8045;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C4611 f8046;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f8047;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f8048;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f8049;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13041 f8050;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f8051;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
    }

    public C2533(boolean z, String str, AbstractC15440 abstractC15440, TextView textView, AbstractActivityC3346 abstractActivityC3346, InterfaceC17066 interfaceC17066, InterfaceC13041 interfaceC13041, View view, AtomicBoolean atomicBoolean) {
        int i = -123749027;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C3746.f11829;
        this.f8049 = z;
        this.f8047 = str;
        this.f8044 = abstractC15440;
        this.f8042 = textView;
        this.f8043 = abstractActivityC3346;
        this.f8045 = interfaceC17066;
        this.f8050 = interfaceC13041;
        this.f8048 = view;
        this.f8041 = atomicBoolean;
        int iM6981 = C2105.m6981("ۘ֫") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-11439)) ^ 976902878;
        int i5 = 1872138724;
        while (true) {
            i = (iM6981 ^ i5) ^ (i4 & (((i ^ i2) * 20913) >> 31));
            switch (i) {
                case -1539809010:
                case 1301870661:
                    C0630.m2564();
                    C2126.m7040();
                    throw new RuntimeException();
                case -1326081638:
                case 1594882223:
                    return;
                case -665410613:
                case -428200799:
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("᩸᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 27395) ^ 432351293;
                        i5 = -266827207;
                    } else {
                        iM6981 = C0630.m2566("۬ۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3351)) ^ (-498781791);
                        i5 = 1345796713;
                    }
                    break;
                case -403259404:
                case 490726091:
                    if (!C2167.m7155()) {
                        iM6981 = C0630.m2566("᩸᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 27395) ^ 432351293;
                        i5 = -266827207;
                    } else {
                        iM6981 = (C2105.m6981("ۨ᩵") + i3) * (-93);
                        i4 = ((iM6981 ^ i2) * 13581) ^ (-1248082541);
                        i5 = -1245892270;
                    }
                    break;
                case 156172498:
                case 380420701:
                    if (C3911.m11924() <= 0) {
                        iM6981 = (C2105.m6981("ܳۤ") + i3) * 83;
                        i4 = ((iM6981 ^ i2) * 25647) ^ 2029927569;
                        i5 = -1094249117;
                    } else {
                        iM6981 = C2105.m6981("ۘ۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22793) ^ 668233724;
                        i5 = -701756820;
                    }
                    break;
                case 386142404:
                case 555535226:
                    C3019.m9255();
                    iM6981 = C0630.m2566("᩸᩸") ^ i2;
                    i4 = ((iM6981 ^ i3) * 27395) ^ 432351293;
                    i5 = -266827207;
                    break;
                default:
                    if (RunnableC1108.m3790()) {
                        iM6981 = (C2105.m6981("ۨ᩵") + i3) * (-93);
                        i4 = ((iM6981 ^ i2) * 13581) ^ (-1248082541);
                        i5 = -1245892270;
                    } else {
                        iM6981 = (i2 - C2105.m6981("᩵ۙ")) * 57;
                        i4 = ((iM6981 ^ i3) * 26925) ^ 1428635225;
                        i5 = -1509388656;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0174  */
    /* JADX WARN: Code duplicated, block: B:62:0x01bb A[PHI: r1 r2
      0x01bb: PHI (r1v4 l.ۗܺ᩷) = (r1v3 l.ۗܺ᩷), (r1v2 l.ۗܺ᩷) binds: [B:60:0x01a2, B:37:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r2v4 android.widget.TextView) = (r2v3 android.widget.TextView), (r2v2 android.widget.TextView) binds: [B:60:0x01a2, B:37:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d9 A[PHI: r0 r10
      0x01d9: PHI (r0v5 l.ۙۧᩳ) = (r0v3 l.ۙۧᩳ), (r0v2 l.ۙۧᩳ), (r0v2 l.ۙۧᩳ), (r0v2 l.ۙۧᩳ), (r0v2 l.ۙۧᩳ) binds: [B:64:0x01d7, B:52:0x014c, B:14:0x005b, B:10:0x003c, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x01d9: PHI (r10v9 android.view.View$OnClickListener) = 
      (r10v4 android.view.View$OnClickListener)
      (r10v5 android.view.View$OnClickListener)
      (r10v4 android.view.View$OnClickListener)
      (r10v4 android.view.View$OnClickListener)
      (r10v4 android.view.View$OnClickListener)
     binds: [B:64:0x01d7, B:52:0x014c, B:14:0x005b, B:10:0x003c, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(final Exception exc) {
        int iM6981;
        int i;
        C4611 c4611 = null;
        final AbstractActivityC3346 abstractActivityC3346 = null;
        TextView textView = null;
        InterfaceC13041 interfaceC13041 = null;
        int i2 = -1409349330;
        int i3 = C3683.f11629;
        int i4 = C4117.f13076;
        int iM2566 = (C0630.m2566("ۖ֡") + i4) * 109;
        int i5 = ((iM2566 ^ i3) * (-5737)) ^ (-1146257730);
        int i6 = 1645551109;
        while (true) {
            int i7 = iM2566 ^ i6;
            View.OnClickListener onClickListener = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-7539)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1822350762:
                    case 79640093:
                        abstractActivityC3346 = this.f8043;
                        textView = this.f8042;
                        if (c4611 != null) {
                            iM6981 = (i3 - C2105.m6981("֨ۛ")) * 19;
                            i5 = ((iM6981 ^ i4) * 10445) ^ 2118033669;
                            i = 665211940;
                        } else {
                            iM6981 = (i3 - C0630.m2566("ܰܺ")) * 33;
                            i5 = ((iM6981 ^ i4) * (-18113)) ^ 293026248;
                            i = -1680225649;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1775868081:
                    case 59437168:
                        if (RunnableC0588.m2441() < 0) {
                            iM6981 = C2105.m6981("ۧᩳ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 4981) ^ 1228735678;
                            i = 621199674;
                            i7 = iM6981 ^ i;
                        }
                        break;
                    case -1676345765:
                    case -780013381:
                        c4611 = this.f8046;
                        if (RunnableC3474.m10630()) {
                            iM6981 = (C0630.m2566("ۤܺ") + i4) * 127;
                            i5 = ((iM6981 ^ i3) * (-25123)) ^ (-948280003);
                            i = -1659869867;
                        } else {
                            iM6981 = (i3 - C2105.m6981("ܿ۬")) * (-23);
                            i5 = ((iM6981 ^ i4) * 28229) ^ 862071740;
                            i = -152228843;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1659467853:
                    case -986290827:
                        interfaceC13041.accept(c4611);
                        iM6981 = (C0630.m2566("ۖ᩵") + i4) * (-41);
                        i5 = ((iM6981 ^ i3) * 27739) ^ 1700937127;
                        i = 537966392;
                        i7 = iM6981 ^ i;
                        break;
                    case -1583648519:
                    case 1240093242:
                        textView.setSingleLine();
                        if (RunnableC1108.f4040) {
                            iM6981 = (C2105.m6981("֨ܽ") + i3) * 49;
                            i5 = ((iM6981 ^ i4) * (-21127)) ^ (-912356886);
                            i = -902014157;
                        } else {
                            iM6981 = (C2105.m6981("۟ܿ") + i4) * 99;
                            i5 = ((iM6981 ^ i3) * (-31171)) ^ 1117643921;
                            i = 1819187678;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -748539557:
                    case 122967483:
                        if (C5695.f17556 < 0) {
                            onClickListener = new View.OnClickListener() { // from class: l.᩷۫ܽ
                                {
                                    int i8 = 514993728;
                                    int i9 = C4263.f13799;
                                    int i10 = C5695.f17556;
                                    int iM2567 = C0630.m2566("ۗۛ") ^ i10;
                                    int i11 = ((iM2567 ^ i9) * 32693) ^ 1670075503;
                                    int i12 = -323152663;
                                    while (true) {
                                        i8 = ((((i8 ^ i9) * (-15207)) >> 31) & i11) ^ (iM2567 ^ i12);
                                        switch (i8) {
                                            case -1760133459:
                                            case -1170953688:
                                                if (C4159.f13567) {
                                                    iM2567 = (C0630.m2566("ۨۨ") ^ i10) * 77;
                                                    i11 = ((iM2567 ^ i9) * 30723) ^ 1780053789;
                                                    i12 = -2090927931;
                                                } else {
                                                    iM2567 = C2105.m6981("֫ܰ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * (-25395)) ^ 194468834;
                                                    i12 = -596981682;
                                                }
                                                break;
                                            case -1562381034:
                                            case 1125369766:
                                                return;
                                            case -1480451240:
                                            case -491932891:
                                                if (C3683.m11222()) {
                                                    iM2567 = C0630.m2566("ܰۗ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * 14507) ^ 182619571;
                                                    i12 = -2057349548;
                                                } else {
                                                    iM2567 = C2105.m6981("ۙ᩸") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * (-13011)) ^ 988503854;
                                                    i12 = -1252087254;
                                                }
                                                break;
                                            case -1267963297:
                                            case 1751684004:
                                                C0964.m3413();
                                                C2520.m8026();
                                                iM2567 = C2105.m6981("۬ᩳ") ^ i9;
                                                i11 = ((iM2567 ^ i10) * 13987) ^ (-1218226202);
                                                i12 = -182499479;
                                                break;
                                            case -1229281285:
                                            case -635497314:
                                                if (C4263.f13799 <= 0) {
                                                    iM2567 = C0630.m2566("ۨ᩸") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-25895)) ^ (-159058402);
                                                    i12 = -1522283699;
                                                } else {
                                                    iM2567 = C0630.m2566("ۜۨ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * 4803) ^ 483660188;
                                                    i12 = -1905764212;
                                                }
                                                break;
                                            case -1052532922:
                                            case 1074285768:
                                                C2167.m7155();
                                                throw new RuntimeException();
                                            case -964199213:
                                            case 1198662642:
                                                if (C1047.f3863 >= 0) {
                                                    iM2567 = C2105.m6981("ܳ᩵") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-14139)) ^ (-1245110669);
                                                    i12 = -1997695477;
                                                } else {
                                                    iM2567 = (i10 - C2105.m6981("ܿܿ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                    i11 = ((iM2567 ^ i9) * (-535)) ^ (-341250569);
                                                    i12 = -134403295;
                                                }
                                                break;
                                            case -868087046:
                                            case -628503570:
                                                if (C1420.m4913()) {
                                                    iM2567 = C2105.m6981("ܳ᩵") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-14139)) ^ (-1245110669);
                                                    i12 = -1997695477;
                                                } else {
                                                    iM2567 = C2105.m6981("۬۟") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * 3007) ^ (-269142427);
                                                    i12 = -1909421392;
                                                }
                                                break;
                                            case -783255456:
                                            case 1853478178:
                                                if (C1711.f5919) {
                                                    iM2567 = C2105.m6981("ܳ᩵") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-14139)) ^ (-1245110669);
                                                    i12 = -1997695477;
                                                } else {
                                                    iM2567 = C2105.m6981("ۖۖ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * (-6235)) ^ 455380026;
                                                    i12 = -220491973;
                                                }
                                                break;
                                            case -405714381:
                                            case -399091837:
                                                if (C0422.f1886 <= 0) {
                                                    iM2567 = C0630.m2566("ۨ᩸") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-25895)) ^ (-159058402);
                                                    i12 = -1522283699;
                                                } else {
                                                    iM2567 = C2105.m6981("۬ᩳ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * 13987) ^ (-1218226202);
                                                    i12 = -182499479;
                                                }
                                                break;
                                            case -134132733:
                                            case 1215568778:
                                                if (C0483.f2088 >= 0) {
                                                    iM2567 = C0630.m2566("ܰۗ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * 14507) ^ 182619571;
                                                    i12 = -2057349548;
                                                } else {
                                                    iM2567 = C2105.m6981("۬ᩳ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * 13987) ^ (-1218226202);
                                                    i12 = -182499479;
                                                }
                                                break;
                                            case 11296761:
                                            case 67568515:
                                                if (C0630.m2564()) {
                                                    iM2567 = C2105.m6981("֫ܰ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * (-25395)) ^ 194468834;
                                                    i12 = -596981682;
                                                } else {
                                                    iM2567 = C2105.m6981("ۡܿ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * 11225) ^ 742461604;
                                                    i12 = 261771020;
                                                }
                                                break;
                                            case 25882202:
                                            case 1429683106:
                                                if (C3683.f11629 >= 0) {
                                                    iM2567 = C0630.m2566("ۨ᩸") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-25895)) ^ (-159058402);
                                                    i12 = -1522283699;
                                                } else {
                                                    iM2567 = (C0630.m2566("᩺᩸") + i9) * 69;
                                                    i11 = ((iM2567 ^ i10) * 29857) ^ (-649741133);
                                                    i12 = 488057991;
                                                }
                                                break;
                                            case 1434319109:
                                            case 1661433748:
                                                if (C7106.f21815 != 0) {
                                                    iM2567 = C0630.m2566("ۨ᩸") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-25895)) ^ (-159058402);
                                                    i12 = -1522283699;
                                                } else {
                                                    iM2567 = C2105.m6981("ۜ֡") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * 8389) ^ 1967744736;
                                                    i12 = 1512384079;
                                                }
                                                break;
                                            case 1668502428:
                                            case 1708806142:
                                                C4263.m12819();
                                                if (C0422.f1886 <= 0) {
                                                    iM2567 = C2105.m6981("֫ܰ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * (-25395)) ^ 194468834;
                                                    i12 = -596981682;
                                                } else {
                                                    iM2567 = C0630.m2566("ܰۗ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * 14507) ^ 182619571;
                                                    i12 = -2057349548;
                                                }
                                                break;
                                            default:
                                                if (C0964.f3626 != 0) {
                                                    iM2567 = C2105.m6981("ܳ᩵") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-14139)) ^ (-1245110669);
                                                    i12 = -1997695477;
                                                } else {
                                                    iM2567 = (C0630.m2566("ܺ۠") + i10) * (-3);
                                                    i11 = ((iM2567 ^ i9) * 24937) ^ 159338668;
                                                    i12 = -1897050702;
                                                }
                                                break;
                                        }
                                    }
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Exception exc2 = null;
                                    int i8 = -1643274333;
                                    int i9 = AbstractC2021.f6743;
                                    int i10 = C1047.f3863;
                                    int iM6982 = C2105.m6981("ܿۢ") ^ i10;
                                    int i11 = ((iM6982 ^ i9) * 13685) ^ (-177952486);
                                    int i12 = 1660228719;
                                    while (true) {
                                        i8 = ((((i8 ^ i9) * 7531) >> 31) & i11) ^ (iM6982 ^ i12);
                                        switch (i8) {
                                            case -2096080451:
                                            case -449196338:
                                                if (ViewOnClickListenerC1958.f6529 <= 0) {
                                                    iM6982 = (C0630.m2566("ۜۡ") ^ i10) * (-117);
                                                    i11 = ((iM6982 ^ i9) * (-29305)) ^ (-1961296490);
                                                    i12 = -1604377413;
                                                } else {
                                                    iM6982 = C2105.m6981("ۙܽ") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * (-19671)) ^ 1135623816;
                                                    i12 = -467070664;
                                                }
                                                break;
                                            case -1835675875:
                                            case 1478738497:
                                                if (C4263.f13799 <= 0) {
                                                    iM6982 = C0630.m2566("֫ᩳ") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * (-9519)) ^ 1446303198;
                                                    i12 = 1271090002;
                                                } else {
                                                    iM6982 = C0630.m2566("ۚۡ") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * (-9561)) ^ (-201644119);
                                                    i12 = 972250144;
                                                }
                                                break;
                                            case -1296976234:
                                            case 1868105956:
                                                if (C1916.f6442) {
                                                    iM6982 = (C0630.m2566("ܰۛ") + i10) * (-83);
                                                    i11 = ((iM6982 ^ i9) * 11337) ^ 406622339;
                                                    i12 = 683329601;
                                                } else {
                                                    iM6982 = C2105.m6981("ܽܳ") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * (-24673)) ^ 1125469238;
                                                    i12 = 131209474;
                                                }
                                                break;
                                            case -1238843263:
                                            case -311720667:
                                                if (C3746.m11369() >= 0) {
                                                    iM6982 = C2105.m6981("ܽܳ") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * (-24673)) ^ 1125469238;
                                                    i12 = 131209474;
                                                } else {
                                                    iM6982 = C0630.m2566("۬ۢ") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * (-2509)) ^ (-597366609);
                                                    i12 = -1815841664;
                                                }
                                                break;
                                            case -1226177763:
                                            case -74613036:
                                                C4075.m12246(abstractActivityC3346, exc2, null);
                                                break;
                                            case -1204613864:
                                            case -140690785:
                                                C3663.m11168();
                                                C3911.m11924();
                                                iM6982 = (C0630.m2566("᩸ᩴ") + i9) * 23;
                                                i11 = ((iM6982 ^ i10) * 119) ^ 1464831897;
                                                i12 = -2033925342;
                                                break;
                                            case -1117558566:
                                            case -536623168:
                                                if (C2126.f7087) {
                                                    iM6982 = C0630.m2566("֫ᩳ") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * (-9519)) ^ 1446303198;
                                                    i12 = 1271090002;
                                                } else {
                                                    iM6982 = (C2105.m6981("ۖۚ") ^ i10) * (-85);
                                                    i11 = ((iM6982 ^ i9) * (-11181)) ^ (-1024423360);
                                                    i12 = -1326089458;
                                                }
                                                break;
                                            case -960789485:
                                            case -779795537:
                                                if (C0964.f3626 == 0) {
                                                    iM6982 = C2105.m6981("ܽܳ") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * (-24673)) ^ 1125469238;
                                                    i12 = 131209474;
                                                } else {
                                                    iM6982 = C2105.m6981("ۙۢ") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * (-26187)) ^ 1298719362;
                                                    i12 = -1290656231;
                                                }
                                                break;
                                            case -742398791:
                                            case 158400709:
                                                if (RunnableC1108.f4040) {
                                                    iM6982 = C2105.m6981("ۘܺ") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * (-1459)) ^ 2278105;
                                                    i12 = 1885786441;
                                                } else {
                                                    iM6982 = C2105.m6981("ܽܳ") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * (-24673)) ^ 1125469238;
                                                    i12 = 131209474;
                                                }
                                                break;
                                            case -657390141:
                                            case 1766969301:
                                                exc2 = exc;
                                                if (C3663.m11168() >= 0) {
                                                    iM6982 = C0630.m2566("֫ᩳ") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * (-9519)) ^ 1446303198;
                                                    i12 = 1271090002;
                                                } else {
                                                    iM6982 = (C2105.m6981("᩶ۘ") ^ i9) * 101;
                                                    i11 = ((iM6982 ^ i10) * 27963) ^ 618768813;
                                                    i12 = -881246895;
                                                }
                                                break;
                                            case -564446939:
                                            case 1366847767:
                                                if (C22628.m50615() != 0) {
                                                    iM6982 = C2105.m6981("ۙۢ") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * (-26187)) ^ 1298719362;
                                                    i12 = -1290656231;
                                                } else {
                                                    iM6982 = (C0630.m2566("ۜۡ") ^ i10) * (-117);
                                                    i11 = ((iM6982 ^ i9) * (-29305)) ^ (-1961296490);
                                                    i12 = -1604377413;
                                                }
                                                break;
                                            case -275908987:
                                            case 490463842:
                                                if (C0237.f1507 != 0) {
                                                    iM6982 = (C0630.m2566("ۜۡ") ^ i10) * (-117);
                                                    i11 = ((iM6982 ^ i9) * (-29305)) ^ (-1961296490);
                                                    i12 = -1604377413;
                                                } else {
                                                    iM6982 = (C2105.m6981("ۖ֨") + i9) * (-91);
                                                    i11 = ((iM6982 ^ i10) * 9771) ^ 251652794;
                                                    i12 = -1938633389;
                                                }
                                                break;
                                            case 381096601:
                                            case 650937768:
                                                if (C0382.f1805) {
                                                    iM6982 = C2105.m6981("ᩳܰ") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * 14433) ^ 1330373092;
                                                    i12 = 1749217466;
                                                } else {
                                                    iM6982 = (C0630.m2566("᩸ᩴ") + i9) * 23;
                                                    i11 = ((iM6982 ^ i10) * 119) ^ 1464831897;
                                                    i12 = -2033925342;
                                                }
                                                break;
                                            case 515681439:
                                            case 1369643044:
                                                if (C1128.m3851() <= 0) {
                                                    iM6982 = C2105.m6981("ۙۢ") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * (-26187)) ^ 1298719362;
                                                    i12 = -1290656231;
                                                } else {
                                                    iM6982 = (C2105.m6981("ܺ֡") ^ i9) * 115;
                                                    i11 = ((iM6982 ^ i10) * 21629) ^ (-1584313875);
                                                    i12 = -1230082963;
                                                }
                                                break;
                                            case 524876242:
                                            case 1331314251:
                                                C1047.m3599();
                                                C0422.m1963();
                                                break;
                                            default:
                                                C3432.m10477();
                                                if (C4117.f13076 <= 0) {
                                                    iM6982 = (C0630.m2566("ۜۡ") ^ i10) * (-117);
                                                    i11 = ((iM6982 ^ i9) * (-29305)) ^ (-1961296490);
                                                    i12 = -1604377413;
                                                } else {
                                                    iM6982 = (C0630.m2566("᩸ᩴ") + i9) * 23;
                                                    i11 = ((iM6982 ^ i10) * 119) ^ 1464831897;
                                                    i12 = -2033925342;
                                                }
                                                break;
                                        }
                                        return;
                                    }
                                }
                            };
                            if (RunnableC1108.f4040) {
                                iM6981 = (i4 - C0630.m2566("۫ۢ")) * 35;
                                i5 = ((iM6981 ^ i3) * (-32051)) ^ (-67495940);
                                i = 1035923629;
                            } else {
                                iM6981 = (i3 - C2105.m6981("ܿ۬")) * (-23);
                                i5 = ((iM6981 ^ i4) * 28229) ^ 862071740;
                                i = -152228843;
                            }
                            i7 = iM6981 ^ i;
                        }
                        break;
                    case -576969482:
                    case 972763171:
                        C3432.m10477();
                        if (C3537.f11231 < 0) {
                            iM6981 = (i3 - C2105.m6981("ܿ۬")) * (-23);
                            i5 = ((iM6981 ^ i4) * 28229) ^ 862071740;
                            i = -152228843;
                        } else {
                            iM6981 = C2105.m6981("֫֫") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-15875)) ^ 1970414130;
                            i = -2119078156;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -523300515:
                    case 1836873624:
                        C2126.m7039(textView, onClickListener);
                        if (!C0798.f2919) {
                            textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۢ۫ܽ
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    Exception exc2 = null;
                                    Object obj = null;
                                    int i8 = -435355392;
                                    int i9 = C1047.f3863;
                                    int i10 = C3245.f10203;
                                    int iM2567 = C0630.m2566("᩸᩸") ^ i10;
                                    int i11 = ((iM2567 ^ i9) * (-11167)) ^ 1822288091;
                                    int i12 = -467783827;
                                    while (true) {
                                        i8 = ((((i8 ^ i9) * (-8845)) >> 31) & i11) ^ (iM2567 ^ i12);
                                        switch (i8) {
                                            case -1687072101:
                                            case -757308747:
                                                C1773.m5908();
                                                if (C1916.m6308() < 0) {
                                                    iM2567 = (C0630.m2566("ܰۛ") + i9) * 27;
                                                    i11 = ((iM2567 ^ i10) * 5153) ^ (-988567507);
                                                    i12 = -878744642;
                                                } else {
                                                    iM2567 = C2105.m6981("ۗܳ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-16173)) ^ (-173260180);
                                                    i12 = -295647258;
                                                }
                                                break;
                                            case -1508594423:
                                            case 56677675:
                                                if (C7811.m20844() != 0) {
                                                    iM2567 = (C0630.m2566("ܽ۠") ^ i9) * (-105);
                                                    i11 = ((iM2567 ^ i10) * 3149) ^ (-564865445);
                                                    i12 = -131068921;
                                                } else {
                                                    iM2567 = (i9 - C2105.m6981("ۛۖ")) * (-91);
                                                    i11 = ((iM2567 ^ i10) * (-2361)) ^ (-73089082);
                                                    i12 = 2139813744;
                                                }
                                                break;
                                            case -966510587:
                                            case 1581872831:
                                                if (C4075.f12947 >= 0) {
                                                    iM2567 = (C0630.m2566("ܽ۠") ^ i9) * (-105);
                                                    i11 = ((iM2567 ^ i10) * 3149) ^ (-564865445);
                                                    i12 = -131068921;
                                                } else {
                                                    iM2567 = (C0630.m2566("ᩳ᩸") ^ i9) * 35;
                                                    i11 = ((iM2567 ^ i10) * 10791) ^ 1628798721;
                                                    i12 = 1849969729;
                                                }
                                                break;
                                            case -919668106:
                                            case 540891442:
                                                if (C2272.m7503()) {
                                                    iM2567 = C2105.m6981("ۛ۫") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-28135)) ^ 230939823;
                                                    i12 = 1641313094;
                                                } else {
                                                    iM2567 = C0630.m2566("۟ۙ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * 29873) ^ 746530490;
                                                    i12 = -851205156;
                                                }
                                                break;
                                            case -892823980:
                                            case 663327409:
                                                obj = null;
                                                if (C3911.f12484 >= 0) {
                                                    iM2567 = C2105.m6981("ۛ۫") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-28135)) ^ 230939823;
                                                    i12 = 1641313094;
                                                } else {
                                                    iM2567 = C2105.m6981("᩷ۤ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * 20575) ^ (-1308219793);
                                                    i12 = -516105309;
                                                }
                                                break;
                                            case -870759246:
                                            case -452500839:
                                                C0714.m2805();
                                                C0237.m1481();
                                                return false;
                                            case -848665798:
                                            case 1417578316:
                                                if (C3911.f12484 >= 0) {
                                                    iM2567 = C2105.m6981("ۛ۫") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-28135)) ^ 230939823;
                                                    i12 = 1641313094;
                                                } else {
                                                    iM2567 = C2105.m6981("ܽܿ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * (-26581)) ^ 336353603;
                                                    i12 = -1911015456;
                                                }
                                                break;
                                            case -593625872:
                                            case 966725349:
                                                if (C0714.f2697 >= 0) {
                                                    iM2567 = (C0630.m2566("ܽ۠") ^ i9) * (-105);
                                                    i11 = ((iM2567 ^ i10) * 3149) ^ (-564865445);
                                                    i12 = -131068921;
                                                } else {
                                                    iM2567 = C0630.m2566("ᩳᩴ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-2401)) ^ (-543913923);
                                                    i12 = 69873621;
                                                }
                                                break;
                                            case -281403282:
                                            case 1919713215:
                                                if (C2167.f7158 >= 0) {
                                                    iM2567 = C2105.m6981("ۗܳ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-16173)) ^ (-173260180);
                                                    i12 = -295647258;
                                                } else {
                                                    iM2567 = C0630.m2566("֫᩻") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-28509)) ^ (-1668777765);
                                                    i12 = 1276260585;
                                                }
                                                break;
                                            case 22753473:
                                            case 508532428:
                                                C21923.m49329();
                                                iM2567 = C2105.m6981("ۗܳ") ^ i10;
                                                i11 = ((iM2567 ^ i9) * (-16173)) ^ (-173260180);
                                                i12 = -295647258;
                                                break;
                                            case 543137954:
                                            case 1698503035:
                                                if (RunnableC0588.f2309 < 0) {
                                                    iM2567 = (C0630.m2566("ܽ۠") ^ i9) * (-105);
                                                    i11 = ((iM2567 ^ i10) * 3149) ^ (-564865445);
                                                    i12 = -131068921;
                                                } else {
                                                    iM2567 = C2105.m6981("ۗܳ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-16173)) ^ (-173260180);
                                                    i12 = -295647258;
                                                }
                                                break;
                                            case 554680312:
                                            case 1135472734:
                                                if (C0714.f2697 < 0) {
                                                    iM2567 = C0630.m2566("ܳܶ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * 25491) ^ 1624788840;
                                                    i12 = -1190597488;
                                                } else {
                                                    iM2567 = (C0630.m2566("ܰۛ") + i9) * 27;
                                                    i11 = ((iM2567 ^ i10) * 5153) ^ (-988567507);
                                                    i12 = -878744642;
                                                }
                                                break;
                                            case 642791900:
                                            case 1682766145:
                                                if (C1005.f3721) {
                                                    iM2567 = (C0630.m2566("ᩴ᩸") + i10) * 65;
                                                    i11 = ((iM2567 ^ i9) * 7657) ^ (-1093113221);
                                                    i12 = 214696662;
                                                } else {
                                                    iM2567 = C2105.m6981("ۛ۫") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-28135)) ^ 230939823;
                                                    i12 = 1641313094;
                                                }
                                                break;
                                            case 1228803673:
                                            case 1852547761:
                                                if (C1005.f3721) {
                                                    iM2567 = (C2105.m6981("۫ۖ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                    i11 = ((iM2567 ^ i10) * (-14127)) ^ (-1645977752);
                                                    i12 = -2140686165;
                                                } else {
                                                    iM2567 = (C0630.m2566("ܰۛ") + i9) * 27;
                                                    i11 = ((iM2567 ^ i10) * 5153) ^ (-988567507);
                                                    i12 = -878744642;
                                                }
                                                break;
                                            case 1816651143:
                                            case 1872393692:
                                                ServiceConnectionC3453.m10561(abstractActivityC3346, exc2, obj);
                                                return true;
                                            default:
                                                exc2 = exc;
                                                if (C4263.m12819() >= 0) {
                                                    iM2567 = C0630.m2566("ܳܶ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * 25491) ^ 1624788840;
                                                    i12 = -1190597488;
                                                } else {
                                                    iM2567 = C2105.m6981("ۘ᩵") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-16857)) ^ (-709550047);
                                                    i12 = 99624004;
                                                }
                                                break;
                                        }
                                    }
                                }

                                {
                                    int i8 = 37028385;
                                    int i9 = C4117.f13076;
                                    int i10 = C2520.f8000;
                                    int iM6982 = (C2105.m6981("֨ᩴ") + i9) * 85;
                                    int i11 = ((iM6982 ^ i10) * 16873) ^ (-1085044538);
                                    int i12 = -468053272;
                                    while (true) {
                                        i8 = ((((i8 ^ i10) * 5857) >> 31) & i11) ^ (iM6982 ^ i12);
                                        switch (i8) {
                                            case -2046735613:
                                            case -616056871:
                                                return;
                                            case -1805347767:
                                            case 1647997451:
                                                if (!RunnableC3474.m10630()) {
                                                    iM6982 = C2105.m6981("ܶۗ") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * 8579) ^ (-996213917);
                                                    i12 = 378260756;
                                                } else {
                                                    iM6982 = C2105.m6981("ۖܶ") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * 16541) ^ 2138829549;
                                                    i12 = -1296127726;
                                                }
                                                break;
                                            case -1209510081:
                                            case 932397721:
                                                C4075.m12263();
                                                if (C0964.f3626 != 0) {
                                                    iM6982 = C2105.m6981("ۘ᩸") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * (-16371)) ^ (-1714805436);
                                                    i12 = -348799085;
                                                } else {
                                                    iM6982 = C2105.m6981("ܶۗ") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * 8579) ^ (-996213917);
                                                    i12 = 378260756;
                                                }
                                                break;
                                            case -1161363116:
                                            case -354117266:
                                                if (C0483.f2088 >= 0) {
                                                    iM6982 = (C2105.m6981("ۜᩳ") ^ i9) * (-33);
                                                    i11 = ((iM6982 ^ i10) * 16713) ^ 2113857382;
                                                    i12 = 1147355161;
                                                } else {
                                                    iM6982 = (i10 - C0630.m2566("۬۫")) * (-61);
                                                    i11 = ((iM6982 ^ i9) * (-11991)) ^ 1568959699;
                                                    i12 = -752805302;
                                                }
                                                break;
                                            case -915353612:
                                            case 351613777:
                                                if (C0630.f2410 <= 0) {
                                                    iM6982 = C2105.m6981("ۖܶ") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * 16541) ^ 2138829549;
                                                    i12 = -1296127726;
                                                } else {
                                                    iM6982 = C0630.m2566("ۢ᩹") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * (-32629)) ^ (-1314603118);
                                                    i12 = -1292465305;
                                                }
                                                break;
                                            case -637528834:
                                            case 1792020853:
                                                if (RunnableC1937.f6483 >= 0) {
                                                    iM6982 = C0630.m2566("ۜ᩹") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * 21157) ^ 1592439744;
                                                    i12 = -517922171;
                                                } else {
                                                    iM6982 = (C0630.m2566("ۖܳ") ^ i10) * (-85);
                                                    i11 = ((iM6982 ^ i9) * 32385) ^ 1593807041;
                                                    i12 = -1234130030;
                                                }
                                                break;
                                            case -465568233:
                                            case 161018633:
                                                if (C0798.m2998() != 0) {
                                                    iM6982 = (C2105.m6981("ۜᩳ") ^ i9) * (-33);
                                                    i11 = ((iM6982 ^ i10) * 16713) ^ 2113857382;
                                                    i12 = 1147355161;
                                                } else {
                                                    iM6982 = C0630.m2566("ܿ֨") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * (-23909)) ^ (-675637076);
                                                    i12 = -987631666;
                                                }
                                                break;
                                            case -262123596:
                                            case 194044712:
                                                if (C0382.f1805) {
                                                    iM6982 = C0630.m2566("᩹ۨ") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * (-9399)) ^ 1469891278;
                                                    i12 = -1328974407;
                                                } else {
                                                    iM6982 = C2105.m6981("ܶۗ") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * 8579) ^ (-996213917);
                                                    i12 = 378260756;
                                                }
                                                break;
                                            case -139038201:
                                            case 1078112722:
                                                C2105.m6982();
                                                throw new RuntimeException();
                                            case 891898055:
                                            case 2053065970:
                                                if (C1711.f5919) {
                                                    iM6982 = C2105.m6981("ۘ᩸") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * (-16371)) ^ (-1714805436);
                                                    i12 = -348799085;
                                                } else {
                                                    iM6982 = C2105.m6981("᩸۬") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * 24721) ^ 686606827;
                                                    i12 = 1566196475;
                                                }
                                                break;
                                            case 908487700:
                                            case 1620154727:
                                                C0630.m2564();
                                                iM6982 = C2105.m6981("ܶۗ") ^ i9;
                                                i11 = ((iM6982 ^ i10) * 8579) ^ (-996213917);
                                                i12 = 378260756;
                                                break;
                                            case 958052966:
                                            case 1757613804:
                                                C22628.m50615();
                                                if (C0483.f2088 >= 0) {
                                                    iM6982 = C0630.m2566("ۜ᩹") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * 21157) ^ 1592439744;
                                                    i12 = -517922171;
                                                } else {
                                                    iM6982 = C2105.m6981("ܶۗ") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * 8579) ^ (-996213917);
                                                    i12 = 378260756;
                                                }
                                                break;
                                            case 997099106:
                                            case 1137667312:
                                                if (C2126.m7040()) {
                                                    iM6982 = C2105.m6981("ܶۗ") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * 8579) ^ (-996213917);
                                                    i12 = 378260756;
                                                } else {
                                                    iM6982 = (C2105.m6981("֫᩻") ^ i10) * 59;
                                                    i11 = ((iM6982 ^ i9) * 9623) ^ (-835061134);
                                                    i12 = 1493336949;
                                                }
                                                break;
                                            case 1050368214:
                                            case 2009992825:
                                                if (C3245.f10203 <= 0) {
                                                    iM6982 = C2105.m6981("ۖܶ") ^ i10;
                                                    i11 = ((iM6982 ^ i9) * 16541) ^ 2138829549;
                                                    i12 = -1296127726;
                                                } else {
                                                    iM6982 = C2105.m6981("᩶۠") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * 13721) ^ (-545602883);
                                                    i12 = 1921765041;
                                                }
                                                break;
                                            case 1317388755:
                                            case 1345288673:
                                                if (ServiceConnectionC3453.m10564() <= 0) {
                                                    iM6982 = (C2105.m6981("ۜᩳ") ^ i9) * (-33);
                                                    i11 = ((iM6982 ^ i10) * 16713) ^ 2113857382;
                                                    i12 = 1147355161;
                                                } else {
                                                    iM6982 = C0630.m2566("۬ۛ") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * 13773) ^ (-1573800138);
                                                    i12 = -792195893;
                                                }
                                                break;
                                            default:
                                                if (RunnableC0588.f2309 >= 0) {
                                                    iM6982 = C0630.m2566("ۜ᩹") ^ i9;
                                                    i11 = ((iM6982 ^ i10) * 21157) ^ 1592439744;
                                                    i12 = -517922171;
                                                } else {
                                                    iM6982 = (C2105.m6981("ۨܽ") + i9) * 71;
                                                    i11 = ((iM6982 ^ i10) * (-14265)) ^ (-1671066902);
                                                    i12 = -121380982;
                                                }
                                                break;
                                        }
                                    }
                                }
                            });
                        }
                        break;
                    case -512536099:
                    case 2065913952:
                        C0237.m1481();
                        if (C1711.m5736() > 0) {
                            iM6981 = (C2105.m6981("۟ܿ") + i4) * 99;
                            i5 = ((iM6981 ^ i3) * (-31171)) ^ 1117643921;
                            i = 1819187678;
                        } else {
                            iM6981 = (i3 - C2105.m6981("ܿ۬")) * (-23);
                            i5 = ((iM6981 ^ i4) * 28229) ^ 862071740;
                            i = -152228843;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -458249806:
                    case 2036490:
                        C19890.m45741(textView);
                        C1047.m3601(textView, C0422.m1959(exc));
                        if (C0237.f1507 != 0) {
                            iM6981 = (C2105.m6981("۟ܿ") + i4) * 99;
                            i5 = ((iM6981 ^ i3) * (-31171)) ^ 1117643921;
                            i = 1819187678;
                        } else {
                            iM6981 = C2105.m6981("᩵᩻") ^ i4;
                            i5 = ((iM6981 ^ i3) * 4133) ^ (-1359754785);
                            i = -145644296;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -250655371:
                    case 90650730:
                        C3746.m11369();
                        iM6981 = (C2105.m6981("۟ܿ") + i4) * 99;
                        i5 = ((iM6981 ^ i3) * (-31171)) ^ 1117643921;
                        i = 1819187678;
                        i7 = iM6981 ^ i;
                        break;
                    case -64658805:
                    case 236374978:
                        C22628.m50615();
                        break;
                    case 27495146:
                    case 1105075194:
                        interfaceC13041 = this.f8050;
                        if (interfaceC13041 != null) {
                            iM6981 = C2105.m6981("ܰ᩺") ^ i3;
                            i5 = ((iM6981 ^ i4) * 28021) ^ (-255137594);
                            i = 833707474;
                        } else {
                            iM6981 = (C0630.m2566("ۖ᩵") + i4) * (-41);
                            i5 = ((iM6981 ^ i3) * 27739) ^ 1700937127;
                            i = 537966392;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 69422033:
                    case 1664039334:
                        final AbstractC15440 abstractC15440 = this.f8044;
                        if (C3663.f11553) {
                            iM6981 = (i4 - C0630.m2566("᩹ۚ")) * (-67);
                            i5 = ((iM6981 ^ i3) * (-12943)) ^ 972789734;
                            i = 1944987949;
                        } else {
                            C2126.m7039(textView, new View.OnClickListener(this) { // from class: l.᩻۫ܽ

                                /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                                public final /* synthetic */ C2533 f76747;

                                {
                                    int i8 = -1743109206;
                                    int i9 = C0050.f910;
                                    int i10 = C4616.f14690;
                                    int iM2567 = (C0630.m2566("֡֡") ^ i10) * (-3);
                                    int i11 = ((iM2567 ^ i9) * (-21415)) ^ 1265741986;
                                    int i12 = 1646280854;
                                    while (true) {
                                        i8 = ((((i8 ^ i9) * (-21999)) >> 31) & i11) ^ (iM2567 ^ i12);
                                        switch (i8) {
                                            case -2005347889:
                                            case -145892451:
                                                C0382.m1848();
                                                throw new RuntimeException();
                                            case -1955020851:
                                            case 1377443167:
                                                return;
                                            case -1934226521:
                                            case -370278410:
                                                this.f76747 = this;
                                                if (C0798.f2919) {
                                                    iM2567 = (C0630.m2566("᩺ܽ") + i10) * (-27);
                                                    i11 = ((iM2567 ^ i9) * 29473) ^ 1926729525;
                                                    i12 = -693673979;
                                                } else {
                                                    iM2567 = C2105.m6981("ۡ֨") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * (-17465)) ^ 1349800249;
                                                    i12 = -1905535604;
                                                }
                                                break;
                                            case -1923231413:
                                            case 1866837746:
                                                if (C1504.f5354) {
                                                    iM2567 = (i9 - C0630.m2566("۠ۡ")) * 89;
                                                    i11 = ((iM2567 ^ i10) * (-21995)) ^ 1650114317;
                                                    i12 = 1164758816;
                                                } else {
                                                    iM2567 = C2105.m6981("ܽۧ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-5529)) ^ 551281592;
                                                    i12 = -2089482031;
                                                }
                                                break;
                                            case -1873907637:
                                            case 176675643:
                                                C0630.m2564();
                                                C22628.m50615();
                                                iM2567 = (C2105.m6981("֨֨") + i9) * 119;
                                                i11 = ((iM2567 ^ i10) * (-29841)) ^ (-2095069247);
                                                i12 = -110358254;
                                                break;
                                            case -1871282790:
                                            case 870328469:
                                                C0630.m2564();
                                                if (!C1005.f3721) {
                                                    iM2567 = (C2105.m6981("֨֨") + i9) * 119;
                                                    i11 = ((iM2567 ^ i10) * (-29841)) ^ (-2095069247);
                                                    i12 = -110358254;
                                                } else {
                                                    iM2567 = (C0630.m2566("᩺ܽ") + i10) * (-27);
                                                    i11 = ((iM2567 ^ i9) * 29473) ^ 1926729525;
                                                    i12 = -693673979;
                                                }
                                                break;
                                            case -1787091516:
                                            case 1155410826:
                                                if (C0483.f2088 >= 0) {
                                                    iM2567 = (i9 - C0630.m2566("᩺᩷")) * 41;
                                                    i11 = ((iM2567 ^ i10) * (-26173)) ^ 444231420;
                                                    i12 = 931375143;
                                                } else {
                                                    iM2567 = C2105.m6981("᩹ܳ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * 23575) ^ (-2071148075);
                                                    i12 = -1379902761;
                                                }
                                                break;
                                            case -1513213605:
                                            case -1343364796:
                                                if (C2167.f7158 >= 0) {
                                                    iM2567 = (i9 - C0630.m2566("۠ۡ")) * 89;
                                                    i11 = ((iM2567 ^ i10) * (-21995)) ^ 1650114317;
                                                    i12 = 1164758816;
                                                } else {
                                                    iM2567 = C2105.m6981("۟ۨ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * (-16715)) ^ (-1520896252);
                                                    i12 = 1776214886;
                                                }
                                                break;
                                            case -1201304938:
                                            case -552951440:
                                                if (C0630.f2410 <= 0) {
                                                    iM2567 = (i9 - C0630.m2566("۠ۡ")) * 89;
                                                    i11 = ((iM2567 ^ i10) * (-21995)) ^ 1650114317;
                                                    i12 = 1164758816;
                                                } else {
                                                    iM2567 = (C0630.m2566("ܿ᩺") ^ i9) * (-67);
                                                    i11 = ((iM2567 ^ i10) * (-2897)) ^ (-1550694263);
                                                    i12 = 1841915995;
                                                }
                                                break;
                                            case -558403681:
                                            case 1114220569:
                                                C21923.m49329();
                                                if (C3245.m9925() == 0) {
                                                    iM2567 = (i9 - C0630.m2566("۠ۡ")) * 89;
                                                    i11 = ((iM2567 ^ i10) * (-21995)) ^ 1650114317;
                                                    i12 = 1164758816;
                                                } else {
                                                    iM2567 = (C2105.m6981("֨֨") + i9) * 119;
                                                    i11 = ((iM2567 ^ i10) * (-29841)) ^ (-2095069247);
                                                    i12 = -110358254;
                                                }
                                                break;
                                            case -261740693:
                                            case 553476642:
                                                if (C3663.f11553) {
                                                    iM2567 = (C2105.m6981("֨֨") + i9) * 119;
                                                    i11 = ((iM2567 ^ i10) * (-29841)) ^ (-2095069247);
                                                    i12 = -110358254;
                                                } else {
                                                    iM2567 = C0630.m2566("ۙ᩺") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * 20095) ^ (-186558953);
                                                    i12 = 1610448554;
                                                }
                                                break;
                                            case -121182294:
                                            case 1470608052:
                                                if (C3019.m9255() <= 0) {
                                                    iM2567 = (C0630.m2566("᩺ܽ") + i10) * (-27);
                                                    i11 = ((iM2567 ^ i9) * 29473) ^ 1926729525;
                                                    i12 = -693673979;
                                                } else {
                                                    iM2567 = (i9 - C0630.m2566("᩺ۤ")) * (-111);
                                                    i11 = ((iM2567 ^ i10) * (-25823)) ^ 1301338712;
                                                    i12 = 1429358867;
                                                }
                                                break;
                                            case 1065307498:
                                            case 1282122491:
                                                if (C0630.f2410 <= 0) {
                                                    iM2567 = (C2105.m6981("᩻ۛ") + i10) * (-105);
                                                    i11 = ((iM2567 ^ i9) * 1779) ^ 2054086081;
                                                    i12 = 286915259;
                                                } else {
                                                    iM2567 = (C2105.m6981("֨֨") + i9) * 119;
                                                    i11 = ((iM2567 ^ i10) * (-29841)) ^ (-2095069247);
                                                    i12 = -110358254;
                                                }
                                                break;
                                            case 1330732747:
                                            case 1549665443:
                                                if (C0382.f1805) {
                                                    iM2567 = C2105.m6981("ۤ۠") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-7589)) ^ (-1349042221);
                                                    i12 = 1897705480;
                                                } else {
                                                    iM2567 = (C2105.m6981("᩻ۛ") + i10) * (-105);
                                                    i11 = ((iM2567 ^ i9) * 1779) ^ 2054086081;
                                                    i12 = 286915259;
                                                }
                                                break;
                                            case 1379001837:
                                            case 1926107680:
                                                if (C2958.m9034() <= 0) {
                                                    iM2567 = (C2105.m6981("᩻ۛ") + i10) * (-105);
                                                    i11 = ((iM2567 ^ i9) * 1779) ^ 2054086081;
                                                    i12 = 286915259;
                                                } else {
                                                    iM2567 = C0630.m2566("ܿۘ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * 7885) ^ 561556386;
                                                    i12 = 2061843738;
                                                }
                                                break;
                                            default:
                                                if (C1773.f6144 <= 0) {
                                                    iM2567 = (i9 - C0630.m2566("᩺᩷")) * 41;
                                                    i11 = ((iM2567 ^ i10) * (-26173)) ^ 444231420;
                                                    i12 = 931375143;
                                                } else {
                                                    iM2567 = (C2105.m6981("۫ᩳ") ^ i10) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                    i11 = ((iM2567 ^ i9) * 20483) ^ 908647487;
                                                    i12 = -2007384018;
                                                }
                                                break;
                                        }
                                    }
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C2533 c2533 = null;
                                    int i8 = 997928803;
                                    int i9 = C3537.f11231;
                                    int i10 = C4616.f14690;
                                    int iM2567 = (C0630.m2566("ۖۨ") ^ i9) * 3;
                                    int i11 = ((iM2567 ^ i10) * (-4135)) ^ (-1062935443);
                                    int i12 = 1332831605;
                                    while (true) {
                                        i8 = ((((i8 ^ i10) * (-519)) >> 31) & i11) ^ (iM2567 ^ i12);
                                        switch (i8) {
                                            case -2072087855:
                                            case 500662925:
                                                if (C3245.m9925() != 0) {
                                                    iM2567 = C2105.m6981("ᩴܶ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * 29349) ^ (-1257351313);
                                                    i12 = 2131327975;
                                                } else {
                                                    iM2567 = (C0630.m2566("۟ۖ") ^ i10) * (-73);
                                                    i11 = ((iM2567 ^ i9) * (-20991)) ^ (-854542879);
                                                    i12 = 1960252061;
                                                }
                                                break;
                                            case -1955493777:
                                            case 654285568:
                                                if (AbstractC2021.f6743 <= 0) {
                                                    iM2567 = (C2105.m6981("֨ۗ") ^ i10) * 11;
                                                    i11 = ((iM2567 ^ i9) * 19445) ^ 668004795;
                                                    i12 = -1864318039;
                                                } else {
                                                    iM2567 = C2105.m6981("ۤ۬") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * (-8595)) ^ 1583941466;
                                                    i12 = -2098407048;
                                                }
                                                break;
                                            case -1912701316:
                                            case 923473353:
                                                RunnableC3474.m10618(c2533);
                                                if (C4117.f13076 > 0) {
                                                    C4611 c4612 = c2533.f8046;
                                                    AbstractC15440 abstractC15441 = abstractC15440;
                                                    if (C3663.m11168() < 0) {
                                                        new C8177(abstractC15441, abstractActivityC3346, c4612);
                                                    }
                                                    iM2567 = C2105.m6981("ܰۡ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * 15153) ^ (-1278225920);
                                                    i12 = -1247874444;
                                                } else {
                                                    iM2567 = (i10 - C0630.m2566("᩻ۚ")) * (-7);
                                                    i11 = ((iM2567 ^ i9) * 15731) ^ (-244406528);
                                                    i12 = -582518886;
                                                }
                                                break;
                                            case -1537746128:
                                            case 473788080:
                                                c2533 = this.f76747;
                                                if (C3683.m11222()) {
                                                    iM2567 = (C2105.m6981("֨ۗ") ^ i10) * 11;
                                                    i11 = ((iM2567 ^ i9) * 19445) ^ 668004795;
                                                    i12 = -1864318039;
                                                } else {
                                                    iM2567 = (C0630.m2566("ۙۧ") ^ i9) * 127;
                                                    i11 = ((iM2567 ^ i10) * (-6463)) ^ (-361850135);
                                                    i12 = 1010487125;
                                                }
                                                break;
                                            case -1363981073:
                                            case 367765096:
                                                C21923.m49329();
                                                break;
                                            case -728223356:
                                            case 612988965:
                                                if (C2272.f7362) {
                                                    iM2567 = C2105.m6981("ܰۡ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * 15153) ^ (-1278225920);
                                                    i12 = -1247874444;
                                                } else {
                                                    iM2567 = C2105.m6981("֨ۘ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * (-22351)) ^ 1873691846;
                                                    i12 = -865191689;
                                                }
                                                break;
                                            case -367111588:
                                            case 518163316:
                                                C1128.m3851();
                                                if (ViewOnClickListenerC1958.f6529 > 0) {
                                                    iM2567 = (C2105.m6981("֨ۗ") ^ i10) * 11;
                                                    i11 = ((iM2567 ^ i9) * 19445) ^ 668004795;
                                                    i12 = -1864318039;
                                                } else {
                                                    iM2567 = C2105.m6981("ᩴܶ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * 29349) ^ (-1257351313);
                                                    i12 = 2131327975;
                                                }
                                                break;
                                            case 500163268:
                                            case 1680284559:
                                                C0237.m1481();
                                                if (C0630.f2410 <= 0) {
                                                    iM2567 = (C2105.m6981("ܰܳ") + i10) * 39;
                                                    i11 = ((iM2567 ^ i9) * 27209) ^ 329605791;
                                                    i12 = 215985129;
                                                } else {
                                                    iM2567 = (C2105.m6981("֨ۗ") ^ i10) * 11;
                                                    i11 = ((iM2567 ^ i9) * 19445) ^ 668004795;
                                                    i12 = -1864318039;
                                                }
                                                break;
                                            case 616517912:
                                            case 979166909:
                                                if (RunnableC1937.f6483 >= 0) {
                                                    iM2567 = C2105.m6981("ܰۡ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * 15153) ^ (-1278225920);
                                                    i12 = -1247874444;
                                                } else {
                                                    iM2567 = (C2105.m6981("۠ۧ") ^ i9) * 5;
                                                    i11 = ((iM2567 ^ i10) * (-17101)) ^ 687652892;
                                                    i12 = 1114287761;
                                                }
                                                break;
                                            case 690895359:
                                            case 1523302160:
                                                if (C3683.f11629 >= 0) {
                                                    iM2567 = (i10 - C0630.m2566("᩻ۚ")) * (-7);
                                                    i11 = ((iM2567 ^ i9) * 15731) ^ (-244406528);
                                                    i12 = -582518886;
                                                } else {
                                                    iM2567 = C0630.m2566("ܰ֡") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * SecP192K1Field.PInv33) ^ (-428695630);
                                                    i12 = 36848276;
                                                }
                                                break;
                                            case 766836067:
                                            case 1783198474:
                                                if (!C0630.m2564()) {
                                                    iM2567 = C2105.m6981("ܰۡ") ^ i9;
                                                    i11 = ((iM2567 ^ i10) * 15153) ^ (-1278225920);
                                                    i12 = -1247874444;
                                                } else {
                                                    iM2567 = (C2105.m6981("֨ۗ") ^ i10) * 11;
                                                    i11 = ((iM2567 ^ i9) * 19445) ^ 668004795;
                                                    i12 = -1864318039;
                                                }
                                                break;
                                            case 988627436:
                                            case 1415047436:
                                                C4159.m12565();
                                                iM2567 = C2105.m6981("ᩴܶ") ^ i9;
                                                i11 = ((iM2567 ^ i10) * 29349) ^ (-1257351313);
                                                i12 = 2131327975;
                                                break;
                                            case 1560135634:
                                            case 2037159410:
                                                if (C3245.f10203 <= 0) {
                                                    iM2567 = (C2105.m6981("ܰܳ") + i10) * 39;
                                                    i11 = ((iM2567 ^ i9) * 27209) ^ 329605791;
                                                    i12 = 215985129;
                                                } else {
                                                    iM2567 = C0630.m2566("᩶ۘ") ^ i10;
                                                    i11 = ((iM2567 ^ i9) * 25239) ^ (-1071828617);
                                                    i12 = -1379308147;
                                                }
                                                break;
                                            default:
                                                if (C2958.f9394 >= 0) {
                                                    iM2567 = (i10 - C0630.m2566("᩻ۚ")) * (-7);
                                                    i11 = ((iM2567 ^ i9) * 15731) ^ (-244406528);
                                                    i12 = -582518886;
                                                } else {
                                                    iM2567 = (i9 - C2105.m6981("ۨܳ")) * (-123);
                                                    i11 = ((iM2567 ^ i10) * (-10879)) ^ 2124314651;
                                                    i12 = 1173225097;
                                                }
                                                break;
                                        }
                                        return;
                                    }
                                }
                            });
                            if (C3019.m9255() > 0) {
                                textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۜ۫ܽ
                                    {
                                        int i8 = -839190137;
                                        int i9 = C4117.f13076;
                                        int i10 = C0050.f910;
                                        int iM2567 = (C0630.m2566("۬᩸") + i9) * 29;
                                        int i11 = ((iM2567 ^ i10) * 31155) ^ 1743456147;
                                        int i12 = 1288106141;
                                        while (true) {
                                            i8 = ((((i8 ^ i10) * (-11029)) >> 31) & i11) ^ (iM2567 ^ i12);
                                            switch (i8) {
                                                case -2021928333:
                                                case 2044253136:
                                                    if (C1711.f5919) {
                                                        iM2567 = C2105.m6981("᩹᩷") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-27591)) ^ 1437511981;
                                                        i12 = -1648458750;
                                                    } else {
                                                        iM2567 = C0630.m2566("ۤ֫") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-14649)) ^ 1652508517;
                                                        i12 = 1164896984;
                                                    }
                                                    break;
                                                case -1741216806:
                                                case -1217160659:
                                                    if (C0630.f2410 <= 0) {
                                                        iM2567 = C2105.m6981("ۗۗ") ^ i10;
                                                        i11 = ((iM2567 ^ i9) * 10801) ^ (-1890902716);
                                                        i12 = -1235052423;
                                                    } else {
                                                        iM2567 = C2105.m6981("ۡۧ") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-10427)) ^ (-769975691);
                                                        i12 = 176684248;
                                                    }
                                                    break;
                                                case -1732841871:
                                                case 1656734129:
                                                    if (C0798.f2919) {
                                                        iM2567 = C2105.m6981("᩹᩷") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-27591)) ^ 1437511981;
                                                        i12 = -1648458750;
                                                    } else {
                                                        iM2567 = (C2105.m6981("ۧ᩸") ^ i10) * 5;
                                                        i11 = ((iM2567 ^ i9) * 3129) ^ (-1073308771);
                                                        i12 = -951913447;
                                                    }
                                                    break;
                                                case -1662671184:
                                                case 329755448:
                                                    if (C0714.f2697 >= 0) {
                                                        iM2567 = C2105.m6981("᩹᩷") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-27591)) ^ 1437511981;
                                                        i12 = -1648458750;
                                                    } else {
                                                        iM2567 = (C2105.m6981("۫ܳ") + i10) * 13;
                                                        i11 = ((iM2567 ^ i9) * (-2315)) ^ (-1155754922);
                                                        i12 = -1678207486;
                                                    }
                                                    break;
                                                case -1649364951:
                                                case -1317979522:
                                                    ServiceConnectionC3453.m10564();
                                                    C0630.m2564();
                                                    throw new RuntimeException();
                                                case -1625103515:
                                                case -20085279:
                                                    if (C3663.m11168() >= 0) {
                                                        iM2567 = C2105.m6981("᩹᩷") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-27591)) ^ 1437511981;
                                                        i12 = -1648458750;
                                                    } else {
                                                        iM2567 = C2105.m6981("᩺᩺") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * 22529) ^ (-312227988);
                                                        i12 = -830719082;
                                                    }
                                                    break;
                                                case -1551006246:
                                                case 1254580178:
                                                    if (C3537.f11231 >= 0) {
                                                        iM2567 = C2105.m6981("᩹᩷") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-27591)) ^ 1437511981;
                                                        i12 = -1648458750;
                                                    } else {
                                                        iM2567 = (i10 - C2105.m6981("ۧ᩷")) * 27;
                                                        i11 = ((iM2567 ^ i9) * (-5315)) ^ 1467612689;
                                                        i12 = 337740135;
                                                    }
                                                    break;
                                                case -1241772330:
                                                case -1033075572:
                                                    C3537.m10746();
                                                    if (!C0382.f1805) {
                                                        iM2567 = C2105.m6981("᩹᩷") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-27591)) ^ 1437511981;
                                                        i12 = -1648458750;
                                                    } else {
                                                        iM2567 = C2105.m6981("ۗۗ") ^ i10;
                                                        i11 = ((iM2567 ^ i9) * 10801) ^ (-1890902716);
                                                        i12 = -1235052423;
                                                    }
                                                    break;
                                                case -881569349:
                                                case 1422345588:
                                                    C1294.m4372();
                                                    C3019.m9255();
                                                    iM2567 = (i10 - C2105.m6981("ۧ᩷")) * 27;
                                                    i11 = ((iM2567 ^ i9) * (-5315)) ^ 1467612689;
                                                    i12 = 337740135;
                                                    break;
                                                case -611708445:
                                                case 1423059796:
                                                    return;
                                                case -427666836:
                                                case 1863132841:
                                                    if (C1420.f5096 <= 0) {
                                                        iM2567 = C2105.m6981("ᩳ᩻") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * 21649) ^ 1088485790;
                                                        i12 = -482944487;
                                                    } else {
                                                        iM2567 = C2105.m6981("ۗۗ") ^ i10;
                                                        i11 = ((iM2567 ^ i9) * 10801) ^ (-1890902716);
                                                        i12 = -1235052423;
                                                    }
                                                    break;
                                                case 450151262:
                                                case 1548663385:
                                                    if (C5695.f17556 >= 0) {
                                                        iM2567 = C2105.m6981("ᩳ᩻") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * 21649) ^ 1088485790;
                                                        i12 = -482944487;
                                                    } else {
                                                        iM2567 = (i10 - C2105.m6981("ۤۚ")) * (-9);
                                                        i11 = ((iM2567 ^ i9) * (-31541)) ^ (-468794360);
                                                        i12 = -2128913434;
                                                    }
                                                    break;
                                                case 679433787:
                                                case 847191099:
                                                    if (C0050.f910 >= 0) {
                                                        iM2567 = C2105.m6981("ᩳ᩻") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * 21649) ^ 1088485790;
                                                        i12 = -482944487;
                                                    } else {
                                                        iM2567 = (C0630.m2566("᩸ۗ") + i10) * 55;
                                                        i11 = ((iM2567 ^ i9) * (-20575)) ^ 1146943586;
                                                        i12 = 838066006;
                                                    }
                                                    break;
                                                case 1335175253:
                                                case 1764509107:
                                                    if (C2105.f7037 != 0) {
                                                        iM2567 = C2105.m6981("ۗۗ") ^ i10;
                                                        i11 = ((iM2567 ^ i9) * 10801) ^ (-1890902716);
                                                        i12 = -1235052423;
                                                    } else {
                                                        iM2567 = (C2105.m6981("ۛ᩹") + i9) * 5;
                                                        i11 = ((iM2567 ^ i10) * 23951) ^ (-847235591);
                                                        i12 = -787969571;
                                                    }
                                                    break;
                                                case 1627142628:
                                                case 1910390963:
                                                    if (C1504.f5354) {
                                                        iM2567 = C2105.m6981("᩹᩷") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-27591)) ^ 1437511981;
                                                        i12 = -1648458750;
                                                    } else {
                                                        iM2567 = (i10 - C2105.m6981("۫ۜ")) * 53;
                                                        i11 = ((iM2567 ^ i9) * (-26181)) ^ 778229090;
                                                        i12 = -1129253652;
                                                    }
                                                    break;
                                                default:
                                                    if (C4117.m12364() != 0) {
                                                        iM2567 = (i9 - C0630.m2566("֫ۚ")) * (-115);
                                                        i11 = ((iM2567 ^ i10) * 24421) ^ (-1672852838);
                                                        i12 = 1825353617;
                                                    } else {
                                                        iM2567 = (C0630.m2566("֫ۨ") + i9) * 109;
                                                        i11 = ((iM2567 ^ i10) * (-7175)) ^ 380125296;
                                                        i12 = 799967255;
                                                    }
                                                    break;
                                            }
                                        }
                                    }

                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view) {
                                        Exception exc2 = null;
                                        Object obj = null;
                                        int i8 = -1814901657;
                                        int i9 = C1128.f4106;
                                        int i10 = ViewOnClickListenerC1958.f6529;
                                        int iM2567 = (i9 - C0630.m2566("᩸ۤ")) * 93;
                                        int i11 = ((iM2567 ^ i10) * 18985) ^ (-715208109);
                                        int i12 = 804663817;
                                        while (true) {
                                            i8 = ((((i8 ^ i10) * (-17105)) >> 31) & i11) ^ (iM2567 ^ i12);
                                            switch (i8) {
                                                case -2124047921:
                                                case 26069568:
                                                    if (C3663.f11553) {
                                                        iM2567 = (C2105.m6981("ۨܽ") ^ i9) * (-11);
                                                        i11 = ((iM2567 ^ i10) * (-31971)) ^ (-331787048);
                                                        i12 = 658775549;
                                                    } else {
                                                        iM2567 = (C0630.m2566("᩵ܿ") ^ i10) * 65;
                                                        i11 = ((iM2567 ^ i9) * (-16669)) ^ (-560260601);
                                                        i12 = 843715796;
                                                    }
                                                    break;
                                                case -2062645572:
                                                case -321372102:
                                                    C3746.m11369();
                                                    RunnableC3474.m10630();
                                                    return false;
                                                case -2031676725:
                                                case 1528842981:
                                                    C1005.m3501();
                                                    if (C0237.f1507 == 0) {
                                                        iM2567 = (i9 - C0630.m2566("᩹֡")) * (-107);
                                                        i11 = ((iM2567 ^ i10) * 155) ^ 2069658930;
                                                        i12 = -819071832;
                                                    } else {
                                                        iM2567 = C0630.m2566("᩵᩹") ^ i10;
                                                        i11 = ((iM2567 ^ i9) * 19833) ^ (-21938293);
                                                        i12 = -1920246786;
                                                    }
                                                    break;
                                                case -2023198036:
                                                case 2043830522:
                                                    if (C22628.m50615() != 0) {
                                                        iM2567 = (i10 - C0630.m2566("ܶᩴ")) * (-37);
                                                        i11 = ((iM2567 ^ i9) * (-23117)) ^ (-1262289761);
                                                        i12 = -1914884314;
                                                    } else {
                                                        iM2567 = C2105.m6981("ۤ۬") ^ i10;
                                                        i11 = ((iM2567 ^ i9) * 18957) ^ (-1615754108);
                                                        i12 = -716775056;
                                                    }
                                                    break;
                                                case -2016642226:
                                                case -1971549070:
                                                    C0237.m1481();
                                                    if (C0050.f910 >= 0) {
                                                        iM2567 = (i10 - C0630.m2566("ܶᩴ")) * (-37);
                                                        i11 = ((iM2567 ^ i9) * (-23117)) ^ (-1262289761);
                                                        i12 = -1914884314;
                                                    } else {
                                                        iM2567 = C0630.m2566("᩵᩹") ^ i10;
                                                        i11 = ((iM2567 ^ i9) * 19833) ^ (-21938293);
                                                        i12 = -1920246786;
                                                    }
                                                    break;
                                                case -1951885037:
                                                case 914392987:
                                                    if (C4075.m12263() <= 0) {
                                                        iM2567 = C0630.m2566("ۖۢ") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-4713)) ^ 897139497;
                                                        i12 = -2097655434;
                                                    } else {
                                                        iM2567 = C2105.m6981("ۜۧ") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-30975)) ^ (-905791966);
                                                        i12 = 1901509817;
                                                    }
                                                    break;
                                                case -1826589297:
                                                case 452050913:
                                                    if (C0964.f3626 != 0) {
                                                        iM2567 = (i9 - C0630.m2566("᩹֡")) * (-107);
                                                        i11 = ((iM2567 ^ i10) * 155) ^ 2069658930;
                                                        i12 = -819071832;
                                                    } else {
                                                        iM2567 = C2105.m6981("ܶ᩹") ^ i10;
                                                        i11 = ((iM2567 ^ i9) * 19351) ^ 322631980;
                                                        i12 = -544487641;
                                                    }
                                                    break;
                                                case -1485313607:
                                                case -407042748:
                                                    if (C1005.f3721) {
                                                        iM2567 = C2105.m6981("ۙ֫") ^ i10;
                                                        i11 = ((iM2567 ^ i9) * 30243) ^ (-116119601);
                                                        i12 = 1753106899;
                                                    } else {
                                                        iM2567 = (C2105.m6981("ۨܽ") ^ i9) * (-11);
                                                        i11 = ((iM2567 ^ i10) * (-31971)) ^ (-331787048);
                                                        i12 = 658775549;
                                                    }
                                                    break;
                                                case -1361274425:
                                                case -278033489:
                                                    obj = null;
                                                    if (C4117.f13076 <= 0) {
                                                        iM2567 = C0630.m2566("ۖۢ") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-4713)) ^ 897139497;
                                                        i12 = -2097655434;
                                                    } else {
                                                        iM2567 = (i10 - C0630.m2566("ܽۤ")) * 51;
                                                        i11 = ((iM2567 ^ i9) * 19163) ^ 249684587;
                                                        i12 = -545644167;
                                                    }
                                                    break;
                                                case -1123553496:
                                                case -1044610601:
                                                    if (ServiceConnectionC3453.m10564() > 0) {
                                                        iM2567 = C0630.m2566("᩵᩹") ^ i10;
                                                        i11 = ((iM2567 ^ i9) * 19833) ^ (-21938293);
                                                        i12 = -1920246786;
                                                    } else {
                                                        iM2567 = (C2105.m6981("ۨܽ") ^ i9) * (-11);
                                                        i11 = ((iM2567 ^ i10) * (-31971)) ^ (-331787048);
                                                        i12 = 658775549;
                                                    }
                                                    break;
                                                case -863376367:
                                                case 1845649993:
                                                    if (C0237.f1507 != 0) {
                                                        iM2567 = (C2105.m6981("ۨܽ") ^ i9) * (-11);
                                                        i11 = ((iM2567 ^ i10) * (-31971)) ^ (-331787048);
                                                        i12 = 658775549;
                                                    } else {
                                                        iM2567 = (C0630.m2566("ۡܶ") + i9) * 31;
                                                        i11 = ((iM2567 ^ i10) * (-28551)) ^ (-2064717548);
                                                        i12 = -1216617624;
                                                    }
                                                    break;
                                                case -773908315:
                                                case 960237413:
                                                    if (C7106.f21815 != 0) {
                                                        iM2567 = C0630.m2566("ۖۢ") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-4713)) ^ 897139497;
                                                        i12 = -2097655434;
                                                    } else {
                                                        iM2567 = C0630.m2566("ۨ᩹") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-17837)) ^ (-1061276988);
                                                        i12 = -1683717418;
                                                    }
                                                    break;
                                                case -643059347:
                                                case 1111622117:
                                                    RunnableC1937.m6387();
                                                    iM2567 = (C2105.m6981("ۨܽ") ^ i9) * (-11);
                                                    i11 = ((iM2567 ^ i10) * (-31971)) ^ (-331787048);
                                                    i12 = 658775549;
                                                    break;
                                                case 409910814:
                                                case 1012741142:
                                                    exc2 = exc;
                                                    if (C2958.f9394 >= 0) {
                                                        iM2567 = C0630.m2566("ۖۢ") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-4713)) ^ 897139497;
                                                        i12 = -2097655434;
                                                    } else {
                                                        iM2567 = (C0630.m2566("ᩴ۟") ^ i9) * 127;
                                                        i11 = ((iM2567 ^ i10) * (-28537)) ^ 973960590;
                                                        i12 = -1781805670;
                                                    }
                                                    break;
                                                case 496075433:
                                                case 1635790922:
                                                    ServiceConnectionC3453.m10561(abstractActivityC3346, exc2, obj);
                                                    return true;
                                                default:
                                                    if (AbstractC2021.f6743 <= 0) {
                                                        iM2567 = C0630.m2566("ۖۢ") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * (-4713)) ^ 897139497;
                                                        i12 = -2097655434;
                                                    } else {
                                                        iM2567 = C2105.m6981("᩹᩵") ^ i9;
                                                        i11 = ((iM2567 ^ i10) * 28719) ^ 1763713360;
                                                        i12 = -281391728;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                });
                            }
                            iM6981 = (C2105.m6981("۟ܿ") + i4) * 99;
                            i5 = ((iM6981 ^ i3) * (-31171)) ^ 1117643921;
                            i = 1819187678;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 265215880:
                    case 964737330:
                        if (this.f8051) {
                            iM6981 = (C0630.m2566("ۢܺ") + i3) * (-7);
                            i5 = ((iM6981 ^ i4) * (-31219)) ^ (-1658985974);
                            i = -1259600913;
                        } else {
                            iM6981 = (i3 - C0630.m2566("ܰܺ")) * 33;
                            i5 = ((iM6981 ^ i4) * (-18113)) ^ 293026248;
                            i = -1680225649;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 515609292:
                    case 2080051480:
                        C1047.m3601(textView, C0422.m1959(exc));
                        if (C22628.m50615() != 0) {
                            iM6981 = (C2105.m6981("۟ܿ") + i4) * 99;
                            i5 = ((iM6981 ^ i3) * (-31171)) ^ 1117643921;
                            i = 1819187678;
                        } else {
                            iM6981 = C2105.m6981("ۡ֨") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-7311)) ^ 1807794365;
                            i = -2052361957;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    default:
                        C4159.m12565();
                        if (C3911.m11924() > 0) {
                        }
                        iM6981 = (i3 - C2105.m6981("ܿ۬")) * (-23);
                        i5 = ((iM6981 ^ i4) * 28229) ^ 862071740;
                        i = -152228843;
                        i7 = iM6981 ^ i;
                        break;
                }
                return;
            }
            iM2566 = C2105.m6981("ܺ᩻") ^ i4;
            i5 = ((iM2566 ^ i3) * 1017) ^ 1345369806;
            i6 = -1212534277;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        boolean z = false;
        final AbstractC15440 abstractC15440 = null;
        C1315 c1315 = null;
        String str = null;
        Object objM4553 = null;
        C4611 c4611 = null;
        int i = 1780371760;
        int i2 = C3746.f11829;
        int i3 = C2958.f9394;
        int iM6981 = C2105.m6981("ܳۙ") ^ i2;
        int i4 = ((iM6981 ^ i3) * 30165) ^ 302533266;
        int i5 = -538102292;
        while (true) {
            int i6 = iM6981 ^ i5;
            while (true) {
                i = ((((i ^ i3) * 31123) >> 31) & i4) ^ i6;
                switch (i) {
                    case -2082493100:
                    case 1895378600:
                        objM4553 = c1315.m4553(str);
                        if (RunnableC0588.f2309 < 0) {
                            iM6981 = (C0630.m2566("ۢۢ") + i2) * (-61);
                            i4 = ((iM6981 ^ i3) * (-12541)) ^ 471886238;
                            i5 = 542235101;
                        } else {
                            iM6981 = C2105.m6981("ۡۤ") ^ i3;
                            i4 = ((iM6981 ^ i2) * 2907) ^ (-1385819945);
                            i5 = 2054195752;
                        }
                        break;
                    case -1890415460:
                    case 1149685120:
                        C21923.m49329();
                        if (C3019.f9544 < 0) {
                            iM6981 = C2105.m6981("۟ۙ") ^ i2;
                            i4 = ((iM6981 ^ i3) * (-23183)) ^ 1059833530;
                            i5 = 1416163598;
                        } else {
                            iM6981 = (C2105.m6981("ۙܺ") ^ i2) * 23;
                            i4 = ((iM6981 ^ i3) * 14419) ^ (-1542386614);
                            i5 = 224955480;
                        }
                        break;
                    case -1841302300:
                    case 1321906797:
                        if (!this.f8046.m13537()) {
                            iM6981 = (i3 - C0630.m2566("۟֨")) * (-51);
                            i4 = ((iM6981 ^ i2) * (-8385)) ^ (-1031883422);
                            i5 = -877292942;
                        } else {
                            iM6981 = (C2105.m6981("᩻᩸") + i2) * (-113);
                            i4 = ((iM6981 ^ i3) * 21557) ^ 1976003097;
                            i5 = 1336019132;
                        }
                        break;
                    case -1523344940:
                    case 372574009:
                        if (C3537.f11231 < 0) {
                            iM6981 = (C2105.m6981("۠᩺") ^ i3) * (-63);
                            i4 = ((iM6981 ^ i2) * (-5063)) ^ (-893796893);
                            i5 = -869433827;
                        } else {
                            iM6981 = C2105.m6981("ۡۡ") ^ i2;
                            i4 = ((iM6981 ^ i3) * (-10555)) ^ 668131037;
                            i5 = -735100996;
                        }
                        break;
                    case -1488176871:
                    case -1187734769:
                        z = this.f8049;
                        if (!z) {
                            iM6981 = (C0630.m2566("ܰ᩸") ^ i2) * 109;
                            i4 = ((iM6981 ^ i3) * (-26993)) ^ 1995445337;
                            i5 = 395254983;
                        } else {
                            iM6981 = C2105.m6981("᩶֡") ^ i3;
                            i4 = ((iM6981 ^ i2) * 28787) ^ (-616744449);
                            i5 = -1352505506;
                        }
                        break;
                    case -1292457095:
                    case 816686270:
                        if (C3432.f10845 < 0) {
                            iM6981 = C2105.m6981("ۡۤ") ^ i3;
                            i4 = ((iM6981 ^ i2) * 2907) ^ (-1385819945);
                            i5 = 2054195752;
                            break;
                        }
                        iM6981 = C2105.m6981("۟ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23183)) ^ 1059833530;
                        i5 = 1416163598;
                        break;
                    case -1200871356:
                    case 1582628850:
                        this.f8046 = (C4611) objM4553;
                        iM6981 = (C0630.m2566("ܰ᩸") ^ i2) * 109;
                        i4 = ((iM6981 ^ i3) * (-26993)) ^ 1995445337;
                        i5 = 395254983;
                        break;
                    case -1127966005:
                    case -510684700:
                        if (!z) {
                            iM6981 = C2105.m6981("ᩴᩳ") ^ i3;
                            i4 = ((iM6981 ^ i2) * 151) ^ (-1195467511);
                            i5 = -38995138;
                        } else {
                            iM6981 = (C2105.m6981("ۡ֡") + i2) * (-119);
                            i4 = ((iM6981 ^ i3) * 6103) ^ (-1193090915);
                            i5 = 1288431335;
                        }
                        break;
                    case -1028212634:
                    case 1514374178:
                        c1315 = C8177.f25172;
                        str = this.f8047;
                        if (C3746.f11829 > 0) {
                            iM6981 = (C2105.m6981("֨۬") ^ i3) * q.h;
                            i4 = ((iM6981 ^ i2) * (-1357)) ^ 1043817439;
                            i5 = 1477499195;
                        } else {
                            iM6981 = C2105.m6981("ۡۡ") ^ i2;
                            i4 = ((iM6981 ^ i3) * (-10555)) ^ 668131037;
                            i5 = -735100996;
                        }
                        break;
                    case -945696161:
                    case 820294052:
                        C3019.m9255();
                        break;
                    case -687685022:
                    case -75433114:
                        final TextView textView = this.f8042;
                        if (C2958.f9394 < 0) {
                            final AbstractActivityC3346 abstractActivityC3346 = this.f8043;
                            if (C7811.f24123 < 0) {
                                C3911.m11926(new Runnable(this) { // from class: l.ۡ۫ܽ

                                    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                                    public final /* synthetic */ C2533 f27038;

                                    {
                                        int i7 = -1178601227;
                                        int i8 = C0630.f2410;
                                        int i9 = C7811.f24123;
                                        int iM2566 = (C0630.m2566("᩸ܽ") + i8) * 89;
                                        int i10 = ((iM2566 ^ i9) * (-21763)) ^ 1862528127;
                                        int i11 = -1077216752;
                                        while (true) {
                                            i7 = ((((i7 ^ i9) * 29887) >> 31) & i10) ^ (iM2566 ^ i11);
                                            switch (i7) {
                                                case -1998947808:
                                                case 1462311654:
                                                    if (RunnableC1937.m6387() != 0) {
                                                        iM2566 = C0630.m2566("ۗܺ") ^ i8;
                                                        i10 = ((iM2566 ^ i9) * 25537) ^ 1789064219;
                                                        i11 = 1640474149;
                                                    } else {
                                                        iM2566 = (C0630.m2566("᩻ۡ") ^ i8) * (-119);
                                                        i10 = ((iM2566 ^ i9) * (-6163)) ^ (-80901058);
                                                        i11 = -1750010938;
                                                    }
                                                    break;
                                                case -1723944963:
                                                case -963268265:
                                                    C0630.m2564();
                                                    if (C3537.f11231 >= 0) {
                                                        iM2566 = (C0630.m2566("᩵ۢ") ^ i8) * (-75);
                                                        i10 = ((iM2566 ^ i9) * 7553) ^ 1342735936;
                                                        i11 = -1364711614;
                                                    } else {
                                                        iM2566 = C2105.m6981("᩺۬") ^ i9;
                                                        i10 = ((iM2566 ^ i8) * 3911) ^ (-306932261);
                                                        i11 = -2092544630;
                                                    }
                                                    break;
                                                case -1490999474:
                                                case -1260191635:
                                                    if (ServiceConnectionC3453.f10921 >= 0) {
                                                        iM2566 = C2105.m6981("᩺۬") ^ i9;
                                                        i10 = ((iM2566 ^ i8) * 3911) ^ (-306932261);
                                                        i11 = -2092544630;
                                                    } else {
                                                        iM2566 = C2105.m6981("ۖ۠") ^ i9;
                                                        i10 = ((iM2566 ^ i8) * 3327) ^ (-1089847565);
                                                        i11 = -421984917;
                                                    }
                                                    break;
                                                case -1216213010:
                                                case -253130084:
                                                    if (C0050.f910 >= 0) {
                                                        iM2566 = C2105.m6981("᩺۬") ^ i9;
                                                        i10 = ((iM2566 ^ i8) * 3911) ^ (-306932261);
                                                        i11 = -2092544630;
                                                    } else {
                                                        iM2566 = C0630.m2566("᩷ܽ") ^ i9;
                                                        i10 = ((iM2566 ^ i8) * (-8171)) ^ 693385576;
                                                        i11 = -1709433691;
                                                    }
                                                    break;
                                                case -1007097531:
                                                case -568622011:
                                                    if (!C4159.f13567) {
                                                        iM2566 = C2105.m6981("᩺۬") ^ i9;
                                                        i10 = ((iM2566 ^ i8) * 3911) ^ (-306932261);
                                                        i11 = -2092544630;
                                                    } else {
                                                        iM2566 = C0630.m2566("ۤᩴ") ^ i9;
                                                        i10 = ((iM2566 ^ i8) * (-26477)) ^ (-1985528082);
                                                        i11 = -1060695647;
                                                    }
                                                    break;
                                                case -693568108:
                                                case 1287847796:
                                                    if (C11340.f33930 >= 0) {
                                                        iM2566 = C2105.m6981("ۧ۫") ^ i8;
                                                        i10 = ((iM2566 ^ i9) * 2777) ^ (-1407376201);
                                                        i11 = -1014064033;
                                                    } else {
                                                        iM2566 = (i8 - C2105.m6981("ܳۤ")) * (-117);
                                                        i10 = ((iM2566 ^ i9) * (-25487)) ^ (-725903926);
                                                        i11 = -535130138;
                                                    }
                                                    break;
                                                case -386905697:
                                                case 737141316:
                                                    if (C3683.f11629 >= 0) {
                                                        iM2566 = C0630.m2566("ۤᩴ") ^ i9;
                                                        i10 = ((iM2566 ^ i8) * (-26477)) ^ (-1985528082);
                                                        i11 = -1060695647;
                                                    } else {
                                                        iM2566 = (C2105.m6981("ۡ᩻") ^ i8) * 95;
                                                        i10 = ((iM2566 ^ i9) * (-12143)) ^ 224489592;
                                                        i11 = -265814456;
                                                    }
                                                    break;
                                                case -297327161:
                                                case 1467458508:
                                                    if (RunnableC3474.f10992 <= 0) {
                                                        iM2566 = (C0630.m2566("᩵ۢ") ^ i8) * (-75);
                                                        i10 = ((iM2566 ^ i9) * 7553) ^ 1342735936;
                                                        i11 = -1364711614;
                                                    } else {
                                                        iM2566 = (C2105.m6981("ۚۘ") ^ i8) * 49;
                                                        i10 = ((iM2566 ^ i9) * (-19371)) ^ (-2031591096);
                                                        i11 = -56939082;
                                                    }
                                                    break;
                                                case -269211110:
                                                case 1935612543:
                                                    if (C0630.f2410 <= 0) {
                                                        iM2566 = C2105.m6981("ۧ۫") ^ i8;
                                                        i10 = ((iM2566 ^ i9) * 2777) ^ (-1407376201);
                                                        i11 = -1014064033;
                                                    } else {
                                                        iM2566 = C0630.m2566("᩸ܳ") ^ i9;
                                                        i10 = ((iM2566 ^ i8) * 15767) ^ 631424086;
                                                        i11 = -47119992;
                                                    }
                                                    break;
                                                case 426313579:
                                                case 1838236961:
                                                    return;
                                                case 680988409:
                                                case 997691936:
                                                    C1128.m3851();
                                                    C4117.m12364();
                                                    iM2566 = C2105.m6981("᩺۬") ^ i9;
                                                    i10 = ((iM2566 ^ i8) * 3911) ^ (-306932261);
                                                    i11 = -2092544630;
                                                    break;
                                                case 842507170:
                                                case 2103712395:
                                                    if (C0382.m1848()) {
                                                        iM2566 = (C0630.m2566("᩵ۢ") ^ i8) * (-75);
                                                        i10 = ((iM2566 ^ i9) * 7553) ^ 1342735936;
                                                        i11 = -1364711614;
                                                    } else {
                                                        iM2566 = (C2105.m6981("ۜ֡") + i9) * 87;
                                                        i10 = ((iM2566 ^ i8) * 32127) ^ (-755753380);
                                                        i11 = -828426374;
                                                    }
                                                    break;
                                                case 929565891:
                                                case 1350738424:
                                                    this.f27038 = this;
                                                    if (C2272.m7503()) {
                                                        iM2566 = C0630.m2566("ۤᩴ") ^ i9;
                                                        i10 = ((iM2566 ^ i8) * (-26477)) ^ (-1985528082);
                                                        i11 = -1060695647;
                                                    } else {
                                                        iM2566 = (i8 - C2105.m6981("ᩳܳ")) * 9;
                                                        i10 = ((iM2566 ^ i9) * (-22091)) ^ (-2101040084);
                                                        i11 = 1300189149;
                                                    }
                                                    break;
                                                case 1104726854:
                                                case 1294976323:
                                                    if (C0630.f2410 <= 0) {
                                                        iM2566 = C0630.m2566("ۤᩴ") ^ i9;
                                                        i10 = ((iM2566 ^ i8) * (-26477)) ^ (-1985528082);
                                                        i11 = -1060695647;
                                                    } else {
                                                        iM2566 = C2105.m6981("ۜۘ") ^ i9;
                                                        i10 = ((iM2566 ^ i8) * (-9625)) ^ (-1612469458);
                                                        i11 = 1577333793;
                                                    }
                                                    break;
                                                case 1161188827:
                                                case 1899439350:
                                                    if (C21923.f70183 != 0) {
                                                        iM2566 = C0630.m2566("ۗܺ") ^ i8;
                                                        i10 = ((iM2566 ^ i9) * 25537) ^ 1789064219;
                                                        i11 = 1640474149;
                                                    } else {
                                                        iM2566 = C2105.m6981("᩺۬") ^ i9;
                                                        i10 = ((iM2566 ^ i8) * 3911) ^ (-306932261);
                                                        i11 = -2092544630;
                                                    }
                                                    break;
                                                default:
                                                    C4263.m12819();
                                                    throw new RuntimeException();
                                            }
                                        }
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        TextView textView2 = null;
                                        int i7 = 1648396443;
                                        int i8 = C4075.f12947;
                                        int i9 = C3911.f12484;
                                        int iM6982 = C2105.m6981("ܿ۬") ^ i9;
                                        int i10 = ((iM6982 ^ i8) * (-28843)) ^ 1946293607;
                                        int i11 = 993229370;
                                        while (true) {
                                            i7 = ((((i7 ^ i8) * (-31587)) >> 31) & i10) ^ (iM6982 ^ i11);
                                            switch (i7) {
                                                case -2103834790:
                                                case 699391581:
                                                    RunnableC0588.m2441();
                                                    iM6982 = (i9 - C0630.m2566("ᩴ۠")) * (-27);
                                                    i10 = ((iM6982 ^ i8) * (-12471)) ^ (-364334541);
                                                    i11 = 921923804;
                                                    break;
                                                case -2036184187:
                                                case -573523038:
                                                    textView2 = textView;
                                                    if (C3245.f10203 <= 0) {
                                                        iM6982 = (i9 - C0630.m2566("ᩴ۠")) * (-27);
                                                        i10 = ((iM6982 ^ i8) * (-12471)) ^ (-364334541);
                                                        i11 = 921923804;
                                                    } else {
                                                        iM6982 = (C0630.m2566("ۖܽ") ^ i8) * 47;
                                                        i10 = ((iM6982 ^ i9) * 5677) ^ 625326252;
                                                        i11 = -1318131873;
                                                    }
                                                    break;
                                                case -1975212464:
                                                case -370958103:
                                                    if (RunnableC0588.f2309 >= 0) {
                                                        iM6982 = C0630.m2566("ۘᩳ") ^ i9;
                                                        i10 = ((iM6982 ^ i8) * 659) ^ (-1110688409);
                                                        i11 = -1249007174;
                                                    } else {
                                                        iM6982 = (C0630.m2566("ᩳ֡") + i8) * 29;
                                                        i10 = ((iM6982 ^ i9) * 32187) ^ (-93694541);
                                                        i11 = -268365830;
                                                    }
                                                    break;
                                                case -1869528463:
                                                case 1146636063:
                                                    C3911.m11924();
                                                    break;
                                                case -1837144966:
                                                case 1431474078:
                                                    if (C4616.f14690 <= 0) {
                                                        iM6982 = C0630.m2566("᩻ۙ") ^ i8;
                                                        i10 = ((iM6982 ^ i9) * (-22417)) ^ (-1838138856);
                                                        i11 = 1344764186;
                                                    } else {
                                                        iM6982 = (C2105.m6981("۟ۨ") + i9) * 109;
                                                        i10 = ((iM6982 ^ i8) * 19759) ^ 462629027;
                                                        i11 = 498082833;
                                                    }
                                                    break;
                                                case -1179343986:
                                                case 1382166358:
                                                    if (AbstractC2021.f6743 <= 0) {
                                                        iM6982 = C2105.m6981("ۜۜ") ^ i8;
                                                        i10 = ((iM6982 ^ i9) * (-32519)) ^ 2040069966;
                                                        i11 = -792640059;
                                                    } else {
                                                        iM6982 = (i9 - C2105.m6981("ܽܳ")) * 37;
                                                        i10 = ((iM6982 ^ i8) * 24153) ^ 1466416899;
                                                        i11 = -1300648771;
                                                    }
                                                    break;
                                                case -662744196:
                                                case -52579143:
                                                    C1711.m5736();
                                                    if (RunnableC0588.f2309 >= 0) {
                                                        iM6982 = C0630.m2566("ۘᩳ") ^ i9;
                                                        i10 = ((iM6982 ^ i8) * 659) ^ (-1110688409);
                                                        i11 = -1249007174;
                                                    } else {
                                                        iM6982 = (C2105.m6981("ۢۗ") + i8) * (-65);
                                                        i10 = ((iM6982 ^ i9) * (-9341)) ^ 1650628597;
                                                        i11 = -500004375;
                                                    }
                                                    break;
                                                case -567437002:
                                                case 1386544439:
                                                    if (C7811.f24123 >= 0) {
                                                        iM6982 = (C2105.m6981("ۢۗ") + i8) * (-65);
                                                        i10 = ((iM6982 ^ i9) * (-9341)) ^ 1650628597;
                                                        i11 = -500004375;
                                                    } else {
                                                        iM6982 = C0630.m2566("۟ۛ") ^ i8;
                                                        i10 = ((iM6982 ^ i9) * 1339) ^ 1117633106;
                                                        i11 = 35613780;
                                                    }
                                                    break;
                                                case -344644559:
                                                case 1399742772:
                                                    C4263.m12819();
                                                    if (!C1916.f6442) {
                                                        iM6982 = (i9 - C0630.m2566("ᩴ۠")) * (-27);
                                                        i10 = ((iM6982 ^ i8) * (-12471)) ^ (-364334541);
                                                        i11 = 921923804;
                                                    } else {
                                                        iM6982 = (C2105.m6981("ۢۗ") + i8) * (-65);
                                                        i10 = ((iM6982 ^ i9) * (-9341)) ^ 1650628597;
                                                        i11 = -500004375;
                                                    }
                                                    break;
                                                case -322263834:
                                                case 1269031790:
                                                    if (C2167.m7155()) {
                                                        iM6982 = C0630.m2566("᩻ۙ") ^ i8;
                                                        i10 = ((iM6982 ^ i9) * (-22417)) ^ (-1838138856);
                                                        i11 = 1344764186;
                                                    } else {
                                                        iM6982 = C0630.m2566("ۙܳ") ^ i9;
                                                        i10 = ((iM6982 ^ i8) * (-28815)) ^ 54958676;
                                                        i11 = -1298251642;
                                                    }
                                                    break;
                                                case 178960904:
                                                case 1714246451:
                                                    final C2533 c2533 = this.f27038;
                                                    if (C0483.f2088 < 0) {
                                                        final AbstractC15440 abstractC15441 = abstractC15440;
                                                        final AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                                                        if (C0050.f910 < 0) {
                                                            C4159.m12564(textView2, new View.OnClickListener() { // from class: l.ܺ۫ܽ
                                                                {
                                                                    int i12 = -785118821;
                                                                    int i13 = C4263.f13799;
                                                                    int i14 = C0714.f2697;
                                                                    int iM2566 = (i14 - C0630.m2566("ܿܽ")) * 83;
                                                                    int i15 = ((iM2566 ^ i13) * 12139) ^ 1812014249;
                                                                    int i16 = -179066258;
                                                                    while (true) {
                                                                        i12 = ((((i12 ^ i13) * 18521) >> 31) & i15) ^ (iM2566 ^ i16);
                                                                        switch (i12) {
                                                                            case -2140835532:
                                                                            case 2078748269:
                                                                                return;
                                                                            case -1980176862:
                                                                            case 1275124905:
                                                                                if (RunnableC1108.f4040) {
                                                                                    iM2566 = (C0630.m2566("᩷ۢ") + i13) * (-9);
                                                                                    i15 = ((iM2566 ^ i14) * (-26621)) ^ 984796937;
                                                                                    i16 = -510149180;
                                                                                } else {
                                                                                    iM2566 = C2105.m6981("ۨܳ") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * 5493) ^ 192590620;
                                                                                    i16 = 2038227770;
                                                                                }
                                                                                break;
                                                                            case -1875505377:
                                                                            case -13209516:
                                                                                C0798.m2998();
                                                                                iM2566 = C0630.m2566("ۜۚ") ^ i13;
                                                                                i15 = ((iM2566 ^ i14) * 27859) ^ 1685716747;
                                                                                i16 = -1776264856;
                                                                                break;
                                                                            case -1736346550:
                                                                            case -1251740941:
                                                                                C0050.m940();
                                                                                if (!C1916.f6442) {
                                                                                    iM2566 = (C0630.m2566("ܰ۠") + i14) * (-101);
                                                                                    i15 = ((iM2566 ^ i13) * 9185) ^ 505367493;
                                                                                    i16 = -1736958945;
                                                                                } else {
                                                                                    iM2566 = (i14 - C0630.m2566("᩵ۛ")) * 99;
                                                                                    i15 = ((iM2566 ^ i13) * (-29353)) ^ 1476500960;
                                                                                    i16 = -127846991;
                                                                                }
                                                                                break;
                                                                            case -1568888002:
                                                                            case 40717796:
                                                                                C1916.m6308();
                                                                                throw new RuntimeException();
                                                                            case -1317942374:
                                                                            case -463391176:
                                                                                if (C21923.m49329()) {
                                                                                    iM2566 = C2105.m6981("ۨܳ") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * 5493) ^ 192590620;
                                                                                    i16 = 2038227770;
                                                                                } else {
                                                                                    iM2566 = C0630.m2566("ۘ᩷") ^ i14;
                                                                                    i15 = ((iM2566 ^ i13) * (-26499)) ^ (-2093946593);
                                                                                    i16 = -1902844702;
                                                                                }
                                                                                break;
                                                                            case -1076244377:
                                                                            case 1334580726:
                                                                                if (RunnableC3474.m10630()) {
                                                                                    iM2566 = C2105.m6981("֨֨") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * (-501)) ^ 305291468;
                                                                                    i16 = 2019311745;
                                                                                } else {
                                                                                    iM2566 = C0630.m2566("ۘ᩹") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * 23339) ^ 2096846181;
                                                                                    i16 = -1394756669;
                                                                                }
                                                                                break;
                                                                            case -919418319:
                                                                            case 1268321408:
                                                                                if (C3432.m10477() <= 0) {
                                                                                    iM2566 = C0630.m2566("ۜۚ") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * 27859) ^ 1685716747;
                                                                                    i16 = -1776264856;
                                                                                } else {
                                                                                    iM2566 = (C0630.m2566("᩸ۙ") ^ i14) * 95;
                                                                                    i15 = ((iM2566 ^ i13) * 9121) ^ 1708096550;
                                                                                    i16 = -1598397063;
                                                                                }
                                                                                break;
                                                                            case -703995901:
                                                                            case 1911417981:
                                                                                if (C0483.f2088 >= 0) {
                                                                                    iM2566 = (C0630.m2566("ܰ۠") + i14) * (-101);
                                                                                    i15 = ((iM2566 ^ i13) * 9185) ^ 505367493;
                                                                                    i16 = -1736958945;
                                                                                } else {
                                                                                    iM2566 = (C0630.m2566("ܿۖ") ^ i14) * (-127);
                                                                                    i15 = ((iM2566 ^ i13) * 19763) ^ (-1679572152);
                                                                                    i16 = -1888882514;
                                                                                }
                                                                                break;
                                                                            case -551853909:
                                                                            case 1398032982:
                                                                                if (C3683.m11222()) {
                                                                                    iM2566 = C0630.m2566("ۜۚ") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * 27859) ^ 1685716747;
                                                                                    i16 = -1776264856;
                                                                                } else {
                                                                                    iM2566 = C0630.m2566("ۙܰ") ^ i14;
                                                                                    i15 = ((iM2566 ^ i13) * (-7501)) ^ 921071543;
                                                                                    i16 = -1044130660;
                                                                                }
                                                                                break;
                                                                            case -382158652:
                                                                            case 741360042:
                                                                                if (C2126.f7087) {
                                                                                    iM2566 = C0630.m2566("ۘ᩹") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * 23339) ^ 2096846181;
                                                                                    i16 = -1394756669;
                                                                                } else {
                                                                                    iM2566 = (C2105.m6981("᩷ܶ") ^ i13) * (-107);
                                                                                    i15 = ((iM2566 ^ i14) * 1827) ^ 404754744;
                                                                                    i16 = -131982405;
                                                                                }
                                                                                break;
                                                                            case -336137773:
                                                                            case 1293948761:
                                                                                if (!C1504.f5354) {
                                                                                    iM2566 = (i14 - C0630.m2566("᩵ۛ")) * 99;
                                                                                    i15 = ((iM2566 ^ i13) * (-29353)) ^ 1476500960;
                                                                                    i16 = -127846991;
                                                                                } else {
                                                                                    iM2566 = C0630.m2566("ۜۚ") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * 27859) ^ 1685716747;
                                                                                    i16 = -1776264856;
                                                                                }
                                                                                break;
                                                                            case 14356576:
                                                                            case 1246614909:
                                                                                if (C1294.m4372() <= 0) {
                                                                                    iM2566 = C0630.m2566("ۜۚ") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * 27859) ^ 1685716747;
                                                                                    i16 = -1776264856;
                                                                                } else {
                                                                                    iM2566 = (C2105.m6981("᩶֨") ^ i13) * 83;
                                                                                    i15 = ((iM2566 ^ i14) * (-11649)) ^ 484436016;
                                                                                    i16 = -1450820360;
                                                                                }
                                                                                break;
                                                                            case 573413367:
                                                                            case 1861879933:
                                                                                if (C3746.f11829 <= 0) {
                                                                                    iM2566 = C0630.m2566("ۜۚ") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * 27859) ^ 1685716747;
                                                                                    i16 = -1776264856;
                                                                                } else {
                                                                                    iM2566 = (i14 - C0630.m2566("ܰۘ")) * 15;
                                                                                    i15 = ((iM2566 ^ i13) * (-4481)) ^ (-2016157830);
                                                                                    i16 = 570974150;
                                                                                }
                                                                                break;
                                                                            case 1029116306:
                                                                            case 1107822592:
                                                                                C4263.m12819();
                                                                                if (!C0714.m2805()) {
                                                                                    iM2566 = C2105.m6981("ۨܳ") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * 5493) ^ 192590620;
                                                                                    i16 = 2038227770;
                                                                                } else {
                                                                                    iM2566 = C0630.m2566("ۜۚ") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * 27859) ^ 1685716747;
                                                                                    i16 = -1776264856;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                if (C3663.f11553) {
                                                                                    iM2566 = C0630.m2566("ۘ᩹") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * 23339) ^ 2096846181;
                                                                                    i16 = -1394756669;
                                                                                } else {
                                                                                    iM2566 = C0630.m2566("ۢ᩺") ^ i13;
                                                                                    i15 = ((iM2566 ^ i14) * 8597) ^ 646479272;
                                                                                    i16 = 1337714845;
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    C2533 c2534 = null;
                                                                    int i12 = 1240863798;
                                                                    int i13 = RunnableC0588.f2309;
                                                                    int i14 = C2167.f7158;
                                                                    int iM6983 = (C2105.m6981("ۙۢ") + i14) * (-85);
                                                                    int i15 = ((iM6983 ^ i13) * 22933) ^ 1222908036;
                                                                    int i16 = -138933295;
                                                                    while (true) {
                                                                        i12 = ((((i12 ^ i13) * 30207) >> 31) & i15) ^ (iM6983 ^ i16);
                                                                        switch (i12) {
                                                                            case -1601672286:
                                                                            case -189548156:
                                                                                if (ServiceConnectionC3453.f10921 >= 0) {
                                                                                    iM6983 = C2105.m6981("ܶܺ") ^ i14;
                                                                                    i15 = ((iM6983 ^ i13) * (-24587)) ^ (-606421013);
                                                                                    i16 = -1239371053;
                                                                                } else {
                                                                                    iM6983 = (C0630.m2566("ۢ᩺") ^ i14) * 45;
                                                                                    i15 = ((iM6983 ^ i13) * (-14779)) ^ (-1196265787);
                                                                                    i16 = -1685497914;
                                                                                }
                                                                                break;
                                                                            case -1586117070:
                                                                            case 115998852:
                                                                                if (C1420.f5096 <= 0) {
                                                                                    iM6983 = (i13 - C2105.m6981("ᩴܺ")) * (-37);
                                                                                    i15 = ((iM6983 ^ i14) * (-20703)) ^ (-98841074);
                                                                                    i16 = -1684192600;
                                                                                } else {
                                                                                    iM6983 = (C0630.m2566("ۗ۠") + i14) * 119;
                                                                                    i15 = ((iM6983 ^ i13) * 5229) ^ (-371599683);
                                                                                    i16 = 1938324742;
                                                                                }
                                                                                break;
                                                                            case -1444028706:
                                                                            case 1210740882:
                                                                                if (C2958.f9394 >= 0) {
                                                                                    iM6983 = C0630.m2566("֨ܰ") ^ i13;
                                                                                    i15 = ((iM6983 ^ i14) * (-2585)) ^ (-636918366);
                                                                                    i16 = 1863067578;
                                                                                } else {
                                                                                    iM6983 = C2105.m6981("ۘ֡") ^ i14;
                                                                                    i15 = ((iM6983 ^ i13) * (-403)) ^ 2057776998;
                                                                                    i16 = 2044608077;
                                                                                }
                                                                                break;
                                                                            case -1361854776:
                                                                            case -1348025248:
                                                                                c2534 = c2533;
                                                                                if (C5695.m16023() >= 0) {
                                                                                    iM6983 = C2105.m6981("ܶܺ") ^ i14;
                                                                                    i15 = ((iM6983 ^ i13) * (-24587)) ^ (-606421013);
                                                                                    i16 = -1239371053;
                                                                                } else {
                                                                                    iM6983 = C2105.m6981("ܽۢ") ^ i13;
                                                                                    i15 = ((iM6983 ^ i14) * (-6633)) ^ (-699551217);
                                                                                    i16 = 1857203586;
                                                                                }
                                                                                break;
                                                                            case -1006597499:
                                                                            case 143001651:
                                                                                C0630.m2564();
                                                                                if (C4616.m13552() != 0) {
                                                                                    iM6983 = (i13 - C2105.m6981("ᩴܺ")) * (-37);
                                                                                    i15 = ((iM6983 ^ i14) * (-20703)) ^ (-98841074);
                                                                                    i16 = -1684192600;
                                                                                } else {
                                                                                    iM6983 = C2105.m6981("ܽܽ") ^ i14;
                                                                                    i15 = ((iM6983 ^ i13) * (-32067)) ^ (-1436332438);
                                                                                    i16 = 1065040510;
                                                                                }
                                                                                break;
                                                                            case -911494184:
                                                                            case -151556451:
                                                                                if (C2167.f7158 < 0) {
                                                                                    iM6983 = C2105.m6981("ܶܺ") ^ i14;
                                                                                    i15 = ((iM6983 ^ i13) * (-24587)) ^ (-606421013);
                                                                                    i16 = -1239371053;
                                                                                } else {
                                                                                    iM6983 = (i13 - C2105.m6981("ᩴܺ")) * (-37);
                                                                                    i15 = ((iM6983 ^ i14) * (-20703)) ^ (-98841074);
                                                                                    i16 = -1684192600;
                                                                                }
                                                                                break;
                                                                            case -636663518:
                                                                            case 574798100:
                                                                                if (C1916.f6442) {
                                                                                    iM6983 = C2105.m6981("ۖ᩹") ^ i13;
                                                                                    i15 = ((iM6983 ^ i14) * (-28533)) ^ 934514631;
                                                                                    i16 = -1168461367;
                                                                                } else {
                                                                                    iM6983 = C2105.m6981("ܶܺ") ^ i14;
                                                                                    i15 = ((iM6983 ^ i13) * (-24587)) ^ (-606421013);
                                                                                    i16 = -1239371053;
                                                                                }
                                                                                break;
                                                                            case -433237512:
                                                                            case 494152663:
                                                                                C2272.m7503();
                                                                                if (C2167.f7158 < 0) {
                                                                                    iM6983 = C0630.m2566("֨ܰ") ^ i13;
                                                                                    i15 = ((iM6983 ^ i14) * (-2585)) ^ (-636918366);
                                                                                    i16 = 1863067578;
                                                                                } else {
                                                                                    iM6983 = C2105.m6981("ܶܺ") ^ i14;
                                                                                    i15 = ((iM6983 ^ i13) * (-24587)) ^ (-606421013);
                                                                                    i16 = -1239371053;
                                                                                }
                                                                                break;
                                                                            case -146164376:
                                                                            case 260022579:
                                                                                AbstractC2021.m6565(c2534);
                                                                                if (C3911.f12484 < 0) {
                                                                                    C4611 c4612 = c2534.f8046;
                                                                                    AbstractC15440 abstractC15442 = abstractC15441;
                                                                                    if (C1047.m3599() < 0) {
                                                                                        new C8177(abstractC15442, abstractActivityC3347, c4612);
                                                                                    }
                                                                                    iM6983 = C2105.m6981("ܶܺ") ^ i14;
                                                                                    i15 = ((iM6983 ^ i13) * (-24587)) ^ (-606421013);
                                                                                    i16 = -1239371053;
                                                                                } else {
                                                                                    iM6983 = C0630.m2566("۫᩸") ^ i14;
                                                                                    i15 = ((iM6983 ^ i13) * 29987) ^ (-398252006);
                                                                                    i16 = -774867720;
                                                                                }
                                                                                break;
                                                                            case 390158556:
                                                                            case 1948818175:
                                                                                if (C2520.f8000 >= 0) {
                                                                                    iM6983 = C0630.m2566("۫᩸") ^ i14;
                                                                                    i15 = ((iM6983 ^ i13) * 29987) ^ (-398252006);
                                                                                    i16 = -774867720;
                                                                                } else {
                                                                                    iM6983 = C2105.m6981("ᩳ֡") ^ i13;
                                                                                    i15 = ((iM6983 ^ i14) * 8357) ^ (-1739507505);
                                                                                    i16 = -774719821;
                                                                                }
                                                                                break;
                                                                            case 597794821:
                                                                            case 1027371468:
                                                                                if (C3683.f11629 >= 0) {
                                                                                    iM6983 = C2105.m6981("ܶܺ") ^ i14;
                                                                                    i15 = ((iM6983 ^ i13) * (-24587)) ^ (-606421013);
                                                                                    i16 = -1239371053;
                                                                                } else {
                                                                                    iM6983 = (C2105.m6981("֨ᩴ") + i14) * (-113);
                                                                                    i15 = ((iM6983 ^ i13) * (-19969)) ^ (-595625708);
                                                                                    i16 = 964990673;
                                                                                }
                                                                                break;
                                                                            case 613867131:
                                                                            case 1630321376:
                                                                                C3746.m11369();
                                                                                break;
                                                                            case 704087807:
                                                                            case 1224031636:
                                                                                if (C5695.f17556 >= 0) {
                                                                                    iM6983 = (i13 - C2105.m6981("ᩴܺ")) * (-37);
                                                                                    i15 = ((iM6983 ^ i14) * (-20703)) ^ (-98841074);
                                                                                    i16 = -1684192600;
                                                                                } else {
                                                                                    iM6983 = (C2105.m6981("ܳ᩻") ^ i13) * (-19);
                                                                                    i15 = ((iM6983 ^ i14) * (-8547)) ^ 1411758783;
                                                                                    i16 = 858475337;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                C7811.m20844();
                                                                                C3663.m11168();
                                                                                iM6983 = (i13 - C2105.m6981("ᩴܺ")) * (-37);
                                                                                i15 = ((iM6983 ^ i14) * (-20703)) ^ (-98841074);
                                                                                i16 = -1684192600;
                                                                                break;
                                                                        }
                                                                        return;
                                                                    }
                                                                }
                                                            });
                                                        }
                                                        iM6982 = C0630.m2566("ۘᩳ") ^ i9;
                                                        i10 = ((iM6982 ^ i8) * 659) ^ (-1110688409);
                                                        i11 = -1249007174;
                                                    } else {
                                                        iM6982 = C2105.m6981("ۜۜ") ^ i8;
                                                        i10 = ((iM6982 ^ i9) * (-32519)) ^ 2040069966;
                                                        i11 = -792640059;
                                                    }
                                                    break;
                                                case 448079414:
                                                case 1486524317:
                                                    if (!C2126.f7087) {
                                                        iM6982 = (C2105.m6981("ۢۗ") + i8) * (-65);
                                                        i10 = ((iM6982 ^ i9) * (-9341)) ^ 1650628597;
                                                        i11 = -500004375;
                                                    } else {
                                                        iM6982 = C0630.m2566("᩻ۙ") ^ i8;
                                                        i10 = ((iM6982 ^ i9) * (-22417)) ^ (-1838138856);
                                                        i11 = 1344764186;
                                                    }
                                                    break;
                                                case 1417526761:
                                                case 1746440826:
                                                    if (C4075.f12947 >= 0) {
                                                        iM6982 = C2105.m6981("ۜۜ") ^ i8;
                                                        i10 = ((iM6982 ^ i9) * (-32519)) ^ 2040069966;
                                                        i11 = -792640059;
                                                    } else {
                                                        iM6982 = (i8 - C2105.m6981("֨ܺ")) * (-23);
                                                        i10 = ((iM6982 ^ i9) * (-19997)) ^ (-1073730963);
                                                        i11 = -357350616;
                                                    }
                                                    break;
                                                default:
                                                    C19890.m45741(textView2);
                                                    if (C4263.f13799 <= 0) {
                                                        iM6982 = C0630.m2566("᩻ۙ") ^ i8;
                                                        i10 = ((iM6982 ^ i9) * (-22417)) ^ (-1838138856);
                                                        i11 = 1344764186;
                                                    } else {
                                                        iM6982 = C2105.m6981("ۜܿ") ^ i9;
                                                        i10 = ((iM6982 ^ i8) * 26189) ^ (-1757498131);
                                                        i11 = -2133938491;
                                                    }
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                });
                                iM6981 = (i3 - C0630.m2566("۟֨")) * (-51);
                                i4 = ((iM6981 ^ i2) * (-8385)) ^ (-1031883422);
                                i5 = -877292942;
                                break;
                            }
                            iM6981 = C2105.m6981("ۡۡ") ^ i2;
                            i4 = ((iM6981 ^ i3) * (-10555)) ^ 668131037;
                            i5 = -735100996;
                            break;
                        }
                        iM6981 = (C2105.m6981("ۙܺ") ^ i2) * 23;
                        i4 = ((iM6981 ^ i3) * 14419) ^ (-1542386614);
                        i5 = 224955480;
                        break;
                    case -588605629:
                    case -237574995:
                        this.f8040 = c4611.m13527(this.f8045);
                        iM6981 = C2105.m6981("ᩴᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 151) ^ (-1195467511);
                        i5 = -38995138;
                        break;
                    case -583026066:
                    case 1890456725:
                        C4611 c4612 = this.f8046;
                        AbstractC15440 abstractC15441 = this.f8044;
                        if (c4612 != null) {
                            abstractC15440 = abstractC15441;
                            iM6981 = (i3 - C2105.m6981("ۚܽ")) * (-21);
                            i4 = ((iM6981 ^ i2) * 21943) ^ (-806248618);
                            i5 = -1426282607;
                        }
                        int iM6982 = (i2 - C2105.m6981("۟ܳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM6982 ^ i3) * (-3457)) ^ (-1979169501);
                        i6 = iM6982 ^ (-1837146236);
                        abstractC15440 = abstractC15441;
                        break;
                        break;
                    case -371197380:
                    case 164543205:
                        if (C0237.m1481() < 0) {
                            iM6981 = (i2 - C0630.m2566("ۚۜ")) * q.h;
                            i4 = ((iM6981 ^ i3) * (-12289)) ^ (-317312787);
                            i5 = 563646382;
                        } else {
                            iM6981 = C2105.m6981("ۡۡ") ^ i2;
                            i4 = ((iM6981 ^ i3) * (-10555)) ^ 668131037;
                            i5 = -735100996;
                        }
                        break;
                    case -215584861:
                    case 850485809:
                        C2958.m9034();
                        if (C3911.f12484 >= 0) {
                            iM6981 = (C0630.m2566("ᩳ᩺") + i3) * 95;
                            i4 = ((iM6981 ^ i2) * (-9035)) ^ 508735643;
                            i5 = -570810814;
                        } else {
                            iM6981 = (C2105.m6981("ۙܺ") ^ i2) * 23;
                            i4 = ((iM6981 ^ i3) * 14419) ^ (-1542386614);
                            i5 = 224955480;
                        }
                        break;
                    case -134596236:
                    case 143486934:
                        break;
                    case 94928699:
                    case 737727424:
                        if (!C1005.f3721) {
                            iM6981 = (C2105.m6981("ۙܺ") ^ i2) * 23;
                            i4 = ((iM6981 ^ i3) * 14419) ^ (-1542386614);
                            i5 = 224955480;
                            break;
                        }
                        this.f8046 = new C4611(abstractC15440, false);
                        iM6981 = (i3 - C2105.m6981("ۚܽ")) * (-21);
                        i4 = ((iM6981 ^ i2) * 21943) ^ (-806248618);
                        i5 = -1426282607;
                        break;
                    case 617818112:
                    case 2042333320:
                        C22628.m50615();
                        C0714.m2805();
                        iM6981 = (C2105.m6981("ۙܺ") ^ i2) * 23;
                        i4 = ((iM6981 ^ i3) * 14419) ^ (-1542386614);
                        i5 = 224955480;
                        break;
                    case 758555617:
                    case 2085796234:
                        this.f8051 = true;
                        if (!C0382.m1848()) {
                            iM6981 = C0630.m2566("֡᩶") ^ i3;
                            i4 = ((iM6981 ^ i2) * (-24503)) ^ (-278833350);
                            i5 = 1026866542;
                        } else {
                            iM6981 = (C2105.m6981("ۙܺ") ^ i2) * 23;
                            i4 = ((iM6981 ^ i3) * 14419) ^ (-1542386614);
                            i5 = 224955480;
                        }
                        break;
                    case 1389833179:
                    case 1622773712:
                        if (C3432.f10845 < 0) {
                            iM6981 = (i2 - C0630.m2566("۫ۨ")) * 43;
                            i4 = ((iM6981 ^ i3) * 19839) ^ (-1841555763);
                            i5 = 916660592;
                        } else {
                            iM6981 = C2105.m6981("ۡۡ") ^ i2;
                            i4 = ((iM6981 ^ i3) * (-10555)) ^ 668131037;
                            i5 = -735100996;
                        }
                        break;
                    default:
                        c4611 = this.f8046;
                        if (!C2126.f7087) {
                            iM6981 = C0630.m2566("۫ۧ") ^ i3;
                            i4 = ((iM6981 ^ i2) * 32147) ^ (-2083807612);
                            i5 = 83157862;
                        } else {
                            iM6981 = C2105.m6981("ۡۡ") ^ i2;
                            i4 = ((iM6981 ^ i3) * (-10555)) ^ 668131037;
                            i5 = -735100996;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03e5 A[PHI: r24
      0x03e5: PHI (r24v16 int) = (r24v10 int), (r24v12 int), (r24v17 int) binds: [B:98:0x03cc, B:91:0x037f, B:84:0x032a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x0483 A[PHI: r15 r16 r19 r20 r25
      0x0483: PHI (r15v72 int) = (r15v7 int), (r15v8 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:115:0x0481, B:109:0x045b, B:29:0x00b4, B:26:0x009a, B:23:0x0094, B:12:0x0074, B:8:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0483: PHI (r16v5 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:115:0x0481, B:109:0x045b, B:29:0x00b4, B:26:0x009a, B:23:0x0094, B:12:0x0074, B:8:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0483: PHI (r19v5 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:115:0x0481, B:109:0x045b, B:29:0x00b4, B:26:0x009a, B:23:0x0094, B:12:0x0074, B:8:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0483: PHI (r20v5 short) = (r20v3 short), (r20v2 short), (r20v2 short), (r20v2 short), (r20v2 short), (r20v2 short), (r20v2 short) binds: [B:115:0x0481, B:109:0x045b, B:29:0x00b4, B:26:0x009a, B:23:0x0094, B:12:0x0074, B:8:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0483: PHI (r25v6 int) = (r25v3 int), (r25v4 int), (r25v3 int), (r25v3 int), (r25v3 int), (r25v3 int), (r25v3 int) binds: [B:115:0x0481, B:109:0x045b, B:29:0x00b4, B:26:0x009a, B:23:0x0094, B:12:0x0074, B:8:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x04b8 A[PHI: r7 r8 r17 r18 r24
      0x04b8: PHI (r7v4 android.view.View) = (r7v2 android.view.View), (r7v3 android.view.View), (r7v2 android.view.View) binds: [B:119:0x04b6, B:41:0x0133, B:20:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x04b8: PHI (r8v4 android.view.ViewGroup$LayoutParams) = 
      (r8v2 android.view.ViewGroup$LayoutParams)
      (r8v3 android.view.ViewGroup$LayoutParams)
      (r8v2 android.view.ViewGroup$LayoutParams)
     binds: [B:119:0x04b6, B:41:0x0133, B:20:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x04b8: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:119:0x04b6, B:41:0x0133, B:20:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x04b8: PHI (r18v4 char) = (r18v3 char), (r18v2 char), (r18v2 char) binds: [B:119:0x04b6, B:41:0x0133, B:20:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x04b8: PHI (r24v35 int) = (r24v2 int), (r24v29 int), (r24v36 int) binds: [B:119:0x04b6, B:41:0x0133, B:20:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02c8 A[PHI: r5 r9 r24
      0x02c8: PHI (r5v6 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String) binds: [B:77:0x02c6, B:59:0x01f6, B:10:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r9v6 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:77:0x02c6, B:59:0x01f6, B:10:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r24v51 int) = (r24v19 int), (r24v23 int), (r24v52 int) binds: [B:77:0x02c6, B:59:0x01f6, B:10:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (l.C1916.f6442 != false) goto L116;
     */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1006() {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int i5 = C3019.f9544;
        int i6 = C7811.f24123;
        int iM2567 = C0630.m2566("ܺܿ") ^ i5;
        int i7 = ((iM2567 ^ i6) * (-29613)) ^ (-659010899);
        String strM46380 = null;
        ViewGroup.LayoutParams layoutParamsM13553 = null;
        short[] sArr = null;
        int i8 = iM2567 ^ (-1196872885);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i14 = 357947517;
        int i15 = 0;
        C22250 c22250 = null;
        View view = null;
        short[] sArr2 = null;
        int i16 = 0;
        int iM2568 = 0;
        TextView textView = null;
        InterfaceC13041 interfaceC13041 = null;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i6) * 29037) >> 31));
            switch (i14) {
                case -2022513198:
                case 1397707477:
                    i12 = i12;
                    boolean zM13537 = this.f8046.m13537();
                    textView = this.f8042;
                    if (zM13537) {
                        iM2566 = (i5 - C0630.m2566("ۖ᩵")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i6) * (-23941)) ^ (-37350690);
                        i2 = 343264544;
                    } else {
                        iM2566 = (C2105.m6981("ۛܶ") ^ i5) * 39;
                        i = ((iM2566 ^ i6) * 22175) ^ 1732020223;
                        i2 = -1472030377;
                    }
                    int i17 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i17;
                    i7 = i;
                    break;
                case -1955364123:
                case 18564360:
                    i12 = i12;
                    C3245.m9918(textView, i16);
                    if (this.f8040.m49968()) {
                        iM2566 = C2105.m6981("ܿ֡") ^ i6;
                        i = ((iM2566 ^ i5) * (-22477)) ^ (-462056168);
                        i2 = 1700496700;
                    } else {
                        iM2566 = C0630.m2566("۬ۨ") ^ i5;
                        i = ((iM2566 ^ i6) * 3773) ^ 1291043223;
                        i2 = 717080970;
                    }
                    int i18 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i18;
                    i7 = i;
                    break;
                case -1930017564:
                case -1544311081:
                    break;
                case -1889741489:
                case -1214882075:
                    i12 = i12;
                    interfaceC13041.accept(this.f8046);
                    iM2566 = C0630.m2566("֡ۧ") ^ i6;
                    i = ((iM2566 ^ i5) * (-7115)) ^ (-241669310);
                    i2 = -490790156;
                    int i19 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i19;
                    i7 = i;
                    break;
                case -1868498271:
                case -1571995706:
                    i12 = i12;
                    iM2568 = C0630.m2566(C1294.m4373(sArr, i10, i11, i9));
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("ۧܺ") ^ i6;
                        i = ((iM2566 ^ i5) * 20525) ^ (-1693085327);
                        i2 = -1553240454;
                    } else {
                        iM2566 = C0630.m2566("۠᩻") ^ i6;
                        i = ((iM2566 ^ i5) * 30061) ^ (-1907118403);
                        i2 = -1831881697;
                    }
                    int i110 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i110;
                    i7 = i;
                    break;
                case -1867804810:
                case -873160962:
                    C1047.m3601(textView, this.f8046.m13534());
                    break;
                case -1772769553:
                case -1126406138:
                    C1047.m3599();
                    break;
                case -1739562645:
                case -1692559451:
                    i12 = i12;
                    if (this.f8040 != null) {
                        iM2566 = C0630.m2566("۬ۢ") ^ i6;
                        i = ((iM2566 ^ i5) * 25123) ^ 1786198693;
                        i2 = 1326562015;
                    } else {
                        iM2566 = (C0630.m2566("ۨۨ") + i6) * (-29);
                        i = ((iM2566 ^ i5) * 29237) ^ (-1123159001);
                        i2 = 596051867;
                    }
                    int i111 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i111;
                    i7 = i;
                    break;
                case -1707307838:
                case -1237943545:
                    i12 = i12;
                    s = sArr2[c];
                    s2 = 26718;
                    if (C4616.f14690 > 0) {
                        iM2566 = C0630.m2566("ۨᩴ") ^ i5;
                        i = ((iM2566 ^ i6) * (-3477)) ^ 1337621842;
                        i2 = -1701583411;
                        int i112 = iM2566 ^ i2;
                        i12 = i12;
                        i8 = i112;
                        i7 = i;
                    } else {
                        i12 = i12;
                        iM6981 = C2105.m6981("ܰ᩺") ^ i5;
                        i = ((iM6981 ^ i6) * 23423) ^ (-223088278);
                        i3 = 1367152828;
                        i8 = iM6981 ^ i3;
                        i7 = i;
                    }
                    break;
                case -1680797638:
                case -1414529581:
                    i12 = i12;
                    sArr = f8039;
                    i10 = 1;
                    i11 = 3;
                    if (C0382.f1805) {
                        iM2566 = (C0630.m2566("᩶ۤ") + i5) * 81;
                        i = ((iM2566 ^ i6) * (-13611)) ^ (-258939638);
                        i2 = -1821417032;
                    } else {
                        iM2566 = (i6 - C0630.m2566("ܿ֫")) * 101;
                        i = ((iM2566 ^ i5) * (-28591)) ^ (-1834007532);
                        i2 = -1873717296;
                    }
                    int i113 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i113;
                    i7 = i;
                    break;
                case -1559282411:
                case 1043553667:
                    i12 = i12;
                    strM46380 = this.f8040.m49966().m46380();
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ۧܺ") ^ i6;
                        i = ((iM2566 ^ i5) * 20525) ^ (-1693085327);
                        i2 = -1553240454;
                    } else {
                        iM2566 = C0630.m2566("᩷ۧ") ^ i5;
                        i = ((iM2566 ^ i6) * 4627) ^ 1794066154;
                        i2 = 401528929;
                    }
                    int i114 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i114;
                    i7 = i;
                    break;
                case -1428472870:
                case 682577525:
                    i9 = 17485;
                    iM2566 = (i5 - C2105.m6981("ۙۘ")) * 87;
                    i = ((iM2566 ^ i6) * (-20041)) ^ (-1587271784);
                    i2 = -1159196157;
                    int i115 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i115;
                    i7 = i;
                    break;
                case -1245157285:
                case 1666170763:
                    i12 = i12;
                    if ((i12 + i13) - i15 >= 0) {
                        iM2566 = C2105.m6981("ܺ۠") ^ i5;
                        i = ((iM2566 ^ i6) * (-12191)) ^ 695610654;
                        i2 = -988929693;
                    } else {
                        iM2566 = C0630.m2566("᩵ۜ") ^ i6;
                        i = ((iM2566 ^ i5) * 13587) ^ 981524074;
                        i2 = -1690086480;
                    }
                    int i116 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i116;
                    i7 = i;
                    break;
                case -1063289748:
                case 2107520646:
                    C5695.m16023();
                    C1047.m3599();
                    iM6981 = C2105.m6981("ܰ᩺") ^ i5;
                    i = ((iM6981 ^ i6) * 23423) ^ (-223088278);
                    i3 = 1367152828;
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case -958018797:
                case 1542909853:
                    RunnableC1937.m6377(textView, this.f8046.m13534());
                    break;
                case -954426106:
                case 366927950:
                    break;
                case -939686599:
                case 1170758948:
                    i4 = C21943.f70293;
                    i16 = i4;
                    iM2566 = C2105.m6981("ۤ֡") ^ i6;
                    i = ((iM2566 ^ i5) * 32031) ^ (-1900577701);
                    i2 = -1326752910;
                    int i117 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i117;
                    i7 = i;
                    break;
                case -838907876:
                case 1223397397:
                    i4 = C21943.f70263;
                    i16 = i4;
                    iM2566 = C2105.m6981("ۤ֡") ^ i6;
                    i = ((iM2566 ^ i5) * 32031) ^ (-1900577701);
                    i2 = -1326752910;
                    int i118 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i118;
                    i7 = i;
                    break;
                case -779236698:
                case 49488196:
                    if (C4616.f14690 <= 0) {
                        iM6981 = C2105.m6981("ܰ᩺") ^ i5;
                        i = ((iM6981 ^ i6) * 23423) ^ (-223088278);
                        i3 = 1367152828;
                    } else {
                        iM6981 = C0630.m2566("᩸ۜ") ^ i6;
                        i = ((iM6981 ^ i5) * 85) ^ 442532837;
                        i3 = -865220443;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case -726948295:
                case 1633609198:
                    i12 = i12;
                    view = this.f8048;
                    C3746.m11360(view, 0);
                    layoutParamsM13553 = C4616.m13553(textView);
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C0630.m2566("ܿ᩹") + i5) * 51;
                        i = ((iM2566 ^ i6) * 27617) ^ 579826043;
                        i2 = -2031269288;
                    } else {
                        iM2566 = (C2105.m6981("ۗܺ") + i5) * q.h;
                        i = ((iM2566 ^ i6) * (-1755)) ^ (-128404955);
                        i2 = 1226834850;
                    }
                    int i119 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i119;
                    i7 = i;
                    break;
                case -425339060:
                case 1472062167:
                    textView.setLayoutParams(layoutParamsM13553);
                    if (C0422.f1886 > 0) {
                        i12 = i12;
                        C2126.m7039(view, new ViewOnClickListenerC9841(1, this.f8043));
                        iM2566 = C0630.m2566("۬ۨ") ^ i5;
                        i = ((iM2566 ^ i6) * 3773) ^ 1291043223;
                        i2 = 717080970;
                        int i1110 = iM2566 ^ i2;
                        i12 = i12;
                        i8 = i1110;
                        i7 = i;
                    }
                    iM6981 = (i6 - C0630.m2566("ۖۘ")) * 29;
                    i = ((iM6981 ^ i5) * 16605) ^ (-327114928);
                    i3 = 37328392;
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case -198731154:
                case 873017664:
                    i12 = i12;
                    interfaceC13041 = this.f8050;
                    if (interfaceC13041 != null) {
                        iM2566 = (i5 - C2105.m6981("ۘܰ")) * (-113);
                        i = ((iM2566 ^ i6) * 15073) ^ 694452581;
                        i2 = -1417367539;
                    } else {
                        iM2566 = C0630.m2566("֡ۧ") ^ i6;
                        i = ((iM2566 ^ i5) * (-7115)) ^ (-241669310);
                        i2 = -490790156;
                    }
                    int i1111 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i1111;
                    i7 = i;
                    break;
                case -121160356:
                case 2071165700:
                    i12 = i12;
                    if (this.f8049) {
                        iM2566 = (i5 - C0630.m2566("ܶۤ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2566 ^ i6) * 12515) ^ 1036261201;
                        i2 = -302086153;
                    } else {
                        iM2566 = (C0630.m2566("ۨۨ") + i6) * (-29);
                        i = ((iM2566 ^ i5) * 29237) ^ (-1123159001);
                        i2 = 596051867;
                    }
                    int i1112 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i1112;
                    i7 = i;
                    break;
                case -95655231:
                case 908986382:
                    i12 = i12;
                    RunnableC1937.m6377(textView, strM46380);
                    if (this.f8040.m49968()) {
                        iM2566 = (i5 - C0630.m2566("֨ۛ")) * (-65);
                        i = ((iM2566 ^ i6) * (-16797)) ^ (-726097339);
                        i2 = 1742042399;
                    } else {
                        iM2566 = C2105.m6981("֡ۢ") ^ i6;
                        i = ((iM2566 ^ i5) * (-29455)) ^ 1103290987;
                        i2 = 1980626207;
                    }
                    int i1113 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i1113;
                    i7 = i;
                    break;
                case -53075574:
                case 716221936:
                    i9 = 21459;
                    iM2566 = (i5 - C2105.m6981("ۙۘ")) * 87;
                    i = ((iM2566 ^ i6) * (-20041)) ^ (-1587271784);
                    i2 = -1159196157;
                    int i1114 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i1114;
                    i7 = i;
                    break;
                case -18767122:
                case 1281644328:
                    i12 = i12;
                    C8177.f25172.m4554(this.f8047, this.f8046);
                    iM2566 = (C0630.m2566("ۨۨ") + i6) * (-29);
                    i = ((iM2566 ^ i5) * 29237) ^ (-1123159001);
                    i2 = 596051867;
                    int i1115 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i1115;
                    i7 = i;
                    break;
                case 257182528:
                case 1097558597:
                    i12 = i12;
                    layoutParamsM13553.width = -2;
                    if (C0630.m2564()) {
                        iM2566 = (C0630.m2566("᩷۟") ^ i5) * (-43);
                        i = ((iM2566 ^ i6) * (-15215)) ^ (-997146257);
                        i2 = 1954642736;
                    } else {
                        iM2566 = C0630.m2566("ܺۛ") ^ i6;
                        i = ((iM2566 ^ i5) * 14807) ^ 110821793;
                        i2 = 1465251050;
                    }
                    int i1116 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i1116;
                    i7 = i;
                    break;
                case 279596680:
                case 1630175272:
                    if (!C2272.f7362) {
                        i12 = i12;
                        iM2566 = C2105.m6981("ۧܺ") ^ i6;
                        i = ((iM2566 ^ i5) * 20525) ^ (-1693085327);
                        i2 = -1553240454;
                        int i1117 = iM2566 ^ i2;
                        i12 = i12;
                        i8 = i1117;
                        i7 = i;
                    }
                    iM6981 = C2105.m6981("ܰ᩺") ^ i5;
                    i = ((iM6981 ^ i6) * 23423) ^ (-223088278);
                    i3 = 1367152828;
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case 312178190:
                case 1044460363:
                    if (C4616.m13552() == 0) {
                        iM6981 = C2105.m6981("ܰ᩺") ^ i5;
                        i = ((iM6981 ^ i6) * 23423) ^ (-223088278);
                        i3 = 1367152828;
                    } else {
                        iM6981 = (i6 - C0630.m2566("ۖۘ")) * 29;
                        i = ((iM6981 ^ i5) * 16605) ^ (-327114928);
                        i3 = 37328392;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case 591371971:
                case 859416002:
                    i12 = i12;
                    C0630.m2570(textView, 2125213547 ^ iM2568);
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("ۗ֫") ^ i6;
                        i = ((iM2566 ^ i5) * (-28137)) ^ 287939816;
                        i2 = -432998177;
                    } else {
                        iM2566 = C2105.m6981("֫ۤ") ^ i5;
                        i = ((iM2566 ^ i6) * (-13859)) ^ 223149306;
                        i2 = -565357304;
                    }
                    int i1118 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i1118;
                    i7 = i;
                    break;
                case 626430794:
                case 1999805617:
                    i15 = s * s2;
                    i12 = s * s;
                    i13 = 178462881;
                    if (C11340.f33930 >= 0) {
                        iM6981 = C2105.m6981("ܰ᩺") ^ i5;
                        i = ((iM6981 ^ i6) * 23423) ^ (-223088278);
                        i3 = 1367152828;
                    } else {
                        iM6981 = (C2105.m6981("ۖ֡") ^ i6) * (-73);
                        i = ((iM6981 ^ i5) * (-7439)) ^ (-1309016524);
                        i3 = 566785631;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case 681935149:
                case 871131745:
                    C2520.m8026();
                    if (C2167.f7158 < 0) {
                        i12 = i12;
                        iM2566 = (i6 - C0630.m2566("ܿ֫")) * 101;
                        i = ((iM2566 ^ i5) * (-28591)) ^ (-1834007532);
                        i2 = -1873717296;
                        int i1119 = iM2566 ^ i2;
                        i12 = i12;
                        i8 = i1119;
                        i7 = i;
                    }
                    i12 = i12;
                    iM2566 = (C0630.m2566("ܿ᩹") + i5) * 51;
                    i = ((iM2566 ^ i6) * 27617) ^ 579826043;
                    i2 = -2031269288;
                    int i11110 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i11110;
                    i7 = i;
                    break;
                case 705955609:
                case 1455235700:
                    if (C4075.m12263() <= 0) {
                        i12 = i12;
                        iM2566 = C2105.m6981("֫ۤ") ^ i5;
                        i = ((iM2566 ^ i6) * (-13859)) ^ 223149306;
                        i2 = -565357304;
                        int i11111 = iM2566 ^ i2;
                        i12 = i12;
                        i8 = i11111;
                        i7 = i;
                    }
                    iM6981 = C0630.m2566("᩸ۜ") ^ i6;
                    i = ((iM6981 ^ i5) * 85) ^ 442532837;
                    i3 = -865220443;
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case 1151093417:
                case 1505832077:
                    i12 = i12;
                    c22250 = this.f8040;
                    if (c22250 != null) {
                        iM2566 = C2105.m6981("ۛ᩺") ^ i5;
                        i = ((iM2566 ^ i6) * (-29413)) ^ 962819665;
                        i2 = -1568793475;
                    } else {
                        iM2566 = (C0630.m2566("۟᩷") + i6) * (-75);
                        i = ((iM2566 ^ i5) * 2117) ^ (-277098455);
                        i2 = 416663320;
                    }
                    int i11112 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i11112;
                    i7 = i;
                    break;
                case 1340046194:
                case 1711917243:
                    i12 = i12;
                    if (c22250.m49966().m46381()) {
                        iM2566 = C0630.m2566("ۨۛ") ^ i5;
                        i = ((iM2566 ^ i6) * 28205) ^ 487359100;
                        i2 = 643156989;
                    } else {
                        iM2566 = (C2105.m6981("ۘۛ") ^ i6) * (-91);
                        i = ((iM2566 ^ i5) * (-23781)) ^ 1815186266;
                        i2 = -2120851369;
                    }
                    int i11113 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i11113;
                    i7 = i;
                    break;
                case 1426605566:
                case 1629558821:
                    i12 = i12;
                    sArr2 = f8039;
                    c = 0;
                    if (C1711.m5736() <= 0) {
                        iM2566 = (C0630.m2566("ܿ᩹") + i5) * 51;
                        i = ((iM2566 ^ i6) * 27617) ^ 579826043;
                        i2 = -2031269288;
                    } else {
                        iM2566 = C0630.m2566("᩷۠") ^ i6;
                        i = ((iM2566 ^ i5) * 5003) ^ 329643823;
                        i2 = 735015628;
                    }
                    int i11114 = iM2566 ^ i2;
                    i12 = i12;
                    i8 = i11114;
                    i7 = i;
                    break;
                default:
                    C3245.m9918(textView, C21943.f70293);
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        AtomicBoolean atomicBoolean = null;
        int i = -1129114883;
        int i2 = C3683.f11629;
        int i3 = C2520.f8000;
        int iM2566 = (i2 - C0630.m2566("ۗۗ")) * 81;
        int i4 = ((iM2566 ^ i3) * (-23213)) ^ 404806809;
        int i5 = -1743450830;
        while (true) {
            i = ((((i ^ i3) * 2315) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2128705400:
                case -519565921:
                    if (C21923.f70183 != 0) {
                        iM2566 = (i3 - C2105.m6981("ۡᩳ")) * 13;
                        i4 = ((iM2566 ^ i2) * (-7337)) ^ (-1870256333);
                        i5 = 1962189552;
                    } else {
                        iM2566 = (C0630.m2566("ۛ᩸") ^ i3) * 65;
                        i4 = ((iM2566 ^ i2) * (-4063)) ^ (-1861061444);
                        i5 = -151551586;
                    }
                    break;
                case -2108010121:
                case -149695409:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (i3 - C2105.m6981("ۡᩳ")) * 13;
                        i4 = ((iM2566 ^ i2) * (-7337)) ^ (-1870256333);
                        i5 = 1962189552;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ᩳܳ")) * (-111);
                        i4 = ((iM2566 ^ i3) * 5705) ^ (-888866350);
                        i5 = 94730256;
                    }
                    break;
                case -2062370785:
                case -1176965176:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C0630.m2566("᩺֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 24553) ^ 395495689;
                        i5 = -565651003;
                    } else {
                        iM2566 = C0630.m2566("۬ܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 7945) ^ (-344948977);
                        i5 = 435991588;
                    }
                    break;
                case -1697074600:
                case 718021209:
                    C1005.m3501();
                    C0422.m1963();
                    break;
                case -1442273338:
                case -913642374:
                    if (C3537.f11231 >= 0) {
                        iM2566 = C0630.m2566("ۙۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-8203)) ^ (-1245072859);
                        i5 = -609895439;
                    } else {
                        iM2566 = (C0630.m2566("ܿۜ") + i2) * 69;
                        i4 = ((iM2566 ^ i3) * 24549) ^ 1923887022;
                        i5 = 1912965836;
                    }
                    break;
                case -980483864:
                case 1671865034:
                    if (C11340.f33930 < 0) {
                        iM2566 = C0630.m2566("ۙۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-8203)) ^ (-1245072859);
                        i5 = -609895439;
                    } else {
                        iM2566 = C0630.m2566("ۚ۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7173) ^ 1483755275;
                        i5 = -1857855218;
                    }
                    break;
                case -969075669:
                case 1752234475:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C0630.m2566("᩺֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 24553) ^ 395495689;
                        i5 = -565651003;
                    } else {
                        iM2566 = (C0630.m2566("᩹᩷") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i2) * (-5081)) ^ 765834265;
                        i5 = 388781651;
                    }
                    break;
                case -960883153:
                case 2115357:
                    if (C3663.f11553) {
                        iM2566 = C0630.m2566("ۙۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-8203)) ^ (-1245072859);
                        i5 = -609895439;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۛ᩺")) * (-57);
                        i4 = ((iM2566 ^ i3) * (-2749)) ^ 596445762;
                        i5 = -443813655;
                    }
                    break;
                case -923739969:
                case -310663144:
                    if (C21923.m49329()) {
                        iM2566 = C0630.m2566("ۙۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-8203)) ^ (-1245072859);
                        i5 = -609895439;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩷ۙ")) * 65;
                        i4 = ((iM2566 ^ i2) * (-8431)) ^ (-1014678408);
                        i5 = -1794319347;
                    }
                    break;
                case -884697106:
                case 796289520:
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("ۙۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-8203)) ^ (-1245072859);
                        i5 = -609895439;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩷ۜ")) * (-63);
                        i4 = ((iM2566 ^ i3) * (-21645)) ^ 550082275;
                        i5 = 1450206391;
                    }
                    break;
                case -353818559:
                case 1342286010:
                    C7106.m19120();
                    if (C3019.f9544 < 0) {
                        iM2566 = C0630.m2566("᩺֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 24553) ^ 395495689;
                        i5 = -565651003;
                    } else {
                        iM2566 = (C0630.m2566("ܺۧ") + i2) * 11;
                        i4 = ((iM2566 ^ i3) * 1207) ^ 225077604;
                        i5 = -262766957;
                    }
                    break;
                case -13830899:
                case 502598414:
                    atomicBoolean = this.f8041;
                    if (atomicBoolean != null) {
                        iM2566 = (i3 - C2105.m6981("ۡۧ")) * (-11);
                        i4 = ((iM2566 ^ i2) * 32567) ^ (-170572516);
                        i5 = -342980277;
                    } else {
                        iM2566 = C2105.m6981("ۤܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 15301) ^ 1412667309;
                        i5 = -1972819625;
                    }
                    break;
                case 277891215:
                case 1904820173:
                    C0483.m2121();
                    if (!C2520.m8026()) {
                        iM2566 = C0630.m2566("᩺֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 24553) ^ 395495689;
                        i5 = -565651003;
                    } else {
                        iM2566 = C0630.m2566("ۚ۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7173) ^ 1483755275;
                        i5 = -1857855218;
                    }
                    break;
                case 343561037:
                case 1899725356:
                    atomicBoolean.set(false);
                    iM2566 = C2105.m6981("ۤܶ") ^ i2;
                    i4 = ((iM2566 ^ i3) * 15301) ^ 1412667309;
                    i5 = -1972819625;
                    break;
                case 451375647:
                case 609326072:
                    C4075.m12263();
                    iM2566 = C0630.m2566("᩺֫") ^ i2;
                    i4 = ((iM2566 ^ i3) * 24553) ^ 395495689;
                    i5 = -565651003;
                    break;
                case 659241109:
                case 2053496577:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("ۚ۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7173) ^ 1483755275;
                        i5 = -1857855218;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܺ᩶")) * (-55);
                        i4 = ((iM2566 ^ i2) * (-19009)) ^ 1708065527;
                        i5 = 910437090;
                    }
                    break;
                case 840910738:
                case 2129540200:
                    break;
                default:
                    if (C2105.f7037 != 0) {
                        iM2566 = C0630.m2566("ۚ۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7173) ^ 1483755275;
                        i5 = -1857855218;
                    } else {
                        iM2566 = C0630.m2566("᩵ۧ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29909)) ^ 1198695847;
                        i5 = -1529767242;
                    }
                    break;
            }
            return;
        }
    }
}
