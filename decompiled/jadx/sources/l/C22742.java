package l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩺ۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes.dex */
public final class C22742 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ۢۖ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f73451 = {8983, 29073, 25750, -28805, 1544, 25077, 25082, 25085, 25081, 25077, 25056, 25085, 25083, 25082, 2106, -15341, -15332, -15333, -15329, -15341, -15354, -15333, -15331, -15332, -15341, -15330, -15358, -15334, -15341, 8003, 29482, 29477, 29474, 29478, 29482, 29503, 29474, 29476, 29477, 6089, -6566, -6571, -6574, -6570, -6566, -6577, -6574, -6572, -6571, -17621, 30210, -18729, -6654, -6647, -6646, -6642, -6642, -6653, -6641, -6641, -6642, -6533, -6582, -6582, -6635, -6568, -6572, -6570, -6564, -6562, -6577, -6531, -6583, -6572, -6570, -6536, -6566, -6568, -6573, -6562, -6637, -6635, -6635, -6635, -6638, -6582, -6582, -6556, -6582, -6578, -6571, -6646, -6582, -6582, -6556, -6582, -6578, -6571, -6647, -6648, -6645, -6644, -6653, -6646, -6644, -6645, -6642, -6653, -6585, -6573, -6577, -6577, -6581, -6584, -6655, -6636, -6636, -6575, -6582, -6635, -6582, -6582, -6635, -6568, -6572, -6570, -6636, -6652, -6556, -6580, -6579, -6650, -6646, -6645, -6647, -6644, -6627, -6576, -6650, -6535, -6644, -6544, -6646, -6573, -6563, -6544, -6552, -6585, -6578, -6541, -6547, -6581, -6582, -6538, -6645, -6546, -6571, -6578, -6558, -6578, -6573, -6654, -6589, -6546, -6552, -6572, -6542, -6562, -6537, -6642, -6583, -6580, -6539, -6641, -6564, -6566, -6573, -6642, -6642, -6579, -6582, -6582, -6556, -6582, -6578, -6571, -6648, -6647, -6642, -6647, -6647, -6648, -6648, -6653, -6654, -6646, -6585, -6573, -6577, -6577, -6581, -6584, -6655, -6636, -6636, -6575, -6582, -6635, -6582, -6582, -6635, -6568, -6572, -6570, -6636, -6652, -6556, -6580, -6579, -6650, -6646, -6645, -6647, -6644, -6627, -6576, -6650, -6580, -6548, -6646, -6564, -6546, -6579, -6563, -6580, -6585, -6648, -6537, -6557, -6536, -6534, -6642, -6578, -6580, -6549, -6591, -6571, -6561, -6574, -6568, -6559, -6654, -6564, -6561, -6645, -6550, -6562, -6584, -6577, -6545, -6539, -6646, -6549, -6539, -6534, -6541, -6546, -6530, -6582, -6582, -6556, -6568, -6573, -6566, -6571, -6571, -6562, -6569, -6641, -6653, -6644, -6647, -6641, -6641, -6648, -6654, -6647, -6585, -6573, -6577, -6577, -6581, -6584, -6655, -6636, -6636, -6575, -6582, -6635, -6582, -6582, -6635, -6568, -6572, -6570, -6636, -6652, -6556, -6580, -6579, -6650, -6646, -6645, -6647, -6644, -6627, -6576, -6650, -6581, -6548, -6539, -6557, -6566, -6572, -6566, -6529, -6585, -6531, -6568, -6654, -6544, -6538, -6546, -6545, -6531, -6577, -6583, -6576, -6644, -6568, -6563, -6581, -6570, -6571, -6645, -6535, -6574, -6642, -6641, -6552, -6543, -6540, -6571, -6563, -6531, -6566, -6569, -6568, -6558, 30287, 30480, -19695, 31078, -32185, -25750, -17028, -22211, -28393, -19245, 24726, -16537, 30193, -20427, 26696, -20171, -26674, 26247, 24859, 27114, -26240, -6541, -6549, -6545, -6642, -6647, -6542, -6544, -6530, -6558, -6643, -6585, -6573, -6577, -6577, -6581, -6584, -6655, -6636, -6636, -6581, -6561, -6635, -6582, -6582, -6635, -6568, -6572, -6570, -6636, -6584, -6636, -6644, -6642, -6642, -6644, -6584, -6579, -6568, -6562, -6572};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f73452;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public View f73453;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11182 f73454;

    /* JADX WARN: Code duplicated, block: B:59:0x022e A[PHI: r0 r16 r17
      0x022e: PHI (r0v3 short[]) = (r0v1 short[]), (r0v2 short[]), (r0v1 short[]) binds: [B:58:0x022c, B:54:0x020a, B:14:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r16v12 int) = (r16v5 int), (r16v6 int), (r16v13 int) binds: [B:58:0x022c, B:54:0x020a, B:14:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r17v7 short) = (r17v2 short), (r17v3 short), (r17v8 short) binds: [B:58:0x022c, B:54:0x020a, B:14:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0282 A[PHI: r1 r16 r17
      0x0282: PHI (r1v5 char) = (r1v1 char), (r1v1 char), (r1v2 char), (r1v1 char) binds: [B:66:0x0280, B:62:0x0260, B:50:0x01e6, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r16v15 int) = (r16v3 int), (r16v4 int), (r16v7 int), (r16v16 int) binds: [B:66:0x0280, B:62:0x0260, B:50:0x01e6, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r17v11 short) = (r17v0 short), (r17v1 short), (r17v4 short), (r17v12 short) binds: [B:66:0x0280, B:62:0x0260, B:50:0x01e6, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (l.C0237.m1481() < 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        r17 = r2;
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (l.C1294.f4556 < 0) goto L7;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationRepeat(Animator animator) {
        int i;
        short s;
        int i2;
        int iM6981;
        int i3;
        int iM6982;
        int i4;
        int i5;
        short[] sArr = null;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        int i6 = 0;
        short s4 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 458306229;
        int i12 = C4263.f13799;
        int i13 = C2958.f9394;
        int iM2566 = (C0630.m2566("ۨ᩺") + i13) * (-53);
        int i14 = ((iM2566 ^ i12) * 21373) ^ 2038581544;
        int i15 = iM2566 ^ 1124098365;
        while (true) {
            i11 = ((((i11 ^ i12) * (-2475)) >> 31) & i14) ^ i15;
            switch (i11) {
                case -2088082967:
                case 2090242494:
                    s = s2;
                    i2 = i6;
                    if (C0630.f2410 <= 0) {
                        iM6981 = (i12 - C0630.m2566("᩸ۘ")) * 33;
                        i14 = 1799997552 ^ ((iM6981 ^ i13) * (-3089));
                        i3 = 893757884;
                    } else {
                        iM6981 = C2105.m6981("ۛۚ") ^ i13;
                        i14 = (-963241132) ^ ((iM6981 ^ i12) * (-21541));
                        i3 = -1020238813;
                    }
                    i15 = iM6981 ^ i3;
                    i6 = i2;
                    s2 = s;
                    break;
                case -1976365196:
                case -67793227:
                    C0483.m2121();
                    break;
                case -1764649564:
                case 956517290:
                    i = i6;
                    s2 = sArr[c];
                    s3 = 70504;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6982 = C0630.m2566("᩵᩵") ^ i12;
                        i14 = ((iM6982 ^ i13) * (-25941)) ^ (-182195064);
                        i4 = 1254897673;
                    } else {
                        iM6982 = (C2105.m6981("ۤ۫") + i13) * (-21);
                        i14 = ((iM6982 ^ i12) * 2573) ^ 1462642854;
                        i4 = -1842037205;
                    }
                    i15 = iM6982 ^ i4;
                    i6 = i;
                    break;
                case -1741646910:
                case 936144899:
                    C2105.m6982();
                    break;
                case -1725280848:
                case -187458685:
                    s = s2;
                    i2 = i6;
                    c = 29;
                    if (C0422.f1886 <= 0) {
                        iM6981 = (i12 - C0630.m2566("᩸ۘ")) * 33;
                        i14 = 1799997552 ^ ((iM6981 ^ i13) * (-3089));
                        i3 = 893757884;
                    } else {
                        iM6981 = C2105.m6981("ۖܽ") ^ i12;
                        i14 = 2076299606 ^ ((iM6981 ^ i13) * (-32055));
                        i3 = 224377253;
                    }
                    i15 = iM6981 ^ i3;
                    i6 = i2;
                    s2 = s;
                    break;
                case -1600293283:
                case 598654238:
                    RunnableC0588.m2430(animator, C4616.m13542(sArr2, i9, i10, i8));
                    break;
                case -1475691952:
                case -898999477:
                    i5 = 29515;
                    int iM2567 = C0630.m2566("᩷ۡ") ^ i13;
                    int i16 = i5;
                    i15 = iM2567 ^ (-1381265158);
                    i14 = ((iM2567 ^ i12) * (-15819)) ^ (-638205132);
                    i8 = i16;
                    break;
                case -1374532932:
                case 2123587457:
                    if (C1420.f5096 > 0) {
                        i = i6;
                        iM6982 = (C0630.m2566("֡֡") ^ i13) * 97;
                        i14 = ((iM6982 ^ i12) * (-8053)) ^ (-912318156);
                        i4 = 2050711701;
                        i15 = iM6982 ^ i4;
                        i6 = i;
                    } else {
                        int iM6983 = C2105.m6981("ܰۧ") ^ i12;
                        s = s2;
                        i15 = iM6983 ^ (-2051873216);
                        i14 = ((iM6983 ^ i13) * (-10201)) ^ (-1347325224);
                        s2 = s;
                    }
                    break;
                case -1087144131:
                case 1982153889:
                    i6 = s2 * s3;
                    s4 = 17626;
                    if (C0630.f2410 <= 0) {
                        int iM6984 = C2105.m6981("ܰۧ") ^ i12;
                        s = s2;
                        i15 = iM6984 ^ (-2051873216);
                        i14 = ((iM6984 ^ i13) * (-10201)) ^ (-1347325224);
                    } else {
                        s = s2;
                        int iM2568 = C0630.m2566("ܺۛ") ^ i13;
                        i14 = ((iM2568 ^ i12) * (-29227)) ^ 1280326173;
                        i15 = iM2568 ^ (-1046531344);
                    }
                    s2 = s;
                    break;
                case -797309302:
                case 301247259:
                    if (i6 - (i7 * i7) <= 0) {
                        int iM2569 = C0630.m2566("ۙ֨") ^ i12;
                        i = i6;
                        i15 = iM2569 ^ (-29971572);
                        i14 = ((iM2569 ^ i13) * (-29585)) ^ (-655820373);
                    } else {
                        i = i6;
                        iM6982 = (i13 - C2105.m6981("ܶ᩵")) * (-7);
                        i14 = ((iM6982 ^ i12) * 15821) ^ (-710576871);
                        i4 = 1164332414;
                        i15 = iM6982 ^ i4;
                    }
                    i6 = i;
                    break;
                case -529898313:
                case 1409849122:
                    s = s2;
                    i2 = i6;
                    sArr = f73451;
                    if (C4075.m12263() <= 0) {
                        iM6981 = (C2105.m6981("۟ۙ") + i13) * 31;
                        i14 = (-574157618) ^ ((iM6981 ^ i12) * 477);
                        i3 = -951139695;
                    } else {
                        iM6981 = (i13 - C0630.m2566("ܰۙ")) * (-19);
                        i14 = (-1453644667) ^ ((iM6981 ^ i12) * 25445);
                        i3 = 984173013;
                    }
                    i15 = iM6981 ^ i3;
                    i6 = i2;
                    s2 = s;
                    break;
                case -70624881:
                case 158635686:
                    i5 = 44486;
                    int iM25610 = C0630.m2566("᩷ۡ") ^ i13;
                    int i17 = i5;
                    i15 = iM25610 ^ (-1381265158);
                    i14 = ((iM25610 ^ i12) * (-15819)) ^ (-638205132);
                    i8 = i17;
                    break;
                case 74194644:
                case 699765409:
                    if (RunnableC1937.m6387() != 0) {
                        i = i6;
                        i10 = 9;
                        iM6982 = C0630.m2566("᩵᩵") ^ i12;
                        i14 = ((iM6982 ^ i13) * (-25941)) ^ (-182195064);
                        i4 = 1254897673;
                        i15 = iM6982 ^ i4;
                        i6 = i;
                    } else {
                        int iM25611 = C0630.m2566("ܺᩴ") ^ i13;
                        i15 = iM25611 ^ 1438602928;
                        i14 = ((iM25611 ^ i12) * 24643) ^ 1687528908;
                        i10 = 9;
                    }
                    break;
                case 421590698:
                case 1485467943:
                    sArr2 = f73451;
                    if (C0964.m3413()) {
                        int iM6985 = C2105.m6981("ܰۡ") ^ i12;
                        i15 = iM6985 ^ 501833272;
                        i14 = ((iM6985 ^ i13) * 26581) ^ (-1793165357);
                        i9 = 30;
                    } else {
                        i = i6;
                        i9 = 30;
                        iM6982 = C0630.m2566("᩵᩵") ^ i12;
                        i14 = ((iM6982 ^ i13) * (-25941)) ^ (-182195064);
                        i4 = 1254897673;
                        i15 = iM6982 ^ i4;
                        i6 = i;
                    }
                    break;
                case 514790328:
                case 1852634408:
                    s = s2;
                    i2 = i6;
                    if (C0964.f3626 != 0) {
                        iM6981 = (C2105.m6981("۟ۙ") + i13) * 31;
                        i14 = (-574157618) ^ ((iM6981 ^ i12) * 477);
                        i3 = -951139695;
                    } else {
                        iM6981 = (C2105.m6981("ܽ᩶") ^ i12) * (-99);
                        i14 = 47491331 ^ ((iM6981 ^ i13) * (-15913));
                        i3 = 544238970;
                    }
                    i15 = iM6981 ^ i3;
                    i6 = i2;
                    s2 = s;
                    break;
                case 581155245:
                case 884805254:
                    i = i6;
                    i7 = s2 + s4;
                    if (C0630.f2410 <= 0) {
                        iM6982 = (C0630.m2566("֡֡") ^ i13) * 97;
                        i14 = ((iM6982 ^ i12) * (-8053)) ^ (-912318156);
                        i4 = 2050711701;
                    } else {
                        iM6982 = C2105.m6981("ۛۡ") ^ i12;
                        i14 = ((iM6982 ^ i13) * 10795) ^ (-211100702);
                        i4 = 631789909;
                    }
                    i15 = iM6982 ^ i4;
                    i6 = i;
                    break;
                case 907175403:
                case 1407117599:
                    s = s2;
                    i2 = i6;
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (i12 - C0630.m2566("᩸ۘ")) * 33;
                        i14 = 1799997552 ^ ((iM6981 ^ i13) * (-3089));
                        i3 = 893757884;
                    } else {
                        iM6981 = (C0630.m2566("ۛ᩸") + i12) * (-97);
                        i14 = 193646020 ^ ((iM6981 ^ i13) * 23055);
                        i3 = 1188375763;
                    }
                    i15 = iM6981 ^ i3;
                    i6 = i2;
                    s2 = s;
                    break;
                case 1589467259:
                case 1746785598:
                    C5695.m16023();
                    C0798.m2998();
                    s = s2;
                    i2 = i6;
                    iM6981 = (i12 - C0630.m2566("᩸ۘ")) * 33;
                    i14 = 1799997552 ^ ((iM6981 ^ i13) * (-3089));
                    i3 = 893757884;
                    i15 = iM6981 ^ i3;
                    i6 = i2;
                    s2 = s;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView;
        short[] sArr;
        List list;
        TextView textView2;
        List list2;
        C19554 c19554;
        String str;
        int iM6981;
        int i;
        int i2;
        AbstractActivityC3346 abstractActivityC3346;
        AbstractActivityC3346 abstractActivityC3347;
        int i3;
        int iM6982;
        int i4;
        String str2;
        int iM6983;
        int i5;
        int i6;
        int i7;
        TextView textView3;
        List list3;
        AbstractActivityC3346 abstractActivityC3348;
        C19554 c19555;
        C11182 c11182;
        short[] sArr2;
        C11182 c11183;
        AbstractActivityC3346 abstractActivityC3349;
        TextView textView4;
        C19554 c19554M44967;
        String str3;
        short[] sArr3;
        String str4;
        TextView textView5;
        List list4;
        AbstractActivityC3346 abstractActivityC33410;
        C19554 c19556;
        C11182 c11184;
        String str5;
        List listM9236;
        int i8;
        int i9;
        CharSequence charSequence;
        int iM6984;
        int i10;
        int i11;
        int i12 = 296169861;
        int i13 = C3245.f10203;
        int i14 = C2958.f9394;
        int iM2566 = (i13 - C0630.m2566("ۛᩴ")) * (-85);
        int i15 = ((iM2566 ^ i14) * (-14757)) ^ 1225904591;
        int i16 = iM2566 ^ (-2125387807);
        String str6 = null;
        String strM5726 = null;
        TextView textView6 = null;
        final C11182 c11185 = null;
        final AbstractActivityC3346 abstractActivityC33411 = null;
        short[] sArr4 = null;
        View view = null;
        int i17 = 0;
        int i18 = 0;
        int iM2567 = 0;
        char c = 0;
        TextView textView7 = null;
        C19554 c19557 = null;
        List list5 = null;
        String strM10568 = null;
        List listM9237 = null;
        List list6 = null;
        CharSequence charSequence2 = null;
        int i19 = 0;
        int i20 = 0;
        View viewM3507 = null;
        String strM4902 = null;
        short[] sArr5 = null;
        int i21 = 0;
        String strM6385 = null;
        final List listM9238 = null;
        int i22 = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i14) * 6469) >> 31));
            switch (i12) {
                case -2117592743:
                case 1207555229:
                    sArr4 = sArr4;
                    list5 = list5;
                    textView6 = textView6;
                    list6 = list6;
                    c19557 = c19557;
                    c11185 = c11185;
                    String str7 = str6;
                    abstractActivityC33411 = abstractActivityC33411;
                    textView7 = textView7;
                    strM4902 = strM4902;
                    str2 = str7;
                    viewM3507 = C1005.m3507(view, C0630.m2566(C0382.m1840(f73451, 49, 3, i19)) ^ 2120557710);
                    if (C3432.m10477() > 0) {
                        int iM2568 = (i13 - C0630.m2566("ۗ᩶")) * (-49);
                        i15 = ((iM2568 ^ i14) * (-22305)) ^ 571847686;
                        i7 = iM2568 ^ (-1673294462);
                        c11185 = c11185;
                        c19557 = c19557;
                        list6 = list6;
                        textView6 = textView6;
                        list5 = list5;
                        short[] sArr6 = sArr4;
                        i16 = i7;
                        sArr4 = sArr6;
                        String str8 = strM4902;
                        textView7 = textView7;
                        abstractActivityC33411 = abstractActivityC33411;
                        str6 = str2;
                        strM4902 = str8;
                    } else {
                        textView = textView6;
                        int iM6985 = C2105.m6981("۫᩺") ^ i14;
                        int i23 = ((iM6985 ^ i13) * (-15245)) ^ 1429230221;
                        list5 = list5;
                        short[] sArr7 = sArr4;
                        i16 = iM6985 ^ (-69669032);
                        sArr4 = sArr7;
                        List list7 = list6;
                        textView6 = textView;
                        i15 = i23;
                        c11185 = c11185;
                        c19557 = c19557;
                        list6 = list7;
                        String str9 = strM4902;
                        textView7 = textView7;
                        abstractActivityC33411 = abstractActivityC33411;
                        str6 = str2;
                        strM4902 = str9;
                    }
                    break;
                case -2078534725:
                case -1304103745:
                    TextView textView8 = textView6;
                    C1047.m3601(textView8, charSequence2);
                    C11182 c11186 = this.f73454;
                    AbstractActivityC3346 abstractActivityC33412 = this.f73452;
                    sArr = sArr4;
                    List list8 = list5;
                    C4159.m12564(textView8, new ViewOnClickListenerC3674(c11186, abstractActivityC33412, list8));
                    textView2 = textView8;
                    List list9 = list6;
                    int iM6986 = C2105.m6981(C2958.m9031(f73451, 362, 3, i19)) ^ 2104025089;
                    if (C0050.f910 < 0) {
                        int iM6987 = C2105.m6981("۠ۖ") ^ i14;
                        int i24 = ((iM6987 ^ i13) * (-23881)) ^ 1487142194;
                        list5 = list8;
                        sArr4 = sArr;
                        i16 = iM6987 ^ (-1008801296);
                        list6 = list9;
                        textView6 = textView2;
                        abstractActivityC3347 = abstractActivityC33412;
                        i22 = iM6986;
                        i15 = i24;
                        c11185 = c11186;
                        abstractActivityC33411 = abstractActivityC3347;
                    } else {
                        list = list8;
                        c11185 = c11186;
                        abstractActivityC33411 = abstractActivityC33412;
                        list6 = list9;
                        i22 = iM6986;
                        int iM6988 = (C2105.m6981("᩸ܰ") ^ i13) * 75;
                        i15 = ((iM6988 ^ i14) * 3451) ^ (-1222134727);
                        i3 = iM6988 ^ 401536887;
                        textView6 = textView2;
                        list5 = list;
                        short[] sArr8 = sArr;
                        i16 = i3;
                        sArr4 = sArr8;
                    }
                    break;
                case -1977646979:
                case -1897581903:
                    charSequence = charSequence2;
                    TextView textView9 = (TextView) C11340.m28028(view, C2105.m6981(C2272.m7507(f73451, 374, 3, i19)) ^ 2120162114);
                    C19890.m45741(textView9);
                    C4159.m12564(textView9, new ViewOnClickListenerC23101(abstractActivityC33411, i17));
                    sArr4 = f73451;
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        iM6984 = (C0630.m2566("ۚ۬") ^ i13) * (-121);
                        i10 = ((iM6984 ^ i14) * 27763) ^ 499145955;
                        i11 = 424677561;
                        int i25 = iM6984 ^ i11;
                        charSequence2 = charSequence;
                        i16 = i25;
                        i15 = i10;
                    } else {
                        charSequence2 = charSequence;
                        textView3 = textView6;
                        list3 = list6;
                        abstractActivityC3348 = abstractActivityC33411;
                        c19555 = c19557;
                        c11182 = c11185;
                        int iM2569 = C0630.m2566("ܳ᩹") ^ i14;
                        int i26 = ((iM2569 ^ i13) * 1869) ^ (-1618065577);
                        i16 = iM2569 ^ (-853552072);
                        c11185 = c11182;
                        c19557 = c19555;
                        list6 = list3;
                        textView6 = textView3;
                        list5 = list5;
                        String str10 = strM4902;
                        textView7 = textView7;
                        i15 = i26;
                        abstractActivityC33411 = abstractActivityC3348;
                        str6 = str6;
                        strM4902 = str10;
                    }
                    break;
                case -1814696811:
                case 492202846:
                    if (C1047.m3599() >= 0) {
                        sArr4 = sArr4;
                        list5 = list5;
                        textView = textView6;
                        list6 = list6;
                        c19557 = c19557;
                        c11185 = c11185;
                        String str11 = str6;
                        abstractActivityC33411 = abstractActivityC33411;
                        textView7 = textView7;
                        strM4902 = strM4902;
                        str2 = str11;
                        int iM6989 = C2105.m6981("۫᩺") ^ i14;
                        int i27 = ((iM6989 ^ i13) * (-15245)) ^ 1429230221;
                        list5 = list5;
                        short[] sArr9 = sArr4;
                        i16 = iM6989 ^ (-69669032);
                        sArr4 = sArr9;
                        List list10 = list6;
                        textView6 = textView;
                        i15 = i27;
                        c11185 = c11185;
                        c19557 = c19557;
                        list6 = list10;
                        String str12 = strM4902;
                        textView7 = textView7;
                        abstractActivityC33411 = abstractActivityC33411;
                        str6 = str2;
                        strM4902 = str12;
                    } else {
                        sArr = sArr4;
                        list = list5;
                        textView2 = textView6;
                        int iM69810 = (C2105.m6981("᩸ܰ") ^ i13) * 75;
                        i15 = ((iM69810 ^ i14) * 3451) ^ (-1222134727);
                        i3 = iM69810 ^ 401536887;
                        textView6 = textView2;
                        list5 = list;
                        short[] sArr10 = sArr;
                        i16 = i3;
                        sArr4 = sArr10;
                    }
                    break;
                case -1648240286:
                case -41237989:
                    sArr2 = sArr4;
                    str3 = str6;
                    list5 = list5;
                    textView3 = textView6;
                    list3 = list6;
                    abstractActivityC3349 = abstractActivityC33411;
                    C19554 c19558 = c19557;
                    c11183 = c11185;
                    strM4902 = C1420.m4902(f73451, 99, 81, i19);
                    c19554M44967 = c19558;
                    textView4 = textView7;
                    int iM25610 = (C0630.m2566("ۖۡ") + i13) * (-47);
                    textView7 = textView4;
                    abstractActivityC33411 = abstractActivityC3349;
                    str6 = str3;
                    i15 = ((iM25610 ^ i14) * 21447) ^ (-2018724074);
                    c11185 = c11183;
                    c19557 = c19554M44967;
                    sArr4 = sArr2;
                    i16 = iM25610 ^ (-268143383);
                    list6 = list3;
                    textView6 = textView3;
                    list5 = list5;
                    break;
                case -1379866321:
                case 432705727:
                    TextView textView10 = (TextView) C11340.m28028(view, C0630.m2566(C3432.m10488(sArr4, 377, 3, i19)) ^ 2097621650);
                    C19890.m45741(textView10);
                    C4159.m12564(textView10, new View.OnClickListener() { // from class: l.᩻ۘۡ

                        /* JADX INFO: renamed from: ۧܰۧ, reason: not valid java name and contains not printable characters */
                        private static final short[] f75266 = {6342, 30696, 30708, 30708, 30704, 30707, 30650, 30639, 30639, 30707, 30696, 30703, 30704, 30638, 30701, 30708, 30638, 30691, 30691, 30639};

                        /* JADX WARN: Code duplicated, block: B:55:0x019f A[PHI: r1 r2
                          0x019f: PHI (r1v6 short[]) = (r1v5 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:54:0x019d, B:50:0x017f, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
                          0x019f: PHI (r2v4 char) = (r2v2 char), (r2v3 char), (r2v2 char) binds: [B:54:0x019d, B:50:0x017f, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:63:0x01ee A[PHI: r5
                          0x01ee: PHI (r5v5 int) = (r5v2 int), (r5v4 int), (r5v2 int) binds: [B:62:0x01ec, B:42:0x013e, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:67:0x0223 A[PHI: r0 r3 r4 r8
                          0x0223: PHI (r0v3 l.ۗܺ᩷) = (r0v2 l.ۗܺ᩷), (r0v2 l.ۗܺ᩷), (r0v2 l.ۗܺ᩷), (r0v4 l.ۗܺ᩷) binds: [B:66:0x0221, B:58:0x01cf, B:46:0x0161, B:27:0x0093] A[DONT_GENERATE, DONT_INLINE]
                          0x0223: PHI (r3v4 short) = (r3v2 short), (r3v2 short), (r3v3 short), (r3v2 short) binds: [B:66:0x0221, B:58:0x01cf, B:46:0x0161, B:27:0x0093] A[DONT_GENERATE, DONT_INLINE]
                          0x0223: PHI (r4v4 short) = (r4v2 short), (r4v2 short), (r4v3 short), (r4v2 short) binds: [B:66:0x0221, B:58:0x01cf, B:46:0x0161, B:27:0x0093] A[DONT_GENERATE, DONT_INLINE]
                          0x0223: PHI (r8v3 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v4 short[]) binds: [B:66:0x0221, B:58:0x01cf, B:46:0x0161, B:27:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int iM25611;
                            int i28;
                            int i29;
                            AbstractActivityC3346 abstractActivityC33413 = null;
                            short[] sArr11 = null;
                            char c2 = 0;
                            short s = 0;
                            short s2 = 0;
                            int i30 = 0;
                            short s3 = 0;
                            int i31 = 0;
                            short[] sArr12 = null;
                            int i32 = 0;
                            int i33 = 1249129431;
                            int i34 = C1773.f6144;
                            int i35 = C3019.f9544;
                            int iM25612 = (C0630.m2566("ۡ۠") + i34) * 23;
                            int i36 = ((iM25612 ^ i35) * 32761) ^ 1382321677;
                            int i37 = -161484546;
                            while (true) {
                                int i38 = iM25612 ^ i37;
                                while (true) {
                                    i33 = ((((i33 ^ i35) * 22967) >> 31) & i36) ^ i38;
                                    switch (i33) {
                                        case -1922307023:
                                        case -1618593203:
                                            C3663.m11168();
                                            break;
                                        case -1610553631:
                                        case 1486902392:
                                            i31 = 30592;
                                            iM25611 = C2105.m6981("֫֨") ^ i34;
                                            i28 = ((iM25611 ^ i35) * (-21443)) ^ (-1903423372);
                                            i29 = -703240994;
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case -1526676778:
                                        case -757883777:
                                            if (C1294.f4556 >= 0) {
                                                iM25612 = (C0630.m2566("ۖ᩺") + i34) * 23;
                                                i36 = ((iM25612 ^ i35) * 11761) ^ 1632655626;
                                                i37 = 1956152501;
                                            }
                                            iM25611 = (i34 - C2105.m6981("ܰܶ")) * (-69);
                                            i28 = ((iM25611 ^ i35) * (-19461)) ^ (-1291259492);
                                            i29 = -122379747;
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case -1395145422:
                                        case 500723393:
                                            if (C0422.f1886 <= 0) {
                                                iM25611 = (i34 - C0630.m2566("᩸ۜ")) * q.h;
                                                i28 = ((iM25611 ^ i35) * 5469) ^ (-2109533115);
                                                i29 = -1767798729;
                                            } else {
                                                iM25611 = (C2105.m6981("֨ᩳ") ^ i35) * q.h;
                                                i28 = ((iM25611 ^ i34) * 24475) ^ (-499224965);
                                                i29 = -433704028;
                                            }
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case -1130571157:
                                        case -693631531:
                                            s = sArr11[c2];
                                            s2 = 4679;
                                            if (C1128.f4106 <= 0) {
                                                iM25611 = C2105.m6981("ܿۜ") ^ i35;
                                                i28 = ((iM25611 ^ i34) * 13871) ^ (-115887196);
                                                i29 = -1406332;
                                            } else {
                                                iM25611 = C0630.m2566("ۡۚ") ^ i35;
                                                i28 = ((iM25611 ^ i34) * (-25277)) ^ 993915446;
                                                i29 = -1640151509;
                                            }
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case -985111779:
                                        case 1629627499:
                                            if (C4616.m13552() != 0) {
                                                iM25611 = C2105.m6981("ܿۜ") ^ i35;
                                                i28 = ((iM25611 ^ i34) * 13871) ^ (-115887196);
                                                i29 = -1406332;
                                            } else {
                                                iM25611 = C0630.m2566("᩶ۘ") ^ i34;
                                                i28 = ((iM25611 ^ i35) * (-26141)) ^ (-2041899233);
                                                i29 = -2107007002;
                                            }
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case -623432887:
                                        case -173556671:
                                            sArr11 = f75266;
                                            if (C3537.f11231 >= 0) {
                                                iM25611 = C2105.m6981("ۡܶ") ^ i35;
                                                i28 = ((iM25611 ^ i34) * (-16583)) ^ 807740466;
                                                i29 = 1218549587;
                                            } else {
                                                iM25611 = (C2105.m6981("۫֨") + i35) * 77;
                                                i28 = ((iM25611 ^ i34) * 3719) ^ (-1459486972);
                                                i29 = 332779739;
                                            }
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case -509972629:
                                        case 1255946643:
                                            if (C1504.f5354) {
                                                iM25611 = C2105.m6981("ܿۜ") ^ i35;
                                                i28 = ((iM25611 ^ i34) * 13871) ^ (-115887196);
                                                i29 = -1406332;
                                            } else {
                                                iM25611 = (C2105.m6981("ᩴܰ") + i34) * (-61);
                                                i28 = ((iM25611 ^ i35) * (-4991)) ^ 1551035118;
                                                i29 = 114139231;
                                            }
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case -384548825:
                                        case 1957042809:
                                            if (i30 - (s * s3) >= 0) {
                                                iM25611 = C0630.m2566("ۨ᩷") ^ i34;
                                                i28 = ((iM25611 ^ i35) * (-24253)) ^ 1537156674;
                                                i29 = -1900185704;
                                            } else {
                                                iM25611 = (C0630.m2566("ܰܺ") ^ i35) * 73;
                                                i28 = ((iM25611 ^ i34) * 8251) ^ 295565461;
                                                i29 = -2090749567;
                                            }
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case -123162507:
                                        case 1493484206:
                                            abstractActivityC33413 = abstractActivityC33411;
                                            sArr12 = f75266;
                                            if (C2126.f7087) {
                                                iM25611 = C2105.m6981("ܿۜ") ^ i35;
                                                i28 = ((iM25611 ^ i34) * 13871) ^ (-115887196);
                                                i29 = -1406332;
                                            } else {
                                                iM25611 = C0630.m2566("ۤ۟") ^ i35;
                                                i28 = ((iM25611 ^ i34) * (-12431)) ^ (-1912384717);
                                                i29 = -1003422861;
                                            }
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case 99942959:
                                        case 1199684771:
                                            AbstractC2021.m6574();
                                            iM25611 = (i34 - C2105.m6981("ܰܶ")) * (-69);
                                            i28 = ((iM25611 ^ i35) * (-19461)) ^ (-1291259492);
                                            i29 = -122379747;
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case 369877731:
                                        case 1409871493:
                                            s3 = 18716;
                                            if (RunnableC3474.f10992 <= 0) {
                                                iM25611 = (i34 - C2105.m6981("ܰܶ")) * (-69);
                                                i28 = ((iM25611 ^ i35) * (-19461)) ^ (-1291259492);
                                                i29 = -122379747;
                                            } else {
                                                iM25611 = (C0630.m2566("᩻ۤ") + i34) * 65;
                                                i28 = ((iM25611 ^ i35) * (-26995)) ^ 1395168925;
                                                i29 = 939281752;
                                            }
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case 519422950:
                                        case 697413368:
                                            i32 = 1;
                                            if (C0714.f2697 < 0) {
                                                iM25612 = C2105.m6981("ۛܳ") ^ i35;
                                                i36 = ((iM25612 ^ i34) * (-537)) ^ (-40261390);
                                                i37 = -551958125;
                                            } else {
                                                iM25612 = (C0630.m2566("ۖ᩺") + i34) * 23;
                                                i36 = ((iM25612 ^ i35) * 11761) ^ 1632655626;
                                                i37 = 1956152501;
                                            }
                                            break;
                                        case 725288714:
                                        case 1080647627:
                                            i31 = 58465;
                                            iM25611 = C2105.m6981("֫֨") ^ i34;
                                            i28 = ((iM25611 ^ i35) * (-21443)) ^ (-1903423372);
                                            i29 = -703240994;
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case 850959323:
                                        case 1995851099:
                                            C21923.m49335(abstractActivityC33413, C21923.m49334(sArr12, i32, 19, i31));
                                            break;
                                        case 919320746:
                                        case 1178951037:
                                            if (!C0630.m2564()) {
                                                iM25611 = C2105.m6981("ۡܶ") ^ i35;
                                                i28 = ((iM25611 ^ i34) * (-16583)) ^ 807740466;
                                                i29 = 1218549587;
                                                i38 = iM25611 ^ i29;
                                                i36 = i28;
                                            }
                                            iM25611 = (i34 - C2105.m6981("ܰܶ")) * (-69);
                                            i28 = ((iM25611 ^ i35) * (-19461)) ^ (-1291259492);
                                            i29 = -122379747;
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case 1620592361:
                                        case 1939608514:
                                            int i39 = s + s2;
                                            i30 = i39 * i39;
                                            if (C3683.f11629 >= 0) {
                                                iM25611 = (i34 - C0630.m2566("᩸ۜ")) * q.h;
                                                i28 = ((iM25611 ^ i35) * 5469) ^ (-2109533115);
                                                i29 = -1767798729;
                                            } else {
                                                iM25611 = (C0630.m2566("᩻֨") + i35) * 87;
                                                i28 = ((iM25611 ^ i34) * (-20261)) ^ (-1148761607);
                                                i29 = -722131816;
                                            }
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        case 1779261746:
                                        case 1797188719:
                                            c2 = 0;
                                            if (C0798.f2919) {
                                                iM25611 = C2105.m6981("ۡܶ") ^ i35;
                                                i28 = ((iM25611 ^ i34) * (-16583)) ^ 807740466;
                                                i29 = 1218549587;
                                            } else {
                                                iM25611 = C2105.m6981("۬ۢ") ^ i34;
                                                i28 = ((iM25611 ^ i35) * (-6249)) ^ 1046432430;
                                                i29 = -1843304725;
                                            }
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                        default:
                                            if (C7106.f21815 == 0) {
                                                iM25611 = (i34 - C0630.m2566("᩸ۜ")) * q.h;
                                                i28 = ((iM25611 ^ i35) * 5469) ^ (-2109533115);
                                                i29 = -1767798729;
                                                i38 = iM25611 ^ i29;
                                                i36 = i28;
                                            }
                                            iM25611 = (i34 - C2105.m6981("ܰܶ")) * (-69);
                                            i28 = ((iM25611 ^ i35) * (-19461)) ^ (-1291259492);
                                            i29 = -122379747;
                                            i38 = iM25611 ^ i29;
                                            i36 = i28;
                                            break;
                                    }
                                    return;
                                }
                            }
                        }
                    });
                    C4263.m12823(view, view);
                    list5 = list5;
                    textView6 = textView6;
                    sArr4 = sArr4;
                    list6 = list6;
                    c19557 = c19557;
                    c11185 = c11185;
                    String str13 = str6;
                    abstractActivityC33411 = abstractActivityC33411;
                    textView7 = textView7;
                    strM4902 = strM4902;
                    str2 = str13;
                    iM6983 = (C0630.m2566("ۡۗ") ^ i14) * (-31);
                    i5 = ((iM6983 ^ i13) * (-30419)) ^ (-1556003875);
                    i6 = 1794488052;
                    i7 = iM6983 ^ i6;
                    i15 = i5;
                    c11185 = c11185;
                    c19557 = c19557;
                    list6 = list6;
                    textView6 = textView6;
                    list5 = list5;
                    short[] sArr11 = sArr4;
                    i16 = i7;
                    sArr4 = sArr11;
                    String str14 = strM4902;
                    textView7 = textView7;
                    abstractActivityC33411 = abstractActivityC33411;
                    str6 = str2;
                    strM4902 = str14;
                    break;
                case -1339098844:
                case 1786191649:
                    sArr = sArr4;
                    list = list5;
                    textView2 = textView6;
                    list2 = list6;
                    char[] cArr = new char[i17];
                    cArr[i21] = c;
                    listM9238 = C3016.m9236(strM5726, cArr);
                    c19554 = c19557;
                    str = str6;
                    String strM44968 = c19554.m44968(C3683.m11225(f73451, 268, 10, i19), str);
                    if (strM44968 == null) {
                        iM6981 = C2105.m6981("֫ۤ") ^ i14;
                        c11185 = c11185;
                        i = ((iM6981 ^ i13) * (-25959)) ^ 1797049351;
                        i2 = -1921077303;
                    } else {
                        strM6385 = strM44968;
                        iM6981 = C0630.m2566("۬᩻") ^ i14;
                        i = ((iM6981 ^ i13) * (-2655)) ^ (-2017452261);
                        i2 = 89065174;
                    }
                    i3 = iM6981 ^ i2;
                    str6 = str;
                    i15 = i;
                    c11185 = c11185;
                    c19557 = c19554;
                    list6 = list2;
                    textView6 = textView2;
                    list5 = list;
                    short[] sArr12 = sArr;
                    i16 = i3;
                    sArr4 = sArr12;
                    break;
                case -1268497616:
                case 1536486730:
                    sArr3 = sArr4;
                    str4 = str6;
                    textView5 = textView6;
                    list4 = list6;
                    abstractActivityC33410 = abstractActivityC33411;
                    c19556 = c19557;
                    c11184 = c11185;
                    char[] cArr2 = new char[1];
                    c = '|';
                    cArr2[i21] = '|';
                    str5 = strM4902;
                    listM9236 = C3016.m9236(str5, cArr2);
                    String strM44969 = c19556.m44968(C1128.m3841(f73451, 92, 7, i19), str4);
                    if (strM44969 == null) {
                        int iM25611 = C0630.m2566("᩻֨") ^ i13;
                        i8 = ((iM25611 ^ i14) * (-1241)) ^ (-1706454619);
                        i9 = iM25611 ^ (-851387483);
                        strM4902 = str5;
                        c11185 = c11184;
                        i17 = 1;
                    } else {
                        strM10568 = strM44969;
                        i17 = 1;
                        int iM25612 = C0630.m2566("ۤ᩶") ^ i14;
                        i8 = ((iM25612 ^ i13) * 3799) ^ 619167295;
                        i9 = iM25612 ^ (-389351517);
                        strM4902 = str5;
                        c11185 = c11184;
                    }
                    c19557 = c19556;
                    list6 = list4;
                    textView6 = textView5;
                    list5 = listM9236;
                    short[] sArr13 = sArr3;
                    i16 = i9;
                    sArr4 = sArr13;
                    abstractActivityC3347 = abstractActivityC33410;
                    str6 = str4;
                    i15 = i8;
                    abstractActivityC33411 = abstractActivityC3347;
                    break;
                case -1226782722:
                case -827339529:
                    sArr = sArr4;
                    list = list5;
                    textView2 = textView6;
                    list2 = list6;
                    strM5726 = C1711.m5726(f73451, 278, 81, i19);
                    c19554 = c19557;
                    str = str6;
                    c11185 = c11185;
                    abstractActivityC3346 = abstractActivityC33411;
                    iM6982 = C2105.m6981("ܽۤ") ^ i14;
                    i = ((iM6982 ^ i13) * (-24103)) ^ 2078283517;
                    i4 = -1621810447;
                    i3 = iM6982 ^ i4;
                    abstractActivityC33411 = abstractActivityC3346;
                    str6 = str;
                    i15 = i;
                    c11185 = c11185;
                    c19557 = c19554;
                    list6 = list2;
                    textView6 = textView2;
                    list5 = list;
                    short[] sArr14 = sArr;
                    i16 = i3;
                    sArr4 = sArr14;
                    break;
                case -1030245465:
                case 1684757201:
                    charSequence = charSequence2;
                    TextView textView11 = (TextView) C11340.m28028(view, iM2567 ^ 2120919577);
                    C19890.m45741(textView11);
                    RunnableC1937.m6377(textView11, (CharSequence) C21923.m49339(listM9238, i21));
                    C4159.m12564(textView11, new View.OnClickListener(c11185, abstractActivityC33411, listM9238) { // from class: l.ᩳۘۡ

                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ AbstractActivityC3346 f54430;

                        /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ List f54431;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            AbstractActivityC3346 abstractActivityC33413 = null;
                            int i28 = -961446395;
                            int i29 = C22628.f73083;
                            int i30 = C2520.f8000;
                            int iM69811 = (i30 - C2105.m6981("ۨ᩷")) * (-115);
                            int i31 = ((iM69811 ^ i29) * 29369) ^ (-2075762732);
                            int i32 = 2063945009;
                            while (true) {
                                i28 = ((((i28 ^ i29) * (-20739)) >> 31) & i31) ^ (iM69811 ^ i32);
                                switch (i28) {
                                    case -2134400316:
                                    case -823114350:
                                        C0382.m1848();
                                        break;
                                    case -1816808735:
                                    case 1418629521:
                                        if (C3911.m11924() > 0) {
                                            iM69811 = (C2105.m6981("ۡ֡") + i30) * (-109);
                                            i31 = ((iM69811 ^ i29) * 31849) ^ 1941518239;
                                            i32 = 2115761508;
                                        } else {
                                            iM69811 = C2105.m6981("ۜ֫") ^ i29;
                                            i31 = ((iM69811 ^ i30) * 25267) ^ 260931134;
                                            i32 = -1255899544;
                                        }
                                        break;
                                    case -1574509618:
                                    case 283001384:
                                        if (RunnableC0588.m2441() >= 0) {
                                            iM69811 = C2105.m6981("ۜ֫") ^ i29;
                                            i31 = ((iM69811 ^ i30) * 25267) ^ 260931134;
                                            i32 = -1255899544;
                                        } else {
                                            iM69811 = C2105.m6981("ۚᩴ") ^ i30;
                                            i31 = ((iM69811 ^ i29) * (-25191)) ^ (-1847874788);
                                            i32 = -404638520;
                                        }
                                        break;
                                    case -1530483534:
                                    case -556565625:
                                        if (C0714.m2805()) {
                                            iM69811 = (i29 - C2105.m6981("᩵ۢ")) * (-111);
                                            i31 = ((iM69811 ^ i30) * (-3467)) ^ 1578155820;
                                            i32 = 30440952;
                                        } else {
                                            iM69811 = C2105.m6981("᩹ۛ") ^ i30;
                                            i31 = ((iM69811 ^ i29) * (-575)) ^ 1680219781;
                                            i32 = -550935993;
                                        }
                                        break;
                                    case -1528559042:
                                    case 430792269:
                                        if (ViewOnClickListenerC1958.m6429() >= 0) {
                                            iM69811 = C2105.m6981("ۜ֫") ^ i29;
                                            i31 = ((iM69811 ^ i30) * 25267) ^ 260931134;
                                            i32 = -1255899544;
                                        } else {
                                            iM69811 = C2105.m6981("ۡ᩸") ^ i29;
                                            i31 = ((iM69811 ^ i30) * (-21)) ^ (-964356341);
                                            i32 = -1926610276;
                                        }
                                        break;
                                    case -1364482781:
                                    case 2038819848:
                                        if (RunnableC1108.f4040) {
                                            iM69811 = C0630.m2566("֡ۡ") ^ i30;
                                            i31 = ((iM69811 ^ i29) * (-507)) ^ (-1792743104);
                                            i32 = 792753930;
                                        } else {
                                            iM69811 = C2105.m6981("ۜ֫") ^ i29;
                                            i31 = ((iM69811 ^ i30) * 25267) ^ 260931134;
                                            i32 = -1255899544;
                                        }
                                        break;
                                    case -1217202910:
                                    case 1689637710:
                                        if (RunnableC1937.f6483 >= 0) {
                                            iM69811 = C2105.m6981("᩹ۛ") ^ i30;
                                            i31 = ((iM69811 ^ i29) * (-575)) ^ 1680219781;
                                            i32 = -550935993;
                                        } else {
                                            iM69811 = (C2105.m6981("ۡ֡") + i30) * (-109);
                                            i31 = ((iM69811 ^ i29) * 31849) ^ 1941518239;
                                            i32 = 2115761508;
                                        }
                                        break;
                                    case -1194742840:
                                    case 442955715:
                                        if (C0382.f1805) {
                                            iM69811 = (C2105.m6981("ۛ֫") + i30) * 21;
                                            i31 = ((iM69811 ^ i29) * (-22951)) ^ (-1907184660);
                                            i32 = -1921905862;
                                        } else {
                                            iM69811 = C0630.m2566("ܽܽ") ^ i29;
                                            i31 = ((iM69811 ^ i30) * (-6221)) ^ (-881239431);
                                            i32 = -2104421279;
                                        }
                                        break;
                                    case -1073160750:
                                    case 716971903:
                                        abstractActivityC33413 = this.f54430;
                                        if (AbstractC2021.f6743 <= 0) {
                                            iM69811 = C2105.m6981("ۜۚ") ^ i29;
                                            i31 = ((iM69811 ^ i30) * 9819) ^ 1899940224;
                                            i32 = 92892716;
                                        } else {
                                            iM69811 = (C2105.m6981("ۤ֫") + i29) * (-17);
                                            i31 = ((iM69811 ^ i30) * 18907) ^ (-823611796);
                                            i32 = 790156349;
                                        }
                                        break;
                                    case -882506881:
                                    case 1816498758:
                                        if (C4263.m12819() >= 0) {
                                            iM69811 = C2105.m6981("᩹ۛ") ^ i30;
                                            i31 = ((iM69811 ^ i29) * (-575)) ^ 1680219781;
                                            i32 = -550935993;
                                        } else {
                                            iM69811 = (C0630.m2566("ᩳۢ") + i30) * (-115);
                                            i31 = ((iM69811 ^ i29) * (-1375)) ^ (-20839799);
                                            i32 = 1765443640;
                                        }
                                        break;
                                    case -373980688:
                                    case -194873416:
                                        C4075.m12263();
                                        C22628.m50615();
                                        iM69811 = C2105.m6981("ۜ֫") ^ i29;
                                        i31 = ((iM69811 ^ i30) * 25267) ^ 260931134;
                                        i32 = -1255899544;
                                        break;
                                    case -336153558:
                                    case 855493585:
                                        if (C4117.f13076 <= 0) {
                                            iM69811 = (C2105.m6981("ۡ֡") + i30) * (-109);
                                            i31 = ((iM69811 ^ i29) * 31849) ^ 1941518239;
                                            i32 = 2115761508;
                                        } else {
                                            iM69811 = C2105.m6981("ۡۙ") ^ i30;
                                            i31 = ((iM69811 ^ i29) * (-3259)) ^ 2048618240;
                                            i32 = -232654780;
                                        }
                                        break;
                                    case -178992355:
                                    case -102473746:
                                        if (C3537.m10746() <= 0) {
                                            iM69811 = C2105.m6981("ۜۚ") ^ i29;
                                            i31 = ((iM69811 ^ i30) * 9819) ^ 1899940224;
                                            i32 = 92892716;
                                        } else {
                                            iM69811 = C0630.m2566("ۛ֡") ^ i29;
                                            i31 = ((iM69811 ^ i30) * (-14161)) ^ (-66944982);
                                            i32 = -349132990;
                                        }
                                        break;
                                    case 689594038:
                                    case 1046699952:
                                        if (C4075.m12263() <= 0) {
                                            iM69811 = C2105.m6981("ۜۚ") ^ i29;
                                            i31 = ((iM69811 ^ i30) * 9819) ^ 1899940224;
                                            i32 = 92892716;
                                        } else {
                                            iM69811 = (i29 - C2105.m6981("֡᩷")) * (-65);
                                            i31 = ((iM69811 ^ i30) * 15727) ^ 1700956274;
                                            i32 = -1166478599;
                                        }
                                        break;
                                    case 812299185:
                                    case 1909780034:
                                        C1773.m5908();
                                        if (!C0964.m3413()) {
                                            iM69811 = C0630.m2566("ܽܽ") ^ i29;
                                            i31 = ((iM69811 ^ i30) * (-6221)) ^ (-881239431);
                                            i32 = -2104421279;
                                        } else {
                                            iM69811 = (C2105.m6981("ۡ֡") + i30) * (-109);
                                            i31 = ((iM69811 ^ i29) * 31849) ^ 1941518239;
                                            i32 = 2115761508;
                                        }
                                        break;
                                    default:
                                        C11182.m27725(abstractActivityC33413, this.f54431);
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i28 = 315450243;
                            int i29 = C4075.f12947;
                            int i30 = C3746.f11829;
                            int iM25613 = (i29 - C0630.m2566("᩷ᩴ")) * 93;
                            int i31 = ((iM25613 ^ i30) * (-2587)) ^ (-1430887132);
                            int i32 = -587160810;
                            while (true) {
                                i28 = ((((i28 ^ i30) * 15141) >> 31) & i31) ^ (iM25613 ^ i32);
                                switch (i28) {
                                    case -2042882699:
                                    case 443401925:
                                        if (C2105.f7037 != 0) {
                                            iM25613 = C2105.m6981("۫ܳ") ^ i29;
                                            i31 = ((iM25613 ^ i30) * 6991) ^ 1377970018;
                                            i32 = 524750100;
                                        } else {
                                            iM25613 = C2105.m6981("֡֫") ^ i29;
                                            i31 = ((iM25613 ^ i30) * 19025) ^ 2054070235;
                                            i32 = 364862560;
                                        }
                                        break;
                                    case -1956468991:
                                    case 35019302:
                                        if (C4263.f13799 <= 0) {
                                            iM25613 = C2105.m6981("֡֫") ^ i29;
                                            i31 = ((iM25613 ^ i30) * 19025) ^ 2054070235;
                                            i32 = 364862560;
                                        } else {
                                            iM25613 = (i29 - C0630.m2566("ۘܿ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i31 = ((iM25613 ^ i30) * (-3147)) ^ 126226656;
                                            i32 = -1590406705;
                                        }
                                        break;
                                    case -1850093158:
                                    case 1278477718:
                                        if (AbstractC2021.f6743 <= 0) {
                                            iM25613 = (i29 - C0630.m2566("᩸ۢ")) * (-125);
                                            i31 = ((iM25613 ^ i30) * 11569) ^ 816442491;
                                            i32 = -652429;
                                        } else {
                                            iM25613 = (C0630.m2566("ۛۜ") ^ i30) * (-43);
                                            i31 = ((iM25613 ^ i29) * (-9359)) ^ 847946011;
                                            i32 = -41637618;
                                        }
                                        break;
                                    case -1835511155:
                                    case 1156616666:
                                        this.f54431 = listM9238;
                                        return;
                                    case -1830140103:
                                    case 1087046461:
                                        if (C4117.f13076 > 0) {
                                            iM25613 = (C2105.m6981("ۧܰ") + i30) * 81;
                                            i31 = ((iM25613 ^ i29) * 27403) ^ 2038968273;
                                            i32 = 1713549956;
                                        } else {
                                            iM25613 = (i30 - C2105.m6981("ܺۧ")) * 79;
                                            i31 = ((iM25613 ^ i29) * 10647) ^ (-1473571200);
                                            i32 = -1498677939;
                                        }
                                        break;
                                    case -1759723164:
                                    case -1686354179:
                                        if (!RunnableC1108.f4040) {
                                            iM25613 = C2105.m6981("֡֫") ^ i29;
                                            i31 = ((iM25613 ^ i30) * 19025) ^ 2054070235;
                                            i32 = 364862560;
                                        } else {
                                            iM25613 = (C2105.m6981("ۧܰ") + i30) * 81;
                                            i31 = ((iM25613 ^ i29) * 27403) ^ 2038968273;
                                            i32 = 1713549956;
                                        }
                                        break;
                                    case -1645938286:
                                    case -1468019698:
                                        C0382.m1848();
                                        C0798.m2998();
                                        iM25613 = (C2105.m6981("ۧܰ") + i30) * 81;
                                        i31 = ((iM25613 ^ i29) * 27403) ^ 2038968273;
                                        i32 = 1713549956;
                                        break;
                                    case -1314503909:
                                    case -369155883:
                                        if (C1128.f4106 <= 0) {
                                            iM25613 = (i29 - C0630.m2566("᩸ۢ")) * (-125);
                                            i31 = ((iM25613 ^ i30) * 11569) ^ 816442491;
                                            i32 = -652429;
                                        } else {
                                            iM25613 = (C2105.m6981("ۙ֡") + i29) * 29;
                                            i31 = ((iM25613 ^ i30) * (-30917)) ^ (-279308948);
                                            i32 = 1349938835;
                                        }
                                        break;
                                    case -1150284766:
                                    case 1440975242:
                                        if (C3537.m10746() <= 0) {
                                            iM25613 = (i29 - C0630.m2566("᩸ۢ")) * (-125);
                                            i31 = ((iM25613 ^ i30) * 11569) ^ 816442491;
                                            i32 = -652429;
                                        } else {
                                            iM25613 = C0630.m2566("ۨۖ") ^ i30;
                                            i31 = ((iM25613 ^ i29) * 19017) ^ 818607490;
                                            i32 = 886642585;
                                        }
                                        break;
                                    case -935746168:
                                    case -334596374:
                                        if (C1294.f4556 >= 0) {
                                            iM25613 = (i29 - C0630.m2566("᩸ۢ")) * (-125);
                                            i31 = ((iM25613 ^ i30) * 11569) ^ 816442491;
                                            i32 = -652429;
                                        } else {
                                            iM25613 = (C2105.m6981("ۖ۬") ^ i30) * 115;
                                            i31 = ((iM25613 ^ i29) * (-23885)) ^ 514297305;
                                            i32 = 369972494;
                                        }
                                        break;
                                    case -791064392:
                                    case 572512851:
                                        if (C1504.m5179()) {
                                            iM25613 = (C2105.m6981("ܽۨ") ^ i30) * (-57);
                                            i31 = ((iM25613 ^ i29) * (-24419)) ^ (-1122994672);
                                            i32 = -175532888;
                                        } else {
                                            iM25613 = C2105.m6981("۫ܳ") ^ i29;
                                            i31 = ((iM25613 ^ i30) * 6991) ^ 1377970018;
                                            i32 = 524750100;
                                        }
                                        break;
                                    case -581644669:
                                    case 1562371725:
                                        if (C0422.f1886 <= 0) {
                                            iM25613 = (C2105.m6981("ۧܰ") + i30) * 81;
                                            i31 = ((iM25613 ^ i29) * 27403) ^ 2038968273;
                                            i32 = 1713549956;
                                        } else {
                                            iM25613 = (C0630.m2566("۟ۨ") ^ i29) * 69;
                                            i31 = ((iM25613 ^ i30) * (-941)) ^ (-1894949416);
                                            i32 = 2077061911;
                                        }
                                        break;
                                    case -550678213:
                                    case 1375765394:
                                        if (C4117.f13076 <= 0) {
                                            iM25613 = (i29 - C0630.m2566("᩸ۢ")) * (-125);
                                            i31 = ((iM25613 ^ i30) * 11569) ^ 816442491;
                                            i32 = -652429;
                                        } else {
                                            iM25613 = C2105.m6981("ۘۜ") ^ i29;
                                            i31 = ((iM25613 ^ i30) * 29947) ^ (-1532042707);
                                            i32 = 972917191;
                                        }
                                        break;
                                    case -125147985:
                                    case 1524725305:
                                        this.f54430 = abstractActivityC33411;
                                        if (C0964.f3626 != 0) {
                                            iM25613 = C2105.m6981("۫ܳ") ^ i29;
                                            i31 = ((iM25613 ^ i30) * 6991) ^ 1377970018;
                                            i32 = 524750100;
                                        } else {
                                            iM25613 = C0630.m2566("᩹᩻") ^ i30;
                                            i31 = ((iM25613 ^ i29) * 16887) ^ 1700863719;
                                            i32 = -1148270268;
                                        }
                                        break;
                                    case 632420839:
                                    case 1887911805:
                                        if (C3746.f11829 <= 0) {
                                            iM25613 = C2105.m6981("֡֫") ^ i29;
                                            i31 = ((iM25613 ^ i30) * 19025) ^ 2054070235;
                                            i32 = 364862560;
                                        } else {
                                            iM25613 = C2105.m6981("᩶۬") ^ i29;
                                            i31 = ((iM25613 ^ i30) * (-22309)) ^ 126872142;
                                            i32 = -1974570808;
                                        }
                                        break;
                                    default:
                                        RunnableC0588.m2441();
                                        throw new RuntimeException();
                                }
                            }
                        }
                    });
                    sArr5 = f73451;
                    i20 = 368;
                    if (C21923.f70183 != 0) {
                        iM6984 = C2105.m6981("ܶ᩹") ^ i14;
                        i10 = ((iM6984 ^ i13) * (-17983)) ^ (-819113055);
                        i11 = -11237075;
                    } else {
                        iM6984 = (i14 - C0630.m2566("֨ۧ")) * 95;
                        i10 = ((iM6984 ^ i13) * (-5459)) ^ (-909577008);
                        i11 = -1833468529;
                    }
                    int i28 = iM6984 ^ i11;
                    charSequence2 = charSequence;
                    i16 = i28;
                    i15 = i10;
                    break;
                case -1022451657:
                case 1696334119:
                    charSequence = charSequence2;
                    TextView textView12 = (TextView) C11340.m28028(view, C2105.m6981(RunnableC1937.m6385(sArr5, i20, 3, i19)) ^ 2119034201);
                    C19890.m45741(textView12);
                    RunnableC1937.m6377(textView12, (CharSequence) C21923.m49339(list6, i21));
                    C4159.m12564(textView12, new ViewOnClickListenerC17097(c11185, abstractActivityC33411, list6));
                    if (C4616.m13552() == 0) {
                        iM6984 = C0630.m2566("ۧܺ") ^ i13;
                        i10 = ((iM6984 ^ i14) * (-24089)) ^ 1666446887;
                        i11 = 77253643;
                        int i29 = iM6984 ^ i11;
                        charSequence2 = charSequence;
                        i16 = i29;
                        i15 = i10;
                    } else {
                        charSequence2 = charSequence;
                        textView3 = textView6;
                        list3 = list6;
                        abstractActivityC3348 = abstractActivityC33411;
                        c19555 = c19557;
                        c11182 = c11185;
                        int iM25613 = C0630.m2566("ܳ᩹") ^ i14;
                        int i210 = ((iM25613 ^ i13) * 1869) ^ (-1618065577);
                        i16 = iM25613 ^ (-853552072);
                        c11185 = c11182;
                        c19557 = c19555;
                        list6 = list3;
                        textView6 = textView3;
                        list5 = list5;
                        String str15 = strM4902;
                        textView7 = textView7;
                        i15 = i210;
                        abstractActivityC33411 = abstractActivityC3348;
                        str6 = str6;
                        strM4902 = str15;
                    }
                    break;
                case -946982984:
                case 2079737709:
                    sArr2 = sArr4;
                    c11183 = c11185;
                    abstractActivityC3349 = abstractActivityC33411;
                    String str16 = strM4902;
                    list5 = list5;
                    textView3 = textView6;
                    list3 = list6;
                    textView4 = textView7;
                    C2126.m7039(textView4, new ViewOnClickListenerC0163());
                    c19554M44967 = C19554.m44967();
                    C2126.m7031(c19554M44967, RunnableC3474.m10633(f73451, 68, 17, i19));
                    String strM449610 = c19554M44967.m44968(ViewOnClickListenerC1958.m6435(f73451, 85, 7, i19), null);
                    if (strM449610 == null) {
                        int iM25614 = (C0630.m2566("᩺֡") ^ i13) * 69;
                        strM4902 = str16;
                        textView7 = textView4;
                        abstractActivityC33411 = abstractActivityC3349;
                        str6 = null;
                        list6 = list3;
                        textView6 = textView3;
                        list5 = list5;
                        c19557 = c19554M44967;
                        sArr4 = sArr2;
                        i16 = iM25614 ^ (-1216959472);
                        i15 = ((iM25614 ^ i14) * 11067) ^ (-1058879347);
                        c11185 = c11183;
                    } else {
                        strM4902 = strM449610;
                        str3 = null;
                        int iM25615 = (C0630.m2566("ۖۡ") + i13) * (-47);
                        textView7 = textView4;
                        abstractActivityC33411 = abstractActivityC3349;
                        str6 = str3;
                        i15 = ((iM25615 ^ i14) * 21447) ^ (-2018724074);
                        c11185 = c11183;
                        c19557 = c19554M44967;
                        sArr4 = sArr2;
                        i16 = iM25615 ^ (-268143383);
                        list6 = list3;
                        textView6 = textView3;
                        list5 = list5;
                    }
                    break;
                case -789517347:
                case 974422165:
                    C3746.m11360(view, i21);
                    ViewOnClickListenerC1958.m6433(view, 0.0f);
                    break;
                case -737053641:
                case 785755517:
                    str2 = str6;
                    i19 = 7039;
                    iM6983 = C0630.m2566("᩺ܽ") ^ i13;
                    i5 = ((iM6983 ^ i14) * (-4985)) ^ (-200898953);
                    i6 = 1203071190;
                    i7 = iM6983 ^ i6;
                    i15 = i5;
                    c11185 = c11185;
                    c19557 = c19557;
                    list6 = list6;
                    textView6 = textView6;
                    list5 = list5;
                    short[] sArr15 = sArr4;
                    i16 = i7;
                    sArr4 = sArr15;
                    String str17 = strM4902;
                    textView7 = textView7;
                    abstractActivityC33411 = abstractActivityC33411;
                    str6 = str2;
                    strM4902 = str17;
                    break;
                case -729384951:
                case -352045522:
                    str2 = str6;
                    i19 = 58939;
                    iM6983 = C0630.m2566("᩺ܽ") ^ i13;
                    i5 = ((iM6983 ^ i14) * (-4985)) ^ (-200898953);
                    i6 = 1203071190;
                    i7 = iM6983 ^ i6;
                    i15 = i5;
                    c11185 = c11185;
                    c19557 = c19557;
                    list6 = list6;
                    textView6 = textView6;
                    list5 = list5;
                    short[] sArr16 = sArr4;
                    i16 = i7;
                    sArr4 = sArr16;
                    String str18 = strM4902;
                    textView7 = textView7;
                    abstractActivityC33411 = abstractActivityC33411;
                    str6 = str2;
                    strM4902 = str18;
                    break;
                case -514836325:
                case 943585033:
                    if (C3537.f11231 < 0) {
                        int iM69811 = C2105.m6981("۠ᩴ") ^ i13;
                        i10 = ((iM69811 ^ i14) * (-13479)) ^ (-373087031);
                        i16 = iM69811 ^ 453480949;
                    } else {
                        charSequence = charSequence2;
                        iM6984 = C0630.m2566("ܺۚ") ^ i13;
                        i10 = ((iM6984 ^ i14) * (-9075)) ^ 1304579800;
                        i11 = 1060099542;
                        int i211 = iM6984 ^ i11;
                        charSequence2 = charSequence;
                        i16 = i211;
                    }
                    i15 = i10;
                    break;
                case -289810546:
                case 876031269:
                    sArr4 = sArr4;
                    list6 = list6;
                    List list11 = list5;
                    textView = (TextView) C11340.m28028(view, i18 ^ 2100963489);
                    C19890.m45741(textView);
                    charSequence2 = (CharSequence) C21923.m49339(list11, i21);
                    if (C1711.f5919) {
                        list5 = list11;
                        c19557 = c19557;
                        c11185 = c11185;
                        String str19 = str6;
                        abstractActivityC33411 = abstractActivityC33411;
                        textView7 = textView7;
                        strM4902 = strM4902;
                        str2 = str19;
                        int iM69812 = C2105.m6981("۫᩺") ^ i14;
                        int i212 = ((iM69812 ^ i13) * (-15245)) ^ 1429230221;
                        list5 = list5;
                        short[] sArr17 = sArr4;
                        i16 = iM69812 ^ (-69669032);
                        sArr4 = sArr17;
                        List list12 = list6;
                        textView6 = textView;
                        i15 = i212;
                        c11185 = c11185;
                        c19557 = c19557;
                        list6 = list12;
                        String str110 = strM4902;
                        textView7 = textView7;
                        abstractActivityC33411 = abstractActivityC33411;
                        str6 = str2;
                        strM4902 = str110;
                    } else {
                        int iM69813 = (C2105.m6981("ᩳ֡") ^ i13) * 99;
                        list5 = list11;
                        i15 = ((iM69813 ^ i14) * (-28625)) ^ 846984847;
                        sArr4 = sArr4;
                        i16 = iM69813 ^ (-417910963);
                        list6 = list6;
                        textView6 = textView;
                    }
                    break;
                case -281364160:
                case 1738209211:
                    sArr3 = sArr4;
                    str4 = str6;
                    listM9236 = list5;
                    textView5 = textView6;
                    list4 = list6;
                    c19556 = c19557;
                    c11184 = c11185;
                    abstractActivityC33410 = abstractActivityC33411;
                    strM10568 = ServiceConnectionC3453.m10568(f73451, 187, 81, i19);
                    str5 = strM4902;
                    int iM25616 = C0630.m2566("ۤ᩶") ^ i14;
                    i8 = ((iM25616 ^ i13) * 3799) ^ 619167295;
                    i9 = iM25616 ^ (-389351517);
                    strM4902 = str5;
                    c11185 = c11184;
                    c19557 = c19556;
                    list6 = list4;
                    textView6 = textView5;
                    list5 = listM9236;
                    short[] sArr18 = sArr3;
                    i16 = i9;
                    sArr4 = sArr18;
                    abstractActivityC3347 = abstractActivityC33410;
                    str6 = str4;
                    i15 = i8;
                    abstractActivityC33411 = abstractActivityC3347;
                    break;
                case -261280434:
                case -182080603:
                    sArr = sArr4;
                    list = list5;
                    textView2 = textView6;
                    char[] cArr3 = new char[i17];
                    cArr3[i21] = c;
                    List listM9239 = C3016.m9236(strM6385, cArr3);
                    int iM25617 = C0630.m2566(C1005.m3502(f73451, 359, 3, i19));
                    if (C22628.f73083 <= 0) {
                        list6 = listM9239;
                        i18 = iM25617;
                        int iM69814 = (C2105.m6981("᩸ܰ") ^ i13) * 75;
                        i15 = ((iM69814 ^ i14) * 3451) ^ (-1222134727);
                        i3 = iM69814 ^ 401536887;
                        textView6 = textView2;
                        list5 = list;
                        short[] sArr19 = sArr;
                        i16 = i3;
                        sArr4 = sArr19;
                    } else {
                        int iM25618 = C0630.m2566("ܿᩳ") ^ i14;
                        textView6 = textView2;
                        list5 = list;
                        i18 = iM25617;
                        sArr4 = sArr;
                        i16 = iM25618 ^ 463205901;
                        i15 = ((iM25618 ^ i13) * 27211) ^ 583466866;
                        list6 = listM9239;
                    }
                    break;
                case -89114651:
                case 313881331:
                    short[] sArr20 = sArr4;
                    strM4902 = strM4902;
                    String str20 = str6;
                    list5 = list5;
                    textView3 = textView6;
                    list3 = list6;
                    abstractActivityC3348 = abstractActivityC33411;
                    c19555 = c19557;
                    c11182 = c11185;
                    TextView textView13 = (TextView) viewM3507;
                    C19890.m45741(textView13);
                    str6 = str20;
                    C1047.m3601(textView13, C0382.m1840(f73451, 52, 16, i19));
                    if (RunnableC3474.f10992 > 0) {
                        int iM25619 = C0630.m2566("ۗ֡") ^ i14;
                        abstractActivityC33411 = abstractActivityC3348;
                        str6 = str6;
                        strM4902 = strM4902;
                        textView7 = textView13;
                        sArr4 = sArr20;
                        i16 = iM25619 ^ (-1898691504);
                        i15 = ((iM25619 ^ i13) * 31593) ^ (-2061360120);
                        c11185 = c11182;
                        c19557 = c19555;
                        list6 = list3;
                        textView6 = textView3;
                        list5 = list5;
                    } else {
                        textView7 = textView13;
                        sArr4 = sArr20;
                        int iM256110 = C0630.m2566("ܳ᩹") ^ i14;
                        int i213 = ((iM256110 ^ i13) * 1869) ^ (-1618065577);
                        i16 = iM256110 ^ (-853552072);
                        c11185 = c11182;
                        c19557 = c19555;
                        list6 = list3;
                        textView6 = textView3;
                        list5 = list5;
                        String str111 = strM4902;
                        textView7 = textView7;
                        i15 = i213;
                        abstractActivityC33411 = abstractActivityC3348;
                        str6 = str6;
                        strM4902 = str111;
                    }
                    break;
                case 163857100:
                case 922544273:
                    charSequence = charSequence2;
                    TextView textView14 = (TextView) C1005.m3507(view, i22);
                    C19890.m45741(textView14);
                    C1047.m3601(textView14, (CharSequence) C21923.m49339(listM9237, i21));
                    C4159.m12564(textView14, new ViewOnClickListenerC16391(c11185, abstractActivityC33411, listM9237));
                    iM2567 = C0630.m2566(C1773.m5917(f73451, 365, 3, i19));
                    if (C0630.f2410 > 0) {
                        iM6984 = C2105.m6981("ܰۢ") ^ i13;
                        i10 = ((iM6984 ^ i14) * 23273) ^ (-2105606557);
                        i11 = 1175643915;
                        int i214 = iM6984 ^ i11;
                        charSequence2 = charSequence;
                        i16 = i214;
                        i15 = i10;
                    } else {
                        charSequence2 = charSequence;
                        textView3 = textView6;
                        list3 = list6;
                        abstractActivityC3348 = abstractActivityC33411;
                        c19555 = c19557;
                        c11182 = c11185;
                        int iM256111 = C0630.m2566("ܳ᩹") ^ i14;
                        int i215 = ((iM256111 ^ i13) * 1869) ^ (-1618065577);
                        i16 = iM256111 ^ (-853552072);
                        c11185 = c11182;
                        c19557 = c19555;
                        list6 = list3;
                        textView6 = textView3;
                        list5 = list5;
                        String str112 = strM4902;
                        textView7 = textView7;
                        i15 = i215;
                        abstractActivityC33411 = abstractActivityC3348;
                        str6 = str6;
                        strM4902 = str112;
                    }
                    break;
                case 175548857:
                case 942910436:
                    ViewOnClickListenerC1958.m6429();
                    if (C2958.f9394 < 0) {
                        textView3 = textView6;
                        list3 = list6;
                        abstractActivityC3348 = abstractActivityC33411;
                        c19555 = c19557;
                        c11182 = c11185;
                        int iM256112 = C0630.m2566("ܳ᩹") ^ i14;
                        int i216 = ((iM256112 ^ i13) * 1869) ^ (-1618065577);
                        i16 = iM256112 ^ (-853552072);
                        c11185 = c11182;
                        c19557 = c19555;
                        list6 = list3;
                        textView6 = textView3;
                        list5 = list5;
                        String str113 = strM4902;
                        textView7 = textView7;
                        i15 = i216;
                        abstractActivityC33411 = abstractActivityC3348;
                        str6 = str6;
                        strM4902 = str113;
                    } else {
                        charSequence = charSequence2;
                        iM6984 = C0630.m2566("ܺۚ") ^ i13;
                        i10 = ((iM6984 ^ i14) * (-9075)) ^ 1304579800;
                        i11 = 1060099542;
                        int i217 = iM6984 ^ i11;
                        charSequence2 = charSequence;
                        i16 = i217;
                        i15 = i10;
                    }
                    break;
                case 238406279:
                case 901781443:
                    RunnableC0588.m2441();
                    int iM69815 = C2105.m6981("۠ᩴ") ^ i13;
                    i10 = ((iM69815 ^ i14) * (-13479)) ^ (-373087031);
                    i16 = iM69815 ^ 453480949;
                    i15 = i10;
                    break;
                case 251315488:
                case 345172637:
                    C22628.m50615();
                    if (!C2272.f7362) {
                        int iM69816 = C2105.m6981("۠ᩴ") ^ i13;
                        i10 = ((iM69816 ^ i14) * (-13479)) ^ (-373087031);
                        i16 = iM69816 ^ 453480949;
                        i15 = i10;
                    } else {
                        sArr = sArr4;
                        list = list5;
                        textView2 = textView6;
                        int iM69817 = (C2105.m6981("᩸ܰ") ^ i13) * 75;
                        i15 = ((iM69817 ^ i14) * 3451) ^ (-1222134727);
                        i3 = iM69817 ^ 401536887;
                        textView6 = textView2;
                        list5 = list;
                        short[] sArr110 = sArr;
                        i16 = i3;
                        sArr4 = sArr110;
                    }
                    break;
                case 257284548:
                case 1685765965:
                    sArr4 = sArr4;
                    list5 = list5;
                    textView6 = textView6;
                    list6 = list6;
                    c19557 = c19557;
                    c11185 = c11185;
                    String str21 = str6;
                    abstractActivityC33411 = abstractActivityC33411;
                    textView7 = textView7;
                    strM4902 = strM4902;
                    str2 = str21;
                    short s = f73451[39];
                    int i30 = s + 1;
                    if (((s * 2) + 1) - (i30 * i30) <= 0) {
                        iM6983 = C2105.m6981("᩶ۗ") ^ i13;
                        i5 = ((iM6983 ^ i14) * 10401) ^ 1951783609;
                        i6 = -914467481;
                    } else {
                        iM6983 = (C2105.m6981("۬֨") ^ i14) * (-91);
                        i5 = ((iM6983 ^ i13) * 3471) ^ (-1212955045);
                        i6 = -231601078;
                    }
                    i7 = iM6983 ^ i6;
                    i15 = i5;
                    c11185 = c11185;
                    c19557 = c19557;
                    list6 = list6;
                    textView6 = textView6;
                    list5 = list5;
                    short[] sArr111 = sArr4;
                    i16 = i7;
                    sArr4 = sArr111;
                    String str114 = strM4902;
                    textView7 = textView7;
                    abstractActivityC33411 = abstractActivityC33411;
                    str6 = str2;
                    strM4902 = str114;
                    break;
                case 563929587:
                case 964568585:
                    C3746.m11369();
                    break;
                case 652429648:
                case 794165859:
                    charSequence = charSequence2;
                    TextView textView15 = (TextView) C1005.m3507(view, C0630.m2566(C22628.m50602(f73451, 371, 3, i19)) ^ 2101330133);
                    C19890.m45741(textView15);
                    C4159.m12564(textView15, new ViewOnClickListenerC14274(i21, abstractActivityC33411));
                    if (C1916.f6442) {
                        iM6984 = C0630.m2566("ܰ᩻") ^ i14;
                        i10 = ((iM6984 ^ i13) * 27993) ^ (-696051880);
                        i11 = 2134746017;
                    } else {
                        iM6984 = C0630.m2566("ܺۚ") ^ i13;
                        i10 = ((iM6984 ^ i14) * (-9075)) ^ 1304579800;
                        i11 = 1060099542;
                    }
                    int i218 = iM6984 ^ i11;
                    charSequence2 = charSequence;
                    i16 = i218;
                    i15 = i10;
                    break;
                case 824740910:
                case 1708068029:
                    sArr4 = sArr4;
                    list5 = list5;
                    textView6 = textView6;
                    list6 = list6;
                    c19557 = c19557;
                    c11185 = c11185;
                    String str22 = str6;
                    abstractActivityC33411 = abstractActivityC33411;
                    textView7 = textView7;
                    strM4902 = strM4902;
                    str2 = str22;
                    RunnableC0588.m2430(animator, AbstractC2021.m6573(f73451, 40, 9, i19));
                    view = this.f73453;
                    i21 = 0;
                    if (view.getTag() == null) {
                        iM6983 = (i14 - C2105.m6981("֫ܿ")) * (-65);
                        i5 = ((iM6983 ^ i13) * 8789) ^ 1177644957;
                        i6 = -2052249856;
                    } else {
                        iM6983 = (C0630.m2566("ۡۗ") ^ i14) * (-31);
                        i5 = ((iM6983 ^ i13) * (-30419)) ^ (-1556003875);
                        i6 = 1794488052;
                    }
                    i7 = iM6983 ^ i6;
                    i15 = i5;
                    c11185 = c11185;
                    c19557 = c19557;
                    list6 = list6;
                    textView6 = textView6;
                    list5 = list5;
                    short[] sArr112 = sArr4;
                    i16 = i7;
                    sArr4 = sArr112;
                    String str115 = strM4902;
                    textView7 = textView7;
                    abstractActivityC33411 = abstractActivityC33411;
                    str6 = str2;
                    strM4902 = str115;
                    break;
                case 1306633014:
                case 2019345351:
                    strM6385 = RunnableC1937.m6385(f73451, 380, 40, i19);
                    str = str6;
                    list = list5;
                    charSequence2 = charSequence2;
                    textView2 = textView6;
                    sArr = sArr4;
                    list2 = list6;
                    c19554 = c19557;
                    iM6981 = C0630.m2566("۬᩻") ^ i14;
                    i = ((iM6981 ^ i13) * (-2655)) ^ (-2017452261);
                    i2 = 89065174;
                    i3 = iM6981 ^ i2;
                    str6 = str;
                    i15 = i;
                    c11185 = c11185;
                    c19557 = c19554;
                    list6 = list2;
                    textView6 = textView2;
                    list5 = list;
                    short[] sArr113 = sArr;
                    i16 = i3;
                    sArr4 = sArr113;
                    break;
                default:
                    sArr = sArr4;
                    str = str6;
                    list = list5;
                    textView2 = textView6;
                    list2 = list6;
                    abstractActivityC3346 = abstractActivityC33411;
                    c19554 = c19557;
                    c11185 = c11185;
                    char[] cArr4 = new char[i17];
                    cArr4[i21] = c;
                    listM9237 = C3016.m9236(strM10568, cArr4);
                    String strM449611 = c19554.m44968(C3019.m9250(f73451, 180, 7, i19), str);
                    if (strM449611 == null) {
                        iM6982 = C2105.m6981("ۚᩴ") ^ i13;
                        i = ((iM6982 ^ i14) * 20417) ^ (-368772628);
                        i4 = -321488315;
                    } else {
                        strM5726 = strM449611;
                        iM6982 = C2105.m6981("ܽۤ") ^ i14;
                        i = ((iM6982 ^ i13) * (-24103)) ^ 2078283517;
                        i4 = -1621810447;
                    }
                    i3 = iM6982 ^ i4;
                    abstractActivityC33411 = abstractActivityC3346;
                    str6 = str;
                    i15 = i;
                    c11185 = c11185;
                    c19557 = c19554;
                    list6 = list2;
                    textView6 = textView2;
                    list5 = list;
                    short[] sArr114 = sArr;
                    i16 = i3;
                    sArr4 = sArr114;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0174 A[PHI: r2
      0x0174: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:52:0x0172, B:36:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01a4 A[PHI: r5
      0x01a4: PHI (r5v3 short[]) = (r5v1 short[]), (r5v2 short[]), (r5v1 short[]) binds: [B:56:0x01a2, B:44:0x0125, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    public C22742(View view, C11182 c11182, AbstractActivityC3346 abstractActivityC3346) {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        int i5 = 0;
        String strM11919 = null;
        int iM6983 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 752868052;
        int i9 = C22628.f73083;
        int i10 = AbstractC2021.f6743;
        short s = f73451[0];
        int i11 = s * 19944;
        int i12 = s + 4986;
        int i13 = i11 - (i12 * i12) <= 0 ? 61390 : 55834;
        int iM2566 = C0630.m2566("᩺۫") ^ i9;
        int i14 = ((iM2566 ^ i10) * 25437) ^ 1258094125;
        int i15 = iM2566 ^ 919717281;
        while (true) {
            i8 = ((((i8 ^ i10) * (-2909)) >> 31) & i14) ^ i15;
            switch (i8) {
                case -1699916463:
                case -605632145:
                    ServiceConnectionC3453.m10564();
                    C2958.m9034();
                    iM6981 = (C2105.m6981("᩻ۨ") ^ i9) * 57;
                    i = ((iM6981 ^ i10) * (-10947)) ^ (-1105405292);
                    i2 = 1026893253;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -1441790708:
                case -562036475:
                    if (C0237.f1507 == 0) {
                        iM6981 = (C2105.m6981("ۗۧ") + i9) * (-71);
                        i = ((iM6981 ^ i10) * (-8007)) ^ (-484604206);
                        i2 = -803472390;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                    } else {
                        iM6982 = C2105.m6981("ܺ۠") ^ i10;
                        i3 = ((iM6982 ^ i9) * 26165) ^ 1323900878;
                        i4 = -1282792683;
                        i15 = iM6982 ^ i4;
                        i14 = i3;
                    }
                    break;
                case -1132147149:
                case 53606643:
                    this.f73454 = c11182;
                    this.f73452 = abstractActivityC3346;
                    if (C3683.f11629 >= 0) {
                        iM6982 = C2105.m6981("ܺ۠") ^ i10;
                        i3 = ((iM6982 ^ i9) * 26165) ^ 1323900878;
                        i4 = -1282792683;
                    } else {
                        iM6982 = C2105.m6981("ۤۖ") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-20717)) ^ 1578539615;
                        i4 = -54896899;
                    }
                    i15 = iM6982 ^ i4;
                    i14 = i3;
                    break;
                case -1009206533:
                case 1423662694:
                    C7106.m19120();
                    throw new RuntimeException();
                case -998852958:
                case -163043272:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("ۤ۟") ^ i10;
                        i = ((iM6981 ^ i9) * (-8657)) ^ 1013093835;
                        i2 = -871954775;
                    } else {
                        iM6981 = C0630.m2566("᩸ۙ") ^ i10;
                        i = ((iM6981 ^ i9) * (-21203)) ^ (-386481995);
                        i2 = 2016384510;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -573069951:
                case 230989675:
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = (i9 - C2105.m6981("ܺܿ")) * (-39);
                        i = ((iM6981 ^ i10) * 31739) ^ 1188629612;
                        i2 = -1868061038;
                    } else {
                        iM6981 = C2105.m6981("֡ܳ") ^ i9;
                        i = ((iM6981 ^ i10) * 443) ^ 881029053;
                        i2 = -809065983;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -452188158:
                case -363159955:
                    iM6983 = C2105.m6981(strM11919);
                    i6 = 2104083186;
                    if (C4075.m12263() <= 0) {
                        iM6981 = (C2105.m6981("᩻ۨ") ^ i9) * 57;
                        i = ((iM6981 ^ i10) * (-10947)) ^ (-1105405292);
                        i2 = 1026893253;
                    } else {
                        iM6981 = C2105.m6981("ۢ᩵") ^ i10;
                        i = ((iM6981 ^ i9) * (-14993)) ^ 1384169459;
                        i2 = 1770877591;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -450868624:
                case 2070556416:
                    C3432.m10477();
                    if (C2105.f7037 != 0) {
                        iM6981 = C0630.m2566("ۤ۟") ^ i10;
                        i = ((iM6981 ^ i9) * (-8657)) ^ 1013093835;
                        i2 = -871954775;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                    }
                    iM6981 = (C2105.m6981("᩻ۨ") ^ i9) * 57;
                    i = ((iM6981 ^ i10) * (-10947)) ^ (-1105405292);
                    i2 = 1026893253;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -427488362:
                case 583026338:
                    C1420.m4913();
                    if (C7811.m20844() == 0) {
                        iM6981 = (i9 - C2105.m6981("ܺܿ")) * (-39);
                        i = ((iM6981 ^ i10) * 31739) ^ 1188629612;
                        i2 = -1868061038;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                    }
                    iM6981 = (C2105.m6981("᩻ۨ") ^ i9) * 57;
                    i = ((iM6981 ^ i10) * (-10947)) ^ (-1105405292);
                    i2 = 1026893253;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -98953596:
                case 780542236:
                    sArr = f73451;
                    if (C0714.f2697 >= 0) {
                        iM6981 = (i9 - C2105.m6981("ܺܿ")) * (-39);
                        i = ((iM6981 ^ i10) * 31739) ^ 1188629612;
                        i2 = -1868061038;
                    } else {
                        iM6981 = (i9 - C2105.m6981("ۤܽ")) * 127;
                        i = ((iM6981 ^ i10) * 7779) ^ (-918983654);
                        i2 = -1313774779;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -98234032:
                case 18497931:
                    if (C2126.f7087) {
                        iM6981 = (C2105.m6981("᩶ܿ") + i10) * 59;
                        i = ((iM6981 ^ i9) * 20071) ^ (-1345117819);
                        i2 = 478724178;
                    } else {
                        iM6981 = C0630.m2566("ۙܺ") ^ i10;
                        i = ((iM6981 ^ i9) * (-28393)) ^ 311983533;
                        i2 = -1595769798;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -62769114:
                case 1452617233:
                    strM11919 = C3911.m11919(sArr, i7, 3, i13);
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C2105.m6981("᩶ܿ") + i10) * 59;
                        i = ((iM6981 ^ i9) * 20071) ^ (-1345117819);
                        i2 = 478724178;
                    } else {
                        iM6981 = (C2105.m6981("۟ۖ") + i9) * (-97);
                        i = ((iM6981 ^ i10) * (-9571)) ^ (-225195138);
                        i2 = 1907048324;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case 176404915:
                case 2018908054:
                    i7 = 1;
                    if (!C2272.f7362) {
                        iM6981 = (C2105.m6981("ۘܿ") + i10) * (-95);
                        i = ((iM6981 ^ i9) * (-6035)) ^ 2135865506;
                        i2 = 706833164;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                    } else {
                        iM6982 = C2105.m6981("ܺ۠") ^ i10;
                        i3 = ((iM6982 ^ i9) * 26165) ^ 1323900878;
                        i4 = -1282792683;
                        i15 = iM6982 ^ i4;
                        i14 = i3;
                    }
                    break;
                case 375936675:
                case 2066413041:
                    this.f73453 = C1005.m3507(view, i5);
                    return;
                case 966336719:
                case 1512736892:
                    if (C7811.f24123 < 0) {
                        iM6982 = C2105.m6981("ܺ۠") ^ i10;
                        i3 = ((iM6982 ^ i9) * 26165) ^ 1323900878;
                        i4 = -1282792683;
                        i15 = iM6982 ^ i4;
                        i14 = i3;
                    } else {
                        iM6981 = (C2105.m6981("᩻ۨ") ^ i9) * 57;
                        i = ((iM6981 ^ i10) * (-10947)) ^ (-1105405292);
                        i2 = 1026893253;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                    }
                    break;
                default:
                    i5 = iM6983 ^ i6;
                    if (C3432.f10845 < 0) {
                        iM6981 = C2105.m6981("᩺᩶") ^ i9;
                        i = ((iM6981 ^ i10) * 23351) ^ (-2066615658);
                        i2 = 1321909294;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                    } else {
                        iM6982 = C2105.m6981("ܺ۠") ^ i10;
                        i3 = ((iM6982 ^ i9) * 26165) ^ 1323900878;
                        i4 = -1282792683;
                        i15 = iM6982 ^ i4;
                        i14 = i3;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0269 A[PHI: r4 r5 r6 r7 r16
      0x0269: PHI (r4v4 short) = (r4v2 short), (r4v3 short), (r4v2 short) binds: [B:65:0x0267, B:51:0x01b7, B:47:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:65:0x0267, B:51:0x01b7, B:47:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:65:0x0267, B:51:0x01b7, B:47:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:65:0x0267, B:51:0x01b7, B:47:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r16v8 java.lang.String) = (r16v4 java.lang.String), (r16v7 java.lang.String), (r16v9 java.lang.String) binds: [B:65:0x0267, B:51:0x01b7, B:47:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (l.C7106.m19120() <= 0) goto L10;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationCancel(Animator animator) {
        String strM2816;
        int iM6981;
        int i;
        int i2;
        int i3 = C2958.f9394;
        int i4 = C4263.f13799;
        int iM6982 = (C2105.m6981("᩶ᩳ") + i3) * 99;
        int i5 = ((iM6982 ^ i4) * 20325) ^ (-1775762102);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6982 ^ 1442840928;
        String str = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 900464180;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-31381)) >> 31));
            switch (i13) {
                case -2142869492:
                case 606608979:
                    C3683.m11210(animator, str);
                    this.f73454.f33568 = true;
                    break;
                case -2125058674:
                case 2102198583:
                    sArr2 = f73451;
                    if (C1773.m5908() <= 0) {
                        strM2816 = str;
                        i11 = 5;
                        iM6981 = (C2105.m6981("ۜ۬") + i3) * (-119);
                        i = ((iM6981 ^ i4) * 19941) ^ 463817158;
                        i2 = 914413743;
                        String str2 = strM2816;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                        str = str2;
                    } else {
                        int iM2566 = C0630.m2566("ۨ᩻") ^ i4;
                        i6 = iM2566 ^ (-1567296155);
                        i5 = ((iM2566 ^ i3) * (-4603)) ^ (-1807331158);
                        i11 = 5;
                    }
                    break;
                case -1841286391:
                case -1415111979:
                    i10 = 24980;
                    iM6981 = C2105.m6981("᩹᩵") ^ i3;
                    strM2816 = str;
                    i = ((iM6981 ^ i4) * (-31197)) ^ 1951412464;
                    i2 = -2006149956;
                    String str3 = strM2816;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    str = str3;
                    break;
                case -1818829627:
                case -576230436:
                    strM2816 = str;
                    if ((i8 + i9) - i7 >= 0) {
                        iM6981 = C0630.m2566("ۢܰ") ^ i3;
                        i = ((iM6981 ^ i4) * 25071) ^ 1296610915;
                        i2 = 1585781964;
                    } else {
                        iM6981 = (C2105.m6981("᩹۬") ^ i4) * (-125);
                        i = ((iM6981 ^ i3) * 7635) ^ 342622696;
                        i2 = -1806622882;
                    }
                    String str4 = strM2816;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    str = str4;
                    break;
                case -1787790150:
                case 1523644375:
                    C2126.m7040();
                    C0237.m1481();
                    break;
                case -1765266210:
                case -374174808:
                    if (C22628.f73083 <= 0) {
                        strM2816 = str;
                        i12 = 9;
                        iM6981 = C0630.m2566("۬ܺ") ^ i3;
                        i = ((iM6981 ^ i4) * 20803) ^ 1595368446;
                        i2 = 1616018403;
                        String str5 = strM2816;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                        str = str5;
                    } else {
                        int iM2567 = (C0630.m2566("ۜۖ") + i3) * 9;
                        i6 = iM2567 ^ 825504334;
                        i5 = ((iM2567 ^ i4) * (-29163)) ^ (-273200134);
                        i12 = 9;
                    }
                    break;
                case -1681786340:
                case 583145586:
                    strM2816 = str;
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = (i3 - C0630.m2566("۠ۤ")) * (-95);
                        i = ((iM6981 ^ i4) * (-23067)) ^ (-1131862606);
                        i2 = 776793845;
                    } else {
                        iM6981 = (C2105.m6981("֫۫") ^ i3) * (-77);
                        i = ((iM6981 ^ i4) * (-5887)) ^ (-1901427126);
                        i2 = -610091924;
                    }
                    String str6 = strM2816;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    str = str6;
                    break;
                case -1626878183:
                case 410498574:
                    strM2816 = str;
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C2105.m6981("ۜ۬") + i3) * (-119);
                        i = ((iM6981 ^ i4) * 19941) ^ 463817158;
                        i2 = 914413743;
                    } else {
                        iM6981 = C0630.m2566("֡ۛ") ^ i4;
                        i = ((iM6981 ^ i3) * 22303) ^ 466453246;
                        i2 = 1643126382;
                    }
                    String str7 = strM2816;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    str = str7;
                    break;
                case -1507284824:
                case -1351265065:
                    strM2816 = C0714.m2816(sArr2, i11, i12, i10);
                    if (RunnableC3474.f10992 <= 0) {
                        str = strM2816;
                        iM6981 = C2105.m6981("ۜۙ") ^ i4;
                        strM2816 = str;
                        i = ((iM6981 ^ i3) * 29073) ^ (-1058125143);
                        i2 = 259997267;
                        String str8 = strM2816;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                        str = str8;
                    } else {
                        int iM2568 = C0630.m2566("ܶܿ") ^ i4;
                        i5 = ((iM2568 ^ i3) * (-32195)) ^ (-1474986175);
                        str = strM2816;
                        i6 = iM2568 ^ 276091314;
                    }
                    break;
                case -1463846587:
                case 855045278:
                    strM2816 = str;
                    s = sArr[c];
                    s2 = 33576;
                    if (C0237.m1481() >= 0) {
                        iM6981 = (i3 - C0630.m2566("۠ۤ")) * (-95);
                        i = ((iM6981 ^ i4) * (-23067)) ^ (-1131862606);
                        i2 = 776793845;
                    } else {
                        iM6981 = (C0630.m2566("۠ۘ") ^ i3) * 81;
                        i = ((iM6981 ^ i4) * (-5493)) ^ (-429683735);
                        i2 = 1079093834;
                    }
                    String str9 = strM2816;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    str = str9;
                    break;
                case -1279315635:
                case 992201734:
                    if (C5695.m16023() < 0) {
                        strM2816 = str;
                        iM6981 = C2105.m6981("ۗۡ") ^ i4;
                        i = ((iM6981 ^ i3) * 23457) ^ (-1483183679);
                        i2 = 681347313;
                        String str10 = strM2816;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                        str = str10;
                    }
                    strM2816 = str;
                    iM6981 = (C2105.m6981("ۜ۬") + i3) * (-119);
                    i = ((iM6981 ^ i4) * 19941) ^ 463817158;
                    i2 = 914413743;
                    String str11 = strM2816;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    str = str11;
                    break;
                case -1039168699:
                case 988187504:
                    C2167.m7155();
                    strM2816 = str;
                    iM6981 = C0630.m2566("۬ܺ") ^ i3;
                    i = ((iM6981 ^ i4) * 20803) ^ 1595368446;
                    i2 = 1616018403;
                    String str12 = strM2816;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    str = str12;
                    break;
                case -812392875:
                case 1795798881:
                    strM2816 = str;
                    i7 = s * s2;
                    i8 = s * s;
                    if (C1773.m5908() <= 0) {
                        iM6981 = (i3 - C0630.m2566("۠ۤ")) * (-95);
                        i = ((iM6981 ^ i4) * (-23067)) ^ (-1131862606);
                        i2 = 776793845;
                    } else {
                        iM6981 = C2105.m6981("ܽܰ") ^ i4;
                        i = ((iM6981 ^ i3) * 22561) ^ 875313365;
                        i2 = 1902534218;
                    }
                    String str13 = strM2816;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    str = str13;
                    break;
                case -104675857:
                case 189376853:
                    i10 = 62933;
                    iM6981 = C2105.m6981("᩹᩵") ^ i3;
                    strM2816 = str;
                    i = ((iM6981 ^ i4) * (-31197)) ^ 1951412464;
                    i2 = -2006149956;
                    String str14 = strM2816;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    str = str14;
                    break;
                case 112251475:
                case 640575878:
                    if (C0237.m1481() < 0) {
                        strM2816 = str;
                        iM6981 = C0630.m2566("۬ܺ") ^ i3;
                        i = ((iM6981 ^ i4) * 20803) ^ 1595368446;
                        i2 = 1616018403;
                    } else {
                        iM6981 = C2105.m6981("ۜۙ") ^ i4;
                        strM2816 = str;
                        i = ((iM6981 ^ i3) * 29073) ^ (-1058125143);
                        i2 = 259997267;
                    }
                    String str15 = strM2816;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    str = str15;
                    break;
                case 369322073:
                case 1437368860:
                    strM2816 = str;
                    sArr = f73451;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C0630.m2566("۬ܺ") ^ i3;
                        i = ((iM6981 ^ i4) * 20803) ^ 1595368446;
                        i2 = 1616018403;
                    } else {
                        iM6981 = (C2105.m6981("ۙܺ") + i4) * (-69);
                        i = ((iM6981 ^ i3) * 17845) ^ 1657015644;
                        i2 = -1448133340;
                    }
                    String str16 = strM2816;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    str = str16;
                    break;
                case 482376499:
                case 844179335:
                    break;
                case 960041352:
                case 1161466097:
                    strM2816 = str;
                    i9 = 281836944;
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("ۗۡ") ^ i4;
                        i = ((iM6981 ^ i3) * 23457) ^ (-1483183679);
                        i2 = 681347313;
                    } else {
                        iM6981 = C0630.m2566("ۨۨ") ^ i4;
                        i = ((iM6981 ^ i3) * 7429) ^ 1559444386;
                        i2 = -1479923475;
                    }
                    String str17 = strM2816;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    str = str17;
                    break;
                default:
                    strM2816 = str;
                    c = 4;
                    if (C7811.m20844() != 0) {
                        str = strM2816;
                        iM6981 = C2105.m6981("ۜۙ") ^ i4;
                        strM2816 = str;
                        i = ((iM6981 ^ i3) * 29073) ^ (-1058125143);
                        i2 = 259997267;
                    } else {
                        iM6981 = C2105.m6981("ᩳ᩹") ^ i3;
                        i = ((iM6981 ^ i4) * 12117) ^ (-825004586);
                        i2 = -942186385;
                    }
                    String str18 = strM2816;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    str = str18;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[PHI: r5 r6 r8
      0x00c2: PHI (r5v4 short[]) = (r5v3 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:28:0x00c0, B:13:0x0073, B:76:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:28:0x00c0, B:13:0x0073, B:76:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:28:0x00c0, B:13:0x0073, B:76:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x010d A[PHI: r2
      0x010d: PHI (r2v4 float[]) = (r2v3 float[]), (r2v2 float[]), (r2v2 float[]) binds: [B:33:0x010b, B:13:0x0073, B:77:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0254 A[PHI: r7 r13 r14 r15 r17 r18 r23
      0x0254: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:61:0x0252, B:57:0x0232, B:42:0x016f, B:17:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:61:0x0252, B:57:0x0232, B:42:0x016f, B:17:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:61:0x0252, B:57:0x0232, B:42:0x016f, B:17:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:61:0x0252, B:57:0x0232, B:42:0x016f, B:17:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:61:0x0252, B:57:0x0232, B:42:0x016f, B:17:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:61:0x0252, B:57:0x0232, B:42:0x016f, B:17:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r23v5 int) = (r23v3 int), (r23v4 int), (r23v3 int), (r23v3 int) binds: [B:61:0x0252, B:57:0x0232, B:42:0x016f, B:17:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x028a A[PHI: r3 r4 r16
      0x028a: PHI (r3v5 android.view.View) = (r3v2 android.view.View), (r3v2 android.view.View), (r3v6 android.view.View) binds: [B:65:0x0288, B:38:0x0146, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r4v6 android.animation.ObjectAnimator) = 
      (r4v2 android.animation.ObjectAnimator)
      (r4v2 android.animation.ObjectAnimator)
      (r4v7 android.animation.ObjectAnimator)
     binds: [B:65:0x0288, B:38:0x0146, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r16v6 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:65:0x0288, B:38:0x0146, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int iM6981;
        int i;
        int iM2566;
        int i2;
        int i3;
        C22742 c22742 = this;
        int i4 = C4263.f13799;
        int i5 = RunnableC0588.f2309;
        int iM2567 = (i5 - C0630.m2566("ۘ֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i6 = ((iM2567 ^ i4) * (-19341)) ^ (-241389686);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM2567 ^ (-1425019923);
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 0;
        int i15 = -982778423;
        int i16 = 0;
        ObjectAnimator objectAnimatorM16025 = null;
        View view = null;
        float[] fArr = null;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i4) * 4223) >> 31));
            switch (i15) {
                case -2096270100:
                case 1771040061:
                    sArr2 = f73451;
                    i12 = 15;
                    i13 = 9;
                    if (C0382.m1848()) {
                        iM6981 = (C0630.m2566("ۚ֨") + i5) * (-107);
                        i6 = ((iM6981 ^ i4) * (-929)) ^ (-277300914);
                        i = -923556639;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ܰۘ")) * 15;
                        i6 = ((iM6981 ^ i5) * 31041) ^ (-538107460);
                        i = -1325456091;
                    }
                    i7 = iM6981 ^ i;
                    c22742 = this;
                    break;
                case -2054112847:
                case 1017473935:
                    C2105.m6982();
                    if (!C1916.f6442) {
                        iM2566 = C2105.m6981("ۡ᩹") ^ i4;
                        i2 = ((iM2566 ^ i5) * (-23671)) ^ 1145852536;
                        i3 = -1785464728;
                        i7 = iM2566 ^ i3;
                        i6 = i2;
                    } else {
                        iM6981 = (C0630.m2566("ۚ֨") + i5) * (-107);
                        i6 = ((iM6981 ^ i4) * (-929)) ^ (-277300914);
                        i = -923556639;
                        i7 = iM6981 ^ i;
                        c22742 = this;
                    }
                    break;
                case -1826563848:
                case -145421276:
                    c = 14;
                    if (C4263.m12819() >= 0) {
                        iM6981 = (C0630.m2566("ۚ֨") + i5) * (-107);
                        i6 = ((iM6981 ^ i4) * (-929)) ^ (-277300914);
                        i = -923556639;
                    } else {
                        iM6981 = (C2105.m6981("ۛۛ") + i5) * (-73);
                        i6 = ((iM6981 ^ i4) * 3095) ^ (-564539089);
                        i = 2058076242;
                    }
                    i7 = iM6981 ^ i;
                    c22742 = this;
                    break;
                case -1771795486:
                case 1412680563:
                    C22628.m50603(objectAnimatorM16025);
                    C11182 c11182 = c22742.f73454;
                    c11182.f33566 = objectAnimatorM16025;
                    c11182.f33568 = true;
                    break;
                case -1727884041:
                case -114751143:
                    C7106.m19120();
                    if (!RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("᩹֡") ^ i5;
                        i2 = ((iM2566 ^ i4) * 29767) ^ 1564388183;
                        i3 = 476609622;
                        i7 = iM2566 ^ i3;
                        i6 = i2;
                    } else {
                        iM6981 = C0630.m2566("᩻֨") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-24547)) ^ 1132042313;
                        i = 804538544;
                        i7 = iM6981 ^ i;
                        c22742 = this;
                    }
                    break;
                case -1582837339:
                case -1075446282:
                    C3683.m11210(animator, RunnableC1937.m6385(sArr2, i12, i13, i11));
                    if (C1294.f4556 >= 0) {
                        iM6981 = (i4 - C2105.m6981("۟ۙ")) * (-117);
                        i6 = ((iM6981 ^ i5) * 30353) ^ (-2116251285);
                        i = -1958264915;
                        i7 = iM6981 ^ i;
                    } else {
                        int iM2568 = C0630.m2566("ۨۤ") ^ i5;
                        i7 = iM2568 ^ (-408560884);
                        i6 = ((iM2568 ^ i4) * 5513) ^ (-30557664);
                    }
                    c22742 = this;
                    break;
                case -1580253448:
                case -885861577:
                    C2126.m7040();
                    iM6981 = (C0630.m2566("ۚ֨") + i5) * (-107);
                    i6 = ((iM6981 ^ i4) * (-929)) ^ (-277300914);
                    i = -923556639;
                    i7 = iM6981 ^ i;
                    c22742 = this;
                    break;
                case -1467401223:
                case 1250136329:
                    i11 = 19649;
                    iM6981 = C0630.m2566("ۚۤ") ^ i5;
                    i6 = ((iM6981 ^ i4) * (-11557)) ^ 1676632462;
                    i = -260781608;
                    i7 = iM6981 ^ i;
                    c22742 = this;
                    break;
                case -1240691310:
                case 643819769:
                    if (C4117.m12364() != 0) {
                        iM2566 = C2105.m6981("ۡ᩹") ^ i4;
                        i2 = ((iM2566 ^ i5) * (-23671)) ^ 1145852536;
                        i3 = -1785464728;
                    } else {
                        iM2566 = C0630.m2566("᩹֡") ^ i5;
                        i2 = ((iM2566 ^ i4) * 29767) ^ 1564388183;
                        i3 = 476609622;
                    }
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    break;
                case -1126907770:
                case 410448807:
                    sArr3 = f73451;
                    i8 = 24;
                    i9 = 5;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C0630.m2566("᩹֡") ^ i5;
                        i2 = ((iM2566 ^ i4) * 29767) ^ 1564388183;
                        i3 = 476609622;
                    } else {
                        iM2566 = (C0630.m2566("ۧܶ") ^ i5) * (-97);
                        i2 = ((iM2566 ^ i4) * 13207) ^ 1466635889;
                        i3 = -738864621;
                    }
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    break;
                case -976236341:
                case 1279896313:
                    int i17 = i14 + i16;
                    i10 = i17 + i17;
                    s2 = 2951;
                    if (C4117.m12364() != 0) {
                        iM6981 = C0630.m2566("᩻֨") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-24547)) ^ 1132042313;
                        i = 804538544;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ᩳ᩹")) * 49;
                        i6 = ((iM6981 ^ i4) * (-1957)) ^ 86854630;
                        i = 1681745309;
                    }
                    i7 = iM6981 ^ i;
                    c22742 = this;
                    break;
                case -188237325:
                case 977553211:
                    sArr = f73451;
                    if (C2958.f9394 >= 0) {
                        iM6981 = (i4 - C2105.m6981("۟ۙ")) * (-117);
                        i6 = ((iM6981 ^ i5) * 30353) ^ (-2116251285);
                        i = -1958264915;
                    } else {
                        iM6981 = C2105.m6981("ۢ᩶") ^ i4;
                        i6 = ((iM6981 ^ i5) * 22021) ^ (-168569789);
                        i = -1022768424;
                    }
                    i7 = iM6981 ^ i;
                    c22742 = this;
                    break;
                case -52994310:
                case 1948401555:
                    objectAnimatorM16025 = C5695.m16025(view, C7106.m19110(sArr3, i8, i9, i11), fArr);
                    if (C2105.f7037 == 0) {
                        iM2566 = C0630.m2566("ܶܺ") ^ i4;
                        i2 = ((iM2566 ^ i5) * 15661) ^ (-1632357802);
                        i3 = -1573370866;
                        i7 = iM2566 ^ i3;
                        i6 = i2;
                    } else {
                        iM6981 = (i4 - C2105.m6981("۟ۙ")) * (-117);
                        i6 = ((iM6981 ^ i5) * 30353) ^ (-2116251285);
                        i = -1958264915;
                        i7 = iM6981 ^ i;
                        c22742 = this;
                    }
                    break;
                case 92717001:
                case 480545636:
                    int i18 = s + s2;
                    if ((i18 * i18) - i10 <= 0) {
                        iM6981 = (i5 - C2105.m6981("᩵֡")) * (-79);
                        i6 = ((iM6981 ^ i4) * 27087) ^ (-1168723741);
                        i = 1479217321;
                    } else {
                        iM6981 = (C0630.m2566("ۘۛ") + i4) * (-125);
                        i6 = ((iM6981 ^ i5) * 15867) ^ (-320581014);
                        i = 605513224;
                    }
                    i7 = iM6981 ^ i;
                    c22742 = this;
                    break;
                case 573829292:
                case 2120153183:
                    fArr = new float[]{0.0f, 1.0f};
                    if (C4117.f13076 <= 0) {
                        iM2566 = C2105.m6981("ۡ᩹") ^ i4;
                        i2 = ((iM2566 ^ i5) * (-23671)) ^ 1145852536;
                        i3 = -1785464728;
                    } else {
                        iM2566 = C0630.m2566("۬ۗ") ^ i4;
                        i2 = ((iM2566 ^ i5) * 26427) ^ 1296870470;
                        i3 = 1801672424;
                    }
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    break;
                case 605159002:
                case 760423340:
                    i11 = 50290;
                    iM6981 = C0630.m2566("ۚۤ") ^ i5;
                    i6 = ((iM6981 ^ i4) * (-11557)) ^ 1676632462;
                    i = -260781608;
                    i7 = iM6981 ^ i;
                    c22742 = this;
                    break;
                case 1589434265:
                case 1805867744:
                    C7106.m19120();
                    break;
                case 1616366019:
                case 1817069803:
                    s = sArr[c];
                    i14 = s * s;
                    i16 = 8708401;
                    if (C3911.m11924() <= 0) {
                        iM6981 = (C0630.m2566("ۚ֨") + i5) * (-107);
                        i6 = ((iM6981 ^ i4) * (-929)) ^ (-277300914);
                        i = -923556639;
                    } else {
                        iM6981 = C0630.m2566("ۨۛ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 26321) ^ (-636503418);
                        i = 2014666530;
                    }
                    i7 = iM6981 ^ i;
                    c22742 = this;
                    break;
                default:
                    view = c22742.f73453;
                    if (!RunnableC1108.f4040) {
                        iM6981 = (i4 - C2105.m6981("۟ۙ")) * (-117);
                        i6 = ((iM6981 ^ i5) * 30353) ^ (-2116251285);
                        i = -1958264915;
                        i7 = iM6981 ^ i;
                        c22742 = this;
                    } else {
                        iM2566 = C0630.m2566("ܽ᩺") ^ i4;
                        i2 = ((iM2566 ^ i5) * 9727) ^ (-2041832313);
                        i3 = 740958290;
                        i7 = iM2566 ^ i3;
                        i6 = i2;
                    }
                    break;
            }
            return;
        }
    }
}
