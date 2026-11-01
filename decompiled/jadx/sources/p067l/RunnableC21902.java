package p067l;

import android.media.metrics.NetworkEvent;
import bin.p000mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC21902 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f68908;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f68909;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f68910;

    public /* synthetic */ RunnableC21902(int i, Object obj, Object obj2) {
        int i2 = 458272643;
        int i3 = C1071.f81975;
        int i4 = C0967.f81910;
        this.f68909 = i;
        this.f68910 = obj;
        this.f68908 = obj2;
        int iM55680 = (C0873.m55680("۠᩷") + i3) * (-5);
        int i5 = ((iM55680 ^ i4) * 24253) ^ 1087069477;
        int i6 = 1375247463;
        while (true) {
            i2 = (iM55680 ^ i6) ^ (i5 & (((i2 ^ i4) * 12637) >> 31));
            switch (i2) {
                case -2032984186:
                case 178513284:
                    C1071.m56343();
                    C1025.m56230();
                    iM55680 = C0946.m55979("ۙۤ") ^ i4;
                    i5 = ((iM55680 ^ i3) * 13979) ^ 367337120;
                    i6 = 704553811;
                    break;
                case -1571114964:
                case 806908457:
                    C0992.m56107();
                    throw new RuntimeException();
                case -984681933:
                case 1842301965:
                    if (C0949.f81897 < 0) {
                        iM55680 = C0873.m55680("ܺۗ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-25817)) ^ 1247818781;
                        i6 = 225915151;
                    } else {
                        iM55680 = C0946.m55979("ۙۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 13979) ^ 367337120;
                        i6 = 704553811;
                    }
                    break;
                case -630498145:
                case 145042931:
                    return;
                case -51129858:
                case 503018730:
                    C0930.m55885();
                    if (C1012.f81938 < 0) {
                        iM55680 = C0946.m55979("ۙۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 13979) ^ 367337120;
                        i6 = 704553811;
                    } else {
                        iM55680 = (C0946.m55979("᩺ۡ") + i3) * 37;
                        i5 = ((iM55680 ^ i4) * 16773) ^ (-1862995923);
                        i6 = 1557144272;
                    }
                    break;
                case 167895793:
                case 1764280180:
                    C0947.m55997();
                    if (C0845.f81821 < 0) {
                        iM55680 = C0873.m55680("ܺۗ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-25817)) ^ 1247818781;
                        i6 = 225915151;
                    } else {
                        iM55680 = (C0946.m55979("֨ۘ") ^ i3) * 21;
                        i5 = ((iM55680 ^ i4) * 31737) ^ (-892632624);
                        i6 = -777237938;
                    }
                    break;
                default:
                    if (C1046.f81962 <= 0) {
                        iM55680 = (i4 - C0946.m55979("ۧᩴ")) * 61;
                        i5 = ((iM55680 ^ i3) * (-1247)) ^ (-1649513810);
                        i6 = 1275826426;
                    } else {
                        iM55680 = C0873.m55680("ۖ֨") ^ i3;
                        i5 = ((iM55680 ^ i4) * 13651) ^ 1709321630;
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
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        C4697 c4697;
        C9315 c9315;
        int iM559710;
        int i4;
        int i5;
        int i6;
        RunnableC21902 runnableC21902 = this;
        Object obj = null;
        C18107 c18107 = null;
        AbstractC17043 abstractC17043 = null;
        ArrayList arrayList = null;
        C4697 c4698 = null;
        int i7 = 0;
        Object objM56196 = null;
        int i8 = 0;
        Object objM56197 = null;
        AbstractC17043 abstractC17043M27644 = null;
        InterfaceC22710 interfaceC22710 = null;
        C23380 c23380 = null;
        int i9 = 0;
        int i10 = 1292349426;
        int i11 = C0898.f81858;
        int i12 = C0877.f81843;
        int iM559711 = (C0946.m55979("ۧ᩸") ^ i12) * (-109);
        int i13 = ((iM559711 ^ i11) * 23409) ^ 1112618586;
        int i14 = iM559711 ^ (-1297186643);
        Object obj2 = null;
        while (true) {
            C9315 c9316 = null;
            while (true) {
                i10 = i14 ^ (i13 & (((i10 ^ i11) * (-6009)) >> 31));
                switch (i10) {
                    case -2147231060:
                    case -207699148:
                        C1048.m56305();
                        break;
                    case -2134034095:
                    case -1400766405:
                        c4697 = c4698;
                        c9315 = c9316;
                        ((C12073) objM56196).m27641();
                        i8 = 1;
                        if (RunnableC1014.f81941 <= 0) {
                            int iM559712 = C0946.m55979("ۜۙ") ^ i12;
                            i4 = ((iM559712 ^ i11) * 10287) ^ 1845510976;
                            i6 = iM559712 ^ (-647569767);
                            c9316 = null;
                        } else {
                            iM559710 = C0873.m55680("ܽ֨") ^ i11;
                            i4 = ((iM559710 ^ i12) * (-5425)) ^ 905193184;
                            i5 = -1124710737;
                            i6 = iM559710 ^ i5;
                            c9316 = c9315;
                        }
                        C4697 c4699 = c4697;
                        i14 = i6;
                        i13 = i4;
                        c4698 = c4699;
                        break;
                    case -1840564483:
                    case 1672532202:
                        if (C1229.f82066 >= 0) {
                            iM55979 = (C0946.m55979("ۧۚ") ^ i12) * (-125);
                            i = ((iM55979 ^ i11) * (-12073)) ^ 1811341075;
                            i2 = -1562566723;
                            i14 = iM55979 ^ i2;
                            i13 = i;
                        } else {
                            c4697 = c4698;
                            c9315 = c9316;
                            iM559710 = C0946.m55979("ۗ᩹") ^ i11;
                            i4 = ((iM559710 ^ i12) * (-3769)) ^ 483622329;
                            i5 = -2004405274;
                            i6 = iM559710 ^ i5;
                            c9316 = c9315;
                            C4697 c46910 = c4697;
                            i14 = i6;
                            i13 = i4;
                            c4698 = c46910;
                        }
                        break;
                    case -1410653390:
                    case 2072030266:
                        AbstractC17043 abstractC17043M27645 = ((C12073) C1017.m56196(arrayList, i8)).m27644();
                        if (C0949.f81897 < 0) {
                            String strM56086 = C0989.m56086(abstractC17043M27644);
                            String strM56087 = C0989.m56086(abstractC17043M27645);
                            if (C0890.f81849 != 0) {
                                c4697 = c4698;
                                int iM559713 = C0946.m55979("ۜۙ") ^ i12;
                                i4 = ((iM559713 ^ i11) * 10287) ^ 1845510976;
                                i6 = iM559713 ^ (-647569767);
                                c9316 = null;
                                C4697 c46911 = c4697;
                                i14 = i6;
                                i13 = i4;
                                c4698 = c46911;
                            } else {
                                C9315 c9317 = new C9315(abstractC17043M27644, abstractC17043M27645, strM56086, strM56087, c4698.m9970(), c4698.m9970());
                                if (RunnableC1014.f81941 <= 0) {
                                }
                                int iM559714 = (C0946.m55979("ܰ᩸") ^ i11) * 101;
                                i13 = ((iM559714 ^ i12) * (-12235)) ^ (-547906778);
                                c9316 = c9317;
                                i14 = iM559714 ^ (-1381696639);
                            }
                            break;
                        }
                        break;
                    case -1352997791:
                    case 1462312953:
                        if (C1229.f82066 >= 0) {
                        }
                        iM55979 = C0873.m55680("᩻ۡ") ^ i11;
                        i = ((iM55979 ^ i12) * 13005) ^ (-196225760);
                        i2 = -1697903885;
                        i14 = iM55979 ^ i2;
                        i13 = i;
                        break;
                    case -1267554452:
                    case -154331890:
                        c4697 = c4698;
                        c9315 = c9316;
                        ((C12073) C0992.m56115(arrayList, i8)).m27641();
                        objM56197 = C1017.m56196(arrayList, i7);
                        if (C1964.f83032 > 0) {
                            iM559710 = (C0873.m55680("᩸۟") + i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i4 = ((iM559710 ^ i11) * 4223) ^ (-82779627);
                            i5 = 1663144601;
                            i6 = iM559710 ^ i5;
                            c9316 = c9315;
                            C4697 c46912 = c4697;
                            i14 = i6;
                            i13 = i4;
                            c4698 = c46912;
                        } else {
                            c4698 = c4697;
                        }
                        break;
                    case -898066864:
                    case -158370486:
                        c4697 = c4698;
                        c9315 = c9316;
                        c18107 = (C18107) obj;
                        abstractC17043 = (AbstractC17043) obj2;
                        int i15 = Main.f30;
                        if (C1003.f81929 <= 0) {
                            int iM559715 = C0946.m55979("ۜۙ") ^ i12;
                            i4 = ((iM559715 ^ i11) * 10287) ^ 1845510976;
                            i6 = iM559715 ^ (-647569767);
                            c9316 = null;
                        } else {
                            iM559710 = (C0946.m55979("ۡۤ") ^ i12) * (-105);
                            i4 = ((iM559710 ^ i11) * (-12543)) ^ 1239075047;
                            i5 = -1322323987;
                            i6 = iM559710 ^ i5;
                            c9316 = c9315;
                        }
                        C4697 c46913 = c4697;
                        i14 = i6;
                        i13 = i4;
                        c4698 = c46913;
                        break;
                    case -890508334:
                    case -159026341:
                        C12664.m29120((C12664) obj, (Exception) obj2);
                        break;
                    case -774793595:
                    case 2020028906:
                        C9315 c9318 = c9316;
                        arrayList = (ArrayList) obj;
                        c4698 = (C4697) obj2;
                        if (C0894.m55769() < 0) {
                            int iM55681 = C0873.m55680("ܰ᩵") ^ i11;
                            i14 = iM55681 ^ 1306319825;
                            i13 = ((iM55681 ^ i12) * (-10023)) ^ (-884019667);
                            c9316 = c9318;
                            i7 = 0;
                        } else {
                            i7 = 0;
                        }
                        break;
                    case -715673431:
                    case 773694463:
                        c4698 = c4698;
                        c9316 = c9316;
                        int i16 = runnableC21902.f68909;
                        obj2 = runnableC21902.f68908;
                        obj = runnableC21902.f68910;
                        switch (i16) {
                            case 0:
                                iM55680 = C0873.m55680("ۨۗ") ^ i11;
                                i13 = ((iM55680 ^ i12) * (-4889)) ^ (-1976225716);
                                i3 = -32788883;
                                i14 = iM55680 ^ i3;
                                break;
                            case 1:
                                iM55680 = C0873.m55680("ܶܰ") ^ i12;
                                i13 = ((iM55680 ^ i11) * (-20621)) ^ (-1340196072);
                                i3 = 2107150571;
                                i14 = iM55680 ^ i3;
                                break;
                            case 2:
                                iM55680 = C0873.m55680("ܶ᩹") ^ i11;
                                i13 = ((iM55680 ^ i12) * 28811) ^ 1514805691;
                                i3 = -33452400;
                                i14 = iM55680 ^ i3;
                                break;
                            case 3:
                                int iM559716 = (C0946.m55979("ۖۗ") ^ i12) * (-41);
                                i14 = iM559716 ^ 1297952046;
                                i13 = ((iM559716 ^ i11) * 19351) ^ (-1262952581);
                                break;
                            default:
                                iM55680 = C0873.m55680("ܿᩴ") ^ i12;
                                i13 = ((iM55680 ^ i11) * (-23347)) ^ (-904126531);
                                i3 = -1574044398;
                                i14 = iM55680 ^ i3;
                                break;
                        }
                        runnableC21902 = this;
                        break;
                    case -385288863:
                    case 1163404636:
                        c4697 = c4698;
                        c9315 = c9316;
                        objM56196 = C1017.m56196(arrayList, i7);
                        if (C0917.f81868) {
                            iM559710 = C0946.m55979("ۗ᩹") ^ i11;
                            i4 = ((iM559710 ^ i12) * (-3769)) ^ 483622329;
                            i5 = -2004405274;
                        } else {
                            iM559710 = C0946.m55979("۬ܺ") ^ i12;
                            i4 = ((iM559710 ^ i11) * (-32663)) ^ 1170961017;
                            i5 = 243465858;
                        }
                        i6 = iM559710 ^ i5;
                        c9316 = c9315;
                        C4697 c46914 = c4697;
                        i14 = i6;
                        i13 = i4;
                        c4698 = c46914;
                        break;
                    case -332206082:
                    case 1996069709:
                        interfaceC22710.mo24481(i9, c23380.f74495);
                        interfaceC22710.mo24483();
                        break;
                    case -237202687:
                    case 829833894:
                        C18107 c18107M9969 = c4698.m9969();
                        c9316.m21561();
                        C14241.m32724(c18107M9969, c9316);
                        break;
                    case 275341183:
                    case 1780017858:
                        new DialogInterfaceOnClickListenerC20813(c18107, C1046.m56297(abstractC17043));
                        break;
                    case 567734999:
                    case 1946125258:
                        C1071.m56343();
                        c4697 = c4698;
                        c9315 = c9316;
                        iM559710 = C0946.m55979("ۗ᩹") ^ i11;
                        i4 = ((iM559710 ^ i12) * (-3769)) ^ 483622329;
                        i5 = -2004405274;
                        i6 = iM559710 ^ i5;
                        c9316 = c9315;
                        C4697 c46915 = c4697;
                        i14 = i6;
                        i13 = i4;
                        c4698 = c46915;
                        break;
                    case 744627226:
                    case 1277477991:
                        interfaceC22710 = (InterfaceC22710) obj;
                        c23380 = (C23380) obj2;
                        i9 = c23380.f74494;
                        if (C0927.m55873() <= 0) {
                            iM55979 = (C0946.m55979("ۧۚ") ^ i12) * (-125);
                            i = ((iM55979 ^ i11) * (-12073)) ^ 1811341075;
                            i2 = -1562566723;
                        } else {
                            iM55979 = (i12 - C0873.m55680("ۗ᩺")) * (-35);
                            i = ((iM55979 ^ i11) * 3269) ^ (-132981231);
                            i2 = -39218497;
                        }
                        i14 = iM55979 ^ i2;
                        i13 = i;
                        break;
                    case 925821092:
                    case 1627126798:
                        C0947.m55997();
                        if (C1404.f82149 < 0) {
                            iM55979 = C0873.m55680("᩻ۡ") ^ i11;
                            i = ((iM55979 ^ i12) * 13005) ^ (-196225760);
                            i2 = -1697903885;
                            i14 = iM55979 ^ i2;
                            i13 = i;
                        } else {
                            c4697 = c4698;
                            c9315 = c9316;
                            iM559710 = C0946.m55979("ۗ᩹") ^ i11;
                            i4 = ((iM559710 ^ i12) * (-3769)) ^ 483622329;
                            i5 = -2004405274;
                            i6 = iM559710 ^ i5;
                            c9316 = c9315;
                            C4697 c46916 = c4697;
                            i14 = i6;
                            i13 = i4;
                            c4698 = c46916;
                        }
                        break;
                    case 1753253837:
                    case 1931321020:
                        c9315 = c9316;
                        abstractC17043M27644 = ((C12073) objM56197).m27644();
                        if (!C1025.m56230()) {
                            iM559710 = C0946.m55979("ܺۗ") ^ i11;
                            c4697 = c4698;
                            i4 = ((iM559710 ^ i12) * 12079) ^ (-488504976);
                            i5 = 1929661743;
                            i6 = iM559710 ^ i5;
                            c9316 = c9315;
                            C4697 c46917 = c4697;
                            i14 = i6;
                            i13 = i4;
                            c4698 = c46917;
                        }
                        c4697 = c4698;
                        int iM559717 = C0946.m55979("ۜۙ") ^ i12;
                        i4 = ((iM559717 ^ i11) * 10287) ^ 1845510976;
                        i6 = iM559717 ^ (-647569767);
                        c9316 = null;
                        C4697 c46918 = c4697;
                        i14 = i6;
                        i13 = i4;
                        c4698 = c46918;
                        break;
                    default:
                        ((C13502) obj).f37960.reportNetworkEvent((NetworkEvent) obj2);
                        break;
                }
                return;
            }
            int iM559718 = C0946.m55979("ۘ۫") ^ i11;
            i14 = iM559718 ^ 1753161941;
            i13 = ((iM559718 ^ i12) * (-18931)) ^ (-1489581916);
        }
    }
}
