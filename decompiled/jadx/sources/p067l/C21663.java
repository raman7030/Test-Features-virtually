package p067l;

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
public final class C21663 extends AbstractC21283 {

    /* JADX INFO: renamed from: ᩴ֫ۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f82974 = {5606, -16424, -18350, 21756, 14948, 14948, 14948, 25974, 22326, 18961, 8173, 1877, -2367, -4649};

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C14956 f68234;

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        int itemCount = 0;
        int i2 = 0;
        int i3 = 182325019;
        int i4 = C0866.f81837;
        int i5 = C1124.f82007;
        int iM55680 = C0873.m55680("۟֡") ^ i5;
        int i6 = ((iM55680 ^ i4) * (-2215)) ^ 1807412436;
        int i7 = 1850449695;
        while (true) {
            i3 = ((((i3 ^ i4) * (-31437)) >> 31) & i6) ^ (iM55680 ^ i7);
            switch (i3) {
                case -2135645981:
                case -1705215344:
                    return i2;
                case -2014261182:
                case 2137762510:
                    RunnableC0938.m55938();
                    iM55680 = (C0873.m55680("ۧ۠") ^ i5) * (-17);
                    i6 = ((iM55680 ^ i4) * 19877) ^ 959998547;
                    i7 = 67194572;
                    break;
                case -1978703009:
                case 318182550:
                    if (C1036.m56257() <= 0) {
                        iM55680 = C0946.m55979("۠֡") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-11907)) ^ 707384557;
                        i7 = 817532220;
                    } else {
                        iM55680 = C0873.m55680("۬۠") ^ i5;
                        i6 = ((iM55680 ^ i4) * 21885) ^ 492467193;
                        i7 = -610211247;
                    }
                    break;
                case -1885845629:
                case 2009483641:
                    C0873.m55678();
                    if (!C1025.m56230()) {
                        iM55680 = (C0873.m55680("ۧ۠") ^ i5) * (-17);
                        i6 = ((iM55680 ^ i4) * 19877) ^ 959998547;
                        i7 = 67194572;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۘ") ^ i4) * (-127);
                        i6 = ((iM55680 ^ i5) * 6211) ^ 864567022;
                        i7 = -921105181;
                    }
                    break;
                case -1866400661:
                case -542588251:
                    if (C0947.f81895) {
                        iM55680 = (C0873.m55680("ۗܺ") + i4) * (-27);
                        i6 = ((iM55680 ^ i5) * (-24251)) ^ (-1887304809);
                        i7 = 31869937;
                    } else {
                        iM55680 = C0946.m55979("ۢܺ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 16705) ^ 1852136965;
                        i7 = -841703923;
                    }
                    break;
                case -1528319980:
                case -206000367:
                    if (C0955.f81898) {
                        iM55680 = C0946.m55979("۠֡") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-11907)) ^ 707384557;
                        i7 = 817532220;
                    } else {
                        iM55680 = (C0873.m55680("֡ۙ") ^ i5) * 21;
                        i6 = ((iM55680 ^ i4) * (-23731)) ^ 1307522533;
                        i7 = -1559824496;
                    }
                    break;
                case -1307205631:
                case -800387568:
                    i2 = 1;
                    if (i == itemCount - 1) {
                        iM55680 = C0946.m55979("ܶۘ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 7319) ^ (-754045527);
                        i7 = 1837328086;
                    } else {
                        iM55680 = C0946.m55979("ۗۘ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-14181)) ^ 2029937990;
                        i7 = -1672066707;
                    }
                    break;
                case -1139749579:
                case 2118847888:
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0873.m55680("᩶ۘ") ^ i4) * (-127);
                        i6 = ((iM55680 ^ i5) * 6211) ^ 864567022;
                        i7 = -921105181;
                    } else {
                        iM55680 = (C0873.m55680("ܶᩴ") ^ i4) * (-27);
                        i6 = ((iM55680 ^ i5) * (-29493)) ^ (-1444833459);
                        i7 = 153431974;
                    }
                    break;
                case -783453064:
                case 2115592183:
                    if (C0890.f81849 != 0) {
                        iM55680 = (i5 - C0873.m55680("۬۫")) * (-25);
                        i6 = ((iM55680 ^ i4) * (-28159)) ^ (-298239471);
                        i7 = -1569377903;
                    } else {
                        iM55680 = (C0873.m55680("֨۟") + i5) * 51;
                        i6 = ((iM55680 ^ i4) * 6283) ^ (-1928394285);
                        i7 = 16780616;
                    }
                    break;
                case -695611989:
                case 703253654:
                    if (C0967.f81910 >= 0) {
                        iM55680 = (C0873.m55680("ۧ۠") ^ i5) * (-17);
                        i6 = ((iM55680 ^ i4) * 19877) ^ 959998547;
                        i7 = 67194572;
                    } else {
                        iM55680 = (i5 - C0873.m55680("ܶ᩸")) * (-123);
                        i6 = ((iM55680 ^ i4) * (-31901)) ^ (-1512294501);
                        i7 = -1158981604;
                    }
                    break;
                case -607629966:
                case 1126150914:
                    itemCount = getItemCount();
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0946.m55979("۠֡") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-11907)) ^ 707384557;
                        i7 = 817532220;
                    } else {
                        iM55680 = C0946.m55979("ܿ᩷") ^ i4;
                        i6 = ((iM55680 ^ i5) * 17731) ^ (-953624331);
                        i7 = 1832258842;
                    }
                    break;
                case -314224182:
                case -170909788:
                    if (C0866.m55645()) {
                        iM55680 = C0873.m55680("ۙۖ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 22967) ^ (-1301381407);
                        i7 = 9129915;
                    } else {
                        iM55680 = (C0873.m55680("ۧ۠") ^ i5) * (-17);
                        i6 = ((iM55680 ^ i4) * 19877) ^ 959998547;
                        i7 = 67194572;
                    }
                    break;
                case -275185154:
                case 1842887890:
                    C1964.m56597();
                    if (C0894.f81854 < 0) {
                        iM55680 = (C0873.m55680("ۗܺ") + i4) * (-27);
                        i6 = ((iM55680 ^ i5) * (-24251)) ^ (-1887304809);
                        i7 = 31869937;
                    } else {
                        iM55680 = (i5 - C0873.m55680("۬۫")) * (-25);
                        i6 = ((iM55680 ^ i4) * (-28159)) ^ (-298239471);
                        i7 = -1569377903;
                    }
                    break;
                case -157972360:
                case 994669662:
                    C1017.m56187();
                    return 0;
                case -147367586:
                case 1131791759:
                    return 0;
                case 284493269:
                case 1992853103:
                    C0890.m55740();
                    if (!C0890.m55740()) {
                        iM55680 = (C0873.m55680("ۧ۠") ^ i5) * (-17);
                        i6 = ((iM55680 ^ i4) * 19877) ^ 959998547;
                        i7 = 67194572;
                    } else {
                        iM55680 = (i5 - C0873.m55680("۬۫")) * (-25);
                        i6 = ((iM55680 ^ i4) * (-28159)) ^ (-298239471);
                        i7 = -1569377903;
                    }
                    break;
                case 915871602:
                case 2065975851:
                    if (C1036.m56257() <= 0) {
                        iM55680 = (C0873.m55680("᩶ۘ") ^ i4) * (-127);
                        i6 = ((iM55680 ^ i5) * 6211) ^ 864567022;
                        i7 = -921105181;
                    } else {
                        iM55680 = C0946.m55979("ۜ᩸") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-20255)) ^ (-1016387763);
                        i7 = 2076444939;
                    }
                    break;
                default:
                    if (RunnableC0897.f81856) {
                        iM55680 = C0946.m55979("۟᩸") ^ i5;
                        i6 = ((iM55680 ^ i4) * 7377) ^ 990164947;
                        i7 = 7511780;
                    } else {
                        iM55680 = C0946.m55979("۠֡") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-11907)) ^ 707384557;
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
    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iM55979;
        int i2;
        int i3;
        int iM55680;
        int i4;
        int i5 = C0906.f81862;
        int i6 = C1017.f81942;
        int iM559710 = C0946.m55979("᩺ۢ") ^ i6;
        int i7 = ((iM559710 ^ i5) * (-18837)) ^ 2088328626;
        LayoutInflater layoutInflaterFrom = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM559710 ^ (-1237512376);
        int i9 = 0;
        boolean z = false;
        int iM559711 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1870162536;
        View view = null;
        C14956 c14956 = null;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i5) * 18223) >> 31));
            switch (i13) {
                case -2007142393:
                case 1291221459:
                    i11 = 31878;
                    iM55979 = (C0946.m55979("۬᩹") + i5) * (-23);
                    i2 = ((iM55979 ^ i6) * 7829) ^ 1970329436;
                    i3 = 4963639;
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
                case -1819900550:
                case 2057495552:
                    C0955.m56025();
                    if (C0894.m55769() < 0) {
                        iM55979 = (i6 - C0873.m55680("֡۬")) * 11;
                        i2 = ((iM55979 ^ i5) * (-25865)) ^ (-696900999);
                        i3 = 113385064;
                    } else {
                        iM55979 = C0873.m55680("ᩴܳ") ^ i5;
                        i2 = ((iM55979 ^ i6) * 2725) ^ 492336627;
                        i3 = -1128570532;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
                case -1664677418:
                case 69838333:
                    C1124.m56367();
                    iM55979 = (C0946.m55979("ۙ۟") ^ i5) * (-107);
                    i2 = ((iM55979 ^ i6) * 16509) ^ 965533721;
                    i3 = -184033185;
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
                case -1510123774:
                case -792134353:
                    i9 = 2129601479 ^ iM559711;
                    if (C0967.f81910 >= 0) {
                        z = false;
                        iM55979 = C0873.m55680("ᩴܳ") ^ i5;
                        i2 = ((iM55979 ^ i6) * 2725) ^ 492336627;
                        i3 = -1128570532;
                        i8 = iM55979 ^ i3;
                        i7 = i2;
                    } else {
                        int iM559712 = (C0946.m55979("᩺ۖ") ^ i6) * 61;
                        i7 = ((iM559712 ^ i5) * 873) ^ 891887459;
                        i8 = iM559712 ^ (-1094432392);
                        z = false;
                    }
                    break;
                case -1393322963:
                case 330361928:
                    C1964.m56597();
                    if (C0877.f81843 < 0) {
                        iM55979 = (C0946.m55979("ۙ۟") ^ i5) * (-107);
                        i2 = ((iM55979 ^ i6) * 16509) ^ 965533721;
                        i3 = -184033185;
                    } else {
                        iM55979 = (i6 - C0873.m55680("֡۬")) * 11;
                        i2 = ((iM55979 ^ i5) * (-25865)) ^ (-696900999);
                        i3 = 113385064;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
                case -1347447820:
                case 927202946:
                    sArr = f82974;
                    if (C0937.m55918() >= 0) {
                        iM55979 = (C0946.m55979("ۙ۟") ^ i5) * (-107);
                        i2 = ((iM55979 ^ i6) * 16509) ^ 965533721;
                        i3 = -184033185;
                    } else {
                        iM55979 = (i6 - C0873.m55680("ܽۚ")) * (-95);
                        i2 = ((iM55979 ^ i5) * (-9023)) ^ (-1657618046);
                        i3 = -1276807237;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
                case -996935744:
                case -160061136:
                    layoutInflaterFrom = LayoutInflater.from(c14956.f42701);
                    sArr2 = f82974;
                    i12 = 11;
                    if (C0992.f81922 >= 0) {
                        iM55979 = (C0946.m55979("ܿ֨") ^ i6) * (-87);
                        i2 = ((iM55979 ^ i5) * 6205) ^ 965513949;
                        i3 = -2090307520;
                    } else {
                        iM55979 = (C0873.m55680("ۖ֨") ^ i5) * (-13);
                        i2 = ((iM55979 ^ i6) * (-27453)) ^ 128606815;
                        i3 = -167890042;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
                case -911402264:
                case -166697856:
                    view = new View(c14956.f42701);
                    if (C0946.m55980() != 0) {
                        iM55979 = C0873.m55680("ᩴܳ") ^ i5;
                        i2 = ((iM55979 ^ i6) * 2725) ^ 492336627;
                        i3 = -1128570532;
                    } else {
                        iM55979 = (C0946.m55979("ܿܰ") + i6) * (-39);
                        i2 = ((iM55979 ^ i5) * 8281) ^ 39430514;
                        i3 = 437380706;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
                case -784466757:
                case -61415971:
                    i10 = s * 63676;
                    s2 = 15919;
                    if (C0930.f81879 <= 0) {
                        iM55979 = (C0946.m55979("ܿ֨") ^ i6) * (-87);
                        i2 = ((iM55979 ^ i5) * 6205) ^ 965513949;
                        i3 = -2090307520;
                    } else {
                        iM55979 = C0873.m55680("۬ᩳ") ^ i6;
                        i2 = ((iM55979 ^ i5) * (-14795)) ^ 1722262208;
                        i3 = -810687662;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
                case -562274826:
                case 985204923:
                    C0892.m55749();
                    if (C1229.m56410() == 0) {
                        iM55979 = C0873.m55680("ᩴܳ") ^ i5;
                        i2 = ((iM55979 ^ i6) * 2725) ^ 492336627;
                        i3 = -1128570532;
                    } else {
                        iM55979 = (C0946.m55979("ۗ۟") ^ i5) * 95;
                        i2 = ((iM55979 ^ i6) * 7475) ^ 851046127;
                        i3 = -1904035747;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
                case -378773475:
                case 358339185:
                    iM559711 = C0946.m55979(C1124.m56373(sArr2, i12, 3, i11));
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = C0873.m55680("᩸ۗ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 14983) ^ 878680479;
                        i4 = 24300090;
                        i8 = iM55680 ^ i4;
                    } else {
                        iM55979 = (C0946.m55979("ܿ֨") ^ i6) * (-87);
                        i2 = ((iM55979 ^ i5) * 6205) ^ 965513949;
                        i3 = -2090307520;
                        i8 = iM55979 ^ i3;
                        i7 = i2;
                    }
                    break;
                case -192365834:
                case 876239452:
                    i11 = 38397;
                    iM55979 = (C0946.m55979("۬᩹") + i5) * (-23);
                    i2 = ((iM55979 ^ i6) * 7829) ^ 1970329436;
                    i3 = 4963639;
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
                case 12309176:
                case 1201341574:
                    return new ViewOnClickListenerC5569(c14956, layoutInflaterFrom.inflate(i9, viewGroup, z));
                case 381299073:
                case 1206769275:
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0946.m55979("ۙ۟") ^ i5) * (-107);
                        i2 = ((iM55979 ^ i6) * 16509) ^ 965533721;
                        i3 = -184033185;
                    } else {
                        int iM55943 = ViewOnClickListenerC0939.m55943(5.0f);
                        if (RunnableC0938.f81886 < 0) {
                            view.setLayoutParams(new ViewGroup.LayoutParams(-1, iM55943));
                            return new C6910(view);
                        }
                        iM55979 = (C0946.m55979("ۗ۟") ^ i5) * 95;
                        i2 = ((iM55979 ^ i6) * 7475) ^ 851046127;
                        i3 = -1904035747;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
                case 466308873:
                case 1181369551:
                    c14956 = this.f68234;
                    if (i != 0) {
                        iM55979 = (i6 - C0946.m55979("ܺۘ")) * 95;
                        i2 = ((iM55979 ^ i5) * (-23707)) ^ 392675507;
                        i3 = 625313684;
                        i8 = iM55979 ^ i3;
                        i7 = i2;
                    } else {
                        iM55680 = C0873.m55680("᩵ۛ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 1655) ^ 652529169;
                        i4 = 1501439005;
                        i8 = iM55680 ^ i4;
                    }
                    break;
                case 504634911:
                case 1999387841:
                    int i14 = s + s2;
                    if ((i14 * i14) - i10 < 0) {
                        iM55979 = C0946.m55979("ۗܳ") ^ i6;
                        i2 = ((iM55979 ^ i5) * 31957) ^ (-1811026229);
                        i3 = 623996288;
                    } else {
                        iM55979 = (C0946.m55979("۠᩹") ^ i5) * (-41);
                        i2 = ((iM55979 ^ i6) * 30675) ^ (-468530936);
                        i3 = -1151345747;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
                case 578653134:
                case 1016143416:
                    C1036.m56257();
                    return null;
                case 1088831515:
                case 1736915114:
                    if (C0906.m55809() <= 0) {
                        iM55979 = (C0946.m55979("ۙ۟") ^ i5) * (-107);
                        i2 = ((iM55979 ^ i6) * 16509) ^ 965533721;
                        i3 = -184033185;
                    } else {
                        iM55979 = (C0946.m55979("ܰۛ") ^ i5) * 69;
                        i2 = ((iM55979 ^ i6) * 6761) ^ (-820787540);
                        i3 = -2104421772;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
                default:
                    s = sArr[10];
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0946.m55979("ۙ۟") ^ i5) * (-107);
                        i2 = ((iM55979 ^ i6) * 16509) ^ 965533721;
                        i3 = -184033185;
                    } else {
                        iM55979 = (C0873.m55680("ۜᩳ") ^ i5) * (-81);
                        i2 = ((iM55979 ^ i6) * 21023) ^ 2113149972;
                        i3 = 1645025753;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    break;
            }
        }
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        C14956 c14956 = null;
        int iM55989 = 0;
        int i = -1379122285;
        int i2 = RunnableC0938.f81886;
        int i3 = C1028.f81950;
        int iM55979 = (i3 - C0946.m55979("ۗ᩷")) * 17;
        int i4 = ((iM55979 ^ i2) * (-12059)) ^ 1691542910;
        int i5 = -78293357;
        while (true) {
            i = ((((i ^ i2) * (-27125)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2093839773:
                case 789272102:
                    c14956 = this.f68234;
                    if (C1046.m56302() != 0) {
                        iM55979 = (C0946.m55979("᩶ۘ") ^ i2) * 13;
                        i4 = ((iM55979 ^ i3) * (-9923)) ^ 61485677;
                        i5 = 985962137;
                    } else {
                        iM55979 = C0946.m55979("ᩴܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4495)) ^ 645074900;
                        i5 = -494366182;
                    }
                    break;
                case -2074528577:
                case 355314285:
                    C0989.m56095();
                    C1036.m56257();
                    iM55979 = C0946.m55979("᩷ۨ") ^ i3;
                    i4 = ((iM55979 ^ i2) * 8043) ^ 2102898736;
                    i5 = 2129768170;
                    break;
                case -2041408150:
                case 1920438905:
                    if (C0927.m55873() <= 0) {
                        iM55979 = (C0946.m55979("۬᩸") + i2) * 71;
                        i4 = ((iM55979 ^ i3) * (-31471)) ^ 324829899;
                        i5 = -1668403426;
                    } else {
                        iM55979 = (C0946.m55979("ۛ᩻") + i3) * 51;
                        i4 = ((iM55979 ^ i2) * (-2127)) ^ (-369383102);
                        i5 = -1335713272;
                    }
                    break;
                case -2021935907:
                case 490487322:
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0946.m55979("۬᩺") + i3) * 61;
                        i4 = ((iM55979 ^ i2) * 23811) ^ 94154842;
                        i5 = -561918103;
                    } else {
                        iM55979 = (C0946.m55979("ۡ᩻") + i3) * (-7);
                        i4 = ((iM55979 ^ i2) * 30793) ^ (-690945812);
                        i5 = -568528110;
                    }
                    break;
                case -1819708564:
                case -1499135317:
                    if (C0955.m56025()) {
                        iM55979 = (C0946.m55979("۬᩺") + i3) * 61;
                        i4 = ((iM55979 ^ i2) * 23811) ^ 94154842;
                        i5 = -561918103;
                    } else {
                        iM55979 = (C0873.m55680("ۚ᩻") ^ i3) * (-97);
                        i4 = ((iM55979 ^ i2) * 20361) ^ 1484176833;
                        i5 = 448013926;
                    }
                    break;
                case -1647063956:
                case -300646219:
                    if (C0890.f81849 != 0) {
                        iM55979 = C0946.m55979("᩷ۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8043) ^ 2102898736;
                        i5 = 2129768170;
                    } else {
                        iM55979 = C0873.m55680("ۚۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1531)) ^ (-2106537556);
                        i5 = 397513084;
                    }
                    break;
                case -1405487218:
                case -696987879:
                    return 0;
                case -1298129319:
                case 143653021:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0946.m55979("۬᩸") + i2) * 71;
                        i4 = ((iM55979 ^ i3) * (-31471)) ^ 324829899;
                        i5 = -1668403426;
                    } else {
                        iM55979 = C0873.m55680("ۙܳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26353)) ^ 849467996;
                        i5 = 40531772;
                    }
                    break;
                case -1273462545:
                case -1026931815:
                    iM55989 = C0947.m55989(c14956.f42705);
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0946.m55979("᩶ۘ") ^ i2) * 13;
                        i4 = ((iM55979 ^ i3) * (-9923)) ^ 61485677;
                        i5 = 985962137;
                    } else {
                        iM55979 = (C0946.m55979("֨ܽ") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i3) * 25) ^ 491296168;
                        i5 = -40477700;
                    }
                    break;
                case -853835625:
                case 14558448:
                    if (C0949.m56018(c14956.f42705)) {
                        iM55979 = (C0873.m55680("ܽ۫") ^ i3) * 27;
                        i4 = ((iM55979 ^ i2) * (-7795)) ^ (-152078640);
                        i5 = 243353616;
                    } else {
                        iM55979 = (C0873.m55680("ܶۢ") + i2) * (-27);
                        i4 = ((iM55979 ^ i3) * 32207) ^ 1044115795;
                        i5 = 1578461879;
                    }
                    break;
                case -352611868:
                case -123969504:
                    if (!C0882.f81846) {
                        iM55979 = (C0946.m55979("۬᩺") + i3) * 61;
                        i4 = ((iM55979 ^ i2) * 23811) ^ 94154842;
                        i5 = -561918103;
                    } else {
                        iM55979 = (C0946.m55979("᩶ۘ") ^ i2) * 13;
                        i4 = ((iM55979 ^ i3) * (-9923)) ^ 61485677;
                        i5 = 985962137;
                    }
                    break;
                case 86870241:
                case 1346532465:
                    if (C1404.m56468()) {
                        iM55979 = C0873.m55680("ۘ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * 731) ^ 1238862991;
                        i5 = -730220510;
                    } else {
                        iM55979 = C0946.m55979("᩷ۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8043) ^ 2102898736;
                        i5 = 2129768170;
                    }
                    break;
                case 166371515:
                case 1183629249:
                    return iM55989 + 1;
                case 268444165:
                case 1387201265:
                    if (C0992.f81922 >= 0) {
                        iM55979 = (C0946.m55979("۬᩺") + i3) * 61;
                        i4 = ((iM55979 ^ i2) * 23811) ^ 94154842;
                        i5 = -561918103;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩵۬")) * (-51);
                        i4 = ((iM55979 ^ i3) * 29101) ^ 453503288;
                        i5 = -451741094;
                    }
                    break;
                case 405527902:
                case 880682340:
                    C1071.m56343();
                    C0946.m55980();
                    return 0;
                case 942219187:
                case 1602093454:
                    C0947.m55997();
                    if (C1194.f82045 == 0) {
                        iM55979 = (i2 - C0873.m55680("᩵۬")) * (-51);
                        i4 = ((iM55979 ^ i3) * 29101) ^ 453503288;
                        i5 = -451741094;
                    } else {
                        iM55979 = C0946.m55979("᩷ۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8043) ^ 2102898736;
                        i5 = 2129768170;
                    }
                    break;
                case 1196898459:
                case 1936225804:
                    if (C1194.m56396() <= 0) {
                        iM55979 = (C0946.m55979("۬᩺") + i3) * 61;
                        i4 = ((iM55979 ^ i2) * 23811) ^ 94154842;
                        i5 = -561918103;
                    } else {
                        iM55979 = C0873.m55680("֫ۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31865) ^ (-1150979548);
                        i5 = 54780696;
                    }
                    break;
                default:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (i2 - C0873.m55680("᩵۬")) * (-51);
                        i4 = ((iM55979 ^ i3) * 29101) ^ 453503288;
                        i5 = -451741094;
                    } else {
                        iM55979 = C0873.m55680("᩶ۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-693)) ^ (-1783553643);
                        i5 = -1046310789;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        C20521 c20521;
        TextView textView;
        int i2;
        ViewOnClickListenerC5569 viewOnClickListenerC5569;
        int i3;
        TextView textView2;
        int i4;
        short[] sArr;
        String str;
        int iM55979;
        int i5;
        int iM559710;
        int i6;
        int i7;
        int i8;
        int i9;
        C20521 c20522;
        int i10;
        int iM559711;
        int i11;
        C20521 c20523;
        String str2;
        int i12;
        C20521 c20524;
        TextView textView3;
        TextView textView4;
        short[] sArr2;
        int i13;
        C20521 c20525;
        int i14;
        int i15;
        TextView textView5;
        String str3;
        int iM55680;
        int i16;
        int i17;
        int iM55681;
        int i18;
        int iM55682;
        int i19;
        int i20 = 0;
        short[] sArr3 = null;
        int i21 = 0;
        int i22 = 468796925;
        int i23 = C0863.f81833;
        int i24 = C0866.f81837;
        int iM55683 = C0873.m55680("᩸ܽ") ^ i23;
        int i25 = ((iM55683 ^ i24) * (-31815)) ^ 828164273;
        int i26 = iM55683 ^ 2088047877;
        ImageView imageView = null;
        String strM46280 = null;
        SpannableStringBuilder spannableStringBuilderM56254 = null;
        TextView textView6 = null;
        short[] sArr4 = null;
        int i27 = 0;
        int iM55762 = 0;
        int iM55933 = 0;
        int iM51761 = 0;
        int iM559712 = 0;
        int i28 = 0;
        int i29 = 0;
        short s = 0;
        C20521 c20526 = null;
        TextView textView7 = null;
        SpannableStringBuilder spannableStringBuilder = null;
        String strM55921 = null;
        ViewOnClickListenerC5569 viewOnClickListenerC55610 = null;
        int i30 = 0;
        int i31 = 0;
        SpannableStringBuilder spannableStringBuilderM56255 = null;
        short[] sArr5 = null;
        while (true) {
            i22 = i26 ^ (i25 & (((i22 ^ i24) * 24383) >> 31));
            switch (i22) {
                case -2003751821:
                case -717768678:
                    c20522 = c20526;
                    textView = textView6;
                    textView2 = textView7;
                    sArr = sArr4;
                    i10 = i29;
                    i3 = i21;
                    i4 = i27;
                    String str4 = strM46280;
                    imageView = imageView;
                    sArr3 = sArr3;
                    str = str4;
                    if (abstractC5462 instanceof ViewOnClickListenerC5569) {
                        iM559711 = C0946.m55979("᩸ᩳ") ^ i24;
                        i25 = ((iM559711 ^ i23) * 19963) ^ 723445920;
                        i11 = 973413485;
                    } else {
                        iM559711 = C0873.m55680("᩷֫") ^ i23;
                        i25 = ((iM559711 ^ i24) * (-3525)) ^ (-1904122922);
                        i11 = 710002735;
                    }
                    i8 = iM559711 ^ i11;
                    i29 = i10;
                    c20526 = c20522;
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
                    strM46280 = str2;
                    break;
                case -1940038993:
                case -459230483:
                    C0894.m55771(textView6, c20526.m46281());
                    textView = textView6;
                    c20522 = c20526;
                    C17837.m40506(C0947.m55990(c20526), c20526.m46311(), c20526.m46289(), viewOnClickListenerC55610.f13465);
                    textView2 = textView7;
                    sArr = sArr4;
                    i10 = i29;
                    i3 = i21;
                    i4 = i27;
                    String str5 = strM46280;
                    imageView = imageView;
                    sArr3 = sArr3;
                    str = str5;
                    iM559711 = C0873.m55680("᩷֫") ^ i23;
                    i25 = ((iM559711 ^ i24) * (-3525)) ^ (-1904122922);
                    i11 = 710002735;
                    i8 = iM559711 ^ i11;
                    i29 = i10;
                    c20526 = c20522;
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
                    strM46280 = str2;
                    break;
                case -1909138608:
                case -181409291:
                    i12 = i27;
                    c20524 = c20526;
                    textView3 = textView6;
                    textView4 = textView7;
                    String str6 = strM46280;
                    sArr2 = sArr4;
                    i13 = i29;
                    viewOnClickListenerC55610.f13464 = c20524;
                    imageView = viewOnClickListenerC55610.f13465;
                    short[] sArr6 = f82974;
                    if (C0866.f81837 >= 0) {
                        strM46280 = str6;
                        i21 = 1;
                        sArr3 = sArr6;
                        int iM559713 = C0946.m55979("ۗۧ") ^ i24;
                        c20525 = c20524;
                        i29 = i13;
                        sArr4 = sArr2;
                        textView7 = textView4;
                        textView6 = textView3;
                        i26 = iM559713 ^ 1794390365;
                        i25 = ((iM559713 ^ i23) * (-3869)) ^ 915806759;
                        i27 = i12;
                        i21 = i21;
                        c20526 = c20525;
                    } else {
                        int iM559714 = (C0946.m55979("ᩳ۟") ^ i23) * (-105);
                        i29 = i13;
                        strM46280 = str6;
                        sArr4 = sArr2;
                        sArr3 = sArr6;
                        i25 = ((iM559714 ^ i24) * 1041) ^ (-5029147);
                        textView7 = textView4;
                        textView6 = textView3;
                        c20526 = c20524;
                        i26 = iM559714 ^ 1757981231;
                        i27 = i12;
                        i21 = 1;
                    }
                    break;
                case -1603362620:
                case -91018935:
                    c20521 = c20526;
                    textView = textView6;
                    sArr = sArr4;
                    i2 = i29;
                    short[] sArr7 = sArr3;
                    str = strM46280;
                    int i32 = i21;
                    int iM55684 = C0873.m55680(C0917.m55852(sArr7, i32, 3, i27)) ^ 2098052965;
                    i4 = i27;
                    ImageView imageView2 = imageView;
                    imageView2.setImageResource(iM55684);
                    TextView textView10 = viewOnClickListenerC55610.f13461;
                    if (C0894.f81854 >= 0) {
                        imageView = imageView2;
                        i3 = i32;
                        viewOnClickListenerC5569 = viewOnClickListenerC55610;
                        sArr3 = sArr7;
                        textView2 = textView10;
                        iM55979 = C0873.m55680("ܺ֫") ^ i23;
                        i25 = ((iM55979 ^ i24) * (-8777)) ^ (-1118970377);
                        i5 = -853566781;
                        i8 = iM55979 ^ i5;
                        viewOnClickListenerC55610 = viewOnClickListenerC5569;
                        c20526 = c20521;
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
                        int iM55685 = C0873.m55680("᩷ۧ") ^ i23;
                        imageView = imageView2;
                        i29 = i2;
                        sArr4 = sArr;
                        textView7 = textView10;
                        c20526 = c20521;
                        i25 = ((iM55685 ^ i24) * 23621) ^ (-1251131350);
                        i27 = i4;
                        i21 = i32;
                        str2 = str;
                        sArr3 = sArr7;
                        textView6 = textView;
                        i26 = iM55685 ^ (-1442949612);
                    }
                    imageView = imageView;
                    strM46280 = str2;
                    break;
                case -1465410377:
                case 533519037:
                    c20525 = c20526;
                    C0873.m55690(spannableStringBuilder, new ForegroundColorSpan(iM51761), iM55762, iM55933, 33);
                    C0894.m55771(viewOnClickListenerC55610.f13460, spannableStringBuilder);
                    textView6 = viewOnClickListenerC55610.f13463;
                    if (C1071.f81975 <= 0) {
                        iM55682 = C0946.m55979("ܳۚ") ^ i23;
                        i14 = ((iM55682 ^ i24) * 19083) ^ 459006595;
                        i19 = 1858684961;
                    } else {
                        iM55682 = (C0873.m55680("ܽܽ") + i24) * 55;
                        i14 = ((iM55682 ^ i23) * (-1345)) ^ 170968510;
                        i19 = 2090099882;
                    }
                    i26 = iM55682 ^ i19;
                    i25 = i14;
                    c20526 = c20525;
                    break;
                case -1395366287:
                case -399799613:
                    str = strM46280;
                    i9 = 14916;
                    int iM559715 = C0946.m55979("ᩴ۫") ^ i23;
                    int i33 = i9;
                    int i34 = ((iM559715 ^ i24) * (-20599)) ^ (-63524492);
                    int i35 = iM559715 ^ (-840973844);
                    i29 = i29;
                    c20526 = c20526;
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
                    strM46280 = str2;
                    break;
                case -1323946427:
                case -636249483:
                    c20525 = c20526;
                    textView3 = textView6;
                    short[] sArr8 = sArr4;
                    i13 = i29;
                    textView4 = textView7;
                    RunnableC0938.m55928(textView4, c20525.m46298());
                    spannableStringBuilder = new SpannableStringBuilder();
                    strM46280 = c20525.m46280();
                    if (!C0937.f81884) {
                        sArr2 = sArr8;
                        i12 = i27;
                        c20524 = c20525;
                        int iM559716 = C0946.m55979("ۗۧ") ^ i24;
                        c20525 = c20524;
                        i29 = i13;
                        sArr4 = sArr2;
                        textView7 = textView4;
                        textView6 = textView3;
                        i26 = iM559716 ^ 1794390365;
                        i25 = ((iM559716 ^ i23) * (-3869)) ^ 915806759;
                        i27 = i12;
                        i21 = i21;
                        c20526 = c20525;
                    } else {
                        int iM559717 = (C0946.m55979("᩹ۗ") ^ i24) * 13;
                        i14 = ((iM559717 ^ i23) * 6249) ^ 384077825;
                        i15 = iM559717 ^ 828880007;
                        i29 = i13;
                        sArr4 = sArr8;
                        textView7 = textView4;
                        textView6 = textView3;
                        i26 = i15;
                        i25 = i14;
                        c20526 = c20525;
                    }
                    break;
                case -1244154450:
                case 424733727:
                    C1053.m56327();
                    break;
                case -1053360618:
                case -450558827:
                    textView = textView6;
                    int i36 = i21;
                    textView2 = textView7;
                    sArr = sArr4;
                    i2 = i29;
                    String str7 = strM46280;
                    imageView = imageView;
                    sArr3 = sArr3;
                    str = str7;
                    viewOnClickListenerC55610 = (ViewOnClickListenerC5569) abstractC5462;
                    i4 = i27;
                    i3 = i36;
                    c20523 = (C20521) C1964.m56587(this.f68234.f42705, i);
                    if (C0992.f81922 < 0) {
                        int iM55686 = C0873.m55680("᩵ۤ") ^ i24;
                        i25 = ((iM55686 ^ i23) * (-26459)) ^ 1076122820;
                        i8 = iM55686 ^ 1360311900;
                        c20526 = c20523;
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
                        strM46280 = str2;
                    } else {
                        int iM559718 = (C0946.m55979("ۜۜ") ^ i23) * 45;
                        c20526 = c20523;
                        i25 = ((iM559718 ^ i24) * 15959) ^ 1697753673;
                        i27 = i4;
                        i21 = i3;
                        sArr4 = sArr;
                        textView7 = textView2;
                        textView6 = textView;
                        i26 = iM559718 ^ (-1552515025);
                        i29 = i2;
                        String str8 = str;
                        sArr3 = sArr3;
                        imageView = imageView;
                        strM46280 = str8;
                    }
                    break;
                case -1038135678:
                case 461038569:
                    if (C0937.f81884) {
                        c20525 = c20526;
                        textView5 = textView6;
                        str3 = strM46280;
                        iM55680 = (C0873.m55680("ܽܶ") + i24) * 5;
                        i16 = ((iM55680 ^ i23) * 10557) ^ 1777773335;
                        i17 = 465281899;
                        int i37 = iM55680 ^ i17;
                        strM46280 = str3;
                        i25 = i16;
                        textView6 = textView5;
                        i26 = i37;
                        c20526 = c20525;
                    }
                    textView3 = textView6;
                    textView4 = textView7;
                    sArr2 = sArr4;
                    i13 = i29;
                    int i38 = i21;
                    i12 = i27;
                    c20524 = c20526;
                    i21 = i38;
                    int iM559719 = C0946.m55979("ۗۧ") ^ i24;
                    c20525 = c20524;
                    i29 = i13;
                    sArr4 = sArr2;
                    textView7 = textView4;
                    textView6 = textView3;
                    i26 = iM559719 ^ 1794390365;
                    i25 = ((iM559719 ^ i23) * (-3869)) ^ 915806759;
                    i27 = i12;
                    i21 = i21;
                    c20526 = c20525;
                    break;
                case -705414029:
                case 1057126257:
                    if (C0898.f81858 > 0) {
                        c20523 = c20526;
                        textView = textView6;
                        textView2 = textView7;
                        sArr = sArr4;
                        i2 = i29;
                        i3 = i21;
                        i4 = i27;
                        String str9 = strM46280;
                        imageView = imageView;
                        sArr3 = sArr3;
                        str = str9;
                        int iM5597110 = (C0946.m55979("ۜۜ") ^ i23) * 45;
                        c20526 = c20523;
                        i25 = ((iM5597110 ^ i24) * 15959) ^ 1697753673;
                        i27 = i4;
                        i21 = i3;
                        sArr4 = sArr;
                        textView7 = textView2;
                        textView6 = textView;
                        i26 = iM5597110 ^ (-1552515025);
                        i29 = i2;
                        String str10 = str;
                        sArr3 = sArr3;
                        imageView = imageView;
                        strM46280 = str10;
                    } else {
                        textView3 = textView6;
                        textView4 = textView7;
                        sArr2 = sArr4;
                        i13 = i29;
                        int i39 = i21;
                        i12 = i27;
                        c20524 = c20526;
                        i21 = i39;
                        int iM5597111 = C0946.m55979("ۗۧ") ^ i24;
                        c20525 = c20524;
                        i29 = i13;
                        sArr4 = sArr2;
                        textView7 = textView4;
                        textView6 = textView3;
                        i26 = iM5597111 ^ 1794390365;
                        i25 = ((iM5597111 ^ i23) * (-3869)) ^ 915806759;
                        i27 = i12;
                        i21 = i21;
                        c20526 = c20525;
                    }
                    break;
                case -597902393:
                case 1707228126:
                    c20525 = c20526;
                    textView5 = textView6;
                    str3 = strM46280;
                    spannableStringBuilderM56255 = C1036.m56254(spannableStringBuilder, str3);
                    sArr4 = f82974;
                    i29 = 4;
                    if (C0947.f81895) {
                        iM55680 = (C0873.m55680("ܽܶ") + i24) * 5;
                        i16 = ((iM55680 ^ i23) * 10557) ^ 1777773335;
                        i17 = 465281899;
                    } else {
                        iM55680 = C0873.m55680("ۚ᩶") ^ i24;
                        i16 = ((iM55680 ^ i23) * 20205) ^ (-658249772);
                        i17 = -754604493;
                    }
                    int i310 = iM55680 ^ i17;
                    strM46280 = str3;
                    i25 = i16;
                    textView6 = textView5;
                    i26 = i310;
                    c20526 = c20525;
                    break;
                case -450156098:
                case 203824876:
                    c20521 = c20526;
                    textView = textView6;
                    short[] sArr9 = sArr4;
                    i2 = i29;
                    strM55921 = C0937.m55921(sArr9, i2, 3, i27);
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilderM56255;
                    spannableStringBuilderM56254 = C1036.m56254(C1036.m56254(spannableStringBuilder2, strM55921), C24158.m53411(c20521.m46292()));
                    if (C0866.m55645()) {
                        int iM55687 = (C0873.m55680("ۨܰ") ^ i23) * (-85);
                        spannableStringBuilderM56255 = spannableStringBuilder2;
                        i25 = ((iM55687 ^ i24) * (-10843)) ^ 231957847;
                        sArr4 = sArr9;
                        i29 = i2;
                        c20526 = c20521;
                        i26 = iM55687 ^ (-712568762);
                        textView6 = textView;
                    } else {
                        spannableStringBuilderM56255 = spannableStringBuilder2;
                        viewOnClickListenerC5569 = viewOnClickListenerC55610;
                        i3 = i21;
                        textView2 = textView7;
                        i4 = i27;
                        sArr = sArr9;
                        String str11 = strM46280;
                        imageView = imageView;
                        sArr3 = sArr3;
                        str = str11;
                        iM55979 = C0873.m55680("ܺ֫") ^ i23;
                        i25 = ((iM55979 ^ i24) * (-8777)) ^ (-1118970377);
                        i5 = -853566781;
                        i8 = iM55979 ^ i5;
                        viewOnClickListenerC55610 = viewOnClickListenerC5569;
                        c20526 = c20521;
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
                        strM46280 = str2;
                    }
                    break;
                case -112921952:
                case 389978842:
                    c20521 = c20526;
                    textView = textView6;
                    textView2 = textView7;
                    sArr = sArr4;
                    i2 = i29;
                    i3 = i21;
                    i4 = i27;
                    String str12 = strM46280;
                    imageView = imageView;
                    sArr3 = sArr3;
                    str = str12;
                    int i40 = i20 + 96177249;
                    viewOnClickListenerC5569 = viewOnClickListenerC55610;
                    short s2 = s;
                    int i41 = s2 + 9807;
                    if ((i41 * i41) - (i40 + i40) <= 0) {
                        iM559710 = (C0946.m55979("۟ۜ") ^ i24) * (-65);
                        i6 = ((iM559710 ^ i23) * 9875) ^ 287188523;
                        i7 = -1076662175;
                    } else {
                        iM559710 = (C0946.m55979("ۤ᩻") + i24) * (-89);
                        i6 = ((iM559710 ^ i23) * (-28145)) ^ 882710501;
                        i7 = -1181924582;
                    }
                    i8 = iM559710 ^ i7;
                    s = s2;
                    i25 = i6;
                    viewOnClickListenerC55610 = viewOnClickListenerC5569;
                    c20526 = c20521;
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
                    strM46280 = str2;
                    break;
                case -48076269:
                case 1982000423:
                    C1044.m56286();
                    textView3 = textView6;
                    textView4 = textView7;
                    sArr2 = sArr4;
                    i13 = i29;
                    int i311 = i21;
                    i12 = i27;
                    c20524 = c20526;
                    i21 = i311;
                    int iM5597112 = C0946.m55979("ۗۧ") ^ i24;
                    c20525 = c20524;
                    i29 = i13;
                    sArr4 = sArr2;
                    textView7 = textView4;
                    textView6 = textView3;
                    i26 = iM5597112 ^ 1794390365;
                    i25 = ((iM5597112 ^ i23) * (-3869)) ^ 915806759;
                    i27 = i12;
                    i21 = i21;
                    c20526 = c20525;
                    break;
                case 124473193:
                case 1074698087:
                    if (C0863.f81833 <= 0) {
                        c20525 = c20526;
                        iM55682 = C0946.m55979("ܳۚ") ^ i23;
                        i14 = ((iM55682 ^ i24) * 19083) ^ 459006595;
                        i19 = 1858684961;
                        i26 = iM55682 ^ i19;
                        i25 = i14;
                        c20526 = c20525;
                    }
                    textView3 = textView6;
                    textView4 = textView7;
                    sArr2 = sArr4;
                    i13 = i29;
                    int i312 = i21;
                    i12 = i27;
                    c20524 = c20526;
                    i21 = i312;
                    int iM5597113 = C0946.m55979("ۗۧ") ^ i24;
                    c20525 = c20524;
                    i29 = i13;
                    sArr4 = sArr2;
                    textView7 = textView4;
                    textView6 = textView3;
                    i26 = iM5597113 ^ 1794390365;
                    i25 = ((iM5597113 ^ i23) * (-3869)) ^ 915806759;
                    i27 = i12;
                    i21 = i21;
                    c20526 = c20525;
                    break;
                case 517954066:
                case 1816355205:
                    c20525 = c20526;
                    textView3 = textView6;
                    C0854.m55604(spannableStringBuilderM56254, strM55921);
                    iM55762 = C0894.m55762(spannableStringBuilder);
                    sArr5 = f82974;
                    i31 = 7;
                    i30 = 3;
                    iM55681 = (i24 - C0873.m55680("ۧۢ")) * (-69);
                    i14 = ((iM55681 ^ i23) * 21113) ^ 909480501;
                    i18 = -456314364;
                    i15 = iM55681 ^ i18;
                    textView6 = textView3;
                    i26 = i15;
                    i25 = i14;
                    c20526 = c20525;
                    break;
                case 733241700:
                case 1700723559:
                    c20525 = c20526;
                    textView3 = textView6;
                    C0854.m55604(spannableStringBuilder, ServiceConnectionC1013.m56156(iM559712 ^ i28));
                    iM55933 = RunnableC0938.m55933(spannableStringBuilder);
                    iM51761 = C23223.m51761(-1996767, -29696);
                    if (RunnableC1014.f81941 > 0) {
                        iM55681 = (C0873.m55680("ܳܿ") + i23) * (-91);
                        i14 = ((iM55681 ^ i24) * 28191) ^ (-2097474060);
                        i18 = -1934959882;
                        i15 = iM55681 ^ i18;
                        textView6 = textView3;
                        i26 = i15;
                        i25 = i14;
                        c20526 = c20525;
                    } else {
                        textView4 = textView7;
                        sArr2 = sArr4;
                        i13 = i29;
                        i12 = i27;
                        c20524 = c20525;
                        int iM5597114 = C0946.m55979("ۗۧ") ^ i24;
                        c20525 = c20524;
                        i29 = i13;
                        sArr4 = sArr2;
                        textView7 = textView4;
                        textView6 = textView3;
                        i26 = iM5597114 ^ 1794390365;
                        i25 = ((iM5597114 ^ i23) * (-3869)) ^ 915806759;
                        i27 = i12;
                        i21 = i21;
                        c20526 = c20525;
                    }
                    break;
                case 851030330:
                case 1400403198:
                    break;
                case 1064856124:
                case 1971251192:
                    c20525 = c20526;
                    textView3 = textView6;
                    iM559712 = C0946.m55979(ViewOnClickListenerC0939.m55947(sArr5, i31, i30, i27));
                    i28 = 2120286570;
                    if (C0906.f81862 < 0) {
                        iM55681 = (C0873.m55680("֡ۖ") ^ i23) * 101;
                        i14 = ((iM55681 ^ i24) * 10415) ^ 125793194;
                        i18 = -1337535421;
                        i15 = iM55681 ^ i18;
                        textView6 = textView3;
                        i26 = i15;
                        i25 = i14;
                        c20526 = c20525;
                    } else {
                        textView6 = textView3;
                        iM55682 = C0946.m55979("ܳۚ") ^ i23;
                        i14 = ((iM55682 ^ i24) * 19083) ^ 459006595;
                        i19 = 1858684961;
                        i26 = iM55682 ^ i19;
                        i25 = i14;
                        c20526 = c20525;
                    }
                    break;
                case 1688038849:
                case 2117863359:
                    c20521 = c20526;
                    textView = textView6;
                    textView2 = textView7;
                    sArr = sArr4;
                    i2 = i29;
                    viewOnClickListenerC5569 = viewOnClickListenerC55610;
                    i3 = i21;
                    i4 = i27;
                    String str13 = strM46280;
                    imageView = imageView;
                    sArr3 = sArr3;
                    str = str13;
                    s = f82974[0];
                    i20 = s * s;
                    if (C0955.f81898) {
                        iM55979 = C0873.m55680("ܺ֫") ^ i23;
                        i25 = ((iM55979 ^ i24) * (-8777)) ^ (-1118970377);
                        i5 = -853566781;
                    } else {
                        iM55979 = C0946.m55979("֡ܰ") ^ i23;
                        i25 = ((iM55979 ^ i24) * (-31929)) ^ (-1672839551);
                        i5 = -508623858;
                    }
                    i8 = iM55979 ^ i5;
                    viewOnClickListenerC55610 = viewOnClickListenerC5569;
                    c20526 = c20521;
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
                    strM46280 = str2;
                    break;
                default:
                    str = strM46280;
                    i9 = 44570;
                    int iM5597115 = C0946.m55979("ᩴ۫") ^ i23;
                    int i313 = i9;
                    int i314 = ((iM5597115 ^ i24) * (-20599)) ^ (-63524492);
                    int i315 = iM5597115 ^ (-840973844);
                    i29 = i29;
                    c20526 = c20526;
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
                    strM46280 = str2;
                    break;
            }
            return;
        }
    }

    public C21663(C14956 c14956) {
        this.f68234 = c14956;
    }
}
