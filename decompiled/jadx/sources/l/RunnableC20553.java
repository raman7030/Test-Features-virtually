package l;

import android.media.metrics.NetworkEvent;
import bin.mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20553 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66227;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66228;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66229;

    public /* synthetic */ RunnableC20553(int i, Object obj, Object obj2) {
        int i2 = 458272643;
        int i3 = C4616.f14690;
        int i4 = C2520.f8000;
        this.f66228 = i;
        this.f66229 = obj;
        this.f66227 = obj2;
        int iM2566 = (C0630.m2566("۠᩷") + i3) * (-5);
        int i5 = ((iM2566 ^ i4) * 24253) ^ 1087069477;
        int i6 = 1375247463;
        while (true) {
            i2 = (iM2566 ^ i6) ^ (i5 & (((i2 ^ i4) * 12637) >> 31));
            switch (i2) {
                case -2032984186:
                case 178513284:
                    C4616.m13552();
                    C3683.m11222();
                    iM2566 = C2105.m6981("ۙۤ") ^ i4;
                    i5 = ((iM2566 ^ i3) * 13979) ^ 367337120;
                    i6 = 704553811;
                    break;
                case -1571114964:
                case 806908457:
                    C3019.m9255();
                    throw new RuntimeException();
                case -984681933:
                case 1842301965:
                    if (C2167.f7158 < 0) {
                        iM2566 = C0630.m2566("ܺۗ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-25817)) ^ 1247818781;
                        i6 = 225915151;
                    } else {
                        iM2566 = C2105.m6981("ۙۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 13979) ^ 367337120;
                        i6 = 704553811;
                    }
                    break;
                case -630498145:
                case 145042931:
                    return;
                case -51129858:
                case 503018730:
                    C1773.m5908();
                    if (C3432.f10845 < 0) {
                        iM2566 = C2105.m6981("ۙۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 13979) ^ 367337120;
                        i6 = 704553811;
                    } else {
                        iM2566 = (C2105.m6981("᩺ۡ") + i3) * 37;
                        i5 = ((iM2566 ^ i4) * 16773) ^ (-1862995923);
                        i6 = 1557144272;
                    }
                    break;
                case 167895793:
                case 1764280180:
                    C2126.m7040();
                    if (C0050.f910 < 0) {
                        iM2566 = C0630.m2566("ܺۗ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-25817)) ^ 1247818781;
                        i6 = 225915151;
                    } else {
                        iM2566 = (C2105.m6981("֨ۘ") ^ i3) * 21;
                        i5 = ((iM2566 ^ i4) * 31737) ^ (-892632624);
                        i6 = -777237938;
                    }
                    break;
                default:
                    if (C4117.f13076 <= 0) {
                        iM2566 = (i4 - C2105.m6981("ۧᩴ")) * 61;
                        i5 = ((iM2566 ^ i3) * (-1247)) ^ (-1649513810);
                        i6 = 1275826426;
                    } else {
                        iM2566 = C0630.m2566("ۖ֨") ^ i3;
                        i5 = ((iM2566 ^ i4) * 13651) ^ 1709321630;
                        i6 = 773728929;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x024e A[PHI: r3 r4 r9 r11 r19
      0x024e: PHI (r3v5 l.ܽۢܳ) = (r3v4 l.ܽۢܳ), (r3v2 l.ܽۢܳ), (r3v2 l.ܽۢܳ) binds: [B:66:0x024c, B:49:0x0190, B:42:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r4v5 l.ܶ᩵ܿ) = (r4v4 l.ܶ᩵ܿ), (r4v2 l.ܶ᩵ܿ), (r4v2 l.ܶ᩵ܿ) binds: [B:66:0x024c, B:49:0x0190, B:42:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:66:0x024c, B:49:0x0190, B:42:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r11v4 l.ܶ᩵ܿ) = (r11v2 l.ܶ᩵ܿ), (r11v2 l.ܶ᩵ܿ), (r11v5 l.ܶ᩵ܿ) binds: [B:66:0x024c, B:49:0x0190, B:42:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r19v25 l.ۖۢܳ) = (r19v19 l.ۖۢܳ), (r19v22 l.ۖۢܳ), (r19v26 l.ۖۢܳ) binds: [B:66:0x024c, B:49:0x0190, B:42:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        C2450 c2450;
        C7309 c7309;
        int iM6982;
        int i4;
        int i5;
        int i6;
        RunnableC20553 runnableC20553 = this;
        Object obj = null;
        C16560 c16560 = null;
        AbstractC15440 abstractC15440 = null;
        ArrayList arrayList = null;
        C2450 c2451 = null;
        int i7 = 0;
        Object objM10755 = null;
        int i8 = 0;
        Object objM10756 = null;
        AbstractC15440 abstractC15440M25622 = null;
        InterfaceC21403 interfaceC21403 = null;
        C22108 c22108 = null;
        int i9 = 0;
        int i10 = 1292349426;
        int i11 = C1128.f4106;
        int i12 = C0714.f2697;
        int iM6983 = (C2105.m6981("ۧ᩸") ^ i12) * (-109);
        int i13 = ((iM6983 ^ i11) * 23409) ^ 1112618586;
        int i14 = iM6983 ^ (-1297186643);
        Object obj2 = null;
        while (true) {
            C7309 c73010 = null;
            while (true) {
                i10 = i14 ^ (i13 & (((i10 ^ i11) * (-6009)) >> 31));
                switch (i10) {
                    case -2147231060:
                    case -207699148:
                        C4159.m12565();
                        break;
                    case -2134034095:
                    case -1400766405:
                        c2450 = c2451;
                        c7309 = c73010;
                        ((C10211) objM10755).m25619();
                        i8 = 1;
                        if (RunnableC3474.f10992 <= 0) {
                            int iM6984 = C2105.m6981("ۜۙ") ^ i12;
                            i4 = ((iM6984 ^ i11) * 10287) ^ 1845510976;
                            i6 = iM6984 ^ (-647569767);
                            c73010 = null;
                        } else {
                            iM6982 = C0630.m2566("ܽ֨") ^ i11;
                            i4 = ((iM6982 ^ i12) * (-5425)) ^ 905193184;
                            i5 = -1124710737;
                            i6 = iM6982 ^ i5;
                            c73010 = c7309;
                        }
                        C2450 c2452 = c2450;
                        i14 = i6;
                        i13 = i4;
                        c2451 = c2452;
                        break;
                    case -1840564483:
                    case 1672532202:
                        if (C7811.f24123 >= 0) {
                            iM6981 = (C2105.m6981("ۧۚ") ^ i12) * (-125);
                            i = ((iM6981 ^ i11) * (-12073)) ^ 1811341075;
                            i2 = -1562566723;
                            i14 = iM6981 ^ i2;
                            i13 = i;
                        } else {
                            c2450 = c2451;
                            c7309 = c73010;
                            iM6982 = C2105.m6981("ۗ᩹") ^ i11;
                            i4 = ((iM6982 ^ i12) * (-3769)) ^ 483622329;
                            i5 = -2004405274;
                            i6 = iM6982 ^ i5;
                            c73010 = c7309;
                            C2450 c2453 = c2450;
                            i14 = i6;
                            i13 = i4;
                            c2451 = c2453;
                        }
                        break;
                    case -1410653390:
                    case 2072030266:
                        AbstractC15440 abstractC15440M25623 = ((C10211) C3537.m10755(arrayList, i8)).m25622();
                        if (C2167.f7158 < 0) {
                            String strM9025 = C2958.m9025(abstractC15440M25622);
                            String strM9026 = C2958.m9025(abstractC15440M25623);
                            if (C0964.f3626 != 0) {
                                c2450 = c2451;
                                int iM6985 = C2105.m6981("ۜۙ") ^ i12;
                                i4 = ((iM6985 ^ i11) * 10287) ^ 1845510976;
                                i6 = iM6985 ^ (-647569767);
                                c73010 = null;
                                C2450 c2454 = c2450;
                                i14 = i6;
                                i13 = i4;
                                c2451 = c2454;
                            } else {
                                C7309 c73011 = new C7309(abstractC15440M25622, abstractC15440M25623, strM9025, strM9026, c2451.m7922(), c2451.m7922());
                                if (RunnableC3474.f10992 <= 0) {
                                }
                                int iM6986 = (C2105.m6981("ܰ᩸") ^ i11) * 101;
                                i13 = ((iM6986 ^ i12) * (-12235)) ^ (-547906778);
                                c73010 = c73011;
                                i14 = iM6986 ^ (-1381696639);
                            }
                            break;
                        }
                        break;
                    case -1352997791:
                    case 1462312953:
                        if (C7811.f24123 >= 0) {
                        }
                        iM6981 = C0630.m2566("᩻ۡ") ^ i11;
                        i = ((iM6981 ^ i12) * 13005) ^ (-196225760);
                        i2 = -1697903885;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        break;
                    case -1267554452:
                    case -154331890:
                        c2450 = c2451;
                        c7309 = c73010;
                        ((C10211) C3019.m9263(arrayList, i8)).m25619();
                        objM10756 = C3537.m10755(arrayList, i7);
                        if (C22628.f73083 > 0) {
                            iM6982 = (C0630.m2566("᩸۟") + i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i4 = ((iM6982 ^ i11) * 4223) ^ (-82779627);
                            i5 = 1663144601;
                            i6 = iM6982 ^ i5;
                            c73010 = c7309;
                            C2450 c2455 = c2450;
                            i14 = i6;
                            i13 = i4;
                            c2451 = c2455;
                        } else {
                            c2451 = c2450;
                        }
                        break;
                    case -898066864:
                    case -158370486:
                        c2450 = c2451;
                        c7309 = c73010;
                        c16560 = (C16560) obj;
                        abstractC15440 = (AbstractC15440) obj2;
                        int i15 = Main.f30;
                        if (C3245.f10203 <= 0) {
                            int iM6987 = C2105.m6981("ۜۙ") ^ i12;
                            i4 = ((iM6987 ^ i11) * 10287) ^ 1845510976;
                            i6 = iM6987 ^ (-647569767);
                            c73010 = null;
                        } else {
                            iM6982 = (C2105.m6981("ۡۤ") ^ i12) * (-105);
                            i4 = ((iM6982 ^ i11) * (-12543)) ^ 1239075047;
                            i5 = -1322323987;
                            i6 = iM6982 ^ i5;
                            c73010 = c7309;
                        }
                        C2450 c2456 = c2450;
                        i14 = i6;
                        i13 = i4;
                        c2451 = c2456;
                        break;
                    case -890508334:
                    case -159026341:
                        C10833.m27075((C10833) obj, (Exception) obj2);
                        break;
                    case -774793595:
                    case 2020028906:
                        C7309 c73012 = c73010;
                        arrayList = (ArrayList) obj;
                        c2451 = (C2450) obj2;
                        if (C1047.m3599() < 0) {
                            int iM2567 = C0630.m2566("ܰ᩵") ^ i11;
                            i14 = iM2567 ^ 1306319825;
                            i13 = ((iM2567 ^ i12) * (-10023)) ^ (-884019667);
                            c73010 = c73012;
                            i7 = 0;
                        } else {
                            i7 = 0;
                        }
                        break;
                    case -715673431:
                    case 773694463:
                        c2451 = c2451;
                        c73010 = c73010;
                        int i16 = runnableC20553.f66228;
                        obj2 = runnableC20553.f66227;
                        obj = runnableC20553.f66229;
                        switch (i16) {
                            case 0:
                                iM2566 = C0630.m2566("ۨۗ") ^ i11;
                                i13 = ((iM2566 ^ i12) * (-4889)) ^ (-1976225716);
                                i3 = -32788883;
                                i14 = iM2566 ^ i3;
                                break;
                            case 1:
                                iM2566 = C0630.m2566("ܶܰ") ^ i12;
                                i13 = ((iM2566 ^ i11) * (-20621)) ^ (-1340196072);
                                i3 = 2107150571;
                                i14 = iM2566 ^ i3;
                                break;
                            case 2:
                                iM2566 = C0630.m2566("ܶ᩹") ^ i11;
                                i13 = ((iM2566 ^ i12) * 28811) ^ 1514805691;
                                i3 = -33452400;
                                i14 = iM2566 ^ i3;
                                break;
                            case 3:
                                int iM6988 = (C2105.m6981("ۖۗ") ^ i12) * (-41);
                                i14 = iM6988 ^ 1297952046;
                                i13 = ((iM6988 ^ i11) * 19351) ^ (-1262952581);
                                break;
                            default:
                                iM2566 = C0630.m2566("ܿᩴ") ^ i12;
                                i13 = ((iM2566 ^ i11) * (-23347)) ^ (-904126531);
                                i3 = -1574044398;
                                i14 = iM2566 ^ i3;
                                break;
                        }
                        runnableC20553 = this;
                        break;
                    case -385288863:
                    case 1163404636:
                        c2450 = c2451;
                        c7309 = c73010;
                        objM10755 = C3537.m10755(arrayList, i7);
                        if (C1504.f5354) {
                            iM6982 = C2105.m6981("ۗ᩹") ^ i11;
                            i4 = ((iM6982 ^ i12) * (-3769)) ^ 483622329;
                            i5 = -2004405274;
                        } else {
                            iM6982 = C2105.m6981("۬ܺ") ^ i12;
                            i4 = ((iM6982 ^ i11) * (-32663)) ^ 1170961017;
                            i5 = 243465858;
                        }
                        i6 = iM6982 ^ i5;
                        c73010 = c7309;
                        C2450 c2457 = c2450;
                        i14 = i6;
                        i13 = i4;
                        c2451 = c2457;
                        break;
                    case -332206082:
                    case 1996069709:
                        interfaceC21403.mo22512(i9, c22108.f71773);
                        interfaceC21403.mo22514();
                        break;
                    case -237202687:
                    case 829833894:
                        C16560 c16560M7921 = c2451.m7921();
                        c73010.m19593();
                        C12492.m30659(c16560M7921, c73010);
                        break;
                    case 275341183:
                    case 1780017858:
                        new DialogInterfaceOnClickListenerC19407(c16560, C4117.m12359(abstractC15440));
                        break;
                    case 567734999:
                    case 1946125258:
                        C4616.m13552();
                        c2450 = c2451;
                        c7309 = c73010;
                        iM6982 = C2105.m6981("ۗ᩹") ^ i11;
                        i4 = ((iM6982 ^ i12) * (-3769)) ^ 483622329;
                        i5 = -2004405274;
                        i6 = iM6982 ^ i5;
                        c73010 = c7309;
                        C2450 c2458 = c2450;
                        i14 = i6;
                        i13 = i4;
                        c2451 = c2458;
                        break;
                    case 744627226:
                    case 1277477991:
                        interfaceC21403 = (InterfaceC21403) obj;
                        c22108 = (C22108) obj2;
                        i9 = c22108.f71772;
                        if (C1711.m5736() <= 0) {
                            iM6981 = (C2105.m6981("ۧۚ") ^ i12) * (-125);
                            i = ((iM6981 ^ i11) * (-12073)) ^ 1811341075;
                            i2 = -1562566723;
                        } else {
                            iM6981 = (i12 - C0630.m2566("ۗ᩺")) * (-35);
                            i = ((iM6981 ^ i11) * 3269) ^ (-132981231);
                            i2 = -39218497;
                        }
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        break;
                    case 925821092:
                    case 1627126798:
                        C2126.m7040();
                        if (C11340.f33930 < 0) {
                            iM6981 = C0630.m2566("᩻ۡ") ^ i11;
                            i = ((iM6981 ^ i12) * 13005) ^ (-196225760);
                            i2 = -1697903885;
                            i14 = iM6981 ^ i2;
                            i13 = i;
                        } else {
                            c2450 = c2451;
                            c7309 = c73010;
                            iM6982 = C2105.m6981("ۗ᩹") ^ i11;
                            i4 = ((iM6982 ^ i12) * (-3769)) ^ 483622329;
                            i5 = -2004405274;
                            i6 = iM6982 ^ i5;
                            c73010 = c7309;
                            C2450 c2459 = c2450;
                            i14 = i6;
                            i13 = i4;
                            c2451 = c2459;
                        }
                        break;
                    case 1753253837:
                    case 1931321020:
                        c7309 = c73010;
                        abstractC15440M25622 = ((C10211) objM10756).m25622();
                        if (!C3683.m11222()) {
                            iM6982 = C2105.m6981("ܺۗ") ^ i11;
                            c2450 = c2451;
                            i4 = ((iM6982 ^ i12) * 12079) ^ (-488504976);
                            i5 = 1929661743;
                            i6 = iM6982 ^ i5;
                            c73010 = c7309;
                            C2450 c24510 = c2450;
                            i14 = i6;
                            i13 = i4;
                            c2451 = c24510;
                        }
                        c2450 = c2451;
                        int iM6989 = C2105.m6981("ۜۙ") ^ i12;
                        i4 = ((iM6989 ^ i11) * 10287) ^ 1845510976;
                        i6 = iM6989 ^ (-647569767);
                        c73010 = null;
                        C2450 c24511 = c2450;
                        i14 = i6;
                        i13 = i4;
                        c2451 = c24511;
                        break;
                    default:
                        ((C11715) obj).f34960.reportNetworkEvent((NetworkEvent) obj2);
                        break;
                }
                return;
            }
            int iM69810 = C2105.m6981("ۘ۫") ^ i11;
            i14 = iM69810 ^ 1753161941;
            i13 = ((iM69810 ^ i12) * (-18931)) ^ (-1489581916);
        }
    }
}
