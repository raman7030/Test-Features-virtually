package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩶ܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 82RX */
/* JADX INFO: loaded from: classes5.dex */
public final class C20301 extends AbstractC19902 {

    /* JADX INFO: renamed from: ᩴ֫ۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f65558 = {5606, -16424, -18350, 21756, 14948, 14948, 14948, 25974, 22326, 18961, 8173, 1877, -2367, -4649};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13244 f65559;

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        int itemCount = 0;
        int i2 = 0;
        int i3 = 182325019;
        int i4 = C0483.f2088;
        int i5 = C5695.f17556;
        int iM2566 = C0630.m2566("۟֡") ^ i5;
        int i6 = ((iM2566 ^ i4) * (-2215)) ^ 1807412436;
        int i7 = 1850449695;
        while (true) {
            i3 = ((((i3 ^ i4) * (-31437)) >> 31) & i6) ^ (iM2566 ^ i7);
            switch (i3) {
                case -2135645981:
                case -1705215344:
                    return i2;
                case -2014261182:
                case 2137762510:
                    RunnableC1937.m6387();
                    iM2566 = (C0630.m2566("ۧ۠") ^ i5) * (-17);
                    i6 = ((iM2566 ^ i4) * 19877) ^ 959998547;
                    i7 = 67194572;
                    break;
                case -1978703009:
                case 318182550:
                    if (C3911.m11924() <= 0) {
                        iM2566 = C2105.m6981("۠֡") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-11907)) ^ 707384557;
                        i7 = 817532220;
                    } else {
                        iM2566 = C0630.m2566("۬۠") ^ i5;
                        i6 = ((iM2566 ^ i4) * 21885) ^ 492467193;
                        i7 = -610211247;
                    }
                    break;
                case -1885845629:
                case 2009483641:
                    C0630.m2564();
                    if (!C3683.m11222()) {
                        iM2566 = (C0630.m2566("ۧ۠") ^ i5) * (-17);
                        i6 = ((iM2566 ^ i4) * 19877) ^ 959998547;
                        i7 = 67194572;
                    } else {
                        iM2566 = (C0630.m2566("᩶ۘ") ^ i4) * (-127);
                        i6 = ((iM2566 ^ i5) * 6211) ^ 864567022;
                        i7 = -921105181;
                    }
                    break;
                case -1866400661:
                case -542588251:
                    if (C2126.f7087) {
                        iM2566 = (C0630.m2566("ۗܺ") + i4) * (-27);
                        i6 = ((iM2566 ^ i5) * (-24251)) ^ (-1887304809);
                        i7 = 31869937;
                    } else {
                        iM2566 = C2105.m6981("ۢܺ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 16705) ^ 1852136965;
                        i7 = -841703923;
                    }
                    break;
                case -1528319980:
                case -206000367:
                    if (C2272.f7362) {
                        iM2566 = C2105.m6981("۠֡") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-11907)) ^ 707384557;
                        i7 = 817532220;
                    } else {
                        iM2566 = (C0630.m2566("֡ۙ") ^ i5) * 21;
                        i6 = ((iM2566 ^ i4) * (-23731)) ^ 1307522533;
                        i7 = -1559824496;
                    }
                    break;
                case -1307205631:
                case -800387568:
                    i2 = 1;
                    if (i == itemCount - 1) {
                        iM2566 = C2105.m6981("ܶۘ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 7319) ^ (-754045527);
                        i7 = 1837328086;
                    } else {
                        iM2566 = C2105.m6981("ۗۘ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-14181)) ^ 2029937990;
                        i7 = -1672066707;
                    }
                    break;
                case -1139749579:
                case 2118847888:
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C0630.m2566("᩶ۘ") ^ i4) * (-127);
                        i6 = ((iM2566 ^ i5) * 6211) ^ 864567022;
                        i7 = -921105181;
                    } else {
                        iM2566 = (C0630.m2566("ܶᩴ") ^ i4) * (-27);
                        i6 = ((iM2566 ^ i5) * (-29493)) ^ (-1444833459);
                        i7 = 153431974;
                    }
                    break;
                case -783453064:
                case 2115592183:
                    if (C0964.f3626 != 0) {
                        iM2566 = (i5 - C0630.m2566("۬۫")) * (-25);
                        i6 = ((iM2566 ^ i4) * (-28159)) ^ (-298239471);
                        i7 = -1569377903;
                    } else {
                        iM2566 = (C0630.m2566("֨۟") + i5) * 51;
                        i6 = ((iM2566 ^ i4) * 6283) ^ (-1928394285);
                        i7 = 16780616;
                    }
                    break;
                case -695611989:
                case 703253654:
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C0630.m2566("ۧ۠") ^ i5) * (-17);
                        i6 = ((iM2566 ^ i4) * 19877) ^ 959998547;
                        i7 = 67194572;
                    } else {
                        iM2566 = (i5 - C0630.m2566("ܶ᩸")) * (-123);
                        i6 = ((iM2566 ^ i4) * (-31901)) ^ (-1512294501);
                        i7 = -1158981604;
                    }
                    break;
                case -607629966:
                case 1126150914:
                    itemCount = getItemCount();
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("۠֡") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-11907)) ^ 707384557;
                        i7 = 817532220;
                    } else {
                        iM2566 = C2105.m6981("ܿ᩷") ^ i4;
                        i6 = ((iM2566 ^ i5) * 17731) ^ (-953624331);
                        i7 = 1832258842;
                    }
                    break;
                case -314224182:
                case -170909788:
                    if (C0483.m2121()) {
                        iM2566 = C0630.m2566("ۙۖ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 22967) ^ (-1301381407);
                        i7 = 9129915;
                    } else {
                        iM2566 = (C0630.m2566("ۧ۠") ^ i5) * (-17);
                        i6 = ((iM2566 ^ i4) * 19877) ^ 959998547;
                        i7 = 67194572;
                    }
                    break;
                case -275185154:
                case 1842887890:
                    C22628.m50615();
                    if (C1047.f3863 < 0) {
                        iM2566 = (C0630.m2566("ۗܺ") + i4) * (-27);
                        i6 = ((iM2566 ^ i5) * (-24251)) ^ (-1887304809);
                        i7 = 31869937;
                    } else {
                        iM2566 = (i5 - C0630.m2566("۬۫")) * (-25);
                        i6 = ((iM2566 ^ i4) * (-28159)) ^ (-298239471);
                        i7 = -1569377903;
                    }
                    break;
                case -157972360:
                case 994669662:
                    C3537.m10746();
                    return 0;
                case -147367586:
                case 1131791759:
                    return 0;
                case 284493269:
                case 1992853103:
                    C0964.m3413();
                    if (!C0964.m3413()) {
                        iM2566 = (C0630.m2566("ۧ۠") ^ i5) * (-17);
                        i6 = ((iM2566 ^ i4) * 19877) ^ 959998547;
                        i7 = 67194572;
                    } else {
                        iM2566 = (i5 - C0630.m2566("۬۫")) * (-25);
                        i6 = ((iM2566 ^ i4) * (-28159)) ^ (-298239471);
                        i7 = -1569377903;
                    }
                    break;
                case 915871602:
                case 2065975851:
                    if (C3911.m11924() <= 0) {
                        iM2566 = (C0630.m2566("᩶ۘ") ^ i4) * (-127);
                        i6 = ((iM2566 ^ i5) * 6211) ^ 864567022;
                        i7 = -921105181;
                    } else {
                        iM2566 = C2105.m6981("ۜ᩸") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-20255)) ^ (-1016387763);
                        i7 = 2076444939;
                    }
                    break;
                default:
                    if (RunnableC1108.f4040) {
                        iM2566 = C2105.m6981("۟᩸") ^ i5;
                        i6 = ((iM2566 ^ i4) * 7377) ^ 990164947;
                        i7 = 7511780;
                    } else {
                        iM2566 = C2105.m6981("۠֡") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-11907)) ^ 707384557;
                        i7 = 817532220;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x015c A[PHI: r2 r4 r5
      0x015c: PHI (r2v4 android.view.View) = (r2v2 android.view.View), (r2v3 android.view.View), (r2v2 android.view.View), (r2v2 android.view.View) binds: [B:25:0x00a8, B:44:0x015a, B:12:0x0064, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r4v5 int) = (r4v4 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:25:0x00a8, B:44:0x015a, B:12:0x0064, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r5v8 boolean) = (r5v3 boolean), (r5v2 boolean), (r5v2 boolean), (r5v2 boolean) binds: [B:25:0x00a8, B:44:0x015a, B:12:0x0064, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021d A[PHI: r3 r6 r9 r10 r12 r13
      0x021d: PHI (r3v4 android.view.LayoutInflater) = (r3v2 android.view.LayoutInflater), (r3v3 android.view.LayoutInflater), (r3v2 android.view.LayoutInflater) binds: [B:60:0x021b, B:32:0x00fc, B:98:0x021d] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v7 int) binds: [B:60:0x021b, B:32:0x00fc, B:98:0x021d] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:60:0x021b, B:32:0x00fc, B:98:0x021d] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:60:0x021b, B:32:0x00fc, B:98:0x021d] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:60:0x021b, B:32:0x00fc, B:98:0x021d] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:60:0x021b, B:32:0x00fc, B:98:0x021d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0284 A[PHI: r8 r18
      0x0284: PHI (r8v3 short) = (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v6 short) binds: [B:69:0x0282, B:65:0x0264, B:36:0x011b, B:18:0x0088, B:15:0x006c, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0284: PHI (r18v5 short[]) = (r18v3 short[]), (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:69:0x0282, B:65:0x0264, B:36:0x011b, B:18:0x0088, B:15:0x006c, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iM6981;
        int i2;
        int i3;
        int iM2566;
        int i4;
        int i5 = C1294.f4556;
        int i6 = C3537.f11231;
        int iM6982 = C2105.m6981("᩺ۢ") ^ i6;
        int i7 = ((iM6982 ^ i5) * (-18837)) ^ 2088328626;
        LayoutInflater layoutInflaterFrom = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM6982 ^ (-1237512376);
        int i9 = 0;
        boolean z = false;
        int iM6983 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1870162536;
        View view = null;
        C13244 c13244 = null;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i5) * 18223) >> 31));
            switch (i13) {
                case -2007142393:
                case 1291221459:
                    i11 = 31878;
                    iM6981 = (C2105.m6981("۬᩹") + i5) * (-23);
                    i2 = ((iM6981 ^ i6) * 7829) ^ 1970329436;
                    i3 = 4963639;
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
                case -1819900550:
                case 2057495552:
                    C2272.m7503();
                    if (C1047.m3599() < 0) {
                        iM6981 = (i6 - C0630.m2566("֡۬")) * 11;
                        i2 = ((iM6981 ^ i5) * (-25865)) ^ (-696900999);
                        i3 = 113385064;
                    } else {
                        iM6981 = C0630.m2566("ᩴܳ") ^ i5;
                        i2 = ((iM6981 ^ i6) * 2725) ^ 492336627;
                        i3 = -1128570532;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
                case -1664677418:
                case 69838333:
                    C5695.m16023();
                    iM6981 = (C2105.m6981("ۙ۟") ^ i5) * (-107);
                    i2 = ((iM6981 ^ i6) * 16509) ^ 965533721;
                    i3 = -184033185;
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
                case -1510123774:
                case -792134353:
                    i9 = 2129601479 ^ iM6983;
                    if (C2520.f8000 >= 0) {
                        z = false;
                        iM6981 = C0630.m2566("ᩴܳ") ^ i5;
                        i2 = ((iM6981 ^ i6) * 2725) ^ 492336627;
                        i3 = -1128570532;
                        i8 = iM6981 ^ i3;
                        i7 = i2;
                    } else {
                        int iM6984 = (C2105.m6981("᩺ۖ") ^ i6) * 61;
                        i7 = ((iM6984 ^ i5) * 873) ^ 891887459;
                        i8 = iM6984 ^ (-1094432392);
                        z = false;
                    }
                    break;
                case -1393322963:
                case 330361928:
                    C22628.m50615();
                    if (C0714.f2697 < 0) {
                        iM6981 = (C2105.m6981("ۙ۟") ^ i5) * (-107);
                        i2 = ((iM6981 ^ i6) * 16509) ^ 965533721;
                        i3 = -184033185;
                    } else {
                        iM6981 = (i6 - C0630.m2566("֡۬")) * 11;
                        i2 = ((iM6981 ^ i5) * (-25865)) ^ (-696900999);
                        i3 = 113385064;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
                case -1347447820:
                case 927202946:
                    sArr = f65558;
                    if (C1916.m6308() >= 0) {
                        iM6981 = (C2105.m6981("ۙ۟") ^ i5) * (-107);
                        i2 = ((iM6981 ^ i6) * 16509) ^ 965533721;
                        i3 = -184033185;
                    } else {
                        iM6981 = (i6 - C0630.m2566("ܽۚ")) * (-95);
                        i2 = ((iM6981 ^ i5) * (-9023)) ^ (-1657618046);
                        i3 = -1276807237;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
                case -996935744:
                case -160061136:
                    layoutInflaterFrom = LayoutInflater.from(c13244.f39637);
                    sArr2 = f65558;
                    i12 = 11;
                    if (C3019.f9544 >= 0) {
                        iM6981 = (C2105.m6981("ܿ֨") ^ i6) * (-87);
                        i2 = ((iM6981 ^ i5) * 6205) ^ 965513949;
                        i3 = -2090307520;
                    } else {
                        iM6981 = (C0630.m2566("ۖ֨") ^ i5) * (-13);
                        i2 = ((iM6981 ^ i6) * (-27453)) ^ 128606815;
                        i3 = -167890042;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
                case -911402264:
                case -166697856:
                    view = new View(c13244.f39637);
                    if (C2105.m6982() != 0) {
                        iM6981 = C0630.m2566("ᩴܳ") ^ i5;
                        i2 = ((iM6981 ^ i6) * 2725) ^ 492336627;
                        i3 = -1128570532;
                    } else {
                        iM6981 = (C2105.m6981("ܿܰ") + i6) * (-39);
                        i2 = ((iM6981 ^ i5) * 8281) ^ 39430514;
                        i3 = 437380706;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
                case -784466757:
                case -61415971:
                    i10 = s * 63676;
                    s2 = 15919;
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C2105.m6981("ܿ֨") ^ i6) * (-87);
                        i2 = ((iM6981 ^ i5) * 6205) ^ 965513949;
                        i3 = -2090307520;
                    } else {
                        iM6981 = C0630.m2566("۬ᩳ") ^ i6;
                        i2 = ((iM6981 ^ i5) * (-14795)) ^ 1722262208;
                        i3 = -810687662;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
                case -562274826:
                case 985204923:
                    C1005.m3501();
                    if (C7811.m20844() == 0) {
                        iM6981 = C0630.m2566("ᩴܳ") ^ i5;
                        i2 = ((iM6981 ^ i6) * 2725) ^ 492336627;
                        i3 = -1128570532;
                    } else {
                        iM6981 = (C2105.m6981("ۗ۟") ^ i5) * 95;
                        i2 = ((iM6981 ^ i6) * 7475) ^ 851046127;
                        i3 = -1904035747;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
                case -378773475:
                case 358339185:
                    iM6983 = C2105.m6981(C5695.m16034(sArr2, i12, 3, i11));
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2566 = C0630.m2566("᩸ۗ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 14983) ^ 878680479;
                        i4 = 24300090;
                        i8 = iM2566 ^ i4;
                    } else {
                        iM6981 = (C2105.m6981("ܿ֨") ^ i6) * (-87);
                        i2 = ((iM6981 ^ i5) * 6205) ^ 965513949;
                        i3 = -2090307520;
                        i8 = iM6981 ^ i3;
                        i7 = i2;
                    }
                    break;
                case -192365834:
                case 876239452:
                    i11 = 38397;
                    iM6981 = (C2105.m6981("۬᩹") + i5) * (-23);
                    i2 = ((iM6981 ^ i6) * 7829) ^ 1970329436;
                    i3 = 4963639;
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
                case 12309176:
                case 1201341574:
                    return new ViewOnClickListenerC3367(c13244, layoutInflaterFrom.inflate(i9, viewGroup, z));
                case 381299073:
                case 1206769275:
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C2105.m6981("ۙ۟") ^ i5) * (-107);
                        i2 = ((iM6981 ^ i6) * 16509) ^ 965533721;
                        i3 = -184033185;
                    } else {
                        int iM6431 = ViewOnClickListenerC1958.m6431(5.0f);
                        if (RunnableC1937.f6483 < 0) {
                            view.setLayoutParams(new ViewGroup.LayoutParams(-1, iM6431));
                            return new C4778(view);
                        }
                        iM6981 = (C2105.m6981("ۗ۟") ^ i5) * 95;
                        i2 = ((iM6981 ^ i6) * 7475) ^ 851046127;
                        i3 = -1904035747;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
                case 466308873:
                case 1181369551:
                    c13244 = this.f65559;
                    if (i != 0) {
                        iM6981 = (i6 - C2105.m6981("ܺۘ")) * 95;
                        i2 = ((iM6981 ^ i5) * (-23707)) ^ 392675507;
                        i3 = 625313684;
                        i8 = iM6981 ^ i3;
                        i7 = i2;
                    } else {
                        iM2566 = C0630.m2566("᩵ۛ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 1655) ^ 652529169;
                        i4 = 1501439005;
                        i8 = iM2566 ^ i4;
                    }
                    break;
                case 504634911:
                case 1999387841:
                    int i14 = s + s2;
                    if ((i14 * i14) - i10 < 0) {
                        iM6981 = C2105.m6981("ۗܳ") ^ i6;
                        i2 = ((iM6981 ^ i5) * 31957) ^ (-1811026229);
                        i3 = 623996288;
                    } else {
                        iM6981 = (C2105.m6981("۠᩹") ^ i5) * (-41);
                        i2 = ((iM6981 ^ i6) * 30675) ^ (-468530936);
                        i3 = -1151345747;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
                case 578653134:
                case 1016143416:
                    C3911.m11924();
                    return null;
                case 1088831515:
                case 1736915114:
                    if (C1294.m4372() <= 0) {
                        iM6981 = (C2105.m6981("ۙ۟") ^ i5) * (-107);
                        i2 = ((iM6981 ^ i6) * 16509) ^ 965533721;
                        i3 = -184033185;
                    } else {
                        iM6981 = (C2105.m6981("ܰۛ") ^ i5) * 69;
                        i2 = ((iM6981 ^ i6) * 6761) ^ (-820787540);
                        i3 = -2104421772;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
                default:
                    s = sArr[10];
                    if (C0050.f910 >= 0) {
                        iM6981 = (C2105.m6981("ۙ۟") ^ i5) * (-107);
                        i2 = ((iM6981 ^ i6) * 16509) ^ 965533721;
                        i3 = -184033185;
                    } else {
                        iM6981 = (C0630.m2566("ۜᩳ") ^ i5) * (-81);
                        i2 = ((iM6981 ^ i6) * 21023) ^ 2113149972;
                        i3 = 1645025753;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    break;
            }
        }
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        C13244 c13244 = null;
        int iM7032 = 0;
        int i = -1379122285;
        int i2 = RunnableC1937.f6483;
        int i3 = C3746.f11829;
        int iM6981 = (i3 - C2105.m6981("ۗ᩷")) * 17;
        int i4 = ((iM6981 ^ i2) * (-12059)) ^ 1691542910;
        int i5 = -78293357;
        while (true) {
            i = ((((i ^ i2) * (-27125)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2093839773:
                case 789272102:
                    c13244 = this.f65559;
                    if (C4117.m12364() != 0) {
                        iM6981 = (C2105.m6981("᩶ۘ") ^ i2) * 13;
                        i4 = ((iM6981 ^ i3) * (-9923)) ^ 61485677;
                        i5 = 985962137;
                    } else {
                        iM6981 = C2105.m6981("ᩴܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-4495)) ^ 645074900;
                        i5 = -494366182;
                    }
                    break;
                case -2074528577:
                case 355314285:
                    C2958.m9034();
                    C3911.m11924();
                    iM6981 = C2105.m6981("᩷ۨ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 8043) ^ 2102898736;
                    i5 = 2129768170;
                    break;
                case -2041408150:
                case 1920438905:
                    if (C1711.m5736() <= 0) {
                        iM6981 = (C2105.m6981("۬᩸") + i2) * 71;
                        i4 = ((iM6981 ^ i3) * (-31471)) ^ 324829899;
                        i5 = -1668403426;
                    } else {
                        iM6981 = (C2105.m6981("ۛ᩻") + i3) * 51;
                        i4 = ((iM6981 ^ i2) * (-2127)) ^ (-369383102);
                        i5 = -1335713272;
                    }
                    break;
                case -2021935907:
                case 490487322:
                    if (C0050.f910 >= 0) {
                        iM6981 = (C2105.m6981("۬᩺") + i3) * 61;
                        i4 = ((iM6981 ^ i2) * 23811) ^ 94154842;
                        i5 = -561918103;
                    } else {
                        iM6981 = (C2105.m6981("ۡ᩻") + i3) * (-7);
                        i4 = ((iM6981 ^ i2) * 30793) ^ (-690945812);
                        i5 = -568528110;
                    }
                    break;
                case -1819708564:
                case -1499135317:
                    if (C2272.m7503()) {
                        iM6981 = (C2105.m6981("۬᩺") + i3) * 61;
                        i4 = ((iM6981 ^ i2) * 23811) ^ 94154842;
                        i5 = -561918103;
                    } else {
                        iM6981 = (C0630.m2566("ۚ᩻") ^ i3) * (-97);
                        i4 = ((iM6981 ^ i2) * 20361) ^ 1484176833;
                        i5 = 448013926;
                    }
                    break;
                case -1647063956:
                case -300646219:
                    if (C0964.f3626 != 0) {
                        iM6981 = C2105.m6981("᩷ۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8043) ^ 2102898736;
                        i5 = 2129768170;
                    } else {
                        iM6981 = C0630.m2566("ۚۖ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1531)) ^ (-2106537556);
                        i5 = 397513084;
                    }
                    break;
                case -1405487218:
                case -696987879:
                    return 0;
                case -1298129319:
                case 143653021:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C2105.m6981("۬᩸") + i2) * 71;
                        i4 = ((iM6981 ^ i3) * (-31471)) ^ 324829899;
                        i5 = -1668403426;
                    } else {
                        iM6981 = C0630.m2566("ۙܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-26353)) ^ 849467996;
                        i5 = 40531772;
                    }
                    break;
                case -1273462545:
                case -1026931815:
                    iM7032 = C2126.m7032(c13244.f39641);
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C2105.m6981("᩶ۘ") ^ i2) * 13;
                        i4 = ((iM6981 ^ i3) * (-9923)) ^ 61485677;
                        i5 = 985962137;
                    } else {
                        iM6981 = (C2105.m6981("֨ܽ") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM6981 ^ i3) * 25) ^ 491296168;
                        i5 = -40477700;
                    }
                    break;
                case -853835625:
                case 14558448:
                    if (C2167.m7161(c13244.f39641)) {
                        iM6981 = (C0630.m2566("ܽ۫") ^ i3) * 27;
                        i4 = ((iM6981 ^ i2) * (-7795)) ^ (-152078640);
                        i5 = 243353616;
                    } else {
                        iM6981 = (C0630.m2566("ܶۢ") + i2) * (-27);
                        i4 = ((iM6981 ^ i3) * 32207) ^ 1044115795;
                        i5 = 1578461879;
                    }
                    break;
                case -352611868:
                case -123969504:
                    if (!C0798.f2919) {
                        iM6981 = (C2105.m6981("۬᩺") + i3) * 61;
                        i4 = ((iM6981 ^ i2) * 23811) ^ 94154842;
                        i5 = -561918103;
                    } else {
                        iM6981 = (C2105.m6981("᩶ۘ") ^ i2) * 13;
                        i4 = ((iM6981 ^ i3) * (-9923)) ^ 61485677;
                        i5 = 985962137;
                    }
                    break;
                case 86870241:
                case 1346532465:
                    if (C11340.m28031()) {
                        iM6981 = C0630.m2566("ۘ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * 731) ^ 1238862991;
                        i5 = -730220510;
                    } else {
                        iM6981 = C2105.m6981("᩷ۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8043) ^ 2102898736;
                        i5 = 2129768170;
                    }
                    break;
                case 166371515:
                case 1183629249:
                    return iM7032 + 1;
                case 268444165:
                case 1387201265:
                    if (C3019.f9544 >= 0) {
                        iM6981 = (C2105.m6981("۬᩺") + i3) * 61;
                        i4 = ((iM6981 ^ i2) * 23811) ^ 94154842;
                        i5 = -561918103;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩵۬")) * (-51);
                        i4 = ((iM6981 ^ i3) * 29101) ^ 453503288;
                        i5 = -451741094;
                    }
                    break;
                case 405527902:
                case 880682340:
                    C4616.m13552();
                    C2105.m6982();
                    return 0;
                case 942219187:
                case 1602093454:
                    C2126.m7040();
                    if (C7106.f21815 == 0) {
                        iM6981 = (i2 - C0630.m2566("᩵۬")) * (-51);
                        i4 = ((iM6981 ^ i3) * 29101) ^ 453503288;
                        i5 = -451741094;
                    } else {
                        iM6981 = C2105.m6981("᩷ۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8043) ^ 2102898736;
                        i5 = 2129768170;
                    }
                    break;
                case 1196898459:
                case 1936225804:
                    if (C7106.m19120() <= 0) {
                        iM6981 = (C2105.m6981("۬᩺") + i3) * 61;
                        i4 = ((iM6981 ^ i2) * 23811) ^ 94154842;
                        i5 = -561918103;
                    } else {
                        iM6981 = C0630.m2566("֫ۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 31865) ^ (-1150979548);
                        i5 = 54780696;
                    }
                    break;
                default:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (i2 - C0630.m2566("᩵۬")) * (-51);
                        i4 = ((iM6981 ^ i3) * 29101) ^ 453503288;
                        i5 = -451741094;
                    } else {
                        iM6981 = C0630.m2566("᩶ۖ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-693)) ^ (-1783553643);
                        i5 = -1046310789;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C19099 c19099;
        TextView textView;
        int i2;
        ViewOnClickListenerC3367 viewOnClickListenerC3367;
        int i3;
        TextView textView2;
        int i4;
        short[] sArr;
        String str;
        int iM6981;
        int i5;
        int iM6982;
        int i6;
        int i7;
        int i8;
        int i9;
        C19099 c190910;
        int i10;
        int iM6983;
        int i11;
        C19099 c190911;
        String str2;
        int i12;
        C19099 c190912;
        TextView textView3;
        TextView textView4;
        short[] sArr2;
        int i13;
        C19099 c190913;
        int i14;
        int i15;
        TextView textView5;
        String str3;
        int iM2566;
        int i16;
        int i17;
        int iM2567;
        int i18;
        int iM2568;
        int i19;
        int i20 = 0;
        short[] sArr3 = null;
        int i21 = 0;
        int i22 = 468796925;
        int i23 = C0422.f1886;
        int i24 = C0483.f2088;
        int iM2569 = C0630.m2566("᩸ܽ") ^ i23;
        int i25 = ((iM2569 ^ i24) * (-31815)) ^ 828164273;
        int i26 = iM2569 ^ 2088047877;
        ImageView imageView = null;
        String strM43986 = null;
        SpannableStringBuilder spannableStringBuilderM11921 = null;
        TextView textView6 = null;
        short[] sArr4 = null;
        int i27 = 0;
        int iM3592 = 0;
        int iM6382 = 0;
        int iM49424 = 0;
        int iM6984 = 0;
        int i28 = 0;
        int i29 = 0;
        short s = 0;
        C19099 c190914 = null;
        TextView textView7 = null;
        SpannableStringBuilder spannableStringBuilder = null;
        String strM6311 = null;
        ViewOnClickListenerC3367 viewOnClickListenerC3368 = null;
        int i30 = 0;
        int i31 = 0;
        SpannableStringBuilder spannableStringBuilderM11922 = null;
        short[] sArr5 = null;
        while (true) {
            i22 = i26 ^ (i25 & (((i22 ^ i24) * 24383) >> 31));
            switch (i22) {
                case -2003751821:
                case -717768678:
                    c190910 = c190914;
                    textView = textView6;
                    textView2 = textView7;
                    sArr = sArr4;
                    i10 = i29;
                    i3 = i21;
                    i4 = i27;
                    String str4 = strM43986;
                    imageView = imageView;
                    sArr3 = sArr3;
                    str = str4;
                    if (abstractC3255 instanceof ViewOnClickListenerC3367) {
                        iM6983 = C2105.m6981("᩸ᩳ") ^ i24;
                        i25 = ((iM6983 ^ i23) * 19963) ^ 723445920;
                        i11 = 973413485;
                    } else {
                        iM6983 = C0630.m2566("᩷֫") ^ i23;
                        i25 = ((iM6983 ^ i24) * (-3525)) ^ (-1904122922);
                        i11 = 710002735;
                    }
                    i8 = iM6983 ^ i11;
                    i29 = i10;
                    c190914 = c190910;
                    TextView textView8 = textView;
                    i26 = i8;
                    i27 = i4;
                    i21 = i3;
                    sArr4 = sArr;
                    textView7 = textView2;
                    textView6 = textView8;
                    str2 = str;
                    sArr3 = sArr3;
                    imageView = imageView;
                    strM43986 = str2;
                    break;
                case -1940038993:
                case -459230483:
                    C1047.m3601(textView6, c190914.m43987());
                    textView = textView6;
                    c190910 = c190914;
                    C16275.m38292(C2126.m7033(c190914), c190914.m44017(), c190914.m43995(), viewOnClickListenerC3368.f10658);
                    textView2 = textView7;
                    sArr = sArr4;
                    i10 = i29;
                    i3 = i21;
                    i4 = i27;
                    String str5 = strM43986;
                    imageView = imageView;
                    sArr3 = sArr3;
                    str = str5;
                    iM6983 = C0630.m2566("᩷֫") ^ i23;
                    i25 = ((iM6983 ^ i24) * (-3525)) ^ (-1904122922);
                    i11 = 710002735;
                    i8 = iM6983 ^ i11;
                    i29 = i10;
                    c190914 = c190910;
                    TextView textView9 = textView;
                    i26 = i8;
                    i27 = i4;
                    i21 = i3;
                    sArr4 = sArr;
                    textView7 = textView2;
                    textView6 = textView9;
                    str2 = str;
                    sArr3 = sArr3;
                    imageView = imageView;
                    strM43986 = str2;
                    break;
                case -1909138608:
                case -181409291:
                    i12 = i27;
                    c190912 = c190914;
                    textView3 = textView6;
                    textView4 = textView7;
                    String str6 = strM43986;
                    sArr2 = sArr4;
                    i13 = i29;
                    viewOnClickListenerC3368.f10657 = c190912;
                    imageView = viewOnClickListenerC3368.f10658;
                    short[] sArr6 = f65558;
                    if (C0483.f2088 >= 0) {
                        strM43986 = str6;
                        i21 = 1;
                        sArr3 = sArr6;
                        int iM6985 = C2105.m6981("ۗۧ") ^ i24;
                        c190913 = c190912;
                        i29 = i13;
                        sArr4 = sArr2;
                        textView7 = textView4;
                        textView6 = textView3;
                        i26 = iM6985 ^ 1794390365;
                        i25 = ((iM6985 ^ i23) * (-3869)) ^ 915806759;
                        i27 = i12;
                        i21 = i21;
                        c190914 = c190913;
                    } else {
                        int iM6986 = (C2105.m6981("ᩳ۟") ^ i23) * (-105);
                        i29 = i13;
                        strM43986 = str6;
                        sArr4 = sArr2;
                        sArr3 = sArr6;
                        i25 = ((iM6986 ^ i24) * 1041) ^ (-5029147);
                        textView7 = textView4;
                        textView6 = textView3;
                        c190914 = c190912;
                        i26 = iM6986 ^ 1757981231;
                        i27 = i12;
                        i21 = 1;
                    }
                    break;
                case -1603362620:
                case -91018935:
                    c19099 = c190914;
                    textView = textView6;
                    sArr = sArr4;
                    i2 = i29;
                    short[] sArr7 = sArr3;
                    str = strM43986;
                    int i32 = i21;
                    int iM25610 = C0630.m2566(C1504.m5177(sArr7, i32, 3, i27)) ^ 2098052965;
                    i4 = i27;
                    ImageView imageView2 = imageView;
                    imageView2.setImageResource(iM25610);
                    TextView textView10 = viewOnClickListenerC3368.f10654;
                    if (C1047.f3863 >= 0) {
                        imageView = imageView2;
                        i3 = i32;
                        viewOnClickListenerC3367 = viewOnClickListenerC3368;
                        sArr3 = sArr7;
                        textView2 = textView10;
                        iM6981 = C0630.m2566("ܺ֫") ^ i23;
                        i25 = ((iM6981 ^ i24) * (-8777)) ^ (-1118970377);
                        i5 = -853566781;
                        i8 = iM6981 ^ i5;
                        viewOnClickListenerC3368 = viewOnClickListenerC3367;
                        c190914 = c19099;
                        i29 = i2;
                        TextView textView11 = textView;
                        i26 = i8;
                        i27 = i4;
                        i21 = i3;
                        sArr4 = sArr;
                        textView7 = textView2;
                        textView6 = textView11;
                        str2 = str;
                        sArr3 = sArr3;
                    } else {
                        int iM25611 = C0630.m2566("᩷ۧ") ^ i23;
                        imageView = imageView2;
                        i29 = i2;
                        sArr4 = sArr;
                        textView7 = textView10;
                        c190914 = c19099;
                        i25 = ((iM25611 ^ i24) * 23621) ^ (-1251131350);
                        i27 = i4;
                        i21 = i32;
                        str2 = str;
                        sArr3 = sArr7;
                        textView6 = textView;
                        i26 = iM25611 ^ (-1442949612);
                    }
                    imageView = imageView;
                    strM43986 = str2;
                    break;
                case -1465410377:
                case 533519037:
                    c190913 = c190914;
                    C0630.m2576(spannableStringBuilder, new ForegroundColorSpan(iM49424), iM3592, iM6382, 33);
                    C1047.m3601(viewOnClickListenerC3368.f10653, spannableStringBuilder);
                    textView6 = viewOnClickListenerC3368.f10656;
                    if (C4616.f14690 <= 0) {
                        iM2568 = C2105.m6981("ܳۚ") ^ i23;
                        i14 = ((iM2568 ^ i24) * 19083) ^ 459006595;
                        i19 = 1858684961;
                    } else {
                        iM2568 = (C0630.m2566("ܽܽ") + i24) * 55;
                        i14 = ((iM2568 ^ i23) * (-1345)) ^ 170968510;
                        i19 = 2090099882;
                    }
                    i26 = iM2568 ^ i19;
                    i25 = i14;
                    c190914 = c190913;
                    break;
                case -1395366287:
                case -399799613:
                    str = strM43986;
                    i9 = 14916;
                    int iM6987 = C2105.m6981("ᩴ۫") ^ i23;
                    int i33 = i9;
                    int i34 = ((iM6987 ^ i24) * (-20599)) ^ (-63524492);
                    int i35 = iM6987 ^ (-840973844);
                    i29 = i29;
                    c190914 = c190914;
                    i25 = i34;
                    i27 = i33;
                    i21 = i21;
                    sArr4 = sArr4;
                    textView7 = textView7;
                    textView6 = textView6;
                    i26 = i35;
                    str2 = str;
                    sArr3 = sArr3;
                    imageView = imageView;
                    strM43986 = str2;
                    break;
                case -1323946427:
                case -636249483:
                    c190913 = c190914;
                    textView3 = textView6;
                    short[] sArr8 = sArr4;
                    i13 = i29;
                    textView4 = textView7;
                    RunnableC1937.m6377(textView4, c190913.m44004());
                    spannableStringBuilder = new SpannableStringBuilder();
                    strM43986 = c190913.m43986();
                    if (!C1916.f6442) {
                        sArr2 = sArr8;
                        i12 = i27;
                        c190912 = c190913;
                        int iM6988 = C2105.m6981("ۗۧ") ^ i24;
                        c190913 = c190912;
                        i29 = i13;
                        sArr4 = sArr2;
                        textView7 = textView4;
                        textView6 = textView3;
                        i26 = iM6988 ^ 1794390365;
                        i25 = ((iM6988 ^ i23) * (-3869)) ^ 915806759;
                        i27 = i12;
                        i21 = i21;
                        c190914 = c190913;
                    } else {
                        int iM6989 = (C2105.m6981("᩹ۗ") ^ i24) * 13;
                        i14 = ((iM6989 ^ i23) * 6249) ^ 384077825;
                        i15 = iM6989 ^ 828880007;
                        i29 = i13;
                        sArr4 = sArr8;
                        textView7 = textView4;
                        textView6 = textView3;
                        i26 = i15;
                        i25 = i14;
                        c190914 = c190913;
                    }
                    break;
                case -1244154450:
                case 424733727:
                    C4263.m12819();
                    break;
                case -1053360618:
                case -450558827:
                    textView = textView6;
                    int i36 = i21;
                    textView2 = textView7;
                    sArr = sArr4;
                    i2 = i29;
                    String str7 = strM43986;
                    imageView = imageView;
                    sArr3 = sArr3;
                    str = str7;
                    viewOnClickListenerC3368 = (ViewOnClickListenerC3367) abstractC3255;
                    i4 = i27;
                    i3 = i36;
                    c190911 = (C19099) C22628.m50605(this.f65559.f39641, i);
                    if (C3019.f9544 < 0) {
                        int iM25612 = C0630.m2566("᩵ۤ") ^ i24;
                        i25 = ((iM25612 ^ i23) * (-26459)) ^ 1076122820;
                        i8 = iM25612 ^ 1360311900;
                        c190914 = c190911;
                        i29 = i2;
                        TextView textView12 = textView;
                        i26 = i8;
                        i27 = i4;
                        i21 = i3;
                        sArr4 = sArr;
                        textView7 = textView2;
                        textView6 = textView12;
                        str2 = str;
                        sArr3 = sArr3;
                        imageView = imageView;
                        strM43986 = str2;
                    } else {
                        int iM69810 = (C2105.m6981("ۜۜ") ^ i23) * 45;
                        c190914 = c190911;
                        i25 = ((iM69810 ^ i24) * 15959) ^ 1697753673;
                        i27 = i4;
                        i21 = i3;
                        sArr4 = sArr;
                        textView7 = textView2;
                        textView6 = textView;
                        i26 = iM69810 ^ (-1552515025);
                        i29 = i2;
                        String str8 = str;
                        sArr3 = sArr3;
                        imageView = imageView;
                        strM43986 = str8;
                    }
                    break;
                case -1038135678:
                case 461038569:
                    if (C1916.f6442) {
                        c190913 = c190914;
                        textView5 = textView6;
                        str3 = strM43986;
                        iM2566 = (C0630.m2566("ܽܶ") + i24) * 5;
                        i16 = ((iM2566 ^ i23) * 10557) ^ 1777773335;
                        i17 = 465281899;
                        int i37 = iM2566 ^ i17;
                        strM43986 = str3;
                        i25 = i16;
                        textView6 = textView5;
                        i26 = i37;
                        c190914 = c190913;
                    }
                    textView3 = textView6;
                    textView4 = textView7;
                    sArr2 = sArr4;
                    i13 = i29;
                    int i38 = i21;
                    i12 = i27;
                    c190912 = c190914;
                    i21 = i38;
                    int iM69811 = C2105.m6981("ۗۧ") ^ i24;
                    c190913 = c190912;
                    i29 = i13;
                    sArr4 = sArr2;
                    textView7 = textView4;
                    textView6 = textView3;
                    i26 = iM69811 ^ 1794390365;
                    i25 = ((iM69811 ^ i23) * (-3869)) ^ 915806759;
                    i27 = i12;
                    i21 = i21;
                    c190914 = c190913;
                    break;
                case -705414029:
                case 1057126257:
                    if (C1128.f4106 > 0) {
                        c190911 = c190914;
                        textView = textView6;
                        textView2 = textView7;
                        sArr = sArr4;
                        i2 = i29;
                        i3 = i21;
                        i4 = i27;
                        String str9 = strM43986;
                        imageView = imageView;
                        sArr3 = sArr3;
                        str = str9;
                        int iM69812 = (C2105.m6981("ۜۜ") ^ i23) * 45;
                        c190914 = c190911;
                        i25 = ((iM69812 ^ i24) * 15959) ^ 1697753673;
                        i27 = i4;
                        i21 = i3;
                        sArr4 = sArr;
                        textView7 = textView2;
                        textView6 = textView;
                        i26 = iM69812 ^ (-1552515025);
                        i29 = i2;
                        String str10 = str;
                        sArr3 = sArr3;
                        imageView = imageView;
                        strM43986 = str10;
                    } else {
                        textView3 = textView6;
                        textView4 = textView7;
                        sArr2 = sArr4;
                        i13 = i29;
                        int i39 = i21;
                        i12 = i27;
                        c190912 = c190914;
                        i21 = i39;
                        int iM69813 = C2105.m6981("ۗۧ") ^ i24;
                        c190913 = c190912;
                        i29 = i13;
                        sArr4 = sArr2;
                        textView7 = textView4;
                        textView6 = textView3;
                        i26 = iM69813 ^ 1794390365;
                        i25 = ((iM69813 ^ i23) * (-3869)) ^ 915806759;
                        i27 = i12;
                        i21 = i21;
                        c190914 = c190913;
                    }
                    break;
                case -597902393:
                case 1707228126:
                    c190913 = c190914;
                    textView5 = textView6;
                    str3 = strM43986;
                    spannableStringBuilderM11922 = C3911.m11921(spannableStringBuilder, str3);
                    sArr4 = f65558;
                    i29 = 4;
                    if (C2126.f7087) {
                        iM2566 = (C0630.m2566("ܽܶ") + i24) * 5;
                        i16 = ((iM2566 ^ i23) * 10557) ^ 1777773335;
                        i17 = 465281899;
                    } else {
                        iM2566 = C0630.m2566("ۚ᩶") ^ i24;
                        i16 = ((iM2566 ^ i23) * 20205) ^ (-658249772);
                        i17 = -754604493;
                    }
                    int i310 = iM2566 ^ i17;
                    strM43986 = str3;
                    i25 = i16;
                    textView6 = textView5;
                    i26 = i310;
                    c190914 = c190913;
                    break;
                case -450156098:
                case 203824876:
                    c19099 = c190914;
                    textView = textView6;
                    short[] sArr9 = sArr4;
                    i2 = i29;
                    strM6311 = C1916.m6311(sArr9, i2, 3, i27);
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilderM11922;
                    spannableStringBuilderM11921 = C3911.m11921(C3911.m11921(spannableStringBuilder2, strM6311), C22927.m51020(c19099.m43998()));
                    if (C0483.m2121()) {
                        int iM25613 = (C0630.m2566("ۨܰ") ^ i23) * (-85);
                        spannableStringBuilderM11922 = spannableStringBuilder2;
                        i25 = ((iM25613 ^ i24) * (-10843)) ^ 231957847;
                        sArr4 = sArr9;
                        i29 = i2;
                        c190914 = c19099;
                        i26 = iM25613 ^ (-712568762);
                        textView6 = textView;
                    } else {
                        spannableStringBuilderM11922 = spannableStringBuilder2;
                        viewOnClickListenerC3367 = viewOnClickListenerC3368;
                        i3 = i21;
                        textView2 = textView7;
                        i4 = i27;
                        sArr = sArr9;
                        String str11 = strM43986;
                        imageView = imageView;
                        sArr3 = sArr3;
                        str = str11;
                        iM6981 = C0630.m2566("ܺ֫") ^ i23;
                        i25 = ((iM6981 ^ i24) * (-8777)) ^ (-1118970377);
                        i5 = -853566781;
                        i8 = iM6981 ^ i5;
                        viewOnClickListenerC3368 = viewOnClickListenerC3367;
                        c190914 = c19099;
                        i29 = i2;
                        TextView textView13 = textView;
                        i26 = i8;
                        i27 = i4;
                        i21 = i3;
                        sArr4 = sArr;
                        textView7 = textView2;
                        textView6 = textView13;
                        str2 = str;
                        sArr3 = sArr3;
                        imageView = imageView;
                        strM43986 = str2;
                    }
                    break;
                case -112921952:
                case 389978842:
                    c19099 = c190914;
                    textView = textView6;
                    textView2 = textView7;
                    sArr = sArr4;
                    i2 = i29;
                    i3 = i21;
                    i4 = i27;
                    String str12 = strM43986;
                    imageView = imageView;
                    sArr3 = sArr3;
                    str = str12;
                    int i40 = i20 + 96177249;
                    viewOnClickListenerC3367 = viewOnClickListenerC3368;
                    short s2 = s;
                    int i41 = s2 + 9807;
                    if ((i41 * i41) - (i40 + i40) <= 0) {
                        iM6982 = (C2105.m6981("۟ۜ") ^ i24) * (-65);
                        i6 = ((iM6982 ^ i23) * 9875) ^ 287188523;
                        i7 = -1076662175;
                    } else {
                        iM6982 = (C2105.m6981("ۤ᩻") + i24) * (-89);
                        i6 = ((iM6982 ^ i23) * (-28145)) ^ 882710501;
                        i7 = -1181924582;
                    }
                    i8 = iM6982 ^ i7;
                    s = s2;
                    i25 = i6;
                    viewOnClickListenerC3368 = viewOnClickListenerC3367;
                    c190914 = c19099;
                    i29 = i2;
                    TextView textView14 = textView;
                    i26 = i8;
                    i27 = i4;
                    i21 = i3;
                    sArr4 = sArr;
                    textView7 = textView2;
                    textView6 = textView14;
                    str2 = str;
                    sArr3 = sArr3;
                    imageView = imageView;
                    strM43986 = str2;
                    break;
                case -48076269:
                case 1982000423:
                    C4075.m12263();
                    textView3 = textView6;
                    textView4 = textView7;
                    sArr2 = sArr4;
                    i13 = i29;
                    int i311 = i21;
                    i12 = i27;
                    c190912 = c190914;
                    i21 = i311;
                    int iM69814 = C2105.m6981("ۗۧ") ^ i24;
                    c190913 = c190912;
                    i29 = i13;
                    sArr4 = sArr2;
                    textView7 = textView4;
                    textView6 = textView3;
                    i26 = iM69814 ^ 1794390365;
                    i25 = ((iM69814 ^ i23) * (-3869)) ^ 915806759;
                    i27 = i12;
                    i21 = i21;
                    c190914 = c190913;
                    break;
                case 124473193:
                case 1074698087:
                    if (C0422.f1886 <= 0) {
                        c190913 = c190914;
                        iM2568 = C2105.m6981("ܳۚ") ^ i23;
                        i14 = ((iM2568 ^ i24) * 19083) ^ 459006595;
                        i19 = 1858684961;
                        i26 = iM2568 ^ i19;
                        i25 = i14;
                        c190914 = c190913;
                    }
                    textView3 = textView6;
                    textView4 = textView7;
                    sArr2 = sArr4;
                    i13 = i29;
                    int i312 = i21;
                    i12 = i27;
                    c190912 = c190914;
                    i21 = i312;
                    int iM69815 = C2105.m6981("ۗۧ") ^ i24;
                    c190913 = c190912;
                    i29 = i13;
                    sArr4 = sArr2;
                    textView7 = textView4;
                    textView6 = textView3;
                    i26 = iM69815 ^ 1794390365;
                    i25 = ((iM69815 ^ i23) * (-3869)) ^ 915806759;
                    i27 = i12;
                    i21 = i21;
                    c190914 = c190913;
                    break;
                case 517954066:
                case 1816355205:
                    c190913 = c190914;
                    textView3 = textView6;
                    C0237.m1490(spannableStringBuilderM11921, strM6311);
                    iM3592 = C1047.m3592(spannableStringBuilder);
                    sArr5 = f65558;
                    i31 = 7;
                    i30 = 3;
                    iM2567 = (i24 - C0630.m2566("ۧۢ")) * (-69);
                    i14 = ((iM2567 ^ i23) * 21113) ^ 909480501;
                    i18 = -456314364;
                    i15 = iM2567 ^ i18;
                    textView6 = textView3;
                    i26 = i15;
                    i25 = i14;
                    c190914 = c190913;
                    break;
                case 733241700:
                case 1700723559:
                    c190913 = c190914;
                    textView3 = textView6;
                    C0237.m1490(spannableStringBuilder, ServiceConnectionC3453.m10562(iM6984 ^ i28));
                    iM6382 = RunnableC1937.m6382(spannableStringBuilder);
                    iM49424 = C21943.m49424(-1996767, -29696);
                    if (RunnableC3474.f10992 > 0) {
                        iM2567 = (C0630.m2566("ܳܿ") + i23) * (-91);
                        i14 = ((iM2567 ^ i24) * 28191) ^ (-2097474060);
                        i18 = -1934959882;
                        i15 = iM2567 ^ i18;
                        textView6 = textView3;
                        i26 = i15;
                        i25 = i14;
                        c190914 = c190913;
                    } else {
                        textView4 = textView7;
                        sArr2 = sArr4;
                        i13 = i29;
                        i12 = i27;
                        c190912 = c190913;
                        int iM69816 = C2105.m6981("ۗۧ") ^ i24;
                        c190913 = c190912;
                        i29 = i13;
                        sArr4 = sArr2;
                        textView7 = textView4;
                        textView6 = textView3;
                        i26 = iM69816 ^ 1794390365;
                        i25 = ((iM69816 ^ i23) * (-3869)) ^ 915806759;
                        i27 = i12;
                        i21 = i21;
                        c190914 = c190913;
                    }
                    break;
                case 851030330:
                case 1400403198:
                    break;
                case 1064856124:
                case 1971251192:
                    c190913 = c190914;
                    textView3 = textView6;
                    iM6984 = C2105.m6981(ViewOnClickListenerC1958.m6435(sArr5, i31, i30, i27));
                    i28 = 2120286570;
                    if (C1294.f4556 < 0) {
                        iM2567 = (C0630.m2566("֡ۖ") ^ i23) * 101;
                        i14 = ((iM2567 ^ i24) * 10415) ^ 125793194;
                        i18 = -1337535421;
                        i15 = iM2567 ^ i18;
                        textView6 = textView3;
                        i26 = i15;
                        i25 = i14;
                        c190914 = c190913;
                    } else {
                        textView6 = textView3;
                        iM2568 = C2105.m6981("ܳۚ") ^ i23;
                        i14 = ((iM2568 ^ i24) * 19083) ^ 459006595;
                        i19 = 1858684961;
                        i26 = iM2568 ^ i19;
                        i25 = i14;
                        c190914 = c190913;
                    }
                    break;
                case 1688038849:
                case 2117863359:
                    c19099 = c190914;
                    textView = textView6;
                    textView2 = textView7;
                    sArr = sArr4;
                    i2 = i29;
                    viewOnClickListenerC3367 = viewOnClickListenerC3368;
                    i3 = i21;
                    i4 = i27;
                    String str13 = strM43986;
                    imageView = imageView;
                    sArr3 = sArr3;
                    str = str13;
                    s = f65558[0];
                    i20 = s * s;
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("ܺ֫") ^ i23;
                        i25 = ((iM6981 ^ i24) * (-8777)) ^ (-1118970377);
                        i5 = -853566781;
                    } else {
                        iM6981 = C2105.m6981("֡ܰ") ^ i23;
                        i25 = ((iM6981 ^ i24) * (-31929)) ^ (-1672839551);
                        i5 = -508623858;
                    }
                    i8 = iM6981 ^ i5;
                    viewOnClickListenerC3368 = viewOnClickListenerC3367;
                    c190914 = c19099;
                    i29 = i2;
                    TextView textView15 = textView;
                    i26 = i8;
                    i27 = i4;
                    i21 = i3;
                    sArr4 = sArr;
                    textView7 = textView2;
                    textView6 = textView15;
                    str2 = str;
                    sArr3 = sArr3;
                    imageView = imageView;
                    strM43986 = str2;
                    break;
                default:
                    str = strM43986;
                    i9 = 44570;
                    int iM69817 = C2105.m6981("ᩴ۫") ^ i23;
                    int i313 = i9;
                    int i314 = ((iM69817 ^ i24) * (-20599)) ^ (-63524492);
                    int i315 = iM69817 ^ (-840973844);
                    i29 = i29;
                    c190914 = c190914;
                    i25 = i314;
                    i27 = i313;
                    i21 = i21;
                    sArr4 = sArr4;
                    textView7 = textView7;
                    textView6 = textView6;
                    i26 = i315;
                    str2 = str;
                    sArr3 = sArr3;
                    imageView = imageView;
                    strM43986 = str2;
                    break;
            }
            return;
        }
    }

    public C20301(C13244 c13244) {
        this.f65559 = c13244;
    }
}
